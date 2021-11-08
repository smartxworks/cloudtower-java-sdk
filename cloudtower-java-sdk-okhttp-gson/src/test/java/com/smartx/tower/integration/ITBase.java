package com.smartx.tower.integration;

import java.io.InputStream;
import java.util.HashMap;

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
}
