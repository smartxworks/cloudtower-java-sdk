# PmemDimmApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPmemDimms**](PmemDimmApi.md#getPmemDimms) | **POST** /get-pmem-dimms | 
[**getPmemDimmsConnection**](PmemDimmApi.md#getPmemDimmsConnection) | **POST** /get-pmem-dimms-connection | 


<a name="getPmemDimms"></a>
# **getPmemDimms**
> List&lt;PmemDimm&gt; getPmemDimms(getPmemDimmsRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.PmemDimmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PmemDimmApi apiInstance = new PmemDimmApi(defaultClient);
    GetPmemDimmsRequestBody getPmemDimmsRequestBody = new GetPmemDimmsRequestBody(); // GetPmemDimmsRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<PmemDimm> result = apiInstance.getPmemDimms(getPmemDimmsRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PmemDimmApi#getPmemDimms");
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
 **getPmemDimmsRequestBody** | [**GetPmemDimmsRequestBody**](GetPmemDimmsRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;PmemDimm&gt;**](PmemDimm.md)

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

<a name="getPmemDimmsConnection"></a>
# **getPmemDimmsConnection**
> PmemDimmConnection getPmemDimmsConnection(getPmemDimmsConnectionRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.PmemDimmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PmemDimmApi apiInstance = new PmemDimmApi(defaultClient);
    GetPmemDimmsConnectionRequestBody getPmemDimmsConnectionRequestBody = new GetPmemDimmsConnectionRequestBody(); // GetPmemDimmsConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      PmemDimmConnection result = apiInstance.getPmemDimmsConnection(getPmemDimmsConnectionRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PmemDimmApi#getPmemDimmsConnection");
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
 **getPmemDimmsConnectionRequestBody** | [**GetPmemDimmsConnectionRequestBody**](GetPmemDimmsConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**PmemDimmConnection**](PmemDimmConnection.md)

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

