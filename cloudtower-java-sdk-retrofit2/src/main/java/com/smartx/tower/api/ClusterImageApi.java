package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.ClusterImage;
import com.smartx.tower.model.ClusterImageConnection;
import com.smartx.tower.model.GetClusterImagesConnectionRequestBody;
import com.smartx.tower.model.GetClusterImagesRequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ClusterImageApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getClusterImagesRequestBody  (required)
   * @return Call&lt;List&lt;ClusterImage&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-cluster-images")
  Call<List<ClusterImage>> getClusterImages(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetClusterImagesRequestBody getClusterImagesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getClusterImagesConnectionRequestBody  (required)
   * @return Call&lt;ClusterImageConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-cluster-images-connection")
  Call<ClusterImageConnection> getClusterImagesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetClusterImagesConnectionRequestBody getClusterImagesConnectionRequestBody
  );

}
