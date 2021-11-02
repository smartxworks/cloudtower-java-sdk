package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.VmApi;
import com.smartx.tower.model.*;

public class ITVm extends IT {
  VmApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new VmApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Vm.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getVms(String payload) {
    try {
      // parse params from json payload
      GetVmsRequestBody params = gson.fromJson(payload, GetVmsRequestBody.class);
      // do some modify to params(optional)
      List<Vm> result = api.getVms("zh-CN", params);
      assertThat(result).as("check result of getVms").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getVmsConnection(String payload) {
    try {
      // parse params from json payload
      GetVmsConnectionRequestBody params = gson.fromJson(payload, GetVmsConnectionRequestBody.class);
      // do some modify to params(optional)
      VmConnection result = api.getVmsConnection("zh-CN", params);
      assertThat(result).as("check result of getVmsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createVm(String payload) {
    try {
      // parse params from json payload
      List<VmCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.createVm("zh-CN", params);
      assertThat(result).as("check result of createVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createVmFromTemplate(String payload) {
    try {
      // parse params from json payload
      List<VmCreateVmFromTemplateParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.createVmFromTemplate("zh-CN", params);
      assertThat(result).as("check result of createVmFromTemplate").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateVm(String payload) {
    try {
      // parse params from json payload
      VmUpdateParams params = gson.fromJson(payload, VmUpdateParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.updateVm("zh-CN", params);
      assertThat(result).as("check result of updateVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateVmDisk(String payload) {
    try {
      // parse params from json payload
      VmUpdateDiskParams params = gson.fromJson(payload, VmUpdateDiskParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.updateVmDisk("zh-CN", params);
      assertThat(result).as("check result of updateVmDisk").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateVmNic(String payload) {
    try {
      // parse params from json payload
      VmUpdateNicParams params = gson.fromJson(payload, VmUpdateNicParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.updateVmNic("zh-CN", params);
      assertThat(result).as("check result of updateVmNic").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void addVmCdRom(String payload) {
    try {
      // parse params from json payload
      VmAddCdRomParams params = gson.fromJson(payload, VmAddCdRomParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.addVmCdRom("zh-CN", params);
      assertThat(result).as("check result of addVmCdRom").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void addVmDisk(String payload) {
    try {
      // parse params from json payload
      VmAddDiskParams params = gson.fromJson(payload, VmAddDiskParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.addVmDisk("zh-CN", params);
      assertThat(result).as("check result of addVmDisk").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void addVmNic(String payload) {
    try {
      // parse params from json payload
      VmAddNicParams params = gson.fromJson(payload, VmAddNicParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.addVmNic("zh-CN", params);
      assertThat(result).as("check result of addVmNic").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void addVmToFolder(String payload) {
    try {
      // parse params from json payload
      VmAddFolderParams params = gson.fromJson(payload, VmAddFolderParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.addVmToFolder("zh-CN", params);
      assertThat(result).as("check result of addVmToFolder").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void cloneVm(String payload) {
    try {
      // parse params from json payload
      List<VmCloneParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.cloneVm("zh-CN", params);
      assertThat(result).as("check result of cloneVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void convertVmTemplateToVm(String payload) {
    try {
      // parse params from json payload
      List<ConvertVmTemplateToVmParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.convertVmTemplateToVm("zh-CN", params);
      assertThat(result).as("check result of convertVmTemplateToVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void forceRestartVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, VmOperateParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.forceRestartVm("zh-CN", params);
      assertThat(result).as("check result of forceRestartVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void forceShutDownVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, VmOperateParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.forceShutDownVm("zh-CN", params);
      assertThat(result).as("check result of forceShutDownVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void installVmtools(String payload) {
    try {
      // parse params from json payload
      InstallVmtoolsParams params = gson.fromJson(payload, InstallVmtoolsParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.installVmtools("zh-CN", params);
      assertThat(result).as("check result of installVmtools").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void migRateVm(String payload) {
    try {
      // parse params from json payload
      VmMigrateParams params = gson.fromJson(payload, VmMigrateParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.migRateVm("zh-CN", params);
      assertThat(result).as("check result of migRateVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void moveVmToRecycleBin(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, VmOperateParams.class);
      // do some modify to params(optional)
      List<InlineResponse200> result = api.moveVmToRecycleBin("zh-CN", params);
      assertThat(result).as("check result of moveVmToRecycleBin").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void rebuildVm(String payload) {
    try {
      // parse params from json payload
      List<VmRebuildParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.rebuildVm("zh-CN", params);
      assertThat(result).as("check result of rebuildVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void recoverVmFromRecycleBin(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, VmOperateParams.class);
      // do some modify to params(optional)
      List<InlineResponse200> result = api.recoverVmFromRecycleBin("zh-CN", params);
      assertThat(result).as("check result of recoverVmFromRecycleBin").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void removeVmCdRom(String payload) {
    try {
      // parse params from json payload
      VmRemoveCdRomParams params = gson.fromJson(payload, VmRemoveCdRomParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.removeVmCdRom("zh-CN", params);
      assertThat(result).as("check result of removeVmCdRom").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void removeVmDisk(String payload) {
    try {
      // parse params from json payload
      VmRemoveDiskParams params = gson.fromJson(payload, VmRemoveDiskParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.removeVmDisk("zh-CN", params);
      assertThat(result).as("check result of removeVmDisk").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void removeVmNic(String payload) {
    try {
      // parse params from json payload
      VmRemoveNicParams params = gson.fromJson(payload, VmRemoveNicParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.removeVmNic("zh-CN", params);
      assertThat(result).as("check result of removeVmNic").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void removeVmToFolder(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, VmOperateParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.removeVmToFolder("zh-CN", params);
      assertThat(result).as("check result of removeVmToFolder").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void restartVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, VmOperateParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.restartVm("zh-CN", params);
      assertThat(result).as("check result of restartVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void resumeVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, VmOperateParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.resumeVm("zh-CN", params);
      assertThat(result).as("check result of resumeVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void rollbackVm(String payload) {
    try {
      // parse params from json payload
      VmRollbackParams params = gson.fromJson(payload, VmRollbackParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.rollbackVm("zh-CN", params);
      assertThat(result).as("check result of rollbackVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void shutDownVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, VmOperateParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.shutDownVm("zh-CN", params);
      assertThat(result).as("check result of shutDownVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void startVm(String payload) {
    try {
      // parse params from json payload
      VmStartParams params = gson.fromJson(payload, VmStartParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.startVm("zh-CN", params);
      assertThat(result).as("check result of startVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void suspendVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, VmOperateParams.class);
      // do some modify to params(optional)
      List<WithTaskVm> result = api.suspendVm("zh-CN", params);
      assertThat(result).as("check result of suspendVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteVm(String payload) {
    try {
      // parse params from json payload
      VmOperateParams params = gson.fromJson(payload, VmOperateParams.class);
      // do some modify to params(optional)
      List<InlineResponse200> result = api.deleteVm("zh-CN", params);
      assertThat(result).as("check result of deleteVm").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
