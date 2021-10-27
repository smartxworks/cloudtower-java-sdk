package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetIscsiConnectionsConnectionRequestBody;
import com.smartx.tower.model.IscsiConnectionConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IscsiApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getIscsiConnectionsConnectionRequestBody  (required)
   * @return Call&lt;IscsiConnectionConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-iscsi-connections-connection")
  Call<IscsiConnectionConnection> getIscsiConnectionsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetIscsiConnectionsConnectionRequestBody getIscsiConnectionsConnectionRequestBody
  );

}
