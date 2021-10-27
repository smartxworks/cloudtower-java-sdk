# NvmfNamespaceApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneNvmfNamespaceFromSnapshot**](NvmfNamespaceApi.md#cloneNvmfNamespaceFromSnapshot) | **POST** clone-nvmf-namespace-from-snapshot | 
[**createNvmfNamespace**](NvmfNamespaceApi.md#createNvmfNamespace) | **POST** create-nvmf-namespace | 
[**deleteNvmfNamespace**](NvmfNamespaceApi.md#deleteNvmfNamespace) | **POST** delete-nvmf-namespace | 
[**getNvmfNamespaces**](NvmfNamespaceApi.md#getNvmfNamespaces) | **POST** get-nvmf-namespaces | 
[**getNvmfNamespacesConnection**](NvmfNamespaceApi.md#getNvmfNamespacesConnection) | **POST** get-nvmf-namespaces-connection | 
[**rollbackNvmfNamespaceFromSnapshot**](NvmfNamespaceApi.md#rollbackNvmfNamespaceFromSnapshot) | **POST** rollback-nvmf-namespace-from-snapshot | 
[**updateNvmfNamespace**](NvmfNamespaceApi.md#updateNvmfNamespace) | **POST** update-nvmf-namespace | 



## cloneNvmfNamespaceFromSnapshot

> List&lt;WithTaskNvmfNamespace&gt; cloneNvmfNamespaceFromSnapshot(contentLanguage, nvmfNamespaceCloneParams)



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


## createNvmfNamespace

> List&lt;WithTaskNvmfNamespace&gt; createNvmfNamespace(contentLanguage, nvmfNamespaceCreationParams)



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


## deleteNvmfNamespace

> List&lt;WithTaskDeleteNvmfNamespace&gt; deleteNvmfNamespace(contentLanguage, nvmfNamespaceDeletionParams)



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


## getNvmfNamespaces

> List&lt;NvmfNamespace&gt; getNvmfNamespaces(contentLanguage, getNvmfNamespacesRequestBody)



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


## rollbackNvmfNamespaceFromSnapshot

> List&lt;WithTaskNvmfNamespace&gt; rollbackNvmfNamespaceFromSnapshot(contentLanguage, nvmfNamespaceRollbackParams)



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


## updateNvmfNamespace

> List&lt;WithTaskNvmfNamespace&gt; updateNvmfNamespace(contentLanguage, nvmfNamespaceUpdationParams)



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

