package com.smartx.tower.api;


import com.google.gson.reflect.TypeToken;
import com.smartx.tower.ApiCallback;
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.Pair;
import com.smartx.tower.model.GetVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody;
import com.smartx.tower.model.GetVirtualPrivateCloudEdgeGatewayGroupsRequestBody;
import com.smartx.tower.model.VirtualPrivateCloudEdgeGatewayGroup;
import com.smartx.tower.model.VirtualPrivateCloudEdgeGatewayGroupConnection;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VirtualPrivateCloudEdgeGatewayGroupApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VirtualPrivateCloudEdgeGatewayGroupApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VirtualPrivateCloudEdgeGatewayGroupApi(ApiClient apiClient) {
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
     * Build call for getVirtualPrivateCloudEdgeGatewayGroups
     *
     * @param getVirtualPrivateCloudEdgeGatewayGroupsRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudEdgeGatewayGroupsCall(
            GetVirtualPrivateCloudEdgeGatewayGroupsRequestBody
                    getVirtualPrivateCloudEdgeGatewayGroupsRequestBody,
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

        Object localVarPostBody = getVirtualPrivateCloudEdgeGatewayGroupsRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-cloud-edge-gateway-groups";

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
    private okhttp3.Call getVirtualPrivateCloudEdgeGatewayGroupsValidateBeforeCall(
            GetVirtualPrivateCloudEdgeGatewayGroupsRequestBody
                    getVirtualPrivateCloudEdgeGatewayGroupsRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVirtualPrivateCloudEdgeGatewayGroupsRequestBody' is set
        if (getVirtualPrivateCloudEdgeGatewayGroupsRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'getVirtualPrivateCloudEdgeGatewayGroupsRequestBody' when calling"
                            + " getVirtualPrivateCloudEdgeGatewayGroups(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudEdgeGatewayGroupsCall(
                        getVirtualPrivateCloudEdgeGatewayGroupsRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudEdgeGatewayGroupsRequestBody (required)
     * @return List&lt;VirtualPrivateCloudEdgeGatewayGroup&gt;
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
    public List<VirtualPrivateCloudEdgeGatewayGroup> getVirtualPrivateCloudEdgeGatewayGroups(
            GetVirtualPrivateCloudEdgeGatewayGroupsRequestBody
                    getVirtualPrivateCloudEdgeGatewayGroupsRequestBody)
            throws ApiException {
        ApiResponse<List<VirtualPrivateCloudEdgeGatewayGroup>> localVarResp =
                getVirtualPrivateCloudEdgeGatewayGroupsWithHttpInfo(
                        getVirtualPrivateCloudEdgeGatewayGroupsRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudEdgeGatewayGroupsRequestBody (required)
     * @return ApiResponse&lt;List&lt;VirtualPrivateCloudEdgeGatewayGroup&gt;&gt;
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
    public ApiResponse<List<VirtualPrivateCloudEdgeGatewayGroup>>
            getVirtualPrivateCloudEdgeGatewayGroupsWithHttpInfo(
                    GetVirtualPrivateCloudEdgeGatewayGroupsRequestBody
                            getVirtualPrivateCloudEdgeGatewayGroupsRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudEdgeGatewayGroupsValidateBeforeCall(
                        getVirtualPrivateCloudEdgeGatewayGroupsRequestBody, null);
        Type localVarReturnType =
                new TypeToken<List<VirtualPrivateCloudEdgeGatewayGroup>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudEdgeGatewayGroupsRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudEdgeGatewayGroupsAsync(
            GetVirtualPrivateCloudEdgeGatewayGroupsRequestBody
                    getVirtualPrivateCloudEdgeGatewayGroupsRequestBody,
            final ApiCallback<List<VirtualPrivateCloudEdgeGatewayGroup>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudEdgeGatewayGroupsValidateBeforeCall(
                        getVirtualPrivateCloudEdgeGatewayGroupsRequestBody, _callback);
        Type localVarReturnType =
                new TypeToken<List<VirtualPrivateCloudEdgeGatewayGroup>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVirtualPrivateCloudEdgeGatewayGroupsConnection
     *
     * @param getVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudEdgeGatewayGroupsConnectionCall(
            GetVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody
                    getVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody,
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

        Object localVarPostBody = getVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-cloud-edge-gateway-groups-connection";

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
    private okhttp3.Call getVirtualPrivateCloudEdgeGatewayGroupsConnectionValidateBeforeCall(
            GetVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody
                    getVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter
        // 'getVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody' is set
        if (getVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'getVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody' when"
                            + " calling getVirtualPrivateCloudEdgeGatewayGroupsConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudEdgeGatewayGroupsConnectionCall(
                        getVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody (required)
     * @return VirtualPrivateCloudEdgeGatewayGroupConnection
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
    public VirtualPrivateCloudEdgeGatewayGroupConnection
            getVirtualPrivateCloudEdgeGatewayGroupsConnection(
                    GetVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody
                            getVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody)
                    throws ApiException {
        ApiResponse<VirtualPrivateCloudEdgeGatewayGroupConnection> localVarResp =
                getVirtualPrivateCloudEdgeGatewayGroupsConnectionWithHttpInfo(
                        getVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody (required)
     * @return ApiResponse&lt;VirtualPrivateCloudEdgeGatewayGroupConnection&gt;
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
    public ApiResponse<VirtualPrivateCloudEdgeGatewayGroupConnection>
            getVirtualPrivateCloudEdgeGatewayGroupsConnectionWithHttpInfo(
                    GetVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody
                            getVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudEdgeGatewayGroupsConnectionValidateBeforeCall(
                        getVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody, null);
        Type localVarReturnType =
                new TypeToken<VirtualPrivateCloudEdgeGatewayGroupConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudEdgeGatewayGroupsConnectionAsync(
            GetVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody
                    getVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody,
            final ApiCallback<VirtualPrivateCloudEdgeGatewayGroupConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudEdgeGatewayGroupsConnectionValidateBeforeCall(
                        getVirtualPrivateCloudEdgeGatewayGroupsConnectionRequestBody, _callback);
        Type localVarReturnType =
                new TypeToken<VirtualPrivateCloudEdgeGatewayGroupConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
