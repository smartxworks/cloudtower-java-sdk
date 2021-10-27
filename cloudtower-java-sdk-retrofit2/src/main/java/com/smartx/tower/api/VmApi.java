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
   * @param contentLanguage  (required)
   * @param vmAddCdRomParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("add-vm-cd-rom")
  Call<List<WithTaskVm>> addVmCdRom(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmAddCdRomParams vmAddCdRomParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmAddDiskParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("add-vm-disk")
  Call<List<WithTaskVm>> addVmDisk(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmAddDiskParams vmAddDiskParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmAddNicParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("add-vm-nic")
  Call<List<WithTaskVm>> addVmNic(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmAddNicParams vmAddNicParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmAddFolderParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("add-vm-to-folder")
  Call<List<WithTaskVm>> addVmToFolder(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmAddFolderParams vmAddFolderParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmCloneParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("clone-vm")
  Call<List<WithTaskVm>> cloneVm(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<VmCloneParams> vmCloneParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param convertVmTemplateToVmParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("convert-vm-template-to-vm")
  Call<List<WithTaskVm>> convertVmTemplateToVm(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<ConvertVmTemplateToVmParams> convertVmTemplateToVmParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-vm")
  Call<List<WithTaskVm>> createVm(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<VmCreationParams> vmCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmCreateVmFromTemplateParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-vm-from-template")
  Call<List<WithTaskVm>> createVmFromTemplate(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<VmCreateVmFromTemplateParams> vmCreateVmFromTemplateParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmOperateParams  (required)
   * @return Call&lt;List&lt;InlineResponse200&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-vm")
  Call<List<InlineResponse200>> deleteVm(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmOperateParams vmOperateParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmOperateParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("force-restart-vm")
  Call<List<WithTaskVm>> forceRestartVm(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmOperateParams vmOperateParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmOperateParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("poweroff-vm")
  Call<List<WithTaskVm>> forceShutDownVm(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmOperateParams vmOperateParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getVmsRequestBody  (required)
   * @return Call&lt;List&lt;Vm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vms")
  Call<List<Vm>> getVms(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetVmsRequestBody getVmsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getVmsConnectionRequestBody  (required)
   * @return Call&lt;VmConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vms-connection")
  Call<VmConnection> getVmsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetVmsConnectionRequestBody getVmsConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param installVmtoolsParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("install-vmtools")
  Call<List<WithTaskVm>> installVmtools(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body InstallVmtoolsParams installVmtoolsParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmMigrateParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("migrate-vm")
  Call<List<WithTaskVm>> migRateVm(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmMigrateParams vmMigrateParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmOperateParams  (required)
   * @return Call&lt;List&lt;InlineResponse200&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("move-vm-to-recycle")
  Call<List<InlineResponse200>> moveVmToRecycleBin(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmOperateParams vmOperateParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmRebuildParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("rebuild-vm-from-snapshot")
  Call<List<WithTaskVm>> rebuildVm(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<VmRebuildParams> vmRebuildParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmOperateParams  (required)
   * @return Call&lt;List&lt;InlineResponse200&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("recover-vm-from-recycle")
  Call<List<InlineResponse200>> recoverVmFromRecycleBin(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmOperateParams vmOperateParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmRemoveCdRomParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("remove-vm-cd-rom")
  Call<List<WithTaskVm>> removeVmCdRom(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmRemoveCdRomParams vmRemoveCdRomParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmRemoveDiskParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("remove-vm-disk")
  Call<List<WithTaskVm>> removeVmDisk(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmRemoveDiskParams vmRemoveDiskParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmRemoveNicParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("remove-vm-nic")
  Call<List<WithTaskVm>> removeVmNic(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmRemoveNicParams vmRemoveNicParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmOperateParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("remove-vm-from-folder")
  Call<List<WithTaskVm>> removeVmToFolder(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmOperateParams vmOperateParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmOperateParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("restart-vm")
  Call<List<WithTaskVm>> restartVm(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmOperateParams vmOperateParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmOperateParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("resume-vm")
  Call<List<WithTaskVm>> resumeVm(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmOperateParams vmOperateParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmRollbackParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("rollback-vm")
  Call<List<WithTaskVm>> rollbackVm(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmRollbackParams vmRollbackParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmOperateParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("shutdown-vm")
  Call<List<WithTaskVm>> shutDownVm(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmOperateParams vmOperateParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmStartParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("start-vm")
  Call<List<WithTaskVm>> startVm(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmStartParams vmStartParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmOperateParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("suspend-vm")
  Call<List<WithTaskVm>> suspendVm(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmOperateParams vmOperateParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmUpdateParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-vm-basic-info")
  Call<List<WithTaskVm>> updateVm(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmUpdateParams vmUpdateParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmUpdateDiskParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-vm-disk")
  Call<List<WithTaskVm>> updateVmDisk(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmUpdateDiskParams vmUpdateDiskParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmUpdateNicParams  (required)
   * @return Call&lt;List&lt;WithTaskVm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-vm-nic")
  Call<List<WithTaskVm>> updateVmNic(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmUpdateNicParams vmUpdateNicParams
  );

}
