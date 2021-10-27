package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetSnapshotPlansConnectionRequestBody;
import com.smartx.tower.model.GetSnapshotPlansRequestBody;
import com.smartx.tower.model.SnapshotPlan;
import com.smartx.tower.model.SnapshotPlanConnection;
import com.smartx.tower.model.SnapshotPlanCreationParams;
import com.smartx.tower.model.SnapshotPlanDeletionParams;
import com.smartx.tower.model.SnapshotPlanExecutionParams;
import com.smartx.tower.model.SnapshotPlanResumeParams;
import com.smartx.tower.model.SnapshotPlanSuspendedParams;
import com.smartx.tower.model.SnapshotPlanUpdationParams;
import com.smartx.tower.model.WithTaskDeleteSnapshotPlan;
import com.smartx.tower.model.WithTaskSnapshotPlan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SnapshotPlanApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param snapshotPlanCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskSnapshotPlan&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-snapshot-plan")
  Call<List<WithTaskSnapshotPlan>> createSnapshotPlan(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<SnapshotPlanCreationParams> snapshotPlanCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param snapshotPlanDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteSnapshotPlan&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-snapshot-plan")
  Call<List<WithTaskDeleteSnapshotPlan>> deleteSnapshotPlan(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body SnapshotPlanDeletionParams snapshotPlanDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param snapshotPlanExecutionParams  (required)
   * @return Call&lt;List&lt;WithTaskSnapshotPlan&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("execute-snapshot-plan")
  Call<List<WithTaskSnapshotPlan>> executeSnapshotPlan(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body SnapshotPlanExecutionParams snapshotPlanExecutionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getSnapshotPlansRequestBody  (required)
   * @return Call&lt;List&lt;SnapshotPlan&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-snapshot-plans")
  Call<List<SnapshotPlan>> getSnapshotPlans(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetSnapshotPlansRequestBody getSnapshotPlansRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getSnapshotPlansConnectionRequestBody  (required)
   * @return Call&lt;SnapshotPlanConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-snapshot-plans-connection")
  Call<SnapshotPlanConnection> getSnapshotPlansConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetSnapshotPlansConnectionRequestBody getSnapshotPlansConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param snapshotPlanResumeParams  (required)
   * @return Call&lt;List&lt;WithTaskSnapshotPlan&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("resume-snapshot-plan")
  Call<List<WithTaskSnapshotPlan>> resumeSnapshotPlan(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body SnapshotPlanResumeParams snapshotPlanResumeParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param snapshotPlanSuspendedParams  (required)
   * @return Call&lt;List&lt;WithTaskSnapshotPlan&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("suspend-snapshot-plan")
  Call<List<WithTaskSnapshotPlan>> suspendSnapshotPlan(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body SnapshotPlanSuspendedParams snapshotPlanSuspendedParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param snapshotPlanUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskSnapshotPlan&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-snapshot-plan")
  Call<List<WithTaskSnapshotPlan>> updateSnapshotPlan(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body SnapshotPlanUpdationParams snapshotPlanUpdationParams
  );

}
