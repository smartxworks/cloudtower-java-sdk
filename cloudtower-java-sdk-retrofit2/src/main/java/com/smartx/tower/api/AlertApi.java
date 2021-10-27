package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.Alert;
import com.smartx.tower.model.AlertConnection;
import com.smartx.tower.model.GetAlertsConnectionRequestBody;
import com.smartx.tower.model.GetAlertsRequestBody;
import com.smartx.tower.model.ResolveAlertParams;
import com.smartx.tower.model.WithTaskAlert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AlertApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getAlertsRequestBody  (required)
   * @return Call&lt;List&lt;Alert&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-alerts")
  Call<List<Alert>> getAlerts(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetAlertsRequestBody getAlertsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getAlertsConnectionRequestBody  (required)
   * @return Call&lt;AlertConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-alerts-connection")
  Call<AlertConnection> getAlertsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetAlertsConnectionRequestBody getAlertsConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param resolveAlertParams  (required)
   * @return Call&lt;List&lt;WithTaskAlert&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("resolve-alert")
  Call<List<WithTaskAlert>> resolveAlert(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body ResolveAlertParams resolveAlertParams
  );

}
