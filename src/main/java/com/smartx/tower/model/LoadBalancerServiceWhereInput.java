package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.EverouteClusterPhase;
import com.smartx.tower.model.EverouteClusterWhereInput;
import com.smartx.tower.model.VmWhereInput;
import com.smartx.tower.model.VnetBondWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * LoadBalancerServiceWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class LoadBalancerServiceWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<LoadBalancerServiceWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<LoadBalancerServiceWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<LoadBalancerServiceWhereInput> OR = null;

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

  public static final String SERIALIZED_NAME_EVEROUTE_CLUSTER = "everoute_cluster";
  @SerializedName(SERIALIZED_NAME_EVEROUTE_CLUSTER)
  private EverouteClusterWhereInput everouteCluster;

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

  public static final String SERIALIZED_NAME_VM_INSTANCES_EVERY = "vm_instances_every";
  @SerializedName(SERIALIZED_NAME_VM_INSTANCES_EVERY)
  private VmWhereInput vmInstancesEvery;

  public static final String SERIALIZED_NAME_VM_INSTANCES_NONE = "vm_instances_none";
  @SerializedName(SERIALIZED_NAME_VM_INSTANCES_NONE)
  private VmWhereInput vmInstancesNone;

  public static final String SERIALIZED_NAME_VM_INSTANCES_SOME = "vm_instances_some";
  @SerializedName(SERIALIZED_NAME_VM_INSTANCES_SOME)
  private VmWhereInput vmInstancesSome;

  public static final String SERIALIZED_NAME_VNET_BONDS_EVERY = "vnet_bonds_every";
  @SerializedName(SERIALIZED_NAME_VNET_BONDS_EVERY)
  private VnetBondWhereInput vnetBondsEvery;

  public static final String SERIALIZED_NAME_VNET_BONDS_NONE = "vnet_bonds_none";
  @SerializedName(SERIALIZED_NAME_VNET_BONDS_NONE)
  private VnetBondWhereInput vnetBondsNone;

  public static final String SERIALIZED_NAME_VNET_BONDS_SOME = "vnet_bonds_some";
  @SerializedName(SERIALIZED_NAME_VNET_BONDS_SOME)
  private VnetBondWhereInput vnetBondsSome;

  public LoadBalancerServiceWhereInput() { 
  }

  public LoadBalancerServiceWhereInput AND(List<LoadBalancerServiceWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public LoadBalancerServiceWhereInput addANDItem(LoadBalancerServiceWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<LoadBalancerServiceWhereInput>();
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

  public List<LoadBalancerServiceWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<LoadBalancerServiceWhereInput> AND) {
    this.AND = AND;
  }


  public LoadBalancerServiceWhereInput NOT(List<LoadBalancerServiceWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public LoadBalancerServiceWhereInput addNOTItem(LoadBalancerServiceWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<LoadBalancerServiceWhereInput>();
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

  public List<LoadBalancerServiceWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<LoadBalancerServiceWhereInput> NOT) {
    this.NOT = NOT;
  }


  public LoadBalancerServiceWhereInput OR(List<LoadBalancerServiceWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public LoadBalancerServiceWhereInput addORItem(LoadBalancerServiceWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<LoadBalancerServiceWhereInput>();
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

  public List<LoadBalancerServiceWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<LoadBalancerServiceWhereInput> OR) {
    this.OR = OR;
  }


  public LoadBalancerServiceWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public LoadBalancerServiceWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public LoadBalancerServiceWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public LoadBalancerServiceWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public LoadBalancerServiceWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public LoadBalancerServiceWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public LoadBalancerServiceWhereInput everouteCluster(EverouteClusterWhereInput everouteCluster) {
    
    this.everouteCluster = everouteCluster;
    return this;
  }

   /**
   * Get everouteCluster
   * @return everouteCluster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EverouteClusterWhereInput getEverouteCluster() {
    return everouteCluster;
  }


  public void setEverouteCluster(EverouteClusterWhereInput everouteCluster) {
    this.everouteCluster = everouteCluster;
  }


  public LoadBalancerServiceWhereInput id(String id) {
    
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


  public LoadBalancerServiceWhereInput idContains(String idContains) {
    
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


  public LoadBalancerServiceWhereInput idEndsWith(String idEndsWith) {
    
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


  public LoadBalancerServiceWhereInput idGt(String idGt) {
    
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


  public LoadBalancerServiceWhereInput idGte(String idGte) {
    
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


  public LoadBalancerServiceWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public LoadBalancerServiceWhereInput addIdInItem(String idInItem) {
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


  public LoadBalancerServiceWhereInput idLt(String idLt) {
    
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


  public LoadBalancerServiceWhereInput idLte(String idLte) {
    
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


  public LoadBalancerServiceWhereInput idNot(String idNot) {
    
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


  public LoadBalancerServiceWhereInput idNotContains(String idNotContains) {
    
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


  public LoadBalancerServiceWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public LoadBalancerServiceWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public LoadBalancerServiceWhereInput addIdNotInItem(String idNotInItem) {
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


  public LoadBalancerServiceWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public LoadBalancerServiceWhereInput idStartsWith(String idStartsWith) {
    
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


  public LoadBalancerServiceWhereInput phase(EverouteClusterPhase phase) {
    
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


  public LoadBalancerServiceWhereInput phaseIn(List<EverouteClusterPhase> phaseIn) {
    
    this.phaseIn = phaseIn;
    return this;
  }

  public LoadBalancerServiceWhereInput addPhaseInItem(EverouteClusterPhase phaseInItem) {
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


  public LoadBalancerServiceWhereInput phaseNot(EverouteClusterPhase phaseNot) {
    
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


  public LoadBalancerServiceWhereInput phaseNotIn(List<EverouteClusterPhase> phaseNotIn) {
    
    this.phaseNotIn = phaseNotIn;
    return this;
  }

  public LoadBalancerServiceWhereInput addPhaseNotInItem(EverouteClusterPhase phaseNotInItem) {
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


  public LoadBalancerServiceWhereInput vmInstancesEvery(VmWhereInput vmInstancesEvery) {
    
    this.vmInstancesEvery = vmInstancesEvery;
    return this;
  }

   /**
   * Get vmInstancesEvery
   * @return vmInstancesEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVmInstancesEvery() {
    return vmInstancesEvery;
  }


  public void setVmInstancesEvery(VmWhereInput vmInstancesEvery) {
    this.vmInstancesEvery = vmInstancesEvery;
  }


  public LoadBalancerServiceWhereInput vmInstancesNone(VmWhereInput vmInstancesNone) {
    
    this.vmInstancesNone = vmInstancesNone;
    return this;
  }

   /**
   * Get vmInstancesNone
   * @return vmInstancesNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVmInstancesNone() {
    return vmInstancesNone;
  }


  public void setVmInstancesNone(VmWhereInput vmInstancesNone) {
    this.vmInstancesNone = vmInstancesNone;
  }


  public LoadBalancerServiceWhereInput vmInstancesSome(VmWhereInput vmInstancesSome) {
    
    this.vmInstancesSome = vmInstancesSome;
    return this;
  }

   /**
   * Get vmInstancesSome
   * @return vmInstancesSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVmInstancesSome() {
    return vmInstancesSome;
  }


  public void setVmInstancesSome(VmWhereInput vmInstancesSome) {
    this.vmInstancesSome = vmInstancesSome;
  }


  public LoadBalancerServiceWhereInput vnetBondsEvery(VnetBondWhereInput vnetBondsEvery) {
    
    this.vnetBondsEvery = vnetBondsEvery;
    return this;
  }

   /**
   * Get vnetBondsEvery
   * @return vnetBondsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VnetBondWhereInput getVnetBondsEvery() {
    return vnetBondsEvery;
  }


  public void setVnetBondsEvery(VnetBondWhereInput vnetBondsEvery) {
    this.vnetBondsEvery = vnetBondsEvery;
  }


  public LoadBalancerServiceWhereInput vnetBondsNone(VnetBondWhereInput vnetBondsNone) {
    
    this.vnetBondsNone = vnetBondsNone;
    return this;
  }

   /**
   * Get vnetBondsNone
   * @return vnetBondsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VnetBondWhereInput getVnetBondsNone() {
    return vnetBondsNone;
  }


  public void setVnetBondsNone(VnetBondWhereInput vnetBondsNone) {
    this.vnetBondsNone = vnetBondsNone;
  }


  public LoadBalancerServiceWhereInput vnetBondsSome(VnetBondWhereInput vnetBondsSome) {
    
    this.vnetBondsSome = vnetBondsSome;
    return this;
  }

   /**
   * Get vnetBondsSome
   * @return vnetBondsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VnetBondWhereInput getVnetBondsSome() {
    return vnetBondsSome;
  }


  public void setVnetBondsSome(VnetBondWhereInput vnetBondsSome) {
    this.vnetBondsSome = vnetBondsSome;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadBalancerServiceWhereInput loadBalancerServiceWhereInput = (LoadBalancerServiceWhereInput) o;
    return Objects.equals(this.AND, loadBalancerServiceWhereInput.AND) &&
        Objects.equals(this.NOT, loadBalancerServiceWhereInput.NOT) &&
        Objects.equals(this.OR, loadBalancerServiceWhereInput.OR) &&
        Objects.equals(this.entityAsyncStatus, loadBalancerServiceWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, loadBalancerServiceWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, loadBalancerServiceWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, loadBalancerServiceWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.everouteCluster, loadBalancerServiceWhereInput.everouteCluster) &&
        Objects.equals(this.id, loadBalancerServiceWhereInput.id) &&
        Objects.equals(this.idContains, loadBalancerServiceWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, loadBalancerServiceWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, loadBalancerServiceWhereInput.idGt) &&
        Objects.equals(this.idGte, loadBalancerServiceWhereInput.idGte) &&
        Objects.equals(this.idIn, loadBalancerServiceWhereInput.idIn) &&
        Objects.equals(this.idLt, loadBalancerServiceWhereInput.idLt) &&
        Objects.equals(this.idLte, loadBalancerServiceWhereInput.idLte) &&
        Objects.equals(this.idNot, loadBalancerServiceWhereInput.idNot) &&
        Objects.equals(this.idNotContains, loadBalancerServiceWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, loadBalancerServiceWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, loadBalancerServiceWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, loadBalancerServiceWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, loadBalancerServiceWhereInput.idStartsWith) &&
        Objects.equals(this.phase, loadBalancerServiceWhereInput.phase) &&
        Objects.equals(this.phaseIn, loadBalancerServiceWhereInput.phaseIn) &&
        Objects.equals(this.phaseNot, loadBalancerServiceWhereInput.phaseNot) &&
        Objects.equals(this.phaseNotIn, loadBalancerServiceWhereInput.phaseNotIn) &&
        Objects.equals(this.vmInstancesEvery, loadBalancerServiceWhereInput.vmInstancesEvery) &&
        Objects.equals(this.vmInstancesNone, loadBalancerServiceWhereInput.vmInstancesNone) &&
        Objects.equals(this.vmInstancesSome, loadBalancerServiceWhereInput.vmInstancesSome) &&
        Objects.equals(this.vnetBondsEvery, loadBalancerServiceWhereInput.vnetBondsEvery) &&
        Objects.equals(this.vnetBondsNone, loadBalancerServiceWhereInput.vnetBondsNone) &&
        Objects.equals(this.vnetBondsSome, loadBalancerServiceWhereInput.vnetBondsSome);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, everouteCluster, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, phase, phaseIn, phaseNot, phaseNotIn, vmInstancesEvery, vmInstancesNone, vmInstancesSome, vnetBondsEvery, vnetBondsNone, vnetBondsSome);
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
    sb.append("class LoadBalancerServiceWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    entityAsyncStatusIn: ").append(toIndentedString(entityAsyncStatusIn)).append("\n");
    sb.append("    entityAsyncStatusNot: ").append(toIndentedString(entityAsyncStatusNot)).append("\n");
    sb.append("    entityAsyncStatusNotIn: ").append(toIndentedString(entityAsyncStatusNotIn)).append("\n");
    sb.append("    everouteCluster: ").append(toIndentedString(everouteCluster)).append("\n");
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
    sb.append("    vmInstancesEvery: ").append(toIndentedString(vmInstancesEvery)).append("\n");
    sb.append("    vmInstancesNone: ").append(toIndentedString(vmInstancesNone)).append("\n");
    sb.append("    vmInstancesSome: ").append(toIndentedString(vmInstancesSome)).append("\n");
    sb.append("    vnetBondsEvery: ").append(toIndentedString(vnetBondsEvery)).append("\n");
    sb.append("    vnetBondsNone: ").append(toIndentedString(vnetBondsNone)).append("\n");
    sb.append("    vnetBondsSome: ").append(toIndentedString(vnetBondsSome)).append("\n");
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

