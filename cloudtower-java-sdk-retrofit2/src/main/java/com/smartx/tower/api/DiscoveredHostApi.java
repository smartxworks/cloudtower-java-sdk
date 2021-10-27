package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.DiscoveredHost;
import com.smartx.tower.model.GetDiscoverHostsRequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DiscoveredHostApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getDiscoverHostsRequestBody  (required)
   * @return Call&lt;List&lt;DiscoveredHost&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-discover-hosts")
  Call<List<DiscoveredHost>> getDiscoverHosts(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetDiscoverHostsRequestBody getDiscoverHostsRequestBody
  );

}
