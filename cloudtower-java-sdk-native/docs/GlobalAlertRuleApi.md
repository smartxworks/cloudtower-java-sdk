# GlobalAlertRuleApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGlobalAlertRules**](GlobalAlertRuleApi.md#getGlobalAlertRules) | **POST** /get-global-alert-rules | 
[**getGlobalAlertRulesWithHttpInfo**](GlobalAlertRuleApi.md#getGlobalAlertRulesWithHttpInfo) | **POST** /get-global-alert-rules | 
[**getGlobalAlertRulesConnection**](GlobalAlertRuleApi.md#getGlobalAlertRulesConnection) | **POST** /get-global-alert-rules-connection | 
[**getGlobalAlertRulesConnectionWithHttpInfo**](GlobalAlertRuleApi.md#getGlobalAlertRulesConnectionWithHttpInfo) | **POST** /get-global-alert-rules-connection | 
[**updateCustomizeAlertRule**](GlobalAlertRuleApi.md#updateCustomizeAlertRule) | **POST** /update-customize-alert-rule | 
[**updateCustomizeAlertRuleWithHttpInfo**](GlobalAlertRuleApi.md#updateCustomizeAlertRuleWithHttpInfo) | **POST** /update-customize-alert-rule | 
[**updateGlobalAlertRule**](GlobalAlertRuleApi.md#updateGlobalAlertRule) | **POST** /update-global-alert-rule | 
[**updateGlobalAlertRuleWithHttpInfo**](GlobalAlertRuleApi.md#updateGlobalAlertRuleWithHttpInfo) | **POST** /update-global-alert-rule | 



## getGlobalAlertRules

> List<GlobalAlertRule> getGlobalAlertRules(contentLanguage, getGlobalAlertRulesRequestBody)



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
        String contentLanguage = "zh-CN"; // String | 
        GetGlobalAlertRulesRequestBody getGlobalAlertRulesRequestBody = new GetGlobalAlertRulesRequestBody(); // GetGlobalAlertRulesRequestBody | 
        try {
            List<GlobalAlertRule> result = apiInstance.getGlobalAlertRules(contentLanguage, getGlobalAlertRulesRequestBody);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getGlobalAlertRulesRequestBody** | [**GetGlobalAlertRulesRequestBody**](GetGlobalAlertRulesRequestBody.md)|  |

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

## getGlobalAlertRulesWithHttpInfo

> ApiResponse<List<GlobalAlertRule>> getGlobalAlertRules getGlobalAlertRulesWithHttpInfo(contentLanguage, getGlobalAlertRulesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
        String contentLanguage = "zh-CN"; // String | 
        GetGlobalAlertRulesRequestBody getGlobalAlertRulesRequestBody = new GetGlobalAlertRulesRequestBody(); // GetGlobalAlertRulesRequestBody | 
        try {
            ApiResponse<List<GlobalAlertRule>> response = apiInstance.getGlobalAlertRulesWithHttpInfo(contentLanguage, getGlobalAlertRulesRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalAlertRuleApi#getGlobalAlertRules");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getGlobalAlertRulesRequestBody** | [**GetGlobalAlertRulesRequestBody**](GetGlobalAlertRulesRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;GlobalAlertRule&gt;**](GlobalAlertRule.md)>


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

> GlobalAlertRuleConnection getGlobalAlertRulesConnection(contentLanguage, getGlobalAlertRulesConnectionRequestBody)



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
        String contentLanguage = "zh-CN"; // String | 
        GetGlobalAlertRulesConnectionRequestBody getGlobalAlertRulesConnectionRequestBody = new GetGlobalAlertRulesConnectionRequestBody(); // GetGlobalAlertRulesConnectionRequestBody | 
        try {
            GlobalAlertRuleConnection result = apiInstance.getGlobalAlertRulesConnection(contentLanguage, getGlobalAlertRulesConnectionRequestBody);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getGlobalAlertRulesConnectionRequestBody** | [**GetGlobalAlertRulesConnectionRequestBody**](GetGlobalAlertRulesConnectionRequestBody.md)|  |

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

## getGlobalAlertRulesConnectionWithHttpInfo

> ApiResponse<GlobalAlertRuleConnection> getGlobalAlertRulesConnection getGlobalAlertRulesConnectionWithHttpInfo(contentLanguage, getGlobalAlertRulesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
        String contentLanguage = "zh-CN"; // String | 
        GetGlobalAlertRulesConnectionRequestBody getGlobalAlertRulesConnectionRequestBody = new GetGlobalAlertRulesConnectionRequestBody(); // GetGlobalAlertRulesConnectionRequestBody | 
        try {
            ApiResponse<GlobalAlertRuleConnection> response = apiInstance.getGlobalAlertRulesConnectionWithHttpInfo(contentLanguage, getGlobalAlertRulesConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalAlertRuleApi#getGlobalAlertRulesConnection");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getGlobalAlertRulesConnectionRequestBody** | [**GetGlobalAlertRulesConnectionRequestBody**](GetGlobalAlertRulesConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**GlobalAlertRuleConnection**](GlobalAlertRuleConnection.md)>


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

> List<WithTaskGlobalAlertRule> updateCustomizeAlertRule(contentLanguage, customizeAlertRuleUpdationParams)



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
        String contentLanguage = "zh-CN"; // String | 
        CustomizeAlertRuleUpdationParams customizeAlertRuleUpdationParams = new CustomizeAlertRuleUpdationParams(); // CustomizeAlertRuleUpdationParams | 
        try {
            List<WithTaskGlobalAlertRule> result = apiInstance.updateCustomizeAlertRule(contentLanguage, customizeAlertRuleUpdationParams);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **customizeAlertRuleUpdationParams** | [**CustomizeAlertRuleUpdationParams**](CustomizeAlertRuleUpdationParams.md)|  |

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

## updateCustomizeAlertRuleWithHttpInfo

> ApiResponse<List<WithTaskGlobalAlertRule>> updateCustomizeAlertRule updateCustomizeAlertRuleWithHttpInfo(contentLanguage, customizeAlertRuleUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
        String contentLanguage = "zh-CN"; // String | 
        CustomizeAlertRuleUpdationParams customizeAlertRuleUpdationParams = new CustomizeAlertRuleUpdationParams(); // CustomizeAlertRuleUpdationParams | 
        try {
            ApiResponse<List<WithTaskGlobalAlertRule>> response = apiInstance.updateCustomizeAlertRuleWithHttpInfo(contentLanguage, customizeAlertRuleUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalAlertRuleApi#updateCustomizeAlertRule");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **customizeAlertRuleUpdationParams** | [**CustomizeAlertRuleUpdationParams**](CustomizeAlertRuleUpdationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskGlobalAlertRule&gt;**](WithTaskGlobalAlertRule.md)>


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

> List<WithTaskGlobalAlertRule> updateGlobalAlertRule(contentLanguage, globalAlertRuleUpdationParams)



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
        String contentLanguage = "zh-CN"; // String | 
        GlobalAlertRuleUpdationParams globalAlertRuleUpdationParams = new GlobalAlertRuleUpdationParams(); // GlobalAlertRuleUpdationParams | 
        try {
            List<WithTaskGlobalAlertRule> result = apiInstance.updateGlobalAlertRule(contentLanguage, globalAlertRuleUpdationParams);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **globalAlertRuleUpdationParams** | [**GlobalAlertRuleUpdationParams**](GlobalAlertRuleUpdationParams.md)|  |

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

## updateGlobalAlertRuleWithHttpInfo

> ApiResponse<List<WithTaskGlobalAlertRule>> updateGlobalAlertRule updateGlobalAlertRuleWithHttpInfo(contentLanguage, globalAlertRuleUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
        String contentLanguage = "zh-CN"; // String | 
        GlobalAlertRuleUpdationParams globalAlertRuleUpdationParams = new GlobalAlertRuleUpdationParams(); // GlobalAlertRuleUpdationParams | 
        try {
            ApiResponse<List<WithTaskGlobalAlertRule>> response = apiInstance.updateGlobalAlertRuleWithHttpInfo(contentLanguage, globalAlertRuleUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalAlertRuleApi#updateGlobalAlertRule");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **globalAlertRuleUpdationParams** | [**GlobalAlertRuleUpdationParams**](GlobalAlertRuleUpdationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskGlobalAlertRule&gt;**](WithTaskGlobalAlertRule.md)>


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

