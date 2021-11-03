package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.SnmpTransportApi;
import com.smartx.tower.model.*;

public class ITSnmpTransport extends IT {
  SnmpTransportApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getSnmpTransports(String payload) {
    try {
      // parse params from json payload
      GetSnmpTransportsRequestBody params = gson.fromJson(payload, GetSnmpTransportsRequestBody.class);
      // do some modify to params(optional)
      List<SnmpTransport> result = api.getSnmpTransports("zh-CN", params);
      assertThat(result).as("check result of getSnmpTransports").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getSnmpTransportsConnection(String payload) {
    try {
      // parse params from json payload
      GetSnmpTransportsConnectionRequestBody params = gson.fromJson(payload, GetSnmpTransportsConnectionRequestBody.class);
      // do some modify to params(optional)
      SnmpTransportConnection result = api.getSnmpTransportsConnection("zh-CN", params);
      assertThat(result).as("check result of getSnmpTransportsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createSnmpTransport(String payload) {
    try {
      // parse params from json payload
      List<SnmpTransportCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskSnmpTransport> result = api.createSnmpTransport("zh-CN", params);
      assertThat(result).as("check result of createSnmpTransport").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateSnmpTransport(String payload) {
    try {
      // parse params from json payload
      SnmpTransportUpdationParams params = gson.fromJson(payload, SnmpTransportUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskSnmpTransport> result = api.updateSnmpTransport("zh-CN", params);
      assertThat(result).as("check result of updateSnmpTransport").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteSnmpTransport(String payload) {
    try {
      // parse params from json payload
      SnmpTransportDeletionParams params = gson.fromJson(payload, SnmpTransportDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteSnmpTransport> result = api.deleteSnmpTransport("zh-CN", params);
      assertThat(result).as("check result of deleteSnmpTransport").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
