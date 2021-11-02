package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.TaskApi;
import com.smartx.tower.model.*;

public class ITTask extends IT {
  TaskApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new TaskApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Task.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getTasks(String payload) {
    try {
      // parse params from json payload
      GetTasksRequestBody params = gson.fromJson(payload, GetTasksRequestBody.class);
      // do some modify to params(optional)
      List<Task> result = api.getTasks("zh-CN", params);
      assertThat(result).as("check result of getTasks").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getTasksConnection(String payload) {
    try {
      // parse params from json payload
      GetTasksConnectionRequestBody params = gson.fromJson(payload, GetTasksConnectionRequestBody.class);
      // do some modify to params(optional)
      TaskConnection result = api.getTasksConnection("zh-CN", params);
      assertThat(result).as("check result of getTasksConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
