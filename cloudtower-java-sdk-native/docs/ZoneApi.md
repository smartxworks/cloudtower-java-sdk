# ZoneApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getZones**](ZoneApi.md#getZones) | **POST** /get-zones | 
[**getZonesWithHttpInfo**](ZoneApi.md#getZonesWithHttpInfo) | **POST** /get-zones | 
[**getZonesConnection**](ZoneApi.md#getZonesConnection) | **POST** /get-zones-connection | 
[**getZonesConnectionWithHttpInfo**](ZoneApi.md#getZonesConnectionWithHttpInfo) | **POST** /get-zones-connection | 



## getZones

> List<Zone> getZones(contentLanguage, getZonesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ZoneApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ZoneApi apiInstance = new ZoneApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetZonesRequestBody getZonesRequestBody = new GetZonesRequestBody(); // GetZonesRequestBody | 
        try {
            List<Zone> result = apiInstance.getZones(contentLanguage, getZonesRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ZoneApi#getZones");
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
 **getZonesRequestBody** | [**GetZonesRequestBody**](GetZonesRequestBody.md)|  |

### Return type

[**List&lt;Zone&gt;**](Zone.md)


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

## getZonesWithHttpInfo

> ApiResponse<List<Zone>> getZones getZonesWithHttpInfo(contentLanguage, getZonesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ZoneApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ZoneApi apiInstance = new ZoneApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetZonesRequestBody getZonesRequestBody = new GetZonesRequestBody(); // GetZonesRequestBody | 
        try {
            ApiResponse<List<Zone>> response = apiInstance.getZonesWithHttpInfo(contentLanguage, getZonesRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ZoneApi#getZones");
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
 **getZonesRequestBody** | [**GetZonesRequestBody**](GetZonesRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;Zone&gt;**](Zone.md)>


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


## getZonesConnection

> ZoneConnection getZonesConnection(contentLanguage, getZonesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ZoneApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ZoneApi apiInstance = new ZoneApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetZonesConnectionRequestBody getZonesConnectionRequestBody = new GetZonesConnectionRequestBody(); // GetZonesConnectionRequestBody | 
        try {
            ZoneConnection result = apiInstance.getZonesConnection(contentLanguage, getZonesConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ZoneApi#getZonesConnection");
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
 **getZonesConnectionRequestBody** | [**GetZonesConnectionRequestBody**](GetZonesConnectionRequestBody.md)|  |

### Return type

[**ZoneConnection**](ZoneConnection.md)


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

## getZonesConnectionWithHttpInfo

> ApiResponse<ZoneConnection> getZonesConnection getZonesConnectionWithHttpInfo(contentLanguage, getZonesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ZoneApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ZoneApi apiInstance = new ZoneApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetZonesConnectionRequestBody getZonesConnectionRequestBody = new GetZonesConnectionRequestBody(); // GetZonesConnectionRequestBody | 
        try {
            ApiResponse<ZoneConnection> response = apiInstance.getZonesConnectionWithHttpInfo(contentLanguage, getZonesConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ZoneApi#getZonesConnection");
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
 **getZonesConnectionRequestBody** | [**GetZonesConnectionRequestBody**](GetZonesConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**ZoneConnection**](ZoneConnection.md)>


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

