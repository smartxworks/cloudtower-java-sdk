# UserRoleNextApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRole**](UserRoleNextApi.md#createRole) | **POST** create-role | 
[**deleteRole**](UserRoleNextApi.md#deleteRole) | **POST** delete-role | 
[**getUserRoleNexts**](UserRoleNextApi.md#getUserRoleNexts) | **POST** get-user-role-nexts | 
[**getUserRoleNextsConnection**](UserRoleNextApi.md#getUserRoleNextsConnection) | **POST** get-user-role-nexts-connection | 
[**updateRole**](UserRoleNextApi.md#updateRole) | **POST** update-role | 



## createRole

> List&lt;WithTaskUserRoleNext&gt; createRole(contentLanguage, roleCreationParams)



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
        String contentLanguage = "zh-CN"; // String | 
        List<RoleCreationParams> roleCreationParams = Arrays.asList(); // List<RoleCreationParams> | 
        try {
            List<WithTaskUserRoleNext> result = apiInstance.createRole(contentLanguage, roleCreationParams);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **roleCreationParams** | [**List&lt;RoleCreationParams&gt;**](RoleCreationParams.md)|  |

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
| **200** | Ok |  -  |
| **400** |  |  -  |


## deleteRole

> List&lt;WithTaskDeleteRole&gt; deleteRole(contentLanguage, roleDeletionParams)



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
        String contentLanguage = "zh-CN"; // String | 
        RoleDeletionParams roleDeletionParams = new RoleDeletionParams(); // RoleDeletionParams | 
        try {
            List<WithTaskDeleteRole> result = apiInstance.deleteRole(contentLanguage, roleDeletionParams);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **roleDeletionParams** | [**RoleDeletionParams**](RoleDeletionParams.md)|  |

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
| **200** | Ok |  -  |
| **400** |  |  -  |


## getUserRoleNexts

> List&lt;UserRoleNext&gt; getUserRoleNexts(contentLanguage, getUserRoleNextsRequestBody)



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
        String contentLanguage = "zh-CN"; // String | 
        GetUserRoleNextsRequestBody getUserRoleNextsRequestBody = new GetUserRoleNextsRequestBody(); // GetUserRoleNextsRequestBody | 
        try {
            List<UserRoleNext> result = apiInstance.getUserRoleNexts(contentLanguage, getUserRoleNextsRequestBody);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getUserRoleNextsRequestBody** | [**GetUserRoleNextsRequestBody**](GetUserRoleNextsRequestBody.md)|  |

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
| **200** | Ok |  -  |
| **400** |  |  -  |


## getUserRoleNextsConnection

> UserRoleNextConnection getUserRoleNextsConnection(contentLanguage, getUserRoleNextsConnectionRequestBody)



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
        String contentLanguage = "zh-CN"; // String | 
        GetUserRoleNextsConnectionRequestBody getUserRoleNextsConnectionRequestBody = new GetUserRoleNextsConnectionRequestBody(); // GetUserRoleNextsConnectionRequestBody | 
        try {
            UserRoleNextConnection result = apiInstance.getUserRoleNextsConnection(contentLanguage, getUserRoleNextsConnectionRequestBody);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getUserRoleNextsConnectionRequestBody** | [**GetUserRoleNextsConnectionRequestBody**](GetUserRoleNextsConnectionRequestBody.md)|  |

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
| **200** | Ok |  -  |
| **400** |  |  -  |


## updateRole

> List&lt;WithTaskUserRoleNext&gt; updateRole(contentLanguage, roleUpdationParams)



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
        String contentLanguage = "zh-CN"; // String | 
        RoleUpdationParams roleUpdationParams = new RoleUpdationParams(); // RoleUpdationParams | 
        try {
            List<WithTaskUserRoleNext> result = apiInstance.updateRole(contentLanguage, roleUpdationParams);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **roleUpdationParams** | [**RoleUpdationParams**](RoleUpdationParams.md)|  |

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
| **200** | Ok |  -  |
| **400** |  |  -  |

