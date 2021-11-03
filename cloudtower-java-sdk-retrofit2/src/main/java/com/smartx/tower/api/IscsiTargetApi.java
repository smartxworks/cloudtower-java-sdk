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
   * @param iscsiTargetCreationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskIscsiTarget&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-iscsi-target")
  Call<List<WithTaskIscsiTarget>> createIscsiTarget(
    @retrofit2.http.Body List<IscsiTargetCreationParams> iscsiTargetCreationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param iscsiTargetDeletionParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskDeleteIscsiTarget&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-iscsi-target")
  Call<List<WithTaskDeleteIscsiTarget>> deleteIscsiTarget(
    @retrofit2.http.Body IscsiTargetDeletionParams iscsiTargetDeletionParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getIscsiTargetsRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;IscsiTarget&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-iscsi-targets")
  Call<List<IscsiTarget>> getIscsiTargets(
    @retrofit2.http.Body GetIscsiTargetsRequestBody getIscsiTargetsRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getIscsiTargetsConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;IscsiTargetConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-iscsi-targets-connection")
  Call<IscsiTargetConnection> getIscsiTargetsConnection(
    @retrofit2.http.Body GetIscsiTargetsConnectionRequestBody getIscsiTargetsConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param iscsiTargetUpdationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskIscsiTarget&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-iscsi-target")
  Call<List<WithTaskIscsiTarget>> updateIscsiTarget(
    @retrofit2.http.Body IscsiTargetUpdationParams iscsiTargetUpdationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
