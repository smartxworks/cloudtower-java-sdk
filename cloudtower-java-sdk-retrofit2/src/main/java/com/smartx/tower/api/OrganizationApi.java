package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetOrganizationsConnectionRequestBody;
import com.smartx.tower.model.GetOrganizationsRequestBody;
import com.smartx.tower.model.Organization;
import com.smartx.tower.model.OrganizationConnection;
import com.smartx.tower.model.OrganizationCreationParams;
import com.smartx.tower.model.OrganizationDeletionParams;
import com.smartx.tower.model.OrganizationUpdationParams;
import com.smartx.tower.model.WithTaskDeleteOrganization;
import com.smartx.tower.model.WithTaskOrganization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface OrganizationApi {
  /**
   * 
   * 
   * @param organizationCreationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskOrganization&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-organization")
  Call<List<WithTaskOrganization>> createOrganization(
    @retrofit2.http.Body List<OrganizationCreationParams> organizationCreationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param organizationDeletionParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskDeleteOrganization&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-organization")
  Call<List<WithTaskDeleteOrganization>> deleteOrganization(
    @retrofit2.http.Body OrganizationDeletionParams organizationDeletionParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getOrganizationsRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;Organization&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-organizations")
  Call<List<Organization>> getOrganizations(
    @retrofit2.http.Body GetOrganizationsRequestBody getOrganizationsRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getOrganizationsConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;OrganizationConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-organizations-connection")
  Call<OrganizationConnection> getOrganizationsConnection(
    @retrofit2.http.Body GetOrganizationsConnectionRequestBody getOrganizationsConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param organizationUpdationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskOrganization&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-organization")
  Call<List<WithTaskOrganization>> updateOrganization(
    @retrofit2.http.Body OrganizationUpdationParams organizationUpdationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
