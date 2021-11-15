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
import com.smartx.tower.api.ClusterTopoApi;
import com.smartx.tower.model.*;

public class ITClusterTopo extends ITBase {
  ClusterTopoApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "clusterTopoPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new ClusterTopoApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/ClusterTopo.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "clusterTopoPayload")
  public void getClusterTopoes(String payload) {
    try {
      // parse params from json payload
      GetClusterTopoesRequestBody params = gson.fromJson(payload, new TypeToken<GetClusterTopoesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<ClusterTopo> result = api.getClusterTopoes(params, contentLanguage);
      assertThat(result).as("check result of getClusterTopoes").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "clusterTopoPayload")
  public void getClusterTopoesConnection(String payload) {
    try {
      // parse params from json payload
      GetClusterTopoesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetClusterTopoesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      ClusterTopoConnection result = api.getClusterTopoesConnection(params, contentLanguage);
      assertThat(result).as("check result of getClusterTopoesConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
