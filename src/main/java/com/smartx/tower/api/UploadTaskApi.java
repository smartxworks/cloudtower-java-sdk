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


import com.smartx.tower.model.CancelUploadTaskParams;
import com.smartx.tower.model.CommonHeader;
import com.smartx.tower.model.ErrorBody;
import com.smartx.tower.model.GetUploadTasksConnectionRequestBody;
import com.smartx.tower.model.GetUploadTasksRequestBody;
import com.smartx.tower.model.UploadTask;
import com.smartx.tower.model.UploadTaskConnection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UploadTaskApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UploadTaskApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UploadTaskApi(ApiClient apiClient) {
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
     * Build call for cancelUploadTask
     * @param cancelUploadTaskParams  (required)
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
    public okhttp3.Call cancelUploadTaskCall(CancelUploadTaskParams cancelUploadTaskParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = cancelUploadTaskParams;

        // create path and map variables
        String localVarPath = "/cancel-upload-task";

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
    private okhttp3.Call cancelUploadTaskValidateBeforeCall(CancelUploadTaskParams cancelUploadTaskParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'cancelUploadTaskParams' is set
        if (cancelUploadTaskParams == null) {
            throw new ApiException("Missing the required parameter 'cancelUploadTaskParams' when calling cancelUploadTask(Async)");
        }
        

        okhttp3.Call localVarCall = cancelUploadTaskCall(cancelUploadTaskParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param cancelUploadTaskParams  (required)
     * @return List&lt;String&gt;
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
    public List<String> cancelUploadTask(CancelUploadTaskParams cancelUploadTaskParams) throws ApiException {
        ApiResponse<List<String>> localVarResp = cancelUploadTaskWithHttpInfo(cancelUploadTaskParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param cancelUploadTaskParams  (required)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
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
    public ApiResponse<List<String>> cancelUploadTaskWithHttpInfo(CancelUploadTaskParams cancelUploadTaskParams) throws ApiException {
        okhttp3.Call localVarCall = cancelUploadTaskValidateBeforeCall(cancelUploadTaskParams, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param cancelUploadTaskParams  (required)
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
    public okhttp3.Call cancelUploadTaskAsync(CancelUploadTaskParams cancelUploadTaskParams, final ApiCallback<List<String>> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelUploadTaskValidateBeforeCall(cancelUploadTaskParams, _callback);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getUploadTasks
     * @param getUploadTasksRequestBody  (required)
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
    public okhttp3.Call getUploadTasksCall(GetUploadTasksRequestBody getUploadTasksRequestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getUploadTasksRequestBody;

        // create path and map variables
        String localVarPath = "/get-upload-tasks";

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
    private okhttp3.Call getUploadTasksValidateBeforeCall(GetUploadTasksRequestBody getUploadTasksRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getUploadTasksRequestBody' is set
        if (getUploadTasksRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getUploadTasksRequestBody' when calling getUploadTasks(Async)");
        }
        

        okhttp3.Call localVarCall = getUploadTasksCall(getUploadTasksRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getUploadTasksRequestBody  (required)
     * @return List&lt;UploadTask&gt;
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
    public List<UploadTask> getUploadTasks(GetUploadTasksRequestBody getUploadTasksRequestBody) throws ApiException {
        ApiResponse<List<UploadTask>> localVarResp = getUploadTasksWithHttpInfo(getUploadTasksRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getUploadTasksRequestBody  (required)
     * @return ApiResponse&lt;List&lt;UploadTask&gt;&gt;
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
    public ApiResponse<List<UploadTask>> getUploadTasksWithHttpInfo(GetUploadTasksRequestBody getUploadTasksRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getUploadTasksValidateBeforeCall(getUploadTasksRequestBody, null);
        Type localVarReturnType = new TypeToken<List<UploadTask>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getUploadTasksRequestBody  (required)
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
    public okhttp3.Call getUploadTasksAsync(GetUploadTasksRequestBody getUploadTasksRequestBody, final ApiCallback<List<UploadTask>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUploadTasksValidateBeforeCall(getUploadTasksRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<UploadTask>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getUploadTasksConnection
     * @param getUploadTasksConnectionRequestBody  (required)
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
    public okhttp3.Call getUploadTasksConnectionCall(GetUploadTasksConnectionRequestBody getUploadTasksConnectionRequestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getUploadTasksConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-upload-tasks-connection";

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
    private okhttp3.Call getUploadTasksConnectionValidateBeforeCall(GetUploadTasksConnectionRequestBody getUploadTasksConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getUploadTasksConnectionRequestBody' is set
        if (getUploadTasksConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getUploadTasksConnectionRequestBody' when calling getUploadTasksConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getUploadTasksConnectionCall(getUploadTasksConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getUploadTasksConnectionRequestBody  (required)
     * @return UploadTaskConnection
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
    public UploadTaskConnection getUploadTasksConnection(GetUploadTasksConnectionRequestBody getUploadTasksConnectionRequestBody) throws ApiException {
        ApiResponse<UploadTaskConnection> localVarResp = getUploadTasksConnectionWithHttpInfo(getUploadTasksConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getUploadTasksConnectionRequestBody  (required)
     * @return ApiResponse&lt;UploadTaskConnection&gt;
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
    public ApiResponse<UploadTaskConnection> getUploadTasksConnectionWithHttpInfo(GetUploadTasksConnectionRequestBody getUploadTasksConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getUploadTasksConnectionValidateBeforeCall(getUploadTasksConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<UploadTaskConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getUploadTasksConnectionRequestBody  (required)
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
    public okhttp3.Call getUploadTasksConnectionAsync(GetUploadTasksConnectionRequestBody getUploadTasksConnectionRequestBody, final ApiCallback<UploadTaskConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUploadTasksConnectionValidateBeforeCall(getUploadTasksConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<UploadTaskConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
