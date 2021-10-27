# SvtImageApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSvtImages**](SvtImageApi.md#getSvtImages) | **POST** /get-svt-images | 
[**getSvtImagesWithHttpInfo**](SvtImageApi.md#getSvtImagesWithHttpInfo) | **POST** /get-svt-images | 
[**getSvtImagesConnection**](SvtImageApi.md#getSvtImagesConnection) | **POST** /get-svt-images-connection | 
[**getSvtImagesConnectionWithHttpInfo**](SvtImageApi.md#getSvtImagesConnectionWithHttpInfo) | **POST** /get-svt-images-connection | 



## getSvtImages

> List<SvtImage> getSvtImages(contentLanguage, getSvtImagesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SvtImageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SvtImageApi apiInstance = new SvtImageApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetSvtImagesRequestBody getSvtImagesRequestBody = new GetSvtImagesRequestBody(); // GetSvtImagesRequestBody | 
        try {
            List<SvtImage> result = apiInstance.getSvtImages(contentLanguage, getSvtImagesRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SvtImageApi#getSvtImages");
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
 **getSvtImagesRequestBody** | [**GetSvtImagesRequestBody**](GetSvtImagesRequestBody.md)|  |

### Return type

[**List&lt;SvtImage&gt;**](SvtImage.md)


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

## getSvtImagesWithHttpInfo

> ApiResponse<List<SvtImage>> getSvtImages getSvtImagesWithHttpInfo(contentLanguage, getSvtImagesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SvtImageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SvtImageApi apiInstance = new SvtImageApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetSvtImagesRequestBody getSvtImagesRequestBody = new GetSvtImagesRequestBody(); // GetSvtImagesRequestBody | 
        try {
            ApiResponse<List<SvtImage>> response = apiInstance.getSvtImagesWithHttpInfo(contentLanguage, getSvtImagesRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SvtImageApi#getSvtImages");
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
 **getSvtImagesRequestBody** | [**GetSvtImagesRequestBody**](GetSvtImagesRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;SvtImage&gt;**](SvtImage.md)>


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


## getSvtImagesConnection

> SvtImageConnection getSvtImagesConnection(contentLanguage, getSvtImagesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SvtImageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SvtImageApi apiInstance = new SvtImageApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetSvtImagesConnectionRequestBody getSvtImagesConnectionRequestBody = new GetSvtImagesConnectionRequestBody(); // GetSvtImagesConnectionRequestBody | 
        try {
            SvtImageConnection result = apiInstance.getSvtImagesConnection(contentLanguage, getSvtImagesConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SvtImageApi#getSvtImagesConnection");
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
 **getSvtImagesConnectionRequestBody** | [**GetSvtImagesConnectionRequestBody**](GetSvtImagesConnectionRequestBody.md)|  |

### Return type

[**SvtImageConnection**](SvtImageConnection.md)


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

## getSvtImagesConnectionWithHttpInfo

> ApiResponse<SvtImageConnection> getSvtImagesConnection getSvtImagesConnectionWithHttpInfo(contentLanguage, getSvtImagesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SvtImageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SvtImageApi apiInstance = new SvtImageApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetSvtImagesConnectionRequestBody getSvtImagesConnectionRequestBody = new GetSvtImagesConnectionRequestBody(); // GetSvtImagesConnectionRequestBody | 
        try {
            ApiResponse<SvtImageConnection> response = apiInstance.getSvtImagesConnectionWithHttpInfo(contentLanguage, getSvtImagesConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SvtImageApi#getSvtImagesConnection");
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
 **getSvtImagesConnectionRequestBody** | [**GetSvtImagesConnectionRequestBody**](GetSvtImagesConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**SvtImageConnection**](SvtImageConnection.md)>


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

