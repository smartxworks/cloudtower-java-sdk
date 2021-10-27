package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.ElfDataStore;
import com.smartx.tower.model.ElfDataStoreConnection;
import com.smartx.tower.model.GetElfDataStoresConnectionRequestBody;
import com.smartx.tower.model.GetElfDataStoresRequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ElfDataStoreApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getElfDataStoresRequestBody  (required)
   * @return Call&lt;List&lt;ElfDataStore&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-elf-data-stores")
  Call<List<ElfDataStore>> getElfDataStores(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetElfDataStoresRequestBody getElfDataStoresRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getElfDataStoresConnectionRequestBody  (required)
   * @return Call&lt;ElfDataStoreConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-elf-data-stores-connection")
  Call<ElfDataStoreConnection> getElfDataStoresConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetElfDataStoresConnectionRequestBody getElfDataStoresConnectionRequestBody
  );

}
