# NfsInodeApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNfsInodes**](NfsInodeApi.md#getNfsInodes) | **POST** /get-nfs-inodes | 
[**getNfsInodesConnection**](NfsInodeApi.md#getNfsInodesConnection) | **POST** /get-nfs-inodes-connection | 


<a name="getNfsInodes"></a>
# **getNfsInodes**
> List&lt;NfsInode&gt; getNfsInodes(contentLanguage, getNfsInodesRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NfsInodeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    NfsInodeApi apiInstance = new NfsInodeApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetNfsInodesRequestBody getNfsInodesRequestBody = new GetNfsInodesRequestBody(); // GetNfsInodesRequestBody | 
    try {
      List<NfsInode> result = apiInstance.getNfsInodes(contentLanguage, getNfsInodesRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfsInodeApi#getNfsInodes");
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
 **getNfsInodesRequestBody** | [**GetNfsInodesRequestBody**](GetNfsInodesRequestBody.md)|  |

### Return type

[**List&lt;NfsInode&gt;**](NfsInode.md)

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

<a name="getNfsInodesConnection"></a>
# **getNfsInodesConnection**
> NfsInodeConnection getNfsInodesConnection(contentLanguage, getNfsInodesConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NfsInodeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    NfsInodeApi apiInstance = new NfsInodeApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetNfsInodesConnectionRequestBody getNfsInodesConnectionRequestBody = new GetNfsInodesConnectionRequestBody(); // GetNfsInodesConnectionRequestBody | 
    try {
      NfsInodeConnection result = apiInstance.getNfsInodesConnection(contentLanguage, getNfsInodesConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfsInodeApi#getNfsInodesConnection");
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
 **getNfsInodesConnectionRequestBody** | [**GetNfsInodesConnectionRequestBody**](GetNfsInodesConnectionRequestBody.md)|  |

### Return type

[**NfsInodeConnection**](NfsInodeConnection.md)

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

