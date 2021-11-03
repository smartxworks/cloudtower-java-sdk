package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetMigrateTransmittersConnectionRequestBody;
import com.smartx.tower.model.GetMigrateTransmittersRequestBody;
import com.smartx.tower.model.MigrateTransmitter;
import com.smartx.tower.model.MigrateTransmitterConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MigrateTransmitterApi {
  /**
   * 
   * 
   * @param getMigrateTransmittersRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;MigrateTransmitter&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-migrate-transmitters")
  Call<List<MigrateTransmitter>> getMigrateTransmitters(
    @retrofit2.http.Body GetMigrateTransmittersRequestBody getMigrateTransmittersRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getMigrateTransmittersConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;MigrateTransmitterConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-migrate-transmitters-connection")
  Call<MigrateTransmitterConnection> getMigrateTransmittersConnection(
    @retrofit2.http.Body GetMigrateTransmittersConnectionRequestBody getMigrateTransmittersConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
