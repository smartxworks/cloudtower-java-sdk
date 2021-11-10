package com.smartx.tower.integration;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.api.*;
import com.smartx.tower.model.*;

import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;

public class ITBase {
  protected static final Logger LOGGER = Logger.getLogger(ITBase.class);
  protected static final Long TIMEOUT = (long) (1000 * 60 * 5);
  protected static String contentLanguage = "zh-CN";

  public class ITConfig {
    public String endpoint = null;
    public String username = null;
    public String password = null;
    public String usersource = null;
    public String contentLanguage = null;
  }

  protected ApiClient client = null;
  protected static ITClientFactory factory = new ITClientFactory();
  protected static HashMap<String, Object> fixtureData = null;

  Gson gson = new Gson();

  @BeforeClass(alwaysRun = true)
  public void getClient() throws Exception {
    InputStream configStream = getClass().getResourceAsStream("/config.json");
    if (configStream == null) {
      throw new Error("missing config file");
    }
    // fixture is for default parameter to load a resource
    InputStream fixtureStream = getClass().getResourceAsStream("/fixture.json");
    if (fixtureStream == null) {
      LOGGER.warn("fixture file not found, this may cause most test failed");
    } else {
      fixtureData = gson.fromJson(ITUtils.readInputStream(fixtureStream), new TypeToken<HashMap<String, Object>>() {
      }.getType());
    }
    ITConfig configMap = gson.fromJson(ITUtils.readInputStream(configStream), ITConfig.class);
    if (configMap.contentLanguage != null) {
      contentLanguage = configMap.contentLanguage;
    }
    client = factory.getClient(configMap);
  }

  protected <T> T getFixtureData(String key, Type typeOfT) {
    String raw = fixtureData.get(key).toString();
    if (raw == null) {
      assert false;
    }
    return gson.fromJson(raw, typeOfT);
  }

  protected <T> T getFixtureData(String key, java.lang.Class<T> classOfT) {
    String raw = fixtureData.get(key).toString();
    if (raw == null) {
      assert false;
    }
    return gson.fromJson(raw, classOfT);
  }

  protected <R> R getData(String dataType, java.lang.Class<R> classOfR) throws ApiException {
    Object result = null;
    switch (dataType) {
    case "defaultCluster":
      result = new ClusterApi(client)
          .getClusters(getFixtureData(dataType, GetClustersRequestBody.class), contentLanguage).get(0);
      break;
    case "firstAlertNotEnded":
      result = new AlertApi(client).getAlerts(getFixtureData(dataType, GetAlertsRequestBody.class), contentLanguage)
          .get(0);
      break;
    case "firstGlobalAlertRule":
      result = new GlobalAlertRuleApi(client)
          .getGlobalAlertRules(getFixtureData(dataType, GetGlobalAlertRulesRequestBody.class), contentLanguage).get(0);
      break;
    case "defaultVlan":
      result = new VlanApi(client).getVlans(getFixtureData(dataType, GetVlansRequestBody.class), contentLanguage)
          .get(0);
    }
    if (result == null) {
      throw new ApiException(404, "fixture data not found");
    } else if (!classOfR.isInstance(result)) {
      throw new ApiException(400, "fixture data type not match");
    }
    return (R) result;
  }

  protected <TArgs, TApi, TResource> void waitForResourceAsyncStatus(TArgs args, TApi api, String func,
      Class<TResource> classOfTResource, Class<TArgs> classOfTArgs)
      throws ApiException, InterruptedException, IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException {
    Long start = System.currentTimeMillis();
    TResource resource = (TResource) api.getClass().getDeclaredMethod(func, classOfTArgs, String.class).invoke(api,
        args, contentLanguage);
    if (resource instanceof List) {
      Object first = ((List) resource).get(0);
      while (first != null && first.getClass().getDeclaredMethod("getEntityAsyncStatus").invoke(first) != null) {
        if (System.currentTimeMillis() - start > TIMEOUT) {
          throw new ApiException(408, "Timeout while waiting for async status");
        }
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        first = ((List) api.getClass().getDeclaredMethod(func, classOfTArgs, String.class).invoke(api, args,
            contentLanguage)).get(0);
      }
      if (first == null) {
        throw new ApiException(404, "Resource not found");
      }
    } else {
      while (resource != null
          && classOfTResource.getClass().getDeclaredMethod("getEntityAsyncStatus").invoke(resource) != null) {
        if (System.currentTimeMillis() - start > TIMEOUT) {
          throw new ApiException(408, "Timeout while waiting for async status");
        }
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        resource = (TResource) api.getClass().getDeclaredMethod(func, classOfTArgs, String.class).invoke(api, args,
            contentLanguage);
      }
      if (resource == null) {
        throw new ApiException(404, "Resource not found");
      }
    }
  }

  protected <TArgs, TApi, TResource> void waitForResourceDeletion(TArgs args, TApi api, String func,
      Class<TResource> classOfTResource, Class<TArgs> classOfTArgs) throws IllegalAccessException,
      IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ApiException {
    Long start = System.currentTimeMillis();
    TResource resource = (TResource) api.getClass().getDeclaredMethod(func, classOfTArgs, String.class).invoke(api,
        args, contentLanguage);
    if (resource instanceof List) {
      while (((List) resource).size() > 0) {
        if (System.currentTimeMillis() - start > TIMEOUT) {
          throw new ApiException(408, "Timeout while waiting for async status");
        }
        Object first = ((List) resource).get(0);
        if (first.getClass().getDeclaredMethod("getEntityAsyncStatus").invoke(first) != EntityAsyncStatus.DELETING) {
          LOGGER.warn("Failed to delete resource");
          return;
        }
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        resource = (TResource) api.getClass().getDeclaredMethod(func, classOfTArgs, String.class).invoke(api, args,
            contentLanguage);
      }
    } else {
      while (resource != null && classOfTResource.getClass().getDeclaredMethod("getEntityAsyncStatus")
          .invoke(resource) == EntityAsyncStatus.DELETING) {
        if (System.currentTimeMillis() - start > TIMEOUT) {
          throw new ApiException(408, "Timeout while waiting for resource deletion");
        }
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        resource = (TResource) api.getClass().getDeclaredMethod(func, classOfTArgs, String.class).invoke(api, args,
            contentLanguage);
      }
      if (resource != null && classOfTResource.getClass().getDeclaredMethod("getEntityAsyncStatus")
          .invoke(resource) != EntityAsyncStatus.DELETING) {
        LOGGER.warn("Failed to delete resource");
      }
    }
  }

  protected void waitForVmEntityAsyncStatus(String id, VmApi api) throws ApiException {
    Long start = System.currentTimeMillis();
    Vm vm = api.getVms(new GetVmsRequestBody().where(new VmWhereInput().id(id)), contentLanguage).get(0);
    while (vm != null && vm.getEntityAsyncStatus() != null) {
      if (System.currentTimeMillis() - start > TIMEOUT) {
        throw new ApiException(408, "Timeout while waiting for async status");
      }
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
      vm = api.getVms(new GetVmsRequestBody().where(new VmWhereInput().id(id)), contentLanguage).get(0);
      LOGGER.debug(String.format("%s status: %s", vm.getName(), vm.getEntityAsyncStatus()));
    }
    if (vm == null) {
      throw new ApiException(404, "VM not found");
    }
  }

  protected void waitForVmDeletion(String id, VmApi api) throws ApiException {
    Long start = System.currentTimeMillis();
    List<Vm> vms = api.getVms(new GetVmsRequestBody().where(new VmWhereInput().id(id)), contentLanguage);
    while (vms.size() > 0) {
      if (System.currentTimeMillis() - start > TIMEOUT) {
        throw new ApiException(408, "Timeout while waiting for vm deletion");
      }
      if (vms.get(0).getEntityAsyncStatus() != EntityAsyncStatus.DELETING) {
        LOGGER.warn("Failed to delete vm");
        return;
      }
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
      vms = api.getVms(new GetVmsRequestBody().where(new VmWhereInput().id(id)), contentLanguage);
    }
  }
}
