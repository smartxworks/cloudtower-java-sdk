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
import com.smartx.tower.model.GetUserAuditLogsConnectionRequestBody;
import com.smartx.tower.model.GetUserAuditLogsRequestBody;
import com.smartx.tower.model.UserAuditLog;
import com.smartx.tower.model.UserAuditLogConnection;
import com.smartx.tower.model.UserAuditLogCreationParams;
import com.smartx.tower.model.WithTaskUserAuditLog;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserAuditLogApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UserAuditLogApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserAuditLogApi(ApiClient apiClient) {
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
     * Build call for createUserAuditLog
     * @param userAuditLogCreationParams  (required)
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
    public okhttp3.Call createUserAuditLogCall(List<UserAuditLogCreationParams> userAuditLogCreationParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = userAuditLogCreationParams;

        // create path and map variables
        String localVarPath = "/create-user-audit-log";

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
    private okhttp3.Call createUserAuditLogValidateBeforeCall(List<UserAuditLogCreationParams> userAuditLogCreationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userAuditLogCreationParams' is set
        if (userAuditLogCreationParams == null) {
            throw new ApiException("Missing the required parameter 'userAuditLogCreationParams' when calling createUserAuditLog(Async)");
        }
        

        okhttp3.Call localVarCall = createUserAuditLogCall(userAuditLogCreationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param userAuditLogCreationParams  (required)
     * @return List&lt;WithTaskUserAuditLog&gt;
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
    public List<WithTaskUserAuditLog> createUserAuditLog(List<UserAuditLogCreationParams> userAuditLogCreationParams) throws ApiException {
        ApiResponse<List<WithTaskUserAuditLog>> localVarResp = createUserAuditLogWithHttpInfo(userAuditLogCreationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param userAuditLogCreationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskUserAuditLog&gt;&gt;
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
    public ApiResponse<List<WithTaskUserAuditLog>> createUserAuditLogWithHttpInfo(List<UserAuditLogCreationParams> userAuditLogCreationParams) throws ApiException {
        okhttp3.Call localVarCall = createUserAuditLogValidateBeforeCall(userAuditLogCreationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskUserAuditLog>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param userAuditLogCreationParams  (required)
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
    public okhttp3.Call createUserAuditLogAsync(List<UserAuditLogCreationParams> userAuditLogCreationParams, final ApiCallback<List<WithTaskUserAuditLog>> _callback) throws ApiException {

        okhttp3.Call localVarCall = createUserAuditLogValidateBeforeCall(userAuditLogCreationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskUserAuditLog>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getUserAuditLogs
     * @param getUserAuditLogsRequestBody  (required)
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
    public okhttp3.Call getUserAuditLogsCall(GetUserAuditLogsRequestBody getUserAuditLogsRequestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getUserAuditLogsRequestBody;

        // create path and map variables
        String localVarPath = "/get-user-audit-logs";

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
    private okhttp3.Call getUserAuditLogsValidateBeforeCall(GetUserAuditLogsRequestBody getUserAuditLogsRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getUserAuditLogsRequestBody' is set
        if (getUserAuditLogsRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getUserAuditLogsRequestBody' when calling getUserAuditLogs(Async)");
        }
        

        okhttp3.Call localVarCall = getUserAuditLogsCall(getUserAuditLogsRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getUserAuditLogsRequestBody  (required)
     * @return List&lt;UserAuditLog&gt;
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
    public List<UserAuditLog> getUserAuditLogs(GetUserAuditLogsRequestBody getUserAuditLogsRequestBody) throws ApiException {
        ApiResponse<List<UserAuditLog>> localVarResp = getUserAuditLogsWithHttpInfo(getUserAuditLogsRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getUserAuditLogsRequestBody  (required)
     * @return ApiResponse&lt;List&lt;UserAuditLog&gt;&gt;
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
    public ApiResponse<List<UserAuditLog>> getUserAuditLogsWithHttpInfo(GetUserAuditLogsRequestBody getUserAuditLogsRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getUserAuditLogsValidateBeforeCall(getUserAuditLogsRequestBody, null);
        Type localVarReturnType = new TypeToken<List<UserAuditLog>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getUserAuditLogsRequestBody  (required)
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
    public okhttp3.Call getUserAuditLogsAsync(GetUserAuditLogsRequestBody getUserAuditLogsRequestBody, final ApiCallback<List<UserAuditLog>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserAuditLogsValidateBeforeCall(getUserAuditLogsRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<UserAuditLog>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getUserAuditLogsConnection
     * @param getUserAuditLogsConnectionRequestBody  (required)
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
    public okhttp3.Call getUserAuditLogsConnectionCall(GetUserAuditLogsConnectionRequestBody getUserAuditLogsConnectionRequestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getUserAuditLogsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-user-audit-logs-connection";

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
    private okhttp3.Call getUserAuditLogsConnectionValidateBeforeCall(GetUserAuditLogsConnectionRequestBody getUserAuditLogsConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getUserAuditLogsConnectionRequestBody' is set
        if (getUserAuditLogsConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getUserAuditLogsConnectionRequestBody' when calling getUserAuditLogsConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getUserAuditLogsConnectionCall(getUserAuditLogsConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getUserAuditLogsConnectionRequestBody  (required)
     * @return UserAuditLogConnection
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
    public UserAuditLogConnection getUserAuditLogsConnection(GetUserAuditLogsConnectionRequestBody getUserAuditLogsConnectionRequestBody) throws ApiException {
        ApiResponse<UserAuditLogConnection> localVarResp = getUserAuditLogsConnectionWithHttpInfo(getUserAuditLogsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getUserAuditLogsConnectionRequestBody  (required)
     * @return ApiResponse&lt;UserAuditLogConnection&gt;
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
    public ApiResponse<UserAuditLogConnection> getUserAuditLogsConnectionWithHttpInfo(GetUserAuditLogsConnectionRequestBody getUserAuditLogsConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getUserAuditLogsConnectionValidateBeforeCall(getUserAuditLogsConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<UserAuditLogConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getUserAuditLogsConnectionRequestBody  (required)
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
    public okhttp3.Call getUserAuditLogsConnectionAsync(GetUserAuditLogsConnectionRequestBody getUserAuditLogsConnectionRequestBody, final ApiCallback<UserAuditLogConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserAuditLogsConnectionValidateBeforeCall(getUserAuditLogsConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<UserAuditLogConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
