# RackTopoApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRackTopo**](RackTopoApi.md#createRackTopo) | **POST** create-rack-topo | 
[**deleteRackTopo**](RackTopoApi.md#deleteRackTopo) | **POST** delete-rack-topo | 
[**getRackTopoes**](RackTopoApi.md#getRackTopoes) | **POST** get-rack-topoes | 
[**getRackTopoesConnection**](RackTopoApi.md#getRackTopoesConnection) | **POST** get-rack-topoes-connection | 
[**updateRackTopo**](RackTopoApi.md#updateRackTopo) | **POST** update-rack-topo | 



## createRackTopo

> List&lt;WithTaskRackTopo&gt; createRackTopo(contentLanguage, rackTopoCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.RackTopoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        RackTopoApi apiInstance = new RackTopoApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<RackTopoCreationParams> rackTopoCreationParams = Arrays.asList(); // List<RackTopoCreationParams> | 
        try {
            List<WithTaskRackTopo> result = apiInstance.createRackTopo(contentLanguage, rackTopoCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RackTopoApi#createRackTopo");
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
 **rackTopoCreationParams** | [**List&lt;RackTopoCreationParams&gt;**](RackTopoCreationParams.md)|  |

### Return type

[**List&lt;WithTaskRackTopo&gt;**](WithTaskRackTopo.md)

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


## deleteRackTopo

> List&lt;WithTaskDeleteRackTopo&gt; deleteRackTopo(contentLanguage, rackTopoDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.RackTopoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        RackTopoApi apiInstance = new RackTopoApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        RackTopoDeletionParams rackTopoDeletionParams = new RackTopoDeletionParams(); // RackTopoDeletionParams | 
        try {
            List<WithTaskDeleteRackTopo> result = apiInstance.deleteRackTopo(contentLanguage, rackTopoDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RackTopoApi#deleteRackTopo");
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
 **rackTopoDeletionParams** | [**RackTopoDeletionParams**](RackTopoDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteRackTopo&gt;**](WithTaskDeleteRackTopo.md)

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


## getRackTopoes

> List&lt;RackTopo&gt; getRackTopoes(contentLanguage, getRackTopoesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.RackTopoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        RackTopoApi apiInstance = new RackTopoApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetRackTopoesRequestBody getRackTopoesRequestBody = new GetRackTopoesRequestBody(); // GetRackTopoesRequestBody | 
        try {
            List<RackTopo> result = apiInstance.getRackTopoes(contentLanguage, getRackTopoesRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RackTopoApi#getRackTopoes");
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
 **getRackTopoesRequestBody** | [**GetRackTopoesRequestBody**](GetRackTopoesRequestBody.md)|  |

### Return type

[**List&lt;RackTopo&gt;**](RackTopo.md)

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


## getRackTopoesConnection

> RackTopoConnection getRackTopoesConnection(contentLanguage, getRackTopoesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.RackTopoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        RackTopoApi apiInstance = new RackTopoApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetRackTopoesConnectionRequestBody getRackTopoesConnectionRequestBody = new GetRackTopoesConnectionRequestBody(); // GetRackTopoesConnectionRequestBody | 
        try {
            RackTopoConnection result = apiInstance.getRackTopoesConnection(contentLanguage, getRackTopoesConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RackTopoApi#getRackTopoesConnection");
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
 **getRackTopoesConnectionRequestBody** | [**GetRackTopoesConnectionRequestBody**](GetRackTopoesConnectionRequestBody.md)|  |

### Return type

[**RackTopoConnection**](RackTopoConnection.md)

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


## updateRackTopo

> List&lt;WithTaskRackTopo&gt; updateRackTopo(contentLanguage, rackTopoUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.RackTopoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        RackTopoApi apiInstance = new RackTopoApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        RackTopoUpdationParams rackTopoUpdationParams = new RackTopoUpdationParams(); // RackTopoUpdationParams | 
        try {
            List<WithTaskRackTopo> result = apiInstance.updateRackTopo(contentLanguage, rackTopoUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RackTopoApi#updateRackTopo");
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
 **rackTopoUpdationParams** | [**RackTopoUpdationParams**](RackTopoUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskRackTopo&gt;**](WithTaskRackTopo.md)

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

