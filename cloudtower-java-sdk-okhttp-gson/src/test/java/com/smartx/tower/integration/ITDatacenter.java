package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.DatacenterApi;
import com.smartx.tower.model.*;

public class ITDatacenter extends IT {
  DatacenterApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new DatacenterApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Datacenter.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getDatacenters(String payload) {
    try {
      // parse params from json payload
      GetDatacentersRequestBody params = gson.fromJson(payload, GetDatacentersRequestBody.class);
      // do some modify to params(optional)
      List<Datacenter> result = api.getDatacenters("zh-CN", params);
      assertThat(result).as("check result of getDatacenters").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getDatacentersConnection(String payload) {
    try {
      // parse params from json payload
      GetDatacentersConnectionRequestBody params = gson.fromJson(payload, GetDatacentersConnectionRequestBody.class);
      // do some modify to params(optional)
      DatacenterConnection result = api.getDatacentersConnection("zh-CN", params);
      assertThat(result).as("check result of getDatacentersConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createDatacenter(String payload) {
    try {
      // parse params from json payload
      List<DatacenterCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskDatacenter> result = api.createDatacenter("zh-CN", params);
      assertThat(result).as("check result of createDatacenter").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateDatacenter(String payload) {
    try {
      // parse params from json payload
      DatacenterUpdationParams params = gson.fromJson(payload, DatacenterUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskDatacenter> result = api.updateDatacenter("zh-CN", params);
      assertThat(result).as("check result of updateDatacenter").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteDatacenter(String payload) {
    try {
      // parse params from json payload
      DatacenterDeletionParams params = gson.fromJson(payload, DatacenterDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteDatacenter> result = api.deleteDatacenter("zh-CN", params);
      assertThat(result).as("check result of deleteDatacenter").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
