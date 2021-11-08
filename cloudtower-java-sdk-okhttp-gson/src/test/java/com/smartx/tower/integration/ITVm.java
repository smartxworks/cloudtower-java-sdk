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
import com.smartx.tower.api.VmApi;
import com.smartx.tower.model.*;

public class ITVm extends ITBase {
  VmApi vmApi = null;
  HashMap<String, Object> vmPayloads = new HashMap<>();
  Cluster cluster = null;
  Vm createdVm = null;
  Vm clonedVm = null;
  VmNic nic = null;
  VmCdrom

  @DataProvider(name = "vmPayload")
  Object[][] vmData(Method m) {
    Object payload = vmPayloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException, ApiException {
    vmApi = new VmApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Vm.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    vmPayloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {
    }.getType());

    cluster = getData("defaultCluster", Cluster.class);
  }

  @Test(dataProvider = "vmPayload")
  public void addVmCdRom(String payload) {
    try {
      // parse params from json payload
      VmAddCdRomParams params = gson.fromJson(payload, new TypeToken<VmAddCdRomParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.addVmCdRom(params, contentLanguage);
      assertThat(result).as("check result of addVmCdRom").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void addVmDisk(String payload) {
    try {
      // parse params from json payload
      VmAddDiskParams params = gson.fromJson(payload, new TypeToken<VmAddDiskParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.addVmDisk(params, contentLanguage);
      assertThat(result).as("check result of addVmDisk").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void addVmNic(String payload) {
    try {
      // parse params from json payload
      VmAddNicParams params = gson.fromJson(payload, new TypeToken<VmAddNicParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.addVmNic(params, contentLanguage);
      assertThat(result).as("check result of addVmNic").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void addVmToFolder(String payload) {
    try {
      // parse params from json payload
      VmAddFolderParams params = gson.fromJson(payload, new TypeToken<VmAddFolderParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.addVmToFolder(params, contentLanguage);
      assertThat(result).as("check result of addVmToFolder").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload", priority = 1)
  public void cloneVm(String payload) {
    try {
      // parse params from json payload
      List<VmCloneParams> params = gson.fromJson(payload, new TypeToken<List<VmCloneParams>>() {
      }.getType());
      params.get(0).clusterId(createdVm.getId()).clusterId(cluster.getId());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.cloneVm(params, contentLanguage);
      clonedVm = result.get(0).getData();
      assertThat(result).as("check result of cloneVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void convertVmTemplateToVm(String payload) {
    try {
      // parse params from json payload
      List<ConvertVmTemplateToVmParams> params = gson.fromJson(payload,
          new TypeToken<List<ConvertVmTemplateToVmParams>>() {
          }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.convertVmTemplateToVm(params, contentLanguage);
      createdVm = result.get(0).getData();
      assertThat(result).as("check result of convertVmTemplateToVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload", priority = 0)
  public void createVm(String payload) {
    try {
      // parse params from json payload
      Vlan vlan = getData("defaultVlan", Vlan.class);
      List<VmCreationParams> params = gson.fromJson(payload, new TypeToken<List<VmCreationParams>>() {
      }.getType());
      // Vmnicpara
      params.get(0).setClusterId(cluster.getId());
      params.get(0).addVmNicsItem(new VmNicParams().connectVlanId(vlan.getId()).localId(""));
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.createVm(params, contentLanguage);
      assertThat(result).as("check result of createVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void createVmFromTemplate(String payload) {
    try {
      // parse params from json payload
      List<VmCreateVmFromTemplateParams> params = gson.fromJson(payload,
          new TypeToken<List<VmCreateVmFromTemplateParams>>() {
          }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.createVmFromTemplate(params, contentLanguage);
      assertThat(result).as("check result of createVmFromTemplate").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void deleteVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, new TypeToken<VmOperateParams>() {
      }.getType());
      // do some modify to params(optional)
      List<InlineResponse200> result = vmApi.deleteVm(params, contentLanguage);
      assertThat(result).as("check result of deleteVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void forceRestartVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, new TypeToken<VmOperateParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.forceRestartVm(params, contentLanguage);
      assertThat(result).as("check result of forceRestartVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void forceShutDownVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, new TypeToken<VmOperateParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.forceShutDownVm(params, contentLanguage);
      assertThat(result).as("check result of forceShutDownVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void getVms(String payload) {
    try {
      // parse params from json payload
      GetVmsRequestBody params = gson.fromJson(payload, new TypeToken<GetVmsRequestBody>() {
      }.getType());
      // do some modify to params(optional)
      List<Vm> result = vmApi.getVms(params, contentLanguage);
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
      VmConnection result = vmApi.getVmsConnection(params, contentLanguage);
      assertThat(result).as("check result of getVmsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void installVmtools(String payload) {
    try {
      // parse params from json payload
      InstallVmtoolsParams params = gson.fromJson(payload, new TypeToken<InstallVmtoolsParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.installVmtools(params, contentLanguage);
      assertThat(result).as("check result of installVmtools").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void migRateVm(String payload) {
    try {
      // parse params from json payload
      VmMigrateParams params = gson.fromJson(payload, new TypeToken<VmMigrateParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.migRateVm(params, contentLanguage);
      assertThat(result).as("check result of migRateVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void moveVmToRecycleBin(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, new TypeToken<VmOperateParams>() {
      }.getType());
      // do some modify to params(optional)
      List<InlineResponse200> result = vmApi.moveVmToRecycleBin(params, contentLanguage);
      assertThat(result).as("check result of moveVmToRecycleBin").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void rebuildVm(String payload) {
    try {
      // parse params from json payload
      List<VmRebuildParams> params = gson.fromJson(payload, new TypeToken<List<VmRebuildParams>>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.rebuildVm(params, contentLanguage);
      assertThat(result).as("check result of rebuildVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void recoverVmFromRecycleBin(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, new TypeToken<VmOperateParams>() {
      }.getType());
      // do some modify to params(optional)
      List<InlineResponse200> result = vmApi.recoverVmFromRecycleBin(params, contentLanguage);
      assertThat(result).as("check result of recoverVmFromRecycleBin").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void removeVmCdRom(String payload) {
    try {
      // parse params from json payload
      VmRemoveCdRomParams params = gson.fromJson(payload, new TypeToken<VmRemoveCdRomParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.removeVmCdRom(params, contentLanguage);
      assertThat(result).as("check result of removeVmCdRom").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void removeVmDisk(String payload) {
    try {
      // parse params from json payload
      VmRemoveDiskParams params = gson.fromJson(payload, new TypeToken<VmRemoveDiskParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.removeVmDisk(params, contentLanguage);
      assertThat(result).as("check result of removeVmDisk").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void removeVmNic(String payload) {
    try {
      // parse params from json payload
      VmRemoveNicParams params = gson.fromJson(payload, new TypeToken<VmRemoveNicParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.removeVmNic(params, contentLanguage);
      assertThat(result).as("check result of removeVmNic").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void removeVmToFolder(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, new TypeToken<VmOperateParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.removeVmToFolder(params, contentLanguage);
      assertThat(result).as("check result of removeVmToFolder").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void restartVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, new TypeToken<VmOperateParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.restartVm(params, contentLanguage);
      assertThat(result).as("check result of restartVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void resumeVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, new TypeToken<VmOperateParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.resumeVm(params, contentLanguage);
      assertThat(result).as("check result of resumeVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void rollbackVm(String payload) {
    try {
      // parse params from json payload
      VmRollbackParams params = gson.fromJson(payload, new TypeToken<VmRollbackParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.rollbackVm(params, contentLanguage);
      assertThat(result).as("check result of rollbackVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void shutDownVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, new TypeToken<VmOperateParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.shutDownVm(params, contentLanguage);
      assertThat(result).as("check result of shutDownVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void startVm(String payload) {
    try {
      // parse params from json payload
      VmStartParams params = gson.fromJson(payload, new TypeToken<VmStartParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.startVm(params, contentLanguage);
      assertThat(result).as("check result of startVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void suspendVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, new TypeToken<VmOperateParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.suspendVm(params, contentLanguage);
      assertThat(result).as("check result of suspendVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void updateVm(String payload) {
    try {
      // parse params from json payload
      VmUpdateParams params = gson.fromJson(payload, new TypeToken<VmUpdateParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.updateVm(params, contentLanguage);
      assertThat(result).as("check result of updateVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void updateVmDisk(String payload) {
    try {
      // parse params from json payload
      VmUpdateDiskParams params = gson.fromJson(payload, new TypeToken<VmUpdateDiskParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.updateVmDisk(params, contentLanguage);
      assertThat(result).as("check result of updateVmDisk").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmPayload")
  public void updateVmNic(String payload) {
    try {
      // parse params from json payload
      VmUpdateNicParams params = gson.fromJson(payload, new TypeToken<VmUpdateNicParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskVm> result = vmApi.updateVmNic(params, contentLanguage);
      assertThat(result).as("check result of updateVmNic").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
