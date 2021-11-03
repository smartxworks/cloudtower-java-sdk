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

> List&lt;WithTaskBrickTopo&gt; createBrickTopo(brickTopoCreationParams, contentLanguage)



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
        List<BrickTopoCreationParams> brickTopoCreationParams = Arrays.asList(); // List<BrickTopoCreationParams> | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskBrickTopo> result = apiInstance.createBrickTopo(brickTopoCreationParams, contentLanguage);
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
 **brickTopoCreationParams** | [**List&lt;BrickTopoCreationParams&gt;**](BrickTopoCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

> List&lt;WithTaskDeleteBrickTopo&gt; deleteBrickTopo(brickTopoDeletionParams, contentLanguage)



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
        BrickTopoDeletionParams brickTopoDeletionParams = new BrickTopoDeletionParams(); // BrickTopoDeletionParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskDeleteBrickTopo> result = apiInstance.deleteBrickTopo(brickTopoDeletionParams, contentLanguage);
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
 **brickTopoDeletionParams** | [**BrickTopoDeletionParams**](BrickTopoDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

> List&lt;BrickTopo&gt; getBrickTopoes(getBrickTopoesRequestBody, contentLanguage)



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
        GetBrickTopoesRequestBody getBrickTopoesRequestBody = new GetBrickTopoesRequestBody(); // GetBrickTopoesRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<BrickTopo> result = apiInstance.getBrickTopoes(getBrickTopoesRequestBody, contentLanguage);
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
 **getBrickTopoesRequestBody** | [**GetBrickTopoesRequestBody**](GetBrickTopoesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

> BrickTopoConnection getBrickTopoesConnection(getBrickTopoesConnectionRequestBody, contentLanguage)



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
        GetBrickTopoesConnectionRequestBody getBrickTopoesConnectionRequestBody = new GetBrickTopoesConnectionRequestBody(); // GetBrickTopoesConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            BrickTopoConnection result = apiInstance.getBrickTopoesConnection(getBrickTopoesConnectionRequestBody, contentLanguage);
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
 **getBrickTopoesConnectionRequestBody** | [**GetBrickTopoesConnectionRequestBody**](GetBrickTopoesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

> List&lt;WithTaskBrickTopo&gt; moveBrickTopo(brickTopoMoveParams, contentLanguage)



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
        BrickTopoMoveParams brickTopoMoveParams = new BrickTopoMoveParams(); // BrickTopoMoveParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskBrickTopo> result = apiInstance.moveBrickTopo(brickTopoMoveParams, contentLanguage);
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
 **brickTopoMoveParams** | [**BrickTopoMoveParams**](BrickTopoMoveParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

> List&lt;WithTaskBrickTopo&gt; updateBrickTopo(brickTopoUpdationParams, contentLanguage)



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
        BrickTopoUpdationParams brickTopoUpdationParams = new BrickTopoUpdationParams(); // BrickTopoUpdationParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskBrickTopo> result = apiInstance.updateBrickTopo(brickTopoUpdationParams, contentLanguage);
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
 **brickTopoUpdationParams** | [**BrickTopoUpdationParams**](BrickTopoUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

