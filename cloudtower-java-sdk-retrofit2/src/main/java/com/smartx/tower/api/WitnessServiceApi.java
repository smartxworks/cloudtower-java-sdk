package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetWitnessServicesRequestBody;
import com.smartx.tower.model.WitnessService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface WitnessServiceApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getWitnessServicesRequestBody  (required)
   * @return Call&lt;List&lt;WitnessService&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-witness-services")
  Call<List<WitnessService>> getWitnessServices(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetWitnessServicesRequestBody getWitnessServicesRequestBody
  );

}
