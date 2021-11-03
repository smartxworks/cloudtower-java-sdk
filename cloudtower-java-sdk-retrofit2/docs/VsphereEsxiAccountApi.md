# VsphereEsxiAccountApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVsphereEsxiAccounts**](VsphereEsxiAccountApi.md#getVsphereEsxiAccounts) | **POST** get-vsphere-esxi-accounts | 
[**getVsphereEsxiAccountsConnection**](VsphereEsxiAccountApi.md#getVsphereEsxiAccountsConnection) | **POST** get-vsphere-esxi-accounts-connection | 



## getVsphereEsxiAccounts

> List&lt;VsphereEsxiAccount&gt; getVsphereEsxiAccounts(getVsphereEsxiAccountsRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VsphereEsxiAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VsphereEsxiAccountApi apiInstance = new VsphereEsxiAccountApi(defaultClient);
        GetVsphereEsxiAccountsRequestBody getVsphereEsxiAccountsRequestBody = new GetVsphereEsxiAccountsRequestBody(); // GetVsphereEsxiAccountsRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<VsphereEsxiAccount> result = apiInstance.getVsphereEsxiAccounts(getVsphereEsxiAccountsRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VsphereEsxiAccountApi#getVsphereEsxiAccounts");
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
 **getVsphereEsxiAccountsRequestBody** | [**GetVsphereEsxiAccountsRequestBody**](GetVsphereEsxiAccountsRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;VsphereEsxiAccount&gt;**](VsphereEsxiAccount.md)

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


## getVsphereEsxiAccountsConnection

> VsphereEsxiAccountConnection getVsphereEsxiAccountsConnection(getVsphereEsxiAccountsConnectionRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VsphereEsxiAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VsphereEsxiAccountApi apiInstance = new VsphereEsxiAccountApi(defaultClient);
        GetVsphereEsxiAccountsConnectionRequestBody getVsphereEsxiAccountsConnectionRequestBody = new GetVsphereEsxiAccountsConnectionRequestBody(); // GetVsphereEsxiAccountsConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            VsphereEsxiAccountConnection result = apiInstance.getVsphereEsxiAccountsConnection(getVsphereEsxiAccountsConnectionRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VsphereEsxiAccountApi#getVsphereEsxiAccountsConnection");
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
 **getVsphereEsxiAccountsConnectionRequestBody** | [**GetVsphereEsxiAccountsConnectionRequestBody**](GetVsphereEsxiAccountsConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**VsphereEsxiAccountConnection**](VsphereEsxiAccountConnection.md)

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

