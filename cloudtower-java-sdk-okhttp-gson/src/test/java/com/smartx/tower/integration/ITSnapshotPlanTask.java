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
import com.smartx.tower.api.SnapshotPlanTaskApi;
import com.smartx.tower.model.*;

public class ITSnapshotPlanTask extends ITBase {
  SnapshotPlanTaskApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "snapshotPlanTaskPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "snapshotPlanTaskPayload")
  public void getSnapshotPlanTasks(String payload) {
    try {
      // parse params from json payload
      GetSnapshotPlanTasksRequestBody params = gson.fromJson(payload, new TypeToken<GetSnapshotPlanTasksRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<SnapshotPlanTask> result = api.getSnapshotPlanTasks(params, contentLanguage);
      assertThat(result).as("check result of getSnapshotPlanTasks").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "snapshotPlanTaskPayload")
  public void getSnapshotPlanTasksConnection(String payload) {
    try {
      // parse params from json payload
      GetSnapshotPlanTasksConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetSnapshotPlanTasksConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      SnapshotPlanTaskConnection result = api.getSnapshotPlanTasksConnection(params, contentLanguage);
      assertThat(result).as("check result of getSnapshotPlanTasksConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
