# VlanApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVmVlan**](VlanApi.md#createVmVlan) | **POST** create-vm-vlan | 
[**deleteVlan**](VlanApi.md#deleteVlan) | **POST** delete-vm-vlan | 
[**getVlans**](VlanApi.md#getVlans) | **POST** get-vlans | 
[**getVlansConnection**](VlanApi.md#getVlansConnection) | **POST** get-vlans-connection | 
[**updateManagementVlan**](VlanApi.md#updateManagementVlan) | **POST** update-management-vlan | 
[**updateMigrationVlan**](VlanApi.md#updateMigrationVlan) | **POST** update-migration-vlan | 
[**updateVlan**](VlanApi.md#updateVlan) | **POST** update-vm-vlan | 



## createVmVlan

> List&lt;WithTaskVlan&gt; createVmVlan(contentLanguage, vmVlanCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VlanApi apiInstance = new VlanApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<VmVlanCreationParams> vmVlanCreationParams = Arrays.asList(); // List<VmVlanCreationParams> | 
        try {
            List<WithTaskVlan> result = apiInstance.createVmVlan(contentLanguage, vmVlanCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VlanApi#createVmVlan");
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
 **vmVlanCreationParams** | [**List&lt;VmVlanCreationParams&gt;**](VmVlanCreationParams.md)|  |

### Return type

[**List&lt;WithTaskVlan&gt;**](WithTaskVlan.md)

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


## deleteVlan

> List&lt;WithTaskDeleteVlan&gt; deleteVlan(contentLanguage, vlanDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VlanApi apiInstance = new VlanApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        VlanDeletionParams vlanDeletionParams = new VlanDeletionParams(); // VlanDeletionParams | 
        try {
            List<WithTaskDeleteVlan> result = apiInstance.deleteVlan(contentLanguage, vlanDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VlanApi#deleteVlan");
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
 **vlanDeletionParams** | [**VlanDeletionParams**](VlanDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteVlan&gt;**](WithTaskDeleteVlan.md)

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


## getVlans

> List&lt;Vlan&gt; getVlans(contentLanguage, getVlansRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VlanApi apiInstance = new VlanApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVlansRequestBody getVlansRequestBody = new GetVlansRequestBody(); // GetVlansRequestBody | 
        try {
            List<Vlan> result = apiInstance.getVlans(contentLanguage, getVlansRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VlanApi#getVlans");
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
 **getVlansRequestBody** | [**GetVlansRequestBody**](GetVlansRequestBody.md)|  |

### Return type

[**List&lt;Vlan&gt;**](Vlan.md)

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


## getVlansConnection

> VlanConnection getVlansConnection(contentLanguage, getVlansConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VlanApi apiInstance = new VlanApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetVlansConnectionRequestBody getVlansConnectionRequestBody = new GetVlansConnectionRequestBody(); // GetVlansConnectionRequestBody | 
        try {
            VlanConnection result = apiInstance.getVlansConnection(contentLanguage, getVlansConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VlanApi#getVlansConnection");
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
 **getVlansConnectionRequestBody** | [**GetVlansConnectionRequestBody**](GetVlansConnectionRequestBody.md)|  |

### Return type

[**VlanConnection**](VlanConnection.md)

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


## updateManagementVlan

> List&lt;WithTaskVlan&gt; updateManagementVlan(contentLanguage, managementVlanUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VlanApi apiInstance = new VlanApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        ManagementVlanUpdationParams managementVlanUpdationParams = new ManagementVlanUpdationParams(); // ManagementVlanUpdationParams | 
        try {
            List<WithTaskVlan> result = apiInstance.updateManagementVlan(contentLanguage, managementVlanUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VlanApi#updateManagementVlan");
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
 **managementVlanUpdationParams** | [**ManagementVlanUpdationParams**](ManagementVlanUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskVlan&gt;**](WithTaskVlan.md)

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


## updateMigrationVlan

> List&lt;WithTaskVlan&gt; updateMigrationVlan(contentLanguage, migrationVlanUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VlanApi apiInstance = new VlanApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        MigrationVlanUpdationParams migrationVlanUpdationParams = new MigrationVlanUpdationParams(); // MigrationVlanUpdationParams | 
        try {
            List<WithTaskVlan> result = apiInstance.updateMigrationVlan(contentLanguage, migrationVlanUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VlanApi#updateMigrationVlan");
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
 **migrationVlanUpdationParams** | [**MigrationVlanUpdationParams**](MigrationVlanUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskVlan&gt;**](WithTaskVlan.md)

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


## updateVlan

> List&lt;WithTaskVlan&gt; updateVlan(contentLanguage, vmVlanUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        VlanApi apiInstance = new VlanApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        VmVlanUpdationParams vmVlanUpdationParams = new VmVlanUpdationParams(); // VmVlanUpdationParams | 
        try {
            List<WithTaskVlan> result = apiInstance.updateVlan(contentLanguage, vmVlanUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VlanApi#updateVlan");
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
 **vmVlanUpdationParams** | [**VmVlanUpdationParams**](VmVlanUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskVlan&gt;**](WithTaskVlan.md)

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

