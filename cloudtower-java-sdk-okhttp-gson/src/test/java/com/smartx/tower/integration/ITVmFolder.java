package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.VmFolderApi;
import com.smartx.tower.model.*;

public class ITVmFolder extends IT {
  VmFolderApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new VmFolderApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/VmFolder.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getVmFolders(String payload) {
    try {
      // parse params from json payload
      GetVmFoldersRequestBody params = gson.fromJson(payload, GetVmFoldersRequestBody.class);
      // do some modify to params(optional)
      List<VmFolder> result = api.getVmFolders("zh-CN", params);
      assertThat(result).as("check result of getVmFolders").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getVmFoldersConnection(String payload) {
    try {
      // parse params from json payload
      GetVmFoldersConnectionRequestBody params = gson.fromJson(payload, GetVmFoldersConnectionRequestBody.class);
      // do some modify to params(optional)
      VmFolderConnection result = api.getVmFoldersConnection("zh-CN", params);
      assertThat(result).as("check result of getVmFoldersConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createVmFolder(String payload) {
    try {
      // parse params from json payload
      List<VmFolderCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskVmFolder> result = api.createVmFolder("zh-CN", params);
      assertThat(result).as("check result of createVmFolder").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateVmFolder(String payload) {
    try {
      // parse params from json payload
      VmFolderUpdationParams params = gson.fromJson(payload, VmFolderUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskVmFolder> result = api.updateVmFolder("zh-CN", params);
      assertThat(result).as("check result of updateVmFolder").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteVmFolder(String payload) {
    try {
      // parse params from json payload
      VmFolderDeletionParams params = gson.fromJson(payload, VmFolderDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteVmFolder> result = api.deleteVmFolder("zh-CN", params);
      assertThat(result).as("check result of deleteVmFolder").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
