package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.ElfDataStoreApi;
import com.smartx.tower.model.*;

public class ITElfDataStore extends IT {
  ElfDataStoreApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new ElfDataStoreApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/ElfDataStore.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getElfDataStores(String payload) {
    try {
      // parse params from json payload
      GetElfDataStoresRequestBody params = gson.fromJson(payload, GetElfDataStoresRequestBody.class);
      // do some modify to params(optional)
      List<ElfDataStore> result = api.getElfDataStores("zh-CN", params);
      assertThat(result).as("check result of getElfDataStores").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getElfDataStoresConnection(String payload) {
    try {
      // parse params from json payload
      GetElfDataStoresConnectionRequestBody params = gson.fromJson(payload, GetElfDataStoresConnectionRequestBody.class);
      // do some modify to params(optional)
      ElfDataStoreConnection result = api.getElfDataStoresConnection("zh-CN", params);
      assertThat(result).as("check result of getElfDataStoresConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
