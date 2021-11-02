package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.NicApi;
import com.smartx.tower.model.*;

public class ITNic extends IT {
  NicApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new NicApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Nic.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getNics(String payload) {
    try {
      // parse params from json payload
      GetNicsRequestBody params = gson.fromJson(payload, GetNicsRequestBody.class);
      // do some modify to params(optional)
      List<Nic> result = api.getNics("zh-CN", params);
      assertThat(result).as("check result of getNics").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getNicsConnection(String payload) {
    try {
      // parse params from json payload
      GetNicsConnectionRequestBody params = gson.fromJson(payload, GetNicsConnectionRequestBody.class);
      // do some modify to params(optional)
      NicConnection result = api.getNicsConnection("zh-CN", params);
      assertThat(result).as("check result of getNicsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateNic(String payload) {
    try {
      // parse params from json payload
      NicUpdationParams params = gson.fromJson(payload, NicUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskNic> result = api.updateNic("zh-CN", params);
      assertThat(result).as("check result of updateNic").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
