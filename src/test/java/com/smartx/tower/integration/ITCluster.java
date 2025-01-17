package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import com.google.gson.reflect.TypeToken;
import com.smartx.tower.ApiException;
import com.smartx.tower.api.ClusterApi;
import com.smartx.tower.model.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.*;

public class ITCluster extends ITBase {
    ClusterApi api = null;
    HashMap<String, Object> payloads = new HashMap<String, Object>();

    @DataProvider(name = "clusterPayload")
    Object[][] data(Method m) {
        Object payload = payloads.get(m.getName());
        return payload == null ? new Object[][] {{"{}"}} : new Object[][] {{payload.toString()}};
    }

    @BeforeClass
    public void getService() throws IOException {
        api = new ClusterApi(client);
        // get payloads from resource file
        InputStream stream = getClass().getResourceAsStream("/Cluster.json");
        if (stream == null) {
            return;
        }
        // convert payloads string as map
        payloads =
                gson.fromJson(
                        ITUtils.readInputStream(stream),
                        new TypeToken<HashMap<String, Object>>() {}.getType());
    }

    @Test(dataProvider = "clusterPayload")
    public void connectCluster(String payload) {
        try {
            // parse params from json payload
            List<ClusterCreationParams> params =
                    gson.fromJson(
                            payload, new TypeToken<List<ClusterCreationParams>>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskCluster> result = api.connectCluster(params);
            assertThat(result).as("check result of connectCluster").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "clusterPayload")
    public void deleteCluster(String payload) {
        try {
            // parse params from json payload
            ClusterDeletionParams params =
                    gson.fromJson(payload, new TypeToken<ClusterDeletionParams>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskDeleteCluster> result = api.deleteCluster(params);
            assertThat(result).as("check result of deleteCluster").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "clusterPayload")
    public void getClusters(String payload) {
        try {
            // parse params from json payload
            GetClustersRequestBody params =
                    gson.fromJson(payload, new TypeToken<GetClustersRequestBody>() {}.getType());
            // do some modify to params(optional)
            List<Cluster> result = api.getClusters(params);
            assertThat(result).as("check result of getClusters").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "clusterPayload")
    public void getClustersConnection(String payload) {
        try {
            // parse params from json payload
            GetClustersConnectionRequestBody params =
                    gson.fromJson(
                            payload,
                            new TypeToken<GetClustersConnectionRequestBody>() {}.getType());
            // do some modify to params(optional)
            ClusterConnection result = api.getClustersConnection(params);
            assertThat(result).as("check result of getClustersConnection").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "clusterPayload")
    public void updateCluster(String payload) {
        try {
            // parse params from json payload
            ClusterUpdationParams params =
                    gson.fromJson(payload, new TypeToken<ClusterUpdationParams>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskCluster> result = api.updateCluster(params);
            assertThat(result).as("check result of updateCluster").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "clusterPayload")
    public void updateClusterLicense(String payload) {
        try {
            // parse params from json payload
            ClusterLicenseUpdationParams params =
                    gson.fromJson(
                            payload, new TypeToken<ClusterLicenseUpdationParams>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskCluster> result = api.updateClusterLicense(params);
            assertThat(result).as("check result of updateClusterLicense").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }
}
