package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.ConsistencyGroup;
import com.smartx.tower.model.ConsistencyGroupConnection;
import com.smartx.tower.model.ConsistencyGroupCreationParams;
import com.smartx.tower.model.ConsistencyGroupDeletionParams;
import com.smartx.tower.model.ConsistencyGroupUpdationParams;
import com.smartx.tower.model.GetConsistencyGroupsConnectionRequestBody;
import com.smartx.tower.model.GetConsistencyGroupsRequestBody;
import com.smartx.tower.model.WithTaskConsistencyGroup;
import com.smartx.tower.model.WithTaskDeleteConsistencyGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ConsistencyGroupApi {
  /**
   * 
   * 
   * @param consistencyGroupCreationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskConsistencyGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-consistency-group")
  Call<List<WithTaskConsistencyGroup>> createConsistencyGroup(
    @retrofit2.http.Body List<ConsistencyGroupCreationParams> consistencyGroupCreationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param consistencyGroupDeletionParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskDeleteConsistencyGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-consistency-group")
  Call<List<WithTaskDeleteConsistencyGroup>> deleteConsistencyGroup(
    @retrofit2.http.Body ConsistencyGroupDeletionParams consistencyGroupDeletionParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getConsistencyGroupsRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;ConsistencyGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-consistency-groups")
  Call<List<ConsistencyGroup>> getConsistencyGroups(
    @retrofit2.http.Body GetConsistencyGroupsRequestBody getConsistencyGroupsRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getConsistencyGroupsConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;ConsistencyGroupConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-consistency-groups-connection")
  Call<ConsistencyGroupConnection> getConsistencyGroupsConnection(
    @retrofit2.http.Body GetConsistencyGroupsConnectionRequestBody getConsistencyGroupsConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param consistencyGroupUpdationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskConsistencyGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-consistency-group")
  Call<List<WithTaskConsistencyGroup>> updateConsistencyGroup(
    @retrofit2.http.Body ConsistencyGroupUpdationParams consistencyGroupUpdationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
