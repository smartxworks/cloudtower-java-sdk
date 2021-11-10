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
import com.smartx.tower.api.LogCollectionApi;
import com.smartx.tower.model.*;

public class ITLogCollection extends ITBase {
  LogCollectionApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "logCollectionPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new LogCollectionApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/LogCollection.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "logCollectionPayload")
  public void getLogCollections(String payload) {
    try {
      // parse params from json payload
      GetLogCollectionsRequestBody params = gson.fromJson(payload, new TypeToken<GetLogCollectionsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<LogCollection> result = api.getLogCollections(params, contentLanguage);
      assertThat(result).as("check result of getLogCollections").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "logCollectionPayload")
  public void getLogCollectionsConnection(String payload) {
    try {
      // parse params from json payload
      GetLogCollectionsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetLogCollectionsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      LogCollectionConnection result = api.getLogCollectionsConnection(params, contentLanguage);
      assertThat(result).as("check result of getLogCollectionsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
