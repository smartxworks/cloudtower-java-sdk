# ReportTaskApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReportTasks**](ReportTaskApi.md#getReportTasks) | **POST** get-report-tasks | 
[**getReportTasksConnection**](ReportTaskApi.md#getReportTasksConnection) | **POST** get-report-tasks-connection | 



## getReportTasks

> List&lt;ReportTask&gt; getReportTasks(contentLanguage, getReportTasksRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ReportTaskApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ReportTaskApi apiInstance = new ReportTaskApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetReportTasksRequestBody getReportTasksRequestBody = new GetReportTasksRequestBody(); // GetReportTasksRequestBody | 
        try {
            List<ReportTask> result = apiInstance.getReportTasks(contentLanguage, getReportTasksRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportTaskApi#getReportTasks");
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
 **getReportTasksRequestBody** | [**GetReportTasksRequestBody**](GetReportTasksRequestBody.md)|  |

### Return type

[**List&lt;ReportTask&gt;**](ReportTask.md)

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


## getReportTasksConnection

> ReportTaskConnection getReportTasksConnection(contentLanguage, getReportTasksConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ReportTaskApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ReportTaskApi apiInstance = new ReportTaskApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetReportTasksConnectionRequestBody getReportTasksConnectionRequestBody = new GetReportTasksConnectionRequestBody(); // GetReportTasksConnectionRequestBody | 
        try {
            ReportTaskConnection result = apiInstance.getReportTasksConnection(contentLanguage, getReportTasksConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportTaskApi#getReportTasksConnection");
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
 **getReportTasksConnectionRequestBody** | [**GetReportTasksConnectionRequestBody**](GetReportTasksConnectionRequestBody.md)|  |

### Return type

[**ReportTaskConnection**](ReportTaskConnection.md)

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

