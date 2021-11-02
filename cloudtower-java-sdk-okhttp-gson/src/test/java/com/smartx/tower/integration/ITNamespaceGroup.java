package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.NamespaceGroupApi;
import com.smartx.tower.model.*;

public class ITNamespaceGroup extends IT {
  NamespaceGroupApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new NamespaceGroupApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/NamespaceGroup.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getNamespaceGroups(String payload) {
    try {
      // parse params from json payload
      GetNamespaceGroupsRequestBody params = gson.fromJson(payload, GetNamespaceGroupsRequestBody.class);
      // do some modify to params(optional)
      List<NamespaceGroup> result = api.getNamespaceGroups("zh-CN", params);
      assertThat(result).as("check result of getNamespaceGroups").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getNamespaceGroupsConnection(String payload) {
    try {
      // parse params from json payload
      GetNamespaceGroupsConnectionRequestBody params = gson.fromJson(payload, GetNamespaceGroupsConnectionRequestBody.class);
      // do some modify to params(optional)
      NamespaceGroupConnection result = api.getNamespaceGroupsConnection("zh-CN", params);
      assertThat(result).as("check result of getNamespaceGroupsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createNamespaceGroup(String payload) {
    try {
      // parse params from json payload
      List<NamespaceGroupCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskNamespaceGroup> result = api.createNamespaceGroup("zh-CN", params);
      assertThat(result).as("check result of createNamespaceGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateNamespaceGroup(String payload) {
    try {
      // parse params from json payload
      NamespaceGroupUpdationParams params = gson.fromJson(payload, NamespaceGroupUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskNamespaceGroup> result = api.updateNamespaceGroup("zh-CN", params);
      assertThat(result).as("check result of updateNamespaceGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteNamespaceGroup(String payload) {
    try {
      // parse params from json payload
      NamespaceGroupDeletionParams params = gson.fromJson(payload, NamespaceGroupDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteNamespaceGroup> result = api.deleteNamespaceGroup("zh-CN", params);
      assertThat(result).as("check result of deleteNamespaceGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
