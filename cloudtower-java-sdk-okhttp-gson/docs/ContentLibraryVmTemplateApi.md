# ContentLibraryVmTemplateApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getContentLibraryVmTemplates**](ContentLibraryVmTemplateApi.md#getContentLibraryVmTemplates) | **POST** /get-content-library-vm-templates | 
[**getContentLibraryVmTemplatesConnection**](ContentLibraryVmTemplateApi.md#getContentLibraryVmTemplatesConnection) | **POST** /get-content-library-vm-templates-connection | 


<a name="getContentLibraryVmTemplates"></a>
# **getContentLibraryVmTemplates**
> List&lt;ContentLibraryVmTemplate&gt; getContentLibraryVmTemplates(getContentLibraryVmTemplatesRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ContentLibraryVmTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ContentLibraryVmTemplateApi apiInstance = new ContentLibraryVmTemplateApi(defaultClient);
    GetContentLibraryVmTemplatesRequestBody getContentLibraryVmTemplatesRequestBody = new GetContentLibraryVmTemplatesRequestBody(); // GetContentLibraryVmTemplatesRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<ContentLibraryVmTemplate> result = apiInstance.getContentLibraryVmTemplates(getContentLibraryVmTemplatesRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentLibraryVmTemplateApi#getContentLibraryVmTemplates");
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
 **getContentLibraryVmTemplatesRequestBody** | [**GetContentLibraryVmTemplatesRequestBody**](GetContentLibraryVmTemplatesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;ContentLibraryVmTemplate&gt;**](ContentLibraryVmTemplate.md)

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

<a name="getContentLibraryVmTemplatesConnection"></a>
# **getContentLibraryVmTemplatesConnection**
> ContentLibraryVmTemplateConnection getContentLibraryVmTemplatesConnection(getContentLibraryVmTemplatesConnectionRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ContentLibraryVmTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ContentLibraryVmTemplateApi apiInstance = new ContentLibraryVmTemplateApi(defaultClient);
    GetContentLibraryVmTemplatesConnectionRequestBody getContentLibraryVmTemplatesConnectionRequestBody = new GetContentLibraryVmTemplatesConnectionRequestBody(); // GetContentLibraryVmTemplatesConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      ContentLibraryVmTemplateConnection result = apiInstance.getContentLibraryVmTemplatesConnection(getContentLibraryVmTemplatesConnectionRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentLibraryVmTemplateApi#getContentLibraryVmTemplatesConnection");
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
 **getContentLibraryVmTemplatesConnectionRequestBody** | [**GetContentLibraryVmTemplatesConnectionRequestBody**](GetContentLibraryVmTemplatesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**ContentLibraryVmTemplateConnection**](ContentLibraryVmTemplateConnection.md)

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

