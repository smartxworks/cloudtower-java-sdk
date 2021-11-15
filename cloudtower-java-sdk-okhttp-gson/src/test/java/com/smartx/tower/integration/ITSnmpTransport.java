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
import com.smartx.tower.api.SnmpTransportApi;
import com.smartx.tower.model.*;

public class ITSnmpTransport extends ITBase {
  SnmpTransportApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "snmpTransportPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new SnmpTransportApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/SnmpTransport.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "snmpTransportPayload")
  public void createSnmpTransport(String payload) {
    try {
      // parse params from json payload
      List<SnmpTransportCreationParams> params = gson.fromJson(payload, new TypeToken<List<SnmpTransportCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskSnmpTransport> result = api.createSnmpTransport(params, contentLanguage);
      assertThat(result).as("check result of createSnmpTransport").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "snmpTransportPayload")
  public void deleteSnmpTransport(String payload) {
    try {
      // parse params from json payload
      SnmpTransportDeletionParams params = gson.fromJson(payload, new TypeToken<SnmpTransportDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteSnmpTransport> result = api.deleteSnmpTransport(params, contentLanguage);
      assertThat(result).as("check result of deleteSnmpTransport").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "snmpTransportPayload")
  public void getSnmpTransports(String payload) {
    try {
      // parse params from json payload
      GetSnmpTransportsRequestBody params = gson.fromJson(payload, new TypeToken<GetSnmpTransportsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<SnmpTransport> result = api.getSnmpTransports(params, contentLanguage);
      assertThat(result).as("check result of getSnmpTransports").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "snmpTransportPayload")
  public void getSnmpTransportsConnection(String payload) {
    try {
      // parse params from json payload
      GetSnmpTransportsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetSnmpTransportsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      SnmpTransportConnection result = api.getSnmpTransportsConnection(params, contentLanguage);
      assertThat(result).as("check result of getSnmpTransportsConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "snmpTransportPayload")
  public void updateSnmpTransport(String payload) {
    try {
      // parse params from json payload
      SnmpTransportUpdationParams params = gson.fromJson(payload, new TypeToken<SnmpTransportUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskSnmpTransport> result = api.updateSnmpTransport(params, contentLanguage);
      assertThat(result).as("check result of updateSnmpTransport").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
