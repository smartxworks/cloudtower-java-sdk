package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetNfsInodesConnectionRequestBody;
import com.smartx.tower.model.GetNfsInodesRequestBody;
import com.smartx.tower.model.NfsInode;
import com.smartx.tower.model.NfsInodeConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface NfsInodeApi {
  /**
   * 
   * 
   * @param getNfsInodesRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;NfsInode&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-nfs-inodes")
  Call<List<NfsInode>> getNfsInodes(
    @retrofit2.http.Body GetNfsInodesRequestBody getNfsInodesRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getNfsInodesConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;NfsInodeConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-nfs-inodes-connection")
  Call<NfsInodeConnection> getNfsInodesConnection(
    @retrofit2.http.Body GetNfsInodesConnectionRequestBody getNfsInodesConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
