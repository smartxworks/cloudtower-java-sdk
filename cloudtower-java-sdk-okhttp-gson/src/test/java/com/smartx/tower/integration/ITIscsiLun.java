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
import com.smartx.tower.api.IscsiLunApi;
import com.smartx.tower.model.*;

public class ITIscsiLun extends ITBase {
  IscsiLunApi api = null;
  HashMap<String, Object> payloads = new HashMap<>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new IscsiLunApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/IscsiLun.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "payload")
  public void cloneIscsiLunFromSnapshot(String payload) {
    try {
      // parse params from json payload
      List<IscsiLunCloneParams> params = gson.fromJson(payload, new TypeToken<List<IscsiLunCloneParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskIscsiLun> result = api.cloneIscsiLunFromSnapshot(params, contentLanguage);
      assertThat(result).as("check result of cloneIscsiLunFromSnapshot").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createIscsiLun(String payload) {
    try {
      // parse params from json payload
      List<IscsiLunCreationParams> params = gson.fromJson(payload, new TypeToken<List<IscsiLunCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskIscsiLun> result = api.createIscsiLun(params, contentLanguage);
      assertThat(result).as("check result of createIscsiLun").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteIscsiLun(String payload) {
    try {
      // parse params from json payload
      IscsiLunDeletionParams params = gson.fromJson(payload, new TypeToken<IscsiLunDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteIscsiLun> result = api.deleteIscsiLun(params, contentLanguage);
      assertThat(result).as("check result of deleteIscsiLun").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getIscsiLuns(String payload) {
    try {
      // parse params from json payload
      GetIscsiLunsRequestBody params = gson.fromJson(payload, new TypeToken<GetIscsiLunsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<IscsiLun> result = api.getIscsiLuns(params, contentLanguage);
      assertThat(result).as("check result of getIscsiLuns").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getIscsiLunsConnection(String payload) {
    try {
      // parse params from json payload
      GetIscsiLunsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetIscsiLunsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      IscsiLunConnection result = api.getIscsiLunsConnection(params, contentLanguage);
      assertThat(result).as("check result of getIscsiLunsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void rollbackIscsiLunFromSnapshot(String payload) {
    try {
      // parse params from json payload
      List<IscsiLunRollbackParams> params = gson.fromJson(payload, new TypeToken<List<IscsiLunRollbackParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskIscsiLun> result = api.rollbackIscsiLunFromSnapshot(params, contentLanguage);
      assertThat(result).as("check result of rollbackIscsiLunFromSnapshot").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateIscsiLun(String payload) {
    try {
      // parse params from json payload
      IscsiLunUpdationParams params = gson.fromJson(payload, new TypeToken<IscsiLunUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskIscsiLun> result = api.updateIscsiLun(params, contentLanguage);
      assertThat(result).as("check result of updateIscsiLun").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
