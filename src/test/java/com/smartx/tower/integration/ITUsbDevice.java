package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.UsbDeviceApi;
import com.smartx.tower.model.*;

public class ITUsbDevice extends ITBase {
  UsbDeviceApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "usbDevicePayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new UsbDeviceApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/UsbDevice.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "usbDevicePayload")
  public void getUsbDevices(String payload) {
    try {
      // parse params from json payload
      GetUsbDevicesRequestBody params = gson.fromJson(payload, new TypeToken<GetUsbDevicesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<UsbDevice> result = api.getUsbDevices(params);
      assertThat(result).as("check result of getUsbDevices").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "usbDevicePayload")
  public void getUsbDevicesConnection(String payload) {
    try {
      // parse params from json payload
      GetUsbDevicesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetUsbDevicesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      UsbDeviceConnection result = api.getUsbDevicesConnection(params);
      assertThat(result).as("check result of getUsbDevicesConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "usbDevicePayload")
  public void mountUsbDevice(String payload) {
    try {
      // parse params from json payload
      UsbDeviceMountParams params = gson.fromJson(payload, new TypeToken<UsbDeviceMountParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskUsbDevice> result = api.mountUsbDevice(params);
      assertThat(result).as("check result of mountUsbDevice").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "usbDevicePayload")
  public void unmountUsbDevice(String payload) {
    try {
      // parse params from json payload
      UsbDeviceUnmountParams params = gson.fromJson(payload, new TypeToken<UsbDeviceUnmountParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskUsbDevice> result = api.unmountUsbDevice(params);
      assertThat(result).as("check result of unmountUsbDevice").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
