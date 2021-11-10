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
import com.smartx.tower.api.ApplicationApi;
import com.smartx.tower.model.*;

public class ITApplication extends ITBase {
  ApplicationApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "applicationPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new ApplicationApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Application.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "applicationPayload")
  public void getApplications(String payload) {
    try {
      // parse params from json payload
      GetApplicationsRequestBody params = gson.fromJson(payload, new TypeToken<GetApplicationsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<Application> result = api.getApplications(params, contentLanguage);
      assertThat(result).as("check result of getApplications").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "applicationPayload")
  public void getApplicationsConnection(String payload) {
    try {
      // parse params from json payload
      GetApplicationsConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetApplicationsConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      ApplicationConnection result = api.getApplicationsConnection(params, contentLanguage);
      assertThat(result).as("check result of getApplicationsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
