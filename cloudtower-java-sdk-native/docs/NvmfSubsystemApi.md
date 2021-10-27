# NvmfSubsystemApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNvmfSubsystems**](NvmfSubsystemApi.md#getNvmfSubsystems) | **POST** /get-nvmf-subsystems | 
[**getNvmfSubsystemsWithHttpInfo**](NvmfSubsystemApi.md#getNvmfSubsystemsWithHttpInfo) | **POST** /get-nvmf-subsystems | 
[**getNvmfSubsystemsConnection**](NvmfSubsystemApi.md#getNvmfSubsystemsConnection) | **POST** /get-nvmf-subsystems-connection | 
[**getNvmfSubsystemsConnectionWithHttpInfo**](NvmfSubsystemApi.md#getNvmfSubsystemsConnectionWithHttpInfo) | **POST** /get-nvmf-subsystems-connection | 



## getNvmfSubsystems

> List<NvmfSubsystem> getNvmfSubsystems(contentLanguage, getNvmfSubsystemsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfSubsystemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfSubsystemApi apiInstance = new NvmfSubsystemApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetNvmfSubsystemsRequestBody getNvmfSubsystemsRequestBody = new GetNvmfSubsystemsRequestBody(); // GetNvmfSubsystemsRequestBody | 
        try {
            List<NvmfSubsystem> result = apiInstance.getNvmfSubsystems(contentLanguage, getNvmfSubsystemsRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfSubsystemApi#getNvmfSubsystems");
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
 **getNvmfSubsystemsRequestBody** | [**GetNvmfSubsystemsRequestBody**](GetNvmfSubsystemsRequestBody.md)|  |

### Return type

[**List&lt;NvmfSubsystem&gt;**](NvmfSubsystem.md)


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

## getNvmfSubsystemsWithHttpInfo

> ApiResponse<List<NvmfSubsystem>> getNvmfSubsystems getNvmfSubsystemsWithHttpInfo(contentLanguage, getNvmfSubsystemsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfSubsystemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfSubsystemApi apiInstance = new NvmfSubsystemApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetNvmfSubsystemsRequestBody getNvmfSubsystemsRequestBody = new GetNvmfSubsystemsRequestBody(); // GetNvmfSubsystemsRequestBody | 
        try {
            ApiResponse<List<NvmfSubsystem>> response = apiInstance.getNvmfSubsystemsWithHttpInfo(contentLanguage, getNvmfSubsystemsRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfSubsystemApi#getNvmfSubsystems");
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
 **getNvmfSubsystemsRequestBody** | [**GetNvmfSubsystemsRequestBody**](GetNvmfSubsystemsRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;NvmfSubsystem&gt;**](NvmfSubsystem.md)>


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


## getNvmfSubsystemsConnection

> NvmfSubsystemConnection getNvmfSubsystemsConnection(contentLanguage, getNvmfSubsystemsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfSubsystemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfSubsystemApi apiInstance = new NvmfSubsystemApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetNvmfSubsystemsConnectionRequestBody getNvmfSubsystemsConnectionRequestBody = new GetNvmfSubsystemsConnectionRequestBody(); // GetNvmfSubsystemsConnectionRequestBody | 
        try {
            NvmfSubsystemConnection result = apiInstance.getNvmfSubsystemsConnection(contentLanguage, getNvmfSubsystemsConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfSubsystemApi#getNvmfSubsystemsConnection");
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
 **getNvmfSubsystemsConnectionRequestBody** | [**GetNvmfSubsystemsConnectionRequestBody**](GetNvmfSubsystemsConnectionRequestBody.md)|  |

### Return type

[**NvmfSubsystemConnection**](NvmfSubsystemConnection.md)


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

## getNvmfSubsystemsConnectionWithHttpInfo

> ApiResponse<NvmfSubsystemConnection> getNvmfSubsystemsConnection getNvmfSubsystemsConnectionWithHttpInfo(contentLanguage, getNvmfSubsystemsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfSubsystemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfSubsystemApi apiInstance = new NvmfSubsystemApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetNvmfSubsystemsConnectionRequestBody getNvmfSubsystemsConnectionRequestBody = new GetNvmfSubsystemsConnectionRequestBody(); // GetNvmfSubsystemsConnectionRequestBody | 
        try {
            ApiResponse<NvmfSubsystemConnection> response = apiInstance.getNvmfSubsystemsConnectionWithHttpInfo(contentLanguage, getNvmfSubsystemsConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfSubsystemApi#getNvmfSubsystemsConnection");
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
 **getNvmfSubsystemsConnectionRequestBody** | [**GetNvmfSubsystemsConnectionRequestBody**](GetNvmfSubsystemsConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**NvmfSubsystemConnection**](NvmfSubsystemConnection.md)>


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

