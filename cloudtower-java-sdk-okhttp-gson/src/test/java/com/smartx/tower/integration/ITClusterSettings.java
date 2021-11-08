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
import com.smartx.tower.api.ClusterSettingsApi;
import com.smartx.tower.model.*;

public class ITClusterSettings extends ITBase {
  ClusterSettingsApi api = null;
  HashMap<String, Object> payloads = new HashMap<>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new ClusterSettingsApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/ClusterSettings.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "payload")
  public void getClusterSettingses(String payload) {
    try {
      // parse params from json payload
      GetClusterSettingsesRequestBody params = gson.fromJson(payload, new TypeToken<GetClusterSettingsesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<ClusterSettings> result = api.getClusterSettingses(params, contentLanguage);
      assertThat(result).as("check result of getClusterSettingses").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getClusterSettingsesConnection(String payload) {
    try {
      // parse params from json payload
      GetClusterSettingsesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetClusterSettingsesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      ClusterSettingsConnection result = api.getClusterSettingsesConnection(params, contentLanguage);
      assertThat(result).as("check result of getClusterSettingsesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
