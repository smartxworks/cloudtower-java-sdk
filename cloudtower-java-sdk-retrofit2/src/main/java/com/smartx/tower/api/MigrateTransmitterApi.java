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
   * @param contentLanguage  (required)
   * @param getMigrateTransmittersRequestBody  (required)
   * @return Call&lt;List&lt;MigrateTransmitter&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-migrate-transmitters")
  Call<List<MigrateTransmitter>> getMigrateTransmitters(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetMigrateTransmittersRequestBody getMigrateTransmittersRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getMigrateTransmittersConnectionRequestBody  (required)
   * @return Call&lt;MigrateTransmitterConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-migrate-transmitters-connection")
  Call<MigrateTransmitterConnection> getMigrateTransmittersConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetMigrateTransmittersConnectionRequestBody getMigrateTransmittersConnectionRequestBody
  );

}
