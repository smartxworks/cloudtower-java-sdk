# AlertApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAlerts**](AlertApi.md#getAlerts) | **POST** /get-alerts | 
[**getAlertsConnection**](AlertApi.md#getAlertsConnection) | **POST** /get-alerts-connection | 
[**resolveAlert**](AlertApi.md#resolveAlert) | **POST** /resolve-alert | 


<a name="getAlerts"></a>
# **getAlerts**
> List&lt;Alert&gt; getAlerts(contentLanguage, getAlertsRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.AlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    AlertApi apiInstance = new AlertApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetAlertsRequestBody getAlertsRequestBody = new GetAlertsRequestBody(); // GetAlertsRequestBody | 
    try {
      List<Alert> result = apiInstance.getAlerts(contentLanguage, getAlertsRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertApi#getAlerts");
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
 **getAlertsRequestBody** | [**GetAlertsRequestBody**](GetAlertsRequestBody.md)|  |

### Return type

[**List&lt;Alert&gt;**](Alert.md)

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

<a name="getAlertsConnection"></a>
# **getAlertsConnection**
> AlertConnection getAlertsConnection(contentLanguage, getAlertsConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.AlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    AlertApi apiInstance = new AlertApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetAlertsConnectionRequestBody getAlertsConnectionRequestBody = new GetAlertsConnectionRequestBody(); // GetAlertsConnectionRequestBody | 
    try {
      AlertConnection result = apiInstance.getAlertsConnection(contentLanguage, getAlertsConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertApi#getAlertsConnection");
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
 **getAlertsConnectionRequestBody** | [**GetAlertsConnectionRequestBody**](GetAlertsConnectionRequestBody.md)|  |

### Return type

[**AlertConnection**](AlertConnection.md)

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

<a name="resolveAlert"></a>
# **resolveAlert**
> List&lt;WithTaskAlert&gt; resolveAlert(contentLanguage, resolveAlertParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.AlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    AlertApi apiInstance = new AlertApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    ResolveAlertParams resolveAlertParams = new ResolveAlertParams(); // ResolveAlertParams | 
    try {
      List<WithTaskAlert> result = apiInstance.resolveAlert(contentLanguage, resolveAlertParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertApi#resolveAlert");
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
 **resolveAlertParams** | [**ResolveAlertParams**](ResolveAlertParams.md)|  |

### Return type

[**List&lt;WithTaskAlert&gt;**](WithTaskAlert.md)

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

