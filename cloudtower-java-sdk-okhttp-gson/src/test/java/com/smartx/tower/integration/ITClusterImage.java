package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.ClusterImageApi;
import com.smartx.tower.model.*;

public class ITClusterImage extends IT {
  ClusterImageApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new ClusterImageApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/ClusterImage.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getClusterImages(String payload) {
    try {
      // parse params from json payload
      GetClusterImagesRequestBody params = gson.fromJson(payload, GetClusterImagesRequestBody.class);
      // do some modify to params(optional)
      List<ClusterImage> result = api.getClusterImages("zh-CN", params);
      assertThat(result).as("check result of getClusterImages").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getClusterImagesConnection(String payload) {
    try {
      // parse params from json payload
      GetClusterImagesConnectionRequestBody params = gson.fromJson(payload, GetClusterImagesConnectionRequestBody.class);
      // do some modify to params(optional)
      ClusterImageConnection result = api.getClusterImagesConnection("zh-CN", params);
      assertThat(result).as("check result of getClusterImagesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
