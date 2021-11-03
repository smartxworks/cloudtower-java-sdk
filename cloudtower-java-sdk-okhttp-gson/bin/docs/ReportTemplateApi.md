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
> List&lt;WithTaskReportTemplate&gt; createReportTemplate(reportTemplateCreationParams, contentLanguage)



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
    List<ReportTemplateCreationParams> reportTemplateCreationParams = Arrays.asList(); // List<ReportTemplateCreationParams> | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskReportTemplate> result = apiInstance.createReportTemplate(reportTemplateCreationParams, contentLanguage);
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
 **reportTemplateCreationParams** | [**List&lt;ReportTemplateCreationParams&gt;**](ReportTemplateCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
> List&lt;WithTaskDeleteReportTemplate&gt; deleteReportTemplate(reportTemplateDeletionParams, contentLanguage)



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
    ReportTemplateDeletionParams reportTemplateDeletionParams = new ReportTemplateDeletionParams(); // ReportTemplateDeletionParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskDeleteReportTemplate> result = apiInstance.deleteReportTemplate(reportTemplateDeletionParams, contentLanguage);
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
 **reportTemplateDeletionParams** | [**ReportTemplateDeletionParams**](ReportTemplateDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
> List&lt;WithTaskReportTask&gt; generateFromReportTemplate(reporteTemplateGenerationParams, contentLanguage)



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
    ReporteTemplateGenerationParams reporteTemplateGenerationParams = new ReporteTemplateGenerationParams(); // ReporteTemplateGenerationParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskReportTask> result = apiInstance.generateFromReportTemplate(reporteTemplateGenerationParams, contentLanguage);
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
 **reporteTemplateGenerationParams** | [**ReporteTemplateGenerationParams**](ReporteTemplateGenerationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
> List&lt;ReportTemplate&gt; getReportTemplates(getReportTemplatesRequestBody, contentLanguage)



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
    GetReportTemplatesRequestBody getReportTemplatesRequestBody = new GetReportTemplatesRequestBody(); // GetReportTemplatesRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<ReportTemplate> result = apiInstance.getReportTemplates(getReportTemplatesRequestBody, contentLanguage);
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
 **getReportTemplatesRequestBody** | [**GetReportTemplatesRequestBody**](GetReportTemplatesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
> ReportTemplateConnection getReportTemplatesConnection(getReportTemplatesConnectionRequestBody, contentLanguage)



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
    GetReportTemplatesConnectionRequestBody getReportTemplatesConnectionRequestBody = new GetReportTemplatesConnectionRequestBody(); // GetReportTemplatesConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      ReportTemplateConnection result = apiInstance.getReportTemplatesConnection(getReportTemplatesConnectionRequestBody, contentLanguage);
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
 **getReportTemplatesConnectionRequestBody** | [**GetReportTemplatesConnectionRequestBody**](GetReportTemplatesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
> List&lt;WithTaskReportTemplate&gt; updateReportTemplate(reportTemplateUpdationParams, contentLanguage)



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
    ReportTemplateUpdationParams reportTemplateUpdationParams = new ReportTemplateUpdationParams(); // ReportTemplateUpdationParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskReportTemplate> result = apiInstance.updateReportTemplate(reportTemplateUpdationParams, contentLanguage);
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
 **reportTemplateUpdationParams** | [**ReportTemplateUpdationParams**](ReportTemplateUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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

