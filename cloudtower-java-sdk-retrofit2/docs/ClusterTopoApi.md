# ClusterTopoApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClusterTopoes**](ClusterTopoApi.md#getClusterTopoes) | **POST** get-cluster-topoes | 
[**getClusterTopoesConnection**](ClusterTopoApi.md#getClusterTopoesConnection) | **POST** get-cluster-topoes-connection | 



## getClusterTopoes

> List&lt;ClusterTopo&gt; getClusterTopoes(contentLanguage, getClusterTopoesRequestBody)



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
        String contentLanguage = "zh-CN"; // String | 
        GetClusterTopoesRequestBody getClusterTopoesRequestBody = new GetClusterTopoesRequestBody(); // GetClusterTopoesRequestBody | 
        try {
            List<ClusterTopo> result = apiInstance.getClusterTopoes(contentLanguage, getClusterTopoesRequestBody);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getClusterTopoesRequestBody** | [**GetClusterTopoesRequestBody**](GetClusterTopoesRequestBody.md)|  |

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
| **200** | Ok |  -  |
| **400** |  |  -  |


## getClusterTopoesConnection

> ClusterTopoConnection getClusterTopoesConnection(contentLanguage, getClusterTopoesConnectionRequestBody)



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
        String contentLanguage = "zh-CN"; // String | 
        GetClusterTopoesConnectionRequestBody getClusterTopoesConnectionRequestBody = new GetClusterTopoesConnectionRequestBody(); // GetClusterTopoesConnectionRequestBody | 
        try {
            ClusterTopoConnection result = apiInstance.getClusterTopoesConnection(contentLanguage, getClusterTopoesConnectionRequestBody);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getClusterTopoesConnectionRequestBody** | [**GetClusterTopoesConnectionRequestBody**](GetClusterTopoesConnectionRequestBody.md)|  |

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
| **200** | Ok |  -  |
| **400** |  |  -  |

