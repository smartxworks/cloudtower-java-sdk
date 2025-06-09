package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import com.google.gson.reflect.TypeToken;
import com.smartx.tower.ApiException;
import com.smartx.tower.api.AlertNotifierApi;
import com.smartx.tower.model.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.*;

public class ITAlertNotifier extends ITBase {
    AlertNotifierApi api = null;
    HashMap<String, Object> payloads = new HashMap<String, Object>();

    @DataProvider(name = "alertNotifierPayload")
    Object[][] data(Method m) {
        Object payload = payloads.get(m.getName());
        return payload == null ? new Object[][] {{"{}"}} : new Object[][] {{payload.toString()}};
    }

    @BeforeClass
    public void getService() throws IOException {
        api = new AlertNotifierApi(client);
        // get payloads from resource file
        InputStream stream = getClass().getResourceAsStream("/AlertNotifier.json");
        if (stream == null) {
            return;
        }
        // convert payloads string as map
        payloads =
                gson.fromJson(
                        ITUtils.readInputStream(stream),
                        new TypeToken<HashMap<String, Object>>() {}.getType());
    }

    @Test(dataProvider = "alertNotifierPayload")
    public void getAlertNotifiers(String payload) {
        try {
            // parse params from json payload
            GetAlertNotifiersRequestBody params =
                    gson.fromJson(
                            payload, new TypeToken<GetAlertNotifiersRequestBody>() {}.getType());
            // do some modify to params(optional)
            List<AlertNotifier> result = api.getAlertNotifiers(params);
            assertThat(result).as("check result of getAlertNotifiers").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "alertNotifierPayload")
    public void getAlertNotifiersConnection(String payload) {
        try {
            // parse params from json payload
            GetAlertNotifiersConnectionRequestBody params =
                    gson.fromJson(
                            payload,
                            new TypeToken<GetAlertNotifiersConnectionRequestBody>() {}.getType());
            // do some modify to params(optional)
            AlertNotifierConnection result = api.getAlertNotifiersConnection(params);
            assertThat(result).as("check result of getAlertNotifiersConnection").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }
}
