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
import com.smartx.tower.api.VmFolderApi;
import com.smartx.tower.model.*;

public class ITVmFolder extends ITBase {
  VmFolderApi vmFolderApi = null;
  HashMap<String, Object> vmFolderPayloads = new HashMap<>();

  @DataProvider(name = "vmFolderPayload")
  Object[][] data(Method m) {
    Object payload = vmFolderPayloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    vmFolderApi = new VmFolderApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/VmFolder.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    vmFolderPayloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "vmFolderPayload")
  public void createVmFolder(String payload) {
    try {
      // parse params from json payload
      List<VmFolderCreationParams> params = gson.fromJson(payload, new TypeToken<List<VmFolderCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskVmFolder> result = vmFolderApi.createVmFolder(params, contentLanguage);
      assertThat(result).as("check result of createVmFolder").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmFolderPayload")
  public void deleteVmFolder(String payload) {
    try {
      // parse params from json payload
      VmFolderDeletionParams params = gson.fromJson(payload, new TypeToken<VmFolderDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteVmFolder> result = vmFolderApi.deleteVmFolder(params, contentLanguage);
      assertThat(result).as("check result of deleteVmFolder").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmFolderPayload")
  public void getVmFolders(String payload) {
    try {
      // parse params from json payload
      GetVmFoldersRequestBody params = gson.fromJson(payload, new TypeToken<GetVmFoldersRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<VmFolder> result = vmFolderApi.getVmFolders(params, contentLanguage);
      assertThat(result).as("check result of getVmFolders").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmFolderPayload")
  public void getVmFoldersConnection(String payload) {
    try {
      // parse params from json payload
      GetVmFoldersConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetVmFoldersConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      VmFolderConnection result = vmFolderApi.getVmFoldersConnection(params, contentLanguage);
      assertThat(result).as("check result of getVmFoldersConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "vmFolderPayload")
  public void updateVmFolder(String payload) {
    try {
      // parse params from json payload
      VmFolderUpdationParams params = gson.fromJson(payload, new TypeToken<VmFolderUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskVmFolder> result = vmFolderApi.updateVmFolder(params, contentLanguage);
      assertThat(result).as("check result of updateVmFolder").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
