package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetSnapshotGroupsConnectionRequestBody;
import com.smartx.tower.model.GetSnapshotGroupsRequestBody;
import com.smartx.tower.model.SnapshotGroup;
import com.smartx.tower.model.SnapshotGroupCloneParams;
import com.smartx.tower.model.SnapshotGroupConnection;
import com.smartx.tower.model.SnapshotGroupDeletionParams;
import com.smartx.tower.model.SnapshotGroupKeepParams;
import com.smartx.tower.model.SnapshotGroupRollbackParams;
import com.smartx.tower.model.WithTaskDeleteSnapshotGroup;
import com.smartx.tower.model.WithTaskSnapshotGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SnapshotGroupApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param snapshotGroupCloneParams  (required)
   * @return Call&lt;List&lt;WithTaskSnapshotGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("clone-snapshot-group")
  Call<List<WithTaskSnapshotGroup>> cloneSnapshotGroup(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<SnapshotGroupCloneParams> snapshotGroupCloneParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param snapshotGroupDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteSnapshotGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-snapshot-group")
  Call<List<WithTaskDeleteSnapshotGroup>> deleteSnapshotGroup(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body SnapshotGroupDeletionParams snapshotGroupDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getSnapshotGroupsRequestBody  (required)
   * @return Call&lt;List&lt;SnapshotGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-snapshot-groups")
  Call<List<SnapshotGroup>> getSnapshotGroups(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetSnapshotGroupsRequestBody getSnapshotGroupsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getSnapshotGroupsConnectionRequestBody  (required)
   * @return Call&lt;SnapshotGroupConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-snapshot-groups-connection")
  Call<SnapshotGroupConnection> getSnapshotGroupsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetSnapshotGroupsConnectionRequestBody getSnapshotGroupsConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param snapshotGroupKeepParams  (required)
   * @return Call&lt;List&lt;WithTaskSnapshotGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("keep-snapshot-group")
  Call<List<WithTaskSnapshotGroup>> keepSnapshotGroup(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body SnapshotGroupKeepParams snapshotGroupKeepParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param snapshotGroupRollbackParams  (required)
   * @return Call&lt;List&lt;WithTaskSnapshotGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("rollback-snapshot-group")
  Call<List<WithTaskSnapshotGroup>> rollbackSnapshotGroup(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body SnapshotGroupRollbackParams snapshotGroupRollbackParams
  );

}
