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
import com.smartx.tower.api.LicenseApi;
import com.smartx.tower.model.*;

public class ITLicense extends ITBase {
  LicenseApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "licensePayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "licensePayload")
  public void getLicenses(String payload) {
    try {
      // parse params from json payload
      GetLicensesRequestBody params = gson.fromJson(payload, new TypeToken<GetLicensesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<License> result = api.getLicenses(params);
      assertThat(result).as("check result of getLicenses").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "licensePayload")
  public void getLicensesConnection(String payload) {
    try {
      // parse params from json payload
      GetLicensesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetLicensesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      LicenseConnection result = api.getLicensesConnection(params);
      assertThat(result).as("check result of getLicensesConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "licensePayload")
  public void updateDeploy(String payload) {
    try {
      // parse params from json payload
      LicenseUpdationParams params = gson.fromJson(payload, new TypeToken<LicenseUpdationParams>() {}.getType());
      // do some modify to params(optional)
      WithTaskLicense result = api.updateDeploy(params);
      assertThat(result).as("check result of updateDeploy").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
