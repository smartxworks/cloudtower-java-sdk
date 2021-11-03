package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetNicsConnectionRequestBody;
import com.smartx.tower.model.GetNicsRequestBody;
import com.smartx.tower.model.Nic;
import com.smartx.tower.model.NicConnection;
import com.smartx.tower.model.NicUpdationParams;
import com.smartx.tower.model.WithTaskNic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface NicApi {
  /**
   * 
   * 
   * @param getNicsRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;Nic&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-nics")
  Call<List<Nic>> getNics(
    @retrofit2.http.Body GetNicsRequestBody getNicsRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getNicsConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;NicConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-nics-connection")
  Call<NicConnection> getNicsConnection(
    @retrofit2.http.Body GetNicsConnectionRequestBody getNicsConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param nicUpdationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskNic&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-nic")
  Call<List<WithTaskNic>> updateNic(
    @retrofit2.http.Body NicUpdationParams nicUpdationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
