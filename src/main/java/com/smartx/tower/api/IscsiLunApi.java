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
import com.smartx.tower.model.CopyIscsiLunParams;
import com.smartx.tower.model.ErrorBody;
import com.smartx.tower.model.GetIscsiLunsConnectionRequestBody;
import com.smartx.tower.model.GetIscsiLunsRequestBody;
import com.smartx.tower.model.IscsiLun;
import com.smartx.tower.model.IscsiLunCloneParams;
import com.smartx.tower.model.IscsiLunConnection;
import com.smartx.tower.model.IscsiLunCreationParams;
import com.smartx.tower.model.IscsiLunDeletionParams;
import com.smartx.tower.model.IscsiLunRollbackParams;
import com.smartx.tower.model.IscsiLunUpdationParams;
import com.smartx.tower.model.WithTaskDeleteIscsiLun;
import com.smartx.tower.model.WithTaskIscsiLun;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IscsiLunApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public IscsiLunApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IscsiLunApi(ApiClient apiClient) {
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
     * Build call for cloneIscsiLunFromSnapshot
     * @param iscsiLunCloneParams  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call cloneIscsiLunFromSnapshotCall(List<IscsiLunCloneParams> iscsiLunCloneParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = iscsiLunCloneParams;

        // create path and map variables
        String localVarPath = "/clone-iscsi-lun-from-snapshot";

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
    private okhttp3.Call cloneIscsiLunFromSnapshotValidateBeforeCall(List<IscsiLunCloneParams> iscsiLunCloneParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'iscsiLunCloneParams' is set
        if (iscsiLunCloneParams == null) {
            throw new ApiException("Missing the required parameter 'iscsiLunCloneParams' when calling cloneIscsiLunFromSnapshot(Async)");
        }
        

        okhttp3.Call localVarCall = cloneIscsiLunFromSnapshotCall(iscsiLunCloneParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param iscsiLunCloneParams  (required)
     * @return List&lt;WithTaskIscsiLun&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public List<WithTaskIscsiLun> cloneIscsiLunFromSnapshot(List<IscsiLunCloneParams> iscsiLunCloneParams) throws ApiException {
        ApiResponse<List<WithTaskIscsiLun>> localVarResp = cloneIscsiLunFromSnapshotWithHttpInfo(iscsiLunCloneParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param iscsiLunCloneParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskIscsiLun&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskIscsiLun>> cloneIscsiLunFromSnapshotWithHttpInfo(List<IscsiLunCloneParams> iscsiLunCloneParams) throws ApiException {
        okhttp3.Call localVarCall = cloneIscsiLunFromSnapshotValidateBeforeCall(iscsiLunCloneParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskIscsiLun>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param iscsiLunCloneParams  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call cloneIscsiLunFromSnapshotAsync(List<IscsiLunCloneParams> iscsiLunCloneParams, final ApiCallback<List<WithTaskIscsiLun>> _callback) throws ApiException {

        okhttp3.Call localVarCall = cloneIscsiLunFromSnapshotValidateBeforeCall(iscsiLunCloneParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskIscsiLun>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for copyIscsiLun
     * @param copyIscsiLunParams  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call copyIscsiLunCall(List<CopyIscsiLunParams> copyIscsiLunParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = copyIscsiLunParams;

        // create path and map variables
        String localVarPath = "/copy-iscsi-lun";

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
    private okhttp3.Call copyIscsiLunValidateBeforeCall(List<CopyIscsiLunParams> copyIscsiLunParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'copyIscsiLunParams' is set
        if (copyIscsiLunParams == null) {
            throw new ApiException("Missing the required parameter 'copyIscsiLunParams' when calling copyIscsiLun(Async)");
        }
        

        okhttp3.Call localVarCall = copyIscsiLunCall(copyIscsiLunParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param copyIscsiLunParams  (required)
     * @return List&lt;WithTaskIscsiLun&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public List<WithTaskIscsiLun> copyIscsiLun(List<CopyIscsiLunParams> copyIscsiLunParams) throws ApiException {
        ApiResponse<List<WithTaskIscsiLun>> localVarResp = copyIscsiLunWithHttpInfo(copyIscsiLunParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param copyIscsiLunParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskIscsiLun&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskIscsiLun>> copyIscsiLunWithHttpInfo(List<CopyIscsiLunParams> copyIscsiLunParams) throws ApiException {
        okhttp3.Call localVarCall = copyIscsiLunValidateBeforeCall(copyIscsiLunParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskIscsiLun>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param copyIscsiLunParams  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call copyIscsiLunAsync(List<CopyIscsiLunParams> copyIscsiLunParams, final ApiCallback<List<WithTaskIscsiLun>> _callback) throws ApiException {

        okhttp3.Call localVarCall = copyIscsiLunValidateBeforeCall(copyIscsiLunParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskIscsiLun>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createIscsiLun
     * @param iscsiLunCreationParams  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call createIscsiLunCall(List<IscsiLunCreationParams> iscsiLunCreationParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = iscsiLunCreationParams;

        // create path and map variables
        String localVarPath = "/create-iscsi-lun";

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
    private okhttp3.Call createIscsiLunValidateBeforeCall(List<IscsiLunCreationParams> iscsiLunCreationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'iscsiLunCreationParams' is set
        if (iscsiLunCreationParams == null) {
            throw new ApiException("Missing the required parameter 'iscsiLunCreationParams' when calling createIscsiLun(Async)");
        }
        

        okhttp3.Call localVarCall = createIscsiLunCall(iscsiLunCreationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param iscsiLunCreationParams  (required)
     * @return List&lt;WithTaskIscsiLun&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public List<WithTaskIscsiLun> createIscsiLun(List<IscsiLunCreationParams> iscsiLunCreationParams) throws ApiException {
        ApiResponse<List<WithTaskIscsiLun>> localVarResp = createIscsiLunWithHttpInfo(iscsiLunCreationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param iscsiLunCreationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskIscsiLun&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskIscsiLun>> createIscsiLunWithHttpInfo(List<IscsiLunCreationParams> iscsiLunCreationParams) throws ApiException {
        okhttp3.Call localVarCall = createIscsiLunValidateBeforeCall(iscsiLunCreationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskIscsiLun>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param iscsiLunCreationParams  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call createIscsiLunAsync(List<IscsiLunCreationParams> iscsiLunCreationParams, final ApiCallback<List<WithTaskIscsiLun>> _callback) throws ApiException {

        okhttp3.Call localVarCall = createIscsiLunValidateBeforeCall(iscsiLunCreationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskIscsiLun>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteIscsiLun
     * @param iscsiLunDeletionParams  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call deleteIscsiLunCall(IscsiLunDeletionParams iscsiLunDeletionParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = iscsiLunDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-iscsi-lun";

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
    private okhttp3.Call deleteIscsiLunValidateBeforeCall(IscsiLunDeletionParams iscsiLunDeletionParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'iscsiLunDeletionParams' is set
        if (iscsiLunDeletionParams == null) {
            throw new ApiException("Missing the required parameter 'iscsiLunDeletionParams' when calling deleteIscsiLun(Async)");
        }
        

        okhttp3.Call localVarCall = deleteIscsiLunCall(iscsiLunDeletionParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param iscsiLunDeletionParams  (required)
     * @return List&lt;WithTaskDeleteIscsiLun&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public List<WithTaskDeleteIscsiLun> deleteIscsiLun(IscsiLunDeletionParams iscsiLunDeletionParams) throws ApiException {
        ApiResponse<List<WithTaskDeleteIscsiLun>> localVarResp = deleteIscsiLunWithHttpInfo(iscsiLunDeletionParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param iscsiLunDeletionParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteIscsiLun&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskDeleteIscsiLun>> deleteIscsiLunWithHttpInfo(IscsiLunDeletionParams iscsiLunDeletionParams) throws ApiException {
        okhttp3.Call localVarCall = deleteIscsiLunValidateBeforeCall(iscsiLunDeletionParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteIscsiLun>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param iscsiLunDeletionParams  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call deleteIscsiLunAsync(IscsiLunDeletionParams iscsiLunDeletionParams, final ApiCallback<List<WithTaskDeleteIscsiLun>> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteIscsiLunValidateBeforeCall(iscsiLunDeletionParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteIscsiLun>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getIscsiLuns
     * @param getIscsiLunsRequestBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getIscsiLunsCall(GetIscsiLunsRequestBody getIscsiLunsRequestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getIscsiLunsRequestBody;

        // create path and map variables
        String localVarPath = "/get-iscsi-luns";

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
    private okhttp3.Call getIscsiLunsValidateBeforeCall(GetIscsiLunsRequestBody getIscsiLunsRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getIscsiLunsRequestBody' is set
        if (getIscsiLunsRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getIscsiLunsRequestBody' when calling getIscsiLuns(Async)");
        }
        

        okhttp3.Call localVarCall = getIscsiLunsCall(getIscsiLunsRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getIscsiLunsRequestBody  (required)
     * @return List&lt;IscsiLun&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public List<IscsiLun> getIscsiLuns(GetIscsiLunsRequestBody getIscsiLunsRequestBody) throws ApiException {
        ApiResponse<List<IscsiLun>> localVarResp = getIscsiLunsWithHttpInfo(getIscsiLunsRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getIscsiLunsRequestBody  (required)
     * @return ApiResponse&lt;List&lt;IscsiLun&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<List<IscsiLun>> getIscsiLunsWithHttpInfo(GetIscsiLunsRequestBody getIscsiLunsRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getIscsiLunsValidateBeforeCall(getIscsiLunsRequestBody, null);
        Type localVarReturnType = new TypeToken<List<IscsiLun>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getIscsiLunsRequestBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getIscsiLunsAsync(GetIscsiLunsRequestBody getIscsiLunsRequestBody, final ApiCallback<List<IscsiLun>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIscsiLunsValidateBeforeCall(getIscsiLunsRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<IscsiLun>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getIscsiLunsConnection
     * @param getIscsiLunsConnectionRequestBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getIscsiLunsConnectionCall(GetIscsiLunsConnectionRequestBody getIscsiLunsConnectionRequestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getIscsiLunsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-iscsi-luns-connection";

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
    private okhttp3.Call getIscsiLunsConnectionValidateBeforeCall(GetIscsiLunsConnectionRequestBody getIscsiLunsConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getIscsiLunsConnectionRequestBody' is set
        if (getIscsiLunsConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getIscsiLunsConnectionRequestBody' when calling getIscsiLunsConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getIscsiLunsConnectionCall(getIscsiLunsConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getIscsiLunsConnectionRequestBody  (required)
     * @return IscsiLunConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public IscsiLunConnection getIscsiLunsConnection(GetIscsiLunsConnectionRequestBody getIscsiLunsConnectionRequestBody) throws ApiException {
        ApiResponse<IscsiLunConnection> localVarResp = getIscsiLunsConnectionWithHttpInfo(getIscsiLunsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getIscsiLunsConnectionRequestBody  (required)
     * @return ApiResponse&lt;IscsiLunConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<IscsiLunConnection> getIscsiLunsConnectionWithHttpInfo(GetIscsiLunsConnectionRequestBody getIscsiLunsConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getIscsiLunsConnectionValidateBeforeCall(getIscsiLunsConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<IscsiLunConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getIscsiLunsConnectionRequestBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getIscsiLunsConnectionAsync(GetIscsiLunsConnectionRequestBody getIscsiLunsConnectionRequestBody, final ApiCallback<IscsiLunConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIscsiLunsConnectionValidateBeforeCall(getIscsiLunsConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<IscsiLunConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for rollbackIscsiLunFromSnapshot
     * @param iscsiLunRollbackParams  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call rollbackIscsiLunFromSnapshotCall(List<IscsiLunRollbackParams> iscsiLunRollbackParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = iscsiLunRollbackParams;

        // create path and map variables
        String localVarPath = "/rollback-iscsi-lun-from-snapshot";

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
    private okhttp3.Call rollbackIscsiLunFromSnapshotValidateBeforeCall(List<IscsiLunRollbackParams> iscsiLunRollbackParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'iscsiLunRollbackParams' is set
        if (iscsiLunRollbackParams == null) {
            throw new ApiException("Missing the required parameter 'iscsiLunRollbackParams' when calling rollbackIscsiLunFromSnapshot(Async)");
        }
        

        okhttp3.Call localVarCall = rollbackIscsiLunFromSnapshotCall(iscsiLunRollbackParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param iscsiLunRollbackParams  (required)
     * @return List&lt;WithTaskIscsiLun&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public List<WithTaskIscsiLun> rollbackIscsiLunFromSnapshot(List<IscsiLunRollbackParams> iscsiLunRollbackParams) throws ApiException {
        ApiResponse<List<WithTaskIscsiLun>> localVarResp = rollbackIscsiLunFromSnapshotWithHttpInfo(iscsiLunRollbackParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param iscsiLunRollbackParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskIscsiLun&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskIscsiLun>> rollbackIscsiLunFromSnapshotWithHttpInfo(List<IscsiLunRollbackParams> iscsiLunRollbackParams) throws ApiException {
        okhttp3.Call localVarCall = rollbackIscsiLunFromSnapshotValidateBeforeCall(iscsiLunRollbackParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskIscsiLun>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param iscsiLunRollbackParams  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call rollbackIscsiLunFromSnapshotAsync(List<IscsiLunRollbackParams> iscsiLunRollbackParams, final ApiCallback<List<WithTaskIscsiLun>> _callback) throws ApiException {

        okhttp3.Call localVarCall = rollbackIscsiLunFromSnapshotValidateBeforeCall(iscsiLunRollbackParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskIscsiLun>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateIscsiLun
     * @param iscsiLunUpdationParams  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call updateIscsiLunCall(IscsiLunUpdationParams iscsiLunUpdationParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = iscsiLunUpdationParams;

        // create path and map variables
        String localVarPath = "/update-iscsi-lun";

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
    private okhttp3.Call updateIscsiLunValidateBeforeCall(IscsiLunUpdationParams iscsiLunUpdationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'iscsiLunUpdationParams' is set
        if (iscsiLunUpdationParams == null) {
            throw new ApiException("Missing the required parameter 'iscsiLunUpdationParams' when calling updateIscsiLun(Async)");
        }
        

        okhttp3.Call localVarCall = updateIscsiLunCall(iscsiLunUpdationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param iscsiLunUpdationParams  (required)
     * @return List&lt;WithTaskIscsiLun&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public List<WithTaskIscsiLun> updateIscsiLun(IscsiLunUpdationParams iscsiLunUpdationParams) throws ApiException {
        ApiResponse<List<WithTaskIscsiLun>> localVarResp = updateIscsiLunWithHttpInfo(iscsiLunUpdationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param iscsiLunUpdationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskIscsiLun&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskIscsiLun>> updateIscsiLunWithHttpInfo(IscsiLunUpdationParams iscsiLunUpdationParams) throws ApiException {
        okhttp3.Call localVarCall = updateIscsiLunValidateBeforeCall(iscsiLunUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskIscsiLun>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param iscsiLunUpdationParams  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call updateIscsiLunAsync(IscsiLunUpdationParams iscsiLunUpdationParams, final ApiCallback<List<WithTaskIscsiLun>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateIscsiLunValidateBeforeCall(iscsiLunUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskIscsiLun>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
