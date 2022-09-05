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
import com.smartx.tower.model.GraphWhereInput;
import com.smartx.tower.model.TimeUnit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ViewWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ViewWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<ViewWhereInput> AND = null;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private ClusterWhereInput cluster;

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

  public static final String SERIALIZED_NAME_GRAPHS_EVERY = "graphs_every";
  @SerializedName(SERIALIZED_NAME_GRAPHS_EVERY)
  private GraphWhereInput graphsEvery;

  public static final String SERIALIZED_NAME_GRAPHS_NONE = "graphs_none";
  @SerializedName(SERIALIZED_NAME_GRAPHS_NONE)
  private GraphWhereInput graphsNone;

  public static final String SERIALIZED_NAME_GRAPHS_SOME = "graphs_some";
  @SerializedName(SERIALIZED_NAME_GRAPHS_SOME)
  private GraphWhereInput graphsSome;

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

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAME_CONTAINS = "name_contains";
  @SerializedName(SERIALIZED_NAME_NAME_CONTAINS)
  private String nameContains;

  public static final String SERIALIZED_NAME_NAME_ENDS_WITH = "name_ends_with";
  @SerializedName(SERIALIZED_NAME_NAME_ENDS_WITH)
  private String nameEndsWith;

  public static final String SERIALIZED_NAME_NAME_GT = "name_gt";
  @SerializedName(SERIALIZED_NAME_NAME_GT)
  private String nameGt;

  public static final String SERIALIZED_NAME_NAME_GTE = "name_gte";
  @SerializedName(SERIALIZED_NAME_NAME_GTE)
  private String nameGte;

  public static final String SERIALIZED_NAME_NAME_IN = "name_in";
  @SerializedName(SERIALIZED_NAME_NAME_IN)
  private List<String> nameIn = null;

  public static final String SERIALIZED_NAME_NAME_LT = "name_lt";
  @SerializedName(SERIALIZED_NAME_NAME_LT)
  private String nameLt;

  public static final String SERIALIZED_NAME_NAME_LTE = "name_lte";
  @SerializedName(SERIALIZED_NAME_NAME_LTE)
  private String nameLte;

  public static final String SERIALIZED_NAME_NAME_NOT = "name_not";
  @SerializedName(SERIALIZED_NAME_NAME_NOT)
  private String nameNot;

  public static final String SERIALIZED_NAME_NAME_NOT_CONTAINS = "name_not_contains";
  @SerializedName(SERIALIZED_NAME_NAME_NOT_CONTAINS)
  private String nameNotContains;

  public static final String SERIALIZED_NAME_NAME_NOT_ENDS_WITH = "name_not_ends_with";
  @SerializedName(SERIALIZED_NAME_NAME_NOT_ENDS_WITH)
  private String nameNotEndsWith;

  public static final String SERIALIZED_NAME_NAME_NOT_IN = "name_not_in";
  @SerializedName(SERIALIZED_NAME_NAME_NOT_IN)
  private List<String> nameNotIn = null;

  public static final String SERIALIZED_NAME_NAME_NOT_STARTS_WITH = "name_not_starts_with";
  @SerializedName(SERIALIZED_NAME_NAME_NOT_STARTS_WITH)
  private String nameNotStartsWith;

  public static final String SERIALIZED_NAME_NAME_STARTS_WITH = "name_starts_with";
  @SerializedName(SERIALIZED_NAME_NAME_STARTS_WITH)
  private String nameStartsWith;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<ViewWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<ViewWhereInput> OR = null;

  public static final String SERIALIZED_NAME_TIME_SPAN = "time_span";
  @SerializedName(SERIALIZED_NAME_TIME_SPAN)
  private Integer timeSpan;

  public static final String SERIALIZED_NAME_TIME_SPAN_GT = "time_span_gt";
  @SerializedName(SERIALIZED_NAME_TIME_SPAN_GT)
  private Integer timeSpanGt;

  public static final String SERIALIZED_NAME_TIME_SPAN_GTE = "time_span_gte";
  @SerializedName(SERIALIZED_NAME_TIME_SPAN_GTE)
  private Integer timeSpanGte;

  public static final String SERIALIZED_NAME_TIME_SPAN_IN = "time_span_in";
  @SerializedName(SERIALIZED_NAME_TIME_SPAN_IN)
  private List<Integer> timeSpanIn = null;

  public static final String SERIALIZED_NAME_TIME_SPAN_LT = "time_span_lt";
  @SerializedName(SERIALIZED_NAME_TIME_SPAN_LT)
  private Integer timeSpanLt;

  public static final String SERIALIZED_NAME_TIME_SPAN_LTE = "time_span_lte";
  @SerializedName(SERIALIZED_NAME_TIME_SPAN_LTE)
  private Integer timeSpanLte;

  public static final String SERIALIZED_NAME_TIME_SPAN_NOT = "time_span_not";
  @SerializedName(SERIALIZED_NAME_TIME_SPAN_NOT)
  private Integer timeSpanNot;

  public static final String SERIALIZED_NAME_TIME_SPAN_NOT_IN = "time_span_not_in";
  @SerializedName(SERIALIZED_NAME_TIME_SPAN_NOT_IN)
  private List<Integer> timeSpanNotIn = null;

  public static final String SERIALIZED_NAME_TIME_UNIT = "time_unit";
  @SerializedName(SERIALIZED_NAME_TIME_UNIT)
  private TimeUnit timeUnit;

  public static final String SERIALIZED_NAME_TIME_UNIT_IN = "time_unit_in";
  @SerializedName(SERIALIZED_NAME_TIME_UNIT_IN)
  private List<TimeUnit> timeUnitIn = null;

  public static final String SERIALIZED_NAME_TIME_UNIT_NOT = "time_unit_not";
  @SerializedName(SERIALIZED_NAME_TIME_UNIT_NOT)
  private TimeUnit timeUnitNot;

  public static final String SERIALIZED_NAME_TIME_UNIT_NOT_IN = "time_unit_not_in";
  @SerializedName(SERIALIZED_NAME_TIME_UNIT_NOT_IN)
  private List<TimeUnit> timeUnitNotIn = null;

  public ViewWhereInput() { 
  }

  public ViewWhereInput AND(List<ViewWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public ViewWhereInput addANDItem(ViewWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<ViewWhereInput>();
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

  public List<ViewWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<ViewWhereInput> AND) {
    this.AND = AND;
  }


  public ViewWhereInput cluster(ClusterWhereInput cluster) {
    
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


  public ViewWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public ViewWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public ViewWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public ViewWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public ViewWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public ViewWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public ViewWhereInput graphsEvery(GraphWhereInput graphsEvery) {
    
    this.graphsEvery = graphsEvery;
    return this;
  }

   /**
   * Get graphsEvery
   * @return graphsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GraphWhereInput getGraphsEvery() {
    return graphsEvery;
  }


  public void setGraphsEvery(GraphWhereInput graphsEvery) {
    this.graphsEvery = graphsEvery;
  }


  public ViewWhereInput graphsNone(GraphWhereInput graphsNone) {
    
    this.graphsNone = graphsNone;
    return this;
  }

   /**
   * Get graphsNone
   * @return graphsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GraphWhereInput getGraphsNone() {
    return graphsNone;
  }


  public void setGraphsNone(GraphWhereInput graphsNone) {
    this.graphsNone = graphsNone;
  }


  public ViewWhereInput graphsSome(GraphWhereInput graphsSome) {
    
    this.graphsSome = graphsSome;
    return this;
  }

   /**
   * Get graphsSome
   * @return graphsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GraphWhereInput getGraphsSome() {
    return graphsSome;
  }


  public void setGraphsSome(GraphWhereInput graphsSome) {
    this.graphsSome = graphsSome;
  }


  public ViewWhereInput id(String id) {
    
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


  public ViewWhereInput idContains(String idContains) {
    
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


  public ViewWhereInput idEndsWith(String idEndsWith) {
    
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


  public ViewWhereInput idGt(String idGt) {
    
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


  public ViewWhereInput idGte(String idGte) {
    
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


  public ViewWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public ViewWhereInput addIdInItem(String idInItem) {
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


  public ViewWhereInput idLt(String idLt) {
    
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


  public ViewWhereInput idLte(String idLte) {
    
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


  public ViewWhereInput idNot(String idNot) {
    
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


  public ViewWhereInput idNotContains(String idNotContains) {
    
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


  public ViewWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public ViewWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public ViewWhereInput addIdNotInItem(String idNotInItem) {
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


  public ViewWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public ViewWhereInput idStartsWith(String idStartsWith) {
    
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


  public ViewWhereInput localId(String localId) {
    
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


  public ViewWhereInput localIdContains(String localIdContains) {
    
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


  public ViewWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public ViewWhereInput localIdGt(String localIdGt) {
    
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


  public ViewWhereInput localIdGte(String localIdGte) {
    
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


  public ViewWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public ViewWhereInput addLocalIdInItem(String localIdInItem) {
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


  public ViewWhereInput localIdLt(String localIdLt) {
    
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


  public ViewWhereInput localIdLte(String localIdLte) {
    
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


  public ViewWhereInput localIdNot(String localIdNot) {
    
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


  public ViewWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public ViewWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public ViewWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public ViewWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public ViewWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public ViewWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public ViewWhereInput name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ViewWhereInput nameContains(String nameContains) {
    
    this.nameContains = nameContains;
    return this;
  }

   /**
   * Get nameContains
   * @return nameContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameContains() {
    return nameContains;
  }


  public void setNameContains(String nameContains) {
    this.nameContains = nameContains;
  }


  public ViewWhereInput nameEndsWith(String nameEndsWith) {
    
    this.nameEndsWith = nameEndsWith;
    return this;
  }

   /**
   * Get nameEndsWith
   * @return nameEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameEndsWith() {
    return nameEndsWith;
  }


  public void setNameEndsWith(String nameEndsWith) {
    this.nameEndsWith = nameEndsWith;
  }


  public ViewWhereInput nameGt(String nameGt) {
    
    this.nameGt = nameGt;
    return this;
  }

   /**
   * Get nameGt
   * @return nameGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameGt() {
    return nameGt;
  }


  public void setNameGt(String nameGt) {
    this.nameGt = nameGt;
  }


  public ViewWhereInput nameGte(String nameGte) {
    
    this.nameGte = nameGte;
    return this;
  }

   /**
   * Get nameGte
   * @return nameGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameGte() {
    return nameGte;
  }


  public void setNameGte(String nameGte) {
    this.nameGte = nameGte;
  }


  public ViewWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public ViewWhereInput addNameInItem(String nameInItem) {
    if (this.nameIn == null) {
      this.nameIn = new ArrayList<String>();
    }
    this.nameIn.add(nameInItem);
    return this;
  }

   /**
   * Get nameIn
   * @return nameIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNameIn() {
    return nameIn;
  }


  public void setNameIn(List<String> nameIn) {
    this.nameIn = nameIn;
  }


  public ViewWhereInput nameLt(String nameLt) {
    
    this.nameLt = nameLt;
    return this;
  }

   /**
   * Get nameLt
   * @return nameLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameLt() {
    return nameLt;
  }


  public void setNameLt(String nameLt) {
    this.nameLt = nameLt;
  }


  public ViewWhereInput nameLte(String nameLte) {
    
    this.nameLte = nameLte;
    return this;
  }

   /**
   * Get nameLte
   * @return nameLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameLte() {
    return nameLte;
  }


  public void setNameLte(String nameLte) {
    this.nameLte = nameLte;
  }


  public ViewWhereInput nameNot(String nameNot) {
    
    this.nameNot = nameNot;
    return this;
  }

   /**
   * Get nameNot
   * @return nameNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameNot() {
    return nameNot;
  }


  public void setNameNot(String nameNot) {
    this.nameNot = nameNot;
  }


  public ViewWhereInput nameNotContains(String nameNotContains) {
    
    this.nameNotContains = nameNotContains;
    return this;
  }

   /**
   * Get nameNotContains
   * @return nameNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameNotContains() {
    return nameNotContains;
  }


  public void setNameNotContains(String nameNotContains) {
    this.nameNotContains = nameNotContains;
  }


  public ViewWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
    this.nameNotEndsWith = nameNotEndsWith;
    return this;
  }

   /**
   * Get nameNotEndsWith
   * @return nameNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameNotEndsWith() {
    return nameNotEndsWith;
  }


  public void setNameNotEndsWith(String nameNotEndsWith) {
    this.nameNotEndsWith = nameNotEndsWith;
  }


  public ViewWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public ViewWhereInput addNameNotInItem(String nameNotInItem) {
    if (this.nameNotIn == null) {
      this.nameNotIn = new ArrayList<String>();
    }
    this.nameNotIn.add(nameNotInItem);
    return this;
  }

   /**
   * Get nameNotIn
   * @return nameNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNameNotIn() {
    return nameNotIn;
  }


  public void setNameNotIn(List<String> nameNotIn) {
    this.nameNotIn = nameNotIn;
  }


  public ViewWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
    this.nameNotStartsWith = nameNotStartsWith;
    return this;
  }

   /**
   * Get nameNotStartsWith
   * @return nameNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameNotStartsWith() {
    return nameNotStartsWith;
  }


  public void setNameNotStartsWith(String nameNotStartsWith) {
    this.nameNotStartsWith = nameNotStartsWith;
  }


  public ViewWhereInput nameStartsWith(String nameStartsWith) {
    
    this.nameStartsWith = nameStartsWith;
    return this;
  }

   /**
   * Get nameStartsWith
   * @return nameStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameStartsWith() {
    return nameStartsWith;
  }


  public void setNameStartsWith(String nameStartsWith) {
    this.nameStartsWith = nameStartsWith;
  }


  public ViewWhereInput NOT(List<ViewWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public ViewWhereInput addNOTItem(ViewWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<ViewWhereInput>();
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

  public List<ViewWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<ViewWhereInput> NOT) {
    this.NOT = NOT;
  }


  public ViewWhereInput OR(List<ViewWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public ViewWhereInput addORItem(ViewWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<ViewWhereInput>();
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

  public List<ViewWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<ViewWhereInput> OR) {
    this.OR = OR;
  }


  public ViewWhereInput timeSpan(Integer timeSpan) {
    
    this.timeSpan = timeSpan;
    return this;
  }

   /**
   * Get timeSpan
   * @return timeSpan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTimeSpan() {
    return timeSpan;
  }


  public void setTimeSpan(Integer timeSpan) {
    this.timeSpan = timeSpan;
  }


  public ViewWhereInput timeSpanGt(Integer timeSpanGt) {
    
    this.timeSpanGt = timeSpanGt;
    return this;
  }

   /**
   * Get timeSpanGt
   * @return timeSpanGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTimeSpanGt() {
    return timeSpanGt;
  }


  public void setTimeSpanGt(Integer timeSpanGt) {
    this.timeSpanGt = timeSpanGt;
  }


  public ViewWhereInput timeSpanGte(Integer timeSpanGte) {
    
    this.timeSpanGte = timeSpanGte;
    return this;
  }

   /**
   * Get timeSpanGte
   * @return timeSpanGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTimeSpanGte() {
    return timeSpanGte;
  }


  public void setTimeSpanGte(Integer timeSpanGte) {
    this.timeSpanGte = timeSpanGte;
  }


  public ViewWhereInput timeSpanIn(List<Integer> timeSpanIn) {
    
    this.timeSpanIn = timeSpanIn;
    return this;
  }

  public ViewWhereInput addTimeSpanInItem(Integer timeSpanInItem) {
    if (this.timeSpanIn == null) {
      this.timeSpanIn = new ArrayList<Integer>();
    }
    this.timeSpanIn.add(timeSpanInItem);
    return this;
  }

   /**
   * Get timeSpanIn
   * @return timeSpanIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getTimeSpanIn() {
    return timeSpanIn;
  }


  public void setTimeSpanIn(List<Integer> timeSpanIn) {
    this.timeSpanIn = timeSpanIn;
  }


  public ViewWhereInput timeSpanLt(Integer timeSpanLt) {
    
    this.timeSpanLt = timeSpanLt;
    return this;
  }

   /**
   * Get timeSpanLt
   * @return timeSpanLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTimeSpanLt() {
    return timeSpanLt;
  }


  public void setTimeSpanLt(Integer timeSpanLt) {
    this.timeSpanLt = timeSpanLt;
  }


  public ViewWhereInput timeSpanLte(Integer timeSpanLte) {
    
    this.timeSpanLte = timeSpanLte;
    return this;
  }

   /**
   * Get timeSpanLte
   * @return timeSpanLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTimeSpanLte() {
    return timeSpanLte;
  }


  public void setTimeSpanLte(Integer timeSpanLte) {
    this.timeSpanLte = timeSpanLte;
  }


  public ViewWhereInput timeSpanNot(Integer timeSpanNot) {
    
    this.timeSpanNot = timeSpanNot;
    return this;
  }

   /**
   * Get timeSpanNot
   * @return timeSpanNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTimeSpanNot() {
    return timeSpanNot;
  }


  public void setTimeSpanNot(Integer timeSpanNot) {
    this.timeSpanNot = timeSpanNot;
  }


  public ViewWhereInput timeSpanNotIn(List<Integer> timeSpanNotIn) {
    
    this.timeSpanNotIn = timeSpanNotIn;
    return this;
  }

  public ViewWhereInput addTimeSpanNotInItem(Integer timeSpanNotInItem) {
    if (this.timeSpanNotIn == null) {
      this.timeSpanNotIn = new ArrayList<Integer>();
    }
    this.timeSpanNotIn.add(timeSpanNotInItem);
    return this;
  }

   /**
   * Get timeSpanNotIn
   * @return timeSpanNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getTimeSpanNotIn() {
    return timeSpanNotIn;
  }


  public void setTimeSpanNotIn(List<Integer> timeSpanNotIn) {
    this.timeSpanNotIn = timeSpanNotIn;
  }


  public ViewWhereInput timeUnit(TimeUnit timeUnit) {
    
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * Get timeUnit
   * @return timeUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimeUnit getTimeUnit() {
    return timeUnit;
  }


  public void setTimeUnit(TimeUnit timeUnit) {
    this.timeUnit = timeUnit;
  }


  public ViewWhereInput timeUnitIn(List<TimeUnit> timeUnitIn) {
    
    this.timeUnitIn = timeUnitIn;
    return this;
  }

  public ViewWhereInput addTimeUnitInItem(TimeUnit timeUnitInItem) {
    if (this.timeUnitIn == null) {
      this.timeUnitIn = new ArrayList<TimeUnit>();
    }
    this.timeUnitIn.add(timeUnitInItem);
    return this;
  }

   /**
   * Get timeUnitIn
   * @return timeUnitIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TimeUnit> getTimeUnitIn() {
    return timeUnitIn;
  }


  public void setTimeUnitIn(List<TimeUnit> timeUnitIn) {
    this.timeUnitIn = timeUnitIn;
  }


  public ViewWhereInput timeUnitNot(TimeUnit timeUnitNot) {
    
    this.timeUnitNot = timeUnitNot;
    return this;
  }

   /**
   * Get timeUnitNot
   * @return timeUnitNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimeUnit getTimeUnitNot() {
    return timeUnitNot;
  }


  public void setTimeUnitNot(TimeUnit timeUnitNot) {
    this.timeUnitNot = timeUnitNot;
  }


  public ViewWhereInput timeUnitNotIn(List<TimeUnit> timeUnitNotIn) {
    
    this.timeUnitNotIn = timeUnitNotIn;
    return this;
  }

  public ViewWhereInput addTimeUnitNotInItem(TimeUnit timeUnitNotInItem) {
    if (this.timeUnitNotIn == null) {
      this.timeUnitNotIn = new ArrayList<TimeUnit>();
    }
    this.timeUnitNotIn.add(timeUnitNotInItem);
    return this;
  }

   /**
   * Get timeUnitNotIn
   * @return timeUnitNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TimeUnit> getTimeUnitNotIn() {
    return timeUnitNotIn;
  }


  public void setTimeUnitNotIn(List<TimeUnit> timeUnitNotIn) {
    this.timeUnitNotIn = timeUnitNotIn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewWhereInput viewWhereInput = (ViewWhereInput) o;
    return Objects.equals(this.AND, viewWhereInput.AND) &&
        Objects.equals(this.cluster, viewWhereInput.cluster) &&
        Objects.equals(this.entityAsyncStatus, viewWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, viewWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, viewWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, viewWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.graphsEvery, viewWhereInput.graphsEvery) &&
        Objects.equals(this.graphsNone, viewWhereInput.graphsNone) &&
        Objects.equals(this.graphsSome, viewWhereInput.graphsSome) &&
        Objects.equals(this.id, viewWhereInput.id) &&
        Objects.equals(this.idContains, viewWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, viewWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, viewWhereInput.idGt) &&
        Objects.equals(this.idGte, viewWhereInput.idGte) &&
        Objects.equals(this.idIn, viewWhereInput.idIn) &&
        Objects.equals(this.idLt, viewWhereInput.idLt) &&
        Objects.equals(this.idLte, viewWhereInput.idLte) &&
        Objects.equals(this.idNot, viewWhereInput.idNot) &&
        Objects.equals(this.idNotContains, viewWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, viewWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, viewWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, viewWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, viewWhereInput.idStartsWith) &&
        Objects.equals(this.localId, viewWhereInput.localId) &&
        Objects.equals(this.localIdContains, viewWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, viewWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, viewWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, viewWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, viewWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, viewWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, viewWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, viewWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, viewWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, viewWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, viewWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, viewWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, viewWhereInput.localIdStartsWith) &&
        Objects.equals(this.name, viewWhereInput.name) &&
        Objects.equals(this.nameContains, viewWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, viewWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, viewWhereInput.nameGt) &&
        Objects.equals(this.nameGte, viewWhereInput.nameGte) &&
        Objects.equals(this.nameIn, viewWhereInput.nameIn) &&
        Objects.equals(this.nameLt, viewWhereInput.nameLt) &&
        Objects.equals(this.nameLte, viewWhereInput.nameLte) &&
        Objects.equals(this.nameNot, viewWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, viewWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, viewWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, viewWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, viewWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, viewWhereInput.nameStartsWith) &&
        Objects.equals(this.NOT, viewWhereInput.NOT) &&
        Objects.equals(this.OR, viewWhereInput.OR) &&
        Objects.equals(this.timeSpan, viewWhereInput.timeSpan) &&
        Objects.equals(this.timeSpanGt, viewWhereInput.timeSpanGt) &&
        Objects.equals(this.timeSpanGte, viewWhereInput.timeSpanGte) &&
        Objects.equals(this.timeSpanIn, viewWhereInput.timeSpanIn) &&
        Objects.equals(this.timeSpanLt, viewWhereInput.timeSpanLt) &&
        Objects.equals(this.timeSpanLte, viewWhereInput.timeSpanLte) &&
        Objects.equals(this.timeSpanNot, viewWhereInput.timeSpanNot) &&
        Objects.equals(this.timeSpanNotIn, viewWhereInput.timeSpanNotIn) &&
        Objects.equals(this.timeUnit, viewWhereInput.timeUnit) &&
        Objects.equals(this.timeUnitIn, viewWhereInput.timeUnitIn) &&
        Objects.equals(this.timeUnitNot, viewWhereInput.timeUnitNot) &&
        Objects.equals(this.timeUnitNotIn, viewWhereInput.timeUnitNotIn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, cluster, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, graphsEvery, graphsNone, graphsSome, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, NOT, OR, timeSpan, timeSpanGt, timeSpanGte, timeSpanIn, timeSpanLt, timeSpanLte, timeSpanNot, timeSpanNotIn, timeUnit, timeUnitIn, timeUnitNot, timeUnitNotIn);
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
    sb.append("class ViewWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    entityAsyncStatusIn: ").append(toIndentedString(entityAsyncStatusIn)).append("\n");
    sb.append("    entityAsyncStatusNot: ").append(toIndentedString(entityAsyncStatusNot)).append("\n");
    sb.append("    entityAsyncStatusNotIn: ").append(toIndentedString(entityAsyncStatusNotIn)).append("\n");
    sb.append("    graphsEvery: ").append(toIndentedString(graphsEvery)).append("\n");
    sb.append("    graphsNone: ").append(toIndentedString(graphsNone)).append("\n");
    sb.append("    graphsSome: ").append(toIndentedString(graphsSome)).append("\n");
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
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameContains: ").append(toIndentedString(nameContains)).append("\n");
    sb.append("    nameEndsWith: ").append(toIndentedString(nameEndsWith)).append("\n");
    sb.append("    nameGt: ").append(toIndentedString(nameGt)).append("\n");
    sb.append("    nameGte: ").append(toIndentedString(nameGte)).append("\n");
    sb.append("    nameIn: ").append(toIndentedString(nameIn)).append("\n");
    sb.append("    nameLt: ").append(toIndentedString(nameLt)).append("\n");
    sb.append("    nameLte: ").append(toIndentedString(nameLte)).append("\n");
    sb.append("    nameNot: ").append(toIndentedString(nameNot)).append("\n");
    sb.append("    nameNotContains: ").append(toIndentedString(nameNotContains)).append("\n");
    sb.append("    nameNotEndsWith: ").append(toIndentedString(nameNotEndsWith)).append("\n");
    sb.append("    nameNotIn: ").append(toIndentedString(nameNotIn)).append("\n");
    sb.append("    nameNotStartsWith: ").append(toIndentedString(nameNotStartsWith)).append("\n");
    sb.append("    nameStartsWith: ").append(toIndentedString(nameStartsWith)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
    sb.append("    timeSpanGt: ").append(toIndentedString(timeSpanGt)).append("\n");
    sb.append("    timeSpanGte: ").append(toIndentedString(timeSpanGte)).append("\n");
    sb.append("    timeSpanIn: ").append(toIndentedString(timeSpanIn)).append("\n");
    sb.append("    timeSpanLt: ").append(toIndentedString(timeSpanLt)).append("\n");
    sb.append("    timeSpanLte: ").append(toIndentedString(timeSpanLte)).append("\n");
    sb.append("    timeSpanNot: ").append(toIndentedString(timeSpanNot)).append("\n");
    sb.append("    timeSpanNotIn: ").append(toIndentedString(timeSpanNotIn)).append("\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
    sb.append("    timeUnitIn: ").append(toIndentedString(timeUnitIn)).append("\n");
    sb.append("    timeUnitNot: ").append(toIndentedString(timeUnitNot)).append("\n");
    sb.append("    timeUnitNotIn: ").append(toIndentedString(timeUnitNotIn)).append("\n");
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

