package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.ClusterWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ClusterUpgradeHistoryWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ClusterUpgradeHistoryWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<ClusterUpgradeHistoryWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<ClusterUpgradeHistoryWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<ClusterUpgradeHistoryWhereInput> OR = null;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private ClusterWhereInput cluster;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_DATE_GT = "date_gt";
  @SerializedName(SERIALIZED_NAME_DATE_GT)
  private String dateGt;

  public static final String SERIALIZED_NAME_DATE_GTE = "date_gte";
  @SerializedName(SERIALIZED_NAME_DATE_GTE)
  private String dateGte;

  public static final String SERIALIZED_NAME_DATE_IN = "date_in";
  @SerializedName(SERIALIZED_NAME_DATE_IN)
  private List<String> dateIn = null;

  public static final String SERIALIZED_NAME_DATE_LT = "date_lt";
  @SerializedName(SERIALIZED_NAME_DATE_LT)
  private String dateLt;

  public static final String SERIALIZED_NAME_DATE_LTE = "date_lte";
  @SerializedName(SERIALIZED_NAME_DATE_LTE)
  private String dateLte;

  public static final String SERIALIZED_NAME_DATE_NOT = "date_not";
  @SerializedName(SERIALIZED_NAME_DATE_NOT)
  private String dateNot;

  public static final String SERIALIZED_NAME_DATE_NOT_IN = "date_not_in";
  @SerializedName(SERIALIZED_NAME_DATE_NOT_IN)
  private List<String> dateNotIn = null;

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

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_RESULT_CONTAINS = "result_contains";
  @SerializedName(SERIALIZED_NAME_RESULT_CONTAINS)
  private String resultContains;

  public static final String SERIALIZED_NAME_RESULT_ENDS_WITH = "result_ends_with";
  @SerializedName(SERIALIZED_NAME_RESULT_ENDS_WITH)
  private String resultEndsWith;

  public static final String SERIALIZED_NAME_RESULT_GT = "result_gt";
  @SerializedName(SERIALIZED_NAME_RESULT_GT)
  private String resultGt;

  public static final String SERIALIZED_NAME_RESULT_GTE = "result_gte";
  @SerializedName(SERIALIZED_NAME_RESULT_GTE)
  private String resultGte;

  public static final String SERIALIZED_NAME_RESULT_IN = "result_in";
  @SerializedName(SERIALIZED_NAME_RESULT_IN)
  private List<String> resultIn = null;

  public static final String SERIALIZED_NAME_RESULT_LT = "result_lt";
  @SerializedName(SERIALIZED_NAME_RESULT_LT)
  private String resultLt;

  public static final String SERIALIZED_NAME_RESULT_LTE = "result_lte";
  @SerializedName(SERIALIZED_NAME_RESULT_LTE)
  private String resultLte;

  public static final String SERIALIZED_NAME_RESULT_NOT = "result_not";
  @SerializedName(SERIALIZED_NAME_RESULT_NOT)
  private String resultNot;

  public static final String SERIALIZED_NAME_RESULT_NOT_CONTAINS = "result_not_contains";
  @SerializedName(SERIALIZED_NAME_RESULT_NOT_CONTAINS)
  private String resultNotContains;

  public static final String SERIALIZED_NAME_RESULT_NOT_ENDS_WITH = "result_not_ends_with";
  @SerializedName(SERIALIZED_NAME_RESULT_NOT_ENDS_WITH)
  private String resultNotEndsWith;

  public static final String SERIALIZED_NAME_RESULT_NOT_IN = "result_not_in";
  @SerializedName(SERIALIZED_NAME_RESULT_NOT_IN)
  private List<String> resultNotIn = null;

  public static final String SERIALIZED_NAME_RESULT_NOT_STARTS_WITH = "result_not_starts_with";
  @SerializedName(SERIALIZED_NAME_RESULT_NOT_STARTS_WITH)
  private String resultNotStartsWith;

  public static final String SERIALIZED_NAME_RESULT_STARTS_WITH = "result_starts_with";
  @SerializedName(SERIALIZED_NAME_RESULT_STARTS_WITH)
  private String resultStartsWith;

  public static final String SERIALIZED_NAME_TASK_UUID = "task_uuid";
  @SerializedName(SERIALIZED_NAME_TASK_UUID)
  private String taskUuid;

  public static final String SERIALIZED_NAME_TASK_UUID_CONTAINS = "task_uuid_contains";
  @SerializedName(SERIALIZED_NAME_TASK_UUID_CONTAINS)
  private String taskUuidContains;

  public static final String SERIALIZED_NAME_TASK_UUID_ENDS_WITH = "task_uuid_ends_with";
  @SerializedName(SERIALIZED_NAME_TASK_UUID_ENDS_WITH)
  private String taskUuidEndsWith;

  public static final String SERIALIZED_NAME_TASK_UUID_GT = "task_uuid_gt";
  @SerializedName(SERIALIZED_NAME_TASK_UUID_GT)
  private String taskUuidGt;

  public static final String SERIALIZED_NAME_TASK_UUID_GTE = "task_uuid_gte";
  @SerializedName(SERIALIZED_NAME_TASK_UUID_GTE)
  private String taskUuidGte;

  public static final String SERIALIZED_NAME_TASK_UUID_IN = "task_uuid_in";
  @SerializedName(SERIALIZED_NAME_TASK_UUID_IN)
  private List<String> taskUuidIn = null;

  public static final String SERIALIZED_NAME_TASK_UUID_LT = "task_uuid_lt";
  @SerializedName(SERIALIZED_NAME_TASK_UUID_LT)
  private String taskUuidLt;

  public static final String SERIALIZED_NAME_TASK_UUID_LTE = "task_uuid_lte";
  @SerializedName(SERIALIZED_NAME_TASK_UUID_LTE)
  private String taskUuidLte;

  public static final String SERIALIZED_NAME_TASK_UUID_NOT = "task_uuid_not";
  @SerializedName(SERIALIZED_NAME_TASK_UUID_NOT)
  private String taskUuidNot;

  public static final String SERIALIZED_NAME_TASK_UUID_NOT_CONTAINS = "task_uuid_not_contains";
  @SerializedName(SERIALIZED_NAME_TASK_UUID_NOT_CONTAINS)
  private String taskUuidNotContains;

  public static final String SERIALIZED_NAME_TASK_UUID_NOT_ENDS_WITH = "task_uuid_not_ends_with";
  @SerializedName(SERIALIZED_NAME_TASK_UUID_NOT_ENDS_WITH)
  private String taskUuidNotEndsWith;

  public static final String SERIALIZED_NAME_TASK_UUID_NOT_IN = "task_uuid_not_in";
  @SerializedName(SERIALIZED_NAME_TASK_UUID_NOT_IN)
  private List<String> taskUuidNotIn = null;

  public static final String SERIALIZED_NAME_TASK_UUID_NOT_STARTS_WITH = "task_uuid_not_starts_with";
  @SerializedName(SERIALIZED_NAME_TASK_UUID_NOT_STARTS_WITH)
  private String taskUuidNotStartsWith;

  public static final String SERIALIZED_NAME_TASK_UUID_STARTS_WITH = "task_uuid_starts_with";
  @SerializedName(SERIALIZED_NAME_TASK_UUID_STARTS_WITH)
  private String taskUuidStartsWith;

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

  public ClusterUpgradeHistoryWhereInput() { 
  }

  public ClusterUpgradeHistoryWhereInput AND(List<ClusterUpgradeHistoryWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public ClusterUpgradeHistoryWhereInput addANDItem(ClusterUpgradeHistoryWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<ClusterUpgradeHistoryWhereInput>();
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

  public List<ClusterUpgradeHistoryWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<ClusterUpgradeHistoryWhereInput> AND) {
    this.AND = AND;
  }


  public ClusterUpgradeHistoryWhereInput NOT(List<ClusterUpgradeHistoryWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public ClusterUpgradeHistoryWhereInput addNOTItem(ClusterUpgradeHistoryWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<ClusterUpgradeHistoryWhereInput>();
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

  public List<ClusterUpgradeHistoryWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<ClusterUpgradeHistoryWhereInput> NOT) {
    this.NOT = NOT;
  }


  public ClusterUpgradeHistoryWhereInput OR(List<ClusterUpgradeHistoryWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public ClusterUpgradeHistoryWhereInput addORItem(ClusterUpgradeHistoryWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<ClusterUpgradeHistoryWhereInput>();
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

  public List<ClusterUpgradeHistoryWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<ClusterUpgradeHistoryWhereInput> OR) {
    this.OR = OR;
  }


  public ClusterUpgradeHistoryWhereInput cluster(ClusterWhereInput cluster) {
    
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


  public ClusterUpgradeHistoryWhereInput date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public ClusterUpgradeHistoryWhereInput dateGt(String dateGt) {
    
    this.dateGt = dateGt;
    return this;
  }

   /**
   * Get dateGt
   * @return dateGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDateGt() {
    return dateGt;
  }


  public void setDateGt(String dateGt) {
    this.dateGt = dateGt;
  }


  public ClusterUpgradeHistoryWhereInput dateGte(String dateGte) {
    
    this.dateGte = dateGte;
    return this;
  }

   /**
   * Get dateGte
   * @return dateGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDateGte() {
    return dateGte;
  }


  public void setDateGte(String dateGte) {
    this.dateGte = dateGte;
  }


  public ClusterUpgradeHistoryWhereInput dateIn(List<String> dateIn) {
    
    this.dateIn = dateIn;
    return this;
  }

  public ClusterUpgradeHistoryWhereInput addDateInItem(String dateInItem) {
    if (this.dateIn == null) {
      this.dateIn = new ArrayList<String>();
    }
    this.dateIn.add(dateInItem);
    return this;
  }

   /**
   * Get dateIn
   * @return dateIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDateIn() {
    return dateIn;
  }


  public void setDateIn(List<String> dateIn) {
    this.dateIn = dateIn;
  }


  public ClusterUpgradeHistoryWhereInput dateLt(String dateLt) {
    
    this.dateLt = dateLt;
    return this;
  }

   /**
   * Get dateLt
   * @return dateLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDateLt() {
    return dateLt;
  }


  public void setDateLt(String dateLt) {
    this.dateLt = dateLt;
  }


  public ClusterUpgradeHistoryWhereInput dateLte(String dateLte) {
    
    this.dateLte = dateLte;
    return this;
  }

   /**
   * Get dateLte
   * @return dateLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDateLte() {
    return dateLte;
  }


  public void setDateLte(String dateLte) {
    this.dateLte = dateLte;
  }


  public ClusterUpgradeHistoryWhereInput dateNot(String dateNot) {
    
    this.dateNot = dateNot;
    return this;
  }

   /**
   * Get dateNot
   * @return dateNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDateNot() {
    return dateNot;
  }


  public void setDateNot(String dateNot) {
    this.dateNot = dateNot;
  }


  public ClusterUpgradeHistoryWhereInput dateNotIn(List<String> dateNotIn) {
    
    this.dateNotIn = dateNotIn;
    return this;
  }

  public ClusterUpgradeHistoryWhereInput addDateNotInItem(String dateNotInItem) {
    if (this.dateNotIn == null) {
      this.dateNotIn = new ArrayList<String>();
    }
    this.dateNotIn.add(dateNotInItem);
    return this;
  }

   /**
   * Get dateNotIn
   * @return dateNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDateNotIn() {
    return dateNotIn;
  }


  public void setDateNotIn(List<String> dateNotIn) {
    this.dateNotIn = dateNotIn;
  }


  public ClusterUpgradeHistoryWhereInput id(String id) {
    
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


  public ClusterUpgradeHistoryWhereInput idContains(String idContains) {
    
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


  public ClusterUpgradeHistoryWhereInput idEndsWith(String idEndsWith) {
    
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


  public ClusterUpgradeHistoryWhereInput idGt(String idGt) {
    
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


  public ClusterUpgradeHistoryWhereInput idGte(String idGte) {
    
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


  public ClusterUpgradeHistoryWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public ClusterUpgradeHistoryWhereInput addIdInItem(String idInItem) {
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


  public ClusterUpgradeHistoryWhereInput idLt(String idLt) {
    
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


  public ClusterUpgradeHistoryWhereInput idLte(String idLte) {
    
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


  public ClusterUpgradeHistoryWhereInput idNot(String idNot) {
    
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


  public ClusterUpgradeHistoryWhereInput idNotContains(String idNotContains) {
    
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


  public ClusterUpgradeHistoryWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public ClusterUpgradeHistoryWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public ClusterUpgradeHistoryWhereInput addIdNotInItem(String idNotInItem) {
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


  public ClusterUpgradeHistoryWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public ClusterUpgradeHistoryWhereInput idStartsWith(String idStartsWith) {
    
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


  public ClusterUpgradeHistoryWhereInput localId(String localId) {
    
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


  public ClusterUpgradeHistoryWhereInput localIdContains(String localIdContains) {
    
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


  public ClusterUpgradeHistoryWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public ClusterUpgradeHistoryWhereInput localIdGt(String localIdGt) {
    
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


  public ClusterUpgradeHistoryWhereInput localIdGte(String localIdGte) {
    
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


  public ClusterUpgradeHistoryWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public ClusterUpgradeHistoryWhereInput addLocalIdInItem(String localIdInItem) {
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


  public ClusterUpgradeHistoryWhereInput localIdLt(String localIdLt) {
    
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


  public ClusterUpgradeHistoryWhereInput localIdLte(String localIdLte) {
    
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


  public ClusterUpgradeHistoryWhereInput localIdNot(String localIdNot) {
    
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


  public ClusterUpgradeHistoryWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public ClusterUpgradeHistoryWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public ClusterUpgradeHistoryWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public ClusterUpgradeHistoryWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public ClusterUpgradeHistoryWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public ClusterUpgradeHistoryWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public ClusterUpgradeHistoryWhereInput result(String result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResult() {
    return result;
  }


  public void setResult(String result) {
    this.result = result;
  }


  public ClusterUpgradeHistoryWhereInput resultContains(String resultContains) {
    
    this.resultContains = resultContains;
    return this;
  }

   /**
   * Get resultContains
   * @return resultContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResultContains() {
    return resultContains;
  }


  public void setResultContains(String resultContains) {
    this.resultContains = resultContains;
  }


  public ClusterUpgradeHistoryWhereInput resultEndsWith(String resultEndsWith) {
    
    this.resultEndsWith = resultEndsWith;
    return this;
  }

   /**
   * Get resultEndsWith
   * @return resultEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResultEndsWith() {
    return resultEndsWith;
  }


  public void setResultEndsWith(String resultEndsWith) {
    this.resultEndsWith = resultEndsWith;
  }


  public ClusterUpgradeHistoryWhereInput resultGt(String resultGt) {
    
    this.resultGt = resultGt;
    return this;
  }

   /**
   * Get resultGt
   * @return resultGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResultGt() {
    return resultGt;
  }


  public void setResultGt(String resultGt) {
    this.resultGt = resultGt;
  }


  public ClusterUpgradeHistoryWhereInput resultGte(String resultGte) {
    
    this.resultGte = resultGte;
    return this;
  }

   /**
   * Get resultGte
   * @return resultGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResultGte() {
    return resultGte;
  }


  public void setResultGte(String resultGte) {
    this.resultGte = resultGte;
  }


  public ClusterUpgradeHistoryWhereInput resultIn(List<String> resultIn) {
    
    this.resultIn = resultIn;
    return this;
  }

  public ClusterUpgradeHistoryWhereInput addResultInItem(String resultInItem) {
    if (this.resultIn == null) {
      this.resultIn = new ArrayList<String>();
    }
    this.resultIn.add(resultInItem);
    return this;
  }

   /**
   * Get resultIn
   * @return resultIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getResultIn() {
    return resultIn;
  }


  public void setResultIn(List<String> resultIn) {
    this.resultIn = resultIn;
  }


  public ClusterUpgradeHistoryWhereInput resultLt(String resultLt) {
    
    this.resultLt = resultLt;
    return this;
  }

   /**
   * Get resultLt
   * @return resultLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResultLt() {
    return resultLt;
  }


  public void setResultLt(String resultLt) {
    this.resultLt = resultLt;
  }


  public ClusterUpgradeHistoryWhereInput resultLte(String resultLte) {
    
    this.resultLte = resultLte;
    return this;
  }

   /**
   * Get resultLte
   * @return resultLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResultLte() {
    return resultLte;
  }


  public void setResultLte(String resultLte) {
    this.resultLte = resultLte;
  }


  public ClusterUpgradeHistoryWhereInput resultNot(String resultNot) {
    
    this.resultNot = resultNot;
    return this;
  }

   /**
   * Get resultNot
   * @return resultNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResultNot() {
    return resultNot;
  }


  public void setResultNot(String resultNot) {
    this.resultNot = resultNot;
  }


  public ClusterUpgradeHistoryWhereInput resultNotContains(String resultNotContains) {
    
    this.resultNotContains = resultNotContains;
    return this;
  }

   /**
   * Get resultNotContains
   * @return resultNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResultNotContains() {
    return resultNotContains;
  }


  public void setResultNotContains(String resultNotContains) {
    this.resultNotContains = resultNotContains;
  }


  public ClusterUpgradeHistoryWhereInput resultNotEndsWith(String resultNotEndsWith) {
    
    this.resultNotEndsWith = resultNotEndsWith;
    return this;
  }

   /**
   * Get resultNotEndsWith
   * @return resultNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResultNotEndsWith() {
    return resultNotEndsWith;
  }


  public void setResultNotEndsWith(String resultNotEndsWith) {
    this.resultNotEndsWith = resultNotEndsWith;
  }


  public ClusterUpgradeHistoryWhereInput resultNotIn(List<String> resultNotIn) {
    
    this.resultNotIn = resultNotIn;
    return this;
  }

  public ClusterUpgradeHistoryWhereInput addResultNotInItem(String resultNotInItem) {
    if (this.resultNotIn == null) {
      this.resultNotIn = new ArrayList<String>();
    }
    this.resultNotIn.add(resultNotInItem);
    return this;
  }

   /**
   * Get resultNotIn
   * @return resultNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getResultNotIn() {
    return resultNotIn;
  }


  public void setResultNotIn(List<String> resultNotIn) {
    this.resultNotIn = resultNotIn;
  }


  public ClusterUpgradeHistoryWhereInput resultNotStartsWith(String resultNotStartsWith) {
    
    this.resultNotStartsWith = resultNotStartsWith;
    return this;
  }

   /**
   * Get resultNotStartsWith
   * @return resultNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResultNotStartsWith() {
    return resultNotStartsWith;
  }


  public void setResultNotStartsWith(String resultNotStartsWith) {
    this.resultNotStartsWith = resultNotStartsWith;
  }


  public ClusterUpgradeHistoryWhereInput resultStartsWith(String resultStartsWith) {
    
    this.resultStartsWith = resultStartsWith;
    return this;
  }

   /**
   * Get resultStartsWith
   * @return resultStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResultStartsWith() {
    return resultStartsWith;
  }


  public void setResultStartsWith(String resultStartsWith) {
    this.resultStartsWith = resultStartsWith;
  }


  public ClusterUpgradeHistoryWhereInput taskUuid(String taskUuid) {
    
    this.taskUuid = taskUuid;
    return this;
  }

   /**
   * Get taskUuid
   * @return taskUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskUuid() {
    return taskUuid;
  }


  public void setTaskUuid(String taskUuid) {
    this.taskUuid = taskUuid;
  }


  public ClusterUpgradeHistoryWhereInput taskUuidContains(String taskUuidContains) {
    
    this.taskUuidContains = taskUuidContains;
    return this;
  }

   /**
   * Get taskUuidContains
   * @return taskUuidContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskUuidContains() {
    return taskUuidContains;
  }


  public void setTaskUuidContains(String taskUuidContains) {
    this.taskUuidContains = taskUuidContains;
  }


  public ClusterUpgradeHistoryWhereInput taskUuidEndsWith(String taskUuidEndsWith) {
    
    this.taskUuidEndsWith = taskUuidEndsWith;
    return this;
  }

   /**
   * Get taskUuidEndsWith
   * @return taskUuidEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskUuidEndsWith() {
    return taskUuidEndsWith;
  }


  public void setTaskUuidEndsWith(String taskUuidEndsWith) {
    this.taskUuidEndsWith = taskUuidEndsWith;
  }


  public ClusterUpgradeHistoryWhereInput taskUuidGt(String taskUuidGt) {
    
    this.taskUuidGt = taskUuidGt;
    return this;
  }

   /**
   * Get taskUuidGt
   * @return taskUuidGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskUuidGt() {
    return taskUuidGt;
  }


  public void setTaskUuidGt(String taskUuidGt) {
    this.taskUuidGt = taskUuidGt;
  }


  public ClusterUpgradeHistoryWhereInput taskUuidGte(String taskUuidGte) {
    
    this.taskUuidGte = taskUuidGte;
    return this;
  }

   /**
   * Get taskUuidGte
   * @return taskUuidGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskUuidGte() {
    return taskUuidGte;
  }


  public void setTaskUuidGte(String taskUuidGte) {
    this.taskUuidGte = taskUuidGte;
  }


  public ClusterUpgradeHistoryWhereInput taskUuidIn(List<String> taskUuidIn) {
    
    this.taskUuidIn = taskUuidIn;
    return this;
  }

  public ClusterUpgradeHistoryWhereInput addTaskUuidInItem(String taskUuidInItem) {
    if (this.taskUuidIn == null) {
      this.taskUuidIn = new ArrayList<String>();
    }
    this.taskUuidIn.add(taskUuidInItem);
    return this;
  }

   /**
   * Get taskUuidIn
   * @return taskUuidIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTaskUuidIn() {
    return taskUuidIn;
  }


  public void setTaskUuidIn(List<String> taskUuidIn) {
    this.taskUuidIn = taskUuidIn;
  }


  public ClusterUpgradeHistoryWhereInput taskUuidLt(String taskUuidLt) {
    
    this.taskUuidLt = taskUuidLt;
    return this;
  }

   /**
   * Get taskUuidLt
   * @return taskUuidLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskUuidLt() {
    return taskUuidLt;
  }


  public void setTaskUuidLt(String taskUuidLt) {
    this.taskUuidLt = taskUuidLt;
  }


  public ClusterUpgradeHistoryWhereInput taskUuidLte(String taskUuidLte) {
    
    this.taskUuidLte = taskUuidLte;
    return this;
  }

   /**
   * Get taskUuidLte
   * @return taskUuidLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskUuidLte() {
    return taskUuidLte;
  }


  public void setTaskUuidLte(String taskUuidLte) {
    this.taskUuidLte = taskUuidLte;
  }


  public ClusterUpgradeHistoryWhereInput taskUuidNot(String taskUuidNot) {
    
    this.taskUuidNot = taskUuidNot;
    return this;
  }

   /**
   * Get taskUuidNot
   * @return taskUuidNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskUuidNot() {
    return taskUuidNot;
  }


  public void setTaskUuidNot(String taskUuidNot) {
    this.taskUuidNot = taskUuidNot;
  }


  public ClusterUpgradeHistoryWhereInput taskUuidNotContains(String taskUuidNotContains) {
    
    this.taskUuidNotContains = taskUuidNotContains;
    return this;
  }

   /**
   * Get taskUuidNotContains
   * @return taskUuidNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskUuidNotContains() {
    return taskUuidNotContains;
  }


  public void setTaskUuidNotContains(String taskUuidNotContains) {
    this.taskUuidNotContains = taskUuidNotContains;
  }


  public ClusterUpgradeHistoryWhereInput taskUuidNotEndsWith(String taskUuidNotEndsWith) {
    
    this.taskUuidNotEndsWith = taskUuidNotEndsWith;
    return this;
  }

   /**
   * Get taskUuidNotEndsWith
   * @return taskUuidNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskUuidNotEndsWith() {
    return taskUuidNotEndsWith;
  }


  public void setTaskUuidNotEndsWith(String taskUuidNotEndsWith) {
    this.taskUuidNotEndsWith = taskUuidNotEndsWith;
  }


  public ClusterUpgradeHistoryWhereInput taskUuidNotIn(List<String> taskUuidNotIn) {
    
    this.taskUuidNotIn = taskUuidNotIn;
    return this;
  }

  public ClusterUpgradeHistoryWhereInput addTaskUuidNotInItem(String taskUuidNotInItem) {
    if (this.taskUuidNotIn == null) {
      this.taskUuidNotIn = new ArrayList<String>();
    }
    this.taskUuidNotIn.add(taskUuidNotInItem);
    return this;
  }

   /**
   * Get taskUuidNotIn
   * @return taskUuidNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTaskUuidNotIn() {
    return taskUuidNotIn;
  }


  public void setTaskUuidNotIn(List<String> taskUuidNotIn) {
    this.taskUuidNotIn = taskUuidNotIn;
  }


  public ClusterUpgradeHistoryWhereInput taskUuidNotStartsWith(String taskUuidNotStartsWith) {
    
    this.taskUuidNotStartsWith = taskUuidNotStartsWith;
    return this;
  }

   /**
   * Get taskUuidNotStartsWith
   * @return taskUuidNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskUuidNotStartsWith() {
    return taskUuidNotStartsWith;
  }


  public void setTaskUuidNotStartsWith(String taskUuidNotStartsWith) {
    this.taskUuidNotStartsWith = taskUuidNotStartsWith;
  }


  public ClusterUpgradeHistoryWhereInput taskUuidStartsWith(String taskUuidStartsWith) {
    
    this.taskUuidStartsWith = taskUuidStartsWith;
    return this;
  }

   /**
   * Get taskUuidStartsWith
   * @return taskUuidStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskUuidStartsWith() {
    return taskUuidStartsWith;
  }


  public void setTaskUuidStartsWith(String taskUuidStartsWith) {
    this.taskUuidStartsWith = taskUuidStartsWith;
  }


  public ClusterUpgradeHistoryWhereInput version(String version) {
    
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


  public ClusterUpgradeHistoryWhereInput versionContains(String versionContains) {
    
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


  public ClusterUpgradeHistoryWhereInput versionEndsWith(String versionEndsWith) {
    
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


  public ClusterUpgradeHistoryWhereInput versionGt(String versionGt) {
    
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


  public ClusterUpgradeHistoryWhereInput versionGte(String versionGte) {
    
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


  public ClusterUpgradeHistoryWhereInput versionIn(List<String> versionIn) {
    
    this.versionIn = versionIn;
    return this;
  }

  public ClusterUpgradeHistoryWhereInput addVersionInItem(String versionInItem) {
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


  public ClusterUpgradeHistoryWhereInput versionLt(String versionLt) {
    
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


  public ClusterUpgradeHistoryWhereInput versionLte(String versionLte) {
    
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


  public ClusterUpgradeHistoryWhereInput versionNot(String versionNot) {
    
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


  public ClusterUpgradeHistoryWhereInput versionNotContains(String versionNotContains) {
    
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


  public ClusterUpgradeHistoryWhereInput versionNotEndsWith(String versionNotEndsWith) {
    
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


  public ClusterUpgradeHistoryWhereInput versionNotIn(List<String> versionNotIn) {
    
    this.versionNotIn = versionNotIn;
    return this;
  }

  public ClusterUpgradeHistoryWhereInput addVersionNotInItem(String versionNotInItem) {
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


  public ClusterUpgradeHistoryWhereInput versionNotStartsWith(String versionNotStartsWith) {
    
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


  public ClusterUpgradeHistoryWhereInput versionStartsWith(String versionStartsWith) {
    
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
    ClusterUpgradeHistoryWhereInput clusterUpgradeHistoryWhereInput = (ClusterUpgradeHistoryWhereInput) o;
    return Objects.equals(this.AND, clusterUpgradeHistoryWhereInput.AND) &&
        Objects.equals(this.NOT, clusterUpgradeHistoryWhereInput.NOT) &&
        Objects.equals(this.OR, clusterUpgradeHistoryWhereInput.OR) &&
        Objects.equals(this.cluster, clusterUpgradeHistoryWhereInput.cluster) &&
        Objects.equals(this.date, clusterUpgradeHistoryWhereInput.date) &&
        Objects.equals(this.dateGt, clusterUpgradeHistoryWhereInput.dateGt) &&
        Objects.equals(this.dateGte, clusterUpgradeHistoryWhereInput.dateGte) &&
        Objects.equals(this.dateIn, clusterUpgradeHistoryWhereInput.dateIn) &&
        Objects.equals(this.dateLt, clusterUpgradeHistoryWhereInput.dateLt) &&
        Objects.equals(this.dateLte, clusterUpgradeHistoryWhereInput.dateLte) &&
        Objects.equals(this.dateNot, clusterUpgradeHistoryWhereInput.dateNot) &&
        Objects.equals(this.dateNotIn, clusterUpgradeHistoryWhereInput.dateNotIn) &&
        Objects.equals(this.id, clusterUpgradeHistoryWhereInput.id) &&
        Objects.equals(this.idContains, clusterUpgradeHistoryWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, clusterUpgradeHistoryWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, clusterUpgradeHistoryWhereInput.idGt) &&
        Objects.equals(this.idGte, clusterUpgradeHistoryWhereInput.idGte) &&
        Objects.equals(this.idIn, clusterUpgradeHistoryWhereInput.idIn) &&
        Objects.equals(this.idLt, clusterUpgradeHistoryWhereInput.idLt) &&
        Objects.equals(this.idLte, clusterUpgradeHistoryWhereInput.idLte) &&
        Objects.equals(this.idNot, clusterUpgradeHistoryWhereInput.idNot) &&
        Objects.equals(this.idNotContains, clusterUpgradeHistoryWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, clusterUpgradeHistoryWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, clusterUpgradeHistoryWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, clusterUpgradeHistoryWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, clusterUpgradeHistoryWhereInput.idStartsWith) &&
        Objects.equals(this.localId, clusterUpgradeHistoryWhereInput.localId) &&
        Objects.equals(this.localIdContains, clusterUpgradeHistoryWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, clusterUpgradeHistoryWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, clusterUpgradeHistoryWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, clusterUpgradeHistoryWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, clusterUpgradeHistoryWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, clusterUpgradeHistoryWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, clusterUpgradeHistoryWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, clusterUpgradeHistoryWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, clusterUpgradeHistoryWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, clusterUpgradeHistoryWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, clusterUpgradeHistoryWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, clusterUpgradeHistoryWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, clusterUpgradeHistoryWhereInput.localIdStartsWith) &&
        Objects.equals(this.result, clusterUpgradeHistoryWhereInput.result) &&
        Objects.equals(this.resultContains, clusterUpgradeHistoryWhereInput.resultContains) &&
        Objects.equals(this.resultEndsWith, clusterUpgradeHistoryWhereInput.resultEndsWith) &&
        Objects.equals(this.resultGt, clusterUpgradeHistoryWhereInput.resultGt) &&
        Objects.equals(this.resultGte, clusterUpgradeHistoryWhereInput.resultGte) &&
        Objects.equals(this.resultIn, clusterUpgradeHistoryWhereInput.resultIn) &&
        Objects.equals(this.resultLt, clusterUpgradeHistoryWhereInput.resultLt) &&
        Objects.equals(this.resultLte, clusterUpgradeHistoryWhereInput.resultLte) &&
        Objects.equals(this.resultNot, clusterUpgradeHistoryWhereInput.resultNot) &&
        Objects.equals(this.resultNotContains, clusterUpgradeHistoryWhereInput.resultNotContains) &&
        Objects.equals(this.resultNotEndsWith, clusterUpgradeHistoryWhereInput.resultNotEndsWith) &&
        Objects.equals(this.resultNotIn, clusterUpgradeHistoryWhereInput.resultNotIn) &&
        Objects.equals(this.resultNotStartsWith, clusterUpgradeHistoryWhereInput.resultNotStartsWith) &&
        Objects.equals(this.resultStartsWith, clusterUpgradeHistoryWhereInput.resultStartsWith) &&
        Objects.equals(this.taskUuid, clusterUpgradeHistoryWhereInput.taskUuid) &&
        Objects.equals(this.taskUuidContains, clusterUpgradeHistoryWhereInput.taskUuidContains) &&
        Objects.equals(this.taskUuidEndsWith, clusterUpgradeHistoryWhereInput.taskUuidEndsWith) &&
        Objects.equals(this.taskUuidGt, clusterUpgradeHistoryWhereInput.taskUuidGt) &&
        Objects.equals(this.taskUuidGte, clusterUpgradeHistoryWhereInput.taskUuidGte) &&
        Objects.equals(this.taskUuidIn, clusterUpgradeHistoryWhereInput.taskUuidIn) &&
        Objects.equals(this.taskUuidLt, clusterUpgradeHistoryWhereInput.taskUuidLt) &&
        Objects.equals(this.taskUuidLte, clusterUpgradeHistoryWhereInput.taskUuidLte) &&
        Objects.equals(this.taskUuidNot, clusterUpgradeHistoryWhereInput.taskUuidNot) &&
        Objects.equals(this.taskUuidNotContains, clusterUpgradeHistoryWhereInput.taskUuidNotContains) &&
        Objects.equals(this.taskUuidNotEndsWith, clusterUpgradeHistoryWhereInput.taskUuidNotEndsWith) &&
        Objects.equals(this.taskUuidNotIn, clusterUpgradeHistoryWhereInput.taskUuidNotIn) &&
        Objects.equals(this.taskUuidNotStartsWith, clusterUpgradeHistoryWhereInput.taskUuidNotStartsWith) &&
        Objects.equals(this.taskUuidStartsWith, clusterUpgradeHistoryWhereInput.taskUuidStartsWith) &&
        Objects.equals(this.version, clusterUpgradeHistoryWhereInput.version) &&
        Objects.equals(this.versionContains, clusterUpgradeHistoryWhereInput.versionContains) &&
        Objects.equals(this.versionEndsWith, clusterUpgradeHistoryWhereInput.versionEndsWith) &&
        Objects.equals(this.versionGt, clusterUpgradeHistoryWhereInput.versionGt) &&
        Objects.equals(this.versionGte, clusterUpgradeHistoryWhereInput.versionGte) &&
        Objects.equals(this.versionIn, clusterUpgradeHistoryWhereInput.versionIn) &&
        Objects.equals(this.versionLt, clusterUpgradeHistoryWhereInput.versionLt) &&
        Objects.equals(this.versionLte, clusterUpgradeHistoryWhereInput.versionLte) &&
        Objects.equals(this.versionNot, clusterUpgradeHistoryWhereInput.versionNot) &&
        Objects.equals(this.versionNotContains, clusterUpgradeHistoryWhereInput.versionNotContains) &&
        Objects.equals(this.versionNotEndsWith, clusterUpgradeHistoryWhereInput.versionNotEndsWith) &&
        Objects.equals(this.versionNotIn, clusterUpgradeHistoryWhereInput.versionNotIn) &&
        Objects.equals(this.versionNotStartsWith, clusterUpgradeHistoryWhereInput.versionNotStartsWith) &&
        Objects.equals(this.versionStartsWith, clusterUpgradeHistoryWhereInput.versionStartsWith);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, cluster, date, dateGt, dateGte, dateIn, dateLt, dateLte, dateNot, dateNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, result, resultContains, resultEndsWith, resultGt, resultGte, resultIn, resultLt, resultLte, resultNot, resultNotContains, resultNotEndsWith, resultNotIn, resultNotStartsWith, resultStartsWith, taskUuid, taskUuidContains, taskUuidEndsWith, taskUuidGt, taskUuidGte, taskUuidIn, taskUuidLt, taskUuidLte, taskUuidNot, taskUuidNotContains, taskUuidNotEndsWith, taskUuidNotIn, taskUuidNotStartsWith, taskUuidStartsWith, version, versionContains, versionEndsWith, versionGt, versionGte, versionIn, versionLt, versionLte, versionNot, versionNotContains, versionNotEndsWith, versionNotIn, versionNotStartsWith, versionStartsWith);
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
    sb.append("class ClusterUpgradeHistoryWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateGt: ").append(toIndentedString(dateGt)).append("\n");
    sb.append("    dateGte: ").append(toIndentedString(dateGte)).append("\n");
    sb.append("    dateIn: ").append(toIndentedString(dateIn)).append("\n");
    sb.append("    dateLt: ").append(toIndentedString(dateLt)).append("\n");
    sb.append("    dateLte: ").append(toIndentedString(dateLte)).append("\n");
    sb.append("    dateNot: ").append(toIndentedString(dateNot)).append("\n");
    sb.append("    dateNotIn: ").append(toIndentedString(dateNotIn)).append("\n");
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
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    resultContains: ").append(toIndentedString(resultContains)).append("\n");
    sb.append("    resultEndsWith: ").append(toIndentedString(resultEndsWith)).append("\n");
    sb.append("    resultGt: ").append(toIndentedString(resultGt)).append("\n");
    sb.append("    resultGte: ").append(toIndentedString(resultGte)).append("\n");
    sb.append("    resultIn: ").append(toIndentedString(resultIn)).append("\n");
    sb.append("    resultLt: ").append(toIndentedString(resultLt)).append("\n");
    sb.append("    resultLte: ").append(toIndentedString(resultLte)).append("\n");
    sb.append("    resultNot: ").append(toIndentedString(resultNot)).append("\n");
    sb.append("    resultNotContains: ").append(toIndentedString(resultNotContains)).append("\n");
    sb.append("    resultNotEndsWith: ").append(toIndentedString(resultNotEndsWith)).append("\n");
    sb.append("    resultNotIn: ").append(toIndentedString(resultNotIn)).append("\n");
    sb.append("    resultNotStartsWith: ").append(toIndentedString(resultNotStartsWith)).append("\n");
    sb.append("    resultStartsWith: ").append(toIndentedString(resultStartsWith)).append("\n");
    sb.append("    taskUuid: ").append(toIndentedString(taskUuid)).append("\n");
    sb.append("    taskUuidContains: ").append(toIndentedString(taskUuidContains)).append("\n");
    sb.append("    taskUuidEndsWith: ").append(toIndentedString(taskUuidEndsWith)).append("\n");
    sb.append("    taskUuidGt: ").append(toIndentedString(taskUuidGt)).append("\n");
    sb.append("    taskUuidGte: ").append(toIndentedString(taskUuidGte)).append("\n");
    sb.append("    taskUuidIn: ").append(toIndentedString(taskUuidIn)).append("\n");
    sb.append("    taskUuidLt: ").append(toIndentedString(taskUuidLt)).append("\n");
    sb.append("    taskUuidLte: ").append(toIndentedString(taskUuidLte)).append("\n");
    sb.append("    taskUuidNot: ").append(toIndentedString(taskUuidNot)).append("\n");
    sb.append("    taskUuidNotContains: ").append(toIndentedString(taskUuidNotContains)).append("\n");
    sb.append("    taskUuidNotEndsWith: ").append(toIndentedString(taskUuidNotEndsWith)).append("\n");
    sb.append("    taskUuidNotIn: ").append(toIndentedString(taskUuidNotIn)).append("\n");
    sb.append("    taskUuidNotStartsWith: ").append(toIndentedString(taskUuidNotStartsWith)).append("\n");
    sb.append("    taskUuidStartsWith: ").append(toIndentedString(taskUuidStartsWith)).append("\n");
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

