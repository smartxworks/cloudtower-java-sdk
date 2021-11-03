# VmPlacementGroupApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVmPlacementGroup**](VmPlacementGroupApi.md#createVmPlacementGroup) | **POST** /create-vm-placement-group | 
[**deleteVmPlacementGroup**](VmPlacementGroupApi.md#deleteVmPlacementGroup) | **POST** /delete-vm-placement-group | 
[**getVmPlacementGroups**](VmPlacementGroupApi.md#getVmPlacementGroups) | **POST** /get-vm-placement-groups | 
[**getVmPlacementGroupsConnection**](VmPlacementGroupApi.md#getVmPlacementGroupsConnection) | **POST** /get-vm-placement-groups-connection | 
[**updateVmPlacementGroup**](VmPlacementGroupApi.md#updateVmPlacementGroup) | **POST** /update-vm-placement-group | 


<a name="createVmPlacementGroup"></a>
# **createVmPlacementGroup**
> List&lt;WithTaskVmPlacementGroup&gt; createVmPlacementGroup(vmPlacementGroupCreationParams, contentLanguage)



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
    List<VmPlacementGroupCreationParams> vmPlacementGroupCreationParams = Arrays.asList(); // List<VmPlacementGroupCreationParams> | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskVmPlacementGroup> result = apiInstance.createVmPlacementGroup(vmPlacementGroupCreationParams, contentLanguage);
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
 **vmPlacementGroupCreationParams** | [**List&lt;VmPlacementGroupCreationParams&gt;**](VmPlacementGroupCreationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
**200** | Ok |  -  |
**400** |  |  -  |

<a name="deleteVmPlacementGroup"></a>
# **deleteVmPlacementGroup**
> List&lt;WithTaskDeleteVmPlacementGroup&gt; deleteVmPlacementGroup(vmPlacementGroupDeletionParams, contentLanguage)



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
    VmPlacementGroupDeletionParams vmPlacementGroupDeletionParams = new VmPlacementGroupDeletionParams(); // VmPlacementGroupDeletionParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskDeleteVmPlacementGroup> result = apiInstance.deleteVmPlacementGroup(vmPlacementGroupDeletionParams, contentLanguage);
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
 **vmPlacementGroupDeletionParams** | [**VmPlacementGroupDeletionParams**](VmPlacementGroupDeletionParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
**200** | Ok |  -  |
**400** |  |  -  |

<a name="getVmPlacementGroups"></a>
# **getVmPlacementGroups**
> List&lt;VmPlacementGroup&gt; getVmPlacementGroups(getVmPlacementGroupsRequestBody, contentLanguage)



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
    GetVmPlacementGroupsRequestBody getVmPlacementGroupsRequestBody = new GetVmPlacementGroupsRequestBody(); // GetVmPlacementGroupsRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<VmPlacementGroup> result = apiInstance.getVmPlacementGroups(getVmPlacementGroupsRequestBody, contentLanguage);
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
 **getVmPlacementGroupsRequestBody** | [**GetVmPlacementGroupsRequestBody**](GetVmPlacementGroupsRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
**200** | Ok |  -  |
**400** |  |  -  |

<a name="getVmPlacementGroupsConnection"></a>
# **getVmPlacementGroupsConnection**
> VmPlacementGroupConnection getVmPlacementGroupsConnection(getVmPlacementGroupsConnectionRequestBody, contentLanguage)



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
    GetVmPlacementGroupsConnectionRequestBody getVmPlacementGroupsConnectionRequestBody = new GetVmPlacementGroupsConnectionRequestBody(); // GetVmPlacementGroupsConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      VmPlacementGroupConnection result = apiInstance.getVmPlacementGroupsConnection(getVmPlacementGroupsConnectionRequestBody, contentLanguage);
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
 **getVmPlacementGroupsConnectionRequestBody** | [**GetVmPlacementGroupsConnectionRequestBody**](GetVmPlacementGroupsConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
**200** | Ok |  -  |
**400** |  |  -  |

<a name="updateVmPlacementGroup"></a>
# **updateVmPlacementGroup**
> List&lt;WithTaskVmPlacementGroup&gt; updateVmPlacementGroup(vmPlacementGroupUpdationParams, contentLanguage)



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
    VmPlacementGroupUpdationParams vmPlacementGroupUpdationParams = new VmPlacementGroupUpdationParams(); // VmPlacementGroupUpdationParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskVmPlacementGroup> result = apiInstance.updateVmPlacementGroup(vmPlacementGroupUpdationParams, contentLanguage);
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
 **vmPlacementGroupUpdationParams** | [**VmPlacementGroupUpdationParams**](VmPlacementGroupUpdationParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
**200** | Ok |  -  |
**400** |  |  -  |

