# IscsiLunApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneIscsiLunFromSnapshot**](IscsiLunApi.md#cloneIscsiLunFromSnapshot) | **POST** /clone-iscsi-lun-from-snapshot | 
[**cloneIscsiLunFromSnapshotWithHttpInfo**](IscsiLunApi.md#cloneIscsiLunFromSnapshotWithHttpInfo) | **POST** /clone-iscsi-lun-from-snapshot | 
[**createIscsiLun**](IscsiLunApi.md#createIscsiLun) | **POST** /create-iscsi-lun | 
[**createIscsiLunWithHttpInfo**](IscsiLunApi.md#createIscsiLunWithHttpInfo) | **POST** /create-iscsi-lun | 
[**deleteIscsiLun**](IscsiLunApi.md#deleteIscsiLun) | **POST** /delete-iscsi-lun | 
[**deleteIscsiLunWithHttpInfo**](IscsiLunApi.md#deleteIscsiLunWithHttpInfo) | **POST** /delete-iscsi-lun | 
[**getIscsiLuns**](IscsiLunApi.md#getIscsiLuns) | **POST** /get-iscsi-luns | 
[**getIscsiLunsWithHttpInfo**](IscsiLunApi.md#getIscsiLunsWithHttpInfo) | **POST** /get-iscsi-luns | 
[**getIscsiLunsConnection**](IscsiLunApi.md#getIscsiLunsConnection) | **POST** /get-iscsi-luns-connection | 
[**getIscsiLunsConnectionWithHttpInfo**](IscsiLunApi.md#getIscsiLunsConnectionWithHttpInfo) | **POST** /get-iscsi-luns-connection | 
[**rollbackIscsiLunFromSnapshot**](IscsiLunApi.md#rollbackIscsiLunFromSnapshot) | **POST** /rollback-iscsi-lun-from-snapshot | 
[**rollbackIscsiLunFromSnapshotWithHttpInfo**](IscsiLunApi.md#rollbackIscsiLunFromSnapshotWithHttpInfo) | **POST** /rollback-iscsi-lun-from-snapshot | 
[**updateIscsiLun**](IscsiLunApi.md#updateIscsiLun) | **POST** /update-iscsi-lun | 
[**updateIscsiLunWithHttpInfo**](IscsiLunApi.md#updateIscsiLunWithHttpInfo) | **POST** /update-iscsi-lun | 



## cloneIscsiLunFromSnapshot

> List<WithTaskIscsiLun> cloneIscsiLunFromSnapshot(contentLanguage, iscsiLunCloneParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<IscsiLunCloneParams> iscsiLunCloneParams = Arrays.asList(); // List<IscsiLunCloneParams> | 
        try {
            List<WithTaskIscsiLun> result = apiInstance.cloneIscsiLunFromSnapshot(contentLanguage, iscsiLunCloneParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunApi#cloneIscsiLunFromSnapshot");
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
 **iscsiLunCloneParams** | [**List&lt;IscsiLunCloneParams&gt;**](IscsiLunCloneParams.md)|  |

### Return type

[**List&lt;WithTaskIscsiLun&gt;**](WithTaskIscsiLun.md)


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

## cloneIscsiLunFromSnapshotWithHttpInfo

> ApiResponse<List<WithTaskIscsiLun>> cloneIscsiLunFromSnapshot cloneIscsiLunFromSnapshotWithHttpInfo(contentLanguage, iscsiLunCloneParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<IscsiLunCloneParams> iscsiLunCloneParams = Arrays.asList(); // List<IscsiLunCloneParams> | 
        try {
            ApiResponse<List<WithTaskIscsiLun>> response = apiInstance.cloneIscsiLunFromSnapshotWithHttpInfo(contentLanguage, iscsiLunCloneParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunApi#cloneIscsiLunFromSnapshot");
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
 **iscsiLunCloneParams** | [**List&lt;IscsiLunCloneParams&gt;**](IscsiLunCloneParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskIscsiLun&gt;**](WithTaskIscsiLun.md)>


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


## createIscsiLun

> List<WithTaskIscsiLun> createIscsiLun(contentLanguage, iscsiLunCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<IscsiLunCreationParams> iscsiLunCreationParams = Arrays.asList(); // List<IscsiLunCreationParams> | 
        try {
            List<WithTaskIscsiLun> result = apiInstance.createIscsiLun(contentLanguage, iscsiLunCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunApi#createIscsiLun");
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
 **iscsiLunCreationParams** | [**List&lt;IscsiLunCreationParams&gt;**](IscsiLunCreationParams.md)|  |

### Return type

[**List&lt;WithTaskIscsiLun&gt;**](WithTaskIscsiLun.md)


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

## createIscsiLunWithHttpInfo

> ApiResponse<List<WithTaskIscsiLun>> createIscsiLun createIscsiLunWithHttpInfo(contentLanguage, iscsiLunCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<IscsiLunCreationParams> iscsiLunCreationParams = Arrays.asList(); // List<IscsiLunCreationParams> | 
        try {
            ApiResponse<List<WithTaskIscsiLun>> response = apiInstance.createIscsiLunWithHttpInfo(contentLanguage, iscsiLunCreationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunApi#createIscsiLun");
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
 **iscsiLunCreationParams** | [**List&lt;IscsiLunCreationParams&gt;**](IscsiLunCreationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskIscsiLun&gt;**](WithTaskIscsiLun.md)>


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


## deleteIscsiLun

> List<WithTaskDeleteIscsiLun> deleteIscsiLun(contentLanguage, iscsiLunDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        IscsiLunDeletionParams iscsiLunDeletionParams = new IscsiLunDeletionParams(); // IscsiLunDeletionParams | 
        try {
            List<WithTaskDeleteIscsiLun> result = apiInstance.deleteIscsiLun(contentLanguage, iscsiLunDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunApi#deleteIscsiLun");
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
 **iscsiLunDeletionParams** | [**IscsiLunDeletionParams**](IscsiLunDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteIscsiLun&gt;**](WithTaskDeleteIscsiLun.md)


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

## deleteIscsiLunWithHttpInfo

> ApiResponse<List<WithTaskDeleteIscsiLun>> deleteIscsiLun deleteIscsiLunWithHttpInfo(contentLanguage, iscsiLunDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        IscsiLunDeletionParams iscsiLunDeletionParams = new IscsiLunDeletionParams(); // IscsiLunDeletionParams | 
        try {
            ApiResponse<List<WithTaskDeleteIscsiLun>> response = apiInstance.deleteIscsiLunWithHttpInfo(contentLanguage, iscsiLunDeletionParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunApi#deleteIscsiLun");
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
 **iscsiLunDeletionParams** | [**IscsiLunDeletionParams**](IscsiLunDeletionParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDeleteIscsiLun&gt;**](WithTaskDeleteIscsiLun.md)>


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


## getIscsiLuns

> List<IscsiLun> getIscsiLuns(contentLanguage, getIscsiLunsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetIscsiLunsRequestBody getIscsiLunsRequestBody = new GetIscsiLunsRequestBody(); // GetIscsiLunsRequestBody | 
        try {
            List<IscsiLun> result = apiInstance.getIscsiLuns(contentLanguage, getIscsiLunsRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunApi#getIscsiLuns");
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
 **getIscsiLunsRequestBody** | [**GetIscsiLunsRequestBody**](GetIscsiLunsRequestBody.md)|  |

### Return type

[**List&lt;IscsiLun&gt;**](IscsiLun.md)


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

## getIscsiLunsWithHttpInfo

> ApiResponse<List<IscsiLun>> getIscsiLuns getIscsiLunsWithHttpInfo(contentLanguage, getIscsiLunsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetIscsiLunsRequestBody getIscsiLunsRequestBody = new GetIscsiLunsRequestBody(); // GetIscsiLunsRequestBody | 
        try {
            ApiResponse<List<IscsiLun>> response = apiInstance.getIscsiLunsWithHttpInfo(contentLanguage, getIscsiLunsRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunApi#getIscsiLuns");
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
 **getIscsiLunsRequestBody** | [**GetIscsiLunsRequestBody**](GetIscsiLunsRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;IscsiLun&gt;**](IscsiLun.md)>


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


## getIscsiLunsConnection

> IscsiLunConnection getIscsiLunsConnection(contentLanguage, getIscsiLunsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetIscsiLunsConnectionRequestBody getIscsiLunsConnectionRequestBody = new GetIscsiLunsConnectionRequestBody(); // GetIscsiLunsConnectionRequestBody | 
        try {
            IscsiLunConnection result = apiInstance.getIscsiLunsConnection(contentLanguage, getIscsiLunsConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunApi#getIscsiLunsConnection");
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
 **getIscsiLunsConnectionRequestBody** | [**GetIscsiLunsConnectionRequestBody**](GetIscsiLunsConnectionRequestBody.md)|  |

### Return type

[**IscsiLunConnection**](IscsiLunConnection.md)


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

## getIscsiLunsConnectionWithHttpInfo

> ApiResponse<IscsiLunConnection> getIscsiLunsConnection getIscsiLunsConnectionWithHttpInfo(contentLanguage, getIscsiLunsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetIscsiLunsConnectionRequestBody getIscsiLunsConnectionRequestBody = new GetIscsiLunsConnectionRequestBody(); // GetIscsiLunsConnectionRequestBody | 
        try {
            ApiResponse<IscsiLunConnection> response = apiInstance.getIscsiLunsConnectionWithHttpInfo(contentLanguage, getIscsiLunsConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunApi#getIscsiLunsConnection");
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
 **getIscsiLunsConnectionRequestBody** | [**GetIscsiLunsConnectionRequestBody**](GetIscsiLunsConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**IscsiLunConnection**](IscsiLunConnection.md)>


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


## rollbackIscsiLunFromSnapshot

> List<WithTaskIscsiLun> rollbackIscsiLunFromSnapshot(contentLanguage, iscsiLunRollbackParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<IscsiLunRollbackParams> iscsiLunRollbackParams = Arrays.asList(); // List<IscsiLunRollbackParams> | 
        try {
            List<WithTaskIscsiLun> result = apiInstance.rollbackIscsiLunFromSnapshot(contentLanguage, iscsiLunRollbackParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunApi#rollbackIscsiLunFromSnapshot");
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
 **iscsiLunRollbackParams** | [**List&lt;IscsiLunRollbackParams&gt;**](IscsiLunRollbackParams.md)|  |

### Return type

[**List&lt;WithTaskIscsiLun&gt;**](WithTaskIscsiLun.md)


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

## rollbackIscsiLunFromSnapshotWithHttpInfo

> ApiResponse<List<WithTaskIscsiLun>> rollbackIscsiLunFromSnapshot rollbackIscsiLunFromSnapshotWithHttpInfo(contentLanguage, iscsiLunRollbackParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<IscsiLunRollbackParams> iscsiLunRollbackParams = Arrays.asList(); // List<IscsiLunRollbackParams> | 
        try {
            ApiResponse<List<WithTaskIscsiLun>> response = apiInstance.rollbackIscsiLunFromSnapshotWithHttpInfo(contentLanguage, iscsiLunRollbackParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunApi#rollbackIscsiLunFromSnapshot");
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
 **iscsiLunRollbackParams** | [**List&lt;IscsiLunRollbackParams&gt;**](IscsiLunRollbackParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskIscsiLun&gt;**](WithTaskIscsiLun.md)>


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


## updateIscsiLun

> List<WithTaskIscsiLun> updateIscsiLun(contentLanguage, iscsiLunUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        IscsiLunUpdationParams iscsiLunUpdationParams = new IscsiLunUpdationParams(); // IscsiLunUpdationParams | 
        try {
            List<WithTaskIscsiLun> result = apiInstance.updateIscsiLun(contentLanguage, iscsiLunUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunApi#updateIscsiLun");
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
 **iscsiLunUpdationParams** | [**IscsiLunUpdationParams**](IscsiLunUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskIscsiLun&gt;**](WithTaskIscsiLun.md)


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

## updateIscsiLunWithHttpInfo

> ApiResponse<List<WithTaskIscsiLun>> updateIscsiLun updateIscsiLunWithHttpInfo(contentLanguage, iscsiLunUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        IscsiLunUpdationParams iscsiLunUpdationParams = new IscsiLunUpdationParams(); // IscsiLunUpdationParams | 
        try {
            ApiResponse<List<WithTaskIscsiLun>> response = apiInstance.updateIscsiLunWithHttpInfo(contentLanguage, iscsiLunUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IscsiLunApi#updateIscsiLun");
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
 **iscsiLunUpdationParams** | [**IscsiLunUpdationParams**](IscsiLunUpdationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskIscsiLun&gt;**](WithTaskIscsiLun.md)>


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

