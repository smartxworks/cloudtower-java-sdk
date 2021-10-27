# HostApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createHost**](HostApi.md#createHost) | **POST** /create-host | 
[**getHosts**](HostApi.md#getHosts) | **POST** /get-hosts | 
[**getHostsConnection**](HostApi.md#getHostsConnection) | **POST** /get-hosts-connection | 
[**triggerDiskBlink**](HostApi.md#triggerDiskBlink) | **POST** /trigger-disk-blink | 
[**updateHost**](HostApi.md#updateHost) | **POST** /update-host | 


<a name="createHost"></a>
# **createHost**
> List&lt;WithTaskBatchHosts&gt; createHost(contentLanguage, hostCreationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.HostApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    HostApi apiInstance = new HostApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    List<HostCreationParams> hostCreationParams = Arrays.asList(); // List<HostCreationParams> | 
    try {
      List<WithTaskBatchHosts> result = apiInstance.createHost(contentLanguage, hostCreationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HostApi#createHost");
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
 **hostCreationParams** | [**List&lt;HostCreationParams&gt;**](HostCreationParams.md)|  |

### Return type

[**List&lt;WithTaskBatchHosts&gt;**](WithTaskBatchHosts.md)

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

<a name="getHosts"></a>
# **getHosts**
> List&lt;Host&gt; getHosts(contentLanguage, getHostsRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.HostApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    HostApi apiInstance = new HostApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetHostsRequestBody getHostsRequestBody = new GetHostsRequestBody(); // GetHostsRequestBody | 
    try {
      List<Host> result = apiInstance.getHosts(contentLanguage, getHostsRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HostApi#getHosts");
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
 **getHostsRequestBody** | [**GetHostsRequestBody**](GetHostsRequestBody.md)|  |

### Return type

[**List&lt;Host&gt;**](Host.md)

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

<a name="getHostsConnection"></a>
# **getHostsConnection**
> HostConnection getHostsConnection(contentLanguage, getHostsConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.HostApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    HostApi apiInstance = new HostApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetHostsConnectionRequestBody getHostsConnectionRequestBody = new GetHostsConnectionRequestBody(); // GetHostsConnectionRequestBody | 
    try {
      HostConnection result = apiInstance.getHostsConnection(contentLanguage, getHostsConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HostApi#getHostsConnection");
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
 **getHostsConnectionRequestBody** | [**GetHostsConnectionRequestBody**](GetHostsConnectionRequestBody.md)|  |

### Return type

[**HostConnection**](HostConnection.md)

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

<a name="triggerDiskBlink"></a>
# **triggerDiskBlink**
> List&lt;WithTaskHost&gt; triggerDiskBlink(contentLanguage, triggerDiskBlinkParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.HostApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    HostApi apiInstance = new HostApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    List<TriggerDiskBlinkParams> triggerDiskBlinkParams = Arrays.asList(); // List<TriggerDiskBlinkParams> | 
    try {
      List<WithTaskHost> result = apiInstance.triggerDiskBlink(contentLanguage, triggerDiskBlinkParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HostApi#triggerDiskBlink");
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
 **triggerDiskBlinkParams** | [**List&lt;TriggerDiskBlinkParams&gt;**](TriggerDiskBlinkParams.md)|  |

### Return type

[**List&lt;WithTaskHost&gt;**](WithTaskHost.md)

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

<a name="updateHost"></a>
# **updateHost**
> List&lt;WithTaskHost&gt; updateHost(contentLanguage, hostUpdationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.HostApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    HostApi apiInstance = new HostApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    HostUpdationParams hostUpdationParams = new HostUpdationParams(); // HostUpdationParams | 
    try {
      List<WithTaskHost> result = apiInstance.updateHost(contentLanguage, hostUpdationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HostApi#updateHost");
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
 **hostUpdationParams** | [**HostUpdationParams**](HostUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskHost&gt;**](WithTaskHost.md)

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

