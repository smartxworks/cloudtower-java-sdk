# ContentLibraryImageApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getContentLibraryImages**](ContentLibraryImageApi.md#getContentLibraryImages) | **POST** /get-content-library-images | 
[**getContentLibraryImagesWithHttpInfo**](ContentLibraryImageApi.md#getContentLibraryImagesWithHttpInfo) | **POST** /get-content-library-images | 
[**getContentLibraryImagesConnection**](ContentLibraryImageApi.md#getContentLibraryImagesConnection) | **POST** /get-content-library-images-connection | 
[**getContentLibraryImagesConnectionWithHttpInfo**](ContentLibraryImageApi.md#getContentLibraryImagesConnectionWithHttpInfo) | **POST** /get-content-library-images-connection | 



## getContentLibraryImages

> List<ContentLibraryImage> getContentLibraryImages(contentLanguage, getContentLibraryImagesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ContentLibraryImageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ContentLibraryImageApi apiInstance = new ContentLibraryImageApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetContentLibraryImagesRequestBody getContentLibraryImagesRequestBody = new GetContentLibraryImagesRequestBody(); // GetContentLibraryImagesRequestBody | 
        try {
            List<ContentLibraryImage> result = apiInstance.getContentLibraryImages(contentLanguage, getContentLibraryImagesRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentLibraryImageApi#getContentLibraryImages");
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
 **getContentLibraryImagesRequestBody** | [**GetContentLibraryImagesRequestBody**](GetContentLibraryImagesRequestBody.md)|  |

### Return type

[**List&lt;ContentLibraryImage&gt;**](ContentLibraryImage.md)


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

## getContentLibraryImagesWithHttpInfo

> ApiResponse<List<ContentLibraryImage>> getContentLibraryImages getContentLibraryImagesWithHttpInfo(contentLanguage, getContentLibraryImagesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ContentLibraryImageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ContentLibraryImageApi apiInstance = new ContentLibraryImageApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetContentLibraryImagesRequestBody getContentLibraryImagesRequestBody = new GetContentLibraryImagesRequestBody(); // GetContentLibraryImagesRequestBody | 
        try {
            ApiResponse<List<ContentLibraryImage>> response = apiInstance.getContentLibraryImagesWithHttpInfo(contentLanguage, getContentLibraryImagesRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentLibraryImageApi#getContentLibraryImages");
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
 **getContentLibraryImagesRequestBody** | [**GetContentLibraryImagesRequestBody**](GetContentLibraryImagesRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;ContentLibraryImage&gt;**](ContentLibraryImage.md)>


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


## getContentLibraryImagesConnection

> ContentLibraryImageConnection getContentLibraryImagesConnection(contentLanguage, getContentLibraryImagesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ContentLibraryImageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ContentLibraryImageApi apiInstance = new ContentLibraryImageApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetContentLibraryImagesConnectionRequestBody getContentLibraryImagesConnectionRequestBody = new GetContentLibraryImagesConnectionRequestBody(); // GetContentLibraryImagesConnectionRequestBody | 
        try {
            ContentLibraryImageConnection result = apiInstance.getContentLibraryImagesConnection(contentLanguage, getContentLibraryImagesConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentLibraryImageApi#getContentLibraryImagesConnection");
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
 **getContentLibraryImagesConnectionRequestBody** | [**GetContentLibraryImagesConnectionRequestBody**](GetContentLibraryImagesConnectionRequestBody.md)|  |

### Return type

[**ContentLibraryImageConnection**](ContentLibraryImageConnection.md)


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

## getContentLibraryImagesConnectionWithHttpInfo

> ApiResponse<ContentLibraryImageConnection> getContentLibraryImagesConnection getContentLibraryImagesConnectionWithHttpInfo(contentLanguage, getContentLibraryImagesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ContentLibraryImageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ContentLibraryImageApi apiInstance = new ContentLibraryImageApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetContentLibraryImagesConnectionRequestBody getContentLibraryImagesConnectionRequestBody = new GetContentLibraryImagesConnectionRequestBody(); // GetContentLibraryImagesConnectionRequestBody | 
        try {
            ApiResponse<ContentLibraryImageConnection> response = apiInstance.getContentLibraryImagesConnectionWithHttpInfo(contentLanguage, getContentLibraryImagesConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentLibraryImageApi#getContentLibraryImagesConnection");
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
 **getContentLibraryImagesConnectionRequestBody** | [**GetContentLibraryImagesConnectionRequestBody**](GetContentLibraryImagesConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**ContentLibraryImageConnection**](ContentLibraryImageConnection.md)>


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

