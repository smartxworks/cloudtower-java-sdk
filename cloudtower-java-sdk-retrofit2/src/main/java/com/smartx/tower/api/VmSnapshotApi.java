package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetVmSnapshotsConnectionRequestBody;
import com.smartx.tower.model.GetVmSnapshotsRequestBody;
import com.smartx.tower.model.VmSnapshot;
import com.smartx.tower.model.VmSnapshotConnection;
import com.smartx.tower.model.VmSnapshotCreationParams;
import com.smartx.tower.model.VmSnapshotDeletionParams;
import com.smartx.tower.model.WithTaskDeleteVmSnapshot;
import com.smartx.tower.model.WithTaskVmSnapshot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VmSnapshotApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmSnapshotCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskVmSnapshot&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-vm-snapshot")
  Call<List<WithTaskVmSnapshot>> createVmSnapshot(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmSnapshotCreationParams vmSnapshotCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmSnapshotDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteVmSnapshot&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-vm-snapshot")
  Call<List<WithTaskDeleteVmSnapshot>> deleteVmSnapshot(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmSnapshotDeletionParams vmSnapshotDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getVmSnapshotsRequestBody  (required)
   * @return Call&lt;List&lt;VmSnapshot&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vm-snapshots")
  Call<List<VmSnapshot>> getVmSnapshots(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetVmSnapshotsRequestBody getVmSnapshotsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getVmSnapshotsConnectionRequestBody  (required)
   * @return Call&lt;VmSnapshotConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vm-snapshots-connection")
  Call<VmSnapshotConnection> getVmSnapshotsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetVmSnapshotsConnectionRequestBody getVmSnapshotsConnectionRequestBody
  );

}
