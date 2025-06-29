package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import com.google.gson.reflect.TypeToken;
import com.smartx.tower.ApiException;
import com.smartx.tower.api.IscsiConnectionApi;
import com.smartx.tower.model.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.*;

public class ITIscsiConnection extends ITBase {
    IscsiConnectionApi api = null;
    HashMap<String, Object> payloads = new HashMap<String, Object>();

    @DataProvider(name = "iscsiConnectionPayload")
    Object[][] data(Method m) {
        Object payload = payloads.get(m.getName());
        return payload == null ? new Object[][] {{"{}"}} : new Object[][] {{payload.toString()}};
    }

    @BeforeClass
    public void getService() throws IOException {
        api = new IscsiConnectionApi(client);
        // get payloads from resource file
        InputStream stream = getClass().getResourceAsStream("/IscsiConnection.json");
        if (stream == null) {
            return;
        }
        // convert payloads string as map
        payloads =
                gson.fromJson(
                        ITUtils.readInputStream(stream),
                        new TypeToken<HashMap<String, Object>>() {}.getType());
    }

    @Test(dataProvider = "iscsiConnectionPayload")
    public void getIscsiConnections(String payload) {
        try {
            // parse params from json payload
            GetIscsiConnectionsRequestBody params =
                    gson.fromJson(
                            payload, new TypeToken<GetIscsiConnectionsRequestBody>() {}.getType());
            // do some modify to params(optional)
            List<IscsiConnection> result = api.getIscsiConnections(params);
            assertThat(result).as("check result of getIscsiConnections").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "iscsiPayload")
    public void getIscsiConnectionsConnection(String payload) {
        try {
            // parse params from json payload
            GetIscsiConnectionsConnectionRequestBody params =
                    gson.fromJson(
                            payload,
                            new TypeToken<GetIscsiConnectionsConnectionRequestBody>() {}.getType());
            // do some modify to params(optional)
            IscsiConnectionConnection result = api.getIscsiConnectionsConnection(params);
            assertThat(result).as("check result of getIscsiConnectionsConnection").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }
}
