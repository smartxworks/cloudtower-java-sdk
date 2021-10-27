package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetVsphereEsxiAccountsConnectionRequestBody;
import com.smartx.tower.model.GetVsphereEsxiAccountsRequestBody;
import com.smartx.tower.model.VsphereEsxiAccount;
import com.smartx.tower.model.VsphereEsxiAccountConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VsphereEsxiAccountApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getVsphereEsxiAccountsRequestBody  (required)
   * @return Call&lt;List&lt;VsphereEsxiAccount&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vsphere-esxi-accounts")
  Call<List<VsphereEsxiAccount>> getVsphereEsxiAccounts(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetVsphereEsxiAccountsRequestBody getVsphereEsxiAccountsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getVsphereEsxiAccountsConnectionRequestBody  (required)
   * @return Call&lt;VsphereEsxiAccountConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vsphere-esxi-accounts-connection")
  Call<VsphereEsxiAccountConnection> getVsphereEsxiAccountsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetVsphereEsxiAccountsConnectionRequestBody getVsphereEsxiAccountsConnectionRequestBody
  );

}
