# AlertNotifierApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAlertNotifiers**](AlertNotifierApi.md#getAlertNotifiers) | **POST** /get-alert-notifiers | 
[**getAlertNotifiersConnection**](AlertNotifierApi.md#getAlertNotifiersConnection) | **POST** /get-alert-notifiers-connection | 


<a name="getAlertNotifiers"></a>
# **getAlertNotifiers**
> List&lt;AlertNotifier&gt; getAlertNotifiers(getAlertNotifiersRequestBody, contentLanguage)



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
    GetAlertNotifiersRequestBody getAlertNotifiersRequestBody = new GetAlertNotifiersRequestBody(); // GetAlertNotifiersRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<AlertNotifier> result = apiInstance.getAlertNotifiers(getAlertNotifiersRequestBody, contentLanguage);
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
 **getAlertNotifiersRequestBody** | [**GetAlertNotifiersRequestBody**](GetAlertNotifiersRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
**200** | Ok |  -  |
**400** |  |  -  |

<a name="getAlertNotifiersConnection"></a>
# **getAlertNotifiersConnection**
> AlertNotifierConnection getAlertNotifiersConnection(getAlertNotifiersConnectionRequestBody, contentLanguage)



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
    GetAlertNotifiersConnectionRequestBody getAlertNotifiersConnectionRequestBody = new GetAlertNotifiersConnectionRequestBody(); // GetAlertNotifiersConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      AlertNotifierConnection result = apiInstance.getAlertNotifiersConnection(getAlertNotifiersConnectionRequestBody, contentLanguage);
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
 **getAlertNotifiersConnectionRequestBody** | [**GetAlertNotifiersConnectionRequestBody**](GetAlertNotifiersConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
**200** | Ok |  -  |
**400** |  |  -  |

