package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import com.google.gson.reflect.TypeToken;
import com.smartx.tower.ApiException;
import com.smartx.tower.api.UserApi;
import com.smartx.tower.model.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.*;

public class ITUser extends ITBase {
    UserApi api = null;
    HashMap<String, Object> payloads = new HashMap<String, Object>();

    @DataProvider(name = "userPayload")
    Object[][] data(Method m) {
        Object payload = payloads.get(m.getName());
        return payload == null ? new Object[][] {{"{}"}} : new Object[][] {{payload.toString()}};
    }

    @BeforeClass
    public void getService() throws IOException {
        api = new UserApi(client);
        // get payloads from resource file
        InputStream stream = getClass().getResourceAsStream("/User.json");
        if (stream == null) {
            return;
        }
        // convert payloads string as map
        payloads =
                gson.fromJson(
                        ITUtils.readInputStream(stream),
                        new TypeToken<HashMap<String, Object>>() {}.getType());
    }

    @Test(dataProvider = "userPayload")
    public void createUser(String payload) {
        try {
            // parse params from json payload
            List<UserCreationParams> params =
                    gson.fromJson(payload, new TypeToken<List<UserCreationParams>>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskUser> result = api.createUser(params);
            assertThat(result).as("check result of createUser").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "userPayload")
    public void deleteUser(String payload) {
        try {
            // parse params from json payload
            UserDeletionParams params =
                    gson.fromJson(payload, new TypeToken<UserDeletionParams>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskDeleteUser> result = api.deleteUser(params);
            assertThat(result).as("check result of deleteUser").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "userPayload")
    public void getUsers(String payload) {
        try {
            // parse params from json payload
            GetUsersRequestBody params =
                    gson.fromJson(payload, new TypeToken<GetUsersRequestBody>() {}.getType());
            // do some modify to params(optional)
            List<User> result = api.getUsers(params);
            assertThat(result).as("check result of getUsers").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "userPayload")
    public void getUsersConnection(String payload) {
        try {
            // parse params from json payload
            GetUsersConnectionRequestBody params =
                    gson.fromJson(
                            payload, new TypeToken<GetUsersConnectionRequestBody>() {}.getType());
            // do some modify to params(optional)
            UserConnection result = api.getUsersConnection(params);
            assertThat(result).as("check result of getUsersConnection").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "userPayload")
    public void login(String payload) {
        try {
            // parse params from json payload
            LoginInput params = gson.fromJson(payload, new TypeToken<LoginInput>() {}.getType());
            // do some modify to params(optional)
            WithTaskLoginResponse result = api.login(params);
            assertThat(result).as("check result of login").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }

    @Test(dataProvider = "userPayload")
    public void updateUser(String payload) {
        try {
            // parse params from json payload
            UserUpdationParams params =
                    gson.fromJson(payload, new TypeToken<UserUpdationParams>() {}.getType());
            // do some modify to params(optional)
            List<WithTaskUser> result = api.updateUser(params);
            assertThat(result).as("check result of updateUser").isNotNull();
        } catch (ApiException e) {
            LOGGER.error(e.getResponseBody());
            LOGGER.error(e.getCode());
            assertThat(true).as(e.getResponseBody()).isFalse();
        }
    }
}
