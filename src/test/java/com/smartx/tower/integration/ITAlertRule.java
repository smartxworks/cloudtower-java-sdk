package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import com.google.gson.reflect.TypeToken;
import com.smartx.tower.ApiException;
import com.smartx.tower.api.AlertRuleApi;
import com.smartx.tower.model.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.*;

public class ITAlertRule extends ITBase {
    AlertRuleApi api = null;
    HashMap<String, Object> payloads = new HashMap<String, Object>();

    @DataProvider(name = "alertRulePayload")
    Object[][] data(Method m) {
        Object payload = payloads.get(m.getName());
        return payload == null ? new Object[][] {{"{}"}} : new Object[][] {{payload.toString()}};
    }

    @BeforeClass
    public void getService() throws IOException {
        api = new AlertRuleApi(client);
        // get payloads from resource file
        InputStream stream = getClass().getResourceAsStream("/AlertRule.json");
        if (stream == null) {
            return;
        }
        // convert payloads string as map
        payloads =
                gson.fromJson(
                        ITUtils.readInputStream(stream),
                        new TypeToken<HashMap<String, Object>>() {}.getType());
    }

    @Test(dataProvider = "alertRulePayload")
    public void getAlertRules(String payload) {
        try {
            // parse params from json payload
            GetAlertRulesRequestBody params =
                    gson.fromJson(payload, new TypeToken<GetAlertRulesRequestBody>() {}.getType());
            // do some modify to params(optional)
            List<AlertRule> result = api.getAlertRules(params);
            assertThat(result).as("check result of getAlertRules").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "alertRulePayload")
    public void getAlertRulesConnection(String payload) {
        try {
            // parse params from json payload
            GetAlertRulesConnectionRequestBody params =
                    gson.fromJson(
                            payload,
                            new TypeToken<GetAlertRulesConnectionRequestBody>() {}.getType());
            // do some modify to params(optional)
            AlertRuleConnection result = api.getAlertRulesConnection(params);
            assertThat(result).as("check result of getAlertRulesConnection").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }
}
