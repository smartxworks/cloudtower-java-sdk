package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.NfsInodeApi;
import com.smartx.tower.model.*;

public class ITNfsInode extends IT {
  NfsInodeApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getNfsInodes(String payload) {
    try {
      // parse params from json payload
      GetNfsInodesRequestBody params = gson.fromJson(payload, GetNfsInodesRequestBody.class);
      // do some modify to params(optional)
      List<NfsInode> result = api.getNfsInodes("zh-CN", params);
      assertThat(result).as("check result of getNfsInodes").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getNfsInodesConnection(String payload) {
    try {
      // parse params from json payload
      GetNfsInodesConnectionRequestBody params = gson.fromJson(payload, GetNfsInodesConnectionRequestBody.class);
      // do some modify to params(optional)
      NfsInodeConnection result = api.getNfsInodesConnection("zh-CN", params);
      assertThat(result).as("check result of getNfsInodesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
