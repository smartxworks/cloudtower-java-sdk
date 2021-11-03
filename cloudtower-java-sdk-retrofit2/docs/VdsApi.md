# VdsApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVds**](VdsApi.md#createVds) | **POST** create-vds | 
[**createVdsWithAccessVlan**](VdsApi.md#createVdsWithAccessVlan) | **POST** create-vds-with-access-vlan | 
[**createVdsWithMigrateVlan**](VdsApi.md#createVdsWithMigrateVlan) | **POST** create-vds-with-migrate-vlan | 
[**deleteVds**](VdsApi.md#deleteVds) | **POST** delete-vds | 
[**getVdses**](VdsApi.md#getVdses) | **POST** get-vdses | 
[**getVdsesConnection**](VdsApi.md#getVdsesConnection) | **POST** get-vdses-connection | 
[**updateVds**](VdsApi.md#updateVds) | **POST** update-vds | 



## createVds

> List&lt;WithTaskVds&gt; createVds(vdsCreationParams, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VdsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VdsApi apiInstance = new VdsApi(defaultClient);
        List<VdsCreationParams> vdsCreationParams = Arrays.asList(); // List<VdsCreationParams> | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskVds> result = apiInstance.createVds(vdsCreationParams, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VdsApi#createVds");
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
 **vdsCreationParams** | [**List&lt;VdsCreationParams&gt;**](VdsCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskVds&gt;**](WithTaskVds.md)

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


## createVdsWithAccessVlan

> List&lt;WithTaskVds&gt; createVdsWithAccessVlan(vdsCreationWithMAccessVlanParams, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VdsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VdsApi apiInstance = new VdsApi(defaultClient);
        List<VdsCreationWithMAccessVlanParams> vdsCreationWithMAccessVlanParams = Arrays.asList(); // List<VdsCreationWithMAccessVlanParams> | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskVds> result = apiInstance.createVdsWithAccessVlan(vdsCreationWithMAccessVlanParams, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VdsApi#createVdsWithAccessVlan");
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
 **vdsCreationWithMAccessVlanParams** | [**List&lt;VdsCreationWithMAccessVlanParams&gt;**](VdsCreationWithMAccessVlanParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskVds&gt;**](WithTaskVds.md)

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


## createVdsWithMigrateVlan

> List&lt;WithTaskVds&gt; createVdsWithMigrateVlan(vdsCreationWithMigrateVlanParams, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VdsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VdsApi apiInstance = new VdsApi(defaultClient);
        List<VdsCreationWithMigrateVlanParams> vdsCreationWithMigrateVlanParams = Arrays.asList(); // List<VdsCreationWithMigrateVlanParams> | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskVds> result = apiInstance.createVdsWithMigrateVlan(vdsCreationWithMigrateVlanParams, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VdsApi#createVdsWithMigrateVlan");
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
 **vdsCreationWithMigrateVlanParams** | [**List&lt;VdsCreationWithMigrateVlanParams&gt;**](VdsCreationWithMigrateVlanParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskVds&gt;**](WithTaskVds.md)

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


## deleteVds

> List&lt;WithTaskDeleteVds&gt; deleteVds(vdsDeletionParams, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VdsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VdsApi apiInstance = new VdsApi(defaultClient);
        VdsDeletionParams vdsDeletionParams = new VdsDeletionParams(); // VdsDeletionParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskDeleteVds> result = apiInstance.deleteVds(vdsDeletionParams, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VdsApi#deleteVds");
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
 **vdsDeletionParams** | [**VdsDeletionParams**](VdsDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskDeleteVds&gt;**](WithTaskDeleteVds.md)

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


## getVdses

> List&lt;Vds&gt; getVdses(getVdsesRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VdsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VdsApi apiInstance = new VdsApi(defaultClient);
        GetVdsesRequestBody getVdsesRequestBody = new GetVdsesRequestBody(); // GetVdsesRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<Vds> result = apiInstance.getVdses(getVdsesRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VdsApi#getVdses");
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
 **getVdsesRequestBody** | [**GetVdsesRequestBody**](GetVdsesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;Vds&gt;**](Vds.md)

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


## getVdsesConnection

> VdsConnection getVdsesConnection(getVdsesConnectionRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VdsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VdsApi apiInstance = new VdsApi(defaultClient);
        GetVdsesConnectionRequestBody getVdsesConnectionRequestBody = new GetVdsesConnectionRequestBody(); // GetVdsesConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            VdsConnection result = apiInstance.getVdsesConnection(getVdsesConnectionRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VdsApi#getVdsesConnection");
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
 **getVdsesConnectionRequestBody** | [**GetVdsesConnectionRequestBody**](GetVdsesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**VdsConnection**](VdsConnection.md)

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


## updateVds

> List&lt;WithTaskVds&gt; updateVds(vdsUpdationParams, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VdsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VdsApi apiInstance = new VdsApi(defaultClient);
        VdsUpdationParams vdsUpdationParams = new VdsUpdationParams(); // VdsUpdationParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskVds> result = apiInstance.updateVds(vdsUpdationParams, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VdsApi#updateVds");
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
 **vdsUpdationParams** | [**VdsUpdationParams**](VdsUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskVds&gt;**](WithTaskVds.md)

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

