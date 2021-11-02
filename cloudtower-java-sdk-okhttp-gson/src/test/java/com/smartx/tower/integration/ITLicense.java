package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.LicenseApi;
import com.smartx.tower.model.*;

public class ITLicense extends IT {
  LicenseApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new LicenseApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/License.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getLicenses(String payload) {
    try {
      // parse params from json payload
      GetLicensesRequestBody params = gson.fromJson(payload, GetLicensesRequestBody.class);
      // do some modify to params(optional)
      List<License> result = api.getLicenses("zh-CN", params);
      assertThat(result).as("check result of getLicenses").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getLicensesConnection(String payload) {
    try {
      // parse params from json payload
      GetLicensesConnectionRequestBody params = gson.fromJson(payload, GetLicensesConnectionRequestBody.class);
      // do some modify to params(optional)
      LicenseConnection result = api.getLicensesConnection("zh-CN", params);
      assertThat(result).as("check result of getLicensesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateDeploy(String payload) {
    try {
      // parse params from json payload
      LicenseUpdationParams params = gson.fromJson(payload, LicenseUpdationParams.class);
      // do some modify to params(optional)
      WithTaskLicense result = api.updateDeploy("zh-CN", params);
      assertThat(result).as("check result of updateDeploy").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
