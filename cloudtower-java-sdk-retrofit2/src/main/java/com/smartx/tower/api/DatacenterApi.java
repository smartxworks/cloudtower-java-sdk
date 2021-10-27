package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.Datacenter;
import com.smartx.tower.model.DatacenterConnection;
import com.smartx.tower.model.DatacenterCreationParams;
import com.smartx.tower.model.DatacenterDeletionParams;
import com.smartx.tower.model.DatacenterUpdationParams;
import com.smartx.tower.model.GetDatacentersConnectionRequestBody;
import com.smartx.tower.model.GetDatacentersRequestBody;
import com.smartx.tower.model.WithTaskDatacenter;
import com.smartx.tower.model.WithTaskDeleteDatacenter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DatacenterApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param datacenterCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskDatacenter&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-datacenter")
  Call<List<WithTaskDatacenter>> createDatacenter(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<DatacenterCreationParams> datacenterCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param datacenterDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteDatacenter&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-datacenter")
  Call<List<WithTaskDeleteDatacenter>> deleteDatacenter(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body DatacenterDeletionParams datacenterDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getDatacentersRequestBody  (required)
   * @return Call&lt;List&lt;Datacenter&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-datacenters")
  Call<List<Datacenter>> getDatacenters(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetDatacentersRequestBody getDatacentersRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getDatacentersConnectionRequestBody  (required)
   * @return Call&lt;DatacenterConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-datacenters-connection")
  Call<DatacenterConnection> getDatacentersConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetDatacentersConnectionRequestBody getDatacentersConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param datacenterUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskDatacenter&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-datacenter")
  Call<List<WithTaskDatacenter>> updateDatacenter(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body DatacenterUpdationParams datacenterUpdationParams
  );

}
