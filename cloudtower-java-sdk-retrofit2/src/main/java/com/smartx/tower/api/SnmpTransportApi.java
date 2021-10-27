package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetSnmpTransportsConnectionRequestBody;
import com.smartx.tower.model.GetSnmpTransportsRequestBody;
import com.smartx.tower.model.SnmpTransport;
import com.smartx.tower.model.SnmpTransportConnection;
import com.smartx.tower.model.SnmpTransportCreationParams;
import com.smartx.tower.model.SnmpTransportDeletionParams;
import com.smartx.tower.model.SnmpTransportUpdationParams;
import com.smartx.tower.model.WithTaskDeleteSnmpTransport;
import com.smartx.tower.model.WithTaskSnmpTransport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SnmpTransportApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param snmpTransportCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskSnmpTransport&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-snmp-transport")
  Call<List<WithTaskSnmpTransport>> createSnmpTransport(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<SnmpTransportCreationParams> snmpTransportCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param snmpTransportDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteSnmpTransport&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-snmp-transport")
  Call<List<WithTaskDeleteSnmpTransport>> deleteSnmpTransport(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body SnmpTransportDeletionParams snmpTransportDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getSnmpTransportsRequestBody  (required)
   * @return Call&lt;List&lt;SnmpTransport&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-snmp-transports")
  Call<List<SnmpTransport>> getSnmpTransports(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetSnmpTransportsRequestBody getSnmpTransportsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getSnmpTransportsConnectionRequestBody  (required)
   * @return Call&lt;SnmpTransportConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-snmp-transports-connection")
  Call<SnmpTransportConnection> getSnmpTransportsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetSnmpTransportsConnectionRequestBody getSnmpTransportsConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param snmpTransportUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskSnmpTransport&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-snmp-transport")
  Call<List<WithTaskSnmpTransport>> updateSnmpTransport(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body SnmpTransportUpdationParams snmpTransportUpdationParams
  );

}
