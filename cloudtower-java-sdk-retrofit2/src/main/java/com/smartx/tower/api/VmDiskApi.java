package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetVmDisksConnectionRequestBody;
import com.smartx.tower.model.GetVmDisksRequestBody;
import com.smartx.tower.model.VmDisk;
import com.smartx.tower.model.VmDiskConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VmDiskApi {
  /**
   * 
   * 
   * @param getVmDisksRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;VmDisk&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vm-disks")
  Call<List<VmDisk>> getVmDisks(
    @retrofit2.http.Body GetVmDisksRequestBody getVmDisksRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getVmDisksConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;VmDiskConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vm-disks-connection")
  Call<VmDiskConnection> getVmDisksConnection(
    @retrofit2.http.Body GetVmDisksConnectionRequestBody getVmDisksConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
