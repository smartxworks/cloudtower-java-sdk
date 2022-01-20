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
import com.smartx.tower.api.OrganizationApi;
import com.smartx.tower.model.*;

public class ITOrganization extends ITBase {
  OrganizationApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "organizationPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "organizationPayload")
  public void createOrganization(String payload) {
    try {
      // parse params from json payload
      List<OrganizationCreationParams> params = gson.fromJson(payload, new TypeToken<List<OrganizationCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskOrganization> result = api.createOrganization(params, contentLanguage);
      assertThat(result).as("check result of createOrganization").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "organizationPayload")
  public void deleteOrganization(String payload) {
    try {
      // parse params from json payload
      OrganizationDeletionParams params = gson.fromJson(payload, new TypeToken<OrganizationDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteOrganization> result = api.deleteOrganization(params, contentLanguage);
      assertThat(result).as("check result of deleteOrganization").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "organizationPayload")
  public void getOrganizations(String payload) {
    try {
      // parse params from json payload
      GetOrganizationsRequestBody params = gson.fromJson(payload, new TypeToken<GetOrganizationsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<Organization> result = api.getOrganizations(params, contentLanguage);
      assertThat(result).as("check result of getOrganizations").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "organizationPayload")
  public void getOrganizationsConnection(String payload) {
    try {
      // parse params from json payload
      GetOrganizationsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetOrganizationsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      OrganizationConnection result = api.getOrganizationsConnection(params, contentLanguage);
      assertThat(result).as("check result of getOrganizationsConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "organizationPayload")
  public void updateOrganization(String payload) {
    try {
      // parse params from json payload
      OrganizationUpdationParams params = gson.fromJson(payload, new TypeToken<OrganizationUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskOrganization> result = api.updateOrganization(params, contentLanguage);
      assertThat(result).as("check result of updateOrganization").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
