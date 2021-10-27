# IscsiTargetApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIscsiTarget**](IscsiTargetApi.md#createIscsiTarget) | **POST** /create-iscsi-target | 
[**createIscsiTargetWithHttpInfo**](IscsiTargetApi.md#createIscsiTargetWithHttpInfo) | **POST** /create-iscsi-target | 
[**deleteIscsiTarget**](IscsiTargetApi.md#deleteIscsiTarget) | **POST** /delete-iscsi-target | 
[**deleteIscsiTargetWithHttpInfo**](IscsiTargetApi.md#deleteIscsiTargetWithHttpInfo) | **POST** /delete-iscsi-target | 
[**getIscsiTargets**](IscsiTargetApi.md#getIscsiTargets) | **POST** /get-iscsi-targets | 
[**getIscsiTargetsWithHttpInfo**](IscsiTargetApi.md#getIscsiTargetsWithHttpInfo) | **POST** /get-iscsi-targets | 
[**getIscsiTargetsConnection**](IscsiTargetApi.md#getIscsiTargetsConnection) | **POST** /get-iscsi-targets-connection | 
[**getIscsiTargetsConnectionWithHttpInfo**](IscsiTargetApi.md#getIscsiTargetsConnectionWithHttpInfo) | **POST** /get-iscsi-targets-connection | 
[**updateIscsiTarget**](IscsiTargetApi.md#updateIscsiTarget) | **POST** /update-iscsi-target | 
[**updateIscsiTargetWithHttpInfo**](IscsiTargetApi.md#updateIscsiTargetWithHttpInfo) | **POST** /update-iscsi-target | 



## createIscsiTarget

> List<WithTaskIscsiTarget> createIscsiTarget(contentLanguage, iscsiTargetCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiTargetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiTargetApi apiInstance = new IscsiTargetApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<IscsiTargetCreationParams> iscsiTargetCreationParams = Arrays.asList(); // List<IscsiTargetCreationParams> | 
        try {
            List<WithTaskIscsiTarget> result = apiInstance.createIscsiTarget(contentLanguage, iscsiTargetCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiTargetApi#createIscsiTarget");
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
 **iscsiTargetCreationParams** | [**List&lt;IscsiTargetCreationParams&gt;**](IscsiTargetCreationParams.md)|  |

### Return type

[**List&lt;WithTaskIscsiTarget&gt;**](WithTaskIscsiTarget.md)


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

## createIscsiTargetWithHttpInfo

> ApiResponse<List<WithTaskIscsiTarget>> createIscsiTarget createIscsiTargetWithHttpInfo(contentLanguage, iscsiTargetCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiTargetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiTargetApi apiInstance = new IscsiTargetApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<IscsiTargetCreationParams> iscsiTargetCreationParams = Arrays.asList(); // List<IscsiTargetCreationParams> | 
        try {
            ApiResponse<List<WithTaskIscsiTarget>> response = apiInstance.createIscsiTargetWithHttpInfo(contentLanguage, iscsiTargetCreationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiTargetApi#createIscsiTarget");
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
 **iscsiTargetCreationParams** | [**List&lt;IscsiTargetCreationParams&gt;**](IscsiTargetCreationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskIscsiTarget&gt;**](WithTaskIscsiTarget.md)>


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


## deleteIscsiTarget

> List<WithTaskDeleteIscsiTarget> deleteIscsiTarget(contentLanguage, iscsiTargetDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiTargetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiTargetApi apiInstance = new IscsiTargetApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        IscsiTargetDeletionParams iscsiTargetDeletionParams = new IscsiTargetDeletionParams(); // IscsiTargetDeletionParams | 
        try {
            List<WithTaskDeleteIscsiTarget> result = apiInstance.deleteIscsiTarget(contentLanguage, iscsiTargetDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiTargetApi#deleteIscsiTarget");
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
 **iscsiTargetDeletionParams** | [**IscsiTargetDeletionParams**](IscsiTargetDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteIscsiTarget&gt;**](WithTaskDeleteIscsiTarget.md)


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

## deleteIscsiTargetWithHttpInfo

> ApiResponse<List<WithTaskDeleteIscsiTarget>> deleteIscsiTarget deleteIscsiTargetWithHttpInfo(contentLanguage, iscsiTargetDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiTargetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiTargetApi apiInstance = new IscsiTargetApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        IscsiTargetDeletionParams iscsiTargetDeletionParams = new IscsiTargetDeletionParams(); // IscsiTargetDeletionParams | 
        try {
            ApiResponse<List<WithTaskDeleteIscsiTarget>> response = apiInstance.deleteIscsiTargetWithHttpInfo(contentLanguage, iscsiTargetDeletionParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiTargetApi#deleteIscsiTarget");
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
 **iscsiTargetDeletionParams** | [**IscsiTargetDeletionParams**](IscsiTargetDeletionParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDeleteIscsiTarget&gt;**](WithTaskDeleteIscsiTarget.md)>


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


## getIscsiTargets

> List<IscsiTarget> getIscsiTargets(contentLanguage, getIscsiTargetsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiTargetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiTargetApi apiInstance = new IscsiTargetApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetIscsiTargetsRequestBody getIscsiTargetsRequestBody = new GetIscsiTargetsRequestBody(); // GetIscsiTargetsRequestBody | 
        try {
            List<IscsiTarget> result = apiInstance.getIscsiTargets(contentLanguage, getIscsiTargetsRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiTargetApi#getIscsiTargets");
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
 **getIscsiTargetsRequestBody** | [**GetIscsiTargetsRequestBody**](GetIscsiTargetsRequestBody.md)|  |

### Return type

[**List&lt;IscsiTarget&gt;**](IscsiTarget.md)


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

## getIscsiTargetsWithHttpInfo

> ApiResponse<List<IscsiTarget>> getIscsiTargets getIscsiTargetsWithHttpInfo(contentLanguage, getIscsiTargetsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiTargetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiTargetApi apiInstance = new IscsiTargetApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetIscsiTargetsRequestBody getIscsiTargetsRequestBody = new GetIscsiTargetsRequestBody(); // GetIscsiTargetsRequestBody | 
        try {
            ApiResponse<List<IscsiTarget>> response = apiInstance.getIscsiTargetsWithHttpInfo(contentLanguage, getIscsiTargetsRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiTargetApi#getIscsiTargets");
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
 **getIscsiTargetsRequestBody** | [**GetIscsiTargetsRequestBody**](GetIscsiTargetsRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;IscsiTarget&gt;**](IscsiTarget.md)>


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


## getIscsiTargetsConnection

> IscsiTargetConnection getIscsiTargetsConnection(contentLanguage, getIscsiTargetsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiTargetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiTargetApi apiInstance = new IscsiTargetApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetIscsiTargetsConnectionRequestBody getIscsiTargetsConnectionRequestBody = new GetIscsiTargetsConnectionRequestBody(); // GetIscsiTargetsConnectionRequestBody | 
        try {
            IscsiTargetConnection result = apiInstance.getIscsiTargetsConnection(contentLanguage, getIscsiTargetsConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiTargetApi#getIscsiTargetsConnection");
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
 **getIscsiTargetsConnectionRequestBody** | [**GetIscsiTargetsConnectionRequestBody**](GetIscsiTargetsConnectionRequestBody.md)|  |

### Return type

[**IscsiTargetConnection**](IscsiTargetConnection.md)


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

## getIscsiTargetsConnectionWithHttpInfo

> ApiResponse<IscsiTargetConnection> getIscsiTargetsConnection getIscsiTargetsConnectionWithHttpInfo(contentLanguage, getIscsiTargetsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiTargetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiTargetApi apiInstance = new IscsiTargetApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetIscsiTargetsConnectionRequestBody getIscsiTargetsConnectionRequestBody = new GetIscsiTargetsConnectionRequestBody(); // GetIscsiTargetsConnectionRequestBody | 
        try {
            ApiResponse<IscsiTargetConnection> response = apiInstance.getIscsiTargetsConnectionWithHttpInfo(contentLanguage, getIscsiTargetsConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiTargetApi#getIscsiTargetsConnection");
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
 **getIscsiTargetsConnectionRequestBody** | [**GetIscsiTargetsConnectionRequestBody**](GetIscsiTargetsConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**IscsiTargetConnection**](IscsiTargetConnection.md)>


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


## updateIscsiTarget

> List<WithTaskIscsiTarget> updateIscsiTarget(contentLanguage, iscsiTargetUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiTargetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiTargetApi apiInstance = new IscsiTargetApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        IscsiTargetUpdationParams iscsiTargetUpdationParams = new IscsiTargetUpdationParams(); // IscsiTargetUpdationParams | 
        try {
            List<WithTaskIscsiTarget> result = apiInstance.updateIscsiTarget(contentLanguage, iscsiTargetUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiTargetApi#updateIscsiTarget");
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
 **iscsiTargetUpdationParams** | [**IscsiTargetUpdationParams**](IscsiTargetUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskIscsiTarget&gt;**](WithTaskIscsiTarget.md)


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

## updateIscsiTargetWithHttpInfo

> ApiResponse<List<WithTaskIscsiTarget>> updateIscsiTarget updateIscsiTargetWithHttpInfo(contentLanguage, iscsiTargetUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiTargetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiTargetApi apiInstance = new IscsiTargetApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        IscsiTargetUpdationParams iscsiTargetUpdationParams = new IscsiTargetUpdationParams(); // IscsiTargetUpdationParams | 
        try {
            ApiResponse<List<WithTaskIscsiTarget>> response = apiInstance.updateIscsiTargetWithHttpInfo(contentLanguage, iscsiTargetUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiTargetApi#updateIscsiTarget");
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
 **iscsiTargetUpdationParams** | [**IscsiTargetUpdationParams**](IscsiTargetUpdationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskIscsiTarget&gt;**](WithTaskIscsiTarget.md)>


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

