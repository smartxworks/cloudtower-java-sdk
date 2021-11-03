package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.Application;
import com.smartx.tower.model.ApplicationConnection;
import com.smartx.tower.model.GetApplicationsConnectionRequestBody;
import com.smartx.tower.model.GetApplicationsRequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ApplicationApi {
  /**
   * 
   * 
   * @param getApplicationsRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;Application&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-applications")
  Call<List<Application>> getApplications(
    @retrofit2.http.Body GetApplicationsRequestBody getApplicationsRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getApplicationsConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;ApplicationConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-applications-connection")
  Call<ApplicationConnection> getApplicationsConnection(
    @retrofit2.http.Body GetApplicationsConnectionRequestBody getApplicationsConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
