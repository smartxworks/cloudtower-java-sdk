package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.VirtualPrivateCloudFloatingIpWhereInput;
import com.smartx.tower.model.VirtualPrivateCloudNicSnapshotWhereInput;
import com.smartx.tower.model.VirtualPrivateCloudSubnetWhereInput;
import com.smartx.tower.model.VirtualPrivateCloudWhereInput;
import com.smartx.tower.model.VmNicWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VirtualPrivateCloudNicWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class VirtualPrivateCloudNicWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<VirtualPrivateCloudNicWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<VirtualPrivateCloudNicWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<VirtualPrivateCloudNicWhereInput> OR = null;

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

  public static final String SERIALIZED_NAME_SNAPSHOTS_EVERY = "snapshots_every";
  @SerializedName(SERIALIZED_NAME_SNAPSHOTS_EVERY)
  private VirtualPrivateCloudNicSnapshotWhereInput snapshotsEvery;

  public static final String SERIALIZED_NAME_SNAPSHOTS_NONE = "snapshots_none";
  @SerializedName(SERIALIZED_NAME_SNAPSHOTS_NONE)
  private VirtualPrivateCloudNicSnapshotWhereInput snapshotsNone;

  public static final String SERIALIZED_NAME_SNAPSHOTS_SOME = "snapshots_some";
  @SerializedName(SERIALIZED_NAME_SNAPSHOTS_SOME)
  private VirtualPrivateCloudNicSnapshotWhereInput snapshotsSome;

  public static final String SERIALIZED_NAME_VM_NIC = "vm_nic";
  @SerializedName(SERIALIZED_NAME_VM_NIC)
  private VmNicWhereInput vmNic;

  public static final String SERIALIZED_NAME_VPC = "vpc";
  @SerializedName(SERIALIZED_NAME_VPC)
  private VirtualPrivateCloudWhereInput vpc;

  public static final String SERIALIZED_NAME_VPC_SUBNET = "vpc_subnet";
  @SerializedName(SERIALIZED_NAME_VPC_SUBNET)
  private VirtualPrivateCloudSubnetWhereInput vpcSubnet;

  public VirtualPrivateCloudNicWhereInput() { 
  }

  public VirtualPrivateCloudNicWhereInput AND(List<VirtualPrivateCloudNicWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public VirtualPrivateCloudNicWhereInput addANDItem(VirtualPrivateCloudNicWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<VirtualPrivateCloudNicWhereInput>();
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

  public List<VirtualPrivateCloudNicWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<VirtualPrivateCloudNicWhereInput> AND) {
    this.AND = AND;
  }


  public VirtualPrivateCloudNicWhereInput NOT(List<VirtualPrivateCloudNicWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public VirtualPrivateCloudNicWhereInput addNOTItem(VirtualPrivateCloudNicWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<VirtualPrivateCloudNicWhereInput>();
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

  public List<VirtualPrivateCloudNicWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<VirtualPrivateCloudNicWhereInput> NOT) {
    this.NOT = NOT;
  }


  public VirtualPrivateCloudNicWhereInput OR(List<VirtualPrivateCloudNicWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public VirtualPrivateCloudNicWhereInput addORItem(VirtualPrivateCloudNicWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<VirtualPrivateCloudNicWhereInput>();
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

  public List<VirtualPrivateCloudNicWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<VirtualPrivateCloudNicWhereInput> OR) {
    this.OR = OR;
  }


  public VirtualPrivateCloudNicWhereInput floatingIp(VirtualPrivateCloudFloatingIpWhereInput floatingIp) {
    
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


  public VirtualPrivateCloudNicWhereInput id(String id) {
    
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


  public VirtualPrivateCloudNicWhereInput idContains(String idContains) {
    
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


  public VirtualPrivateCloudNicWhereInput idEndsWith(String idEndsWith) {
    
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


  public VirtualPrivateCloudNicWhereInput idGt(String idGt) {
    
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


  public VirtualPrivateCloudNicWhereInput idGte(String idGte) {
    
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


  public VirtualPrivateCloudNicWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public VirtualPrivateCloudNicWhereInput addIdInItem(String idInItem) {
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


  public VirtualPrivateCloudNicWhereInput idLt(String idLt) {
    
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


  public VirtualPrivateCloudNicWhereInput idLte(String idLte) {
    
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


  public VirtualPrivateCloudNicWhereInput idNot(String idNot) {
    
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


  public VirtualPrivateCloudNicWhereInput idNotContains(String idNotContains) {
    
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


  public VirtualPrivateCloudNicWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public VirtualPrivateCloudNicWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public VirtualPrivateCloudNicWhereInput addIdNotInItem(String idNotInItem) {
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


  public VirtualPrivateCloudNicWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public VirtualPrivateCloudNicWhereInput idStartsWith(String idStartsWith) {
    
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


  public VirtualPrivateCloudNicWhereInput localId(String localId) {
    
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


  public VirtualPrivateCloudNicWhereInput localIdContains(String localIdContains) {
    
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


  public VirtualPrivateCloudNicWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public VirtualPrivateCloudNicWhereInput localIdGt(String localIdGt) {
    
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


  public VirtualPrivateCloudNicWhereInput localIdGte(String localIdGte) {
    
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


  public VirtualPrivateCloudNicWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public VirtualPrivateCloudNicWhereInput addLocalIdInItem(String localIdInItem) {
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


  public VirtualPrivateCloudNicWhereInput localIdLt(String localIdLt) {
    
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


  public VirtualPrivateCloudNicWhereInput localIdLte(String localIdLte) {
    
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


  public VirtualPrivateCloudNicWhereInput localIdNot(String localIdNot) {
    
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


  public VirtualPrivateCloudNicWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public VirtualPrivateCloudNicWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public VirtualPrivateCloudNicWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public VirtualPrivateCloudNicWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public VirtualPrivateCloudNicWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public VirtualPrivateCloudNicWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public VirtualPrivateCloudNicWhereInput snapshotsEvery(VirtualPrivateCloudNicSnapshotWhereInput snapshotsEvery) {
    
    this.snapshotsEvery = snapshotsEvery;
    return this;
  }

   /**
   * Get snapshotsEvery
   * @return snapshotsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudNicSnapshotWhereInput getSnapshotsEvery() {
    return snapshotsEvery;
  }


  public void setSnapshotsEvery(VirtualPrivateCloudNicSnapshotWhereInput snapshotsEvery) {
    this.snapshotsEvery = snapshotsEvery;
  }


  public VirtualPrivateCloudNicWhereInput snapshotsNone(VirtualPrivateCloudNicSnapshotWhereInput snapshotsNone) {
    
    this.snapshotsNone = snapshotsNone;
    return this;
  }

   /**
   * Get snapshotsNone
   * @return snapshotsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudNicSnapshotWhereInput getSnapshotsNone() {
    return snapshotsNone;
  }


  public void setSnapshotsNone(VirtualPrivateCloudNicSnapshotWhereInput snapshotsNone) {
    this.snapshotsNone = snapshotsNone;
  }


  public VirtualPrivateCloudNicWhereInput snapshotsSome(VirtualPrivateCloudNicSnapshotWhereInput snapshotsSome) {
    
    this.snapshotsSome = snapshotsSome;
    return this;
  }

   /**
   * Get snapshotsSome
   * @return snapshotsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudNicSnapshotWhereInput getSnapshotsSome() {
    return snapshotsSome;
  }


  public void setSnapshotsSome(VirtualPrivateCloudNicSnapshotWhereInput snapshotsSome) {
    this.snapshotsSome = snapshotsSome;
  }


  public VirtualPrivateCloudNicWhereInput vmNic(VmNicWhereInput vmNic) {
    
    this.vmNic = vmNic;
    return this;
  }

   /**
   * Get vmNic
   * @return vmNic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmNicWhereInput getVmNic() {
    return vmNic;
  }


  public void setVmNic(VmNicWhereInput vmNic) {
    this.vmNic = vmNic;
  }


  public VirtualPrivateCloudNicWhereInput vpc(VirtualPrivateCloudWhereInput vpc) {
    
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


  public VirtualPrivateCloudNicWhereInput vpcSubnet(VirtualPrivateCloudSubnetWhereInput vpcSubnet) {
    
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
    VirtualPrivateCloudNicWhereInput virtualPrivateCloudNicWhereInput = (VirtualPrivateCloudNicWhereInput) o;
    return Objects.equals(this.AND, virtualPrivateCloudNicWhereInput.AND) &&
        Objects.equals(this.NOT, virtualPrivateCloudNicWhereInput.NOT) &&
        Objects.equals(this.OR, virtualPrivateCloudNicWhereInput.OR) &&
        Objects.equals(this.floatingIp, virtualPrivateCloudNicWhereInput.floatingIp) &&
        Objects.equals(this.id, virtualPrivateCloudNicWhereInput.id) &&
        Objects.equals(this.idContains, virtualPrivateCloudNicWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, virtualPrivateCloudNicWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, virtualPrivateCloudNicWhereInput.idGt) &&
        Objects.equals(this.idGte, virtualPrivateCloudNicWhereInput.idGte) &&
        Objects.equals(this.idIn, virtualPrivateCloudNicWhereInput.idIn) &&
        Objects.equals(this.idLt, virtualPrivateCloudNicWhereInput.idLt) &&
        Objects.equals(this.idLte, virtualPrivateCloudNicWhereInput.idLte) &&
        Objects.equals(this.idNot, virtualPrivateCloudNicWhereInput.idNot) &&
        Objects.equals(this.idNotContains, virtualPrivateCloudNicWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, virtualPrivateCloudNicWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, virtualPrivateCloudNicWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, virtualPrivateCloudNicWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, virtualPrivateCloudNicWhereInput.idStartsWith) &&
        Objects.equals(this.localId, virtualPrivateCloudNicWhereInput.localId) &&
        Objects.equals(this.localIdContains, virtualPrivateCloudNicWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, virtualPrivateCloudNicWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, virtualPrivateCloudNicWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, virtualPrivateCloudNicWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, virtualPrivateCloudNicWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, virtualPrivateCloudNicWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, virtualPrivateCloudNicWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, virtualPrivateCloudNicWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, virtualPrivateCloudNicWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, virtualPrivateCloudNicWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, virtualPrivateCloudNicWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, virtualPrivateCloudNicWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, virtualPrivateCloudNicWhereInput.localIdStartsWith) &&
        Objects.equals(this.snapshotsEvery, virtualPrivateCloudNicWhereInput.snapshotsEvery) &&
        Objects.equals(this.snapshotsNone, virtualPrivateCloudNicWhereInput.snapshotsNone) &&
        Objects.equals(this.snapshotsSome, virtualPrivateCloudNicWhereInput.snapshotsSome) &&
        Objects.equals(this.vmNic, virtualPrivateCloudNicWhereInput.vmNic) &&
        Objects.equals(this.vpc, virtualPrivateCloudNicWhereInput.vpc) &&
        Objects.equals(this.vpcSubnet, virtualPrivateCloudNicWhereInput.vpcSubnet);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, floatingIp, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, snapshotsEvery, snapshotsNone, snapshotsSome, vmNic, vpc, vpcSubnet);
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
    sb.append("class VirtualPrivateCloudNicWhereInput {\n");
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
    sb.append("    snapshotsEvery: ").append(toIndentedString(snapshotsEvery)).append("\n");
    sb.append("    snapshotsNone: ").append(toIndentedString(snapshotsNone)).append("\n");
    sb.append("    snapshotsSome: ").append(toIndentedString(snapshotsSome)).append("\n");
    sb.append("    vmNic: ").append(toIndentedString(vmNic)).append("\n");
    sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
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

