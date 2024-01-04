package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.SmtpSecureMode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SmtpServerWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class SmtpServerWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<SmtpServerWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<SmtpServerWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<SmtpServerWhereInput> OR = null;

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

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_HOST_CONTAINS = "host_contains";
  @SerializedName(SERIALIZED_NAME_HOST_CONTAINS)
  private String hostContains;

  public static final String SERIALIZED_NAME_HOST_ENDS_WITH = "host_ends_with";
  @SerializedName(SERIALIZED_NAME_HOST_ENDS_WITH)
  private String hostEndsWith;

  public static final String SERIALIZED_NAME_HOST_GT = "host_gt";
  @SerializedName(SERIALIZED_NAME_HOST_GT)
  private String hostGt;

  public static final String SERIALIZED_NAME_HOST_GTE = "host_gte";
  @SerializedName(SERIALIZED_NAME_HOST_GTE)
  private String hostGte;

  public static final String SERIALIZED_NAME_HOST_IN = "host_in";
  @SerializedName(SERIALIZED_NAME_HOST_IN)
  private List<String> hostIn = null;

  public static final String SERIALIZED_NAME_HOST_LT = "host_lt";
  @SerializedName(SERIALIZED_NAME_HOST_LT)
  private String hostLt;

  public static final String SERIALIZED_NAME_HOST_LTE = "host_lte";
  @SerializedName(SERIALIZED_NAME_HOST_LTE)
  private String hostLte;

  public static final String SERIALIZED_NAME_HOST_NOT = "host_not";
  @SerializedName(SERIALIZED_NAME_HOST_NOT)
  private String hostNot;

  public static final String SERIALIZED_NAME_HOST_NOT_CONTAINS = "host_not_contains";
  @SerializedName(SERIALIZED_NAME_HOST_NOT_CONTAINS)
  private String hostNotContains;

  public static final String SERIALIZED_NAME_HOST_NOT_ENDS_WITH = "host_not_ends_with";
  @SerializedName(SERIALIZED_NAME_HOST_NOT_ENDS_WITH)
  private String hostNotEndsWith;

  public static final String SERIALIZED_NAME_HOST_NOT_IN = "host_not_in";
  @SerializedName(SERIALIZED_NAME_HOST_NOT_IN)
  private List<String> hostNotIn = null;

  public static final String SERIALIZED_NAME_HOST_NOT_STARTS_WITH = "host_not_starts_with";
  @SerializedName(SERIALIZED_NAME_HOST_NOT_STARTS_WITH)
  private String hostNotStartsWith;

  public static final String SERIALIZED_NAME_HOST_STARTS_WITH = "host_starts_with";
  @SerializedName(SERIALIZED_NAME_HOST_STARTS_WITH)
  private String hostStartsWith;

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

  public static final String SERIALIZED_NAME_IS_RECORD_PASSWORD = "is_record_password";
  @SerializedName(SERIALIZED_NAME_IS_RECORD_PASSWORD)
  private Boolean isRecordPassword;

  public static final String SERIALIZED_NAME_IS_RECORD_PASSWORD_NOT = "is_record_password_not";
  @SerializedName(SERIALIZED_NAME_IS_RECORD_PASSWORD_NOT)
  private Boolean isRecordPasswordNot;

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

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PASSWORD_CONTAINS = "password_contains";
  @SerializedName(SERIALIZED_NAME_PASSWORD_CONTAINS)
  private String passwordContains;

  public static final String SERIALIZED_NAME_PASSWORD_ENDS_WITH = "password_ends_with";
  @SerializedName(SERIALIZED_NAME_PASSWORD_ENDS_WITH)
  private String passwordEndsWith;

  public static final String SERIALIZED_NAME_PASSWORD_GT = "password_gt";
  @SerializedName(SERIALIZED_NAME_PASSWORD_GT)
  private String passwordGt;

  public static final String SERIALIZED_NAME_PASSWORD_GTE = "password_gte";
  @SerializedName(SERIALIZED_NAME_PASSWORD_GTE)
  private String passwordGte;

  public static final String SERIALIZED_NAME_PASSWORD_IN = "password_in";
  @SerializedName(SERIALIZED_NAME_PASSWORD_IN)
  private List<String> passwordIn = null;

  public static final String SERIALIZED_NAME_PASSWORD_LT = "password_lt";
  @SerializedName(SERIALIZED_NAME_PASSWORD_LT)
  private String passwordLt;

  public static final String SERIALIZED_NAME_PASSWORD_LTE = "password_lte";
  @SerializedName(SERIALIZED_NAME_PASSWORD_LTE)
  private String passwordLte;

  public static final String SERIALIZED_NAME_PASSWORD_NOT = "password_not";
  @SerializedName(SERIALIZED_NAME_PASSWORD_NOT)
  private String passwordNot;

  public static final String SERIALIZED_NAME_PASSWORD_NOT_CONTAINS = "password_not_contains";
  @SerializedName(SERIALIZED_NAME_PASSWORD_NOT_CONTAINS)
  private String passwordNotContains;

  public static final String SERIALIZED_NAME_PASSWORD_NOT_ENDS_WITH = "password_not_ends_with";
  @SerializedName(SERIALIZED_NAME_PASSWORD_NOT_ENDS_WITH)
  private String passwordNotEndsWith;

  public static final String SERIALIZED_NAME_PASSWORD_NOT_IN = "password_not_in";
  @SerializedName(SERIALIZED_NAME_PASSWORD_NOT_IN)
  private List<String> passwordNotIn = null;

  public static final String SERIALIZED_NAME_PASSWORD_NOT_STARTS_WITH = "password_not_starts_with";
  @SerializedName(SERIALIZED_NAME_PASSWORD_NOT_STARTS_WITH)
  private String passwordNotStartsWith;

  public static final String SERIALIZED_NAME_PASSWORD_STARTS_WITH = "password_starts_with";
  @SerializedName(SERIALIZED_NAME_PASSWORD_STARTS_WITH)
  private String passwordStartsWith;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_PORT_GT = "port_gt";
  @SerializedName(SERIALIZED_NAME_PORT_GT)
  private Integer portGt;

  public static final String SERIALIZED_NAME_PORT_GTE = "port_gte";
  @SerializedName(SERIALIZED_NAME_PORT_GTE)
  private Integer portGte;

  public static final String SERIALIZED_NAME_PORT_IN = "port_in";
  @SerializedName(SERIALIZED_NAME_PORT_IN)
  private List<Integer> portIn = null;

  public static final String SERIALIZED_NAME_PORT_LT = "port_lt";
  @SerializedName(SERIALIZED_NAME_PORT_LT)
  private Integer portLt;

  public static final String SERIALIZED_NAME_PORT_LTE = "port_lte";
  @SerializedName(SERIALIZED_NAME_PORT_LTE)
  private Integer portLte;

  public static final String SERIALIZED_NAME_PORT_NOT = "port_not";
  @SerializedName(SERIALIZED_NAME_PORT_NOT)
  private Integer portNot;

  public static final String SERIALIZED_NAME_PORT_NOT_IN = "port_not_in";
  @SerializedName(SERIALIZED_NAME_PORT_NOT_IN)
  private List<Integer> portNotIn = null;

  public static final String SERIALIZED_NAME_SECURE_MODE = "secure_mode";
  @SerializedName(SERIALIZED_NAME_SECURE_MODE)
  private SmtpSecureMode secureMode;

  public static final String SERIALIZED_NAME_SECURE_MODE_IN = "secure_mode_in";
  @SerializedName(SERIALIZED_NAME_SECURE_MODE_IN)
  private List<SmtpSecureMode> secureModeIn = null;

  public static final String SERIALIZED_NAME_SECURE_MODE_NOT = "secure_mode_not";
  @SerializedName(SERIALIZED_NAME_SECURE_MODE_NOT)
  private SmtpSecureMode secureModeNot;

  public static final String SERIALIZED_NAME_SECURE_MODE_NOT_IN = "secure_mode_not_in";
  @SerializedName(SERIALIZED_NAME_SECURE_MODE_NOT_IN)
  private List<SmtpSecureMode> secureModeNotIn = null;

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

  public SmtpServerWhereInput() { 
  }

  public SmtpServerWhereInput AND(List<SmtpServerWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public SmtpServerWhereInput addANDItem(SmtpServerWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<SmtpServerWhereInput>();
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

  public List<SmtpServerWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<SmtpServerWhereInput> AND) {
    this.AND = AND;
  }


  public SmtpServerWhereInput NOT(List<SmtpServerWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public SmtpServerWhereInput addNOTItem(SmtpServerWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<SmtpServerWhereInput>();
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

  public List<SmtpServerWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<SmtpServerWhereInput> NOT) {
    this.NOT = NOT;
  }


  public SmtpServerWhereInput OR(List<SmtpServerWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public SmtpServerWhereInput addORItem(SmtpServerWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<SmtpServerWhereInput>();
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

  public List<SmtpServerWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<SmtpServerWhereInput> OR) {
    this.OR = OR;
  }


  public SmtpServerWhereInput description(String description) {
    
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


  public SmtpServerWhereInput descriptionContains(String descriptionContains) {
    
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


  public SmtpServerWhereInput descriptionEndsWith(String descriptionEndsWith) {
    
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


  public SmtpServerWhereInput descriptionGt(String descriptionGt) {
    
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


  public SmtpServerWhereInput descriptionGte(String descriptionGte) {
    
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


  public SmtpServerWhereInput descriptionIn(List<String> descriptionIn) {
    
    this.descriptionIn = descriptionIn;
    return this;
  }

  public SmtpServerWhereInput addDescriptionInItem(String descriptionInItem) {
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


  public SmtpServerWhereInput descriptionLt(String descriptionLt) {
    
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


  public SmtpServerWhereInput descriptionLte(String descriptionLte) {
    
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


  public SmtpServerWhereInput descriptionNot(String descriptionNot) {
    
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


  public SmtpServerWhereInput descriptionNotContains(String descriptionNotContains) {
    
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


  public SmtpServerWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {
    
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


  public SmtpServerWhereInput descriptionNotIn(List<String> descriptionNotIn) {
    
    this.descriptionNotIn = descriptionNotIn;
    return this;
  }

  public SmtpServerWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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


  public SmtpServerWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {
    
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


  public SmtpServerWhereInput descriptionStartsWith(String descriptionStartsWith) {
    
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


  public SmtpServerWhereInput host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public SmtpServerWhereInput hostContains(String hostContains) {
    
    this.hostContains = hostContains;
    return this;
  }

   /**
   * Get hostContains
   * @return hostContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostContains() {
    return hostContains;
  }


  public void setHostContains(String hostContains) {
    this.hostContains = hostContains;
  }


  public SmtpServerWhereInput hostEndsWith(String hostEndsWith) {
    
    this.hostEndsWith = hostEndsWith;
    return this;
  }

   /**
   * Get hostEndsWith
   * @return hostEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostEndsWith() {
    return hostEndsWith;
  }


  public void setHostEndsWith(String hostEndsWith) {
    this.hostEndsWith = hostEndsWith;
  }


  public SmtpServerWhereInput hostGt(String hostGt) {
    
    this.hostGt = hostGt;
    return this;
  }

   /**
   * Get hostGt
   * @return hostGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostGt() {
    return hostGt;
  }


  public void setHostGt(String hostGt) {
    this.hostGt = hostGt;
  }


  public SmtpServerWhereInput hostGte(String hostGte) {
    
    this.hostGte = hostGte;
    return this;
  }

   /**
   * Get hostGte
   * @return hostGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostGte() {
    return hostGte;
  }


  public void setHostGte(String hostGte) {
    this.hostGte = hostGte;
  }


  public SmtpServerWhereInput hostIn(List<String> hostIn) {
    
    this.hostIn = hostIn;
    return this;
  }

  public SmtpServerWhereInput addHostInItem(String hostInItem) {
    if (this.hostIn == null) {
      this.hostIn = new ArrayList<String>();
    }
    this.hostIn.add(hostInItem);
    return this;
  }

   /**
   * Get hostIn
   * @return hostIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getHostIn() {
    return hostIn;
  }


  public void setHostIn(List<String> hostIn) {
    this.hostIn = hostIn;
  }


  public SmtpServerWhereInput hostLt(String hostLt) {
    
    this.hostLt = hostLt;
    return this;
  }

   /**
   * Get hostLt
   * @return hostLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostLt() {
    return hostLt;
  }


  public void setHostLt(String hostLt) {
    this.hostLt = hostLt;
  }


  public SmtpServerWhereInput hostLte(String hostLte) {
    
    this.hostLte = hostLte;
    return this;
  }

   /**
   * Get hostLte
   * @return hostLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostLte() {
    return hostLte;
  }


  public void setHostLte(String hostLte) {
    this.hostLte = hostLte;
  }


  public SmtpServerWhereInput hostNot(String hostNot) {
    
    this.hostNot = hostNot;
    return this;
  }

   /**
   * Get hostNot
   * @return hostNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostNot() {
    return hostNot;
  }


  public void setHostNot(String hostNot) {
    this.hostNot = hostNot;
  }


  public SmtpServerWhereInput hostNotContains(String hostNotContains) {
    
    this.hostNotContains = hostNotContains;
    return this;
  }

   /**
   * Get hostNotContains
   * @return hostNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostNotContains() {
    return hostNotContains;
  }


  public void setHostNotContains(String hostNotContains) {
    this.hostNotContains = hostNotContains;
  }


  public SmtpServerWhereInput hostNotEndsWith(String hostNotEndsWith) {
    
    this.hostNotEndsWith = hostNotEndsWith;
    return this;
  }

   /**
   * Get hostNotEndsWith
   * @return hostNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostNotEndsWith() {
    return hostNotEndsWith;
  }


  public void setHostNotEndsWith(String hostNotEndsWith) {
    this.hostNotEndsWith = hostNotEndsWith;
  }


  public SmtpServerWhereInput hostNotIn(List<String> hostNotIn) {
    
    this.hostNotIn = hostNotIn;
    return this;
  }

  public SmtpServerWhereInput addHostNotInItem(String hostNotInItem) {
    if (this.hostNotIn == null) {
      this.hostNotIn = new ArrayList<String>();
    }
    this.hostNotIn.add(hostNotInItem);
    return this;
  }

   /**
   * Get hostNotIn
   * @return hostNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getHostNotIn() {
    return hostNotIn;
  }


  public void setHostNotIn(List<String> hostNotIn) {
    this.hostNotIn = hostNotIn;
  }


  public SmtpServerWhereInput hostNotStartsWith(String hostNotStartsWith) {
    
    this.hostNotStartsWith = hostNotStartsWith;
    return this;
  }

   /**
   * Get hostNotStartsWith
   * @return hostNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostNotStartsWith() {
    return hostNotStartsWith;
  }


  public void setHostNotStartsWith(String hostNotStartsWith) {
    this.hostNotStartsWith = hostNotStartsWith;
  }


  public SmtpServerWhereInput hostStartsWith(String hostStartsWith) {
    
    this.hostStartsWith = hostStartsWith;
    return this;
  }

   /**
   * Get hostStartsWith
   * @return hostStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostStartsWith() {
    return hostStartsWith;
  }


  public void setHostStartsWith(String hostStartsWith) {
    this.hostStartsWith = hostStartsWith;
  }


  public SmtpServerWhereInput id(String id) {
    
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


  public SmtpServerWhereInput idContains(String idContains) {
    
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


  public SmtpServerWhereInput idEndsWith(String idEndsWith) {
    
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


  public SmtpServerWhereInput idGt(String idGt) {
    
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


  public SmtpServerWhereInput idGte(String idGte) {
    
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


  public SmtpServerWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public SmtpServerWhereInput addIdInItem(String idInItem) {
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


  public SmtpServerWhereInput idLt(String idLt) {
    
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


  public SmtpServerWhereInput idLte(String idLte) {
    
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


  public SmtpServerWhereInput idNot(String idNot) {
    
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


  public SmtpServerWhereInput idNotContains(String idNotContains) {
    
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


  public SmtpServerWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public SmtpServerWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public SmtpServerWhereInput addIdNotInItem(String idNotInItem) {
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


  public SmtpServerWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public SmtpServerWhereInput idStartsWith(String idStartsWith) {
    
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


  public SmtpServerWhereInput isRecordPassword(Boolean isRecordPassword) {
    
    this.isRecordPassword = isRecordPassword;
    return this;
  }

   /**
   * Get isRecordPassword
   * @return isRecordPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsRecordPassword() {
    return isRecordPassword;
  }


  public void setIsRecordPassword(Boolean isRecordPassword) {
    this.isRecordPassword = isRecordPassword;
  }


  public SmtpServerWhereInput isRecordPasswordNot(Boolean isRecordPasswordNot) {
    
    this.isRecordPasswordNot = isRecordPasswordNot;
    return this;
  }

   /**
   * Get isRecordPasswordNot
   * @return isRecordPasswordNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsRecordPasswordNot() {
    return isRecordPasswordNot;
  }


  public void setIsRecordPasswordNot(Boolean isRecordPasswordNot) {
    this.isRecordPasswordNot = isRecordPasswordNot;
  }


  public SmtpServerWhereInput name(String name) {
    
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


  public SmtpServerWhereInput nameContains(String nameContains) {
    
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


  public SmtpServerWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public SmtpServerWhereInput nameGt(String nameGt) {
    
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


  public SmtpServerWhereInput nameGte(String nameGte) {
    
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


  public SmtpServerWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public SmtpServerWhereInput addNameInItem(String nameInItem) {
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


  public SmtpServerWhereInput nameLt(String nameLt) {
    
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


  public SmtpServerWhereInput nameLte(String nameLte) {
    
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


  public SmtpServerWhereInput nameNot(String nameNot) {
    
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


  public SmtpServerWhereInput nameNotContains(String nameNotContains) {
    
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


  public SmtpServerWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public SmtpServerWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public SmtpServerWhereInput addNameNotInItem(String nameNotInItem) {
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


  public SmtpServerWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public SmtpServerWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public SmtpServerWhereInput password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public SmtpServerWhereInput passwordContains(String passwordContains) {
    
    this.passwordContains = passwordContains;
    return this;
  }

   /**
   * Get passwordContains
   * @return passwordContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPasswordContains() {
    return passwordContains;
  }


  public void setPasswordContains(String passwordContains) {
    this.passwordContains = passwordContains;
  }


  public SmtpServerWhereInput passwordEndsWith(String passwordEndsWith) {
    
    this.passwordEndsWith = passwordEndsWith;
    return this;
  }

   /**
   * Get passwordEndsWith
   * @return passwordEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPasswordEndsWith() {
    return passwordEndsWith;
  }


  public void setPasswordEndsWith(String passwordEndsWith) {
    this.passwordEndsWith = passwordEndsWith;
  }


  public SmtpServerWhereInput passwordGt(String passwordGt) {
    
    this.passwordGt = passwordGt;
    return this;
  }

   /**
   * Get passwordGt
   * @return passwordGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPasswordGt() {
    return passwordGt;
  }


  public void setPasswordGt(String passwordGt) {
    this.passwordGt = passwordGt;
  }


  public SmtpServerWhereInput passwordGte(String passwordGte) {
    
    this.passwordGte = passwordGte;
    return this;
  }

   /**
   * Get passwordGte
   * @return passwordGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPasswordGte() {
    return passwordGte;
  }


  public void setPasswordGte(String passwordGte) {
    this.passwordGte = passwordGte;
  }


  public SmtpServerWhereInput passwordIn(List<String> passwordIn) {
    
    this.passwordIn = passwordIn;
    return this;
  }

  public SmtpServerWhereInput addPasswordInItem(String passwordInItem) {
    if (this.passwordIn == null) {
      this.passwordIn = new ArrayList<String>();
    }
    this.passwordIn.add(passwordInItem);
    return this;
  }

   /**
   * Get passwordIn
   * @return passwordIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPasswordIn() {
    return passwordIn;
  }


  public void setPasswordIn(List<String> passwordIn) {
    this.passwordIn = passwordIn;
  }


  public SmtpServerWhereInput passwordLt(String passwordLt) {
    
    this.passwordLt = passwordLt;
    return this;
  }

   /**
   * Get passwordLt
   * @return passwordLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPasswordLt() {
    return passwordLt;
  }


  public void setPasswordLt(String passwordLt) {
    this.passwordLt = passwordLt;
  }


  public SmtpServerWhereInput passwordLte(String passwordLte) {
    
    this.passwordLte = passwordLte;
    return this;
  }

   /**
   * Get passwordLte
   * @return passwordLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPasswordLte() {
    return passwordLte;
  }


  public void setPasswordLte(String passwordLte) {
    this.passwordLte = passwordLte;
  }


  public SmtpServerWhereInput passwordNot(String passwordNot) {
    
    this.passwordNot = passwordNot;
    return this;
  }

   /**
   * Get passwordNot
   * @return passwordNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPasswordNot() {
    return passwordNot;
  }


  public void setPasswordNot(String passwordNot) {
    this.passwordNot = passwordNot;
  }


  public SmtpServerWhereInput passwordNotContains(String passwordNotContains) {
    
    this.passwordNotContains = passwordNotContains;
    return this;
  }

   /**
   * Get passwordNotContains
   * @return passwordNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPasswordNotContains() {
    return passwordNotContains;
  }


  public void setPasswordNotContains(String passwordNotContains) {
    this.passwordNotContains = passwordNotContains;
  }


  public SmtpServerWhereInput passwordNotEndsWith(String passwordNotEndsWith) {
    
    this.passwordNotEndsWith = passwordNotEndsWith;
    return this;
  }

   /**
   * Get passwordNotEndsWith
   * @return passwordNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPasswordNotEndsWith() {
    return passwordNotEndsWith;
  }


  public void setPasswordNotEndsWith(String passwordNotEndsWith) {
    this.passwordNotEndsWith = passwordNotEndsWith;
  }


  public SmtpServerWhereInput passwordNotIn(List<String> passwordNotIn) {
    
    this.passwordNotIn = passwordNotIn;
    return this;
  }

  public SmtpServerWhereInput addPasswordNotInItem(String passwordNotInItem) {
    if (this.passwordNotIn == null) {
      this.passwordNotIn = new ArrayList<String>();
    }
    this.passwordNotIn.add(passwordNotInItem);
    return this;
  }

   /**
   * Get passwordNotIn
   * @return passwordNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPasswordNotIn() {
    return passwordNotIn;
  }


  public void setPasswordNotIn(List<String> passwordNotIn) {
    this.passwordNotIn = passwordNotIn;
  }


  public SmtpServerWhereInput passwordNotStartsWith(String passwordNotStartsWith) {
    
    this.passwordNotStartsWith = passwordNotStartsWith;
    return this;
  }

   /**
   * Get passwordNotStartsWith
   * @return passwordNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPasswordNotStartsWith() {
    return passwordNotStartsWith;
  }


  public void setPasswordNotStartsWith(String passwordNotStartsWith) {
    this.passwordNotStartsWith = passwordNotStartsWith;
  }


  public SmtpServerWhereInput passwordStartsWith(String passwordStartsWith) {
    
    this.passwordStartsWith = passwordStartsWith;
    return this;
  }

   /**
   * Get passwordStartsWith
   * @return passwordStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPasswordStartsWith() {
    return passwordStartsWith;
  }


  public void setPasswordStartsWith(String passwordStartsWith) {
    this.passwordStartsWith = passwordStartsWith;
  }


  public SmtpServerWhereInput port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public SmtpServerWhereInput portGt(Integer portGt) {
    
    this.portGt = portGt;
    return this;
  }

   /**
   * Get portGt
   * @return portGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPortGt() {
    return portGt;
  }


  public void setPortGt(Integer portGt) {
    this.portGt = portGt;
  }


  public SmtpServerWhereInput portGte(Integer portGte) {
    
    this.portGte = portGte;
    return this;
  }

   /**
   * Get portGte
   * @return portGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPortGte() {
    return portGte;
  }


  public void setPortGte(Integer portGte) {
    this.portGte = portGte;
  }


  public SmtpServerWhereInput portIn(List<Integer> portIn) {
    
    this.portIn = portIn;
    return this;
  }

  public SmtpServerWhereInput addPortInItem(Integer portInItem) {
    if (this.portIn == null) {
      this.portIn = new ArrayList<Integer>();
    }
    this.portIn.add(portInItem);
    return this;
  }

   /**
   * Get portIn
   * @return portIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getPortIn() {
    return portIn;
  }


  public void setPortIn(List<Integer> portIn) {
    this.portIn = portIn;
  }


  public SmtpServerWhereInput portLt(Integer portLt) {
    
    this.portLt = portLt;
    return this;
  }

   /**
   * Get portLt
   * @return portLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPortLt() {
    return portLt;
  }


  public void setPortLt(Integer portLt) {
    this.portLt = portLt;
  }


  public SmtpServerWhereInput portLte(Integer portLte) {
    
    this.portLte = portLte;
    return this;
  }

   /**
   * Get portLte
   * @return portLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPortLte() {
    return portLte;
  }


  public void setPortLte(Integer portLte) {
    this.portLte = portLte;
  }


  public SmtpServerWhereInput portNot(Integer portNot) {
    
    this.portNot = portNot;
    return this;
  }

   /**
   * Get portNot
   * @return portNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPortNot() {
    return portNot;
  }


  public void setPortNot(Integer portNot) {
    this.portNot = portNot;
  }


  public SmtpServerWhereInput portNotIn(List<Integer> portNotIn) {
    
    this.portNotIn = portNotIn;
    return this;
  }

  public SmtpServerWhereInput addPortNotInItem(Integer portNotInItem) {
    if (this.portNotIn == null) {
      this.portNotIn = new ArrayList<Integer>();
    }
    this.portNotIn.add(portNotInItem);
    return this;
  }

   /**
   * Get portNotIn
   * @return portNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getPortNotIn() {
    return portNotIn;
  }


  public void setPortNotIn(List<Integer> portNotIn) {
    this.portNotIn = portNotIn;
  }


  public SmtpServerWhereInput secureMode(SmtpSecureMode secureMode) {
    
    this.secureMode = secureMode;
    return this;
  }

   /**
   * Get secureMode
   * @return secureMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SmtpSecureMode getSecureMode() {
    return secureMode;
  }


  public void setSecureMode(SmtpSecureMode secureMode) {
    this.secureMode = secureMode;
  }


  public SmtpServerWhereInput secureModeIn(List<SmtpSecureMode> secureModeIn) {
    
    this.secureModeIn = secureModeIn;
    return this;
  }

  public SmtpServerWhereInput addSecureModeInItem(SmtpSecureMode secureModeInItem) {
    if (this.secureModeIn == null) {
      this.secureModeIn = new ArrayList<SmtpSecureMode>();
    }
    this.secureModeIn.add(secureModeInItem);
    return this;
  }

   /**
   * Get secureModeIn
   * @return secureModeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SmtpSecureMode> getSecureModeIn() {
    return secureModeIn;
  }


  public void setSecureModeIn(List<SmtpSecureMode> secureModeIn) {
    this.secureModeIn = secureModeIn;
  }


  public SmtpServerWhereInput secureModeNot(SmtpSecureMode secureModeNot) {
    
    this.secureModeNot = secureModeNot;
    return this;
  }

   /**
   * Get secureModeNot
   * @return secureModeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SmtpSecureMode getSecureModeNot() {
    return secureModeNot;
  }


  public void setSecureModeNot(SmtpSecureMode secureModeNot) {
    this.secureModeNot = secureModeNot;
  }


  public SmtpServerWhereInput secureModeNotIn(List<SmtpSecureMode> secureModeNotIn) {
    
    this.secureModeNotIn = secureModeNotIn;
    return this;
  }

  public SmtpServerWhereInput addSecureModeNotInItem(SmtpSecureMode secureModeNotInItem) {
    if (this.secureModeNotIn == null) {
      this.secureModeNotIn = new ArrayList<SmtpSecureMode>();
    }
    this.secureModeNotIn.add(secureModeNotInItem);
    return this;
  }

   /**
   * Get secureModeNotIn
   * @return secureModeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SmtpSecureMode> getSecureModeNotIn() {
    return secureModeNotIn;
  }


  public void setSecureModeNotIn(List<SmtpSecureMode> secureModeNotIn) {
    this.secureModeNotIn = secureModeNotIn;
  }


  public SmtpServerWhereInput username(String username) {
    
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


  public SmtpServerWhereInput usernameContains(String usernameContains) {
    
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


  public SmtpServerWhereInput usernameEndsWith(String usernameEndsWith) {
    
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


  public SmtpServerWhereInput usernameGt(String usernameGt) {
    
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


  public SmtpServerWhereInput usernameGte(String usernameGte) {
    
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


  public SmtpServerWhereInput usernameIn(List<String> usernameIn) {
    
    this.usernameIn = usernameIn;
    return this;
  }

  public SmtpServerWhereInput addUsernameInItem(String usernameInItem) {
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


  public SmtpServerWhereInput usernameLt(String usernameLt) {
    
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


  public SmtpServerWhereInput usernameLte(String usernameLte) {
    
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


  public SmtpServerWhereInput usernameNot(String usernameNot) {
    
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


  public SmtpServerWhereInput usernameNotContains(String usernameNotContains) {
    
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


  public SmtpServerWhereInput usernameNotEndsWith(String usernameNotEndsWith) {
    
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


  public SmtpServerWhereInput usernameNotIn(List<String> usernameNotIn) {
    
    this.usernameNotIn = usernameNotIn;
    return this;
  }

  public SmtpServerWhereInput addUsernameNotInItem(String usernameNotInItem) {
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


  public SmtpServerWhereInput usernameNotStartsWith(String usernameNotStartsWith) {
    
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


  public SmtpServerWhereInput usernameStartsWith(String usernameStartsWith) {
    
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
    SmtpServerWhereInput smtpServerWhereInput = (SmtpServerWhereInput) o;
    return Objects.equals(this.AND, smtpServerWhereInput.AND) &&
        Objects.equals(this.NOT, smtpServerWhereInput.NOT) &&
        Objects.equals(this.OR, smtpServerWhereInput.OR) &&
        Objects.equals(this.description, smtpServerWhereInput.description) &&
        Objects.equals(this.descriptionContains, smtpServerWhereInput.descriptionContains) &&
        Objects.equals(this.descriptionEndsWith, smtpServerWhereInput.descriptionEndsWith) &&
        Objects.equals(this.descriptionGt, smtpServerWhereInput.descriptionGt) &&
        Objects.equals(this.descriptionGte, smtpServerWhereInput.descriptionGte) &&
        Objects.equals(this.descriptionIn, smtpServerWhereInput.descriptionIn) &&
        Objects.equals(this.descriptionLt, smtpServerWhereInput.descriptionLt) &&
        Objects.equals(this.descriptionLte, smtpServerWhereInput.descriptionLte) &&
        Objects.equals(this.descriptionNot, smtpServerWhereInput.descriptionNot) &&
        Objects.equals(this.descriptionNotContains, smtpServerWhereInput.descriptionNotContains) &&
        Objects.equals(this.descriptionNotEndsWith, smtpServerWhereInput.descriptionNotEndsWith) &&
        Objects.equals(this.descriptionNotIn, smtpServerWhereInput.descriptionNotIn) &&
        Objects.equals(this.descriptionNotStartsWith, smtpServerWhereInput.descriptionNotStartsWith) &&
        Objects.equals(this.descriptionStartsWith, smtpServerWhereInput.descriptionStartsWith) &&
        Objects.equals(this.host, smtpServerWhereInput.host) &&
        Objects.equals(this.hostContains, smtpServerWhereInput.hostContains) &&
        Objects.equals(this.hostEndsWith, smtpServerWhereInput.hostEndsWith) &&
        Objects.equals(this.hostGt, smtpServerWhereInput.hostGt) &&
        Objects.equals(this.hostGte, smtpServerWhereInput.hostGte) &&
        Objects.equals(this.hostIn, smtpServerWhereInput.hostIn) &&
        Objects.equals(this.hostLt, smtpServerWhereInput.hostLt) &&
        Objects.equals(this.hostLte, smtpServerWhereInput.hostLte) &&
        Objects.equals(this.hostNot, smtpServerWhereInput.hostNot) &&
        Objects.equals(this.hostNotContains, smtpServerWhereInput.hostNotContains) &&
        Objects.equals(this.hostNotEndsWith, smtpServerWhereInput.hostNotEndsWith) &&
        Objects.equals(this.hostNotIn, smtpServerWhereInput.hostNotIn) &&
        Objects.equals(this.hostNotStartsWith, smtpServerWhereInput.hostNotStartsWith) &&
        Objects.equals(this.hostStartsWith, smtpServerWhereInput.hostStartsWith) &&
        Objects.equals(this.id, smtpServerWhereInput.id) &&
        Objects.equals(this.idContains, smtpServerWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, smtpServerWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, smtpServerWhereInput.idGt) &&
        Objects.equals(this.idGte, smtpServerWhereInput.idGte) &&
        Objects.equals(this.idIn, smtpServerWhereInput.idIn) &&
        Objects.equals(this.idLt, smtpServerWhereInput.idLt) &&
        Objects.equals(this.idLte, smtpServerWhereInput.idLte) &&
        Objects.equals(this.idNot, smtpServerWhereInput.idNot) &&
        Objects.equals(this.idNotContains, smtpServerWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, smtpServerWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, smtpServerWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, smtpServerWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, smtpServerWhereInput.idStartsWith) &&
        Objects.equals(this.isRecordPassword, smtpServerWhereInput.isRecordPassword) &&
        Objects.equals(this.isRecordPasswordNot, smtpServerWhereInput.isRecordPasswordNot) &&
        Objects.equals(this.name, smtpServerWhereInput.name) &&
        Objects.equals(this.nameContains, smtpServerWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, smtpServerWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, smtpServerWhereInput.nameGt) &&
        Objects.equals(this.nameGte, smtpServerWhereInput.nameGte) &&
        Objects.equals(this.nameIn, smtpServerWhereInput.nameIn) &&
        Objects.equals(this.nameLt, smtpServerWhereInput.nameLt) &&
        Objects.equals(this.nameLte, smtpServerWhereInput.nameLte) &&
        Objects.equals(this.nameNot, smtpServerWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, smtpServerWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, smtpServerWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, smtpServerWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, smtpServerWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, smtpServerWhereInput.nameStartsWith) &&
        Objects.equals(this.password, smtpServerWhereInput.password) &&
        Objects.equals(this.passwordContains, smtpServerWhereInput.passwordContains) &&
        Objects.equals(this.passwordEndsWith, smtpServerWhereInput.passwordEndsWith) &&
        Objects.equals(this.passwordGt, smtpServerWhereInput.passwordGt) &&
        Objects.equals(this.passwordGte, smtpServerWhereInput.passwordGte) &&
        Objects.equals(this.passwordIn, smtpServerWhereInput.passwordIn) &&
        Objects.equals(this.passwordLt, smtpServerWhereInput.passwordLt) &&
        Objects.equals(this.passwordLte, smtpServerWhereInput.passwordLte) &&
        Objects.equals(this.passwordNot, smtpServerWhereInput.passwordNot) &&
        Objects.equals(this.passwordNotContains, smtpServerWhereInput.passwordNotContains) &&
        Objects.equals(this.passwordNotEndsWith, smtpServerWhereInput.passwordNotEndsWith) &&
        Objects.equals(this.passwordNotIn, smtpServerWhereInput.passwordNotIn) &&
        Objects.equals(this.passwordNotStartsWith, smtpServerWhereInput.passwordNotStartsWith) &&
        Objects.equals(this.passwordStartsWith, smtpServerWhereInput.passwordStartsWith) &&
        Objects.equals(this.port, smtpServerWhereInput.port) &&
        Objects.equals(this.portGt, smtpServerWhereInput.portGt) &&
        Objects.equals(this.portGte, smtpServerWhereInput.portGte) &&
        Objects.equals(this.portIn, smtpServerWhereInput.portIn) &&
        Objects.equals(this.portLt, smtpServerWhereInput.portLt) &&
        Objects.equals(this.portLte, smtpServerWhereInput.portLte) &&
        Objects.equals(this.portNot, smtpServerWhereInput.portNot) &&
        Objects.equals(this.portNotIn, smtpServerWhereInput.portNotIn) &&
        Objects.equals(this.secureMode, smtpServerWhereInput.secureMode) &&
        Objects.equals(this.secureModeIn, smtpServerWhereInput.secureModeIn) &&
        Objects.equals(this.secureModeNot, smtpServerWhereInput.secureModeNot) &&
        Objects.equals(this.secureModeNotIn, smtpServerWhereInput.secureModeNotIn) &&
        Objects.equals(this.username, smtpServerWhereInput.username) &&
        Objects.equals(this.usernameContains, smtpServerWhereInput.usernameContains) &&
        Objects.equals(this.usernameEndsWith, smtpServerWhereInput.usernameEndsWith) &&
        Objects.equals(this.usernameGt, smtpServerWhereInput.usernameGt) &&
        Objects.equals(this.usernameGte, smtpServerWhereInput.usernameGte) &&
        Objects.equals(this.usernameIn, smtpServerWhereInput.usernameIn) &&
        Objects.equals(this.usernameLt, smtpServerWhereInput.usernameLt) &&
        Objects.equals(this.usernameLte, smtpServerWhereInput.usernameLte) &&
        Objects.equals(this.usernameNot, smtpServerWhereInput.usernameNot) &&
        Objects.equals(this.usernameNotContains, smtpServerWhereInput.usernameNotContains) &&
        Objects.equals(this.usernameNotEndsWith, smtpServerWhereInput.usernameNotEndsWith) &&
        Objects.equals(this.usernameNotIn, smtpServerWhereInput.usernameNotIn) &&
        Objects.equals(this.usernameNotStartsWith, smtpServerWhereInput.usernameNotStartsWith) &&
        Objects.equals(this.usernameStartsWith, smtpServerWhereInput.usernameStartsWith);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, description, descriptionContains, descriptionEndsWith, descriptionGt, descriptionGte, descriptionIn, descriptionLt, descriptionLte, descriptionNot, descriptionNotContains, descriptionNotEndsWith, descriptionNotIn, descriptionNotStartsWith, descriptionStartsWith, host, hostContains, hostEndsWith, hostGt, hostGte, hostIn, hostLt, hostLte, hostNot, hostNotContains, hostNotEndsWith, hostNotIn, hostNotStartsWith, hostStartsWith, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, isRecordPassword, isRecordPasswordNot, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, password, passwordContains, passwordEndsWith, passwordGt, passwordGte, passwordIn, passwordLt, passwordLte, passwordNot, passwordNotContains, passwordNotEndsWith, passwordNotIn, passwordNotStartsWith, passwordStartsWith, port, portGt, portGte, portIn, portLt, portLte, portNot, portNotIn, secureMode, secureModeIn, secureModeNot, secureModeNotIn, username, usernameContains, usernameEndsWith, usernameGt, usernameGte, usernameIn, usernameLt, usernameLte, usernameNot, usernameNotContains, usernameNotEndsWith, usernameNotIn, usernameNotStartsWith, usernameStartsWith);
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
    sb.append("class SmtpServerWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
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
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    hostContains: ").append(toIndentedString(hostContains)).append("\n");
    sb.append("    hostEndsWith: ").append(toIndentedString(hostEndsWith)).append("\n");
    sb.append("    hostGt: ").append(toIndentedString(hostGt)).append("\n");
    sb.append("    hostGte: ").append(toIndentedString(hostGte)).append("\n");
    sb.append("    hostIn: ").append(toIndentedString(hostIn)).append("\n");
    sb.append("    hostLt: ").append(toIndentedString(hostLt)).append("\n");
    sb.append("    hostLte: ").append(toIndentedString(hostLte)).append("\n");
    sb.append("    hostNot: ").append(toIndentedString(hostNot)).append("\n");
    sb.append("    hostNotContains: ").append(toIndentedString(hostNotContains)).append("\n");
    sb.append("    hostNotEndsWith: ").append(toIndentedString(hostNotEndsWith)).append("\n");
    sb.append("    hostNotIn: ").append(toIndentedString(hostNotIn)).append("\n");
    sb.append("    hostNotStartsWith: ").append(toIndentedString(hostNotStartsWith)).append("\n");
    sb.append("    hostStartsWith: ").append(toIndentedString(hostStartsWith)).append("\n");
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
    sb.append("    isRecordPassword: ").append(toIndentedString(isRecordPassword)).append("\n");
    sb.append("    isRecordPasswordNot: ").append(toIndentedString(isRecordPasswordNot)).append("\n");
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
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordContains: ").append(toIndentedString(passwordContains)).append("\n");
    sb.append("    passwordEndsWith: ").append(toIndentedString(passwordEndsWith)).append("\n");
    sb.append("    passwordGt: ").append(toIndentedString(passwordGt)).append("\n");
    sb.append("    passwordGte: ").append(toIndentedString(passwordGte)).append("\n");
    sb.append("    passwordIn: ").append(toIndentedString(passwordIn)).append("\n");
    sb.append("    passwordLt: ").append(toIndentedString(passwordLt)).append("\n");
    sb.append("    passwordLte: ").append(toIndentedString(passwordLte)).append("\n");
    sb.append("    passwordNot: ").append(toIndentedString(passwordNot)).append("\n");
    sb.append("    passwordNotContains: ").append(toIndentedString(passwordNotContains)).append("\n");
    sb.append("    passwordNotEndsWith: ").append(toIndentedString(passwordNotEndsWith)).append("\n");
    sb.append("    passwordNotIn: ").append(toIndentedString(passwordNotIn)).append("\n");
    sb.append("    passwordNotStartsWith: ").append(toIndentedString(passwordNotStartsWith)).append("\n");
    sb.append("    passwordStartsWith: ").append(toIndentedString(passwordStartsWith)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    portGt: ").append(toIndentedString(portGt)).append("\n");
    sb.append("    portGte: ").append(toIndentedString(portGte)).append("\n");
    sb.append("    portIn: ").append(toIndentedString(portIn)).append("\n");
    sb.append("    portLt: ").append(toIndentedString(portLt)).append("\n");
    sb.append("    portLte: ").append(toIndentedString(portLte)).append("\n");
    sb.append("    portNot: ").append(toIndentedString(portNot)).append("\n");
    sb.append("    portNotIn: ").append(toIndentedString(portNotIn)).append("\n");
    sb.append("    secureMode: ").append(toIndentedString(secureMode)).append("\n");
    sb.append("    secureModeIn: ").append(toIndentedString(secureModeIn)).append("\n");
    sb.append("    secureModeNot: ").append(toIndentedString(secureModeNot)).append("\n");
    sb.append("    secureModeNotIn: ").append(toIndentedString(secureModeNotIn)).append("\n");
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

