package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.VmPlacementGroupApi;
import com.smartx.tower.model.*;

public class ITVmPlacementGroup extends IT {
  VmPlacementGroupApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new VmPlacementGroupApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/VmPlacementGroup.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getVmPlacementGroups(String payload) {
    try {
      // parse params from json payload
      GetVmPlacementGroupsRequestBody params = gson.fromJson(payload, GetVmPlacementGroupsRequestBody.class);
      // do some modify to params(optional)
      List<VmPlacementGroup> result = api.getVmPlacementGroups("zh-CN", params);
      assertThat(result).as("check result of getVmPlacementGroups").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getVmPlacementGroupsConnection(String payload) {
    try {
      // parse params from json payload
      GetVmPlacementGroupsConnectionRequestBody params = gson.fromJson(payload, GetVmPlacementGroupsConnectionRequestBody.class);
      // do some modify to params(optional)
      VmPlacementGroupConnection result = api.getVmPlacementGroupsConnection("zh-CN", params);
      assertThat(result).as("check result of getVmPlacementGroupsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createVmPlacementGroup(String payload) {
    try {
      // parse params from json payload
      List<VmPlacementGroupCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskVmPlacementGroup> result = api.createVmPlacementGroup("zh-CN", params);
      assertThat(result).as("check result of createVmPlacementGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateVmPlacementGroup(String payload) {
    try {
      // parse params from json payload
      VmPlacementGroupUpdationParams params = gson.fromJson(payload, VmPlacementGroupUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskVmPlacementGroup> result = api.updateVmPlacementGroup("zh-CN", params);
      assertThat(result).as("check result of updateVmPlacementGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteVmPlacementGroup(String payload) {
    try {
      // parse params from json payload
      VmPlacementGroupDeletionParams params = gson.fromJson(payload, VmPlacementGroupDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteVmPlacementGroup> result = api.deleteVmPlacementGroup("zh-CN", params);
      assertThat(result).as("check result of deleteVmPlacementGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
