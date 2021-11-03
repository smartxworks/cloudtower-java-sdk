package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetZonesConnectionRequestBody;
import com.smartx.tower.model.GetZonesRequestBody;
import com.smartx.tower.model.Zone;
import com.smartx.tower.model.ZoneConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ZoneApi {
  /**
   * 
   * 
   * @param getZonesRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;Zone&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-zones")
  Call<List<Zone>> getZones(
    @retrofit2.http.Body GetZonesRequestBody getZonesRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getZonesConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;ZoneConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-zones-connection")
  Call<ZoneConnection> getZonesConnection(
    @retrofit2.http.Body GetZonesConnectionRequestBody getZonesConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
