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
import com.smartx.tower.api.ContentLibraryImageApi;
import com.smartx.tower.model.*;

public class ITContentLibraryImage extends ITBase {
  ContentLibraryImageApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "contentLibraryImagePayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new ContentLibraryImageApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/ContentLibraryImage.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "contentLibraryImagePayload")
  public void getContentLibraryImages(String payload) {
    try {
      // parse params from json payload
      GetContentLibraryImagesRequestBody params = gson.fromJson(payload, new TypeToken<GetContentLibraryImagesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<ContentLibraryImage> result = api.getContentLibraryImages(params, contentLanguage);
      assertThat(result).as("check result of getContentLibraryImages").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "contentLibraryImagePayload")
  public void getContentLibraryImagesConnection(String payload) {
    try {
      // parse params from json payload
      GetContentLibraryImagesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetContentLibraryImagesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      ContentLibraryImageConnection result = api.getContentLibraryImagesConnection(params, contentLanguage);
      assertThat(result).as("check result of getContentLibraryImagesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
