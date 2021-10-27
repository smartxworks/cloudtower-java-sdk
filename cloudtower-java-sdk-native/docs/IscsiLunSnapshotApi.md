# IscsiLunSnapshotApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIscsiLunSnapshot**](IscsiLunSnapshotApi.md#createIscsiLunSnapshot) | **POST** /create-iscsi-lun-snapshot | 
[**createIscsiLunSnapshotWithHttpInfo**](IscsiLunSnapshotApi.md#createIscsiLunSnapshotWithHttpInfo) | **POST** /create-iscsi-lun-snapshot | 
[**deleteIscsiLunSnapshot**](IscsiLunSnapshotApi.md#deleteIscsiLunSnapshot) | **POST** /delete-iscsi-lun-snapshot | 
[**deleteIscsiLunSnapshotWithHttpInfo**](IscsiLunSnapshotApi.md#deleteIscsiLunSnapshotWithHttpInfo) | **POST** /delete-iscsi-lun-snapshot | 
[**getIscsiLunSnapshots**](IscsiLunSnapshotApi.md#getIscsiLunSnapshots) | **POST** /get-iscsi-lun-snapshots | 
[**getIscsiLunSnapshotsWithHttpInfo**](IscsiLunSnapshotApi.md#getIscsiLunSnapshotsWithHttpInfo) | **POST** /get-iscsi-lun-snapshots | 
[**getIscsiLunSnapshotsConnection**](IscsiLunSnapshotApi.md#getIscsiLunSnapshotsConnection) | **POST** /get-iscsi-lun-snapshots-connection | 
[**getIscsiLunSnapshotsConnectionWithHttpInfo**](IscsiLunSnapshotApi.md#getIscsiLunSnapshotsConnectionWithHttpInfo) | **POST** /get-iscsi-lun-snapshots-connection | 



## createIscsiLunSnapshot

> List<WithTaskIscsiLunSnapshot> createIscsiLunSnapshot(contentLanguage, iscsiLunSnapshotCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunSnapshotApi apiInstance = new IscsiLunSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<IscsiLunSnapshotCreationParams> iscsiLunSnapshotCreationParams = Arrays.asList(); // List<IscsiLunSnapshotCreationParams> | 
        try {
            List<WithTaskIscsiLunSnapshot> result = apiInstance.createIscsiLunSnapshot(contentLanguage, iscsiLunSnapshotCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunSnapshotApi#createIscsiLunSnapshot");
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
 **iscsiLunSnapshotCreationParams** | [**List&lt;IscsiLunSnapshotCreationParams&gt;**](IscsiLunSnapshotCreationParams.md)|  |

### Return type

[**List&lt;WithTaskIscsiLunSnapshot&gt;**](WithTaskIscsiLunSnapshot.md)


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

## createIscsiLunSnapshotWithHttpInfo

> ApiResponse<List<WithTaskIscsiLunSnapshot>> createIscsiLunSnapshot createIscsiLunSnapshotWithHttpInfo(contentLanguage, iscsiLunSnapshotCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunSnapshotApi apiInstance = new IscsiLunSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<IscsiLunSnapshotCreationParams> iscsiLunSnapshotCreationParams = Arrays.asList(); // List<IscsiLunSnapshotCreationParams> | 
        try {
            ApiResponse<List<WithTaskIscsiLunSnapshot>> response = apiInstance.createIscsiLunSnapshotWithHttpInfo(contentLanguage, iscsiLunSnapshotCreationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunSnapshotApi#createIscsiLunSnapshot");
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
 **iscsiLunSnapshotCreationParams** | [**List&lt;IscsiLunSnapshotCreationParams&gt;**](IscsiLunSnapshotCreationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskIscsiLunSnapshot&gt;**](WithTaskIscsiLunSnapshot.md)>


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


## deleteIscsiLunSnapshot

> List<WithTaskDeleteIscsiLunSnapshot> deleteIscsiLunSnapshot(contentLanguage, iscsiLunSnapshotDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunSnapshotApi apiInstance = new IscsiLunSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        IscsiLunSnapshotDeletionParams iscsiLunSnapshotDeletionParams = new IscsiLunSnapshotDeletionParams(); // IscsiLunSnapshotDeletionParams | 
        try {
            List<WithTaskDeleteIscsiLunSnapshot> result = apiInstance.deleteIscsiLunSnapshot(contentLanguage, iscsiLunSnapshotDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunSnapshotApi#deleteIscsiLunSnapshot");
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
 **iscsiLunSnapshotDeletionParams** | [**IscsiLunSnapshotDeletionParams**](IscsiLunSnapshotDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteIscsiLunSnapshot&gt;**](WithTaskDeleteIscsiLunSnapshot.md)


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

## deleteIscsiLunSnapshotWithHttpInfo

> ApiResponse<List<WithTaskDeleteIscsiLunSnapshot>> deleteIscsiLunSnapshot deleteIscsiLunSnapshotWithHttpInfo(contentLanguage, iscsiLunSnapshotDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunSnapshotApi apiInstance = new IscsiLunSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        IscsiLunSnapshotDeletionParams iscsiLunSnapshotDeletionParams = new IscsiLunSnapshotDeletionParams(); // IscsiLunSnapshotDeletionParams | 
        try {
            ApiResponse<List<WithTaskDeleteIscsiLunSnapshot>> response = apiInstance.deleteIscsiLunSnapshotWithHttpInfo(contentLanguage, iscsiLunSnapshotDeletionParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunSnapshotApi#deleteIscsiLunSnapshot");
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
 **iscsiLunSnapshotDeletionParams** | [**IscsiLunSnapshotDeletionParams**](IscsiLunSnapshotDeletionParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDeleteIscsiLunSnapshot&gt;**](WithTaskDeleteIscsiLunSnapshot.md)>


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


## getIscsiLunSnapshots

> List<IscsiLunSnapshot> getIscsiLunSnapshots(contentLanguage, getIscsiLunSnapshotsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunSnapshotApi apiInstance = new IscsiLunSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetIscsiLunSnapshotsRequestBody getIscsiLunSnapshotsRequestBody = new GetIscsiLunSnapshotsRequestBody(); // GetIscsiLunSnapshotsRequestBody | 
        try {
            List<IscsiLunSnapshot> result = apiInstance.getIscsiLunSnapshots(contentLanguage, getIscsiLunSnapshotsRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunSnapshotApi#getIscsiLunSnapshots");
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
 **getIscsiLunSnapshotsRequestBody** | [**GetIscsiLunSnapshotsRequestBody**](GetIscsiLunSnapshotsRequestBody.md)|  |

### Return type

[**List&lt;IscsiLunSnapshot&gt;**](IscsiLunSnapshot.md)


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

## getIscsiLunSnapshotsWithHttpInfo

> ApiResponse<List<IscsiLunSnapshot>> getIscsiLunSnapshots getIscsiLunSnapshotsWithHttpInfo(contentLanguage, getIscsiLunSnapshotsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunSnapshotApi apiInstance = new IscsiLunSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetIscsiLunSnapshotsRequestBody getIscsiLunSnapshotsRequestBody = new GetIscsiLunSnapshotsRequestBody(); // GetIscsiLunSnapshotsRequestBody | 
        try {
            ApiResponse<List<IscsiLunSnapshot>> response = apiInstance.getIscsiLunSnapshotsWithHttpInfo(contentLanguage, getIscsiLunSnapshotsRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunSnapshotApi#getIscsiLunSnapshots");
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
 **getIscsiLunSnapshotsRequestBody** | [**GetIscsiLunSnapshotsRequestBody**](GetIscsiLunSnapshotsRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;IscsiLunSnapshot&gt;**](IscsiLunSnapshot.md)>


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


## getIscsiLunSnapshotsConnection

> IscsiLunSnapshotConnection getIscsiLunSnapshotsConnection(contentLanguage, getIscsiLunSnapshotsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunSnapshotApi apiInstance = new IscsiLunSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetIscsiLunSnapshotsConnectionRequestBody getIscsiLunSnapshotsConnectionRequestBody = new GetIscsiLunSnapshotsConnectionRequestBody(); // GetIscsiLunSnapshotsConnectionRequestBody | 
        try {
            IscsiLunSnapshotConnection result = apiInstance.getIscsiLunSnapshotsConnection(contentLanguage, getIscsiLunSnapshotsConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunSnapshotApi#getIscsiLunSnapshotsConnection");
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
 **getIscsiLunSnapshotsConnectionRequestBody** | [**GetIscsiLunSnapshotsConnectionRequestBody**](GetIscsiLunSnapshotsConnectionRequestBody.md)|  |

### Return type

[**IscsiLunSnapshotConnection**](IscsiLunSnapshotConnection.md)


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

## getIscsiLunSnapshotsConnectionWithHttpInfo

> ApiResponse<IscsiLunSnapshotConnection> getIscsiLunSnapshotsConnection getIscsiLunSnapshotsConnectionWithHttpInfo(contentLanguage, getIscsiLunSnapshotsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunSnapshotApi apiInstance = new IscsiLunSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetIscsiLunSnapshotsConnectionRequestBody getIscsiLunSnapshotsConnectionRequestBody = new GetIscsiLunSnapshotsConnectionRequestBody(); // GetIscsiLunSnapshotsConnectionRequestBody | 
        try {
            ApiResponse<IscsiLunSnapshotConnection> response = apiInstance.getIscsiLunSnapshotsConnectionWithHttpInfo(contentLanguage, getIscsiLunSnapshotsConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunSnapshotApi#getIscsiLunSnapshotsConnection");
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
 **getIscsiLunSnapshotsConnectionRequestBody** | [**GetIscsiLunSnapshotsConnectionRequestBody**](GetIscsiLunSnapshotsConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**IscsiLunSnapshotConnection**](IscsiLunSnapshotConnection.md)>


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

