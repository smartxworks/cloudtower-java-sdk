package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetIpmisRequestBody;
import com.smartx.tower.model.Ipmi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IpmiApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getIpmisRequestBody  (required)
   * @return Call&lt;List&lt;Ipmi&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-ipmis")
  Call<List<Ipmi>> getIpmis(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetIpmisRequestBody getIpmisRequestBody
  );

}
