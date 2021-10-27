package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetIscsiConnectionsRequestBody;
import com.smartx.tower.model.IscsiConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IscsiConnectionApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getIscsiConnectionsRequestBody  (required)
   * @return Call&lt;List&lt;IscsiConnection&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-iscsi-connections")
  Call<List<IscsiConnection>> getIscsiConnections(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetIscsiConnectionsRequestBody getIscsiConnectionsRequestBody
  );

}
