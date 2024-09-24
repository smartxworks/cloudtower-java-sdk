package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.UserAuditLogMessage;
import com.smartx.tower.model.UserAuditLogStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UserAuditLogCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class UserAuditLogCreationParams {
  public static final String SERIALIZED_NAME_STARTED_AT = "started_at";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private String startedAt;

  public static final String SERIALIZED_NAME_FINISHED_AT = "finished_at";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT)
  private String finishedAt;

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private UserAuditLogStatus status;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private UserAuditLogMessage message;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public UserAuditLogCreationParams() { 
  }

  public UserAuditLogCreationParams startedAt(String startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }


  public UserAuditLogCreationParams finishedAt(String finishedAt) {
    
    this.finishedAt = finishedAt;
    return this;
  }

   /**
   * Get finishedAt
   * @return finishedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFinishedAt() {
    return finishedAt;
  }


  public void setFinishedAt(String finishedAt) {
    this.finishedAt = finishedAt;
  }


  public UserAuditLogCreationParams clusterId(String clusterId) {
    
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClusterId() {
    return clusterId;
  }


  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }


  public UserAuditLogCreationParams resourceId(String resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceId() {
    return resourceId;
  }


  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public UserAuditLogCreationParams ipAddress(String ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddress() {
    return ipAddress;
  }


  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public UserAuditLogCreationParams status(UserAuditLogStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserAuditLogStatus getStatus() {
    return status;
  }


  public void setStatus(UserAuditLogStatus status) {
    this.status = status;
  }


  public UserAuditLogCreationParams userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public UserAuditLogCreationParams message(UserAuditLogMessage message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserAuditLogMessage getMessage() {
    return message;
  }


  public void setMessage(UserAuditLogMessage message) {
    this.message = message;
  }


  public UserAuditLogCreationParams resourceType(String resourceType) {
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getResourceType() {
    return resourceType;
  }


  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  public UserAuditLogCreationParams action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAuditLogCreationParams userAuditLogCreationParams = (UserAuditLogCreationParams) o;
    return Objects.equals(this.startedAt, userAuditLogCreationParams.startedAt) &&
        Objects.equals(this.finishedAt, userAuditLogCreationParams.finishedAt) &&
        Objects.equals(this.clusterId, userAuditLogCreationParams.clusterId) &&
        Objects.equals(this.resourceId, userAuditLogCreationParams.resourceId) &&
        Objects.equals(this.ipAddress, userAuditLogCreationParams.ipAddress) &&
        Objects.equals(this.status, userAuditLogCreationParams.status) &&
        Objects.equals(this.userId, userAuditLogCreationParams.userId) &&
        Objects.equals(this.message, userAuditLogCreationParams.message) &&
        Objects.equals(this.resourceType, userAuditLogCreationParams.resourceType) &&
        Objects.equals(this.action, userAuditLogCreationParams.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startedAt, finishedAt, clusterId, resourceId, ipAddress, status, userId, message, resourceType, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuditLogCreationParams {\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

