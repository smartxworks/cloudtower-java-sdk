package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.IsolationPolicyApi;
import com.smartx.tower.model.*;

public class ITIsolationPolicy extends IT {
  IsolationPolicyApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getIsolationPolicies(String payload) {
    try {
      // parse params from json payload
      GetIsolationPoliciesRequestBody params = gson.fromJson(payload, GetIsolationPoliciesRequestBody.class);
      // do some modify to params(optional)
      List<IsolationPolicy> result = api.getIsolationPolicies("zh-CN", params);
      assertThat(result).as("check result of getIsolationPolicies").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getIsolationPoliciesConnection(String payload) {
    try {
      // parse params from json payload
      GetIsolationPoliciesConnectionRequestBody params = gson.fromJson(payload, GetIsolationPoliciesConnectionRequestBody.class);
      // do some modify to params(optional)
      IsolationPolicyConnection result = api.getIsolationPoliciesConnection("zh-CN", params);
      assertThat(result).as("check result of getIsolationPoliciesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
