package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetVmVolumesConnectionRequestBody;
import com.smartx.tower.model.GetVmVolumesRequestBody;
import com.smartx.tower.model.VmVolume;
import com.smartx.tower.model.VmVolumeConnection;
import com.smartx.tower.model.VmVolumeCreationParams;
import com.smartx.tower.model.VmVolumeDeletionParams;
import com.smartx.tower.model.WithTaskDeleteVmVolume;
import com.smartx.tower.model.WithTaskVmVolume;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VmVolumeApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmVolumeCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskVmVolume&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-vm-volume")
  Call<List<WithTaskVmVolume>> createVmVolume(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<VmVolumeCreationParams> vmVolumeCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmVolumeDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteVmVolume&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-vm-volume")
  Call<List<WithTaskDeleteVmVolume>> deleteVmVolumeFromVm(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body VmVolumeDeletionParams vmVolumeDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getVmVolumesRequestBody  (required)
   * @return Call&lt;List&lt;VmVolume&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vm-volumes")
  Call<List<VmVolume>> getVmVolumes(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetVmVolumesRequestBody getVmVolumesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getVmVolumesConnectionRequestBody  (required)
   * @return Call&lt;VmVolumeConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vm-volumes-connection")
  Call<VmVolumeConnection> getVmVolumesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetVmVolumesConnectionRequestBody getVmVolumesConnectionRequestBody
  );

}
