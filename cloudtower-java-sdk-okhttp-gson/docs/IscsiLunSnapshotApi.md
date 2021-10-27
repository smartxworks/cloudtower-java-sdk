# IscsiLunSnapshotApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIscsiLunSnapshot**](IscsiLunSnapshotApi.md#createIscsiLunSnapshot) | **POST** /create-iscsi-lun-snapshot | 
[**deleteIscsiLunSnapshot**](IscsiLunSnapshotApi.md#deleteIscsiLunSnapshot) | **POST** /delete-iscsi-lun-snapshot | 
[**getIscsiLunSnapshots**](IscsiLunSnapshotApi.md#getIscsiLunSnapshots) | **POST** /get-iscsi-lun-snapshots | 
[**getIscsiLunSnapshotsConnection**](IscsiLunSnapshotApi.md#getIscsiLunSnapshotsConnection) | **POST** /get-iscsi-lun-snapshots-connection | 


<a name="createIscsiLunSnapshot"></a>
# **createIscsiLunSnapshot**
> List&lt;WithTaskIscsiLunSnapshot&gt; createIscsiLunSnapshot(contentLanguage, iscsiLunSnapshotCreationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunSnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    IscsiLunSnapshotApi apiInstance = new IscsiLunSnapshotApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    List<IscsiLunSnapshotCreationParams> iscsiLunSnapshotCreationParams = Arrays.asList(); // List<IscsiLunSnapshotCreationParams> | 
    try {
      List<WithTaskIscsiLunSnapshot> result = apiInstance.createIscsiLunSnapshot(contentLanguage, iscsiLunSnapshotCreationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IscsiLunSnapshotApi#createIscsiLunSnapshot");
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
 **iscsiLunSnapshotCreationParams** | [**List&lt;IscsiLunSnapshotCreationParams&gt;**](IscsiLunSnapshotCreationParams.md)|  |

### Return type

[**List&lt;WithTaskIscsiLunSnapshot&gt;**](WithTaskIscsiLunSnapshot.md)

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

<a name="deleteIscsiLunSnapshot"></a>
# **deleteIscsiLunSnapshot**
> List&lt;WithTaskDeleteIscsiLunSnapshot&gt; deleteIscsiLunSnapshot(contentLanguage, iscsiLunSnapshotDeletionParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunSnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    IscsiLunSnapshotApi apiInstance = new IscsiLunSnapshotApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    IscsiLunSnapshotDeletionParams iscsiLunSnapshotDeletionParams = new IscsiLunSnapshotDeletionParams(); // IscsiLunSnapshotDeletionParams | 
    try {
      List<WithTaskDeleteIscsiLunSnapshot> result = apiInstance.deleteIscsiLunSnapshot(contentLanguage, iscsiLunSnapshotDeletionParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IscsiLunSnapshotApi#deleteIscsiLunSnapshot");
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
 **iscsiLunSnapshotDeletionParams** | [**IscsiLunSnapshotDeletionParams**](IscsiLunSnapshotDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteIscsiLunSnapshot&gt;**](WithTaskDeleteIscsiLunSnapshot.md)

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

<a name="getIscsiLunSnapshots"></a>
# **getIscsiLunSnapshots**
> List&lt;IscsiLunSnapshot&gt; getIscsiLunSnapshots(contentLanguage, getIscsiLunSnapshotsRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunSnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    IscsiLunSnapshotApi apiInstance = new IscsiLunSnapshotApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetIscsiLunSnapshotsRequestBody getIscsiLunSnapshotsRequestBody = new GetIscsiLunSnapshotsRequestBody(); // GetIscsiLunSnapshotsRequestBody | 
    try {
      List<IscsiLunSnapshot> result = apiInstance.getIscsiLunSnapshots(contentLanguage, getIscsiLunSnapshotsRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IscsiLunSnapshotApi#getIscsiLunSnapshots");
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
 **getIscsiLunSnapshotsRequestBody** | [**GetIscsiLunSnapshotsRequestBody**](GetIscsiLunSnapshotsRequestBody.md)|  |

### Return type

[**List&lt;IscsiLunSnapshot&gt;**](IscsiLunSnapshot.md)

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

<a name="getIscsiLunSnapshotsConnection"></a>
# **getIscsiLunSnapshotsConnection**
> IscsiLunSnapshotConnection getIscsiLunSnapshotsConnection(contentLanguage, getIscsiLunSnapshotsConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiLunSnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    IscsiLunSnapshotApi apiInstance = new IscsiLunSnapshotApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetIscsiLunSnapshotsConnectionRequestBody getIscsiLunSnapshotsConnectionRequestBody = new GetIscsiLunSnapshotsConnectionRequestBody(); // GetIscsiLunSnapshotsConnectionRequestBody | 
    try {
      IscsiLunSnapshotConnection result = apiInstance.getIscsiLunSnapshotsConnection(contentLanguage, getIscsiLunSnapshotsConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IscsiLunSnapshotApi#getIscsiLunSnapshotsConnection");
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
 **getIscsiLunSnapshotsConnectionRequestBody** | [**GetIscsiLunSnapshotsConnectionRequestBody**](GetIscsiLunSnapshotsConnectionRequestBody.md)|  |

### Return type

[**IscsiLunSnapshotConnection**](IscsiLunSnapshotConnection.md)

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

