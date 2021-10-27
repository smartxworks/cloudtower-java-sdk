# VmApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addVmCdRom**](VmApi.md#addVmCdRom) | **POST** /add-vm-cd-rom | 
[**addVmDisk**](VmApi.md#addVmDisk) | **POST** /add-vm-disk | 
[**addVmNic**](VmApi.md#addVmNic) | **POST** /add-vm-nic | 
[**addVmToFolder**](VmApi.md#addVmToFolder) | **POST** /add-vm-to-folder | 
[**cloneVm**](VmApi.md#cloneVm) | **POST** /clone-vm | 
[**convertVmTemplateToVm**](VmApi.md#convertVmTemplateToVm) | **POST** /convert-vm-template-to-vm | 
[**createVm**](VmApi.md#createVm) | **POST** /create-vm | 
[**createVmFromTemplate**](VmApi.md#createVmFromTemplate) | **POST** /create-vm-from-template | 
[**deleteVm**](VmApi.md#deleteVm) | **POST** /delete-vm | 
[**forceRestartVm**](VmApi.md#forceRestartVm) | **POST** /force-restart-vm | 
[**forceShutDownVm**](VmApi.md#forceShutDownVm) | **POST** /poweroff-vm | 
[**getVms**](VmApi.md#getVms) | **POST** /get-vms | 
[**getVmsConnection**](VmApi.md#getVmsConnection) | **POST** /get-vms-connection | 
[**installVmtools**](VmApi.md#installVmtools) | **POST** /install-vmtools | 
[**migRateVm**](VmApi.md#migRateVm) | **POST** /migrate-vm | 
[**moveVmToRecycleBin**](VmApi.md#moveVmToRecycleBin) | **POST** /move-vm-to-recycle | 
[**rebuildVm**](VmApi.md#rebuildVm) | **POST** /rebuild-vm-from-snapshot | 
[**recoverVmFromRecycleBin**](VmApi.md#recoverVmFromRecycleBin) | **POST** /recover-vm-from-recycle | 
[**removeVmCdRom**](VmApi.md#removeVmCdRom) | **POST** /remove-vm-cd-rom | 
[**removeVmDisk**](VmApi.md#removeVmDisk) | **POST** /remove-vm-disk | 
[**removeVmNic**](VmApi.md#removeVmNic) | **POST** /remove-vm-nic | 
[**removeVmToFolder**](VmApi.md#removeVmToFolder) | **POST** /remove-vm-from-folder | 
[**restartVm**](VmApi.md#restartVm) | **POST** /restart-vm | 
[**resumeVm**](VmApi.md#resumeVm) | **POST** /resume-vm | 
[**rollbackVm**](VmApi.md#rollbackVm) | **POST** /rollback-vm | 
[**shutDownVm**](VmApi.md#shutDownVm) | **POST** /shutdown-vm | 
[**startVm**](VmApi.md#startVm) | **POST** /start-vm | 
[**suspendVm**](VmApi.md#suspendVm) | **POST** /suspend-vm | 
[**updateVm**](VmApi.md#updateVm) | **POST** /update-vm-basic-info | 
[**updateVmDisk**](VmApi.md#updateVmDisk) | **POST** /update-vm-disk | 
[**updateVmNic**](VmApi.md#updateVmNic) | **POST** /update-vm-nic | 


<a name="addVmCdRom"></a>
# **addVmCdRom**
> List&lt;WithTaskVm&gt; addVmCdRom(contentLanguage, vmAddCdRomParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmAddCdRomParams vmAddCdRomParams = new VmAddCdRomParams(); // VmAddCdRomParams | 
    try {
      List<WithTaskVm> result = apiInstance.addVmCdRom(contentLanguage, vmAddCdRomParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#addVmCdRom");
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
 **vmAddCdRomParams** | [**VmAddCdRomParams**](VmAddCdRomParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="addVmDisk"></a>
# **addVmDisk**
> List&lt;WithTaskVm&gt; addVmDisk(contentLanguage, vmAddDiskParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmAddDiskParams vmAddDiskParams = new VmAddDiskParams(); // VmAddDiskParams | 
    try {
      List<WithTaskVm> result = apiInstance.addVmDisk(contentLanguage, vmAddDiskParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#addVmDisk");
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
 **vmAddDiskParams** | [**VmAddDiskParams**](VmAddDiskParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="addVmNic"></a>
# **addVmNic**
> List&lt;WithTaskVm&gt; addVmNic(contentLanguage, vmAddNicParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmAddNicParams vmAddNicParams = new VmAddNicParams(); // VmAddNicParams | 
    try {
      List<WithTaskVm> result = apiInstance.addVmNic(contentLanguage, vmAddNicParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#addVmNic");
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
 **vmAddNicParams** | [**VmAddNicParams**](VmAddNicParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="addVmToFolder"></a>
# **addVmToFolder**
> List&lt;WithTaskVm&gt; addVmToFolder(contentLanguage, vmAddFolderParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmAddFolderParams vmAddFolderParams = new VmAddFolderParams(); // VmAddFolderParams | 
    try {
      List<WithTaskVm> result = apiInstance.addVmToFolder(contentLanguage, vmAddFolderParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#addVmToFolder");
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
 **vmAddFolderParams** | [**VmAddFolderParams**](VmAddFolderParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="cloneVm"></a>
# **cloneVm**
> List&lt;WithTaskVm&gt; cloneVm(contentLanguage, vmCloneParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    List<VmCloneParams> vmCloneParams = Arrays.asList(); // List<VmCloneParams> | 
    try {
      List<WithTaskVm> result = apiInstance.cloneVm(contentLanguage, vmCloneParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#cloneVm");
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
 **vmCloneParams** | [**List&lt;VmCloneParams&gt;**](VmCloneParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="convertVmTemplateToVm"></a>
# **convertVmTemplateToVm**
> List&lt;WithTaskVm&gt; convertVmTemplateToVm(contentLanguage, convertVmTemplateToVmParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    List<ConvertVmTemplateToVmParams> convertVmTemplateToVmParams = Arrays.asList(); // List<ConvertVmTemplateToVmParams> | 
    try {
      List<WithTaskVm> result = apiInstance.convertVmTemplateToVm(contentLanguage, convertVmTemplateToVmParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#convertVmTemplateToVm");
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
 **convertVmTemplateToVmParams** | [**List&lt;ConvertVmTemplateToVmParams&gt;**](ConvertVmTemplateToVmParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="createVm"></a>
# **createVm**
> List&lt;WithTaskVm&gt; createVm(contentLanguage, vmCreationParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    List<VmCreationParams> vmCreationParams = Arrays.asList(); // List<VmCreationParams> | 
    try {
      List<WithTaskVm> result = apiInstance.createVm(contentLanguage, vmCreationParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#createVm");
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
 **vmCreationParams** | [**List&lt;VmCreationParams&gt;**](VmCreationParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="createVmFromTemplate"></a>
# **createVmFromTemplate**
> List&lt;WithTaskVm&gt; createVmFromTemplate(contentLanguage, vmCreateVmFromTemplateParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    List<VmCreateVmFromTemplateParams> vmCreateVmFromTemplateParams = Arrays.asList(); // List<VmCreateVmFromTemplateParams> | 
    try {
      List<WithTaskVm> result = apiInstance.createVmFromTemplate(contentLanguage, vmCreateVmFromTemplateParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#createVmFromTemplate");
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
 **vmCreateVmFromTemplateParams** | [**List&lt;VmCreateVmFromTemplateParams&gt;**](VmCreateVmFromTemplateParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="deleteVm"></a>
# **deleteVm**
> List&lt;InlineResponse200&gt; deleteVm(contentLanguage, vmOperateParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmOperateParams vmOperateParams = new VmOperateParams(); // VmOperateParams | 
    try {
      List<InlineResponse200> result = apiInstance.deleteVm(contentLanguage, vmOperateParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#deleteVm");
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
 **vmOperateParams** | [**VmOperateParams**](VmOperateParams.md)|  |

### Return type

[**List&lt;InlineResponse200&gt;**](InlineResponse200.md)

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

<a name="forceRestartVm"></a>
# **forceRestartVm**
> List&lt;WithTaskVm&gt; forceRestartVm(contentLanguage, vmOperateParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmOperateParams vmOperateParams = new VmOperateParams(); // VmOperateParams | 
    try {
      List<WithTaskVm> result = apiInstance.forceRestartVm(contentLanguage, vmOperateParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#forceRestartVm");
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
 **vmOperateParams** | [**VmOperateParams**](VmOperateParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="forceShutDownVm"></a>
# **forceShutDownVm**
> List&lt;WithTaskVm&gt; forceShutDownVm(contentLanguage, vmOperateParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmOperateParams vmOperateParams = new VmOperateParams(); // VmOperateParams | 
    try {
      List<WithTaskVm> result = apiInstance.forceShutDownVm(contentLanguage, vmOperateParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#forceShutDownVm");
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
 **vmOperateParams** | [**VmOperateParams**](VmOperateParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="getVms"></a>
# **getVms**
> List&lt;Vm&gt; getVms(contentLanguage, getVmsRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetVmsRequestBody getVmsRequestBody = new GetVmsRequestBody(); // GetVmsRequestBody | 
    try {
      List<Vm> result = apiInstance.getVms(contentLanguage, getVmsRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#getVms");
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
 **getVmsRequestBody** | [**GetVmsRequestBody**](GetVmsRequestBody.md)|  |

### Return type

[**List&lt;Vm&gt;**](Vm.md)

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

<a name="getVmsConnection"></a>
# **getVmsConnection**
> VmConnection getVmsConnection(contentLanguage, getVmsConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetVmsConnectionRequestBody getVmsConnectionRequestBody = new GetVmsConnectionRequestBody(); // GetVmsConnectionRequestBody | 
    try {
      VmConnection result = apiInstance.getVmsConnection(contentLanguage, getVmsConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#getVmsConnection");
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
 **getVmsConnectionRequestBody** | [**GetVmsConnectionRequestBody**](GetVmsConnectionRequestBody.md)|  |

### Return type

[**VmConnection**](VmConnection.md)

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

<a name="installVmtools"></a>
# **installVmtools**
> List&lt;WithTaskVm&gt; installVmtools(contentLanguage, installVmtoolsParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    InstallVmtoolsParams installVmtoolsParams = new InstallVmtoolsParams(); // InstallVmtoolsParams | 
    try {
      List<WithTaskVm> result = apiInstance.installVmtools(contentLanguage, installVmtoolsParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#installVmtools");
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
 **installVmtoolsParams** | [**InstallVmtoolsParams**](InstallVmtoolsParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="migRateVm"></a>
# **migRateVm**
> List&lt;WithTaskVm&gt; migRateVm(contentLanguage, vmMigrateParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmMigrateParams vmMigrateParams = new VmMigrateParams(); // VmMigrateParams | 
    try {
      List<WithTaskVm> result = apiInstance.migRateVm(contentLanguage, vmMigrateParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#migRateVm");
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
 **vmMigrateParams** | [**VmMigrateParams**](VmMigrateParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="moveVmToRecycleBin"></a>
# **moveVmToRecycleBin**
> List&lt;InlineResponse200&gt; moveVmToRecycleBin(contentLanguage, vmOperateParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmOperateParams vmOperateParams = new VmOperateParams(); // VmOperateParams | 
    try {
      List<InlineResponse200> result = apiInstance.moveVmToRecycleBin(contentLanguage, vmOperateParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#moveVmToRecycleBin");
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
 **vmOperateParams** | [**VmOperateParams**](VmOperateParams.md)|  |

### Return type

[**List&lt;InlineResponse200&gt;**](InlineResponse200.md)

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

<a name="rebuildVm"></a>
# **rebuildVm**
> List&lt;WithTaskVm&gt; rebuildVm(contentLanguage, vmRebuildParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    List<VmRebuildParams> vmRebuildParams = Arrays.asList(); // List<VmRebuildParams> | 
    try {
      List<WithTaskVm> result = apiInstance.rebuildVm(contentLanguage, vmRebuildParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#rebuildVm");
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
 **vmRebuildParams** | [**List&lt;VmRebuildParams&gt;**](VmRebuildParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="recoverVmFromRecycleBin"></a>
# **recoverVmFromRecycleBin**
> List&lt;InlineResponse200&gt; recoverVmFromRecycleBin(contentLanguage, vmOperateParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmOperateParams vmOperateParams = new VmOperateParams(); // VmOperateParams | 
    try {
      List<InlineResponse200> result = apiInstance.recoverVmFromRecycleBin(contentLanguage, vmOperateParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#recoverVmFromRecycleBin");
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
 **vmOperateParams** | [**VmOperateParams**](VmOperateParams.md)|  |

### Return type

[**List&lt;InlineResponse200&gt;**](InlineResponse200.md)

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

<a name="removeVmCdRom"></a>
# **removeVmCdRom**
> List&lt;WithTaskVm&gt; removeVmCdRom(contentLanguage, vmRemoveCdRomParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmRemoveCdRomParams vmRemoveCdRomParams = new VmRemoveCdRomParams(); // VmRemoveCdRomParams | 
    try {
      List<WithTaskVm> result = apiInstance.removeVmCdRom(contentLanguage, vmRemoveCdRomParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#removeVmCdRom");
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
 **vmRemoveCdRomParams** | [**VmRemoveCdRomParams**](VmRemoveCdRomParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="removeVmDisk"></a>
# **removeVmDisk**
> List&lt;WithTaskVm&gt; removeVmDisk(contentLanguage, vmRemoveDiskParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmRemoveDiskParams vmRemoveDiskParams = new VmRemoveDiskParams(); // VmRemoveDiskParams | 
    try {
      List<WithTaskVm> result = apiInstance.removeVmDisk(contentLanguage, vmRemoveDiskParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#removeVmDisk");
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
 **vmRemoveDiskParams** | [**VmRemoveDiskParams**](VmRemoveDiskParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="removeVmNic"></a>
# **removeVmNic**
> List&lt;WithTaskVm&gt; removeVmNic(contentLanguage, vmRemoveNicParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmRemoveNicParams vmRemoveNicParams = new VmRemoveNicParams(); // VmRemoveNicParams | 
    try {
      List<WithTaskVm> result = apiInstance.removeVmNic(contentLanguage, vmRemoveNicParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#removeVmNic");
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
 **vmRemoveNicParams** | [**VmRemoveNicParams**](VmRemoveNicParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="removeVmToFolder"></a>
# **removeVmToFolder**
> List&lt;WithTaskVm&gt; removeVmToFolder(contentLanguage, vmOperateParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmOperateParams vmOperateParams = new VmOperateParams(); // VmOperateParams | 
    try {
      List<WithTaskVm> result = apiInstance.removeVmToFolder(contentLanguage, vmOperateParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#removeVmToFolder");
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
 **vmOperateParams** | [**VmOperateParams**](VmOperateParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="restartVm"></a>
# **restartVm**
> List&lt;WithTaskVm&gt; restartVm(contentLanguage, vmOperateParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmOperateParams vmOperateParams = new VmOperateParams(); // VmOperateParams | 
    try {
      List<WithTaskVm> result = apiInstance.restartVm(contentLanguage, vmOperateParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#restartVm");
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
 **vmOperateParams** | [**VmOperateParams**](VmOperateParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="resumeVm"></a>
# **resumeVm**
> List&lt;WithTaskVm&gt; resumeVm(contentLanguage, vmOperateParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmOperateParams vmOperateParams = new VmOperateParams(); // VmOperateParams | 
    try {
      List<WithTaskVm> result = apiInstance.resumeVm(contentLanguage, vmOperateParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#resumeVm");
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
 **vmOperateParams** | [**VmOperateParams**](VmOperateParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="rollbackVm"></a>
# **rollbackVm**
> List&lt;WithTaskVm&gt; rollbackVm(contentLanguage, vmRollbackParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmRollbackParams vmRollbackParams = new VmRollbackParams(); // VmRollbackParams | 
    try {
      List<WithTaskVm> result = apiInstance.rollbackVm(contentLanguage, vmRollbackParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#rollbackVm");
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
 **vmRollbackParams** | [**VmRollbackParams**](VmRollbackParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="shutDownVm"></a>
# **shutDownVm**
> List&lt;WithTaskVm&gt; shutDownVm(contentLanguage, vmOperateParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmOperateParams vmOperateParams = new VmOperateParams(); // VmOperateParams | 
    try {
      List<WithTaskVm> result = apiInstance.shutDownVm(contentLanguage, vmOperateParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#shutDownVm");
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
 **vmOperateParams** | [**VmOperateParams**](VmOperateParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="startVm"></a>
# **startVm**
> List&lt;WithTaskVm&gt; startVm(contentLanguage, vmStartParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmStartParams vmStartParams = new VmStartParams(); // VmStartParams | 
    try {
      List<WithTaskVm> result = apiInstance.startVm(contentLanguage, vmStartParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#startVm");
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
 **vmStartParams** | [**VmStartParams**](VmStartParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="suspendVm"></a>
# **suspendVm**
> List&lt;WithTaskVm&gt; suspendVm(contentLanguage, vmOperateParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmOperateParams vmOperateParams = new VmOperateParams(); // VmOperateParams | 
    try {
      List<WithTaskVm> result = apiInstance.suspendVm(contentLanguage, vmOperateParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#suspendVm");
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
 **vmOperateParams** | [**VmOperateParams**](VmOperateParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="updateVm"></a>
# **updateVm**
> List&lt;WithTaskVm&gt; updateVm(contentLanguage, vmUpdateParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmUpdateParams vmUpdateParams = new VmUpdateParams(); // VmUpdateParams | 
    try {
      List<WithTaskVm> result = apiInstance.updateVm(contentLanguage, vmUpdateParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#updateVm");
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
 **vmUpdateParams** | [**VmUpdateParams**](VmUpdateParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="updateVmDisk"></a>
# **updateVmDisk**
> List&lt;WithTaskVm&gt; updateVmDisk(contentLanguage, vmUpdateDiskParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmUpdateDiskParams vmUpdateDiskParams = new VmUpdateDiskParams(); // VmUpdateDiskParams | 
    try {
      List<WithTaskVm> result = apiInstance.updateVmDisk(contentLanguage, vmUpdateDiskParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#updateVmDisk");
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
 **vmUpdateDiskParams** | [**VmUpdateDiskParams**](VmUpdateDiskParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

<a name="updateVmNic"></a>
# **updateVmNic**
> List&lt;WithTaskVm&gt; updateVmNic(contentLanguage, vmUpdateNicParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.VmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    VmApi apiInstance = new VmApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    VmUpdateNicParams vmUpdateNicParams = new VmUpdateNicParams(); // VmUpdateNicParams | 
    try {
      List<WithTaskVm> result = apiInstance.updateVmNic(contentLanguage, vmUpdateNicParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VmApi#updateVmNic");
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
 **vmUpdateNicParams** | [**VmUpdateNicParams**](VmUpdateNicParams.md)|  |

### Return type

[**List&lt;WithTaskVm&gt;**](WithTaskVm.md)

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

