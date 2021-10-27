package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetWitnessesConnectionRequestBody;
import com.smartx.tower.model.GetWitnessesRequestBody;
import com.smartx.tower.model.Witness;
import com.smartx.tower.model.WitnessConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface WitnessApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getWitnessesRequestBody  (required)
   * @return Call&lt;List&lt;Witness&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-witnesses")
  Call<List<Witness>> getWitnesses(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetWitnessesRequestBody getWitnessesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getWitnessesConnectionRequestBody  (required)
   * @return Call&lt;WitnessConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-witnesses-connection")
  Call<WitnessConnection> getWitnessesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetWitnessesConnectionRequestBody getWitnessesConnectionRequestBody
  );

}
