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
import com.smartx.tower.api.ConsistencyGroupSnapshotApi;
import com.smartx.tower.model.*;

public class ITConsistencyGroupSnapshot extends ITBase {
  ConsistencyGroupSnapshotApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "consistencyGroupSnapshotPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "consistencyGroupSnapshotPayload")
  public void createConsistencyGroupSnapshot(String payload) {
    try {
      // parse params from json payload
      List<ConsistencyGroupSnapshotCreationParams> params = gson.fromJson(payload, new TypeToken<List<ConsistencyGroupSnapshotCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskConsistencyGroupSnapshot> result = api.createConsistencyGroupSnapshot(params, contentLanguage);
      assertThat(result).as("check result of createConsistencyGroupSnapshot").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "consistencyGroupSnapshotPayload")
  public void deleteConsistencyGroupSnapshot(String payload) {
    try {
      // parse params from json payload
      ConsistencyGroupSnapshotDeletionParams params = gson.fromJson(payload, new TypeToken<ConsistencyGroupSnapshotDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteConsistencyGroupSnapshot> result = api.deleteConsistencyGroupSnapshot(params, contentLanguage);
      assertThat(result).as("check result of deleteConsistencyGroupSnapshot").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "consistencyGroupSnapshotPayload")
  public void getConsistencyGroupSnapshots(String payload) {
    try {
      // parse params from json payload
      GetConsistencyGroupSnapshotsRequestBody params = gson.fromJson(payload, new TypeToken<GetConsistencyGroupSnapshotsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<ConsistencyGroupSnapshot> result = api.getConsistencyGroupSnapshots(params, contentLanguage);
      assertThat(result).as("check result of getConsistencyGroupSnapshots").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "consistencyGroupSnapshotPayload")
  public void getConsistencyGroupSnapshotsConnection(String payload) {
    try {
      // parse params from json payload
      GetConsistencyGroupSnapshotsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetConsistencyGroupSnapshotsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      ConsistencyGroupSnapshotConnection result = api.getConsistencyGroupSnapshotsConnection(params, contentLanguage);
      assertThat(result).as("check result of getConsistencyGroupSnapshotsConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "consistencyGroupSnapshotPayload")
  public void updateConsistencyGroupSnapshot(String payload) {
    try {
      // parse params from json payload
      ConsistencyGroupSnapshotUpdationParams params = gson.fromJson(payload, new TypeToken<ConsistencyGroupSnapshotUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskConsistencyGroupSnapshot> result = api.updateConsistencyGroupSnapshot(params, contentLanguage);
      assertThat(result).as("check result of updateConsistencyGroupSnapshot").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
