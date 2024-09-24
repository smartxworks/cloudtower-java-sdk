package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.TaskStatus;
import com.smartx.tower.model.TaskStepCreationParams;
import com.smartx.tower.model.TaskType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TaskUpdateParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class TaskUpdateParamsData {
  public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT = "resource_rollback_retry_count";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT)
  private Integer resourceRollbackRetryCount;

  public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR = "resource_rollback_error";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR)
  private String resourceRollbackError;

  public static final String SERIALIZED_NAME_RESOURCE_ROLLBACKED = "resource_rollbacked";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACKED)
  private Boolean resourceRollbacked;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<TaskStepCreationParams> steps = null;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private Float progress;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TaskStatus status;

  public static final String SERIALIZED_NAME_SNAPSHOT = "snapshot";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT)
  private String snapshot;

  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private Object args;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TaskType type;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_RESOURCE_MUTATION = "resource_mutation";
  @SerializedName(SERIALIZED_NAME_RESOURCE_MUTATION)
  private String resourceMutation;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public TaskUpdateParamsData() { 
  }

  public TaskUpdateParamsData resourceRollbackRetryCount(Integer resourceRollbackRetryCount) {
    
    this.resourceRollbackRetryCount = resourceRollbackRetryCount;
    return this;
  }

   /**
   * Get resourceRollbackRetryCount
   * @return resourceRollbackRetryCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getResourceRollbackRetryCount() {
    return resourceRollbackRetryCount;
  }


  public void setResourceRollbackRetryCount(Integer resourceRollbackRetryCount) {
    this.resourceRollbackRetryCount = resourceRollbackRetryCount;
  }


  public TaskUpdateParamsData resourceRollbackError(String resourceRollbackError) {
    
    this.resourceRollbackError = resourceRollbackError;
    return this;
  }

   /**
   * Get resourceRollbackError
   * @return resourceRollbackError
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceRollbackError() {
    return resourceRollbackError;
  }


  public void setResourceRollbackError(String resourceRollbackError) {
    this.resourceRollbackError = resourceRollbackError;
  }


  public TaskUpdateParamsData resourceRollbacked(Boolean resourceRollbacked) {
    
    this.resourceRollbacked = resourceRollbacked;
    return this;
  }

   /**
   * Get resourceRollbacked
   * @return resourceRollbacked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getResourceRollbacked() {
    return resourceRollbacked;
  }


  public void setResourceRollbacked(Boolean resourceRollbacked) {
    this.resourceRollbacked = resourceRollbacked;
  }


  public TaskUpdateParamsData steps(List<TaskStepCreationParams> steps) {
    
    this.steps = steps;
    return this;
  }

  public TaskUpdateParamsData addStepsItem(TaskStepCreationParams stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<TaskStepCreationParams>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TaskStepCreationParams> getSteps() {
    return steps;
  }


  public void setSteps(List<TaskStepCreationParams> steps) {
    this.steps = steps;
  }


  public TaskUpdateParamsData errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public TaskUpdateParamsData errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public TaskUpdateParamsData progress(Float progress) {
    
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getProgress() {
    return progress;
  }


  public void setProgress(Float progress) {
    this.progress = progress;
  }


  public TaskUpdateParamsData status(TaskStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaskStatus getStatus() {
    return status;
  }


  public void setStatus(TaskStatus status) {
    this.status = status;
  }


  public TaskUpdateParamsData snapshot(String snapshot) {
    
    this.snapshot = snapshot;
    return this;
  }

   /**
   * Get snapshot
   * @return snapshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSnapshot() {
    return snapshot;
  }


  public void setSnapshot(String snapshot) {
    this.snapshot = snapshot;
  }


  public TaskUpdateParamsData args(Object args) {
    
    this.args = args;
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getArgs() {
    return args;
  }


  public void setArgs(Object args) {
    this.args = args;
  }


  public TaskUpdateParamsData key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public TaskUpdateParamsData type(TaskType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaskType getType() {
    return type;
  }


  public void setType(TaskType type) {
    this.type = type;
  }


  public TaskUpdateParamsData resourceId(String resourceId) {
    
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


  public TaskUpdateParamsData clusterId(String clusterId) {
    
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


  public TaskUpdateParamsData userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public TaskUpdateParamsData resourceMutation(String resourceMutation) {
    
    this.resourceMutation = resourceMutation;
    return this;
  }

   /**
   * Get resourceMutation
   * @return resourceMutation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceMutation() {
    return resourceMutation;
  }


  public void setResourceMutation(String resourceMutation) {
    this.resourceMutation = resourceMutation;
  }


  public TaskUpdateParamsData resourceType(String resourceType) {
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceType() {
    return resourceType;
  }


  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  public TaskUpdateParamsData description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskUpdateParamsData taskUpdateParamsData = (TaskUpdateParamsData) o;
    return Objects.equals(this.resourceRollbackRetryCount, taskUpdateParamsData.resourceRollbackRetryCount) &&
        Objects.equals(this.resourceRollbackError, taskUpdateParamsData.resourceRollbackError) &&
        Objects.equals(this.resourceRollbacked, taskUpdateParamsData.resourceRollbacked) &&
        Objects.equals(this.steps, taskUpdateParamsData.steps) &&
        Objects.equals(this.errorMessage, taskUpdateParamsData.errorMessage) &&
        Objects.equals(this.errorCode, taskUpdateParamsData.errorCode) &&
        Objects.equals(this.progress, taskUpdateParamsData.progress) &&
        Objects.equals(this.status, taskUpdateParamsData.status) &&
        Objects.equals(this.snapshot, taskUpdateParamsData.snapshot) &&
        Objects.equals(this.args, taskUpdateParamsData.args) &&
        Objects.equals(this.key, taskUpdateParamsData.key) &&
        Objects.equals(this.type, taskUpdateParamsData.type) &&
        Objects.equals(this.resourceId, taskUpdateParamsData.resourceId) &&
        Objects.equals(this.clusterId, taskUpdateParamsData.clusterId) &&
        Objects.equals(this.userId, taskUpdateParamsData.userId) &&
        Objects.equals(this.resourceMutation, taskUpdateParamsData.resourceMutation) &&
        Objects.equals(this.resourceType, taskUpdateParamsData.resourceType) &&
        Objects.equals(this.description, taskUpdateParamsData.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceRollbackRetryCount, resourceRollbackError, resourceRollbacked, steps, errorMessage, errorCode, progress, status, snapshot, args, key, type, resourceId, clusterId, userId, resourceMutation, resourceType, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskUpdateParamsData {\n");
    sb.append("    resourceRollbackRetryCount: ").append(toIndentedString(resourceRollbackRetryCount)).append("\n");
    sb.append("    resourceRollbackError: ").append(toIndentedString(resourceRollbackError)).append("\n");
    sb.append("    resourceRollbacked: ").append(toIndentedString(resourceRollbacked)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    resourceMutation: ").append(toIndentedString(resourceMutation)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

