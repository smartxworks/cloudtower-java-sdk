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
   * @param contentLanguage  (required)
   * @param iscsiLunCloneParams  (required)
   * @return Call&lt;List&lt;WithTaskIscsiLun&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("clone-iscsi-lun-from-snapshot")
  Call<List<WithTaskIscsiLun>> cloneIscsiLunFromSnapshot(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<IscsiLunCloneParams> iscsiLunCloneParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param iscsiLunCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskIscsiLun&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-iscsi-lun")
  Call<List<WithTaskIscsiLun>> createIscsiLun(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<IscsiLunCreationParams> iscsiLunCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param iscsiLunDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteIscsiLun&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-iscsi-lun")
  Call<List<WithTaskDeleteIscsiLun>> deleteIscsiLun(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body IscsiLunDeletionParams iscsiLunDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getIscsiLunsRequestBody  (required)
   * @return Call&lt;List&lt;IscsiLun&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-iscsi-luns")
  Call<List<IscsiLun>> getIscsiLuns(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetIscsiLunsRequestBody getIscsiLunsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getIscsiLunsConnectionRequestBody  (required)
   * @return Call&lt;IscsiLunConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-iscsi-luns-connection")
  Call<IscsiLunConnection> getIscsiLunsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetIscsiLunsConnectionRequestBody getIscsiLunsConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param iscsiLunRollbackParams  (required)
   * @return Call&lt;List&lt;WithTaskIscsiLun&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("rollback-iscsi-lun-from-snapshot")
  Call<List<WithTaskIscsiLun>> rollbackIscsiLunFromSnapshot(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<IscsiLunRollbackParams> iscsiLunRollbackParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param iscsiLunUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskIscsiLun&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-iscsi-lun")
  Call<List<WithTaskIscsiLun>> updateIscsiLun(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body IscsiLunUpdationParams iscsiLunUpdationParams
  );

}
