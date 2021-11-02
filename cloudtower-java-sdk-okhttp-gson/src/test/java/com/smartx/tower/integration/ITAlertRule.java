package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.AlertRuleApi;
import com.smartx.tower.model.*;

public class ITAlertRule extends IT {
  AlertRuleApi api = null;

  @DataProvider(name = "alert-payload")
  Object[][] data(Method m) {
    switch (m.getName()) {
    case "getAlertRules":
      return new Object[][] { { "{}" } };
    case "getAlertRulesConnection":
      return new Object[][] { { "{}" } };
    case "resolveAlert":
      return new Object[][] { { String.format("{\"where\":{\"id\":%s}}", "ckvg1uwes0uez0820g80v5mfb") } };
    }
    return null;
  }

  @BeforeClass
  public void getService() {
    api = new AlertRuleApi(client);
  }

  @Test(dataProvider = "alert-payload")
  public void getAlertRules(String payload) {
    try {
      List<AlertRule> alerts = api.getAlertRules("zh-CN", gson.fromJson(payload, GetAlertRulesRequestBody.class));
      assertThat(alerts).as("try to get alert rule").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "alert-payload")
  public void getAlertRulesConnection(String payload) {
    try {
      AlertRuleConnection connections = api.getAlertRulesConnection("zh-CN",
          gson.fromJson(payload, GetAlertRulesConnectionRequestBody.class));
      assertThat(connections).as("try to get alert rule connection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }
}
