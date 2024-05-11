package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.LabelWhereInput;
import com.smartx.tower.model.VirtualPrivateCloudIsolationPolicyMode;
import com.smartx.tower.model.VirtualPrivateCloudSecurityGroupWhereInput;
import com.smartx.tower.model.VirtualPrivateCloudWhereInput;
import com.smartx.tower.model.VmWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VirtualPrivateCloudIsolationPolicyWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VirtualPrivateCloudIsolationPolicyWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<VirtualPrivateCloudIsolationPolicyWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<VirtualPrivateCloudIsolationPolicyWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<VirtualPrivateCloudIsolationPolicyWhereInput> OR = null;

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

  public static final String SERIALIZED_NAME_LABELS_EVERY = "labels_every";
  @SerializedName(SERIALIZED_NAME_LABELS_EVERY)
  private LabelWhereInput labelsEvery;

  public static final String SERIALIZED_NAME_LABELS_NONE = "labels_none";
  @SerializedName(SERIALIZED_NAME_LABELS_NONE)
  private LabelWhereInput labelsNone;

  public static final String SERIALIZED_NAME_LABELS_SOME = "labels_some";
  @SerializedName(SERIALIZED_NAME_LABELS_SOME)
  private LabelWhereInput labelsSome;

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

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private VirtualPrivateCloudIsolationPolicyMode mode;

  public static final String SERIALIZED_NAME_MODE_IN = "mode_in";
  @SerializedName(SERIALIZED_NAME_MODE_IN)
  private List<VirtualPrivateCloudIsolationPolicyMode> modeIn = null;

  public static final String SERIALIZED_NAME_MODE_NOT = "mode_not";
  @SerializedName(SERIALIZED_NAME_MODE_NOT)
  private VirtualPrivateCloudIsolationPolicyMode modeNot;

  public static final String SERIALIZED_NAME_MODE_NOT_IN = "mode_not_in";
  @SerializedName(SERIALIZED_NAME_MODE_NOT_IN)
  private List<VirtualPrivateCloudIsolationPolicyMode> modeNotIn = null;

  public static final String SERIALIZED_NAME_SECURITY_GROUPS_EVERY = "security_groups_every";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUPS_EVERY)
  private VirtualPrivateCloudSecurityGroupWhereInput securityGroupsEvery;

  public static final String SERIALIZED_NAME_SECURITY_GROUPS_NONE = "security_groups_none";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUPS_NONE)
  private VirtualPrivateCloudSecurityGroupWhereInput securityGroupsNone;

  public static final String SERIALIZED_NAME_SECURITY_GROUPS_SOME = "security_groups_some";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUPS_SOME)
  private VirtualPrivateCloudSecurityGroupWhereInput securityGroupsSome;

  public static final String SERIALIZED_NAME_VM = "vm";
  @SerializedName(SERIALIZED_NAME_VM)
  private VmWhereInput vm;

  public static final String SERIALIZED_NAME_VPC = "vpc";
  @SerializedName(SERIALIZED_NAME_VPC)
  private VirtualPrivateCloudWhereInput vpc;

  public VirtualPrivateCloudIsolationPolicyWhereInput() { 
  }

  public VirtualPrivateCloudIsolationPolicyWhereInput AND(List<VirtualPrivateCloudIsolationPolicyWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public VirtualPrivateCloudIsolationPolicyWhereInput addANDItem(VirtualPrivateCloudIsolationPolicyWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<VirtualPrivateCloudIsolationPolicyWhereInput>();
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

  public List<VirtualPrivateCloudIsolationPolicyWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<VirtualPrivateCloudIsolationPolicyWhereInput> AND) {
    this.AND = AND;
  }


  public VirtualPrivateCloudIsolationPolicyWhereInput NOT(List<VirtualPrivateCloudIsolationPolicyWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public VirtualPrivateCloudIsolationPolicyWhereInput addNOTItem(VirtualPrivateCloudIsolationPolicyWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<VirtualPrivateCloudIsolationPolicyWhereInput>();
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

  public List<VirtualPrivateCloudIsolationPolicyWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<VirtualPrivateCloudIsolationPolicyWhereInput> NOT) {
    this.NOT = NOT;
  }


  public VirtualPrivateCloudIsolationPolicyWhereInput OR(List<VirtualPrivateCloudIsolationPolicyWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public VirtualPrivateCloudIsolationPolicyWhereInput addORItem(VirtualPrivateCloudIsolationPolicyWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<VirtualPrivateCloudIsolationPolicyWhereInput>();
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

  public List<VirtualPrivateCloudIsolationPolicyWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<VirtualPrivateCloudIsolationPolicyWhereInput> OR) {
    this.OR = OR;
  }


  public VirtualPrivateCloudIsolationPolicyWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public VirtualPrivateCloudIsolationPolicyWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public VirtualPrivateCloudIsolationPolicyWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public VirtualPrivateCloudIsolationPolicyWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public VirtualPrivateCloudIsolationPolicyWhereInput id(String id) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput idContains(String idContains) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput idEndsWith(String idEndsWith) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput idGt(String idGt) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput idGte(String idGte) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public VirtualPrivateCloudIsolationPolicyWhereInput addIdInItem(String idInItem) {
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


  public VirtualPrivateCloudIsolationPolicyWhereInput idLt(String idLt) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput idLte(String idLte) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput idNot(String idNot) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput idNotContains(String idNotContains) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public VirtualPrivateCloudIsolationPolicyWhereInput addIdNotInItem(String idNotInItem) {
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


  public VirtualPrivateCloudIsolationPolicyWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput idStartsWith(String idStartsWith) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput labelsEvery(LabelWhereInput labelsEvery) {
    
    this.labelsEvery = labelsEvery;
    return this;
  }

   /**
   * Get labelsEvery
   * @return labelsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LabelWhereInput getLabelsEvery() {
    return labelsEvery;
  }


  public void setLabelsEvery(LabelWhereInput labelsEvery) {
    this.labelsEvery = labelsEvery;
  }


  public VirtualPrivateCloudIsolationPolicyWhereInput labelsNone(LabelWhereInput labelsNone) {
    
    this.labelsNone = labelsNone;
    return this;
  }

   /**
   * Get labelsNone
   * @return labelsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LabelWhereInput getLabelsNone() {
    return labelsNone;
  }


  public void setLabelsNone(LabelWhereInput labelsNone) {
    this.labelsNone = labelsNone;
  }


  public VirtualPrivateCloudIsolationPolicyWhereInput labelsSome(LabelWhereInput labelsSome) {
    
    this.labelsSome = labelsSome;
    return this;
  }

   /**
   * Get labelsSome
   * @return labelsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LabelWhereInput getLabelsSome() {
    return labelsSome;
  }


  public void setLabelsSome(LabelWhereInput labelsSome) {
    this.labelsSome = labelsSome;
  }


  public VirtualPrivateCloudIsolationPolicyWhereInput localId(String localId) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput localIdContains(String localIdContains) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput localIdGt(String localIdGt) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput localIdGte(String localIdGte) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public VirtualPrivateCloudIsolationPolicyWhereInput addLocalIdInItem(String localIdInItem) {
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


  public VirtualPrivateCloudIsolationPolicyWhereInput localIdLt(String localIdLt) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput localIdLte(String localIdLte) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput localIdNot(String localIdNot) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public VirtualPrivateCloudIsolationPolicyWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public VirtualPrivateCloudIsolationPolicyWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public VirtualPrivateCloudIsolationPolicyWhereInput mode(VirtualPrivateCloudIsolationPolicyMode mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudIsolationPolicyMode getMode() {
    return mode;
  }


  public void setMode(VirtualPrivateCloudIsolationPolicyMode mode) {
    this.mode = mode;
  }


  public VirtualPrivateCloudIsolationPolicyWhereInput modeIn(List<VirtualPrivateCloudIsolationPolicyMode> modeIn) {
    
    this.modeIn = modeIn;
    return this;
  }

  public VirtualPrivateCloudIsolationPolicyWhereInput addModeInItem(VirtualPrivateCloudIsolationPolicyMode modeInItem) {
    if (this.modeIn == null) {
      this.modeIn = new ArrayList<VirtualPrivateCloudIsolationPolicyMode>();
    }
    this.modeIn.add(modeInItem);
    return this;
  }

   /**
   * Get modeIn
   * @return modeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VirtualPrivateCloudIsolationPolicyMode> getModeIn() {
    return modeIn;
  }


  public void setModeIn(List<VirtualPrivateCloudIsolationPolicyMode> modeIn) {
    this.modeIn = modeIn;
  }


  public VirtualPrivateCloudIsolationPolicyWhereInput modeNot(VirtualPrivateCloudIsolationPolicyMode modeNot) {
    
    this.modeNot = modeNot;
    return this;
  }

   /**
   * Get modeNot
   * @return modeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudIsolationPolicyMode getModeNot() {
    return modeNot;
  }


  public void setModeNot(VirtualPrivateCloudIsolationPolicyMode modeNot) {
    this.modeNot = modeNot;
  }


  public VirtualPrivateCloudIsolationPolicyWhereInput modeNotIn(List<VirtualPrivateCloudIsolationPolicyMode> modeNotIn) {
    
    this.modeNotIn = modeNotIn;
    return this;
  }

  public VirtualPrivateCloudIsolationPolicyWhereInput addModeNotInItem(VirtualPrivateCloudIsolationPolicyMode modeNotInItem) {
    if (this.modeNotIn == null) {
      this.modeNotIn = new ArrayList<VirtualPrivateCloudIsolationPolicyMode>();
    }
    this.modeNotIn.add(modeNotInItem);
    return this;
  }

   /**
   * Get modeNotIn
   * @return modeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VirtualPrivateCloudIsolationPolicyMode> getModeNotIn() {
    return modeNotIn;
  }


  public void setModeNotIn(List<VirtualPrivateCloudIsolationPolicyMode> modeNotIn) {
    this.modeNotIn = modeNotIn;
  }


  public VirtualPrivateCloudIsolationPolicyWhereInput securityGroupsEvery(VirtualPrivateCloudSecurityGroupWhereInput securityGroupsEvery) {
    
    this.securityGroupsEvery = securityGroupsEvery;
    return this;
  }

   /**
   * Get securityGroupsEvery
   * @return securityGroupsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudSecurityGroupWhereInput getSecurityGroupsEvery() {
    return securityGroupsEvery;
  }


  public void setSecurityGroupsEvery(VirtualPrivateCloudSecurityGroupWhereInput securityGroupsEvery) {
    this.securityGroupsEvery = securityGroupsEvery;
  }


  public VirtualPrivateCloudIsolationPolicyWhereInput securityGroupsNone(VirtualPrivateCloudSecurityGroupWhereInput securityGroupsNone) {
    
    this.securityGroupsNone = securityGroupsNone;
    return this;
  }

   /**
   * Get securityGroupsNone
   * @return securityGroupsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudSecurityGroupWhereInput getSecurityGroupsNone() {
    return securityGroupsNone;
  }


  public void setSecurityGroupsNone(VirtualPrivateCloudSecurityGroupWhereInput securityGroupsNone) {
    this.securityGroupsNone = securityGroupsNone;
  }


  public VirtualPrivateCloudIsolationPolicyWhereInput securityGroupsSome(VirtualPrivateCloudSecurityGroupWhereInput securityGroupsSome) {
    
    this.securityGroupsSome = securityGroupsSome;
    return this;
  }

   /**
   * Get securityGroupsSome
   * @return securityGroupsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudSecurityGroupWhereInput getSecurityGroupsSome() {
    return securityGroupsSome;
  }


  public void setSecurityGroupsSome(VirtualPrivateCloudSecurityGroupWhereInput securityGroupsSome) {
    this.securityGroupsSome = securityGroupsSome;
  }


  public VirtualPrivateCloudIsolationPolicyWhereInput vm(VmWhereInput vm) {
    
    this.vm = vm;
    return this;
  }

   /**
   * Get vm
   * @return vm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVm() {
    return vm;
  }


  public void setVm(VmWhereInput vm) {
    this.vm = vm;
  }


  public VirtualPrivateCloudIsolationPolicyWhereInput vpc(VirtualPrivateCloudWhereInput vpc) {
    
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
    VirtualPrivateCloudIsolationPolicyWhereInput virtualPrivateCloudIsolationPolicyWhereInput = (VirtualPrivateCloudIsolationPolicyWhereInput) o;
    return Objects.equals(this.AND, virtualPrivateCloudIsolationPolicyWhereInput.AND) &&
        Objects.equals(this.NOT, virtualPrivateCloudIsolationPolicyWhereInput.NOT) &&
        Objects.equals(this.OR, virtualPrivateCloudIsolationPolicyWhereInput.OR) &&
        Objects.equals(this.entityAsyncStatus, virtualPrivateCloudIsolationPolicyWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, virtualPrivateCloudIsolationPolicyWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, virtualPrivateCloudIsolationPolicyWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, virtualPrivateCloudIsolationPolicyWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.id, virtualPrivateCloudIsolationPolicyWhereInput.id) &&
        Objects.equals(this.idContains, virtualPrivateCloudIsolationPolicyWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, virtualPrivateCloudIsolationPolicyWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, virtualPrivateCloudIsolationPolicyWhereInput.idGt) &&
        Objects.equals(this.idGte, virtualPrivateCloudIsolationPolicyWhereInput.idGte) &&
        Objects.equals(this.idIn, virtualPrivateCloudIsolationPolicyWhereInput.idIn) &&
        Objects.equals(this.idLt, virtualPrivateCloudIsolationPolicyWhereInput.idLt) &&
        Objects.equals(this.idLte, virtualPrivateCloudIsolationPolicyWhereInput.idLte) &&
        Objects.equals(this.idNot, virtualPrivateCloudIsolationPolicyWhereInput.idNot) &&
        Objects.equals(this.idNotContains, virtualPrivateCloudIsolationPolicyWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, virtualPrivateCloudIsolationPolicyWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, virtualPrivateCloudIsolationPolicyWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, virtualPrivateCloudIsolationPolicyWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, virtualPrivateCloudIsolationPolicyWhereInput.idStartsWith) &&
        Objects.equals(this.labelsEvery, virtualPrivateCloudIsolationPolicyWhereInput.labelsEvery) &&
        Objects.equals(this.labelsNone, virtualPrivateCloudIsolationPolicyWhereInput.labelsNone) &&
        Objects.equals(this.labelsSome, virtualPrivateCloudIsolationPolicyWhereInput.labelsSome) &&
        Objects.equals(this.localId, virtualPrivateCloudIsolationPolicyWhereInput.localId) &&
        Objects.equals(this.localIdContains, virtualPrivateCloudIsolationPolicyWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, virtualPrivateCloudIsolationPolicyWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, virtualPrivateCloudIsolationPolicyWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, virtualPrivateCloudIsolationPolicyWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, virtualPrivateCloudIsolationPolicyWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, virtualPrivateCloudIsolationPolicyWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, virtualPrivateCloudIsolationPolicyWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, virtualPrivateCloudIsolationPolicyWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, virtualPrivateCloudIsolationPolicyWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, virtualPrivateCloudIsolationPolicyWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, virtualPrivateCloudIsolationPolicyWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, virtualPrivateCloudIsolationPolicyWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, virtualPrivateCloudIsolationPolicyWhereInput.localIdStartsWith) &&
        Objects.equals(this.mode, virtualPrivateCloudIsolationPolicyWhereInput.mode) &&
        Objects.equals(this.modeIn, virtualPrivateCloudIsolationPolicyWhereInput.modeIn) &&
        Objects.equals(this.modeNot, virtualPrivateCloudIsolationPolicyWhereInput.modeNot) &&
        Objects.equals(this.modeNotIn, virtualPrivateCloudIsolationPolicyWhereInput.modeNotIn) &&
        Objects.equals(this.securityGroupsEvery, virtualPrivateCloudIsolationPolicyWhereInput.securityGroupsEvery) &&
        Objects.equals(this.securityGroupsNone, virtualPrivateCloudIsolationPolicyWhereInput.securityGroupsNone) &&
        Objects.equals(this.securityGroupsSome, virtualPrivateCloudIsolationPolicyWhereInput.securityGroupsSome) &&
        Objects.equals(this.vm, virtualPrivateCloudIsolationPolicyWhereInput.vm) &&
        Objects.equals(this.vpc, virtualPrivateCloudIsolationPolicyWhereInput.vpc);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, labelsEvery, labelsNone, labelsSome, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, mode, modeIn, modeNot, modeNotIn, securityGroupsEvery, securityGroupsNone, securityGroupsSome, vm, vpc);
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
    sb.append("class VirtualPrivateCloudIsolationPolicyWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
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
    sb.append("    labelsEvery: ").append(toIndentedString(labelsEvery)).append("\n");
    sb.append("    labelsNone: ").append(toIndentedString(labelsNone)).append("\n");
    sb.append("    labelsSome: ").append(toIndentedString(labelsSome)).append("\n");
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
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    modeIn: ").append(toIndentedString(modeIn)).append("\n");
    sb.append("    modeNot: ").append(toIndentedString(modeNot)).append("\n");
    sb.append("    modeNotIn: ").append(toIndentedString(modeNotIn)).append("\n");
    sb.append("    securityGroupsEvery: ").append(toIndentedString(securityGroupsEvery)).append("\n");
    sb.append("    securityGroupsNone: ").append(toIndentedString(securityGroupsNone)).append("\n");
    sb.append("    securityGroupsSome: ").append(toIndentedString(securityGroupsSome)).append("\n");
    sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
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

