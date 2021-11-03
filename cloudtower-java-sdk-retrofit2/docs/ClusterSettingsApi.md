# ClusterSettingsApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClusterSettingses**](ClusterSettingsApi.md#getClusterSettingses) | **POST** get-cluster-settingses | 
[**getClusterSettingsesConnection**](ClusterSettingsApi.md#getClusterSettingsesConnection) | **POST** get-cluster-settingses-connection | 



## getClusterSettingses

> List&lt;ClusterSettings&gt; getClusterSettingses(getClusterSettingsesRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ClusterSettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ClusterSettingsApi apiInstance = new ClusterSettingsApi(defaultClient);
        GetClusterSettingsesRequestBody getClusterSettingsesRequestBody = new GetClusterSettingsesRequestBody(); // GetClusterSettingsesRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<ClusterSettings> result = apiInstance.getClusterSettingses(getClusterSettingsesRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClusterSettingsApi#getClusterSettingses");
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
 **getClusterSettingsesRequestBody** | [**GetClusterSettingsesRequestBody**](GetClusterSettingsesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;ClusterSettings&gt;**](ClusterSettings.md)

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


## getClusterSettingsesConnection

> ClusterSettingsConnection getClusterSettingsesConnection(getClusterSettingsesConnectionRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ClusterSettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ClusterSettingsApi apiInstance = new ClusterSettingsApi(defaultClient);
        GetClusterSettingsesConnectionRequestBody getClusterSettingsesConnectionRequestBody = new GetClusterSettingsesConnectionRequestBody(); // GetClusterSettingsesConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            ClusterSettingsConnection result = apiInstance.getClusterSettingsesConnection(getClusterSettingsesConnectionRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClusterSettingsApi#getClusterSettingsesConnection");
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
 **getClusterSettingsesConnectionRequestBody** | [**GetClusterSettingsesConnectionRequestBody**](GetClusterSettingsesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**ClusterSettingsConnection**](ClusterSettingsConnection.md)

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

