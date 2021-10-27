# NodeTopoApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNodeTopoes**](NodeTopoApi.md#getNodeTopoes) | **POST** get-node-topoes | 
[**getNodeTopoesConnection**](NodeTopoApi.md#getNodeTopoesConnection) | **POST** get-node-topoes-connection | 
[**updateNodeTopo**](NodeTopoApi.md#updateNodeTopo) | **POST** move-node-topo | 



## getNodeTopoes

> List&lt;NodeTopo&gt; getNodeTopoes(contentLanguage, getNodeTopoesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NodeTopoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NodeTopoApi apiInstance = new NodeTopoApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetNodeTopoesRequestBody getNodeTopoesRequestBody = new GetNodeTopoesRequestBody(); // GetNodeTopoesRequestBody | 
        try {
            List<NodeTopo> result = apiInstance.getNodeTopoes(contentLanguage, getNodeTopoesRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NodeTopoApi#getNodeTopoes");
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
 **getNodeTopoesRequestBody** | [**GetNodeTopoesRequestBody**](GetNodeTopoesRequestBody.md)|  |

### Return type

[**List&lt;NodeTopo&gt;**](NodeTopo.md)

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


## getNodeTopoesConnection

> NodeTopoConnection getNodeTopoesConnection(contentLanguage, getNodeTopoesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NodeTopoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NodeTopoApi apiInstance = new NodeTopoApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetNodeTopoesConnectionRequestBody getNodeTopoesConnectionRequestBody = new GetNodeTopoesConnectionRequestBody(); // GetNodeTopoesConnectionRequestBody | 
        try {
            NodeTopoConnection result = apiInstance.getNodeTopoesConnection(contentLanguage, getNodeTopoesConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NodeTopoApi#getNodeTopoesConnection");
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
 **getNodeTopoesConnectionRequestBody** | [**GetNodeTopoesConnectionRequestBody**](GetNodeTopoesConnectionRequestBody.md)|  |

### Return type

[**NodeTopoConnection**](NodeTopoConnection.md)

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


## updateNodeTopo

> List&lt;WithTaskNodeTopo&gt; updateNodeTopo(contentLanguage, requestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NodeTopoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NodeTopoApi apiInstance = new NodeTopoApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<Object> requestBody = null; // List<Object> | 
        try {
            List<WithTaskNodeTopo> result = apiInstance.updateNodeTopo(contentLanguage, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NodeTopoApi#updateNodeTopo");
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
 **requestBody** | [**List&lt;Object&gt;**](Object.md)|  |

### Return type

[**List&lt;WithTaskNodeTopo&gt;**](WithTaskNodeTopo.md)

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

