# VmSnapshotApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVmSnapshot**](VmSnapshotApi.md#createVmSnapshot) | **POST** /create-vm-snapshot | 
[**createVmSnapshotWithHttpInfo**](VmSnapshotApi.md#createVmSnapshotWithHttpInfo) | **POST** /create-vm-snapshot | 
[**deleteVmSnapshot**](VmSnapshotApi.md#deleteVmSnapshot) | **POST** /delete-vm-snapshot | 
[**deleteVmSnapshotWithHttpInfo**](VmSnapshotApi.md#deleteVmSnapshotWithHttpInfo) | **POST** /delete-vm-snapshot | 
[**getVmSnapshots**](VmSnapshotApi.md#getVmSnapshots) | **POST** /get-vm-snapshots | 
[**getVmSnapshotsWithHttpInfo**](VmSnapshotApi.md#getVmSnapshotsWithHttpInfo) | **POST** /get-vm-snapshots | 
[**getVmSnapshotsConnection**](VmSnapshotApi.md#getVmSnapshotsConnection) | **POST** /get-vm-snapshots-connection | 
[**getVmSnapshotsConnectionWithHttpInfo**](VmSnapshotApi.md#getVmSnapshotsConnectionWithHttpInfo) | **POST** /get-vm-snapshots-connection | 



## createVmSnapshot

> List<WithTaskVmSnapshot> createVmSnapshot(contentLanguage, vmSnapshotCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmSnapshotApi apiInstance = new VmSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        VmSnapshotCreationParams vmSnapshotCreationParams = new VmSnapshotCreationParams(); // VmSnapshotCreationParams | 
        try {
            List<WithTaskVmSnapshot> result = apiInstance.createVmSnapshot(contentLanguage, vmSnapshotCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmSnapshotApi#createVmSnapshot");
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
 **vmSnapshotCreationParams** | [**VmSnapshotCreationParams**](VmSnapshotCreationParams.md)|  |

### Return type

[**List&lt;WithTaskVmSnapshot&gt;**](WithTaskVmSnapshot.md)


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

## createVmSnapshotWithHttpInfo

> ApiResponse<List<WithTaskVmSnapshot>> createVmSnapshot createVmSnapshotWithHttpInfo(contentLanguage, vmSnapshotCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmSnapshotApi apiInstance = new VmSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        VmSnapshotCreationParams vmSnapshotCreationParams = new VmSnapshotCreationParams(); // VmSnapshotCreationParams | 
        try {
            ApiResponse<List<WithTaskVmSnapshot>> response = apiInstance.createVmSnapshotWithHttpInfo(contentLanguage, vmSnapshotCreationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmSnapshotApi#createVmSnapshot");
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
 **vmSnapshotCreationParams** | [**VmSnapshotCreationParams**](VmSnapshotCreationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskVmSnapshot&gt;**](WithTaskVmSnapshot.md)>


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


## deleteVmSnapshot

> List<WithTaskDeleteVmSnapshot> deleteVmSnapshot(contentLanguage, vmSnapshotDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmSnapshotApi apiInstance = new VmSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        VmSnapshotDeletionParams vmSnapshotDeletionParams = new VmSnapshotDeletionParams(); // VmSnapshotDeletionParams | 
        try {
            List<WithTaskDeleteVmSnapshot> result = apiInstance.deleteVmSnapshot(contentLanguage, vmSnapshotDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmSnapshotApi#deleteVmSnapshot");
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
 **vmSnapshotDeletionParams** | [**VmSnapshotDeletionParams**](VmSnapshotDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteVmSnapshot&gt;**](WithTaskDeleteVmSnapshot.md)


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

## deleteVmSnapshotWithHttpInfo

> ApiResponse<List<WithTaskDeleteVmSnapshot>> deleteVmSnapshot deleteVmSnapshotWithHttpInfo(contentLanguage, vmSnapshotDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmSnapshotApi apiInstance = new VmSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        VmSnapshotDeletionParams vmSnapshotDeletionParams = new VmSnapshotDeletionParams(); // VmSnapshotDeletionParams | 
        try {
            ApiResponse<List<WithTaskDeleteVmSnapshot>> response = apiInstance.deleteVmSnapshotWithHttpInfo(contentLanguage, vmSnapshotDeletionParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmSnapshotApi#deleteVmSnapshot");
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
 **vmSnapshotDeletionParams** | [**VmSnapshotDeletionParams**](VmSnapshotDeletionParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDeleteVmSnapshot&gt;**](WithTaskDeleteVmSnapshot.md)>


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


## getVmSnapshots

> List<VmSnapshot> getVmSnapshots(contentLanguage, getVmSnapshotsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmSnapshotApi apiInstance = new VmSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmSnapshotsRequestBody getVmSnapshotsRequestBody = new GetVmSnapshotsRequestBody(); // GetVmSnapshotsRequestBody | 
        try {
            List<VmSnapshot> result = apiInstance.getVmSnapshots(contentLanguage, getVmSnapshotsRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmSnapshotApi#getVmSnapshots");
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
 **getVmSnapshotsRequestBody** | [**GetVmSnapshotsRequestBody**](GetVmSnapshotsRequestBody.md)|  |

### Return type

[**List&lt;VmSnapshot&gt;**](VmSnapshot.md)


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

## getVmSnapshotsWithHttpInfo

> ApiResponse<List<VmSnapshot>> getVmSnapshots getVmSnapshotsWithHttpInfo(contentLanguage, getVmSnapshotsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmSnapshotApi apiInstance = new VmSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmSnapshotsRequestBody getVmSnapshotsRequestBody = new GetVmSnapshotsRequestBody(); // GetVmSnapshotsRequestBody | 
        try {
            ApiResponse<List<VmSnapshot>> response = apiInstance.getVmSnapshotsWithHttpInfo(contentLanguage, getVmSnapshotsRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmSnapshotApi#getVmSnapshots");
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
 **getVmSnapshotsRequestBody** | [**GetVmSnapshotsRequestBody**](GetVmSnapshotsRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;VmSnapshot&gt;**](VmSnapshot.md)>


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


## getVmSnapshotsConnection

> VmSnapshotConnection getVmSnapshotsConnection(contentLanguage, getVmSnapshotsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmSnapshotApi apiInstance = new VmSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmSnapshotsConnectionRequestBody getVmSnapshotsConnectionRequestBody = new GetVmSnapshotsConnectionRequestBody(); // GetVmSnapshotsConnectionRequestBody | 
        try {
            VmSnapshotConnection result = apiInstance.getVmSnapshotsConnection(contentLanguage, getVmSnapshotsConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmSnapshotApi#getVmSnapshotsConnection");
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
 **getVmSnapshotsConnectionRequestBody** | [**GetVmSnapshotsConnectionRequestBody**](GetVmSnapshotsConnectionRequestBody.md)|  |

### Return type

[**VmSnapshotConnection**](VmSnapshotConnection.md)


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

## getVmSnapshotsConnectionWithHttpInfo

> ApiResponse<VmSnapshotConnection> getVmSnapshotsConnection getVmSnapshotsConnectionWithHttpInfo(contentLanguage, getVmSnapshotsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmSnapshotApi apiInstance = new VmSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmSnapshotsConnectionRequestBody getVmSnapshotsConnectionRequestBody = new GetVmSnapshotsConnectionRequestBody(); // GetVmSnapshotsConnectionRequestBody | 
        try {
            ApiResponse<VmSnapshotConnection> response = apiInstance.getVmSnapshotsConnectionWithHttpInfo(contentLanguage, getVmSnapshotsConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmSnapshotApi#getVmSnapshotsConnection");
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
 **getVmSnapshotsConnectionRequestBody** | [**GetVmSnapshotsConnectionRequestBody**](GetVmSnapshotsConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**VmSnapshotConnection**](VmSnapshotConnection.md)>


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

