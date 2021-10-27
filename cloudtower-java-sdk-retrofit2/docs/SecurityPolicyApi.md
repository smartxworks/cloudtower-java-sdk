# SecurityPolicyApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSecurityPolicies**](SecurityPolicyApi.md#getSecurityPolicies) | **POST** get-security-policies | 
[**getSecurityPoliciesConnection**](SecurityPolicyApi.md#getSecurityPoliciesConnection) | **POST** get-security-policies-connection | 



## getSecurityPolicies

> List&lt;SecurityPolicy&gt; getSecurityPolicies(contentLanguage, getSecurityPoliciesRequestBody)



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
        String contentLanguage = "zh-CN"; // String | 
        GetSecurityPoliciesRequestBody getSecurityPoliciesRequestBody = new GetSecurityPoliciesRequestBody(); // GetSecurityPoliciesRequestBody | 
        try {
            List<SecurityPolicy> result = apiInstance.getSecurityPolicies(contentLanguage, getSecurityPoliciesRequestBody);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getSecurityPoliciesRequestBody** | [**GetSecurityPoliciesRequestBody**](GetSecurityPoliciesRequestBody.md)|  |

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

> SecurityPolicyConnection getSecurityPoliciesConnection(contentLanguage, getSecurityPoliciesConnectionRequestBody)



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
        String contentLanguage = "zh-CN"; // String | 
        GetSecurityPoliciesConnectionRequestBody getSecurityPoliciesConnectionRequestBody = new GetSecurityPoliciesConnectionRequestBody(); // GetSecurityPoliciesConnectionRequestBody | 
        try {
            SecurityPolicyConnection result = apiInstance.getSecurityPoliciesConnection(contentLanguage, getSecurityPoliciesConnectionRequestBody);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getSecurityPoliciesConnectionRequestBody** | [**GetSecurityPoliciesConnectionRequestBody**](GetSecurityPoliciesConnectionRequestBody.md)|  |

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

