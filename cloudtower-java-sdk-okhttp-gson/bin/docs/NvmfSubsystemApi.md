# NvmfSubsystemApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNvmfSubsystems**](NvmfSubsystemApi.md#getNvmfSubsystems) | **POST** /get-nvmf-subsystems | 
[**getNvmfSubsystemsConnection**](NvmfSubsystemApi.md#getNvmfSubsystemsConnection) | **POST** /get-nvmf-subsystems-connection | 


<a name="getNvmfSubsystems"></a>
# **getNvmfSubsystems**
> List&lt;NvmfSubsystem&gt; getNvmfSubsystems(getNvmfSubsystemsRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfSubsystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    NvmfSubsystemApi apiInstance = new NvmfSubsystemApi(defaultClient);
    GetNvmfSubsystemsRequestBody getNvmfSubsystemsRequestBody = new GetNvmfSubsystemsRequestBody(); // GetNvmfSubsystemsRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<NvmfSubsystem> result = apiInstance.getNvmfSubsystems(getNvmfSubsystemsRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NvmfSubsystemApi#getNvmfSubsystems");
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
 **getNvmfSubsystemsRequestBody** | [**GetNvmfSubsystemsRequestBody**](GetNvmfSubsystemsRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;NvmfSubsystem&gt;**](NvmfSubsystem.md)

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

<a name="getNvmfSubsystemsConnection"></a>
# **getNvmfSubsystemsConnection**
> NvmfSubsystemConnection getNvmfSubsystemsConnection(getNvmfSubsystemsConnectionRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NvmfSubsystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    NvmfSubsystemApi apiInstance = new NvmfSubsystemApi(defaultClient);
    GetNvmfSubsystemsConnectionRequestBody getNvmfSubsystemsConnectionRequestBody = new GetNvmfSubsystemsConnectionRequestBody(); // GetNvmfSubsystemsConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      NvmfSubsystemConnection result = apiInstance.getNvmfSubsystemsConnection(getNvmfSubsystemsConnectionRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NvmfSubsystemApi#getNvmfSubsystemsConnection");
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
 **getNvmfSubsystemsConnectionRequestBody** | [**GetNvmfSubsystemsConnectionRequestBody**](GetNvmfSubsystemsConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**NvmfSubsystemConnection**](NvmfSubsystemConnection.md)

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

