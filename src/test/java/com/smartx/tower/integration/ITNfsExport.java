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
import com.smartx.tower.api.NfsExportApi;
import com.smartx.tower.model.*;

public class ITNfsExport extends ITBase {
  NfsExportApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "nfsExportPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "nfsExportPayload")
  public void createNfsExport(String payload) {
    try {
      // parse params from json payload
      List<NfsExportCreationParams> params = gson.fromJson(payload, new TypeToken<List<NfsExportCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskNfsExport> result = api.createNfsExport(params);
      assertThat(result).as("check result of createNfsExport").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "nfsExportPayload")
  public void deleteNfsExport(String payload) {
    try {
      // parse params from json payload
      NfsExportDeletionParams params = gson.fromJson(payload, new TypeToken<NfsExportDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteNfsExport> result = api.deleteNfsExport(params);
      assertThat(result).as("check result of deleteNfsExport").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "nfsExportPayload")
  public void getNfsExports(String payload) {
    try {
      // parse params from json payload
      GetNfsExportsRequestBody params = gson.fromJson(payload, new TypeToken<GetNfsExportsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<NfsExport> result = api.getNfsExports(params);
      assertThat(result).as("check result of getNfsExports").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "nfsExportPayload")
  public void getNfsExportsConnection(String payload) {
    try {
      // parse params from json payload
      GetNfsExportsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetNfsExportsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      NfsExportConnection result = api.getNfsExportsConnection(params);
      assertThat(result).as("check result of getNfsExportsConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "nfsExportPayload")
  public void updateNfsExport(String payload) {
    try {
      // parse params from json payload
      NfsExportUpdationParams params = gson.fromJson(payload, new TypeToken<NfsExportUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskNfsExport> result = api.updateNfsExport(params);
      assertThat(result).as("check result of updateNfsExport").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
