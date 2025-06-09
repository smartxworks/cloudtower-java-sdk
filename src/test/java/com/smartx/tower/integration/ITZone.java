package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import com.google.gson.reflect.TypeToken;
import com.smartx.tower.ApiException;
import com.smartx.tower.api.ZoneApi;
import com.smartx.tower.model.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.*;

public class ITZone extends ITBase {
    ZoneApi api = null;
    HashMap<String, Object> payloads = new HashMap<String, Object>();

    @DataProvider(name = "zonePayload")
    Object[][] data(Method m) {
        Object payload = payloads.get(m.getName());
        return payload == null ? new Object[][] {{"{}"}} : new Object[][] {{payload.toString()}};
    }

    @BeforeClass
    public void getService() throws IOException {
        api = new ZoneApi(client);
        // get payloads from resource file
        InputStream stream = getClass().getResourceAsStream("/Zone.json");
        if (stream == null) {
            return;
        }
        // convert payloads string as map
        payloads =
                gson.fromJson(
                        ITUtils.readInputStream(stream),
                        new TypeToken<HashMap<String, Object>>() {}.getType());
    }

    @Test(dataProvider = "zonePayload")
    public void getZones(String payload) {
        try {
            // parse params from json payload
            GetZonesRequestBody params =
                    gson.fromJson(payload, new TypeToken<GetZonesRequestBody>() {}.getType());
            // do some modify to params(optional)
            List<Zone> result = api.getZones(params);
            assertThat(result).as("check result of getZones").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "zonePayload")
    public void getZonesConnection(String payload) {
        try {
            // parse params from json payload
            GetZonesConnectionRequestBody params =
                    gson.fromJson(
                            payload, new TypeToken<GetZonesConnectionRequestBody>() {}.getType());
            // do some modify to params(optional)
            ZoneConnection result = api.getZonesConnection(params);
            assertThat(result).as("check result of getZonesConnection").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }
}
