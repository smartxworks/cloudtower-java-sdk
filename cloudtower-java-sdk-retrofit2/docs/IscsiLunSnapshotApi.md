# IscsiLunSnapshotApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIscsiLunSnapshot**](IscsiLunSnapshotApi.md#createIscsiLunSnapshot) | **POST** create-iscsi-lun-snapshot | 
[**deleteIscsiLunSnapshot**](IscsiLunSnapshotApi.md#deleteIscsiLunSnapshot) | **POST** delete-iscsi-lun-snapshot | 
[**getIscsiLunSnapshots**](IscsiLunSnapshotApi.md#getIscsiLunSnapshots) | **POST** get-iscsi-lun-snapshots | 
[**getIscsiLunSnapshotsConnection**](IscsiLunSnapshotApi.md#getIscsiLunSnapshotsConnection) | **POST** get-iscsi-lun-snapshots-connection | 



## createIscsiLunSnapshot

> List&lt;WithTaskIscsiLunSnapshot&gt; createIscsiLunSnapshot(iscsiLunSnapshotCreationParams, contentLanguage)



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
        List<IscsiLunSnapshotCreationParams> iscsiLunSnapshotCreationParams = Arrays.asList(); // List<IscsiLunSnapshotCreationParams> | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskIscsiLunSnapshot> result = apiInstance.createIscsiLunSnapshot(iscsiLunSnapshotCreationParams, contentLanguage);
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
 **iscsiLunSnapshotCreationParams** | [**List&lt;IscsiLunSnapshotCreationParams&gt;**](IscsiLunSnapshotCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## deleteIscsiLunSnapshot

> List&lt;WithTaskDeleteIscsiLunSnapshot&gt; deleteIscsiLunSnapshot(iscsiLunSnapshotDeletionParams, contentLanguage)



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
        IscsiLunSnapshotDeletionParams iscsiLunSnapshotDeletionParams = new IscsiLunSnapshotDeletionParams(); // IscsiLunSnapshotDeletionParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskDeleteIscsiLunSnapshot> result = apiInstance.deleteIscsiLunSnapshot(iscsiLunSnapshotDeletionParams, contentLanguage);
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
 **iscsiLunSnapshotDeletionParams** | [**IscsiLunSnapshotDeletionParams**](IscsiLunSnapshotDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## getIscsiLunSnapshots

> List&lt;IscsiLunSnapshot&gt; getIscsiLunSnapshots(getIscsiLunSnapshotsRequestBody, contentLanguage)



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
        GetIscsiLunSnapshotsRequestBody getIscsiLunSnapshotsRequestBody = new GetIscsiLunSnapshotsRequestBody(); // GetIscsiLunSnapshotsRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<IscsiLunSnapshot> result = apiInstance.getIscsiLunSnapshots(getIscsiLunSnapshotsRequestBody, contentLanguage);
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
 **getIscsiLunSnapshotsRequestBody** | [**GetIscsiLunSnapshotsRequestBody**](GetIscsiLunSnapshotsRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## getIscsiLunSnapshotsConnection

> IscsiLunSnapshotConnection getIscsiLunSnapshotsConnection(getIscsiLunSnapshotsConnectionRequestBody, contentLanguage)



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
        GetIscsiLunSnapshotsConnectionRequestBody getIscsiLunSnapshotsConnectionRequestBody = new GetIscsiLunSnapshotsConnectionRequestBody(); // GetIscsiLunSnapshotsConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            IscsiLunSnapshotConnection result = apiInstance.getIscsiLunSnapshotsConnection(getIscsiLunSnapshotsConnectionRequestBody, contentLanguage);
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
 **getIscsiLunSnapshotsConnectionRequestBody** | [**GetIscsiLunSnapshotsConnectionRequestBody**](GetIscsiLunSnapshotsConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

