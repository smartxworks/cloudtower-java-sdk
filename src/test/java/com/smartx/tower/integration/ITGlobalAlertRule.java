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
import com.smartx.tower.api.GlobalAlertRuleApi;
import com.smartx.tower.model.*;

public class ITGlobalAlertRule extends ITBase {
  GlobalAlertRuleApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "globalAlertRulePayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "globalAlertRulePayload")
  public void getGlobalAlertRules(String payload) {
    try {
      // parse params from json payload
      GetGlobalAlertRulesRequestBody params = gson.fromJson(payload, new TypeToken<GetGlobalAlertRulesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<GlobalAlertRule> result = api.getGlobalAlertRules(params, contentLanguage);
      assertThat(result).as("check result of getGlobalAlertRules").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "globalAlertRulePayload")
  public void getGlobalAlertRulesConnection(String payload) {
    try {
      // parse params from json payload
      GetGlobalAlertRulesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetGlobalAlertRulesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      GlobalAlertRuleConnection result = api.getGlobalAlertRulesConnection(params, contentLanguage);
      assertThat(result).as("check result of getGlobalAlertRulesConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "globalAlertRulePayload")
  public void updateCustomizeAlertRule(String payload) {
    try {
      // parse params from json payload
      CustomizeAlertRuleUpdationParams params = gson.fromJson(payload, new TypeToken<CustomizeAlertRuleUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskGlobalAlertRule> result = api.updateCustomizeAlertRule(params, contentLanguage);
      assertThat(result).as("check result of updateCustomizeAlertRule").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "globalAlertRulePayload")
  public void updateGlobalAlertRule(String payload) {
    try {
      // parse params from json payload
      GlobalAlertRuleUpdationParams params = gson.fromJson(payload, new TypeToken<GlobalAlertRuleUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskGlobalAlertRule> result = api.updateGlobalAlertRule(params, contentLanguage);
      assertThat(result).as("check result of updateGlobalAlertRule").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
