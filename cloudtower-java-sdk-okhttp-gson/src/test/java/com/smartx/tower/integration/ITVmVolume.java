package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.VmVolumeApi;
import com.smartx.tower.model.*;

public class ITVmVolume extends IT {
  VmVolumeApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getVmVolumes(String payload) {
    try {
      // parse params from json payload
      GetVmVolumesRequestBody params = gson.fromJson(payload, GetVmVolumesRequestBody.class);
      // do some modify to params(optional)
      List<VmVolume> result = api.getVmVolumes("zh-CN", params);
      assertThat(result).as("check result of getVmVolumes").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getVmVolumesConnection(String payload) {
    try {
      // parse params from json payload
      GetVmVolumesConnectionRequestBody params = gson.fromJson(payload, GetVmVolumesConnectionRequestBody.class);
      // do some modify to params(optional)
      VmVolumeConnection result = api.getVmVolumesConnection("zh-CN", params);
      assertThat(result).as("check result of getVmVolumesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createVmVolume(String payload) {
    try {
      // parse params from json payload
      List<VmVolumeCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskVmVolume> result = api.createVmVolume("zh-CN", params);
      assertThat(result).as("check result of createVmVolume").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteVmVolumeFromVm(String payload) {
    try {
      // parse params from json payload
      VmVolumeDeletionParams params = gson.fromJson(payload, VmVolumeDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteVmVolume> result = api.deleteVmVolumeFromVm("zh-CN", params);
      assertThat(result).as("check result of deleteVmVolumeFromVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
