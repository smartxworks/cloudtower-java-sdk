package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetUsbDevicesConnectionRequestBody;
import com.smartx.tower.model.GetUsbDevicesRequestBody;
import com.smartx.tower.model.UsbDevice;
import com.smartx.tower.model.UsbDeviceConnection;
import com.smartx.tower.model.UsbDeviceMountParams;
import com.smartx.tower.model.UsbDeviceUnmountParams;
import com.smartx.tower.model.WithTaskUsbDevice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UsbDeviceApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getUsbDevicesRequestBody  (required)
   * @return Call&lt;List&lt;UsbDevice&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-usb-devices")
  Call<List<UsbDevice>> getUsbDevices(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetUsbDevicesRequestBody getUsbDevicesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getUsbDevicesConnectionRequestBody  (required)
   * @return Call&lt;UsbDeviceConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-usb-devices-connection")
  Call<UsbDeviceConnection> getUsbDevicesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetUsbDevicesConnectionRequestBody getUsbDevicesConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param usbDeviceMountParams  (required)
   * @return Call&lt;List&lt;WithTaskUsbDevice&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("mount-usb-device")
  Call<List<WithTaskUsbDevice>> mountUsbDevice(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body UsbDeviceMountParams usbDeviceMountParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param usbDeviceUnmountParams  (required)
   * @return Call&lt;List&lt;WithTaskUsbDevice&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("unmount-usb-device")
  Call<List<WithTaskUsbDevice>> unmountUsbDevice(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body UsbDeviceUnmountParams usbDeviceUnmountParams
  );

}
