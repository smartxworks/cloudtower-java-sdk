/*
 * CloudTower APIs
 * cloudtower operation API and SDK
 *
 * The version of the OpenAPI document: 2.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


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


import com.smartx.tower.model.ErrorBody;
import com.smartx.tower.model.GetVmVolumesConnectionRequestBody;
import com.smartx.tower.model.GetVmVolumesRequestBody;
import com.smartx.tower.model.VmVolume;
import com.smartx.tower.model.VmVolumeConnection;
import com.smartx.tower.model.VmVolumeCreationParams;
import com.smartx.tower.model.VmVolumeDeletionParams;
import com.smartx.tower.model.WithTaskDeleteVmVolume;
import com.smartx.tower.model.WithTaskVmVolume;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VmVolumeApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VmVolumeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VmVolumeApi(ApiClient apiClient) {
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
     * Build call for createVmVolume
     * @param vmVolumeCreationParams  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createVmVolumeCall(List<VmVolumeCreationParams> vmVolumeCreationParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = vmVolumeCreationParams;

        // create path and map variables
        String localVarPath = "/create-vm-volume";

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
    private okhttp3.Call createVmVolumeValidateBeforeCall(List<VmVolumeCreationParams> vmVolumeCreationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'vmVolumeCreationParams' is set
        if (vmVolumeCreationParams == null) {
            throw new ApiException("Missing the required parameter 'vmVolumeCreationParams' when calling createVmVolume(Async)");
        }
        

        okhttp3.Call localVarCall = createVmVolumeCall(vmVolumeCreationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param vmVolumeCreationParams  (required)
     * @return List&lt;WithTaskVmVolume&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskVmVolume> createVmVolume(List<VmVolumeCreationParams> vmVolumeCreationParams) throws ApiException {
        ApiResponse<List<WithTaskVmVolume>> localVarResp = createVmVolumeWithHttpInfo(vmVolumeCreationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param vmVolumeCreationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskVmVolume&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskVmVolume>> createVmVolumeWithHttpInfo(List<VmVolumeCreationParams> vmVolumeCreationParams) throws ApiException {
        okhttp3.Call localVarCall = createVmVolumeValidateBeforeCall(vmVolumeCreationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskVmVolume>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param vmVolumeCreationParams  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createVmVolumeAsync(List<VmVolumeCreationParams> vmVolumeCreationParams, final ApiCallback<List<WithTaskVmVolume>> _callback) throws ApiException {

        okhttp3.Call localVarCall = createVmVolumeValidateBeforeCall(vmVolumeCreationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskVmVolume>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteVmVolumeFromVm
     * @param vmVolumeDeletionParams  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteVmVolumeFromVmCall(VmVolumeDeletionParams vmVolumeDeletionParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = vmVolumeDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-vm-volume";

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
    private okhttp3.Call deleteVmVolumeFromVmValidateBeforeCall(VmVolumeDeletionParams vmVolumeDeletionParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'vmVolumeDeletionParams' is set
        if (vmVolumeDeletionParams == null) {
            throw new ApiException("Missing the required parameter 'vmVolumeDeletionParams' when calling deleteVmVolumeFromVm(Async)");
        }
        

        okhttp3.Call localVarCall = deleteVmVolumeFromVmCall(vmVolumeDeletionParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param vmVolumeDeletionParams  (required)
     * @return List&lt;WithTaskDeleteVmVolume&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskDeleteVmVolume> deleteVmVolumeFromVm(VmVolumeDeletionParams vmVolumeDeletionParams) throws ApiException {
        ApiResponse<List<WithTaskDeleteVmVolume>> localVarResp = deleteVmVolumeFromVmWithHttpInfo(vmVolumeDeletionParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param vmVolumeDeletionParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteVmVolume&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskDeleteVmVolume>> deleteVmVolumeFromVmWithHttpInfo(VmVolumeDeletionParams vmVolumeDeletionParams) throws ApiException {
        okhttp3.Call localVarCall = deleteVmVolumeFromVmValidateBeforeCall(vmVolumeDeletionParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteVmVolume>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param vmVolumeDeletionParams  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteVmVolumeFromVmAsync(VmVolumeDeletionParams vmVolumeDeletionParams, final ApiCallback<List<WithTaskDeleteVmVolume>> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteVmVolumeFromVmValidateBeforeCall(vmVolumeDeletionParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteVmVolume>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVmVolumes
     * @param getVmVolumesRequestBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getVmVolumesCall(GetVmVolumesRequestBody getVmVolumesRequestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getVmVolumesRequestBody;

        // create path and map variables
        String localVarPath = "/get-vm-volumes";

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
    private okhttp3.Call getVmVolumesValidateBeforeCall(GetVmVolumesRequestBody getVmVolumesRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getVmVolumesRequestBody' is set
        if (getVmVolumesRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getVmVolumesRequestBody' when calling getVmVolumes(Async)");
        }
        

        okhttp3.Call localVarCall = getVmVolumesCall(getVmVolumesRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getVmVolumesRequestBody  (required)
     * @return List&lt;VmVolume&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     </table>
     */
    public List<VmVolume> getVmVolumes(GetVmVolumesRequestBody getVmVolumesRequestBody) throws ApiException {
        ApiResponse<List<VmVolume>> localVarResp = getVmVolumesWithHttpInfo(getVmVolumesRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getVmVolumesRequestBody  (required)
     * @return ApiResponse&lt;List&lt;VmVolume&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<VmVolume>> getVmVolumesWithHttpInfo(GetVmVolumesRequestBody getVmVolumesRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getVmVolumesValidateBeforeCall(getVmVolumesRequestBody, null);
        Type localVarReturnType = new TypeToken<List<VmVolume>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getVmVolumesRequestBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getVmVolumesAsync(GetVmVolumesRequestBody getVmVolumesRequestBody, final ApiCallback<List<VmVolume>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getVmVolumesValidateBeforeCall(getVmVolumesRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<VmVolume>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVmVolumesConnection
     * @param getVmVolumesConnectionRequestBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getVmVolumesConnectionCall(GetVmVolumesConnectionRequestBody getVmVolumesConnectionRequestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getVmVolumesConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-vm-volumes-connection";

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
    private okhttp3.Call getVmVolumesConnectionValidateBeforeCall(GetVmVolumesConnectionRequestBody getVmVolumesConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getVmVolumesConnectionRequestBody' is set
        if (getVmVolumesConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getVmVolumesConnectionRequestBody' when calling getVmVolumesConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getVmVolumesConnectionCall(getVmVolumesConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getVmVolumesConnectionRequestBody  (required)
     * @return VmVolumeConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     </table>
     */
    public VmVolumeConnection getVmVolumesConnection(GetVmVolumesConnectionRequestBody getVmVolumesConnectionRequestBody) throws ApiException {
        ApiResponse<VmVolumeConnection> localVarResp = getVmVolumesConnectionWithHttpInfo(getVmVolumesConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getVmVolumesConnectionRequestBody  (required)
     * @return ApiResponse&lt;VmVolumeConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VmVolumeConnection> getVmVolumesConnectionWithHttpInfo(GetVmVolumesConnectionRequestBody getVmVolumesConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getVmVolumesConnectionValidateBeforeCall(getVmVolumesConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<VmVolumeConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getVmVolumesConnectionRequestBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getVmVolumesConnectionAsync(GetVmVolumesConnectionRequestBody getVmVolumesConnectionRequestBody, final ApiCallback<VmVolumeConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getVmVolumesConnectionValidateBeforeCall(getVmVolumesConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<VmVolumeConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
