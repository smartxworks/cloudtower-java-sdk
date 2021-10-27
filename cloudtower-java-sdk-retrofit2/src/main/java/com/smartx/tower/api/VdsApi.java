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
   * @param contentLanguage  (required)
   * @param vdsCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskVds&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-vds")
  Call<List<WithTaskVds>> createVds(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<VdsCreationParams> vdsCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vdsCreationWithMAccessVlanParams  (required)
   * @return Call&lt;List&lt;WithTaskVds&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-vds-with-access-vlan")
  Call<List<WithTaskVds>> createVdsWithAccessVlan(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<VdsCreationWithMAccessVlanParams> vdsCreationWithMAccessVlanParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vdsCreationWithMigrateVlanParams  (required)
   * @return Call&lt;List&lt;WithTaskVds&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-vds-with-migrate-vlan")
  Call<List<WithTaskVds>> createVdsWithMigrateVlan(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<VdsCreationWithMigrateVlanParams> vdsCreationWithMigrateVlanParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vdsDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteVds&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-vds")
  Call<List<WithTaskDeleteVds>> deleteVds(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VdsDeletionParams vdsDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getVdsesRequestBody  (required)
   * @return Call&lt;List&lt;Vds&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vdses")
  Call<List<Vds>> getVdses(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetVdsesRequestBody getVdsesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getVdsesConnectionRequestBody  (required)
   * @return Call&lt;VdsConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vdses-connection")
  Call<VdsConnection> getVdsesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetVdsesConnectionRequestBody getVdsesConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vdsUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskVds&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-vds")
  Call<List<WithTaskVds>> updateVds(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VdsUpdationParams vdsUpdationParams
  );

}
