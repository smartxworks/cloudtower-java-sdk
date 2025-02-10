package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.VirtualPrivateCloudEdgeGatewayWhereInput;
import com.smartx.tower.model.VirtualPrivateCloudExternalSubnetGroupWhereInput;
import com.smartx.tower.model.VirtualPrivateCloudServiceWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VirtualPrivateCloudEdgeGatewayGroupWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VirtualPrivateCloudEdgeGatewayGroupWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> OR = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_CREATED_AT_GT = "createdAt_gt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_GT)
  private String createdAtGt;

  public static final String SERIALIZED_NAME_CREATED_AT_GTE = "createdAt_gte";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_GTE)
  private String createdAtGte;

  public static final String SERIALIZED_NAME_CREATED_AT_IN = "createdAt_in";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_IN)
  private List<String> createdAtIn = null;

  public static final String SERIALIZED_NAME_CREATED_AT_LT = "createdAt_lt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_LT)
  private String createdAtLt;

  public static final String SERIALIZED_NAME_CREATED_AT_LTE = "createdAt_lte";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_LTE)
  private String createdAtLte;

  public static final String SERIALIZED_NAME_CREATED_AT_NOT = "createdAt_not";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_NOT)
  private String createdAtNot;

  public static final String SERIALIZED_NAME_CREATED_AT_NOT_IN = "createdAt_not_in";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_NOT_IN)
  private List<String> createdAtNotIn = null;

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

  public static final String SERIALIZED_NAME_EDGE_GATEWAYS_EVERY = "edge_gateways_every";
  @SerializedName(SERIALIZED_NAME_EDGE_GATEWAYS_EVERY)
  private VirtualPrivateCloudEdgeGatewayWhereInput edgeGatewaysEvery;

  public static final String SERIALIZED_NAME_EDGE_GATEWAYS_NONE = "edge_gateways_none";
  @SerializedName(SERIALIZED_NAME_EDGE_GATEWAYS_NONE)
  private VirtualPrivateCloudEdgeGatewayWhereInput edgeGatewaysNone;

  public static final String SERIALIZED_NAME_EDGE_GATEWAYS_SOME = "edge_gateways_some";
  @SerializedName(SERIALIZED_NAME_EDGE_GATEWAYS_SOME)
  private VirtualPrivateCloudEdgeGatewayWhereInput edgeGatewaysSome;

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

  public static final String SERIALIZED_NAME_EXTERNAL_SUBNET_GROUPS_EVERY = "external_subnet_groups_every";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUPS_EVERY)
  private VirtualPrivateCloudExternalSubnetGroupWhereInput externalSubnetGroupsEvery;

  public static final String SERIALIZED_NAME_EXTERNAL_SUBNET_GROUPS_NONE = "external_subnet_groups_none";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUPS_NONE)
  private VirtualPrivateCloudExternalSubnetGroupWhereInput externalSubnetGroupsNone;

  public static final String SERIALIZED_NAME_EXTERNAL_SUBNET_GROUPS_SOME = "external_subnet_groups_some";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUPS_SOME)
  private VirtualPrivateCloudExternalSubnetGroupWhereInput externalSubnetGroupsSome;

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

  public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID = "primary_edge_gateway_id";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID)
  private String primaryEdgeGatewayId;

  public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_CONTAINS = "primary_edge_gateway_id_contains";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_CONTAINS)
  private String primaryEdgeGatewayIdContains;

  public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_ENDS_WITH = "primary_edge_gateway_id_ends_with";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_ENDS_WITH)
  private String primaryEdgeGatewayIdEndsWith;

  public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_GT = "primary_edge_gateway_id_gt";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_GT)
  private String primaryEdgeGatewayIdGt;

  public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_GTE = "primary_edge_gateway_id_gte";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_GTE)
  private String primaryEdgeGatewayIdGte;

  public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_IN = "primary_edge_gateway_id_in";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_IN)
  private List<String> primaryEdgeGatewayIdIn = null;

  public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_LT = "primary_edge_gateway_id_lt";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_LT)
  private String primaryEdgeGatewayIdLt;

  public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_LTE = "primary_edge_gateway_id_lte";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_LTE)
  private String primaryEdgeGatewayIdLte;

  public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT = "primary_edge_gateway_id_not";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT)
  private String primaryEdgeGatewayIdNot;

  public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_CONTAINS = "primary_edge_gateway_id_not_contains";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_CONTAINS)
  private String primaryEdgeGatewayIdNotContains;

  public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_ENDS_WITH = "primary_edge_gateway_id_not_ends_with";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_ENDS_WITH)
  private String primaryEdgeGatewayIdNotEndsWith;

  public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_IN = "primary_edge_gateway_id_not_in";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_IN)
  private List<String> primaryEdgeGatewayIdNotIn = null;

  public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_STARTS_WITH = "primary_edge_gateway_id_not_starts_with";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_STARTS_WITH)
  private String primaryEdgeGatewayIdNotStartsWith;

  public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_STARTS_WITH = "primary_edge_gateway_id_starts_with";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_STARTS_WITH)
  private String primaryEdgeGatewayIdStartsWith;

  public static final String SERIALIZED_NAME_VPC_SERVICE = "vpc_service";
  @SerializedName(SERIALIZED_NAME_VPC_SERVICE)
  private VirtualPrivateCloudServiceWhereInput vpcService;

  public VirtualPrivateCloudEdgeGatewayGroupWhereInput() { 
  }

  public VirtualPrivateCloudEdgeGatewayGroupWhereInput AND(List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayGroupWhereInput addANDItem(VirtualPrivateCloudEdgeGatewayGroupWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<VirtualPrivateCloudEdgeGatewayGroupWhereInput>();
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

  public List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> AND) {
    this.AND = AND;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput NOT(List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayGroupWhereInput addNOTItem(VirtualPrivateCloudEdgeGatewayGroupWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<VirtualPrivateCloudEdgeGatewayGroupWhereInput>();
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

  public List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> NOT) {
    this.NOT = NOT;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput OR(List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayGroupWhereInput addORItem(VirtualPrivateCloudEdgeGatewayGroupWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<VirtualPrivateCloudEdgeGatewayGroupWhereInput>();
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

  public List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> OR) {
    this.OR = OR;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput createdAtGt(String createdAtGt) {
    
    this.createdAtGt = createdAtGt;
    return this;
  }

   /**
   * Get createdAtGt
   * @return createdAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAtGt() {
    return createdAtGt;
  }


  public void setCreatedAtGt(String createdAtGt) {
    this.createdAtGt = createdAtGt;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput createdAtGte(String createdAtGte) {
    
    this.createdAtGte = createdAtGte;
    return this;
  }

   /**
   * Get createdAtGte
   * @return createdAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAtGte() {
    return createdAtGte;
  }


  public void setCreatedAtGte(String createdAtGte) {
    this.createdAtGte = createdAtGte;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput createdAtIn(List<String> createdAtIn) {
    
    this.createdAtIn = createdAtIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayGroupWhereInput addCreatedAtInItem(String createdAtInItem) {
    if (this.createdAtIn == null) {
      this.createdAtIn = new ArrayList<String>();
    }
    this.createdAtIn.add(createdAtInItem);
    return this;
  }

   /**
   * Get createdAtIn
   * @return createdAtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCreatedAtIn() {
    return createdAtIn;
  }


  public void setCreatedAtIn(List<String> createdAtIn) {
    this.createdAtIn = createdAtIn;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput createdAtLt(String createdAtLt) {
    
    this.createdAtLt = createdAtLt;
    return this;
  }

   /**
   * Get createdAtLt
   * @return createdAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAtLt() {
    return createdAtLt;
  }


  public void setCreatedAtLt(String createdAtLt) {
    this.createdAtLt = createdAtLt;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput createdAtLte(String createdAtLte) {
    
    this.createdAtLte = createdAtLte;
    return this;
  }

   /**
   * Get createdAtLte
   * @return createdAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAtLte() {
    return createdAtLte;
  }


  public void setCreatedAtLte(String createdAtLte) {
    this.createdAtLte = createdAtLte;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput createdAtNot(String createdAtNot) {
    
    this.createdAtNot = createdAtNot;
    return this;
  }

   /**
   * Get createdAtNot
   * @return createdAtNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAtNot() {
    return createdAtNot;
  }


  public void setCreatedAtNot(String createdAtNot) {
    this.createdAtNot = createdAtNot;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput createdAtNotIn(List<String> createdAtNotIn) {
    
    this.createdAtNotIn = createdAtNotIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayGroupWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
    if (this.createdAtNotIn == null) {
      this.createdAtNotIn = new ArrayList<String>();
    }
    this.createdAtNotIn.add(createdAtNotInItem);
    return this;
  }

   /**
   * Get createdAtNotIn
   * @return createdAtNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCreatedAtNotIn() {
    return createdAtNotIn;
  }


  public void setCreatedAtNotIn(List<String> createdAtNotIn) {
    this.createdAtNotIn = createdAtNotIn;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput description(String description) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionContains(String descriptionContains) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionEndsWith(String descriptionEndsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionGt(String descriptionGt) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionGte(String descriptionGte) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionIn(List<String> descriptionIn) {
    
    this.descriptionIn = descriptionIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayGroupWhereInput addDescriptionInItem(String descriptionInItem) {
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionLt(String descriptionLt) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionLte(String descriptionLte) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionNot(String descriptionNot) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionNotContains(String descriptionNotContains) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionNotIn(List<String> descriptionNotIn) {
    
    this.descriptionNotIn = descriptionNotIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayGroupWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionStartsWith(String descriptionStartsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewaysEvery(VirtualPrivateCloudEdgeGatewayWhereInput edgeGatewaysEvery) {
    
    this.edgeGatewaysEvery = edgeGatewaysEvery;
    return this;
  }

   /**
   * Get edgeGatewaysEvery
   * @return edgeGatewaysEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudEdgeGatewayWhereInput getEdgeGatewaysEvery() {
    return edgeGatewaysEvery;
  }


  public void setEdgeGatewaysEvery(VirtualPrivateCloudEdgeGatewayWhereInput edgeGatewaysEvery) {
    this.edgeGatewaysEvery = edgeGatewaysEvery;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewaysNone(VirtualPrivateCloudEdgeGatewayWhereInput edgeGatewaysNone) {
    
    this.edgeGatewaysNone = edgeGatewaysNone;
    return this;
  }

   /**
   * Get edgeGatewaysNone
   * @return edgeGatewaysNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudEdgeGatewayWhereInput getEdgeGatewaysNone() {
    return edgeGatewaysNone;
  }


  public void setEdgeGatewaysNone(VirtualPrivateCloudEdgeGatewayWhereInput edgeGatewaysNone) {
    this.edgeGatewaysNone = edgeGatewaysNone;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewaysSome(VirtualPrivateCloudEdgeGatewayWhereInput edgeGatewaysSome) {
    
    this.edgeGatewaysSome = edgeGatewaysSome;
    return this;
  }

   /**
   * Get edgeGatewaysSome
   * @return edgeGatewaysSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudEdgeGatewayWhereInput getEdgeGatewaysSome() {
    return edgeGatewaysSome;
  }


  public void setEdgeGatewaysSome(VirtualPrivateCloudEdgeGatewayWhereInput edgeGatewaysSome) {
    this.edgeGatewaysSome = edgeGatewaysSome;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayGroupWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayGroupWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput externalSubnetGroupsEvery(VirtualPrivateCloudExternalSubnetGroupWhereInput externalSubnetGroupsEvery) {
    
    this.externalSubnetGroupsEvery = externalSubnetGroupsEvery;
    return this;
  }

   /**
   * Get externalSubnetGroupsEvery
   * @return externalSubnetGroupsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudExternalSubnetGroupWhereInput getExternalSubnetGroupsEvery() {
    return externalSubnetGroupsEvery;
  }


  public void setExternalSubnetGroupsEvery(VirtualPrivateCloudExternalSubnetGroupWhereInput externalSubnetGroupsEvery) {
    this.externalSubnetGroupsEvery = externalSubnetGroupsEvery;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput externalSubnetGroupsNone(VirtualPrivateCloudExternalSubnetGroupWhereInput externalSubnetGroupsNone) {
    
    this.externalSubnetGroupsNone = externalSubnetGroupsNone;
    return this;
  }

   /**
   * Get externalSubnetGroupsNone
   * @return externalSubnetGroupsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudExternalSubnetGroupWhereInput getExternalSubnetGroupsNone() {
    return externalSubnetGroupsNone;
  }


  public void setExternalSubnetGroupsNone(VirtualPrivateCloudExternalSubnetGroupWhereInput externalSubnetGroupsNone) {
    this.externalSubnetGroupsNone = externalSubnetGroupsNone;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput externalSubnetGroupsSome(VirtualPrivateCloudExternalSubnetGroupWhereInput externalSubnetGroupsSome) {
    
    this.externalSubnetGroupsSome = externalSubnetGroupsSome;
    return this;
  }

   /**
   * Get externalSubnetGroupsSome
   * @return externalSubnetGroupsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudExternalSubnetGroupWhereInput getExternalSubnetGroupsSome() {
    return externalSubnetGroupsSome;
  }


  public void setExternalSubnetGroupsSome(VirtualPrivateCloudExternalSubnetGroupWhereInput externalSubnetGroupsSome) {
    this.externalSubnetGroupsSome = externalSubnetGroupsSome;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput id(String id) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput idContains(String idContains) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput idEndsWith(String idEndsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput idGt(String idGt) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput idGte(String idGte) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayGroupWhereInput addIdInItem(String idInItem) {
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput idLt(String idLt) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput idLte(String idLte) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput idNot(String idNot) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput idNotContains(String idNotContains) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayGroupWhereInput addIdNotInItem(String idNotInItem) {
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput idStartsWith(String idStartsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput localId(String localId) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput localIdContains(String localIdContains) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput localIdGt(String localIdGt) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput localIdGte(String localIdGte) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayGroupWhereInput addLocalIdInItem(String localIdInItem) {
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput localIdLt(String localIdLt) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput localIdLte(String localIdLte) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput localIdNot(String localIdNot) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayGroupWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput name(String name) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameContains(String nameContains) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameGt(String nameGt) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameGte(String nameGte) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayGroupWhereInput addNameInItem(String nameInItem) {
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameLt(String nameLt) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameLte(String nameLte) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameNot(String nameNot) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameNotContains(String nameNotContains) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayGroupWhereInput addNameNotInItem(String nameNotInItem) {
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayId(String primaryEdgeGatewayId) {
    
    this.primaryEdgeGatewayId = primaryEdgeGatewayId;
    return this;
  }

   /**
   * Get primaryEdgeGatewayId
   * @return primaryEdgeGatewayId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryEdgeGatewayId() {
    return primaryEdgeGatewayId;
  }


  public void setPrimaryEdgeGatewayId(String primaryEdgeGatewayId) {
    this.primaryEdgeGatewayId = primaryEdgeGatewayId;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdContains(String primaryEdgeGatewayIdContains) {
    
    this.primaryEdgeGatewayIdContains = primaryEdgeGatewayIdContains;
    return this;
  }

   /**
   * Get primaryEdgeGatewayIdContains
   * @return primaryEdgeGatewayIdContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryEdgeGatewayIdContains() {
    return primaryEdgeGatewayIdContains;
  }


  public void setPrimaryEdgeGatewayIdContains(String primaryEdgeGatewayIdContains) {
    this.primaryEdgeGatewayIdContains = primaryEdgeGatewayIdContains;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdEndsWith(String primaryEdgeGatewayIdEndsWith) {
    
    this.primaryEdgeGatewayIdEndsWith = primaryEdgeGatewayIdEndsWith;
    return this;
  }

   /**
   * Get primaryEdgeGatewayIdEndsWith
   * @return primaryEdgeGatewayIdEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryEdgeGatewayIdEndsWith() {
    return primaryEdgeGatewayIdEndsWith;
  }


  public void setPrimaryEdgeGatewayIdEndsWith(String primaryEdgeGatewayIdEndsWith) {
    this.primaryEdgeGatewayIdEndsWith = primaryEdgeGatewayIdEndsWith;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdGt(String primaryEdgeGatewayIdGt) {
    
    this.primaryEdgeGatewayIdGt = primaryEdgeGatewayIdGt;
    return this;
  }

   /**
   * Get primaryEdgeGatewayIdGt
   * @return primaryEdgeGatewayIdGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryEdgeGatewayIdGt() {
    return primaryEdgeGatewayIdGt;
  }


  public void setPrimaryEdgeGatewayIdGt(String primaryEdgeGatewayIdGt) {
    this.primaryEdgeGatewayIdGt = primaryEdgeGatewayIdGt;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdGte(String primaryEdgeGatewayIdGte) {
    
    this.primaryEdgeGatewayIdGte = primaryEdgeGatewayIdGte;
    return this;
  }

   /**
   * Get primaryEdgeGatewayIdGte
   * @return primaryEdgeGatewayIdGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryEdgeGatewayIdGte() {
    return primaryEdgeGatewayIdGte;
  }


  public void setPrimaryEdgeGatewayIdGte(String primaryEdgeGatewayIdGte) {
    this.primaryEdgeGatewayIdGte = primaryEdgeGatewayIdGte;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdIn(List<String> primaryEdgeGatewayIdIn) {
    
    this.primaryEdgeGatewayIdIn = primaryEdgeGatewayIdIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayGroupWhereInput addPrimaryEdgeGatewayIdInItem(String primaryEdgeGatewayIdInItem) {
    if (this.primaryEdgeGatewayIdIn == null) {
      this.primaryEdgeGatewayIdIn = new ArrayList<String>();
    }
    this.primaryEdgeGatewayIdIn.add(primaryEdgeGatewayIdInItem);
    return this;
  }

   /**
   * Get primaryEdgeGatewayIdIn
   * @return primaryEdgeGatewayIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPrimaryEdgeGatewayIdIn() {
    return primaryEdgeGatewayIdIn;
  }


  public void setPrimaryEdgeGatewayIdIn(List<String> primaryEdgeGatewayIdIn) {
    this.primaryEdgeGatewayIdIn = primaryEdgeGatewayIdIn;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdLt(String primaryEdgeGatewayIdLt) {
    
    this.primaryEdgeGatewayIdLt = primaryEdgeGatewayIdLt;
    return this;
  }

   /**
   * Get primaryEdgeGatewayIdLt
   * @return primaryEdgeGatewayIdLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryEdgeGatewayIdLt() {
    return primaryEdgeGatewayIdLt;
  }


  public void setPrimaryEdgeGatewayIdLt(String primaryEdgeGatewayIdLt) {
    this.primaryEdgeGatewayIdLt = primaryEdgeGatewayIdLt;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdLte(String primaryEdgeGatewayIdLte) {
    
    this.primaryEdgeGatewayIdLte = primaryEdgeGatewayIdLte;
    return this;
  }

   /**
   * Get primaryEdgeGatewayIdLte
   * @return primaryEdgeGatewayIdLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryEdgeGatewayIdLte() {
    return primaryEdgeGatewayIdLte;
  }


  public void setPrimaryEdgeGatewayIdLte(String primaryEdgeGatewayIdLte) {
    this.primaryEdgeGatewayIdLte = primaryEdgeGatewayIdLte;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdNot(String primaryEdgeGatewayIdNot) {
    
    this.primaryEdgeGatewayIdNot = primaryEdgeGatewayIdNot;
    return this;
  }

   /**
   * Get primaryEdgeGatewayIdNot
   * @return primaryEdgeGatewayIdNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryEdgeGatewayIdNot() {
    return primaryEdgeGatewayIdNot;
  }


  public void setPrimaryEdgeGatewayIdNot(String primaryEdgeGatewayIdNot) {
    this.primaryEdgeGatewayIdNot = primaryEdgeGatewayIdNot;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdNotContains(String primaryEdgeGatewayIdNotContains) {
    
    this.primaryEdgeGatewayIdNotContains = primaryEdgeGatewayIdNotContains;
    return this;
  }

   /**
   * Get primaryEdgeGatewayIdNotContains
   * @return primaryEdgeGatewayIdNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryEdgeGatewayIdNotContains() {
    return primaryEdgeGatewayIdNotContains;
  }


  public void setPrimaryEdgeGatewayIdNotContains(String primaryEdgeGatewayIdNotContains) {
    this.primaryEdgeGatewayIdNotContains = primaryEdgeGatewayIdNotContains;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdNotEndsWith(String primaryEdgeGatewayIdNotEndsWith) {
    
    this.primaryEdgeGatewayIdNotEndsWith = primaryEdgeGatewayIdNotEndsWith;
    return this;
  }

   /**
   * Get primaryEdgeGatewayIdNotEndsWith
   * @return primaryEdgeGatewayIdNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryEdgeGatewayIdNotEndsWith() {
    return primaryEdgeGatewayIdNotEndsWith;
  }


  public void setPrimaryEdgeGatewayIdNotEndsWith(String primaryEdgeGatewayIdNotEndsWith) {
    this.primaryEdgeGatewayIdNotEndsWith = primaryEdgeGatewayIdNotEndsWith;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdNotIn(List<String> primaryEdgeGatewayIdNotIn) {
    
    this.primaryEdgeGatewayIdNotIn = primaryEdgeGatewayIdNotIn;
    return this;
  }

  public VirtualPrivateCloudEdgeGatewayGroupWhereInput addPrimaryEdgeGatewayIdNotInItem(String primaryEdgeGatewayIdNotInItem) {
    if (this.primaryEdgeGatewayIdNotIn == null) {
      this.primaryEdgeGatewayIdNotIn = new ArrayList<String>();
    }
    this.primaryEdgeGatewayIdNotIn.add(primaryEdgeGatewayIdNotInItem);
    return this;
  }

   /**
   * Get primaryEdgeGatewayIdNotIn
   * @return primaryEdgeGatewayIdNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPrimaryEdgeGatewayIdNotIn() {
    return primaryEdgeGatewayIdNotIn;
  }


  public void setPrimaryEdgeGatewayIdNotIn(List<String> primaryEdgeGatewayIdNotIn) {
    this.primaryEdgeGatewayIdNotIn = primaryEdgeGatewayIdNotIn;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdNotStartsWith(String primaryEdgeGatewayIdNotStartsWith) {
    
    this.primaryEdgeGatewayIdNotStartsWith = primaryEdgeGatewayIdNotStartsWith;
    return this;
  }

   /**
   * Get primaryEdgeGatewayIdNotStartsWith
   * @return primaryEdgeGatewayIdNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryEdgeGatewayIdNotStartsWith() {
    return primaryEdgeGatewayIdNotStartsWith;
  }


  public void setPrimaryEdgeGatewayIdNotStartsWith(String primaryEdgeGatewayIdNotStartsWith) {
    this.primaryEdgeGatewayIdNotStartsWith = primaryEdgeGatewayIdNotStartsWith;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdStartsWith(String primaryEdgeGatewayIdStartsWith) {
    
    this.primaryEdgeGatewayIdStartsWith = primaryEdgeGatewayIdStartsWith;
    return this;
  }

   /**
   * Get primaryEdgeGatewayIdStartsWith
   * @return primaryEdgeGatewayIdStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryEdgeGatewayIdStartsWith() {
    return primaryEdgeGatewayIdStartsWith;
  }


  public void setPrimaryEdgeGatewayIdStartsWith(String primaryEdgeGatewayIdStartsWith) {
    this.primaryEdgeGatewayIdStartsWith = primaryEdgeGatewayIdStartsWith;
  }


  public VirtualPrivateCloudEdgeGatewayGroupWhereInput vpcService(VirtualPrivateCloudServiceWhereInput vpcService) {
    
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
    VirtualPrivateCloudEdgeGatewayGroupWhereInput virtualPrivateCloudEdgeGatewayGroupWhereInput = (VirtualPrivateCloudEdgeGatewayGroupWhereInput) o;
    return Objects.equals(this.AND, virtualPrivateCloudEdgeGatewayGroupWhereInput.AND) &&
        Objects.equals(this.NOT, virtualPrivateCloudEdgeGatewayGroupWhereInput.NOT) &&
        Objects.equals(this.OR, virtualPrivateCloudEdgeGatewayGroupWhereInput.OR) &&
        Objects.equals(this.createdAt, virtualPrivateCloudEdgeGatewayGroupWhereInput.createdAt) &&
        Objects.equals(this.createdAtGt, virtualPrivateCloudEdgeGatewayGroupWhereInput.createdAtGt) &&
        Objects.equals(this.createdAtGte, virtualPrivateCloudEdgeGatewayGroupWhereInput.createdAtGte) &&
        Objects.equals(this.createdAtIn, virtualPrivateCloudEdgeGatewayGroupWhereInput.createdAtIn) &&
        Objects.equals(this.createdAtLt, virtualPrivateCloudEdgeGatewayGroupWhereInput.createdAtLt) &&
        Objects.equals(this.createdAtLte, virtualPrivateCloudEdgeGatewayGroupWhereInput.createdAtLte) &&
        Objects.equals(this.createdAtNot, virtualPrivateCloudEdgeGatewayGroupWhereInput.createdAtNot) &&
        Objects.equals(this.createdAtNotIn, virtualPrivateCloudEdgeGatewayGroupWhereInput.createdAtNotIn) &&
        Objects.equals(this.description, virtualPrivateCloudEdgeGatewayGroupWhereInput.description) &&
        Objects.equals(this.descriptionContains, virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionContains) &&
        Objects.equals(this.descriptionEndsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionEndsWith) &&
        Objects.equals(this.descriptionGt, virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionGt) &&
        Objects.equals(this.descriptionGte, virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionGte) &&
        Objects.equals(this.descriptionIn, virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionIn) &&
        Objects.equals(this.descriptionLt, virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionLt) &&
        Objects.equals(this.descriptionLte, virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionLte) &&
        Objects.equals(this.descriptionNot, virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionNot) &&
        Objects.equals(this.descriptionNotContains, virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionNotContains) &&
        Objects.equals(this.descriptionNotEndsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionNotEndsWith) &&
        Objects.equals(this.descriptionNotIn, virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionNotIn) &&
        Objects.equals(this.descriptionNotStartsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionNotStartsWith) &&
        Objects.equals(this.descriptionStartsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionStartsWith) &&
        Objects.equals(this.edgeGatewaysEvery, virtualPrivateCloudEdgeGatewayGroupWhereInput.edgeGatewaysEvery) &&
        Objects.equals(this.edgeGatewaysNone, virtualPrivateCloudEdgeGatewayGroupWhereInput.edgeGatewaysNone) &&
        Objects.equals(this.edgeGatewaysSome, virtualPrivateCloudEdgeGatewayGroupWhereInput.edgeGatewaysSome) &&
        Objects.equals(this.entityAsyncStatus, virtualPrivateCloudEdgeGatewayGroupWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, virtualPrivateCloudEdgeGatewayGroupWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, virtualPrivateCloudEdgeGatewayGroupWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, virtualPrivateCloudEdgeGatewayGroupWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.externalSubnetGroupsEvery, virtualPrivateCloudEdgeGatewayGroupWhereInput.externalSubnetGroupsEvery) &&
        Objects.equals(this.externalSubnetGroupsNone, virtualPrivateCloudEdgeGatewayGroupWhereInput.externalSubnetGroupsNone) &&
        Objects.equals(this.externalSubnetGroupsSome, virtualPrivateCloudEdgeGatewayGroupWhereInput.externalSubnetGroupsSome) &&
        Objects.equals(this.id, virtualPrivateCloudEdgeGatewayGroupWhereInput.id) &&
        Objects.equals(this.idContains, virtualPrivateCloudEdgeGatewayGroupWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, virtualPrivateCloudEdgeGatewayGroupWhereInput.idGt) &&
        Objects.equals(this.idGte, virtualPrivateCloudEdgeGatewayGroupWhereInput.idGte) &&
        Objects.equals(this.idIn, virtualPrivateCloudEdgeGatewayGroupWhereInput.idIn) &&
        Objects.equals(this.idLt, virtualPrivateCloudEdgeGatewayGroupWhereInput.idLt) &&
        Objects.equals(this.idLte, virtualPrivateCloudEdgeGatewayGroupWhereInput.idLte) &&
        Objects.equals(this.idNot, virtualPrivateCloudEdgeGatewayGroupWhereInput.idNot) &&
        Objects.equals(this.idNotContains, virtualPrivateCloudEdgeGatewayGroupWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, virtualPrivateCloudEdgeGatewayGroupWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.idStartsWith) &&
        Objects.equals(this.localId, virtualPrivateCloudEdgeGatewayGroupWhereInput.localId) &&
        Objects.equals(this.localIdContains, virtualPrivateCloudEdgeGatewayGroupWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, virtualPrivateCloudEdgeGatewayGroupWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, virtualPrivateCloudEdgeGatewayGroupWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, virtualPrivateCloudEdgeGatewayGroupWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, virtualPrivateCloudEdgeGatewayGroupWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, virtualPrivateCloudEdgeGatewayGroupWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, virtualPrivateCloudEdgeGatewayGroupWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, virtualPrivateCloudEdgeGatewayGroupWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, virtualPrivateCloudEdgeGatewayGroupWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.localIdStartsWith) &&
        Objects.equals(this.name, virtualPrivateCloudEdgeGatewayGroupWhereInput.name) &&
        Objects.equals(this.nameContains, virtualPrivateCloudEdgeGatewayGroupWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, virtualPrivateCloudEdgeGatewayGroupWhereInput.nameGt) &&
        Objects.equals(this.nameGte, virtualPrivateCloudEdgeGatewayGroupWhereInput.nameGte) &&
        Objects.equals(this.nameIn, virtualPrivateCloudEdgeGatewayGroupWhereInput.nameIn) &&
        Objects.equals(this.nameLt, virtualPrivateCloudEdgeGatewayGroupWhereInput.nameLt) &&
        Objects.equals(this.nameLte, virtualPrivateCloudEdgeGatewayGroupWhereInput.nameLte) &&
        Objects.equals(this.nameNot, virtualPrivateCloudEdgeGatewayGroupWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, virtualPrivateCloudEdgeGatewayGroupWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, virtualPrivateCloudEdgeGatewayGroupWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.nameStartsWith) &&
        Objects.equals(this.primaryEdgeGatewayId, virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayId) &&
        Objects.equals(this.primaryEdgeGatewayIdContains, virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdContains) &&
        Objects.equals(this.primaryEdgeGatewayIdEndsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdEndsWith) &&
        Objects.equals(this.primaryEdgeGatewayIdGt, virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdGt) &&
        Objects.equals(this.primaryEdgeGatewayIdGte, virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdGte) &&
        Objects.equals(this.primaryEdgeGatewayIdIn, virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdIn) &&
        Objects.equals(this.primaryEdgeGatewayIdLt, virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdLt) &&
        Objects.equals(this.primaryEdgeGatewayIdLte, virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdLte) &&
        Objects.equals(this.primaryEdgeGatewayIdNot, virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdNot) &&
        Objects.equals(this.primaryEdgeGatewayIdNotContains, virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdNotContains) &&
        Objects.equals(this.primaryEdgeGatewayIdNotEndsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdNotEndsWith) &&
        Objects.equals(this.primaryEdgeGatewayIdNotIn, virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdNotIn) &&
        Objects.equals(this.primaryEdgeGatewayIdNotStartsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdNotStartsWith) &&
        Objects.equals(this.primaryEdgeGatewayIdStartsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdStartsWith) &&
        Objects.equals(this.vpcService, virtualPrivateCloudEdgeGatewayGroupWhereInput.vpcService);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, createdAt, createdAtGt, createdAtGte, createdAtIn, createdAtLt, createdAtLte, createdAtNot, createdAtNotIn, description, descriptionContains, descriptionEndsWith, descriptionGt, descriptionGte, descriptionIn, descriptionLt, descriptionLte, descriptionNot, descriptionNotContains, descriptionNotEndsWith, descriptionNotIn, descriptionNotStartsWith, descriptionStartsWith, edgeGatewaysEvery, edgeGatewaysNone, edgeGatewaysSome, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, externalSubnetGroupsEvery, externalSubnetGroupsNone, externalSubnetGroupsSome, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, primaryEdgeGatewayId, primaryEdgeGatewayIdContains, primaryEdgeGatewayIdEndsWith, primaryEdgeGatewayIdGt, primaryEdgeGatewayIdGte, primaryEdgeGatewayIdIn, primaryEdgeGatewayIdLt, primaryEdgeGatewayIdLte, primaryEdgeGatewayIdNot, primaryEdgeGatewayIdNotContains, primaryEdgeGatewayIdNotEndsWith, primaryEdgeGatewayIdNotIn, primaryEdgeGatewayIdNotStartsWith, primaryEdgeGatewayIdStartsWith, vpcService);
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
    sb.append("class VirtualPrivateCloudEdgeGatewayGroupWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdAtGt: ").append(toIndentedString(createdAtGt)).append("\n");
    sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
    sb.append("    createdAtIn: ").append(toIndentedString(createdAtIn)).append("\n");
    sb.append("    createdAtLt: ").append(toIndentedString(createdAtLt)).append("\n");
    sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
    sb.append("    createdAtNot: ").append(toIndentedString(createdAtNot)).append("\n");
    sb.append("    createdAtNotIn: ").append(toIndentedString(createdAtNotIn)).append("\n");
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
    sb.append("    edgeGatewaysEvery: ").append(toIndentedString(edgeGatewaysEvery)).append("\n");
    sb.append("    edgeGatewaysNone: ").append(toIndentedString(edgeGatewaysNone)).append("\n");
    sb.append("    edgeGatewaysSome: ").append(toIndentedString(edgeGatewaysSome)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    entityAsyncStatusIn: ").append(toIndentedString(entityAsyncStatusIn)).append("\n");
    sb.append("    entityAsyncStatusNot: ").append(toIndentedString(entityAsyncStatusNot)).append("\n");
    sb.append("    entityAsyncStatusNotIn: ").append(toIndentedString(entityAsyncStatusNotIn)).append("\n");
    sb.append("    externalSubnetGroupsEvery: ").append(toIndentedString(externalSubnetGroupsEvery)).append("\n");
    sb.append("    externalSubnetGroupsNone: ").append(toIndentedString(externalSubnetGroupsNone)).append("\n");
    sb.append("    externalSubnetGroupsSome: ").append(toIndentedString(externalSubnetGroupsSome)).append("\n");
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
    sb.append("    primaryEdgeGatewayId: ").append(toIndentedString(primaryEdgeGatewayId)).append("\n");
    sb.append("    primaryEdgeGatewayIdContains: ").append(toIndentedString(primaryEdgeGatewayIdContains)).append("\n");
    sb.append("    primaryEdgeGatewayIdEndsWith: ").append(toIndentedString(primaryEdgeGatewayIdEndsWith)).append("\n");
    sb.append("    primaryEdgeGatewayIdGt: ").append(toIndentedString(primaryEdgeGatewayIdGt)).append("\n");
    sb.append("    primaryEdgeGatewayIdGte: ").append(toIndentedString(primaryEdgeGatewayIdGte)).append("\n");
    sb.append("    primaryEdgeGatewayIdIn: ").append(toIndentedString(primaryEdgeGatewayIdIn)).append("\n");
    sb.append("    primaryEdgeGatewayIdLt: ").append(toIndentedString(primaryEdgeGatewayIdLt)).append("\n");
    sb.append("    primaryEdgeGatewayIdLte: ").append(toIndentedString(primaryEdgeGatewayIdLte)).append("\n");
    sb.append("    primaryEdgeGatewayIdNot: ").append(toIndentedString(primaryEdgeGatewayIdNot)).append("\n");
    sb.append("    primaryEdgeGatewayIdNotContains: ").append(toIndentedString(primaryEdgeGatewayIdNotContains)).append("\n");
    sb.append("    primaryEdgeGatewayIdNotEndsWith: ").append(toIndentedString(primaryEdgeGatewayIdNotEndsWith)).append("\n");
    sb.append("    primaryEdgeGatewayIdNotIn: ").append(toIndentedString(primaryEdgeGatewayIdNotIn)).append("\n");
    sb.append("    primaryEdgeGatewayIdNotStartsWith: ").append(toIndentedString(primaryEdgeGatewayIdNotStartsWith)).append("\n");
    sb.append("    primaryEdgeGatewayIdStartsWith: ").append(toIndentedString(primaryEdgeGatewayIdStartsWith)).append("\n");
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

