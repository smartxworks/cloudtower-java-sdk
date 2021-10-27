# SnmpTrapReceiverApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSnmpTrapReceiver**](SnmpTrapReceiverApi.md#createSnmpTrapReceiver) | **POST** /create-snmp-trap-receiver | 
[**createSnmpTrapReceiverWithHttpInfo**](SnmpTrapReceiverApi.md#createSnmpTrapReceiverWithHttpInfo) | **POST** /create-snmp-trap-receiver | 
[**deleteSnmpTrapReceiver**](SnmpTrapReceiverApi.md#deleteSnmpTrapReceiver) | **POST** /delete-snmp-trap-receiver | 
[**deleteSnmpTrapReceiverWithHttpInfo**](SnmpTrapReceiverApi.md#deleteSnmpTrapReceiverWithHttpInfo) | **POST** /delete-snmp-trap-receiver | 
[**getSnmpTrapReceivers**](SnmpTrapReceiverApi.md#getSnmpTrapReceivers) | **POST** /get-snmp-trap-receivers | 
[**getSnmpTrapReceiversWithHttpInfo**](SnmpTrapReceiverApi.md#getSnmpTrapReceiversWithHttpInfo) | **POST** /get-snmp-trap-receivers | 
[**getSnmpTrapReceiversConnection**](SnmpTrapReceiverApi.md#getSnmpTrapReceiversConnection) | **POST** /get-snmp-trap-receivers-connection | 
[**getSnmpTrapReceiversConnectionWithHttpInfo**](SnmpTrapReceiverApi.md#getSnmpTrapReceiversConnectionWithHttpInfo) | **POST** /get-snmp-trap-receivers-connection | 
[**updateSnmpTrapReceiver**](SnmpTrapReceiverApi.md#updateSnmpTrapReceiver) | **POST** /update-snmp-trap-receiver | 
[**updateSnmpTrapReceiverWithHttpInfo**](SnmpTrapReceiverApi.md#updateSnmpTrapReceiverWithHttpInfo) | **POST** /update-snmp-trap-receiver | 



## createSnmpTrapReceiver

> List<WithTaskSnmpTrapReceiver> createSnmpTrapReceiver(contentLanguage, snmpTrapReceiverCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTrapReceiverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnmpTrapReceiverApi apiInstance = new SnmpTrapReceiverApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<SnmpTrapReceiverCreationParams> snmpTrapReceiverCreationParams = Arrays.asList(); // List<SnmpTrapReceiverCreationParams> | 
        try {
            List<WithTaskSnmpTrapReceiver> result = apiInstance.createSnmpTrapReceiver(contentLanguage, snmpTrapReceiverCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnmpTrapReceiverApi#createSnmpTrapReceiver");
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
 **snmpTrapReceiverCreationParams** | [**List&lt;SnmpTrapReceiverCreationParams&gt;**](SnmpTrapReceiverCreationParams.md)|  |

### Return type

[**List&lt;WithTaskSnmpTrapReceiver&gt;**](WithTaskSnmpTrapReceiver.md)


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

## createSnmpTrapReceiverWithHttpInfo

> ApiResponse<List<WithTaskSnmpTrapReceiver>> createSnmpTrapReceiver createSnmpTrapReceiverWithHttpInfo(contentLanguage, snmpTrapReceiverCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTrapReceiverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnmpTrapReceiverApi apiInstance = new SnmpTrapReceiverApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<SnmpTrapReceiverCreationParams> snmpTrapReceiverCreationParams = Arrays.asList(); // List<SnmpTrapReceiverCreationParams> | 
        try {
            ApiResponse<List<WithTaskSnmpTrapReceiver>> response = apiInstance.createSnmpTrapReceiverWithHttpInfo(contentLanguage, snmpTrapReceiverCreationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnmpTrapReceiverApi#createSnmpTrapReceiver");
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
 **snmpTrapReceiverCreationParams** | [**List&lt;SnmpTrapReceiverCreationParams&gt;**](SnmpTrapReceiverCreationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskSnmpTrapReceiver&gt;**](WithTaskSnmpTrapReceiver.md)>


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


## deleteSnmpTrapReceiver

> List<WithTaskDeleteSnmpTrapReceiver> deleteSnmpTrapReceiver(contentLanguage, snmpTrapReceiverDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTrapReceiverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnmpTrapReceiverApi apiInstance = new SnmpTrapReceiverApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        SnmpTrapReceiverDeletionParams snmpTrapReceiverDeletionParams = new SnmpTrapReceiverDeletionParams(); // SnmpTrapReceiverDeletionParams | 
        try {
            List<WithTaskDeleteSnmpTrapReceiver> result = apiInstance.deleteSnmpTrapReceiver(contentLanguage, snmpTrapReceiverDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnmpTrapReceiverApi#deleteSnmpTrapReceiver");
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
 **snmpTrapReceiverDeletionParams** | [**SnmpTrapReceiverDeletionParams**](SnmpTrapReceiverDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteSnmpTrapReceiver&gt;**](WithTaskDeleteSnmpTrapReceiver.md)


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

## deleteSnmpTrapReceiverWithHttpInfo

> ApiResponse<List<WithTaskDeleteSnmpTrapReceiver>> deleteSnmpTrapReceiver deleteSnmpTrapReceiverWithHttpInfo(contentLanguage, snmpTrapReceiverDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTrapReceiverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnmpTrapReceiverApi apiInstance = new SnmpTrapReceiverApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        SnmpTrapReceiverDeletionParams snmpTrapReceiverDeletionParams = new SnmpTrapReceiverDeletionParams(); // SnmpTrapReceiverDeletionParams | 
        try {
            ApiResponse<List<WithTaskDeleteSnmpTrapReceiver>> response = apiInstance.deleteSnmpTrapReceiverWithHttpInfo(contentLanguage, snmpTrapReceiverDeletionParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnmpTrapReceiverApi#deleteSnmpTrapReceiver");
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
 **snmpTrapReceiverDeletionParams** | [**SnmpTrapReceiverDeletionParams**](SnmpTrapReceiverDeletionParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDeleteSnmpTrapReceiver&gt;**](WithTaskDeleteSnmpTrapReceiver.md)>


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


## getSnmpTrapReceivers

> List<SnmpTrapReceiver> getSnmpTrapReceivers(contentLanguage, getSnmpTrapReceiversRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTrapReceiverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnmpTrapReceiverApi apiInstance = new SnmpTrapReceiverApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetSnmpTrapReceiversRequestBody getSnmpTrapReceiversRequestBody = new GetSnmpTrapReceiversRequestBody(); // GetSnmpTrapReceiversRequestBody | 
        try {
            List<SnmpTrapReceiver> result = apiInstance.getSnmpTrapReceivers(contentLanguage, getSnmpTrapReceiversRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnmpTrapReceiverApi#getSnmpTrapReceivers");
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
 **getSnmpTrapReceiversRequestBody** | [**GetSnmpTrapReceiversRequestBody**](GetSnmpTrapReceiversRequestBody.md)|  |

### Return type

[**List&lt;SnmpTrapReceiver&gt;**](SnmpTrapReceiver.md)


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

## getSnmpTrapReceiversWithHttpInfo

> ApiResponse<List<SnmpTrapReceiver>> getSnmpTrapReceivers getSnmpTrapReceiversWithHttpInfo(contentLanguage, getSnmpTrapReceiversRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTrapReceiverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnmpTrapReceiverApi apiInstance = new SnmpTrapReceiverApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetSnmpTrapReceiversRequestBody getSnmpTrapReceiversRequestBody = new GetSnmpTrapReceiversRequestBody(); // GetSnmpTrapReceiversRequestBody | 
        try {
            ApiResponse<List<SnmpTrapReceiver>> response = apiInstance.getSnmpTrapReceiversWithHttpInfo(contentLanguage, getSnmpTrapReceiversRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnmpTrapReceiverApi#getSnmpTrapReceivers");
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
 **getSnmpTrapReceiversRequestBody** | [**GetSnmpTrapReceiversRequestBody**](GetSnmpTrapReceiversRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;SnmpTrapReceiver&gt;**](SnmpTrapReceiver.md)>


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


## getSnmpTrapReceiversConnection

> SnmpTrapReceiverConnection getSnmpTrapReceiversConnection(contentLanguage, getSnmpTrapReceiversConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTrapReceiverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnmpTrapReceiverApi apiInstance = new SnmpTrapReceiverApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetSnmpTrapReceiversConnectionRequestBody getSnmpTrapReceiversConnectionRequestBody = new GetSnmpTrapReceiversConnectionRequestBody(); // GetSnmpTrapReceiversConnectionRequestBody | 
        try {
            SnmpTrapReceiverConnection result = apiInstance.getSnmpTrapReceiversConnection(contentLanguage, getSnmpTrapReceiversConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnmpTrapReceiverApi#getSnmpTrapReceiversConnection");
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
 **getSnmpTrapReceiversConnectionRequestBody** | [**GetSnmpTrapReceiversConnectionRequestBody**](GetSnmpTrapReceiversConnectionRequestBody.md)|  |

### Return type

[**SnmpTrapReceiverConnection**](SnmpTrapReceiverConnection.md)


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

## getSnmpTrapReceiversConnectionWithHttpInfo

> ApiResponse<SnmpTrapReceiverConnection> getSnmpTrapReceiversConnection getSnmpTrapReceiversConnectionWithHttpInfo(contentLanguage, getSnmpTrapReceiversConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTrapReceiverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnmpTrapReceiverApi apiInstance = new SnmpTrapReceiverApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetSnmpTrapReceiversConnectionRequestBody getSnmpTrapReceiversConnectionRequestBody = new GetSnmpTrapReceiversConnectionRequestBody(); // GetSnmpTrapReceiversConnectionRequestBody | 
        try {
            ApiResponse<SnmpTrapReceiverConnection> response = apiInstance.getSnmpTrapReceiversConnectionWithHttpInfo(contentLanguage, getSnmpTrapReceiversConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnmpTrapReceiverApi#getSnmpTrapReceiversConnection");
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
 **getSnmpTrapReceiversConnectionRequestBody** | [**GetSnmpTrapReceiversConnectionRequestBody**](GetSnmpTrapReceiversConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**SnmpTrapReceiverConnection**](SnmpTrapReceiverConnection.md)>


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


## updateSnmpTrapReceiver

> List<WithTaskSnmpTrapReceiver> updateSnmpTrapReceiver(contentLanguage, snmpTrapReceiverUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTrapReceiverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnmpTrapReceiverApi apiInstance = new SnmpTrapReceiverApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        SnmpTrapReceiverUpdationParams snmpTrapReceiverUpdationParams = new SnmpTrapReceiverUpdationParams(); // SnmpTrapReceiverUpdationParams | 
        try {
            List<WithTaskSnmpTrapReceiver> result = apiInstance.updateSnmpTrapReceiver(contentLanguage, snmpTrapReceiverUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnmpTrapReceiverApi#updateSnmpTrapReceiver");
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
 **snmpTrapReceiverUpdationParams** | [**SnmpTrapReceiverUpdationParams**](SnmpTrapReceiverUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskSnmpTrapReceiver&gt;**](WithTaskSnmpTrapReceiver.md)


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

## updateSnmpTrapReceiverWithHttpInfo

> ApiResponse<List<WithTaskSnmpTrapReceiver>> updateSnmpTrapReceiver updateSnmpTrapReceiverWithHttpInfo(contentLanguage, snmpTrapReceiverUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTrapReceiverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnmpTrapReceiverApi apiInstance = new SnmpTrapReceiverApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        SnmpTrapReceiverUpdationParams snmpTrapReceiverUpdationParams = new SnmpTrapReceiverUpdationParams(); // SnmpTrapReceiverUpdationParams | 
        try {
            ApiResponse<List<WithTaskSnmpTrapReceiver>> response = apiInstance.updateSnmpTrapReceiverWithHttpInfo(contentLanguage, snmpTrapReceiverUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnmpTrapReceiverApi#updateSnmpTrapReceiver");
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
 **snmpTrapReceiverUpdationParams** | [**SnmpTrapReceiverUpdationParams**](SnmpTrapReceiverUpdationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskSnmpTrapReceiver&gt;**](WithTaskSnmpTrapReceiver.md)>


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

