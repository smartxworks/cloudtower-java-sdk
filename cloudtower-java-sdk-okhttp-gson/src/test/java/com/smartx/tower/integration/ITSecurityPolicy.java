package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.SecurityPolicyApi;
import com.smartx.tower.model.*;

public class ITSecurityPolicy extends IT {
  SecurityPolicyApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getSecurityPolicies(String payload) {
    try {
      // parse params from json payload
      GetSecurityPoliciesRequestBody params = gson.fromJson(payload, GetSecurityPoliciesRequestBody.class);
      // do some modify to params(optional)
      List<SecurityPolicy> result = api.getSecurityPolicies("zh-CN", params);
      assertThat(result).as("check result of getSecurityPolicies").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getSecurityPoliciesConnection(String payload) {
    try {
      // parse params from json payload
      GetSecurityPoliciesConnectionRequestBody params = gson.fromJson(payload, GetSecurityPoliciesConnectionRequestBody.class);
      // do some modify to params(optional)
      SecurityPolicyConnection result = api.getSecurityPoliciesConnection("zh-CN", params);
      assertThat(result).as("check result of getSecurityPoliciesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
