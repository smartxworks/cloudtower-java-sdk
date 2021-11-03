# IscsiLunApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneIscsiLunFromSnapshot**](IscsiLunApi.md#cloneIscsiLunFromSnapshot) | **POST** clone-iscsi-lun-from-snapshot | 
[**createIscsiLun**](IscsiLunApi.md#createIscsiLun) | **POST** create-iscsi-lun | 
[**deleteIscsiLun**](IscsiLunApi.md#deleteIscsiLun) | **POST** delete-iscsi-lun | 
[**getIscsiLuns**](IscsiLunApi.md#getIscsiLuns) | **POST** get-iscsi-luns | 
[**getIscsiLunsConnection**](IscsiLunApi.md#getIscsiLunsConnection) | **POST** get-iscsi-luns-connection | 
[**rollbackIscsiLunFromSnapshot**](IscsiLunApi.md#rollbackIscsiLunFromSnapshot) | **POST** rollback-iscsi-lun-from-snapshot | 
[**updateIscsiLun**](IscsiLunApi.md#updateIscsiLun) | **POST** update-iscsi-lun | 



## cloneIscsiLunFromSnapshot

> List&lt;WithTaskIscsiLun&gt; cloneIscsiLunFromSnapshot(iscsiLunCloneParams, contentLanguage)



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
        List<IscsiLunCloneParams> iscsiLunCloneParams = Arrays.asList(); // List<IscsiLunCloneParams> | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskIscsiLun> result = apiInstance.cloneIscsiLunFromSnapshot(iscsiLunCloneParams, contentLanguage);
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
 **iscsiLunCloneParams** | [**List&lt;IscsiLunCloneParams&gt;**](IscsiLunCloneParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## createIscsiLun

> List&lt;WithTaskIscsiLun&gt; createIscsiLun(iscsiLunCreationParams, contentLanguage)



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
        List<IscsiLunCreationParams> iscsiLunCreationParams = Arrays.asList(); // List<IscsiLunCreationParams> | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskIscsiLun> result = apiInstance.createIscsiLun(iscsiLunCreationParams, contentLanguage);
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
 **iscsiLunCreationParams** | [**List&lt;IscsiLunCreationParams&gt;**](IscsiLunCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## deleteIscsiLun

> List&lt;WithTaskDeleteIscsiLun&gt; deleteIscsiLun(iscsiLunDeletionParams, contentLanguage)



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
        IscsiLunDeletionParams iscsiLunDeletionParams = new IscsiLunDeletionParams(); // IscsiLunDeletionParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskDeleteIscsiLun> result = apiInstance.deleteIscsiLun(iscsiLunDeletionParams, contentLanguage);
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
 **iscsiLunDeletionParams** | [**IscsiLunDeletionParams**](IscsiLunDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## getIscsiLuns

> List&lt;IscsiLun&gt; getIscsiLuns(getIscsiLunsRequestBody, contentLanguage)



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
        GetIscsiLunsRequestBody getIscsiLunsRequestBody = new GetIscsiLunsRequestBody(); // GetIscsiLunsRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<IscsiLun> result = apiInstance.getIscsiLuns(getIscsiLunsRequestBody, contentLanguage);
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
 **getIscsiLunsRequestBody** | [**GetIscsiLunsRequestBody**](GetIscsiLunsRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## getIscsiLunsConnection

> IscsiLunConnection getIscsiLunsConnection(getIscsiLunsConnectionRequestBody, contentLanguage)



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
        GetIscsiLunsConnectionRequestBody getIscsiLunsConnectionRequestBody = new GetIscsiLunsConnectionRequestBody(); // GetIscsiLunsConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            IscsiLunConnection result = apiInstance.getIscsiLunsConnection(getIscsiLunsConnectionRequestBody, contentLanguage);
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
 **getIscsiLunsConnectionRequestBody** | [**GetIscsiLunsConnectionRequestBody**](GetIscsiLunsConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## rollbackIscsiLunFromSnapshot

> List&lt;WithTaskIscsiLun&gt; rollbackIscsiLunFromSnapshot(iscsiLunRollbackParams, contentLanguage)



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
        List<IscsiLunRollbackParams> iscsiLunRollbackParams = Arrays.asList(); // List<IscsiLunRollbackParams> | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskIscsiLun> result = apiInstance.rollbackIscsiLunFromSnapshot(iscsiLunRollbackParams, contentLanguage);
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
 **iscsiLunRollbackParams** | [**List&lt;IscsiLunRollbackParams&gt;**](IscsiLunRollbackParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## updateIscsiLun

> List&lt;WithTaskIscsiLun&gt; updateIscsiLun(iscsiLunUpdationParams, contentLanguage)



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
        IscsiLunUpdationParams iscsiLunUpdationParams = new IscsiLunUpdationParams(); // IscsiLunUpdationParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskIscsiLun> result = apiInstance.updateIscsiLun(iscsiLunUpdationParams, contentLanguage);
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
 **iscsiLunUpdationParams** | [**IscsiLunUpdationParams**](IscsiLunUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

