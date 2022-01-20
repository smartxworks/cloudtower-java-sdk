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
import com.smartx.tower.api.GraphApi;
import com.smartx.tower.model.*;

public class ITGraph extends ITBase {
  GraphApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "graphPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new GraphApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Graph.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "graphPayload")
  public void createGraph(String payload) {
    try {
      // parse params from json payload
      List<GraphCreationParams> params = gson.fromJson(payload, new TypeToken<List<GraphCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskGraph> result = api.createGraph(params, contentLanguage);
      assertThat(result).as("check result of createGraph").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "graphPayload")
  public void deleteGraph(String payload) {
    try {
      // parse params from json payload
      GraphDeletionParams params = gson.fromJson(payload, new TypeToken<GraphDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteGraph> result = api.deleteGraph(params, contentLanguage);
      assertThat(result).as("check result of deleteGraph").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "graphPayload")
  public void getGraphs(String payload) {
    try {
      // parse params from json payload
      GetGraphsRequestBody params = gson.fromJson(payload, new TypeToken<GetGraphsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<Graph> result = api.getGraphs(params, contentLanguage);
      assertThat(result).as("check result of getGraphs").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "graphPayload")
  public void getGraphsConnection(String payload) {
    try {
      // parse params from json payload
      GetGraphsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetGraphsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      GraphConnection result = api.getGraphsConnection(params, contentLanguage);
      assertThat(result).as("check result of getGraphsConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "graphPayload")
  public void updateGraph(String payload) {
    try {
      // parse params from json payload
      GraphUpdationParams params = gson.fromJson(payload, new TypeToken<GraphUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskGraph> result = api.updateGraph(params, contentLanguage);
      assertThat(result).as("check result of updateGraph").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
