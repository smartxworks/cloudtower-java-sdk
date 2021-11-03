package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.ClusterTopo;
import com.smartx.tower.model.ClusterTopoConnection;
import com.smartx.tower.model.GetClusterTopoesConnectionRequestBody;
import com.smartx.tower.model.GetClusterTopoesRequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ClusterTopoApi {
  /**
   * 
   * 
   * @param getClusterTopoesRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;ClusterTopo&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-cluster-topoes")
  Call<List<ClusterTopo>> getClusterTopoes(
    @retrofit2.http.Body GetClusterTopoesRequestBody getClusterTopoesRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getClusterTopoesConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;ClusterTopoConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-cluster-topoes-connection")
  Call<ClusterTopoConnection> getClusterTopoesConnection(
    @retrofit2.http.Body GetClusterTopoesConnectionRequestBody getClusterTopoesConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
