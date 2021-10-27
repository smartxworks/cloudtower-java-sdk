# SnapshotGroupApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneSnapshotGroup**](SnapshotGroupApi.md#cloneSnapshotGroup) | **POST** /clone-snapshot-group | 
[**cloneSnapshotGroupWithHttpInfo**](SnapshotGroupApi.md#cloneSnapshotGroupWithHttpInfo) | **POST** /clone-snapshot-group | 
[**deleteSnapshotGroup**](SnapshotGroupApi.md#deleteSnapshotGroup) | **POST** /delete-snapshot-group | 
[**deleteSnapshotGroupWithHttpInfo**](SnapshotGroupApi.md#deleteSnapshotGroupWithHttpInfo) | **POST** /delete-snapshot-group | 
[**getSnapshotGroups**](SnapshotGroupApi.md#getSnapshotGroups) | **POST** /get-snapshot-groups | 
[**getSnapshotGroupsWithHttpInfo**](SnapshotGroupApi.md#getSnapshotGroupsWithHttpInfo) | **POST** /get-snapshot-groups | 
[**getSnapshotGroupsConnection**](SnapshotGroupApi.md#getSnapshotGroupsConnection) | **POST** /get-snapshot-groups-connection | 
[**getSnapshotGroupsConnectionWithHttpInfo**](SnapshotGroupApi.md#getSnapshotGroupsConnectionWithHttpInfo) | **POST** /get-snapshot-groups-connection | 
[**keepSnapshotGroup**](SnapshotGroupApi.md#keepSnapshotGroup) | **POST** /keep-snapshot-group | 
[**keepSnapshotGroupWithHttpInfo**](SnapshotGroupApi.md#keepSnapshotGroupWithHttpInfo) | **POST** /keep-snapshot-group | 
[**rollbackSnapshotGroup**](SnapshotGroupApi.md#rollbackSnapshotGroup) | **POST** /rollback-snapshot-group | 
[**rollbackSnapshotGroupWithHttpInfo**](SnapshotGroupApi.md#rollbackSnapshotGroupWithHttpInfo) | **POST** /rollback-snapshot-group | 



## cloneSnapshotGroup

> List<WithTaskSnapshotGroup> cloneSnapshotGroup(contentLanguage, snapshotGroupCloneParams)



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

## cloneSnapshotGroupWithHttpInfo

> ApiResponse<List<WithTaskSnapshotGroup>> cloneSnapshotGroup cloneSnapshotGroupWithHttpInfo(contentLanguage, snapshotGroupCloneParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<List<WithTaskSnapshotGroup>> response = apiInstance.cloneSnapshotGroupWithHttpInfo(contentLanguage, snapshotGroupCloneParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotGroupApi#cloneSnapshotGroup");
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
 **snapshotGroupCloneParams** | [**List&lt;SnapshotGroupCloneParams&gt;**](SnapshotGroupCloneParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskSnapshotGroup&gt;**](WithTaskSnapshotGroup.md)>


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

> List<WithTaskDeleteSnapshotGroup> deleteSnapshotGroup(contentLanguage, snapshotGroupDeletionParams)



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

## deleteSnapshotGroupWithHttpInfo

> ApiResponse<List<WithTaskDeleteSnapshotGroup>> deleteSnapshotGroup deleteSnapshotGroupWithHttpInfo(contentLanguage, snapshotGroupDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<List<WithTaskDeleteSnapshotGroup>> response = apiInstance.deleteSnapshotGroupWithHttpInfo(contentLanguage, snapshotGroupDeletionParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotGroupApi#deleteSnapshotGroup");
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
 **snapshotGroupDeletionParams** | [**SnapshotGroupDeletionParams**](SnapshotGroupDeletionParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDeleteSnapshotGroup&gt;**](WithTaskDeleteSnapshotGroup.md)>


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

> List<SnapshotGroup> getSnapshotGroups(contentLanguage, getSnapshotGroupsRequestBody)



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

## getSnapshotGroupsWithHttpInfo

> ApiResponse<List<SnapshotGroup>> getSnapshotGroups getSnapshotGroupsWithHttpInfo(contentLanguage, getSnapshotGroupsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<List<SnapshotGroup>> response = apiInstance.getSnapshotGroupsWithHttpInfo(contentLanguage, getSnapshotGroupsRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotGroupApi#getSnapshotGroups");
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
 **getSnapshotGroupsRequestBody** | [**GetSnapshotGroupsRequestBody**](GetSnapshotGroupsRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;SnapshotGroup&gt;**](SnapshotGroup.md)>


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

## getSnapshotGroupsConnectionWithHttpInfo

> ApiResponse<SnapshotGroupConnection> getSnapshotGroupsConnection getSnapshotGroupsConnectionWithHttpInfo(contentLanguage, getSnapshotGroupsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<SnapshotGroupConnection> response = apiInstance.getSnapshotGroupsConnectionWithHttpInfo(contentLanguage, getSnapshotGroupsConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotGroupApi#getSnapshotGroupsConnection");
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
 **getSnapshotGroupsConnectionRequestBody** | [**GetSnapshotGroupsConnectionRequestBody**](GetSnapshotGroupsConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**SnapshotGroupConnection**](SnapshotGroupConnection.md)>


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

> List<WithTaskSnapshotGroup> keepSnapshotGroup(contentLanguage, snapshotGroupKeepParams)



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

## keepSnapshotGroupWithHttpInfo

> ApiResponse<List<WithTaskSnapshotGroup>> keepSnapshotGroup keepSnapshotGroupWithHttpInfo(contentLanguage, snapshotGroupKeepParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<List<WithTaskSnapshotGroup>> response = apiInstance.keepSnapshotGroupWithHttpInfo(contentLanguage, snapshotGroupKeepParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotGroupApi#keepSnapshotGroup");
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
 **snapshotGroupKeepParams** | [**SnapshotGroupKeepParams**](SnapshotGroupKeepParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskSnapshotGroup&gt;**](WithTaskSnapshotGroup.md)>


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

> List<WithTaskSnapshotGroup> rollbackSnapshotGroup(contentLanguage, snapshotGroupRollbackParams)



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

## rollbackSnapshotGroupWithHttpInfo

> ApiResponse<List<WithTaskSnapshotGroup>> rollbackSnapshotGroup rollbackSnapshotGroupWithHttpInfo(contentLanguage, snapshotGroupRollbackParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<List<WithTaskSnapshotGroup>> response = apiInstance.rollbackSnapshotGroupWithHttpInfo(contentLanguage, snapshotGroupRollbackParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotGroupApi#rollbackSnapshotGroup");
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
 **snapshotGroupRollbackParams** | [**SnapshotGroupRollbackParams**](SnapshotGroupRollbackParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskSnapshotGroup&gt;**](WithTaskSnapshotGroup.md)>


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

