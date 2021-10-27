# VmEntityFilterResultApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVmEntityFilterResults**](VmEntityFilterResultApi.md#getVmEntityFilterResults) | **POST** /get-vm-entity-filter-results | 
[**getVmEntityFilterResultsWithHttpInfo**](VmEntityFilterResultApi.md#getVmEntityFilterResultsWithHttpInfo) | **POST** /get-vm-entity-filter-results | 
[**getVmEntityFilterResultsConnection**](VmEntityFilterResultApi.md#getVmEntityFilterResultsConnection) | **POST** /get-vm-entity-filter-results-connection | 
[**getVmEntityFilterResultsConnectionWithHttpInfo**](VmEntityFilterResultApi.md#getVmEntityFilterResultsConnectionWithHttpInfo) | **POST** /get-vm-entity-filter-results-connection | 



## getVmEntityFilterResults

> List<VmEntityFilterResult> getVmEntityFilterResults(contentLanguage, getVmEntityFilterResultsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmEntityFilterResultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmEntityFilterResultApi apiInstance = new VmEntityFilterResultApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmEntityFilterResultsRequestBody getVmEntityFilterResultsRequestBody = new GetVmEntityFilterResultsRequestBody(); // GetVmEntityFilterResultsRequestBody | 
        try {
            List<VmEntityFilterResult> result = apiInstance.getVmEntityFilterResults(contentLanguage, getVmEntityFilterResultsRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmEntityFilterResultApi#getVmEntityFilterResults");
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
 **getVmEntityFilterResultsRequestBody** | [**GetVmEntityFilterResultsRequestBody**](GetVmEntityFilterResultsRequestBody.md)|  |

### Return type

[**List&lt;VmEntityFilterResult&gt;**](VmEntityFilterResult.md)


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

## getVmEntityFilterResultsWithHttpInfo

> ApiResponse<List<VmEntityFilterResult>> getVmEntityFilterResults getVmEntityFilterResultsWithHttpInfo(contentLanguage, getVmEntityFilterResultsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmEntityFilterResultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmEntityFilterResultApi apiInstance = new VmEntityFilterResultApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmEntityFilterResultsRequestBody getVmEntityFilterResultsRequestBody = new GetVmEntityFilterResultsRequestBody(); // GetVmEntityFilterResultsRequestBody | 
        try {
            ApiResponse<List<VmEntityFilterResult>> response = apiInstance.getVmEntityFilterResultsWithHttpInfo(contentLanguage, getVmEntityFilterResultsRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmEntityFilterResultApi#getVmEntityFilterResults");
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
 **getVmEntityFilterResultsRequestBody** | [**GetVmEntityFilterResultsRequestBody**](GetVmEntityFilterResultsRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;VmEntityFilterResult&gt;**](VmEntityFilterResult.md)>


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


## getVmEntityFilterResultsConnection

> VmEntityFilterResultConnection getVmEntityFilterResultsConnection(contentLanguage, getVmEntityFilterResultsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmEntityFilterResultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmEntityFilterResultApi apiInstance = new VmEntityFilterResultApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmEntityFilterResultsConnectionRequestBody getVmEntityFilterResultsConnectionRequestBody = new GetVmEntityFilterResultsConnectionRequestBody(); // GetVmEntityFilterResultsConnectionRequestBody | 
        try {
            VmEntityFilterResultConnection result = apiInstance.getVmEntityFilterResultsConnection(contentLanguage, getVmEntityFilterResultsConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmEntityFilterResultApi#getVmEntityFilterResultsConnection");
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
 **getVmEntityFilterResultsConnectionRequestBody** | [**GetVmEntityFilterResultsConnectionRequestBody**](GetVmEntityFilterResultsConnectionRequestBody.md)|  |

### Return type

[**VmEntityFilterResultConnection**](VmEntityFilterResultConnection.md)


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

## getVmEntityFilterResultsConnectionWithHttpInfo

> ApiResponse<VmEntityFilterResultConnection> getVmEntityFilterResultsConnection getVmEntityFilterResultsConnectionWithHttpInfo(contentLanguage, getVmEntityFilterResultsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmEntityFilterResultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmEntityFilterResultApi apiInstance = new VmEntityFilterResultApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmEntityFilterResultsConnectionRequestBody getVmEntityFilterResultsConnectionRequestBody = new GetVmEntityFilterResultsConnectionRequestBody(); // GetVmEntityFilterResultsConnectionRequestBody | 
        try {
            ApiResponse<VmEntityFilterResultConnection> response = apiInstance.getVmEntityFilterResultsConnectionWithHttpInfo(contentLanguage, getVmEntityFilterResultsConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmEntityFilterResultApi#getVmEntityFilterResultsConnection");
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
 **getVmEntityFilterResultsConnectionRequestBody** | [**GetVmEntityFilterResultsConnectionRequestBody**](GetVmEntityFilterResultsConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**VmEntityFilterResultConnection**](VmEntityFilterResultConnection.md)>


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

