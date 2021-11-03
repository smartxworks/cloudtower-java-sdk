package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetUserRoleNextsConnectionRequestBody;
import com.smartx.tower.model.GetUserRoleNextsRequestBody;
import com.smartx.tower.model.RoleCreationParams;
import com.smartx.tower.model.RoleDeletionParams;
import com.smartx.tower.model.RoleUpdationParams;
import com.smartx.tower.model.UserRoleNext;
import com.smartx.tower.model.UserRoleNextConnection;
import com.smartx.tower.model.WithTaskDeleteRole;
import com.smartx.tower.model.WithTaskUserRoleNext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserRoleNextApi {
  /**
   * 
   * 
   * @param roleCreationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskUserRoleNext&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-role")
  Call<List<WithTaskUserRoleNext>> createRole(
    @retrofit2.http.Body List<RoleCreationParams> roleCreationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param roleDeletionParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskDeleteRole&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-role")
  Call<List<WithTaskDeleteRole>> deleteRole(
    @retrofit2.http.Body RoleDeletionParams roleDeletionParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getUserRoleNextsRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;UserRoleNext&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-user-role-nexts")
  Call<List<UserRoleNext>> getUserRoleNexts(
    @retrofit2.http.Body GetUserRoleNextsRequestBody getUserRoleNextsRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getUserRoleNextsConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;UserRoleNextConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-user-role-nexts-connection")
  Call<UserRoleNextConnection> getUserRoleNextsConnection(
    @retrofit2.http.Body GetUserRoleNextsConnectionRequestBody getUserRoleNextsConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param roleUpdationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskUserRoleNext&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-role")
  Call<List<WithTaskUserRoleNext>> updateRole(
    @retrofit2.http.Body RoleUpdationParams roleUpdationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
