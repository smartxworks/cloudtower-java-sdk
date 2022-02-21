package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.VmPlacementGroupApi;
import com.smartx.tower.model.*;

public class ITVmPlacementGroup extends ITBase {
  VmPlacementGroupApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  Cluster cluster = null;

  @DataProvider(name = "vmPlacementGroupPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException, ApiException {
    api = new VmPlacementGroupApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/VmPlacementGroup.json");
    cluster = getData("defaultCluster", Cluster.class);
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {
    }.getType());
  }

  @Test(dataProvider = "vmPlacementGroupPayload")
  public void createAndDeleteVmPlacementGroup(String payload) throws IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException, InterruptedException {
    try {
      // parse params from json payload
      List<VmPlacementGroupCreationParams> params = new ArrayList<>();
      params.add(new VmPlacementGroupCreationParams().clusterId(cluster.getId())
          .name("tower-sdk-test-vm-placement-group" + System.currentTimeMillis()).vmVmPolicy(VmVmPolicy.PREFER_SAME)
          .vmVmPolicyEnabled(true).enabled(true).vmHostPreferPolicy(false).vmHostMustEnabled(false)
          .vmHostMustPolicy(false).vmHostPreferEnabled(false));
      // do some modify to params(optional)
      List<WithTaskVmPlacementGroup> result = api.createVmPlacementGroup(params);
      VmPlacementGroup vmPlacementGroup = result.get(0).getData();
      waitForTaskSucceed(result.get(0).getTaskId());
      waitForTaskSucceed(api.deleteVmPlacementGroup(
          new VmPlacementGroupDeletionParams().where(new VmPlacementGroupWhereInput().id(vmPlacementGroup.getId()))).get(0).getTaskId());
      assertThat(result).as("check result of createVmPlacementGroup").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPlacementGroupPayload")
  public void getVmPlacementGroups(String payload) {
    try {
      // parse params from json payload
      GetVmPlacementGroupsRequestBody params = gson.fromJson(payload, new TypeToken<GetVmPlacementGroupsRequestBody>() {
      }.getType());
      // do some modify to params(optional)
      List<VmPlacementGroup> result = api.getVmPlacementGroups(params);
      assertThat(result).as("check result of getVmPlacementGroups").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPlacementGroupPayload")
  public void getVmPlacementGroupsConnection(String payload) {
    try {
      // parse params from json payload
      GetVmPlacementGroupsConnectionRequestBody params = gson.fromJson(payload,
          new TypeToken<GetVmPlacementGroupsConnectionRequestBody>() {
          }.getType());
      // do some modify to params(optional)
      VmPlacementGroupConnection result = api.getVmPlacementGroupsConnection(params);
      assertThat(result).as("check result of getVmPlacementGroupsConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  VmPlacementGroup placementGroup = null;

  @BeforeMethod(onlyForGroups = { "need_vm_placement_group" })
  public void createVmPlacementGroup() throws InterruptedException, ApiException, IllegalAccessException,
      IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
    List<VmPlacementGroupCreationParams> params = new ArrayList<>();
    params.add(new VmPlacementGroupCreationParams().clusterId(cluster.getId())
        .name("tower-sdk-test-vm-placement-group" + System.currentTimeMillis()).vmVmPolicy(VmVmPolicy.PREFER_SAME)
        .vmVmPolicyEnabled(true).enabled(true).vmHostPreferPolicy(false).vmHostMustEnabled(false)
        .vmHostMustPolicy(false).vmHostPreferEnabled(false));
    List<WithTaskVmPlacementGroup> result = api.createVmPlacementGroup(params);
    placementGroup = result.get(0).getData();
    waitForTaskSucceed(result.get(0).getTaskId());
  }

  @AfterMethod(onlyForGroups = { "need_vm_placement_group" })
  public void deleteVmPlacementGroup() throws InterruptedException, ApiException, IllegalAccessException,
      IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
    waitForResourceAsyncStatus(
        new GetVmPlacementGroupsRequestBody().where(new VmPlacementGroupWhereInput().id(placementGroup.getId())), api,
        "getVmPlacementGroups", (new TypeToken<List<VmCreationParams>>() {
        }.getClass()), GetVmPlacementGroupsRequestBody.class);
    waitForTaskSucceed(api.deleteVmPlacementGroup(
        new VmPlacementGroupDeletionParams().where(new VmPlacementGroupWhereInput().id(placementGroup.getId()))).get(0).getTaskId());
    placementGroup = null;
  }

  @Test(dataProvider = "vmPlacementGroupPayload", groups = { "need_vm_placement_group" })
  public void updateVmPlacementGroup(String payload) {
    try {
      // parse params from json payload
      VmPlacementGroupUpdationParams params = gson.fromJson(payload, new TypeToken<VmPlacementGroupUpdationParams>() {
      }.getType());
      params.where(new VmPlacementGroupWhereInput().id(placementGroup.getId()))
          .data(new VmPlacementGroupUpdationParamsData().description("vm_placement_group_api_test"));
      // do some modify to params(optional)
      List<WithTaskVmPlacementGroup> result = api.updateVmPlacementGroup(params);
      assertThat(result).as("check result of updateVmPlacementGroup").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
