# ViewApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createView**](ViewApi.md#createView) | **POST** /create-view | 
[**createViewWithHttpInfo**](ViewApi.md#createViewWithHttpInfo) | **POST** /create-view | 
[**deleteView**](ViewApi.md#deleteView) | **POST** /delete-view | 
[**deleteViewWithHttpInfo**](ViewApi.md#deleteViewWithHttpInfo) | **POST** /delete-view | 
[**getViews**](ViewApi.md#getViews) | **POST** /get-views | 
[**getViewsWithHttpInfo**](ViewApi.md#getViewsWithHttpInfo) | **POST** /get-views | 
[**getViewsConnection**](ViewApi.md#getViewsConnection) | **POST** /get-views-connection | 
[**getViewsConnectionWithHttpInfo**](ViewApi.md#getViewsConnectionWithHttpInfo) | **POST** /get-views-connection | 
[**updateView**](ViewApi.md#updateView) | **POST** /update-view | 
[**updateViewWithHttpInfo**](ViewApi.md#updateViewWithHttpInfo) | **POST** /update-view | 



## createView

> List<WithTaskView> createView(contentLanguage, viewCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ViewApi apiInstance = new ViewApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<ViewCreationParams> viewCreationParams = Arrays.asList(); // List<ViewCreationParams> | 
        try {
            List<WithTaskView> result = apiInstance.createView(contentLanguage, viewCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ViewApi#createView");
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
 **viewCreationParams** | [**List&lt;ViewCreationParams&gt;**](ViewCreationParams.md)|  |

### Return type

[**List&lt;WithTaskView&gt;**](WithTaskView.md)


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

## createViewWithHttpInfo

> ApiResponse<List<WithTaskView>> createView createViewWithHttpInfo(contentLanguage, viewCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ViewApi apiInstance = new ViewApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<ViewCreationParams> viewCreationParams = Arrays.asList(); // List<ViewCreationParams> | 
        try {
            ApiResponse<List<WithTaskView>> response = apiInstance.createViewWithHttpInfo(contentLanguage, viewCreationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ViewApi#createView");
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
 **viewCreationParams** | [**List&lt;ViewCreationParams&gt;**](ViewCreationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskView&gt;**](WithTaskView.md)>


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


## deleteView

> List<WithTaskDeleteView> deleteView(contentLanguage, viewDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ViewApi apiInstance = new ViewApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        ViewDeletionParams viewDeletionParams = new ViewDeletionParams(); // ViewDeletionParams | 
        try {
            List<WithTaskDeleteView> result = apiInstance.deleteView(contentLanguage, viewDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ViewApi#deleteView");
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
 **viewDeletionParams** | [**ViewDeletionParams**](ViewDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteView&gt;**](WithTaskDeleteView.md)


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

## deleteViewWithHttpInfo

> ApiResponse<List<WithTaskDeleteView>> deleteView deleteViewWithHttpInfo(contentLanguage, viewDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ViewApi apiInstance = new ViewApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        ViewDeletionParams viewDeletionParams = new ViewDeletionParams(); // ViewDeletionParams | 
        try {
            ApiResponse<List<WithTaskDeleteView>> response = apiInstance.deleteViewWithHttpInfo(contentLanguage, viewDeletionParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ViewApi#deleteView");
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
 **viewDeletionParams** | [**ViewDeletionParams**](ViewDeletionParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDeleteView&gt;**](WithTaskDeleteView.md)>


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


## getViews

> List<View> getViews(contentLanguage, getViewsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ViewApi apiInstance = new ViewApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetViewsRequestBody getViewsRequestBody = new GetViewsRequestBody(); // GetViewsRequestBody | 
        try {
            List<View> result = apiInstance.getViews(contentLanguage, getViewsRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ViewApi#getViews");
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
 **getViewsRequestBody** | [**GetViewsRequestBody**](GetViewsRequestBody.md)|  |

### Return type

[**List&lt;View&gt;**](View.md)


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

## getViewsWithHttpInfo

> ApiResponse<List<View>> getViews getViewsWithHttpInfo(contentLanguage, getViewsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ViewApi apiInstance = new ViewApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetViewsRequestBody getViewsRequestBody = new GetViewsRequestBody(); // GetViewsRequestBody | 
        try {
            ApiResponse<List<View>> response = apiInstance.getViewsWithHttpInfo(contentLanguage, getViewsRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ViewApi#getViews");
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
 **getViewsRequestBody** | [**GetViewsRequestBody**](GetViewsRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;View&gt;**](View.md)>


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


## getViewsConnection

> ViewConnection getViewsConnection(contentLanguage, getViewsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ViewApi apiInstance = new ViewApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetViewsConnectionRequestBody getViewsConnectionRequestBody = new GetViewsConnectionRequestBody(); // GetViewsConnectionRequestBody | 
        try {
            ViewConnection result = apiInstance.getViewsConnection(contentLanguage, getViewsConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ViewApi#getViewsConnection");
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
 **getViewsConnectionRequestBody** | [**GetViewsConnectionRequestBody**](GetViewsConnectionRequestBody.md)|  |

### Return type

[**ViewConnection**](ViewConnection.md)


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

## getViewsConnectionWithHttpInfo

> ApiResponse<ViewConnection> getViewsConnection getViewsConnectionWithHttpInfo(contentLanguage, getViewsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ViewApi apiInstance = new ViewApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetViewsConnectionRequestBody getViewsConnectionRequestBody = new GetViewsConnectionRequestBody(); // GetViewsConnectionRequestBody | 
        try {
            ApiResponse<ViewConnection> response = apiInstance.getViewsConnectionWithHttpInfo(contentLanguage, getViewsConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ViewApi#getViewsConnection");
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
 **getViewsConnectionRequestBody** | [**GetViewsConnectionRequestBody**](GetViewsConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**ViewConnection**](ViewConnection.md)>


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


## updateView

> List<WithTaskView> updateView(contentLanguage, viewUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ViewApi apiInstance = new ViewApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        ViewUpdationParams viewUpdationParams = new ViewUpdationParams(); // ViewUpdationParams | 
        try {
            List<WithTaskView> result = apiInstance.updateView(contentLanguage, viewUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ViewApi#updateView");
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
 **viewUpdationParams** | [**ViewUpdationParams**](ViewUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskView&gt;**](WithTaskView.md)


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

## updateViewWithHttpInfo

> ApiResponse<List<WithTaskView>> updateView updateViewWithHttpInfo(contentLanguage, viewUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ViewApi apiInstance = new ViewApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        ViewUpdationParams viewUpdationParams = new ViewUpdationParams(); // ViewUpdationParams | 
        try {
            ApiResponse<List<WithTaskView>> response = apiInstance.updateViewWithHttpInfo(contentLanguage, viewUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ViewApi#updateView");
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
 **viewUpdationParams** | [**ViewUpdationParams**](ViewUpdationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskView&gt;**](WithTaskView.md)>


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

