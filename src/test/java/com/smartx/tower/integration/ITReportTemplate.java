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
import com.smartx.tower.api.ReportTemplateApi;
import com.smartx.tower.model.*;

public class ITReportTemplate extends ITBase {
  ReportTemplateApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "reportTemplatePayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "reportTemplatePayload")
  public void createReportTemplate(String payload) {
    try {
      // parse params from json payload
      List<ReportTemplateCreationParams> params = gson.fromJson(payload, new TypeToken<List<ReportTemplateCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskReportTemplate> result = api.createReportTemplate(params);
      assertThat(result).as("check result of createReportTemplate").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "reportTemplatePayload")
  public void deleteReportTemplate(String payload) {
    try {
      // parse params from json payload
      ReportTemplateDeletionParams params = gson.fromJson(payload, new TypeToken<ReportTemplateDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteReportTemplate> result = api.deleteReportTemplate(params);
      assertThat(result).as("check result of deleteReportTemplate").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "reportTemplatePayload")
  public void generateFromReportTemplate(String payload) {
    try {
      // parse params from json payload
      ReporteTemplateGenerationParams params = gson.fromJson(payload, new TypeToken<ReporteTemplateGenerationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskReportTask> result = api.generateFromReportTemplate(params);
      assertThat(result).as("check result of generateFromReportTemplate").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "reportTemplatePayload")
  public void getReportTemplates(String payload) {
    try {
      // parse params from json payload
      GetReportTemplatesRequestBody params = gson.fromJson(payload, new TypeToken<GetReportTemplatesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<ReportTemplate> result = api.getReportTemplates(params);
      assertThat(result).as("check result of getReportTemplates").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "reportTemplatePayload")
  public void getReportTemplatesConnection(String payload) {
    try {
      // parse params from json payload
      GetReportTemplatesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetReportTemplatesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      ReportTemplateConnection result = api.getReportTemplatesConnection(params);
      assertThat(result).as("check result of getReportTemplatesConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "reportTemplatePayload")
  public void updateReportTemplate(String payload) {
    try {
      // parse params from json payload
      ReportTemplateUpdationParams params = gson.fromJson(payload, new TypeToken<ReportTemplateUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskReportTemplate> result = api.updateReportTemplate(params);
      assertThat(result).as("check result of updateReportTemplate").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
