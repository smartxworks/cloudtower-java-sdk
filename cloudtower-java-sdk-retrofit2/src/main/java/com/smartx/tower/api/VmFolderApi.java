package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetVmFoldersConnectionRequestBody;
import com.smartx.tower.model.GetVmFoldersRequestBody;
import com.smartx.tower.model.VmFolder;
import com.smartx.tower.model.VmFolderConnection;
import com.smartx.tower.model.VmFolderCreationParams;
import com.smartx.tower.model.VmFolderDeletionParams;
import com.smartx.tower.model.VmFolderUpdationParams;
import com.smartx.tower.model.WithTaskDeleteVmFolder;
import com.smartx.tower.model.WithTaskVmFolder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VmFolderApi {
  /**
   * 
   * 
   * @param vmFolderCreationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVmFolder&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-vm-folder")
  Call<List<WithTaskVmFolder>> createVmFolder(
    @retrofit2.http.Body List<VmFolderCreationParams> vmFolderCreationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmFolderDeletionParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskDeleteVmFolder&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-vm-folder")
  Call<List<WithTaskDeleteVmFolder>> deleteVmFolder(
    @retrofit2.http.Body VmFolderDeletionParams vmFolderDeletionParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getVmFoldersRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;VmFolder&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vm-folders")
  Call<List<VmFolder>> getVmFolders(
    @retrofit2.http.Body GetVmFoldersRequestBody getVmFoldersRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getVmFoldersConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;VmFolderConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vm-folders-connection")
  Call<VmFolderConnection> getVmFoldersConnection(
    @retrofit2.http.Body GetVmFoldersConnectionRequestBody getVmFoldersConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param vmFolderUpdationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskVmFolder&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-vm-folder")
  Call<List<WithTaskVmFolder>> updateVmFolder(
    @retrofit2.http.Body VmFolderUpdationParams vmFolderUpdationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
