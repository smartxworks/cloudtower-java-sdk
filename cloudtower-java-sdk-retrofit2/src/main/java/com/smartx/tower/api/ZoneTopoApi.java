package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetZoneTopoesConnectionRequestBody;
import com.smartx.tower.model.GetZoneTopoesRequestBody;
import com.smartx.tower.model.ZoneTopo;
import com.smartx.tower.model.ZoneTopoConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ZoneTopoApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getZoneTopoesRequestBody  (required)
   * @return Call&lt;List&lt;ZoneTopo&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-zone-topoes")
  Call<List<ZoneTopo>> getZoneTopoes(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetZoneTopoesRequestBody getZoneTopoesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getZoneTopoesConnectionRequestBody  (required)
   * @return Call&lt;ZoneTopoConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-zone-topoes-connection")
  Call<ZoneTopoConnection> getZoneTopoesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetZoneTopoesConnectionRequestBody getZoneTopoesConnectionRequestBody
  );

}
