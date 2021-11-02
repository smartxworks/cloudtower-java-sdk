package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.IpmiApi;
import com.smartx.tower.model.*;

public class ITIpmi extends IT {
  IpmiApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new IpmiApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Ipmi.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getIpmis(String payload) {
    try {
      // parse params from json payload
      GetIpmisRequestBody params = gson.fromJson(payload, GetIpmisRequestBody.class);
      // do some modify to params(optional)
      List<Ipmi> result = api.getIpmis("zh-CN", params);
      assertThat(result).as("check result of getIpmis").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
