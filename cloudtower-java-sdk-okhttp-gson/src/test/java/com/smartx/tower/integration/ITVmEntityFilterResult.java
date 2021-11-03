package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.VmEntityFilterResultApi;
import com.smartx.tower.model.*;

public class ITVmEntityFilterResult extends IT {
  VmEntityFilterResultApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new VmEntityFilterResultApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/VmEntityFilterResult.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getVmEntityFilterResults(String payload) {
    try {
      // parse params from json payload
      GetVmEntityFilterResultsRequestBody params = gson.fromJson(payload, GetVmEntityFilterResultsRequestBody.class);
      // do some modify to params(optional)
      List<VmEntityFilterResult> result = api.getVmEntityFilterResults("zh-CN", params);
      assertThat(result).as("check result of getVmEntityFilterResults").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getVmEntityFilterResultsConnection(String payload) {
    try {
      // parse params from json payload
      GetVmEntityFilterResultsConnectionRequestBody params = gson.fromJson(payload, GetVmEntityFilterResultsConnectionRequestBody.class);
      // do some modify to params(optional)
      VmEntityFilterResultConnection result = api.getVmEntityFilterResultsConnection("zh-CN", params);
      assertThat(result).as("check result of getVmEntityFilterResultsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
