package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.RackTopoApi;
import com.smartx.tower.model.*;

public class ITRackTopo extends IT {
  RackTopoApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new RackTopoApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/RackTopo.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getRackTopoes(String payload) {
    try {
      // parse params from json payload
      GetRackTopoesRequestBody params = gson.fromJson(payload, GetRackTopoesRequestBody.class);
      // do some modify to params(optional)
      List<RackTopo> result = api.getRackTopoes("zh-CN", params);
      assertThat(result).as("check result of getRackTopoes").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getRackTopoesConnection(String payload) {
    try {
      // parse params from json payload
      GetRackTopoesConnectionRequestBody params = gson.fromJson(payload, GetRackTopoesConnectionRequestBody.class);
      // do some modify to params(optional)
      RackTopoConnection result = api.getRackTopoesConnection("zh-CN", params);
      assertThat(result).as("check result of getRackTopoesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createRackTopo(String payload) {
    try {
      // parse params from json payload
      List<RackTopoCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskRackTopo> result = api.createRackTopo("zh-CN", params);
      assertThat(result).as("check result of createRackTopo").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateRackTopo(String payload) {
    try {
      // parse params from json payload
      RackTopoUpdationParams params = gson.fromJson(payload, RackTopoUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskRackTopo> result = api.updateRackTopo("zh-CN", params);
      assertThat(result).as("check result of updateRackTopo").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteRackTopo(String payload) {
    try {
      // parse params from json payload
      RackTopoDeletionParams params = gson.fromJson(payload, RackTopoDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteRackTopo> result = api.deleteRackTopo("zh-CN", params);
      assertThat(result).as("check result of deleteRackTopo").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
