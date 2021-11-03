package com.smartx.tower.integration;

import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.api.UserApi;
import com.smartx.tower.auth.ApiKeyAuth;
import com.smartx.tower.integration.IT.ITConfig;
import com.smartx.tower.model.LoginInput;
import com.smartx.tower.model.UserSource;

public class ITClientFactory {
  private ITConfig config = null;
  private static String token = "";

  private void getToken() throws ApiException {
    ApiClient client = Configuration.getDefaultApiClient();
    client.setBasePath(config.endpoint);
    UserApi userApi = new UserApi(client);
    try {
      com.smartx.tower.model.WithTaskTokenStringData data = userApi.login("zh-CN", new LoginInput()
          .password(config.password).username(config.username).source(UserSource.fromValue(config.usersource)))
          .getData();
      token = data.getToken();
    } catch (ApiException e) {
      throw e;
    }
  }

  public ApiClient getClient(ITConfig config) throws Exception {
    this.config = config;
    if (this.config.usersource.equals("LOCAL") && this.config.usersource.equals("LDAP")) {
      throw new Error("Unknown user source, please check your config");
    }
    int retry = 0;
    ApiException e = null;
    ApiClient client = new ApiClient();
    client.setBasePath(config.endpoint);
    while (token.isBlank() && ++retry <= 3) {
      try {
        getToken();
      } catch (ApiException _e) {
        if (e == null || !_e.getMessage().equals(e.getMessage())) {
          e = _e;
        }
      }
    }
    if (token.isBlank()) {
      throw e != null ? e : new Exception("Cannot Login, unknown Error");
    } else {
      ((ApiKeyAuth) client.getAuthentication("Authorization")).setApiKey(token);
    }
    return client;
  }
}
