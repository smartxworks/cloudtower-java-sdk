package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.NvmfSubsystemApi;
import com.smartx.tower.model.*;

public class ITNvmfSubsystem extends IT {
  NvmfSubsystemApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new NvmfSubsystemApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/NvmfSubsystem.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getNvmfSubsystems(String payload) {
    try {
      // parse params from json payload
      GetNvmfSubsystemsRequestBody params = gson.fromJson(payload, GetNvmfSubsystemsRequestBody.class);
      // do some modify to params(optional)
      List<NvmfSubsystem> result = api.getNvmfSubsystems("zh-CN", params);
      assertThat(result).as("check result of getNvmfSubsystems").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getNvmfSubsystemsConnection(String payload) {
    try {
      // parse params from json payload
      GetNvmfSubsystemsConnectionRequestBody params = gson.fromJson(payload, GetNvmfSubsystemsConnectionRequestBody.class);
      // do some modify to params(optional)
      NvmfSubsystemConnection result = api.getNvmfSubsystemsConnection("zh-CN", params);
      assertThat(result).as("check result of getNvmfSubsystemsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
