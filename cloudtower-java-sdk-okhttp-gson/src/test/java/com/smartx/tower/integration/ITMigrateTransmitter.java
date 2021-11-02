package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.MigrateTransmitterApi;
import com.smartx.tower.model.*;

public class ITMigrateTransmitter extends IT {
  MigrateTransmitterApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new MigrateTransmitterApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/MigrateTransmitter.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getMigrateTransmitters(String payload) {
    try {
      // parse params from json payload
      GetMigrateTransmittersRequestBody params = gson.fromJson(payload, GetMigrateTransmittersRequestBody.class);
      // do some modify to params(optional)
      List<MigrateTransmitter> result = api.getMigrateTransmitters("zh-CN", params);
      assertThat(result).as("check result of getMigrateTransmitters").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getMigrateTransmittersConnection(String payload) {
    try {
      // parse params from json payload
      GetMigrateTransmittersConnectionRequestBody params = gson.fromJson(payload, GetMigrateTransmittersConnectionRequestBody.class);
      // do some modify to params(optional)
      MigrateTransmitterConnection result = api.getMigrateTransmittersConnection("zh-CN", params);
      assertThat(result).as("check result of getMigrateTransmittersConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
