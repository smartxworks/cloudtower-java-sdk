package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.AlertNotifierApi;
import com.smartx.tower.model.*;

public class ITAlertNotifier extends IT {
  AlertNotifierApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new AlertNotifierApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/AlertNotifier.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getAlertNotifiers(String payload) {
    try {
      // parse params from json payload
      GetAlertNotifiersRequestBody params = gson.fromJson(payload, GetAlertNotifiersRequestBody.class);
      // do some modify to params(optional)
      List<AlertNotifier> result = api.getAlertNotifiers("zh-CN", params);
      assertThat(result).as("check result of getAlertNotifiers").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getAlertNotifiersConnection(String payload) {
    try {
      // parse params from json payload
      GetAlertNotifiersConnectionRequestBody params = gson.fromJson(payload, GetAlertNotifiersConnectionRequestBody.class);
      // do some modify to params(optional)
      AlertNotifierConnection result = api.getAlertNotifiersConnection("zh-CN", params);
      assertThat(result).as("check result of getAlertNotifiersConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
