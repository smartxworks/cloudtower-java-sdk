package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import com.google.gson.reflect.TypeToken;
import com.smartx.tower.ApiException;
import com.smartx.tower.api.ClusterUpgradeHistoryApi;
import com.smartx.tower.model.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.*;

public class ITClusterUpgradeHistory extends ITBase {
    ClusterUpgradeHistoryApi api = null;
    HashMap<String, Object> payloads = new HashMap<String, Object>();

    @DataProvider(name = "clusterUpgradeHistoryPayload")
    Object[][] data(Method m) {
        Object payload = payloads.get(m.getName());
        return payload == null ? new Object[][] {{"{}"}} : new Object[][] {{payload.toString()}};
    }

    @BeforeClass
    public void getService() throws IOException {
        api = new ClusterUpgradeHistoryApi(client);
        // get payloads from resource file
        InputStream stream = getClass().getResourceAsStream("/ClusterUpgradeHistory.json");
        if (stream == null) {
            return;
        }
        // convert payloads string as map
        payloads =
                gson.fromJson(
                        ITUtils.readInputStream(stream),
                        new TypeToken<HashMap<String, Object>>() {}.getType());
    }

    @Test(dataProvider = "clusterUpgradeHistoryPayload")
    public void getClusterUpgradeHistories(String payload) {
        try {
            // parse params from json payload
            GetClusterUpgradeHistoriesRequestBody params =
                    gson.fromJson(
                            payload,
                            new TypeToken<GetClusterUpgradeHistoriesRequestBody>() {}.getType());
            // do some modify to params(optional)
            List<ClusterUpgradeHistory> result = api.getClusterUpgradeHistories(params);
            assertThat(result).as("check result of getClusterUpgradeHistories").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "clusterUpgradeHistoryPayload")
    public void getClusterUpgradeHistoriesConnection(String payload) {
        try {
            // parse params from json payload
            GetClusterUpgradeHistoriesConnectionRequestBody params =
                    gson.fromJson(
                            payload,
                            new TypeToken<
                                    GetClusterUpgradeHistoriesConnectionRequestBody>() {}.getType());
            // do some modify to params(optional)
            ClusterUpgradeHistoryConnection result =
                    api.getClusterUpgradeHistoriesConnection(params);
            assertThat(result)
                    .as("check result of getClusterUpgradeHistoriesConnection")
                    .isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }
}
