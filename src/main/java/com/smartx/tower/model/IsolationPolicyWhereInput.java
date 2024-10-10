package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.EverouteClusterWhereInput;
import com.smartx.tower.model.IsolationMode;
import com.smartx.tower.model.LabelWhereInput;
import com.smartx.tower.model.VmWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * IsolationPolicyWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class IsolationPolicyWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<IsolationPolicyWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<IsolationPolicyWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<IsolationPolicyWhereInput> OR = null;

  public static final String SERIALIZED_NAME_EVEROUTE_CLUSTER = "everoute_cluster";
  @SerializedName(SERIALIZED_NAME_EVEROUTE_CLUSTER)
  private EverouteClusterWhereInput everouteCluster;

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

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private IsolationMode mode;

  public static final String SERIALIZED_NAME_MODE_IN = "mode_in";
  @SerializedName(SERIALIZED_NAME_MODE_IN)
  private List<IsolationMode> modeIn = null;

  public static final String SERIALIZED_NAME_MODE_NOT = "mode_not";
  @SerializedName(SERIALIZED_NAME_MODE_NOT)
  private IsolationMode modeNot;

  public static final String SERIALIZED_NAME_MODE_NOT_IN = "mode_not_in";
  @SerializedName(SERIALIZED_NAME_MODE_NOT_IN)
  private List<IsolationMode> modeNotIn = null;

  public static final String SERIALIZED_NAME_VM = "vm";
  @SerializedName(SERIALIZED_NAME_VM)
  private VmWhereInput vm;

  public IsolationPolicyWhereInput() { 
  }

  public IsolationPolicyWhereInput AND(List<IsolationPolicyWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public IsolationPolicyWhereInput addANDItem(IsolationPolicyWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<IsolationPolicyWhereInput>();
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

  public List<IsolationPolicyWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<IsolationPolicyWhereInput> AND) {
    this.AND = AND;
  }


  public IsolationPolicyWhereInput NOT(List<IsolationPolicyWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public IsolationPolicyWhereInput addNOTItem(IsolationPolicyWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<IsolationPolicyWhereInput>();
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

  public List<IsolationPolicyWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<IsolationPolicyWhereInput> NOT) {
    this.NOT = NOT;
  }


  public IsolationPolicyWhereInput OR(List<IsolationPolicyWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public IsolationPolicyWhereInput addORItem(IsolationPolicyWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<IsolationPolicyWhereInput>();
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

  public List<IsolationPolicyWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<IsolationPolicyWhereInput> OR) {
    this.OR = OR;
  }


  public IsolationPolicyWhereInput everouteCluster(EverouteClusterWhereInput everouteCluster) {
    
    this.everouteCluster = everouteCluster;
    return this;
  }

   /**
   * Get everouteCluster
   * @return everouteCluster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EverouteClusterWhereInput getEverouteCluster() {
    return everouteCluster;
  }


  public void setEverouteCluster(EverouteClusterWhereInput everouteCluster) {
    this.everouteCluster = everouteCluster;
  }


  public IsolationPolicyWhereInput id(String id) {
    
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


  public IsolationPolicyWhereInput idContains(String idContains) {
    
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


  public IsolationPolicyWhereInput idEndsWith(String idEndsWith) {
    
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


  public IsolationPolicyWhereInput idGt(String idGt) {
    
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


  public IsolationPolicyWhereInput idGte(String idGte) {
    
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


  public IsolationPolicyWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public IsolationPolicyWhereInput addIdInItem(String idInItem) {
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


  public IsolationPolicyWhereInput idLt(String idLt) {
    
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


  public IsolationPolicyWhereInput idLte(String idLte) {
    
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


  public IsolationPolicyWhereInput idNot(String idNot) {
    
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


  public IsolationPolicyWhereInput idNotContains(String idNotContains) {
    
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


  public IsolationPolicyWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public IsolationPolicyWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public IsolationPolicyWhereInput addIdNotInItem(String idNotInItem) {
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


  public IsolationPolicyWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public IsolationPolicyWhereInput idStartsWith(String idStartsWith) {
    
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


  public IsolationPolicyWhereInput labelsEvery(LabelWhereInput labelsEvery) {
    
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


  public IsolationPolicyWhereInput labelsNone(LabelWhereInput labelsNone) {
    
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


  public IsolationPolicyWhereInput labelsSome(LabelWhereInput labelsSome) {
    
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


  public IsolationPolicyWhereInput mode(IsolationMode mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IsolationMode getMode() {
    return mode;
  }


  public void setMode(IsolationMode mode) {
    this.mode = mode;
  }


  public IsolationPolicyWhereInput modeIn(List<IsolationMode> modeIn) {
    
    this.modeIn = modeIn;
    return this;
  }

  public IsolationPolicyWhereInput addModeInItem(IsolationMode modeInItem) {
    if (this.modeIn == null) {
      this.modeIn = new ArrayList<IsolationMode>();
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

  public List<IsolationMode> getModeIn() {
    return modeIn;
  }


  public void setModeIn(List<IsolationMode> modeIn) {
    this.modeIn = modeIn;
  }


  public IsolationPolicyWhereInput modeNot(IsolationMode modeNot) {
    
    this.modeNot = modeNot;
    return this;
  }

   /**
   * Get modeNot
   * @return modeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IsolationMode getModeNot() {
    return modeNot;
  }


  public void setModeNot(IsolationMode modeNot) {
    this.modeNot = modeNot;
  }


  public IsolationPolicyWhereInput modeNotIn(List<IsolationMode> modeNotIn) {
    
    this.modeNotIn = modeNotIn;
    return this;
  }

  public IsolationPolicyWhereInput addModeNotInItem(IsolationMode modeNotInItem) {
    if (this.modeNotIn == null) {
      this.modeNotIn = new ArrayList<IsolationMode>();
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

  public List<IsolationMode> getModeNotIn() {
    return modeNotIn;
  }


  public void setModeNotIn(List<IsolationMode> modeNotIn) {
    this.modeNotIn = modeNotIn;
  }


  public IsolationPolicyWhereInput vm(VmWhereInput vm) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IsolationPolicyWhereInput isolationPolicyWhereInput = (IsolationPolicyWhereInput) o;
    return Objects.equals(this.AND, isolationPolicyWhereInput.AND) &&
        Objects.equals(this.NOT, isolationPolicyWhereInput.NOT) &&
        Objects.equals(this.OR, isolationPolicyWhereInput.OR) &&
        Objects.equals(this.everouteCluster, isolationPolicyWhereInput.everouteCluster) &&
        Objects.equals(this.id, isolationPolicyWhereInput.id) &&
        Objects.equals(this.idContains, isolationPolicyWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, isolationPolicyWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, isolationPolicyWhereInput.idGt) &&
        Objects.equals(this.idGte, isolationPolicyWhereInput.idGte) &&
        Objects.equals(this.idIn, isolationPolicyWhereInput.idIn) &&
        Objects.equals(this.idLt, isolationPolicyWhereInput.idLt) &&
        Objects.equals(this.idLte, isolationPolicyWhereInput.idLte) &&
        Objects.equals(this.idNot, isolationPolicyWhereInput.idNot) &&
        Objects.equals(this.idNotContains, isolationPolicyWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, isolationPolicyWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, isolationPolicyWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, isolationPolicyWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, isolationPolicyWhereInput.idStartsWith) &&
        Objects.equals(this.labelsEvery, isolationPolicyWhereInput.labelsEvery) &&
        Objects.equals(this.labelsNone, isolationPolicyWhereInput.labelsNone) &&
        Objects.equals(this.labelsSome, isolationPolicyWhereInput.labelsSome) &&
        Objects.equals(this.mode, isolationPolicyWhereInput.mode) &&
        Objects.equals(this.modeIn, isolationPolicyWhereInput.modeIn) &&
        Objects.equals(this.modeNot, isolationPolicyWhereInput.modeNot) &&
        Objects.equals(this.modeNotIn, isolationPolicyWhereInput.modeNotIn) &&
        Objects.equals(this.vm, isolationPolicyWhereInput.vm);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, everouteCluster, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, labelsEvery, labelsNone, labelsSome, mode, modeIn, modeNot, modeNotIn, vm);
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
    sb.append("class IsolationPolicyWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    everouteCluster: ").append(toIndentedString(everouteCluster)).append("\n");
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
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    modeIn: ").append(toIndentedString(modeIn)).append("\n");
    sb.append("    modeNot: ").append(toIndentedString(modeNot)).append("\n");
    sb.append("    modeNotIn: ").append(toIndentedString(modeNotIn)).append("\n");
    sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
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

