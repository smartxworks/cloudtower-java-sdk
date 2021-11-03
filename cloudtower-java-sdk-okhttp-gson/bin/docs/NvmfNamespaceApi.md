# NvmfNamespaceApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneNvmfNamespaceFromSnapshot**](NvmfNamespaceApi.md#cloneNvmfNamespaceFromSnapshot) | **POST** /clone-nvmf-namespace-from-snapshot | 
[**createNvmfNamespace**](NvmfNamespaceApi.md#createNvmfNamespace) | **POST** /create-nvmf-namespace | 
[**deleteNvmfNamespace**](NvmfNamespaceApi.md#deleteNvmfNamespace) | **POST** /delete-nvmf-namespace | 
[**getNvmfNamespaces**](NvmfNamespaceApi.md#getNvmfNamespaces) | **POST** /get-nvmf-namespaces | 
[**getNvmfNamespacesConnection**](NvmfNamespaceApi.md#getNvmfNamespacesConnection) | **POST** /get-nvmf-namespaces-connection | 
[**rollbackNvmfNamespaceFromSnapshot**](NvmfNamespaceApi.md#rollbackNvmfNamespaceFromSnapshot) | **POST** /rollback-nvmf-namespace-from-snapshot | 
[**updateNvmfNamespace**](NvmfNamespaceApi.md#updateNvmfNamespace) | **POST** /update-nvmf-namespace | 


<a name="cloneNvmfNamespaceFromSnapshot"></a>
# **cloneNvmfNamespaceFromSnapshot**
> List&lt;WithTaskNvmfNamespace&gt; cloneNvmfNamespaceFromSnapshot(nvmfNamespaceCloneParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
    List<NvmfNamespaceCloneParams> nvmfNamespaceCloneParams = Arrays.asList(); // List<NvmfNamespaceCloneParams> | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskNvmfNamespace> result = apiInstance.cloneNvmfNamespaceFromSnapshot(nvmfNamespaceCloneParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NvmfNamespaceApi#cloneNvmfNamespaceFromSnapshot");
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
 **nvmfNamespaceCloneParams** | [**List&lt;NvmfNamespaceCloneParams&gt;**](NvmfNamespaceCloneParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskNvmfNamespace&gt;**](WithTaskNvmfNamespace.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** |  |  -  |

<a name="createNvmfNamespace"></a>
# **createNvmfNamespace**
> List&lt;WithTaskNvmfNamespace&gt; createNvmfNamespace(nvmfNamespaceCreationParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
    List<NvmfNamespaceCreationParams> nvmfNamespaceCreationParams = Arrays.asList(); // List<NvmfNamespaceCreationParams> | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskNvmfNamespace> result = apiInstance.createNvmfNamespace(nvmfNamespaceCreationParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NvmfNamespaceApi#createNvmfNamespace");
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
 **nvmfNamespaceCreationParams** | [**List&lt;NvmfNamespaceCreationParams&gt;**](NvmfNamespaceCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskNvmfNamespace&gt;**](WithTaskNvmfNamespace.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** |  |  -  |

<a name="deleteNvmfNamespace"></a>
# **deleteNvmfNamespace**
> List&lt;WithTaskDeleteNvmfNamespace&gt; deleteNvmfNamespace(nvmfNamespaceDeletionParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
    NvmfNamespaceDeletionParams nvmfNamespaceDeletionParams = new NvmfNamespaceDeletionParams(); // NvmfNamespaceDeletionParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskDeleteNvmfNamespace> result = apiInstance.deleteNvmfNamespace(nvmfNamespaceDeletionParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NvmfNamespaceApi#deleteNvmfNamespace");
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
 **nvmfNamespaceDeletionParams** | [**NvmfNamespaceDeletionParams**](NvmfNamespaceDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskDeleteNvmfNamespace&gt;**](WithTaskDeleteNvmfNamespace.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** |  |  -  |

<a name="getNvmfNamespaces"></a>
# **getNvmfNamespaces**
> List&lt;NvmfNamespace&gt; getNvmfNamespaces(getNvmfNamespacesRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
    GetNvmfNamespacesRequestBody getNvmfNamespacesRequestBody = new GetNvmfNamespacesRequestBody(); // GetNvmfNamespacesRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<NvmfNamespace> result = apiInstance.getNvmfNamespaces(getNvmfNamespacesRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NvmfNamespaceApi#getNvmfNamespaces");
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
 **getNvmfNamespacesRequestBody** | [**GetNvmfNamespacesRequestBody**](GetNvmfNamespacesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;NvmfNamespace&gt;**](NvmfNamespace.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** |  |  -  |

<a name="getNvmfNamespacesConnection"></a>
# **getNvmfNamespacesConnection**
> NvmfNamespaceConnection getNvmfNamespacesConnection(getNvmfNamespacesConnectionRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
    GetNvmfNamespacesConnectionRequestBody getNvmfNamespacesConnectionRequestBody = new GetNvmfNamespacesConnectionRequestBody(); // GetNvmfNamespacesConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      NvmfNamespaceConnection result = apiInstance.getNvmfNamespacesConnection(getNvmfNamespacesConnectionRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NvmfNamespaceApi#getNvmfNamespacesConnection");
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
 **getNvmfNamespacesConnectionRequestBody** | [**GetNvmfNamespacesConnectionRequestBody**](GetNvmfNamespacesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**NvmfNamespaceConnection**](NvmfNamespaceConnection.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** |  |  -  |

<a name="rollbackNvmfNamespaceFromSnapshot"></a>
# **rollbackNvmfNamespaceFromSnapshot**
> List&lt;WithTaskNvmfNamespace&gt; rollbackNvmfNamespaceFromSnapshot(nvmfNamespaceRollbackParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
    List<NvmfNamespaceRollbackParams> nvmfNamespaceRollbackParams = Arrays.asList(); // List<NvmfNamespaceRollbackParams> | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskNvmfNamespace> result = apiInstance.rollbackNvmfNamespaceFromSnapshot(nvmfNamespaceRollbackParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NvmfNamespaceApi#rollbackNvmfNamespaceFromSnapshot");
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
 **nvmfNamespaceRollbackParams** | [**List&lt;NvmfNamespaceRollbackParams&gt;**](NvmfNamespaceRollbackParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskNvmfNamespace&gt;**](WithTaskNvmfNamespace.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** |  |  -  |

<a name="updateNvmfNamespace"></a>
# **updateNvmfNamespace**
> List&lt;WithTaskNvmfNamespace&gt; updateNvmfNamespace(nvmfNamespaceUpdationParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfNamespaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    NvmfNamespaceApi apiInstance = new NvmfNamespaceApi(defaultClient);
    NvmfNamespaceUpdationParams nvmfNamespaceUpdationParams = new NvmfNamespaceUpdationParams(); // NvmfNamespaceUpdationParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskNvmfNamespace> result = apiInstance.updateNvmfNamespace(nvmfNamespaceUpdationParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NvmfNamespaceApi#updateNvmfNamespace");
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
 **nvmfNamespaceUpdationParams** | [**NvmfNamespaceUpdationParams**](NvmfNamespaceUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskNvmfNamespace&gt;**](WithTaskNvmfNamespace.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** |  |  -  |

