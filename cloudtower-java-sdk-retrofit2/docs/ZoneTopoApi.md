# ZoneTopoApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getZoneTopoes**](ZoneTopoApi.md#getZoneTopoes) | **POST** get-zone-topoes | 
[**getZoneTopoesConnection**](ZoneTopoApi.md#getZoneTopoesConnection) | **POST** get-zone-topoes-connection | 



## getZoneTopoes

> List&lt;ZoneTopo&gt; getZoneTopoes(contentLanguage, getZoneTopoesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ZoneTopoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ZoneTopoApi apiInstance = new ZoneTopoApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetZoneTopoesRequestBody getZoneTopoesRequestBody = new GetZoneTopoesRequestBody(); // GetZoneTopoesRequestBody | 
        try {
            List<ZoneTopo> result = apiInstance.getZoneTopoes(contentLanguage, getZoneTopoesRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ZoneTopoApi#getZoneTopoes");
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
 **getZoneTopoesRequestBody** | [**GetZoneTopoesRequestBody**](GetZoneTopoesRequestBody.md)|  |

### Return type

[**List&lt;ZoneTopo&gt;**](ZoneTopo.md)

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


## getZoneTopoesConnection

> ZoneTopoConnection getZoneTopoesConnection(contentLanguage, getZoneTopoesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ZoneTopoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ZoneTopoApi apiInstance = new ZoneTopoApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetZoneTopoesConnectionRequestBody getZoneTopoesConnectionRequestBody = new GetZoneTopoesConnectionRequestBody(); // GetZoneTopoesConnectionRequestBody | 
        try {
            ZoneTopoConnection result = apiInstance.getZoneTopoesConnection(contentLanguage, getZoneTopoesConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ZoneTopoApi#getZoneTopoesConnection");
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
 **getZoneTopoesConnectionRequestBody** | [**GetZoneTopoesConnectionRequestBody**](GetZoneTopoesConnectionRequestBody.md)|  |

### Return type

[**ZoneTopoConnection**](ZoneTopoConnection.md)

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

