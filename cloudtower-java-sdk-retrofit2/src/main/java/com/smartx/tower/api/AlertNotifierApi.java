package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.AlertNotifier;
import com.smartx.tower.model.AlertNotifierConnection;
import com.smartx.tower.model.GetAlertNotifiersConnectionRequestBody;
import com.smartx.tower.model.GetAlertNotifiersRequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AlertNotifierApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getAlertNotifiersRequestBody  (required)
   * @return Call&lt;List&lt;AlertNotifier&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-alert-notifiers")
  Call<List<AlertNotifier>> getAlertNotifiers(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetAlertNotifiersRequestBody getAlertNotifiersRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getAlertNotifiersConnectionRequestBody  (required)
   * @return Call&lt;AlertNotifierConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-alert-notifiers-connection")
  Call<AlertNotifierConnection> getAlertNotifiersConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetAlertNotifiersConnectionRequestBody getAlertNotifiersConnectionRequestBody
  );

}
