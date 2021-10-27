# UserApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UserApi.md#createUser) | **POST** /create-user | 
[**deleteUser**](UserApi.md#deleteUser) | **POST** /delete-user | 
[**getUsers**](UserApi.md#getUsers) | **POST** /get-users | 
[**getUsersConnection**](UserApi.md#getUsersConnection) | **POST** /get-users-connection | 
[**login**](UserApi.md#login) | **POST** /login | 
[**updateUser**](UserApi.md#updateUser) | **POST** /update-user | 


<a name="createUser"></a>
# **createUser**
> List&lt;WithTaskUser&gt; createUser(contentLanguage, userCreationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    List<UserCreationParams> userCreationParams = Arrays.asList(); // List<UserCreationParams> | 
    try {
      List<WithTaskUser> result = apiInstance.createUser(contentLanguage, userCreationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#createUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **userCreationParams** | [**List&lt;UserCreationParams&gt;**](UserCreationParams.md)|  |

### Return type

[**List&lt;WithTaskUser&gt;**](WithTaskUser.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** |  |  -  |

<a name="deleteUser"></a>
# **deleteUser**
> List&lt;WithTaskDeleteUser&gt; deleteUser(contentLanguage, userDeletionParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    UserDeletionParams userDeletionParams = new UserDeletionParams(); // UserDeletionParams | 
    try {
      List<WithTaskDeleteUser> result = apiInstance.deleteUser(contentLanguage, userDeletionParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **userDeletionParams** | [**UserDeletionParams**](UserDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteUser&gt;**](WithTaskDeleteUser.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** |  |  -  |

<a name="getUsers"></a>
# **getUsers**
> List&lt;User&gt; getUsers(contentLanguage, getUsersRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetUsersRequestBody getUsersRequestBody = new GetUsersRequestBody(); // GetUsersRequestBody | 
    try {
      List<User> result = apiInstance.getUsers(contentLanguage, getUsersRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getUsersRequestBody** | [**GetUsersRequestBody**](GetUsersRequestBody.md)|  |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** |  |  -  |

<a name="getUsersConnection"></a>
# **getUsersConnection**
> UserConnection getUsersConnection(contentLanguage, getUsersConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetUsersConnectionRequestBody getUsersConnectionRequestBody = new GetUsersConnectionRequestBody(); // GetUsersConnectionRequestBody | 
    try {
      UserConnection result = apiInstance.getUsersConnection(contentLanguage, getUsersConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getUsersConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getUsersConnectionRequestBody** | [**GetUsersConnectionRequestBody**](GetUsersConnectionRequestBody.md)|  |

### Return type

[**UserConnection**](UserConnection.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** |  |  -  |

<a name="login"></a>
# **login**
> WithTaskTokenString login(contentLanguage, loginInput)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");

    UserApi apiInstance = new UserApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    LoginInput loginInput = new LoginInput(); // LoginInput | 
    try {
      WithTaskTokenString result = apiInstance.login(contentLanguage, loginInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#login");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **loginInput** | [**LoginInput**](LoginInput.md)|  |

### Return type

[**WithTaskTokenString**](WithTaskTokenString.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** |  |  -  |

<a name="updateUser"></a>
# **updateUser**
> List&lt;WithTaskUser&gt; updateUser(contentLanguage, userUpdationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    UserUpdationParams userUpdationParams = new UserUpdationParams(); // UserUpdationParams | 
    try {
      List<WithTaskUser> result = apiInstance.updateUser(contentLanguage, userUpdationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **userUpdationParams** | [**UserUpdationParams**](UserUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskUser&gt;**](WithTaskUser.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** |  |  -  |

