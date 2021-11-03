# GlobalAlertRuleApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGlobalAlertRules**](GlobalAlertRuleApi.md#getGlobalAlertRules) | **POST** get-global-alert-rules | 
[**getGlobalAlertRulesConnection**](GlobalAlertRuleApi.md#getGlobalAlertRulesConnection) | **POST** get-global-alert-rules-connection | 
[**updateCustomizeAlertRule**](GlobalAlertRuleApi.md#updateCustomizeAlertRule) | **POST** update-customize-alert-rule | 
[**updateGlobalAlertRule**](GlobalAlertRuleApi.md#updateGlobalAlertRule) | **POST** update-global-alert-rule | 



## getGlobalAlertRules

> List&lt;GlobalAlertRule&gt; getGlobalAlertRules(getGlobalAlertRulesRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.GlobalAlertRuleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        GlobalAlertRuleApi apiInstance = new GlobalAlertRuleApi(defaultClient);
        GetGlobalAlertRulesRequestBody getGlobalAlertRulesRequestBody = new GetGlobalAlertRulesRequestBody(); // GetGlobalAlertRulesRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<GlobalAlertRule> result = apiInstance.getGlobalAlertRules(getGlobalAlertRulesRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalAlertRuleApi#getGlobalAlertRules");
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
 **getGlobalAlertRulesRequestBody** | [**GetGlobalAlertRulesRequestBody**](GetGlobalAlertRulesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;GlobalAlertRule&gt;**](GlobalAlertRule.md)

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


## getGlobalAlertRulesConnection

> GlobalAlertRuleConnection getGlobalAlertRulesConnection(getGlobalAlertRulesConnectionRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.GlobalAlertRuleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        GlobalAlertRuleApi apiInstance = new GlobalAlertRuleApi(defaultClient);
        GetGlobalAlertRulesConnectionRequestBody getGlobalAlertRulesConnectionRequestBody = new GetGlobalAlertRulesConnectionRequestBody(); // GetGlobalAlertRulesConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            GlobalAlertRuleConnection result = apiInstance.getGlobalAlertRulesConnection(getGlobalAlertRulesConnectionRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalAlertRuleApi#getGlobalAlertRulesConnection");
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
 **getGlobalAlertRulesConnectionRequestBody** | [**GetGlobalAlertRulesConnectionRequestBody**](GetGlobalAlertRulesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**GlobalAlertRuleConnection**](GlobalAlertRuleConnection.md)

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


## updateCustomizeAlertRule

> List&lt;WithTaskGlobalAlertRule&gt; updateCustomizeAlertRule(customizeAlertRuleUpdationParams, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.GlobalAlertRuleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        GlobalAlertRuleApi apiInstance = new GlobalAlertRuleApi(defaultClient);
        CustomizeAlertRuleUpdationParams customizeAlertRuleUpdationParams = new CustomizeAlertRuleUpdationParams(); // CustomizeAlertRuleUpdationParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskGlobalAlertRule> result = apiInstance.updateCustomizeAlertRule(customizeAlertRuleUpdationParams, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalAlertRuleApi#updateCustomizeAlertRule");
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
 **customizeAlertRuleUpdationParams** | [**CustomizeAlertRuleUpdationParams**](CustomizeAlertRuleUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskGlobalAlertRule&gt;**](WithTaskGlobalAlertRule.md)

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


## updateGlobalAlertRule

> List&lt;WithTaskGlobalAlertRule&gt; updateGlobalAlertRule(globalAlertRuleUpdationParams, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.GlobalAlertRuleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        GlobalAlertRuleApi apiInstance = new GlobalAlertRuleApi(defaultClient);
        GlobalAlertRuleUpdationParams globalAlertRuleUpdationParams = new GlobalAlertRuleUpdationParams(); // GlobalAlertRuleUpdationParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskGlobalAlertRule> result = apiInstance.updateGlobalAlertRule(globalAlertRuleUpdationParams, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalAlertRuleApi#updateGlobalAlertRule");
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
 **globalAlertRuleUpdationParams** | [**GlobalAlertRuleUpdationParams**](GlobalAlertRuleUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskGlobalAlertRule&gt;**](WithTaskGlobalAlertRule.md)

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

