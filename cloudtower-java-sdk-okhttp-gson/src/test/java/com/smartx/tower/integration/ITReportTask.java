package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.ReportTaskApi;
import com.smartx.tower.model.*;

public class ITReportTask extends IT {
  ReportTaskApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new ReportTaskApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/ReportTask.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getReportTasks(String payload) {
    try {
      // parse params from json payload
      GetReportTasksRequestBody params = gson.fromJson(payload, GetReportTasksRequestBody.class);
      // do some modify to params(optional)
      List<ReportTask> result = api.getReportTasks("zh-CN", params);
      assertThat(result).as("check result of getReportTasks").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getReportTasksConnection(String payload) {
    try {
      // parse params from json payload
      GetReportTasksConnectionRequestBody params = gson.fromJson(payload, GetReportTasksConnectionRequestBody.class);
      // do some modify to params(optional)
      ReportTaskConnection result = api.getReportTasksConnection("zh-CN", params);
      assertThat(result).as("check result of getReportTasksConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
