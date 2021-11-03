package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.GlobalSettingsApi;
import com.smartx.tower.model.*;

public class ITGlobalSettings extends IT {
  GlobalSettingsApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getGlobalSettingses(String payload) {
    try {
      // parse params from json payload
      GetGlobalSettingsesRequestBody params = gson.fromJson(payload, GetGlobalSettingsesRequestBody.class);
      // do some modify to params(optional)
      List<GlobalSettings> result = api.getGlobalSettingses("zh-CN", params);
      assertThat(result).as("check result of getGlobalSettingses").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getGlobalSettingsesConnection(String payload) {
    try {
      // parse params from json payload
      GetGlobalSettingsesConnectionRequestBody params = gson.fromJson(payload, GetGlobalSettingsesConnectionRequestBody.class);
      // do some modify to params(optional)
      GlobalSettingsConnection result = api.getGlobalSettingsesConnection("zh-CN", params);
      assertThat(result).as("check result of getGlobalSettingsesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createClusterRecycleBinSetting(String payload) {
    try {
      // parse params from json payload
      ClusterRecycleBinCreationParams params = gson.fromJson(payload, ClusterRecycleBinCreationParams.class);
      // do some modify to params(optional)
      List<WithTaskClusterSettings> result = api.createClusterRecycleBinSetting("zh-CN", params);
      assertThat(result).as("check result of createClusterRecycleBinSetting").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateClusterRecycleBinSetting(String payload) {
    try {
      // parse params from json payload
      ClusterRecycleBinUpdationParams params = gson.fromJson(payload, ClusterRecycleBinUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskClusterSettings> result = api.updateClusterRecycleBinSetting("zh-CN", params);
      assertThat(result).as("check result of updateClusterRecycleBinSetting").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateGlobalRecycleBinSetting(String payload) {
    try {
      // parse params from json payload
      GlobalRecycleBinUpdationParams params = gson.fromJson(payload, GlobalRecycleBinUpdationParams.class);
      // do some modify to params(optional)
      WithTaskGlobalSettings result = api.updateGlobalRecycleBinSetting("zh-CN", params);
      assertThat(result).as("check result of updateGlobalRecycleBinSetting").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteClusterRecycleBinSetting(String payload) {
    try {
      // parse params from json payload
      ClusterRecycleBinDeletionParams params = gson.fromJson(payload, ClusterRecycleBinDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteClusterRecycleBin> result = api.deleteClusterRecycleBinSetting("zh-CN", params);
      assertThat(result).as("check result of deleteClusterRecycleBinSetting").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
