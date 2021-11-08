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
import com.smartx.tower.api.VmPlacementGroupApi;
import com.smartx.tower.model.*;

public class ITVmPlacementGroup extends ITBase {
  VmPlacementGroupApi vmPlacementGroupApi = null;
  HashMap<String, Object> vmPlacementGroupPayloads = new HashMap<>();

  @DataProvider(name = "vmPlacementGroupPayload")
  Object[][] data(Method m) {
    Object payload = vmPlacementGroupPayloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    vmPlacementGroupApi = new VmPlacementGroupApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/VmPlacementGroup.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    vmPlacementGroupPayloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "vmPlacementGroupPayload")
  public void createVmPlacementGroup(String payload) {
    try {
      // parse params from json payload
      List<VmPlacementGroupCreationParams> params = gson.fromJson(payload, new TypeToken<List<VmPlacementGroupCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskVmPlacementGroup> result = vmPlacementGroupApi.createVmPlacementGroup(params, contentLanguage);
      assertThat(result).as("check result of createVmPlacementGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPlacementGroupPayload")
  public void deleteVmPlacementGroup(String payload) {
    try {
      // parse params from json payload
      VmPlacementGroupDeletionParams params = gson.fromJson(payload, new TypeToken<VmPlacementGroupDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteVmPlacementGroup> result = vmPlacementGroupApi.deleteVmPlacementGroup(params, contentLanguage);
      assertThat(result).as("check result of deleteVmPlacementGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPlacementGroupPayload")
  public void getVmPlacementGroups(String payload) {
    try {
      // parse params from json payload
      GetVmPlacementGroupsRequestBody params = gson.fromJson(payload, new TypeToken<GetVmPlacementGroupsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<VmPlacementGroup> result = vmPlacementGroupApi.getVmPlacementGroups(params, contentLanguage);
      assertThat(result).as("check result of getVmPlacementGroups").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPlacementGroupPayload")
  public void getVmPlacementGroupsConnection(String payload) {
    try {
      // parse params from json payload
      GetVmPlacementGroupsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetVmPlacementGroupsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      VmPlacementGroupConnection result = vmPlacementGroupApi.getVmPlacementGroupsConnection(params, contentLanguage);
      assertThat(result).as("check result of getVmPlacementGroupsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPlacementGroupPayload")
  public void updateVmPlacementGroup(String payload) {
    try {
      // parse params from json payload
      VmPlacementGroupUpdationParams params = gson.fromJson(payload, new TypeToken<VmPlacementGroupUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskVmPlacementGroup> result = vmPlacementGroupApi.updateVmPlacementGroup(params, contentLanguage);
      assertThat(result).as("check result of updateVmPlacementGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
