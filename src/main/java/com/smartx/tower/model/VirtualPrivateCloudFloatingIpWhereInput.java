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
import com.smartx.tower.model.VirtualPrivateCloudNicWhereInput;
import com.smartx.tower.model.VirtualPrivateCloudWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VirtualPrivateCloudFloatingIpWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VirtualPrivateCloudFloatingIpWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<VirtualPrivateCloudFloatingIpWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<VirtualPrivateCloudFloatingIpWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<VirtualPrivateCloudFloatingIpWhereInput> OR = null;

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

  public static final String SERIALIZED_NAME_VPC = "vpc";
  @SerializedName(SERIALIZED_NAME_VPC)
  private VirtualPrivateCloudWhereInput vpc;

  public static final String SERIALIZED_NAME_VPC_NIC = "vpc_nic";
  @SerializedName(SERIALIZED_NAME_VPC_NIC)
  private VirtualPrivateCloudNicWhereInput vpcNic;

  public VirtualPrivateCloudFloatingIpWhereInput() { 
  }

  public VirtualPrivateCloudFloatingIpWhereInput AND(List<VirtualPrivateCloudFloatingIpWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public VirtualPrivateCloudFloatingIpWhereInput addANDItem(VirtualPrivateCloudFloatingIpWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<VirtualPrivateCloudFloatingIpWhereInput>();
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

  public List<VirtualPrivateCloudFloatingIpWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<VirtualPrivateCloudFloatingIpWhereInput> AND) {
    this.AND = AND;
  }


  public VirtualPrivateCloudFloatingIpWhereInput NOT(List<VirtualPrivateCloudFloatingIpWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public VirtualPrivateCloudFloatingIpWhereInput addNOTItem(VirtualPrivateCloudFloatingIpWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<VirtualPrivateCloudFloatingIpWhereInput>();
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

  public List<VirtualPrivateCloudFloatingIpWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<VirtualPrivateCloudFloatingIpWhereInput> NOT) {
    this.NOT = NOT;
  }


  public VirtualPrivateCloudFloatingIpWhereInput OR(List<VirtualPrivateCloudFloatingIpWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public VirtualPrivateCloudFloatingIpWhereInput addORItem(VirtualPrivateCloudFloatingIpWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<VirtualPrivateCloudFloatingIpWhereInput>();
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

  public List<VirtualPrivateCloudFloatingIpWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<VirtualPrivateCloudFloatingIpWhereInput> OR) {
    this.OR = OR;
  }


  public VirtualPrivateCloudFloatingIpWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public VirtualPrivateCloudFloatingIpWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public VirtualPrivateCloudFloatingIpWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public VirtualPrivateCloudFloatingIpWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public VirtualPrivateCloudFloatingIpWhereInput externalIp(String externalIp) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput externalIpContains(String externalIpContains) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput externalIpEndsWith(String externalIpEndsWith) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput externalIpGt(String externalIpGt) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput externalIpGte(String externalIpGte) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput externalIpIn(List<String> externalIpIn) {
    
    this.externalIpIn = externalIpIn;
    return this;
  }

  public VirtualPrivateCloudFloatingIpWhereInput addExternalIpInItem(String externalIpInItem) {
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


  public VirtualPrivateCloudFloatingIpWhereInput externalIpLt(String externalIpLt) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput externalIpLte(String externalIpLte) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput externalIpNot(String externalIpNot) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput externalIpNotContains(String externalIpNotContains) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput externalIpNotEndsWith(String externalIpNotEndsWith) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput externalIpNotIn(List<String> externalIpNotIn) {
    
    this.externalIpNotIn = externalIpNotIn;
    return this;
  }

  public VirtualPrivateCloudFloatingIpWhereInput addExternalIpNotInItem(String externalIpNotInItem) {
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


  public VirtualPrivateCloudFloatingIpWhereInput externalIpNotStartsWith(String externalIpNotStartsWith) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput externalIpStartsWith(String externalIpStartsWith) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput externalSubnet(VirtualPrivateCloudExternalSubnetWhereInput externalSubnet) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput id(String id) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput idContains(String idContains) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput idEndsWith(String idEndsWith) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput idGt(String idGt) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput idGte(String idGte) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public VirtualPrivateCloudFloatingIpWhereInput addIdInItem(String idInItem) {
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


  public VirtualPrivateCloudFloatingIpWhereInput idLt(String idLt) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput idLte(String idLte) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput idNot(String idNot) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput idNotContains(String idNotContains) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public VirtualPrivateCloudFloatingIpWhereInput addIdNotInItem(String idNotInItem) {
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


  public VirtualPrivateCloudFloatingIpWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput idStartsWith(String idStartsWith) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput localId(String localId) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput localIdContains(String localIdContains) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput localIdGt(String localIdGt) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput localIdGte(String localIdGte) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public VirtualPrivateCloudFloatingIpWhereInput addLocalIdInItem(String localIdInItem) {
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


  public VirtualPrivateCloudFloatingIpWhereInput localIdLt(String localIdLt) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput localIdLte(String localIdLte) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput localIdNot(String localIdNot) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public VirtualPrivateCloudFloatingIpWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public VirtualPrivateCloudFloatingIpWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput vpc(VirtualPrivateCloudWhereInput vpc) {
    
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


  public VirtualPrivateCloudFloatingIpWhereInput vpcNic(VirtualPrivateCloudNicWhereInput vpcNic) {
    
    this.vpcNic = vpcNic;
    return this;
  }

   /**
   * Get vpcNic
   * @return vpcNic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudNicWhereInput getVpcNic() {
    return vpcNic;
  }


  public void setVpcNic(VirtualPrivateCloudNicWhereInput vpcNic) {
    this.vpcNic = vpcNic;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualPrivateCloudFloatingIpWhereInput virtualPrivateCloudFloatingIpWhereInput = (VirtualPrivateCloudFloatingIpWhereInput) o;
    return Objects.equals(this.AND, virtualPrivateCloudFloatingIpWhereInput.AND) &&
        Objects.equals(this.NOT, virtualPrivateCloudFloatingIpWhereInput.NOT) &&
        Objects.equals(this.OR, virtualPrivateCloudFloatingIpWhereInput.OR) &&
        Objects.equals(this.entityAsyncStatus, virtualPrivateCloudFloatingIpWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, virtualPrivateCloudFloatingIpWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, virtualPrivateCloudFloatingIpWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, virtualPrivateCloudFloatingIpWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.externalIp, virtualPrivateCloudFloatingIpWhereInput.externalIp) &&
        Objects.equals(this.externalIpContains, virtualPrivateCloudFloatingIpWhereInput.externalIpContains) &&
        Objects.equals(this.externalIpEndsWith, virtualPrivateCloudFloatingIpWhereInput.externalIpEndsWith) &&
        Objects.equals(this.externalIpGt, virtualPrivateCloudFloatingIpWhereInput.externalIpGt) &&
        Objects.equals(this.externalIpGte, virtualPrivateCloudFloatingIpWhereInput.externalIpGte) &&
        Objects.equals(this.externalIpIn, virtualPrivateCloudFloatingIpWhereInput.externalIpIn) &&
        Objects.equals(this.externalIpLt, virtualPrivateCloudFloatingIpWhereInput.externalIpLt) &&
        Objects.equals(this.externalIpLte, virtualPrivateCloudFloatingIpWhereInput.externalIpLte) &&
        Objects.equals(this.externalIpNot, virtualPrivateCloudFloatingIpWhereInput.externalIpNot) &&
        Objects.equals(this.externalIpNotContains, virtualPrivateCloudFloatingIpWhereInput.externalIpNotContains) &&
        Objects.equals(this.externalIpNotEndsWith, virtualPrivateCloudFloatingIpWhereInput.externalIpNotEndsWith) &&
        Objects.equals(this.externalIpNotIn, virtualPrivateCloudFloatingIpWhereInput.externalIpNotIn) &&
        Objects.equals(this.externalIpNotStartsWith, virtualPrivateCloudFloatingIpWhereInput.externalIpNotStartsWith) &&
        Objects.equals(this.externalIpStartsWith, virtualPrivateCloudFloatingIpWhereInput.externalIpStartsWith) &&
        Objects.equals(this.externalSubnet, virtualPrivateCloudFloatingIpWhereInput.externalSubnet) &&
        Objects.equals(this.id, virtualPrivateCloudFloatingIpWhereInput.id) &&
        Objects.equals(this.idContains, virtualPrivateCloudFloatingIpWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, virtualPrivateCloudFloatingIpWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, virtualPrivateCloudFloatingIpWhereInput.idGt) &&
        Objects.equals(this.idGte, virtualPrivateCloudFloatingIpWhereInput.idGte) &&
        Objects.equals(this.idIn, virtualPrivateCloudFloatingIpWhereInput.idIn) &&
        Objects.equals(this.idLt, virtualPrivateCloudFloatingIpWhereInput.idLt) &&
        Objects.equals(this.idLte, virtualPrivateCloudFloatingIpWhereInput.idLte) &&
        Objects.equals(this.idNot, virtualPrivateCloudFloatingIpWhereInput.idNot) &&
        Objects.equals(this.idNotContains, virtualPrivateCloudFloatingIpWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, virtualPrivateCloudFloatingIpWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, virtualPrivateCloudFloatingIpWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, virtualPrivateCloudFloatingIpWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, virtualPrivateCloudFloatingIpWhereInput.idStartsWith) &&
        Objects.equals(this.localId, virtualPrivateCloudFloatingIpWhereInput.localId) &&
        Objects.equals(this.localIdContains, virtualPrivateCloudFloatingIpWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, virtualPrivateCloudFloatingIpWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, virtualPrivateCloudFloatingIpWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, virtualPrivateCloudFloatingIpWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, virtualPrivateCloudFloatingIpWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, virtualPrivateCloudFloatingIpWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, virtualPrivateCloudFloatingIpWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, virtualPrivateCloudFloatingIpWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, virtualPrivateCloudFloatingIpWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, virtualPrivateCloudFloatingIpWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, virtualPrivateCloudFloatingIpWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, virtualPrivateCloudFloatingIpWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, virtualPrivateCloudFloatingIpWhereInput.localIdStartsWith) &&
        Objects.equals(this.vpc, virtualPrivateCloudFloatingIpWhereInput.vpc) &&
        Objects.equals(this.vpcNic, virtualPrivateCloudFloatingIpWhereInput.vpcNic);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, externalIp, externalIpContains, externalIpEndsWith, externalIpGt, externalIpGte, externalIpIn, externalIpLt, externalIpLte, externalIpNot, externalIpNotContains, externalIpNotEndsWith, externalIpNotIn, externalIpNotStartsWith, externalIpStartsWith, externalSubnet, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, vpc, vpcNic);
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
    sb.append("class VirtualPrivateCloudFloatingIpWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
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
    sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
    sb.append("    vpcNic: ").append(toIndentedString(vpcNic)).append("\n");
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

