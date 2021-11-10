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
import com.smartx.tower.api.IscsiTargetApi;
import com.smartx.tower.model.*;

public class ITIscsiTarget extends ITBase {
  IscsiTargetApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "iscsiTargetPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new IscsiTargetApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/IscsiTarget.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "iscsiTargetPayload")
  public void createIscsiTarget(String payload) {
    try {
      // parse params from json payload
      List<IscsiTargetCreationParams> params = gson.fromJson(payload, new TypeToken<List<IscsiTargetCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskIscsiTarget> result = api.createIscsiTarget(params, contentLanguage);
      assertThat(result).as("check result of createIscsiTarget").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "iscsiTargetPayload")
  public void deleteIscsiTarget(String payload) {
    try {
      // parse params from json payload
      IscsiTargetDeletionParams params = gson.fromJson(payload, new TypeToken<IscsiTargetDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteIscsiTarget> result = api.deleteIscsiTarget(params, contentLanguage);
      assertThat(result).as("check result of deleteIscsiTarget").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "iscsiTargetPayload")
  public void getIscsiTargets(String payload) {
    try {
      // parse params from json payload
      GetIscsiTargetsRequestBody params = gson.fromJson(payload, new TypeToken<GetIscsiTargetsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<IscsiTarget> result = api.getIscsiTargets(params, contentLanguage);
      assertThat(result).as("check result of getIscsiTargets").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "iscsiTargetPayload")
  public void getIscsiTargetsConnection(String payload) {
    try {
      // parse params from json payload
      GetIscsiTargetsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetIscsiTargetsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      IscsiTargetConnection result = api.getIscsiTargetsConnection(params, contentLanguage);
      assertThat(result).as("check result of getIscsiTargetsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "iscsiTargetPayload")
  public void updateIscsiTarget(String payload) {
    try {
      // parse params from json payload
      IscsiTargetUpdationParams params = gson.fromJson(payload, new TypeToken<IscsiTargetUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskIscsiTarget> result = api.updateIscsiTarget(params, contentLanguage);
      assertThat(result).as("check result of updateIscsiTarget").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
