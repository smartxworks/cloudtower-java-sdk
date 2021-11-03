package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.IscsiTargetApi;
import com.smartx.tower.model.*;

public class ITIscsiTarget extends IT {
  IscsiTargetApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new IscsiTargetApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/IscsiTarget.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getIscsiTargets(String payload) {
    try {
      // parse params from json payload
      GetIscsiTargetsRequestBody params = gson.fromJson(payload, GetIscsiTargetsRequestBody.class);
      // do some modify to params(optional)
      List<IscsiTarget> result = api.getIscsiTargets("zh-CN", params);
      assertThat(result).as("check result of getIscsiTargets").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getIscsiTargetsConnection(String payload) {
    try {
      // parse params from json payload
      GetIscsiTargetsConnectionRequestBody params = gson.fromJson(payload, GetIscsiTargetsConnectionRequestBody.class);
      // do some modify to params(optional)
      IscsiTargetConnection result = api.getIscsiTargetsConnection("zh-CN", params);
      assertThat(result).as("check result of getIscsiTargetsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createIscsiTarget(String payload) {
    try {
      // parse params from json payload
      List<IscsiTargetCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskIscsiTarget> result = api.createIscsiTarget("zh-CN", params);
      assertThat(result).as("check result of createIscsiTarget").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateIscsiTarget(String payload) {
    try {
      // parse params from json payload
      IscsiTargetUpdationParams params = gson.fromJson(payload, IscsiTargetUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskIscsiTarget> result = api.updateIscsiTarget("zh-CN", params);
      assertThat(result).as("check result of updateIscsiTarget").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteIscsiTarget(String payload) {
    try {
      // parse params from json payload
      IscsiTargetDeletionParams params = gson.fromJson(payload, IscsiTargetDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteIscsiTarget> result = api.deleteIscsiTarget("zh-CN", params);
      assertThat(result).as("check result of deleteIscsiTarget").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
