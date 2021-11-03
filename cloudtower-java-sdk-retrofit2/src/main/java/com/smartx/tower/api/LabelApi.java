package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.AddLabelsToResourcesParams;
import com.smartx.tower.model.GetLabelsConnectionRequestBody;
import com.smartx.tower.model.GetLabelsRequestBody;
import com.smartx.tower.model.Label;
import com.smartx.tower.model.LabelConnection;
import com.smartx.tower.model.LabelCreationParams;
import com.smartx.tower.model.LabelDeletionParams;
import com.smartx.tower.model.LabelUpdationParams;
import com.smartx.tower.model.WithTaskDeleteLabel;
import com.smartx.tower.model.WithTaskLabel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LabelApi {
  /**
   * 
   * 
   * @param addLabelsToResourcesParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskLabel&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("add-labels-to-resources")
  Call<List<WithTaskLabel>> addLabelsToResources(
    @retrofit2.http.Body AddLabelsToResourcesParams addLabelsToResourcesParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param labelCreationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskLabel&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-label")
  Call<List<WithTaskLabel>> createLabel(
    @retrofit2.http.Body List<LabelCreationParams> labelCreationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param labelDeletionParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskDeleteLabel&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-label")
  Call<List<WithTaskDeleteLabel>> deleteLabel(
    @retrofit2.http.Body LabelDeletionParams labelDeletionParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getLabelsRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;Label&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-labels")
  Call<List<Label>> getLabels(
    @retrofit2.http.Body GetLabelsRequestBody getLabelsRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getLabelsConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;LabelConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-labels-connection")
  Call<LabelConnection> getLabelsConnection(
    @retrofit2.http.Body GetLabelsConnectionRequestBody getLabelsConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param body  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskLabel&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("remove-labels-from-resources")
  Call<List<WithTaskLabel>> removeLabelsFromResources(
    @retrofit2.http.Body AddLabelsToResourcesParams body, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param labelUpdationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskLabel&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-label")
  Call<List<WithTaskLabel>> updateLabel(
    @retrofit2.http.Body LabelUpdationParams labelUpdationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
