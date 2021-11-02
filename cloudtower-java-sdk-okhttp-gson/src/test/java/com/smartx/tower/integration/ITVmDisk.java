package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.VmDiskApi;
import com.smartx.tower.model.*;

public class ITVmDisk extends IT {
  VmDiskApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new VmDiskApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/VmDisk.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getVmDisks(String payload) {
    try {
      // parse params from json payload
      GetVmDisksRequestBody params = gson.fromJson(payload, GetVmDisksRequestBody.class);
      // do some modify to params(optional)
      List<VmDisk> result = api.getVmDisks("zh-CN", params);
      assertThat(result).as("check result of getVmDisks").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getVmDisksConnection(String payload) {
    try {
      // parse params from json payload
      GetVmDisksConnectionRequestBody params = gson.fromJson(payload, GetVmDisksConnectionRequestBody.class);
      // do some modify to params(optional)
      VmDiskConnection result = api.getVmDisksConnection("zh-CN", params);
      assertThat(result).as("check result of getVmDisksConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
