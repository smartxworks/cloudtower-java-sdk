package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetTasksConnectionRequestBody;
import com.smartx.tower.model.GetTasksRequestBody;
import com.smartx.tower.model.Task;
import com.smartx.tower.model.TaskConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TaskApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getTasksRequestBody  (required)
   * @return Call&lt;List&lt;Task&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-tasks")
  Call<List<Task>> getTasks(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetTasksRequestBody getTasksRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getTasksConnectionRequestBody  (required)
   * @return Call&lt;TaskConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-tasks-connection")
  Call<TaskConnection> getTasksConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetTasksConnectionRequestBody getTasksConnectionRequestBody
  );

}
