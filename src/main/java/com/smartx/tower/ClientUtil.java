package com.smartx.tower;

import com.smartx.tower.api.UserApi;
import com.smartx.tower.auth.ApiKeyAuth;
import com.smartx.tower.model.LoginInput;
import com.smartx.tower.model.UserSource;
import com.smartx.tower.model.WithTaskLoginResponse;

public class ClientUtil {

  public static void login(String username, String password, ApiClient client) throws ApiException {
    login(username, password, false, client);
  }

  public static void login(String username, String password, boolean useLDAP, ApiClient client) throws ApiException {
    UserApi userApi = new UserApi(client);
    WithTaskLoginResponse response = userApi.login(
        new LoginInput()
            .username(username)
            .password(password)
            .source(useLDAP ? UserSource.LDAP : UserSource.LOCAL));
    String token = response.getData().getToken();
    login(token, client);
  }

  public static void login(String token, ApiClient client) {
    ((ApiKeyAuth) client.getAuthentication("Authorization")).setApiKey(token);
  }

}
