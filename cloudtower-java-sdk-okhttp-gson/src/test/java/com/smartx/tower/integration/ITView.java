package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.ViewApi;
import com.smartx.tower.model.*;

public class ITView extends IT {
  ViewApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new ViewApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/View.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getViews(String payload) {
    try {
      // parse params from json payload
      GetViewsRequestBody params = gson.fromJson(payload, GetViewsRequestBody.class);
      // do some modify to params(optional)
      List<View> result = api.getViews("zh-CN", params);
      assertThat(result).as("check result of getViews").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getViewsConnection(String payload) {
    try {
      // parse params from json payload
      GetViewsConnectionRequestBody params = gson.fromJson(payload, GetViewsConnectionRequestBody.class);
      // do some modify to params(optional)
      ViewConnection result = api.getViewsConnection("zh-CN", params);
      assertThat(result).as("check result of getViewsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createView(String payload) {
    try {
      // parse params from json payload
      List<ViewCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskView> result = api.createView("zh-CN", params);
      assertThat(result).as("check result of createView").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateView(String payload) {
    try {
      // parse params from json payload
      ViewUpdationParams params = gson.fromJson(payload, ViewUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskView> result = api.updateView("zh-CN", params);
      assertThat(result).as("check result of updateView").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteView(String payload) {
    try {
      // parse params from json payload
      ViewDeletionParams params = gson.fromJson(payload, ViewDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteView> result = api.deleteView("zh-CN", params);
      assertThat(result).as("check result of deleteView").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
