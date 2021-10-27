# DeployApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDeploys**](DeployApi.md#getDeploys) | **POST** /get-deploys | 
[**getDeploysWithHttpInfo**](DeployApi.md#getDeploysWithHttpInfo) | **POST** /get-deploys | 
[**getDeploysConnection**](DeployApi.md#getDeploysConnection) | **POST** /get-deploys-connection | 
[**getDeploysConnectionWithHttpInfo**](DeployApi.md#getDeploysConnectionWithHttpInfo) | **POST** /get-deploys-connection | 



## getDeploys

> List<Deploy> getDeploys(contentLanguage, getDeploysRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DeployApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DeployApi apiInstance = new DeployApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetDeploysRequestBody getDeploysRequestBody = new GetDeploysRequestBody(); // GetDeploysRequestBody | 
        try {
            List<Deploy> result = apiInstance.getDeploys(contentLanguage, getDeploysRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeployApi#getDeploys");
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
 **getDeploysRequestBody** | [**GetDeploysRequestBody**](GetDeploysRequestBody.md)|  |

### Return type

[**List&lt;Deploy&gt;**](Deploy.md)


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

## getDeploysWithHttpInfo

> ApiResponse<List<Deploy>> getDeploys getDeploysWithHttpInfo(contentLanguage, getDeploysRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DeployApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DeployApi apiInstance = new DeployApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetDeploysRequestBody getDeploysRequestBody = new GetDeploysRequestBody(); // GetDeploysRequestBody | 
        try {
            ApiResponse<List<Deploy>> response = apiInstance.getDeploysWithHttpInfo(contentLanguage, getDeploysRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeployApi#getDeploys");
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
 **getDeploysRequestBody** | [**GetDeploysRequestBody**](GetDeploysRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;Deploy&gt;**](Deploy.md)>


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


## getDeploysConnection

> DeployConnection getDeploysConnection(contentLanguage, getDeploysConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DeployApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DeployApi apiInstance = new DeployApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetDeploysConnectionRequestBody getDeploysConnectionRequestBody = new GetDeploysConnectionRequestBody(); // GetDeploysConnectionRequestBody | 
        try {
            DeployConnection result = apiInstance.getDeploysConnection(contentLanguage, getDeploysConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeployApi#getDeploysConnection");
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
 **getDeploysConnectionRequestBody** | [**GetDeploysConnectionRequestBody**](GetDeploysConnectionRequestBody.md)|  |

### Return type

[**DeployConnection**](DeployConnection.md)


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

## getDeploysConnectionWithHttpInfo

> ApiResponse<DeployConnection> getDeploysConnection getDeploysConnectionWithHttpInfo(contentLanguage, getDeploysConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DeployApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        DeployApi apiInstance = new DeployApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetDeploysConnectionRequestBody getDeploysConnectionRequestBody = new GetDeploysConnectionRequestBody(); // GetDeploysConnectionRequestBody | 
        try {
            ApiResponse<DeployConnection> response = apiInstance.getDeploysConnectionWithHttpInfo(contentLanguage, getDeploysConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeployApi#getDeploysConnection");
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
 **getDeploysConnectionRequestBody** | [**GetDeploysConnectionRequestBody**](GetDeploysConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**DeployConnection**](DeployConnection.md)>


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

