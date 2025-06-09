package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import com.google.gson.reflect.TypeToken;
import com.smartx.tower.ApiException;
import com.smartx.tower.api.UploadTaskApi;
import com.smartx.tower.model.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.*;

public class ITUploadTask extends ITBase {
    UploadTaskApi api = null;
    HashMap<String, Object> payloads = new HashMap<String, Object>();

    @DataProvider(name = "uploadTaskPayload")
    Object[][] data(Method m) {
        Object payload = payloads.get(m.getName());
        return payload == null ? new Object[][] {{"{}"}} : new Object[][] {{payload.toString()}};
    }

    @BeforeClass
    public void getService() throws IOException {
        api = new UploadTaskApi(client);
        // get payloads from resource file
        InputStream stream = getClass().getResourceAsStream("/UploadTask.json");
        if (stream == null) {
            return;
        }
        // convert payloads string as map
        payloads =
                gson.fromJson(
                        ITUtils.readInputStream(stream),
                        new TypeToken<HashMap<String, Object>>() {}.getType());
    }

    @Test(dataProvider = "uploadTaskPayload")
    public void getUploadTasks(String payload) {
        try {
            // parse params from json payload
            GetUploadTasksRequestBody params =
                    gson.fromJson(payload, new TypeToken<GetUploadTasksRequestBody>() {}.getType());
            // do some modify to params(optional)
            List<UploadTask> result = api.getUploadTasks(params);
            assertThat(result).as("check result of getUploadTasks").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "uploadTaskPayload")
    public void getUploadTasksConnection(String payload) {
        try {
            // parse params from json payload
            GetUploadTasksConnectionRequestBody params =
                    gson.fromJson(
                            payload,
                            new TypeToken<GetUploadTasksConnectionRequestBody>() {}.getType());
            // do some modify to params(optional)
            UploadTaskConnection result = api.getUploadTasksConnection(params);
            assertThat(result).as("check result of getUploadTasksConnection").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }
}
