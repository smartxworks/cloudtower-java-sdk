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
import com.smartx.tower.api.GlobalSettingsApi;
import com.smartx.tower.model.*;

public class ITGlobalSettings extends ITBase {
  GlobalSettingsApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "globalSettingsPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new GlobalSettingsApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/GlobalSettings.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "globalSettingsPayload")
  public void createClusterRecycleBinSetting(String payload) {
    try {
      // parse params from json payload
      ClusterRecycleBinCreationParams params = gson.fromJson(payload, new TypeToken<ClusterRecycleBinCreationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskClusterSettings> result = api.createClusterRecycleBinSetting(params);
      assertThat(result).as("check result of createClusterRecycleBinSetting").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "globalSettingsPayload")
  public void deleteClusterRecycleBinSetting(String payload) {
    try {
      // parse params from json payload
      ClusterRecycleBinDeletionParams params = gson.fromJson(payload, new TypeToken<ClusterRecycleBinDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteClusterRecycleBin> result = api.deleteClusterRecycleBinSetting(params);
      assertThat(result).as("check result of deleteClusterRecycleBinSetting").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "globalSettingsPayload")
  public void getGlobalSettingses(String payload) {
    try {
      // parse params from json payload
      GetGlobalSettingsesRequestBody params = gson.fromJson(payload, new TypeToken<GetGlobalSettingsesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<GlobalSettings> result = api.getGlobalSettingses(params);
      assertThat(result).as("check result of getGlobalSettingses").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "globalSettingsPayload")
  public void getGlobalSettingsesConnection(String payload) {
    try {
      // parse params from json payload
      GetGlobalSettingsesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetGlobalSettingsesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      GlobalSettingsConnection result = api.getGlobalSettingsesConnection(params);
      assertThat(result).as("check result of getGlobalSettingsesConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "globalSettingsPayload")
  public void updateClusterRecycleBinSetting(String payload) {
    try {
      // parse params from json payload
      ClusterRecycleBinUpdationParams params = gson.fromJson(payload, new TypeToken<ClusterRecycleBinUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskClusterSettings> result = api.updateClusterRecycleBinSetting(params);
      assertThat(result).as("check result of updateClusterRecycleBinSetting").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "globalSettingsPayload")
  public void updateGlobalRecycleBinSetting(String payload) {
    try {
      // parse params from json payload
      GlobalRecycleBinUpdationParams params = gson.fromJson(payload, new TypeToken<GlobalRecycleBinUpdationParams>() {}.getType());
      // do some modify to params(optional)
      WithTaskGlobalSettings result = api.updateGlobalRecycleBinSetting(params);
      assertThat(result).as("check result of updateGlobalRecycleBinSetting").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
