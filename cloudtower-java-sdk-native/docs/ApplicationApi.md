# ApplicationApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApplications**](ApplicationApi.md#getApplications) | **POST** /get-applications | 
[**getApplicationsWithHttpInfo**](ApplicationApi.md#getApplicationsWithHttpInfo) | **POST** /get-applications | 
[**getApplicationsConnection**](ApplicationApi.md#getApplicationsConnection) | **POST** /get-applications-connection | 
[**getApplicationsConnectionWithHttpInfo**](ApplicationApi.md#getApplicationsConnectionWithHttpInfo) | **POST** /get-applications-connection | 



## getApplications

> List<Application> getApplications(contentLanguage, getApplicationsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetApplicationsRequestBody getApplicationsRequestBody = new GetApplicationsRequestBody(); // GetApplicationsRequestBody | 
        try {
            List<Application> result = apiInstance.getApplications(contentLanguage, getApplicationsRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#getApplications");
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
 **getApplicationsRequestBody** | [**GetApplicationsRequestBody**](GetApplicationsRequestBody.md)|  |

### Return type

[**List&lt;Application&gt;**](Application.md)


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

## getApplicationsWithHttpInfo

> ApiResponse<List<Application>> getApplications getApplicationsWithHttpInfo(contentLanguage, getApplicationsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetApplicationsRequestBody getApplicationsRequestBody = new GetApplicationsRequestBody(); // GetApplicationsRequestBody | 
        try {
            ApiResponse<List<Application>> response = apiInstance.getApplicationsWithHttpInfo(contentLanguage, getApplicationsRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#getApplications");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getApplicationsRequestBody** | [**GetApplicationsRequestBody**](GetApplicationsRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;Application&gt;**](Application.md)>


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


## getApplicationsConnection

> ApplicationConnection getApplicationsConnection(contentLanguage, getApplicationsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetApplicationsConnectionRequestBody getApplicationsConnectionRequestBody = new GetApplicationsConnectionRequestBody(); // GetApplicationsConnectionRequestBody | 
        try {
            ApplicationConnection result = apiInstance.getApplicationsConnection(contentLanguage, getApplicationsConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#getApplicationsConnection");
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
 **getApplicationsConnectionRequestBody** | [**GetApplicationsConnectionRequestBody**](GetApplicationsConnectionRequestBody.md)|  |

### Return type

[**ApplicationConnection**](ApplicationConnection.md)


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

## getApplicationsConnectionWithHttpInfo

> ApiResponse<ApplicationConnection> getApplicationsConnection getApplicationsConnectionWithHttpInfo(contentLanguage, getApplicationsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetApplicationsConnectionRequestBody getApplicationsConnectionRequestBody = new GetApplicationsConnectionRequestBody(); // GetApplicationsConnectionRequestBody | 
        try {
            ApiResponse<ApplicationConnection> response = apiInstance.getApplicationsConnectionWithHttpInfo(contentLanguage, getApplicationsConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#getApplicationsConnection");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getApplicationsConnectionRequestBody** | [**GetApplicationsConnectionRequestBody**](GetApplicationsConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**ApplicationConnection**](ApplicationConnection.md)>


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

