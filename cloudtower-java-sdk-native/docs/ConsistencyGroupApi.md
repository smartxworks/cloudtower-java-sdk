# ConsistencyGroupApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConsistencyGroup**](ConsistencyGroupApi.md#createConsistencyGroup) | **POST** /create-consistency-group | 
[**createConsistencyGroupWithHttpInfo**](ConsistencyGroupApi.md#createConsistencyGroupWithHttpInfo) | **POST** /create-consistency-group | 
[**deleteConsistencyGroup**](ConsistencyGroupApi.md#deleteConsistencyGroup) | **POST** /delete-consistency-group | 
[**deleteConsistencyGroupWithHttpInfo**](ConsistencyGroupApi.md#deleteConsistencyGroupWithHttpInfo) | **POST** /delete-consistency-group | 
[**getConsistencyGroups**](ConsistencyGroupApi.md#getConsistencyGroups) | **POST** /get-consistency-groups | 
[**getConsistencyGroupsWithHttpInfo**](ConsistencyGroupApi.md#getConsistencyGroupsWithHttpInfo) | **POST** /get-consistency-groups | 
[**getConsistencyGroupsConnection**](ConsistencyGroupApi.md#getConsistencyGroupsConnection) | **POST** /get-consistency-groups-connection | 
[**getConsistencyGroupsConnectionWithHttpInfo**](ConsistencyGroupApi.md#getConsistencyGroupsConnectionWithHttpInfo) | **POST** /get-consistency-groups-connection | 
[**updateConsistencyGroup**](ConsistencyGroupApi.md#updateConsistencyGroup) | **POST** /update-consistency-group | 
[**updateConsistencyGroupWithHttpInfo**](ConsistencyGroupApi.md#updateConsistencyGroupWithHttpInfo) | **POST** /update-consistency-group | 



## createConsistencyGroup

> List<WithTaskConsistencyGroup> createConsistencyGroup(contentLanguage, consistencyGroupCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ConsistencyGroupApi apiInstance = new ConsistencyGroupApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<ConsistencyGroupCreationParams> consistencyGroupCreationParams = Arrays.asList(); // List<ConsistencyGroupCreationParams> | 
        try {
            List<WithTaskConsistencyGroup> result = apiInstance.createConsistencyGroup(contentLanguage, consistencyGroupCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyGroupApi#createConsistencyGroup");
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
 **consistencyGroupCreationParams** | [**List&lt;ConsistencyGroupCreationParams&gt;**](ConsistencyGroupCreationParams.md)|  |

### Return type

[**List&lt;WithTaskConsistencyGroup&gt;**](WithTaskConsistencyGroup.md)


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

## createConsistencyGroupWithHttpInfo

> ApiResponse<List<WithTaskConsistencyGroup>> createConsistencyGroup createConsistencyGroupWithHttpInfo(contentLanguage, consistencyGroupCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ConsistencyGroupApi apiInstance = new ConsistencyGroupApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<ConsistencyGroupCreationParams> consistencyGroupCreationParams = Arrays.asList(); // List<ConsistencyGroupCreationParams> | 
        try {
            ApiResponse<List<WithTaskConsistencyGroup>> response = apiInstance.createConsistencyGroupWithHttpInfo(contentLanguage, consistencyGroupCreationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyGroupApi#createConsistencyGroup");
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
 **consistencyGroupCreationParams** | [**List&lt;ConsistencyGroupCreationParams&gt;**](ConsistencyGroupCreationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskConsistencyGroup&gt;**](WithTaskConsistencyGroup.md)>


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


## deleteConsistencyGroup

> List<WithTaskDeleteConsistencyGroup> deleteConsistencyGroup(contentLanguage, consistencyGroupDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ConsistencyGroupApi apiInstance = new ConsistencyGroupApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        ConsistencyGroupDeletionParams consistencyGroupDeletionParams = new ConsistencyGroupDeletionParams(); // ConsistencyGroupDeletionParams | 
        try {
            List<WithTaskDeleteConsistencyGroup> result = apiInstance.deleteConsistencyGroup(contentLanguage, consistencyGroupDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyGroupApi#deleteConsistencyGroup");
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
 **consistencyGroupDeletionParams** | [**ConsistencyGroupDeletionParams**](ConsistencyGroupDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteConsistencyGroup&gt;**](WithTaskDeleteConsistencyGroup.md)


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

## deleteConsistencyGroupWithHttpInfo

> ApiResponse<List<WithTaskDeleteConsistencyGroup>> deleteConsistencyGroup deleteConsistencyGroupWithHttpInfo(contentLanguage, consistencyGroupDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ConsistencyGroupApi apiInstance = new ConsistencyGroupApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        ConsistencyGroupDeletionParams consistencyGroupDeletionParams = new ConsistencyGroupDeletionParams(); // ConsistencyGroupDeletionParams | 
        try {
            ApiResponse<List<WithTaskDeleteConsistencyGroup>> response = apiInstance.deleteConsistencyGroupWithHttpInfo(contentLanguage, consistencyGroupDeletionParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyGroupApi#deleteConsistencyGroup");
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
 **consistencyGroupDeletionParams** | [**ConsistencyGroupDeletionParams**](ConsistencyGroupDeletionParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDeleteConsistencyGroup&gt;**](WithTaskDeleteConsistencyGroup.md)>


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


## getConsistencyGroups

> List<ConsistencyGroup> getConsistencyGroups(contentLanguage, getConsistencyGroupsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ConsistencyGroupApi apiInstance = new ConsistencyGroupApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetConsistencyGroupsRequestBody getConsistencyGroupsRequestBody = new GetConsistencyGroupsRequestBody(); // GetConsistencyGroupsRequestBody | 
        try {
            List<ConsistencyGroup> result = apiInstance.getConsistencyGroups(contentLanguage, getConsistencyGroupsRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyGroupApi#getConsistencyGroups");
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
 **getConsistencyGroupsRequestBody** | [**GetConsistencyGroupsRequestBody**](GetConsistencyGroupsRequestBody.md)|  |

### Return type

[**List&lt;ConsistencyGroup&gt;**](ConsistencyGroup.md)


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

## getConsistencyGroupsWithHttpInfo

> ApiResponse<List<ConsistencyGroup>> getConsistencyGroups getConsistencyGroupsWithHttpInfo(contentLanguage, getConsistencyGroupsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ConsistencyGroupApi apiInstance = new ConsistencyGroupApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetConsistencyGroupsRequestBody getConsistencyGroupsRequestBody = new GetConsistencyGroupsRequestBody(); // GetConsistencyGroupsRequestBody | 
        try {
            ApiResponse<List<ConsistencyGroup>> response = apiInstance.getConsistencyGroupsWithHttpInfo(contentLanguage, getConsistencyGroupsRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyGroupApi#getConsistencyGroups");
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
 **getConsistencyGroupsRequestBody** | [**GetConsistencyGroupsRequestBody**](GetConsistencyGroupsRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;ConsistencyGroup&gt;**](ConsistencyGroup.md)>


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


## getConsistencyGroupsConnection

> ConsistencyGroupConnection getConsistencyGroupsConnection(contentLanguage, getConsistencyGroupsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ConsistencyGroupApi apiInstance = new ConsistencyGroupApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetConsistencyGroupsConnectionRequestBody getConsistencyGroupsConnectionRequestBody = new GetConsistencyGroupsConnectionRequestBody(); // GetConsistencyGroupsConnectionRequestBody | 
        try {
            ConsistencyGroupConnection result = apiInstance.getConsistencyGroupsConnection(contentLanguage, getConsistencyGroupsConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyGroupApi#getConsistencyGroupsConnection");
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
 **getConsistencyGroupsConnectionRequestBody** | [**GetConsistencyGroupsConnectionRequestBody**](GetConsistencyGroupsConnectionRequestBody.md)|  |

### Return type

[**ConsistencyGroupConnection**](ConsistencyGroupConnection.md)


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

## getConsistencyGroupsConnectionWithHttpInfo

> ApiResponse<ConsistencyGroupConnection> getConsistencyGroupsConnection getConsistencyGroupsConnectionWithHttpInfo(contentLanguage, getConsistencyGroupsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ConsistencyGroupApi apiInstance = new ConsistencyGroupApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetConsistencyGroupsConnectionRequestBody getConsistencyGroupsConnectionRequestBody = new GetConsistencyGroupsConnectionRequestBody(); // GetConsistencyGroupsConnectionRequestBody | 
        try {
            ApiResponse<ConsistencyGroupConnection> response = apiInstance.getConsistencyGroupsConnectionWithHttpInfo(contentLanguage, getConsistencyGroupsConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyGroupApi#getConsistencyGroupsConnection");
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
 **getConsistencyGroupsConnectionRequestBody** | [**GetConsistencyGroupsConnectionRequestBody**](GetConsistencyGroupsConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**ConsistencyGroupConnection**](ConsistencyGroupConnection.md)>


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


## updateConsistencyGroup

> List<WithTaskConsistencyGroup> updateConsistencyGroup(contentLanguage, consistencyGroupUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ConsistencyGroupApi apiInstance = new ConsistencyGroupApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        ConsistencyGroupUpdationParams consistencyGroupUpdationParams = new ConsistencyGroupUpdationParams(); // ConsistencyGroupUpdationParams | 
        try {
            List<WithTaskConsistencyGroup> result = apiInstance.updateConsistencyGroup(contentLanguage, consistencyGroupUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyGroupApi#updateConsistencyGroup");
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
 **consistencyGroupUpdationParams** | [**ConsistencyGroupUpdationParams**](ConsistencyGroupUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskConsistencyGroup&gt;**](WithTaskConsistencyGroup.md)


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

## updateConsistencyGroupWithHttpInfo

> ApiResponse<List<WithTaskConsistencyGroup>> updateConsistencyGroup updateConsistencyGroupWithHttpInfo(contentLanguage, consistencyGroupUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ConsistencyGroupApi apiInstance = new ConsistencyGroupApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        ConsistencyGroupUpdationParams consistencyGroupUpdationParams = new ConsistencyGroupUpdationParams(); // ConsistencyGroupUpdationParams | 
        try {
            ApiResponse<List<WithTaskConsistencyGroup>> response = apiInstance.updateConsistencyGroupWithHttpInfo(contentLanguage, consistencyGroupUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsistencyGroupApi#updateConsistencyGroup");
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
 **consistencyGroupUpdationParams** | [**ConsistencyGroupUpdationParams**](ConsistencyGroupUpdationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskConsistencyGroup&gt;**](WithTaskConsistencyGroup.md)>


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

