package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import com.google.gson.reflect.TypeToken;
import com.smartx.tower.ApiException;
import com.smartx.tower.api.HostApi;
import com.smartx.tower.model.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.*;

public class ITHost extends ITBase {
    HostApi api = null;
    HashMap<String, Object> payloads = new HashMap<String, Object>();

    @DataProvider(name = "hostPayload")
    Object[][] data(Method m) {
        Object payload = payloads.get(m.getName());
        return payload == null ? new Object[][] {{"{}"}} : new Object[][] {{payload.toString()}};
    }

    @BeforeClass
    public void getService() throws IOException {
        api = new HostApi(client);
        // get payloads from resource file
        InputStream stream = getClass().getResourceAsStream("/Host.json");
        if (stream == null) {
            return;
        }
        // convert payloads string as map
        payloads =
                gson.fromJson(
                        ITUtils.readInputStream(stream),
                        new TypeToken<HashMap<String, Object>>() {}.getType());
    }

    @Test(dataProvider = "hostPayload")
    public void createHost(String payload) {
        try {
            // parse params from json payload
            List<HostCreationParams> params =
                    gson.fromJson(payload, new TypeToken<List<HostCreationParams>>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskBatchHosts> result = api.createHost(params);
            assertThat(result).as("check result of createHost").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "hostPayload")
    public void getHosts(String payload) {
        try {
            // parse params from json payload
            GetHostsRequestBody params =
                    gson.fromJson(payload, new TypeToken<GetHostsRequestBody>() {}.getType());
            // do some modify to params(optional)
            List<Host> result = api.getHosts(params);
            assertThat(result).as("check result of getHosts").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "hostPayload")
    public void getHostsConnection(String payload) {
        try {
            // parse params from json payload
            GetHostsConnectionRequestBody params =
                    gson.fromJson(
                            payload, new TypeToken<GetHostsConnectionRequestBody>() {}.getType());
            // do some modify to params(optional)
            HostConnection result = api.getHostsConnection(params);
            assertThat(result).as("check result of getHostsConnection").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "hostPayload")
    public void triggerDiskBlink(String payload) {
        try {
            // parse params from json payload
            List<TriggerDiskBlinkParams> params =
                    gson.fromJson(
                            payload, new TypeToken<List<TriggerDiskBlinkParams>>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskHost> result = api.triggerDiskBlink(params);
            assertThat(result).as("check result of triggerDiskBlink").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "hostPayload")
    public void updateHost(String payload) {
        try {
            // parse params from json payload
            HostUpdationParams params =
                    gson.fromJson(payload, new TypeToken<HostUpdationParams>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskHost> result = api.updateHost(params);
            assertThat(result).as("check result of updateHost").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }
}
