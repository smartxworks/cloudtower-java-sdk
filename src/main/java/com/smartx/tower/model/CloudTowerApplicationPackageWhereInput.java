package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.Architecture;
import com.smartx.tower.model.CloudTowerApplicationWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CloudTowerApplicationPackageWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class CloudTowerApplicationPackageWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<CloudTowerApplicationPackageWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<CloudTowerApplicationPackageWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<CloudTowerApplicationPackageWhereInput> OR = null;

  public static final String SERIALIZED_NAME_APPLICATIONS_EVERY = "applications_every";
  @SerializedName(SERIALIZED_NAME_APPLICATIONS_EVERY)
  private CloudTowerApplicationWhereInput applicationsEvery;

  public static final String SERIALIZED_NAME_APPLICATIONS_NONE = "applications_none";
  @SerializedName(SERIALIZED_NAME_APPLICATIONS_NONE)
  private CloudTowerApplicationWhereInput applicationsNone;

  public static final String SERIALIZED_NAME_APPLICATIONS_SOME = "applications_some";
  @SerializedName(SERIALIZED_NAME_APPLICATIONS_SOME)
  private CloudTowerApplicationWhereInput applicationsSome;

  public static final String SERIALIZED_NAME_ARCHITECTURE = "architecture";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
  private Architecture architecture;

  public static final String SERIALIZED_NAME_ARCHITECTURE_IN = "architecture_in";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE_IN)
  private List<Architecture> architectureIn = null;

  public static final String SERIALIZED_NAME_ARCHITECTURE_NOT = "architecture_not";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE_NOT)
  private Architecture architectureNot;

  public static final String SERIALIZED_NAME_ARCHITECTURE_NOT_IN = "architecture_not_in";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE_NOT_IN)
  private List<Architecture> architectureNotIn = null;

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

  public static final String SERIALIZED_NAME_SCOS_VERSION = "scosVersion";
  @SerializedName(SERIALIZED_NAME_SCOS_VERSION)
  private String scosVersion;

  public static final String SERIALIZED_NAME_SCOS_VERSION_CONTAINS = "scosVersion_contains";
  @SerializedName(SERIALIZED_NAME_SCOS_VERSION_CONTAINS)
  private String scosVersionContains;

  public static final String SERIALIZED_NAME_SCOS_VERSION_ENDS_WITH = "scosVersion_ends_with";
  @SerializedName(SERIALIZED_NAME_SCOS_VERSION_ENDS_WITH)
  private String scosVersionEndsWith;

  public static final String SERIALIZED_NAME_SCOS_VERSION_GT = "scosVersion_gt";
  @SerializedName(SERIALIZED_NAME_SCOS_VERSION_GT)
  private String scosVersionGt;

  public static final String SERIALIZED_NAME_SCOS_VERSION_GTE = "scosVersion_gte";
  @SerializedName(SERIALIZED_NAME_SCOS_VERSION_GTE)
  private String scosVersionGte;

  public static final String SERIALIZED_NAME_SCOS_VERSION_IN = "scosVersion_in";
  @SerializedName(SERIALIZED_NAME_SCOS_VERSION_IN)
  private List<String> scosVersionIn = null;

  public static final String SERIALIZED_NAME_SCOS_VERSION_LT = "scosVersion_lt";
  @SerializedName(SERIALIZED_NAME_SCOS_VERSION_LT)
  private String scosVersionLt;

  public static final String SERIALIZED_NAME_SCOS_VERSION_LTE = "scosVersion_lte";
  @SerializedName(SERIALIZED_NAME_SCOS_VERSION_LTE)
  private String scosVersionLte;

  public static final String SERIALIZED_NAME_SCOS_VERSION_NOT = "scosVersion_not";
  @SerializedName(SERIALIZED_NAME_SCOS_VERSION_NOT)
  private String scosVersionNot;

  public static final String SERIALIZED_NAME_SCOS_VERSION_NOT_CONTAINS = "scosVersion_not_contains";
  @SerializedName(SERIALIZED_NAME_SCOS_VERSION_NOT_CONTAINS)
  private String scosVersionNotContains;

  public static final String SERIALIZED_NAME_SCOS_VERSION_NOT_ENDS_WITH = "scosVersion_not_ends_with";
  @SerializedName(SERIALIZED_NAME_SCOS_VERSION_NOT_ENDS_WITH)
  private String scosVersionNotEndsWith;

  public static final String SERIALIZED_NAME_SCOS_VERSION_NOT_IN = "scosVersion_not_in";
  @SerializedName(SERIALIZED_NAME_SCOS_VERSION_NOT_IN)
  private List<String> scosVersionNotIn = null;

  public static final String SERIALIZED_NAME_SCOS_VERSION_NOT_STARTS_WITH = "scosVersion_not_starts_with";
  @SerializedName(SERIALIZED_NAME_SCOS_VERSION_NOT_STARTS_WITH)
  private String scosVersionNotStartsWith;

  public static final String SERIALIZED_NAME_SCOS_VERSION_STARTS_WITH = "scosVersion_starts_with";
  @SerializedName(SERIALIZED_NAME_SCOS_VERSION_STARTS_WITH)
  private String scosVersionStartsWith;

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

  public CloudTowerApplicationPackageWhereInput() { 
  }

  public CloudTowerApplicationPackageWhereInput AND(List<CloudTowerApplicationPackageWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public CloudTowerApplicationPackageWhereInput addANDItem(CloudTowerApplicationPackageWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<CloudTowerApplicationPackageWhereInput>();
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

  public List<CloudTowerApplicationPackageWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<CloudTowerApplicationPackageWhereInput> AND) {
    this.AND = AND;
  }


  public CloudTowerApplicationPackageWhereInput NOT(List<CloudTowerApplicationPackageWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public CloudTowerApplicationPackageWhereInput addNOTItem(CloudTowerApplicationPackageWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<CloudTowerApplicationPackageWhereInput>();
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

  public List<CloudTowerApplicationPackageWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<CloudTowerApplicationPackageWhereInput> NOT) {
    this.NOT = NOT;
  }


  public CloudTowerApplicationPackageWhereInput OR(List<CloudTowerApplicationPackageWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public CloudTowerApplicationPackageWhereInput addORItem(CloudTowerApplicationPackageWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<CloudTowerApplicationPackageWhereInput>();
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

  public List<CloudTowerApplicationPackageWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<CloudTowerApplicationPackageWhereInput> OR) {
    this.OR = OR;
  }


  public CloudTowerApplicationPackageWhereInput applicationsEvery(CloudTowerApplicationWhereInput applicationsEvery) {
    
    this.applicationsEvery = applicationsEvery;
    return this;
  }

   /**
   * Get applicationsEvery
   * @return applicationsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CloudTowerApplicationWhereInput getApplicationsEvery() {
    return applicationsEvery;
  }


  public void setApplicationsEvery(CloudTowerApplicationWhereInput applicationsEvery) {
    this.applicationsEvery = applicationsEvery;
  }


  public CloudTowerApplicationPackageWhereInput applicationsNone(CloudTowerApplicationWhereInput applicationsNone) {
    
    this.applicationsNone = applicationsNone;
    return this;
  }

   /**
   * Get applicationsNone
   * @return applicationsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CloudTowerApplicationWhereInput getApplicationsNone() {
    return applicationsNone;
  }


  public void setApplicationsNone(CloudTowerApplicationWhereInput applicationsNone) {
    this.applicationsNone = applicationsNone;
  }


  public CloudTowerApplicationPackageWhereInput applicationsSome(CloudTowerApplicationWhereInput applicationsSome) {
    
    this.applicationsSome = applicationsSome;
    return this;
  }

   /**
   * Get applicationsSome
   * @return applicationsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CloudTowerApplicationWhereInput getApplicationsSome() {
    return applicationsSome;
  }


  public void setApplicationsSome(CloudTowerApplicationWhereInput applicationsSome) {
    this.applicationsSome = applicationsSome;
  }


  public CloudTowerApplicationPackageWhereInput architecture(Architecture architecture) {
    
    this.architecture = architecture;
    return this;
  }

   /**
   * Get architecture
   * @return architecture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Architecture getArchitecture() {
    return architecture;
  }


  public void setArchitecture(Architecture architecture) {
    this.architecture = architecture;
  }


  public CloudTowerApplicationPackageWhereInput architectureIn(List<Architecture> architectureIn) {
    
    this.architectureIn = architectureIn;
    return this;
  }

  public CloudTowerApplicationPackageWhereInput addArchitectureInItem(Architecture architectureInItem) {
    if (this.architectureIn == null) {
      this.architectureIn = new ArrayList<Architecture>();
    }
    this.architectureIn.add(architectureInItem);
    return this;
  }

   /**
   * Get architectureIn
   * @return architectureIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Architecture> getArchitectureIn() {
    return architectureIn;
  }


  public void setArchitectureIn(List<Architecture> architectureIn) {
    this.architectureIn = architectureIn;
  }


  public CloudTowerApplicationPackageWhereInput architectureNot(Architecture architectureNot) {
    
    this.architectureNot = architectureNot;
    return this;
  }

   /**
   * Get architectureNot
   * @return architectureNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Architecture getArchitectureNot() {
    return architectureNot;
  }


  public void setArchitectureNot(Architecture architectureNot) {
    this.architectureNot = architectureNot;
  }


  public CloudTowerApplicationPackageWhereInput architectureNotIn(List<Architecture> architectureNotIn) {
    
    this.architectureNotIn = architectureNotIn;
    return this;
  }

  public CloudTowerApplicationPackageWhereInput addArchitectureNotInItem(Architecture architectureNotInItem) {
    if (this.architectureNotIn == null) {
      this.architectureNotIn = new ArrayList<Architecture>();
    }
    this.architectureNotIn.add(architectureNotInItem);
    return this;
  }

   /**
   * Get architectureNotIn
   * @return architectureNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Architecture> getArchitectureNotIn() {
    return architectureNotIn;
  }


  public void setArchitectureNotIn(List<Architecture> architectureNotIn) {
    this.architectureNotIn = architectureNotIn;
  }


  public CloudTowerApplicationPackageWhereInput id(String id) {
    
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


  public CloudTowerApplicationPackageWhereInput idContains(String idContains) {
    
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


  public CloudTowerApplicationPackageWhereInput idEndsWith(String idEndsWith) {
    
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


  public CloudTowerApplicationPackageWhereInput idGt(String idGt) {
    
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


  public CloudTowerApplicationPackageWhereInput idGte(String idGte) {
    
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


  public CloudTowerApplicationPackageWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public CloudTowerApplicationPackageWhereInput addIdInItem(String idInItem) {
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


  public CloudTowerApplicationPackageWhereInput idLt(String idLt) {
    
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


  public CloudTowerApplicationPackageWhereInput idLte(String idLte) {
    
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


  public CloudTowerApplicationPackageWhereInput idNot(String idNot) {
    
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


  public CloudTowerApplicationPackageWhereInput idNotContains(String idNotContains) {
    
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


  public CloudTowerApplicationPackageWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public CloudTowerApplicationPackageWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public CloudTowerApplicationPackageWhereInput addIdNotInItem(String idNotInItem) {
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


  public CloudTowerApplicationPackageWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public CloudTowerApplicationPackageWhereInput idStartsWith(String idStartsWith) {
    
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


  public CloudTowerApplicationPackageWhereInput name(String name) {
    
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


  public CloudTowerApplicationPackageWhereInput nameContains(String nameContains) {
    
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


  public CloudTowerApplicationPackageWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public CloudTowerApplicationPackageWhereInput nameGt(String nameGt) {
    
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


  public CloudTowerApplicationPackageWhereInput nameGte(String nameGte) {
    
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


  public CloudTowerApplicationPackageWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public CloudTowerApplicationPackageWhereInput addNameInItem(String nameInItem) {
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


  public CloudTowerApplicationPackageWhereInput nameLt(String nameLt) {
    
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


  public CloudTowerApplicationPackageWhereInput nameLte(String nameLte) {
    
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


  public CloudTowerApplicationPackageWhereInput nameNot(String nameNot) {
    
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


  public CloudTowerApplicationPackageWhereInput nameNotContains(String nameNotContains) {
    
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


  public CloudTowerApplicationPackageWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public CloudTowerApplicationPackageWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public CloudTowerApplicationPackageWhereInput addNameNotInItem(String nameNotInItem) {
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


  public CloudTowerApplicationPackageWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public CloudTowerApplicationPackageWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public CloudTowerApplicationPackageWhereInput scosVersion(String scosVersion) {
    
    this.scosVersion = scosVersion;
    return this;
  }

   /**
   * Get scosVersion
   * @return scosVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScosVersion() {
    return scosVersion;
  }


  public void setScosVersion(String scosVersion) {
    this.scosVersion = scosVersion;
  }


  public CloudTowerApplicationPackageWhereInput scosVersionContains(String scosVersionContains) {
    
    this.scosVersionContains = scosVersionContains;
    return this;
  }

   /**
   * Get scosVersionContains
   * @return scosVersionContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScosVersionContains() {
    return scosVersionContains;
  }


  public void setScosVersionContains(String scosVersionContains) {
    this.scosVersionContains = scosVersionContains;
  }


  public CloudTowerApplicationPackageWhereInput scosVersionEndsWith(String scosVersionEndsWith) {
    
    this.scosVersionEndsWith = scosVersionEndsWith;
    return this;
  }

   /**
   * Get scosVersionEndsWith
   * @return scosVersionEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScosVersionEndsWith() {
    return scosVersionEndsWith;
  }


  public void setScosVersionEndsWith(String scosVersionEndsWith) {
    this.scosVersionEndsWith = scosVersionEndsWith;
  }


  public CloudTowerApplicationPackageWhereInput scosVersionGt(String scosVersionGt) {
    
    this.scosVersionGt = scosVersionGt;
    return this;
  }

   /**
   * Get scosVersionGt
   * @return scosVersionGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScosVersionGt() {
    return scosVersionGt;
  }


  public void setScosVersionGt(String scosVersionGt) {
    this.scosVersionGt = scosVersionGt;
  }


  public CloudTowerApplicationPackageWhereInput scosVersionGte(String scosVersionGte) {
    
    this.scosVersionGte = scosVersionGte;
    return this;
  }

   /**
   * Get scosVersionGte
   * @return scosVersionGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScosVersionGte() {
    return scosVersionGte;
  }


  public void setScosVersionGte(String scosVersionGte) {
    this.scosVersionGte = scosVersionGte;
  }


  public CloudTowerApplicationPackageWhereInput scosVersionIn(List<String> scosVersionIn) {
    
    this.scosVersionIn = scosVersionIn;
    return this;
  }

  public CloudTowerApplicationPackageWhereInput addScosVersionInItem(String scosVersionInItem) {
    if (this.scosVersionIn == null) {
      this.scosVersionIn = new ArrayList<String>();
    }
    this.scosVersionIn.add(scosVersionInItem);
    return this;
  }

   /**
   * Get scosVersionIn
   * @return scosVersionIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getScosVersionIn() {
    return scosVersionIn;
  }


  public void setScosVersionIn(List<String> scosVersionIn) {
    this.scosVersionIn = scosVersionIn;
  }


  public CloudTowerApplicationPackageWhereInput scosVersionLt(String scosVersionLt) {
    
    this.scosVersionLt = scosVersionLt;
    return this;
  }

   /**
   * Get scosVersionLt
   * @return scosVersionLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScosVersionLt() {
    return scosVersionLt;
  }


  public void setScosVersionLt(String scosVersionLt) {
    this.scosVersionLt = scosVersionLt;
  }


  public CloudTowerApplicationPackageWhereInput scosVersionLte(String scosVersionLte) {
    
    this.scosVersionLte = scosVersionLte;
    return this;
  }

   /**
   * Get scosVersionLte
   * @return scosVersionLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScosVersionLte() {
    return scosVersionLte;
  }


  public void setScosVersionLte(String scosVersionLte) {
    this.scosVersionLte = scosVersionLte;
  }


  public CloudTowerApplicationPackageWhereInput scosVersionNot(String scosVersionNot) {
    
    this.scosVersionNot = scosVersionNot;
    return this;
  }

   /**
   * Get scosVersionNot
   * @return scosVersionNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScosVersionNot() {
    return scosVersionNot;
  }


  public void setScosVersionNot(String scosVersionNot) {
    this.scosVersionNot = scosVersionNot;
  }


  public CloudTowerApplicationPackageWhereInput scosVersionNotContains(String scosVersionNotContains) {
    
    this.scosVersionNotContains = scosVersionNotContains;
    return this;
  }

   /**
   * Get scosVersionNotContains
   * @return scosVersionNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScosVersionNotContains() {
    return scosVersionNotContains;
  }


  public void setScosVersionNotContains(String scosVersionNotContains) {
    this.scosVersionNotContains = scosVersionNotContains;
  }


  public CloudTowerApplicationPackageWhereInput scosVersionNotEndsWith(String scosVersionNotEndsWith) {
    
    this.scosVersionNotEndsWith = scosVersionNotEndsWith;
    return this;
  }

   /**
   * Get scosVersionNotEndsWith
   * @return scosVersionNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScosVersionNotEndsWith() {
    return scosVersionNotEndsWith;
  }


  public void setScosVersionNotEndsWith(String scosVersionNotEndsWith) {
    this.scosVersionNotEndsWith = scosVersionNotEndsWith;
  }


  public CloudTowerApplicationPackageWhereInput scosVersionNotIn(List<String> scosVersionNotIn) {
    
    this.scosVersionNotIn = scosVersionNotIn;
    return this;
  }

  public CloudTowerApplicationPackageWhereInput addScosVersionNotInItem(String scosVersionNotInItem) {
    if (this.scosVersionNotIn == null) {
      this.scosVersionNotIn = new ArrayList<String>();
    }
    this.scosVersionNotIn.add(scosVersionNotInItem);
    return this;
  }

   /**
   * Get scosVersionNotIn
   * @return scosVersionNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getScosVersionNotIn() {
    return scosVersionNotIn;
  }


  public void setScosVersionNotIn(List<String> scosVersionNotIn) {
    this.scosVersionNotIn = scosVersionNotIn;
  }


  public CloudTowerApplicationPackageWhereInput scosVersionNotStartsWith(String scosVersionNotStartsWith) {
    
    this.scosVersionNotStartsWith = scosVersionNotStartsWith;
    return this;
  }

   /**
   * Get scosVersionNotStartsWith
   * @return scosVersionNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScosVersionNotStartsWith() {
    return scosVersionNotStartsWith;
  }


  public void setScosVersionNotStartsWith(String scosVersionNotStartsWith) {
    this.scosVersionNotStartsWith = scosVersionNotStartsWith;
  }


  public CloudTowerApplicationPackageWhereInput scosVersionStartsWith(String scosVersionStartsWith) {
    
    this.scosVersionStartsWith = scosVersionStartsWith;
    return this;
  }

   /**
   * Get scosVersionStartsWith
   * @return scosVersionStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScosVersionStartsWith() {
    return scosVersionStartsWith;
  }


  public void setScosVersionStartsWith(String scosVersionStartsWith) {
    this.scosVersionStartsWith = scosVersionStartsWith;
  }


  public CloudTowerApplicationPackageWhereInput version(String version) {
    
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


  public CloudTowerApplicationPackageWhereInput versionContains(String versionContains) {
    
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


  public CloudTowerApplicationPackageWhereInput versionEndsWith(String versionEndsWith) {
    
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


  public CloudTowerApplicationPackageWhereInput versionGt(String versionGt) {
    
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


  public CloudTowerApplicationPackageWhereInput versionGte(String versionGte) {
    
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


  public CloudTowerApplicationPackageWhereInput versionIn(List<String> versionIn) {
    
    this.versionIn = versionIn;
    return this;
  }

  public CloudTowerApplicationPackageWhereInput addVersionInItem(String versionInItem) {
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


  public CloudTowerApplicationPackageWhereInput versionLt(String versionLt) {
    
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


  public CloudTowerApplicationPackageWhereInput versionLte(String versionLte) {
    
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


  public CloudTowerApplicationPackageWhereInput versionNot(String versionNot) {
    
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


  public CloudTowerApplicationPackageWhereInput versionNotContains(String versionNotContains) {
    
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


  public CloudTowerApplicationPackageWhereInput versionNotEndsWith(String versionNotEndsWith) {
    
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


  public CloudTowerApplicationPackageWhereInput versionNotIn(List<String> versionNotIn) {
    
    this.versionNotIn = versionNotIn;
    return this;
  }

  public CloudTowerApplicationPackageWhereInput addVersionNotInItem(String versionNotInItem) {
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


  public CloudTowerApplicationPackageWhereInput versionNotStartsWith(String versionNotStartsWith) {
    
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


  public CloudTowerApplicationPackageWhereInput versionStartsWith(String versionStartsWith) {
    
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
    CloudTowerApplicationPackageWhereInput cloudTowerApplicationPackageWhereInput = (CloudTowerApplicationPackageWhereInput) o;
    return Objects.equals(this.AND, cloudTowerApplicationPackageWhereInput.AND) &&
        Objects.equals(this.NOT, cloudTowerApplicationPackageWhereInput.NOT) &&
        Objects.equals(this.OR, cloudTowerApplicationPackageWhereInput.OR) &&
        Objects.equals(this.applicationsEvery, cloudTowerApplicationPackageWhereInput.applicationsEvery) &&
        Objects.equals(this.applicationsNone, cloudTowerApplicationPackageWhereInput.applicationsNone) &&
        Objects.equals(this.applicationsSome, cloudTowerApplicationPackageWhereInput.applicationsSome) &&
        Objects.equals(this.architecture, cloudTowerApplicationPackageWhereInput.architecture) &&
        Objects.equals(this.architectureIn, cloudTowerApplicationPackageWhereInput.architectureIn) &&
        Objects.equals(this.architectureNot, cloudTowerApplicationPackageWhereInput.architectureNot) &&
        Objects.equals(this.architectureNotIn, cloudTowerApplicationPackageWhereInput.architectureNotIn) &&
        Objects.equals(this.id, cloudTowerApplicationPackageWhereInput.id) &&
        Objects.equals(this.idContains, cloudTowerApplicationPackageWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, cloudTowerApplicationPackageWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, cloudTowerApplicationPackageWhereInput.idGt) &&
        Objects.equals(this.idGte, cloudTowerApplicationPackageWhereInput.idGte) &&
        Objects.equals(this.idIn, cloudTowerApplicationPackageWhereInput.idIn) &&
        Objects.equals(this.idLt, cloudTowerApplicationPackageWhereInput.idLt) &&
        Objects.equals(this.idLte, cloudTowerApplicationPackageWhereInput.idLte) &&
        Objects.equals(this.idNot, cloudTowerApplicationPackageWhereInput.idNot) &&
        Objects.equals(this.idNotContains, cloudTowerApplicationPackageWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, cloudTowerApplicationPackageWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, cloudTowerApplicationPackageWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, cloudTowerApplicationPackageWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, cloudTowerApplicationPackageWhereInput.idStartsWith) &&
        Objects.equals(this.name, cloudTowerApplicationPackageWhereInput.name) &&
        Objects.equals(this.nameContains, cloudTowerApplicationPackageWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, cloudTowerApplicationPackageWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, cloudTowerApplicationPackageWhereInput.nameGt) &&
        Objects.equals(this.nameGte, cloudTowerApplicationPackageWhereInput.nameGte) &&
        Objects.equals(this.nameIn, cloudTowerApplicationPackageWhereInput.nameIn) &&
        Objects.equals(this.nameLt, cloudTowerApplicationPackageWhereInput.nameLt) &&
        Objects.equals(this.nameLte, cloudTowerApplicationPackageWhereInput.nameLte) &&
        Objects.equals(this.nameNot, cloudTowerApplicationPackageWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, cloudTowerApplicationPackageWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, cloudTowerApplicationPackageWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, cloudTowerApplicationPackageWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, cloudTowerApplicationPackageWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, cloudTowerApplicationPackageWhereInput.nameStartsWith) &&
        Objects.equals(this.scosVersion, cloudTowerApplicationPackageWhereInput.scosVersion) &&
        Objects.equals(this.scosVersionContains, cloudTowerApplicationPackageWhereInput.scosVersionContains) &&
        Objects.equals(this.scosVersionEndsWith, cloudTowerApplicationPackageWhereInput.scosVersionEndsWith) &&
        Objects.equals(this.scosVersionGt, cloudTowerApplicationPackageWhereInput.scosVersionGt) &&
        Objects.equals(this.scosVersionGte, cloudTowerApplicationPackageWhereInput.scosVersionGte) &&
        Objects.equals(this.scosVersionIn, cloudTowerApplicationPackageWhereInput.scosVersionIn) &&
        Objects.equals(this.scosVersionLt, cloudTowerApplicationPackageWhereInput.scosVersionLt) &&
        Objects.equals(this.scosVersionLte, cloudTowerApplicationPackageWhereInput.scosVersionLte) &&
        Objects.equals(this.scosVersionNot, cloudTowerApplicationPackageWhereInput.scosVersionNot) &&
        Objects.equals(this.scosVersionNotContains, cloudTowerApplicationPackageWhereInput.scosVersionNotContains) &&
        Objects.equals(this.scosVersionNotEndsWith, cloudTowerApplicationPackageWhereInput.scosVersionNotEndsWith) &&
        Objects.equals(this.scosVersionNotIn, cloudTowerApplicationPackageWhereInput.scosVersionNotIn) &&
        Objects.equals(this.scosVersionNotStartsWith, cloudTowerApplicationPackageWhereInput.scosVersionNotStartsWith) &&
        Objects.equals(this.scosVersionStartsWith, cloudTowerApplicationPackageWhereInput.scosVersionStartsWith) &&
        Objects.equals(this.version, cloudTowerApplicationPackageWhereInput.version) &&
        Objects.equals(this.versionContains, cloudTowerApplicationPackageWhereInput.versionContains) &&
        Objects.equals(this.versionEndsWith, cloudTowerApplicationPackageWhereInput.versionEndsWith) &&
        Objects.equals(this.versionGt, cloudTowerApplicationPackageWhereInput.versionGt) &&
        Objects.equals(this.versionGte, cloudTowerApplicationPackageWhereInput.versionGte) &&
        Objects.equals(this.versionIn, cloudTowerApplicationPackageWhereInput.versionIn) &&
        Objects.equals(this.versionLt, cloudTowerApplicationPackageWhereInput.versionLt) &&
        Objects.equals(this.versionLte, cloudTowerApplicationPackageWhereInput.versionLte) &&
        Objects.equals(this.versionNot, cloudTowerApplicationPackageWhereInput.versionNot) &&
        Objects.equals(this.versionNotContains, cloudTowerApplicationPackageWhereInput.versionNotContains) &&
        Objects.equals(this.versionNotEndsWith, cloudTowerApplicationPackageWhereInput.versionNotEndsWith) &&
        Objects.equals(this.versionNotIn, cloudTowerApplicationPackageWhereInput.versionNotIn) &&
        Objects.equals(this.versionNotStartsWith, cloudTowerApplicationPackageWhereInput.versionNotStartsWith) &&
        Objects.equals(this.versionStartsWith, cloudTowerApplicationPackageWhereInput.versionStartsWith);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, applicationsEvery, applicationsNone, applicationsSome, architecture, architectureIn, architectureNot, architectureNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, scosVersion, scosVersionContains, scosVersionEndsWith, scosVersionGt, scosVersionGte, scosVersionIn, scosVersionLt, scosVersionLte, scosVersionNot, scosVersionNotContains, scosVersionNotEndsWith, scosVersionNotIn, scosVersionNotStartsWith, scosVersionStartsWith, version, versionContains, versionEndsWith, versionGt, versionGte, versionIn, versionLt, versionLte, versionNot, versionNotContains, versionNotEndsWith, versionNotIn, versionNotStartsWith, versionStartsWith);
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
    sb.append("class CloudTowerApplicationPackageWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    applicationsEvery: ").append(toIndentedString(applicationsEvery)).append("\n");
    sb.append("    applicationsNone: ").append(toIndentedString(applicationsNone)).append("\n");
    sb.append("    applicationsSome: ").append(toIndentedString(applicationsSome)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    architectureIn: ").append(toIndentedString(architectureIn)).append("\n");
    sb.append("    architectureNot: ").append(toIndentedString(architectureNot)).append("\n");
    sb.append("    architectureNotIn: ").append(toIndentedString(architectureNotIn)).append("\n");
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
    sb.append("    scosVersion: ").append(toIndentedString(scosVersion)).append("\n");
    sb.append("    scosVersionContains: ").append(toIndentedString(scosVersionContains)).append("\n");
    sb.append("    scosVersionEndsWith: ").append(toIndentedString(scosVersionEndsWith)).append("\n");
    sb.append("    scosVersionGt: ").append(toIndentedString(scosVersionGt)).append("\n");
    sb.append("    scosVersionGte: ").append(toIndentedString(scosVersionGte)).append("\n");
    sb.append("    scosVersionIn: ").append(toIndentedString(scosVersionIn)).append("\n");
    sb.append("    scosVersionLt: ").append(toIndentedString(scosVersionLt)).append("\n");
    sb.append("    scosVersionLte: ").append(toIndentedString(scosVersionLte)).append("\n");
    sb.append("    scosVersionNot: ").append(toIndentedString(scosVersionNot)).append("\n");
    sb.append("    scosVersionNotContains: ").append(toIndentedString(scosVersionNotContains)).append("\n");
    sb.append("    scosVersionNotEndsWith: ").append(toIndentedString(scosVersionNotEndsWith)).append("\n");
    sb.append("    scosVersionNotIn: ").append(toIndentedString(scosVersionNotIn)).append("\n");
    sb.append("    scosVersionNotStartsWith: ").append(toIndentedString(scosVersionNotStartsWith)).append("\n");
    sb.append("    scosVersionStartsWith: ").append(toIndentedString(scosVersionStartsWith)).append("\n");
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

