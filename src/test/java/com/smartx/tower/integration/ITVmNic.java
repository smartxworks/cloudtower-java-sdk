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
import com.smartx.tower.api.VmNicApi;
import com.smartx.tower.model.*;

public class ITVmNic extends ITBase {
  VmNicApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "vmNicPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new VmNicApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/VmNic.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "vmNicPayload")
  public void getVmNics(String payload) {
    try {
      // parse params from json payload
      GetVmNicsRequestBody params = gson.fromJson(payload, new TypeToken<GetVmNicsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<VmNic> result = api.getVmNics(params, contentLanguage);
      assertThat(result).as("check result of getVmNics").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmNicPayload")
  public void getVmNicsConnection(String payload) {
    try {
      // parse params from json payload
      GetVmNicsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetVmNicsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      VmNicConnection result = api.getVmNicsConnection(params, contentLanguage);
      assertThat(result).as("check result of getVmNicsConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
