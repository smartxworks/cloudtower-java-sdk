# GraphApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGraph**](GraphApi.md#createGraph) | **POST** /create-graph | 
[**createGraphWithHttpInfo**](GraphApi.md#createGraphWithHttpInfo) | **POST** /create-graph | 
[**deleteGraph**](GraphApi.md#deleteGraph) | **POST** /delete-graph | 
[**deleteGraphWithHttpInfo**](GraphApi.md#deleteGraphWithHttpInfo) | **POST** /delete-graph | 
[**getGraphs**](GraphApi.md#getGraphs) | **POST** /get-graphs | 
[**getGraphsWithHttpInfo**](GraphApi.md#getGraphsWithHttpInfo) | **POST** /get-graphs | 
[**getGraphsConnection**](GraphApi.md#getGraphsConnection) | **POST** /get-graphs-connection | 
[**getGraphsConnectionWithHttpInfo**](GraphApi.md#getGraphsConnectionWithHttpInfo) | **POST** /get-graphs-connection | 
[**updateGraph**](GraphApi.md#updateGraph) | **POST** /update-graph | 
[**updateGraphWithHttpInfo**](GraphApi.md#updateGraphWithHttpInfo) | **POST** /update-graph | 



## createGraph

> List<WithTaskGraph> createGraph(contentLanguage, graphCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.GraphApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        GraphApi apiInstance = new GraphApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<GraphCreationParams> graphCreationParams = Arrays.asList(); // List<GraphCreationParams> | 
        try {
            List<WithTaskGraph> result = apiInstance.createGraph(contentLanguage, graphCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GraphApi#createGraph");
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
 **graphCreationParams** | [**List&lt;GraphCreationParams&gt;**](GraphCreationParams.md)|  |

### Return type

[**List&lt;WithTaskGraph&gt;**](WithTaskGraph.md)


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

## createGraphWithHttpInfo

> ApiResponse<List<WithTaskGraph>> createGraph createGraphWithHttpInfo(contentLanguage, graphCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.GraphApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        GraphApi apiInstance = new GraphApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<GraphCreationParams> graphCreationParams = Arrays.asList(); // List<GraphCreationParams> | 
        try {
            ApiResponse<List<WithTaskGraph>> response = apiInstance.createGraphWithHttpInfo(contentLanguage, graphCreationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GraphApi#createGraph");
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
 **graphCreationParams** | [**List&lt;GraphCreationParams&gt;**](GraphCreationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskGraph&gt;**](WithTaskGraph.md)>


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


## deleteGraph

> List<WithTaskDeleteGraph> deleteGraph(contentLanguage, graphDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.GraphApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        GraphApi apiInstance = new GraphApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GraphDeletionParams graphDeletionParams = new GraphDeletionParams(); // GraphDeletionParams | 
        try {
            List<WithTaskDeleteGraph> result = apiInstance.deleteGraph(contentLanguage, graphDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GraphApi#deleteGraph");
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
 **graphDeletionParams** | [**GraphDeletionParams**](GraphDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteGraph&gt;**](WithTaskDeleteGraph.md)


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

## deleteGraphWithHttpInfo

> ApiResponse<List<WithTaskDeleteGraph>> deleteGraph deleteGraphWithHttpInfo(contentLanguage, graphDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.GraphApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        GraphApi apiInstance = new GraphApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GraphDeletionParams graphDeletionParams = new GraphDeletionParams(); // GraphDeletionParams | 
        try {
            ApiResponse<List<WithTaskDeleteGraph>> response = apiInstance.deleteGraphWithHttpInfo(contentLanguage, graphDeletionParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GraphApi#deleteGraph");
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
 **graphDeletionParams** | [**GraphDeletionParams**](GraphDeletionParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDeleteGraph&gt;**](WithTaskDeleteGraph.md)>


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


## getGraphs

> List<Graph> getGraphs(contentLanguage, getGraphsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.GraphApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        GraphApi apiInstance = new GraphApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetGraphsRequestBody getGraphsRequestBody = new GetGraphsRequestBody(); // GetGraphsRequestBody | 
        try {
            List<Graph> result = apiInstance.getGraphs(contentLanguage, getGraphsRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GraphApi#getGraphs");
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
 **getGraphsRequestBody** | [**GetGraphsRequestBody**](GetGraphsRequestBody.md)|  |

### Return type

[**List&lt;Graph&gt;**](Graph.md)


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

## getGraphsWithHttpInfo

> ApiResponse<List<Graph>> getGraphs getGraphsWithHttpInfo(contentLanguage, getGraphsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.GraphApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        GraphApi apiInstance = new GraphApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetGraphsRequestBody getGraphsRequestBody = new GetGraphsRequestBody(); // GetGraphsRequestBody | 
        try {
            ApiResponse<List<Graph>> response = apiInstance.getGraphsWithHttpInfo(contentLanguage, getGraphsRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GraphApi#getGraphs");
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
 **getGraphsRequestBody** | [**GetGraphsRequestBody**](GetGraphsRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;Graph&gt;**](Graph.md)>


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


## getGraphsConnection

> GraphConnection getGraphsConnection(contentLanguage, getGraphsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.GraphApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        GraphApi apiInstance = new GraphApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetGraphsConnectionRequestBody getGraphsConnectionRequestBody = new GetGraphsConnectionRequestBody(); // GetGraphsConnectionRequestBody | 
        try {
            GraphConnection result = apiInstance.getGraphsConnection(contentLanguage, getGraphsConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GraphApi#getGraphsConnection");
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
 **getGraphsConnectionRequestBody** | [**GetGraphsConnectionRequestBody**](GetGraphsConnectionRequestBody.md)|  |

### Return type

[**GraphConnection**](GraphConnection.md)


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

## getGraphsConnectionWithHttpInfo

> ApiResponse<GraphConnection> getGraphsConnection getGraphsConnectionWithHttpInfo(contentLanguage, getGraphsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.GraphApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        GraphApi apiInstance = new GraphApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetGraphsConnectionRequestBody getGraphsConnectionRequestBody = new GetGraphsConnectionRequestBody(); // GetGraphsConnectionRequestBody | 
        try {
            ApiResponse<GraphConnection> response = apiInstance.getGraphsConnectionWithHttpInfo(contentLanguage, getGraphsConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GraphApi#getGraphsConnection");
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
 **getGraphsConnectionRequestBody** | [**GetGraphsConnectionRequestBody**](GetGraphsConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**GraphConnection**](GraphConnection.md)>


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


## updateGraph

> List<WithTaskGraph> updateGraph(contentLanguage, graphUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.GraphApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        GraphApi apiInstance = new GraphApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GraphUpdationParams graphUpdationParams = new GraphUpdationParams(); // GraphUpdationParams | 
        try {
            List<WithTaskGraph> result = apiInstance.updateGraph(contentLanguage, graphUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GraphApi#updateGraph");
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
 **graphUpdationParams** | [**GraphUpdationParams**](GraphUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskGraph&gt;**](WithTaskGraph.md)


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

## updateGraphWithHttpInfo

> ApiResponse<List<WithTaskGraph>> updateGraph updateGraphWithHttpInfo(contentLanguage, graphUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.GraphApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        GraphApi apiInstance = new GraphApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GraphUpdationParams graphUpdationParams = new GraphUpdationParams(); // GraphUpdationParams | 
        try {
            ApiResponse<List<WithTaskGraph>> response = apiInstance.updateGraphWithHttpInfo(contentLanguage, graphUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GraphApi#updateGraph");
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
 **graphUpdationParams** | [**GraphUpdationParams**](GraphUpdationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskGraph&gt;**](WithTaskGraph.md)>


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

