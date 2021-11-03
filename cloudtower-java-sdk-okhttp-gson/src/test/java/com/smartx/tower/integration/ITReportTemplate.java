package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.ReportTemplateApi;
import com.smartx.tower.model.*;

public class ITReportTemplate extends IT {
  ReportTemplateApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new ReportTemplateApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/ReportTemplate.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getReportTemplates(String payload) {
    try {
      // parse params from json payload
      GetReportTemplatesRequestBody params = gson.fromJson(payload, GetReportTemplatesRequestBody.class);
      // do some modify to params(optional)
      List<ReportTemplate> result = api.getReportTemplates("zh-CN", params);
      assertThat(result).as("check result of getReportTemplates").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getReportTemplatesConnection(String payload) {
    try {
      // parse params from json payload
      GetReportTemplatesConnectionRequestBody params = gson.fromJson(payload, GetReportTemplatesConnectionRequestBody.class);
      // do some modify to params(optional)
      ReportTemplateConnection result = api.getReportTemplatesConnection("zh-CN", params);
      assertThat(result).as("check result of getReportTemplatesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createReportTemplate(String payload) {
    try {
      // parse params from json payload
      List<ReportTemplateCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskReportTemplate> result = api.createReportTemplate("zh-CN", params);
      assertThat(result).as("check result of createReportTemplate").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateReportTemplate(String payload) {
    try {
      // parse params from json payload
      ReportTemplateUpdationParams params = gson.fromJson(payload, ReportTemplateUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskReportTemplate> result = api.updateReportTemplate("zh-CN", params);
      assertThat(result).as("check result of updateReportTemplate").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void generateFromReportTemplate(String payload) {
    try {
      // parse params from json payload
      ReporteTemplateGenerationParams params = gson.fromJson(payload, ReporteTemplateGenerationParams.class);
      // do some modify to params(optional)
      List<WithTaskReportTask> result = api.generateFromReportTemplate("zh-CN", params);
      assertThat(result).as("check result of generateFromReportTemplate").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteReportTemplate(String payload) {
    try {
      // parse params from json payload
      ReportTemplateDeletionParams params = gson.fromJson(payload, ReportTemplateDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteReportTemplate> result = api.deleteReportTemplate("zh-CN", params);
      assertThat(result).as("check result of deleteReportTemplate").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
