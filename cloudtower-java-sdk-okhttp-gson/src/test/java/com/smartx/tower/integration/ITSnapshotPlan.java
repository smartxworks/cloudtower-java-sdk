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
import com.smartx.tower.api.SnapshotPlanApi;
import com.smartx.tower.model.*;

public class ITSnapshotPlan extends ITBase {
  SnapshotPlanApi api = null;
  HashMap<String, Object> payloads = new HashMap<>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new SnapshotPlanApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/SnapshotPlan.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "payload")
  public void createSnapshotPlan(String payload) {
    try {
      // parse params from json payload
      List<SnapshotPlanCreationParams> params = gson.fromJson(payload, new TypeToken<List<SnapshotPlanCreationParams>>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskSnapshotPlan> result = api.createSnapshotPlan(params, contentLanguage);
      assertThat(result).as("check result of createSnapshotPlan").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteSnapshotPlan(String payload) {
    try {
      // parse params from json payload
      SnapshotPlanDeletionParams params = gson.fromJson(payload, new TypeToken<SnapshotPlanDeletionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteSnapshotPlan> result = api.deleteSnapshotPlan(params, contentLanguage);
      assertThat(result).as("check result of deleteSnapshotPlan").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void executeSnapshotPlan(String payload) {
    try {
      // parse params from json payload
      SnapshotPlanExecutionParams params = gson.fromJson(payload, new TypeToken<SnapshotPlanExecutionParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskSnapshotPlan> result = api.executeSnapshotPlan(params, contentLanguage);
      assertThat(result).as("check result of executeSnapshotPlan").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getSnapshotPlans(String payload) {
    try {
      // parse params from json payload
      GetSnapshotPlansRequestBody params = gson.fromJson(payload, new TypeToken<GetSnapshotPlansRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<SnapshotPlan> result = api.getSnapshotPlans(params, contentLanguage);
      assertThat(result).as("check result of getSnapshotPlans").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getSnapshotPlansConnection(String payload) {
    try {
      // parse params from json payload
      GetSnapshotPlansConnectionRequestBody params = gson.fromJson(payload, new TypeToken<GetSnapshotPlansConnectionRequestBody>() {}.getType());
      // do some modify to params(optional)
      SnapshotPlanConnection result = api.getSnapshotPlansConnection(params, contentLanguage);
      assertThat(result).as("check result of getSnapshotPlansConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void resumeSnapshotPlan(String payload) {
    try {
      // parse params from json payload
      SnapshotPlanResumeParams params = gson.fromJson(payload, new TypeToken<SnapshotPlanResumeParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskSnapshotPlan> result = api.resumeSnapshotPlan(params, contentLanguage);
      assertThat(result).as("check result of resumeSnapshotPlan").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void suspendSnapshotPlan(String payload) {
    try {
      // parse params from json payload
      SnapshotPlanSuspendedParams params = gson.fromJson(payload, new TypeToken<SnapshotPlanSuspendedParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskSnapshotPlan> result = api.suspendSnapshotPlan(params, contentLanguage);
      assertThat(result).as("check result of suspendSnapshotPlan").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateSnapshotPlan(String payload) {
    try {
      // parse params from json payload
      SnapshotPlanUpdationParams params = gson.fromJson(payload, new TypeToken<SnapshotPlanUpdationParams>() {}.getType());
      // do some modify to params(optional)
      List<WithTaskSnapshotPlan> result = api.updateSnapshotPlan(params, contentLanguage);
      assertThat(result).as("check result of updateSnapshotPlan").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
