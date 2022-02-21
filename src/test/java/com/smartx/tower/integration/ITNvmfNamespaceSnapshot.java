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
import com.smartx.tower.api.NvmfNamespaceSnapshotApi;
import com.smartx.tower.model.*;

public class ITNvmfNamespaceSnapshot extends ITBase {
  NvmfNamespaceSnapshotApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "nvmfNamespaceSnapshotPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new NvmfNamespaceSnapshotApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/NvmfNamespaceSnapshot.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "nvmfNamespaceSnapshotPayload")
  public void createNvmfNamespaceSnapshot(String payload) {
    try {
      // parse params from json payload
      List<NvmfNamespaceSnapshotCreationParams> params = gson.fromJson(payload, new TypeToken<List<NvmfNamespaceSnapshotCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskNvmfNamespaceSnapshot> result = api.createNvmfNamespaceSnapshot(params);
      assertThat(result).as("check result of createNvmfNamespaceSnapshot").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "nvmfNamespaceSnapshotPayload")
  public void deleteNvmfNamespaceSnapshot(String payload) {
    try {
      // parse params from json payload
      NvmfNamespaceSnapshotDeletionParams params = gson.fromJson(payload, new TypeToken<NvmfNamespaceSnapshotDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteNvmfNamespaceSnapshot> result = api.deleteNvmfNamespaceSnapshot(params);
      assertThat(result).as("check result of deleteNvmfNamespaceSnapshot").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "nvmfNamespaceSnapshotPayload")
  public void getNvmfNamespaceSnapshots(String payload) {
    try {
      // parse params from json payload
      GetNvmfNamespaceSnapshotsRequestBody params = gson.fromJson(payload, new TypeToken<GetNvmfNamespaceSnapshotsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<NvmfNamespaceSnapshot> result = api.getNvmfNamespaceSnapshots(params);
      assertThat(result).as("check result of getNvmfNamespaceSnapshots").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "nvmfNamespaceSnapshotPayload")
  public void getNvmfNamespaceSnapshotsConnection(String payload) {
    try {
      // parse params from json payload
      GetNvmfNamespaceSnapshotsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetNvmfNamespaceSnapshotsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      NvmfNamespaceSnapshotConnection result = api.getNvmfNamespaceSnapshotsConnection(params);
      assertThat(result).as("check result of getNvmfNamespaceSnapshotsConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
