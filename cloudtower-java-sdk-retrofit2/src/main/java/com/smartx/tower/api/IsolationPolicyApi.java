package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetIsolationPoliciesConnectionRequestBody;
import com.smartx.tower.model.GetIsolationPoliciesRequestBody;
import com.smartx.tower.model.IsolationPolicy;
import com.smartx.tower.model.IsolationPolicyConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IsolationPolicyApi {
  /**
   * 
   * 
   * @param getIsolationPoliciesRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;IsolationPolicy&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-isolation-policies")
  Call<List<IsolationPolicy>> getIsolationPolicies(
    @retrofit2.http.Body GetIsolationPoliciesRequestBody getIsolationPoliciesRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getIsolationPoliciesConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;IsolationPolicyConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-isolation-policies-connection")
  Call<IsolationPolicyConnection> getIsolationPoliciesConnection(
    @retrofit2.http.Body GetIsolationPoliciesConnectionRequestBody getIsolationPoliciesConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
