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
import com.smartx.tower.model.LabelWhereInput;
import com.smartx.tower.model.NfsInodeWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NfsExportWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NfsExportWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<NfsExportWhereInput> AND = null;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private ClusterWhereInput cluster;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DESCRIPTION_CONTAINS = "description_contains";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_CONTAINS)
  private String descriptionContains;

  public static final String SERIALIZED_NAME_DESCRIPTION_ENDS_WITH = "description_ends_with";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH)
  private String descriptionEndsWith;

  public static final String SERIALIZED_NAME_DESCRIPTION_GT = "description_gt";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_GT)
  private String descriptionGt;

  public static final String SERIALIZED_NAME_DESCRIPTION_GTE = "description_gte";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_GTE)
  private String descriptionGte;

  public static final String SERIALIZED_NAME_DESCRIPTION_IN = "description_in";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_IN)
  private List<String> descriptionIn = null;

  public static final String SERIALIZED_NAME_DESCRIPTION_LT = "description_lt";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_LT)
  private String descriptionLt;

  public static final String SERIALIZED_NAME_DESCRIPTION_LTE = "description_lte";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_LTE)
  private String descriptionLte;

  public static final String SERIALIZED_NAME_DESCRIPTION_NOT = "description_not";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT)
  private String descriptionNot;

  public static final String SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS = "description_not_contains";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS)
  private String descriptionNotContains;

  public static final String SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH = "description_not_ends_with";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH)
  private String descriptionNotEndsWith;

  public static final String SERIALIZED_NAME_DESCRIPTION_NOT_IN = "description_not_in";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_IN)
  private List<String> descriptionNotIn = null;

  public static final String SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH = "description_not_starts_with";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH)
  private String descriptionNotStartsWith;

  public static final String SERIALIZED_NAME_DESCRIPTION_STARTS_WITH = "description_starts_with";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH)
  private String descriptionStartsWith;

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

  public static final String SERIALIZED_NAME_EXPORT_INODE_ID = "export_inode_id";
  @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID)
  private String exportInodeId;

  public static final String SERIALIZED_NAME_EXPORT_INODE_ID_CONTAINS = "export_inode_id_contains";
  @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_CONTAINS)
  private String exportInodeIdContains;

  public static final String SERIALIZED_NAME_EXPORT_INODE_ID_ENDS_WITH = "export_inode_id_ends_with";
  @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_ENDS_WITH)
  private String exportInodeIdEndsWith;

  public static final String SERIALIZED_NAME_EXPORT_INODE_ID_GT = "export_inode_id_gt";
  @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_GT)
  private String exportInodeIdGt;

  public static final String SERIALIZED_NAME_EXPORT_INODE_ID_GTE = "export_inode_id_gte";
  @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_GTE)
  private String exportInodeIdGte;

  public static final String SERIALIZED_NAME_EXPORT_INODE_ID_IN = "export_inode_id_in";
  @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_IN)
  private List<String> exportInodeIdIn = null;

  public static final String SERIALIZED_NAME_EXPORT_INODE_ID_LT = "export_inode_id_lt";
  @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_LT)
  private String exportInodeIdLt;

  public static final String SERIALIZED_NAME_EXPORT_INODE_ID_LTE = "export_inode_id_lte";
  @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_LTE)
  private String exportInodeIdLte;

  public static final String SERIALIZED_NAME_EXPORT_INODE_ID_NOT = "export_inode_id_not";
  @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_NOT)
  private String exportInodeIdNot;

  public static final String SERIALIZED_NAME_EXPORT_INODE_ID_NOT_CONTAINS = "export_inode_id_not_contains";
  @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_CONTAINS)
  private String exportInodeIdNotContains;

  public static final String SERIALIZED_NAME_EXPORT_INODE_ID_NOT_ENDS_WITH = "export_inode_id_not_ends_with";
  @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_ENDS_WITH)
  private String exportInodeIdNotEndsWith;

  public static final String SERIALIZED_NAME_EXPORT_INODE_ID_NOT_IN = "export_inode_id_not_in";
  @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_IN)
  private List<String> exportInodeIdNotIn = null;

  public static final String SERIALIZED_NAME_EXPORT_INODE_ID_NOT_STARTS_WITH = "export_inode_id_not_starts_with";
  @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_STARTS_WITH)
  private String exportInodeIdNotStartsWith;

  public static final String SERIALIZED_NAME_EXPORT_INODE_ID_STARTS_WITH = "export_inode_id_starts_with";
  @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_STARTS_WITH)
  private String exportInodeIdStartsWith;

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

  public static final String SERIALIZED_NAME_INODES_EVERY = "inodes_every";
  @SerializedName(SERIALIZED_NAME_INODES_EVERY)
  private NfsInodeWhereInput inodesEvery;

  public static final String SERIALIZED_NAME_INODES_NONE = "inodes_none";
  @SerializedName(SERIALIZED_NAME_INODES_NONE)
  private NfsInodeWhereInput inodesNone;

  public static final String SERIALIZED_NAME_INODES_SOME = "inodes_some";
  @SerializedName(SERIALIZED_NAME_INODES_SOME)
  private NfsInodeWhereInput inodesSome;

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_INTERNAL_NOT = "internal_not";
  @SerializedName(SERIALIZED_NAME_INTERNAL_NOT)
  private Boolean internalNot;

  public static final String SERIALIZED_NAME_IP_WHITELIST = "ip_whitelist";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST)
  private String ipWhitelist;

  public static final String SERIALIZED_NAME_IP_WHITELIST_CONTAINS = "ip_whitelist_contains";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_CONTAINS)
  private String ipWhitelistContains;

  public static final String SERIALIZED_NAME_IP_WHITELIST_ENDS_WITH = "ip_whitelist_ends_with";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_ENDS_WITH)
  private String ipWhitelistEndsWith;

  public static final String SERIALIZED_NAME_IP_WHITELIST_GT = "ip_whitelist_gt";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_GT)
  private String ipWhitelistGt;

  public static final String SERIALIZED_NAME_IP_WHITELIST_GTE = "ip_whitelist_gte";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_GTE)
  private String ipWhitelistGte;

  public static final String SERIALIZED_NAME_IP_WHITELIST_IN = "ip_whitelist_in";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_IN)
  private List<String> ipWhitelistIn = null;

  public static final String SERIALIZED_NAME_IP_WHITELIST_LT = "ip_whitelist_lt";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_LT)
  private String ipWhitelistLt;

  public static final String SERIALIZED_NAME_IP_WHITELIST_LTE = "ip_whitelist_lte";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_LTE)
  private String ipWhitelistLte;

  public static final String SERIALIZED_NAME_IP_WHITELIST_NOT = "ip_whitelist_not";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_NOT)
  private String ipWhitelistNot;

  public static final String SERIALIZED_NAME_IP_WHITELIST_NOT_CONTAINS = "ip_whitelist_not_contains";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_NOT_CONTAINS)
  private String ipWhitelistNotContains;

  public static final String SERIALIZED_NAME_IP_WHITELIST_NOT_ENDS_WITH = "ip_whitelist_not_ends_with";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_NOT_ENDS_WITH)
  private String ipWhitelistNotEndsWith;

  public static final String SERIALIZED_NAME_IP_WHITELIST_NOT_IN = "ip_whitelist_not_in";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_NOT_IN)
  private List<String> ipWhitelistNotIn = null;

  public static final String SERIALIZED_NAME_IP_WHITELIST_NOT_STARTS_WITH = "ip_whitelist_not_starts_with";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_NOT_STARTS_WITH)
  private String ipWhitelistNotStartsWith;

  public static final String SERIALIZED_NAME_IP_WHITELIST_STARTS_WITH = "ip_whitelist_starts_with";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_STARTS_WITH)
  private String ipWhitelistStartsWith;

  public static final String SERIALIZED_NAME_LABELS_EVERY = "labels_every";
  @SerializedName(SERIALIZED_NAME_LABELS_EVERY)
  private LabelWhereInput labelsEvery;

  public static final String SERIALIZED_NAME_LABELS_NONE = "labels_none";
  @SerializedName(SERIALIZED_NAME_LABELS_NONE)
  private LabelWhereInput labelsNone;

  public static final String SERIALIZED_NAME_LABELS_SOME = "labels_some";
  @SerializedName(SERIALIZED_NAME_LABELS_SOME)
  private LabelWhereInput labelsSome;

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
  private List<NfsExportWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<NfsExportWhereInput> OR = null;

  public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
  private Integer replicaNum;

  public static final String SERIALIZED_NAME_REPLICA_NUM_GT = "replica_num_gt";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM_GT)
  private Integer replicaNumGt;

  public static final String SERIALIZED_NAME_REPLICA_NUM_GTE = "replica_num_gte";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM_GTE)
  private Integer replicaNumGte;

  public static final String SERIALIZED_NAME_REPLICA_NUM_IN = "replica_num_in";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM_IN)
  private List<Integer> replicaNumIn = null;

  public static final String SERIALIZED_NAME_REPLICA_NUM_LT = "replica_num_lt";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM_LT)
  private Integer replicaNumLt;

  public static final String SERIALIZED_NAME_REPLICA_NUM_LTE = "replica_num_lte";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM_LTE)
  private Integer replicaNumLte;

  public static final String SERIALIZED_NAME_REPLICA_NUM_NOT = "replica_num_not";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM_NOT)
  private Integer replicaNumNot;

  public static final String SERIALIZED_NAME_REPLICA_NUM_NOT_IN = "replica_num_not_in";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM_NOT_IN)
  private List<Integer> replicaNumNotIn = null;

  public static final String SERIALIZED_NAME_THIN_PROVISION = "thin_provision";
  @SerializedName(SERIALIZED_NAME_THIN_PROVISION)
  private Boolean thinProvision;

  public static final String SERIALIZED_NAME_THIN_PROVISION_NOT = "thin_provision_not";
  @SerializedName(SERIALIZED_NAME_THIN_PROVISION_NOT)
  private Boolean thinProvisionNot;

  public NfsExportWhereInput() { 
  }

  public NfsExportWhereInput AND(List<NfsExportWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public NfsExportWhereInput addANDItem(NfsExportWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<NfsExportWhereInput>();
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

  public List<NfsExportWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<NfsExportWhereInput> AND) {
    this.AND = AND;
  }


  public NfsExportWhereInput cluster(ClusterWhereInput cluster) {
    
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


  public NfsExportWhereInput description(String description) {
    
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


  public NfsExportWhereInput descriptionContains(String descriptionContains) {
    
    this.descriptionContains = descriptionContains;
    return this;
  }

   /**
   * Get descriptionContains
   * @return descriptionContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionContains() {
    return descriptionContains;
  }


  public void setDescriptionContains(String descriptionContains) {
    this.descriptionContains = descriptionContains;
  }


  public NfsExportWhereInput descriptionEndsWith(String descriptionEndsWith) {
    
    this.descriptionEndsWith = descriptionEndsWith;
    return this;
  }

   /**
   * Get descriptionEndsWith
   * @return descriptionEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionEndsWith() {
    return descriptionEndsWith;
  }


  public void setDescriptionEndsWith(String descriptionEndsWith) {
    this.descriptionEndsWith = descriptionEndsWith;
  }


  public NfsExportWhereInput descriptionGt(String descriptionGt) {
    
    this.descriptionGt = descriptionGt;
    return this;
  }

   /**
   * Get descriptionGt
   * @return descriptionGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionGt() {
    return descriptionGt;
  }


  public void setDescriptionGt(String descriptionGt) {
    this.descriptionGt = descriptionGt;
  }


  public NfsExportWhereInput descriptionGte(String descriptionGte) {
    
    this.descriptionGte = descriptionGte;
    return this;
  }

   /**
   * Get descriptionGte
   * @return descriptionGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionGte() {
    return descriptionGte;
  }


  public void setDescriptionGte(String descriptionGte) {
    this.descriptionGte = descriptionGte;
  }


  public NfsExportWhereInput descriptionIn(List<String> descriptionIn) {
    
    this.descriptionIn = descriptionIn;
    return this;
  }

  public NfsExportWhereInput addDescriptionInItem(String descriptionInItem) {
    if (this.descriptionIn == null) {
      this.descriptionIn = new ArrayList<String>();
    }
    this.descriptionIn.add(descriptionInItem);
    return this;
  }

   /**
   * Get descriptionIn
   * @return descriptionIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDescriptionIn() {
    return descriptionIn;
  }


  public void setDescriptionIn(List<String> descriptionIn) {
    this.descriptionIn = descriptionIn;
  }


  public NfsExportWhereInput descriptionLt(String descriptionLt) {
    
    this.descriptionLt = descriptionLt;
    return this;
  }

   /**
   * Get descriptionLt
   * @return descriptionLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionLt() {
    return descriptionLt;
  }


  public void setDescriptionLt(String descriptionLt) {
    this.descriptionLt = descriptionLt;
  }


  public NfsExportWhereInput descriptionLte(String descriptionLte) {
    
    this.descriptionLte = descriptionLte;
    return this;
  }

   /**
   * Get descriptionLte
   * @return descriptionLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionLte() {
    return descriptionLte;
  }


  public void setDescriptionLte(String descriptionLte) {
    this.descriptionLte = descriptionLte;
  }


  public NfsExportWhereInput descriptionNot(String descriptionNot) {
    
    this.descriptionNot = descriptionNot;
    return this;
  }

   /**
   * Get descriptionNot
   * @return descriptionNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionNot() {
    return descriptionNot;
  }


  public void setDescriptionNot(String descriptionNot) {
    this.descriptionNot = descriptionNot;
  }


  public NfsExportWhereInput descriptionNotContains(String descriptionNotContains) {
    
    this.descriptionNotContains = descriptionNotContains;
    return this;
  }

   /**
   * Get descriptionNotContains
   * @return descriptionNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionNotContains() {
    return descriptionNotContains;
  }


  public void setDescriptionNotContains(String descriptionNotContains) {
    this.descriptionNotContains = descriptionNotContains;
  }


  public NfsExportWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {
    
    this.descriptionNotEndsWith = descriptionNotEndsWith;
    return this;
  }

   /**
   * Get descriptionNotEndsWith
   * @return descriptionNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionNotEndsWith() {
    return descriptionNotEndsWith;
  }


  public void setDescriptionNotEndsWith(String descriptionNotEndsWith) {
    this.descriptionNotEndsWith = descriptionNotEndsWith;
  }


  public NfsExportWhereInput descriptionNotIn(List<String> descriptionNotIn) {
    
    this.descriptionNotIn = descriptionNotIn;
    return this;
  }

  public NfsExportWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
    if (this.descriptionNotIn == null) {
      this.descriptionNotIn = new ArrayList<String>();
    }
    this.descriptionNotIn.add(descriptionNotInItem);
    return this;
  }

   /**
   * Get descriptionNotIn
   * @return descriptionNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDescriptionNotIn() {
    return descriptionNotIn;
  }


  public void setDescriptionNotIn(List<String> descriptionNotIn) {
    this.descriptionNotIn = descriptionNotIn;
  }


  public NfsExportWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {
    
    this.descriptionNotStartsWith = descriptionNotStartsWith;
    return this;
  }

   /**
   * Get descriptionNotStartsWith
   * @return descriptionNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionNotStartsWith() {
    return descriptionNotStartsWith;
  }


  public void setDescriptionNotStartsWith(String descriptionNotStartsWith) {
    this.descriptionNotStartsWith = descriptionNotStartsWith;
  }


  public NfsExportWhereInput descriptionStartsWith(String descriptionStartsWith) {
    
    this.descriptionStartsWith = descriptionStartsWith;
    return this;
  }

   /**
   * Get descriptionStartsWith
   * @return descriptionStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionStartsWith() {
    return descriptionStartsWith;
  }


  public void setDescriptionStartsWith(String descriptionStartsWith) {
    this.descriptionStartsWith = descriptionStartsWith;
  }


  public NfsExportWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public NfsExportWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public NfsExportWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public NfsExportWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public NfsExportWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public NfsExportWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public NfsExportWhereInput exportInodeId(String exportInodeId) {
    
    this.exportInodeId = exportInodeId;
    return this;
  }

   /**
   * Get exportInodeId
   * @return exportInodeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExportInodeId() {
    return exportInodeId;
  }


  public void setExportInodeId(String exportInodeId) {
    this.exportInodeId = exportInodeId;
  }


  public NfsExportWhereInput exportInodeIdContains(String exportInodeIdContains) {
    
    this.exportInodeIdContains = exportInodeIdContains;
    return this;
  }

   /**
   * Get exportInodeIdContains
   * @return exportInodeIdContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExportInodeIdContains() {
    return exportInodeIdContains;
  }


  public void setExportInodeIdContains(String exportInodeIdContains) {
    this.exportInodeIdContains = exportInodeIdContains;
  }


  public NfsExportWhereInput exportInodeIdEndsWith(String exportInodeIdEndsWith) {
    
    this.exportInodeIdEndsWith = exportInodeIdEndsWith;
    return this;
  }

   /**
   * Get exportInodeIdEndsWith
   * @return exportInodeIdEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExportInodeIdEndsWith() {
    return exportInodeIdEndsWith;
  }


  public void setExportInodeIdEndsWith(String exportInodeIdEndsWith) {
    this.exportInodeIdEndsWith = exportInodeIdEndsWith;
  }


  public NfsExportWhereInput exportInodeIdGt(String exportInodeIdGt) {
    
    this.exportInodeIdGt = exportInodeIdGt;
    return this;
  }

   /**
   * Get exportInodeIdGt
   * @return exportInodeIdGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExportInodeIdGt() {
    return exportInodeIdGt;
  }


  public void setExportInodeIdGt(String exportInodeIdGt) {
    this.exportInodeIdGt = exportInodeIdGt;
  }


  public NfsExportWhereInput exportInodeIdGte(String exportInodeIdGte) {
    
    this.exportInodeIdGte = exportInodeIdGte;
    return this;
  }

   /**
   * Get exportInodeIdGte
   * @return exportInodeIdGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExportInodeIdGte() {
    return exportInodeIdGte;
  }


  public void setExportInodeIdGte(String exportInodeIdGte) {
    this.exportInodeIdGte = exportInodeIdGte;
  }


  public NfsExportWhereInput exportInodeIdIn(List<String> exportInodeIdIn) {
    
    this.exportInodeIdIn = exportInodeIdIn;
    return this;
  }

  public NfsExportWhereInput addExportInodeIdInItem(String exportInodeIdInItem) {
    if (this.exportInodeIdIn == null) {
      this.exportInodeIdIn = new ArrayList<String>();
    }
    this.exportInodeIdIn.add(exportInodeIdInItem);
    return this;
  }

   /**
   * Get exportInodeIdIn
   * @return exportInodeIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getExportInodeIdIn() {
    return exportInodeIdIn;
  }


  public void setExportInodeIdIn(List<String> exportInodeIdIn) {
    this.exportInodeIdIn = exportInodeIdIn;
  }


  public NfsExportWhereInput exportInodeIdLt(String exportInodeIdLt) {
    
    this.exportInodeIdLt = exportInodeIdLt;
    return this;
  }

   /**
   * Get exportInodeIdLt
   * @return exportInodeIdLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExportInodeIdLt() {
    return exportInodeIdLt;
  }


  public void setExportInodeIdLt(String exportInodeIdLt) {
    this.exportInodeIdLt = exportInodeIdLt;
  }


  public NfsExportWhereInput exportInodeIdLte(String exportInodeIdLte) {
    
    this.exportInodeIdLte = exportInodeIdLte;
    return this;
  }

   /**
   * Get exportInodeIdLte
   * @return exportInodeIdLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExportInodeIdLte() {
    return exportInodeIdLte;
  }


  public void setExportInodeIdLte(String exportInodeIdLte) {
    this.exportInodeIdLte = exportInodeIdLte;
  }


  public NfsExportWhereInput exportInodeIdNot(String exportInodeIdNot) {
    
    this.exportInodeIdNot = exportInodeIdNot;
    return this;
  }

   /**
   * Get exportInodeIdNot
   * @return exportInodeIdNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExportInodeIdNot() {
    return exportInodeIdNot;
  }


  public void setExportInodeIdNot(String exportInodeIdNot) {
    this.exportInodeIdNot = exportInodeIdNot;
  }


  public NfsExportWhereInput exportInodeIdNotContains(String exportInodeIdNotContains) {
    
    this.exportInodeIdNotContains = exportInodeIdNotContains;
    return this;
  }

   /**
   * Get exportInodeIdNotContains
   * @return exportInodeIdNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExportInodeIdNotContains() {
    return exportInodeIdNotContains;
  }


  public void setExportInodeIdNotContains(String exportInodeIdNotContains) {
    this.exportInodeIdNotContains = exportInodeIdNotContains;
  }


  public NfsExportWhereInput exportInodeIdNotEndsWith(String exportInodeIdNotEndsWith) {
    
    this.exportInodeIdNotEndsWith = exportInodeIdNotEndsWith;
    return this;
  }

   /**
   * Get exportInodeIdNotEndsWith
   * @return exportInodeIdNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExportInodeIdNotEndsWith() {
    return exportInodeIdNotEndsWith;
  }


  public void setExportInodeIdNotEndsWith(String exportInodeIdNotEndsWith) {
    this.exportInodeIdNotEndsWith = exportInodeIdNotEndsWith;
  }


  public NfsExportWhereInput exportInodeIdNotIn(List<String> exportInodeIdNotIn) {
    
    this.exportInodeIdNotIn = exportInodeIdNotIn;
    return this;
  }

  public NfsExportWhereInput addExportInodeIdNotInItem(String exportInodeIdNotInItem) {
    if (this.exportInodeIdNotIn == null) {
      this.exportInodeIdNotIn = new ArrayList<String>();
    }
    this.exportInodeIdNotIn.add(exportInodeIdNotInItem);
    return this;
  }

   /**
   * Get exportInodeIdNotIn
   * @return exportInodeIdNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getExportInodeIdNotIn() {
    return exportInodeIdNotIn;
  }


  public void setExportInodeIdNotIn(List<String> exportInodeIdNotIn) {
    this.exportInodeIdNotIn = exportInodeIdNotIn;
  }


  public NfsExportWhereInput exportInodeIdNotStartsWith(String exportInodeIdNotStartsWith) {
    
    this.exportInodeIdNotStartsWith = exportInodeIdNotStartsWith;
    return this;
  }

   /**
   * Get exportInodeIdNotStartsWith
   * @return exportInodeIdNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExportInodeIdNotStartsWith() {
    return exportInodeIdNotStartsWith;
  }


  public void setExportInodeIdNotStartsWith(String exportInodeIdNotStartsWith) {
    this.exportInodeIdNotStartsWith = exportInodeIdNotStartsWith;
  }


  public NfsExportWhereInput exportInodeIdStartsWith(String exportInodeIdStartsWith) {
    
    this.exportInodeIdStartsWith = exportInodeIdStartsWith;
    return this;
  }

   /**
   * Get exportInodeIdStartsWith
   * @return exportInodeIdStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExportInodeIdStartsWith() {
    return exportInodeIdStartsWith;
  }


  public void setExportInodeIdStartsWith(String exportInodeIdStartsWith) {
    this.exportInodeIdStartsWith = exportInodeIdStartsWith;
  }


  public NfsExportWhereInput id(String id) {
    
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


  public NfsExportWhereInput idContains(String idContains) {
    
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


  public NfsExportWhereInput idEndsWith(String idEndsWith) {
    
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


  public NfsExportWhereInput idGt(String idGt) {
    
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


  public NfsExportWhereInput idGte(String idGte) {
    
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


  public NfsExportWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public NfsExportWhereInput addIdInItem(String idInItem) {
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


  public NfsExportWhereInput idLt(String idLt) {
    
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


  public NfsExportWhereInput idLte(String idLte) {
    
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


  public NfsExportWhereInput idNot(String idNot) {
    
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


  public NfsExportWhereInput idNotContains(String idNotContains) {
    
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


  public NfsExportWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public NfsExportWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public NfsExportWhereInput addIdNotInItem(String idNotInItem) {
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


  public NfsExportWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public NfsExportWhereInput idStartsWith(String idStartsWith) {
    
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


  public NfsExportWhereInput inodesEvery(NfsInodeWhereInput inodesEvery) {
    
    this.inodesEvery = inodesEvery;
    return this;
  }

   /**
   * Get inodesEvery
   * @return inodesEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NfsInodeWhereInput getInodesEvery() {
    return inodesEvery;
  }


  public void setInodesEvery(NfsInodeWhereInput inodesEvery) {
    this.inodesEvery = inodesEvery;
  }


  public NfsExportWhereInput inodesNone(NfsInodeWhereInput inodesNone) {
    
    this.inodesNone = inodesNone;
    return this;
  }

   /**
   * Get inodesNone
   * @return inodesNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NfsInodeWhereInput getInodesNone() {
    return inodesNone;
  }


  public void setInodesNone(NfsInodeWhereInput inodesNone) {
    this.inodesNone = inodesNone;
  }


  public NfsExportWhereInput inodesSome(NfsInodeWhereInput inodesSome) {
    
    this.inodesSome = inodesSome;
    return this;
  }

   /**
   * Get inodesSome
   * @return inodesSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NfsInodeWhereInput getInodesSome() {
    return inodesSome;
  }


  public void setInodesSome(NfsInodeWhereInput inodesSome) {
    this.inodesSome = inodesSome;
  }


  public NfsExportWhereInput internal(Boolean internal) {
    
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


  public NfsExportWhereInput internalNot(Boolean internalNot) {
    
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


  public NfsExportWhereInput ipWhitelist(String ipWhitelist) {
    
    this.ipWhitelist = ipWhitelist;
    return this;
  }

   /**
   * Get ipWhitelist
   * @return ipWhitelist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelist() {
    return ipWhitelist;
  }


  public void setIpWhitelist(String ipWhitelist) {
    this.ipWhitelist = ipWhitelist;
  }


  public NfsExportWhereInput ipWhitelistContains(String ipWhitelistContains) {
    
    this.ipWhitelistContains = ipWhitelistContains;
    return this;
  }

   /**
   * Get ipWhitelistContains
   * @return ipWhitelistContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistContains() {
    return ipWhitelistContains;
  }


  public void setIpWhitelistContains(String ipWhitelistContains) {
    this.ipWhitelistContains = ipWhitelistContains;
  }


  public NfsExportWhereInput ipWhitelistEndsWith(String ipWhitelistEndsWith) {
    
    this.ipWhitelistEndsWith = ipWhitelistEndsWith;
    return this;
  }

   /**
   * Get ipWhitelistEndsWith
   * @return ipWhitelistEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistEndsWith() {
    return ipWhitelistEndsWith;
  }


  public void setIpWhitelistEndsWith(String ipWhitelistEndsWith) {
    this.ipWhitelistEndsWith = ipWhitelistEndsWith;
  }


  public NfsExportWhereInput ipWhitelistGt(String ipWhitelistGt) {
    
    this.ipWhitelistGt = ipWhitelistGt;
    return this;
  }

   /**
   * Get ipWhitelistGt
   * @return ipWhitelistGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistGt() {
    return ipWhitelistGt;
  }


  public void setIpWhitelistGt(String ipWhitelistGt) {
    this.ipWhitelistGt = ipWhitelistGt;
  }


  public NfsExportWhereInput ipWhitelistGte(String ipWhitelistGte) {
    
    this.ipWhitelistGte = ipWhitelistGte;
    return this;
  }

   /**
   * Get ipWhitelistGte
   * @return ipWhitelistGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistGte() {
    return ipWhitelistGte;
  }


  public void setIpWhitelistGte(String ipWhitelistGte) {
    this.ipWhitelistGte = ipWhitelistGte;
  }


  public NfsExportWhereInput ipWhitelistIn(List<String> ipWhitelistIn) {
    
    this.ipWhitelistIn = ipWhitelistIn;
    return this;
  }

  public NfsExportWhereInput addIpWhitelistInItem(String ipWhitelistInItem) {
    if (this.ipWhitelistIn == null) {
      this.ipWhitelistIn = new ArrayList<String>();
    }
    this.ipWhitelistIn.add(ipWhitelistInItem);
    return this;
  }

   /**
   * Get ipWhitelistIn
   * @return ipWhitelistIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIpWhitelistIn() {
    return ipWhitelistIn;
  }


  public void setIpWhitelistIn(List<String> ipWhitelistIn) {
    this.ipWhitelistIn = ipWhitelistIn;
  }


  public NfsExportWhereInput ipWhitelistLt(String ipWhitelistLt) {
    
    this.ipWhitelistLt = ipWhitelistLt;
    return this;
  }

   /**
   * Get ipWhitelistLt
   * @return ipWhitelistLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistLt() {
    return ipWhitelistLt;
  }


  public void setIpWhitelistLt(String ipWhitelistLt) {
    this.ipWhitelistLt = ipWhitelistLt;
  }


  public NfsExportWhereInput ipWhitelistLte(String ipWhitelistLte) {
    
    this.ipWhitelistLte = ipWhitelistLte;
    return this;
  }

   /**
   * Get ipWhitelistLte
   * @return ipWhitelistLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistLte() {
    return ipWhitelistLte;
  }


  public void setIpWhitelistLte(String ipWhitelistLte) {
    this.ipWhitelistLte = ipWhitelistLte;
  }


  public NfsExportWhereInput ipWhitelistNot(String ipWhitelistNot) {
    
    this.ipWhitelistNot = ipWhitelistNot;
    return this;
  }

   /**
   * Get ipWhitelistNot
   * @return ipWhitelistNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistNot() {
    return ipWhitelistNot;
  }


  public void setIpWhitelistNot(String ipWhitelistNot) {
    this.ipWhitelistNot = ipWhitelistNot;
  }


  public NfsExportWhereInput ipWhitelistNotContains(String ipWhitelistNotContains) {
    
    this.ipWhitelistNotContains = ipWhitelistNotContains;
    return this;
  }

   /**
   * Get ipWhitelistNotContains
   * @return ipWhitelistNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistNotContains() {
    return ipWhitelistNotContains;
  }


  public void setIpWhitelistNotContains(String ipWhitelistNotContains) {
    this.ipWhitelistNotContains = ipWhitelistNotContains;
  }


  public NfsExportWhereInput ipWhitelistNotEndsWith(String ipWhitelistNotEndsWith) {
    
    this.ipWhitelistNotEndsWith = ipWhitelistNotEndsWith;
    return this;
  }

   /**
   * Get ipWhitelistNotEndsWith
   * @return ipWhitelistNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistNotEndsWith() {
    return ipWhitelistNotEndsWith;
  }


  public void setIpWhitelistNotEndsWith(String ipWhitelistNotEndsWith) {
    this.ipWhitelistNotEndsWith = ipWhitelistNotEndsWith;
  }


  public NfsExportWhereInput ipWhitelistNotIn(List<String> ipWhitelistNotIn) {
    
    this.ipWhitelistNotIn = ipWhitelistNotIn;
    return this;
  }

  public NfsExportWhereInput addIpWhitelistNotInItem(String ipWhitelistNotInItem) {
    if (this.ipWhitelistNotIn == null) {
      this.ipWhitelistNotIn = new ArrayList<String>();
    }
    this.ipWhitelistNotIn.add(ipWhitelistNotInItem);
    return this;
  }

   /**
   * Get ipWhitelistNotIn
   * @return ipWhitelistNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIpWhitelistNotIn() {
    return ipWhitelistNotIn;
  }


  public void setIpWhitelistNotIn(List<String> ipWhitelistNotIn) {
    this.ipWhitelistNotIn = ipWhitelistNotIn;
  }


  public NfsExportWhereInput ipWhitelistNotStartsWith(String ipWhitelistNotStartsWith) {
    
    this.ipWhitelistNotStartsWith = ipWhitelistNotStartsWith;
    return this;
  }

   /**
   * Get ipWhitelistNotStartsWith
   * @return ipWhitelistNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistNotStartsWith() {
    return ipWhitelistNotStartsWith;
  }


  public void setIpWhitelistNotStartsWith(String ipWhitelistNotStartsWith) {
    this.ipWhitelistNotStartsWith = ipWhitelistNotStartsWith;
  }


  public NfsExportWhereInput ipWhitelistStartsWith(String ipWhitelistStartsWith) {
    
    this.ipWhitelistStartsWith = ipWhitelistStartsWith;
    return this;
  }

   /**
   * Get ipWhitelistStartsWith
   * @return ipWhitelistStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistStartsWith() {
    return ipWhitelistStartsWith;
  }


  public void setIpWhitelistStartsWith(String ipWhitelistStartsWith) {
    this.ipWhitelistStartsWith = ipWhitelistStartsWith;
  }


  public NfsExportWhereInput labelsEvery(LabelWhereInput labelsEvery) {
    
    this.labelsEvery = labelsEvery;
    return this;
  }

   /**
   * Get labelsEvery
   * @return labelsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LabelWhereInput getLabelsEvery() {
    return labelsEvery;
  }


  public void setLabelsEvery(LabelWhereInput labelsEvery) {
    this.labelsEvery = labelsEvery;
  }


  public NfsExportWhereInput labelsNone(LabelWhereInput labelsNone) {
    
    this.labelsNone = labelsNone;
    return this;
  }

   /**
   * Get labelsNone
   * @return labelsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LabelWhereInput getLabelsNone() {
    return labelsNone;
  }


  public void setLabelsNone(LabelWhereInput labelsNone) {
    this.labelsNone = labelsNone;
  }


  public NfsExportWhereInput labelsSome(LabelWhereInput labelsSome) {
    
    this.labelsSome = labelsSome;
    return this;
  }

   /**
   * Get labelsSome
   * @return labelsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LabelWhereInput getLabelsSome() {
    return labelsSome;
  }


  public void setLabelsSome(LabelWhereInput labelsSome) {
    this.labelsSome = labelsSome;
  }


  public NfsExportWhereInput localId(String localId) {
    
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


  public NfsExportWhereInput localIdContains(String localIdContains) {
    
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


  public NfsExportWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public NfsExportWhereInput localIdGt(String localIdGt) {
    
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


  public NfsExportWhereInput localIdGte(String localIdGte) {
    
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


  public NfsExportWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public NfsExportWhereInput addLocalIdInItem(String localIdInItem) {
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


  public NfsExportWhereInput localIdLt(String localIdLt) {
    
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


  public NfsExportWhereInput localIdLte(String localIdLte) {
    
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


  public NfsExportWhereInput localIdNot(String localIdNot) {
    
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


  public NfsExportWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public NfsExportWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public NfsExportWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public NfsExportWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public NfsExportWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public NfsExportWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public NfsExportWhereInput name(String name) {
    
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


  public NfsExportWhereInput nameContains(String nameContains) {
    
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


  public NfsExportWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public NfsExportWhereInput nameGt(String nameGt) {
    
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


  public NfsExportWhereInput nameGte(String nameGte) {
    
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


  public NfsExportWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public NfsExportWhereInput addNameInItem(String nameInItem) {
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


  public NfsExportWhereInput nameLt(String nameLt) {
    
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


  public NfsExportWhereInput nameLte(String nameLte) {
    
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


  public NfsExportWhereInput nameNot(String nameNot) {
    
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


  public NfsExportWhereInput nameNotContains(String nameNotContains) {
    
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


  public NfsExportWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public NfsExportWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public NfsExportWhereInput addNameNotInItem(String nameNotInItem) {
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


  public NfsExportWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public NfsExportWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public NfsExportWhereInput NOT(List<NfsExportWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public NfsExportWhereInput addNOTItem(NfsExportWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<NfsExportWhereInput>();
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

  public List<NfsExportWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<NfsExportWhereInput> NOT) {
    this.NOT = NOT;
  }


  public NfsExportWhereInput OR(List<NfsExportWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public NfsExportWhereInput addORItem(NfsExportWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<NfsExportWhereInput>();
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

  public List<NfsExportWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<NfsExportWhereInput> OR) {
    this.OR = OR;
  }


  public NfsExportWhereInput replicaNum(Integer replicaNum) {
    
    this.replicaNum = replicaNum;
    return this;
  }

   /**
   * Get replicaNum
   * @return replicaNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReplicaNum() {
    return replicaNum;
  }


  public void setReplicaNum(Integer replicaNum) {
    this.replicaNum = replicaNum;
  }


  public NfsExportWhereInput replicaNumGt(Integer replicaNumGt) {
    
    this.replicaNumGt = replicaNumGt;
    return this;
  }

   /**
   * Get replicaNumGt
   * @return replicaNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReplicaNumGt() {
    return replicaNumGt;
  }


  public void setReplicaNumGt(Integer replicaNumGt) {
    this.replicaNumGt = replicaNumGt;
  }


  public NfsExportWhereInput replicaNumGte(Integer replicaNumGte) {
    
    this.replicaNumGte = replicaNumGte;
    return this;
  }

   /**
   * Get replicaNumGte
   * @return replicaNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReplicaNumGte() {
    return replicaNumGte;
  }


  public void setReplicaNumGte(Integer replicaNumGte) {
    this.replicaNumGte = replicaNumGte;
  }


  public NfsExportWhereInput replicaNumIn(List<Integer> replicaNumIn) {
    
    this.replicaNumIn = replicaNumIn;
    return this;
  }

  public NfsExportWhereInput addReplicaNumInItem(Integer replicaNumInItem) {
    if (this.replicaNumIn == null) {
      this.replicaNumIn = new ArrayList<Integer>();
    }
    this.replicaNumIn.add(replicaNumInItem);
    return this;
  }

   /**
   * Get replicaNumIn
   * @return replicaNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getReplicaNumIn() {
    return replicaNumIn;
  }


  public void setReplicaNumIn(List<Integer> replicaNumIn) {
    this.replicaNumIn = replicaNumIn;
  }


  public NfsExportWhereInput replicaNumLt(Integer replicaNumLt) {
    
    this.replicaNumLt = replicaNumLt;
    return this;
  }

   /**
   * Get replicaNumLt
   * @return replicaNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReplicaNumLt() {
    return replicaNumLt;
  }


  public void setReplicaNumLt(Integer replicaNumLt) {
    this.replicaNumLt = replicaNumLt;
  }


  public NfsExportWhereInput replicaNumLte(Integer replicaNumLte) {
    
    this.replicaNumLte = replicaNumLte;
    return this;
  }

   /**
   * Get replicaNumLte
   * @return replicaNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReplicaNumLte() {
    return replicaNumLte;
  }


  public void setReplicaNumLte(Integer replicaNumLte) {
    this.replicaNumLte = replicaNumLte;
  }


  public NfsExportWhereInput replicaNumNot(Integer replicaNumNot) {
    
    this.replicaNumNot = replicaNumNot;
    return this;
  }

   /**
   * Get replicaNumNot
   * @return replicaNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReplicaNumNot() {
    return replicaNumNot;
  }


  public void setReplicaNumNot(Integer replicaNumNot) {
    this.replicaNumNot = replicaNumNot;
  }


  public NfsExportWhereInput replicaNumNotIn(List<Integer> replicaNumNotIn) {
    
    this.replicaNumNotIn = replicaNumNotIn;
    return this;
  }

  public NfsExportWhereInput addReplicaNumNotInItem(Integer replicaNumNotInItem) {
    if (this.replicaNumNotIn == null) {
      this.replicaNumNotIn = new ArrayList<Integer>();
    }
    this.replicaNumNotIn.add(replicaNumNotInItem);
    return this;
  }

   /**
   * Get replicaNumNotIn
   * @return replicaNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getReplicaNumNotIn() {
    return replicaNumNotIn;
  }


  public void setReplicaNumNotIn(List<Integer> replicaNumNotIn) {
    this.replicaNumNotIn = replicaNumNotIn;
  }


  public NfsExportWhereInput thinProvision(Boolean thinProvision) {
    
    this.thinProvision = thinProvision;
    return this;
  }

   /**
   * Get thinProvision
   * @return thinProvision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getThinProvision() {
    return thinProvision;
  }


  public void setThinProvision(Boolean thinProvision) {
    this.thinProvision = thinProvision;
  }


  public NfsExportWhereInput thinProvisionNot(Boolean thinProvisionNot) {
    
    this.thinProvisionNot = thinProvisionNot;
    return this;
  }

   /**
   * Get thinProvisionNot
   * @return thinProvisionNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getThinProvisionNot() {
    return thinProvisionNot;
  }


  public void setThinProvisionNot(Boolean thinProvisionNot) {
    this.thinProvisionNot = thinProvisionNot;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfsExportWhereInput nfsExportWhereInput = (NfsExportWhereInput) o;
    return Objects.equals(this.AND, nfsExportWhereInput.AND) &&
        Objects.equals(this.cluster, nfsExportWhereInput.cluster) &&
        Objects.equals(this.description, nfsExportWhereInput.description) &&
        Objects.equals(this.descriptionContains, nfsExportWhereInput.descriptionContains) &&
        Objects.equals(this.descriptionEndsWith, nfsExportWhereInput.descriptionEndsWith) &&
        Objects.equals(this.descriptionGt, nfsExportWhereInput.descriptionGt) &&
        Objects.equals(this.descriptionGte, nfsExportWhereInput.descriptionGte) &&
        Objects.equals(this.descriptionIn, nfsExportWhereInput.descriptionIn) &&
        Objects.equals(this.descriptionLt, nfsExportWhereInput.descriptionLt) &&
        Objects.equals(this.descriptionLte, nfsExportWhereInput.descriptionLte) &&
        Objects.equals(this.descriptionNot, nfsExportWhereInput.descriptionNot) &&
        Objects.equals(this.descriptionNotContains, nfsExportWhereInput.descriptionNotContains) &&
        Objects.equals(this.descriptionNotEndsWith, nfsExportWhereInput.descriptionNotEndsWith) &&
        Objects.equals(this.descriptionNotIn, nfsExportWhereInput.descriptionNotIn) &&
        Objects.equals(this.descriptionNotStartsWith, nfsExportWhereInput.descriptionNotStartsWith) &&
        Objects.equals(this.descriptionStartsWith, nfsExportWhereInput.descriptionStartsWith) &&
        Objects.equals(this.entityAsyncStatus, nfsExportWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, nfsExportWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, nfsExportWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, nfsExportWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.exportInodeId, nfsExportWhereInput.exportInodeId) &&
        Objects.equals(this.exportInodeIdContains, nfsExportWhereInput.exportInodeIdContains) &&
        Objects.equals(this.exportInodeIdEndsWith, nfsExportWhereInput.exportInodeIdEndsWith) &&
        Objects.equals(this.exportInodeIdGt, nfsExportWhereInput.exportInodeIdGt) &&
        Objects.equals(this.exportInodeIdGte, nfsExportWhereInput.exportInodeIdGte) &&
        Objects.equals(this.exportInodeIdIn, nfsExportWhereInput.exportInodeIdIn) &&
        Objects.equals(this.exportInodeIdLt, nfsExportWhereInput.exportInodeIdLt) &&
        Objects.equals(this.exportInodeIdLte, nfsExportWhereInput.exportInodeIdLte) &&
        Objects.equals(this.exportInodeIdNot, nfsExportWhereInput.exportInodeIdNot) &&
        Objects.equals(this.exportInodeIdNotContains, nfsExportWhereInput.exportInodeIdNotContains) &&
        Objects.equals(this.exportInodeIdNotEndsWith, nfsExportWhereInput.exportInodeIdNotEndsWith) &&
        Objects.equals(this.exportInodeIdNotIn, nfsExportWhereInput.exportInodeIdNotIn) &&
        Objects.equals(this.exportInodeIdNotStartsWith, nfsExportWhereInput.exportInodeIdNotStartsWith) &&
        Objects.equals(this.exportInodeIdStartsWith, nfsExportWhereInput.exportInodeIdStartsWith) &&
        Objects.equals(this.id, nfsExportWhereInput.id) &&
        Objects.equals(this.idContains, nfsExportWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, nfsExportWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, nfsExportWhereInput.idGt) &&
        Objects.equals(this.idGte, nfsExportWhereInput.idGte) &&
        Objects.equals(this.idIn, nfsExportWhereInput.idIn) &&
        Objects.equals(this.idLt, nfsExportWhereInput.idLt) &&
        Objects.equals(this.idLte, nfsExportWhereInput.idLte) &&
        Objects.equals(this.idNot, nfsExportWhereInput.idNot) &&
        Objects.equals(this.idNotContains, nfsExportWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, nfsExportWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, nfsExportWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, nfsExportWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, nfsExportWhereInput.idStartsWith) &&
        Objects.equals(this.inodesEvery, nfsExportWhereInput.inodesEvery) &&
        Objects.equals(this.inodesNone, nfsExportWhereInput.inodesNone) &&
        Objects.equals(this.inodesSome, nfsExportWhereInput.inodesSome) &&
        Objects.equals(this.internal, nfsExportWhereInput.internal) &&
        Objects.equals(this.internalNot, nfsExportWhereInput.internalNot) &&
        Objects.equals(this.ipWhitelist, nfsExportWhereInput.ipWhitelist) &&
        Objects.equals(this.ipWhitelistContains, nfsExportWhereInput.ipWhitelistContains) &&
        Objects.equals(this.ipWhitelistEndsWith, nfsExportWhereInput.ipWhitelistEndsWith) &&
        Objects.equals(this.ipWhitelistGt, nfsExportWhereInput.ipWhitelistGt) &&
        Objects.equals(this.ipWhitelistGte, nfsExportWhereInput.ipWhitelistGte) &&
        Objects.equals(this.ipWhitelistIn, nfsExportWhereInput.ipWhitelistIn) &&
        Objects.equals(this.ipWhitelistLt, nfsExportWhereInput.ipWhitelistLt) &&
        Objects.equals(this.ipWhitelistLte, nfsExportWhereInput.ipWhitelistLte) &&
        Objects.equals(this.ipWhitelistNot, nfsExportWhereInput.ipWhitelistNot) &&
        Objects.equals(this.ipWhitelistNotContains, nfsExportWhereInput.ipWhitelistNotContains) &&
        Objects.equals(this.ipWhitelistNotEndsWith, nfsExportWhereInput.ipWhitelistNotEndsWith) &&
        Objects.equals(this.ipWhitelistNotIn, nfsExportWhereInput.ipWhitelistNotIn) &&
        Objects.equals(this.ipWhitelistNotStartsWith, nfsExportWhereInput.ipWhitelistNotStartsWith) &&
        Objects.equals(this.ipWhitelistStartsWith, nfsExportWhereInput.ipWhitelistStartsWith) &&
        Objects.equals(this.labelsEvery, nfsExportWhereInput.labelsEvery) &&
        Objects.equals(this.labelsNone, nfsExportWhereInput.labelsNone) &&
        Objects.equals(this.labelsSome, nfsExportWhereInput.labelsSome) &&
        Objects.equals(this.localId, nfsExportWhereInput.localId) &&
        Objects.equals(this.localIdContains, nfsExportWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, nfsExportWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, nfsExportWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, nfsExportWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, nfsExportWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, nfsExportWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, nfsExportWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, nfsExportWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, nfsExportWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, nfsExportWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, nfsExportWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, nfsExportWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, nfsExportWhereInput.localIdStartsWith) &&
        Objects.equals(this.name, nfsExportWhereInput.name) &&
        Objects.equals(this.nameContains, nfsExportWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, nfsExportWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, nfsExportWhereInput.nameGt) &&
        Objects.equals(this.nameGte, nfsExportWhereInput.nameGte) &&
        Objects.equals(this.nameIn, nfsExportWhereInput.nameIn) &&
        Objects.equals(this.nameLt, nfsExportWhereInput.nameLt) &&
        Objects.equals(this.nameLte, nfsExportWhereInput.nameLte) &&
        Objects.equals(this.nameNot, nfsExportWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, nfsExportWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, nfsExportWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, nfsExportWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, nfsExportWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, nfsExportWhereInput.nameStartsWith) &&
        Objects.equals(this.NOT, nfsExportWhereInput.NOT) &&
        Objects.equals(this.OR, nfsExportWhereInput.OR) &&
        Objects.equals(this.replicaNum, nfsExportWhereInput.replicaNum) &&
        Objects.equals(this.replicaNumGt, nfsExportWhereInput.replicaNumGt) &&
        Objects.equals(this.replicaNumGte, nfsExportWhereInput.replicaNumGte) &&
        Objects.equals(this.replicaNumIn, nfsExportWhereInput.replicaNumIn) &&
        Objects.equals(this.replicaNumLt, nfsExportWhereInput.replicaNumLt) &&
        Objects.equals(this.replicaNumLte, nfsExportWhereInput.replicaNumLte) &&
        Objects.equals(this.replicaNumNot, nfsExportWhereInput.replicaNumNot) &&
        Objects.equals(this.replicaNumNotIn, nfsExportWhereInput.replicaNumNotIn) &&
        Objects.equals(this.thinProvision, nfsExportWhereInput.thinProvision) &&
        Objects.equals(this.thinProvisionNot, nfsExportWhereInput.thinProvisionNot);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, cluster, description, descriptionContains, descriptionEndsWith, descriptionGt, descriptionGte, descriptionIn, descriptionLt, descriptionLte, descriptionNot, descriptionNotContains, descriptionNotEndsWith, descriptionNotIn, descriptionNotStartsWith, descriptionStartsWith, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, exportInodeId, exportInodeIdContains, exportInodeIdEndsWith, exportInodeIdGt, exportInodeIdGte, exportInodeIdIn, exportInodeIdLt, exportInodeIdLte, exportInodeIdNot, exportInodeIdNotContains, exportInodeIdNotEndsWith, exportInodeIdNotIn, exportInodeIdNotStartsWith, exportInodeIdStartsWith, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, inodesEvery, inodesNone, inodesSome, internal, internalNot, ipWhitelist, ipWhitelistContains, ipWhitelistEndsWith, ipWhitelistGt, ipWhitelistGte, ipWhitelistIn, ipWhitelistLt, ipWhitelistLte, ipWhitelistNot, ipWhitelistNotContains, ipWhitelistNotEndsWith, ipWhitelistNotIn, ipWhitelistNotStartsWith, ipWhitelistStartsWith, labelsEvery, labelsNone, labelsSome, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, NOT, OR, replicaNum, replicaNumGt, replicaNumGte, replicaNumIn, replicaNumLt, replicaNumLte, replicaNumNot, replicaNumNotIn, thinProvision, thinProvisionNot);
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
    sb.append("class NfsExportWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionContains: ").append(toIndentedString(descriptionContains)).append("\n");
    sb.append("    descriptionEndsWith: ").append(toIndentedString(descriptionEndsWith)).append("\n");
    sb.append("    descriptionGt: ").append(toIndentedString(descriptionGt)).append("\n");
    sb.append("    descriptionGte: ").append(toIndentedString(descriptionGte)).append("\n");
    sb.append("    descriptionIn: ").append(toIndentedString(descriptionIn)).append("\n");
    sb.append("    descriptionLt: ").append(toIndentedString(descriptionLt)).append("\n");
    sb.append("    descriptionLte: ").append(toIndentedString(descriptionLte)).append("\n");
    sb.append("    descriptionNot: ").append(toIndentedString(descriptionNot)).append("\n");
    sb.append("    descriptionNotContains: ").append(toIndentedString(descriptionNotContains)).append("\n");
    sb.append("    descriptionNotEndsWith: ").append(toIndentedString(descriptionNotEndsWith)).append("\n");
    sb.append("    descriptionNotIn: ").append(toIndentedString(descriptionNotIn)).append("\n");
    sb.append("    descriptionNotStartsWith: ").append(toIndentedString(descriptionNotStartsWith)).append("\n");
    sb.append("    descriptionStartsWith: ").append(toIndentedString(descriptionStartsWith)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    entityAsyncStatusIn: ").append(toIndentedString(entityAsyncStatusIn)).append("\n");
    sb.append("    entityAsyncStatusNot: ").append(toIndentedString(entityAsyncStatusNot)).append("\n");
    sb.append("    entityAsyncStatusNotIn: ").append(toIndentedString(entityAsyncStatusNotIn)).append("\n");
    sb.append("    exportInodeId: ").append(toIndentedString(exportInodeId)).append("\n");
    sb.append("    exportInodeIdContains: ").append(toIndentedString(exportInodeIdContains)).append("\n");
    sb.append("    exportInodeIdEndsWith: ").append(toIndentedString(exportInodeIdEndsWith)).append("\n");
    sb.append("    exportInodeIdGt: ").append(toIndentedString(exportInodeIdGt)).append("\n");
    sb.append("    exportInodeIdGte: ").append(toIndentedString(exportInodeIdGte)).append("\n");
    sb.append("    exportInodeIdIn: ").append(toIndentedString(exportInodeIdIn)).append("\n");
    sb.append("    exportInodeIdLt: ").append(toIndentedString(exportInodeIdLt)).append("\n");
    sb.append("    exportInodeIdLte: ").append(toIndentedString(exportInodeIdLte)).append("\n");
    sb.append("    exportInodeIdNot: ").append(toIndentedString(exportInodeIdNot)).append("\n");
    sb.append("    exportInodeIdNotContains: ").append(toIndentedString(exportInodeIdNotContains)).append("\n");
    sb.append("    exportInodeIdNotEndsWith: ").append(toIndentedString(exportInodeIdNotEndsWith)).append("\n");
    sb.append("    exportInodeIdNotIn: ").append(toIndentedString(exportInodeIdNotIn)).append("\n");
    sb.append("    exportInodeIdNotStartsWith: ").append(toIndentedString(exportInodeIdNotStartsWith)).append("\n");
    sb.append("    exportInodeIdStartsWith: ").append(toIndentedString(exportInodeIdStartsWith)).append("\n");
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
    sb.append("    inodesEvery: ").append(toIndentedString(inodesEvery)).append("\n");
    sb.append("    inodesNone: ").append(toIndentedString(inodesNone)).append("\n");
    sb.append("    inodesSome: ").append(toIndentedString(inodesSome)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    internalNot: ").append(toIndentedString(internalNot)).append("\n");
    sb.append("    ipWhitelist: ").append(toIndentedString(ipWhitelist)).append("\n");
    sb.append("    ipWhitelistContains: ").append(toIndentedString(ipWhitelistContains)).append("\n");
    sb.append("    ipWhitelistEndsWith: ").append(toIndentedString(ipWhitelistEndsWith)).append("\n");
    sb.append("    ipWhitelistGt: ").append(toIndentedString(ipWhitelistGt)).append("\n");
    sb.append("    ipWhitelistGte: ").append(toIndentedString(ipWhitelistGte)).append("\n");
    sb.append("    ipWhitelistIn: ").append(toIndentedString(ipWhitelistIn)).append("\n");
    sb.append("    ipWhitelistLt: ").append(toIndentedString(ipWhitelistLt)).append("\n");
    sb.append("    ipWhitelistLte: ").append(toIndentedString(ipWhitelistLte)).append("\n");
    sb.append("    ipWhitelistNot: ").append(toIndentedString(ipWhitelistNot)).append("\n");
    sb.append("    ipWhitelistNotContains: ").append(toIndentedString(ipWhitelistNotContains)).append("\n");
    sb.append("    ipWhitelistNotEndsWith: ").append(toIndentedString(ipWhitelistNotEndsWith)).append("\n");
    sb.append("    ipWhitelistNotIn: ").append(toIndentedString(ipWhitelistNotIn)).append("\n");
    sb.append("    ipWhitelistNotStartsWith: ").append(toIndentedString(ipWhitelistNotStartsWith)).append("\n");
    sb.append("    ipWhitelistStartsWith: ").append(toIndentedString(ipWhitelistStartsWith)).append("\n");
    sb.append("    labelsEvery: ").append(toIndentedString(labelsEvery)).append("\n");
    sb.append("    labelsNone: ").append(toIndentedString(labelsNone)).append("\n");
    sb.append("    labelsSome: ").append(toIndentedString(labelsSome)).append("\n");
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
    sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
    sb.append("    replicaNumGt: ").append(toIndentedString(replicaNumGt)).append("\n");
    sb.append("    replicaNumGte: ").append(toIndentedString(replicaNumGte)).append("\n");
    sb.append("    replicaNumIn: ").append(toIndentedString(replicaNumIn)).append("\n");
    sb.append("    replicaNumLt: ").append(toIndentedString(replicaNumLt)).append("\n");
    sb.append("    replicaNumLte: ").append(toIndentedString(replicaNumLte)).append("\n");
    sb.append("    replicaNumNot: ").append(toIndentedString(replicaNumNot)).append("\n");
    sb.append("    replicaNumNotIn: ").append(toIndentedString(replicaNumNotIn)).append("\n");
    sb.append("    thinProvision: ").append(toIndentedString(thinProvision)).append("\n");
    sb.append("    thinProvisionNot: ").append(toIndentedString(thinProvisionNot)).append("\n");
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

