# SnmpTransportApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSnmpTransport**](SnmpTransportApi.md#createSnmpTransport) | **POST** /create-snmp-transport | 
[**deleteSnmpTransport**](SnmpTransportApi.md#deleteSnmpTransport) | **POST** /delete-snmp-transport | 
[**getSnmpTransports**](SnmpTransportApi.md#getSnmpTransports) | **POST** /get-snmp-transports | 
[**getSnmpTransportsConnection**](SnmpTransportApi.md#getSnmpTransportsConnection) | **POST** /get-snmp-transports-connection | 
[**updateSnmpTransport**](SnmpTransportApi.md#updateSnmpTransport) | **POST** /update-snmp-transport | 


<a name="createSnmpTransport"></a>
# **createSnmpTransport**
> List&lt;WithTaskSnmpTransport&gt; createSnmpTransport(snmpTransportCreationParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SnmpTransportApi apiInstance = new SnmpTransportApi(defaultClient);
    List<SnmpTransportCreationParams> snmpTransportCreationParams = Arrays.asList(); // List<SnmpTransportCreationParams> | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskSnmpTransport> result = apiInstance.createSnmpTransport(snmpTransportCreationParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnmpTransportApi#createSnmpTransport");
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
 **snmpTransportCreationParams** | [**List&lt;SnmpTransportCreationParams&gt;**](SnmpTransportCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskSnmpTransport&gt;**](WithTaskSnmpTransport.md)

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

<a name="deleteSnmpTransport"></a>
# **deleteSnmpTransport**
> List&lt;WithTaskDeleteSnmpTransport&gt; deleteSnmpTransport(snmpTransportDeletionParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SnmpTransportApi apiInstance = new SnmpTransportApi(defaultClient);
    SnmpTransportDeletionParams snmpTransportDeletionParams = new SnmpTransportDeletionParams(); // SnmpTransportDeletionParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskDeleteSnmpTransport> result = apiInstance.deleteSnmpTransport(snmpTransportDeletionParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnmpTransportApi#deleteSnmpTransport");
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
 **snmpTransportDeletionParams** | [**SnmpTransportDeletionParams**](SnmpTransportDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskDeleteSnmpTransport&gt;**](WithTaskDeleteSnmpTransport.md)

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

<a name="getSnmpTransports"></a>
# **getSnmpTransports**
> List&lt;SnmpTransport&gt; getSnmpTransports(getSnmpTransportsRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SnmpTransportApi apiInstance = new SnmpTransportApi(defaultClient);
    GetSnmpTransportsRequestBody getSnmpTransportsRequestBody = new GetSnmpTransportsRequestBody(); // GetSnmpTransportsRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<SnmpTransport> result = apiInstance.getSnmpTransports(getSnmpTransportsRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnmpTransportApi#getSnmpTransports");
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
 **getSnmpTransportsRequestBody** | [**GetSnmpTransportsRequestBody**](GetSnmpTransportsRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;SnmpTransport&gt;**](SnmpTransport.md)

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

<a name="getSnmpTransportsConnection"></a>
# **getSnmpTransportsConnection**
> SnmpTransportConnection getSnmpTransportsConnection(getSnmpTransportsConnectionRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SnmpTransportApi apiInstance = new SnmpTransportApi(defaultClient);
    GetSnmpTransportsConnectionRequestBody getSnmpTransportsConnectionRequestBody = new GetSnmpTransportsConnectionRequestBody(); // GetSnmpTransportsConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      SnmpTransportConnection result = apiInstance.getSnmpTransportsConnection(getSnmpTransportsConnectionRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnmpTransportApi#getSnmpTransportsConnection");
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
 **getSnmpTransportsConnectionRequestBody** | [**GetSnmpTransportsConnectionRequestBody**](GetSnmpTransportsConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**SnmpTransportConnection**](SnmpTransportConnection.md)

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

<a name="updateSnmpTransport"></a>
# **updateSnmpTransport**
> List&lt;WithTaskSnmpTransport&gt; updateSnmpTransport(snmpTransportUpdationParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.SnmpTransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    SnmpTransportApi apiInstance = new SnmpTransportApi(defaultClient);
    SnmpTransportUpdationParams snmpTransportUpdationParams = new SnmpTransportUpdationParams(); // SnmpTransportUpdationParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskSnmpTransport> result = apiInstance.updateSnmpTransport(snmpTransportUpdationParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnmpTransportApi#updateSnmpTransport");
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
 **snmpTransportUpdationParams** | [**SnmpTransportUpdationParams**](SnmpTransportUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskSnmpTransport&gt;**](WithTaskSnmpTransport.md)

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

