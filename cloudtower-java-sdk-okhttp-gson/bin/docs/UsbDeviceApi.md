# UsbDeviceApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsbDevices**](UsbDeviceApi.md#getUsbDevices) | **POST** /get-usb-devices | 
[**getUsbDevicesConnection**](UsbDeviceApi.md#getUsbDevicesConnection) | **POST** /get-usb-devices-connection | 
[**mountUsbDevice**](UsbDeviceApi.md#mountUsbDevice) | **POST** /mount-usb-device | 
[**unmountUsbDevice**](UsbDeviceApi.md#unmountUsbDevice) | **POST** /unmount-usb-device | 


<a name="getUsbDevices"></a>
# **getUsbDevices**
> List&lt;UsbDevice&gt; getUsbDevices(getUsbDevicesRequestBody, contentLanguage)



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
    GetUsbDevicesRequestBody getUsbDevicesRequestBody = new GetUsbDevicesRequestBody(); // GetUsbDevicesRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<UsbDevice> result = apiInstance.getUsbDevices(getUsbDevicesRequestBody, contentLanguage);
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
 **getUsbDevicesRequestBody** | [**GetUsbDevicesRequestBody**](GetUsbDevicesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
**200** | Ok |  -  |
**400** |  |  -  |

<a name="getUsbDevicesConnection"></a>
# **getUsbDevicesConnection**
> UsbDeviceConnection getUsbDevicesConnection(getUsbDevicesConnectionRequestBody, contentLanguage)



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
    GetUsbDevicesConnectionRequestBody getUsbDevicesConnectionRequestBody = new GetUsbDevicesConnectionRequestBody(); // GetUsbDevicesConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      UsbDeviceConnection result = apiInstance.getUsbDevicesConnection(getUsbDevicesConnectionRequestBody, contentLanguage);
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
 **getUsbDevicesConnectionRequestBody** | [**GetUsbDevicesConnectionRequestBody**](GetUsbDevicesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
**200** | Ok |  -  |
**400** |  |  -  |

<a name="mountUsbDevice"></a>
# **mountUsbDevice**
> List&lt;WithTaskUsbDevice&gt; mountUsbDevice(usbDeviceMountParams, contentLanguage)



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
    UsbDeviceMountParams usbDeviceMountParams = new UsbDeviceMountParams(); // UsbDeviceMountParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskUsbDevice> result = apiInstance.mountUsbDevice(usbDeviceMountParams, contentLanguage);
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
 **usbDeviceMountParams** | [**UsbDeviceMountParams**](UsbDeviceMountParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
**200** | Ok |  -  |
**400** |  |  -  |

<a name="unmountUsbDevice"></a>
# **unmountUsbDevice**
> List&lt;WithTaskUsbDevice&gt; unmountUsbDevice(usbDeviceUnmountParams, contentLanguage)



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
    UsbDeviceUnmountParams usbDeviceUnmountParams = new UsbDeviceUnmountParams(); // UsbDeviceUnmountParams | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<WithTaskUsbDevice> result = apiInstance.unmountUsbDevice(usbDeviceUnmountParams, contentLanguage);
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
 **usbDeviceUnmountParams** | [**UsbDeviceUnmountParams**](UsbDeviceUnmountParams.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

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
**200** | Ok |  -  |
**400** |  |  -  |

