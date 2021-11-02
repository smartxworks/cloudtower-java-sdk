package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.ZoneApi;
import com.smartx.tower.model.*;

public class ITZone extends IT {
  ZoneApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new ZoneApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Zone.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getZones(String payload) {
    try {
      // parse params from json payload
      GetZonesRequestBody params = gson.fromJson(payload, GetZonesRequestBody.class);
      // do some modify to params(optional)
      List<Zone> result = api.getZones("zh-CN", params);
      assertThat(result).as("check result of getZones").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getZonesConnection(String payload) {
    try {
      // parse params from json payload
      GetZonesConnectionRequestBody params = gson.fromJson(payload, GetZonesConnectionRequestBody.class);
      // do some modify to params(optional)
      ZoneConnection result = api.getZonesConnection("zh-CN", params);
      assertThat(result).as("check result of getZonesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
