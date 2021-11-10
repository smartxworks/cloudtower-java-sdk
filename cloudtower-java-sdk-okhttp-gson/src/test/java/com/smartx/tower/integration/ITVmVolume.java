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
import com.smartx.tower.api.VmVolumeApi;
import com.smartx.tower.model.*;

public class ITVmVolume extends ITBase {
  VmVolumeApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "vmVolumePayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new VmVolumeApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/VmVolume.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "vmVolumePayload")
  public void createVmVolume(String payload) {
    try {
      // parse params from json payload
      List<VmVolumeCreationParams> params = gson.fromJson(payload, new TypeToken<List<VmVolumeCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskVmVolume> result = api.createVmVolume(params, contentLanguage);
      assertThat(result).as("check result of createVmVolume").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmVolumePayload")
  public void deleteVmVolumeFromVm(String payload) {
    try {
      // parse params from json payload
      VmVolumeDeletionParams params = gson.fromJson(payload, new TypeToken<VmVolumeDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteVmVolume> result = api.deleteVmVolumeFromVm(params, contentLanguage);
      assertThat(result).as("check result of deleteVmVolumeFromVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmVolumePayload")
  public void getVmVolumes(String payload) {
    try {
      // parse params from json payload
      GetVmVolumesRequestBody params = gson.fromJson(payload, new TypeToken<GetVmVolumesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<VmVolume> result = api.getVmVolumes(params, contentLanguage);
      assertThat(result).as("check result of getVmVolumes").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmVolumePayload")
  public void getVmVolumesConnection(String payload) {
    try {
      // parse params from json payload
      GetVmVolumesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetVmVolumesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      VmVolumeConnection result = api.getVmVolumesConnection(params, contentLanguage);
      assertThat(result).as("check result of getVmVolumesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
