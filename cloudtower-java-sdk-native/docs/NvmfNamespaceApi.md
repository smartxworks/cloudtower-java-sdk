# NvmfNamespaceApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneNvmfNamespaceFromSnapshot**](NvmfNamespaceApi.md#cloneNvmfNamespaceFromSnapshot) | **POST** /clone-nvmf-namespace-from-snapshot | 
[**cloneNvmfNamespaceFromSnapshotWithHttpInfo**](NvmfNamespaceApi.md#cloneNvmfNamespaceFromSnapshotWithHttpInfo) | **POST** /clone-nvmf-namespace-from-snapshot | 
[**createNvmfNamespace**](NvmfNamespaceApi.md#createNvmfNamespace) | **POST** /create-nvmf-namespace | 
[**createNvmfNamespaceWithHttpInfo**](NvmfNamespaceApi.md#createNvmfNamespaceWithHttpInfo) | **POST** /create-nvmf-namespace | 
[**deleteNvmfNamespace**](NvmfNamespaceApi.md#deleteNvmfNamespace) | **POST** /delete-nvmf-namespace | 
[**deleteNvmfNamespaceWithHttpInfo**](NvmfNamespaceApi.md#deleteNvmfNamespaceWithHttpInfo) | **POST** /delete-nvmf-namespace | 
[**getNvmfNamespaces**](NvmfNamespaceApi.md#getNvmfNamespaces) | **POST** /get-nvmf-namespaces | 
[**getNvmfNamespacesWithHttpInfo**](NvmfNamespaceApi.md#getNvmfNamespacesWithHttpInfo) | **POST** /get-nvmf-namespaces | 
[**getNvmfNamespacesConnection**](NvmfNamespaceApi.md#getNvmfNamespacesConnection) | **POST** /get-nvmf-namespaces-connection | 
[**getNvmfNamespacesConnectionWithHttpInfo**](NvmfNamespaceApi.md#getNvmfNamespacesConnectionWithHttpInfo) | **POST** /get-nvmf-namespaces-connection | 
[**rollbackNvmfNamespaceFromSnapshot**](NvmfNamespaceApi.md#rollbackNvmfNamespaceFromSnapshot) | **POST** /rollback-nvmf-namespace-from-snapshot | 
[**rollbackNvmfNamespaceFromSnapshotWithHttpInfo**](NvmfNamespaceApi.md#rollbackNvmfNamespaceFromSnapshotWithHttpInfo) | **POST** /rollback-nvmf-namespace-from-snapshot | 
[**updateNvmfNamespace**](NvmfNamespaceApi.md#updateNvmfNamespace) | **POST** /update-nvmf-namespace | 
[**updateNvmfNamespaceWithHttpInfo**](NvmfNamespaceApi.md#updateNvmfNamespaceWithHttpInfo) | **POST** /update-nvmf-namespace | 



## cloneNvmfNamespaceFromSnapshot

> List<WithTaskNvmfNamespace> cloneNvmfNamespaceFromSnapshot(contentLanguage, nvmfNamespaceCloneParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<NvmfNamespaceCloneParams> nvmfNamespaceCloneParams = Arrays.asList(); // List<NvmfNamespaceCloneParams> | 
        try {
            List<WithTaskNvmfNamespace> result = apiInstance.cloneNvmfNamespaceFromSnapshot(contentLanguage, nvmfNamespaceCloneParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceApi#cloneNvmfNamespaceFromSnapshot");
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
 **nvmfNamespaceCloneParams** | [**List&lt;NvmfNamespaceCloneParams&gt;**](NvmfNamespaceCloneParams.md)|  |

### Return type

[**List&lt;WithTaskNvmfNamespace&gt;**](WithTaskNvmfNamespace.md)


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

## cloneNvmfNamespaceFromSnapshotWithHttpInfo

> ApiResponse<List<WithTaskNvmfNamespace>> cloneNvmfNamespaceFromSnapshot cloneNvmfNamespaceFromSnapshotWithHttpInfo(contentLanguage, nvmfNamespaceCloneParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<NvmfNamespaceCloneParams> nvmfNamespaceCloneParams = Arrays.asList(); // List<NvmfNamespaceCloneParams> | 
        try {
            ApiResponse<List<WithTaskNvmfNamespace>> response = apiInstance.cloneNvmfNamespaceFromSnapshotWithHttpInfo(contentLanguage, nvmfNamespaceCloneParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceApi#cloneNvmfNamespaceFromSnapshot");
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
 **nvmfNamespaceCloneParams** | [**List&lt;NvmfNamespaceCloneParams&gt;**](NvmfNamespaceCloneParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskNvmfNamespace&gt;**](WithTaskNvmfNamespace.md)>


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


## createNvmfNamespace

> List<WithTaskNvmfNamespace> createNvmfNamespace(contentLanguage, nvmfNamespaceCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<NvmfNamespaceCreationParams> nvmfNamespaceCreationParams = Arrays.asList(); // List<NvmfNamespaceCreationParams> | 
        try {
            List<WithTaskNvmfNamespace> result = apiInstance.createNvmfNamespace(contentLanguage, nvmfNamespaceCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceApi#createNvmfNamespace");
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
 **nvmfNamespaceCreationParams** | [**List&lt;NvmfNamespaceCreationParams&gt;**](NvmfNamespaceCreationParams.md)|  |

### Return type

[**List&lt;WithTaskNvmfNamespace&gt;**](WithTaskNvmfNamespace.md)


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

## createNvmfNamespaceWithHttpInfo

> ApiResponse<List<WithTaskNvmfNamespace>> createNvmfNamespace createNvmfNamespaceWithHttpInfo(contentLanguage, nvmfNamespaceCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<NvmfNamespaceCreationParams> nvmfNamespaceCreationParams = Arrays.asList(); // List<NvmfNamespaceCreationParams> | 
        try {
            ApiResponse<List<WithTaskNvmfNamespace>> response = apiInstance.createNvmfNamespaceWithHttpInfo(contentLanguage, nvmfNamespaceCreationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceApi#createNvmfNamespace");
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
 **nvmfNamespaceCreationParams** | [**List&lt;NvmfNamespaceCreationParams&gt;**](NvmfNamespaceCreationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskNvmfNamespace&gt;**](WithTaskNvmfNamespace.md)>


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


## deleteNvmfNamespace

> List<WithTaskDeleteNvmfNamespace> deleteNvmfNamespace(contentLanguage, nvmfNamespaceDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        NvmfNamespaceDeletionParams nvmfNamespaceDeletionParams = new NvmfNamespaceDeletionParams(); // NvmfNamespaceDeletionParams | 
        try {
            List<WithTaskDeleteNvmfNamespace> result = apiInstance.deleteNvmfNamespace(contentLanguage, nvmfNamespaceDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceApi#deleteNvmfNamespace");
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
 **nvmfNamespaceDeletionParams** | [**NvmfNamespaceDeletionParams**](NvmfNamespaceDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteNvmfNamespace&gt;**](WithTaskDeleteNvmfNamespace.md)


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

## deleteNvmfNamespaceWithHttpInfo

> ApiResponse<List<WithTaskDeleteNvmfNamespace>> deleteNvmfNamespace deleteNvmfNamespaceWithHttpInfo(contentLanguage, nvmfNamespaceDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        NvmfNamespaceDeletionParams nvmfNamespaceDeletionParams = new NvmfNamespaceDeletionParams(); // NvmfNamespaceDeletionParams | 
        try {
            ApiResponse<List<WithTaskDeleteNvmfNamespace>> response = apiInstance.deleteNvmfNamespaceWithHttpInfo(contentLanguage, nvmfNamespaceDeletionParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceApi#deleteNvmfNamespace");
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
 **nvmfNamespaceDeletionParams** | [**NvmfNamespaceDeletionParams**](NvmfNamespaceDeletionParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDeleteNvmfNamespace&gt;**](WithTaskDeleteNvmfNamespace.md)>


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


## getNvmfNamespaces

> List<NvmfNamespace> getNvmfNamespaces(contentLanguage, getNvmfNamespacesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetNvmfNamespacesRequestBody getNvmfNamespacesRequestBody = new GetNvmfNamespacesRequestBody(); // GetNvmfNamespacesRequestBody | 
        try {
            List<NvmfNamespace> result = apiInstance.getNvmfNamespaces(contentLanguage, getNvmfNamespacesRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceApi#getNvmfNamespaces");
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
 **getNvmfNamespacesRequestBody** | [**GetNvmfNamespacesRequestBody**](GetNvmfNamespacesRequestBody.md)|  |

### Return type

[**List&lt;NvmfNamespace&gt;**](NvmfNamespace.md)


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

## getNvmfNamespacesWithHttpInfo

> ApiResponse<List<NvmfNamespace>> getNvmfNamespaces getNvmfNamespacesWithHttpInfo(contentLanguage, getNvmfNamespacesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetNvmfNamespacesRequestBody getNvmfNamespacesRequestBody = new GetNvmfNamespacesRequestBody(); // GetNvmfNamespacesRequestBody | 
        try {
            ApiResponse<List<NvmfNamespace>> response = apiInstance.getNvmfNamespacesWithHttpInfo(contentLanguage, getNvmfNamespacesRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceApi#getNvmfNamespaces");
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
 **getNvmfNamespacesRequestBody** | [**GetNvmfNamespacesRequestBody**](GetNvmfNamespacesRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;NvmfNamespace&gt;**](NvmfNamespace.md)>


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


## getNvmfNamespacesConnection

> NvmfNamespaceConnection getNvmfNamespacesConnection(contentLanguage, getNvmfNamespacesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetNvmfNamespacesConnectionRequestBody getNvmfNamespacesConnectionRequestBody = new GetNvmfNamespacesConnectionRequestBody(); // GetNvmfNamespacesConnectionRequestBody | 
        try {
            NvmfNamespaceConnection result = apiInstance.getNvmfNamespacesConnection(contentLanguage, getNvmfNamespacesConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceApi#getNvmfNamespacesConnection");
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
 **getNvmfNamespacesConnectionRequestBody** | [**GetNvmfNamespacesConnectionRequestBody**](GetNvmfNamespacesConnectionRequestBody.md)|  |

### Return type

[**NvmfNamespaceConnection**](NvmfNamespaceConnection.md)


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

## getNvmfNamespacesConnectionWithHttpInfo

> ApiResponse<NvmfNamespaceConnection> getNvmfNamespacesConnection getNvmfNamespacesConnectionWithHttpInfo(contentLanguage, getNvmfNamespacesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetNvmfNamespacesConnectionRequestBody getNvmfNamespacesConnectionRequestBody = new GetNvmfNamespacesConnectionRequestBody(); // GetNvmfNamespacesConnectionRequestBody | 
        try {
            ApiResponse<NvmfNamespaceConnection> response = apiInstance.getNvmfNamespacesConnectionWithHttpInfo(contentLanguage, getNvmfNamespacesConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceApi#getNvmfNamespacesConnection");
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
 **getNvmfNamespacesConnectionRequestBody** | [**GetNvmfNamespacesConnectionRequestBody**](GetNvmfNamespacesConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**NvmfNamespaceConnection**](NvmfNamespaceConnection.md)>


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


## rollbackNvmfNamespaceFromSnapshot

> List<WithTaskNvmfNamespace> rollbackNvmfNamespaceFromSnapshot(contentLanguage, nvmfNamespaceRollbackParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<NvmfNamespaceRollbackParams> nvmfNamespaceRollbackParams = Arrays.asList(); // List<NvmfNamespaceRollbackParams> | 
        try {
            List<WithTaskNvmfNamespace> result = apiInstance.rollbackNvmfNamespaceFromSnapshot(contentLanguage, nvmfNamespaceRollbackParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceApi#rollbackNvmfNamespaceFromSnapshot");
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
 **nvmfNamespaceRollbackParams** | [**List&lt;NvmfNamespaceRollbackParams&gt;**](NvmfNamespaceRollbackParams.md)|  |

### Return type

[**List&lt;WithTaskNvmfNamespace&gt;**](WithTaskNvmfNamespace.md)


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

## rollbackNvmfNamespaceFromSnapshotWithHttpInfo

> ApiResponse<List<WithTaskNvmfNamespace>> rollbackNvmfNamespaceFromSnapshot rollbackNvmfNamespaceFromSnapshotWithHttpInfo(contentLanguage, nvmfNamespaceRollbackParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<NvmfNamespaceRollbackParams> nvmfNamespaceRollbackParams = Arrays.asList(); // List<NvmfNamespaceRollbackParams> | 
        try {
            ApiResponse<List<WithTaskNvmfNamespace>> response = apiInstance.rollbackNvmfNamespaceFromSnapshotWithHttpInfo(contentLanguage, nvmfNamespaceRollbackParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceApi#rollbackNvmfNamespaceFromSnapshot");
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
 **nvmfNamespaceRollbackParams** | [**List&lt;NvmfNamespaceRollbackParams&gt;**](NvmfNamespaceRollbackParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskNvmfNamespace&gt;**](WithTaskNvmfNamespace.md)>


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


## updateNvmfNamespace

> List<WithTaskNvmfNamespace> updateNvmfNamespace(contentLanguage, nvmfNamespaceUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        NvmfNamespaceUpdationParams nvmfNamespaceUpdationParams = new NvmfNamespaceUpdationParams(); // NvmfNamespaceUpdationParams | 
        try {
            List<WithTaskNvmfNamespace> result = apiInstance.updateNvmfNamespace(contentLanguage, nvmfNamespaceUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceApi#updateNvmfNamespace");
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
 **nvmfNamespaceUpdationParams** | [**NvmfNamespaceUpdationParams**](NvmfNamespaceUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskNvmfNamespace&gt;**](WithTaskNvmfNamespace.md)


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

## updateNvmfNamespaceWithHttpInfo

> ApiResponse<List<WithTaskNvmfNamespace>> updateNvmfNamespace updateNvmfNamespaceWithHttpInfo(contentLanguage, nvmfNamespaceUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        NvmfNamespaceUpdationParams nvmfNamespaceUpdationParams = new NvmfNamespaceUpdationParams(); // NvmfNamespaceUpdationParams | 
        try {
            ApiResponse<List<WithTaskNvmfNamespace>> response = apiInstance.updateNvmfNamespaceWithHttpInfo(contentLanguage, nvmfNamespaceUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceApi#updateNvmfNamespace");
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
 **nvmfNamespaceUpdationParams** | [**NvmfNamespaceUpdationParams**](NvmfNamespaceUpdationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskNvmfNamespace&gt;**](WithTaskNvmfNamespace.md)>


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

