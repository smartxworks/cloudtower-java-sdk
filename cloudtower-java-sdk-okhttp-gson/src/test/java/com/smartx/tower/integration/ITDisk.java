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
import com.smartx.tower.api.DiskApi;
import com.smartx.tower.model.*;

public class ITDisk extends ITBase {
  DiskApi api = null;
  HashMap<String, Object> payloads = new HashMap<>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "payload")
  public void getDisks(String payload) {
    try {
      // parse params from json payload
      GetDisksRequestBody params = gson.fromJson(payload, new TypeToken<GetDisksRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<Disk> result = api.getDisks(params, contentLanguage);
      assertThat(result).as("check result of getDisks").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getDisksConnection(String payload) {
    try {
      // parse params from json payload
      GetDisksConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetDisksConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      DiskConnection result = api.getDisksConnection(params, contentLanguage);
      assertThat(result).as("check result of getDisksConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void mountDisk(String payload) {
    try {
      // parse params from json payload
      DiskMountParams params = gson.fromJson(payload, new TypeToken<DiskMountParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDisk> result = api.mountDisk(params, contentLanguage);
      assertThat(result).as("check result of mountDisk").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void unmountDisk(String payload) {
    try {
      // parse params from json payload
      DiskUnmountParams params = gson.fromJson(payload, new TypeToken<DiskUnmountParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDisk> result = api.unmountDisk(params, contentLanguage);
      assertThat(result).as("check result of unmountDisk").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
