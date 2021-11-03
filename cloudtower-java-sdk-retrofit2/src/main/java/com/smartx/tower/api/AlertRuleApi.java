package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.AlertRule;
import com.smartx.tower.model.AlertRuleConnection;
import com.smartx.tower.model.GetAlertRulesConnectionRequestBody;
import com.smartx.tower.model.GetAlertRulesRequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AlertRuleApi {
  /**
   * 
   * 
   * @param getAlertRulesRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;AlertRule&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-alert-rules")
  Call<List<AlertRule>> getAlertRules(
    @retrofit2.http.Body GetAlertRulesRequestBody getAlertRulesRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getAlertRulesConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;AlertRuleConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-alert-rules-connection")
  Call<AlertRuleConnection> getAlertRulesConnection(
    @retrofit2.http.Body GetAlertRulesConnectionRequestBody getAlertRulesConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
