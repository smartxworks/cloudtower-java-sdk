# NicApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNics**](NicApi.md#getNics) | **POST** /get-nics | 
[**getNicsWithHttpInfo**](NicApi.md#getNicsWithHttpInfo) | **POST** /get-nics | 
[**getNicsConnection**](NicApi.md#getNicsConnection) | **POST** /get-nics-connection | 
[**getNicsConnectionWithHttpInfo**](NicApi.md#getNicsConnectionWithHttpInfo) | **POST** /get-nics-connection | 
[**updateNic**](NicApi.md#updateNic) | **POST** /update-nic | 
[**updateNicWithHttpInfo**](NicApi.md#updateNicWithHttpInfo) | **POST** /update-nic | 



## getNics

> List<Nic> getNics(contentLanguage, getNicsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NicApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NicApi apiInstance = new NicApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetNicsRequestBody getNicsRequestBody = new GetNicsRequestBody(); // GetNicsRequestBody | 
        try {
            List<Nic> result = apiInstance.getNics(contentLanguage, getNicsRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NicApi#getNics");
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
 **getNicsRequestBody** | [**GetNicsRequestBody**](GetNicsRequestBody.md)|  |

### Return type

[**List&lt;Nic&gt;**](Nic.md)


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

## getNicsWithHttpInfo

> ApiResponse<List<Nic>> getNics getNicsWithHttpInfo(contentLanguage, getNicsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NicApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NicApi apiInstance = new NicApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetNicsRequestBody getNicsRequestBody = new GetNicsRequestBody(); // GetNicsRequestBody | 
        try {
            ApiResponse<List<Nic>> response = apiInstance.getNicsWithHttpInfo(contentLanguage, getNicsRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NicApi#getNics");
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
 **getNicsRequestBody** | [**GetNicsRequestBody**](GetNicsRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;Nic&gt;**](Nic.md)>


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


## getNicsConnection

> NicConnection getNicsConnection(contentLanguage, getNicsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NicApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NicApi apiInstance = new NicApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetNicsConnectionRequestBody getNicsConnectionRequestBody = new GetNicsConnectionRequestBody(); // GetNicsConnectionRequestBody | 
        try {
            NicConnection result = apiInstance.getNicsConnection(contentLanguage, getNicsConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NicApi#getNicsConnection");
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
 **getNicsConnectionRequestBody** | [**GetNicsConnectionRequestBody**](GetNicsConnectionRequestBody.md)|  |

### Return type

[**NicConnection**](NicConnection.md)


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

## getNicsConnectionWithHttpInfo

> ApiResponse<NicConnection> getNicsConnection getNicsConnectionWithHttpInfo(contentLanguage, getNicsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NicApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NicApi apiInstance = new NicApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetNicsConnectionRequestBody getNicsConnectionRequestBody = new GetNicsConnectionRequestBody(); // GetNicsConnectionRequestBody | 
        try {
            ApiResponse<NicConnection> response = apiInstance.getNicsConnectionWithHttpInfo(contentLanguage, getNicsConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NicApi#getNicsConnection");
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
 **getNicsConnectionRequestBody** | [**GetNicsConnectionRequestBody**](GetNicsConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**NicConnection**](NicConnection.md)>


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


## updateNic

> List<WithTaskNic> updateNic(contentLanguage, nicUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NicApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NicApi apiInstance = new NicApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        NicUpdationParams nicUpdationParams = new NicUpdationParams(); // NicUpdationParams | 
        try {
            List<WithTaskNic> result = apiInstance.updateNic(contentLanguage, nicUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NicApi#updateNic");
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
 **nicUpdationParams** | [**NicUpdationParams**](NicUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskNic&gt;**](WithTaskNic.md)


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

## updateNicWithHttpInfo

> ApiResponse<List<WithTaskNic>> updateNic updateNicWithHttpInfo(contentLanguage, nicUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NicApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NicApi apiInstance = new NicApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        NicUpdationParams nicUpdationParams = new NicUpdationParams(); // NicUpdationParams | 
        try {
            ApiResponse<List<WithTaskNic>> response = apiInstance.updateNicWithHttpInfo(contentLanguage, nicUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NicApi#updateNic");
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
 **nicUpdationParams** | [**NicUpdationParams**](NicUpdationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskNic&gt;**](WithTaskNic.md)>


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

