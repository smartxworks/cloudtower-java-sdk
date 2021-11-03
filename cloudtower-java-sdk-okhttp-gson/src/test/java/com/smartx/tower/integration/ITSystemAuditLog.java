package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.SystemAuditLogApi;
import com.smartx.tower.model.*;

public class ITSystemAuditLog extends IT {
  SystemAuditLogApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new SystemAuditLogApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/SystemAuditLog.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getSystemAuditLogs(String payload) {
    try {
      // parse params from json payload
      GetSystemAuditLogsRequestBody params = gson.fromJson(payload, GetSystemAuditLogsRequestBody.class);
      // do some modify to params(optional)
      List<SystemAuditLog> result = api.getSystemAuditLogs("zh-CN", params);
      assertThat(result).as("check result of getSystemAuditLogs").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getSystemAuditLogsConnection(String payload) {
    try {
      // parse params from json payload
      GetSystemAuditLogsConnectionRequestBody params = gson.fromJson(payload, GetSystemAuditLogsConnectionRequestBody.class);
      // do some modify to params(optional)
      SystemAuditLogConnection result = api.getSystemAuditLogsConnection("zh-CN", params);
      assertThat(result).as("check result of getSystemAuditLogsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
