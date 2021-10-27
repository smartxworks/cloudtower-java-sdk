package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.Deploy;
import com.smartx.tower.model.DeployConnection;
import com.smartx.tower.model.GetDeploysConnectionRequestBody;
import com.smartx.tower.model.GetDeploysRequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DeployApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getDeploysRequestBody  (required)
   * @return Call&lt;List&lt;Deploy&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-deploys")
  Call<List<Deploy>> getDeploys(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetDeploysRequestBody getDeploysRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getDeploysConnectionRequestBody  (required)
   * @return Call&lt;DeployConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-deploys-connection")
  Call<DeployConnection> getDeploysConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetDeploysConnectionRequestBody getDeploysConnectionRequestBody
  );

}
