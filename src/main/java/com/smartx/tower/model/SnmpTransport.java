package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.NestedCluster;
import com.smartx.tower.model.SnmpAuthProtocol;
import com.smartx.tower.model.SnmpPrivacyProtocol;
import com.smartx.tower.model.SnmpProtocol;
import com.smartx.tower.model.SnmpVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SnmpTransport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class SnmpTransport {
  public static final String SERIALIZED_NAME_AUTH_PASS_PHRASE = "auth_pass_phrase";
  @SerializedName(SERIALIZED_NAME_AUTH_PASS_PHRASE)
  private String authPassPhrase;

  public static final String SERIALIZED_NAME_AUTH_PROTOCOL = "auth_protocol";
  @SerializedName(SERIALIZED_NAME_AUTH_PROTOCOL)
  private SnmpAuthProtocol authProtocol;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private NestedCluster cluster;

  public static final String SERIALIZED_NAME_COMMUNITY = "community";
  @SerializedName(SERIALIZED_NAME_COMMUNITY)
  private String community;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_PRIVACY_PASS_PHRASE = "privacy_pass_phrase";
  @SerializedName(SERIALIZED_NAME_PRIVACY_PASS_PHRASE)
  private String privacyPassPhrase;

  public static final String SERIALIZED_NAME_PRIVACY_PROTOCOL = "privacy_protocol";
  @SerializedName(SERIALIZED_NAME_PRIVACY_PROTOCOL)
  private SnmpPrivacyProtocol privacyProtocol;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private SnmpProtocol protocol;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private SnmpVersion version;

  public SnmpTransport() { 
  }

  public SnmpTransport authPassPhrase(String authPassPhrase) {
    
    this.authPassPhrase = authPassPhrase;
    return this;
  }

   /**
   * Get authPassPhrase
   * @return authPassPhrase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthPassPhrase() {
    return authPassPhrase;
  }


  public void setAuthPassPhrase(String authPassPhrase) {
    this.authPassPhrase = authPassPhrase;
  }


  public SnmpTransport authProtocol(SnmpAuthProtocol authProtocol) {
    
    this.authProtocol = authProtocol;
    return this;
  }

   /**
   * Get authProtocol
   * @return authProtocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SnmpAuthProtocol getAuthProtocol() {
    return authProtocol;
  }


  public void setAuthProtocol(SnmpAuthProtocol authProtocol) {
    this.authProtocol = authProtocol;
  }


  public SnmpTransport cluster(NestedCluster cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedCluster getCluster() {
    return cluster;
  }


  public void setCluster(NestedCluster cluster) {
    this.cluster = cluster;
  }


  public SnmpTransport community(String community) {
    
    this.community = community;
    return this;
  }

   /**
   * Get community
   * @return community
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCommunity() {
    return community;
  }


  public void setCommunity(String community) {
    this.community = community;
  }


  public SnmpTransport disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public SnmpTransport entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
    this.entityAsyncStatus = entityAsyncStatus;
    return this;
  }

   /**
   * Get entityAsyncStatus
   * @return entityAsyncStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityAsyncStatus getEntityAsyncStatus() {
    return entityAsyncStatus;
  }


  public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    this.entityAsyncStatus = entityAsyncStatus;
  }


  public SnmpTransport id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SnmpTransport localId(String localId) {
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public SnmpTransport name(String name) {
    
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


  public SnmpTransport port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public SnmpTransport privacyPassPhrase(String privacyPassPhrase) {
    
    this.privacyPassPhrase = privacyPassPhrase;
    return this;
  }

   /**
   * Get privacyPassPhrase
   * @return privacyPassPhrase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrivacyPassPhrase() {
    return privacyPassPhrase;
  }


  public void setPrivacyPassPhrase(String privacyPassPhrase) {
    this.privacyPassPhrase = privacyPassPhrase;
  }


  public SnmpTransport privacyProtocol(SnmpPrivacyProtocol privacyProtocol) {
    
    this.privacyProtocol = privacyProtocol;
    return this;
  }

   /**
   * Get privacyProtocol
   * @return privacyProtocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SnmpPrivacyProtocol getPrivacyProtocol() {
    return privacyProtocol;
  }


  public void setPrivacyProtocol(SnmpPrivacyProtocol privacyProtocol) {
    this.privacyProtocol = privacyProtocol;
  }


  public SnmpTransport protocol(SnmpProtocol protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SnmpProtocol getProtocol() {
    return protocol;
  }


  public void setProtocol(SnmpProtocol protocol) {
    this.protocol = protocol;
  }


  public SnmpTransport username(String username) {
    
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


  public SnmpTransport version(SnmpVersion version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SnmpVersion getVersion() {
    return version;
  }


  public void setVersion(SnmpVersion version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnmpTransport snmpTransport = (SnmpTransport) o;
    return Objects.equals(this.authPassPhrase, snmpTransport.authPassPhrase) &&
        Objects.equals(this.authProtocol, snmpTransport.authProtocol) &&
        Objects.equals(this.cluster, snmpTransport.cluster) &&
        Objects.equals(this.community, snmpTransport.community) &&
        Objects.equals(this.disabled, snmpTransport.disabled) &&
        Objects.equals(this.entityAsyncStatus, snmpTransport.entityAsyncStatus) &&
        Objects.equals(this.id, snmpTransport.id) &&
        Objects.equals(this.localId, snmpTransport.localId) &&
        Objects.equals(this.name, snmpTransport.name) &&
        Objects.equals(this.port, snmpTransport.port) &&
        Objects.equals(this.privacyPassPhrase, snmpTransport.privacyPassPhrase) &&
        Objects.equals(this.privacyProtocol, snmpTransport.privacyProtocol) &&
        Objects.equals(this.protocol, snmpTransport.protocol) &&
        Objects.equals(this.username, snmpTransport.username) &&
        Objects.equals(this.version, snmpTransport.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authPassPhrase, authProtocol, cluster, community, disabled, entityAsyncStatus, id, localId, name, port, privacyPassPhrase, privacyProtocol, protocol, username, version);
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
    sb.append("class SnmpTransport {\n");
    sb.append("    authPassPhrase: ").append(toIndentedString(authPassPhrase)).append("\n");
    sb.append("    authProtocol: ").append(toIndentedString(authProtocol)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    community: ").append(toIndentedString(community)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    privacyPassPhrase: ").append(toIndentedString(privacyPassPhrase)).append("\n");
    sb.append("    privacyProtocol: ").append(toIndentedString(privacyProtocol)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

