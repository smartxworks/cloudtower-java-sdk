# SnmpTransportApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSnmpTransport**](SnmpTransportApi.md#createSnmpTransport) | **POST** /create-snmp-transport | 
[**createSnmpTransportWithHttpInfo**](SnmpTransportApi.md#createSnmpTransportWithHttpInfo) | **POST** /create-snmp-transport | 
[**deleteSnmpTransport**](SnmpTransportApi.md#deleteSnmpTransport) | **POST** /delete-snmp-transport | 
[**deleteSnmpTransportWithHttpInfo**](SnmpTransportApi.md#deleteSnmpTransportWithHttpInfo) | **POST** /delete-snmp-transport | 
[**getSnmpTransports**](SnmpTransportApi.md#getSnmpTransports) | **POST** /get-snmp-transports | 
[**getSnmpTransportsWithHttpInfo**](SnmpTransportApi.md#getSnmpTransportsWithHttpInfo) | **POST** /get-snmp-transports | 
[**getSnmpTransportsConnection**](SnmpTransportApi.md#getSnmpTransportsConnection) | **POST** /get-snmp-transports-connection | 
[**getSnmpTransportsConnectionWithHttpInfo**](SnmpTransportApi.md#getSnmpTransportsConnectionWithHttpInfo) | **POST** /get-snmp-transports-connection | 
[**updateSnmpTransport**](SnmpTransportApi.md#updateSnmpTransport) | **POST** /update-snmp-transport | 
[**updateSnmpTransportWithHttpInfo**](SnmpTransportApi.md#updateSnmpTransportWithHttpInfo) | **POST** /update-snmp-transport | 



## createSnmpTransport

> List<WithTaskSnmpTransport> createSnmpTransport(contentLanguage, snmpTransportCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTransportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnmpTransportApi apiInstance = new SnmpTransportApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<SnmpTransportCreationParams> snmpTransportCreationParams = Arrays.asList(); // List<SnmpTransportCreationParams> | 
        try {
            List<WithTaskSnmpTransport> result = apiInstance.createSnmpTransport(contentLanguage, snmpTransportCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnmpTransportApi#createSnmpTransport");
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
 **snmpTransportCreationParams** | [**List&lt;SnmpTransportCreationParams&gt;**](SnmpTransportCreationParams.md)|  |

### Return type

[**List&lt;WithTaskSnmpTransport&gt;**](WithTaskSnmpTransport.md)


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

## createSnmpTransportWithHttpInfo

> ApiResponse<List<WithTaskSnmpTransport>> createSnmpTransport createSnmpTransportWithHttpInfo(contentLanguage, snmpTransportCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTransportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnmpTransportApi apiInstance = new SnmpTransportApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<SnmpTransportCreationParams> snmpTransportCreationParams = Arrays.asList(); // List<SnmpTransportCreationParams> | 
        try {
            ApiResponse<List<WithTaskSnmpTransport>> response = apiInstance.createSnmpTransportWithHttpInfo(contentLanguage, snmpTransportCreationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnmpTransportApi#createSnmpTransport");
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
 **snmpTransportCreationParams** | [**List&lt;SnmpTransportCreationParams&gt;**](SnmpTransportCreationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskSnmpTransport&gt;**](WithTaskSnmpTransport.md)>


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


## deleteSnmpTransport

> List<WithTaskDeleteSnmpTransport> deleteSnmpTransport(contentLanguage, snmpTransportDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTransportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnmpTransportApi apiInstance = new SnmpTransportApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        SnmpTransportDeletionParams snmpTransportDeletionParams = new SnmpTransportDeletionParams(); // SnmpTransportDeletionParams | 
        try {
            List<WithTaskDeleteSnmpTransport> result = apiInstance.deleteSnmpTransport(contentLanguage, snmpTransportDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnmpTransportApi#deleteSnmpTransport");
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
 **snmpTransportDeletionParams** | [**SnmpTransportDeletionParams**](SnmpTransportDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteSnmpTransport&gt;**](WithTaskDeleteSnmpTransport.md)


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

## deleteSnmpTransportWithHttpInfo

> ApiResponse<List<WithTaskDeleteSnmpTransport>> deleteSnmpTransport deleteSnmpTransportWithHttpInfo(contentLanguage, snmpTransportDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTransportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnmpTransportApi apiInstance = new SnmpTransportApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        SnmpTransportDeletionParams snmpTransportDeletionParams = new SnmpTransportDeletionParams(); // SnmpTransportDeletionParams | 
        try {
            ApiResponse<List<WithTaskDeleteSnmpTransport>> response = apiInstance.deleteSnmpTransportWithHttpInfo(contentLanguage, snmpTransportDeletionParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnmpTransportApi#deleteSnmpTransport");
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
 **snmpTransportDeletionParams** | [**SnmpTransportDeletionParams**](SnmpTransportDeletionParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDeleteSnmpTransport&gt;**](WithTaskDeleteSnmpTransport.md)>


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


## getSnmpTransports

> List<SnmpTransport> getSnmpTransports(contentLanguage, getSnmpTransportsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTransportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnmpTransportApi apiInstance = new SnmpTransportApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetSnmpTransportsRequestBody getSnmpTransportsRequestBody = new GetSnmpTransportsRequestBody(); // GetSnmpTransportsRequestBody | 
        try {
            List<SnmpTransport> result = apiInstance.getSnmpTransports(contentLanguage, getSnmpTransportsRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnmpTransportApi#getSnmpTransports");
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
 **getSnmpTransportsRequestBody** | [**GetSnmpTransportsRequestBody**](GetSnmpTransportsRequestBody.md)|  |

### Return type

[**List&lt;SnmpTransport&gt;**](SnmpTransport.md)


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

## getSnmpTransportsWithHttpInfo

> ApiResponse<List<SnmpTransport>> getSnmpTransports getSnmpTransportsWithHttpInfo(contentLanguage, getSnmpTransportsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTransportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnmpTransportApi apiInstance = new SnmpTransportApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetSnmpTransportsRequestBody getSnmpTransportsRequestBody = new GetSnmpTransportsRequestBody(); // GetSnmpTransportsRequestBody | 
        try {
            ApiResponse<List<SnmpTransport>> response = apiInstance.getSnmpTransportsWithHttpInfo(contentLanguage, getSnmpTransportsRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnmpTransportApi#getSnmpTransports");
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
 **getSnmpTransportsRequestBody** | [**GetSnmpTransportsRequestBody**](GetSnmpTransportsRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;SnmpTransport&gt;**](SnmpTransport.md)>


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


## getSnmpTransportsConnection

> SnmpTransportConnection getSnmpTransportsConnection(contentLanguage, getSnmpTransportsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTransportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnmpTransportApi apiInstance = new SnmpTransportApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetSnmpTransportsConnectionRequestBody getSnmpTransportsConnectionRequestBody = new GetSnmpTransportsConnectionRequestBody(); // GetSnmpTransportsConnectionRequestBody | 
        try {
            SnmpTransportConnection result = apiInstance.getSnmpTransportsConnection(contentLanguage, getSnmpTransportsConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnmpTransportApi#getSnmpTransportsConnection");
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
 **getSnmpTransportsConnectionRequestBody** | [**GetSnmpTransportsConnectionRequestBody**](GetSnmpTransportsConnectionRequestBody.md)|  |

### Return type

[**SnmpTransportConnection**](SnmpTransportConnection.md)


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

## getSnmpTransportsConnectionWithHttpInfo

> ApiResponse<SnmpTransportConnection> getSnmpTransportsConnection getSnmpTransportsConnectionWithHttpInfo(contentLanguage, getSnmpTransportsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTransportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnmpTransportApi apiInstance = new SnmpTransportApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetSnmpTransportsConnectionRequestBody getSnmpTransportsConnectionRequestBody = new GetSnmpTransportsConnectionRequestBody(); // GetSnmpTransportsConnectionRequestBody | 
        try {
            ApiResponse<SnmpTransportConnection> response = apiInstance.getSnmpTransportsConnectionWithHttpInfo(contentLanguage, getSnmpTransportsConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnmpTransportApi#getSnmpTransportsConnection");
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
 **getSnmpTransportsConnectionRequestBody** | [**GetSnmpTransportsConnectionRequestBody**](GetSnmpTransportsConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**SnmpTransportConnection**](SnmpTransportConnection.md)>


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


## updateSnmpTransport

> List<WithTaskSnmpTransport> updateSnmpTransport(contentLanguage, snmpTransportUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTransportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnmpTransportApi apiInstance = new SnmpTransportApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        SnmpTransportUpdationParams snmpTransportUpdationParams = new SnmpTransportUpdationParams(); // SnmpTransportUpdationParams | 
        try {
            List<WithTaskSnmpTransport> result = apiInstance.updateSnmpTransport(contentLanguage, snmpTransportUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnmpTransportApi#updateSnmpTransport");
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
 **snmpTransportUpdationParams** | [**SnmpTransportUpdationParams**](SnmpTransportUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskSnmpTransport&gt;**](WithTaskSnmpTransport.md)


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

## updateSnmpTransportWithHttpInfo

> ApiResponse<List<WithTaskSnmpTransport>> updateSnmpTransport updateSnmpTransportWithHttpInfo(contentLanguage, snmpTransportUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTransportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnmpTransportApi apiInstance = new SnmpTransportApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        SnmpTransportUpdationParams snmpTransportUpdationParams = new SnmpTransportUpdationParams(); // SnmpTransportUpdationParams | 
        try {
            ApiResponse<List<WithTaskSnmpTransport>> response = apiInstance.updateSnmpTransportWithHttpInfo(contentLanguage, snmpTransportUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnmpTransportApi#updateSnmpTransport");
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
 **snmpTransportUpdationParams** | [**SnmpTransportUpdationParams**](SnmpTransportUpdationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskSnmpTransport&gt;**](WithTaskSnmpTransport.md)>


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

