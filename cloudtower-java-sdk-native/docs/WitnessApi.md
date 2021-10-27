# WitnessApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWitnesses**](WitnessApi.md#getWitnesses) | **POST** /get-witnesses | 
[**getWitnessesWithHttpInfo**](WitnessApi.md#getWitnessesWithHttpInfo) | **POST** /get-witnesses | 
[**getWitnessesConnection**](WitnessApi.md#getWitnessesConnection) | **POST** /get-witnesses-connection | 
[**getWitnessesConnectionWithHttpInfo**](WitnessApi.md#getWitnessesConnectionWithHttpInfo) | **POST** /get-witnesses-connection | 



## getWitnesses

> List<Witness> getWitnesses(contentLanguage, getWitnessesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.WitnessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        WitnessApi apiInstance = new WitnessApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetWitnessesRequestBody getWitnessesRequestBody = new GetWitnessesRequestBody(); // GetWitnessesRequestBody | 
        try {
            List<Witness> result = apiInstance.getWitnesses(contentLanguage, getWitnessesRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WitnessApi#getWitnesses");
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
 **getWitnessesRequestBody** | [**GetWitnessesRequestBody**](GetWitnessesRequestBody.md)|  |

### Return type

[**List&lt;Witness&gt;**](Witness.md)


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

## getWitnessesWithHttpInfo

> ApiResponse<List<Witness>> getWitnesses getWitnessesWithHttpInfo(contentLanguage, getWitnessesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.WitnessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        WitnessApi apiInstance = new WitnessApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetWitnessesRequestBody getWitnessesRequestBody = new GetWitnessesRequestBody(); // GetWitnessesRequestBody | 
        try {
            ApiResponse<List<Witness>> response = apiInstance.getWitnessesWithHttpInfo(contentLanguage, getWitnessesRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WitnessApi#getWitnesses");
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
 **getWitnessesRequestBody** | [**GetWitnessesRequestBody**](GetWitnessesRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;Witness&gt;**](Witness.md)>


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


## getWitnessesConnection

> WitnessConnection getWitnessesConnection(contentLanguage, getWitnessesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.WitnessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        WitnessApi apiInstance = new WitnessApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetWitnessesConnectionRequestBody getWitnessesConnectionRequestBody = new GetWitnessesConnectionRequestBody(); // GetWitnessesConnectionRequestBody | 
        try {
            WitnessConnection result = apiInstance.getWitnessesConnection(contentLanguage, getWitnessesConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WitnessApi#getWitnessesConnection");
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
 **getWitnessesConnectionRequestBody** | [**GetWitnessesConnectionRequestBody**](GetWitnessesConnectionRequestBody.md)|  |

### Return type

[**WitnessConnection**](WitnessConnection.md)


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

## getWitnessesConnectionWithHttpInfo

> ApiResponse<WitnessConnection> getWitnessesConnection getWitnessesConnectionWithHttpInfo(contentLanguage, getWitnessesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.WitnessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        WitnessApi apiInstance = new WitnessApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetWitnessesConnectionRequestBody getWitnessesConnectionRequestBody = new GetWitnessesConnectionRequestBody(); // GetWitnessesConnectionRequestBody | 
        try {
            ApiResponse<WitnessConnection> response = apiInstance.getWitnessesConnectionWithHttpInfo(contentLanguage, getWitnessesConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WitnessApi#getWitnessesConnection");
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
 **getWitnessesConnectionRequestBody** | [**GetWitnessesConnectionRequestBody**](GetWitnessesConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**WitnessConnection**](WitnessConnection.md)>


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

