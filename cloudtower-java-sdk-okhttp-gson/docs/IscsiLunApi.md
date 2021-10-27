# IscsiLunApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneIscsiLunFromSnapshot**](IscsiLunApi.md#cloneIscsiLunFromSnapshot) | **POST** /clone-iscsi-lun-from-snapshot | 
[**createIscsiLun**](IscsiLunApi.md#createIscsiLun) | **POST** /create-iscsi-lun | 
[**deleteIscsiLun**](IscsiLunApi.md#deleteIscsiLun) | **POST** /delete-iscsi-lun | 
[**getIscsiLuns**](IscsiLunApi.md#getIscsiLuns) | **POST** /get-iscsi-luns | 
[**getIscsiLunsConnection**](IscsiLunApi.md#getIscsiLunsConnection) | **POST** /get-iscsi-luns-connection | 
[**rollbackIscsiLunFromSnapshot**](IscsiLunApi.md#rollbackIscsiLunFromSnapshot) | **POST** /rollback-iscsi-lun-from-snapshot | 
[**updateIscsiLun**](IscsiLunApi.md#updateIscsiLun) | **POST** /update-iscsi-lun | 


<a name="cloneIscsiLunFromSnapshot"></a>
# **cloneIscsiLunFromSnapshot**
> List&lt;WithTaskIscsiLun&gt; cloneIscsiLunFromSnapshot(contentLanguage, iscsiLunCloneParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    List<IscsiLunCloneParams> iscsiLunCloneParams = Arrays.asList(); // List<IscsiLunCloneParams> | 
    try {
      List<WithTaskIscsiLun> result = apiInstance.cloneIscsiLunFromSnapshot(contentLanguage, iscsiLunCloneParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IscsiLunApi#cloneIscsiLunFromSnapshot");
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
 **iscsiLunCloneParams** | [**List&lt;IscsiLunCloneParams&gt;**](IscsiLunCloneParams.md)|  |

### Return type

[**List&lt;WithTaskIscsiLun&gt;**](WithTaskIscsiLun.md)

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

<a name="createIscsiLun"></a>
# **createIscsiLun**
> List&lt;WithTaskIscsiLun&gt; createIscsiLun(contentLanguage, iscsiLunCreationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    List<IscsiLunCreationParams> iscsiLunCreationParams = Arrays.asList(); // List<IscsiLunCreationParams> | 
    try {
      List<WithTaskIscsiLun> result = apiInstance.createIscsiLun(contentLanguage, iscsiLunCreationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IscsiLunApi#createIscsiLun");
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
 **iscsiLunCreationParams** | [**List&lt;IscsiLunCreationParams&gt;**](IscsiLunCreationParams.md)|  |

### Return type

[**List&lt;WithTaskIscsiLun&gt;**](WithTaskIscsiLun.md)

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

<a name="deleteIscsiLun"></a>
# **deleteIscsiLun**
> List&lt;WithTaskDeleteIscsiLun&gt; deleteIscsiLun(contentLanguage, iscsiLunDeletionParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    IscsiLunDeletionParams iscsiLunDeletionParams = new IscsiLunDeletionParams(); // IscsiLunDeletionParams | 
    try {
      List<WithTaskDeleteIscsiLun> result = apiInstance.deleteIscsiLun(contentLanguage, iscsiLunDeletionParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IscsiLunApi#deleteIscsiLun");
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
 **iscsiLunDeletionParams** | [**IscsiLunDeletionParams**](IscsiLunDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteIscsiLun&gt;**](WithTaskDeleteIscsiLun.md)

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

<a name="getIscsiLuns"></a>
# **getIscsiLuns**
> List&lt;IscsiLun&gt; getIscsiLuns(contentLanguage, getIscsiLunsRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetIscsiLunsRequestBody getIscsiLunsRequestBody = new GetIscsiLunsRequestBody(); // GetIscsiLunsRequestBody | 
    try {
      List<IscsiLun> result = apiInstance.getIscsiLuns(contentLanguage, getIscsiLunsRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IscsiLunApi#getIscsiLuns");
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
 **getIscsiLunsRequestBody** | [**GetIscsiLunsRequestBody**](GetIscsiLunsRequestBody.md)|  |

### Return type

[**List&lt;IscsiLun&gt;**](IscsiLun.md)

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

<a name="getIscsiLunsConnection"></a>
# **getIscsiLunsConnection**
> IscsiLunConnection getIscsiLunsConnection(contentLanguage, getIscsiLunsConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetIscsiLunsConnectionRequestBody getIscsiLunsConnectionRequestBody = new GetIscsiLunsConnectionRequestBody(); // GetIscsiLunsConnectionRequestBody | 
    try {
      IscsiLunConnection result = apiInstance.getIscsiLunsConnection(contentLanguage, getIscsiLunsConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IscsiLunApi#getIscsiLunsConnection");
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
 **getIscsiLunsConnectionRequestBody** | [**GetIscsiLunsConnectionRequestBody**](GetIscsiLunsConnectionRequestBody.md)|  |

### Return type

[**IscsiLunConnection**](IscsiLunConnection.md)

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

<a name="rollbackIscsiLunFromSnapshot"></a>
# **rollbackIscsiLunFromSnapshot**
> List&lt;WithTaskIscsiLun&gt; rollbackIscsiLunFromSnapshot(contentLanguage, iscsiLunRollbackParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    List<IscsiLunRollbackParams> iscsiLunRollbackParams = Arrays.asList(); // List<IscsiLunRollbackParams> | 
    try {
      List<WithTaskIscsiLun> result = apiInstance.rollbackIscsiLunFromSnapshot(contentLanguage, iscsiLunRollbackParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IscsiLunApi#rollbackIscsiLunFromSnapshot");
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
 **iscsiLunRollbackParams** | [**List&lt;IscsiLunRollbackParams&gt;**](IscsiLunRollbackParams.md)|  |

### Return type

[**List&lt;WithTaskIscsiLun&gt;**](WithTaskIscsiLun.md)

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

<a name="updateIscsiLun"></a>
# **updateIscsiLun**
> List&lt;WithTaskIscsiLun&gt; updateIscsiLun(contentLanguage, iscsiLunUpdationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    IscsiLunApi apiInstance = new IscsiLunApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    IscsiLunUpdationParams iscsiLunUpdationParams = new IscsiLunUpdationParams(); // IscsiLunUpdationParams | 
    try {
      List<WithTaskIscsiLun> result = apiInstance.updateIscsiLun(contentLanguage, iscsiLunUpdationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IscsiLunApi#updateIscsiLun");
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
 **iscsiLunUpdationParams** | [**IscsiLunUpdationParams**](IscsiLunUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskIscsiLun&gt;**](WithTaskIscsiLun.md)

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

