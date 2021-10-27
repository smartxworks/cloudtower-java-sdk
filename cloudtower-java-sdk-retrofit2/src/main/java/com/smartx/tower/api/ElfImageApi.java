package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.ElfImage;
import com.smartx.tower.model.ElfImageConnection;
import com.smartx.tower.model.ElfImageDeletionParams;
import com.smartx.tower.model.ElfImageUpdationParams;
import java.io.File;
import com.smartx.tower.model.GetElfImagesConnectionRequestBody;
import com.smartx.tower.model.GetElfImagesRequestBody;
import com.smartx.tower.model.UploadTask;
import com.smartx.tower.model.WithTaskDeleteElfImage;
import com.smartx.tower.model.WithTaskElfImage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ElfImageApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param file  (required)
   * @param clusterId  (required)
   * @param name  (required)
   * @param size  (required)
   * @param description  (required)
   * @param uploadTaskId  (required)
   * @return Call&lt;List&lt;UploadTask&gt;&gt;
   */
  @retrofit2.http.Multipart
  @POST("upload-elf-image")
  Call<List<UploadTask>> createElfImage(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Part MultipartBody.Part file, @retrofit2.http.Part("cluster_id") String clusterId, @retrofit2.http.Part("name") String name, @retrofit2.http.Part("size") String size, @retrofit2.http.Part("description") String description, @retrofit2.http.Part("upload_task_id") String uploadTaskId
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param elfImageDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteElfImage&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-elf-image")
  Call<List<WithTaskDeleteElfImage>> deleteElfImage(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body ElfImageDeletionParams elfImageDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getElfImagesRequestBody  (required)
   * @return Call&lt;List&lt;ElfImage&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-elf-images")
  Call<List<ElfImage>> getElfImages(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetElfImagesRequestBody getElfImagesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getElfImagesConnectionRequestBody  (required)
   * @return Call&lt;ElfImageConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-elf-images-connection")
  Call<ElfImageConnection> getElfImagesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetElfImagesConnectionRequestBody getElfImagesConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param elfImageUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskElfImage&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-elf-image")
  Call<List<WithTaskElfImage>> updateElfImage(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body ElfImageUpdationParams elfImageUpdationParams
  );

}
