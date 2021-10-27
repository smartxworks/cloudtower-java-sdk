# VmVolumeApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVmVolume**](VmVolumeApi.md#createVmVolume) | **POST** /create-vm-volume | 
[**createVmVolumeWithHttpInfo**](VmVolumeApi.md#createVmVolumeWithHttpInfo) | **POST** /create-vm-volume | 
[**deleteVmVolumeFromVm**](VmVolumeApi.md#deleteVmVolumeFromVm) | **POST** /delete-vm-volume | 
[**deleteVmVolumeFromVmWithHttpInfo**](VmVolumeApi.md#deleteVmVolumeFromVmWithHttpInfo) | **POST** /delete-vm-volume | 
[**getVmVolumes**](VmVolumeApi.md#getVmVolumes) | **POST** /get-vm-volumes | 
[**getVmVolumesWithHttpInfo**](VmVolumeApi.md#getVmVolumesWithHttpInfo) | **POST** /get-vm-volumes | 
[**getVmVolumesConnection**](VmVolumeApi.md#getVmVolumesConnection) | **POST** /get-vm-volumes-connection | 
[**getVmVolumesConnectionWithHttpInfo**](VmVolumeApi.md#getVmVolumesConnectionWithHttpInfo) | **POST** /get-vm-volumes-connection | 



## createVmVolume

> List<WithTaskVmVolume> createVmVolume(contentLanguage, vmVolumeCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmVolumeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmVolumeApi apiInstance = new VmVolumeApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<VmVolumeCreationParams> vmVolumeCreationParams = Arrays.asList(); // List<VmVolumeCreationParams> | 
        try {
            List<WithTaskVmVolume> result = apiInstance.createVmVolume(contentLanguage, vmVolumeCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmVolumeApi#createVmVolume");
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
 **vmVolumeCreationParams** | [**List&lt;VmVolumeCreationParams&gt;**](VmVolumeCreationParams.md)|  |

### Return type

[**List&lt;WithTaskVmVolume&gt;**](WithTaskVmVolume.md)


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

## createVmVolumeWithHttpInfo

> ApiResponse<List<WithTaskVmVolume>> createVmVolume createVmVolumeWithHttpInfo(contentLanguage, vmVolumeCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmVolumeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmVolumeApi apiInstance = new VmVolumeApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<VmVolumeCreationParams> vmVolumeCreationParams = Arrays.asList(); // List<VmVolumeCreationParams> | 
        try {
            ApiResponse<List<WithTaskVmVolume>> response = apiInstance.createVmVolumeWithHttpInfo(contentLanguage, vmVolumeCreationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmVolumeApi#createVmVolume");
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
 **vmVolumeCreationParams** | [**List&lt;VmVolumeCreationParams&gt;**](VmVolumeCreationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskVmVolume&gt;**](WithTaskVmVolume.md)>


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


## deleteVmVolumeFromVm

> List<WithTaskDeleteVmVolume> deleteVmVolumeFromVm(contentLanguage, vmVolumeDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmVolumeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmVolumeApi apiInstance = new VmVolumeApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        VmVolumeDeletionParams vmVolumeDeletionParams = new VmVolumeDeletionParams(); // VmVolumeDeletionParams | 
        try {
            List<WithTaskDeleteVmVolume> result = apiInstance.deleteVmVolumeFromVm(contentLanguage, vmVolumeDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmVolumeApi#deleteVmVolumeFromVm");
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
 **vmVolumeDeletionParams** | [**VmVolumeDeletionParams**](VmVolumeDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteVmVolume&gt;**](WithTaskDeleteVmVolume.md)


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

## deleteVmVolumeFromVmWithHttpInfo

> ApiResponse<List<WithTaskDeleteVmVolume>> deleteVmVolumeFromVm deleteVmVolumeFromVmWithHttpInfo(contentLanguage, vmVolumeDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmVolumeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmVolumeApi apiInstance = new VmVolumeApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        VmVolumeDeletionParams vmVolumeDeletionParams = new VmVolumeDeletionParams(); // VmVolumeDeletionParams | 
        try {
            ApiResponse<List<WithTaskDeleteVmVolume>> response = apiInstance.deleteVmVolumeFromVmWithHttpInfo(contentLanguage, vmVolumeDeletionParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmVolumeApi#deleteVmVolumeFromVm");
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
 **vmVolumeDeletionParams** | [**VmVolumeDeletionParams**](VmVolumeDeletionParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDeleteVmVolume&gt;**](WithTaskDeleteVmVolume.md)>


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


## getVmVolumes

> List<VmVolume> getVmVolumes(contentLanguage, getVmVolumesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmVolumeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmVolumeApi apiInstance = new VmVolumeApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmVolumesRequestBody getVmVolumesRequestBody = new GetVmVolumesRequestBody(); // GetVmVolumesRequestBody | 
        try {
            List<VmVolume> result = apiInstance.getVmVolumes(contentLanguage, getVmVolumesRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmVolumeApi#getVmVolumes");
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
 **getVmVolumesRequestBody** | [**GetVmVolumesRequestBody**](GetVmVolumesRequestBody.md)|  |

### Return type

[**List&lt;VmVolume&gt;**](VmVolume.md)


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

## getVmVolumesWithHttpInfo

> ApiResponse<List<VmVolume>> getVmVolumes getVmVolumesWithHttpInfo(contentLanguage, getVmVolumesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmVolumeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmVolumeApi apiInstance = new VmVolumeApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmVolumesRequestBody getVmVolumesRequestBody = new GetVmVolumesRequestBody(); // GetVmVolumesRequestBody | 
        try {
            ApiResponse<List<VmVolume>> response = apiInstance.getVmVolumesWithHttpInfo(contentLanguage, getVmVolumesRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmVolumeApi#getVmVolumes");
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
 **getVmVolumesRequestBody** | [**GetVmVolumesRequestBody**](GetVmVolumesRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;VmVolume&gt;**](VmVolume.md)>


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


## getVmVolumesConnection

> VmVolumeConnection getVmVolumesConnection(contentLanguage, getVmVolumesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmVolumeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmVolumeApi apiInstance = new VmVolumeApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmVolumesConnectionRequestBody getVmVolumesConnectionRequestBody = new GetVmVolumesConnectionRequestBody(); // GetVmVolumesConnectionRequestBody | 
        try {
            VmVolumeConnection result = apiInstance.getVmVolumesConnection(contentLanguage, getVmVolumesConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmVolumeApi#getVmVolumesConnection");
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
 **getVmVolumesConnectionRequestBody** | [**GetVmVolumesConnectionRequestBody**](GetVmVolumesConnectionRequestBody.md)|  |

### Return type

[**VmVolumeConnection**](VmVolumeConnection.md)


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

## getVmVolumesConnectionWithHttpInfo

> ApiResponse<VmVolumeConnection> getVmVolumesConnection getVmVolumesConnectionWithHttpInfo(contentLanguage, getVmVolumesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmVolumeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmVolumeApi apiInstance = new VmVolumeApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmVolumesConnectionRequestBody getVmVolumesConnectionRequestBody = new GetVmVolumesConnectionRequestBody(); // GetVmVolumesConnectionRequestBody | 
        try {
            ApiResponse<VmVolumeConnection> response = apiInstance.getVmVolumesConnectionWithHttpInfo(contentLanguage, getVmVolumesConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmVolumeApi#getVmVolumesConnection");
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
 **getVmVolumesConnectionRequestBody** | [**GetVmVolumesConnectionRequestBody**](GetVmVolumesConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**VmVolumeConnection**](VmVolumeConnection.md)>


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

