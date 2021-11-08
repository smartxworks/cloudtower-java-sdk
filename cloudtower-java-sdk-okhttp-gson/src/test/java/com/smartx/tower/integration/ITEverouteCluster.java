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
import com.smartx.tower.api.EverouteClusterApi;
import com.smartx.tower.model.*;

public class ITEverouteCluster extends ITBase {
  EverouteClusterApi api = null;
  HashMap<String, Object> payloads = new HashMap<>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "payload")
  public void getEverouteClusters(String payload) {
    try {
      // parse params from json payload
      GetEverouteClustersRequestBody params = gson.fromJson(payload, new TypeToken<GetEverouteClustersRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<EverouteCluster> result = api.getEverouteClusters(params, contentLanguage);
      assertThat(result).as("check result of getEverouteClusters").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getEverouteClustersConnection(String payload) {
    try {
      // parse params from json payload
      GetEverouteClustersConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetEverouteClustersConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      EverouteClusterConnection result = api.getEverouteClustersConnection(params, contentLanguage);
      assertThat(result).as("check result of getEverouteClustersConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
