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
import com.smartx.tower.model.NotifierLanguageCode;
import com.smartx.tower.model.NotifierSecurityMode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * AlertNotifierWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class AlertNotifierWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<AlertNotifierWhereInput> AND = null;

  public static final String SERIALIZED_NAME_CLUSTERS_EVERY = "clusters_every";
  @SerializedName(SERIALIZED_NAME_CLUSTERS_EVERY)
  private ClusterWhereInput clustersEvery;

  public static final String SERIALIZED_NAME_CLUSTERS_NONE = "clusters_none";
  @SerializedName(SERIALIZED_NAME_CLUSTERS_NONE)
  private ClusterWhereInput clustersNone;

  public static final String SERIALIZED_NAME_CLUSTERS_SOME = "clusters_some";
  @SerializedName(SERIALIZED_NAME_CLUSTERS_SOME)
  private ClusterWhereInput clustersSome;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_DISABLED_NOT = "disabled_not";
  @SerializedName(SERIALIZED_NAME_DISABLED_NOT)
  private Boolean disabledNot;

  public static final String SERIALIZED_NAME_EMAIL_FROM = "email_from";
  @SerializedName(SERIALIZED_NAME_EMAIL_FROM)
  private String emailFrom;

  public static final String SERIALIZED_NAME_EMAIL_FROM_CONTAINS = "email_from_contains";
  @SerializedName(SERIALIZED_NAME_EMAIL_FROM_CONTAINS)
  private String emailFromContains;

  public static final String SERIALIZED_NAME_EMAIL_FROM_ENDS_WITH = "email_from_ends_with";
  @SerializedName(SERIALIZED_NAME_EMAIL_FROM_ENDS_WITH)
  private String emailFromEndsWith;

  public static final String SERIALIZED_NAME_EMAIL_FROM_GT = "email_from_gt";
  @SerializedName(SERIALIZED_NAME_EMAIL_FROM_GT)
  private String emailFromGt;

  public static final String SERIALIZED_NAME_EMAIL_FROM_GTE = "email_from_gte";
  @SerializedName(SERIALIZED_NAME_EMAIL_FROM_GTE)
  private String emailFromGte;

  public static final String SERIALIZED_NAME_EMAIL_FROM_IN = "email_from_in";
  @SerializedName(SERIALIZED_NAME_EMAIL_FROM_IN)
  private List<String> emailFromIn = null;

  public static final String SERIALIZED_NAME_EMAIL_FROM_LT = "email_from_lt";
  @SerializedName(SERIALIZED_NAME_EMAIL_FROM_LT)
  private String emailFromLt;

  public static final String SERIALIZED_NAME_EMAIL_FROM_LTE = "email_from_lte";
  @SerializedName(SERIALIZED_NAME_EMAIL_FROM_LTE)
  private String emailFromLte;

  public static final String SERIALIZED_NAME_EMAIL_FROM_NOT = "email_from_not";
  @SerializedName(SERIALIZED_NAME_EMAIL_FROM_NOT)
  private String emailFromNot;

  public static final String SERIALIZED_NAME_EMAIL_FROM_NOT_CONTAINS = "email_from_not_contains";
  @SerializedName(SERIALIZED_NAME_EMAIL_FROM_NOT_CONTAINS)
  private String emailFromNotContains;

  public static final String SERIALIZED_NAME_EMAIL_FROM_NOT_ENDS_WITH = "email_from_not_ends_with";
  @SerializedName(SERIALIZED_NAME_EMAIL_FROM_NOT_ENDS_WITH)
  private String emailFromNotEndsWith;

  public static final String SERIALIZED_NAME_EMAIL_FROM_NOT_IN = "email_from_not_in";
  @SerializedName(SERIALIZED_NAME_EMAIL_FROM_NOT_IN)
  private List<String> emailFromNotIn = null;

  public static final String SERIALIZED_NAME_EMAIL_FROM_NOT_STARTS_WITH = "email_from_not_starts_with";
  @SerializedName(SERIALIZED_NAME_EMAIL_FROM_NOT_STARTS_WITH)
  private String emailFromNotStartsWith;

  public static final String SERIALIZED_NAME_EMAIL_FROM_STARTS_WITH = "email_from_starts_with";
  @SerializedName(SERIALIZED_NAME_EMAIL_FROM_STARTS_WITH)
  private String emailFromStartsWith;

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

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private NotifierLanguageCode languageCode;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE_IN = "language_code_in";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE_IN)
  private List<NotifierLanguageCode> languageCodeIn = null;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE_NOT = "language_code_not";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE_NOT)
  private NotifierLanguageCode languageCodeNot;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE_NOT_IN = "language_code_not_in";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE_NOT_IN)
  private List<NotifierLanguageCode> languageCodeNotIn = null;

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

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<AlertNotifierWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<AlertNotifierWhereInput> OR = null;

  public static final String SERIALIZED_NAME_SECURITY_MODE = "security_mode";
  @SerializedName(SERIALIZED_NAME_SECURITY_MODE)
  private NotifierSecurityMode securityMode;

  public static final String SERIALIZED_NAME_SECURITY_MODE_IN = "security_mode_in";
  @SerializedName(SERIALIZED_NAME_SECURITY_MODE_IN)
  private List<NotifierSecurityMode> securityModeIn = null;

  public static final String SERIALIZED_NAME_SECURITY_MODE_NOT = "security_mode_not";
  @SerializedName(SERIALIZED_NAME_SECURITY_MODE_NOT)
  private NotifierSecurityMode securityModeNot;

  public static final String SERIALIZED_NAME_SECURITY_MODE_NOT_IN = "security_mode_not_in";
  @SerializedName(SERIALIZED_NAME_SECURITY_MODE_NOT_IN)
  private List<NotifierSecurityMode> securityModeNotIn = null;

  public static final String SERIALIZED_NAME_SMTP_SERVER_HOST = "smtp_server_host";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_HOST)
  private String smtpServerHost;

  public static final String SERIALIZED_NAME_SMTP_SERVER_HOST_CONTAINS = "smtp_server_host_contains";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_HOST_CONTAINS)
  private String smtpServerHostContains;

  public static final String SERIALIZED_NAME_SMTP_SERVER_HOST_ENDS_WITH = "smtp_server_host_ends_with";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_HOST_ENDS_WITH)
  private String smtpServerHostEndsWith;

  public static final String SERIALIZED_NAME_SMTP_SERVER_HOST_GT = "smtp_server_host_gt";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_HOST_GT)
  private String smtpServerHostGt;

  public static final String SERIALIZED_NAME_SMTP_SERVER_HOST_GTE = "smtp_server_host_gte";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_HOST_GTE)
  private String smtpServerHostGte;

  public static final String SERIALIZED_NAME_SMTP_SERVER_HOST_IN = "smtp_server_host_in";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_HOST_IN)
  private List<String> smtpServerHostIn = null;

  public static final String SERIALIZED_NAME_SMTP_SERVER_HOST_LT = "smtp_server_host_lt";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_HOST_LT)
  private String smtpServerHostLt;

  public static final String SERIALIZED_NAME_SMTP_SERVER_HOST_LTE = "smtp_server_host_lte";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_HOST_LTE)
  private String smtpServerHostLte;

  public static final String SERIALIZED_NAME_SMTP_SERVER_HOST_NOT = "smtp_server_host_not";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_HOST_NOT)
  private String smtpServerHostNot;

  public static final String SERIALIZED_NAME_SMTP_SERVER_HOST_NOT_CONTAINS = "smtp_server_host_not_contains";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_HOST_NOT_CONTAINS)
  private String smtpServerHostNotContains;

  public static final String SERIALIZED_NAME_SMTP_SERVER_HOST_NOT_ENDS_WITH = "smtp_server_host_not_ends_with";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_HOST_NOT_ENDS_WITH)
  private String smtpServerHostNotEndsWith;

  public static final String SERIALIZED_NAME_SMTP_SERVER_HOST_NOT_IN = "smtp_server_host_not_in";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_HOST_NOT_IN)
  private List<String> smtpServerHostNotIn = null;

  public static final String SERIALIZED_NAME_SMTP_SERVER_HOST_NOT_STARTS_WITH = "smtp_server_host_not_starts_with";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_HOST_NOT_STARTS_WITH)
  private String smtpServerHostNotStartsWith;

  public static final String SERIALIZED_NAME_SMTP_SERVER_HOST_STARTS_WITH = "smtp_server_host_starts_with";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_HOST_STARTS_WITH)
  private String smtpServerHostStartsWith;

  public static final String SERIALIZED_NAME_SMTP_SERVER_PORT = "smtp_server_port";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_PORT)
  private Integer smtpServerPort;

  public static final String SERIALIZED_NAME_SMTP_SERVER_PORT_GT = "smtp_server_port_gt";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_PORT_GT)
  private Integer smtpServerPortGt;

  public static final String SERIALIZED_NAME_SMTP_SERVER_PORT_GTE = "smtp_server_port_gte";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_PORT_GTE)
  private Integer smtpServerPortGte;

  public static final String SERIALIZED_NAME_SMTP_SERVER_PORT_IN = "smtp_server_port_in";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_PORT_IN)
  private List<Integer> smtpServerPortIn = null;

  public static final String SERIALIZED_NAME_SMTP_SERVER_PORT_LT = "smtp_server_port_lt";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_PORT_LT)
  private Integer smtpServerPortLt;

  public static final String SERIALIZED_NAME_SMTP_SERVER_PORT_LTE = "smtp_server_port_lte";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_PORT_LTE)
  private Integer smtpServerPortLte;

  public static final String SERIALIZED_NAME_SMTP_SERVER_PORT_NOT = "smtp_server_port_not";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_PORT_NOT)
  private Integer smtpServerPortNot;

  public static final String SERIALIZED_NAME_SMTP_SERVER_PORT_NOT_IN = "smtp_server_port_not_in";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_PORT_NOT_IN)
  private List<Integer> smtpServerPortNotIn = null;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_USERNAME_CONTAINS = "username_contains";
  @SerializedName(SERIALIZED_NAME_USERNAME_CONTAINS)
  private String usernameContains;

  public static final String SERIALIZED_NAME_USERNAME_ENDS_WITH = "username_ends_with";
  @SerializedName(SERIALIZED_NAME_USERNAME_ENDS_WITH)
  private String usernameEndsWith;

  public static final String SERIALIZED_NAME_USERNAME_GT = "username_gt";
  @SerializedName(SERIALIZED_NAME_USERNAME_GT)
  private String usernameGt;

  public static final String SERIALIZED_NAME_USERNAME_GTE = "username_gte";
  @SerializedName(SERIALIZED_NAME_USERNAME_GTE)
  private String usernameGte;

  public static final String SERIALIZED_NAME_USERNAME_IN = "username_in";
  @SerializedName(SERIALIZED_NAME_USERNAME_IN)
  private List<String> usernameIn = null;

  public static final String SERIALIZED_NAME_USERNAME_LT = "username_lt";
  @SerializedName(SERIALIZED_NAME_USERNAME_LT)
  private String usernameLt;

  public static final String SERIALIZED_NAME_USERNAME_LTE = "username_lte";
  @SerializedName(SERIALIZED_NAME_USERNAME_LTE)
  private String usernameLte;

  public static final String SERIALIZED_NAME_USERNAME_NOT = "username_not";
  @SerializedName(SERIALIZED_NAME_USERNAME_NOT)
  private String usernameNot;

  public static final String SERIALIZED_NAME_USERNAME_NOT_CONTAINS = "username_not_contains";
  @SerializedName(SERIALIZED_NAME_USERNAME_NOT_CONTAINS)
  private String usernameNotContains;

  public static final String SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH = "username_not_ends_with";
  @SerializedName(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH)
  private String usernameNotEndsWith;

  public static final String SERIALIZED_NAME_USERNAME_NOT_IN = "username_not_in";
  @SerializedName(SERIALIZED_NAME_USERNAME_NOT_IN)
  private List<String> usernameNotIn = null;

  public static final String SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH = "username_not_starts_with";
  @SerializedName(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH)
  private String usernameNotStartsWith;

  public static final String SERIALIZED_NAME_USERNAME_STARTS_WITH = "username_starts_with";
  @SerializedName(SERIALIZED_NAME_USERNAME_STARTS_WITH)
  private String usernameStartsWith;

  public AlertNotifierWhereInput() { 
  }

  public AlertNotifierWhereInput AND(List<AlertNotifierWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public AlertNotifierWhereInput addANDItem(AlertNotifierWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<AlertNotifierWhereInput>();
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

  public List<AlertNotifierWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<AlertNotifierWhereInput> AND) {
    this.AND = AND;
  }


  public AlertNotifierWhereInput clustersEvery(ClusterWhereInput clustersEvery) {
    
    this.clustersEvery = clustersEvery;
    return this;
  }

   /**
   * Get clustersEvery
   * @return clustersEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterWhereInput getClustersEvery() {
    return clustersEvery;
  }


  public void setClustersEvery(ClusterWhereInput clustersEvery) {
    this.clustersEvery = clustersEvery;
  }


  public AlertNotifierWhereInput clustersNone(ClusterWhereInput clustersNone) {
    
    this.clustersNone = clustersNone;
    return this;
  }

   /**
   * Get clustersNone
   * @return clustersNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterWhereInput getClustersNone() {
    return clustersNone;
  }


  public void setClustersNone(ClusterWhereInput clustersNone) {
    this.clustersNone = clustersNone;
  }


  public AlertNotifierWhereInput clustersSome(ClusterWhereInput clustersSome) {
    
    this.clustersSome = clustersSome;
    return this;
  }

   /**
   * Get clustersSome
   * @return clustersSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterWhereInput getClustersSome() {
    return clustersSome;
  }


  public void setClustersSome(ClusterWhereInput clustersSome) {
    this.clustersSome = clustersSome;
  }


  public AlertNotifierWhereInput disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public AlertNotifierWhereInput disabledNot(Boolean disabledNot) {
    
    this.disabledNot = disabledNot;
    return this;
  }

   /**
   * Get disabledNot
   * @return disabledNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisabledNot() {
    return disabledNot;
  }


  public void setDisabledNot(Boolean disabledNot) {
    this.disabledNot = disabledNot;
  }


  public AlertNotifierWhereInput emailFrom(String emailFrom) {
    
    this.emailFrom = emailFrom;
    return this;
  }

   /**
   * Get emailFrom
   * @return emailFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailFrom() {
    return emailFrom;
  }


  public void setEmailFrom(String emailFrom) {
    this.emailFrom = emailFrom;
  }


  public AlertNotifierWhereInput emailFromContains(String emailFromContains) {
    
    this.emailFromContains = emailFromContains;
    return this;
  }

   /**
   * Get emailFromContains
   * @return emailFromContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailFromContains() {
    return emailFromContains;
  }


  public void setEmailFromContains(String emailFromContains) {
    this.emailFromContains = emailFromContains;
  }


  public AlertNotifierWhereInput emailFromEndsWith(String emailFromEndsWith) {
    
    this.emailFromEndsWith = emailFromEndsWith;
    return this;
  }

   /**
   * Get emailFromEndsWith
   * @return emailFromEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailFromEndsWith() {
    return emailFromEndsWith;
  }


  public void setEmailFromEndsWith(String emailFromEndsWith) {
    this.emailFromEndsWith = emailFromEndsWith;
  }


  public AlertNotifierWhereInput emailFromGt(String emailFromGt) {
    
    this.emailFromGt = emailFromGt;
    return this;
  }

   /**
   * Get emailFromGt
   * @return emailFromGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailFromGt() {
    return emailFromGt;
  }


  public void setEmailFromGt(String emailFromGt) {
    this.emailFromGt = emailFromGt;
  }


  public AlertNotifierWhereInput emailFromGte(String emailFromGte) {
    
    this.emailFromGte = emailFromGte;
    return this;
  }

   /**
   * Get emailFromGte
   * @return emailFromGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailFromGte() {
    return emailFromGte;
  }


  public void setEmailFromGte(String emailFromGte) {
    this.emailFromGte = emailFromGte;
  }


  public AlertNotifierWhereInput emailFromIn(List<String> emailFromIn) {
    
    this.emailFromIn = emailFromIn;
    return this;
  }

  public AlertNotifierWhereInput addEmailFromInItem(String emailFromInItem) {
    if (this.emailFromIn == null) {
      this.emailFromIn = new ArrayList<String>();
    }
    this.emailFromIn.add(emailFromInItem);
    return this;
  }

   /**
   * Get emailFromIn
   * @return emailFromIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEmailFromIn() {
    return emailFromIn;
  }


  public void setEmailFromIn(List<String> emailFromIn) {
    this.emailFromIn = emailFromIn;
  }


  public AlertNotifierWhereInput emailFromLt(String emailFromLt) {
    
    this.emailFromLt = emailFromLt;
    return this;
  }

   /**
   * Get emailFromLt
   * @return emailFromLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailFromLt() {
    return emailFromLt;
  }


  public void setEmailFromLt(String emailFromLt) {
    this.emailFromLt = emailFromLt;
  }


  public AlertNotifierWhereInput emailFromLte(String emailFromLte) {
    
    this.emailFromLte = emailFromLte;
    return this;
  }

   /**
   * Get emailFromLte
   * @return emailFromLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailFromLte() {
    return emailFromLte;
  }


  public void setEmailFromLte(String emailFromLte) {
    this.emailFromLte = emailFromLte;
  }


  public AlertNotifierWhereInput emailFromNot(String emailFromNot) {
    
    this.emailFromNot = emailFromNot;
    return this;
  }

   /**
   * Get emailFromNot
   * @return emailFromNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailFromNot() {
    return emailFromNot;
  }


  public void setEmailFromNot(String emailFromNot) {
    this.emailFromNot = emailFromNot;
  }


  public AlertNotifierWhereInput emailFromNotContains(String emailFromNotContains) {
    
    this.emailFromNotContains = emailFromNotContains;
    return this;
  }

   /**
   * Get emailFromNotContains
   * @return emailFromNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailFromNotContains() {
    return emailFromNotContains;
  }


  public void setEmailFromNotContains(String emailFromNotContains) {
    this.emailFromNotContains = emailFromNotContains;
  }


  public AlertNotifierWhereInput emailFromNotEndsWith(String emailFromNotEndsWith) {
    
    this.emailFromNotEndsWith = emailFromNotEndsWith;
    return this;
  }

   /**
   * Get emailFromNotEndsWith
   * @return emailFromNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailFromNotEndsWith() {
    return emailFromNotEndsWith;
  }


  public void setEmailFromNotEndsWith(String emailFromNotEndsWith) {
    this.emailFromNotEndsWith = emailFromNotEndsWith;
  }


  public AlertNotifierWhereInput emailFromNotIn(List<String> emailFromNotIn) {
    
    this.emailFromNotIn = emailFromNotIn;
    return this;
  }

  public AlertNotifierWhereInput addEmailFromNotInItem(String emailFromNotInItem) {
    if (this.emailFromNotIn == null) {
      this.emailFromNotIn = new ArrayList<String>();
    }
    this.emailFromNotIn.add(emailFromNotInItem);
    return this;
  }

   /**
   * Get emailFromNotIn
   * @return emailFromNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEmailFromNotIn() {
    return emailFromNotIn;
  }


  public void setEmailFromNotIn(List<String> emailFromNotIn) {
    this.emailFromNotIn = emailFromNotIn;
  }


  public AlertNotifierWhereInput emailFromNotStartsWith(String emailFromNotStartsWith) {
    
    this.emailFromNotStartsWith = emailFromNotStartsWith;
    return this;
  }

   /**
   * Get emailFromNotStartsWith
   * @return emailFromNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailFromNotStartsWith() {
    return emailFromNotStartsWith;
  }


  public void setEmailFromNotStartsWith(String emailFromNotStartsWith) {
    this.emailFromNotStartsWith = emailFromNotStartsWith;
  }


  public AlertNotifierWhereInput emailFromStartsWith(String emailFromStartsWith) {
    
    this.emailFromStartsWith = emailFromStartsWith;
    return this;
  }

   /**
   * Get emailFromStartsWith
   * @return emailFromStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailFromStartsWith() {
    return emailFromStartsWith;
  }


  public void setEmailFromStartsWith(String emailFromStartsWith) {
    this.emailFromStartsWith = emailFromStartsWith;
  }


  public AlertNotifierWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public AlertNotifierWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public AlertNotifierWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public AlertNotifierWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public AlertNotifierWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public AlertNotifierWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public AlertNotifierWhereInput id(String id) {
    
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


  public AlertNotifierWhereInput idContains(String idContains) {
    
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


  public AlertNotifierWhereInput idEndsWith(String idEndsWith) {
    
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


  public AlertNotifierWhereInput idGt(String idGt) {
    
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


  public AlertNotifierWhereInput idGte(String idGte) {
    
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


  public AlertNotifierWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public AlertNotifierWhereInput addIdInItem(String idInItem) {
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


  public AlertNotifierWhereInput idLt(String idLt) {
    
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


  public AlertNotifierWhereInput idLte(String idLte) {
    
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


  public AlertNotifierWhereInput idNot(String idNot) {
    
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


  public AlertNotifierWhereInput idNotContains(String idNotContains) {
    
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


  public AlertNotifierWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public AlertNotifierWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public AlertNotifierWhereInput addIdNotInItem(String idNotInItem) {
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


  public AlertNotifierWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public AlertNotifierWhereInput idStartsWith(String idStartsWith) {
    
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


  public AlertNotifierWhereInput languageCode(NotifierLanguageCode languageCode) {
    
    this.languageCode = languageCode;
    return this;
  }

   /**
   * Get languageCode
   * @return languageCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NotifierLanguageCode getLanguageCode() {
    return languageCode;
  }


  public void setLanguageCode(NotifierLanguageCode languageCode) {
    this.languageCode = languageCode;
  }


  public AlertNotifierWhereInput languageCodeIn(List<NotifierLanguageCode> languageCodeIn) {
    
    this.languageCodeIn = languageCodeIn;
    return this;
  }

  public AlertNotifierWhereInput addLanguageCodeInItem(NotifierLanguageCode languageCodeInItem) {
    if (this.languageCodeIn == null) {
      this.languageCodeIn = new ArrayList<NotifierLanguageCode>();
    }
    this.languageCodeIn.add(languageCodeInItem);
    return this;
  }

   /**
   * Get languageCodeIn
   * @return languageCodeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NotifierLanguageCode> getLanguageCodeIn() {
    return languageCodeIn;
  }


  public void setLanguageCodeIn(List<NotifierLanguageCode> languageCodeIn) {
    this.languageCodeIn = languageCodeIn;
  }


  public AlertNotifierWhereInput languageCodeNot(NotifierLanguageCode languageCodeNot) {
    
    this.languageCodeNot = languageCodeNot;
    return this;
  }

   /**
   * Get languageCodeNot
   * @return languageCodeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NotifierLanguageCode getLanguageCodeNot() {
    return languageCodeNot;
  }


  public void setLanguageCodeNot(NotifierLanguageCode languageCodeNot) {
    this.languageCodeNot = languageCodeNot;
  }


  public AlertNotifierWhereInput languageCodeNotIn(List<NotifierLanguageCode> languageCodeNotIn) {
    
    this.languageCodeNotIn = languageCodeNotIn;
    return this;
  }

  public AlertNotifierWhereInput addLanguageCodeNotInItem(NotifierLanguageCode languageCodeNotInItem) {
    if (this.languageCodeNotIn == null) {
      this.languageCodeNotIn = new ArrayList<NotifierLanguageCode>();
    }
    this.languageCodeNotIn.add(languageCodeNotInItem);
    return this;
  }

   /**
   * Get languageCodeNotIn
   * @return languageCodeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NotifierLanguageCode> getLanguageCodeNotIn() {
    return languageCodeNotIn;
  }


  public void setLanguageCodeNotIn(List<NotifierLanguageCode> languageCodeNotIn) {
    this.languageCodeNotIn = languageCodeNotIn;
  }


  public AlertNotifierWhereInput name(String name) {
    
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


  public AlertNotifierWhereInput nameContains(String nameContains) {
    
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


  public AlertNotifierWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public AlertNotifierWhereInput nameGt(String nameGt) {
    
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


  public AlertNotifierWhereInput nameGte(String nameGte) {
    
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


  public AlertNotifierWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public AlertNotifierWhereInput addNameInItem(String nameInItem) {
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


  public AlertNotifierWhereInput nameLt(String nameLt) {
    
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


  public AlertNotifierWhereInput nameLte(String nameLte) {
    
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


  public AlertNotifierWhereInput nameNot(String nameNot) {
    
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


  public AlertNotifierWhereInput nameNotContains(String nameNotContains) {
    
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


  public AlertNotifierWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public AlertNotifierWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public AlertNotifierWhereInput addNameNotInItem(String nameNotInItem) {
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


  public AlertNotifierWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public AlertNotifierWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public AlertNotifierWhereInput NOT(List<AlertNotifierWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public AlertNotifierWhereInput addNOTItem(AlertNotifierWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<AlertNotifierWhereInput>();
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

  public List<AlertNotifierWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<AlertNotifierWhereInput> NOT) {
    this.NOT = NOT;
  }


  public AlertNotifierWhereInput OR(List<AlertNotifierWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public AlertNotifierWhereInput addORItem(AlertNotifierWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<AlertNotifierWhereInput>();
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

  public List<AlertNotifierWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<AlertNotifierWhereInput> OR) {
    this.OR = OR;
  }


  public AlertNotifierWhereInput securityMode(NotifierSecurityMode securityMode) {
    
    this.securityMode = securityMode;
    return this;
  }

   /**
   * Get securityMode
   * @return securityMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NotifierSecurityMode getSecurityMode() {
    return securityMode;
  }


  public void setSecurityMode(NotifierSecurityMode securityMode) {
    this.securityMode = securityMode;
  }


  public AlertNotifierWhereInput securityModeIn(List<NotifierSecurityMode> securityModeIn) {
    
    this.securityModeIn = securityModeIn;
    return this;
  }

  public AlertNotifierWhereInput addSecurityModeInItem(NotifierSecurityMode securityModeInItem) {
    if (this.securityModeIn == null) {
      this.securityModeIn = new ArrayList<NotifierSecurityMode>();
    }
    this.securityModeIn.add(securityModeInItem);
    return this;
  }

   /**
   * Get securityModeIn
   * @return securityModeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NotifierSecurityMode> getSecurityModeIn() {
    return securityModeIn;
  }


  public void setSecurityModeIn(List<NotifierSecurityMode> securityModeIn) {
    this.securityModeIn = securityModeIn;
  }


  public AlertNotifierWhereInput securityModeNot(NotifierSecurityMode securityModeNot) {
    
    this.securityModeNot = securityModeNot;
    return this;
  }

   /**
   * Get securityModeNot
   * @return securityModeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NotifierSecurityMode getSecurityModeNot() {
    return securityModeNot;
  }


  public void setSecurityModeNot(NotifierSecurityMode securityModeNot) {
    this.securityModeNot = securityModeNot;
  }


  public AlertNotifierWhereInput securityModeNotIn(List<NotifierSecurityMode> securityModeNotIn) {
    
    this.securityModeNotIn = securityModeNotIn;
    return this;
  }

  public AlertNotifierWhereInput addSecurityModeNotInItem(NotifierSecurityMode securityModeNotInItem) {
    if (this.securityModeNotIn == null) {
      this.securityModeNotIn = new ArrayList<NotifierSecurityMode>();
    }
    this.securityModeNotIn.add(securityModeNotInItem);
    return this;
  }

   /**
   * Get securityModeNotIn
   * @return securityModeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NotifierSecurityMode> getSecurityModeNotIn() {
    return securityModeNotIn;
  }


  public void setSecurityModeNotIn(List<NotifierSecurityMode> securityModeNotIn) {
    this.securityModeNotIn = securityModeNotIn;
  }


  public AlertNotifierWhereInput smtpServerHost(String smtpServerHost) {
    
    this.smtpServerHost = smtpServerHost;
    return this;
  }

   /**
   * Get smtpServerHost
   * @return smtpServerHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSmtpServerHost() {
    return smtpServerHost;
  }


  public void setSmtpServerHost(String smtpServerHost) {
    this.smtpServerHost = smtpServerHost;
  }


  public AlertNotifierWhereInput smtpServerHostContains(String smtpServerHostContains) {
    
    this.smtpServerHostContains = smtpServerHostContains;
    return this;
  }

   /**
   * Get smtpServerHostContains
   * @return smtpServerHostContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSmtpServerHostContains() {
    return smtpServerHostContains;
  }


  public void setSmtpServerHostContains(String smtpServerHostContains) {
    this.smtpServerHostContains = smtpServerHostContains;
  }


  public AlertNotifierWhereInput smtpServerHostEndsWith(String smtpServerHostEndsWith) {
    
    this.smtpServerHostEndsWith = smtpServerHostEndsWith;
    return this;
  }

   /**
   * Get smtpServerHostEndsWith
   * @return smtpServerHostEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSmtpServerHostEndsWith() {
    return smtpServerHostEndsWith;
  }


  public void setSmtpServerHostEndsWith(String smtpServerHostEndsWith) {
    this.smtpServerHostEndsWith = smtpServerHostEndsWith;
  }


  public AlertNotifierWhereInput smtpServerHostGt(String smtpServerHostGt) {
    
    this.smtpServerHostGt = smtpServerHostGt;
    return this;
  }

   /**
   * Get smtpServerHostGt
   * @return smtpServerHostGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSmtpServerHostGt() {
    return smtpServerHostGt;
  }


  public void setSmtpServerHostGt(String smtpServerHostGt) {
    this.smtpServerHostGt = smtpServerHostGt;
  }


  public AlertNotifierWhereInput smtpServerHostGte(String smtpServerHostGte) {
    
    this.smtpServerHostGte = smtpServerHostGte;
    return this;
  }

   /**
   * Get smtpServerHostGte
   * @return smtpServerHostGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSmtpServerHostGte() {
    return smtpServerHostGte;
  }


  public void setSmtpServerHostGte(String smtpServerHostGte) {
    this.smtpServerHostGte = smtpServerHostGte;
  }


  public AlertNotifierWhereInput smtpServerHostIn(List<String> smtpServerHostIn) {
    
    this.smtpServerHostIn = smtpServerHostIn;
    return this;
  }

  public AlertNotifierWhereInput addSmtpServerHostInItem(String smtpServerHostInItem) {
    if (this.smtpServerHostIn == null) {
      this.smtpServerHostIn = new ArrayList<String>();
    }
    this.smtpServerHostIn.add(smtpServerHostInItem);
    return this;
  }

   /**
   * Get smtpServerHostIn
   * @return smtpServerHostIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSmtpServerHostIn() {
    return smtpServerHostIn;
  }


  public void setSmtpServerHostIn(List<String> smtpServerHostIn) {
    this.smtpServerHostIn = smtpServerHostIn;
  }


  public AlertNotifierWhereInput smtpServerHostLt(String smtpServerHostLt) {
    
    this.smtpServerHostLt = smtpServerHostLt;
    return this;
  }

   /**
   * Get smtpServerHostLt
   * @return smtpServerHostLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSmtpServerHostLt() {
    return smtpServerHostLt;
  }


  public void setSmtpServerHostLt(String smtpServerHostLt) {
    this.smtpServerHostLt = smtpServerHostLt;
  }


  public AlertNotifierWhereInput smtpServerHostLte(String smtpServerHostLte) {
    
    this.smtpServerHostLte = smtpServerHostLte;
    return this;
  }

   /**
   * Get smtpServerHostLte
   * @return smtpServerHostLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSmtpServerHostLte() {
    return smtpServerHostLte;
  }


  public void setSmtpServerHostLte(String smtpServerHostLte) {
    this.smtpServerHostLte = smtpServerHostLte;
  }


  public AlertNotifierWhereInput smtpServerHostNot(String smtpServerHostNot) {
    
    this.smtpServerHostNot = smtpServerHostNot;
    return this;
  }

   /**
   * Get smtpServerHostNot
   * @return smtpServerHostNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSmtpServerHostNot() {
    return smtpServerHostNot;
  }


  public void setSmtpServerHostNot(String smtpServerHostNot) {
    this.smtpServerHostNot = smtpServerHostNot;
  }


  public AlertNotifierWhereInput smtpServerHostNotContains(String smtpServerHostNotContains) {
    
    this.smtpServerHostNotContains = smtpServerHostNotContains;
    return this;
  }

   /**
   * Get smtpServerHostNotContains
   * @return smtpServerHostNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSmtpServerHostNotContains() {
    return smtpServerHostNotContains;
  }


  public void setSmtpServerHostNotContains(String smtpServerHostNotContains) {
    this.smtpServerHostNotContains = smtpServerHostNotContains;
  }


  public AlertNotifierWhereInput smtpServerHostNotEndsWith(String smtpServerHostNotEndsWith) {
    
    this.smtpServerHostNotEndsWith = smtpServerHostNotEndsWith;
    return this;
  }

   /**
   * Get smtpServerHostNotEndsWith
   * @return smtpServerHostNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSmtpServerHostNotEndsWith() {
    return smtpServerHostNotEndsWith;
  }


  public void setSmtpServerHostNotEndsWith(String smtpServerHostNotEndsWith) {
    this.smtpServerHostNotEndsWith = smtpServerHostNotEndsWith;
  }


  public AlertNotifierWhereInput smtpServerHostNotIn(List<String> smtpServerHostNotIn) {
    
    this.smtpServerHostNotIn = smtpServerHostNotIn;
    return this;
  }

  public AlertNotifierWhereInput addSmtpServerHostNotInItem(String smtpServerHostNotInItem) {
    if (this.smtpServerHostNotIn == null) {
      this.smtpServerHostNotIn = new ArrayList<String>();
    }
    this.smtpServerHostNotIn.add(smtpServerHostNotInItem);
    return this;
  }

   /**
   * Get smtpServerHostNotIn
   * @return smtpServerHostNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSmtpServerHostNotIn() {
    return smtpServerHostNotIn;
  }


  public void setSmtpServerHostNotIn(List<String> smtpServerHostNotIn) {
    this.smtpServerHostNotIn = smtpServerHostNotIn;
  }


  public AlertNotifierWhereInput smtpServerHostNotStartsWith(String smtpServerHostNotStartsWith) {
    
    this.smtpServerHostNotStartsWith = smtpServerHostNotStartsWith;
    return this;
  }

   /**
   * Get smtpServerHostNotStartsWith
   * @return smtpServerHostNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSmtpServerHostNotStartsWith() {
    return smtpServerHostNotStartsWith;
  }


  public void setSmtpServerHostNotStartsWith(String smtpServerHostNotStartsWith) {
    this.smtpServerHostNotStartsWith = smtpServerHostNotStartsWith;
  }


  public AlertNotifierWhereInput smtpServerHostStartsWith(String smtpServerHostStartsWith) {
    
    this.smtpServerHostStartsWith = smtpServerHostStartsWith;
    return this;
  }

   /**
   * Get smtpServerHostStartsWith
   * @return smtpServerHostStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSmtpServerHostStartsWith() {
    return smtpServerHostStartsWith;
  }


  public void setSmtpServerHostStartsWith(String smtpServerHostStartsWith) {
    this.smtpServerHostStartsWith = smtpServerHostStartsWith;
  }


  public AlertNotifierWhereInput smtpServerPort(Integer smtpServerPort) {
    
    this.smtpServerPort = smtpServerPort;
    return this;
  }

   /**
   * Get smtpServerPort
   * @return smtpServerPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSmtpServerPort() {
    return smtpServerPort;
  }


  public void setSmtpServerPort(Integer smtpServerPort) {
    this.smtpServerPort = smtpServerPort;
  }


  public AlertNotifierWhereInput smtpServerPortGt(Integer smtpServerPortGt) {
    
    this.smtpServerPortGt = smtpServerPortGt;
    return this;
  }

   /**
   * Get smtpServerPortGt
   * @return smtpServerPortGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSmtpServerPortGt() {
    return smtpServerPortGt;
  }


  public void setSmtpServerPortGt(Integer smtpServerPortGt) {
    this.smtpServerPortGt = smtpServerPortGt;
  }


  public AlertNotifierWhereInput smtpServerPortGte(Integer smtpServerPortGte) {
    
    this.smtpServerPortGte = smtpServerPortGte;
    return this;
  }

   /**
   * Get smtpServerPortGte
   * @return smtpServerPortGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSmtpServerPortGte() {
    return smtpServerPortGte;
  }


  public void setSmtpServerPortGte(Integer smtpServerPortGte) {
    this.smtpServerPortGte = smtpServerPortGte;
  }


  public AlertNotifierWhereInput smtpServerPortIn(List<Integer> smtpServerPortIn) {
    
    this.smtpServerPortIn = smtpServerPortIn;
    return this;
  }

  public AlertNotifierWhereInput addSmtpServerPortInItem(Integer smtpServerPortInItem) {
    if (this.smtpServerPortIn == null) {
      this.smtpServerPortIn = new ArrayList<Integer>();
    }
    this.smtpServerPortIn.add(smtpServerPortInItem);
    return this;
  }

   /**
   * Get smtpServerPortIn
   * @return smtpServerPortIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getSmtpServerPortIn() {
    return smtpServerPortIn;
  }


  public void setSmtpServerPortIn(List<Integer> smtpServerPortIn) {
    this.smtpServerPortIn = smtpServerPortIn;
  }


  public AlertNotifierWhereInput smtpServerPortLt(Integer smtpServerPortLt) {
    
    this.smtpServerPortLt = smtpServerPortLt;
    return this;
  }

   /**
   * Get smtpServerPortLt
   * @return smtpServerPortLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSmtpServerPortLt() {
    return smtpServerPortLt;
  }


  public void setSmtpServerPortLt(Integer smtpServerPortLt) {
    this.smtpServerPortLt = smtpServerPortLt;
  }


  public AlertNotifierWhereInput smtpServerPortLte(Integer smtpServerPortLte) {
    
    this.smtpServerPortLte = smtpServerPortLte;
    return this;
  }

   /**
   * Get smtpServerPortLte
   * @return smtpServerPortLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSmtpServerPortLte() {
    return smtpServerPortLte;
  }


  public void setSmtpServerPortLte(Integer smtpServerPortLte) {
    this.smtpServerPortLte = smtpServerPortLte;
  }


  public AlertNotifierWhereInput smtpServerPortNot(Integer smtpServerPortNot) {
    
    this.smtpServerPortNot = smtpServerPortNot;
    return this;
  }

   /**
   * Get smtpServerPortNot
   * @return smtpServerPortNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSmtpServerPortNot() {
    return smtpServerPortNot;
  }


  public void setSmtpServerPortNot(Integer smtpServerPortNot) {
    this.smtpServerPortNot = smtpServerPortNot;
  }


  public AlertNotifierWhereInput smtpServerPortNotIn(List<Integer> smtpServerPortNotIn) {
    
    this.smtpServerPortNotIn = smtpServerPortNotIn;
    return this;
  }

  public AlertNotifierWhereInput addSmtpServerPortNotInItem(Integer smtpServerPortNotInItem) {
    if (this.smtpServerPortNotIn == null) {
      this.smtpServerPortNotIn = new ArrayList<Integer>();
    }
    this.smtpServerPortNotIn.add(smtpServerPortNotInItem);
    return this;
  }

   /**
   * Get smtpServerPortNotIn
   * @return smtpServerPortNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getSmtpServerPortNotIn() {
    return smtpServerPortNotIn;
  }


  public void setSmtpServerPortNotIn(List<Integer> smtpServerPortNotIn) {
    this.smtpServerPortNotIn = smtpServerPortNotIn;
  }


  public AlertNotifierWhereInput username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public AlertNotifierWhereInput usernameContains(String usernameContains) {
    
    this.usernameContains = usernameContains;
    return this;
  }

   /**
   * Get usernameContains
   * @return usernameContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameContains() {
    return usernameContains;
  }


  public void setUsernameContains(String usernameContains) {
    this.usernameContains = usernameContains;
  }


  public AlertNotifierWhereInput usernameEndsWith(String usernameEndsWith) {
    
    this.usernameEndsWith = usernameEndsWith;
    return this;
  }

   /**
   * Get usernameEndsWith
   * @return usernameEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameEndsWith() {
    return usernameEndsWith;
  }


  public void setUsernameEndsWith(String usernameEndsWith) {
    this.usernameEndsWith = usernameEndsWith;
  }


  public AlertNotifierWhereInput usernameGt(String usernameGt) {
    
    this.usernameGt = usernameGt;
    return this;
  }

   /**
   * Get usernameGt
   * @return usernameGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameGt() {
    return usernameGt;
  }


  public void setUsernameGt(String usernameGt) {
    this.usernameGt = usernameGt;
  }


  public AlertNotifierWhereInput usernameGte(String usernameGte) {
    
    this.usernameGte = usernameGte;
    return this;
  }

   /**
   * Get usernameGte
   * @return usernameGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameGte() {
    return usernameGte;
  }


  public void setUsernameGte(String usernameGte) {
    this.usernameGte = usernameGte;
  }


  public AlertNotifierWhereInput usernameIn(List<String> usernameIn) {
    
    this.usernameIn = usernameIn;
    return this;
  }

  public AlertNotifierWhereInput addUsernameInItem(String usernameInItem) {
    if (this.usernameIn == null) {
      this.usernameIn = new ArrayList<String>();
    }
    this.usernameIn.add(usernameInItem);
    return this;
  }

   /**
   * Get usernameIn
   * @return usernameIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUsernameIn() {
    return usernameIn;
  }


  public void setUsernameIn(List<String> usernameIn) {
    this.usernameIn = usernameIn;
  }


  public AlertNotifierWhereInput usernameLt(String usernameLt) {
    
    this.usernameLt = usernameLt;
    return this;
  }

   /**
   * Get usernameLt
   * @return usernameLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameLt() {
    return usernameLt;
  }


  public void setUsernameLt(String usernameLt) {
    this.usernameLt = usernameLt;
  }


  public AlertNotifierWhereInput usernameLte(String usernameLte) {
    
    this.usernameLte = usernameLte;
    return this;
  }

   /**
   * Get usernameLte
   * @return usernameLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameLte() {
    return usernameLte;
  }


  public void setUsernameLte(String usernameLte) {
    this.usernameLte = usernameLte;
  }


  public AlertNotifierWhereInput usernameNot(String usernameNot) {
    
    this.usernameNot = usernameNot;
    return this;
  }

   /**
   * Get usernameNot
   * @return usernameNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameNot() {
    return usernameNot;
  }


  public void setUsernameNot(String usernameNot) {
    this.usernameNot = usernameNot;
  }


  public AlertNotifierWhereInput usernameNotContains(String usernameNotContains) {
    
    this.usernameNotContains = usernameNotContains;
    return this;
  }

   /**
   * Get usernameNotContains
   * @return usernameNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameNotContains() {
    return usernameNotContains;
  }


  public void setUsernameNotContains(String usernameNotContains) {
    this.usernameNotContains = usernameNotContains;
  }


  public AlertNotifierWhereInput usernameNotEndsWith(String usernameNotEndsWith) {
    
    this.usernameNotEndsWith = usernameNotEndsWith;
    return this;
  }

   /**
   * Get usernameNotEndsWith
   * @return usernameNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameNotEndsWith() {
    return usernameNotEndsWith;
  }


  public void setUsernameNotEndsWith(String usernameNotEndsWith) {
    this.usernameNotEndsWith = usernameNotEndsWith;
  }


  public AlertNotifierWhereInput usernameNotIn(List<String> usernameNotIn) {
    
    this.usernameNotIn = usernameNotIn;
    return this;
  }

  public AlertNotifierWhereInput addUsernameNotInItem(String usernameNotInItem) {
    if (this.usernameNotIn == null) {
      this.usernameNotIn = new ArrayList<String>();
    }
    this.usernameNotIn.add(usernameNotInItem);
    return this;
  }

   /**
   * Get usernameNotIn
   * @return usernameNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUsernameNotIn() {
    return usernameNotIn;
  }


  public void setUsernameNotIn(List<String> usernameNotIn) {
    this.usernameNotIn = usernameNotIn;
  }


  public AlertNotifierWhereInput usernameNotStartsWith(String usernameNotStartsWith) {
    
    this.usernameNotStartsWith = usernameNotStartsWith;
    return this;
  }

   /**
   * Get usernameNotStartsWith
   * @return usernameNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameNotStartsWith() {
    return usernameNotStartsWith;
  }


  public void setUsernameNotStartsWith(String usernameNotStartsWith) {
    this.usernameNotStartsWith = usernameNotStartsWith;
  }


  public AlertNotifierWhereInput usernameStartsWith(String usernameStartsWith) {
    
    this.usernameStartsWith = usernameStartsWith;
    return this;
  }

   /**
   * Get usernameStartsWith
   * @return usernameStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameStartsWith() {
    return usernameStartsWith;
  }


  public void setUsernameStartsWith(String usernameStartsWith) {
    this.usernameStartsWith = usernameStartsWith;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertNotifierWhereInput alertNotifierWhereInput = (AlertNotifierWhereInput) o;
    return Objects.equals(this.AND, alertNotifierWhereInput.AND) &&
        Objects.equals(this.clustersEvery, alertNotifierWhereInput.clustersEvery) &&
        Objects.equals(this.clustersNone, alertNotifierWhereInput.clustersNone) &&
        Objects.equals(this.clustersSome, alertNotifierWhereInput.clustersSome) &&
        Objects.equals(this.disabled, alertNotifierWhereInput.disabled) &&
        Objects.equals(this.disabledNot, alertNotifierWhereInput.disabledNot) &&
        Objects.equals(this.emailFrom, alertNotifierWhereInput.emailFrom) &&
        Objects.equals(this.emailFromContains, alertNotifierWhereInput.emailFromContains) &&
        Objects.equals(this.emailFromEndsWith, alertNotifierWhereInput.emailFromEndsWith) &&
        Objects.equals(this.emailFromGt, alertNotifierWhereInput.emailFromGt) &&
        Objects.equals(this.emailFromGte, alertNotifierWhereInput.emailFromGte) &&
        Objects.equals(this.emailFromIn, alertNotifierWhereInput.emailFromIn) &&
        Objects.equals(this.emailFromLt, alertNotifierWhereInput.emailFromLt) &&
        Objects.equals(this.emailFromLte, alertNotifierWhereInput.emailFromLte) &&
        Objects.equals(this.emailFromNot, alertNotifierWhereInput.emailFromNot) &&
        Objects.equals(this.emailFromNotContains, alertNotifierWhereInput.emailFromNotContains) &&
        Objects.equals(this.emailFromNotEndsWith, alertNotifierWhereInput.emailFromNotEndsWith) &&
        Objects.equals(this.emailFromNotIn, alertNotifierWhereInput.emailFromNotIn) &&
        Objects.equals(this.emailFromNotStartsWith, alertNotifierWhereInput.emailFromNotStartsWith) &&
        Objects.equals(this.emailFromStartsWith, alertNotifierWhereInput.emailFromStartsWith) &&
        Objects.equals(this.entityAsyncStatus, alertNotifierWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, alertNotifierWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, alertNotifierWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, alertNotifierWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.id, alertNotifierWhereInput.id) &&
        Objects.equals(this.idContains, alertNotifierWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, alertNotifierWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, alertNotifierWhereInput.idGt) &&
        Objects.equals(this.idGte, alertNotifierWhereInput.idGte) &&
        Objects.equals(this.idIn, alertNotifierWhereInput.idIn) &&
        Objects.equals(this.idLt, alertNotifierWhereInput.idLt) &&
        Objects.equals(this.idLte, alertNotifierWhereInput.idLte) &&
        Objects.equals(this.idNot, alertNotifierWhereInput.idNot) &&
        Objects.equals(this.idNotContains, alertNotifierWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, alertNotifierWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, alertNotifierWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, alertNotifierWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, alertNotifierWhereInput.idStartsWith) &&
        Objects.equals(this.languageCode, alertNotifierWhereInput.languageCode) &&
        Objects.equals(this.languageCodeIn, alertNotifierWhereInput.languageCodeIn) &&
        Objects.equals(this.languageCodeNot, alertNotifierWhereInput.languageCodeNot) &&
        Objects.equals(this.languageCodeNotIn, alertNotifierWhereInput.languageCodeNotIn) &&
        Objects.equals(this.name, alertNotifierWhereInput.name) &&
        Objects.equals(this.nameContains, alertNotifierWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, alertNotifierWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, alertNotifierWhereInput.nameGt) &&
        Objects.equals(this.nameGte, alertNotifierWhereInput.nameGte) &&
        Objects.equals(this.nameIn, alertNotifierWhereInput.nameIn) &&
        Objects.equals(this.nameLt, alertNotifierWhereInput.nameLt) &&
        Objects.equals(this.nameLte, alertNotifierWhereInput.nameLte) &&
        Objects.equals(this.nameNot, alertNotifierWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, alertNotifierWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, alertNotifierWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, alertNotifierWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, alertNotifierWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, alertNotifierWhereInput.nameStartsWith) &&
        Objects.equals(this.NOT, alertNotifierWhereInput.NOT) &&
        Objects.equals(this.OR, alertNotifierWhereInput.OR) &&
        Objects.equals(this.securityMode, alertNotifierWhereInput.securityMode) &&
        Objects.equals(this.securityModeIn, alertNotifierWhereInput.securityModeIn) &&
        Objects.equals(this.securityModeNot, alertNotifierWhereInput.securityModeNot) &&
        Objects.equals(this.securityModeNotIn, alertNotifierWhereInput.securityModeNotIn) &&
        Objects.equals(this.smtpServerHost, alertNotifierWhereInput.smtpServerHost) &&
        Objects.equals(this.smtpServerHostContains, alertNotifierWhereInput.smtpServerHostContains) &&
        Objects.equals(this.smtpServerHostEndsWith, alertNotifierWhereInput.smtpServerHostEndsWith) &&
        Objects.equals(this.smtpServerHostGt, alertNotifierWhereInput.smtpServerHostGt) &&
        Objects.equals(this.smtpServerHostGte, alertNotifierWhereInput.smtpServerHostGte) &&
        Objects.equals(this.smtpServerHostIn, alertNotifierWhereInput.smtpServerHostIn) &&
        Objects.equals(this.smtpServerHostLt, alertNotifierWhereInput.smtpServerHostLt) &&
        Objects.equals(this.smtpServerHostLte, alertNotifierWhereInput.smtpServerHostLte) &&
        Objects.equals(this.smtpServerHostNot, alertNotifierWhereInput.smtpServerHostNot) &&
        Objects.equals(this.smtpServerHostNotContains, alertNotifierWhereInput.smtpServerHostNotContains) &&
        Objects.equals(this.smtpServerHostNotEndsWith, alertNotifierWhereInput.smtpServerHostNotEndsWith) &&
        Objects.equals(this.smtpServerHostNotIn, alertNotifierWhereInput.smtpServerHostNotIn) &&
        Objects.equals(this.smtpServerHostNotStartsWith, alertNotifierWhereInput.smtpServerHostNotStartsWith) &&
        Objects.equals(this.smtpServerHostStartsWith, alertNotifierWhereInput.smtpServerHostStartsWith) &&
        Objects.equals(this.smtpServerPort, alertNotifierWhereInput.smtpServerPort) &&
        Objects.equals(this.smtpServerPortGt, alertNotifierWhereInput.smtpServerPortGt) &&
        Objects.equals(this.smtpServerPortGte, alertNotifierWhereInput.smtpServerPortGte) &&
        Objects.equals(this.smtpServerPortIn, alertNotifierWhereInput.smtpServerPortIn) &&
        Objects.equals(this.smtpServerPortLt, alertNotifierWhereInput.smtpServerPortLt) &&
        Objects.equals(this.smtpServerPortLte, alertNotifierWhereInput.smtpServerPortLte) &&
        Objects.equals(this.smtpServerPortNot, alertNotifierWhereInput.smtpServerPortNot) &&
        Objects.equals(this.smtpServerPortNotIn, alertNotifierWhereInput.smtpServerPortNotIn) &&
        Objects.equals(this.username, alertNotifierWhereInput.username) &&
        Objects.equals(this.usernameContains, alertNotifierWhereInput.usernameContains) &&
        Objects.equals(this.usernameEndsWith, alertNotifierWhereInput.usernameEndsWith) &&
        Objects.equals(this.usernameGt, alertNotifierWhereInput.usernameGt) &&
        Objects.equals(this.usernameGte, alertNotifierWhereInput.usernameGte) &&
        Objects.equals(this.usernameIn, alertNotifierWhereInput.usernameIn) &&
        Objects.equals(this.usernameLt, alertNotifierWhereInput.usernameLt) &&
        Objects.equals(this.usernameLte, alertNotifierWhereInput.usernameLte) &&
        Objects.equals(this.usernameNot, alertNotifierWhereInput.usernameNot) &&
        Objects.equals(this.usernameNotContains, alertNotifierWhereInput.usernameNotContains) &&
        Objects.equals(this.usernameNotEndsWith, alertNotifierWhereInput.usernameNotEndsWith) &&
        Objects.equals(this.usernameNotIn, alertNotifierWhereInput.usernameNotIn) &&
        Objects.equals(this.usernameNotStartsWith, alertNotifierWhereInput.usernameNotStartsWith) &&
        Objects.equals(this.usernameStartsWith, alertNotifierWhereInput.usernameStartsWith);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, clustersEvery, clustersNone, clustersSome, disabled, disabledNot, emailFrom, emailFromContains, emailFromEndsWith, emailFromGt, emailFromGte, emailFromIn, emailFromLt, emailFromLte, emailFromNot, emailFromNotContains, emailFromNotEndsWith, emailFromNotIn, emailFromNotStartsWith, emailFromStartsWith, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, languageCode, languageCodeIn, languageCodeNot, languageCodeNotIn, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, NOT, OR, securityMode, securityModeIn, securityModeNot, securityModeNotIn, smtpServerHost, smtpServerHostContains, smtpServerHostEndsWith, smtpServerHostGt, smtpServerHostGte, smtpServerHostIn, smtpServerHostLt, smtpServerHostLte, smtpServerHostNot, smtpServerHostNotContains, smtpServerHostNotEndsWith, smtpServerHostNotIn, smtpServerHostNotStartsWith, smtpServerHostStartsWith, smtpServerPort, smtpServerPortGt, smtpServerPortGte, smtpServerPortIn, smtpServerPortLt, smtpServerPortLte, smtpServerPortNot, smtpServerPortNotIn, username, usernameContains, usernameEndsWith, usernameGt, usernameGte, usernameIn, usernameLt, usernameLte, usernameNot, usernameNotContains, usernameNotEndsWith, usernameNotIn, usernameNotStartsWith, usernameStartsWith);
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
    sb.append("class AlertNotifierWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    clustersEvery: ").append(toIndentedString(clustersEvery)).append("\n");
    sb.append("    clustersNone: ").append(toIndentedString(clustersNone)).append("\n");
    sb.append("    clustersSome: ").append(toIndentedString(clustersSome)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    disabledNot: ").append(toIndentedString(disabledNot)).append("\n");
    sb.append("    emailFrom: ").append(toIndentedString(emailFrom)).append("\n");
    sb.append("    emailFromContains: ").append(toIndentedString(emailFromContains)).append("\n");
    sb.append("    emailFromEndsWith: ").append(toIndentedString(emailFromEndsWith)).append("\n");
    sb.append("    emailFromGt: ").append(toIndentedString(emailFromGt)).append("\n");
    sb.append("    emailFromGte: ").append(toIndentedString(emailFromGte)).append("\n");
    sb.append("    emailFromIn: ").append(toIndentedString(emailFromIn)).append("\n");
    sb.append("    emailFromLt: ").append(toIndentedString(emailFromLt)).append("\n");
    sb.append("    emailFromLte: ").append(toIndentedString(emailFromLte)).append("\n");
    sb.append("    emailFromNot: ").append(toIndentedString(emailFromNot)).append("\n");
    sb.append("    emailFromNotContains: ").append(toIndentedString(emailFromNotContains)).append("\n");
    sb.append("    emailFromNotEndsWith: ").append(toIndentedString(emailFromNotEndsWith)).append("\n");
    sb.append("    emailFromNotIn: ").append(toIndentedString(emailFromNotIn)).append("\n");
    sb.append("    emailFromNotStartsWith: ").append(toIndentedString(emailFromNotStartsWith)).append("\n");
    sb.append("    emailFromStartsWith: ").append(toIndentedString(emailFromStartsWith)).append("\n");
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
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    languageCodeIn: ").append(toIndentedString(languageCodeIn)).append("\n");
    sb.append("    languageCodeNot: ").append(toIndentedString(languageCodeNot)).append("\n");
    sb.append("    languageCodeNotIn: ").append(toIndentedString(languageCodeNotIn)).append("\n");
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
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    securityMode: ").append(toIndentedString(securityMode)).append("\n");
    sb.append("    securityModeIn: ").append(toIndentedString(securityModeIn)).append("\n");
    sb.append("    securityModeNot: ").append(toIndentedString(securityModeNot)).append("\n");
    sb.append("    securityModeNotIn: ").append(toIndentedString(securityModeNotIn)).append("\n");
    sb.append("    smtpServerHost: ").append(toIndentedString(smtpServerHost)).append("\n");
    sb.append("    smtpServerHostContains: ").append(toIndentedString(smtpServerHostContains)).append("\n");
    sb.append("    smtpServerHostEndsWith: ").append(toIndentedString(smtpServerHostEndsWith)).append("\n");
    sb.append("    smtpServerHostGt: ").append(toIndentedString(smtpServerHostGt)).append("\n");
    sb.append("    smtpServerHostGte: ").append(toIndentedString(smtpServerHostGte)).append("\n");
    sb.append("    smtpServerHostIn: ").append(toIndentedString(smtpServerHostIn)).append("\n");
    sb.append("    smtpServerHostLt: ").append(toIndentedString(smtpServerHostLt)).append("\n");
    sb.append("    smtpServerHostLte: ").append(toIndentedString(smtpServerHostLte)).append("\n");
    sb.append("    smtpServerHostNot: ").append(toIndentedString(smtpServerHostNot)).append("\n");
    sb.append("    smtpServerHostNotContains: ").append(toIndentedString(smtpServerHostNotContains)).append("\n");
    sb.append("    smtpServerHostNotEndsWith: ").append(toIndentedString(smtpServerHostNotEndsWith)).append("\n");
    sb.append("    smtpServerHostNotIn: ").append(toIndentedString(smtpServerHostNotIn)).append("\n");
    sb.append("    smtpServerHostNotStartsWith: ").append(toIndentedString(smtpServerHostNotStartsWith)).append("\n");
    sb.append("    smtpServerHostStartsWith: ").append(toIndentedString(smtpServerHostStartsWith)).append("\n");
    sb.append("    smtpServerPort: ").append(toIndentedString(smtpServerPort)).append("\n");
    sb.append("    smtpServerPortGt: ").append(toIndentedString(smtpServerPortGt)).append("\n");
    sb.append("    smtpServerPortGte: ").append(toIndentedString(smtpServerPortGte)).append("\n");
    sb.append("    smtpServerPortIn: ").append(toIndentedString(smtpServerPortIn)).append("\n");
    sb.append("    smtpServerPortLt: ").append(toIndentedString(smtpServerPortLt)).append("\n");
    sb.append("    smtpServerPortLte: ").append(toIndentedString(smtpServerPortLte)).append("\n");
    sb.append("    smtpServerPortNot: ").append(toIndentedString(smtpServerPortNot)).append("\n");
    sb.append("    smtpServerPortNotIn: ").append(toIndentedString(smtpServerPortNotIn)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    usernameContains: ").append(toIndentedString(usernameContains)).append("\n");
    sb.append("    usernameEndsWith: ").append(toIndentedString(usernameEndsWith)).append("\n");
    sb.append("    usernameGt: ").append(toIndentedString(usernameGt)).append("\n");
    sb.append("    usernameGte: ").append(toIndentedString(usernameGte)).append("\n");
    sb.append("    usernameIn: ").append(toIndentedString(usernameIn)).append("\n");
    sb.append("    usernameLt: ").append(toIndentedString(usernameLt)).append("\n");
    sb.append("    usernameLte: ").append(toIndentedString(usernameLte)).append("\n");
    sb.append("    usernameNot: ").append(toIndentedString(usernameNot)).append("\n");
    sb.append("    usernameNotContains: ").append(toIndentedString(usernameNotContains)).append("\n");
    sb.append("    usernameNotEndsWith: ").append(toIndentedString(usernameNotEndsWith)).append("\n");
    sb.append("    usernameNotIn: ").append(toIndentedString(usernameNotIn)).append("\n");
    sb.append("    usernameNotStartsWith: ").append(toIndentedString(usernameNotStartsWith)).append("\n");
    sb.append("    usernameStartsWith: ").append(toIndentedString(usernameStartsWith)).append("\n");
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

