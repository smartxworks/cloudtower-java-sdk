# ConsistencyGroupSnapshotApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConsistencyGroupSnapshot**](ConsistencyGroupSnapshotApi.md#createConsistencyGroupSnapshot) | **POST** /create-consistency-snapshot-group | 
[**createConsistencyGroupSnapshotWithHttpInfo**](ConsistencyGroupSnapshotApi.md#createConsistencyGroupSnapshotWithHttpInfo) | **POST** /create-consistency-snapshot-group | 
[**deleteConsistencyGroupSnapshot**](ConsistencyGroupSnapshotApi.md#deleteConsistencyGroupSnapshot) | **POST** /delete-consistency-snapshot-group | 
[**deleteConsistencyGroupSnapshotWithHttpInfo**](ConsistencyGroupSnapshotApi.md#deleteConsistencyGroupSnapshotWithHttpInfo) | **POST** /delete-consistency-snapshot-group | 
[**getConsistencyGroupSnapshots**](ConsistencyGroupSnapshotApi.md#getConsistencyGroupSnapshots) | **POST** /get-consistency-group-snapshots | 
[**getConsistencyGroupSnapshotsWithHttpInfo**](ConsistencyGroupSnapshotApi.md#getConsistencyGroupSnapshotsWithHttpInfo) | **POST** /get-consistency-group-snapshots | 
[**getConsistencyGroupSnapshotsConnection**](ConsistencyGroupSnapshotApi.md#getConsistencyGroupSnapshotsConnection) | **POST** /get-consistency-group-snapshots-connection | 
[**getConsistencyGroupSnapshotsConnectionWithHttpInfo**](ConsistencyGroupSnapshotApi.md#getConsistencyGroupSnapshotsConnectionWithHttpInfo) | **POST** /get-consistency-group-snapshots-connection | 
[**updateConsistencyGroupSnapshot**](ConsistencyGroupSnapshotApi.md#updateConsistencyGroupSnapshot) | **POST** /rollback-consistency-snapshot-group | 
[**updateConsistencyGroupSnapshotWithHttpInfo**](ConsistencyGroupSnapshotApi.md#updateConsistencyGroupSnapshotWithHttpInfo) | **POST** /rollback-consistency-snapshot-group | 



## createConsistencyGroupSnapshot

> List<WithTaskConsistencyGroupSnapshot> createConsistencyGroupSnapshot(contentLanguage, consistencyGroupSnapshotCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ConsistencyGroupSnapshotApi apiInstance = new ConsistencyGroupSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<ConsistencyGroupSnapshotCreationParams> consistencyGroupSnapshotCreationParams = Arrays.asList(); // List<ConsistencyGroupSnapshotCreationParams> | 
        try {
            List<WithTaskConsistencyGroupSnapshot> result = apiInstance.createConsistencyGroupSnapshot(contentLanguage, consistencyGroupSnapshotCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyGroupSnapshotApi#createConsistencyGroupSnapshot");
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
 **consistencyGroupSnapshotCreationParams** | [**List&lt;ConsistencyGroupSnapshotCreationParams&gt;**](ConsistencyGroupSnapshotCreationParams.md)|  |

### Return type

[**List&lt;WithTaskConsistencyGroupSnapshot&gt;**](WithTaskConsistencyGroupSnapshot.md)


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

## createConsistencyGroupSnapshotWithHttpInfo

> ApiResponse<List<WithTaskConsistencyGroupSnapshot>> createConsistencyGroupSnapshot createConsistencyGroupSnapshotWithHttpInfo(contentLanguage, consistencyGroupSnapshotCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ConsistencyGroupSnapshotApi apiInstance = new ConsistencyGroupSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<ConsistencyGroupSnapshotCreationParams> consistencyGroupSnapshotCreationParams = Arrays.asList(); // List<ConsistencyGroupSnapshotCreationParams> | 
        try {
            ApiResponse<List<WithTaskConsistencyGroupSnapshot>> response = apiInstance.createConsistencyGroupSnapshotWithHttpInfo(contentLanguage, consistencyGroupSnapshotCreationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyGroupSnapshotApi#createConsistencyGroupSnapshot");
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
 **consistencyGroupSnapshotCreationParams** | [**List&lt;ConsistencyGroupSnapshotCreationParams&gt;**](ConsistencyGroupSnapshotCreationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskConsistencyGroupSnapshot&gt;**](WithTaskConsistencyGroupSnapshot.md)>


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


## deleteConsistencyGroupSnapshot

> List<WithTaskDeleteConsistencyGroupSnapshot> deleteConsistencyGroupSnapshot(contentLanguage, consistencyGroupSnapshotDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ConsistencyGroupSnapshotApi apiInstance = new ConsistencyGroupSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        ConsistencyGroupSnapshotDeletionParams consistencyGroupSnapshotDeletionParams = new ConsistencyGroupSnapshotDeletionParams(); // ConsistencyGroupSnapshotDeletionParams | 
        try {
            List<WithTaskDeleteConsistencyGroupSnapshot> result = apiInstance.deleteConsistencyGroupSnapshot(contentLanguage, consistencyGroupSnapshotDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyGroupSnapshotApi#deleteConsistencyGroupSnapshot");
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
 **consistencyGroupSnapshotDeletionParams** | [**ConsistencyGroupSnapshotDeletionParams**](ConsistencyGroupSnapshotDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteConsistencyGroupSnapshot&gt;**](WithTaskDeleteConsistencyGroupSnapshot.md)


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

## deleteConsistencyGroupSnapshotWithHttpInfo

> ApiResponse<List<WithTaskDeleteConsistencyGroupSnapshot>> deleteConsistencyGroupSnapshot deleteConsistencyGroupSnapshotWithHttpInfo(contentLanguage, consistencyGroupSnapshotDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ConsistencyGroupSnapshotApi apiInstance = new ConsistencyGroupSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        ConsistencyGroupSnapshotDeletionParams consistencyGroupSnapshotDeletionParams = new ConsistencyGroupSnapshotDeletionParams(); // ConsistencyGroupSnapshotDeletionParams | 
        try {
            ApiResponse<List<WithTaskDeleteConsistencyGroupSnapshot>> response = apiInstance.deleteConsistencyGroupSnapshotWithHttpInfo(contentLanguage, consistencyGroupSnapshotDeletionParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyGroupSnapshotApi#deleteConsistencyGroupSnapshot");
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
 **consistencyGroupSnapshotDeletionParams** | [**ConsistencyGroupSnapshotDeletionParams**](ConsistencyGroupSnapshotDeletionParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDeleteConsistencyGroupSnapshot&gt;**](WithTaskDeleteConsistencyGroupSnapshot.md)>


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


## getConsistencyGroupSnapshots

> List<ConsistencyGroupSnapshot> getConsistencyGroupSnapshots(contentLanguage, getConsistencyGroupSnapshotsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ConsistencyGroupSnapshotApi apiInstance = new ConsistencyGroupSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetConsistencyGroupSnapshotsRequestBody getConsistencyGroupSnapshotsRequestBody = new GetConsistencyGroupSnapshotsRequestBody(); // GetConsistencyGroupSnapshotsRequestBody | 
        try {
            List<ConsistencyGroupSnapshot> result = apiInstance.getConsistencyGroupSnapshots(contentLanguage, getConsistencyGroupSnapshotsRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyGroupSnapshotApi#getConsistencyGroupSnapshots");
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
 **getConsistencyGroupSnapshotsRequestBody** | [**GetConsistencyGroupSnapshotsRequestBody**](GetConsistencyGroupSnapshotsRequestBody.md)|  |

### Return type

[**List&lt;ConsistencyGroupSnapshot&gt;**](ConsistencyGroupSnapshot.md)


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

## getConsistencyGroupSnapshotsWithHttpInfo

> ApiResponse<List<ConsistencyGroupSnapshot>> getConsistencyGroupSnapshots getConsistencyGroupSnapshotsWithHttpInfo(contentLanguage, getConsistencyGroupSnapshotsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ConsistencyGroupSnapshotApi apiInstance = new ConsistencyGroupSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetConsistencyGroupSnapshotsRequestBody getConsistencyGroupSnapshotsRequestBody = new GetConsistencyGroupSnapshotsRequestBody(); // GetConsistencyGroupSnapshotsRequestBody | 
        try {
            ApiResponse<List<ConsistencyGroupSnapshot>> response = apiInstance.getConsistencyGroupSnapshotsWithHttpInfo(contentLanguage, getConsistencyGroupSnapshotsRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyGroupSnapshotApi#getConsistencyGroupSnapshots");
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
 **getConsistencyGroupSnapshotsRequestBody** | [**GetConsistencyGroupSnapshotsRequestBody**](GetConsistencyGroupSnapshotsRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;ConsistencyGroupSnapshot&gt;**](ConsistencyGroupSnapshot.md)>


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


## getConsistencyGroupSnapshotsConnection

> ConsistencyGroupSnapshotConnection getConsistencyGroupSnapshotsConnection(contentLanguage, getConsistencyGroupSnapshotsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ConsistencyGroupSnapshotApi apiInstance = new ConsistencyGroupSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetConsistencyGroupSnapshotsConnectionRequestBody getConsistencyGroupSnapshotsConnectionRequestBody = new GetConsistencyGroupSnapshotsConnectionRequestBody(); // GetConsistencyGroupSnapshotsConnectionRequestBody | 
        try {
            ConsistencyGroupSnapshotConnection result = apiInstance.getConsistencyGroupSnapshotsConnection(contentLanguage, getConsistencyGroupSnapshotsConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyGroupSnapshotApi#getConsistencyGroupSnapshotsConnection");
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
 **getConsistencyGroupSnapshotsConnectionRequestBody** | [**GetConsistencyGroupSnapshotsConnectionRequestBody**](GetConsistencyGroupSnapshotsConnectionRequestBody.md)|  |

### Return type

[**ConsistencyGroupSnapshotConnection**](ConsistencyGroupSnapshotConnection.md)


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

## getConsistencyGroupSnapshotsConnectionWithHttpInfo

> ApiResponse<ConsistencyGroupSnapshotConnection> getConsistencyGroupSnapshotsConnection getConsistencyGroupSnapshotsConnectionWithHttpInfo(contentLanguage, getConsistencyGroupSnapshotsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ConsistencyGroupSnapshotApi apiInstance = new ConsistencyGroupSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetConsistencyGroupSnapshotsConnectionRequestBody getConsistencyGroupSnapshotsConnectionRequestBody = new GetConsistencyGroupSnapshotsConnectionRequestBody(); // GetConsistencyGroupSnapshotsConnectionRequestBody | 
        try {
            ApiResponse<ConsistencyGroupSnapshotConnection> response = apiInstance.getConsistencyGroupSnapshotsConnectionWithHttpInfo(contentLanguage, getConsistencyGroupSnapshotsConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyGroupSnapshotApi#getConsistencyGroupSnapshotsConnection");
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
 **getConsistencyGroupSnapshotsConnectionRequestBody** | [**GetConsistencyGroupSnapshotsConnectionRequestBody**](GetConsistencyGroupSnapshotsConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**ConsistencyGroupSnapshotConnection**](ConsistencyGroupSnapshotConnection.md)>


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


## updateConsistencyGroupSnapshot

> List<WithTaskConsistencyGroupSnapshot> updateConsistencyGroupSnapshot(contentLanguage, consistencyGroupSnapshotUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ConsistencyGroupSnapshotApi apiInstance = new ConsistencyGroupSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        ConsistencyGroupSnapshotUpdationParams consistencyGroupSnapshotUpdationParams = new ConsistencyGroupSnapshotUpdationParams(); // ConsistencyGroupSnapshotUpdationParams | 
        try {
            List<WithTaskConsistencyGroupSnapshot> result = apiInstance.updateConsistencyGroupSnapshot(contentLanguage, consistencyGroupSnapshotUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyGroupSnapshotApi#updateConsistencyGroupSnapshot");
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
 **consistencyGroupSnapshotUpdationParams** | [**ConsistencyGroupSnapshotUpdationParams**](ConsistencyGroupSnapshotUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskConsistencyGroupSnapshot&gt;**](WithTaskConsistencyGroupSnapshot.md)


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

## updateConsistencyGroupSnapshotWithHttpInfo

> ApiResponse<List<WithTaskConsistencyGroupSnapshot>> updateConsistencyGroupSnapshot updateConsistencyGroupSnapshotWithHttpInfo(contentLanguage, consistencyGroupSnapshotUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ConsistencyGroupSnapshotApi apiInstance = new ConsistencyGroupSnapshotApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        ConsistencyGroupSnapshotUpdationParams consistencyGroupSnapshotUpdationParams = new ConsistencyGroupSnapshotUpdationParams(); // ConsistencyGroupSnapshotUpdationParams | 
        try {
            ApiResponse<List<WithTaskConsistencyGroupSnapshot>> response = apiInstance.updateConsistencyGroupSnapshotWithHttpInfo(contentLanguage, consistencyGroupSnapshotUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyGroupSnapshotApi#updateConsistencyGroupSnapshot");
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
 **consistencyGroupSnapshotUpdationParams** | [**ConsistencyGroupSnapshotUpdationParams**](ConsistencyGroupSnapshotUpdationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskConsistencyGroupSnapshot&gt;**](WithTaskConsistencyGroupSnapshot.md)>


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

