# ImageConnectorApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getImagesConnector**](ImageConnectorApi.md#getImagesConnector) | **POST** /get-images-connector | 
[**getImagesConnectorWithHttpInfo**](ImageConnectorApi.md#getImagesConnectorWithHttpInfo) | **POST** /get-images-connector | 



## getImagesConnector

> List<ImageConnector> getImagesConnector(contentLanguage, getImagesConnectorRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ImageConnectorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ImageConnectorApi apiInstance = new ImageConnectorApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetImagesConnectorRequestBody getImagesConnectorRequestBody = new GetImagesConnectorRequestBody(); // GetImagesConnectorRequestBody | 
        try {
            List<ImageConnector> result = apiInstance.getImagesConnector(contentLanguage, getImagesConnectorRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageConnectorApi#getImagesConnector");
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
 **getImagesConnectorRequestBody** | [**GetImagesConnectorRequestBody**](GetImagesConnectorRequestBody.md)|  |

### Return type

[**List&lt;ImageConnector&gt;**](ImageConnector.md)


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

## getImagesConnectorWithHttpInfo

> ApiResponse<List<ImageConnector>> getImagesConnector getImagesConnectorWithHttpInfo(contentLanguage, getImagesConnectorRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ImageConnectorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ImageConnectorApi apiInstance = new ImageConnectorApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetImagesConnectorRequestBody getImagesConnectorRequestBody = new GetImagesConnectorRequestBody(); // GetImagesConnectorRequestBody | 
        try {
            ApiResponse<List<ImageConnector>> response = apiInstance.getImagesConnectorWithHttpInfo(contentLanguage, getImagesConnectorRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageConnectorApi#getImagesConnector");
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
 **getImagesConnectorRequestBody** | [**GetImagesConnectorRequestBody**](GetImagesConnectorRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;ImageConnector&gt;**](ImageConnector.md)>


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

