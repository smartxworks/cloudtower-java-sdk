# EveroutePackageApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEveroutePackages**](EveroutePackageApi.md#getEveroutePackages) | **POST** get-everoute-packages | 
[**getEveroutePackagesConnection**](EveroutePackageApi.md#getEveroutePackagesConnection) | **POST** get-everoute-packages-connection | 



## getEveroutePackages

> List&lt;EveroutePackage&gt; getEveroutePackages(getEveroutePackagesRequestBody, contentLanguage)



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
        GetEveroutePackagesRequestBody getEveroutePackagesRequestBody = new GetEveroutePackagesRequestBody(); // GetEveroutePackagesRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<EveroutePackage> result = apiInstance.getEveroutePackages(getEveroutePackagesRequestBody, contentLanguage);
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
 **getEveroutePackagesRequestBody** | [**GetEveroutePackagesRequestBody**](GetEveroutePackagesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

> EveroutePackageConnection getEveroutePackagesConnection(getEveroutePackagesConnectionRequestBody, contentLanguage)



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
        GetEveroutePackagesConnectionRequestBody getEveroutePackagesConnectionRequestBody = new GetEveroutePackagesConnectionRequestBody(); // GetEveroutePackagesConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            EveroutePackageConnection result = apiInstance.getEveroutePackagesConnection(getEveroutePackagesConnectionRequestBody, contentLanguage);
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
 **getEveroutePackagesConnectionRequestBody** | [**GetEveroutePackagesConnectionRequestBody**](GetEveroutePackagesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

