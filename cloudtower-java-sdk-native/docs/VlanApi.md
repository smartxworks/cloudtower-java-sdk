# VlanApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVmVlan**](VlanApi.md#createVmVlan) | **POST** /create-vm-vlan | 
[**createVmVlanWithHttpInfo**](VlanApi.md#createVmVlanWithHttpInfo) | **POST** /create-vm-vlan | 
[**deleteVlan**](VlanApi.md#deleteVlan) | **POST** /delete-vm-vlan | 
[**deleteVlanWithHttpInfo**](VlanApi.md#deleteVlanWithHttpInfo) | **POST** /delete-vm-vlan | 
[**getVlans**](VlanApi.md#getVlans) | **POST** /get-vlans | 
[**getVlansWithHttpInfo**](VlanApi.md#getVlansWithHttpInfo) | **POST** /get-vlans | 
[**getVlansConnection**](VlanApi.md#getVlansConnection) | **POST** /get-vlans-connection | 
[**getVlansConnectionWithHttpInfo**](VlanApi.md#getVlansConnectionWithHttpInfo) | **POST** /get-vlans-connection | 
[**updateManagementVlan**](VlanApi.md#updateManagementVlan) | **POST** /update-management-vlan | 
[**updateManagementVlanWithHttpInfo**](VlanApi.md#updateManagementVlanWithHttpInfo) | **POST** /update-management-vlan | 
[**updateMigrationVlan**](VlanApi.md#updateMigrationVlan) | **POST** /update-migration-vlan | 
[**updateMigrationVlanWithHttpInfo**](VlanApi.md#updateMigrationVlanWithHttpInfo) | **POST** /update-migration-vlan | 
[**updateVlan**](VlanApi.md#updateVlan) | **POST** /update-vm-vlan | 
[**updateVlanWithHttpInfo**](VlanApi.md#updateVlanWithHttpInfo) | **POST** /update-vm-vlan | 



## createVmVlan

> List<WithTaskVlan> createVmVlan(contentLanguage, vmVlanCreationParams)



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

## createVmVlanWithHttpInfo

> ApiResponse<List<WithTaskVlan>> createVmVlan createVmVlanWithHttpInfo(contentLanguage, vmVlanCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<List<WithTaskVlan>> response = apiInstance.createVmVlanWithHttpInfo(contentLanguage, vmVlanCreationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VlanApi#createVmVlan");
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
 **vmVlanCreationParams** | [**List&lt;VmVlanCreationParams&gt;**](VmVlanCreationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskVlan&gt;**](WithTaskVlan.md)>


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

> List<WithTaskDeleteVlan> deleteVlan(contentLanguage, vlanDeletionParams)



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

## deleteVlanWithHttpInfo

> ApiResponse<List<WithTaskDeleteVlan>> deleteVlan deleteVlanWithHttpInfo(contentLanguage, vlanDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<List<WithTaskDeleteVlan>> response = apiInstance.deleteVlanWithHttpInfo(contentLanguage, vlanDeletionParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VlanApi#deleteVlan");
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
 **vlanDeletionParams** | [**VlanDeletionParams**](VlanDeletionParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskDeleteVlan&gt;**](WithTaskDeleteVlan.md)>


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

> List<Vlan> getVlans(contentLanguage, getVlansRequestBody)



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

## getVlansWithHttpInfo

> ApiResponse<List<Vlan>> getVlans getVlansWithHttpInfo(contentLanguage, getVlansRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<List<Vlan>> response = apiInstance.getVlansWithHttpInfo(contentLanguage, getVlansRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VlanApi#getVlans");
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
 **getVlansRequestBody** | [**GetVlansRequestBody**](GetVlansRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;Vlan&gt;**](Vlan.md)>


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

## getVlansConnectionWithHttpInfo

> ApiResponse<VlanConnection> getVlansConnection getVlansConnectionWithHttpInfo(contentLanguage, getVlansConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<VlanConnection> response = apiInstance.getVlansConnectionWithHttpInfo(contentLanguage, getVlansConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VlanApi#getVlansConnection");
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
 **getVlansConnectionRequestBody** | [**GetVlansConnectionRequestBody**](GetVlansConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**VlanConnection**](VlanConnection.md)>


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

> List<WithTaskVlan> updateManagementVlan(contentLanguage, managementVlanUpdationParams)



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

## updateManagementVlanWithHttpInfo

> ApiResponse<List<WithTaskVlan>> updateManagementVlan updateManagementVlanWithHttpInfo(contentLanguage, managementVlanUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<List<WithTaskVlan>> response = apiInstance.updateManagementVlanWithHttpInfo(contentLanguage, managementVlanUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VlanApi#updateManagementVlan");
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
 **managementVlanUpdationParams** | [**ManagementVlanUpdationParams**](ManagementVlanUpdationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskVlan&gt;**](WithTaskVlan.md)>


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

> List<WithTaskVlan> updateMigrationVlan(contentLanguage, migrationVlanUpdationParams)



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

## updateMigrationVlanWithHttpInfo

> ApiResponse<List<WithTaskVlan>> updateMigrationVlan updateMigrationVlanWithHttpInfo(contentLanguage, migrationVlanUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<List<WithTaskVlan>> response = apiInstance.updateMigrationVlanWithHttpInfo(contentLanguage, migrationVlanUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VlanApi#updateMigrationVlan");
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
 **migrationVlanUpdationParams** | [**MigrationVlanUpdationParams**](MigrationVlanUpdationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskVlan&gt;**](WithTaskVlan.md)>


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

> List<WithTaskVlan> updateVlan(contentLanguage, vmVlanUpdationParams)



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

## updateVlanWithHttpInfo

> ApiResponse<List<WithTaskVlan>> updateVlan updateVlanWithHttpInfo(contentLanguage, vmVlanUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
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
            ApiResponse<List<WithTaskVlan>> response = apiInstance.updateVlanWithHttpInfo(contentLanguage, vmVlanUpdationParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VlanApi#updateVlan");
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
 **vmVlanUpdationParams** | [**VmVlanUpdationParams**](VmVlanUpdationParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskVlan&gt;**](WithTaskVlan.md)>


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

