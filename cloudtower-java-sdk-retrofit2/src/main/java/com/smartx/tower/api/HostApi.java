package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetHostsConnectionRequestBody;
import com.smartx.tower.model.GetHostsRequestBody;
import com.smartx.tower.model.Host;
import com.smartx.tower.model.HostConnection;
import com.smartx.tower.model.HostCreationParams;
import com.smartx.tower.model.HostUpdationParams;
import com.smartx.tower.model.TriggerDiskBlinkParams;
import com.smartx.tower.model.WithTaskBatchHosts;
import com.smartx.tower.model.WithTaskHost;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HostApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param hostCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskBatchHosts&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-host")
  Call<List<WithTaskBatchHosts>> createHost(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<HostCreationParams> hostCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getHostsRequestBody  (required)
   * @return Call&lt;List&lt;Host&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-hosts")
  Call<List<Host>> getHosts(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetHostsRequestBody getHostsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getHostsConnectionRequestBody  (required)
   * @return Call&lt;HostConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-hosts-connection")
  Call<HostConnection> getHostsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetHostsConnectionRequestBody getHostsConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param triggerDiskBlinkParams  (required)
   * @return Call&lt;List&lt;WithTaskHost&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("trigger-disk-blink")
  Call<List<WithTaskHost>> triggerDiskBlink(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<TriggerDiskBlinkParams> triggerDiskBlinkParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param hostUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskHost&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-host")
  Call<List<WithTaskHost>> updateHost(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body HostUpdationParams hostUpdationParams
  );

}
