package com.smartx.tower.integration;

import java.io.InputStream;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import com.smartx.tower.ApiClient;

import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;

public class IT {
  protected static final Logger LOGGER = Logger.getLogger(IT.class);

  public class ITConfig {
    public String endpoint = null;
    public String username = null;
    public String password = null;
    public String usersource = null;
  }

  protected ApiClient client = null;
  protected static ITClientFactory factory = new ITClientFactory();
  protected static HashMap<String, String> fixtureData = null;

  Gson gson = new Gson();

  @BeforeClass(alwaysRun = true)
  public void getClient() throws Exception {
    InputStream configStream = getClass().getResourceAsStream("/config.json");
    if (configStream == null) {
      throw new Error("missing config file");
    }
    // fixture is for default parameter to load a resource
    InputStream fixtureStream = getClass().getResourceAsStream("/fixture.json");
    if (fixtureStream == null) {
      LOGGER.warn("fixture file not found, this may cause most test failed");
    } else {
      fixtureData = gson.fromJson(ITUtils.readInputStream(fixtureStream), new TypeToken<HashMap<String, String>>() {
      }.getType());
    }
    ITConfig configMap = gson.fromJson(ITUtils.readInputStream(configStream), ITConfig.class);
    client = factory.getClient(configMap);
  }

  public <T> T getFixtureData(String key, java.lang.reflect.Type typeOfT) throws Exception {
    String raw = fixtureData.get(key);
    if (raw == null) {
      throw new Exception("Fixture data not found");
    }
    return gson.fromJson(raw, typeOfT);
  }

  public <T> T getFixtureData(String key, java.lang.Class<T> classOfT) throws Exception {
    String raw = fixtureData.get(key);
    if (raw == null) {
      throw new Exception("Fixture data not found");
    }
    return gson.fromJson(raw, classOfT);
  }
}
