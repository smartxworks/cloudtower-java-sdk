package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.EveroutePackage;
import com.smartx.tower.model.EveroutePackageConnection;
import com.smartx.tower.model.GetEveroutePackagesConnectionRequestBody;
import com.smartx.tower.model.GetEveroutePackagesRequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EveroutePackageApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getEveroutePackagesRequestBody  (required)
   * @return Call&lt;List&lt;EveroutePackage&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-everoute-packages")
  Call<List<EveroutePackage>> getEveroutePackages(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetEveroutePackagesRequestBody getEveroutePackagesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getEveroutePackagesConnectionRequestBody  (required)
   * @return Call&lt;EveroutePackageConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-everoute-packages-connection")
  Call<EveroutePackageConnection> getEveroutePackagesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetEveroutePackagesConnectionRequestBody getEveroutePackagesConnectionRequestBody
  );

}
