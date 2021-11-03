package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.LabelApi;
import com.smartx.tower.model.*;

public class ITLabel extends IT {
  LabelApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new LabelApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Label.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getLabels(String payload) {
    try {
      // parse params from json payload
      GetLabelsRequestBody params = gson.fromJson(payload, GetLabelsRequestBody.class);
      // do some modify to params(optional)
      List<Label> result = api.getLabels("zh-CN", params);
      assertThat(result).as("check result of getLabels").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getLabelsConnection(String payload) {
    try {
      // parse params from json payload
      GetLabelsConnectionRequestBody params = gson.fromJson(payload, GetLabelsConnectionRequestBody.class);
      // do some modify to params(optional)
      LabelConnection result = api.getLabelsConnection("zh-CN", params);
      assertThat(result).as("check result of getLabelsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createLabel(String payload) {
    try {
      // parse params from json payload
      List<LabelCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskLabel> result = api.createLabel("zh-CN", params);
      assertThat(result).as("check result of createLabel").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateLabel(String payload) {
    try {
      // parse params from json payload
      LabelUpdationParams params = gson.fromJson(payload, LabelUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskLabel> result = api.updateLabel("zh-CN", params);
      assertThat(result).as("check result of updateLabel").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void addLabelsToResources(String payload) {
    try {
      // parse params from json payload
      AddLabelsToResourcesParams params = gson.fromJson(payload, AddLabelsToResourcesParams.class);
      // do some modify to params(optional)
      List<WithTaskLabel> result = api.addLabelsToResources("zh-CN", params);
      assertThat(result).as("check result of addLabelsToResources").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void removeLabelsFromResources(String payload) {
    try {
      // parse params from json payload
      AddLabelsToResourcesParams params = gson.fromJson(payload, AddLabelsToResourcesParams.class);
      // do some modify to params(optional)
      List<WithTaskLabel> result = api.removeLabelsFromResources("zh-CN", params);
      assertThat(result).as("check result of removeLabelsFromResources").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteLabel(String payload) {
    try {
      // parse params from json payload
      LabelDeletionParams params = gson.fromJson(payload, LabelDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteLabel> result = api.deleteLabel("zh-CN", params);
      assertThat(result).as("check result of deleteLabel").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
