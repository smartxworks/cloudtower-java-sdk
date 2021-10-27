# AlertNotifierApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAlertNotifiers**](AlertNotifierApi.md#getAlertNotifiers) | **POST** get-alert-notifiers | 
[**getAlertNotifiersConnection**](AlertNotifierApi.md#getAlertNotifiersConnection) | **POST** get-alert-notifiers-connection | 



## getAlertNotifiers

> List&lt;AlertNotifier&gt; getAlertNotifiers(contentLanguage, getAlertNotifiersRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.AlertNotifierApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        AlertNotifierApi apiInstance = new AlertNotifierApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetAlertNotifiersRequestBody getAlertNotifiersRequestBody = new GetAlertNotifiersRequestBody(); // GetAlertNotifiersRequestBody | 
        try {
            List<AlertNotifier> result = apiInstance.getAlertNotifiers(contentLanguage, getAlertNotifiersRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertNotifierApi#getAlertNotifiers");
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
 **getAlertNotifiersRequestBody** | [**GetAlertNotifiersRequestBody**](GetAlertNotifiersRequestBody.md)|  |

### Return type

[**List&lt;AlertNotifier&gt;**](AlertNotifier.md)

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


## getAlertNotifiersConnection

> AlertNotifierConnection getAlertNotifiersConnection(contentLanguage, getAlertNotifiersConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.AlertNotifierApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        AlertNotifierApi apiInstance = new AlertNotifierApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetAlertNotifiersConnectionRequestBody getAlertNotifiersConnectionRequestBody = new GetAlertNotifiersConnectionRequestBody(); // GetAlertNotifiersConnectionRequestBody | 
        try {
            AlertNotifierConnection result = apiInstance.getAlertNotifiersConnection(contentLanguage, getAlertNotifiersConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertNotifierApi#getAlertNotifiersConnection");
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
 **getAlertNotifiersConnectionRequestBody** | [**GetAlertNotifiersConnectionRequestBody**](GetAlertNotifiersConnectionRequestBody.md)|  |

### Return type

[**AlertNotifierConnection**](AlertNotifierConnection.md)

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

