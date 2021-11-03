# EverouteClusterApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEverouteClusters**](EverouteClusterApi.md#getEverouteClusters) | **POST** get-everoute-clusters | 
[**getEverouteClustersConnection**](EverouteClusterApi.md#getEverouteClustersConnection) | **POST** get-everoute-clusters-connection | 



## getEverouteClusters

> List&lt;EverouteCluster&gt; getEverouteClusters(getEverouteClustersRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.EverouteClusterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        EverouteClusterApi apiInstance = new EverouteClusterApi(defaultClient);
        GetEverouteClustersRequestBody getEverouteClustersRequestBody = new GetEverouteClustersRequestBody(); // GetEverouteClustersRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<EverouteCluster> result = apiInstance.getEverouteClusters(getEverouteClustersRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EverouteClusterApi#getEverouteClusters");
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
 **getEverouteClustersRequestBody** | [**GetEverouteClustersRequestBody**](GetEverouteClustersRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;EverouteCluster&gt;**](EverouteCluster.md)

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


## getEverouteClustersConnection

> EverouteClusterConnection getEverouteClustersConnection(getEverouteClustersConnectionRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.EverouteClusterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        EverouteClusterApi apiInstance = new EverouteClusterApi(defaultClient);
        GetEverouteClustersConnectionRequestBody getEverouteClustersConnectionRequestBody = new GetEverouteClustersConnectionRequestBody(); // GetEverouteClustersConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            EverouteClusterConnection result = apiInstance.getEverouteClustersConnection(getEverouteClustersConnectionRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EverouteClusterApi#getEverouteClustersConnection");
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
 **getEverouteClustersConnectionRequestBody** | [**GetEverouteClustersConnectionRequestBody**](GetEverouteClustersConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**EverouteClusterConnection**](EverouteClusterConnection.md)

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

