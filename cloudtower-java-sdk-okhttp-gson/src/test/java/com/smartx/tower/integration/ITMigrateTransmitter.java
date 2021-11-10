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
import com.smartx.tower.api.MigrateTransmitterApi;
import com.smartx.tower.model.*;

public class ITMigrateTransmitter extends ITBase {
  MigrateTransmitterApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "migrateTransmitterPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "migrateTransmitterPayload")
  public void getMigrateTransmitters(String payload) {
    try {
      // parse params from json payload
      GetMigrateTransmittersRequestBody params = gson.fromJson(payload, new TypeToken<GetMigrateTransmittersRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<MigrateTransmitter> result = api.getMigrateTransmitters(params, contentLanguage);
      assertThat(result).as("check result of getMigrateTransmitters").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "migrateTransmitterPayload")
  public void getMigrateTransmittersConnection(String payload) {
    try {
      // parse params from json payload
      GetMigrateTransmittersConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetMigrateTransmittersConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      MigrateTransmitterConnection result = api.getMigrateTransmittersConnection(params, contentLanguage);
      assertThat(result).as("check result of getMigrateTransmittersConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
