package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetStoragePoliciesConnectorRequestBody;
import com.smartx.tower.model.StoragePolicyConector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StoragePolicyConectorApi {
  /**
   * 
   * 
   * @param getStoragePoliciesConnectorRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;StoragePolicyConector&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-storage-policies-connector")
  Call<List<StoragePolicyConector>> getStoragePoliciesConnector(
    @retrofit2.http.Body GetStoragePoliciesConnectorRequestBody getStoragePoliciesConnectorRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
