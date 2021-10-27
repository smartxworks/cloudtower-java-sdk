package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.BrickTopo;
import com.smartx.tower.model.BrickTopoConnection;
import com.smartx.tower.model.BrickTopoCreationParams;
import com.smartx.tower.model.BrickTopoDeletionParams;
import com.smartx.tower.model.BrickTopoMoveParams;
import com.smartx.tower.model.BrickTopoUpdationParams;
import com.smartx.tower.model.GetBrickTopoesConnectionRequestBody;
import com.smartx.tower.model.GetBrickTopoesRequestBody;
import com.smartx.tower.model.WithTaskBrickTopo;
import com.smartx.tower.model.WithTaskDeleteBrickTopo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BrickTopoApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param brickTopoCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskBrickTopo&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-brick-topo")
  Call<List<WithTaskBrickTopo>> createBrickTopo(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<BrickTopoCreationParams> brickTopoCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param brickTopoDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteBrickTopo&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-brick-topo")
  Call<List<WithTaskDeleteBrickTopo>> deleteBrickTopo(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body BrickTopoDeletionParams brickTopoDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getBrickTopoesRequestBody  (required)
   * @return Call&lt;List&lt;BrickTopo&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-brick-topoes")
  Call<List<BrickTopo>> getBrickTopoes(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetBrickTopoesRequestBody getBrickTopoesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getBrickTopoesConnectionRequestBody  (required)
   * @return Call&lt;BrickTopoConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-brick-topoes-connection")
  Call<BrickTopoConnection> getBrickTopoesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetBrickTopoesConnectionRequestBody getBrickTopoesConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param brickTopoMoveParams  (required)
   * @return Call&lt;List&lt;WithTaskBrickTopo&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("move-brick-topo")
  Call<List<WithTaskBrickTopo>> moveBrickTopo(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body BrickTopoMoveParams brickTopoMoveParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param brickTopoUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskBrickTopo&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-brick-topo")
  Call<List<WithTaskBrickTopo>> updateBrickTopo(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body BrickTopoUpdationParams brickTopoUpdationParams
  );

}
