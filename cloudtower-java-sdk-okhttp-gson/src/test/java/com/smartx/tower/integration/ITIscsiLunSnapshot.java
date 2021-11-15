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
import com.smartx.tower.api.IscsiLunSnapshotApi;
import com.smartx.tower.api.IscsiTargetApi;
import com.smartx.tower.model.*;

public class ITIscsiLunSnapshot extends ITBase {
  IscsiLunSnapshotApi snapshotApi = null;
  IscsiLunApi lunApi = null;
  IscsiTargetApi targetApi = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  Cluster cluster = null;

  @DataProvider(name = "iscsiLunSnapshotPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException, ApiException {
    snapshotApi = new IscsiLunSnapshotApi(client);
    lunApi = new IscsiLunApi(client);
    targetApi = new IscsiTargetApi(client);
    cluster = getData("defaultCluster", Cluster.class);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/IscsiLunSnapshot.json");
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
    target = targetApi.createIscsiTarget(params, contentLanguage).get(0).getData();
    waitForResourceCreation(new GetIscsiTargetsRequestBody().where(new IscsiTargetWhereInput().id(target.getId())),
        targetApi, "getIscsiTargets", new TypeToken<List<IscsiTarget>>() {
        }.getClass(), GetIscsiTargetsRequestBody.class);
  }

  @AfterMethod(onlyForGroups = { "need_iscsi_target" })
  public void deleteIscsiTarget() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
      NoSuchMethodException, SecurityException, ApiException {
    waitForResourceAsyncStatus(new GetIscsiTargetsRequestBody().where(new IscsiTargetWhereInput().id(target.getId())),
        targetApi, "getIscsiTargets", new TypeToken<List<IscsiTarget>>() {
        }.getClass(), GetIscsiTargetsRequestBody.class);
    targetApi.deleteIscsiTarget(new IscsiTargetDeletionParams().where(new IscsiTargetWhereInput().id(target.getId())),
        contentLanguage);
    waitForResourceDeletion(new GetIscsiTargetsRequestBody().where(new IscsiTargetWhereInput().id(target.getId())),
        targetApi, "getIscsiTargets", new TypeToken<List<IscsiTarget>>() {
        }.getClass(), GetIscsiTargetsRequestBody.class);
    target = null;
  }

  IscsiLun lun = null;

  @BeforeMethod(onlyForGroups = { "need_iscsi_lun" }, dependsOnMethods = { "createIscsiTarget" })
  public void createIscsiLun() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
      NoSuchMethodException, SecurityException, ApiException {
    List<IscsiLunCreationParams> createParams = new ArrayList<IscsiLunCreationParams>();
    createParams.add(new IscsiLunCreationParams().iscsiTargetId(target.getId())
        .name("tower-sdk-test-iscsi-lun" + System.currentTimeMillis()).replicaNum(2)
        .assignedSize(30.0 * 1024 * 1024 * 1024));
    // do some modify to params(optional)
    List<WithTaskIscsiLun> createResult = lunApi.createIscsiLun(createParams, contentLanguage);
    lun = createResult.get(0).getData();
    waitForResourceCreation(new GetIscsiLunsRequestBody().where(new IscsiLunWhereInput().id(lun.getId())), lunApi,
        "getIscsiLuns", new TypeToken<List<IscsiLun>>() {
        }.getClass(), GetIscsiLunsRequestBody.class);
  }

  @AfterMethod(onlyForGroups = { "need_iscsi_lun" })
  public void deleteIscsiLun() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
      NoSuchMethodException, SecurityException, ApiException {
    waitForResourceAsyncStatus(new GetIscsiLunsRequestBody().where(new IscsiLunWhereInput().id(lun.getId())), lunApi,
        "getIscsiLuns", new TypeToken<List<IscsiLun>>() {
        }.getClass(), GetIscsiLunsRequestBody.class);
    lunApi.deleteIscsiLun(new IscsiLunDeletionParams().where(new IscsiLunWhereInput().id(lun.getId())),
        contentLanguage);
    waitForResourceDeletion(new GetIscsiLunsRequestBody().where(new IscsiLunWhereInput().id(lun.getId())), lunApi,
        "getIscsiLuns", new TypeToken<List<IscsiLun>>() {
        }.getClass(), GetIscsiLunsRequestBody.class);
    lun = null;
  }

  @Test(groups = { "need_iscsi_lun", "need_iscsi_target" })
  public void createAndDeleteIscsiLunSnapshot() throws IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException {
    try {
      // parse params from json payload
      List<IscsiLunSnapshotCreationParams> creationParams = new ArrayList<>();
      creationParams.add(new IscsiLunSnapshotCreationParams().iscsiLunId(lun.getId()).iscsiTargetId(target.getId())
          .name("tower-sdk-test-iscsi-lun-snapshot" + System.currentTimeMillis()));
      // do some modify to params(optional)
      List<WithTaskIscsiLunSnapshot> createResult = snapshotApi.createIscsiLunSnapshot(creationParams, contentLanguage);
      IscsiLunSnapshot snapshot = createResult.get(0).getData();
      assertThat(createResult).as("check result of createIscsiLunSnapshot").isNotNull();
      waitForResourceCreation(
          new GetIscsiLunSnapshotsRequestBody().where(new IscsiLunSnapshotWhereInput().id(snapshot.getId())),
          snapshotApi, "getIscsiLunSnapshots", new TypeToken<List<IscsiLunSnapshot>>() {
          }.getClass(), GetIscsiLunSnapshotsRequestBody.class);

      IscsiLunSnapshotDeletionParams deletionParams = new IscsiLunSnapshotDeletionParams()
          .where(new IscsiLunSnapshotWhereInput().id(snapshot.getId()));
      // do some modify to params(optional)
      List<WithTaskDeleteIscsiLunSnapshot> deletionResult = snapshotApi.deleteIscsiLunSnapshot(deletionParams,
          contentLanguage);
      assertThat(deletionResult).as("check result of deleteIscsiLunSnapshot").isNotNull();
      waitForResourceDeletion(
          new GetIscsiLunSnapshotsRequestBody().where(new IscsiLunSnapshotWhereInput().id(snapshot.getId())),
          snapshotApi, "getIscsiLunSnapshots", new TypeToken<List<IscsiLunSnapshot>>() {
          }.getClass(), GetIscsiLunSnapshotsRequestBody.class);
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  IscsiLunSnapshot snapshot = null;

  @BeforeMethod(onlyForGroups = { "need_iscsi_lun_snapshot" }, dependsOnMethods = { "createIscsiLun" })
  public void createIscsiLunSnapshot() throws IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException, ApiException {
    List<IscsiLunSnapshotCreationParams> creationParams = new ArrayList<>();
    creationParams.add(new IscsiLunSnapshotCreationParams().iscsiLunId(lun.getId()).iscsiTargetId(target.getId())
        .name("tower-sdk-test-iscsi-lun-snapshot" + System.currentTimeMillis()));
    // do some modify to params(optional)
    List<WithTaskIscsiLunSnapshot> createResult = snapshotApi.createIscsiLunSnapshot(creationParams, contentLanguage);
    // do some modify to params(optional)
    snapshot = createResult.get(0).getData();
    waitForResourceCreation(
        new GetIscsiLunSnapshotsRequestBody().where(new IscsiLunSnapshotWhereInput().id(snapshot.getId())), snapshotApi,
        "getIscsiLunSnapshots", new TypeToken<List<IscsiLunSnapshot>>() {
        }.getClass(), GetIscsiLunSnapshotsRequestBody.class);
  }

  @AfterMethod(onlyForGroups = { "need_iscsi_lun_snapshot" })
  public void deleteIscsiLunSnapshot() throws IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException, ApiException {
    IscsiLunSnapshotDeletionParams deletionParams = new IscsiLunSnapshotDeletionParams()
        .where(new IscsiLunSnapshotWhereInput().id(snapshot.getId()));
    // do some modify to params(optional)
    List<WithTaskDeleteIscsiLunSnapshot> deletionResult = snapshotApi.deleteIscsiLunSnapshot(deletionParams,
        contentLanguage);
    assertThat(deletionResult).as("check result of deleteIscsiLunSnapshot").isNotNull();
    waitForResourceDeletion(
        new GetIscsiLunSnapshotsRequestBody().where(new IscsiLunSnapshotWhereInput().id(snapshot.getId())), snapshotApi,
        "getIscsiLunSnapshots", new TypeToken<List<IscsiLunSnapshot>>() {
        }.getClass(), GetIscsiLunSnapshotsRequestBody.class);
    snapshot = null;
  }

  @Test(groups = { "need_iscsi_lun", "need_iscsi_target", "need_iscsi_lun_snapshot" })
  public void cloneIscsiLunFromSnapshot() throws IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException {
    try {
      // parse params from json payload
      List<IscsiLunCloneParams> params = new ArrayList<>();
      params.add(new IscsiLunCloneParams().iscsiTargetId(target.getId()).snapshotId(snapshot.getId())
          .name("tower-sdk-test-iscsi-cloned-lun" + System.currentTimeMillis()));
      // do some modify to params(optional)
      List<WithTaskIscsiLun> result = lunApi.cloneIscsiLunFromSnapshot(params, contentLanguage);
      IscsiLun clonedLun = result.get(0).getData();
      waitForResourceCreation(new GetIscsiLunsRequestBody().where(new IscsiLunWhereInput().id(clonedLun.getId())),
          lunApi, "getIscsiLuns", new TypeToken<List<IscsiLun>>() {
          }.getClass(), GetIscsiLunsRequestBody.class);
      assertThat(result).as("check result of cloneIscsiLunFromSnapshot").isNotNull();
      lunApi.deleteIscsiLun(new IscsiLunDeletionParams().where(new IscsiLunWhereInput().id(clonedLun.getId()))
          .data(new IscsiLunDeletionParamsData().removeSnapshot(true)), contentLanguage);
      waitForResourceDeletion(new GetIscsiLunsRequestBody().where(new IscsiLunWhereInput().id(clonedLun.getId())),
          lunApi, "getIscsiLuns", new TypeToken<List<IscsiLun>>() {
          }.getClass(), GetIscsiLunsRequestBody.class);
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(groups = { "need_iscsi_lun", "need_iscsi_target", "need_iscsi_lun_snapshot" })
  public void rollbackIscsiLunFromSnapshot() throws IllegalAccessException, IllegalArgumentException,
      InvocationTargetException, NoSuchMethodException, SecurityException {
    try {
      // parse params from json payload
      List<IscsiLunRollbackParams> params = new ArrayList<>();
      params.add(new IscsiLunRollbackParams().lunId(lun.getId()).snapshotId(snapshot.getId()));
      // do some modify to params(optional)
      List<WithTaskIscsiLun> result = lunApi.rollbackIscsiLunFromSnapshot(params, contentLanguage);
      waitForResourceAsyncStatus(new GetIscsiLunsRequestBody().where(new IscsiLunWhereInput().id(lun.getId())), lunApi,
          "getIscsiLuns", new TypeToken<List<IscsiLun>>() {
          }.getClass(), GetIscsiLunsRequestBody.class);
      assertThat(result).as("check result of rollbackIscsiLunFromSnapshot").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "iscsiLunSnapshotPayload")
  public void getIscsiLunSnapshots(String payload) {
    try {
      // parse params from json payload
      GetIscsiLunSnapshotsRequestBody params = gson.fromJson(payload, new TypeToken<GetIscsiLunSnapshotsRequestBody>() {
      }.getType());
      // do some modify to params(optional)
      List<IscsiLunSnapshot> result = snapshotApi.getIscsiLunSnapshots(params, contentLanguage);
      assertThat(result).as("check result of getIscsiLunSnapshots").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "iscsiLunSnapshotPayload")
  public void getIscsiLunSnapshotsConnection(String payload) {
    try {
      // parse params from json payload
      GetIscsiLunSnapshotsConnectionRequestBody params = gson.fromJson(payload,
          new TypeToken<GetIscsiLunSnapshotsConnectionRequestBody>() {
          }.getType());
      // do some modify to params(optional)
      IscsiLunSnapshotConnection result = snapshotApi.getIscsiLunSnapshotsConnection(params, contentLanguage);
      assertThat(result).as("check result of getIscsiLunSnapshotsConnection").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
