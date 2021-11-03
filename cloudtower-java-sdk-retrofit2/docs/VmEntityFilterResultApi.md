# VmEntityFilterResultApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVmEntityFilterResults**](VmEntityFilterResultApi.md#getVmEntityFilterResults) | **POST** get-vm-entity-filter-results | 
[**getVmEntityFilterResultsConnection**](VmEntityFilterResultApi.md#getVmEntityFilterResultsConnection) | **POST** get-vm-entity-filter-results-connection | 



## getVmEntityFilterResults

> List&lt;VmEntityFilterResult&gt; getVmEntityFilterResults(getVmEntityFilterResultsRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmEntityFilterResultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmEntityFilterResultApi apiInstance = new VmEntityFilterResultApi(defaultClient);
        GetVmEntityFilterResultsRequestBody getVmEntityFilterResultsRequestBody = new GetVmEntityFilterResultsRequestBody(); // GetVmEntityFilterResultsRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<VmEntityFilterResult> result = apiInstance.getVmEntityFilterResults(getVmEntityFilterResultsRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmEntityFilterResultApi#getVmEntityFilterResults");
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
 **getVmEntityFilterResultsRequestBody** | [**GetVmEntityFilterResultsRequestBody**](GetVmEntityFilterResultsRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;VmEntityFilterResult&gt;**](VmEntityFilterResult.md)

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


## getVmEntityFilterResultsConnection

> VmEntityFilterResultConnection getVmEntityFilterResultsConnection(getVmEntityFilterResultsConnectionRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmEntityFilterResultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmEntityFilterResultApi apiInstance = new VmEntityFilterResultApi(defaultClient);
        GetVmEntityFilterResultsConnectionRequestBody getVmEntityFilterResultsConnectionRequestBody = new GetVmEntityFilterResultsConnectionRequestBody(); // GetVmEntityFilterResultsConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            VmEntityFilterResultConnection result = apiInstance.getVmEntityFilterResultsConnection(getVmEntityFilterResultsConnectionRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmEntityFilterResultApi#getVmEntityFilterResultsConnection");
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
 **getVmEntityFilterResultsConnectionRequestBody** | [**GetVmEntityFilterResultsConnectionRequestBody**](GetVmEntityFilterResultsConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**VmEntityFilterResultConnection**](VmEntityFilterResultConnection.md)

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

