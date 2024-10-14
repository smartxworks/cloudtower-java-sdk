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
import com.smartx.tower.model.GetV2EverouteLicensesConnectionRequestBody;
import com.smartx.tower.model.GetV2EverouteLicensesRequestBody;
import com.smartx.tower.model.V2EverouteLicense;
import com.smartx.tower.model.V2EverouteLicenseConnection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class V2EverouteLicenseApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public V2EverouteLicenseApi() {
        this(Configuration.getDefaultApiClient());
    }

    public V2EverouteLicenseApi(ApiClient apiClient) {
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
     * Build call for getV2EverouteLicenses
     * @param getV2EverouteLicensesRequestBody  (required)
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
    public okhttp3.Call getV2EverouteLicensesCall(GetV2EverouteLicensesRequestBody getV2EverouteLicensesRequestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getV2EverouteLicensesRequestBody;

        // create path and map variables
        String localVarPath = "/get-v2-everoute-licenses";

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
    private okhttp3.Call getV2EverouteLicensesValidateBeforeCall(GetV2EverouteLicensesRequestBody getV2EverouteLicensesRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getV2EverouteLicensesRequestBody' is set
        if (getV2EverouteLicensesRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getV2EverouteLicensesRequestBody' when calling getV2EverouteLicenses(Async)");
        }
        

        okhttp3.Call localVarCall = getV2EverouteLicensesCall(getV2EverouteLicensesRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getV2EverouteLicensesRequestBody  (required)
     * @return List&lt;V2EverouteLicense&gt;
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
    public List<V2EverouteLicense> getV2EverouteLicenses(GetV2EverouteLicensesRequestBody getV2EverouteLicensesRequestBody) throws ApiException {
        ApiResponse<List<V2EverouteLicense>> localVarResp = getV2EverouteLicensesWithHttpInfo(getV2EverouteLicensesRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getV2EverouteLicensesRequestBody  (required)
     * @return ApiResponse&lt;List&lt;V2EverouteLicense&gt;&gt;
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
    public ApiResponse<List<V2EverouteLicense>> getV2EverouteLicensesWithHttpInfo(GetV2EverouteLicensesRequestBody getV2EverouteLicensesRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getV2EverouteLicensesValidateBeforeCall(getV2EverouteLicensesRequestBody, null);
        Type localVarReturnType = new TypeToken<List<V2EverouteLicense>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getV2EverouteLicensesRequestBody  (required)
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
    public okhttp3.Call getV2EverouteLicensesAsync(GetV2EverouteLicensesRequestBody getV2EverouteLicensesRequestBody, final ApiCallback<List<V2EverouteLicense>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getV2EverouteLicensesValidateBeforeCall(getV2EverouteLicensesRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<V2EverouteLicense>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getV2EverouteLicensesConnection
     * @param getV2EverouteLicensesConnectionRequestBody  (required)
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
    public okhttp3.Call getV2EverouteLicensesConnectionCall(GetV2EverouteLicensesConnectionRequestBody getV2EverouteLicensesConnectionRequestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getV2EverouteLicensesConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-v-2-everoute-licenses-connection";

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
    private okhttp3.Call getV2EverouteLicensesConnectionValidateBeforeCall(GetV2EverouteLicensesConnectionRequestBody getV2EverouteLicensesConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getV2EverouteLicensesConnectionRequestBody' is set
        if (getV2EverouteLicensesConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getV2EverouteLicensesConnectionRequestBody' when calling getV2EverouteLicensesConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getV2EverouteLicensesConnectionCall(getV2EverouteLicensesConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getV2EverouteLicensesConnectionRequestBody  (required)
     * @return V2EverouteLicenseConnection
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
    public V2EverouteLicenseConnection getV2EverouteLicensesConnection(GetV2EverouteLicensesConnectionRequestBody getV2EverouteLicensesConnectionRequestBody) throws ApiException {
        ApiResponse<V2EverouteLicenseConnection> localVarResp = getV2EverouteLicensesConnectionWithHttpInfo(getV2EverouteLicensesConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getV2EverouteLicensesConnectionRequestBody  (required)
     * @return ApiResponse&lt;V2EverouteLicenseConnection&gt;
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
    public ApiResponse<V2EverouteLicenseConnection> getV2EverouteLicensesConnectionWithHttpInfo(GetV2EverouteLicensesConnectionRequestBody getV2EverouteLicensesConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getV2EverouteLicensesConnectionValidateBeforeCall(getV2EverouteLicensesConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<V2EverouteLicenseConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getV2EverouteLicensesConnectionRequestBody  (required)
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
    public okhttp3.Call getV2EverouteLicensesConnectionAsync(GetV2EverouteLicensesConnectionRequestBody getV2EverouteLicensesConnectionRequestBody, final ApiCallback<V2EverouteLicenseConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getV2EverouteLicensesConnectionValidateBeforeCall(getV2EverouteLicensesConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<V2EverouteLicenseConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
