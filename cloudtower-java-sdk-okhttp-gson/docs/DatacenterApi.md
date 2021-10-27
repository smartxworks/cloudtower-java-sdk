# DatacenterApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDatacenter**](DatacenterApi.md#createDatacenter) | **POST** /create-datacenter | 
[**deleteDatacenter**](DatacenterApi.md#deleteDatacenter) | **POST** /delete-datacenter | 
[**getDatacenters**](DatacenterApi.md#getDatacenters) | **POST** /get-datacenters | 
[**getDatacentersConnection**](DatacenterApi.md#getDatacentersConnection) | **POST** /get-datacenters-connection | 
[**updateDatacenter**](DatacenterApi.md#updateDatacenter) | **POST** /update-datacenter | 


<a name="createDatacenter"></a>
# **createDatacenter**
> List&lt;WithTaskDatacenter&gt; createDatacenter(contentLanguage, datacenterCreationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DatacenterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    DatacenterApi apiInstance = new DatacenterApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    List<DatacenterCreationParams> datacenterCreationParams = Arrays.asList(); // List<DatacenterCreationParams> | 
    try {
      List<WithTaskDatacenter> result = apiInstance.createDatacenter(contentLanguage, datacenterCreationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatacenterApi#createDatacenter");
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
 **datacenterCreationParams** | [**List&lt;DatacenterCreationParams&gt;**](DatacenterCreationParams.md)|  |

### Return type

[**List&lt;WithTaskDatacenter&gt;**](WithTaskDatacenter.md)

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

<a name="deleteDatacenter"></a>
# **deleteDatacenter**
> List&lt;WithTaskDeleteDatacenter&gt; deleteDatacenter(contentLanguage, datacenterDeletionParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DatacenterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    DatacenterApi apiInstance = new DatacenterApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    DatacenterDeletionParams datacenterDeletionParams = new DatacenterDeletionParams(); // DatacenterDeletionParams | 
    try {
      List<WithTaskDeleteDatacenter> result = apiInstance.deleteDatacenter(contentLanguage, datacenterDeletionParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatacenterApi#deleteDatacenter");
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
 **datacenterDeletionParams** | [**DatacenterDeletionParams**](DatacenterDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteDatacenter&gt;**](WithTaskDeleteDatacenter.md)

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

<a name="getDatacenters"></a>
# **getDatacenters**
> List&lt;Datacenter&gt; getDatacenters(contentLanguage, getDatacentersRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DatacenterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    DatacenterApi apiInstance = new DatacenterApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetDatacentersRequestBody getDatacentersRequestBody = new GetDatacentersRequestBody(); // GetDatacentersRequestBody | 
    try {
      List<Datacenter> result = apiInstance.getDatacenters(contentLanguage, getDatacentersRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatacenterApi#getDatacenters");
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
 **getDatacentersRequestBody** | [**GetDatacentersRequestBody**](GetDatacentersRequestBody.md)|  |

### Return type

[**List&lt;Datacenter&gt;**](Datacenter.md)

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

<a name="getDatacentersConnection"></a>
# **getDatacentersConnection**
> DatacenterConnection getDatacentersConnection(contentLanguage, getDatacentersConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DatacenterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    DatacenterApi apiInstance = new DatacenterApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetDatacentersConnectionRequestBody getDatacentersConnectionRequestBody = new GetDatacentersConnectionRequestBody(); // GetDatacentersConnectionRequestBody | 
    try {
      DatacenterConnection result = apiInstance.getDatacentersConnection(contentLanguage, getDatacentersConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatacenterApi#getDatacentersConnection");
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
 **getDatacentersConnectionRequestBody** | [**GetDatacentersConnectionRequestBody**](GetDatacentersConnectionRequestBody.md)|  |

### Return type

[**DatacenterConnection**](DatacenterConnection.md)

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

<a name="updateDatacenter"></a>
# **updateDatacenter**
> List&lt;WithTaskDatacenter&gt; updateDatacenter(contentLanguage, datacenterUpdationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DatacenterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    DatacenterApi apiInstance = new DatacenterApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    DatacenterUpdationParams datacenterUpdationParams = new DatacenterUpdationParams(); // DatacenterUpdationParams | 
    try {
      List<WithTaskDatacenter> result = apiInstance.updateDatacenter(contentLanguage, datacenterUpdationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatacenterApi#updateDatacenter");
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
 **datacenterUpdationParams** | [**DatacenterUpdationParams**](DatacenterUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskDatacenter&gt;**](WithTaskDatacenter.md)

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

