package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import com.google.gson.reflect.TypeToken;
import com.smartx.tower.ApiException;
import com.smartx.tower.api.BrickTopoApi;
import com.smartx.tower.model.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.*;

public class ITBrickTopo extends ITBase {
    BrickTopoApi api = null;
    HashMap<String, Object> payloads = new HashMap<String, Object>();

    @DataProvider(name = "brickTopoPayload")
    Object[][] data(Method m) {
        Object payload = payloads.get(m.getName());
        return payload == null ? new Object[][] {{"{}"}} : new Object[][] {{payload.toString()}};
    }

    @BeforeClass
    public void getService() throws IOException {
        api = new BrickTopoApi(client);
        // get payloads from resource file
        InputStream stream = getClass().getResourceAsStream("/BrickTopo.json");
        if (stream == null) {
            return;
        }
        // convert payloads string as map
        payloads =
                gson.fromJson(
                        ITUtils.readInputStream(stream),
                        new TypeToken<HashMap<String, Object>>() {}.getType());
    }

    @Test(dataProvider = "brickTopoPayload")
    public void createBrickTopo(String payload) {
        try {
            // parse params from json payload
            List<BrickTopoCreationParams> params =
                    gson.fromJson(
                            payload, new TypeToken<List<BrickTopoCreationParams>>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskBrickTopo> result = api.createBrickTopo(params);
            assertThat(result).as("check result of createBrickTopo").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "brickTopoPayload")
    public void deleteBrickTopo(String payload) {
        try {
            // parse params from json payload
            BrickTopoDeletionParams params =
                    gson.fromJson(payload, new TypeToken<BrickTopoDeletionParams>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskDeleteBrickTopo> result = api.deleteBrickTopo(params);
            assertThat(result).as("check result of deleteBrickTopo").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "brickTopoPayload")
    public void getBrickTopoes(String payload) {
        try {
            // parse params from json payload
            GetBrickTopoesRequestBody params =
                    gson.fromJson(payload, new TypeToken<GetBrickTopoesRequestBody>() {}.getType());
            // do some modify to params(optional)
            List<BrickTopo> result = api.getBrickTopoes(params);
            assertThat(result).as("check result of getBrickTopoes").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "brickTopoPayload")
    public void getBrickTopoesConnection(String payload) {
        try {
            // parse params from json payload
            GetBrickTopoesConnectionRequestBody params =
                    gson.fromJson(
                            payload,
                            new TypeToken<GetBrickTopoesConnectionRequestBody>() {}.getType());
            // do some modify to params(optional)
            BrickTopoConnection result = api.getBrickTopoesConnection(params);
            assertThat(result).as("check result of getBrickTopoesConnection").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "brickTopoPayload")
    public void moveBrickTopo(String payload) {
        try {
            // parse params from json payload
            BrickTopoMoveParams params =
                    gson.fromJson(payload, new TypeToken<BrickTopoMoveParams>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskBrickTopo> result = api.moveBrickTopo(params);
            assertThat(result).as("check result of moveBrickTopo").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "brickTopoPayload")
    public void updateBrickTopo(String payload) {
        try {
            // parse params from json payload
            BrickTopoUpdationParams params =
                    gson.fromJson(payload, new TypeToken<BrickTopoUpdationParams>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskBrickTopo> result = api.updateBrickTopo(params);
            assertThat(result).as("check result of updateBrickTopo").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }
}
