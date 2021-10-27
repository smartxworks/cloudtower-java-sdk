package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetVlansConnectionRequestBody;
import com.smartx.tower.model.GetVlansRequestBody;
import com.smartx.tower.model.ManagementVlanUpdationParams;
import com.smartx.tower.model.MigrationVlanUpdationParams;
import com.smartx.tower.model.Vlan;
import com.smartx.tower.model.VlanConnection;
import com.smartx.tower.model.VlanDeletionParams;
import com.smartx.tower.model.VmVlanCreationParams;
import com.smartx.tower.model.VmVlanUpdationParams;
import com.smartx.tower.model.WithTaskDeleteVlan;
import com.smartx.tower.model.WithTaskVlan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VlanApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmVlanCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskVlan&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-vm-vlan")
  Call<List<WithTaskVlan>> createVmVlan(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<VmVlanCreationParams> vmVlanCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vlanDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteVlan&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-vm-vlan")
  Call<List<WithTaskDeleteVlan>> deleteVlan(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VlanDeletionParams vlanDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getVlansRequestBody  (required)
   * @return Call&lt;List&lt;Vlan&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vlans")
  Call<List<Vlan>> getVlans(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetVlansRequestBody getVlansRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getVlansConnectionRequestBody  (required)
   * @return Call&lt;VlanConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vlans-connection")
  Call<VlanConnection> getVlansConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetVlansConnectionRequestBody getVlansConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param managementVlanUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskVlan&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-management-vlan")
  Call<List<WithTaskVlan>> updateManagementVlan(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body ManagementVlanUpdationParams managementVlanUpdationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param migrationVlanUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskVlan&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-migration-vlan")
  Call<List<WithTaskVlan>> updateMigrationVlan(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body MigrationVlanUpdationParams migrationVlanUpdationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmVlanUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskVlan&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-vm-vlan")
  Call<List<WithTaskVlan>> updateVlan(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmVlanUpdationParams vmVlanUpdationParams
  );

}
