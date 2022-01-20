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
import com.smartx.tower.api.VsphereEsxiAccountApi;
import com.smartx.tower.model.*;

public class ITVsphereEsxiAccount extends ITBase {
  VsphereEsxiAccountApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "vsphereEsxiAccountPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new VsphereEsxiAccountApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/VsphereEsxiAccount.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "vsphereEsxiAccountPayload")
  public void getVsphereEsxiAccounts(String payload) {
    try {
      // parse params from json payload
      GetVsphereEsxiAccountsRequestBody params = gson.fromJson(payload, new TypeToken<GetVsphereEsxiAccountsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<VsphereEsxiAccount> result = api.getVsphereEsxiAccounts(params, contentLanguage);
      assertThat(result).as("check result of getVsphereEsxiAccounts").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vsphereEsxiAccountPayload")
  public void getVsphereEsxiAccountsConnection(String payload) {
    try {
      // parse params from json payload
      GetVsphereEsxiAccountsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetVsphereEsxiAccountsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      VsphereEsxiAccountConnection result = api.getVsphereEsxiAccountsConnection(params, contentLanguage);
      assertThat(result).as("check result of getVsphereEsxiAccountsConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
