# SecurityPolicyApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSecurityPolicies**](SecurityPolicyApi.md#getSecurityPolicies) | **POST** get-security-policies | 
[**getSecurityPoliciesConnection**](SecurityPolicyApi.md#getSecurityPoliciesConnection) | **POST** get-security-policies-connection | 



## getSecurityPolicies

> List&lt;SecurityPolicy&gt; getSecurityPolicies(getSecurityPoliciesRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SecurityPolicyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SecurityPolicyApi apiInstance = new SecurityPolicyApi(defaultClient);
        GetSecurityPoliciesRequestBody getSecurityPoliciesRequestBody = new GetSecurityPoliciesRequestBody(); // GetSecurityPoliciesRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<SecurityPolicy> result = apiInstance.getSecurityPolicies(getSecurityPoliciesRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityPolicyApi#getSecurityPolicies");
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
 **getSecurityPoliciesRequestBody** | [**GetSecurityPoliciesRequestBody**](GetSecurityPoliciesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;SecurityPolicy&gt;**](SecurityPolicy.md)

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


## getSecurityPoliciesConnection

> SecurityPolicyConnection getSecurityPoliciesConnection(getSecurityPoliciesConnectionRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SecurityPolicyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        SecurityPolicyApi apiInstance = new SecurityPolicyApi(defaultClient);
        GetSecurityPoliciesConnectionRequestBody getSecurityPoliciesConnectionRequestBody = new GetSecurityPoliciesConnectionRequestBody(); // GetSecurityPoliciesConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            SecurityPolicyConnection result = apiInstance.getSecurityPoliciesConnection(getSecurityPoliciesConnectionRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityPolicyApi#getSecurityPoliciesConnection");
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
 **getSecurityPoliciesConnectionRequestBody** | [**GetSecurityPoliciesConnectionRequestBody**](GetSecurityPoliciesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**SecurityPolicyConnection**](SecurityPolicyConnection.md)

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

