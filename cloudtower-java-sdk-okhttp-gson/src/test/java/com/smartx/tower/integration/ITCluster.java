package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.ClusterApi;
import com.smartx.tower.model.*;

public class ITCluster extends IT {
  ClusterApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new ClusterApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/Cluster.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(ITUtils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getClusters(String payload) {
    try {
      // parse params from json payload
      GetClustersRequestBody params = gson.fromJson(payload, GetClustersRequestBody.class);
      // do some modify to params(optional)
      List<Cluster> result = api.getClusters("zh-CN", params);
      assertThat(result).as("check result of getClusters").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getClustersConnection(String payload) {
    try {
      // parse params from json payload
      GetClustersConnectionRequestBody params = gson.fromJson(payload, GetClustersConnectionRequestBody.class);
      // do some modify to params(optional)
      ClusterConnection result = api.getClustersConnection("zh-CN", params);
      assertThat(result).as("check result of getClustersConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateCluster(String payload) {
    try {
      // parse params from json payload
      ClusterUpdationParams params = gson.fromJson(payload, ClusterUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskCluster> result = api.updateCluster("zh-CN", params);
      assertThat(result).as("check result of updateCluster").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateClusterLicense(String payload) {
    try {
      // parse params from json payload
      ClusterLicenseUpdationParams params = gson.fromJson(payload, ClusterLicenseUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskCluster> result = api.updateClusterLicense("zh-CN", params);
      assertThat(result).as("check result of updateClusterLicense").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void connectCluster(String payload) {
    try {
      // parse params from json payload
      List<ClusterCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskCluster> result = api.connectCluster("zh-CN", params);
      assertThat(result).as("check result of connectCluster").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteCluster(String payload) {
    try {
      // parse params from json payload
      ClusterDeletionParams params = gson.fromJson(payload, ClusterDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteCluster> result = api.deleteCluster("zh-CN", params);
      assertThat(result).as("check result of deleteCluster").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
