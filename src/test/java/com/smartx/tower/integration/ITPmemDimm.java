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
import com.smartx.tower.api.PmemDimmApi;
import com.smartx.tower.model.*;

public class ITPmemDimm extends ITBase {
  PmemDimmApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "pmemDimmPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "pmemDimmPayload")
  public void getPmemDimms(String payload) {
    try {
      // parse params from json payload
      GetPmemDimmsRequestBody params = gson.fromJson(payload, new TypeToken<GetPmemDimmsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<PmemDimm> result = api.getPmemDimms(params);
      assertThat(result).as("check result of getPmemDimms").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "pmemDimmPayload")
  public void getPmemDimmsConnection(String payload) {
    try {
      // parse params from json payload
      GetPmemDimmsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetPmemDimmsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      PmemDimmConnection result = api.getPmemDimmsConnection(params);
      assertThat(result).as("check result of getPmemDimmsConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
