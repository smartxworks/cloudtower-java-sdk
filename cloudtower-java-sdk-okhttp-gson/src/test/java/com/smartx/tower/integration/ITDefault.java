package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.DefaultApi;
import com.smartx.tower.model.*;

public class ITDefault extends IT {
  DefaultApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new DefaultApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Default.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void createNvmfSubsystem(String payload) {
    try {
      // parse params from json payload
      List<NvmfSubsystemCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskNvmfSubsystem> result = api.createNvmfSubsystem("zh-CN", params);
      assertThat(result).as("check result of createNvmfSubsystem").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateNvmfSubsystem(String payload) {
    try {
      // parse params from json payload
      NvmfSubsystemUpdationParams params = gson.fromJson(payload, NvmfSubsystemUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskNvmfSubsystem> result = api.updateNvmfSubsystem("zh-CN", params);
      assertThat(result).as("check result of updateNvmfSubsystem").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteNvmfSubsystem(String payload) {
    try {
      // parse params from json payload
      NvmfSubsystemDeletionParams params = gson.fromJson(payload, NvmfSubsystemDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteNvmfSubsystem> result = api.deleteNvmfSubsystem("zh-CN", params);
      assertThat(result).as("check result of deleteNvmfSubsystem").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
