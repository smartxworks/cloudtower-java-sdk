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
import com.smartx.tower.api.VmFolderApi;
import com.smartx.tower.model.*;

public class ITVmFolder extends ITBase {
  VmFolderApi api = null;
  VmApi vmApi = null;
  Cluster cluster = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "vmFolderPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException, ApiException {
    api = new VmFolderApi(client);
    vmApi = new VmApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/VmFolder.json");
    cluster = getData("defaultCluster", Cluster.class);
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {
    }.getType());
  }

  VmFolder folder = null;

  @BeforeMethod(onlyForGroups = { "need_vm_folder" })
  public void createVmFolder() throws InterruptedException, ApiException {
    List<VmFolderCreationParams> params = new ArrayList<>();
    params.add(new VmFolderCreationParams().clusterId(cluster.getId())
        .name("tower-sdk-test-vm-folder" + System.currentTimeMillis()));
    // do some modify to params(optional)
    List<WithTaskVmFolder> result = api.createVmFolder(params);
    folder = result.get(0).getData();
    Thread.sleep(1000);
  }

  @AfterMethod(onlyForGroups = { "need_vm_folder" })
  public void deleteVmFolder() throws InterruptedException, ApiException {
    Thread.sleep(1000);
    api.deleteVmFolder(new VmFolderDeletionParams().where(new VmFolderWhereInput().id(folder.getId())));
    folder = null;
    Thread.sleep(1000);
  }

  @Test()
  public void createAndDeleteVmFolder() throws InterruptedException {
    try {
      // parse params from json payload
      List<VmFolderCreationParams> params = new ArrayList<>();
      params.add(new VmFolderCreationParams().clusterId(cluster.getId())
          .name("tower-sdk-test-vm-folder" + System.currentTimeMillis()));
      // do some modify to params(optional)
      List<WithTaskVmFolder> result = api.createVmFolder(params);
      VmFolder folder = result.get(0).getData();
      Thread.sleep(1000);
      api.deleteVmFolder(new VmFolderDeletionParams().where(new VmFolderWhereInput().id(folder.getId())));
      Thread.sleep(1000);
      assertThat(result).as("check result of create and delete vm folder").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmFolderPayload")
  public void getVmFolders(String payload) {
    try {
      // parse params from json payload
      GetVmFoldersRequestBody params = gson.fromJson(payload, new TypeToken<GetVmFoldersRequestBody>() {
      }.getType());
      // do some modify to params(optional)
      List<VmFolder> result = api.getVmFolders(params);
      assertThat(result).as("check result of getVmFolders").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmFolderPayload")
  public void getVmFoldersConnection(String payload) {
    try {
      // parse params from json payload
      GetVmFoldersConnectionRequestBody params = gson.fromJson(payload,
          new TypeToken<GetVmFoldersConnectionRequestBody>() {
          }.getType());
      // do some modify to params(optional)
      VmFolderConnection result = api.getVmFoldersConnection(params);
      assertThat(result).as("check result of getVmFoldersConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmFolderPayload", groups = { "need_vm_folder" })
  public void updateVmFolder(String payload) {
    try {
      // parse params from json payload
      VmFolderUpdationParams params = gson.fromJson(payload, new TypeToken<VmFolderUpdationParams>() {
      }.getType());
      params.data(new VmFolderUpdationParamsData().name("tower-sdk-test-vm-folder-update" + System.currentTimeMillis()))
          .where(new VmFolderWhereInput().id(folder.getId()));
      // do some modify to params(optional)
      List<WithTaskVmFolder> result = api.updateVmFolder(params);
      assertThat(result).as("check result of updateVmFolder").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  Vm vm = null;

  @BeforeMethod(groups = { "need_vm" })
  public void createVm() throws ApiException, IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException, InterruptedException {
    List<VmCreationParams> params = new ArrayList<>();
    Vlan vlan = getData("defaultVlan", Vlan.class);
    params.add(new VmCreationParams().name("tower-sdk-test-snapshot-vm" + System.currentTimeMillis()).cpuCores(1)
        .cpuSockets(1).memory(4294967296L).ha(true).vcpu(1).status(VmStatus.STOPPED).firmware(VmFirmware.BIOS)
        .clusterId(cluster.getId()).vmDisks(new VmDiskParams().addMountCdRomsItem(new VmCdRomParams().boot(1).index(1)))
        .addVmNicsItem(new VmNicParams().localId("").connectVlanId(vlan.getId())));
    WithTaskVm createResult = vmApi.createVm(params).get(0);
    vm = createResult.getData();
    waitForTaskSucceed(createResult.getTaskId());
  }

  @AfterMethod(groups = { "need_vm" }, alwaysRun = true)
  public void deleteVm() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
      NoSuchMethodException, SecurityException, ApiException, InterruptedException {
    Vm _vm = (Vm) waitForResourceAsyncStatus(new GetVmsRequestBody().where(new VmWhereInput().id(vm.getId())), vmApi,
        "getVms", new TypeToken<List<Vm>>() {
        }.getClass(), GetVmsRequestBody.class);
    // shudown vm first before delete it if itis running;
    if (_vm.getStatus() == VmStatus.RUNNING) {
      waitForTaskSucceed(
          vmApi.shutDownVm(new VmOperateParams().where(new VmWhereInput().id(_vm.getId()))).get(0)
              .getTaskId());
    }
    waitForTaskSucceed(vmApi.deleteVm(new VmOperateParams().where(new VmWhereInput().id(vm.getId())))
        .get(0).getTaskId());
    vm = null;
  }

  @Test(groups = { "need_vm_folder", "need_vm" })
  public void addAndRemoveVmToFolder() throws IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException, InterruptedException {
    try {
      // parse params from json payload
      VmAddFolderParams params = new VmAddFolderParams();
      // do some modify to params(optional)
      params.where(new VmWhereInput().id(vm.getId())).data(new VmAddFolderParamsData().folderId(folder.getId()));
      List<WithTaskVm> result = vmApi.addVmToFolder(params);
      waitForTaskSucceed(result.get(0).getTaskId());
      waitForTaskSucceed(
          vmApi.removeVmToFolder(new VmOperateParams().where(new VmWhereInput().id(vm.getId()))).get(0)
              .getTaskId());
      assertThat(result).as("check result of addVmToFolder").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }
}
