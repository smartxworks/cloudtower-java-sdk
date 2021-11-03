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
> List&lt;WithTaskSnapshotPlan&gt; createSnapshotPlan(snapshotPlanCreationParams, contentLanguage)



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
    List<SnapshotPlanCreationParams> snapshotPlanCreationParams = Arrays.asList(); // List<SnapshotPlanCreationParams> | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskSnapshotPlan> result = apiInstance.createSnapshotPlan(snapshotPlanCreationParams, contentLanguage);
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
 **snapshotPlanCreationParams** | [**List&lt;SnapshotPlanCreationParams&gt;**](SnapshotPlanCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
> List&lt;WithTaskDeleteSnapshotPlan&gt; deleteSnapshotPlan(snapshotPlanDeletionParams, contentLanguage)



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
    SnapshotPlanDeletionParams snapshotPlanDeletionParams = new SnapshotPlanDeletionParams(); // SnapshotPlanDeletionParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskDeleteSnapshotPlan> result = apiInstance.deleteSnapshotPlan(snapshotPlanDeletionParams, contentLanguage);
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
 **snapshotPlanDeletionParams** | [**SnapshotPlanDeletionParams**](SnapshotPlanDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
> List&lt;WithTaskSnapshotPlan&gt; executeSnapshotPlan(snapshotPlanExecutionParams, contentLanguage)



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
    SnapshotPlanExecutionParams snapshotPlanExecutionParams = new SnapshotPlanExecutionParams(); // SnapshotPlanExecutionParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskSnapshotPlan> result = apiInstance.executeSnapshotPlan(snapshotPlanExecutionParams, contentLanguage);
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
 **snapshotPlanExecutionParams** | [**SnapshotPlanExecutionParams**](SnapshotPlanExecutionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
> List&lt;SnapshotPlan&gt; getSnapshotPlans(getSnapshotPlansRequestBody, contentLanguage)



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
    GetSnapshotPlansRequestBody getSnapshotPlansRequestBody = new GetSnapshotPlansRequestBody(); // GetSnapshotPlansRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<SnapshotPlan> result = apiInstance.getSnapshotPlans(getSnapshotPlansRequestBody, contentLanguage);
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
 **getSnapshotPlansRequestBody** | [**GetSnapshotPlansRequestBody**](GetSnapshotPlansRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
> SnapshotPlanConnection getSnapshotPlansConnection(getSnapshotPlansConnectionRequestBody, contentLanguage)



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
    GetSnapshotPlansConnectionRequestBody getSnapshotPlansConnectionRequestBody = new GetSnapshotPlansConnectionRequestBody(); // GetSnapshotPlansConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      SnapshotPlanConnection result = apiInstance.getSnapshotPlansConnection(getSnapshotPlansConnectionRequestBody, contentLanguage);
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
 **getSnapshotPlansConnectionRequestBody** | [**GetSnapshotPlansConnectionRequestBody**](GetSnapshotPlansConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
> List&lt;WithTaskSnapshotPlan&gt; resumeSnapshotPlan(snapshotPlanResumeParams, contentLanguage)



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
    SnapshotPlanResumeParams snapshotPlanResumeParams = new SnapshotPlanResumeParams(); // SnapshotPlanResumeParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskSnapshotPlan> result = apiInstance.resumeSnapshotPlan(snapshotPlanResumeParams, contentLanguage);
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
 **snapshotPlanResumeParams** | [**SnapshotPlanResumeParams**](SnapshotPlanResumeParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
> List&lt;WithTaskSnapshotPlan&gt; suspendSnapshotPlan(snapshotPlanSuspendedParams, contentLanguage)



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
    SnapshotPlanSuspendedParams snapshotPlanSuspendedParams = new SnapshotPlanSuspendedParams(); // SnapshotPlanSuspendedParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskSnapshotPlan> result = apiInstance.suspendSnapshotPlan(snapshotPlanSuspendedParams, contentLanguage);
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
 **snapshotPlanSuspendedParams** | [**SnapshotPlanSuspendedParams**](SnapshotPlanSuspendedParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
> List&lt;WithTaskSnapshotPlan&gt; updateSnapshotPlan(snapshotPlanUpdationParams, contentLanguage)



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
    SnapshotPlanUpdationParams snapshotPlanUpdationParams = new SnapshotPlanUpdationParams(); // SnapshotPlanUpdationParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskSnapshotPlan> result = apiInstance.updateSnapshotPlan(snapshotPlanUpdationParams, contentLanguage);
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
 **snapshotPlanUpdationParams** | [**SnapshotPlanUpdationParams**](SnapshotPlanUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

