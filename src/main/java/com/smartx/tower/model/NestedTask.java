package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NestedStep;
import com.smartx.tower.model.TaskStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NestedTask
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class NestedTask {
  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private Object args;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
  private String localCreatedAt;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private Double progress;

  public static final String SERIALIZED_NAME_SNAPSHOT = "snapshot";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT)
  private String snapshot;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TaskStatus status;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<NestedStep> steps = new ArrayList<NestedStep>();

  public NestedTask() { 
  }

  public NestedTask args(Object args) {
    
    this.args = args;
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Object getArgs() {
    return args;
  }


  public void setArgs(Object args) {
    this.args = args;
  }


  public NestedTask description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public NestedTask id(String id) {
    
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


  public NestedTask internal(Boolean internal) {
    
    this.internal = internal;
    return this;
  }

   /**
   * Get internal
   * @return internal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getInternal() {
    return internal;
  }


  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  public NestedTask localCreatedAt(String localCreatedAt) {
    
    this.localCreatedAt = localCreatedAt;
    return this;
  }

   /**
   * Get localCreatedAt
   * @return localCreatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocalCreatedAt() {
    return localCreatedAt;
  }


  public void setLocalCreatedAt(String localCreatedAt) {
    this.localCreatedAt = localCreatedAt;
  }


  public NestedTask progress(Double progress) {
    
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getProgress() {
    return progress;
  }


  public void setProgress(Double progress) {
    this.progress = progress;
  }


  public NestedTask snapshot(String snapshot) {
    
    this.snapshot = snapshot;
    return this;
  }

   /**
   * Get snapshot
   * @return snapshot
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSnapshot() {
    return snapshot;
  }


  public void setSnapshot(String snapshot) {
    this.snapshot = snapshot;
  }


  public NestedTask status(TaskStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TaskStatus getStatus() {
    return status;
  }


  public void setStatus(TaskStatus status) {
    this.status = status;
  }


  public NestedTask steps(List<NestedStep> steps) {
    
    this.steps = steps;
    return this;
  }

  public NestedTask addStepsItem(NestedStep stepsItem) {
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<NestedStep> getSteps() {
    return steps;
  }


  public void setSteps(List<NestedStep> steps) {
    this.steps = steps;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedTask nestedTask = (NestedTask) o;
    return Objects.equals(this.args, nestedTask.args) &&
        Objects.equals(this.description, nestedTask.description) &&
        Objects.equals(this.id, nestedTask.id) &&
        Objects.equals(this.internal, nestedTask.internal) &&
        Objects.equals(this.localCreatedAt, nestedTask.localCreatedAt) &&
        Objects.equals(this.progress, nestedTask.progress) &&
        Objects.equals(this.snapshot, nestedTask.snapshot) &&
        Objects.equals(this.status, nestedTask.status) &&
        Objects.equals(this.steps, nestedTask.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, description, id, internal, localCreatedAt, progress, snapshot, status, steps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedTask {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

