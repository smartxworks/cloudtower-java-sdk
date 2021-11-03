package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetIscsiLunsConnectionRequestBody;
import com.smartx.tower.model.GetIscsiLunsRequestBody;
import com.smartx.tower.model.IscsiLun;
import com.smartx.tower.model.IscsiLunCloneParams;
import com.smartx.tower.model.IscsiLunConnection;
import com.smartx.tower.model.IscsiLunCreationParams;
import com.smartx.tower.model.IscsiLunDeletionParams;
import com.smartx.tower.model.IscsiLunRollbackParams;
import com.smartx.tower.model.IscsiLunUpdationParams;
import com.smartx.tower.model.WithTaskDeleteIscsiLun;
import com.smartx.tower.model.WithTaskIscsiLun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IscsiLunApi {
  /**
   * 
   * 
   * @param iscsiLunCloneParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskIscsiLun&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("clone-iscsi-lun-from-snapshot")
  Call<List<WithTaskIscsiLun>> cloneIscsiLunFromSnapshot(
    @retrofit2.http.Body List<IscsiLunCloneParams> iscsiLunCloneParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param iscsiLunCreationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskIscsiLun&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-iscsi-lun")
  Call<List<WithTaskIscsiLun>> createIscsiLun(
    @retrofit2.http.Body List<IscsiLunCreationParams> iscsiLunCreationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param iscsiLunDeletionParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskDeleteIscsiLun&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-iscsi-lun")
  Call<List<WithTaskDeleteIscsiLun>> deleteIscsiLun(
    @retrofit2.http.Body IscsiLunDeletionParams iscsiLunDeletionParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getIscsiLunsRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;IscsiLun&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-iscsi-luns")
  Call<List<IscsiLun>> getIscsiLuns(
    @retrofit2.http.Body GetIscsiLunsRequestBody getIscsiLunsRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getIscsiLunsConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;IscsiLunConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-iscsi-luns-connection")
  Call<IscsiLunConnection> getIscsiLunsConnection(
    @retrofit2.http.Body GetIscsiLunsConnectionRequestBody getIscsiLunsConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param iscsiLunRollbackParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskIscsiLun&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("rollback-iscsi-lun-from-snapshot")
  Call<List<WithTaskIscsiLun>> rollbackIscsiLunFromSnapshot(
    @retrofit2.http.Body List<IscsiLunRollbackParams> iscsiLunRollbackParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param iscsiLunUpdationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskIscsiLun&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-iscsi-lun")
  Call<List<WithTaskIscsiLun>> updateIscsiLun(
    @retrofit2.http.Body IscsiLunUpdationParams iscsiLunUpdationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
