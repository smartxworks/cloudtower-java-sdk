package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetVdsesConnectionRequestBody;
import com.smartx.tower.model.GetVdsesRequestBody;
import com.smartx.tower.model.Vds;
import com.smartx.tower.model.VdsConnection;
import com.smartx.tower.model.VdsCreationParams;
import com.smartx.tower.model.VdsCreationWithMAccessVlanParams;
import com.smartx.tower.model.VdsCreationWithMigrateVlanParams;
import com.smartx.tower.model.VdsDeletionParams;
import com.smartx.tower.model.VdsUpdationParams;
import com.smartx.tower.model.WithTaskDeleteVds;
import com.smartx.tower.model.WithTaskVds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VdsApi {
  /**
   * 
   * 
   * @param vdsCreationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVds&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-vds")
  Call<List<WithTaskVds>> createVds(
    @retrofit2.http.Body List<VdsCreationParams> vdsCreationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vdsCreationWithMAccessVlanParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVds&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-vds-with-access-vlan")
  Call<List<WithTaskVds>> createVdsWithAccessVlan(
    @retrofit2.http.Body List<VdsCreationWithMAccessVlanParams> vdsCreationWithMAccessVlanParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vdsCreationWithMigrateVlanParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVds&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-vds-with-migrate-vlan")
  Call<List<WithTaskVds>> createVdsWithMigrateVlan(
    @retrofit2.http.Body List<VdsCreationWithMigrateVlanParams> vdsCreationWithMigrateVlanParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vdsDeletionParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskDeleteVds&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-vds")
  Call<List<WithTaskDeleteVds>> deleteVds(
    @retrofit2.http.Body VdsDeletionParams vdsDeletionParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getVdsesRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;Vds&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vdses")
  Call<List<Vds>> getVdses(
    @retrofit2.http.Body GetVdsesRequestBody getVdsesRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getVdsesConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;VdsConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vdses-connection")
  Call<VdsConnection> getVdsesConnection(
    @retrofit2.http.Body GetVdsesConnectionRequestBody getVdsesConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vdsUpdationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVds&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-vds")
  Call<List<WithTaskVds>> updateVds(
    @retrofit2.http.Body VdsUpdationParams vdsUpdationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
