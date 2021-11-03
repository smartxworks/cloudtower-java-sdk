# DiscoveredHostApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDiscoverHosts**](DiscoveredHostApi.md#getDiscoverHosts) | **POST** get-discover-hosts | 



## getDiscoverHosts

> List&lt;DiscoveredHost&gt; getDiscoverHosts(getDiscoverHostsRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DiscoveredHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DiscoveredHostApi apiInstance = new DiscoveredHostApi(defaultClient);
        GetDiscoverHostsRequestBody getDiscoverHostsRequestBody = new GetDiscoverHostsRequestBody(); // GetDiscoverHostsRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<DiscoveredHost> result = apiInstance.getDiscoverHosts(getDiscoverHostsRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiscoveredHostApi#getDiscoverHosts");
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
 **getDiscoverHostsRequestBody** | [**GetDiscoverHostsRequestBody**](GetDiscoverHostsRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;DiscoveredHost&gt;**](DiscoveredHost.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** |  |  -  |

