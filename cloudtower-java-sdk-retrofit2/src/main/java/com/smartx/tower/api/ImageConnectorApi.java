package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetImagesConnectorRequestBody;
import com.smartx.tower.model.ImageConnector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ImageConnectorApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getImagesConnectorRequestBody  (required)
   * @return Call&lt;List&lt;ImageConnector&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-images-connector")
  Call<List<ImageConnector>> getImagesConnector(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetImagesConnectorRequestBody getImagesConnectorRequestBody
  );

}
