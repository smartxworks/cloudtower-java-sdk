package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetSnapshotPlanTasksConnectionRequestBody;
import com.smartx.tower.model.GetSnapshotPlanTasksRequestBody;
import com.smartx.tower.model.SnapshotPlanTask;
import com.smartx.tower.model.SnapshotPlanTaskConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SnapshotPlanTaskApi {
  /**
   * 
   * 
   * @param getSnapshotPlanTasksRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;SnapshotPlanTask&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-snapshot-plan-tasks")
  Call<List<SnapshotPlanTask>> getSnapshotPlanTasks(
    @retrofit2.http.Body GetSnapshotPlanTasksRequestBody getSnapshotPlanTasksRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getSnapshotPlanTasksConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;SnapshotPlanTaskConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-snapshot-plan-tasks-connection")
  Call<SnapshotPlanTaskConnection> getSnapshotPlanTasksConnection(
    @retrofit2.http.Body GetSnapshotPlanTasksConnectionRequestBody getSnapshotPlanTasksConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
