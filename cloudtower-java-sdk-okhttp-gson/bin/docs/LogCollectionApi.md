# LogCollectionApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLogCollections**](LogCollectionApi.md#getLogCollections) | **POST** /get-log-collections | 
[**getLogCollectionsConnection**](LogCollectionApi.md#getLogCollectionsConnection) | **POST** /get-log-collections-connection | 


<a name="getLogCollections"></a>
# **getLogCollections**
> List&lt;LogCollection&gt; getLogCollections(getLogCollectionsRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.LogCollectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    LogCollectionApi apiInstance = new LogCollectionApi(defaultClient);
    GetLogCollectionsRequestBody getLogCollectionsRequestBody = new GetLogCollectionsRequestBody(); // GetLogCollectionsRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<LogCollection> result = apiInstance.getLogCollections(getLogCollectionsRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogCollectionApi#getLogCollections");
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
 **getLogCollectionsRequestBody** | [**GetLogCollectionsRequestBody**](GetLogCollectionsRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;LogCollection&gt;**](LogCollection.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** |  |  -  |

<a name="getLogCollectionsConnection"></a>
# **getLogCollectionsConnection**
> LogCollectionConnection getLogCollectionsConnection(getLogCollectionsConnectionRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.LogCollectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    LogCollectionApi apiInstance = new LogCollectionApi(defaultClient);
    GetLogCollectionsConnectionRequestBody getLogCollectionsConnectionRequestBody = new GetLogCollectionsConnectionRequestBody(); // GetLogCollectionsConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      LogCollectionConnection result = apiInstance.getLogCollectionsConnection(getLogCollectionsConnectionRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogCollectionApi#getLogCollectionsConnection");
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
 **getLogCollectionsConnectionRequestBody** | [**GetLogCollectionsConnectionRequestBody**](GetLogCollectionsConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**LogCollectionConnection**](LogCollectionConnection.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** |  |  -  |

