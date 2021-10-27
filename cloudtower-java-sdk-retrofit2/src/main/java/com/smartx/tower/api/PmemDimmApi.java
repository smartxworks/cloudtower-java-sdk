package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetPmemDimmsConnectionRequestBody;
import com.smartx.tower.model.GetPmemDimmsRequestBody;
import com.smartx.tower.model.PmemDimm;
import com.smartx.tower.model.PmemDimmConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PmemDimmApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getPmemDimmsRequestBody  (required)
   * @return Call&lt;List&lt;PmemDimm&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-pmem-dimms")
  Call<List<PmemDimm>> getPmemDimms(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetPmemDimmsRequestBody getPmemDimmsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getPmemDimmsConnectionRequestBody  (required)
   * @return Call&lt;PmemDimmConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-pmem-dimms-connection")
  Call<PmemDimmConnection> getPmemDimmsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetPmemDimmsConnectionRequestBody getPmemDimmsConnectionRequestBody
  );

}
