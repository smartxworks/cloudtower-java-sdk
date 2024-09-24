package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.AccessMode;
import com.smartx.tower.model.PasswordComplexity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NestedAuthSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class NestedAuthSettings {
  public static final String SERIALIZED_NAME_ACCESS_LIST = "access_list";
  @SerializedName(SERIALIZED_NAME_ACCESS_LIST)
  private List<String> accessList = null;

  public static final String SERIALIZED_NAME_ACCESS_MODE = "access_mode";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODE)
  private AccessMode accessMode;

  public static final String SERIALIZED_NAME_ENABLE_SINGLE_SESSION_LOGIN = "enable_single_session_login";
  @SerializedName(SERIALIZED_NAME_ENABLE_SINGLE_SESSION_LOGIN)
  private Boolean enableSingleSessionLogin;

  public static final String SERIALIZED_NAME_LOGIN_MISS_NUM_THRESHOLD = "login_miss_num_threshold";
  @SerializedName(SERIALIZED_NAME_LOGIN_MISS_NUM_THRESHOLD)
  private Integer loginMissNumThreshold;

  public static final String SERIALIZED_NAME_LOGIN_MISS_TIME_THRESHOLD = "login_miss_time_threshold";
  @SerializedName(SERIALIZED_NAME_LOGIN_MISS_TIME_THRESHOLD)
  private Integer loginMissTimeThreshold;

  public static final String SERIALIZED_NAME_PASSWORD_COMPLEXITY = "password_complexity";
  @SerializedName(SERIALIZED_NAME_PASSWORD_COMPLEXITY)
  private PasswordComplexity passwordComplexity;

  public static final String SERIALIZED_NAME_PASSWORD_EXPIRE_DAYS = "password_expire_days";
  @SerializedName(SERIALIZED_NAME_PASSWORD_EXPIRE_DAYS)
  private Integer passwordExpireDays;

  public static final String SERIALIZED_NAME_SESSION_MAX_AGE = "session_max_age";
  @SerializedName(SERIALIZED_NAME_SESSION_MAX_AGE)
  private Integer sessionMaxAge;

  public NestedAuthSettings() { 
  }

  public NestedAuthSettings accessList(List<String> accessList) {
    
    this.accessList = accessList;
    return this;
  }

  public NestedAuthSettings addAccessListItem(String accessListItem) {
    if (this.accessList == null) {
      this.accessList = new ArrayList<String>();
    }
    this.accessList.add(accessListItem);
    return this;
  }

   /**
   * Get accessList
   * @return accessList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAccessList() {
    return accessList;
  }


  public void setAccessList(List<String> accessList) {
    this.accessList = accessList;
  }


  public NestedAuthSettings accessMode(AccessMode accessMode) {
    
    this.accessMode = accessMode;
    return this;
  }

   /**
   * Get accessMode
   * @return accessMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccessMode getAccessMode() {
    return accessMode;
  }


  public void setAccessMode(AccessMode accessMode) {
    this.accessMode = accessMode;
  }


  public NestedAuthSettings enableSingleSessionLogin(Boolean enableSingleSessionLogin) {
    
    this.enableSingleSessionLogin = enableSingleSessionLogin;
    return this;
  }

   /**
   * Get enableSingleSessionLogin
   * @return enableSingleSessionLogin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnableSingleSessionLogin() {
    return enableSingleSessionLogin;
  }


  public void setEnableSingleSessionLogin(Boolean enableSingleSessionLogin) {
    this.enableSingleSessionLogin = enableSingleSessionLogin;
  }


  public NestedAuthSettings loginMissNumThreshold(Integer loginMissNumThreshold) {
    
    this.loginMissNumThreshold = loginMissNumThreshold;
    return this;
  }

   /**
   * Get loginMissNumThreshold
   * @return loginMissNumThreshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLoginMissNumThreshold() {
    return loginMissNumThreshold;
  }


  public void setLoginMissNumThreshold(Integer loginMissNumThreshold) {
    this.loginMissNumThreshold = loginMissNumThreshold;
  }


  public NestedAuthSettings loginMissTimeThreshold(Integer loginMissTimeThreshold) {
    
    this.loginMissTimeThreshold = loginMissTimeThreshold;
    return this;
  }

   /**
   * Get loginMissTimeThreshold
   * @return loginMissTimeThreshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLoginMissTimeThreshold() {
    return loginMissTimeThreshold;
  }


  public void setLoginMissTimeThreshold(Integer loginMissTimeThreshold) {
    this.loginMissTimeThreshold = loginMissTimeThreshold;
  }


  public NestedAuthSettings passwordComplexity(PasswordComplexity passwordComplexity) {
    
    this.passwordComplexity = passwordComplexity;
    return this;
  }

   /**
   * Get passwordComplexity
   * @return passwordComplexity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PasswordComplexity getPasswordComplexity() {
    return passwordComplexity;
  }


  public void setPasswordComplexity(PasswordComplexity passwordComplexity) {
    this.passwordComplexity = passwordComplexity;
  }


  public NestedAuthSettings passwordExpireDays(Integer passwordExpireDays) {
    
    this.passwordExpireDays = passwordExpireDays;
    return this;
  }

   /**
   * Get passwordExpireDays
   * @return passwordExpireDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPasswordExpireDays() {
    return passwordExpireDays;
  }


  public void setPasswordExpireDays(Integer passwordExpireDays) {
    this.passwordExpireDays = passwordExpireDays;
  }


  public NestedAuthSettings sessionMaxAge(Integer sessionMaxAge) {
    
    this.sessionMaxAge = sessionMaxAge;
    return this;
  }

   /**
   * Get sessionMaxAge
   * @return sessionMaxAge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSessionMaxAge() {
    return sessionMaxAge;
  }


  public void setSessionMaxAge(Integer sessionMaxAge) {
    this.sessionMaxAge = sessionMaxAge;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedAuthSettings nestedAuthSettings = (NestedAuthSettings) o;
    return Objects.equals(this.accessList, nestedAuthSettings.accessList) &&
        Objects.equals(this.accessMode, nestedAuthSettings.accessMode) &&
        Objects.equals(this.enableSingleSessionLogin, nestedAuthSettings.enableSingleSessionLogin) &&
        Objects.equals(this.loginMissNumThreshold, nestedAuthSettings.loginMissNumThreshold) &&
        Objects.equals(this.loginMissTimeThreshold, nestedAuthSettings.loginMissTimeThreshold) &&
        Objects.equals(this.passwordComplexity, nestedAuthSettings.passwordComplexity) &&
        Objects.equals(this.passwordExpireDays, nestedAuthSettings.passwordExpireDays) &&
        Objects.equals(this.sessionMaxAge, nestedAuthSettings.sessionMaxAge);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessList, accessMode, enableSingleSessionLogin, loginMissNumThreshold, loginMissTimeThreshold, passwordComplexity, passwordExpireDays, sessionMaxAge);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedAuthSettings {\n");
    sb.append("    accessList: ").append(toIndentedString(accessList)).append("\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    enableSingleSessionLogin: ").append(toIndentedString(enableSingleSessionLogin)).append("\n");
    sb.append("    loginMissNumThreshold: ").append(toIndentedString(loginMissNumThreshold)).append("\n");
    sb.append("    loginMissTimeThreshold: ").append(toIndentedString(loginMissTimeThreshold)).append("\n");
    sb.append("    passwordComplexity: ").append(toIndentedString(passwordComplexity)).append("\n");
    sb.append("    passwordExpireDays: ").append(toIndentedString(passwordExpireDays)).append("\n");
    sb.append("    sessionMaxAge: ").append(toIndentedString(sessionMaxAge)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

