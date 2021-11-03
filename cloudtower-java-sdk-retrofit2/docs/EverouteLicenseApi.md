# EverouteLicenseApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEverouteLicenses**](EverouteLicenseApi.md#getEverouteLicenses) | **POST** get-everoute-licenses | 
[**getEverouteLicensesConnection**](EverouteLicenseApi.md#getEverouteLicensesConnection) | **POST** get-everoute-licenses-connection | 



## getEverouteLicenses

> List&lt;EverouteLicense&gt; getEverouteLicenses(getEverouteLicensesRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.EverouteLicenseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        EverouteLicenseApi apiInstance = new EverouteLicenseApi(defaultClient);
        GetEverouteLicensesRequestBody getEverouteLicensesRequestBody = new GetEverouteLicensesRequestBody(); // GetEverouteLicensesRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<EverouteLicense> result = apiInstance.getEverouteLicenses(getEverouteLicensesRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EverouteLicenseApi#getEverouteLicenses");
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
 **getEverouteLicensesRequestBody** | [**GetEverouteLicensesRequestBody**](GetEverouteLicensesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;EverouteLicense&gt;**](EverouteLicense.md)

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


## getEverouteLicensesConnection

> EverouteLicenseConnection getEverouteLicensesConnection(getEverouteLicensesConnectionRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.EverouteLicenseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        EverouteLicenseApi apiInstance = new EverouteLicenseApi(defaultClient);
        GetEverouteLicensesConnectionRequestBody getEverouteLicensesConnectionRequestBody = new GetEverouteLicensesConnectionRequestBody(); // GetEverouteLicensesConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            EverouteLicenseConnection result = apiInstance.getEverouteLicensesConnection(getEverouteLicensesConnectionRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EverouteLicenseApi#getEverouteLicensesConnection");
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
 **getEverouteLicensesConnectionRequestBody** | [**GetEverouteLicensesConnectionRequestBody**](GetEverouteLicensesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**EverouteLicenseConnection**](EverouteLicenseConnection.md)

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

