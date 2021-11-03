package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.EverouteLicenseApi;
import com.smartx.tower.model.*;

public class ITEverouteLicense extends IT {
  EverouteLicenseApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new EverouteLicenseApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/EverouteLicense.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getEverouteLicenses(String payload) {
    try {
      // parse params from json payload
      GetEverouteLicensesRequestBody params = gson.fromJson(payload, GetEverouteLicensesRequestBody.class);
      // do some modify to params(optional)
      List<EverouteLicense> result = api.getEverouteLicenses("zh-CN", params);
      assertThat(result).as("check result of getEverouteLicenses").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getEverouteLicensesConnection(String payload) {
    try {
      // parse params from json payload
      GetEverouteLicensesConnectionRequestBody params = gson.fromJson(payload, GetEverouteLicensesConnectionRequestBody.class);
      // do some modify to params(optional)
      EverouteLicenseConnection result = api.getEverouteLicensesConnection("zh-CN", params);
      assertThat(result).as("check result of getEverouteLicensesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
