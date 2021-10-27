# VmNicApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVmNics**](VmNicApi.md#getVmNics) | **POST** get-vm-nics | 
[**getVmNicsConnection**](VmNicApi.md#getVmNicsConnection) | **POST** get-vm-nics-connection | 



## getVmNics

> List&lt;VmNic&gt; getVmNics(contentLanguage, getVmNicsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmNicApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmNicApi apiInstance = new VmNicApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmNicsRequestBody getVmNicsRequestBody = new GetVmNicsRequestBody(); // GetVmNicsRequestBody | 
        try {
            List<VmNic> result = apiInstance.getVmNics(contentLanguage, getVmNicsRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmNicApi#getVmNics");
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
 **getVmNicsRequestBody** | [**GetVmNicsRequestBody**](GetVmNicsRequestBody.md)|  |

### Return type

[**List&lt;VmNic&gt;**](VmNic.md)

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


## getVmNicsConnection

> VmNicConnection getVmNicsConnection(contentLanguage, getVmNicsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmNicApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmNicApi apiInstance = new VmNicApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmNicsConnectionRequestBody getVmNicsConnectionRequestBody = new GetVmNicsConnectionRequestBody(); // GetVmNicsConnectionRequestBody | 
        try {
            VmNicConnection result = apiInstance.getVmNicsConnection(contentLanguage, getVmNicsConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmNicApi#getVmNicsConnection");
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
 **getVmNicsConnectionRequestBody** | [**GetVmNicsConnectionRequestBody**](GetVmNicsConnectionRequestBody.md)|  |

### Return type

[**VmNicConnection**](VmNicConnection.md)

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

