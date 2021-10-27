package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetUsersConnectionRequestBody;
import com.smartx.tower.model.GetUsersRequestBody;
import com.smartx.tower.model.LoginInput;
import com.smartx.tower.model.User;
import com.smartx.tower.model.UserConnection;
import com.smartx.tower.model.UserCreationParams;
import com.smartx.tower.model.UserDeletionParams;
import com.smartx.tower.model.UserUpdationParams;
import com.smartx.tower.model.WithTaskDeleteUser;
import com.smartx.tower.model.WithTaskTokenString;
import com.smartx.tower.model.WithTaskUser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param userCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskUser&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-user")
  Call<List<WithTaskUser>> createUser(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<UserCreationParams> userCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param userDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteUser&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-user")
  Call<List<WithTaskDeleteUser>> deleteUser(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body UserDeletionParams userDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getUsersRequestBody  (required)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-users")
  Call<List<User>> getUsers(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetUsersRequestBody getUsersRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getUsersConnectionRequestBody  (required)
   * @return Call&lt;UserConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-users-connection")
  Call<UserConnection> getUsersConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetUsersConnectionRequestBody getUsersConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param loginInput  (required)
   * @return Call&lt;WithTaskTokenString&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("login")
  Call<WithTaskTokenString> login(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body LoginInput loginInput
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param userUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskUser&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-user")
  Call<List<WithTaskUser>> updateUser(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body UserUpdationParams userUpdationParams
  );

}
