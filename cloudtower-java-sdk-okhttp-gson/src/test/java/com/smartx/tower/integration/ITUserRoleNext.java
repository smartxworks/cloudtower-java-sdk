package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.UserRoleNextApi;
import com.smartx.tower.model.*;

public class ITUserRoleNext extends IT {
  UserRoleNextApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getUserRoleNexts(String payload) {
    try {
      // parse params from json payload
      GetUserRoleNextsRequestBody params = gson.fromJson(payload, GetUserRoleNextsRequestBody.class);
      // do some modify to params(optional)
      List<UserRoleNext> result = api.getUserRoleNexts("zh-CN", params);
      assertThat(result).as("check result of getUserRoleNexts").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getUserRoleNextsConnection(String payload) {
    try {
      // parse params from json payload
      GetUserRoleNextsConnectionRequestBody params = gson.fromJson(payload, GetUserRoleNextsConnectionRequestBody.class);
      // do some modify to params(optional)
      UserRoleNextConnection result = api.getUserRoleNextsConnection("zh-CN", params);
      assertThat(result).as("check result of getUserRoleNextsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createRole(String payload) {
    try {
      // parse params from json payload
      List<RoleCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskUserRoleNext> result = api.createRole("zh-CN", params);
      assertThat(result).as("check result of createRole").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateRole(String payload) {
    try {
      // parse params from json payload
      RoleUpdationParams params = gson.fromJson(payload, RoleUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskUserRoleNext> result = api.updateRole("zh-CN", params);
      assertThat(result).as("check result of updateRole").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteRole(String payload) {
    try {
      // parse params from json payload
      RoleDeletionParams params = gson.fromJson(payload, RoleDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteRole> result = api.deleteRole("zh-CN", params);
      assertThat(result).as("check result of deleteRole").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
