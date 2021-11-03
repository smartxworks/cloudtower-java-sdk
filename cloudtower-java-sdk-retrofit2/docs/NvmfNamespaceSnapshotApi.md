# NvmfNamespaceSnapshotApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNvmfNamespaceSnapshot**](NvmfNamespaceSnapshotApi.md#createNvmfNamespaceSnapshot) | **POST** create-nvmf-namespace-snapshot | 
[**deleteNvmfNamespaceSnapshot**](NvmfNamespaceSnapshotApi.md#deleteNvmfNamespaceSnapshot) | **POST** delete-nvmf-namespace-snapshot | 
[**getNvmfNamespaceSnapshots**](NvmfNamespaceSnapshotApi.md#getNvmfNamespaceSnapshots) | **POST** get-nvmf-namespace-snapshots | 
[**getNvmfNamespaceSnapshotsConnection**](NvmfNamespaceSnapshotApi.md#getNvmfNamespaceSnapshotsConnection) | **POST** get-nvmf-namespace-snapshots-connection | 



## createNvmfNamespaceSnapshot

> List&lt;WithTaskNvmfNamespaceSnapshot&gt; createNvmfNamespaceSnapshot(nvmfNamespaceSnapshotCreationParams, contentLanguage)



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
        List<NvmfNamespaceSnapshotCreationParams> nvmfNamespaceSnapshotCreationParams = Arrays.asList(); // List<NvmfNamespaceSnapshotCreationParams> | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskNvmfNamespaceSnapshot> result = apiInstance.createNvmfNamespaceSnapshot(nvmfNamespaceSnapshotCreationParams, contentLanguage);
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
 **nvmfNamespaceSnapshotCreationParams** | [**List&lt;NvmfNamespaceSnapshotCreationParams&gt;**](NvmfNamespaceSnapshotCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## deleteNvmfNamespaceSnapshot

> List&lt;WithTaskDeleteNvmfNamespaceSnapshot&gt; deleteNvmfNamespaceSnapshot(nvmfNamespaceSnapshotDeletionParams, contentLanguage)



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
        NvmfNamespaceSnapshotDeletionParams nvmfNamespaceSnapshotDeletionParams = new NvmfNamespaceSnapshotDeletionParams(); // NvmfNamespaceSnapshotDeletionParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskDeleteNvmfNamespaceSnapshot> result = apiInstance.deleteNvmfNamespaceSnapshot(nvmfNamespaceSnapshotDeletionParams, contentLanguage);
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
 **nvmfNamespaceSnapshotDeletionParams** | [**NvmfNamespaceSnapshotDeletionParams**](NvmfNamespaceSnapshotDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## getNvmfNamespaceSnapshots

> List&lt;NvmfNamespaceSnapshot&gt; getNvmfNamespaceSnapshots(getNvmfNamespaceSnapshotsRequestBody, contentLanguage)



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
        GetNvmfNamespaceSnapshotsRequestBody getNvmfNamespaceSnapshotsRequestBody = new GetNvmfNamespaceSnapshotsRequestBody(); // GetNvmfNamespaceSnapshotsRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<NvmfNamespaceSnapshot> result = apiInstance.getNvmfNamespaceSnapshots(getNvmfNamespaceSnapshotsRequestBody, contentLanguage);
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
 **getNvmfNamespaceSnapshotsRequestBody** | [**GetNvmfNamespaceSnapshotsRequestBody**](GetNvmfNamespaceSnapshotsRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## getNvmfNamespaceSnapshotsConnection

> NvmfNamespaceSnapshotConnection getNvmfNamespaceSnapshotsConnection(getNvmfNamespaceSnapshotsConnectionRequestBody, contentLanguage)



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
        GetNvmfNamespaceSnapshotsConnectionRequestBody getNvmfNamespaceSnapshotsConnectionRequestBody = new GetNvmfNamespaceSnapshotsConnectionRequestBody(); // GetNvmfNamespaceSnapshotsConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            NvmfNamespaceSnapshotConnection result = apiInstance.getNvmfNamespaceSnapshotsConnection(getNvmfNamespaceSnapshotsConnectionRequestBody, contentLanguage);
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
 **getNvmfNamespaceSnapshotsConnectionRequestBody** | [**GetNvmfNamespaceSnapshotsConnectionRequestBody**](GetNvmfNamespaceSnapshotsConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

