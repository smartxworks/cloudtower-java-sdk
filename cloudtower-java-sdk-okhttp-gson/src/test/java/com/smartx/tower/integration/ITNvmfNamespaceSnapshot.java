package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.NvmfNamespaceSnapshotApi;
import com.smartx.tower.model.*;

public class ITNvmfNamespaceSnapshot extends IT {
  NvmfNamespaceSnapshotApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getNvmfNamespaceSnapshots(String payload) {
    try {
      // parse params from json payload
      GetNvmfNamespaceSnapshotsRequestBody params = gson.fromJson(payload, GetNvmfNamespaceSnapshotsRequestBody.class);
      // do some modify to params(optional)
      List<NvmfNamespaceSnapshot> result = api.getNvmfNamespaceSnapshots("zh-CN", params);
      assertThat(result).as("check result of getNvmfNamespaceSnapshots").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getNvmfNamespaceSnapshotsConnection(String payload) {
    try {
      // parse params from json payload
      GetNvmfNamespaceSnapshotsConnectionRequestBody params = gson.fromJson(payload, GetNvmfNamespaceSnapshotsConnectionRequestBody.class);
      // do some modify to params(optional)
      NvmfNamespaceSnapshotConnection result = api.getNvmfNamespaceSnapshotsConnection("zh-CN", params);
      assertThat(result).as("check result of getNvmfNamespaceSnapshotsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createNvmfNamespaceSnapshot(String payload) {
    try {
      // parse params from json payload
      List<NvmfNamespaceSnapshotCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskNvmfNamespaceSnapshot> result = api.createNvmfNamespaceSnapshot("zh-CN", params);
      assertThat(result).as("check result of createNvmfNamespaceSnapshot").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteNvmfNamespaceSnapshot(String payload) {
    try {
      // parse params from json payload
      NvmfNamespaceSnapshotDeletionParams params = gson.fromJson(payload, NvmfNamespaceSnapshotDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteNvmfNamespaceSnapshot> result = api.deleteNvmfNamespaceSnapshot("zh-CN", params);
      assertThat(result).as("check result of deleteNvmfNamespaceSnapshot").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
