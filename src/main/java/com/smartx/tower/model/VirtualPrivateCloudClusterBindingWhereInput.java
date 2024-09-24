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
import com.smartx.tower.model.VdsWhereInput;
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

  public static final String SERIALIZED_NAME_MTU = "mtu";
  @SerializedName(SERIALIZED_NAME_MTU)
  private Integer mtu;

  public static final String SERIALIZED_NAME_MTU_GT = "mtu_gt";
  @SerializedName(SERIALIZED_NAME_MTU_GT)
  private Integer mtuGt;

  public static final String SERIALIZED_NAME_MTU_GTE = "mtu_gte";
  @SerializedName(SERIALIZED_NAME_MTU_GTE)
  private Integer mtuGte;

  public static final String SERIALIZED_NAME_MTU_IN = "mtu_in";
  @SerializedName(SERIALIZED_NAME_MTU_IN)
  private List<Integer> mtuIn = null;

  public static final String SERIALIZED_NAME_MTU_LT = "mtu_lt";
  @SerializedName(SERIALIZED_NAME_MTU_LT)
  private Integer mtuLt;

  public static final String SERIALIZED_NAME_MTU_LTE = "mtu_lte";
  @SerializedName(SERIALIZED_NAME_MTU_LTE)
  private Integer mtuLte;

  public static final String SERIALIZED_NAME_MTU_NOT = "mtu_not";
  @SerializedName(SERIALIZED_NAME_MTU_NOT)
  private Integer mtuNot;

  public static final String SERIALIZED_NAME_MTU_NOT_IN = "mtu_not_in";
  @SerializedName(SERIALIZED_NAME_MTU_NOT_IN)
  private List<Integer> mtuNotIn = null;

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


  public VirtualPrivateCloudClusterBindingWhereInput mtu(Integer mtu) {
    
    this.mtu = mtu;
    return this;
  }

   /**
   * Get mtu
   * @return mtu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMtu() {
    return mtu;
  }


  public void setMtu(Integer mtu) {
    this.mtu = mtu;
  }


  public VirtualPrivateCloudClusterBindingWhereInput mtuGt(Integer mtuGt) {
    
    this.mtuGt = mtuGt;
    return this;
  }

   /**
   * Get mtuGt
   * @return mtuGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMtuGt() {
    return mtuGt;
  }


  public void setMtuGt(Integer mtuGt) {
    this.mtuGt = mtuGt;
  }


  public VirtualPrivateCloudClusterBindingWhereInput mtuGte(Integer mtuGte) {
    
    this.mtuGte = mtuGte;
    return this;
  }

   /**
   * Get mtuGte
   * @return mtuGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMtuGte() {
    return mtuGte;
  }


  public void setMtuGte(Integer mtuGte) {
    this.mtuGte = mtuGte;
  }


  public VirtualPrivateCloudClusterBindingWhereInput mtuIn(List<Integer> mtuIn) {
    
    this.mtuIn = mtuIn;
    return this;
  }

  public VirtualPrivateCloudClusterBindingWhereInput addMtuInItem(Integer mtuInItem) {
    if (this.mtuIn == null) {
      this.mtuIn = new ArrayList<Integer>();
    }
    this.mtuIn.add(mtuInItem);
    return this;
  }

   /**
   * Get mtuIn
   * @return mtuIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getMtuIn() {
    return mtuIn;
  }


  public void setMtuIn(List<Integer> mtuIn) {
    this.mtuIn = mtuIn;
  }


  public VirtualPrivateCloudClusterBindingWhereInput mtuLt(Integer mtuLt) {
    
    this.mtuLt = mtuLt;
    return this;
  }

   /**
   * Get mtuLt
   * @return mtuLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMtuLt() {
    return mtuLt;
  }


  public void setMtuLt(Integer mtuLt) {
    this.mtuLt = mtuLt;
  }


  public VirtualPrivateCloudClusterBindingWhereInput mtuLte(Integer mtuLte) {
    
    this.mtuLte = mtuLte;
    return this;
  }

   /**
   * Get mtuLte
   * @return mtuLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMtuLte() {
    return mtuLte;
  }


  public void setMtuLte(Integer mtuLte) {
    this.mtuLte = mtuLte;
  }


  public VirtualPrivateCloudClusterBindingWhereInput mtuNot(Integer mtuNot) {
    
    this.mtuNot = mtuNot;
    return this;
  }

   /**
   * Get mtuNot
   * @return mtuNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMtuNot() {
    return mtuNot;
  }


  public void setMtuNot(Integer mtuNot) {
    this.mtuNot = mtuNot;
  }


  public VirtualPrivateCloudClusterBindingWhereInput mtuNotIn(List<Integer> mtuNotIn) {
    
    this.mtuNotIn = mtuNotIn;
    return this;
  }

  public VirtualPrivateCloudClusterBindingWhereInput addMtuNotInItem(Integer mtuNotInItem) {
    if (this.mtuNotIn == null) {
      this.mtuNotIn = new ArrayList<Integer>();
    }
    this.mtuNotIn.add(mtuNotInItem);
    return this;
  }

   /**
   * Get mtuNotIn
   * @return mtuNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getMtuNotIn() {
    return mtuNotIn;
  }


  public void setMtuNotIn(List<Integer> mtuNotIn) {
    this.mtuNotIn = mtuNotIn;
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
        Objects.equals(this.mtu, virtualPrivateCloudClusterBindingWhereInput.mtu) &&
        Objects.equals(this.mtuGt, virtualPrivateCloudClusterBindingWhereInput.mtuGt) &&
        Objects.equals(this.mtuGte, virtualPrivateCloudClusterBindingWhereInput.mtuGte) &&
        Objects.equals(this.mtuIn, virtualPrivateCloudClusterBindingWhereInput.mtuIn) &&
        Objects.equals(this.mtuLt, virtualPrivateCloudClusterBindingWhereInput.mtuLt) &&
        Objects.equals(this.mtuLte, virtualPrivateCloudClusterBindingWhereInput.mtuLte) &&
        Objects.equals(this.mtuNot, virtualPrivateCloudClusterBindingWhereInput.mtuNot) &&
        Objects.equals(this.mtuNotIn, virtualPrivateCloudClusterBindingWhereInput.mtuNotIn) &&
        Objects.equals(this.vds, virtualPrivateCloudClusterBindingWhereInput.vds) &&
        Objects.equals(this.vlanId, virtualPrivateCloudClusterBindingWhereInput.vlanId) &&
        Objects.equals(this.vlanIdGt, virtualPrivateCloudClusterBindingWhereInput.vlanIdGt) &&
        Objects.equals(this.vlanIdGte, virtualPrivateCloudClusterBindingWhereInput.vlanIdGte) &&
        Objects.equals(this.vlanIdIn, virtualPrivateCloudClusterBindingWhereInput.vlanIdIn) &&
        Objects.equals(this.vlanIdLt, virtualPrivateCloudClusterBindingWhereInput.vlanIdLt) &&
        Objects.equals(this.vlanIdLte, virtualPrivateCloudClusterBindingWhereInput.vlanIdLte) &&
        Objects.equals(this.vlanIdNot, virtualPrivateCloudClusterBindingWhereInput.vlanIdNot) &&
        Objects.equals(this.vlanIdNotIn, virtualPrivateCloudClusterBindingWhereInput.vlanIdNotIn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, cluster, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, mtu, mtuGt, mtuGte, mtuIn, mtuLt, mtuLte, mtuNot, mtuNotIn, vds, vlanId, vlanIdGt, vlanIdGte, vlanIdIn, vlanIdLt, vlanIdLte, vlanIdNot, vlanIdNotIn);
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
    sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
    sb.append("    mtuGt: ").append(toIndentedString(mtuGt)).append("\n");
    sb.append("    mtuGte: ").append(toIndentedString(mtuGte)).append("\n");
    sb.append("    mtuIn: ").append(toIndentedString(mtuIn)).append("\n");
    sb.append("    mtuLt: ").append(toIndentedString(mtuLt)).append("\n");
    sb.append("    mtuLte: ").append(toIndentedString(mtuLte)).append("\n");
    sb.append("    mtuNot: ").append(toIndentedString(mtuNot)).append("\n");
    sb.append("    mtuNotIn: ").append(toIndentedString(mtuNotIn)).append("\n");
    sb.append("    vds: ").append(toIndentedString(vds)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
    sb.append("    vlanIdGt: ").append(toIndentedString(vlanIdGt)).append("\n");
    sb.append("    vlanIdGte: ").append(toIndentedString(vlanIdGte)).append("\n");
    sb.append("    vlanIdIn: ").append(toIndentedString(vlanIdIn)).append("\n");
    sb.append("    vlanIdLt: ").append(toIndentedString(vlanIdLt)).append("\n");
    sb.append("    vlanIdLte: ").append(toIndentedString(vlanIdLte)).append("\n");
    sb.append("    vlanIdNot: ").append(toIndentedString(vlanIdNot)).append("\n");
    sb.append("    vlanIdNotIn: ").append(toIndentedString(vlanIdNotIn)).append("\n");
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

