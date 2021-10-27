# ClusterUpgradeHistoryApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClusterUpgradeHistories**](ClusterUpgradeHistoryApi.md#getClusterUpgradeHistories) | **POST** get-cluster-upgrade-histories | 
[**getClusterUpgradeHistoriesConnection**](ClusterUpgradeHistoryApi.md#getClusterUpgradeHistoriesConnection) | **POST** get-cluster-upgrade-histories-connection | 



## getClusterUpgradeHistories

> List&lt;ClusterUpgradeHistory&gt; getClusterUpgradeHistories(contentLanguage, getClusterUpgradeHistoriesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ClusterUpgradeHistoryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ClusterUpgradeHistoryApi apiInstance = new ClusterUpgradeHistoryApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetClusterUpgradeHistoriesRequestBody getClusterUpgradeHistoriesRequestBody = new GetClusterUpgradeHistoriesRequestBody(); // GetClusterUpgradeHistoriesRequestBody | 
        try {
            List<ClusterUpgradeHistory> result = apiInstance.getClusterUpgradeHistories(contentLanguage, getClusterUpgradeHistoriesRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClusterUpgradeHistoryApi#getClusterUpgradeHistories");
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
 **getClusterUpgradeHistoriesRequestBody** | [**GetClusterUpgradeHistoriesRequestBody**](GetClusterUpgradeHistoriesRequestBody.md)|  |

### Return type

[**List&lt;ClusterUpgradeHistory&gt;**](ClusterUpgradeHistory.md)

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


## getClusterUpgradeHistoriesConnection

> ClusterUpgradeHistoryConnection getClusterUpgradeHistoriesConnection(contentLanguage, getClusterUpgradeHistoriesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ClusterUpgradeHistoryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ClusterUpgradeHistoryApi apiInstance = new ClusterUpgradeHistoryApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetClusterUpgradeHistoriesConnectionRequestBody getClusterUpgradeHistoriesConnectionRequestBody = new GetClusterUpgradeHistoriesConnectionRequestBody(); // GetClusterUpgradeHistoriesConnectionRequestBody | 
        try {
            ClusterUpgradeHistoryConnection result = apiInstance.getClusterUpgradeHistoriesConnection(contentLanguage, getClusterUpgradeHistoriesConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClusterUpgradeHistoryApi#getClusterUpgradeHistoriesConnection");
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
 **getClusterUpgradeHistoriesConnectionRequestBody** | [**GetClusterUpgradeHistoriesConnectionRequestBody**](GetClusterUpgradeHistoriesConnectionRequestBody.md)|  |

### Return type

[**ClusterUpgradeHistoryConnection**](ClusterUpgradeHistoryConnection.md)

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

