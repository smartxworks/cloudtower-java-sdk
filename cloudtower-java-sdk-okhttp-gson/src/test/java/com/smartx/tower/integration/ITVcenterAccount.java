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
import com.smartx.tower.api.VcenterAccountApi;
import com.smartx.tower.model.*;

public class ITVcenterAccount extends ITBase {
  VcenterAccountApi api = null;
  HashMap<String, Object> payloads = new HashMap<>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new VcenterAccountApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/VcenterAccount.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "payload")
  public void getVcenterAccounts(String payload) {
    try {
      // parse params from json payload
      GetVcenterAccountsRequestBody params = gson.fromJson(payload, new TypeToken<GetVcenterAccountsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<VcenterAccount> result = api.getVcenterAccounts(params, contentLanguage);
      assertThat(result).as("check result of getVcenterAccounts").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getVcenterAccountsConnection(String payload) {
    try {
      // parse params from json payload
      GetVcenterAccountsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetVcenterAccountsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      VcenterAccountConnection result = api.getVcenterAccountsConnection(params, contentLanguage);
      assertThat(result).as("check result of getVcenterAccountsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
