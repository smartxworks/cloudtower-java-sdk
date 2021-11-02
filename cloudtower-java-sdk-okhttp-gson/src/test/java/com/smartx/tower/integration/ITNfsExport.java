package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.NfsExportApi;
import com.smartx.tower.model.*;

public class ITNfsExport extends IT {
  NfsExportApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new NfsExportApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/NfsExport.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getNfsExports(String payload) {
    try {
      // parse params from json payload
      GetNfsExportsRequestBody params = gson.fromJson(payload, GetNfsExportsRequestBody.class);
      // do some modify to params(optional)
      List<NfsExport> result = api.getNfsExports("zh-CN", params);
      assertThat(result).as("check result of getNfsExports").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getNfsExportsConnection(String payload) {
    try {
      // parse params from json payload
      GetNfsExportsConnectionRequestBody params = gson.fromJson(payload, GetNfsExportsConnectionRequestBody.class);
      // do some modify to params(optional)
      NfsExportConnection result = api.getNfsExportsConnection("zh-CN", params);
      assertThat(result).as("check result of getNfsExportsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createNfsExport(String payload) {
    try {
      // parse params from json payload
      List<NfsExportCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskNfsExport> result = api.createNfsExport("zh-CN", params);
      assertThat(result).as("check result of createNfsExport").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateNfsExport(String payload) {
    try {
      // parse params from json payload
      NfsExportUpdationParams params = gson.fromJson(payload, NfsExportUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskNfsExport> result = api.updateNfsExport("zh-CN", params);
      assertThat(result).as("check result of updateNfsExport").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteNfsExport(String payload) {
    try {
      // parse params from json payload
      NfsExportDeletionParams params = gson.fromJson(payload, NfsExportDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteNfsExport> result = api.deleteNfsExport("zh-CN", params);
      assertThat(result).as("check result of deleteNfsExport").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
