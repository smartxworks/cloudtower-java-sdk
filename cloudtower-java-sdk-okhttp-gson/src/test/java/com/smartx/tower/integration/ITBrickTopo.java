package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.BrickTopoApi;
import com.smartx.tower.model.*;

public class ITBrickTopo extends IT {
  BrickTopoApi brickTopoApi = null;
  HashMap<String, String> brickTopoPayloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = brickTopoPayloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    brickTopoApi = new BrickTopoApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/BrickTopo.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    brickTopoPayloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getBrickTopoes(String payload) {
    try {
      // parse params from json payload
      GetBrickTopoesRequestBody params = gson.fromJson(payload, GetBrickTopoesRequestBody.class);
      // do some modify to params(optional)
      List<BrickTopo> result = brickTopoApi.getBrickTopoes("zh-CN", params);
      assertThat(result).as("check result of getBrickTopoes").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getBrickTopoesConnection(String payload) {
    try {
      // parse params from json payload
      GetBrickTopoesConnectionRequestBody params = gson.fromJson(payload, GetBrickTopoesConnectionRequestBody.class);
      // do some modify to params(optional)
      BrickTopoConnection result = brickTopoApi.getBrickTopoesConnection("zh-CN", params);
      assertThat(result).as("check result of getBrickTopoesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createBrickTopo(String payload) {
    try {
      // parse params from json payload
      List<BrickTopoCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskBrickTopo> result = brickTopoApi.createBrickTopo("zh-CN", params);
      assertThat(result).as("check result of createBrickTopo").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateBrickTopo(String payload) {
    try {
      // parse params from json payload
      BrickTopoUpdationParams params = gson.fromJson(payload, BrickTopoUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskBrickTopo> result = brickTopoApi.updateBrickTopo("zh-CN", params);
      assertThat(result).as("check result of updateBrickTopo").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void moveBrickTopo(String payload) {
    try {
      // parse params from json payload
      BrickTopoMoveParams params = gson.fromJson(payload, BrickTopoMoveParams.class);
      // do some modify to params(optional)
      List<WithTaskBrickTopo> result = brickTopoApi.moveBrickTopo("zh-CN", params);
      assertThat(result).as("check result of moveBrickTopo").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteBrickTopo(String payload) {
    try {
      // parse params from json payload
      BrickTopoDeletionParams params = gson.fromJson(payload, BrickTopoDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteBrickTopo> result = brickTopoApi.deleteBrickTopo("zh-CN", params);
      assertThat(result).as("check result of deleteBrickTopo").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
