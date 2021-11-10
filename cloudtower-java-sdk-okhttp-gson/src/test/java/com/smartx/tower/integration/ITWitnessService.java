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
import com.smartx.tower.api.WitnessServiceApi;
import com.smartx.tower.model.*;

public class ITWitnessService extends ITBase {
  WitnessServiceApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "witnessServicePayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new WitnessServiceApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/WitnessService.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "witnessServicePayload")
  public void getWitnessServices(String payload) {
    try {
      // parse params from json payload
      GetWitnessServicesRequestBody params = gson.fromJson(payload, new TypeToken<GetWitnessServicesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<WitnessService> result = api.getWitnessServices(params, contentLanguage);
      assertThat(result).as("check result of getWitnessServices").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
