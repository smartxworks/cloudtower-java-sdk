# ElfDataStoreApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getElfDataStores**](ElfDataStoreApi.md#getElfDataStores) | **POST** /get-elf-data-stores | 
[**getElfDataStoresConnection**](ElfDataStoreApi.md#getElfDataStoresConnection) | **POST** /get-elf-data-stores-connection | 


<a name="getElfDataStores"></a>
# **getElfDataStores**
> List&lt;ElfDataStore&gt; getElfDataStores(contentLanguage, getElfDataStoresRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ElfDataStoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ElfDataStoreApi apiInstance = new ElfDataStoreApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetElfDataStoresRequestBody getElfDataStoresRequestBody = new GetElfDataStoresRequestBody(); // GetElfDataStoresRequestBody | 
    try {
      List<ElfDataStore> result = apiInstance.getElfDataStores(contentLanguage, getElfDataStoresRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElfDataStoreApi#getElfDataStores");
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
 **getElfDataStoresRequestBody** | [**GetElfDataStoresRequestBody**](GetElfDataStoresRequestBody.md)|  |

### Return type

[**List&lt;ElfDataStore&gt;**](ElfDataStore.md)

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

<a name="getElfDataStoresConnection"></a>
# **getElfDataStoresConnection**
> ElfDataStoreConnection getElfDataStoresConnection(contentLanguage, getElfDataStoresConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ElfDataStoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ElfDataStoreApi apiInstance = new ElfDataStoreApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetElfDataStoresConnectionRequestBody getElfDataStoresConnectionRequestBody = new GetElfDataStoresConnectionRequestBody(); // GetElfDataStoresConnectionRequestBody | 
    try {
      ElfDataStoreConnection result = apiInstance.getElfDataStoresConnection(contentLanguage, getElfDataStoresConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElfDataStoreApi#getElfDataStoresConnection");
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
 **getElfDataStoresConnectionRequestBody** | [**GetElfDataStoresConnectionRequestBody**](GetElfDataStoresConnectionRequestBody.md)|  |

### Return type

[**ElfDataStoreConnection**](ElfDataStoreConnection.md)

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

