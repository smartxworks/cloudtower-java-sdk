# ElfImageApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createElfImage**](ElfImageApi.md#createElfImage) | **POST** /upload-elf-image | 
[**deleteElfImage**](ElfImageApi.md#deleteElfImage) | **POST** /delete-elf-image | 
[**getElfImages**](ElfImageApi.md#getElfImages) | **POST** /get-elf-images | 
[**getElfImagesConnection**](ElfImageApi.md#getElfImagesConnection) | **POST** /get-elf-images-connection | 
[**updateElfImage**](ElfImageApi.md#updateElfImage) | **POST** /update-elf-image | 


<a name="createElfImage"></a>
# **createElfImage**
> List&lt;UploadTask&gt; createElfImage(file, clusterId, name, size, description, uploadTaskId, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ElfImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ElfImageApi apiInstance = new ElfImageApi(defaultClient);
    File file = new File("/path/to/file"); // File | 
    String clusterId = "clusterId_example"; // String | 
    String name = "name_example"; // String | 
    String size = "size_example"; // String | 
    String description = "description_example"; // String | 
    String uploadTaskId = "uploadTaskId_example"; // String | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<UploadTask> result = apiInstance.createElfImage(file, clusterId, name, size, description, uploadTaskId, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElfImageApi#createElfImage");
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
 **file** | **File**|  |
 **clusterId** | **String**|  |
 **name** | **String**|  |
 **size** | **String**|  |
 **description** | **String**|  |
 **uploadTaskId** | **String**|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;UploadTask&gt;**](UploadTask.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** |  |  -  |

<a name="deleteElfImage"></a>
# **deleteElfImage**
> List&lt;WithTaskDeleteElfImage&gt; deleteElfImage(elfImageDeletionParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ElfImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ElfImageApi apiInstance = new ElfImageApi(defaultClient);
    ElfImageDeletionParams elfImageDeletionParams = new ElfImageDeletionParams(); // ElfImageDeletionParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskDeleteElfImage> result = apiInstance.deleteElfImage(elfImageDeletionParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElfImageApi#deleteElfImage");
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
 **elfImageDeletionParams** | [**ElfImageDeletionParams**](ElfImageDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskDeleteElfImage&gt;**](WithTaskDeleteElfImage.md)

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

<a name="getElfImages"></a>
# **getElfImages**
> List&lt;ElfImage&gt; getElfImages(getElfImagesRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ElfImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ElfImageApi apiInstance = new ElfImageApi(defaultClient);
    GetElfImagesRequestBody getElfImagesRequestBody = new GetElfImagesRequestBody(); // GetElfImagesRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<ElfImage> result = apiInstance.getElfImages(getElfImagesRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElfImageApi#getElfImages");
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
 **getElfImagesRequestBody** | [**GetElfImagesRequestBody**](GetElfImagesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;ElfImage&gt;**](ElfImage.md)

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

<a name="getElfImagesConnection"></a>
# **getElfImagesConnection**
> ElfImageConnection getElfImagesConnection(getElfImagesConnectionRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ElfImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ElfImageApi apiInstance = new ElfImageApi(defaultClient);
    GetElfImagesConnectionRequestBody getElfImagesConnectionRequestBody = new GetElfImagesConnectionRequestBody(); // GetElfImagesConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      ElfImageConnection result = apiInstance.getElfImagesConnection(getElfImagesConnectionRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElfImageApi#getElfImagesConnection");
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
 **getElfImagesConnectionRequestBody** | [**GetElfImagesConnectionRequestBody**](GetElfImagesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**ElfImageConnection**](ElfImageConnection.md)

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

<a name="updateElfImage"></a>
# **updateElfImage**
> List&lt;WithTaskElfImage&gt; updateElfImage(elfImageUpdationParams, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ElfImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ElfImageApi apiInstance = new ElfImageApi(defaultClient);
    ElfImageUpdationParams elfImageUpdationParams = new ElfImageUpdationParams(); // ElfImageUpdationParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskElfImage> result = apiInstance.updateElfImage(elfImageUpdationParams, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElfImageApi#updateElfImage");
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
 **elfImageUpdationParams** | [**ElfImageUpdationParams**](ElfImageUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskElfImage&gt;**](WithTaskElfImage.md)

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

