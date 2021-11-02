package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.VdsApi;
import com.smartx.tower.model.*;

public class ITVds extends IT {
  VdsApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new VdsApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Vds.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getVdses(String payload) {
    try {
      // parse params from json payload
      GetVdsesRequestBody params = gson.fromJson(payload, GetVdsesRequestBody.class);
      // do some modify to params(optional)
      List<Vds> result = api.getVdses("zh-CN", params);
      assertThat(result).as("check result of getVdses").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getVdsesConnection(String payload) {
    try {
      // parse params from json payload
      GetVdsesConnectionRequestBody params = gson.fromJson(payload, GetVdsesConnectionRequestBody.class);
      // do some modify to params(optional)
      VdsConnection result = api.getVdsesConnection("zh-CN", params);
      assertThat(result).as("check result of getVdsesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createVds(String payload) {
    try {
      // parse params from json payload
      List<VdsCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskVds> result = api.createVds("zh-CN", params);
      assertThat(result).as("check result of createVds").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createVdsWithAccessVlan(String payload) {
    try {
      // parse params from json payload
      List<VdsCreationWithMAccessVlanParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskVds> result = api.createVdsWithAccessVlan("zh-CN", params);
      assertThat(result).as("check result of createVdsWithAccessVlan").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createVdsWithMigrateVlan(String payload) {
    try {
      // parse params from json payload
      List<VdsCreationWithMigrateVlanParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskVds> result = api.createVdsWithMigrateVlan("zh-CN", params);
      assertThat(result).as("check result of createVdsWithMigrateVlan").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateVds(String payload) {
    try {
      // parse params from json payload
      VdsUpdationParams params = gson.fromJson(payload, VdsUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskVds> result = api.updateVds("zh-CN", params);
      assertThat(result).as("check result of updateVds").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteVds(String payload) {
    try {
      // parse params from json payload
      VdsDeletionParams params = gson.fromJson(payload, VdsDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteVds> result = api.deleteVds("zh-CN", params);
      assertThat(result).as("check result of deleteVds").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
