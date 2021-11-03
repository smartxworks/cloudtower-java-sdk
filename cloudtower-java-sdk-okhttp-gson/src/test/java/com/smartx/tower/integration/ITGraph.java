package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.GraphApi;
import com.smartx.tower.model.*;

public class ITGraph extends IT {
  GraphApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getGraphs(String payload) {
    try {
      // parse params from json payload
      GetGraphsRequestBody params = gson.fromJson(payload, GetGraphsRequestBody.class);
      // do some modify to params(optional)
      List<Graph> result = api.getGraphs("zh-CN", params);
      assertThat(result).as("check result of getGraphs").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getGraphsConnection(String payload) {
    try {
      // parse params from json payload
      GetGraphsConnectionRequestBody params = gson.fromJson(payload, GetGraphsConnectionRequestBody.class);
      // do some modify to params(optional)
      GraphConnection result = api.getGraphsConnection("zh-CN", params);
      assertThat(result).as("check result of getGraphsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createGraph(String payload) {
    try {
      // parse params from json payload
      List<GraphCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskGraph> result = api.createGraph("zh-CN", params);
      assertThat(result).as("check result of createGraph").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateGraph(String payload) {
    try {
      // parse params from json payload
      GraphUpdationParams params = gson.fromJson(payload, GraphUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskGraph> result = api.updateGraph("zh-CN", params);
      assertThat(result).as("check result of updateGraph").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteGraph(String payload) {
    try {
      // parse params from json payload
      GraphDeletionParams params = gson.fromJson(payload, GraphDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteGraph> result = api.deleteGraph("zh-CN", params);
      assertThat(result).as("check result of deleteGraph").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
