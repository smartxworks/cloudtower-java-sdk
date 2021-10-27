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
   * @param contentLanguage  (required)
   * @param clusterCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskCluster&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("connect-cluster")
  Call<List<WithTaskCluster>> connectCluster(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<ClusterCreationParams> clusterCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param clusterDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteCluster&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-cluster")
  Call<List<WithTaskDeleteCluster>> deleteCluster(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body ClusterDeletionParams clusterDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getClustersRequestBody  (required)
   * @return Call&lt;List&lt;Cluster&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-clusters")
  Call<List<Cluster>> getClusters(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetClustersRequestBody getClustersRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getClustersConnectionRequestBody  (required)
   * @return Call&lt;ClusterConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-clusters-connection")
  Call<ClusterConnection> getClustersConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetClustersConnectionRequestBody getClustersConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param clusterUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskCluster&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-cluster")
  Call<List<WithTaskCluster>> updateCluster(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body ClusterUpdationParams clusterUpdationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param clusterLicenseUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskCluster&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-cluster-license")
  Call<List<WithTaskCluster>> updateClusterLicense(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body ClusterLicenseUpdationParams clusterLicenseUpdationParams
  );

}
