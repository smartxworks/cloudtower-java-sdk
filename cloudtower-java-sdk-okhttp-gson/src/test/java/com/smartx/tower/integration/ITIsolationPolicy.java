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
import com.smartx.tower.api.IsolationPolicyApi;
import com.smartx.tower.model.*;

public class ITIsolationPolicy extends ITBase {
  IsolationPolicyApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "isolationPolicyPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new IsolationPolicyApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/IsolationPolicy.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "isolationPolicyPayload")
  public void getIsolationPolicies(String payload) {
    try {
      // parse params from json payload
      GetIsolationPoliciesRequestBody params = gson.fromJson(payload, new TypeToken<GetIsolationPoliciesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<IsolationPolicy> result = api.getIsolationPolicies(params, contentLanguage);
      assertThat(result).as("check result of getIsolationPolicies").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "isolationPolicyPayload")
  public void getIsolationPoliciesConnection(String payload) {
    try {
      // parse params from json payload
      GetIsolationPoliciesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetIsolationPoliciesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      IsolationPolicyConnection result = api.getIsolationPoliciesConnection(params, contentLanguage);
      assertThat(result).as("check result of getIsolationPoliciesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
