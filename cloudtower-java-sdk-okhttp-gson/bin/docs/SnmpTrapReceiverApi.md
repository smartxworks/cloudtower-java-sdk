# SnmpTrapReceiverApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSnmpTrapReceiver**](SnmpTrapReceiverApi.md#createSnmpTrapReceiver) | **POST** /create-snmp-trap-receiver | 
[**deleteSnmpTrapReceiver**](SnmpTrapReceiverApi.md#deleteSnmpTrapReceiver) | **POST** /delete-snmp-trap-receiver | 
[**getSnmpTrapReceivers**](SnmpTrapReceiverApi.md#getSnmpTrapReceivers) | **POST** /get-snmp-trap-receivers | 
[**getSnmpTrapReceiversConnection**](SnmpTrapReceiverApi.md#getSnmpTrapReceiversConnection) | **POST** /get-snmp-trap-receivers-connection | 
[**updateSnmpTrapReceiver**](SnmpTrapReceiverApi.md#updateSnmpTrapReceiver) | **POST** /update-snmp-trap-receiver | 


<a name="createSnmpTrapReceiver"></a>
# **createSnmpTrapReceiver**
> List&lt;WithTaskSnmpTrapReceiver&gt; createSnmpTrapReceiver(snmpTrapReceiverCreationParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTrapReceiverApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SnmpTrapReceiverApi apiInstance = new SnmpTrapReceiverApi(defaultClient);
    List<SnmpTrapReceiverCreationParams> snmpTrapReceiverCreationParams = Arrays.asList(); // List<SnmpTrapReceiverCreationParams> | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskSnmpTrapReceiver> result = apiInstance.createSnmpTrapReceiver(snmpTrapReceiverCreationParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnmpTrapReceiverApi#createSnmpTrapReceiver");
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
 **snmpTrapReceiverCreationParams** | [**List&lt;SnmpTrapReceiverCreationParams&gt;**](SnmpTrapReceiverCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskSnmpTrapReceiver&gt;**](WithTaskSnmpTrapReceiver.md)

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

<a name="deleteSnmpTrapReceiver"></a>
# **deleteSnmpTrapReceiver**
> List&lt;WithTaskDeleteSnmpTrapReceiver&gt; deleteSnmpTrapReceiver(snmpTrapReceiverDeletionParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTrapReceiverApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SnmpTrapReceiverApi apiInstance = new SnmpTrapReceiverApi(defaultClient);
    SnmpTrapReceiverDeletionParams snmpTrapReceiverDeletionParams = new SnmpTrapReceiverDeletionParams(); // SnmpTrapReceiverDeletionParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskDeleteSnmpTrapReceiver> result = apiInstance.deleteSnmpTrapReceiver(snmpTrapReceiverDeletionParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnmpTrapReceiverApi#deleteSnmpTrapReceiver");
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
 **snmpTrapReceiverDeletionParams** | [**SnmpTrapReceiverDeletionParams**](SnmpTrapReceiverDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskDeleteSnmpTrapReceiver&gt;**](WithTaskDeleteSnmpTrapReceiver.md)

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

<a name="getSnmpTrapReceivers"></a>
# **getSnmpTrapReceivers**
> List&lt;SnmpTrapReceiver&gt; getSnmpTrapReceivers(getSnmpTrapReceiversRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTrapReceiverApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SnmpTrapReceiverApi apiInstance = new SnmpTrapReceiverApi(defaultClient);
    GetSnmpTrapReceiversRequestBody getSnmpTrapReceiversRequestBody = new GetSnmpTrapReceiversRequestBody(); // GetSnmpTrapReceiversRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<SnmpTrapReceiver> result = apiInstance.getSnmpTrapReceivers(getSnmpTrapReceiversRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnmpTrapReceiverApi#getSnmpTrapReceivers");
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
 **getSnmpTrapReceiversRequestBody** | [**GetSnmpTrapReceiversRequestBody**](GetSnmpTrapReceiversRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;SnmpTrapReceiver&gt;**](SnmpTrapReceiver.md)

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

<a name="getSnmpTrapReceiversConnection"></a>
# **getSnmpTrapReceiversConnection**
> SnmpTrapReceiverConnection getSnmpTrapReceiversConnection(getSnmpTrapReceiversConnectionRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTrapReceiverApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SnmpTrapReceiverApi apiInstance = new SnmpTrapReceiverApi(defaultClient);
    GetSnmpTrapReceiversConnectionRequestBody getSnmpTrapReceiversConnectionRequestBody = new GetSnmpTrapReceiversConnectionRequestBody(); // GetSnmpTrapReceiversConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      SnmpTrapReceiverConnection result = apiInstance.getSnmpTrapReceiversConnection(getSnmpTrapReceiversConnectionRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnmpTrapReceiverApi#getSnmpTrapReceiversConnection");
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
 **getSnmpTrapReceiversConnectionRequestBody** | [**GetSnmpTrapReceiversConnectionRequestBody**](GetSnmpTrapReceiversConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**SnmpTrapReceiverConnection**](SnmpTrapReceiverConnection.md)

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

<a name="updateSnmpTrapReceiver"></a>
# **updateSnmpTrapReceiver**
> List&lt;WithTaskSnmpTrapReceiver&gt; updateSnmpTrapReceiver(snmpTrapReceiverUpdationParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTrapReceiverApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SnmpTrapReceiverApi apiInstance = new SnmpTrapReceiverApi(defaultClient);
    SnmpTrapReceiverUpdationParams snmpTrapReceiverUpdationParams = new SnmpTrapReceiverUpdationParams(); // SnmpTrapReceiverUpdationParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskSnmpTrapReceiver> result = apiInstance.updateSnmpTrapReceiver(snmpTrapReceiverUpdationParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnmpTrapReceiverApi#updateSnmpTrapReceiver");
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
 **snmpTrapReceiverUpdationParams** | [**SnmpTrapReceiverUpdationParams**](SnmpTrapReceiverUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskSnmpTrapReceiver&gt;**](WithTaskSnmpTrapReceiver.md)

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

