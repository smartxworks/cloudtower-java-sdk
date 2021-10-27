# DatacenterApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDatacenter**](DatacenterApi.md#createDatacenter) | **POST** /create-datacenter | 
[**createDatacenterWithHttpInfo**](DatacenterApi.md#createDatacenterWithHttpInfo) | **POST** /create-datacenter | 
[**deleteDatacenter**](DatacenterApi.md#deleteDatacenter) | **POST** /delete-datacenter | 
[**deleteDatacenterWithHttpInfo**](DatacenterApi.md#deleteDatacenterWithHttpInfo) | **POST** /delete-datacenter | 
[**getDatacenters**](DatacenterApi.md#getDatacenters) | **POST** /get-datacenters | 
[**getDatacentersWithHttpInfo**](DatacenterApi.md#getDatacentersWithHttpInfo) | **POST** /get-datacenters | 
[**getDatacentersConnection**](DatacenterApi.md#getDatacentersConnection) | **POST** /get-datacenters-connection | 
[**getDatacentersConnectionWithHttpInfo**](DatacenterApi.md#getDatacentersConnectionWithHttpInfo) | **POST** /get-datacenters-connection | 
[**updateDatacenter**](DatacenterApi.md#updateDatacenter) | **POST** /update-datacenter | 
[**updateDatacenterWithHttpInfo**](DatacenterApi.md#updateDatacenterWithHttpInfo) | **POST** /update-datacenter | 



## createDatacenter

> List<WithTaskDatacenter> createDatacenter(contentLanguage, datacenterCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DatacenterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DatacenterApi apiInstance = new DatacenterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<DatacenterCreationParams> datacenterCreationParams = Arrays.asList(); // List<DatacenterCreationParams> | 
        try {
            List<WithTaskDatacenter> result = apiInstance.createDatacenter(contentLanguage, datacenterCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatacenterApi#createDatacenter");
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
 **datacenterCreationParams** | [**List&lt;DatacenterCreationParams&gt;**](DatacenterCreationParams.md)|  |

### Return type

[**List&lt;WithTaskDatacenter&gt;**](WithTaskDatacenter.md)


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

## createDatacenterWithHttpInfo

> ApiResponse<List<WithTaskDatacenter>> createDatacenter createDatacenterWithHttpInfo(contentLanguage, datacenterCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DatacenterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DatacenterApi apiInstance = new DatacenterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<DatacenterCreationParams> datacenterCreationParams = Arrays.asList(); // List<DatacenterCreationParams> | 
        try {
            ApiResponse<List<WithTaskDatacenter>> response = apiInstance.createDatacenterWithHttpInfo(contentLanguage, datacenterCreationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DatacenterApi#createDatacenter");
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
 **datacenterCreationParams** | [**List&lt;DatacenterCreationParams&gt;**](DatacenterCreationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDatacenter&gt;**](WithTaskDatacenter.md)>


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


## deleteDatacenter

> List<WithTaskDeleteDatacenter> deleteDatacenter(contentLanguage, datacenterDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DatacenterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DatacenterApi apiInstance = new DatacenterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        DatacenterDeletionParams datacenterDeletionParams = new DatacenterDeletionParams(); // DatacenterDeletionParams | 
        try {
            List<WithTaskDeleteDatacenter> result = apiInstance.deleteDatacenter(contentLanguage, datacenterDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatacenterApi#deleteDatacenter");
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
 **datacenterDeletionParams** | [**DatacenterDeletionParams**](DatacenterDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteDatacenter&gt;**](WithTaskDeleteDatacenter.md)


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

## deleteDatacenterWithHttpInfo

> ApiResponse<List<WithTaskDeleteDatacenter>> deleteDatacenter deleteDatacenterWithHttpInfo(contentLanguage, datacenterDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DatacenterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DatacenterApi apiInstance = new DatacenterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        DatacenterDeletionParams datacenterDeletionParams = new DatacenterDeletionParams(); // DatacenterDeletionParams | 
        try {
            ApiResponse<List<WithTaskDeleteDatacenter>> response = apiInstance.deleteDatacenterWithHttpInfo(contentLanguage, datacenterDeletionParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DatacenterApi#deleteDatacenter");
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
 **datacenterDeletionParams** | [**DatacenterDeletionParams**](DatacenterDeletionParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDeleteDatacenter&gt;**](WithTaskDeleteDatacenter.md)>


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


## getDatacenters

> List<Datacenter> getDatacenters(contentLanguage, getDatacentersRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DatacenterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DatacenterApi apiInstance = new DatacenterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetDatacentersRequestBody getDatacentersRequestBody = new GetDatacentersRequestBody(); // GetDatacentersRequestBody | 
        try {
            List<Datacenter> result = apiInstance.getDatacenters(contentLanguage, getDatacentersRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatacenterApi#getDatacenters");
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
 **getDatacentersRequestBody** | [**GetDatacentersRequestBody**](GetDatacentersRequestBody.md)|  |

### Return type

[**List&lt;Datacenter&gt;**](Datacenter.md)


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

## getDatacentersWithHttpInfo

> ApiResponse<List<Datacenter>> getDatacenters getDatacentersWithHttpInfo(contentLanguage, getDatacentersRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DatacenterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DatacenterApi apiInstance = new DatacenterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetDatacentersRequestBody getDatacentersRequestBody = new GetDatacentersRequestBody(); // GetDatacentersRequestBody | 
        try {
            ApiResponse<List<Datacenter>> response = apiInstance.getDatacentersWithHttpInfo(contentLanguage, getDatacentersRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DatacenterApi#getDatacenters");
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
 **getDatacentersRequestBody** | [**GetDatacentersRequestBody**](GetDatacentersRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;Datacenter&gt;**](Datacenter.md)>


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


## getDatacentersConnection

> DatacenterConnection getDatacentersConnection(contentLanguage, getDatacentersConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DatacenterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DatacenterApi apiInstance = new DatacenterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetDatacentersConnectionRequestBody getDatacentersConnectionRequestBody = new GetDatacentersConnectionRequestBody(); // GetDatacentersConnectionRequestBody | 
        try {
            DatacenterConnection result = apiInstance.getDatacentersConnection(contentLanguage, getDatacentersConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatacenterApi#getDatacentersConnection");
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
 **getDatacentersConnectionRequestBody** | [**GetDatacentersConnectionRequestBody**](GetDatacentersConnectionRequestBody.md)|  |

### Return type

[**DatacenterConnection**](DatacenterConnection.md)


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

## getDatacentersConnectionWithHttpInfo

> ApiResponse<DatacenterConnection> getDatacentersConnection getDatacentersConnectionWithHttpInfo(contentLanguage, getDatacentersConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DatacenterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DatacenterApi apiInstance = new DatacenterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetDatacentersConnectionRequestBody getDatacentersConnectionRequestBody = new GetDatacentersConnectionRequestBody(); // GetDatacentersConnectionRequestBody | 
        try {
            ApiResponse<DatacenterConnection> response = apiInstance.getDatacentersConnectionWithHttpInfo(contentLanguage, getDatacentersConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DatacenterApi#getDatacentersConnection");
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
 **getDatacentersConnectionRequestBody** | [**GetDatacentersConnectionRequestBody**](GetDatacentersConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**DatacenterConnection**](DatacenterConnection.md)>


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


## updateDatacenter

> List<WithTaskDatacenter> updateDatacenter(contentLanguage, datacenterUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DatacenterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DatacenterApi apiInstance = new DatacenterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        DatacenterUpdationParams datacenterUpdationParams = new DatacenterUpdationParams(); // DatacenterUpdationParams | 
        try {
            List<WithTaskDatacenter> result = apiInstance.updateDatacenter(contentLanguage, datacenterUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatacenterApi#updateDatacenter");
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
 **datacenterUpdationParams** | [**DatacenterUpdationParams**](DatacenterUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskDatacenter&gt;**](WithTaskDatacenter.md)


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

## updateDatacenterWithHttpInfo

> ApiResponse<List<WithTaskDatacenter>> updateDatacenter updateDatacenterWithHttpInfo(contentLanguage, datacenterUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DatacenterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DatacenterApi apiInstance = new DatacenterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        DatacenterUpdationParams datacenterUpdationParams = new DatacenterUpdationParams(); // DatacenterUpdationParams | 
        try {
            ApiResponse<List<WithTaskDatacenter>> response = apiInstance.updateDatacenterWithHttpInfo(contentLanguage, datacenterUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DatacenterApi#updateDatacenter");
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
 **datacenterUpdationParams** | [**DatacenterUpdationParams**](DatacenterUpdationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDatacenter&gt;**](WithTaskDatacenter.md)>


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

