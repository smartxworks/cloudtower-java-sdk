# ClusterUpgradeHistoryApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClusterUpgradeHistories**](ClusterUpgradeHistoryApi.md#getClusterUpgradeHistories) | **POST** get-cluster-upgrade-histories | 
[**getClusterUpgradeHistoriesConnection**](ClusterUpgradeHistoryApi.md#getClusterUpgradeHistoriesConnection) | **POST** get-cluster-upgrade-histories-connection | 



## getClusterUpgradeHistories

> List&lt;ClusterUpgradeHistory&gt; getClusterUpgradeHistories(getClusterUpgradeHistoriesRequestBody, contentLanguage)



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
        GetClusterUpgradeHistoriesRequestBody getClusterUpgradeHistoriesRequestBody = new GetClusterUpgradeHistoriesRequestBody(); // GetClusterUpgradeHistoriesRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<ClusterUpgradeHistory> result = apiInstance.getClusterUpgradeHistories(getClusterUpgradeHistoriesRequestBody, contentLanguage);
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
 **getClusterUpgradeHistoriesRequestBody** | [**GetClusterUpgradeHistoriesRequestBody**](GetClusterUpgradeHistoriesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

> ClusterUpgradeHistoryConnection getClusterUpgradeHistoriesConnection(getClusterUpgradeHistoriesConnectionRequestBody, contentLanguage)



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
        GetClusterUpgradeHistoriesConnectionRequestBody getClusterUpgradeHistoriesConnectionRequestBody = new GetClusterUpgradeHistoriesConnectionRequestBody(); // GetClusterUpgradeHistoriesConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            ClusterUpgradeHistoryConnection result = apiInstance.getClusterUpgradeHistoriesConnection(getClusterUpgradeHistoriesConnectionRequestBody, contentLanguage);
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
 **getClusterUpgradeHistoriesConnectionRequestBody** | [**GetClusterUpgradeHistoriesConnectionRequestBody**](GetClusterUpgradeHistoriesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

