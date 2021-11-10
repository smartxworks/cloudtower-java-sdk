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
import com.smartx.tower.api.UserAuditLogApi;
import com.smartx.tower.model.*;

public class ITUserAuditLog extends ITBase {
  UserAuditLogApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "userAuditLogPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new UserAuditLogApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/UserAuditLog.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "userAuditLogPayload")
  public void getUserAuditLogs(String payload) {
    try {
      // parse params from json payload
      GetUserAuditLogsRequestBody params = gson.fromJson(payload, new TypeToken<GetUserAuditLogsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<UserAuditLog> result = api.getUserAuditLogs(params, contentLanguage);
      assertThat(result).as("check result of getUserAuditLogs").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "userAuditLogPayload")
  public void getUserAuditLogsConnection(String payload) {
    try {
      // parse params from json payload
      GetUserAuditLogsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetUserAuditLogsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      UserAuditLogConnection result = api.getUserAuditLogsConnection(params, contentLanguage);
      assertThat(result).as("check result of getUserAuditLogsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
