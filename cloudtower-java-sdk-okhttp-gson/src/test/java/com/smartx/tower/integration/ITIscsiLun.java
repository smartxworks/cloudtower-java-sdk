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
import com.smartx.tower.api.IscsiLunApi;
import com.smartx.tower.api.IscsiTargetApi;
import com.smartx.tower.model.*;

public class ITIscsiLun extends ITBase {
  IscsiLunApi api = null;
  IscsiTargetApi targetApi = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "iscsiLunPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  Cluster cluster = null;

  @BeforeClass
  public void getService() throws IOException, ApiException {
    api = new IscsiLunApi(client);
    targetApi = new IscsiTargetApi(client);
    cluster = getData("defaultCluster", Cluster.class);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/IscsiLun.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {
    }.getType());
  }

  IscsiTarget target = null;

  @BeforeMethod(onlyForGroups = { "need_iscsi_target" })
  public void createIscsiTarget() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
      NoSuchMethodException, SecurityException, ApiException {
    List<IscsiTargetCreationParams> params = new ArrayList<IscsiTargetCreationParams>();
    params.add(new IscsiTargetCreationParams().clusterId(cluster.getId()).thinProvision(true).replicaNum(2).stripeNum(4)
        .stripeSize(262144.0).name("tower-sdk-test-iscsi-target" + System.currentTimeMillis()));
    WithTaskIscsiTarget createResult = targetApi.createIscsiTarget(params, contentLanguage).get(0);
    target = createResult.getData();
    waitForTaskSucceed(createResult.getTaskId());
  }

  @AfterMethod(onlyForGroups = { "need_iscsi_target" })
  public void deleteIscsiTarget() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
      NoSuchMethodException, SecurityException, ApiException {
    waitForResourceAsyncStatus(new GetIscsiTargetsRequestBody().where(new IscsiTargetWhereInput().id(target.getId())),
        targetApi, "getIscsiTargets", new TypeToken<List<IscsiTarget>>() {
        }.getClass(), GetIscsiTargetsRequestBody.class);
    waitForTaskSucceed(targetApi
        .deleteIscsiTarget(new IscsiTargetDeletionParams().where(new IscsiTargetWhereInput().id(target.getId())),
            contentLanguage)
        .get(0).getTaskId());
    target = null;
  }

  @Test(groups = { "need_iscsi_target" })
  public void createAndUpdateAndDeleteIscsiLun() throws IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException {
    try {
      // parse params from json payload
      List<IscsiLunCreationParams> createParams = new ArrayList<IscsiLunCreationParams>();
      createParams.add(new IscsiLunCreationParams().iscsiTargetId(target.getId())
          .name("tower-sdk-test-iscsi-lun" + System.currentTimeMillis()).replicaNum(2)
          .assignedSize(30.0 * 1024 * 1024 * 1024));
      // do some modify to params(optional)
      List<WithTaskIscsiLun> createResult = api.createIscsiLun(createParams, contentLanguage);
      IscsiLun lun = createResult.get(0).getData();
      waitForTaskSucceed(createResult.get(0).getTaskId());
      assertThat(createResult).as("check result of createIscsiLun").isNotNull();
      IscsiLunUpdationParams updateParams = new IscsiLunUpdationParams().where(new IscsiLunWhereInput().id(lun.getId()))
          .data(new IscsiLunUpdationParamsData().allowedInitiators(lun.getAllowedInitiators()));
      List<WithTaskIscsiLun> updateResult = api.updateIscsiLun(updateParams, contentLanguage);
      waitForTaskSucceed(updateResult.get(0).getTaskId());
      assertThat(updateResult).as("check result of updateIscsiLun").isNotNull();
      IscsiLunDeletionParams deletionParams = new IscsiLunDeletionParams()
          .where(new IscsiLunWhereInput().id(lun.getId())).data(new IscsiLunDeletionParamsData().removeSnapshot(true));
      List<WithTaskDeleteIscsiLun> deleteResult = api.deleteIscsiLun(deletionParams, contentLanguage);
      waitForTaskSucceed(deleteResult.get(0).getTaskId());
      assertThat(deleteResult).as("check result of createIscsiLun").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "iscsiLunPayload")
  public void getIscsiLuns(String payload) {
    try {
      // parse params from json payload
      GetIscsiLunsRequestBody params = gson.fromJson(payload, new TypeToken<GetIscsiLunsRequestBody>() {
      }.getType());
      // do some modify to params(optional)
      List<IscsiLun> result = api.getIscsiLuns(params, contentLanguage);
      assertThat(result).as("check result of getIscsiLuns").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "iscsiLunPayload")
  public void getIscsiLunsConnection(String payload) {
    try {
      // parse params from json payload
      GetIscsiLunsConnectionRequestBody params = gson.fromJson(payload,
          new TypeToken<GetIscsiLunsConnectionRequestBody>() {
          }.getType());
      // do some modify to params(optional)
      IscsiLunConnection result = api.getIscsiLunsConnection(params, contentLanguage);
      assertThat(result).as("check result of getIscsiLunsConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }
}
