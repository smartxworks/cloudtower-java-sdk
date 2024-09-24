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
import com.smartx.tower.model.SnmpLanguageCode;
import com.smartx.tower.model.SnmpPrivacyProtocol;
import com.smartx.tower.model.SnmpProtocol;
import com.smartx.tower.model.SnmpVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SnmpTrapReceiver
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class SnmpTrapReceiver {
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

  public static final String SERIALIZED_NAME_ENGINE_ID = "engine_id";
  @SerializedName(SERIALIZED_NAME_ENGINE_ID)
  private String engineId;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INFORM = "inform";
  @SerializedName(SERIALIZED_NAME_INFORM)
  private Boolean inform;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private SnmpLanguageCode languageCode;

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

  public SnmpTrapReceiver() { 
  }

  public SnmpTrapReceiver authPassPhrase(String authPassPhrase) {
    
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


  public SnmpTrapReceiver authProtocol(SnmpAuthProtocol authProtocol) {
    
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


  public SnmpTrapReceiver cluster(NestedCluster cluster) {
    
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


  public SnmpTrapReceiver community(String community) {
    
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


  public SnmpTrapReceiver disabled(Boolean disabled) {
    
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


  public SnmpTrapReceiver engineId(String engineId) {
    
    this.engineId = engineId;
    return this;
  }

   /**
   * Get engineId
   * @return engineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEngineId() {
    return engineId;
  }


  public void setEngineId(String engineId) {
    this.engineId = engineId;
  }


  public SnmpTrapReceiver entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public SnmpTrapReceiver host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public SnmpTrapReceiver id(String id) {
    
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


  public SnmpTrapReceiver inform(Boolean inform) {
    
    this.inform = inform;
    return this;
  }

   /**
   * Get inform
   * @return inform
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getInform() {
    return inform;
  }


  public void setInform(Boolean inform) {
    this.inform = inform;
  }


  public SnmpTrapReceiver languageCode(SnmpLanguageCode languageCode) {
    
    this.languageCode = languageCode;
    return this;
  }

   /**
   * Get languageCode
   * @return languageCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SnmpLanguageCode getLanguageCode() {
    return languageCode;
  }


  public void setLanguageCode(SnmpLanguageCode languageCode) {
    this.languageCode = languageCode;
  }


  public SnmpTrapReceiver localId(String localId) {
    
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


  public SnmpTrapReceiver name(String name) {
    
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


  public SnmpTrapReceiver port(Integer port) {
    
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


  public SnmpTrapReceiver privacyPassPhrase(String privacyPassPhrase) {
    
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


  public SnmpTrapReceiver privacyProtocol(SnmpPrivacyProtocol privacyProtocol) {
    
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


  public SnmpTrapReceiver protocol(SnmpProtocol protocol) {
    
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


  public SnmpTrapReceiver username(String username) {
    
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


  public SnmpTrapReceiver version(SnmpVersion version) {
    
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
    SnmpTrapReceiver snmpTrapReceiver = (SnmpTrapReceiver) o;
    return Objects.equals(this.authPassPhrase, snmpTrapReceiver.authPassPhrase) &&
        Objects.equals(this.authProtocol, snmpTrapReceiver.authProtocol) &&
        Objects.equals(this.cluster, snmpTrapReceiver.cluster) &&
        Objects.equals(this.community, snmpTrapReceiver.community) &&
        Objects.equals(this.disabled, snmpTrapReceiver.disabled) &&
        Objects.equals(this.engineId, snmpTrapReceiver.engineId) &&
        Objects.equals(this.entityAsyncStatus, snmpTrapReceiver.entityAsyncStatus) &&
        Objects.equals(this.host, snmpTrapReceiver.host) &&
        Objects.equals(this.id, snmpTrapReceiver.id) &&
        Objects.equals(this.inform, snmpTrapReceiver.inform) &&
        Objects.equals(this.languageCode, snmpTrapReceiver.languageCode) &&
        Objects.equals(this.localId, snmpTrapReceiver.localId) &&
        Objects.equals(this.name, snmpTrapReceiver.name) &&
        Objects.equals(this.port, snmpTrapReceiver.port) &&
        Objects.equals(this.privacyPassPhrase, snmpTrapReceiver.privacyPassPhrase) &&
        Objects.equals(this.privacyProtocol, snmpTrapReceiver.privacyProtocol) &&
        Objects.equals(this.protocol, snmpTrapReceiver.protocol) &&
        Objects.equals(this.username, snmpTrapReceiver.username) &&
        Objects.equals(this.version, snmpTrapReceiver.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authPassPhrase, authProtocol, cluster, community, disabled, engineId, entityAsyncStatus, host, id, inform, languageCode, localId, name, port, privacyPassPhrase, privacyProtocol, protocol, username, version);
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
    sb.append("class SnmpTrapReceiver {\n");
    sb.append("    authPassPhrase: ").append(toIndentedString(authPassPhrase)).append("\n");
    sb.append("    authProtocol: ").append(toIndentedString(authProtocol)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    community: ").append(toIndentedString(community)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inform: ").append(toIndentedString(inform)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
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

