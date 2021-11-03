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

> List&lt;WithTaskEntityFilter&gt; createEntityFilter(entityFilterCreationParams, contentLanguage)



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
        List<EntityFilterCreationParams> entityFilterCreationParams = Arrays.asList(); // List<EntityFilterCreationParams> | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskEntityFilter> result = apiInstance.createEntityFilter(entityFilterCreationParams, contentLanguage);
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
 **entityFilterCreationParams** | [**List&lt;EntityFilterCreationParams&gt;**](EntityFilterCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

> List&lt;WithTaskDeleteEntityFilter&gt; deleteEntityFilter(entityFilterDeletionParams, contentLanguage)



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
        EntityFilterDeletionParams entityFilterDeletionParams = new EntityFilterDeletionParams(); // EntityFilterDeletionParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskDeleteEntityFilter> result = apiInstance.deleteEntityFilter(entityFilterDeletionParams, contentLanguage);
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
 **entityFilterDeletionParams** | [**EntityFilterDeletionParams**](EntityFilterDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

> List&lt;EntityFilter&gt; getEntityFilters(getEntityFiltersRequestBody, contentLanguage)



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
        GetEntityFiltersRequestBody getEntityFiltersRequestBody = new GetEntityFiltersRequestBody(); // GetEntityFiltersRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<EntityFilter> result = apiInstance.getEntityFilters(getEntityFiltersRequestBody, contentLanguage);
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
 **getEntityFiltersRequestBody** | [**GetEntityFiltersRequestBody**](GetEntityFiltersRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

> EntityFilterConnection getEntityFiltersConnection(getEntityFiltersConnectionRequestBody, contentLanguage)



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
        GetEntityFiltersConnectionRequestBody getEntityFiltersConnectionRequestBody = new GetEntityFiltersConnectionRequestBody(); // GetEntityFiltersConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            EntityFilterConnection result = apiInstance.getEntityFiltersConnection(getEntityFiltersConnectionRequestBody, contentLanguage);
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
 **getEntityFiltersConnectionRequestBody** | [**GetEntityFiltersConnectionRequestBody**](GetEntityFiltersConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

> List&lt;WithTaskEntityFilter&gt; updateEntityFilter(entityFilterUpdationParams, contentLanguage)



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
        EntityFilterUpdationParams entityFilterUpdationParams = new EntityFilterUpdationParams(); // EntityFilterUpdationParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskEntityFilter> result = apiInstance.updateEntityFilter(entityFilterUpdationParams, contentLanguage);
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
 **entityFilterUpdationParams** | [**EntityFilterUpdationParams**](EntityFilterUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

