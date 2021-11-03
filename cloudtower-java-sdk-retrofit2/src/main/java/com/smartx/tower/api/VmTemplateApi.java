package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetVmTemplatesConnectionRequestBody;
import com.smartx.tower.model.GetVmTemplatesRequestBody;
import com.smartx.tower.model.VmTemplate;
import com.smartx.tower.model.VmTemplateConnection;
import com.smartx.tower.model.VmTemplateCreationParams;
import com.smartx.tower.model.VmTemplateDeletionParams;
import com.smartx.tower.model.VmTemplateUpdationParams;
import com.smartx.tower.model.WithTaskDeleteVmTemplate;
import com.smartx.tower.model.WithTaskVmTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VmTemplateApi {
  /**
   * 
   * 
   * @param vmTemplateCreationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVmTemplate&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("clone-vm-template-from-vm")
  Call<List<WithTaskVmTemplate>> cloneVmTemplateFromVm(
    @retrofit2.http.Body List<VmTemplateCreationParams> vmTemplateCreationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmTemplateCreationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVmTemplate&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("convert-vm-template-from-vm")
  Call<List<WithTaskVmTemplate>> convertVmTemplateFromVm(
    @retrofit2.http.Body List<VmTemplateCreationParams> vmTemplateCreationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmTemplateDeletionParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskDeleteVmTemplate&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-vm-template")
  Call<List<WithTaskDeleteVmTemplate>> deleteVmTemplateFromVm(
    @retrofit2.http.Body VmTemplateDeletionParams vmTemplateDeletionParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getVmTemplatesRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;VmTemplate&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vm-templates")
  Call<List<VmTemplate>> getVmTemplates(
    @retrofit2.http.Body GetVmTemplatesRequestBody getVmTemplatesRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getVmTemplatesConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;VmTemplateConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vm-templates-connection")
  Call<VmTemplateConnection> getVmTemplatesConnection(
    @retrofit2.http.Body GetVmTemplatesConnectionRequestBody getVmTemplatesConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmTemplateUpdationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVmTemplate&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-vm-template")
  Call<List<WithTaskVmTemplate>> updateVmTemplateFromVm(
    @retrofit2.http.Body VmTemplateUpdationParams vmTemplateUpdationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
