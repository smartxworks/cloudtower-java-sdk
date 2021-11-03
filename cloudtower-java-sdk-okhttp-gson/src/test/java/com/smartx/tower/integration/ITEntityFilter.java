package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.EntityFilterApi;
import com.smartx.tower.model.*;

public class ITEntityFilter extends IT {
  EntityFilterApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getEntityFilters(String payload) {
    try {
      // parse params from json payload
      GetEntityFiltersRequestBody params = gson.fromJson(payload, GetEntityFiltersRequestBody.class);
      // do some modify to params(optional)
      List<EntityFilter> result = api.getEntityFilters("zh-CN", params);
      assertThat(result).as("check result of getEntityFilters").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getEntityFiltersConnection(String payload) {
    try {
      // parse params from json payload
      GetEntityFiltersConnectionRequestBody params = gson.fromJson(payload, GetEntityFiltersConnectionRequestBody.class);
      // do some modify to params(optional)
      EntityFilterConnection result = api.getEntityFiltersConnection("zh-CN", params);
      assertThat(result).as("check result of getEntityFiltersConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createEntityFilter(String payload) {
    try {
      // parse params from json payload
      List<EntityFilterCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskEntityFilter> result = api.createEntityFilter("zh-CN", params);
      assertThat(result).as("check result of createEntityFilter").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateEntityFilter(String payload) {
    try {
      // parse params from json payload
      EntityFilterUpdationParams params = gson.fromJson(payload, EntityFilterUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskEntityFilter> result = api.updateEntityFilter("zh-CN", params);
      assertThat(result).as("check result of updateEntityFilter").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteEntityFilter(String payload) {
    try {
      // parse params from json payload
      EntityFilterDeletionParams params = gson.fromJson(payload, EntityFilterDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteEntityFilter> result = api.deleteEntityFilter("zh-CN", params);
      assertThat(result).as("check result of deleteEntityFilter").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
