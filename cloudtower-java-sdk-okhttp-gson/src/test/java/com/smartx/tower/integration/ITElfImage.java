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
import com.smartx.tower.api.ElfImageApi;
import com.smartx.tower.model.*;

public class ITElfImage extends ITBase {
  ElfImageApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "elfImagePayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  // @Test(dataProvider = "elfImagePayload")
  // public void createElfImage(String payload) {
  //   try {
  //     // parse params from json payload
  //     File params = gson.fromJson(payload, new TypeToken<File>() {}.getType());
  //     // do some modify to params(optional)
  //     List<UploadTask> result = api.createElfImage(params, contentLanguage);
  //     assertThat(result).as("check result of createElfImage").isNotNull();
  //   } catch (ApiException e) {
  //     assertThat(true).as(e.getResponseBody()).isFalse();
  //   }
  // }

  @Test(dataProvider = "elfImagePayload")
  public void deleteElfImage(String payload) {
    try {
      // parse params from json payload
      ElfImageDeletionParams params = gson.fromJson(payload, new TypeToken<ElfImageDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteElfImage> result = api.deleteElfImage(params, contentLanguage);
      assertThat(result).as("check result of deleteElfImage").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "elfImagePayload")
  public void getElfImages(String payload) {
    try {
      // parse params from json payload
      GetElfImagesRequestBody params = gson.fromJson(payload, new TypeToken<GetElfImagesRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<ElfImage> result = api.getElfImages(params, contentLanguage);
      assertThat(result).as("check result of getElfImages").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "elfImagePayload")
  public void getElfImagesConnection(String payload) {
    try {
      // parse params from json payload
      GetElfImagesConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetElfImagesConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      ElfImageConnection result = api.getElfImagesConnection(params, contentLanguage);
      assertThat(result).as("check result of getElfImagesConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "elfImagePayload")
  public void updateElfImage(String payload) {
    try {
      // parse params from json payload
      ElfImageUpdationParams params = gson.fromJson(payload, new TypeToken<ElfImageUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskElfImage> result = api.updateElfImage(params, contentLanguage);
      assertThat(result).as("check result of updateElfImage").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
