package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.EveroutePackageApi;
import com.smartx.tower.model.*;

public class ITEveroutePackage extends IT {
  EveroutePackageApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getEveroutePackages(String payload) {
    try {
      // parse params from json payload
      GetEveroutePackagesRequestBody params = gson.fromJson(payload, GetEveroutePackagesRequestBody.class);
      // do some modify to params(optional)
      List<EveroutePackage> result = api.getEveroutePackages("zh-CN", params);
      assertThat(result).as("check result of getEveroutePackages").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getEveroutePackagesConnection(String payload) {
    try {
      // parse params from json payload
      GetEveroutePackagesConnectionRequestBody params = gson.fromJson(payload, GetEveroutePackagesConnectionRequestBody.class);
      // do some modify to params(optional)
      EveroutePackageConnection result = api.getEveroutePackagesConnection("zh-CN", params);
      assertThat(result).as("check result of getEveroutePackagesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
