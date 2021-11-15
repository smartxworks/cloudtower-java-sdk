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
import com.smartx.tower.api.LabelApi;
import com.smartx.tower.model.*;

public class ITLabel extends ITBase {
  LabelApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "labelPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new LabelApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Label.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "labelPayload")
  public void addLabelsToResources(String payload) {
    try {
      // parse params from json payload
      AddLabelsToResourcesParams params = gson.fromJson(payload, new TypeToken<AddLabelsToResourcesParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskLabel> result = api.addLabelsToResources(params, contentLanguage);
      assertThat(result).as("check result of addLabelsToResources").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "labelPayload")
  public void createLabel(String payload) {
    try {
      // parse params from json payload
      List<LabelCreationParams> params = gson.fromJson(payload, new TypeToken<List<LabelCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskLabel> result = api.createLabel(params, contentLanguage);
      assertThat(result).as("check result of createLabel").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "labelPayload")
  public void deleteLabel(String payload) {
    try {
      // parse params from json payload
      LabelDeletionParams params = gson.fromJson(payload, new TypeToken<LabelDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteLabel> result = api.deleteLabel(params, contentLanguage);
      assertThat(result).as("check result of deleteLabel").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "labelPayload")
  public void getLabels(String payload) {
    try {
      // parse params from json payload
      GetLabelsRequestBody params = gson.fromJson(payload, new TypeToken<GetLabelsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<Label> result = api.getLabels(params, contentLanguage);
      assertThat(result).as("check result of getLabels").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "labelPayload")
  public void getLabelsConnection(String payload) {
    try {
      // parse params from json payload
      GetLabelsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetLabelsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      LabelConnection result = api.getLabelsConnection(params, contentLanguage);
      assertThat(result).as("check result of getLabelsConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "labelPayload")
  public void removeLabelsFromResources(String payload) {
    try {
      // parse params from json payload
      AddLabelsToResourcesParams params = gson.fromJson(payload, new TypeToken<AddLabelsToResourcesParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskLabel> result = api.removeLabelsFromResources(params, contentLanguage);
      assertThat(result).as("check result of removeLabelsFromResources").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "labelPayload")
  public void updateLabel(String payload) {
    try {
      // parse params from json payload
      LabelUpdationParams params = gson.fromJson(payload, new TypeToken<LabelUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskLabel> result = api.updateLabel(params, contentLanguage);
      assertThat(result).as("check result of updateLabel").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
