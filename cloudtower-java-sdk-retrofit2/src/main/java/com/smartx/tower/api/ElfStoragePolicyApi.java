package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.ElfStoragePolicy;
import com.smartx.tower.model.ElfStoragePolicyConnection;
import com.smartx.tower.model.GetElfStoragePoliciesConnectionRequestBody;
import com.smartx.tower.model.GetElfStoragePoliciesRequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ElfStoragePolicyApi {
  /**
   * 
   * 
   * @param getElfStoragePoliciesRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;ElfStoragePolicy&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-elf-storage-policies")
  Call<List<ElfStoragePolicy>> getElfStoragePolicies(
    @retrofit2.http.Body GetElfStoragePoliciesRequestBody getElfStoragePoliciesRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getElfStoragePoliciesConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;ElfStoragePolicyConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-elf-storage-policies-connection")
  Call<ElfStoragePolicyConnection> getElfStoragePoliciesConnection(
    @retrofit2.http.Body GetElfStoragePoliciesConnectionRequestBody getElfStoragePoliciesConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
