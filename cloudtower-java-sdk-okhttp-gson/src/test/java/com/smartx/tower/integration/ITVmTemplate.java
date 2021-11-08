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
import com.smartx.tower.api.VmTemplateApi;
import com.smartx.tower.model.*;

public class ITVmTemplate extends ITBase {
  VmTemplateApi vmTemplateApi = null;
  HashMap<String, Object> vmTemplatePayloads = new HashMap<>();

  @DataProvider(name = "vmTemplatePayload")
  Object[][] data(Method m) {
    Object payload = vmTemplatePayloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    vmTemplateApi = new VmTemplateApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/VmTemplate.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    vmTemplatePayloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "vmTemplatePayload")
  public void cloneVmTemplateFromVm(String payload) {
    try {
      // parse params from json payload
      List<VmTemplateCreationParams> params = gson.fromJson(payload, new TypeToken<List<VmTemplateCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskVmTemplate> result = vmTemplateApi.cloneVmTemplateFromVm(params, contentLanguage);
      assertThat(result).as("check result of cloneVmTemplateFromVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmTemplatePayload")
  public void convertVmTemplateFromVm(String payload) {
    try {
      // parse params from json payload
      List<VmTemplateCreationParams> params = gson.fromJson(payload, new TypeToken<List<VmTemplateCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskVmTemplate> result = vmTemplateApi.convertVmTemplateFromVm(params, contentLanguage);
      assertThat(result).as("check result of convertVmTemplateFromVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmTemplatePayload")
  public void deleteVmTemplateFromVm(String payload) {
    try {
      // parse params from json payload
      VmTemplateDeletionParams params = gson.fromJson(payload, new TypeToken<VmTemplateDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteVmTemplate> result = vmTemplateApi.deleteVmTemplateFromVm(params, contentLanguage);
      assertThat(result).as("check result of deleteVmTemplateFromVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmTemplatePayload")
  public void getVmTemplates(String payload) {
    try {
      // parse params from json payload
      GetVmTemplatesRequestBody params = gson.fromJson(payload, new TypeToken<GetVmTemplatesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<VmTemplate> result = vmTemplateApi.getVmTemplates(params, contentLanguage);
      assertThat(result).as("check result of getVmTemplates").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmTemplatePayload")
  public void getVmTemplatesConnection(String payload) {
    try {
      // parse params from json payload
      GetVmTemplatesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetVmTemplatesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      VmTemplateConnection result = vmTemplateApi.getVmTemplatesConnection(params, contentLanguage);
      assertThat(result).as("check result of getVmTemplatesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmTemplatePayload")
  public void updateVmTemplateFromVm(String payload) {
    try {
      // parse params from json payload
      VmTemplateUpdationParams params = gson.fromJson(payload, new TypeToken<VmTemplateUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskVmTemplate> result = vmTemplateApi.updateVmTemplateFromVm(params, contentLanguage);
      assertThat(result).as("check result of updateVmTemplateFromVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
