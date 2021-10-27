# ReportTemplateApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReportTemplate**](ReportTemplateApi.md#createReportTemplate) | **POST** /create-report-template | 
[**createReportTemplateWithHttpInfo**](ReportTemplateApi.md#createReportTemplateWithHttpInfo) | **POST** /create-report-template | 
[**deleteReportTemplate**](ReportTemplateApi.md#deleteReportTemplate) | **POST** /delete-report-template | 
[**deleteReportTemplateWithHttpInfo**](ReportTemplateApi.md#deleteReportTemplateWithHttpInfo) | **POST** /delete-report-template | 
[**generateFromReportTemplate**](ReportTemplateApi.md#generateFromReportTemplate) | **POST** /generate-from-report-template | 
[**generateFromReportTemplateWithHttpInfo**](ReportTemplateApi.md#generateFromReportTemplateWithHttpInfo) | **POST** /generate-from-report-template | 
[**getReportTemplates**](ReportTemplateApi.md#getReportTemplates) | **POST** /get-report-templates | 
[**getReportTemplatesWithHttpInfo**](ReportTemplateApi.md#getReportTemplatesWithHttpInfo) | **POST** /get-report-templates | 
[**getReportTemplatesConnection**](ReportTemplateApi.md#getReportTemplatesConnection) | **POST** /get-report-templates-connection | 
[**getReportTemplatesConnectionWithHttpInfo**](ReportTemplateApi.md#getReportTemplatesConnectionWithHttpInfo) | **POST** /get-report-templates-connection | 
[**updateReportTemplate**](ReportTemplateApi.md#updateReportTemplate) | **POST** /update-report-template | 
[**updateReportTemplateWithHttpInfo**](ReportTemplateApi.md#updateReportTemplateWithHttpInfo) | **POST** /update-report-template | 



## createReportTemplate

> List<WithTaskReportTemplate> createReportTemplate(contentLanguage, reportTemplateCreationParams)



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
| **200** | Ok |  -  |
| **400** |  |  -  |

## createReportTemplateWithHttpInfo

> ApiResponse<List<WithTaskReportTemplate>> createReportTemplate createReportTemplateWithHttpInfo(contentLanguage, reportTemplateCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<List<WithTaskReportTemplate>> response = apiInstance.createReportTemplateWithHttpInfo(contentLanguage, reportTemplateCreationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportTemplateApi#createReportTemplate");
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
 **reportTemplateCreationParams** | [**List&lt;ReportTemplateCreationParams&gt;**](ReportTemplateCreationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskReportTemplate&gt;**](WithTaskReportTemplate.md)>


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


## deleteReportTemplate

> List<WithTaskDeleteReportTemplate> deleteReportTemplate(contentLanguage, reportTemplateDeletionParams)



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
| **200** | Ok |  -  |
| **400** |  |  -  |

## deleteReportTemplateWithHttpInfo

> ApiResponse<List<WithTaskDeleteReportTemplate>> deleteReportTemplate deleteReportTemplateWithHttpInfo(contentLanguage, reportTemplateDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<List<WithTaskDeleteReportTemplate>> response = apiInstance.deleteReportTemplateWithHttpInfo(contentLanguage, reportTemplateDeletionParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportTemplateApi#deleteReportTemplate");
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
 **reportTemplateDeletionParams** | [**ReportTemplateDeletionParams**](ReportTemplateDeletionParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDeleteReportTemplate&gt;**](WithTaskDeleteReportTemplate.md)>


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


## generateFromReportTemplate

> List<WithTaskReportTask> generateFromReportTemplate(contentLanguage, reporteTemplateGenerationParams)



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
| **200** | Ok |  -  |
| **400** |  |  -  |

## generateFromReportTemplateWithHttpInfo

> ApiResponse<List<WithTaskReportTask>> generateFromReportTemplate generateFromReportTemplateWithHttpInfo(contentLanguage, reporteTemplateGenerationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<List<WithTaskReportTask>> response = apiInstance.generateFromReportTemplateWithHttpInfo(contentLanguage, reporteTemplateGenerationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportTemplateApi#generateFromReportTemplate");
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
 **reporteTemplateGenerationParams** | [**ReporteTemplateGenerationParams**](ReporteTemplateGenerationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskReportTask&gt;**](WithTaskReportTask.md)>


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


## getReportTemplates

> List<ReportTemplate> getReportTemplates(contentLanguage, getReportTemplatesRequestBody)



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
| **200** | Ok |  -  |
| **400** |  |  -  |

## getReportTemplatesWithHttpInfo

> ApiResponse<List<ReportTemplate>> getReportTemplates getReportTemplatesWithHttpInfo(contentLanguage, getReportTemplatesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<List<ReportTemplate>> response = apiInstance.getReportTemplatesWithHttpInfo(contentLanguage, getReportTemplatesRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportTemplateApi#getReportTemplates");
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
 **getReportTemplatesRequestBody** | [**GetReportTemplatesRequestBody**](GetReportTemplatesRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;ReportTemplate&gt;**](ReportTemplate.md)>


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


## getReportTemplatesConnection

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
| **200** | Ok |  -  |
| **400** |  |  -  |

## getReportTemplatesConnectionWithHttpInfo

> ApiResponse<ReportTemplateConnection> getReportTemplatesConnection getReportTemplatesConnectionWithHttpInfo(contentLanguage, getReportTemplatesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<ReportTemplateConnection> response = apiInstance.getReportTemplatesConnectionWithHttpInfo(contentLanguage, getReportTemplatesConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportTemplateApi#getReportTemplatesConnection");
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
 **getReportTemplatesConnectionRequestBody** | [**GetReportTemplatesConnectionRequestBody**](GetReportTemplatesConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**ReportTemplateConnection**](ReportTemplateConnection.md)>


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


## updateReportTemplate

> List<WithTaskReportTemplate> updateReportTemplate(contentLanguage, reportTemplateUpdationParams)



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
| **200** | Ok |  -  |
| **400** |  |  -  |

## updateReportTemplateWithHttpInfo

> ApiResponse<List<WithTaskReportTemplate>> updateReportTemplate updateReportTemplateWithHttpInfo(contentLanguage, reportTemplateUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<List<WithTaskReportTemplate>> response = apiInstance.updateReportTemplateWithHttpInfo(contentLanguage, reportTemplateUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportTemplateApi#updateReportTemplate");
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
 **reportTemplateUpdationParams** | [**ReportTemplateUpdationParams**](ReportTemplateUpdationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskReportTemplate&gt;**](WithTaskReportTemplate.md)>


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

