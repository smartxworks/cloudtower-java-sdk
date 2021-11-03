package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.SnapshotGroupApi;
import com.smartx.tower.model.*;

public class ITSnapshotGroup extends IT {
  SnapshotGroupApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new SnapshotGroupApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/SnapshotGroup.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getSnapshotGroups(String payload) {
    try {
      // parse params from json payload
      GetSnapshotGroupsRequestBody params = gson.fromJson(payload, GetSnapshotGroupsRequestBody.class);
      // do some modify to params(optional)
      List<SnapshotGroup> result = api.getSnapshotGroups("zh-CN", params);
      assertThat(result).as("check result of getSnapshotGroups").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getSnapshotGroupsConnection(String payload) {
    try {
      // parse params from json payload
      GetSnapshotGroupsConnectionRequestBody params = gson.fromJson(payload, GetSnapshotGroupsConnectionRequestBody.class);
      // do some modify to params(optional)
      SnapshotGroupConnection result = api.getSnapshotGroupsConnection("zh-CN", params);
      assertThat(result).as("check result of getSnapshotGroupsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void cloneSnapshotGroup(String payload) {
    try {
      // parse params from json payload
      List<SnapshotGroupCloneParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskSnapshotGroup> result = api.cloneSnapshotGroup("zh-CN", params);
      assertThat(result).as("check result of cloneSnapshotGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void keepSnapshotGroup(String payload) {
    try {
      // parse params from json payload
      SnapshotGroupKeepParams params = gson.fromJson(payload, SnapshotGroupKeepParams.class);
      // do some modify to params(optional)
      List<WithTaskSnapshotGroup> result = api.keepSnapshotGroup("zh-CN", params);
      assertThat(result).as("check result of keepSnapshotGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void rollbackSnapshotGroup(String payload) {
    try {
      // parse params from json payload
      SnapshotGroupRollbackParams params = gson.fromJson(payload, SnapshotGroupRollbackParams.class);
      // do some modify to params(optional)
      List<WithTaskSnapshotGroup> result = api.rollbackSnapshotGroup("zh-CN", params);
      assertThat(result).as("check result of rollbackSnapshotGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteSnapshotGroup(String payload) {
    try {
      // parse params from json payload
      SnapshotGroupDeletionParams params = gson.fromJson(payload, SnapshotGroupDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteSnapshotGroup> result = api.deleteSnapshotGroup("zh-CN", params);
      assertThat(result).as("check result of deleteSnapshotGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
