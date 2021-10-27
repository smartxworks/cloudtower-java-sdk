# BrickTopoApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBrickTopo**](BrickTopoApi.md#createBrickTopo) | **POST** create-brick-topo | 
[**deleteBrickTopo**](BrickTopoApi.md#deleteBrickTopo) | **POST** delete-brick-topo | 
[**getBrickTopoes**](BrickTopoApi.md#getBrickTopoes) | **POST** get-brick-topoes | 
[**getBrickTopoesConnection**](BrickTopoApi.md#getBrickTopoesConnection) | **POST** get-brick-topoes-connection | 
[**moveBrickTopo**](BrickTopoApi.md#moveBrickTopo) | **POST** move-brick-topo | 
[**updateBrickTopo**](BrickTopoApi.md#updateBrickTopo) | **POST** update-brick-topo | 



## createBrickTopo

> List&lt;WithTaskBrickTopo&gt; createBrickTopo(contentLanguage, brickTopoCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.BrickTopoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        BrickTopoApi apiInstance = new BrickTopoApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<BrickTopoCreationParams> brickTopoCreationParams = Arrays.asList(); // List<BrickTopoCreationParams> | 
        try {
            List<WithTaskBrickTopo> result = apiInstance.createBrickTopo(contentLanguage, brickTopoCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrickTopoApi#createBrickTopo");
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
 **brickTopoCreationParams** | [**List&lt;BrickTopoCreationParams&gt;**](BrickTopoCreationParams.md)|  |

### Return type

[**List&lt;WithTaskBrickTopo&gt;**](WithTaskBrickTopo.md)

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


## deleteBrickTopo

> List&lt;WithTaskDeleteBrickTopo&gt; deleteBrickTopo(contentLanguage, brickTopoDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.BrickTopoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        BrickTopoApi apiInstance = new BrickTopoApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        BrickTopoDeletionParams brickTopoDeletionParams = new BrickTopoDeletionParams(); // BrickTopoDeletionParams | 
        try {
            List<WithTaskDeleteBrickTopo> result = apiInstance.deleteBrickTopo(contentLanguage, brickTopoDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrickTopoApi#deleteBrickTopo");
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
 **brickTopoDeletionParams** | [**BrickTopoDeletionParams**](BrickTopoDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteBrickTopo&gt;**](WithTaskDeleteBrickTopo.md)

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


## getBrickTopoes

> List&lt;BrickTopo&gt; getBrickTopoes(contentLanguage, getBrickTopoesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.BrickTopoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        BrickTopoApi apiInstance = new BrickTopoApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetBrickTopoesRequestBody getBrickTopoesRequestBody = new GetBrickTopoesRequestBody(); // GetBrickTopoesRequestBody | 
        try {
            List<BrickTopo> result = apiInstance.getBrickTopoes(contentLanguage, getBrickTopoesRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrickTopoApi#getBrickTopoes");
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
 **getBrickTopoesRequestBody** | [**GetBrickTopoesRequestBody**](GetBrickTopoesRequestBody.md)|  |

### Return type

[**List&lt;BrickTopo&gt;**](BrickTopo.md)

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


## getBrickTopoesConnection

> BrickTopoConnection getBrickTopoesConnection(contentLanguage, getBrickTopoesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.BrickTopoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        BrickTopoApi apiInstance = new BrickTopoApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetBrickTopoesConnectionRequestBody getBrickTopoesConnectionRequestBody = new GetBrickTopoesConnectionRequestBody(); // GetBrickTopoesConnectionRequestBody | 
        try {
            BrickTopoConnection result = apiInstance.getBrickTopoesConnection(contentLanguage, getBrickTopoesConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrickTopoApi#getBrickTopoesConnection");
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
 **getBrickTopoesConnectionRequestBody** | [**GetBrickTopoesConnectionRequestBody**](GetBrickTopoesConnectionRequestBody.md)|  |

### Return type

[**BrickTopoConnection**](BrickTopoConnection.md)

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


## moveBrickTopo

> List&lt;WithTaskBrickTopo&gt; moveBrickTopo(contentLanguage, brickTopoMoveParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.BrickTopoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        BrickTopoApi apiInstance = new BrickTopoApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        BrickTopoMoveParams brickTopoMoveParams = new BrickTopoMoveParams(); // BrickTopoMoveParams | 
        try {
            List<WithTaskBrickTopo> result = apiInstance.moveBrickTopo(contentLanguage, brickTopoMoveParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrickTopoApi#moveBrickTopo");
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
 **brickTopoMoveParams** | [**BrickTopoMoveParams**](BrickTopoMoveParams.md)|  |

### Return type

[**List&lt;WithTaskBrickTopo&gt;**](WithTaskBrickTopo.md)

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


## updateBrickTopo

> List&lt;WithTaskBrickTopo&gt; updateBrickTopo(contentLanguage, brickTopoUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.BrickTopoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        BrickTopoApi apiInstance = new BrickTopoApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        BrickTopoUpdationParams brickTopoUpdationParams = new BrickTopoUpdationParams(); // BrickTopoUpdationParams | 
        try {
            List<WithTaskBrickTopo> result = apiInstance.updateBrickTopo(contentLanguage, brickTopoUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrickTopoApi#updateBrickTopo");
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
 **brickTopoUpdationParams** | [**BrickTopoUpdationParams**](BrickTopoUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskBrickTopo&gt;**](WithTaskBrickTopo.md)

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

