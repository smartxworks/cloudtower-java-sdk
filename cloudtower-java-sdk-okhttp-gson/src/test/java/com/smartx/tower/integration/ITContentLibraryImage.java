package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.ContentLibraryImageApi;
import com.smartx.tower.model.*;

public class ITContentLibraryImage extends IT {
  ContentLibraryImageApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getContentLibraryImages(String payload) {
    try {
      // parse params from json payload
      GetContentLibraryImagesRequestBody params = gson.fromJson(payload, GetContentLibraryImagesRequestBody.class);
      // do some modify to params(optional)
      List<ContentLibraryImage> result = api.getContentLibraryImages("zh-CN", params);
      assertThat(result).as("check result of getContentLibraryImages").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getContentLibraryImagesConnection(String payload) {
    try {
      // parse params from json payload
      GetContentLibraryImagesConnectionRequestBody params = gson.fromJson(payload, GetContentLibraryImagesConnectionRequestBody.class);
      // do some modify to params(optional)
      ContentLibraryImageConnection result = api.getContentLibraryImagesConnection("zh-CN", params);
      assertThat(result).as("check result of getContentLibraryImagesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
