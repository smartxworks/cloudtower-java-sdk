# SnapshotPlanTaskApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSnapshotPlanTasks**](SnapshotPlanTaskApi.md#getSnapshotPlanTasks) | **POST** get-snapshot-plan-tasks | 
[**getSnapshotPlanTasksConnection**](SnapshotPlanTaskApi.md#getSnapshotPlanTasksConnection) | **POST** get-snapshot-plan-tasks-connection | 



## getSnapshotPlanTasks

> List&lt;SnapshotPlanTask&gt; getSnapshotPlanTasks(contentLanguage, getSnapshotPlanTasksRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnapshotPlanTaskApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnapshotPlanTaskApi apiInstance = new SnapshotPlanTaskApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetSnapshotPlanTasksRequestBody getSnapshotPlanTasksRequestBody = new GetSnapshotPlanTasksRequestBody(); // GetSnapshotPlanTasksRequestBody | 
        try {
            List<SnapshotPlanTask> result = apiInstance.getSnapshotPlanTasks(contentLanguage, getSnapshotPlanTasksRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotPlanTaskApi#getSnapshotPlanTasks");
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
 **getSnapshotPlanTasksRequestBody** | [**GetSnapshotPlanTasksRequestBody**](GetSnapshotPlanTasksRequestBody.md)|  |

### Return type

[**List&lt;SnapshotPlanTask&gt;**](SnapshotPlanTask.md)

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


## getSnapshotPlanTasksConnection

> SnapshotPlanTaskConnection getSnapshotPlanTasksConnection(contentLanguage, getSnapshotPlanTasksConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnapshotPlanTaskApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnapshotPlanTaskApi apiInstance = new SnapshotPlanTaskApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetSnapshotPlanTasksConnectionRequestBody getSnapshotPlanTasksConnectionRequestBody = new GetSnapshotPlanTasksConnectionRequestBody(); // GetSnapshotPlanTasksConnectionRequestBody | 
        try {
            SnapshotPlanTaskConnection result = apiInstance.getSnapshotPlanTasksConnection(contentLanguage, getSnapshotPlanTasksConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotPlanTaskApi#getSnapshotPlanTasksConnection");
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
 **getSnapshotPlanTasksConnectionRequestBody** | [**GetSnapshotPlanTasksConnectionRequestBody**](GetSnapshotPlanTasksConnectionRequestBody.md)|  |

### Return type

[**SnapshotPlanTaskConnection**](SnapshotPlanTaskConnection.md)

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

