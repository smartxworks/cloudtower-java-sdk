package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.ClusterUpgradeHistoryApi;
import com.smartx.tower.model.*;

public class ITClusterUpgradeHistory extends IT {
  ClusterUpgradeHistoryApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getClusterUpgradeHistories(String payload) {
    try {
      // parse params from json payload
      GetClusterUpgradeHistoriesRequestBody params = gson.fromJson(payload, GetClusterUpgradeHistoriesRequestBody.class);
      // do some modify to params(optional)
      List<ClusterUpgradeHistory> result = api.getClusterUpgradeHistories("zh-CN", params);
      assertThat(result).as("check result of getClusterUpgradeHistories").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getClusterUpgradeHistoriesConnection(String payload) {
    try {
      // parse params from json payload
      GetClusterUpgradeHistoriesConnectionRequestBody params = gson.fromJson(payload, GetClusterUpgradeHistoriesConnectionRequestBody.class);
      // do some modify to params(optional)
      ClusterUpgradeHistoryConnection result = api.getClusterUpgradeHistoriesConnection("zh-CN", params);
      assertThat(result).as("check result of getClusterUpgradeHistoriesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
