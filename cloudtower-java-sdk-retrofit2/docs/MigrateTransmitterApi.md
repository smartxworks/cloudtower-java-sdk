# MigrateTransmitterApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMigrateTransmitters**](MigrateTransmitterApi.md#getMigrateTransmitters) | **POST** get-migrate-transmitters | 
[**getMigrateTransmittersConnection**](MigrateTransmitterApi.md#getMigrateTransmittersConnection) | **POST** get-migrate-transmitters-connection | 



## getMigrateTransmitters

> List&lt;MigrateTransmitter&gt; getMigrateTransmitters(contentLanguage, getMigrateTransmittersRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.MigrateTransmitterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        MigrateTransmitterApi apiInstance = new MigrateTransmitterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetMigrateTransmittersRequestBody getMigrateTransmittersRequestBody = new GetMigrateTransmittersRequestBody(); // GetMigrateTransmittersRequestBody | 
        try {
            List<MigrateTransmitter> result = apiInstance.getMigrateTransmitters(contentLanguage, getMigrateTransmittersRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MigrateTransmitterApi#getMigrateTransmitters");
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
 **getMigrateTransmittersRequestBody** | [**GetMigrateTransmittersRequestBody**](GetMigrateTransmittersRequestBody.md)|  |

### Return type

[**List&lt;MigrateTransmitter&gt;**](MigrateTransmitter.md)

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


## getMigrateTransmittersConnection

> MigrateTransmitterConnection getMigrateTransmittersConnection(contentLanguage, getMigrateTransmittersConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.MigrateTransmitterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        MigrateTransmitterApi apiInstance = new MigrateTransmitterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetMigrateTransmittersConnectionRequestBody getMigrateTransmittersConnectionRequestBody = new GetMigrateTransmittersConnectionRequestBody(); // GetMigrateTransmittersConnectionRequestBody | 
        try {
            MigrateTransmitterConnection result = apiInstance.getMigrateTransmittersConnection(contentLanguage, getMigrateTransmittersConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MigrateTransmitterApi#getMigrateTransmittersConnection");
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
 **getMigrateTransmittersConnectionRequestBody** | [**GetMigrateTransmittersConnectionRequestBody**](GetMigrateTransmittersConnectionRequestBody.md)|  |

### Return type

[**MigrateTransmitterConnection**](MigrateTransmitterConnection.md)

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

