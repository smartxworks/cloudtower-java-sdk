package com.smartx.tower.api;

import com.smartx.tower.ApiCallback;
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.Pair;
import com.smartx.tower.ProgressRequestBody;
import com.smartx.tower.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.smartx.tower.model.CommonHeader;
import com.smartx.tower.model.ErrorBody;
import com.smartx.tower.model.GetGpuDevicesConnectionRequestBody;
import com.smartx.tower.model.GetGpuDevicesRequestBody;
import com.smartx.tower.model.GpuDevice;
import com.smartx.tower.model.GpuDeviceConnection;
import com.smartx.tower.model.GpuDeviceDescriptionUpdationParams;
import com.smartx.tower.model.GpuDeviceSriovSwitchParams;
import com.smartx.tower.model.GpuDeviceUsageUpdationParams;
import com.smartx.tower.model.GpuVmInfo;
import com.smartx.tower.model.WithTaskGpuDevice;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GpuDeviceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GpuDeviceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GpuDeviceApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getDetailVmInfoByGpuDevices
     * @param getGpuDevicesRequestBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getDetailVmInfoByGpuDevicesCall(GetGpuDevicesRequestBody getGpuDevicesRequestBody, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getGpuDevicesRequestBody;

        // create path and map variables
        String localVarPath = "/get-detail-vm-info-by-gpu-devices";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDetailVmInfoByGpuDevicesValidateBeforeCall(GetGpuDevicesRequestBody getGpuDevicesRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getGpuDevicesRequestBody' is set
        if (getGpuDevicesRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getGpuDevicesRequestBody' when calling getDetailVmInfoByGpuDevices(Async)");
        }
        

        okhttp3.Call localVarCall = getDetailVmInfoByGpuDevicesCall(getGpuDevicesRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getGpuDevicesRequestBody  (required)
     * @return List&lt;GpuVmInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public List<GpuVmInfo> getDetailVmInfoByGpuDevices(GetGpuDevicesRequestBody getGpuDevicesRequestBody) throws ApiException {
        ApiResponse<List<GpuVmInfo>> localVarResp = getDetailVmInfoByGpuDevicesWithHttpInfo(getGpuDevicesRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getGpuDevicesRequestBody  (required)
     * @return ApiResponse&lt;List&lt;GpuVmInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<List<GpuVmInfo>> getDetailVmInfoByGpuDevicesWithHttpInfo(GetGpuDevicesRequestBody getGpuDevicesRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getDetailVmInfoByGpuDevicesValidateBeforeCall(getGpuDevicesRequestBody, null);
        Type localVarReturnType = new TypeToken<List<GpuVmInfo>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getGpuDevicesRequestBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getDetailVmInfoByGpuDevicesAsync(GetGpuDevicesRequestBody getGpuDevicesRequestBody, final ApiCallback<List<GpuVmInfo>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDetailVmInfoByGpuDevicesValidateBeforeCall(getGpuDevicesRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<GpuVmInfo>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getGpuDevices
     * @param getGpuDevicesRequestBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * x-tower-request-id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getGpuDevicesCall(GetGpuDevicesRequestBody getGpuDevicesRequestBody, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getGpuDevicesRequestBody;

        // create path and map variables
        String localVarPath = "/get-gpu-devices";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getGpuDevicesValidateBeforeCall(GetGpuDevicesRequestBody getGpuDevicesRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getGpuDevicesRequestBody' is set
        if (getGpuDevicesRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getGpuDevicesRequestBody' when calling getGpuDevices(Async)");
        }
        

        okhttp3.Call localVarCall = getGpuDevicesCall(getGpuDevicesRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getGpuDevicesRequestBody  (required)
     * @return List&lt;GpuDevice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * x-tower-request-id -  <br>  </td></tr>
     </table>
     */
    public List<GpuDevice> getGpuDevices(GetGpuDevicesRequestBody getGpuDevicesRequestBody) throws ApiException {
        ApiResponse<List<GpuDevice>> localVarResp = getGpuDevicesWithHttpInfo(getGpuDevicesRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getGpuDevicesRequestBody  (required)
     * @return ApiResponse&lt;List&lt;GpuDevice&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * x-tower-request-id -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<List<GpuDevice>> getGpuDevicesWithHttpInfo(GetGpuDevicesRequestBody getGpuDevicesRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getGpuDevicesValidateBeforeCall(getGpuDevicesRequestBody, null);
        Type localVarReturnType = new TypeToken<List<GpuDevice>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getGpuDevicesRequestBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * x-tower-request-id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getGpuDevicesAsync(GetGpuDevicesRequestBody getGpuDevicesRequestBody, final ApiCallback<List<GpuDevice>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getGpuDevicesValidateBeforeCall(getGpuDevicesRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<GpuDevice>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getGpuDevicesConnection
     * @param getGpuDevicesConnectionRequestBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * x-tower-request-id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getGpuDevicesConnectionCall(GetGpuDevicesConnectionRequestBody getGpuDevicesConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getGpuDevicesConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-gpu-devices-connection";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getGpuDevicesConnectionValidateBeforeCall(GetGpuDevicesConnectionRequestBody getGpuDevicesConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getGpuDevicesConnectionRequestBody' is set
        if (getGpuDevicesConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getGpuDevicesConnectionRequestBody' when calling getGpuDevicesConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getGpuDevicesConnectionCall(getGpuDevicesConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getGpuDevicesConnectionRequestBody  (required)
     * @return GpuDeviceConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * x-tower-request-id -  <br>  </td></tr>
     </table>
     */
    public GpuDeviceConnection getGpuDevicesConnection(GetGpuDevicesConnectionRequestBody getGpuDevicesConnectionRequestBody) throws ApiException {
        ApiResponse<GpuDeviceConnection> localVarResp = getGpuDevicesConnectionWithHttpInfo(getGpuDevicesConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getGpuDevicesConnectionRequestBody  (required)
     * @return ApiResponse&lt;GpuDeviceConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * x-tower-request-id -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<GpuDeviceConnection> getGpuDevicesConnectionWithHttpInfo(GetGpuDevicesConnectionRequestBody getGpuDevicesConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getGpuDevicesConnectionValidateBeforeCall(getGpuDevicesConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<GpuDeviceConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getGpuDevicesConnectionRequestBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * x-tower-request-id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getGpuDevicesConnectionAsync(GetGpuDevicesConnectionRequestBody getGpuDevicesConnectionRequestBody, final ApiCallback<GpuDeviceConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getGpuDevicesConnectionValidateBeforeCall(getGpuDevicesConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<GpuDeviceConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for switchGpuDeviceSriov
     * @param gpuDeviceSriovSwitchParams  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call switchGpuDeviceSriovCall(GpuDeviceSriovSwitchParams gpuDeviceSriovSwitchParams, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = gpuDeviceSriovSwitchParams;

        // create path and map variables
        String localVarPath = "/switch-gpu-device-sriov";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call switchGpuDeviceSriovValidateBeforeCall(GpuDeviceSriovSwitchParams gpuDeviceSriovSwitchParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'gpuDeviceSriovSwitchParams' is set
        if (gpuDeviceSriovSwitchParams == null) {
            throw new ApiException("Missing the required parameter 'gpuDeviceSriovSwitchParams' when calling switchGpuDeviceSriov(Async)");
        }
        

        okhttp3.Call localVarCall = switchGpuDeviceSriovCall(gpuDeviceSriovSwitchParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param gpuDeviceSriovSwitchParams  (required)
     * @return List&lt;WithTaskGpuDevice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public List<WithTaskGpuDevice> switchGpuDeviceSriov(GpuDeviceSriovSwitchParams gpuDeviceSriovSwitchParams) throws ApiException {
        ApiResponse<List<WithTaskGpuDevice>> localVarResp = switchGpuDeviceSriovWithHttpInfo(gpuDeviceSriovSwitchParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param gpuDeviceSriovSwitchParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskGpuDevice&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskGpuDevice>> switchGpuDeviceSriovWithHttpInfo(GpuDeviceSriovSwitchParams gpuDeviceSriovSwitchParams) throws ApiException {
        okhttp3.Call localVarCall = switchGpuDeviceSriovValidateBeforeCall(gpuDeviceSriovSwitchParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskGpuDevice>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param gpuDeviceSriovSwitchParams  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call switchGpuDeviceSriovAsync(GpuDeviceSriovSwitchParams gpuDeviceSriovSwitchParams, final ApiCallback<List<WithTaskGpuDevice>> _callback) throws ApiException {

        okhttp3.Call localVarCall = switchGpuDeviceSriovValidateBeforeCall(gpuDeviceSriovSwitchParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskGpuDevice>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateGpuDeviceDescription
     * @param gpuDeviceDescriptionUpdationParams  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call updateGpuDeviceDescriptionCall(GpuDeviceDescriptionUpdationParams gpuDeviceDescriptionUpdationParams, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = gpuDeviceDescriptionUpdationParams;

        // create path and map variables
        String localVarPath = "/update-gpu-device-description";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateGpuDeviceDescriptionValidateBeforeCall(GpuDeviceDescriptionUpdationParams gpuDeviceDescriptionUpdationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'gpuDeviceDescriptionUpdationParams' is set
        if (gpuDeviceDescriptionUpdationParams == null) {
            throw new ApiException("Missing the required parameter 'gpuDeviceDescriptionUpdationParams' when calling updateGpuDeviceDescription(Async)");
        }
        

        okhttp3.Call localVarCall = updateGpuDeviceDescriptionCall(gpuDeviceDescriptionUpdationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param gpuDeviceDescriptionUpdationParams  (required)
     * @return List&lt;WithTaskGpuDevice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public List<WithTaskGpuDevice> updateGpuDeviceDescription(GpuDeviceDescriptionUpdationParams gpuDeviceDescriptionUpdationParams) throws ApiException {
        ApiResponse<List<WithTaskGpuDevice>> localVarResp = updateGpuDeviceDescriptionWithHttpInfo(gpuDeviceDescriptionUpdationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param gpuDeviceDescriptionUpdationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskGpuDevice&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskGpuDevice>> updateGpuDeviceDescriptionWithHttpInfo(GpuDeviceDescriptionUpdationParams gpuDeviceDescriptionUpdationParams) throws ApiException {
        okhttp3.Call localVarCall = updateGpuDeviceDescriptionValidateBeforeCall(gpuDeviceDescriptionUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskGpuDevice>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param gpuDeviceDescriptionUpdationParams  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call updateGpuDeviceDescriptionAsync(GpuDeviceDescriptionUpdationParams gpuDeviceDescriptionUpdationParams, final ApiCallback<List<WithTaskGpuDevice>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateGpuDeviceDescriptionValidateBeforeCall(gpuDeviceDescriptionUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskGpuDevice>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateGpuDeviceUsage
     * @param gpuDeviceUsageUpdationParams  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call updateGpuDeviceUsageCall(GpuDeviceUsageUpdationParams gpuDeviceUsageUpdationParams, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = gpuDeviceUsageUpdationParams;

        // create path and map variables
        String localVarPath = "/update-gpu-device-usage";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateGpuDeviceUsageValidateBeforeCall(GpuDeviceUsageUpdationParams gpuDeviceUsageUpdationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'gpuDeviceUsageUpdationParams' is set
        if (gpuDeviceUsageUpdationParams == null) {
            throw new ApiException("Missing the required parameter 'gpuDeviceUsageUpdationParams' when calling updateGpuDeviceUsage(Async)");
        }
        

        okhttp3.Call localVarCall = updateGpuDeviceUsageCall(gpuDeviceUsageUpdationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param gpuDeviceUsageUpdationParams  (required)
     * @return List&lt;WithTaskGpuDevice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public List<WithTaskGpuDevice> updateGpuDeviceUsage(GpuDeviceUsageUpdationParams gpuDeviceUsageUpdationParams) throws ApiException {
        ApiResponse<List<WithTaskGpuDevice>> localVarResp = updateGpuDeviceUsageWithHttpInfo(gpuDeviceUsageUpdationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param gpuDeviceUsageUpdationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskGpuDevice&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskGpuDevice>> updateGpuDeviceUsageWithHttpInfo(GpuDeviceUsageUpdationParams gpuDeviceUsageUpdationParams) throws ApiException {
        okhttp3.Call localVarCall = updateGpuDeviceUsageValidateBeforeCall(gpuDeviceUsageUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskGpuDevice>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param gpuDeviceUsageUpdationParams  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call updateGpuDeviceUsageAsync(GpuDeviceUsageUpdationParams gpuDeviceUsageUpdationParams, final ApiCallback<List<WithTaskGpuDevice>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateGpuDeviceUsageValidateBeforeCall(gpuDeviceUsageUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskGpuDevice>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
