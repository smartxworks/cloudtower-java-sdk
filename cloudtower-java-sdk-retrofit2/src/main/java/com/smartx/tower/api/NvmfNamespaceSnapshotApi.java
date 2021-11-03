package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetNvmfNamespaceSnapshotsConnectionRequestBody;
import com.smartx.tower.model.GetNvmfNamespaceSnapshotsRequestBody;
import com.smartx.tower.model.NvmfNamespaceSnapshot;
import com.smartx.tower.model.NvmfNamespaceSnapshotConnection;
import com.smartx.tower.model.NvmfNamespaceSnapshotCreationParams;
import com.smartx.tower.model.NvmfNamespaceSnapshotDeletionParams;
import com.smartx.tower.model.WithTaskDeleteNvmfNamespaceSnapshot;
import com.smartx.tower.model.WithTaskNvmfNamespaceSnapshot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface NvmfNamespaceSnapshotApi {
  /**
   * 
   * 
   * @param nvmfNamespaceSnapshotCreationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskNvmfNamespaceSnapshot&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-nvmf-namespace-snapshot")
  Call<List<WithTaskNvmfNamespaceSnapshot>> createNvmfNamespaceSnapshot(
    @retrofit2.http.Body List<NvmfNamespaceSnapshotCreationParams> nvmfNamespaceSnapshotCreationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param nvmfNamespaceSnapshotDeletionParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskDeleteNvmfNamespaceSnapshot&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-nvmf-namespace-snapshot")
  Call<List<WithTaskDeleteNvmfNamespaceSnapshot>> deleteNvmfNamespaceSnapshot(
    @retrofit2.http.Body NvmfNamespaceSnapshotDeletionParams nvmfNamespaceSnapshotDeletionParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getNvmfNamespaceSnapshotsRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;NvmfNamespaceSnapshot&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-nvmf-namespace-snapshots")
  Call<List<NvmfNamespaceSnapshot>> getNvmfNamespaceSnapshots(
    @retrofit2.http.Body GetNvmfNamespaceSnapshotsRequestBody getNvmfNamespaceSnapshotsRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getNvmfNamespaceSnapshotsConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;NvmfNamespaceSnapshotConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-nvmf-namespace-snapshots-connection")
  Call<NvmfNamespaceSnapshotConnection> getNvmfNamespaceSnapshotsConnection(
    @retrofit2.http.Body GetNvmfNamespaceSnapshotsConnectionRequestBody getNvmfNamespaceSnapshotsConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
