package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import com.google.gson.reflect.TypeToken;
import com.smartx.tower.ApiException;
import com.smartx.tower.api.TaskApi;
import com.smartx.tower.model.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.*;

public class ITTask extends ITBase {
    TaskApi api = null;
    HashMap<String, Object> payloads = new HashMap<String, Object>();

    @DataProvider(name = "taskPayload")
    Object[][] data(Method m) {
        Object payload = payloads.get(m.getName());
        return payload == null ? new Object[][] {{"{}"}} : new Object[][] {{payload.toString()}};
    }

    @BeforeClass
    public void getService() throws IOException {
        api = new TaskApi(client);
        // get payloads from resource file
        InputStream stream = getClass().getResourceAsStream("/Task.json");
        if (stream == null) {
            return;
        }
        // convert payloads string as map
        payloads =
                gson.fromJson(
                        ITUtils.readInputStream(stream),
                        new TypeToken<HashMap<String, Object>>() {}.getType());
    }

    @Test(dataProvider = "taskPayload")
    public void getTasks(String payload) {
        try {
            // parse params from json payload
            GetTasksRequestBody params =
                    gson.fromJson(payload, new TypeToken<GetTasksRequestBody>() {}.getType());
            // do some modify to params(optional)
            List<Task> result = api.getTasks(params);
            assertThat(result).as("check result of getTasks").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "taskPayload")
    public void getTasksConnection(String payload) {
        try {
            // parse params from json payload
            GetTasksConnectionRequestBody params =
                    gson.fromJson(
                            payload, new TypeToken<GetTasksConnectionRequestBody>() {}.getType());
            // do some modify to params(optional)
            TaskConnection result = api.getTasksConnection(params);
            assertThat(result).as("check result of getTasksConnection").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }
}
