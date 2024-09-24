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
import com.smartx.tower.model.VmWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VirtualPrivateCloudEdgeGatewayWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class VirtualPrivateCloudEdgeGatewayWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<VirtualPrivateCloudEdgeGatewayWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<VirtualPrivateCloudEdgeGatewayWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<VirtualPrivateCloudEdgeGatewayWhereInput> OR = null;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private ClusterWhereInput cluster;

  public static final String SERIALIZED_NAME_CPU_NUMBER = "cpu_number";
  @SerializedName(SERIALIZED_NAME_CPU_NUMBER)
  private Integer cpuNumber;

  public static final String SERIALIZED_NAME_CPU_NUMBER_GT = "cpu_number_gt";
  @SerializedName(SERIALIZED_NAME_CPU_NUMBER_GT)
  private Integer cpuNumberGt;

  public static final String SERIALIZED_NAME_CPU_NUMBER_GTE = "cpu_number_gte";
  @SerializedName(SERIALIZED_NAME_CPU_NUMBER_GTE)
  private Integer cpuNumberGte;

  public static final String SERIALIZED_NAME_CPU_NUMBER_IN = "cpu_number_in";
  @SerializedName(SERIALIZED_NAME_CPU_NUMBER_IN)
  private List<Integer> cpuNumberIn = null;

  public static final String SERIALIZED_NAME_CPU_NUMBER_LT = "cpu_number_lt";
  @SerializedName(SERIALIZED_NAME_CPU_NUMBER_LT)
  private Integer cpuNumberLt;

  public static final String SERIALIZED_NAME_CPU_NUMBER_LTE = "cpu_number_lte";
  @SerializedName(SERIALIZED_NAME_CPU_NUMBER_LTE)
  private Integer cpuNumberLte;

  public static final String SERIALIZED_NAME_CPU_NUMBER_NOT = "cpu_number_not";
  @SerializedName(SERIALIZED_NAME_CPU_NUMBER_NOT)
  private Integer cpuNumberNot;

  public static final String SERIALIZED_NAME_CPU_NUMBER_NOT_IN = "cpu_number_not_in";
  @SerializedName(SERIALIZED_NAME_CPU_NUMBER_NOT_IN)
  private List<Integer> cpuNumberNotIn = null;

  public static final String SERIALIZED_NAME_DATA_VOLUME_SIZE = "data_volume_size";
  @SerializedName(SERIALIZED_NAME_DATA_VOLUME_SIZE)
  private Integer dataVolumeSize;

  public static final String SERIALIZED_NAME_DATA_VOLUME_SIZE_GT = "data_volume_size_gt";
  @SerializedName(SERIALIZED_NAME_DATA_VOLUME_SIZE_GT)
  private Integer dataVolumeSizeGt;

  public static final String SERIALIZED_NAME_DATA_VOLUME_SIZE_GTE = "data_volume_size_gte";
  @SerializedName(SERIALIZED_NAME_DATA_VOLUME_SIZE_GTE)
  private Integer dataVolumeSizeGte;

  public static final String SERIALIZED_NAME_DATA_VOLUME_SIZE_IN = "data_volume_size_in";
  @SerializedName(SERIALIZED_NAME_DATA_VOLUME_SIZE_IN)
  private List<Integer> dataVolumeSizeIn = null;

  public static final String SERIALIZED_NAME_DATA_VOLUME_SIZE_LT = "data_volume_size_lt";
  @SerializedName(SERIALIZED_NAME_DATA_VOLUME_SIZE_LT)
  private Integer dataVolumeSizeLt;

  public static final String SERIALIZED_NAME_DATA_VOLUME_SIZE_LTE = "data_volume_size_lte";
  @SerializedName(SERIALIZED_NAME_DATA_VOLUME_SIZE_LTE)
  private Integer dataVolumeSizeLte;

  public static final String SERIALIZED_NAME_DATA_VOLUME_SIZE_NOT = "data_volume_size_not";
  @SerializedName(SERIALIZED_NAME_DATA_VOLUME_SIZE_NOT)
  private Integer dataVolumeSizeNot;

  public static final String SERIALIZED_NAME_DATA_VOLUME_SIZE_NOT_IN = "data_volume_size_not_in";
  @SerializedName(SERIALIZED_NAME_DATA_VOLUME_SIZE_NOT_IN)
  private List<Integer> dataVolumeSizeNotIn = null;

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

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_GATEWAY_CONTAINS = "gateway_contains";
  @SerializedName(SERIALIZED_NAME_GATEWAY_CONTAINS)
  private String gatewayContains;

  public static final String SERIALIZED_NAME_GATEWAY_ENDS_WITH = "gateway_ends_with";
  @SerializedName(SERIALIZED_NAME_GATEWAY_ENDS_WITH)
  private String gatewayEndsWith;

  public static final String SERIALIZED_NAME_GATEWAY_GT = "gateway_gt";
  @SerializedName(SERIALIZED_NAME_GATEWAY_GT)
  private String gatewayGt;

  public static final String SERIALIZED_NAME_GATEWAY_GTE = "gateway_gte";
  @SerializedName(SERIALIZED_NAME_GATEWAY_GTE)
  private String gatewayGte;

  public static final String SERIALIZED_NAME_GATEWAY_IN = "gateway_in";
  @SerializedName(SERIALIZED_NAME_GATEWAY_IN)
  private List<String> gatewayIn = null;

  public static final String SERIALIZED_NAME_GATEWAY_LT = "gateway_lt";
  @SerializedName(SERIALIZED_NAME_GATEWAY_LT)
  private String gatewayLt;

  public static final String SERIALIZED_NAME_GATEWAY_LTE = "gateway_lte";
  @SerializedName(SERIALIZED_NAME_GATEWAY_LTE)
  private String gatewayLte;

  public static final String SERIALIZED_NAME_GATEWAY_NOT = "gateway_not";
  @SerializedName(SERIALIZED_NAME_GATEWAY_NOT)
  private String gatewayNot;

  public static final String SERIALIZED_NAME_GATEWAY_NOT_CONTAINS = "gateway_not_contains";
  @SerializedName(SERIALIZED_NAME_GATEWAY_NOT_CONTAINS)
  private String gatewayNotContains;

  public static final String SERIALIZED_NAME_GATEWAY_NOT_ENDS_WITH = "gateway_not_ends_with";
  @SerializedName(SERIALIZED_NAME_GATEWAY_NOT_ENDS_WITH)
  private String gatewayNotEndsWith;

  public static final String SERIALIZED_NAME_GATEWAY_NOT_IN = "gateway_not_in";
  @SerializedName(SERIALIZED_NAME_GATEWAY_NOT_IN)
  private List<String> gatewayNotIn = null;

  public static final String SERIALIZED_NAME_GATEWAY_NOT_STARTS_WITH = "gateway_not_starts_with";
  @SerializedName(SERIALIZED_NAME_GATEWAY_NOT_STARTS_WITH)
  private String gatewayNotStartsWith;

  public static final String SERIALIZED_NAME_GATEWAY_STARTS_WITH = "gateway_starts_with";
  @SerializedName(SERIALIZED_NAME_GATEWAY_STARTS_WITH)
  private String gatewayStartsWith;

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

  public static final String SERIALIZED_NAME_MEMORY_SIZE = "memory_size";
  @SerializedName(SERIALIZED_NAME_MEMORY_SIZE)
  private Integer memorySize;

  public static final String SERIALIZED_NAME_MEMORY_SIZE_GT = "memory_size_gt";
  @SerializedName(SERIALIZED_NAME_MEMORY_SIZE_GT)
  private Integer memorySizeGt;

  public static final String SERIALIZED_NAME_MEMORY_SIZE_GTE = "memory_size_gte";
  @SerializedName(SERIALIZED_NAME_MEMORY_SIZE_GTE)
  private Integer memorySizeGte;

  public static final String SERIALIZED_NAME_MEMORY_SIZE_IN = "memory_size_in";
  @SerializedName(SERIALIZED_NAME_MEMORY_SIZE_IN)
  private List<Integer> memorySizeIn = null;

  public static final String SERIALIZED_NAME_MEMORY_SIZE_LT = "memory_size_lt";
  @SerializedName(SERIALIZED_NAME_MEMORY_SIZE_LT)
  private Integer memorySizeLt;

  public static final String SERIALIZED_NAME_MEMORY_SIZE_LTE = "memory_size_lte";
  @SerializedName(SERIALIZED_NAME_MEMORY_SIZE_LTE)
  private Integer memorySizeLte;

  public static final String SERIALIZED_NAME_MEMORY_SIZE_NOT = "memory_size_not";
  @SerializedName(SERIALIZED_NAME_MEMORY_SIZE_NOT)
  private Integer memorySizeNot;

  public static final String SERIALIZED_NAME_MEMORY_SIZE_NOT_IN = "memory_size_not_in";
  @SerializedName(SERIALIZED_NAME_MEMORY_SIZE_NOT_IN)
  private List<Integer> memorySizeNotIn = null;

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

  public static final String SERIALIZED_NAME_SUBNET_MASK = "subnet_mask";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK)
  private String subnetMask;

  public static final String SERIALIZED_NAME_SUBNET_MASK_CONTAINS = "subnet_mask_contains";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_CONTAINS)
  private String subnetMaskContains;

  public static final String SERIALIZED_NAME_SUBNET_MASK_ENDS_WITH = "subnet_mask_ends_with";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_ENDS_WITH)
  private String subnetMaskEndsWith;

  public static final String SERIALIZED_NAME_SUBNET_MASK_GT = "subnet_mask_gt";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_GT)
  private String subnetMaskGt;

  public static final String SERIALIZED_NAME_SUBNET_MASK_GTE = "subnet_mask_gte";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_GTE)
  private String subnetMaskGte;

  public static final String SERIALIZED_NAME_SUBNET_MASK_IN = "subnet_mask_in";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_IN)
  private List<String> subnetMaskIn = null;

  public static final String SERIALIZED_NAME_SUBNET_MASK_LT = "subnet_mask_lt";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_LT)
  private String subnetMaskLt;

  public static final String SERIALIZED_NAME_SUBNET_MASK_LTE = "subnet_mask_lte";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_LTE)
  private String subnetMaskLte;

  public static final String SERIALIZED_NAME_SUBNET_MASK_NOT = "subnet_mask_not";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_NOT)
  private String subnetMaskNot;

  public static final String SERIALIZED_NAME_SUBNET_MASK_NOT_CONTAINS = "subnet_mask_not_contains";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_NOT_CONTAINS)
  private String subnetMaskNotContains;

  public static final String SERIALIZED_NAME_SUBNET_MASK_NOT_ENDS_WITH = "subnet_mask_not_ends_with";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_NOT_ENDS_WITH)
  private String subnetMaskNotEndsWith;

  public static final String SERIALIZED_NAME_SUBNET_MASK_NOT_IN = "subnet_mask_not_in";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_NOT_IN)
  private List<String> subnetMaskNotIn = null;

  public static final String SERIALIZED_NAME_SUBNET_MASK_NOT_STARTS_WITH = "subnet_mask_not_starts_with";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_NOT_STARTS_WITH)
  private String subnetMaskNotStartsWith;

  public static final String SERIALIZED_NAME_SUBNET_MASK_STARTS_WITH = "subnet_mask_starts_with";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_STARTS_WITH)
  private String subnetMaskStartsWith;

  public static final String SERIALIZED_NAME_VDSES_EVERY = "vdses_every";
  @SerializedName(SERIALIZED_NAME_VDSES_EVERY)
  private VdsWhereInput vdsesEvery;

  public static final String SERIALIZED_NAME_VDSES_NONE = "vdses_none";
  @SerializedName(SERIALIZED_NAME_VDSES_NONE)
  private VdsWhereInput vdsesNone;

  public static final String SERIALIZED_NAME_VDSES_SOME = "vdses_some";
  @SerializedName(SERIALIZED_NAME_VDSES_SOME)
  private VdsWhereInput vdsesSome;

  public static final String SERIALIZED_NAME_VM_INSTANCES_EVERY = "vm_instances_every";
  @SerializedName(SERIALIZED_NAME_VM_INSTANCES_EVERY)
  private VmWhereInput vmInstancesEvery;

  public static final String SERIALIZED_NAME_VM_INSTANCES_NONE = "vm_instances_none";
  @SerializedName(SERIALIZED_NAME_VM_INSTANCES_NONE)
  private VmWhereInput vmInstancesNone;

  public static final String SERIALIZED_NAME_VM_INSTANCES_SOME = "vm_instances_some";
  @SerializedName(SERIALIZED_NAME_VM_INSTANCES_SOME)
  private VmWhereInput vmInstancesSome;

  public static final String SERIALIZED_NAME_VPC_SERVICE = "vpc_service";
  @SerializedName(SERIALIZED_NAME_VPC_SERVICE)
  private VirtualPrivateCloudServiceWhereInput vpcService;

  public VirtualPrivateCloudEdgeGatewayWhereInput() { 
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput AND(List<VirtualPrivateCloudEdgeGatewayWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addANDItem(VirtualPrivateCloudEdgeGatewayWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<VirtualPrivateCloudEdgeGatewayWhereInput>();
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

  public List<VirtualPrivateCloudEdgeGatewayWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<VirtualPrivateCloudEdgeGatewayWhereInput> AND) {
    this.AND = AND;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput NOT(List<VirtualPrivateCloudEdgeGatewayWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addNOTItem(VirtualPrivateCloudEdgeGatewayWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<VirtualPrivateCloudEdgeGatewayWhereInput>();
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

  public List<VirtualPrivateCloudEdgeGatewayWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<VirtualPrivateCloudEdgeGatewayWhereInput> NOT) {
    this.NOT = NOT;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput OR(List<VirtualPrivateCloudEdgeGatewayWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addORItem(VirtualPrivateCloudEdgeGatewayWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<VirtualPrivateCloudEdgeGatewayWhereInput>();
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

  public List<VirtualPrivateCloudEdgeGatewayWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<VirtualPrivateCloudEdgeGatewayWhereInput> OR) {
    this.OR = OR;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput cluster(ClusterWhereInput cluster) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput cpuNumber(Integer cpuNumber) {
    
    this.cpuNumber = cpuNumber;
    return this;
  }

   /**
   * Get cpuNumber
   * @return cpuNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCpuNumber() {
    return cpuNumber;
  }


  public void setCpuNumber(Integer cpuNumber) {
    this.cpuNumber = cpuNumber;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput cpuNumberGt(Integer cpuNumberGt) {
    
    this.cpuNumberGt = cpuNumberGt;
    return this;
  }

   /**
   * Get cpuNumberGt
   * @return cpuNumberGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCpuNumberGt() {
    return cpuNumberGt;
  }


  public void setCpuNumberGt(Integer cpuNumberGt) {
    this.cpuNumberGt = cpuNumberGt;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput cpuNumberGte(Integer cpuNumberGte) {
    
    this.cpuNumberGte = cpuNumberGte;
    return this;
  }

   /**
   * Get cpuNumberGte
   * @return cpuNumberGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCpuNumberGte() {
    return cpuNumberGte;
  }


  public void setCpuNumberGte(Integer cpuNumberGte) {
    this.cpuNumberGte = cpuNumberGte;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput cpuNumberIn(List<Integer> cpuNumberIn) {
    
    this.cpuNumberIn = cpuNumberIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addCpuNumberInItem(Integer cpuNumberInItem) {
    if (this.cpuNumberIn == null) {
      this.cpuNumberIn = new ArrayList<Integer>();
    }
    this.cpuNumberIn.add(cpuNumberInItem);
    return this;
  }

   /**
   * Get cpuNumberIn
   * @return cpuNumberIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getCpuNumberIn() {
    return cpuNumberIn;
  }


  public void setCpuNumberIn(List<Integer> cpuNumberIn) {
    this.cpuNumberIn = cpuNumberIn;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput cpuNumberLt(Integer cpuNumberLt) {
    
    this.cpuNumberLt = cpuNumberLt;
    return this;
  }

   /**
   * Get cpuNumberLt
   * @return cpuNumberLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCpuNumberLt() {
    return cpuNumberLt;
  }


  public void setCpuNumberLt(Integer cpuNumberLt) {
    this.cpuNumberLt = cpuNumberLt;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput cpuNumberLte(Integer cpuNumberLte) {
    
    this.cpuNumberLte = cpuNumberLte;
    return this;
  }

   /**
   * Get cpuNumberLte
   * @return cpuNumberLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCpuNumberLte() {
    return cpuNumberLte;
  }


  public void setCpuNumberLte(Integer cpuNumberLte) {
    this.cpuNumberLte = cpuNumberLte;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput cpuNumberNot(Integer cpuNumberNot) {
    
    this.cpuNumberNot = cpuNumberNot;
    return this;
  }

   /**
   * Get cpuNumberNot
   * @return cpuNumberNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCpuNumberNot() {
    return cpuNumberNot;
  }


  public void setCpuNumberNot(Integer cpuNumberNot) {
    this.cpuNumberNot = cpuNumberNot;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput cpuNumberNotIn(List<Integer> cpuNumberNotIn) {
    
    this.cpuNumberNotIn = cpuNumberNotIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addCpuNumberNotInItem(Integer cpuNumberNotInItem) {
    if (this.cpuNumberNotIn == null) {
      this.cpuNumberNotIn = new ArrayList<Integer>();
    }
    this.cpuNumberNotIn.add(cpuNumberNotInItem);
    return this;
  }

   /**
   * Get cpuNumberNotIn
   * @return cpuNumberNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getCpuNumberNotIn() {
    return cpuNumberNotIn;
  }


  public void setCpuNumberNotIn(List<Integer> cpuNumberNotIn) {
    this.cpuNumberNotIn = cpuNumberNotIn;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput dataVolumeSize(Integer dataVolumeSize) {
    
    this.dataVolumeSize = dataVolumeSize;
    return this;
  }

   /**
   * Get dataVolumeSize
   * @return dataVolumeSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDataVolumeSize() {
    return dataVolumeSize;
  }


  public void setDataVolumeSize(Integer dataVolumeSize) {
    this.dataVolumeSize = dataVolumeSize;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput dataVolumeSizeGt(Integer dataVolumeSizeGt) {
    
    this.dataVolumeSizeGt = dataVolumeSizeGt;
    return this;
  }

   /**
   * Get dataVolumeSizeGt
   * @return dataVolumeSizeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDataVolumeSizeGt() {
    return dataVolumeSizeGt;
  }


  public void setDataVolumeSizeGt(Integer dataVolumeSizeGt) {
    this.dataVolumeSizeGt = dataVolumeSizeGt;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput dataVolumeSizeGte(Integer dataVolumeSizeGte) {
    
    this.dataVolumeSizeGte = dataVolumeSizeGte;
    return this;
  }

   /**
   * Get dataVolumeSizeGte
   * @return dataVolumeSizeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDataVolumeSizeGte() {
    return dataVolumeSizeGte;
  }


  public void setDataVolumeSizeGte(Integer dataVolumeSizeGte) {
    this.dataVolumeSizeGte = dataVolumeSizeGte;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput dataVolumeSizeIn(List<Integer> dataVolumeSizeIn) {
    
    this.dataVolumeSizeIn = dataVolumeSizeIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addDataVolumeSizeInItem(Integer dataVolumeSizeInItem) {
    if (this.dataVolumeSizeIn == null) {
      this.dataVolumeSizeIn = new ArrayList<Integer>();
    }
    this.dataVolumeSizeIn.add(dataVolumeSizeInItem);
    return this;
  }

   /**
   * Get dataVolumeSizeIn
   * @return dataVolumeSizeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getDataVolumeSizeIn() {
    return dataVolumeSizeIn;
  }


  public void setDataVolumeSizeIn(List<Integer> dataVolumeSizeIn) {
    this.dataVolumeSizeIn = dataVolumeSizeIn;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput dataVolumeSizeLt(Integer dataVolumeSizeLt) {
    
    this.dataVolumeSizeLt = dataVolumeSizeLt;
    return this;
  }

   /**
   * Get dataVolumeSizeLt
   * @return dataVolumeSizeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDataVolumeSizeLt() {
    return dataVolumeSizeLt;
  }


  public void setDataVolumeSizeLt(Integer dataVolumeSizeLt) {
    this.dataVolumeSizeLt = dataVolumeSizeLt;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput dataVolumeSizeLte(Integer dataVolumeSizeLte) {
    
    this.dataVolumeSizeLte = dataVolumeSizeLte;
    return this;
  }

   /**
   * Get dataVolumeSizeLte
   * @return dataVolumeSizeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDataVolumeSizeLte() {
    return dataVolumeSizeLte;
  }


  public void setDataVolumeSizeLte(Integer dataVolumeSizeLte) {
    this.dataVolumeSizeLte = dataVolumeSizeLte;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput dataVolumeSizeNot(Integer dataVolumeSizeNot) {
    
    this.dataVolumeSizeNot = dataVolumeSizeNot;
    return this;
  }

   /**
   * Get dataVolumeSizeNot
   * @return dataVolumeSizeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDataVolumeSizeNot() {
    return dataVolumeSizeNot;
  }


  public void setDataVolumeSizeNot(Integer dataVolumeSizeNot) {
    this.dataVolumeSizeNot = dataVolumeSizeNot;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput dataVolumeSizeNotIn(List<Integer> dataVolumeSizeNotIn) {
    
    this.dataVolumeSizeNotIn = dataVolumeSizeNotIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addDataVolumeSizeNotInItem(Integer dataVolumeSizeNotInItem) {
    if (this.dataVolumeSizeNotIn == null) {
      this.dataVolumeSizeNotIn = new ArrayList<Integer>();
    }
    this.dataVolumeSizeNotIn.add(dataVolumeSizeNotInItem);
    return this;
  }

   /**
   * Get dataVolumeSizeNotIn
   * @return dataVolumeSizeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getDataVolumeSizeNotIn() {
    return dataVolumeSizeNotIn;
  }


  public void setDataVolumeSizeNotIn(List<Integer> dataVolumeSizeNotIn) {
    this.dataVolumeSizeNotIn = dataVolumeSizeNotIn;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput description(String description) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput descriptionContains(String descriptionContains) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput descriptionEndsWith(String descriptionEndsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput descriptionGt(String descriptionGt) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput descriptionGte(String descriptionGte) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput descriptionIn(List<String> descriptionIn) {
    
    this.descriptionIn = descriptionIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addDescriptionInItem(String descriptionInItem) {
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


  public VirtualPrivateCloudEdgeGatewayWhereInput descriptionLt(String descriptionLt) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput descriptionLte(String descriptionLte) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput descriptionNot(String descriptionNot) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput descriptionNotContains(String descriptionNotContains) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput descriptionNotIn(List<String> descriptionNotIn) {
    
    this.descriptionNotIn = descriptionNotIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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


  public VirtualPrivateCloudEdgeGatewayWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput descriptionStartsWith(String descriptionStartsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public VirtualPrivateCloudEdgeGatewayWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public VirtualPrivateCloudEdgeGatewayWhereInput gateway(String gateway) {
    
    this.gateway = gateway;
    return this;
  }

   /**
   * Get gateway
   * @return gateway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGateway() {
    return gateway;
  }


  public void setGateway(String gateway) {
    this.gateway = gateway;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput gatewayContains(String gatewayContains) {
    
    this.gatewayContains = gatewayContains;
    return this;
  }

   /**
   * Get gatewayContains
   * @return gatewayContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayContains() {
    return gatewayContains;
  }


  public void setGatewayContains(String gatewayContains) {
    this.gatewayContains = gatewayContains;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput gatewayEndsWith(String gatewayEndsWith) {
    
    this.gatewayEndsWith = gatewayEndsWith;
    return this;
  }

   /**
   * Get gatewayEndsWith
   * @return gatewayEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayEndsWith() {
    return gatewayEndsWith;
  }


  public void setGatewayEndsWith(String gatewayEndsWith) {
    this.gatewayEndsWith = gatewayEndsWith;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput gatewayGt(String gatewayGt) {
    
    this.gatewayGt = gatewayGt;
    return this;
  }

   /**
   * Get gatewayGt
   * @return gatewayGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayGt() {
    return gatewayGt;
  }


  public void setGatewayGt(String gatewayGt) {
    this.gatewayGt = gatewayGt;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput gatewayGte(String gatewayGte) {
    
    this.gatewayGte = gatewayGte;
    return this;
  }

   /**
   * Get gatewayGte
   * @return gatewayGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayGte() {
    return gatewayGte;
  }


  public void setGatewayGte(String gatewayGte) {
    this.gatewayGte = gatewayGte;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput gatewayIn(List<String> gatewayIn) {
    
    this.gatewayIn = gatewayIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addGatewayInItem(String gatewayInItem) {
    if (this.gatewayIn == null) {
      this.gatewayIn = new ArrayList<String>();
    }
    this.gatewayIn.add(gatewayInItem);
    return this;
  }

   /**
   * Get gatewayIn
   * @return gatewayIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getGatewayIn() {
    return gatewayIn;
  }


  public void setGatewayIn(List<String> gatewayIn) {
    this.gatewayIn = gatewayIn;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput gatewayLt(String gatewayLt) {
    
    this.gatewayLt = gatewayLt;
    return this;
  }

   /**
   * Get gatewayLt
   * @return gatewayLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayLt() {
    return gatewayLt;
  }


  public void setGatewayLt(String gatewayLt) {
    this.gatewayLt = gatewayLt;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput gatewayLte(String gatewayLte) {
    
    this.gatewayLte = gatewayLte;
    return this;
  }

   /**
   * Get gatewayLte
   * @return gatewayLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayLte() {
    return gatewayLte;
  }


  public void setGatewayLte(String gatewayLte) {
    this.gatewayLte = gatewayLte;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput gatewayNot(String gatewayNot) {
    
    this.gatewayNot = gatewayNot;
    return this;
  }

   /**
   * Get gatewayNot
   * @return gatewayNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayNot() {
    return gatewayNot;
  }


  public void setGatewayNot(String gatewayNot) {
    this.gatewayNot = gatewayNot;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput gatewayNotContains(String gatewayNotContains) {
    
    this.gatewayNotContains = gatewayNotContains;
    return this;
  }

   /**
   * Get gatewayNotContains
   * @return gatewayNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayNotContains() {
    return gatewayNotContains;
  }


  public void setGatewayNotContains(String gatewayNotContains) {
    this.gatewayNotContains = gatewayNotContains;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput gatewayNotEndsWith(String gatewayNotEndsWith) {
    
    this.gatewayNotEndsWith = gatewayNotEndsWith;
    return this;
  }

   /**
   * Get gatewayNotEndsWith
   * @return gatewayNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayNotEndsWith() {
    return gatewayNotEndsWith;
  }


  public void setGatewayNotEndsWith(String gatewayNotEndsWith) {
    this.gatewayNotEndsWith = gatewayNotEndsWith;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput gatewayNotIn(List<String> gatewayNotIn) {
    
    this.gatewayNotIn = gatewayNotIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addGatewayNotInItem(String gatewayNotInItem) {
    if (this.gatewayNotIn == null) {
      this.gatewayNotIn = new ArrayList<String>();
    }
    this.gatewayNotIn.add(gatewayNotInItem);
    return this;
  }

   /**
   * Get gatewayNotIn
   * @return gatewayNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getGatewayNotIn() {
    return gatewayNotIn;
  }


  public void setGatewayNotIn(List<String> gatewayNotIn) {
    this.gatewayNotIn = gatewayNotIn;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput gatewayNotStartsWith(String gatewayNotStartsWith) {
    
    this.gatewayNotStartsWith = gatewayNotStartsWith;
    return this;
  }

   /**
   * Get gatewayNotStartsWith
   * @return gatewayNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayNotStartsWith() {
    return gatewayNotStartsWith;
  }


  public void setGatewayNotStartsWith(String gatewayNotStartsWith) {
    this.gatewayNotStartsWith = gatewayNotStartsWith;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput gatewayStartsWith(String gatewayStartsWith) {
    
    this.gatewayStartsWith = gatewayStartsWith;
    return this;
  }

   /**
   * Get gatewayStartsWith
   * @return gatewayStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayStartsWith() {
    return gatewayStartsWith;
  }


  public void setGatewayStartsWith(String gatewayStartsWith) {
    this.gatewayStartsWith = gatewayStartsWith;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput id(String id) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput idContains(String idContains) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput idEndsWith(String idEndsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput idGt(String idGt) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput idGte(String idGte) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addIdInItem(String idInItem) {
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


  public VirtualPrivateCloudEdgeGatewayWhereInput idLt(String idLt) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput idLte(String idLte) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput idNot(String idNot) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput idNotContains(String idNotContains) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addIdNotInItem(String idNotInItem) {
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


  public VirtualPrivateCloudEdgeGatewayWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput idStartsWith(String idStartsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput memorySize(Integer memorySize) {
    
    this.memorySize = memorySize;
    return this;
  }

   /**
   * Get memorySize
   * @return memorySize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMemorySize() {
    return memorySize;
  }


  public void setMemorySize(Integer memorySize) {
    this.memorySize = memorySize;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput memorySizeGt(Integer memorySizeGt) {
    
    this.memorySizeGt = memorySizeGt;
    return this;
  }

   /**
   * Get memorySizeGt
   * @return memorySizeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMemorySizeGt() {
    return memorySizeGt;
  }


  public void setMemorySizeGt(Integer memorySizeGt) {
    this.memorySizeGt = memorySizeGt;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput memorySizeGte(Integer memorySizeGte) {
    
    this.memorySizeGte = memorySizeGte;
    return this;
  }

   /**
   * Get memorySizeGte
   * @return memorySizeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMemorySizeGte() {
    return memorySizeGte;
  }


  public void setMemorySizeGte(Integer memorySizeGte) {
    this.memorySizeGte = memorySizeGte;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput memorySizeIn(List<Integer> memorySizeIn) {
    
    this.memorySizeIn = memorySizeIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addMemorySizeInItem(Integer memorySizeInItem) {
    if (this.memorySizeIn == null) {
      this.memorySizeIn = new ArrayList<Integer>();
    }
    this.memorySizeIn.add(memorySizeInItem);
    return this;
  }

   /**
   * Get memorySizeIn
   * @return memorySizeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getMemorySizeIn() {
    return memorySizeIn;
  }


  public void setMemorySizeIn(List<Integer> memorySizeIn) {
    this.memorySizeIn = memorySizeIn;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput memorySizeLt(Integer memorySizeLt) {
    
    this.memorySizeLt = memorySizeLt;
    return this;
  }

   /**
   * Get memorySizeLt
   * @return memorySizeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMemorySizeLt() {
    return memorySizeLt;
  }


  public void setMemorySizeLt(Integer memorySizeLt) {
    this.memorySizeLt = memorySizeLt;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput memorySizeLte(Integer memorySizeLte) {
    
    this.memorySizeLte = memorySizeLte;
    return this;
  }

   /**
   * Get memorySizeLte
   * @return memorySizeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMemorySizeLte() {
    return memorySizeLte;
  }


  public void setMemorySizeLte(Integer memorySizeLte) {
    this.memorySizeLte = memorySizeLte;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput memorySizeNot(Integer memorySizeNot) {
    
    this.memorySizeNot = memorySizeNot;
    return this;
  }

   /**
   * Get memorySizeNot
   * @return memorySizeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMemorySizeNot() {
    return memorySizeNot;
  }


  public void setMemorySizeNot(Integer memorySizeNot) {
    this.memorySizeNot = memorySizeNot;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput memorySizeNotIn(List<Integer> memorySizeNotIn) {
    
    this.memorySizeNotIn = memorySizeNotIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addMemorySizeNotInItem(Integer memorySizeNotInItem) {
    if (this.memorySizeNotIn == null) {
      this.memorySizeNotIn = new ArrayList<Integer>();
    }
    this.memorySizeNotIn.add(memorySizeNotInItem);
    return this;
  }

   /**
   * Get memorySizeNotIn
   * @return memorySizeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getMemorySizeNotIn() {
    return memorySizeNotIn;
  }


  public void setMemorySizeNotIn(List<Integer> memorySizeNotIn) {
    this.memorySizeNotIn = memorySizeNotIn;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput name(String name) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput nameContains(String nameContains) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput nameGt(String nameGt) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput nameGte(String nameGte) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addNameInItem(String nameInItem) {
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


  public VirtualPrivateCloudEdgeGatewayWhereInput nameLt(String nameLt) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput nameLte(String nameLte) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput nameNot(String nameNot) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput nameNotContains(String nameNotContains) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addNameNotInItem(String nameNotInItem) {
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


  public VirtualPrivateCloudEdgeGatewayWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput phase(EverouteClusterPhase phase) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput phaseIn(List<EverouteClusterPhase> phaseIn) {
    
    this.phaseIn = phaseIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addPhaseInItem(EverouteClusterPhase phaseInItem) {
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


  public VirtualPrivateCloudEdgeGatewayWhereInput phaseNot(EverouteClusterPhase phaseNot) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput phaseNotIn(List<EverouteClusterPhase> phaseNotIn) {
    
    this.phaseNotIn = phaseNotIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addPhaseNotInItem(EverouteClusterPhase phaseNotInItem) {
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


  public VirtualPrivateCloudEdgeGatewayWhereInput subnetMask(String subnetMask) {
    
    this.subnetMask = subnetMask;
    return this;
  }

   /**
   * Get subnetMask
   * @return subnetMask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMask() {
    return subnetMask;
  }


  public void setSubnetMask(String subnetMask) {
    this.subnetMask = subnetMask;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput subnetMaskContains(String subnetMaskContains) {
    
    this.subnetMaskContains = subnetMaskContains;
    return this;
  }

   /**
   * Get subnetMaskContains
   * @return subnetMaskContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskContains() {
    return subnetMaskContains;
  }


  public void setSubnetMaskContains(String subnetMaskContains) {
    this.subnetMaskContains = subnetMaskContains;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput subnetMaskEndsWith(String subnetMaskEndsWith) {
    
    this.subnetMaskEndsWith = subnetMaskEndsWith;
    return this;
  }

   /**
   * Get subnetMaskEndsWith
   * @return subnetMaskEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskEndsWith() {
    return subnetMaskEndsWith;
  }


  public void setSubnetMaskEndsWith(String subnetMaskEndsWith) {
    this.subnetMaskEndsWith = subnetMaskEndsWith;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput subnetMaskGt(String subnetMaskGt) {
    
    this.subnetMaskGt = subnetMaskGt;
    return this;
  }

   /**
   * Get subnetMaskGt
   * @return subnetMaskGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskGt() {
    return subnetMaskGt;
  }


  public void setSubnetMaskGt(String subnetMaskGt) {
    this.subnetMaskGt = subnetMaskGt;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput subnetMaskGte(String subnetMaskGte) {
    
    this.subnetMaskGte = subnetMaskGte;
    return this;
  }

   /**
   * Get subnetMaskGte
   * @return subnetMaskGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskGte() {
    return subnetMaskGte;
  }


  public void setSubnetMaskGte(String subnetMaskGte) {
    this.subnetMaskGte = subnetMaskGte;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput subnetMaskIn(List<String> subnetMaskIn) {
    
    this.subnetMaskIn = subnetMaskIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addSubnetMaskInItem(String subnetMaskInItem) {
    if (this.subnetMaskIn == null) {
      this.subnetMaskIn = new ArrayList<String>();
    }
    this.subnetMaskIn.add(subnetMaskInItem);
    return this;
  }

   /**
   * Get subnetMaskIn
   * @return subnetMaskIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSubnetMaskIn() {
    return subnetMaskIn;
  }


  public void setSubnetMaskIn(List<String> subnetMaskIn) {
    this.subnetMaskIn = subnetMaskIn;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput subnetMaskLt(String subnetMaskLt) {
    
    this.subnetMaskLt = subnetMaskLt;
    return this;
  }

   /**
   * Get subnetMaskLt
   * @return subnetMaskLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskLt() {
    return subnetMaskLt;
  }


  public void setSubnetMaskLt(String subnetMaskLt) {
    this.subnetMaskLt = subnetMaskLt;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput subnetMaskLte(String subnetMaskLte) {
    
    this.subnetMaskLte = subnetMaskLte;
    return this;
  }

   /**
   * Get subnetMaskLte
   * @return subnetMaskLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskLte() {
    return subnetMaskLte;
  }


  public void setSubnetMaskLte(String subnetMaskLte) {
    this.subnetMaskLte = subnetMaskLte;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput subnetMaskNot(String subnetMaskNot) {
    
    this.subnetMaskNot = subnetMaskNot;
    return this;
  }

   /**
   * Get subnetMaskNot
   * @return subnetMaskNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskNot() {
    return subnetMaskNot;
  }


  public void setSubnetMaskNot(String subnetMaskNot) {
    this.subnetMaskNot = subnetMaskNot;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput subnetMaskNotContains(String subnetMaskNotContains) {
    
    this.subnetMaskNotContains = subnetMaskNotContains;
    return this;
  }

   /**
   * Get subnetMaskNotContains
   * @return subnetMaskNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskNotContains() {
    return subnetMaskNotContains;
  }


  public void setSubnetMaskNotContains(String subnetMaskNotContains) {
    this.subnetMaskNotContains = subnetMaskNotContains;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput subnetMaskNotEndsWith(String subnetMaskNotEndsWith) {
    
    this.subnetMaskNotEndsWith = subnetMaskNotEndsWith;
    return this;
  }

   /**
   * Get subnetMaskNotEndsWith
   * @return subnetMaskNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskNotEndsWith() {
    return subnetMaskNotEndsWith;
  }


  public void setSubnetMaskNotEndsWith(String subnetMaskNotEndsWith) {
    this.subnetMaskNotEndsWith = subnetMaskNotEndsWith;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput subnetMaskNotIn(List<String> subnetMaskNotIn) {
    
    this.subnetMaskNotIn = subnetMaskNotIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayWhereInput addSubnetMaskNotInItem(String subnetMaskNotInItem) {
    if (this.subnetMaskNotIn == null) {
      this.subnetMaskNotIn = new ArrayList<String>();
    }
    this.subnetMaskNotIn.add(subnetMaskNotInItem);
    return this;
  }

   /**
   * Get subnetMaskNotIn
   * @return subnetMaskNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSubnetMaskNotIn() {
    return subnetMaskNotIn;
  }


  public void setSubnetMaskNotIn(List<String> subnetMaskNotIn) {
    this.subnetMaskNotIn = subnetMaskNotIn;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput subnetMaskNotStartsWith(String subnetMaskNotStartsWith) {
    
    this.subnetMaskNotStartsWith = subnetMaskNotStartsWith;
    return this;
  }

   /**
   * Get subnetMaskNotStartsWith
   * @return subnetMaskNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskNotStartsWith() {
    return subnetMaskNotStartsWith;
  }


  public void setSubnetMaskNotStartsWith(String subnetMaskNotStartsWith) {
    this.subnetMaskNotStartsWith = subnetMaskNotStartsWith;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput subnetMaskStartsWith(String subnetMaskStartsWith) {
    
    this.subnetMaskStartsWith = subnetMaskStartsWith;
    return this;
  }

   /**
   * Get subnetMaskStartsWith
   * @return subnetMaskStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskStartsWith() {
    return subnetMaskStartsWith;
  }


  public void setSubnetMaskStartsWith(String subnetMaskStartsWith) {
    this.subnetMaskStartsWith = subnetMaskStartsWith;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput vdsesEvery(VdsWhereInput vdsesEvery) {
    
    this.vdsesEvery = vdsesEvery;
    return this;
  }

   /**
   * Get vdsesEvery
   * @return vdsesEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VdsWhereInput getVdsesEvery() {
    return vdsesEvery;
  }


  public void setVdsesEvery(VdsWhereInput vdsesEvery) {
    this.vdsesEvery = vdsesEvery;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput vdsesNone(VdsWhereInput vdsesNone) {
    
    this.vdsesNone = vdsesNone;
    return this;
  }

   /**
   * Get vdsesNone
   * @return vdsesNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VdsWhereInput getVdsesNone() {
    return vdsesNone;
  }


  public void setVdsesNone(VdsWhereInput vdsesNone) {
    this.vdsesNone = vdsesNone;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput vdsesSome(VdsWhereInput vdsesSome) {
    
    this.vdsesSome = vdsesSome;
    return this;
  }

   /**
   * Get vdsesSome
   * @return vdsesSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VdsWhereInput getVdsesSome() {
    return vdsesSome;
  }


  public void setVdsesSome(VdsWhereInput vdsesSome) {
    this.vdsesSome = vdsesSome;
  }


  public VirtualPrivateCloudEdgeGatewayWhereInput vmInstancesEvery(VmWhereInput vmInstancesEvery) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput vmInstancesNone(VmWhereInput vmInstancesNone) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput vmInstancesSome(VmWhereInput vmInstancesSome) {
    
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


  public VirtualPrivateCloudEdgeGatewayWhereInput vpcService(VirtualPrivateCloudServiceWhereInput vpcService) {
    
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
    VirtualPrivateCloudEdgeGatewayWhereInput virtualPrivateCloudEdgeGatewayWhereInput = (VirtualPrivateCloudEdgeGatewayWhereInput) o;
    return Objects.equals(this.AND, virtualPrivateCloudEdgeGatewayWhereInput.AND) &&
        Objects.equals(this.NOT, virtualPrivateCloudEdgeGatewayWhereInput.NOT) &&
        Objects.equals(this.OR, virtualPrivateCloudEdgeGatewayWhereInput.OR) &&
        Objects.equals(this.cluster, virtualPrivateCloudEdgeGatewayWhereInput.cluster) &&
        Objects.equals(this.cpuNumber, virtualPrivateCloudEdgeGatewayWhereInput.cpuNumber) &&
        Objects.equals(this.cpuNumberGt, virtualPrivateCloudEdgeGatewayWhereInput.cpuNumberGt) &&
        Objects.equals(this.cpuNumberGte, virtualPrivateCloudEdgeGatewayWhereInput.cpuNumberGte) &&
        Objects.equals(this.cpuNumberIn, virtualPrivateCloudEdgeGatewayWhereInput.cpuNumberIn) &&
        Objects.equals(this.cpuNumberLt, virtualPrivateCloudEdgeGatewayWhereInput.cpuNumberLt) &&
        Objects.equals(this.cpuNumberLte, virtualPrivateCloudEdgeGatewayWhereInput.cpuNumberLte) &&
        Objects.equals(this.cpuNumberNot, virtualPrivateCloudEdgeGatewayWhereInput.cpuNumberNot) &&
        Objects.equals(this.cpuNumberNotIn, virtualPrivateCloudEdgeGatewayWhereInput.cpuNumberNotIn) &&
        Objects.equals(this.dataVolumeSize, virtualPrivateCloudEdgeGatewayWhereInput.dataVolumeSize) &&
        Objects.equals(this.dataVolumeSizeGt, virtualPrivateCloudEdgeGatewayWhereInput.dataVolumeSizeGt) &&
        Objects.equals(this.dataVolumeSizeGte, virtualPrivateCloudEdgeGatewayWhereInput.dataVolumeSizeGte) &&
        Objects.equals(this.dataVolumeSizeIn, virtualPrivateCloudEdgeGatewayWhereInput.dataVolumeSizeIn) &&
        Objects.equals(this.dataVolumeSizeLt, virtualPrivateCloudEdgeGatewayWhereInput.dataVolumeSizeLt) &&
        Objects.equals(this.dataVolumeSizeLte, virtualPrivateCloudEdgeGatewayWhereInput.dataVolumeSizeLte) &&
        Objects.equals(this.dataVolumeSizeNot, virtualPrivateCloudEdgeGatewayWhereInput.dataVolumeSizeNot) &&
        Objects.equals(this.dataVolumeSizeNotIn, virtualPrivateCloudEdgeGatewayWhereInput.dataVolumeSizeNotIn) &&
        Objects.equals(this.description, virtualPrivateCloudEdgeGatewayWhereInput.description) &&
        Objects.equals(this.descriptionContains, virtualPrivateCloudEdgeGatewayWhereInput.descriptionContains) &&
        Objects.equals(this.descriptionEndsWith, virtualPrivateCloudEdgeGatewayWhereInput.descriptionEndsWith) &&
        Objects.equals(this.descriptionGt, virtualPrivateCloudEdgeGatewayWhereInput.descriptionGt) &&
        Objects.equals(this.descriptionGte, virtualPrivateCloudEdgeGatewayWhereInput.descriptionGte) &&
        Objects.equals(this.descriptionIn, virtualPrivateCloudEdgeGatewayWhereInput.descriptionIn) &&
        Objects.equals(this.descriptionLt, virtualPrivateCloudEdgeGatewayWhereInput.descriptionLt) &&
        Objects.equals(this.descriptionLte, virtualPrivateCloudEdgeGatewayWhereInput.descriptionLte) &&
        Objects.equals(this.descriptionNot, virtualPrivateCloudEdgeGatewayWhereInput.descriptionNot) &&
        Objects.equals(this.descriptionNotContains, virtualPrivateCloudEdgeGatewayWhereInput.descriptionNotContains) &&
        Objects.equals(this.descriptionNotEndsWith, virtualPrivateCloudEdgeGatewayWhereInput.descriptionNotEndsWith) &&
        Objects.equals(this.descriptionNotIn, virtualPrivateCloudEdgeGatewayWhereInput.descriptionNotIn) &&
        Objects.equals(this.descriptionNotStartsWith, virtualPrivateCloudEdgeGatewayWhereInput.descriptionNotStartsWith) &&
        Objects.equals(this.descriptionStartsWith, virtualPrivateCloudEdgeGatewayWhereInput.descriptionStartsWith) &&
        Objects.equals(this.entityAsyncStatus, virtualPrivateCloudEdgeGatewayWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, virtualPrivateCloudEdgeGatewayWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, virtualPrivateCloudEdgeGatewayWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, virtualPrivateCloudEdgeGatewayWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.gateway, virtualPrivateCloudEdgeGatewayWhereInput.gateway) &&
        Objects.equals(this.gatewayContains, virtualPrivateCloudEdgeGatewayWhereInput.gatewayContains) &&
        Objects.equals(this.gatewayEndsWith, virtualPrivateCloudEdgeGatewayWhereInput.gatewayEndsWith) &&
        Objects.equals(this.gatewayGt, virtualPrivateCloudEdgeGatewayWhereInput.gatewayGt) &&
        Objects.equals(this.gatewayGte, virtualPrivateCloudEdgeGatewayWhereInput.gatewayGte) &&
        Objects.equals(this.gatewayIn, virtualPrivateCloudEdgeGatewayWhereInput.gatewayIn) &&
        Objects.equals(this.gatewayLt, virtualPrivateCloudEdgeGatewayWhereInput.gatewayLt) &&
        Objects.equals(this.gatewayLte, virtualPrivateCloudEdgeGatewayWhereInput.gatewayLte) &&
        Objects.equals(this.gatewayNot, virtualPrivateCloudEdgeGatewayWhereInput.gatewayNot) &&
        Objects.equals(this.gatewayNotContains, virtualPrivateCloudEdgeGatewayWhereInput.gatewayNotContains) &&
        Objects.equals(this.gatewayNotEndsWith, virtualPrivateCloudEdgeGatewayWhereInput.gatewayNotEndsWith) &&
        Objects.equals(this.gatewayNotIn, virtualPrivateCloudEdgeGatewayWhereInput.gatewayNotIn) &&
        Objects.equals(this.gatewayNotStartsWith, virtualPrivateCloudEdgeGatewayWhereInput.gatewayNotStartsWith) &&
        Objects.equals(this.gatewayStartsWith, virtualPrivateCloudEdgeGatewayWhereInput.gatewayStartsWith) &&
        Objects.equals(this.id, virtualPrivateCloudEdgeGatewayWhereInput.id) &&
        Objects.equals(this.idContains, virtualPrivateCloudEdgeGatewayWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, virtualPrivateCloudEdgeGatewayWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, virtualPrivateCloudEdgeGatewayWhereInput.idGt) &&
        Objects.equals(this.idGte, virtualPrivateCloudEdgeGatewayWhereInput.idGte) &&
        Objects.equals(this.idIn, virtualPrivateCloudEdgeGatewayWhereInput.idIn) &&
        Objects.equals(this.idLt, virtualPrivateCloudEdgeGatewayWhereInput.idLt) &&
        Objects.equals(this.idLte, virtualPrivateCloudEdgeGatewayWhereInput.idLte) &&
        Objects.equals(this.idNot, virtualPrivateCloudEdgeGatewayWhereInput.idNot) &&
        Objects.equals(this.idNotContains, virtualPrivateCloudEdgeGatewayWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, virtualPrivateCloudEdgeGatewayWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, virtualPrivateCloudEdgeGatewayWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, virtualPrivateCloudEdgeGatewayWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, virtualPrivateCloudEdgeGatewayWhereInput.idStartsWith) &&
        Objects.equals(this.memorySize, virtualPrivateCloudEdgeGatewayWhereInput.memorySize) &&
        Objects.equals(this.memorySizeGt, virtualPrivateCloudEdgeGatewayWhereInput.memorySizeGt) &&
        Objects.equals(this.memorySizeGte, virtualPrivateCloudEdgeGatewayWhereInput.memorySizeGte) &&
        Objects.equals(this.memorySizeIn, virtualPrivateCloudEdgeGatewayWhereInput.memorySizeIn) &&
        Objects.equals(this.memorySizeLt, virtualPrivateCloudEdgeGatewayWhereInput.memorySizeLt) &&
        Objects.equals(this.memorySizeLte, virtualPrivateCloudEdgeGatewayWhereInput.memorySizeLte) &&
        Objects.equals(this.memorySizeNot, virtualPrivateCloudEdgeGatewayWhereInput.memorySizeNot) &&
        Objects.equals(this.memorySizeNotIn, virtualPrivateCloudEdgeGatewayWhereInput.memorySizeNotIn) &&
        Objects.equals(this.name, virtualPrivateCloudEdgeGatewayWhereInput.name) &&
        Objects.equals(this.nameContains, virtualPrivateCloudEdgeGatewayWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, virtualPrivateCloudEdgeGatewayWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, virtualPrivateCloudEdgeGatewayWhereInput.nameGt) &&
        Objects.equals(this.nameGte, virtualPrivateCloudEdgeGatewayWhereInput.nameGte) &&
        Objects.equals(this.nameIn, virtualPrivateCloudEdgeGatewayWhereInput.nameIn) &&
        Objects.equals(this.nameLt, virtualPrivateCloudEdgeGatewayWhereInput.nameLt) &&
        Objects.equals(this.nameLte, virtualPrivateCloudEdgeGatewayWhereInput.nameLte) &&
        Objects.equals(this.nameNot, virtualPrivateCloudEdgeGatewayWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, virtualPrivateCloudEdgeGatewayWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, virtualPrivateCloudEdgeGatewayWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, virtualPrivateCloudEdgeGatewayWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, virtualPrivateCloudEdgeGatewayWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, virtualPrivateCloudEdgeGatewayWhereInput.nameStartsWith) &&
        Objects.equals(this.phase, virtualPrivateCloudEdgeGatewayWhereInput.phase) &&
        Objects.equals(this.phaseIn, virtualPrivateCloudEdgeGatewayWhereInput.phaseIn) &&
        Objects.equals(this.phaseNot, virtualPrivateCloudEdgeGatewayWhereInput.phaseNot) &&
        Objects.equals(this.phaseNotIn, virtualPrivateCloudEdgeGatewayWhereInput.phaseNotIn) &&
        Objects.equals(this.subnetMask, virtualPrivateCloudEdgeGatewayWhereInput.subnetMask) &&
        Objects.equals(this.subnetMaskContains, virtualPrivateCloudEdgeGatewayWhereInput.subnetMaskContains) &&
        Objects.equals(this.subnetMaskEndsWith, virtualPrivateCloudEdgeGatewayWhereInput.subnetMaskEndsWith) &&
        Objects.equals(this.subnetMaskGt, virtualPrivateCloudEdgeGatewayWhereInput.subnetMaskGt) &&
        Objects.equals(this.subnetMaskGte, virtualPrivateCloudEdgeGatewayWhereInput.subnetMaskGte) &&
        Objects.equals(this.subnetMaskIn, virtualPrivateCloudEdgeGatewayWhereInput.subnetMaskIn) &&
        Objects.equals(this.subnetMaskLt, virtualPrivateCloudEdgeGatewayWhereInput.subnetMaskLt) &&
        Objects.equals(this.subnetMaskLte, virtualPrivateCloudEdgeGatewayWhereInput.subnetMaskLte) &&
        Objects.equals(this.subnetMaskNot, virtualPrivateCloudEdgeGatewayWhereInput.subnetMaskNot) &&
        Objects.equals(this.subnetMaskNotContains, virtualPrivateCloudEdgeGatewayWhereInput.subnetMaskNotContains) &&
        Objects.equals(this.subnetMaskNotEndsWith, virtualPrivateCloudEdgeGatewayWhereInput.subnetMaskNotEndsWith) &&
        Objects.equals(this.subnetMaskNotIn, virtualPrivateCloudEdgeGatewayWhereInput.subnetMaskNotIn) &&
        Objects.equals(this.subnetMaskNotStartsWith, virtualPrivateCloudEdgeGatewayWhereInput.subnetMaskNotStartsWith) &&
        Objects.equals(this.subnetMaskStartsWith, virtualPrivateCloudEdgeGatewayWhereInput.subnetMaskStartsWith) &&
        Objects.equals(this.vdsesEvery, virtualPrivateCloudEdgeGatewayWhereInput.vdsesEvery) &&
        Objects.equals(this.vdsesNone, virtualPrivateCloudEdgeGatewayWhereInput.vdsesNone) &&
        Objects.equals(this.vdsesSome, virtualPrivateCloudEdgeGatewayWhereInput.vdsesSome) &&
        Objects.equals(this.vmInstancesEvery, virtualPrivateCloudEdgeGatewayWhereInput.vmInstancesEvery) &&
        Objects.equals(this.vmInstancesNone, virtualPrivateCloudEdgeGatewayWhereInput.vmInstancesNone) &&
        Objects.equals(this.vmInstancesSome, virtualPrivateCloudEdgeGatewayWhereInput.vmInstancesSome) &&
        Objects.equals(this.vpcService, virtualPrivateCloudEdgeGatewayWhereInput.vpcService);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, cluster, cpuNumber, cpuNumberGt, cpuNumberGte, cpuNumberIn, cpuNumberLt, cpuNumberLte, cpuNumberNot, cpuNumberNotIn, dataVolumeSize, dataVolumeSizeGt, dataVolumeSizeGte, dataVolumeSizeIn, dataVolumeSizeLt, dataVolumeSizeLte, dataVolumeSizeNot, dataVolumeSizeNotIn, description, descriptionContains, descriptionEndsWith, descriptionGt, descriptionGte, descriptionIn, descriptionLt, descriptionLte, descriptionNot, descriptionNotContains, descriptionNotEndsWith, descriptionNotIn, descriptionNotStartsWith, descriptionStartsWith, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, gateway, gatewayContains, gatewayEndsWith, gatewayGt, gatewayGte, gatewayIn, gatewayLt, gatewayLte, gatewayNot, gatewayNotContains, gatewayNotEndsWith, gatewayNotIn, gatewayNotStartsWith, gatewayStartsWith, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, memorySize, memorySizeGt, memorySizeGte, memorySizeIn, memorySizeLt, memorySizeLte, memorySizeNot, memorySizeNotIn, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, phase, phaseIn, phaseNot, phaseNotIn, subnetMask, subnetMaskContains, subnetMaskEndsWith, subnetMaskGt, subnetMaskGte, subnetMaskIn, subnetMaskLt, subnetMaskLte, subnetMaskNot, subnetMaskNotContains, subnetMaskNotEndsWith, subnetMaskNotIn, subnetMaskNotStartsWith, subnetMaskStartsWith, vdsesEvery, vdsesNone, vdsesSome, vmInstancesEvery, vmInstancesNone, vmInstancesSome, vpcService);
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
    sb.append("class VirtualPrivateCloudEdgeGatewayWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    cpuNumber: ").append(toIndentedString(cpuNumber)).append("\n");
    sb.append("    cpuNumberGt: ").append(toIndentedString(cpuNumberGt)).append("\n");
    sb.append("    cpuNumberGte: ").append(toIndentedString(cpuNumberGte)).append("\n");
    sb.append("    cpuNumberIn: ").append(toIndentedString(cpuNumberIn)).append("\n");
    sb.append("    cpuNumberLt: ").append(toIndentedString(cpuNumberLt)).append("\n");
    sb.append("    cpuNumberLte: ").append(toIndentedString(cpuNumberLte)).append("\n");
    sb.append("    cpuNumberNot: ").append(toIndentedString(cpuNumberNot)).append("\n");
    sb.append("    cpuNumberNotIn: ").append(toIndentedString(cpuNumberNotIn)).append("\n");
    sb.append("    dataVolumeSize: ").append(toIndentedString(dataVolumeSize)).append("\n");
    sb.append("    dataVolumeSizeGt: ").append(toIndentedString(dataVolumeSizeGt)).append("\n");
    sb.append("    dataVolumeSizeGte: ").append(toIndentedString(dataVolumeSizeGte)).append("\n");
    sb.append("    dataVolumeSizeIn: ").append(toIndentedString(dataVolumeSizeIn)).append("\n");
    sb.append("    dataVolumeSizeLt: ").append(toIndentedString(dataVolumeSizeLt)).append("\n");
    sb.append("    dataVolumeSizeLte: ").append(toIndentedString(dataVolumeSizeLte)).append("\n");
    sb.append("    dataVolumeSizeNot: ").append(toIndentedString(dataVolumeSizeNot)).append("\n");
    sb.append("    dataVolumeSizeNotIn: ").append(toIndentedString(dataVolumeSizeNotIn)).append("\n");
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
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    gatewayContains: ").append(toIndentedString(gatewayContains)).append("\n");
    sb.append("    gatewayEndsWith: ").append(toIndentedString(gatewayEndsWith)).append("\n");
    sb.append("    gatewayGt: ").append(toIndentedString(gatewayGt)).append("\n");
    sb.append("    gatewayGte: ").append(toIndentedString(gatewayGte)).append("\n");
    sb.append("    gatewayIn: ").append(toIndentedString(gatewayIn)).append("\n");
    sb.append("    gatewayLt: ").append(toIndentedString(gatewayLt)).append("\n");
    sb.append("    gatewayLte: ").append(toIndentedString(gatewayLte)).append("\n");
    sb.append("    gatewayNot: ").append(toIndentedString(gatewayNot)).append("\n");
    sb.append("    gatewayNotContains: ").append(toIndentedString(gatewayNotContains)).append("\n");
    sb.append("    gatewayNotEndsWith: ").append(toIndentedString(gatewayNotEndsWith)).append("\n");
    sb.append("    gatewayNotIn: ").append(toIndentedString(gatewayNotIn)).append("\n");
    sb.append("    gatewayNotStartsWith: ").append(toIndentedString(gatewayNotStartsWith)).append("\n");
    sb.append("    gatewayStartsWith: ").append(toIndentedString(gatewayStartsWith)).append("\n");
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
    sb.append("    memorySize: ").append(toIndentedString(memorySize)).append("\n");
    sb.append("    memorySizeGt: ").append(toIndentedString(memorySizeGt)).append("\n");
    sb.append("    memorySizeGte: ").append(toIndentedString(memorySizeGte)).append("\n");
    sb.append("    memorySizeIn: ").append(toIndentedString(memorySizeIn)).append("\n");
    sb.append("    memorySizeLt: ").append(toIndentedString(memorySizeLt)).append("\n");
    sb.append("    memorySizeLte: ").append(toIndentedString(memorySizeLte)).append("\n");
    sb.append("    memorySizeNot: ").append(toIndentedString(memorySizeNot)).append("\n");
    sb.append("    memorySizeNotIn: ").append(toIndentedString(memorySizeNotIn)).append("\n");
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
    sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
    sb.append("    subnetMaskContains: ").append(toIndentedString(subnetMaskContains)).append("\n");
    sb.append("    subnetMaskEndsWith: ").append(toIndentedString(subnetMaskEndsWith)).append("\n");
    sb.append("    subnetMaskGt: ").append(toIndentedString(subnetMaskGt)).append("\n");
    sb.append("    subnetMaskGte: ").append(toIndentedString(subnetMaskGte)).append("\n");
    sb.append("    subnetMaskIn: ").append(toIndentedString(subnetMaskIn)).append("\n");
    sb.append("    subnetMaskLt: ").append(toIndentedString(subnetMaskLt)).append("\n");
    sb.append("    subnetMaskLte: ").append(toIndentedString(subnetMaskLte)).append("\n");
    sb.append("    subnetMaskNot: ").append(toIndentedString(subnetMaskNot)).append("\n");
    sb.append("    subnetMaskNotContains: ").append(toIndentedString(subnetMaskNotContains)).append("\n");
    sb.append("    subnetMaskNotEndsWith: ").append(toIndentedString(subnetMaskNotEndsWith)).append("\n");
    sb.append("    subnetMaskNotIn: ").append(toIndentedString(subnetMaskNotIn)).append("\n");
    sb.append("    subnetMaskNotStartsWith: ").append(toIndentedString(subnetMaskNotStartsWith)).append("\n");
    sb.append("    subnetMaskStartsWith: ").append(toIndentedString(subnetMaskStartsWith)).append("\n");
    sb.append("    vdsesEvery: ").append(toIndentedString(vdsesEvery)).append("\n");
    sb.append("    vdsesNone: ").append(toIndentedString(vdsesNone)).append("\n");
    sb.append("    vdsesSome: ").append(toIndentedString(vdsesSome)).append("\n");
    sb.append("    vmInstancesEvery: ").append(toIndentedString(vmInstancesEvery)).append("\n");
    sb.append("    vmInstancesNone: ").append(toIndentedString(vmInstancesNone)).append("\n");
    sb.append("    vmInstancesSome: ").append(toIndentedString(vmInstancesSome)).append("\n");
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

