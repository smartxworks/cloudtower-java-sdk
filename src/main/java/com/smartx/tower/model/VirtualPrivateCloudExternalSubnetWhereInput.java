package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.VirtualPrivateCloudFloatingIpWhereInput;
import com.smartx.tower.model.VirtualPrivateCloudNatGatewayWhereInput;
import com.smartx.tower.model.VirtualPrivateCloudRouterGatewayWhereInput;
import com.smartx.tower.model.VirtualPrivateCloudWhereInput;
import com.smartx.tower.model.VlanWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VirtualPrivateCloudExternalSubnetWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VirtualPrivateCloudExternalSubnetWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<VirtualPrivateCloudExternalSubnetWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<VirtualPrivateCloudExternalSubnetWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<VirtualPrivateCloudExternalSubnetWhereInput> OR = null;

  public static final String SERIALIZED_NAME_CIDR = "cidr";
  @SerializedName(SERIALIZED_NAME_CIDR)
  private String cidr;

  public static final String SERIALIZED_NAME_CIDR_CONTAINS = "cidr_contains";
  @SerializedName(SERIALIZED_NAME_CIDR_CONTAINS)
  private String cidrContains;

  public static final String SERIALIZED_NAME_CIDR_ENDS_WITH = "cidr_ends_with";
  @SerializedName(SERIALIZED_NAME_CIDR_ENDS_WITH)
  private String cidrEndsWith;

  public static final String SERIALIZED_NAME_CIDR_GT = "cidr_gt";
  @SerializedName(SERIALIZED_NAME_CIDR_GT)
  private String cidrGt;

  public static final String SERIALIZED_NAME_CIDR_GTE = "cidr_gte";
  @SerializedName(SERIALIZED_NAME_CIDR_GTE)
  private String cidrGte;

  public static final String SERIALIZED_NAME_CIDR_IN = "cidr_in";
  @SerializedName(SERIALIZED_NAME_CIDR_IN)
  private List<String> cidrIn = null;

  public static final String SERIALIZED_NAME_CIDR_LT = "cidr_lt";
  @SerializedName(SERIALIZED_NAME_CIDR_LT)
  private String cidrLt;

  public static final String SERIALIZED_NAME_CIDR_LTE = "cidr_lte";
  @SerializedName(SERIALIZED_NAME_CIDR_LTE)
  private String cidrLte;

  public static final String SERIALIZED_NAME_CIDR_NOT = "cidr_not";
  @SerializedName(SERIALIZED_NAME_CIDR_NOT)
  private String cidrNot;

  public static final String SERIALIZED_NAME_CIDR_NOT_CONTAINS = "cidr_not_contains";
  @SerializedName(SERIALIZED_NAME_CIDR_NOT_CONTAINS)
  private String cidrNotContains;

  public static final String SERIALIZED_NAME_CIDR_NOT_ENDS_WITH = "cidr_not_ends_with";
  @SerializedName(SERIALIZED_NAME_CIDR_NOT_ENDS_WITH)
  private String cidrNotEndsWith;

  public static final String SERIALIZED_NAME_CIDR_NOT_IN = "cidr_not_in";
  @SerializedName(SERIALIZED_NAME_CIDR_NOT_IN)
  private List<String> cidrNotIn = null;

  public static final String SERIALIZED_NAME_CIDR_NOT_STARTS_WITH = "cidr_not_starts_with";
  @SerializedName(SERIALIZED_NAME_CIDR_NOT_STARTS_WITH)
  private String cidrNotStartsWith;

  public static final String SERIALIZED_NAME_CIDR_STARTS_WITH = "cidr_starts_with";
  @SerializedName(SERIALIZED_NAME_CIDR_STARTS_WITH)
  private String cidrStartsWith;

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

  public static final String SERIALIZED_NAME_FLOATING_IP_CIDR = "floating_ip_cidr";
  @SerializedName(SERIALIZED_NAME_FLOATING_IP_CIDR)
  private String floatingIpCidr;

  public static final String SERIALIZED_NAME_FLOATING_IP_CIDR_CONTAINS = "floating_ip_cidr_contains";
  @SerializedName(SERIALIZED_NAME_FLOATING_IP_CIDR_CONTAINS)
  private String floatingIpCidrContains;

  public static final String SERIALIZED_NAME_FLOATING_IP_CIDR_ENDS_WITH = "floating_ip_cidr_ends_with";
  @SerializedName(SERIALIZED_NAME_FLOATING_IP_CIDR_ENDS_WITH)
  private String floatingIpCidrEndsWith;

  public static final String SERIALIZED_NAME_FLOATING_IP_CIDR_GT = "floating_ip_cidr_gt";
  @SerializedName(SERIALIZED_NAME_FLOATING_IP_CIDR_GT)
  private String floatingIpCidrGt;

  public static final String SERIALIZED_NAME_FLOATING_IP_CIDR_GTE = "floating_ip_cidr_gte";
  @SerializedName(SERIALIZED_NAME_FLOATING_IP_CIDR_GTE)
  private String floatingIpCidrGte;

  public static final String SERIALIZED_NAME_FLOATING_IP_CIDR_IN = "floating_ip_cidr_in";
  @SerializedName(SERIALIZED_NAME_FLOATING_IP_CIDR_IN)
  private List<String> floatingIpCidrIn = null;

  public static final String SERIALIZED_NAME_FLOATING_IP_CIDR_LT = "floating_ip_cidr_lt";
  @SerializedName(SERIALIZED_NAME_FLOATING_IP_CIDR_LT)
  private String floatingIpCidrLt;

  public static final String SERIALIZED_NAME_FLOATING_IP_CIDR_LTE = "floating_ip_cidr_lte";
  @SerializedName(SERIALIZED_NAME_FLOATING_IP_CIDR_LTE)
  private String floatingIpCidrLte;

  public static final String SERIALIZED_NAME_FLOATING_IP_CIDR_NOT = "floating_ip_cidr_not";
  @SerializedName(SERIALIZED_NAME_FLOATING_IP_CIDR_NOT)
  private String floatingIpCidrNot;

  public static final String SERIALIZED_NAME_FLOATING_IP_CIDR_NOT_CONTAINS = "floating_ip_cidr_not_contains";
  @SerializedName(SERIALIZED_NAME_FLOATING_IP_CIDR_NOT_CONTAINS)
  private String floatingIpCidrNotContains;

  public static final String SERIALIZED_NAME_FLOATING_IP_CIDR_NOT_ENDS_WITH = "floating_ip_cidr_not_ends_with";
  @SerializedName(SERIALIZED_NAME_FLOATING_IP_CIDR_NOT_ENDS_WITH)
  private String floatingIpCidrNotEndsWith;

  public static final String SERIALIZED_NAME_FLOATING_IP_CIDR_NOT_IN = "floating_ip_cidr_not_in";
  @SerializedName(SERIALIZED_NAME_FLOATING_IP_CIDR_NOT_IN)
  private List<String> floatingIpCidrNotIn = null;

  public static final String SERIALIZED_NAME_FLOATING_IP_CIDR_NOT_STARTS_WITH = "floating_ip_cidr_not_starts_with";
  @SerializedName(SERIALIZED_NAME_FLOATING_IP_CIDR_NOT_STARTS_WITH)
  private String floatingIpCidrNotStartsWith;

  public static final String SERIALIZED_NAME_FLOATING_IP_CIDR_STARTS_WITH = "floating_ip_cidr_starts_with";
  @SerializedName(SERIALIZED_NAME_FLOATING_IP_CIDR_STARTS_WITH)
  private String floatingIpCidrStartsWith;

  public static final String SERIALIZED_NAME_FLOATING_IPS_EVERY = "floating_ips_every";
  @SerializedName(SERIALIZED_NAME_FLOATING_IPS_EVERY)
  private VirtualPrivateCloudFloatingIpWhereInput floatingIpsEvery;

  public static final String SERIALIZED_NAME_FLOATING_IPS_NONE = "floating_ips_none";
  @SerializedName(SERIALIZED_NAME_FLOATING_IPS_NONE)
  private VirtualPrivateCloudFloatingIpWhereInput floatingIpsNone;

  public static final String SERIALIZED_NAME_FLOATING_IPS_SOME = "floating_ips_some";
  @SerializedName(SERIALIZED_NAME_FLOATING_IPS_SOME)
  private VirtualPrivateCloudFloatingIpWhereInput floatingIpsSome;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_GATEWAY_CONTAINS = "gateway_contains";
  @SerializedName(SERIALIZED_NAME_GATEWAY_CONTAINS)
  private String gatewayContains;

  public static final String SERIALIZED_NAME_GATEWAY_ENDS_WITH = "gateway_ends_with";
  @SerializedName(SERIALIZED_NAME_GATEWAY_ENDS_WITH)
  private String gatewayEndsWith;

  public static final String SERIALIZED_NAME_GATEWAY_GT = "gateway_gt";
  @SerializedName(SERIALIZED_NAME_GATEWAY_GT)
  private String gatewayGt;

  public static final String SERIALIZED_NAME_GATEWAY_GTE = "gateway_gte";
  @SerializedName(SERIALIZED_NAME_GATEWAY_GTE)
  private String gatewayGte;

  public static final String SERIALIZED_NAME_GATEWAY_IN = "gateway_in";
  @SerializedName(SERIALIZED_NAME_GATEWAY_IN)
  private List<String> gatewayIn = null;

  public static final String SERIALIZED_NAME_GATEWAY_LT = "gateway_lt";
  @SerializedName(SERIALIZED_NAME_GATEWAY_LT)
  private String gatewayLt;

  public static final String SERIALIZED_NAME_GATEWAY_LTE = "gateway_lte";
  @SerializedName(SERIALIZED_NAME_GATEWAY_LTE)
  private String gatewayLte;

  public static final String SERIALIZED_NAME_GATEWAY_NOT = "gateway_not";
  @SerializedName(SERIALIZED_NAME_GATEWAY_NOT)
  private String gatewayNot;

  public static final String SERIALIZED_NAME_GATEWAY_NOT_CONTAINS = "gateway_not_contains";
  @SerializedName(SERIALIZED_NAME_GATEWAY_NOT_CONTAINS)
  private String gatewayNotContains;

  public static final String SERIALIZED_NAME_GATEWAY_NOT_ENDS_WITH = "gateway_not_ends_with";
  @SerializedName(SERIALIZED_NAME_GATEWAY_NOT_ENDS_WITH)
  private String gatewayNotEndsWith;

  public static final String SERIALIZED_NAME_GATEWAY_NOT_IN = "gateway_not_in";
  @SerializedName(SERIALIZED_NAME_GATEWAY_NOT_IN)
  private List<String> gatewayNotIn = null;

  public static final String SERIALIZED_NAME_GATEWAY_NOT_STARTS_WITH = "gateway_not_starts_with";
  @SerializedName(SERIALIZED_NAME_GATEWAY_NOT_STARTS_WITH)
  private String gatewayNotStartsWith;

  public static final String SERIALIZED_NAME_GATEWAY_STARTS_WITH = "gateway_starts_with";
  @SerializedName(SERIALIZED_NAME_GATEWAY_STARTS_WITH)
  private String gatewayStartsWith;

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

  public static final String SERIALIZED_NAME_NAT_GATEWAY_CIDR = "nat_gateway_cidr";
  @SerializedName(SERIALIZED_NAME_NAT_GATEWAY_CIDR)
  private String natGatewayCidr;

  public static final String SERIALIZED_NAME_NAT_GATEWAY_CIDR_CONTAINS = "nat_gateway_cidr_contains";
  @SerializedName(SERIALIZED_NAME_NAT_GATEWAY_CIDR_CONTAINS)
  private String natGatewayCidrContains;

  public static final String SERIALIZED_NAME_NAT_GATEWAY_CIDR_ENDS_WITH = "nat_gateway_cidr_ends_with";
  @SerializedName(SERIALIZED_NAME_NAT_GATEWAY_CIDR_ENDS_WITH)
  private String natGatewayCidrEndsWith;

  public static final String SERIALIZED_NAME_NAT_GATEWAY_CIDR_GT = "nat_gateway_cidr_gt";
  @SerializedName(SERIALIZED_NAME_NAT_GATEWAY_CIDR_GT)
  private String natGatewayCidrGt;

  public static final String SERIALIZED_NAME_NAT_GATEWAY_CIDR_GTE = "nat_gateway_cidr_gte";
  @SerializedName(SERIALIZED_NAME_NAT_GATEWAY_CIDR_GTE)
  private String natGatewayCidrGte;

  public static final String SERIALIZED_NAME_NAT_GATEWAY_CIDR_IN = "nat_gateway_cidr_in";
  @SerializedName(SERIALIZED_NAME_NAT_GATEWAY_CIDR_IN)
  private List<String> natGatewayCidrIn = null;

  public static final String SERIALIZED_NAME_NAT_GATEWAY_CIDR_LT = "nat_gateway_cidr_lt";
  @SerializedName(SERIALIZED_NAME_NAT_GATEWAY_CIDR_LT)
  private String natGatewayCidrLt;

  public static final String SERIALIZED_NAME_NAT_GATEWAY_CIDR_LTE = "nat_gateway_cidr_lte";
  @SerializedName(SERIALIZED_NAME_NAT_GATEWAY_CIDR_LTE)
  private String natGatewayCidrLte;

  public static final String SERIALIZED_NAME_NAT_GATEWAY_CIDR_NOT = "nat_gateway_cidr_not";
  @SerializedName(SERIALIZED_NAME_NAT_GATEWAY_CIDR_NOT)
  private String natGatewayCidrNot;

  public static final String SERIALIZED_NAME_NAT_GATEWAY_CIDR_NOT_CONTAINS = "nat_gateway_cidr_not_contains";
  @SerializedName(SERIALIZED_NAME_NAT_GATEWAY_CIDR_NOT_CONTAINS)
  private String natGatewayCidrNotContains;

  public static final String SERIALIZED_NAME_NAT_GATEWAY_CIDR_NOT_ENDS_WITH = "nat_gateway_cidr_not_ends_with";
  @SerializedName(SERIALIZED_NAME_NAT_GATEWAY_CIDR_NOT_ENDS_WITH)
  private String natGatewayCidrNotEndsWith;

  public static final String SERIALIZED_NAME_NAT_GATEWAY_CIDR_NOT_IN = "nat_gateway_cidr_not_in";
  @SerializedName(SERIALIZED_NAME_NAT_GATEWAY_CIDR_NOT_IN)
  private List<String> natGatewayCidrNotIn = null;

  public static final String SERIALIZED_NAME_NAT_GATEWAY_CIDR_NOT_STARTS_WITH = "nat_gateway_cidr_not_starts_with";
  @SerializedName(SERIALIZED_NAME_NAT_GATEWAY_CIDR_NOT_STARTS_WITH)
  private String natGatewayCidrNotStartsWith;

  public static final String SERIALIZED_NAME_NAT_GATEWAY_CIDR_STARTS_WITH = "nat_gateway_cidr_starts_with";
  @SerializedName(SERIALIZED_NAME_NAT_GATEWAY_CIDR_STARTS_WITH)
  private String natGatewayCidrStartsWith;

  public static final String SERIALIZED_NAME_NAT_GATEWAYS_EVERY = "nat_gateways_every";
  @SerializedName(SERIALIZED_NAME_NAT_GATEWAYS_EVERY)
  private VirtualPrivateCloudNatGatewayWhereInput natGatewaysEvery;

  public static final String SERIALIZED_NAME_NAT_GATEWAYS_NONE = "nat_gateways_none";
  @SerializedName(SERIALIZED_NAME_NAT_GATEWAYS_NONE)
  private VirtualPrivateCloudNatGatewayWhereInput natGatewaysNone;

  public static final String SERIALIZED_NAME_NAT_GATEWAYS_SOME = "nat_gateways_some";
  @SerializedName(SERIALIZED_NAME_NAT_GATEWAYS_SOME)
  private VirtualPrivateCloudNatGatewayWhereInput natGatewaysSome;

  public static final String SERIALIZED_NAME_ROUTER_GATEWAY_CIDR = "router_gateway_cidr";
  @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR)
  private String routerGatewayCidr;

  public static final String SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_CONTAINS = "router_gateway_cidr_contains";
  @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_CONTAINS)
  private String routerGatewayCidrContains;

  public static final String SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_ENDS_WITH = "router_gateway_cidr_ends_with";
  @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_ENDS_WITH)
  private String routerGatewayCidrEndsWith;

  public static final String SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_GT = "router_gateway_cidr_gt";
  @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_GT)
  private String routerGatewayCidrGt;

  public static final String SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_GTE = "router_gateway_cidr_gte";
  @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_GTE)
  private String routerGatewayCidrGte;

  public static final String SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_IN = "router_gateway_cidr_in";
  @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_IN)
  private List<String> routerGatewayCidrIn = null;

  public static final String SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_LT = "router_gateway_cidr_lt";
  @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_LT)
  private String routerGatewayCidrLt;

  public static final String SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_LTE = "router_gateway_cidr_lte";
  @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_LTE)
  private String routerGatewayCidrLte;

  public static final String SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_NOT = "router_gateway_cidr_not";
  @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_NOT)
  private String routerGatewayCidrNot;

  public static final String SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_NOT_CONTAINS = "router_gateway_cidr_not_contains";
  @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_NOT_CONTAINS)
  private String routerGatewayCidrNotContains;

  public static final String SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_NOT_ENDS_WITH = "router_gateway_cidr_not_ends_with";
  @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_NOT_ENDS_WITH)
  private String routerGatewayCidrNotEndsWith;

  public static final String SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_NOT_IN = "router_gateway_cidr_not_in";
  @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_NOT_IN)
  private List<String> routerGatewayCidrNotIn = null;

  public static final String SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_NOT_STARTS_WITH = "router_gateway_cidr_not_starts_with";
  @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_NOT_STARTS_WITH)
  private String routerGatewayCidrNotStartsWith;

  public static final String SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_STARTS_WITH = "router_gateway_cidr_starts_with";
  @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR_STARTS_WITH)
  private String routerGatewayCidrStartsWith;

  public static final String SERIALIZED_NAME_ROUTER_GATEWAYS_EVERY = "router_gateways_every";
  @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAYS_EVERY)
  private VirtualPrivateCloudRouterGatewayWhereInput routerGatewaysEvery;

  public static final String SERIALIZED_NAME_ROUTER_GATEWAYS_NONE = "router_gateways_none";
  @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAYS_NONE)
  private VirtualPrivateCloudRouterGatewayWhereInput routerGatewaysNone;

  public static final String SERIALIZED_NAME_ROUTER_GATEWAYS_SOME = "router_gateways_some";
  @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAYS_SOME)
  private VirtualPrivateCloudRouterGatewayWhereInput routerGatewaysSome;

  public static final String SERIALIZED_NAME_VLAN = "vlan";
  @SerializedName(SERIALIZED_NAME_VLAN)
  private VlanWhereInput vlan;

  public static final String SERIALIZED_NAME_VPC = "vpc";
  @SerializedName(SERIALIZED_NAME_VPC)
  private VirtualPrivateCloudWhereInput vpc;

  public VirtualPrivateCloudExternalSubnetWhereInput() { 
  }

  public VirtualPrivateCloudExternalSubnetWhereInput AND(List<VirtualPrivateCloudExternalSubnetWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addANDItem(VirtualPrivateCloudExternalSubnetWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<VirtualPrivateCloudExternalSubnetWhereInput>();
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

  public List<VirtualPrivateCloudExternalSubnetWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<VirtualPrivateCloudExternalSubnetWhereInput> AND) {
    this.AND = AND;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput NOT(List<VirtualPrivateCloudExternalSubnetWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addNOTItem(VirtualPrivateCloudExternalSubnetWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<VirtualPrivateCloudExternalSubnetWhereInput>();
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

  public List<VirtualPrivateCloudExternalSubnetWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<VirtualPrivateCloudExternalSubnetWhereInput> NOT) {
    this.NOT = NOT;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput OR(List<VirtualPrivateCloudExternalSubnetWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addORItem(VirtualPrivateCloudExternalSubnetWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<VirtualPrivateCloudExternalSubnetWhereInput>();
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

  public List<VirtualPrivateCloudExternalSubnetWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<VirtualPrivateCloudExternalSubnetWhereInput> OR) {
    this.OR = OR;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput cidr(String cidr) {
    
    this.cidr = cidr;
    return this;
  }

   /**
   * Get cidr
   * @return cidr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCidr() {
    return cidr;
  }


  public void setCidr(String cidr) {
    this.cidr = cidr;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput cidrContains(String cidrContains) {
    
    this.cidrContains = cidrContains;
    return this;
  }

   /**
   * Get cidrContains
   * @return cidrContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCidrContains() {
    return cidrContains;
  }


  public void setCidrContains(String cidrContains) {
    this.cidrContains = cidrContains;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput cidrEndsWith(String cidrEndsWith) {
    
    this.cidrEndsWith = cidrEndsWith;
    return this;
  }

   /**
   * Get cidrEndsWith
   * @return cidrEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCidrEndsWith() {
    return cidrEndsWith;
  }


  public void setCidrEndsWith(String cidrEndsWith) {
    this.cidrEndsWith = cidrEndsWith;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput cidrGt(String cidrGt) {
    
    this.cidrGt = cidrGt;
    return this;
  }

   /**
   * Get cidrGt
   * @return cidrGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCidrGt() {
    return cidrGt;
  }


  public void setCidrGt(String cidrGt) {
    this.cidrGt = cidrGt;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput cidrGte(String cidrGte) {
    
    this.cidrGte = cidrGte;
    return this;
  }

   /**
   * Get cidrGte
   * @return cidrGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCidrGte() {
    return cidrGte;
  }


  public void setCidrGte(String cidrGte) {
    this.cidrGte = cidrGte;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput cidrIn(List<String> cidrIn) {
    
    this.cidrIn = cidrIn;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addCidrInItem(String cidrInItem) {
    if (this.cidrIn == null) {
      this.cidrIn = new ArrayList<String>();
    }
    this.cidrIn.add(cidrInItem);
    return this;
  }

   /**
   * Get cidrIn
   * @return cidrIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCidrIn() {
    return cidrIn;
  }


  public void setCidrIn(List<String> cidrIn) {
    this.cidrIn = cidrIn;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput cidrLt(String cidrLt) {
    
    this.cidrLt = cidrLt;
    return this;
  }

   /**
   * Get cidrLt
   * @return cidrLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCidrLt() {
    return cidrLt;
  }


  public void setCidrLt(String cidrLt) {
    this.cidrLt = cidrLt;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput cidrLte(String cidrLte) {
    
    this.cidrLte = cidrLte;
    return this;
  }

   /**
   * Get cidrLte
   * @return cidrLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCidrLte() {
    return cidrLte;
  }


  public void setCidrLte(String cidrLte) {
    this.cidrLte = cidrLte;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput cidrNot(String cidrNot) {
    
    this.cidrNot = cidrNot;
    return this;
  }

   /**
   * Get cidrNot
   * @return cidrNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCidrNot() {
    return cidrNot;
  }


  public void setCidrNot(String cidrNot) {
    this.cidrNot = cidrNot;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput cidrNotContains(String cidrNotContains) {
    
    this.cidrNotContains = cidrNotContains;
    return this;
  }

   /**
   * Get cidrNotContains
   * @return cidrNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCidrNotContains() {
    return cidrNotContains;
  }


  public void setCidrNotContains(String cidrNotContains) {
    this.cidrNotContains = cidrNotContains;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput cidrNotEndsWith(String cidrNotEndsWith) {
    
    this.cidrNotEndsWith = cidrNotEndsWith;
    return this;
  }

   /**
   * Get cidrNotEndsWith
   * @return cidrNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCidrNotEndsWith() {
    return cidrNotEndsWith;
  }


  public void setCidrNotEndsWith(String cidrNotEndsWith) {
    this.cidrNotEndsWith = cidrNotEndsWith;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput cidrNotIn(List<String> cidrNotIn) {
    
    this.cidrNotIn = cidrNotIn;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addCidrNotInItem(String cidrNotInItem) {
    if (this.cidrNotIn == null) {
      this.cidrNotIn = new ArrayList<String>();
    }
    this.cidrNotIn.add(cidrNotInItem);
    return this;
  }

   /**
   * Get cidrNotIn
   * @return cidrNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCidrNotIn() {
    return cidrNotIn;
  }


  public void setCidrNotIn(List<String> cidrNotIn) {
    this.cidrNotIn = cidrNotIn;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput cidrNotStartsWith(String cidrNotStartsWith) {
    
    this.cidrNotStartsWith = cidrNotStartsWith;
    return this;
  }

   /**
   * Get cidrNotStartsWith
   * @return cidrNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCidrNotStartsWith() {
    return cidrNotStartsWith;
  }


  public void setCidrNotStartsWith(String cidrNotStartsWith) {
    this.cidrNotStartsWith = cidrNotStartsWith;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput cidrStartsWith(String cidrStartsWith) {
    
    this.cidrStartsWith = cidrStartsWith;
    return this;
  }

   /**
   * Get cidrStartsWith
   * @return cidrStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCidrStartsWith() {
    return cidrStartsWith;
  }


  public void setCidrStartsWith(String cidrStartsWith) {
    this.cidrStartsWith = cidrStartsWith;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput description(String description) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput descriptionContains(String descriptionContains) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput descriptionEndsWith(String descriptionEndsWith) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput descriptionGt(String descriptionGt) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput descriptionGte(String descriptionGte) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput descriptionIn(List<String> descriptionIn) {
    
    this.descriptionIn = descriptionIn;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addDescriptionInItem(String descriptionInItem) {
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


  public VirtualPrivateCloudExternalSubnetWhereInput descriptionLt(String descriptionLt) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput descriptionLte(String descriptionLte) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput descriptionNot(String descriptionNot) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput descriptionNotContains(String descriptionNotContains) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput descriptionNotIn(List<String> descriptionNotIn) {
    
    this.descriptionNotIn = descriptionNotIn;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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


  public VirtualPrivateCloudExternalSubnetWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput descriptionStartsWith(String descriptionStartsWith) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public VirtualPrivateCloudExternalSubnetWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public VirtualPrivateCloudExternalSubnetWhereInput floatingIpCidr(String floatingIpCidr) {
    
    this.floatingIpCidr = floatingIpCidr;
    return this;
  }

   /**
   * Get floatingIpCidr
   * @return floatingIpCidr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFloatingIpCidr() {
    return floatingIpCidr;
  }


  public void setFloatingIpCidr(String floatingIpCidr) {
    this.floatingIpCidr = floatingIpCidr;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput floatingIpCidrContains(String floatingIpCidrContains) {
    
    this.floatingIpCidrContains = floatingIpCidrContains;
    return this;
  }

   /**
   * Get floatingIpCidrContains
   * @return floatingIpCidrContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFloatingIpCidrContains() {
    return floatingIpCidrContains;
  }


  public void setFloatingIpCidrContains(String floatingIpCidrContains) {
    this.floatingIpCidrContains = floatingIpCidrContains;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput floatingIpCidrEndsWith(String floatingIpCidrEndsWith) {
    
    this.floatingIpCidrEndsWith = floatingIpCidrEndsWith;
    return this;
  }

   /**
   * Get floatingIpCidrEndsWith
   * @return floatingIpCidrEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFloatingIpCidrEndsWith() {
    return floatingIpCidrEndsWith;
  }


  public void setFloatingIpCidrEndsWith(String floatingIpCidrEndsWith) {
    this.floatingIpCidrEndsWith = floatingIpCidrEndsWith;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput floatingIpCidrGt(String floatingIpCidrGt) {
    
    this.floatingIpCidrGt = floatingIpCidrGt;
    return this;
  }

   /**
   * Get floatingIpCidrGt
   * @return floatingIpCidrGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFloatingIpCidrGt() {
    return floatingIpCidrGt;
  }


  public void setFloatingIpCidrGt(String floatingIpCidrGt) {
    this.floatingIpCidrGt = floatingIpCidrGt;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput floatingIpCidrGte(String floatingIpCidrGte) {
    
    this.floatingIpCidrGte = floatingIpCidrGte;
    return this;
  }

   /**
   * Get floatingIpCidrGte
   * @return floatingIpCidrGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFloatingIpCidrGte() {
    return floatingIpCidrGte;
  }


  public void setFloatingIpCidrGte(String floatingIpCidrGte) {
    this.floatingIpCidrGte = floatingIpCidrGte;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput floatingIpCidrIn(List<String> floatingIpCidrIn) {
    
    this.floatingIpCidrIn = floatingIpCidrIn;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addFloatingIpCidrInItem(String floatingIpCidrInItem) {
    if (this.floatingIpCidrIn == null) {
      this.floatingIpCidrIn = new ArrayList<String>();
    }
    this.floatingIpCidrIn.add(floatingIpCidrInItem);
    return this;
  }

   /**
   * Get floatingIpCidrIn
   * @return floatingIpCidrIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getFloatingIpCidrIn() {
    return floatingIpCidrIn;
  }


  public void setFloatingIpCidrIn(List<String> floatingIpCidrIn) {
    this.floatingIpCidrIn = floatingIpCidrIn;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput floatingIpCidrLt(String floatingIpCidrLt) {
    
    this.floatingIpCidrLt = floatingIpCidrLt;
    return this;
  }

   /**
   * Get floatingIpCidrLt
   * @return floatingIpCidrLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFloatingIpCidrLt() {
    return floatingIpCidrLt;
  }


  public void setFloatingIpCidrLt(String floatingIpCidrLt) {
    this.floatingIpCidrLt = floatingIpCidrLt;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput floatingIpCidrLte(String floatingIpCidrLte) {
    
    this.floatingIpCidrLte = floatingIpCidrLte;
    return this;
  }

   /**
   * Get floatingIpCidrLte
   * @return floatingIpCidrLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFloatingIpCidrLte() {
    return floatingIpCidrLte;
  }


  public void setFloatingIpCidrLte(String floatingIpCidrLte) {
    this.floatingIpCidrLte = floatingIpCidrLte;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput floatingIpCidrNot(String floatingIpCidrNot) {
    
    this.floatingIpCidrNot = floatingIpCidrNot;
    return this;
  }

   /**
   * Get floatingIpCidrNot
   * @return floatingIpCidrNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFloatingIpCidrNot() {
    return floatingIpCidrNot;
  }


  public void setFloatingIpCidrNot(String floatingIpCidrNot) {
    this.floatingIpCidrNot = floatingIpCidrNot;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput floatingIpCidrNotContains(String floatingIpCidrNotContains) {
    
    this.floatingIpCidrNotContains = floatingIpCidrNotContains;
    return this;
  }

   /**
   * Get floatingIpCidrNotContains
   * @return floatingIpCidrNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFloatingIpCidrNotContains() {
    return floatingIpCidrNotContains;
  }


  public void setFloatingIpCidrNotContains(String floatingIpCidrNotContains) {
    this.floatingIpCidrNotContains = floatingIpCidrNotContains;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput floatingIpCidrNotEndsWith(String floatingIpCidrNotEndsWith) {
    
    this.floatingIpCidrNotEndsWith = floatingIpCidrNotEndsWith;
    return this;
  }

   /**
   * Get floatingIpCidrNotEndsWith
   * @return floatingIpCidrNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFloatingIpCidrNotEndsWith() {
    return floatingIpCidrNotEndsWith;
  }


  public void setFloatingIpCidrNotEndsWith(String floatingIpCidrNotEndsWith) {
    this.floatingIpCidrNotEndsWith = floatingIpCidrNotEndsWith;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput floatingIpCidrNotIn(List<String> floatingIpCidrNotIn) {
    
    this.floatingIpCidrNotIn = floatingIpCidrNotIn;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addFloatingIpCidrNotInItem(String floatingIpCidrNotInItem) {
    if (this.floatingIpCidrNotIn == null) {
      this.floatingIpCidrNotIn = new ArrayList<String>();
    }
    this.floatingIpCidrNotIn.add(floatingIpCidrNotInItem);
    return this;
  }

   /**
   * Get floatingIpCidrNotIn
   * @return floatingIpCidrNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getFloatingIpCidrNotIn() {
    return floatingIpCidrNotIn;
  }


  public void setFloatingIpCidrNotIn(List<String> floatingIpCidrNotIn) {
    this.floatingIpCidrNotIn = floatingIpCidrNotIn;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput floatingIpCidrNotStartsWith(String floatingIpCidrNotStartsWith) {
    
    this.floatingIpCidrNotStartsWith = floatingIpCidrNotStartsWith;
    return this;
  }

   /**
   * Get floatingIpCidrNotStartsWith
   * @return floatingIpCidrNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFloatingIpCidrNotStartsWith() {
    return floatingIpCidrNotStartsWith;
  }


  public void setFloatingIpCidrNotStartsWith(String floatingIpCidrNotStartsWith) {
    this.floatingIpCidrNotStartsWith = floatingIpCidrNotStartsWith;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput floatingIpCidrStartsWith(String floatingIpCidrStartsWith) {
    
    this.floatingIpCidrStartsWith = floatingIpCidrStartsWith;
    return this;
  }

   /**
   * Get floatingIpCidrStartsWith
   * @return floatingIpCidrStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFloatingIpCidrStartsWith() {
    return floatingIpCidrStartsWith;
  }


  public void setFloatingIpCidrStartsWith(String floatingIpCidrStartsWith) {
    this.floatingIpCidrStartsWith = floatingIpCidrStartsWith;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput floatingIpsEvery(VirtualPrivateCloudFloatingIpWhereInput floatingIpsEvery) {
    
    this.floatingIpsEvery = floatingIpsEvery;
    return this;
  }

   /**
   * Get floatingIpsEvery
   * @return floatingIpsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudFloatingIpWhereInput getFloatingIpsEvery() {
    return floatingIpsEvery;
  }


  public void setFloatingIpsEvery(VirtualPrivateCloudFloatingIpWhereInput floatingIpsEvery) {
    this.floatingIpsEvery = floatingIpsEvery;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput floatingIpsNone(VirtualPrivateCloudFloatingIpWhereInput floatingIpsNone) {
    
    this.floatingIpsNone = floatingIpsNone;
    return this;
  }

   /**
   * Get floatingIpsNone
   * @return floatingIpsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudFloatingIpWhereInput getFloatingIpsNone() {
    return floatingIpsNone;
  }


  public void setFloatingIpsNone(VirtualPrivateCloudFloatingIpWhereInput floatingIpsNone) {
    this.floatingIpsNone = floatingIpsNone;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput floatingIpsSome(VirtualPrivateCloudFloatingIpWhereInput floatingIpsSome) {
    
    this.floatingIpsSome = floatingIpsSome;
    return this;
  }

   /**
   * Get floatingIpsSome
   * @return floatingIpsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudFloatingIpWhereInput getFloatingIpsSome() {
    return floatingIpsSome;
  }


  public void setFloatingIpsSome(VirtualPrivateCloudFloatingIpWhereInput floatingIpsSome) {
    this.floatingIpsSome = floatingIpsSome;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput gateway(String gateway) {
    
    this.gateway = gateway;
    return this;
  }

   /**
   * Get gateway
   * @return gateway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGateway() {
    return gateway;
  }


  public void setGateway(String gateway) {
    this.gateway = gateway;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput gatewayContains(String gatewayContains) {
    
    this.gatewayContains = gatewayContains;
    return this;
  }

   /**
   * Get gatewayContains
   * @return gatewayContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayContains() {
    return gatewayContains;
  }


  public void setGatewayContains(String gatewayContains) {
    this.gatewayContains = gatewayContains;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput gatewayEndsWith(String gatewayEndsWith) {
    
    this.gatewayEndsWith = gatewayEndsWith;
    return this;
  }

   /**
   * Get gatewayEndsWith
   * @return gatewayEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayEndsWith() {
    return gatewayEndsWith;
  }


  public void setGatewayEndsWith(String gatewayEndsWith) {
    this.gatewayEndsWith = gatewayEndsWith;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput gatewayGt(String gatewayGt) {
    
    this.gatewayGt = gatewayGt;
    return this;
  }

   /**
   * Get gatewayGt
   * @return gatewayGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayGt() {
    return gatewayGt;
  }


  public void setGatewayGt(String gatewayGt) {
    this.gatewayGt = gatewayGt;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput gatewayGte(String gatewayGte) {
    
    this.gatewayGte = gatewayGte;
    return this;
  }

   /**
   * Get gatewayGte
   * @return gatewayGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayGte() {
    return gatewayGte;
  }


  public void setGatewayGte(String gatewayGte) {
    this.gatewayGte = gatewayGte;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput gatewayIn(List<String> gatewayIn) {
    
    this.gatewayIn = gatewayIn;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addGatewayInItem(String gatewayInItem) {
    if (this.gatewayIn == null) {
      this.gatewayIn = new ArrayList<String>();
    }
    this.gatewayIn.add(gatewayInItem);
    return this;
  }

   /**
   * Get gatewayIn
   * @return gatewayIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getGatewayIn() {
    return gatewayIn;
  }


  public void setGatewayIn(List<String> gatewayIn) {
    this.gatewayIn = gatewayIn;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput gatewayLt(String gatewayLt) {
    
    this.gatewayLt = gatewayLt;
    return this;
  }

   /**
   * Get gatewayLt
   * @return gatewayLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayLt() {
    return gatewayLt;
  }


  public void setGatewayLt(String gatewayLt) {
    this.gatewayLt = gatewayLt;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput gatewayLte(String gatewayLte) {
    
    this.gatewayLte = gatewayLte;
    return this;
  }

   /**
   * Get gatewayLte
   * @return gatewayLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayLte() {
    return gatewayLte;
  }


  public void setGatewayLte(String gatewayLte) {
    this.gatewayLte = gatewayLte;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput gatewayNot(String gatewayNot) {
    
    this.gatewayNot = gatewayNot;
    return this;
  }

   /**
   * Get gatewayNot
   * @return gatewayNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayNot() {
    return gatewayNot;
  }


  public void setGatewayNot(String gatewayNot) {
    this.gatewayNot = gatewayNot;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput gatewayNotContains(String gatewayNotContains) {
    
    this.gatewayNotContains = gatewayNotContains;
    return this;
  }

   /**
   * Get gatewayNotContains
   * @return gatewayNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayNotContains() {
    return gatewayNotContains;
  }


  public void setGatewayNotContains(String gatewayNotContains) {
    this.gatewayNotContains = gatewayNotContains;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput gatewayNotEndsWith(String gatewayNotEndsWith) {
    
    this.gatewayNotEndsWith = gatewayNotEndsWith;
    return this;
  }

   /**
   * Get gatewayNotEndsWith
   * @return gatewayNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayNotEndsWith() {
    return gatewayNotEndsWith;
  }


  public void setGatewayNotEndsWith(String gatewayNotEndsWith) {
    this.gatewayNotEndsWith = gatewayNotEndsWith;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput gatewayNotIn(List<String> gatewayNotIn) {
    
    this.gatewayNotIn = gatewayNotIn;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addGatewayNotInItem(String gatewayNotInItem) {
    if (this.gatewayNotIn == null) {
      this.gatewayNotIn = new ArrayList<String>();
    }
    this.gatewayNotIn.add(gatewayNotInItem);
    return this;
  }

   /**
   * Get gatewayNotIn
   * @return gatewayNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getGatewayNotIn() {
    return gatewayNotIn;
  }


  public void setGatewayNotIn(List<String> gatewayNotIn) {
    this.gatewayNotIn = gatewayNotIn;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput gatewayNotStartsWith(String gatewayNotStartsWith) {
    
    this.gatewayNotStartsWith = gatewayNotStartsWith;
    return this;
  }

   /**
   * Get gatewayNotStartsWith
   * @return gatewayNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayNotStartsWith() {
    return gatewayNotStartsWith;
  }


  public void setGatewayNotStartsWith(String gatewayNotStartsWith) {
    this.gatewayNotStartsWith = gatewayNotStartsWith;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput gatewayStartsWith(String gatewayStartsWith) {
    
    this.gatewayStartsWith = gatewayStartsWith;
    return this;
  }

   /**
   * Get gatewayStartsWith
   * @return gatewayStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayStartsWith() {
    return gatewayStartsWith;
  }


  public void setGatewayStartsWith(String gatewayStartsWith) {
    this.gatewayStartsWith = gatewayStartsWith;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput id(String id) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput idContains(String idContains) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput idEndsWith(String idEndsWith) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput idGt(String idGt) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput idGte(String idGte) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addIdInItem(String idInItem) {
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


  public VirtualPrivateCloudExternalSubnetWhereInput idLt(String idLt) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput idLte(String idLte) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput idNot(String idNot) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput idNotContains(String idNotContains) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addIdNotInItem(String idNotInItem) {
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


  public VirtualPrivateCloudExternalSubnetWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput idStartsWith(String idStartsWith) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput localId(String localId) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput localIdContains(String localIdContains) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput localIdGt(String localIdGt) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput localIdGte(String localIdGte) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addLocalIdInItem(String localIdInItem) {
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


  public VirtualPrivateCloudExternalSubnetWhereInput localIdLt(String localIdLt) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput localIdLte(String localIdLte) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput localIdNot(String localIdNot) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public VirtualPrivateCloudExternalSubnetWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput name(String name) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput nameContains(String nameContains) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput nameGt(String nameGt) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput nameGte(String nameGte) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addNameInItem(String nameInItem) {
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


  public VirtualPrivateCloudExternalSubnetWhereInput nameLt(String nameLt) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput nameLte(String nameLte) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput nameNot(String nameNot) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput nameNotContains(String nameNotContains) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addNameNotInItem(String nameNotInItem) {
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


  public VirtualPrivateCloudExternalSubnetWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput natGatewayCidr(String natGatewayCidr) {
    
    this.natGatewayCidr = natGatewayCidr;
    return this;
  }

   /**
   * Get natGatewayCidr
   * @return natGatewayCidr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNatGatewayCidr() {
    return natGatewayCidr;
  }


  public void setNatGatewayCidr(String natGatewayCidr) {
    this.natGatewayCidr = natGatewayCidr;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput natGatewayCidrContains(String natGatewayCidrContains) {
    
    this.natGatewayCidrContains = natGatewayCidrContains;
    return this;
  }

   /**
   * Get natGatewayCidrContains
   * @return natGatewayCidrContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNatGatewayCidrContains() {
    return natGatewayCidrContains;
  }


  public void setNatGatewayCidrContains(String natGatewayCidrContains) {
    this.natGatewayCidrContains = natGatewayCidrContains;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput natGatewayCidrEndsWith(String natGatewayCidrEndsWith) {
    
    this.natGatewayCidrEndsWith = natGatewayCidrEndsWith;
    return this;
  }

   /**
   * Get natGatewayCidrEndsWith
   * @return natGatewayCidrEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNatGatewayCidrEndsWith() {
    return natGatewayCidrEndsWith;
  }


  public void setNatGatewayCidrEndsWith(String natGatewayCidrEndsWith) {
    this.natGatewayCidrEndsWith = natGatewayCidrEndsWith;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput natGatewayCidrGt(String natGatewayCidrGt) {
    
    this.natGatewayCidrGt = natGatewayCidrGt;
    return this;
  }

   /**
   * Get natGatewayCidrGt
   * @return natGatewayCidrGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNatGatewayCidrGt() {
    return natGatewayCidrGt;
  }


  public void setNatGatewayCidrGt(String natGatewayCidrGt) {
    this.natGatewayCidrGt = natGatewayCidrGt;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput natGatewayCidrGte(String natGatewayCidrGte) {
    
    this.natGatewayCidrGte = natGatewayCidrGte;
    return this;
  }

   /**
   * Get natGatewayCidrGte
   * @return natGatewayCidrGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNatGatewayCidrGte() {
    return natGatewayCidrGte;
  }


  public void setNatGatewayCidrGte(String natGatewayCidrGte) {
    this.natGatewayCidrGte = natGatewayCidrGte;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput natGatewayCidrIn(List<String> natGatewayCidrIn) {
    
    this.natGatewayCidrIn = natGatewayCidrIn;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addNatGatewayCidrInItem(String natGatewayCidrInItem) {
    if (this.natGatewayCidrIn == null) {
      this.natGatewayCidrIn = new ArrayList<String>();
    }
    this.natGatewayCidrIn.add(natGatewayCidrInItem);
    return this;
  }

   /**
   * Get natGatewayCidrIn
   * @return natGatewayCidrIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNatGatewayCidrIn() {
    return natGatewayCidrIn;
  }


  public void setNatGatewayCidrIn(List<String> natGatewayCidrIn) {
    this.natGatewayCidrIn = natGatewayCidrIn;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput natGatewayCidrLt(String natGatewayCidrLt) {
    
    this.natGatewayCidrLt = natGatewayCidrLt;
    return this;
  }

   /**
   * Get natGatewayCidrLt
   * @return natGatewayCidrLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNatGatewayCidrLt() {
    return natGatewayCidrLt;
  }


  public void setNatGatewayCidrLt(String natGatewayCidrLt) {
    this.natGatewayCidrLt = natGatewayCidrLt;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput natGatewayCidrLte(String natGatewayCidrLte) {
    
    this.natGatewayCidrLte = natGatewayCidrLte;
    return this;
  }

   /**
   * Get natGatewayCidrLte
   * @return natGatewayCidrLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNatGatewayCidrLte() {
    return natGatewayCidrLte;
  }


  public void setNatGatewayCidrLte(String natGatewayCidrLte) {
    this.natGatewayCidrLte = natGatewayCidrLte;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput natGatewayCidrNot(String natGatewayCidrNot) {
    
    this.natGatewayCidrNot = natGatewayCidrNot;
    return this;
  }

   /**
   * Get natGatewayCidrNot
   * @return natGatewayCidrNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNatGatewayCidrNot() {
    return natGatewayCidrNot;
  }


  public void setNatGatewayCidrNot(String natGatewayCidrNot) {
    this.natGatewayCidrNot = natGatewayCidrNot;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput natGatewayCidrNotContains(String natGatewayCidrNotContains) {
    
    this.natGatewayCidrNotContains = natGatewayCidrNotContains;
    return this;
  }

   /**
   * Get natGatewayCidrNotContains
   * @return natGatewayCidrNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNatGatewayCidrNotContains() {
    return natGatewayCidrNotContains;
  }


  public void setNatGatewayCidrNotContains(String natGatewayCidrNotContains) {
    this.natGatewayCidrNotContains = natGatewayCidrNotContains;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput natGatewayCidrNotEndsWith(String natGatewayCidrNotEndsWith) {
    
    this.natGatewayCidrNotEndsWith = natGatewayCidrNotEndsWith;
    return this;
  }

   /**
   * Get natGatewayCidrNotEndsWith
   * @return natGatewayCidrNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNatGatewayCidrNotEndsWith() {
    return natGatewayCidrNotEndsWith;
  }


  public void setNatGatewayCidrNotEndsWith(String natGatewayCidrNotEndsWith) {
    this.natGatewayCidrNotEndsWith = natGatewayCidrNotEndsWith;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput natGatewayCidrNotIn(List<String> natGatewayCidrNotIn) {
    
    this.natGatewayCidrNotIn = natGatewayCidrNotIn;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addNatGatewayCidrNotInItem(String natGatewayCidrNotInItem) {
    if (this.natGatewayCidrNotIn == null) {
      this.natGatewayCidrNotIn = new ArrayList<String>();
    }
    this.natGatewayCidrNotIn.add(natGatewayCidrNotInItem);
    return this;
  }

   /**
   * Get natGatewayCidrNotIn
   * @return natGatewayCidrNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNatGatewayCidrNotIn() {
    return natGatewayCidrNotIn;
  }


  public void setNatGatewayCidrNotIn(List<String> natGatewayCidrNotIn) {
    this.natGatewayCidrNotIn = natGatewayCidrNotIn;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput natGatewayCidrNotStartsWith(String natGatewayCidrNotStartsWith) {
    
    this.natGatewayCidrNotStartsWith = natGatewayCidrNotStartsWith;
    return this;
  }

   /**
   * Get natGatewayCidrNotStartsWith
   * @return natGatewayCidrNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNatGatewayCidrNotStartsWith() {
    return natGatewayCidrNotStartsWith;
  }


  public void setNatGatewayCidrNotStartsWith(String natGatewayCidrNotStartsWith) {
    this.natGatewayCidrNotStartsWith = natGatewayCidrNotStartsWith;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput natGatewayCidrStartsWith(String natGatewayCidrStartsWith) {
    
    this.natGatewayCidrStartsWith = natGatewayCidrStartsWith;
    return this;
  }

   /**
   * Get natGatewayCidrStartsWith
   * @return natGatewayCidrStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNatGatewayCidrStartsWith() {
    return natGatewayCidrStartsWith;
  }


  public void setNatGatewayCidrStartsWith(String natGatewayCidrStartsWith) {
    this.natGatewayCidrStartsWith = natGatewayCidrStartsWith;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput natGatewaysEvery(VirtualPrivateCloudNatGatewayWhereInput natGatewaysEvery) {
    
    this.natGatewaysEvery = natGatewaysEvery;
    return this;
  }

   /**
   * Get natGatewaysEvery
   * @return natGatewaysEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudNatGatewayWhereInput getNatGatewaysEvery() {
    return natGatewaysEvery;
  }


  public void setNatGatewaysEvery(VirtualPrivateCloudNatGatewayWhereInput natGatewaysEvery) {
    this.natGatewaysEvery = natGatewaysEvery;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput natGatewaysNone(VirtualPrivateCloudNatGatewayWhereInput natGatewaysNone) {
    
    this.natGatewaysNone = natGatewaysNone;
    return this;
  }

   /**
   * Get natGatewaysNone
   * @return natGatewaysNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudNatGatewayWhereInput getNatGatewaysNone() {
    return natGatewaysNone;
  }


  public void setNatGatewaysNone(VirtualPrivateCloudNatGatewayWhereInput natGatewaysNone) {
    this.natGatewaysNone = natGatewaysNone;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput natGatewaysSome(VirtualPrivateCloudNatGatewayWhereInput natGatewaysSome) {
    
    this.natGatewaysSome = natGatewaysSome;
    return this;
  }

   /**
   * Get natGatewaysSome
   * @return natGatewaysSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudNatGatewayWhereInput getNatGatewaysSome() {
    return natGatewaysSome;
  }


  public void setNatGatewaysSome(VirtualPrivateCloudNatGatewayWhereInput natGatewaysSome) {
    this.natGatewaysSome = natGatewaysSome;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput routerGatewayCidr(String routerGatewayCidr) {
    
    this.routerGatewayCidr = routerGatewayCidr;
    return this;
  }

   /**
   * Get routerGatewayCidr
   * @return routerGatewayCidr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRouterGatewayCidr() {
    return routerGatewayCidr;
  }


  public void setRouterGatewayCidr(String routerGatewayCidr) {
    this.routerGatewayCidr = routerGatewayCidr;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput routerGatewayCidrContains(String routerGatewayCidrContains) {
    
    this.routerGatewayCidrContains = routerGatewayCidrContains;
    return this;
  }

   /**
   * Get routerGatewayCidrContains
   * @return routerGatewayCidrContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRouterGatewayCidrContains() {
    return routerGatewayCidrContains;
  }


  public void setRouterGatewayCidrContains(String routerGatewayCidrContains) {
    this.routerGatewayCidrContains = routerGatewayCidrContains;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput routerGatewayCidrEndsWith(String routerGatewayCidrEndsWith) {
    
    this.routerGatewayCidrEndsWith = routerGatewayCidrEndsWith;
    return this;
  }

   /**
   * Get routerGatewayCidrEndsWith
   * @return routerGatewayCidrEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRouterGatewayCidrEndsWith() {
    return routerGatewayCidrEndsWith;
  }


  public void setRouterGatewayCidrEndsWith(String routerGatewayCidrEndsWith) {
    this.routerGatewayCidrEndsWith = routerGatewayCidrEndsWith;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput routerGatewayCidrGt(String routerGatewayCidrGt) {
    
    this.routerGatewayCidrGt = routerGatewayCidrGt;
    return this;
  }

   /**
   * Get routerGatewayCidrGt
   * @return routerGatewayCidrGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRouterGatewayCidrGt() {
    return routerGatewayCidrGt;
  }


  public void setRouterGatewayCidrGt(String routerGatewayCidrGt) {
    this.routerGatewayCidrGt = routerGatewayCidrGt;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput routerGatewayCidrGte(String routerGatewayCidrGte) {
    
    this.routerGatewayCidrGte = routerGatewayCidrGte;
    return this;
  }

   /**
   * Get routerGatewayCidrGte
   * @return routerGatewayCidrGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRouterGatewayCidrGte() {
    return routerGatewayCidrGte;
  }


  public void setRouterGatewayCidrGte(String routerGatewayCidrGte) {
    this.routerGatewayCidrGte = routerGatewayCidrGte;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput routerGatewayCidrIn(List<String> routerGatewayCidrIn) {
    
    this.routerGatewayCidrIn = routerGatewayCidrIn;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addRouterGatewayCidrInItem(String routerGatewayCidrInItem) {
    if (this.routerGatewayCidrIn == null) {
      this.routerGatewayCidrIn = new ArrayList<String>();
    }
    this.routerGatewayCidrIn.add(routerGatewayCidrInItem);
    return this;
  }

   /**
   * Get routerGatewayCidrIn
   * @return routerGatewayCidrIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRouterGatewayCidrIn() {
    return routerGatewayCidrIn;
  }


  public void setRouterGatewayCidrIn(List<String> routerGatewayCidrIn) {
    this.routerGatewayCidrIn = routerGatewayCidrIn;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput routerGatewayCidrLt(String routerGatewayCidrLt) {
    
    this.routerGatewayCidrLt = routerGatewayCidrLt;
    return this;
  }

   /**
   * Get routerGatewayCidrLt
   * @return routerGatewayCidrLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRouterGatewayCidrLt() {
    return routerGatewayCidrLt;
  }


  public void setRouterGatewayCidrLt(String routerGatewayCidrLt) {
    this.routerGatewayCidrLt = routerGatewayCidrLt;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput routerGatewayCidrLte(String routerGatewayCidrLte) {
    
    this.routerGatewayCidrLte = routerGatewayCidrLte;
    return this;
  }

   /**
   * Get routerGatewayCidrLte
   * @return routerGatewayCidrLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRouterGatewayCidrLte() {
    return routerGatewayCidrLte;
  }


  public void setRouterGatewayCidrLte(String routerGatewayCidrLte) {
    this.routerGatewayCidrLte = routerGatewayCidrLte;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput routerGatewayCidrNot(String routerGatewayCidrNot) {
    
    this.routerGatewayCidrNot = routerGatewayCidrNot;
    return this;
  }

   /**
   * Get routerGatewayCidrNot
   * @return routerGatewayCidrNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRouterGatewayCidrNot() {
    return routerGatewayCidrNot;
  }


  public void setRouterGatewayCidrNot(String routerGatewayCidrNot) {
    this.routerGatewayCidrNot = routerGatewayCidrNot;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput routerGatewayCidrNotContains(String routerGatewayCidrNotContains) {
    
    this.routerGatewayCidrNotContains = routerGatewayCidrNotContains;
    return this;
  }

   /**
   * Get routerGatewayCidrNotContains
   * @return routerGatewayCidrNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRouterGatewayCidrNotContains() {
    return routerGatewayCidrNotContains;
  }


  public void setRouterGatewayCidrNotContains(String routerGatewayCidrNotContains) {
    this.routerGatewayCidrNotContains = routerGatewayCidrNotContains;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput routerGatewayCidrNotEndsWith(String routerGatewayCidrNotEndsWith) {
    
    this.routerGatewayCidrNotEndsWith = routerGatewayCidrNotEndsWith;
    return this;
  }

   /**
   * Get routerGatewayCidrNotEndsWith
   * @return routerGatewayCidrNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRouterGatewayCidrNotEndsWith() {
    return routerGatewayCidrNotEndsWith;
  }


  public void setRouterGatewayCidrNotEndsWith(String routerGatewayCidrNotEndsWith) {
    this.routerGatewayCidrNotEndsWith = routerGatewayCidrNotEndsWith;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput routerGatewayCidrNotIn(List<String> routerGatewayCidrNotIn) {
    
    this.routerGatewayCidrNotIn = routerGatewayCidrNotIn;
    return this;
  }

  public VirtualPrivateCloudExternalSubnetWhereInput addRouterGatewayCidrNotInItem(String routerGatewayCidrNotInItem) {
    if (this.routerGatewayCidrNotIn == null) {
      this.routerGatewayCidrNotIn = new ArrayList<String>();
    }
    this.routerGatewayCidrNotIn.add(routerGatewayCidrNotInItem);
    return this;
  }

   /**
   * Get routerGatewayCidrNotIn
   * @return routerGatewayCidrNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRouterGatewayCidrNotIn() {
    return routerGatewayCidrNotIn;
  }


  public void setRouterGatewayCidrNotIn(List<String> routerGatewayCidrNotIn) {
    this.routerGatewayCidrNotIn = routerGatewayCidrNotIn;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput routerGatewayCidrNotStartsWith(String routerGatewayCidrNotStartsWith) {
    
    this.routerGatewayCidrNotStartsWith = routerGatewayCidrNotStartsWith;
    return this;
  }

   /**
   * Get routerGatewayCidrNotStartsWith
   * @return routerGatewayCidrNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRouterGatewayCidrNotStartsWith() {
    return routerGatewayCidrNotStartsWith;
  }


  public void setRouterGatewayCidrNotStartsWith(String routerGatewayCidrNotStartsWith) {
    this.routerGatewayCidrNotStartsWith = routerGatewayCidrNotStartsWith;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput routerGatewayCidrStartsWith(String routerGatewayCidrStartsWith) {
    
    this.routerGatewayCidrStartsWith = routerGatewayCidrStartsWith;
    return this;
  }

   /**
   * Get routerGatewayCidrStartsWith
   * @return routerGatewayCidrStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRouterGatewayCidrStartsWith() {
    return routerGatewayCidrStartsWith;
  }


  public void setRouterGatewayCidrStartsWith(String routerGatewayCidrStartsWith) {
    this.routerGatewayCidrStartsWith = routerGatewayCidrStartsWith;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput routerGatewaysEvery(VirtualPrivateCloudRouterGatewayWhereInput routerGatewaysEvery) {
    
    this.routerGatewaysEvery = routerGatewaysEvery;
    return this;
  }

   /**
   * Get routerGatewaysEvery
   * @return routerGatewaysEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudRouterGatewayWhereInput getRouterGatewaysEvery() {
    return routerGatewaysEvery;
  }


  public void setRouterGatewaysEvery(VirtualPrivateCloudRouterGatewayWhereInput routerGatewaysEvery) {
    this.routerGatewaysEvery = routerGatewaysEvery;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput routerGatewaysNone(VirtualPrivateCloudRouterGatewayWhereInput routerGatewaysNone) {
    
    this.routerGatewaysNone = routerGatewaysNone;
    return this;
  }

   /**
   * Get routerGatewaysNone
   * @return routerGatewaysNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudRouterGatewayWhereInput getRouterGatewaysNone() {
    return routerGatewaysNone;
  }


  public void setRouterGatewaysNone(VirtualPrivateCloudRouterGatewayWhereInput routerGatewaysNone) {
    this.routerGatewaysNone = routerGatewaysNone;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput routerGatewaysSome(VirtualPrivateCloudRouterGatewayWhereInput routerGatewaysSome) {
    
    this.routerGatewaysSome = routerGatewaysSome;
    return this;
  }

   /**
   * Get routerGatewaysSome
   * @return routerGatewaysSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudRouterGatewayWhereInput getRouterGatewaysSome() {
    return routerGatewaysSome;
  }


  public void setRouterGatewaysSome(VirtualPrivateCloudRouterGatewayWhereInput routerGatewaysSome) {
    this.routerGatewaysSome = routerGatewaysSome;
  }


  public VirtualPrivateCloudExternalSubnetWhereInput vlan(VlanWhereInput vlan) {
    
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


  public VirtualPrivateCloudExternalSubnetWhereInput vpc(VirtualPrivateCloudWhereInput vpc) {
    
    this.vpc = vpc;
    return this;
  }

   /**
   * Get vpc
   * @return vpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudWhereInput getVpc() {
    return vpc;
  }


  public void setVpc(VirtualPrivateCloudWhereInput vpc) {
    this.vpc = vpc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualPrivateCloudExternalSubnetWhereInput virtualPrivateCloudExternalSubnetWhereInput = (VirtualPrivateCloudExternalSubnetWhereInput) o;
    return Objects.equals(this.AND, virtualPrivateCloudExternalSubnetWhereInput.AND) &&
        Objects.equals(this.NOT, virtualPrivateCloudExternalSubnetWhereInput.NOT) &&
        Objects.equals(this.OR, virtualPrivateCloudExternalSubnetWhereInput.OR) &&
        Objects.equals(this.cidr, virtualPrivateCloudExternalSubnetWhereInput.cidr) &&
        Objects.equals(this.cidrContains, virtualPrivateCloudExternalSubnetWhereInput.cidrContains) &&
        Objects.equals(this.cidrEndsWith, virtualPrivateCloudExternalSubnetWhereInput.cidrEndsWith) &&
        Objects.equals(this.cidrGt, virtualPrivateCloudExternalSubnetWhereInput.cidrGt) &&
        Objects.equals(this.cidrGte, virtualPrivateCloudExternalSubnetWhereInput.cidrGte) &&
        Objects.equals(this.cidrIn, virtualPrivateCloudExternalSubnetWhereInput.cidrIn) &&
        Objects.equals(this.cidrLt, virtualPrivateCloudExternalSubnetWhereInput.cidrLt) &&
        Objects.equals(this.cidrLte, virtualPrivateCloudExternalSubnetWhereInput.cidrLte) &&
        Objects.equals(this.cidrNot, virtualPrivateCloudExternalSubnetWhereInput.cidrNot) &&
        Objects.equals(this.cidrNotContains, virtualPrivateCloudExternalSubnetWhereInput.cidrNotContains) &&
        Objects.equals(this.cidrNotEndsWith, virtualPrivateCloudExternalSubnetWhereInput.cidrNotEndsWith) &&
        Objects.equals(this.cidrNotIn, virtualPrivateCloudExternalSubnetWhereInput.cidrNotIn) &&
        Objects.equals(this.cidrNotStartsWith, virtualPrivateCloudExternalSubnetWhereInput.cidrNotStartsWith) &&
        Objects.equals(this.cidrStartsWith, virtualPrivateCloudExternalSubnetWhereInput.cidrStartsWith) &&
        Objects.equals(this.description, virtualPrivateCloudExternalSubnetWhereInput.description) &&
        Objects.equals(this.descriptionContains, virtualPrivateCloudExternalSubnetWhereInput.descriptionContains) &&
        Objects.equals(this.descriptionEndsWith, virtualPrivateCloudExternalSubnetWhereInput.descriptionEndsWith) &&
        Objects.equals(this.descriptionGt, virtualPrivateCloudExternalSubnetWhereInput.descriptionGt) &&
        Objects.equals(this.descriptionGte, virtualPrivateCloudExternalSubnetWhereInput.descriptionGte) &&
        Objects.equals(this.descriptionIn, virtualPrivateCloudExternalSubnetWhereInput.descriptionIn) &&
        Objects.equals(this.descriptionLt, virtualPrivateCloudExternalSubnetWhereInput.descriptionLt) &&
        Objects.equals(this.descriptionLte, virtualPrivateCloudExternalSubnetWhereInput.descriptionLte) &&
        Objects.equals(this.descriptionNot, virtualPrivateCloudExternalSubnetWhereInput.descriptionNot) &&
        Objects.equals(this.descriptionNotContains, virtualPrivateCloudExternalSubnetWhereInput.descriptionNotContains) &&
        Objects.equals(this.descriptionNotEndsWith, virtualPrivateCloudExternalSubnetWhereInput.descriptionNotEndsWith) &&
        Objects.equals(this.descriptionNotIn, virtualPrivateCloudExternalSubnetWhereInput.descriptionNotIn) &&
        Objects.equals(this.descriptionNotStartsWith, virtualPrivateCloudExternalSubnetWhereInput.descriptionNotStartsWith) &&
        Objects.equals(this.descriptionStartsWith, virtualPrivateCloudExternalSubnetWhereInput.descriptionStartsWith) &&
        Objects.equals(this.entityAsyncStatus, virtualPrivateCloudExternalSubnetWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, virtualPrivateCloudExternalSubnetWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, virtualPrivateCloudExternalSubnetWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, virtualPrivateCloudExternalSubnetWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.floatingIpCidr, virtualPrivateCloudExternalSubnetWhereInput.floatingIpCidr) &&
        Objects.equals(this.floatingIpCidrContains, virtualPrivateCloudExternalSubnetWhereInput.floatingIpCidrContains) &&
        Objects.equals(this.floatingIpCidrEndsWith, virtualPrivateCloudExternalSubnetWhereInput.floatingIpCidrEndsWith) &&
        Objects.equals(this.floatingIpCidrGt, virtualPrivateCloudExternalSubnetWhereInput.floatingIpCidrGt) &&
        Objects.equals(this.floatingIpCidrGte, virtualPrivateCloudExternalSubnetWhereInput.floatingIpCidrGte) &&
        Objects.equals(this.floatingIpCidrIn, virtualPrivateCloudExternalSubnetWhereInput.floatingIpCidrIn) &&
        Objects.equals(this.floatingIpCidrLt, virtualPrivateCloudExternalSubnetWhereInput.floatingIpCidrLt) &&
        Objects.equals(this.floatingIpCidrLte, virtualPrivateCloudExternalSubnetWhereInput.floatingIpCidrLte) &&
        Objects.equals(this.floatingIpCidrNot, virtualPrivateCloudExternalSubnetWhereInput.floatingIpCidrNot) &&
        Objects.equals(this.floatingIpCidrNotContains, virtualPrivateCloudExternalSubnetWhereInput.floatingIpCidrNotContains) &&
        Objects.equals(this.floatingIpCidrNotEndsWith, virtualPrivateCloudExternalSubnetWhereInput.floatingIpCidrNotEndsWith) &&
        Objects.equals(this.floatingIpCidrNotIn, virtualPrivateCloudExternalSubnetWhereInput.floatingIpCidrNotIn) &&
        Objects.equals(this.floatingIpCidrNotStartsWith, virtualPrivateCloudExternalSubnetWhereInput.floatingIpCidrNotStartsWith) &&
        Objects.equals(this.floatingIpCidrStartsWith, virtualPrivateCloudExternalSubnetWhereInput.floatingIpCidrStartsWith) &&
        Objects.equals(this.floatingIpsEvery, virtualPrivateCloudExternalSubnetWhereInput.floatingIpsEvery) &&
        Objects.equals(this.floatingIpsNone, virtualPrivateCloudExternalSubnetWhereInput.floatingIpsNone) &&
        Objects.equals(this.floatingIpsSome, virtualPrivateCloudExternalSubnetWhereInput.floatingIpsSome) &&
        Objects.equals(this.gateway, virtualPrivateCloudExternalSubnetWhereInput.gateway) &&
        Objects.equals(this.gatewayContains, virtualPrivateCloudExternalSubnetWhereInput.gatewayContains) &&
        Objects.equals(this.gatewayEndsWith, virtualPrivateCloudExternalSubnetWhereInput.gatewayEndsWith) &&
        Objects.equals(this.gatewayGt, virtualPrivateCloudExternalSubnetWhereInput.gatewayGt) &&
        Objects.equals(this.gatewayGte, virtualPrivateCloudExternalSubnetWhereInput.gatewayGte) &&
        Objects.equals(this.gatewayIn, virtualPrivateCloudExternalSubnetWhereInput.gatewayIn) &&
        Objects.equals(this.gatewayLt, virtualPrivateCloudExternalSubnetWhereInput.gatewayLt) &&
        Objects.equals(this.gatewayLte, virtualPrivateCloudExternalSubnetWhereInput.gatewayLte) &&
        Objects.equals(this.gatewayNot, virtualPrivateCloudExternalSubnetWhereInput.gatewayNot) &&
        Objects.equals(this.gatewayNotContains, virtualPrivateCloudExternalSubnetWhereInput.gatewayNotContains) &&
        Objects.equals(this.gatewayNotEndsWith, virtualPrivateCloudExternalSubnetWhereInput.gatewayNotEndsWith) &&
        Objects.equals(this.gatewayNotIn, virtualPrivateCloudExternalSubnetWhereInput.gatewayNotIn) &&
        Objects.equals(this.gatewayNotStartsWith, virtualPrivateCloudExternalSubnetWhereInput.gatewayNotStartsWith) &&
        Objects.equals(this.gatewayStartsWith, virtualPrivateCloudExternalSubnetWhereInput.gatewayStartsWith) &&
        Objects.equals(this.id, virtualPrivateCloudExternalSubnetWhereInput.id) &&
        Objects.equals(this.idContains, virtualPrivateCloudExternalSubnetWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, virtualPrivateCloudExternalSubnetWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, virtualPrivateCloudExternalSubnetWhereInput.idGt) &&
        Objects.equals(this.idGte, virtualPrivateCloudExternalSubnetWhereInput.idGte) &&
        Objects.equals(this.idIn, virtualPrivateCloudExternalSubnetWhereInput.idIn) &&
        Objects.equals(this.idLt, virtualPrivateCloudExternalSubnetWhereInput.idLt) &&
        Objects.equals(this.idLte, virtualPrivateCloudExternalSubnetWhereInput.idLte) &&
        Objects.equals(this.idNot, virtualPrivateCloudExternalSubnetWhereInput.idNot) &&
        Objects.equals(this.idNotContains, virtualPrivateCloudExternalSubnetWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, virtualPrivateCloudExternalSubnetWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, virtualPrivateCloudExternalSubnetWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, virtualPrivateCloudExternalSubnetWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, virtualPrivateCloudExternalSubnetWhereInput.idStartsWith) &&
        Objects.equals(this.localId, virtualPrivateCloudExternalSubnetWhereInput.localId) &&
        Objects.equals(this.localIdContains, virtualPrivateCloudExternalSubnetWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, virtualPrivateCloudExternalSubnetWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, virtualPrivateCloudExternalSubnetWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, virtualPrivateCloudExternalSubnetWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, virtualPrivateCloudExternalSubnetWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, virtualPrivateCloudExternalSubnetWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, virtualPrivateCloudExternalSubnetWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, virtualPrivateCloudExternalSubnetWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, virtualPrivateCloudExternalSubnetWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, virtualPrivateCloudExternalSubnetWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, virtualPrivateCloudExternalSubnetWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, virtualPrivateCloudExternalSubnetWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, virtualPrivateCloudExternalSubnetWhereInput.localIdStartsWith) &&
        Objects.equals(this.name, virtualPrivateCloudExternalSubnetWhereInput.name) &&
        Objects.equals(this.nameContains, virtualPrivateCloudExternalSubnetWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, virtualPrivateCloudExternalSubnetWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, virtualPrivateCloudExternalSubnetWhereInput.nameGt) &&
        Objects.equals(this.nameGte, virtualPrivateCloudExternalSubnetWhereInput.nameGte) &&
        Objects.equals(this.nameIn, virtualPrivateCloudExternalSubnetWhereInput.nameIn) &&
        Objects.equals(this.nameLt, virtualPrivateCloudExternalSubnetWhereInput.nameLt) &&
        Objects.equals(this.nameLte, virtualPrivateCloudExternalSubnetWhereInput.nameLte) &&
        Objects.equals(this.nameNot, virtualPrivateCloudExternalSubnetWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, virtualPrivateCloudExternalSubnetWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, virtualPrivateCloudExternalSubnetWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, virtualPrivateCloudExternalSubnetWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, virtualPrivateCloudExternalSubnetWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, virtualPrivateCloudExternalSubnetWhereInput.nameStartsWith) &&
        Objects.equals(this.natGatewayCidr, virtualPrivateCloudExternalSubnetWhereInput.natGatewayCidr) &&
        Objects.equals(this.natGatewayCidrContains, virtualPrivateCloudExternalSubnetWhereInput.natGatewayCidrContains) &&
        Objects.equals(this.natGatewayCidrEndsWith, virtualPrivateCloudExternalSubnetWhereInput.natGatewayCidrEndsWith) &&
        Objects.equals(this.natGatewayCidrGt, virtualPrivateCloudExternalSubnetWhereInput.natGatewayCidrGt) &&
        Objects.equals(this.natGatewayCidrGte, virtualPrivateCloudExternalSubnetWhereInput.natGatewayCidrGte) &&
        Objects.equals(this.natGatewayCidrIn, virtualPrivateCloudExternalSubnetWhereInput.natGatewayCidrIn) &&
        Objects.equals(this.natGatewayCidrLt, virtualPrivateCloudExternalSubnetWhereInput.natGatewayCidrLt) &&
        Objects.equals(this.natGatewayCidrLte, virtualPrivateCloudExternalSubnetWhereInput.natGatewayCidrLte) &&
        Objects.equals(this.natGatewayCidrNot, virtualPrivateCloudExternalSubnetWhereInput.natGatewayCidrNot) &&
        Objects.equals(this.natGatewayCidrNotContains, virtualPrivateCloudExternalSubnetWhereInput.natGatewayCidrNotContains) &&
        Objects.equals(this.natGatewayCidrNotEndsWith, virtualPrivateCloudExternalSubnetWhereInput.natGatewayCidrNotEndsWith) &&
        Objects.equals(this.natGatewayCidrNotIn, virtualPrivateCloudExternalSubnetWhereInput.natGatewayCidrNotIn) &&
        Objects.equals(this.natGatewayCidrNotStartsWith, virtualPrivateCloudExternalSubnetWhereInput.natGatewayCidrNotStartsWith) &&
        Objects.equals(this.natGatewayCidrStartsWith, virtualPrivateCloudExternalSubnetWhereInput.natGatewayCidrStartsWith) &&
        Objects.equals(this.natGatewaysEvery, virtualPrivateCloudExternalSubnetWhereInput.natGatewaysEvery) &&
        Objects.equals(this.natGatewaysNone, virtualPrivateCloudExternalSubnetWhereInput.natGatewaysNone) &&
        Objects.equals(this.natGatewaysSome, virtualPrivateCloudExternalSubnetWhereInput.natGatewaysSome) &&
        Objects.equals(this.routerGatewayCidr, virtualPrivateCloudExternalSubnetWhereInput.routerGatewayCidr) &&
        Objects.equals(this.routerGatewayCidrContains, virtualPrivateCloudExternalSubnetWhereInput.routerGatewayCidrContains) &&
        Objects.equals(this.routerGatewayCidrEndsWith, virtualPrivateCloudExternalSubnetWhereInput.routerGatewayCidrEndsWith) &&
        Objects.equals(this.routerGatewayCidrGt, virtualPrivateCloudExternalSubnetWhereInput.routerGatewayCidrGt) &&
        Objects.equals(this.routerGatewayCidrGte, virtualPrivateCloudExternalSubnetWhereInput.routerGatewayCidrGte) &&
        Objects.equals(this.routerGatewayCidrIn, virtualPrivateCloudExternalSubnetWhereInput.routerGatewayCidrIn) &&
        Objects.equals(this.routerGatewayCidrLt, virtualPrivateCloudExternalSubnetWhereInput.routerGatewayCidrLt) &&
        Objects.equals(this.routerGatewayCidrLte, virtualPrivateCloudExternalSubnetWhereInput.routerGatewayCidrLte) &&
        Objects.equals(this.routerGatewayCidrNot, virtualPrivateCloudExternalSubnetWhereInput.routerGatewayCidrNot) &&
        Objects.equals(this.routerGatewayCidrNotContains, virtualPrivateCloudExternalSubnetWhereInput.routerGatewayCidrNotContains) &&
        Objects.equals(this.routerGatewayCidrNotEndsWith, virtualPrivateCloudExternalSubnetWhereInput.routerGatewayCidrNotEndsWith) &&
        Objects.equals(this.routerGatewayCidrNotIn, virtualPrivateCloudExternalSubnetWhereInput.routerGatewayCidrNotIn) &&
        Objects.equals(this.routerGatewayCidrNotStartsWith, virtualPrivateCloudExternalSubnetWhereInput.routerGatewayCidrNotStartsWith) &&
        Objects.equals(this.routerGatewayCidrStartsWith, virtualPrivateCloudExternalSubnetWhereInput.routerGatewayCidrStartsWith) &&
        Objects.equals(this.routerGatewaysEvery, virtualPrivateCloudExternalSubnetWhereInput.routerGatewaysEvery) &&
        Objects.equals(this.routerGatewaysNone, virtualPrivateCloudExternalSubnetWhereInput.routerGatewaysNone) &&
        Objects.equals(this.routerGatewaysSome, virtualPrivateCloudExternalSubnetWhereInput.routerGatewaysSome) &&
        Objects.equals(this.vlan, virtualPrivateCloudExternalSubnetWhereInput.vlan) &&
        Objects.equals(this.vpc, virtualPrivateCloudExternalSubnetWhereInput.vpc);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, cidr, cidrContains, cidrEndsWith, cidrGt, cidrGte, cidrIn, cidrLt, cidrLte, cidrNot, cidrNotContains, cidrNotEndsWith, cidrNotIn, cidrNotStartsWith, cidrStartsWith, description, descriptionContains, descriptionEndsWith, descriptionGt, descriptionGte, descriptionIn, descriptionLt, descriptionLte, descriptionNot, descriptionNotContains, descriptionNotEndsWith, descriptionNotIn, descriptionNotStartsWith, descriptionStartsWith, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, floatingIpCidr, floatingIpCidrContains, floatingIpCidrEndsWith, floatingIpCidrGt, floatingIpCidrGte, floatingIpCidrIn, floatingIpCidrLt, floatingIpCidrLte, floatingIpCidrNot, floatingIpCidrNotContains, floatingIpCidrNotEndsWith, floatingIpCidrNotIn, floatingIpCidrNotStartsWith, floatingIpCidrStartsWith, floatingIpsEvery, floatingIpsNone, floatingIpsSome, gateway, gatewayContains, gatewayEndsWith, gatewayGt, gatewayGte, gatewayIn, gatewayLt, gatewayLte, gatewayNot, gatewayNotContains, gatewayNotEndsWith, gatewayNotIn, gatewayNotStartsWith, gatewayStartsWith, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, natGatewayCidr, natGatewayCidrContains, natGatewayCidrEndsWith, natGatewayCidrGt, natGatewayCidrGte, natGatewayCidrIn, natGatewayCidrLt, natGatewayCidrLte, natGatewayCidrNot, natGatewayCidrNotContains, natGatewayCidrNotEndsWith, natGatewayCidrNotIn, natGatewayCidrNotStartsWith, natGatewayCidrStartsWith, natGatewaysEvery, natGatewaysNone, natGatewaysSome, routerGatewayCidr, routerGatewayCidrContains, routerGatewayCidrEndsWith, routerGatewayCidrGt, routerGatewayCidrGte, routerGatewayCidrIn, routerGatewayCidrLt, routerGatewayCidrLte, routerGatewayCidrNot, routerGatewayCidrNotContains, routerGatewayCidrNotEndsWith, routerGatewayCidrNotIn, routerGatewayCidrNotStartsWith, routerGatewayCidrStartsWith, routerGatewaysEvery, routerGatewaysNone, routerGatewaysSome, vlan, vpc);
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
    sb.append("class VirtualPrivateCloudExternalSubnetWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    cidrContains: ").append(toIndentedString(cidrContains)).append("\n");
    sb.append("    cidrEndsWith: ").append(toIndentedString(cidrEndsWith)).append("\n");
    sb.append("    cidrGt: ").append(toIndentedString(cidrGt)).append("\n");
    sb.append("    cidrGte: ").append(toIndentedString(cidrGte)).append("\n");
    sb.append("    cidrIn: ").append(toIndentedString(cidrIn)).append("\n");
    sb.append("    cidrLt: ").append(toIndentedString(cidrLt)).append("\n");
    sb.append("    cidrLte: ").append(toIndentedString(cidrLte)).append("\n");
    sb.append("    cidrNot: ").append(toIndentedString(cidrNot)).append("\n");
    sb.append("    cidrNotContains: ").append(toIndentedString(cidrNotContains)).append("\n");
    sb.append("    cidrNotEndsWith: ").append(toIndentedString(cidrNotEndsWith)).append("\n");
    sb.append("    cidrNotIn: ").append(toIndentedString(cidrNotIn)).append("\n");
    sb.append("    cidrNotStartsWith: ").append(toIndentedString(cidrNotStartsWith)).append("\n");
    sb.append("    cidrStartsWith: ").append(toIndentedString(cidrStartsWith)).append("\n");
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
    sb.append("    floatingIpCidr: ").append(toIndentedString(floatingIpCidr)).append("\n");
    sb.append("    floatingIpCidrContains: ").append(toIndentedString(floatingIpCidrContains)).append("\n");
    sb.append("    floatingIpCidrEndsWith: ").append(toIndentedString(floatingIpCidrEndsWith)).append("\n");
    sb.append("    floatingIpCidrGt: ").append(toIndentedString(floatingIpCidrGt)).append("\n");
    sb.append("    floatingIpCidrGte: ").append(toIndentedString(floatingIpCidrGte)).append("\n");
    sb.append("    floatingIpCidrIn: ").append(toIndentedString(floatingIpCidrIn)).append("\n");
    sb.append("    floatingIpCidrLt: ").append(toIndentedString(floatingIpCidrLt)).append("\n");
    sb.append("    floatingIpCidrLte: ").append(toIndentedString(floatingIpCidrLte)).append("\n");
    sb.append("    floatingIpCidrNot: ").append(toIndentedString(floatingIpCidrNot)).append("\n");
    sb.append("    floatingIpCidrNotContains: ").append(toIndentedString(floatingIpCidrNotContains)).append("\n");
    sb.append("    floatingIpCidrNotEndsWith: ").append(toIndentedString(floatingIpCidrNotEndsWith)).append("\n");
    sb.append("    floatingIpCidrNotIn: ").append(toIndentedString(floatingIpCidrNotIn)).append("\n");
    sb.append("    floatingIpCidrNotStartsWith: ").append(toIndentedString(floatingIpCidrNotStartsWith)).append("\n");
    sb.append("    floatingIpCidrStartsWith: ").append(toIndentedString(floatingIpCidrStartsWith)).append("\n");
    sb.append("    floatingIpsEvery: ").append(toIndentedString(floatingIpsEvery)).append("\n");
    sb.append("    floatingIpsNone: ").append(toIndentedString(floatingIpsNone)).append("\n");
    sb.append("    floatingIpsSome: ").append(toIndentedString(floatingIpsSome)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    gatewayContains: ").append(toIndentedString(gatewayContains)).append("\n");
    sb.append("    gatewayEndsWith: ").append(toIndentedString(gatewayEndsWith)).append("\n");
    sb.append("    gatewayGt: ").append(toIndentedString(gatewayGt)).append("\n");
    sb.append("    gatewayGte: ").append(toIndentedString(gatewayGte)).append("\n");
    sb.append("    gatewayIn: ").append(toIndentedString(gatewayIn)).append("\n");
    sb.append("    gatewayLt: ").append(toIndentedString(gatewayLt)).append("\n");
    sb.append("    gatewayLte: ").append(toIndentedString(gatewayLte)).append("\n");
    sb.append("    gatewayNot: ").append(toIndentedString(gatewayNot)).append("\n");
    sb.append("    gatewayNotContains: ").append(toIndentedString(gatewayNotContains)).append("\n");
    sb.append("    gatewayNotEndsWith: ").append(toIndentedString(gatewayNotEndsWith)).append("\n");
    sb.append("    gatewayNotIn: ").append(toIndentedString(gatewayNotIn)).append("\n");
    sb.append("    gatewayNotStartsWith: ").append(toIndentedString(gatewayNotStartsWith)).append("\n");
    sb.append("    gatewayStartsWith: ").append(toIndentedString(gatewayStartsWith)).append("\n");
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
    sb.append("    natGatewayCidr: ").append(toIndentedString(natGatewayCidr)).append("\n");
    sb.append("    natGatewayCidrContains: ").append(toIndentedString(natGatewayCidrContains)).append("\n");
    sb.append("    natGatewayCidrEndsWith: ").append(toIndentedString(natGatewayCidrEndsWith)).append("\n");
    sb.append("    natGatewayCidrGt: ").append(toIndentedString(natGatewayCidrGt)).append("\n");
    sb.append("    natGatewayCidrGte: ").append(toIndentedString(natGatewayCidrGte)).append("\n");
    sb.append("    natGatewayCidrIn: ").append(toIndentedString(natGatewayCidrIn)).append("\n");
    sb.append("    natGatewayCidrLt: ").append(toIndentedString(natGatewayCidrLt)).append("\n");
    sb.append("    natGatewayCidrLte: ").append(toIndentedString(natGatewayCidrLte)).append("\n");
    sb.append("    natGatewayCidrNot: ").append(toIndentedString(natGatewayCidrNot)).append("\n");
    sb.append("    natGatewayCidrNotContains: ").append(toIndentedString(natGatewayCidrNotContains)).append("\n");
    sb.append("    natGatewayCidrNotEndsWith: ").append(toIndentedString(natGatewayCidrNotEndsWith)).append("\n");
    sb.append("    natGatewayCidrNotIn: ").append(toIndentedString(natGatewayCidrNotIn)).append("\n");
    sb.append("    natGatewayCidrNotStartsWith: ").append(toIndentedString(natGatewayCidrNotStartsWith)).append("\n");
    sb.append("    natGatewayCidrStartsWith: ").append(toIndentedString(natGatewayCidrStartsWith)).append("\n");
    sb.append("    natGatewaysEvery: ").append(toIndentedString(natGatewaysEvery)).append("\n");
    sb.append("    natGatewaysNone: ").append(toIndentedString(natGatewaysNone)).append("\n");
    sb.append("    natGatewaysSome: ").append(toIndentedString(natGatewaysSome)).append("\n");
    sb.append("    routerGatewayCidr: ").append(toIndentedString(routerGatewayCidr)).append("\n");
    sb.append("    routerGatewayCidrContains: ").append(toIndentedString(routerGatewayCidrContains)).append("\n");
    sb.append("    routerGatewayCidrEndsWith: ").append(toIndentedString(routerGatewayCidrEndsWith)).append("\n");
    sb.append("    routerGatewayCidrGt: ").append(toIndentedString(routerGatewayCidrGt)).append("\n");
    sb.append("    routerGatewayCidrGte: ").append(toIndentedString(routerGatewayCidrGte)).append("\n");
    sb.append("    routerGatewayCidrIn: ").append(toIndentedString(routerGatewayCidrIn)).append("\n");
    sb.append("    routerGatewayCidrLt: ").append(toIndentedString(routerGatewayCidrLt)).append("\n");
    sb.append("    routerGatewayCidrLte: ").append(toIndentedString(routerGatewayCidrLte)).append("\n");
    sb.append("    routerGatewayCidrNot: ").append(toIndentedString(routerGatewayCidrNot)).append("\n");
    sb.append("    routerGatewayCidrNotContains: ").append(toIndentedString(routerGatewayCidrNotContains)).append("\n");
    sb.append("    routerGatewayCidrNotEndsWith: ").append(toIndentedString(routerGatewayCidrNotEndsWith)).append("\n");
    sb.append("    routerGatewayCidrNotIn: ").append(toIndentedString(routerGatewayCidrNotIn)).append("\n");
    sb.append("    routerGatewayCidrNotStartsWith: ").append(toIndentedString(routerGatewayCidrNotStartsWith)).append("\n");
    sb.append("    routerGatewayCidrStartsWith: ").append(toIndentedString(routerGatewayCidrStartsWith)).append("\n");
    sb.append("    routerGatewaysEvery: ").append(toIndentedString(routerGatewaysEvery)).append("\n");
    sb.append("    routerGatewaysNone: ").append(toIndentedString(routerGatewaysNone)).append("\n");
    sb.append("    routerGatewaysSome: ").append(toIndentedString(routerGatewaysSome)).append("\n");
    sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
    sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
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

