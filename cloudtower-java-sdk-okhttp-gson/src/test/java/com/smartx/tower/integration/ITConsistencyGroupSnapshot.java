package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.ConsistencyGroupSnapshotApi;
import com.smartx.tower.model.*;

public class ITConsistencyGroupSnapshot extends IT {
  ConsistencyGroupSnapshotApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new ConsistencyGroupSnapshotApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/ConsistencyGroupSnapshot.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getConsistencyGroupSnapshots(String payload) {
    try {
      // parse params from json payload
      GetConsistencyGroupSnapshotsRequestBody params = gson.fromJson(payload, GetConsistencyGroupSnapshotsRequestBody.class);
      // do some modify to params(optional)
      List<ConsistencyGroupSnapshot> result = api.getConsistencyGroupSnapshots("zh-CN", params);
      assertThat(result).as("check result of getConsistencyGroupSnapshots").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getConsistencyGroupSnapshotsConnection(String payload) {
    try {
      // parse params from json payload
      GetConsistencyGroupSnapshotsConnectionRequestBody params = gson.fromJson(payload, GetConsistencyGroupSnapshotsConnectionRequestBody.class);
      // do some modify to params(optional)
      ConsistencyGroupSnapshotConnection result = api.getConsistencyGroupSnapshotsConnection("zh-CN", params);
      assertThat(result).as("check result of getConsistencyGroupSnapshotsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createConsistencyGroupSnapshot(String payload) {
    try {
      // parse params from json payload
      List<ConsistencyGroupSnapshotCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskConsistencyGroupSnapshot> result = api.createConsistencyGroupSnapshot("zh-CN", params);
      assertThat(result).as("check result of createConsistencyGroupSnapshot").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateConsistencyGroupSnapshot(String payload) {
    try {
      // parse params from json payload
      ConsistencyGroupSnapshotUpdationParams params = gson.fromJson(payload, ConsistencyGroupSnapshotUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskConsistencyGroupSnapshot> result = api.updateConsistencyGroupSnapshot("zh-CN", params);
      assertThat(result).as("check result of updateConsistencyGroupSnapshot").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteConsistencyGroupSnapshot(String payload) {
    try {
      // parse params from json payload
      ConsistencyGroupSnapshotDeletionParams params = gson.fromJson(payload, ConsistencyGroupSnapshotDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteConsistencyGroupSnapshot> result = api.deleteConsistencyGroupSnapshot("zh-CN", params);
      assertThat(result).as("check result of deleteConsistencyGroupSnapshot").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
