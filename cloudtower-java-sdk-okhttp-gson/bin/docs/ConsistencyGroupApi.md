# ConsistencyGroupApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConsistencyGroup**](ConsistencyGroupApi.md#createConsistencyGroup) | **POST** /create-consistency-group | 
[**deleteConsistencyGroup**](ConsistencyGroupApi.md#deleteConsistencyGroup) | **POST** /delete-consistency-group | 
[**getConsistencyGroups**](ConsistencyGroupApi.md#getConsistencyGroups) | **POST** /get-consistency-groups | 
[**getConsistencyGroupsConnection**](ConsistencyGroupApi.md#getConsistencyGroupsConnection) | **POST** /get-consistency-groups-connection | 
[**updateConsistencyGroup**](ConsistencyGroupApi.md#updateConsistencyGroup) | **POST** /update-consistency-group | 


<a name="createConsistencyGroup"></a>
# **createConsistencyGroup**
> List&lt;WithTaskConsistencyGroup&gt; createConsistencyGroup(consistencyGroupCreationParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ConsistencyGroupApi apiInstance = new ConsistencyGroupApi(defaultClient);
    List<ConsistencyGroupCreationParams> consistencyGroupCreationParams = Arrays.asList(); // List<ConsistencyGroupCreationParams> | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskConsistencyGroup> result = apiInstance.createConsistencyGroup(consistencyGroupCreationParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsistencyGroupApi#createConsistencyGroup");
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
 **consistencyGroupCreationParams** | [**List&lt;ConsistencyGroupCreationParams&gt;**](ConsistencyGroupCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskConsistencyGroup&gt;**](WithTaskConsistencyGroup.md)

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

<a name="deleteConsistencyGroup"></a>
# **deleteConsistencyGroup**
> List&lt;WithTaskDeleteConsistencyGroup&gt; deleteConsistencyGroup(consistencyGroupDeletionParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ConsistencyGroupApi apiInstance = new ConsistencyGroupApi(defaultClient);
    ConsistencyGroupDeletionParams consistencyGroupDeletionParams = new ConsistencyGroupDeletionParams(); // ConsistencyGroupDeletionParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskDeleteConsistencyGroup> result = apiInstance.deleteConsistencyGroup(consistencyGroupDeletionParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsistencyGroupApi#deleteConsistencyGroup");
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
 **consistencyGroupDeletionParams** | [**ConsistencyGroupDeletionParams**](ConsistencyGroupDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskDeleteConsistencyGroup&gt;**](WithTaskDeleteConsistencyGroup.md)

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

<a name="getConsistencyGroups"></a>
# **getConsistencyGroups**
> List&lt;ConsistencyGroup&gt; getConsistencyGroups(getConsistencyGroupsRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ConsistencyGroupApi apiInstance = new ConsistencyGroupApi(defaultClient);
    GetConsistencyGroupsRequestBody getConsistencyGroupsRequestBody = new GetConsistencyGroupsRequestBody(); // GetConsistencyGroupsRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<ConsistencyGroup> result = apiInstance.getConsistencyGroups(getConsistencyGroupsRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsistencyGroupApi#getConsistencyGroups");
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
 **getConsistencyGroupsRequestBody** | [**GetConsistencyGroupsRequestBody**](GetConsistencyGroupsRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;ConsistencyGroup&gt;**](ConsistencyGroup.md)

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

<a name="getConsistencyGroupsConnection"></a>
# **getConsistencyGroupsConnection**
> ConsistencyGroupConnection getConsistencyGroupsConnection(getConsistencyGroupsConnectionRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ConsistencyGroupApi apiInstance = new ConsistencyGroupApi(defaultClient);
    GetConsistencyGroupsConnectionRequestBody getConsistencyGroupsConnectionRequestBody = new GetConsistencyGroupsConnectionRequestBody(); // GetConsistencyGroupsConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      ConsistencyGroupConnection result = apiInstance.getConsistencyGroupsConnection(getConsistencyGroupsConnectionRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsistencyGroupApi#getConsistencyGroupsConnection");
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
 **getConsistencyGroupsConnectionRequestBody** | [**GetConsistencyGroupsConnectionRequestBody**](GetConsistencyGroupsConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**ConsistencyGroupConnection**](ConsistencyGroupConnection.md)

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

<a name="updateConsistencyGroup"></a>
# **updateConsistencyGroup**
> List&lt;WithTaskConsistencyGroup&gt; updateConsistencyGroup(consistencyGroupUpdationParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ConsistencyGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ConsistencyGroupApi apiInstance = new ConsistencyGroupApi(defaultClient);
    ConsistencyGroupUpdationParams consistencyGroupUpdationParams = new ConsistencyGroupUpdationParams(); // ConsistencyGroupUpdationParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskConsistencyGroup> result = apiInstance.updateConsistencyGroup(consistencyGroupUpdationParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsistencyGroupApi#updateConsistencyGroup");
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
 **consistencyGroupUpdationParams** | [**ConsistencyGroupUpdationParams**](ConsistencyGroupUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskConsistencyGroup&gt;**](WithTaskConsistencyGroup.md)

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

