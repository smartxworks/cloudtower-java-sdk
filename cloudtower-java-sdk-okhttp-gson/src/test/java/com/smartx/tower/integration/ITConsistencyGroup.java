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
import com.smartx.tower.api.ConsistencyGroupApi;
import com.smartx.tower.model.*;

public class ITConsistencyGroup extends ITBase {
  ConsistencyGroupApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "consistencyGroupPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new ConsistencyGroupApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/ConsistencyGroup.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "consistencyGroupPayload")
  public void createConsistencyGroup(String payload) {
    try {
      // parse params from json payload
      List<ConsistencyGroupCreationParams> params = gson.fromJson(payload, new TypeToken<List<ConsistencyGroupCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskConsistencyGroup> result = api.createConsistencyGroup(params, contentLanguage);
      assertThat(result).as("check result of createConsistencyGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "consistencyGroupPayload")
  public void deleteConsistencyGroup(String payload) {
    try {
      // parse params from json payload
      ConsistencyGroupDeletionParams params = gson.fromJson(payload, new TypeToken<ConsistencyGroupDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteConsistencyGroup> result = api.deleteConsistencyGroup(params, contentLanguage);
      assertThat(result).as("check result of deleteConsistencyGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "consistencyGroupPayload")
  public void getConsistencyGroups(String payload) {
    try {
      // parse params from json payload
      GetConsistencyGroupsRequestBody params = gson.fromJson(payload, new TypeToken<GetConsistencyGroupsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<ConsistencyGroup> result = api.getConsistencyGroups(params, contentLanguage);
      assertThat(result).as("check result of getConsistencyGroups").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "consistencyGroupPayload")
  public void getConsistencyGroupsConnection(String payload) {
    try {
      // parse params from json payload
      GetConsistencyGroupsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetConsistencyGroupsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      ConsistencyGroupConnection result = api.getConsistencyGroupsConnection(params, contentLanguage);
      assertThat(result).as("check result of getConsistencyGroupsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "consistencyGroupPayload")
  public void updateConsistencyGroup(String payload) {
    try {
      // parse params from json payload
      ConsistencyGroupUpdationParams params = gson.fromJson(payload, new TypeToken<ConsistencyGroupUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskConsistencyGroup> result = api.updateConsistencyGroup(params, contentLanguage);
      assertThat(result).as("check result of updateConsistencyGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
