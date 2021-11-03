package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.NodeTopoApi;
import com.smartx.tower.model.*;

public class ITNodeTopo extends IT {
  NodeTopoApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getNodeTopoes(String payload) {
    try {
      // parse params from json payload
      GetNodeTopoesRequestBody params = gson.fromJson(payload, GetNodeTopoesRequestBody.class);
      // do some modify to params(optional)
      List<NodeTopo> result = api.getNodeTopoes("zh-CN", params);
      assertThat(result).as("check result of getNodeTopoes").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getNodeTopoesConnection(String payload) {
    try {
      // parse params from json payload
      GetNodeTopoesConnectionRequestBody params = gson.fromJson(payload, GetNodeTopoesConnectionRequestBody.class);
      // do some modify to params(optional)
      NodeTopoConnection result = api.getNodeTopoesConnection("zh-CN", params);
      assertThat(result).as("check result of getNodeTopoesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateNodeTopo(String payload) {
    try {
      // parse params from json payload
      List<Object> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskNodeTopo> result = api.updateNodeTopo("zh-CN", params);
      assertThat(result).as("check result of updateNodeTopo").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
