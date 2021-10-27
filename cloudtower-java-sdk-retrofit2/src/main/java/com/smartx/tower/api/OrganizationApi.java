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
   * @param contentLanguage  (required)
   * @param organizationCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskOrganization&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-organization")
  Call<List<WithTaskOrganization>> createOrganization(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<OrganizationCreationParams> organizationCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param organizationDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteOrganization&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-organization")
  Call<List<WithTaskDeleteOrganization>> deleteOrganization(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body OrganizationDeletionParams organizationDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getOrganizationsRequestBody  (required)
   * @return Call&lt;List&lt;Organization&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-organizations")
  Call<List<Organization>> getOrganizations(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetOrganizationsRequestBody getOrganizationsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getOrganizationsConnectionRequestBody  (required)
   * @return Call&lt;OrganizationConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-organizations-connection")
  Call<OrganizationConnection> getOrganizationsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetOrganizationsConnectionRequestBody getOrganizationsConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param organizationUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskOrganization&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-organization")
  Call<List<WithTaskOrganization>> updateOrganization(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body OrganizationUpdationParams organizationUpdationParams
  );

}
