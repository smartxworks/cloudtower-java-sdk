package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetVmNicsConnectionRequestBody;
import com.smartx.tower.model.GetVmNicsRequestBody;
import com.smartx.tower.model.VmNic;
import com.smartx.tower.model.VmNicConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VmNicApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getVmNicsRequestBody  (required)
   * @return Call&lt;List&lt;VmNic&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vm-nics")
  Call<List<VmNic>> getVmNics(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetVmNicsRequestBody getVmNicsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getVmNicsConnectionRequestBody  (required)
   * @return Call&lt;VmNicConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vm-nics-connection")
  Call<VmNicConnection> getVmNicsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetVmNicsConnectionRequestBody getVmNicsConnectionRequestBody
  );

}
