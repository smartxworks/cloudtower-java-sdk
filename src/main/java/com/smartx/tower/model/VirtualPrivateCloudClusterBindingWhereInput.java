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
import com.smartx.tower.model.EverouteClusterPhase;
import com.smartx.tower.model.VdsWhereInput;
import com.smartx.tower.model.VirtualPrivateCloudServiceWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VirtualPrivateCloudClusterBindingWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VirtualPrivateCloudClusterBindingWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<VirtualPrivateCloudClusterBindingWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<VirtualPrivateCloudClusterBindingWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<VirtualPrivateCloudClusterBindingWhereInput> OR = null;

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

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private EverouteClusterPhase phase;

  public static final String SERIALIZED_NAME_PHASE_IN = "phase_in";
  @SerializedName(SERIALIZED_NAME_PHASE_IN)
  private List<EverouteClusterPhase> phaseIn = null;

  public static final String SERIALIZED_NAME_PHASE_NOT = "phase_not";
  @SerializedName(SERIALIZED_NAME_PHASE_NOT)
  private EverouteClusterPhase phaseNot;

  public static final String SERIALIZED_NAME_PHASE_NOT_IN = "phase_not_in";
  @SerializedName(SERIALIZED_NAME_PHASE_NOT_IN)
  private List<EverouteClusterPhase> phaseNotIn = null;

  public static final String SERIALIZED_NAME_TEP_IP_POOL_ID = "tep_ip_pool_id";
  @SerializedName(SERIALIZED_NAME_TEP_IP_POOL_ID)
  private String tepIpPoolId;

  public static final String SERIALIZED_NAME_TEP_IP_POOL_ID_CONTAINS = "tep_ip_pool_id_contains";
  @SerializedName(SERIALIZED_NAME_TEP_IP_POOL_ID_CONTAINS)
  private String tepIpPoolIdContains;

  public static final String SERIALIZED_NAME_TEP_IP_POOL_ID_ENDS_WITH = "tep_ip_pool_id_ends_with";
  @SerializedName(SERIALIZED_NAME_TEP_IP_POOL_ID_ENDS_WITH)
  private String tepIpPoolIdEndsWith;

  public static final String SERIALIZED_NAME_TEP_IP_POOL_ID_GT = "tep_ip_pool_id_gt";
  @SerializedName(SERIALIZED_NAME_TEP_IP_POOL_ID_GT)
  private String tepIpPoolIdGt;

  public static final String SERIALIZED_NAME_TEP_IP_POOL_ID_GTE = "tep_ip_pool_id_gte";
  @SerializedName(SERIALIZED_NAME_TEP_IP_POOL_ID_GTE)
  private String tepIpPoolIdGte;

  public static final String SERIALIZED_NAME_TEP_IP_POOL_ID_IN = "tep_ip_pool_id_in";
  @SerializedName(SERIALIZED_NAME_TEP_IP_POOL_ID_IN)
  private List<String> tepIpPoolIdIn = null;

  public static final String SERIALIZED_NAME_TEP_IP_POOL_ID_LT = "tep_ip_pool_id_lt";
  @SerializedName(SERIALIZED_NAME_TEP_IP_POOL_ID_LT)
  private String tepIpPoolIdLt;

  public static final String SERIALIZED_NAME_TEP_IP_POOL_ID_LTE = "tep_ip_pool_id_lte";
  @SerializedName(SERIALIZED_NAME_TEP_IP_POOL_ID_LTE)
  private String tepIpPoolIdLte;

  public static final String SERIALIZED_NAME_TEP_IP_POOL_ID_NOT = "tep_ip_pool_id_not";
  @SerializedName(SERIALIZED_NAME_TEP_IP_POOL_ID_NOT)
  private String tepIpPoolIdNot;

  public static final String SERIALIZED_NAME_TEP_IP_POOL_ID_NOT_CONTAINS = "tep_ip_pool_id_not_contains";
  @SerializedName(SERIALIZED_NAME_TEP_IP_POOL_ID_NOT_CONTAINS)
  private String tepIpPoolIdNotContains;

  public static final String SERIALIZED_NAME_TEP_IP_POOL_ID_NOT_ENDS_WITH = "tep_ip_pool_id_not_ends_with";
  @SerializedName(SERIALIZED_NAME_TEP_IP_POOL_ID_NOT_ENDS_WITH)
  private String tepIpPoolIdNotEndsWith;

  public static final String SERIALIZED_NAME_TEP_IP_POOL_ID_NOT_IN = "tep_ip_pool_id_not_in";
  @SerializedName(SERIALIZED_NAME_TEP_IP_POOL_ID_NOT_IN)
  private List<String> tepIpPoolIdNotIn = null;

  public static final String SERIALIZED_NAME_TEP_IP_POOL_ID_NOT_STARTS_WITH = "tep_ip_pool_id_not_starts_with";
  @SerializedName(SERIALIZED_NAME_TEP_IP_POOL_ID_NOT_STARTS_WITH)
  private String tepIpPoolIdNotStartsWith;

  public static final String SERIALIZED_NAME_TEP_IP_POOL_ID_STARTS_WITH = "tep_ip_pool_id_starts_with";
  @SerializedName(SERIALIZED_NAME_TEP_IP_POOL_ID_STARTS_WITH)
  private String tepIpPoolIdStartsWith;

  public static final String SERIALIZED_NAME_VDS = "vds";
  @SerializedName(SERIALIZED_NAME_VDS)
  private VdsWhereInput vds;

  public static final String SERIALIZED_NAME_VLAN_ID = "vlan_id";
  @SerializedName(SERIALIZED_NAME_VLAN_ID)
  private Integer vlanId;

  public static final String SERIALIZED_NAME_VLAN_ID_GT = "vlan_id_gt";
  @SerializedName(SERIALIZED_NAME_VLAN_ID_GT)
  private Integer vlanIdGt;

  public static final String SERIALIZED_NAME_VLAN_ID_GTE = "vlan_id_gte";
  @SerializedName(SERIALIZED_NAME_VLAN_ID_GTE)
  private Integer vlanIdGte;

  public static final String SERIALIZED_NAME_VLAN_ID_IN = "vlan_id_in";
  @SerializedName(SERIALIZED_NAME_VLAN_ID_IN)
  private List<Integer> vlanIdIn = null;

  public static final String SERIALIZED_NAME_VLAN_ID_LT = "vlan_id_lt";
  @SerializedName(SERIALIZED_NAME_VLAN_ID_LT)
  private Integer vlanIdLt;

  public static final String SERIALIZED_NAME_VLAN_ID_LTE = "vlan_id_lte";
  @SerializedName(SERIALIZED_NAME_VLAN_ID_LTE)
  private Integer vlanIdLte;

  public static final String SERIALIZED_NAME_VLAN_ID_NOT = "vlan_id_not";
  @SerializedName(SERIALIZED_NAME_VLAN_ID_NOT)
  private Integer vlanIdNot;

  public static final String SERIALIZED_NAME_VLAN_ID_NOT_IN = "vlan_id_not_in";
  @SerializedName(SERIALIZED_NAME_VLAN_ID_NOT_IN)
  private List<Integer> vlanIdNotIn = null;

  public static final String SERIALIZED_NAME_VPC_SERVICE = "vpc_service";
  @SerializedName(SERIALIZED_NAME_VPC_SERVICE)
  private VirtualPrivateCloudServiceWhereInput vpcService;

  public VirtualPrivateCloudClusterBindingWhereInput() { 
  }

  public VirtualPrivateCloudClusterBindingWhereInput AND(List<VirtualPrivateCloudClusterBindingWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public VirtualPrivateCloudClusterBindingWhereInput addANDItem(VirtualPrivateCloudClusterBindingWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<VirtualPrivateCloudClusterBindingWhereInput>();
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

  public List<VirtualPrivateCloudClusterBindingWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<VirtualPrivateCloudClusterBindingWhereInput> AND) {
    this.AND = AND;
  }


  public VirtualPrivateCloudClusterBindingWhereInput NOT(List<VirtualPrivateCloudClusterBindingWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public VirtualPrivateCloudClusterBindingWhereInput addNOTItem(VirtualPrivateCloudClusterBindingWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<VirtualPrivateCloudClusterBindingWhereInput>();
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

  public List<VirtualPrivateCloudClusterBindingWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<VirtualPrivateCloudClusterBindingWhereInput> NOT) {
    this.NOT = NOT;
  }


  public VirtualPrivateCloudClusterBindingWhereInput OR(List<VirtualPrivateCloudClusterBindingWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public VirtualPrivateCloudClusterBindingWhereInput addORItem(VirtualPrivateCloudClusterBindingWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<VirtualPrivateCloudClusterBindingWhereInput>();
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

  public List<VirtualPrivateCloudClusterBindingWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<VirtualPrivateCloudClusterBindingWhereInput> OR) {
    this.OR = OR;
  }


  public VirtualPrivateCloudClusterBindingWhereInput cluster(ClusterWhereInput cluster) {
    
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


  public VirtualPrivateCloudClusterBindingWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public VirtualPrivateCloudClusterBindingWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public VirtualPrivateCloudClusterBindingWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public VirtualPrivateCloudClusterBindingWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public VirtualPrivateCloudClusterBindingWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public VirtualPrivateCloudClusterBindingWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public VirtualPrivateCloudClusterBindingWhereInput id(String id) {
    
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


  public VirtualPrivateCloudClusterBindingWhereInput idContains(String idContains) {
    
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


  public VirtualPrivateCloudClusterBindingWhereInput idEndsWith(String idEndsWith) {
    
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


  public VirtualPrivateCloudClusterBindingWhereInput idGt(String idGt) {
    
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


  public VirtualPrivateCloudClusterBindingWhereInput idGte(String idGte) {
    
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


  public VirtualPrivateCloudClusterBindingWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public VirtualPrivateCloudClusterBindingWhereInput addIdInItem(String idInItem) {
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


  public VirtualPrivateCloudClusterBindingWhereInput idLt(String idLt) {
    
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


  public VirtualPrivateCloudClusterBindingWhereInput idLte(String idLte) {
    
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


  public VirtualPrivateCloudClusterBindingWhereInput idNot(String idNot) {
    
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


  public VirtualPrivateCloudClusterBindingWhereInput idNotContains(String idNotContains) {
    
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


  public VirtualPrivateCloudClusterBindingWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public VirtualPrivateCloudClusterBindingWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public VirtualPrivateCloudClusterBindingWhereInput addIdNotInItem(String idNotInItem) {
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


  public VirtualPrivateCloudClusterBindingWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public VirtualPrivateCloudClusterBindingWhereInput idStartsWith(String idStartsWith) {
    
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


  public VirtualPrivateCloudClusterBindingWhereInput phase(EverouteClusterPhase phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EverouteClusterPhase getPhase() {
    return phase;
  }


  public void setPhase(EverouteClusterPhase phase) {
    this.phase = phase;
  }


  public VirtualPrivateCloudClusterBindingWhereInput phaseIn(List<EverouteClusterPhase> phaseIn) {
    
    this.phaseIn = phaseIn;
    return this;
  }

  public VirtualPrivateCloudClusterBindingWhereInput addPhaseInItem(EverouteClusterPhase phaseInItem) {
    if (this.phaseIn == null) {
      this.phaseIn = new ArrayList<EverouteClusterPhase>();
    }
    this.phaseIn.add(phaseInItem);
    return this;
  }

   /**
   * Get phaseIn
   * @return phaseIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EverouteClusterPhase> getPhaseIn() {
    return phaseIn;
  }


  public void setPhaseIn(List<EverouteClusterPhase> phaseIn) {
    this.phaseIn = phaseIn;
  }


  public VirtualPrivateCloudClusterBindingWhereInput phaseNot(EverouteClusterPhase phaseNot) {
    
    this.phaseNot = phaseNot;
    return this;
  }

   /**
   * Get phaseNot
   * @return phaseNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EverouteClusterPhase getPhaseNot() {
    return phaseNot;
  }


  public void setPhaseNot(EverouteClusterPhase phaseNot) {
    this.phaseNot = phaseNot;
  }


  public VirtualPrivateCloudClusterBindingWhereInput phaseNotIn(List<EverouteClusterPhase> phaseNotIn) {
    
    this.phaseNotIn = phaseNotIn;
    return this;
  }

  public VirtualPrivateCloudClusterBindingWhereInput addPhaseNotInItem(EverouteClusterPhase phaseNotInItem) {
    if (this.phaseNotIn == null) {
      this.phaseNotIn = new ArrayList<EverouteClusterPhase>();
    }
    this.phaseNotIn.add(phaseNotInItem);
    return this;
  }

   /**
   * Get phaseNotIn
   * @return phaseNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EverouteClusterPhase> getPhaseNotIn() {
    return phaseNotIn;
  }


  public void setPhaseNotIn(List<EverouteClusterPhase> phaseNotIn) {
    this.phaseNotIn = phaseNotIn;
  }


  public VirtualPrivateCloudClusterBindingWhereInput tepIpPoolId(String tepIpPoolId) {
    
    this.tepIpPoolId = tepIpPoolId;
    return this;
  }

   /**
   * Get tepIpPoolId
   * @return tepIpPoolId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTepIpPoolId() {
    return tepIpPoolId;
  }


  public void setTepIpPoolId(String tepIpPoolId) {
    this.tepIpPoolId = tepIpPoolId;
  }


  public VirtualPrivateCloudClusterBindingWhereInput tepIpPoolIdContains(String tepIpPoolIdContains) {
    
    this.tepIpPoolIdContains = tepIpPoolIdContains;
    return this;
  }

   /**
   * Get tepIpPoolIdContains
   * @return tepIpPoolIdContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTepIpPoolIdContains() {
    return tepIpPoolIdContains;
  }


  public void setTepIpPoolIdContains(String tepIpPoolIdContains) {
    this.tepIpPoolIdContains = tepIpPoolIdContains;
  }


  public VirtualPrivateCloudClusterBindingWhereInput tepIpPoolIdEndsWith(String tepIpPoolIdEndsWith) {
    
    this.tepIpPoolIdEndsWith = tepIpPoolIdEndsWith;
    return this;
  }

   /**
   * Get tepIpPoolIdEndsWith
   * @return tepIpPoolIdEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTepIpPoolIdEndsWith() {
    return tepIpPoolIdEndsWith;
  }


  public void setTepIpPoolIdEndsWith(String tepIpPoolIdEndsWith) {
    this.tepIpPoolIdEndsWith = tepIpPoolIdEndsWith;
  }


  public VirtualPrivateCloudClusterBindingWhereInput tepIpPoolIdGt(String tepIpPoolIdGt) {
    
    this.tepIpPoolIdGt = tepIpPoolIdGt;
    return this;
  }

   /**
   * Get tepIpPoolIdGt
   * @return tepIpPoolIdGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTepIpPoolIdGt() {
    return tepIpPoolIdGt;
  }


  public void setTepIpPoolIdGt(String tepIpPoolIdGt) {
    this.tepIpPoolIdGt = tepIpPoolIdGt;
  }


  public VirtualPrivateCloudClusterBindingWhereInput tepIpPoolIdGte(String tepIpPoolIdGte) {
    
    this.tepIpPoolIdGte = tepIpPoolIdGte;
    return this;
  }

   /**
   * Get tepIpPoolIdGte
   * @return tepIpPoolIdGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTepIpPoolIdGte() {
    return tepIpPoolIdGte;
  }


  public void setTepIpPoolIdGte(String tepIpPoolIdGte) {
    this.tepIpPoolIdGte = tepIpPoolIdGte;
  }


  public VirtualPrivateCloudClusterBindingWhereInput tepIpPoolIdIn(List<String> tepIpPoolIdIn) {
    
    this.tepIpPoolIdIn = tepIpPoolIdIn;
    return this;
  }

  public VirtualPrivateCloudClusterBindingWhereInput addTepIpPoolIdInItem(String tepIpPoolIdInItem) {
    if (this.tepIpPoolIdIn == null) {
      this.tepIpPoolIdIn = new ArrayList<String>();
    }
    this.tepIpPoolIdIn.add(tepIpPoolIdInItem);
    return this;
  }

   /**
   * Get tepIpPoolIdIn
   * @return tepIpPoolIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTepIpPoolIdIn() {
    return tepIpPoolIdIn;
  }


  public void setTepIpPoolIdIn(List<String> tepIpPoolIdIn) {
    this.tepIpPoolIdIn = tepIpPoolIdIn;
  }


  public VirtualPrivateCloudClusterBindingWhereInput tepIpPoolIdLt(String tepIpPoolIdLt) {
    
    this.tepIpPoolIdLt = tepIpPoolIdLt;
    return this;
  }

   /**
   * Get tepIpPoolIdLt
   * @return tepIpPoolIdLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTepIpPoolIdLt() {
    return tepIpPoolIdLt;
  }


  public void setTepIpPoolIdLt(String tepIpPoolIdLt) {
    this.tepIpPoolIdLt = tepIpPoolIdLt;
  }


  public VirtualPrivateCloudClusterBindingWhereInput tepIpPoolIdLte(String tepIpPoolIdLte) {
    
    this.tepIpPoolIdLte = tepIpPoolIdLte;
    return this;
  }

   /**
   * Get tepIpPoolIdLte
   * @return tepIpPoolIdLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTepIpPoolIdLte() {
    return tepIpPoolIdLte;
  }


  public void setTepIpPoolIdLte(String tepIpPoolIdLte) {
    this.tepIpPoolIdLte = tepIpPoolIdLte;
  }


  public VirtualPrivateCloudClusterBindingWhereInput tepIpPoolIdNot(String tepIpPoolIdNot) {
    
    this.tepIpPoolIdNot = tepIpPoolIdNot;
    return this;
  }

   /**
   * Get tepIpPoolIdNot
   * @return tepIpPoolIdNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTepIpPoolIdNot() {
    return tepIpPoolIdNot;
  }


  public void setTepIpPoolIdNot(String tepIpPoolIdNot) {
    this.tepIpPoolIdNot = tepIpPoolIdNot;
  }


  public VirtualPrivateCloudClusterBindingWhereInput tepIpPoolIdNotContains(String tepIpPoolIdNotContains) {
    
    this.tepIpPoolIdNotContains = tepIpPoolIdNotContains;
    return this;
  }

   /**
   * Get tepIpPoolIdNotContains
   * @return tepIpPoolIdNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTepIpPoolIdNotContains() {
    return tepIpPoolIdNotContains;
  }


  public void setTepIpPoolIdNotContains(String tepIpPoolIdNotContains) {
    this.tepIpPoolIdNotContains = tepIpPoolIdNotContains;
  }


  public VirtualPrivateCloudClusterBindingWhereInput tepIpPoolIdNotEndsWith(String tepIpPoolIdNotEndsWith) {
    
    this.tepIpPoolIdNotEndsWith = tepIpPoolIdNotEndsWith;
    return this;
  }

   /**
   * Get tepIpPoolIdNotEndsWith
   * @return tepIpPoolIdNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTepIpPoolIdNotEndsWith() {
    return tepIpPoolIdNotEndsWith;
  }


  public void setTepIpPoolIdNotEndsWith(String tepIpPoolIdNotEndsWith) {
    this.tepIpPoolIdNotEndsWith = tepIpPoolIdNotEndsWith;
  }


  public VirtualPrivateCloudClusterBindingWhereInput tepIpPoolIdNotIn(List<String> tepIpPoolIdNotIn) {
    
    this.tepIpPoolIdNotIn = tepIpPoolIdNotIn;
    return this;
  }

  public VirtualPrivateCloudClusterBindingWhereInput addTepIpPoolIdNotInItem(String tepIpPoolIdNotInItem) {
    if (this.tepIpPoolIdNotIn == null) {
      this.tepIpPoolIdNotIn = new ArrayList<String>();
    }
    this.tepIpPoolIdNotIn.add(tepIpPoolIdNotInItem);
    return this;
  }

   /**
   * Get tepIpPoolIdNotIn
   * @return tepIpPoolIdNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTepIpPoolIdNotIn() {
    return tepIpPoolIdNotIn;
  }


  public void setTepIpPoolIdNotIn(List<String> tepIpPoolIdNotIn) {
    this.tepIpPoolIdNotIn = tepIpPoolIdNotIn;
  }


  public VirtualPrivateCloudClusterBindingWhereInput tepIpPoolIdNotStartsWith(String tepIpPoolIdNotStartsWith) {
    
    this.tepIpPoolIdNotStartsWith = tepIpPoolIdNotStartsWith;
    return this;
  }

   /**
   * Get tepIpPoolIdNotStartsWith
   * @return tepIpPoolIdNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTepIpPoolIdNotStartsWith() {
    return tepIpPoolIdNotStartsWith;
  }


  public void setTepIpPoolIdNotStartsWith(String tepIpPoolIdNotStartsWith) {
    this.tepIpPoolIdNotStartsWith = tepIpPoolIdNotStartsWith;
  }


  public VirtualPrivateCloudClusterBindingWhereInput tepIpPoolIdStartsWith(String tepIpPoolIdStartsWith) {
    
    this.tepIpPoolIdStartsWith = tepIpPoolIdStartsWith;
    return this;
  }

   /**
   * Get tepIpPoolIdStartsWith
   * @return tepIpPoolIdStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTepIpPoolIdStartsWith() {
    return tepIpPoolIdStartsWith;
  }


  public void setTepIpPoolIdStartsWith(String tepIpPoolIdStartsWith) {
    this.tepIpPoolIdStartsWith = tepIpPoolIdStartsWith;
  }


  public VirtualPrivateCloudClusterBindingWhereInput vds(VdsWhereInput vds) {
    
    this.vds = vds;
    return this;
  }

   /**
   * Get vds
   * @return vds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VdsWhereInput getVds() {
    return vds;
  }


  public void setVds(VdsWhereInput vds) {
    this.vds = vds;
  }


  public VirtualPrivateCloudClusterBindingWhereInput vlanId(Integer vlanId) {
    
    this.vlanId = vlanId;
    return this;
  }

   /**
   * Get vlanId
   * @return vlanId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVlanId() {
    return vlanId;
  }


  public void setVlanId(Integer vlanId) {
    this.vlanId = vlanId;
  }


  public VirtualPrivateCloudClusterBindingWhereInput vlanIdGt(Integer vlanIdGt) {
    
    this.vlanIdGt = vlanIdGt;
    return this;
  }

   /**
   * Get vlanIdGt
   * @return vlanIdGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVlanIdGt() {
    return vlanIdGt;
  }


  public void setVlanIdGt(Integer vlanIdGt) {
    this.vlanIdGt = vlanIdGt;
  }


  public VirtualPrivateCloudClusterBindingWhereInput vlanIdGte(Integer vlanIdGte) {
    
    this.vlanIdGte = vlanIdGte;
    return this;
  }

   /**
   * Get vlanIdGte
   * @return vlanIdGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVlanIdGte() {
    return vlanIdGte;
  }


  public void setVlanIdGte(Integer vlanIdGte) {
    this.vlanIdGte = vlanIdGte;
  }


  public VirtualPrivateCloudClusterBindingWhereInput vlanIdIn(List<Integer> vlanIdIn) {
    
    this.vlanIdIn = vlanIdIn;
    return this;
  }

  public VirtualPrivateCloudClusterBindingWhereInput addVlanIdInItem(Integer vlanIdInItem) {
    if (this.vlanIdIn == null) {
      this.vlanIdIn = new ArrayList<Integer>();
    }
    this.vlanIdIn.add(vlanIdInItem);
    return this;
  }

   /**
   * Get vlanIdIn
   * @return vlanIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVlanIdIn() {
    return vlanIdIn;
  }


  public void setVlanIdIn(List<Integer> vlanIdIn) {
    this.vlanIdIn = vlanIdIn;
  }


  public VirtualPrivateCloudClusterBindingWhereInput vlanIdLt(Integer vlanIdLt) {
    
    this.vlanIdLt = vlanIdLt;
    return this;
  }

   /**
   * Get vlanIdLt
   * @return vlanIdLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVlanIdLt() {
    return vlanIdLt;
  }


  public void setVlanIdLt(Integer vlanIdLt) {
    this.vlanIdLt = vlanIdLt;
  }


  public VirtualPrivateCloudClusterBindingWhereInput vlanIdLte(Integer vlanIdLte) {
    
    this.vlanIdLte = vlanIdLte;
    return this;
  }

   /**
   * Get vlanIdLte
   * @return vlanIdLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVlanIdLte() {
    return vlanIdLte;
  }


  public void setVlanIdLte(Integer vlanIdLte) {
    this.vlanIdLte = vlanIdLte;
  }


  public VirtualPrivateCloudClusterBindingWhereInput vlanIdNot(Integer vlanIdNot) {
    
    this.vlanIdNot = vlanIdNot;
    return this;
  }

   /**
   * Get vlanIdNot
   * @return vlanIdNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVlanIdNot() {
    return vlanIdNot;
  }


  public void setVlanIdNot(Integer vlanIdNot) {
    this.vlanIdNot = vlanIdNot;
  }


  public VirtualPrivateCloudClusterBindingWhereInput vlanIdNotIn(List<Integer> vlanIdNotIn) {
    
    this.vlanIdNotIn = vlanIdNotIn;
    return this;
  }

  public VirtualPrivateCloudClusterBindingWhereInput addVlanIdNotInItem(Integer vlanIdNotInItem) {
    if (this.vlanIdNotIn == null) {
      this.vlanIdNotIn = new ArrayList<Integer>();
    }
    this.vlanIdNotIn.add(vlanIdNotInItem);
    return this;
  }

   /**
   * Get vlanIdNotIn
   * @return vlanIdNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVlanIdNotIn() {
    return vlanIdNotIn;
  }


  public void setVlanIdNotIn(List<Integer> vlanIdNotIn) {
    this.vlanIdNotIn = vlanIdNotIn;
  }


  public VirtualPrivateCloudClusterBindingWhereInput vpcService(VirtualPrivateCloudServiceWhereInput vpcService) {
    
    this.vpcService = vpcService;
    return this;
  }

   /**
   * Get vpcService
   * @return vpcService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudServiceWhereInput getVpcService() {
    return vpcService;
  }


  public void setVpcService(VirtualPrivateCloudServiceWhereInput vpcService) {
    this.vpcService = vpcService;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualPrivateCloudClusterBindingWhereInput virtualPrivateCloudClusterBindingWhereInput = (VirtualPrivateCloudClusterBindingWhereInput) o;
    return Objects.equals(this.AND, virtualPrivateCloudClusterBindingWhereInput.AND) &&
        Objects.equals(this.NOT, virtualPrivateCloudClusterBindingWhereInput.NOT) &&
        Objects.equals(this.OR, virtualPrivateCloudClusterBindingWhereInput.OR) &&
        Objects.equals(this.cluster, virtualPrivateCloudClusterBindingWhereInput.cluster) &&
        Objects.equals(this.entityAsyncStatus, virtualPrivateCloudClusterBindingWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, virtualPrivateCloudClusterBindingWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, virtualPrivateCloudClusterBindingWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, virtualPrivateCloudClusterBindingWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.id, virtualPrivateCloudClusterBindingWhereInput.id) &&
        Objects.equals(this.idContains, virtualPrivateCloudClusterBindingWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, virtualPrivateCloudClusterBindingWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, virtualPrivateCloudClusterBindingWhereInput.idGt) &&
        Objects.equals(this.idGte, virtualPrivateCloudClusterBindingWhereInput.idGte) &&
        Objects.equals(this.idIn, virtualPrivateCloudClusterBindingWhereInput.idIn) &&
        Objects.equals(this.idLt, virtualPrivateCloudClusterBindingWhereInput.idLt) &&
        Objects.equals(this.idLte, virtualPrivateCloudClusterBindingWhereInput.idLte) &&
        Objects.equals(this.idNot, virtualPrivateCloudClusterBindingWhereInput.idNot) &&
        Objects.equals(this.idNotContains, virtualPrivateCloudClusterBindingWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, virtualPrivateCloudClusterBindingWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, virtualPrivateCloudClusterBindingWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, virtualPrivateCloudClusterBindingWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, virtualPrivateCloudClusterBindingWhereInput.idStartsWith) &&
        Objects.equals(this.phase, virtualPrivateCloudClusterBindingWhereInput.phase) &&
        Objects.equals(this.phaseIn, virtualPrivateCloudClusterBindingWhereInput.phaseIn) &&
        Objects.equals(this.phaseNot, virtualPrivateCloudClusterBindingWhereInput.phaseNot) &&
        Objects.equals(this.phaseNotIn, virtualPrivateCloudClusterBindingWhereInput.phaseNotIn) &&
        Objects.equals(this.tepIpPoolId, virtualPrivateCloudClusterBindingWhereInput.tepIpPoolId) &&
        Objects.equals(this.tepIpPoolIdContains, virtualPrivateCloudClusterBindingWhereInput.tepIpPoolIdContains) &&
        Objects.equals(this.tepIpPoolIdEndsWith, virtualPrivateCloudClusterBindingWhereInput.tepIpPoolIdEndsWith) &&
        Objects.equals(this.tepIpPoolIdGt, virtualPrivateCloudClusterBindingWhereInput.tepIpPoolIdGt) &&
        Objects.equals(this.tepIpPoolIdGte, virtualPrivateCloudClusterBindingWhereInput.tepIpPoolIdGte) &&
        Objects.equals(this.tepIpPoolIdIn, virtualPrivateCloudClusterBindingWhereInput.tepIpPoolIdIn) &&
        Objects.equals(this.tepIpPoolIdLt, virtualPrivateCloudClusterBindingWhereInput.tepIpPoolIdLt) &&
        Objects.equals(this.tepIpPoolIdLte, virtualPrivateCloudClusterBindingWhereInput.tepIpPoolIdLte) &&
        Objects.equals(this.tepIpPoolIdNot, virtualPrivateCloudClusterBindingWhereInput.tepIpPoolIdNot) &&
        Objects.equals(this.tepIpPoolIdNotContains, virtualPrivateCloudClusterBindingWhereInput.tepIpPoolIdNotContains) &&
        Objects.equals(this.tepIpPoolIdNotEndsWith, virtualPrivateCloudClusterBindingWhereInput.tepIpPoolIdNotEndsWith) &&
        Objects.equals(this.tepIpPoolIdNotIn, virtualPrivateCloudClusterBindingWhereInput.tepIpPoolIdNotIn) &&
        Objects.equals(this.tepIpPoolIdNotStartsWith, virtualPrivateCloudClusterBindingWhereInput.tepIpPoolIdNotStartsWith) &&
        Objects.equals(this.tepIpPoolIdStartsWith, virtualPrivateCloudClusterBindingWhereInput.tepIpPoolIdStartsWith) &&
        Objects.equals(this.vds, virtualPrivateCloudClusterBindingWhereInput.vds) &&
        Objects.equals(this.vlanId, virtualPrivateCloudClusterBindingWhereInput.vlanId) &&
        Objects.equals(this.vlanIdGt, virtualPrivateCloudClusterBindingWhereInput.vlanIdGt) &&
        Objects.equals(this.vlanIdGte, virtualPrivateCloudClusterBindingWhereInput.vlanIdGte) &&
        Objects.equals(this.vlanIdIn, virtualPrivateCloudClusterBindingWhereInput.vlanIdIn) &&
        Objects.equals(this.vlanIdLt, virtualPrivateCloudClusterBindingWhereInput.vlanIdLt) &&
        Objects.equals(this.vlanIdLte, virtualPrivateCloudClusterBindingWhereInput.vlanIdLte) &&
        Objects.equals(this.vlanIdNot, virtualPrivateCloudClusterBindingWhereInput.vlanIdNot) &&
        Objects.equals(this.vlanIdNotIn, virtualPrivateCloudClusterBindingWhereInput.vlanIdNotIn) &&
        Objects.equals(this.vpcService, virtualPrivateCloudClusterBindingWhereInput.vpcService);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, cluster, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, phase, phaseIn, phaseNot, phaseNotIn, tepIpPoolId, tepIpPoolIdContains, tepIpPoolIdEndsWith, tepIpPoolIdGt, tepIpPoolIdGte, tepIpPoolIdIn, tepIpPoolIdLt, tepIpPoolIdLte, tepIpPoolIdNot, tepIpPoolIdNotContains, tepIpPoolIdNotEndsWith, tepIpPoolIdNotIn, tepIpPoolIdNotStartsWith, tepIpPoolIdStartsWith, vds, vlanId, vlanIdGt, vlanIdGte, vlanIdIn, vlanIdLt, vlanIdLte, vlanIdNot, vlanIdNotIn, vpcService);
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
    sb.append("class VirtualPrivateCloudClusterBindingWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
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
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    phaseIn: ").append(toIndentedString(phaseIn)).append("\n");
    sb.append("    phaseNot: ").append(toIndentedString(phaseNot)).append("\n");
    sb.append("    phaseNotIn: ").append(toIndentedString(phaseNotIn)).append("\n");
    sb.append("    tepIpPoolId: ").append(toIndentedString(tepIpPoolId)).append("\n");
    sb.append("    tepIpPoolIdContains: ").append(toIndentedString(tepIpPoolIdContains)).append("\n");
    sb.append("    tepIpPoolIdEndsWith: ").append(toIndentedString(tepIpPoolIdEndsWith)).append("\n");
    sb.append("    tepIpPoolIdGt: ").append(toIndentedString(tepIpPoolIdGt)).append("\n");
    sb.append("    tepIpPoolIdGte: ").append(toIndentedString(tepIpPoolIdGte)).append("\n");
    sb.append("    tepIpPoolIdIn: ").append(toIndentedString(tepIpPoolIdIn)).append("\n");
    sb.append("    tepIpPoolIdLt: ").append(toIndentedString(tepIpPoolIdLt)).append("\n");
    sb.append("    tepIpPoolIdLte: ").append(toIndentedString(tepIpPoolIdLte)).append("\n");
    sb.append("    tepIpPoolIdNot: ").append(toIndentedString(tepIpPoolIdNot)).append("\n");
    sb.append("    tepIpPoolIdNotContains: ").append(toIndentedString(tepIpPoolIdNotContains)).append("\n");
    sb.append("    tepIpPoolIdNotEndsWith: ").append(toIndentedString(tepIpPoolIdNotEndsWith)).append("\n");
    sb.append("    tepIpPoolIdNotIn: ").append(toIndentedString(tepIpPoolIdNotIn)).append("\n");
    sb.append("    tepIpPoolIdNotStartsWith: ").append(toIndentedString(tepIpPoolIdNotStartsWith)).append("\n");
    sb.append("    tepIpPoolIdStartsWith: ").append(toIndentedString(tepIpPoolIdStartsWith)).append("\n");
    sb.append("    vds: ").append(toIndentedString(vds)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
    sb.append("    vlanIdGt: ").append(toIndentedString(vlanIdGt)).append("\n");
    sb.append("    vlanIdGte: ").append(toIndentedString(vlanIdGte)).append("\n");
    sb.append("    vlanIdIn: ").append(toIndentedString(vlanIdIn)).append("\n");
    sb.append("    vlanIdLt: ").append(toIndentedString(vlanIdLt)).append("\n");
    sb.append("    vlanIdLte: ").append(toIndentedString(vlanIdLte)).append("\n");
    sb.append("    vlanIdNot: ").append(toIndentedString(vlanIdNot)).append("\n");
    sb.append("    vlanIdNotIn: ").append(toIndentedString(vlanIdNotIn)).append("\n");
    sb.append("    vpcService: ").append(toIndentedString(vpcService)).append("\n");
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

