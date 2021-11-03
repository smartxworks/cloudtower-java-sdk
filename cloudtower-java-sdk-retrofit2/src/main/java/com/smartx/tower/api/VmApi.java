package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.ConvertVmTemplateToVmParams;
import com.smartx.tower.model.GetVmsConnectionRequestBody;
import com.smartx.tower.model.GetVmsRequestBody;
import com.smartx.tower.model.InlineResponse200;
import com.smartx.tower.model.InstallVmtoolsParams;
import com.smartx.tower.model.Vm;
import com.smartx.tower.model.VmAddCdRomParams;
import com.smartx.tower.model.VmAddDiskParams;
import com.smartx.tower.model.VmAddFolderParams;
import com.smartx.tower.model.VmAddNicParams;
import com.smartx.tower.model.VmCloneParams;
import com.smartx.tower.model.VmConnection;
import com.smartx.tower.model.VmCreateVmFromTemplateParams;
import com.smartx.tower.model.VmCreationParams;
import com.smartx.tower.model.VmMigrateParams;
import com.smartx.tower.model.VmOperateParams;
import com.smartx.tower.model.VmRebuildParams;
import com.smartx.tower.model.VmRemoveCdRomParams;
import com.smartx.tower.model.VmRemoveDiskParams;
import com.smartx.tower.model.VmRemoveNicParams;
import com.smartx.tower.model.VmRollbackParams;
import com.smartx.tower.model.VmStartParams;
import com.smartx.tower.model.VmUpdateDiskParams;
import com.smartx.tower.model.VmUpdateNicParams;
import com.smartx.tower.model.VmUpdateParams;
import com.smartx.tower.model.WithTaskVm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VmApi {
  /**
   * 
   * 
   * @param vmAddCdRomParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("add-vm-cd-rom")
  Call<List<WithTaskVm>> addVmCdRom(
    @retrofit2.http.Body VmAddCdRomParams vmAddCdRomParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmAddDiskParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("add-vm-disk")
  Call<List<WithTaskVm>> addVmDisk(
    @retrofit2.http.Body VmAddDiskParams vmAddDiskParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmAddNicParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("add-vm-nic")
  Call<List<WithTaskVm>> addVmNic(
    @retrofit2.http.Body VmAddNicParams vmAddNicParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmAddFolderParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("add-vm-to-folder")
  Call<List<WithTaskVm>> addVmToFolder(
    @retrofit2.http.Body VmAddFolderParams vmAddFolderParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmCloneParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("clone-vm")
  Call<List<WithTaskVm>> cloneVm(
    @retrofit2.http.Body List<VmCloneParams> vmCloneParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param convertVmTemplateToVmParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("convert-vm-template-to-vm")
  Call<List<WithTaskVm>> convertVmTemplateToVm(
    @retrofit2.http.Body List<ConvertVmTemplateToVmParams> convertVmTemplateToVmParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmCreationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-vm")
  Call<List<WithTaskVm>> createVm(
    @retrofit2.http.Body List<VmCreationParams> vmCreationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmCreateVmFromTemplateParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-vm-from-template")
  Call<List<WithTaskVm>> createVmFromTemplate(
    @retrofit2.http.Body List<VmCreateVmFromTemplateParams> vmCreateVmFromTemplateParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmOperateParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;InlineResponse200&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-vm")
  Call<List<InlineResponse200>> deleteVm(
    @retrofit2.http.Body VmOperateParams vmOperateParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmOperateParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("force-restart-vm")
  Call<List<WithTaskVm>> forceRestartVm(
    @retrofit2.http.Body VmOperateParams vmOperateParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmOperateParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("poweroff-vm")
  Call<List<WithTaskVm>> forceShutDownVm(
    @retrofit2.http.Body VmOperateParams vmOperateParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getVmsRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;Vm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vms")
  Call<List<Vm>> getVms(
    @retrofit2.http.Body GetVmsRequestBody getVmsRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getVmsConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;VmConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vms-connection")
  Call<VmConnection> getVmsConnection(
    @retrofit2.http.Body GetVmsConnectionRequestBody getVmsConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param installVmtoolsParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("install-vmtools")
  Call<List<WithTaskVm>> installVmtools(
    @retrofit2.http.Body InstallVmtoolsParams installVmtoolsParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmMigrateParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("migrate-vm")
  Call<List<WithTaskVm>> migRateVm(
    @retrofit2.http.Body VmMigrateParams vmMigrateParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmOperateParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;InlineResponse200&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("move-vm-to-recycle")
  Call<List<InlineResponse200>> moveVmToRecycleBin(
    @retrofit2.http.Body VmOperateParams vmOperateParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmRebuildParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("rebuild-vm-from-snapshot")
  Call<List<WithTaskVm>> rebuildVm(
    @retrofit2.http.Body List<VmRebuildParams> vmRebuildParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmOperateParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;InlineResponse200&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("recover-vm-from-recycle")
  Call<List<InlineResponse200>> recoverVmFromRecycleBin(
    @retrofit2.http.Body VmOperateParams vmOperateParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmRemoveCdRomParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("remove-vm-cd-rom")
  Call<List<WithTaskVm>> removeVmCdRom(
    @retrofit2.http.Body VmRemoveCdRomParams vmRemoveCdRomParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmRemoveDiskParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("remove-vm-disk")
  Call<List<WithTaskVm>> removeVmDisk(
    @retrofit2.http.Body VmRemoveDiskParams vmRemoveDiskParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmRemoveNicParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("remove-vm-nic")
  Call<List<WithTaskVm>> removeVmNic(
    @retrofit2.http.Body VmRemoveNicParams vmRemoveNicParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmOperateParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("remove-vm-from-folder")
  Call<List<WithTaskVm>> removeVmToFolder(
    @retrofit2.http.Body VmOperateParams vmOperateParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmOperateParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("restart-vm")
  Call<List<WithTaskVm>> restartVm(
    @retrofit2.http.Body VmOperateParams vmOperateParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmOperateParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("resume-vm")
  Call<List<WithTaskVm>> resumeVm(
    @retrofit2.http.Body VmOperateParams vmOperateParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmRollbackParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("rollback-vm")
  Call<List<WithTaskVm>> rollbackVm(
    @retrofit2.http.Body VmRollbackParams vmRollbackParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmOperateParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("shutdown-vm")
  Call<List<WithTaskVm>> shutDownVm(
    @retrofit2.http.Body VmOperateParams vmOperateParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmStartParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("start-vm")
  Call<List<WithTaskVm>> startVm(
    @retrofit2.http.Body VmStartParams vmStartParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmOperateParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("suspend-vm")
  Call<List<WithTaskVm>> suspendVm(
    @retrofit2.http.Body VmOperateParams vmOperateParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmUpdateParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-vm-basic-info")
  Call<List<WithTaskVm>> updateVm(
    @retrofit2.http.Body VmUpdateParams vmUpdateParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmUpdateDiskParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-vm-disk")
  Call<List<WithTaskVm>> updateVmDisk(
    @retrofit2.http.Body VmUpdateDiskParams vmUpdateDiskParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmUpdateNicParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-vm-nic")
  Call<List<WithTaskVm>> updateVmNic(
    @retrofit2.http.Body VmUpdateNicParams vmUpdateNicParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
