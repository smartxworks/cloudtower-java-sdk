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
import com.smartx.tower.api.BrickTopoApi;
import com.smartx.tower.api.ZoneTopoApi;
import com.smartx.tower.api.NodeTopoApi;
import com.smartx.tower.api.ClusterTopoApi;
import com.smartx.tower.api.RackTopoApi;
import com.smartx.tower.model.*;

public class ITHardwareTopo extends ITBase {
  BrickTopoApi brickTopoApi = null;
  ZoneTopoApi zoneTopoApi = null;
  ClusterTopoApi clusterApi = null;
  NodeTopoApi nodeTopoApi = null;
  RackTopoApi rackTopoApi = null;

  HashMap<String, String> brickTopoPayloads = new HashMap<String, String>();
  HashMap<String, String> zoneTopoPayloads = new HashMap<String, String>();
  HashMap<String, String> clusterPayloads = new HashMap<String, String>();
  HashMap<String, String> nodeTopoPayloads = new HashMap<String, String>();
  HashMap<String, String> rackTopoPayloads = new HashMap<String, String>();

  @DataProvider(name = "brick-payload")
  Object[][] brickData(Method m) {
    String payload = brickTopoPayloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @DataProvider(name = "zone-payload")
  Object[][] zoneData(Method m) {
    String payload = zoneTopoPayloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @DataProvider(name = "node-payload")
  Object[][] nodeData(Method m) {
    String payload = nodeTopoPayloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @DataProvider(name = "cluster-payload")
  Object[][] clusterData(Method m) {
    String payload = clusterPayloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @DataProvider(name = "rack-payload")
  Object[][] data(Method m) {
    String payload = rackTopoPayloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
  }

  @BeforeClass
  public void getService() throws IOException {
    brickTopoApi = new BrickTopoApi(client);
    InputStream stream = getClass().getResourceAsStream("/BrickTopo.json");
    if (stream != null) {
      brickTopoPayloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, String>>() {
      }.getType());
    }

    zoneTopoApi = new ZoneTopoApi(client);
    stream = getClass().getResourceAsStream("/ZoneTopo.json");
    if (stream != null) {
      zoneTopoPayloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, String>>() {
      }.getType());
    }

    nodeTopoApi = new NodeTopoApi(client);
    stream = getClass().getResourceAsStream("/NodeTopo.json");
    if (stream != null) {
      nodeTopoPayloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, String>>() {
      }.getType());
    }

    clusterApi = new ClusterTopoApi(client);
    stream = getClass().getResourceAsStream("/ClusterTopo.json");
    if (stream != null) {
      clusterPayloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, String>>() {
      }.getType());
    }

    rackTopoApi = new RackTopoApi(client);
    stream = getClass().getResourceAsStream("/RackTopo.json");
    if (stream != null) {
      rackTopoPayloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, String>>() {
      }.getType());
    }

  }

  @Test(dataProvider = "brick-payload", priority = 5)
  public void createBrickTopo(String payload) {
    try {
      // parse params from json payload
      List<BrickTopoCreationParams> params = gson.fromJson(payload, new TypeToken<List<BrickTopoCreationParams>>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskBrickTopo> result = brickTopoApi.createBrickTopo(params, contentLanguage);
      assertThat(result).as("check result of createBrickTopo").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "brick-payload")
  public void deleteBrickTopo(String payload) {
    try {
      // parse params from json payload
      BrickTopoDeletionParams params = gson.fromJson(payload, new TypeToken<BrickTopoDeletionParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteBrickTopo> result = brickTopoApi.deleteBrickTopo(params, contentLanguage);
      assertThat(result).as("check result of deleteBrickTopo").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "brick-payload")
  public void getBrickTopoes(String payload) {
    try {
      // parse params from json payload
      GetBrickTopoesRequestBody params = gson.fromJson(payload, new TypeToken<GetBrickTopoesRequestBody>() {
      }.getType());
      // do some modify to params(optional)
      List<BrickTopo> result = brickTopoApi.getBrickTopoes(params, contentLanguage);
      assertThat(result).as("check result of getBrickTopoes").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "brick-payload")
  public void getBrickTopoesConnection(String payload) {
    try {
      // parse params from json payload
      GetBrickTopoesConnectionRequestBody params = gson.fromJson(payload,
          new TypeToken<GetBrickTopoesConnectionRequestBody>() {
          }.getType());
      // do some modify to params(optional)
      BrickTopoConnection result = brickTopoApi.getBrickTopoesConnection(params, contentLanguage);
      assertThat(result).as("check result of getBrickTopoesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "brick-payload", priority = 6)
  public void moveBrickTopo(String payload) {
    try {
      // parse params from json payload
      BrickTopoMoveParams params = gson.fromJson(payload, new TypeToken<BrickTopoMoveParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskBrickTopo> result = brickTopoApi.moveBrickTopo(params, contentLanguage);
      assertThat(result).as("check result of moveBrickTopo").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "brick-payload", priority = 7)
  public void updateBrickTopo(String payload) {
    try {
      // parse params from json payload
      BrickTopoUpdationParams params = gson.fromJson(payload, new TypeToken<BrickTopoUpdationParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskBrickTopo> result = brickTopoApi.updateBrickTopo(params, contentLanguage);
      assertThat(result).as("check result of updateBrickTopo").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "zone-payload")
  public void getZoneTopoes(String payload) {
    try {
      // parse params from json payload
      GetZoneTopoesRequestBody params = gson.fromJson(payload, new TypeToken<GetZoneTopoesRequestBody>() {
      }.getType());
      // do some modify to params(optional)
      List<ZoneTopo> result = zoneTopoApi.getZoneTopoes(params, contentLanguage);
      assertThat(result).as("check result of getZoneTopoes").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "zone-payload")
  public void getZoneTopoesConnection(String payload) {
    try {
      // parse params from json payload
      GetZoneTopoesConnectionRequestBody params = gson.fromJson(payload,
          new TypeToken<GetZoneTopoesConnectionRequestBody>() {
          }.getType());
      // do some modify to params(optional)
      ZoneTopoConnection result = zoneTopoApi.getZoneTopoesConnection(params, contentLanguage);
      assertThat(result).as("check result of getZoneTopoesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "node-payload")
  public void getNodeTopoes(String payload) {
    try {
      // parse params from json payload
      GetNodeTopoesRequestBody params = gson.fromJson(payload, new TypeToken<GetNodeTopoesRequestBody>() {
      }.getType());
      // do some modify to params(optional)
      List<NodeTopo> result = nodeTopoApi.getNodeTopoes(params, contentLanguage);
      assertThat(result).as("check result of getNodeTopoes").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "node-payload")
  public void getNodeTopoesConnection(String payload) {
    try {
      // parse params from json payload
      GetNodeTopoesConnectionRequestBody params = gson.fromJson(payload,
          new TypeToken<GetNodeTopoesConnectionRequestBody>() {
          }.getType());
      // do some modify to params(optional)
      NodeTopoConnection result = nodeTopoApi.getNodeTopoesConnection(params, contentLanguage);
      assertThat(result).as("check result of getNodeTopoesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "node-payload")
  public void updateNodeTopo(String payload) {
    try {
      // parse params from json payload
      List<Object> params = gson.fromJson(payload, new TypeToken<List<Object>>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskNodeTopo> result = nodeTopoApi.updateNodeTopo(params, contentLanguage);
      assertThat(result).as("check result of updateNodeTopo").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "cluster-payload")
  public void getClusterTopoes(String payload) {
    try {
      // parse params from json payload
      GetClusterTopoesRequestBody params = gson.fromJson(payload, new TypeToken<GetClusterTopoesRequestBody>() {
      }.getType());
      // do some modify to params(optional)
      List<ClusterTopo> result = clusterApi.getClusterTopoes(params, contentLanguage);
      assertThat(result).as("check result of getClusterTopoes").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "cluster-payload")
  public void getClusterTopoesConnection(String payload) {
    try {
      // parse params from json payload
      GetClusterTopoesConnectionRequestBody params = gson.fromJson(payload,
          new TypeToken<GetClusterTopoesConnectionRequestBody>() {
          }.getType());
      // do some modify to params(optional)
      ClusterTopoConnection result = clusterApi.getClusterTopoesConnection(params, contentLanguage);
      assertThat(result).as("check result of getClusterTopoesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

  @Test(dataProvider = "rack-payload", priority = 1)
  public void createRackTopo(String payload) {
    try {
      // parse params from json payload
      List<RackTopoCreationParams> params = gson.fromJson(payload, new TypeToken<List<RackTopoCreationParams>>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskRackTopo> result = rackTopoApi.createRackTopo(params, contentLanguage);
      assertThat(result).as("check result of createRackTopo").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "rack-payload")
  public void deleteRackTopo(String payload) {
    try {
      // parse params from json payload
      RackTopoDeletionParams params = gson.fromJson(payload, new TypeToken<RackTopoDeletionParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskDeleteRackTopo> result = rackTopoApi.deleteRackTopo(params, contentLanguage);
      assertThat(result).as("check result of deleteRackTopo").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "rack-payload")
  public void getRackTopoes(String payload) {
    try {
      // parse params from json payload
      GetRackTopoesRequestBody params = gson.fromJson(payload, new TypeToken<GetRackTopoesRequestBody>() {
      }.getType());
      // do some modify to params(optional)
      List<RackTopo> result = rackTopoApi.getRackTopoes(params, contentLanguage);
      assertThat(result).as("check result of getRackTopoes").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "rack-payload")
  public void getRackTopoesConnection(String payload) {
    try {
      // parse params from json payload
      GetRackTopoesConnectionRequestBody params = gson.fromJson(payload,
          new TypeToken<GetRackTopoesConnectionRequestBody>() {
          }.getType());
      // do some modify to params(optional)
      RackTopoConnection result = rackTopoApi.getRackTopoesConnection(params, contentLanguage);
      assertThat(result).as("check result of getRackTopoesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "rack-payload")
  public void updateRackTopo(String payload) {
    try {
      // parse params from json payload
      RackTopoUpdationParams params = gson.fromJson(payload, new TypeToken<RackTopoUpdationParams>() {
      }.getType());
      // do some modify to params(optional)
      List<WithTaskRackTopo> result = rackTopoApi.updateRackTopo(params, contentLanguage);
      assertThat(result).as("check result of updateRackTopo").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }
}
