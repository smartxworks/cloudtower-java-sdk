package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetVmPlacementGroupsConnectionRequestBody;
import com.smartx.tower.model.GetVmPlacementGroupsRequestBody;
import com.smartx.tower.model.VmPlacementGroup;
import com.smartx.tower.model.VmPlacementGroupConnection;
import com.smartx.tower.model.VmPlacementGroupCreationParams;
import com.smartx.tower.model.VmPlacementGroupDeletionParams;
import com.smartx.tower.model.VmPlacementGroupUpdationParams;
import com.smartx.tower.model.WithTaskDeleteVmPlacementGroup;
import com.smartx.tower.model.WithTaskVmPlacementGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VmPlacementGroupApi {
  /**
   * 
   * 
   * @param vmPlacementGroupCreationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVmPlacementGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-vm-placement-group")
  Call<List<WithTaskVmPlacementGroup>> createVmPlacementGroup(
    @retrofit2.http.Body List<VmPlacementGroupCreationParams> vmPlacementGroupCreationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmPlacementGroupDeletionParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskDeleteVmPlacementGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-vm-placement-group")
  Call<List<WithTaskDeleteVmPlacementGroup>> deleteVmPlacementGroup(
    @retrofit2.http.Body VmPlacementGroupDeletionParams vmPlacementGroupDeletionParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getVmPlacementGroupsRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;VmPlacementGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vm-placement-groups")
  Call<List<VmPlacementGroup>> getVmPlacementGroups(
    @retrofit2.http.Body GetVmPlacementGroupsRequestBody getVmPlacementGroupsRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getVmPlacementGroupsConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;VmPlacementGroupConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vm-placement-groups-connection")
  Call<VmPlacementGroupConnection> getVmPlacementGroupsConnection(
    @retrofit2.http.Body GetVmPlacementGroupsConnectionRequestBody getVmPlacementGroupsConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmPlacementGroupUpdationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVmPlacementGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-vm-placement-group")
  Call<List<WithTaskVmPlacementGroup>> updateVmPlacementGroup(
    @retrofit2.http.Body VmPlacementGroupUpdationParams vmPlacementGroupUpdationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
