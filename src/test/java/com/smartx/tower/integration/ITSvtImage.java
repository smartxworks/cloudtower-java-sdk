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
import com.smartx.tower.api.SvtImageApi;
import com.smartx.tower.model.*;

public class ITSvtImage extends ITBase {
  SvtImageApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "svtImagePayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new SvtImageApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/SvtImage.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "svtImagePayload")
  public void getSvtImages(String payload) {
    try {
      // parse params from json payload
      GetSvtImagesRequestBody params = gson.fromJson(payload, new TypeToken<GetSvtImagesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<SvtImage> result = api.getSvtImages(params, contentLanguage);
      assertThat(result).as("check result of getSvtImages").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "svtImagePayload")
  public void getSvtImagesConnection(String payload) {
    try {
      // parse params from json payload
      GetSvtImagesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetSvtImagesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      SvtImageConnection result = api.getSvtImagesConnection(params, contentLanguage);
      assertThat(result).as("check result of getSvtImagesConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
