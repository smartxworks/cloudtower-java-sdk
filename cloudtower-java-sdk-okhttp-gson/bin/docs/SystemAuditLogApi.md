# SystemAuditLogApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSystemAuditLogs**](SystemAuditLogApi.md#getSystemAuditLogs) | **POST** /get-system-audit-logs | 
[**getSystemAuditLogsConnection**](SystemAuditLogApi.md#getSystemAuditLogsConnection) | **POST** /get-system-audit-logs-connection | 


<a name="getSystemAuditLogs"></a>
# **getSystemAuditLogs**
> List&lt;SystemAuditLog&gt; getSystemAuditLogs(getSystemAuditLogsRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SystemAuditLogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SystemAuditLogApi apiInstance = new SystemAuditLogApi(defaultClient);
    GetSystemAuditLogsRequestBody getSystemAuditLogsRequestBody = new GetSystemAuditLogsRequestBody(); // GetSystemAuditLogsRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<SystemAuditLog> result = apiInstance.getSystemAuditLogs(getSystemAuditLogsRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemAuditLogApi#getSystemAuditLogs");
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
 **getSystemAuditLogsRequestBody** | [**GetSystemAuditLogsRequestBody**](GetSystemAuditLogsRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;SystemAuditLog&gt;**](SystemAuditLog.md)

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

<a name="getSystemAuditLogsConnection"></a>
# **getSystemAuditLogsConnection**
> SystemAuditLogConnection getSystemAuditLogsConnection(getSystemAuditLogsConnectionRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SystemAuditLogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SystemAuditLogApi apiInstance = new SystemAuditLogApi(defaultClient);
    GetSystemAuditLogsConnectionRequestBody getSystemAuditLogsConnectionRequestBody = new GetSystemAuditLogsConnectionRequestBody(); // GetSystemAuditLogsConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      SystemAuditLogConnection result = apiInstance.getSystemAuditLogsConnection(getSystemAuditLogsConnectionRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemAuditLogApi#getSystemAuditLogsConnection");
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
 **getSystemAuditLogsConnectionRequestBody** | [**GetSystemAuditLogsConnectionRequestBody**](GetSystemAuditLogsConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**SystemAuditLogConnection**](SystemAuditLogConnection.md)

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

