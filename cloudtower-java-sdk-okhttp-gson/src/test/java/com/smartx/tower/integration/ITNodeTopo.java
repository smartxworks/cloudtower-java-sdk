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
import com.smartx.tower.api.NodeTopoApi;
import com.smartx.tower.model.*;

public class ITNodeTopo extends ITBase {
  NodeTopoApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "nodeTopoPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new NodeTopoApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/NodeTopo.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "nodeTopoPayload")
  public void getNodeTopoes(String payload) {
    try {
      // parse params from json payload
      GetNodeTopoesRequestBody params = gson.fromJson(payload, new TypeToken<GetNodeTopoesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<NodeTopo> result = api.getNodeTopoes(params, contentLanguage);
      assertThat(result).as("check result of getNodeTopoes").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "nodeTopoPayload")
  public void getNodeTopoesConnection(String payload) {
    try {
      // parse params from json payload
      GetNodeTopoesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetNodeTopoesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      NodeTopoConnection result = api.getNodeTopoesConnection(params, contentLanguage);
      assertThat(result).as("check result of getNodeTopoesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "nodeTopoPayload")
  public void updateNodeTopo(String payload) {
    try {
      // parse params from json payload
      List<Object> params = gson.fromJson(payload, new TypeToken<List<Object>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskNodeTopo> result = api.updateNodeTopo(params, contentLanguage);
      assertThat(result).as("check result of updateNodeTopo").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
