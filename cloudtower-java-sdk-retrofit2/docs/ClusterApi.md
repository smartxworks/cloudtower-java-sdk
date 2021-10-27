# ClusterApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**connectCluster**](ClusterApi.md#connectCluster) | **POST** connect-cluster | 
[**deleteCluster**](ClusterApi.md#deleteCluster) | **POST** delete-cluster | 
[**getClusters**](ClusterApi.md#getClusters) | **POST** get-clusters | 
[**getClustersConnection**](ClusterApi.md#getClustersConnection) | **POST** get-clusters-connection | 
[**updateCluster**](ClusterApi.md#updateCluster) | **POST** update-cluster | 
[**updateClusterLicense**](ClusterApi.md#updateClusterLicense) | **POST** update-cluster-license | 



## connectCluster

> List&lt;WithTaskCluster&gt; connectCluster(contentLanguage, clusterCreationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ClusterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ClusterApi apiInstance = new ClusterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        List<ClusterCreationParams> clusterCreationParams = Arrays.asList(); // List<ClusterCreationParams> | 
        try {
            List<WithTaskCluster> result = apiInstance.connectCluster(contentLanguage, clusterCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClusterApi#connectCluster");
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
 **clusterCreationParams** | [**List&lt;ClusterCreationParams&gt;**](ClusterCreationParams.md)|  |

### Return type

[**List&lt;WithTaskCluster&gt;**](WithTaskCluster.md)

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


## deleteCluster

> List&lt;WithTaskDeleteCluster&gt; deleteCluster(contentLanguage, clusterDeletionParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ClusterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ClusterApi apiInstance = new ClusterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        ClusterDeletionParams clusterDeletionParams = new ClusterDeletionParams(); // ClusterDeletionParams | 
        try {
            List<WithTaskDeleteCluster> result = apiInstance.deleteCluster(contentLanguage, clusterDeletionParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClusterApi#deleteCluster");
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
 **clusterDeletionParams** | [**ClusterDeletionParams**](ClusterDeletionParams.md)|  |

### Return type

[**List&lt;WithTaskDeleteCluster&gt;**](WithTaskDeleteCluster.md)

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


## getClusters

> List&lt;Cluster&gt; getClusters(contentLanguage, getClustersRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ClusterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ClusterApi apiInstance = new ClusterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetClustersRequestBody getClustersRequestBody = new GetClustersRequestBody(); // GetClustersRequestBody | 
        try {
            List<Cluster> result = apiInstance.getClusters(contentLanguage, getClustersRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClusterApi#getClusters");
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
 **getClustersRequestBody** | [**GetClustersRequestBody**](GetClustersRequestBody.md)|  |

### Return type

[**List&lt;Cluster&gt;**](Cluster.md)

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


## getClustersConnection

> ClusterConnection getClustersConnection(contentLanguage, getClustersConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ClusterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ClusterApi apiInstance = new ClusterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetClustersConnectionRequestBody getClustersConnectionRequestBody = new GetClustersConnectionRequestBody(); // GetClustersConnectionRequestBody | 
        try {
            ClusterConnection result = apiInstance.getClustersConnection(contentLanguage, getClustersConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClusterApi#getClustersConnection");
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
 **getClustersConnectionRequestBody** | [**GetClustersConnectionRequestBody**](GetClustersConnectionRequestBody.md)|  |

### Return type

[**ClusterConnection**](ClusterConnection.md)

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


## updateCluster

> List&lt;WithTaskCluster&gt; updateCluster(contentLanguage, clusterUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ClusterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ClusterApi apiInstance = new ClusterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        ClusterUpdationParams clusterUpdationParams = new ClusterUpdationParams(); // ClusterUpdationParams | 
        try {
            List<WithTaskCluster> result = apiInstance.updateCluster(contentLanguage, clusterUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClusterApi#updateCluster");
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
 **clusterUpdationParams** | [**ClusterUpdationParams**](ClusterUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskCluster&gt;**](WithTaskCluster.md)

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


## updateClusterLicense

> List&lt;WithTaskCluster&gt; updateClusterLicense(contentLanguage, clusterLicenseUpdationParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ClusterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ClusterApi apiInstance = new ClusterApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        ClusterLicenseUpdationParams clusterLicenseUpdationParams = new ClusterLicenseUpdationParams(); // ClusterLicenseUpdationParams | 
        try {
            List<WithTaskCluster> result = apiInstance.updateClusterLicense(contentLanguage, clusterLicenseUpdationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClusterApi#updateClusterLicense");
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
 **clusterLicenseUpdationParams** | [**ClusterLicenseUpdationParams**](ClusterLicenseUpdationParams.md)|  |

### Return type

[**List&lt;WithTaskCluster&gt;**](WithTaskCluster.md)

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

