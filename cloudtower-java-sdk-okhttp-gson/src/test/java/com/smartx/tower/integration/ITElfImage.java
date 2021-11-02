package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.ElfImageApi;
import com.smartx.tower.model.*;

public class ITElfImage extends IT {
  ElfImageApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new ElfImageApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/ElfImage.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getElfImages(String payload) {
    try {
      // parse params from json payload
      GetElfImagesRequestBody params = gson.fromJson(payload, GetElfImagesRequestBody.class);
      // do some modify to params(optional)
      List<ElfImage> result = api.getElfImages("zh-CN", params);
      assertThat(result).as("check result of getElfImages").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getElfImagesConnection(String payload) {
    try {
      // parse params from json payload
      GetElfImagesConnectionRequestBody params = gson.fromJson(payload, GetElfImagesConnectionRequestBody.class);
      // do some modify to params(optional)
      ElfImageConnection result = api.getElfImagesConnection("zh-CN", params);
      assertThat(result).as("check result of getElfImagesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  // @Test(dataProvider = "payload")
  // public void createElfImage(String payload) {
  //   try {
  //     // parse params from json payload
  //     File params = gson.fromJson(payload, File.class);
  //     // do some modify to params(optional)
  //     List<UploadTask> result = api.createElfImage("zh-CN", params);
  //     assertThat(result).as("check result of createElfImage").isNotNull();
  //   } catch (ApiException e) {
  //     assertThat(true).as(e.getMessage()).isFalse();
  //   }
  // }

  @Test(dataProvider = "payload")
  public void updateElfImage(String payload) {
    try {
      // parse params from json payload
      ElfImageUpdationParams params = gson.fromJson(payload, ElfImageUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskElfImage> result = api.updateElfImage("zh-CN", params);
      assertThat(result).as("check result of updateElfImage").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteElfImage(String payload) {
    try {
      // parse params from json payload
      ElfImageDeletionParams params = gson.fromJson(payload, ElfImageDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteElfImage> result = api.deleteElfImage("zh-CN", params);
      assertThat(result).as("check result of deleteElfImage").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
