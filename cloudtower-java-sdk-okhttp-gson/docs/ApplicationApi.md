# ApplicationApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApplications**](ApplicationApi.md#getApplications) | **POST** /get-applications | 
[**getApplicationsConnection**](ApplicationApi.md#getApplicationsConnection) | **POST** /get-applications-connection | 


<a name="getApplications"></a>
# **getApplications**
> List&lt;Application&gt; getApplications(contentLanguage, getApplicationsRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ApplicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ApplicationApi apiInstance = new ApplicationApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetApplicationsRequestBody getApplicationsRequestBody = new GetApplicationsRequestBody(); // GetApplicationsRequestBody | 
    try {
      List<Application> result = apiInstance.getApplications(contentLanguage, getApplicationsRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getApplications");
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
 **getApplicationsRequestBody** | [**GetApplicationsRequestBody**](GetApplicationsRequestBody.md)|  |

### Return type

[**List&lt;Application&gt;**](Application.md)

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

<a name="getApplicationsConnection"></a>
# **getApplicationsConnection**
> ApplicationConnection getApplicationsConnection(contentLanguage, getApplicationsConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ApplicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ApplicationApi apiInstance = new ApplicationApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetApplicationsConnectionRequestBody getApplicationsConnectionRequestBody = new GetApplicationsConnectionRequestBody(); // GetApplicationsConnectionRequestBody | 
    try {
      ApplicationConnection result = apiInstance.getApplicationsConnection(contentLanguage, getApplicationsConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getApplicationsConnection");
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
 **getApplicationsConnectionRequestBody** | [**GetApplicationsConnectionRequestBody**](GetApplicationsConnectionRequestBody.md)|  |

### Return type

[**ApplicationConnection**](ApplicationConnection.md)

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

