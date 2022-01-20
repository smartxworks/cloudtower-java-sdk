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
import com.smartx.tower.api.VmEntityFilterResultApi;
import com.smartx.tower.model.*;

public class ITVmEntityFilterResult extends ITBase {
  VmEntityFilterResultApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "vmEntityFilterResultPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "vmEntityFilterResultPayload")
  public void getVmEntityFilterResults(String payload) {
    try {
      // parse params from json payload
      GetVmEntityFilterResultsRequestBody params = gson.fromJson(payload, new TypeToken<GetVmEntityFilterResultsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<VmEntityFilterResult> result = api.getVmEntityFilterResults(params, contentLanguage);
      assertThat(result).as("check result of getVmEntityFilterResults").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmEntityFilterResultPayload")
  public void getVmEntityFilterResultsConnection(String payload) {
    try {
      // parse params from json payload
      GetVmEntityFilterResultsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetVmEntityFilterResultsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      VmEntityFilterResultConnection result = api.getVmEntityFilterResultsConnection(params, contentLanguage);
      assertThat(result).as("check result of getVmEntityFilterResultsConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
