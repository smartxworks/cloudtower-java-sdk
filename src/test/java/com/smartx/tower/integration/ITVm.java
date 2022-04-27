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
import java.util.concurrent.Callable;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.GlobalSettingsApi;
import com.smartx.tower.api.HostApi;
import com.smartx.tower.api.VmApi;
import com.smartx.tower.api.VmDiskApi;
import com.smartx.tower.model.*;

public class ITVm extends ITBase {
  Cluster cluster = null;

  VmApi api = null;
  VmDiskApi diskApi = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "vmPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException, ApiException {
    api = new VmApi(client);
    diskApi = new VmDiskApi(client);
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
  @Test()
  public void createAndDeleteVm() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
      NoSuchMethodException, SecurityException {
    try {
      // parse params from json payload
      Vlan vlan = getData("defaultVlan", Vlan.class);
      List<VmCreationParams> params = new ArrayList<>();
      params.add(new VmCreationParams().clusterId(cluster.getId())
          .addVmNicsItem(new VmNicParams().connectVlanId(vlan.getId()).localId(""))
          .name("tower-sdk-test-create-vm" + System.currentTimeMillis()).cpuCores(1).cpuSockets(1).memory(4294967296L)
          .ha(true).vcpu(1).status(VmStatus.STOPPED).firmware(VmFirmware.BIOS)
          .vmDisks(new VmDiskParams().addMountCdRomsItem(new VmCdRomParams().boot(1).index(1))));
      // do some modify to params(optional)
      List<WithTaskVm> result = api.createVm(params);
      assertThat(result).as("check result of createVm").isNotNull();
      Vm vm = result.get(0).getData();
      waitForTaskSucceed(result.get(0).getTaskId());
      waitForTaskSucceed(api.deleteVm(new VmOperateParams().where(new VmWhereInput().id(vm.getId())))
          .get(0).getTaskId());
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }
  // #endregion base

  // #region stopped vm operation

  Vm stoppedVm = null;

  @BeforeMethod(onlyForGroups = { "need_stopped_vm" })
  public void createStoppedVm() throws ApiException, IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException {
    List<VmCreationParams> params = new ArrayList<>();
    Vlan vlan = getData("defaultVlan", Vlan.class);
    params.add(new VmCreationParams().name("tower-sdk-test-stopped-vm" + System.currentTimeMillis()).cpuCores(1)
        .cpuSockets(1).memory(4294967296L).ha(true).vcpu(1).status(VmStatus.STOPPED).firmware(VmFirmware.BIOS)
        .clusterId(cluster.getId()).vmDisks(new VmDiskParams().addMountCdRomsItem(new VmCdRomParams().boot(1).index(1)))
        .addVmNicsItem(new VmNicParams().localId("").connectVlanId(vlan.getId())));
    WithTaskVm result = api.createVm(params).get(0);
    stoppedVm = result.getData();
    waitForTaskSucceed(result.getTaskId());
  }

  @AfterMethod(onlyForGroups = { "need_stopped_vm" })
  public void removeStoppedVm() throws ApiException, IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException {
    Vm vm = waitForVmEntityAsyncStatus(stoppedVm.getId(), api);
    // shudown vm first before delete it if itis running;
    if (vm.getStatus() == VmStatus.RUNNING) {
      waitForTaskSucceed(api.shutDownVm(new VmOperateParams().where(new VmWhereInput().id(vm.getId())))
          .get(0).getTaskId());
    }
    VmOperateParams params = new VmOperateParams().where(new VmWhereInput().id(stoppedVm.getId()));
    ;
    waitForTaskSucceed(api.deleteVm(params).get(0).getTaskId());
    stoppedVm = null;
  }

  @Test(dataProvider = "vmPayload", groups = { "need_stopped_vm" })
  public void cloneVm(String payload) throws IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException {
    try {
      // parse params from json payload
      List<VmCloneParams> params = gson.fromJson(payload, new TypeToken<List<VmCloneParams>>() {
      }.getType());
      params.get(0).srcVmId(stoppedVm.getId()).clusterId(cluster.getId())
          .name("tower-sdk-test-clone-vm" + System.currentTimeMillis());
      // do some modify to params(optional)
      List<WithTaskVm> result = api.cloneVm(params);
      assertThat(result).as("check result of cloneVm").isNotNull();
      Vm clonedVm = result.get(0).getData();
      waitForTaskSucceed(result.get(0).getTaskId());
      waitForTaskSucceed(
          api.deleteVm(new VmOperateParams().where(new VmWhereInput().id(clonedVm.getId()))).get(0)
              .getTaskId());
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload", groups = { "need_stopped_vm" })
  public void startVm(String payload) {
    try {
      // parse params from json payload
      VmStartParams params = gson.fromJson(payload, new TypeToken<VmStartParams>() {
      }.getType());
      params.where(new VmWhereInput().id(stoppedVm.getId()));
      // do some modify to params(optional)
      List<WithTaskVm> result = api.startVm(params);
      assertThat(result).as("check result of startVm").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload", groups = { "need_stopped_vm" })
  public void updateVm(String payload) {
    try {
      // parse params from json payload
      VmUpdateParams params = gson.fromJson(payload, new TypeToken<VmUpdateParams>() {
      }.getType());
      params.where(new VmWhereInput().id(stoppedVm.getId()));
      // do some modify to params(optional)
      List<WithTaskVm> result = api.updateVm(params);
      assertThat(result).as("check result of updateVm").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload", groups = { "need_stopped_vm" })
  public void migRateVm(String payload) {
    try {
      NestedHost vmhost = stoppedVm.getHost();
      Host host = new HostApi(client)
          .getHosts(new GetHostsRequestBody().where(new HostWhereInput().idNot(vmhost != null ? vmhost.getId() : null)
              .cluster(new ClusterWhereInput().id(cluster.getId()))))
          .get(0);
      // parse params from json payload
      VmMigrateParams params = gson.fromJson(payload, new TypeToken<VmMigrateParams>() {
      }.getType());
      params.where(new VmWhereInput().id(stoppedVm.getId())).data(new VmStartParamsData().hostId(host.getId()));
      // do some modify to params(optional)
      List<WithTaskVm> result = api.migRateVm(params);
      assertThat(result).as("check result of migRateVm").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  // #endregion stopped vm operation
  // #region running vm operation
  Vm runningVM = null;

  @BeforeMethod(onlyForGroups = { "need_running_vm" })
  public void createRunningVm() throws ApiException, IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException {
    List<VmCreationParams> params = new ArrayList<>();
    Vlan vlan = getData("defaultVlan", Vlan.class);
    params.add(new VmCreationParams().name("tower-sdk-test-running-vm" + System.currentTimeMillis()).cpuCores(1)
        .cpuSockets(1).memory(4294967296L).ha(true).vcpu(1).status(VmStatus.RUNNING).firmware(VmFirmware.BIOS)
        .clusterId(cluster.getId()).vmDisks(new VmDiskParams().addMountCdRomsItem(new VmCdRomParams().boot(1).index(1)))
        .addVmNicsItem(new VmNicParams().localId("").connectVlanId(vlan.getId())));
    WithTaskVm result = api.createVm(params).get(0);
    runningVM = result.getData();
    waitForTaskSucceed(result.getTaskId());
  }

  @AfterMethod(onlyForGroups = { "need_running_vm" })
  public void removeRunningVm() throws ApiException, IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException {
    Vm vm = waitForVmEntityAsyncStatus(runningVM.getId(), api);
    // shudown vm first before delete it;
    if (vm.getStatus() == VmStatus.RUNNING) {
      waitForTaskSucceed(api.shutDownVm(new VmOperateParams().where(new VmWhereInput().id(vm.getId())))
          .get(0).getTaskId());
    }
    VmOperateParams params = new VmOperateParams().where(new VmWhereInput().id(runningVM.getId()));
    waitForTaskSucceed(api.deleteVm(params).get(0).getTaskId());
    runningVM = null;
  }

  @Test(dataProvider = "vmPayload", groups = { "need_running_vm" })
  public void restartVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, new TypeToken<VmOperateParams>() {
      }.getType());
      params.where(new VmWhereInput().id(runningVM.getId()));
      // do some modify to params(optional)
      List<WithTaskVm> result = api.restartVm(params);
      assertThat(result).as("check result of restartVm").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload", groups = { "need_running_vm" })
  public void suspendAndResumeVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, new TypeToken<VmOperateParams>() {
      }.getType());
      params.where(new VmWhereInput().id(runningVM.getId()));
      waitForTaskSucceed(api.suspendVm(params).get(0).getTaskId());
      // do some modify to params(optional)
      List<WithTaskVm> result = api.resumeVm(params);
      assertThat(result).as("check result of suspend and resume vm").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload", groups = { "need_running_vm" })
  public void forceRestartVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, new TypeToken<VmOperateParams>() {
      }.getType());
      params.where(new VmWhereInput().id(runningVM.getId()));
      // do some modify to params(optional)
      List<WithTaskVm> result = api.forceRestartVm(params);
      assertThat(result).as("check result of forceRestartVm").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload", groups = { "need_running_vm" })
  public void powerOffVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, new TypeToken<VmOperateParams>() {
      }.getType());
      params.where(new VmWhereInput().id(runningVM.getId()));
      // do some modify to params(optional)
      List<WithTaskVm> result = api.poweroffVm(params);
      assertThat(result).as("check result of powerOffVm").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload", groups = { "need_running_vm" })
  public void shutDownVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, new TypeToken<VmOperateParams>() {
      }.getType());
      params.where(new VmWhereInput().id(runningVM.getId()));
      // do some modify to params(optional)
      List<WithTaskVm> result = api.shutDownVm(params);
      assertThat(result).as("check result of shutDownVm").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }
  // #endregion running vm operation

  @Test(dataProvider = "vmPayload")
  public void getVms(String payload) {
    try {
      // parse params from json payload
      GetVmsRequestBody params = gson.fromJson(payload, new TypeToken<GetVmsRequestBody>() {
      }.getType());
      // do some modify to params(optional)
      List<Vm> result = api.getVms(params);
      assertThat(result).as("check result of getVms").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
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
      VmConnection result = api.getVmsConnection(params);
      assertThat(result).as("check result of getVmsConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  // skip vmtools installation
  @Test(dataProvider = "vmPayload", enabled = false)
  public void installVmtools(String payload) {
    try {
      // parse params from json payload
      InstallVmtoolsParams params = gson.fromJson(payload, new TypeToken<InstallVmtoolsParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = api.installVmtools(params);
      assertThat(result).as("check result of installVmtools").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(groups = { "need_stopped_vm" })
  public void OperatingVmCdRom() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
      NoSuchMethodException, SecurityException {
    try {
      // parse params from json payload
      VmAddCdRomParams addParams = new VmAddCdRomParams().where(new VmWhereInput().id(stoppedVm.getId()))
          .data(new VmAddCdRomParamsData().addVmCdRomsItem(new VmCdRomParams().boot(2).index(2)));
      // do some modify to params(optional)
      List<WithTaskVm> addResult = api.addVmCdRom(addParams);
      waitForTaskSucceed(addResult.get(0).getTaskId());
      assertThat(addResult).as("check result of addVmCdRom").isNotNull();
      VmDiskApi diskApi = new VmDiskApi(client);
      VmDisk disk = diskApi
          .getVmDisks(new GetVmDisksRequestBody()
              .where(new VmDiskWhereInput().boot(2).vm(new VmWhereInput().id(stoppedVm.getId()))))
          .get(0);

      VmRemoveCdRomParams removeParams = new VmRemoveCdRomParams().where(new VmWhereInput().id(stoppedVm.getId()))
          .data(new VmRemoveCdRomParamsData().addCdRomIdsItem(disk.getId()));
      List<WithTaskVm> removeResult = api.removeVmCdRom(removeParams);
      waitForTaskSucceed(removeResult.get(0).getTaskId());
      assertThat(removeResult).as("check result of removeVmCdRom").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(groups = { "need_stopped_vm" })
  public void addAndUpdateAndRemoveVmDisk() throws IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException {
    try {
      // parse params from json payload
      VmAddDiskParams addParams = new VmAddDiskParams().where(new VmWhereInput().id(stoppedVm.getId()))
          .data(new VmAddDiskParamsData().vmDisks(new VmAddDiskParamsDataVmDisks()
              .addMountNewCreateDisksItem(new MountNewCreateDisksParams().bus(Bus.IDE).boot(0)
                  .vmVolume(new MountNewCreateDisksParamsVmVolume()
                      .elfStoragePolicy(VmVolumeElfStoragePolicyType._2_THIN_PROVISION)
                      .name("tower-sdk-test-vm-operate-disk-volume" + System.currentTimeMillis())
                      .size(1073741824L)))));
      // do some modify to params(optional)
      List<WithTaskVm> addResult = api.addVmDisk(addParams);
      waitForTaskSucceed(addResult.get(0).getTaskId());
      assertThat(addResult).as("check result of addVmDisk").isNotNull();

      VmExpandVmDiskParams expandParams = new VmExpandVmDiskParams()
          .where(
              new VmDiskWhereInput()
                  .vm(new VmWhereInput().id(stoppedVm.getId())).type(VmDiskType.DISK))
          .size(1073741824L * 2);
      List<WithTaskVm> expandResult = api.expandVmDisk(expandParams);
      waitForTaskSucceed(expandResult.get(0).getTaskId());
      assertThat(expandResult).as("check result of expandVmdisk").isNotNull();

      // after update vm, disk id has changed
      stoppedVm = api.getVms(new GetVmsRequestBody().where(new VmWhereInput().id(stoppedVm.getId()))).get(0);
      VmUpdateDiskParams updateParams = new VmUpdateDiskParams().where(new VmWhereInput().id(stoppedVm.getId())).data(
          new VmUpdateDiskParamsData().bus(Bus.SCSI).vmDiskId(addResult.get(0).getData().getVmDisks().get(0).getId()));
      List<WithTaskVm> updateresults = api.updateVmDisk(updateParams);
      waitForTaskSucceed(updateresults.get(0).getTaskId());

      assertThat(updateresults).as("check result of addVmDisk").isNotNull();

      VmRemoveDiskParams removeParams = new VmRemoveDiskParams().where(new VmWhereInput().id(stoppedVm.getId()))
          .data(new VmRemoveDiskParamsData().addDiskIdsItem(addResult.get(0).getData().getVmDisks().get(0).getId()));
      List<WithTaskVm> removeResult = api.removeVmDisk(removeParams);
      waitForTaskSucceed(removeResult.get(0).getTaskId());

      assertThat(removeResult).as("check result of removeVmDisk").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(groups = { "need_stopped_vm" })
  public void addAndUpdateAndRemoveVmNic() throws IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException {
    try {
      Vlan vlan = getData("defaultVlan", Vlan.class);

      // parse params from json payload
      VmAddNicParams addParams = new VmAddNicParams().where(new VmWhereInput().id(stoppedVm.getId()))
          .data(new VmAddNicParamsData().addVmNicsItem(new VmNicParams().connectVlanId(vlan.getId())));
      // do some modify to params(optional)
      List<WithTaskVm> addResult = api.addVmNic(addParams);
      waitForTaskSucceed(addResult.get(0).getTaskId());
      assertThat(addResult).as("check result of addVmNic").isNotNull();
      VmUpdateNicParams updateParams = new VmUpdateNicParams().where(new VmWhereInput().id(stoppedVm.getId()))
          .data(new VmUpdateNicParamsData().nicIndex(0).enabled(false));
      List<WithTaskVm> updateResults = api.updateVmNic(updateParams);
      waitForTaskSucceed(updateResults.get(0).getTaskId());
      assertThat(updateResults).as("check result of addVmNic").isNotNull();
      VmRemoveNicParams removeParams = new VmRemoveNicParams().where(new VmWhereInput().id(stoppedVm.getId()))
          .data(new VmRemoveNicParamsData().addNicIndexItem(0));
      List<WithTaskVm> removeResult = api.removeVmNic(removeParams);
      waitForTaskSucceed(removeResult.get(0).getTaskId());
      assertThat(removeResult).as("check result of removeVmNic").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(groups = { "need_stopped_vm" })
  public void OperateVmRecycleBin() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
      NoSuchMethodException, SecurityException {
    try {
      List<Method> methods = new ArrayList<>();
      methods.add(GlobalSettings.class.getDeclaredMethod("getVmRecycleBin"));
      methods.add(NestedVmRecycleBin.class.getDeclaredMethod("getEnabled"));
      GlobalSettingsApi settingApi = new GlobalSettingsApi(client);
      GlobalSettings settings = settingApi.getGlobalSettingses(new GetGlobalSettingsesRequestBody())
          .get(0);
      Boolean isRecycleBinEnabled = settings.getVmRecycleBin().getEnabled();
      if (!isRecycleBinEnabled) {
        GlobalSettings updatingSetting = settingApi.updateGlobalRecycleBinSetting(
            new GlobalRecycleBinUpdationParams().enabled(true).retain(30)).getData();
        waitForResourceUpdationToTargetValue(
            new GetGlobalSettingsesRequestBody().where(new GlobalSettingsWhereInput().id(updatingSetting.getId())),
            settingApi, GlobalSettingsApi.class.getDeclaredMethod("getGlobalSettingses",
                GetGlobalSettingsesRequestBody.class, String.class),
            new TypeToken<List<GlobalSettings>>() {
            }.getClass(), GetGlobalSettingsesRequestBody.class, methods, true);
      }
      VmOperateParams params = new VmOperateParams().where(new VmWhereInput().id(stoppedVm.getId()));
      // do some modify to params(optional)
      List<WithTaskDeleteVm> result = api.moveVmToRecycleBin(params);
      assertThat(result).as("check result of moveVmToRecycleBin").isNotNull();
      waitForTaskSucceed(result.get(0).getTaskId());
      result = api.recoverVmFromRecycleBin(params);
      assertThat(result).as("check result of moveVmToRecycleBin").isNotNull();
      waitForTaskSucceed(result.get(0).getTaskId());
      if (isRecycleBinEnabled) {
        GlobalSettings updatingSetting = settingApi.updateGlobalRecycleBinSetting(
            new GlobalRecycleBinUpdationParams().enabled(false).retain(settings.getVmRecycleBin().getRetain()))
            .getData();

        waitForResourceUpdationToTargetValue(
            new GetGlobalSettingsesRequestBody().where(new GlobalSettingsWhereInput().id(updatingSetting.getId())),
            settingApi, GlobalSettingsApi.class.getDeclaredMethod("getGlobalSettingses",
                GetGlobalSettingsesRequestBody.class, String.class),
            new TypeToken<List<GlobalSettings>>() {
            }.getClass(), GetGlobalSettingsesRequestBody.class, methods, false);
      }
    } catch (

    ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }
}
