package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.CustomizeAlertRuleUpdationParams;
import com.smartx.tower.model.GetGlobalAlertRulesConnectionRequestBody;
import com.smartx.tower.model.GetGlobalAlertRulesRequestBody;
import com.smartx.tower.model.GlobalAlertRule;
import com.smartx.tower.model.GlobalAlertRuleConnection;
import com.smartx.tower.model.GlobalAlertRuleUpdationParams;
import com.smartx.tower.model.WithTaskGlobalAlertRule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GlobalAlertRuleApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getGlobalAlertRulesRequestBody  (required)
   * @return Call&lt;List&lt;GlobalAlertRule&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-global-alert-rules")
  Call<List<GlobalAlertRule>> getGlobalAlertRules(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetGlobalAlertRulesRequestBody getGlobalAlertRulesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getGlobalAlertRulesConnectionRequestBody  (required)
   * @return Call&lt;GlobalAlertRuleConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-global-alert-rules-connection")
  Call<GlobalAlertRuleConnection> getGlobalAlertRulesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetGlobalAlertRulesConnectionRequestBody getGlobalAlertRulesConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param customizeAlertRuleUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskGlobalAlertRule&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-customize-alert-rule")
  Call<List<WithTaskGlobalAlertRule>> updateCustomizeAlertRule(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body CustomizeAlertRuleUpdationParams customizeAlertRuleUpdationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param globalAlertRuleUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskGlobalAlertRule&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-global-alert-rule")
  Call<List<WithTaskGlobalAlertRule>> updateGlobalAlertRule(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GlobalAlertRuleUpdationParams globalAlertRuleUpdationParams
  );

}
