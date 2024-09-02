package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.EntityAsyncStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * BackupRestoreExecutionWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class BackupRestoreExecutionWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<BackupRestoreExecutionWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<BackupRestoreExecutionWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<BackupRestoreExecutionWhereInput> OR = null;

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

  public static final String SERIALIZED_NAME_RESOURCE_VERSION_GT = "resource_version_gt";
  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_GT)
  private Integer resourceVersionGt;

  public static final String SERIALIZED_NAME_RESOURCE_VERSION_GTE = "resource_version_gte";
  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_GTE)
  private Integer resourceVersionGte;

  public static final String SERIALIZED_NAME_RESOURCE_VERSION_IN = "resource_version_in";
  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_IN)
  private List<Integer> resourceVersionIn = null;

  public static final String SERIALIZED_NAME_RESOURCE_VERSION_LT = "resource_version_lt";
  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_LT)
  private Integer resourceVersionLt;

  public static final String SERIALIZED_NAME_RESOURCE_VERSION_LTE = "resource_version_lte";
  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_LTE)
  private Integer resourceVersionLte;

  public static final String SERIALIZED_NAME_RESOURCE_VERSION_NOT = "resource_version_not";
  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_NOT)
  private Integer resourceVersionNot;

  public static final String SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN = "resource_version_not_in";
  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN)
  private List<Integer> resourceVersionNotIn = null;

  public BackupRestoreExecutionWhereInput() { 
  }

  public BackupRestoreExecutionWhereInput AND(List<BackupRestoreExecutionWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public BackupRestoreExecutionWhereInput addANDItem(BackupRestoreExecutionWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<BackupRestoreExecutionWhereInput>();
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

  public List<BackupRestoreExecutionWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<BackupRestoreExecutionWhereInput> AND) {
    this.AND = AND;
  }


  public BackupRestoreExecutionWhereInput NOT(List<BackupRestoreExecutionWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public BackupRestoreExecutionWhereInput addNOTItem(BackupRestoreExecutionWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<BackupRestoreExecutionWhereInput>();
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

  public List<BackupRestoreExecutionWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<BackupRestoreExecutionWhereInput> NOT) {
    this.NOT = NOT;
  }


  public BackupRestoreExecutionWhereInput OR(List<BackupRestoreExecutionWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public BackupRestoreExecutionWhereInput addORItem(BackupRestoreExecutionWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<BackupRestoreExecutionWhereInput>();
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

  public List<BackupRestoreExecutionWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<BackupRestoreExecutionWhereInput> OR) {
    this.OR = OR;
  }


  public BackupRestoreExecutionWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public BackupRestoreExecutionWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public BackupRestoreExecutionWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public BackupRestoreExecutionWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public BackupRestoreExecutionWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public BackupRestoreExecutionWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public BackupRestoreExecutionWhereInput id(String id) {
    
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


  public BackupRestoreExecutionWhereInput idContains(String idContains) {
    
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


  public BackupRestoreExecutionWhereInput idEndsWith(String idEndsWith) {
    
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


  public BackupRestoreExecutionWhereInput idGt(String idGt) {
    
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


  public BackupRestoreExecutionWhereInput idGte(String idGte) {
    
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


  public BackupRestoreExecutionWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public BackupRestoreExecutionWhereInput addIdInItem(String idInItem) {
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


  public BackupRestoreExecutionWhereInput idLt(String idLt) {
    
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


  public BackupRestoreExecutionWhereInput idLte(String idLte) {
    
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


  public BackupRestoreExecutionWhereInput idNot(String idNot) {
    
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


  public BackupRestoreExecutionWhereInput idNotContains(String idNotContains) {
    
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


  public BackupRestoreExecutionWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public BackupRestoreExecutionWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public BackupRestoreExecutionWhereInput addIdNotInItem(String idNotInItem) {
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


  public BackupRestoreExecutionWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public BackupRestoreExecutionWhereInput idStartsWith(String idStartsWith) {
    
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


  public BackupRestoreExecutionWhereInput name(String name) {
    
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


  public BackupRestoreExecutionWhereInput nameContains(String nameContains) {
    
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


  public BackupRestoreExecutionWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public BackupRestoreExecutionWhereInput nameGt(String nameGt) {
    
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


  public BackupRestoreExecutionWhereInput nameGte(String nameGte) {
    
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


  public BackupRestoreExecutionWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public BackupRestoreExecutionWhereInput addNameInItem(String nameInItem) {
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


  public BackupRestoreExecutionWhereInput nameLt(String nameLt) {
    
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


  public BackupRestoreExecutionWhereInput nameLte(String nameLte) {
    
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


  public BackupRestoreExecutionWhereInput nameNot(String nameNot) {
    
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


  public BackupRestoreExecutionWhereInput nameNotContains(String nameNotContains) {
    
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


  public BackupRestoreExecutionWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public BackupRestoreExecutionWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public BackupRestoreExecutionWhereInput addNameNotInItem(String nameNotInItem) {
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


  public BackupRestoreExecutionWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public BackupRestoreExecutionWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public BackupRestoreExecutionWhereInput resourceVersionGt(Integer resourceVersionGt) {
    
    this.resourceVersionGt = resourceVersionGt;
    return this;
  }

   /**
   * Get resourceVersionGt
   * @return resourceVersionGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getResourceVersionGt() {
    return resourceVersionGt;
  }


  public void setResourceVersionGt(Integer resourceVersionGt) {
    this.resourceVersionGt = resourceVersionGt;
  }


  public BackupRestoreExecutionWhereInput resourceVersionGte(Integer resourceVersionGte) {
    
    this.resourceVersionGte = resourceVersionGte;
    return this;
  }

   /**
   * Get resourceVersionGte
   * @return resourceVersionGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getResourceVersionGte() {
    return resourceVersionGte;
  }


  public void setResourceVersionGte(Integer resourceVersionGte) {
    this.resourceVersionGte = resourceVersionGte;
  }


  public BackupRestoreExecutionWhereInput resourceVersionIn(List<Integer> resourceVersionIn) {
    
    this.resourceVersionIn = resourceVersionIn;
    return this;
  }

  public BackupRestoreExecutionWhereInput addResourceVersionInItem(Integer resourceVersionInItem) {
    if (this.resourceVersionIn == null) {
      this.resourceVersionIn = new ArrayList<Integer>();
    }
    this.resourceVersionIn.add(resourceVersionInItem);
    return this;
  }

   /**
   * Get resourceVersionIn
   * @return resourceVersionIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getResourceVersionIn() {
    return resourceVersionIn;
  }


  public void setResourceVersionIn(List<Integer> resourceVersionIn) {
    this.resourceVersionIn = resourceVersionIn;
  }


  public BackupRestoreExecutionWhereInput resourceVersionLt(Integer resourceVersionLt) {
    
    this.resourceVersionLt = resourceVersionLt;
    return this;
  }

   /**
   * Get resourceVersionLt
   * @return resourceVersionLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getResourceVersionLt() {
    return resourceVersionLt;
  }


  public void setResourceVersionLt(Integer resourceVersionLt) {
    this.resourceVersionLt = resourceVersionLt;
  }


  public BackupRestoreExecutionWhereInput resourceVersionLte(Integer resourceVersionLte) {
    
    this.resourceVersionLte = resourceVersionLte;
    return this;
  }

   /**
   * Get resourceVersionLte
   * @return resourceVersionLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getResourceVersionLte() {
    return resourceVersionLte;
  }


  public void setResourceVersionLte(Integer resourceVersionLte) {
    this.resourceVersionLte = resourceVersionLte;
  }


  public BackupRestoreExecutionWhereInput resourceVersionNot(Integer resourceVersionNot) {
    
    this.resourceVersionNot = resourceVersionNot;
    return this;
  }

   /**
   * Get resourceVersionNot
   * @return resourceVersionNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getResourceVersionNot() {
    return resourceVersionNot;
  }


  public void setResourceVersionNot(Integer resourceVersionNot) {
    this.resourceVersionNot = resourceVersionNot;
  }


  public BackupRestoreExecutionWhereInput resourceVersionNotIn(List<Integer> resourceVersionNotIn) {
    
    this.resourceVersionNotIn = resourceVersionNotIn;
    return this;
  }

  public BackupRestoreExecutionWhereInput addResourceVersionNotInItem(Integer resourceVersionNotInItem) {
    if (this.resourceVersionNotIn == null) {
      this.resourceVersionNotIn = new ArrayList<Integer>();
    }
    this.resourceVersionNotIn.add(resourceVersionNotInItem);
    return this;
  }

   /**
   * Get resourceVersionNotIn
   * @return resourceVersionNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getResourceVersionNotIn() {
    return resourceVersionNotIn;
  }


  public void setResourceVersionNotIn(List<Integer> resourceVersionNotIn) {
    this.resourceVersionNotIn = resourceVersionNotIn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupRestoreExecutionWhereInput backupRestoreExecutionWhereInput = (BackupRestoreExecutionWhereInput) o;
    return Objects.equals(this.AND, backupRestoreExecutionWhereInput.AND) &&
        Objects.equals(this.NOT, backupRestoreExecutionWhereInput.NOT) &&
        Objects.equals(this.OR, backupRestoreExecutionWhereInput.OR) &&
        Objects.equals(this.entityAsyncStatus, backupRestoreExecutionWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, backupRestoreExecutionWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, backupRestoreExecutionWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, backupRestoreExecutionWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.id, backupRestoreExecutionWhereInput.id) &&
        Objects.equals(this.idContains, backupRestoreExecutionWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, backupRestoreExecutionWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, backupRestoreExecutionWhereInput.idGt) &&
        Objects.equals(this.idGte, backupRestoreExecutionWhereInput.idGte) &&
        Objects.equals(this.idIn, backupRestoreExecutionWhereInput.idIn) &&
        Objects.equals(this.idLt, backupRestoreExecutionWhereInput.idLt) &&
        Objects.equals(this.idLte, backupRestoreExecutionWhereInput.idLte) &&
        Objects.equals(this.idNot, backupRestoreExecutionWhereInput.idNot) &&
        Objects.equals(this.idNotContains, backupRestoreExecutionWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, backupRestoreExecutionWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, backupRestoreExecutionWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, backupRestoreExecutionWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, backupRestoreExecutionWhereInput.idStartsWith) &&
        Objects.equals(this.name, backupRestoreExecutionWhereInput.name) &&
        Objects.equals(this.nameContains, backupRestoreExecutionWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, backupRestoreExecutionWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, backupRestoreExecutionWhereInput.nameGt) &&
        Objects.equals(this.nameGte, backupRestoreExecutionWhereInput.nameGte) &&
        Objects.equals(this.nameIn, backupRestoreExecutionWhereInput.nameIn) &&
        Objects.equals(this.nameLt, backupRestoreExecutionWhereInput.nameLt) &&
        Objects.equals(this.nameLte, backupRestoreExecutionWhereInput.nameLte) &&
        Objects.equals(this.nameNot, backupRestoreExecutionWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, backupRestoreExecutionWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, backupRestoreExecutionWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, backupRestoreExecutionWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, backupRestoreExecutionWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, backupRestoreExecutionWhereInput.nameStartsWith) &&
        Objects.equals(this.resourceVersionGt, backupRestoreExecutionWhereInput.resourceVersionGt) &&
        Objects.equals(this.resourceVersionGte, backupRestoreExecutionWhereInput.resourceVersionGte) &&
        Objects.equals(this.resourceVersionIn, backupRestoreExecutionWhereInput.resourceVersionIn) &&
        Objects.equals(this.resourceVersionLt, backupRestoreExecutionWhereInput.resourceVersionLt) &&
        Objects.equals(this.resourceVersionLte, backupRestoreExecutionWhereInput.resourceVersionLte) &&
        Objects.equals(this.resourceVersionNot, backupRestoreExecutionWhereInput.resourceVersionNot) &&
        Objects.equals(this.resourceVersionNotIn, backupRestoreExecutionWhereInput.resourceVersionNotIn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, resourceVersionGt, resourceVersionGte, resourceVersionIn, resourceVersionLt, resourceVersionLte, resourceVersionNot, resourceVersionNotIn);
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
    sb.append("class BackupRestoreExecutionWhereInput {\n");
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
    sb.append("    resourceVersionGt: ").append(toIndentedString(resourceVersionGt)).append("\n");
    sb.append("    resourceVersionGte: ").append(toIndentedString(resourceVersionGte)).append("\n");
    sb.append("    resourceVersionIn: ").append(toIndentedString(resourceVersionIn)).append("\n");
    sb.append("    resourceVersionLt: ").append(toIndentedString(resourceVersionLt)).append("\n");
    sb.append("    resourceVersionLte: ").append(toIndentedString(resourceVersionLte)).append("\n");
    sb.append("    resourceVersionNot: ").append(toIndentedString(resourceVersionNot)).append("\n");
    sb.append("    resourceVersionNotIn: ").append(toIndentedString(resourceVersionNotIn)).append("\n");
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

