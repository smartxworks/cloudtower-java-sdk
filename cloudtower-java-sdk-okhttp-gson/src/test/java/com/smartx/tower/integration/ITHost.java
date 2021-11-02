package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.HostApi;
import com.smartx.tower.model.*;

public class ITHost extends IT {
  HostApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new HostApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Host.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getHosts(String payload) {
    try {
      // parse params from json payload
      GetHostsRequestBody params = gson.fromJson(payload, GetHostsRequestBody.class);
      // do some modify to params(optional)
      List<Host> result = api.getHosts("zh-CN", params);
      assertThat(result).as("check result of getHosts").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getHostsConnection(String payload) {
    try {
      // parse params from json payload
      GetHostsConnectionRequestBody params = gson.fromJson(payload, GetHostsConnectionRequestBody.class);
      // do some modify to params(optional)
      HostConnection result = api.getHostsConnection("zh-CN", params);
      assertThat(result).as("check result of getHostsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createHost(String payload) {
    try {
      // parse params from json payload
      List<HostCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskBatchHosts> result = api.createHost("zh-CN", params);
      assertThat(result).as("check result of createHost").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateHost(String payload) {
    try {
      // parse params from json payload
      HostUpdationParams params = gson.fromJson(payload, HostUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskHost> result = api.updateHost("zh-CN", params);
      assertThat(result).as("check result of updateHost").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void triggerDiskBlink(String payload) {
    try {
      // parse params from json payload
      List<TriggerDiskBlinkParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskHost> result = api.triggerDiskBlink("zh-CN", params);
      assertThat(result).as("check result of triggerDiskBlink").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
