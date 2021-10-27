package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetLogCollectionsConnectionRequestBody;
import com.smartx.tower.model.GetLogCollectionsRequestBody;
import com.smartx.tower.model.LogCollection;
import com.smartx.tower.model.LogCollectionConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LogCollectionApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getLogCollectionsRequestBody  (required)
   * @return Call&lt;List&lt;LogCollection&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-log-collections")
  Call<List<LogCollection>> getLogCollections(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetLogCollectionsRequestBody getLogCollectionsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getLogCollectionsConnectionRequestBody  (required)
   * @return Call&lt;LogCollectionConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-log-collections-connection")
  Call<LogCollectionConnection> getLogCollectionsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetLogCollectionsConnectionRequestBody getLogCollectionsConnectionRequestBody
  );

}
