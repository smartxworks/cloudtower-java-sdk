package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.IscsiTargetApi;
import com.smartx.tower.model.*;

public class ITIscsiTarget extends ITBase {
  IscsiTargetApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  Cluster cluster = null;

  @DataProvider(name = "iscsiTargetPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException, ApiException {
    api = new IscsiTargetApi(client);
    cluster = getData("defaultCluster", Cluster.class);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/IscsiTarget.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {
    }.getType());
  }

  @Test()
  public void createAndUpdateAndDeleteIscsiTarget() throws IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException {
    try {
      // parse params from json payload
      List<IscsiTargetCreationParams> createParams = new ArrayList<IscsiTargetCreationParams>();
      createParams.add(new IscsiTargetCreationParams().clusterId(cluster.getId()).thinProvision(true).replicaNum(2)
          .stripeNum(4).stripeSize(262144.0).name("tower-sdk-test-iscsi-target" + System.currentTimeMillis()));
      List<WithTaskIscsiTarget> createResult = api.createIscsiTarget(createParams);
      IscsiTarget target = createResult.get(0).getData();
      waitForTaskSucceed(createResult.get(0).getTaskId());
      assertThat(createResult).as("check result of createIscsiTarget").isNotNull();
      IscsiTargetUpdationParams updateParams = new IscsiTargetUpdationParams()
          .where(new IscsiTargetWhereInput().id(target.getId()))
          .data(new IscsiTargetCommonParams().iops(target.getIops()));
      List<WithTaskIscsiTarget> updateResult = api.updateIscsiTarget(updateParams);
      waitForTaskSucceed(updateResult.get(0).getTaskId());
      assertThat(updateResult).as("check result of updateIscsiTarget").isNotNull();
      List<WithTaskDeleteIscsiTarget> deleteResult = api.deleteIscsiTarget(
          new IscsiTargetDeletionParams().where(new IscsiTargetWhereInput().id(target.getId())));
      waitForTaskSucceed(deleteResult.get(0).getTaskId());
      assertThat(deleteResult).as("check result of deleteIscsiTarget").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "iscsiTargetPayload")
  public void getIscsiTargets(String payload) {
    try {
      // parse params from json payload
      GetIscsiTargetsRequestBody params = gson.fromJson(payload, new TypeToken<GetIscsiTargetsRequestBody>() {
      }.getType());
      // do some modify to params(optional)
      List<IscsiTarget> result = api.getIscsiTargets(params);
      assertThat(result).as("check result of getIscsiTargets").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "iscsiTargetPayload")
  public void getIscsiTargetsConnection(String payload) {
    try {
      // parse params from json payload
      GetIscsiTargetsConnectionRequestBody params = gson.fromJson(payload,
          new TypeToken<GetIscsiTargetsConnectionRequestBody>() {
          }.getType());
      // do some modify to params(optional)
      IscsiTargetConnection result = api.getIscsiTargetsConnection(params);
      assertThat(result).as("check result of getIscsiTargetsConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }
}
