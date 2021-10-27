package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetViewsConnectionRequestBody;
import com.smartx.tower.model.GetViewsRequestBody;
import com.smartx.tower.model.View;
import com.smartx.tower.model.ViewConnection;
import com.smartx.tower.model.ViewCreationParams;
import com.smartx.tower.model.ViewDeletionParams;
import com.smartx.tower.model.ViewUpdationParams;
import com.smartx.tower.model.WithTaskDeleteView;
import com.smartx.tower.model.WithTaskView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ViewApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param viewCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskView&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-view")
  Call<List<WithTaskView>> createView(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<ViewCreationParams> viewCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param viewDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteView&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-view")
  Call<List<WithTaskDeleteView>> deleteView(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body ViewDeletionParams viewDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getViewsRequestBody  (required)
   * @return Call&lt;List&lt;View&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-views")
  Call<List<View>> getViews(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetViewsRequestBody getViewsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getViewsConnectionRequestBody  (required)
   * @return Call&lt;ViewConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-views-connection")
  Call<ViewConnection> getViewsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetViewsConnectionRequestBody getViewsConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param viewUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskView&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-view")
  Call<List<WithTaskView>> updateView(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body ViewUpdationParams viewUpdationParams
  );

}
