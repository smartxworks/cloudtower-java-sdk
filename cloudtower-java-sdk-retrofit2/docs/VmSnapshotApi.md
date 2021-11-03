# VmSnapshotApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVmSnapshot**](VmSnapshotApi.md#createVmSnapshot) | **POST** create-vm-snapshot | 
[**deleteVmSnapshot**](VmSnapshotApi.md#deleteVmSnapshot) | **POST** delete-vm-snapshot | 
[**getVmSnapshots**](VmSnapshotApi.md#getVmSnapshots) | **POST** get-vm-snapshots | 
[**getVmSnapshotsConnection**](VmSnapshotApi.md#getVmSnapshotsConnection) | **POST** get-vm-snapshots-connection | 



## createVmSnapshot

> List&lt;WithTaskVmSnapshot&gt; createVmSnapshot(vmSnapshotCreationParams, contentLanguage)



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
        VmSnapshotCreationParams vmSnapshotCreationParams = new VmSnapshotCreationParams(); // VmSnapshotCreationParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskVmSnapshot> result = apiInstance.createVmSnapshot(vmSnapshotCreationParams, contentLanguage);
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
 **vmSnapshotCreationParams** | [**VmSnapshotCreationParams**](VmSnapshotCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## deleteVmSnapshot

> List&lt;WithTaskDeleteVmSnapshot&gt; deleteVmSnapshot(vmSnapshotDeletionParams, contentLanguage)



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
        VmSnapshotDeletionParams vmSnapshotDeletionParams = new VmSnapshotDeletionParams(); // VmSnapshotDeletionParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskDeleteVmSnapshot> result = apiInstance.deleteVmSnapshot(vmSnapshotDeletionParams, contentLanguage);
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
 **vmSnapshotDeletionParams** | [**VmSnapshotDeletionParams**](VmSnapshotDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## getVmSnapshots

> List&lt;VmSnapshot&gt; getVmSnapshots(getVmSnapshotsRequestBody, contentLanguage)



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
        GetVmSnapshotsRequestBody getVmSnapshotsRequestBody = new GetVmSnapshotsRequestBody(); // GetVmSnapshotsRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<VmSnapshot> result = apiInstance.getVmSnapshots(getVmSnapshotsRequestBody, contentLanguage);
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
 **getVmSnapshotsRequestBody** | [**GetVmSnapshotsRequestBody**](GetVmSnapshotsRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## getVmSnapshotsConnection

> VmSnapshotConnection getVmSnapshotsConnection(getVmSnapshotsConnectionRequestBody, contentLanguage)



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
        GetVmSnapshotsConnectionRequestBody getVmSnapshotsConnectionRequestBody = new GetVmSnapshotsConnectionRequestBody(); // GetVmSnapshotsConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            VmSnapshotConnection result = apiInstance.getVmSnapshotsConnection(getVmSnapshotsConnectionRequestBody, contentLanguage);
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
 **getVmSnapshotsConnectionRequestBody** | [**GetVmSnapshotsConnectionRequestBody**](GetVmSnapshotsConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

