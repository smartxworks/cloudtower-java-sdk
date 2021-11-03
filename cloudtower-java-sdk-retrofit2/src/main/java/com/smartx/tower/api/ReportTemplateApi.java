package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetReportTemplatesConnectionRequestBody;
import com.smartx.tower.model.GetReportTemplatesRequestBody;
import com.smartx.tower.model.ReportTemplate;
import com.smartx.tower.model.ReportTemplateConnection;
import com.smartx.tower.model.ReportTemplateCreationParams;
import com.smartx.tower.model.ReportTemplateDeletionParams;
import com.smartx.tower.model.ReportTemplateUpdationParams;
import com.smartx.tower.model.ReporteTemplateGenerationParams;
import com.smartx.tower.model.WithTaskDeleteReportTemplate;
import com.smartx.tower.model.WithTaskReportTask;
import com.smartx.tower.model.WithTaskReportTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ReportTemplateApi {
  /**
   * 
   * 
   * @param reportTemplateCreationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskReportTemplate&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-report-template")
  Call<List<WithTaskReportTemplate>> createReportTemplate(
    @retrofit2.http.Body List<ReportTemplateCreationParams> reportTemplateCreationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param reportTemplateDeletionParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskDeleteReportTemplate&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-report-template")
  Call<List<WithTaskDeleteReportTemplate>> deleteReportTemplate(
    @retrofit2.http.Body ReportTemplateDeletionParams reportTemplateDeletionParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param reporteTemplateGenerationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskReportTask&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("generate-from-report-template")
  Call<List<WithTaskReportTask>> generateFromReportTemplate(
    @retrofit2.http.Body ReporteTemplateGenerationParams reporteTemplateGenerationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getReportTemplatesRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;ReportTemplate&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-report-templates")
  Call<List<ReportTemplate>> getReportTemplates(
    @retrofit2.http.Body GetReportTemplatesRequestBody getReportTemplatesRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getReportTemplatesConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;ReportTemplateConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-report-templates-connection")
  Call<ReportTemplateConnection> getReportTemplatesConnection(
    @retrofit2.http.Body GetReportTemplatesConnectionRequestBody getReportTemplatesConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param reportTemplateUpdationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskReportTemplate&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-report-template")
  Call<List<WithTaskReportTemplate>> updateReportTemplate(
    @retrofit2.http.Body ReportTemplateUpdationParams reportTemplateUpdationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
