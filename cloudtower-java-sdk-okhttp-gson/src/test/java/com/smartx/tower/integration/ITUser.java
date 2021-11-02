package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.UserApi;
import com.smartx.tower.model.*;

public class ITUser extends IT {
  UserApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getUsers(String payload) {
    try {
      // parse params from json payload
      GetUsersRequestBody params = gson.fromJson(payload, GetUsersRequestBody.class);
      // do some modify to params(optional)
      List<User> result = api.getUsers("zh-CN", params);
      assertThat(result).as("check result of getUsers").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getUsersConnection(String payload) {
    try {
      // parse params from json payload
      GetUsersConnectionRequestBody params = gson.fromJson(payload, GetUsersConnectionRequestBody.class);
      // do some modify to params(optional)
      UserConnection result = api.getUsersConnection("zh-CN", params);
      assertThat(result).as("check result of getUsersConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createUser(String payload) {
    try {
      // parse params from json payload
      List<UserCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskUser> result = api.createUser("zh-CN", params);
      assertThat(result).as("check result of createUser").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateUser(String payload) {
    try {
      // parse params from json payload
      UserUpdationParams params = gson.fromJson(payload, UserUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskUser> result = api.updateUser("zh-CN", params);
      assertThat(result).as("check result of updateUser").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void login(String payload) {
    try {
      // parse params from json payload
      LoginInput params = gson.fromJson(payload, LoginInput.class);
      // do some modify to params(optional)
      WithTaskTokenString result = api.login("zh-CN", params);
      assertThat(result).as("check result of login").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteUser(String payload) {
    try {
      // parse params from json payload
      UserDeletionParams params = gson.fromJson(payload, UserDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteUser> result = api.deleteUser("zh-CN", params);
      assertThat(result).as("check result of deleteUser").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
