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
import com.smartx.tower.api.RackTopoApi;
import com.smartx.tower.model.*;

public class ITRackTopo extends ITBase {
  RackTopoApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "rackTopoPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "rackTopoPayload")
  public void createRackTopo(String payload) {
    try {
      // parse params from json payload
      List<RackTopoCreationParams> params = gson.fromJson(payload, new TypeToken<List<RackTopoCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskRackTopo> result = api.createRackTopo(params, contentLanguage);
      assertThat(result).as("check result of createRackTopo").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "rackTopoPayload")
  public void deleteRackTopo(String payload) {
    try {
      // parse params from json payload
      RackTopoDeletionParams params = gson.fromJson(payload, new TypeToken<RackTopoDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteRackTopo> result = api.deleteRackTopo(params, contentLanguage);
      assertThat(result).as("check result of deleteRackTopo").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "rackTopoPayload")
  public void getRackTopoes(String payload) {
    try {
      // parse params from json payload
      GetRackTopoesRequestBody params = gson.fromJson(payload, new TypeToken<GetRackTopoesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<RackTopo> result = api.getRackTopoes(params, contentLanguage);
      assertThat(result).as("check result of getRackTopoes").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "rackTopoPayload")
  public void getRackTopoesConnection(String payload) {
    try {
      // parse params from json payload
      GetRackTopoesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetRackTopoesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      RackTopoConnection result = api.getRackTopoesConnection(params, contentLanguage);
      assertThat(result).as("check result of getRackTopoesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "rackTopoPayload")
  public void updateRackTopo(String payload) {
    try {
      // parse params from json payload
      RackTopoUpdationParams params = gson.fromJson(payload, new TypeToken<RackTopoUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskRackTopo> result = api.updateRackTopo(params, contentLanguage);
      assertThat(result).as("check result of updateRackTopo").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
