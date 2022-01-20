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
import com.smartx.tower.api.ElfDataStoreApi;
import com.smartx.tower.model.*;

public class ITElfDataStore extends ITBase {
  ElfDataStoreApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "elfDataStorePayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "elfDataStorePayload")
  public void getElfDataStores(String payload) {
    try {
      // parse params from json payload
      GetElfDataStoresRequestBody params = gson.fromJson(payload, new TypeToken<GetElfDataStoresRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<ElfDataStore> result = api.getElfDataStores(params, contentLanguage);
      assertThat(result).as("check result of getElfDataStores").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "elfDataStorePayload")
  public void getElfDataStoresConnection(String payload) {
    try {
      // parse params from json payload
      GetElfDataStoresConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetElfDataStoresConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      ElfDataStoreConnection result = api.getElfDataStoresConnection(params, contentLanguage);
      assertThat(result).as("check result of getElfDataStoresConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
