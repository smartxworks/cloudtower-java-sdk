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
import com.smartx.tower.api.EveroutePackageApi;
import com.smartx.tower.model.*;

public class ITEveroutePackage extends ITBase {
  EveroutePackageApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "everoutePackagePayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new EveroutePackageApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/EveroutePackage.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "everoutePackagePayload")
  public void getEveroutePackages(String payload) {
    try {
      // parse params from json payload
      GetEveroutePackagesRequestBody params = gson.fromJson(payload, new TypeToken<GetEveroutePackagesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<EveroutePackage> result = api.getEveroutePackages(params, contentLanguage);
      assertThat(result).as("check result of getEveroutePackages").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "everoutePackagePayload")
  public void getEveroutePackagesConnection(String payload) {
    try {
      // parse params from json payload
      GetEveroutePackagesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetEveroutePackagesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      EveroutePackageConnection result = api.getEveroutePackagesConnection(params, contentLanguage);
      assertThat(result).as("check result of getEveroutePackagesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
