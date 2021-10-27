# IpmiApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIpmis**](IpmiApi.md#getIpmis) | **POST** /get-ipmis | 


<a name="getIpmis"></a>
# **getIpmis**
> List&lt;Ipmi&gt; getIpmis(contentLanguage, getIpmisRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IpmiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    IpmiApi apiInstance = new IpmiApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetIpmisRequestBody getIpmisRequestBody = new GetIpmisRequestBody(); // GetIpmisRequestBody | 
    try {
      List<Ipmi> result = apiInstance.getIpmis(contentLanguage, getIpmisRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpmiApi#getIpmis");
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
 **getIpmisRequestBody** | [**GetIpmisRequestBody**](GetIpmisRequestBody.md)|  |

### Return type

[**List&lt;Ipmi&gt;**](Ipmi.md)

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

