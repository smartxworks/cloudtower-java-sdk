package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import com.google.gson.reflect.TypeToken;
import com.smartx.tower.ApiException;
import com.smartx.tower.api.NodeTopoApi;
import com.smartx.tower.model.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.*;

public class ITNodeTopo extends ITBase {
    NodeTopoApi api = null;
    HashMap<String, Object> payloads = new HashMap<String, Object>();

    @DataProvider(name = "nodeTopoPayload")
    Object[][] data(Method m) {
        Object payload = payloads.get(m.getName());
        return payload == null ? new Object[][] {{"{}"}} : new Object[][] {{payload.toString()}};
    }

    @BeforeClass
    public void getService() throws IOException {
        api = new NodeTopoApi(client);
        // get payloads from resource file
        InputStream stream = getClass().getResourceAsStream("/NodeTopo.json");
        if (stream == null) {
            return;
        }
        // convert payloads string as map
        payloads =
                gson.fromJson(
                        ITUtils.readInputStream(stream),
                        new TypeToken<HashMap<String, Object>>() {}.getType());
    }

    @Test(dataProvider = "nodeTopoPayload")
    public void getNodeTopoes(String payload) {
        try {
            // parse params from json payload
            GetNodeTopoesRequestBody params =
                    gson.fromJson(payload, new TypeToken<GetNodeTopoesRequestBody>() {}.getType());
            // do some modify to params(optional)
            List<NodeTopo> result = api.getNodeTopoes(params);
            assertThat(result).as("check result of getNodeTopoes").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "nodeTopoPayload")
    public void getNodeTopoesConnection(String payload) {
        try {
            // parse params from json payload
            GetNodeTopoesConnectionRequestBody params =
                    gson.fromJson(
                            payload,
                            new TypeToken<GetNodeTopoesConnectionRequestBody>() {}.getType());
            // do some modify to params(optional)
            NodeTopoConnection result = api.getNodeTopoesConnection(params);
            assertThat(result).as("check result of getNodeTopoesConnection").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "nodeTopoPayload")
    public void updateNodeTopo(String payload) {
        try {
            // parse params from json payload
            List<NodeTopUpdationParam> params =
                    gson.fromJson(
                            payload, new TypeToken<List<NodeTopUpdationParam>>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskNodeTopo> result = api.updateNodeTopo(params);
            assertThat(result).as("check result of updateNodeTopo").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }
}
