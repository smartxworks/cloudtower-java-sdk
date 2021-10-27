# SnapshotPlanApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSnapshotPlan**](SnapshotPlanApi.md#createSnapshotPlan) | **POST** /create-snapshot-plan | 
[**deleteSnapshotPlan**](SnapshotPlanApi.md#deleteSnapshotPlan) | **POST** /delete-snapshot-plan | 
[**executeSnapshotPlan**](SnapshotPlanApi.md#executeSnapshotPlan) | **POST** /execute-snapshot-plan | 
[**getSnapshotPlans**](SnapshotPlanApi.md#getSnapshotPlans) | **POST** /get-snapshot-plans | 
[**getSnapshotPlansConnection**](SnapshotPlanApi.md#getSnapshotPlansConnection) | **POST** /get-snapshot-plans-connection | 
[**resumeSnapshotPlan**](SnapshotPlanApi.md#resumeSnapshotPlan) | **POST** /resume-snapshot-plan | 
[**suspendSnapshotPlan**](SnapshotPlanApi.md#suspendSnapshotPlan) | **POST** /suspend-snapshot-plan | 
[**updateSnapshotPlan**](SnapshotPlanApi.md#updateSnapshotPlan) | **POST** /update-snapshot-plan | 


<a name="createSnapshotPlan"></a>
# **createSnapshotPlan**
> List&lt;WithTaskSnapshotPlan&gt; createSnapshotPlan(contentLanguage, snapshotPlanCreationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnapshotPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SnapshotPlanApi apiInstance = new SnapshotPlanApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    List<SnapshotPlanCreationParams> snapshotPlanCreationParams = Arrays.asList(); // List<SnapshotPlanCreationParams> | 
    try {
      List<WithTaskSnapshotPlan> result = apiInstance.createSnapshotPlan(contentLanguage, snapshotPlanCreationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotPlanApi#createSnapshotPlan");
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
 **snapshotPlanCreationParams** | [**List&lt;SnapshotPlanCreationParams&gt;**](SnapshotPlanCreationParams.md)|  |

### Return type

[**List&lt;WithTaskSnapshotPlan&gt;**](WithTaskSnapshotPlan.md)

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

<a name="deleteSnapshotPlan"></a>
# **deleteSnapshotPlan**
> List&lt;WithTaskDeleteSnapshotPlan&gt; deleteSnapshotPlan(contentLanguage, snapshotPlanDeletionParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnapshotPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SnapshotPlanApi apiInstance = new SnapshotPlanApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    SnapshotPlanDeletionParams snapshotPlanDeletionParams = new SnapshotPlanDeletionParams(); // SnapshotPlanDeletionParams | 
    try {
      List<WithTaskDeleteSnapshotPlan> result = apiInstance.deleteSnapshotPlan(contentLanguage, snapshotPlanDeletionParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotPlanApi#deleteSnapshotPlan");
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
 **snapshotPlanDeletionParams** | [**SnapshotPlanDeletionParams**](SnapshotPlanDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteSnapshotPlan&gt;**](WithTaskDeleteSnapshotPlan.md)

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

<a name="executeSnapshotPlan"></a>
# **executeSnapshotPlan**
> List&lt;WithTaskSnapshotPlan&gt; executeSnapshotPlan(contentLanguage, snapshotPlanExecutionParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnapshotPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SnapshotPlanApi apiInstance = new SnapshotPlanApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    SnapshotPlanExecutionParams snapshotPlanExecutionParams = new SnapshotPlanExecutionParams(); // SnapshotPlanExecutionParams | 
    try {
      List<WithTaskSnapshotPlan> result = apiInstance.executeSnapshotPlan(contentLanguage, snapshotPlanExecutionParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotPlanApi#executeSnapshotPlan");
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
 **snapshotPlanExecutionParams** | [**SnapshotPlanExecutionParams**](SnapshotPlanExecutionParams.md)|  |

### Return type

[**List&lt;WithTaskSnapshotPlan&gt;**](WithTaskSnapshotPlan.md)

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

<a name="getSnapshotPlans"></a>
# **getSnapshotPlans**
> List&lt;SnapshotPlan&gt; getSnapshotPlans(contentLanguage, getSnapshotPlansRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnapshotPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SnapshotPlanApi apiInstance = new SnapshotPlanApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetSnapshotPlansRequestBody getSnapshotPlansRequestBody = new GetSnapshotPlansRequestBody(); // GetSnapshotPlansRequestBody | 
    try {
      List<SnapshotPlan> result = apiInstance.getSnapshotPlans(contentLanguage, getSnapshotPlansRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotPlanApi#getSnapshotPlans");
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
 **getSnapshotPlansRequestBody** | [**GetSnapshotPlansRequestBody**](GetSnapshotPlansRequestBody.md)|  |

### Return type

[**List&lt;SnapshotPlan&gt;**](SnapshotPlan.md)

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

<a name="getSnapshotPlansConnection"></a>
# **getSnapshotPlansConnection**
> SnapshotPlanConnection getSnapshotPlansConnection(contentLanguage, getSnapshotPlansConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnapshotPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SnapshotPlanApi apiInstance = new SnapshotPlanApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetSnapshotPlansConnectionRequestBody getSnapshotPlansConnectionRequestBody = new GetSnapshotPlansConnectionRequestBody(); // GetSnapshotPlansConnectionRequestBody | 
    try {
      SnapshotPlanConnection result = apiInstance.getSnapshotPlansConnection(contentLanguage, getSnapshotPlansConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotPlanApi#getSnapshotPlansConnection");
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
 **getSnapshotPlansConnectionRequestBody** | [**GetSnapshotPlansConnectionRequestBody**](GetSnapshotPlansConnectionRequestBody.md)|  |

### Return type

[**SnapshotPlanConnection**](SnapshotPlanConnection.md)

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

<a name="resumeSnapshotPlan"></a>
# **resumeSnapshotPlan**
> List&lt;WithTaskSnapshotPlan&gt; resumeSnapshotPlan(contentLanguage, snapshotPlanResumeParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnapshotPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SnapshotPlanApi apiInstance = new SnapshotPlanApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    SnapshotPlanResumeParams snapshotPlanResumeParams = new SnapshotPlanResumeParams(); // SnapshotPlanResumeParams | 
    try {
      List<WithTaskSnapshotPlan> result = apiInstance.resumeSnapshotPlan(contentLanguage, snapshotPlanResumeParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotPlanApi#resumeSnapshotPlan");
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
 **snapshotPlanResumeParams** | [**SnapshotPlanResumeParams**](SnapshotPlanResumeParams.md)|  |

### Return type

[**List&lt;WithTaskSnapshotPlan&gt;**](WithTaskSnapshotPlan.md)

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

<a name="suspendSnapshotPlan"></a>
# **suspendSnapshotPlan**
> List&lt;WithTaskSnapshotPlan&gt; suspendSnapshotPlan(contentLanguage, snapshotPlanSuspendedParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnapshotPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SnapshotPlanApi apiInstance = new SnapshotPlanApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    SnapshotPlanSuspendedParams snapshotPlanSuspendedParams = new SnapshotPlanSuspendedParams(); // SnapshotPlanSuspendedParams | 
    try {
      List<WithTaskSnapshotPlan> result = apiInstance.suspendSnapshotPlan(contentLanguage, snapshotPlanSuspendedParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotPlanApi#suspendSnapshotPlan");
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
 **snapshotPlanSuspendedParams** | [**SnapshotPlanSuspendedParams**](SnapshotPlanSuspendedParams.md)|  |

### Return type

[**List&lt;WithTaskSnapshotPlan&gt;**](WithTaskSnapshotPlan.md)

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

<a name="updateSnapshotPlan"></a>
# **updateSnapshotPlan**
> List&lt;WithTaskSnapshotPlan&gt; updateSnapshotPlan(contentLanguage, snapshotPlanUpdationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnapshotPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SnapshotPlanApi apiInstance = new SnapshotPlanApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    SnapshotPlanUpdationParams snapshotPlanUpdationParams = new SnapshotPlanUpdationParams(); // SnapshotPlanUpdationParams | 
    try {
      List<WithTaskSnapshotPlan> result = apiInstance.updateSnapshotPlan(contentLanguage, snapshotPlanUpdationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotPlanApi#updateSnapshotPlan");
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
 **snapshotPlanUpdationParams** | [**SnapshotPlanUpdationParams**](SnapshotPlanUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskSnapshotPlan&gt;**](WithTaskSnapshotPlan.md)

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

