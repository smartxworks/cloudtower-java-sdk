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
import com.smartx.tower.api.VmSnapshotApi;
import com.smartx.tower.model.*;

public class ITVmSnapshot extends ITBase {
  VmSnapshotApi vmSnapshotApi = null;
  HashMap<String, Object> vmSnapshotPayloads = new HashMap<>();

  @DataProvider(name = "vmSnapshotPayload")
  Object[][] data(Method m) {
    Object payload = vmSnapshotPayloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    vmSnapshotApi = new VmSnapshotApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/VmSnapshot.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    vmSnapshotPayloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "vmSnapshotPayload")
  public void createVmSnapshot(String payload) {
    try {
      // parse params from json payload
      VmSnapshotCreationParams params = gson.fromJson(payload, new TypeToken<VmSnapshotCreationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskVmSnapshot> result = vmSnapshotApi.createVmSnapshot(params, contentLanguage);
      assertThat(result).as("check result of createVmSnapshot").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmSnapshotPayload")
  public void deleteVmSnapshot(String payload) {
    try {
      // parse params from json payload
      VmSnapshotDeletionParams params = gson.fromJson(payload, new TypeToken<VmSnapshotDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteVmSnapshot> result = vmSnapshotApi.deleteVmSnapshot(params, contentLanguage);
      assertThat(result).as("check result of deleteVmSnapshot").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmSnapshotPayload")
  public void getVmSnapshots(String payload) {
    try {
      // parse params from json payload
      GetVmSnapshotsRequestBody params = gson.fromJson(payload, new TypeToken<GetVmSnapshotsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<VmSnapshot> result = vmSnapshotApi.getVmSnapshots(params, contentLanguage);
      assertThat(result).as("check result of getVmSnapshots").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmSnapshotPayload")
  public void getVmSnapshotsConnection(String payload) {
    try {
      // parse params from json payload
      GetVmSnapshotsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetVmSnapshotsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      VmSnapshotConnection result = vmSnapshotApi.getVmSnapshotsConnection(params, contentLanguage);
      assertThat(result).as("check result of getVmSnapshotsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
