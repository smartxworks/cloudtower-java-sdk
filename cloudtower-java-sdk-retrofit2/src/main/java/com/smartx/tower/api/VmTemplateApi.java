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
   * @param contentLanguage  (required)
   * @param vmTemplateCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskVmTemplate&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("clone-vm-template-from-vm")
  Call<List<WithTaskVmTemplate>> cloneVmTemplateFromVm(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<VmTemplateCreationParams> vmTemplateCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmTemplateCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskVmTemplate&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("convert-vm-template-from-vm")
  Call<List<WithTaskVmTemplate>> convertVmTemplateFromVm(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<VmTemplateCreationParams> vmTemplateCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmTemplateDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteVmTemplate&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-vm-template")
  Call<List<WithTaskDeleteVmTemplate>> deleteVmTemplateFromVm(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmTemplateDeletionParams vmTemplateDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getVmTemplatesRequestBody  (required)
   * @return Call&lt;List&lt;VmTemplate&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vm-templates")
  Call<List<VmTemplate>> getVmTemplates(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetVmTemplatesRequestBody getVmTemplatesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getVmTemplatesConnectionRequestBody  (required)
   * @return Call&lt;VmTemplateConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vm-templates-connection")
  Call<VmTemplateConnection> getVmTemplatesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetVmTemplatesConnectionRequestBody getVmTemplatesConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmTemplateUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskVmTemplate&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-vm-template")
  Call<List<WithTaskVmTemplate>> updateVmTemplateFromVm(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmTemplateUpdationParams vmTemplateUpdationParams
  );

}
