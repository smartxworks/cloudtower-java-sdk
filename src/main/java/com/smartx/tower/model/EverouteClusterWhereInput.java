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
import com.smartx.tower.model.GlobalPolicyAction;
import com.smartx.tower.model.LoadBalancerServiceWhereInput;
import com.smartx.tower.model.VdsWhereInput;
import com.smartx.tower.model.VirtualPrivateCloudServiceWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * EverouteClusterWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class EverouteClusterWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<EverouteClusterWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<EverouteClusterWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<EverouteClusterWhereInput> OR = null;

  public static final String SERIALIZED_NAME_AGENT_ELF_CLUSTERS_EVERY = "agent_elf_clusters_every";
  @SerializedName(SERIALIZED_NAME_AGENT_ELF_CLUSTERS_EVERY)
  private ClusterWhereInput agentElfClustersEvery;

  public static final String SERIALIZED_NAME_AGENT_ELF_CLUSTERS_NONE = "agent_elf_clusters_none";
  @SerializedName(SERIALIZED_NAME_AGENT_ELF_CLUSTERS_NONE)
  private ClusterWhereInput agentElfClustersNone;

  public static final String SERIALIZED_NAME_AGENT_ELF_CLUSTERS_SOME = "agent_elf_clusters_some";
  @SerializedName(SERIALIZED_NAME_AGENT_ELF_CLUSTERS_SOME)
  private ClusterWhereInput agentElfClustersSome;

  public static final String SERIALIZED_NAME_AGENT_ELF_VDSES_EVERY = "agent_elf_vdses_every";
  @SerializedName(SERIALIZED_NAME_AGENT_ELF_VDSES_EVERY)
  private VdsWhereInput agentElfVdsesEvery;

  public static final String SERIALIZED_NAME_AGENT_ELF_VDSES_NONE = "agent_elf_vdses_none";
  @SerializedName(SERIALIZED_NAME_AGENT_ELF_VDSES_NONE)
  private VdsWhereInput agentElfVdsesNone;

  public static final String SERIALIZED_NAME_AGENT_ELF_VDSES_SOME = "agent_elf_vdses_some";
  @SerializedName(SERIALIZED_NAME_AGENT_ELF_VDSES_SOME)
  private VdsWhereInput agentElfVdsesSome;

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

  public static final String SERIALIZED_NAME_GLOBAL_DEFAULT_ACTION = "global_default_action";
  @SerializedName(SERIALIZED_NAME_GLOBAL_DEFAULT_ACTION)
  private GlobalPolicyAction globalDefaultAction;

  public static final String SERIALIZED_NAME_GLOBAL_DEFAULT_ACTION_IN = "global_default_action_in";
  @SerializedName(SERIALIZED_NAME_GLOBAL_DEFAULT_ACTION_IN)
  private List<GlobalPolicyAction> globalDefaultActionIn = null;

  public static final String SERIALIZED_NAME_GLOBAL_DEFAULT_ACTION_NOT = "global_default_action_not";
  @SerializedName(SERIALIZED_NAME_GLOBAL_DEFAULT_ACTION_NOT)
  private GlobalPolicyAction globalDefaultActionNot;

  public static final String SERIALIZED_NAME_GLOBAL_DEFAULT_ACTION_NOT_IN = "global_default_action_not_in";
  @SerializedName(SERIALIZED_NAME_GLOBAL_DEFAULT_ACTION_NOT_IN)
  private List<GlobalPolicyAction> globalDefaultActionNotIn = null;

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

  public static final String SERIALIZED_NAME_INSTALLED = "installed";
  @SerializedName(SERIALIZED_NAME_INSTALLED)
  private Boolean installed;

  public static final String SERIALIZED_NAME_INSTALLED_NOT = "installed_not";
  @SerializedName(SERIALIZED_NAME_INSTALLED_NOT)
  private Boolean installedNot;

  public static final String SERIALIZED_NAME_LOAD_BALANCER_SERVICE = "load_balancer_service";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_SERVICE)
  private LoadBalancerServiceWhereInput loadBalancerService;

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

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_VERSION_CONTAINS = "version_contains";
  @SerializedName(SERIALIZED_NAME_VERSION_CONTAINS)
  private String versionContains;

  public static final String SERIALIZED_NAME_VERSION_ENDS_WITH = "version_ends_with";
  @SerializedName(SERIALIZED_NAME_VERSION_ENDS_WITH)
  private String versionEndsWith;

  public static final String SERIALIZED_NAME_VERSION_GT = "version_gt";
  @SerializedName(SERIALIZED_NAME_VERSION_GT)
  private String versionGt;

  public static final String SERIALIZED_NAME_VERSION_GTE = "version_gte";
  @SerializedName(SERIALIZED_NAME_VERSION_GTE)
  private String versionGte;

  public static final String SERIALIZED_NAME_VERSION_IN = "version_in";
  @SerializedName(SERIALIZED_NAME_VERSION_IN)
  private List<String> versionIn = null;

  public static final String SERIALIZED_NAME_VERSION_LT = "version_lt";
  @SerializedName(SERIALIZED_NAME_VERSION_LT)
  private String versionLt;

  public static final String SERIALIZED_NAME_VERSION_LTE = "version_lte";
  @SerializedName(SERIALIZED_NAME_VERSION_LTE)
  private String versionLte;

  public static final String SERIALIZED_NAME_VERSION_NOT = "version_not";
  @SerializedName(SERIALIZED_NAME_VERSION_NOT)
  private String versionNot;

  public static final String SERIALIZED_NAME_VERSION_NOT_CONTAINS = "version_not_contains";
  @SerializedName(SERIALIZED_NAME_VERSION_NOT_CONTAINS)
  private String versionNotContains;

  public static final String SERIALIZED_NAME_VERSION_NOT_ENDS_WITH = "version_not_ends_with";
  @SerializedName(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH)
  private String versionNotEndsWith;

  public static final String SERIALIZED_NAME_VERSION_NOT_IN = "version_not_in";
  @SerializedName(SERIALIZED_NAME_VERSION_NOT_IN)
  private List<String> versionNotIn = null;

  public static final String SERIALIZED_NAME_VERSION_NOT_STARTS_WITH = "version_not_starts_with";
  @SerializedName(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH)
  private String versionNotStartsWith;

  public static final String SERIALIZED_NAME_VERSION_STARTS_WITH = "version_starts_with";
  @SerializedName(SERIALIZED_NAME_VERSION_STARTS_WITH)
  private String versionStartsWith;

  public static final String SERIALIZED_NAME_VPC_SERVICE = "vpc_service";
  @SerializedName(SERIALIZED_NAME_VPC_SERVICE)
  private VirtualPrivateCloudServiceWhereInput vpcService;

  public EverouteClusterWhereInput() { 
  }

  public EverouteClusterWhereInput AND(List<EverouteClusterWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public EverouteClusterWhereInput addANDItem(EverouteClusterWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<EverouteClusterWhereInput>();
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

  public List<EverouteClusterWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<EverouteClusterWhereInput> AND) {
    this.AND = AND;
  }


  public EverouteClusterWhereInput NOT(List<EverouteClusterWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public EverouteClusterWhereInput addNOTItem(EverouteClusterWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<EverouteClusterWhereInput>();
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

  public List<EverouteClusterWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<EverouteClusterWhereInput> NOT) {
    this.NOT = NOT;
  }


  public EverouteClusterWhereInput OR(List<EverouteClusterWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public EverouteClusterWhereInput addORItem(EverouteClusterWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<EverouteClusterWhereInput>();
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

  public List<EverouteClusterWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<EverouteClusterWhereInput> OR) {
    this.OR = OR;
  }


  public EverouteClusterWhereInput agentElfClustersEvery(ClusterWhereInput agentElfClustersEvery) {
    
    this.agentElfClustersEvery = agentElfClustersEvery;
    return this;
  }

   /**
   * Get agentElfClustersEvery
   * @return agentElfClustersEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterWhereInput getAgentElfClustersEvery() {
    return agentElfClustersEvery;
  }


  public void setAgentElfClustersEvery(ClusterWhereInput agentElfClustersEvery) {
    this.agentElfClustersEvery = agentElfClustersEvery;
  }


  public EverouteClusterWhereInput agentElfClustersNone(ClusterWhereInput agentElfClustersNone) {
    
    this.agentElfClustersNone = agentElfClustersNone;
    return this;
  }

   /**
   * Get agentElfClustersNone
   * @return agentElfClustersNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterWhereInput getAgentElfClustersNone() {
    return agentElfClustersNone;
  }


  public void setAgentElfClustersNone(ClusterWhereInput agentElfClustersNone) {
    this.agentElfClustersNone = agentElfClustersNone;
  }


  public EverouteClusterWhereInput agentElfClustersSome(ClusterWhereInput agentElfClustersSome) {
    
    this.agentElfClustersSome = agentElfClustersSome;
    return this;
  }

   /**
   * Get agentElfClustersSome
   * @return agentElfClustersSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterWhereInput getAgentElfClustersSome() {
    return agentElfClustersSome;
  }


  public void setAgentElfClustersSome(ClusterWhereInput agentElfClustersSome) {
    this.agentElfClustersSome = agentElfClustersSome;
  }


  public EverouteClusterWhereInput agentElfVdsesEvery(VdsWhereInput agentElfVdsesEvery) {
    
    this.agentElfVdsesEvery = agentElfVdsesEvery;
    return this;
  }

   /**
   * Get agentElfVdsesEvery
   * @return agentElfVdsesEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VdsWhereInput getAgentElfVdsesEvery() {
    return agentElfVdsesEvery;
  }


  public void setAgentElfVdsesEvery(VdsWhereInput agentElfVdsesEvery) {
    this.agentElfVdsesEvery = agentElfVdsesEvery;
  }


  public EverouteClusterWhereInput agentElfVdsesNone(VdsWhereInput agentElfVdsesNone) {
    
    this.agentElfVdsesNone = agentElfVdsesNone;
    return this;
  }

   /**
   * Get agentElfVdsesNone
   * @return agentElfVdsesNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VdsWhereInput getAgentElfVdsesNone() {
    return agentElfVdsesNone;
  }


  public void setAgentElfVdsesNone(VdsWhereInput agentElfVdsesNone) {
    this.agentElfVdsesNone = agentElfVdsesNone;
  }


  public EverouteClusterWhereInput agentElfVdsesSome(VdsWhereInput agentElfVdsesSome) {
    
    this.agentElfVdsesSome = agentElfVdsesSome;
    return this;
  }

   /**
   * Get agentElfVdsesSome
   * @return agentElfVdsesSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VdsWhereInput getAgentElfVdsesSome() {
    return agentElfVdsesSome;
  }


  public void setAgentElfVdsesSome(VdsWhereInput agentElfVdsesSome) {
    this.agentElfVdsesSome = agentElfVdsesSome;
  }


  public EverouteClusterWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public EverouteClusterWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public EverouteClusterWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public EverouteClusterWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public EverouteClusterWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public EverouteClusterWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public EverouteClusterWhereInput globalDefaultAction(GlobalPolicyAction globalDefaultAction) {
    
    this.globalDefaultAction = globalDefaultAction;
    return this;
  }

   /**
   * Get globalDefaultAction
   * @return globalDefaultAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GlobalPolicyAction getGlobalDefaultAction() {
    return globalDefaultAction;
  }


  public void setGlobalDefaultAction(GlobalPolicyAction globalDefaultAction) {
    this.globalDefaultAction = globalDefaultAction;
  }


  public EverouteClusterWhereInput globalDefaultActionIn(List<GlobalPolicyAction> globalDefaultActionIn) {
    
    this.globalDefaultActionIn = globalDefaultActionIn;
    return this;
  }

  public EverouteClusterWhereInput addGlobalDefaultActionInItem(GlobalPolicyAction globalDefaultActionInItem) {
    if (this.globalDefaultActionIn == null) {
      this.globalDefaultActionIn = new ArrayList<GlobalPolicyAction>();
    }
    this.globalDefaultActionIn.add(globalDefaultActionInItem);
    return this;
  }

   /**
   * Get globalDefaultActionIn
   * @return globalDefaultActionIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GlobalPolicyAction> getGlobalDefaultActionIn() {
    return globalDefaultActionIn;
  }


  public void setGlobalDefaultActionIn(List<GlobalPolicyAction> globalDefaultActionIn) {
    this.globalDefaultActionIn = globalDefaultActionIn;
  }


  public EverouteClusterWhereInput globalDefaultActionNot(GlobalPolicyAction globalDefaultActionNot) {
    
    this.globalDefaultActionNot = globalDefaultActionNot;
    return this;
  }

   /**
   * Get globalDefaultActionNot
   * @return globalDefaultActionNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GlobalPolicyAction getGlobalDefaultActionNot() {
    return globalDefaultActionNot;
  }


  public void setGlobalDefaultActionNot(GlobalPolicyAction globalDefaultActionNot) {
    this.globalDefaultActionNot = globalDefaultActionNot;
  }


  public EverouteClusterWhereInput globalDefaultActionNotIn(List<GlobalPolicyAction> globalDefaultActionNotIn) {
    
    this.globalDefaultActionNotIn = globalDefaultActionNotIn;
    return this;
  }

  public EverouteClusterWhereInput addGlobalDefaultActionNotInItem(GlobalPolicyAction globalDefaultActionNotInItem) {
    if (this.globalDefaultActionNotIn == null) {
      this.globalDefaultActionNotIn = new ArrayList<GlobalPolicyAction>();
    }
    this.globalDefaultActionNotIn.add(globalDefaultActionNotInItem);
    return this;
  }

   /**
   * Get globalDefaultActionNotIn
   * @return globalDefaultActionNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GlobalPolicyAction> getGlobalDefaultActionNotIn() {
    return globalDefaultActionNotIn;
  }


  public void setGlobalDefaultActionNotIn(List<GlobalPolicyAction> globalDefaultActionNotIn) {
    this.globalDefaultActionNotIn = globalDefaultActionNotIn;
  }


  public EverouteClusterWhereInput id(String id) {
    
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


  public EverouteClusterWhereInput idContains(String idContains) {
    
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


  public EverouteClusterWhereInput idEndsWith(String idEndsWith) {
    
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


  public EverouteClusterWhereInput idGt(String idGt) {
    
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


  public EverouteClusterWhereInput idGte(String idGte) {
    
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


  public EverouteClusterWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public EverouteClusterWhereInput addIdInItem(String idInItem) {
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


  public EverouteClusterWhereInput idLt(String idLt) {
    
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


  public EverouteClusterWhereInput idLte(String idLte) {
    
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


  public EverouteClusterWhereInput idNot(String idNot) {
    
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


  public EverouteClusterWhereInput idNotContains(String idNotContains) {
    
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


  public EverouteClusterWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public EverouteClusterWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public EverouteClusterWhereInput addIdNotInItem(String idNotInItem) {
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


  public EverouteClusterWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public EverouteClusterWhereInput idStartsWith(String idStartsWith) {
    
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


  public EverouteClusterWhereInput installed(Boolean installed) {
    
    this.installed = installed;
    return this;
  }

   /**
   * Get installed
   * @return installed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInstalled() {
    return installed;
  }


  public void setInstalled(Boolean installed) {
    this.installed = installed;
  }


  public EverouteClusterWhereInput installedNot(Boolean installedNot) {
    
    this.installedNot = installedNot;
    return this;
  }

   /**
   * Get installedNot
   * @return installedNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInstalledNot() {
    return installedNot;
  }


  public void setInstalledNot(Boolean installedNot) {
    this.installedNot = installedNot;
  }


  public EverouteClusterWhereInput loadBalancerService(LoadBalancerServiceWhereInput loadBalancerService) {
    
    this.loadBalancerService = loadBalancerService;
    return this;
  }

   /**
   * Get loadBalancerService
   * @return loadBalancerService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LoadBalancerServiceWhereInput getLoadBalancerService() {
    return loadBalancerService;
  }


  public void setLoadBalancerService(LoadBalancerServiceWhereInput loadBalancerService) {
    this.loadBalancerService = loadBalancerService;
  }


  public EverouteClusterWhereInput name(String name) {
    
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


  public EverouteClusterWhereInput nameContains(String nameContains) {
    
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


  public EverouteClusterWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public EverouteClusterWhereInput nameGt(String nameGt) {
    
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


  public EverouteClusterWhereInput nameGte(String nameGte) {
    
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


  public EverouteClusterWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public EverouteClusterWhereInput addNameInItem(String nameInItem) {
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


  public EverouteClusterWhereInput nameLt(String nameLt) {
    
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


  public EverouteClusterWhereInput nameLte(String nameLte) {
    
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


  public EverouteClusterWhereInput nameNot(String nameNot) {
    
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


  public EverouteClusterWhereInput nameNotContains(String nameNotContains) {
    
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


  public EverouteClusterWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public EverouteClusterWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public EverouteClusterWhereInput addNameNotInItem(String nameNotInItem) {
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


  public EverouteClusterWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public EverouteClusterWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public EverouteClusterWhereInput phase(EverouteClusterPhase phase) {
    
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


  public EverouteClusterWhereInput phaseIn(List<EverouteClusterPhase> phaseIn) {
    
    this.phaseIn = phaseIn;
    return this;
  }

  public EverouteClusterWhereInput addPhaseInItem(EverouteClusterPhase phaseInItem) {
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


  public EverouteClusterWhereInput phaseNot(EverouteClusterPhase phaseNot) {
    
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


  public EverouteClusterWhereInput phaseNotIn(List<EverouteClusterPhase> phaseNotIn) {
    
    this.phaseNotIn = phaseNotIn;
    return this;
  }

  public EverouteClusterWhereInput addPhaseNotInItem(EverouteClusterPhase phaseNotInItem) {
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


  public EverouteClusterWhereInput version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public EverouteClusterWhereInput versionContains(String versionContains) {
    
    this.versionContains = versionContains;
    return this;
  }

   /**
   * Get versionContains
   * @return versionContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionContains() {
    return versionContains;
  }


  public void setVersionContains(String versionContains) {
    this.versionContains = versionContains;
  }


  public EverouteClusterWhereInput versionEndsWith(String versionEndsWith) {
    
    this.versionEndsWith = versionEndsWith;
    return this;
  }

   /**
   * Get versionEndsWith
   * @return versionEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionEndsWith() {
    return versionEndsWith;
  }


  public void setVersionEndsWith(String versionEndsWith) {
    this.versionEndsWith = versionEndsWith;
  }


  public EverouteClusterWhereInput versionGt(String versionGt) {
    
    this.versionGt = versionGt;
    return this;
  }

   /**
   * Get versionGt
   * @return versionGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionGt() {
    return versionGt;
  }


  public void setVersionGt(String versionGt) {
    this.versionGt = versionGt;
  }


  public EverouteClusterWhereInput versionGte(String versionGte) {
    
    this.versionGte = versionGte;
    return this;
  }

   /**
   * Get versionGte
   * @return versionGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionGte() {
    return versionGte;
  }


  public void setVersionGte(String versionGte) {
    this.versionGte = versionGte;
  }


  public EverouteClusterWhereInput versionIn(List<String> versionIn) {
    
    this.versionIn = versionIn;
    return this;
  }

  public EverouteClusterWhereInput addVersionInItem(String versionInItem) {
    if (this.versionIn == null) {
      this.versionIn = new ArrayList<String>();
    }
    this.versionIn.add(versionInItem);
    return this;
  }

   /**
   * Get versionIn
   * @return versionIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getVersionIn() {
    return versionIn;
  }


  public void setVersionIn(List<String> versionIn) {
    this.versionIn = versionIn;
  }


  public EverouteClusterWhereInput versionLt(String versionLt) {
    
    this.versionLt = versionLt;
    return this;
  }

   /**
   * Get versionLt
   * @return versionLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionLt() {
    return versionLt;
  }


  public void setVersionLt(String versionLt) {
    this.versionLt = versionLt;
  }


  public EverouteClusterWhereInput versionLte(String versionLte) {
    
    this.versionLte = versionLte;
    return this;
  }

   /**
   * Get versionLte
   * @return versionLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionLte() {
    return versionLte;
  }


  public void setVersionLte(String versionLte) {
    this.versionLte = versionLte;
  }


  public EverouteClusterWhereInput versionNot(String versionNot) {
    
    this.versionNot = versionNot;
    return this;
  }

   /**
   * Get versionNot
   * @return versionNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionNot() {
    return versionNot;
  }


  public void setVersionNot(String versionNot) {
    this.versionNot = versionNot;
  }


  public EverouteClusterWhereInput versionNotContains(String versionNotContains) {
    
    this.versionNotContains = versionNotContains;
    return this;
  }

   /**
   * Get versionNotContains
   * @return versionNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionNotContains() {
    return versionNotContains;
  }


  public void setVersionNotContains(String versionNotContains) {
    this.versionNotContains = versionNotContains;
  }


  public EverouteClusterWhereInput versionNotEndsWith(String versionNotEndsWith) {
    
    this.versionNotEndsWith = versionNotEndsWith;
    return this;
  }

   /**
   * Get versionNotEndsWith
   * @return versionNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionNotEndsWith() {
    return versionNotEndsWith;
  }


  public void setVersionNotEndsWith(String versionNotEndsWith) {
    this.versionNotEndsWith = versionNotEndsWith;
  }


  public EverouteClusterWhereInput versionNotIn(List<String> versionNotIn) {
    
    this.versionNotIn = versionNotIn;
    return this;
  }

  public EverouteClusterWhereInput addVersionNotInItem(String versionNotInItem) {
    if (this.versionNotIn == null) {
      this.versionNotIn = new ArrayList<String>();
    }
    this.versionNotIn.add(versionNotInItem);
    return this;
  }

   /**
   * Get versionNotIn
   * @return versionNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getVersionNotIn() {
    return versionNotIn;
  }


  public void setVersionNotIn(List<String> versionNotIn) {
    this.versionNotIn = versionNotIn;
  }


  public EverouteClusterWhereInput versionNotStartsWith(String versionNotStartsWith) {
    
    this.versionNotStartsWith = versionNotStartsWith;
    return this;
  }

   /**
   * Get versionNotStartsWith
   * @return versionNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionNotStartsWith() {
    return versionNotStartsWith;
  }


  public void setVersionNotStartsWith(String versionNotStartsWith) {
    this.versionNotStartsWith = versionNotStartsWith;
  }


  public EverouteClusterWhereInput versionStartsWith(String versionStartsWith) {
    
    this.versionStartsWith = versionStartsWith;
    return this;
  }

   /**
   * Get versionStartsWith
   * @return versionStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionStartsWith() {
    return versionStartsWith;
  }


  public void setVersionStartsWith(String versionStartsWith) {
    this.versionStartsWith = versionStartsWith;
  }


  public EverouteClusterWhereInput vpcService(VirtualPrivateCloudServiceWhereInput vpcService) {
    
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
    EverouteClusterWhereInput everouteClusterWhereInput = (EverouteClusterWhereInput) o;
    return Objects.equals(this.AND, everouteClusterWhereInput.AND) &&
        Objects.equals(this.NOT, everouteClusterWhereInput.NOT) &&
        Objects.equals(this.OR, everouteClusterWhereInput.OR) &&
        Objects.equals(this.agentElfClustersEvery, everouteClusterWhereInput.agentElfClustersEvery) &&
        Objects.equals(this.agentElfClustersNone, everouteClusterWhereInput.agentElfClustersNone) &&
        Objects.equals(this.agentElfClustersSome, everouteClusterWhereInput.agentElfClustersSome) &&
        Objects.equals(this.agentElfVdsesEvery, everouteClusterWhereInput.agentElfVdsesEvery) &&
        Objects.equals(this.agentElfVdsesNone, everouteClusterWhereInput.agentElfVdsesNone) &&
        Objects.equals(this.agentElfVdsesSome, everouteClusterWhereInput.agentElfVdsesSome) &&
        Objects.equals(this.entityAsyncStatus, everouteClusterWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, everouteClusterWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, everouteClusterWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, everouteClusterWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.globalDefaultAction, everouteClusterWhereInput.globalDefaultAction) &&
        Objects.equals(this.globalDefaultActionIn, everouteClusterWhereInput.globalDefaultActionIn) &&
        Objects.equals(this.globalDefaultActionNot, everouteClusterWhereInput.globalDefaultActionNot) &&
        Objects.equals(this.globalDefaultActionNotIn, everouteClusterWhereInput.globalDefaultActionNotIn) &&
        Objects.equals(this.id, everouteClusterWhereInput.id) &&
        Objects.equals(this.idContains, everouteClusterWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, everouteClusterWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, everouteClusterWhereInput.idGt) &&
        Objects.equals(this.idGte, everouteClusterWhereInput.idGte) &&
        Objects.equals(this.idIn, everouteClusterWhereInput.idIn) &&
        Objects.equals(this.idLt, everouteClusterWhereInput.idLt) &&
        Objects.equals(this.idLte, everouteClusterWhereInput.idLte) &&
        Objects.equals(this.idNot, everouteClusterWhereInput.idNot) &&
        Objects.equals(this.idNotContains, everouteClusterWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, everouteClusterWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, everouteClusterWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, everouteClusterWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, everouteClusterWhereInput.idStartsWith) &&
        Objects.equals(this.installed, everouteClusterWhereInput.installed) &&
        Objects.equals(this.installedNot, everouteClusterWhereInput.installedNot) &&
        Objects.equals(this.loadBalancerService, everouteClusterWhereInput.loadBalancerService) &&
        Objects.equals(this.name, everouteClusterWhereInput.name) &&
        Objects.equals(this.nameContains, everouteClusterWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, everouteClusterWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, everouteClusterWhereInput.nameGt) &&
        Objects.equals(this.nameGte, everouteClusterWhereInput.nameGte) &&
        Objects.equals(this.nameIn, everouteClusterWhereInput.nameIn) &&
        Objects.equals(this.nameLt, everouteClusterWhereInput.nameLt) &&
        Objects.equals(this.nameLte, everouteClusterWhereInput.nameLte) &&
        Objects.equals(this.nameNot, everouteClusterWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, everouteClusterWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, everouteClusterWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, everouteClusterWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, everouteClusterWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, everouteClusterWhereInput.nameStartsWith) &&
        Objects.equals(this.phase, everouteClusterWhereInput.phase) &&
        Objects.equals(this.phaseIn, everouteClusterWhereInput.phaseIn) &&
        Objects.equals(this.phaseNot, everouteClusterWhereInput.phaseNot) &&
        Objects.equals(this.phaseNotIn, everouteClusterWhereInput.phaseNotIn) &&
        Objects.equals(this.version, everouteClusterWhereInput.version) &&
        Objects.equals(this.versionContains, everouteClusterWhereInput.versionContains) &&
        Objects.equals(this.versionEndsWith, everouteClusterWhereInput.versionEndsWith) &&
        Objects.equals(this.versionGt, everouteClusterWhereInput.versionGt) &&
        Objects.equals(this.versionGte, everouteClusterWhereInput.versionGte) &&
        Objects.equals(this.versionIn, everouteClusterWhereInput.versionIn) &&
        Objects.equals(this.versionLt, everouteClusterWhereInput.versionLt) &&
        Objects.equals(this.versionLte, everouteClusterWhereInput.versionLte) &&
        Objects.equals(this.versionNot, everouteClusterWhereInput.versionNot) &&
        Objects.equals(this.versionNotContains, everouteClusterWhereInput.versionNotContains) &&
        Objects.equals(this.versionNotEndsWith, everouteClusterWhereInput.versionNotEndsWith) &&
        Objects.equals(this.versionNotIn, everouteClusterWhereInput.versionNotIn) &&
        Objects.equals(this.versionNotStartsWith, everouteClusterWhereInput.versionNotStartsWith) &&
        Objects.equals(this.versionStartsWith, everouteClusterWhereInput.versionStartsWith) &&
        Objects.equals(this.vpcService, everouteClusterWhereInput.vpcService);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, agentElfClustersEvery, agentElfClustersNone, agentElfClustersSome, agentElfVdsesEvery, agentElfVdsesNone, agentElfVdsesSome, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, globalDefaultAction, globalDefaultActionIn, globalDefaultActionNot, globalDefaultActionNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, installed, installedNot, loadBalancerService, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, phase, phaseIn, phaseNot, phaseNotIn, version, versionContains, versionEndsWith, versionGt, versionGte, versionIn, versionLt, versionLte, versionNot, versionNotContains, versionNotEndsWith, versionNotIn, versionNotStartsWith, versionStartsWith, vpcService);
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
    sb.append("class EverouteClusterWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    agentElfClustersEvery: ").append(toIndentedString(agentElfClustersEvery)).append("\n");
    sb.append("    agentElfClustersNone: ").append(toIndentedString(agentElfClustersNone)).append("\n");
    sb.append("    agentElfClustersSome: ").append(toIndentedString(agentElfClustersSome)).append("\n");
    sb.append("    agentElfVdsesEvery: ").append(toIndentedString(agentElfVdsesEvery)).append("\n");
    sb.append("    agentElfVdsesNone: ").append(toIndentedString(agentElfVdsesNone)).append("\n");
    sb.append("    agentElfVdsesSome: ").append(toIndentedString(agentElfVdsesSome)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    entityAsyncStatusIn: ").append(toIndentedString(entityAsyncStatusIn)).append("\n");
    sb.append("    entityAsyncStatusNot: ").append(toIndentedString(entityAsyncStatusNot)).append("\n");
    sb.append("    entityAsyncStatusNotIn: ").append(toIndentedString(entityAsyncStatusNotIn)).append("\n");
    sb.append("    globalDefaultAction: ").append(toIndentedString(globalDefaultAction)).append("\n");
    sb.append("    globalDefaultActionIn: ").append(toIndentedString(globalDefaultActionIn)).append("\n");
    sb.append("    globalDefaultActionNot: ").append(toIndentedString(globalDefaultActionNot)).append("\n");
    sb.append("    globalDefaultActionNotIn: ").append(toIndentedString(globalDefaultActionNotIn)).append("\n");
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
    sb.append("    installed: ").append(toIndentedString(installed)).append("\n");
    sb.append("    installedNot: ").append(toIndentedString(installedNot)).append("\n");
    sb.append("    loadBalancerService: ").append(toIndentedString(loadBalancerService)).append("\n");
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
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    phaseIn: ").append(toIndentedString(phaseIn)).append("\n");
    sb.append("    phaseNot: ").append(toIndentedString(phaseNot)).append("\n");
    sb.append("    phaseNotIn: ").append(toIndentedString(phaseNotIn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionContains: ").append(toIndentedString(versionContains)).append("\n");
    sb.append("    versionEndsWith: ").append(toIndentedString(versionEndsWith)).append("\n");
    sb.append("    versionGt: ").append(toIndentedString(versionGt)).append("\n");
    sb.append("    versionGte: ").append(toIndentedString(versionGte)).append("\n");
    sb.append("    versionIn: ").append(toIndentedString(versionIn)).append("\n");
    sb.append("    versionLt: ").append(toIndentedString(versionLt)).append("\n");
    sb.append("    versionLte: ").append(toIndentedString(versionLte)).append("\n");
    sb.append("    versionNot: ").append(toIndentedString(versionNot)).append("\n");
    sb.append("    versionNotContains: ").append(toIndentedString(versionNotContains)).append("\n");
    sb.append("    versionNotEndsWith: ").append(toIndentedString(versionNotEndsWith)).append("\n");
    sb.append("    versionNotIn: ").append(toIndentedString(versionNotIn)).append("\n");
    sb.append("    versionNotStartsWith: ").append(toIndentedString(versionNotStartsWith)).append("\n");
    sb.append("    versionStartsWith: ").append(toIndentedString(versionStartsWith)).append("\n");
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

