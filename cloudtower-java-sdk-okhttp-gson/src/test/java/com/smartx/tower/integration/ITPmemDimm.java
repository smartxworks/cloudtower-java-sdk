package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.PmemDimmApi;
import com.smartx.tower.model.*;

public class ITPmemDimm extends IT {
  PmemDimmApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new PmemDimmApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/PmemDimm.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getPmemDimms(String payload) {
    try {
      // parse params from json payload
      GetPmemDimmsRequestBody params = gson.fromJson(payload, GetPmemDimmsRequestBody.class);
      // do some modify to params(optional)
      List<PmemDimm> result = api.getPmemDimms("zh-CN", params);
      assertThat(result).as("check result of getPmemDimms").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getPmemDimmsConnection(String payload) {
    try {
      // parse params from json payload
      GetPmemDimmsConnectionRequestBody params = gson.fromJson(payload, GetPmemDimmsConnectionRequestBody.class);
      // do some modify to params(optional)
      PmemDimmConnection result = api.getPmemDimmsConnection("zh-CN", params);
      assertThat(result).as("check result of getPmemDimmsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
