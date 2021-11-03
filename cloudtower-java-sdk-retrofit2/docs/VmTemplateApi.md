# VmTemplateApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneVmTemplateFromVm**](VmTemplateApi.md#cloneVmTemplateFromVm) | **POST** clone-vm-template-from-vm | 
[**convertVmTemplateFromVm**](VmTemplateApi.md#convertVmTemplateFromVm) | **POST** convert-vm-template-from-vm | 
[**deleteVmTemplateFromVm**](VmTemplateApi.md#deleteVmTemplateFromVm) | **POST** delete-vm-template | 
[**getVmTemplates**](VmTemplateApi.md#getVmTemplates) | **POST** get-vm-templates | 
[**getVmTemplatesConnection**](VmTemplateApi.md#getVmTemplatesConnection) | **POST** get-vm-templates-connection | 
[**updateVmTemplateFromVm**](VmTemplateApi.md#updateVmTemplateFromVm) | **POST** update-vm-template | 



## cloneVmTemplateFromVm

> List&lt;WithTaskVmTemplate&gt; cloneVmTemplateFromVm(vmTemplateCreationParams, contentLanguage)



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
        List<VmTemplateCreationParams> vmTemplateCreationParams = Arrays.asList(); // List<VmTemplateCreationParams> | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskVmTemplate> result = apiInstance.cloneVmTemplateFromVm(vmTemplateCreationParams, contentLanguage);
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
 **vmTemplateCreationParams** | [**List&lt;VmTemplateCreationParams&gt;**](VmTemplateCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## convertVmTemplateFromVm

> List&lt;WithTaskVmTemplate&gt; convertVmTemplateFromVm(vmTemplateCreationParams, contentLanguage)



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
        List<VmTemplateCreationParams> vmTemplateCreationParams = Arrays.asList(); // List<VmTemplateCreationParams> | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskVmTemplate> result = apiInstance.convertVmTemplateFromVm(vmTemplateCreationParams, contentLanguage);
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
 **vmTemplateCreationParams** | [**List&lt;VmTemplateCreationParams&gt;**](VmTemplateCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## deleteVmTemplateFromVm

> List&lt;WithTaskDeleteVmTemplate&gt; deleteVmTemplateFromVm(vmTemplateDeletionParams, contentLanguage)



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
        VmTemplateDeletionParams vmTemplateDeletionParams = new VmTemplateDeletionParams(); // VmTemplateDeletionParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskDeleteVmTemplate> result = apiInstance.deleteVmTemplateFromVm(vmTemplateDeletionParams, contentLanguage);
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
 **vmTemplateDeletionParams** | [**VmTemplateDeletionParams**](VmTemplateDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## getVmTemplates

> List&lt;VmTemplate&gt; getVmTemplates(getVmTemplatesRequestBody, contentLanguage)



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
        GetVmTemplatesRequestBody getVmTemplatesRequestBody = new GetVmTemplatesRequestBody(); // GetVmTemplatesRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<VmTemplate> result = apiInstance.getVmTemplates(getVmTemplatesRequestBody, contentLanguage);
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
 **getVmTemplatesRequestBody** | [**GetVmTemplatesRequestBody**](GetVmTemplatesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## getVmTemplatesConnection

> VmTemplateConnection getVmTemplatesConnection(getVmTemplatesConnectionRequestBody, contentLanguage)



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
        GetVmTemplatesConnectionRequestBody getVmTemplatesConnectionRequestBody = new GetVmTemplatesConnectionRequestBody(); // GetVmTemplatesConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            VmTemplateConnection result = apiInstance.getVmTemplatesConnection(getVmTemplatesConnectionRequestBody, contentLanguage);
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
 **getVmTemplatesConnectionRequestBody** | [**GetVmTemplatesConnectionRequestBody**](GetVmTemplatesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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


## updateVmTemplateFromVm

> List&lt;WithTaskVmTemplate&gt; updateVmTemplateFromVm(vmTemplateUpdationParams, contentLanguage)



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
        VmTemplateUpdationParams vmTemplateUpdationParams = new VmTemplateUpdationParams(); // VmTemplateUpdationParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskVmTemplate> result = apiInstance.updateVmTemplateFromVm(vmTemplateUpdationParams, contentLanguage);
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
 **vmTemplateUpdationParams** | [**VmTemplateUpdationParams**](VmTemplateUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

