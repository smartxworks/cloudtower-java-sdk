package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.DiskApi;
import com.smartx.tower.model.*;

public class ITDisk extends IT {
  DiskApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new DiskApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Disk.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getDisks(String payload) {
    try {
      // parse params from json payload
      GetDisksRequestBody params = gson.fromJson(payload, GetDisksRequestBody.class);
      // do some modify to params(optional)
      List<Disk> result = api.getDisks("zh-CN", params);
      assertThat(result).as("check result of getDisks").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getDisksConnection(String payload) {
    try {
      // parse params from json payload
      GetDisksConnectionRequestBody params = gson.fromJson(payload, GetDisksConnectionRequestBody.class);
      // do some modify to params(optional)
      DiskConnection result = api.getDisksConnection("zh-CN", params);
      assertThat(result).as("check result of getDisksConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void mountDisk(String payload) {
    try {
      // parse params from json payload
      DiskMountParams params = gson.fromJson(payload, DiskMountParams.class);
      // do some modify to params(optional)
      List<WithTaskDisk> result = api.mountDisk("zh-CN", params);
      assertThat(result).as("check result of mountDisk").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void unmountDisk(String payload) {
    try {
      // parse params from json payload
      DiskUnmountParams params = gson.fromJson(payload, DiskUnmountParams.class);
      // do some modify to params(optional)
      List<WithTaskDisk> result = api.unmountDisk("zh-CN", params);
      assertThat(result).as("check result of unmountDisk").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
