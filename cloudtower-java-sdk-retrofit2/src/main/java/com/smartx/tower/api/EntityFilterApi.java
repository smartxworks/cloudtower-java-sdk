package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.EntityFilter;
import com.smartx.tower.model.EntityFilterConnection;
import com.smartx.tower.model.EntityFilterCreationParams;
import com.smartx.tower.model.EntityFilterDeletionParams;
import com.smartx.tower.model.EntityFilterUpdationParams;
import com.smartx.tower.model.GetEntityFiltersConnectionRequestBody;
import com.smartx.tower.model.GetEntityFiltersRequestBody;
import com.smartx.tower.model.WithTaskDeleteEntityFilter;
import com.smartx.tower.model.WithTaskEntityFilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EntityFilterApi {
  /**
   * 
   * 
   * @param entityFilterCreationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskEntityFilter&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-entity-filter")
  Call<List<WithTaskEntityFilter>> createEntityFilter(
    @retrofit2.http.Body List<EntityFilterCreationParams> entityFilterCreationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param entityFilterDeletionParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskDeleteEntityFilter&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-entity-filter")
  Call<List<WithTaskDeleteEntityFilter>> deleteEntityFilter(
    @retrofit2.http.Body EntityFilterDeletionParams entityFilterDeletionParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getEntityFiltersRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;EntityFilter&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-entity-filters")
  Call<List<EntityFilter>> getEntityFilters(
    @retrofit2.http.Body GetEntityFiltersRequestBody getEntityFiltersRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getEntityFiltersConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;EntityFilterConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-entity-filters-connection")
  Call<EntityFilterConnection> getEntityFiltersConnection(
    @retrofit2.http.Body GetEntityFiltersConnectionRequestBody getEntityFiltersConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param entityFilterUpdationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskEntityFilter&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-entity-filter")
  Call<List<WithTaskEntityFilter>> updateEntityFilter(
    @retrofit2.http.Body EntityFilterUpdationParams entityFilterUpdationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
