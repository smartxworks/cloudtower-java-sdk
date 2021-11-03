package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.LogCollectionApi;
import com.smartx.tower.model.*;

public class ITLogCollection extends IT {
  LogCollectionApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getLogCollections(String payload) {
    try {
      // parse params from json payload
      GetLogCollectionsRequestBody params = gson.fromJson(payload, GetLogCollectionsRequestBody.class);
      // do some modify to params(optional)
      List<LogCollection> result = api.getLogCollections("zh-CN", params);
      assertThat(result).as("check result of getLogCollections").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getLogCollectionsConnection(String payload) {
    try {
      // parse params from json payload
      GetLogCollectionsConnectionRequestBody params = gson.fromJson(payload, GetLogCollectionsConnectionRequestBody.class);
      // do some modify to params(optional)
      LogCollectionConnection result = api.getLogCollectionsConnection("zh-CN", params);
      assertThat(result).as("check result of getLogCollectionsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
