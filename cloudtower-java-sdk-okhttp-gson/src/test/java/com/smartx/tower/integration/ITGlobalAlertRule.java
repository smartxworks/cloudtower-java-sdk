package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.GlobalAlertRuleApi;
import com.smartx.tower.model.*;

public class ITGlobalAlertRule extends IT {
  GlobalAlertRuleApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new GlobalAlertRuleApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/GlobalAlertRule.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getGlobalAlertRules(String payload) {
    try {
      // parse params from json payload
      GetGlobalAlertRulesRequestBody params = gson.fromJson(payload, GetGlobalAlertRulesRequestBody.class);
      // do some modify to params(optional)
      List<GlobalAlertRule> result = api.getGlobalAlertRules("zh-CN", params);
      assertThat(result).as("check result of getGlobalAlertRules").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getGlobalAlertRulesConnection(String payload) {
    try {
      // parse params from json payload
      GetGlobalAlertRulesConnectionRequestBody params = gson.fromJson(payload, GetGlobalAlertRulesConnectionRequestBody.class);
      // do some modify to params(optional)
      GlobalAlertRuleConnection result = api.getGlobalAlertRulesConnection("zh-CN", params);
      assertThat(result).as("check result of getGlobalAlertRulesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateCustomizeAlertRule(String payload) {
    try {
      // parse params from json payload
      CustomizeAlertRuleUpdationParams params = gson.fromJson(payload, CustomizeAlertRuleUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskGlobalAlertRule> result = api.updateCustomizeAlertRule("zh-CN", params);
      assertThat(result).as("check result of updateCustomizeAlertRule").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateGlobalAlertRule(String payload) {
    try {
      // parse params from json payload
      GlobalAlertRuleUpdationParams params = gson.fromJson(payload, GlobalAlertRuleUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskGlobalAlertRule> result = api.updateGlobalAlertRule("zh-CN", params);
      assertThat(result).as("check result of updateGlobalAlertRule").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
