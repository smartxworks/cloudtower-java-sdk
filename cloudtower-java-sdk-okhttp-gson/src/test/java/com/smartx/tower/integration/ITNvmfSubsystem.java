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
import com.smartx.tower.api.NvmfSubsystemApi;
import com.smartx.tower.model.*;

public class ITNvmfSubsystem extends ITBase {
  NvmfSubsystemApi api = null;
  HashMap<String, Object> payloads = new HashMap<>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "payload")
  public void getNvmfSubsystems(String payload) {
    try {
      // parse params from json payload
      GetNvmfSubsystemsRequestBody params = gson.fromJson(payload, new TypeToken<GetNvmfSubsystemsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<NvmfSubsystem> result = api.getNvmfSubsystems(params, contentLanguage);
      assertThat(result).as("check result of getNvmfSubsystems").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getNvmfSubsystemsConnection(String payload) {
    try {
      // parse params from json payload
      GetNvmfSubsystemsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetNvmfSubsystemsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      NvmfSubsystemConnection result = api.getNvmfSubsystemsConnection(params, contentLanguage);
      assertThat(result).as("check result of getNvmfSubsystemsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
