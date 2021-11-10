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
import com.smartx.tower.api.AlertApi;
import com.smartx.tower.model.*;

public class ITAlert extends ITBase {
  AlertApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "alertPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {
    }.getType());
  }

  @Test(dataProvider = "alertPayload")
  public void getAlerts(String payload) {
    try {
      // parse params from json payload
      GetAlertsRequestBody params = gson.fromJson(payload, new TypeToken<GetAlertsRequestBody>() {
      }.getType());
      // do some modify to params(optional)
      List<Alert> result = api.getAlerts(params, contentLanguage);
      assertThat(result).as("check result of getAlerts").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "alertPayload")
  public void getAlertsConnection(String payload) {
    try {
      // parse params from json payload
      GetAlertsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetAlertsConnectionRequestBody>() {
      }.getType());
      // do some modify to params(optional)
      AlertConnection result = api.getAlertsConnection(params, contentLanguage);
      assertThat(result).as("check result of getAlertsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "alertPayload")
  public void resolveAlert(String payload) {
    try {
      Alert alertNotEnded = getData("firstAlertNotEnded", Alert.class);
      // parse params from json payload
      ResolveAlertParams params = gson.fromJson(payload, new TypeToken<ResolveAlertParams>() {
      }.getType());
      AlertWhereInput where = new AlertWhereInput();
      where.setId(alertNotEnded.getId());
      params.setWhere(where);
      // do some modify to params(optional)
      List<WithTaskAlert> result = api.resolveAlert(params, contentLanguage);
      assertThat(result).as("check result of resolveAlert").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
