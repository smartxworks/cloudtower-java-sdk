package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.Disk;
import com.smartx.tower.model.DiskConnection;
import com.smartx.tower.model.DiskMountParams;
import com.smartx.tower.model.DiskUnmountParams;
import com.smartx.tower.model.GetDisksConnectionRequestBody;
import com.smartx.tower.model.GetDisksRequestBody;
import com.smartx.tower.model.WithTaskDisk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DiskApi {
  /**
   * 
   * 
   * @param getDisksRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;Disk&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-disks")
  Call<List<Disk>> getDisks(
    @retrofit2.http.Body GetDisksRequestBody getDisksRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getDisksConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;DiskConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-disks-connection")
  Call<DiskConnection> getDisksConnection(
    @retrofit2.http.Body GetDisksConnectionRequestBody getDisksConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param diskMountParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskDisk&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("mount-disk")
  Call<List<WithTaskDisk>> mountDisk(
    @retrofit2.http.Body DiskMountParams diskMountParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param diskUnmountParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskDisk&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("unmount-disk")
  Call<List<WithTaskDisk>> unmountDisk(
    @retrofit2.http.Body DiskUnmountParams diskUnmountParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
