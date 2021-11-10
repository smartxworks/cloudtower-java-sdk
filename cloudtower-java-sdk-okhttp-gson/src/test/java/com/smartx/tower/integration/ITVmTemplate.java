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
import com.smartx.tower.api.VmApi;
import com.smartx.tower.api.VmTemplateApi;
import com.smartx.tower.model.*;

public class ITVmTemplate extends ITBase {
  VmTemplateApi api = null;
  VmApi vmApi = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  Cluster cluster = null;

  @DataProvider(name = "vmTemplatePayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException, ApiException {
    api = new VmTemplateApi(client);
    vmApi = new VmApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/VmTemplate.json");
    cluster = getData("defaultCluster", Cluster.class);
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {
    }.getType());
  }

  Vm vm = null;

  @BeforeMethod(groups = { "need_vm" })
  public void createVm() throws ApiException, IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException, InterruptedException {
    List<VmCreationParams> params = new ArrayList<>();
    Vlan vlan = getData("defaultVlan", Vlan.class);
    cluster = getData("defaultCluster", Cluster.class);
    params.add(new VmCreationParams().name("tower-api-test-snapshot-vm" + System.currentTimeMillis()).cpuCores(1.0)
        .cpuSockets(1.0).memory(4294967296.0).ha(true).vcpu(1.0).status(VmStatus.STOPPED).firmware(VmFirmware.BIOS)
        .clusterId(cluster.getId())
        .vmDisks(new VmDiskParams().addMountCdRomsItem(new VmCdRomParams().boot(1.0).index(1.0)))
        .addVmNicsItem(new VmNicParams().localId("").connectVlanId(vlan.getId())));
    vm = vmApi.createVm(params, contentLanguage).get(0).getData();
    waitForResourceAsyncStatus(new GetVmsRequestBody().where(new VmWhereInput().id(vm.getId())), vmApi, "getVms",
        new TypeToken<List<Vm>>() {
        }.getClass(), GetVmsRequestBody.class);
  }

  @AfterMethod(groups = { "need_vm" }, alwaysRun = true)
  public void deleteVm() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
      NoSuchMethodException, SecurityException, ApiException, InterruptedException {
    waitForResourceAsyncStatus(new GetVmsRequestBody().where(new VmWhereInput().id(vm.getId())), vmApi, "getVms",
        new TypeToken<List<Vm>>() {
        }.getClass(), GetVmsRequestBody.class);
    vmApi.deleteVm(new VmOperateParams().where(new VmWhereInput().id(vm.getId())), contentLanguage);
    waitForResourceDeletion(new GetVmsRequestBody().where(new VmWhereInput().id(vm.getId())), vmApi, "getVms",
        new TypeToken<List<Vm>>() {
        }.getClass(), GetVmsRequestBody.class);
  }

  @Test(groups = { "need_vm" })
  public void cloneVmTemplateFromVm() {
    try {
      // parse params from json payload
      List<VmTemplateCreationParams> params = new ArrayList<>();
      params.add(new VmTemplateCreationParams().name("tower-api-test-clone-vm-template" + System.currentTimeMillis())
          .clusterId(cluster.getId()).vmId(vm.getId()).cloudInitSupported(false));
      // do some modify to params(optional)
      List<WithTaskVmTemplate> result = api.cloneVmTemplateFromVm(params, contentLanguage);
      assertThat(result).as("check result of cloneVmTemplateFromVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmTemplatePayload")
  public void convertVmTemplateFromVm(String payload) {
    try {
      // parse params from json payload
      List<VmTemplateCreationParams> params = gson.fromJson(payload, new TypeToken<List<VmTemplateCreationParams>>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVmTemplate> result = api.convertVmTemplateFromVm(params, contentLanguage);
      assertThat(result).as("check result of convertVmTemplateFromVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmTemplatePayload")
  public void deleteVmTemplateFromVm(String payload) {
    try {
      // parse params from json payload
      VmTemplateDeletionParams params = gson.fromJson(payload, new TypeToken<VmTemplateDeletionParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteVmTemplate> result = api.deleteVmTemplateFromVm(params, contentLanguage);
      assertThat(result).as("check result of deleteVmTemplateFromVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmTemplatePayload")
  public void getVmTemplates(String payload) {
    try {
      // parse params from json payload
      GetVmTemplatesRequestBody params = gson.fromJson(payload, new TypeToken<GetVmTemplatesRequestBody>() {
      }.getType());
      // do some modify to params(optional)
      List<VmTemplate> result = api.getVmTemplates(params, contentLanguage);
      assertThat(result).as("check result of getVmTemplates").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmTemplatePayload")
  public void getVmTemplatesConnection(String payload) {
    try {
      // parse params from json payload
      GetVmTemplatesConnectionRequestBody params = gson.fromJson(payload,
          new TypeToken<GetVmTemplatesConnectionRequestBody>() {
          }.getType());
      // do some modify to params(optional)
      VmTemplateConnection result = api.getVmTemplatesConnection(params, contentLanguage);
      assertThat(result).as("check result of getVmTemplatesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmTemplatePayload")
  public void updateVmTemplateFromVm(String payload) {
    try {
      // parse params from json payload
      VmTemplateUpdationParams params = gson.fromJson(payload, new TypeToken<VmTemplateUpdationParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVmTemplate> result = api.updateVmTemplateFromVm(params, contentLanguage);
      assertThat(result).as("check result of updateVmTemplateFromVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
