package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.GlobalAlertRuleApi;
import com.smartx.tower.model.*;

public class ITGlobalAlertRule extends ITBase {
  GlobalAlertRuleApi api = null;
  HashMap<String, Object> payloads = new HashMap<>();

  @DataProvider(name = "payload")
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, String>>() {
    }.getType());
  }

  @Test(dataProvider = "payload")
  public void getGlobalAlertRules(String payload) {
    try {
      // parse params from json payload
      GetGlobalAlertRulesRequestBody params = gson.fromJson(payload, new TypeToken<GetGlobalAlertRulesRequestBody>() {
      }.getType());
      // do some modify to params(optional)
      List<GlobalAlertRule> result = api.getGlobalAlertRules(params, contentLanguage);
      assertThat(result).as("check result of getGlobalAlertRules").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getGlobalAlertRulesConnection(String payload) {
    try {
      // parse params from json payload
      GetGlobalAlertRulesConnectionRequestBody params = gson.fromJson(payload,
          new TypeToken<GetGlobalAlertRulesConnectionRequestBody>() {
          }.getType());
      // do some modify to params(optional)
      GlobalAlertRuleConnection result = api.getGlobalAlertRulesConnection(params, contentLanguage);
      assertThat(result).as("check result of getGlobalAlertRulesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateCustomizeAlertRule(String payload) {
    try {
      GlobalAlertRule target = getData("firstGlobalAlertRule", GlobalAlertRule.class);
      target.getThresholds().forEach(new Consumer<AlertRuleThresholds>() {
        public void accept(AlertRuleThresholds threshold) {
          // api not accept quantitle
          threshold.setQuantile(null);
        }
      });
      // parse params from json payload
      CustomizeAlertRuleUpdationParams params = gson.fromJson(payload,
          new TypeToken<CustomizeAlertRuleUpdationParams>() {
          }.getType());
      CustomizeAlertRuleUpdationParamsData data = new CustomizeAlertRuleUpdationParamsData();
      data.setDisabled(target.getDisabled());
      data.setClusters(new ClusterWhereInput());
      data.setThresholds(target.getThresholds());
      GlobalAlertRuleWhereInput where = new GlobalAlertRuleWhereInput();
      where.setId(target.getId());
      params.setData(data);
      params.setWhere(where);
      // do some modify to params(optional)
      List<WithTaskGlobalAlertRule> result = api.updateCustomizeAlertRule(params, contentLanguage);
      assertThat(result).as("check result of updateCustomizeAlertRule").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateGlobalAlertRule(String payload) {
    try {
      GlobalAlertRule target = getData("firstGlobalAlertRule", GlobalAlertRule.class);
      target.getThresholds().forEach(new Consumer<AlertRuleThresholds>() {
        public void accept(AlertRuleThresholds threshold) {
          // api not accept quantitle
          threshold.setQuantile(null);
        }
      });
      // parse params from json payload
      GlobalAlertRuleUpdationParams params = gson.fromJson(payload, new TypeToken<GlobalAlertRuleUpdationParams>() {
      }.getType());
      GlobalAlertRuleWhereInput where = new GlobalAlertRuleWhereInput();
      GlobalAlertRuleUpdationParamsData data = new GlobalAlertRuleUpdationParamsData();
      data.setDisabled(target.getDisabled());
      data.setThresholds(target.getThresholds());
      where.setId(target.getId());
      params.setWhere(where);
      params.setData(data);
      // do some modify to params(optional)
      List<WithTaskGlobalAlertRule> result = api.updateGlobalAlertRule(params, contentLanguage);
      assertThat(result).as("check result of updateGlobalAlertRule").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
