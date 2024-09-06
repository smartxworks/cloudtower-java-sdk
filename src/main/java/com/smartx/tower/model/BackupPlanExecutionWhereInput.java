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
import com.smartx.tower.model.BackupPlanWhereInput;
import com.smartx.tower.model.EntityAsyncStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * BackupPlanExecutionWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class BackupPlanExecutionWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<BackupPlanExecutionWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<BackupPlanExecutionWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<BackupPlanExecutionWhereInput> OR = null;

  public static final String SERIALIZED_NAME_BACKUP_PLAN = "backup_plan";
  @SerializedName(SERIALIZED_NAME_BACKUP_PLAN)
  private BackupPlanWhereInput backupPlan;

  public static final String SERIALIZED_NAME_DELETABLE_FLAG_MARKED = "deletable_flag_marked";
  @SerializedName(SERIALIZED_NAME_DELETABLE_FLAG_MARKED)
  private Boolean deletableFlagMarked;

  public static final String SERIALIZED_NAME_DELETABLE_FLAG_MARKED_NOT = "deletable_flag_marked_not";
  @SerializedName(SERIALIZED_NAME_DELETABLE_FLAG_MARKED_NOT)
  private Boolean deletableFlagMarkedNot;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_DURATION_GT = "duration_gt";
  @SerializedName(SERIALIZED_NAME_DURATION_GT)
  private Integer durationGt;

  public static final String SERIALIZED_NAME_DURATION_GTE = "duration_gte";
  @SerializedName(SERIALIZED_NAME_DURATION_GTE)
  private Integer durationGte;

  public static final String SERIALIZED_NAME_DURATION_IN = "duration_in";
  @SerializedName(SERIALIZED_NAME_DURATION_IN)
  private List<Integer> durationIn = null;

  public static final String SERIALIZED_NAME_DURATION_LT = "duration_lt";
  @SerializedName(SERIALIZED_NAME_DURATION_LT)
  private Integer durationLt;

  public static final String SERIALIZED_NAME_DURATION_LTE = "duration_lte";
  @SerializedName(SERIALIZED_NAME_DURATION_LTE)
  private Integer durationLte;

  public static final String SERIALIZED_NAME_DURATION_NOT = "duration_not";
  @SerializedName(SERIALIZED_NAME_DURATION_NOT)
  private Integer durationNot;

  public static final String SERIALIZED_NAME_DURATION_NOT_IN = "duration_not_in";
  @SerializedName(SERIALIZED_NAME_DURATION_NOT_IN)
  private List<Integer> durationNotIn = null;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN = "entityAsyncStatus_in";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN)
  private List<EntityAsyncStatus> entityAsyncStatusIn = null;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT = "entityAsyncStatus_not";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT)
  private EntityAsyncStatus entityAsyncStatusNot;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN = "entityAsyncStatus_not_in";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN)
  private List<EntityAsyncStatus> entityAsyncStatusNotIn = null;

  public static final String SERIALIZED_NAME_EXECUTED_AT = "executed_at";
  @SerializedName(SERIALIZED_NAME_EXECUTED_AT)
  private String executedAt;

  public static final String SERIALIZED_NAME_EXECUTED_AT_GT = "executed_at_gt";
  @SerializedName(SERIALIZED_NAME_EXECUTED_AT_GT)
  private String executedAtGt;

  public static final String SERIALIZED_NAME_EXECUTED_AT_GTE = "executed_at_gte";
  @SerializedName(SERIALIZED_NAME_EXECUTED_AT_GTE)
  private String executedAtGte;

  public static final String SERIALIZED_NAME_EXECUTED_AT_IN = "executed_at_in";
  @SerializedName(SERIALIZED_NAME_EXECUTED_AT_IN)
  private List<String> executedAtIn = null;

  public static final String SERIALIZED_NAME_EXECUTED_AT_LT = "executed_at_lt";
  @SerializedName(SERIALIZED_NAME_EXECUTED_AT_LT)
  private String executedAtLt;

  public static final String SERIALIZED_NAME_EXECUTED_AT_LTE = "executed_at_lte";
  @SerializedName(SERIALIZED_NAME_EXECUTED_AT_LTE)
  private String executedAtLte;

  public static final String SERIALIZED_NAME_EXECUTED_AT_NOT = "executed_at_not";
  @SerializedName(SERIALIZED_NAME_EXECUTED_AT_NOT)
  private String executedAtNot;

  public static final String SERIALIZED_NAME_EXECUTED_AT_NOT_IN = "executed_at_not_in";
  @SerializedName(SERIALIZED_NAME_EXECUTED_AT_NOT_IN)
  private List<String> executedAtNotIn = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ID_CONTAINS = "id_contains";
  @SerializedName(SERIALIZED_NAME_ID_CONTAINS)
  private String idContains;

  public static final String SERIALIZED_NAME_ID_ENDS_WITH = "id_ends_with";
  @SerializedName(SERIALIZED_NAME_ID_ENDS_WITH)
  private String idEndsWith;

  public static final String SERIALIZED_NAME_ID_GT = "id_gt";
  @SerializedName(SERIALIZED_NAME_ID_GT)
  private String idGt;

  public static final String SERIALIZED_NAME_ID_GTE = "id_gte";
  @SerializedName(SERIALIZED_NAME_ID_GTE)
  private String idGte;

  public static final String SERIALIZED_NAME_ID_IN = "id_in";
  @SerializedName(SERIALIZED_NAME_ID_IN)
  private List<String> idIn = null;

  public static final String SERIALIZED_NAME_ID_LT = "id_lt";
  @SerializedName(SERIALIZED_NAME_ID_LT)
  private String idLt;

  public static final String SERIALIZED_NAME_ID_LTE = "id_lte";
  @SerializedName(SERIALIZED_NAME_ID_LTE)
  private String idLte;

  public static final String SERIALIZED_NAME_ID_NOT = "id_not";
  @SerializedName(SERIALIZED_NAME_ID_NOT)
  private String idNot;

  public static final String SERIALIZED_NAME_ID_NOT_CONTAINS = "id_not_contains";
  @SerializedName(SERIALIZED_NAME_ID_NOT_CONTAINS)
  private String idNotContains;

  public static final String SERIALIZED_NAME_ID_NOT_ENDS_WITH = "id_not_ends_with";
  @SerializedName(SERIALIZED_NAME_ID_NOT_ENDS_WITH)
  private String idNotEndsWith;

  public static final String SERIALIZED_NAME_ID_NOT_IN = "id_not_in";
  @SerializedName(SERIALIZED_NAME_ID_NOT_IN)
  private List<String> idNotIn = null;

  public static final String SERIALIZED_NAME_ID_NOT_STARTS_WITH = "id_not_starts_with";
  @SerializedName(SERIALIZED_NAME_ID_NOT_STARTS_WITH)
  private String idNotStartsWith;

  public static final String SERIALIZED_NAME_ID_STARTS_WITH = "id_starts_with";
  @SerializedName(SERIALIZED_NAME_ID_STARTS_WITH)
  private String idStartsWith;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
  private String localCreatedAt;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_GT = "local_created_at_gt";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_GT)
  private String localCreatedAtGt;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_GTE = "local_created_at_gte";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE)
  private String localCreatedAtGte;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_IN = "local_created_at_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_IN)
  private List<String> localCreatedAtIn = null;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_LT = "local_created_at_lt";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_LT)
  private String localCreatedAtLt;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_LTE = "local_created_at_lte";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE)
  private String localCreatedAtLte;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_NOT = "local_created_at_not";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT)
  private String localCreatedAtNot;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN = "local_created_at_not_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN)
  private List<String> localCreatedAtNotIn = null;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_LOCAL_ID_CONTAINS = "local_id_contains";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_CONTAINS)
  private String localIdContains;

  public static final String SERIALIZED_NAME_LOCAL_ID_ENDS_WITH = "local_id_ends_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH)
  private String localIdEndsWith;

  public static final String SERIALIZED_NAME_LOCAL_ID_GT = "local_id_gt";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_GT)
  private String localIdGt;

  public static final String SERIALIZED_NAME_LOCAL_ID_GTE = "local_id_gte";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_GTE)
  private String localIdGte;

  public static final String SERIALIZED_NAME_LOCAL_ID_IN = "local_id_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_IN)
  private List<String> localIdIn = null;

  public static final String SERIALIZED_NAME_LOCAL_ID_LT = "local_id_lt";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_LT)
  private String localIdLt;

  public static final String SERIALIZED_NAME_LOCAL_ID_LTE = "local_id_lte";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_LTE)
  private String localIdLte;

  public static final String SERIALIZED_NAME_LOCAL_ID_NOT = "local_id_not";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT)
  private String localIdNot;

  public static final String SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS = "local_id_not_contains";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS)
  private String localIdNotContains;

  public static final String SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH = "local_id_not_ends_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH)
  private String localIdNotEndsWith;

  public static final String SERIALIZED_NAME_LOCAL_ID_NOT_IN = "local_id_not_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_IN)
  private List<String> localIdNotIn = null;

  public static final String SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH = "local_id_not_starts_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH)
  private String localIdNotStartsWith;

  public static final String SERIALIZED_NAME_LOCAL_ID_STARTS_WITH = "local_id_starts_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH)
  private String localIdStartsWith;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private BackupExecutionMethod method;

  public static final String SERIALIZED_NAME_METHOD_IN = "method_in";
  @SerializedName(SERIALIZED_NAME_METHOD_IN)
  private List<BackupExecutionMethod> methodIn = null;

  public static final String SERIALIZED_NAME_METHOD_NOT = "method_not";
  @SerializedName(SERIALIZED_NAME_METHOD_NOT)
  private BackupExecutionMethod methodNot;

  public static final String SERIALIZED_NAME_METHOD_NOT_IN = "method_not_in";
  @SerializedName(SERIALIZED_NAME_METHOD_NOT_IN)
  private List<BackupExecutionMethod> methodNotIn = null;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private BackupPlanExecutionState state;

  public static final String SERIALIZED_NAME_STATE_IN = "state_in";
  @SerializedName(SERIALIZED_NAME_STATE_IN)
  private List<BackupPlanExecutionState> stateIn = null;

  public static final String SERIALIZED_NAME_STATE_NOT = "state_not";
  @SerializedName(SERIALIZED_NAME_STATE_NOT)
  private BackupPlanExecutionState stateNot;

  public static final String SERIALIZED_NAME_STATE_NOT_IN = "state_not_in";
  @SerializedName(SERIALIZED_NAME_STATE_NOT_IN)
  private List<BackupPlanExecutionState> stateNotIn = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private BackupPlanExecutionStatus status;

  public static final String SERIALIZED_NAME_STATUS_IN = "status_in";
  @SerializedName(SERIALIZED_NAME_STATUS_IN)
  private List<BackupPlanExecutionStatus> statusIn = null;

  public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";
  @SerializedName(SERIALIZED_NAME_STATUS_NOT)
  private BackupPlanExecutionStatus statusNot;

  public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";
  @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
  private List<BackupPlanExecutionStatus> statusNotIn = null;

  public static final String SERIALIZED_NAME_SUCCESS_JOB_COUNT = "success_job_count";
  @SerializedName(SERIALIZED_NAME_SUCCESS_JOB_COUNT)
  private Integer successJobCount;

  public static final String SERIALIZED_NAME_SUCCESS_JOB_COUNT_GT = "success_job_count_gt";
  @SerializedName(SERIALIZED_NAME_SUCCESS_JOB_COUNT_GT)
  private Integer successJobCountGt;

  public static final String SERIALIZED_NAME_SUCCESS_JOB_COUNT_GTE = "success_job_count_gte";
  @SerializedName(SERIALIZED_NAME_SUCCESS_JOB_COUNT_GTE)
  private Integer successJobCountGte;

  public static final String SERIALIZED_NAME_SUCCESS_JOB_COUNT_IN = "success_job_count_in";
  @SerializedName(SERIALIZED_NAME_SUCCESS_JOB_COUNT_IN)
  private List<Integer> successJobCountIn = null;

  public static final String SERIALIZED_NAME_SUCCESS_JOB_COUNT_LT = "success_job_count_lt";
  @SerializedName(SERIALIZED_NAME_SUCCESS_JOB_COUNT_LT)
  private Integer successJobCountLt;

  public static final String SERIALIZED_NAME_SUCCESS_JOB_COUNT_LTE = "success_job_count_lte";
  @SerializedName(SERIALIZED_NAME_SUCCESS_JOB_COUNT_LTE)
  private Integer successJobCountLte;

  public static final String SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT = "success_job_count_not";
  @SerializedName(SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT)
  private Integer successJobCountNot;

  public static final String SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT_IN = "success_job_count_not_in";
  @SerializedName(SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT_IN)
  private List<Integer> successJobCountNotIn = null;

  public static final String SERIALIZED_NAME_TOTAL_JOB_COUNT = "total_job_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_JOB_COUNT)
  private Integer totalJobCount;

  public static final String SERIALIZED_NAME_TOTAL_JOB_COUNT_GT = "total_job_count_gt";
  @SerializedName(SERIALIZED_NAME_TOTAL_JOB_COUNT_GT)
  private Integer totalJobCountGt;

  public static final String SERIALIZED_NAME_TOTAL_JOB_COUNT_GTE = "total_job_count_gte";
  @SerializedName(SERIALIZED_NAME_TOTAL_JOB_COUNT_GTE)
  private Integer totalJobCountGte;

  public static final String SERIALIZED_NAME_TOTAL_JOB_COUNT_IN = "total_job_count_in";
  @SerializedName(SERIALIZED_NAME_TOTAL_JOB_COUNT_IN)
  private List<Integer> totalJobCountIn = null;

  public static final String SERIALIZED_NAME_TOTAL_JOB_COUNT_LT = "total_job_count_lt";
  @SerializedName(SERIALIZED_NAME_TOTAL_JOB_COUNT_LT)
  private Integer totalJobCountLt;

  public static final String SERIALIZED_NAME_TOTAL_JOB_COUNT_LTE = "total_job_count_lte";
  @SerializedName(SERIALIZED_NAME_TOTAL_JOB_COUNT_LTE)
  private Integer totalJobCountLte;

  public static final String SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT = "total_job_count_not";
  @SerializedName(SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT)
  private Integer totalJobCountNot;

  public static final String SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT_IN = "total_job_count_not_in";
  @SerializedName(SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT_IN)
  private List<Integer> totalJobCountNotIn = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private BackupExecutionType type;

  public static final String SERIALIZED_NAME_TYPE_IN = "type_in";
  @SerializedName(SERIALIZED_NAME_TYPE_IN)
  private List<BackupExecutionType> typeIn = null;

  public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";
  @SerializedName(SERIALIZED_NAME_TYPE_NOT)
  private BackupExecutionType typeNot;

  public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";
  @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
  private List<BackupExecutionType> typeNotIn = null;

  public BackupPlanExecutionWhereInput() { 
  }

  public BackupPlanExecutionWhereInput AND(List<BackupPlanExecutionWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public BackupPlanExecutionWhereInput addANDItem(BackupPlanExecutionWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<BackupPlanExecutionWhereInput>();
    }
    this.AND.add(ANDItem);
    return this;
  }

   /**
   * Get AND
   * @return AND
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BackupPlanExecutionWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<BackupPlanExecutionWhereInput> AND) {
    this.AND = AND;
  }


  public BackupPlanExecutionWhereInput NOT(List<BackupPlanExecutionWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public BackupPlanExecutionWhereInput addNOTItem(BackupPlanExecutionWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<BackupPlanExecutionWhereInput>();
    }
    this.NOT.add(NOTItem);
    return this;
  }

   /**
   * Get NOT
   * @return NOT
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BackupPlanExecutionWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<BackupPlanExecutionWhereInput> NOT) {
    this.NOT = NOT;
  }


  public BackupPlanExecutionWhereInput OR(List<BackupPlanExecutionWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public BackupPlanExecutionWhereInput addORItem(BackupPlanExecutionWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<BackupPlanExecutionWhereInput>();
    }
    this.OR.add(ORItem);
    return this;
  }

   /**
   * Get OR
   * @return OR
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BackupPlanExecutionWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<BackupPlanExecutionWhereInput> OR) {
    this.OR = OR;
  }


  public BackupPlanExecutionWhereInput backupPlan(BackupPlanWhereInput backupPlan) {
    
    this.backupPlan = backupPlan;
    return this;
  }

   /**
   * Get backupPlan
   * @return backupPlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupPlanWhereInput getBackupPlan() {
    return backupPlan;
  }


  public void setBackupPlan(BackupPlanWhereInput backupPlan) {
    this.backupPlan = backupPlan;
  }


  public BackupPlanExecutionWhereInput deletableFlagMarked(Boolean deletableFlagMarked) {
    
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


  public BackupPlanExecutionWhereInput deletableFlagMarkedNot(Boolean deletableFlagMarkedNot) {
    
    this.deletableFlagMarkedNot = deletableFlagMarkedNot;
    return this;
  }

   /**
   * Get deletableFlagMarkedNot
   * @return deletableFlagMarkedNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDeletableFlagMarkedNot() {
    return deletableFlagMarkedNot;
  }


  public void setDeletableFlagMarkedNot(Boolean deletableFlagMarkedNot) {
    this.deletableFlagMarkedNot = deletableFlagMarkedNot;
  }


  public BackupPlanExecutionWhereInput duration(Integer duration) {
    
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


  public BackupPlanExecutionWhereInput durationGt(Integer durationGt) {
    
    this.durationGt = durationGt;
    return this;
  }

   /**
   * Get durationGt
   * @return durationGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDurationGt() {
    return durationGt;
  }


  public void setDurationGt(Integer durationGt) {
    this.durationGt = durationGt;
  }


  public BackupPlanExecutionWhereInput durationGte(Integer durationGte) {
    
    this.durationGte = durationGte;
    return this;
  }

   /**
   * Get durationGte
   * @return durationGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDurationGte() {
    return durationGte;
  }


  public void setDurationGte(Integer durationGte) {
    this.durationGte = durationGte;
  }


  public BackupPlanExecutionWhereInput durationIn(List<Integer> durationIn) {
    
    this.durationIn = durationIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addDurationInItem(Integer durationInItem) {
    if (this.durationIn == null) {
      this.durationIn = new ArrayList<Integer>();
    }
    this.durationIn.add(durationInItem);
    return this;
  }

   /**
   * Get durationIn
   * @return durationIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getDurationIn() {
    return durationIn;
  }


  public void setDurationIn(List<Integer> durationIn) {
    this.durationIn = durationIn;
  }


  public BackupPlanExecutionWhereInput durationLt(Integer durationLt) {
    
    this.durationLt = durationLt;
    return this;
  }

   /**
   * Get durationLt
   * @return durationLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDurationLt() {
    return durationLt;
  }


  public void setDurationLt(Integer durationLt) {
    this.durationLt = durationLt;
  }


  public BackupPlanExecutionWhereInput durationLte(Integer durationLte) {
    
    this.durationLte = durationLte;
    return this;
  }

   /**
   * Get durationLte
   * @return durationLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDurationLte() {
    return durationLte;
  }


  public void setDurationLte(Integer durationLte) {
    this.durationLte = durationLte;
  }


  public BackupPlanExecutionWhereInput durationNot(Integer durationNot) {
    
    this.durationNot = durationNot;
    return this;
  }

   /**
   * Get durationNot
   * @return durationNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDurationNot() {
    return durationNot;
  }


  public void setDurationNot(Integer durationNot) {
    this.durationNot = durationNot;
  }


  public BackupPlanExecutionWhereInput durationNotIn(List<Integer> durationNotIn) {
    
    this.durationNotIn = durationNotIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addDurationNotInItem(Integer durationNotInItem) {
    if (this.durationNotIn == null) {
      this.durationNotIn = new ArrayList<Integer>();
    }
    this.durationNotIn.add(durationNotInItem);
    return this;
  }

   /**
   * Get durationNotIn
   * @return durationNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getDurationNotIn() {
    return durationNotIn;
  }


  public void setDurationNotIn(List<Integer> durationNotIn) {
    this.durationNotIn = durationNotIn;
  }


  public BackupPlanExecutionWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public BackupPlanExecutionWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
    if (this.entityAsyncStatusIn == null) {
      this.entityAsyncStatusIn = new ArrayList<EntityAsyncStatus>();
    }
    this.entityAsyncStatusIn.add(entityAsyncStatusInItem);
    return this;
  }

   /**
   * Get entityAsyncStatusIn
   * @return entityAsyncStatusIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EntityAsyncStatus> getEntityAsyncStatusIn() {
    return entityAsyncStatusIn;
  }


  public void setEntityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    this.entityAsyncStatusIn = entityAsyncStatusIn;
  }


  public BackupPlanExecutionWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
    this.entityAsyncStatusNot = entityAsyncStatusNot;
    return this;
  }

   /**
   * Get entityAsyncStatusNot
   * @return entityAsyncStatusNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityAsyncStatus getEntityAsyncStatusNot() {
    return entityAsyncStatusNot;
  }


  public void setEntityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    this.entityAsyncStatusNot = entityAsyncStatusNot;
  }


  public BackupPlanExecutionWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
    if (this.entityAsyncStatusNotIn == null) {
      this.entityAsyncStatusNotIn = new ArrayList<EntityAsyncStatus>();
    }
    this.entityAsyncStatusNotIn.add(entityAsyncStatusNotInItem);
    return this;
  }

   /**
   * Get entityAsyncStatusNotIn
   * @return entityAsyncStatusNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EntityAsyncStatus> getEntityAsyncStatusNotIn() {
    return entityAsyncStatusNotIn;
  }


  public void setEntityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
  }


  public BackupPlanExecutionWhereInput executedAt(String executedAt) {
    
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


  public BackupPlanExecutionWhereInput executedAtGt(String executedAtGt) {
    
    this.executedAtGt = executedAtGt;
    return this;
  }

   /**
   * Get executedAtGt
   * @return executedAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExecutedAtGt() {
    return executedAtGt;
  }


  public void setExecutedAtGt(String executedAtGt) {
    this.executedAtGt = executedAtGt;
  }


  public BackupPlanExecutionWhereInput executedAtGte(String executedAtGte) {
    
    this.executedAtGte = executedAtGte;
    return this;
  }

   /**
   * Get executedAtGte
   * @return executedAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExecutedAtGte() {
    return executedAtGte;
  }


  public void setExecutedAtGte(String executedAtGte) {
    this.executedAtGte = executedAtGte;
  }


  public BackupPlanExecutionWhereInput executedAtIn(List<String> executedAtIn) {
    
    this.executedAtIn = executedAtIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addExecutedAtInItem(String executedAtInItem) {
    if (this.executedAtIn == null) {
      this.executedAtIn = new ArrayList<String>();
    }
    this.executedAtIn.add(executedAtInItem);
    return this;
  }

   /**
   * Get executedAtIn
   * @return executedAtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getExecutedAtIn() {
    return executedAtIn;
  }


  public void setExecutedAtIn(List<String> executedAtIn) {
    this.executedAtIn = executedAtIn;
  }


  public BackupPlanExecutionWhereInput executedAtLt(String executedAtLt) {
    
    this.executedAtLt = executedAtLt;
    return this;
  }

   /**
   * Get executedAtLt
   * @return executedAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExecutedAtLt() {
    return executedAtLt;
  }


  public void setExecutedAtLt(String executedAtLt) {
    this.executedAtLt = executedAtLt;
  }


  public BackupPlanExecutionWhereInput executedAtLte(String executedAtLte) {
    
    this.executedAtLte = executedAtLte;
    return this;
  }

   /**
   * Get executedAtLte
   * @return executedAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExecutedAtLte() {
    return executedAtLte;
  }


  public void setExecutedAtLte(String executedAtLte) {
    this.executedAtLte = executedAtLte;
  }


  public BackupPlanExecutionWhereInput executedAtNot(String executedAtNot) {
    
    this.executedAtNot = executedAtNot;
    return this;
  }

   /**
   * Get executedAtNot
   * @return executedAtNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExecutedAtNot() {
    return executedAtNot;
  }


  public void setExecutedAtNot(String executedAtNot) {
    this.executedAtNot = executedAtNot;
  }


  public BackupPlanExecutionWhereInput executedAtNotIn(List<String> executedAtNotIn) {
    
    this.executedAtNotIn = executedAtNotIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addExecutedAtNotInItem(String executedAtNotInItem) {
    if (this.executedAtNotIn == null) {
      this.executedAtNotIn = new ArrayList<String>();
    }
    this.executedAtNotIn.add(executedAtNotInItem);
    return this;
  }

   /**
   * Get executedAtNotIn
   * @return executedAtNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getExecutedAtNotIn() {
    return executedAtNotIn;
  }


  public void setExecutedAtNotIn(List<String> executedAtNotIn) {
    this.executedAtNotIn = executedAtNotIn;
  }


  public BackupPlanExecutionWhereInput id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public BackupPlanExecutionWhereInput idContains(String idContains) {
    
    this.idContains = idContains;
    return this;
  }

   /**
   * Get idContains
   * @return idContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdContains() {
    return idContains;
  }


  public void setIdContains(String idContains) {
    this.idContains = idContains;
  }


  public BackupPlanExecutionWhereInput idEndsWith(String idEndsWith) {
    
    this.idEndsWith = idEndsWith;
    return this;
  }

   /**
   * Get idEndsWith
   * @return idEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdEndsWith() {
    return idEndsWith;
  }


  public void setIdEndsWith(String idEndsWith) {
    this.idEndsWith = idEndsWith;
  }


  public BackupPlanExecutionWhereInput idGt(String idGt) {
    
    this.idGt = idGt;
    return this;
  }

   /**
   * Get idGt
   * @return idGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdGt() {
    return idGt;
  }


  public void setIdGt(String idGt) {
    this.idGt = idGt;
  }


  public BackupPlanExecutionWhereInput idGte(String idGte) {
    
    this.idGte = idGte;
    return this;
  }

   /**
   * Get idGte
   * @return idGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdGte() {
    return idGte;
  }


  public void setIdGte(String idGte) {
    this.idGte = idGte;
  }


  public BackupPlanExecutionWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addIdInItem(String idInItem) {
    if (this.idIn == null) {
      this.idIn = new ArrayList<String>();
    }
    this.idIn.add(idInItem);
    return this;
  }

   /**
   * Get idIn
   * @return idIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIdIn() {
    return idIn;
  }


  public void setIdIn(List<String> idIn) {
    this.idIn = idIn;
  }


  public BackupPlanExecutionWhereInput idLt(String idLt) {
    
    this.idLt = idLt;
    return this;
  }

   /**
   * Get idLt
   * @return idLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdLt() {
    return idLt;
  }


  public void setIdLt(String idLt) {
    this.idLt = idLt;
  }


  public BackupPlanExecutionWhereInput idLte(String idLte) {
    
    this.idLte = idLte;
    return this;
  }

   /**
   * Get idLte
   * @return idLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdLte() {
    return idLte;
  }


  public void setIdLte(String idLte) {
    this.idLte = idLte;
  }


  public BackupPlanExecutionWhereInput idNot(String idNot) {
    
    this.idNot = idNot;
    return this;
  }

   /**
   * Get idNot
   * @return idNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdNot() {
    return idNot;
  }


  public void setIdNot(String idNot) {
    this.idNot = idNot;
  }


  public BackupPlanExecutionWhereInput idNotContains(String idNotContains) {
    
    this.idNotContains = idNotContains;
    return this;
  }

   /**
   * Get idNotContains
   * @return idNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdNotContains() {
    return idNotContains;
  }


  public void setIdNotContains(String idNotContains) {
    this.idNotContains = idNotContains;
  }


  public BackupPlanExecutionWhereInput idNotEndsWith(String idNotEndsWith) {
    
    this.idNotEndsWith = idNotEndsWith;
    return this;
  }

   /**
   * Get idNotEndsWith
   * @return idNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdNotEndsWith() {
    return idNotEndsWith;
  }


  public void setIdNotEndsWith(String idNotEndsWith) {
    this.idNotEndsWith = idNotEndsWith;
  }


  public BackupPlanExecutionWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addIdNotInItem(String idNotInItem) {
    if (this.idNotIn == null) {
      this.idNotIn = new ArrayList<String>();
    }
    this.idNotIn.add(idNotInItem);
    return this;
  }

   /**
   * Get idNotIn
   * @return idNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIdNotIn() {
    return idNotIn;
  }


  public void setIdNotIn(List<String> idNotIn) {
    this.idNotIn = idNotIn;
  }


  public BackupPlanExecutionWhereInput idNotStartsWith(String idNotStartsWith) {
    
    this.idNotStartsWith = idNotStartsWith;
    return this;
  }

   /**
   * Get idNotStartsWith
   * @return idNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdNotStartsWith() {
    return idNotStartsWith;
  }


  public void setIdNotStartsWith(String idNotStartsWith) {
    this.idNotStartsWith = idNotStartsWith;
  }


  public BackupPlanExecutionWhereInput idStartsWith(String idStartsWith) {
    
    this.idStartsWith = idStartsWith;
    return this;
  }

   /**
   * Get idStartsWith
   * @return idStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdStartsWith() {
    return idStartsWith;
  }


  public void setIdStartsWith(String idStartsWith) {
    this.idStartsWith = idStartsWith;
  }


  public BackupPlanExecutionWhereInput localCreatedAt(String localCreatedAt) {
    
    this.localCreatedAt = localCreatedAt;
    return this;
  }

   /**
   * Get localCreatedAt
   * @return localCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAt() {
    return localCreatedAt;
  }


  public void setLocalCreatedAt(String localCreatedAt) {
    this.localCreatedAt = localCreatedAt;
  }


  public BackupPlanExecutionWhereInput localCreatedAtGt(String localCreatedAtGt) {
    
    this.localCreatedAtGt = localCreatedAtGt;
    return this;
  }

   /**
   * Get localCreatedAtGt
   * @return localCreatedAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtGt() {
    return localCreatedAtGt;
  }


  public void setLocalCreatedAtGt(String localCreatedAtGt) {
    this.localCreatedAtGt = localCreatedAtGt;
  }


  public BackupPlanExecutionWhereInput localCreatedAtGte(String localCreatedAtGte) {
    
    this.localCreatedAtGte = localCreatedAtGte;
    return this;
  }

   /**
   * Get localCreatedAtGte
   * @return localCreatedAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtGte() {
    return localCreatedAtGte;
  }


  public void setLocalCreatedAtGte(String localCreatedAtGte) {
    this.localCreatedAtGte = localCreatedAtGte;
  }


  public BackupPlanExecutionWhereInput localCreatedAtIn(List<String> localCreatedAtIn) {
    
    this.localCreatedAtIn = localCreatedAtIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addLocalCreatedAtInItem(String localCreatedAtInItem) {
    if (this.localCreatedAtIn == null) {
      this.localCreatedAtIn = new ArrayList<String>();
    }
    this.localCreatedAtIn.add(localCreatedAtInItem);
    return this;
  }

   /**
   * Get localCreatedAtIn
   * @return localCreatedAtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalCreatedAtIn() {
    return localCreatedAtIn;
  }


  public void setLocalCreatedAtIn(List<String> localCreatedAtIn) {
    this.localCreatedAtIn = localCreatedAtIn;
  }


  public BackupPlanExecutionWhereInput localCreatedAtLt(String localCreatedAtLt) {
    
    this.localCreatedAtLt = localCreatedAtLt;
    return this;
  }

   /**
   * Get localCreatedAtLt
   * @return localCreatedAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtLt() {
    return localCreatedAtLt;
  }


  public void setLocalCreatedAtLt(String localCreatedAtLt) {
    this.localCreatedAtLt = localCreatedAtLt;
  }


  public BackupPlanExecutionWhereInput localCreatedAtLte(String localCreatedAtLte) {
    
    this.localCreatedAtLte = localCreatedAtLte;
    return this;
  }

   /**
   * Get localCreatedAtLte
   * @return localCreatedAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtLte() {
    return localCreatedAtLte;
  }


  public void setLocalCreatedAtLte(String localCreatedAtLte) {
    this.localCreatedAtLte = localCreatedAtLte;
  }


  public BackupPlanExecutionWhereInput localCreatedAtNot(String localCreatedAtNot) {
    
    this.localCreatedAtNot = localCreatedAtNot;
    return this;
  }

   /**
   * Get localCreatedAtNot
   * @return localCreatedAtNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtNot() {
    return localCreatedAtNot;
  }


  public void setLocalCreatedAtNot(String localCreatedAtNot) {
    this.localCreatedAtNot = localCreatedAtNot;
  }


  public BackupPlanExecutionWhereInput localCreatedAtNotIn(List<String> localCreatedAtNotIn) {
    
    this.localCreatedAtNotIn = localCreatedAtNotIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addLocalCreatedAtNotInItem(String localCreatedAtNotInItem) {
    if (this.localCreatedAtNotIn == null) {
      this.localCreatedAtNotIn = new ArrayList<String>();
    }
    this.localCreatedAtNotIn.add(localCreatedAtNotInItem);
    return this;
  }

   /**
   * Get localCreatedAtNotIn
   * @return localCreatedAtNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalCreatedAtNotIn() {
    return localCreatedAtNotIn;
  }


  public void setLocalCreatedAtNotIn(List<String> localCreatedAtNotIn) {
    this.localCreatedAtNotIn = localCreatedAtNotIn;
  }


  public BackupPlanExecutionWhereInput localId(String localId) {
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public BackupPlanExecutionWhereInput localIdContains(String localIdContains) {
    
    this.localIdContains = localIdContains;
    return this;
  }

   /**
   * Get localIdContains
   * @return localIdContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdContains() {
    return localIdContains;
  }


  public void setLocalIdContains(String localIdContains) {
    this.localIdContains = localIdContains;
  }


  public BackupPlanExecutionWhereInput localIdEndsWith(String localIdEndsWith) {
    
    this.localIdEndsWith = localIdEndsWith;
    return this;
  }

   /**
   * Get localIdEndsWith
   * @return localIdEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdEndsWith() {
    return localIdEndsWith;
  }


  public void setLocalIdEndsWith(String localIdEndsWith) {
    this.localIdEndsWith = localIdEndsWith;
  }


  public BackupPlanExecutionWhereInput localIdGt(String localIdGt) {
    
    this.localIdGt = localIdGt;
    return this;
  }

   /**
   * Get localIdGt
   * @return localIdGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdGt() {
    return localIdGt;
  }


  public void setLocalIdGt(String localIdGt) {
    this.localIdGt = localIdGt;
  }


  public BackupPlanExecutionWhereInput localIdGte(String localIdGte) {
    
    this.localIdGte = localIdGte;
    return this;
  }

   /**
   * Get localIdGte
   * @return localIdGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdGte() {
    return localIdGte;
  }


  public void setLocalIdGte(String localIdGte) {
    this.localIdGte = localIdGte;
  }


  public BackupPlanExecutionWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addLocalIdInItem(String localIdInItem) {
    if (this.localIdIn == null) {
      this.localIdIn = new ArrayList<String>();
    }
    this.localIdIn.add(localIdInItem);
    return this;
  }

   /**
   * Get localIdIn
   * @return localIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalIdIn() {
    return localIdIn;
  }


  public void setLocalIdIn(List<String> localIdIn) {
    this.localIdIn = localIdIn;
  }


  public BackupPlanExecutionWhereInput localIdLt(String localIdLt) {
    
    this.localIdLt = localIdLt;
    return this;
  }

   /**
   * Get localIdLt
   * @return localIdLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdLt() {
    return localIdLt;
  }


  public void setLocalIdLt(String localIdLt) {
    this.localIdLt = localIdLt;
  }


  public BackupPlanExecutionWhereInput localIdLte(String localIdLte) {
    
    this.localIdLte = localIdLte;
    return this;
  }

   /**
   * Get localIdLte
   * @return localIdLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdLte() {
    return localIdLte;
  }


  public void setLocalIdLte(String localIdLte) {
    this.localIdLte = localIdLte;
  }


  public BackupPlanExecutionWhereInput localIdNot(String localIdNot) {
    
    this.localIdNot = localIdNot;
    return this;
  }

   /**
   * Get localIdNot
   * @return localIdNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdNot() {
    return localIdNot;
  }


  public void setLocalIdNot(String localIdNot) {
    this.localIdNot = localIdNot;
  }


  public BackupPlanExecutionWhereInput localIdNotContains(String localIdNotContains) {
    
    this.localIdNotContains = localIdNotContains;
    return this;
  }

   /**
   * Get localIdNotContains
   * @return localIdNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdNotContains() {
    return localIdNotContains;
  }


  public void setLocalIdNotContains(String localIdNotContains) {
    this.localIdNotContains = localIdNotContains;
  }


  public BackupPlanExecutionWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
    this.localIdNotEndsWith = localIdNotEndsWith;
    return this;
  }

   /**
   * Get localIdNotEndsWith
   * @return localIdNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdNotEndsWith() {
    return localIdNotEndsWith;
  }


  public void setLocalIdNotEndsWith(String localIdNotEndsWith) {
    this.localIdNotEndsWith = localIdNotEndsWith;
  }


  public BackupPlanExecutionWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addLocalIdNotInItem(String localIdNotInItem) {
    if (this.localIdNotIn == null) {
      this.localIdNotIn = new ArrayList<String>();
    }
    this.localIdNotIn.add(localIdNotInItem);
    return this;
  }

   /**
   * Get localIdNotIn
   * @return localIdNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalIdNotIn() {
    return localIdNotIn;
  }


  public void setLocalIdNotIn(List<String> localIdNotIn) {
    this.localIdNotIn = localIdNotIn;
  }


  public BackupPlanExecutionWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
    this.localIdNotStartsWith = localIdNotStartsWith;
    return this;
  }

   /**
   * Get localIdNotStartsWith
   * @return localIdNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdNotStartsWith() {
    return localIdNotStartsWith;
  }


  public void setLocalIdNotStartsWith(String localIdNotStartsWith) {
    this.localIdNotStartsWith = localIdNotStartsWith;
  }


  public BackupPlanExecutionWhereInput localIdStartsWith(String localIdStartsWith) {
    
    this.localIdStartsWith = localIdStartsWith;
    return this;
  }

   /**
   * Get localIdStartsWith
   * @return localIdStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdStartsWith() {
    return localIdStartsWith;
  }


  public void setLocalIdStartsWith(String localIdStartsWith) {
    this.localIdStartsWith = localIdStartsWith;
  }


  public BackupPlanExecutionWhereInput method(BackupExecutionMethod method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupExecutionMethod getMethod() {
    return method;
  }


  public void setMethod(BackupExecutionMethod method) {
    this.method = method;
  }


  public BackupPlanExecutionWhereInput methodIn(List<BackupExecutionMethod> methodIn) {
    
    this.methodIn = methodIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addMethodInItem(BackupExecutionMethod methodInItem) {
    if (this.methodIn == null) {
      this.methodIn = new ArrayList<BackupExecutionMethod>();
    }
    this.methodIn.add(methodInItem);
    return this;
  }

   /**
   * Get methodIn
   * @return methodIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BackupExecutionMethod> getMethodIn() {
    return methodIn;
  }


  public void setMethodIn(List<BackupExecutionMethod> methodIn) {
    this.methodIn = methodIn;
  }


  public BackupPlanExecutionWhereInput methodNot(BackupExecutionMethod methodNot) {
    
    this.methodNot = methodNot;
    return this;
  }

   /**
   * Get methodNot
   * @return methodNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupExecutionMethod getMethodNot() {
    return methodNot;
  }


  public void setMethodNot(BackupExecutionMethod methodNot) {
    this.methodNot = methodNot;
  }


  public BackupPlanExecutionWhereInput methodNotIn(List<BackupExecutionMethod> methodNotIn) {
    
    this.methodNotIn = methodNotIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addMethodNotInItem(BackupExecutionMethod methodNotInItem) {
    if (this.methodNotIn == null) {
      this.methodNotIn = new ArrayList<BackupExecutionMethod>();
    }
    this.methodNotIn.add(methodNotInItem);
    return this;
  }

   /**
   * Get methodNotIn
   * @return methodNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BackupExecutionMethod> getMethodNotIn() {
    return methodNotIn;
  }


  public void setMethodNotIn(List<BackupExecutionMethod> methodNotIn) {
    this.methodNotIn = methodNotIn;
  }


  public BackupPlanExecutionWhereInput state(BackupPlanExecutionState state) {
    
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


  public BackupPlanExecutionWhereInput stateIn(List<BackupPlanExecutionState> stateIn) {
    
    this.stateIn = stateIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addStateInItem(BackupPlanExecutionState stateInItem) {
    if (this.stateIn == null) {
      this.stateIn = new ArrayList<BackupPlanExecutionState>();
    }
    this.stateIn.add(stateInItem);
    return this;
  }

   /**
   * Get stateIn
   * @return stateIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BackupPlanExecutionState> getStateIn() {
    return stateIn;
  }


  public void setStateIn(List<BackupPlanExecutionState> stateIn) {
    this.stateIn = stateIn;
  }


  public BackupPlanExecutionWhereInput stateNot(BackupPlanExecutionState stateNot) {
    
    this.stateNot = stateNot;
    return this;
  }

   /**
   * Get stateNot
   * @return stateNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupPlanExecutionState getStateNot() {
    return stateNot;
  }


  public void setStateNot(BackupPlanExecutionState stateNot) {
    this.stateNot = stateNot;
  }


  public BackupPlanExecutionWhereInput stateNotIn(List<BackupPlanExecutionState> stateNotIn) {
    
    this.stateNotIn = stateNotIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addStateNotInItem(BackupPlanExecutionState stateNotInItem) {
    if (this.stateNotIn == null) {
      this.stateNotIn = new ArrayList<BackupPlanExecutionState>();
    }
    this.stateNotIn.add(stateNotInItem);
    return this;
  }

   /**
   * Get stateNotIn
   * @return stateNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BackupPlanExecutionState> getStateNotIn() {
    return stateNotIn;
  }


  public void setStateNotIn(List<BackupPlanExecutionState> stateNotIn) {
    this.stateNotIn = stateNotIn;
  }


  public BackupPlanExecutionWhereInput status(BackupPlanExecutionStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupPlanExecutionStatus getStatus() {
    return status;
  }


  public void setStatus(BackupPlanExecutionStatus status) {
    this.status = status;
  }


  public BackupPlanExecutionWhereInput statusIn(List<BackupPlanExecutionStatus> statusIn) {
    
    this.statusIn = statusIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addStatusInItem(BackupPlanExecutionStatus statusInItem) {
    if (this.statusIn == null) {
      this.statusIn = new ArrayList<BackupPlanExecutionStatus>();
    }
    this.statusIn.add(statusInItem);
    return this;
  }

   /**
   * Get statusIn
   * @return statusIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BackupPlanExecutionStatus> getStatusIn() {
    return statusIn;
  }


  public void setStatusIn(List<BackupPlanExecutionStatus> statusIn) {
    this.statusIn = statusIn;
  }


  public BackupPlanExecutionWhereInput statusNot(BackupPlanExecutionStatus statusNot) {
    
    this.statusNot = statusNot;
    return this;
  }

   /**
   * Get statusNot
   * @return statusNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupPlanExecutionStatus getStatusNot() {
    return statusNot;
  }


  public void setStatusNot(BackupPlanExecutionStatus statusNot) {
    this.statusNot = statusNot;
  }


  public BackupPlanExecutionWhereInput statusNotIn(List<BackupPlanExecutionStatus> statusNotIn) {
    
    this.statusNotIn = statusNotIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addStatusNotInItem(BackupPlanExecutionStatus statusNotInItem) {
    if (this.statusNotIn == null) {
      this.statusNotIn = new ArrayList<BackupPlanExecutionStatus>();
    }
    this.statusNotIn.add(statusNotInItem);
    return this;
  }

   /**
   * Get statusNotIn
   * @return statusNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BackupPlanExecutionStatus> getStatusNotIn() {
    return statusNotIn;
  }


  public void setStatusNotIn(List<BackupPlanExecutionStatus> statusNotIn) {
    this.statusNotIn = statusNotIn;
  }


  public BackupPlanExecutionWhereInput successJobCount(Integer successJobCount) {
    
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


  public BackupPlanExecutionWhereInput successJobCountGt(Integer successJobCountGt) {
    
    this.successJobCountGt = successJobCountGt;
    return this;
  }

   /**
   * Get successJobCountGt
   * @return successJobCountGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuccessJobCountGt() {
    return successJobCountGt;
  }


  public void setSuccessJobCountGt(Integer successJobCountGt) {
    this.successJobCountGt = successJobCountGt;
  }


  public BackupPlanExecutionWhereInput successJobCountGte(Integer successJobCountGte) {
    
    this.successJobCountGte = successJobCountGte;
    return this;
  }

   /**
   * Get successJobCountGte
   * @return successJobCountGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuccessJobCountGte() {
    return successJobCountGte;
  }


  public void setSuccessJobCountGte(Integer successJobCountGte) {
    this.successJobCountGte = successJobCountGte;
  }


  public BackupPlanExecutionWhereInput successJobCountIn(List<Integer> successJobCountIn) {
    
    this.successJobCountIn = successJobCountIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addSuccessJobCountInItem(Integer successJobCountInItem) {
    if (this.successJobCountIn == null) {
      this.successJobCountIn = new ArrayList<Integer>();
    }
    this.successJobCountIn.add(successJobCountInItem);
    return this;
  }

   /**
   * Get successJobCountIn
   * @return successJobCountIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getSuccessJobCountIn() {
    return successJobCountIn;
  }


  public void setSuccessJobCountIn(List<Integer> successJobCountIn) {
    this.successJobCountIn = successJobCountIn;
  }


  public BackupPlanExecutionWhereInput successJobCountLt(Integer successJobCountLt) {
    
    this.successJobCountLt = successJobCountLt;
    return this;
  }

   /**
   * Get successJobCountLt
   * @return successJobCountLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuccessJobCountLt() {
    return successJobCountLt;
  }


  public void setSuccessJobCountLt(Integer successJobCountLt) {
    this.successJobCountLt = successJobCountLt;
  }


  public BackupPlanExecutionWhereInput successJobCountLte(Integer successJobCountLte) {
    
    this.successJobCountLte = successJobCountLte;
    return this;
  }

   /**
   * Get successJobCountLte
   * @return successJobCountLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuccessJobCountLte() {
    return successJobCountLte;
  }


  public void setSuccessJobCountLte(Integer successJobCountLte) {
    this.successJobCountLte = successJobCountLte;
  }


  public BackupPlanExecutionWhereInput successJobCountNot(Integer successJobCountNot) {
    
    this.successJobCountNot = successJobCountNot;
    return this;
  }

   /**
   * Get successJobCountNot
   * @return successJobCountNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuccessJobCountNot() {
    return successJobCountNot;
  }


  public void setSuccessJobCountNot(Integer successJobCountNot) {
    this.successJobCountNot = successJobCountNot;
  }


  public BackupPlanExecutionWhereInput successJobCountNotIn(List<Integer> successJobCountNotIn) {
    
    this.successJobCountNotIn = successJobCountNotIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addSuccessJobCountNotInItem(Integer successJobCountNotInItem) {
    if (this.successJobCountNotIn == null) {
      this.successJobCountNotIn = new ArrayList<Integer>();
    }
    this.successJobCountNotIn.add(successJobCountNotInItem);
    return this;
  }

   /**
   * Get successJobCountNotIn
   * @return successJobCountNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getSuccessJobCountNotIn() {
    return successJobCountNotIn;
  }


  public void setSuccessJobCountNotIn(List<Integer> successJobCountNotIn) {
    this.successJobCountNotIn = successJobCountNotIn;
  }


  public BackupPlanExecutionWhereInput totalJobCount(Integer totalJobCount) {
    
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


  public BackupPlanExecutionWhereInput totalJobCountGt(Integer totalJobCountGt) {
    
    this.totalJobCountGt = totalJobCountGt;
    return this;
  }

   /**
   * Get totalJobCountGt
   * @return totalJobCountGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalJobCountGt() {
    return totalJobCountGt;
  }


  public void setTotalJobCountGt(Integer totalJobCountGt) {
    this.totalJobCountGt = totalJobCountGt;
  }


  public BackupPlanExecutionWhereInput totalJobCountGte(Integer totalJobCountGte) {
    
    this.totalJobCountGte = totalJobCountGte;
    return this;
  }

   /**
   * Get totalJobCountGte
   * @return totalJobCountGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalJobCountGte() {
    return totalJobCountGte;
  }


  public void setTotalJobCountGte(Integer totalJobCountGte) {
    this.totalJobCountGte = totalJobCountGte;
  }


  public BackupPlanExecutionWhereInput totalJobCountIn(List<Integer> totalJobCountIn) {
    
    this.totalJobCountIn = totalJobCountIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addTotalJobCountInItem(Integer totalJobCountInItem) {
    if (this.totalJobCountIn == null) {
      this.totalJobCountIn = new ArrayList<Integer>();
    }
    this.totalJobCountIn.add(totalJobCountInItem);
    return this;
  }

   /**
   * Get totalJobCountIn
   * @return totalJobCountIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getTotalJobCountIn() {
    return totalJobCountIn;
  }


  public void setTotalJobCountIn(List<Integer> totalJobCountIn) {
    this.totalJobCountIn = totalJobCountIn;
  }


  public BackupPlanExecutionWhereInput totalJobCountLt(Integer totalJobCountLt) {
    
    this.totalJobCountLt = totalJobCountLt;
    return this;
  }

   /**
   * Get totalJobCountLt
   * @return totalJobCountLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalJobCountLt() {
    return totalJobCountLt;
  }


  public void setTotalJobCountLt(Integer totalJobCountLt) {
    this.totalJobCountLt = totalJobCountLt;
  }


  public BackupPlanExecutionWhereInput totalJobCountLte(Integer totalJobCountLte) {
    
    this.totalJobCountLte = totalJobCountLte;
    return this;
  }

   /**
   * Get totalJobCountLte
   * @return totalJobCountLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalJobCountLte() {
    return totalJobCountLte;
  }


  public void setTotalJobCountLte(Integer totalJobCountLte) {
    this.totalJobCountLte = totalJobCountLte;
  }


  public BackupPlanExecutionWhereInput totalJobCountNot(Integer totalJobCountNot) {
    
    this.totalJobCountNot = totalJobCountNot;
    return this;
  }

   /**
   * Get totalJobCountNot
   * @return totalJobCountNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalJobCountNot() {
    return totalJobCountNot;
  }


  public void setTotalJobCountNot(Integer totalJobCountNot) {
    this.totalJobCountNot = totalJobCountNot;
  }


  public BackupPlanExecutionWhereInput totalJobCountNotIn(List<Integer> totalJobCountNotIn) {
    
    this.totalJobCountNotIn = totalJobCountNotIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addTotalJobCountNotInItem(Integer totalJobCountNotInItem) {
    if (this.totalJobCountNotIn == null) {
      this.totalJobCountNotIn = new ArrayList<Integer>();
    }
    this.totalJobCountNotIn.add(totalJobCountNotInItem);
    return this;
  }

   /**
   * Get totalJobCountNotIn
   * @return totalJobCountNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getTotalJobCountNotIn() {
    return totalJobCountNotIn;
  }


  public void setTotalJobCountNotIn(List<Integer> totalJobCountNotIn) {
    this.totalJobCountNotIn = totalJobCountNotIn;
  }


  public BackupPlanExecutionWhereInput type(BackupExecutionType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupExecutionType getType() {
    return type;
  }


  public void setType(BackupExecutionType type) {
    this.type = type;
  }


  public BackupPlanExecutionWhereInput typeIn(List<BackupExecutionType> typeIn) {
    
    this.typeIn = typeIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addTypeInItem(BackupExecutionType typeInItem) {
    if (this.typeIn == null) {
      this.typeIn = new ArrayList<BackupExecutionType>();
    }
    this.typeIn.add(typeInItem);
    return this;
  }

   /**
   * Get typeIn
   * @return typeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BackupExecutionType> getTypeIn() {
    return typeIn;
  }


  public void setTypeIn(List<BackupExecutionType> typeIn) {
    this.typeIn = typeIn;
  }


  public BackupPlanExecutionWhereInput typeNot(BackupExecutionType typeNot) {
    
    this.typeNot = typeNot;
    return this;
  }

   /**
   * Get typeNot
   * @return typeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupExecutionType getTypeNot() {
    return typeNot;
  }


  public void setTypeNot(BackupExecutionType typeNot) {
    this.typeNot = typeNot;
  }


  public BackupPlanExecutionWhereInput typeNotIn(List<BackupExecutionType> typeNotIn) {
    
    this.typeNotIn = typeNotIn;
    return this;
  }

  public BackupPlanExecutionWhereInput addTypeNotInItem(BackupExecutionType typeNotInItem) {
    if (this.typeNotIn == null) {
      this.typeNotIn = new ArrayList<BackupExecutionType>();
    }
    this.typeNotIn.add(typeNotInItem);
    return this;
  }

   /**
   * Get typeNotIn
   * @return typeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BackupExecutionType> getTypeNotIn() {
    return typeNotIn;
  }


  public void setTypeNotIn(List<BackupExecutionType> typeNotIn) {
    this.typeNotIn = typeNotIn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupPlanExecutionWhereInput backupPlanExecutionWhereInput = (BackupPlanExecutionWhereInput) o;
    return Objects.equals(this.AND, backupPlanExecutionWhereInput.AND) &&
        Objects.equals(this.NOT, backupPlanExecutionWhereInput.NOT) &&
        Objects.equals(this.OR, backupPlanExecutionWhereInput.OR) &&
        Objects.equals(this.backupPlan, backupPlanExecutionWhereInput.backupPlan) &&
        Objects.equals(this.deletableFlagMarked, backupPlanExecutionWhereInput.deletableFlagMarked) &&
        Objects.equals(this.deletableFlagMarkedNot, backupPlanExecutionWhereInput.deletableFlagMarkedNot) &&
        Objects.equals(this.duration, backupPlanExecutionWhereInput.duration) &&
        Objects.equals(this.durationGt, backupPlanExecutionWhereInput.durationGt) &&
        Objects.equals(this.durationGte, backupPlanExecutionWhereInput.durationGte) &&
        Objects.equals(this.durationIn, backupPlanExecutionWhereInput.durationIn) &&
        Objects.equals(this.durationLt, backupPlanExecutionWhereInput.durationLt) &&
        Objects.equals(this.durationLte, backupPlanExecutionWhereInput.durationLte) &&
        Objects.equals(this.durationNot, backupPlanExecutionWhereInput.durationNot) &&
        Objects.equals(this.durationNotIn, backupPlanExecutionWhereInput.durationNotIn) &&
        Objects.equals(this.entityAsyncStatus, backupPlanExecutionWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, backupPlanExecutionWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, backupPlanExecutionWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, backupPlanExecutionWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.executedAt, backupPlanExecutionWhereInput.executedAt) &&
        Objects.equals(this.executedAtGt, backupPlanExecutionWhereInput.executedAtGt) &&
        Objects.equals(this.executedAtGte, backupPlanExecutionWhereInput.executedAtGte) &&
        Objects.equals(this.executedAtIn, backupPlanExecutionWhereInput.executedAtIn) &&
        Objects.equals(this.executedAtLt, backupPlanExecutionWhereInput.executedAtLt) &&
        Objects.equals(this.executedAtLte, backupPlanExecutionWhereInput.executedAtLte) &&
        Objects.equals(this.executedAtNot, backupPlanExecutionWhereInput.executedAtNot) &&
        Objects.equals(this.executedAtNotIn, backupPlanExecutionWhereInput.executedAtNotIn) &&
        Objects.equals(this.id, backupPlanExecutionWhereInput.id) &&
        Objects.equals(this.idContains, backupPlanExecutionWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, backupPlanExecutionWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, backupPlanExecutionWhereInput.idGt) &&
        Objects.equals(this.idGte, backupPlanExecutionWhereInput.idGte) &&
        Objects.equals(this.idIn, backupPlanExecutionWhereInput.idIn) &&
        Objects.equals(this.idLt, backupPlanExecutionWhereInput.idLt) &&
        Objects.equals(this.idLte, backupPlanExecutionWhereInput.idLte) &&
        Objects.equals(this.idNot, backupPlanExecutionWhereInput.idNot) &&
        Objects.equals(this.idNotContains, backupPlanExecutionWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, backupPlanExecutionWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, backupPlanExecutionWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, backupPlanExecutionWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, backupPlanExecutionWhereInput.idStartsWith) &&
        Objects.equals(this.localCreatedAt, backupPlanExecutionWhereInput.localCreatedAt) &&
        Objects.equals(this.localCreatedAtGt, backupPlanExecutionWhereInput.localCreatedAtGt) &&
        Objects.equals(this.localCreatedAtGte, backupPlanExecutionWhereInput.localCreatedAtGte) &&
        Objects.equals(this.localCreatedAtIn, backupPlanExecutionWhereInput.localCreatedAtIn) &&
        Objects.equals(this.localCreatedAtLt, backupPlanExecutionWhereInput.localCreatedAtLt) &&
        Objects.equals(this.localCreatedAtLte, backupPlanExecutionWhereInput.localCreatedAtLte) &&
        Objects.equals(this.localCreatedAtNot, backupPlanExecutionWhereInput.localCreatedAtNot) &&
        Objects.equals(this.localCreatedAtNotIn, backupPlanExecutionWhereInput.localCreatedAtNotIn) &&
        Objects.equals(this.localId, backupPlanExecutionWhereInput.localId) &&
        Objects.equals(this.localIdContains, backupPlanExecutionWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, backupPlanExecutionWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, backupPlanExecutionWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, backupPlanExecutionWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, backupPlanExecutionWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, backupPlanExecutionWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, backupPlanExecutionWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, backupPlanExecutionWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, backupPlanExecutionWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, backupPlanExecutionWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, backupPlanExecutionWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, backupPlanExecutionWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, backupPlanExecutionWhereInput.localIdStartsWith) &&
        Objects.equals(this.method, backupPlanExecutionWhereInput.method) &&
        Objects.equals(this.methodIn, backupPlanExecutionWhereInput.methodIn) &&
        Objects.equals(this.methodNot, backupPlanExecutionWhereInput.methodNot) &&
        Objects.equals(this.methodNotIn, backupPlanExecutionWhereInput.methodNotIn) &&
        Objects.equals(this.state, backupPlanExecutionWhereInput.state) &&
        Objects.equals(this.stateIn, backupPlanExecutionWhereInput.stateIn) &&
        Objects.equals(this.stateNot, backupPlanExecutionWhereInput.stateNot) &&
        Objects.equals(this.stateNotIn, backupPlanExecutionWhereInput.stateNotIn) &&
        Objects.equals(this.status, backupPlanExecutionWhereInput.status) &&
        Objects.equals(this.statusIn, backupPlanExecutionWhereInput.statusIn) &&
        Objects.equals(this.statusNot, backupPlanExecutionWhereInput.statusNot) &&
        Objects.equals(this.statusNotIn, backupPlanExecutionWhereInput.statusNotIn) &&
        Objects.equals(this.successJobCount, backupPlanExecutionWhereInput.successJobCount) &&
        Objects.equals(this.successJobCountGt, backupPlanExecutionWhereInput.successJobCountGt) &&
        Objects.equals(this.successJobCountGte, backupPlanExecutionWhereInput.successJobCountGte) &&
        Objects.equals(this.successJobCountIn, backupPlanExecutionWhereInput.successJobCountIn) &&
        Objects.equals(this.successJobCountLt, backupPlanExecutionWhereInput.successJobCountLt) &&
        Objects.equals(this.successJobCountLte, backupPlanExecutionWhereInput.successJobCountLte) &&
        Objects.equals(this.successJobCountNot, backupPlanExecutionWhereInput.successJobCountNot) &&
        Objects.equals(this.successJobCountNotIn, backupPlanExecutionWhereInput.successJobCountNotIn) &&
        Objects.equals(this.totalJobCount, backupPlanExecutionWhereInput.totalJobCount) &&
        Objects.equals(this.totalJobCountGt, backupPlanExecutionWhereInput.totalJobCountGt) &&
        Objects.equals(this.totalJobCountGte, backupPlanExecutionWhereInput.totalJobCountGte) &&
        Objects.equals(this.totalJobCountIn, backupPlanExecutionWhereInput.totalJobCountIn) &&
        Objects.equals(this.totalJobCountLt, backupPlanExecutionWhereInput.totalJobCountLt) &&
        Objects.equals(this.totalJobCountLte, backupPlanExecutionWhereInput.totalJobCountLte) &&
        Objects.equals(this.totalJobCountNot, backupPlanExecutionWhereInput.totalJobCountNot) &&
        Objects.equals(this.totalJobCountNotIn, backupPlanExecutionWhereInput.totalJobCountNotIn) &&
        Objects.equals(this.type, backupPlanExecutionWhereInput.type) &&
        Objects.equals(this.typeIn, backupPlanExecutionWhereInput.typeIn) &&
        Objects.equals(this.typeNot, backupPlanExecutionWhereInput.typeNot) &&
        Objects.equals(this.typeNotIn, backupPlanExecutionWhereInput.typeNotIn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, backupPlan, deletableFlagMarked, deletableFlagMarkedNot, duration, durationGt, durationGte, durationIn, durationLt, durationLte, durationNot, durationNotIn, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, executedAt, executedAtGt, executedAtGte, executedAtIn, executedAtLt, executedAtLte, executedAtNot, executedAtNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, localCreatedAt, localCreatedAtGt, localCreatedAtGte, localCreatedAtIn, localCreatedAtLt, localCreatedAtLte, localCreatedAtNot, localCreatedAtNotIn, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, method, methodIn, methodNot, methodNotIn, state, stateIn, stateNot, stateNotIn, status, statusIn, statusNot, statusNotIn, successJobCount, successJobCountGt, successJobCountGte, successJobCountIn, successJobCountLt, successJobCountLte, successJobCountNot, successJobCountNotIn, totalJobCount, totalJobCountGt, totalJobCountGte, totalJobCountIn, totalJobCountLt, totalJobCountLte, totalJobCountNot, totalJobCountNotIn, type, typeIn, typeNot, typeNotIn);
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
    sb.append("class BackupPlanExecutionWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    backupPlan: ").append(toIndentedString(backupPlan)).append("\n");
    sb.append("    deletableFlagMarked: ").append(toIndentedString(deletableFlagMarked)).append("\n");
    sb.append("    deletableFlagMarkedNot: ").append(toIndentedString(deletableFlagMarkedNot)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    durationGt: ").append(toIndentedString(durationGt)).append("\n");
    sb.append("    durationGte: ").append(toIndentedString(durationGte)).append("\n");
    sb.append("    durationIn: ").append(toIndentedString(durationIn)).append("\n");
    sb.append("    durationLt: ").append(toIndentedString(durationLt)).append("\n");
    sb.append("    durationLte: ").append(toIndentedString(durationLte)).append("\n");
    sb.append("    durationNot: ").append(toIndentedString(durationNot)).append("\n");
    sb.append("    durationNotIn: ").append(toIndentedString(durationNotIn)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    entityAsyncStatusIn: ").append(toIndentedString(entityAsyncStatusIn)).append("\n");
    sb.append("    entityAsyncStatusNot: ").append(toIndentedString(entityAsyncStatusNot)).append("\n");
    sb.append("    entityAsyncStatusNotIn: ").append(toIndentedString(entityAsyncStatusNotIn)).append("\n");
    sb.append("    executedAt: ").append(toIndentedString(executedAt)).append("\n");
    sb.append("    executedAtGt: ").append(toIndentedString(executedAtGt)).append("\n");
    sb.append("    executedAtGte: ").append(toIndentedString(executedAtGte)).append("\n");
    sb.append("    executedAtIn: ").append(toIndentedString(executedAtIn)).append("\n");
    sb.append("    executedAtLt: ").append(toIndentedString(executedAtLt)).append("\n");
    sb.append("    executedAtLte: ").append(toIndentedString(executedAtLte)).append("\n");
    sb.append("    executedAtNot: ").append(toIndentedString(executedAtNot)).append("\n");
    sb.append("    executedAtNotIn: ").append(toIndentedString(executedAtNotIn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idContains: ").append(toIndentedString(idContains)).append("\n");
    sb.append("    idEndsWith: ").append(toIndentedString(idEndsWith)).append("\n");
    sb.append("    idGt: ").append(toIndentedString(idGt)).append("\n");
    sb.append("    idGte: ").append(toIndentedString(idGte)).append("\n");
    sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
    sb.append("    idLt: ").append(toIndentedString(idLt)).append("\n");
    sb.append("    idLte: ").append(toIndentedString(idLte)).append("\n");
    sb.append("    idNot: ").append(toIndentedString(idNot)).append("\n");
    sb.append("    idNotContains: ").append(toIndentedString(idNotContains)).append("\n");
    sb.append("    idNotEndsWith: ").append(toIndentedString(idNotEndsWith)).append("\n");
    sb.append("    idNotIn: ").append(toIndentedString(idNotIn)).append("\n");
    sb.append("    idNotStartsWith: ").append(toIndentedString(idNotStartsWith)).append("\n");
    sb.append("    idStartsWith: ").append(toIndentedString(idStartsWith)).append("\n");
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    localCreatedAtGt: ").append(toIndentedString(localCreatedAtGt)).append("\n");
    sb.append("    localCreatedAtGte: ").append(toIndentedString(localCreatedAtGte)).append("\n");
    sb.append("    localCreatedAtIn: ").append(toIndentedString(localCreatedAtIn)).append("\n");
    sb.append("    localCreatedAtLt: ").append(toIndentedString(localCreatedAtLt)).append("\n");
    sb.append("    localCreatedAtLte: ").append(toIndentedString(localCreatedAtLte)).append("\n");
    sb.append("    localCreatedAtNot: ").append(toIndentedString(localCreatedAtNot)).append("\n");
    sb.append("    localCreatedAtNotIn: ").append(toIndentedString(localCreatedAtNotIn)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    localIdContains: ").append(toIndentedString(localIdContains)).append("\n");
    sb.append("    localIdEndsWith: ").append(toIndentedString(localIdEndsWith)).append("\n");
    sb.append("    localIdGt: ").append(toIndentedString(localIdGt)).append("\n");
    sb.append("    localIdGte: ").append(toIndentedString(localIdGte)).append("\n");
    sb.append("    localIdIn: ").append(toIndentedString(localIdIn)).append("\n");
    sb.append("    localIdLt: ").append(toIndentedString(localIdLt)).append("\n");
    sb.append("    localIdLte: ").append(toIndentedString(localIdLte)).append("\n");
    sb.append("    localIdNot: ").append(toIndentedString(localIdNot)).append("\n");
    sb.append("    localIdNotContains: ").append(toIndentedString(localIdNotContains)).append("\n");
    sb.append("    localIdNotEndsWith: ").append(toIndentedString(localIdNotEndsWith)).append("\n");
    sb.append("    localIdNotIn: ").append(toIndentedString(localIdNotIn)).append("\n");
    sb.append("    localIdNotStartsWith: ").append(toIndentedString(localIdNotStartsWith)).append("\n");
    sb.append("    localIdStartsWith: ").append(toIndentedString(localIdStartsWith)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    methodIn: ").append(toIndentedString(methodIn)).append("\n");
    sb.append("    methodNot: ").append(toIndentedString(methodNot)).append("\n");
    sb.append("    methodNotIn: ").append(toIndentedString(methodNotIn)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateIn: ").append(toIndentedString(stateIn)).append("\n");
    sb.append("    stateNot: ").append(toIndentedString(stateNot)).append("\n");
    sb.append("    stateNotIn: ").append(toIndentedString(stateNotIn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
    sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
    sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
    sb.append("    successJobCount: ").append(toIndentedString(successJobCount)).append("\n");
    sb.append("    successJobCountGt: ").append(toIndentedString(successJobCountGt)).append("\n");
    sb.append("    successJobCountGte: ").append(toIndentedString(successJobCountGte)).append("\n");
    sb.append("    successJobCountIn: ").append(toIndentedString(successJobCountIn)).append("\n");
    sb.append("    successJobCountLt: ").append(toIndentedString(successJobCountLt)).append("\n");
    sb.append("    successJobCountLte: ").append(toIndentedString(successJobCountLte)).append("\n");
    sb.append("    successJobCountNot: ").append(toIndentedString(successJobCountNot)).append("\n");
    sb.append("    successJobCountNotIn: ").append(toIndentedString(successJobCountNotIn)).append("\n");
    sb.append("    totalJobCount: ").append(toIndentedString(totalJobCount)).append("\n");
    sb.append("    totalJobCountGt: ").append(toIndentedString(totalJobCountGt)).append("\n");
    sb.append("    totalJobCountGte: ").append(toIndentedString(totalJobCountGte)).append("\n");
    sb.append("    totalJobCountIn: ").append(toIndentedString(totalJobCountIn)).append("\n");
    sb.append("    totalJobCountLt: ").append(toIndentedString(totalJobCountLt)).append("\n");
    sb.append("    totalJobCountLte: ").append(toIndentedString(totalJobCountLte)).append("\n");
    sb.append("    totalJobCountNot: ").append(toIndentedString(totalJobCountNot)).append("\n");
    sb.append("    totalJobCountNotIn: ").append(toIndentedString(totalJobCountNotIn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
    sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
    sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
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

