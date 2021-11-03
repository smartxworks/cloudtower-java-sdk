# NamespaceGroupApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNamespaceGroup**](NamespaceGroupApi.md#createNamespaceGroup) | **POST** create-namespace-group | 
[**deleteNamespaceGroup**](NamespaceGroupApi.md#deleteNamespaceGroup) | **POST** delete-namespace-group | 
[**getNamespaceGroups**](NamespaceGroupApi.md#getNamespaceGroups) | **POST** get-namespace-groups | 
[**getNamespaceGroupsConnection**](NamespaceGroupApi.md#getNamespaceGroupsConnection) | **POST** get-namespace-groups-connection | 
[**updateNamespaceGroup**](NamespaceGroupApi.md#updateNamespaceGroup) | **POST** update-namespace-group | 



## createNamespaceGroup

> List&lt;WithTaskNamespaceGroup&gt; createNamespaceGroup(namespaceGroupCreationParams, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NamespaceGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NamespaceGroupApi apiInstance = new NamespaceGroupApi(defaultClient);
        List<NamespaceGroupCreationParams> namespaceGroupCreationParams = Arrays.asList(); // List<NamespaceGroupCreationParams> | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskNamespaceGroup> result = apiInstance.createNamespaceGroup(namespaceGroupCreationParams, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NamespaceGroupApi#createNamespaceGroup");
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
 **namespaceGroupCreationParams** | [**List&lt;NamespaceGroupCreationParams&gt;**](NamespaceGroupCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskNamespaceGroup&gt;**](WithTaskNamespaceGroup.md)

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


## deleteNamespaceGroup

> List&lt;WithTaskDeleteNamespaceGroup&gt; deleteNamespaceGroup(namespaceGroupDeletionParams, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NamespaceGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NamespaceGroupApi apiInstance = new NamespaceGroupApi(defaultClient);
        NamespaceGroupDeletionParams namespaceGroupDeletionParams = new NamespaceGroupDeletionParams(); // NamespaceGroupDeletionParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskDeleteNamespaceGroup> result = apiInstance.deleteNamespaceGroup(namespaceGroupDeletionParams, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NamespaceGroupApi#deleteNamespaceGroup");
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
 **namespaceGroupDeletionParams** | [**NamespaceGroupDeletionParams**](NamespaceGroupDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskDeleteNamespaceGroup&gt;**](WithTaskDeleteNamespaceGroup.md)

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


## getNamespaceGroups

> List&lt;NamespaceGroup&gt; getNamespaceGroups(getNamespaceGroupsRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NamespaceGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NamespaceGroupApi apiInstance = new NamespaceGroupApi(defaultClient);
        GetNamespaceGroupsRequestBody getNamespaceGroupsRequestBody = new GetNamespaceGroupsRequestBody(); // GetNamespaceGroupsRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<NamespaceGroup> result = apiInstance.getNamespaceGroups(getNamespaceGroupsRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NamespaceGroupApi#getNamespaceGroups");
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
 **getNamespaceGroupsRequestBody** | [**GetNamespaceGroupsRequestBody**](GetNamespaceGroupsRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;NamespaceGroup&gt;**](NamespaceGroup.md)

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


## getNamespaceGroupsConnection

> NamespaceGroupConnection getNamespaceGroupsConnection(getNamespaceGroupsConnectionRequestBody, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NamespaceGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NamespaceGroupApi apiInstance = new NamespaceGroupApi(defaultClient);
        GetNamespaceGroupsConnectionRequestBody getNamespaceGroupsConnectionRequestBody = new GetNamespaceGroupsConnectionRequestBody(); // GetNamespaceGroupsConnectionRequestBody | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            NamespaceGroupConnection result = apiInstance.getNamespaceGroupsConnection(getNamespaceGroupsConnectionRequestBody, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NamespaceGroupApi#getNamespaceGroupsConnection");
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
 **getNamespaceGroupsConnectionRequestBody** | [**GetNamespaceGroupsConnectionRequestBody**](GetNamespaceGroupsConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**NamespaceGroupConnection**](NamespaceGroupConnection.md)

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


## updateNamespaceGroup

> List&lt;WithTaskNamespaceGroup&gt; updateNamespaceGroup(namespaceGroupUpdationParams, contentLanguage)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.NamespaceGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        NamespaceGroupApi apiInstance = new NamespaceGroupApi(defaultClient);
        NamespaceGroupUpdationParams namespaceGroupUpdationParams = new NamespaceGroupUpdationParams(); // NamespaceGroupUpdationParams | 
        String contentLanguage = "zh-CN"; // String | 
        try {
            List<WithTaskNamespaceGroup> result = apiInstance.updateNamespaceGroup(namespaceGroupUpdationParams, contentLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NamespaceGroupApi#updateNamespaceGroup");
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
 **namespaceGroupUpdationParams** | [**NamespaceGroupUpdationParams**](NamespaceGroupUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;WithTaskNamespaceGroup&gt;**](WithTaskNamespaceGroup.md)

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

