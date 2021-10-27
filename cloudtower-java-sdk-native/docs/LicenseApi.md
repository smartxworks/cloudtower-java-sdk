# LicenseApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLicenses**](LicenseApi.md#getLicenses) | **POST** /get-licenses | 
[**getLicensesWithHttpInfo**](LicenseApi.md#getLicensesWithHttpInfo) | **POST** /get-licenses | 
[**getLicensesConnection**](LicenseApi.md#getLicensesConnection) | **POST** /get-licenses-connection | 
[**getLicensesConnectionWithHttpInfo**](LicenseApi.md#getLicensesConnectionWithHttpInfo) | **POST** /get-licenses-connection | 
[**updateDeploy**](LicenseApi.md#updateDeploy) | **POST** /update-license | 
[**updateDeployWithHttpInfo**](LicenseApi.md#updateDeployWithHttpInfo) | **POST** /update-license | 



## getLicenses

> List<License> getLicenses(contentLanguage, getLicensesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.LicenseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetLicensesRequestBody getLicensesRequestBody = new GetLicensesRequestBody(); // GetLicensesRequestBody | 
        try {
            List<License> result = apiInstance.getLicenses(contentLanguage, getLicensesRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicenses");
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
 **getLicensesRequestBody** | [**GetLicensesRequestBody**](GetLicensesRequestBody.md)|  |

### Return type

[**List&lt;License&gt;**](License.md)


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

## getLicensesWithHttpInfo

> ApiResponse<List<License>> getLicenses getLicensesWithHttpInfo(contentLanguage, getLicensesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.LicenseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetLicensesRequestBody getLicensesRequestBody = new GetLicensesRequestBody(); // GetLicensesRequestBody | 
        try {
            ApiResponse<List<License>> response = apiInstance.getLicensesWithHttpInfo(contentLanguage, getLicensesRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicenses");
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
 **getLicensesRequestBody** | [**GetLicensesRequestBody**](GetLicensesRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;License&gt;**](License.md)>


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


## getLicensesConnection

> LicenseConnection getLicensesConnection(contentLanguage, getLicensesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.LicenseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetLicensesConnectionRequestBody getLicensesConnectionRequestBody = new GetLicensesConnectionRequestBody(); // GetLicensesConnectionRequestBody | 
        try {
            LicenseConnection result = apiInstance.getLicensesConnection(contentLanguage, getLicensesConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicensesConnection");
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
 **getLicensesConnectionRequestBody** | [**GetLicensesConnectionRequestBody**](GetLicensesConnectionRequestBody.md)|  |

### Return type

[**LicenseConnection**](LicenseConnection.md)


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

## getLicensesConnectionWithHttpInfo

> ApiResponse<LicenseConnection> getLicensesConnection getLicensesConnectionWithHttpInfo(contentLanguage, getLicensesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.LicenseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetLicensesConnectionRequestBody getLicensesConnectionRequestBody = new GetLicensesConnectionRequestBody(); // GetLicensesConnectionRequestBody | 
        try {
            ApiResponse<LicenseConnection> response = apiInstance.getLicensesConnectionWithHttpInfo(contentLanguage, getLicensesConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicensesConnection");
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
 **getLicensesConnectionRequestBody** | [**GetLicensesConnectionRequestBody**](GetLicensesConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**LicenseConnection**](LicenseConnection.md)>


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


## updateDeploy

> WithTaskLicense updateDeploy(contentLanguage, licenseUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.LicenseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        LicenseUpdationParams licenseUpdationParams = new LicenseUpdationParams(); // LicenseUpdationParams | 
        try {
            WithTaskLicense result = apiInstance.updateDeploy(contentLanguage, licenseUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#updateDeploy");
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
 **licenseUpdationParams** | [**LicenseUpdationParams**](LicenseUpdationParams.md)|  |

### Return type

[**WithTaskLicense**](WithTaskLicense.md)


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

## updateDeployWithHttpInfo

> ApiResponse<WithTaskLicense> updateDeploy updateDeployWithHttpInfo(contentLanguage, licenseUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.LicenseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        LicenseUpdationParams licenseUpdationParams = new LicenseUpdationParams(); // LicenseUpdationParams | 
        try {
            ApiResponse<WithTaskLicense> response = apiInstance.updateDeployWithHttpInfo(contentLanguage, licenseUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#updateDeploy");
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
 **licenseUpdationParams** | [**LicenseUpdationParams**](LicenseUpdationParams.md)|  |

### Return type

ApiResponse<[**WithTaskLicense**](WithTaskLicense.md)>


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

