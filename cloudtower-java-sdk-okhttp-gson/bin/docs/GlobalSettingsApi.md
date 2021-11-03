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
> List&lt;WithTaskClusterSettings&gt; createClusterRecycleBinSetting(clusterRecycleBinCreationParams, contentLanguage)



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
    ClusterRecycleBinCreationParams clusterRecycleBinCreationParams = new ClusterRecycleBinCreationParams(); // ClusterRecycleBinCreationParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskClusterSettings> result = apiInstance.createClusterRecycleBinSetting(clusterRecycleBinCreationParams, contentLanguage);
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
 **clusterRecycleBinCreationParams** | [**ClusterRecycleBinCreationParams**](ClusterRecycleBinCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
> List&lt;WithTaskDeleteClusterRecycleBin&gt; deleteClusterRecycleBinSetting(clusterRecycleBinDeletionParams, contentLanguage)



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
    ClusterRecycleBinDeletionParams clusterRecycleBinDeletionParams = new ClusterRecycleBinDeletionParams(); // ClusterRecycleBinDeletionParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskDeleteClusterRecycleBin> result = apiInstance.deleteClusterRecycleBinSetting(clusterRecycleBinDeletionParams, contentLanguage);
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
 **clusterRecycleBinDeletionParams** | [**ClusterRecycleBinDeletionParams**](ClusterRecycleBinDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
> List&lt;GlobalSettings&gt; getGlobalSettingses(getGlobalSettingsesRequestBody, contentLanguage)



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
    GetGlobalSettingsesRequestBody getGlobalSettingsesRequestBody = new GetGlobalSettingsesRequestBody(); // GetGlobalSettingsesRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<GlobalSettings> result = apiInstance.getGlobalSettingses(getGlobalSettingsesRequestBody, contentLanguage);
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
 **getGlobalSettingsesRequestBody** | [**GetGlobalSettingsesRequestBody**](GetGlobalSettingsesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
> GlobalSettingsConnection getGlobalSettingsesConnection(getGlobalSettingsesConnectionRequestBody, contentLanguage)



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
    GetGlobalSettingsesConnectionRequestBody getGlobalSettingsesConnectionRequestBody = new GetGlobalSettingsesConnectionRequestBody(); // GetGlobalSettingsesConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      GlobalSettingsConnection result = apiInstance.getGlobalSettingsesConnection(getGlobalSettingsesConnectionRequestBody, contentLanguage);
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
 **getGlobalSettingsesConnectionRequestBody** | [**GetGlobalSettingsesConnectionRequestBody**](GetGlobalSettingsesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
> List&lt;WithTaskClusterSettings&gt; updateClusterRecycleBinSetting(clusterRecycleBinUpdationParams, contentLanguage)



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
    ClusterRecycleBinUpdationParams clusterRecycleBinUpdationParams = new ClusterRecycleBinUpdationParams(); // ClusterRecycleBinUpdationParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskClusterSettings> result = apiInstance.updateClusterRecycleBinSetting(clusterRecycleBinUpdationParams, contentLanguage);
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
 **clusterRecycleBinUpdationParams** | [**ClusterRecycleBinUpdationParams**](ClusterRecycleBinUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
> WithTaskGlobalSettings updateGlobalRecycleBinSetting(globalRecycleBinUpdationParams, contentLanguage)



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
    GlobalRecycleBinUpdationParams globalRecycleBinUpdationParams = new GlobalRecycleBinUpdationParams(); // GlobalRecycleBinUpdationParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      WithTaskGlobalSettings result = apiInstance.updateGlobalRecycleBinSetting(globalRecycleBinUpdationParams, contentLanguage);
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
 **globalRecycleBinUpdationParams** | [**GlobalRecycleBinUpdationParams**](GlobalRecycleBinUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

