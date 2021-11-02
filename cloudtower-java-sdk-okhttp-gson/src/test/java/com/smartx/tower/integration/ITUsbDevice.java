package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.UsbDeviceApi;
import com.smartx.tower.model.*;

public class ITUsbDevice extends IT {
  UsbDeviceApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getUsbDevices(String payload) {
    try {
      // parse params from json payload
      GetUsbDevicesRequestBody params = gson.fromJson(payload, GetUsbDevicesRequestBody.class);
      // do some modify to params(optional)
      List<UsbDevice> result = api.getUsbDevices("zh-CN", params);
      assertThat(result).as("check result of getUsbDevices").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getUsbDevicesConnection(String payload) {
    try {
      // parse params from json payload
      GetUsbDevicesConnectionRequestBody params = gson.fromJson(payload, GetUsbDevicesConnectionRequestBody.class);
      // do some modify to params(optional)
      UsbDeviceConnection result = api.getUsbDevicesConnection("zh-CN", params);
      assertThat(result).as("check result of getUsbDevicesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void mountUsbDevice(String payload) {
    try {
      // parse params from json payload
      UsbDeviceMountParams params = gson.fromJson(payload, UsbDeviceMountParams.class);
      // do some modify to params(optional)
      List<WithTaskUsbDevice> result = api.mountUsbDevice("zh-CN", params);
      assertThat(result).as("check result of mountUsbDevice").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void unmountUsbDevice(String payload) {
    try {
      // parse params from json payload
      UsbDeviceUnmountParams params = gson.fromJson(payload, UsbDeviceUnmountParams.class);
      // do some modify to params(optional)
      List<WithTaskUsbDevice> result = api.unmountUsbDevice("zh-CN", params);
      assertThat(result).as("check result of unmountUsbDevice").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
