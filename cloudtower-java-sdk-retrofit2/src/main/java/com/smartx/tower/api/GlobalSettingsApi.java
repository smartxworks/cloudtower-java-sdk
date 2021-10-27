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
   * @param contentLanguage  (required)
   * @param clusterRecycleBinCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskClusterSettings&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-cluster-recycle-bin-setting")
  Call<List<WithTaskClusterSettings>> createClusterRecycleBinSetting(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body ClusterRecycleBinCreationParams clusterRecycleBinCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param clusterRecycleBinDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteClusterRecycleBin&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-cluster-recycle-bin-setting")
  Call<List<WithTaskDeleteClusterRecycleBin>> deleteClusterRecycleBinSetting(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body ClusterRecycleBinDeletionParams clusterRecycleBinDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getGlobalSettingsesRequestBody  (required)
   * @return Call&lt;List&lt;GlobalSettings&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-global-settingses")
  Call<List<GlobalSettings>> getGlobalSettingses(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetGlobalSettingsesRequestBody getGlobalSettingsesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getGlobalSettingsesConnectionRequestBody  (required)
   * @return Call&lt;GlobalSettingsConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-global-settingses-connection")
  Call<GlobalSettingsConnection> getGlobalSettingsesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetGlobalSettingsesConnectionRequestBody getGlobalSettingsesConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param clusterRecycleBinUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskClusterSettings&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-cluster-recycle-bin-setting")
  Call<List<WithTaskClusterSettings>> updateClusterRecycleBinSetting(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body ClusterRecycleBinUpdationParams clusterRecycleBinUpdationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param globalRecycleBinUpdationParams  (required)
   * @return Call&lt;WithTaskGlobalSettings&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-global-recycle-bin-setting")
  Call<WithTaskGlobalSettings> updateGlobalRecycleBinSetting(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GlobalRecycleBinUpdationParams globalRecycleBinUpdationParams
  );

}
