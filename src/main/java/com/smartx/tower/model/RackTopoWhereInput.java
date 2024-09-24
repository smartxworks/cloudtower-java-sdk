package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.BrickTopoWhereInput;
import com.smartx.tower.model.ClusterWhereInput;
import com.smartx.tower.model.ZoneTopoWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * RackTopoWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class RackTopoWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<RackTopoWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<RackTopoWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<RackTopoWhereInput> OR = null;

  public static final String SERIALIZED_NAME_BRICK_TOPOES_EVERY = "brick_topoes_every";
  @SerializedName(SERIALIZED_NAME_BRICK_TOPOES_EVERY)
  private BrickTopoWhereInput brickTopoesEvery;

  public static final String SERIALIZED_NAME_BRICK_TOPOES_NONE = "brick_topoes_none";
  @SerializedName(SERIALIZED_NAME_BRICK_TOPOES_NONE)
  private BrickTopoWhereInput brickTopoesNone;

  public static final String SERIALIZED_NAME_BRICK_TOPOES_SOME = "brick_topoes_some";
  @SerializedName(SERIALIZED_NAME_BRICK_TOPOES_SOME)
  private BrickTopoWhereInput brickTopoesSome;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private ClusterWhereInput cluster;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_HEIGHT_GT = "height_gt";
  @SerializedName(SERIALIZED_NAME_HEIGHT_GT)
  private Integer heightGt;

  public static final String SERIALIZED_NAME_HEIGHT_GTE = "height_gte";
  @SerializedName(SERIALIZED_NAME_HEIGHT_GTE)
  private Integer heightGte;

  public static final String SERIALIZED_NAME_HEIGHT_IN = "height_in";
  @SerializedName(SERIALIZED_NAME_HEIGHT_IN)
  private List<Integer> heightIn = null;

  public static final String SERIALIZED_NAME_HEIGHT_LT = "height_lt";
  @SerializedName(SERIALIZED_NAME_HEIGHT_LT)
  private Integer heightLt;

  public static final String SERIALIZED_NAME_HEIGHT_LTE = "height_lte";
  @SerializedName(SERIALIZED_NAME_HEIGHT_LTE)
  private Integer heightLte;

  public static final String SERIALIZED_NAME_HEIGHT_NOT = "height_not";
  @SerializedName(SERIALIZED_NAME_HEIGHT_NOT)
  private Integer heightNot;

  public static final String SERIALIZED_NAME_HEIGHT_NOT_IN = "height_not_in";
  @SerializedName(SERIALIZED_NAME_HEIGHT_NOT_IN)
  private List<Integer> heightNotIn = null;

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

  public static final String SERIALIZED_NAME_ZONE_TOPO = "zone_topo";
  @SerializedName(SERIALIZED_NAME_ZONE_TOPO)
  private ZoneTopoWhereInput zoneTopo;

  public RackTopoWhereInput() { 
  }

  public RackTopoWhereInput AND(List<RackTopoWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public RackTopoWhereInput addANDItem(RackTopoWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<RackTopoWhereInput>();
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

  public List<RackTopoWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<RackTopoWhereInput> AND) {
    this.AND = AND;
  }


  public RackTopoWhereInput NOT(List<RackTopoWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public RackTopoWhereInput addNOTItem(RackTopoWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<RackTopoWhereInput>();
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

  public List<RackTopoWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<RackTopoWhereInput> NOT) {
    this.NOT = NOT;
  }


  public RackTopoWhereInput OR(List<RackTopoWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public RackTopoWhereInput addORItem(RackTopoWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<RackTopoWhereInput>();
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

  public List<RackTopoWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<RackTopoWhereInput> OR) {
    this.OR = OR;
  }


  public RackTopoWhereInput brickTopoesEvery(BrickTopoWhereInput brickTopoesEvery) {
    
    this.brickTopoesEvery = brickTopoesEvery;
    return this;
  }

   /**
   * Get brickTopoesEvery
   * @return brickTopoesEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BrickTopoWhereInput getBrickTopoesEvery() {
    return brickTopoesEvery;
  }


  public void setBrickTopoesEvery(BrickTopoWhereInput brickTopoesEvery) {
    this.brickTopoesEvery = brickTopoesEvery;
  }


  public RackTopoWhereInput brickTopoesNone(BrickTopoWhereInput brickTopoesNone) {
    
    this.brickTopoesNone = brickTopoesNone;
    return this;
  }

   /**
   * Get brickTopoesNone
   * @return brickTopoesNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BrickTopoWhereInput getBrickTopoesNone() {
    return brickTopoesNone;
  }


  public void setBrickTopoesNone(BrickTopoWhereInput brickTopoesNone) {
    this.brickTopoesNone = brickTopoesNone;
  }


  public RackTopoWhereInput brickTopoesSome(BrickTopoWhereInput brickTopoesSome) {
    
    this.brickTopoesSome = brickTopoesSome;
    return this;
  }

   /**
   * Get brickTopoesSome
   * @return brickTopoesSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BrickTopoWhereInput getBrickTopoesSome() {
    return brickTopoesSome;
  }


  public void setBrickTopoesSome(BrickTopoWhereInput brickTopoesSome) {
    this.brickTopoesSome = brickTopoesSome;
  }


  public RackTopoWhereInput cluster(ClusterWhereInput cluster) {
    
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


  public RackTopoWhereInput height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public RackTopoWhereInput heightGt(Integer heightGt) {
    
    this.heightGt = heightGt;
    return this;
  }

   /**
   * Get heightGt
   * @return heightGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHeightGt() {
    return heightGt;
  }


  public void setHeightGt(Integer heightGt) {
    this.heightGt = heightGt;
  }


  public RackTopoWhereInput heightGte(Integer heightGte) {
    
    this.heightGte = heightGte;
    return this;
  }

   /**
   * Get heightGte
   * @return heightGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHeightGte() {
    return heightGte;
  }


  public void setHeightGte(Integer heightGte) {
    this.heightGte = heightGte;
  }


  public RackTopoWhereInput heightIn(List<Integer> heightIn) {
    
    this.heightIn = heightIn;
    return this;
  }

  public RackTopoWhereInput addHeightInItem(Integer heightInItem) {
    if (this.heightIn == null) {
      this.heightIn = new ArrayList<Integer>();
    }
    this.heightIn.add(heightInItem);
    return this;
  }

   /**
   * Get heightIn
   * @return heightIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getHeightIn() {
    return heightIn;
  }


  public void setHeightIn(List<Integer> heightIn) {
    this.heightIn = heightIn;
  }


  public RackTopoWhereInput heightLt(Integer heightLt) {
    
    this.heightLt = heightLt;
    return this;
  }

   /**
   * Get heightLt
   * @return heightLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHeightLt() {
    return heightLt;
  }


  public void setHeightLt(Integer heightLt) {
    this.heightLt = heightLt;
  }


  public RackTopoWhereInput heightLte(Integer heightLte) {
    
    this.heightLte = heightLte;
    return this;
  }

   /**
   * Get heightLte
   * @return heightLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHeightLte() {
    return heightLte;
  }


  public void setHeightLte(Integer heightLte) {
    this.heightLte = heightLte;
  }


  public RackTopoWhereInput heightNot(Integer heightNot) {
    
    this.heightNot = heightNot;
    return this;
  }

   /**
   * Get heightNot
   * @return heightNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHeightNot() {
    return heightNot;
  }


  public void setHeightNot(Integer heightNot) {
    this.heightNot = heightNot;
  }


  public RackTopoWhereInput heightNotIn(List<Integer> heightNotIn) {
    
    this.heightNotIn = heightNotIn;
    return this;
  }

  public RackTopoWhereInput addHeightNotInItem(Integer heightNotInItem) {
    if (this.heightNotIn == null) {
      this.heightNotIn = new ArrayList<Integer>();
    }
    this.heightNotIn.add(heightNotInItem);
    return this;
  }

   /**
   * Get heightNotIn
   * @return heightNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getHeightNotIn() {
    return heightNotIn;
  }


  public void setHeightNotIn(List<Integer> heightNotIn) {
    this.heightNotIn = heightNotIn;
  }


  public RackTopoWhereInput id(String id) {
    
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


  public RackTopoWhereInput idContains(String idContains) {
    
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


  public RackTopoWhereInput idEndsWith(String idEndsWith) {
    
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


  public RackTopoWhereInput idGt(String idGt) {
    
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


  public RackTopoWhereInput idGte(String idGte) {
    
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


  public RackTopoWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public RackTopoWhereInput addIdInItem(String idInItem) {
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


  public RackTopoWhereInput idLt(String idLt) {
    
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


  public RackTopoWhereInput idLte(String idLte) {
    
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


  public RackTopoWhereInput idNot(String idNot) {
    
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


  public RackTopoWhereInput idNotContains(String idNotContains) {
    
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


  public RackTopoWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public RackTopoWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public RackTopoWhereInput addIdNotInItem(String idNotInItem) {
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


  public RackTopoWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public RackTopoWhereInput idStartsWith(String idStartsWith) {
    
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


  public RackTopoWhereInput localId(String localId) {
    
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


  public RackTopoWhereInput localIdContains(String localIdContains) {
    
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


  public RackTopoWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public RackTopoWhereInput localIdGt(String localIdGt) {
    
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


  public RackTopoWhereInput localIdGte(String localIdGte) {
    
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


  public RackTopoWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public RackTopoWhereInput addLocalIdInItem(String localIdInItem) {
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


  public RackTopoWhereInput localIdLt(String localIdLt) {
    
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


  public RackTopoWhereInput localIdLte(String localIdLte) {
    
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


  public RackTopoWhereInput localIdNot(String localIdNot) {
    
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


  public RackTopoWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public RackTopoWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public RackTopoWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public RackTopoWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public RackTopoWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public RackTopoWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public RackTopoWhereInput name(String name) {
    
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


  public RackTopoWhereInput nameContains(String nameContains) {
    
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


  public RackTopoWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public RackTopoWhereInput nameGt(String nameGt) {
    
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


  public RackTopoWhereInput nameGte(String nameGte) {
    
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


  public RackTopoWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public RackTopoWhereInput addNameInItem(String nameInItem) {
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


  public RackTopoWhereInput nameLt(String nameLt) {
    
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


  public RackTopoWhereInput nameLte(String nameLte) {
    
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


  public RackTopoWhereInput nameNot(String nameNot) {
    
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


  public RackTopoWhereInput nameNotContains(String nameNotContains) {
    
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


  public RackTopoWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public RackTopoWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public RackTopoWhereInput addNameNotInItem(String nameNotInItem) {
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


  public RackTopoWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public RackTopoWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public RackTopoWhereInput zoneTopo(ZoneTopoWhereInput zoneTopo) {
    
    this.zoneTopo = zoneTopo;
    return this;
  }

   /**
   * Get zoneTopo
   * @return zoneTopo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZoneTopoWhereInput getZoneTopo() {
    return zoneTopo;
  }


  public void setZoneTopo(ZoneTopoWhereInput zoneTopo) {
    this.zoneTopo = zoneTopo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RackTopoWhereInput rackTopoWhereInput = (RackTopoWhereInput) o;
    return Objects.equals(this.AND, rackTopoWhereInput.AND) &&
        Objects.equals(this.NOT, rackTopoWhereInput.NOT) &&
        Objects.equals(this.OR, rackTopoWhereInput.OR) &&
        Objects.equals(this.brickTopoesEvery, rackTopoWhereInput.brickTopoesEvery) &&
        Objects.equals(this.brickTopoesNone, rackTopoWhereInput.brickTopoesNone) &&
        Objects.equals(this.brickTopoesSome, rackTopoWhereInput.brickTopoesSome) &&
        Objects.equals(this.cluster, rackTopoWhereInput.cluster) &&
        Objects.equals(this.height, rackTopoWhereInput.height) &&
        Objects.equals(this.heightGt, rackTopoWhereInput.heightGt) &&
        Objects.equals(this.heightGte, rackTopoWhereInput.heightGte) &&
        Objects.equals(this.heightIn, rackTopoWhereInput.heightIn) &&
        Objects.equals(this.heightLt, rackTopoWhereInput.heightLt) &&
        Objects.equals(this.heightLte, rackTopoWhereInput.heightLte) &&
        Objects.equals(this.heightNot, rackTopoWhereInput.heightNot) &&
        Objects.equals(this.heightNotIn, rackTopoWhereInput.heightNotIn) &&
        Objects.equals(this.id, rackTopoWhereInput.id) &&
        Objects.equals(this.idContains, rackTopoWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, rackTopoWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, rackTopoWhereInput.idGt) &&
        Objects.equals(this.idGte, rackTopoWhereInput.idGte) &&
        Objects.equals(this.idIn, rackTopoWhereInput.idIn) &&
        Objects.equals(this.idLt, rackTopoWhereInput.idLt) &&
        Objects.equals(this.idLte, rackTopoWhereInput.idLte) &&
        Objects.equals(this.idNot, rackTopoWhereInput.idNot) &&
        Objects.equals(this.idNotContains, rackTopoWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, rackTopoWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, rackTopoWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, rackTopoWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, rackTopoWhereInput.idStartsWith) &&
        Objects.equals(this.localId, rackTopoWhereInput.localId) &&
        Objects.equals(this.localIdContains, rackTopoWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, rackTopoWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, rackTopoWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, rackTopoWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, rackTopoWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, rackTopoWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, rackTopoWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, rackTopoWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, rackTopoWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, rackTopoWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, rackTopoWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, rackTopoWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, rackTopoWhereInput.localIdStartsWith) &&
        Objects.equals(this.name, rackTopoWhereInput.name) &&
        Objects.equals(this.nameContains, rackTopoWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, rackTopoWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, rackTopoWhereInput.nameGt) &&
        Objects.equals(this.nameGte, rackTopoWhereInput.nameGte) &&
        Objects.equals(this.nameIn, rackTopoWhereInput.nameIn) &&
        Objects.equals(this.nameLt, rackTopoWhereInput.nameLt) &&
        Objects.equals(this.nameLte, rackTopoWhereInput.nameLte) &&
        Objects.equals(this.nameNot, rackTopoWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, rackTopoWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, rackTopoWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, rackTopoWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, rackTopoWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, rackTopoWhereInput.nameStartsWith) &&
        Objects.equals(this.zoneTopo, rackTopoWhereInput.zoneTopo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, brickTopoesEvery, brickTopoesNone, brickTopoesSome, cluster, height, heightGt, heightGte, heightIn, heightLt, heightLte, heightNot, heightNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, zoneTopo);
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
    sb.append("class RackTopoWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    brickTopoesEvery: ").append(toIndentedString(brickTopoesEvery)).append("\n");
    sb.append("    brickTopoesNone: ").append(toIndentedString(brickTopoesNone)).append("\n");
    sb.append("    brickTopoesSome: ").append(toIndentedString(brickTopoesSome)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    heightGt: ").append(toIndentedString(heightGt)).append("\n");
    sb.append("    heightGte: ").append(toIndentedString(heightGte)).append("\n");
    sb.append("    heightIn: ").append(toIndentedString(heightIn)).append("\n");
    sb.append("    heightLt: ").append(toIndentedString(heightLt)).append("\n");
    sb.append("    heightLte: ").append(toIndentedString(heightLte)).append("\n");
    sb.append("    heightNot: ").append(toIndentedString(heightNot)).append("\n");
    sb.append("    heightNotIn: ").append(toIndentedString(heightNotIn)).append("\n");
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
    sb.append("    zoneTopo: ").append(toIndentedString(zoneTopo)).append("\n");
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

