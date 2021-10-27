package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetSecurityPoliciesConnectionRequestBody;
import com.smartx.tower.model.GetSecurityPoliciesRequestBody;
import com.smartx.tower.model.SecurityPolicy;
import com.smartx.tower.model.SecurityPolicyConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SecurityPolicyApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getSecurityPoliciesRequestBody  (required)
   * @return Call&lt;List&lt;SecurityPolicy&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-security-policies")
  Call<List<SecurityPolicy>> getSecurityPolicies(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetSecurityPoliciesRequestBody getSecurityPoliciesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getSecurityPoliciesConnectionRequestBody  (required)
   * @return Call&lt;SecurityPolicyConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-security-policies-connection")
  Call<SecurityPolicyConnection> getSecurityPoliciesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetSecurityPoliciesConnectionRequestBody getSecurityPoliciesConnectionRequestBody
  );

}
