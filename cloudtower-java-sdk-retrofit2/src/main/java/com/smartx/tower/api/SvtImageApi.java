package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetSvtImagesConnectionRequestBody;
import com.smartx.tower.model.GetSvtImagesRequestBody;
import com.smartx.tower.model.SvtImage;
import com.smartx.tower.model.SvtImageConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SvtImageApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getSvtImagesRequestBody  (required)
   * @return Call&lt;List&lt;SvtImage&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-svt-images")
  Call<List<SvtImage>> getSvtImages(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetSvtImagesRequestBody getSvtImagesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getSvtImagesConnectionRequestBody  (required)
   * @return Call&lt;SvtImageConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-svt-images-connection")
  Call<SvtImageConnection> getSvtImagesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetSvtImagesConnectionRequestBody getSvtImagesConnectionRequestBody
  );

}
