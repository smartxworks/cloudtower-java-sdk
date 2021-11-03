package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetNvmfSubsystemsConnectionRequestBody;
import com.smartx.tower.model.GetNvmfSubsystemsRequestBody;
import com.smartx.tower.model.NvmfSubsystem;
import com.smartx.tower.model.NvmfSubsystemConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface NvmfSubsystemApi {
  /**
   * 
   * 
   * @param getNvmfSubsystemsRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;NvmfSubsystem&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-nvmf-subsystems")
  Call<List<NvmfSubsystem>> getNvmfSubsystems(
    @retrofit2.http.Body GetNvmfSubsystemsRequestBody getNvmfSubsystemsRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getNvmfSubsystemsConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;NvmfSubsystemConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-nvmf-subsystems-connection")
  Call<NvmfSubsystemConnection> getNvmfSubsystemsConnection(
    @retrofit2.http.Body GetNvmfSubsystemsConnectionRequestBody getNvmfSubsystemsConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
