# DiskApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDisks**](DiskApi.md#getDisks) | **POST** /get-disks | 
[**getDisksWithHttpInfo**](DiskApi.md#getDisksWithHttpInfo) | **POST** /get-disks | 
[**getDisksConnection**](DiskApi.md#getDisksConnection) | **POST** /get-disks-connection | 
[**getDisksConnectionWithHttpInfo**](DiskApi.md#getDisksConnectionWithHttpInfo) | **POST** /get-disks-connection | 
[**mountDisk**](DiskApi.md#mountDisk) | **POST** /mount-disk | 
[**mountDiskWithHttpInfo**](DiskApi.md#mountDiskWithHttpInfo) | **POST** /mount-disk | 
[**unmountDisk**](DiskApi.md#unmountDisk) | **POST** /unmount-disk | 
[**unmountDiskWithHttpInfo**](DiskApi.md#unmountDiskWithHttpInfo) | **POST** /unmount-disk | 



## getDisks

> List<Disk> getDisks(contentLanguage, getDisksRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DiskApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DiskApi apiInstance = new DiskApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetDisksRequestBody getDisksRequestBody = new GetDisksRequestBody(); // GetDisksRequestBody | 
        try {
            List<Disk> result = apiInstance.getDisks(contentLanguage, getDisksRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiskApi#getDisks");
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
 **getDisksRequestBody** | [**GetDisksRequestBody**](GetDisksRequestBody.md)|  |

### Return type

[**List&lt;Disk&gt;**](Disk.md)


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

## getDisksWithHttpInfo

> ApiResponse<List<Disk>> getDisks getDisksWithHttpInfo(contentLanguage, getDisksRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DiskApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DiskApi apiInstance = new DiskApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetDisksRequestBody getDisksRequestBody = new GetDisksRequestBody(); // GetDisksRequestBody | 
        try {
            ApiResponse<List<Disk>> response = apiInstance.getDisksWithHttpInfo(contentLanguage, getDisksRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DiskApi#getDisks");
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
 **getDisksRequestBody** | [**GetDisksRequestBody**](GetDisksRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;Disk&gt;**](Disk.md)>


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


## getDisksConnection

> DiskConnection getDisksConnection(contentLanguage, getDisksConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DiskApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DiskApi apiInstance = new DiskApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetDisksConnectionRequestBody getDisksConnectionRequestBody = new GetDisksConnectionRequestBody(); // GetDisksConnectionRequestBody | 
        try {
            DiskConnection result = apiInstance.getDisksConnection(contentLanguage, getDisksConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiskApi#getDisksConnection");
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
 **getDisksConnectionRequestBody** | [**GetDisksConnectionRequestBody**](GetDisksConnectionRequestBody.md)|  |

### Return type

[**DiskConnection**](DiskConnection.md)


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

## getDisksConnectionWithHttpInfo

> ApiResponse<DiskConnection> getDisksConnection getDisksConnectionWithHttpInfo(contentLanguage, getDisksConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DiskApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DiskApi apiInstance = new DiskApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetDisksConnectionRequestBody getDisksConnectionRequestBody = new GetDisksConnectionRequestBody(); // GetDisksConnectionRequestBody | 
        try {
            ApiResponse<DiskConnection> response = apiInstance.getDisksConnectionWithHttpInfo(contentLanguage, getDisksConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DiskApi#getDisksConnection");
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
 **getDisksConnectionRequestBody** | [**GetDisksConnectionRequestBody**](GetDisksConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**DiskConnection**](DiskConnection.md)>


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


## mountDisk

> List<WithTaskDisk> mountDisk(contentLanguage, diskMountParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DiskApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DiskApi apiInstance = new DiskApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        DiskMountParams diskMountParams = new DiskMountParams(); // DiskMountParams | 
        try {
            List<WithTaskDisk> result = apiInstance.mountDisk(contentLanguage, diskMountParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiskApi#mountDisk");
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
 **diskMountParams** | [**DiskMountParams**](DiskMountParams.md)|  |

### Return type

[**List&lt;WithTaskDisk&gt;**](WithTaskDisk.md)


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

## mountDiskWithHttpInfo

> ApiResponse<List<WithTaskDisk>> mountDisk mountDiskWithHttpInfo(contentLanguage, diskMountParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DiskApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DiskApi apiInstance = new DiskApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        DiskMountParams diskMountParams = new DiskMountParams(); // DiskMountParams | 
        try {
            ApiResponse<List<WithTaskDisk>> response = apiInstance.mountDiskWithHttpInfo(contentLanguage, diskMountParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DiskApi#mountDisk");
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
 **diskMountParams** | [**DiskMountParams**](DiskMountParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDisk&gt;**](WithTaskDisk.md)>


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


## unmountDisk

> List<WithTaskDisk> unmountDisk(contentLanguage, diskUnmountParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DiskApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DiskApi apiInstance = new DiskApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        DiskUnmountParams diskUnmountParams = new DiskUnmountParams(); // DiskUnmountParams | 
        try {
            List<WithTaskDisk> result = apiInstance.unmountDisk(contentLanguage, diskUnmountParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiskApi#unmountDisk");
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
 **diskUnmountParams** | [**DiskUnmountParams**](DiskUnmountParams.md)|  |

### Return type

[**List&lt;WithTaskDisk&gt;**](WithTaskDisk.md)


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

## unmountDiskWithHttpInfo

> ApiResponse<List<WithTaskDisk>> unmountDisk unmountDiskWithHttpInfo(contentLanguage, diskUnmountParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DiskApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DiskApi apiInstance = new DiskApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        DiskUnmountParams diskUnmountParams = new DiskUnmountParams(); // DiskUnmountParams | 
        try {
            ApiResponse<List<WithTaskDisk>> response = apiInstance.unmountDiskWithHttpInfo(contentLanguage, diskUnmountParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DiskApi#unmountDisk");
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
 **diskUnmountParams** | [**DiskUnmountParams**](DiskUnmountParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDisk&gt;**](WithTaskDisk.md)>


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

