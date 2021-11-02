package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.WitnessApi;
import com.smartx.tower.model.*;

public class ITWitness extends IT {
  WitnessApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getWitnesses(String payload) {
    try {
      // parse params from json payload
      GetWitnessesRequestBody params = gson.fromJson(payload, GetWitnessesRequestBody.class);
      // do some modify to params(optional)
      List<Witness> result = api.getWitnesses("zh-CN", params);
      assertThat(result).as("check result of getWitnesses").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getWitnessesConnection(String payload) {
    try {
      // parse params from json payload
      GetWitnessesConnectionRequestBody params = gson.fromJson(payload, GetWitnessesConnectionRequestBody.class);
      // do some modify to params(optional)
      WitnessConnection result = api.getWitnessesConnection("zh-CN", params);
      assertThat(result).as("check result of getWitnessesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
