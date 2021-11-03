# ZoneTopoApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getZoneTopoes**](ZoneTopoApi.md#getZoneTopoes) | **POST** get-zone-topoes | 
[**getZoneTopoesConnection**](ZoneTopoApi.md#getZoneTopoesConnection) | **POST** get-zone-topoes-connection | 



## getZoneTopoes

> List&lt;ZoneTopo&gt; getZoneTopoes(getZoneTopoesRequestBody, contentLanguage)



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
        GetZoneTopoesRequestBody getZoneTopoesRequestBody = new GetZoneTopoesRequestBody(); // GetZoneTopoesRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<ZoneTopo> result = apiInstance.getZoneTopoes(getZoneTopoesRequestBody, contentLanguage);
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
 **getZoneTopoesRequestBody** | [**GetZoneTopoesRequestBody**](GetZoneTopoesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

> ZoneTopoConnection getZoneTopoesConnection(getZoneTopoesConnectionRequestBody, contentLanguage)



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
        GetZoneTopoesConnectionRequestBody getZoneTopoesConnectionRequestBody = new GetZoneTopoesConnectionRequestBody(); // GetZoneTopoesConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            ZoneTopoConnection result = apiInstance.getZoneTopoesConnection(getZoneTopoesConnectionRequestBody, contentLanguage);
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
 **getZoneTopoesConnectionRequestBody** | [**GetZoneTopoesConnectionRequestBody**](GetZoneTopoesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

