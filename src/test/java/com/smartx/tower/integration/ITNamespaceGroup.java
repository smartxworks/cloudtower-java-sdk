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
import com.smartx.tower.api.NamespaceGroupApi;
import com.smartx.tower.model.*;

public class ITNamespaceGroup extends ITBase {
  NamespaceGroupApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "namespaceGroupPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new NamespaceGroupApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/NamespaceGroup.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "namespaceGroupPayload")
  public void createNamespaceGroup(String payload) {
    try {
      // parse params from json payload
      List<NamespaceGroupCreationParams> params = gson.fromJson(payload, new TypeToken<List<NamespaceGroupCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskNamespaceGroup> result = api.createNamespaceGroup(params);
      assertThat(result).as("check result of createNamespaceGroup").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "namespaceGroupPayload")
  public void deleteNamespaceGroup(String payload) {
    try {
      // parse params from json payload
      NamespaceGroupDeletionParams params = gson.fromJson(payload, new TypeToken<NamespaceGroupDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteNamespaceGroup> result = api.deleteNamespaceGroup(params);
      assertThat(result).as("check result of deleteNamespaceGroup").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "namespaceGroupPayload")
  public void getNamespaceGroups(String payload) {
    try {
      // parse params from json payload
      GetNamespaceGroupsRequestBody params = gson.fromJson(payload, new TypeToken<GetNamespaceGroupsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<NamespaceGroup> result = api.getNamespaceGroups(params);
      assertThat(result).as("check result of getNamespaceGroups").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "namespaceGroupPayload")
  public void getNamespaceGroupsConnection(String payload) {
    try {
      // parse params from json payload
      GetNamespaceGroupsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetNamespaceGroupsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      NamespaceGroupConnection result = api.getNamespaceGroupsConnection(params);
      assertThat(result).as("check result of getNamespaceGroupsConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "namespaceGroupPayload")
  public void updateNamespaceGroup(String payload) {
    try {
      // parse params from json payload
      NamespaceGroupUpdationParams params = gson.fromJson(payload, new TypeToken<NamespaceGroupUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskNamespaceGroup> result = api.updateNamespaceGroup(params);
      assertThat(result).as("check result of updateNamespaceGroup").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
