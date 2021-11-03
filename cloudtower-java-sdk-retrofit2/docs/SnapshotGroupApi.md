# SnapshotGroupApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneSnapshotGroup**](SnapshotGroupApi.md#cloneSnapshotGroup) | **POST** clone-snapshot-group | 
[**deleteSnapshotGroup**](SnapshotGroupApi.md#deleteSnapshotGroup) | **POST** delete-snapshot-group | 
[**getSnapshotGroups**](SnapshotGroupApi.md#getSnapshotGroups) | **POST** get-snapshot-groups | 
[**getSnapshotGroupsConnection**](SnapshotGroupApi.md#getSnapshotGroupsConnection) | **POST** get-snapshot-groups-connection | 
[**keepSnapshotGroup**](SnapshotGroupApi.md#keepSnapshotGroup) | **POST** keep-snapshot-group | 
[**rollbackSnapshotGroup**](SnapshotGroupApi.md#rollbackSnapshotGroup) | **POST** rollback-snapshot-group | 



## cloneSnapshotGroup

> List&lt;WithTaskSnapshotGroup&gt; cloneSnapshotGroup(snapshotGroupCloneParams, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnapshotGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnapshotGroupApi apiInstance = new SnapshotGroupApi(defaultClient);
        List<SnapshotGroupCloneParams> snapshotGroupCloneParams = Arrays.asList(); // List<SnapshotGroupCloneParams> | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskSnapshotGroup> result = apiInstance.cloneSnapshotGroup(snapshotGroupCloneParams, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotGroupApi#cloneSnapshotGroup");
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
 **snapshotGroupCloneParams** | [**List&lt;SnapshotGroupCloneParams&gt;**](SnapshotGroupCloneParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskSnapshotGroup&gt;**](WithTaskSnapshotGroup.md)

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


## deleteSnapshotGroup

> List&lt;WithTaskDeleteSnapshotGroup&gt; deleteSnapshotGroup(snapshotGroupDeletionParams, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnapshotGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnapshotGroupApi apiInstance = new SnapshotGroupApi(defaultClient);
        SnapshotGroupDeletionParams snapshotGroupDeletionParams = new SnapshotGroupDeletionParams(); // SnapshotGroupDeletionParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskDeleteSnapshotGroup> result = apiInstance.deleteSnapshotGroup(snapshotGroupDeletionParams, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotGroupApi#deleteSnapshotGroup");
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
 **snapshotGroupDeletionParams** | [**SnapshotGroupDeletionParams**](SnapshotGroupDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskDeleteSnapshotGroup&gt;**](WithTaskDeleteSnapshotGroup.md)

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


## getSnapshotGroups

> List&lt;SnapshotGroup&gt; getSnapshotGroups(getSnapshotGroupsRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnapshotGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnapshotGroupApi apiInstance = new SnapshotGroupApi(defaultClient);
        GetSnapshotGroupsRequestBody getSnapshotGroupsRequestBody = new GetSnapshotGroupsRequestBody(); // GetSnapshotGroupsRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<SnapshotGroup> result = apiInstance.getSnapshotGroups(getSnapshotGroupsRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotGroupApi#getSnapshotGroups");
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
 **getSnapshotGroupsRequestBody** | [**GetSnapshotGroupsRequestBody**](GetSnapshotGroupsRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;SnapshotGroup&gt;**](SnapshotGroup.md)

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


## getSnapshotGroupsConnection

> SnapshotGroupConnection getSnapshotGroupsConnection(getSnapshotGroupsConnectionRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnapshotGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnapshotGroupApi apiInstance = new SnapshotGroupApi(defaultClient);
        GetSnapshotGroupsConnectionRequestBody getSnapshotGroupsConnectionRequestBody = new GetSnapshotGroupsConnectionRequestBody(); // GetSnapshotGroupsConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            SnapshotGroupConnection result = apiInstance.getSnapshotGroupsConnection(getSnapshotGroupsConnectionRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotGroupApi#getSnapshotGroupsConnection");
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
 **getSnapshotGroupsConnectionRequestBody** | [**GetSnapshotGroupsConnectionRequestBody**](GetSnapshotGroupsConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**SnapshotGroupConnection**](SnapshotGroupConnection.md)

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


## keepSnapshotGroup

> List&lt;WithTaskSnapshotGroup&gt; keepSnapshotGroup(snapshotGroupKeepParams, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnapshotGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnapshotGroupApi apiInstance = new SnapshotGroupApi(defaultClient);
        SnapshotGroupKeepParams snapshotGroupKeepParams = new SnapshotGroupKeepParams(); // SnapshotGroupKeepParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskSnapshotGroup> result = apiInstance.keepSnapshotGroup(snapshotGroupKeepParams, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotGroupApi#keepSnapshotGroup");
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
 **snapshotGroupKeepParams** | [**SnapshotGroupKeepParams**](SnapshotGroupKeepParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskSnapshotGroup&gt;**](WithTaskSnapshotGroup.md)

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


## rollbackSnapshotGroup

> List&lt;WithTaskSnapshotGroup&gt; rollbackSnapshotGroup(snapshotGroupRollbackParams, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnapshotGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SnapshotGroupApi apiInstance = new SnapshotGroupApi(defaultClient);
        SnapshotGroupRollbackParams snapshotGroupRollbackParams = new SnapshotGroupRollbackParams(); // SnapshotGroupRollbackParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskSnapshotGroup> result = apiInstance.rollbackSnapshotGroup(snapshotGroupRollbackParams, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotGroupApi#rollbackSnapshotGroup");
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
 **snapshotGroupRollbackParams** | [**SnapshotGroupRollbackParams**](SnapshotGroupRollbackParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskSnapshotGroup&gt;**](WithTaskSnapshotGroup.md)

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

