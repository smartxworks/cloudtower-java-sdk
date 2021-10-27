# UserAuditLogApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserAuditLogs**](UserAuditLogApi.md#getUserAuditLogs) | **POST** get-user-audit-logs | 
[**getUserAuditLogsConnection**](UserAuditLogApi.md#getUserAuditLogsConnection) | **POST** get-user-audit-logs-connection | 



## getUserAuditLogs

> List&lt;UserAuditLog&gt; getUserAuditLogs(contentLanguage, getUserAuditLogsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UserAuditLogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        UserAuditLogApi apiInstance = new UserAuditLogApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetUserAuditLogsRequestBody getUserAuditLogsRequestBody = new GetUserAuditLogsRequestBody(); // GetUserAuditLogsRequestBody | 
        try {
            List<UserAuditLog> result = apiInstance.getUserAuditLogs(contentLanguage, getUserAuditLogsRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserAuditLogApi#getUserAuditLogs");
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
 **getUserAuditLogsRequestBody** | [**GetUserAuditLogsRequestBody**](GetUserAuditLogsRequestBody.md)|  |

### Return type

[**List&lt;UserAuditLog&gt;**](UserAuditLog.md)

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


## getUserAuditLogsConnection

> UserAuditLogConnection getUserAuditLogsConnection(contentLanguage, getUserAuditLogsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UserAuditLogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        UserAuditLogApi apiInstance = new UserAuditLogApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetUserAuditLogsConnectionRequestBody getUserAuditLogsConnectionRequestBody = new GetUserAuditLogsConnectionRequestBody(); // GetUserAuditLogsConnectionRequestBody | 
        try {
            UserAuditLogConnection result = apiInstance.getUserAuditLogsConnection(contentLanguage, getUserAuditLogsConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserAuditLogApi#getUserAuditLogsConnection");
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
 **getUserAuditLogsConnectionRequestBody** | [**GetUserAuditLogsConnectionRequestBody**](GetUserAuditLogsConnectionRequestBody.md)|  |

### Return type

[**UserAuditLogConnection**](UserAuditLogConnection.md)

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

