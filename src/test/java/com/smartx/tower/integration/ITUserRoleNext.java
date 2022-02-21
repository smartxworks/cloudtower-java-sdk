package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.UserRoleNextApi;
import com.smartx.tower.model.*;

public class ITUserRoleNext extends ITBase {
  UserRoleNextApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "userRoleNextPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new UserRoleNextApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/UserRoleNext.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "userRoleNextPayload")
  public void createRole(String payload) {
    try {
      // parse params from json payload
      List<RoleCreationParams> params = gson.fromJson(payload, new TypeToken<List<RoleCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskUserRoleNext> result = api.createRole(params);
      assertThat(result).as("check result of createRole").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "userRoleNextPayload")
  public void deleteRole(String payload) {
    try {
      // parse params from json payload
      RoleDeletionParams params = gson.fromJson(payload, new TypeToken<RoleDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteRole> result = api.deleteRole(params);
      assertThat(result).as("check result of deleteRole").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "userRoleNextPayload")
  public void getUserRoleNexts(String payload) {
    try {
      // parse params from json payload
      GetUserRoleNextsRequestBody params = gson.fromJson(payload, new TypeToken<GetUserRoleNextsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<UserRoleNext> result = api.getUserRoleNexts(params);
      assertThat(result).as("check result of getUserRoleNexts").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "userRoleNextPayload")
  public void getUserRoleNextsConnection(String payload) {
    try {
      // parse params from json payload
      GetUserRoleNextsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetUserRoleNextsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      UserRoleNextConnection result = api.getUserRoleNextsConnection(params);
      assertThat(result).as("check result of getUserRoleNextsConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "userRoleNextPayload")
  public void updateRole(String payload) {
    try {
      // parse params from json payload
      RoleUpdationParams params = gson.fromJson(payload, new TypeToken<RoleUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskUserRoleNext> result = api.updateRole(params);
      assertThat(result).as("check result of updateRole").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
