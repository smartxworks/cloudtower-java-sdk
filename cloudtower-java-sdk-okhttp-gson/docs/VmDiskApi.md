# VmDiskApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVmDisks**](VmDiskApi.md#getVmDisks) | **POST** /get-vm-disks | 
[**getVmDisksConnection**](VmDiskApi.md#getVmDisksConnection) | **POST** /get-vm-disks-connection | 


<a name="getVmDisks"></a>
# **getVmDisks**
> List&lt;VmDisk&gt; getVmDisks(contentLanguage, getVmDisksRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmDiskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmDiskApi apiInstance = new VmDiskApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetVmDisksRequestBody getVmDisksRequestBody = new GetVmDisksRequestBody(); // GetVmDisksRequestBody | 
    try {
      List<VmDisk> result = apiInstance.getVmDisks(contentLanguage, getVmDisksRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmDiskApi#getVmDisks");
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
 **getVmDisksRequestBody** | [**GetVmDisksRequestBody**](GetVmDisksRequestBody.md)|  |

### Return type

[**List&lt;VmDisk&gt;**](VmDisk.md)

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

<a name="getVmDisksConnection"></a>
# **getVmDisksConnection**
> VmDiskConnection getVmDisksConnection(contentLanguage, getVmDisksConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmDiskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmDiskApi apiInstance = new VmDiskApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetVmDisksConnectionRequestBody getVmDisksConnectionRequestBody = new GetVmDisksConnectionRequestBody(); // GetVmDisksConnectionRequestBody | 
    try {
      VmDiskConnection result = apiInstance.getVmDisksConnection(contentLanguage, getVmDisksConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmDiskApi#getVmDisksConnection");
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
 **getVmDisksConnectionRequestBody** | [**GetVmDisksConnectionRequestBody**](GetVmDisksConnectionRequestBody.md)|  |

### Return type

[**VmDiskConnection**](VmDiskConnection.md)

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

