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
import com.smartx.tower.api.SnapshotGroupApi;
import com.smartx.tower.model.*;

public class ITSnapshotGroup extends ITBase {
  SnapshotGroupApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "snapshotGroupPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "snapshotGroupPayload")
  public void cloneSnapshotGroup(String payload) {
    try {
      // parse params from json payload
      List<SnapshotGroupCloneParams> params = gson.fromJson(payload, new TypeToken<List<SnapshotGroupCloneParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskSnapshotGroup> result = api.cloneSnapshotGroup(params, contentLanguage);
      assertThat(result).as("check result of cloneSnapshotGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "snapshotGroupPayload")
  public void deleteSnapshotGroup(String payload) {
    try {
      // parse params from json payload
      SnapshotGroupDeletionParams params = gson.fromJson(payload, new TypeToken<SnapshotGroupDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteSnapshotGroup> result = api.deleteSnapshotGroup(params, contentLanguage);
      assertThat(result).as("check result of deleteSnapshotGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "snapshotGroupPayload")
  public void getSnapshotGroups(String payload) {
    try {
      // parse params from json payload
      GetSnapshotGroupsRequestBody params = gson.fromJson(payload, new TypeToken<GetSnapshotGroupsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<SnapshotGroup> result = api.getSnapshotGroups(params, contentLanguage);
      assertThat(result).as("check result of getSnapshotGroups").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "snapshotGroupPayload")
  public void getSnapshotGroupsConnection(String payload) {
    try {
      // parse params from json payload
      GetSnapshotGroupsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetSnapshotGroupsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      SnapshotGroupConnection result = api.getSnapshotGroupsConnection(params, contentLanguage);
      assertThat(result).as("check result of getSnapshotGroupsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "snapshotGroupPayload")
  public void keepSnapshotGroup(String payload) {
    try {
      // parse params from json payload
      SnapshotGroupKeepParams params = gson.fromJson(payload, new TypeToken<SnapshotGroupKeepParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskSnapshotGroup> result = api.keepSnapshotGroup(params, contentLanguage);
      assertThat(result).as("check result of keepSnapshotGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "snapshotGroupPayload")
  public void rollbackSnapshotGroup(String payload) {
    try {
      // parse params from json payload
      SnapshotGroupRollbackParams params = gson.fromJson(payload, new TypeToken<SnapshotGroupRollbackParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskSnapshotGroup> result = api.rollbackSnapshotGroup(params, contentLanguage);
      assertThat(result).as("check result of rollbackSnapshotGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
