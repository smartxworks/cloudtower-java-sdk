# AlertApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAlerts**](AlertApi.md#getAlerts) | **POST** /get-alerts | 
[**getAlertsWithHttpInfo**](AlertApi.md#getAlertsWithHttpInfo) | **POST** /get-alerts | 
[**getAlertsConnection**](AlertApi.md#getAlertsConnection) | **POST** /get-alerts-connection | 
[**getAlertsConnectionWithHttpInfo**](AlertApi.md#getAlertsConnectionWithHttpInfo) | **POST** /get-alerts-connection | 
[**resolveAlert**](AlertApi.md#resolveAlert) | **POST** /resolve-alert | 
[**resolveAlertWithHttpInfo**](AlertApi.md#resolveAlertWithHttpInfo) | **POST** /resolve-alert | 



## getAlerts

> List<Alert> getAlerts(contentLanguage, getAlertsRequestBody)



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
| **200** | Ok |  -  |
| **400** |  |  -  |

## getAlertsWithHttpInfo

> ApiResponse<List<Alert>> getAlerts getAlertsWithHttpInfo(contentLanguage, getAlertsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<List<Alert>> response = apiInstance.getAlertsWithHttpInfo(contentLanguage, getAlertsRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertApi#getAlerts");
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
 **getAlertsRequestBody** | [**GetAlertsRequestBody**](GetAlertsRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;Alert&gt;**](Alert.md)>


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


## getAlertsConnection

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
| **200** | Ok |  -  |
| **400** |  |  -  |

## getAlertsConnectionWithHttpInfo

> ApiResponse<AlertConnection> getAlertsConnection getAlertsConnectionWithHttpInfo(contentLanguage, getAlertsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<AlertConnection> response = apiInstance.getAlertsConnectionWithHttpInfo(contentLanguage, getAlertsConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertApi#getAlertsConnection");
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
 **getAlertsConnectionRequestBody** | [**GetAlertsConnectionRequestBody**](GetAlertsConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**AlertConnection**](AlertConnection.md)>


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


## resolveAlert

> List<WithTaskAlert> resolveAlert(contentLanguage, resolveAlertParams)



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
| **200** | Ok |  -  |
| **400** |  |  -  |

## resolveAlertWithHttpInfo

> ApiResponse<List<WithTaskAlert>> resolveAlert resolveAlertWithHttpInfo(contentLanguage, resolveAlertParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<List<WithTaskAlert>> response = apiInstance.resolveAlertWithHttpInfo(contentLanguage, resolveAlertParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertApi#resolveAlert");
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
 **resolveAlertParams** | [**ResolveAlertParams**](ResolveAlertParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskAlert&gt;**](WithTaskAlert.md)>


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

