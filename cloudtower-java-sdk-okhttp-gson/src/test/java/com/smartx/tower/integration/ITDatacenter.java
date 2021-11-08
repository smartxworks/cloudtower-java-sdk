package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.DatacenterApi;
import com.smartx.tower.model.*;

public class ITDatacenter extends ITBase {
  DatacenterApi api = null;
  HashMap<String, Object> payloads = new HashMap<>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new DatacenterApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Datacenter.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {
    }.getType());
  }

  @Test(dataProvider = "payload", priority = 1)
  public void createDatacenter(String payload) {
    try {
      // parse params from json payload
      List<DatacenterCreationParams> params = gson.fromJson(payload, new TypeToken<List<DatacenterCreationParams>>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskDatacenter> result = api.createDatacenter(params, contentLanguage);
      assertThat(result).as("check result of createDatacenter").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload", priority = 3)
  public void deleteDatacenter(String payload) {
    try {
      // parse params from json payload
      DatacenterDeletionParams params = gson.fromJson(payload, new TypeToken<DatacenterDeletionParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteDatacenter> result = api.deleteDatacenter(params, contentLanguage);
      assertThat(result).as("check result of deleteDatacenter").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getDatacenters(String payload) {
    try {
      // parse params from json payload
      GetDatacentersRequestBody params = gson.fromJson(payload, new TypeToken<GetDatacentersRequestBody>() {
      }.getType());
      // do some modify to params(optional)
      List<Datacenter> result = api.getDatacenters(params, contentLanguage);
      assertThat(result).as("check result of getDatacenters").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getDatacentersConnection(String payload) {
    try {
      // parse params from json payload
      GetDatacentersConnectionRequestBody params = gson.fromJson(payload,
          new TypeToken<GetDatacentersConnectionRequestBody>() {
          }.getType());
      // do some modify to params(optional)
      DatacenterConnection result = api.getDatacentersConnection(params, contentLanguage);
      assertThat(result).as("check result of getDatacentersConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload", priority = 2)
  public void updateDatacenter(String payload) {
    try {
      // parse params from json payload
      DatacenterUpdationParams params = gson.fromJson(payload, new TypeToken<DatacenterUpdationParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskDatacenter> result = api.updateDatacenter(params, contentLanguage);
      assertThat(result).as("check result of updateDatacenter").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
