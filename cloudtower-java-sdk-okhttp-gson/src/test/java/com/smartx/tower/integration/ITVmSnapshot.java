package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.VmSnapshotApi;
import com.smartx.tower.model.*;

public class ITVmSnapshot extends IT {
  VmSnapshotApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new VmSnapshotApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/VmSnapshot.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getVmSnapshots(String payload) {
    try {
      // parse params from json payload
      GetVmSnapshotsRequestBody params = gson.fromJson(payload, GetVmSnapshotsRequestBody.class);
      // do some modify to params(optional)
      List<VmSnapshot> result = api.getVmSnapshots("zh-CN", params);
      assertThat(result).as("check result of getVmSnapshots").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getVmSnapshotsConnection(String payload) {
    try {
      // parse params from json payload
      GetVmSnapshotsConnectionRequestBody params = gson.fromJson(payload, GetVmSnapshotsConnectionRequestBody.class);
      // do some modify to params(optional)
      VmSnapshotConnection result = api.getVmSnapshotsConnection("zh-CN", params);
      assertThat(result).as("check result of getVmSnapshotsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createVmSnapshot(String payload) {
    try {
      // parse params from json payload
      VmSnapshotCreationParams params = gson.fromJson(payload, VmSnapshotCreationParams.class);
      // do some modify to params(optional)
      List<WithTaskVmSnapshot> result = api.createVmSnapshot("zh-CN", params);
      assertThat(result).as("check result of createVmSnapshot").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteVmSnapshot(String payload) {
    try {
      // parse params from json payload
      VmSnapshotDeletionParams params = gson.fromJson(payload, VmSnapshotDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteVmSnapshot> result = api.deleteVmSnapshot("zh-CN", params);
      assertThat(result).as("check result of deleteVmSnapshot").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
