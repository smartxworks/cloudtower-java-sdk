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
import com.smartx.tower.api.SecurityPolicyApi;
import com.smartx.tower.model.*;

public class ITSecurityPolicy extends ITBase {
  SecurityPolicyApi api = null;
  HashMap<String, Object> payloads = new HashMap<>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new SecurityPolicyApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/SecurityPolicy.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "payload")
  public void getSecurityPolicies(String payload) {
    try {
      // parse params from json payload
      GetSecurityPoliciesRequestBody params = gson.fromJson(payload, new TypeToken<GetSecurityPoliciesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<SecurityPolicy> result = api.getSecurityPolicies(params, contentLanguage);
      assertThat(result).as("check result of getSecurityPolicies").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getSecurityPoliciesConnection(String payload) {
    try {
      // parse params from json payload
      GetSecurityPoliciesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetSecurityPoliciesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      SecurityPolicyConnection result = api.getSecurityPoliciesConnection(params, contentLanguage);
      assertThat(result).as("check result of getSecurityPoliciesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
