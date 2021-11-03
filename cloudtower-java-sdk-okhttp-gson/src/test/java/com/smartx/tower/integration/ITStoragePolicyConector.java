package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.StoragePolicyConectorApi;
import com.smartx.tower.model.*;

public class ITStoragePolicyConector extends IT {
  StoragePolicyConectorApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getStoragePoliciesConnector(String payload) {
    try {
      // parse params from json payload
      GetStoragePoliciesConnectorRequestBody params = gson.fromJson(payload, GetStoragePoliciesConnectorRequestBody.class);
      // do some modify to params(optional)
      List<StoragePolicyConector> result = api.getStoragePoliciesConnector("zh-CN", params);
      assertThat(result).as("check result of getStoragePoliciesConnector").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
