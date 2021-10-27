# TaskApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTasks**](TaskApi.md#getTasks) | **POST** get-tasks | 
[**getTasksConnection**](TaskApi.md#getTasksConnection) | **POST** get-tasks-connection | 



## getTasks

> List&lt;Task&gt; getTasks(contentLanguage, getTasksRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.TaskApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        TaskApi apiInstance = new TaskApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetTasksRequestBody getTasksRequestBody = new GetTasksRequestBody(); // GetTasksRequestBody | 
        try {
            List<Task> result = apiInstance.getTasks(contentLanguage, getTasksRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaskApi#getTasks");
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
 **getTasksRequestBody** | [**GetTasksRequestBody**](GetTasksRequestBody.md)|  |

### Return type

[**List&lt;Task&gt;**](Task.md)

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


## getTasksConnection

> TaskConnection getTasksConnection(contentLanguage, getTasksConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.TaskApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        TaskApi apiInstance = new TaskApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetTasksConnectionRequestBody getTasksConnectionRequestBody = new GetTasksConnectionRequestBody(); // GetTasksConnectionRequestBody | 
        try {
            TaskConnection result = apiInstance.getTasksConnection(contentLanguage, getTasksConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaskApi#getTasksConnection");
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
 **getTasksConnectionRequestBody** | [**GetTasksConnectionRequestBody**](GetTasksConnectionRequestBody.md)|  |

### Return type

[**TaskConnection**](TaskConnection.md)

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

