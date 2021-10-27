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
   * @param contentLanguage  (required)
   * @param addLabelsToResourcesParams  (required)
   * @return Call&lt;List&lt;WithTaskLabel&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("add-labels-to-resources")
  Call<List<WithTaskLabel>> addLabelsToResources(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body AddLabelsToResourcesParams addLabelsToResourcesParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param labelCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskLabel&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-label")
  Call<List<WithTaskLabel>> createLabel(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<LabelCreationParams> labelCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param labelDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteLabel&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-label")
  Call<List<WithTaskDeleteLabel>> deleteLabel(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body LabelDeletionParams labelDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getLabelsRequestBody  (required)
   * @return Call&lt;List&lt;Label&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-labels")
  Call<List<Label>> getLabels(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetLabelsRequestBody getLabelsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getLabelsConnectionRequestBody  (required)
   * @return Call&lt;LabelConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-labels-connection")
  Call<LabelConnection> getLabelsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetLabelsConnectionRequestBody getLabelsConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param body  (required)
   * @return Call&lt;List&lt;WithTaskLabel&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("remove-labels-from-resources")
  Call<List<WithTaskLabel>> removeLabelsFromResources(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body AddLabelsToResourcesParams body
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param labelUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskLabel&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-label")
  Call<List<WithTaskLabel>> updateLabel(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body LabelUpdationParams labelUpdationParams
  );

}
