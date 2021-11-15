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
import com.smartx.tower.api.SnmpTrapReceiverApi;
import com.smartx.tower.model.*;

public class ITSnmpTrapReceiver extends ITBase {
  SnmpTrapReceiverApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "snmpTrapReceiverPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new SnmpTrapReceiverApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/SnmpTrapReceiver.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "snmpTrapReceiverPayload")
  public void createSnmpTrapReceiver(String payload) {
    try {
      // parse params from json payload
      List<SnmpTrapReceiverCreationParams> params = gson.fromJson(payload, new TypeToken<List<SnmpTrapReceiverCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskSnmpTrapReceiver> result = api.createSnmpTrapReceiver(params, contentLanguage);
      assertThat(result).as("check result of createSnmpTrapReceiver").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "snmpTrapReceiverPayload")
  public void deleteSnmpTrapReceiver(String payload) {
    try {
      // parse params from json payload
      SnmpTrapReceiverDeletionParams params = gson.fromJson(payload, new TypeToken<SnmpTrapReceiverDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteSnmpTrapReceiver> result = api.deleteSnmpTrapReceiver(params, contentLanguage);
      assertThat(result).as("check result of deleteSnmpTrapReceiver").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "snmpTrapReceiverPayload")
  public void getSnmpTrapReceivers(String payload) {
    try {
      // parse params from json payload
      GetSnmpTrapReceiversRequestBody params = gson.fromJson(payload, new TypeToken<GetSnmpTrapReceiversRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<SnmpTrapReceiver> result = api.getSnmpTrapReceivers(params, contentLanguage);
      assertThat(result).as("check result of getSnmpTrapReceivers").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "snmpTrapReceiverPayload")
  public void getSnmpTrapReceiversConnection(String payload) {
    try {
      // parse params from json payload
      GetSnmpTrapReceiversConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetSnmpTrapReceiversConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      SnmpTrapReceiverConnection result = api.getSnmpTrapReceiversConnection(params, contentLanguage);
      assertThat(result).as("check result of getSnmpTrapReceiversConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "snmpTrapReceiverPayload")
  public void updateSnmpTrapReceiver(String payload) {
    try {
      // parse params from json payload
      SnmpTrapReceiverUpdationParams params = gson.fromJson(payload, new TypeToken<SnmpTrapReceiverUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskSnmpTrapReceiver> result = api.updateSnmpTrapReceiver(params, contentLanguage);
      assertThat(result).as("check result of updateSnmpTrapReceiver").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
