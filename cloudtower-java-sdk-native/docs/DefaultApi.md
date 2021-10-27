# DefaultApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNvmfSubsystem**](DefaultApi.md#createNvmfSubsystem) | **POST** /create-nvmf-subsystem | 
[**createNvmfSubsystemWithHttpInfo**](DefaultApi.md#createNvmfSubsystemWithHttpInfo) | **POST** /create-nvmf-subsystem | 
[**deleteNvmfSubsystem**](DefaultApi.md#deleteNvmfSubsystem) | **POST** /delete-nvmf-subsystem | 
[**deleteNvmfSubsystemWithHttpInfo**](DefaultApi.md#deleteNvmfSubsystemWithHttpInfo) | **POST** /delete-nvmf-subsystem | 
[**updateNvmfSubsystem**](DefaultApi.md#updateNvmfSubsystem) | **POST** /update-nvmf-subsystem | 
[**updateNvmfSubsystemWithHttpInfo**](DefaultApi.md#updateNvmfSubsystemWithHttpInfo) | **POST** /update-nvmf-subsystem | 



## createNvmfSubsystem

> List<WithTaskNvmfSubsystem> createNvmfSubsystem(contentLanguage, nvmfSubsystemCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<NvmfSubsystemCreationParams> nvmfSubsystemCreationParams = Arrays.asList(); // List<NvmfSubsystemCreationParams> | 
        try {
            List<WithTaskNvmfSubsystem> result = apiInstance.createNvmfSubsystem(contentLanguage, nvmfSubsystemCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createNvmfSubsystem");
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
 **nvmfSubsystemCreationParams** | [**List&lt;NvmfSubsystemCreationParams&gt;**](NvmfSubsystemCreationParams.md)|  |

### Return type

[**List&lt;WithTaskNvmfSubsystem&gt;**](WithTaskNvmfSubsystem.md)


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

## createNvmfSubsystemWithHttpInfo

> ApiResponse<List<WithTaskNvmfSubsystem>> createNvmfSubsystem createNvmfSubsystemWithHttpInfo(contentLanguage, nvmfSubsystemCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<NvmfSubsystemCreationParams> nvmfSubsystemCreationParams = Arrays.asList(); // List<NvmfSubsystemCreationParams> | 
        try {
            ApiResponse<List<WithTaskNvmfSubsystem>> response = apiInstance.createNvmfSubsystemWithHttpInfo(contentLanguage, nvmfSubsystemCreationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createNvmfSubsystem");
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
 **nvmfSubsystemCreationParams** | [**List&lt;NvmfSubsystemCreationParams&gt;**](NvmfSubsystemCreationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskNvmfSubsystem&gt;**](WithTaskNvmfSubsystem.md)>


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


## deleteNvmfSubsystem

> List<WithTaskDeleteNvmfSubsystem> deleteNvmfSubsystem(contentLanguage, nvmfSubsystemDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        NvmfSubsystemDeletionParams nvmfSubsystemDeletionParams = new NvmfSubsystemDeletionParams(); // NvmfSubsystemDeletionParams | 
        try {
            List<WithTaskDeleteNvmfSubsystem> result = apiInstance.deleteNvmfSubsystem(contentLanguage, nvmfSubsystemDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#deleteNvmfSubsystem");
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
 **nvmfSubsystemDeletionParams** | [**NvmfSubsystemDeletionParams**](NvmfSubsystemDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteNvmfSubsystem&gt;**](WithTaskDeleteNvmfSubsystem.md)


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

## deleteNvmfSubsystemWithHttpInfo

> ApiResponse<List<WithTaskDeleteNvmfSubsystem>> deleteNvmfSubsystem deleteNvmfSubsystemWithHttpInfo(contentLanguage, nvmfSubsystemDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        NvmfSubsystemDeletionParams nvmfSubsystemDeletionParams = new NvmfSubsystemDeletionParams(); // NvmfSubsystemDeletionParams | 
        try {
            ApiResponse<List<WithTaskDeleteNvmfSubsystem>> response = apiInstance.deleteNvmfSubsystemWithHttpInfo(contentLanguage, nvmfSubsystemDeletionParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#deleteNvmfSubsystem");
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
 **nvmfSubsystemDeletionParams** | [**NvmfSubsystemDeletionParams**](NvmfSubsystemDeletionParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDeleteNvmfSubsystem&gt;**](WithTaskDeleteNvmfSubsystem.md)>


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


## updateNvmfSubsystem

> List<WithTaskNvmfSubsystem> updateNvmfSubsystem(contentLanguage, nvmfSubsystemUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        NvmfSubsystemUpdationParams nvmfSubsystemUpdationParams = new NvmfSubsystemUpdationParams(); // NvmfSubsystemUpdationParams | 
        try {
            List<WithTaskNvmfSubsystem> result = apiInstance.updateNvmfSubsystem(contentLanguage, nvmfSubsystemUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#updateNvmfSubsystem");
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
 **nvmfSubsystemUpdationParams** | [**NvmfSubsystemUpdationParams**](NvmfSubsystemUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskNvmfSubsystem&gt;**](WithTaskNvmfSubsystem.md)


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

## updateNvmfSubsystemWithHttpInfo

> ApiResponse<List<WithTaskNvmfSubsystem>> updateNvmfSubsystem updateNvmfSubsystemWithHttpInfo(contentLanguage, nvmfSubsystemUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        NvmfSubsystemUpdationParams nvmfSubsystemUpdationParams = new NvmfSubsystemUpdationParams(); // NvmfSubsystemUpdationParams | 
        try {
            ApiResponse<List<WithTaskNvmfSubsystem>> response = apiInstance.updateNvmfSubsystemWithHttpInfo(contentLanguage, nvmfSubsystemUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#updateNvmfSubsystem");
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
 **nvmfSubsystemUpdationParams** | [**NvmfSubsystemUpdationParams**](NvmfSubsystemUpdationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskNvmfSubsystem&gt;**](WithTaskNvmfSubsystem.md)>


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

