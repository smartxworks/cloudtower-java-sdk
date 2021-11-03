# IscsiTargetApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIscsiTarget**](IscsiTargetApi.md#createIscsiTarget) | **POST** /create-iscsi-target | 
[**deleteIscsiTarget**](IscsiTargetApi.md#deleteIscsiTarget) | **POST** /delete-iscsi-target | 
[**getIscsiTargets**](IscsiTargetApi.md#getIscsiTargets) | **POST** /get-iscsi-targets | 
[**getIscsiTargetsConnection**](IscsiTargetApi.md#getIscsiTargetsConnection) | **POST** /get-iscsi-targets-connection | 
[**updateIscsiTarget**](IscsiTargetApi.md#updateIscsiTarget) | **POST** /update-iscsi-target | 


<a name="createIscsiTarget"></a>
# **createIscsiTarget**
> List&lt;WithTaskIscsiTarget&gt; createIscsiTarget(iscsiTargetCreationParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiTargetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    IscsiTargetApi apiInstance = new IscsiTargetApi(defaultClient);
    List<IscsiTargetCreationParams> iscsiTargetCreationParams = Arrays.asList(); // List<IscsiTargetCreationParams> | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskIscsiTarget> result = apiInstance.createIscsiTarget(iscsiTargetCreationParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IscsiTargetApi#createIscsiTarget");
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
 **iscsiTargetCreationParams** | [**List&lt;IscsiTargetCreationParams&gt;**](IscsiTargetCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskIscsiTarget&gt;**](WithTaskIscsiTarget.md)

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

<a name="deleteIscsiTarget"></a>
# **deleteIscsiTarget**
> List&lt;WithTaskDeleteIscsiTarget&gt; deleteIscsiTarget(iscsiTargetDeletionParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiTargetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    IscsiTargetApi apiInstance = new IscsiTargetApi(defaultClient);
    IscsiTargetDeletionParams iscsiTargetDeletionParams = new IscsiTargetDeletionParams(); // IscsiTargetDeletionParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskDeleteIscsiTarget> result = apiInstance.deleteIscsiTarget(iscsiTargetDeletionParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IscsiTargetApi#deleteIscsiTarget");
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
 **iscsiTargetDeletionParams** | [**IscsiTargetDeletionParams**](IscsiTargetDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskDeleteIscsiTarget&gt;**](WithTaskDeleteIscsiTarget.md)

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

<a name="getIscsiTargets"></a>
# **getIscsiTargets**
> List&lt;IscsiTarget&gt; getIscsiTargets(getIscsiTargetsRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiTargetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    IscsiTargetApi apiInstance = new IscsiTargetApi(defaultClient);
    GetIscsiTargetsRequestBody getIscsiTargetsRequestBody = new GetIscsiTargetsRequestBody(); // GetIscsiTargetsRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<IscsiTarget> result = apiInstance.getIscsiTargets(getIscsiTargetsRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IscsiTargetApi#getIscsiTargets");
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
 **getIscsiTargetsRequestBody** | [**GetIscsiTargetsRequestBody**](GetIscsiTargetsRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;IscsiTarget&gt;**](IscsiTarget.md)

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

<a name="getIscsiTargetsConnection"></a>
# **getIscsiTargetsConnection**
> IscsiTargetConnection getIscsiTargetsConnection(getIscsiTargetsConnectionRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiTargetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    IscsiTargetApi apiInstance = new IscsiTargetApi(defaultClient);
    GetIscsiTargetsConnectionRequestBody getIscsiTargetsConnectionRequestBody = new GetIscsiTargetsConnectionRequestBody(); // GetIscsiTargetsConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      IscsiTargetConnection result = apiInstance.getIscsiTargetsConnection(getIscsiTargetsConnectionRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IscsiTargetApi#getIscsiTargetsConnection");
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
 **getIscsiTargetsConnectionRequestBody** | [**GetIscsiTargetsConnectionRequestBody**](GetIscsiTargetsConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**IscsiTargetConnection**](IscsiTargetConnection.md)

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

<a name="updateIscsiTarget"></a>
# **updateIscsiTarget**
> List&lt;WithTaskIscsiTarget&gt; updateIscsiTarget(iscsiTargetUpdationParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiTargetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    IscsiTargetApi apiInstance = new IscsiTargetApi(defaultClient);
    IscsiTargetUpdationParams iscsiTargetUpdationParams = new IscsiTargetUpdationParams(); // IscsiTargetUpdationParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskIscsiTarget> result = apiInstance.updateIscsiTarget(iscsiTargetUpdationParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IscsiTargetApi#updateIscsiTarget");
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
 **iscsiTargetUpdationParams** | [**IscsiTargetUpdationParams**](IscsiTargetUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskIscsiTarget&gt;**](WithTaskIscsiTarget.md)

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

