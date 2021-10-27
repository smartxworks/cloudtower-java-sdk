package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetNodeTopoesConnectionRequestBody;
import com.smartx.tower.model.GetNodeTopoesRequestBody;
import com.smartx.tower.model.NodeTopo;
import com.smartx.tower.model.NodeTopoConnection;
import com.smartx.tower.model.WithTaskNodeTopo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface NodeTopoApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getNodeTopoesRequestBody  (required)
   * @return Call&lt;List&lt;NodeTopo&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-node-topoes")
  Call<List<NodeTopo>> getNodeTopoes(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetNodeTopoesRequestBody getNodeTopoesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getNodeTopoesConnectionRequestBody  (required)
   * @return Call&lt;NodeTopoConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-node-topoes-connection")
  Call<NodeTopoConnection> getNodeTopoesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetNodeTopoesConnectionRequestBody getNodeTopoesConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param requestBody  (required)
   * @return Call&lt;List&lt;WithTaskNodeTopo&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("move-node-topo")
  Call<List<WithTaskNodeTopo>> updateNodeTopo(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<Object> requestBody
  );

}
