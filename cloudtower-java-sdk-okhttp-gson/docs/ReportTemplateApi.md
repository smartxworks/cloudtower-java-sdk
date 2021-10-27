# ReportTemplateApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReportTemplate**](ReportTemplateApi.md#createReportTemplate) | **POST** /create-report-template | 
[**deleteReportTemplate**](ReportTemplateApi.md#deleteReportTemplate) | **POST** /delete-report-template | 
[**generateFromReportTemplate**](ReportTemplateApi.md#generateFromReportTemplate) | **POST** /generate-from-report-template | 
[**getReportTemplates**](ReportTemplateApi.md#getReportTemplates) | **POST** /get-report-templates | 
[**getReportTemplatesConnection**](ReportTemplateApi.md#getReportTemplatesConnection) | **POST** /get-report-templates-connection | 
[**updateReportTemplate**](ReportTemplateApi.md#updateReportTemplate) | **POST** /update-report-template | 


<a name="createReportTemplate"></a>
# **createReportTemplate**
> List&lt;WithTaskReportTemplate&gt; createReportTemplate(contentLanguage, reportTemplateCreationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ReportTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ReportTemplateApi apiInstance = new ReportTemplateApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    List<ReportTemplateCreationParams> reportTemplateCreationParams = Arrays.asList(); // List<ReportTemplateCreationParams> | 
    try {
      List<WithTaskReportTemplate> result = apiInstance.createReportTemplate(contentLanguage, reportTemplateCreationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportTemplateApi#createReportTemplate");
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
 **reportTemplateCreationParams** | [**List&lt;ReportTemplateCreationParams&gt;**](ReportTemplateCreationParams.md)|  |

### Return type

[**List&lt;WithTaskReportTemplate&gt;**](WithTaskReportTemplate.md)

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

<a name="deleteReportTemplate"></a>
# **deleteReportTemplate**
> List&lt;WithTaskDeleteReportTemplate&gt; deleteReportTemplate(contentLanguage, reportTemplateDeletionParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ReportTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ReportTemplateApi apiInstance = new ReportTemplateApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    ReportTemplateDeletionParams reportTemplateDeletionParams = new ReportTemplateDeletionParams(); // ReportTemplateDeletionParams | 
    try {
      List<WithTaskDeleteReportTemplate> result = apiInstance.deleteReportTemplate(contentLanguage, reportTemplateDeletionParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportTemplateApi#deleteReportTemplate");
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
 **reportTemplateDeletionParams** | [**ReportTemplateDeletionParams**](ReportTemplateDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteReportTemplate&gt;**](WithTaskDeleteReportTemplate.md)

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

<a name="generateFromReportTemplate"></a>
# **generateFromReportTemplate**
> List&lt;WithTaskReportTask&gt; generateFromReportTemplate(contentLanguage, reporteTemplateGenerationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ReportTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ReportTemplateApi apiInstance = new ReportTemplateApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    ReporteTemplateGenerationParams reporteTemplateGenerationParams = new ReporteTemplateGenerationParams(); // ReporteTemplateGenerationParams | 
    try {
      List<WithTaskReportTask> result = apiInstance.generateFromReportTemplate(contentLanguage, reporteTemplateGenerationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportTemplateApi#generateFromReportTemplate");
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
 **reporteTemplateGenerationParams** | [**ReporteTemplateGenerationParams**](ReporteTemplateGenerationParams.md)|  |

### Return type

[**List&lt;WithTaskReportTask&gt;**](WithTaskReportTask.md)

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

<a name="getReportTemplates"></a>
# **getReportTemplates**
> List&lt;ReportTemplate&gt; getReportTemplates(contentLanguage, getReportTemplatesRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ReportTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ReportTemplateApi apiInstance = new ReportTemplateApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetReportTemplatesRequestBody getReportTemplatesRequestBody = new GetReportTemplatesRequestBody(); // GetReportTemplatesRequestBody | 
    try {
      List<ReportTemplate> result = apiInstance.getReportTemplates(contentLanguage, getReportTemplatesRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportTemplateApi#getReportTemplates");
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
 **getReportTemplatesRequestBody** | [**GetReportTemplatesRequestBody**](GetReportTemplatesRequestBody.md)|  |

### Return type

[**List&lt;ReportTemplate&gt;**](ReportTemplate.md)

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

<a name="getReportTemplatesConnection"></a>
# **getReportTemplatesConnection**
> ReportTemplateConnection getReportTemplatesConnection(contentLanguage, getReportTemplatesConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ReportTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ReportTemplateApi apiInstance = new ReportTemplateApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetReportTemplatesConnectionRequestBody getReportTemplatesConnectionRequestBody = new GetReportTemplatesConnectionRequestBody(); // GetReportTemplatesConnectionRequestBody | 
    try {
      ReportTemplateConnection result = apiInstance.getReportTemplatesConnection(contentLanguage, getReportTemplatesConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportTemplateApi#getReportTemplatesConnection");
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
 **getReportTemplatesConnectionRequestBody** | [**GetReportTemplatesConnectionRequestBody**](GetReportTemplatesConnectionRequestBody.md)|  |

### Return type

[**ReportTemplateConnection**](ReportTemplateConnection.md)

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

<a name="updateReportTemplate"></a>
# **updateReportTemplate**
> List&lt;WithTaskReportTemplate&gt; updateReportTemplate(contentLanguage, reportTemplateUpdationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ReportTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ReportTemplateApi apiInstance = new ReportTemplateApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    ReportTemplateUpdationParams reportTemplateUpdationParams = new ReportTemplateUpdationParams(); // ReportTemplateUpdationParams | 
    try {
      List<WithTaskReportTemplate> result = apiInstance.updateReportTemplate(contentLanguage, reportTemplateUpdationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportTemplateApi#updateReportTemplate");
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
 **reportTemplateUpdationParams** | [**ReportTemplateUpdationParams**](ReportTemplateUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskReportTemplate&gt;**](WithTaskReportTemplate.md)

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

