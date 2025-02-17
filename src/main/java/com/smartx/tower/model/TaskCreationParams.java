package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.TaskDescription;
import com.smartx.tower.model.TaskStepCreationParams;
import com.smartx.tower.model.TaskType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TaskCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class TaskCreationParams {
  public static final String SERIALIZED_NAME_FINISHED_AT = "finished_at";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT)
  private String finishedAt;

  public static final String SERIALIZED_NAME_STARTED_AT = "started_at";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private String startedAt;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<TaskStepCreationParams> steps = null;

  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private Object args;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

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

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private TaskDescription description;

  public static final String SERIALIZED_NAME_RESOURCE_MUTATION = "resource_mutation";
  @SerializedName(SERIALIZED_NAME_RESOURCE_MUTATION)
  private String resourceMutation;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  public TaskCreationParams() { 
  }

  public TaskCreationParams finishedAt(String finishedAt) {
    
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


  public TaskCreationParams startedAt(String startedAt) {
    
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


  public TaskCreationParams steps(List<TaskStepCreationParams> steps) {
    
    this.steps = steps;
    return this;
  }

  public TaskCreationParams addStepsItem(TaskStepCreationParams stepsItem) {
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


  public TaskCreationParams args(Object args) {
    
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


  public TaskCreationParams key(String key) {
    
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


  public TaskCreationParams internal(Boolean internal) {
    
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


  public TaskCreationParams type(TaskType type) {
    
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


  public TaskCreationParams resourceId(String resourceId) {
    
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


  public TaskCreationParams clusterId(String clusterId) {
    
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


  public TaskCreationParams userId(String userId) {
    
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


  public TaskCreationParams description(TaskDescription description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TaskDescription getDescription() {
    return description;
  }


  public void setDescription(TaskDescription description) {
    this.description = description;
  }


  public TaskCreationParams resourceMutation(String resourceMutation) {
    
    this.resourceMutation = resourceMutation;
    return this;
  }

   /**
   * Get resourceMutation
   * @return resourceMutation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getResourceMutation() {
    return resourceMutation;
  }


  public void setResourceMutation(String resourceMutation) {
    this.resourceMutation = resourceMutation;
  }


  public TaskCreationParams resourceType(String resourceType) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskCreationParams taskCreationParams = (TaskCreationParams) o;
    return Objects.equals(this.finishedAt, taskCreationParams.finishedAt) &&
        Objects.equals(this.startedAt, taskCreationParams.startedAt) &&
        Objects.equals(this.steps, taskCreationParams.steps) &&
        Objects.equals(this.args, taskCreationParams.args) &&
        Objects.equals(this.key, taskCreationParams.key) &&
        Objects.equals(this.internal, taskCreationParams.internal) &&
        Objects.equals(this.type, taskCreationParams.type) &&
        Objects.equals(this.resourceId, taskCreationParams.resourceId) &&
        Objects.equals(this.clusterId, taskCreationParams.clusterId) &&
        Objects.equals(this.userId, taskCreationParams.userId) &&
        Objects.equals(this.description, taskCreationParams.description) &&
        Objects.equals(this.resourceMutation, taskCreationParams.resourceMutation) &&
        Objects.equals(this.resourceType, taskCreationParams.resourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishedAt, startedAt, steps, args, key, internal, type, resourceId, clusterId, userId, description, resourceMutation, resourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskCreationParams {\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    resourceMutation: ").append(toIndentedString(resourceMutation)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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

