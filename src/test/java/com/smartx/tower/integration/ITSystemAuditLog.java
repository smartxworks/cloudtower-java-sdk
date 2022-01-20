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
import com.smartx.tower.api.SystemAuditLogApi;
import com.smartx.tower.model.*;

public class ITSystemAuditLog extends ITBase {
  SystemAuditLogApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "systemAuditLogPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "systemAuditLogPayload")
  public void getSystemAuditLogs(String payload) {
    try {
      // parse params from json payload
      GetSystemAuditLogsRequestBody params = gson.fromJson(payload, new TypeToken<GetSystemAuditLogsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<SystemAuditLog> result = api.getSystemAuditLogs(params, contentLanguage);
      assertThat(result).as("check result of getSystemAuditLogs").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "systemAuditLogPayload")
  public void getSystemAuditLogsConnection(String payload) {
    try {
      // parse params from json payload
      GetSystemAuditLogsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetSystemAuditLogsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      SystemAuditLogConnection result = api.getSystemAuditLogsConnection(params, contentLanguage);
      assertThat(result).as("check result of getSystemAuditLogsConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
