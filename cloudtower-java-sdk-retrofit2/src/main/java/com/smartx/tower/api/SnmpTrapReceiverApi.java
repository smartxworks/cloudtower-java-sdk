package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetSnmpTrapReceiversConnectionRequestBody;
import com.smartx.tower.model.GetSnmpTrapReceiversRequestBody;
import com.smartx.tower.model.SnmpTrapReceiver;
import com.smartx.tower.model.SnmpTrapReceiverConnection;
import com.smartx.tower.model.SnmpTrapReceiverCreationParams;
import com.smartx.tower.model.SnmpTrapReceiverDeletionParams;
import com.smartx.tower.model.SnmpTrapReceiverUpdationParams;
import com.smartx.tower.model.WithTaskDeleteSnmpTrapReceiver;
import com.smartx.tower.model.WithTaskSnmpTrapReceiver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SnmpTrapReceiverApi {
  /**
   * 
   * 
   * @param snmpTrapReceiverCreationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskSnmpTrapReceiver&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-snmp-trap-receiver")
  Call<List<WithTaskSnmpTrapReceiver>> createSnmpTrapReceiver(
    @retrofit2.http.Body List<SnmpTrapReceiverCreationParams> snmpTrapReceiverCreationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param snmpTrapReceiverDeletionParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskDeleteSnmpTrapReceiver&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-snmp-trap-receiver")
  Call<List<WithTaskDeleteSnmpTrapReceiver>> deleteSnmpTrapReceiver(
    @retrofit2.http.Body SnmpTrapReceiverDeletionParams snmpTrapReceiverDeletionParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getSnmpTrapReceiversRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;SnmpTrapReceiver&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-snmp-trap-receivers")
  Call<List<SnmpTrapReceiver>> getSnmpTrapReceivers(
    @retrofit2.http.Body GetSnmpTrapReceiversRequestBody getSnmpTrapReceiversRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param getSnmpTrapReceiversConnectionRequestBody  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;SnmpTrapReceiverConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-snmp-trap-receivers-connection")
  Call<SnmpTrapReceiverConnection> getSnmpTrapReceiversConnection(
    @retrofit2.http.Body GetSnmpTrapReceiversConnectionRequestBody getSnmpTrapReceiversConnectionRequestBody, @retrofit2.http.Header("content-language") String contentLanguage
  );

  /**
   * 
   * 
   * @param snmpTrapReceiverUpdationParams  (required)
   * @param contentLanguage  (optional, default to en-US)
   * @return Call&lt;List&lt;WithTaskSnmpTrapReceiver&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-snmp-trap-receiver")
  Call<List<WithTaskSnmpTrapReceiver>> updateSnmpTrapReceiver(
    @retrofit2.http.Body SnmpTrapReceiverUpdationParams snmpTrapReceiverUpdationParams, @retrofit2.http.Header("content-language") String contentLanguage
  );

}
