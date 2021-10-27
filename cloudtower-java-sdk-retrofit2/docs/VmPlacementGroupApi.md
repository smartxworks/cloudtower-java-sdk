# VmPlacementGroupApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVmPlacementGroup**](VmPlacementGroupApi.md#createVmPlacementGroup) | **POST** create-vm-placement-group | 
[**deleteVmPlacementGroup**](VmPlacementGroupApi.md#deleteVmPlacementGroup) | **POST** delete-vm-placement-group | 
[**getVmPlacementGroups**](VmPlacementGroupApi.md#getVmPlacementGroups) | **POST** get-vm-placement-groups | 
[**getVmPlacementGroupsConnection**](VmPlacementGroupApi.md#getVmPlacementGroupsConnection) | **POST** get-vm-placement-groups-connection | 
[**updateVmPlacementGroup**](VmPlacementGroupApi.md#updateVmPlacementGroup) | **POST** update-vm-placement-group | 



## createVmPlacementGroup

> List&lt;WithTaskVmPlacementGroup&gt; createVmPlacementGroup(contentLanguage, vmPlacementGroupCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmPlacementGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmPlacementGroupApi apiInstance = new VmPlacementGroupApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<VmPlacementGroupCreationParams> vmPlacementGroupCreationParams = Arrays.asList(); // List<VmPlacementGroupCreationParams> | 
        try {
            List<WithTaskVmPlacementGroup> result = apiInstance.createVmPlacementGroup(contentLanguage, vmPlacementGroupCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmPlacementGroupApi#createVmPlacementGroup");
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
 **vmPlacementGroupCreationParams** | [**List&lt;VmPlacementGroupCreationParams&gt;**](VmPlacementGroupCreationParams.md)|  |

### Return type

[**List&lt;WithTaskVmPlacementGroup&gt;**](WithTaskVmPlacementGroup.md)

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


## deleteVmPlacementGroup

> List&lt;WithTaskDeleteVmPlacementGroup&gt; deleteVmPlacementGroup(contentLanguage, vmPlacementGroupDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmPlacementGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmPlacementGroupApi apiInstance = new VmPlacementGroupApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        VmPlacementGroupDeletionParams vmPlacementGroupDeletionParams = new VmPlacementGroupDeletionParams(); // VmPlacementGroupDeletionParams | 
        try {
            List<WithTaskDeleteVmPlacementGroup> result = apiInstance.deleteVmPlacementGroup(contentLanguage, vmPlacementGroupDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmPlacementGroupApi#deleteVmPlacementGroup");
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
 **vmPlacementGroupDeletionParams** | [**VmPlacementGroupDeletionParams**](VmPlacementGroupDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteVmPlacementGroup&gt;**](WithTaskDeleteVmPlacementGroup.md)

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


## getVmPlacementGroups

> List&lt;VmPlacementGroup&gt; getVmPlacementGroups(contentLanguage, getVmPlacementGroupsRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmPlacementGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmPlacementGroupApi apiInstance = new VmPlacementGroupApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmPlacementGroupsRequestBody getVmPlacementGroupsRequestBody = new GetVmPlacementGroupsRequestBody(); // GetVmPlacementGroupsRequestBody | 
        try {
            List<VmPlacementGroup> result = apiInstance.getVmPlacementGroups(contentLanguage, getVmPlacementGroupsRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmPlacementGroupApi#getVmPlacementGroups");
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
 **getVmPlacementGroupsRequestBody** | [**GetVmPlacementGroupsRequestBody**](GetVmPlacementGroupsRequestBody.md)|  |

### Return type

[**List&lt;VmPlacementGroup&gt;**](VmPlacementGroup.md)

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


## getVmPlacementGroupsConnection

> VmPlacementGroupConnection getVmPlacementGroupsConnection(contentLanguage, getVmPlacementGroupsConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmPlacementGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmPlacementGroupApi apiInstance = new VmPlacementGroupApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVmPlacementGroupsConnectionRequestBody getVmPlacementGroupsConnectionRequestBody = new GetVmPlacementGroupsConnectionRequestBody(); // GetVmPlacementGroupsConnectionRequestBody | 
        try {
            VmPlacementGroupConnection result = apiInstance.getVmPlacementGroupsConnection(contentLanguage, getVmPlacementGroupsConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmPlacementGroupApi#getVmPlacementGroupsConnection");
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
 **getVmPlacementGroupsConnectionRequestBody** | [**GetVmPlacementGroupsConnectionRequestBody**](GetVmPlacementGroupsConnectionRequestBody.md)|  |

### Return type

[**VmPlacementGroupConnection**](VmPlacementGroupConnection.md)

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


## updateVmPlacementGroup

> List&lt;WithTaskVmPlacementGroup&gt; updateVmPlacementGroup(contentLanguage, vmPlacementGroupUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmPlacementGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VmPlacementGroupApi apiInstance = new VmPlacementGroupApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        VmPlacementGroupUpdationParams vmPlacementGroupUpdationParams = new VmPlacementGroupUpdationParams(); // VmPlacementGroupUpdationParams | 
        try {
            List<WithTaskVmPlacementGroup> result = apiInstance.updateVmPlacementGroup(contentLanguage, vmPlacementGroupUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VmPlacementGroupApi#updateVmPlacementGroup");
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
 **vmPlacementGroupUpdationParams** | [**VmPlacementGroupUpdationParams**](VmPlacementGroupUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskVmPlacementGroup&gt;**](WithTaskVmPlacementGroup.md)

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

