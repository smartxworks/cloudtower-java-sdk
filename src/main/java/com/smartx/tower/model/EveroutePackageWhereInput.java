package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.Architecture;
import com.smartx.tower.model.EntityAsyncStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * EveroutePackageWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class EveroutePackageWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<EveroutePackageWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<EveroutePackageWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<EveroutePackageWhereInput> OR = null;

  public static final String SERIALIZED_NAME_ARCH = "arch";
  @SerializedName(SERIALIZED_NAME_ARCH)
  private Architecture arch;

  public static final String SERIALIZED_NAME_ARCH_IN = "arch_in";
  @SerializedName(SERIALIZED_NAME_ARCH_IN)
  private List<Architecture> archIn = null;

  public static final String SERIALIZED_NAME_ARCH_NOT = "arch_not";
  @SerializedName(SERIALIZED_NAME_ARCH_NOT)
  private Architecture archNot;

  public static final String SERIALIZED_NAME_ARCH_NOT_IN = "arch_not_in";
  @SerializedName(SERIALIZED_NAME_ARCH_NOT_IN)
  private List<Architecture> archNotIn = null;

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

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
  private String localCreatedAt;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_GT = "local_created_at_gt";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_GT)
  private String localCreatedAtGt;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_GTE = "local_created_at_gte";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE)
  private String localCreatedAtGte;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_IN = "local_created_at_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_IN)
  private List<String> localCreatedAtIn = null;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_LT = "local_created_at_lt";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_LT)
  private String localCreatedAtLt;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_LTE = "local_created_at_lte";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE)
  private String localCreatedAtLte;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_NOT = "local_created_at_not";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT)
  private String localCreatedAtNot;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN = "local_created_at_not_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN)
  private List<String> localCreatedAtNotIn = null;

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

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_SIZE_GT = "size_gt";
  @SerializedName(SERIALIZED_NAME_SIZE_GT)
  private Long sizeGt;

  public static final String SERIALIZED_NAME_SIZE_GTE = "size_gte";
  @SerializedName(SERIALIZED_NAME_SIZE_GTE)
  private Long sizeGte;

  public static final String SERIALIZED_NAME_SIZE_IN = "size_in";
  @SerializedName(SERIALIZED_NAME_SIZE_IN)
  private List<Long> sizeIn = null;

  public static final String SERIALIZED_NAME_SIZE_LT = "size_lt";
  @SerializedName(SERIALIZED_NAME_SIZE_LT)
  private Long sizeLt;

  public static final String SERIALIZED_NAME_SIZE_LTE = "size_lte";
  @SerializedName(SERIALIZED_NAME_SIZE_LTE)
  private Long sizeLte;

  public static final String SERIALIZED_NAME_SIZE_NOT = "size_not";
  @SerializedName(SERIALIZED_NAME_SIZE_NOT)
  private Long sizeNot;

  public static final String SERIALIZED_NAME_SIZE_NOT_IN = "size_not_in";
  @SerializedName(SERIALIZED_NAME_SIZE_NOT_IN)
  private List<Long> sizeNotIn = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_VERSION_CONTAINS = "version_contains";
  @SerializedName(SERIALIZED_NAME_VERSION_CONTAINS)
  private String versionContains;

  public static final String SERIALIZED_NAME_VERSION_ENDS_WITH = "version_ends_with";
  @SerializedName(SERIALIZED_NAME_VERSION_ENDS_WITH)
  private String versionEndsWith;

  public static final String SERIALIZED_NAME_VERSION_GT = "version_gt";
  @SerializedName(SERIALIZED_NAME_VERSION_GT)
  private String versionGt;

  public static final String SERIALIZED_NAME_VERSION_GTE = "version_gte";
  @SerializedName(SERIALIZED_NAME_VERSION_GTE)
  private String versionGte;

  public static final String SERIALIZED_NAME_VERSION_IN = "version_in";
  @SerializedName(SERIALIZED_NAME_VERSION_IN)
  private List<String> versionIn = null;

  public static final String SERIALIZED_NAME_VERSION_LT = "version_lt";
  @SerializedName(SERIALIZED_NAME_VERSION_LT)
  private String versionLt;

  public static final String SERIALIZED_NAME_VERSION_LTE = "version_lte";
  @SerializedName(SERIALIZED_NAME_VERSION_LTE)
  private String versionLte;

  public static final String SERIALIZED_NAME_VERSION_NOT = "version_not";
  @SerializedName(SERIALIZED_NAME_VERSION_NOT)
  private String versionNot;

  public static final String SERIALIZED_NAME_VERSION_NOT_CONTAINS = "version_not_contains";
  @SerializedName(SERIALIZED_NAME_VERSION_NOT_CONTAINS)
  private String versionNotContains;

  public static final String SERIALIZED_NAME_VERSION_NOT_ENDS_WITH = "version_not_ends_with";
  @SerializedName(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH)
  private String versionNotEndsWith;

  public static final String SERIALIZED_NAME_VERSION_NOT_IN = "version_not_in";
  @SerializedName(SERIALIZED_NAME_VERSION_NOT_IN)
  private List<String> versionNotIn = null;

  public static final String SERIALIZED_NAME_VERSION_NOT_STARTS_WITH = "version_not_starts_with";
  @SerializedName(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH)
  private String versionNotStartsWith;

  public static final String SERIALIZED_NAME_VERSION_STARTS_WITH = "version_starts_with";
  @SerializedName(SERIALIZED_NAME_VERSION_STARTS_WITH)
  private String versionStartsWith;

  public EveroutePackageWhereInput() { 
  }

  public EveroutePackageWhereInput AND(List<EveroutePackageWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public EveroutePackageWhereInput addANDItem(EveroutePackageWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<EveroutePackageWhereInput>();
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

  public List<EveroutePackageWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<EveroutePackageWhereInput> AND) {
    this.AND = AND;
  }


  public EveroutePackageWhereInput NOT(List<EveroutePackageWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public EveroutePackageWhereInput addNOTItem(EveroutePackageWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<EveroutePackageWhereInput>();
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

  public List<EveroutePackageWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<EveroutePackageWhereInput> NOT) {
    this.NOT = NOT;
  }


  public EveroutePackageWhereInput OR(List<EveroutePackageWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public EveroutePackageWhereInput addORItem(EveroutePackageWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<EveroutePackageWhereInput>();
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

  public List<EveroutePackageWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<EveroutePackageWhereInput> OR) {
    this.OR = OR;
  }


  public EveroutePackageWhereInput arch(Architecture arch) {
    
    this.arch = arch;
    return this;
  }

   /**
   * Get arch
   * @return arch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Architecture getArch() {
    return arch;
  }


  public void setArch(Architecture arch) {
    this.arch = arch;
  }


  public EveroutePackageWhereInput archIn(List<Architecture> archIn) {
    
    this.archIn = archIn;
    return this;
  }

  public EveroutePackageWhereInput addArchInItem(Architecture archInItem) {
    if (this.archIn == null) {
      this.archIn = new ArrayList<Architecture>();
    }
    this.archIn.add(archInItem);
    return this;
  }

   /**
   * Get archIn
   * @return archIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Architecture> getArchIn() {
    return archIn;
  }


  public void setArchIn(List<Architecture> archIn) {
    this.archIn = archIn;
  }


  public EveroutePackageWhereInput archNot(Architecture archNot) {
    
    this.archNot = archNot;
    return this;
  }

   /**
   * Get archNot
   * @return archNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Architecture getArchNot() {
    return archNot;
  }


  public void setArchNot(Architecture archNot) {
    this.archNot = archNot;
  }


  public EveroutePackageWhereInput archNotIn(List<Architecture> archNotIn) {
    
    this.archNotIn = archNotIn;
    return this;
  }

  public EveroutePackageWhereInput addArchNotInItem(Architecture archNotInItem) {
    if (this.archNotIn == null) {
      this.archNotIn = new ArrayList<Architecture>();
    }
    this.archNotIn.add(archNotInItem);
    return this;
  }

   /**
   * Get archNotIn
   * @return archNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Architecture> getArchNotIn() {
    return archNotIn;
  }


  public void setArchNotIn(List<Architecture> archNotIn) {
    this.archNotIn = archNotIn;
  }


  public EveroutePackageWhereInput description(String description) {
    
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


  public EveroutePackageWhereInput descriptionContains(String descriptionContains) {
    
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


  public EveroutePackageWhereInput descriptionEndsWith(String descriptionEndsWith) {
    
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


  public EveroutePackageWhereInput descriptionGt(String descriptionGt) {
    
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


  public EveroutePackageWhereInput descriptionGte(String descriptionGte) {
    
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


  public EveroutePackageWhereInput descriptionIn(List<String> descriptionIn) {
    
    this.descriptionIn = descriptionIn;
    return this;
  }

  public EveroutePackageWhereInput addDescriptionInItem(String descriptionInItem) {
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


  public EveroutePackageWhereInput descriptionLt(String descriptionLt) {
    
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


  public EveroutePackageWhereInput descriptionLte(String descriptionLte) {
    
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


  public EveroutePackageWhereInput descriptionNot(String descriptionNot) {
    
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


  public EveroutePackageWhereInput descriptionNotContains(String descriptionNotContains) {
    
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


  public EveroutePackageWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {
    
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


  public EveroutePackageWhereInput descriptionNotIn(List<String> descriptionNotIn) {
    
    this.descriptionNotIn = descriptionNotIn;
    return this;
  }

  public EveroutePackageWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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


  public EveroutePackageWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {
    
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


  public EveroutePackageWhereInput descriptionStartsWith(String descriptionStartsWith) {
    
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


  public EveroutePackageWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public EveroutePackageWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public EveroutePackageWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public EveroutePackageWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public EveroutePackageWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public EveroutePackageWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public EveroutePackageWhereInput id(String id) {
    
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


  public EveroutePackageWhereInput idContains(String idContains) {
    
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


  public EveroutePackageWhereInput idEndsWith(String idEndsWith) {
    
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


  public EveroutePackageWhereInput idGt(String idGt) {
    
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


  public EveroutePackageWhereInput idGte(String idGte) {
    
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


  public EveroutePackageWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public EveroutePackageWhereInput addIdInItem(String idInItem) {
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


  public EveroutePackageWhereInput idLt(String idLt) {
    
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


  public EveroutePackageWhereInput idLte(String idLte) {
    
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


  public EveroutePackageWhereInput idNot(String idNot) {
    
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


  public EveroutePackageWhereInput idNotContains(String idNotContains) {
    
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


  public EveroutePackageWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public EveroutePackageWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public EveroutePackageWhereInput addIdNotInItem(String idNotInItem) {
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


  public EveroutePackageWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public EveroutePackageWhereInput idStartsWith(String idStartsWith) {
    
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


  public EveroutePackageWhereInput localCreatedAt(String localCreatedAt) {
    
    this.localCreatedAt = localCreatedAt;
    return this;
  }

   /**
   * Get localCreatedAt
   * @return localCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAt() {
    return localCreatedAt;
  }


  public void setLocalCreatedAt(String localCreatedAt) {
    this.localCreatedAt = localCreatedAt;
  }


  public EveroutePackageWhereInput localCreatedAtGt(String localCreatedAtGt) {
    
    this.localCreatedAtGt = localCreatedAtGt;
    return this;
  }

   /**
   * Get localCreatedAtGt
   * @return localCreatedAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtGt() {
    return localCreatedAtGt;
  }


  public void setLocalCreatedAtGt(String localCreatedAtGt) {
    this.localCreatedAtGt = localCreatedAtGt;
  }


  public EveroutePackageWhereInput localCreatedAtGte(String localCreatedAtGte) {
    
    this.localCreatedAtGte = localCreatedAtGte;
    return this;
  }

   /**
   * Get localCreatedAtGte
   * @return localCreatedAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtGte() {
    return localCreatedAtGte;
  }


  public void setLocalCreatedAtGte(String localCreatedAtGte) {
    this.localCreatedAtGte = localCreatedAtGte;
  }


  public EveroutePackageWhereInput localCreatedAtIn(List<String> localCreatedAtIn) {
    
    this.localCreatedAtIn = localCreatedAtIn;
    return this;
  }

  public EveroutePackageWhereInput addLocalCreatedAtInItem(String localCreatedAtInItem) {
    if (this.localCreatedAtIn == null) {
      this.localCreatedAtIn = new ArrayList<String>();
    }
    this.localCreatedAtIn.add(localCreatedAtInItem);
    return this;
  }

   /**
   * Get localCreatedAtIn
   * @return localCreatedAtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalCreatedAtIn() {
    return localCreatedAtIn;
  }


  public void setLocalCreatedAtIn(List<String> localCreatedAtIn) {
    this.localCreatedAtIn = localCreatedAtIn;
  }


  public EveroutePackageWhereInput localCreatedAtLt(String localCreatedAtLt) {
    
    this.localCreatedAtLt = localCreatedAtLt;
    return this;
  }

   /**
   * Get localCreatedAtLt
   * @return localCreatedAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtLt() {
    return localCreatedAtLt;
  }


  public void setLocalCreatedAtLt(String localCreatedAtLt) {
    this.localCreatedAtLt = localCreatedAtLt;
  }


  public EveroutePackageWhereInput localCreatedAtLte(String localCreatedAtLte) {
    
    this.localCreatedAtLte = localCreatedAtLte;
    return this;
  }

   /**
   * Get localCreatedAtLte
   * @return localCreatedAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtLte() {
    return localCreatedAtLte;
  }


  public void setLocalCreatedAtLte(String localCreatedAtLte) {
    this.localCreatedAtLte = localCreatedAtLte;
  }


  public EveroutePackageWhereInput localCreatedAtNot(String localCreatedAtNot) {
    
    this.localCreatedAtNot = localCreatedAtNot;
    return this;
  }

   /**
   * Get localCreatedAtNot
   * @return localCreatedAtNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtNot() {
    return localCreatedAtNot;
  }


  public void setLocalCreatedAtNot(String localCreatedAtNot) {
    this.localCreatedAtNot = localCreatedAtNot;
  }


  public EveroutePackageWhereInput localCreatedAtNotIn(List<String> localCreatedAtNotIn) {
    
    this.localCreatedAtNotIn = localCreatedAtNotIn;
    return this;
  }

  public EveroutePackageWhereInput addLocalCreatedAtNotInItem(String localCreatedAtNotInItem) {
    if (this.localCreatedAtNotIn == null) {
      this.localCreatedAtNotIn = new ArrayList<String>();
    }
    this.localCreatedAtNotIn.add(localCreatedAtNotInItem);
    return this;
  }

   /**
   * Get localCreatedAtNotIn
   * @return localCreatedAtNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalCreatedAtNotIn() {
    return localCreatedAtNotIn;
  }


  public void setLocalCreatedAtNotIn(List<String> localCreatedAtNotIn) {
    this.localCreatedAtNotIn = localCreatedAtNotIn;
  }


  public EveroutePackageWhereInput name(String name) {
    
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


  public EveroutePackageWhereInput nameContains(String nameContains) {
    
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


  public EveroutePackageWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public EveroutePackageWhereInput nameGt(String nameGt) {
    
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


  public EveroutePackageWhereInput nameGte(String nameGte) {
    
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


  public EveroutePackageWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public EveroutePackageWhereInput addNameInItem(String nameInItem) {
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


  public EveroutePackageWhereInput nameLt(String nameLt) {
    
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


  public EveroutePackageWhereInput nameLte(String nameLte) {
    
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


  public EveroutePackageWhereInput nameNot(String nameNot) {
    
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


  public EveroutePackageWhereInput nameNotContains(String nameNotContains) {
    
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


  public EveroutePackageWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public EveroutePackageWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public EveroutePackageWhereInput addNameNotInItem(String nameNotInItem) {
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


  public EveroutePackageWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public EveroutePackageWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public EveroutePackageWhereInput size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public EveroutePackageWhereInput sizeGt(Long sizeGt) {
    
    this.sizeGt = sizeGt;
    return this;
  }

   /**
   * Get sizeGt
   * @return sizeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeGt() {
    return sizeGt;
  }


  public void setSizeGt(Long sizeGt) {
    this.sizeGt = sizeGt;
  }


  public EveroutePackageWhereInput sizeGte(Long sizeGte) {
    
    this.sizeGte = sizeGte;
    return this;
  }

   /**
   * Get sizeGte
   * @return sizeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeGte() {
    return sizeGte;
  }


  public void setSizeGte(Long sizeGte) {
    this.sizeGte = sizeGte;
  }


  public EveroutePackageWhereInput sizeIn(List<Long> sizeIn) {
    
    this.sizeIn = sizeIn;
    return this;
  }

  public EveroutePackageWhereInput addSizeInItem(Long sizeInItem) {
    if (this.sizeIn == null) {
      this.sizeIn = new ArrayList<Long>();
    }
    this.sizeIn.add(sizeInItem);
    return this;
  }

   /**
   * Get sizeIn
   * @return sizeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getSizeIn() {
    return sizeIn;
  }


  public void setSizeIn(List<Long> sizeIn) {
    this.sizeIn = sizeIn;
  }


  public EveroutePackageWhereInput sizeLt(Long sizeLt) {
    
    this.sizeLt = sizeLt;
    return this;
  }

   /**
   * Get sizeLt
   * @return sizeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeLt() {
    return sizeLt;
  }


  public void setSizeLt(Long sizeLt) {
    this.sizeLt = sizeLt;
  }


  public EveroutePackageWhereInput sizeLte(Long sizeLte) {
    
    this.sizeLte = sizeLte;
    return this;
  }

   /**
   * Get sizeLte
   * @return sizeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeLte() {
    return sizeLte;
  }


  public void setSizeLte(Long sizeLte) {
    this.sizeLte = sizeLte;
  }


  public EveroutePackageWhereInput sizeNot(Long sizeNot) {
    
    this.sizeNot = sizeNot;
    return this;
  }

   /**
   * Get sizeNot
   * @return sizeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeNot() {
    return sizeNot;
  }


  public void setSizeNot(Long sizeNot) {
    this.sizeNot = sizeNot;
  }


  public EveroutePackageWhereInput sizeNotIn(List<Long> sizeNotIn) {
    
    this.sizeNotIn = sizeNotIn;
    return this;
  }

  public EveroutePackageWhereInput addSizeNotInItem(Long sizeNotInItem) {
    if (this.sizeNotIn == null) {
      this.sizeNotIn = new ArrayList<Long>();
    }
    this.sizeNotIn.add(sizeNotInItem);
    return this;
  }

   /**
   * Get sizeNotIn
   * @return sizeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getSizeNotIn() {
    return sizeNotIn;
  }


  public void setSizeNotIn(List<Long> sizeNotIn) {
    this.sizeNotIn = sizeNotIn;
  }


  public EveroutePackageWhereInput version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public EveroutePackageWhereInput versionContains(String versionContains) {
    
    this.versionContains = versionContains;
    return this;
  }

   /**
   * Get versionContains
   * @return versionContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionContains() {
    return versionContains;
  }


  public void setVersionContains(String versionContains) {
    this.versionContains = versionContains;
  }


  public EveroutePackageWhereInput versionEndsWith(String versionEndsWith) {
    
    this.versionEndsWith = versionEndsWith;
    return this;
  }

   /**
   * Get versionEndsWith
   * @return versionEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionEndsWith() {
    return versionEndsWith;
  }


  public void setVersionEndsWith(String versionEndsWith) {
    this.versionEndsWith = versionEndsWith;
  }


  public EveroutePackageWhereInput versionGt(String versionGt) {
    
    this.versionGt = versionGt;
    return this;
  }

   /**
   * Get versionGt
   * @return versionGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionGt() {
    return versionGt;
  }


  public void setVersionGt(String versionGt) {
    this.versionGt = versionGt;
  }


  public EveroutePackageWhereInput versionGte(String versionGte) {
    
    this.versionGte = versionGte;
    return this;
  }

   /**
   * Get versionGte
   * @return versionGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionGte() {
    return versionGte;
  }


  public void setVersionGte(String versionGte) {
    this.versionGte = versionGte;
  }


  public EveroutePackageWhereInput versionIn(List<String> versionIn) {
    
    this.versionIn = versionIn;
    return this;
  }

  public EveroutePackageWhereInput addVersionInItem(String versionInItem) {
    if (this.versionIn == null) {
      this.versionIn = new ArrayList<String>();
    }
    this.versionIn.add(versionInItem);
    return this;
  }

   /**
   * Get versionIn
   * @return versionIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getVersionIn() {
    return versionIn;
  }


  public void setVersionIn(List<String> versionIn) {
    this.versionIn = versionIn;
  }


  public EveroutePackageWhereInput versionLt(String versionLt) {
    
    this.versionLt = versionLt;
    return this;
  }

   /**
   * Get versionLt
   * @return versionLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionLt() {
    return versionLt;
  }


  public void setVersionLt(String versionLt) {
    this.versionLt = versionLt;
  }


  public EveroutePackageWhereInput versionLte(String versionLte) {
    
    this.versionLte = versionLte;
    return this;
  }

   /**
   * Get versionLte
   * @return versionLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionLte() {
    return versionLte;
  }


  public void setVersionLte(String versionLte) {
    this.versionLte = versionLte;
  }


  public EveroutePackageWhereInput versionNot(String versionNot) {
    
    this.versionNot = versionNot;
    return this;
  }

   /**
   * Get versionNot
   * @return versionNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionNot() {
    return versionNot;
  }


  public void setVersionNot(String versionNot) {
    this.versionNot = versionNot;
  }


  public EveroutePackageWhereInput versionNotContains(String versionNotContains) {
    
    this.versionNotContains = versionNotContains;
    return this;
  }

   /**
   * Get versionNotContains
   * @return versionNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionNotContains() {
    return versionNotContains;
  }


  public void setVersionNotContains(String versionNotContains) {
    this.versionNotContains = versionNotContains;
  }


  public EveroutePackageWhereInput versionNotEndsWith(String versionNotEndsWith) {
    
    this.versionNotEndsWith = versionNotEndsWith;
    return this;
  }

   /**
   * Get versionNotEndsWith
   * @return versionNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionNotEndsWith() {
    return versionNotEndsWith;
  }


  public void setVersionNotEndsWith(String versionNotEndsWith) {
    this.versionNotEndsWith = versionNotEndsWith;
  }


  public EveroutePackageWhereInput versionNotIn(List<String> versionNotIn) {
    
    this.versionNotIn = versionNotIn;
    return this;
  }

  public EveroutePackageWhereInput addVersionNotInItem(String versionNotInItem) {
    if (this.versionNotIn == null) {
      this.versionNotIn = new ArrayList<String>();
    }
    this.versionNotIn.add(versionNotInItem);
    return this;
  }

   /**
   * Get versionNotIn
   * @return versionNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getVersionNotIn() {
    return versionNotIn;
  }


  public void setVersionNotIn(List<String> versionNotIn) {
    this.versionNotIn = versionNotIn;
  }


  public EveroutePackageWhereInput versionNotStartsWith(String versionNotStartsWith) {
    
    this.versionNotStartsWith = versionNotStartsWith;
    return this;
  }

   /**
   * Get versionNotStartsWith
   * @return versionNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionNotStartsWith() {
    return versionNotStartsWith;
  }


  public void setVersionNotStartsWith(String versionNotStartsWith) {
    this.versionNotStartsWith = versionNotStartsWith;
  }


  public EveroutePackageWhereInput versionStartsWith(String versionStartsWith) {
    
    this.versionStartsWith = versionStartsWith;
    return this;
  }

   /**
   * Get versionStartsWith
   * @return versionStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionStartsWith() {
    return versionStartsWith;
  }


  public void setVersionStartsWith(String versionStartsWith) {
    this.versionStartsWith = versionStartsWith;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EveroutePackageWhereInput everoutePackageWhereInput = (EveroutePackageWhereInput) o;
    return Objects.equals(this.AND, everoutePackageWhereInput.AND) &&
        Objects.equals(this.NOT, everoutePackageWhereInput.NOT) &&
        Objects.equals(this.OR, everoutePackageWhereInput.OR) &&
        Objects.equals(this.arch, everoutePackageWhereInput.arch) &&
        Objects.equals(this.archIn, everoutePackageWhereInput.archIn) &&
        Objects.equals(this.archNot, everoutePackageWhereInput.archNot) &&
        Objects.equals(this.archNotIn, everoutePackageWhereInput.archNotIn) &&
        Objects.equals(this.description, everoutePackageWhereInput.description) &&
        Objects.equals(this.descriptionContains, everoutePackageWhereInput.descriptionContains) &&
        Objects.equals(this.descriptionEndsWith, everoutePackageWhereInput.descriptionEndsWith) &&
        Objects.equals(this.descriptionGt, everoutePackageWhereInput.descriptionGt) &&
        Objects.equals(this.descriptionGte, everoutePackageWhereInput.descriptionGte) &&
        Objects.equals(this.descriptionIn, everoutePackageWhereInput.descriptionIn) &&
        Objects.equals(this.descriptionLt, everoutePackageWhereInput.descriptionLt) &&
        Objects.equals(this.descriptionLte, everoutePackageWhereInput.descriptionLte) &&
        Objects.equals(this.descriptionNot, everoutePackageWhereInput.descriptionNot) &&
        Objects.equals(this.descriptionNotContains, everoutePackageWhereInput.descriptionNotContains) &&
        Objects.equals(this.descriptionNotEndsWith, everoutePackageWhereInput.descriptionNotEndsWith) &&
        Objects.equals(this.descriptionNotIn, everoutePackageWhereInput.descriptionNotIn) &&
        Objects.equals(this.descriptionNotStartsWith, everoutePackageWhereInput.descriptionNotStartsWith) &&
        Objects.equals(this.descriptionStartsWith, everoutePackageWhereInput.descriptionStartsWith) &&
        Objects.equals(this.entityAsyncStatus, everoutePackageWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, everoutePackageWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, everoutePackageWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, everoutePackageWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.id, everoutePackageWhereInput.id) &&
        Objects.equals(this.idContains, everoutePackageWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, everoutePackageWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, everoutePackageWhereInput.idGt) &&
        Objects.equals(this.idGte, everoutePackageWhereInput.idGte) &&
        Objects.equals(this.idIn, everoutePackageWhereInput.idIn) &&
        Objects.equals(this.idLt, everoutePackageWhereInput.idLt) &&
        Objects.equals(this.idLte, everoutePackageWhereInput.idLte) &&
        Objects.equals(this.idNot, everoutePackageWhereInput.idNot) &&
        Objects.equals(this.idNotContains, everoutePackageWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, everoutePackageWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, everoutePackageWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, everoutePackageWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, everoutePackageWhereInput.idStartsWith) &&
        Objects.equals(this.localCreatedAt, everoutePackageWhereInput.localCreatedAt) &&
        Objects.equals(this.localCreatedAtGt, everoutePackageWhereInput.localCreatedAtGt) &&
        Objects.equals(this.localCreatedAtGte, everoutePackageWhereInput.localCreatedAtGte) &&
        Objects.equals(this.localCreatedAtIn, everoutePackageWhereInput.localCreatedAtIn) &&
        Objects.equals(this.localCreatedAtLt, everoutePackageWhereInput.localCreatedAtLt) &&
        Objects.equals(this.localCreatedAtLte, everoutePackageWhereInput.localCreatedAtLte) &&
        Objects.equals(this.localCreatedAtNot, everoutePackageWhereInput.localCreatedAtNot) &&
        Objects.equals(this.localCreatedAtNotIn, everoutePackageWhereInput.localCreatedAtNotIn) &&
        Objects.equals(this.name, everoutePackageWhereInput.name) &&
        Objects.equals(this.nameContains, everoutePackageWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, everoutePackageWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, everoutePackageWhereInput.nameGt) &&
        Objects.equals(this.nameGte, everoutePackageWhereInput.nameGte) &&
        Objects.equals(this.nameIn, everoutePackageWhereInput.nameIn) &&
        Objects.equals(this.nameLt, everoutePackageWhereInput.nameLt) &&
        Objects.equals(this.nameLte, everoutePackageWhereInput.nameLte) &&
        Objects.equals(this.nameNot, everoutePackageWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, everoutePackageWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, everoutePackageWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, everoutePackageWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, everoutePackageWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, everoutePackageWhereInput.nameStartsWith) &&
        Objects.equals(this.size, everoutePackageWhereInput.size) &&
        Objects.equals(this.sizeGt, everoutePackageWhereInput.sizeGt) &&
        Objects.equals(this.sizeGte, everoutePackageWhereInput.sizeGte) &&
        Objects.equals(this.sizeIn, everoutePackageWhereInput.sizeIn) &&
        Objects.equals(this.sizeLt, everoutePackageWhereInput.sizeLt) &&
        Objects.equals(this.sizeLte, everoutePackageWhereInput.sizeLte) &&
        Objects.equals(this.sizeNot, everoutePackageWhereInput.sizeNot) &&
        Objects.equals(this.sizeNotIn, everoutePackageWhereInput.sizeNotIn) &&
        Objects.equals(this.version, everoutePackageWhereInput.version) &&
        Objects.equals(this.versionContains, everoutePackageWhereInput.versionContains) &&
        Objects.equals(this.versionEndsWith, everoutePackageWhereInput.versionEndsWith) &&
        Objects.equals(this.versionGt, everoutePackageWhereInput.versionGt) &&
        Objects.equals(this.versionGte, everoutePackageWhereInput.versionGte) &&
        Objects.equals(this.versionIn, everoutePackageWhereInput.versionIn) &&
        Objects.equals(this.versionLt, everoutePackageWhereInput.versionLt) &&
        Objects.equals(this.versionLte, everoutePackageWhereInput.versionLte) &&
        Objects.equals(this.versionNot, everoutePackageWhereInput.versionNot) &&
        Objects.equals(this.versionNotContains, everoutePackageWhereInput.versionNotContains) &&
        Objects.equals(this.versionNotEndsWith, everoutePackageWhereInput.versionNotEndsWith) &&
        Objects.equals(this.versionNotIn, everoutePackageWhereInput.versionNotIn) &&
        Objects.equals(this.versionNotStartsWith, everoutePackageWhereInput.versionNotStartsWith) &&
        Objects.equals(this.versionStartsWith, everoutePackageWhereInput.versionStartsWith);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, arch, archIn, archNot, archNotIn, description, descriptionContains, descriptionEndsWith, descriptionGt, descriptionGte, descriptionIn, descriptionLt, descriptionLte, descriptionNot, descriptionNotContains, descriptionNotEndsWith, descriptionNotIn, descriptionNotStartsWith, descriptionStartsWith, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, localCreatedAt, localCreatedAtGt, localCreatedAtGte, localCreatedAtIn, localCreatedAtLt, localCreatedAtLte, localCreatedAtNot, localCreatedAtNotIn, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, size, sizeGt, sizeGte, sizeIn, sizeLt, sizeLte, sizeNot, sizeNotIn, version, versionContains, versionEndsWith, versionGt, versionGte, versionIn, versionLt, versionLte, versionNot, versionNotContains, versionNotEndsWith, versionNotIn, versionNotStartsWith, versionStartsWith);
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
    sb.append("class EveroutePackageWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
    sb.append("    archIn: ").append(toIndentedString(archIn)).append("\n");
    sb.append("    archNot: ").append(toIndentedString(archNot)).append("\n");
    sb.append("    archNotIn: ").append(toIndentedString(archNotIn)).append("\n");
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
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    localCreatedAtGt: ").append(toIndentedString(localCreatedAtGt)).append("\n");
    sb.append("    localCreatedAtGte: ").append(toIndentedString(localCreatedAtGte)).append("\n");
    sb.append("    localCreatedAtIn: ").append(toIndentedString(localCreatedAtIn)).append("\n");
    sb.append("    localCreatedAtLt: ").append(toIndentedString(localCreatedAtLt)).append("\n");
    sb.append("    localCreatedAtLte: ").append(toIndentedString(localCreatedAtLte)).append("\n");
    sb.append("    localCreatedAtNot: ").append(toIndentedString(localCreatedAtNot)).append("\n");
    sb.append("    localCreatedAtNotIn: ").append(toIndentedString(localCreatedAtNotIn)).append("\n");
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
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sizeGt: ").append(toIndentedString(sizeGt)).append("\n");
    sb.append("    sizeGte: ").append(toIndentedString(sizeGte)).append("\n");
    sb.append("    sizeIn: ").append(toIndentedString(sizeIn)).append("\n");
    sb.append("    sizeLt: ").append(toIndentedString(sizeLt)).append("\n");
    sb.append("    sizeLte: ").append(toIndentedString(sizeLte)).append("\n");
    sb.append("    sizeNot: ").append(toIndentedString(sizeNot)).append("\n");
    sb.append("    sizeNotIn: ").append(toIndentedString(sizeNotIn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionContains: ").append(toIndentedString(versionContains)).append("\n");
    sb.append("    versionEndsWith: ").append(toIndentedString(versionEndsWith)).append("\n");
    sb.append("    versionGt: ").append(toIndentedString(versionGt)).append("\n");
    sb.append("    versionGte: ").append(toIndentedString(versionGte)).append("\n");
    sb.append("    versionIn: ").append(toIndentedString(versionIn)).append("\n");
    sb.append("    versionLt: ").append(toIndentedString(versionLt)).append("\n");
    sb.append("    versionLte: ").append(toIndentedString(versionLte)).append("\n");
    sb.append("    versionNot: ").append(toIndentedString(versionNot)).append("\n");
    sb.append("    versionNotContains: ").append(toIndentedString(versionNotContains)).append("\n");
    sb.append("    versionNotEndsWith: ").append(toIndentedString(versionNotEndsWith)).append("\n");
    sb.append("    versionNotIn: ").append(toIndentedString(versionNotIn)).append("\n");
    sb.append("    versionNotStartsWith: ").append(toIndentedString(versionNotStartsWith)).append("\n");
    sb.append("    versionStartsWith: ").append(toIndentedString(versionStartsWith)).append("\n");
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

