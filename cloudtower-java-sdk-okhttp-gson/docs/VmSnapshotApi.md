# VmSnapshotApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVmSnapshot**](VmSnapshotApi.md#createVmSnapshot) | **POST** /create-vm-snapshot | 
[**deleteVmSnapshot**](VmSnapshotApi.md#deleteVmSnapshot) | **POST** /delete-vm-snapshot | 
[**getVmSnapshots**](VmSnapshotApi.md#getVmSnapshots) | **POST** /get-vm-snapshots | 
[**getVmSnapshotsConnection**](VmSnapshotApi.md#getVmSnapshotsConnection) | **POST** /get-vm-snapshots-connection | 


<a name="createVmSnapshot"></a>
# **createVmSnapshot**
> List&lt;WithTaskVmSnapshot&gt; createVmSnapshot(contentLanguage, vmSnapshotCreationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmSnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmSnapshotApi apiInstance = new VmSnapshotApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmSnapshotCreationParams vmSnapshotCreationParams = new VmSnapshotCreationParams(); // VmSnapshotCreationParams | 
    try {
      List<WithTaskVmSnapshot> result = apiInstance.createVmSnapshot(contentLanguage, vmSnapshotCreationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmSnapshotApi#createVmSnapshot");
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
 **vmSnapshotCreationParams** | [**VmSnapshotCreationParams**](VmSnapshotCreationParams.md)|  |

### Return type

[**List&lt;WithTaskVmSnapshot&gt;**](WithTaskVmSnapshot.md)

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

<a name="deleteVmSnapshot"></a>
# **deleteVmSnapshot**
> List&lt;WithTaskDeleteVmSnapshot&gt; deleteVmSnapshot(contentLanguage, vmSnapshotDeletionParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmSnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmSnapshotApi apiInstance = new VmSnapshotApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmSnapshotDeletionParams vmSnapshotDeletionParams = new VmSnapshotDeletionParams(); // VmSnapshotDeletionParams | 
    try {
      List<WithTaskDeleteVmSnapshot> result = apiInstance.deleteVmSnapshot(contentLanguage, vmSnapshotDeletionParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmSnapshotApi#deleteVmSnapshot");
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
 **vmSnapshotDeletionParams** | [**VmSnapshotDeletionParams**](VmSnapshotDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteVmSnapshot&gt;**](WithTaskDeleteVmSnapshot.md)

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

<a name="getVmSnapshots"></a>
# **getVmSnapshots**
> List&lt;VmSnapshot&gt; getVmSnapshots(contentLanguage, getVmSnapshotsRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmSnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmSnapshotApi apiInstance = new VmSnapshotApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetVmSnapshotsRequestBody getVmSnapshotsRequestBody = new GetVmSnapshotsRequestBody(); // GetVmSnapshotsRequestBody | 
    try {
      List<VmSnapshot> result = apiInstance.getVmSnapshots(contentLanguage, getVmSnapshotsRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmSnapshotApi#getVmSnapshots");
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
 **getVmSnapshotsRequestBody** | [**GetVmSnapshotsRequestBody**](GetVmSnapshotsRequestBody.md)|  |

### Return type

[**List&lt;VmSnapshot&gt;**](VmSnapshot.md)

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

<a name="getVmSnapshotsConnection"></a>
# **getVmSnapshotsConnection**
> VmSnapshotConnection getVmSnapshotsConnection(contentLanguage, getVmSnapshotsConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmSnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmSnapshotApi apiInstance = new VmSnapshotApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetVmSnapshotsConnectionRequestBody getVmSnapshotsConnectionRequestBody = new GetVmSnapshotsConnectionRequestBody(); // GetVmSnapshotsConnectionRequestBody | 
    try {
      VmSnapshotConnection result = apiInstance.getVmSnapshotsConnection(contentLanguage, getVmSnapshotsConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmSnapshotApi#getVmSnapshotsConnection");
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
 **getVmSnapshotsConnectionRequestBody** | [**GetVmSnapshotsConnectionRequestBody**](GetVmSnapshotsConnectionRequestBody.md)|  |

### Return type

[**VmSnapshotConnection**](VmSnapshotConnection.md)

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

