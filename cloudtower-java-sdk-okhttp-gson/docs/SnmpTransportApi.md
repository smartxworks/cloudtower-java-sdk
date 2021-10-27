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
> List&lt;WithTaskSnmpTransport&gt; createSnmpTransport(contentLanguage, snmpTransportCreationParams)



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
    String contentLanguage = "zh-CN"; // String | 
    List<SnmpTransportCreationParams> snmpTransportCreationParams = Arrays.asList(); // List<SnmpTransportCreationParams> | 
    try {
      List<WithTaskSnmpTransport> result = apiInstance.createSnmpTransport(contentLanguage, snmpTransportCreationParams);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **snmpTransportCreationParams** | [**List&lt;SnmpTransportCreationParams&gt;**](SnmpTransportCreationParams.md)|  |

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
> List&lt;WithTaskDeleteSnmpTransport&gt; deleteSnmpTransport(contentLanguage, snmpTransportDeletionParams)



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
    String contentLanguage = "zh-CN"; // String | 
    SnmpTransportDeletionParams snmpTransportDeletionParams = new SnmpTransportDeletionParams(); // SnmpTransportDeletionParams | 
    try {
      List<WithTaskDeleteSnmpTransport> result = apiInstance.deleteSnmpTransport(contentLanguage, snmpTransportDeletionParams);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **snmpTransportDeletionParams** | [**SnmpTransportDeletionParams**](SnmpTransportDeletionParams.md)|  |

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
> List&lt;SnmpTransport&gt; getSnmpTransports(contentLanguage, getSnmpTransportsRequestBody)



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
    String contentLanguage = "zh-CN"; // String | 
    GetSnmpTransportsRequestBody getSnmpTransportsRequestBody = new GetSnmpTransportsRequestBody(); // GetSnmpTransportsRequestBody | 
    try {
      List<SnmpTransport> result = apiInstance.getSnmpTransports(contentLanguage, getSnmpTransportsRequestBody);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getSnmpTransportsRequestBody** | [**GetSnmpTransportsRequestBody**](GetSnmpTransportsRequestBody.md)|  |

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
> SnmpTransportConnection getSnmpTransportsConnection(contentLanguage, getSnmpTransportsConnectionRequestBody)



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
    String contentLanguage = "zh-CN"; // String | 
    GetSnmpTransportsConnectionRequestBody getSnmpTransportsConnectionRequestBody = new GetSnmpTransportsConnectionRequestBody(); // GetSnmpTransportsConnectionRequestBody | 
    try {
      SnmpTransportConnection result = apiInstance.getSnmpTransportsConnection(contentLanguage, getSnmpTransportsConnectionRequestBody);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getSnmpTransportsConnectionRequestBody** | [**GetSnmpTransportsConnectionRequestBody**](GetSnmpTransportsConnectionRequestBody.md)|  |

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
> List&lt;WithTaskSnmpTransport&gt; updateSnmpTransport(contentLanguage, snmpTransportUpdationParams)



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
    String contentLanguage = "zh-CN"; // String | 
    SnmpTransportUpdationParams snmpTransportUpdationParams = new SnmpTransportUpdationParams(); // SnmpTransportUpdationParams | 
    try {
      List<WithTaskSnmpTransport> result = apiInstance.updateSnmpTransport(contentLanguage, snmpTransportUpdationParams);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **snmpTransportUpdationParams** | [**SnmpTransportUpdationParams**](SnmpTransportUpdationParams.md)|  |

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

