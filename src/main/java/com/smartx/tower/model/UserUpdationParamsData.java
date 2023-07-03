package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * UserUpdationParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class UserUpdationParamsData {
  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_MOBILE_PHONE = "mobile_phone";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE)
  private String mobilePhone;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_ROLE_ID = "role_id";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  private String roleId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public UserUpdationParamsData() { 
  }

  public UserUpdationParamsData internal(Boolean internal) {
    
    this.internal = internal;
    return this;
  }

   /**
   * Get internal
   * @return internal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInternal() {
    return internal;
  }


  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  public UserUpdationParamsData mobilePhone(String mobilePhone) {
    
    this.mobilePhone = mobilePhone;
    return this;
  }

   /**
   * Get mobilePhone
   * @return mobilePhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMobilePhone() {
    return mobilePhone;
  }


  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }


  public UserUpdationParamsData emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public UserUpdationParamsData roleId(String roleId) {
    
    this.roleId = roleId;
    return this;
  }

   /**
   * Get roleId
   * @return roleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRoleId() {
    return roleId;
  }


  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }


  public UserUpdationParamsData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UserUpdationParamsData password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public UserUpdationParamsData username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUpdationParamsData userUpdationParamsData = (UserUpdationParamsData) o;
    return Objects.equals(this.internal, userUpdationParamsData.internal) &&
        Objects.equals(this.mobilePhone, userUpdationParamsData.mobilePhone) &&
        Objects.equals(this.emailAddress, userUpdationParamsData.emailAddress) &&
        Objects.equals(this.roleId, userUpdationParamsData.roleId) &&
        Objects.equals(this.name, userUpdationParamsData.name) &&
        Objects.equals(this.password, userUpdationParamsData.password) &&
        Objects.equals(this.username, userUpdationParamsData.username);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(internal, mobilePhone, emailAddress, roleId, name, password, username);
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
    sb.append("class UserUpdationParamsData {\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

