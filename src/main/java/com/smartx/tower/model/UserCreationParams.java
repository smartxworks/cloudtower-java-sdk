package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.UserSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UserCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class UserCreationParams {
  public static final String SERIALIZED_NAME_AUTH_CONFIG_ID = "auth_config_id";
  @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID)
  private String authConfigId;

  public static final String SERIALIZED_NAME_LDAP_DN = "ldap_dn";
  @SerializedName(SERIALIZED_NAME_LDAP_DN)
  private String ldapDn;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private UserSource source;

  public static final String SERIALIZED_NAME_MOBILE_PHONE = "mobile_phone";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE)
  private String mobilePhone;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

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

  public UserCreationParams() { 
  }

  public UserCreationParams authConfigId(String authConfigId) {
    
    this.authConfigId = authConfigId;
    return this;
  }

   /**
   * Get authConfigId
   * @return authConfigId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthConfigId() {
    return authConfigId;
  }


  public void setAuthConfigId(String authConfigId) {
    this.authConfigId = authConfigId;
  }


  public UserCreationParams ldapDn(String ldapDn) {
    
    this.ldapDn = ldapDn;
    return this;
  }

   /**
   * Get ldapDn
   * @return ldapDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapDn() {
    return ldapDn;
  }


  public void setLdapDn(String ldapDn) {
    this.ldapDn = ldapDn;
  }


  public UserCreationParams source(UserSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserSource getSource() {
    return source;
  }


  public void setSource(UserSource source) {
    this.source = source;
  }


  public UserCreationParams mobilePhone(String mobilePhone) {
    
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


  public UserCreationParams emailAddress(String emailAddress) {
    
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


  public UserCreationParams internal(Boolean internal) {
    
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


  public UserCreationParams roleId(String roleId) {
    
    this.roleId = roleId;
    return this;
  }

   /**
   * Get roleId
   * @return roleId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getRoleId() {
    return roleId;
  }


  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }


  public UserCreationParams name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UserCreationParams password(String password) {
    
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


  public UserCreationParams username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

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
    UserCreationParams userCreationParams = (UserCreationParams) o;
    return Objects.equals(this.authConfigId, userCreationParams.authConfigId) &&
        Objects.equals(this.ldapDn, userCreationParams.ldapDn) &&
        Objects.equals(this.source, userCreationParams.source) &&
        Objects.equals(this.mobilePhone, userCreationParams.mobilePhone) &&
        Objects.equals(this.emailAddress, userCreationParams.emailAddress) &&
        Objects.equals(this.internal, userCreationParams.internal) &&
        Objects.equals(this.roleId, userCreationParams.roleId) &&
        Objects.equals(this.name, userCreationParams.name) &&
        Objects.equals(this.password, userCreationParams.password) &&
        Objects.equals(this.username, userCreationParams.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authConfigId, ldapDn, source, mobilePhone, emailAddress, internal, roleId, name, password, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreationParams {\n");
    sb.append("    authConfigId: ").append(toIndentedString(authConfigId)).append("\n");
    sb.append("    ldapDn: ").append(toIndentedString(ldapDn)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
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

