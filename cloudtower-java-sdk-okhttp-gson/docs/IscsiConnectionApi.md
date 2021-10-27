# IscsiConnectionApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIscsiConnections**](IscsiConnectionApi.md#getIscsiConnections) | **POST** /get-iscsi-connections | 


<a name="getIscsiConnections"></a>
# **getIscsiConnections**
> List&lt;IscsiConnection&gt; getIscsiConnections(contentLanguage, getIscsiConnectionsRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IscsiConnectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    IscsiConnectionApi apiInstance = new IscsiConnectionApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetIscsiConnectionsRequestBody getIscsiConnectionsRequestBody = new GetIscsiConnectionsRequestBody(); // GetIscsiConnectionsRequestBody | 
    try {
      List<IscsiConnection> result = apiInstance.getIscsiConnections(contentLanguage, getIscsiConnectionsRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IscsiConnectionApi#getIscsiConnections");
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
 **getIscsiConnectionsRequestBody** | [**GetIscsiConnectionsRequestBody**](GetIscsiConnectionsRequestBody.md)|  |

### Return type

[**List&lt;IscsiConnection&gt;**](IscsiConnection.md)

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

