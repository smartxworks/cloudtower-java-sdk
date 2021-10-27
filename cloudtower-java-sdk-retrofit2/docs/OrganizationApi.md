# OrganizationApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrganization**](OrganizationApi.md#createOrganization) | **POST** create-organization | 
[**deleteOrganization**](OrganizationApi.md#deleteOrganization) | **POST** delete-organization | 
[**getOrganizations**](OrganizationApi.md#getOrganizations) | **POST** get-organizations | 
[**getOrganizationsConnection**](OrganizationApi.md#getOrganizationsConnection) | **POST** get-organizations-connection | 
[**updateOrganization**](OrganizationApi.md#updateOrganization) | **POST** update-organization | 



## createOrganization

> List&lt;WithTaskOrganization&gt; createOrganization(contentLanguage, organizationCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.OrganizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        OrganizationApi apiInstance = new OrganizationApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<OrganizationCreationParams> organizationCreationParams = Arrays.asList(); // List<OrganizationCreationParams> | 
        try {
            List<WithTaskOrganization> result = apiInstance.createOrganization(contentLanguage, organizationCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationApi#createOrganization");
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
 **organizationCreationParams** | [**List&lt;OrganizationCreationParams&gt;**](OrganizationCreationParams.md)|  |

### Return type

[**List&lt;WithTaskOrganization&gt;**](WithTaskOrganization.md)

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


## deleteOrganization

> List&lt;WithTaskDeleteOrganization&gt; deleteOrganization(contentLanguage, organizationDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.OrganizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        OrganizationApi apiInstance = new OrganizationApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        OrganizationDeletionParams organizationDeletionParams = new OrganizationDeletionParams(); // OrganizationDeletionParams | 
        try {
            List<WithTaskDeleteOrganization> result = apiInstance.deleteOrganization(contentLanguage, organizationDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationApi#deleteOrganization");
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
 **organizationDeletionParams** | [**OrganizationDeletionParams**](OrganizationDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteOrganization&gt;**](WithTaskDeleteOrganization.md)

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


## getOrganizations

> List&lt;Organization&gt; getOrganizations(contentLanguage, getOrganizationsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.OrganizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        OrganizationApi apiInstance = new OrganizationApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetOrganizationsRequestBody getOrganizationsRequestBody = new GetOrganizationsRequestBody(); // GetOrganizationsRequestBody | 
        try {
            List<Organization> result = apiInstance.getOrganizations(contentLanguage, getOrganizationsRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationApi#getOrganizations");
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
 **getOrganizationsRequestBody** | [**GetOrganizationsRequestBody**](GetOrganizationsRequestBody.md)|  |

### Return type

[**List&lt;Organization&gt;**](Organization.md)

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


## getOrganizationsConnection

> OrganizationConnection getOrganizationsConnection(contentLanguage, getOrganizationsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.OrganizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        OrganizationApi apiInstance = new OrganizationApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetOrganizationsConnectionRequestBody getOrganizationsConnectionRequestBody = new GetOrganizationsConnectionRequestBody(); // GetOrganizationsConnectionRequestBody | 
        try {
            OrganizationConnection result = apiInstance.getOrganizationsConnection(contentLanguage, getOrganizationsConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationApi#getOrganizationsConnection");
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
 **getOrganizationsConnectionRequestBody** | [**GetOrganizationsConnectionRequestBody**](GetOrganizationsConnectionRequestBody.md)|  |

### Return type

[**OrganizationConnection**](OrganizationConnection.md)

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


## updateOrganization

> List&lt;WithTaskOrganization&gt; updateOrganization(contentLanguage, organizationUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.OrganizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        OrganizationApi apiInstance = new OrganizationApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        OrganizationUpdationParams organizationUpdationParams = new OrganizationUpdationParams(); // OrganizationUpdationParams | 
        try {
            List<WithTaskOrganization> result = apiInstance.updateOrganization(contentLanguage, organizationUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationApi#updateOrganization");
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
 **organizationUpdationParams** | [**OrganizationUpdationParams**](OrganizationUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskOrganization&gt;**](WithTaskOrganization.md)

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

