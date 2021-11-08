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
import com.smartx.tower.api.ElfStoragePolicyApi;
import com.smartx.tower.model.*;

public class ITElfStoragePolicy extends ITBase {
  ElfStoragePolicyApi api = null;
  HashMap<String, Object> payloads = new HashMap<>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new ElfStoragePolicyApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/ElfStoragePolicy.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "payload")
  public void getElfStoragePolicies(String payload) {
    try {
      // parse params from json payload
      GetElfStoragePoliciesRequestBody params = gson.fromJson(payload, new TypeToken<GetElfStoragePoliciesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<ElfStoragePolicy> result = api.getElfStoragePolicies(params, contentLanguage);
      assertThat(result).as("check result of getElfStoragePolicies").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getElfStoragePoliciesConnection(String payload) {
    try {
      // parse params from json payload
      GetElfStoragePoliciesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetElfStoragePoliciesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      ElfStoragePolicyConnection result = api.getElfStoragePoliciesConnection(params, contentLanguage);
      assertThat(result).as("check result of getElfStoragePoliciesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
