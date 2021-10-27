package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetUserAuditLogsConnectionRequestBody;
import com.smartx.tower.model.GetUserAuditLogsRequestBody;
import com.smartx.tower.model.UserAuditLog;
import com.smartx.tower.model.UserAuditLogConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserAuditLogApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getUserAuditLogsRequestBody  (required)
   * @return Call&lt;List&lt;UserAuditLog&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-user-audit-logs")
  Call<List<UserAuditLog>> getUserAuditLogs(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetUserAuditLogsRequestBody getUserAuditLogsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getUserAuditLogsConnectionRequestBody  (required)
   * @return Call&lt;UserAuditLogConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-user-audit-logs-connection")
  Call<UserAuditLogConnection> getUserAuditLogsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetUserAuditLogsConnectionRequestBody getUserAuditLogsConnectionRequestBody
  );

}
