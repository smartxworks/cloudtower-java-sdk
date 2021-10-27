package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetGraphsConnectionRequestBody;
import com.smartx.tower.model.GetGraphsRequestBody;
import com.smartx.tower.model.Graph;
import com.smartx.tower.model.GraphConnection;
import com.smartx.tower.model.GraphCreationParams;
import com.smartx.tower.model.GraphDeletionParams;
import com.smartx.tower.model.GraphUpdationParams;
import com.smartx.tower.model.WithTaskDeleteGraph;
import com.smartx.tower.model.WithTaskGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GraphApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param graphCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskGraph&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-graph")
  Call<List<WithTaskGraph>> createGraph(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<GraphCreationParams> graphCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param graphDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteGraph&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-graph")
  Call<List<WithTaskDeleteGraph>> deleteGraph(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GraphDeletionParams graphDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getGraphsRequestBody  (required)
   * @return Call&lt;List&lt;Graph&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-graphs")
  Call<List<Graph>> getGraphs(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetGraphsRequestBody getGraphsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getGraphsConnectionRequestBody  (required)
   * @return Call&lt;GraphConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-graphs-connection")
  Call<GraphConnection> getGraphsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetGraphsConnectionRequestBody getGraphsConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param graphUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskGraph&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-graph")
  Call<List<WithTaskGraph>> updateGraph(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GraphUpdationParams graphUpdationParams
  );

}
