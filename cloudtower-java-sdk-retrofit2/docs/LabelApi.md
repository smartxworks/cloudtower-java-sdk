# LabelApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLabelsToResources**](LabelApi.md#addLabelsToResources) | **POST** add-labels-to-resources | 
[**createLabel**](LabelApi.md#createLabel) | **POST** create-label | 
[**deleteLabel**](LabelApi.md#deleteLabel) | **POST** delete-label | 
[**getLabels**](LabelApi.md#getLabels) | **POST** get-labels | 
[**getLabelsConnection**](LabelApi.md#getLabelsConnection) | **POST** get-labels-connection | 
[**removeLabelsFromResources**](LabelApi.md#removeLabelsFromResources) | **POST** remove-labels-from-resources | 
[**updateLabel**](LabelApi.md#updateLabel) | **POST** update-label | 



## addLabelsToResources

> List&lt;WithTaskLabel&gt; addLabelsToResources(contentLanguage, addLabelsToResourcesParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.LabelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        LabelApi apiInstance = new LabelApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        AddLabelsToResourcesParams addLabelsToResourcesParams = new AddLabelsToResourcesParams(); // AddLabelsToResourcesParams | 
        try {
            List<WithTaskLabel> result = apiInstance.addLabelsToResources(contentLanguage, addLabelsToResourcesParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LabelApi#addLabelsToResources");
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
 **addLabelsToResourcesParams** | [**AddLabelsToResourcesParams**](AddLabelsToResourcesParams.md)|  |

### Return type

[**List&lt;WithTaskLabel&gt;**](WithTaskLabel.md)

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


## createLabel

> List&lt;WithTaskLabel&gt; createLabel(contentLanguage, labelCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.LabelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        LabelApi apiInstance = new LabelApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<LabelCreationParams> labelCreationParams = Arrays.asList(); // List<LabelCreationParams> | 
        try {
            List<WithTaskLabel> result = apiInstance.createLabel(contentLanguage, labelCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LabelApi#createLabel");
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
 **labelCreationParams** | [**List&lt;LabelCreationParams&gt;**](LabelCreationParams.md)|  |

### Return type

[**List&lt;WithTaskLabel&gt;**](WithTaskLabel.md)

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


## deleteLabel

> List&lt;WithTaskDeleteLabel&gt; deleteLabel(contentLanguage, labelDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.LabelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        LabelApi apiInstance = new LabelApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        LabelDeletionParams labelDeletionParams = new LabelDeletionParams(); // LabelDeletionParams | 
        try {
            List<WithTaskDeleteLabel> result = apiInstance.deleteLabel(contentLanguage, labelDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LabelApi#deleteLabel");
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
 **labelDeletionParams** | [**LabelDeletionParams**](LabelDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteLabel&gt;**](WithTaskDeleteLabel.md)

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


## getLabels

> List&lt;Label&gt; getLabels(contentLanguage, getLabelsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.LabelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        LabelApi apiInstance = new LabelApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetLabelsRequestBody getLabelsRequestBody = new GetLabelsRequestBody(); // GetLabelsRequestBody | 
        try {
            List<Label> result = apiInstance.getLabels(contentLanguage, getLabelsRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LabelApi#getLabels");
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
 **getLabelsRequestBody** | [**GetLabelsRequestBody**](GetLabelsRequestBody.md)|  |

### Return type

[**List&lt;Label&gt;**](Label.md)

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


## getLabelsConnection

> LabelConnection getLabelsConnection(contentLanguage, getLabelsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.LabelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        LabelApi apiInstance = new LabelApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetLabelsConnectionRequestBody getLabelsConnectionRequestBody = new GetLabelsConnectionRequestBody(); // GetLabelsConnectionRequestBody | 
        try {
            LabelConnection result = apiInstance.getLabelsConnection(contentLanguage, getLabelsConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LabelApi#getLabelsConnection");
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
 **getLabelsConnectionRequestBody** | [**GetLabelsConnectionRequestBody**](GetLabelsConnectionRequestBody.md)|  |

### Return type

[**LabelConnection**](LabelConnection.md)

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


## removeLabelsFromResources

> List&lt;WithTaskLabel&gt; removeLabelsFromResources(contentLanguage, body)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.LabelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        LabelApi apiInstance = new LabelApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        AddLabelsToResourcesParams body = new AddLabelsToResourcesParams(); // AddLabelsToResourcesParams | 
        try {
            List<WithTaskLabel> result = apiInstance.removeLabelsFromResources(contentLanguage, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LabelApi#removeLabelsFromResources");
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
 **body** | **AddLabelsToResourcesParams**|  |

### Return type

[**List&lt;WithTaskLabel&gt;**](WithTaskLabel.md)

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


## updateLabel

> List&lt;WithTaskLabel&gt; updateLabel(contentLanguage, labelUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.LabelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        LabelApi apiInstance = new LabelApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        LabelUpdationParams labelUpdationParams = new LabelUpdationParams(); // LabelUpdationParams | 
        try {
            List<WithTaskLabel> result = apiInstance.updateLabel(contentLanguage, labelUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LabelApi#updateLabel");
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
 **labelUpdationParams** | [**LabelUpdationParams**](LabelUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskLabel&gt;**](WithTaskLabel.md)

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

