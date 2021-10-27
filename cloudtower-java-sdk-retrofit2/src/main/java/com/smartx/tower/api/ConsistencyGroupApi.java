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
   * @param contentLanguage  (required)
   * @param consistencyGroupCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskConsistencyGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-consistency-group")
  Call<List<WithTaskConsistencyGroup>> createConsistencyGroup(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<ConsistencyGroupCreationParams> consistencyGroupCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param consistencyGroupDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteConsistencyGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-consistency-group")
  Call<List<WithTaskDeleteConsistencyGroup>> deleteConsistencyGroup(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body ConsistencyGroupDeletionParams consistencyGroupDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getConsistencyGroupsRequestBody  (required)
   * @return Call&lt;List&lt;ConsistencyGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-consistency-groups")
  Call<List<ConsistencyGroup>> getConsistencyGroups(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetConsistencyGroupsRequestBody getConsistencyGroupsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getConsistencyGroupsConnectionRequestBody  (required)
   * @return Call&lt;ConsistencyGroupConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-consistency-groups-connection")
  Call<ConsistencyGroupConnection> getConsistencyGroupsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetConsistencyGroupsConnectionRequestBody getConsistencyGroupsConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param consistencyGroupUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskConsistencyGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-consistency-group")
  Call<List<WithTaskConsistencyGroup>> updateConsistencyGroup(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body ConsistencyGroupUpdationParams consistencyGroupUpdationParams
  );

}
