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
import com.smartx.tower.api.StoragePolicyConectorApi;
import com.smartx.tower.model.*;

public class ITStoragePolicyConector extends ITBase {
  StoragePolicyConectorApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "storagePolicyConectorPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new StoragePolicyConectorApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/StoragePolicyConector.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "storagePolicyConectorPayload")
  public void getStoragePoliciesConnector(String payload) {
    try {
      // parse params from json payload
      GetStoragePoliciesConnectorRequestBody params = gson.fromJson(payload, new TypeToken<GetStoragePoliciesConnectorRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<StoragePolicyConector> result = api.getStoragePoliciesConnector(params, contentLanguage);
      assertThat(result).as("check result of getStoragePoliciesConnector").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
