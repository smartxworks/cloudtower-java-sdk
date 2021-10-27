# EverouteClusterApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEverouteClusters**](EverouteClusterApi.md#getEverouteClusters) | **POST** /get-everoute-clusters | 
[**getEverouteClustersWithHttpInfo**](EverouteClusterApi.md#getEverouteClustersWithHttpInfo) | **POST** /get-everoute-clusters | 
[**getEverouteClustersConnection**](EverouteClusterApi.md#getEverouteClustersConnection) | **POST** /get-everoute-clusters-connection | 
[**getEverouteClustersConnectionWithHttpInfo**](EverouteClusterApi.md#getEverouteClustersConnectionWithHttpInfo) | **POST** /get-everoute-clusters-connection | 



## getEverouteClusters

> List<EverouteCluster> getEverouteClusters(contentLanguage, getEverouteClustersRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.EverouteClusterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        EverouteClusterApi apiInstance = new EverouteClusterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetEverouteClustersRequestBody getEverouteClustersRequestBody = new GetEverouteClustersRequestBody(); // GetEverouteClustersRequestBody | 
        try {
            List<EverouteCluster> result = apiInstance.getEverouteClusters(contentLanguage, getEverouteClustersRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EverouteClusterApi#getEverouteClusters");
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
 **getEverouteClustersRequestBody** | [**GetEverouteClustersRequestBody**](GetEverouteClustersRequestBody.md)|  |

### Return type

[**List&lt;EverouteCluster&gt;**](EverouteCluster.md)


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

## getEverouteClustersWithHttpInfo

> ApiResponse<List<EverouteCluster>> getEverouteClusters getEverouteClustersWithHttpInfo(contentLanguage, getEverouteClustersRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.EverouteClusterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        EverouteClusterApi apiInstance = new EverouteClusterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetEverouteClustersRequestBody getEverouteClustersRequestBody = new GetEverouteClustersRequestBody(); // GetEverouteClustersRequestBody | 
        try {
            ApiResponse<List<EverouteCluster>> response = apiInstance.getEverouteClustersWithHttpInfo(contentLanguage, getEverouteClustersRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EverouteClusterApi#getEverouteClusters");
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
 **getEverouteClustersRequestBody** | [**GetEverouteClustersRequestBody**](GetEverouteClustersRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;EverouteCluster&gt;**](EverouteCluster.md)>


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


## getEverouteClustersConnection

> EverouteClusterConnection getEverouteClustersConnection(contentLanguage, getEverouteClustersConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.EverouteClusterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        EverouteClusterApi apiInstance = new EverouteClusterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetEverouteClustersConnectionRequestBody getEverouteClustersConnectionRequestBody = new GetEverouteClustersConnectionRequestBody(); // GetEverouteClustersConnectionRequestBody | 
        try {
            EverouteClusterConnection result = apiInstance.getEverouteClustersConnection(contentLanguage, getEverouteClustersConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EverouteClusterApi#getEverouteClustersConnection");
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
 **getEverouteClustersConnectionRequestBody** | [**GetEverouteClustersConnectionRequestBody**](GetEverouteClustersConnectionRequestBody.md)|  |

### Return type

[**EverouteClusterConnection**](EverouteClusterConnection.md)


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

## getEverouteClustersConnectionWithHttpInfo

> ApiResponse<EverouteClusterConnection> getEverouteClustersConnection getEverouteClustersConnectionWithHttpInfo(contentLanguage, getEverouteClustersConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.EverouteClusterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        EverouteClusterApi apiInstance = new EverouteClusterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetEverouteClustersConnectionRequestBody getEverouteClustersConnectionRequestBody = new GetEverouteClustersConnectionRequestBody(); // GetEverouteClustersConnectionRequestBody | 
        try {
            ApiResponse<EverouteClusterConnection> response = apiInstance.getEverouteClustersConnectionWithHttpInfo(contentLanguage, getEverouteClustersConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EverouteClusterApi#getEverouteClustersConnection");
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
 **getEverouteClustersConnectionRequestBody** | [**GetEverouteClustersConnectionRequestBody**](GetEverouteClustersConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**EverouteClusterConnection**](EverouteClusterConnection.md)>


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

