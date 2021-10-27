# EntityFilterApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEntityFilter**](EntityFilterApi.md#createEntityFilter) | **POST** create-entity-filter | 
[**deleteEntityFilter**](EntityFilterApi.md#deleteEntityFilter) | **POST** delete-entity-filter | 
[**getEntityFilters**](EntityFilterApi.md#getEntityFilters) | **POST** get-entity-filters | 
[**getEntityFiltersConnection**](EntityFilterApi.md#getEntityFiltersConnection) | **POST** get-entity-filters-connection | 
[**updateEntityFilter**](EntityFilterApi.md#updateEntityFilter) | **POST** update-entity-filter | 



## createEntityFilter

> List&lt;WithTaskEntityFilter&gt; createEntityFilter(contentLanguage, entityFilterCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.EntityFilterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        EntityFilterApi apiInstance = new EntityFilterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<EntityFilterCreationParams> entityFilterCreationParams = Arrays.asList(); // List<EntityFilterCreationParams> | 
        try {
            List<WithTaskEntityFilter> result = apiInstance.createEntityFilter(contentLanguage, entityFilterCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EntityFilterApi#createEntityFilter");
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
 **entityFilterCreationParams** | [**List&lt;EntityFilterCreationParams&gt;**](EntityFilterCreationParams.md)|  |

### Return type

[**List&lt;WithTaskEntityFilter&gt;**](WithTaskEntityFilter.md)

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


## deleteEntityFilter

> List&lt;WithTaskDeleteEntityFilter&gt; deleteEntityFilter(contentLanguage, entityFilterDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.EntityFilterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        EntityFilterApi apiInstance = new EntityFilterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        EntityFilterDeletionParams entityFilterDeletionParams = new EntityFilterDeletionParams(); // EntityFilterDeletionParams | 
        try {
            List<WithTaskDeleteEntityFilter> result = apiInstance.deleteEntityFilter(contentLanguage, entityFilterDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EntityFilterApi#deleteEntityFilter");
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
 **entityFilterDeletionParams** | [**EntityFilterDeletionParams**](EntityFilterDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteEntityFilter&gt;**](WithTaskDeleteEntityFilter.md)

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


## getEntityFilters

> List&lt;EntityFilter&gt; getEntityFilters(contentLanguage, getEntityFiltersRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.EntityFilterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        EntityFilterApi apiInstance = new EntityFilterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetEntityFiltersRequestBody getEntityFiltersRequestBody = new GetEntityFiltersRequestBody(); // GetEntityFiltersRequestBody | 
        try {
            List<EntityFilter> result = apiInstance.getEntityFilters(contentLanguage, getEntityFiltersRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EntityFilterApi#getEntityFilters");
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
 **getEntityFiltersRequestBody** | [**GetEntityFiltersRequestBody**](GetEntityFiltersRequestBody.md)|  |

### Return type

[**List&lt;EntityFilter&gt;**](EntityFilter.md)

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


## getEntityFiltersConnection

> EntityFilterConnection getEntityFiltersConnection(contentLanguage, getEntityFiltersConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.EntityFilterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        EntityFilterApi apiInstance = new EntityFilterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetEntityFiltersConnectionRequestBody getEntityFiltersConnectionRequestBody = new GetEntityFiltersConnectionRequestBody(); // GetEntityFiltersConnectionRequestBody | 
        try {
            EntityFilterConnection result = apiInstance.getEntityFiltersConnection(contentLanguage, getEntityFiltersConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EntityFilterApi#getEntityFiltersConnection");
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
 **getEntityFiltersConnectionRequestBody** | [**GetEntityFiltersConnectionRequestBody**](GetEntityFiltersConnectionRequestBody.md)|  |

### Return type

[**EntityFilterConnection**](EntityFilterConnection.md)

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


## updateEntityFilter

> List&lt;WithTaskEntityFilter&gt; updateEntityFilter(contentLanguage, entityFilterUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.EntityFilterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        EntityFilterApi apiInstance = new EntityFilterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        EntityFilterUpdationParams entityFilterUpdationParams = new EntityFilterUpdationParams(); // EntityFilterUpdationParams | 
        try {
            List<WithTaskEntityFilter> result = apiInstance.updateEntityFilter(contentLanguage, entityFilterUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EntityFilterApi#updateEntityFilter");
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
 **entityFilterUpdationParams** | [**EntityFilterUpdationParams**](EntityFilterUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskEntityFilter&gt;**](WithTaskEntityFilter.md)

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

