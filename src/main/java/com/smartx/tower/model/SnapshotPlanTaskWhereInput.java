package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.ClusterWhereInput;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.SnapshotGroupWhereInput;
import com.smartx.tower.model.SnapshotPlanExecuteStatus;
import com.smartx.tower.model.SnapshotPlanTaskType;
import com.smartx.tower.model.SnapshotPlanWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SnapshotPlanTaskWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class SnapshotPlanTaskWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<SnapshotPlanTaskWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<SnapshotPlanTaskWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<SnapshotPlanTaskWhereInput> OR = null;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private ClusterWhereInput cluster;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_END_TIME_GT = "end_time_gt";
  @SerializedName(SERIALIZED_NAME_END_TIME_GT)
  private String endTimeGt;

  public static final String SERIALIZED_NAME_END_TIME_GTE = "end_time_gte";
  @SerializedName(SERIALIZED_NAME_END_TIME_GTE)
  private String endTimeGte;

  public static final String SERIALIZED_NAME_END_TIME_IN = "end_time_in";
  @SerializedName(SERIALIZED_NAME_END_TIME_IN)
  private List<String> endTimeIn = null;

  public static final String SERIALIZED_NAME_END_TIME_LT = "end_time_lt";
  @SerializedName(SERIALIZED_NAME_END_TIME_LT)
  private String endTimeLt;

  public static final String SERIALIZED_NAME_END_TIME_LTE = "end_time_lte";
  @SerializedName(SERIALIZED_NAME_END_TIME_LTE)
  private String endTimeLte;

  public static final String SERIALIZED_NAME_END_TIME_NOT = "end_time_not";
  @SerializedName(SERIALIZED_NAME_END_TIME_NOT)
  private String endTimeNot;

  public static final String SERIALIZED_NAME_END_TIME_NOT_IN = "end_time_not_in";
  @SerializedName(SERIALIZED_NAME_END_TIME_NOT_IN)
  private List<String> endTimeNotIn = null;

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

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_INTERNAL_NOT = "internal_not";
  @SerializedName(SERIALIZED_NAME_INTERNAL_NOT)
  private Boolean internalNot;

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

  public static final String SERIALIZED_NAME_SNAPSHOT_GROUP = "snapshotGroup";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_GROUP)
  private SnapshotGroupWhereInput snapshotGroup;

  public static final String SERIALIZED_NAME_SNAPSHOT_PLAN = "snapshotPlan";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_PLAN)
  private SnapshotPlanWhereInput snapshotPlan;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_START_TIME_GT = "start_time_gt";
  @SerializedName(SERIALIZED_NAME_START_TIME_GT)
  private String startTimeGt;

  public static final String SERIALIZED_NAME_START_TIME_GTE = "start_time_gte";
  @SerializedName(SERIALIZED_NAME_START_TIME_GTE)
  private String startTimeGte;

  public static final String SERIALIZED_NAME_START_TIME_IN = "start_time_in";
  @SerializedName(SERIALIZED_NAME_START_TIME_IN)
  private List<String> startTimeIn = null;

  public static final String SERIALIZED_NAME_START_TIME_LT = "start_time_lt";
  @SerializedName(SERIALIZED_NAME_START_TIME_LT)
  private String startTimeLt;

  public static final String SERIALIZED_NAME_START_TIME_LTE = "start_time_lte";
  @SerializedName(SERIALIZED_NAME_START_TIME_LTE)
  private String startTimeLte;

  public static final String SERIALIZED_NAME_START_TIME_NOT = "start_time_not";
  @SerializedName(SERIALIZED_NAME_START_TIME_NOT)
  private String startTimeNot;

  public static final String SERIALIZED_NAME_START_TIME_NOT_IN = "start_time_not_in";
  @SerializedName(SERIALIZED_NAME_START_TIME_NOT_IN)
  private List<String> startTimeNotIn = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private SnapshotPlanExecuteStatus status;

  public static final String SERIALIZED_NAME_STATUS_IN = "status_in";
  @SerializedName(SERIALIZED_NAME_STATUS_IN)
  private List<SnapshotPlanExecuteStatus> statusIn = null;

  public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";
  @SerializedName(SERIALIZED_NAME_STATUS_NOT)
  private SnapshotPlanExecuteStatus statusNot;

  public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";
  @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
  private List<SnapshotPlanExecuteStatus> statusNotIn = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private SnapshotPlanTaskType type;

  public static final String SERIALIZED_NAME_TYPE_IN = "type_in";
  @SerializedName(SERIALIZED_NAME_TYPE_IN)
  private List<SnapshotPlanTaskType> typeIn = null;

  public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";
  @SerializedName(SERIALIZED_NAME_TYPE_NOT)
  private SnapshotPlanTaskType typeNot;

  public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";
  @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
  private List<SnapshotPlanTaskType> typeNotIn = null;

  public SnapshotPlanTaskWhereInput() { 
  }

  public SnapshotPlanTaskWhereInput AND(List<SnapshotPlanTaskWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public SnapshotPlanTaskWhereInput addANDItem(SnapshotPlanTaskWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<SnapshotPlanTaskWhereInput>();
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

  public List<SnapshotPlanTaskWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<SnapshotPlanTaskWhereInput> AND) {
    this.AND = AND;
  }


  public SnapshotPlanTaskWhereInput NOT(List<SnapshotPlanTaskWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public SnapshotPlanTaskWhereInput addNOTItem(SnapshotPlanTaskWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<SnapshotPlanTaskWhereInput>();
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

  public List<SnapshotPlanTaskWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<SnapshotPlanTaskWhereInput> NOT) {
    this.NOT = NOT;
  }


  public SnapshotPlanTaskWhereInput OR(List<SnapshotPlanTaskWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public SnapshotPlanTaskWhereInput addORItem(SnapshotPlanTaskWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<SnapshotPlanTaskWhereInput>();
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

  public List<SnapshotPlanTaskWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<SnapshotPlanTaskWhereInput> OR) {
    this.OR = OR;
  }


  public SnapshotPlanTaskWhereInput cluster(ClusterWhereInput cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterWhereInput getCluster() {
    return cluster;
  }


  public void setCluster(ClusterWhereInput cluster) {
    this.cluster = cluster;
  }


  public SnapshotPlanTaskWhereInput endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public SnapshotPlanTaskWhereInput endTimeGt(String endTimeGt) {
    
    this.endTimeGt = endTimeGt;
    return this;
  }

   /**
   * Get endTimeGt
   * @return endTimeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndTimeGt() {
    return endTimeGt;
  }


  public void setEndTimeGt(String endTimeGt) {
    this.endTimeGt = endTimeGt;
  }


  public SnapshotPlanTaskWhereInput endTimeGte(String endTimeGte) {
    
    this.endTimeGte = endTimeGte;
    return this;
  }

   /**
   * Get endTimeGte
   * @return endTimeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndTimeGte() {
    return endTimeGte;
  }


  public void setEndTimeGte(String endTimeGte) {
    this.endTimeGte = endTimeGte;
  }


  public SnapshotPlanTaskWhereInput endTimeIn(List<String> endTimeIn) {
    
    this.endTimeIn = endTimeIn;
    return this;
  }

  public SnapshotPlanTaskWhereInput addEndTimeInItem(String endTimeInItem) {
    if (this.endTimeIn == null) {
      this.endTimeIn = new ArrayList<String>();
    }
    this.endTimeIn.add(endTimeInItem);
    return this;
  }

   /**
   * Get endTimeIn
   * @return endTimeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEndTimeIn() {
    return endTimeIn;
  }


  public void setEndTimeIn(List<String> endTimeIn) {
    this.endTimeIn = endTimeIn;
  }


  public SnapshotPlanTaskWhereInput endTimeLt(String endTimeLt) {
    
    this.endTimeLt = endTimeLt;
    return this;
  }

   /**
   * Get endTimeLt
   * @return endTimeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndTimeLt() {
    return endTimeLt;
  }


  public void setEndTimeLt(String endTimeLt) {
    this.endTimeLt = endTimeLt;
  }


  public SnapshotPlanTaskWhereInput endTimeLte(String endTimeLte) {
    
    this.endTimeLte = endTimeLte;
    return this;
  }

   /**
   * Get endTimeLte
   * @return endTimeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndTimeLte() {
    return endTimeLte;
  }


  public void setEndTimeLte(String endTimeLte) {
    this.endTimeLte = endTimeLte;
  }


  public SnapshotPlanTaskWhereInput endTimeNot(String endTimeNot) {
    
    this.endTimeNot = endTimeNot;
    return this;
  }

   /**
   * Get endTimeNot
   * @return endTimeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndTimeNot() {
    return endTimeNot;
  }


  public void setEndTimeNot(String endTimeNot) {
    this.endTimeNot = endTimeNot;
  }


  public SnapshotPlanTaskWhereInput endTimeNotIn(List<String> endTimeNotIn) {
    
    this.endTimeNotIn = endTimeNotIn;
    return this;
  }

  public SnapshotPlanTaskWhereInput addEndTimeNotInItem(String endTimeNotInItem) {
    if (this.endTimeNotIn == null) {
      this.endTimeNotIn = new ArrayList<String>();
    }
    this.endTimeNotIn.add(endTimeNotInItem);
    return this;
  }

   /**
   * Get endTimeNotIn
   * @return endTimeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEndTimeNotIn() {
    return endTimeNotIn;
  }


  public void setEndTimeNotIn(List<String> endTimeNotIn) {
    this.endTimeNotIn = endTimeNotIn;
  }


  public SnapshotPlanTaskWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public SnapshotPlanTaskWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public SnapshotPlanTaskWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public SnapshotPlanTaskWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public SnapshotPlanTaskWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public SnapshotPlanTaskWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public SnapshotPlanTaskWhereInput id(String id) {
    
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


  public SnapshotPlanTaskWhereInput idContains(String idContains) {
    
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


  public SnapshotPlanTaskWhereInput idEndsWith(String idEndsWith) {
    
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


  public SnapshotPlanTaskWhereInput idGt(String idGt) {
    
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


  public SnapshotPlanTaskWhereInput idGte(String idGte) {
    
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


  public SnapshotPlanTaskWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public SnapshotPlanTaskWhereInput addIdInItem(String idInItem) {
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


  public SnapshotPlanTaskWhereInput idLt(String idLt) {
    
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


  public SnapshotPlanTaskWhereInput idLte(String idLte) {
    
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


  public SnapshotPlanTaskWhereInput idNot(String idNot) {
    
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


  public SnapshotPlanTaskWhereInput idNotContains(String idNotContains) {
    
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


  public SnapshotPlanTaskWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public SnapshotPlanTaskWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public SnapshotPlanTaskWhereInput addIdNotInItem(String idNotInItem) {
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


  public SnapshotPlanTaskWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public SnapshotPlanTaskWhereInput idStartsWith(String idStartsWith) {
    
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


  public SnapshotPlanTaskWhereInput internal(Boolean internal) {
    
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


  public SnapshotPlanTaskWhereInput internalNot(Boolean internalNot) {
    
    this.internalNot = internalNot;
    return this;
  }

   /**
   * Get internalNot
   * @return internalNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInternalNot() {
    return internalNot;
  }


  public void setInternalNot(Boolean internalNot) {
    this.internalNot = internalNot;
  }


  public SnapshotPlanTaskWhereInput localId(String localId) {
    
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


  public SnapshotPlanTaskWhereInput localIdContains(String localIdContains) {
    
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


  public SnapshotPlanTaskWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public SnapshotPlanTaskWhereInput localIdGt(String localIdGt) {
    
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


  public SnapshotPlanTaskWhereInput localIdGte(String localIdGte) {
    
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


  public SnapshotPlanTaskWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public SnapshotPlanTaskWhereInput addLocalIdInItem(String localIdInItem) {
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


  public SnapshotPlanTaskWhereInput localIdLt(String localIdLt) {
    
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


  public SnapshotPlanTaskWhereInput localIdLte(String localIdLte) {
    
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


  public SnapshotPlanTaskWhereInput localIdNot(String localIdNot) {
    
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


  public SnapshotPlanTaskWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public SnapshotPlanTaskWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public SnapshotPlanTaskWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public SnapshotPlanTaskWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public SnapshotPlanTaskWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public SnapshotPlanTaskWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public SnapshotPlanTaskWhereInput snapshotGroup(SnapshotGroupWhereInput snapshotGroup) {
    
    this.snapshotGroup = snapshotGroup;
    return this;
  }

   /**
   * Get snapshotGroup
   * @return snapshotGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SnapshotGroupWhereInput getSnapshotGroup() {
    return snapshotGroup;
  }


  public void setSnapshotGroup(SnapshotGroupWhereInput snapshotGroup) {
    this.snapshotGroup = snapshotGroup;
  }


  public SnapshotPlanTaskWhereInput snapshotPlan(SnapshotPlanWhereInput snapshotPlan) {
    
    this.snapshotPlan = snapshotPlan;
    return this;
  }

   /**
   * Get snapshotPlan
   * @return snapshotPlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SnapshotPlanWhereInput getSnapshotPlan() {
    return snapshotPlan;
  }


  public void setSnapshotPlan(SnapshotPlanWhereInput snapshotPlan) {
    this.snapshotPlan = snapshotPlan;
  }


  public SnapshotPlanTaskWhereInput startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public SnapshotPlanTaskWhereInput startTimeGt(String startTimeGt) {
    
    this.startTimeGt = startTimeGt;
    return this;
  }

   /**
   * Get startTimeGt
   * @return startTimeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartTimeGt() {
    return startTimeGt;
  }


  public void setStartTimeGt(String startTimeGt) {
    this.startTimeGt = startTimeGt;
  }


  public SnapshotPlanTaskWhereInput startTimeGte(String startTimeGte) {
    
    this.startTimeGte = startTimeGte;
    return this;
  }

   /**
   * Get startTimeGte
   * @return startTimeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartTimeGte() {
    return startTimeGte;
  }


  public void setStartTimeGte(String startTimeGte) {
    this.startTimeGte = startTimeGte;
  }


  public SnapshotPlanTaskWhereInput startTimeIn(List<String> startTimeIn) {
    
    this.startTimeIn = startTimeIn;
    return this;
  }

  public SnapshotPlanTaskWhereInput addStartTimeInItem(String startTimeInItem) {
    if (this.startTimeIn == null) {
      this.startTimeIn = new ArrayList<String>();
    }
    this.startTimeIn.add(startTimeInItem);
    return this;
  }

   /**
   * Get startTimeIn
   * @return startTimeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getStartTimeIn() {
    return startTimeIn;
  }


  public void setStartTimeIn(List<String> startTimeIn) {
    this.startTimeIn = startTimeIn;
  }


  public SnapshotPlanTaskWhereInput startTimeLt(String startTimeLt) {
    
    this.startTimeLt = startTimeLt;
    return this;
  }

   /**
   * Get startTimeLt
   * @return startTimeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartTimeLt() {
    return startTimeLt;
  }


  public void setStartTimeLt(String startTimeLt) {
    this.startTimeLt = startTimeLt;
  }


  public SnapshotPlanTaskWhereInput startTimeLte(String startTimeLte) {
    
    this.startTimeLte = startTimeLte;
    return this;
  }

   /**
   * Get startTimeLte
   * @return startTimeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartTimeLte() {
    return startTimeLte;
  }


  public void setStartTimeLte(String startTimeLte) {
    this.startTimeLte = startTimeLte;
  }


  public SnapshotPlanTaskWhereInput startTimeNot(String startTimeNot) {
    
    this.startTimeNot = startTimeNot;
    return this;
  }

   /**
   * Get startTimeNot
   * @return startTimeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartTimeNot() {
    return startTimeNot;
  }


  public void setStartTimeNot(String startTimeNot) {
    this.startTimeNot = startTimeNot;
  }


  public SnapshotPlanTaskWhereInput startTimeNotIn(List<String> startTimeNotIn) {
    
    this.startTimeNotIn = startTimeNotIn;
    return this;
  }

  public SnapshotPlanTaskWhereInput addStartTimeNotInItem(String startTimeNotInItem) {
    if (this.startTimeNotIn == null) {
      this.startTimeNotIn = new ArrayList<String>();
    }
    this.startTimeNotIn.add(startTimeNotInItem);
    return this;
  }

   /**
   * Get startTimeNotIn
   * @return startTimeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getStartTimeNotIn() {
    return startTimeNotIn;
  }


  public void setStartTimeNotIn(List<String> startTimeNotIn) {
    this.startTimeNotIn = startTimeNotIn;
  }


  public SnapshotPlanTaskWhereInput status(SnapshotPlanExecuteStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SnapshotPlanExecuteStatus getStatus() {
    return status;
  }


  public void setStatus(SnapshotPlanExecuteStatus status) {
    this.status = status;
  }


  public SnapshotPlanTaskWhereInput statusIn(List<SnapshotPlanExecuteStatus> statusIn) {
    
    this.statusIn = statusIn;
    return this;
  }

  public SnapshotPlanTaskWhereInput addStatusInItem(SnapshotPlanExecuteStatus statusInItem) {
    if (this.statusIn == null) {
      this.statusIn = new ArrayList<SnapshotPlanExecuteStatus>();
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

  public List<SnapshotPlanExecuteStatus> getStatusIn() {
    return statusIn;
  }


  public void setStatusIn(List<SnapshotPlanExecuteStatus> statusIn) {
    this.statusIn = statusIn;
  }


  public SnapshotPlanTaskWhereInput statusNot(SnapshotPlanExecuteStatus statusNot) {
    
    this.statusNot = statusNot;
    return this;
  }

   /**
   * Get statusNot
   * @return statusNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SnapshotPlanExecuteStatus getStatusNot() {
    return statusNot;
  }


  public void setStatusNot(SnapshotPlanExecuteStatus statusNot) {
    this.statusNot = statusNot;
  }


  public SnapshotPlanTaskWhereInput statusNotIn(List<SnapshotPlanExecuteStatus> statusNotIn) {
    
    this.statusNotIn = statusNotIn;
    return this;
  }

  public SnapshotPlanTaskWhereInput addStatusNotInItem(SnapshotPlanExecuteStatus statusNotInItem) {
    if (this.statusNotIn == null) {
      this.statusNotIn = new ArrayList<SnapshotPlanExecuteStatus>();
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

  public List<SnapshotPlanExecuteStatus> getStatusNotIn() {
    return statusNotIn;
  }


  public void setStatusNotIn(List<SnapshotPlanExecuteStatus> statusNotIn) {
    this.statusNotIn = statusNotIn;
  }


  public SnapshotPlanTaskWhereInput type(SnapshotPlanTaskType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SnapshotPlanTaskType getType() {
    return type;
  }


  public void setType(SnapshotPlanTaskType type) {
    this.type = type;
  }


  public SnapshotPlanTaskWhereInput typeIn(List<SnapshotPlanTaskType> typeIn) {
    
    this.typeIn = typeIn;
    return this;
  }

  public SnapshotPlanTaskWhereInput addTypeInItem(SnapshotPlanTaskType typeInItem) {
    if (this.typeIn == null) {
      this.typeIn = new ArrayList<SnapshotPlanTaskType>();
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

  public List<SnapshotPlanTaskType> getTypeIn() {
    return typeIn;
  }


  public void setTypeIn(List<SnapshotPlanTaskType> typeIn) {
    this.typeIn = typeIn;
  }


  public SnapshotPlanTaskWhereInput typeNot(SnapshotPlanTaskType typeNot) {
    
    this.typeNot = typeNot;
    return this;
  }

   /**
   * Get typeNot
   * @return typeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SnapshotPlanTaskType getTypeNot() {
    return typeNot;
  }


  public void setTypeNot(SnapshotPlanTaskType typeNot) {
    this.typeNot = typeNot;
  }


  public SnapshotPlanTaskWhereInput typeNotIn(List<SnapshotPlanTaskType> typeNotIn) {
    
    this.typeNotIn = typeNotIn;
    return this;
  }

  public SnapshotPlanTaskWhereInput addTypeNotInItem(SnapshotPlanTaskType typeNotInItem) {
    if (this.typeNotIn == null) {
      this.typeNotIn = new ArrayList<SnapshotPlanTaskType>();
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

  public List<SnapshotPlanTaskType> getTypeNotIn() {
    return typeNotIn;
  }


  public void setTypeNotIn(List<SnapshotPlanTaskType> typeNotIn) {
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
    SnapshotPlanTaskWhereInput snapshotPlanTaskWhereInput = (SnapshotPlanTaskWhereInput) o;
    return Objects.equals(this.AND, snapshotPlanTaskWhereInput.AND) &&
        Objects.equals(this.NOT, snapshotPlanTaskWhereInput.NOT) &&
        Objects.equals(this.OR, snapshotPlanTaskWhereInput.OR) &&
        Objects.equals(this.cluster, snapshotPlanTaskWhereInput.cluster) &&
        Objects.equals(this.endTime, snapshotPlanTaskWhereInput.endTime) &&
        Objects.equals(this.endTimeGt, snapshotPlanTaskWhereInput.endTimeGt) &&
        Objects.equals(this.endTimeGte, snapshotPlanTaskWhereInput.endTimeGte) &&
        Objects.equals(this.endTimeIn, snapshotPlanTaskWhereInput.endTimeIn) &&
        Objects.equals(this.endTimeLt, snapshotPlanTaskWhereInput.endTimeLt) &&
        Objects.equals(this.endTimeLte, snapshotPlanTaskWhereInput.endTimeLte) &&
        Objects.equals(this.endTimeNot, snapshotPlanTaskWhereInput.endTimeNot) &&
        Objects.equals(this.endTimeNotIn, snapshotPlanTaskWhereInput.endTimeNotIn) &&
        Objects.equals(this.entityAsyncStatus, snapshotPlanTaskWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, snapshotPlanTaskWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, snapshotPlanTaskWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, snapshotPlanTaskWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.id, snapshotPlanTaskWhereInput.id) &&
        Objects.equals(this.idContains, snapshotPlanTaskWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, snapshotPlanTaskWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, snapshotPlanTaskWhereInput.idGt) &&
        Objects.equals(this.idGte, snapshotPlanTaskWhereInput.idGte) &&
        Objects.equals(this.idIn, snapshotPlanTaskWhereInput.idIn) &&
        Objects.equals(this.idLt, snapshotPlanTaskWhereInput.idLt) &&
        Objects.equals(this.idLte, snapshotPlanTaskWhereInput.idLte) &&
        Objects.equals(this.idNot, snapshotPlanTaskWhereInput.idNot) &&
        Objects.equals(this.idNotContains, snapshotPlanTaskWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, snapshotPlanTaskWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, snapshotPlanTaskWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, snapshotPlanTaskWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, snapshotPlanTaskWhereInput.idStartsWith) &&
        Objects.equals(this.internal, snapshotPlanTaskWhereInput.internal) &&
        Objects.equals(this.internalNot, snapshotPlanTaskWhereInput.internalNot) &&
        Objects.equals(this.localId, snapshotPlanTaskWhereInput.localId) &&
        Objects.equals(this.localIdContains, snapshotPlanTaskWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, snapshotPlanTaskWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, snapshotPlanTaskWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, snapshotPlanTaskWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, snapshotPlanTaskWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, snapshotPlanTaskWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, snapshotPlanTaskWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, snapshotPlanTaskWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, snapshotPlanTaskWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, snapshotPlanTaskWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, snapshotPlanTaskWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, snapshotPlanTaskWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, snapshotPlanTaskWhereInput.localIdStartsWith) &&
        Objects.equals(this.snapshotGroup, snapshotPlanTaskWhereInput.snapshotGroup) &&
        Objects.equals(this.snapshotPlan, snapshotPlanTaskWhereInput.snapshotPlan) &&
        Objects.equals(this.startTime, snapshotPlanTaskWhereInput.startTime) &&
        Objects.equals(this.startTimeGt, snapshotPlanTaskWhereInput.startTimeGt) &&
        Objects.equals(this.startTimeGte, snapshotPlanTaskWhereInput.startTimeGte) &&
        Objects.equals(this.startTimeIn, snapshotPlanTaskWhereInput.startTimeIn) &&
        Objects.equals(this.startTimeLt, snapshotPlanTaskWhereInput.startTimeLt) &&
        Objects.equals(this.startTimeLte, snapshotPlanTaskWhereInput.startTimeLte) &&
        Objects.equals(this.startTimeNot, snapshotPlanTaskWhereInput.startTimeNot) &&
        Objects.equals(this.startTimeNotIn, snapshotPlanTaskWhereInput.startTimeNotIn) &&
        Objects.equals(this.status, snapshotPlanTaskWhereInput.status) &&
        Objects.equals(this.statusIn, snapshotPlanTaskWhereInput.statusIn) &&
        Objects.equals(this.statusNot, snapshotPlanTaskWhereInput.statusNot) &&
        Objects.equals(this.statusNotIn, snapshotPlanTaskWhereInput.statusNotIn) &&
        Objects.equals(this.type, snapshotPlanTaskWhereInput.type) &&
        Objects.equals(this.typeIn, snapshotPlanTaskWhereInput.typeIn) &&
        Objects.equals(this.typeNot, snapshotPlanTaskWhereInput.typeNot) &&
        Objects.equals(this.typeNotIn, snapshotPlanTaskWhereInput.typeNotIn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, cluster, endTime, endTimeGt, endTimeGte, endTimeIn, endTimeLt, endTimeLte, endTimeNot, endTimeNotIn, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, internal, internalNot, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, snapshotGroup, snapshotPlan, startTime, startTimeGt, startTimeGte, startTimeIn, startTimeLt, startTimeLte, startTimeNot, startTimeNotIn, status, statusIn, statusNot, statusNotIn, type, typeIn, typeNot, typeNotIn);
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
    sb.append("class SnapshotPlanTaskWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    endTimeGt: ").append(toIndentedString(endTimeGt)).append("\n");
    sb.append("    endTimeGte: ").append(toIndentedString(endTimeGte)).append("\n");
    sb.append("    endTimeIn: ").append(toIndentedString(endTimeIn)).append("\n");
    sb.append("    endTimeLt: ").append(toIndentedString(endTimeLt)).append("\n");
    sb.append("    endTimeLte: ").append(toIndentedString(endTimeLte)).append("\n");
    sb.append("    endTimeNot: ").append(toIndentedString(endTimeNot)).append("\n");
    sb.append("    endTimeNotIn: ").append(toIndentedString(endTimeNotIn)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    entityAsyncStatusIn: ").append(toIndentedString(entityAsyncStatusIn)).append("\n");
    sb.append("    entityAsyncStatusNot: ").append(toIndentedString(entityAsyncStatusNot)).append("\n");
    sb.append("    entityAsyncStatusNotIn: ").append(toIndentedString(entityAsyncStatusNotIn)).append("\n");
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
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    internalNot: ").append(toIndentedString(internalNot)).append("\n");
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
    sb.append("    snapshotGroup: ").append(toIndentedString(snapshotGroup)).append("\n");
    sb.append("    snapshotPlan: ").append(toIndentedString(snapshotPlan)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    startTimeGt: ").append(toIndentedString(startTimeGt)).append("\n");
    sb.append("    startTimeGte: ").append(toIndentedString(startTimeGte)).append("\n");
    sb.append("    startTimeIn: ").append(toIndentedString(startTimeIn)).append("\n");
    sb.append("    startTimeLt: ").append(toIndentedString(startTimeLt)).append("\n");
    sb.append("    startTimeLte: ").append(toIndentedString(startTimeLte)).append("\n");
    sb.append("    startTimeNot: ").append(toIndentedString(startTimeNot)).append("\n");
    sb.append("    startTimeNotIn: ").append(toIndentedString(startTimeNotIn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
    sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
    sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
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

