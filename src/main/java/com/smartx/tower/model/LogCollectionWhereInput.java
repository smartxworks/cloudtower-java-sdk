package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.ClusterWhereInput;
import com.smartx.tower.model.HostWhereInput;
import com.smartx.tower.model.LogCollectionStatus;
import com.smartx.tower.model.WitnessWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * LogCollectionWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class LogCollectionWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<LogCollectionWhereInput> AND = null;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private ClusterWhereInput cluster;

  public static final String SERIALIZED_NAME_HOSTS_EVERY = "hosts_every";
  @SerializedName(SERIALIZED_NAME_HOSTS_EVERY)
  private HostWhereInput hostsEvery;

  public static final String SERIALIZED_NAME_HOSTS_NONE = "hosts_none";
  @SerializedName(SERIALIZED_NAME_HOSTS_NONE)
  private HostWhereInput hostsNone;

  public static final String SERIALIZED_NAME_HOSTS_SOME = "hosts_some";
  @SerializedName(SERIALIZED_NAME_HOSTS_SOME)
  private HostWhereInput hostsSome;

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

  public static final String SERIALIZED_NAME_LOG_ENDED_AT = "log_ended_at";
  @SerializedName(SERIALIZED_NAME_LOG_ENDED_AT)
  private String logEndedAt;

  public static final String SERIALIZED_NAME_LOG_ENDED_AT_GT = "log_ended_at_gt";
  @SerializedName(SERIALIZED_NAME_LOG_ENDED_AT_GT)
  private String logEndedAtGt;

  public static final String SERIALIZED_NAME_LOG_ENDED_AT_GTE = "log_ended_at_gte";
  @SerializedName(SERIALIZED_NAME_LOG_ENDED_AT_GTE)
  private String logEndedAtGte;

  public static final String SERIALIZED_NAME_LOG_ENDED_AT_IN = "log_ended_at_in";
  @SerializedName(SERIALIZED_NAME_LOG_ENDED_AT_IN)
  private List<String> logEndedAtIn = null;

  public static final String SERIALIZED_NAME_LOG_ENDED_AT_LT = "log_ended_at_lt";
  @SerializedName(SERIALIZED_NAME_LOG_ENDED_AT_LT)
  private String logEndedAtLt;

  public static final String SERIALIZED_NAME_LOG_ENDED_AT_LTE = "log_ended_at_lte";
  @SerializedName(SERIALIZED_NAME_LOG_ENDED_AT_LTE)
  private String logEndedAtLte;

  public static final String SERIALIZED_NAME_LOG_ENDED_AT_NOT = "log_ended_at_not";
  @SerializedName(SERIALIZED_NAME_LOG_ENDED_AT_NOT)
  private String logEndedAtNot;

  public static final String SERIALIZED_NAME_LOG_ENDED_AT_NOT_IN = "log_ended_at_not_in";
  @SerializedName(SERIALIZED_NAME_LOG_ENDED_AT_NOT_IN)
  private List<String> logEndedAtNotIn = null;

  public static final String SERIALIZED_NAME_LOG_STARTED_AT = "log_started_at";
  @SerializedName(SERIALIZED_NAME_LOG_STARTED_AT)
  private String logStartedAt;

  public static final String SERIALIZED_NAME_LOG_STARTED_AT_GT = "log_started_at_gt";
  @SerializedName(SERIALIZED_NAME_LOG_STARTED_AT_GT)
  private String logStartedAtGt;

  public static final String SERIALIZED_NAME_LOG_STARTED_AT_GTE = "log_started_at_gte";
  @SerializedName(SERIALIZED_NAME_LOG_STARTED_AT_GTE)
  private String logStartedAtGte;

  public static final String SERIALIZED_NAME_LOG_STARTED_AT_IN = "log_started_at_in";
  @SerializedName(SERIALIZED_NAME_LOG_STARTED_AT_IN)
  private List<String> logStartedAtIn = null;

  public static final String SERIALIZED_NAME_LOG_STARTED_AT_LT = "log_started_at_lt";
  @SerializedName(SERIALIZED_NAME_LOG_STARTED_AT_LT)
  private String logStartedAtLt;

  public static final String SERIALIZED_NAME_LOG_STARTED_AT_LTE = "log_started_at_lte";
  @SerializedName(SERIALIZED_NAME_LOG_STARTED_AT_LTE)
  private String logStartedAtLte;

  public static final String SERIALIZED_NAME_LOG_STARTED_AT_NOT = "log_started_at_not";
  @SerializedName(SERIALIZED_NAME_LOG_STARTED_AT_NOT)
  private String logStartedAtNot;

  public static final String SERIALIZED_NAME_LOG_STARTED_AT_NOT_IN = "log_started_at_not_in";
  @SerializedName(SERIALIZED_NAME_LOG_STARTED_AT_NOT_IN)
  private List<String> logStartedAtNotIn = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<LogCollectionWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<LogCollectionWhereInput> OR = null;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_OWNER_CONTAINS = "owner_contains";
  @SerializedName(SERIALIZED_NAME_OWNER_CONTAINS)
  private String ownerContains;

  public static final String SERIALIZED_NAME_OWNER_ENDS_WITH = "owner_ends_with";
  @SerializedName(SERIALIZED_NAME_OWNER_ENDS_WITH)
  private String ownerEndsWith;

  public static final String SERIALIZED_NAME_OWNER_GT = "owner_gt";
  @SerializedName(SERIALIZED_NAME_OWNER_GT)
  private String ownerGt;

  public static final String SERIALIZED_NAME_OWNER_GTE = "owner_gte";
  @SerializedName(SERIALIZED_NAME_OWNER_GTE)
  private String ownerGte;

  public static final String SERIALIZED_NAME_OWNER_IN = "owner_in";
  @SerializedName(SERIALIZED_NAME_OWNER_IN)
  private List<String> ownerIn = null;

  public static final String SERIALIZED_NAME_OWNER_LT = "owner_lt";
  @SerializedName(SERIALIZED_NAME_OWNER_LT)
  private String ownerLt;

  public static final String SERIALIZED_NAME_OWNER_LTE = "owner_lte";
  @SerializedName(SERIALIZED_NAME_OWNER_LTE)
  private String ownerLte;

  public static final String SERIALIZED_NAME_OWNER_NOT = "owner_not";
  @SerializedName(SERIALIZED_NAME_OWNER_NOT)
  private String ownerNot;

  public static final String SERIALIZED_NAME_OWNER_NOT_CONTAINS = "owner_not_contains";
  @SerializedName(SERIALIZED_NAME_OWNER_NOT_CONTAINS)
  private String ownerNotContains;

  public static final String SERIALIZED_NAME_OWNER_NOT_ENDS_WITH = "owner_not_ends_with";
  @SerializedName(SERIALIZED_NAME_OWNER_NOT_ENDS_WITH)
  private String ownerNotEndsWith;

  public static final String SERIALIZED_NAME_OWNER_NOT_IN = "owner_not_in";
  @SerializedName(SERIALIZED_NAME_OWNER_NOT_IN)
  private List<String> ownerNotIn = null;

  public static final String SERIALIZED_NAME_OWNER_NOT_STARTS_WITH = "owner_not_starts_with";
  @SerializedName(SERIALIZED_NAME_OWNER_NOT_STARTS_WITH)
  private String ownerNotStartsWith;

  public static final String SERIALIZED_NAME_OWNER_STARTS_WITH = "owner_starts_with";
  @SerializedName(SERIALIZED_NAME_OWNER_STARTS_WITH)
  private String ownerStartsWith;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PATH_CONTAINS = "path_contains";
  @SerializedName(SERIALIZED_NAME_PATH_CONTAINS)
  private String pathContains;

  public static final String SERIALIZED_NAME_PATH_ENDS_WITH = "path_ends_with";
  @SerializedName(SERIALIZED_NAME_PATH_ENDS_WITH)
  private String pathEndsWith;

  public static final String SERIALIZED_NAME_PATH_GT = "path_gt";
  @SerializedName(SERIALIZED_NAME_PATH_GT)
  private String pathGt;

  public static final String SERIALIZED_NAME_PATH_GTE = "path_gte";
  @SerializedName(SERIALIZED_NAME_PATH_GTE)
  private String pathGte;

  public static final String SERIALIZED_NAME_PATH_IN = "path_in";
  @SerializedName(SERIALIZED_NAME_PATH_IN)
  private List<String> pathIn = null;

  public static final String SERIALIZED_NAME_PATH_LT = "path_lt";
  @SerializedName(SERIALIZED_NAME_PATH_LT)
  private String pathLt;

  public static final String SERIALIZED_NAME_PATH_LTE = "path_lte";
  @SerializedName(SERIALIZED_NAME_PATH_LTE)
  private String pathLte;

  public static final String SERIALIZED_NAME_PATH_NOT = "path_not";
  @SerializedName(SERIALIZED_NAME_PATH_NOT)
  private String pathNot;

  public static final String SERIALIZED_NAME_PATH_NOT_CONTAINS = "path_not_contains";
  @SerializedName(SERIALIZED_NAME_PATH_NOT_CONTAINS)
  private String pathNotContains;

  public static final String SERIALIZED_NAME_PATH_NOT_ENDS_WITH = "path_not_ends_with";
  @SerializedName(SERIALIZED_NAME_PATH_NOT_ENDS_WITH)
  private String pathNotEndsWith;

  public static final String SERIALIZED_NAME_PATH_NOT_IN = "path_not_in";
  @SerializedName(SERIALIZED_NAME_PATH_NOT_IN)
  private List<String> pathNotIn = null;

  public static final String SERIALIZED_NAME_PATH_NOT_STARTS_WITH = "path_not_starts_with";
  @SerializedName(SERIALIZED_NAME_PATH_NOT_STARTS_WITH)
  private String pathNotStartsWith;

  public static final String SERIALIZED_NAME_PATH_STARTS_WITH = "path_starts_with";
  @SerializedName(SERIALIZED_NAME_PATH_STARTS_WITH)
  private String pathStartsWith;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private Double progress;

  public static final String SERIALIZED_NAME_PROGRESS_GT = "progress_gt";
  @SerializedName(SERIALIZED_NAME_PROGRESS_GT)
  private Double progressGt;

  public static final String SERIALIZED_NAME_PROGRESS_GTE = "progress_gte";
  @SerializedName(SERIALIZED_NAME_PROGRESS_GTE)
  private Double progressGte;

  public static final String SERIALIZED_NAME_PROGRESS_IN = "progress_in";
  @SerializedName(SERIALIZED_NAME_PROGRESS_IN)
  private List<Double> progressIn = null;

  public static final String SERIALIZED_NAME_PROGRESS_LT = "progress_lt";
  @SerializedName(SERIALIZED_NAME_PROGRESS_LT)
  private Double progressLt;

  public static final String SERIALIZED_NAME_PROGRESS_LTE = "progress_lte";
  @SerializedName(SERIALIZED_NAME_PROGRESS_LTE)
  private Double progressLte;

  public static final String SERIALIZED_NAME_PROGRESS_NOT = "progress_not";
  @SerializedName(SERIALIZED_NAME_PROGRESS_NOT)
  private Double progressNot;

  public static final String SERIALIZED_NAME_PROGRESS_NOT_IN = "progress_not_in";
  @SerializedName(SERIALIZED_NAME_PROGRESS_NOT_IN)
  private List<Double> progressNotIn = null;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_SIZE_GT = "size_gt";
  @SerializedName(SERIALIZED_NAME_SIZE_GT)
  private Long sizeGt;

  public static final String SERIALIZED_NAME_SIZE_GTE = "size_gte";
  @SerializedName(SERIALIZED_NAME_SIZE_GTE)
  private Long sizeGte;

  public static final String SERIALIZED_NAME_SIZE_IN = "size_in";
  @SerializedName(SERIALIZED_NAME_SIZE_IN)
  private List<Long> sizeIn = null;

  public static final String SERIALIZED_NAME_SIZE_LT = "size_lt";
  @SerializedName(SERIALIZED_NAME_SIZE_LT)
  private Long sizeLt;

  public static final String SERIALIZED_NAME_SIZE_LTE = "size_lte";
  @SerializedName(SERIALIZED_NAME_SIZE_LTE)
  private Long sizeLte;

  public static final String SERIALIZED_NAME_SIZE_NOT = "size_not";
  @SerializedName(SERIALIZED_NAME_SIZE_NOT)
  private Long sizeNot;

  public static final String SERIALIZED_NAME_SIZE_NOT_IN = "size_not_in";
  @SerializedName(SERIALIZED_NAME_SIZE_NOT_IN)
  private List<Long> sizeNotIn = null;

  public static final String SERIALIZED_NAME_STARTED_AT = "started_at";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private String startedAt;

  public static final String SERIALIZED_NAME_STARTED_AT_GT = "started_at_gt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_GT)
  private String startedAtGt;

  public static final String SERIALIZED_NAME_STARTED_AT_GTE = "started_at_gte";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_GTE)
  private String startedAtGte;

  public static final String SERIALIZED_NAME_STARTED_AT_IN = "started_at_in";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_IN)
  private List<String> startedAtIn = null;

  public static final String SERIALIZED_NAME_STARTED_AT_LT = "started_at_lt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_LT)
  private String startedAtLt;

  public static final String SERIALIZED_NAME_STARTED_AT_LTE = "started_at_lte";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_LTE)
  private String startedAtLte;

  public static final String SERIALIZED_NAME_STARTED_AT_NOT = "started_at_not";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_NOT)
  private String startedAtNot;

  public static final String SERIALIZED_NAME_STARTED_AT_NOT_IN = "started_at_not_in";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_NOT_IN)
  private List<String> startedAtNotIn = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private LogCollectionStatus status;

  public static final String SERIALIZED_NAME_STATUS_IN = "status_in";
  @SerializedName(SERIALIZED_NAME_STATUS_IN)
  private List<LogCollectionStatus> statusIn = null;

  public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";
  @SerializedName(SERIALIZED_NAME_STATUS_NOT)
  private LogCollectionStatus statusNot;

  public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";
  @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
  private List<LogCollectionStatus> statusNotIn = null;

  public static final String SERIALIZED_NAME_WITNESS = "witness";
  @SerializedName(SERIALIZED_NAME_WITNESS)
  private WitnessWhereInput witness;

  public LogCollectionWhereInput() { 
  }

  public LogCollectionWhereInput AND(List<LogCollectionWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public LogCollectionWhereInput addANDItem(LogCollectionWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<LogCollectionWhereInput>();
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

  public List<LogCollectionWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<LogCollectionWhereInput> AND) {
    this.AND = AND;
  }


  public LogCollectionWhereInput cluster(ClusterWhereInput cluster) {
    
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


  public LogCollectionWhereInput hostsEvery(HostWhereInput hostsEvery) {
    
    this.hostsEvery = hostsEvery;
    return this;
  }

   /**
   * Get hostsEvery
   * @return hostsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostWhereInput getHostsEvery() {
    return hostsEvery;
  }


  public void setHostsEvery(HostWhereInput hostsEvery) {
    this.hostsEvery = hostsEvery;
  }


  public LogCollectionWhereInput hostsNone(HostWhereInput hostsNone) {
    
    this.hostsNone = hostsNone;
    return this;
  }

   /**
   * Get hostsNone
   * @return hostsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostWhereInput getHostsNone() {
    return hostsNone;
  }


  public void setHostsNone(HostWhereInput hostsNone) {
    this.hostsNone = hostsNone;
  }


  public LogCollectionWhereInput hostsSome(HostWhereInput hostsSome) {
    
    this.hostsSome = hostsSome;
    return this;
  }

   /**
   * Get hostsSome
   * @return hostsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostWhereInput getHostsSome() {
    return hostsSome;
  }


  public void setHostsSome(HostWhereInput hostsSome) {
    this.hostsSome = hostsSome;
  }


  public LogCollectionWhereInput id(String id) {
    
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


  public LogCollectionWhereInput idContains(String idContains) {
    
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


  public LogCollectionWhereInput idEndsWith(String idEndsWith) {
    
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


  public LogCollectionWhereInput idGt(String idGt) {
    
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


  public LogCollectionWhereInput idGte(String idGte) {
    
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


  public LogCollectionWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public LogCollectionWhereInput addIdInItem(String idInItem) {
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


  public LogCollectionWhereInput idLt(String idLt) {
    
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


  public LogCollectionWhereInput idLte(String idLte) {
    
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


  public LogCollectionWhereInput idNot(String idNot) {
    
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


  public LogCollectionWhereInput idNotContains(String idNotContains) {
    
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


  public LogCollectionWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public LogCollectionWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public LogCollectionWhereInput addIdNotInItem(String idNotInItem) {
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


  public LogCollectionWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public LogCollectionWhereInput idStartsWith(String idStartsWith) {
    
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


  public LogCollectionWhereInput localId(String localId) {
    
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


  public LogCollectionWhereInput localIdContains(String localIdContains) {
    
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


  public LogCollectionWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public LogCollectionWhereInput localIdGt(String localIdGt) {
    
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


  public LogCollectionWhereInput localIdGte(String localIdGte) {
    
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


  public LogCollectionWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public LogCollectionWhereInput addLocalIdInItem(String localIdInItem) {
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


  public LogCollectionWhereInput localIdLt(String localIdLt) {
    
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


  public LogCollectionWhereInput localIdLte(String localIdLte) {
    
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


  public LogCollectionWhereInput localIdNot(String localIdNot) {
    
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


  public LogCollectionWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public LogCollectionWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public LogCollectionWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public LogCollectionWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public LogCollectionWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public LogCollectionWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public LogCollectionWhereInput logEndedAt(String logEndedAt) {
    
    this.logEndedAt = logEndedAt;
    return this;
  }

   /**
   * Get logEndedAt
   * @return logEndedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogEndedAt() {
    return logEndedAt;
  }


  public void setLogEndedAt(String logEndedAt) {
    this.logEndedAt = logEndedAt;
  }


  public LogCollectionWhereInput logEndedAtGt(String logEndedAtGt) {
    
    this.logEndedAtGt = logEndedAtGt;
    return this;
  }

   /**
   * Get logEndedAtGt
   * @return logEndedAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogEndedAtGt() {
    return logEndedAtGt;
  }


  public void setLogEndedAtGt(String logEndedAtGt) {
    this.logEndedAtGt = logEndedAtGt;
  }


  public LogCollectionWhereInput logEndedAtGte(String logEndedAtGte) {
    
    this.logEndedAtGte = logEndedAtGte;
    return this;
  }

   /**
   * Get logEndedAtGte
   * @return logEndedAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogEndedAtGte() {
    return logEndedAtGte;
  }


  public void setLogEndedAtGte(String logEndedAtGte) {
    this.logEndedAtGte = logEndedAtGte;
  }


  public LogCollectionWhereInput logEndedAtIn(List<String> logEndedAtIn) {
    
    this.logEndedAtIn = logEndedAtIn;
    return this;
  }

  public LogCollectionWhereInput addLogEndedAtInItem(String logEndedAtInItem) {
    if (this.logEndedAtIn == null) {
      this.logEndedAtIn = new ArrayList<String>();
    }
    this.logEndedAtIn.add(logEndedAtInItem);
    return this;
  }

   /**
   * Get logEndedAtIn
   * @return logEndedAtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLogEndedAtIn() {
    return logEndedAtIn;
  }


  public void setLogEndedAtIn(List<String> logEndedAtIn) {
    this.logEndedAtIn = logEndedAtIn;
  }


  public LogCollectionWhereInput logEndedAtLt(String logEndedAtLt) {
    
    this.logEndedAtLt = logEndedAtLt;
    return this;
  }

   /**
   * Get logEndedAtLt
   * @return logEndedAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogEndedAtLt() {
    return logEndedAtLt;
  }


  public void setLogEndedAtLt(String logEndedAtLt) {
    this.logEndedAtLt = logEndedAtLt;
  }


  public LogCollectionWhereInput logEndedAtLte(String logEndedAtLte) {
    
    this.logEndedAtLte = logEndedAtLte;
    return this;
  }

   /**
   * Get logEndedAtLte
   * @return logEndedAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogEndedAtLte() {
    return logEndedAtLte;
  }


  public void setLogEndedAtLte(String logEndedAtLte) {
    this.logEndedAtLte = logEndedAtLte;
  }


  public LogCollectionWhereInput logEndedAtNot(String logEndedAtNot) {
    
    this.logEndedAtNot = logEndedAtNot;
    return this;
  }

   /**
   * Get logEndedAtNot
   * @return logEndedAtNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogEndedAtNot() {
    return logEndedAtNot;
  }


  public void setLogEndedAtNot(String logEndedAtNot) {
    this.logEndedAtNot = logEndedAtNot;
  }


  public LogCollectionWhereInput logEndedAtNotIn(List<String> logEndedAtNotIn) {
    
    this.logEndedAtNotIn = logEndedAtNotIn;
    return this;
  }

  public LogCollectionWhereInput addLogEndedAtNotInItem(String logEndedAtNotInItem) {
    if (this.logEndedAtNotIn == null) {
      this.logEndedAtNotIn = new ArrayList<String>();
    }
    this.logEndedAtNotIn.add(logEndedAtNotInItem);
    return this;
  }

   /**
   * Get logEndedAtNotIn
   * @return logEndedAtNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLogEndedAtNotIn() {
    return logEndedAtNotIn;
  }


  public void setLogEndedAtNotIn(List<String> logEndedAtNotIn) {
    this.logEndedAtNotIn = logEndedAtNotIn;
  }


  public LogCollectionWhereInput logStartedAt(String logStartedAt) {
    
    this.logStartedAt = logStartedAt;
    return this;
  }

   /**
   * Get logStartedAt
   * @return logStartedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogStartedAt() {
    return logStartedAt;
  }


  public void setLogStartedAt(String logStartedAt) {
    this.logStartedAt = logStartedAt;
  }


  public LogCollectionWhereInput logStartedAtGt(String logStartedAtGt) {
    
    this.logStartedAtGt = logStartedAtGt;
    return this;
  }

   /**
   * Get logStartedAtGt
   * @return logStartedAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogStartedAtGt() {
    return logStartedAtGt;
  }


  public void setLogStartedAtGt(String logStartedAtGt) {
    this.logStartedAtGt = logStartedAtGt;
  }


  public LogCollectionWhereInput logStartedAtGte(String logStartedAtGte) {
    
    this.logStartedAtGte = logStartedAtGte;
    return this;
  }

   /**
   * Get logStartedAtGte
   * @return logStartedAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogStartedAtGte() {
    return logStartedAtGte;
  }


  public void setLogStartedAtGte(String logStartedAtGte) {
    this.logStartedAtGte = logStartedAtGte;
  }


  public LogCollectionWhereInput logStartedAtIn(List<String> logStartedAtIn) {
    
    this.logStartedAtIn = logStartedAtIn;
    return this;
  }

  public LogCollectionWhereInput addLogStartedAtInItem(String logStartedAtInItem) {
    if (this.logStartedAtIn == null) {
      this.logStartedAtIn = new ArrayList<String>();
    }
    this.logStartedAtIn.add(logStartedAtInItem);
    return this;
  }

   /**
   * Get logStartedAtIn
   * @return logStartedAtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLogStartedAtIn() {
    return logStartedAtIn;
  }


  public void setLogStartedAtIn(List<String> logStartedAtIn) {
    this.logStartedAtIn = logStartedAtIn;
  }


  public LogCollectionWhereInput logStartedAtLt(String logStartedAtLt) {
    
    this.logStartedAtLt = logStartedAtLt;
    return this;
  }

   /**
   * Get logStartedAtLt
   * @return logStartedAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogStartedAtLt() {
    return logStartedAtLt;
  }


  public void setLogStartedAtLt(String logStartedAtLt) {
    this.logStartedAtLt = logStartedAtLt;
  }


  public LogCollectionWhereInput logStartedAtLte(String logStartedAtLte) {
    
    this.logStartedAtLte = logStartedAtLte;
    return this;
  }

   /**
   * Get logStartedAtLte
   * @return logStartedAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogStartedAtLte() {
    return logStartedAtLte;
  }


  public void setLogStartedAtLte(String logStartedAtLte) {
    this.logStartedAtLte = logStartedAtLte;
  }


  public LogCollectionWhereInput logStartedAtNot(String logStartedAtNot) {
    
    this.logStartedAtNot = logStartedAtNot;
    return this;
  }

   /**
   * Get logStartedAtNot
   * @return logStartedAtNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogStartedAtNot() {
    return logStartedAtNot;
  }


  public void setLogStartedAtNot(String logStartedAtNot) {
    this.logStartedAtNot = logStartedAtNot;
  }


  public LogCollectionWhereInput logStartedAtNotIn(List<String> logStartedAtNotIn) {
    
    this.logStartedAtNotIn = logStartedAtNotIn;
    return this;
  }

  public LogCollectionWhereInput addLogStartedAtNotInItem(String logStartedAtNotInItem) {
    if (this.logStartedAtNotIn == null) {
      this.logStartedAtNotIn = new ArrayList<String>();
    }
    this.logStartedAtNotIn.add(logStartedAtNotInItem);
    return this;
  }

   /**
   * Get logStartedAtNotIn
   * @return logStartedAtNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLogStartedAtNotIn() {
    return logStartedAtNotIn;
  }


  public void setLogStartedAtNotIn(List<String> logStartedAtNotIn) {
    this.logStartedAtNotIn = logStartedAtNotIn;
  }


  public LogCollectionWhereInput NOT(List<LogCollectionWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public LogCollectionWhereInput addNOTItem(LogCollectionWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<LogCollectionWhereInput>();
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

  public List<LogCollectionWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<LogCollectionWhereInput> NOT) {
    this.NOT = NOT;
  }


  public LogCollectionWhereInput OR(List<LogCollectionWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public LogCollectionWhereInput addORItem(LogCollectionWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<LogCollectionWhereInput>();
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

  public List<LogCollectionWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<LogCollectionWhereInput> OR) {
    this.OR = OR;
  }


  public LogCollectionWhereInput owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public LogCollectionWhereInput ownerContains(String ownerContains) {
    
    this.ownerContains = ownerContains;
    return this;
  }

   /**
   * Get ownerContains
   * @return ownerContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwnerContains() {
    return ownerContains;
  }


  public void setOwnerContains(String ownerContains) {
    this.ownerContains = ownerContains;
  }


  public LogCollectionWhereInput ownerEndsWith(String ownerEndsWith) {
    
    this.ownerEndsWith = ownerEndsWith;
    return this;
  }

   /**
   * Get ownerEndsWith
   * @return ownerEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwnerEndsWith() {
    return ownerEndsWith;
  }


  public void setOwnerEndsWith(String ownerEndsWith) {
    this.ownerEndsWith = ownerEndsWith;
  }


  public LogCollectionWhereInput ownerGt(String ownerGt) {
    
    this.ownerGt = ownerGt;
    return this;
  }

   /**
   * Get ownerGt
   * @return ownerGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwnerGt() {
    return ownerGt;
  }


  public void setOwnerGt(String ownerGt) {
    this.ownerGt = ownerGt;
  }


  public LogCollectionWhereInput ownerGte(String ownerGte) {
    
    this.ownerGte = ownerGte;
    return this;
  }

   /**
   * Get ownerGte
   * @return ownerGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwnerGte() {
    return ownerGte;
  }


  public void setOwnerGte(String ownerGte) {
    this.ownerGte = ownerGte;
  }


  public LogCollectionWhereInput ownerIn(List<String> ownerIn) {
    
    this.ownerIn = ownerIn;
    return this;
  }

  public LogCollectionWhereInput addOwnerInItem(String ownerInItem) {
    if (this.ownerIn == null) {
      this.ownerIn = new ArrayList<String>();
    }
    this.ownerIn.add(ownerInItem);
    return this;
  }

   /**
   * Get ownerIn
   * @return ownerIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getOwnerIn() {
    return ownerIn;
  }


  public void setOwnerIn(List<String> ownerIn) {
    this.ownerIn = ownerIn;
  }


  public LogCollectionWhereInput ownerLt(String ownerLt) {
    
    this.ownerLt = ownerLt;
    return this;
  }

   /**
   * Get ownerLt
   * @return ownerLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwnerLt() {
    return ownerLt;
  }


  public void setOwnerLt(String ownerLt) {
    this.ownerLt = ownerLt;
  }


  public LogCollectionWhereInput ownerLte(String ownerLte) {
    
    this.ownerLte = ownerLte;
    return this;
  }

   /**
   * Get ownerLte
   * @return ownerLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwnerLte() {
    return ownerLte;
  }


  public void setOwnerLte(String ownerLte) {
    this.ownerLte = ownerLte;
  }


  public LogCollectionWhereInput ownerNot(String ownerNot) {
    
    this.ownerNot = ownerNot;
    return this;
  }

   /**
   * Get ownerNot
   * @return ownerNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwnerNot() {
    return ownerNot;
  }


  public void setOwnerNot(String ownerNot) {
    this.ownerNot = ownerNot;
  }


  public LogCollectionWhereInput ownerNotContains(String ownerNotContains) {
    
    this.ownerNotContains = ownerNotContains;
    return this;
  }

   /**
   * Get ownerNotContains
   * @return ownerNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwnerNotContains() {
    return ownerNotContains;
  }


  public void setOwnerNotContains(String ownerNotContains) {
    this.ownerNotContains = ownerNotContains;
  }


  public LogCollectionWhereInput ownerNotEndsWith(String ownerNotEndsWith) {
    
    this.ownerNotEndsWith = ownerNotEndsWith;
    return this;
  }

   /**
   * Get ownerNotEndsWith
   * @return ownerNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwnerNotEndsWith() {
    return ownerNotEndsWith;
  }


  public void setOwnerNotEndsWith(String ownerNotEndsWith) {
    this.ownerNotEndsWith = ownerNotEndsWith;
  }


  public LogCollectionWhereInput ownerNotIn(List<String> ownerNotIn) {
    
    this.ownerNotIn = ownerNotIn;
    return this;
  }

  public LogCollectionWhereInput addOwnerNotInItem(String ownerNotInItem) {
    if (this.ownerNotIn == null) {
      this.ownerNotIn = new ArrayList<String>();
    }
    this.ownerNotIn.add(ownerNotInItem);
    return this;
  }

   /**
   * Get ownerNotIn
   * @return ownerNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getOwnerNotIn() {
    return ownerNotIn;
  }


  public void setOwnerNotIn(List<String> ownerNotIn) {
    this.ownerNotIn = ownerNotIn;
  }


  public LogCollectionWhereInput ownerNotStartsWith(String ownerNotStartsWith) {
    
    this.ownerNotStartsWith = ownerNotStartsWith;
    return this;
  }

   /**
   * Get ownerNotStartsWith
   * @return ownerNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwnerNotStartsWith() {
    return ownerNotStartsWith;
  }


  public void setOwnerNotStartsWith(String ownerNotStartsWith) {
    this.ownerNotStartsWith = ownerNotStartsWith;
  }


  public LogCollectionWhereInput ownerStartsWith(String ownerStartsWith) {
    
    this.ownerStartsWith = ownerStartsWith;
    return this;
  }

   /**
   * Get ownerStartsWith
   * @return ownerStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwnerStartsWith() {
    return ownerStartsWith;
  }


  public void setOwnerStartsWith(String ownerStartsWith) {
    this.ownerStartsWith = ownerStartsWith;
  }


  public LogCollectionWhereInput path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public LogCollectionWhereInput pathContains(String pathContains) {
    
    this.pathContains = pathContains;
    return this;
  }

   /**
   * Get pathContains
   * @return pathContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathContains() {
    return pathContains;
  }


  public void setPathContains(String pathContains) {
    this.pathContains = pathContains;
  }


  public LogCollectionWhereInput pathEndsWith(String pathEndsWith) {
    
    this.pathEndsWith = pathEndsWith;
    return this;
  }

   /**
   * Get pathEndsWith
   * @return pathEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathEndsWith() {
    return pathEndsWith;
  }


  public void setPathEndsWith(String pathEndsWith) {
    this.pathEndsWith = pathEndsWith;
  }


  public LogCollectionWhereInput pathGt(String pathGt) {
    
    this.pathGt = pathGt;
    return this;
  }

   /**
   * Get pathGt
   * @return pathGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathGt() {
    return pathGt;
  }


  public void setPathGt(String pathGt) {
    this.pathGt = pathGt;
  }


  public LogCollectionWhereInput pathGte(String pathGte) {
    
    this.pathGte = pathGte;
    return this;
  }

   /**
   * Get pathGte
   * @return pathGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathGte() {
    return pathGte;
  }


  public void setPathGte(String pathGte) {
    this.pathGte = pathGte;
  }


  public LogCollectionWhereInput pathIn(List<String> pathIn) {
    
    this.pathIn = pathIn;
    return this;
  }

  public LogCollectionWhereInput addPathInItem(String pathInItem) {
    if (this.pathIn == null) {
      this.pathIn = new ArrayList<String>();
    }
    this.pathIn.add(pathInItem);
    return this;
  }

   /**
   * Get pathIn
   * @return pathIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPathIn() {
    return pathIn;
  }


  public void setPathIn(List<String> pathIn) {
    this.pathIn = pathIn;
  }


  public LogCollectionWhereInput pathLt(String pathLt) {
    
    this.pathLt = pathLt;
    return this;
  }

   /**
   * Get pathLt
   * @return pathLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathLt() {
    return pathLt;
  }


  public void setPathLt(String pathLt) {
    this.pathLt = pathLt;
  }


  public LogCollectionWhereInput pathLte(String pathLte) {
    
    this.pathLte = pathLte;
    return this;
  }

   /**
   * Get pathLte
   * @return pathLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathLte() {
    return pathLte;
  }


  public void setPathLte(String pathLte) {
    this.pathLte = pathLte;
  }


  public LogCollectionWhereInput pathNot(String pathNot) {
    
    this.pathNot = pathNot;
    return this;
  }

   /**
   * Get pathNot
   * @return pathNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathNot() {
    return pathNot;
  }


  public void setPathNot(String pathNot) {
    this.pathNot = pathNot;
  }


  public LogCollectionWhereInput pathNotContains(String pathNotContains) {
    
    this.pathNotContains = pathNotContains;
    return this;
  }

   /**
   * Get pathNotContains
   * @return pathNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathNotContains() {
    return pathNotContains;
  }


  public void setPathNotContains(String pathNotContains) {
    this.pathNotContains = pathNotContains;
  }


  public LogCollectionWhereInput pathNotEndsWith(String pathNotEndsWith) {
    
    this.pathNotEndsWith = pathNotEndsWith;
    return this;
  }

   /**
   * Get pathNotEndsWith
   * @return pathNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathNotEndsWith() {
    return pathNotEndsWith;
  }


  public void setPathNotEndsWith(String pathNotEndsWith) {
    this.pathNotEndsWith = pathNotEndsWith;
  }


  public LogCollectionWhereInput pathNotIn(List<String> pathNotIn) {
    
    this.pathNotIn = pathNotIn;
    return this;
  }

  public LogCollectionWhereInput addPathNotInItem(String pathNotInItem) {
    if (this.pathNotIn == null) {
      this.pathNotIn = new ArrayList<String>();
    }
    this.pathNotIn.add(pathNotInItem);
    return this;
  }

   /**
   * Get pathNotIn
   * @return pathNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPathNotIn() {
    return pathNotIn;
  }


  public void setPathNotIn(List<String> pathNotIn) {
    this.pathNotIn = pathNotIn;
  }


  public LogCollectionWhereInput pathNotStartsWith(String pathNotStartsWith) {
    
    this.pathNotStartsWith = pathNotStartsWith;
    return this;
  }

   /**
   * Get pathNotStartsWith
   * @return pathNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathNotStartsWith() {
    return pathNotStartsWith;
  }


  public void setPathNotStartsWith(String pathNotStartsWith) {
    this.pathNotStartsWith = pathNotStartsWith;
  }


  public LogCollectionWhereInput pathStartsWith(String pathStartsWith) {
    
    this.pathStartsWith = pathStartsWith;
    return this;
  }

   /**
   * Get pathStartsWith
   * @return pathStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathStartsWith() {
    return pathStartsWith;
  }


  public void setPathStartsWith(String pathStartsWith) {
    this.pathStartsWith = pathStartsWith;
  }


  public LogCollectionWhereInput progress(Double progress) {
    
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getProgress() {
    return progress;
  }


  public void setProgress(Double progress) {
    this.progress = progress;
  }


  public LogCollectionWhereInput progressGt(Double progressGt) {
    
    this.progressGt = progressGt;
    return this;
  }

   /**
   * Get progressGt
   * @return progressGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getProgressGt() {
    return progressGt;
  }


  public void setProgressGt(Double progressGt) {
    this.progressGt = progressGt;
  }


  public LogCollectionWhereInput progressGte(Double progressGte) {
    
    this.progressGte = progressGte;
    return this;
  }

   /**
   * Get progressGte
   * @return progressGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getProgressGte() {
    return progressGte;
  }


  public void setProgressGte(Double progressGte) {
    this.progressGte = progressGte;
  }


  public LogCollectionWhereInput progressIn(List<Double> progressIn) {
    
    this.progressIn = progressIn;
    return this;
  }

  public LogCollectionWhereInput addProgressInItem(Double progressInItem) {
    if (this.progressIn == null) {
      this.progressIn = new ArrayList<Double>();
    }
    this.progressIn.add(progressInItem);
    return this;
  }

   /**
   * Get progressIn
   * @return progressIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getProgressIn() {
    return progressIn;
  }


  public void setProgressIn(List<Double> progressIn) {
    this.progressIn = progressIn;
  }


  public LogCollectionWhereInput progressLt(Double progressLt) {
    
    this.progressLt = progressLt;
    return this;
  }

   /**
   * Get progressLt
   * @return progressLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getProgressLt() {
    return progressLt;
  }


  public void setProgressLt(Double progressLt) {
    this.progressLt = progressLt;
  }


  public LogCollectionWhereInput progressLte(Double progressLte) {
    
    this.progressLte = progressLte;
    return this;
  }

   /**
   * Get progressLte
   * @return progressLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getProgressLte() {
    return progressLte;
  }


  public void setProgressLte(Double progressLte) {
    this.progressLte = progressLte;
  }


  public LogCollectionWhereInput progressNot(Double progressNot) {
    
    this.progressNot = progressNot;
    return this;
  }

   /**
   * Get progressNot
   * @return progressNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getProgressNot() {
    return progressNot;
  }


  public void setProgressNot(Double progressNot) {
    this.progressNot = progressNot;
  }


  public LogCollectionWhereInput progressNotIn(List<Double> progressNotIn) {
    
    this.progressNotIn = progressNotIn;
    return this;
  }

  public LogCollectionWhereInput addProgressNotInItem(Double progressNotInItem) {
    if (this.progressNotIn == null) {
      this.progressNotIn = new ArrayList<Double>();
    }
    this.progressNotIn.add(progressNotInItem);
    return this;
  }

   /**
   * Get progressNotIn
   * @return progressNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getProgressNotIn() {
    return progressNotIn;
  }


  public void setProgressNotIn(List<Double> progressNotIn) {
    this.progressNotIn = progressNotIn;
  }


  public LogCollectionWhereInput size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public LogCollectionWhereInput sizeGt(Long sizeGt) {
    
    this.sizeGt = sizeGt;
    return this;
  }

   /**
   * Get sizeGt
   * @return sizeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeGt() {
    return sizeGt;
  }


  public void setSizeGt(Long sizeGt) {
    this.sizeGt = sizeGt;
  }


  public LogCollectionWhereInput sizeGte(Long sizeGte) {
    
    this.sizeGte = sizeGte;
    return this;
  }

   /**
   * Get sizeGte
   * @return sizeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeGte() {
    return sizeGte;
  }


  public void setSizeGte(Long sizeGte) {
    this.sizeGte = sizeGte;
  }


  public LogCollectionWhereInput sizeIn(List<Long> sizeIn) {
    
    this.sizeIn = sizeIn;
    return this;
  }

  public LogCollectionWhereInput addSizeInItem(Long sizeInItem) {
    if (this.sizeIn == null) {
      this.sizeIn = new ArrayList<Long>();
    }
    this.sizeIn.add(sizeInItem);
    return this;
  }

   /**
   * Get sizeIn
   * @return sizeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getSizeIn() {
    return sizeIn;
  }


  public void setSizeIn(List<Long> sizeIn) {
    this.sizeIn = sizeIn;
  }


  public LogCollectionWhereInput sizeLt(Long sizeLt) {
    
    this.sizeLt = sizeLt;
    return this;
  }

   /**
   * Get sizeLt
   * @return sizeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeLt() {
    return sizeLt;
  }


  public void setSizeLt(Long sizeLt) {
    this.sizeLt = sizeLt;
  }


  public LogCollectionWhereInput sizeLte(Long sizeLte) {
    
    this.sizeLte = sizeLte;
    return this;
  }

   /**
   * Get sizeLte
   * @return sizeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeLte() {
    return sizeLte;
  }


  public void setSizeLte(Long sizeLte) {
    this.sizeLte = sizeLte;
  }


  public LogCollectionWhereInput sizeNot(Long sizeNot) {
    
    this.sizeNot = sizeNot;
    return this;
  }

   /**
   * Get sizeNot
   * @return sizeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeNot() {
    return sizeNot;
  }


  public void setSizeNot(Long sizeNot) {
    this.sizeNot = sizeNot;
  }


  public LogCollectionWhereInput sizeNotIn(List<Long> sizeNotIn) {
    
    this.sizeNotIn = sizeNotIn;
    return this;
  }

  public LogCollectionWhereInput addSizeNotInItem(Long sizeNotInItem) {
    if (this.sizeNotIn == null) {
      this.sizeNotIn = new ArrayList<Long>();
    }
    this.sizeNotIn.add(sizeNotInItem);
    return this;
  }

   /**
   * Get sizeNotIn
   * @return sizeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getSizeNotIn() {
    return sizeNotIn;
  }


  public void setSizeNotIn(List<Long> sizeNotIn) {
    this.sizeNotIn = sizeNotIn;
  }


  public LogCollectionWhereInput startedAt(String startedAt) {
    
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


  public LogCollectionWhereInput startedAtGt(String startedAtGt) {
    
    this.startedAtGt = startedAtGt;
    return this;
  }

   /**
   * Get startedAtGt
   * @return startedAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedAtGt() {
    return startedAtGt;
  }


  public void setStartedAtGt(String startedAtGt) {
    this.startedAtGt = startedAtGt;
  }


  public LogCollectionWhereInput startedAtGte(String startedAtGte) {
    
    this.startedAtGte = startedAtGte;
    return this;
  }

   /**
   * Get startedAtGte
   * @return startedAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedAtGte() {
    return startedAtGte;
  }


  public void setStartedAtGte(String startedAtGte) {
    this.startedAtGte = startedAtGte;
  }


  public LogCollectionWhereInput startedAtIn(List<String> startedAtIn) {
    
    this.startedAtIn = startedAtIn;
    return this;
  }

  public LogCollectionWhereInput addStartedAtInItem(String startedAtInItem) {
    if (this.startedAtIn == null) {
      this.startedAtIn = new ArrayList<String>();
    }
    this.startedAtIn.add(startedAtInItem);
    return this;
  }

   /**
   * Get startedAtIn
   * @return startedAtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getStartedAtIn() {
    return startedAtIn;
  }


  public void setStartedAtIn(List<String> startedAtIn) {
    this.startedAtIn = startedAtIn;
  }


  public LogCollectionWhereInput startedAtLt(String startedAtLt) {
    
    this.startedAtLt = startedAtLt;
    return this;
  }

   /**
   * Get startedAtLt
   * @return startedAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedAtLt() {
    return startedAtLt;
  }


  public void setStartedAtLt(String startedAtLt) {
    this.startedAtLt = startedAtLt;
  }


  public LogCollectionWhereInput startedAtLte(String startedAtLte) {
    
    this.startedAtLte = startedAtLte;
    return this;
  }

   /**
   * Get startedAtLte
   * @return startedAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedAtLte() {
    return startedAtLte;
  }


  public void setStartedAtLte(String startedAtLte) {
    this.startedAtLte = startedAtLte;
  }


  public LogCollectionWhereInput startedAtNot(String startedAtNot) {
    
    this.startedAtNot = startedAtNot;
    return this;
  }

   /**
   * Get startedAtNot
   * @return startedAtNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedAtNot() {
    return startedAtNot;
  }


  public void setStartedAtNot(String startedAtNot) {
    this.startedAtNot = startedAtNot;
  }


  public LogCollectionWhereInput startedAtNotIn(List<String> startedAtNotIn) {
    
    this.startedAtNotIn = startedAtNotIn;
    return this;
  }

  public LogCollectionWhereInput addStartedAtNotInItem(String startedAtNotInItem) {
    if (this.startedAtNotIn == null) {
      this.startedAtNotIn = new ArrayList<String>();
    }
    this.startedAtNotIn.add(startedAtNotInItem);
    return this;
  }

   /**
   * Get startedAtNotIn
   * @return startedAtNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getStartedAtNotIn() {
    return startedAtNotIn;
  }


  public void setStartedAtNotIn(List<String> startedAtNotIn) {
    this.startedAtNotIn = startedAtNotIn;
  }


  public LogCollectionWhereInput status(LogCollectionStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LogCollectionStatus getStatus() {
    return status;
  }


  public void setStatus(LogCollectionStatus status) {
    this.status = status;
  }


  public LogCollectionWhereInput statusIn(List<LogCollectionStatus> statusIn) {
    
    this.statusIn = statusIn;
    return this;
  }

  public LogCollectionWhereInput addStatusInItem(LogCollectionStatus statusInItem) {
    if (this.statusIn == null) {
      this.statusIn = new ArrayList<LogCollectionStatus>();
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

  public List<LogCollectionStatus> getStatusIn() {
    return statusIn;
  }


  public void setStatusIn(List<LogCollectionStatus> statusIn) {
    this.statusIn = statusIn;
  }


  public LogCollectionWhereInput statusNot(LogCollectionStatus statusNot) {
    
    this.statusNot = statusNot;
    return this;
  }

   /**
   * Get statusNot
   * @return statusNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LogCollectionStatus getStatusNot() {
    return statusNot;
  }


  public void setStatusNot(LogCollectionStatus statusNot) {
    this.statusNot = statusNot;
  }


  public LogCollectionWhereInput statusNotIn(List<LogCollectionStatus> statusNotIn) {
    
    this.statusNotIn = statusNotIn;
    return this;
  }

  public LogCollectionWhereInput addStatusNotInItem(LogCollectionStatus statusNotInItem) {
    if (this.statusNotIn == null) {
      this.statusNotIn = new ArrayList<LogCollectionStatus>();
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

  public List<LogCollectionStatus> getStatusNotIn() {
    return statusNotIn;
  }


  public void setStatusNotIn(List<LogCollectionStatus> statusNotIn) {
    this.statusNotIn = statusNotIn;
  }


  public LogCollectionWhereInput witness(WitnessWhereInput witness) {
    
    this.witness = witness;
    return this;
  }

   /**
   * Get witness
   * @return witness
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WitnessWhereInput getWitness() {
    return witness;
  }


  public void setWitness(WitnessWhereInput witness) {
    this.witness = witness;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogCollectionWhereInput logCollectionWhereInput = (LogCollectionWhereInput) o;
    return Objects.equals(this.AND, logCollectionWhereInput.AND) &&
        Objects.equals(this.cluster, logCollectionWhereInput.cluster) &&
        Objects.equals(this.hostsEvery, logCollectionWhereInput.hostsEvery) &&
        Objects.equals(this.hostsNone, logCollectionWhereInput.hostsNone) &&
        Objects.equals(this.hostsSome, logCollectionWhereInput.hostsSome) &&
        Objects.equals(this.id, logCollectionWhereInput.id) &&
        Objects.equals(this.idContains, logCollectionWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, logCollectionWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, logCollectionWhereInput.idGt) &&
        Objects.equals(this.idGte, logCollectionWhereInput.idGte) &&
        Objects.equals(this.idIn, logCollectionWhereInput.idIn) &&
        Objects.equals(this.idLt, logCollectionWhereInput.idLt) &&
        Objects.equals(this.idLte, logCollectionWhereInput.idLte) &&
        Objects.equals(this.idNot, logCollectionWhereInput.idNot) &&
        Objects.equals(this.idNotContains, logCollectionWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, logCollectionWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, logCollectionWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, logCollectionWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, logCollectionWhereInput.idStartsWith) &&
        Objects.equals(this.localId, logCollectionWhereInput.localId) &&
        Objects.equals(this.localIdContains, logCollectionWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, logCollectionWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, logCollectionWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, logCollectionWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, logCollectionWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, logCollectionWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, logCollectionWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, logCollectionWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, logCollectionWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, logCollectionWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, logCollectionWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, logCollectionWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, logCollectionWhereInput.localIdStartsWith) &&
        Objects.equals(this.logEndedAt, logCollectionWhereInput.logEndedAt) &&
        Objects.equals(this.logEndedAtGt, logCollectionWhereInput.logEndedAtGt) &&
        Objects.equals(this.logEndedAtGte, logCollectionWhereInput.logEndedAtGte) &&
        Objects.equals(this.logEndedAtIn, logCollectionWhereInput.logEndedAtIn) &&
        Objects.equals(this.logEndedAtLt, logCollectionWhereInput.logEndedAtLt) &&
        Objects.equals(this.logEndedAtLte, logCollectionWhereInput.logEndedAtLte) &&
        Objects.equals(this.logEndedAtNot, logCollectionWhereInput.logEndedAtNot) &&
        Objects.equals(this.logEndedAtNotIn, logCollectionWhereInput.logEndedAtNotIn) &&
        Objects.equals(this.logStartedAt, logCollectionWhereInput.logStartedAt) &&
        Objects.equals(this.logStartedAtGt, logCollectionWhereInput.logStartedAtGt) &&
        Objects.equals(this.logStartedAtGte, logCollectionWhereInput.logStartedAtGte) &&
        Objects.equals(this.logStartedAtIn, logCollectionWhereInput.logStartedAtIn) &&
        Objects.equals(this.logStartedAtLt, logCollectionWhereInput.logStartedAtLt) &&
        Objects.equals(this.logStartedAtLte, logCollectionWhereInput.logStartedAtLte) &&
        Objects.equals(this.logStartedAtNot, logCollectionWhereInput.logStartedAtNot) &&
        Objects.equals(this.logStartedAtNotIn, logCollectionWhereInput.logStartedAtNotIn) &&
        Objects.equals(this.NOT, logCollectionWhereInput.NOT) &&
        Objects.equals(this.OR, logCollectionWhereInput.OR) &&
        Objects.equals(this.owner, logCollectionWhereInput.owner) &&
        Objects.equals(this.ownerContains, logCollectionWhereInput.ownerContains) &&
        Objects.equals(this.ownerEndsWith, logCollectionWhereInput.ownerEndsWith) &&
        Objects.equals(this.ownerGt, logCollectionWhereInput.ownerGt) &&
        Objects.equals(this.ownerGte, logCollectionWhereInput.ownerGte) &&
        Objects.equals(this.ownerIn, logCollectionWhereInput.ownerIn) &&
        Objects.equals(this.ownerLt, logCollectionWhereInput.ownerLt) &&
        Objects.equals(this.ownerLte, logCollectionWhereInput.ownerLte) &&
        Objects.equals(this.ownerNot, logCollectionWhereInput.ownerNot) &&
        Objects.equals(this.ownerNotContains, logCollectionWhereInput.ownerNotContains) &&
        Objects.equals(this.ownerNotEndsWith, logCollectionWhereInput.ownerNotEndsWith) &&
        Objects.equals(this.ownerNotIn, logCollectionWhereInput.ownerNotIn) &&
        Objects.equals(this.ownerNotStartsWith, logCollectionWhereInput.ownerNotStartsWith) &&
        Objects.equals(this.ownerStartsWith, logCollectionWhereInput.ownerStartsWith) &&
        Objects.equals(this.path, logCollectionWhereInput.path) &&
        Objects.equals(this.pathContains, logCollectionWhereInput.pathContains) &&
        Objects.equals(this.pathEndsWith, logCollectionWhereInput.pathEndsWith) &&
        Objects.equals(this.pathGt, logCollectionWhereInput.pathGt) &&
        Objects.equals(this.pathGte, logCollectionWhereInput.pathGte) &&
        Objects.equals(this.pathIn, logCollectionWhereInput.pathIn) &&
        Objects.equals(this.pathLt, logCollectionWhereInput.pathLt) &&
        Objects.equals(this.pathLte, logCollectionWhereInput.pathLte) &&
        Objects.equals(this.pathNot, logCollectionWhereInput.pathNot) &&
        Objects.equals(this.pathNotContains, logCollectionWhereInput.pathNotContains) &&
        Objects.equals(this.pathNotEndsWith, logCollectionWhereInput.pathNotEndsWith) &&
        Objects.equals(this.pathNotIn, logCollectionWhereInput.pathNotIn) &&
        Objects.equals(this.pathNotStartsWith, logCollectionWhereInput.pathNotStartsWith) &&
        Objects.equals(this.pathStartsWith, logCollectionWhereInput.pathStartsWith) &&
        Objects.equals(this.progress, logCollectionWhereInput.progress) &&
        Objects.equals(this.progressGt, logCollectionWhereInput.progressGt) &&
        Objects.equals(this.progressGte, logCollectionWhereInput.progressGte) &&
        Objects.equals(this.progressIn, logCollectionWhereInput.progressIn) &&
        Objects.equals(this.progressLt, logCollectionWhereInput.progressLt) &&
        Objects.equals(this.progressLte, logCollectionWhereInput.progressLte) &&
        Objects.equals(this.progressNot, logCollectionWhereInput.progressNot) &&
        Objects.equals(this.progressNotIn, logCollectionWhereInput.progressNotIn) &&
        Objects.equals(this.size, logCollectionWhereInput.size) &&
        Objects.equals(this.sizeGt, logCollectionWhereInput.sizeGt) &&
        Objects.equals(this.sizeGte, logCollectionWhereInput.sizeGte) &&
        Objects.equals(this.sizeIn, logCollectionWhereInput.sizeIn) &&
        Objects.equals(this.sizeLt, logCollectionWhereInput.sizeLt) &&
        Objects.equals(this.sizeLte, logCollectionWhereInput.sizeLte) &&
        Objects.equals(this.sizeNot, logCollectionWhereInput.sizeNot) &&
        Objects.equals(this.sizeNotIn, logCollectionWhereInput.sizeNotIn) &&
        Objects.equals(this.startedAt, logCollectionWhereInput.startedAt) &&
        Objects.equals(this.startedAtGt, logCollectionWhereInput.startedAtGt) &&
        Objects.equals(this.startedAtGte, logCollectionWhereInput.startedAtGte) &&
        Objects.equals(this.startedAtIn, logCollectionWhereInput.startedAtIn) &&
        Objects.equals(this.startedAtLt, logCollectionWhereInput.startedAtLt) &&
        Objects.equals(this.startedAtLte, logCollectionWhereInput.startedAtLte) &&
        Objects.equals(this.startedAtNot, logCollectionWhereInput.startedAtNot) &&
        Objects.equals(this.startedAtNotIn, logCollectionWhereInput.startedAtNotIn) &&
        Objects.equals(this.status, logCollectionWhereInput.status) &&
        Objects.equals(this.statusIn, logCollectionWhereInput.statusIn) &&
        Objects.equals(this.statusNot, logCollectionWhereInput.statusNot) &&
        Objects.equals(this.statusNotIn, logCollectionWhereInput.statusNotIn) &&
        Objects.equals(this.witness, logCollectionWhereInput.witness);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, cluster, hostsEvery, hostsNone, hostsSome, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, logEndedAt, logEndedAtGt, logEndedAtGte, logEndedAtIn, logEndedAtLt, logEndedAtLte, logEndedAtNot, logEndedAtNotIn, logStartedAt, logStartedAtGt, logStartedAtGte, logStartedAtIn, logStartedAtLt, logStartedAtLte, logStartedAtNot, logStartedAtNotIn, NOT, OR, owner, ownerContains, ownerEndsWith, ownerGt, ownerGte, ownerIn, ownerLt, ownerLte, ownerNot, ownerNotContains, ownerNotEndsWith, ownerNotIn, ownerNotStartsWith, ownerStartsWith, path, pathContains, pathEndsWith, pathGt, pathGte, pathIn, pathLt, pathLte, pathNot, pathNotContains, pathNotEndsWith, pathNotIn, pathNotStartsWith, pathStartsWith, progress, progressGt, progressGte, progressIn, progressLt, progressLte, progressNot, progressNotIn, size, sizeGt, sizeGte, sizeIn, sizeLt, sizeLte, sizeNot, sizeNotIn, startedAt, startedAtGt, startedAtGte, startedAtIn, startedAtLt, startedAtLte, startedAtNot, startedAtNotIn, status, statusIn, statusNot, statusNotIn, witness);
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
    sb.append("class LogCollectionWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    hostsEvery: ").append(toIndentedString(hostsEvery)).append("\n");
    sb.append("    hostsNone: ").append(toIndentedString(hostsNone)).append("\n");
    sb.append("    hostsSome: ").append(toIndentedString(hostsSome)).append("\n");
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
    sb.append("    logEndedAt: ").append(toIndentedString(logEndedAt)).append("\n");
    sb.append("    logEndedAtGt: ").append(toIndentedString(logEndedAtGt)).append("\n");
    sb.append("    logEndedAtGte: ").append(toIndentedString(logEndedAtGte)).append("\n");
    sb.append("    logEndedAtIn: ").append(toIndentedString(logEndedAtIn)).append("\n");
    sb.append("    logEndedAtLt: ").append(toIndentedString(logEndedAtLt)).append("\n");
    sb.append("    logEndedAtLte: ").append(toIndentedString(logEndedAtLte)).append("\n");
    sb.append("    logEndedAtNot: ").append(toIndentedString(logEndedAtNot)).append("\n");
    sb.append("    logEndedAtNotIn: ").append(toIndentedString(logEndedAtNotIn)).append("\n");
    sb.append("    logStartedAt: ").append(toIndentedString(logStartedAt)).append("\n");
    sb.append("    logStartedAtGt: ").append(toIndentedString(logStartedAtGt)).append("\n");
    sb.append("    logStartedAtGte: ").append(toIndentedString(logStartedAtGte)).append("\n");
    sb.append("    logStartedAtIn: ").append(toIndentedString(logStartedAtIn)).append("\n");
    sb.append("    logStartedAtLt: ").append(toIndentedString(logStartedAtLt)).append("\n");
    sb.append("    logStartedAtLte: ").append(toIndentedString(logStartedAtLte)).append("\n");
    sb.append("    logStartedAtNot: ").append(toIndentedString(logStartedAtNot)).append("\n");
    sb.append("    logStartedAtNotIn: ").append(toIndentedString(logStartedAtNotIn)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    ownerContains: ").append(toIndentedString(ownerContains)).append("\n");
    sb.append("    ownerEndsWith: ").append(toIndentedString(ownerEndsWith)).append("\n");
    sb.append("    ownerGt: ").append(toIndentedString(ownerGt)).append("\n");
    sb.append("    ownerGte: ").append(toIndentedString(ownerGte)).append("\n");
    sb.append("    ownerIn: ").append(toIndentedString(ownerIn)).append("\n");
    sb.append("    ownerLt: ").append(toIndentedString(ownerLt)).append("\n");
    sb.append("    ownerLte: ").append(toIndentedString(ownerLte)).append("\n");
    sb.append("    ownerNot: ").append(toIndentedString(ownerNot)).append("\n");
    sb.append("    ownerNotContains: ").append(toIndentedString(ownerNotContains)).append("\n");
    sb.append("    ownerNotEndsWith: ").append(toIndentedString(ownerNotEndsWith)).append("\n");
    sb.append("    ownerNotIn: ").append(toIndentedString(ownerNotIn)).append("\n");
    sb.append("    ownerNotStartsWith: ").append(toIndentedString(ownerNotStartsWith)).append("\n");
    sb.append("    ownerStartsWith: ").append(toIndentedString(ownerStartsWith)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pathContains: ").append(toIndentedString(pathContains)).append("\n");
    sb.append("    pathEndsWith: ").append(toIndentedString(pathEndsWith)).append("\n");
    sb.append("    pathGt: ").append(toIndentedString(pathGt)).append("\n");
    sb.append("    pathGte: ").append(toIndentedString(pathGte)).append("\n");
    sb.append("    pathIn: ").append(toIndentedString(pathIn)).append("\n");
    sb.append("    pathLt: ").append(toIndentedString(pathLt)).append("\n");
    sb.append("    pathLte: ").append(toIndentedString(pathLte)).append("\n");
    sb.append("    pathNot: ").append(toIndentedString(pathNot)).append("\n");
    sb.append("    pathNotContains: ").append(toIndentedString(pathNotContains)).append("\n");
    sb.append("    pathNotEndsWith: ").append(toIndentedString(pathNotEndsWith)).append("\n");
    sb.append("    pathNotIn: ").append(toIndentedString(pathNotIn)).append("\n");
    sb.append("    pathNotStartsWith: ").append(toIndentedString(pathNotStartsWith)).append("\n");
    sb.append("    pathStartsWith: ").append(toIndentedString(pathStartsWith)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    progressGt: ").append(toIndentedString(progressGt)).append("\n");
    sb.append("    progressGte: ").append(toIndentedString(progressGte)).append("\n");
    sb.append("    progressIn: ").append(toIndentedString(progressIn)).append("\n");
    sb.append("    progressLt: ").append(toIndentedString(progressLt)).append("\n");
    sb.append("    progressLte: ").append(toIndentedString(progressLte)).append("\n");
    sb.append("    progressNot: ").append(toIndentedString(progressNot)).append("\n");
    sb.append("    progressNotIn: ").append(toIndentedString(progressNotIn)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sizeGt: ").append(toIndentedString(sizeGt)).append("\n");
    sb.append("    sizeGte: ").append(toIndentedString(sizeGte)).append("\n");
    sb.append("    sizeIn: ").append(toIndentedString(sizeIn)).append("\n");
    sb.append("    sizeLt: ").append(toIndentedString(sizeLt)).append("\n");
    sb.append("    sizeLte: ").append(toIndentedString(sizeLte)).append("\n");
    sb.append("    sizeNot: ").append(toIndentedString(sizeNot)).append("\n");
    sb.append("    sizeNotIn: ").append(toIndentedString(sizeNotIn)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    startedAtGt: ").append(toIndentedString(startedAtGt)).append("\n");
    sb.append("    startedAtGte: ").append(toIndentedString(startedAtGte)).append("\n");
    sb.append("    startedAtIn: ").append(toIndentedString(startedAtIn)).append("\n");
    sb.append("    startedAtLt: ").append(toIndentedString(startedAtLt)).append("\n");
    sb.append("    startedAtLte: ").append(toIndentedString(startedAtLte)).append("\n");
    sb.append("    startedAtNot: ").append(toIndentedString(startedAtNot)).append("\n");
    sb.append("    startedAtNotIn: ").append(toIndentedString(startedAtNotIn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
    sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
    sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
    sb.append("    witness: ").append(toIndentedString(witness)).append("\n");
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

