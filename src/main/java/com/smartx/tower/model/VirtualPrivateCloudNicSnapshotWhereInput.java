package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.VirtualPrivateCloudFloatingIpWhereInput;
import com.smartx.tower.model.VirtualPrivateCloudNicWhereInput;
import com.smartx.tower.model.VirtualPrivateCloudSubnetWhereInput;
import com.smartx.tower.model.VirtualPrivateCloudWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VirtualPrivateCloudNicSnapshotWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VirtualPrivateCloudNicSnapshotWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<VirtualPrivateCloudNicSnapshotWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<VirtualPrivateCloudNicSnapshotWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<VirtualPrivateCloudNicSnapshotWhereInput> OR = null;

  public static final String SERIALIZED_NAME_FLOATING_IP = "floating_ip";
  @SerializedName(SERIALIZED_NAME_FLOATING_IP)
  private VirtualPrivateCloudFloatingIpWhereInput floatingIp;

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

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "mac_address";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_CONTAINS = "mac_address_contains";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_CONTAINS)
  private String macAddressContains;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_ENDS_WITH = "mac_address_ends_with";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_ENDS_WITH)
  private String macAddressEndsWith;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_GT = "mac_address_gt";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_GT)
  private String macAddressGt;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_GTE = "mac_address_gte";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_GTE)
  private String macAddressGte;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_IN = "mac_address_in";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_IN)
  private List<String> macAddressIn = null;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_LT = "mac_address_lt";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_LT)
  private String macAddressLt;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_LTE = "mac_address_lte";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_LTE)
  private String macAddressLte;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_NOT = "mac_address_not";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_NOT)
  private String macAddressNot;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_NOT_CONTAINS = "mac_address_not_contains";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_NOT_CONTAINS)
  private String macAddressNotContains;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_NOT_ENDS_WITH = "mac_address_not_ends_with";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_NOT_ENDS_WITH)
  private String macAddressNotEndsWith;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_NOT_IN = "mac_address_not_in";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_NOT_IN)
  private List<String> macAddressNotIn = null;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_NOT_STARTS_WITH = "mac_address_not_starts_with";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_NOT_STARTS_WITH)
  private String macAddressNotStartsWith;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_STARTS_WITH = "mac_address_starts_with";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_STARTS_WITH)
  private String macAddressStartsWith;

  public static final String SERIALIZED_NAME_VPC = "vpc";
  @SerializedName(SERIALIZED_NAME_VPC)
  private VirtualPrivateCloudWhereInput vpc;

  public static final String SERIALIZED_NAME_VPC_NIC = "vpc_nic";
  @SerializedName(SERIALIZED_NAME_VPC_NIC)
  private VirtualPrivateCloudNicWhereInput vpcNic;

  public static final String SERIALIZED_NAME_VPC_SUBNET = "vpc_subnet";
  @SerializedName(SERIALIZED_NAME_VPC_SUBNET)
  private VirtualPrivateCloudSubnetWhereInput vpcSubnet;

  public VirtualPrivateCloudNicSnapshotWhereInput() { 
  }

  public VirtualPrivateCloudNicSnapshotWhereInput AND(List<VirtualPrivateCloudNicSnapshotWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public VirtualPrivateCloudNicSnapshotWhereInput addANDItem(VirtualPrivateCloudNicSnapshotWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<VirtualPrivateCloudNicSnapshotWhereInput>();
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

  public List<VirtualPrivateCloudNicSnapshotWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<VirtualPrivateCloudNicSnapshotWhereInput> AND) {
    this.AND = AND;
  }


  public VirtualPrivateCloudNicSnapshotWhereInput NOT(List<VirtualPrivateCloudNicSnapshotWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public VirtualPrivateCloudNicSnapshotWhereInput addNOTItem(VirtualPrivateCloudNicSnapshotWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<VirtualPrivateCloudNicSnapshotWhereInput>();
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

  public List<VirtualPrivateCloudNicSnapshotWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<VirtualPrivateCloudNicSnapshotWhereInput> NOT) {
    this.NOT = NOT;
  }


  public VirtualPrivateCloudNicSnapshotWhereInput OR(List<VirtualPrivateCloudNicSnapshotWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public VirtualPrivateCloudNicSnapshotWhereInput addORItem(VirtualPrivateCloudNicSnapshotWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<VirtualPrivateCloudNicSnapshotWhereInput>();
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

  public List<VirtualPrivateCloudNicSnapshotWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<VirtualPrivateCloudNicSnapshotWhereInput> OR) {
    this.OR = OR;
  }


  public VirtualPrivateCloudNicSnapshotWhereInput floatingIp(VirtualPrivateCloudFloatingIpWhereInput floatingIp) {
    
    this.floatingIp = floatingIp;
    return this;
  }

   /**
   * Get floatingIp
   * @return floatingIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudFloatingIpWhereInput getFloatingIp() {
    return floatingIp;
  }


  public void setFloatingIp(VirtualPrivateCloudFloatingIpWhereInput floatingIp) {
    this.floatingIp = floatingIp;
  }


  public VirtualPrivateCloudNicSnapshotWhereInput id(String id) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput idContains(String idContains) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput idEndsWith(String idEndsWith) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput idGt(String idGt) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput idGte(String idGte) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public VirtualPrivateCloudNicSnapshotWhereInput addIdInItem(String idInItem) {
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


  public VirtualPrivateCloudNicSnapshotWhereInput idLt(String idLt) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput idLte(String idLte) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput idNot(String idNot) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput idNotContains(String idNotContains) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public VirtualPrivateCloudNicSnapshotWhereInput addIdNotInItem(String idNotInItem) {
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


  public VirtualPrivateCloudNicSnapshotWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput idStartsWith(String idStartsWith) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput localId(String localId) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput localIdContains(String localIdContains) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput localIdGt(String localIdGt) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput localIdGte(String localIdGte) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public VirtualPrivateCloudNicSnapshotWhereInput addLocalIdInItem(String localIdInItem) {
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


  public VirtualPrivateCloudNicSnapshotWhereInput localIdLt(String localIdLt) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput localIdLte(String localIdLte) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput localIdNot(String localIdNot) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public VirtualPrivateCloudNicSnapshotWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public VirtualPrivateCloudNicSnapshotWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput macAddress(String macAddress) {
    
    this.macAddress = macAddress;
    return this;
  }

   /**
   * Get macAddress
   * @return macAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddress() {
    return macAddress;
  }


  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }


  public VirtualPrivateCloudNicSnapshotWhereInput macAddressContains(String macAddressContains) {
    
    this.macAddressContains = macAddressContains;
    return this;
  }

   /**
   * Get macAddressContains
   * @return macAddressContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressContains() {
    return macAddressContains;
  }


  public void setMacAddressContains(String macAddressContains) {
    this.macAddressContains = macAddressContains;
  }


  public VirtualPrivateCloudNicSnapshotWhereInput macAddressEndsWith(String macAddressEndsWith) {
    
    this.macAddressEndsWith = macAddressEndsWith;
    return this;
  }

   /**
   * Get macAddressEndsWith
   * @return macAddressEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressEndsWith() {
    return macAddressEndsWith;
  }


  public void setMacAddressEndsWith(String macAddressEndsWith) {
    this.macAddressEndsWith = macAddressEndsWith;
  }


  public VirtualPrivateCloudNicSnapshotWhereInput macAddressGt(String macAddressGt) {
    
    this.macAddressGt = macAddressGt;
    return this;
  }

   /**
   * Get macAddressGt
   * @return macAddressGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressGt() {
    return macAddressGt;
  }


  public void setMacAddressGt(String macAddressGt) {
    this.macAddressGt = macAddressGt;
  }


  public VirtualPrivateCloudNicSnapshotWhereInput macAddressGte(String macAddressGte) {
    
    this.macAddressGte = macAddressGte;
    return this;
  }

   /**
   * Get macAddressGte
   * @return macAddressGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressGte() {
    return macAddressGte;
  }


  public void setMacAddressGte(String macAddressGte) {
    this.macAddressGte = macAddressGte;
  }


  public VirtualPrivateCloudNicSnapshotWhereInput macAddressIn(List<String> macAddressIn) {
    
    this.macAddressIn = macAddressIn;
    return this;
  }

  public VirtualPrivateCloudNicSnapshotWhereInput addMacAddressInItem(String macAddressInItem) {
    if (this.macAddressIn == null) {
      this.macAddressIn = new ArrayList<String>();
    }
    this.macAddressIn.add(macAddressInItem);
    return this;
  }

   /**
   * Get macAddressIn
   * @return macAddressIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMacAddressIn() {
    return macAddressIn;
  }


  public void setMacAddressIn(List<String> macAddressIn) {
    this.macAddressIn = macAddressIn;
  }


  public VirtualPrivateCloudNicSnapshotWhereInput macAddressLt(String macAddressLt) {
    
    this.macAddressLt = macAddressLt;
    return this;
  }

   /**
   * Get macAddressLt
   * @return macAddressLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressLt() {
    return macAddressLt;
  }


  public void setMacAddressLt(String macAddressLt) {
    this.macAddressLt = macAddressLt;
  }


  public VirtualPrivateCloudNicSnapshotWhereInput macAddressLte(String macAddressLte) {
    
    this.macAddressLte = macAddressLte;
    return this;
  }

   /**
   * Get macAddressLte
   * @return macAddressLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressLte() {
    return macAddressLte;
  }


  public void setMacAddressLte(String macAddressLte) {
    this.macAddressLte = macAddressLte;
  }


  public VirtualPrivateCloudNicSnapshotWhereInput macAddressNot(String macAddressNot) {
    
    this.macAddressNot = macAddressNot;
    return this;
  }

   /**
   * Get macAddressNot
   * @return macAddressNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressNot() {
    return macAddressNot;
  }


  public void setMacAddressNot(String macAddressNot) {
    this.macAddressNot = macAddressNot;
  }


  public VirtualPrivateCloudNicSnapshotWhereInput macAddressNotContains(String macAddressNotContains) {
    
    this.macAddressNotContains = macAddressNotContains;
    return this;
  }

   /**
   * Get macAddressNotContains
   * @return macAddressNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressNotContains() {
    return macAddressNotContains;
  }


  public void setMacAddressNotContains(String macAddressNotContains) {
    this.macAddressNotContains = macAddressNotContains;
  }


  public VirtualPrivateCloudNicSnapshotWhereInput macAddressNotEndsWith(String macAddressNotEndsWith) {
    
    this.macAddressNotEndsWith = macAddressNotEndsWith;
    return this;
  }

   /**
   * Get macAddressNotEndsWith
   * @return macAddressNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressNotEndsWith() {
    return macAddressNotEndsWith;
  }


  public void setMacAddressNotEndsWith(String macAddressNotEndsWith) {
    this.macAddressNotEndsWith = macAddressNotEndsWith;
  }


  public VirtualPrivateCloudNicSnapshotWhereInput macAddressNotIn(List<String> macAddressNotIn) {
    
    this.macAddressNotIn = macAddressNotIn;
    return this;
  }

  public VirtualPrivateCloudNicSnapshotWhereInput addMacAddressNotInItem(String macAddressNotInItem) {
    if (this.macAddressNotIn == null) {
      this.macAddressNotIn = new ArrayList<String>();
    }
    this.macAddressNotIn.add(macAddressNotInItem);
    return this;
  }

   /**
   * Get macAddressNotIn
   * @return macAddressNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMacAddressNotIn() {
    return macAddressNotIn;
  }


  public void setMacAddressNotIn(List<String> macAddressNotIn) {
    this.macAddressNotIn = macAddressNotIn;
  }


  public VirtualPrivateCloudNicSnapshotWhereInput macAddressNotStartsWith(String macAddressNotStartsWith) {
    
    this.macAddressNotStartsWith = macAddressNotStartsWith;
    return this;
  }

   /**
   * Get macAddressNotStartsWith
   * @return macAddressNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressNotStartsWith() {
    return macAddressNotStartsWith;
  }


  public void setMacAddressNotStartsWith(String macAddressNotStartsWith) {
    this.macAddressNotStartsWith = macAddressNotStartsWith;
  }


  public VirtualPrivateCloudNicSnapshotWhereInput macAddressStartsWith(String macAddressStartsWith) {
    
    this.macAddressStartsWith = macAddressStartsWith;
    return this;
  }

   /**
   * Get macAddressStartsWith
   * @return macAddressStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressStartsWith() {
    return macAddressStartsWith;
  }


  public void setMacAddressStartsWith(String macAddressStartsWith) {
    this.macAddressStartsWith = macAddressStartsWith;
  }


  public VirtualPrivateCloudNicSnapshotWhereInput vpc(VirtualPrivateCloudWhereInput vpc) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput vpcNic(VirtualPrivateCloudNicWhereInput vpcNic) {
    
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


  public VirtualPrivateCloudNicSnapshotWhereInput vpcSubnet(VirtualPrivateCloudSubnetWhereInput vpcSubnet) {
    
    this.vpcSubnet = vpcSubnet;
    return this;
  }

   /**
   * Get vpcSubnet
   * @return vpcSubnet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudSubnetWhereInput getVpcSubnet() {
    return vpcSubnet;
  }


  public void setVpcSubnet(VirtualPrivateCloudSubnetWhereInput vpcSubnet) {
    this.vpcSubnet = vpcSubnet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualPrivateCloudNicSnapshotWhereInput virtualPrivateCloudNicSnapshotWhereInput = (VirtualPrivateCloudNicSnapshotWhereInput) o;
    return Objects.equals(this.AND, virtualPrivateCloudNicSnapshotWhereInput.AND) &&
        Objects.equals(this.NOT, virtualPrivateCloudNicSnapshotWhereInput.NOT) &&
        Objects.equals(this.OR, virtualPrivateCloudNicSnapshotWhereInput.OR) &&
        Objects.equals(this.floatingIp, virtualPrivateCloudNicSnapshotWhereInput.floatingIp) &&
        Objects.equals(this.id, virtualPrivateCloudNicSnapshotWhereInput.id) &&
        Objects.equals(this.idContains, virtualPrivateCloudNicSnapshotWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, virtualPrivateCloudNicSnapshotWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, virtualPrivateCloudNicSnapshotWhereInput.idGt) &&
        Objects.equals(this.idGte, virtualPrivateCloudNicSnapshotWhereInput.idGte) &&
        Objects.equals(this.idIn, virtualPrivateCloudNicSnapshotWhereInput.idIn) &&
        Objects.equals(this.idLt, virtualPrivateCloudNicSnapshotWhereInput.idLt) &&
        Objects.equals(this.idLte, virtualPrivateCloudNicSnapshotWhereInput.idLte) &&
        Objects.equals(this.idNot, virtualPrivateCloudNicSnapshotWhereInput.idNot) &&
        Objects.equals(this.idNotContains, virtualPrivateCloudNicSnapshotWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, virtualPrivateCloudNicSnapshotWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, virtualPrivateCloudNicSnapshotWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, virtualPrivateCloudNicSnapshotWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, virtualPrivateCloudNicSnapshotWhereInput.idStartsWith) &&
        Objects.equals(this.localId, virtualPrivateCloudNicSnapshotWhereInput.localId) &&
        Objects.equals(this.localIdContains, virtualPrivateCloudNicSnapshotWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, virtualPrivateCloudNicSnapshotWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, virtualPrivateCloudNicSnapshotWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, virtualPrivateCloudNicSnapshotWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, virtualPrivateCloudNicSnapshotWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, virtualPrivateCloudNicSnapshotWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, virtualPrivateCloudNicSnapshotWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, virtualPrivateCloudNicSnapshotWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, virtualPrivateCloudNicSnapshotWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, virtualPrivateCloudNicSnapshotWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, virtualPrivateCloudNicSnapshotWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, virtualPrivateCloudNicSnapshotWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, virtualPrivateCloudNicSnapshotWhereInput.localIdStartsWith) &&
        Objects.equals(this.macAddress, virtualPrivateCloudNicSnapshotWhereInput.macAddress) &&
        Objects.equals(this.macAddressContains, virtualPrivateCloudNicSnapshotWhereInput.macAddressContains) &&
        Objects.equals(this.macAddressEndsWith, virtualPrivateCloudNicSnapshotWhereInput.macAddressEndsWith) &&
        Objects.equals(this.macAddressGt, virtualPrivateCloudNicSnapshotWhereInput.macAddressGt) &&
        Objects.equals(this.macAddressGte, virtualPrivateCloudNicSnapshotWhereInput.macAddressGte) &&
        Objects.equals(this.macAddressIn, virtualPrivateCloudNicSnapshotWhereInput.macAddressIn) &&
        Objects.equals(this.macAddressLt, virtualPrivateCloudNicSnapshotWhereInput.macAddressLt) &&
        Objects.equals(this.macAddressLte, virtualPrivateCloudNicSnapshotWhereInput.macAddressLte) &&
        Objects.equals(this.macAddressNot, virtualPrivateCloudNicSnapshotWhereInput.macAddressNot) &&
        Objects.equals(this.macAddressNotContains, virtualPrivateCloudNicSnapshotWhereInput.macAddressNotContains) &&
        Objects.equals(this.macAddressNotEndsWith, virtualPrivateCloudNicSnapshotWhereInput.macAddressNotEndsWith) &&
        Objects.equals(this.macAddressNotIn, virtualPrivateCloudNicSnapshotWhereInput.macAddressNotIn) &&
        Objects.equals(this.macAddressNotStartsWith, virtualPrivateCloudNicSnapshotWhereInput.macAddressNotStartsWith) &&
        Objects.equals(this.macAddressStartsWith, virtualPrivateCloudNicSnapshotWhereInput.macAddressStartsWith) &&
        Objects.equals(this.vpc, virtualPrivateCloudNicSnapshotWhereInput.vpc) &&
        Objects.equals(this.vpcNic, virtualPrivateCloudNicSnapshotWhereInput.vpcNic) &&
        Objects.equals(this.vpcSubnet, virtualPrivateCloudNicSnapshotWhereInput.vpcSubnet);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, floatingIp, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, macAddress, macAddressContains, macAddressEndsWith, macAddressGt, macAddressGte, macAddressIn, macAddressLt, macAddressLte, macAddressNot, macAddressNotContains, macAddressNotEndsWith, macAddressNotIn, macAddressNotStartsWith, macAddressStartsWith, vpc, vpcNic, vpcSubnet);
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
    sb.append("class VirtualPrivateCloudNicSnapshotWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    floatingIp: ").append(toIndentedString(floatingIp)).append("\n");
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
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    macAddressContains: ").append(toIndentedString(macAddressContains)).append("\n");
    sb.append("    macAddressEndsWith: ").append(toIndentedString(macAddressEndsWith)).append("\n");
    sb.append("    macAddressGt: ").append(toIndentedString(macAddressGt)).append("\n");
    sb.append("    macAddressGte: ").append(toIndentedString(macAddressGte)).append("\n");
    sb.append("    macAddressIn: ").append(toIndentedString(macAddressIn)).append("\n");
    sb.append("    macAddressLt: ").append(toIndentedString(macAddressLt)).append("\n");
    sb.append("    macAddressLte: ").append(toIndentedString(macAddressLte)).append("\n");
    sb.append("    macAddressNot: ").append(toIndentedString(macAddressNot)).append("\n");
    sb.append("    macAddressNotContains: ").append(toIndentedString(macAddressNotContains)).append("\n");
    sb.append("    macAddressNotEndsWith: ").append(toIndentedString(macAddressNotEndsWith)).append("\n");
    sb.append("    macAddressNotIn: ").append(toIndentedString(macAddressNotIn)).append("\n");
    sb.append("    macAddressNotStartsWith: ").append(toIndentedString(macAddressNotStartsWith)).append("\n");
    sb.append("    macAddressStartsWith: ").append(toIndentedString(macAddressStartsWith)).append("\n");
    sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
    sb.append("    vpcNic: ").append(toIndentedString(vpcNic)).append("\n");
    sb.append("    vpcSubnet: ").append(toIndentedString(vpcSubnet)).append("\n");
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

