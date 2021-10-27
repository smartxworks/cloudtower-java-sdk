package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetIscsiLunSnapshotsConnectionRequestBody;
import com.smartx.tower.model.GetIscsiLunSnapshotsRequestBody;
import com.smartx.tower.model.IscsiLunSnapshot;
import com.smartx.tower.model.IscsiLunSnapshotConnection;
import com.smartx.tower.model.IscsiLunSnapshotCreationParams;
import com.smartx.tower.model.IscsiLunSnapshotDeletionParams;
import com.smartx.tower.model.WithTaskDeleteIscsiLunSnapshot;
import com.smartx.tower.model.WithTaskIscsiLunSnapshot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IscsiLunSnapshotApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param iscsiLunSnapshotCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskIscsiLunSnapshot&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-iscsi-lun-snapshot")
  Call<List<WithTaskIscsiLunSnapshot>> createIscsiLunSnapshot(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<IscsiLunSnapshotCreationParams> iscsiLunSnapshotCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param iscsiLunSnapshotDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteIscsiLunSnapshot&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-iscsi-lun-snapshot")
  Call<List<WithTaskDeleteIscsiLunSnapshot>> deleteIscsiLunSnapshot(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body IscsiLunSnapshotDeletionParams iscsiLunSnapshotDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getIscsiLunSnapshotsRequestBody  (required)
   * @return Call&lt;List&lt;IscsiLunSnapshot&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-iscsi-lun-snapshots")
  Call<List<IscsiLunSnapshot>> getIscsiLunSnapshots(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetIscsiLunSnapshotsRequestBody getIscsiLunSnapshotsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getIscsiLunSnapshotsConnectionRequestBody  (required)
   * @return Call&lt;IscsiLunSnapshotConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-iscsi-lun-snapshots-connection")
  Call<IscsiLunSnapshotConnection> getIscsiLunSnapshotsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetIscsiLunSnapshotsConnectionRequestBody getIscsiLunSnapshotsConnectionRequestBody
  );

}
