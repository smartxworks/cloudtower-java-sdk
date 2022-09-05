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
 * ClusterSettingsWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ClusterSettingsWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<ClusterSettingsWhereInput> AND = null;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private ClusterWhereInput cluster;

  public static final String SERIALIZED_NAME_DEFAULT_HA = "default_ha";
  @SerializedName(SERIALIZED_NAME_DEFAULT_HA)
  private Boolean defaultHa;

  public static final String SERIALIZED_NAME_DEFAULT_HA_NOT = "default_ha_not";
  @SerializedName(SERIALIZED_NAME_DEFAULT_HA_NOT)
  private Boolean defaultHaNot;

  public static final String SERIALIZED_NAME_ENABLED_ISCSI = "enabled_iscsi";
  @SerializedName(SERIALIZED_NAME_ENABLED_ISCSI)
  private Boolean enabledIscsi;

  public static final String SERIALIZED_NAME_ENABLED_ISCSI_NOT = "enabled_iscsi_not";
  @SerializedName(SERIALIZED_NAME_ENABLED_ISCSI_NOT)
  private Boolean enabledIscsiNot;

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

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<ClusterSettingsWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<ClusterSettingsWhereInput> OR = null;

  public ClusterSettingsWhereInput() { 
  }

  public ClusterSettingsWhereInput AND(List<ClusterSettingsWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public ClusterSettingsWhereInput addANDItem(ClusterSettingsWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<ClusterSettingsWhereInput>();
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

  public List<ClusterSettingsWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<ClusterSettingsWhereInput> AND) {
    this.AND = AND;
  }


  public ClusterSettingsWhereInput cluster(ClusterWhereInput cluster) {
    
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


  public ClusterSettingsWhereInput defaultHa(Boolean defaultHa) {
    
    this.defaultHa = defaultHa;
    return this;
  }

   /**
   * Get defaultHa
   * @return defaultHa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDefaultHa() {
    return defaultHa;
  }


  public void setDefaultHa(Boolean defaultHa) {
    this.defaultHa = defaultHa;
  }


  public ClusterSettingsWhereInput defaultHaNot(Boolean defaultHaNot) {
    
    this.defaultHaNot = defaultHaNot;
    return this;
  }

   /**
   * Get defaultHaNot
   * @return defaultHaNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDefaultHaNot() {
    return defaultHaNot;
  }


  public void setDefaultHaNot(Boolean defaultHaNot) {
    this.defaultHaNot = defaultHaNot;
  }


  public ClusterSettingsWhereInput enabledIscsi(Boolean enabledIscsi) {
    
    this.enabledIscsi = enabledIscsi;
    return this;
  }

   /**
   * Get enabledIscsi
   * @return enabledIscsi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnabledIscsi() {
    return enabledIscsi;
  }


  public void setEnabledIscsi(Boolean enabledIscsi) {
    this.enabledIscsi = enabledIscsi;
  }


  public ClusterSettingsWhereInput enabledIscsiNot(Boolean enabledIscsiNot) {
    
    this.enabledIscsiNot = enabledIscsiNot;
    return this;
  }

   /**
   * Get enabledIscsiNot
   * @return enabledIscsiNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnabledIscsiNot() {
    return enabledIscsiNot;
  }


  public void setEnabledIscsiNot(Boolean enabledIscsiNot) {
    this.enabledIscsiNot = enabledIscsiNot;
  }


  public ClusterSettingsWhereInput id(String id) {
    
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


  public ClusterSettingsWhereInput idContains(String idContains) {
    
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


  public ClusterSettingsWhereInput idEndsWith(String idEndsWith) {
    
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


  public ClusterSettingsWhereInput idGt(String idGt) {
    
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


  public ClusterSettingsWhereInput idGte(String idGte) {
    
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


  public ClusterSettingsWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public ClusterSettingsWhereInput addIdInItem(String idInItem) {
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


  public ClusterSettingsWhereInput idLt(String idLt) {
    
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


  public ClusterSettingsWhereInput idLte(String idLte) {
    
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


  public ClusterSettingsWhereInput idNot(String idNot) {
    
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


  public ClusterSettingsWhereInput idNotContains(String idNotContains) {
    
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


  public ClusterSettingsWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public ClusterSettingsWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public ClusterSettingsWhereInput addIdNotInItem(String idNotInItem) {
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


  public ClusterSettingsWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public ClusterSettingsWhereInput idStartsWith(String idStartsWith) {
    
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


  public ClusterSettingsWhereInput NOT(List<ClusterSettingsWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public ClusterSettingsWhereInput addNOTItem(ClusterSettingsWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<ClusterSettingsWhereInput>();
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

  public List<ClusterSettingsWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<ClusterSettingsWhereInput> NOT) {
    this.NOT = NOT;
  }


  public ClusterSettingsWhereInput OR(List<ClusterSettingsWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public ClusterSettingsWhereInput addORItem(ClusterSettingsWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<ClusterSettingsWhereInput>();
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

  public List<ClusterSettingsWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<ClusterSettingsWhereInput> OR) {
    this.OR = OR;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterSettingsWhereInput clusterSettingsWhereInput = (ClusterSettingsWhereInput) o;
    return Objects.equals(this.AND, clusterSettingsWhereInput.AND) &&
        Objects.equals(this.cluster, clusterSettingsWhereInput.cluster) &&
        Objects.equals(this.defaultHa, clusterSettingsWhereInput.defaultHa) &&
        Objects.equals(this.defaultHaNot, clusterSettingsWhereInput.defaultHaNot) &&
        Objects.equals(this.enabledIscsi, clusterSettingsWhereInput.enabledIscsi) &&
        Objects.equals(this.enabledIscsiNot, clusterSettingsWhereInput.enabledIscsiNot) &&
        Objects.equals(this.id, clusterSettingsWhereInput.id) &&
        Objects.equals(this.idContains, clusterSettingsWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, clusterSettingsWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, clusterSettingsWhereInput.idGt) &&
        Objects.equals(this.idGte, clusterSettingsWhereInput.idGte) &&
        Objects.equals(this.idIn, clusterSettingsWhereInput.idIn) &&
        Objects.equals(this.idLt, clusterSettingsWhereInput.idLt) &&
        Objects.equals(this.idLte, clusterSettingsWhereInput.idLte) &&
        Objects.equals(this.idNot, clusterSettingsWhereInput.idNot) &&
        Objects.equals(this.idNotContains, clusterSettingsWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, clusterSettingsWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, clusterSettingsWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, clusterSettingsWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, clusterSettingsWhereInput.idStartsWith) &&
        Objects.equals(this.NOT, clusterSettingsWhereInput.NOT) &&
        Objects.equals(this.OR, clusterSettingsWhereInput.OR);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, cluster, defaultHa, defaultHaNot, enabledIscsi, enabledIscsiNot, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, NOT, OR);
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
    sb.append("class ClusterSettingsWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    defaultHa: ").append(toIndentedString(defaultHa)).append("\n");
    sb.append("    defaultHaNot: ").append(toIndentedString(defaultHaNot)).append("\n");
    sb.append("    enabledIscsi: ").append(toIndentedString(enabledIscsi)).append("\n");
    sb.append("    enabledIscsiNot: ").append(toIndentedString(enabledIscsiNot)).append("\n");
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
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
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

