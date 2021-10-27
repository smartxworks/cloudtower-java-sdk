# ElfStoragePolicyApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getElfStoragePolicies**](ElfStoragePolicyApi.md#getElfStoragePolicies) | **POST** get-elf-storage-policies | 
[**getElfStoragePoliciesConnection**](ElfStoragePolicyApi.md#getElfStoragePoliciesConnection) | **POST** get-elf-storage-policies-connection | 



## getElfStoragePolicies

> List&lt;ElfStoragePolicy&gt; getElfStoragePolicies(contentLanguage, getElfStoragePoliciesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ElfStoragePolicyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ElfStoragePolicyApi apiInstance = new ElfStoragePolicyApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetElfStoragePoliciesRequestBody getElfStoragePoliciesRequestBody = new GetElfStoragePoliciesRequestBody(); // GetElfStoragePoliciesRequestBody | 
        try {
            List<ElfStoragePolicy> result = apiInstance.getElfStoragePolicies(contentLanguage, getElfStoragePoliciesRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ElfStoragePolicyApi#getElfStoragePolicies");
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
 **getElfStoragePoliciesRequestBody** | [**GetElfStoragePoliciesRequestBody**](GetElfStoragePoliciesRequestBody.md)|  |

### Return type

[**List&lt;ElfStoragePolicy&gt;**](ElfStoragePolicy.md)

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


## getElfStoragePoliciesConnection

> ElfStoragePolicyConnection getElfStoragePoliciesConnection(contentLanguage, getElfStoragePoliciesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ElfStoragePolicyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ElfStoragePolicyApi apiInstance = new ElfStoragePolicyApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetElfStoragePoliciesConnectionRequestBody getElfStoragePoliciesConnectionRequestBody = new GetElfStoragePoliciesConnectionRequestBody(); // GetElfStoragePoliciesConnectionRequestBody | 
        try {
            ElfStoragePolicyConnection result = apiInstance.getElfStoragePoliciesConnection(contentLanguage, getElfStoragePoliciesConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ElfStoragePolicyApi#getElfStoragePoliciesConnection");
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
 **getElfStoragePoliciesConnectionRequestBody** | [**GetElfStoragePoliciesConnectionRequestBody**](GetElfStoragePoliciesConnectionRequestBody.md)|  |

### Return type

[**ElfStoragePolicyConnection**](ElfStoragePolicyConnection.md)

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

