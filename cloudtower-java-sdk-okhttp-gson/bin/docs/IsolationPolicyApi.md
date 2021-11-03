# IsolationPolicyApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIsolationPolicies**](IsolationPolicyApi.md#getIsolationPolicies) | **POST** /get-isolation-policies | 
[**getIsolationPoliciesConnection**](IsolationPolicyApi.md#getIsolationPoliciesConnection) | **POST** /get-isolation-policies-connection | 


<a name="getIsolationPolicies"></a>
# **getIsolationPolicies**
> List&lt;IsolationPolicy&gt; getIsolationPolicies(getIsolationPoliciesRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IsolationPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    IsolationPolicyApi apiInstance = new IsolationPolicyApi(defaultClient);
    GetIsolationPoliciesRequestBody getIsolationPoliciesRequestBody = new GetIsolationPoliciesRequestBody(); // GetIsolationPoliciesRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<IsolationPolicy> result = apiInstance.getIsolationPolicies(getIsolationPoliciesRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IsolationPolicyApi#getIsolationPolicies");
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
 **getIsolationPoliciesRequestBody** | [**GetIsolationPoliciesRequestBody**](GetIsolationPoliciesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;IsolationPolicy&gt;**](IsolationPolicy.md)

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

<a name="getIsolationPoliciesConnection"></a>
# **getIsolationPoliciesConnection**
> IsolationPolicyConnection getIsolationPoliciesConnection(getIsolationPoliciesConnectionRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.IsolationPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    IsolationPolicyApi apiInstance = new IsolationPolicyApi(defaultClient);
    GetIsolationPoliciesConnectionRequestBody getIsolationPoliciesConnectionRequestBody = new GetIsolationPoliciesConnectionRequestBody(); // GetIsolationPoliciesConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      IsolationPolicyConnection result = apiInstance.getIsolationPoliciesConnection(getIsolationPoliciesConnectionRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IsolationPolicyApi#getIsolationPoliciesConnection");
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
 **getIsolationPoliciesConnectionRequestBody** | [**GetIsolationPoliciesConnectionRequestBody**](GetIsolationPoliciesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**IsolationPolicyConnection**](IsolationPolicyConnection.md)

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

