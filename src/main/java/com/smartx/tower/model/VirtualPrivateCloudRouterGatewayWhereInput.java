package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.VirtualPrivateCloudExternalSubnetWhereInput;
import com.smartx.tower.model.VirtualPrivateCloudSubnetWhereInput;
import com.smartx.tower.model.VirtualPrivateCloudWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VirtualPrivateCloudRouterGatewayWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class VirtualPrivateCloudRouterGatewayWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<VirtualPrivateCloudRouterGatewayWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<VirtualPrivateCloudRouterGatewayWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<VirtualPrivateCloudRouterGatewayWhereInput> OR = null;

  public static final String SERIALIZED_NAME_ASSOCIATED_SUBNETS_EVERY = "associated_subnets_every";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_SUBNETS_EVERY)
  private VirtualPrivateCloudSubnetWhereInput associatedSubnetsEvery;

  public static final String SERIALIZED_NAME_ASSOCIATED_SUBNETS_NONE = "associated_subnets_none";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_SUBNETS_NONE)
  private VirtualPrivateCloudSubnetWhereInput associatedSubnetsNone;

  public static final String SERIALIZED_NAME_ASSOCIATED_SUBNETS_SOME = "associated_subnets_some";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_SUBNETS_SOME)
  private VirtualPrivateCloudSubnetWhereInput associatedSubnetsSome;

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

  public static final String SERIALIZED_NAME_EXTERNAL_IP = "external_ip";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IP)
  private String externalIp;

  public static final String SERIALIZED_NAME_EXTERNAL_IP_CONTAINS = "external_ip_contains";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_CONTAINS)
  private String externalIpContains;

  public static final String SERIALIZED_NAME_EXTERNAL_IP_ENDS_WITH = "external_ip_ends_with";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_ENDS_WITH)
  private String externalIpEndsWith;

  public static final String SERIALIZED_NAME_EXTERNAL_IP_GT = "external_ip_gt";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_GT)
  private String externalIpGt;

  public static final String SERIALIZED_NAME_EXTERNAL_IP_GTE = "external_ip_gte";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_GTE)
  private String externalIpGte;

  public static final String SERIALIZED_NAME_EXTERNAL_IP_IN = "external_ip_in";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_IN)
  private List<String> externalIpIn = null;

  public static final String SERIALIZED_NAME_EXTERNAL_IP_LT = "external_ip_lt";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_LT)
  private String externalIpLt;

  public static final String SERIALIZED_NAME_EXTERNAL_IP_LTE = "external_ip_lte";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_LTE)
  private String externalIpLte;

  public static final String SERIALIZED_NAME_EXTERNAL_IP_NOT = "external_ip_not";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_NOT)
  private String externalIpNot;

  public static final String SERIALIZED_NAME_EXTERNAL_IP_NOT_CONTAINS = "external_ip_not_contains";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_NOT_CONTAINS)
  private String externalIpNotContains;

  public static final String SERIALIZED_NAME_EXTERNAL_IP_NOT_ENDS_WITH = "external_ip_not_ends_with";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_NOT_ENDS_WITH)
  private String externalIpNotEndsWith;

  public static final String SERIALIZED_NAME_EXTERNAL_IP_NOT_IN = "external_ip_not_in";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_NOT_IN)
  private List<String> externalIpNotIn = null;

  public static final String SERIALIZED_NAME_EXTERNAL_IP_NOT_STARTS_WITH = "external_ip_not_starts_with";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_NOT_STARTS_WITH)
  private String externalIpNotStartsWith;

  public static final String SERIALIZED_NAME_EXTERNAL_IP_STARTS_WITH = "external_ip_starts_with";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_STARTS_WITH)
  private String externalIpStartsWith;

  public static final String SERIALIZED_NAME_EXTERNAL_SUBNET = "external_subnet";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNET)
  private VirtualPrivateCloudExternalSubnetWhereInput externalSubnet;

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

  public static final String SERIALIZED_NAME_NEXTHOP_IP = "nexthop_ip";
  @SerializedName(SERIALIZED_NAME_NEXTHOP_IP)
  private String nexthopIp;

  public static final String SERIALIZED_NAME_NEXTHOP_IP_CONTAINS = "nexthop_ip_contains";
  @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_CONTAINS)
  private String nexthopIpContains;

  public static final String SERIALIZED_NAME_NEXTHOP_IP_ENDS_WITH = "nexthop_ip_ends_with";
  @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_ENDS_WITH)
  private String nexthopIpEndsWith;

  public static final String SERIALIZED_NAME_NEXTHOP_IP_GT = "nexthop_ip_gt";
  @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_GT)
  private String nexthopIpGt;

  public static final String SERIALIZED_NAME_NEXTHOP_IP_GTE = "nexthop_ip_gte";
  @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_GTE)
  private String nexthopIpGte;

  public static final String SERIALIZED_NAME_NEXTHOP_IP_IN = "nexthop_ip_in";
  @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_IN)
  private List<String> nexthopIpIn = null;

  public static final String SERIALIZED_NAME_NEXTHOP_IP_LT = "nexthop_ip_lt";
  @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_LT)
  private String nexthopIpLt;

  public static final String SERIALIZED_NAME_NEXTHOP_IP_LTE = "nexthop_ip_lte";
  @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_LTE)
  private String nexthopIpLte;

  public static final String SERIALIZED_NAME_NEXTHOP_IP_NOT = "nexthop_ip_not";
  @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_NOT)
  private String nexthopIpNot;

  public static final String SERIALIZED_NAME_NEXTHOP_IP_NOT_CONTAINS = "nexthop_ip_not_contains";
  @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_NOT_CONTAINS)
  private String nexthopIpNotContains;

  public static final String SERIALIZED_NAME_NEXTHOP_IP_NOT_ENDS_WITH = "nexthop_ip_not_ends_with";
  @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_NOT_ENDS_WITH)
  private String nexthopIpNotEndsWith;

  public static final String SERIALIZED_NAME_NEXTHOP_IP_NOT_IN = "nexthop_ip_not_in";
  @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_NOT_IN)
  private List<String> nexthopIpNotIn = null;

  public static final String SERIALIZED_NAME_NEXTHOP_IP_NOT_STARTS_WITH = "nexthop_ip_not_starts_with";
  @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_NOT_STARTS_WITH)
  private String nexthopIpNotStartsWith;

  public static final String SERIALIZED_NAME_NEXTHOP_IP_STARTS_WITH = "nexthop_ip_starts_with";
  @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_STARTS_WITH)
  private String nexthopIpStartsWith;

  public static final String SERIALIZED_NAME_VPC = "vpc";
  @SerializedName(SERIALIZED_NAME_VPC)
  private VirtualPrivateCloudWhereInput vpc;

  public VirtualPrivateCloudRouterGatewayWhereInput() { 
  }

  public VirtualPrivateCloudRouterGatewayWhereInput AND(List<VirtualPrivateCloudRouterGatewayWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public VirtualPrivateCloudRouterGatewayWhereInput addANDItem(VirtualPrivateCloudRouterGatewayWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<VirtualPrivateCloudRouterGatewayWhereInput>();
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

  public List<VirtualPrivateCloudRouterGatewayWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<VirtualPrivateCloudRouterGatewayWhereInput> AND) {
    this.AND = AND;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput NOT(List<VirtualPrivateCloudRouterGatewayWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public VirtualPrivateCloudRouterGatewayWhereInput addNOTItem(VirtualPrivateCloudRouterGatewayWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<VirtualPrivateCloudRouterGatewayWhereInput>();
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

  public List<VirtualPrivateCloudRouterGatewayWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<VirtualPrivateCloudRouterGatewayWhereInput> NOT) {
    this.NOT = NOT;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput OR(List<VirtualPrivateCloudRouterGatewayWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public VirtualPrivateCloudRouterGatewayWhereInput addORItem(VirtualPrivateCloudRouterGatewayWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<VirtualPrivateCloudRouterGatewayWhereInput>();
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

  public List<VirtualPrivateCloudRouterGatewayWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<VirtualPrivateCloudRouterGatewayWhereInput> OR) {
    this.OR = OR;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput associatedSubnetsEvery(VirtualPrivateCloudSubnetWhereInput associatedSubnetsEvery) {
    
    this.associatedSubnetsEvery = associatedSubnetsEvery;
    return this;
  }

   /**
   * Get associatedSubnetsEvery
   * @return associatedSubnetsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudSubnetWhereInput getAssociatedSubnetsEvery() {
    return associatedSubnetsEvery;
  }


  public void setAssociatedSubnetsEvery(VirtualPrivateCloudSubnetWhereInput associatedSubnetsEvery) {
    this.associatedSubnetsEvery = associatedSubnetsEvery;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput associatedSubnetsNone(VirtualPrivateCloudSubnetWhereInput associatedSubnetsNone) {
    
    this.associatedSubnetsNone = associatedSubnetsNone;
    return this;
  }

   /**
   * Get associatedSubnetsNone
   * @return associatedSubnetsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudSubnetWhereInput getAssociatedSubnetsNone() {
    return associatedSubnetsNone;
  }


  public void setAssociatedSubnetsNone(VirtualPrivateCloudSubnetWhereInput associatedSubnetsNone) {
    this.associatedSubnetsNone = associatedSubnetsNone;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput associatedSubnetsSome(VirtualPrivateCloudSubnetWhereInput associatedSubnetsSome) {
    
    this.associatedSubnetsSome = associatedSubnetsSome;
    return this;
  }

   /**
   * Get associatedSubnetsSome
   * @return associatedSubnetsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudSubnetWhereInput getAssociatedSubnetsSome() {
    return associatedSubnetsSome;
  }


  public void setAssociatedSubnetsSome(VirtualPrivateCloudSubnetWhereInput associatedSubnetsSome) {
    this.associatedSubnetsSome = associatedSubnetsSome;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public VirtualPrivateCloudRouterGatewayWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public VirtualPrivateCloudRouterGatewayWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public VirtualPrivateCloudRouterGatewayWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public VirtualPrivateCloudRouterGatewayWhereInput externalIp(String externalIp) {
    
    this.externalIp = externalIp;
    return this;
  }

   /**
   * Get externalIp
   * @return externalIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalIp() {
    return externalIp;
  }


  public void setExternalIp(String externalIp) {
    this.externalIp = externalIp;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput externalIpContains(String externalIpContains) {
    
    this.externalIpContains = externalIpContains;
    return this;
  }

   /**
   * Get externalIpContains
   * @return externalIpContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalIpContains() {
    return externalIpContains;
  }


  public void setExternalIpContains(String externalIpContains) {
    this.externalIpContains = externalIpContains;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput externalIpEndsWith(String externalIpEndsWith) {
    
    this.externalIpEndsWith = externalIpEndsWith;
    return this;
  }

   /**
   * Get externalIpEndsWith
   * @return externalIpEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalIpEndsWith() {
    return externalIpEndsWith;
  }


  public void setExternalIpEndsWith(String externalIpEndsWith) {
    this.externalIpEndsWith = externalIpEndsWith;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput externalIpGt(String externalIpGt) {
    
    this.externalIpGt = externalIpGt;
    return this;
  }

   /**
   * Get externalIpGt
   * @return externalIpGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalIpGt() {
    return externalIpGt;
  }


  public void setExternalIpGt(String externalIpGt) {
    this.externalIpGt = externalIpGt;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput externalIpGte(String externalIpGte) {
    
    this.externalIpGte = externalIpGte;
    return this;
  }

   /**
   * Get externalIpGte
   * @return externalIpGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalIpGte() {
    return externalIpGte;
  }


  public void setExternalIpGte(String externalIpGte) {
    this.externalIpGte = externalIpGte;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput externalIpIn(List<String> externalIpIn) {
    
    this.externalIpIn = externalIpIn;
    return this;
  }

  public VirtualPrivateCloudRouterGatewayWhereInput addExternalIpInItem(String externalIpInItem) {
    if (this.externalIpIn == null) {
      this.externalIpIn = new ArrayList<String>();
    }
    this.externalIpIn.add(externalIpInItem);
    return this;
  }

   /**
   * Get externalIpIn
   * @return externalIpIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getExternalIpIn() {
    return externalIpIn;
  }


  public void setExternalIpIn(List<String> externalIpIn) {
    this.externalIpIn = externalIpIn;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput externalIpLt(String externalIpLt) {
    
    this.externalIpLt = externalIpLt;
    return this;
  }

   /**
   * Get externalIpLt
   * @return externalIpLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalIpLt() {
    return externalIpLt;
  }


  public void setExternalIpLt(String externalIpLt) {
    this.externalIpLt = externalIpLt;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput externalIpLte(String externalIpLte) {
    
    this.externalIpLte = externalIpLte;
    return this;
  }

   /**
   * Get externalIpLte
   * @return externalIpLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalIpLte() {
    return externalIpLte;
  }


  public void setExternalIpLte(String externalIpLte) {
    this.externalIpLte = externalIpLte;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput externalIpNot(String externalIpNot) {
    
    this.externalIpNot = externalIpNot;
    return this;
  }

   /**
   * Get externalIpNot
   * @return externalIpNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalIpNot() {
    return externalIpNot;
  }


  public void setExternalIpNot(String externalIpNot) {
    this.externalIpNot = externalIpNot;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput externalIpNotContains(String externalIpNotContains) {
    
    this.externalIpNotContains = externalIpNotContains;
    return this;
  }

   /**
   * Get externalIpNotContains
   * @return externalIpNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalIpNotContains() {
    return externalIpNotContains;
  }


  public void setExternalIpNotContains(String externalIpNotContains) {
    this.externalIpNotContains = externalIpNotContains;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput externalIpNotEndsWith(String externalIpNotEndsWith) {
    
    this.externalIpNotEndsWith = externalIpNotEndsWith;
    return this;
  }

   /**
   * Get externalIpNotEndsWith
   * @return externalIpNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalIpNotEndsWith() {
    return externalIpNotEndsWith;
  }


  public void setExternalIpNotEndsWith(String externalIpNotEndsWith) {
    this.externalIpNotEndsWith = externalIpNotEndsWith;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput externalIpNotIn(List<String> externalIpNotIn) {
    
    this.externalIpNotIn = externalIpNotIn;
    return this;
  }

  public VirtualPrivateCloudRouterGatewayWhereInput addExternalIpNotInItem(String externalIpNotInItem) {
    if (this.externalIpNotIn == null) {
      this.externalIpNotIn = new ArrayList<String>();
    }
    this.externalIpNotIn.add(externalIpNotInItem);
    return this;
  }

   /**
   * Get externalIpNotIn
   * @return externalIpNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getExternalIpNotIn() {
    return externalIpNotIn;
  }


  public void setExternalIpNotIn(List<String> externalIpNotIn) {
    this.externalIpNotIn = externalIpNotIn;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput externalIpNotStartsWith(String externalIpNotStartsWith) {
    
    this.externalIpNotStartsWith = externalIpNotStartsWith;
    return this;
  }

   /**
   * Get externalIpNotStartsWith
   * @return externalIpNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalIpNotStartsWith() {
    return externalIpNotStartsWith;
  }


  public void setExternalIpNotStartsWith(String externalIpNotStartsWith) {
    this.externalIpNotStartsWith = externalIpNotStartsWith;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput externalIpStartsWith(String externalIpStartsWith) {
    
    this.externalIpStartsWith = externalIpStartsWith;
    return this;
  }

   /**
   * Get externalIpStartsWith
   * @return externalIpStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalIpStartsWith() {
    return externalIpStartsWith;
  }


  public void setExternalIpStartsWith(String externalIpStartsWith) {
    this.externalIpStartsWith = externalIpStartsWith;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput externalSubnet(VirtualPrivateCloudExternalSubnetWhereInput externalSubnet) {
    
    this.externalSubnet = externalSubnet;
    return this;
  }

   /**
   * Get externalSubnet
   * @return externalSubnet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudExternalSubnetWhereInput getExternalSubnet() {
    return externalSubnet;
  }


  public void setExternalSubnet(VirtualPrivateCloudExternalSubnetWhereInput externalSubnet) {
    this.externalSubnet = externalSubnet;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput id(String id) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput idContains(String idContains) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput idEndsWith(String idEndsWith) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput idGt(String idGt) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput idGte(String idGte) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public VirtualPrivateCloudRouterGatewayWhereInput addIdInItem(String idInItem) {
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


  public VirtualPrivateCloudRouterGatewayWhereInput idLt(String idLt) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput idLte(String idLte) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput idNot(String idNot) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput idNotContains(String idNotContains) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public VirtualPrivateCloudRouterGatewayWhereInput addIdNotInItem(String idNotInItem) {
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


  public VirtualPrivateCloudRouterGatewayWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput idStartsWith(String idStartsWith) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput localId(String localId) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput localIdContains(String localIdContains) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput localIdGt(String localIdGt) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput localIdGte(String localIdGte) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public VirtualPrivateCloudRouterGatewayWhereInput addLocalIdInItem(String localIdInItem) {
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


  public VirtualPrivateCloudRouterGatewayWhereInput localIdLt(String localIdLt) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput localIdLte(String localIdLte) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput localIdNot(String localIdNot) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public VirtualPrivateCloudRouterGatewayWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public VirtualPrivateCloudRouterGatewayWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput name(String name) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput nameContains(String nameContains) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput nameGt(String nameGt) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput nameGte(String nameGte) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public VirtualPrivateCloudRouterGatewayWhereInput addNameInItem(String nameInItem) {
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


  public VirtualPrivateCloudRouterGatewayWhereInput nameLt(String nameLt) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput nameLte(String nameLte) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput nameNot(String nameNot) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput nameNotContains(String nameNotContains) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public VirtualPrivateCloudRouterGatewayWhereInput addNameNotInItem(String nameNotInItem) {
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


  public VirtualPrivateCloudRouterGatewayWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public VirtualPrivateCloudRouterGatewayWhereInput nexthopIp(String nexthopIp) {
    
    this.nexthopIp = nexthopIp;
    return this;
  }

   /**
   * Get nexthopIp
   * @return nexthopIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNexthopIp() {
    return nexthopIp;
  }


  public void setNexthopIp(String nexthopIp) {
    this.nexthopIp = nexthopIp;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpContains(String nexthopIpContains) {
    
    this.nexthopIpContains = nexthopIpContains;
    return this;
  }

   /**
   * Get nexthopIpContains
   * @return nexthopIpContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNexthopIpContains() {
    return nexthopIpContains;
  }


  public void setNexthopIpContains(String nexthopIpContains) {
    this.nexthopIpContains = nexthopIpContains;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpEndsWith(String nexthopIpEndsWith) {
    
    this.nexthopIpEndsWith = nexthopIpEndsWith;
    return this;
  }

   /**
   * Get nexthopIpEndsWith
   * @return nexthopIpEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNexthopIpEndsWith() {
    return nexthopIpEndsWith;
  }


  public void setNexthopIpEndsWith(String nexthopIpEndsWith) {
    this.nexthopIpEndsWith = nexthopIpEndsWith;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpGt(String nexthopIpGt) {
    
    this.nexthopIpGt = nexthopIpGt;
    return this;
  }

   /**
   * Get nexthopIpGt
   * @return nexthopIpGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNexthopIpGt() {
    return nexthopIpGt;
  }


  public void setNexthopIpGt(String nexthopIpGt) {
    this.nexthopIpGt = nexthopIpGt;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpGte(String nexthopIpGte) {
    
    this.nexthopIpGte = nexthopIpGte;
    return this;
  }

   /**
   * Get nexthopIpGte
   * @return nexthopIpGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNexthopIpGte() {
    return nexthopIpGte;
  }


  public void setNexthopIpGte(String nexthopIpGte) {
    this.nexthopIpGte = nexthopIpGte;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpIn(List<String> nexthopIpIn) {
    
    this.nexthopIpIn = nexthopIpIn;
    return this;
  }

  public VirtualPrivateCloudRouterGatewayWhereInput addNexthopIpInItem(String nexthopIpInItem) {
    if (this.nexthopIpIn == null) {
      this.nexthopIpIn = new ArrayList<String>();
    }
    this.nexthopIpIn.add(nexthopIpInItem);
    return this;
  }

   /**
   * Get nexthopIpIn
   * @return nexthopIpIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNexthopIpIn() {
    return nexthopIpIn;
  }


  public void setNexthopIpIn(List<String> nexthopIpIn) {
    this.nexthopIpIn = nexthopIpIn;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpLt(String nexthopIpLt) {
    
    this.nexthopIpLt = nexthopIpLt;
    return this;
  }

   /**
   * Get nexthopIpLt
   * @return nexthopIpLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNexthopIpLt() {
    return nexthopIpLt;
  }


  public void setNexthopIpLt(String nexthopIpLt) {
    this.nexthopIpLt = nexthopIpLt;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpLte(String nexthopIpLte) {
    
    this.nexthopIpLte = nexthopIpLte;
    return this;
  }

   /**
   * Get nexthopIpLte
   * @return nexthopIpLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNexthopIpLte() {
    return nexthopIpLte;
  }


  public void setNexthopIpLte(String nexthopIpLte) {
    this.nexthopIpLte = nexthopIpLte;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpNot(String nexthopIpNot) {
    
    this.nexthopIpNot = nexthopIpNot;
    return this;
  }

   /**
   * Get nexthopIpNot
   * @return nexthopIpNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNexthopIpNot() {
    return nexthopIpNot;
  }


  public void setNexthopIpNot(String nexthopIpNot) {
    this.nexthopIpNot = nexthopIpNot;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpNotContains(String nexthopIpNotContains) {
    
    this.nexthopIpNotContains = nexthopIpNotContains;
    return this;
  }

   /**
   * Get nexthopIpNotContains
   * @return nexthopIpNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNexthopIpNotContains() {
    return nexthopIpNotContains;
  }


  public void setNexthopIpNotContains(String nexthopIpNotContains) {
    this.nexthopIpNotContains = nexthopIpNotContains;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpNotEndsWith(String nexthopIpNotEndsWith) {
    
    this.nexthopIpNotEndsWith = nexthopIpNotEndsWith;
    return this;
  }

   /**
   * Get nexthopIpNotEndsWith
   * @return nexthopIpNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNexthopIpNotEndsWith() {
    return nexthopIpNotEndsWith;
  }


  public void setNexthopIpNotEndsWith(String nexthopIpNotEndsWith) {
    this.nexthopIpNotEndsWith = nexthopIpNotEndsWith;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpNotIn(List<String> nexthopIpNotIn) {
    
    this.nexthopIpNotIn = nexthopIpNotIn;
    return this;
  }

  public VirtualPrivateCloudRouterGatewayWhereInput addNexthopIpNotInItem(String nexthopIpNotInItem) {
    if (this.nexthopIpNotIn == null) {
      this.nexthopIpNotIn = new ArrayList<String>();
    }
    this.nexthopIpNotIn.add(nexthopIpNotInItem);
    return this;
  }

   /**
   * Get nexthopIpNotIn
   * @return nexthopIpNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNexthopIpNotIn() {
    return nexthopIpNotIn;
  }


  public void setNexthopIpNotIn(List<String> nexthopIpNotIn) {
    this.nexthopIpNotIn = nexthopIpNotIn;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpNotStartsWith(String nexthopIpNotStartsWith) {
    
    this.nexthopIpNotStartsWith = nexthopIpNotStartsWith;
    return this;
  }

   /**
   * Get nexthopIpNotStartsWith
   * @return nexthopIpNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNexthopIpNotStartsWith() {
    return nexthopIpNotStartsWith;
  }


  public void setNexthopIpNotStartsWith(String nexthopIpNotStartsWith) {
    this.nexthopIpNotStartsWith = nexthopIpNotStartsWith;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpStartsWith(String nexthopIpStartsWith) {
    
    this.nexthopIpStartsWith = nexthopIpStartsWith;
    return this;
  }

   /**
   * Get nexthopIpStartsWith
   * @return nexthopIpStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNexthopIpStartsWith() {
    return nexthopIpStartsWith;
  }


  public void setNexthopIpStartsWith(String nexthopIpStartsWith) {
    this.nexthopIpStartsWith = nexthopIpStartsWith;
  }


  public VirtualPrivateCloudRouterGatewayWhereInput vpc(VirtualPrivateCloudWhereInput vpc) {
    
    this.vpc = vpc;
    return this;
  }

   /**
   * Get vpc
   * @return vpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudWhereInput getVpc() {
    return vpc;
  }


  public void setVpc(VirtualPrivateCloudWhereInput vpc) {
    this.vpc = vpc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualPrivateCloudRouterGatewayWhereInput virtualPrivateCloudRouterGatewayWhereInput = (VirtualPrivateCloudRouterGatewayWhereInput) o;
    return Objects.equals(this.AND, virtualPrivateCloudRouterGatewayWhereInput.AND) &&
        Objects.equals(this.NOT, virtualPrivateCloudRouterGatewayWhereInput.NOT) &&
        Objects.equals(this.OR, virtualPrivateCloudRouterGatewayWhereInput.OR) &&
        Objects.equals(this.associatedSubnetsEvery, virtualPrivateCloudRouterGatewayWhereInput.associatedSubnetsEvery) &&
        Objects.equals(this.associatedSubnetsNone, virtualPrivateCloudRouterGatewayWhereInput.associatedSubnetsNone) &&
        Objects.equals(this.associatedSubnetsSome, virtualPrivateCloudRouterGatewayWhereInput.associatedSubnetsSome) &&
        Objects.equals(this.entityAsyncStatus, virtualPrivateCloudRouterGatewayWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, virtualPrivateCloudRouterGatewayWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, virtualPrivateCloudRouterGatewayWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, virtualPrivateCloudRouterGatewayWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.externalIp, virtualPrivateCloudRouterGatewayWhereInput.externalIp) &&
        Objects.equals(this.externalIpContains, virtualPrivateCloudRouterGatewayWhereInput.externalIpContains) &&
        Objects.equals(this.externalIpEndsWith, virtualPrivateCloudRouterGatewayWhereInput.externalIpEndsWith) &&
        Objects.equals(this.externalIpGt, virtualPrivateCloudRouterGatewayWhereInput.externalIpGt) &&
        Objects.equals(this.externalIpGte, virtualPrivateCloudRouterGatewayWhereInput.externalIpGte) &&
        Objects.equals(this.externalIpIn, virtualPrivateCloudRouterGatewayWhereInput.externalIpIn) &&
        Objects.equals(this.externalIpLt, virtualPrivateCloudRouterGatewayWhereInput.externalIpLt) &&
        Objects.equals(this.externalIpLte, virtualPrivateCloudRouterGatewayWhereInput.externalIpLte) &&
        Objects.equals(this.externalIpNot, virtualPrivateCloudRouterGatewayWhereInput.externalIpNot) &&
        Objects.equals(this.externalIpNotContains, virtualPrivateCloudRouterGatewayWhereInput.externalIpNotContains) &&
        Objects.equals(this.externalIpNotEndsWith, virtualPrivateCloudRouterGatewayWhereInput.externalIpNotEndsWith) &&
        Objects.equals(this.externalIpNotIn, virtualPrivateCloudRouterGatewayWhereInput.externalIpNotIn) &&
        Objects.equals(this.externalIpNotStartsWith, virtualPrivateCloudRouterGatewayWhereInput.externalIpNotStartsWith) &&
        Objects.equals(this.externalIpStartsWith, virtualPrivateCloudRouterGatewayWhereInput.externalIpStartsWith) &&
        Objects.equals(this.externalSubnet, virtualPrivateCloudRouterGatewayWhereInput.externalSubnet) &&
        Objects.equals(this.id, virtualPrivateCloudRouterGatewayWhereInput.id) &&
        Objects.equals(this.idContains, virtualPrivateCloudRouterGatewayWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, virtualPrivateCloudRouterGatewayWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, virtualPrivateCloudRouterGatewayWhereInput.idGt) &&
        Objects.equals(this.idGte, virtualPrivateCloudRouterGatewayWhereInput.idGte) &&
        Objects.equals(this.idIn, virtualPrivateCloudRouterGatewayWhereInput.idIn) &&
        Objects.equals(this.idLt, virtualPrivateCloudRouterGatewayWhereInput.idLt) &&
        Objects.equals(this.idLte, virtualPrivateCloudRouterGatewayWhereInput.idLte) &&
        Objects.equals(this.idNot, virtualPrivateCloudRouterGatewayWhereInput.idNot) &&
        Objects.equals(this.idNotContains, virtualPrivateCloudRouterGatewayWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, virtualPrivateCloudRouterGatewayWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, virtualPrivateCloudRouterGatewayWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, virtualPrivateCloudRouterGatewayWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, virtualPrivateCloudRouterGatewayWhereInput.idStartsWith) &&
        Objects.equals(this.localId, virtualPrivateCloudRouterGatewayWhereInput.localId) &&
        Objects.equals(this.localIdContains, virtualPrivateCloudRouterGatewayWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, virtualPrivateCloudRouterGatewayWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, virtualPrivateCloudRouterGatewayWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, virtualPrivateCloudRouterGatewayWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, virtualPrivateCloudRouterGatewayWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, virtualPrivateCloudRouterGatewayWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, virtualPrivateCloudRouterGatewayWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, virtualPrivateCloudRouterGatewayWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, virtualPrivateCloudRouterGatewayWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, virtualPrivateCloudRouterGatewayWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, virtualPrivateCloudRouterGatewayWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, virtualPrivateCloudRouterGatewayWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, virtualPrivateCloudRouterGatewayWhereInput.localIdStartsWith) &&
        Objects.equals(this.name, virtualPrivateCloudRouterGatewayWhereInput.name) &&
        Objects.equals(this.nameContains, virtualPrivateCloudRouterGatewayWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, virtualPrivateCloudRouterGatewayWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, virtualPrivateCloudRouterGatewayWhereInput.nameGt) &&
        Objects.equals(this.nameGte, virtualPrivateCloudRouterGatewayWhereInput.nameGte) &&
        Objects.equals(this.nameIn, virtualPrivateCloudRouterGatewayWhereInput.nameIn) &&
        Objects.equals(this.nameLt, virtualPrivateCloudRouterGatewayWhereInput.nameLt) &&
        Objects.equals(this.nameLte, virtualPrivateCloudRouterGatewayWhereInput.nameLte) &&
        Objects.equals(this.nameNot, virtualPrivateCloudRouterGatewayWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, virtualPrivateCloudRouterGatewayWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, virtualPrivateCloudRouterGatewayWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, virtualPrivateCloudRouterGatewayWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, virtualPrivateCloudRouterGatewayWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, virtualPrivateCloudRouterGatewayWhereInput.nameStartsWith) &&
        Objects.equals(this.nexthopIp, virtualPrivateCloudRouterGatewayWhereInput.nexthopIp) &&
        Objects.equals(this.nexthopIpContains, virtualPrivateCloudRouterGatewayWhereInput.nexthopIpContains) &&
        Objects.equals(this.nexthopIpEndsWith, virtualPrivateCloudRouterGatewayWhereInput.nexthopIpEndsWith) &&
        Objects.equals(this.nexthopIpGt, virtualPrivateCloudRouterGatewayWhereInput.nexthopIpGt) &&
        Objects.equals(this.nexthopIpGte, virtualPrivateCloudRouterGatewayWhereInput.nexthopIpGte) &&
        Objects.equals(this.nexthopIpIn, virtualPrivateCloudRouterGatewayWhereInput.nexthopIpIn) &&
        Objects.equals(this.nexthopIpLt, virtualPrivateCloudRouterGatewayWhereInput.nexthopIpLt) &&
        Objects.equals(this.nexthopIpLte, virtualPrivateCloudRouterGatewayWhereInput.nexthopIpLte) &&
        Objects.equals(this.nexthopIpNot, virtualPrivateCloudRouterGatewayWhereInput.nexthopIpNot) &&
        Objects.equals(this.nexthopIpNotContains, virtualPrivateCloudRouterGatewayWhereInput.nexthopIpNotContains) &&
        Objects.equals(this.nexthopIpNotEndsWith, virtualPrivateCloudRouterGatewayWhereInput.nexthopIpNotEndsWith) &&
        Objects.equals(this.nexthopIpNotIn, virtualPrivateCloudRouterGatewayWhereInput.nexthopIpNotIn) &&
        Objects.equals(this.nexthopIpNotStartsWith, virtualPrivateCloudRouterGatewayWhereInput.nexthopIpNotStartsWith) &&
        Objects.equals(this.nexthopIpStartsWith, virtualPrivateCloudRouterGatewayWhereInput.nexthopIpStartsWith) &&
        Objects.equals(this.vpc, virtualPrivateCloudRouterGatewayWhereInput.vpc);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, associatedSubnetsEvery, associatedSubnetsNone, associatedSubnetsSome, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, externalIp, externalIpContains, externalIpEndsWith, externalIpGt, externalIpGte, externalIpIn, externalIpLt, externalIpLte, externalIpNot, externalIpNotContains, externalIpNotEndsWith, externalIpNotIn, externalIpNotStartsWith, externalIpStartsWith, externalSubnet, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, nexthopIp, nexthopIpContains, nexthopIpEndsWith, nexthopIpGt, nexthopIpGte, nexthopIpIn, nexthopIpLt, nexthopIpLte, nexthopIpNot, nexthopIpNotContains, nexthopIpNotEndsWith, nexthopIpNotIn, nexthopIpNotStartsWith, nexthopIpStartsWith, vpc);
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
    sb.append("class VirtualPrivateCloudRouterGatewayWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    associatedSubnetsEvery: ").append(toIndentedString(associatedSubnetsEvery)).append("\n");
    sb.append("    associatedSubnetsNone: ").append(toIndentedString(associatedSubnetsNone)).append("\n");
    sb.append("    associatedSubnetsSome: ").append(toIndentedString(associatedSubnetsSome)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    entityAsyncStatusIn: ").append(toIndentedString(entityAsyncStatusIn)).append("\n");
    sb.append("    entityAsyncStatusNot: ").append(toIndentedString(entityAsyncStatusNot)).append("\n");
    sb.append("    entityAsyncStatusNotIn: ").append(toIndentedString(entityAsyncStatusNotIn)).append("\n");
    sb.append("    externalIp: ").append(toIndentedString(externalIp)).append("\n");
    sb.append("    externalIpContains: ").append(toIndentedString(externalIpContains)).append("\n");
    sb.append("    externalIpEndsWith: ").append(toIndentedString(externalIpEndsWith)).append("\n");
    sb.append("    externalIpGt: ").append(toIndentedString(externalIpGt)).append("\n");
    sb.append("    externalIpGte: ").append(toIndentedString(externalIpGte)).append("\n");
    sb.append("    externalIpIn: ").append(toIndentedString(externalIpIn)).append("\n");
    sb.append("    externalIpLt: ").append(toIndentedString(externalIpLt)).append("\n");
    sb.append("    externalIpLte: ").append(toIndentedString(externalIpLte)).append("\n");
    sb.append("    externalIpNot: ").append(toIndentedString(externalIpNot)).append("\n");
    sb.append("    externalIpNotContains: ").append(toIndentedString(externalIpNotContains)).append("\n");
    sb.append("    externalIpNotEndsWith: ").append(toIndentedString(externalIpNotEndsWith)).append("\n");
    sb.append("    externalIpNotIn: ").append(toIndentedString(externalIpNotIn)).append("\n");
    sb.append("    externalIpNotStartsWith: ").append(toIndentedString(externalIpNotStartsWith)).append("\n");
    sb.append("    externalIpStartsWith: ").append(toIndentedString(externalIpStartsWith)).append("\n");
    sb.append("    externalSubnet: ").append(toIndentedString(externalSubnet)).append("\n");
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
    sb.append("    nexthopIp: ").append(toIndentedString(nexthopIp)).append("\n");
    sb.append("    nexthopIpContains: ").append(toIndentedString(nexthopIpContains)).append("\n");
    sb.append("    nexthopIpEndsWith: ").append(toIndentedString(nexthopIpEndsWith)).append("\n");
    sb.append("    nexthopIpGt: ").append(toIndentedString(nexthopIpGt)).append("\n");
    sb.append("    nexthopIpGte: ").append(toIndentedString(nexthopIpGte)).append("\n");
    sb.append("    nexthopIpIn: ").append(toIndentedString(nexthopIpIn)).append("\n");
    sb.append("    nexthopIpLt: ").append(toIndentedString(nexthopIpLt)).append("\n");
    sb.append("    nexthopIpLte: ").append(toIndentedString(nexthopIpLte)).append("\n");
    sb.append("    nexthopIpNot: ").append(toIndentedString(nexthopIpNot)).append("\n");
    sb.append("    nexthopIpNotContains: ").append(toIndentedString(nexthopIpNotContains)).append("\n");
    sb.append("    nexthopIpNotEndsWith: ").append(toIndentedString(nexthopIpNotEndsWith)).append("\n");
    sb.append("    nexthopIpNotIn: ").append(toIndentedString(nexthopIpNotIn)).append("\n");
    sb.append("    nexthopIpNotStartsWith: ").append(toIndentedString(nexthopIpNotStartsWith)).append("\n");
    sb.append("    nexthopIpStartsWith: ").append(toIndentedString(nexthopIpStartsWith)).append("\n");
    sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
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

