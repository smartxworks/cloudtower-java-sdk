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
import com.smartx.tower.api.VlanApi;
import com.smartx.tower.model.*;

public class ITVlan extends ITBase {
  VlanApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "vlanPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "vlanPayload")
  public void createVmVlan(String payload) {
    try {
      // parse params from json payload
      List<VmVlanCreationParams> params = gson.fromJson(payload, new TypeToken<List<VmVlanCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskVlan> result = api.createVmVlan(params, contentLanguage);
      assertThat(result).as("check result of createVmVlan").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vlanPayload")
  public void deleteVlan(String payload) {
    try {
      // parse params from json payload
      VlanDeletionParams params = gson.fromJson(payload, new TypeToken<VlanDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteVlan> result = api.deleteVlan(params, contentLanguage);
      assertThat(result).as("check result of deleteVlan").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vlanPayload")
  public void getVlans(String payload) {
    try {
      // parse params from json payload
      GetVlansRequestBody params = gson.fromJson(payload, new TypeToken<GetVlansRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<Vlan> result = api.getVlans(params, contentLanguage);
      assertThat(result).as("check result of getVlans").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vlanPayload")
  public void getVlansConnection(String payload) {
    try {
      // parse params from json payload
      GetVlansConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetVlansConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      VlanConnection result = api.getVlansConnection(params, contentLanguage);
      assertThat(result).as("check result of getVlansConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vlanPayload")
  public void updateManagementVlan(String payload) {
    try {
      // parse params from json payload
      ManagementVlanUpdationParams params = gson.fromJson(payload, new TypeToken<ManagementVlanUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskVlan> result = api.updateManagementVlan(params, contentLanguage);
      assertThat(result).as("check result of updateManagementVlan").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vlanPayload")
  public void updateMigrationVlan(String payload) {
    try {
      // parse params from json payload
      MigrationVlanUpdationParams params = gson.fromJson(payload, new TypeToken<MigrationVlanUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskVlan> result = api.updateMigrationVlan(params, contentLanguage);
      assertThat(result).as("check result of updateMigrationVlan").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vlanPayload")
  public void updateVlan(String payload) {
    try {
      // parse params from json payload
      VmVlanUpdationParams params = gson.fromJson(payload, new TypeToken<VmVlanUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskVlan> result = api.updateVlan(params, contentLanguage);
      assertThat(result).as("check result of updateVlan").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
