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
import com.smartx.tower.api.ViewApi;
import com.smartx.tower.model.*;

public class ITView extends ITBase {
  ViewApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "viewPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new ViewApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/View.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "viewPayload")
  public void createView(String payload) {
    try {
      // parse params from json payload
      List<ViewCreationParams> params = gson.fromJson(payload, new TypeToken<List<ViewCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskView> result = api.createView(params);
      assertThat(result).as("check result of createView").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "viewPayload")
  public void deleteView(String payload) {
    try {
      // parse params from json payload
      ViewDeletionParams params = gson.fromJson(payload, new TypeToken<ViewDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteView> result = api.deleteView(params);
      assertThat(result).as("check result of deleteView").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "viewPayload")
  public void getViews(String payload) {
    try {
      // parse params from json payload
      GetViewsRequestBody params = gson.fromJson(payload, new TypeToken<GetViewsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<View> result = api.getViews(params);
      assertThat(result).as("check result of getViews").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "viewPayload")
  public void getViewsConnection(String payload) {
    try {
      // parse params from json payload
      GetViewsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetViewsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      ViewConnection result = api.getViewsConnection(params);
      assertThat(result).as("check result of getViewsConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "viewPayload")
  public void updateView(String payload) {
    try {
      // parse params from json payload
      ViewUpdationParams params = gson.fromJson(payload, new TypeToken<ViewUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskView> result = api.updateView(params);
      assertThat(result).as("check result of updateView").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
