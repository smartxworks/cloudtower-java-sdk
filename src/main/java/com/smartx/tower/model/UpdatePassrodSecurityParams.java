package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.PasswordComplexity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdatePassrodSecurityParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class UpdatePassrodSecurityParams {
  public static final String SERIALIZED_NAME_PASSWORD_EXPIRE_DAYS = "password_expire_days";
  @SerializedName(SERIALIZED_NAME_PASSWORD_EXPIRE_DAYS)
  private Integer passwordExpireDays;

  public static final String SERIALIZED_NAME_PASSWORD_COMPLEXITY = "password_complexity";
  @SerializedName(SERIALIZED_NAME_PASSWORD_COMPLEXITY)
  private PasswordComplexity passwordComplexity;

  public static final String SERIALIZED_NAME_LOGIN_MISS_TIME_THRESHOLD = "login_miss_time_threshold";
  @SerializedName(SERIALIZED_NAME_LOGIN_MISS_TIME_THRESHOLD)
  private Integer loginMissTimeThreshold;

  public static final String SERIALIZED_NAME_LOGIN_MISS_NUM_THRESHOLD = "login_miss_num_threshold";
  @SerializedName(SERIALIZED_NAME_LOGIN_MISS_NUM_THRESHOLD)
  private Integer loginMissNumThreshold;

  public UpdatePassrodSecurityParams() { 
  }

  public UpdatePassrodSecurityParams passwordExpireDays(Integer passwordExpireDays) {
    
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


  public UpdatePassrodSecurityParams passwordComplexity(PasswordComplexity passwordComplexity) {
    
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


  public UpdatePassrodSecurityParams loginMissTimeThreshold(Integer loginMissTimeThreshold) {
    
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


  public UpdatePassrodSecurityParams loginMissNumThreshold(Integer loginMissNumThreshold) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePassrodSecurityParams updatePassrodSecurityParams = (UpdatePassrodSecurityParams) o;
    return Objects.equals(this.passwordExpireDays, updatePassrodSecurityParams.passwordExpireDays) &&
        Objects.equals(this.passwordComplexity, updatePassrodSecurityParams.passwordComplexity) &&
        Objects.equals(this.loginMissTimeThreshold, updatePassrodSecurityParams.loginMissTimeThreshold) &&
        Objects.equals(this.loginMissNumThreshold, updatePassrodSecurityParams.loginMissNumThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwordExpireDays, passwordComplexity, loginMissTimeThreshold, loginMissNumThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePassrodSecurityParams {\n");
    sb.append("    passwordExpireDays: ").append(toIndentedString(passwordExpireDays)).append("\n");
    sb.append("    passwordComplexity: ").append(toIndentedString(passwordComplexity)).append("\n");
    sb.append("    loginMissTimeThreshold: ").append(toIndentedString(loginMissTimeThreshold)).append("\n");
    sb.append("    loginMissNumThreshold: ").append(toIndentedString(loginMissNumThreshold)).append("\n");
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

