package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.ClusterSettingsApi;
import com.smartx.tower.model.*;

public class ITClusterSettings extends IT {
  ClusterSettingsApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getClusterSettingses(String payload) {
    try {
      // parse params from json payload
      GetClusterSettingsesRequestBody params = gson.fromJson(payload, GetClusterSettingsesRequestBody.class);
      // do some modify to params(optional)
      List<ClusterSettings> result = api.getClusterSettingses("zh-CN", params);
      assertThat(result).as("check result of getClusterSettingses").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getClusterSettingsesConnection(String payload) {
    try {
      // parse params from json payload
      GetClusterSettingsesConnectionRequestBody params = gson.fromJson(payload, GetClusterSettingsesConnectionRequestBody.class);
      // do some modify to params(optional)
      ClusterSettingsConnection result = api.getClusterSettingsesConnection("zh-CN", params);
      assertThat(result).as("check result of getClusterSettingsesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
