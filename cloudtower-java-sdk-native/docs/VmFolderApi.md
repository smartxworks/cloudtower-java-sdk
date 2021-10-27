# VmFolderApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVmFolder**](VmFolderApi.md#createVmFolder) | **POST** /create-vm-folder | 
[**createVmFolderWithHttpInfo**](VmFolderApi.md#createVmFolderWithHttpInfo) | **POST** /create-vm-folder | 
[**deleteVmFolder**](VmFolderApi.md#deleteVmFolder) | **POST** /delete-vm-folder | 
[**deleteVmFolderWithHttpInfo**](VmFolderApi.md#deleteVmFolderWithHttpInfo) | **POST** /delete-vm-folder | 
[**getVmFolders**](VmFolderApi.md#getVmFolders) | **POST** /get-vm-folders | 
[**getVmFoldersWithHttpInfo**](VmFolderApi.md#getVmFoldersWithHttpInfo) | **POST** /get-vm-folders | 
[**getVmFoldersConnection**](VmFolderApi.md#getVmFoldersConnection) | **POST** /get-vm-folders-connection | 
[**getVmFoldersConnectionWithHttpInfo**](VmFolderApi.md#getVmFoldersConnectionWithHttpInfo) | **POST** /get-vm-folders-connection | 
[**updateVmFolder**](VmFolderApi.md#updateVmFolder) | **POST** /update-vm-folder | 
[**updateVmFolderWithHttpInfo**](VmFolderApi.md#updateVmFolderWithHttpInfo) | **POST** /update-vm-folder | 



## createVmFolder

> List<WithTaskVmFolder> createVmFolder(contentLanguage, vmFolderCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmFolderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmFolderApi apiInstance = new VmFolderApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<VmFolderCreationParams> vmFolderCreationParams = Arrays.asList(); // List<VmFolderCreationParams> | 
        try {
            List<WithTaskVmFolder> result = apiInstance.createVmFolder(contentLanguage, vmFolderCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmFolderApi#createVmFolder");
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
 **vmFolderCreationParams** | [**List&lt;VmFolderCreationParams&gt;**](VmFolderCreationParams.md)|  |

### Return type

[**List&lt;WithTaskVmFolder&gt;**](WithTaskVmFolder.md)


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

## createVmFolderWithHttpInfo

> ApiResponse<List<WithTaskVmFolder>> createVmFolder createVmFolderWithHttpInfo(contentLanguage, vmFolderCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmFolderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmFolderApi apiInstance = new VmFolderApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<VmFolderCreationParams> vmFolderCreationParams = Arrays.asList(); // List<VmFolderCreationParams> | 
        try {
            ApiResponse<List<WithTaskVmFolder>> response = apiInstance.createVmFolderWithHttpInfo(contentLanguage, vmFolderCreationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmFolderApi#createVmFolder");
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
 **vmFolderCreationParams** | [**List&lt;VmFolderCreationParams&gt;**](VmFolderCreationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskVmFolder&gt;**](WithTaskVmFolder.md)>


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


## deleteVmFolder

> List<WithTaskDeleteVmFolder> deleteVmFolder(contentLanguage, vmFolderDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmFolderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmFolderApi apiInstance = new VmFolderApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        VmFolderDeletionParams vmFolderDeletionParams = new VmFolderDeletionParams(); // VmFolderDeletionParams | 
        try {
            List<WithTaskDeleteVmFolder> result = apiInstance.deleteVmFolder(contentLanguage, vmFolderDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmFolderApi#deleteVmFolder");
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
 **vmFolderDeletionParams** | [**VmFolderDeletionParams**](VmFolderDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteVmFolder&gt;**](WithTaskDeleteVmFolder.md)


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

## deleteVmFolderWithHttpInfo

> ApiResponse<List<WithTaskDeleteVmFolder>> deleteVmFolder deleteVmFolderWithHttpInfo(contentLanguage, vmFolderDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmFolderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmFolderApi apiInstance = new VmFolderApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        VmFolderDeletionParams vmFolderDeletionParams = new VmFolderDeletionParams(); // VmFolderDeletionParams | 
        try {
            ApiResponse<List<WithTaskDeleteVmFolder>> response = apiInstance.deleteVmFolderWithHttpInfo(contentLanguage, vmFolderDeletionParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmFolderApi#deleteVmFolder");
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
 **vmFolderDeletionParams** | [**VmFolderDeletionParams**](VmFolderDeletionParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDeleteVmFolder&gt;**](WithTaskDeleteVmFolder.md)>


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


## getVmFolders

> List<VmFolder> getVmFolders(contentLanguage, getVmFoldersRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmFolderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmFolderApi apiInstance = new VmFolderApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmFoldersRequestBody getVmFoldersRequestBody = new GetVmFoldersRequestBody(); // GetVmFoldersRequestBody | 
        try {
            List<VmFolder> result = apiInstance.getVmFolders(contentLanguage, getVmFoldersRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmFolderApi#getVmFolders");
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
 **getVmFoldersRequestBody** | [**GetVmFoldersRequestBody**](GetVmFoldersRequestBody.md)|  |

### Return type

[**List&lt;VmFolder&gt;**](VmFolder.md)


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

## getVmFoldersWithHttpInfo

> ApiResponse<List<VmFolder>> getVmFolders getVmFoldersWithHttpInfo(contentLanguage, getVmFoldersRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmFolderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmFolderApi apiInstance = new VmFolderApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmFoldersRequestBody getVmFoldersRequestBody = new GetVmFoldersRequestBody(); // GetVmFoldersRequestBody | 
        try {
            ApiResponse<List<VmFolder>> response = apiInstance.getVmFoldersWithHttpInfo(contentLanguage, getVmFoldersRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmFolderApi#getVmFolders");
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
 **getVmFoldersRequestBody** | [**GetVmFoldersRequestBody**](GetVmFoldersRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;VmFolder&gt;**](VmFolder.md)>


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


## getVmFoldersConnection

> VmFolderConnection getVmFoldersConnection(contentLanguage, getVmFoldersConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmFolderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmFolderApi apiInstance = new VmFolderApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmFoldersConnectionRequestBody getVmFoldersConnectionRequestBody = new GetVmFoldersConnectionRequestBody(); // GetVmFoldersConnectionRequestBody | 
        try {
            VmFolderConnection result = apiInstance.getVmFoldersConnection(contentLanguage, getVmFoldersConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmFolderApi#getVmFoldersConnection");
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
 **getVmFoldersConnectionRequestBody** | [**GetVmFoldersConnectionRequestBody**](GetVmFoldersConnectionRequestBody.md)|  |

### Return type

[**VmFolderConnection**](VmFolderConnection.md)


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

## getVmFoldersConnectionWithHttpInfo

> ApiResponse<VmFolderConnection> getVmFoldersConnection getVmFoldersConnectionWithHttpInfo(contentLanguage, getVmFoldersConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmFolderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmFolderApi apiInstance = new VmFolderApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmFoldersConnectionRequestBody getVmFoldersConnectionRequestBody = new GetVmFoldersConnectionRequestBody(); // GetVmFoldersConnectionRequestBody | 
        try {
            ApiResponse<VmFolderConnection> response = apiInstance.getVmFoldersConnectionWithHttpInfo(contentLanguage, getVmFoldersConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmFolderApi#getVmFoldersConnection");
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
 **getVmFoldersConnectionRequestBody** | [**GetVmFoldersConnectionRequestBody**](GetVmFoldersConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**VmFolderConnection**](VmFolderConnection.md)>


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


## updateVmFolder

> List<WithTaskVmFolder> updateVmFolder(contentLanguage, vmFolderUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmFolderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmFolderApi apiInstance = new VmFolderApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        VmFolderUpdationParams vmFolderUpdationParams = new VmFolderUpdationParams(); // VmFolderUpdationParams | 
        try {
            List<WithTaskVmFolder> result = apiInstance.updateVmFolder(contentLanguage, vmFolderUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmFolderApi#updateVmFolder");
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
 **vmFolderUpdationParams** | [**VmFolderUpdationParams**](VmFolderUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskVmFolder&gt;**](WithTaskVmFolder.md)


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

## updateVmFolderWithHttpInfo

> ApiResponse<List<WithTaskVmFolder>> updateVmFolder updateVmFolderWithHttpInfo(contentLanguage, vmFolderUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmFolderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmFolderApi apiInstance = new VmFolderApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        VmFolderUpdationParams vmFolderUpdationParams = new VmFolderUpdationParams(); // VmFolderUpdationParams | 
        try {
            ApiResponse<List<WithTaskVmFolder>> response = apiInstance.updateVmFolderWithHttpInfo(contentLanguage, vmFolderUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmFolderApi#updateVmFolder");
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
 **vmFolderUpdationParams** | [**VmFolderUpdationParams**](VmFolderUpdationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskVmFolder&gt;**](WithTaskVmFolder.md)>


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

