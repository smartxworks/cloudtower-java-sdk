# NamespaceGroupApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNamespaceGroup**](NamespaceGroupApi.md#createNamespaceGroup) | **POST** /create-namespace-group | 
[**deleteNamespaceGroup**](NamespaceGroupApi.md#deleteNamespaceGroup) | **POST** /delete-namespace-group | 
[**getNamespaceGroups**](NamespaceGroupApi.md#getNamespaceGroups) | **POST** /get-namespace-groups | 
[**getNamespaceGroupsConnection**](NamespaceGroupApi.md#getNamespaceGroupsConnection) | **POST** /get-namespace-groups-connection | 
[**updateNamespaceGroup**](NamespaceGroupApi.md#updateNamespaceGroup) | **POST** /update-namespace-group | 


<a name="createNamespaceGroup"></a>
# **createNamespaceGroup**
> List&lt;WithTaskNamespaceGroup&gt; createNamespaceGroup(contentLanguage, namespaceGroupCreationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NamespaceGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    NamespaceGroupApi apiInstance = new NamespaceGroupApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    List<NamespaceGroupCreationParams> namespaceGroupCreationParams = Arrays.asList(); // List<NamespaceGroupCreationParams> | 
    try {
      List<WithTaskNamespaceGroup> result = apiInstance.createNamespaceGroup(contentLanguage, namespaceGroupCreationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceGroupApi#createNamespaceGroup");
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
 **namespaceGroupCreationParams** | [**List&lt;NamespaceGroupCreationParams&gt;**](NamespaceGroupCreationParams.md)|  |

### Return type

[**List&lt;WithTaskNamespaceGroup&gt;**](WithTaskNamespaceGroup.md)

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

<a name="deleteNamespaceGroup"></a>
# **deleteNamespaceGroup**
> List&lt;WithTaskDeleteNamespaceGroup&gt; deleteNamespaceGroup(contentLanguage, namespaceGroupDeletionParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NamespaceGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    NamespaceGroupApi apiInstance = new NamespaceGroupApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    NamespaceGroupDeletionParams namespaceGroupDeletionParams = new NamespaceGroupDeletionParams(); // NamespaceGroupDeletionParams | 
    try {
      List<WithTaskDeleteNamespaceGroup> result = apiInstance.deleteNamespaceGroup(contentLanguage, namespaceGroupDeletionParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceGroupApi#deleteNamespaceGroup");
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
 **namespaceGroupDeletionParams** | [**NamespaceGroupDeletionParams**](NamespaceGroupDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteNamespaceGroup&gt;**](WithTaskDeleteNamespaceGroup.md)

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

<a name="getNamespaceGroups"></a>
# **getNamespaceGroups**
> List&lt;NamespaceGroup&gt; getNamespaceGroups(contentLanguage, getNamespaceGroupsRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NamespaceGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    NamespaceGroupApi apiInstance = new NamespaceGroupApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetNamespaceGroupsRequestBody getNamespaceGroupsRequestBody = new GetNamespaceGroupsRequestBody(); // GetNamespaceGroupsRequestBody | 
    try {
      List<NamespaceGroup> result = apiInstance.getNamespaceGroups(contentLanguage, getNamespaceGroupsRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceGroupApi#getNamespaceGroups");
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
 **getNamespaceGroupsRequestBody** | [**GetNamespaceGroupsRequestBody**](GetNamespaceGroupsRequestBody.md)|  |

### Return type

[**List&lt;NamespaceGroup&gt;**](NamespaceGroup.md)

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

<a name="getNamespaceGroupsConnection"></a>
# **getNamespaceGroupsConnection**
> NamespaceGroupConnection getNamespaceGroupsConnection(contentLanguage, getNamespaceGroupsConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NamespaceGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    NamespaceGroupApi apiInstance = new NamespaceGroupApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetNamespaceGroupsConnectionRequestBody getNamespaceGroupsConnectionRequestBody = new GetNamespaceGroupsConnectionRequestBody(); // GetNamespaceGroupsConnectionRequestBody | 
    try {
      NamespaceGroupConnection result = apiInstance.getNamespaceGroupsConnection(contentLanguage, getNamespaceGroupsConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceGroupApi#getNamespaceGroupsConnection");
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
 **getNamespaceGroupsConnectionRequestBody** | [**GetNamespaceGroupsConnectionRequestBody**](GetNamespaceGroupsConnectionRequestBody.md)|  |

### Return type

[**NamespaceGroupConnection**](NamespaceGroupConnection.md)

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

<a name="updateNamespaceGroup"></a>
# **updateNamespaceGroup**
> List&lt;WithTaskNamespaceGroup&gt; updateNamespaceGroup(contentLanguage, namespaceGroupUpdationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NamespaceGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    NamespaceGroupApi apiInstance = new NamespaceGroupApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    NamespaceGroupUpdationParams namespaceGroupUpdationParams = new NamespaceGroupUpdationParams(); // NamespaceGroupUpdationParams | 
    try {
      List<WithTaskNamespaceGroup> result = apiInstance.updateNamespaceGroup(contentLanguage, namespaceGroupUpdationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceGroupApi#updateNamespaceGroup");
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
 **namespaceGroupUpdationParams** | [**NamespaceGroupUpdationParams**](NamespaceGroupUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskNamespaceGroup&gt;**](WithTaskNamespaceGroup.md)

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

