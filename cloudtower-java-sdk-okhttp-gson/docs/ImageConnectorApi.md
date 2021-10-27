# ImageConnectorApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getImagesConnector**](ImageConnectorApi.md#getImagesConnector) | **POST** /get-images-connector | 


<a name="getImagesConnector"></a>
# **getImagesConnector**
> List&lt;ImageConnector&gt; getImagesConnector(contentLanguage, getImagesConnectorRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ImageConnectorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ImageConnectorApi apiInstance = new ImageConnectorApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetImagesConnectorRequestBody getImagesConnectorRequestBody = new GetImagesConnectorRequestBody(); // GetImagesConnectorRequestBody | 
    try {
      List<ImageConnector> result = apiInstance.getImagesConnector(contentLanguage, getImagesConnectorRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageConnectorApi#getImagesConnector");
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
 **getImagesConnectorRequestBody** | [**GetImagesConnectorRequestBody**](GetImagesConnectorRequestBody.md)|  |

### Return type

[**List&lt;ImageConnector&gt;**](ImageConnector.md)

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

