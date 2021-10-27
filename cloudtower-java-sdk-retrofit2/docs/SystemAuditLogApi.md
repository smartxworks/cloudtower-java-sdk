# SystemAuditLogApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSystemAuditLogs**](SystemAuditLogApi.md#getSystemAuditLogs) | **POST** get-system-audit-logs | 
[**getSystemAuditLogsConnection**](SystemAuditLogApi.md#getSystemAuditLogsConnection) | **POST** get-system-audit-logs-connection | 



## getSystemAuditLogs

> List&lt;SystemAuditLog&gt; getSystemAuditLogs(contentLanguage, getSystemAuditLogsRequestBody)



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
        String contentLanguage = "zh-CN"; // String | 
        GetSystemAuditLogsRequestBody getSystemAuditLogsRequestBody = new GetSystemAuditLogsRequestBody(); // GetSystemAuditLogsRequestBody | 
        try {
            List<SystemAuditLog> result = apiInstance.getSystemAuditLogs(contentLanguage, getSystemAuditLogsRequestBody);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getSystemAuditLogsRequestBody** | [**GetSystemAuditLogsRequestBody**](GetSystemAuditLogsRequestBody.md)|  |

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
| **200** | Ok |  -  |
| **400** |  |  -  |


## getSystemAuditLogsConnection

> SystemAuditLogConnection getSystemAuditLogsConnection(contentLanguage, getSystemAuditLogsConnectionRequestBody)



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
        String contentLanguage = "zh-CN"; // String | 
        GetSystemAuditLogsConnectionRequestBody getSystemAuditLogsConnectionRequestBody = new GetSystemAuditLogsConnectionRequestBody(); // GetSystemAuditLogsConnectionRequestBody | 
        try {
            SystemAuditLogConnection result = apiInstance.getSystemAuditLogsConnection(contentLanguage, getSystemAuditLogsConnectionRequestBody);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getSystemAuditLogsConnectionRequestBody** | [**GetSystemAuditLogsConnectionRequestBody**](GetSystemAuditLogsConnectionRequestBody.md)|  |

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
| **200** | Ok |  -  |
| **400** |  |  -  |

