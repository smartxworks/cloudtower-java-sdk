package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.VmTemplateApi;
import com.smartx.tower.model.*;

public class ITVmTemplate extends IT {
  VmTemplateApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new VmTemplateApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/VmTemplate.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getVmTemplates(String payload) {
    try {
      // parse params from json payload
      GetVmTemplatesRequestBody params = gson.fromJson(payload, GetVmTemplatesRequestBody.class);
      // do some modify to params(optional)
      List<VmTemplate> result = api.getVmTemplates("zh-CN", params);
      assertThat(result).as("check result of getVmTemplates").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getVmTemplatesConnection(String payload) {
    try {
      // parse params from json payload
      GetVmTemplatesConnectionRequestBody params = gson.fromJson(payload, GetVmTemplatesConnectionRequestBody.class);
      // do some modify to params(optional)
      VmTemplateConnection result = api.getVmTemplatesConnection("zh-CN", params);
      assertThat(result).as("check result of getVmTemplatesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateVmTemplateFromVm(String payload) {
    try {
      // parse params from json payload
      VmTemplateUpdationParams params = gson.fromJson(payload, VmTemplateUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskVmTemplate> result = api.updateVmTemplateFromVm("zh-CN", params);
      assertThat(result).as("check result of updateVmTemplateFromVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void cloneVmTemplateFromVm(String payload) {
    try {
      // parse params from json payload
      List<VmTemplateCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskVmTemplate> result = api.cloneVmTemplateFromVm("zh-CN", params);
      assertThat(result).as("check result of cloneVmTemplateFromVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void convertVmTemplateFromVm(String payload) {
    try {
      // parse params from json payload
      List<VmTemplateCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskVmTemplate> result = api.convertVmTemplateFromVm("zh-CN", params);
      assertThat(result).as("check result of convertVmTemplateFromVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteVmTemplateFromVm(String payload) {
    try {
      // parse params from json payload
      VmTemplateDeletionParams params = gson.fromJson(payload, VmTemplateDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteVmTemplate> result = api.deleteVmTemplateFromVm("zh-CN", params);
      assertThat(result).as("check result of deleteVmTemplateFromVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
