package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetRackTopoesConnectionRequestBody;
import com.smartx.tower.model.GetRackTopoesRequestBody;
import com.smartx.tower.model.RackTopo;
import com.smartx.tower.model.RackTopoConnection;
import com.smartx.tower.model.RackTopoCreationParams;
import com.smartx.tower.model.RackTopoDeletionParams;
import com.smartx.tower.model.RackTopoUpdationParams;
import com.smartx.tower.model.WithTaskDeleteRackTopo;
import com.smartx.tower.model.WithTaskRackTopo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RackTopoApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param rackTopoCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskRackTopo&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-rack-topo")
  Call<List<WithTaskRackTopo>> createRackTopo(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<RackTopoCreationParams> rackTopoCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param rackTopoDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteRackTopo&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-rack-topo")
  Call<List<WithTaskDeleteRackTopo>> deleteRackTopo(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body RackTopoDeletionParams rackTopoDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getRackTopoesRequestBody  (required)
   * @return Call&lt;List&lt;RackTopo&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-rack-topoes")
  Call<List<RackTopo>> getRackTopoes(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetRackTopoesRequestBody getRackTopoesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getRackTopoesConnectionRequestBody  (required)
   * @return Call&lt;RackTopoConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-rack-topoes-connection")
  Call<RackTopoConnection> getRackTopoesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetRackTopoesConnectionRequestBody getRackTopoesConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param rackTopoUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskRackTopo&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-rack-topo")
  Call<List<WithTaskRackTopo>> updateRackTopo(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body RackTopoUpdationParams rackTopoUpdationParams
  );

}
