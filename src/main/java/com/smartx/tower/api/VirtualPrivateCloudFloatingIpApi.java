package com.smartx.tower.api;


import com.google.gson.reflect.TypeToken;
import com.smartx.tower.ApiCallback;
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.Pair;
import com.smartx.tower.model.GetVirtualPrivateCloudFloatingIpsConnectionRequestBody;
import com.smartx.tower.model.GetVirtualPrivateCloudFloatingIpsRequestBody;
import com.smartx.tower.model.VirtualPrivateCloudFloatingIp;
import com.smartx.tower.model.VirtualPrivateCloudFloatingIpConnection;
import com.smartx.tower.model.VirtualPrivateCloudFloatingIpCreationParams;
import com.smartx.tower.model.VirtualPrivateCloudFloatingIpDeletionParams;
import com.smartx.tower.model.WithTaskDeleteVirtualPrivateCloudFloatingIp;
import com.smartx.tower.model.WithTaskVirtualPrivateCloudFloatingIp;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VirtualPrivateCloudFloatingIpApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VirtualPrivateCloudFloatingIpApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VirtualPrivateCloudFloatingIpApi(ApiClient apiClient) {
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
     * Build call for createVirtualPrivateCloudFloatingIp
     *
     * @param virtualPrivateCloudFloatingIpCreationParams (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call createVirtualPrivateCloudFloatingIpCall(
            List<VirtualPrivateCloudFloatingIpCreationParams>
                    virtualPrivateCloudFloatingIpCreationParams,
            final ApiCallback _callback)
            throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = virtualPrivateCloudFloatingIpCreationParams;

        // create path and map variables
        String localVarPath = "/create-virtual-private-cloud-floating-ip";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"Authorization"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createVirtualPrivateCloudFloatingIpValidateBeforeCall(
            List<VirtualPrivateCloudFloatingIpCreationParams>
                    virtualPrivateCloudFloatingIpCreationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'virtualPrivateCloudFloatingIpCreationParams' is set
        if (virtualPrivateCloudFloatingIpCreationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'virtualPrivateCloudFloatingIpCreationParams'"
                            + " when calling createVirtualPrivateCloudFloatingIp(Async)");
        }

        okhttp3.Call localVarCall =
                createVirtualPrivateCloudFloatingIpCall(
                        virtualPrivateCloudFloatingIpCreationParams, _callback);
        return localVarCall;
    }

    /**
     * @param virtualPrivateCloudFloatingIpCreationParams (required)
     * @return List&lt;WithTaskVirtualPrivateCloudFloatingIp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public List<WithTaskVirtualPrivateCloudFloatingIp> createVirtualPrivateCloudFloatingIp(
            List<VirtualPrivateCloudFloatingIpCreationParams>
                    virtualPrivateCloudFloatingIpCreationParams)
            throws ApiException {
        ApiResponse<List<WithTaskVirtualPrivateCloudFloatingIp>> localVarResp =
                createVirtualPrivateCloudFloatingIpWithHttpInfo(
                        virtualPrivateCloudFloatingIpCreationParams);
        return localVarResp.getData();
    }

    /**
     * @param virtualPrivateCloudFloatingIpCreationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskVirtualPrivateCloudFloatingIp&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public ApiResponse<List<WithTaskVirtualPrivateCloudFloatingIp>>
            createVirtualPrivateCloudFloatingIpWithHttpInfo(
                    List<VirtualPrivateCloudFloatingIpCreationParams>
                            virtualPrivateCloudFloatingIpCreationParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                createVirtualPrivateCloudFloatingIpValidateBeforeCall(
                        virtualPrivateCloudFloatingIpCreationParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudFloatingIp>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param virtualPrivateCloudFloatingIpCreationParams (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call createVirtualPrivateCloudFloatingIpAsync(
            List<VirtualPrivateCloudFloatingIpCreationParams>
                    virtualPrivateCloudFloatingIpCreationParams,
            final ApiCallback<List<WithTaskVirtualPrivateCloudFloatingIp>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createVirtualPrivateCloudFloatingIpValidateBeforeCall(
                        virtualPrivateCloudFloatingIpCreationParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudFloatingIp>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteVirtualPrivateCloudFloatingIp
     *
     * @param virtualPrivateCloudFloatingIpDeletionParams (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteVirtualPrivateCloudFloatingIpCall(
            VirtualPrivateCloudFloatingIpDeletionParams virtualPrivateCloudFloatingIpDeletionParams,
            final ApiCallback _callback)
            throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = virtualPrivateCloudFloatingIpDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-virtual-private-cloud-floating-ip";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"Authorization"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteVirtualPrivateCloudFloatingIpValidateBeforeCall(
            VirtualPrivateCloudFloatingIpDeletionParams virtualPrivateCloudFloatingIpDeletionParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'virtualPrivateCloudFloatingIpDeletionParams' is set
        if (virtualPrivateCloudFloatingIpDeletionParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'virtualPrivateCloudFloatingIpDeletionParams'"
                            + " when calling deleteVirtualPrivateCloudFloatingIp(Async)");
        }

        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudFloatingIpCall(
                        virtualPrivateCloudFloatingIpDeletionParams, _callback);
        return localVarCall;
    }

    /**
     * @param virtualPrivateCloudFloatingIpDeletionParams (required)
     * @return List&lt;WithTaskDeleteVirtualPrivateCloudFloatingIp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public List<WithTaskDeleteVirtualPrivateCloudFloatingIp> deleteVirtualPrivateCloudFloatingIp(
            VirtualPrivateCloudFloatingIpDeletionParams virtualPrivateCloudFloatingIpDeletionParams)
            throws ApiException {
        ApiResponse<List<WithTaskDeleteVirtualPrivateCloudFloatingIp>> localVarResp =
                deleteVirtualPrivateCloudFloatingIpWithHttpInfo(
                        virtualPrivateCloudFloatingIpDeletionParams);
        return localVarResp.getData();
    }

    /**
     * @param virtualPrivateCloudFloatingIpDeletionParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteVirtualPrivateCloudFloatingIp&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public ApiResponse<List<WithTaskDeleteVirtualPrivateCloudFloatingIp>>
            deleteVirtualPrivateCloudFloatingIpWithHttpInfo(
                    VirtualPrivateCloudFloatingIpDeletionParams
                            virtualPrivateCloudFloatingIpDeletionParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudFloatingIpValidateBeforeCall(
                        virtualPrivateCloudFloatingIpDeletionParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteVirtualPrivateCloudFloatingIp>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param virtualPrivateCloudFloatingIpDeletionParams (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteVirtualPrivateCloudFloatingIpAsync(
            VirtualPrivateCloudFloatingIpDeletionParams virtualPrivateCloudFloatingIpDeletionParams,
            final ApiCallback<List<WithTaskDeleteVirtualPrivateCloudFloatingIp>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudFloatingIpValidateBeforeCall(
                        virtualPrivateCloudFloatingIpDeletionParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteVirtualPrivateCloudFloatingIp>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVirtualPrivateCloudFloatingIps
     *
     * @param getVirtualPrivateCloudFloatingIpsRequestBody (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call getVirtualPrivateCloudFloatingIpsCall(
            GetVirtualPrivateCloudFloatingIpsRequestBody
                    getVirtualPrivateCloudFloatingIpsRequestBody,
            final ApiCallback _callback)
            throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getVirtualPrivateCloudFloatingIpsRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-cloud-floating-ips";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"Authorization"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getVirtualPrivateCloudFloatingIpsValidateBeforeCall(
            GetVirtualPrivateCloudFloatingIpsRequestBody
                    getVirtualPrivateCloudFloatingIpsRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVirtualPrivateCloudFloatingIpsRequestBody' is set
        if (getVirtualPrivateCloudFloatingIpsRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getVirtualPrivateCloudFloatingIpsRequestBody'"
                            + " when calling getVirtualPrivateCloudFloatingIps(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudFloatingIpsCall(
                        getVirtualPrivateCloudFloatingIpsRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudFloatingIpsRequestBody (required)
     * @return List&lt;VirtualPrivateCloudFloatingIp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public List<VirtualPrivateCloudFloatingIp> getVirtualPrivateCloudFloatingIps(
            GetVirtualPrivateCloudFloatingIpsRequestBody
                    getVirtualPrivateCloudFloatingIpsRequestBody)
            throws ApiException {
        ApiResponse<List<VirtualPrivateCloudFloatingIp>> localVarResp =
                getVirtualPrivateCloudFloatingIpsWithHttpInfo(
                        getVirtualPrivateCloudFloatingIpsRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudFloatingIpsRequestBody (required)
     * @return ApiResponse&lt;List&lt;VirtualPrivateCloudFloatingIp&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public ApiResponse<List<VirtualPrivateCloudFloatingIp>>
            getVirtualPrivateCloudFloatingIpsWithHttpInfo(
                    GetVirtualPrivateCloudFloatingIpsRequestBody
                            getVirtualPrivateCloudFloatingIpsRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudFloatingIpsValidateBeforeCall(
                        getVirtualPrivateCloudFloatingIpsRequestBody, null);
        Type localVarReturnType = new TypeToken<List<VirtualPrivateCloudFloatingIp>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudFloatingIpsRequestBody (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call getVirtualPrivateCloudFloatingIpsAsync(
            GetVirtualPrivateCloudFloatingIpsRequestBody
                    getVirtualPrivateCloudFloatingIpsRequestBody,
            final ApiCallback<List<VirtualPrivateCloudFloatingIp>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudFloatingIpsValidateBeforeCall(
                        getVirtualPrivateCloudFloatingIpsRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<VirtualPrivateCloudFloatingIp>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVirtualPrivateCloudFloatingIpsConnection
     *
     * @param getVirtualPrivateCloudFloatingIpsConnectionRequestBody (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call getVirtualPrivateCloudFloatingIpsConnectionCall(
            GetVirtualPrivateCloudFloatingIpsConnectionRequestBody
                    getVirtualPrivateCloudFloatingIpsConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getVirtualPrivateCloudFloatingIpsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-cloud-floating-ips-connection";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"Authorization"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getVirtualPrivateCloudFloatingIpsConnectionValidateBeforeCall(
            GetVirtualPrivateCloudFloatingIpsConnectionRequestBody
                    getVirtualPrivateCloudFloatingIpsConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVirtualPrivateCloudFloatingIpsConnectionRequestBody' is
        // set
        if (getVirtualPrivateCloudFloatingIpsConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                        + " 'getVirtualPrivateCloudFloatingIpsConnectionRequestBody' when calling"
                        + " getVirtualPrivateCloudFloatingIpsConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudFloatingIpsConnectionCall(
                        getVirtualPrivateCloudFloatingIpsConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudFloatingIpsConnectionRequestBody (required)
     * @return VirtualPrivateCloudFloatingIpConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public VirtualPrivateCloudFloatingIpConnection getVirtualPrivateCloudFloatingIpsConnection(
            GetVirtualPrivateCloudFloatingIpsConnectionRequestBody
                    getVirtualPrivateCloudFloatingIpsConnectionRequestBody)
            throws ApiException {
        ApiResponse<VirtualPrivateCloudFloatingIpConnection> localVarResp =
                getVirtualPrivateCloudFloatingIpsConnectionWithHttpInfo(
                        getVirtualPrivateCloudFloatingIpsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudFloatingIpsConnectionRequestBody (required)
     * @return ApiResponse&lt;VirtualPrivateCloudFloatingIpConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public ApiResponse<VirtualPrivateCloudFloatingIpConnection>
            getVirtualPrivateCloudFloatingIpsConnectionWithHttpInfo(
                    GetVirtualPrivateCloudFloatingIpsConnectionRequestBody
                            getVirtualPrivateCloudFloatingIpsConnectionRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudFloatingIpsConnectionValidateBeforeCall(
                        getVirtualPrivateCloudFloatingIpsConnectionRequestBody, null);
        Type localVarReturnType =
                new TypeToken<VirtualPrivateCloudFloatingIpConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudFloatingIpsConnectionRequestBody (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call getVirtualPrivateCloudFloatingIpsConnectionAsync(
            GetVirtualPrivateCloudFloatingIpsConnectionRequestBody
                    getVirtualPrivateCloudFloatingIpsConnectionRequestBody,
            final ApiCallback<VirtualPrivateCloudFloatingIpConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudFloatingIpsConnectionValidateBeforeCall(
                        getVirtualPrivateCloudFloatingIpsConnectionRequestBody, _callback);
        Type localVarReturnType =
                new TypeToken<VirtualPrivateCloudFloatingIpConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
