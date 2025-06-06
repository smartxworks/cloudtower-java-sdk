package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import com.google.gson.reflect.TypeToken;
import com.smartx.tower.ApiException;
import com.smartx.tower.api.VdsApi;
import com.smartx.tower.model.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.*;

public class ITVds extends ITBase {
    VdsApi api = null;
    HashMap<String, Object> payloads = new HashMap<String, Object>();

    @DataProvider(name = "vdsPayload")
    Object[][] data(Method m) {
        Object payload = payloads.get(m.getName());
        return payload == null ? new Object[][] {{"{}"}} : new Object[][] {{payload.toString()}};
    }

    @BeforeClass
    public void getService() throws IOException {
        api = new VdsApi(client);
        // get payloads from resource file
        InputStream stream = getClass().getResourceAsStream("/Vds.json");
        if (stream == null) {
            return;
        }
        // convert payloads string as map
        payloads =
                gson.fromJson(
                        ITUtils.readInputStream(stream),
                        new TypeToken<HashMap<String, Object>>() {}.getType());
    }

    @Test(dataProvider = "vdsPayload")
    public void createVds(String payload) {
        try {
            // parse params from json payload
            List<VdsCreationParams> params =
                    gson.fromJson(payload, new TypeToken<List<VdsCreationParams>>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskVds> result = api.createVds(params);
            assertThat(result).as("check result of createVds").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "vdsPayload")
    public void createVdsWithAccessVlan(String payload) {
        try {
            // parse params from json payload
            List<VdsCreationWithMAccessVlanParams> params =
                    gson.fromJson(
                            payload,
                            new TypeToken<List<VdsCreationWithMAccessVlanParams>>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskVds> result = api.createVdsWithAccessVlan(params);
            assertThat(result).as("check result of createVdsWithAccessVlan").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "vdsPayload")
    public void createVdsWithMigrateVlan(String payload) {
        try {
            // parse params from json payload
            List<VdsCreationWithMigrateVlanParams> params =
                    gson.fromJson(
                            payload,
                            new TypeToken<List<VdsCreationWithMigrateVlanParams>>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskVds> result = api.createVdsWithMigrateVlan(params);
            assertThat(result).as("check result of createVdsWithMigrateVlan").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "vdsPayload")
    public void deleteVds(String payload) {
        try {
            // parse params from json payload
            VdsDeletionParams params =
                    gson.fromJson(payload, new TypeToken<VdsDeletionParams>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskDeleteVds> result = api.deleteVds(params);
            assertThat(result).as("check result of deleteVds").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "vdsPayload")
    public void getVdses(String payload) {
        try {
            // parse params from json payload
            GetVdsesRequestBody params =
                    gson.fromJson(payload, new TypeToken<GetVdsesRequestBody>() {}.getType());
            // do some modify to params(optional)
            List<Vds> result = api.getVdses(params);
            assertThat(result).as("check result of getVdses").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "vdsPayload")
    public void getVdsesConnection(String payload) {
        try {
            // parse params from json payload
            GetVdsesConnectionRequestBody params =
                    gson.fromJson(
                            payload, new TypeToken<GetVdsesConnectionRequestBody>() {}.getType());
            // do some modify to params(optional)
            VdsConnection result = api.getVdsesConnection(params);
            assertThat(result).as("check result of getVdsesConnection").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "vdsPayload")
    public void updateVds(String payload) {
        try {
            // parse params from json payload
            VdsUpdationParams params =
                    gson.fromJson(payload, new TypeToken<VdsUpdationParams>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskVds> result = api.updateVds(params);
            assertThat(result).as("check result of updateVds").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }
}
