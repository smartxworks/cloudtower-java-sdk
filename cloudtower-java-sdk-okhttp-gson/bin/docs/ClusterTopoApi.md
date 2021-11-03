# ClusterTopoApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClusterTopoes**](ClusterTopoApi.md#getClusterTopoes) | **POST** /get-cluster-topoes | 
[**getClusterTopoesConnection**](ClusterTopoApi.md#getClusterTopoesConnection) | **POST** /get-cluster-topoes-connection | 


<a name="getClusterTopoes"></a>
# **getClusterTopoes**
> List&lt;ClusterTopo&gt; getClusterTopoes(getClusterTopoesRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ClusterTopoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ClusterTopoApi apiInstance = new ClusterTopoApi(defaultClient);
    GetClusterTopoesRequestBody getClusterTopoesRequestBody = new GetClusterTopoesRequestBody(); // GetClusterTopoesRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<ClusterTopo> result = apiInstance.getClusterTopoes(getClusterTopoesRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterTopoApi#getClusterTopoes");
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
 **getClusterTopoesRequestBody** | [**GetClusterTopoesRequestBody**](GetClusterTopoesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;ClusterTopo&gt;**](ClusterTopo.md)

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

<a name="getClusterTopoesConnection"></a>
# **getClusterTopoesConnection**
> ClusterTopoConnection getClusterTopoesConnection(getClusterTopoesConnectionRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ClusterTopoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ClusterTopoApi apiInstance = new ClusterTopoApi(defaultClient);
    GetClusterTopoesConnectionRequestBody getClusterTopoesConnectionRequestBody = new GetClusterTopoesConnectionRequestBody(); // GetClusterTopoesConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      ClusterTopoConnection result = apiInstance.getClusterTopoesConnection(getClusterTopoesConnectionRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterTopoApi#getClusterTopoesConnection");
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
 **getClusterTopoesConnectionRequestBody** | [**GetClusterTopoesConnectionRequestBody**](GetClusterTopoesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**ClusterTopoConnection**](ClusterTopoConnection.md)

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

