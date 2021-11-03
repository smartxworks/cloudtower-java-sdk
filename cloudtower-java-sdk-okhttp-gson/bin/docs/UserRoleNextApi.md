# UserRoleNextApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRole**](UserRoleNextApi.md#createRole) | **POST** /create-role | 
[**deleteRole**](UserRoleNextApi.md#deleteRole) | **POST** /delete-role | 
[**getUserRoleNexts**](UserRoleNextApi.md#getUserRoleNexts) | **POST** /get-user-role-nexts | 
[**getUserRoleNextsConnection**](UserRoleNextApi.md#getUserRoleNextsConnection) | **POST** /get-user-role-nexts-connection | 
[**updateRole**](UserRoleNextApi.md#updateRole) | **POST** /update-role | 


<a name="createRole"></a>
# **createRole**
> List&lt;WithTaskUserRoleNext&gt; createRole(roleCreationParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UserRoleNextApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    UserRoleNextApi apiInstance = new UserRoleNextApi(defaultClient);
    List<RoleCreationParams> roleCreationParams = Arrays.asList(); // List<RoleCreationParams> | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskUserRoleNext> result = apiInstance.createRole(roleCreationParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserRoleNextApi#createRole");
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
 **roleCreationParams** | [**List&lt;RoleCreationParams&gt;**](RoleCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskUserRoleNext&gt;**](WithTaskUserRoleNext.md)

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

<a name="deleteRole"></a>
# **deleteRole**
> List&lt;WithTaskDeleteRole&gt; deleteRole(roleDeletionParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UserRoleNextApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    UserRoleNextApi apiInstance = new UserRoleNextApi(defaultClient);
    RoleDeletionParams roleDeletionParams = new RoleDeletionParams(); // RoleDeletionParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskDeleteRole> result = apiInstance.deleteRole(roleDeletionParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserRoleNextApi#deleteRole");
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
 **roleDeletionParams** | [**RoleDeletionParams**](RoleDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskDeleteRole&gt;**](WithTaskDeleteRole.md)

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

<a name="getUserRoleNexts"></a>
# **getUserRoleNexts**
> List&lt;UserRoleNext&gt; getUserRoleNexts(getUserRoleNextsRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UserRoleNextApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    UserRoleNextApi apiInstance = new UserRoleNextApi(defaultClient);
    GetUserRoleNextsRequestBody getUserRoleNextsRequestBody = new GetUserRoleNextsRequestBody(); // GetUserRoleNextsRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<UserRoleNext> result = apiInstance.getUserRoleNexts(getUserRoleNextsRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserRoleNextApi#getUserRoleNexts");
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
 **getUserRoleNextsRequestBody** | [**GetUserRoleNextsRequestBody**](GetUserRoleNextsRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;UserRoleNext&gt;**](UserRoleNext.md)

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

<a name="getUserRoleNextsConnection"></a>
# **getUserRoleNextsConnection**
> UserRoleNextConnection getUserRoleNextsConnection(getUserRoleNextsConnectionRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UserRoleNextApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    UserRoleNextApi apiInstance = new UserRoleNextApi(defaultClient);
    GetUserRoleNextsConnectionRequestBody getUserRoleNextsConnectionRequestBody = new GetUserRoleNextsConnectionRequestBody(); // GetUserRoleNextsConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      UserRoleNextConnection result = apiInstance.getUserRoleNextsConnection(getUserRoleNextsConnectionRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserRoleNextApi#getUserRoleNextsConnection");
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
 **getUserRoleNextsConnectionRequestBody** | [**GetUserRoleNextsConnectionRequestBody**](GetUserRoleNextsConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**UserRoleNextConnection**](UserRoleNextConnection.md)

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

<a name="updateRole"></a>
# **updateRole**
> List&lt;WithTaskUserRoleNext&gt; updateRole(roleUpdationParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UserRoleNextApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    UserRoleNextApi apiInstance = new UserRoleNextApi(defaultClient);
    RoleUpdationParams roleUpdationParams = new RoleUpdationParams(); // RoleUpdationParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskUserRoleNext> result = apiInstance.updateRole(roleUpdationParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserRoleNextApi#updateRole");
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
 **roleUpdationParams** | [**RoleUpdationParams**](RoleUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskUserRoleNext&gt;**](WithTaskUserRoleNext.md)

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

