package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.LoadBalancerServiceWhereInput;
import com.smartx.tower.model.VlanWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VnetBondWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class VnetBondWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<VnetBondWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<VnetBondWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<VnetBondWhereInput> OR = null;

  public static final String SERIALIZED_NAME_BOND_FOR_CLIENT = "bond_for_client";
  @SerializedName(SERIALIZED_NAME_BOND_FOR_CLIENT)
  private Boolean bondForClient;

  public static final String SERIALIZED_NAME_BOND_FOR_CLIENT_NOT = "bond_for_client_not";
  @SerializedName(SERIALIZED_NAME_BOND_FOR_CLIENT_NOT)
  private Boolean bondForClientNot;

  public static final String SERIALIZED_NAME_BOND_FOR_SERVER = "bond_for_server";
  @SerializedName(SERIALIZED_NAME_BOND_FOR_SERVER)
  private Boolean bondForServer;

  public static final String SERIALIZED_NAME_BOND_FOR_SERVER_NOT = "bond_for_server_not";
  @SerializedName(SERIALIZED_NAME_BOND_FOR_SERVER_NOT)
  private Boolean bondForServerNot;

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

  public static final String SERIALIZED_NAME_LOAD_BALANCER_SERVICE = "load_balancer_service";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_SERVICE)
  private LoadBalancerServiceWhereInput loadBalancerService;

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

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_NAMESPACE_CONTAINS = "namespace_contains";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_CONTAINS)
  private String namespaceContains;

  public static final String SERIALIZED_NAME_NAMESPACE_ENDS_WITH = "namespace_ends_with";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_ENDS_WITH)
  private String namespaceEndsWith;

  public static final String SERIALIZED_NAME_NAMESPACE_GT = "namespace_gt";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_GT)
  private String namespaceGt;

  public static final String SERIALIZED_NAME_NAMESPACE_GTE = "namespace_gte";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_GTE)
  private String namespaceGte;

  public static final String SERIALIZED_NAME_NAMESPACE_IN = "namespace_in";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_IN)
  private List<String> namespaceIn = null;

  public static final String SERIALIZED_NAME_NAMESPACE_LT = "namespace_lt";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_LT)
  private String namespaceLt;

  public static final String SERIALIZED_NAME_NAMESPACE_LTE = "namespace_lte";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_LTE)
  private String namespaceLte;

  public static final String SERIALIZED_NAME_NAMESPACE_NOT = "namespace_not";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_NOT)
  private String namespaceNot;

  public static final String SERIALIZED_NAME_NAMESPACE_NOT_CONTAINS = "namespace_not_contains";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_NOT_CONTAINS)
  private String namespaceNotContains;

  public static final String SERIALIZED_NAME_NAMESPACE_NOT_ENDS_WITH = "namespace_not_ends_with";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_NOT_ENDS_WITH)
  private String namespaceNotEndsWith;

  public static final String SERIALIZED_NAME_NAMESPACE_NOT_IN = "namespace_not_in";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_NOT_IN)
  private List<String> namespaceNotIn = null;

  public static final String SERIALIZED_NAME_NAMESPACE_NOT_STARTS_WITH = "namespace_not_starts_with";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_NOT_STARTS_WITH)
  private String namespaceNotStartsWith;

  public static final String SERIALIZED_NAME_NAMESPACE_STARTS_WITH = "namespace_starts_with";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_STARTS_WITH)
  private String namespaceStartsWith;

  public static final String SERIALIZED_NAME_VLAN = "vlan";
  @SerializedName(SERIALIZED_NAME_VLAN)
  private VlanWhereInput vlan;

  public VnetBondWhereInput() { 
  }

  public VnetBondWhereInput AND(List<VnetBondWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public VnetBondWhereInput addANDItem(VnetBondWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<VnetBondWhereInput>();
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

  public List<VnetBondWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<VnetBondWhereInput> AND) {
    this.AND = AND;
  }


  public VnetBondWhereInput NOT(List<VnetBondWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public VnetBondWhereInput addNOTItem(VnetBondWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<VnetBondWhereInput>();
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

  public List<VnetBondWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<VnetBondWhereInput> NOT) {
    this.NOT = NOT;
  }


  public VnetBondWhereInput OR(List<VnetBondWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public VnetBondWhereInput addORItem(VnetBondWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<VnetBondWhereInput>();
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

  public List<VnetBondWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<VnetBondWhereInput> OR) {
    this.OR = OR;
  }


  public VnetBondWhereInput bondForClient(Boolean bondForClient) {
    
    this.bondForClient = bondForClient;
    return this;
  }

   /**
   * Get bondForClient
   * @return bondForClient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBondForClient() {
    return bondForClient;
  }


  public void setBondForClient(Boolean bondForClient) {
    this.bondForClient = bondForClient;
  }


  public VnetBondWhereInput bondForClientNot(Boolean bondForClientNot) {
    
    this.bondForClientNot = bondForClientNot;
    return this;
  }

   /**
   * Get bondForClientNot
   * @return bondForClientNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBondForClientNot() {
    return bondForClientNot;
  }


  public void setBondForClientNot(Boolean bondForClientNot) {
    this.bondForClientNot = bondForClientNot;
  }


  public VnetBondWhereInput bondForServer(Boolean bondForServer) {
    
    this.bondForServer = bondForServer;
    return this;
  }

   /**
   * Get bondForServer
   * @return bondForServer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBondForServer() {
    return bondForServer;
  }


  public void setBondForServer(Boolean bondForServer) {
    this.bondForServer = bondForServer;
  }


  public VnetBondWhereInput bondForServerNot(Boolean bondForServerNot) {
    
    this.bondForServerNot = bondForServerNot;
    return this;
  }

   /**
   * Get bondForServerNot
   * @return bondForServerNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBondForServerNot() {
    return bondForServerNot;
  }


  public void setBondForServerNot(Boolean bondForServerNot) {
    this.bondForServerNot = bondForServerNot;
  }


  public VnetBondWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public VnetBondWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public VnetBondWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public VnetBondWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public VnetBondWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public VnetBondWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public VnetBondWhereInput id(String id) {
    
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


  public VnetBondWhereInput idContains(String idContains) {
    
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


  public VnetBondWhereInput idEndsWith(String idEndsWith) {
    
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


  public VnetBondWhereInput idGt(String idGt) {
    
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


  public VnetBondWhereInput idGte(String idGte) {
    
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


  public VnetBondWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public VnetBondWhereInput addIdInItem(String idInItem) {
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


  public VnetBondWhereInput idLt(String idLt) {
    
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


  public VnetBondWhereInput idLte(String idLte) {
    
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


  public VnetBondWhereInput idNot(String idNot) {
    
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


  public VnetBondWhereInput idNotContains(String idNotContains) {
    
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


  public VnetBondWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public VnetBondWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public VnetBondWhereInput addIdNotInItem(String idNotInItem) {
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


  public VnetBondWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public VnetBondWhereInput idStartsWith(String idStartsWith) {
    
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


  public VnetBondWhereInput loadBalancerService(LoadBalancerServiceWhereInput loadBalancerService) {
    
    this.loadBalancerService = loadBalancerService;
    return this;
  }

   /**
   * Get loadBalancerService
   * @return loadBalancerService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LoadBalancerServiceWhereInput getLoadBalancerService() {
    return loadBalancerService;
  }


  public void setLoadBalancerService(LoadBalancerServiceWhereInput loadBalancerService) {
    this.loadBalancerService = loadBalancerService;
  }


  public VnetBondWhereInput localId(String localId) {
    
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


  public VnetBondWhereInput localIdContains(String localIdContains) {
    
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


  public VnetBondWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public VnetBondWhereInput localIdGt(String localIdGt) {
    
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


  public VnetBondWhereInput localIdGte(String localIdGte) {
    
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


  public VnetBondWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public VnetBondWhereInput addLocalIdInItem(String localIdInItem) {
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


  public VnetBondWhereInput localIdLt(String localIdLt) {
    
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


  public VnetBondWhereInput localIdLte(String localIdLte) {
    
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


  public VnetBondWhereInput localIdNot(String localIdNot) {
    
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


  public VnetBondWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public VnetBondWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public VnetBondWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public VnetBondWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public VnetBondWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public VnetBondWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public VnetBondWhereInput name(String name) {
    
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


  public VnetBondWhereInput nameContains(String nameContains) {
    
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


  public VnetBondWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public VnetBondWhereInput nameGt(String nameGt) {
    
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


  public VnetBondWhereInput nameGte(String nameGte) {
    
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


  public VnetBondWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public VnetBondWhereInput addNameInItem(String nameInItem) {
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


  public VnetBondWhereInput nameLt(String nameLt) {
    
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


  public VnetBondWhereInput nameLte(String nameLte) {
    
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


  public VnetBondWhereInput nameNot(String nameNot) {
    
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


  public VnetBondWhereInput nameNotContains(String nameNotContains) {
    
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


  public VnetBondWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public VnetBondWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public VnetBondWhereInput addNameNotInItem(String nameNotInItem) {
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


  public VnetBondWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public VnetBondWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public VnetBondWhereInput namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public VnetBondWhereInput namespaceContains(String namespaceContains) {
    
    this.namespaceContains = namespaceContains;
    return this;
  }

   /**
   * Get namespaceContains
   * @return namespaceContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespaceContains() {
    return namespaceContains;
  }


  public void setNamespaceContains(String namespaceContains) {
    this.namespaceContains = namespaceContains;
  }


  public VnetBondWhereInput namespaceEndsWith(String namespaceEndsWith) {
    
    this.namespaceEndsWith = namespaceEndsWith;
    return this;
  }

   /**
   * Get namespaceEndsWith
   * @return namespaceEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespaceEndsWith() {
    return namespaceEndsWith;
  }


  public void setNamespaceEndsWith(String namespaceEndsWith) {
    this.namespaceEndsWith = namespaceEndsWith;
  }


  public VnetBondWhereInput namespaceGt(String namespaceGt) {
    
    this.namespaceGt = namespaceGt;
    return this;
  }

   /**
   * Get namespaceGt
   * @return namespaceGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespaceGt() {
    return namespaceGt;
  }


  public void setNamespaceGt(String namespaceGt) {
    this.namespaceGt = namespaceGt;
  }


  public VnetBondWhereInput namespaceGte(String namespaceGte) {
    
    this.namespaceGte = namespaceGte;
    return this;
  }

   /**
   * Get namespaceGte
   * @return namespaceGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespaceGte() {
    return namespaceGte;
  }


  public void setNamespaceGte(String namespaceGte) {
    this.namespaceGte = namespaceGte;
  }


  public VnetBondWhereInput namespaceIn(List<String> namespaceIn) {
    
    this.namespaceIn = namespaceIn;
    return this;
  }

  public VnetBondWhereInput addNamespaceInItem(String namespaceInItem) {
    if (this.namespaceIn == null) {
      this.namespaceIn = new ArrayList<String>();
    }
    this.namespaceIn.add(namespaceInItem);
    return this;
  }

   /**
   * Get namespaceIn
   * @return namespaceIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNamespaceIn() {
    return namespaceIn;
  }


  public void setNamespaceIn(List<String> namespaceIn) {
    this.namespaceIn = namespaceIn;
  }


  public VnetBondWhereInput namespaceLt(String namespaceLt) {
    
    this.namespaceLt = namespaceLt;
    return this;
  }

   /**
   * Get namespaceLt
   * @return namespaceLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespaceLt() {
    return namespaceLt;
  }


  public void setNamespaceLt(String namespaceLt) {
    this.namespaceLt = namespaceLt;
  }


  public VnetBondWhereInput namespaceLte(String namespaceLte) {
    
    this.namespaceLte = namespaceLte;
    return this;
  }

   /**
   * Get namespaceLte
   * @return namespaceLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespaceLte() {
    return namespaceLte;
  }


  public void setNamespaceLte(String namespaceLte) {
    this.namespaceLte = namespaceLte;
  }


  public VnetBondWhereInput namespaceNot(String namespaceNot) {
    
    this.namespaceNot = namespaceNot;
    return this;
  }

   /**
   * Get namespaceNot
   * @return namespaceNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespaceNot() {
    return namespaceNot;
  }


  public void setNamespaceNot(String namespaceNot) {
    this.namespaceNot = namespaceNot;
  }


  public VnetBondWhereInput namespaceNotContains(String namespaceNotContains) {
    
    this.namespaceNotContains = namespaceNotContains;
    return this;
  }

   /**
   * Get namespaceNotContains
   * @return namespaceNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespaceNotContains() {
    return namespaceNotContains;
  }


  public void setNamespaceNotContains(String namespaceNotContains) {
    this.namespaceNotContains = namespaceNotContains;
  }


  public VnetBondWhereInput namespaceNotEndsWith(String namespaceNotEndsWith) {
    
    this.namespaceNotEndsWith = namespaceNotEndsWith;
    return this;
  }

   /**
   * Get namespaceNotEndsWith
   * @return namespaceNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespaceNotEndsWith() {
    return namespaceNotEndsWith;
  }


  public void setNamespaceNotEndsWith(String namespaceNotEndsWith) {
    this.namespaceNotEndsWith = namespaceNotEndsWith;
  }


  public VnetBondWhereInput namespaceNotIn(List<String> namespaceNotIn) {
    
    this.namespaceNotIn = namespaceNotIn;
    return this;
  }

  public VnetBondWhereInput addNamespaceNotInItem(String namespaceNotInItem) {
    if (this.namespaceNotIn == null) {
      this.namespaceNotIn = new ArrayList<String>();
    }
    this.namespaceNotIn.add(namespaceNotInItem);
    return this;
  }

   /**
   * Get namespaceNotIn
   * @return namespaceNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNamespaceNotIn() {
    return namespaceNotIn;
  }


  public void setNamespaceNotIn(List<String> namespaceNotIn) {
    this.namespaceNotIn = namespaceNotIn;
  }


  public VnetBondWhereInput namespaceNotStartsWith(String namespaceNotStartsWith) {
    
    this.namespaceNotStartsWith = namespaceNotStartsWith;
    return this;
  }

   /**
   * Get namespaceNotStartsWith
   * @return namespaceNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespaceNotStartsWith() {
    return namespaceNotStartsWith;
  }


  public void setNamespaceNotStartsWith(String namespaceNotStartsWith) {
    this.namespaceNotStartsWith = namespaceNotStartsWith;
  }


  public VnetBondWhereInput namespaceStartsWith(String namespaceStartsWith) {
    
    this.namespaceStartsWith = namespaceStartsWith;
    return this;
  }

   /**
   * Get namespaceStartsWith
   * @return namespaceStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespaceStartsWith() {
    return namespaceStartsWith;
  }


  public void setNamespaceStartsWith(String namespaceStartsWith) {
    this.namespaceStartsWith = namespaceStartsWith;
  }


  public VnetBondWhereInput vlan(VlanWhereInput vlan) {
    
    this.vlan = vlan;
    return this;
  }

   /**
   * Get vlan
   * @return vlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VlanWhereInput getVlan() {
    return vlan;
  }


  public void setVlan(VlanWhereInput vlan) {
    this.vlan = vlan;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VnetBondWhereInput vnetBondWhereInput = (VnetBondWhereInput) o;
    return Objects.equals(this.AND, vnetBondWhereInput.AND) &&
        Objects.equals(this.NOT, vnetBondWhereInput.NOT) &&
        Objects.equals(this.OR, vnetBondWhereInput.OR) &&
        Objects.equals(this.bondForClient, vnetBondWhereInput.bondForClient) &&
        Objects.equals(this.bondForClientNot, vnetBondWhereInput.bondForClientNot) &&
        Objects.equals(this.bondForServer, vnetBondWhereInput.bondForServer) &&
        Objects.equals(this.bondForServerNot, vnetBondWhereInput.bondForServerNot) &&
        Objects.equals(this.entityAsyncStatus, vnetBondWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, vnetBondWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, vnetBondWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, vnetBondWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.id, vnetBondWhereInput.id) &&
        Objects.equals(this.idContains, vnetBondWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, vnetBondWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, vnetBondWhereInput.idGt) &&
        Objects.equals(this.idGte, vnetBondWhereInput.idGte) &&
        Objects.equals(this.idIn, vnetBondWhereInput.idIn) &&
        Objects.equals(this.idLt, vnetBondWhereInput.idLt) &&
        Objects.equals(this.idLte, vnetBondWhereInput.idLte) &&
        Objects.equals(this.idNot, vnetBondWhereInput.idNot) &&
        Objects.equals(this.idNotContains, vnetBondWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, vnetBondWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, vnetBondWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, vnetBondWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, vnetBondWhereInput.idStartsWith) &&
        Objects.equals(this.loadBalancerService, vnetBondWhereInput.loadBalancerService) &&
        Objects.equals(this.localId, vnetBondWhereInput.localId) &&
        Objects.equals(this.localIdContains, vnetBondWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, vnetBondWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, vnetBondWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, vnetBondWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, vnetBondWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, vnetBondWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, vnetBondWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, vnetBondWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, vnetBondWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, vnetBondWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, vnetBondWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, vnetBondWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, vnetBondWhereInput.localIdStartsWith) &&
        Objects.equals(this.name, vnetBondWhereInput.name) &&
        Objects.equals(this.nameContains, vnetBondWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, vnetBondWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, vnetBondWhereInput.nameGt) &&
        Objects.equals(this.nameGte, vnetBondWhereInput.nameGte) &&
        Objects.equals(this.nameIn, vnetBondWhereInput.nameIn) &&
        Objects.equals(this.nameLt, vnetBondWhereInput.nameLt) &&
        Objects.equals(this.nameLte, vnetBondWhereInput.nameLte) &&
        Objects.equals(this.nameNot, vnetBondWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, vnetBondWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, vnetBondWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, vnetBondWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, vnetBondWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, vnetBondWhereInput.nameStartsWith) &&
        Objects.equals(this.namespace, vnetBondWhereInput.namespace) &&
        Objects.equals(this.namespaceContains, vnetBondWhereInput.namespaceContains) &&
        Objects.equals(this.namespaceEndsWith, vnetBondWhereInput.namespaceEndsWith) &&
        Objects.equals(this.namespaceGt, vnetBondWhereInput.namespaceGt) &&
        Objects.equals(this.namespaceGte, vnetBondWhereInput.namespaceGte) &&
        Objects.equals(this.namespaceIn, vnetBondWhereInput.namespaceIn) &&
        Objects.equals(this.namespaceLt, vnetBondWhereInput.namespaceLt) &&
        Objects.equals(this.namespaceLte, vnetBondWhereInput.namespaceLte) &&
        Objects.equals(this.namespaceNot, vnetBondWhereInput.namespaceNot) &&
        Objects.equals(this.namespaceNotContains, vnetBondWhereInput.namespaceNotContains) &&
        Objects.equals(this.namespaceNotEndsWith, vnetBondWhereInput.namespaceNotEndsWith) &&
        Objects.equals(this.namespaceNotIn, vnetBondWhereInput.namespaceNotIn) &&
        Objects.equals(this.namespaceNotStartsWith, vnetBondWhereInput.namespaceNotStartsWith) &&
        Objects.equals(this.namespaceStartsWith, vnetBondWhereInput.namespaceStartsWith) &&
        Objects.equals(this.vlan, vnetBondWhereInput.vlan);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, bondForClient, bondForClientNot, bondForServer, bondForServerNot, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, loadBalancerService, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, namespace, namespaceContains, namespaceEndsWith, namespaceGt, namespaceGte, namespaceIn, namespaceLt, namespaceLte, namespaceNot, namespaceNotContains, namespaceNotEndsWith, namespaceNotIn, namespaceNotStartsWith, namespaceStartsWith, vlan);
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
    sb.append("class VnetBondWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    bondForClient: ").append(toIndentedString(bondForClient)).append("\n");
    sb.append("    bondForClientNot: ").append(toIndentedString(bondForClientNot)).append("\n");
    sb.append("    bondForServer: ").append(toIndentedString(bondForServer)).append("\n");
    sb.append("    bondForServerNot: ").append(toIndentedString(bondForServerNot)).append("\n");
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
    sb.append("    loadBalancerService: ").append(toIndentedString(loadBalancerService)).append("\n");
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
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    namespaceContains: ").append(toIndentedString(namespaceContains)).append("\n");
    sb.append("    namespaceEndsWith: ").append(toIndentedString(namespaceEndsWith)).append("\n");
    sb.append("    namespaceGt: ").append(toIndentedString(namespaceGt)).append("\n");
    sb.append("    namespaceGte: ").append(toIndentedString(namespaceGte)).append("\n");
    sb.append("    namespaceIn: ").append(toIndentedString(namespaceIn)).append("\n");
    sb.append("    namespaceLt: ").append(toIndentedString(namespaceLt)).append("\n");
    sb.append("    namespaceLte: ").append(toIndentedString(namespaceLte)).append("\n");
    sb.append("    namespaceNot: ").append(toIndentedString(namespaceNot)).append("\n");
    sb.append("    namespaceNotContains: ").append(toIndentedString(namespaceNotContains)).append("\n");
    sb.append("    namespaceNotEndsWith: ").append(toIndentedString(namespaceNotEndsWith)).append("\n");
    sb.append("    namespaceNotIn: ").append(toIndentedString(namespaceNotIn)).append("\n");
    sb.append("    namespaceNotStartsWith: ").append(toIndentedString(namespaceNotStartsWith)).append("\n");
    sb.append("    namespaceStartsWith: ").append(toIndentedString(namespaceStartsWith)).append("\n");
    sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
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

