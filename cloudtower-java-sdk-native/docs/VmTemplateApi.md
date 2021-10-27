# VmTemplateApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneVmTemplateFromVm**](VmTemplateApi.md#cloneVmTemplateFromVm) | **POST** /clone-vm-template-from-vm | 
[**cloneVmTemplateFromVmWithHttpInfo**](VmTemplateApi.md#cloneVmTemplateFromVmWithHttpInfo) | **POST** /clone-vm-template-from-vm | 
[**convertVmTemplateFromVm**](VmTemplateApi.md#convertVmTemplateFromVm) | **POST** /convert-vm-template-from-vm | 
[**convertVmTemplateFromVmWithHttpInfo**](VmTemplateApi.md#convertVmTemplateFromVmWithHttpInfo) | **POST** /convert-vm-template-from-vm | 
[**deleteVmTemplateFromVm**](VmTemplateApi.md#deleteVmTemplateFromVm) | **POST** /delete-vm-template | 
[**deleteVmTemplateFromVmWithHttpInfo**](VmTemplateApi.md#deleteVmTemplateFromVmWithHttpInfo) | **POST** /delete-vm-template | 
[**getVmTemplates**](VmTemplateApi.md#getVmTemplates) | **POST** /get-vm-templates | 
[**getVmTemplatesWithHttpInfo**](VmTemplateApi.md#getVmTemplatesWithHttpInfo) | **POST** /get-vm-templates | 
[**getVmTemplatesConnection**](VmTemplateApi.md#getVmTemplatesConnection) | **POST** /get-vm-templates-connection | 
[**getVmTemplatesConnectionWithHttpInfo**](VmTemplateApi.md#getVmTemplatesConnectionWithHttpInfo) | **POST** /get-vm-templates-connection | 
[**updateVmTemplateFromVm**](VmTemplateApi.md#updateVmTemplateFromVm) | **POST** /update-vm-template | 
[**updateVmTemplateFromVmWithHttpInfo**](VmTemplateApi.md#updateVmTemplateFromVmWithHttpInfo) | **POST** /update-vm-template | 



## cloneVmTemplateFromVm

> List<WithTaskVmTemplate> cloneVmTemplateFromVm(contentLanguage, vmTemplateCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmTemplateApi apiInstance = new VmTemplateApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<VmTemplateCreationParams> vmTemplateCreationParams = Arrays.asList(); // List<VmTemplateCreationParams> | 
        try {
            List<WithTaskVmTemplate> result = apiInstance.cloneVmTemplateFromVm(contentLanguage, vmTemplateCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmTemplateApi#cloneVmTemplateFromVm");
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
 **vmTemplateCreationParams** | [**List&lt;VmTemplateCreationParams&gt;**](VmTemplateCreationParams.md)|  |

### Return type

[**List&lt;WithTaskVmTemplate&gt;**](WithTaskVmTemplate.md)


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

## cloneVmTemplateFromVmWithHttpInfo

> ApiResponse<List<WithTaskVmTemplate>> cloneVmTemplateFromVm cloneVmTemplateFromVmWithHttpInfo(contentLanguage, vmTemplateCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmTemplateApi apiInstance = new VmTemplateApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<VmTemplateCreationParams> vmTemplateCreationParams = Arrays.asList(); // List<VmTemplateCreationParams> | 
        try {
            ApiResponse<List<WithTaskVmTemplate>> response = apiInstance.cloneVmTemplateFromVmWithHttpInfo(contentLanguage, vmTemplateCreationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmTemplateApi#cloneVmTemplateFromVm");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **vmTemplateCreationParams** | [**List&lt;VmTemplateCreationParams&gt;**](VmTemplateCreationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskVmTemplate&gt;**](WithTaskVmTemplate.md)>


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


## convertVmTemplateFromVm

> List<WithTaskVmTemplate> convertVmTemplateFromVm(contentLanguage, vmTemplateCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmTemplateApi apiInstance = new VmTemplateApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<VmTemplateCreationParams> vmTemplateCreationParams = Arrays.asList(); // List<VmTemplateCreationParams> | 
        try {
            List<WithTaskVmTemplate> result = apiInstance.convertVmTemplateFromVm(contentLanguage, vmTemplateCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmTemplateApi#convertVmTemplateFromVm");
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
 **vmTemplateCreationParams** | [**List&lt;VmTemplateCreationParams&gt;**](VmTemplateCreationParams.md)|  |

### Return type

[**List&lt;WithTaskVmTemplate&gt;**](WithTaskVmTemplate.md)


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

## convertVmTemplateFromVmWithHttpInfo

> ApiResponse<List<WithTaskVmTemplate>> convertVmTemplateFromVm convertVmTemplateFromVmWithHttpInfo(contentLanguage, vmTemplateCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmTemplateApi apiInstance = new VmTemplateApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<VmTemplateCreationParams> vmTemplateCreationParams = Arrays.asList(); // List<VmTemplateCreationParams> | 
        try {
            ApiResponse<List<WithTaskVmTemplate>> response = apiInstance.convertVmTemplateFromVmWithHttpInfo(contentLanguage, vmTemplateCreationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmTemplateApi#convertVmTemplateFromVm");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **vmTemplateCreationParams** | [**List&lt;VmTemplateCreationParams&gt;**](VmTemplateCreationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskVmTemplate&gt;**](WithTaskVmTemplate.md)>


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


## deleteVmTemplateFromVm

> List<WithTaskDeleteVmTemplate> deleteVmTemplateFromVm(contentLanguage, vmTemplateDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmTemplateApi apiInstance = new VmTemplateApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        VmTemplateDeletionParams vmTemplateDeletionParams = new VmTemplateDeletionParams(); // VmTemplateDeletionParams | 
        try {
            List<WithTaskDeleteVmTemplate> result = apiInstance.deleteVmTemplateFromVm(contentLanguage, vmTemplateDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmTemplateApi#deleteVmTemplateFromVm");
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
 **vmTemplateDeletionParams** | [**VmTemplateDeletionParams**](VmTemplateDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteVmTemplate&gt;**](WithTaskDeleteVmTemplate.md)


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

## deleteVmTemplateFromVmWithHttpInfo

> ApiResponse<List<WithTaskDeleteVmTemplate>> deleteVmTemplateFromVm deleteVmTemplateFromVmWithHttpInfo(contentLanguage, vmTemplateDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmTemplateApi apiInstance = new VmTemplateApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        VmTemplateDeletionParams vmTemplateDeletionParams = new VmTemplateDeletionParams(); // VmTemplateDeletionParams | 
        try {
            ApiResponse<List<WithTaskDeleteVmTemplate>> response = apiInstance.deleteVmTemplateFromVmWithHttpInfo(contentLanguage, vmTemplateDeletionParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmTemplateApi#deleteVmTemplateFromVm");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **vmTemplateDeletionParams** | [**VmTemplateDeletionParams**](VmTemplateDeletionParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDeleteVmTemplate&gt;**](WithTaskDeleteVmTemplate.md)>


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


## getVmTemplates

> List<VmTemplate> getVmTemplates(contentLanguage, getVmTemplatesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmTemplateApi apiInstance = new VmTemplateApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmTemplatesRequestBody getVmTemplatesRequestBody = new GetVmTemplatesRequestBody(); // GetVmTemplatesRequestBody | 
        try {
            List<VmTemplate> result = apiInstance.getVmTemplates(contentLanguage, getVmTemplatesRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmTemplateApi#getVmTemplates");
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
 **getVmTemplatesRequestBody** | [**GetVmTemplatesRequestBody**](GetVmTemplatesRequestBody.md)|  |

### Return type

[**List&lt;VmTemplate&gt;**](VmTemplate.md)


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

## getVmTemplatesWithHttpInfo

> ApiResponse<List<VmTemplate>> getVmTemplates getVmTemplatesWithHttpInfo(contentLanguage, getVmTemplatesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmTemplateApi apiInstance = new VmTemplateApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmTemplatesRequestBody getVmTemplatesRequestBody = new GetVmTemplatesRequestBody(); // GetVmTemplatesRequestBody | 
        try {
            ApiResponse<List<VmTemplate>> response = apiInstance.getVmTemplatesWithHttpInfo(contentLanguage, getVmTemplatesRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmTemplateApi#getVmTemplates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getVmTemplatesRequestBody** | [**GetVmTemplatesRequestBody**](GetVmTemplatesRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;VmTemplate&gt;**](VmTemplate.md)>


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


## getVmTemplatesConnection

> VmTemplateConnection getVmTemplatesConnection(contentLanguage, getVmTemplatesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmTemplateApi apiInstance = new VmTemplateApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmTemplatesConnectionRequestBody getVmTemplatesConnectionRequestBody = new GetVmTemplatesConnectionRequestBody(); // GetVmTemplatesConnectionRequestBody | 
        try {
            VmTemplateConnection result = apiInstance.getVmTemplatesConnection(contentLanguage, getVmTemplatesConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmTemplateApi#getVmTemplatesConnection");
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
 **getVmTemplatesConnectionRequestBody** | [**GetVmTemplatesConnectionRequestBody**](GetVmTemplatesConnectionRequestBody.md)|  |

### Return type

[**VmTemplateConnection**](VmTemplateConnection.md)


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

## getVmTemplatesConnectionWithHttpInfo

> ApiResponse<VmTemplateConnection> getVmTemplatesConnection getVmTemplatesConnectionWithHttpInfo(contentLanguage, getVmTemplatesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmTemplateApi apiInstance = new VmTemplateApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmTemplatesConnectionRequestBody getVmTemplatesConnectionRequestBody = new GetVmTemplatesConnectionRequestBody(); // GetVmTemplatesConnectionRequestBody | 
        try {
            ApiResponse<VmTemplateConnection> response = apiInstance.getVmTemplatesConnectionWithHttpInfo(contentLanguage, getVmTemplatesConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmTemplateApi#getVmTemplatesConnection");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getVmTemplatesConnectionRequestBody** | [**GetVmTemplatesConnectionRequestBody**](GetVmTemplatesConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**VmTemplateConnection**](VmTemplateConnection.md)>


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


## updateVmTemplateFromVm

> List<WithTaskVmTemplate> updateVmTemplateFromVm(contentLanguage, vmTemplateUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmTemplateApi apiInstance = new VmTemplateApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        VmTemplateUpdationParams vmTemplateUpdationParams = new VmTemplateUpdationParams(); // VmTemplateUpdationParams | 
        try {
            List<WithTaskVmTemplate> result = apiInstance.updateVmTemplateFromVm(contentLanguage, vmTemplateUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmTemplateApi#updateVmTemplateFromVm");
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
 **vmTemplateUpdationParams** | [**VmTemplateUpdationParams**](VmTemplateUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskVmTemplate&gt;**](WithTaskVmTemplate.md)


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

## updateVmTemplateFromVmWithHttpInfo

> ApiResponse<List<WithTaskVmTemplate>> updateVmTemplateFromVm updateVmTemplateFromVmWithHttpInfo(contentLanguage, vmTemplateUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmTemplateApi apiInstance = new VmTemplateApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        VmTemplateUpdationParams vmTemplateUpdationParams = new VmTemplateUpdationParams(); // VmTemplateUpdationParams | 
        try {
            ApiResponse<List<WithTaskVmTemplate>> response = apiInstance.updateVmTemplateFromVmWithHttpInfo(contentLanguage, vmTemplateUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VmTemplateApi#updateVmTemplateFromVm");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **vmTemplateUpdationParams** | [**VmTemplateUpdationParams**](VmTemplateUpdationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskVmTemplate&gt;**](WithTaskVmTemplate.md)>


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

