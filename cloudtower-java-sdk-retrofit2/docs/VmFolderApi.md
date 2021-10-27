# VmFolderApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVmFolder**](VmFolderApi.md#createVmFolder) | **POST** create-vm-folder | 
[**deleteVmFolder**](VmFolderApi.md#deleteVmFolder) | **POST** delete-vm-folder | 
[**getVmFolders**](VmFolderApi.md#getVmFolders) | **POST** get-vm-folders | 
[**getVmFoldersConnection**](VmFolderApi.md#getVmFoldersConnection) | **POST** get-vm-folders-connection | 
[**updateVmFolder**](VmFolderApi.md#updateVmFolder) | **POST** update-vm-folder | 



## createVmFolder

> List&lt;WithTaskVmFolder&gt; createVmFolder(contentLanguage, vmFolderCreationParams)



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


## deleteVmFolder

> List&lt;WithTaskDeleteVmFolder&gt; deleteVmFolder(contentLanguage, vmFolderDeletionParams)



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


## getVmFolders

> List&lt;VmFolder&gt; getVmFolders(contentLanguage, getVmFoldersRequestBody)



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


## updateVmFolder

> List&lt;WithTaskVmFolder&gt; updateVmFolder(contentLanguage, vmFolderUpdationParams)



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

