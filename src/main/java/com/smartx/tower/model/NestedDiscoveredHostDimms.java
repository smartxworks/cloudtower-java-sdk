/*
 * CloudTower APIs
 * cloudtower operation API and SDK
 *
 * The version of the OpenAPI document: 1.9.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


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

/**
 * NestedDiscoveredHostDimms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NestedDiscoveredHostDimms {
  public static final String SERIALIZED_NAME_DIMM_ID = "dimm_id";
  @SerializedName(SERIALIZED_NAME_DIMM_ID)
  private String dimmId;

  public static final String SERIALIZED_NAME_FW_VERSION = "fw_version";
  @SerializedName(SERIALIZED_NAME_FW_VERSION)
  private String fwVersion;

  public static final String SERIALIZED_NAME_HEALTH_STATUS = "health_status";
  @SerializedName(SERIALIZED_NAME_HEALTH_STATUS)
  private String healthStatus;

  public static final String SERIALIZED_NAME_SOCKET_ID = "socket_id";
  @SerializedName(SERIALIZED_NAME_SOCKET_ID)
  private String socketId;

  public NestedDiscoveredHostDimms() { 
  }

  public NestedDiscoveredHostDimms dimmId(String dimmId) {
    
    this.dimmId = dimmId;
    return this;
  }

   /**
   * Get dimmId
   * @return dimmId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDimmId() {
    return dimmId;
  }


  public void setDimmId(String dimmId) {
    this.dimmId = dimmId;
  }


  public NestedDiscoveredHostDimms fwVersion(String fwVersion) {
    
    this.fwVersion = fwVersion;
    return this;
  }

   /**
   * Get fwVersion
   * @return fwVersion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFwVersion() {
    return fwVersion;
  }


  public void setFwVersion(String fwVersion) {
    this.fwVersion = fwVersion;
  }


  public NestedDiscoveredHostDimms healthStatus(String healthStatus) {
    
    this.healthStatus = healthStatus;
    return this;
  }

   /**
   * Get healthStatus
   * @return healthStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getHealthStatus() {
    return healthStatus;
  }


  public void setHealthStatus(String healthStatus) {
    this.healthStatus = healthStatus;
  }


  public NestedDiscoveredHostDimms socketId(String socketId) {
    
    this.socketId = socketId;
    return this;
  }

   /**
   * Get socketId
   * @return socketId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSocketId() {
    return socketId;
  }


  public void setSocketId(String socketId) {
    this.socketId = socketId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedDiscoveredHostDimms nestedDiscoveredHostDimms = (NestedDiscoveredHostDimms) o;
    return Objects.equals(this.dimmId, nestedDiscoveredHostDimms.dimmId) &&
        Objects.equals(this.fwVersion, nestedDiscoveredHostDimms.fwVersion) &&
        Objects.equals(this.healthStatus, nestedDiscoveredHostDimms.healthStatus) &&
        Objects.equals(this.socketId, nestedDiscoveredHostDimms.socketId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimmId, fwVersion, healthStatus, socketId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedDiscoveredHostDimms {\n");
    sb.append("    dimmId: ").append(toIndentedString(dimmId)).append("\n");
    sb.append("    fwVersion: ").append(toIndentedString(fwVersion)).append("\n");
    sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
    sb.append("    socketId: ").append(toIndentedString(socketId)).append("\n");
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
