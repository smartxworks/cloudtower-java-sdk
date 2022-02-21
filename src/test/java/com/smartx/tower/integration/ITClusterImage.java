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
import com.smartx.tower.api.ClusterImageApi;
import com.smartx.tower.model.*;

public class ITClusterImage extends ITBase {
  ClusterImageApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "clusterImagePayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "clusterImagePayload")
  public void getClusterImages(String payload) {
    try {
      // parse params from json payload
      GetClusterImagesRequestBody params = gson.fromJson(payload, new TypeToken<GetClusterImagesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<ClusterImage> result = api.getClusterImages(params);
      assertThat(result).as("check result of getClusterImages").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "clusterImagePayload")
  public void getClusterImagesConnection(String payload) {
    try {
      // parse params from json payload
      GetClusterImagesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetClusterImagesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      ClusterImageConnection result = api.getClusterImagesConnection(params);
      assertThat(result).as("check result of getClusterImagesConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
