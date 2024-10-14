package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.BackupExecutionMethod;
import com.smartx.tower.model.BackupExecutionType;
import com.smartx.tower.model.BackupPlanExecutionState;
import com.smartx.tower.model.BackupPlanExecutionStatus;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.NestedBackupPlan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * BackupPlanExecution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class BackupPlanExecution {
  public static final String SERIALIZED_NAME_BACKUP_PLAN = "backup_plan";
  @SerializedName(SERIALIZED_NAME_BACKUP_PLAN)
  private NestedBackupPlan backupPlan;

  public static final String SERIALIZED_NAME_DELETABLE_FLAG_MARKED = "deletable_flag_marked";
  @SerializedName(SERIALIZED_NAME_DELETABLE_FLAG_MARKED)
  private Boolean deletableFlagMarked;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_EXECUTED_AT = "executed_at";
  @SerializedName(SERIALIZED_NAME_EXECUTED_AT)
  private String executedAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
  private String localCreatedAt;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private BackupExecutionMethod method;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private BackupPlanExecutionState state;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private BackupPlanExecutionStatus status;

  public static final String SERIALIZED_NAME_SUCCESS_JOB_COUNT = "success_job_count";
  @SerializedName(SERIALIZED_NAME_SUCCESS_JOB_COUNT)
  private Integer successJobCount;

  public static final String SERIALIZED_NAME_TOTAL_JOB_COUNT = "total_job_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_JOB_COUNT)
  private Integer totalJobCount;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private BackupExecutionType type;

  public BackupPlanExecution() { 
  }

  public BackupPlanExecution backupPlan(NestedBackupPlan backupPlan) {
    
    this.backupPlan = backupPlan;
    return this;
  }

   /**
   * Get backupPlan
   * @return backupPlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedBackupPlan getBackupPlan() {
    return backupPlan;
  }


  public void setBackupPlan(NestedBackupPlan backupPlan) {
    this.backupPlan = backupPlan;
  }


  public BackupPlanExecution deletableFlagMarked(Boolean deletableFlagMarked) {
    
    this.deletableFlagMarked = deletableFlagMarked;
    return this;
  }

   /**
   * Get deletableFlagMarked
   * @return deletableFlagMarked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDeletableFlagMarked() {
    return deletableFlagMarked;
  }


  public void setDeletableFlagMarked(Boolean deletableFlagMarked) {
    this.deletableFlagMarked = deletableFlagMarked;
  }


  public BackupPlanExecution duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public BackupPlanExecution entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public BackupPlanExecution executedAt(String executedAt) {
    
    this.executedAt = executedAt;
    return this;
  }

   /**
   * Get executedAt
   * @return executedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExecutedAt() {
    return executedAt;
  }


  public void setExecutedAt(String executedAt) {
    this.executedAt = executedAt;
  }


  public BackupPlanExecution id(String id) {
    
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


  public BackupPlanExecution localCreatedAt(String localCreatedAt) {
    
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


  public BackupPlanExecution localId(String localId) {
    
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


  public BackupPlanExecution method(BackupExecutionMethod method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BackupExecutionMethod getMethod() {
    return method;
  }


  public void setMethod(BackupExecutionMethod method) {
    this.method = method;
  }


  public BackupPlanExecution state(BackupPlanExecutionState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupPlanExecutionState getState() {
    return state;
  }


  public void setState(BackupPlanExecutionState state) {
    this.state = state;
  }


  public BackupPlanExecution status(BackupPlanExecutionStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BackupPlanExecutionStatus getStatus() {
    return status;
  }


  public void setStatus(BackupPlanExecutionStatus status) {
    this.status = status;
  }


  public BackupPlanExecution successJobCount(Integer successJobCount) {
    
    this.successJobCount = successJobCount;
    return this;
  }

   /**
   * Get successJobCount
   * @return successJobCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuccessJobCount() {
    return successJobCount;
  }


  public void setSuccessJobCount(Integer successJobCount) {
    this.successJobCount = successJobCount;
  }


  public BackupPlanExecution totalJobCount(Integer totalJobCount) {
    
    this.totalJobCount = totalJobCount;
    return this;
  }

   /**
   * Get totalJobCount
   * @return totalJobCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalJobCount() {
    return totalJobCount;
  }


  public void setTotalJobCount(Integer totalJobCount) {
    this.totalJobCount = totalJobCount;
  }


  public BackupPlanExecution type(BackupExecutionType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BackupExecutionType getType() {
    return type;
  }


  public void setType(BackupExecutionType type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupPlanExecution backupPlanExecution = (BackupPlanExecution) o;
    return Objects.equals(this.backupPlan, backupPlanExecution.backupPlan) &&
        Objects.equals(this.deletableFlagMarked, backupPlanExecution.deletableFlagMarked) &&
        Objects.equals(this.duration, backupPlanExecution.duration) &&
        Objects.equals(this.entityAsyncStatus, backupPlanExecution.entityAsyncStatus) &&
        Objects.equals(this.executedAt, backupPlanExecution.executedAt) &&
        Objects.equals(this.id, backupPlanExecution.id) &&
        Objects.equals(this.localCreatedAt, backupPlanExecution.localCreatedAt) &&
        Objects.equals(this.localId, backupPlanExecution.localId) &&
        Objects.equals(this.method, backupPlanExecution.method) &&
        Objects.equals(this.state, backupPlanExecution.state) &&
        Objects.equals(this.status, backupPlanExecution.status) &&
        Objects.equals(this.successJobCount, backupPlanExecution.successJobCount) &&
        Objects.equals(this.totalJobCount, backupPlanExecution.totalJobCount) &&
        Objects.equals(this.type, backupPlanExecution.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupPlan, deletableFlagMarked, duration, entityAsyncStatus, executedAt, id, localCreatedAt, localId, method, state, status, successJobCount, totalJobCount, type);
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
    sb.append("class BackupPlanExecution {\n");
    sb.append("    backupPlan: ").append(toIndentedString(backupPlan)).append("\n");
    sb.append("    deletableFlagMarked: ").append(toIndentedString(deletableFlagMarked)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    executedAt: ").append(toIndentedString(executedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    successJobCount: ").append(toIndentedString(successJobCount)).append("\n");
    sb.append("    totalJobCount: ").append(toIndentedString(totalJobCount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

