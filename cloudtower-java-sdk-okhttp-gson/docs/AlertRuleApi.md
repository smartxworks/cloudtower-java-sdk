# AlertRuleApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAlertRules**](AlertRuleApi.md#getAlertRules) | **POST** /get-alert-rules | 
[**getAlertRulesConnection**](AlertRuleApi.md#getAlertRulesConnection) | **POST** /get-alert-rules-connection | 


<a name="getAlertRules"></a>
# **getAlertRules**
> List&lt;AlertRule&gt; getAlertRules(contentLanguage, getAlertRulesRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.AlertRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    AlertRuleApi apiInstance = new AlertRuleApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetAlertRulesRequestBody getAlertRulesRequestBody = new GetAlertRulesRequestBody(); // GetAlertRulesRequestBody | 
    try {
      List<AlertRule> result = apiInstance.getAlertRules(contentLanguage, getAlertRulesRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertRuleApi#getAlertRules");
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
 **getAlertRulesRequestBody** | [**GetAlertRulesRequestBody**](GetAlertRulesRequestBody.md)|  |

### Return type

[**List&lt;AlertRule&gt;**](AlertRule.md)

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

<a name="getAlertRulesConnection"></a>
# **getAlertRulesConnection**
> AlertRuleConnection getAlertRulesConnection(contentLanguage, getAlertRulesConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.AlertRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    AlertRuleApi apiInstance = new AlertRuleApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetAlertRulesConnectionRequestBody getAlertRulesConnectionRequestBody = new GetAlertRulesConnectionRequestBody(); // GetAlertRulesConnectionRequestBody | 
    try {
      AlertRuleConnection result = apiInstance.getAlertRulesConnection(contentLanguage, getAlertRulesConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertRuleApi#getAlertRulesConnection");
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
 **getAlertRulesConnectionRequestBody** | [**GetAlertRulesConnectionRequestBody**](GetAlertRulesConnectionRequestBody.md)|  |

### Return type

[**AlertRuleConnection**](AlertRuleConnection.md)

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

