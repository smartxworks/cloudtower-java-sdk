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
    InputStream stream = getClass().getResourceAsStream("/Alert.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }

  @Test(dataProvider = "payload", priority = 0)
  public void getAlerts(String payload) {
    try {
      List<Alert> alerts = api.getAlerts("zh-CN", gson.fromJson(payload, GetAlertsRequestBody.class));
      assertThat(alerts).as("check result of getAlerts").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(priority = 2)
  public void resolveAlert() {
    try {
      List<Alert> notResolved = api.getAlerts("zh-CN",
          new GetAlertsRequestBody().first(1.0).where(new AlertWhereInput().ended(false)));
      if (notResolved.size() == 0) {
        return;
      }
      ResolveAlertParams params = new ResolveAlertParams().where(new AlertWhereInput().id(notResolved.get(0).getId()));
      List<WithTaskAlert> alerts = api.resolveAlert("zh-CN", params);
      assertThat(alerts).as("check result of resolveAlert").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload", priority = 1)
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
