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
import com.smartx.tower.model.TableReporterParams;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableReporterApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TableReporterApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TableReporterApi(ApiClient apiClient) {
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
     * Build call for exportCSV
     * @param tableReporterParams  (required)
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
    public okhttp3.Call exportCSVCall(TableReporterParams tableReporterParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = tableReporterParams;

        // create path and map variables
        String localVarPath = "/export-csv";

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
    private okhttp3.Call exportCSVValidateBeforeCall(TableReporterParams tableReporterParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'tableReporterParams' is set
        if (tableReporterParams == null) {
            throw new ApiException("Missing the required parameter 'tableReporterParams' when calling exportCSV(Async)");
        }
        

        okhttp3.Call localVarCall = exportCSVCall(tableReporterParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param tableReporterParams  (required)
     * @return byte[]
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
    public byte[] exportCSV(TableReporterParams tableReporterParams) throws ApiException {
        ApiResponse<byte[]> localVarResp = exportCSVWithHttpInfo(tableReporterParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param tableReporterParams  (required)
     * @return ApiResponse&lt;byte[]&gt;
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
    public ApiResponse<byte[]> exportCSVWithHttpInfo(TableReporterParams tableReporterParams) throws ApiException {
        okhttp3.Call localVarCall = exportCSVValidateBeforeCall(tableReporterParams, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param tableReporterParams  (required)
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
    public okhttp3.Call exportCSVAsync(TableReporterParams tableReporterParams, final ApiCallback<byte[]> _callback) throws ApiException {

        okhttp3.Call localVarCall = exportCSVValidateBeforeCall(tableReporterParams, _callback);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
