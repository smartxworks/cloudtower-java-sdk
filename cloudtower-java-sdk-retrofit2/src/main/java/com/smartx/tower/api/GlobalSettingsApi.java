package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.ClusterRecycleBinCreationParams;
import com.smartx.tower.model.ClusterRecycleBinDeletionParams;
import com.smartx.tower.model.ClusterRecycleBinUpdationParams;
import com.smartx.tower.model.GetGlobalSettingsesConnectionRequestBody;
import com.smartx.tower.model.GetGlobalSettingsesRequestBody;
import com.smartx.tower.model.GlobalRecycleBinUpdationParams;
import com.smartx.tower.model.GlobalSettings;
import com.smartx.tower.model.GlobalSettingsConnection;
import com.smartx.tower.model.WithTaskClusterSettings;
import com.smartx.tower.model.WithTaskDeleteClusterRecycleBin;
import com.smartx.tower.model.WithTaskGlobalSettings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GlobalSettingsApi {
  /**
   * 
   * 
   * @param clusterRecycleBinCreationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskClusterSettings&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-cluster-recycle-bin-setting")
  Call<List<WithTaskClusterSettings>> createClusterRecycleBinSetting(
    @retrofit2.http.Body ClusterRecycleBinCreationParams clusterRecycleBinCreationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param clusterRecycleBinDeletionParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskDeleteClusterRecycleBin&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-cluster-recycle-bin-setting")
  Call<List<WithTaskDeleteClusterRecycleBin>> deleteClusterRecycleBinSetting(
    @retrofit2.http.Body ClusterRecycleBinDeletionParams clusterRecycleBinDeletionParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getGlobalSettingsesRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;GlobalSettings&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-global-settingses")
  Call<List<GlobalSettings>> getGlobalSettingses(
    @retrofit2.http.Body GetGlobalSettingsesRequestBody getGlobalSettingsesRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getGlobalSettingsesConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;GlobalSettingsConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-global-settingses-connection")
  Call<GlobalSettingsConnection> getGlobalSettingsesConnection(
    @retrofit2.http.Body GetGlobalSettingsesConnectionRequestBody getGlobalSettingsesConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param clusterRecycleBinUpdationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskClusterSettings&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-cluster-recycle-bin-setting")
  Call<List<WithTaskClusterSettings>> updateClusterRecycleBinSetting(
    @retrofit2.http.Body ClusterRecycleBinUpdationParams clusterRecycleBinUpdationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param globalRecycleBinUpdationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;WithTaskGlobalSettings&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-global-recycle-bin-setting")
  Call<WithTaskGlobalSettings> updateGlobalRecycleBinSetting(
    @retrofit2.http.Body GlobalRecycleBinUpdationParams globalRecycleBinUpdationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
