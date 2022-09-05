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
import com.smartx.tower.model.NodeTopoWhereInput;
import com.smartx.tower.model.ZoneTopoWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ClusterTopoWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ClusterTopoWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<ClusterTopoWhereInput> AND = null;

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

  public static final String SERIALIZED_NAME_NODE_TOPOES_EVERY = "node_topoes_every";
  @SerializedName(SERIALIZED_NAME_NODE_TOPOES_EVERY)
  private NodeTopoWhereInput nodeTopoesEvery;

  public static final String SERIALIZED_NAME_NODE_TOPOES_NONE = "node_topoes_none";
  @SerializedName(SERIALIZED_NAME_NODE_TOPOES_NONE)
  private NodeTopoWhereInput nodeTopoesNone;

  public static final String SERIALIZED_NAME_NODE_TOPOES_SOME = "node_topoes_some";
  @SerializedName(SERIALIZED_NAME_NODE_TOPOES_SOME)
  private NodeTopoWhereInput nodeTopoesSome;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<ClusterTopoWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<ClusterTopoWhereInput> OR = null;

  public static final String SERIALIZED_NAME_ZONE_TOPOES_EVERY = "zone_topoes_every";
  @SerializedName(SERIALIZED_NAME_ZONE_TOPOES_EVERY)
  private ZoneTopoWhereInput zoneTopoesEvery;

  public static final String SERIALIZED_NAME_ZONE_TOPOES_NONE = "zone_topoes_none";
  @SerializedName(SERIALIZED_NAME_ZONE_TOPOES_NONE)
  private ZoneTopoWhereInput zoneTopoesNone;

  public static final String SERIALIZED_NAME_ZONE_TOPOES_SOME = "zone_topoes_some";
  @SerializedName(SERIALIZED_NAME_ZONE_TOPOES_SOME)
  private ZoneTopoWhereInput zoneTopoesSome;

  public ClusterTopoWhereInput() { 
  }

  public ClusterTopoWhereInput AND(List<ClusterTopoWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public ClusterTopoWhereInput addANDItem(ClusterTopoWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<ClusterTopoWhereInput>();
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

  public List<ClusterTopoWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<ClusterTopoWhereInput> AND) {
    this.AND = AND;
  }


  public ClusterTopoWhereInput brickTopoesEvery(BrickTopoWhereInput brickTopoesEvery) {
    
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


  public ClusterTopoWhereInput brickTopoesNone(BrickTopoWhereInput brickTopoesNone) {
    
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


  public ClusterTopoWhereInput brickTopoesSome(BrickTopoWhereInput brickTopoesSome) {
    
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


  public ClusterTopoWhereInput cluster(ClusterWhereInput cluster) {
    
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


  public ClusterTopoWhereInput id(String id) {
    
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


  public ClusterTopoWhereInput idContains(String idContains) {
    
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


  public ClusterTopoWhereInput idEndsWith(String idEndsWith) {
    
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


  public ClusterTopoWhereInput idGt(String idGt) {
    
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


  public ClusterTopoWhereInput idGte(String idGte) {
    
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


  public ClusterTopoWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public ClusterTopoWhereInput addIdInItem(String idInItem) {
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


  public ClusterTopoWhereInput idLt(String idLt) {
    
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


  public ClusterTopoWhereInput idLte(String idLte) {
    
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


  public ClusterTopoWhereInput idNot(String idNot) {
    
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


  public ClusterTopoWhereInput idNotContains(String idNotContains) {
    
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


  public ClusterTopoWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public ClusterTopoWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public ClusterTopoWhereInput addIdNotInItem(String idNotInItem) {
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


  public ClusterTopoWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public ClusterTopoWhereInput idStartsWith(String idStartsWith) {
    
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


  public ClusterTopoWhereInput localId(String localId) {
    
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


  public ClusterTopoWhereInput localIdContains(String localIdContains) {
    
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


  public ClusterTopoWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public ClusterTopoWhereInput localIdGt(String localIdGt) {
    
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


  public ClusterTopoWhereInput localIdGte(String localIdGte) {
    
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


  public ClusterTopoWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public ClusterTopoWhereInput addLocalIdInItem(String localIdInItem) {
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


  public ClusterTopoWhereInput localIdLt(String localIdLt) {
    
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


  public ClusterTopoWhereInput localIdLte(String localIdLte) {
    
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


  public ClusterTopoWhereInput localIdNot(String localIdNot) {
    
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


  public ClusterTopoWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public ClusterTopoWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public ClusterTopoWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public ClusterTopoWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public ClusterTopoWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public ClusterTopoWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public ClusterTopoWhereInput name(String name) {
    
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


  public ClusterTopoWhereInput nameContains(String nameContains) {
    
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


  public ClusterTopoWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public ClusterTopoWhereInput nameGt(String nameGt) {
    
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


  public ClusterTopoWhereInput nameGte(String nameGte) {
    
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


  public ClusterTopoWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public ClusterTopoWhereInput addNameInItem(String nameInItem) {
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


  public ClusterTopoWhereInput nameLt(String nameLt) {
    
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


  public ClusterTopoWhereInput nameLte(String nameLte) {
    
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


  public ClusterTopoWhereInput nameNot(String nameNot) {
    
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


  public ClusterTopoWhereInput nameNotContains(String nameNotContains) {
    
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


  public ClusterTopoWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public ClusterTopoWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public ClusterTopoWhereInput addNameNotInItem(String nameNotInItem) {
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


  public ClusterTopoWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public ClusterTopoWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public ClusterTopoWhereInput nodeTopoesEvery(NodeTopoWhereInput nodeTopoesEvery) {
    
    this.nodeTopoesEvery = nodeTopoesEvery;
    return this;
  }

   /**
   * Get nodeTopoesEvery
   * @return nodeTopoesEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NodeTopoWhereInput getNodeTopoesEvery() {
    return nodeTopoesEvery;
  }


  public void setNodeTopoesEvery(NodeTopoWhereInput nodeTopoesEvery) {
    this.nodeTopoesEvery = nodeTopoesEvery;
  }


  public ClusterTopoWhereInput nodeTopoesNone(NodeTopoWhereInput nodeTopoesNone) {
    
    this.nodeTopoesNone = nodeTopoesNone;
    return this;
  }

   /**
   * Get nodeTopoesNone
   * @return nodeTopoesNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NodeTopoWhereInput getNodeTopoesNone() {
    return nodeTopoesNone;
  }


  public void setNodeTopoesNone(NodeTopoWhereInput nodeTopoesNone) {
    this.nodeTopoesNone = nodeTopoesNone;
  }


  public ClusterTopoWhereInput nodeTopoesSome(NodeTopoWhereInput nodeTopoesSome) {
    
    this.nodeTopoesSome = nodeTopoesSome;
    return this;
  }

   /**
   * Get nodeTopoesSome
   * @return nodeTopoesSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NodeTopoWhereInput getNodeTopoesSome() {
    return nodeTopoesSome;
  }


  public void setNodeTopoesSome(NodeTopoWhereInput nodeTopoesSome) {
    this.nodeTopoesSome = nodeTopoesSome;
  }


  public ClusterTopoWhereInput NOT(List<ClusterTopoWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public ClusterTopoWhereInput addNOTItem(ClusterTopoWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<ClusterTopoWhereInput>();
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

  public List<ClusterTopoWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<ClusterTopoWhereInput> NOT) {
    this.NOT = NOT;
  }


  public ClusterTopoWhereInput OR(List<ClusterTopoWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public ClusterTopoWhereInput addORItem(ClusterTopoWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<ClusterTopoWhereInput>();
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

  public List<ClusterTopoWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<ClusterTopoWhereInput> OR) {
    this.OR = OR;
  }


  public ClusterTopoWhereInput zoneTopoesEvery(ZoneTopoWhereInput zoneTopoesEvery) {
    
    this.zoneTopoesEvery = zoneTopoesEvery;
    return this;
  }

   /**
   * Get zoneTopoesEvery
   * @return zoneTopoesEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZoneTopoWhereInput getZoneTopoesEvery() {
    return zoneTopoesEvery;
  }


  public void setZoneTopoesEvery(ZoneTopoWhereInput zoneTopoesEvery) {
    this.zoneTopoesEvery = zoneTopoesEvery;
  }


  public ClusterTopoWhereInput zoneTopoesNone(ZoneTopoWhereInput zoneTopoesNone) {
    
    this.zoneTopoesNone = zoneTopoesNone;
    return this;
  }

   /**
   * Get zoneTopoesNone
   * @return zoneTopoesNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZoneTopoWhereInput getZoneTopoesNone() {
    return zoneTopoesNone;
  }


  public void setZoneTopoesNone(ZoneTopoWhereInput zoneTopoesNone) {
    this.zoneTopoesNone = zoneTopoesNone;
  }


  public ClusterTopoWhereInput zoneTopoesSome(ZoneTopoWhereInput zoneTopoesSome) {
    
    this.zoneTopoesSome = zoneTopoesSome;
    return this;
  }

   /**
   * Get zoneTopoesSome
   * @return zoneTopoesSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZoneTopoWhereInput getZoneTopoesSome() {
    return zoneTopoesSome;
  }


  public void setZoneTopoesSome(ZoneTopoWhereInput zoneTopoesSome) {
    this.zoneTopoesSome = zoneTopoesSome;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterTopoWhereInput clusterTopoWhereInput = (ClusterTopoWhereInput) o;
    return Objects.equals(this.AND, clusterTopoWhereInput.AND) &&
        Objects.equals(this.brickTopoesEvery, clusterTopoWhereInput.brickTopoesEvery) &&
        Objects.equals(this.brickTopoesNone, clusterTopoWhereInput.brickTopoesNone) &&
        Objects.equals(this.brickTopoesSome, clusterTopoWhereInput.brickTopoesSome) &&
        Objects.equals(this.cluster, clusterTopoWhereInput.cluster) &&
        Objects.equals(this.id, clusterTopoWhereInput.id) &&
        Objects.equals(this.idContains, clusterTopoWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, clusterTopoWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, clusterTopoWhereInput.idGt) &&
        Objects.equals(this.idGte, clusterTopoWhereInput.idGte) &&
        Objects.equals(this.idIn, clusterTopoWhereInput.idIn) &&
        Objects.equals(this.idLt, clusterTopoWhereInput.idLt) &&
        Objects.equals(this.idLte, clusterTopoWhereInput.idLte) &&
        Objects.equals(this.idNot, clusterTopoWhereInput.idNot) &&
        Objects.equals(this.idNotContains, clusterTopoWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, clusterTopoWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, clusterTopoWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, clusterTopoWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, clusterTopoWhereInput.idStartsWith) &&
        Objects.equals(this.localId, clusterTopoWhereInput.localId) &&
        Objects.equals(this.localIdContains, clusterTopoWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, clusterTopoWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, clusterTopoWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, clusterTopoWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, clusterTopoWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, clusterTopoWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, clusterTopoWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, clusterTopoWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, clusterTopoWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, clusterTopoWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, clusterTopoWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, clusterTopoWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, clusterTopoWhereInput.localIdStartsWith) &&
        Objects.equals(this.name, clusterTopoWhereInput.name) &&
        Objects.equals(this.nameContains, clusterTopoWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, clusterTopoWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, clusterTopoWhereInput.nameGt) &&
        Objects.equals(this.nameGte, clusterTopoWhereInput.nameGte) &&
        Objects.equals(this.nameIn, clusterTopoWhereInput.nameIn) &&
        Objects.equals(this.nameLt, clusterTopoWhereInput.nameLt) &&
        Objects.equals(this.nameLte, clusterTopoWhereInput.nameLte) &&
        Objects.equals(this.nameNot, clusterTopoWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, clusterTopoWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, clusterTopoWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, clusterTopoWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, clusterTopoWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, clusterTopoWhereInput.nameStartsWith) &&
        Objects.equals(this.nodeTopoesEvery, clusterTopoWhereInput.nodeTopoesEvery) &&
        Objects.equals(this.nodeTopoesNone, clusterTopoWhereInput.nodeTopoesNone) &&
        Objects.equals(this.nodeTopoesSome, clusterTopoWhereInput.nodeTopoesSome) &&
        Objects.equals(this.NOT, clusterTopoWhereInput.NOT) &&
        Objects.equals(this.OR, clusterTopoWhereInput.OR) &&
        Objects.equals(this.zoneTopoesEvery, clusterTopoWhereInput.zoneTopoesEvery) &&
        Objects.equals(this.zoneTopoesNone, clusterTopoWhereInput.zoneTopoesNone) &&
        Objects.equals(this.zoneTopoesSome, clusterTopoWhereInput.zoneTopoesSome);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, brickTopoesEvery, brickTopoesNone, brickTopoesSome, cluster, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, nodeTopoesEvery, nodeTopoesNone, nodeTopoesSome, NOT, OR, zoneTopoesEvery, zoneTopoesNone, zoneTopoesSome);
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
    sb.append("class ClusterTopoWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    brickTopoesEvery: ").append(toIndentedString(brickTopoesEvery)).append("\n");
    sb.append("    brickTopoesNone: ").append(toIndentedString(brickTopoesNone)).append("\n");
    sb.append("    brickTopoesSome: ").append(toIndentedString(brickTopoesSome)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
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
    sb.append("    nodeTopoesEvery: ").append(toIndentedString(nodeTopoesEvery)).append("\n");
    sb.append("    nodeTopoesNone: ").append(toIndentedString(nodeTopoesNone)).append("\n");
    sb.append("    nodeTopoesSome: ").append(toIndentedString(nodeTopoesSome)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    zoneTopoesEvery: ").append(toIndentedString(zoneTopoesEvery)).append("\n");
    sb.append("    zoneTopoesNone: ").append(toIndentedString(zoneTopoesNone)).append("\n");
    sb.append("    zoneTopoesSome: ").append(toIndentedString(zoneTopoesSome)).append("\n");
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

