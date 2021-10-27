# UsbDeviceApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsbDevices**](UsbDeviceApi.md#getUsbDevices) | **POST** /get-usb-devices | 
[**getUsbDevicesWithHttpInfo**](UsbDeviceApi.md#getUsbDevicesWithHttpInfo) | **POST** /get-usb-devices | 
[**getUsbDevicesConnection**](UsbDeviceApi.md#getUsbDevicesConnection) | **POST** /get-usb-devices-connection | 
[**getUsbDevicesConnectionWithHttpInfo**](UsbDeviceApi.md#getUsbDevicesConnectionWithHttpInfo) | **POST** /get-usb-devices-connection | 
[**mountUsbDevice**](UsbDeviceApi.md#mountUsbDevice) | **POST** /mount-usb-device | 
[**mountUsbDeviceWithHttpInfo**](UsbDeviceApi.md#mountUsbDeviceWithHttpInfo) | **POST** /mount-usb-device | 
[**unmountUsbDevice**](UsbDeviceApi.md#unmountUsbDevice) | **POST** /unmount-usb-device | 
[**unmountUsbDeviceWithHttpInfo**](UsbDeviceApi.md#unmountUsbDeviceWithHttpInfo) | **POST** /unmount-usb-device | 



## getUsbDevices

> List<UsbDevice> getUsbDevices(contentLanguage, getUsbDevicesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UsbDeviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        UsbDeviceApi apiInstance = new UsbDeviceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetUsbDevicesRequestBody getUsbDevicesRequestBody = new GetUsbDevicesRequestBody(); // GetUsbDevicesRequestBody | 
        try {
            List<UsbDevice> result = apiInstance.getUsbDevices(contentLanguage, getUsbDevicesRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsbDeviceApi#getUsbDevices");
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
 **getUsbDevicesRequestBody** | [**GetUsbDevicesRequestBody**](GetUsbDevicesRequestBody.md)|  |

### Return type

[**List&lt;UsbDevice&gt;**](UsbDevice.md)


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

## getUsbDevicesWithHttpInfo

> ApiResponse<List<UsbDevice>> getUsbDevices getUsbDevicesWithHttpInfo(contentLanguage, getUsbDevicesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UsbDeviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        UsbDeviceApi apiInstance = new UsbDeviceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetUsbDevicesRequestBody getUsbDevicesRequestBody = new GetUsbDevicesRequestBody(); // GetUsbDevicesRequestBody | 
        try {
            ApiResponse<List<UsbDevice>> response = apiInstance.getUsbDevicesWithHttpInfo(contentLanguage, getUsbDevicesRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UsbDeviceApi#getUsbDevices");
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
 **getUsbDevicesRequestBody** | [**GetUsbDevicesRequestBody**](GetUsbDevicesRequestBody.md)|  |

### Return type

ApiResponse<[**List&lt;UsbDevice&gt;**](UsbDevice.md)>


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


## getUsbDevicesConnection

> UsbDeviceConnection getUsbDevicesConnection(contentLanguage, getUsbDevicesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UsbDeviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        UsbDeviceApi apiInstance = new UsbDeviceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetUsbDevicesConnectionRequestBody getUsbDevicesConnectionRequestBody = new GetUsbDevicesConnectionRequestBody(); // GetUsbDevicesConnectionRequestBody | 
        try {
            UsbDeviceConnection result = apiInstance.getUsbDevicesConnection(contentLanguage, getUsbDevicesConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsbDeviceApi#getUsbDevicesConnection");
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
 **getUsbDevicesConnectionRequestBody** | [**GetUsbDevicesConnectionRequestBody**](GetUsbDevicesConnectionRequestBody.md)|  |

### Return type

[**UsbDeviceConnection**](UsbDeviceConnection.md)


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

## getUsbDevicesConnectionWithHttpInfo

> ApiResponse<UsbDeviceConnection> getUsbDevicesConnection getUsbDevicesConnectionWithHttpInfo(contentLanguage, getUsbDevicesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UsbDeviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        UsbDeviceApi apiInstance = new UsbDeviceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetUsbDevicesConnectionRequestBody getUsbDevicesConnectionRequestBody = new GetUsbDevicesConnectionRequestBody(); // GetUsbDevicesConnectionRequestBody | 
        try {
            ApiResponse<UsbDeviceConnection> response = apiInstance.getUsbDevicesConnectionWithHttpInfo(contentLanguage, getUsbDevicesConnectionRequestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UsbDeviceApi#getUsbDevicesConnection");
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
 **getUsbDevicesConnectionRequestBody** | [**GetUsbDevicesConnectionRequestBody**](GetUsbDevicesConnectionRequestBody.md)|  |

### Return type

ApiResponse<[**UsbDeviceConnection**](UsbDeviceConnection.md)>


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


## mountUsbDevice

> List<WithTaskUsbDevice> mountUsbDevice(contentLanguage, usbDeviceMountParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UsbDeviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        UsbDeviceApi apiInstance = new UsbDeviceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        UsbDeviceMountParams usbDeviceMountParams = new UsbDeviceMountParams(); // UsbDeviceMountParams | 
        try {
            List<WithTaskUsbDevice> result = apiInstance.mountUsbDevice(contentLanguage, usbDeviceMountParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsbDeviceApi#mountUsbDevice");
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
 **usbDeviceMountParams** | [**UsbDeviceMountParams**](UsbDeviceMountParams.md)|  |

### Return type

[**List&lt;WithTaskUsbDevice&gt;**](WithTaskUsbDevice.md)


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

## mountUsbDeviceWithHttpInfo

> ApiResponse<List<WithTaskUsbDevice>> mountUsbDevice mountUsbDeviceWithHttpInfo(contentLanguage, usbDeviceMountParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UsbDeviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        UsbDeviceApi apiInstance = new UsbDeviceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        UsbDeviceMountParams usbDeviceMountParams = new UsbDeviceMountParams(); // UsbDeviceMountParams | 
        try {
            ApiResponse<List<WithTaskUsbDevice>> response = apiInstance.mountUsbDeviceWithHttpInfo(contentLanguage, usbDeviceMountParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UsbDeviceApi#mountUsbDevice");
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
 **usbDeviceMountParams** | [**UsbDeviceMountParams**](UsbDeviceMountParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskUsbDevice&gt;**](WithTaskUsbDevice.md)>


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


## unmountUsbDevice

> List<WithTaskUsbDevice> unmountUsbDevice(contentLanguage, usbDeviceUnmountParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UsbDeviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        UsbDeviceApi apiInstance = new UsbDeviceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        UsbDeviceUnmountParams usbDeviceUnmountParams = new UsbDeviceUnmountParams(); // UsbDeviceUnmountParams | 
        try {
            List<WithTaskUsbDevice> result = apiInstance.unmountUsbDevice(contentLanguage, usbDeviceUnmountParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsbDeviceApi#unmountUsbDevice");
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
 **usbDeviceUnmountParams** | [**UsbDeviceUnmountParams**](UsbDeviceUnmountParams.md)|  |

### Return type

[**List&lt;WithTaskUsbDevice&gt;**](WithTaskUsbDevice.md)


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

## unmountUsbDeviceWithHttpInfo

> ApiResponse<List<WithTaskUsbDevice>> unmountUsbDevice unmountUsbDeviceWithHttpInfo(contentLanguage, usbDeviceUnmountParams)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.UsbDeviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        UsbDeviceApi apiInstance = new UsbDeviceApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        UsbDeviceUnmountParams usbDeviceUnmountParams = new UsbDeviceUnmountParams(); // UsbDeviceUnmountParams | 
        try {
            ApiResponse<List<WithTaskUsbDevice>> response = apiInstance.unmountUsbDeviceWithHttpInfo(contentLanguage, usbDeviceUnmountParams);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UsbDeviceApi#unmountUsbDevice");
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
 **usbDeviceUnmountParams** | [**UsbDeviceUnmountParams**](UsbDeviceUnmountParams.md)|  |

### Return type

ApiResponse<[**List&lt;WithTaskUsbDevice&gt;**](WithTaskUsbDevice.md)>


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

