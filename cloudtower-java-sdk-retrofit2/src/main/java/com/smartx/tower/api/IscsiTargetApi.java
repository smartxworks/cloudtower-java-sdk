package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetIscsiTargetsConnectionRequestBody;
import com.smartx.tower.model.GetIscsiTargetsRequestBody;
import com.smartx.tower.model.IscsiTarget;
import com.smartx.tower.model.IscsiTargetConnection;
import com.smartx.tower.model.IscsiTargetCreationParams;
import com.smartx.tower.model.IscsiTargetDeletionParams;
import com.smartx.tower.model.IscsiTargetUpdationParams;
import com.smartx.tower.model.WithTaskDeleteIscsiTarget;
import com.smartx.tower.model.WithTaskIscsiTarget;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IscsiTargetApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param iscsiTargetCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskIscsiTarget&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-iscsi-target")
  Call<List<WithTaskIscsiTarget>> createIscsiTarget(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<IscsiTargetCreationParams> iscsiTargetCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param iscsiTargetDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteIscsiTarget&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-iscsi-target")
  Call<List<WithTaskDeleteIscsiTarget>> deleteIscsiTarget(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body IscsiTargetDeletionParams iscsiTargetDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getIscsiTargetsRequestBody  (required)
   * @return Call&lt;List&lt;IscsiTarget&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-iscsi-targets")
  Call<List<IscsiTarget>> getIscsiTargets(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetIscsiTargetsRequestBody getIscsiTargetsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getIscsiTargetsConnectionRequestBody  (required)
   * @return Call&lt;IscsiTargetConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-iscsi-targets-connection")
  Call<IscsiTargetConnection> getIscsiTargetsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetIscsiTargetsConnectionRequestBody getIscsiTargetsConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param iscsiTargetUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskIscsiTarget&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-iscsi-target")
  Call<List<WithTaskIscsiTarget>> updateIscsiTarget(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body IscsiTargetUpdationParams iscsiTargetUpdationParams
  );

}
