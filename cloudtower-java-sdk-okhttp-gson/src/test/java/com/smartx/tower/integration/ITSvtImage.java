package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.SvtImageApi;
import com.smartx.tower.model.*;

public class ITSvtImage extends IT {
  SvtImageApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getSvtImages(String payload) {
    try {
      // parse params from json payload
      GetSvtImagesRequestBody params = gson.fromJson(payload, GetSvtImagesRequestBody.class);
      // do some modify to params(optional)
      List<SvtImage> result = api.getSvtImages("zh-CN", params);
      assertThat(result).as("check result of getSvtImages").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getSvtImagesConnection(String payload) {
    try {
      // parse params from json payload
      GetSvtImagesConnectionRequestBody params = gson.fromJson(payload, GetSvtImagesConnectionRequestBody.class);
      // do some modify to params(optional)
      SvtImageConnection result = api.getSvtImagesConnection("zh-CN", params);
      assertThat(result).as("check result of getSvtImagesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
