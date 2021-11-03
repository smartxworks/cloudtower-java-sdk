package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.Cluster;
import com.smartx.tower.model.ClusterConnection;
import com.smartx.tower.model.ClusterCreationParams;
import com.smartx.tower.model.ClusterDeletionParams;
import com.smartx.tower.model.ClusterLicenseUpdationParams;
import com.smartx.tower.model.ClusterUpdationParams;
import com.smartx.tower.model.GetClustersConnectionRequestBody;
import com.smartx.tower.model.GetClustersRequestBody;
import com.smartx.tower.model.WithTaskCluster;
import com.smartx.tower.model.WithTaskDeleteCluster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ClusterApi {
  /**
   * 
   * 
   * @param clusterCreationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskCluster&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("connect-cluster")
  Call<List<WithTaskCluster>> connectCluster(
    @retrofit2.http.Body List<ClusterCreationParams> clusterCreationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param clusterDeletionParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskDeleteCluster&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-cluster")
  Call<List<WithTaskDeleteCluster>> deleteCluster(
    @retrofit2.http.Body ClusterDeletionParams clusterDeletionParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getClustersRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;Cluster&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-clusters")
  Call<List<Cluster>> getClusters(
    @retrofit2.http.Body GetClustersRequestBody getClustersRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getClustersConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;ClusterConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-clusters-connection")
  Call<ClusterConnection> getClustersConnection(
    @retrofit2.http.Body GetClustersConnectionRequestBody getClustersConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param clusterUpdationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskCluster&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-cluster")
  Call<List<WithTaskCluster>> updateCluster(
    @retrofit2.http.Body ClusterUpdationParams clusterUpdationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param clusterLicenseUpdationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskCluster&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-cluster-license")
  Call<List<WithTaskCluster>> updateClusterLicense(
    @retrofit2.http.Body ClusterLicenseUpdationParams clusterLicenseUpdationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
