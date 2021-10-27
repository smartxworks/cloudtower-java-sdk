package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetReportTasksConnectionRequestBody;
import com.smartx.tower.model.GetReportTasksRequestBody;
import com.smartx.tower.model.ReportTask;
import com.smartx.tower.model.ReportTaskConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ReportTaskApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getReportTasksRequestBody  (required)
   * @return Call&lt;List&lt;ReportTask&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-report-tasks")
  Call<List<ReportTask>> getReportTasks(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetReportTasksRequestBody getReportTasksRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getReportTasksConnectionRequestBody  (required)
   * @return Call&lt;ReportTaskConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-report-tasks-connection")
  Call<ReportTaskConnection> getReportTasksConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetReportTasksConnectionRequestBody getReportTasksConnectionRequestBody
  );

}
