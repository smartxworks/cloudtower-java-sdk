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
import com.smartx.tower.api.NvmfNamespaceApi;
import com.smartx.tower.model.*;

public class ITNvmfNamespace extends ITBase {
  NvmfNamespaceApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "nvmfNamespacePayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new NvmfNamespaceApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/NvmfNamespace.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "nvmfNamespacePayload")
  public void cloneNvmfNamespaceFromSnapshot(String payload) {
    try {
      // parse params from json payload
      List<NvmfNamespaceCloneParams> params = gson.fromJson(payload, new TypeToken<List<NvmfNamespaceCloneParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskNvmfNamespace> result = api.cloneNvmfNamespaceFromSnapshot(params, contentLanguage);
      assertThat(result).as("check result of cloneNvmfNamespaceFromSnapshot").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "nvmfNamespacePayload")
  public void createNvmfNamespace(String payload) {
    try {
      // parse params from json payload
      List<NvmfNamespaceCreationParams> params = gson.fromJson(payload, new TypeToken<List<NvmfNamespaceCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskNvmfNamespace> result = api.createNvmfNamespace(params, contentLanguage);
      assertThat(result).as("check result of createNvmfNamespace").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "nvmfNamespacePayload")
  public void deleteNvmfNamespace(String payload) {
    try {
      // parse params from json payload
      NvmfNamespaceDeletionParams params = gson.fromJson(payload, new TypeToken<NvmfNamespaceDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteNvmfNamespace> result = api.deleteNvmfNamespace(params, contentLanguage);
      assertThat(result).as("check result of deleteNvmfNamespace").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "nvmfNamespacePayload")
  public void getNvmfNamespaces(String payload) {
    try {
      // parse params from json payload
      GetNvmfNamespacesRequestBody params = gson.fromJson(payload, new TypeToken<GetNvmfNamespacesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<NvmfNamespace> result = api.getNvmfNamespaces(params, contentLanguage);
      assertThat(result).as("check result of getNvmfNamespaces").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "nvmfNamespacePayload")
  public void getNvmfNamespacesConnection(String payload) {
    try {
      // parse params from json payload
      GetNvmfNamespacesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetNvmfNamespacesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      NvmfNamespaceConnection result = api.getNvmfNamespacesConnection(params, contentLanguage);
      assertThat(result).as("check result of getNvmfNamespacesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "nvmfNamespacePayload")
  public void rollbackNvmfNamespaceFromSnapshot(String payload) {
    try {
      // parse params from json payload
      List<NvmfNamespaceRollbackParams> params = gson.fromJson(payload, new TypeToken<List<NvmfNamespaceRollbackParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskNvmfNamespace> result = api.rollbackNvmfNamespaceFromSnapshot(params, contentLanguage);
      assertThat(result).as("check result of rollbackNvmfNamespaceFromSnapshot").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "nvmfNamespacePayload")
  public void updateNvmfNamespace(String payload) {
    try {
      // parse params from json payload
      NvmfNamespaceUpdationParams params = gson.fromJson(payload, new TypeToken<NvmfNamespaceUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskNvmfNamespace> result = api.updateNvmfNamespace(params, contentLanguage);
      assertThat(result).as("check result of updateNvmfNamespace").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
