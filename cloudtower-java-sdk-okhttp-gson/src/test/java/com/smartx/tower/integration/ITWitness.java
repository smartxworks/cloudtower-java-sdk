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
import com.smartx.tower.api.WitnessApi;
import com.smartx.tower.model.*;

public class ITWitness extends ITBase {
  WitnessApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "witnessPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new WitnessApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Witness.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "witnessPayload")
  public void getWitnesses(String payload) {
    try {
      // parse params from json payload
      GetWitnessesRequestBody params = gson.fromJson(payload, new TypeToken<GetWitnessesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<Witness> result = api.getWitnesses(params, contentLanguage);
      assertThat(result).as("check result of getWitnesses").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "witnessPayload")
  public void getWitnessesConnection(String payload) {
    try {
      // parse params from json payload
      GetWitnessesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetWitnessesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      WitnessConnection result = api.getWitnessesConnection(params, contentLanguage);
      assertThat(result).as("check result of getWitnessesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
