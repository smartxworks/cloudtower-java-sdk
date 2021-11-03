package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.EverouteClusterApi;
import com.smartx.tower.model.*;

public class ITEverouteCluster extends IT {
  EverouteClusterApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new EverouteClusterApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/EverouteCluster.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getEverouteClusters(String payload) {
    try {
      // parse params from json payload
      GetEverouteClustersRequestBody params = gson.fromJson(payload, GetEverouteClustersRequestBody.class);
      // do some modify to params(optional)
      List<EverouteCluster> result = api.getEverouteClusters("zh-CN", params);
      assertThat(result).as("check result of getEverouteClusters").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getEverouteClustersConnection(String payload) {
    try {
      // parse params from json payload
      GetEverouteClustersConnectionRequestBody params = gson.fromJson(payload, GetEverouteClustersConnectionRequestBody.class);
      // do some modify to params(optional)
      EverouteClusterConnection result = api.getEverouteClustersConnection("zh-CN", params);
      assertThat(result).as("check result of getEverouteClustersConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
