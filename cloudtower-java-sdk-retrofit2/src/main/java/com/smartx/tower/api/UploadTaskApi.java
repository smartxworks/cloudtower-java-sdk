package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetUploadTasksConnectionRequestBody;
import com.smartx.tower.model.GetUploadTasksRequestBody;
import com.smartx.tower.model.UploadTask;
import com.smartx.tower.model.UploadTaskConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UploadTaskApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getUploadTasksRequestBody  (required)
   * @return Call&lt;List&lt;UploadTask&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-upload-tasks")
  Call<List<UploadTask>> getUploadTasks(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetUploadTasksRequestBody getUploadTasksRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getUploadTasksConnectionRequestBody  (required)
   * @return Call&lt;UploadTaskConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-upload-tasks-connection")
  Call<UploadTaskConnection> getUploadTasksConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetUploadTasksConnectionRequestBody getUploadTasksConnectionRequestBody
  );

}
