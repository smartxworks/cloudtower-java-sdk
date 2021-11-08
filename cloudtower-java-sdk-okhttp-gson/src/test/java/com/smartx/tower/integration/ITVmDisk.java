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
import com.smartx.tower.api.VmDiskApi;
import com.smartx.tower.model.*;

public class ITVmDisk extends ITBase {
  VmDiskApi vmDiskApi = null;
  HashMap<String, Object> vmDiskPayloads = new HashMap<>();

  @DataProvider(name = "vmDiskPayload")
  Object[][] data(Method m) {
    Object payload = vmDiskPayloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    vmDiskApi = new VmDiskApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/VmDisk.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    vmDiskPayloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "vmDiskPayload")
  public void getVmDisks(String payload) {
    try {
      // parse params from json payload
      GetVmDisksRequestBody params = gson.fromJson(payload, new TypeToken<GetVmDisksRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<VmDisk> result = vmDiskApi.getVmDisks(params, contentLanguage);
      assertThat(result).as("check result of getVmDisks").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmDiskPayload")
  public void getVmDisksConnection(String payload) {
    try {
      // parse params from json payload
      GetVmDisksConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetVmDisksConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      VmDiskConnection result = vmDiskApi.getVmDisksConnection(params, contentLanguage);
      assertThat(result).as("check result of getVmDisksConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
