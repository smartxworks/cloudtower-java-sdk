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
import com.smartx.tower.api.ClusterUpgradeHistoryApi;
import com.smartx.tower.model.*;

public class ITClusterUpgradeHistory extends ITBase {
  ClusterUpgradeHistoryApi api = null;
  HashMap<String, Object> payloads = new HashMap<>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new ClusterUpgradeHistoryApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/ClusterUpgradeHistory.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "payload")
  public void getClusterUpgradeHistories(String payload) {
    try {
      // parse params from json payload
      GetClusterUpgradeHistoriesRequestBody params = gson.fromJson(payload, new TypeToken<GetClusterUpgradeHistoriesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<ClusterUpgradeHistory> result = api.getClusterUpgradeHistories(params, contentLanguage);
      assertThat(result).as("check result of getClusterUpgradeHistories").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getClusterUpgradeHistoriesConnection(String payload) {
    try {
      // parse params from json payload
      GetClusterUpgradeHistoriesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetClusterUpgradeHistoriesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      ClusterUpgradeHistoryConnection result = api.getClusterUpgradeHistoriesConnection(params, contentLanguage);
      assertThat(result).as("check result of getClusterUpgradeHistoriesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
