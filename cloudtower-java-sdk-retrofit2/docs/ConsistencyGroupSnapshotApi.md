# ConsistencyGroupSnapshotApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConsistencyGroupSnapshot**](ConsistencyGroupSnapshotApi.md#createConsistencyGroupSnapshot) | **POST** create-consistency-snapshot-group | 
[**deleteConsistencyGroupSnapshot**](ConsistencyGroupSnapshotApi.md#deleteConsistencyGroupSnapshot) | **POST** delete-consistency-snapshot-group | 
[**getConsistencyGroupSnapshots**](ConsistencyGroupSnapshotApi.md#getConsistencyGroupSnapshots) | **POST** get-consistency-group-snapshots | 
[**getConsistencyGroupSnapshotsConnection**](ConsistencyGroupSnapshotApi.md#getConsistencyGroupSnapshotsConnection) | **POST** get-consistency-group-snapshots-connection | 
[**updateConsistencyGroupSnapshot**](ConsistencyGroupSnapshotApi.md#updateConsistencyGroupSnapshot) | **POST** rollback-consistency-snapshot-group | 



## createConsistencyGroupSnapshot

> List&lt;WithTaskConsistencyGroupSnapshot&gt; createConsistencyGroupSnapshot(consistencyGroupSnapshotCreationParams, contentLanguage)



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
        List<ConsistencyGroupSnapshotCreationParams> consistencyGroupSnapshotCreationParams = Arrays.asList(); // List<ConsistencyGroupSnapshotCreationParams> | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskConsistencyGroupSnapshot> result = apiInstance.createConsistencyGroupSnapshot(consistencyGroupSnapshotCreationParams, contentLanguage);
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
 **consistencyGroupSnapshotCreationParams** | [**List&lt;ConsistencyGroupSnapshotCreationParams&gt;**](ConsistencyGroupSnapshotCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## deleteConsistencyGroupSnapshot

> List&lt;WithTaskDeleteConsistencyGroupSnapshot&gt; deleteConsistencyGroupSnapshot(consistencyGroupSnapshotDeletionParams, contentLanguage)



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
        ConsistencyGroupSnapshotDeletionParams consistencyGroupSnapshotDeletionParams = new ConsistencyGroupSnapshotDeletionParams(); // ConsistencyGroupSnapshotDeletionParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskDeleteConsistencyGroupSnapshot> result = apiInstance.deleteConsistencyGroupSnapshot(consistencyGroupSnapshotDeletionParams, contentLanguage);
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
 **consistencyGroupSnapshotDeletionParams** | [**ConsistencyGroupSnapshotDeletionParams**](ConsistencyGroupSnapshotDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## getConsistencyGroupSnapshots

> List&lt;ConsistencyGroupSnapshot&gt; getConsistencyGroupSnapshots(getConsistencyGroupSnapshotsRequestBody, contentLanguage)



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
        GetConsistencyGroupSnapshotsRequestBody getConsistencyGroupSnapshotsRequestBody = new GetConsistencyGroupSnapshotsRequestBody(); // GetConsistencyGroupSnapshotsRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<ConsistencyGroupSnapshot> result = apiInstance.getConsistencyGroupSnapshots(getConsistencyGroupSnapshotsRequestBody, contentLanguage);
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
 **getConsistencyGroupSnapshotsRequestBody** | [**GetConsistencyGroupSnapshotsRequestBody**](GetConsistencyGroupSnapshotsRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## getConsistencyGroupSnapshotsConnection

> ConsistencyGroupSnapshotConnection getConsistencyGroupSnapshotsConnection(getConsistencyGroupSnapshotsConnectionRequestBody, contentLanguage)



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
        GetConsistencyGroupSnapshotsConnectionRequestBody getConsistencyGroupSnapshotsConnectionRequestBody = new GetConsistencyGroupSnapshotsConnectionRequestBody(); // GetConsistencyGroupSnapshotsConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            ConsistencyGroupSnapshotConnection result = apiInstance.getConsistencyGroupSnapshotsConnection(getConsistencyGroupSnapshotsConnectionRequestBody, contentLanguage);
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
 **getConsistencyGroupSnapshotsConnectionRequestBody** | [**GetConsistencyGroupSnapshotsConnectionRequestBody**](GetConsistencyGroupSnapshotsConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## updateConsistencyGroupSnapshot

> List&lt;WithTaskConsistencyGroupSnapshot&gt; updateConsistencyGroupSnapshot(consistencyGroupSnapshotUpdationParams, contentLanguage)



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
        ConsistencyGroupSnapshotUpdationParams consistencyGroupSnapshotUpdationParams = new ConsistencyGroupSnapshotUpdationParams(); // ConsistencyGroupSnapshotUpdationParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskConsistencyGroupSnapshot> result = apiInstance.updateConsistencyGroupSnapshot(consistencyGroupSnapshotUpdationParams, contentLanguage);
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
 **consistencyGroupSnapshotUpdationParams** | [**ConsistencyGroupSnapshotUpdationParams**](ConsistencyGroupSnapshotUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

