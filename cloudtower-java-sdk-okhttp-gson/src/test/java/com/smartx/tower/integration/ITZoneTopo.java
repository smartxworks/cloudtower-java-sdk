package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.ZoneTopoApi;
import com.smartx.tower.model.*;

public class ITZoneTopo extends IT {
  ZoneTopoApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new ZoneTopoApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/ZoneTopo.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getZoneTopoes(String payload) {
    try {
      // parse params from json payload
      GetZoneTopoesRequestBody params = gson.fromJson(payload, GetZoneTopoesRequestBody.class);
      // do some modify to params(optional)
      List<ZoneTopo> result = api.getZoneTopoes("zh-CN", params);
      assertThat(result).as("check result of getZoneTopoes").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getZoneTopoesConnection(String payload) {
    try {
      // parse params from json payload
      GetZoneTopoesConnectionRequestBody params = gson.fromJson(payload, GetZoneTopoesConnectionRequestBody.class);
      // do some modify to params(optional)
      ZoneTopoConnection result = api.getZoneTopoesConnection("zh-CN", params);
      assertThat(result).as("check result of getZoneTopoesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
