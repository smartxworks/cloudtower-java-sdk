package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.ConsistencyGroupApi;
import com.smartx.tower.model.*;

public class ITConsistencyGroup extends IT {
  ConsistencyGroupApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new ConsistencyGroupApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/ConsistencyGroup.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getConsistencyGroups(String payload) {
    try {
      // parse params from json payload
      GetConsistencyGroupsRequestBody params = gson.fromJson(payload, GetConsistencyGroupsRequestBody.class);
      // do some modify to params(optional)
      List<ConsistencyGroup> result = api.getConsistencyGroups("zh-CN", params);
      assertThat(result).as("check result of getConsistencyGroups").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getConsistencyGroupsConnection(String payload) {
    try {
      // parse params from json payload
      GetConsistencyGroupsConnectionRequestBody params = gson.fromJson(payload, GetConsistencyGroupsConnectionRequestBody.class);
      // do some modify to params(optional)
      ConsistencyGroupConnection result = api.getConsistencyGroupsConnection("zh-CN", params);
      assertThat(result).as("check result of getConsistencyGroupsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createConsistencyGroup(String payload) {
    try {
      // parse params from json payload
      List<ConsistencyGroupCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskConsistencyGroup> result = api.createConsistencyGroup("zh-CN", params);
      assertThat(result).as("check result of createConsistencyGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateConsistencyGroup(String payload) {
    try {
      // parse params from json payload
      ConsistencyGroupUpdationParams params = gson.fromJson(payload, ConsistencyGroupUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskConsistencyGroup> result = api.updateConsistencyGroup("zh-CN", params);
      assertThat(result).as("check result of updateConsistencyGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteConsistencyGroup(String payload) {
    try {
      // parse params from json payload
      ConsistencyGroupDeletionParams params = gson.fromJson(payload, ConsistencyGroupDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteConsistencyGroup> result = api.deleteConsistencyGroup("zh-CN", params);
      assertThat(result).as("check result of deleteConsistencyGroup").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
