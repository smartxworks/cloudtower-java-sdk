package com.smartx.tower.integration;

import java.io.InputStream;

import com.google.gson.Gson;
import com.smartx.tower.ApiClient;

import org.testng.annotations.BeforeSuite;

public class IT {

  public class ITConfig {
    public String endpoint = null;
    public String username = null;
    public String password = null;
    public String usersource = null;
  }

  protected ApiClient client = null;
  protected static ClientFactory factory = new ClientFactory();

  Gson gson = new Gson();

  @BeforeSuite(alwaysRun = true)
  public void getClient() throws Exception {
    InputStream stream = getClass().getResourceAsStream("/config.json");
    if (stream == null) {
      throw new Error("missing config file");
    }
    ITConfig configMap = gson.fromJson(Utils.readInputStream(stream), ITConfig.class);
    client = factory.getClient(configMap);
  }
}
