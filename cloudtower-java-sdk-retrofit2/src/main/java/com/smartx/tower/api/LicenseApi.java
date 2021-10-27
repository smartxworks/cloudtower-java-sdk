package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetLicensesConnectionRequestBody;
import com.smartx.tower.model.GetLicensesRequestBody;
import com.smartx.tower.model.License;
import com.smartx.tower.model.LicenseConnection;
import com.smartx.tower.model.LicenseUpdationParams;
import com.smartx.tower.model.WithTaskLicense;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LicenseApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getLicensesRequestBody  (required)
   * @return Call&lt;List&lt;License&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-licenses")
  Call<List<License>> getLicenses(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetLicensesRequestBody getLicensesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getLicensesConnectionRequestBody  (required)
   * @return Call&lt;LicenseConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-licenses-connection")
  Call<LicenseConnection> getLicensesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetLicensesConnectionRequestBody getLicensesConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param licenseUpdationParams  (required)
   * @return Call&lt;WithTaskLicense&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-license")
  Call<WithTaskLicense> updateDeploy(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body LicenseUpdationParams licenseUpdationParams
  );

}
