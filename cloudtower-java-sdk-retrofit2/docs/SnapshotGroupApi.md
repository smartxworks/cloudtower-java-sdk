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

> List&lt;WithTaskSnapshotGroup&gt; cloneSnapshotGroup(contentLanguage, snapshotGroupCloneParams)



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
        String contentLanguage = "zh-CN"; // String | 
        List<SnapshotGroupCloneParams> snapshotGroupCloneParams = Arrays.asList(); // List<SnapshotGroupCloneParams> | 
        try {
            List<WithTaskSnapshotGroup> result = apiInstance.cloneSnapshotGroup(contentLanguage, snapshotGroupCloneParams);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **snapshotGroupCloneParams** | [**List&lt;SnapshotGroupCloneParams&gt;**](SnapshotGroupCloneParams.md)|  |

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

> List&lt;WithTaskDeleteSnapshotGroup&gt; deleteSnapshotGroup(contentLanguage, snapshotGroupDeletionParams)



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
        String contentLanguage = "zh-CN"; // String | 
        SnapshotGroupDeletionParams snapshotGroupDeletionParams = new SnapshotGroupDeletionParams(); // SnapshotGroupDeletionParams | 
        try {
            List<WithTaskDeleteSnapshotGroup> result = apiInstance.deleteSnapshotGroup(contentLanguage, snapshotGroupDeletionParams);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **snapshotGroupDeletionParams** | [**SnapshotGroupDeletionParams**](SnapshotGroupDeletionParams.md)|  |

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

> List&lt;SnapshotGroup&gt; getSnapshotGroups(contentLanguage, getSnapshotGroupsRequestBody)



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
        String contentLanguage = "zh-CN"; // String | 
        GetSnapshotGroupsRequestBody getSnapshotGroupsRequestBody = new GetSnapshotGroupsRequestBody(); // GetSnapshotGroupsRequestBody | 
        try {
            List<SnapshotGroup> result = apiInstance.getSnapshotGroups(contentLanguage, getSnapshotGroupsRequestBody);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getSnapshotGroupsRequestBody** | [**GetSnapshotGroupsRequestBody**](GetSnapshotGroupsRequestBody.md)|  |

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

> SnapshotGroupConnection getSnapshotGroupsConnection(contentLanguage, getSnapshotGroupsConnectionRequestBody)



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
        String contentLanguage = "zh-CN"; // String | 
        GetSnapshotGroupsConnectionRequestBody getSnapshotGroupsConnectionRequestBody = new GetSnapshotGroupsConnectionRequestBody(); // GetSnapshotGroupsConnectionRequestBody | 
        try {
            SnapshotGroupConnection result = apiInstance.getSnapshotGroupsConnection(contentLanguage, getSnapshotGroupsConnectionRequestBody);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getSnapshotGroupsConnectionRequestBody** | [**GetSnapshotGroupsConnectionRequestBody**](GetSnapshotGroupsConnectionRequestBody.md)|  |

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

> List&lt;WithTaskSnapshotGroup&gt; keepSnapshotGroup(contentLanguage, snapshotGroupKeepParams)



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
        String contentLanguage = "zh-CN"; // String | 
        SnapshotGroupKeepParams snapshotGroupKeepParams = new SnapshotGroupKeepParams(); // SnapshotGroupKeepParams | 
        try {
            List<WithTaskSnapshotGroup> result = apiInstance.keepSnapshotGroup(contentLanguage, snapshotGroupKeepParams);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **snapshotGroupKeepParams** | [**SnapshotGroupKeepParams**](SnapshotGroupKeepParams.md)|  |

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

> List&lt;WithTaskSnapshotGroup&gt; rollbackSnapshotGroup(contentLanguage, snapshotGroupRollbackParams)



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
        String contentLanguage = "zh-CN"; // String | 
        SnapshotGroupRollbackParams snapshotGroupRollbackParams = new SnapshotGroupRollbackParams(); // SnapshotGroupRollbackParams | 
        try {
            List<WithTaskSnapshotGroup> result = apiInstance.rollbackSnapshotGroup(contentLanguage, snapshotGroupRollbackParams);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **snapshotGroupRollbackParams** | [**SnapshotGroupRollbackParams**](SnapshotGroupRollbackParams.md)|  |

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

