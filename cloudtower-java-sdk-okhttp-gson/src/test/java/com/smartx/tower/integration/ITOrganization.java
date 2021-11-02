package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.OrganizationApi;
import com.smartx.tower.model.*;

public class ITOrganization extends IT {
  OrganizationApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new OrganizationApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Organization.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getOrganizations(String payload) {
    try {
      // parse params from json payload
      GetOrganizationsRequestBody params = gson.fromJson(payload, GetOrganizationsRequestBody.class);
      // do some modify to params(optional)
      List<Organization> result = api.getOrganizations("zh-CN", params);
      assertThat(result).as("check result of getOrganizations").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getOrganizationsConnection(String payload) {
    try {
      // parse params from json payload
      GetOrganizationsConnectionRequestBody params = gson.fromJson(payload, GetOrganizationsConnectionRequestBody.class);
      // do some modify to params(optional)
      OrganizationConnection result = api.getOrganizationsConnection("zh-CN", params);
      assertThat(result).as("check result of getOrganizationsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createOrganization(String payload) {
    try {
      // parse params from json payload
      List<OrganizationCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskOrganization> result = api.createOrganization("zh-CN", params);
      assertThat(result).as("check result of createOrganization").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateOrganization(String payload) {
    try {
      // parse params from json payload
      OrganizationUpdationParams params = gson.fromJson(payload, OrganizationUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskOrganization> result = api.updateOrganization("zh-CN", params);
      assertThat(result).as("check result of updateOrganization").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteOrganization(String payload) {
    try {
      // parse params from json payload
      OrganizationDeletionParams params = gson.fromJson(payload, OrganizationDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteOrganization> result = api.deleteOrganization("zh-CN", params);
      assertThat(result).as("check result of deleteOrganization").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
