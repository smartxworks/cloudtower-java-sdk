# NvmfNamespaceSnapshotApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNvmfNamespaceSnapshot**](NvmfNamespaceSnapshotApi.md#createNvmfNamespaceSnapshot) | **POST** /create-nvmf-namespace-snapshot | 
[**createNvmfNamespaceSnapshotWithHttpInfo**](NvmfNamespaceSnapshotApi.md#createNvmfNamespaceSnapshotWithHttpInfo) | **POST** /create-nvmf-namespace-snapshot | 
[**deleteNvmfNamespaceSnapshot**](NvmfNamespaceSnapshotApi.md#deleteNvmfNamespaceSnapshot) | **POST** /delete-nvmf-namespace-snapshot | 
[**deleteNvmfNamespaceSnapshotWithHttpInfo**](NvmfNamespaceSnapshotApi.md#deleteNvmfNamespaceSnapshotWithHttpInfo) | **POST** /delete-nvmf-namespace-snapshot | 
[**getNvmfNamespaceSnapshots**](NvmfNamespaceSnapshotApi.md#getNvmfNamespaceSnapshots) | **POST** /get-nvmf-namespace-snapshots | 
[**getNvmfNamespaceSnapshotsWithHttpInfo**](NvmfNamespaceSnapshotApi.md#getNvmfNamespaceSnapshotsWithHttpInfo) | **POST** /get-nvmf-namespace-snapshots | 
[**getNvmfNamespaceSnapshotsConnection**](NvmfNamespaceSnapshotApi.md#getNvmfNamespaceSnapshotsConnection) | **POST** /get-nvmf-namespace-snapshots-connection | 
[**getNvmfNamespaceSnapshotsConnectionWithHttpInfo**](NvmfNamespaceSnapshotApi.md#getNvmfNamespaceSnapshotsConnectionWithHttpInfo) | **POST** /get-nvmf-namespace-snapshots-connection | 



## createNvmfNamespaceSnapshot

> List<WithTaskNvmfNamespaceSnapshot> createNvmfNamespaceSnapshot(contentLanguage, nvmfNamespaceSnapshotCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceSnapshotApi apiInstance = new NvmfNamespaceSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<NvmfNamespaceSnapshotCreationParams> nvmfNamespaceSnapshotCreationParams = Arrays.asList(); // List<NvmfNamespaceSnapshotCreationParams> | 
        try {
            List<WithTaskNvmfNamespaceSnapshot> result = apiInstance.createNvmfNamespaceSnapshot(contentLanguage, nvmfNamespaceSnapshotCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceSnapshotApi#createNvmfNamespaceSnapshot");
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
 **nvmfNamespaceSnapshotCreationParams** | [**List&lt;NvmfNamespaceSnapshotCreationParams&gt;**](NvmfNamespaceSnapshotCreationParams.md)|  |

### Return type

[**List&lt;WithTaskNvmfNamespaceSnapshot&gt;**](WithTaskNvmfNamespaceSnapshot.md)


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

## createNvmfNamespaceSnapshotWithHttpInfo

> ApiResponse<List<WithTaskNvmfNamespaceSnapshot>> createNvmfNamespaceSnapshot createNvmfNamespaceSnapshotWithHttpInfo(contentLanguage, nvmfNamespaceSnapshotCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceSnapshotApi apiInstance = new NvmfNamespaceSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<NvmfNamespaceSnapshotCreationParams> nvmfNamespaceSnapshotCreationParams = Arrays.asList(); // List<NvmfNamespaceSnapshotCreationParams> | 
        try {
            ApiResponse<List<WithTaskNvmfNamespaceSnapshot>> response = apiInstance.createNvmfNamespaceSnapshotWithHttpInfo(contentLanguage, nvmfNamespaceSnapshotCreationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceSnapshotApi#createNvmfNamespaceSnapshot");
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
 **nvmfNamespaceSnapshotCreationParams** | [**List&lt;NvmfNamespaceSnapshotCreationParams&gt;**](NvmfNamespaceSnapshotCreationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskNvmfNamespaceSnapshot&gt;**](WithTaskNvmfNamespaceSnapshot.md)>


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


## deleteNvmfNamespaceSnapshot

> List<WithTaskDeleteNvmfNamespaceSnapshot> deleteNvmfNamespaceSnapshot(contentLanguage, nvmfNamespaceSnapshotDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceSnapshotApi apiInstance = new NvmfNamespaceSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        NvmfNamespaceSnapshotDeletionParams nvmfNamespaceSnapshotDeletionParams = new NvmfNamespaceSnapshotDeletionParams(); // NvmfNamespaceSnapshotDeletionParams | 
        try {
            List<WithTaskDeleteNvmfNamespaceSnapshot> result = apiInstance.deleteNvmfNamespaceSnapshot(contentLanguage, nvmfNamespaceSnapshotDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceSnapshotApi#deleteNvmfNamespaceSnapshot");
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
 **nvmfNamespaceSnapshotDeletionParams** | [**NvmfNamespaceSnapshotDeletionParams**](NvmfNamespaceSnapshotDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteNvmfNamespaceSnapshot&gt;**](WithTaskDeleteNvmfNamespaceSnapshot.md)


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

## deleteNvmfNamespaceSnapshotWithHttpInfo

> ApiResponse<List<WithTaskDeleteNvmfNamespaceSnapshot>> deleteNvmfNamespaceSnapshot deleteNvmfNamespaceSnapshotWithHttpInfo(contentLanguage, nvmfNamespaceSnapshotDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceSnapshotApi apiInstance = new NvmfNamespaceSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        NvmfNamespaceSnapshotDeletionParams nvmfNamespaceSnapshotDeletionParams = new NvmfNamespaceSnapshotDeletionParams(); // NvmfNamespaceSnapshotDeletionParams | 
        try {
            ApiResponse<List<WithTaskDeleteNvmfNamespaceSnapshot>> response = apiInstance.deleteNvmfNamespaceSnapshotWithHttpInfo(contentLanguage, nvmfNamespaceSnapshotDeletionParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceSnapshotApi#deleteNvmfNamespaceSnapshot");
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
 **nvmfNamespaceSnapshotDeletionParams** | [**NvmfNamespaceSnapshotDeletionParams**](NvmfNamespaceSnapshotDeletionParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDeleteNvmfNamespaceSnapshot&gt;**](WithTaskDeleteNvmfNamespaceSnapshot.md)>


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


## getNvmfNamespaceSnapshots

> List<NvmfNamespaceSnapshot> getNvmfNamespaceSnapshots(contentLanguage, getNvmfNamespaceSnapshotsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceSnapshotApi apiInstance = new NvmfNamespaceSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetNvmfNamespaceSnapshotsRequestBody getNvmfNamespaceSnapshotsRequestBody = new GetNvmfNamespaceSnapshotsRequestBody(); // GetNvmfNamespaceSnapshotsRequestBody | 
        try {
            List<NvmfNamespaceSnapshot> result = apiInstance.getNvmfNamespaceSnapshots(contentLanguage, getNvmfNamespaceSnapshotsRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceSnapshotApi#getNvmfNamespaceSnapshots");
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
 **getNvmfNamespaceSnapshotsRequestBody** | [**GetNvmfNamespaceSnapshotsRequestBody**](GetNvmfNamespaceSnapshotsRequestBody.md)|  |

### Return type

[**List&lt;NvmfNamespaceSnapshot&gt;**](NvmfNamespaceSnapshot.md)


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

## getNvmfNamespaceSnapshotsWithHttpInfo

> ApiResponse<List<NvmfNamespaceSnapshot>> getNvmfNamespaceSnapshots getNvmfNamespaceSnapshotsWithHttpInfo(contentLanguage, getNvmfNamespaceSnapshotsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceSnapshotApi apiInstance = new NvmfNamespaceSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetNvmfNamespaceSnapshotsRequestBody getNvmfNamespaceSnapshotsRequestBody = new GetNvmfNamespaceSnapshotsRequestBody(); // GetNvmfNamespaceSnapshotsRequestBody | 
        try {
            ApiResponse<List<NvmfNamespaceSnapshot>> response = apiInstance.getNvmfNamespaceSnapshotsWithHttpInfo(contentLanguage, getNvmfNamespaceSnapshotsRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceSnapshotApi#getNvmfNamespaceSnapshots");
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
 **getNvmfNamespaceSnapshotsRequestBody** | [**GetNvmfNamespaceSnapshotsRequestBody**](GetNvmfNamespaceSnapshotsRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;NvmfNamespaceSnapshot&gt;**](NvmfNamespaceSnapshot.md)>


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


## getNvmfNamespaceSnapshotsConnection

> NvmfNamespaceSnapshotConnection getNvmfNamespaceSnapshotsConnection(contentLanguage, getNvmfNamespaceSnapshotsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceSnapshotApi apiInstance = new NvmfNamespaceSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetNvmfNamespaceSnapshotsConnectionRequestBody getNvmfNamespaceSnapshotsConnectionRequestBody = new GetNvmfNamespaceSnapshotsConnectionRequestBody(); // GetNvmfNamespaceSnapshotsConnectionRequestBody | 
        try {
            NvmfNamespaceSnapshotConnection result = apiInstance.getNvmfNamespaceSnapshotsConnection(contentLanguage, getNvmfNamespaceSnapshotsConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceSnapshotApi#getNvmfNamespaceSnapshotsConnection");
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
 **getNvmfNamespaceSnapshotsConnectionRequestBody** | [**GetNvmfNamespaceSnapshotsConnectionRequestBody**](GetNvmfNamespaceSnapshotsConnectionRequestBody.md)|  |

### Return type

[**NvmfNamespaceSnapshotConnection**](NvmfNamespaceSnapshotConnection.md)


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

## getNvmfNamespaceSnapshotsConnectionWithHttpInfo

> ApiResponse<NvmfNamespaceSnapshotConnection> getNvmfNamespaceSnapshotsConnection getNvmfNamespaceSnapshotsConnectionWithHttpInfo(contentLanguage, getNvmfNamespaceSnapshotsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NvmfNamespaceSnapshotApi apiInstance = new NvmfNamespaceSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetNvmfNamespaceSnapshotsConnectionRequestBody getNvmfNamespaceSnapshotsConnectionRequestBody = new GetNvmfNamespaceSnapshotsConnectionRequestBody(); // GetNvmfNamespaceSnapshotsConnectionRequestBody | 
        try {
            ApiResponse<NvmfNamespaceSnapshotConnection> response = apiInstance.getNvmfNamespaceSnapshotsConnectionWithHttpInfo(contentLanguage, getNvmfNamespaceSnapshotsConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NvmfNamespaceSnapshotApi#getNvmfNamespaceSnapshotsConnection");
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
 **getNvmfNamespaceSnapshotsConnectionRequestBody** | [**GetNvmfNamespaceSnapshotsConnectionRequestBody**](GetNvmfNamespaceSnapshotsConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**NvmfNamespaceSnapshotConnection**](NvmfNamespaceSnapshotConnection.md)>


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

