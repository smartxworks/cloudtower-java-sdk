package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.SnapshotPlanTaskApi;
import com.smartx.tower.model.*;

public class ITSnapshotPlanTask extends IT {
  SnapshotPlanTaskApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new SnapshotPlanTaskApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/SnapshotPlanTask.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getSnapshotPlanTasks(String payload) {
    try {
      // parse params from json payload
      GetSnapshotPlanTasksRequestBody params = gson.fromJson(payload, GetSnapshotPlanTasksRequestBody.class);
      // do some modify to params(optional)
      List<SnapshotPlanTask> result = api.getSnapshotPlanTasks("zh-CN", params);
      assertThat(result).as("check result of getSnapshotPlanTasks").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getSnapshotPlanTasksConnection(String payload) {
    try {
      // parse params from json payload
      GetSnapshotPlanTasksConnectionRequestBody params = gson.fromJson(payload, GetSnapshotPlanTasksConnectionRequestBody.class);
      // do some modify to params(optional)
      SnapshotPlanTaskConnection result = api.getSnapshotPlanTasksConnection("zh-CN", params);
      assertThat(result).as("check result of getSnapshotPlanTasksConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
