# VdsApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVds**](VdsApi.md#createVds) | **POST** /create-vds | 
[**createVdsWithAccessVlan**](VdsApi.md#createVdsWithAccessVlan) | **POST** /create-vds-with-access-vlan | 
[**createVdsWithMigrateVlan**](VdsApi.md#createVdsWithMigrateVlan) | **POST** /create-vds-with-migrate-vlan | 
[**deleteVds**](VdsApi.md#deleteVds) | **POST** /delete-vds | 
[**getVdses**](VdsApi.md#getVdses) | **POST** /get-vdses | 
[**getVdsesConnection**](VdsApi.md#getVdsesConnection) | **POST** /get-vdses-connection | 
[**updateVds**](VdsApi.md#updateVds) | **POST** /update-vds | 


<a name="createVds"></a>
# **createVds**
> List&lt;WithTaskVds&gt; createVds(contentLanguage, vdsCreationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VdsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VdsApi apiInstance = new VdsApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    List<VdsCreationParams> vdsCreationParams = Arrays.asList(); // List<VdsCreationParams> | 
    try {
      List<WithTaskVds> result = apiInstance.createVds(contentLanguage, vdsCreationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdsApi#createVds");
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
 **vdsCreationParams** | [**List&lt;VdsCreationParams&gt;**](VdsCreationParams.md)|  |

### Return type

[**List&lt;WithTaskVds&gt;**](WithTaskVds.md)

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

<a name="createVdsWithAccessVlan"></a>
# **createVdsWithAccessVlan**
> List&lt;WithTaskVds&gt; createVdsWithAccessVlan(contentLanguage, vdsCreationWithMAccessVlanParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VdsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VdsApi apiInstance = new VdsApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    List<VdsCreationWithMAccessVlanParams> vdsCreationWithMAccessVlanParams = Arrays.asList(); // List<VdsCreationWithMAccessVlanParams> | 
    try {
      List<WithTaskVds> result = apiInstance.createVdsWithAccessVlan(contentLanguage, vdsCreationWithMAccessVlanParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdsApi#createVdsWithAccessVlan");
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
 **vdsCreationWithMAccessVlanParams** | [**List&lt;VdsCreationWithMAccessVlanParams&gt;**](VdsCreationWithMAccessVlanParams.md)|  |

### Return type

[**List&lt;WithTaskVds&gt;**](WithTaskVds.md)

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

<a name="createVdsWithMigrateVlan"></a>
# **createVdsWithMigrateVlan**
> List&lt;WithTaskVds&gt; createVdsWithMigrateVlan(contentLanguage, vdsCreationWithMigrateVlanParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VdsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VdsApi apiInstance = new VdsApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    List<VdsCreationWithMigrateVlanParams> vdsCreationWithMigrateVlanParams = Arrays.asList(); // List<VdsCreationWithMigrateVlanParams> | 
    try {
      List<WithTaskVds> result = apiInstance.createVdsWithMigrateVlan(contentLanguage, vdsCreationWithMigrateVlanParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdsApi#createVdsWithMigrateVlan");
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
 **vdsCreationWithMigrateVlanParams** | [**List&lt;VdsCreationWithMigrateVlanParams&gt;**](VdsCreationWithMigrateVlanParams.md)|  |

### Return type

[**List&lt;WithTaskVds&gt;**](WithTaskVds.md)

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

<a name="deleteVds"></a>
# **deleteVds**
> List&lt;WithTaskDeleteVds&gt; deleteVds(contentLanguage, vdsDeletionParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VdsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VdsApi apiInstance = new VdsApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VdsDeletionParams vdsDeletionParams = new VdsDeletionParams(); // VdsDeletionParams | 
    try {
      List<WithTaskDeleteVds> result = apiInstance.deleteVds(contentLanguage, vdsDeletionParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdsApi#deleteVds");
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
 **vdsDeletionParams** | [**VdsDeletionParams**](VdsDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteVds&gt;**](WithTaskDeleteVds.md)

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

<a name="getVdses"></a>
# **getVdses**
> List&lt;Vds&gt; getVdses(contentLanguage, getVdsesRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VdsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VdsApi apiInstance = new VdsApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetVdsesRequestBody getVdsesRequestBody = new GetVdsesRequestBody(); // GetVdsesRequestBody | 
    try {
      List<Vds> result = apiInstance.getVdses(contentLanguage, getVdsesRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdsApi#getVdses");
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
 **getVdsesRequestBody** | [**GetVdsesRequestBody**](GetVdsesRequestBody.md)|  |

### Return type

[**List&lt;Vds&gt;**](Vds.md)

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

<a name="getVdsesConnection"></a>
# **getVdsesConnection**
> VdsConnection getVdsesConnection(contentLanguage, getVdsesConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VdsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VdsApi apiInstance = new VdsApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetVdsesConnectionRequestBody getVdsesConnectionRequestBody = new GetVdsesConnectionRequestBody(); // GetVdsesConnectionRequestBody | 
    try {
      VdsConnection result = apiInstance.getVdsesConnection(contentLanguage, getVdsesConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdsApi#getVdsesConnection");
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
 **getVdsesConnectionRequestBody** | [**GetVdsesConnectionRequestBody**](GetVdsesConnectionRequestBody.md)|  |

### Return type

[**VdsConnection**](VdsConnection.md)

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

<a name="updateVds"></a>
# **updateVds**
> List&lt;WithTaskVds&gt; updateVds(contentLanguage, vdsUpdationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VdsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VdsApi apiInstance = new VdsApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VdsUpdationParams vdsUpdationParams = new VdsUpdationParams(); // VdsUpdationParams | 
    try {
      List<WithTaskVds> result = apiInstance.updateVds(contentLanguage, vdsUpdationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdsApi#updateVds");
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
 **vdsUpdationParams** | [**VdsUpdationParams**](VdsUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskVds&gt;**](WithTaskVds.md)

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

