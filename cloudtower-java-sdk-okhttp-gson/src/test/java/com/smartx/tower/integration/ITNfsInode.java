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
import com.smartx.tower.api.NfsInodeApi;
import com.smartx.tower.model.*;

public class ITNfsInode extends ITBase {
  NfsInodeApi api = null;
  HashMap<String, Object> payloads = new HashMap<>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new NfsInodeApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/NfsInode.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "payload")
  public void getNfsInodes(String payload) {
    try {
      // parse params from json payload
      GetNfsInodesRequestBody params = gson.fromJson(payload, new TypeToken<GetNfsInodesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<NfsInode> result = api.getNfsInodes(params, contentLanguage);
      assertThat(result).as("check result of getNfsInodes").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getNfsInodesConnection(String payload) {
    try {
      // parse params from json payload
      GetNfsInodesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetNfsInodesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      NfsInodeConnection result = api.getNfsInodesConnection(params, contentLanguage);
      assertThat(result).as("check result of getNfsInodesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
