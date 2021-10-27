# NfsExportApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNfsExport**](NfsExportApi.md#createNfsExport) | **POST** create-nfs-export | 
[**deleteNfsExport**](NfsExportApi.md#deleteNfsExport) | **POST** delete-nfs-export | 
[**getNfsExports**](NfsExportApi.md#getNfsExports) | **POST** get-nfs-exports | 
[**getNfsExportsConnection**](NfsExportApi.md#getNfsExportsConnection) | **POST** get-nfs-exports-connection | 
[**updateNfsExport**](NfsExportApi.md#updateNfsExport) | **POST** update-nfs-export | 



## createNfsExport

> List&lt;WithTaskNfsExport&gt; createNfsExport(contentLanguage, nfsExportCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NfsExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NfsExportApi apiInstance = new NfsExportApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<NfsExportCreationParams> nfsExportCreationParams = Arrays.asList(); // List<NfsExportCreationParams> | 
        try {
            List<WithTaskNfsExport> result = apiInstance.createNfsExport(contentLanguage, nfsExportCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NfsExportApi#createNfsExport");
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
 **nfsExportCreationParams** | [**List&lt;NfsExportCreationParams&gt;**](NfsExportCreationParams.md)|  |

### Return type

[**List&lt;WithTaskNfsExport&gt;**](WithTaskNfsExport.md)

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


## deleteNfsExport

> List&lt;WithTaskDeleteNfsExport&gt; deleteNfsExport(contentLanguage, nfsExportDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NfsExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NfsExportApi apiInstance = new NfsExportApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        NfsExportDeletionParams nfsExportDeletionParams = new NfsExportDeletionParams(); // NfsExportDeletionParams | 
        try {
            List<WithTaskDeleteNfsExport> result = apiInstance.deleteNfsExport(contentLanguage, nfsExportDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NfsExportApi#deleteNfsExport");
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
 **nfsExportDeletionParams** | [**NfsExportDeletionParams**](NfsExportDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteNfsExport&gt;**](WithTaskDeleteNfsExport.md)

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


## getNfsExports

> List&lt;NfsExport&gt; getNfsExports(contentLanguage, getNfsExportsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NfsExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NfsExportApi apiInstance = new NfsExportApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetNfsExportsRequestBody getNfsExportsRequestBody = new GetNfsExportsRequestBody(); // GetNfsExportsRequestBody | 
        try {
            List<NfsExport> result = apiInstance.getNfsExports(contentLanguage, getNfsExportsRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NfsExportApi#getNfsExports");
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
 **getNfsExportsRequestBody** | [**GetNfsExportsRequestBody**](GetNfsExportsRequestBody.md)|  |

### Return type

[**List&lt;NfsExport&gt;**](NfsExport.md)

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


## getNfsExportsConnection

> NfsExportConnection getNfsExportsConnection(contentLanguage, getNfsExportsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NfsExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NfsExportApi apiInstance = new NfsExportApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetNfsExportsConnectionRequestBody getNfsExportsConnectionRequestBody = new GetNfsExportsConnectionRequestBody(); // GetNfsExportsConnectionRequestBody | 
        try {
            NfsExportConnection result = apiInstance.getNfsExportsConnection(contentLanguage, getNfsExportsConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NfsExportApi#getNfsExportsConnection");
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
 **getNfsExportsConnectionRequestBody** | [**GetNfsExportsConnectionRequestBody**](GetNfsExportsConnectionRequestBody.md)|  |

### Return type

[**NfsExportConnection**](NfsExportConnection.md)

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


## updateNfsExport

> List&lt;WithTaskNfsExport&gt; updateNfsExport(contentLanguage, nfsExportUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NfsExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NfsExportApi apiInstance = new NfsExportApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        NfsExportUpdationParams nfsExportUpdationParams = new NfsExportUpdationParams(); // NfsExportUpdationParams | 
        try {
            List<WithTaskNfsExport> result = apiInstance.updateNfsExport(contentLanguage, nfsExportUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NfsExportApi#updateNfsExport");
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
 **nfsExportUpdationParams** | [**NfsExportUpdationParams**](NfsExportUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskNfsExport&gt;**](WithTaskNfsExport.md)

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

