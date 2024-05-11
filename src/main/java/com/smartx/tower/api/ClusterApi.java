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


import com.smartx.tower.model.Cluster;
import com.smartx.tower.model.ClusterConnection;
import com.smartx.tower.model.ClusterCreationParams;
import com.smartx.tower.model.ClusterDeletionParams;
import com.smartx.tower.model.ClusterEnableIscsiUpdationParams;
import com.smartx.tower.model.ClusterHaUpdationParams;
import com.smartx.tower.model.ClusterLicenseUpdationParams;
import com.smartx.tower.model.ClusterNetworkSettingUpdationParams;
import com.smartx.tower.model.ClusterUpdationParams;
import com.smartx.tower.model.ClusterVirtualizationUpdationParams;
import com.smartx.tower.model.CommonHeader;
import com.smartx.tower.model.ErrorBody;
import com.smartx.tower.model.GetClustersConnectionRequestBody;
import com.smartx.tower.model.GetClustersRequestBody;
import com.smartx.tower.model.GetMetaLeaderRequestBody;
import com.smartx.tower.model.MetaLeader;
import com.smartx.tower.model.WithTaskCluster;
import com.smartx.tower.model.WithTaskClusterSettings;
import com.smartx.tower.model.WithTaskDeleteCluster;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClusterApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ClusterApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ClusterApi(ApiClient apiClient) {
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
     * Build call for connectCluster
     * @param clusterCreationParams  (required)
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
    public okhttp3.Call connectClusterCall(List<ClusterCreationParams> clusterCreationParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = clusterCreationParams;

        // create path and map variables
        String localVarPath = "/connect-cluster";

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
    private okhttp3.Call connectClusterValidateBeforeCall(List<ClusterCreationParams> clusterCreationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'clusterCreationParams' is set
        if (clusterCreationParams == null) {
            throw new ApiException("Missing the required parameter 'clusterCreationParams' when calling connectCluster(Async)");
        }
        

        okhttp3.Call localVarCall = connectClusterCall(clusterCreationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param clusterCreationParams  (required)
     * @return List&lt;WithTaskCluster&gt;
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
    public List<WithTaskCluster> connectCluster(List<ClusterCreationParams> clusterCreationParams) throws ApiException {
        ApiResponse<List<WithTaskCluster>> localVarResp = connectClusterWithHttpInfo(clusterCreationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param clusterCreationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskCluster&gt;&gt;
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
    public ApiResponse<List<WithTaskCluster>> connectClusterWithHttpInfo(List<ClusterCreationParams> clusterCreationParams) throws ApiException {
        okhttp3.Call localVarCall = connectClusterValidateBeforeCall(clusterCreationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskCluster>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param clusterCreationParams  (required)
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
    public okhttp3.Call connectClusterAsync(List<ClusterCreationParams> clusterCreationParams, final ApiCallback<List<WithTaskCluster>> _callback) throws ApiException {

        okhttp3.Call localVarCall = connectClusterValidateBeforeCall(clusterCreationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskCluster>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteCluster
     * @param clusterDeletionParams  (required)
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
    public okhttp3.Call deleteClusterCall(ClusterDeletionParams clusterDeletionParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = clusterDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-cluster";

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
    private okhttp3.Call deleteClusterValidateBeforeCall(ClusterDeletionParams clusterDeletionParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'clusterDeletionParams' is set
        if (clusterDeletionParams == null) {
            throw new ApiException("Missing the required parameter 'clusterDeletionParams' when calling deleteCluster(Async)");
        }
        

        okhttp3.Call localVarCall = deleteClusterCall(clusterDeletionParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param clusterDeletionParams  (required)
     * @return List&lt;WithTaskDeleteCluster&gt;
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
    public List<WithTaskDeleteCluster> deleteCluster(ClusterDeletionParams clusterDeletionParams) throws ApiException {
        ApiResponse<List<WithTaskDeleteCluster>> localVarResp = deleteClusterWithHttpInfo(clusterDeletionParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param clusterDeletionParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteCluster&gt;&gt;
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
    public ApiResponse<List<WithTaskDeleteCluster>> deleteClusterWithHttpInfo(ClusterDeletionParams clusterDeletionParams) throws ApiException {
        okhttp3.Call localVarCall = deleteClusterValidateBeforeCall(clusterDeletionParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteCluster>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param clusterDeletionParams  (required)
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
    public okhttp3.Call deleteClusterAsync(ClusterDeletionParams clusterDeletionParams, final ApiCallback<List<WithTaskDeleteCluster>> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteClusterValidateBeforeCall(clusterDeletionParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteCluster>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getClusters
     * @param getClustersRequestBody  (required)
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
    public okhttp3.Call getClustersCall(GetClustersRequestBody getClustersRequestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getClustersRequestBody;

        // create path and map variables
        String localVarPath = "/get-clusters";

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
    private okhttp3.Call getClustersValidateBeforeCall(GetClustersRequestBody getClustersRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getClustersRequestBody' is set
        if (getClustersRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getClustersRequestBody' when calling getClusters(Async)");
        }
        

        okhttp3.Call localVarCall = getClustersCall(getClustersRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getClustersRequestBody  (required)
     * @return List&lt;Cluster&gt;
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
    public List<Cluster> getClusters(GetClustersRequestBody getClustersRequestBody) throws ApiException {
        ApiResponse<List<Cluster>> localVarResp = getClustersWithHttpInfo(getClustersRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getClustersRequestBody  (required)
     * @return ApiResponse&lt;List&lt;Cluster&gt;&gt;
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
    public ApiResponse<List<Cluster>> getClustersWithHttpInfo(GetClustersRequestBody getClustersRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getClustersValidateBeforeCall(getClustersRequestBody, null);
        Type localVarReturnType = new TypeToken<List<Cluster>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getClustersRequestBody  (required)
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
    public okhttp3.Call getClustersAsync(GetClustersRequestBody getClustersRequestBody, final ApiCallback<List<Cluster>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getClustersValidateBeforeCall(getClustersRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<Cluster>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getClustersConnection
     * @param getClustersConnectionRequestBody  (required)
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
    public okhttp3.Call getClustersConnectionCall(GetClustersConnectionRequestBody getClustersConnectionRequestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getClustersConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-clusters-connection";

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
    private okhttp3.Call getClustersConnectionValidateBeforeCall(GetClustersConnectionRequestBody getClustersConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getClustersConnectionRequestBody' is set
        if (getClustersConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getClustersConnectionRequestBody' when calling getClustersConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getClustersConnectionCall(getClustersConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getClustersConnectionRequestBody  (required)
     * @return ClusterConnection
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
    public ClusterConnection getClustersConnection(GetClustersConnectionRequestBody getClustersConnectionRequestBody) throws ApiException {
        ApiResponse<ClusterConnection> localVarResp = getClustersConnectionWithHttpInfo(getClustersConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getClustersConnectionRequestBody  (required)
     * @return ApiResponse&lt;ClusterConnection&gt;
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
    public ApiResponse<ClusterConnection> getClustersConnectionWithHttpInfo(GetClustersConnectionRequestBody getClustersConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getClustersConnectionValidateBeforeCall(getClustersConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<ClusterConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getClustersConnectionRequestBody  (required)
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
    public okhttp3.Call getClustersConnectionAsync(GetClustersConnectionRequestBody getClustersConnectionRequestBody, final ApiCallback<ClusterConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getClustersConnectionValidateBeforeCall(getClustersConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<ClusterConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMetaLeader
     * @param getMetaLeaderRequestBody  (required)
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
    public okhttp3.Call getMetaLeaderCall(GetMetaLeaderRequestBody getMetaLeaderRequestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getMetaLeaderRequestBody;

        // create path and map variables
        String localVarPath = "/get-meta-leader";

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
    private okhttp3.Call getMetaLeaderValidateBeforeCall(GetMetaLeaderRequestBody getMetaLeaderRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getMetaLeaderRequestBody' is set
        if (getMetaLeaderRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getMetaLeaderRequestBody' when calling getMetaLeader(Async)");
        }
        

        okhttp3.Call localVarCall = getMetaLeaderCall(getMetaLeaderRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getMetaLeaderRequestBody  (required)
     * @return List&lt;MetaLeader&gt;
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
    public List<MetaLeader> getMetaLeader(GetMetaLeaderRequestBody getMetaLeaderRequestBody) throws ApiException {
        ApiResponse<List<MetaLeader>> localVarResp = getMetaLeaderWithHttpInfo(getMetaLeaderRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getMetaLeaderRequestBody  (required)
     * @return ApiResponse&lt;List&lt;MetaLeader&gt;&gt;
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
    public ApiResponse<List<MetaLeader>> getMetaLeaderWithHttpInfo(GetMetaLeaderRequestBody getMetaLeaderRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getMetaLeaderValidateBeforeCall(getMetaLeaderRequestBody, null);
        Type localVarReturnType = new TypeToken<List<MetaLeader>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getMetaLeaderRequestBody  (required)
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
    public okhttp3.Call getMetaLeaderAsync(GetMetaLeaderRequestBody getMetaLeaderRequestBody, final ApiCallback<List<MetaLeader>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMetaLeaderValidateBeforeCall(getMetaLeaderRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<MetaLeader>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateCluster
     * @param clusterUpdationParams  (required)
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
    public okhttp3.Call updateClusterCall(ClusterUpdationParams clusterUpdationParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = clusterUpdationParams;

        // create path and map variables
        String localVarPath = "/update-cluster";

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
    private okhttp3.Call updateClusterValidateBeforeCall(ClusterUpdationParams clusterUpdationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'clusterUpdationParams' is set
        if (clusterUpdationParams == null) {
            throw new ApiException("Missing the required parameter 'clusterUpdationParams' when calling updateCluster(Async)");
        }
        

        okhttp3.Call localVarCall = updateClusterCall(clusterUpdationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param clusterUpdationParams  (required)
     * @return List&lt;WithTaskCluster&gt;
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
    public List<WithTaskCluster> updateCluster(ClusterUpdationParams clusterUpdationParams) throws ApiException {
        ApiResponse<List<WithTaskCluster>> localVarResp = updateClusterWithHttpInfo(clusterUpdationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param clusterUpdationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskCluster&gt;&gt;
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
    public ApiResponse<List<WithTaskCluster>> updateClusterWithHttpInfo(ClusterUpdationParams clusterUpdationParams) throws ApiException {
        okhttp3.Call localVarCall = updateClusterValidateBeforeCall(clusterUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskCluster>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param clusterUpdationParams  (required)
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
    public okhttp3.Call updateClusterAsync(ClusterUpdationParams clusterUpdationParams, final ApiCallback<List<WithTaskCluster>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateClusterValidateBeforeCall(clusterUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskCluster>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateClusterEnableISCSISetting
     * @param clusterEnableIscsiUpdationParams  (required)
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
    public okhttp3.Call updateClusterEnableISCSISettingCall(ClusterEnableIscsiUpdationParams clusterEnableIscsiUpdationParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = clusterEnableIscsiUpdationParams;

        // create path and map variables
        String localVarPath = "/update-cluster-enable-iscsi-setting";

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
    private okhttp3.Call updateClusterEnableISCSISettingValidateBeforeCall(ClusterEnableIscsiUpdationParams clusterEnableIscsiUpdationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'clusterEnableIscsiUpdationParams' is set
        if (clusterEnableIscsiUpdationParams == null) {
            throw new ApiException("Missing the required parameter 'clusterEnableIscsiUpdationParams' when calling updateClusterEnableISCSISetting(Async)");
        }
        

        okhttp3.Call localVarCall = updateClusterEnableISCSISettingCall(clusterEnableIscsiUpdationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param clusterEnableIscsiUpdationParams  (required)
     * @return List&lt;WithTaskClusterSettings&gt;
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
    public List<WithTaskClusterSettings> updateClusterEnableISCSISetting(ClusterEnableIscsiUpdationParams clusterEnableIscsiUpdationParams) throws ApiException {
        ApiResponse<List<WithTaskClusterSettings>> localVarResp = updateClusterEnableISCSISettingWithHttpInfo(clusterEnableIscsiUpdationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param clusterEnableIscsiUpdationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskClusterSettings&gt;&gt;
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
    public ApiResponse<List<WithTaskClusterSettings>> updateClusterEnableISCSISettingWithHttpInfo(ClusterEnableIscsiUpdationParams clusterEnableIscsiUpdationParams) throws ApiException {
        okhttp3.Call localVarCall = updateClusterEnableISCSISettingValidateBeforeCall(clusterEnableIscsiUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskClusterSettings>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param clusterEnableIscsiUpdationParams  (required)
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
    public okhttp3.Call updateClusterEnableISCSISettingAsync(ClusterEnableIscsiUpdationParams clusterEnableIscsiUpdationParams, final ApiCallback<List<WithTaskClusterSettings>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateClusterEnableISCSISettingValidateBeforeCall(clusterEnableIscsiUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskClusterSettings>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateClusterHaSetting
     * @param clusterHaUpdationParams  (required)
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
    public okhttp3.Call updateClusterHaSettingCall(ClusterHaUpdationParams clusterHaUpdationParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = clusterHaUpdationParams;

        // create path and map variables
        String localVarPath = "/update-cluster-ha-setting";

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
    private okhttp3.Call updateClusterHaSettingValidateBeforeCall(ClusterHaUpdationParams clusterHaUpdationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'clusterHaUpdationParams' is set
        if (clusterHaUpdationParams == null) {
            throw new ApiException("Missing the required parameter 'clusterHaUpdationParams' when calling updateClusterHaSetting(Async)");
        }
        

        okhttp3.Call localVarCall = updateClusterHaSettingCall(clusterHaUpdationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param clusterHaUpdationParams  (required)
     * @return List&lt;WithTaskClusterSettings&gt;
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
    public List<WithTaskClusterSettings> updateClusterHaSetting(ClusterHaUpdationParams clusterHaUpdationParams) throws ApiException {
        ApiResponse<List<WithTaskClusterSettings>> localVarResp = updateClusterHaSettingWithHttpInfo(clusterHaUpdationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param clusterHaUpdationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskClusterSettings&gt;&gt;
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
    public ApiResponse<List<WithTaskClusterSettings>> updateClusterHaSettingWithHttpInfo(ClusterHaUpdationParams clusterHaUpdationParams) throws ApiException {
        okhttp3.Call localVarCall = updateClusterHaSettingValidateBeforeCall(clusterHaUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskClusterSettings>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param clusterHaUpdationParams  (required)
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
    public okhttp3.Call updateClusterHaSettingAsync(ClusterHaUpdationParams clusterHaUpdationParams, final ApiCallback<List<WithTaskClusterSettings>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateClusterHaSettingValidateBeforeCall(clusterHaUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskClusterSettings>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateClusterLicense
     * @param clusterLicenseUpdationParams  (required)
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
    public okhttp3.Call updateClusterLicenseCall(ClusterLicenseUpdationParams clusterLicenseUpdationParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = clusterLicenseUpdationParams;

        // create path and map variables
        String localVarPath = "/update-cluster-license";

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
    private okhttp3.Call updateClusterLicenseValidateBeforeCall(ClusterLicenseUpdationParams clusterLicenseUpdationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'clusterLicenseUpdationParams' is set
        if (clusterLicenseUpdationParams == null) {
            throw new ApiException("Missing the required parameter 'clusterLicenseUpdationParams' when calling updateClusterLicense(Async)");
        }
        

        okhttp3.Call localVarCall = updateClusterLicenseCall(clusterLicenseUpdationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param clusterLicenseUpdationParams  (required)
     * @return List&lt;WithTaskCluster&gt;
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
    public List<WithTaskCluster> updateClusterLicense(ClusterLicenseUpdationParams clusterLicenseUpdationParams) throws ApiException {
        ApiResponse<List<WithTaskCluster>> localVarResp = updateClusterLicenseWithHttpInfo(clusterLicenseUpdationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param clusterLicenseUpdationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskCluster&gt;&gt;
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
    public ApiResponse<List<WithTaskCluster>> updateClusterLicenseWithHttpInfo(ClusterLicenseUpdationParams clusterLicenseUpdationParams) throws ApiException {
        okhttp3.Call localVarCall = updateClusterLicenseValidateBeforeCall(clusterLicenseUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskCluster>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param clusterLicenseUpdationParams  (required)
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
    public okhttp3.Call updateClusterLicenseAsync(ClusterLicenseUpdationParams clusterLicenseUpdationParams, final ApiCallback<List<WithTaskCluster>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateClusterLicenseValidateBeforeCall(clusterLicenseUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskCluster>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateClusterNetworkSetting
     * @param clusterNetworkSettingUpdationParams  (required)
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
    public okhttp3.Call updateClusterNetworkSettingCall(ClusterNetworkSettingUpdationParams clusterNetworkSettingUpdationParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = clusterNetworkSettingUpdationParams;

        // create path and map variables
        String localVarPath = "/update-cluster-network-setting";

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
    private okhttp3.Call updateClusterNetworkSettingValidateBeforeCall(ClusterNetworkSettingUpdationParams clusterNetworkSettingUpdationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'clusterNetworkSettingUpdationParams' is set
        if (clusterNetworkSettingUpdationParams == null) {
            throw new ApiException("Missing the required parameter 'clusterNetworkSettingUpdationParams' when calling updateClusterNetworkSetting(Async)");
        }
        

        okhttp3.Call localVarCall = updateClusterNetworkSettingCall(clusterNetworkSettingUpdationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param clusterNetworkSettingUpdationParams  (required)
     * @return List&lt;WithTaskCluster&gt;
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
    public List<WithTaskCluster> updateClusterNetworkSetting(ClusterNetworkSettingUpdationParams clusterNetworkSettingUpdationParams) throws ApiException {
        ApiResponse<List<WithTaskCluster>> localVarResp = updateClusterNetworkSettingWithHttpInfo(clusterNetworkSettingUpdationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param clusterNetworkSettingUpdationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskCluster&gt;&gt;
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
    public ApiResponse<List<WithTaskCluster>> updateClusterNetworkSettingWithHttpInfo(ClusterNetworkSettingUpdationParams clusterNetworkSettingUpdationParams) throws ApiException {
        okhttp3.Call localVarCall = updateClusterNetworkSettingValidateBeforeCall(clusterNetworkSettingUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskCluster>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param clusterNetworkSettingUpdationParams  (required)
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
    public okhttp3.Call updateClusterNetworkSettingAsync(ClusterNetworkSettingUpdationParams clusterNetworkSettingUpdationParams, final ApiCallback<List<WithTaskCluster>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateClusterNetworkSettingValidateBeforeCall(clusterNetworkSettingUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskCluster>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateClusterVirtualizationSetting
     * @param clusterVirtualizationUpdationParams  (required)
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
    public okhttp3.Call updateClusterVirtualizationSettingCall(ClusterVirtualizationUpdationParams clusterVirtualizationUpdationParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = clusterVirtualizationUpdationParams;

        // create path and map variables
        String localVarPath = "/update-cluster-virtualization-setting";

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
    private okhttp3.Call updateClusterVirtualizationSettingValidateBeforeCall(ClusterVirtualizationUpdationParams clusterVirtualizationUpdationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'clusterVirtualizationUpdationParams' is set
        if (clusterVirtualizationUpdationParams == null) {
            throw new ApiException("Missing the required parameter 'clusterVirtualizationUpdationParams' when calling updateClusterVirtualizationSetting(Async)");
        }
        

        okhttp3.Call localVarCall = updateClusterVirtualizationSettingCall(clusterVirtualizationUpdationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param clusterVirtualizationUpdationParams  (required)
     * @return List&lt;WithTaskCluster&gt;
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
    public List<WithTaskCluster> updateClusterVirtualizationSetting(ClusterVirtualizationUpdationParams clusterVirtualizationUpdationParams) throws ApiException {
        ApiResponse<List<WithTaskCluster>> localVarResp = updateClusterVirtualizationSettingWithHttpInfo(clusterVirtualizationUpdationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param clusterVirtualizationUpdationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskCluster&gt;&gt;
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
    public ApiResponse<List<WithTaskCluster>> updateClusterVirtualizationSettingWithHttpInfo(ClusterVirtualizationUpdationParams clusterVirtualizationUpdationParams) throws ApiException {
        okhttp3.Call localVarCall = updateClusterVirtualizationSettingValidateBeforeCall(clusterVirtualizationUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskCluster>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param clusterVirtualizationUpdationParams  (required)
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
    public okhttp3.Call updateClusterVirtualizationSettingAsync(ClusterVirtualizationUpdationParams clusterVirtualizationUpdationParams, final ApiCallback<List<WithTaskCluster>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateClusterVirtualizationSettingValidateBeforeCall(clusterVirtualizationUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskCluster>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
