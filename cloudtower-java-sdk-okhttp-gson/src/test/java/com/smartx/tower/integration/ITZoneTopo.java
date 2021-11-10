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
import com.smartx.tower.api.ZoneTopoApi;
import com.smartx.tower.model.*;

public class ITZoneTopo extends ITBase {
  ZoneTopoApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "zoneTopoPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "zoneTopoPayload")
  public void getZoneTopoes(String payload) {
    try {
      // parse params from json payload
      GetZoneTopoesRequestBody params = gson.fromJson(payload, new TypeToken<GetZoneTopoesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<ZoneTopo> result = api.getZoneTopoes(params, contentLanguage);
      assertThat(result).as("check result of getZoneTopoes").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "zoneTopoPayload")
  public void getZoneTopoesConnection(String payload) {
    try {
      // parse params from json payload
      GetZoneTopoesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetZoneTopoesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      ZoneTopoConnection result = api.getZoneTopoesConnection(params, contentLanguage);
      assertThat(result).as("check result of getZoneTopoesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
