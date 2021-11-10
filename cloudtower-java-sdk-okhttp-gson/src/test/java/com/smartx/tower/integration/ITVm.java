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
import com.smartx.tower.api.HostApi;
import com.smartx.tower.api.VmApi;
import com.smartx.tower.model.*;

public class ITVm extends ITBase {
  Cluster cluster = null;

  VmApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "vmPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException, ApiException {
    api = new VmApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Vm.json");
    cluster = getData("defaultCluster", Cluster.class);
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {
    }.getType());
  }

  // #region base api
  @Test(dataProvider = "vmPayload", groups = { "base" })
  public void createAndDeleteVm(String payload) throws IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException {
    try {
      // parse params from json payload
      Vlan vlan = getData("defaultVlan", Vlan.class);
      List<VmCreationParams> params = gson.fromJson(payload, new TypeToken<List<VmCreationParams>>() {
      }.getType());
      params.get(0).setClusterId(cluster.getId());
      params.get(0).addVmNicsItem(new VmNicParams().connectVlanId(vlan.getId()).localId(""));
      // do some modify to params(optional)
      List<WithTaskVm> result = api.createVm(params, contentLanguage);
      assertThat(result).as("check result of createVm").isNotNull();
      Vm createdVm = result.get(0).getData();
      waitForVmEntityAsyncStatus(createdVm.getId(), api);
      api.deleteVm(new VmOperateParams().where(new VmWhereInput().id(createdVm.getId())), contentLanguage);
      waitForResourceDeletion(new GetVmsRequestBody().where(new VmWhereInput().id(createdVm.getId())), api, "getVms",
          new TypeToken<List<Vm>>() {
          }.getClass(), GetVmsRequestBody.class);
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }
  // #endregion base

  // #region stopped vm operation

  Vm stoppedVm = null;

  @BeforeMethod(onlyForGroups = { "stopped_vm_operation" })
  public void createStoppedVm() throws ApiException {
    List<VmCreationParams> params = new ArrayList<>();
    Vlan vlan = getData("defaultVlan", Vlan.class);
    params.add(new VmCreationParams().name("tower-api-test-stopped-vm" + System.currentTimeMillis()).cpuCores(1.0)
        .cpuSockets(1.0).memory(4294967296.0).ha(true).vcpu(1.0).status(VmStatus.STOPPED).firmware(VmFirmware.BIOS)
        .clusterId(cluster.getId())
        .vmDisks(new VmDiskParams().addMountCdRomsItem(new VmCdRomParams().boot(1.0).index(1.0)))
        .addVmNicsItem(new VmNicParams().localId("").connectVlanId(vlan.getId())));
    stoppedVm = api.createVm(params, contentLanguage).get(0).getData();
    waitForVmEntityAsyncStatus(stoppedVm.getId(), api);
  }

  @AfterMethod(onlyForGroups = { "stopped_vm_operation" })
  public void removeStoppedVm() throws ApiException, IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException {
    waitForVmEntityAsyncStatus(stoppedVm.getId(), api);
    VmOperateParams params = new VmOperateParams().where(new VmWhereInput().id(stoppedVm.getId()));
    api.deleteVm(params, contentLanguage);
    waitForResourceDeletion(new GetVmsRequestBody().where(new VmWhereInput().id(stoppedVm.getId())), api, "getVms",
        new TypeToken<List<Vm>>() {
        }.getClass(), GetVmsRequestBody.class);
    stoppedVm = null;
  }

  @Test(dataProvider = "vmPayload", groups = { "stopped_vm_operation" })
  public void cloneVm(String payload) throws IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException {
    try {
      // parse params from json payload
      List<VmCloneParams> params = gson.fromJson(payload, new TypeToken<List<VmCloneParams>>() {
      }.getType());
      params.get(0).srcVmId(stoppedVm.getId()).clusterId(cluster.getId());
      // do some modify to params(optional)
      List<WithTaskVm> result = api.cloneVm(params, contentLanguage);
      assertThat(result).as("check result of cloneVm").isNotNull();
      Vm clonedVm = result.get(0).getData();
      waitForVmEntityAsyncStatus(clonedVm.getId(), api);
      api.deleteVm(new VmOperateParams().where(new VmWhereInput().id(clonedVm.getId())), contentLanguage);
      waitForResourceDeletion(new GetVmsRequestBody().where(new VmWhereInput().id(clonedVm.getId())), api, "getVms",
          new TypeToken<List<Vm>>() {
          }.getClass(), GetVmsRequestBody.class);
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload", groups = { "stopped_vm_operation" })
  public void startVm(String payload) {
    try {
      // parse params from json payload
      VmStartParams params = gson.fromJson(payload, new TypeToken<VmStartParams>() {
      }.getType());
      params.where(new VmWhereInput().id(stoppedVm.getId()));
      // do some modify to params(optional)
      List<WithTaskVm> result = api.startVm(params, contentLanguage);
      assertThat(result).as("check result of startVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload", groups = { "stopped_vm_operation" })
  public void updateVm(String payload) {
    try {
      // parse params from json payload
      VmUpdateParams params = gson.fromJson(payload, new TypeToken<VmUpdateParams>() {
      }.getType());
      params.where(new VmWhereInput().id(stoppedVm.getId()));
      // do some modify to params(optional)
      List<WithTaskVm> result = api.updateVm(params, contentLanguage);
      assertThat(result).as("check result of updateVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload", groups = { "stopped_vm_operation" })
  public void migRateVm(String payload) {
    try {
      NameIdPair vmhost = stoppedVm.getHost();
      Host host = new HostApi(client)
          .getHosts(new GetHostsRequestBody().where(new HostWhereInput().idNot(vmhost != null ? vmhost.getId() : null)
              .cluster(new ClusterWhereInput().id(cluster.getId()))), contentLanguage)
          .get(0);
      // parse params from json payload
      VmMigrateParams params = gson.fromJson(payload, new TypeToken<VmMigrateParams>() {
      }.getType());
      params.where(new VmWhereInput().id(stoppedVm.getId())).data(new VmStartParamsData().hostId(host.getId()));
      // do some modify to params(optional)
      List<WithTaskVm> result = api.migRateVm(params, contentLanguage);
      assertThat(result).as("check result of migRateVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  // #endregion stopped vm operation
  // #region running vm operation
  Vm runningVM = null;

  @BeforeMethod(onlyForGroups = { "running_vm_operation" })
  public void createRunningVm() throws ApiException {
    List<VmCreationParams> params = new ArrayList<>();
    Vlan vlan = getData("defaultVlan", Vlan.class);
    params.add(new VmCreationParams().name("tower-api-test-running-vm" + System.currentTimeMillis()).cpuCores(1.0)
        .cpuSockets(1.0).memory(4294967296.0).ha(true).vcpu(1.0).status(VmStatus.RUNNING).firmware(VmFirmware.BIOS)
        .clusterId(cluster.getId())
        .vmDisks(new VmDiskParams().addMountCdRomsItem(new VmCdRomParams().boot(1.0).index(1.0)))
        .addVmNicsItem(new VmNicParams().localId("").connectVlanId(vlan.getId())));
    runningVM = api.createVm(params, contentLanguage).get(0).getData();
    waitForVmEntityAsyncStatus(runningVM.getId(), api);
  }

  @AfterMethod(onlyForGroups = { "running_vm_operation" })
  public void removeRunningVm() throws ApiException, IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException {
    waitForVmEntityAsyncStatus(runningVM.getId(), api);
    VmOperateParams params = new VmOperateParams().where(new VmWhereInput().id(runningVM.getId()));
    api.deleteVm(params, contentLanguage);
    waitForResourceDeletion(new GetVmsRequestBody().where(new VmWhereInput().id(runningVM.getId())), api, "getVms",
        new TypeToken<List<Vm>>() {
        }.getClass(), GetVmsRequestBody.class);
    runningVM = null;
  }

  @Test(dataProvider = "vmPayload", groups = { "running_vm_operation" })
  public void restartVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, new TypeToken<VmOperateParams>() {
      }.getType());
      params.where(new VmWhereInput().id(runningVM.getId()));
      // do some modify to params(optional)
      List<WithTaskVm> result = api.restartVm(params, contentLanguage);
      assertThat(result).as("check result of restartVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload", groups = { "running_vm_operation" })
  public void suspendAndResumeVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, new TypeToken<VmOperateParams>() {
      }.getType());
      params.where(new VmWhereInput().id(runningVM.getId()));
      api.suspendVm(params, contentLanguage);
      waitForVmEntityAsyncStatus(runningVM.getId(), api);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.resumeVm(params, contentLanguage);
      assertThat(result).as("check result of suspend and resume vm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload", groups = { "running_vm_operation" })
  public void forceRestartVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, new TypeToken<VmOperateParams>() {
      }.getType());
      params.where(new VmWhereInput().id(runningVM.getId()));
      // do some modify to params(optional)
      List<WithTaskVm> result = api.forceRestartVm(params, contentLanguage);
      assertThat(result).as("check result of forceRestartVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload", groups = { "running_vm_operation" })
  public void forceShutDownVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, new TypeToken<VmOperateParams>() {
      }.getType());
      params.where(new VmWhereInput().id(runningVM.getId()));
      // do some modify to params(optional)
      List<WithTaskVm> result = api.forceShutDownVm(params, contentLanguage);
      assertThat(result).as("check result of forceShutDownVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload", groups = { "running_vm_operation" })
  public void shutDownVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, new TypeToken<VmOperateParams>() {
      }.getType());
      params.where(new VmWhereInput().id(runningVM.getId()));
      // do some modify to params(optional)
      List<WithTaskVm> result = api.shutDownVm(params, contentLanguage);
      assertThat(result).as("check result of shutDownVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }
  // #endregion running vm operation

  // @Test(dataProvider = "vmPayload")
  // public void addVmCdRom(String payload) {
  // try {
  // // parse params from json payload
  // VmAddCdRomParams params = gson.fromJson(payload, new
  // TypeToken<VmAddCdRomParams>() {
  // }.getType());
  // // do some modify to params(optional)
  // List<WithTaskVm> result = api.addVmCdRom(params, contentLanguage);
  // assertThat(result).as("check result of addVmCdRom").isNotNull();
  // } catch (ApiException e) {
  // assertThat(true).as(e.getResponseBody()).isFalse();
  // }
  // }

  // @Test(dataProvider = "vmPayload")
  // public void addVmDisk(String payload) {
  // try {
  // // parse params from json payload
  // VmAddDiskParams params = gson.fromJson(payload, new
  // TypeToken<VmAddDiskParams>() {
  // }.getType());
  // // do some modify to params(optional)
  // List<WithTaskVm> result = api.addVmDisk(params, contentLanguage);
  // assertThat(result).as("check result of addVmDisk").isNotNull();
  // } catch (ApiException e) {
  // assertThat(true).as(e.getResponseBody()).isFalse();
  // }
  // }

  // @Test(dataProvider = "vmPayload")
  // public void addVmNic(String payload) {
  // try {
  // // parse params from json payload
  // VmAddNicParams params = gson.fromJson(payload, new
  // TypeToken<VmAddNicParams>() {
  // }.getType());
  // // do some modify to params(optional)
  // List<WithTaskVm> result = api.addVmNic(params, contentLanguage);
  // assertThat(result).as("check result of addVmNic").isNotNull();
  // } catch (ApiException e) {
  // assertThat(true).as(e.getResponseBody()).isFalse();
  // }
  // }

  // @Test(dataProvider = "vmPayload")
  // public void convertVmTemplateToVm(String payload) {
  // try {
  // // parse params from json payload
  // List<ConvertVmTemplateToVmParams> params = gson.fromJson(payload,
  // new TypeToken<List<ConvertVmTemplateToVmParams>>() {
  // }.getType());
  // // do some modify to params(optional)
  // List<WithTaskVm> result = api.convertVmTemplateToVm(params, contentLanguage);
  // assertThat(result).as("check result of convertVmTemplateToVm").isNotNull();
  // } catch (ApiException e) {
  // assertThat(true).as(e.getResponseBody()).isFalse();
  // }
  // }

  // @Test(dataProvider = "vmPayload")
  // public void createVmFromTemplate(String payload) {
  // try {
  // // parse params from json payload
  // List<VmCreateVmFromTemplateParams> params = gson.fromJson(payload,
  // new TypeToken<List<VmCreateVmFromTemplateParams>>() {
  // }.getType());
  // // do some modify to params(optional)
  // List<WithTaskVm> result = api.createVmFromTemplate(params, contentLanguage);
  // assertThat(result).as("check result of createVmFromTemplate").isNotNull();
  // } catch (ApiException e) {
  // assertThat(true).as(e.getResponseBody()).isFalse();
  // }
  // }

  @Test(dataProvider = "vmPayload")
  public void getVms(String payload) {
    try {
      // parse params from json payload
      GetVmsRequestBody params = gson.fromJson(payload, new TypeToken<GetVmsRequestBody>() {
      }.getType());
      // do some modify to params(optional)
      List<Vm> result = api.getVms(params, contentLanguage);
      assertThat(result).as("check result of getVms").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void getVmsConnection(String payload) {
    try {
      // parse params from json payload
      GetVmsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetVmsConnectionRequestBody>() {
      }.getType());
      // do some modify to params(optional)
      VmConnection result = api.getVmsConnection(params, contentLanguage);
      assertThat(result).as("check result of getVmsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  // @Test(dataProvider = "vmPayload")
  // public void installVmtools(String payload) {
  // try {
  // // parse params from json payload
  // InstallVmtoolsParams params = gson.fromJson(payload, new
  // TypeToken<InstallVmtoolsParams>() {
  // }.getType());
  // // do some modify to params(optional)
  // List<WithTaskVm> result = api.installVmtools(params, contentLanguage);
  // assertThat(result).as("check result of installVmtools").isNotNull();
  // } catch (ApiException e) {
  // assertThat(true).as(e.getResponseBody()).isFalse();
  // }
  // }

  // @Test(dataProvider = "vmPayload")
  // public void moveVmToRecycleBin(String payload) {
  // try {
  // // parse params from json payload
  // VmOperateParams params = gson.fromJson(payload, new
  // TypeToken<VmOperateParams>() {
  // }.getType());
  // // do some modify to params(optional)
  // List<InlineResponse200> result = api.moveVmToRecycleBin(params,
  // contentLanguage);
  // assertThat(result).as("check result of moveVmToRecycleBin").isNotNull();
  // } catch (ApiException e) {
  // assertThat(true).as(e.getResponseBody()).isFalse();
  // }
  // }

  // @Test(dataProvider = "vmPayload")
  // public void rebuildVm(String payload) {
  // try {
  // // parse params from json payload
  // List<VmRebuildParams> params = gson.fromJson(payload, new
  // TypeToken<List<VmRebuildParams>>() {
  // }.getType());
  // // do some modify to params(optional)
  // List<WithTaskVm> result = api.rebuildVm(params, contentLanguage);
  // assertThat(result).as("check result of rebuildVm").isNotNull();
  // } catch (ApiException e) {
  // assertThat(true).as(e.getResponseBody()).isFalse();
  // }
  // }

  // @Test(dataProvider = "vmPayload")
  // public void recoverVmFromRecycleBin(String payload) {
  // try {
  // // parse params from json payload
  // VmOperateParams params = gson.fromJson(payload, new
  // TypeToken<VmOperateParams>() {
  // }.getType());
  // // do some modify to params(optional)
  // List<InlineResponse200> result = api.recoverVmFromRecycleBin(params,
  // contentLanguage);
  // assertThat(result).as("check result of recoverVmFromRecycleBin").isNotNull();
  // } catch (ApiException e) {
  // assertThat(true).as(e.getResponseBody()).isFalse();
  // }
  // }

  // @Test(dataProvider = "vmPayload")
  // public void removeVmCdRom(String payload) {
  // try {
  // // parse params from json payload
  // VmRemoveCdRomParams params = gson.fromJson(payload, new
  // TypeToken<VmRemoveCdRomParams>() {
  // }.getType());
  // // do some modify to params(optional)
  // List<WithTaskVm> result = api.removeVmCdRom(params, contentLanguage);
  // assertThat(result).as("check result of removeVmCdRom").isNotNull();
  // } catch (ApiException e) {
  // assertThat(true).as(e.getResponseBody()).isFalse();
  // }
  // }

  // @Test(dataProvider = "vmPayload")
  // public void removeVmDisk(String payload) {
  // try {
  // // parse params from json payload
  // VmRemoveDiskParams params = gson.fromJson(payload, new
  // TypeToken<VmRemoveDiskParams>() {
  // }.getType());
  // // do some modify to params(optional)
  // List<WithTaskVm> result = api.removeVmDisk(params, contentLanguage);
  // assertThat(result).as("check result of removeVmDisk").isNotNull();
  // } catch (ApiException e) {
  // assertThat(true).as(e.getResponseBody()).isFalse();
  // }
  // }

  // @Test(dataProvider = "vmPayload")
  // public void removeVmNic(String payload) {
  // try {
  // // parse params from json payload
  // VmRemoveNicParams params = gson.fromJson(payload, new
  // TypeToken<VmRemoveNicParams>() {
  // }.getType());
  // // do some modify to params(optional)
  // List<WithTaskVm> result = api.removeVmNic(params, contentLanguage);
  // assertThat(result).as("check result of removeVmNic").isNotNull();
  // } catch (ApiException e) {
  // assertThat(true).as(e.getResponseBody()).isFalse();
  // }
  // }

  // @Test(dataProvider = "vmPayload")
  // public void rollbackVm(String payload) {
  // try {
  // // parse params from json payload
  // VmRollbackParams params = gson.fromJson(payload, new
  // TypeToken<VmRollbackParams>() {
  // }.getType());
  // // do some modify to params(optional)
  // List<WithTaskVm> result = api.rollbackVm(params, contentLanguage);
  // assertThat(result).as("check result of rollbackVm").isNotNull();
  // } catch (ApiException e) {
  // assertThat(true).as(e.getResponseBody()).isFalse();
  // }
  // }

  // @Test(dataProvider = "vmPayload")
  // public void updateVmDisk(String payload) {
  // try {
  // // parse params from json payload
  // VmUpdateDiskParams params = gson.fromJson(payload, new
  // TypeToken<VmUpdateDiskParams>() {
  // }.getType());
  // // do some modify to params(optional)
  // List<WithTaskVm> result = api.updateVmDisk(params, contentLanguage);
  // assertThat(result).as("check result of updateVmDisk").isNotNull();
  // } catch (ApiException e) {
  // assertThat(true).as(e.getResponseBody()).isFalse();
  // }
  // }

  // @Test(dataProvider = "vmPayload")
  // public void updateVmNic(String payload) {
  // try {
  // // parse params from json payload
  // VmUpdateNicParams params = gson.fromJson(payload, new
  // TypeToken<VmUpdateNicParams>() {
  // }.getType());
  // // do some modify to params(optional)
  // List<WithTaskVm> result = api.updateVmNic(params, contentLanguage);
  // assertThat(result).as("check result of updateVmNic").isNotNull();
  // } catch (ApiException e) {
  // assertThat(true).as(e.getResponseBody()).isFalse();
  // }
  // }

}
