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
> List&lt;UploadTask&gt; createElfImage(contentLanguage, file, clusterId, name, size, description, uploadTaskId)



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
    String contentLanguage = "zh-CN"; // String | 
    File file = new File("/path/to/file"); // File | 
    String clusterId = "clusterId_example"; // String | 
    String name = "name_example"; // String | 
    String size = "size_example"; // String | 
    String description = "description_example"; // String | 
    String uploadTaskId = "uploadTaskId_example"; // String | 
    try {
      List<UploadTask> result = apiInstance.createElfImage(contentLanguage, file, clusterId, name, size, description, uploadTaskId);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **file** | **File**|  |
 **clusterId** | **String**|  |
 **name** | **String**|  |
 **size** | **String**|  |
 **description** | **String**|  |
 **uploadTaskId** | **String**|  |

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
> List&lt;WithTaskDeleteElfImage&gt; deleteElfImage(contentLanguage, elfImageDeletionParams)



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
    String contentLanguage = "zh-CN"; // String | 
    ElfImageDeletionParams elfImageDeletionParams = new ElfImageDeletionParams(); // ElfImageDeletionParams | 
    try {
      List<WithTaskDeleteElfImage> result = apiInstance.deleteElfImage(contentLanguage, elfImageDeletionParams);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **elfImageDeletionParams** | [**ElfImageDeletionParams**](ElfImageDeletionParams.md)|  |

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
> List&lt;ElfImage&gt; getElfImages(contentLanguage, getElfImagesRequestBody)



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
    String contentLanguage = "zh-CN"; // String | 
    GetElfImagesRequestBody getElfImagesRequestBody = new GetElfImagesRequestBody(); // GetElfImagesRequestBody | 
    try {
      List<ElfImage> result = apiInstance.getElfImages(contentLanguage, getElfImagesRequestBody);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getElfImagesRequestBody** | [**GetElfImagesRequestBody**](GetElfImagesRequestBody.md)|  |

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
> ElfImageConnection getElfImagesConnection(contentLanguage, getElfImagesConnectionRequestBody)



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
    String contentLanguage = "zh-CN"; // String | 
    GetElfImagesConnectionRequestBody getElfImagesConnectionRequestBody = new GetElfImagesConnectionRequestBody(); // GetElfImagesConnectionRequestBody | 
    try {
      ElfImageConnection result = apiInstance.getElfImagesConnection(contentLanguage, getElfImagesConnectionRequestBody);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getElfImagesConnectionRequestBody** | [**GetElfImagesConnectionRequestBody**](GetElfImagesConnectionRequestBody.md)|  |

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
> List&lt;WithTaskElfImage&gt; updateElfImage(contentLanguage, elfImageUpdationParams)



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
    String contentLanguage = "zh-CN"; // String | 
    ElfImageUpdationParams elfImageUpdationParams = new ElfImageUpdationParams(); // ElfImageUpdationParams | 
    try {
      List<WithTaskElfImage> result = apiInstance.updateElfImage(contentLanguage, elfImageUpdationParams);
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **elfImageUpdationParams** | [**ElfImageUpdationParams**](ElfImageUpdationParams.md)|  |

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

