# NodeTopoApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNodeTopoes**](NodeTopoApi.md#getNodeTopoes) | **POST** /get-node-topoes | 
[**getNodeTopoesConnection**](NodeTopoApi.md#getNodeTopoesConnection) | **POST** /get-node-topoes-connection | 
[**updateNodeTopo**](NodeTopoApi.md#updateNodeTopo) | **POST** /move-node-topo | 


<a name="getNodeTopoes"></a>
# **getNodeTopoes**
> List&lt;NodeTopo&gt; getNodeTopoes(getNodeTopoesRequestBody, contentLanguage)



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
    GetNodeTopoesRequestBody getNodeTopoesRequestBody = new GetNodeTopoesRequestBody(); // GetNodeTopoesRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<NodeTopo> result = apiInstance.getNodeTopoes(getNodeTopoesRequestBody, contentLanguage);
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
 **getNodeTopoesRequestBody** | [**GetNodeTopoesRequestBody**](GetNodeTopoesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
**200** | Ok |  -  |
**400** |  |  -  |

<a name="getNodeTopoesConnection"></a>
# **getNodeTopoesConnection**
> NodeTopoConnection getNodeTopoesConnection(getNodeTopoesConnectionRequestBody, contentLanguage)



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
    GetNodeTopoesConnectionRequestBody getNodeTopoesConnectionRequestBody = new GetNodeTopoesConnectionRequestBody(); // GetNodeTopoesConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      NodeTopoConnection result = apiInstance.getNodeTopoesConnection(getNodeTopoesConnectionRequestBody, contentLanguage);
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
 **getNodeTopoesConnectionRequestBody** | [**GetNodeTopoesConnectionRequestBody**](GetNodeTopoesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
**200** | Ok |  -  |
**400** |  |  -  |

<a name="updateNodeTopo"></a>
# **updateNodeTopo**
> List&lt;WithTaskNodeTopo&gt; updateNodeTopo(requestBody, contentLanguage)



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
    List<Object> requestBody = null; // List<Object> | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskNodeTopo> result = apiInstance.updateNodeTopo(requestBody, contentLanguage);
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
 **requestBody** | [**List&lt;Object&gt;**](Object.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
**200** | Ok |  -  |
**400** |  |  -  |

