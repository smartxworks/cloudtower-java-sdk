package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetSystemAuditLogsConnectionRequestBody;
import com.smartx.tower.model.GetSystemAuditLogsRequestBody;
import com.smartx.tower.model.SystemAuditLog;
import com.smartx.tower.model.SystemAuditLogConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SystemAuditLogApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getSystemAuditLogsRequestBody  (required)
   * @return Call&lt;List&lt;SystemAuditLog&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-system-audit-logs")
  Call<List<SystemAuditLog>> getSystemAuditLogs(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetSystemAuditLogsRequestBody getSystemAuditLogsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getSystemAuditLogsConnectionRequestBody  (required)
   * @return Call&lt;SystemAuditLogConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-system-audit-logs-connection")
  Call<SystemAuditLogConnection> getSystemAuditLogsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetSystemAuditLogsConnectionRequestBody getSystemAuditLogsConnectionRequestBody
  );

}
