package com.smartx.tower;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.net.ssl.KeyManager;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.threeten.bp.format.DateTimeFormatter;

/** ApiClient variant that routes CloudTower requests to the active endpoint in active/passive HA. */
public class ActivePassiveApiClient extends ApiClient {
    public static final int DEFAULT_PROBE_TIMEOUT_MILLIS = 10_000;

    private static final int HTTP_TEMPORARY_REDIRECT = 307;

    private final Object activeEndpointLock = new Object();
    private final List<String> endpointBaseUrls = new ArrayList<String>();
    private final ActivePassiveFailoverStrategy failoverStrategy;
    private volatile int probeTimeoutMillis = DEFAULT_PROBE_TIMEOUT_MILLIS;

    private String currentActiveBaseUrl;

    public ActivePassiveApiClient(String... basePaths) throws ApiException {
        this(ActivePassiveFailoverStrategy.DEFAULT, basePaths);
    }

    public ActivePassiveApiClient(ActivePassiveFailoverStrategy failoverStrategy, String... basePaths)
            throws ApiException {
        super();
        this.failoverStrategy =
                failoverStrategy == null ? ActivePassiveFailoverStrategy.DEFAULT : failoverStrategy;
        setHttpClient(super.getHttpClient());
        setBasePaths(basePaths);
    }

    public ActivePassiveApiClient(List<String> basePaths) throws ApiException {
        this(ActivePassiveFailoverStrategy.DEFAULT, basePaths);
    }

    public ActivePassiveApiClient(
            ActivePassiveFailoverStrategy failoverStrategy, List<String> basePaths)
            throws ApiException {
        super();
        this.failoverStrategy =
                failoverStrategy == null ? ActivePassiveFailoverStrategy.DEFAULT : failoverStrategy;
        setHttpClient(super.getHttpClient());
        setBasePaths(basePaths);
    }

    public List<String> getBasePaths() {
        synchronized (activeEndpointLock) {
            return Collections.unmodifiableList(new ArrayList<String>(endpointBaseUrls));
        }
    }

    public ActivePassiveApiClient setBasePaths(String... basePaths) throws ApiException {
        return setBasePaths(basePaths == null ? null : Arrays.asList(basePaths));
    }

    public ActivePassiveApiClient setBasePaths(List<String> basePaths) throws ApiException {
        EndpointBaseUrls parsed = parseEndpointBaseUrls(basePaths);
        synchronized (activeEndpointLock) {
            endpointBaseUrls.clear();
            endpointBaseUrls.addAll(parsed.baseUrls);
            currentActiveBaseUrl = null;
            super.setBasePath(endpointBaseUrls.get(0));
        }
        return this;
    }

    public int getProbeTimeoutMillis() {
        return probeTimeoutMillis;
    }

    public ActivePassiveApiClient setProbeTimeoutMillis(int probeTimeoutMillis) {
        this.probeTimeoutMillis =
                probeTimeoutMillis > 0 ? probeTimeoutMillis : DEFAULT_PROBE_TIMEOUT_MILLIS;
        return this;
    }

    public ActivePassiveFailoverStrategy getFailoverStrategy() {
        return failoverStrategy;
    }

    @Override
    public ActivePassiveApiClient setHttpClient(OkHttpClient newHttpClient) {
        super.setHttpClient(withActivePassiveInterceptor(newHttpClient));
        return this;
    }

    @Override
    public ApiClient setBasePath(String basePath) {
        throw new UnsupportedOperationException(
                "Use setBasePaths to configure ActivePassiveApiClient endpoints");
    }

    @Override
    public ActivePassiveApiClient setVerifyingSsl(boolean verifyingSsl) {
        super.setVerifyingSsl(verifyingSsl);
        return this;
    }

    @Override
    public ActivePassiveApiClient setJSON(JSON json) {
        super.setJSON(json);
        return this;
    }

    @Override
    public ActivePassiveApiClient setSslCaCert(InputStream sslCaCert) {
        super.setSslCaCert(sslCaCert);
        return this;
    }

    @Override
    public ActivePassiveApiClient setKeyManagers(KeyManager[] managers) {
        super.setKeyManagers(managers);
        return this;
    }

    @Override
    public ActivePassiveApiClient setDateFormat(DateFormat dateFormat) {
        super.setDateFormat(dateFormat);
        return this;
    }

    @Override
    public ActivePassiveApiClient setSqlDateFormat(DateFormat dateFormat) {
        super.setSqlDateFormat(dateFormat);
        return this;
    }

    @Override
    public ActivePassiveApiClient setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        super.setOffsetDateTimeFormat(dateFormat);
        return this;
    }

    @Override
    public ActivePassiveApiClient setLocalDateFormat(DateTimeFormatter dateFormat) {
        super.setLocalDateFormat(dateFormat);
        return this;
    }

    @Override
    public ActivePassiveApiClient setLenientOnJson(boolean lenientOnJson) {
        super.setLenientOnJson(lenientOnJson);
        return this;
    }

    @Override
    public ActivePassiveApiClient setUserAgent(String userAgent) {
        super.setUserAgent(userAgent);
        return this;
    }

    @Override
    public ActivePassiveApiClient addDefaultHeader(String key, String value) {
        super.addDefaultHeader(key, value);
        return this;
    }

    @Override
    public ActivePassiveApiClient removeDefaultHeader(String key, String value) {
        super.removeDefaultHeader(key, value);
        return this;
    }

    @Override
    public ActivePassiveApiClient addDefaultCookie(String key, String value) {
        super.addDefaultCookie(key, value);
        return this;
    }

    @Override
    public ActivePassiveApiClient setDebugging(boolean debugging) {
        super.setDebugging(debugging);
        return this;
    }

    @Override
    public ActivePassiveApiClient setTempFolderPath(String tempFolderPath) {
        super.setTempFolderPath(tempFolderPath);
        return this;
    }

    @Override
    public ActivePassiveApiClient setConnectTimeout(int connectionTimeout) {
        super.setConnectTimeout(connectionTimeout);
        return this;
    }

    @Override
    public ActivePassiveApiClient setReadTimeout(int readTimeout) {
        super.setReadTimeout(readTimeout);
        return this;
    }

    @Override
    public ActivePassiveApiClient setWriteTimeout(int writeTimeout) {
        super.setWriteTimeout(writeTimeout);
        return this;
    }

    @Override
    public <T> ApiResponse<T> execute(Call call, Type returnType) throws ApiException {
        try {
            return super.execute(call, returnType);
        } catch (ApiException e) {
            ApiException unwrapped = unwrapActivePassiveException(e);
            if (unwrapped != null) {
                throw unwrapped;
            }
            throw e;
        }
    }

    @Override
    public <T> void executeAsync(
            Call call, final Type returnType, final ApiCallback<T> callback) {
        super.executeAsync(
                call,
                returnType,
                new ApiCallback<T>() {
                    @Override
                    public void onFailure(
                            ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                        ApiException unwrapped = unwrapActivePassiveException(e);
                        if (unwrapped != null) {
                            callback.onFailure(
                                    unwrapped,
                                    unwrapped.getCode(),
                                    unwrapped.getResponseHeaders());
                            return;
                        }
                        callback.onFailure(e, statusCode, responseHeaders);
                    }

                    @Override
                    public void onSuccess(
                            T result, int statusCode, Map<String, List<String>> responseHeaders) {
                        callback.onSuccess(result, statusCode, responseHeaders);
                    }

                    @Override
                    public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {
                        callback.onUploadProgress(bytesWritten, contentLength, done);
                    }

                    @Override
                    public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {
                        callback.onDownloadProgress(bytesRead, contentLength, done);
                    }
                });
    }

    @Override
    public Request buildRequest(
            String baseUrl,
            String path,
            String method,
            List<Pair> queryParams,
            List<Pair> collectionQueryParams,
            Object body,
            Map<String, String> headerParams,
            Map<String, String> cookieParams,
            Map<String, Object> formParams,
            String[] authNames,
            ApiCallback callback)
            throws ApiException {
        if (baseUrl != null) {
            throw ActivePassiveApiException.unsupportedDomainOverride();
        }
        Request request =
                super.buildRequest(
                        null,
                        path,
                        method,
                        queryParams,
                        collectionQueryParams,
                        body,
                        headerParams,
                        cookieParams,
                        formParams,
                        authNames,
                        callback);
        return request;
    }

    /** Probe the first configured endpoint and return whether it is currently active. */
    public boolean probeActivePassive() throws ApiException {
        return probeActivePassive(firstEndpointBaseUrl(), probeTimeoutMillis);
    }

    /** Returns the last discovered active endpoint base URL. */
    public String getCurrentActiveBaseUrl() {
        synchronized (activeEndpointLock) {
            return currentActiveBaseUrl;
        }
    }

    private Response interceptActivePassive(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        if (request.tag(ActivePassiveRequestTags.Bypass.class) != null) {
            return chain.proceed(request);
        }

        ActivePassiveFailoverStrategy strategy = failoverStrategy;
        String baseUrl = activeBaseUrlForRequest(strategy);
        Response response;
        try {
            response = chain.proceed(routeRequestForTransport(request, baseUrl));
        } catch (IOException e) {
            clearCurrentActiveBaseUrlIf(baseUrl);
            throw e;
        }

        if (response.code() != HTTP_TEMPORARY_REDIRECT) {
            return response;
        }

        ActivePassiveApiException switchSignal = ActivePassiveApiException.switchSignal(response);
        if (response.body() != null) {
            response.body().close();
        }
        clearCurrentActiveBaseUrlIf(baseUrl);
        if (strategy == ActivePassiveFailoverStrategy.MANUAL_FAILOVER
                || strategy == ActivePassiveFailoverStrategy.ALWAYS_PROBE) {
            throw new ActivePassiveTransportException(
                    ActivePassiveApiException.failoverRequired(switchSignal));
        }

        String retryBaseUrl = activeBaseUrlForRequest(strategy);
        Response retry;
        try {
            retry = chain.proceed(routeRequestForTransport(request, retryBaseUrl));
        } catch (IOException e) {
            clearCurrentActiveBaseUrlIf(retryBaseUrl);
            throw e;
        }

        if (retry.code() != HTTP_TEMPORARY_REDIRECT) {
            return retry;
        }

        ActivePassiveApiException retrySignal = ActivePassiveApiException.switchSignal(retry);
        if (retry.body() != null) {
            retry.body().close();
        }
        clearCurrentActiveBaseUrlIf(retryBaseUrl);
        throw new ActivePassiveTransportException(
                ActivePassiveApiException.retryExhausted(retrySignal));
    }

    private String activeBaseUrlForRequest(ActivePassiveFailoverStrategy strategy) throws IOException {
        try {
            if (strategy == ActivePassiveFailoverStrategy.ALWAYS_PROBE) {
                clearCurrentActiveBaseUrl();
            }
            return ensureActiveBaseUrl();
        } catch (ApiException e) {
            throw new ActivePassiveTransportException(e);
        }
    }

    private String firstEndpointBaseUrl() {
        synchronized (activeEndpointLock) {
            return endpointBaseUrls.get(0);
        }
    }

    private String ensureActiveBaseUrl() throws ApiException {
        while (true) {
            List<String> endpoints;
            synchronized (activeEndpointLock) {
                if (currentActiveBaseUrl != null) {
                    return currentActiveBaseUrl;
                }
                endpoints = new ArrayList<String>(endpointBaseUrls);
            }

            String activeBaseUrl = discoverActiveBaseUrl(endpoints);
            synchronized (activeEndpointLock) {
                if (currentActiveBaseUrl != null) {
                    return currentActiveBaseUrl;
                }
                if (endpointBaseUrls.equals(endpoints)) {
                    currentActiveBaseUrl = activeBaseUrl;
                    return activeBaseUrl;
                }
            }
        }
    }

    private String discoverActiveBaseUrl(List<String> endpoints) throws ApiException {
        List<String> activeBaseUrls = new ArrayList<String>();
        List<String> failures = new ArrayList<String>();

        for (int i = 0; i < endpoints.size(); i++) {
            String endpointBaseUrl = endpoints.get(i);
            try {
                if (probeActivePassive(endpointBaseUrl, probeTimeoutMillis)) {
                    activeBaseUrls.add(endpointBaseUrl);
                }
            } catch (ApiException e) {
                failures.add(endpointBaseUrl + ": " + e.getMessage());
            }
        }

        if (activeBaseUrls.size() == 1) {
            return activeBaseUrls.get(0);
        }
        if (activeBaseUrls.isEmpty()) {
            throw ActivePassiveApiException.noActiveEndpoint(failures);
        }
        throw ActivePassiveApiException.multipleActiveEndpoints(activeBaseUrls);
    }

    private Request routeRequest(Request request, String baseUrl) throws ApiException {
        HttpUrl targetBaseUrl = parseEndpointBaseUrl(baseUrl);
        HttpUrl firstBaseUrl = parseEndpointBaseUrl(firstEndpointBaseUrl());
        String suffix = pathSuffix(request.url().encodedPath(), firstBaseUrl.encodedPath());
        HttpUrl routedUrl =
                request.url()
                        .newBuilder()
                        .scheme(targetBaseUrl.scheme())
                        .host(targetBaseUrl.host())
                        .port(targetBaseUrl.port())
                        .encodedPath(joinEncodedPath(targetBaseUrl.encodedPath(), suffix))
                        .build();
        return request.newBuilder().url(routedUrl).build();
    }

    private Request routeRequestForTransport(Request request, String baseUrl) throws IOException {
        try {
            return routeRequest(request, baseUrl);
        } catch (ApiException e) {
            throw new ActivePassiveTransportException(e);
        }
    }

    private void clearCurrentActiveBaseUrl() {
        synchronized (activeEndpointLock) {
            currentActiveBaseUrl = null;
        }
    }

    private void clearCurrentActiveBaseUrlIf(String baseUrl) {
        synchronized (activeEndpointLock) {
            if (baseUrl != null && baseUrl.equals(currentActiveBaseUrl)) {
                currentActiveBaseUrl = null;
            }
        }
    }

    private EndpointBaseUrls parseEndpointBaseUrls(List<String> basePaths) throws ApiException {
        if (basePaths == null || basePaths.isEmpty()) {
            throw ActivePassiveApiException.noEndpoints();
        }

        EndpointBaseUrls parsed = new EndpointBaseUrls();
        HashSet<String> seen = new HashSet<String>();
        for (String endpoint : basePaths) {
            HttpUrl url = parseEndpointBaseUrl(endpoint);
            String baseUrl = trimTrailingSlash(url.toString());
            if (!seen.add(baseUrl)) {
                throw ActivePassiveApiException.duplicateEndpoint(baseUrl);
            }
            parsed.baseUrls.add(baseUrl);
        }
        return parsed;
    }

    private HttpUrl parseEndpointBaseUrl(String endpoint) throws ApiException {
        if (endpoint == null || endpoint.trim().isEmpty()) {
            throw ActivePassiveApiException.noEndpoints();
        }

        String raw = endpoint.trim();
        HttpUrl parsed = HttpUrl.parse(raw);
        if (parsed == null) {
            throw ActivePassiveApiException.invalidEndpoint(endpoint);
        }
        return parsed;
    }

    private OkHttpClient withActivePassiveInterceptor(OkHttpClient client) {
        OkHttpClient safeClient = Objects.requireNonNull(client, "HttpClient must not be null!");
        OkHttpClient.Builder builder =
                safeClient.newBuilder().followRedirects(false).followSslRedirects(false);
        List<Interceptor> interceptors = builder.interceptors();
        for (int i = interceptors.size() - 1; i >= 0; i--) {
            if (interceptors.get(i) instanceof ActivePassiveInterceptor) {
                interceptors.remove(i);
            }
        }
        interceptors.add(0, new ActivePassiveInterceptor());
        return builder.build();
    }

    private static ApiException unwrapActivePassiveException(ApiException e) {
        Throwable cause = e.getCause();
        if (cause instanceof ActivePassiveTransportException) {
            return ((ActivePassiveTransportException) cause).getApiException();
        }
        return null;
    }

    private static String trimTrailingSlash(String value) {
        HttpUrl url = HttpUrl.parse(value);
        if (url == null) {
            return value;
        }
        if ("/".equals(url.encodedPath())) {
            return url.toString();
        }
        String result = url.toString();
        while (result.endsWith("/")) {
            result = result.substring(0, result.length() - 1);
        }
        return result;
    }

    private static String pathSuffix(String path, String basePath) {
        if ("/".equals(basePath)) {
            return path;
        }
        if (path.equals(basePath)) {
            return "";
        }
        String basePathWithSlash = basePath.endsWith("/") ? basePath : basePath + "/";
        if (path.startsWith(basePathWithSlash)) {
            return path.substring(basePath.length());
        }
        return path;
    }

    private static String joinEncodedPath(String basePath, String suffix) {
        if (suffix == null || suffix.isEmpty()) {
            return basePath;
        }
        if ("/".equals(basePath)) {
            return suffix.startsWith("/") ? suffix : "/" + suffix;
        }
        return suffix.startsWith("/") ? basePath + suffix : basePath + "/" + suffix;
    }

    private static class EndpointBaseUrls {
        private final List<String> baseUrls = new ArrayList<String>();
    }

    private static class ActivePassiveTransportException extends IOException {
        private final ApiException apiException;

        private ActivePassiveTransportException(ApiException apiException) {
            super(apiException);
            this.apiException = apiException;
        }

        private ApiException getApiException() {
            return apiException;
        }
    }

    private class ActivePassiveInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            return interceptActivePassive(chain);
        }
    }
}
