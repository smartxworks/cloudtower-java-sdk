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
import com.smartx.tower.api.IscsiLunSnapshotApi;
import com.smartx.tower.model.*;

public class ITIscsiLunSnapshot extends ITBase {
  IscsiLunSnapshotApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "iscsiLunSnapshotPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new IscsiLunSnapshotApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/IscsiLunSnapshot.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "iscsiLunSnapshotPayload")
  public void createIscsiLunSnapshot(String payload) {
    try {
      // parse params from json payload
      List<IscsiLunSnapshotCreationParams> params = gson.fromJson(payload, new TypeToken<List<IscsiLunSnapshotCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskIscsiLunSnapshot> result = api.createIscsiLunSnapshot(params, contentLanguage);
      assertThat(result).as("check result of createIscsiLunSnapshot").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "iscsiLunSnapshotPayload")
  public void deleteIscsiLunSnapshot(String payload) {
    try {
      // parse params from json payload
      IscsiLunSnapshotDeletionParams params = gson.fromJson(payload, new TypeToken<IscsiLunSnapshotDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteIscsiLunSnapshot> result = api.deleteIscsiLunSnapshot(params, contentLanguage);
      assertThat(result).as("check result of deleteIscsiLunSnapshot").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "iscsiLunSnapshotPayload")
  public void getIscsiLunSnapshots(String payload) {
    try {
      // parse params from json payload
      GetIscsiLunSnapshotsRequestBody params = gson.fromJson(payload, new TypeToken<GetIscsiLunSnapshotsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<IscsiLunSnapshot> result = api.getIscsiLunSnapshots(params, contentLanguage);
      assertThat(result).as("check result of getIscsiLunSnapshots").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "iscsiLunSnapshotPayload")
  public void getIscsiLunSnapshotsConnection(String payload) {
    try {
      // parse params from json payload
      GetIscsiLunSnapshotsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetIscsiLunSnapshotsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      IscsiLunSnapshotConnection result = api.getIscsiLunSnapshotsConnection(params, contentLanguage);
      assertThat(result).as("check result of getIscsiLunSnapshotsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
