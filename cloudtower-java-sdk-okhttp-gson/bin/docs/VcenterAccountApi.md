# VcenterAccountApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVcenterAccounts**](VcenterAccountApi.md#getVcenterAccounts) | **POST** /get-vcenter-accounts | 
[**getVcenterAccountsConnection**](VcenterAccountApi.md#getVcenterAccountsConnection) | **POST** /get-vcenter-accounts-connection | 


<a name="getVcenterAccounts"></a>
# **getVcenterAccounts**
> List&lt;VcenterAccount&gt; getVcenterAccounts(getVcenterAccountsRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VcenterAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VcenterAccountApi apiInstance = new VcenterAccountApi(defaultClient);
    GetVcenterAccountsRequestBody getVcenterAccountsRequestBody = new GetVcenterAccountsRequestBody(); // GetVcenterAccountsRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<VcenterAccount> result = apiInstance.getVcenterAccounts(getVcenterAccountsRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VcenterAccountApi#getVcenterAccounts");
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
 **getVcenterAccountsRequestBody** | [**GetVcenterAccountsRequestBody**](GetVcenterAccountsRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;VcenterAccount&gt;**](VcenterAccount.md)

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

<a name="getVcenterAccountsConnection"></a>
# **getVcenterAccountsConnection**
> VcenterAccountConnection getVcenterAccountsConnection(getVcenterAccountsConnectionRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VcenterAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VcenterAccountApi apiInstance = new VcenterAccountApi(defaultClient);
    GetVcenterAccountsConnectionRequestBody getVcenterAccountsConnectionRequestBody = new GetVcenterAccountsConnectionRequestBody(); // GetVcenterAccountsConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      VcenterAccountConnection result = apiInstance.getVcenterAccountsConnection(getVcenterAccountsConnectionRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VcenterAccountApi#getVcenterAccountsConnection");
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
 **getVcenterAccountsConnectionRequestBody** | [**GetVcenterAccountsConnectionRequestBody**](GetVcenterAccountsConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**VcenterAccountConnection**](VcenterAccountConnection.md)

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

