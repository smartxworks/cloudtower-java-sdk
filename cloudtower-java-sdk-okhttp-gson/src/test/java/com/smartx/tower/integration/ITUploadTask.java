package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.UploadTaskApi;
import com.smartx.tower.model.*;

public class ITUploadTask extends IT {
  UploadTaskApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new UploadTaskApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/UploadTask.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getUploadTasks(String payload) {
    try {
      // parse params from json payload
      GetUploadTasksRequestBody params = gson.fromJson(payload, GetUploadTasksRequestBody.class);
      // do some modify to params(optional)
      List<UploadTask> result = api.getUploadTasks("zh-CN", params);
      assertThat(result).as("check result of getUploadTasks").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getUploadTasksConnection(String payload) {
    try {
      // parse params from json payload
      GetUploadTasksConnectionRequestBody params = gson.fromJson(payload, GetUploadTasksConnectionRequestBody.class);
      // do some modify to params(optional)
      UploadTaskConnection result = api.getUploadTasksConnection("zh-CN", params);
      assertThat(result).as("check result of getUploadTasksConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
