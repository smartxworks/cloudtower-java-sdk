package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.AlertApi;
import com.smartx.tower.model.*;

public class ITAlert extends IT {
  AlertApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new AlertApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/alert.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }

  @Test(dataProvider = "payload")
  public void getAlerts(String payload) {
    try {
      List<Alert> alerts = api.getAlerts("zh-CN", gson.fromJson(payload, GetAlertsRequestBody.class));
      assertThat(alerts).as("try to get alerts").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  // @Test(dataProvider = "payload")
  public void resolveAlert(String payload) {
    try {
      ResolveAlertParams params = gson.fromJson(payload, ResolveAlertParams.class);
      List<WithTaskAlert> alerts = api.resolveAlert("zh-CN", params);
      assertThat(alerts).as("try to resolve alert %s", params.getWhere().getId()).isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getAlertsConnection(String payload) {
    try {
      AlertConnection connections = api.getAlertsConnection("zh-CN",
          gson.fromJson(payload, GetAlertsConnectionRequestBody.class));
      assertThat(connections).as("try to get alert connections").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }
}
