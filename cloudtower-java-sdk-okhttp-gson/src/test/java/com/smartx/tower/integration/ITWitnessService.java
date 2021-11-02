package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.WitnessServiceApi;
import com.smartx.tower.model.*;

public class ITWitnessService extends IT {
  WitnessServiceApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getWitnessServices(String payload) {
    try {
      // parse params from json payload
      GetWitnessServicesRequestBody params = gson.fromJson(payload, GetWitnessServicesRequestBody.class);
      // do some modify to params(optional)
      List<WitnessService> result = api.getWitnessServices("zh-CN", params);
      assertThat(result).as("check result of getWitnessServices").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
