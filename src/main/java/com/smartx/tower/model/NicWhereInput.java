package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.HostWhereInput;
import com.smartx.tower.model.IommuStatus;
import com.smartx.tower.model.LabelWhereInput;
import com.smartx.tower.model.NetworkType;
import com.smartx.tower.model.NicDriverState;
import com.smartx.tower.model.NicUserUsage;
import com.smartx.tower.model.VdsWhereInput;
import com.smartx.tower.model.VmWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NicWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class NicWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<NicWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<NicWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<NicWhereInput> OR = null;

  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_DRIVER_CONTAINS = "driver_contains";
  @SerializedName(SERIALIZED_NAME_DRIVER_CONTAINS)
  private String driverContains;

  public static final String SERIALIZED_NAME_DRIVER_ENDS_WITH = "driver_ends_with";
  @SerializedName(SERIALIZED_NAME_DRIVER_ENDS_WITH)
  private String driverEndsWith;

  public static final String SERIALIZED_NAME_DRIVER_GT = "driver_gt";
  @SerializedName(SERIALIZED_NAME_DRIVER_GT)
  private String driverGt;

  public static final String SERIALIZED_NAME_DRIVER_GTE = "driver_gte";
  @SerializedName(SERIALIZED_NAME_DRIVER_GTE)
  private String driverGte;

  public static final String SERIALIZED_NAME_DRIVER_IN = "driver_in";
  @SerializedName(SERIALIZED_NAME_DRIVER_IN)
  private List<String> driverIn = null;

  public static final String SERIALIZED_NAME_DRIVER_LT = "driver_lt";
  @SerializedName(SERIALIZED_NAME_DRIVER_LT)
  private String driverLt;

  public static final String SERIALIZED_NAME_DRIVER_LTE = "driver_lte";
  @SerializedName(SERIALIZED_NAME_DRIVER_LTE)
  private String driverLte;

  public static final String SERIALIZED_NAME_DRIVER_NOT = "driver_not";
  @SerializedName(SERIALIZED_NAME_DRIVER_NOT)
  private String driverNot;

  public static final String SERIALIZED_NAME_DRIVER_NOT_CONTAINS = "driver_not_contains";
  @SerializedName(SERIALIZED_NAME_DRIVER_NOT_CONTAINS)
  private String driverNotContains;

  public static final String SERIALIZED_NAME_DRIVER_NOT_ENDS_WITH = "driver_not_ends_with";
  @SerializedName(SERIALIZED_NAME_DRIVER_NOT_ENDS_WITH)
  private String driverNotEndsWith;

  public static final String SERIALIZED_NAME_DRIVER_NOT_IN = "driver_not_in";
  @SerializedName(SERIALIZED_NAME_DRIVER_NOT_IN)
  private List<String> driverNotIn = null;

  public static final String SERIALIZED_NAME_DRIVER_NOT_STARTS_WITH = "driver_not_starts_with";
  @SerializedName(SERIALIZED_NAME_DRIVER_NOT_STARTS_WITH)
  private String driverNotStartsWith;

  public static final String SERIALIZED_NAME_DRIVER_STARTS_WITH = "driver_starts_with";
  @SerializedName(SERIALIZED_NAME_DRIVER_STARTS_WITH)
  private String driverStartsWith;

  public static final String SERIALIZED_NAME_DRIVER_STATE = "driver_state";
  @SerializedName(SERIALIZED_NAME_DRIVER_STATE)
  private NicDriverState driverState;

  public static final String SERIALIZED_NAME_DRIVER_STATE_IN = "driver_state_in";
  @SerializedName(SERIALIZED_NAME_DRIVER_STATE_IN)
  private List<NicDriverState> driverStateIn = null;

  public static final String SERIALIZED_NAME_DRIVER_STATE_NOT = "driver_state_not";
  @SerializedName(SERIALIZED_NAME_DRIVER_STATE_NOT)
  private NicDriverState driverStateNot;

  public static final String SERIALIZED_NAME_DRIVER_STATE_NOT_IN = "driver_state_not_in";
  @SerializedName(SERIALIZED_NAME_DRIVER_STATE_NOT_IN)
  private List<NicDriverState> driverStateNotIn = null;

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

  public static final String SERIALIZED_NAME_GATEWAY_IP = "gateway_ip";
  @SerializedName(SERIALIZED_NAME_GATEWAY_IP)
  private String gatewayIp;

  public static final String SERIALIZED_NAME_GATEWAY_IP_CONTAINS = "gateway_ip_contains";
  @SerializedName(SERIALIZED_NAME_GATEWAY_IP_CONTAINS)
  private String gatewayIpContains;

  public static final String SERIALIZED_NAME_GATEWAY_IP_ENDS_WITH = "gateway_ip_ends_with";
  @SerializedName(SERIALIZED_NAME_GATEWAY_IP_ENDS_WITH)
  private String gatewayIpEndsWith;

  public static final String SERIALIZED_NAME_GATEWAY_IP_GT = "gateway_ip_gt";
  @SerializedName(SERIALIZED_NAME_GATEWAY_IP_GT)
  private String gatewayIpGt;

  public static final String SERIALIZED_NAME_GATEWAY_IP_GTE = "gateway_ip_gte";
  @SerializedName(SERIALIZED_NAME_GATEWAY_IP_GTE)
  private String gatewayIpGte;

  public static final String SERIALIZED_NAME_GATEWAY_IP_IN = "gateway_ip_in";
  @SerializedName(SERIALIZED_NAME_GATEWAY_IP_IN)
  private List<String> gatewayIpIn = null;

  public static final String SERIALIZED_NAME_GATEWAY_IP_LT = "gateway_ip_lt";
  @SerializedName(SERIALIZED_NAME_GATEWAY_IP_LT)
  private String gatewayIpLt;

  public static final String SERIALIZED_NAME_GATEWAY_IP_LTE = "gateway_ip_lte";
  @SerializedName(SERIALIZED_NAME_GATEWAY_IP_LTE)
  private String gatewayIpLte;

  public static final String SERIALIZED_NAME_GATEWAY_IP_NOT = "gateway_ip_not";
  @SerializedName(SERIALIZED_NAME_GATEWAY_IP_NOT)
  private String gatewayIpNot;

  public static final String SERIALIZED_NAME_GATEWAY_IP_NOT_CONTAINS = "gateway_ip_not_contains";
  @SerializedName(SERIALIZED_NAME_GATEWAY_IP_NOT_CONTAINS)
  private String gatewayIpNotContains;

  public static final String SERIALIZED_NAME_GATEWAY_IP_NOT_ENDS_WITH = "gateway_ip_not_ends_with";
  @SerializedName(SERIALIZED_NAME_GATEWAY_IP_NOT_ENDS_WITH)
  private String gatewayIpNotEndsWith;

  public static final String SERIALIZED_NAME_GATEWAY_IP_NOT_IN = "gateway_ip_not_in";
  @SerializedName(SERIALIZED_NAME_GATEWAY_IP_NOT_IN)
  private List<String> gatewayIpNotIn = null;

  public static final String SERIALIZED_NAME_GATEWAY_IP_NOT_STARTS_WITH = "gateway_ip_not_starts_with";
  @SerializedName(SERIALIZED_NAME_GATEWAY_IP_NOT_STARTS_WITH)
  private String gatewayIpNotStartsWith;

  public static final String SERIALIZED_NAME_GATEWAY_IP_STARTS_WITH = "gateway_ip_starts_with";
  @SerializedName(SERIALIZED_NAME_GATEWAY_IP_STARTS_WITH)
  private String gatewayIpStartsWith;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private HostWhereInput host;

  public static final String SERIALIZED_NAME_IBDEV = "ibdev";
  @SerializedName(SERIALIZED_NAME_IBDEV)
  private String ibdev;

  public static final String SERIALIZED_NAME_IBDEV_CONTAINS = "ibdev_contains";
  @SerializedName(SERIALIZED_NAME_IBDEV_CONTAINS)
  private String ibdevContains;

  public static final String SERIALIZED_NAME_IBDEV_ENDS_WITH = "ibdev_ends_with";
  @SerializedName(SERIALIZED_NAME_IBDEV_ENDS_WITH)
  private String ibdevEndsWith;

  public static final String SERIALIZED_NAME_IBDEV_GT = "ibdev_gt";
  @SerializedName(SERIALIZED_NAME_IBDEV_GT)
  private String ibdevGt;

  public static final String SERIALIZED_NAME_IBDEV_GTE = "ibdev_gte";
  @SerializedName(SERIALIZED_NAME_IBDEV_GTE)
  private String ibdevGte;

  public static final String SERIALIZED_NAME_IBDEV_IN = "ibdev_in";
  @SerializedName(SERIALIZED_NAME_IBDEV_IN)
  private List<String> ibdevIn = null;

  public static final String SERIALIZED_NAME_IBDEV_LT = "ibdev_lt";
  @SerializedName(SERIALIZED_NAME_IBDEV_LT)
  private String ibdevLt;

  public static final String SERIALIZED_NAME_IBDEV_LTE = "ibdev_lte";
  @SerializedName(SERIALIZED_NAME_IBDEV_LTE)
  private String ibdevLte;

  public static final String SERIALIZED_NAME_IBDEV_NOT = "ibdev_not";
  @SerializedName(SERIALIZED_NAME_IBDEV_NOT)
  private String ibdevNot;

  public static final String SERIALIZED_NAME_IBDEV_NOT_CONTAINS = "ibdev_not_contains";
  @SerializedName(SERIALIZED_NAME_IBDEV_NOT_CONTAINS)
  private String ibdevNotContains;

  public static final String SERIALIZED_NAME_IBDEV_NOT_ENDS_WITH = "ibdev_not_ends_with";
  @SerializedName(SERIALIZED_NAME_IBDEV_NOT_ENDS_WITH)
  private String ibdevNotEndsWith;

  public static final String SERIALIZED_NAME_IBDEV_NOT_IN = "ibdev_not_in";
  @SerializedName(SERIALIZED_NAME_IBDEV_NOT_IN)
  private List<String> ibdevNotIn = null;

  public static final String SERIALIZED_NAME_IBDEV_NOT_STARTS_WITH = "ibdev_not_starts_with";
  @SerializedName(SERIALIZED_NAME_IBDEV_NOT_STARTS_WITH)
  private String ibdevNotStartsWith;

  public static final String SERIALIZED_NAME_IBDEV_STARTS_WITH = "ibdev_starts_with";
  @SerializedName(SERIALIZED_NAME_IBDEV_STARTS_WITH)
  private String ibdevStartsWith;

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

  public static final String SERIALIZED_NAME_IOMMU_STATUS = "iommu_status";
  @SerializedName(SERIALIZED_NAME_IOMMU_STATUS)
  private IommuStatus iommuStatus;

  public static final String SERIALIZED_NAME_IOMMU_STATUS_IN = "iommu_status_in";
  @SerializedName(SERIALIZED_NAME_IOMMU_STATUS_IN)
  private List<IommuStatus> iommuStatusIn = null;

  public static final String SERIALIZED_NAME_IOMMU_STATUS_NOT = "iommu_status_not";
  @SerializedName(SERIALIZED_NAME_IOMMU_STATUS_NOT)
  private IommuStatus iommuStatusNot;

  public static final String SERIALIZED_NAME_IOMMU_STATUS_NOT_IN = "iommu_status_not_in";
  @SerializedName(SERIALIZED_NAME_IOMMU_STATUS_NOT_IN)
  private List<IommuStatus> iommuStatusNotIn = null;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_IP_ADDRESS_CONTAINS = "ip_address_contains";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_CONTAINS)
  private String ipAddressContains;

  public static final String SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH = "ip_address_ends_with";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH)
  private String ipAddressEndsWith;

  public static final String SERIALIZED_NAME_IP_ADDRESS_GT = "ip_address_gt";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_GT)
  private String ipAddressGt;

  public static final String SERIALIZED_NAME_IP_ADDRESS_GTE = "ip_address_gte";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_GTE)
  private String ipAddressGte;

  public static final String SERIALIZED_NAME_IP_ADDRESS_IN = "ip_address_in";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_IN)
  private List<String> ipAddressIn = null;

  public static final String SERIALIZED_NAME_IP_ADDRESS_LT = "ip_address_lt";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_LT)
  private String ipAddressLt;

  public static final String SERIALIZED_NAME_IP_ADDRESS_LTE = "ip_address_lte";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_LTE)
  private String ipAddressLte;

  public static final String SERIALIZED_NAME_IP_ADDRESS_NOT = "ip_address_not";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT)
  private String ipAddressNot;

  public static final String SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS = "ip_address_not_contains";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS)
  private String ipAddressNotContains;

  public static final String SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH = "ip_address_not_ends_with";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH)
  private String ipAddressNotEndsWith;

  public static final String SERIALIZED_NAME_IP_ADDRESS_NOT_IN = "ip_address_not_in";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT_IN)
  private List<String> ipAddressNotIn = null;

  public static final String SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH = "ip_address_not_starts_with";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH)
  private String ipAddressNotStartsWith;

  public static final String SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH = "ip_address_starts_with";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH)
  private String ipAddressStartsWith;

  public static final String SERIALIZED_NAME_IS_SRIOV = "is_sriov";
  @SerializedName(SERIALIZED_NAME_IS_SRIOV)
  private Boolean isSriov;

  public static final String SERIALIZED_NAME_IS_SRIOV_NOT = "is_sriov_not";
  @SerializedName(SERIALIZED_NAME_IS_SRIOV_NOT)
  private Boolean isSriovNot;

  public static final String SERIALIZED_NAME_LABELS_EVERY = "labels_every";
  @SerializedName(SERIALIZED_NAME_LABELS_EVERY)
  private LabelWhereInput labelsEvery;

  public static final String SERIALIZED_NAME_LABELS_NONE = "labels_none";
  @SerializedName(SERIALIZED_NAME_LABELS_NONE)
  private LabelWhereInput labelsNone;

  public static final String SERIALIZED_NAME_LABELS_SOME = "labels_some";
  @SerializedName(SERIALIZED_NAME_LABELS_SOME)
  private LabelWhereInput labelsSome;

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

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "mac_address";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_CONTAINS = "mac_address_contains";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_CONTAINS)
  private String macAddressContains;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_ENDS_WITH = "mac_address_ends_with";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_ENDS_WITH)
  private String macAddressEndsWith;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_GT = "mac_address_gt";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_GT)
  private String macAddressGt;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_GTE = "mac_address_gte";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_GTE)
  private String macAddressGte;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_IN = "mac_address_in";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_IN)
  private List<String> macAddressIn = null;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_LT = "mac_address_lt";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_LT)
  private String macAddressLt;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_LTE = "mac_address_lte";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_LTE)
  private String macAddressLte;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_NOT = "mac_address_not";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_NOT)
  private String macAddressNot;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_NOT_CONTAINS = "mac_address_not_contains";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_NOT_CONTAINS)
  private String macAddressNotContains;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_NOT_ENDS_WITH = "mac_address_not_ends_with";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_NOT_ENDS_WITH)
  private String macAddressNotEndsWith;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_NOT_IN = "mac_address_not_in";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_NOT_IN)
  private List<String> macAddressNotIn = null;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_NOT_STARTS_WITH = "mac_address_not_starts_with";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_NOT_STARTS_WITH)
  private String macAddressNotStartsWith;

  public static final String SERIALIZED_NAME_MAC_ADDRESS_STARTS_WITH = "mac_address_starts_with";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_STARTS_WITH)
  private String macAddressStartsWith;

  public static final String SERIALIZED_NAME_MAX_VF_NUM = "max_vf_num";
  @SerializedName(SERIALIZED_NAME_MAX_VF_NUM)
  private Integer maxVfNum;

  public static final String SERIALIZED_NAME_MAX_VF_NUM_GT = "max_vf_num_gt";
  @SerializedName(SERIALIZED_NAME_MAX_VF_NUM_GT)
  private Integer maxVfNumGt;

  public static final String SERIALIZED_NAME_MAX_VF_NUM_GTE = "max_vf_num_gte";
  @SerializedName(SERIALIZED_NAME_MAX_VF_NUM_GTE)
  private Integer maxVfNumGte;

  public static final String SERIALIZED_NAME_MAX_VF_NUM_IN = "max_vf_num_in";
  @SerializedName(SERIALIZED_NAME_MAX_VF_NUM_IN)
  private List<Integer> maxVfNumIn = null;

  public static final String SERIALIZED_NAME_MAX_VF_NUM_LT = "max_vf_num_lt";
  @SerializedName(SERIALIZED_NAME_MAX_VF_NUM_LT)
  private Integer maxVfNumLt;

  public static final String SERIALIZED_NAME_MAX_VF_NUM_LTE = "max_vf_num_lte";
  @SerializedName(SERIALIZED_NAME_MAX_VF_NUM_LTE)
  private Integer maxVfNumLte;

  public static final String SERIALIZED_NAME_MAX_VF_NUM_NOT = "max_vf_num_not";
  @SerializedName(SERIALIZED_NAME_MAX_VF_NUM_NOT)
  private Integer maxVfNumNot;

  public static final String SERIALIZED_NAME_MAX_VF_NUM_NOT_IN = "max_vf_num_not_in";
  @SerializedName(SERIALIZED_NAME_MAX_VF_NUM_NOT_IN)
  private List<Integer> maxVfNumNotIn = null;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_MODEL_CONTAINS = "model_contains";
  @SerializedName(SERIALIZED_NAME_MODEL_CONTAINS)
  private String modelContains;

  public static final String SERIALIZED_NAME_MODEL_ENDS_WITH = "model_ends_with";
  @SerializedName(SERIALIZED_NAME_MODEL_ENDS_WITH)
  private String modelEndsWith;

  public static final String SERIALIZED_NAME_MODEL_GT = "model_gt";
  @SerializedName(SERIALIZED_NAME_MODEL_GT)
  private String modelGt;

  public static final String SERIALIZED_NAME_MODEL_GTE = "model_gte";
  @SerializedName(SERIALIZED_NAME_MODEL_GTE)
  private String modelGte;

  public static final String SERIALIZED_NAME_MODEL_IN = "model_in";
  @SerializedName(SERIALIZED_NAME_MODEL_IN)
  private List<String> modelIn = null;

  public static final String SERIALIZED_NAME_MODEL_LT = "model_lt";
  @SerializedName(SERIALIZED_NAME_MODEL_LT)
  private String modelLt;

  public static final String SERIALIZED_NAME_MODEL_LTE = "model_lte";
  @SerializedName(SERIALIZED_NAME_MODEL_LTE)
  private String modelLte;

  public static final String SERIALIZED_NAME_MODEL_NOT = "model_not";
  @SerializedName(SERIALIZED_NAME_MODEL_NOT)
  private String modelNot;

  public static final String SERIALIZED_NAME_MODEL_NOT_CONTAINS = "model_not_contains";
  @SerializedName(SERIALIZED_NAME_MODEL_NOT_CONTAINS)
  private String modelNotContains;

  public static final String SERIALIZED_NAME_MODEL_NOT_ENDS_WITH = "model_not_ends_with";
  @SerializedName(SERIALIZED_NAME_MODEL_NOT_ENDS_WITH)
  private String modelNotEndsWith;

  public static final String SERIALIZED_NAME_MODEL_NOT_IN = "model_not_in";
  @SerializedName(SERIALIZED_NAME_MODEL_NOT_IN)
  private List<String> modelNotIn = null;

  public static final String SERIALIZED_NAME_MODEL_NOT_STARTS_WITH = "model_not_starts_with";
  @SerializedName(SERIALIZED_NAME_MODEL_NOT_STARTS_WITH)
  private String modelNotStartsWith;

  public static final String SERIALIZED_NAME_MODEL_STARTS_WITH = "model_starts_with";
  @SerializedName(SERIALIZED_NAME_MODEL_STARTS_WITH)
  private String modelStartsWith;

  public static final String SERIALIZED_NAME_MTU = "mtu";
  @SerializedName(SERIALIZED_NAME_MTU)
  private Integer mtu;

  public static final String SERIALIZED_NAME_MTU_GT = "mtu_gt";
  @SerializedName(SERIALIZED_NAME_MTU_GT)
  private Integer mtuGt;

  public static final String SERIALIZED_NAME_MTU_GTE = "mtu_gte";
  @SerializedName(SERIALIZED_NAME_MTU_GTE)
  private Integer mtuGte;

  public static final String SERIALIZED_NAME_MTU_IN = "mtu_in";
  @SerializedName(SERIALIZED_NAME_MTU_IN)
  private List<Integer> mtuIn = null;

  public static final String SERIALIZED_NAME_MTU_LT = "mtu_lt";
  @SerializedName(SERIALIZED_NAME_MTU_LT)
  private Integer mtuLt;

  public static final String SERIALIZED_NAME_MTU_LTE = "mtu_lte";
  @SerializedName(SERIALIZED_NAME_MTU_LTE)
  private Integer mtuLte;

  public static final String SERIALIZED_NAME_MTU_NOT = "mtu_not";
  @SerializedName(SERIALIZED_NAME_MTU_NOT)
  private Integer mtuNot;

  public static final String SERIALIZED_NAME_MTU_NOT_IN = "mtu_not_in";
  @SerializedName(SERIALIZED_NAME_MTU_NOT_IN)
  private List<Integer> mtuNotIn = null;

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

  public static final String SERIALIZED_NAME_NIC_UUID = "nic_uuid";
  @SerializedName(SERIALIZED_NAME_NIC_UUID)
  private String nicUuid;

  public static final String SERIALIZED_NAME_NIC_UUID_CONTAINS = "nic_uuid_contains";
  @SerializedName(SERIALIZED_NAME_NIC_UUID_CONTAINS)
  private String nicUuidContains;

  public static final String SERIALIZED_NAME_NIC_UUID_ENDS_WITH = "nic_uuid_ends_with";
  @SerializedName(SERIALIZED_NAME_NIC_UUID_ENDS_WITH)
  private String nicUuidEndsWith;

  public static final String SERIALIZED_NAME_NIC_UUID_GT = "nic_uuid_gt";
  @SerializedName(SERIALIZED_NAME_NIC_UUID_GT)
  private String nicUuidGt;

  public static final String SERIALIZED_NAME_NIC_UUID_GTE = "nic_uuid_gte";
  @SerializedName(SERIALIZED_NAME_NIC_UUID_GTE)
  private String nicUuidGte;

  public static final String SERIALIZED_NAME_NIC_UUID_IN = "nic_uuid_in";
  @SerializedName(SERIALIZED_NAME_NIC_UUID_IN)
  private List<String> nicUuidIn = null;

  public static final String SERIALIZED_NAME_NIC_UUID_LT = "nic_uuid_lt";
  @SerializedName(SERIALIZED_NAME_NIC_UUID_LT)
  private String nicUuidLt;

  public static final String SERIALIZED_NAME_NIC_UUID_LTE = "nic_uuid_lte";
  @SerializedName(SERIALIZED_NAME_NIC_UUID_LTE)
  private String nicUuidLte;

  public static final String SERIALIZED_NAME_NIC_UUID_NOT = "nic_uuid_not";
  @SerializedName(SERIALIZED_NAME_NIC_UUID_NOT)
  private String nicUuidNot;

  public static final String SERIALIZED_NAME_NIC_UUID_NOT_CONTAINS = "nic_uuid_not_contains";
  @SerializedName(SERIALIZED_NAME_NIC_UUID_NOT_CONTAINS)
  private String nicUuidNotContains;

  public static final String SERIALIZED_NAME_NIC_UUID_NOT_ENDS_WITH = "nic_uuid_not_ends_with";
  @SerializedName(SERIALIZED_NAME_NIC_UUID_NOT_ENDS_WITH)
  private String nicUuidNotEndsWith;

  public static final String SERIALIZED_NAME_NIC_UUID_NOT_IN = "nic_uuid_not_in";
  @SerializedName(SERIALIZED_NAME_NIC_UUID_NOT_IN)
  private List<String> nicUuidNotIn = null;

  public static final String SERIALIZED_NAME_NIC_UUID_NOT_STARTS_WITH = "nic_uuid_not_starts_with";
  @SerializedName(SERIALIZED_NAME_NIC_UUID_NOT_STARTS_WITH)
  private String nicUuidNotStartsWith;

  public static final String SERIALIZED_NAME_NIC_UUID_STARTS_WITH = "nic_uuid_starts_with";
  @SerializedName(SERIALIZED_NAME_NIC_UUID_STARTS_WITH)
  private String nicUuidStartsWith;

  public static final String SERIALIZED_NAME_PHYSICAL = "physical";
  @SerializedName(SERIALIZED_NAME_PHYSICAL)
  private Boolean physical;

  public static final String SERIALIZED_NAME_PHYSICAL_NOT = "physical_not";
  @SerializedName(SERIALIZED_NAME_PHYSICAL_NOT)
  private Boolean physicalNot;

  public static final String SERIALIZED_NAME_RDMA_ENABLED = "rdma_enabled";
  @SerializedName(SERIALIZED_NAME_RDMA_ENABLED)
  private Boolean rdmaEnabled;

  public static final String SERIALIZED_NAME_RDMA_ENABLED_NOT = "rdma_enabled_not";
  @SerializedName(SERIALIZED_NAME_RDMA_ENABLED_NOT)
  private Boolean rdmaEnabledNot;

  public static final String SERIALIZED_NAME_RUNNING = "running";
  @SerializedName(SERIALIZED_NAME_RUNNING)
  private Boolean running;

  public static final String SERIALIZED_NAME_RUNNING_NOT = "running_not";
  @SerializedName(SERIALIZED_NAME_RUNNING_NOT)
  private Boolean runningNot;

  public static final String SERIALIZED_NAME_SPEED = "speed";
  @SerializedName(SERIALIZED_NAME_SPEED)
  private Long speed;

  public static final String SERIALIZED_NAME_SPEED_GT = "speed_gt";
  @SerializedName(SERIALIZED_NAME_SPEED_GT)
  private Long speedGt;

  public static final String SERIALIZED_NAME_SPEED_GTE = "speed_gte";
  @SerializedName(SERIALIZED_NAME_SPEED_GTE)
  private Long speedGte;

  public static final String SERIALIZED_NAME_SPEED_IN = "speed_in";
  @SerializedName(SERIALIZED_NAME_SPEED_IN)
  private List<Long> speedIn = null;

  public static final String SERIALIZED_NAME_SPEED_LT = "speed_lt";
  @SerializedName(SERIALIZED_NAME_SPEED_LT)
  private Long speedLt;

  public static final String SERIALIZED_NAME_SPEED_LTE = "speed_lte";
  @SerializedName(SERIALIZED_NAME_SPEED_LTE)
  private Long speedLte;

  public static final String SERIALIZED_NAME_SPEED_NOT = "speed_not";
  @SerializedName(SERIALIZED_NAME_SPEED_NOT)
  private Long speedNot;

  public static final String SERIALIZED_NAME_SPEED_NOT_IN = "speed_not_in";
  @SerializedName(SERIALIZED_NAME_SPEED_NOT_IN)
  private List<Long> speedNotIn = null;

  public static final String SERIALIZED_NAME_SUBNET_MASK = "subnet_mask";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK)
  private String subnetMask;

  public static final String SERIALIZED_NAME_SUBNET_MASK_CONTAINS = "subnet_mask_contains";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_CONTAINS)
  private String subnetMaskContains;

  public static final String SERIALIZED_NAME_SUBNET_MASK_ENDS_WITH = "subnet_mask_ends_with";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_ENDS_WITH)
  private String subnetMaskEndsWith;

  public static final String SERIALIZED_NAME_SUBNET_MASK_GT = "subnet_mask_gt";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_GT)
  private String subnetMaskGt;

  public static final String SERIALIZED_NAME_SUBNET_MASK_GTE = "subnet_mask_gte";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_GTE)
  private String subnetMaskGte;

  public static final String SERIALIZED_NAME_SUBNET_MASK_IN = "subnet_mask_in";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_IN)
  private List<String> subnetMaskIn = null;

  public static final String SERIALIZED_NAME_SUBNET_MASK_LT = "subnet_mask_lt";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_LT)
  private String subnetMaskLt;

  public static final String SERIALIZED_NAME_SUBNET_MASK_LTE = "subnet_mask_lte";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_LTE)
  private String subnetMaskLte;

  public static final String SERIALIZED_NAME_SUBNET_MASK_NOT = "subnet_mask_not";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_NOT)
  private String subnetMaskNot;

  public static final String SERIALIZED_NAME_SUBNET_MASK_NOT_CONTAINS = "subnet_mask_not_contains";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_NOT_CONTAINS)
  private String subnetMaskNotContains;

  public static final String SERIALIZED_NAME_SUBNET_MASK_NOT_ENDS_WITH = "subnet_mask_not_ends_with";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_NOT_ENDS_WITH)
  private String subnetMaskNotEndsWith;

  public static final String SERIALIZED_NAME_SUBNET_MASK_NOT_IN = "subnet_mask_not_in";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_NOT_IN)
  private List<String> subnetMaskNotIn = null;

  public static final String SERIALIZED_NAME_SUBNET_MASK_NOT_STARTS_WITH = "subnet_mask_not_starts_with";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_NOT_STARTS_WITH)
  private String subnetMaskNotStartsWith;

  public static final String SERIALIZED_NAME_SUBNET_MASK_STARTS_WITH = "subnet_mask_starts_with";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK_STARTS_WITH)
  private String subnetMaskStartsWith;

  public static final String SERIALIZED_NAME_TOTAL_VF_NUM = "total_vf_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM)
  private Integer totalVfNum;

  public static final String SERIALIZED_NAME_TOTAL_VF_NUM_GT = "total_vf_num_gt";
  @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM_GT)
  private Integer totalVfNumGt;

  public static final String SERIALIZED_NAME_TOTAL_VF_NUM_GTE = "total_vf_num_gte";
  @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM_GTE)
  private Integer totalVfNumGte;

  public static final String SERIALIZED_NAME_TOTAL_VF_NUM_IN = "total_vf_num_in";
  @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM_IN)
  private List<Integer> totalVfNumIn = null;

  public static final String SERIALIZED_NAME_TOTAL_VF_NUM_LT = "total_vf_num_lt";
  @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM_LT)
  private Integer totalVfNumLt;

  public static final String SERIALIZED_NAME_TOTAL_VF_NUM_LTE = "total_vf_num_lte";
  @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM_LTE)
  private Integer totalVfNumLte;

  public static final String SERIALIZED_NAME_TOTAL_VF_NUM_NOT = "total_vf_num_not";
  @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM_NOT)
  private Integer totalVfNumNot;

  public static final String SERIALIZED_NAME_TOTAL_VF_NUM_NOT_IN = "total_vf_num_not_in";
  @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM_NOT_IN)
  private List<Integer> totalVfNumNotIn = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private NetworkType type;

  public static final String SERIALIZED_NAME_TYPE_IN = "type_in";
  @SerializedName(SERIALIZED_NAME_TYPE_IN)
  private List<NetworkType> typeIn = null;

  public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";
  @SerializedName(SERIALIZED_NAME_TYPE_NOT)
  private NetworkType typeNot;

  public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";
  @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
  private List<NetworkType> typeNotIn = null;

  public static final String SERIALIZED_NAME_UP = "up";
  @SerializedName(SERIALIZED_NAME_UP)
  private Boolean up;

  public static final String SERIALIZED_NAME_UP_NOT = "up_not";
  @SerializedName(SERIALIZED_NAME_UP_NOT)
  private Boolean upNot;

  public static final String SERIALIZED_NAME_USED_VF_NUM = "used_vf_num";
  @SerializedName(SERIALIZED_NAME_USED_VF_NUM)
  private Integer usedVfNum;

  public static final String SERIALIZED_NAME_USED_VF_NUM_GT = "used_vf_num_gt";
  @SerializedName(SERIALIZED_NAME_USED_VF_NUM_GT)
  private Integer usedVfNumGt;

  public static final String SERIALIZED_NAME_USED_VF_NUM_GTE = "used_vf_num_gte";
  @SerializedName(SERIALIZED_NAME_USED_VF_NUM_GTE)
  private Integer usedVfNumGte;

  public static final String SERIALIZED_NAME_USED_VF_NUM_IN = "used_vf_num_in";
  @SerializedName(SERIALIZED_NAME_USED_VF_NUM_IN)
  private List<Integer> usedVfNumIn = null;

  public static final String SERIALIZED_NAME_USED_VF_NUM_LT = "used_vf_num_lt";
  @SerializedName(SERIALIZED_NAME_USED_VF_NUM_LT)
  private Integer usedVfNumLt;

  public static final String SERIALIZED_NAME_USED_VF_NUM_LTE = "used_vf_num_lte";
  @SerializedName(SERIALIZED_NAME_USED_VF_NUM_LTE)
  private Integer usedVfNumLte;

  public static final String SERIALIZED_NAME_USED_VF_NUM_NOT = "used_vf_num_not";
  @SerializedName(SERIALIZED_NAME_USED_VF_NUM_NOT)
  private Integer usedVfNumNot;

  public static final String SERIALIZED_NAME_USED_VF_NUM_NOT_IN = "used_vf_num_not_in";
  @SerializedName(SERIALIZED_NAME_USED_VF_NUM_NOT_IN)
  private List<Integer> usedVfNumNotIn = null;

  public static final String SERIALIZED_NAME_USER_USAGE = "user_usage";
  @SerializedName(SERIALIZED_NAME_USER_USAGE)
  private NicUserUsage userUsage;

  public static final String SERIALIZED_NAME_USER_USAGE_IN = "user_usage_in";
  @SerializedName(SERIALIZED_NAME_USER_USAGE_IN)
  private List<NicUserUsage> userUsageIn = null;

  public static final String SERIALIZED_NAME_USER_USAGE_NOT = "user_usage_not";
  @SerializedName(SERIALIZED_NAME_USER_USAGE_NOT)
  private NicUserUsage userUsageNot;

  public static final String SERIALIZED_NAME_USER_USAGE_NOT_IN = "user_usage_not_in";
  @SerializedName(SERIALIZED_NAME_USER_USAGE_NOT_IN)
  private List<NicUserUsage> userUsageNotIn = null;

  public static final String SERIALIZED_NAME_VDS = "vds";
  @SerializedName(SERIALIZED_NAME_VDS)
  private VdsWhereInput vds;

  public static final String SERIALIZED_NAME_VMS_EVERY = "vms_every";
  @SerializedName(SERIALIZED_NAME_VMS_EVERY)
  private VmWhereInput vmsEvery;

  public static final String SERIALIZED_NAME_VMS_NONE = "vms_none";
  @SerializedName(SERIALIZED_NAME_VMS_NONE)
  private VmWhereInput vmsNone;

  public static final String SERIALIZED_NAME_VMS_SOME = "vms_some";
  @SerializedName(SERIALIZED_NAME_VMS_SOME)
  private VmWhereInput vmsSome;

  public NicWhereInput() { 
  }

  public NicWhereInput AND(List<NicWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public NicWhereInput addANDItem(NicWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<NicWhereInput>();
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

  public List<NicWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<NicWhereInput> AND) {
    this.AND = AND;
  }


  public NicWhereInput NOT(List<NicWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public NicWhereInput addNOTItem(NicWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<NicWhereInput>();
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

  public List<NicWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<NicWhereInput> NOT) {
    this.NOT = NOT;
  }


  public NicWhereInput OR(List<NicWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public NicWhereInput addORItem(NicWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<NicWhereInput>();
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

  public List<NicWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<NicWhereInput> OR) {
    this.OR = OR;
  }


  public NicWhereInput driver(String driver) {
    
    this.driver = driver;
    return this;
  }

   /**
   * Get driver
   * @return driver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDriver() {
    return driver;
  }


  public void setDriver(String driver) {
    this.driver = driver;
  }


  public NicWhereInput driverContains(String driverContains) {
    
    this.driverContains = driverContains;
    return this;
  }

   /**
   * Get driverContains
   * @return driverContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDriverContains() {
    return driverContains;
  }


  public void setDriverContains(String driverContains) {
    this.driverContains = driverContains;
  }


  public NicWhereInput driverEndsWith(String driverEndsWith) {
    
    this.driverEndsWith = driverEndsWith;
    return this;
  }

   /**
   * Get driverEndsWith
   * @return driverEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDriverEndsWith() {
    return driverEndsWith;
  }


  public void setDriverEndsWith(String driverEndsWith) {
    this.driverEndsWith = driverEndsWith;
  }


  public NicWhereInput driverGt(String driverGt) {
    
    this.driverGt = driverGt;
    return this;
  }

   /**
   * Get driverGt
   * @return driverGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDriverGt() {
    return driverGt;
  }


  public void setDriverGt(String driverGt) {
    this.driverGt = driverGt;
  }


  public NicWhereInput driverGte(String driverGte) {
    
    this.driverGte = driverGte;
    return this;
  }

   /**
   * Get driverGte
   * @return driverGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDriverGte() {
    return driverGte;
  }


  public void setDriverGte(String driverGte) {
    this.driverGte = driverGte;
  }


  public NicWhereInput driverIn(List<String> driverIn) {
    
    this.driverIn = driverIn;
    return this;
  }

  public NicWhereInput addDriverInItem(String driverInItem) {
    if (this.driverIn == null) {
      this.driverIn = new ArrayList<String>();
    }
    this.driverIn.add(driverInItem);
    return this;
  }

   /**
   * Get driverIn
   * @return driverIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDriverIn() {
    return driverIn;
  }


  public void setDriverIn(List<String> driverIn) {
    this.driverIn = driverIn;
  }


  public NicWhereInput driverLt(String driverLt) {
    
    this.driverLt = driverLt;
    return this;
  }

   /**
   * Get driverLt
   * @return driverLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDriverLt() {
    return driverLt;
  }


  public void setDriverLt(String driverLt) {
    this.driverLt = driverLt;
  }


  public NicWhereInput driverLte(String driverLte) {
    
    this.driverLte = driverLte;
    return this;
  }

   /**
   * Get driverLte
   * @return driverLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDriverLte() {
    return driverLte;
  }


  public void setDriverLte(String driverLte) {
    this.driverLte = driverLte;
  }


  public NicWhereInput driverNot(String driverNot) {
    
    this.driverNot = driverNot;
    return this;
  }

   /**
   * Get driverNot
   * @return driverNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDriverNot() {
    return driverNot;
  }


  public void setDriverNot(String driverNot) {
    this.driverNot = driverNot;
  }


  public NicWhereInput driverNotContains(String driverNotContains) {
    
    this.driverNotContains = driverNotContains;
    return this;
  }

   /**
   * Get driverNotContains
   * @return driverNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDriverNotContains() {
    return driverNotContains;
  }


  public void setDriverNotContains(String driverNotContains) {
    this.driverNotContains = driverNotContains;
  }


  public NicWhereInput driverNotEndsWith(String driverNotEndsWith) {
    
    this.driverNotEndsWith = driverNotEndsWith;
    return this;
  }

   /**
   * Get driverNotEndsWith
   * @return driverNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDriverNotEndsWith() {
    return driverNotEndsWith;
  }


  public void setDriverNotEndsWith(String driverNotEndsWith) {
    this.driverNotEndsWith = driverNotEndsWith;
  }


  public NicWhereInput driverNotIn(List<String> driverNotIn) {
    
    this.driverNotIn = driverNotIn;
    return this;
  }

  public NicWhereInput addDriverNotInItem(String driverNotInItem) {
    if (this.driverNotIn == null) {
      this.driverNotIn = new ArrayList<String>();
    }
    this.driverNotIn.add(driverNotInItem);
    return this;
  }

   /**
   * Get driverNotIn
   * @return driverNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDriverNotIn() {
    return driverNotIn;
  }


  public void setDriverNotIn(List<String> driverNotIn) {
    this.driverNotIn = driverNotIn;
  }


  public NicWhereInput driverNotStartsWith(String driverNotStartsWith) {
    
    this.driverNotStartsWith = driverNotStartsWith;
    return this;
  }

   /**
   * Get driverNotStartsWith
   * @return driverNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDriverNotStartsWith() {
    return driverNotStartsWith;
  }


  public void setDriverNotStartsWith(String driverNotStartsWith) {
    this.driverNotStartsWith = driverNotStartsWith;
  }


  public NicWhereInput driverStartsWith(String driverStartsWith) {
    
    this.driverStartsWith = driverStartsWith;
    return this;
  }

   /**
   * Get driverStartsWith
   * @return driverStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDriverStartsWith() {
    return driverStartsWith;
  }


  public void setDriverStartsWith(String driverStartsWith) {
    this.driverStartsWith = driverStartsWith;
  }


  public NicWhereInput driverState(NicDriverState driverState) {
    
    this.driverState = driverState;
    return this;
  }

   /**
   * Get driverState
   * @return driverState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NicDriverState getDriverState() {
    return driverState;
  }


  public void setDriverState(NicDriverState driverState) {
    this.driverState = driverState;
  }


  public NicWhereInput driverStateIn(List<NicDriverState> driverStateIn) {
    
    this.driverStateIn = driverStateIn;
    return this;
  }

  public NicWhereInput addDriverStateInItem(NicDriverState driverStateInItem) {
    if (this.driverStateIn == null) {
      this.driverStateIn = new ArrayList<NicDriverState>();
    }
    this.driverStateIn.add(driverStateInItem);
    return this;
  }

   /**
   * Get driverStateIn
   * @return driverStateIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NicDriverState> getDriverStateIn() {
    return driverStateIn;
  }


  public void setDriverStateIn(List<NicDriverState> driverStateIn) {
    this.driverStateIn = driverStateIn;
  }


  public NicWhereInput driverStateNot(NicDriverState driverStateNot) {
    
    this.driverStateNot = driverStateNot;
    return this;
  }

   /**
   * Get driverStateNot
   * @return driverStateNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NicDriverState getDriverStateNot() {
    return driverStateNot;
  }


  public void setDriverStateNot(NicDriverState driverStateNot) {
    this.driverStateNot = driverStateNot;
  }


  public NicWhereInput driverStateNotIn(List<NicDriverState> driverStateNotIn) {
    
    this.driverStateNotIn = driverStateNotIn;
    return this;
  }

  public NicWhereInput addDriverStateNotInItem(NicDriverState driverStateNotInItem) {
    if (this.driverStateNotIn == null) {
      this.driverStateNotIn = new ArrayList<NicDriverState>();
    }
    this.driverStateNotIn.add(driverStateNotInItem);
    return this;
  }

   /**
   * Get driverStateNotIn
   * @return driverStateNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NicDriverState> getDriverStateNotIn() {
    return driverStateNotIn;
  }


  public void setDriverStateNotIn(List<NicDriverState> driverStateNotIn) {
    this.driverStateNotIn = driverStateNotIn;
  }


  public NicWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public NicWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public NicWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public NicWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public NicWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public NicWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public NicWhereInput gatewayIp(String gatewayIp) {
    
    this.gatewayIp = gatewayIp;
    return this;
  }

   /**
   * Get gatewayIp
   * @return gatewayIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayIp() {
    return gatewayIp;
  }


  public void setGatewayIp(String gatewayIp) {
    this.gatewayIp = gatewayIp;
  }


  public NicWhereInput gatewayIpContains(String gatewayIpContains) {
    
    this.gatewayIpContains = gatewayIpContains;
    return this;
  }

   /**
   * Get gatewayIpContains
   * @return gatewayIpContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayIpContains() {
    return gatewayIpContains;
  }


  public void setGatewayIpContains(String gatewayIpContains) {
    this.gatewayIpContains = gatewayIpContains;
  }


  public NicWhereInput gatewayIpEndsWith(String gatewayIpEndsWith) {
    
    this.gatewayIpEndsWith = gatewayIpEndsWith;
    return this;
  }

   /**
   * Get gatewayIpEndsWith
   * @return gatewayIpEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayIpEndsWith() {
    return gatewayIpEndsWith;
  }


  public void setGatewayIpEndsWith(String gatewayIpEndsWith) {
    this.gatewayIpEndsWith = gatewayIpEndsWith;
  }


  public NicWhereInput gatewayIpGt(String gatewayIpGt) {
    
    this.gatewayIpGt = gatewayIpGt;
    return this;
  }

   /**
   * Get gatewayIpGt
   * @return gatewayIpGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayIpGt() {
    return gatewayIpGt;
  }


  public void setGatewayIpGt(String gatewayIpGt) {
    this.gatewayIpGt = gatewayIpGt;
  }


  public NicWhereInput gatewayIpGte(String gatewayIpGte) {
    
    this.gatewayIpGte = gatewayIpGte;
    return this;
  }

   /**
   * Get gatewayIpGte
   * @return gatewayIpGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayIpGte() {
    return gatewayIpGte;
  }


  public void setGatewayIpGte(String gatewayIpGte) {
    this.gatewayIpGte = gatewayIpGte;
  }


  public NicWhereInput gatewayIpIn(List<String> gatewayIpIn) {
    
    this.gatewayIpIn = gatewayIpIn;
    return this;
  }

  public NicWhereInput addGatewayIpInItem(String gatewayIpInItem) {
    if (this.gatewayIpIn == null) {
      this.gatewayIpIn = new ArrayList<String>();
    }
    this.gatewayIpIn.add(gatewayIpInItem);
    return this;
  }

   /**
   * Get gatewayIpIn
   * @return gatewayIpIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getGatewayIpIn() {
    return gatewayIpIn;
  }


  public void setGatewayIpIn(List<String> gatewayIpIn) {
    this.gatewayIpIn = gatewayIpIn;
  }


  public NicWhereInput gatewayIpLt(String gatewayIpLt) {
    
    this.gatewayIpLt = gatewayIpLt;
    return this;
  }

   /**
   * Get gatewayIpLt
   * @return gatewayIpLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayIpLt() {
    return gatewayIpLt;
  }


  public void setGatewayIpLt(String gatewayIpLt) {
    this.gatewayIpLt = gatewayIpLt;
  }


  public NicWhereInput gatewayIpLte(String gatewayIpLte) {
    
    this.gatewayIpLte = gatewayIpLte;
    return this;
  }

   /**
   * Get gatewayIpLte
   * @return gatewayIpLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayIpLte() {
    return gatewayIpLte;
  }


  public void setGatewayIpLte(String gatewayIpLte) {
    this.gatewayIpLte = gatewayIpLte;
  }


  public NicWhereInput gatewayIpNot(String gatewayIpNot) {
    
    this.gatewayIpNot = gatewayIpNot;
    return this;
  }

   /**
   * Get gatewayIpNot
   * @return gatewayIpNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayIpNot() {
    return gatewayIpNot;
  }


  public void setGatewayIpNot(String gatewayIpNot) {
    this.gatewayIpNot = gatewayIpNot;
  }


  public NicWhereInput gatewayIpNotContains(String gatewayIpNotContains) {
    
    this.gatewayIpNotContains = gatewayIpNotContains;
    return this;
  }

   /**
   * Get gatewayIpNotContains
   * @return gatewayIpNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayIpNotContains() {
    return gatewayIpNotContains;
  }


  public void setGatewayIpNotContains(String gatewayIpNotContains) {
    this.gatewayIpNotContains = gatewayIpNotContains;
  }


  public NicWhereInput gatewayIpNotEndsWith(String gatewayIpNotEndsWith) {
    
    this.gatewayIpNotEndsWith = gatewayIpNotEndsWith;
    return this;
  }

   /**
   * Get gatewayIpNotEndsWith
   * @return gatewayIpNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayIpNotEndsWith() {
    return gatewayIpNotEndsWith;
  }


  public void setGatewayIpNotEndsWith(String gatewayIpNotEndsWith) {
    this.gatewayIpNotEndsWith = gatewayIpNotEndsWith;
  }


  public NicWhereInput gatewayIpNotIn(List<String> gatewayIpNotIn) {
    
    this.gatewayIpNotIn = gatewayIpNotIn;
    return this;
  }

  public NicWhereInput addGatewayIpNotInItem(String gatewayIpNotInItem) {
    if (this.gatewayIpNotIn == null) {
      this.gatewayIpNotIn = new ArrayList<String>();
    }
    this.gatewayIpNotIn.add(gatewayIpNotInItem);
    return this;
  }

   /**
   * Get gatewayIpNotIn
   * @return gatewayIpNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getGatewayIpNotIn() {
    return gatewayIpNotIn;
  }


  public void setGatewayIpNotIn(List<String> gatewayIpNotIn) {
    this.gatewayIpNotIn = gatewayIpNotIn;
  }


  public NicWhereInput gatewayIpNotStartsWith(String gatewayIpNotStartsWith) {
    
    this.gatewayIpNotStartsWith = gatewayIpNotStartsWith;
    return this;
  }

   /**
   * Get gatewayIpNotStartsWith
   * @return gatewayIpNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayIpNotStartsWith() {
    return gatewayIpNotStartsWith;
  }


  public void setGatewayIpNotStartsWith(String gatewayIpNotStartsWith) {
    this.gatewayIpNotStartsWith = gatewayIpNotStartsWith;
  }


  public NicWhereInput gatewayIpStartsWith(String gatewayIpStartsWith) {
    
    this.gatewayIpStartsWith = gatewayIpStartsWith;
    return this;
  }

   /**
   * Get gatewayIpStartsWith
   * @return gatewayIpStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayIpStartsWith() {
    return gatewayIpStartsWith;
  }


  public void setGatewayIpStartsWith(String gatewayIpStartsWith) {
    this.gatewayIpStartsWith = gatewayIpStartsWith;
  }


  public NicWhereInput host(HostWhereInput host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostWhereInput getHost() {
    return host;
  }


  public void setHost(HostWhereInput host) {
    this.host = host;
  }


  public NicWhereInput ibdev(String ibdev) {
    
    this.ibdev = ibdev;
    return this;
  }

   /**
   * Get ibdev
   * @return ibdev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIbdev() {
    return ibdev;
  }


  public void setIbdev(String ibdev) {
    this.ibdev = ibdev;
  }


  public NicWhereInput ibdevContains(String ibdevContains) {
    
    this.ibdevContains = ibdevContains;
    return this;
  }

   /**
   * Get ibdevContains
   * @return ibdevContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIbdevContains() {
    return ibdevContains;
  }


  public void setIbdevContains(String ibdevContains) {
    this.ibdevContains = ibdevContains;
  }


  public NicWhereInput ibdevEndsWith(String ibdevEndsWith) {
    
    this.ibdevEndsWith = ibdevEndsWith;
    return this;
  }

   /**
   * Get ibdevEndsWith
   * @return ibdevEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIbdevEndsWith() {
    return ibdevEndsWith;
  }


  public void setIbdevEndsWith(String ibdevEndsWith) {
    this.ibdevEndsWith = ibdevEndsWith;
  }


  public NicWhereInput ibdevGt(String ibdevGt) {
    
    this.ibdevGt = ibdevGt;
    return this;
  }

   /**
   * Get ibdevGt
   * @return ibdevGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIbdevGt() {
    return ibdevGt;
  }


  public void setIbdevGt(String ibdevGt) {
    this.ibdevGt = ibdevGt;
  }


  public NicWhereInput ibdevGte(String ibdevGte) {
    
    this.ibdevGte = ibdevGte;
    return this;
  }

   /**
   * Get ibdevGte
   * @return ibdevGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIbdevGte() {
    return ibdevGte;
  }


  public void setIbdevGte(String ibdevGte) {
    this.ibdevGte = ibdevGte;
  }


  public NicWhereInput ibdevIn(List<String> ibdevIn) {
    
    this.ibdevIn = ibdevIn;
    return this;
  }

  public NicWhereInput addIbdevInItem(String ibdevInItem) {
    if (this.ibdevIn == null) {
      this.ibdevIn = new ArrayList<String>();
    }
    this.ibdevIn.add(ibdevInItem);
    return this;
  }

   /**
   * Get ibdevIn
   * @return ibdevIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIbdevIn() {
    return ibdevIn;
  }


  public void setIbdevIn(List<String> ibdevIn) {
    this.ibdevIn = ibdevIn;
  }


  public NicWhereInput ibdevLt(String ibdevLt) {
    
    this.ibdevLt = ibdevLt;
    return this;
  }

   /**
   * Get ibdevLt
   * @return ibdevLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIbdevLt() {
    return ibdevLt;
  }


  public void setIbdevLt(String ibdevLt) {
    this.ibdevLt = ibdevLt;
  }


  public NicWhereInput ibdevLte(String ibdevLte) {
    
    this.ibdevLte = ibdevLte;
    return this;
  }

   /**
   * Get ibdevLte
   * @return ibdevLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIbdevLte() {
    return ibdevLte;
  }


  public void setIbdevLte(String ibdevLte) {
    this.ibdevLte = ibdevLte;
  }


  public NicWhereInput ibdevNot(String ibdevNot) {
    
    this.ibdevNot = ibdevNot;
    return this;
  }

   /**
   * Get ibdevNot
   * @return ibdevNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIbdevNot() {
    return ibdevNot;
  }


  public void setIbdevNot(String ibdevNot) {
    this.ibdevNot = ibdevNot;
  }


  public NicWhereInput ibdevNotContains(String ibdevNotContains) {
    
    this.ibdevNotContains = ibdevNotContains;
    return this;
  }

   /**
   * Get ibdevNotContains
   * @return ibdevNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIbdevNotContains() {
    return ibdevNotContains;
  }


  public void setIbdevNotContains(String ibdevNotContains) {
    this.ibdevNotContains = ibdevNotContains;
  }


  public NicWhereInput ibdevNotEndsWith(String ibdevNotEndsWith) {
    
    this.ibdevNotEndsWith = ibdevNotEndsWith;
    return this;
  }

   /**
   * Get ibdevNotEndsWith
   * @return ibdevNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIbdevNotEndsWith() {
    return ibdevNotEndsWith;
  }


  public void setIbdevNotEndsWith(String ibdevNotEndsWith) {
    this.ibdevNotEndsWith = ibdevNotEndsWith;
  }


  public NicWhereInput ibdevNotIn(List<String> ibdevNotIn) {
    
    this.ibdevNotIn = ibdevNotIn;
    return this;
  }

  public NicWhereInput addIbdevNotInItem(String ibdevNotInItem) {
    if (this.ibdevNotIn == null) {
      this.ibdevNotIn = new ArrayList<String>();
    }
    this.ibdevNotIn.add(ibdevNotInItem);
    return this;
  }

   /**
   * Get ibdevNotIn
   * @return ibdevNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIbdevNotIn() {
    return ibdevNotIn;
  }


  public void setIbdevNotIn(List<String> ibdevNotIn) {
    this.ibdevNotIn = ibdevNotIn;
  }


  public NicWhereInput ibdevNotStartsWith(String ibdevNotStartsWith) {
    
    this.ibdevNotStartsWith = ibdevNotStartsWith;
    return this;
  }

   /**
   * Get ibdevNotStartsWith
   * @return ibdevNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIbdevNotStartsWith() {
    return ibdevNotStartsWith;
  }


  public void setIbdevNotStartsWith(String ibdevNotStartsWith) {
    this.ibdevNotStartsWith = ibdevNotStartsWith;
  }


  public NicWhereInput ibdevStartsWith(String ibdevStartsWith) {
    
    this.ibdevStartsWith = ibdevStartsWith;
    return this;
  }

   /**
   * Get ibdevStartsWith
   * @return ibdevStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIbdevStartsWith() {
    return ibdevStartsWith;
  }


  public void setIbdevStartsWith(String ibdevStartsWith) {
    this.ibdevStartsWith = ibdevStartsWith;
  }


  public NicWhereInput id(String id) {
    
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


  public NicWhereInput idContains(String idContains) {
    
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


  public NicWhereInput idEndsWith(String idEndsWith) {
    
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


  public NicWhereInput idGt(String idGt) {
    
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


  public NicWhereInput idGte(String idGte) {
    
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


  public NicWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public NicWhereInput addIdInItem(String idInItem) {
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


  public NicWhereInput idLt(String idLt) {
    
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


  public NicWhereInput idLte(String idLte) {
    
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


  public NicWhereInput idNot(String idNot) {
    
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


  public NicWhereInput idNotContains(String idNotContains) {
    
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


  public NicWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public NicWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public NicWhereInput addIdNotInItem(String idNotInItem) {
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


  public NicWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public NicWhereInput idStartsWith(String idStartsWith) {
    
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


  public NicWhereInput iommuStatus(IommuStatus iommuStatus) {
    
    this.iommuStatus = iommuStatus;
    return this;
  }

   /**
   * Get iommuStatus
   * @return iommuStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IommuStatus getIommuStatus() {
    return iommuStatus;
  }


  public void setIommuStatus(IommuStatus iommuStatus) {
    this.iommuStatus = iommuStatus;
  }


  public NicWhereInput iommuStatusIn(List<IommuStatus> iommuStatusIn) {
    
    this.iommuStatusIn = iommuStatusIn;
    return this;
  }

  public NicWhereInput addIommuStatusInItem(IommuStatus iommuStatusInItem) {
    if (this.iommuStatusIn == null) {
      this.iommuStatusIn = new ArrayList<IommuStatus>();
    }
    this.iommuStatusIn.add(iommuStatusInItem);
    return this;
  }

   /**
   * Get iommuStatusIn
   * @return iommuStatusIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IommuStatus> getIommuStatusIn() {
    return iommuStatusIn;
  }


  public void setIommuStatusIn(List<IommuStatus> iommuStatusIn) {
    this.iommuStatusIn = iommuStatusIn;
  }


  public NicWhereInput iommuStatusNot(IommuStatus iommuStatusNot) {
    
    this.iommuStatusNot = iommuStatusNot;
    return this;
  }

   /**
   * Get iommuStatusNot
   * @return iommuStatusNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IommuStatus getIommuStatusNot() {
    return iommuStatusNot;
  }


  public void setIommuStatusNot(IommuStatus iommuStatusNot) {
    this.iommuStatusNot = iommuStatusNot;
  }


  public NicWhereInput iommuStatusNotIn(List<IommuStatus> iommuStatusNotIn) {
    
    this.iommuStatusNotIn = iommuStatusNotIn;
    return this;
  }

  public NicWhereInput addIommuStatusNotInItem(IommuStatus iommuStatusNotInItem) {
    if (this.iommuStatusNotIn == null) {
      this.iommuStatusNotIn = new ArrayList<IommuStatus>();
    }
    this.iommuStatusNotIn.add(iommuStatusNotInItem);
    return this;
  }

   /**
   * Get iommuStatusNotIn
   * @return iommuStatusNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IommuStatus> getIommuStatusNotIn() {
    return iommuStatusNotIn;
  }


  public void setIommuStatusNotIn(List<IommuStatus> iommuStatusNotIn) {
    this.iommuStatusNotIn = iommuStatusNotIn;
  }


  public NicWhereInput ipAddress(String ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddress() {
    return ipAddress;
  }


  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public NicWhereInput ipAddressContains(String ipAddressContains) {
    
    this.ipAddressContains = ipAddressContains;
    return this;
  }

   /**
   * Get ipAddressContains
   * @return ipAddressContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressContains() {
    return ipAddressContains;
  }


  public void setIpAddressContains(String ipAddressContains) {
    this.ipAddressContains = ipAddressContains;
  }


  public NicWhereInput ipAddressEndsWith(String ipAddressEndsWith) {
    
    this.ipAddressEndsWith = ipAddressEndsWith;
    return this;
  }

   /**
   * Get ipAddressEndsWith
   * @return ipAddressEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressEndsWith() {
    return ipAddressEndsWith;
  }


  public void setIpAddressEndsWith(String ipAddressEndsWith) {
    this.ipAddressEndsWith = ipAddressEndsWith;
  }


  public NicWhereInput ipAddressGt(String ipAddressGt) {
    
    this.ipAddressGt = ipAddressGt;
    return this;
  }

   /**
   * Get ipAddressGt
   * @return ipAddressGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressGt() {
    return ipAddressGt;
  }


  public void setIpAddressGt(String ipAddressGt) {
    this.ipAddressGt = ipAddressGt;
  }


  public NicWhereInput ipAddressGte(String ipAddressGte) {
    
    this.ipAddressGte = ipAddressGte;
    return this;
  }

   /**
   * Get ipAddressGte
   * @return ipAddressGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressGte() {
    return ipAddressGte;
  }


  public void setIpAddressGte(String ipAddressGte) {
    this.ipAddressGte = ipAddressGte;
  }


  public NicWhereInput ipAddressIn(List<String> ipAddressIn) {
    
    this.ipAddressIn = ipAddressIn;
    return this;
  }

  public NicWhereInput addIpAddressInItem(String ipAddressInItem) {
    if (this.ipAddressIn == null) {
      this.ipAddressIn = new ArrayList<String>();
    }
    this.ipAddressIn.add(ipAddressInItem);
    return this;
  }

   /**
   * Get ipAddressIn
   * @return ipAddressIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIpAddressIn() {
    return ipAddressIn;
  }


  public void setIpAddressIn(List<String> ipAddressIn) {
    this.ipAddressIn = ipAddressIn;
  }


  public NicWhereInput ipAddressLt(String ipAddressLt) {
    
    this.ipAddressLt = ipAddressLt;
    return this;
  }

   /**
   * Get ipAddressLt
   * @return ipAddressLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressLt() {
    return ipAddressLt;
  }


  public void setIpAddressLt(String ipAddressLt) {
    this.ipAddressLt = ipAddressLt;
  }


  public NicWhereInput ipAddressLte(String ipAddressLte) {
    
    this.ipAddressLte = ipAddressLte;
    return this;
  }

   /**
   * Get ipAddressLte
   * @return ipAddressLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressLte() {
    return ipAddressLte;
  }


  public void setIpAddressLte(String ipAddressLte) {
    this.ipAddressLte = ipAddressLte;
  }


  public NicWhereInput ipAddressNot(String ipAddressNot) {
    
    this.ipAddressNot = ipAddressNot;
    return this;
  }

   /**
   * Get ipAddressNot
   * @return ipAddressNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressNot() {
    return ipAddressNot;
  }


  public void setIpAddressNot(String ipAddressNot) {
    this.ipAddressNot = ipAddressNot;
  }


  public NicWhereInput ipAddressNotContains(String ipAddressNotContains) {
    
    this.ipAddressNotContains = ipAddressNotContains;
    return this;
  }

   /**
   * Get ipAddressNotContains
   * @return ipAddressNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressNotContains() {
    return ipAddressNotContains;
  }


  public void setIpAddressNotContains(String ipAddressNotContains) {
    this.ipAddressNotContains = ipAddressNotContains;
  }


  public NicWhereInput ipAddressNotEndsWith(String ipAddressNotEndsWith) {
    
    this.ipAddressNotEndsWith = ipAddressNotEndsWith;
    return this;
  }

   /**
   * Get ipAddressNotEndsWith
   * @return ipAddressNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressNotEndsWith() {
    return ipAddressNotEndsWith;
  }


  public void setIpAddressNotEndsWith(String ipAddressNotEndsWith) {
    this.ipAddressNotEndsWith = ipAddressNotEndsWith;
  }


  public NicWhereInput ipAddressNotIn(List<String> ipAddressNotIn) {
    
    this.ipAddressNotIn = ipAddressNotIn;
    return this;
  }

  public NicWhereInput addIpAddressNotInItem(String ipAddressNotInItem) {
    if (this.ipAddressNotIn == null) {
      this.ipAddressNotIn = new ArrayList<String>();
    }
    this.ipAddressNotIn.add(ipAddressNotInItem);
    return this;
  }

   /**
   * Get ipAddressNotIn
   * @return ipAddressNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIpAddressNotIn() {
    return ipAddressNotIn;
  }


  public void setIpAddressNotIn(List<String> ipAddressNotIn) {
    this.ipAddressNotIn = ipAddressNotIn;
  }


  public NicWhereInput ipAddressNotStartsWith(String ipAddressNotStartsWith) {
    
    this.ipAddressNotStartsWith = ipAddressNotStartsWith;
    return this;
  }

   /**
   * Get ipAddressNotStartsWith
   * @return ipAddressNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressNotStartsWith() {
    return ipAddressNotStartsWith;
  }


  public void setIpAddressNotStartsWith(String ipAddressNotStartsWith) {
    this.ipAddressNotStartsWith = ipAddressNotStartsWith;
  }


  public NicWhereInput ipAddressStartsWith(String ipAddressStartsWith) {
    
    this.ipAddressStartsWith = ipAddressStartsWith;
    return this;
  }

   /**
   * Get ipAddressStartsWith
   * @return ipAddressStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressStartsWith() {
    return ipAddressStartsWith;
  }


  public void setIpAddressStartsWith(String ipAddressStartsWith) {
    this.ipAddressStartsWith = ipAddressStartsWith;
  }


  public NicWhereInput isSriov(Boolean isSriov) {
    
    this.isSriov = isSriov;
    return this;
  }

   /**
   * Get isSriov
   * @return isSriov
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsSriov() {
    return isSriov;
  }


  public void setIsSriov(Boolean isSriov) {
    this.isSriov = isSriov;
  }


  public NicWhereInput isSriovNot(Boolean isSriovNot) {
    
    this.isSriovNot = isSriovNot;
    return this;
  }

   /**
   * Get isSriovNot
   * @return isSriovNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsSriovNot() {
    return isSriovNot;
  }


  public void setIsSriovNot(Boolean isSriovNot) {
    this.isSriovNot = isSriovNot;
  }


  public NicWhereInput labelsEvery(LabelWhereInput labelsEvery) {
    
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


  public NicWhereInput labelsNone(LabelWhereInput labelsNone) {
    
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


  public NicWhereInput labelsSome(LabelWhereInput labelsSome) {
    
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


  public NicWhereInput localId(String localId) {
    
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


  public NicWhereInput localIdContains(String localIdContains) {
    
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


  public NicWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public NicWhereInput localIdGt(String localIdGt) {
    
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


  public NicWhereInput localIdGte(String localIdGte) {
    
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


  public NicWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public NicWhereInput addLocalIdInItem(String localIdInItem) {
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


  public NicWhereInput localIdLt(String localIdLt) {
    
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


  public NicWhereInput localIdLte(String localIdLte) {
    
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


  public NicWhereInput localIdNot(String localIdNot) {
    
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


  public NicWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public NicWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public NicWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public NicWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public NicWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public NicWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public NicWhereInput macAddress(String macAddress) {
    
    this.macAddress = macAddress;
    return this;
  }

   /**
   * Get macAddress
   * @return macAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddress() {
    return macAddress;
  }


  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }


  public NicWhereInput macAddressContains(String macAddressContains) {
    
    this.macAddressContains = macAddressContains;
    return this;
  }

   /**
   * Get macAddressContains
   * @return macAddressContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressContains() {
    return macAddressContains;
  }


  public void setMacAddressContains(String macAddressContains) {
    this.macAddressContains = macAddressContains;
  }


  public NicWhereInput macAddressEndsWith(String macAddressEndsWith) {
    
    this.macAddressEndsWith = macAddressEndsWith;
    return this;
  }

   /**
   * Get macAddressEndsWith
   * @return macAddressEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressEndsWith() {
    return macAddressEndsWith;
  }


  public void setMacAddressEndsWith(String macAddressEndsWith) {
    this.macAddressEndsWith = macAddressEndsWith;
  }


  public NicWhereInput macAddressGt(String macAddressGt) {
    
    this.macAddressGt = macAddressGt;
    return this;
  }

   /**
   * Get macAddressGt
   * @return macAddressGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressGt() {
    return macAddressGt;
  }


  public void setMacAddressGt(String macAddressGt) {
    this.macAddressGt = macAddressGt;
  }


  public NicWhereInput macAddressGte(String macAddressGte) {
    
    this.macAddressGte = macAddressGte;
    return this;
  }

   /**
   * Get macAddressGte
   * @return macAddressGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressGte() {
    return macAddressGte;
  }


  public void setMacAddressGte(String macAddressGte) {
    this.macAddressGte = macAddressGte;
  }


  public NicWhereInput macAddressIn(List<String> macAddressIn) {
    
    this.macAddressIn = macAddressIn;
    return this;
  }

  public NicWhereInput addMacAddressInItem(String macAddressInItem) {
    if (this.macAddressIn == null) {
      this.macAddressIn = new ArrayList<String>();
    }
    this.macAddressIn.add(macAddressInItem);
    return this;
  }

   /**
   * Get macAddressIn
   * @return macAddressIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMacAddressIn() {
    return macAddressIn;
  }


  public void setMacAddressIn(List<String> macAddressIn) {
    this.macAddressIn = macAddressIn;
  }


  public NicWhereInput macAddressLt(String macAddressLt) {
    
    this.macAddressLt = macAddressLt;
    return this;
  }

   /**
   * Get macAddressLt
   * @return macAddressLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressLt() {
    return macAddressLt;
  }


  public void setMacAddressLt(String macAddressLt) {
    this.macAddressLt = macAddressLt;
  }


  public NicWhereInput macAddressLte(String macAddressLte) {
    
    this.macAddressLte = macAddressLte;
    return this;
  }

   /**
   * Get macAddressLte
   * @return macAddressLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressLte() {
    return macAddressLte;
  }


  public void setMacAddressLte(String macAddressLte) {
    this.macAddressLte = macAddressLte;
  }


  public NicWhereInput macAddressNot(String macAddressNot) {
    
    this.macAddressNot = macAddressNot;
    return this;
  }

   /**
   * Get macAddressNot
   * @return macAddressNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressNot() {
    return macAddressNot;
  }


  public void setMacAddressNot(String macAddressNot) {
    this.macAddressNot = macAddressNot;
  }


  public NicWhereInput macAddressNotContains(String macAddressNotContains) {
    
    this.macAddressNotContains = macAddressNotContains;
    return this;
  }

   /**
   * Get macAddressNotContains
   * @return macAddressNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressNotContains() {
    return macAddressNotContains;
  }


  public void setMacAddressNotContains(String macAddressNotContains) {
    this.macAddressNotContains = macAddressNotContains;
  }


  public NicWhereInput macAddressNotEndsWith(String macAddressNotEndsWith) {
    
    this.macAddressNotEndsWith = macAddressNotEndsWith;
    return this;
  }

   /**
   * Get macAddressNotEndsWith
   * @return macAddressNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressNotEndsWith() {
    return macAddressNotEndsWith;
  }


  public void setMacAddressNotEndsWith(String macAddressNotEndsWith) {
    this.macAddressNotEndsWith = macAddressNotEndsWith;
  }


  public NicWhereInput macAddressNotIn(List<String> macAddressNotIn) {
    
    this.macAddressNotIn = macAddressNotIn;
    return this;
  }

  public NicWhereInput addMacAddressNotInItem(String macAddressNotInItem) {
    if (this.macAddressNotIn == null) {
      this.macAddressNotIn = new ArrayList<String>();
    }
    this.macAddressNotIn.add(macAddressNotInItem);
    return this;
  }

   /**
   * Get macAddressNotIn
   * @return macAddressNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMacAddressNotIn() {
    return macAddressNotIn;
  }


  public void setMacAddressNotIn(List<String> macAddressNotIn) {
    this.macAddressNotIn = macAddressNotIn;
  }


  public NicWhereInput macAddressNotStartsWith(String macAddressNotStartsWith) {
    
    this.macAddressNotStartsWith = macAddressNotStartsWith;
    return this;
  }

   /**
   * Get macAddressNotStartsWith
   * @return macAddressNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressNotStartsWith() {
    return macAddressNotStartsWith;
  }


  public void setMacAddressNotStartsWith(String macAddressNotStartsWith) {
    this.macAddressNotStartsWith = macAddressNotStartsWith;
  }


  public NicWhereInput macAddressStartsWith(String macAddressStartsWith) {
    
    this.macAddressStartsWith = macAddressStartsWith;
    return this;
  }

   /**
   * Get macAddressStartsWith
   * @return macAddressStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddressStartsWith() {
    return macAddressStartsWith;
  }


  public void setMacAddressStartsWith(String macAddressStartsWith) {
    this.macAddressStartsWith = macAddressStartsWith;
  }


  public NicWhereInput maxVfNum(Integer maxVfNum) {
    
    this.maxVfNum = maxVfNum;
    return this;
  }

   /**
   * Get maxVfNum
   * @return maxVfNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVfNum() {
    return maxVfNum;
  }


  public void setMaxVfNum(Integer maxVfNum) {
    this.maxVfNum = maxVfNum;
  }


  public NicWhereInput maxVfNumGt(Integer maxVfNumGt) {
    
    this.maxVfNumGt = maxVfNumGt;
    return this;
  }

   /**
   * Get maxVfNumGt
   * @return maxVfNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVfNumGt() {
    return maxVfNumGt;
  }


  public void setMaxVfNumGt(Integer maxVfNumGt) {
    this.maxVfNumGt = maxVfNumGt;
  }


  public NicWhereInput maxVfNumGte(Integer maxVfNumGte) {
    
    this.maxVfNumGte = maxVfNumGte;
    return this;
  }

   /**
   * Get maxVfNumGte
   * @return maxVfNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVfNumGte() {
    return maxVfNumGte;
  }


  public void setMaxVfNumGte(Integer maxVfNumGte) {
    this.maxVfNumGte = maxVfNumGte;
  }


  public NicWhereInput maxVfNumIn(List<Integer> maxVfNumIn) {
    
    this.maxVfNumIn = maxVfNumIn;
    return this;
  }

  public NicWhereInput addMaxVfNumInItem(Integer maxVfNumInItem) {
    if (this.maxVfNumIn == null) {
      this.maxVfNumIn = new ArrayList<Integer>();
    }
    this.maxVfNumIn.add(maxVfNumInItem);
    return this;
  }

   /**
   * Get maxVfNumIn
   * @return maxVfNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getMaxVfNumIn() {
    return maxVfNumIn;
  }


  public void setMaxVfNumIn(List<Integer> maxVfNumIn) {
    this.maxVfNumIn = maxVfNumIn;
  }


  public NicWhereInput maxVfNumLt(Integer maxVfNumLt) {
    
    this.maxVfNumLt = maxVfNumLt;
    return this;
  }

   /**
   * Get maxVfNumLt
   * @return maxVfNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVfNumLt() {
    return maxVfNumLt;
  }


  public void setMaxVfNumLt(Integer maxVfNumLt) {
    this.maxVfNumLt = maxVfNumLt;
  }


  public NicWhereInput maxVfNumLte(Integer maxVfNumLte) {
    
    this.maxVfNumLte = maxVfNumLte;
    return this;
  }

   /**
   * Get maxVfNumLte
   * @return maxVfNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVfNumLte() {
    return maxVfNumLte;
  }


  public void setMaxVfNumLte(Integer maxVfNumLte) {
    this.maxVfNumLte = maxVfNumLte;
  }


  public NicWhereInput maxVfNumNot(Integer maxVfNumNot) {
    
    this.maxVfNumNot = maxVfNumNot;
    return this;
  }

   /**
   * Get maxVfNumNot
   * @return maxVfNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVfNumNot() {
    return maxVfNumNot;
  }


  public void setMaxVfNumNot(Integer maxVfNumNot) {
    this.maxVfNumNot = maxVfNumNot;
  }


  public NicWhereInput maxVfNumNotIn(List<Integer> maxVfNumNotIn) {
    
    this.maxVfNumNotIn = maxVfNumNotIn;
    return this;
  }

  public NicWhereInput addMaxVfNumNotInItem(Integer maxVfNumNotInItem) {
    if (this.maxVfNumNotIn == null) {
      this.maxVfNumNotIn = new ArrayList<Integer>();
    }
    this.maxVfNumNotIn.add(maxVfNumNotInItem);
    return this;
  }

   /**
   * Get maxVfNumNotIn
   * @return maxVfNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getMaxVfNumNotIn() {
    return maxVfNumNotIn;
  }


  public void setMaxVfNumNotIn(List<Integer> maxVfNumNotIn) {
    this.maxVfNumNotIn = maxVfNumNotIn;
  }


  public NicWhereInput model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public NicWhereInput modelContains(String modelContains) {
    
    this.modelContains = modelContains;
    return this;
  }

   /**
   * Get modelContains
   * @return modelContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelContains() {
    return modelContains;
  }


  public void setModelContains(String modelContains) {
    this.modelContains = modelContains;
  }


  public NicWhereInput modelEndsWith(String modelEndsWith) {
    
    this.modelEndsWith = modelEndsWith;
    return this;
  }

   /**
   * Get modelEndsWith
   * @return modelEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelEndsWith() {
    return modelEndsWith;
  }


  public void setModelEndsWith(String modelEndsWith) {
    this.modelEndsWith = modelEndsWith;
  }


  public NicWhereInput modelGt(String modelGt) {
    
    this.modelGt = modelGt;
    return this;
  }

   /**
   * Get modelGt
   * @return modelGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelGt() {
    return modelGt;
  }


  public void setModelGt(String modelGt) {
    this.modelGt = modelGt;
  }


  public NicWhereInput modelGte(String modelGte) {
    
    this.modelGte = modelGte;
    return this;
  }

   /**
   * Get modelGte
   * @return modelGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelGte() {
    return modelGte;
  }


  public void setModelGte(String modelGte) {
    this.modelGte = modelGte;
  }


  public NicWhereInput modelIn(List<String> modelIn) {
    
    this.modelIn = modelIn;
    return this;
  }

  public NicWhereInput addModelInItem(String modelInItem) {
    if (this.modelIn == null) {
      this.modelIn = new ArrayList<String>();
    }
    this.modelIn.add(modelInItem);
    return this;
  }

   /**
   * Get modelIn
   * @return modelIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getModelIn() {
    return modelIn;
  }


  public void setModelIn(List<String> modelIn) {
    this.modelIn = modelIn;
  }


  public NicWhereInput modelLt(String modelLt) {
    
    this.modelLt = modelLt;
    return this;
  }

   /**
   * Get modelLt
   * @return modelLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelLt() {
    return modelLt;
  }


  public void setModelLt(String modelLt) {
    this.modelLt = modelLt;
  }


  public NicWhereInput modelLte(String modelLte) {
    
    this.modelLte = modelLte;
    return this;
  }

   /**
   * Get modelLte
   * @return modelLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelLte() {
    return modelLte;
  }


  public void setModelLte(String modelLte) {
    this.modelLte = modelLte;
  }


  public NicWhereInput modelNot(String modelNot) {
    
    this.modelNot = modelNot;
    return this;
  }

   /**
   * Get modelNot
   * @return modelNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelNot() {
    return modelNot;
  }


  public void setModelNot(String modelNot) {
    this.modelNot = modelNot;
  }


  public NicWhereInput modelNotContains(String modelNotContains) {
    
    this.modelNotContains = modelNotContains;
    return this;
  }

   /**
   * Get modelNotContains
   * @return modelNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelNotContains() {
    return modelNotContains;
  }


  public void setModelNotContains(String modelNotContains) {
    this.modelNotContains = modelNotContains;
  }


  public NicWhereInput modelNotEndsWith(String modelNotEndsWith) {
    
    this.modelNotEndsWith = modelNotEndsWith;
    return this;
  }

   /**
   * Get modelNotEndsWith
   * @return modelNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelNotEndsWith() {
    return modelNotEndsWith;
  }


  public void setModelNotEndsWith(String modelNotEndsWith) {
    this.modelNotEndsWith = modelNotEndsWith;
  }


  public NicWhereInput modelNotIn(List<String> modelNotIn) {
    
    this.modelNotIn = modelNotIn;
    return this;
  }

  public NicWhereInput addModelNotInItem(String modelNotInItem) {
    if (this.modelNotIn == null) {
      this.modelNotIn = new ArrayList<String>();
    }
    this.modelNotIn.add(modelNotInItem);
    return this;
  }

   /**
   * Get modelNotIn
   * @return modelNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getModelNotIn() {
    return modelNotIn;
  }


  public void setModelNotIn(List<String> modelNotIn) {
    this.modelNotIn = modelNotIn;
  }


  public NicWhereInput modelNotStartsWith(String modelNotStartsWith) {
    
    this.modelNotStartsWith = modelNotStartsWith;
    return this;
  }

   /**
   * Get modelNotStartsWith
   * @return modelNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelNotStartsWith() {
    return modelNotStartsWith;
  }


  public void setModelNotStartsWith(String modelNotStartsWith) {
    this.modelNotStartsWith = modelNotStartsWith;
  }


  public NicWhereInput modelStartsWith(String modelStartsWith) {
    
    this.modelStartsWith = modelStartsWith;
    return this;
  }

   /**
   * Get modelStartsWith
   * @return modelStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelStartsWith() {
    return modelStartsWith;
  }


  public void setModelStartsWith(String modelStartsWith) {
    this.modelStartsWith = modelStartsWith;
  }


  public NicWhereInput mtu(Integer mtu) {
    
    this.mtu = mtu;
    return this;
  }

   /**
   * Get mtu
   * @return mtu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMtu() {
    return mtu;
  }


  public void setMtu(Integer mtu) {
    this.mtu = mtu;
  }


  public NicWhereInput mtuGt(Integer mtuGt) {
    
    this.mtuGt = mtuGt;
    return this;
  }

   /**
   * Get mtuGt
   * @return mtuGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMtuGt() {
    return mtuGt;
  }


  public void setMtuGt(Integer mtuGt) {
    this.mtuGt = mtuGt;
  }


  public NicWhereInput mtuGte(Integer mtuGte) {
    
    this.mtuGte = mtuGte;
    return this;
  }

   /**
   * Get mtuGte
   * @return mtuGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMtuGte() {
    return mtuGte;
  }


  public void setMtuGte(Integer mtuGte) {
    this.mtuGte = mtuGte;
  }


  public NicWhereInput mtuIn(List<Integer> mtuIn) {
    
    this.mtuIn = mtuIn;
    return this;
  }

  public NicWhereInput addMtuInItem(Integer mtuInItem) {
    if (this.mtuIn == null) {
      this.mtuIn = new ArrayList<Integer>();
    }
    this.mtuIn.add(mtuInItem);
    return this;
  }

   /**
   * Get mtuIn
   * @return mtuIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getMtuIn() {
    return mtuIn;
  }


  public void setMtuIn(List<Integer> mtuIn) {
    this.mtuIn = mtuIn;
  }


  public NicWhereInput mtuLt(Integer mtuLt) {
    
    this.mtuLt = mtuLt;
    return this;
  }

   /**
   * Get mtuLt
   * @return mtuLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMtuLt() {
    return mtuLt;
  }


  public void setMtuLt(Integer mtuLt) {
    this.mtuLt = mtuLt;
  }


  public NicWhereInput mtuLte(Integer mtuLte) {
    
    this.mtuLte = mtuLte;
    return this;
  }

   /**
   * Get mtuLte
   * @return mtuLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMtuLte() {
    return mtuLte;
  }


  public void setMtuLte(Integer mtuLte) {
    this.mtuLte = mtuLte;
  }


  public NicWhereInput mtuNot(Integer mtuNot) {
    
    this.mtuNot = mtuNot;
    return this;
  }

   /**
   * Get mtuNot
   * @return mtuNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMtuNot() {
    return mtuNot;
  }


  public void setMtuNot(Integer mtuNot) {
    this.mtuNot = mtuNot;
  }


  public NicWhereInput mtuNotIn(List<Integer> mtuNotIn) {
    
    this.mtuNotIn = mtuNotIn;
    return this;
  }

  public NicWhereInput addMtuNotInItem(Integer mtuNotInItem) {
    if (this.mtuNotIn == null) {
      this.mtuNotIn = new ArrayList<Integer>();
    }
    this.mtuNotIn.add(mtuNotInItem);
    return this;
  }

   /**
   * Get mtuNotIn
   * @return mtuNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getMtuNotIn() {
    return mtuNotIn;
  }


  public void setMtuNotIn(List<Integer> mtuNotIn) {
    this.mtuNotIn = mtuNotIn;
  }


  public NicWhereInput name(String name) {
    
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


  public NicWhereInput nameContains(String nameContains) {
    
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


  public NicWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public NicWhereInput nameGt(String nameGt) {
    
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


  public NicWhereInput nameGte(String nameGte) {
    
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


  public NicWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public NicWhereInput addNameInItem(String nameInItem) {
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


  public NicWhereInput nameLt(String nameLt) {
    
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


  public NicWhereInput nameLte(String nameLte) {
    
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


  public NicWhereInput nameNot(String nameNot) {
    
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


  public NicWhereInput nameNotContains(String nameNotContains) {
    
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


  public NicWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public NicWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public NicWhereInput addNameNotInItem(String nameNotInItem) {
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


  public NicWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public NicWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public NicWhereInput nicUuid(String nicUuid) {
    
    this.nicUuid = nicUuid;
    return this;
  }

   /**
   * Get nicUuid
   * @return nicUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNicUuid() {
    return nicUuid;
  }


  public void setNicUuid(String nicUuid) {
    this.nicUuid = nicUuid;
  }


  public NicWhereInput nicUuidContains(String nicUuidContains) {
    
    this.nicUuidContains = nicUuidContains;
    return this;
  }

   /**
   * Get nicUuidContains
   * @return nicUuidContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNicUuidContains() {
    return nicUuidContains;
  }


  public void setNicUuidContains(String nicUuidContains) {
    this.nicUuidContains = nicUuidContains;
  }


  public NicWhereInput nicUuidEndsWith(String nicUuidEndsWith) {
    
    this.nicUuidEndsWith = nicUuidEndsWith;
    return this;
  }

   /**
   * Get nicUuidEndsWith
   * @return nicUuidEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNicUuidEndsWith() {
    return nicUuidEndsWith;
  }


  public void setNicUuidEndsWith(String nicUuidEndsWith) {
    this.nicUuidEndsWith = nicUuidEndsWith;
  }


  public NicWhereInput nicUuidGt(String nicUuidGt) {
    
    this.nicUuidGt = nicUuidGt;
    return this;
  }

   /**
   * Get nicUuidGt
   * @return nicUuidGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNicUuidGt() {
    return nicUuidGt;
  }


  public void setNicUuidGt(String nicUuidGt) {
    this.nicUuidGt = nicUuidGt;
  }


  public NicWhereInput nicUuidGte(String nicUuidGte) {
    
    this.nicUuidGte = nicUuidGte;
    return this;
  }

   /**
   * Get nicUuidGte
   * @return nicUuidGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNicUuidGte() {
    return nicUuidGte;
  }


  public void setNicUuidGte(String nicUuidGte) {
    this.nicUuidGte = nicUuidGte;
  }


  public NicWhereInput nicUuidIn(List<String> nicUuidIn) {
    
    this.nicUuidIn = nicUuidIn;
    return this;
  }

  public NicWhereInput addNicUuidInItem(String nicUuidInItem) {
    if (this.nicUuidIn == null) {
      this.nicUuidIn = new ArrayList<String>();
    }
    this.nicUuidIn.add(nicUuidInItem);
    return this;
  }

   /**
   * Get nicUuidIn
   * @return nicUuidIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNicUuidIn() {
    return nicUuidIn;
  }


  public void setNicUuidIn(List<String> nicUuidIn) {
    this.nicUuidIn = nicUuidIn;
  }


  public NicWhereInput nicUuidLt(String nicUuidLt) {
    
    this.nicUuidLt = nicUuidLt;
    return this;
  }

   /**
   * Get nicUuidLt
   * @return nicUuidLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNicUuidLt() {
    return nicUuidLt;
  }


  public void setNicUuidLt(String nicUuidLt) {
    this.nicUuidLt = nicUuidLt;
  }


  public NicWhereInput nicUuidLte(String nicUuidLte) {
    
    this.nicUuidLte = nicUuidLte;
    return this;
  }

   /**
   * Get nicUuidLte
   * @return nicUuidLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNicUuidLte() {
    return nicUuidLte;
  }


  public void setNicUuidLte(String nicUuidLte) {
    this.nicUuidLte = nicUuidLte;
  }


  public NicWhereInput nicUuidNot(String nicUuidNot) {
    
    this.nicUuidNot = nicUuidNot;
    return this;
  }

   /**
   * Get nicUuidNot
   * @return nicUuidNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNicUuidNot() {
    return nicUuidNot;
  }


  public void setNicUuidNot(String nicUuidNot) {
    this.nicUuidNot = nicUuidNot;
  }


  public NicWhereInput nicUuidNotContains(String nicUuidNotContains) {
    
    this.nicUuidNotContains = nicUuidNotContains;
    return this;
  }

   /**
   * Get nicUuidNotContains
   * @return nicUuidNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNicUuidNotContains() {
    return nicUuidNotContains;
  }


  public void setNicUuidNotContains(String nicUuidNotContains) {
    this.nicUuidNotContains = nicUuidNotContains;
  }


  public NicWhereInput nicUuidNotEndsWith(String nicUuidNotEndsWith) {
    
    this.nicUuidNotEndsWith = nicUuidNotEndsWith;
    return this;
  }

   /**
   * Get nicUuidNotEndsWith
   * @return nicUuidNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNicUuidNotEndsWith() {
    return nicUuidNotEndsWith;
  }


  public void setNicUuidNotEndsWith(String nicUuidNotEndsWith) {
    this.nicUuidNotEndsWith = nicUuidNotEndsWith;
  }


  public NicWhereInput nicUuidNotIn(List<String> nicUuidNotIn) {
    
    this.nicUuidNotIn = nicUuidNotIn;
    return this;
  }

  public NicWhereInput addNicUuidNotInItem(String nicUuidNotInItem) {
    if (this.nicUuidNotIn == null) {
      this.nicUuidNotIn = new ArrayList<String>();
    }
    this.nicUuidNotIn.add(nicUuidNotInItem);
    return this;
  }

   /**
   * Get nicUuidNotIn
   * @return nicUuidNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNicUuidNotIn() {
    return nicUuidNotIn;
  }


  public void setNicUuidNotIn(List<String> nicUuidNotIn) {
    this.nicUuidNotIn = nicUuidNotIn;
  }


  public NicWhereInput nicUuidNotStartsWith(String nicUuidNotStartsWith) {
    
    this.nicUuidNotStartsWith = nicUuidNotStartsWith;
    return this;
  }

   /**
   * Get nicUuidNotStartsWith
   * @return nicUuidNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNicUuidNotStartsWith() {
    return nicUuidNotStartsWith;
  }


  public void setNicUuidNotStartsWith(String nicUuidNotStartsWith) {
    this.nicUuidNotStartsWith = nicUuidNotStartsWith;
  }


  public NicWhereInput nicUuidStartsWith(String nicUuidStartsWith) {
    
    this.nicUuidStartsWith = nicUuidStartsWith;
    return this;
  }

   /**
   * Get nicUuidStartsWith
   * @return nicUuidStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNicUuidStartsWith() {
    return nicUuidStartsWith;
  }


  public void setNicUuidStartsWith(String nicUuidStartsWith) {
    this.nicUuidStartsWith = nicUuidStartsWith;
  }


  public NicWhereInput physical(Boolean physical) {
    
    this.physical = physical;
    return this;
  }

   /**
   * Get physical
   * @return physical
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPhysical() {
    return physical;
  }


  public void setPhysical(Boolean physical) {
    this.physical = physical;
  }


  public NicWhereInput physicalNot(Boolean physicalNot) {
    
    this.physicalNot = physicalNot;
    return this;
  }

   /**
   * Get physicalNot
   * @return physicalNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPhysicalNot() {
    return physicalNot;
  }


  public void setPhysicalNot(Boolean physicalNot) {
    this.physicalNot = physicalNot;
  }


  public NicWhereInput rdmaEnabled(Boolean rdmaEnabled) {
    
    this.rdmaEnabled = rdmaEnabled;
    return this;
  }

   /**
   * Get rdmaEnabled
   * @return rdmaEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRdmaEnabled() {
    return rdmaEnabled;
  }


  public void setRdmaEnabled(Boolean rdmaEnabled) {
    this.rdmaEnabled = rdmaEnabled;
  }


  public NicWhereInput rdmaEnabledNot(Boolean rdmaEnabledNot) {
    
    this.rdmaEnabledNot = rdmaEnabledNot;
    return this;
  }

   /**
   * Get rdmaEnabledNot
   * @return rdmaEnabledNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRdmaEnabledNot() {
    return rdmaEnabledNot;
  }


  public void setRdmaEnabledNot(Boolean rdmaEnabledNot) {
    this.rdmaEnabledNot = rdmaEnabledNot;
  }


  public NicWhereInput running(Boolean running) {
    
    this.running = running;
    return this;
  }

   /**
   * Get running
   * @return running
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRunning() {
    return running;
  }


  public void setRunning(Boolean running) {
    this.running = running;
  }


  public NicWhereInput runningNot(Boolean runningNot) {
    
    this.runningNot = runningNot;
    return this;
  }

   /**
   * Get runningNot
   * @return runningNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRunningNot() {
    return runningNot;
  }


  public void setRunningNot(Boolean runningNot) {
    this.runningNot = runningNot;
  }


  public NicWhereInput speed(Long speed) {
    
    this.speed = speed;
    return this;
  }

   /**
   * Get speed
   * @return speed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSpeed() {
    return speed;
  }


  public void setSpeed(Long speed) {
    this.speed = speed;
  }


  public NicWhereInput speedGt(Long speedGt) {
    
    this.speedGt = speedGt;
    return this;
  }

   /**
   * Get speedGt
   * @return speedGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSpeedGt() {
    return speedGt;
  }


  public void setSpeedGt(Long speedGt) {
    this.speedGt = speedGt;
  }


  public NicWhereInput speedGte(Long speedGte) {
    
    this.speedGte = speedGte;
    return this;
  }

   /**
   * Get speedGte
   * @return speedGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSpeedGte() {
    return speedGte;
  }


  public void setSpeedGte(Long speedGte) {
    this.speedGte = speedGte;
  }


  public NicWhereInput speedIn(List<Long> speedIn) {
    
    this.speedIn = speedIn;
    return this;
  }

  public NicWhereInput addSpeedInItem(Long speedInItem) {
    if (this.speedIn == null) {
      this.speedIn = new ArrayList<Long>();
    }
    this.speedIn.add(speedInItem);
    return this;
  }

   /**
   * Get speedIn
   * @return speedIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getSpeedIn() {
    return speedIn;
  }


  public void setSpeedIn(List<Long> speedIn) {
    this.speedIn = speedIn;
  }


  public NicWhereInput speedLt(Long speedLt) {
    
    this.speedLt = speedLt;
    return this;
  }

   /**
   * Get speedLt
   * @return speedLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSpeedLt() {
    return speedLt;
  }


  public void setSpeedLt(Long speedLt) {
    this.speedLt = speedLt;
  }


  public NicWhereInput speedLte(Long speedLte) {
    
    this.speedLte = speedLte;
    return this;
  }

   /**
   * Get speedLte
   * @return speedLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSpeedLte() {
    return speedLte;
  }


  public void setSpeedLte(Long speedLte) {
    this.speedLte = speedLte;
  }


  public NicWhereInput speedNot(Long speedNot) {
    
    this.speedNot = speedNot;
    return this;
  }

   /**
   * Get speedNot
   * @return speedNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSpeedNot() {
    return speedNot;
  }


  public void setSpeedNot(Long speedNot) {
    this.speedNot = speedNot;
  }


  public NicWhereInput speedNotIn(List<Long> speedNotIn) {
    
    this.speedNotIn = speedNotIn;
    return this;
  }

  public NicWhereInput addSpeedNotInItem(Long speedNotInItem) {
    if (this.speedNotIn == null) {
      this.speedNotIn = new ArrayList<Long>();
    }
    this.speedNotIn.add(speedNotInItem);
    return this;
  }

   /**
   * Get speedNotIn
   * @return speedNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getSpeedNotIn() {
    return speedNotIn;
  }


  public void setSpeedNotIn(List<Long> speedNotIn) {
    this.speedNotIn = speedNotIn;
  }


  public NicWhereInput subnetMask(String subnetMask) {
    
    this.subnetMask = subnetMask;
    return this;
  }

   /**
   * Get subnetMask
   * @return subnetMask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMask() {
    return subnetMask;
  }


  public void setSubnetMask(String subnetMask) {
    this.subnetMask = subnetMask;
  }


  public NicWhereInput subnetMaskContains(String subnetMaskContains) {
    
    this.subnetMaskContains = subnetMaskContains;
    return this;
  }

   /**
   * Get subnetMaskContains
   * @return subnetMaskContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskContains() {
    return subnetMaskContains;
  }


  public void setSubnetMaskContains(String subnetMaskContains) {
    this.subnetMaskContains = subnetMaskContains;
  }


  public NicWhereInput subnetMaskEndsWith(String subnetMaskEndsWith) {
    
    this.subnetMaskEndsWith = subnetMaskEndsWith;
    return this;
  }

   /**
   * Get subnetMaskEndsWith
   * @return subnetMaskEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskEndsWith() {
    return subnetMaskEndsWith;
  }


  public void setSubnetMaskEndsWith(String subnetMaskEndsWith) {
    this.subnetMaskEndsWith = subnetMaskEndsWith;
  }


  public NicWhereInput subnetMaskGt(String subnetMaskGt) {
    
    this.subnetMaskGt = subnetMaskGt;
    return this;
  }

   /**
   * Get subnetMaskGt
   * @return subnetMaskGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskGt() {
    return subnetMaskGt;
  }


  public void setSubnetMaskGt(String subnetMaskGt) {
    this.subnetMaskGt = subnetMaskGt;
  }


  public NicWhereInput subnetMaskGte(String subnetMaskGte) {
    
    this.subnetMaskGte = subnetMaskGte;
    return this;
  }

   /**
   * Get subnetMaskGte
   * @return subnetMaskGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskGte() {
    return subnetMaskGte;
  }


  public void setSubnetMaskGte(String subnetMaskGte) {
    this.subnetMaskGte = subnetMaskGte;
  }


  public NicWhereInput subnetMaskIn(List<String> subnetMaskIn) {
    
    this.subnetMaskIn = subnetMaskIn;
    return this;
  }

  public NicWhereInput addSubnetMaskInItem(String subnetMaskInItem) {
    if (this.subnetMaskIn == null) {
      this.subnetMaskIn = new ArrayList<String>();
    }
    this.subnetMaskIn.add(subnetMaskInItem);
    return this;
  }

   /**
   * Get subnetMaskIn
   * @return subnetMaskIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSubnetMaskIn() {
    return subnetMaskIn;
  }


  public void setSubnetMaskIn(List<String> subnetMaskIn) {
    this.subnetMaskIn = subnetMaskIn;
  }


  public NicWhereInput subnetMaskLt(String subnetMaskLt) {
    
    this.subnetMaskLt = subnetMaskLt;
    return this;
  }

   /**
   * Get subnetMaskLt
   * @return subnetMaskLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskLt() {
    return subnetMaskLt;
  }


  public void setSubnetMaskLt(String subnetMaskLt) {
    this.subnetMaskLt = subnetMaskLt;
  }


  public NicWhereInput subnetMaskLte(String subnetMaskLte) {
    
    this.subnetMaskLte = subnetMaskLte;
    return this;
  }

   /**
   * Get subnetMaskLte
   * @return subnetMaskLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskLte() {
    return subnetMaskLte;
  }


  public void setSubnetMaskLte(String subnetMaskLte) {
    this.subnetMaskLte = subnetMaskLte;
  }


  public NicWhereInput subnetMaskNot(String subnetMaskNot) {
    
    this.subnetMaskNot = subnetMaskNot;
    return this;
  }

   /**
   * Get subnetMaskNot
   * @return subnetMaskNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskNot() {
    return subnetMaskNot;
  }


  public void setSubnetMaskNot(String subnetMaskNot) {
    this.subnetMaskNot = subnetMaskNot;
  }


  public NicWhereInput subnetMaskNotContains(String subnetMaskNotContains) {
    
    this.subnetMaskNotContains = subnetMaskNotContains;
    return this;
  }

   /**
   * Get subnetMaskNotContains
   * @return subnetMaskNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskNotContains() {
    return subnetMaskNotContains;
  }


  public void setSubnetMaskNotContains(String subnetMaskNotContains) {
    this.subnetMaskNotContains = subnetMaskNotContains;
  }


  public NicWhereInput subnetMaskNotEndsWith(String subnetMaskNotEndsWith) {
    
    this.subnetMaskNotEndsWith = subnetMaskNotEndsWith;
    return this;
  }

   /**
   * Get subnetMaskNotEndsWith
   * @return subnetMaskNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskNotEndsWith() {
    return subnetMaskNotEndsWith;
  }


  public void setSubnetMaskNotEndsWith(String subnetMaskNotEndsWith) {
    this.subnetMaskNotEndsWith = subnetMaskNotEndsWith;
  }


  public NicWhereInput subnetMaskNotIn(List<String> subnetMaskNotIn) {
    
    this.subnetMaskNotIn = subnetMaskNotIn;
    return this;
  }

  public NicWhereInput addSubnetMaskNotInItem(String subnetMaskNotInItem) {
    if (this.subnetMaskNotIn == null) {
      this.subnetMaskNotIn = new ArrayList<String>();
    }
    this.subnetMaskNotIn.add(subnetMaskNotInItem);
    return this;
  }

   /**
   * Get subnetMaskNotIn
   * @return subnetMaskNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSubnetMaskNotIn() {
    return subnetMaskNotIn;
  }


  public void setSubnetMaskNotIn(List<String> subnetMaskNotIn) {
    this.subnetMaskNotIn = subnetMaskNotIn;
  }


  public NicWhereInput subnetMaskNotStartsWith(String subnetMaskNotStartsWith) {
    
    this.subnetMaskNotStartsWith = subnetMaskNotStartsWith;
    return this;
  }

   /**
   * Get subnetMaskNotStartsWith
   * @return subnetMaskNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskNotStartsWith() {
    return subnetMaskNotStartsWith;
  }


  public void setSubnetMaskNotStartsWith(String subnetMaskNotStartsWith) {
    this.subnetMaskNotStartsWith = subnetMaskNotStartsWith;
  }


  public NicWhereInput subnetMaskStartsWith(String subnetMaskStartsWith) {
    
    this.subnetMaskStartsWith = subnetMaskStartsWith;
    return this;
  }

   /**
   * Get subnetMaskStartsWith
   * @return subnetMaskStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMaskStartsWith() {
    return subnetMaskStartsWith;
  }


  public void setSubnetMaskStartsWith(String subnetMaskStartsWith) {
    this.subnetMaskStartsWith = subnetMaskStartsWith;
  }


  public NicWhereInput totalVfNum(Integer totalVfNum) {
    
    this.totalVfNum = totalVfNum;
    return this;
  }

   /**
   * Get totalVfNum
   * @return totalVfNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalVfNum() {
    return totalVfNum;
  }


  public void setTotalVfNum(Integer totalVfNum) {
    this.totalVfNum = totalVfNum;
  }


  public NicWhereInput totalVfNumGt(Integer totalVfNumGt) {
    
    this.totalVfNumGt = totalVfNumGt;
    return this;
  }

   /**
   * Get totalVfNumGt
   * @return totalVfNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalVfNumGt() {
    return totalVfNumGt;
  }


  public void setTotalVfNumGt(Integer totalVfNumGt) {
    this.totalVfNumGt = totalVfNumGt;
  }


  public NicWhereInput totalVfNumGte(Integer totalVfNumGte) {
    
    this.totalVfNumGte = totalVfNumGte;
    return this;
  }

   /**
   * Get totalVfNumGte
   * @return totalVfNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalVfNumGte() {
    return totalVfNumGte;
  }


  public void setTotalVfNumGte(Integer totalVfNumGte) {
    this.totalVfNumGte = totalVfNumGte;
  }


  public NicWhereInput totalVfNumIn(List<Integer> totalVfNumIn) {
    
    this.totalVfNumIn = totalVfNumIn;
    return this;
  }

  public NicWhereInput addTotalVfNumInItem(Integer totalVfNumInItem) {
    if (this.totalVfNumIn == null) {
      this.totalVfNumIn = new ArrayList<Integer>();
    }
    this.totalVfNumIn.add(totalVfNumInItem);
    return this;
  }

   /**
   * Get totalVfNumIn
   * @return totalVfNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getTotalVfNumIn() {
    return totalVfNumIn;
  }


  public void setTotalVfNumIn(List<Integer> totalVfNumIn) {
    this.totalVfNumIn = totalVfNumIn;
  }


  public NicWhereInput totalVfNumLt(Integer totalVfNumLt) {
    
    this.totalVfNumLt = totalVfNumLt;
    return this;
  }

   /**
   * Get totalVfNumLt
   * @return totalVfNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalVfNumLt() {
    return totalVfNumLt;
  }


  public void setTotalVfNumLt(Integer totalVfNumLt) {
    this.totalVfNumLt = totalVfNumLt;
  }


  public NicWhereInput totalVfNumLte(Integer totalVfNumLte) {
    
    this.totalVfNumLte = totalVfNumLte;
    return this;
  }

   /**
   * Get totalVfNumLte
   * @return totalVfNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalVfNumLte() {
    return totalVfNumLte;
  }


  public void setTotalVfNumLte(Integer totalVfNumLte) {
    this.totalVfNumLte = totalVfNumLte;
  }


  public NicWhereInput totalVfNumNot(Integer totalVfNumNot) {
    
    this.totalVfNumNot = totalVfNumNot;
    return this;
  }

   /**
   * Get totalVfNumNot
   * @return totalVfNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalVfNumNot() {
    return totalVfNumNot;
  }


  public void setTotalVfNumNot(Integer totalVfNumNot) {
    this.totalVfNumNot = totalVfNumNot;
  }


  public NicWhereInput totalVfNumNotIn(List<Integer> totalVfNumNotIn) {
    
    this.totalVfNumNotIn = totalVfNumNotIn;
    return this;
  }

  public NicWhereInput addTotalVfNumNotInItem(Integer totalVfNumNotInItem) {
    if (this.totalVfNumNotIn == null) {
      this.totalVfNumNotIn = new ArrayList<Integer>();
    }
    this.totalVfNumNotIn.add(totalVfNumNotInItem);
    return this;
  }

   /**
   * Get totalVfNumNotIn
   * @return totalVfNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getTotalVfNumNotIn() {
    return totalVfNumNotIn;
  }


  public void setTotalVfNumNotIn(List<Integer> totalVfNumNotIn) {
    this.totalVfNumNotIn = totalVfNumNotIn;
  }


  public NicWhereInput type(NetworkType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NetworkType getType() {
    return type;
  }


  public void setType(NetworkType type) {
    this.type = type;
  }


  public NicWhereInput typeIn(List<NetworkType> typeIn) {
    
    this.typeIn = typeIn;
    return this;
  }

  public NicWhereInput addTypeInItem(NetworkType typeInItem) {
    if (this.typeIn == null) {
      this.typeIn = new ArrayList<NetworkType>();
    }
    this.typeIn.add(typeInItem);
    return this;
  }

   /**
   * Get typeIn
   * @return typeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NetworkType> getTypeIn() {
    return typeIn;
  }


  public void setTypeIn(List<NetworkType> typeIn) {
    this.typeIn = typeIn;
  }


  public NicWhereInput typeNot(NetworkType typeNot) {
    
    this.typeNot = typeNot;
    return this;
  }

   /**
   * Get typeNot
   * @return typeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NetworkType getTypeNot() {
    return typeNot;
  }


  public void setTypeNot(NetworkType typeNot) {
    this.typeNot = typeNot;
  }


  public NicWhereInput typeNotIn(List<NetworkType> typeNotIn) {
    
    this.typeNotIn = typeNotIn;
    return this;
  }

  public NicWhereInput addTypeNotInItem(NetworkType typeNotInItem) {
    if (this.typeNotIn == null) {
      this.typeNotIn = new ArrayList<NetworkType>();
    }
    this.typeNotIn.add(typeNotInItem);
    return this;
  }

   /**
   * Get typeNotIn
   * @return typeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NetworkType> getTypeNotIn() {
    return typeNotIn;
  }


  public void setTypeNotIn(List<NetworkType> typeNotIn) {
    this.typeNotIn = typeNotIn;
  }


  public NicWhereInput up(Boolean up) {
    
    this.up = up;
    return this;
  }

   /**
   * Get up
   * @return up
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUp() {
    return up;
  }


  public void setUp(Boolean up) {
    this.up = up;
  }


  public NicWhereInput upNot(Boolean upNot) {
    
    this.upNot = upNot;
    return this;
  }

   /**
   * Get upNot
   * @return upNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUpNot() {
    return upNot;
  }


  public void setUpNot(Boolean upNot) {
    this.upNot = upNot;
  }


  public NicWhereInput usedVfNum(Integer usedVfNum) {
    
    this.usedVfNum = usedVfNum;
    return this;
  }

   /**
   * Get usedVfNum
   * @return usedVfNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUsedVfNum() {
    return usedVfNum;
  }


  public void setUsedVfNum(Integer usedVfNum) {
    this.usedVfNum = usedVfNum;
  }


  public NicWhereInput usedVfNumGt(Integer usedVfNumGt) {
    
    this.usedVfNumGt = usedVfNumGt;
    return this;
  }

   /**
   * Get usedVfNumGt
   * @return usedVfNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUsedVfNumGt() {
    return usedVfNumGt;
  }


  public void setUsedVfNumGt(Integer usedVfNumGt) {
    this.usedVfNumGt = usedVfNumGt;
  }


  public NicWhereInput usedVfNumGte(Integer usedVfNumGte) {
    
    this.usedVfNumGte = usedVfNumGte;
    return this;
  }

   /**
   * Get usedVfNumGte
   * @return usedVfNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUsedVfNumGte() {
    return usedVfNumGte;
  }


  public void setUsedVfNumGte(Integer usedVfNumGte) {
    this.usedVfNumGte = usedVfNumGte;
  }


  public NicWhereInput usedVfNumIn(List<Integer> usedVfNumIn) {
    
    this.usedVfNumIn = usedVfNumIn;
    return this;
  }

  public NicWhereInput addUsedVfNumInItem(Integer usedVfNumInItem) {
    if (this.usedVfNumIn == null) {
      this.usedVfNumIn = new ArrayList<Integer>();
    }
    this.usedVfNumIn.add(usedVfNumInItem);
    return this;
  }

   /**
   * Get usedVfNumIn
   * @return usedVfNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getUsedVfNumIn() {
    return usedVfNumIn;
  }


  public void setUsedVfNumIn(List<Integer> usedVfNumIn) {
    this.usedVfNumIn = usedVfNumIn;
  }


  public NicWhereInput usedVfNumLt(Integer usedVfNumLt) {
    
    this.usedVfNumLt = usedVfNumLt;
    return this;
  }

   /**
   * Get usedVfNumLt
   * @return usedVfNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUsedVfNumLt() {
    return usedVfNumLt;
  }


  public void setUsedVfNumLt(Integer usedVfNumLt) {
    this.usedVfNumLt = usedVfNumLt;
  }


  public NicWhereInput usedVfNumLte(Integer usedVfNumLte) {
    
    this.usedVfNumLte = usedVfNumLte;
    return this;
  }

   /**
   * Get usedVfNumLte
   * @return usedVfNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUsedVfNumLte() {
    return usedVfNumLte;
  }


  public void setUsedVfNumLte(Integer usedVfNumLte) {
    this.usedVfNumLte = usedVfNumLte;
  }


  public NicWhereInput usedVfNumNot(Integer usedVfNumNot) {
    
    this.usedVfNumNot = usedVfNumNot;
    return this;
  }

   /**
   * Get usedVfNumNot
   * @return usedVfNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUsedVfNumNot() {
    return usedVfNumNot;
  }


  public void setUsedVfNumNot(Integer usedVfNumNot) {
    this.usedVfNumNot = usedVfNumNot;
  }


  public NicWhereInput usedVfNumNotIn(List<Integer> usedVfNumNotIn) {
    
    this.usedVfNumNotIn = usedVfNumNotIn;
    return this;
  }

  public NicWhereInput addUsedVfNumNotInItem(Integer usedVfNumNotInItem) {
    if (this.usedVfNumNotIn == null) {
      this.usedVfNumNotIn = new ArrayList<Integer>();
    }
    this.usedVfNumNotIn.add(usedVfNumNotInItem);
    return this;
  }

   /**
   * Get usedVfNumNotIn
   * @return usedVfNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getUsedVfNumNotIn() {
    return usedVfNumNotIn;
  }


  public void setUsedVfNumNotIn(List<Integer> usedVfNumNotIn) {
    this.usedVfNumNotIn = usedVfNumNotIn;
  }


  public NicWhereInput userUsage(NicUserUsage userUsage) {
    
    this.userUsage = userUsage;
    return this;
  }

   /**
   * Get userUsage
   * @return userUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NicUserUsage getUserUsage() {
    return userUsage;
  }


  public void setUserUsage(NicUserUsage userUsage) {
    this.userUsage = userUsage;
  }


  public NicWhereInput userUsageIn(List<NicUserUsage> userUsageIn) {
    
    this.userUsageIn = userUsageIn;
    return this;
  }

  public NicWhereInput addUserUsageInItem(NicUserUsage userUsageInItem) {
    if (this.userUsageIn == null) {
      this.userUsageIn = new ArrayList<NicUserUsage>();
    }
    this.userUsageIn.add(userUsageInItem);
    return this;
  }

   /**
   * Get userUsageIn
   * @return userUsageIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NicUserUsage> getUserUsageIn() {
    return userUsageIn;
  }


  public void setUserUsageIn(List<NicUserUsage> userUsageIn) {
    this.userUsageIn = userUsageIn;
  }


  public NicWhereInput userUsageNot(NicUserUsage userUsageNot) {
    
    this.userUsageNot = userUsageNot;
    return this;
  }

   /**
   * Get userUsageNot
   * @return userUsageNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NicUserUsage getUserUsageNot() {
    return userUsageNot;
  }


  public void setUserUsageNot(NicUserUsage userUsageNot) {
    this.userUsageNot = userUsageNot;
  }


  public NicWhereInput userUsageNotIn(List<NicUserUsage> userUsageNotIn) {
    
    this.userUsageNotIn = userUsageNotIn;
    return this;
  }

  public NicWhereInput addUserUsageNotInItem(NicUserUsage userUsageNotInItem) {
    if (this.userUsageNotIn == null) {
      this.userUsageNotIn = new ArrayList<NicUserUsage>();
    }
    this.userUsageNotIn.add(userUsageNotInItem);
    return this;
  }

   /**
   * Get userUsageNotIn
   * @return userUsageNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NicUserUsage> getUserUsageNotIn() {
    return userUsageNotIn;
  }


  public void setUserUsageNotIn(List<NicUserUsage> userUsageNotIn) {
    this.userUsageNotIn = userUsageNotIn;
  }


  public NicWhereInput vds(VdsWhereInput vds) {
    
    this.vds = vds;
    return this;
  }

   /**
   * Get vds
   * @return vds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VdsWhereInput getVds() {
    return vds;
  }


  public void setVds(VdsWhereInput vds) {
    this.vds = vds;
  }


  public NicWhereInput vmsEvery(VmWhereInput vmsEvery) {
    
    this.vmsEvery = vmsEvery;
    return this;
  }

   /**
   * Get vmsEvery
   * @return vmsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVmsEvery() {
    return vmsEvery;
  }


  public void setVmsEvery(VmWhereInput vmsEvery) {
    this.vmsEvery = vmsEvery;
  }


  public NicWhereInput vmsNone(VmWhereInput vmsNone) {
    
    this.vmsNone = vmsNone;
    return this;
  }

   /**
   * Get vmsNone
   * @return vmsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVmsNone() {
    return vmsNone;
  }


  public void setVmsNone(VmWhereInput vmsNone) {
    this.vmsNone = vmsNone;
  }


  public NicWhereInput vmsSome(VmWhereInput vmsSome) {
    
    this.vmsSome = vmsSome;
    return this;
  }

   /**
   * Get vmsSome
   * @return vmsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVmsSome() {
    return vmsSome;
  }


  public void setVmsSome(VmWhereInput vmsSome) {
    this.vmsSome = vmsSome;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NicWhereInput nicWhereInput = (NicWhereInput) o;
    return Objects.equals(this.AND, nicWhereInput.AND) &&
        Objects.equals(this.NOT, nicWhereInput.NOT) &&
        Objects.equals(this.OR, nicWhereInput.OR) &&
        Objects.equals(this.driver, nicWhereInput.driver) &&
        Objects.equals(this.driverContains, nicWhereInput.driverContains) &&
        Objects.equals(this.driverEndsWith, nicWhereInput.driverEndsWith) &&
        Objects.equals(this.driverGt, nicWhereInput.driverGt) &&
        Objects.equals(this.driverGte, nicWhereInput.driverGte) &&
        Objects.equals(this.driverIn, nicWhereInput.driverIn) &&
        Objects.equals(this.driverLt, nicWhereInput.driverLt) &&
        Objects.equals(this.driverLte, nicWhereInput.driverLte) &&
        Objects.equals(this.driverNot, nicWhereInput.driverNot) &&
        Objects.equals(this.driverNotContains, nicWhereInput.driverNotContains) &&
        Objects.equals(this.driverNotEndsWith, nicWhereInput.driverNotEndsWith) &&
        Objects.equals(this.driverNotIn, nicWhereInput.driverNotIn) &&
        Objects.equals(this.driverNotStartsWith, nicWhereInput.driverNotStartsWith) &&
        Objects.equals(this.driverStartsWith, nicWhereInput.driverStartsWith) &&
        Objects.equals(this.driverState, nicWhereInput.driverState) &&
        Objects.equals(this.driverStateIn, nicWhereInput.driverStateIn) &&
        Objects.equals(this.driverStateNot, nicWhereInput.driverStateNot) &&
        Objects.equals(this.driverStateNotIn, nicWhereInput.driverStateNotIn) &&
        Objects.equals(this.entityAsyncStatus, nicWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, nicWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, nicWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, nicWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.gatewayIp, nicWhereInput.gatewayIp) &&
        Objects.equals(this.gatewayIpContains, nicWhereInput.gatewayIpContains) &&
        Objects.equals(this.gatewayIpEndsWith, nicWhereInput.gatewayIpEndsWith) &&
        Objects.equals(this.gatewayIpGt, nicWhereInput.gatewayIpGt) &&
        Objects.equals(this.gatewayIpGte, nicWhereInput.gatewayIpGte) &&
        Objects.equals(this.gatewayIpIn, nicWhereInput.gatewayIpIn) &&
        Objects.equals(this.gatewayIpLt, nicWhereInput.gatewayIpLt) &&
        Objects.equals(this.gatewayIpLte, nicWhereInput.gatewayIpLte) &&
        Objects.equals(this.gatewayIpNot, nicWhereInput.gatewayIpNot) &&
        Objects.equals(this.gatewayIpNotContains, nicWhereInput.gatewayIpNotContains) &&
        Objects.equals(this.gatewayIpNotEndsWith, nicWhereInput.gatewayIpNotEndsWith) &&
        Objects.equals(this.gatewayIpNotIn, nicWhereInput.gatewayIpNotIn) &&
        Objects.equals(this.gatewayIpNotStartsWith, nicWhereInput.gatewayIpNotStartsWith) &&
        Objects.equals(this.gatewayIpStartsWith, nicWhereInput.gatewayIpStartsWith) &&
        Objects.equals(this.host, nicWhereInput.host) &&
        Objects.equals(this.ibdev, nicWhereInput.ibdev) &&
        Objects.equals(this.ibdevContains, nicWhereInput.ibdevContains) &&
        Objects.equals(this.ibdevEndsWith, nicWhereInput.ibdevEndsWith) &&
        Objects.equals(this.ibdevGt, nicWhereInput.ibdevGt) &&
        Objects.equals(this.ibdevGte, nicWhereInput.ibdevGte) &&
        Objects.equals(this.ibdevIn, nicWhereInput.ibdevIn) &&
        Objects.equals(this.ibdevLt, nicWhereInput.ibdevLt) &&
        Objects.equals(this.ibdevLte, nicWhereInput.ibdevLte) &&
        Objects.equals(this.ibdevNot, nicWhereInput.ibdevNot) &&
        Objects.equals(this.ibdevNotContains, nicWhereInput.ibdevNotContains) &&
        Objects.equals(this.ibdevNotEndsWith, nicWhereInput.ibdevNotEndsWith) &&
        Objects.equals(this.ibdevNotIn, nicWhereInput.ibdevNotIn) &&
        Objects.equals(this.ibdevNotStartsWith, nicWhereInput.ibdevNotStartsWith) &&
        Objects.equals(this.ibdevStartsWith, nicWhereInput.ibdevStartsWith) &&
        Objects.equals(this.id, nicWhereInput.id) &&
        Objects.equals(this.idContains, nicWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, nicWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, nicWhereInput.idGt) &&
        Objects.equals(this.idGte, nicWhereInput.idGte) &&
        Objects.equals(this.idIn, nicWhereInput.idIn) &&
        Objects.equals(this.idLt, nicWhereInput.idLt) &&
        Objects.equals(this.idLte, nicWhereInput.idLte) &&
        Objects.equals(this.idNot, nicWhereInput.idNot) &&
        Objects.equals(this.idNotContains, nicWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, nicWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, nicWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, nicWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, nicWhereInput.idStartsWith) &&
        Objects.equals(this.iommuStatus, nicWhereInput.iommuStatus) &&
        Objects.equals(this.iommuStatusIn, nicWhereInput.iommuStatusIn) &&
        Objects.equals(this.iommuStatusNot, nicWhereInput.iommuStatusNot) &&
        Objects.equals(this.iommuStatusNotIn, nicWhereInput.iommuStatusNotIn) &&
        Objects.equals(this.ipAddress, nicWhereInput.ipAddress) &&
        Objects.equals(this.ipAddressContains, nicWhereInput.ipAddressContains) &&
        Objects.equals(this.ipAddressEndsWith, nicWhereInput.ipAddressEndsWith) &&
        Objects.equals(this.ipAddressGt, nicWhereInput.ipAddressGt) &&
        Objects.equals(this.ipAddressGte, nicWhereInput.ipAddressGte) &&
        Objects.equals(this.ipAddressIn, nicWhereInput.ipAddressIn) &&
        Objects.equals(this.ipAddressLt, nicWhereInput.ipAddressLt) &&
        Objects.equals(this.ipAddressLte, nicWhereInput.ipAddressLte) &&
        Objects.equals(this.ipAddressNot, nicWhereInput.ipAddressNot) &&
        Objects.equals(this.ipAddressNotContains, nicWhereInput.ipAddressNotContains) &&
        Objects.equals(this.ipAddressNotEndsWith, nicWhereInput.ipAddressNotEndsWith) &&
        Objects.equals(this.ipAddressNotIn, nicWhereInput.ipAddressNotIn) &&
        Objects.equals(this.ipAddressNotStartsWith, nicWhereInput.ipAddressNotStartsWith) &&
        Objects.equals(this.ipAddressStartsWith, nicWhereInput.ipAddressStartsWith) &&
        Objects.equals(this.isSriov, nicWhereInput.isSriov) &&
        Objects.equals(this.isSriovNot, nicWhereInput.isSriovNot) &&
        Objects.equals(this.labelsEvery, nicWhereInput.labelsEvery) &&
        Objects.equals(this.labelsNone, nicWhereInput.labelsNone) &&
        Objects.equals(this.labelsSome, nicWhereInput.labelsSome) &&
        Objects.equals(this.localId, nicWhereInput.localId) &&
        Objects.equals(this.localIdContains, nicWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, nicWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, nicWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, nicWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, nicWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, nicWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, nicWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, nicWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, nicWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, nicWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, nicWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, nicWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, nicWhereInput.localIdStartsWith) &&
        Objects.equals(this.macAddress, nicWhereInput.macAddress) &&
        Objects.equals(this.macAddressContains, nicWhereInput.macAddressContains) &&
        Objects.equals(this.macAddressEndsWith, nicWhereInput.macAddressEndsWith) &&
        Objects.equals(this.macAddressGt, nicWhereInput.macAddressGt) &&
        Objects.equals(this.macAddressGte, nicWhereInput.macAddressGte) &&
        Objects.equals(this.macAddressIn, nicWhereInput.macAddressIn) &&
        Objects.equals(this.macAddressLt, nicWhereInput.macAddressLt) &&
        Objects.equals(this.macAddressLte, nicWhereInput.macAddressLte) &&
        Objects.equals(this.macAddressNot, nicWhereInput.macAddressNot) &&
        Objects.equals(this.macAddressNotContains, nicWhereInput.macAddressNotContains) &&
        Objects.equals(this.macAddressNotEndsWith, nicWhereInput.macAddressNotEndsWith) &&
        Objects.equals(this.macAddressNotIn, nicWhereInput.macAddressNotIn) &&
        Objects.equals(this.macAddressNotStartsWith, nicWhereInput.macAddressNotStartsWith) &&
        Objects.equals(this.macAddressStartsWith, nicWhereInput.macAddressStartsWith) &&
        Objects.equals(this.maxVfNum, nicWhereInput.maxVfNum) &&
        Objects.equals(this.maxVfNumGt, nicWhereInput.maxVfNumGt) &&
        Objects.equals(this.maxVfNumGte, nicWhereInput.maxVfNumGte) &&
        Objects.equals(this.maxVfNumIn, nicWhereInput.maxVfNumIn) &&
        Objects.equals(this.maxVfNumLt, nicWhereInput.maxVfNumLt) &&
        Objects.equals(this.maxVfNumLte, nicWhereInput.maxVfNumLte) &&
        Objects.equals(this.maxVfNumNot, nicWhereInput.maxVfNumNot) &&
        Objects.equals(this.maxVfNumNotIn, nicWhereInput.maxVfNumNotIn) &&
        Objects.equals(this.model, nicWhereInput.model) &&
        Objects.equals(this.modelContains, nicWhereInput.modelContains) &&
        Objects.equals(this.modelEndsWith, nicWhereInput.modelEndsWith) &&
        Objects.equals(this.modelGt, nicWhereInput.modelGt) &&
        Objects.equals(this.modelGte, nicWhereInput.modelGte) &&
        Objects.equals(this.modelIn, nicWhereInput.modelIn) &&
        Objects.equals(this.modelLt, nicWhereInput.modelLt) &&
        Objects.equals(this.modelLte, nicWhereInput.modelLte) &&
        Objects.equals(this.modelNot, nicWhereInput.modelNot) &&
        Objects.equals(this.modelNotContains, nicWhereInput.modelNotContains) &&
        Objects.equals(this.modelNotEndsWith, nicWhereInput.modelNotEndsWith) &&
        Objects.equals(this.modelNotIn, nicWhereInput.modelNotIn) &&
        Objects.equals(this.modelNotStartsWith, nicWhereInput.modelNotStartsWith) &&
        Objects.equals(this.modelStartsWith, nicWhereInput.modelStartsWith) &&
        Objects.equals(this.mtu, nicWhereInput.mtu) &&
        Objects.equals(this.mtuGt, nicWhereInput.mtuGt) &&
        Objects.equals(this.mtuGte, nicWhereInput.mtuGte) &&
        Objects.equals(this.mtuIn, nicWhereInput.mtuIn) &&
        Objects.equals(this.mtuLt, nicWhereInput.mtuLt) &&
        Objects.equals(this.mtuLte, nicWhereInput.mtuLte) &&
        Objects.equals(this.mtuNot, nicWhereInput.mtuNot) &&
        Objects.equals(this.mtuNotIn, nicWhereInput.mtuNotIn) &&
        Objects.equals(this.name, nicWhereInput.name) &&
        Objects.equals(this.nameContains, nicWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, nicWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, nicWhereInput.nameGt) &&
        Objects.equals(this.nameGte, nicWhereInput.nameGte) &&
        Objects.equals(this.nameIn, nicWhereInput.nameIn) &&
        Objects.equals(this.nameLt, nicWhereInput.nameLt) &&
        Objects.equals(this.nameLte, nicWhereInput.nameLte) &&
        Objects.equals(this.nameNot, nicWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, nicWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, nicWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, nicWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, nicWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, nicWhereInput.nameStartsWith) &&
        Objects.equals(this.nicUuid, nicWhereInput.nicUuid) &&
        Objects.equals(this.nicUuidContains, nicWhereInput.nicUuidContains) &&
        Objects.equals(this.nicUuidEndsWith, nicWhereInput.nicUuidEndsWith) &&
        Objects.equals(this.nicUuidGt, nicWhereInput.nicUuidGt) &&
        Objects.equals(this.nicUuidGte, nicWhereInput.nicUuidGte) &&
        Objects.equals(this.nicUuidIn, nicWhereInput.nicUuidIn) &&
        Objects.equals(this.nicUuidLt, nicWhereInput.nicUuidLt) &&
        Objects.equals(this.nicUuidLte, nicWhereInput.nicUuidLte) &&
        Objects.equals(this.nicUuidNot, nicWhereInput.nicUuidNot) &&
        Objects.equals(this.nicUuidNotContains, nicWhereInput.nicUuidNotContains) &&
        Objects.equals(this.nicUuidNotEndsWith, nicWhereInput.nicUuidNotEndsWith) &&
        Objects.equals(this.nicUuidNotIn, nicWhereInput.nicUuidNotIn) &&
        Objects.equals(this.nicUuidNotStartsWith, nicWhereInput.nicUuidNotStartsWith) &&
        Objects.equals(this.nicUuidStartsWith, nicWhereInput.nicUuidStartsWith) &&
        Objects.equals(this.physical, nicWhereInput.physical) &&
        Objects.equals(this.physicalNot, nicWhereInput.physicalNot) &&
        Objects.equals(this.rdmaEnabled, nicWhereInput.rdmaEnabled) &&
        Objects.equals(this.rdmaEnabledNot, nicWhereInput.rdmaEnabledNot) &&
        Objects.equals(this.running, nicWhereInput.running) &&
        Objects.equals(this.runningNot, nicWhereInput.runningNot) &&
        Objects.equals(this.speed, nicWhereInput.speed) &&
        Objects.equals(this.speedGt, nicWhereInput.speedGt) &&
        Objects.equals(this.speedGte, nicWhereInput.speedGte) &&
        Objects.equals(this.speedIn, nicWhereInput.speedIn) &&
        Objects.equals(this.speedLt, nicWhereInput.speedLt) &&
        Objects.equals(this.speedLte, nicWhereInput.speedLte) &&
        Objects.equals(this.speedNot, nicWhereInput.speedNot) &&
        Objects.equals(this.speedNotIn, nicWhereInput.speedNotIn) &&
        Objects.equals(this.subnetMask, nicWhereInput.subnetMask) &&
        Objects.equals(this.subnetMaskContains, nicWhereInput.subnetMaskContains) &&
        Objects.equals(this.subnetMaskEndsWith, nicWhereInput.subnetMaskEndsWith) &&
        Objects.equals(this.subnetMaskGt, nicWhereInput.subnetMaskGt) &&
        Objects.equals(this.subnetMaskGte, nicWhereInput.subnetMaskGte) &&
        Objects.equals(this.subnetMaskIn, nicWhereInput.subnetMaskIn) &&
        Objects.equals(this.subnetMaskLt, nicWhereInput.subnetMaskLt) &&
        Objects.equals(this.subnetMaskLte, nicWhereInput.subnetMaskLte) &&
        Objects.equals(this.subnetMaskNot, nicWhereInput.subnetMaskNot) &&
        Objects.equals(this.subnetMaskNotContains, nicWhereInput.subnetMaskNotContains) &&
        Objects.equals(this.subnetMaskNotEndsWith, nicWhereInput.subnetMaskNotEndsWith) &&
        Objects.equals(this.subnetMaskNotIn, nicWhereInput.subnetMaskNotIn) &&
        Objects.equals(this.subnetMaskNotStartsWith, nicWhereInput.subnetMaskNotStartsWith) &&
        Objects.equals(this.subnetMaskStartsWith, nicWhereInput.subnetMaskStartsWith) &&
        Objects.equals(this.totalVfNum, nicWhereInput.totalVfNum) &&
        Objects.equals(this.totalVfNumGt, nicWhereInput.totalVfNumGt) &&
        Objects.equals(this.totalVfNumGte, nicWhereInput.totalVfNumGte) &&
        Objects.equals(this.totalVfNumIn, nicWhereInput.totalVfNumIn) &&
        Objects.equals(this.totalVfNumLt, nicWhereInput.totalVfNumLt) &&
        Objects.equals(this.totalVfNumLte, nicWhereInput.totalVfNumLte) &&
        Objects.equals(this.totalVfNumNot, nicWhereInput.totalVfNumNot) &&
        Objects.equals(this.totalVfNumNotIn, nicWhereInput.totalVfNumNotIn) &&
        Objects.equals(this.type, nicWhereInput.type) &&
        Objects.equals(this.typeIn, nicWhereInput.typeIn) &&
        Objects.equals(this.typeNot, nicWhereInput.typeNot) &&
        Objects.equals(this.typeNotIn, nicWhereInput.typeNotIn) &&
        Objects.equals(this.up, nicWhereInput.up) &&
        Objects.equals(this.upNot, nicWhereInput.upNot) &&
        Objects.equals(this.usedVfNum, nicWhereInput.usedVfNum) &&
        Objects.equals(this.usedVfNumGt, nicWhereInput.usedVfNumGt) &&
        Objects.equals(this.usedVfNumGte, nicWhereInput.usedVfNumGte) &&
        Objects.equals(this.usedVfNumIn, nicWhereInput.usedVfNumIn) &&
        Objects.equals(this.usedVfNumLt, nicWhereInput.usedVfNumLt) &&
        Objects.equals(this.usedVfNumLte, nicWhereInput.usedVfNumLte) &&
        Objects.equals(this.usedVfNumNot, nicWhereInput.usedVfNumNot) &&
        Objects.equals(this.usedVfNumNotIn, nicWhereInput.usedVfNumNotIn) &&
        Objects.equals(this.userUsage, nicWhereInput.userUsage) &&
        Objects.equals(this.userUsageIn, nicWhereInput.userUsageIn) &&
        Objects.equals(this.userUsageNot, nicWhereInput.userUsageNot) &&
        Objects.equals(this.userUsageNotIn, nicWhereInput.userUsageNotIn) &&
        Objects.equals(this.vds, nicWhereInput.vds) &&
        Objects.equals(this.vmsEvery, nicWhereInput.vmsEvery) &&
        Objects.equals(this.vmsNone, nicWhereInput.vmsNone) &&
        Objects.equals(this.vmsSome, nicWhereInput.vmsSome);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, driver, driverContains, driverEndsWith, driverGt, driverGte, driverIn, driverLt, driverLte, driverNot, driverNotContains, driverNotEndsWith, driverNotIn, driverNotStartsWith, driverStartsWith, driverState, driverStateIn, driverStateNot, driverStateNotIn, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, gatewayIp, gatewayIpContains, gatewayIpEndsWith, gatewayIpGt, gatewayIpGte, gatewayIpIn, gatewayIpLt, gatewayIpLte, gatewayIpNot, gatewayIpNotContains, gatewayIpNotEndsWith, gatewayIpNotIn, gatewayIpNotStartsWith, gatewayIpStartsWith, host, ibdev, ibdevContains, ibdevEndsWith, ibdevGt, ibdevGte, ibdevIn, ibdevLt, ibdevLte, ibdevNot, ibdevNotContains, ibdevNotEndsWith, ibdevNotIn, ibdevNotStartsWith, ibdevStartsWith, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, iommuStatus, iommuStatusIn, iommuStatusNot, iommuStatusNotIn, ipAddress, ipAddressContains, ipAddressEndsWith, ipAddressGt, ipAddressGte, ipAddressIn, ipAddressLt, ipAddressLte, ipAddressNot, ipAddressNotContains, ipAddressNotEndsWith, ipAddressNotIn, ipAddressNotStartsWith, ipAddressStartsWith, isSriov, isSriovNot, labelsEvery, labelsNone, labelsSome, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, macAddress, macAddressContains, macAddressEndsWith, macAddressGt, macAddressGte, macAddressIn, macAddressLt, macAddressLte, macAddressNot, macAddressNotContains, macAddressNotEndsWith, macAddressNotIn, macAddressNotStartsWith, macAddressStartsWith, maxVfNum, maxVfNumGt, maxVfNumGte, maxVfNumIn, maxVfNumLt, maxVfNumLte, maxVfNumNot, maxVfNumNotIn, model, modelContains, modelEndsWith, modelGt, modelGte, modelIn, modelLt, modelLte, modelNot, modelNotContains, modelNotEndsWith, modelNotIn, modelNotStartsWith, modelStartsWith, mtu, mtuGt, mtuGte, mtuIn, mtuLt, mtuLte, mtuNot, mtuNotIn, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, nicUuid, nicUuidContains, nicUuidEndsWith, nicUuidGt, nicUuidGte, nicUuidIn, nicUuidLt, nicUuidLte, nicUuidNot, nicUuidNotContains, nicUuidNotEndsWith, nicUuidNotIn, nicUuidNotStartsWith, nicUuidStartsWith, physical, physicalNot, rdmaEnabled, rdmaEnabledNot, running, runningNot, speed, speedGt, speedGte, speedIn, speedLt, speedLte, speedNot, speedNotIn, subnetMask, subnetMaskContains, subnetMaskEndsWith, subnetMaskGt, subnetMaskGte, subnetMaskIn, subnetMaskLt, subnetMaskLte, subnetMaskNot, subnetMaskNotContains, subnetMaskNotEndsWith, subnetMaskNotIn, subnetMaskNotStartsWith, subnetMaskStartsWith, totalVfNum, totalVfNumGt, totalVfNumGte, totalVfNumIn, totalVfNumLt, totalVfNumLte, totalVfNumNot, totalVfNumNotIn, type, typeIn, typeNot, typeNotIn, up, upNot, usedVfNum, usedVfNumGt, usedVfNumGte, usedVfNumIn, usedVfNumLt, usedVfNumLte, usedVfNumNot, usedVfNumNotIn, userUsage, userUsageIn, userUsageNot, userUsageNotIn, vds, vmsEvery, vmsNone, vmsSome);
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
    sb.append("class NicWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    driverContains: ").append(toIndentedString(driverContains)).append("\n");
    sb.append("    driverEndsWith: ").append(toIndentedString(driverEndsWith)).append("\n");
    sb.append("    driverGt: ").append(toIndentedString(driverGt)).append("\n");
    sb.append("    driverGte: ").append(toIndentedString(driverGte)).append("\n");
    sb.append("    driverIn: ").append(toIndentedString(driverIn)).append("\n");
    sb.append("    driverLt: ").append(toIndentedString(driverLt)).append("\n");
    sb.append("    driverLte: ").append(toIndentedString(driverLte)).append("\n");
    sb.append("    driverNot: ").append(toIndentedString(driverNot)).append("\n");
    sb.append("    driverNotContains: ").append(toIndentedString(driverNotContains)).append("\n");
    sb.append("    driverNotEndsWith: ").append(toIndentedString(driverNotEndsWith)).append("\n");
    sb.append("    driverNotIn: ").append(toIndentedString(driverNotIn)).append("\n");
    sb.append("    driverNotStartsWith: ").append(toIndentedString(driverNotStartsWith)).append("\n");
    sb.append("    driverStartsWith: ").append(toIndentedString(driverStartsWith)).append("\n");
    sb.append("    driverState: ").append(toIndentedString(driverState)).append("\n");
    sb.append("    driverStateIn: ").append(toIndentedString(driverStateIn)).append("\n");
    sb.append("    driverStateNot: ").append(toIndentedString(driverStateNot)).append("\n");
    sb.append("    driverStateNotIn: ").append(toIndentedString(driverStateNotIn)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    entityAsyncStatusIn: ").append(toIndentedString(entityAsyncStatusIn)).append("\n");
    sb.append("    entityAsyncStatusNot: ").append(toIndentedString(entityAsyncStatusNot)).append("\n");
    sb.append("    entityAsyncStatusNotIn: ").append(toIndentedString(entityAsyncStatusNotIn)).append("\n");
    sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
    sb.append("    gatewayIpContains: ").append(toIndentedString(gatewayIpContains)).append("\n");
    sb.append("    gatewayIpEndsWith: ").append(toIndentedString(gatewayIpEndsWith)).append("\n");
    sb.append("    gatewayIpGt: ").append(toIndentedString(gatewayIpGt)).append("\n");
    sb.append("    gatewayIpGte: ").append(toIndentedString(gatewayIpGte)).append("\n");
    sb.append("    gatewayIpIn: ").append(toIndentedString(gatewayIpIn)).append("\n");
    sb.append("    gatewayIpLt: ").append(toIndentedString(gatewayIpLt)).append("\n");
    sb.append("    gatewayIpLte: ").append(toIndentedString(gatewayIpLte)).append("\n");
    sb.append("    gatewayIpNot: ").append(toIndentedString(gatewayIpNot)).append("\n");
    sb.append("    gatewayIpNotContains: ").append(toIndentedString(gatewayIpNotContains)).append("\n");
    sb.append("    gatewayIpNotEndsWith: ").append(toIndentedString(gatewayIpNotEndsWith)).append("\n");
    sb.append("    gatewayIpNotIn: ").append(toIndentedString(gatewayIpNotIn)).append("\n");
    sb.append("    gatewayIpNotStartsWith: ").append(toIndentedString(gatewayIpNotStartsWith)).append("\n");
    sb.append("    gatewayIpStartsWith: ").append(toIndentedString(gatewayIpStartsWith)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    ibdev: ").append(toIndentedString(ibdev)).append("\n");
    sb.append("    ibdevContains: ").append(toIndentedString(ibdevContains)).append("\n");
    sb.append("    ibdevEndsWith: ").append(toIndentedString(ibdevEndsWith)).append("\n");
    sb.append("    ibdevGt: ").append(toIndentedString(ibdevGt)).append("\n");
    sb.append("    ibdevGte: ").append(toIndentedString(ibdevGte)).append("\n");
    sb.append("    ibdevIn: ").append(toIndentedString(ibdevIn)).append("\n");
    sb.append("    ibdevLt: ").append(toIndentedString(ibdevLt)).append("\n");
    sb.append("    ibdevLte: ").append(toIndentedString(ibdevLte)).append("\n");
    sb.append("    ibdevNot: ").append(toIndentedString(ibdevNot)).append("\n");
    sb.append("    ibdevNotContains: ").append(toIndentedString(ibdevNotContains)).append("\n");
    sb.append("    ibdevNotEndsWith: ").append(toIndentedString(ibdevNotEndsWith)).append("\n");
    sb.append("    ibdevNotIn: ").append(toIndentedString(ibdevNotIn)).append("\n");
    sb.append("    ibdevNotStartsWith: ").append(toIndentedString(ibdevNotStartsWith)).append("\n");
    sb.append("    ibdevStartsWith: ").append(toIndentedString(ibdevStartsWith)).append("\n");
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
    sb.append("    iommuStatus: ").append(toIndentedString(iommuStatus)).append("\n");
    sb.append("    iommuStatusIn: ").append(toIndentedString(iommuStatusIn)).append("\n");
    sb.append("    iommuStatusNot: ").append(toIndentedString(iommuStatusNot)).append("\n");
    sb.append("    iommuStatusNotIn: ").append(toIndentedString(iommuStatusNotIn)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipAddressContains: ").append(toIndentedString(ipAddressContains)).append("\n");
    sb.append("    ipAddressEndsWith: ").append(toIndentedString(ipAddressEndsWith)).append("\n");
    sb.append("    ipAddressGt: ").append(toIndentedString(ipAddressGt)).append("\n");
    sb.append("    ipAddressGte: ").append(toIndentedString(ipAddressGte)).append("\n");
    sb.append("    ipAddressIn: ").append(toIndentedString(ipAddressIn)).append("\n");
    sb.append("    ipAddressLt: ").append(toIndentedString(ipAddressLt)).append("\n");
    sb.append("    ipAddressLte: ").append(toIndentedString(ipAddressLte)).append("\n");
    sb.append("    ipAddressNot: ").append(toIndentedString(ipAddressNot)).append("\n");
    sb.append("    ipAddressNotContains: ").append(toIndentedString(ipAddressNotContains)).append("\n");
    sb.append("    ipAddressNotEndsWith: ").append(toIndentedString(ipAddressNotEndsWith)).append("\n");
    sb.append("    ipAddressNotIn: ").append(toIndentedString(ipAddressNotIn)).append("\n");
    sb.append("    ipAddressNotStartsWith: ").append(toIndentedString(ipAddressNotStartsWith)).append("\n");
    sb.append("    ipAddressStartsWith: ").append(toIndentedString(ipAddressStartsWith)).append("\n");
    sb.append("    isSriov: ").append(toIndentedString(isSriov)).append("\n");
    sb.append("    isSriovNot: ").append(toIndentedString(isSriovNot)).append("\n");
    sb.append("    labelsEvery: ").append(toIndentedString(labelsEvery)).append("\n");
    sb.append("    labelsNone: ").append(toIndentedString(labelsNone)).append("\n");
    sb.append("    labelsSome: ").append(toIndentedString(labelsSome)).append("\n");
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
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    macAddressContains: ").append(toIndentedString(macAddressContains)).append("\n");
    sb.append("    macAddressEndsWith: ").append(toIndentedString(macAddressEndsWith)).append("\n");
    sb.append("    macAddressGt: ").append(toIndentedString(macAddressGt)).append("\n");
    sb.append("    macAddressGte: ").append(toIndentedString(macAddressGte)).append("\n");
    sb.append("    macAddressIn: ").append(toIndentedString(macAddressIn)).append("\n");
    sb.append("    macAddressLt: ").append(toIndentedString(macAddressLt)).append("\n");
    sb.append("    macAddressLte: ").append(toIndentedString(macAddressLte)).append("\n");
    sb.append("    macAddressNot: ").append(toIndentedString(macAddressNot)).append("\n");
    sb.append("    macAddressNotContains: ").append(toIndentedString(macAddressNotContains)).append("\n");
    sb.append("    macAddressNotEndsWith: ").append(toIndentedString(macAddressNotEndsWith)).append("\n");
    sb.append("    macAddressNotIn: ").append(toIndentedString(macAddressNotIn)).append("\n");
    sb.append("    macAddressNotStartsWith: ").append(toIndentedString(macAddressNotStartsWith)).append("\n");
    sb.append("    macAddressStartsWith: ").append(toIndentedString(macAddressStartsWith)).append("\n");
    sb.append("    maxVfNum: ").append(toIndentedString(maxVfNum)).append("\n");
    sb.append("    maxVfNumGt: ").append(toIndentedString(maxVfNumGt)).append("\n");
    sb.append("    maxVfNumGte: ").append(toIndentedString(maxVfNumGte)).append("\n");
    sb.append("    maxVfNumIn: ").append(toIndentedString(maxVfNumIn)).append("\n");
    sb.append("    maxVfNumLt: ").append(toIndentedString(maxVfNumLt)).append("\n");
    sb.append("    maxVfNumLte: ").append(toIndentedString(maxVfNumLte)).append("\n");
    sb.append("    maxVfNumNot: ").append(toIndentedString(maxVfNumNot)).append("\n");
    sb.append("    maxVfNumNotIn: ").append(toIndentedString(maxVfNumNotIn)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    modelContains: ").append(toIndentedString(modelContains)).append("\n");
    sb.append("    modelEndsWith: ").append(toIndentedString(modelEndsWith)).append("\n");
    sb.append("    modelGt: ").append(toIndentedString(modelGt)).append("\n");
    sb.append("    modelGte: ").append(toIndentedString(modelGte)).append("\n");
    sb.append("    modelIn: ").append(toIndentedString(modelIn)).append("\n");
    sb.append("    modelLt: ").append(toIndentedString(modelLt)).append("\n");
    sb.append("    modelLte: ").append(toIndentedString(modelLte)).append("\n");
    sb.append("    modelNot: ").append(toIndentedString(modelNot)).append("\n");
    sb.append("    modelNotContains: ").append(toIndentedString(modelNotContains)).append("\n");
    sb.append("    modelNotEndsWith: ").append(toIndentedString(modelNotEndsWith)).append("\n");
    sb.append("    modelNotIn: ").append(toIndentedString(modelNotIn)).append("\n");
    sb.append("    modelNotStartsWith: ").append(toIndentedString(modelNotStartsWith)).append("\n");
    sb.append("    modelStartsWith: ").append(toIndentedString(modelStartsWith)).append("\n");
    sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
    sb.append("    mtuGt: ").append(toIndentedString(mtuGt)).append("\n");
    sb.append("    mtuGte: ").append(toIndentedString(mtuGte)).append("\n");
    sb.append("    mtuIn: ").append(toIndentedString(mtuIn)).append("\n");
    sb.append("    mtuLt: ").append(toIndentedString(mtuLt)).append("\n");
    sb.append("    mtuLte: ").append(toIndentedString(mtuLte)).append("\n");
    sb.append("    mtuNot: ").append(toIndentedString(mtuNot)).append("\n");
    sb.append("    mtuNotIn: ").append(toIndentedString(mtuNotIn)).append("\n");
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
    sb.append("    nicUuid: ").append(toIndentedString(nicUuid)).append("\n");
    sb.append("    nicUuidContains: ").append(toIndentedString(nicUuidContains)).append("\n");
    sb.append("    nicUuidEndsWith: ").append(toIndentedString(nicUuidEndsWith)).append("\n");
    sb.append("    nicUuidGt: ").append(toIndentedString(nicUuidGt)).append("\n");
    sb.append("    nicUuidGte: ").append(toIndentedString(nicUuidGte)).append("\n");
    sb.append("    nicUuidIn: ").append(toIndentedString(nicUuidIn)).append("\n");
    sb.append("    nicUuidLt: ").append(toIndentedString(nicUuidLt)).append("\n");
    sb.append("    nicUuidLte: ").append(toIndentedString(nicUuidLte)).append("\n");
    sb.append("    nicUuidNot: ").append(toIndentedString(nicUuidNot)).append("\n");
    sb.append("    nicUuidNotContains: ").append(toIndentedString(nicUuidNotContains)).append("\n");
    sb.append("    nicUuidNotEndsWith: ").append(toIndentedString(nicUuidNotEndsWith)).append("\n");
    sb.append("    nicUuidNotIn: ").append(toIndentedString(nicUuidNotIn)).append("\n");
    sb.append("    nicUuidNotStartsWith: ").append(toIndentedString(nicUuidNotStartsWith)).append("\n");
    sb.append("    nicUuidStartsWith: ").append(toIndentedString(nicUuidStartsWith)).append("\n");
    sb.append("    physical: ").append(toIndentedString(physical)).append("\n");
    sb.append("    physicalNot: ").append(toIndentedString(physicalNot)).append("\n");
    sb.append("    rdmaEnabled: ").append(toIndentedString(rdmaEnabled)).append("\n");
    sb.append("    rdmaEnabledNot: ").append(toIndentedString(rdmaEnabledNot)).append("\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
    sb.append("    runningNot: ").append(toIndentedString(runningNot)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    speedGt: ").append(toIndentedString(speedGt)).append("\n");
    sb.append("    speedGte: ").append(toIndentedString(speedGte)).append("\n");
    sb.append("    speedIn: ").append(toIndentedString(speedIn)).append("\n");
    sb.append("    speedLt: ").append(toIndentedString(speedLt)).append("\n");
    sb.append("    speedLte: ").append(toIndentedString(speedLte)).append("\n");
    sb.append("    speedNot: ").append(toIndentedString(speedNot)).append("\n");
    sb.append("    speedNotIn: ").append(toIndentedString(speedNotIn)).append("\n");
    sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
    sb.append("    subnetMaskContains: ").append(toIndentedString(subnetMaskContains)).append("\n");
    sb.append("    subnetMaskEndsWith: ").append(toIndentedString(subnetMaskEndsWith)).append("\n");
    sb.append("    subnetMaskGt: ").append(toIndentedString(subnetMaskGt)).append("\n");
    sb.append("    subnetMaskGte: ").append(toIndentedString(subnetMaskGte)).append("\n");
    sb.append("    subnetMaskIn: ").append(toIndentedString(subnetMaskIn)).append("\n");
    sb.append("    subnetMaskLt: ").append(toIndentedString(subnetMaskLt)).append("\n");
    sb.append("    subnetMaskLte: ").append(toIndentedString(subnetMaskLte)).append("\n");
    sb.append("    subnetMaskNot: ").append(toIndentedString(subnetMaskNot)).append("\n");
    sb.append("    subnetMaskNotContains: ").append(toIndentedString(subnetMaskNotContains)).append("\n");
    sb.append("    subnetMaskNotEndsWith: ").append(toIndentedString(subnetMaskNotEndsWith)).append("\n");
    sb.append("    subnetMaskNotIn: ").append(toIndentedString(subnetMaskNotIn)).append("\n");
    sb.append("    subnetMaskNotStartsWith: ").append(toIndentedString(subnetMaskNotStartsWith)).append("\n");
    sb.append("    subnetMaskStartsWith: ").append(toIndentedString(subnetMaskStartsWith)).append("\n");
    sb.append("    totalVfNum: ").append(toIndentedString(totalVfNum)).append("\n");
    sb.append("    totalVfNumGt: ").append(toIndentedString(totalVfNumGt)).append("\n");
    sb.append("    totalVfNumGte: ").append(toIndentedString(totalVfNumGte)).append("\n");
    sb.append("    totalVfNumIn: ").append(toIndentedString(totalVfNumIn)).append("\n");
    sb.append("    totalVfNumLt: ").append(toIndentedString(totalVfNumLt)).append("\n");
    sb.append("    totalVfNumLte: ").append(toIndentedString(totalVfNumLte)).append("\n");
    sb.append("    totalVfNumNot: ").append(toIndentedString(totalVfNumNot)).append("\n");
    sb.append("    totalVfNumNotIn: ").append(toIndentedString(totalVfNumNotIn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
    sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
    sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
    sb.append("    up: ").append(toIndentedString(up)).append("\n");
    sb.append("    upNot: ").append(toIndentedString(upNot)).append("\n");
    sb.append("    usedVfNum: ").append(toIndentedString(usedVfNum)).append("\n");
    sb.append("    usedVfNumGt: ").append(toIndentedString(usedVfNumGt)).append("\n");
    sb.append("    usedVfNumGte: ").append(toIndentedString(usedVfNumGte)).append("\n");
    sb.append("    usedVfNumIn: ").append(toIndentedString(usedVfNumIn)).append("\n");
    sb.append("    usedVfNumLt: ").append(toIndentedString(usedVfNumLt)).append("\n");
    sb.append("    usedVfNumLte: ").append(toIndentedString(usedVfNumLte)).append("\n");
    sb.append("    usedVfNumNot: ").append(toIndentedString(usedVfNumNot)).append("\n");
    sb.append("    usedVfNumNotIn: ").append(toIndentedString(usedVfNumNotIn)).append("\n");
    sb.append("    userUsage: ").append(toIndentedString(userUsage)).append("\n");
    sb.append("    userUsageIn: ").append(toIndentedString(userUsageIn)).append("\n");
    sb.append("    userUsageNot: ").append(toIndentedString(userUsageNot)).append("\n");
    sb.append("    userUsageNotIn: ").append(toIndentedString(userUsageNotIn)).append("\n");
    sb.append("    vds: ").append(toIndentedString(vds)).append("\n");
    sb.append("    vmsEvery: ").append(toIndentedString(vmsEvery)).append("\n");
    sb.append("    vmsNone: ").append(toIndentedString(vmsNone)).append("\n");
    sb.append("    vmsSome: ").append(toIndentedString(vmsSome)).append("\n");
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

