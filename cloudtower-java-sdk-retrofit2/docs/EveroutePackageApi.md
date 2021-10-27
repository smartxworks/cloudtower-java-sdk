# EveroutePackageApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEveroutePackages**](EveroutePackageApi.md#getEveroutePackages) | **POST** get-everoute-packages | 
[**getEveroutePackagesConnection**](EveroutePackageApi.md#getEveroutePackagesConnection) | **POST** get-everoute-packages-connection | 



## getEveroutePackages

> List&lt;EveroutePackage&gt; getEveroutePackages(contentLanguage, getEveroutePackagesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.EveroutePackageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        EveroutePackageApi apiInstance = new EveroutePackageApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetEveroutePackagesRequestBody getEveroutePackagesRequestBody = new GetEveroutePackagesRequestBody(); // GetEveroutePackagesRequestBody | 
        try {
            List<EveroutePackage> result = apiInstance.getEveroutePackages(contentLanguage, getEveroutePackagesRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EveroutePackageApi#getEveroutePackages");
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
 **getEveroutePackagesRequestBody** | [**GetEveroutePackagesRequestBody**](GetEveroutePackagesRequestBody.md)|  |

### Return type

[**List&lt;EveroutePackage&gt;**](EveroutePackage.md)

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


## getEveroutePackagesConnection

> EveroutePackageConnection getEveroutePackagesConnection(contentLanguage, getEveroutePackagesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.EveroutePackageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        EveroutePackageApi apiInstance = new EveroutePackageApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetEveroutePackagesConnectionRequestBody getEveroutePackagesConnectionRequestBody = new GetEveroutePackagesConnectionRequestBody(); // GetEveroutePackagesConnectionRequestBody | 
        try {
            EveroutePackageConnection result = apiInstance.getEveroutePackagesConnection(contentLanguage, getEveroutePackagesConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EveroutePackageApi#getEveroutePackagesConnection");
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
 **getEveroutePackagesConnectionRequestBody** | [**GetEveroutePackagesConnectionRequestBody**](GetEveroutePackagesConnectionRequestBody.md)|  |

### Return type

[**EveroutePackageConnection**](EveroutePackageConnection.md)

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

