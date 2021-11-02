package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.IscsiLunSnapshotApi;
import com.smartx.tower.model.*;

public class ITIscsiLunSnapshot extends IT {
  IscsiLunSnapshotApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getIscsiLunSnapshots(String payload) {
    try {
      // parse params from json payload
      GetIscsiLunSnapshotsRequestBody params = gson.fromJson(payload, GetIscsiLunSnapshotsRequestBody.class);
      // do some modify to params(optional)
      List<IscsiLunSnapshot> result = api.getIscsiLunSnapshots("zh-CN", params);
      assertThat(result).as("check result of getIscsiLunSnapshots").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getIscsiLunSnapshotsConnection(String payload) {
    try {
      // parse params from json payload
      GetIscsiLunSnapshotsConnectionRequestBody params = gson.fromJson(payload, GetIscsiLunSnapshotsConnectionRequestBody.class);
      // do some modify to params(optional)
      IscsiLunSnapshotConnection result = api.getIscsiLunSnapshotsConnection("zh-CN", params);
      assertThat(result).as("check result of getIscsiLunSnapshotsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createIscsiLunSnapshot(String payload) {
    try {
      // parse params from json payload
      List<IscsiLunSnapshotCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskIscsiLunSnapshot> result = api.createIscsiLunSnapshot("zh-CN", params);
      assertThat(result).as("check result of createIscsiLunSnapshot").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteIscsiLunSnapshot(String payload) {
    try {
      // parse params from json payload
      IscsiLunSnapshotDeletionParams params = gson.fromJson(payload, IscsiLunSnapshotDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteIscsiLunSnapshot> result = api.deleteIscsiLunSnapshot("zh-CN", params);
      assertThat(result).as("check result of deleteIscsiLunSnapshot").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
