package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import com.google.gson.reflect.TypeToken;
import com.smartx.tower.ApiException;
import com.smartx.tower.api.NvmfSubsystemApi;
import com.smartx.tower.model.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.*;

public class ITNvmfSubsystem extends ITBase {
    NvmfSubsystemApi api = null;
    HashMap<String, Object> payloads = new HashMap<String, Object>();

    @DataProvider(name = "nvmfSubsystemPayload")
    Object[][] data(Method m) {
        Object payload = payloads.get(m.getName());
        return payload == null ? new Object[][] {{"{}"}} : new Object[][] {{payload.toString()}};
    }

    @BeforeClass
    public void getService() throws IOException {
        api = new NvmfSubsystemApi(client);
        // get payloads from resource file
        InputStream stream = getClass().getResourceAsStream("/NvmfSubsystem.json");
        if (stream == null) {
            return;
        }
        // convert payloads string as map
        payloads =
                gson.fromJson(
                        ITUtils.readInputStream(stream),
                        new TypeToken<HashMap<String, Object>>() {}.getType());
    }

    @Test(dataProvider = "nvmfSubsystemPayload")
    public void getNvmfSubsystems(String payload) {
        try {
            // parse params from json payload
            GetNvmfSubsystemsRequestBody params =
                    gson.fromJson(
                            payload, new TypeToken<GetNvmfSubsystemsRequestBody>() {}.getType());
            // do some modify to params(optional)
            List<NvmfSubsystem> result = api.getNvmfSubsystems(params);
            assertThat(result).as("check result of getNvmfSubsystems").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "nvmfSubsystemPayload")
    public void getNvmfSubsystemsConnection(String payload) {
        try {
            // parse params from json payload
            GetNvmfSubsystemsConnectionRequestBody params =
                    gson.fromJson(
                            payload,
                            new TypeToken<GetNvmfSubsystemsConnectionRequestBody>() {}.getType());
            // do some modify to params(optional)
            NvmfSubsystemConnection result = api.getNvmfSubsystemsConnection(params);
            assertThat(result).as("check result of getNvmfSubsystemsConnection").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "nvmfSubsystemPayload")
    public void createNvmfSubsystem(String payload) {
        try {
            // parse params from json payload
            List<NvmfSubsystemCreationParams> params =
                    gson.fromJson(
                            payload,
                            new TypeToken<List<NvmfSubsystemCreationParams>>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskNvmfSubsystem> result = api.createNvmfSubsystem(params);
            assertThat(result).as("check result of createNvmfSubsystem").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "nvmfSubsystemPayload")
    public void deleteNvmfSubsystem(String payload) {
        try {
            // parse params from json payload
            NvmfSubsystemDeletionParams params =
                    gson.fromJson(
                            payload, new TypeToken<NvmfSubsystemDeletionParams>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskDeleteNvmfSubsystem> result = api.deleteNvmfSubsystem(params);
            assertThat(result).as("check result of deleteNvmfSubsystem").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "nvmfSubsystemPayload")
    public void updateNvmfSubsystem(String payload) {
        try {
            // parse params from json payload
            NvmfSubsystemUpdationParams params =
                    gson.fromJson(
                            payload, new TypeToken<NvmfSubsystemUpdationParams>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskNvmfSubsystem> result = api.updateNvmfSubsystem(params);
            assertThat(result).as("check result of updateNvmfSubsystem").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }
}
