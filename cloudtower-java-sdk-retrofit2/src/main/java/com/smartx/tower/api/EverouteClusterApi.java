package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.EverouteCluster;
import com.smartx.tower.model.EverouteClusterConnection;
import com.smartx.tower.model.GetEverouteClustersConnectionRequestBody;
import com.smartx.tower.model.GetEverouteClustersRequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EverouteClusterApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getEverouteClustersRequestBody  (required)
   * @return Call&lt;List&lt;EverouteCluster&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-everoute-clusters")
  Call<List<EverouteCluster>> getEverouteClusters(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetEverouteClustersRequestBody getEverouteClustersRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getEverouteClustersConnectionRequestBody  (required)
   * @return Call&lt;EverouteClusterConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-everoute-clusters-connection")
  Call<EverouteClusterConnection> getEverouteClustersConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetEverouteClustersConnectionRequestBody getEverouteClustersConnectionRequestBody
  );

}
