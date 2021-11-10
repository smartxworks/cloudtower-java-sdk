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
import com.smartx.tower.api.DeployApi;
import com.smartx.tower.model.*;

public class ITDeploy extends ITBase {
  DeployApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "deployPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new DeployApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Deploy.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "deployPayload")
  public void getDeploys(String payload) {
    try {
      // parse params from json payload
      GetDeploysRequestBody params = gson.fromJson(payload, new TypeToken<GetDeploysRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<Deploy> result = api.getDeploys(params, contentLanguage);
      assertThat(result).as("check result of getDeploys").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "deployPayload")
  public void getDeploysConnection(String payload) {
    try {
      // parse params from json payload
      GetDeploysConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetDeploysConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      DeployConnection result = api.getDeploysConnection(params, contentLanguage);
      assertThat(result).as("check result of getDeploysConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
