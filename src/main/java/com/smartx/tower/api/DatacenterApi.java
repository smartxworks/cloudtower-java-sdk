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


import com.smartx.tower.model.AddClustersToDatacenterParams;
import com.smartx.tower.model.CommonHeader;
import com.smartx.tower.model.Datacenter;
import com.smartx.tower.model.DatacenterConnection;
import com.smartx.tower.model.DatacenterCreationParams;
import com.smartx.tower.model.DatacenterDeletionParams;
import com.smartx.tower.model.DatacenterUpdationParams;
import com.smartx.tower.model.ErrorBody;
import com.smartx.tower.model.GetDatacentersConnectionRequestBody;
import com.smartx.tower.model.GetDatacentersRequestBody;
import com.smartx.tower.model.RemoveClustersFromDatacenterParams;
import com.smartx.tower.model.WithTaskDatacenter;
import com.smartx.tower.model.WithTaskDeleteDatacenter;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatacenterApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DatacenterApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DatacenterApi(ApiClient apiClient) {
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
     * Build call for addClustersToDatacenter
     * @param addClustersToDatacenterParams  (required)
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
    public okhttp3.Call addClustersToDatacenterCall(List<AddClustersToDatacenterParams> addClustersToDatacenterParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = addClustersToDatacenterParams;

        // create path and map variables
        String localVarPath = "/add-clusters-to-datacenter";

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
    private okhttp3.Call addClustersToDatacenterValidateBeforeCall(List<AddClustersToDatacenterParams> addClustersToDatacenterParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'addClustersToDatacenterParams' is set
        if (addClustersToDatacenterParams == null) {
            throw new ApiException("Missing the required parameter 'addClustersToDatacenterParams' when calling addClustersToDatacenter(Async)");
        }
        

        okhttp3.Call localVarCall = addClustersToDatacenterCall(addClustersToDatacenterParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param addClustersToDatacenterParams  (required)
     * @return List&lt;WithTaskDatacenter&gt;
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
    public List<WithTaskDatacenter> addClustersToDatacenter(List<AddClustersToDatacenterParams> addClustersToDatacenterParams) throws ApiException {
        ApiResponse<List<WithTaskDatacenter>> localVarResp = addClustersToDatacenterWithHttpInfo(addClustersToDatacenterParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param addClustersToDatacenterParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskDatacenter&gt;&gt;
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
    public ApiResponse<List<WithTaskDatacenter>> addClustersToDatacenterWithHttpInfo(List<AddClustersToDatacenterParams> addClustersToDatacenterParams) throws ApiException {
        okhttp3.Call localVarCall = addClustersToDatacenterValidateBeforeCall(addClustersToDatacenterParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDatacenter>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param addClustersToDatacenterParams  (required)
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
    public okhttp3.Call addClustersToDatacenterAsync(List<AddClustersToDatacenterParams> addClustersToDatacenterParams, final ApiCallback<List<WithTaskDatacenter>> _callback) throws ApiException {

        okhttp3.Call localVarCall = addClustersToDatacenterValidateBeforeCall(addClustersToDatacenterParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDatacenter>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createDatacenter
     * @param datacenterCreationParams  (required)
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
    public okhttp3.Call createDatacenterCall(List<DatacenterCreationParams> datacenterCreationParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = datacenterCreationParams;

        // create path and map variables
        String localVarPath = "/create-datacenter";

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
    private okhttp3.Call createDatacenterValidateBeforeCall(List<DatacenterCreationParams> datacenterCreationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'datacenterCreationParams' is set
        if (datacenterCreationParams == null) {
            throw new ApiException("Missing the required parameter 'datacenterCreationParams' when calling createDatacenter(Async)");
        }
        

        okhttp3.Call localVarCall = createDatacenterCall(datacenterCreationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param datacenterCreationParams  (required)
     * @return List&lt;WithTaskDatacenter&gt;
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
    public List<WithTaskDatacenter> createDatacenter(List<DatacenterCreationParams> datacenterCreationParams) throws ApiException {
        ApiResponse<List<WithTaskDatacenter>> localVarResp = createDatacenterWithHttpInfo(datacenterCreationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param datacenterCreationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskDatacenter&gt;&gt;
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
    public ApiResponse<List<WithTaskDatacenter>> createDatacenterWithHttpInfo(List<DatacenterCreationParams> datacenterCreationParams) throws ApiException {
        okhttp3.Call localVarCall = createDatacenterValidateBeforeCall(datacenterCreationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDatacenter>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param datacenterCreationParams  (required)
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
    public okhttp3.Call createDatacenterAsync(List<DatacenterCreationParams> datacenterCreationParams, final ApiCallback<List<WithTaskDatacenter>> _callback) throws ApiException {

        okhttp3.Call localVarCall = createDatacenterValidateBeforeCall(datacenterCreationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDatacenter>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteDatacenter
     * @param datacenterDeletionParams  (required)
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
    public okhttp3.Call deleteDatacenterCall(DatacenterDeletionParams datacenterDeletionParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = datacenterDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-datacenter";

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
    private okhttp3.Call deleteDatacenterValidateBeforeCall(DatacenterDeletionParams datacenterDeletionParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'datacenterDeletionParams' is set
        if (datacenterDeletionParams == null) {
            throw new ApiException("Missing the required parameter 'datacenterDeletionParams' when calling deleteDatacenter(Async)");
        }
        

        okhttp3.Call localVarCall = deleteDatacenterCall(datacenterDeletionParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param datacenterDeletionParams  (required)
     * @return List&lt;WithTaskDeleteDatacenter&gt;
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
    public List<WithTaskDeleteDatacenter> deleteDatacenter(DatacenterDeletionParams datacenterDeletionParams) throws ApiException {
        ApiResponse<List<WithTaskDeleteDatacenter>> localVarResp = deleteDatacenterWithHttpInfo(datacenterDeletionParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param datacenterDeletionParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteDatacenter&gt;&gt;
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
    public ApiResponse<List<WithTaskDeleteDatacenter>> deleteDatacenterWithHttpInfo(DatacenterDeletionParams datacenterDeletionParams) throws ApiException {
        okhttp3.Call localVarCall = deleteDatacenterValidateBeforeCall(datacenterDeletionParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteDatacenter>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param datacenterDeletionParams  (required)
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
    public okhttp3.Call deleteDatacenterAsync(DatacenterDeletionParams datacenterDeletionParams, final ApiCallback<List<WithTaskDeleteDatacenter>> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteDatacenterValidateBeforeCall(datacenterDeletionParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteDatacenter>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDatacenters
     * @param getDatacentersRequestBody  (required)
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
    public okhttp3.Call getDatacentersCall(GetDatacentersRequestBody getDatacentersRequestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getDatacentersRequestBody;

        // create path and map variables
        String localVarPath = "/get-datacenters";

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
    private okhttp3.Call getDatacentersValidateBeforeCall(GetDatacentersRequestBody getDatacentersRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getDatacentersRequestBody' is set
        if (getDatacentersRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getDatacentersRequestBody' when calling getDatacenters(Async)");
        }
        

        okhttp3.Call localVarCall = getDatacentersCall(getDatacentersRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getDatacentersRequestBody  (required)
     * @return List&lt;Datacenter&gt;
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
    public List<Datacenter> getDatacenters(GetDatacentersRequestBody getDatacentersRequestBody) throws ApiException {
        ApiResponse<List<Datacenter>> localVarResp = getDatacentersWithHttpInfo(getDatacentersRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getDatacentersRequestBody  (required)
     * @return ApiResponse&lt;List&lt;Datacenter&gt;&gt;
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
    public ApiResponse<List<Datacenter>> getDatacentersWithHttpInfo(GetDatacentersRequestBody getDatacentersRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getDatacentersValidateBeforeCall(getDatacentersRequestBody, null);
        Type localVarReturnType = new TypeToken<List<Datacenter>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getDatacentersRequestBody  (required)
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
    public okhttp3.Call getDatacentersAsync(GetDatacentersRequestBody getDatacentersRequestBody, final ApiCallback<List<Datacenter>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDatacentersValidateBeforeCall(getDatacentersRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<Datacenter>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDatacentersConnection
     * @param getDatacentersConnectionRequestBody  (required)
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
    public okhttp3.Call getDatacentersConnectionCall(GetDatacentersConnectionRequestBody getDatacentersConnectionRequestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getDatacentersConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-datacenters-connection";

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
    private okhttp3.Call getDatacentersConnectionValidateBeforeCall(GetDatacentersConnectionRequestBody getDatacentersConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getDatacentersConnectionRequestBody' is set
        if (getDatacentersConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getDatacentersConnectionRequestBody' when calling getDatacentersConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getDatacentersConnectionCall(getDatacentersConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getDatacentersConnectionRequestBody  (required)
     * @return DatacenterConnection
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
    public DatacenterConnection getDatacentersConnection(GetDatacentersConnectionRequestBody getDatacentersConnectionRequestBody) throws ApiException {
        ApiResponse<DatacenterConnection> localVarResp = getDatacentersConnectionWithHttpInfo(getDatacentersConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getDatacentersConnectionRequestBody  (required)
     * @return ApiResponse&lt;DatacenterConnection&gt;
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
    public ApiResponse<DatacenterConnection> getDatacentersConnectionWithHttpInfo(GetDatacentersConnectionRequestBody getDatacentersConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getDatacentersConnectionValidateBeforeCall(getDatacentersConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<DatacenterConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getDatacentersConnectionRequestBody  (required)
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
    public okhttp3.Call getDatacentersConnectionAsync(GetDatacentersConnectionRequestBody getDatacentersConnectionRequestBody, final ApiCallback<DatacenterConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDatacentersConnectionValidateBeforeCall(getDatacentersConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<DatacenterConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for removeClustersFromDatacenter
     * @param removeClustersFromDatacenterParams  (required)
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
    public okhttp3.Call removeClustersFromDatacenterCall(List<RemoveClustersFromDatacenterParams> removeClustersFromDatacenterParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = removeClustersFromDatacenterParams;

        // create path and map variables
        String localVarPath = "/remove-clusters-from-datacenter";

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
    private okhttp3.Call removeClustersFromDatacenterValidateBeforeCall(List<RemoveClustersFromDatacenterParams> removeClustersFromDatacenterParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'removeClustersFromDatacenterParams' is set
        if (removeClustersFromDatacenterParams == null) {
            throw new ApiException("Missing the required parameter 'removeClustersFromDatacenterParams' when calling removeClustersFromDatacenter(Async)");
        }
        

        okhttp3.Call localVarCall = removeClustersFromDatacenterCall(removeClustersFromDatacenterParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param removeClustersFromDatacenterParams  (required)
     * @return List&lt;WithTaskDatacenter&gt;
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
    public List<WithTaskDatacenter> removeClustersFromDatacenter(List<RemoveClustersFromDatacenterParams> removeClustersFromDatacenterParams) throws ApiException {
        ApiResponse<List<WithTaskDatacenter>> localVarResp = removeClustersFromDatacenterWithHttpInfo(removeClustersFromDatacenterParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param removeClustersFromDatacenterParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskDatacenter&gt;&gt;
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
    public ApiResponse<List<WithTaskDatacenter>> removeClustersFromDatacenterWithHttpInfo(List<RemoveClustersFromDatacenterParams> removeClustersFromDatacenterParams) throws ApiException {
        okhttp3.Call localVarCall = removeClustersFromDatacenterValidateBeforeCall(removeClustersFromDatacenterParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDatacenter>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param removeClustersFromDatacenterParams  (required)
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
    public okhttp3.Call removeClustersFromDatacenterAsync(List<RemoveClustersFromDatacenterParams> removeClustersFromDatacenterParams, final ApiCallback<List<WithTaskDatacenter>> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeClustersFromDatacenterValidateBeforeCall(removeClustersFromDatacenterParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDatacenter>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateDatacenter
     * @param datacenterUpdationParams  (required)
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
    public okhttp3.Call updateDatacenterCall(DatacenterUpdationParams datacenterUpdationParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = datacenterUpdationParams;

        // create path and map variables
        String localVarPath = "/update-datacenter";

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
    private okhttp3.Call updateDatacenterValidateBeforeCall(DatacenterUpdationParams datacenterUpdationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'datacenterUpdationParams' is set
        if (datacenterUpdationParams == null) {
            throw new ApiException("Missing the required parameter 'datacenterUpdationParams' when calling updateDatacenter(Async)");
        }
        

        okhttp3.Call localVarCall = updateDatacenterCall(datacenterUpdationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param datacenterUpdationParams  (required)
     * @return List&lt;WithTaskDatacenter&gt;
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
    public List<WithTaskDatacenter> updateDatacenter(DatacenterUpdationParams datacenterUpdationParams) throws ApiException {
        ApiResponse<List<WithTaskDatacenter>> localVarResp = updateDatacenterWithHttpInfo(datacenterUpdationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param datacenterUpdationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskDatacenter&gt;&gt;
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
    public ApiResponse<List<WithTaskDatacenter>> updateDatacenterWithHttpInfo(DatacenterUpdationParams datacenterUpdationParams) throws ApiException {
        okhttp3.Call localVarCall = updateDatacenterValidateBeforeCall(datacenterUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDatacenter>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param datacenterUpdationParams  (required)
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
    public okhttp3.Call updateDatacenterAsync(DatacenterUpdationParams datacenterUpdationParams, final ApiCallback<List<WithTaskDatacenter>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateDatacenterValidateBeforeCall(datacenterUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDatacenter>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
