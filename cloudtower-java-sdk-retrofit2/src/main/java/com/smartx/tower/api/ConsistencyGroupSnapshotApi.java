package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.ConsistencyGroupSnapshot;
import com.smartx.tower.model.ConsistencyGroupSnapshotConnection;
import com.smartx.tower.model.ConsistencyGroupSnapshotCreationParams;
import com.smartx.tower.model.ConsistencyGroupSnapshotDeletionParams;
import com.smartx.tower.model.ConsistencyGroupSnapshotUpdationParams;
import com.smartx.tower.model.GetConsistencyGroupSnapshotsConnectionRequestBody;
import com.smartx.tower.model.GetConsistencyGroupSnapshotsRequestBody;
import com.smartx.tower.model.WithTaskConsistencyGroupSnapshot;
import com.smartx.tower.model.WithTaskDeleteConsistencyGroupSnapshot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ConsistencyGroupSnapshotApi {
  /**
   * 
   * 
   * @param consistencyGroupSnapshotCreationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskConsistencyGroupSnapshot&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-consistency-snapshot-group")
  Call<List<WithTaskConsistencyGroupSnapshot>> createConsistencyGroupSnapshot(
    @retrofit2.http.Body List<ConsistencyGroupSnapshotCreationParams> consistencyGroupSnapshotCreationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param consistencyGroupSnapshotDeletionParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskDeleteConsistencyGroupSnapshot&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-consistency-snapshot-group")
  Call<List<WithTaskDeleteConsistencyGroupSnapshot>> deleteConsistencyGroupSnapshot(
    @retrofit2.http.Body ConsistencyGroupSnapshotDeletionParams consistencyGroupSnapshotDeletionParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getConsistencyGroupSnapshotsRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;ConsistencyGroupSnapshot&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-consistency-group-snapshots")
  Call<List<ConsistencyGroupSnapshot>> getConsistencyGroupSnapshots(
    @retrofit2.http.Body GetConsistencyGroupSnapshotsRequestBody getConsistencyGroupSnapshotsRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getConsistencyGroupSnapshotsConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;ConsistencyGroupSnapshotConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-consistency-group-snapshots-connection")
  Call<ConsistencyGroupSnapshotConnection> getConsistencyGroupSnapshotsConnection(
    @retrofit2.http.Body GetConsistencyGroupSnapshotsConnectionRequestBody getConsistencyGroupSnapshotsConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param consistencyGroupSnapshotUpdationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskConsistencyGroupSnapshot&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("rollback-consistency-snapshot-group")
  Call<List<WithTaskConsistencyGroupSnapshot>> updateConsistencyGroupSnapshot(
    @retrofit2.http.Body ConsistencyGroupSnapshotUpdationParams consistencyGroupSnapshotUpdationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
