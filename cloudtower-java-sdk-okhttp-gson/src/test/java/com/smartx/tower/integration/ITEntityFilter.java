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
import com.smartx.tower.api.EntityFilterApi;
import com.smartx.tower.model.*;

public class ITEntityFilter extends ITBase {
  EntityFilterApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "entityFilterPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new EntityFilterApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/EntityFilter.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "entityFilterPayload")
  public void createEntityFilter(String payload) {
    try {
      // parse params from json payload
      List<EntityFilterCreationParams> params = gson.fromJson(payload, new TypeToken<List<EntityFilterCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskEntityFilter> result = api.createEntityFilter(params, contentLanguage);
      assertThat(result).as("check result of createEntityFilter").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "entityFilterPayload")
  public void deleteEntityFilter(String payload) {
    try {
      // parse params from json payload
      EntityFilterDeletionParams params = gson.fromJson(payload, new TypeToken<EntityFilterDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteEntityFilter> result = api.deleteEntityFilter(params, contentLanguage);
      assertThat(result).as("check result of deleteEntityFilter").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "entityFilterPayload")
  public void getEntityFilters(String payload) {
    try {
      // parse params from json payload
      GetEntityFiltersRequestBody params = gson.fromJson(payload, new TypeToken<GetEntityFiltersRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<EntityFilter> result = api.getEntityFilters(params, contentLanguage);
      assertThat(result).as("check result of getEntityFilters").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "entityFilterPayload")
  public void getEntityFiltersConnection(String payload) {
    try {
      // parse params from json payload
      GetEntityFiltersConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetEntityFiltersConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      EntityFilterConnection result = api.getEntityFiltersConnection(params, contentLanguage);
      assertThat(result).as("check result of getEntityFiltersConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "entityFilterPayload")
  public void updateEntityFilter(String payload) {
    try {
      // parse params from json payload
      EntityFilterUpdationParams params = gson.fromJson(payload, new TypeToken<EntityFilterUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskEntityFilter> result = api.updateEntityFilter(params, contentLanguage);
      assertThat(result).as("check result of updateEntityFilter").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
