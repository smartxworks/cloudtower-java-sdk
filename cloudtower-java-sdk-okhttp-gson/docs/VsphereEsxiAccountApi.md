# VsphereEsxiAccountApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVsphereEsxiAccounts**](VsphereEsxiAccountApi.md#getVsphereEsxiAccounts) | **POST** /get-vsphere-esxi-accounts | 
[**getVsphereEsxiAccountsConnection**](VsphereEsxiAccountApi.md#getVsphereEsxiAccountsConnection) | **POST** /get-vsphere-esxi-accounts-connection | 


<a name="getVsphereEsxiAccounts"></a>
# **getVsphereEsxiAccounts**
> List&lt;VsphereEsxiAccount&gt; getVsphereEsxiAccounts(contentLanguage, getVsphereEsxiAccountsRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VsphereEsxiAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VsphereEsxiAccountApi apiInstance = new VsphereEsxiAccountApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetVsphereEsxiAccountsRequestBody getVsphereEsxiAccountsRequestBody = new GetVsphereEsxiAccountsRequestBody(); // GetVsphereEsxiAccountsRequestBody | 
    try {
      List<VsphereEsxiAccount> result = apiInstance.getVsphereEsxiAccounts(contentLanguage, getVsphereEsxiAccountsRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VsphereEsxiAccountApi#getVsphereEsxiAccounts");
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
 **getVsphereEsxiAccountsRequestBody** | [**GetVsphereEsxiAccountsRequestBody**](GetVsphereEsxiAccountsRequestBody.md)|  |

### Return type

[**List&lt;VsphereEsxiAccount&gt;**](VsphereEsxiAccount.md)

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

<a name="getVsphereEsxiAccountsConnection"></a>
# **getVsphereEsxiAccountsConnection**
> VsphereEsxiAccountConnection getVsphereEsxiAccountsConnection(contentLanguage, getVsphereEsxiAccountsConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VsphereEsxiAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VsphereEsxiAccountApi apiInstance = new VsphereEsxiAccountApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetVsphereEsxiAccountsConnectionRequestBody getVsphereEsxiAccountsConnectionRequestBody = new GetVsphereEsxiAccountsConnectionRequestBody(); // GetVsphereEsxiAccountsConnectionRequestBody | 
    try {
      VsphereEsxiAccountConnection result = apiInstance.getVsphereEsxiAccountsConnection(contentLanguage, getVsphereEsxiAccountsConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VsphereEsxiAccountApi#getVsphereEsxiAccountsConnection");
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
 **getVsphereEsxiAccountsConnectionRequestBody** | [**GetVsphereEsxiAccountsConnectionRequestBody**](GetVsphereEsxiAccountsConnectionRequestBody.md)|  |

### Return type

[**VsphereEsxiAccountConnection**](VsphereEsxiAccountConnection.md)

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

