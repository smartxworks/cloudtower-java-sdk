package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.NvmfSubsystemCreationParams;
import com.smartx.tower.model.NvmfSubsystemDeletionParams;
import com.smartx.tower.model.NvmfSubsystemUpdationParams;
import com.smartx.tower.model.WithTaskDeleteNvmfSubsystem;
import com.smartx.tower.model.WithTaskNvmfSubsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DefaultApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param nvmfSubsystemCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskNvmfSubsystem&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-nvmf-subsystem")
  Call<List<WithTaskNvmfSubsystem>> createNvmfSubsystem(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<NvmfSubsystemCreationParams> nvmfSubsystemCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param nvmfSubsystemDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteNvmfSubsystem&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-nvmf-subsystem")
  Call<List<WithTaskDeleteNvmfSubsystem>> deleteNvmfSubsystem(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body NvmfSubsystemDeletionParams nvmfSubsystemDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param nvmfSubsystemUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskNvmfSubsystem&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-nvmf-subsystem")
  Call<List<WithTaskNvmfSubsystem>> updateNvmfSubsystem(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body NvmfSubsystemUpdationParams nvmfSubsystemUpdationParams
  );

}
