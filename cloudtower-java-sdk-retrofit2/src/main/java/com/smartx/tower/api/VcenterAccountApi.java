package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetVcenterAccountsConnectionRequestBody;
import com.smartx.tower.model.GetVcenterAccountsRequestBody;
import com.smartx.tower.model.VcenterAccount;
import com.smartx.tower.model.VcenterAccountConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VcenterAccountApi {
  /**
   * 
   * 
   * @param getVcenterAccountsRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;VcenterAccount&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vcenter-accounts")
  Call<List<VcenterAccount>> getVcenterAccounts(
    @retrofit2.http.Body GetVcenterAccountsRequestBody getVcenterAccountsRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getVcenterAccountsConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;VcenterAccountConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vcenter-accounts-connection")
  Call<VcenterAccountConnection> getVcenterAccountsConnection(
    @retrofit2.http.Body GetVcenterAccountsConnectionRequestBody getVcenterAccountsConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
