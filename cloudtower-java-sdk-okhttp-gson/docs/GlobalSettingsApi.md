# GlobalSettingsApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClusterRecycleBinSetting**](GlobalSettingsApi.md#createClusterRecycleBinSetting) | **POST** /create-cluster-recycle-bin-setting | 
[**deleteClusterRecycleBinSetting**](GlobalSettingsApi.md#deleteClusterRecycleBinSetting) | **POST** /delete-cluster-recycle-bin-setting | 
[**getGlobalSettingses**](GlobalSettingsApi.md#getGlobalSettingses) | **POST** /get-global-settingses | 
[**getGlobalSettingsesConnection**](GlobalSettingsApi.md#getGlobalSettingsesConnection) | **POST** /get-global-settingses-connection | 
[**updateClusterRecycleBinSetting**](GlobalSettingsApi.md#updateClusterRecycleBinSetting) | **POST** /update-cluster-recycle-bin-setting | 
[**updateGlobalRecycleBinSetting**](GlobalSettingsApi.md#updateGlobalRecycleBinSetting) | **POST** /update-global-recycle-bin-setting | 


<a name="createClusterRecycleBinSetting"></a>
# **createClusterRecycleBinSetting**
> List&lt;WithTaskClusterSettings&gt; createClusterRecycleBinSetting(contentLanguage, clusterRecycleBinCreationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.GlobalSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    GlobalSettingsApi apiInstance = new GlobalSettingsApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    ClusterRecycleBinCreationParams clusterRecycleBinCreationParams = new ClusterRecycleBinCreationParams(); // ClusterRecycleBinCreationParams | 
    try {
      List<WithTaskClusterSettings> result = apiInstance.createClusterRecycleBinSetting(contentLanguage, clusterRecycleBinCreationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalSettingsApi#createClusterRecycleBinSetting");
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
 **clusterRecycleBinCreationParams** | [**ClusterRecycleBinCreationParams**](ClusterRecycleBinCreationParams.md)|  |

### Return type

[**List&lt;WithTaskClusterSettings&gt;**](WithTaskClusterSettings.md)

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

<a name="deleteClusterRecycleBinSetting"></a>
# **deleteClusterRecycleBinSetting**
> List&lt;WithTaskDeleteClusterRecycleBin&gt; deleteClusterRecycleBinSetting(contentLanguage, clusterRecycleBinDeletionParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.GlobalSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    GlobalSettingsApi apiInstance = new GlobalSettingsApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    ClusterRecycleBinDeletionParams clusterRecycleBinDeletionParams = new ClusterRecycleBinDeletionParams(); // ClusterRecycleBinDeletionParams | 
    try {
      List<WithTaskDeleteClusterRecycleBin> result = apiInstance.deleteClusterRecycleBinSetting(contentLanguage, clusterRecycleBinDeletionParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalSettingsApi#deleteClusterRecycleBinSetting");
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
 **clusterRecycleBinDeletionParams** | [**ClusterRecycleBinDeletionParams**](ClusterRecycleBinDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteClusterRecycleBin&gt;**](WithTaskDeleteClusterRecycleBin.md)

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

<a name="getGlobalSettingses"></a>
# **getGlobalSettingses**
> List&lt;GlobalSettings&gt; getGlobalSettingses(contentLanguage, getGlobalSettingsesRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.GlobalSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    GlobalSettingsApi apiInstance = new GlobalSettingsApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetGlobalSettingsesRequestBody getGlobalSettingsesRequestBody = new GetGlobalSettingsesRequestBody(); // GetGlobalSettingsesRequestBody | 
    try {
      List<GlobalSettings> result = apiInstance.getGlobalSettingses(contentLanguage, getGlobalSettingsesRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalSettingsApi#getGlobalSettingses");
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
 **getGlobalSettingsesRequestBody** | [**GetGlobalSettingsesRequestBody**](GetGlobalSettingsesRequestBody.md)|  |

### Return type

[**List&lt;GlobalSettings&gt;**](GlobalSettings.md)

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

<a name="getGlobalSettingsesConnection"></a>
# **getGlobalSettingsesConnection**
> GlobalSettingsConnection getGlobalSettingsesConnection(contentLanguage, getGlobalSettingsesConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.GlobalSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    GlobalSettingsApi apiInstance = new GlobalSettingsApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetGlobalSettingsesConnectionRequestBody getGlobalSettingsesConnectionRequestBody = new GetGlobalSettingsesConnectionRequestBody(); // GetGlobalSettingsesConnectionRequestBody | 
    try {
      GlobalSettingsConnection result = apiInstance.getGlobalSettingsesConnection(contentLanguage, getGlobalSettingsesConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalSettingsApi#getGlobalSettingsesConnection");
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
 **getGlobalSettingsesConnectionRequestBody** | [**GetGlobalSettingsesConnectionRequestBody**](GetGlobalSettingsesConnectionRequestBody.md)|  |

### Return type

[**GlobalSettingsConnection**](GlobalSettingsConnection.md)

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

<a name="updateClusterRecycleBinSetting"></a>
# **updateClusterRecycleBinSetting**
> List&lt;WithTaskClusterSettings&gt; updateClusterRecycleBinSetting(contentLanguage, clusterRecycleBinUpdationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.GlobalSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    GlobalSettingsApi apiInstance = new GlobalSettingsApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    ClusterRecycleBinUpdationParams clusterRecycleBinUpdationParams = new ClusterRecycleBinUpdationParams(); // ClusterRecycleBinUpdationParams | 
    try {
      List<WithTaskClusterSettings> result = apiInstance.updateClusterRecycleBinSetting(contentLanguage, clusterRecycleBinUpdationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalSettingsApi#updateClusterRecycleBinSetting");
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
 **clusterRecycleBinUpdationParams** | [**ClusterRecycleBinUpdationParams**](ClusterRecycleBinUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskClusterSettings&gt;**](WithTaskClusterSettings.md)

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

<a name="updateGlobalRecycleBinSetting"></a>
# **updateGlobalRecycleBinSetting**
> WithTaskGlobalSettings updateGlobalRecycleBinSetting(contentLanguage, globalRecycleBinUpdationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.GlobalSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    GlobalSettingsApi apiInstance = new GlobalSettingsApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GlobalRecycleBinUpdationParams globalRecycleBinUpdationParams = new GlobalRecycleBinUpdationParams(); // GlobalRecycleBinUpdationParams | 
    try {
      WithTaskGlobalSettings result = apiInstance.updateGlobalRecycleBinSetting(contentLanguage, globalRecycleBinUpdationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalSettingsApi#updateGlobalRecycleBinSetting");
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
 **globalRecycleBinUpdationParams** | [**GlobalRecycleBinUpdationParams**](GlobalRecycleBinUpdationParams.md)|  |

### Return type

[**WithTaskGlobalSettings**](WithTaskGlobalSettings.md)

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

