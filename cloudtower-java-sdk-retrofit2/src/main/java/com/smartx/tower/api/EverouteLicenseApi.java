package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.EverouteLicense;
import com.smartx.tower.model.EverouteLicenseConnection;
import com.smartx.tower.model.GetEverouteLicensesConnectionRequestBody;
import com.smartx.tower.model.GetEverouteLicensesRequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EverouteLicenseApi {
  /**
   * 
   * 
   * @param getEverouteLicensesRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;EverouteLicense&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-everoute-licenses")
  Call<List<EverouteLicense>> getEverouteLicenses(
    @retrofit2.http.Body GetEverouteLicensesRequestBody getEverouteLicensesRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getEverouteLicensesConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;EverouteLicenseConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-everoute-licenses-connection")
  Call<EverouteLicenseConnection> getEverouteLicensesConnection(
    @retrofit2.http.Body GetEverouteLicensesConnectionRequestBody getEverouteLicensesConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
