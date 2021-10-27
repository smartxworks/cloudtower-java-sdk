# UploadTaskApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUploadTasks**](UploadTaskApi.md#getUploadTasks) | **POST** /get-upload-tasks | 
[**getUploadTasksConnection**](UploadTaskApi.md#getUploadTasksConnection) | **POST** /get-upload-tasks-connection | 


<a name="getUploadTasks"></a>
# **getUploadTasks**
> List&lt;UploadTask&gt; getUploadTasks(contentLanguage, getUploadTasksRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UploadTaskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    UploadTaskApi apiInstance = new UploadTaskApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetUploadTasksRequestBody getUploadTasksRequestBody = new GetUploadTasksRequestBody(); // GetUploadTasksRequestBody | 
    try {
      List<UploadTask> result = apiInstance.getUploadTasks(contentLanguage, getUploadTasksRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadTaskApi#getUploadTasks");
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
 **getUploadTasksRequestBody** | [**GetUploadTasksRequestBody**](GetUploadTasksRequestBody.md)|  |

### Return type

[**List&lt;UploadTask&gt;**](UploadTask.md)

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

<a name="getUploadTasksConnection"></a>
# **getUploadTasksConnection**
> UploadTaskConnection getUploadTasksConnection(contentLanguage, getUploadTasksConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UploadTaskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    UploadTaskApi apiInstance = new UploadTaskApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetUploadTasksConnectionRequestBody getUploadTasksConnectionRequestBody = new GetUploadTasksConnectionRequestBody(); // GetUploadTasksConnectionRequestBody | 
    try {
      UploadTaskConnection result = apiInstance.getUploadTasksConnection(contentLanguage, getUploadTasksConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadTaskApi#getUploadTasksConnection");
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
 **getUploadTasksConnectionRequestBody** | [**GetUploadTasksConnectionRequestBody**](GetUploadTasksConnectionRequestBody.md)|  |

### Return type

[**UploadTaskConnection**](UploadTaskConnection.md)

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

