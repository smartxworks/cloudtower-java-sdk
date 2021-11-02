package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.VlanApi;
import com.smartx.tower.model.*;

public class ITVlan extends IT {
  VlanApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new VlanApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Vlan.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getVlans(String payload) {
    try {
      // parse params from json payload
      GetVlansRequestBody params = gson.fromJson(payload, GetVlansRequestBody.class);
      // do some modify to params(optional)
      List<Vlan> result = api.getVlans("zh-CN", params);
      assertThat(result).as("check result of getVlans").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getVlansConnection(String payload) {
    try {
      // parse params from json payload
      GetVlansConnectionRequestBody params = gson.fromJson(payload, GetVlansConnectionRequestBody.class);
      // do some modify to params(optional)
      VlanConnection result = api.getVlansConnection("zh-CN", params);
      assertThat(result).as("check result of getVlansConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createVmVlan(String payload) {
    try {
      // parse params from json payload
      List<VmVlanCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskVlan> result = api.createVmVlan("zh-CN", params);
      assertThat(result).as("check result of createVmVlan").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateManagementVlan(String payload) {
    try {
      // parse params from json payload
      ManagementVlanUpdationParams params = gson.fromJson(payload, ManagementVlanUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskVlan> result = api.updateManagementVlan("zh-CN", params);
      assertThat(result).as("check result of updateManagementVlan").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateMigrationVlan(String payload) {
    try {
      // parse params from json payload
      MigrationVlanUpdationParams params = gson.fromJson(payload, MigrationVlanUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskVlan> result = api.updateMigrationVlan("zh-CN", params);
      assertThat(result).as("check result of updateMigrationVlan").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateVlan(String payload) {
    try {
      // parse params from json payload
      VmVlanUpdationParams params = gson.fromJson(payload, VmVlanUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskVlan> result = api.updateVlan("zh-CN", params);
      assertThat(result).as("check result of updateVlan").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteVlan(String payload) {
    try {
      // parse params from json payload
      VlanDeletionParams params = gson.fromJson(payload, VlanDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteVlan> result = api.deleteVlan("zh-CN", params);
      assertThat(result).as("check result of deleteVlan").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
