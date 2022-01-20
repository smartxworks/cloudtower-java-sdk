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
import com.smartx.tower.api.ReportTaskApi;
import com.smartx.tower.model.*;

public class ITReportTask extends ITBase {
  ReportTaskApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "reportTaskPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "reportTaskPayload")
  public void getReportTasks(String payload) {
    try {
      // parse params from json payload
      GetReportTasksRequestBody params = gson.fromJson(payload, new TypeToken<GetReportTasksRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<ReportTask> result = api.getReportTasks(params, contentLanguage);
      assertThat(result).as("check result of getReportTasks").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "reportTaskPayload")
  public void getReportTasksConnection(String payload) {
    try {
      // parse params from json payload
      GetReportTasksConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetReportTasksConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      ReportTaskConnection result = api.getReportTasksConnection(params, contentLanguage);
      assertThat(result).as("check result of getReportTasksConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
