package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ClusterWhereInput */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ClusterWhereInput
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<ClusterWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<ClusterWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<ClusterWhereInput> OR = null;

    public static final String SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION =
            "application_highest_version";

    @SerializedName(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION)
    private String applicationHighestVersion;

    public static final String SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_CONTAINS =
            "application_highest_version_contains";

    @SerializedName(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_CONTAINS)
    private String applicationHighestVersionContains;

    public static final String SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_ENDS_WITH =
            "application_highest_version_ends_with";

    @SerializedName(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_ENDS_WITH)
    private String applicationHighestVersionEndsWith;

    public static final String SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_GT =
            "application_highest_version_gt";

    @SerializedName(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_GT)
    private String applicationHighestVersionGt;

    public static final String SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_GTE =
            "application_highest_version_gte";

    @SerializedName(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_GTE)
    private String applicationHighestVersionGte;

    public static final String SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_IN =
            "application_highest_version_in";

    @SerializedName(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_IN)
    private List<String> applicationHighestVersionIn = null;

    public static final String SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_LT =
            "application_highest_version_lt";

    @SerializedName(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_LT)
    private String applicationHighestVersionLt;

    public static final String SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_LTE =
            "application_highest_version_lte";

    @SerializedName(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_LTE)
    private String applicationHighestVersionLte;

    public static final String SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT =
            "application_highest_version_not";

    @SerializedName(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT)
    private String applicationHighestVersionNot;

    public static final String SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_CONTAINS =
            "application_highest_version_not_contains";

    @SerializedName(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_CONTAINS)
    private String applicationHighestVersionNotContains;

    public static final String SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_ENDS_WITH =
            "application_highest_version_not_ends_with";

    @SerializedName(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_ENDS_WITH)
    private String applicationHighestVersionNotEndsWith;

    public static final String SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_IN =
            "application_highest_version_not_in";

    @SerializedName(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_IN)
    private List<String> applicationHighestVersionNotIn = null;

    public static final String SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_STARTS_WITH =
            "application_highest_version_not_starts_with";

    @SerializedName(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_STARTS_WITH)
    private String applicationHighestVersionNotStartsWith;

    public static final String SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_STARTS_WITH =
            "application_highest_version_starts_with";

    @SerializedName(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_STARTS_WITH)
    private String applicationHighestVersionStartsWith;

    public static final String SERIALIZED_NAME_APPLICATIONS_EVERY = "applications_every";

    @SerializedName(SERIALIZED_NAME_APPLICATIONS_EVERY)
    private ApplicationWhereInput applicationsEvery;

    public static final String SERIALIZED_NAME_APPLICATIONS_NONE = "applications_none";

    @SerializedName(SERIALIZED_NAME_APPLICATIONS_NONE)
    private ApplicationWhereInput applicationsNone;

    public static final String SERIALIZED_NAME_APPLICATIONS_SOME = "applications_some";

    @SerializedName(SERIALIZED_NAME_APPLICATIONS_SOME)
    private ApplicationWhereInput applicationsSome;

    public static final String SERIALIZED_NAME_ARCHITECTURE = "architecture";

    @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
    private Architecture architecture;

    public static final String SERIALIZED_NAME_ARCHITECTURE_IN = "architecture_in";

    @SerializedName(SERIALIZED_NAME_ARCHITECTURE_IN)
    private List<Architecture> architectureIn = null;

    public static final String SERIALIZED_NAME_ARCHITECTURE_NOT = "architecture_not";

    @SerializedName(SERIALIZED_NAME_ARCHITECTURE_NOT)
    private Architecture architectureNot;

    public static final String SERIALIZED_NAME_ARCHITECTURE_NOT_IN = "architecture_not_in";

    @SerializedName(SERIALIZED_NAME_ARCHITECTURE_NOT_IN)
    private List<Architecture> architectureNotIn = null;

    public static final String SERIALIZED_NAME_AUTO_CONVERGE = "auto_converge";

    @SerializedName(SERIALIZED_NAME_AUTO_CONVERGE)
    private Boolean autoConverge;

    public static final String SERIALIZED_NAME_AUTO_CONVERGE_NOT = "auto_converge_not";

    @SerializedName(SERIALIZED_NAME_AUTO_CONVERGE_NOT)
    private Boolean autoConvergeNot;

    public static final String SERIALIZED_NAME_CONNECT_STATE = "connect_state";

    @SerializedName(SERIALIZED_NAME_CONNECT_STATE)
    private ConnectState connectState;

    public static final String SERIALIZED_NAME_CONNECT_STATE_IN = "connect_state_in";

    @SerializedName(SERIALIZED_NAME_CONNECT_STATE_IN)
    private List<ConnectState> connectStateIn = null;

    public static final String SERIALIZED_NAME_CONNECT_STATE_NOT = "connect_state_not";

    @SerializedName(SERIALIZED_NAME_CONNECT_STATE_NOT)
    private ConnectState connectStateNot;

    public static final String SERIALIZED_NAME_CONNECT_STATE_NOT_IN = "connect_state_not_in";

    @SerializedName(SERIALIZED_NAME_CONNECT_STATE_NOT_IN)
    private List<ConnectState> connectStateNotIn = null;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUPS_EVERY =
            "consistency_groups_every";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUPS_EVERY)
    private ConsistencyGroupWhereInput consistencyGroupsEvery;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUPS_NONE = "consistency_groups_none";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUPS_NONE)
    private ConsistencyGroupWhereInput consistencyGroupsNone;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUPS_SOME = "consistency_groups_some";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUPS_SOME)
    private ConsistencyGroupWhereInput consistencyGroupsSome;

    public static final String SERIALIZED_NAME_CURRENT_CPU_MODEL = "current_cpu_model";

    @SerializedName(SERIALIZED_NAME_CURRENT_CPU_MODEL)
    private String currentCpuModel;

    public static final String SERIALIZED_NAME_CURRENT_CPU_MODEL_CONTAINS =
            "current_cpu_model_contains";

    @SerializedName(SERIALIZED_NAME_CURRENT_CPU_MODEL_CONTAINS)
    private String currentCpuModelContains;

    public static final String SERIALIZED_NAME_CURRENT_CPU_MODEL_ENDS_WITH =
            "current_cpu_model_ends_with";

    @SerializedName(SERIALIZED_NAME_CURRENT_CPU_MODEL_ENDS_WITH)
    private String currentCpuModelEndsWith;

    public static final String SERIALIZED_NAME_CURRENT_CPU_MODEL_GT = "current_cpu_model_gt";

    @SerializedName(SERIALIZED_NAME_CURRENT_CPU_MODEL_GT)
    private String currentCpuModelGt;

    public static final String SERIALIZED_NAME_CURRENT_CPU_MODEL_GTE = "current_cpu_model_gte";

    @SerializedName(SERIALIZED_NAME_CURRENT_CPU_MODEL_GTE)
    private String currentCpuModelGte;

    public static final String SERIALIZED_NAME_CURRENT_CPU_MODEL_IN = "current_cpu_model_in";

    @SerializedName(SERIALIZED_NAME_CURRENT_CPU_MODEL_IN)
    private List<String> currentCpuModelIn = null;

    public static final String SERIALIZED_NAME_CURRENT_CPU_MODEL_LT = "current_cpu_model_lt";

    @SerializedName(SERIALIZED_NAME_CURRENT_CPU_MODEL_LT)
    private String currentCpuModelLt;

    public static final String SERIALIZED_NAME_CURRENT_CPU_MODEL_LTE = "current_cpu_model_lte";

    @SerializedName(SERIALIZED_NAME_CURRENT_CPU_MODEL_LTE)
    private String currentCpuModelLte;

    public static final String SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT = "current_cpu_model_not";

    @SerializedName(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT)
    private String currentCpuModelNot;

    public static final String SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_CONTAINS =
            "current_cpu_model_not_contains";

    @SerializedName(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_CONTAINS)
    private String currentCpuModelNotContains;

    public static final String SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_ENDS_WITH =
            "current_cpu_model_not_ends_with";

    @SerializedName(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_ENDS_WITH)
    private String currentCpuModelNotEndsWith;

    public static final String SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_IN =
            "current_cpu_model_not_in";

    @SerializedName(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_IN)
    private List<String> currentCpuModelNotIn = null;

    public static final String SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_STARTS_WITH =
            "current_cpu_model_not_starts_with";

    @SerializedName(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_STARTS_WITH)
    private String currentCpuModelNotStartsWith;

    public static final String SERIALIZED_NAME_CURRENT_CPU_MODEL_STARTS_WITH =
            "current_cpu_model_starts_with";

    @SerializedName(SERIALIZED_NAME_CURRENT_CPU_MODEL_STARTS_WITH)
    private String currentCpuModelStartsWith;

    public static final String SERIALIZED_NAME_DATACENTERS_EVERY = "datacenters_every";

    @SerializedName(SERIALIZED_NAME_DATACENTERS_EVERY)
    private DatacenterWhereInput datacentersEvery;

    public static final String SERIALIZED_NAME_DATACENTERS_NONE = "datacenters_none";

    @SerializedName(SERIALIZED_NAME_DATACENTERS_NONE)
    private DatacenterWhereInput datacentersNone;

    public static final String SERIALIZED_NAME_DATACENTERS_SOME = "datacenters_some";

    @SerializedName(SERIALIZED_NAME_DATACENTERS_SOME)
    private DatacenterWhereInput datacentersSome;

    public static final String SERIALIZED_NAME_DISCONNECTED_DATE = "disconnected_date";

    @SerializedName(SERIALIZED_NAME_DISCONNECTED_DATE)
    private String disconnectedDate;

    public static final String SERIALIZED_NAME_DISCONNECTED_DATE_GT = "disconnected_date_gt";

    @SerializedName(SERIALIZED_NAME_DISCONNECTED_DATE_GT)
    private String disconnectedDateGt;

    public static final String SERIALIZED_NAME_DISCONNECTED_DATE_GTE = "disconnected_date_gte";

    @SerializedName(SERIALIZED_NAME_DISCONNECTED_DATE_GTE)
    private String disconnectedDateGte;

    public static final String SERIALIZED_NAME_DISCONNECTED_DATE_IN = "disconnected_date_in";

    @SerializedName(SERIALIZED_NAME_DISCONNECTED_DATE_IN)
    private List<String> disconnectedDateIn = null;

    public static final String SERIALIZED_NAME_DISCONNECTED_DATE_LT = "disconnected_date_lt";

    @SerializedName(SERIALIZED_NAME_DISCONNECTED_DATE_LT)
    private String disconnectedDateLt;

    public static final String SERIALIZED_NAME_DISCONNECTED_DATE_LTE = "disconnected_date_lte";

    @SerializedName(SERIALIZED_NAME_DISCONNECTED_DATE_LTE)
    private String disconnectedDateLte;

    public static final String SERIALIZED_NAME_DISCONNECTED_DATE_NOT = "disconnected_date_not";

    @SerializedName(SERIALIZED_NAME_DISCONNECTED_DATE_NOT)
    private String disconnectedDateNot;

    public static final String SERIALIZED_NAME_DISCONNECTED_DATE_NOT_IN =
            "disconnected_date_not_in";

    @SerializedName(SERIALIZED_NAME_DISCONNECTED_DATE_NOT_IN)
    private List<String> disconnectedDateNotIn = null;

    public static final String SERIALIZED_NAME_DISCONNECTED_REASON = "disconnected_reason";

    @SerializedName(SERIALIZED_NAME_DISCONNECTED_REASON)
    private ClusterConnectorErrorCode disconnectedReason;

    public static final String SERIALIZED_NAME_DISCONNECTED_REASON_IN = "disconnected_reason_in";

    @SerializedName(SERIALIZED_NAME_DISCONNECTED_REASON_IN)
    private List<ClusterConnectorErrorCode> disconnectedReasonIn = null;

    public static final String SERIALIZED_NAME_DISCONNECTED_REASON_NOT = "disconnected_reason_not";

    @SerializedName(SERIALIZED_NAME_DISCONNECTED_REASON_NOT)
    private ClusterConnectorErrorCode disconnectedReasonNot;

    public static final String SERIALIZED_NAME_DISCONNECTED_REASON_NOT_IN =
            "disconnected_reason_not_in";

    @SerializedName(SERIALIZED_NAME_DISCONNECTED_REASON_NOT_IN)
    private List<ClusterConnectorErrorCode> disconnectedReasonNotIn = null;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN = "entityAsyncStatus_in";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN)
    private List<EntityAsyncStatus> entityAsyncStatusIn = null;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT = "entityAsyncStatus_not";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT)
    private EntityAsyncStatus entityAsyncStatusNot;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN =
            "entityAsyncStatus_not_in";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN)
    private List<EntityAsyncStatus> entityAsyncStatusNotIn = null;

    public static final String SERIALIZED_NAME_EVEROUTE_CLUSTER = "everoute_cluster";

    @SerializedName(SERIALIZED_NAME_EVEROUTE_CLUSTER)
    private EverouteClusterWhereInput everouteCluster;

    public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE = "failure_data_space";

    @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE)
    private Long failureDataSpace;

    public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_GT = "failure_data_space_gt";

    @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_GT)
    private Long failureDataSpaceGt;

    public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_GTE = "failure_data_space_gte";

    @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_GTE)
    private Long failureDataSpaceGte;

    public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_IN = "failure_data_space_in";

    @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_IN)
    private List<Long> failureDataSpaceIn = null;

    public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_LT = "failure_data_space_lt";

    @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_LT)
    private Long failureDataSpaceLt;

    public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_LTE = "failure_data_space_lte";

    @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_LTE)
    private Long failureDataSpaceLte;

    public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT = "failure_data_space_not";

    @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT)
    private Long failureDataSpaceNot;

    public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT_IN =
            "failure_data_space_not_in";

    @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT_IN)
    private List<Long> failureDataSpaceNotIn = null;

    public static final String SERIALIZED_NAME_HAS_METROX = "has_metrox";

    @SerializedName(SERIALIZED_NAME_HAS_METROX)
    private Boolean hasMetrox;

    public static final String SERIALIZED_NAME_HAS_METROX_NOT = "has_metrox_not";

    @SerializedName(SERIALIZED_NAME_HAS_METROX_NOT)
    private Boolean hasMetroxNot;

    public static final String SERIALIZED_NAME_HOST_NUM = "host_num";

    @SerializedName(SERIALIZED_NAME_HOST_NUM)
    private Integer hostNum;

    public static final String SERIALIZED_NAME_HOST_NUM_GT = "host_num_gt";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_GT)
    private Integer hostNumGt;

    public static final String SERIALIZED_NAME_HOST_NUM_GTE = "host_num_gte";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_GTE)
    private Integer hostNumGte;

    public static final String SERIALIZED_NAME_HOST_NUM_IN = "host_num_in";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_IN)
    private List<Integer> hostNumIn = null;

    public static final String SERIALIZED_NAME_HOST_NUM_LT = "host_num_lt";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_LT)
    private Integer hostNumLt;

    public static final String SERIALIZED_NAME_HOST_NUM_LTE = "host_num_lte";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_LTE)
    private Integer hostNumLte;

    public static final String SERIALIZED_NAME_HOST_NUM_NOT = "host_num_not";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_NOT)
    private Integer hostNumNot;

    public static final String SERIALIZED_NAME_HOST_NUM_NOT_IN = "host_num_not_in";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_NOT_IN)
    private List<Integer> hostNumNotIn = null;

    public static final String SERIALIZED_NAME_HOSTS_EVERY = "hosts_every";

    @SerializedName(SERIALIZED_NAME_HOSTS_EVERY)
    private HostWhereInput hostsEvery;

    public static final String SERIALIZED_NAME_HOSTS_NONE = "hosts_none";

    @SerializedName(SERIALIZED_NAME_HOSTS_NONE)
    private HostWhereInput hostsNone;

    public static final String SERIALIZED_NAME_HOSTS_SOME = "hosts_some";

    @SerializedName(SERIALIZED_NAME_HOSTS_SOME)
    private HostWhereInput hostsSome;

    public static final String SERIALIZED_NAME_HYPERVISOR = "hypervisor";

    @SerializedName(SERIALIZED_NAME_HYPERVISOR)
    private Hypervisor hypervisor;

    public static final String SERIALIZED_NAME_HYPERVISOR_IN = "hypervisor_in";

    @SerializedName(SERIALIZED_NAME_HYPERVISOR_IN)
    private List<Hypervisor> hypervisorIn = null;

    public static final String SERIALIZED_NAME_HYPERVISOR_NOT = "hypervisor_not";

    @SerializedName(SERIALIZED_NAME_HYPERVISOR_NOT)
    private Hypervisor hypervisorNot;

    public static final String SERIALIZED_NAME_HYPERVISOR_NOT_IN = "hypervisor_not_in";

    @SerializedName(SERIALIZED_NAME_HYPERVISOR_NOT_IN)
    private List<Hypervisor> hypervisorNotIn = null;

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

    public static final String SERIALIZED_NAME_IP = "ip";

    @SerializedName(SERIALIZED_NAME_IP)
    private String ip;

    public static final String SERIALIZED_NAME_IP_CONTAINS = "ip_contains";

    @SerializedName(SERIALIZED_NAME_IP_CONTAINS)
    private String ipContains;

    public static final String SERIALIZED_NAME_IP_ENDS_WITH = "ip_ends_with";

    @SerializedName(SERIALIZED_NAME_IP_ENDS_WITH)
    private String ipEndsWith;

    public static final String SERIALIZED_NAME_IP_GT = "ip_gt";

    @SerializedName(SERIALIZED_NAME_IP_GT)
    private String ipGt;

    public static final String SERIALIZED_NAME_IP_GTE = "ip_gte";

    @SerializedName(SERIALIZED_NAME_IP_GTE)
    private String ipGte;

    public static final String SERIALIZED_NAME_IP_IN = "ip_in";

    @SerializedName(SERIALIZED_NAME_IP_IN)
    private List<String> ipIn = null;

    public static final String SERIALIZED_NAME_IP_LT = "ip_lt";

    @SerializedName(SERIALIZED_NAME_IP_LT)
    private String ipLt;

    public static final String SERIALIZED_NAME_IP_LTE = "ip_lte";

    @SerializedName(SERIALIZED_NAME_IP_LTE)
    private String ipLte;

    public static final String SERIALIZED_NAME_IP_NOT = "ip_not";

    @SerializedName(SERIALIZED_NAME_IP_NOT)
    private String ipNot;

    public static final String SERIALIZED_NAME_IP_NOT_CONTAINS = "ip_not_contains";

    @SerializedName(SERIALIZED_NAME_IP_NOT_CONTAINS)
    private String ipNotContains;

    public static final String SERIALIZED_NAME_IP_NOT_ENDS_WITH = "ip_not_ends_with";

    @SerializedName(SERIALIZED_NAME_IP_NOT_ENDS_WITH)
    private String ipNotEndsWith;

    public static final String SERIALIZED_NAME_IP_NOT_IN = "ip_not_in";

    @SerializedName(SERIALIZED_NAME_IP_NOT_IN)
    private List<String> ipNotIn = null;

    public static final String SERIALIZED_NAME_IP_NOT_STARTS_WITH = "ip_not_starts_with";

    @SerializedName(SERIALIZED_NAME_IP_NOT_STARTS_WITH)
    private String ipNotStartsWith;

    public static final String SERIALIZED_NAME_IP_STARTS_WITH = "ip_starts_with";

    @SerializedName(SERIALIZED_NAME_IP_STARTS_WITH)
    private String ipStartsWith;

    public static final String SERIALIZED_NAME_IS_ALL_FLASH = "is_all_flash";

    @SerializedName(SERIALIZED_NAME_IS_ALL_FLASH)
    private Boolean isAllFlash;

    public static final String SERIALIZED_NAME_IS_ALL_FLASH_NOT = "is_all_flash_not";

    @SerializedName(SERIALIZED_NAME_IS_ALL_FLASH_NOT)
    private Boolean isAllFlashNot;

    public static final String SERIALIZED_NAME_ISCSI_VIP = "iscsi_vip";

    @SerializedName(SERIALIZED_NAME_ISCSI_VIP)
    private String iscsiVip;

    public static final String SERIALIZED_NAME_ISCSI_VIP_CONTAINS = "iscsi_vip_contains";

    @SerializedName(SERIALIZED_NAME_ISCSI_VIP_CONTAINS)
    private String iscsiVipContains;

    public static final String SERIALIZED_NAME_ISCSI_VIP_ENDS_WITH = "iscsi_vip_ends_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_VIP_ENDS_WITH)
    private String iscsiVipEndsWith;

    public static final String SERIALIZED_NAME_ISCSI_VIP_GT = "iscsi_vip_gt";

    @SerializedName(SERIALIZED_NAME_ISCSI_VIP_GT)
    private String iscsiVipGt;

    public static final String SERIALIZED_NAME_ISCSI_VIP_GTE = "iscsi_vip_gte";

    @SerializedName(SERIALIZED_NAME_ISCSI_VIP_GTE)
    private String iscsiVipGte;

    public static final String SERIALIZED_NAME_ISCSI_VIP_IN = "iscsi_vip_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_VIP_IN)
    private List<String> iscsiVipIn = null;

    public static final String SERIALIZED_NAME_ISCSI_VIP_LT = "iscsi_vip_lt";

    @SerializedName(SERIALIZED_NAME_ISCSI_VIP_LT)
    private String iscsiVipLt;

    public static final String SERIALIZED_NAME_ISCSI_VIP_LTE = "iscsi_vip_lte";

    @SerializedName(SERIALIZED_NAME_ISCSI_VIP_LTE)
    private String iscsiVipLte;

    public static final String SERIALIZED_NAME_ISCSI_VIP_NOT = "iscsi_vip_not";

    @SerializedName(SERIALIZED_NAME_ISCSI_VIP_NOT)
    private String iscsiVipNot;

    public static final String SERIALIZED_NAME_ISCSI_VIP_NOT_CONTAINS = "iscsi_vip_not_contains";

    @SerializedName(SERIALIZED_NAME_ISCSI_VIP_NOT_CONTAINS)
    private String iscsiVipNotContains;

    public static final String SERIALIZED_NAME_ISCSI_VIP_NOT_ENDS_WITH = "iscsi_vip_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_VIP_NOT_ENDS_WITH)
    private String iscsiVipNotEndsWith;

    public static final String SERIALIZED_NAME_ISCSI_VIP_NOT_IN = "iscsi_vip_not_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_VIP_NOT_IN)
    private List<String> iscsiVipNotIn = null;

    public static final String SERIALIZED_NAME_ISCSI_VIP_NOT_STARTS_WITH =
            "iscsi_vip_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_VIP_NOT_STARTS_WITH)
    private String iscsiVipNotStartsWith;

    public static final String SERIALIZED_NAME_ISCSI_VIP_STARTS_WITH = "iscsi_vip_starts_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_VIP_STARTS_WITH)
    private String iscsiVipStartsWith;

    public static final String SERIALIZED_NAME_LABELS_EVERY = "labels_every";

    @SerializedName(SERIALIZED_NAME_LABELS_EVERY)
    private LabelWhereInput labelsEvery;

    public static final String SERIALIZED_NAME_LABELS_NONE = "labels_none";

    @SerializedName(SERIALIZED_NAME_LABELS_NONE)
    private LabelWhereInput labelsNone;

    public static final String SERIALIZED_NAME_LABELS_SOME = "labels_some";

    @SerializedName(SERIALIZED_NAME_LABELS_SOME)
    private LabelWhereInput labelsSome;

    public static final String SERIALIZED_NAME_LICENSE_EXPIRE_DATE = "license_expire_date";

    @SerializedName(SERIALIZED_NAME_LICENSE_EXPIRE_DATE)
    private String licenseExpireDate;

    public static final String SERIALIZED_NAME_LICENSE_EXPIRE_DATE_GT = "license_expire_date_gt";

    @SerializedName(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_GT)
    private String licenseExpireDateGt;

    public static final String SERIALIZED_NAME_LICENSE_EXPIRE_DATE_GTE = "license_expire_date_gte";

    @SerializedName(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_GTE)
    private String licenseExpireDateGte;

    public static final String SERIALIZED_NAME_LICENSE_EXPIRE_DATE_IN = "license_expire_date_in";

    @SerializedName(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_IN)
    private List<String> licenseExpireDateIn = null;

    public static final String SERIALIZED_NAME_LICENSE_EXPIRE_DATE_LT = "license_expire_date_lt";

    @SerializedName(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_LT)
    private String licenseExpireDateLt;

    public static final String SERIALIZED_NAME_LICENSE_EXPIRE_DATE_LTE = "license_expire_date_lte";

    @SerializedName(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_LTE)
    private String licenseExpireDateLte;

    public static final String SERIALIZED_NAME_LICENSE_EXPIRE_DATE_NOT = "license_expire_date_not";

    @SerializedName(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_NOT)
    private String licenseExpireDateNot;

    public static final String SERIALIZED_NAME_LICENSE_EXPIRE_DATE_NOT_IN =
            "license_expire_date_not_in";

    @SerializedName(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_NOT_IN)
    private List<String> licenseExpireDateNotIn = null;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL = "license_serial";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL)
    private String licenseSerial;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_CONTAINS = "license_serial_contains";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_CONTAINS)
    private String licenseSerialContains;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_ENDS_WITH =
            "license_serial_ends_with";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_ENDS_WITH)
    private String licenseSerialEndsWith;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_GT = "license_serial_gt";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_GT)
    private String licenseSerialGt;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_GTE = "license_serial_gte";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_GTE)
    private String licenseSerialGte;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_IN = "license_serial_in";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_IN)
    private List<String> licenseSerialIn = null;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_LT = "license_serial_lt";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_LT)
    private String licenseSerialLt;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_LTE = "license_serial_lte";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_LTE)
    private String licenseSerialLte;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_NOT = "license_serial_not";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_NOT)
    private String licenseSerialNot;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_NOT_CONTAINS =
            "license_serial_not_contains";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_NOT_CONTAINS)
    private String licenseSerialNotContains;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_NOT_ENDS_WITH =
            "license_serial_not_ends_with";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_NOT_ENDS_WITH)
    private String licenseSerialNotEndsWith;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_NOT_IN = "license_serial_not_in";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_NOT_IN)
    private List<String> licenseSerialNotIn = null;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_NOT_STARTS_WITH =
            "license_serial_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_NOT_STARTS_WITH)
    private String licenseSerialNotStartsWith;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_STARTS_WITH =
            "license_serial_starts_with";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_STARTS_WITH)
    private String licenseSerialStartsWith;

    public static final String SERIALIZED_NAME_LICENSE_SIGN_DATE = "license_sign_date";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGN_DATE)
    private String licenseSignDate;

    public static final String SERIALIZED_NAME_LICENSE_SIGN_DATE_GT = "license_sign_date_gt";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGN_DATE_GT)
    private String licenseSignDateGt;

    public static final String SERIALIZED_NAME_LICENSE_SIGN_DATE_GTE = "license_sign_date_gte";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGN_DATE_GTE)
    private String licenseSignDateGte;

    public static final String SERIALIZED_NAME_LICENSE_SIGN_DATE_IN = "license_sign_date_in";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGN_DATE_IN)
    private List<String> licenseSignDateIn = null;

    public static final String SERIALIZED_NAME_LICENSE_SIGN_DATE_LT = "license_sign_date_lt";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGN_DATE_LT)
    private String licenseSignDateLt;

    public static final String SERIALIZED_NAME_LICENSE_SIGN_DATE_LTE = "license_sign_date_lte";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGN_DATE_LTE)
    private String licenseSignDateLte;

    public static final String SERIALIZED_NAME_LICENSE_SIGN_DATE_NOT = "license_sign_date_not";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGN_DATE_NOT)
    private String licenseSignDateNot;

    public static final String SERIALIZED_NAME_LICENSE_SIGN_DATE_NOT_IN =
            "license_sign_date_not_in";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGN_DATE_NOT_IN)
    private List<String> licenseSignDateNotIn = null;

    public static final String SERIALIZED_NAME_LICENSE_TYPE = "license_type";

    @SerializedName(SERIALIZED_NAME_LICENSE_TYPE)
    private LicenseType licenseType;

    public static final String SERIALIZED_NAME_LICENSE_TYPE_IN = "license_type_in";

    @SerializedName(SERIALIZED_NAME_LICENSE_TYPE_IN)
    private List<LicenseType> licenseTypeIn = null;

    public static final String SERIALIZED_NAME_LICENSE_TYPE_NOT = "license_type_not";

    @SerializedName(SERIALIZED_NAME_LICENSE_TYPE_NOT)
    private LicenseType licenseTypeNot;

    public static final String SERIALIZED_NAME_LICENSE_TYPE_NOT_IN = "license_type_not_in";

    @SerializedName(SERIALIZED_NAME_LICENSE_TYPE_NOT_IN)
    private List<LicenseType> licenseTypeNotIn = null;

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

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH =
            "local_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH)
    private String localIdNotStartsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_STARTS_WITH = "local_id_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH)
    private String localIdStartsWith;

    public static final String SERIALIZED_NAME_MAINTENANCE_END_DATE = "maintenance_end_date";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_END_DATE)
    private String maintenanceEndDate;

    public static final String SERIALIZED_NAME_MAINTENANCE_END_DATE_GT = "maintenance_end_date_gt";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_END_DATE_GT)
    private String maintenanceEndDateGt;

    public static final String SERIALIZED_NAME_MAINTENANCE_END_DATE_GTE =
            "maintenance_end_date_gte";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_END_DATE_GTE)
    private String maintenanceEndDateGte;

    public static final String SERIALIZED_NAME_MAINTENANCE_END_DATE_IN = "maintenance_end_date_in";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_END_DATE_IN)
    private List<String> maintenanceEndDateIn = null;

    public static final String SERIALIZED_NAME_MAINTENANCE_END_DATE_LT = "maintenance_end_date_lt";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_END_DATE_LT)
    private String maintenanceEndDateLt;

    public static final String SERIALIZED_NAME_MAINTENANCE_END_DATE_LTE =
            "maintenance_end_date_lte";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_END_DATE_LTE)
    private String maintenanceEndDateLte;

    public static final String SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT =
            "maintenance_end_date_not";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT)
    private String maintenanceEndDateNot;

    public static final String SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT_IN =
            "maintenance_end_date_not_in";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT_IN)
    private List<String> maintenanceEndDateNotIn = null;

    public static final String SERIALIZED_NAME_MAINTENANCE_START_DATE = "maintenance_start_date";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_START_DATE)
    private String maintenanceStartDate;

    public static final String SERIALIZED_NAME_MAINTENANCE_START_DATE_GT =
            "maintenance_start_date_gt";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_START_DATE_GT)
    private String maintenanceStartDateGt;

    public static final String SERIALIZED_NAME_MAINTENANCE_START_DATE_GTE =
            "maintenance_start_date_gte";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_START_DATE_GTE)
    private String maintenanceStartDateGte;

    public static final String SERIALIZED_NAME_MAINTENANCE_START_DATE_IN =
            "maintenance_start_date_in";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_START_DATE_IN)
    private List<String> maintenanceStartDateIn = null;

    public static final String SERIALIZED_NAME_MAINTENANCE_START_DATE_LT =
            "maintenance_start_date_lt";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_START_DATE_LT)
    private String maintenanceStartDateLt;

    public static final String SERIALIZED_NAME_MAINTENANCE_START_DATE_LTE =
            "maintenance_start_date_lte";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_START_DATE_LTE)
    private String maintenanceStartDateLte;

    public static final String SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT =
            "maintenance_start_date_not";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT)
    private String maintenanceStartDateNot;

    public static final String SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT_IN =
            "maintenance_start_date_not_in";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT_IN)
    private List<String> maintenanceStartDateNotIn = null;

    public static final String SERIALIZED_NAME_MANAGEMENT_VIP = "management_vip";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_VIP)
    private String managementVip;

    public static final String SERIALIZED_NAME_MANAGEMENT_VIP_CONTAINS = "management_vip_contains";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_VIP_CONTAINS)
    private String managementVipContains;

    public static final String SERIALIZED_NAME_MANAGEMENT_VIP_ENDS_WITH =
            "management_vip_ends_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_VIP_ENDS_WITH)
    private String managementVipEndsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_VIP_GT = "management_vip_gt";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_VIP_GT)
    private String managementVipGt;

    public static final String SERIALIZED_NAME_MANAGEMENT_VIP_GTE = "management_vip_gte";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_VIP_GTE)
    private String managementVipGte;

    public static final String SERIALIZED_NAME_MANAGEMENT_VIP_IN = "management_vip_in";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_VIP_IN)
    private List<String> managementVipIn = null;

    public static final String SERIALIZED_NAME_MANAGEMENT_VIP_LT = "management_vip_lt";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_VIP_LT)
    private String managementVipLt;

    public static final String SERIALIZED_NAME_MANAGEMENT_VIP_LTE = "management_vip_lte";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_VIP_LTE)
    private String managementVipLte;

    public static final String SERIALIZED_NAME_MANAGEMENT_VIP_NOT = "management_vip_not";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_VIP_NOT)
    private String managementVipNot;

    public static final String SERIALIZED_NAME_MANAGEMENT_VIP_NOT_CONTAINS =
            "management_vip_not_contains";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_CONTAINS)
    private String managementVipNotContains;

    public static final String SERIALIZED_NAME_MANAGEMENT_VIP_NOT_ENDS_WITH =
            "management_vip_not_ends_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_ENDS_WITH)
    private String managementVipNotEndsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_VIP_NOT_IN = "management_vip_not_in";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_IN)
    private List<String> managementVipNotIn = null;

    public static final String SERIALIZED_NAME_MANAGEMENT_VIP_NOT_STARTS_WITH =
            "management_vip_not_starts_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_STARTS_WITH)
    private String managementVipNotStartsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_VIP_STARTS_WITH =
            "management_vip_starts_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_VIP_STARTS_WITH)
    private String managementVipStartsWith;

    public static final String SERIALIZED_NAME_MAX_CHUNK_NUM = "max_chunk_num";

    @SerializedName(SERIALIZED_NAME_MAX_CHUNK_NUM)
    private Integer maxChunkNum;

    public static final String SERIALIZED_NAME_MAX_CHUNK_NUM_GT = "max_chunk_num_gt";

    @SerializedName(SERIALIZED_NAME_MAX_CHUNK_NUM_GT)
    private Integer maxChunkNumGt;

    public static final String SERIALIZED_NAME_MAX_CHUNK_NUM_GTE = "max_chunk_num_gte";

    @SerializedName(SERIALIZED_NAME_MAX_CHUNK_NUM_GTE)
    private Integer maxChunkNumGte;

    public static final String SERIALIZED_NAME_MAX_CHUNK_NUM_IN = "max_chunk_num_in";

    @SerializedName(SERIALIZED_NAME_MAX_CHUNK_NUM_IN)
    private List<Integer> maxChunkNumIn = null;

    public static final String SERIALIZED_NAME_MAX_CHUNK_NUM_LT = "max_chunk_num_lt";

    @SerializedName(SERIALIZED_NAME_MAX_CHUNK_NUM_LT)
    private Integer maxChunkNumLt;

    public static final String SERIALIZED_NAME_MAX_CHUNK_NUM_LTE = "max_chunk_num_lte";

    @SerializedName(SERIALIZED_NAME_MAX_CHUNK_NUM_LTE)
    private Integer maxChunkNumLte;

    public static final String SERIALIZED_NAME_MAX_CHUNK_NUM_NOT = "max_chunk_num_not";

    @SerializedName(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT)
    private Integer maxChunkNumNot;

    public static final String SERIALIZED_NAME_MAX_CHUNK_NUM_NOT_IN = "max_chunk_num_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT_IN)
    private List<Integer> maxChunkNumNotIn = null;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY =
            "max_physical_data_capacity";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY)
    private Long maxPhysicalDataCapacity;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GT =
            "max_physical_data_capacity_gt";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GT)
    private Long maxPhysicalDataCapacityGt;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GTE =
            "max_physical_data_capacity_gte";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GTE)
    private Long maxPhysicalDataCapacityGte;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_IN =
            "max_physical_data_capacity_in";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_IN)
    private List<Long> maxPhysicalDataCapacityIn = null;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LT =
            "max_physical_data_capacity_lt";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LT)
    private Long maxPhysicalDataCapacityLt;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LTE =
            "max_physical_data_capacity_lte";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LTE)
    private Long maxPhysicalDataCapacityLte;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT =
            "max_physical_data_capacity_not";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT)
    private Long maxPhysicalDataCapacityNot;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT_IN =
            "max_physical_data_capacity_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT_IN)
    private List<Long> maxPhysicalDataCapacityNotIn = null;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE =
            "max_physical_data_capacity_per_node";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE)
    private Long maxPhysicalDataCapacityPerNode;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_GT =
            "max_physical_data_capacity_per_node_gt";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_GT)
    private Long maxPhysicalDataCapacityPerNodeGt;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_GTE =
            "max_physical_data_capacity_per_node_gte";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_GTE)
    private Long maxPhysicalDataCapacityPerNodeGte;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_IN =
            "max_physical_data_capacity_per_node_in";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_IN)
    private List<Long> maxPhysicalDataCapacityPerNodeIn = null;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_LT =
            "max_physical_data_capacity_per_node_lt";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_LT)
    private Long maxPhysicalDataCapacityPerNodeLt;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_LTE =
            "max_physical_data_capacity_per_node_lte";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_LTE)
    private Long maxPhysicalDataCapacityPerNodeLte;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_NOT =
            "max_physical_data_capacity_per_node_not";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_NOT)
    private Long maxPhysicalDataCapacityPerNodeNot;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_NOT_IN =
            "max_physical_data_capacity_per_node_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_NOT_IN)
    private List<Long> maxPhysicalDataCapacityPerNodeNotIn = null;

    public static final String SERIALIZED_NAME_MGT_GATEWAY = "mgt_gateway";

    @SerializedName(SERIALIZED_NAME_MGT_GATEWAY)
    private String mgtGateway;

    public static final String SERIALIZED_NAME_MGT_GATEWAY_CONTAINS = "mgt_gateway_contains";

    @SerializedName(SERIALIZED_NAME_MGT_GATEWAY_CONTAINS)
    private String mgtGatewayContains;

    public static final String SERIALIZED_NAME_MGT_GATEWAY_ENDS_WITH = "mgt_gateway_ends_with";

    @SerializedName(SERIALIZED_NAME_MGT_GATEWAY_ENDS_WITH)
    private String mgtGatewayEndsWith;

    public static final String SERIALIZED_NAME_MGT_GATEWAY_GT = "mgt_gateway_gt";

    @SerializedName(SERIALIZED_NAME_MGT_GATEWAY_GT)
    private String mgtGatewayGt;

    public static final String SERIALIZED_NAME_MGT_GATEWAY_GTE = "mgt_gateway_gte";

    @SerializedName(SERIALIZED_NAME_MGT_GATEWAY_GTE)
    private String mgtGatewayGte;

    public static final String SERIALIZED_NAME_MGT_GATEWAY_IN = "mgt_gateway_in";

    @SerializedName(SERIALIZED_NAME_MGT_GATEWAY_IN)
    private List<String> mgtGatewayIn = null;

    public static final String SERIALIZED_NAME_MGT_GATEWAY_LT = "mgt_gateway_lt";

    @SerializedName(SERIALIZED_NAME_MGT_GATEWAY_LT)
    private String mgtGatewayLt;

    public static final String SERIALIZED_NAME_MGT_GATEWAY_LTE = "mgt_gateway_lte";

    @SerializedName(SERIALIZED_NAME_MGT_GATEWAY_LTE)
    private String mgtGatewayLte;

    public static final String SERIALIZED_NAME_MGT_GATEWAY_NOT = "mgt_gateway_not";

    @SerializedName(SERIALIZED_NAME_MGT_GATEWAY_NOT)
    private String mgtGatewayNot;

    public static final String SERIALIZED_NAME_MGT_GATEWAY_NOT_CONTAINS =
            "mgt_gateway_not_contains";

    @SerializedName(SERIALIZED_NAME_MGT_GATEWAY_NOT_CONTAINS)
    private String mgtGatewayNotContains;

    public static final String SERIALIZED_NAME_MGT_GATEWAY_NOT_ENDS_WITH =
            "mgt_gateway_not_ends_with";

    @SerializedName(SERIALIZED_NAME_MGT_GATEWAY_NOT_ENDS_WITH)
    private String mgtGatewayNotEndsWith;

    public static final String SERIALIZED_NAME_MGT_GATEWAY_NOT_IN = "mgt_gateway_not_in";

    @SerializedName(SERIALIZED_NAME_MGT_GATEWAY_NOT_IN)
    private List<String> mgtGatewayNotIn = null;

    public static final String SERIALIZED_NAME_MGT_GATEWAY_NOT_STARTS_WITH =
            "mgt_gateway_not_starts_with";

    @SerializedName(SERIALIZED_NAME_MGT_GATEWAY_NOT_STARTS_WITH)
    private String mgtGatewayNotStartsWith;

    public static final String SERIALIZED_NAME_MGT_GATEWAY_STARTS_WITH = "mgt_gateway_starts_with";

    @SerializedName(SERIALIZED_NAME_MGT_GATEWAY_STARTS_WITH)
    private String mgtGatewayStartsWith;

    public static final String SERIALIZED_NAME_MGT_NETMASK = "mgt_netmask";

    @SerializedName(SERIALIZED_NAME_MGT_NETMASK)
    private String mgtNetmask;

    public static final String SERIALIZED_NAME_MGT_NETMASK_CONTAINS = "mgt_netmask_contains";

    @SerializedName(SERIALIZED_NAME_MGT_NETMASK_CONTAINS)
    private String mgtNetmaskContains;

    public static final String SERIALIZED_NAME_MGT_NETMASK_ENDS_WITH = "mgt_netmask_ends_with";

    @SerializedName(SERIALIZED_NAME_MGT_NETMASK_ENDS_WITH)
    private String mgtNetmaskEndsWith;

    public static final String SERIALIZED_NAME_MGT_NETMASK_GT = "mgt_netmask_gt";

    @SerializedName(SERIALIZED_NAME_MGT_NETMASK_GT)
    private String mgtNetmaskGt;

    public static final String SERIALIZED_NAME_MGT_NETMASK_GTE = "mgt_netmask_gte";

    @SerializedName(SERIALIZED_NAME_MGT_NETMASK_GTE)
    private String mgtNetmaskGte;

    public static final String SERIALIZED_NAME_MGT_NETMASK_IN = "mgt_netmask_in";

    @SerializedName(SERIALIZED_NAME_MGT_NETMASK_IN)
    private List<String> mgtNetmaskIn = null;

    public static final String SERIALIZED_NAME_MGT_NETMASK_LT = "mgt_netmask_lt";

    @SerializedName(SERIALIZED_NAME_MGT_NETMASK_LT)
    private String mgtNetmaskLt;

    public static final String SERIALIZED_NAME_MGT_NETMASK_LTE = "mgt_netmask_lte";

    @SerializedName(SERIALIZED_NAME_MGT_NETMASK_LTE)
    private String mgtNetmaskLte;

    public static final String SERIALIZED_NAME_MGT_NETMASK_NOT = "mgt_netmask_not";

    @SerializedName(SERIALIZED_NAME_MGT_NETMASK_NOT)
    private String mgtNetmaskNot;

    public static final String SERIALIZED_NAME_MGT_NETMASK_NOT_CONTAINS =
            "mgt_netmask_not_contains";

    @SerializedName(SERIALIZED_NAME_MGT_NETMASK_NOT_CONTAINS)
    private String mgtNetmaskNotContains;

    public static final String SERIALIZED_NAME_MGT_NETMASK_NOT_ENDS_WITH =
            "mgt_netmask_not_ends_with";

    @SerializedName(SERIALIZED_NAME_MGT_NETMASK_NOT_ENDS_WITH)
    private String mgtNetmaskNotEndsWith;

    public static final String SERIALIZED_NAME_MGT_NETMASK_NOT_IN = "mgt_netmask_not_in";

    @SerializedName(SERIALIZED_NAME_MGT_NETMASK_NOT_IN)
    private List<String> mgtNetmaskNotIn = null;

    public static final String SERIALIZED_NAME_MGT_NETMASK_NOT_STARTS_WITH =
            "mgt_netmask_not_starts_with";

    @SerializedName(SERIALIZED_NAME_MGT_NETMASK_NOT_STARTS_WITH)
    private String mgtNetmaskNotStartsWith;

    public static final String SERIALIZED_NAME_MGT_NETMASK_STARTS_WITH = "mgt_netmask_starts_with";

    @SerializedName(SERIALIZED_NAME_MGT_NETMASK_STARTS_WITH)
    private String mgtNetmaskStartsWith;

    public static final String SERIALIZED_NAME_MIGRATION_DATA_SIZE = "migration_data_size";

    @SerializedName(SERIALIZED_NAME_MIGRATION_DATA_SIZE)
    private Long migrationDataSize;

    public static final String SERIALIZED_NAME_MIGRATION_DATA_SIZE_GT = "migration_data_size_gt";

    @SerializedName(SERIALIZED_NAME_MIGRATION_DATA_SIZE_GT)
    private Long migrationDataSizeGt;

    public static final String SERIALIZED_NAME_MIGRATION_DATA_SIZE_GTE = "migration_data_size_gte";

    @SerializedName(SERIALIZED_NAME_MIGRATION_DATA_SIZE_GTE)
    private Long migrationDataSizeGte;

    public static final String SERIALIZED_NAME_MIGRATION_DATA_SIZE_IN = "migration_data_size_in";

    @SerializedName(SERIALIZED_NAME_MIGRATION_DATA_SIZE_IN)
    private List<Long> migrationDataSizeIn = null;

    public static final String SERIALIZED_NAME_MIGRATION_DATA_SIZE_LT = "migration_data_size_lt";

    @SerializedName(SERIALIZED_NAME_MIGRATION_DATA_SIZE_LT)
    private Long migrationDataSizeLt;

    public static final String SERIALIZED_NAME_MIGRATION_DATA_SIZE_LTE = "migration_data_size_lte";

    @SerializedName(SERIALIZED_NAME_MIGRATION_DATA_SIZE_LTE)
    private Long migrationDataSizeLte;

    public static final String SERIALIZED_NAME_MIGRATION_DATA_SIZE_NOT = "migration_data_size_not";

    @SerializedName(SERIALIZED_NAME_MIGRATION_DATA_SIZE_NOT)
    private Long migrationDataSizeNot;

    public static final String SERIALIZED_NAME_MIGRATION_DATA_SIZE_NOT_IN =
            "migration_data_size_not_in";

    @SerializedName(SERIALIZED_NAME_MIGRATION_DATA_SIZE_NOT_IN)
    private List<Long> migrationDataSizeNotIn = null;

    public static final String SERIALIZED_NAME_MIGRATION_SPEED = "migration_speed";

    @SerializedName(SERIALIZED_NAME_MIGRATION_SPEED)
    private Long migrationSpeed;

    public static final String SERIALIZED_NAME_MIGRATION_SPEED_GT = "migration_speed_gt";

    @SerializedName(SERIALIZED_NAME_MIGRATION_SPEED_GT)
    private Long migrationSpeedGt;

    public static final String SERIALIZED_NAME_MIGRATION_SPEED_GTE = "migration_speed_gte";

    @SerializedName(SERIALIZED_NAME_MIGRATION_SPEED_GTE)
    private Long migrationSpeedGte;

    public static final String SERIALIZED_NAME_MIGRATION_SPEED_IN = "migration_speed_in";

    @SerializedName(SERIALIZED_NAME_MIGRATION_SPEED_IN)
    private List<Long> migrationSpeedIn = null;

    public static final String SERIALIZED_NAME_MIGRATION_SPEED_LT = "migration_speed_lt";

    @SerializedName(SERIALIZED_NAME_MIGRATION_SPEED_LT)
    private Long migrationSpeedLt;

    public static final String SERIALIZED_NAME_MIGRATION_SPEED_LTE = "migration_speed_lte";

    @SerializedName(SERIALIZED_NAME_MIGRATION_SPEED_LTE)
    private Long migrationSpeedLte;

    public static final String SERIALIZED_NAME_MIGRATION_SPEED_NOT = "migration_speed_not";

    @SerializedName(SERIALIZED_NAME_MIGRATION_SPEED_NOT)
    private Long migrationSpeedNot;

    public static final String SERIALIZED_NAME_MIGRATION_SPEED_NOT_IN = "migration_speed_not_in";

    @SerializedName(SERIALIZED_NAME_MIGRATION_SPEED_NOT_IN)
    private List<Long> migrationSpeedNotIn = null;

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

    public static final String SERIALIZED_NAME_NTP_MODE = "ntp_mode";

    @SerializedName(SERIALIZED_NAME_NTP_MODE)
    private NtpMode ntpMode;

    public static final String SERIALIZED_NAME_NTP_MODE_IN = "ntp_mode_in";

    @SerializedName(SERIALIZED_NAME_NTP_MODE_IN)
    private List<NtpMode> ntpModeIn = null;

    public static final String SERIALIZED_NAME_NTP_MODE_NOT = "ntp_mode_not";

    @SerializedName(SERIALIZED_NAME_NTP_MODE_NOT)
    private NtpMode ntpModeNot;

    public static final String SERIALIZED_NAME_NTP_MODE_NOT_IN = "ntp_mode_not_in";

    @SerializedName(SERIALIZED_NAME_NTP_MODE_NOT_IN)
    private List<NtpMode> ntpModeNotIn = null;

    public static final String SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED = "nvme_over_rdma_enabled";

    @SerializedName(SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED)
    private Boolean nvmeOverRdmaEnabled;

    public static final String SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED_NOT =
            "nvme_over_rdma_enabled_not";

    @SerializedName(SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED_NOT)
    private Boolean nvmeOverRdmaEnabledNot;

    public static final String SERIALIZED_NAME_NVME_OVER_TCP_ENABLED = "nvme_over_tcp_enabled";

    @SerializedName(SERIALIZED_NAME_NVME_OVER_TCP_ENABLED)
    private Boolean nvmeOverTcpEnabled;

    public static final String SERIALIZED_NAME_NVME_OVER_TCP_ENABLED_NOT =
            "nvme_over_tcp_enabled_not";

    @SerializedName(SERIALIZED_NAME_NVME_OVER_TCP_ENABLED_NOT)
    private Boolean nvmeOverTcpEnabledNot;

    public static final String SERIALIZED_NAME_NVMF_ENABLED = "nvmf_enabled";

    @SerializedName(SERIALIZED_NAME_NVMF_ENABLED)
    private Boolean nvmfEnabled;

    public static final String SERIALIZED_NAME_NVMF_ENABLED_NOT = "nvmf_enabled_not";

    @SerializedName(SERIALIZED_NAME_NVMF_ENABLED_NOT)
    private Boolean nvmfEnabledNot;

    public static final String SERIALIZED_NAME_PMEM_ENABLED = "pmem_enabled";

    @SerializedName(SERIALIZED_NAME_PMEM_ENABLED)
    private Boolean pmemEnabled;

    public static final String SERIALIZED_NAME_PMEM_ENABLED_NOT = "pmem_enabled_not";

    @SerializedName(SERIALIZED_NAME_PMEM_ENABLED_NOT)
    private Boolean pmemEnabledNot;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES = "provisioned_cpu_cores";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES)
    private Integer provisionedCpuCores;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM =
            "provisioned_cpu_cores_for_active_vm";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM)
    private Integer provisionedCpuCoresForActiveVm;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GT =
            "provisioned_cpu_cores_for_active_vm_gt";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GT)
    private Integer provisionedCpuCoresForActiveVmGt;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GTE =
            "provisioned_cpu_cores_for_active_vm_gte";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GTE)
    private Integer provisionedCpuCoresForActiveVmGte;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_IN =
            "provisioned_cpu_cores_for_active_vm_in";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_IN)
    private List<Integer> provisionedCpuCoresForActiveVmIn = null;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LT =
            "provisioned_cpu_cores_for_active_vm_lt";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LT)
    private Integer provisionedCpuCoresForActiveVmLt;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LTE =
            "provisioned_cpu_cores_for_active_vm_lte";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LTE)
    private Integer provisionedCpuCoresForActiveVmLte;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT =
            "provisioned_cpu_cores_for_active_vm_not";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT)
    private Integer provisionedCpuCoresForActiveVmNot;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT_IN =
            "provisioned_cpu_cores_for_active_vm_not_in";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT_IN)
    private List<Integer> provisionedCpuCoresForActiveVmNotIn = null;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_GT =
            "provisioned_cpu_cores_gt";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GT)
    private Integer provisionedCpuCoresGt;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_GTE =
            "provisioned_cpu_cores_gte";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GTE)
    private Integer provisionedCpuCoresGte;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_IN =
            "provisioned_cpu_cores_in";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_IN)
    private List<Integer> provisionedCpuCoresIn = null;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_LT =
            "provisioned_cpu_cores_lt";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LT)
    private Integer provisionedCpuCoresLt;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_LTE =
            "provisioned_cpu_cores_lte";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LTE)
    private Integer provisionedCpuCoresLte;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT =
            "provisioned_cpu_cores_not";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT)
    private Integer provisionedCpuCoresNot;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT_IN =
            "provisioned_cpu_cores_not_in";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT_IN)
    private List<Integer> provisionedCpuCoresNotIn = null;

    public static final String SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO =
            "provisioned_for_active_vm_ratio";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO)
    private Double provisionedForActiveVmRatio;

    public static final String SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_GT =
            "provisioned_for_active_vm_ratio_gt";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_GT)
    private Double provisionedForActiveVmRatioGt;

    public static final String SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_GTE =
            "provisioned_for_active_vm_ratio_gte";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_GTE)
    private Double provisionedForActiveVmRatioGte;

    public static final String SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_IN =
            "provisioned_for_active_vm_ratio_in";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_IN)
    private List<Double> provisionedForActiveVmRatioIn = null;

    public static final String SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_LT =
            "provisioned_for_active_vm_ratio_lt";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_LT)
    private Double provisionedForActiveVmRatioLt;

    public static final String SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_LTE =
            "provisioned_for_active_vm_ratio_lte";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_LTE)
    private Double provisionedForActiveVmRatioLte;

    public static final String SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_NOT =
            "provisioned_for_active_vm_ratio_not";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_NOT)
    private Double provisionedForActiveVmRatioNot;

    public static final String SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_NOT_IN =
            "provisioned_for_active_vm_ratio_not_in";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_NOT_IN)
    private List<Double> provisionedForActiveVmRatioNotIn = null;

    public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES =
            "provisioned_memory_bytes";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES)
    private Long provisionedMemoryBytes;

    public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GT =
            "provisioned_memory_bytes_gt";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GT)
    private Long provisionedMemoryBytesGt;

    public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GTE =
            "provisioned_memory_bytes_gte";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GTE)
    private Long provisionedMemoryBytesGte;

    public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_IN =
            "provisioned_memory_bytes_in";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_IN)
    private List<Long> provisionedMemoryBytesIn = null;

    public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LT =
            "provisioned_memory_bytes_lt";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LT)
    private Long provisionedMemoryBytesLt;

    public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LTE =
            "provisioned_memory_bytes_lte";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LTE)
    private Long provisionedMemoryBytesLte;

    public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT =
            "provisioned_memory_bytes_not";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT)
    private Long provisionedMemoryBytesNot;

    public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT_IN =
            "provisioned_memory_bytes_not_in";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT_IN)
    private List<Long> provisionedMemoryBytesNotIn = null;

    public static final String SERIALIZED_NAME_PROVISIONED_RATIO = "provisioned_ratio";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_RATIO)
    private Double provisionedRatio;

    public static final String SERIALIZED_NAME_PROVISIONED_RATIO_GT = "provisioned_ratio_gt";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_RATIO_GT)
    private Double provisionedRatioGt;

    public static final String SERIALIZED_NAME_PROVISIONED_RATIO_GTE = "provisioned_ratio_gte";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_RATIO_GTE)
    private Double provisionedRatioGte;

    public static final String SERIALIZED_NAME_PROVISIONED_RATIO_IN = "provisioned_ratio_in";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_RATIO_IN)
    private List<Double> provisionedRatioIn = null;

    public static final String SERIALIZED_NAME_PROVISIONED_RATIO_LT = "provisioned_ratio_lt";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_RATIO_LT)
    private Double provisionedRatioLt;

    public static final String SERIALIZED_NAME_PROVISIONED_RATIO_LTE = "provisioned_ratio_lte";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_RATIO_LTE)
    private Double provisionedRatioLte;

    public static final String SERIALIZED_NAME_PROVISIONED_RATIO_NOT = "provisioned_ratio_not";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_RATIO_NOT)
    private Double provisionedRatioNot;

    public static final String SERIALIZED_NAME_PROVISIONED_RATIO_NOT_IN =
            "provisioned_ratio_not_in";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_RATIO_NOT_IN)
    private List<Double> provisionedRatioNotIn = null;

    public static final String SERIALIZED_NAME_RDMA_ENABLED = "rdma_enabled";

    @SerializedName(SERIALIZED_NAME_RDMA_ENABLED)
    private Boolean rdmaEnabled;

    public static final String SERIALIZED_NAME_RDMA_ENABLED_NOT = "rdma_enabled_not";

    @SerializedName(SERIALIZED_NAME_RDMA_ENABLED_NOT)
    private Boolean rdmaEnabledNot;

    public static final String SERIALIZED_NAME_RECOVER_DATA_SIZE = "recover_data_size";

    @SerializedName(SERIALIZED_NAME_RECOVER_DATA_SIZE)
    private Long recoverDataSize;

    public static final String SERIALIZED_NAME_RECOVER_DATA_SIZE_GT = "recover_data_size_gt";

    @SerializedName(SERIALIZED_NAME_RECOVER_DATA_SIZE_GT)
    private Long recoverDataSizeGt;

    public static final String SERIALIZED_NAME_RECOVER_DATA_SIZE_GTE = "recover_data_size_gte";

    @SerializedName(SERIALIZED_NAME_RECOVER_DATA_SIZE_GTE)
    private Long recoverDataSizeGte;

    public static final String SERIALIZED_NAME_RECOVER_DATA_SIZE_IN = "recover_data_size_in";

    @SerializedName(SERIALIZED_NAME_RECOVER_DATA_SIZE_IN)
    private List<Long> recoverDataSizeIn = null;

    public static final String SERIALIZED_NAME_RECOVER_DATA_SIZE_LT = "recover_data_size_lt";

    @SerializedName(SERIALIZED_NAME_RECOVER_DATA_SIZE_LT)
    private Long recoverDataSizeLt;

    public static final String SERIALIZED_NAME_RECOVER_DATA_SIZE_LTE = "recover_data_size_lte";

    @SerializedName(SERIALIZED_NAME_RECOVER_DATA_SIZE_LTE)
    private Long recoverDataSizeLte;

    public static final String SERIALIZED_NAME_RECOVER_DATA_SIZE_NOT = "recover_data_size_not";

    @SerializedName(SERIALIZED_NAME_RECOVER_DATA_SIZE_NOT)
    private Long recoverDataSizeNot;

    public static final String SERIALIZED_NAME_RECOVER_DATA_SIZE_NOT_IN =
            "recover_data_size_not_in";

    @SerializedName(SERIALIZED_NAME_RECOVER_DATA_SIZE_NOT_IN)
    private List<Long> recoverDataSizeNotIn = null;

    public static final String SERIALIZED_NAME_RECOVER_SPEED = "recover_speed";

    @SerializedName(SERIALIZED_NAME_RECOVER_SPEED)
    private Long recoverSpeed;

    public static final String SERIALIZED_NAME_RECOVER_SPEED_GT = "recover_speed_gt";

    @SerializedName(SERIALIZED_NAME_RECOVER_SPEED_GT)
    private Long recoverSpeedGt;

    public static final String SERIALIZED_NAME_RECOVER_SPEED_GTE = "recover_speed_gte";

    @SerializedName(SERIALIZED_NAME_RECOVER_SPEED_GTE)
    private Long recoverSpeedGte;

    public static final String SERIALIZED_NAME_RECOVER_SPEED_IN = "recover_speed_in";

    @SerializedName(SERIALIZED_NAME_RECOVER_SPEED_IN)
    private List<Long> recoverSpeedIn = null;

    public static final String SERIALIZED_NAME_RECOVER_SPEED_LT = "recover_speed_lt";

    @SerializedName(SERIALIZED_NAME_RECOVER_SPEED_LT)
    private Long recoverSpeedLt;

    public static final String SERIALIZED_NAME_RECOVER_SPEED_LTE = "recover_speed_lte";

    @SerializedName(SERIALIZED_NAME_RECOVER_SPEED_LTE)
    private Long recoverSpeedLte;

    public static final String SERIALIZED_NAME_RECOVER_SPEED_NOT = "recover_speed_not";

    @SerializedName(SERIALIZED_NAME_RECOVER_SPEED_NOT)
    private Long recoverSpeedNot;

    public static final String SERIALIZED_NAME_RECOVER_SPEED_NOT_IN = "recover_speed_not_in";

    @SerializedName(SERIALIZED_NAME_RECOVER_SPEED_NOT_IN)
    private List<Long> recoverSpeedNotIn = null;

    public static final String SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE =
            "reserved_cpu_cores_for_system_service";

    @SerializedName(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE)
    private Integer reservedCpuCoresForSystemService;

    public static final String SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_GT =
            "reserved_cpu_cores_for_system_service_gt";

    @SerializedName(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_GT)
    private Integer reservedCpuCoresForSystemServiceGt;

    public static final String SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_GTE =
            "reserved_cpu_cores_for_system_service_gte";

    @SerializedName(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_GTE)
    private Integer reservedCpuCoresForSystemServiceGte;

    public static final String SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_IN =
            "reserved_cpu_cores_for_system_service_in";

    @SerializedName(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_IN)
    private List<Integer> reservedCpuCoresForSystemServiceIn = null;

    public static final String SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_LT =
            "reserved_cpu_cores_for_system_service_lt";

    @SerializedName(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_LT)
    private Integer reservedCpuCoresForSystemServiceLt;

    public static final String SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_LTE =
            "reserved_cpu_cores_for_system_service_lte";

    @SerializedName(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_LTE)
    private Integer reservedCpuCoresForSystemServiceLte;

    public static final String SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_NOT =
            "reserved_cpu_cores_for_system_service_not";

    @SerializedName(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_NOT)
    private Integer reservedCpuCoresForSystemServiceNot;

    public static final String SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_NOT_IN =
            "reserved_cpu_cores_for_system_service_not_in";

    @SerializedName(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_NOT_IN)
    private List<Integer> reservedCpuCoresForSystemServiceNotIn = null;

    public static final String SERIALIZED_NAME_RUNNING_VM_NUM = "running_vm_num";

    @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM)
    private Integer runningVmNum;

    public static final String SERIALIZED_NAME_RUNNING_VM_NUM_GT = "running_vm_num_gt";

    @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_GT)
    private Integer runningVmNumGt;

    public static final String SERIALIZED_NAME_RUNNING_VM_NUM_GTE = "running_vm_num_gte";

    @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_GTE)
    private Integer runningVmNumGte;

    public static final String SERIALIZED_NAME_RUNNING_VM_NUM_IN = "running_vm_num_in";

    @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_IN)
    private List<Integer> runningVmNumIn = null;

    public static final String SERIALIZED_NAME_RUNNING_VM_NUM_LT = "running_vm_num_lt";

    @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_LT)
    private Integer runningVmNumLt;

    public static final String SERIALIZED_NAME_RUNNING_VM_NUM_LTE = "running_vm_num_lte";

    @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_LTE)
    private Integer runningVmNumLte;

    public static final String SERIALIZED_NAME_RUNNING_VM_NUM_NOT = "running_vm_num_not";

    @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_NOT)
    private Integer runningVmNumNot;

    public static final String SERIALIZED_NAME_RUNNING_VM_NUM_NOT_IN = "running_vm_num_not_in";

    @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_NOT_IN)
    private List<Integer> runningVmNumNotIn = null;

    public static final String SERIALIZED_NAME_SETTINGS = "settings";

    @SerializedName(SERIALIZED_NAME_SETTINGS)
    private ClusterSettingsWhereInput settings;

    public static final String SERIALIZED_NAME_SOFTWARE_EDITION = "software_edition";

    @SerializedName(SERIALIZED_NAME_SOFTWARE_EDITION)
    private SoftwareEdition softwareEdition;

    public static final String SERIALIZED_NAME_SOFTWARE_EDITION_IN = "software_edition_in";

    @SerializedName(SERIALIZED_NAME_SOFTWARE_EDITION_IN)
    private List<SoftwareEdition> softwareEditionIn = null;

    public static final String SERIALIZED_NAME_SOFTWARE_EDITION_NOT = "software_edition_not";

    @SerializedName(SERIALIZED_NAME_SOFTWARE_EDITION_NOT)
    private SoftwareEdition softwareEditionNot;

    public static final String SERIALIZED_NAME_SOFTWARE_EDITION_NOT_IN = "software_edition_not_in";

    @SerializedName(SERIALIZED_NAME_SOFTWARE_EDITION_NOT_IN)
    private List<SoftwareEdition> softwareEditionNotIn = null;

    public static final String SERIALIZED_NAME_STOPPED_VM_NUM = "stopped_vm_num";

    @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM)
    private Integer stoppedVmNum;

    public static final String SERIALIZED_NAME_STOPPED_VM_NUM_GT = "stopped_vm_num_gt";

    @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_GT)
    private Integer stoppedVmNumGt;

    public static final String SERIALIZED_NAME_STOPPED_VM_NUM_GTE = "stopped_vm_num_gte";

    @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_GTE)
    private Integer stoppedVmNumGte;

    public static final String SERIALIZED_NAME_STOPPED_VM_NUM_IN = "stopped_vm_num_in";

    @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_IN)
    private List<Integer> stoppedVmNumIn = null;

    public static final String SERIALIZED_NAME_STOPPED_VM_NUM_LT = "stopped_vm_num_lt";

    @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_LT)
    private Integer stoppedVmNumLt;

    public static final String SERIALIZED_NAME_STOPPED_VM_NUM_LTE = "stopped_vm_num_lte";

    @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_LTE)
    private Integer stoppedVmNumLte;

    public static final String SERIALIZED_NAME_STOPPED_VM_NUM_NOT = "stopped_vm_num_not";

    @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_NOT)
    private Integer stoppedVmNumNot;

    public static final String SERIALIZED_NAME_STOPPED_VM_NUM_NOT_IN = "stopped_vm_num_not_in";

    @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_NOT_IN)
    private List<Integer> stoppedVmNumNotIn = null;

    public static final String SERIALIZED_NAME_STRETCH = "stretch";

    @SerializedName(SERIALIZED_NAME_STRETCH)
    private Boolean stretch;

    public static final String SERIALIZED_NAME_STRETCH_NOT = "stretch_not";

    @SerializedName(SERIALIZED_NAME_STRETCH_NOT)
    private Boolean stretchNot;

    public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM = "suspended_vm_num";

    @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM)
    private Integer suspendedVmNum;

    public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_GT = "suspended_vm_num_gt";

    @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_GT)
    private Integer suspendedVmNumGt;

    public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_GTE = "suspended_vm_num_gte";

    @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_GTE)
    private Integer suspendedVmNumGte;

    public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_IN = "suspended_vm_num_in";

    @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_IN)
    private List<Integer> suspendedVmNumIn = null;

    public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_LT = "suspended_vm_num_lt";

    @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_LT)
    private Integer suspendedVmNumLt;

    public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_LTE = "suspended_vm_num_lte";

    @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_LTE)
    private Integer suspendedVmNumLte;

    public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT = "suspended_vm_num_not";

    @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT)
    private Integer suspendedVmNumNot;

    public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT_IN = "suspended_vm_num_not_in";

    @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT_IN)
    private List<Integer> suspendedVmNumNotIn = null;

    public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY = "total_cache_capacity";

    @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY)
    private Long totalCacheCapacity;

    public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GT = "total_cache_capacity_gt";

    @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GT)
    private Long totalCacheCapacityGt;

    public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GTE =
            "total_cache_capacity_gte";

    @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GTE)
    private Long totalCacheCapacityGte;

    public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_IN = "total_cache_capacity_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_IN)
    private List<Long> totalCacheCapacityIn = null;

    public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LT = "total_cache_capacity_lt";

    @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LT)
    private Long totalCacheCapacityLt;

    public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LTE =
            "total_cache_capacity_lte";

    @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LTE)
    private Long totalCacheCapacityLte;

    public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT =
            "total_cache_capacity_not";

    @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT)
    private Long totalCacheCapacityNot;

    public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT_IN =
            "total_cache_capacity_not_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT_IN)
    private List<Long> totalCacheCapacityNotIn = null;

    public static final String SERIALIZED_NAME_TOTAL_CPU_CORES = "total_cpu_cores";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES)
    private Integer totalCpuCores;

    public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_GT = "total_cpu_cores_gt";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_GT)
    private Integer totalCpuCoresGt;

    public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_GTE = "total_cpu_cores_gte";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_GTE)
    private Integer totalCpuCoresGte;

    public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_IN = "total_cpu_cores_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_IN)
    private List<Integer> totalCpuCoresIn = null;

    public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_LT = "total_cpu_cores_lt";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_LT)
    private Integer totalCpuCoresLt;

    public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_LTE = "total_cpu_cores_lte";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_LTE)
    private Integer totalCpuCoresLte;

    public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_NOT = "total_cpu_cores_not";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT)
    private Integer totalCpuCoresNot;

    public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_NOT_IN = "total_cpu_cores_not_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT_IN)
    private List<Integer> totalCpuCoresNotIn = null;

    public static final String SERIALIZED_NAME_TOTAL_CPU_HZ = "total_cpu_hz";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ)
    private Long totalCpuHz;

    public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_GT = "total_cpu_hz_gt";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_GT)
    private Long totalCpuHzGt;

    public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_GTE = "total_cpu_hz_gte";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_GTE)
    private Long totalCpuHzGte;

    public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_IN = "total_cpu_hz_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_IN)
    private List<Long> totalCpuHzIn = null;

    public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_LT = "total_cpu_hz_lt";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_LT)
    private Long totalCpuHzLt;

    public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_LTE = "total_cpu_hz_lte";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_LTE)
    private Long totalCpuHzLte;

    public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_NOT = "total_cpu_hz_not";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT)
    private Long totalCpuHzNot;

    public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_NOT_IN = "total_cpu_hz_not_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT_IN)
    private List<Long> totalCpuHzNotIn = null;

    public static final String SERIALIZED_NAME_TOTAL_CPU_SOCKETS = "total_cpu_sockets";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_SOCKETS)
    private Integer totalCpuSockets;

    public static final String SERIALIZED_NAME_TOTAL_CPU_SOCKETS_GT = "total_cpu_sockets_gt";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_GT)
    private Integer totalCpuSocketsGt;

    public static final String SERIALIZED_NAME_TOTAL_CPU_SOCKETS_GTE = "total_cpu_sockets_gte";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_GTE)
    private Integer totalCpuSocketsGte;

    public static final String SERIALIZED_NAME_TOTAL_CPU_SOCKETS_IN = "total_cpu_sockets_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_IN)
    private List<Integer> totalCpuSocketsIn = null;

    public static final String SERIALIZED_NAME_TOTAL_CPU_SOCKETS_LT = "total_cpu_sockets_lt";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_LT)
    private Integer totalCpuSocketsLt;

    public static final String SERIALIZED_NAME_TOTAL_CPU_SOCKETS_LTE = "total_cpu_sockets_lte";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_LTE)
    private Integer totalCpuSocketsLte;

    public static final String SERIALIZED_NAME_TOTAL_CPU_SOCKETS_NOT = "total_cpu_sockets_not";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_NOT)
    private Integer totalCpuSocketsNot;

    public static final String SERIALIZED_NAME_TOTAL_CPU_SOCKETS_NOT_IN =
            "total_cpu_sockets_not_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_NOT_IN)
    private List<Integer> totalCpuSocketsNotIn = null;

    public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY = "total_data_capacity";

    @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY)
    private Long totalDataCapacity;

    public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GT = "total_data_capacity_gt";

    @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GT)
    private Long totalDataCapacityGt;

    public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GTE = "total_data_capacity_gte";

    @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GTE)
    private Long totalDataCapacityGte;

    public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_IN = "total_data_capacity_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_IN)
    private List<Long> totalDataCapacityIn = null;

    public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LT = "total_data_capacity_lt";

    @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LT)
    private Long totalDataCapacityLt;

    public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LTE = "total_data_capacity_lte";

    @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LTE)
    private Long totalDataCapacityLte;

    public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT = "total_data_capacity_not";

    @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT)
    private Long totalDataCapacityNot;

    public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT_IN =
            "total_data_capacity_not_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT_IN)
    private List<Long> totalDataCapacityNotIn = null;

    public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES = "total_memory_bytes";

    @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES)
    private Long totalMemoryBytes;

    public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GT = "total_memory_bytes_gt";

    @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GT)
    private Long totalMemoryBytesGt;

    public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GTE = "total_memory_bytes_gte";

    @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GTE)
    private Long totalMemoryBytesGte;

    public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_IN = "total_memory_bytes_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_IN)
    private List<Long> totalMemoryBytesIn = null;

    public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LT = "total_memory_bytes_lt";

    @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LT)
    private Long totalMemoryBytesLt;

    public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LTE = "total_memory_bytes_lte";

    @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LTE)
    private Long totalMemoryBytesLte;

    public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT = "total_memory_bytes_not";

    @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT)
    private Long totalMemoryBytesNot;

    public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT_IN =
            "total_memory_bytes_not_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT_IN)
    private List<Long> totalMemoryBytesNotIn = null;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private ClusterType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<ClusterType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private ClusterType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<ClusterType> typeNotIn = null;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION = "upgrade_tool_version";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION)
    private String upgradeToolVersion;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_CONTAINS =
            "upgrade_tool_version_contains";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_CONTAINS)
    private String upgradeToolVersionContains;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_ENDS_WITH =
            "upgrade_tool_version_ends_with";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_ENDS_WITH)
    private String upgradeToolVersionEndsWith;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GT = "upgrade_tool_version_gt";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GT)
    private String upgradeToolVersionGt;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GTE =
            "upgrade_tool_version_gte";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GTE)
    private String upgradeToolVersionGte;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_IN = "upgrade_tool_version_in";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_IN)
    private List<String> upgradeToolVersionIn = null;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LT = "upgrade_tool_version_lt";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LT)
    private String upgradeToolVersionLt;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LTE =
            "upgrade_tool_version_lte";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LTE)
    private String upgradeToolVersionLte;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT =
            "upgrade_tool_version_not";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT)
    private String upgradeToolVersionNot;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_CONTAINS =
            "upgrade_tool_version_not_contains";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_CONTAINS)
    private String upgradeToolVersionNotContains;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_ENDS_WITH =
            "upgrade_tool_version_not_ends_with";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_ENDS_WITH)
    private String upgradeToolVersionNotEndsWith;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_IN =
            "upgrade_tool_version_not_in";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_IN)
    private List<String> upgradeToolVersionNotIn = null;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_STARTS_WITH =
            "upgrade_tool_version_not_starts_with";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_STARTS_WITH)
    private String upgradeToolVersionNotStartsWith;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_STARTS_WITH =
            "upgrade_tool_version_starts_with";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_STARTS_WITH)
    private String upgradeToolVersionStartsWith;

    public static final String SERIALIZED_NAME_USED_CPU_HZ = "used_cpu_hz";

    @SerializedName(SERIALIZED_NAME_USED_CPU_HZ)
    private Double usedCpuHz;

    public static final String SERIALIZED_NAME_USED_CPU_HZ_GT = "used_cpu_hz_gt";

    @SerializedName(SERIALIZED_NAME_USED_CPU_HZ_GT)
    private Double usedCpuHzGt;

    public static final String SERIALIZED_NAME_USED_CPU_HZ_GTE = "used_cpu_hz_gte";

    @SerializedName(SERIALIZED_NAME_USED_CPU_HZ_GTE)
    private Double usedCpuHzGte;

    public static final String SERIALIZED_NAME_USED_CPU_HZ_IN = "used_cpu_hz_in";

    @SerializedName(SERIALIZED_NAME_USED_CPU_HZ_IN)
    private List<Double> usedCpuHzIn = null;

    public static final String SERIALIZED_NAME_USED_CPU_HZ_LT = "used_cpu_hz_lt";

    @SerializedName(SERIALIZED_NAME_USED_CPU_HZ_LT)
    private Double usedCpuHzLt;

    public static final String SERIALIZED_NAME_USED_CPU_HZ_LTE = "used_cpu_hz_lte";

    @SerializedName(SERIALIZED_NAME_USED_CPU_HZ_LTE)
    private Double usedCpuHzLte;

    public static final String SERIALIZED_NAME_USED_CPU_HZ_NOT = "used_cpu_hz_not";

    @SerializedName(SERIALIZED_NAME_USED_CPU_HZ_NOT)
    private Double usedCpuHzNot;

    public static final String SERIALIZED_NAME_USED_CPU_HZ_NOT_IN = "used_cpu_hz_not_in";

    @SerializedName(SERIALIZED_NAME_USED_CPU_HZ_NOT_IN)
    private List<Double> usedCpuHzNotIn = null;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE = "used_data_space";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE)
    private Long usedDataSpace;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_GT = "used_data_space_gt";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_GT)
    private Long usedDataSpaceGt;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_GTE = "used_data_space_gte";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_GTE)
    private Long usedDataSpaceGte;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_IN = "used_data_space_in";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_IN)
    private List<Long> usedDataSpaceIn = null;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_LT = "used_data_space_lt";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_LT)
    private Long usedDataSpaceLt;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_LTE = "used_data_space_lte";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_LTE)
    private Long usedDataSpaceLte;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_NOT = "used_data_space_not";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_NOT)
    private Long usedDataSpaceNot;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN = "used_data_space_not_in";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN)
    private List<Long> usedDataSpaceNotIn = null;

    public static final String SERIALIZED_NAME_USED_MEMORY_BYTES = "used_memory_bytes";

    @SerializedName(SERIALIZED_NAME_USED_MEMORY_BYTES)
    private Double usedMemoryBytes;

    public static final String SERIALIZED_NAME_USED_MEMORY_BYTES_GT = "used_memory_bytes_gt";

    @SerializedName(SERIALIZED_NAME_USED_MEMORY_BYTES_GT)
    private Double usedMemoryBytesGt;

    public static final String SERIALIZED_NAME_USED_MEMORY_BYTES_GTE = "used_memory_bytes_gte";

    @SerializedName(SERIALIZED_NAME_USED_MEMORY_BYTES_GTE)
    private Double usedMemoryBytesGte;

    public static final String SERIALIZED_NAME_USED_MEMORY_BYTES_IN = "used_memory_bytes_in";

    @SerializedName(SERIALIZED_NAME_USED_MEMORY_BYTES_IN)
    private List<Double> usedMemoryBytesIn = null;

    public static final String SERIALIZED_NAME_USED_MEMORY_BYTES_LT = "used_memory_bytes_lt";

    @SerializedName(SERIALIZED_NAME_USED_MEMORY_BYTES_LT)
    private Double usedMemoryBytesLt;

    public static final String SERIALIZED_NAME_USED_MEMORY_BYTES_LTE = "used_memory_bytes_lte";

    @SerializedName(SERIALIZED_NAME_USED_MEMORY_BYTES_LTE)
    private Double usedMemoryBytesLte;

    public static final String SERIALIZED_NAME_USED_MEMORY_BYTES_NOT = "used_memory_bytes_not";

    @SerializedName(SERIALIZED_NAME_USED_MEMORY_BYTES_NOT)
    private Double usedMemoryBytesNot;

    public static final String SERIALIZED_NAME_USED_MEMORY_BYTES_NOT_IN =
            "used_memory_bytes_not_in";

    @SerializedName(SERIALIZED_NAME_USED_MEMORY_BYTES_NOT_IN)
    private List<Double> usedMemoryBytesNotIn = null;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE = "valid_data_space";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE)
    private Long validDataSpace;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_GT = "valid_data_space_gt";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_GT)
    private Long validDataSpaceGt;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_GTE = "valid_data_space_gte";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_GTE)
    private Long validDataSpaceGte;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_IN = "valid_data_space_in";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_IN)
    private List<Long> validDataSpaceIn = null;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_LT = "valid_data_space_lt";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_LT)
    private Long validDataSpaceLt;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_LTE = "valid_data_space_lte";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_LTE)
    private Long validDataSpaceLte;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_NOT = "valid_data_space_not";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_NOT)
    private Long validDataSpaceNot;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN = "valid_data_space_not_in";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN)
    private List<Long> validDataSpaceNotIn = null;

    public static final String SERIALIZED_NAME_VCENTER_ACCOUNT = "vcenterAccount";

    @SerializedName(SERIALIZED_NAME_VCENTER_ACCOUNT)
    private VcenterAccountWhereInput vcenterAccount;

    public static final String SERIALIZED_NAME_VDSES_EVERY = "vdses_every";

    @SerializedName(SERIALIZED_NAME_VDSES_EVERY)
    private VdsWhereInput vdsesEvery;

    public static final String SERIALIZED_NAME_VDSES_NONE = "vdses_none";

    @SerializedName(SERIALIZED_NAME_VDSES_NONE)
    private VdsWhereInput vdsesNone;

    public static final String SERIALIZED_NAME_VDSES_SOME = "vdses_some";

    @SerializedName(SERIALIZED_NAME_VDSES_SOME)
    private VdsWhereInput vdsesSome;

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

    public static final String SERIALIZED_NAME_VHOST_ENABLED = "vhost_enabled";

    @SerializedName(SERIALIZED_NAME_VHOST_ENABLED)
    private Boolean vhostEnabled;

    public static final String SERIALIZED_NAME_VHOST_ENABLED_NOT = "vhost_enabled_not";

    @SerializedName(SERIALIZED_NAME_VHOST_ENABLED_NOT)
    private Boolean vhostEnabledNot;

    public static final String SERIALIZED_NAME_VM_FOLDERS_EVERY = "vm_folders_every";

    @SerializedName(SERIALIZED_NAME_VM_FOLDERS_EVERY)
    private VmFolderWhereInput vmFoldersEvery;

    public static final String SERIALIZED_NAME_VM_FOLDERS_NONE = "vm_folders_none";

    @SerializedName(SERIALIZED_NAME_VM_FOLDERS_NONE)
    private VmFolderWhereInput vmFoldersNone;

    public static final String SERIALIZED_NAME_VM_FOLDERS_SOME = "vm_folders_some";

    @SerializedName(SERIALIZED_NAME_VM_FOLDERS_SOME)
    private VmFolderWhereInput vmFoldersSome;

    public static final String SERIALIZED_NAME_VM_NUM = "vm_num";

    @SerializedName(SERIALIZED_NAME_VM_NUM)
    private Integer vmNum;

    public static final String SERIALIZED_NAME_VM_NUM_GT = "vm_num_gt";

    @SerializedName(SERIALIZED_NAME_VM_NUM_GT)
    private Integer vmNumGt;

    public static final String SERIALIZED_NAME_VM_NUM_GTE = "vm_num_gte";

    @SerializedName(SERIALIZED_NAME_VM_NUM_GTE)
    private Integer vmNumGte;

    public static final String SERIALIZED_NAME_VM_NUM_IN = "vm_num_in";

    @SerializedName(SERIALIZED_NAME_VM_NUM_IN)
    private List<Integer> vmNumIn = null;

    public static final String SERIALIZED_NAME_VM_NUM_LT = "vm_num_lt";

    @SerializedName(SERIALIZED_NAME_VM_NUM_LT)
    private Integer vmNumLt;

    public static final String SERIALIZED_NAME_VM_NUM_LTE = "vm_num_lte";

    @SerializedName(SERIALIZED_NAME_VM_NUM_LTE)
    private Integer vmNumLte;

    public static final String SERIALIZED_NAME_VM_NUM_NOT = "vm_num_not";

    @SerializedName(SERIALIZED_NAME_VM_NUM_NOT)
    private Integer vmNumNot;

    public static final String SERIALIZED_NAME_VM_NUM_NOT_IN = "vm_num_not_in";

    @SerializedName(SERIALIZED_NAME_VM_NUM_NOT_IN)
    private List<Integer> vmNumNotIn = null;

    public static final String SERIALIZED_NAME_VM_TEMPLATES_EVERY = "vm_templates_every";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATES_EVERY)
    private VmTemplateWhereInput vmTemplatesEvery;

    public static final String SERIALIZED_NAME_VM_TEMPLATES_NONE = "vm_templates_none";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATES_NONE)
    private VmTemplateWhereInput vmTemplatesNone;

    public static final String SERIALIZED_NAME_VM_TEMPLATES_SOME = "vm_templates_some";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATES_SOME)
    private VmTemplateWhereInput vmTemplatesSome;

    public static final String SERIALIZED_NAME_VMS_EVERY = "vms_every";

    @SerializedName(SERIALIZED_NAME_VMS_EVERY)
    private VmWhereInput vmsEvery;

    public static final String SERIALIZED_NAME_VMS_NONE = "vms_none";

    @SerializedName(SERIALIZED_NAME_VMS_NONE)
    private VmWhereInput vmsNone;

    public static final String SERIALIZED_NAME_VMS_SOME = "vms_some";

    @SerializedName(SERIALIZED_NAME_VMS_SOME)
    private VmWhereInput vmsSome;

    public static final String SERIALIZED_NAME_WITNESS = "witness";

    @SerializedName(SERIALIZED_NAME_WITNESS)
    private WitnessWhereInput witness;

    public static final String SERIALIZED_NAME_ZONES_EVERY = "zones_every";

    @SerializedName(SERIALIZED_NAME_ZONES_EVERY)
    private ZoneWhereInput zonesEvery;

    public static final String SERIALIZED_NAME_ZONES_NONE = "zones_none";

    @SerializedName(SERIALIZED_NAME_ZONES_NONE)
    private ZoneWhereInput zonesNone;

    public static final String SERIALIZED_NAME_ZONES_SOME = "zones_some";

    @SerializedName(SERIALIZED_NAME_ZONES_SOME)
    private ZoneWhereInput zonesSome;

    public ClusterWhereInput() {}

    public ClusterWhereInput AND(List<ClusterWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public ClusterWhereInput addANDItem(ClusterWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<ClusterWhereInput>();
        }
        this.AND.add(ANDItem);
        return this;
    }

    /**
     * Get AND
     *
     * @return AND
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ClusterWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<ClusterWhereInput> AND) {
        this.AND = AND;
    }

    public ClusterWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public ClusterWhereInput AND_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public void setAND_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_A_N_D);
        }
    }

    public boolean getAND_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_A_N_D);
    }

    public ClusterWhereInput NOT(List<ClusterWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public ClusterWhereInput addNOTItem(ClusterWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<ClusterWhereInput>();
        }
        this.NOT.add(NOTItem);
        return this;
    }

    /**
     * Get NOT
     *
     * @return NOT
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ClusterWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<ClusterWhereInput> NOT) {
        this.NOT = NOT;
    }

    public ClusterWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public ClusterWhereInput NOT_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public void setNOT_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_N_O_T);
        }
    }

    public boolean getNOT_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_N_O_T);
    }

    public ClusterWhereInput OR(List<ClusterWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public ClusterWhereInput addORItem(ClusterWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<ClusterWhereInput>();
        }
        this.OR.add(ORItem);
        return this;
    }

    /**
     * Get OR
     *
     * @return OR
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ClusterWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<ClusterWhereInput> OR) {
        this.OR = OR;
    }

    public ClusterWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public ClusterWhereInput OR_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_O_R);
        return this;
    }

    public void setOR_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_O_R);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_O_R);
        }
    }

    public boolean getOR_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_O_R);
    }

    public ClusterWhereInput applicationHighestVersion(String applicationHighestVersion) {

        this.applicationHighestVersion = applicationHighestVersion;
        return this;
    }

    /**
     * Get applicationHighestVersion
     *
     * @return applicationHighestVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApplicationHighestVersion() {
        return applicationHighestVersion;
    }

    public void setApplicationHighestVersion(String applicationHighestVersion) {
        this.applicationHighestVersion = applicationHighestVersion;
    }

    public ClusterWhereInput applicationHighestVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION);
        return this;
    }

    public ClusterWhereInput applicationHighestVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION);
        return this;
    }

    public void setApplicationHighestVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION);
        }
    }

    public boolean getApplicationHighestVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION);
    }

    public ClusterWhereInput applicationHighestVersionContains(
            String applicationHighestVersionContains) {

        this.applicationHighestVersionContains = applicationHighestVersionContains;
        return this;
    }

    /**
     * Get applicationHighestVersionContains
     *
     * @return applicationHighestVersionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApplicationHighestVersionContains() {
        return applicationHighestVersionContains;
    }

    public void setApplicationHighestVersionContains(String applicationHighestVersionContains) {
        this.applicationHighestVersionContains = applicationHighestVersionContains;
    }

    public ClusterWhereInput applicationHighestVersionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_CONTAINS);
        return this;
    }

    public ClusterWhereInput applicationHighestVersionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_CONTAINS);
        return this;
    }

    public void setApplicationHighestVersionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_CONTAINS);
        }
    }

    public boolean getApplicationHighestVersionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_CONTAINS);
    }

    public ClusterWhereInput applicationHighestVersionEndsWith(
            String applicationHighestVersionEndsWith) {

        this.applicationHighestVersionEndsWith = applicationHighestVersionEndsWith;
        return this;
    }

    /**
     * Get applicationHighestVersionEndsWith
     *
     * @return applicationHighestVersionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApplicationHighestVersionEndsWith() {
        return applicationHighestVersionEndsWith;
    }

    public void setApplicationHighestVersionEndsWith(String applicationHighestVersionEndsWith) {
        this.applicationHighestVersionEndsWith = applicationHighestVersionEndsWith;
    }

    public ClusterWhereInput applicationHighestVersionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput applicationHighestVersionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_ENDS_WITH);
        return this;
    }

    public void setApplicationHighestVersionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_ENDS_WITH);
        }
    }

    public boolean getApplicationHighestVersionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_ENDS_WITH);
    }

    public ClusterWhereInput applicationHighestVersionGt(String applicationHighestVersionGt) {

        this.applicationHighestVersionGt = applicationHighestVersionGt;
        return this;
    }

    /**
     * Get applicationHighestVersionGt
     *
     * @return applicationHighestVersionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApplicationHighestVersionGt() {
        return applicationHighestVersionGt;
    }

    public void setApplicationHighestVersionGt(String applicationHighestVersionGt) {
        this.applicationHighestVersionGt = applicationHighestVersionGt;
    }

    public ClusterWhereInput applicationHighestVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_GT);
        return this;
    }

    public ClusterWhereInput applicationHighestVersionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_GT);
        return this;
    }

    public void setApplicationHighestVersionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_GT);
        }
    }

    public boolean getApplicationHighestVersionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_GT);
    }

    public ClusterWhereInput applicationHighestVersionGte(String applicationHighestVersionGte) {

        this.applicationHighestVersionGte = applicationHighestVersionGte;
        return this;
    }

    /**
     * Get applicationHighestVersionGte
     *
     * @return applicationHighestVersionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApplicationHighestVersionGte() {
        return applicationHighestVersionGte;
    }

    public void setApplicationHighestVersionGte(String applicationHighestVersionGte) {
        this.applicationHighestVersionGte = applicationHighestVersionGte;
    }

    public ClusterWhereInput applicationHighestVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_GTE);
        return this;
    }

    public ClusterWhereInput applicationHighestVersionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_GTE);
        return this;
    }

    public void setApplicationHighestVersionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_GTE);
        }
    }

    public boolean getApplicationHighestVersionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_GTE);
    }

    public ClusterWhereInput applicationHighestVersionIn(List<String> applicationHighestVersionIn) {

        this.applicationHighestVersionIn = applicationHighestVersionIn;
        return this;
    }

    public ClusterWhereInput addApplicationHighestVersionInItem(
            String applicationHighestVersionInItem) {
        if (this.applicationHighestVersionIn == null) {
            this.applicationHighestVersionIn = new ArrayList<String>();
        }
        this.applicationHighestVersionIn.add(applicationHighestVersionInItem);
        return this;
    }

    /**
     * Get applicationHighestVersionIn
     *
     * @return applicationHighestVersionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getApplicationHighestVersionIn() {
        return applicationHighestVersionIn;
    }

    public void setApplicationHighestVersionIn(List<String> applicationHighestVersionIn) {
        this.applicationHighestVersionIn = applicationHighestVersionIn;
    }

    public ClusterWhereInput applicationHighestVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_IN);
        return this;
    }

    public ClusterWhereInput applicationHighestVersionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_IN);
        return this;
    }

    public void setApplicationHighestVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_IN);
        }
    }

    public boolean getApplicationHighestVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_IN);
    }

    public ClusterWhereInput applicationHighestVersionLt(String applicationHighestVersionLt) {

        this.applicationHighestVersionLt = applicationHighestVersionLt;
        return this;
    }

    /**
     * Get applicationHighestVersionLt
     *
     * @return applicationHighestVersionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApplicationHighestVersionLt() {
        return applicationHighestVersionLt;
    }

    public void setApplicationHighestVersionLt(String applicationHighestVersionLt) {
        this.applicationHighestVersionLt = applicationHighestVersionLt;
    }

    public ClusterWhereInput applicationHighestVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_LT);
        return this;
    }

    public ClusterWhereInput applicationHighestVersionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_LT);
        return this;
    }

    public void setApplicationHighestVersionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_LT);
        }
    }

    public boolean getApplicationHighestVersionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_LT);
    }

    public ClusterWhereInput applicationHighestVersionLte(String applicationHighestVersionLte) {

        this.applicationHighestVersionLte = applicationHighestVersionLte;
        return this;
    }

    /**
     * Get applicationHighestVersionLte
     *
     * @return applicationHighestVersionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApplicationHighestVersionLte() {
        return applicationHighestVersionLte;
    }

    public void setApplicationHighestVersionLte(String applicationHighestVersionLte) {
        this.applicationHighestVersionLte = applicationHighestVersionLte;
    }

    public ClusterWhereInput applicationHighestVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_LTE);
        return this;
    }

    public ClusterWhereInput applicationHighestVersionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_LTE);
        return this;
    }

    public void setApplicationHighestVersionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_LTE);
        }
    }

    public boolean getApplicationHighestVersionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_LTE);
    }

    public ClusterWhereInput applicationHighestVersionNot(String applicationHighestVersionNot) {

        this.applicationHighestVersionNot = applicationHighestVersionNot;
        return this;
    }

    /**
     * Get applicationHighestVersionNot
     *
     * @return applicationHighestVersionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApplicationHighestVersionNot() {
        return applicationHighestVersionNot;
    }

    public void setApplicationHighestVersionNot(String applicationHighestVersionNot) {
        this.applicationHighestVersionNot = applicationHighestVersionNot;
    }

    public ClusterWhereInput applicationHighestVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT);
        return this;
    }

    public ClusterWhereInput applicationHighestVersionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT);
        return this;
    }

    public void setApplicationHighestVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT);
        }
    }

    public boolean getApplicationHighestVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT);
    }

    public ClusterWhereInput applicationHighestVersionNotContains(
            String applicationHighestVersionNotContains) {

        this.applicationHighestVersionNotContains = applicationHighestVersionNotContains;
        return this;
    }

    /**
     * Get applicationHighestVersionNotContains
     *
     * @return applicationHighestVersionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApplicationHighestVersionNotContains() {
        return applicationHighestVersionNotContains;
    }

    public void setApplicationHighestVersionNotContains(
            String applicationHighestVersionNotContains) {
        this.applicationHighestVersionNotContains = applicationHighestVersionNotContains;
    }

    public ClusterWhereInput applicationHighestVersionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_CONTAINS);
        return this;
    }

    public ClusterWhereInput applicationHighestVersionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_CONTAINS);
        return this;
    }

    public void setApplicationHighestVersionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_CONTAINS);
        }
    }

    public boolean getApplicationHighestVersionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_CONTAINS);
    }

    public ClusterWhereInput applicationHighestVersionNotEndsWith(
            String applicationHighestVersionNotEndsWith) {

        this.applicationHighestVersionNotEndsWith = applicationHighestVersionNotEndsWith;
        return this;
    }

    /**
     * Get applicationHighestVersionNotEndsWith
     *
     * @return applicationHighestVersionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApplicationHighestVersionNotEndsWith() {
        return applicationHighestVersionNotEndsWith;
    }

    public void setApplicationHighestVersionNotEndsWith(
            String applicationHighestVersionNotEndsWith) {
        this.applicationHighestVersionNotEndsWith = applicationHighestVersionNotEndsWith;
    }

    public ClusterWhereInput applicationHighestVersionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput applicationHighestVersionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public void setApplicationHighestVersionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_ENDS_WITH);
        }
    }

    public boolean getApplicationHighestVersionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_ENDS_WITH);
    }

    public ClusterWhereInput applicationHighestVersionNotIn(
            List<String> applicationHighestVersionNotIn) {

        this.applicationHighestVersionNotIn = applicationHighestVersionNotIn;
        return this;
    }

    public ClusterWhereInput addApplicationHighestVersionNotInItem(
            String applicationHighestVersionNotInItem) {
        if (this.applicationHighestVersionNotIn == null) {
            this.applicationHighestVersionNotIn = new ArrayList<String>();
        }
        this.applicationHighestVersionNotIn.add(applicationHighestVersionNotInItem);
        return this;
    }

    /**
     * Get applicationHighestVersionNotIn
     *
     * @return applicationHighestVersionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getApplicationHighestVersionNotIn() {
        return applicationHighestVersionNotIn;
    }

    public void setApplicationHighestVersionNotIn(List<String> applicationHighestVersionNotIn) {
        this.applicationHighestVersionNotIn = applicationHighestVersionNotIn;
    }

    public ClusterWhereInput applicationHighestVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_IN);
        return this;
    }

    public ClusterWhereInput applicationHighestVersionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_IN);
        return this;
    }

    public void setApplicationHighestVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_IN);
        }
    }

    public boolean getApplicationHighestVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_IN);
    }

    public ClusterWhereInput applicationHighestVersionNotStartsWith(
            String applicationHighestVersionNotStartsWith) {

        this.applicationHighestVersionNotStartsWith = applicationHighestVersionNotStartsWith;
        return this;
    }

    /**
     * Get applicationHighestVersionNotStartsWith
     *
     * @return applicationHighestVersionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApplicationHighestVersionNotStartsWith() {
        return applicationHighestVersionNotStartsWith;
    }

    public void setApplicationHighestVersionNotStartsWith(
            String applicationHighestVersionNotStartsWith) {
        this.applicationHighestVersionNotStartsWith = applicationHighestVersionNotStartsWith;
    }

    public ClusterWhereInput applicationHighestVersionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput applicationHighestVersionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public void setApplicationHighestVersionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_STARTS_WITH);
        }
    }

    public boolean getApplicationHighestVersionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_NOT_STARTS_WITH);
    }

    public ClusterWhereInput applicationHighestVersionStartsWith(
            String applicationHighestVersionStartsWith) {

        this.applicationHighestVersionStartsWith = applicationHighestVersionStartsWith;
        return this;
    }

    /**
     * Get applicationHighestVersionStartsWith
     *
     * @return applicationHighestVersionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApplicationHighestVersionStartsWith() {
        return applicationHighestVersionStartsWith;
    }

    public void setApplicationHighestVersionStartsWith(String applicationHighestVersionStartsWith) {
        this.applicationHighestVersionStartsWith = applicationHighestVersionStartsWith;
    }

    public ClusterWhereInput applicationHighestVersionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput applicationHighestVersionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_STARTS_WITH);
        return this;
    }

    public void setApplicationHighestVersionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_STARTS_WITH);
        }
    }

    public boolean getApplicationHighestVersionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION_STARTS_WITH);
    }

    public ClusterWhereInput applicationsEvery(ApplicationWhereInput applicationsEvery) {

        this.applicationsEvery = applicationsEvery;
        return this;
    }

    /**
     * Get applicationsEvery
     *
     * @return applicationsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ApplicationWhereInput getApplicationsEvery() {
        return applicationsEvery;
    }

    public void setApplicationsEvery(ApplicationWhereInput applicationsEvery) {
        this.applicationsEvery = applicationsEvery;
    }

    public ClusterWhereInput applicationsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATIONS_EVERY);
        return this;
    }

    public ClusterWhereInput applicationsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATIONS_EVERY);
        return this;
    }

    public void setApplicationsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATIONS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATIONS_EVERY);
        }
    }

    public boolean getApplicationsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATIONS_EVERY);
    }

    public ClusterWhereInput applicationsNone(ApplicationWhereInput applicationsNone) {

        this.applicationsNone = applicationsNone;
        return this;
    }

    /**
     * Get applicationsNone
     *
     * @return applicationsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ApplicationWhereInput getApplicationsNone() {
        return applicationsNone;
    }

    public void setApplicationsNone(ApplicationWhereInput applicationsNone) {
        this.applicationsNone = applicationsNone;
    }

    public ClusterWhereInput applicationsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATIONS_NONE);
        return this;
    }

    public ClusterWhereInput applicationsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATIONS_NONE);
        return this;
    }

    public void setApplicationsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATIONS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATIONS_NONE);
        }
    }

    public boolean getApplicationsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATIONS_NONE);
    }

    public ClusterWhereInput applicationsSome(ApplicationWhereInput applicationsSome) {

        this.applicationsSome = applicationsSome;
        return this;
    }

    /**
     * Get applicationsSome
     *
     * @return applicationsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ApplicationWhereInput getApplicationsSome() {
        return applicationsSome;
    }

    public void setApplicationsSome(ApplicationWhereInput applicationsSome) {
        this.applicationsSome = applicationsSome;
    }

    public ClusterWhereInput applicationsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATIONS_SOME);
        return this;
    }

    public ClusterWhereInput applicationsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATIONS_SOME);
        return this;
    }

    public void setApplicationsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATIONS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATIONS_SOME);
        }
    }

    public boolean getApplicationsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATIONS_SOME);
    }

    public ClusterWhereInput architecture(Architecture architecture) {

        this.architecture = architecture;
        return this;
    }

    /**
     * Get architecture
     *
     * @return architecture
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Architecture getArchitecture() {
        return architecture;
    }

    public void setArchitecture(Architecture architecture) {
        this.architecture = architecture;
    }

    public ClusterWhereInput architecture_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE);
        return this;
    }

    public ClusterWhereInput architecture_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ARCHITECTURE);
        return this;
    }

    public void setArchitecture_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ARCHITECTURE);
        }
    }

    public boolean getArchitecture_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ARCHITECTURE);
    }

    public ClusterWhereInput architectureIn(List<Architecture> architectureIn) {

        this.architectureIn = architectureIn;
        return this;
    }

    public ClusterWhereInput addArchitectureInItem(Architecture architectureInItem) {
        if (this.architectureIn == null) {
            this.architectureIn = new ArrayList<Architecture>();
        }
        this.architectureIn.add(architectureInItem);
        return this;
    }

    /**
     * Get architectureIn
     *
     * @return architectureIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Architecture> getArchitectureIn() {
        return architectureIn;
    }

    public void setArchitectureIn(List<Architecture> architectureIn) {
        this.architectureIn = architectureIn;
    }

    public ClusterWhereInput architectureIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE_IN);
        return this;
    }

    public ClusterWhereInput architectureIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ARCHITECTURE_IN);
        return this;
    }

    public void setArchitectureIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ARCHITECTURE_IN);
        }
    }

    public boolean getArchitectureIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ARCHITECTURE_IN);
    }

    public ClusterWhereInput architectureNot(Architecture architectureNot) {

        this.architectureNot = architectureNot;
        return this;
    }

    /**
     * Get architectureNot
     *
     * @return architectureNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Architecture getArchitectureNot() {
        return architectureNot;
    }

    public void setArchitectureNot(Architecture architectureNot) {
        this.architectureNot = architectureNot;
    }

    public ClusterWhereInput architectureNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE_NOT);
        return this;
    }

    public ClusterWhereInput architectureNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ARCHITECTURE_NOT);
        return this;
    }

    public void setArchitectureNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ARCHITECTURE_NOT);
        }
    }

    public boolean getArchitectureNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ARCHITECTURE_NOT);
    }

    public ClusterWhereInput architectureNotIn(List<Architecture> architectureNotIn) {

        this.architectureNotIn = architectureNotIn;
        return this;
    }

    public ClusterWhereInput addArchitectureNotInItem(Architecture architectureNotInItem) {
        if (this.architectureNotIn == null) {
            this.architectureNotIn = new ArrayList<Architecture>();
        }
        this.architectureNotIn.add(architectureNotInItem);
        return this;
    }

    /**
     * Get architectureNotIn
     *
     * @return architectureNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Architecture> getArchitectureNotIn() {
        return architectureNotIn;
    }

    public void setArchitectureNotIn(List<Architecture> architectureNotIn) {
        this.architectureNotIn = architectureNotIn;
    }

    public ClusterWhereInput architectureNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE_NOT_IN);
        return this;
    }

    public ClusterWhereInput architectureNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ARCHITECTURE_NOT_IN);
        return this;
    }

    public void setArchitectureNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ARCHITECTURE_NOT_IN);
        }
    }

    public boolean getArchitectureNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ARCHITECTURE_NOT_IN);
    }

    public ClusterWhereInput autoConverge(Boolean autoConverge) {

        this.autoConverge = autoConverge;
        return this;
    }

    /**
     * Get autoConverge
     *
     * @return autoConverge
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getAutoConverge() {
        return autoConverge;
    }

    public void setAutoConverge(Boolean autoConverge) {
        this.autoConverge = autoConverge;
    }

    public ClusterWhereInput autoConverge_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_CONVERGE);
        return this;
    }

    public ClusterWhereInput autoConverge_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_CONVERGE);
        return this;
    }

    public void setAutoConverge_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_CONVERGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_CONVERGE);
        }
    }

    public boolean getAutoConverge_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_CONVERGE);
    }

    public ClusterWhereInput autoConvergeNot(Boolean autoConvergeNot) {

        this.autoConvergeNot = autoConvergeNot;
        return this;
    }

    /**
     * Get autoConvergeNot
     *
     * @return autoConvergeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getAutoConvergeNot() {
        return autoConvergeNot;
    }

    public void setAutoConvergeNot(Boolean autoConvergeNot) {
        this.autoConvergeNot = autoConvergeNot;
    }

    public ClusterWhereInput autoConvergeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_CONVERGE_NOT);
        return this;
    }

    public ClusterWhereInput autoConvergeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_CONVERGE_NOT);
        return this;
    }

    public void setAutoConvergeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_CONVERGE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_CONVERGE_NOT);
        }
    }

    public boolean getAutoConvergeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_CONVERGE_NOT);
    }

    public ClusterWhereInput connectState(ConnectState connectState) {

        this.connectState = connectState;
        return this;
    }

    /**
     * Get connectState
     *
     * @return connectState
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConnectState getConnectState() {
        return connectState;
    }

    public void setConnectState(ConnectState connectState) {
        this.connectState = connectState;
    }

    public ClusterWhereInput connectState_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONNECT_STATE);
        return this;
    }

    public ClusterWhereInput connectState_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONNECT_STATE);
        return this;
    }

    public void setConnectState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONNECT_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONNECT_STATE);
        }
    }

    public boolean getConnectState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONNECT_STATE);
    }

    public ClusterWhereInput connectStateIn(List<ConnectState> connectStateIn) {

        this.connectStateIn = connectStateIn;
        return this;
    }

    public ClusterWhereInput addConnectStateInItem(ConnectState connectStateInItem) {
        if (this.connectStateIn == null) {
            this.connectStateIn = new ArrayList<ConnectState>();
        }
        this.connectStateIn.add(connectStateInItem);
        return this;
    }

    /**
     * Get connectStateIn
     *
     * @return connectStateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ConnectState> getConnectStateIn() {
        return connectStateIn;
    }

    public void setConnectStateIn(List<ConnectState> connectStateIn) {
        this.connectStateIn = connectStateIn;
    }

    public ClusterWhereInput connectStateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONNECT_STATE_IN);
        return this;
    }

    public ClusterWhereInput connectStateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONNECT_STATE_IN);
        return this;
    }

    public void setConnectStateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONNECT_STATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONNECT_STATE_IN);
        }
    }

    public boolean getConnectStateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONNECT_STATE_IN);
    }

    public ClusterWhereInput connectStateNot(ConnectState connectStateNot) {

        this.connectStateNot = connectStateNot;
        return this;
    }

    /**
     * Get connectStateNot
     *
     * @return connectStateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConnectState getConnectStateNot() {
        return connectStateNot;
    }

    public void setConnectStateNot(ConnectState connectStateNot) {
        this.connectStateNot = connectStateNot;
    }

    public ClusterWhereInput connectStateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONNECT_STATE_NOT);
        return this;
    }

    public ClusterWhereInput connectStateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONNECT_STATE_NOT);
        return this;
    }

    public void setConnectStateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONNECT_STATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONNECT_STATE_NOT);
        }
    }

    public boolean getConnectStateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONNECT_STATE_NOT);
    }

    public ClusterWhereInput connectStateNotIn(List<ConnectState> connectStateNotIn) {

        this.connectStateNotIn = connectStateNotIn;
        return this;
    }

    public ClusterWhereInput addConnectStateNotInItem(ConnectState connectStateNotInItem) {
        if (this.connectStateNotIn == null) {
            this.connectStateNotIn = new ArrayList<ConnectState>();
        }
        this.connectStateNotIn.add(connectStateNotInItem);
        return this;
    }

    /**
     * Get connectStateNotIn
     *
     * @return connectStateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ConnectState> getConnectStateNotIn() {
        return connectStateNotIn;
    }

    public void setConnectStateNotIn(List<ConnectState> connectStateNotIn) {
        this.connectStateNotIn = connectStateNotIn;
    }

    public ClusterWhereInput connectStateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONNECT_STATE_NOT_IN);
        return this;
    }

    public ClusterWhereInput connectStateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONNECT_STATE_NOT_IN);
        return this;
    }

    public void setConnectStateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONNECT_STATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONNECT_STATE_NOT_IN);
        }
    }

    public boolean getConnectStateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONNECT_STATE_NOT_IN);
    }

    public ClusterWhereInput consistencyGroupsEvery(
            ConsistencyGroupWhereInput consistencyGroupsEvery) {

        this.consistencyGroupsEvery = consistencyGroupsEvery;
        return this;
    }

    /**
     * Get consistencyGroupsEvery
     *
     * @return consistencyGroupsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistencyGroupWhereInput getConsistencyGroupsEvery() {
        return consistencyGroupsEvery;
    }

    public void setConsistencyGroupsEvery(ConsistencyGroupWhereInput consistencyGroupsEvery) {
        this.consistencyGroupsEvery = consistencyGroupsEvery;
    }

    public ClusterWhereInput consistencyGroupsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUPS_EVERY);
        return this;
    }

    public ClusterWhereInput consistencyGroupsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUPS_EVERY);
        return this;
    }

    public void setConsistencyGroupsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUPS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUPS_EVERY);
        }
    }

    public boolean getConsistencyGroupsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUPS_EVERY);
    }

    public ClusterWhereInput consistencyGroupsNone(
            ConsistencyGroupWhereInput consistencyGroupsNone) {

        this.consistencyGroupsNone = consistencyGroupsNone;
        return this;
    }

    /**
     * Get consistencyGroupsNone
     *
     * @return consistencyGroupsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistencyGroupWhereInput getConsistencyGroupsNone() {
        return consistencyGroupsNone;
    }

    public void setConsistencyGroupsNone(ConsistencyGroupWhereInput consistencyGroupsNone) {
        this.consistencyGroupsNone = consistencyGroupsNone;
    }

    public ClusterWhereInput consistencyGroupsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUPS_NONE);
        return this;
    }

    public ClusterWhereInput consistencyGroupsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUPS_NONE);
        return this;
    }

    public void setConsistencyGroupsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUPS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUPS_NONE);
        }
    }

    public boolean getConsistencyGroupsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUPS_NONE);
    }

    public ClusterWhereInput consistencyGroupsSome(
            ConsistencyGroupWhereInput consistencyGroupsSome) {

        this.consistencyGroupsSome = consistencyGroupsSome;
        return this;
    }

    /**
     * Get consistencyGroupsSome
     *
     * @return consistencyGroupsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistencyGroupWhereInput getConsistencyGroupsSome() {
        return consistencyGroupsSome;
    }

    public void setConsistencyGroupsSome(ConsistencyGroupWhereInput consistencyGroupsSome) {
        this.consistencyGroupsSome = consistencyGroupsSome;
    }

    public ClusterWhereInput consistencyGroupsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUPS_SOME);
        return this;
    }

    public ClusterWhereInput consistencyGroupsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUPS_SOME);
        return this;
    }

    public void setConsistencyGroupsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUPS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUPS_SOME);
        }
    }

    public boolean getConsistencyGroupsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUPS_SOME);
    }

    public ClusterWhereInput currentCpuModel(String currentCpuModel) {

        this.currentCpuModel = currentCpuModel;
        return this;
    }

    /**
     * Get currentCpuModel
     *
     * @return currentCpuModel
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCurrentCpuModel() {
        return currentCpuModel;
    }

    public void setCurrentCpuModel(String currentCpuModel) {
        this.currentCpuModel = currentCpuModel;
    }

    public ClusterWhereInput currentCpuModel_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL);
        return this;
    }

    public ClusterWhereInput currentCpuModel_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL);
        return this;
    }

    public void setCurrentCpuModel_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL);
        }
    }

    public boolean getCurrentCpuModel_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CURRENT_CPU_MODEL);
    }

    public ClusterWhereInput currentCpuModelContains(String currentCpuModelContains) {

        this.currentCpuModelContains = currentCpuModelContains;
        return this;
    }

    /**
     * Get currentCpuModelContains
     *
     * @return currentCpuModelContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCurrentCpuModelContains() {
        return currentCpuModelContains;
    }

    public void setCurrentCpuModelContains(String currentCpuModelContains) {
        this.currentCpuModelContains = currentCpuModelContains;
    }

    public ClusterWhereInput currentCpuModelContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_CONTAINS);
        return this;
    }

    public ClusterWhereInput currentCpuModelContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_CONTAINS);
        return this;
    }

    public void setCurrentCpuModelContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_CONTAINS);
        }
    }

    public boolean getCurrentCpuModelContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CURRENT_CPU_MODEL_CONTAINS);
    }

    public ClusterWhereInput currentCpuModelEndsWith(String currentCpuModelEndsWith) {

        this.currentCpuModelEndsWith = currentCpuModelEndsWith;
        return this;
    }

    /**
     * Get currentCpuModelEndsWith
     *
     * @return currentCpuModelEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCurrentCpuModelEndsWith() {
        return currentCpuModelEndsWith;
    }

    public void setCurrentCpuModelEndsWith(String currentCpuModelEndsWith) {
        this.currentCpuModelEndsWith = currentCpuModelEndsWith;
    }

    public ClusterWhereInput currentCpuModelEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput currentCpuModelEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_ENDS_WITH);
        return this;
    }

    public void setCurrentCpuModelEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_ENDS_WITH);
        }
    }

    public boolean getCurrentCpuModelEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CURRENT_CPU_MODEL_ENDS_WITH);
    }

    public ClusterWhereInput currentCpuModelGt(String currentCpuModelGt) {

        this.currentCpuModelGt = currentCpuModelGt;
        return this;
    }

    /**
     * Get currentCpuModelGt
     *
     * @return currentCpuModelGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCurrentCpuModelGt() {
        return currentCpuModelGt;
    }

    public void setCurrentCpuModelGt(String currentCpuModelGt) {
        this.currentCpuModelGt = currentCpuModelGt;
    }

    public ClusterWhereInput currentCpuModelGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_GT);
        return this;
    }

    public ClusterWhereInput currentCpuModelGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_GT);
        return this;
    }

    public void setCurrentCpuModelGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_GT);
        }
    }

    public boolean getCurrentCpuModelGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CURRENT_CPU_MODEL_GT);
    }

    public ClusterWhereInput currentCpuModelGte(String currentCpuModelGte) {

        this.currentCpuModelGte = currentCpuModelGte;
        return this;
    }

    /**
     * Get currentCpuModelGte
     *
     * @return currentCpuModelGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCurrentCpuModelGte() {
        return currentCpuModelGte;
    }

    public void setCurrentCpuModelGte(String currentCpuModelGte) {
        this.currentCpuModelGte = currentCpuModelGte;
    }

    public ClusterWhereInput currentCpuModelGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_GTE);
        return this;
    }

    public ClusterWhereInput currentCpuModelGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_GTE);
        return this;
    }

    public void setCurrentCpuModelGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_GTE);
        }
    }

    public boolean getCurrentCpuModelGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CURRENT_CPU_MODEL_GTE);
    }

    public ClusterWhereInput currentCpuModelIn(List<String> currentCpuModelIn) {

        this.currentCpuModelIn = currentCpuModelIn;
        return this;
    }

    public ClusterWhereInput addCurrentCpuModelInItem(String currentCpuModelInItem) {
        if (this.currentCpuModelIn == null) {
            this.currentCpuModelIn = new ArrayList<String>();
        }
        this.currentCpuModelIn.add(currentCpuModelInItem);
        return this;
    }

    /**
     * Get currentCpuModelIn
     *
     * @return currentCpuModelIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCurrentCpuModelIn() {
        return currentCpuModelIn;
    }

    public void setCurrentCpuModelIn(List<String> currentCpuModelIn) {
        this.currentCpuModelIn = currentCpuModelIn;
    }

    public ClusterWhereInput currentCpuModelIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_IN);
        return this;
    }

    public ClusterWhereInput currentCpuModelIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_IN);
        return this;
    }

    public void setCurrentCpuModelIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_IN);
        }
    }

    public boolean getCurrentCpuModelIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CURRENT_CPU_MODEL_IN);
    }

    public ClusterWhereInput currentCpuModelLt(String currentCpuModelLt) {

        this.currentCpuModelLt = currentCpuModelLt;
        return this;
    }

    /**
     * Get currentCpuModelLt
     *
     * @return currentCpuModelLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCurrentCpuModelLt() {
        return currentCpuModelLt;
    }

    public void setCurrentCpuModelLt(String currentCpuModelLt) {
        this.currentCpuModelLt = currentCpuModelLt;
    }

    public ClusterWhereInput currentCpuModelLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_LT);
        return this;
    }

    public ClusterWhereInput currentCpuModelLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_LT);
        return this;
    }

    public void setCurrentCpuModelLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_LT);
        }
    }

    public boolean getCurrentCpuModelLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CURRENT_CPU_MODEL_LT);
    }

    public ClusterWhereInput currentCpuModelLte(String currentCpuModelLte) {

        this.currentCpuModelLte = currentCpuModelLte;
        return this;
    }

    /**
     * Get currentCpuModelLte
     *
     * @return currentCpuModelLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCurrentCpuModelLte() {
        return currentCpuModelLte;
    }

    public void setCurrentCpuModelLte(String currentCpuModelLte) {
        this.currentCpuModelLte = currentCpuModelLte;
    }

    public ClusterWhereInput currentCpuModelLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_LTE);
        return this;
    }

    public ClusterWhereInput currentCpuModelLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_LTE);
        return this;
    }

    public void setCurrentCpuModelLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_LTE);
        }
    }

    public boolean getCurrentCpuModelLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CURRENT_CPU_MODEL_LTE);
    }

    public ClusterWhereInput currentCpuModelNot(String currentCpuModelNot) {

        this.currentCpuModelNot = currentCpuModelNot;
        return this;
    }

    /**
     * Get currentCpuModelNot
     *
     * @return currentCpuModelNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCurrentCpuModelNot() {
        return currentCpuModelNot;
    }

    public void setCurrentCpuModelNot(String currentCpuModelNot) {
        this.currentCpuModelNot = currentCpuModelNot;
    }

    public ClusterWhereInput currentCpuModelNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT);
        return this;
    }

    public ClusterWhereInput currentCpuModelNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT);
        return this;
    }

    public void setCurrentCpuModelNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT);
        }
    }

    public boolean getCurrentCpuModelNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT);
    }

    public ClusterWhereInput currentCpuModelNotContains(String currentCpuModelNotContains) {

        this.currentCpuModelNotContains = currentCpuModelNotContains;
        return this;
    }

    /**
     * Get currentCpuModelNotContains
     *
     * @return currentCpuModelNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCurrentCpuModelNotContains() {
        return currentCpuModelNotContains;
    }

    public void setCurrentCpuModelNotContains(String currentCpuModelNotContains) {
        this.currentCpuModelNotContains = currentCpuModelNotContains;
    }

    public ClusterWhereInput currentCpuModelNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_CONTAINS);
        return this;
    }

    public ClusterWhereInput currentCpuModelNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_CONTAINS);
        return this;
    }

    public void setCurrentCpuModelNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_CONTAINS);
        }
    }

    public boolean getCurrentCpuModelNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_CONTAINS);
    }

    public ClusterWhereInput currentCpuModelNotEndsWith(String currentCpuModelNotEndsWith) {

        this.currentCpuModelNotEndsWith = currentCpuModelNotEndsWith;
        return this;
    }

    /**
     * Get currentCpuModelNotEndsWith
     *
     * @return currentCpuModelNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCurrentCpuModelNotEndsWith() {
        return currentCpuModelNotEndsWith;
    }

    public void setCurrentCpuModelNotEndsWith(String currentCpuModelNotEndsWith) {
        this.currentCpuModelNotEndsWith = currentCpuModelNotEndsWith;
    }

    public ClusterWhereInput currentCpuModelNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput currentCpuModelNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_ENDS_WITH);
        return this;
    }

    public void setCurrentCpuModelNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_ENDS_WITH);
        }
    }

    public boolean getCurrentCpuModelNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_ENDS_WITH);
    }

    public ClusterWhereInput currentCpuModelNotIn(List<String> currentCpuModelNotIn) {

        this.currentCpuModelNotIn = currentCpuModelNotIn;
        return this;
    }

    public ClusterWhereInput addCurrentCpuModelNotInItem(String currentCpuModelNotInItem) {
        if (this.currentCpuModelNotIn == null) {
            this.currentCpuModelNotIn = new ArrayList<String>();
        }
        this.currentCpuModelNotIn.add(currentCpuModelNotInItem);
        return this;
    }

    /**
     * Get currentCpuModelNotIn
     *
     * @return currentCpuModelNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCurrentCpuModelNotIn() {
        return currentCpuModelNotIn;
    }

    public void setCurrentCpuModelNotIn(List<String> currentCpuModelNotIn) {
        this.currentCpuModelNotIn = currentCpuModelNotIn;
    }

    public ClusterWhereInput currentCpuModelNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_IN);
        return this;
    }

    public ClusterWhereInput currentCpuModelNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_IN);
        return this;
    }

    public void setCurrentCpuModelNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_IN);
        }
    }

    public boolean getCurrentCpuModelNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_IN);
    }

    public ClusterWhereInput currentCpuModelNotStartsWith(String currentCpuModelNotStartsWith) {

        this.currentCpuModelNotStartsWith = currentCpuModelNotStartsWith;
        return this;
    }

    /**
     * Get currentCpuModelNotStartsWith
     *
     * @return currentCpuModelNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCurrentCpuModelNotStartsWith() {
        return currentCpuModelNotStartsWith;
    }

    public void setCurrentCpuModelNotStartsWith(String currentCpuModelNotStartsWith) {
        this.currentCpuModelNotStartsWith = currentCpuModelNotStartsWith;
    }

    public ClusterWhereInput currentCpuModelNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput currentCpuModelNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_STARTS_WITH);
        return this;
    }

    public void setCurrentCpuModelNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_STARTS_WITH);
        }
    }

    public boolean getCurrentCpuModelNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CURRENT_CPU_MODEL_NOT_STARTS_WITH);
    }

    public ClusterWhereInput currentCpuModelStartsWith(String currentCpuModelStartsWith) {

        this.currentCpuModelStartsWith = currentCpuModelStartsWith;
        return this;
    }

    /**
     * Get currentCpuModelStartsWith
     *
     * @return currentCpuModelStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCurrentCpuModelStartsWith() {
        return currentCpuModelStartsWith;
    }

    public void setCurrentCpuModelStartsWith(String currentCpuModelStartsWith) {
        this.currentCpuModelStartsWith = currentCpuModelStartsWith;
    }

    public ClusterWhereInput currentCpuModelStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput currentCpuModelStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_STARTS_WITH);
        return this;
    }

    public void setCurrentCpuModelStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL_STARTS_WITH);
        }
    }

    public boolean getCurrentCpuModelStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CURRENT_CPU_MODEL_STARTS_WITH);
    }

    public ClusterWhereInput datacentersEvery(DatacenterWhereInput datacentersEvery) {

        this.datacentersEvery = datacentersEvery;
        return this;
    }

    /**
     * Get datacentersEvery
     *
     * @return datacentersEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DatacenterWhereInput getDatacentersEvery() {
        return datacentersEvery;
    }

    public void setDatacentersEvery(DatacenterWhereInput datacentersEvery) {
        this.datacentersEvery = datacentersEvery;
    }

    public ClusterWhereInput datacentersEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTERS_EVERY);
        return this;
    }

    public ClusterWhereInput datacentersEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATACENTERS_EVERY);
        return this;
    }

    public void setDatacentersEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATACENTERS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATACENTERS_EVERY);
        }
    }

    public boolean getDatacentersEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATACENTERS_EVERY);
    }

    public ClusterWhereInput datacentersNone(DatacenterWhereInput datacentersNone) {

        this.datacentersNone = datacentersNone;
        return this;
    }

    /**
     * Get datacentersNone
     *
     * @return datacentersNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DatacenterWhereInput getDatacentersNone() {
        return datacentersNone;
    }

    public void setDatacentersNone(DatacenterWhereInput datacentersNone) {
        this.datacentersNone = datacentersNone;
    }

    public ClusterWhereInput datacentersNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTERS_NONE);
        return this;
    }

    public ClusterWhereInput datacentersNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATACENTERS_NONE);
        return this;
    }

    public void setDatacentersNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATACENTERS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATACENTERS_NONE);
        }
    }

    public boolean getDatacentersNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATACENTERS_NONE);
    }

    public ClusterWhereInput datacentersSome(DatacenterWhereInput datacentersSome) {

        this.datacentersSome = datacentersSome;
        return this;
    }

    /**
     * Get datacentersSome
     *
     * @return datacentersSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DatacenterWhereInput getDatacentersSome() {
        return datacentersSome;
    }

    public void setDatacentersSome(DatacenterWhereInput datacentersSome) {
        this.datacentersSome = datacentersSome;
    }

    public ClusterWhereInput datacentersSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTERS_SOME);
        return this;
    }

    public ClusterWhereInput datacentersSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATACENTERS_SOME);
        return this;
    }

    public void setDatacentersSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATACENTERS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATACENTERS_SOME);
        }
    }

    public boolean getDatacentersSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATACENTERS_SOME);
    }

    public ClusterWhereInput disconnectedDate(String disconnectedDate) {

        this.disconnectedDate = disconnectedDate;
        return this;
    }

    /**
     * Get disconnectedDate
     *
     * @return disconnectedDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisconnectedDate() {
        return disconnectedDate;
    }

    public void setDisconnectedDate(String disconnectedDate) {
        this.disconnectedDate = disconnectedDate;
    }

    public ClusterWhereInput disconnectedDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_DATE);
        return this;
    }

    public ClusterWhereInput disconnectedDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_DATE);
        return this;
    }

    public void setDisconnectedDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_DATE);
        }
    }

    public boolean getDisconnectedDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCONNECTED_DATE);
    }

    public ClusterWhereInput disconnectedDateGt(String disconnectedDateGt) {

        this.disconnectedDateGt = disconnectedDateGt;
        return this;
    }

    /**
     * Get disconnectedDateGt
     *
     * @return disconnectedDateGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisconnectedDateGt() {
        return disconnectedDateGt;
    }

    public void setDisconnectedDateGt(String disconnectedDateGt) {
        this.disconnectedDateGt = disconnectedDateGt;
    }

    public ClusterWhereInput disconnectedDateGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_DATE_GT);
        return this;
    }

    public ClusterWhereInput disconnectedDateGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_DATE_GT);
        return this;
    }

    public void setDisconnectedDateGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_DATE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_DATE_GT);
        }
    }

    public boolean getDisconnectedDateGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCONNECTED_DATE_GT);
    }

    public ClusterWhereInput disconnectedDateGte(String disconnectedDateGte) {

        this.disconnectedDateGte = disconnectedDateGte;
        return this;
    }

    /**
     * Get disconnectedDateGte
     *
     * @return disconnectedDateGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisconnectedDateGte() {
        return disconnectedDateGte;
    }

    public void setDisconnectedDateGte(String disconnectedDateGte) {
        this.disconnectedDateGte = disconnectedDateGte;
    }

    public ClusterWhereInput disconnectedDateGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_DATE_GTE);
        return this;
    }

    public ClusterWhereInput disconnectedDateGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_DATE_GTE);
        return this;
    }

    public void setDisconnectedDateGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_DATE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_DATE_GTE);
        }
    }

    public boolean getDisconnectedDateGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCONNECTED_DATE_GTE);
    }

    public ClusterWhereInput disconnectedDateIn(List<String> disconnectedDateIn) {

        this.disconnectedDateIn = disconnectedDateIn;
        return this;
    }

    public ClusterWhereInput addDisconnectedDateInItem(String disconnectedDateInItem) {
        if (this.disconnectedDateIn == null) {
            this.disconnectedDateIn = new ArrayList<String>();
        }
        this.disconnectedDateIn.add(disconnectedDateInItem);
        return this;
    }

    /**
     * Get disconnectedDateIn
     *
     * @return disconnectedDateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDisconnectedDateIn() {
        return disconnectedDateIn;
    }

    public void setDisconnectedDateIn(List<String> disconnectedDateIn) {
        this.disconnectedDateIn = disconnectedDateIn;
    }

    public ClusterWhereInput disconnectedDateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_DATE_IN);
        return this;
    }

    public ClusterWhereInput disconnectedDateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_DATE_IN);
        return this;
    }

    public void setDisconnectedDateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_DATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_DATE_IN);
        }
    }

    public boolean getDisconnectedDateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCONNECTED_DATE_IN);
    }

    public ClusterWhereInput disconnectedDateLt(String disconnectedDateLt) {

        this.disconnectedDateLt = disconnectedDateLt;
        return this;
    }

    /**
     * Get disconnectedDateLt
     *
     * @return disconnectedDateLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisconnectedDateLt() {
        return disconnectedDateLt;
    }

    public void setDisconnectedDateLt(String disconnectedDateLt) {
        this.disconnectedDateLt = disconnectedDateLt;
    }

    public ClusterWhereInput disconnectedDateLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_DATE_LT);
        return this;
    }

    public ClusterWhereInput disconnectedDateLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_DATE_LT);
        return this;
    }

    public void setDisconnectedDateLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_DATE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_DATE_LT);
        }
    }

    public boolean getDisconnectedDateLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCONNECTED_DATE_LT);
    }

    public ClusterWhereInput disconnectedDateLte(String disconnectedDateLte) {

        this.disconnectedDateLte = disconnectedDateLte;
        return this;
    }

    /**
     * Get disconnectedDateLte
     *
     * @return disconnectedDateLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisconnectedDateLte() {
        return disconnectedDateLte;
    }

    public void setDisconnectedDateLte(String disconnectedDateLte) {
        this.disconnectedDateLte = disconnectedDateLte;
    }

    public ClusterWhereInput disconnectedDateLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_DATE_LTE);
        return this;
    }

    public ClusterWhereInput disconnectedDateLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_DATE_LTE);
        return this;
    }

    public void setDisconnectedDateLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_DATE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_DATE_LTE);
        }
    }

    public boolean getDisconnectedDateLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCONNECTED_DATE_LTE);
    }

    public ClusterWhereInput disconnectedDateNot(String disconnectedDateNot) {

        this.disconnectedDateNot = disconnectedDateNot;
        return this;
    }

    /**
     * Get disconnectedDateNot
     *
     * @return disconnectedDateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisconnectedDateNot() {
        return disconnectedDateNot;
    }

    public void setDisconnectedDateNot(String disconnectedDateNot) {
        this.disconnectedDateNot = disconnectedDateNot;
    }

    public ClusterWhereInput disconnectedDateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_DATE_NOT);
        return this;
    }

    public ClusterWhereInput disconnectedDateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_DATE_NOT);
        return this;
    }

    public void setDisconnectedDateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_DATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_DATE_NOT);
        }
    }

    public boolean getDisconnectedDateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCONNECTED_DATE_NOT);
    }

    public ClusterWhereInput disconnectedDateNotIn(List<String> disconnectedDateNotIn) {

        this.disconnectedDateNotIn = disconnectedDateNotIn;
        return this;
    }

    public ClusterWhereInput addDisconnectedDateNotInItem(String disconnectedDateNotInItem) {
        if (this.disconnectedDateNotIn == null) {
            this.disconnectedDateNotIn = new ArrayList<String>();
        }
        this.disconnectedDateNotIn.add(disconnectedDateNotInItem);
        return this;
    }

    /**
     * Get disconnectedDateNotIn
     *
     * @return disconnectedDateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDisconnectedDateNotIn() {
        return disconnectedDateNotIn;
    }

    public void setDisconnectedDateNotIn(List<String> disconnectedDateNotIn) {
        this.disconnectedDateNotIn = disconnectedDateNotIn;
    }

    public ClusterWhereInput disconnectedDateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_DATE_NOT_IN);
        return this;
    }

    public ClusterWhereInput disconnectedDateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_DATE_NOT_IN);
        return this;
    }

    public void setDisconnectedDateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_DATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_DATE_NOT_IN);
        }
    }

    public boolean getDisconnectedDateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCONNECTED_DATE_NOT_IN);
    }

    public ClusterWhereInput disconnectedReason(ClusterConnectorErrorCode disconnectedReason) {

        this.disconnectedReason = disconnectedReason;
        return this;
    }

    /**
     * Get disconnectedReason
     *
     * @return disconnectedReason
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterConnectorErrorCode getDisconnectedReason() {
        return disconnectedReason;
    }

    public void setDisconnectedReason(ClusterConnectorErrorCode disconnectedReason) {
        this.disconnectedReason = disconnectedReason;
    }

    public ClusterWhereInput disconnectedReason_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_REASON);
        return this;
    }

    public ClusterWhereInput disconnectedReason_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_REASON);
        return this;
    }

    public void setDisconnectedReason_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_REASON);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_REASON);
        }
    }

    public boolean getDisconnectedReason_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCONNECTED_REASON);
    }

    public ClusterWhereInput disconnectedReasonIn(
            List<ClusterConnectorErrorCode> disconnectedReasonIn) {

        this.disconnectedReasonIn = disconnectedReasonIn;
        return this;
    }

    public ClusterWhereInput addDisconnectedReasonInItem(
            ClusterConnectorErrorCode disconnectedReasonInItem) {
        if (this.disconnectedReasonIn == null) {
            this.disconnectedReasonIn = new ArrayList<ClusterConnectorErrorCode>();
        }
        this.disconnectedReasonIn.add(disconnectedReasonInItem);
        return this;
    }

    /**
     * Get disconnectedReasonIn
     *
     * @return disconnectedReasonIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ClusterConnectorErrorCode> getDisconnectedReasonIn() {
        return disconnectedReasonIn;
    }

    public void setDisconnectedReasonIn(List<ClusterConnectorErrorCode> disconnectedReasonIn) {
        this.disconnectedReasonIn = disconnectedReasonIn;
    }

    public ClusterWhereInput disconnectedReasonIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_REASON_IN);
        return this;
    }

    public ClusterWhereInput disconnectedReasonIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_REASON_IN);
        return this;
    }

    public void setDisconnectedReasonIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_REASON_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_REASON_IN);
        }
    }

    public boolean getDisconnectedReasonIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCONNECTED_REASON_IN);
    }

    public ClusterWhereInput disconnectedReasonNot(
            ClusterConnectorErrorCode disconnectedReasonNot) {

        this.disconnectedReasonNot = disconnectedReasonNot;
        return this;
    }

    /**
     * Get disconnectedReasonNot
     *
     * @return disconnectedReasonNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterConnectorErrorCode getDisconnectedReasonNot() {
        return disconnectedReasonNot;
    }

    public void setDisconnectedReasonNot(ClusterConnectorErrorCode disconnectedReasonNot) {
        this.disconnectedReasonNot = disconnectedReasonNot;
    }

    public ClusterWhereInput disconnectedReasonNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_REASON_NOT);
        return this;
    }

    public ClusterWhereInput disconnectedReasonNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_REASON_NOT);
        return this;
    }

    public void setDisconnectedReasonNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_REASON_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_REASON_NOT);
        }
    }

    public boolean getDisconnectedReasonNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCONNECTED_REASON_NOT);
    }

    public ClusterWhereInput disconnectedReasonNotIn(
            List<ClusterConnectorErrorCode> disconnectedReasonNotIn) {

        this.disconnectedReasonNotIn = disconnectedReasonNotIn;
        return this;
    }

    public ClusterWhereInput addDisconnectedReasonNotInItem(
            ClusterConnectorErrorCode disconnectedReasonNotInItem) {
        if (this.disconnectedReasonNotIn == null) {
            this.disconnectedReasonNotIn = new ArrayList<ClusterConnectorErrorCode>();
        }
        this.disconnectedReasonNotIn.add(disconnectedReasonNotInItem);
        return this;
    }

    /**
     * Get disconnectedReasonNotIn
     *
     * @return disconnectedReasonNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ClusterConnectorErrorCode> getDisconnectedReasonNotIn() {
        return disconnectedReasonNotIn;
    }

    public void setDisconnectedReasonNotIn(
            List<ClusterConnectorErrorCode> disconnectedReasonNotIn) {
        this.disconnectedReasonNotIn = disconnectedReasonNotIn;
    }

    public ClusterWhereInput disconnectedReasonNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_REASON_NOT_IN);
        return this;
    }

    public ClusterWhereInput disconnectedReasonNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_REASON_NOT_IN);
        return this;
    }

    public void setDisconnectedReasonNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_REASON_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_REASON_NOT_IN);
        }
    }

    public boolean getDisconnectedReasonNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCONNECTED_REASON_NOT_IN);
    }

    public ClusterWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

        this.entityAsyncStatus = entityAsyncStatus;
        return this;
    }

    /**
     * Get entityAsyncStatus
     *
     * @return entityAsyncStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatus() {
        return entityAsyncStatus;
    }

    public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
        this.entityAsyncStatus = entityAsyncStatus;
    }

    public ClusterWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public ClusterWhereInput entityAsyncStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public void setEntityAsyncStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        }
    }

    public boolean getEntityAsyncStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
    }

    public ClusterWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public ClusterWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
        if (this.entityAsyncStatusIn == null) {
            this.entityAsyncStatusIn = new ArrayList<EntityAsyncStatus>();
        }
        this.entityAsyncStatusIn.add(entityAsyncStatusInItem);
        return this;
    }

    /**
     * Get entityAsyncStatusIn
     *
     * @return entityAsyncStatusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityAsyncStatus> getEntityAsyncStatusIn() {
        return entityAsyncStatusIn;
    }

    public void setEntityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
        this.entityAsyncStatusIn = entityAsyncStatusIn;
    }

    public ClusterWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public ClusterWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public void setEntityAsyncStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        }
    }

    public boolean getEntityAsyncStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
    }

    public ClusterWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

        this.entityAsyncStatusNot = entityAsyncStatusNot;
        return this;
    }

    /**
     * Get entityAsyncStatusNot
     *
     * @return entityAsyncStatusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatusNot() {
        return entityAsyncStatusNot;
    }

    public void setEntityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
        this.entityAsyncStatusNot = entityAsyncStatusNot;
    }

    public ClusterWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public ClusterWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public void setEntityAsyncStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        }
    }

    public boolean getEntityAsyncStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
    }

    public ClusterWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public ClusterWhereInput addEntityAsyncStatusNotInItem(
            EntityAsyncStatus entityAsyncStatusNotInItem) {
        if (this.entityAsyncStatusNotIn == null) {
            this.entityAsyncStatusNotIn = new ArrayList<EntityAsyncStatus>();
        }
        this.entityAsyncStatusNotIn.add(entityAsyncStatusNotInItem);
        return this;
    }

    /**
     * Get entityAsyncStatusNotIn
     *
     * @return entityAsyncStatusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityAsyncStatus> getEntityAsyncStatusNotIn() {
        return entityAsyncStatusNotIn;
    }

    public void setEntityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    }

    public ClusterWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public ClusterWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public void setEntityAsyncStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        }
    }

    public boolean getEntityAsyncStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
    }

    public ClusterWhereInput everouteCluster(EverouteClusterWhereInput everouteCluster) {

        this.everouteCluster = everouteCluster;
        return this;
    }

    /**
     * Get everouteCluster
     *
     * @return everouteCluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EverouteClusterWhereInput getEverouteCluster() {
        return everouteCluster;
    }

    public void setEverouteCluster(EverouteClusterWhereInput everouteCluster) {
        this.everouteCluster = everouteCluster;
    }

    public ClusterWhereInput everouteCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        return this;
    }

    public ClusterWhereInput everouteCluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        return this;
    }

    public void setEverouteCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        }
    }

    public boolean getEverouteCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EVEROUTE_CLUSTER);
    }

    public ClusterWhereInput failureDataSpace(Long failureDataSpace) {

        this.failureDataSpace = failureDataSpace;
        return this;
    }

    /**
     * Get failureDataSpace
     *
     * @return failureDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureDataSpace() {
        return failureDataSpace;
    }

    public void setFailureDataSpace(Long failureDataSpace) {
        this.failureDataSpace = failureDataSpace;
    }

    public ClusterWhereInput failureDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE);
        return this;
    }

    public ClusterWhereInput failureDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE);
        return this;
    }

    public void setFailureDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE);
        }
    }

    public boolean getFailureDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_DATA_SPACE);
    }

    public ClusterWhereInput failureDataSpaceGt(Long failureDataSpaceGt) {

        this.failureDataSpaceGt = failureDataSpaceGt;
        return this;
    }

    /**
     * Get failureDataSpaceGt
     *
     * @return failureDataSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureDataSpaceGt() {
        return failureDataSpaceGt;
    }

    public void setFailureDataSpaceGt(Long failureDataSpaceGt) {
        this.failureDataSpaceGt = failureDataSpaceGt;
    }

    public ClusterWhereInput failureDataSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_GT);
        return this;
    }

    public ClusterWhereInput failureDataSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_GT);
        return this;
    }

    public void setFailureDataSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_GT);
        }
    }

    public boolean getFailureDataSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_DATA_SPACE_GT);
    }

    public ClusterWhereInput failureDataSpaceGte(Long failureDataSpaceGte) {

        this.failureDataSpaceGte = failureDataSpaceGte;
        return this;
    }

    /**
     * Get failureDataSpaceGte
     *
     * @return failureDataSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureDataSpaceGte() {
        return failureDataSpaceGte;
    }

    public void setFailureDataSpaceGte(Long failureDataSpaceGte) {
        this.failureDataSpaceGte = failureDataSpaceGte;
    }

    public ClusterWhereInput failureDataSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_GTE);
        return this;
    }

    public ClusterWhereInput failureDataSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_GTE);
        return this;
    }

    public void setFailureDataSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_GTE);
        }
    }

    public boolean getFailureDataSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_DATA_SPACE_GTE);
    }

    public ClusterWhereInput failureDataSpaceIn(List<Long> failureDataSpaceIn) {

        this.failureDataSpaceIn = failureDataSpaceIn;
        return this;
    }

    public ClusterWhereInput addFailureDataSpaceInItem(Long failureDataSpaceInItem) {
        if (this.failureDataSpaceIn == null) {
            this.failureDataSpaceIn = new ArrayList<Long>();
        }
        this.failureDataSpaceIn.add(failureDataSpaceInItem);
        return this;
    }

    /**
     * Get failureDataSpaceIn
     *
     * @return failureDataSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getFailureDataSpaceIn() {
        return failureDataSpaceIn;
    }

    public void setFailureDataSpaceIn(List<Long> failureDataSpaceIn) {
        this.failureDataSpaceIn = failureDataSpaceIn;
    }

    public ClusterWhereInput failureDataSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_IN);
        return this;
    }

    public ClusterWhereInput failureDataSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_IN);
        return this;
    }

    public void setFailureDataSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_IN);
        }
    }

    public boolean getFailureDataSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_DATA_SPACE_IN);
    }

    public ClusterWhereInput failureDataSpaceLt(Long failureDataSpaceLt) {

        this.failureDataSpaceLt = failureDataSpaceLt;
        return this;
    }

    /**
     * Get failureDataSpaceLt
     *
     * @return failureDataSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureDataSpaceLt() {
        return failureDataSpaceLt;
    }

    public void setFailureDataSpaceLt(Long failureDataSpaceLt) {
        this.failureDataSpaceLt = failureDataSpaceLt;
    }

    public ClusterWhereInput failureDataSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_LT);
        return this;
    }

    public ClusterWhereInput failureDataSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_LT);
        return this;
    }

    public void setFailureDataSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_LT);
        }
    }

    public boolean getFailureDataSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_DATA_SPACE_LT);
    }

    public ClusterWhereInput failureDataSpaceLte(Long failureDataSpaceLte) {

        this.failureDataSpaceLte = failureDataSpaceLte;
        return this;
    }

    /**
     * Get failureDataSpaceLte
     *
     * @return failureDataSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureDataSpaceLte() {
        return failureDataSpaceLte;
    }

    public void setFailureDataSpaceLte(Long failureDataSpaceLte) {
        this.failureDataSpaceLte = failureDataSpaceLte;
    }

    public ClusterWhereInput failureDataSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_LTE);
        return this;
    }

    public ClusterWhereInput failureDataSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_LTE);
        return this;
    }

    public void setFailureDataSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_LTE);
        }
    }

    public boolean getFailureDataSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_DATA_SPACE_LTE);
    }

    public ClusterWhereInput failureDataSpaceNot(Long failureDataSpaceNot) {

        this.failureDataSpaceNot = failureDataSpaceNot;
        return this;
    }

    /**
     * Get failureDataSpaceNot
     *
     * @return failureDataSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureDataSpaceNot() {
        return failureDataSpaceNot;
    }

    public void setFailureDataSpaceNot(Long failureDataSpaceNot) {
        this.failureDataSpaceNot = failureDataSpaceNot;
    }

    public ClusterWhereInput failureDataSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT);
        return this;
    }

    public ClusterWhereInput failureDataSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT);
        return this;
    }

    public void setFailureDataSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT);
        }
    }

    public boolean getFailureDataSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT);
    }

    public ClusterWhereInput failureDataSpaceNotIn(List<Long> failureDataSpaceNotIn) {

        this.failureDataSpaceNotIn = failureDataSpaceNotIn;
        return this;
    }

    public ClusterWhereInput addFailureDataSpaceNotInItem(Long failureDataSpaceNotInItem) {
        if (this.failureDataSpaceNotIn == null) {
            this.failureDataSpaceNotIn = new ArrayList<Long>();
        }
        this.failureDataSpaceNotIn.add(failureDataSpaceNotInItem);
        return this;
    }

    /**
     * Get failureDataSpaceNotIn
     *
     * @return failureDataSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getFailureDataSpaceNotIn() {
        return failureDataSpaceNotIn;
    }

    public void setFailureDataSpaceNotIn(List<Long> failureDataSpaceNotIn) {
        this.failureDataSpaceNotIn = failureDataSpaceNotIn;
    }

    public ClusterWhereInput failureDataSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT_IN);
        return this;
    }

    public ClusterWhereInput failureDataSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT_IN);
        return this;
    }

    public void setFailureDataSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT_IN);
        }
    }

    public boolean getFailureDataSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT_IN);
    }

    public ClusterWhereInput hasMetrox(Boolean hasMetrox) {

        this.hasMetrox = hasMetrox;
        return this;
    }

    /**
     * Get hasMetrox
     *
     * @return hasMetrox
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getHasMetrox() {
        return hasMetrox;
    }

    public void setHasMetrox(Boolean hasMetrox) {
        this.hasMetrox = hasMetrox;
    }

    public ClusterWhereInput hasMetrox_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HAS_METROX);
        return this;
    }

    public ClusterWhereInput hasMetrox_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HAS_METROX);
        return this;
    }

    public void setHasMetrox_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HAS_METROX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HAS_METROX);
        }
    }

    public boolean getHasMetrox_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HAS_METROX);
    }

    public ClusterWhereInput hasMetroxNot(Boolean hasMetroxNot) {

        this.hasMetroxNot = hasMetroxNot;
        return this;
    }

    /**
     * Get hasMetroxNot
     *
     * @return hasMetroxNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getHasMetroxNot() {
        return hasMetroxNot;
    }

    public void setHasMetroxNot(Boolean hasMetroxNot) {
        this.hasMetroxNot = hasMetroxNot;
    }

    public ClusterWhereInput hasMetroxNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HAS_METROX_NOT);
        return this;
    }

    public ClusterWhereInput hasMetroxNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HAS_METROX_NOT);
        return this;
    }

    public void setHasMetroxNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HAS_METROX_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HAS_METROX_NOT);
        }
    }

    public boolean getHasMetroxNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HAS_METROX_NOT);
    }

    public ClusterWhereInput hostNum(Integer hostNum) {

        this.hostNum = hostNum;
        return this;
    }

    /**
     * Get hostNum
     *
     * @return hostNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    public ClusterWhereInput hostNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM);
        return this;
    }

    public ClusterWhereInput hostNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM);
        return this;
    }

    public void setHostNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM);
        }
    }

    public boolean getHostNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM);
    }

    public ClusterWhereInput hostNumGt(Integer hostNumGt) {

        this.hostNumGt = hostNumGt;
        return this;
    }

    /**
     * Get hostNumGt
     *
     * @return hostNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHostNumGt() {
        return hostNumGt;
    }

    public void setHostNumGt(Integer hostNumGt) {
        this.hostNumGt = hostNumGt;
    }

    public ClusterWhereInput hostNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_GT);
        return this;
    }

    public ClusterWhereInput hostNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_GT);
        return this;
    }

    public void setHostNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_GT);
        }
    }

    public boolean getHostNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_GT);
    }

    public ClusterWhereInput hostNumGte(Integer hostNumGte) {

        this.hostNumGte = hostNumGte;
        return this;
    }

    /**
     * Get hostNumGte
     *
     * @return hostNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHostNumGte() {
        return hostNumGte;
    }

    public void setHostNumGte(Integer hostNumGte) {
        this.hostNumGte = hostNumGte;
    }

    public ClusterWhereInput hostNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_GTE);
        return this;
    }

    public ClusterWhereInput hostNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_GTE);
        return this;
    }

    public void setHostNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_GTE);
        }
    }

    public boolean getHostNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_GTE);
    }

    public ClusterWhereInput hostNumIn(List<Integer> hostNumIn) {

        this.hostNumIn = hostNumIn;
        return this;
    }

    public ClusterWhereInput addHostNumInItem(Integer hostNumInItem) {
        if (this.hostNumIn == null) {
            this.hostNumIn = new ArrayList<Integer>();
        }
        this.hostNumIn.add(hostNumInItem);
        return this;
    }

    /**
     * Get hostNumIn
     *
     * @return hostNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getHostNumIn() {
        return hostNumIn;
    }

    public void setHostNumIn(List<Integer> hostNumIn) {
        this.hostNumIn = hostNumIn;
    }

    public ClusterWhereInput hostNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_IN);
        return this;
    }

    public ClusterWhereInput hostNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_IN);
        return this;
    }

    public void setHostNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_IN);
        }
    }

    public boolean getHostNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_IN);
    }

    public ClusterWhereInput hostNumLt(Integer hostNumLt) {

        this.hostNumLt = hostNumLt;
        return this;
    }

    /**
     * Get hostNumLt
     *
     * @return hostNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHostNumLt() {
        return hostNumLt;
    }

    public void setHostNumLt(Integer hostNumLt) {
        this.hostNumLt = hostNumLt;
    }

    public ClusterWhereInput hostNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_LT);
        return this;
    }

    public ClusterWhereInput hostNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_LT);
        return this;
    }

    public void setHostNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_LT);
        }
    }

    public boolean getHostNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_LT);
    }

    public ClusterWhereInput hostNumLte(Integer hostNumLte) {

        this.hostNumLte = hostNumLte;
        return this;
    }

    /**
     * Get hostNumLte
     *
     * @return hostNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHostNumLte() {
        return hostNumLte;
    }

    public void setHostNumLte(Integer hostNumLte) {
        this.hostNumLte = hostNumLte;
    }

    public ClusterWhereInput hostNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_LTE);
        return this;
    }

    public ClusterWhereInput hostNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_LTE);
        return this;
    }

    public void setHostNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_LTE);
        }
    }

    public boolean getHostNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_LTE);
    }

    public ClusterWhereInput hostNumNot(Integer hostNumNot) {

        this.hostNumNot = hostNumNot;
        return this;
    }

    /**
     * Get hostNumNot
     *
     * @return hostNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHostNumNot() {
        return hostNumNot;
    }

    public void setHostNumNot(Integer hostNumNot) {
        this.hostNumNot = hostNumNot;
    }

    public ClusterWhereInput hostNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_NOT);
        return this;
    }

    public ClusterWhereInput hostNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_NOT);
        return this;
    }

    public void setHostNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_NOT);
        }
    }

    public boolean getHostNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_NOT);
    }

    public ClusterWhereInput hostNumNotIn(List<Integer> hostNumNotIn) {

        this.hostNumNotIn = hostNumNotIn;
        return this;
    }

    public ClusterWhereInput addHostNumNotInItem(Integer hostNumNotInItem) {
        if (this.hostNumNotIn == null) {
            this.hostNumNotIn = new ArrayList<Integer>();
        }
        this.hostNumNotIn.add(hostNumNotInItem);
        return this;
    }

    /**
     * Get hostNumNotIn
     *
     * @return hostNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getHostNumNotIn() {
        return hostNumNotIn;
    }

    public void setHostNumNotIn(List<Integer> hostNumNotIn) {
        this.hostNumNotIn = hostNumNotIn;
    }

    public ClusterWhereInput hostNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_NOT_IN);
        return this;
    }

    public ClusterWhereInput hostNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_NOT_IN);
        return this;
    }

    public void setHostNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_NOT_IN);
        }
    }

    public boolean getHostNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_NOT_IN);
    }

    public ClusterWhereInput hostsEvery(HostWhereInput hostsEvery) {

        this.hostsEvery = hostsEvery;
        return this;
    }

    /**
     * Get hostsEvery
     *
     * @return hostsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getHostsEvery() {
        return hostsEvery;
    }

    public void setHostsEvery(HostWhereInput hostsEvery) {
        this.hostsEvery = hostsEvery;
    }

    public ClusterWhereInput hostsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS_EVERY);
        return this;
    }

    public ClusterWhereInput hostsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTS_EVERY);
        return this;
    }

    public void setHostsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTS_EVERY);
        }
    }

    public boolean getHostsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTS_EVERY);
    }

    public ClusterWhereInput hostsNone(HostWhereInput hostsNone) {

        this.hostsNone = hostsNone;
        return this;
    }

    /**
     * Get hostsNone
     *
     * @return hostsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getHostsNone() {
        return hostsNone;
    }

    public void setHostsNone(HostWhereInput hostsNone) {
        this.hostsNone = hostsNone;
    }

    public ClusterWhereInput hostsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS_NONE);
        return this;
    }

    public ClusterWhereInput hostsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTS_NONE);
        return this;
    }

    public void setHostsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTS_NONE);
        }
    }

    public boolean getHostsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTS_NONE);
    }

    public ClusterWhereInput hostsSome(HostWhereInput hostsSome) {

        this.hostsSome = hostsSome;
        return this;
    }

    /**
     * Get hostsSome
     *
     * @return hostsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getHostsSome() {
        return hostsSome;
    }

    public void setHostsSome(HostWhereInput hostsSome) {
        this.hostsSome = hostsSome;
    }

    public ClusterWhereInput hostsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS_SOME);
        return this;
    }

    public ClusterWhereInput hostsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTS_SOME);
        return this;
    }

    public void setHostsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTS_SOME);
        }
    }

    public boolean getHostsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTS_SOME);
    }

    public ClusterWhereInput hypervisor(Hypervisor hypervisor) {

        this.hypervisor = hypervisor;
        return this;
    }

    /**
     * Get hypervisor
     *
     * @return hypervisor
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Hypervisor getHypervisor() {
        return hypervisor;
    }

    public void setHypervisor(Hypervisor hypervisor) {
        this.hypervisor = hypervisor;
    }

    public ClusterWhereInput hypervisor_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HYPERVISOR);
        return this;
    }

    public ClusterWhereInput hypervisor_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HYPERVISOR);
        return this;
    }

    public void setHypervisor_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HYPERVISOR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HYPERVISOR);
        }
    }

    public boolean getHypervisor_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HYPERVISOR);
    }

    public ClusterWhereInput hypervisorIn(List<Hypervisor> hypervisorIn) {

        this.hypervisorIn = hypervisorIn;
        return this;
    }

    public ClusterWhereInput addHypervisorInItem(Hypervisor hypervisorInItem) {
        if (this.hypervisorIn == null) {
            this.hypervisorIn = new ArrayList<Hypervisor>();
        }
        this.hypervisorIn.add(hypervisorInItem);
        return this;
    }

    /**
     * Get hypervisorIn
     *
     * @return hypervisorIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Hypervisor> getHypervisorIn() {
        return hypervisorIn;
    }

    public void setHypervisorIn(List<Hypervisor> hypervisorIn) {
        this.hypervisorIn = hypervisorIn;
    }

    public ClusterWhereInput hypervisorIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HYPERVISOR_IN);
        return this;
    }

    public ClusterWhereInput hypervisorIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HYPERVISOR_IN);
        return this;
    }

    public void setHypervisorIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HYPERVISOR_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HYPERVISOR_IN);
        }
    }

    public boolean getHypervisorIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HYPERVISOR_IN);
    }

    public ClusterWhereInput hypervisorNot(Hypervisor hypervisorNot) {

        this.hypervisorNot = hypervisorNot;
        return this;
    }

    /**
     * Get hypervisorNot
     *
     * @return hypervisorNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Hypervisor getHypervisorNot() {
        return hypervisorNot;
    }

    public void setHypervisorNot(Hypervisor hypervisorNot) {
        this.hypervisorNot = hypervisorNot;
    }

    public ClusterWhereInput hypervisorNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HYPERVISOR_NOT);
        return this;
    }

    public ClusterWhereInput hypervisorNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HYPERVISOR_NOT);
        return this;
    }

    public void setHypervisorNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HYPERVISOR_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HYPERVISOR_NOT);
        }
    }

    public boolean getHypervisorNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HYPERVISOR_NOT);
    }

    public ClusterWhereInput hypervisorNotIn(List<Hypervisor> hypervisorNotIn) {

        this.hypervisorNotIn = hypervisorNotIn;
        return this;
    }

    public ClusterWhereInput addHypervisorNotInItem(Hypervisor hypervisorNotInItem) {
        if (this.hypervisorNotIn == null) {
            this.hypervisorNotIn = new ArrayList<Hypervisor>();
        }
        this.hypervisorNotIn.add(hypervisorNotInItem);
        return this;
    }

    /**
     * Get hypervisorNotIn
     *
     * @return hypervisorNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Hypervisor> getHypervisorNotIn() {
        return hypervisorNotIn;
    }

    public void setHypervisorNotIn(List<Hypervisor> hypervisorNotIn) {
        this.hypervisorNotIn = hypervisorNotIn;
    }

    public ClusterWhereInput hypervisorNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HYPERVISOR_NOT_IN);
        return this;
    }

    public ClusterWhereInput hypervisorNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HYPERVISOR_NOT_IN);
        return this;
    }

    public void setHypervisorNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HYPERVISOR_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HYPERVISOR_NOT_IN);
        }
    }

    public boolean getHypervisorNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HYPERVISOR_NOT_IN);
    }

    public ClusterWhereInput id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClusterWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ClusterWhereInput id_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID);
        return this;
    }

    public void setId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID);
        }
    }

    public boolean getId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID);
    }

    public ClusterWhereInput idContains(String idContains) {

        this.idContains = idContains;
        return this;
    }

    /**
     * Get idContains
     *
     * @return idContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdContains() {
        return idContains;
    }

    public void setIdContains(String idContains) {
        this.idContains = idContains;
    }

    public ClusterWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public ClusterWhereInput idContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public void setIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_CONTAINS);
        }
    }

    public boolean getIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_CONTAINS);
    }

    public ClusterWhereInput idEndsWith(String idEndsWith) {

        this.idEndsWith = idEndsWith;
        return this;
    }

    /**
     * Get idEndsWith
     *
     * @return idEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdEndsWith() {
        return idEndsWith;
    }

    public void setIdEndsWith(String idEndsWith) {
        this.idEndsWith = idEndsWith;
    }

    public ClusterWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput idEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public void setIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_ENDS_WITH);
        }
    }

    public boolean getIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_ENDS_WITH);
    }

    public ClusterWhereInput idGt(String idGt) {

        this.idGt = idGt;
        return this;
    }

    /**
     * Get idGt
     *
     * @return idGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdGt() {
        return idGt;
    }

    public void setIdGt(String idGt) {
        this.idGt = idGt;
    }

    public ClusterWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public ClusterWhereInput idGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public void setIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_GT);
        }
    }

    public boolean getIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_GT);
    }

    public ClusterWhereInput idGte(String idGte) {

        this.idGte = idGte;
        return this;
    }

    /**
     * Get idGte
     *
     * @return idGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdGte() {
        return idGte;
    }

    public void setIdGte(String idGte) {
        this.idGte = idGte;
    }

    public ClusterWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public ClusterWhereInput idGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public void setIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_GTE);
        }
    }

    public boolean getIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_GTE);
    }

    public ClusterWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public ClusterWhereInput addIdInItem(String idInItem) {
        if (this.idIn == null) {
            this.idIn = new ArrayList<String>();
        }
        this.idIn.add(idInItem);
        return this;
    }

    /**
     * Get idIn
     *
     * @return idIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdIn() {
        return idIn;
    }

    public void setIdIn(List<String> idIn) {
        this.idIn = idIn;
    }

    public ClusterWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public ClusterWhereInput idIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public void setIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_IN);
        }
    }

    public boolean getIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_IN);
    }

    public ClusterWhereInput idLt(String idLt) {

        this.idLt = idLt;
        return this;
    }

    /**
     * Get idLt
     *
     * @return idLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdLt() {
        return idLt;
    }

    public void setIdLt(String idLt) {
        this.idLt = idLt;
    }

    public ClusterWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public ClusterWhereInput idLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public void setIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_LT);
        }
    }

    public boolean getIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_LT);
    }

    public ClusterWhereInput idLte(String idLte) {

        this.idLte = idLte;
        return this;
    }

    /**
     * Get idLte
     *
     * @return idLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdLte() {
        return idLte;
    }

    public void setIdLte(String idLte) {
        this.idLte = idLte;
    }

    public ClusterWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public ClusterWhereInput idLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public void setIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_LTE);
        }
    }

    public boolean getIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_LTE);
    }

    public ClusterWhereInput idNot(String idNot) {

        this.idNot = idNot;
        return this;
    }

    /**
     * Get idNot
     *
     * @return idNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNot() {
        return idNot;
    }

    public void setIdNot(String idNot) {
        this.idNot = idNot;
    }

    public ClusterWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public ClusterWhereInput idNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public void setIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT);
        }
    }

    public boolean getIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT);
    }

    public ClusterWhereInput idNotContains(String idNotContains) {

        this.idNotContains = idNotContains;
        return this;
    }

    /**
     * Get idNotContains
     *
     * @return idNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotContains() {
        return idNotContains;
    }

    public void setIdNotContains(String idNotContains) {
        this.idNotContains = idNotContains;
    }

    public ClusterWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public ClusterWhereInput idNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public void setIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_CONTAINS);
        }
    }

    public boolean getIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_CONTAINS);
    }

    public ClusterWhereInput idNotEndsWith(String idNotEndsWith) {

        this.idNotEndsWith = idNotEndsWith;
        return this;
    }

    /**
     * Get idNotEndsWith
     *
     * @return idNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotEndsWith() {
        return idNotEndsWith;
    }

    public void setIdNotEndsWith(String idNotEndsWith) {
        this.idNotEndsWith = idNotEndsWith;
    }

    public ClusterWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput idNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
    }

    public ClusterWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public ClusterWhereInput addIdNotInItem(String idNotInItem) {
        if (this.idNotIn == null) {
            this.idNotIn = new ArrayList<String>();
        }
        this.idNotIn.add(idNotInItem);
        return this;
    }

    /**
     * Get idNotIn
     *
     * @return idNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdNotIn() {
        return idNotIn;
    }

    public void setIdNotIn(List<String> idNotIn) {
        this.idNotIn = idNotIn;
    }

    public ClusterWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public ClusterWhereInput idNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public void setIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_IN);
        }
    }

    public boolean getIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_IN);
    }

    public ClusterWhereInput idNotStartsWith(String idNotStartsWith) {

        this.idNotStartsWith = idNotStartsWith;
        return this;
    }

    /**
     * Get idNotStartsWith
     *
     * @return idNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotStartsWith() {
        return idNotStartsWith;
    }

    public void setIdNotStartsWith(String idNotStartsWith) {
        this.idNotStartsWith = idNotStartsWith;
    }

    public ClusterWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput idNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
    }

    public ClusterWhereInput idStartsWith(String idStartsWith) {

        this.idStartsWith = idStartsWith;
        return this;
    }

    /**
     * Get idStartsWith
     *
     * @return idStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdStartsWith() {
        return idStartsWith;
    }

    public void setIdStartsWith(String idStartsWith) {
        this.idStartsWith = idStartsWith;
    }

    public ClusterWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput idStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public void setIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_STARTS_WITH);
        }
    }

    public boolean getIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_STARTS_WITH);
    }

    public ClusterWhereInput ip(String ip) {

        this.ip = ip;
        return this;
    }

    /**
     * Get ip
     *
     * @return ip
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ClusterWhereInput ip_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP);
        return this;
    }

    public ClusterWhereInput ip_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP);
        return this;
    }

    public void setIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP);
        }
    }

    public boolean getIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP);
    }

    public ClusterWhereInput ipContains(String ipContains) {

        this.ipContains = ipContains;
        return this;
    }

    /**
     * Get ipContains
     *
     * @return ipContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpContains() {
        return ipContains;
    }

    public void setIpContains(String ipContains) {
        this.ipContains = ipContains;
    }

    public ClusterWhereInput ipContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_CONTAINS);
        return this;
    }

    public ClusterWhereInput ipContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_CONTAINS);
        return this;
    }

    public void setIpContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_CONTAINS);
        }
    }

    public boolean getIpContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_CONTAINS);
    }

    public ClusterWhereInput ipEndsWith(String ipEndsWith) {

        this.ipEndsWith = ipEndsWith;
        return this;
    }

    /**
     * Get ipEndsWith
     *
     * @return ipEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpEndsWith() {
        return ipEndsWith;
    }

    public void setIpEndsWith(String ipEndsWith) {
        this.ipEndsWith = ipEndsWith;
    }

    public ClusterWhereInput ipEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput ipEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ENDS_WITH);
        return this;
    }

    public void setIpEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ENDS_WITH);
        }
    }

    public boolean getIpEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ENDS_WITH);
    }

    public ClusterWhereInput ipGt(String ipGt) {

        this.ipGt = ipGt;
        return this;
    }

    /**
     * Get ipGt
     *
     * @return ipGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpGt() {
        return ipGt;
    }

    public void setIpGt(String ipGt) {
        this.ipGt = ipGt;
    }

    public ClusterWhereInput ipGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_GT);
        return this;
    }

    public ClusterWhereInput ipGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_GT);
        return this;
    }

    public void setIpGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_GT);
        }
    }

    public boolean getIpGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_GT);
    }

    public ClusterWhereInput ipGte(String ipGte) {

        this.ipGte = ipGte;
        return this;
    }

    /**
     * Get ipGte
     *
     * @return ipGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpGte() {
        return ipGte;
    }

    public void setIpGte(String ipGte) {
        this.ipGte = ipGte;
    }

    public ClusterWhereInput ipGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_GTE);
        return this;
    }

    public ClusterWhereInput ipGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_GTE);
        return this;
    }

    public void setIpGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_GTE);
        }
    }

    public boolean getIpGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_GTE);
    }

    public ClusterWhereInput ipIn(List<String> ipIn) {

        this.ipIn = ipIn;
        return this;
    }

    public ClusterWhereInput addIpInItem(String ipInItem) {
        if (this.ipIn == null) {
            this.ipIn = new ArrayList<String>();
        }
        this.ipIn.add(ipInItem);
        return this;
    }

    /**
     * Get ipIn
     *
     * @return ipIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIpIn() {
        return ipIn;
    }

    public void setIpIn(List<String> ipIn) {
        this.ipIn = ipIn;
    }

    public ClusterWhereInput ipIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_IN);
        return this;
    }

    public ClusterWhereInput ipIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_IN);
        return this;
    }

    public void setIpIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_IN);
        }
    }

    public boolean getIpIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_IN);
    }

    public ClusterWhereInput ipLt(String ipLt) {

        this.ipLt = ipLt;
        return this;
    }

    /**
     * Get ipLt
     *
     * @return ipLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpLt() {
        return ipLt;
    }

    public void setIpLt(String ipLt) {
        this.ipLt = ipLt;
    }

    public ClusterWhereInput ipLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_LT);
        return this;
    }

    public ClusterWhereInput ipLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_LT);
        return this;
    }

    public void setIpLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_LT);
        }
    }

    public boolean getIpLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_LT);
    }

    public ClusterWhereInput ipLte(String ipLte) {

        this.ipLte = ipLte;
        return this;
    }

    /**
     * Get ipLte
     *
     * @return ipLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpLte() {
        return ipLte;
    }

    public void setIpLte(String ipLte) {
        this.ipLte = ipLte;
    }

    public ClusterWhereInput ipLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_LTE);
        return this;
    }

    public ClusterWhereInput ipLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_LTE);
        return this;
    }

    public void setIpLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_LTE);
        }
    }

    public boolean getIpLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_LTE);
    }

    public ClusterWhereInput ipNot(String ipNot) {

        this.ipNot = ipNot;
        return this;
    }

    /**
     * Get ipNot
     *
     * @return ipNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpNot() {
        return ipNot;
    }

    public void setIpNot(String ipNot) {
        this.ipNot = ipNot;
    }

    public ClusterWhereInput ipNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_NOT);
        return this;
    }

    public ClusterWhereInput ipNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_NOT);
        return this;
    }

    public void setIpNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_NOT);
        }
    }

    public boolean getIpNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_NOT);
    }

    public ClusterWhereInput ipNotContains(String ipNotContains) {

        this.ipNotContains = ipNotContains;
        return this;
    }

    /**
     * Get ipNotContains
     *
     * @return ipNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpNotContains() {
        return ipNotContains;
    }

    public void setIpNotContains(String ipNotContains) {
        this.ipNotContains = ipNotContains;
    }

    public ClusterWhereInput ipNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_NOT_CONTAINS);
        return this;
    }

    public ClusterWhereInput ipNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_NOT_CONTAINS);
        return this;
    }

    public void setIpNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_NOT_CONTAINS);
        }
    }

    public boolean getIpNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_NOT_CONTAINS);
    }

    public ClusterWhereInput ipNotEndsWith(String ipNotEndsWith) {

        this.ipNotEndsWith = ipNotEndsWith;
        return this;
    }

    /**
     * Get ipNotEndsWith
     *
     * @return ipNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpNotEndsWith() {
        return ipNotEndsWith;
    }

    public void setIpNotEndsWith(String ipNotEndsWith) {
        this.ipNotEndsWith = ipNotEndsWith;
    }

    public ClusterWhereInput ipNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_NOT_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput ipNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_NOT_ENDS_WITH);
        return this;
    }

    public void setIpNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_NOT_ENDS_WITH);
        }
    }

    public boolean getIpNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_NOT_ENDS_WITH);
    }

    public ClusterWhereInput ipNotIn(List<String> ipNotIn) {

        this.ipNotIn = ipNotIn;
        return this;
    }

    public ClusterWhereInput addIpNotInItem(String ipNotInItem) {
        if (this.ipNotIn == null) {
            this.ipNotIn = new ArrayList<String>();
        }
        this.ipNotIn.add(ipNotInItem);
        return this;
    }

    /**
     * Get ipNotIn
     *
     * @return ipNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIpNotIn() {
        return ipNotIn;
    }

    public void setIpNotIn(List<String> ipNotIn) {
        this.ipNotIn = ipNotIn;
    }

    public ClusterWhereInput ipNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_NOT_IN);
        return this;
    }

    public ClusterWhereInput ipNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_NOT_IN);
        return this;
    }

    public void setIpNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_NOT_IN);
        }
    }

    public boolean getIpNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_NOT_IN);
    }

    public ClusterWhereInput ipNotStartsWith(String ipNotStartsWith) {

        this.ipNotStartsWith = ipNotStartsWith;
        return this;
    }

    /**
     * Get ipNotStartsWith
     *
     * @return ipNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpNotStartsWith() {
        return ipNotStartsWith;
    }

    public void setIpNotStartsWith(String ipNotStartsWith) {
        this.ipNotStartsWith = ipNotStartsWith;
    }

    public ClusterWhereInput ipNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_NOT_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput ipNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_NOT_STARTS_WITH);
        return this;
    }

    public void setIpNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_NOT_STARTS_WITH);
        }
    }

    public boolean getIpNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_NOT_STARTS_WITH);
    }

    public ClusterWhereInput ipStartsWith(String ipStartsWith) {

        this.ipStartsWith = ipStartsWith;
        return this;
    }

    /**
     * Get ipStartsWith
     *
     * @return ipStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpStartsWith() {
        return ipStartsWith;
    }

    public void setIpStartsWith(String ipStartsWith) {
        this.ipStartsWith = ipStartsWith;
    }

    public ClusterWhereInput ipStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput ipStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_STARTS_WITH);
        return this;
    }

    public void setIpStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_STARTS_WITH);
        }
    }

    public boolean getIpStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_STARTS_WITH);
    }

    public ClusterWhereInput isAllFlash(Boolean isAllFlash) {

        this.isAllFlash = isAllFlash;
        return this;
    }

    /**
     * Get isAllFlash
     *
     * @return isAllFlash
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsAllFlash() {
        return isAllFlash;
    }

    public void setIsAllFlash(Boolean isAllFlash) {
        this.isAllFlash = isAllFlash;
    }

    public ClusterWhereInput isAllFlash_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_ALL_FLASH);
        return this;
    }

    public ClusterWhereInput isAllFlash_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_ALL_FLASH);
        return this;
    }

    public void setIsAllFlash_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_ALL_FLASH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_ALL_FLASH);
        }
    }

    public boolean getIsAllFlash_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_ALL_FLASH);
    }

    public ClusterWhereInput isAllFlashNot(Boolean isAllFlashNot) {

        this.isAllFlashNot = isAllFlashNot;
        return this;
    }

    /**
     * Get isAllFlashNot
     *
     * @return isAllFlashNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsAllFlashNot() {
        return isAllFlashNot;
    }

    public void setIsAllFlashNot(Boolean isAllFlashNot) {
        this.isAllFlashNot = isAllFlashNot;
    }

    public ClusterWhereInput isAllFlashNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_ALL_FLASH_NOT);
        return this;
    }

    public ClusterWhereInput isAllFlashNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_ALL_FLASH_NOT);
        return this;
    }

    public void setIsAllFlashNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_ALL_FLASH_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_ALL_FLASH_NOT);
        }
    }

    public boolean getIsAllFlashNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_ALL_FLASH_NOT);
    }

    public ClusterWhereInput iscsiVip(String iscsiVip) {

        this.iscsiVip = iscsiVip;
        return this;
    }

    /**
     * Get iscsiVip
     *
     * @return iscsiVip
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiVip() {
        return iscsiVip;
    }

    public void setIscsiVip(String iscsiVip) {
        this.iscsiVip = iscsiVip;
    }

    public ClusterWhereInput iscsiVip_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP);
        return this;
    }

    public ClusterWhereInput iscsiVip_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP);
        return this;
    }

    public void setIscsiVip_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP);
        }
    }

    public boolean getIscsiVip_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_VIP);
    }

    public ClusterWhereInput iscsiVipContains(String iscsiVipContains) {

        this.iscsiVipContains = iscsiVipContains;
        return this;
    }

    /**
     * Get iscsiVipContains
     *
     * @return iscsiVipContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiVipContains() {
        return iscsiVipContains;
    }

    public void setIscsiVipContains(String iscsiVipContains) {
        this.iscsiVipContains = iscsiVipContains;
    }

    public ClusterWhereInput iscsiVipContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_CONTAINS);
        return this;
    }

    public ClusterWhereInput iscsiVipContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_CONTAINS);
        return this;
    }

    public void setIscsiVipContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_CONTAINS);
        }
    }

    public boolean getIscsiVipContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_VIP_CONTAINS);
    }

    public ClusterWhereInput iscsiVipEndsWith(String iscsiVipEndsWith) {

        this.iscsiVipEndsWith = iscsiVipEndsWith;
        return this;
    }

    /**
     * Get iscsiVipEndsWith
     *
     * @return iscsiVipEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiVipEndsWith() {
        return iscsiVipEndsWith;
    }

    public void setIscsiVipEndsWith(String iscsiVipEndsWith) {
        this.iscsiVipEndsWith = iscsiVipEndsWith;
    }

    public ClusterWhereInput iscsiVipEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput iscsiVipEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_ENDS_WITH);
        return this;
    }

    public void setIscsiVipEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_ENDS_WITH);
        }
    }

    public boolean getIscsiVipEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_VIP_ENDS_WITH);
    }

    public ClusterWhereInput iscsiVipGt(String iscsiVipGt) {

        this.iscsiVipGt = iscsiVipGt;
        return this;
    }

    /**
     * Get iscsiVipGt
     *
     * @return iscsiVipGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiVipGt() {
        return iscsiVipGt;
    }

    public void setIscsiVipGt(String iscsiVipGt) {
        this.iscsiVipGt = iscsiVipGt;
    }

    public ClusterWhereInput iscsiVipGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_GT);
        return this;
    }

    public ClusterWhereInput iscsiVipGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_GT);
        return this;
    }

    public void setIscsiVipGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_GT);
        }
    }

    public boolean getIscsiVipGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_VIP_GT);
    }

    public ClusterWhereInput iscsiVipGte(String iscsiVipGte) {

        this.iscsiVipGte = iscsiVipGte;
        return this;
    }

    /**
     * Get iscsiVipGte
     *
     * @return iscsiVipGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiVipGte() {
        return iscsiVipGte;
    }

    public void setIscsiVipGte(String iscsiVipGte) {
        this.iscsiVipGte = iscsiVipGte;
    }

    public ClusterWhereInput iscsiVipGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_GTE);
        return this;
    }

    public ClusterWhereInput iscsiVipGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_GTE);
        return this;
    }

    public void setIscsiVipGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_GTE);
        }
    }

    public boolean getIscsiVipGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_VIP_GTE);
    }

    public ClusterWhereInput iscsiVipIn(List<String> iscsiVipIn) {

        this.iscsiVipIn = iscsiVipIn;
        return this;
    }

    public ClusterWhereInput addIscsiVipInItem(String iscsiVipInItem) {
        if (this.iscsiVipIn == null) {
            this.iscsiVipIn = new ArrayList<String>();
        }
        this.iscsiVipIn.add(iscsiVipInItem);
        return this;
    }

    /**
     * Get iscsiVipIn
     *
     * @return iscsiVipIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIscsiVipIn() {
        return iscsiVipIn;
    }

    public void setIscsiVipIn(List<String> iscsiVipIn) {
        this.iscsiVipIn = iscsiVipIn;
    }

    public ClusterWhereInput iscsiVipIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_IN);
        return this;
    }

    public ClusterWhereInput iscsiVipIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_IN);
        return this;
    }

    public void setIscsiVipIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_IN);
        }
    }

    public boolean getIscsiVipIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_VIP_IN);
    }

    public ClusterWhereInput iscsiVipLt(String iscsiVipLt) {

        this.iscsiVipLt = iscsiVipLt;
        return this;
    }

    /**
     * Get iscsiVipLt
     *
     * @return iscsiVipLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiVipLt() {
        return iscsiVipLt;
    }

    public void setIscsiVipLt(String iscsiVipLt) {
        this.iscsiVipLt = iscsiVipLt;
    }

    public ClusterWhereInput iscsiVipLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_LT);
        return this;
    }

    public ClusterWhereInput iscsiVipLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_LT);
        return this;
    }

    public void setIscsiVipLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_LT);
        }
    }

    public boolean getIscsiVipLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_VIP_LT);
    }

    public ClusterWhereInput iscsiVipLte(String iscsiVipLte) {

        this.iscsiVipLte = iscsiVipLte;
        return this;
    }

    /**
     * Get iscsiVipLte
     *
     * @return iscsiVipLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiVipLte() {
        return iscsiVipLte;
    }

    public void setIscsiVipLte(String iscsiVipLte) {
        this.iscsiVipLte = iscsiVipLte;
    }

    public ClusterWhereInput iscsiVipLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_LTE);
        return this;
    }

    public ClusterWhereInput iscsiVipLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_LTE);
        return this;
    }

    public void setIscsiVipLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_LTE);
        }
    }

    public boolean getIscsiVipLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_VIP_LTE);
    }

    public ClusterWhereInput iscsiVipNot(String iscsiVipNot) {

        this.iscsiVipNot = iscsiVipNot;
        return this;
    }

    /**
     * Get iscsiVipNot
     *
     * @return iscsiVipNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiVipNot() {
        return iscsiVipNot;
    }

    public void setIscsiVipNot(String iscsiVipNot) {
        this.iscsiVipNot = iscsiVipNot;
    }

    public ClusterWhereInput iscsiVipNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_NOT);
        return this;
    }

    public ClusterWhereInput iscsiVipNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_NOT);
        return this;
    }

    public void setIscsiVipNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_NOT);
        }
    }

    public boolean getIscsiVipNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_VIP_NOT);
    }

    public ClusterWhereInput iscsiVipNotContains(String iscsiVipNotContains) {

        this.iscsiVipNotContains = iscsiVipNotContains;
        return this;
    }

    /**
     * Get iscsiVipNotContains
     *
     * @return iscsiVipNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiVipNotContains() {
        return iscsiVipNotContains;
    }

    public void setIscsiVipNotContains(String iscsiVipNotContains) {
        this.iscsiVipNotContains = iscsiVipNotContains;
    }

    public ClusterWhereInput iscsiVipNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_NOT_CONTAINS);
        return this;
    }

    public ClusterWhereInput iscsiVipNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_NOT_CONTAINS);
        return this;
    }

    public void setIscsiVipNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_NOT_CONTAINS);
        }
    }

    public boolean getIscsiVipNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_VIP_NOT_CONTAINS);
    }

    public ClusterWhereInput iscsiVipNotEndsWith(String iscsiVipNotEndsWith) {

        this.iscsiVipNotEndsWith = iscsiVipNotEndsWith;
        return this;
    }

    /**
     * Get iscsiVipNotEndsWith
     *
     * @return iscsiVipNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiVipNotEndsWith() {
        return iscsiVipNotEndsWith;
    }

    public void setIscsiVipNotEndsWith(String iscsiVipNotEndsWith) {
        this.iscsiVipNotEndsWith = iscsiVipNotEndsWith;
    }

    public ClusterWhereInput iscsiVipNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_NOT_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput iscsiVipNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_NOT_ENDS_WITH);
        return this;
    }

    public void setIscsiVipNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_NOT_ENDS_WITH);
        }
    }

    public boolean getIscsiVipNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_VIP_NOT_ENDS_WITH);
    }

    public ClusterWhereInput iscsiVipNotIn(List<String> iscsiVipNotIn) {

        this.iscsiVipNotIn = iscsiVipNotIn;
        return this;
    }

    public ClusterWhereInput addIscsiVipNotInItem(String iscsiVipNotInItem) {
        if (this.iscsiVipNotIn == null) {
            this.iscsiVipNotIn = new ArrayList<String>();
        }
        this.iscsiVipNotIn.add(iscsiVipNotInItem);
        return this;
    }

    /**
     * Get iscsiVipNotIn
     *
     * @return iscsiVipNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIscsiVipNotIn() {
        return iscsiVipNotIn;
    }

    public void setIscsiVipNotIn(List<String> iscsiVipNotIn) {
        this.iscsiVipNotIn = iscsiVipNotIn;
    }

    public ClusterWhereInput iscsiVipNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_NOT_IN);
        return this;
    }

    public ClusterWhereInput iscsiVipNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_NOT_IN);
        return this;
    }

    public void setIscsiVipNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_NOT_IN);
        }
    }

    public boolean getIscsiVipNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_VIP_NOT_IN);
    }

    public ClusterWhereInput iscsiVipNotStartsWith(String iscsiVipNotStartsWith) {

        this.iscsiVipNotStartsWith = iscsiVipNotStartsWith;
        return this;
    }

    /**
     * Get iscsiVipNotStartsWith
     *
     * @return iscsiVipNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiVipNotStartsWith() {
        return iscsiVipNotStartsWith;
    }

    public void setIscsiVipNotStartsWith(String iscsiVipNotStartsWith) {
        this.iscsiVipNotStartsWith = iscsiVipNotStartsWith;
    }

    public ClusterWhereInput iscsiVipNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_NOT_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput iscsiVipNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_NOT_STARTS_WITH);
        return this;
    }

    public void setIscsiVipNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_NOT_STARTS_WITH);
        }
    }

    public boolean getIscsiVipNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_VIP_NOT_STARTS_WITH);
    }

    public ClusterWhereInput iscsiVipStartsWith(String iscsiVipStartsWith) {

        this.iscsiVipStartsWith = iscsiVipStartsWith;
        return this;
    }

    /**
     * Get iscsiVipStartsWith
     *
     * @return iscsiVipStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiVipStartsWith() {
        return iscsiVipStartsWith;
    }

    public void setIscsiVipStartsWith(String iscsiVipStartsWith) {
        this.iscsiVipStartsWith = iscsiVipStartsWith;
    }

    public ClusterWhereInput iscsiVipStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput iscsiVipStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_STARTS_WITH);
        return this;
    }

    public void setIscsiVipStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP_STARTS_WITH);
        }
    }

    public boolean getIscsiVipStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_VIP_STARTS_WITH);
    }

    public ClusterWhereInput labelsEvery(LabelWhereInput labelsEvery) {

        this.labelsEvery = labelsEvery;
        return this;
    }

    /**
     * Get labelsEvery
     *
     * @return labelsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LabelWhereInput getLabelsEvery() {
        return labelsEvery;
    }

    public void setLabelsEvery(LabelWhereInput labelsEvery) {
        this.labelsEvery = labelsEvery;
    }

    public ClusterWhereInput labelsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_EVERY);
        return this;
    }

    public ClusterWhereInput labelsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS_EVERY);
        return this;
    }

    public void setLabelsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS_EVERY);
        }
    }

    public boolean getLabelsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS_EVERY);
    }

    public ClusterWhereInput labelsNone(LabelWhereInput labelsNone) {

        this.labelsNone = labelsNone;
        return this;
    }

    /**
     * Get labelsNone
     *
     * @return labelsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LabelWhereInput getLabelsNone() {
        return labelsNone;
    }

    public void setLabelsNone(LabelWhereInput labelsNone) {
        this.labelsNone = labelsNone;
    }

    public ClusterWhereInput labelsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_NONE);
        return this;
    }

    public ClusterWhereInput labelsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS_NONE);
        return this;
    }

    public void setLabelsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS_NONE);
        }
    }

    public boolean getLabelsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS_NONE);
    }

    public ClusterWhereInput labelsSome(LabelWhereInput labelsSome) {

        this.labelsSome = labelsSome;
        return this;
    }

    /**
     * Get labelsSome
     *
     * @return labelsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LabelWhereInput getLabelsSome() {
        return labelsSome;
    }

    public void setLabelsSome(LabelWhereInput labelsSome) {
        this.labelsSome = labelsSome;
    }

    public ClusterWhereInput labelsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_SOME);
        return this;
    }

    public ClusterWhereInput labelsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS_SOME);
        return this;
    }

    public void setLabelsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS_SOME);
        }
    }

    public boolean getLabelsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS_SOME);
    }

    public ClusterWhereInput licenseExpireDate(String licenseExpireDate) {

        this.licenseExpireDate = licenseExpireDate;
        return this;
    }

    /**
     * Get licenseExpireDate
     *
     * @return licenseExpireDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseExpireDate() {
        return licenseExpireDate;
    }

    public void setLicenseExpireDate(String licenseExpireDate) {
        this.licenseExpireDate = licenseExpireDate;
    }

    public ClusterWhereInput licenseExpireDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_EXPIRE_DATE);
        return this;
    }

    public ClusterWhereInput licenseExpireDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_EXPIRE_DATE);
        return this;
    }

    public void setLicenseExpireDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_EXPIRE_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_EXPIRE_DATE);
        }
    }

    public boolean getLicenseExpireDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_EXPIRE_DATE);
    }

    public ClusterWhereInput licenseExpireDateGt(String licenseExpireDateGt) {

        this.licenseExpireDateGt = licenseExpireDateGt;
        return this;
    }

    /**
     * Get licenseExpireDateGt
     *
     * @return licenseExpireDateGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseExpireDateGt() {
        return licenseExpireDateGt;
    }

    public void setLicenseExpireDateGt(String licenseExpireDateGt) {
        this.licenseExpireDateGt = licenseExpireDateGt;
    }

    public ClusterWhereInput licenseExpireDateGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_GT);
        return this;
    }

    public ClusterWhereInput licenseExpireDateGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_GT);
        return this;
    }

    public void setLicenseExpireDateGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_GT);
        }
    }

    public boolean getLicenseExpireDateGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_GT);
    }

    public ClusterWhereInput licenseExpireDateGte(String licenseExpireDateGte) {

        this.licenseExpireDateGte = licenseExpireDateGte;
        return this;
    }

    /**
     * Get licenseExpireDateGte
     *
     * @return licenseExpireDateGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseExpireDateGte() {
        return licenseExpireDateGte;
    }

    public void setLicenseExpireDateGte(String licenseExpireDateGte) {
        this.licenseExpireDateGte = licenseExpireDateGte;
    }

    public ClusterWhereInput licenseExpireDateGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_GTE);
        return this;
    }

    public ClusterWhereInput licenseExpireDateGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_GTE);
        return this;
    }

    public void setLicenseExpireDateGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_GTE);
        }
    }

    public boolean getLicenseExpireDateGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_GTE);
    }

    public ClusterWhereInput licenseExpireDateIn(List<String> licenseExpireDateIn) {

        this.licenseExpireDateIn = licenseExpireDateIn;
        return this;
    }

    public ClusterWhereInput addLicenseExpireDateInItem(String licenseExpireDateInItem) {
        if (this.licenseExpireDateIn == null) {
            this.licenseExpireDateIn = new ArrayList<String>();
        }
        this.licenseExpireDateIn.add(licenseExpireDateInItem);
        return this;
    }

    /**
     * Get licenseExpireDateIn
     *
     * @return licenseExpireDateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLicenseExpireDateIn() {
        return licenseExpireDateIn;
    }

    public void setLicenseExpireDateIn(List<String> licenseExpireDateIn) {
        this.licenseExpireDateIn = licenseExpireDateIn;
    }

    public ClusterWhereInput licenseExpireDateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_IN);
        return this;
    }

    public ClusterWhereInput licenseExpireDateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_IN);
        return this;
    }

    public void setLicenseExpireDateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_IN);
        }
    }

    public boolean getLicenseExpireDateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_IN);
    }

    public ClusterWhereInput licenseExpireDateLt(String licenseExpireDateLt) {

        this.licenseExpireDateLt = licenseExpireDateLt;
        return this;
    }

    /**
     * Get licenseExpireDateLt
     *
     * @return licenseExpireDateLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseExpireDateLt() {
        return licenseExpireDateLt;
    }

    public void setLicenseExpireDateLt(String licenseExpireDateLt) {
        this.licenseExpireDateLt = licenseExpireDateLt;
    }

    public ClusterWhereInput licenseExpireDateLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_LT);
        return this;
    }

    public ClusterWhereInput licenseExpireDateLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_LT);
        return this;
    }

    public void setLicenseExpireDateLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_LT);
        }
    }

    public boolean getLicenseExpireDateLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_LT);
    }

    public ClusterWhereInput licenseExpireDateLte(String licenseExpireDateLte) {

        this.licenseExpireDateLte = licenseExpireDateLte;
        return this;
    }

    /**
     * Get licenseExpireDateLte
     *
     * @return licenseExpireDateLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseExpireDateLte() {
        return licenseExpireDateLte;
    }

    public void setLicenseExpireDateLte(String licenseExpireDateLte) {
        this.licenseExpireDateLte = licenseExpireDateLte;
    }

    public ClusterWhereInput licenseExpireDateLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_LTE);
        return this;
    }

    public ClusterWhereInput licenseExpireDateLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_LTE);
        return this;
    }

    public void setLicenseExpireDateLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_LTE);
        }
    }

    public boolean getLicenseExpireDateLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_LTE);
    }

    public ClusterWhereInput licenseExpireDateNot(String licenseExpireDateNot) {

        this.licenseExpireDateNot = licenseExpireDateNot;
        return this;
    }

    /**
     * Get licenseExpireDateNot
     *
     * @return licenseExpireDateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseExpireDateNot() {
        return licenseExpireDateNot;
    }

    public void setLicenseExpireDateNot(String licenseExpireDateNot) {
        this.licenseExpireDateNot = licenseExpireDateNot;
    }

    public ClusterWhereInput licenseExpireDateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_NOT);
        return this;
    }

    public ClusterWhereInput licenseExpireDateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_NOT);
        return this;
    }

    public void setLicenseExpireDateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_NOT);
        }
    }

    public boolean getLicenseExpireDateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_NOT);
    }

    public ClusterWhereInput licenseExpireDateNotIn(List<String> licenseExpireDateNotIn) {

        this.licenseExpireDateNotIn = licenseExpireDateNotIn;
        return this;
    }

    public ClusterWhereInput addLicenseExpireDateNotInItem(String licenseExpireDateNotInItem) {
        if (this.licenseExpireDateNotIn == null) {
            this.licenseExpireDateNotIn = new ArrayList<String>();
        }
        this.licenseExpireDateNotIn.add(licenseExpireDateNotInItem);
        return this;
    }

    /**
     * Get licenseExpireDateNotIn
     *
     * @return licenseExpireDateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLicenseExpireDateNotIn() {
        return licenseExpireDateNotIn;
    }

    public void setLicenseExpireDateNotIn(List<String> licenseExpireDateNotIn) {
        this.licenseExpireDateNotIn = licenseExpireDateNotIn;
    }

    public ClusterWhereInput licenseExpireDateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_NOT_IN);
        return this;
    }

    public ClusterWhereInput licenseExpireDateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_NOT_IN);
        return this;
    }

    public void setLicenseExpireDateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_NOT_IN);
        }
    }

    public boolean getLicenseExpireDateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_EXPIRE_DATE_NOT_IN);
    }

    public ClusterWhereInput licenseSerial(String licenseSerial) {

        this.licenseSerial = licenseSerial;
        return this;
    }

    /**
     * Get licenseSerial
     *
     * @return licenseSerial
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerial() {
        return licenseSerial;
    }

    public void setLicenseSerial(String licenseSerial) {
        this.licenseSerial = licenseSerial;
    }

    public ClusterWhereInput licenseSerial_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL);
        return this;
    }

    public ClusterWhereInput licenseSerial_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL);
        return this;
    }

    public void setLicenseSerial_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL);
        }
    }

    public boolean getLicenseSerial_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL);
    }

    public ClusterWhereInput licenseSerialContains(String licenseSerialContains) {

        this.licenseSerialContains = licenseSerialContains;
        return this;
    }

    /**
     * Get licenseSerialContains
     *
     * @return licenseSerialContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialContains() {
        return licenseSerialContains;
    }

    public void setLicenseSerialContains(String licenseSerialContains) {
        this.licenseSerialContains = licenseSerialContains;
    }

    public ClusterWhereInput licenseSerialContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_CONTAINS);
        return this;
    }

    public ClusterWhereInput licenseSerialContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_CONTAINS);
        return this;
    }

    public void setLicenseSerialContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_CONTAINS);
        }
    }

    public boolean getLicenseSerialContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_CONTAINS);
    }

    public ClusterWhereInput licenseSerialEndsWith(String licenseSerialEndsWith) {

        this.licenseSerialEndsWith = licenseSerialEndsWith;
        return this;
    }

    /**
     * Get licenseSerialEndsWith
     *
     * @return licenseSerialEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialEndsWith() {
        return licenseSerialEndsWith;
    }

    public void setLicenseSerialEndsWith(String licenseSerialEndsWith) {
        this.licenseSerialEndsWith = licenseSerialEndsWith;
    }

    public ClusterWhereInput licenseSerialEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput licenseSerialEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_ENDS_WITH);
        return this;
    }

    public void setLicenseSerialEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_ENDS_WITH);
        }
    }

    public boolean getLicenseSerialEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_ENDS_WITH);
    }

    public ClusterWhereInput licenseSerialGt(String licenseSerialGt) {

        this.licenseSerialGt = licenseSerialGt;
        return this;
    }

    /**
     * Get licenseSerialGt
     *
     * @return licenseSerialGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialGt() {
        return licenseSerialGt;
    }

    public void setLicenseSerialGt(String licenseSerialGt) {
        this.licenseSerialGt = licenseSerialGt;
    }

    public ClusterWhereInput licenseSerialGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_GT);
        return this;
    }

    public ClusterWhereInput licenseSerialGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_GT);
        return this;
    }

    public void setLicenseSerialGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_GT);
        }
    }

    public boolean getLicenseSerialGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_GT);
    }

    public ClusterWhereInput licenseSerialGte(String licenseSerialGte) {

        this.licenseSerialGte = licenseSerialGte;
        return this;
    }

    /**
     * Get licenseSerialGte
     *
     * @return licenseSerialGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialGte() {
        return licenseSerialGte;
    }

    public void setLicenseSerialGte(String licenseSerialGte) {
        this.licenseSerialGte = licenseSerialGte;
    }

    public ClusterWhereInput licenseSerialGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_GTE);
        return this;
    }

    public ClusterWhereInput licenseSerialGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_GTE);
        return this;
    }

    public void setLicenseSerialGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_GTE);
        }
    }

    public boolean getLicenseSerialGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_GTE);
    }

    public ClusterWhereInput licenseSerialIn(List<String> licenseSerialIn) {

        this.licenseSerialIn = licenseSerialIn;
        return this;
    }

    public ClusterWhereInput addLicenseSerialInItem(String licenseSerialInItem) {
        if (this.licenseSerialIn == null) {
            this.licenseSerialIn = new ArrayList<String>();
        }
        this.licenseSerialIn.add(licenseSerialInItem);
        return this;
    }

    /**
     * Get licenseSerialIn
     *
     * @return licenseSerialIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLicenseSerialIn() {
        return licenseSerialIn;
    }

    public void setLicenseSerialIn(List<String> licenseSerialIn) {
        this.licenseSerialIn = licenseSerialIn;
    }

    public ClusterWhereInput licenseSerialIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_IN);
        return this;
    }

    public ClusterWhereInput licenseSerialIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_IN);
        return this;
    }

    public void setLicenseSerialIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_IN);
        }
    }

    public boolean getLicenseSerialIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_IN);
    }

    public ClusterWhereInput licenseSerialLt(String licenseSerialLt) {

        this.licenseSerialLt = licenseSerialLt;
        return this;
    }

    /**
     * Get licenseSerialLt
     *
     * @return licenseSerialLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialLt() {
        return licenseSerialLt;
    }

    public void setLicenseSerialLt(String licenseSerialLt) {
        this.licenseSerialLt = licenseSerialLt;
    }

    public ClusterWhereInput licenseSerialLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_LT);
        return this;
    }

    public ClusterWhereInput licenseSerialLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_LT);
        return this;
    }

    public void setLicenseSerialLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_LT);
        }
    }

    public boolean getLicenseSerialLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_LT);
    }

    public ClusterWhereInput licenseSerialLte(String licenseSerialLte) {

        this.licenseSerialLte = licenseSerialLte;
        return this;
    }

    /**
     * Get licenseSerialLte
     *
     * @return licenseSerialLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialLte() {
        return licenseSerialLte;
    }

    public void setLicenseSerialLte(String licenseSerialLte) {
        this.licenseSerialLte = licenseSerialLte;
    }

    public ClusterWhereInput licenseSerialLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_LTE);
        return this;
    }

    public ClusterWhereInput licenseSerialLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_LTE);
        return this;
    }

    public void setLicenseSerialLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_LTE);
        }
    }

    public boolean getLicenseSerialLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_LTE);
    }

    public ClusterWhereInput licenseSerialNot(String licenseSerialNot) {

        this.licenseSerialNot = licenseSerialNot;
        return this;
    }

    /**
     * Get licenseSerialNot
     *
     * @return licenseSerialNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialNot() {
        return licenseSerialNot;
    }

    public void setLicenseSerialNot(String licenseSerialNot) {
        this.licenseSerialNot = licenseSerialNot;
    }

    public ClusterWhereInput licenseSerialNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_NOT);
        return this;
    }

    public ClusterWhereInput licenseSerialNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_NOT);
        return this;
    }

    public void setLicenseSerialNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_NOT);
        }
    }

    public boolean getLicenseSerialNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_NOT);
    }

    public ClusterWhereInput licenseSerialNotContains(String licenseSerialNotContains) {

        this.licenseSerialNotContains = licenseSerialNotContains;
        return this;
    }

    /**
     * Get licenseSerialNotContains
     *
     * @return licenseSerialNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialNotContains() {
        return licenseSerialNotContains;
    }

    public void setLicenseSerialNotContains(String licenseSerialNotContains) {
        this.licenseSerialNotContains = licenseSerialNotContains;
    }

    public ClusterWhereInput licenseSerialNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_NOT_CONTAINS);
        return this;
    }

    public ClusterWhereInput licenseSerialNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_NOT_CONTAINS);
        return this;
    }

    public void setLicenseSerialNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_NOT_CONTAINS);
        }
    }

    public boolean getLicenseSerialNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_NOT_CONTAINS);
    }

    public ClusterWhereInput licenseSerialNotEndsWith(String licenseSerialNotEndsWith) {

        this.licenseSerialNotEndsWith = licenseSerialNotEndsWith;
        return this;
    }

    /**
     * Get licenseSerialNotEndsWith
     *
     * @return licenseSerialNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialNotEndsWith() {
        return licenseSerialNotEndsWith;
    }

    public void setLicenseSerialNotEndsWith(String licenseSerialNotEndsWith) {
        this.licenseSerialNotEndsWith = licenseSerialNotEndsWith;
    }

    public ClusterWhereInput licenseSerialNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_NOT_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput licenseSerialNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_NOT_ENDS_WITH);
        return this;
    }

    public void setLicenseSerialNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_NOT_ENDS_WITH);
        }
    }

    public boolean getLicenseSerialNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_NOT_ENDS_WITH);
    }

    public ClusterWhereInput licenseSerialNotIn(List<String> licenseSerialNotIn) {

        this.licenseSerialNotIn = licenseSerialNotIn;
        return this;
    }

    public ClusterWhereInput addLicenseSerialNotInItem(String licenseSerialNotInItem) {
        if (this.licenseSerialNotIn == null) {
            this.licenseSerialNotIn = new ArrayList<String>();
        }
        this.licenseSerialNotIn.add(licenseSerialNotInItem);
        return this;
    }

    /**
     * Get licenseSerialNotIn
     *
     * @return licenseSerialNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLicenseSerialNotIn() {
        return licenseSerialNotIn;
    }

    public void setLicenseSerialNotIn(List<String> licenseSerialNotIn) {
        this.licenseSerialNotIn = licenseSerialNotIn;
    }

    public ClusterWhereInput licenseSerialNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_NOT_IN);
        return this;
    }

    public ClusterWhereInput licenseSerialNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_NOT_IN);
        return this;
    }

    public void setLicenseSerialNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_NOT_IN);
        }
    }

    public boolean getLicenseSerialNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_NOT_IN);
    }

    public ClusterWhereInput licenseSerialNotStartsWith(String licenseSerialNotStartsWith) {

        this.licenseSerialNotStartsWith = licenseSerialNotStartsWith;
        return this;
    }

    /**
     * Get licenseSerialNotStartsWith
     *
     * @return licenseSerialNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialNotStartsWith() {
        return licenseSerialNotStartsWith;
    }

    public void setLicenseSerialNotStartsWith(String licenseSerialNotStartsWith) {
        this.licenseSerialNotStartsWith = licenseSerialNotStartsWith;
    }

    public ClusterWhereInput licenseSerialNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_NOT_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput licenseSerialNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_NOT_STARTS_WITH);
        return this;
    }

    public void setLicenseSerialNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_NOT_STARTS_WITH);
        }
    }

    public boolean getLicenseSerialNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_NOT_STARTS_WITH);
    }

    public ClusterWhereInput licenseSerialStartsWith(String licenseSerialStartsWith) {

        this.licenseSerialStartsWith = licenseSerialStartsWith;
        return this;
    }

    /**
     * Get licenseSerialStartsWith
     *
     * @return licenseSerialStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialStartsWith() {
        return licenseSerialStartsWith;
    }

    public void setLicenseSerialStartsWith(String licenseSerialStartsWith) {
        this.licenseSerialStartsWith = licenseSerialStartsWith;
    }

    public ClusterWhereInput licenseSerialStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput licenseSerialStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_STARTS_WITH);
        return this;
    }

    public void setLicenseSerialStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_STARTS_WITH);
        }
    }

    public boolean getLicenseSerialStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_STARTS_WITH);
    }

    public ClusterWhereInput licenseSignDate(String licenseSignDate) {

        this.licenseSignDate = licenseSignDate;
        return this;
    }

    /**
     * Get licenseSignDate
     *
     * @return licenseSignDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSignDate() {
        return licenseSignDate;
    }

    public void setLicenseSignDate(String licenseSignDate) {
        this.licenseSignDate = licenseSignDate;
    }

    public ClusterWhereInput licenseSignDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGN_DATE);
        return this;
    }

    public ClusterWhereInput licenseSignDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGN_DATE);
        return this;
    }

    public void setLicenseSignDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGN_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGN_DATE);
        }
    }

    public boolean getLicenseSignDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGN_DATE);
    }

    public ClusterWhereInput licenseSignDateGt(String licenseSignDateGt) {

        this.licenseSignDateGt = licenseSignDateGt;
        return this;
    }

    /**
     * Get licenseSignDateGt
     *
     * @return licenseSignDateGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSignDateGt() {
        return licenseSignDateGt;
    }

    public void setLicenseSignDateGt(String licenseSignDateGt) {
        this.licenseSignDateGt = licenseSignDateGt;
    }

    public ClusterWhereInput licenseSignDateGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGN_DATE_GT);
        return this;
    }

    public ClusterWhereInput licenseSignDateGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGN_DATE_GT);
        return this;
    }

    public void setLicenseSignDateGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGN_DATE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGN_DATE_GT);
        }
    }

    public boolean getLicenseSignDateGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGN_DATE_GT);
    }

    public ClusterWhereInput licenseSignDateGte(String licenseSignDateGte) {

        this.licenseSignDateGte = licenseSignDateGte;
        return this;
    }

    /**
     * Get licenseSignDateGte
     *
     * @return licenseSignDateGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSignDateGte() {
        return licenseSignDateGte;
    }

    public void setLicenseSignDateGte(String licenseSignDateGte) {
        this.licenseSignDateGte = licenseSignDateGte;
    }

    public ClusterWhereInput licenseSignDateGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGN_DATE_GTE);
        return this;
    }

    public ClusterWhereInput licenseSignDateGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGN_DATE_GTE);
        return this;
    }

    public void setLicenseSignDateGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGN_DATE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGN_DATE_GTE);
        }
    }

    public boolean getLicenseSignDateGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGN_DATE_GTE);
    }

    public ClusterWhereInput licenseSignDateIn(List<String> licenseSignDateIn) {

        this.licenseSignDateIn = licenseSignDateIn;
        return this;
    }

    public ClusterWhereInput addLicenseSignDateInItem(String licenseSignDateInItem) {
        if (this.licenseSignDateIn == null) {
            this.licenseSignDateIn = new ArrayList<String>();
        }
        this.licenseSignDateIn.add(licenseSignDateInItem);
        return this;
    }

    /**
     * Get licenseSignDateIn
     *
     * @return licenseSignDateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLicenseSignDateIn() {
        return licenseSignDateIn;
    }

    public void setLicenseSignDateIn(List<String> licenseSignDateIn) {
        this.licenseSignDateIn = licenseSignDateIn;
    }

    public ClusterWhereInput licenseSignDateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGN_DATE_IN);
        return this;
    }

    public ClusterWhereInput licenseSignDateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGN_DATE_IN);
        return this;
    }

    public void setLicenseSignDateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGN_DATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGN_DATE_IN);
        }
    }

    public boolean getLicenseSignDateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGN_DATE_IN);
    }

    public ClusterWhereInput licenseSignDateLt(String licenseSignDateLt) {

        this.licenseSignDateLt = licenseSignDateLt;
        return this;
    }

    /**
     * Get licenseSignDateLt
     *
     * @return licenseSignDateLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSignDateLt() {
        return licenseSignDateLt;
    }

    public void setLicenseSignDateLt(String licenseSignDateLt) {
        this.licenseSignDateLt = licenseSignDateLt;
    }

    public ClusterWhereInput licenseSignDateLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGN_DATE_LT);
        return this;
    }

    public ClusterWhereInput licenseSignDateLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGN_DATE_LT);
        return this;
    }

    public void setLicenseSignDateLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGN_DATE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGN_DATE_LT);
        }
    }

    public boolean getLicenseSignDateLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGN_DATE_LT);
    }

    public ClusterWhereInput licenseSignDateLte(String licenseSignDateLte) {

        this.licenseSignDateLte = licenseSignDateLte;
        return this;
    }

    /**
     * Get licenseSignDateLte
     *
     * @return licenseSignDateLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSignDateLte() {
        return licenseSignDateLte;
    }

    public void setLicenseSignDateLte(String licenseSignDateLte) {
        this.licenseSignDateLte = licenseSignDateLte;
    }

    public ClusterWhereInput licenseSignDateLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGN_DATE_LTE);
        return this;
    }

    public ClusterWhereInput licenseSignDateLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGN_DATE_LTE);
        return this;
    }

    public void setLicenseSignDateLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGN_DATE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGN_DATE_LTE);
        }
    }

    public boolean getLicenseSignDateLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGN_DATE_LTE);
    }

    public ClusterWhereInput licenseSignDateNot(String licenseSignDateNot) {

        this.licenseSignDateNot = licenseSignDateNot;
        return this;
    }

    /**
     * Get licenseSignDateNot
     *
     * @return licenseSignDateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSignDateNot() {
        return licenseSignDateNot;
    }

    public void setLicenseSignDateNot(String licenseSignDateNot) {
        this.licenseSignDateNot = licenseSignDateNot;
    }

    public ClusterWhereInput licenseSignDateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGN_DATE_NOT);
        return this;
    }

    public ClusterWhereInput licenseSignDateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGN_DATE_NOT);
        return this;
    }

    public void setLicenseSignDateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGN_DATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGN_DATE_NOT);
        }
    }

    public boolean getLicenseSignDateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGN_DATE_NOT);
    }

    public ClusterWhereInput licenseSignDateNotIn(List<String> licenseSignDateNotIn) {

        this.licenseSignDateNotIn = licenseSignDateNotIn;
        return this;
    }

    public ClusterWhereInput addLicenseSignDateNotInItem(String licenseSignDateNotInItem) {
        if (this.licenseSignDateNotIn == null) {
            this.licenseSignDateNotIn = new ArrayList<String>();
        }
        this.licenseSignDateNotIn.add(licenseSignDateNotInItem);
        return this;
    }

    /**
     * Get licenseSignDateNotIn
     *
     * @return licenseSignDateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLicenseSignDateNotIn() {
        return licenseSignDateNotIn;
    }

    public void setLicenseSignDateNotIn(List<String> licenseSignDateNotIn) {
        this.licenseSignDateNotIn = licenseSignDateNotIn;
    }

    public ClusterWhereInput licenseSignDateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGN_DATE_NOT_IN);
        return this;
    }

    public ClusterWhereInput licenseSignDateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGN_DATE_NOT_IN);
        return this;
    }

    public void setLicenseSignDateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGN_DATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGN_DATE_NOT_IN);
        }
    }

    public boolean getLicenseSignDateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGN_DATE_NOT_IN);
    }

    public ClusterWhereInput licenseType(LicenseType licenseType) {

        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get licenseType
     *
     * @return licenseType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LicenseType getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
    }

    public ClusterWhereInput licenseType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE);
        return this;
    }

    public ClusterWhereInput licenseType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_TYPE);
        return this;
    }

    public void setLicenseType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_TYPE);
        }
    }

    public boolean getLicenseType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_TYPE);
    }

    public ClusterWhereInput licenseTypeIn(List<LicenseType> licenseTypeIn) {

        this.licenseTypeIn = licenseTypeIn;
        return this;
    }

    public ClusterWhereInput addLicenseTypeInItem(LicenseType licenseTypeInItem) {
        if (this.licenseTypeIn == null) {
            this.licenseTypeIn = new ArrayList<LicenseType>();
        }
        this.licenseTypeIn.add(licenseTypeInItem);
        return this;
    }

    /**
     * Get licenseTypeIn
     *
     * @return licenseTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<LicenseType> getLicenseTypeIn() {
        return licenseTypeIn;
    }

    public void setLicenseTypeIn(List<LicenseType> licenseTypeIn) {
        this.licenseTypeIn = licenseTypeIn;
    }

    public ClusterWhereInput licenseTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE_IN);
        return this;
    }

    public ClusterWhereInput licenseTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_TYPE_IN);
        return this;
    }

    public void setLicenseTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_TYPE_IN);
        }
    }

    public boolean getLicenseTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_TYPE_IN);
    }

    public ClusterWhereInput licenseTypeNot(LicenseType licenseTypeNot) {

        this.licenseTypeNot = licenseTypeNot;
        return this;
    }

    /**
     * Get licenseTypeNot
     *
     * @return licenseTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LicenseType getLicenseTypeNot() {
        return licenseTypeNot;
    }

    public void setLicenseTypeNot(LicenseType licenseTypeNot) {
        this.licenseTypeNot = licenseTypeNot;
    }

    public ClusterWhereInput licenseTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE_NOT);
        return this;
    }

    public ClusterWhereInput licenseTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_TYPE_NOT);
        return this;
    }

    public void setLicenseTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_TYPE_NOT);
        }
    }

    public boolean getLicenseTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_TYPE_NOT);
    }

    public ClusterWhereInput licenseTypeNotIn(List<LicenseType> licenseTypeNotIn) {

        this.licenseTypeNotIn = licenseTypeNotIn;
        return this;
    }

    public ClusterWhereInput addLicenseTypeNotInItem(LicenseType licenseTypeNotInItem) {
        if (this.licenseTypeNotIn == null) {
            this.licenseTypeNotIn = new ArrayList<LicenseType>();
        }
        this.licenseTypeNotIn.add(licenseTypeNotInItem);
        return this;
    }

    /**
     * Get licenseTypeNotIn
     *
     * @return licenseTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<LicenseType> getLicenseTypeNotIn() {
        return licenseTypeNotIn;
    }

    public void setLicenseTypeNotIn(List<LicenseType> licenseTypeNotIn) {
        this.licenseTypeNotIn = licenseTypeNotIn;
    }

    public ClusterWhereInput licenseTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE_NOT_IN);
        return this;
    }

    public ClusterWhereInput licenseTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_TYPE_NOT_IN);
        return this;
    }

    public void setLicenseTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_TYPE_NOT_IN);
        }
    }

    public boolean getLicenseTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_TYPE_NOT_IN);
    }

    public ClusterWhereInput localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public ClusterWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public ClusterWhereInput localId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public void setLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        }
    }

    public boolean getLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID);
    }

    public ClusterWhereInput localIdContains(String localIdContains) {

        this.localIdContains = localIdContains;
        return this;
    }

    /**
     * Get localIdContains
     *
     * @return localIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdContains() {
        return localIdContains;
    }

    public void setLocalIdContains(String localIdContains) {
        this.localIdContains = localIdContains;
    }

    public ClusterWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public ClusterWhereInput localIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public void setLocalIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        }
    }

    public boolean getLocalIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
    }

    public ClusterWhereInput localIdEndsWith(String localIdEndsWith) {

        this.localIdEndsWith = localIdEndsWith;
        return this;
    }

    /**
     * Get localIdEndsWith
     *
     * @return localIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdEndsWith() {
        return localIdEndsWith;
    }

    public void setLocalIdEndsWith(String localIdEndsWith) {
        this.localIdEndsWith = localIdEndsWith;
    }

    public ClusterWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput localIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public void setLocalIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        }
    }

    public boolean getLocalIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
    }

    public ClusterWhereInput localIdGt(String localIdGt) {

        this.localIdGt = localIdGt;
        return this;
    }

    /**
     * Get localIdGt
     *
     * @return localIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdGt() {
        return localIdGt;
    }

    public void setLocalIdGt(String localIdGt) {
        this.localIdGt = localIdGt;
    }

    public ClusterWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public ClusterWhereInput localIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public void setLocalIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GT);
        }
    }

    public boolean getLocalIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_GT);
    }

    public ClusterWhereInput localIdGte(String localIdGte) {

        this.localIdGte = localIdGte;
        return this;
    }

    /**
     * Get localIdGte
     *
     * @return localIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdGte() {
        return localIdGte;
    }

    public void setLocalIdGte(String localIdGte) {
        this.localIdGte = localIdGte;
    }

    public ClusterWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public ClusterWhereInput localIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public void setLocalIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GTE);
        }
    }

    public boolean getLocalIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_GTE);
    }

    public ClusterWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public ClusterWhereInput addLocalIdInItem(String localIdInItem) {
        if (this.localIdIn == null) {
            this.localIdIn = new ArrayList<String>();
        }
        this.localIdIn.add(localIdInItem);
        return this;
    }

    /**
     * Get localIdIn
     *
     * @return localIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalIdIn() {
        return localIdIn;
    }

    public void setLocalIdIn(List<String> localIdIn) {
        this.localIdIn = localIdIn;
    }

    public ClusterWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public ClusterWhereInput localIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public void setLocalIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_IN);
        }
    }

    public boolean getLocalIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_IN);
    }

    public ClusterWhereInput localIdLt(String localIdLt) {

        this.localIdLt = localIdLt;
        return this;
    }

    /**
     * Get localIdLt
     *
     * @return localIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdLt() {
        return localIdLt;
    }

    public void setLocalIdLt(String localIdLt) {
        this.localIdLt = localIdLt;
    }

    public ClusterWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public ClusterWhereInput localIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public void setLocalIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LT);
        }
    }

    public boolean getLocalIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_LT);
    }

    public ClusterWhereInput localIdLte(String localIdLte) {

        this.localIdLte = localIdLte;
        return this;
    }

    /**
     * Get localIdLte
     *
     * @return localIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdLte() {
        return localIdLte;
    }

    public void setLocalIdLte(String localIdLte) {
        this.localIdLte = localIdLte;
    }

    public ClusterWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public ClusterWhereInput localIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public void setLocalIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LTE);
        }
    }

    public boolean getLocalIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_LTE);
    }

    public ClusterWhereInput localIdNot(String localIdNot) {

        this.localIdNot = localIdNot;
        return this;
    }

    /**
     * Get localIdNot
     *
     * @return localIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNot() {
        return localIdNot;
    }

    public void setLocalIdNot(String localIdNot) {
        this.localIdNot = localIdNot;
    }

    public ClusterWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public ClusterWhereInput localIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public void setLocalIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT);
        }
    }

    public boolean getLocalIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT);
    }

    public ClusterWhereInput localIdNotContains(String localIdNotContains) {

        this.localIdNotContains = localIdNotContains;
        return this;
    }

    /**
     * Get localIdNotContains
     *
     * @return localIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotContains() {
        return localIdNotContains;
    }

    public void setLocalIdNotContains(String localIdNotContains) {
        this.localIdNotContains = localIdNotContains;
    }

    public ClusterWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public ClusterWhereInput localIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public void setLocalIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        }
    }

    public boolean getLocalIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
    }

    public ClusterWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

        this.localIdNotEndsWith = localIdNotEndsWith;
        return this;
    }

    /**
     * Get localIdNotEndsWith
     *
     * @return localIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotEndsWith() {
        return localIdNotEndsWith;
    }

    public void setLocalIdNotEndsWith(String localIdNotEndsWith) {
        this.localIdNotEndsWith = localIdNotEndsWith;
    }

    public ClusterWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput localIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setLocalIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getLocalIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
    }

    public ClusterWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public ClusterWhereInput addLocalIdNotInItem(String localIdNotInItem) {
        if (this.localIdNotIn == null) {
            this.localIdNotIn = new ArrayList<String>();
        }
        this.localIdNotIn.add(localIdNotInItem);
        return this;
    }

    /**
     * Get localIdNotIn
     *
     * @return localIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalIdNotIn() {
        return localIdNotIn;
    }

    public void setLocalIdNotIn(List<String> localIdNotIn) {
        this.localIdNotIn = localIdNotIn;
    }

    public ClusterWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public ClusterWhereInput localIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public void setLocalIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        }
    }

    public boolean getLocalIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
    }

    public ClusterWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

        this.localIdNotStartsWith = localIdNotStartsWith;
        return this;
    }

    /**
     * Get localIdNotStartsWith
     *
     * @return localIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotStartsWith() {
        return localIdNotStartsWith;
    }

    public void setLocalIdNotStartsWith(String localIdNotStartsWith) {
        this.localIdNotStartsWith = localIdNotStartsWith;
    }

    public ClusterWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput localIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setLocalIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getLocalIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
    }

    public ClusterWhereInput localIdStartsWith(String localIdStartsWith) {

        this.localIdStartsWith = localIdStartsWith;
        return this;
    }

    /**
     * Get localIdStartsWith
     *
     * @return localIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdStartsWith() {
        return localIdStartsWith;
    }

    public void setLocalIdStartsWith(String localIdStartsWith) {
        this.localIdStartsWith = localIdStartsWith;
    }

    public ClusterWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput localIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public void setLocalIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        }
    }

    public boolean getLocalIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
    }

    public ClusterWhereInput maintenanceEndDate(String maintenanceEndDate) {

        this.maintenanceEndDate = maintenanceEndDate;
        return this;
    }

    /**
     * Get maintenanceEndDate
     *
     * @return maintenanceEndDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceEndDate() {
        return maintenanceEndDate;
    }

    public void setMaintenanceEndDate(String maintenanceEndDate) {
        this.maintenanceEndDate = maintenanceEndDate;
    }

    public ClusterWhereInput maintenanceEndDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE);
        return this;
    }

    public ClusterWhereInput maintenanceEndDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE);
        return this;
    }

    public void setMaintenanceEndDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE);
        }
    }

    public boolean getMaintenanceEndDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_END_DATE);
    }

    public ClusterWhereInput maintenanceEndDateGt(String maintenanceEndDateGt) {

        this.maintenanceEndDateGt = maintenanceEndDateGt;
        return this;
    }

    /**
     * Get maintenanceEndDateGt
     *
     * @return maintenanceEndDateGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceEndDateGt() {
        return maintenanceEndDateGt;
    }

    public void setMaintenanceEndDateGt(String maintenanceEndDateGt) {
        this.maintenanceEndDateGt = maintenanceEndDateGt;
    }

    public ClusterWhereInput maintenanceEndDateGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_GT);
        return this;
    }

    public ClusterWhereInput maintenanceEndDateGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_GT);
        return this;
    }

    public void setMaintenanceEndDateGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_GT);
        }
    }

    public boolean getMaintenanceEndDateGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_END_DATE_GT);
    }

    public ClusterWhereInput maintenanceEndDateGte(String maintenanceEndDateGte) {

        this.maintenanceEndDateGte = maintenanceEndDateGte;
        return this;
    }

    /**
     * Get maintenanceEndDateGte
     *
     * @return maintenanceEndDateGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceEndDateGte() {
        return maintenanceEndDateGte;
    }

    public void setMaintenanceEndDateGte(String maintenanceEndDateGte) {
        this.maintenanceEndDateGte = maintenanceEndDateGte;
    }

    public ClusterWhereInput maintenanceEndDateGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_GTE);
        return this;
    }

    public ClusterWhereInput maintenanceEndDateGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_GTE);
        return this;
    }

    public void setMaintenanceEndDateGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_GTE);
        }
    }

    public boolean getMaintenanceEndDateGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_END_DATE_GTE);
    }

    public ClusterWhereInput maintenanceEndDateIn(List<String> maintenanceEndDateIn) {

        this.maintenanceEndDateIn = maintenanceEndDateIn;
        return this;
    }

    public ClusterWhereInput addMaintenanceEndDateInItem(String maintenanceEndDateInItem) {
        if (this.maintenanceEndDateIn == null) {
            this.maintenanceEndDateIn = new ArrayList<String>();
        }
        this.maintenanceEndDateIn.add(maintenanceEndDateInItem);
        return this;
    }

    /**
     * Get maintenanceEndDateIn
     *
     * @return maintenanceEndDateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMaintenanceEndDateIn() {
        return maintenanceEndDateIn;
    }

    public void setMaintenanceEndDateIn(List<String> maintenanceEndDateIn) {
        this.maintenanceEndDateIn = maintenanceEndDateIn;
    }

    public ClusterWhereInput maintenanceEndDateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_IN);
        return this;
    }

    public ClusterWhereInput maintenanceEndDateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_IN);
        return this;
    }

    public void setMaintenanceEndDateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_IN);
        }
    }

    public boolean getMaintenanceEndDateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_END_DATE_IN);
    }

    public ClusterWhereInput maintenanceEndDateLt(String maintenanceEndDateLt) {

        this.maintenanceEndDateLt = maintenanceEndDateLt;
        return this;
    }

    /**
     * Get maintenanceEndDateLt
     *
     * @return maintenanceEndDateLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceEndDateLt() {
        return maintenanceEndDateLt;
    }

    public void setMaintenanceEndDateLt(String maintenanceEndDateLt) {
        this.maintenanceEndDateLt = maintenanceEndDateLt;
    }

    public ClusterWhereInput maintenanceEndDateLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_LT);
        return this;
    }

    public ClusterWhereInput maintenanceEndDateLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_LT);
        return this;
    }

    public void setMaintenanceEndDateLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_LT);
        }
    }

    public boolean getMaintenanceEndDateLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_END_DATE_LT);
    }

    public ClusterWhereInput maintenanceEndDateLte(String maintenanceEndDateLte) {

        this.maintenanceEndDateLte = maintenanceEndDateLte;
        return this;
    }

    /**
     * Get maintenanceEndDateLte
     *
     * @return maintenanceEndDateLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceEndDateLte() {
        return maintenanceEndDateLte;
    }

    public void setMaintenanceEndDateLte(String maintenanceEndDateLte) {
        this.maintenanceEndDateLte = maintenanceEndDateLte;
    }

    public ClusterWhereInput maintenanceEndDateLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_LTE);
        return this;
    }

    public ClusterWhereInput maintenanceEndDateLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_LTE);
        return this;
    }

    public void setMaintenanceEndDateLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_LTE);
        }
    }

    public boolean getMaintenanceEndDateLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_END_DATE_LTE);
    }

    public ClusterWhereInput maintenanceEndDateNot(String maintenanceEndDateNot) {

        this.maintenanceEndDateNot = maintenanceEndDateNot;
        return this;
    }

    /**
     * Get maintenanceEndDateNot
     *
     * @return maintenanceEndDateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceEndDateNot() {
        return maintenanceEndDateNot;
    }

    public void setMaintenanceEndDateNot(String maintenanceEndDateNot) {
        this.maintenanceEndDateNot = maintenanceEndDateNot;
    }

    public ClusterWhereInput maintenanceEndDateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT);
        return this;
    }

    public ClusterWhereInput maintenanceEndDateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT);
        return this;
    }

    public void setMaintenanceEndDateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT);
        }
    }

    public boolean getMaintenanceEndDateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT);
    }

    public ClusterWhereInput maintenanceEndDateNotIn(List<String> maintenanceEndDateNotIn) {

        this.maintenanceEndDateNotIn = maintenanceEndDateNotIn;
        return this;
    }

    public ClusterWhereInput addMaintenanceEndDateNotInItem(String maintenanceEndDateNotInItem) {
        if (this.maintenanceEndDateNotIn == null) {
            this.maintenanceEndDateNotIn = new ArrayList<String>();
        }
        this.maintenanceEndDateNotIn.add(maintenanceEndDateNotInItem);
        return this;
    }

    /**
     * Get maintenanceEndDateNotIn
     *
     * @return maintenanceEndDateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMaintenanceEndDateNotIn() {
        return maintenanceEndDateNotIn;
    }

    public void setMaintenanceEndDateNotIn(List<String> maintenanceEndDateNotIn) {
        this.maintenanceEndDateNotIn = maintenanceEndDateNotIn;
    }

    public ClusterWhereInput maintenanceEndDateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT_IN);
        return this;
    }

    public ClusterWhereInput maintenanceEndDateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT_IN);
        return this;
    }

    public void setMaintenanceEndDateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT_IN);
        }
    }

    public boolean getMaintenanceEndDateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT_IN);
    }

    public ClusterWhereInput maintenanceStartDate(String maintenanceStartDate) {

        this.maintenanceStartDate = maintenanceStartDate;
        return this;
    }

    /**
     * Get maintenanceStartDate
     *
     * @return maintenanceStartDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceStartDate() {
        return maintenanceStartDate;
    }

    public void setMaintenanceStartDate(String maintenanceStartDate) {
        this.maintenanceStartDate = maintenanceStartDate;
    }

    public ClusterWhereInput maintenanceStartDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE);
        return this;
    }

    public ClusterWhereInput maintenanceStartDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE);
        return this;
    }

    public void setMaintenanceStartDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE);
        }
    }

    public boolean getMaintenanceStartDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_START_DATE);
    }

    public ClusterWhereInput maintenanceStartDateGt(String maintenanceStartDateGt) {

        this.maintenanceStartDateGt = maintenanceStartDateGt;
        return this;
    }

    /**
     * Get maintenanceStartDateGt
     *
     * @return maintenanceStartDateGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceStartDateGt() {
        return maintenanceStartDateGt;
    }

    public void setMaintenanceStartDateGt(String maintenanceStartDateGt) {
        this.maintenanceStartDateGt = maintenanceStartDateGt;
    }

    public ClusterWhereInput maintenanceStartDateGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_GT);
        return this;
    }

    public ClusterWhereInput maintenanceStartDateGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_GT);
        return this;
    }

    public void setMaintenanceStartDateGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_GT);
        }
    }

    public boolean getMaintenanceStartDateGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_START_DATE_GT);
    }

    public ClusterWhereInput maintenanceStartDateGte(String maintenanceStartDateGte) {

        this.maintenanceStartDateGte = maintenanceStartDateGte;
        return this;
    }

    /**
     * Get maintenanceStartDateGte
     *
     * @return maintenanceStartDateGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceStartDateGte() {
        return maintenanceStartDateGte;
    }

    public void setMaintenanceStartDateGte(String maintenanceStartDateGte) {
        this.maintenanceStartDateGte = maintenanceStartDateGte;
    }

    public ClusterWhereInput maintenanceStartDateGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_GTE);
        return this;
    }

    public ClusterWhereInput maintenanceStartDateGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_GTE);
        return this;
    }

    public void setMaintenanceStartDateGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_GTE);
        }
    }

    public boolean getMaintenanceStartDateGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_START_DATE_GTE);
    }

    public ClusterWhereInput maintenanceStartDateIn(List<String> maintenanceStartDateIn) {

        this.maintenanceStartDateIn = maintenanceStartDateIn;
        return this;
    }

    public ClusterWhereInput addMaintenanceStartDateInItem(String maintenanceStartDateInItem) {
        if (this.maintenanceStartDateIn == null) {
            this.maintenanceStartDateIn = new ArrayList<String>();
        }
        this.maintenanceStartDateIn.add(maintenanceStartDateInItem);
        return this;
    }

    /**
     * Get maintenanceStartDateIn
     *
     * @return maintenanceStartDateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMaintenanceStartDateIn() {
        return maintenanceStartDateIn;
    }

    public void setMaintenanceStartDateIn(List<String> maintenanceStartDateIn) {
        this.maintenanceStartDateIn = maintenanceStartDateIn;
    }

    public ClusterWhereInput maintenanceStartDateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_IN);
        return this;
    }

    public ClusterWhereInput maintenanceStartDateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_IN);
        return this;
    }

    public void setMaintenanceStartDateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_IN);
        }
    }

    public boolean getMaintenanceStartDateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_START_DATE_IN);
    }

    public ClusterWhereInput maintenanceStartDateLt(String maintenanceStartDateLt) {

        this.maintenanceStartDateLt = maintenanceStartDateLt;
        return this;
    }

    /**
     * Get maintenanceStartDateLt
     *
     * @return maintenanceStartDateLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceStartDateLt() {
        return maintenanceStartDateLt;
    }

    public void setMaintenanceStartDateLt(String maintenanceStartDateLt) {
        this.maintenanceStartDateLt = maintenanceStartDateLt;
    }

    public ClusterWhereInput maintenanceStartDateLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_LT);
        return this;
    }

    public ClusterWhereInput maintenanceStartDateLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_LT);
        return this;
    }

    public void setMaintenanceStartDateLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_LT);
        }
    }

    public boolean getMaintenanceStartDateLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_START_DATE_LT);
    }

    public ClusterWhereInput maintenanceStartDateLte(String maintenanceStartDateLte) {

        this.maintenanceStartDateLte = maintenanceStartDateLte;
        return this;
    }

    /**
     * Get maintenanceStartDateLte
     *
     * @return maintenanceStartDateLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceStartDateLte() {
        return maintenanceStartDateLte;
    }

    public void setMaintenanceStartDateLte(String maintenanceStartDateLte) {
        this.maintenanceStartDateLte = maintenanceStartDateLte;
    }

    public ClusterWhereInput maintenanceStartDateLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_LTE);
        return this;
    }

    public ClusterWhereInput maintenanceStartDateLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_LTE);
        return this;
    }

    public void setMaintenanceStartDateLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_LTE);
        }
    }

    public boolean getMaintenanceStartDateLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_START_DATE_LTE);
    }

    public ClusterWhereInput maintenanceStartDateNot(String maintenanceStartDateNot) {

        this.maintenanceStartDateNot = maintenanceStartDateNot;
        return this;
    }

    /**
     * Get maintenanceStartDateNot
     *
     * @return maintenanceStartDateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceStartDateNot() {
        return maintenanceStartDateNot;
    }

    public void setMaintenanceStartDateNot(String maintenanceStartDateNot) {
        this.maintenanceStartDateNot = maintenanceStartDateNot;
    }

    public ClusterWhereInput maintenanceStartDateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT);
        return this;
    }

    public ClusterWhereInput maintenanceStartDateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT);
        return this;
    }

    public void setMaintenanceStartDateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT);
        }
    }

    public boolean getMaintenanceStartDateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT);
    }

    public ClusterWhereInput maintenanceStartDateNotIn(List<String> maintenanceStartDateNotIn) {

        this.maintenanceStartDateNotIn = maintenanceStartDateNotIn;
        return this;
    }

    public ClusterWhereInput addMaintenanceStartDateNotInItem(
            String maintenanceStartDateNotInItem) {
        if (this.maintenanceStartDateNotIn == null) {
            this.maintenanceStartDateNotIn = new ArrayList<String>();
        }
        this.maintenanceStartDateNotIn.add(maintenanceStartDateNotInItem);
        return this;
    }

    /**
     * Get maintenanceStartDateNotIn
     *
     * @return maintenanceStartDateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMaintenanceStartDateNotIn() {
        return maintenanceStartDateNotIn;
    }

    public void setMaintenanceStartDateNotIn(List<String> maintenanceStartDateNotIn) {
        this.maintenanceStartDateNotIn = maintenanceStartDateNotIn;
    }

    public ClusterWhereInput maintenanceStartDateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT_IN);
        return this;
    }

    public ClusterWhereInput maintenanceStartDateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT_IN);
        return this;
    }

    public void setMaintenanceStartDateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT_IN);
        }
    }

    public boolean getMaintenanceStartDateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT_IN);
    }

    public ClusterWhereInput managementVip(String managementVip) {

        this.managementVip = managementVip;
        return this;
    }

    /**
     * Get managementVip
     *
     * @return managementVip
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementVip() {
        return managementVip;
    }

    public void setManagementVip(String managementVip) {
        this.managementVip = managementVip;
    }

    public ClusterWhereInput managementVip_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP);
        return this;
    }

    public ClusterWhereInput managementVip_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP);
        return this;
    }

    public void setManagementVip_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP);
        }
    }

    public boolean getManagementVip_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_VIP);
    }

    public ClusterWhereInput managementVipContains(String managementVipContains) {

        this.managementVipContains = managementVipContains;
        return this;
    }

    /**
     * Get managementVipContains
     *
     * @return managementVipContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementVipContains() {
        return managementVipContains;
    }

    public void setManagementVipContains(String managementVipContains) {
        this.managementVipContains = managementVipContains;
    }

    public ClusterWhereInput managementVipContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_CONTAINS);
        return this;
    }

    public ClusterWhereInput managementVipContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_CONTAINS);
        return this;
    }

    public void setManagementVipContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_CONTAINS);
        }
    }

    public boolean getManagementVipContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_VIP_CONTAINS);
    }

    public ClusterWhereInput managementVipEndsWith(String managementVipEndsWith) {

        this.managementVipEndsWith = managementVipEndsWith;
        return this;
    }

    /**
     * Get managementVipEndsWith
     *
     * @return managementVipEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementVipEndsWith() {
        return managementVipEndsWith;
    }

    public void setManagementVipEndsWith(String managementVipEndsWith) {
        this.managementVipEndsWith = managementVipEndsWith;
    }

    public ClusterWhereInput managementVipEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput managementVipEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_ENDS_WITH);
        return this;
    }

    public void setManagementVipEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_ENDS_WITH);
        }
    }

    public boolean getManagementVipEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_VIP_ENDS_WITH);
    }

    public ClusterWhereInput managementVipGt(String managementVipGt) {

        this.managementVipGt = managementVipGt;
        return this;
    }

    /**
     * Get managementVipGt
     *
     * @return managementVipGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementVipGt() {
        return managementVipGt;
    }

    public void setManagementVipGt(String managementVipGt) {
        this.managementVipGt = managementVipGt;
    }

    public ClusterWhereInput managementVipGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_GT);
        return this;
    }

    public ClusterWhereInput managementVipGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_GT);
        return this;
    }

    public void setManagementVipGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_GT);
        }
    }

    public boolean getManagementVipGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_VIP_GT);
    }

    public ClusterWhereInput managementVipGte(String managementVipGte) {

        this.managementVipGte = managementVipGte;
        return this;
    }

    /**
     * Get managementVipGte
     *
     * @return managementVipGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementVipGte() {
        return managementVipGte;
    }

    public void setManagementVipGte(String managementVipGte) {
        this.managementVipGte = managementVipGte;
    }

    public ClusterWhereInput managementVipGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_GTE);
        return this;
    }

    public ClusterWhereInput managementVipGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_GTE);
        return this;
    }

    public void setManagementVipGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_GTE);
        }
    }

    public boolean getManagementVipGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_VIP_GTE);
    }

    public ClusterWhereInput managementVipIn(List<String> managementVipIn) {

        this.managementVipIn = managementVipIn;
        return this;
    }

    public ClusterWhereInput addManagementVipInItem(String managementVipInItem) {
        if (this.managementVipIn == null) {
            this.managementVipIn = new ArrayList<String>();
        }
        this.managementVipIn.add(managementVipInItem);
        return this;
    }

    /**
     * Get managementVipIn
     *
     * @return managementVipIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getManagementVipIn() {
        return managementVipIn;
    }

    public void setManagementVipIn(List<String> managementVipIn) {
        this.managementVipIn = managementVipIn;
    }

    public ClusterWhereInput managementVipIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_IN);
        return this;
    }

    public ClusterWhereInput managementVipIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_IN);
        return this;
    }

    public void setManagementVipIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_IN);
        }
    }

    public boolean getManagementVipIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_VIP_IN);
    }

    public ClusterWhereInput managementVipLt(String managementVipLt) {

        this.managementVipLt = managementVipLt;
        return this;
    }

    /**
     * Get managementVipLt
     *
     * @return managementVipLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementVipLt() {
        return managementVipLt;
    }

    public void setManagementVipLt(String managementVipLt) {
        this.managementVipLt = managementVipLt;
    }

    public ClusterWhereInput managementVipLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_LT);
        return this;
    }

    public ClusterWhereInput managementVipLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_LT);
        return this;
    }

    public void setManagementVipLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_LT);
        }
    }

    public boolean getManagementVipLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_VIP_LT);
    }

    public ClusterWhereInput managementVipLte(String managementVipLte) {

        this.managementVipLte = managementVipLte;
        return this;
    }

    /**
     * Get managementVipLte
     *
     * @return managementVipLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementVipLte() {
        return managementVipLte;
    }

    public void setManagementVipLte(String managementVipLte) {
        this.managementVipLte = managementVipLte;
    }

    public ClusterWhereInput managementVipLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_LTE);
        return this;
    }

    public ClusterWhereInput managementVipLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_LTE);
        return this;
    }

    public void setManagementVipLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_LTE);
        }
    }

    public boolean getManagementVipLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_VIP_LTE);
    }

    public ClusterWhereInput managementVipNot(String managementVipNot) {

        this.managementVipNot = managementVipNot;
        return this;
    }

    /**
     * Get managementVipNot
     *
     * @return managementVipNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementVipNot() {
        return managementVipNot;
    }

    public void setManagementVipNot(String managementVipNot) {
        this.managementVipNot = managementVipNot;
    }

    public ClusterWhereInput managementVipNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_NOT);
        return this;
    }

    public ClusterWhereInput managementVipNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_NOT);
        return this;
    }

    public void setManagementVipNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_NOT);
        }
    }

    public boolean getManagementVipNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_VIP_NOT);
    }

    public ClusterWhereInput managementVipNotContains(String managementVipNotContains) {

        this.managementVipNotContains = managementVipNotContains;
        return this;
    }

    /**
     * Get managementVipNotContains
     *
     * @return managementVipNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementVipNotContains() {
        return managementVipNotContains;
    }

    public void setManagementVipNotContains(String managementVipNotContains) {
        this.managementVipNotContains = managementVipNotContains;
    }

    public ClusterWhereInput managementVipNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_CONTAINS);
        return this;
    }

    public ClusterWhereInput managementVipNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_CONTAINS);
        return this;
    }

    public void setManagementVipNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_CONTAINS);
        }
    }

    public boolean getManagementVipNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_CONTAINS);
    }

    public ClusterWhereInput managementVipNotEndsWith(String managementVipNotEndsWith) {

        this.managementVipNotEndsWith = managementVipNotEndsWith;
        return this;
    }

    /**
     * Get managementVipNotEndsWith
     *
     * @return managementVipNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementVipNotEndsWith() {
        return managementVipNotEndsWith;
    }

    public void setManagementVipNotEndsWith(String managementVipNotEndsWith) {
        this.managementVipNotEndsWith = managementVipNotEndsWith;
    }

    public ClusterWhereInput managementVipNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput managementVipNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_ENDS_WITH);
        return this;
    }

    public void setManagementVipNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_ENDS_WITH);
        }
    }

    public boolean getManagementVipNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_ENDS_WITH);
    }

    public ClusterWhereInput managementVipNotIn(List<String> managementVipNotIn) {

        this.managementVipNotIn = managementVipNotIn;
        return this;
    }

    public ClusterWhereInput addManagementVipNotInItem(String managementVipNotInItem) {
        if (this.managementVipNotIn == null) {
            this.managementVipNotIn = new ArrayList<String>();
        }
        this.managementVipNotIn.add(managementVipNotInItem);
        return this;
    }

    /**
     * Get managementVipNotIn
     *
     * @return managementVipNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getManagementVipNotIn() {
        return managementVipNotIn;
    }

    public void setManagementVipNotIn(List<String> managementVipNotIn) {
        this.managementVipNotIn = managementVipNotIn;
    }

    public ClusterWhereInput managementVipNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_IN);
        return this;
    }

    public ClusterWhereInput managementVipNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_IN);
        return this;
    }

    public void setManagementVipNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_IN);
        }
    }

    public boolean getManagementVipNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_IN);
    }

    public ClusterWhereInput managementVipNotStartsWith(String managementVipNotStartsWith) {

        this.managementVipNotStartsWith = managementVipNotStartsWith;
        return this;
    }

    /**
     * Get managementVipNotStartsWith
     *
     * @return managementVipNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementVipNotStartsWith() {
        return managementVipNotStartsWith;
    }

    public void setManagementVipNotStartsWith(String managementVipNotStartsWith) {
        this.managementVipNotStartsWith = managementVipNotStartsWith;
    }

    public ClusterWhereInput managementVipNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput managementVipNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_STARTS_WITH);
        return this;
    }

    public void setManagementVipNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_STARTS_WITH);
        }
    }

    public boolean getManagementVipNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_VIP_NOT_STARTS_WITH);
    }

    public ClusterWhereInput managementVipStartsWith(String managementVipStartsWith) {

        this.managementVipStartsWith = managementVipStartsWith;
        return this;
    }

    /**
     * Get managementVipStartsWith
     *
     * @return managementVipStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementVipStartsWith() {
        return managementVipStartsWith;
    }

    public void setManagementVipStartsWith(String managementVipStartsWith) {
        this.managementVipStartsWith = managementVipStartsWith;
    }

    public ClusterWhereInput managementVipStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput managementVipStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_STARTS_WITH);
        return this;
    }

    public void setManagementVipStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP_STARTS_WITH);
        }
    }

    public boolean getManagementVipStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_VIP_STARTS_WITH);
    }

    public ClusterWhereInput maxChunkNum(Integer maxChunkNum) {

        this.maxChunkNum = maxChunkNum;
        return this;
    }

    /**
     * Get maxChunkNum
     *
     * @return maxChunkNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxChunkNum() {
        return maxChunkNum;
    }

    public void setMaxChunkNum(Integer maxChunkNum) {
        this.maxChunkNum = maxChunkNum;
    }

    public ClusterWhereInput maxChunkNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM);
        return this;
    }

    public ClusterWhereInput maxChunkNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM);
        return this;
    }

    public void setMaxChunkNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM);
        }
    }

    public boolean getMaxChunkNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CHUNK_NUM);
    }

    public ClusterWhereInput maxChunkNumGt(Integer maxChunkNumGt) {

        this.maxChunkNumGt = maxChunkNumGt;
        return this;
    }

    /**
     * Get maxChunkNumGt
     *
     * @return maxChunkNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxChunkNumGt() {
        return maxChunkNumGt;
    }

    public void setMaxChunkNumGt(Integer maxChunkNumGt) {
        this.maxChunkNumGt = maxChunkNumGt;
    }

    public ClusterWhereInput maxChunkNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_GT);
        return this;
    }

    public ClusterWhereInput maxChunkNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_GT);
        return this;
    }

    public void setMaxChunkNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_GT);
        }
    }

    public boolean getMaxChunkNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CHUNK_NUM_GT);
    }

    public ClusterWhereInput maxChunkNumGte(Integer maxChunkNumGte) {

        this.maxChunkNumGte = maxChunkNumGte;
        return this;
    }

    /**
     * Get maxChunkNumGte
     *
     * @return maxChunkNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxChunkNumGte() {
        return maxChunkNumGte;
    }

    public void setMaxChunkNumGte(Integer maxChunkNumGte) {
        this.maxChunkNumGte = maxChunkNumGte;
    }

    public ClusterWhereInput maxChunkNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_GTE);
        return this;
    }

    public ClusterWhereInput maxChunkNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_GTE);
        return this;
    }

    public void setMaxChunkNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_GTE);
        }
    }

    public boolean getMaxChunkNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CHUNK_NUM_GTE);
    }

    public ClusterWhereInput maxChunkNumIn(List<Integer> maxChunkNumIn) {

        this.maxChunkNumIn = maxChunkNumIn;
        return this;
    }

    public ClusterWhereInput addMaxChunkNumInItem(Integer maxChunkNumInItem) {
        if (this.maxChunkNumIn == null) {
            this.maxChunkNumIn = new ArrayList<Integer>();
        }
        this.maxChunkNumIn.add(maxChunkNumInItem);
        return this;
    }

    /**
     * Get maxChunkNumIn
     *
     * @return maxChunkNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxChunkNumIn() {
        return maxChunkNumIn;
    }

    public void setMaxChunkNumIn(List<Integer> maxChunkNumIn) {
        this.maxChunkNumIn = maxChunkNumIn;
    }

    public ClusterWhereInput maxChunkNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_IN);
        return this;
    }

    public ClusterWhereInput maxChunkNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_IN);
        return this;
    }

    public void setMaxChunkNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_IN);
        }
    }

    public boolean getMaxChunkNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CHUNK_NUM_IN);
    }

    public ClusterWhereInput maxChunkNumLt(Integer maxChunkNumLt) {

        this.maxChunkNumLt = maxChunkNumLt;
        return this;
    }

    /**
     * Get maxChunkNumLt
     *
     * @return maxChunkNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxChunkNumLt() {
        return maxChunkNumLt;
    }

    public void setMaxChunkNumLt(Integer maxChunkNumLt) {
        this.maxChunkNumLt = maxChunkNumLt;
    }

    public ClusterWhereInput maxChunkNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_LT);
        return this;
    }

    public ClusterWhereInput maxChunkNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_LT);
        return this;
    }

    public void setMaxChunkNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_LT);
        }
    }

    public boolean getMaxChunkNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CHUNK_NUM_LT);
    }

    public ClusterWhereInput maxChunkNumLte(Integer maxChunkNumLte) {

        this.maxChunkNumLte = maxChunkNumLte;
        return this;
    }

    /**
     * Get maxChunkNumLte
     *
     * @return maxChunkNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxChunkNumLte() {
        return maxChunkNumLte;
    }

    public void setMaxChunkNumLte(Integer maxChunkNumLte) {
        this.maxChunkNumLte = maxChunkNumLte;
    }

    public ClusterWhereInput maxChunkNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_LTE);
        return this;
    }

    public ClusterWhereInput maxChunkNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_LTE);
        return this;
    }

    public void setMaxChunkNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_LTE);
        }
    }

    public boolean getMaxChunkNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CHUNK_NUM_LTE);
    }

    public ClusterWhereInput maxChunkNumNot(Integer maxChunkNumNot) {

        this.maxChunkNumNot = maxChunkNumNot;
        return this;
    }

    /**
     * Get maxChunkNumNot
     *
     * @return maxChunkNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxChunkNumNot() {
        return maxChunkNumNot;
    }

    public void setMaxChunkNumNot(Integer maxChunkNumNot) {
        this.maxChunkNumNot = maxChunkNumNot;
    }

    public ClusterWhereInput maxChunkNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT);
        return this;
    }

    public ClusterWhereInput maxChunkNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT);
        return this;
    }

    public void setMaxChunkNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT);
        }
    }

    public boolean getMaxChunkNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT);
    }

    public ClusterWhereInput maxChunkNumNotIn(List<Integer> maxChunkNumNotIn) {

        this.maxChunkNumNotIn = maxChunkNumNotIn;
        return this;
    }

    public ClusterWhereInput addMaxChunkNumNotInItem(Integer maxChunkNumNotInItem) {
        if (this.maxChunkNumNotIn == null) {
            this.maxChunkNumNotIn = new ArrayList<Integer>();
        }
        this.maxChunkNumNotIn.add(maxChunkNumNotInItem);
        return this;
    }

    /**
     * Get maxChunkNumNotIn
     *
     * @return maxChunkNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxChunkNumNotIn() {
        return maxChunkNumNotIn;
    }

    public void setMaxChunkNumNotIn(List<Integer> maxChunkNumNotIn) {
        this.maxChunkNumNotIn = maxChunkNumNotIn;
    }

    public ClusterWhereInput maxChunkNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT_IN);
        return this;
    }

    public ClusterWhereInput maxChunkNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT_IN);
        return this;
    }

    public void setMaxChunkNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT_IN);
        }
    }

    public boolean getMaxChunkNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT_IN);
    }

    public ClusterWhereInput maxPhysicalDataCapacity(Long maxPhysicalDataCapacity) {

        this.maxPhysicalDataCapacity = maxPhysicalDataCapacity;
        return this;
    }

    /**
     * Get maxPhysicalDataCapacity
     *
     * @return maxPhysicalDataCapacity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxPhysicalDataCapacity() {
        return maxPhysicalDataCapacity;
    }

    public void setMaxPhysicalDataCapacity(Long maxPhysicalDataCapacity) {
        this.maxPhysicalDataCapacity = maxPhysicalDataCapacity;
    }

    public ClusterWhereInput maxPhysicalDataCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY);
        return this;
    }

    public ClusterWhereInput maxPhysicalDataCapacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY);
        return this;
    }

    public void setMaxPhysicalDataCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY);
        }
    }

    public boolean getMaxPhysicalDataCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY);
    }

    public ClusterWhereInput maxPhysicalDataCapacityGt(Long maxPhysicalDataCapacityGt) {

        this.maxPhysicalDataCapacityGt = maxPhysicalDataCapacityGt;
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityGt
     *
     * @return maxPhysicalDataCapacityGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxPhysicalDataCapacityGt() {
        return maxPhysicalDataCapacityGt;
    }

    public void setMaxPhysicalDataCapacityGt(Long maxPhysicalDataCapacityGt) {
        this.maxPhysicalDataCapacityGt = maxPhysicalDataCapacityGt;
    }

    public ClusterWhereInput maxPhysicalDataCapacityGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GT);
        return this;
    }

    public ClusterWhereInput maxPhysicalDataCapacityGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GT);
        return this;
    }

    public void setMaxPhysicalDataCapacityGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GT);
        }
    }

    public boolean getMaxPhysicalDataCapacityGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GT);
    }

    public ClusterWhereInput maxPhysicalDataCapacityGte(Long maxPhysicalDataCapacityGte) {

        this.maxPhysicalDataCapacityGte = maxPhysicalDataCapacityGte;
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityGte
     *
     * @return maxPhysicalDataCapacityGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxPhysicalDataCapacityGte() {
        return maxPhysicalDataCapacityGte;
    }

    public void setMaxPhysicalDataCapacityGte(Long maxPhysicalDataCapacityGte) {
        this.maxPhysicalDataCapacityGte = maxPhysicalDataCapacityGte;
    }

    public ClusterWhereInput maxPhysicalDataCapacityGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GTE);
        return this;
    }

    public ClusterWhereInput maxPhysicalDataCapacityGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GTE);
        return this;
    }

    public void setMaxPhysicalDataCapacityGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GTE);
        }
    }

    public boolean getMaxPhysicalDataCapacityGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GTE);
    }

    public ClusterWhereInput maxPhysicalDataCapacityIn(List<Long> maxPhysicalDataCapacityIn) {

        this.maxPhysicalDataCapacityIn = maxPhysicalDataCapacityIn;
        return this;
    }

    public ClusterWhereInput addMaxPhysicalDataCapacityInItem(Long maxPhysicalDataCapacityInItem) {
        if (this.maxPhysicalDataCapacityIn == null) {
            this.maxPhysicalDataCapacityIn = new ArrayList<Long>();
        }
        this.maxPhysicalDataCapacityIn.add(maxPhysicalDataCapacityInItem);
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityIn
     *
     * @return maxPhysicalDataCapacityIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getMaxPhysicalDataCapacityIn() {
        return maxPhysicalDataCapacityIn;
    }

    public void setMaxPhysicalDataCapacityIn(List<Long> maxPhysicalDataCapacityIn) {
        this.maxPhysicalDataCapacityIn = maxPhysicalDataCapacityIn;
    }

    public ClusterWhereInput maxPhysicalDataCapacityIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_IN);
        return this;
    }

    public ClusterWhereInput maxPhysicalDataCapacityIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_IN);
        return this;
    }

    public void setMaxPhysicalDataCapacityIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_IN);
        }
    }

    public boolean getMaxPhysicalDataCapacityIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_IN);
    }

    public ClusterWhereInput maxPhysicalDataCapacityLt(Long maxPhysicalDataCapacityLt) {

        this.maxPhysicalDataCapacityLt = maxPhysicalDataCapacityLt;
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityLt
     *
     * @return maxPhysicalDataCapacityLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxPhysicalDataCapacityLt() {
        return maxPhysicalDataCapacityLt;
    }

    public void setMaxPhysicalDataCapacityLt(Long maxPhysicalDataCapacityLt) {
        this.maxPhysicalDataCapacityLt = maxPhysicalDataCapacityLt;
    }

    public ClusterWhereInput maxPhysicalDataCapacityLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LT);
        return this;
    }

    public ClusterWhereInput maxPhysicalDataCapacityLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LT);
        return this;
    }

    public void setMaxPhysicalDataCapacityLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LT);
        }
    }

    public boolean getMaxPhysicalDataCapacityLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LT);
    }

    public ClusterWhereInput maxPhysicalDataCapacityLte(Long maxPhysicalDataCapacityLte) {

        this.maxPhysicalDataCapacityLte = maxPhysicalDataCapacityLte;
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityLte
     *
     * @return maxPhysicalDataCapacityLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxPhysicalDataCapacityLte() {
        return maxPhysicalDataCapacityLte;
    }

    public void setMaxPhysicalDataCapacityLte(Long maxPhysicalDataCapacityLte) {
        this.maxPhysicalDataCapacityLte = maxPhysicalDataCapacityLte;
    }

    public ClusterWhereInput maxPhysicalDataCapacityLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LTE);
        return this;
    }

    public ClusterWhereInput maxPhysicalDataCapacityLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LTE);
        return this;
    }

    public void setMaxPhysicalDataCapacityLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LTE);
        }
    }

    public boolean getMaxPhysicalDataCapacityLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LTE);
    }

    public ClusterWhereInput maxPhysicalDataCapacityNot(Long maxPhysicalDataCapacityNot) {

        this.maxPhysicalDataCapacityNot = maxPhysicalDataCapacityNot;
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityNot
     *
     * @return maxPhysicalDataCapacityNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxPhysicalDataCapacityNot() {
        return maxPhysicalDataCapacityNot;
    }

    public void setMaxPhysicalDataCapacityNot(Long maxPhysicalDataCapacityNot) {
        this.maxPhysicalDataCapacityNot = maxPhysicalDataCapacityNot;
    }

    public ClusterWhereInput maxPhysicalDataCapacityNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT);
        return this;
    }

    public ClusterWhereInput maxPhysicalDataCapacityNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT);
        return this;
    }

    public void setMaxPhysicalDataCapacityNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT);
        }
    }

    public boolean getMaxPhysicalDataCapacityNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT);
    }

    public ClusterWhereInput maxPhysicalDataCapacityNotIn(List<Long> maxPhysicalDataCapacityNotIn) {

        this.maxPhysicalDataCapacityNotIn = maxPhysicalDataCapacityNotIn;
        return this;
    }

    public ClusterWhereInput addMaxPhysicalDataCapacityNotInItem(
            Long maxPhysicalDataCapacityNotInItem) {
        if (this.maxPhysicalDataCapacityNotIn == null) {
            this.maxPhysicalDataCapacityNotIn = new ArrayList<Long>();
        }
        this.maxPhysicalDataCapacityNotIn.add(maxPhysicalDataCapacityNotInItem);
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityNotIn
     *
     * @return maxPhysicalDataCapacityNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getMaxPhysicalDataCapacityNotIn() {
        return maxPhysicalDataCapacityNotIn;
    }

    public void setMaxPhysicalDataCapacityNotIn(List<Long> maxPhysicalDataCapacityNotIn) {
        this.maxPhysicalDataCapacityNotIn = maxPhysicalDataCapacityNotIn;
    }

    public ClusterWhereInput maxPhysicalDataCapacityNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT_IN);
        return this;
    }

    public ClusterWhereInput maxPhysicalDataCapacityNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT_IN);
        return this;
    }

    public void setMaxPhysicalDataCapacityNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT_IN);
        }
    }

    public boolean getMaxPhysicalDataCapacityNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT_IN);
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNode(Long maxPhysicalDataCapacityPerNode) {

        this.maxPhysicalDataCapacityPerNode = maxPhysicalDataCapacityPerNode;
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityPerNode
     *
     * @return maxPhysicalDataCapacityPerNode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxPhysicalDataCapacityPerNode() {
        return maxPhysicalDataCapacityPerNode;
    }

    public void setMaxPhysicalDataCapacityPerNode(Long maxPhysicalDataCapacityPerNode) {
        this.maxPhysicalDataCapacityPerNode = maxPhysicalDataCapacityPerNode;
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE);
        return this;
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE);
        return this;
    }

    public void setMaxPhysicalDataCapacityPerNode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE);
        }
    }

    public boolean getMaxPhysicalDataCapacityPerNode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE);
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeGt(
            Long maxPhysicalDataCapacityPerNodeGt) {

        this.maxPhysicalDataCapacityPerNodeGt = maxPhysicalDataCapacityPerNodeGt;
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityPerNodeGt
     *
     * @return maxPhysicalDataCapacityPerNodeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxPhysicalDataCapacityPerNodeGt() {
        return maxPhysicalDataCapacityPerNodeGt;
    }

    public void setMaxPhysicalDataCapacityPerNodeGt(Long maxPhysicalDataCapacityPerNodeGt) {
        this.maxPhysicalDataCapacityPerNodeGt = maxPhysicalDataCapacityPerNodeGt;
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_GT);
        return this;
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_GT);
        return this;
    }

    public void setMaxPhysicalDataCapacityPerNodeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_GT);
        }
    }

    public boolean getMaxPhysicalDataCapacityPerNodeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_GT);
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeGte(
            Long maxPhysicalDataCapacityPerNodeGte) {

        this.maxPhysicalDataCapacityPerNodeGte = maxPhysicalDataCapacityPerNodeGte;
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityPerNodeGte
     *
     * @return maxPhysicalDataCapacityPerNodeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxPhysicalDataCapacityPerNodeGte() {
        return maxPhysicalDataCapacityPerNodeGte;
    }

    public void setMaxPhysicalDataCapacityPerNodeGte(Long maxPhysicalDataCapacityPerNodeGte) {
        this.maxPhysicalDataCapacityPerNodeGte = maxPhysicalDataCapacityPerNodeGte;
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_GTE);
        return this;
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_GTE);
        return this;
    }

    public void setMaxPhysicalDataCapacityPerNodeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_GTE);
        }
    }

    public boolean getMaxPhysicalDataCapacityPerNodeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_GTE);
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeIn(
            List<Long> maxPhysicalDataCapacityPerNodeIn) {

        this.maxPhysicalDataCapacityPerNodeIn = maxPhysicalDataCapacityPerNodeIn;
        return this;
    }

    public ClusterWhereInput addMaxPhysicalDataCapacityPerNodeInItem(
            Long maxPhysicalDataCapacityPerNodeInItem) {
        if (this.maxPhysicalDataCapacityPerNodeIn == null) {
            this.maxPhysicalDataCapacityPerNodeIn = new ArrayList<Long>();
        }
        this.maxPhysicalDataCapacityPerNodeIn.add(maxPhysicalDataCapacityPerNodeInItem);
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityPerNodeIn
     *
     * @return maxPhysicalDataCapacityPerNodeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getMaxPhysicalDataCapacityPerNodeIn() {
        return maxPhysicalDataCapacityPerNodeIn;
    }

    public void setMaxPhysicalDataCapacityPerNodeIn(List<Long> maxPhysicalDataCapacityPerNodeIn) {
        this.maxPhysicalDataCapacityPerNodeIn = maxPhysicalDataCapacityPerNodeIn;
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_IN);
        return this;
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_IN);
        return this;
    }

    public void setMaxPhysicalDataCapacityPerNodeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_IN);
        }
    }

    public boolean getMaxPhysicalDataCapacityPerNodeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_IN);
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeLt(
            Long maxPhysicalDataCapacityPerNodeLt) {

        this.maxPhysicalDataCapacityPerNodeLt = maxPhysicalDataCapacityPerNodeLt;
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityPerNodeLt
     *
     * @return maxPhysicalDataCapacityPerNodeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxPhysicalDataCapacityPerNodeLt() {
        return maxPhysicalDataCapacityPerNodeLt;
    }

    public void setMaxPhysicalDataCapacityPerNodeLt(Long maxPhysicalDataCapacityPerNodeLt) {
        this.maxPhysicalDataCapacityPerNodeLt = maxPhysicalDataCapacityPerNodeLt;
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_LT);
        return this;
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_LT);
        return this;
    }

    public void setMaxPhysicalDataCapacityPerNodeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_LT);
        }
    }

    public boolean getMaxPhysicalDataCapacityPerNodeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_LT);
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeLte(
            Long maxPhysicalDataCapacityPerNodeLte) {

        this.maxPhysicalDataCapacityPerNodeLte = maxPhysicalDataCapacityPerNodeLte;
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityPerNodeLte
     *
     * @return maxPhysicalDataCapacityPerNodeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxPhysicalDataCapacityPerNodeLte() {
        return maxPhysicalDataCapacityPerNodeLte;
    }

    public void setMaxPhysicalDataCapacityPerNodeLte(Long maxPhysicalDataCapacityPerNodeLte) {
        this.maxPhysicalDataCapacityPerNodeLte = maxPhysicalDataCapacityPerNodeLte;
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_LTE);
        return this;
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_LTE);
        return this;
    }

    public void setMaxPhysicalDataCapacityPerNodeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_LTE);
        }
    }

    public boolean getMaxPhysicalDataCapacityPerNodeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_LTE);
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeNot(
            Long maxPhysicalDataCapacityPerNodeNot) {

        this.maxPhysicalDataCapacityPerNodeNot = maxPhysicalDataCapacityPerNodeNot;
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityPerNodeNot
     *
     * @return maxPhysicalDataCapacityPerNodeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxPhysicalDataCapacityPerNodeNot() {
        return maxPhysicalDataCapacityPerNodeNot;
    }

    public void setMaxPhysicalDataCapacityPerNodeNot(Long maxPhysicalDataCapacityPerNodeNot) {
        this.maxPhysicalDataCapacityPerNodeNot = maxPhysicalDataCapacityPerNodeNot;
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_NOT);
        return this;
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_NOT);
        return this;
    }

    public void setMaxPhysicalDataCapacityPerNodeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_NOT);
        }
    }

    public boolean getMaxPhysicalDataCapacityPerNodeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_NOT);
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeNotIn(
            List<Long> maxPhysicalDataCapacityPerNodeNotIn) {

        this.maxPhysicalDataCapacityPerNodeNotIn = maxPhysicalDataCapacityPerNodeNotIn;
        return this;
    }

    public ClusterWhereInput addMaxPhysicalDataCapacityPerNodeNotInItem(
            Long maxPhysicalDataCapacityPerNodeNotInItem) {
        if (this.maxPhysicalDataCapacityPerNodeNotIn == null) {
            this.maxPhysicalDataCapacityPerNodeNotIn = new ArrayList<Long>();
        }
        this.maxPhysicalDataCapacityPerNodeNotIn.add(maxPhysicalDataCapacityPerNodeNotInItem);
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityPerNodeNotIn
     *
     * @return maxPhysicalDataCapacityPerNodeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getMaxPhysicalDataCapacityPerNodeNotIn() {
        return maxPhysicalDataCapacityPerNodeNotIn;
    }

    public void setMaxPhysicalDataCapacityPerNodeNotIn(
            List<Long> maxPhysicalDataCapacityPerNodeNotIn) {
        this.maxPhysicalDataCapacityPerNodeNotIn = maxPhysicalDataCapacityPerNodeNotIn;
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_NOT_IN);
        return this;
    }

    public ClusterWhereInput maxPhysicalDataCapacityPerNodeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_NOT_IN);
        return this;
    }

    public void setMaxPhysicalDataCapacityPerNodeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_NOT_IN);
        }
    }

    public boolean getMaxPhysicalDataCapacityPerNodeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_NOT_IN);
    }

    public ClusterWhereInput mgtGateway(String mgtGateway) {

        this.mgtGateway = mgtGateway;
        return this;
    }

    /**
     * Get mgtGateway
     *
     * @return mgtGateway
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtGateway() {
        return mgtGateway;
    }

    public void setMgtGateway(String mgtGateway) {
        this.mgtGateway = mgtGateway;
    }

    public ClusterWhereInput mgtGateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY);
        return this;
    }

    public ClusterWhereInput mgtGateway_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY);
        return this;
    }

    public void setMgtGateway_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY);
        }
    }

    public boolean getMgtGateway_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_GATEWAY);
    }

    public ClusterWhereInput mgtGatewayContains(String mgtGatewayContains) {

        this.mgtGatewayContains = mgtGatewayContains;
        return this;
    }

    /**
     * Get mgtGatewayContains
     *
     * @return mgtGatewayContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtGatewayContains() {
        return mgtGatewayContains;
    }

    public void setMgtGatewayContains(String mgtGatewayContains) {
        this.mgtGatewayContains = mgtGatewayContains;
    }

    public ClusterWhereInput mgtGatewayContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_CONTAINS);
        return this;
    }

    public ClusterWhereInput mgtGatewayContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_CONTAINS);
        return this;
    }

    public void setMgtGatewayContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_CONTAINS);
        }
    }

    public boolean getMgtGatewayContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_GATEWAY_CONTAINS);
    }

    public ClusterWhereInput mgtGatewayEndsWith(String mgtGatewayEndsWith) {

        this.mgtGatewayEndsWith = mgtGatewayEndsWith;
        return this;
    }

    /**
     * Get mgtGatewayEndsWith
     *
     * @return mgtGatewayEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtGatewayEndsWith() {
        return mgtGatewayEndsWith;
    }

    public void setMgtGatewayEndsWith(String mgtGatewayEndsWith) {
        this.mgtGatewayEndsWith = mgtGatewayEndsWith;
    }

    public ClusterWhereInput mgtGatewayEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput mgtGatewayEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_ENDS_WITH);
        return this;
    }

    public void setMgtGatewayEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_ENDS_WITH);
        }
    }

    public boolean getMgtGatewayEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_GATEWAY_ENDS_WITH);
    }

    public ClusterWhereInput mgtGatewayGt(String mgtGatewayGt) {

        this.mgtGatewayGt = mgtGatewayGt;
        return this;
    }

    /**
     * Get mgtGatewayGt
     *
     * @return mgtGatewayGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtGatewayGt() {
        return mgtGatewayGt;
    }

    public void setMgtGatewayGt(String mgtGatewayGt) {
        this.mgtGatewayGt = mgtGatewayGt;
    }

    public ClusterWhereInput mgtGatewayGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_GT);
        return this;
    }

    public ClusterWhereInput mgtGatewayGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_GT);
        return this;
    }

    public void setMgtGatewayGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_GT);
        }
    }

    public boolean getMgtGatewayGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_GATEWAY_GT);
    }

    public ClusterWhereInput mgtGatewayGte(String mgtGatewayGte) {

        this.mgtGatewayGte = mgtGatewayGte;
        return this;
    }

    /**
     * Get mgtGatewayGte
     *
     * @return mgtGatewayGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtGatewayGte() {
        return mgtGatewayGte;
    }

    public void setMgtGatewayGte(String mgtGatewayGte) {
        this.mgtGatewayGte = mgtGatewayGte;
    }

    public ClusterWhereInput mgtGatewayGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_GTE);
        return this;
    }

    public ClusterWhereInput mgtGatewayGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_GTE);
        return this;
    }

    public void setMgtGatewayGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_GTE);
        }
    }

    public boolean getMgtGatewayGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_GATEWAY_GTE);
    }

    public ClusterWhereInput mgtGatewayIn(List<String> mgtGatewayIn) {

        this.mgtGatewayIn = mgtGatewayIn;
        return this;
    }

    public ClusterWhereInput addMgtGatewayInItem(String mgtGatewayInItem) {
        if (this.mgtGatewayIn == null) {
            this.mgtGatewayIn = new ArrayList<String>();
        }
        this.mgtGatewayIn.add(mgtGatewayInItem);
        return this;
    }

    /**
     * Get mgtGatewayIn
     *
     * @return mgtGatewayIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMgtGatewayIn() {
        return mgtGatewayIn;
    }

    public void setMgtGatewayIn(List<String> mgtGatewayIn) {
        this.mgtGatewayIn = mgtGatewayIn;
    }

    public ClusterWhereInput mgtGatewayIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_IN);
        return this;
    }

    public ClusterWhereInput mgtGatewayIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_IN);
        return this;
    }

    public void setMgtGatewayIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_IN);
        }
    }

    public boolean getMgtGatewayIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_GATEWAY_IN);
    }

    public ClusterWhereInput mgtGatewayLt(String mgtGatewayLt) {

        this.mgtGatewayLt = mgtGatewayLt;
        return this;
    }

    /**
     * Get mgtGatewayLt
     *
     * @return mgtGatewayLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtGatewayLt() {
        return mgtGatewayLt;
    }

    public void setMgtGatewayLt(String mgtGatewayLt) {
        this.mgtGatewayLt = mgtGatewayLt;
    }

    public ClusterWhereInput mgtGatewayLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_LT);
        return this;
    }

    public ClusterWhereInput mgtGatewayLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_LT);
        return this;
    }

    public void setMgtGatewayLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_LT);
        }
    }

    public boolean getMgtGatewayLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_GATEWAY_LT);
    }

    public ClusterWhereInput mgtGatewayLte(String mgtGatewayLte) {

        this.mgtGatewayLte = mgtGatewayLte;
        return this;
    }

    /**
     * Get mgtGatewayLte
     *
     * @return mgtGatewayLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtGatewayLte() {
        return mgtGatewayLte;
    }

    public void setMgtGatewayLte(String mgtGatewayLte) {
        this.mgtGatewayLte = mgtGatewayLte;
    }

    public ClusterWhereInput mgtGatewayLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_LTE);
        return this;
    }

    public ClusterWhereInput mgtGatewayLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_LTE);
        return this;
    }

    public void setMgtGatewayLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_LTE);
        }
    }

    public boolean getMgtGatewayLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_GATEWAY_LTE);
    }

    public ClusterWhereInput mgtGatewayNot(String mgtGatewayNot) {

        this.mgtGatewayNot = mgtGatewayNot;
        return this;
    }

    /**
     * Get mgtGatewayNot
     *
     * @return mgtGatewayNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtGatewayNot() {
        return mgtGatewayNot;
    }

    public void setMgtGatewayNot(String mgtGatewayNot) {
        this.mgtGatewayNot = mgtGatewayNot;
    }

    public ClusterWhereInput mgtGatewayNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_NOT);
        return this;
    }

    public ClusterWhereInput mgtGatewayNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_NOT);
        return this;
    }

    public void setMgtGatewayNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_NOT);
        }
    }

    public boolean getMgtGatewayNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_GATEWAY_NOT);
    }

    public ClusterWhereInput mgtGatewayNotContains(String mgtGatewayNotContains) {

        this.mgtGatewayNotContains = mgtGatewayNotContains;
        return this;
    }

    /**
     * Get mgtGatewayNotContains
     *
     * @return mgtGatewayNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtGatewayNotContains() {
        return mgtGatewayNotContains;
    }

    public void setMgtGatewayNotContains(String mgtGatewayNotContains) {
        this.mgtGatewayNotContains = mgtGatewayNotContains;
    }

    public ClusterWhereInput mgtGatewayNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_NOT_CONTAINS);
        return this;
    }

    public ClusterWhereInput mgtGatewayNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_NOT_CONTAINS);
        return this;
    }

    public void setMgtGatewayNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_NOT_CONTAINS);
        }
    }

    public boolean getMgtGatewayNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_GATEWAY_NOT_CONTAINS);
    }

    public ClusterWhereInput mgtGatewayNotEndsWith(String mgtGatewayNotEndsWith) {

        this.mgtGatewayNotEndsWith = mgtGatewayNotEndsWith;
        return this;
    }

    /**
     * Get mgtGatewayNotEndsWith
     *
     * @return mgtGatewayNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtGatewayNotEndsWith() {
        return mgtGatewayNotEndsWith;
    }

    public void setMgtGatewayNotEndsWith(String mgtGatewayNotEndsWith) {
        this.mgtGatewayNotEndsWith = mgtGatewayNotEndsWith;
    }

    public ClusterWhereInput mgtGatewayNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_NOT_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput mgtGatewayNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_NOT_ENDS_WITH);
        return this;
    }

    public void setMgtGatewayNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_NOT_ENDS_WITH);
        }
    }

    public boolean getMgtGatewayNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_GATEWAY_NOT_ENDS_WITH);
    }

    public ClusterWhereInput mgtGatewayNotIn(List<String> mgtGatewayNotIn) {

        this.mgtGatewayNotIn = mgtGatewayNotIn;
        return this;
    }

    public ClusterWhereInput addMgtGatewayNotInItem(String mgtGatewayNotInItem) {
        if (this.mgtGatewayNotIn == null) {
            this.mgtGatewayNotIn = new ArrayList<String>();
        }
        this.mgtGatewayNotIn.add(mgtGatewayNotInItem);
        return this;
    }

    /**
     * Get mgtGatewayNotIn
     *
     * @return mgtGatewayNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMgtGatewayNotIn() {
        return mgtGatewayNotIn;
    }

    public void setMgtGatewayNotIn(List<String> mgtGatewayNotIn) {
        this.mgtGatewayNotIn = mgtGatewayNotIn;
    }

    public ClusterWhereInput mgtGatewayNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_NOT_IN);
        return this;
    }

    public ClusterWhereInput mgtGatewayNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_NOT_IN);
        return this;
    }

    public void setMgtGatewayNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_NOT_IN);
        }
    }

    public boolean getMgtGatewayNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_GATEWAY_NOT_IN);
    }

    public ClusterWhereInput mgtGatewayNotStartsWith(String mgtGatewayNotStartsWith) {

        this.mgtGatewayNotStartsWith = mgtGatewayNotStartsWith;
        return this;
    }

    /**
     * Get mgtGatewayNotStartsWith
     *
     * @return mgtGatewayNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtGatewayNotStartsWith() {
        return mgtGatewayNotStartsWith;
    }

    public void setMgtGatewayNotStartsWith(String mgtGatewayNotStartsWith) {
        this.mgtGatewayNotStartsWith = mgtGatewayNotStartsWith;
    }

    public ClusterWhereInput mgtGatewayNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_NOT_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput mgtGatewayNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_NOT_STARTS_WITH);
        return this;
    }

    public void setMgtGatewayNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_NOT_STARTS_WITH);
        }
    }

    public boolean getMgtGatewayNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_GATEWAY_NOT_STARTS_WITH);
    }

    public ClusterWhereInput mgtGatewayStartsWith(String mgtGatewayStartsWith) {

        this.mgtGatewayStartsWith = mgtGatewayStartsWith;
        return this;
    }

    /**
     * Get mgtGatewayStartsWith
     *
     * @return mgtGatewayStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtGatewayStartsWith() {
        return mgtGatewayStartsWith;
    }

    public void setMgtGatewayStartsWith(String mgtGatewayStartsWith) {
        this.mgtGatewayStartsWith = mgtGatewayStartsWith;
    }

    public ClusterWhereInput mgtGatewayStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput mgtGatewayStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_STARTS_WITH);
        return this;
    }

    public void setMgtGatewayStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY_STARTS_WITH);
        }
    }

    public boolean getMgtGatewayStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_GATEWAY_STARTS_WITH);
    }

    public ClusterWhereInput mgtNetmask(String mgtNetmask) {

        this.mgtNetmask = mgtNetmask;
        return this;
    }

    /**
     * Get mgtNetmask
     *
     * @return mgtNetmask
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtNetmask() {
        return mgtNetmask;
    }

    public void setMgtNetmask(String mgtNetmask) {
        this.mgtNetmask = mgtNetmask;
    }

    public ClusterWhereInput mgtNetmask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK);
        return this;
    }

    public ClusterWhereInput mgtNetmask_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK);
        return this;
    }

    public void setMgtNetmask_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK);
        }
    }

    public boolean getMgtNetmask_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_NETMASK);
    }

    public ClusterWhereInput mgtNetmaskContains(String mgtNetmaskContains) {

        this.mgtNetmaskContains = mgtNetmaskContains;
        return this;
    }

    /**
     * Get mgtNetmaskContains
     *
     * @return mgtNetmaskContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtNetmaskContains() {
        return mgtNetmaskContains;
    }

    public void setMgtNetmaskContains(String mgtNetmaskContains) {
        this.mgtNetmaskContains = mgtNetmaskContains;
    }

    public ClusterWhereInput mgtNetmaskContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_CONTAINS);
        return this;
    }

    public ClusterWhereInput mgtNetmaskContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_CONTAINS);
        return this;
    }

    public void setMgtNetmaskContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_CONTAINS);
        }
    }

    public boolean getMgtNetmaskContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_NETMASK_CONTAINS);
    }

    public ClusterWhereInput mgtNetmaskEndsWith(String mgtNetmaskEndsWith) {

        this.mgtNetmaskEndsWith = mgtNetmaskEndsWith;
        return this;
    }

    /**
     * Get mgtNetmaskEndsWith
     *
     * @return mgtNetmaskEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtNetmaskEndsWith() {
        return mgtNetmaskEndsWith;
    }

    public void setMgtNetmaskEndsWith(String mgtNetmaskEndsWith) {
        this.mgtNetmaskEndsWith = mgtNetmaskEndsWith;
    }

    public ClusterWhereInput mgtNetmaskEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput mgtNetmaskEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_ENDS_WITH);
        return this;
    }

    public void setMgtNetmaskEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_ENDS_WITH);
        }
    }

    public boolean getMgtNetmaskEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_NETMASK_ENDS_WITH);
    }

    public ClusterWhereInput mgtNetmaskGt(String mgtNetmaskGt) {

        this.mgtNetmaskGt = mgtNetmaskGt;
        return this;
    }

    /**
     * Get mgtNetmaskGt
     *
     * @return mgtNetmaskGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtNetmaskGt() {
        return mgtNetmaskGt;
    }

    public void setMgtNetmaskGt(String mgtNetmaskGt) {
        this.mgtNetmaskGt = mgtNetmaskGt;
    }

    public ClusterWhereInput mgtNetmaskGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_GT);
        return this;
    }

    public ClusterWhereInput mgtNetmaskGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_GT);
        return this;
    }

    public void setMgtNetmaskGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_GT);
        }
    }

    public boolean getMgtNetmaskGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_NETMASK_GT);
    }

    public ClusterWhereInput mgtNetmaskGte(String mgtNetmaskGte) {

        this.mgtNetmaskGte = mgtNetmaskGte;
        return this;
    }

    /**
     * Get mgtNetmaskGte
     *
     * @return mgtNetmaskGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtNetmaskGte() {
        return mgtNetmaskGte;
    }

    public void setMgtNetmaskGte(String mgtNetmaskGte) {
        this.mgtNetmaskGte = mgtNetmaskGte;
    }

    public ClusterWhereInput mgtNetmaskGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_GTE);
        return this;
    }

    public ClusterWhereInput mgtNetmaskGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_GTE);
        return this;
    }

    public void setMgtNetmaskGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_GTE);
        }
    }

    public boolean getMgtNetmaskGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_NETMASK_GTE);
    }

    public ClusterWhereInput mgtNetmaskIn(List<String> mgtNetmaskIn) {

        this.mgtNetmaskIn = mgtNetmaskIn;
        return this;
    }

    public ClusterWhereInput addMgtNetmaskInItem(String mgtNetmaskInItem) {
        if (this.mgtNetmaskIn == null) {
            this.mgtNetmaskIn = new ArrayList<String>();
        }
        this.mgtNetmaskIn.add(mgtNetmaskInItem);
        return this;
    }

    /**
     * Get mgtNetmaskIn
     *
     * @return mgtNetmaskIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMgtNetmaskIn() {
        return mgtNetmaskIn;
    }

    public void setMgtNetmaskIn(List<String> mgtNetmaskIn) {
        this.mgtNetmaskIn = mgtNetmaskIn;
    }

    public ClusterWhereInput mgtNetmaskIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_IN);
        return this;
    }

    public ClusterWhereInput mgtNetmaskIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_IN);
        return this;
    }

    public void setMgtNetmaskIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_IN);
        }
    }

    public boolean getMgtNetmaskIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_NETMASK_IN);
    }

    public ClusterWhereInput mgtNetmaskLt(String mgtNetmaskLt) {

        this.mgtNetmaskLt = mgtNetmaskLt;
        return this;
    }

    /**
     * Get mgtNetmaskLt
     *
     * @return mgtNetmaskLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtNetmaskLt() {
        return mgtNetmaskLt;
    }

    public void setMgtNetmaskLt(String mgtNetmaskLt) {
        this.mgtNetmaskLt = mgtNetmaskLt;
    }

    public ClusterWhereInput mgtNetmaskLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_LT);
        return this;
    }

    public ClusterWhereInput mgtNetmaskLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_LT);
        return this;
    }

    public void setMgtNetmaskLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_LT);
        }
    }

    public boolean getMgtNetmaskLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_NETMASK_LT);
    }

    public ClusterWhereInput mgtNetmaskLte(String mgtNetmaskLte) {

        this.mgtNetmaskLte = mgtNetmaskLte;
        return this;
    }

    /**
     * Get mgtNetmaskLte
     *
     * @return mgtNetmaskLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtNetmaskLte() {
        return mgtNetmaskLte;
    }

    public void setMgtNetmaskLte(String mgtNetmaskLte) {
        this.mgtNetmaskLte = mgtNetmaskLte;
    }

    public ClusterWhereInput mgtNetmaskLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_LTE);
        return this;
    }

    public ClusterWhereInput mgtNetmaskLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_LTE);
        return this;
    }

    public void setMgtNetmaskLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_LTE);
        }
    }

    public boolean getMgtNetmaskLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_NETMASK_LTE);
    }

    public ClusterWhereInput mgtNetmaskNot(String mgtNetmaskNot) {

        this.mgtNetmaskNot = mgtNetmaskNot;
        return this;
    }

    /**
     * Get mgtNetmaskNot
     *
     * @return mgtNetmaskNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtNetmaskNot() {
        return mgtNetmaskNot;
    }

    public void setMgtNetmaskNot(String mgtNetmaskNot) {
        this.mgtNetmaskNot = mgtNetmaskNot;
    }

    public ClusterWhereInput mgtNetmaskNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_NOT);
        return this;
    }

    public ClusterWhereInput mgtNetmaskNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_NOT);
        return this;
    }

    public void setMgtNetmaskNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_NOT);
        }
    }

    public boolean getMgtNetmaskNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_NETMASK_NOT);
    }

    public ClusterWhereInput mgtNetmaskNotContains(String mgtNetmaskNotContains) {

        this.mgtNetmaskNotContains = mgtNetmaskNotContains;
        return this;
    }

    /**
     * Get mgtNetmaskNotContains
     *
     * @return mgtNetmaskNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtNetmaskNotContains() {
        return mgtNetmaskNotContains;
    }

    public void setMgtNetmaskNotContains(String mgtNetmaskNotContains) {
        this.mgtNetmaskNotContains = mgtNetmaskNotContains;
    }

    public ClusterWhereInput mgtNetmaskNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_NOT_CONTAINS);
        return this;
    }

    public ClusterWhereInput mgtNetmaskNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_NOT_CONTAINS);
        return this;
    }

    public void setMgtNetmaskNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_NOT_CONTAINS);
        }
    }

    public boolean getMgtNetmaskNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_NETMASK_NOT_CONTAINS);
    }

    public ClusterWhereInput mgtNetmaskNotEndsWith(String mgtNetmaskNotEndsWith) {

        this.mgtNetmaskNotEndsWith = mgtNetmaskNotEndsWith;
        return this;
    }

    /**
     * Get mgtNetmaskNotEndsWith
     *
     * @return mgtNetmaskNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtNetmaskNotEndsWith() {
        return mgtNetmaskNotEndsWith;
    }

    public void setMgtNetmaskNotEndsWith(String mgtNetmaskNotEndsWith) {
        this.mgtNetmaskNotEndsWith = mgtNetmaskNotEndsWith;
    }

    public ClusterWhereInput mgtNetmaskNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_NOT_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput mgtNetmaskNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_NOT_ENDS_WITH);
        return this;
    }

    public void setMgtNetmaskNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_NOT_ENDS_WITH);
        }
    }

    public boolean getMgtNetmaskNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_NETMASK_NOT_ENDS_WITH);
    }

    public ClusterWhereInput mgtNetmaskNotIn(List<String> mgtNetmaskNotIn) {

        this.mgtNetmaskNotIn = mgtNetmaskNotIn;
        return this;
    }

    public ClusterWhereInput addMgtNetmaskNotInItem(String mgtNetmaskNotInItem) {
        if (this.mgtNetmaskNotIn == null) {
            this.mgtNetmaskNotIn = new ArrayList<String>();
        }
        this.mgtNetmaskNotIn.add(mgtNetmaskNotInItem);
        return this;
    }

    /**
     * Get mgtNetmaskNotIn
     *
     * @return mgtNetmaskNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMgtNetmaskNotIn() {
        return mgtNetmaskNotIn;
    }

    public void setMgtNetmaskNotIn(List<String> mgtNetmaskNotIn) {
        this.mgtNetmaskNotIn = mgtNetmaskNotIn;
    }

    public ClusterWhereInput mgtNetmaskNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_NOT_IN);
        return this;
    }

    public ClusterWhereInput mgtNetmaskNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_NOT_IN);
        return this;
    }

    public void setMgtNetmaskNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_NOT_IN);
        }
    }

    public boolean getMgtNetmaskNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_NETMASK_NOT_IN);
    }

    public ClusterWhereInput mgtNetmaskNotStartsWith(String mgtNetmaskNotStartsWith) {

        this.mgtNetmaskNotStartsWith = mgtNetmaskNotStartsWith;
        return this;
    }

    /**
     * Get mgtNetmaskNotStartsWith
     *
     * @return mgtNetmaskNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtNetmaskNotStartsWith() {
        return mgtNetmaskNotStartsWith;
    }

    public void setMgtNetmaskNotStartsWith(String mgtNetmaskNotStartsWith) {
        this.mgtNetmaskNotStartsWith = mgtNetmaskNotStartsWith;
    }

    public ClusterWhereInput mgtNetmaskNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_NOT_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput mgtNetmaskNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_NOT_STARTS_WITH);
        return this;
    }

    public void setMgtNetmaskNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_NOT_STARTS_WITH);
        }
    }

    public boolean getMgtNetmaskNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_NETMASK_NOT_STARTS_WITH);
    }

    public ClusterWhereInput mgtNetmaskStartsWith(String mgtNetmaskStartsWith) {

        this.mgtNetmaskStartsWith = mgtNetmaskStartsWith;
        return this;
    }

    /**
     * Get mgtNetmaskStartsWith
     *
     * @return mgtNetmaskStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtNetmaskStartsWith() {
        return mgtNetmaskStartsWith;
    }

    public void setMgtNetmaskStartsWith(String mgtNetmaskStartsWith) {
        this.mgtNetmaskStartsWith = mgtNetmaskStartsWith;
    }

    public ClusterWhereInput mgtNetmaskStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput mgtNetmaskStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_STARTS_WITH);
        return this;
    }

    public void setMgtNetmaskStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK_STARTS_WITH);
        }
    }

    public boolean getMgtNetmaskStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_NETMASK_STARTS_WITH);
    }

    public ClusterWhereInput migrationDataSize(Long migrationDataSize) {

        this.migrationDataSize = migrationDataSize;
        return this;
    }

    /**
     * Get migrationDataSize
     *
     * @return migrationDataSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMigrationDataSize() {
        return migrationDataSize;
    }

    public void setMigrationDataSize(Long migrationDataSize) {
        this.migrationDataSize = migrationDataSize;
    }

    public ClusterWhereInput migrationDataSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIGRATION_DATA_SIZE);
        return this;
    }

    public ClusterWhereInput migrationDataSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_DATA_SIZE);
        return this;
    }

    public void setMigrationDataSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIGRATION_DATA_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_DATA_SIZE);
        }
    }

    public boolean getMigrationDataSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIGRATION_DATA_SIZE);
    }

    public ClusterWhereInput migrationDataSizeGt(Long migrationDataSizeGt) {

        this.migrationDataSizeGt = migrationDataSizeGt;
        return this;
    }

    /**
     * Get migrationDataSizeGt
     *
     * @return migrationDataSizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMigrationDataSizeGt() {
        return migrationDataSizeGt;
    }

    public void setMigrationDataSizeGt(Long migrationDataSizeGt) {
        this.migrationDataSizeGt = migrationDataSizeGt;
    }

    public ClusterWhereInput migrationDataSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIGRATION_DATA_SIZE_GT);
        return this;
    }

    public ClusterWhereInput migrationDataSizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_DATA_SIZE_GT);
        return this;
    }

    public void setMigrationDataSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIGRATION_DATA_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_DATA_SIZE_GT);
        }
    }

    public boolean getMigrationDataSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIGRATION_DATA_SIZE_GT);
    }

    public ClusterWhereInput migrationDataSizeGte(Long migrationDataSizeGte) {

        this.migrationDataSizeGte = migrationDataSizeGte;
        return this;
    }

    /**
     * Get migrationDataSizeGte
     *
     * @return migrationDataSizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMigrationDataSizeGte() {
        return migrationDataSizeGte;
    }

    public void setMigrationDataSizeGte(Long migrationDataSizeGte) {
        this.migrationDataSizeGte = migrationDataSizeGte;
    }

    public ClusterWhereInput migrationDataSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIGRATION_DATA_SIZE_GTE);
        return this;
    }

    public ClusterWhereInput migrationDataSizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_DATA_SIZE_GTE);
        return this;
    }

    public void setMigrationDataSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIGRATION_DATA_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_DATA_SIZE_GTE);
        }
    }

    public boolean getMigrationDataSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIGRATION_DATA_SIZE_GTE);
    }

    public ClusterWhereInput migrationDataSizeIn(List<Long> migrationDataSizeIn) {

        this.migrationDataSizeIn = migrationDataSizeIn;
        return this;
    }

    public ClusterWhereInput addMigrationDataSizeInItem(Long migrationDataSizeInItem) {
        if (this.migrationDataSizeIn == null) {
            this.migrationDataSizeIn = new ArrayList<Long>();
        }
        this.migrationDataSizeIn.add(migrationDataSizeInItem);
        return this;
    }

    /**
     * Get migrationDataSizeIn
     *
     * @return migrationDataSizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getMigrationDataSizeIn() {
        return migrationDataSizeIn;
    }

    public void setMigrationDataSizeIn(List<Long> migrationDataSizeIn) {
        this.migrationDataSizeIn = migrationDataSizeIn;
    }

    public ClusterWhereInput migrationDataSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIGRATION_DATA_SIZE_IN);
        return this;
    }

    public ClusterWhereInput migrationDataSizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_DATA_SIZE_IN);
        return this;
    }

    public void setMigrationDataSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIGRATION_DATA_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_DATA_SIZE_IN);
        }
    }

    public boolean getMigrationDataSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIGRATION_DATA_SIZE_IN);
    }

    public ClusterWhereInput migrationDataSizeLt(Long migrationDataSizeLt) {

        this.migrationDataSizeLt = migrationDataSizeLt;
        return this;
    }

    /**
     * Get migrationDataSizeLt
     *
     * @return migrationDataSizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMigrationDataSizeLt() {
        return migrationDataSizeLt;
    }

    public void setMigrationDataSizeLt(Long migrationDataSizeLt) {
        this.migrationDataSizeLt = migrationDataSizeLt;
    }

    public ClusterWhereInput migrationDataSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIGRATION_DATA_SIZE_LT);
        return this;
    }

    public ClusterWhereInput migrationDataSizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_DATA_SIZE_LT);
        return this;
    }

    public void setMigrationDataSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIGRATION_DATA_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_DATA_SIZE_LT);
        }
    }

    public boolean getMigrationDataSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIGRATION_DATA_SIZE_LT);
    }

    public ClusterWhereInput migrationDataSizeLte(Long migrationDataSizeLte) {

        this.migrationDataSizeLte = migrationDataSizeLte;
        return this;
    }

    /**
     * Get migrationDataSizeLte
     *
     * @return migrationDataSizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMigrationDataSizeLte() {
        return migrationDataSizeLte;
    }

    public void setMigrationDataSizeLte(Long migrationDataSizeLte) {
        this.migrationDataSizeLte = migrationDataSizeLte;
    }

    public ClusterWhereInput migrationDataSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIGRATION_DATA_SIZE_LTE);
        return this;
    }

    public ClusterWhereInput migrationDataSizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_DATA_SIZE_LTE);
        return this;
    }

    public void setMigrationDataSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIGRATION_DATA_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_DATA_SIZE_LTE);
        }
    }

    public boolean getMigrationDataSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIGRATION_DATA_SIZE_LTE);
    }

    public ClusterWhereInput migrationDataSizeNot(Long migrationDataSizeNot) {

        this.migrationDataSizeNot = migrationDataSizeNot;
        return this;
    }

    /**
     * Get migrationDataSizeNot
     *
     * @return migrationDataSizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMigrationDataSizeNot() {
        return migrationDataSizeNot;
    }

    public void setMigrationDataSizeNot(Long migrationDataSizeNot) {
        this.migrationDataSizeNot = migrationDataSizeNot;
    }

    public ClusterWhereInput migrationDataSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIGRATION_DATA_SIZE_NOT);
        return this;
    }

    public ClusterWhereInput migrationDataSizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_DATA_SIZE_NOT);
        return this;
    }

    public void setMigrationDataSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIGRATION_DATA_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_DATA_SIZE_NOT);
        }
    }

    public boolean getMigrationDataSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIGRATION_DATA_SIZE_NOT);
    }

    public ClusterWhereInput migrationDataSizeNotIn(List<Long> migrationDataSizeNotIn) {

        this.migrationDataSizeNotIn = migrationDataSizeNotIn;
        return this;
    }

    public ClusterWhereInput addMigrationDataSizeNotInItem(Long migrationDataSizeNotInItem) {
        if (this.migrationDataSizeNotIn == null) {
            this.migrationDataSizeNotIn = new ArrayList<Long>();
        }
        this.migrationDataSizeNotIn.add(migrationDataSizeNotInItem);
        return this;
    }

    /**
     * Get migrationDataSizeNotIn
     *
     * @return migrationDataSizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getMigrationDataSizeNotIn() {
        return migrationDataSizeNotIn;
    }

    public void setMigrationDataSizeNotIn(List<Long> migrationDataSizeNotIn) {
        this.migrationDataSizeNotIn = migrationDataSizeNotIn;
    }

    public ClusterWhereInput migrationDataSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIGRATION_DATA_SIZE_NOT_IN);
        return this;
    }

    public ClusterWhereInput migrationDataSizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_DATA_SIZE_NOT_IN);
        return this;
    }

    public void setMigrationDataSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIGRATION_DATA_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_DATA_SIZE_NOT_IN);
        }
    }

    public boolean getMigrationDataSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIGRATION_DATA_SIZE_NOT_IN);
    }

    public ClusterWhereInput migrationSpeed(Long migrationSpeed) {

        this.migrationSpeed = migrationSpeed;
        return this;
    }

    /**
     * Get migrationSpeed
     *
     * @return migrationSpeed
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMigrationSpeed() {
        return migrationSpeed;
    }

    public void setMigrationSpeed(Long migrationSpeed) {
        this.migrationSpeed = migrationSpeed;
    }

    public ClusterWhereInput migrationSpeed_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIGRATION_SPEED);
        return this;
    }

    public ClusterWhereInput migrationSpeed_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_SPEED);
        return this;
    }

    public void setMigrationSpeed_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIGRATION_SPEED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_SPEED);
        }
    }

    public boolean getMigrationSpeed_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIGRATION_SPEED);
    }

    public ClusterWhereInput migrationSpeedGt(Long migrationSpeedGt) {

        this.migrationSpeedGt = migrationSpeedGt;
        return this;
    }

    /**
     * Get migrationSpeedGt
     *
     * @return migrationSpeedGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMigrationSpeedGt() {
        return migrationSpeedGt;
    }

    public void setMigrationSpeedGt(Long migrationSpeedGt) {
        this.migrationSpeedGt = migrationSpeedGt;
    }

    public ClusterWhereInput migrationSpeedGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIGRATION_SPEED_GT);
        return this;
    }

    public ClusterWhereInput migrationSpeedGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_SPEED_GT);
        return this;
    }

    public void setMigrationSpeedGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIGRATION_SPEED_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_SPEED_GT);
        }
    }

    public boolean getMigrationSpeedGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIGRATION_SPEED_GT);
    }

    public ClusterWhereInput migrationSpeedGte(Long migrationSpeedGte) {

        this.migrationSpeedGte = migrationSpeedGte;
        return this;
    }

    /**
     * Get migrationSpeedGte
     *
     * @return migrationSpeedGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMigrationSpeedGte() {
        return migrationSpeedGte;
    }

    public void setMigrationSpeedGte(Long migrationSpeedGte) {
        this.migrationSpeedGte = migrationSpeedGte;
    }

    public ClusterWhereInput migrationSpeedGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIGRATION_SPEED_GTE);
        return this;
    }

    public ClusterWhereInput migrationSpeedGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_SPEED_GTE);
        return this;
    }

    public void setMigrationSpeedGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIGRATION_SPEED_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_SPEED_GTE);
        }
    }

    public boolean getMigrationSpeedGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIGRATION_SPEED_GTE);
    }

    public ClusterWhereInput migrationSpeedIn(List<Long> migrationSpeedIn) {

        this.migrationSpeedIn = migrationSpeedIn;
        return this;
    }

    public ClusterWhereInput addMigrationSpeedInItem(Long migrationSpeedInItem) {
        if (this.migrationSpeedIn == null) {
            this.migrationSpeedIn = new ArrayList<Long>();
        }
        this.migrationSpeedIn.add(migrationSpeedInItem);
        return this;
    }

    /**
     * Get migrationSpeedIn
     *
     * @return migrationSpeedIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getMigrationSpeedIn() {
        return migrationSpeedIn;
    }

    public void setMigrationSpeedIn(List<Long> migrationSpeedIn) {
        this.migrationSpeedIn = migrationSpeedIn;
    }

    public ClusterWhereInput migrationSpeedIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIGRATION_SPEED_IN);
        return this;
    }

    public ClusterWhereInput migrationSpeedIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_SPEED_IN);
        return this;
    }

    public void setMigrationSpeedIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIGRATION_SPEED_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_SPEED_IN);
        }
    }

    public boolean getMigrationSpeedIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIGRATION_SPEED_IN);
    }

    public ClusterWhereInput migrationSpeedLt(Long migrationSpeedLt) {

        this.migrationSpeedLt = migrationSpeedLt;
        return this;
    }

    /**
     * Get migrationSpeedLt
     *
     * @return migrationSpeedLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMigrationSpeedLt() {
        return migrationSpeedLt;
    }

    public void setMigrationSpeedLt(Long migrationSpeedLt) {
        this.migrationSpeedLt = migrationSpeedLt;
    }

    public ClusterWhereInput migrationSpeedLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIGRATION_SPEED_LT);
        return this;
    }

    public ClusterWhereInput migrationSpeedLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_SPEED_LT);
        return this;
    }

    public void setMigrationSpeedLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIGRATION_SPEED_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_SPEED_LT);
        }
    }

    public boolean getMigrationSpeedLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIGRATION_SPEED_LT);
    }

    public ClusterWhereInput migrationSpeedLte(Long migrationSpeedLte) {

        this.migrationSpeedLte = migrationSpeedLte;
        return this;
    }

    /**
     * Get migrationSpeedLte
     *
     * @return migrationSpeedLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMigrationSpeedLte() {
        return migrationSpeedLte;
    }

    public void setMigrationSpeedLte(Long migrationSpeedLte) {
        this.migrationSpeedLte = migrationSpeedLte;
    }

    public ClusterWhereInput migrationSpeedLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIGRATION_SPEED_LTE);
        return this;
    }

    public ClusterWhereInput migrationSpeedLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_SPEED_LTE);
        return this;
    }

    public void setMigrationSpeedLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIGRATION_SPEED_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_SPEED_LTE);
        }
    }

    public boolean getMigrationSpeedLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIGRATION_SPEED_LTE);
    }

    public ClusterWhereInput migrationSpeedNot(Long migrationSpeedNot) {

        this.migrationSpeedNot = migrationSpeedNot;
        return this;
    }

    /**
     * Get migrationSpeedNot
     *
     * @return migrationSpeedNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMigrationSpeedNot() {
        return migrationSpeedNot;
    }

    public void setMigrationSpeedNot(Long migrationSpeedNot) {
        this.migrationSpeedNot = migrationSpeedNot;
    }

    public ClusterWhereInput migrationSpeedNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIGRATION_SPEED_NOT);
        return this;
    }

    public ClusterWhereInput migrationSpeedNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_SPEED_NOT);
        return this;
    }

    public void setMigrationSpeedNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIGRATION_SPEED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_SPEED_NOT);
        }
    }

    public boolean getMigrationSpeedNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIGRATION_SPEED_NOT);
    }

    public ClusterWhereInput migrationSpeedNotIn(List<Long> migrationSpeedNotIn) {

        this.migrationSpeedNotIn = migrationSpeedNotIn;
        return this;
    }

    public ClusterWhereInput addMigrationSpeedNotInItem(Long migrationSpeedNotInItem) {
        if (this.migrationSpeedNotIn == null) {
            this.migrationSpeedNotIn = new ArrayList<Long>();
        }
        this.migrationSpeedNotIn.add(migrationSpeedNotInItem);
        return this;
    }

    /**
     * Get migrationSpeedNotIn
     *
     * @return migrationSpeedNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getMigrationSpeedNotIn() {
        return migrationSpeedNotIn;
    }

    public void setMigrationSpeedNotIn(List<Long> migrationSpeedNotIn) {
        this.migrationSpeedNotIn = migrationSpeedNotIn;
    }

    public ClusterWhereInput migrationSpeedNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIGRATION_SPEED_NOT_IN);
        return this;
    }

    public ClusterWhereInput migrationSpeedNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_SPEED_NOT_IN);
        return this;
    }

    public void setMigrationSpeedNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIGRATION_SPEED_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_SPEED_NOT_IN);
        }
    }

    public boolean getMigrationSpeedNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIGRATION_SPEED_NOT_IN);
    }

    public ClusterWhereInput name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClusterWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ClusterWhereInput name_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME);
        return this;
    }

    public void setName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME);
        }
    }

    public boolean getName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME);
    }

    public ClusterWhereInput nameContains(String nameContains) {

        this.nameContains = nameContains;
        return this;
    }

    /**
     * Get nameContains
     *
     * @return nameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameContains() {
        return nameContains;
    }

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    public ClusterWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public ClusterWhereInput nameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public void setNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_CONTAINS);
        }
    }

    public boolean getNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_CONTAINS);
    }

    public ClusterWhereInput nameEndsWith(String nameEndsWith) {

        this.nameEndsWith = nameEndsWith;
        return this;
    }

    /**
     * Get nameEndsWith
     *
     * @return nameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameEndsWith() {
        return nameEndsWith;
    }

    public void setNameEndsWith(String nameEndsWith) {
        this.nameEndsWith = nameEndsWith;
    }

    public ClusterWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput nameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public void setNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_ENDS_WITH);
        }
    }

    public boolean getNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_ENDS_WITH);
    }

    public ClusterWhereInput nameGt(String nameGt) {

        this.nameGt = nameGt;
        return this;
    }

    /**
     * Get nameGt
     *
     * @return nameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameGt() {
        return nameGt;
    }

    public void setNameGt(String nameGt) {
        this.nameGt = nameGt;
    }

    public ClusterWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public ClusterWhereInput nameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public void setNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_GT);
        }
    }

    public boolean getNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_GT);
    }

    public ClusterWhereInput nameGte(String nameGte) {

        this.nameGte = nameGte;
        return this;
    }

    /**
     * Get nameGte
     *
     * @return nameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameGte() {
        return nameGte;
    }

    public void setNameGte(String nameGte) {
        this.nameGte = nameGte;
    }

    public ClusterWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public ClusterWhereInput nameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public void setNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_GTE);
        }
    }

    public boolean getNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_GTE);
    }

    public ClusterWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public ClusterWhereInput addNameInItem(String nameInItem) {
        if (this.nameIn == null) {
            this.nameIn = new ArrayList<String>();
        }
        this.nameIn.add(nameInItem);
        return this;
    }

    /**
     * Get nameIn
     *
     * @return nameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNameIn() {
        return nameIn;
    }

    public void setNameIn(List<String> nameIn) {
        this.nameIn = nameIn;
    }

    public ClusterWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public ClusterWhereInput nameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public void setNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_IN);
        }
    }

    public boolean getNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_IN);
    }

    public ClusterWhereInput nameLt(String nameLt) {

        this.nameLt = nameLt;
        return this;
    }

    /**
     * Get nameLt
     *
     * @return nameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameLt() {
        return nameLt;
    }

    public void setNameLt(String nameLt) {
        this.nameLt = nameLt;
    }

    public ClusterWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public ClusterWhereInput nameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public void setNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_LT);
        }
    }

    public boolean getNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_LT);
    }

    public ClusterWhereInput nameLte(String nameLte) {

        this.nameLte = nameLte;
        return this;
    }

    /**
     * Get nameLte
     *
     * @return nameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameLte() {
        return nameLte;
    }

    public void setNameLte(String nameLte) {
        this.nameLte = nameLte;
    }

    public ClusterWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public ClusterWhereInput nameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public void setNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_LTE);
        }
    }

    public boolean getNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_LTE);
    }

    public ClusterWhereInput nameNot(String nameNot) {

        this.nameNot = nameNot;
        return this;
    }

    /**
     * Get nameNot
     *
     * @return nameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNot() {
        return nameNot;
    }

    public void setNameNot(String nameNot) {
        this.nameNot = nameNot;
    }

    public ClusterWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public ClusterWhereInput nameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public void setNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT);
        }
    }

    public boolean getNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT);
    }

    public ClusterWhereInput nameNotContains(String nameNotContains) {

        this.nameNotContains = nameNotContains;
        return this;
    }

    /**
     * Get nameNotContains
     *
     * @return nameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotContains() {
        return nameNotContains;
    }

    public void setNameNotContains(String nameNotContains) {
        this.nameNotContains = nameNotContains;
    }

    public ClusterWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public ClusterWhereInput nameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public void setNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        }
    }

    public boolean getNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_CONTAINS);
    }

    public ClusterWhereInput nameNotEndsWith(String nameNotEndsWith) {

        this.nameNotEndsWith = nameNotEndsWith;
        return this;
    }

    /**
     * Get nameNotEndsWith
     *
     * @return nameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotEndsWith() {
        return nameNotEndsWith;
    }

    public void setNameNotEndsWith(String nameNotEndsWith) {
        this.nameNotEndsWith = nameNotEndsWith;
    }

    public ClusterWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput nameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
    }

    public ClusterWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public ClusterWhereInput addNameNotInItem(String nameNotInItem) {
        if (this.nameNotIn == null) {
            this.nameNotIn = new ArrayList<String>();
        }
        this.nameNotIn.add(nameNotInItem);
        return this;
    }

    /**
     * Get nameNotIn
     *
     * @return nameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNameNotIn() {
        return nameNotIn;
    }

    public void setNameNotIn(List<String> nameNotIn) {
        this.nameNotIn = nameNotIn;
    }

    public ClusterWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public ClusterWhereInput nameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public void setNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_IN);
        }
    }

    public boolean getNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_IN);
    }

    public ClusterWhereInput nameNotStartsWith(String nameNotStartsWith) {

        this.nameNotStartsWith = nameNotStartsWith;
        return this;
    }

    /**
     * Get nameNotStartsWith
     *
     * @return nameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotStartsWith() {
        return nameNotStartsWith;
    }

    public void setNameNotStartsWith(String nameNotStartsWith) {
        this.nameNotStartsWith = nameNotStartsWith;
    }

    public ClusterWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput nameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
    }

    public ClusterWhereInput nameStartsWith(String nameStartsWith) {

        this.nameStartsWith = nameStartsWith;
        return this;
    }

    /**
     * Get nameStartsWith
     *
     * @return nameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameStartsWith() {
        return nameStartsWith;
    }

    public void setNameStartsWith(String nameStartsWith) {
        this.nameStartsWith = nameStartsWith;
    }

    public ClusterWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput nameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public void setNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_STARTS_WITH);
        }
    }

    public boolean getNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_STARTS_WITH);
    }

    public ClusterWhereInput ntpMode(NtpMode ntpMode) {

        this.ntpMode = ntpMode;
        return this;
    }

    /**
     * Get ntpMode
     *
     * @return ntpMode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NtpMode getNtpMode() {
        return ntpMode;
    }

    public void setNtpMode(NtpMode ntpMode) {
        this.ntpMode = ntpMode;
    }

    public ClusterWhereInput ntpMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NTP_MODE);
        return this;
    }

    public ClusterWhereInput ntpMode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NTP_MODE);
        return this;
    }

    public void setNtpMode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NTP_MODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NTP_MODE);
        }
    }

    public boolean getNtpMode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NTP_MODE);
    }

    public ClusterWhereInput ntpModeIn(List<NtpMode> ntpModeIn) {

        this.ntpModeIn = ntpModeIn;
        return this;
    }

    public ClusterWhereInput addNtpModeInItem(NtpMode ntpModeInItem) {
        if (this.ntpModeIn == null) {
            this.ntpModeIn = new ArrayList<NtpMode>();
        }
        this.ntpModeIn.add(ntpModeInItem);
        return this;
    }

    /**
     * Get ntpModeIn
     *
     * @return ntpModeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NtpMode> getNtpModeIn() {
        return ntpModeIn;
    }

    public void setNtpModeIn(List<NtpMode> ntpModeIn) {
        this.ntpModeIn = ntpModeIn;
    }

    public ClusterWhereInput ntpModeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NTP_MODE_IN);
        return this;
    }

    public ClusterWhereInput ntpModeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NTP_MODE_IN);
        return this;
    }

    public void setNtpModeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NTP_MODE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NTP_MODE_IN);
        }
    }

    public boolean getNtpModeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NTP_MODE_IN);
    }

    public ClusterWhereInput ntpModeNot(NtpMode ntpModeNot) {

        this.ntpModeNot = ntpModeNot;
        return this;
    }

    /**
     * Get ntpModeNot
     *
     * @return ntpModeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NtpMode getNtpModeNot() {
        return ntpModeNot;
    }

    public void setNtpModeNot(NtpMode ntpModeNot) {
        this.ntpModeNot = ntpModeNot;
    }

    public ClusterWhereInput ntpModeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NTP_MODE_NOT);
        return this;
    }

    public ClusterWhereInput ntpModeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NTP_MODE_NOT);
        return this;
    }

    public void setNtpModeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NTP_MODE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NTP_MODE_NOT);
        }
    }

    public boolean getNtpModeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NTP_MODE_NOT);
    }

    public ClusterWhereInput ntpModeNotIn(List<NtpMode> ntpModeNotIn) {

        this.ntpModeNotIn = ntpModeNotIn;
        return this;
    }

    public ClusterWhereInput addNtpModeNotInItem(NtpMode ntpModeNotInItem) {
        if (this.ntpModeNotIn == null) {
            this.ntpModeNotIn = new ArrayList<NtpMode>();
        }
        this.ntpModeNotIn.add(ntpModeNotInItem);
        return this;
    }

    /**
     * Get ntpModeNotIn
     *
     * @return ntpModeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NtpMode> getNtpModeNotIn() {
        return ntpModeNotIn;
    }

    public void setNtpModeNotIn(List<NtpMode> ntpModeNotIn) {
        this.ntpModeNotIn = ntpModeNotIn;
    }

    public ClusterWhereInput ntpModeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NTP_MODE_NOT_IN);
        return this;
    }

    public ClusterWhereInput ntpModeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NTP_MODE_NOT_IN);
        return this;
    }

    public void setNtpModeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NTP_MODE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NTP_MODE_NOT_IN);
        }
    }

    public boolean getNtpModeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NTP_MODE_NOT_IN);
    }

    public ClusterWhereInput nvmeOverRdmaEnabled(Boolean nvmeOverRdmaEnabled) {

        this.nvmeOverRdmaEnabled = nvmeOverRdmaEnabled;
        return this;
    }

    /**
     * Get nvmeOverRdmaEnabled
     *
     * @return nvmeOverRdmaEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getNvmeOverRdmaEnabled() {
        return nvmeOverRdmaEnabled;
    }

    public void setNvmeOverRdmaEnabled(Boolean nvmeOverRdmaEnabled) {
        this.nvmeOverRdmaEnabled = nvmeOverRdmaEnabled;
    }

    public ClusterWhereInput nvmeOverRdmaEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED);
        return this;
    }

    public ClusterWhereInput nvmeOverRdmaEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED);
        return this;
    }

    public void setNvmeOverRdmaEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED);
        }
    }

    public boolean getNvmeOverRdmaEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED);
    }

    public ClusterWhereInput nvmeOverRdmaEnabledNot(Boolean nvmeOverRdmaEnabledNot) {

        this.nvmeOverRdmaEnabledNot = nvmeOverRdmaEnabledNot;
        return this;
    }

    /**
     * Get nvmeOverRdmaEnabledNot
     *
     * @return nvmeOverRdmaEnabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getNvmeOverRdmaEnabledNot() {
        return nvmeOverRdmaEnabledNot;
    }

    public void setNvmeOverRdmaEnabledNot(Boolean nvmeOverRdmaEnabledNot) {
        this.nvmeOverRdmaEnabledNot = nvmeOverRdmaEnabledNot;
    }

    public ClusterWhereInput nvmeOverRdmaEnabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED_NOT);
        return this;
    }

    public ClusterWhereInput nvmeOverRdmaEnabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED_NOT);
        return this;
    }

    public void setNvmeOverRdmaEnabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED_NOT);
        }
    }

    public boolean getNvmeOverRdmaEnabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED_NOT);
    }

    public ClusterWhereInput nvmeOverTcpEnabled(Boolean nvmeOverTcpEnabled) {

        this.nvmeOverTcpEnabled = nvmeOverTcpEnabled;
        return this;
    }

    /**
     * Get nvmeOverTcpEnabled
     *
     * @return nvmeOverTcpEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getNvmeOverTcpEnabled() {
        return nvmeOverTcpEnabled;
    }

    public void setNvmeOverTcpEnabled(Boolean nvmeOverTcpEnabled) {
        this.nvmeOverTcpEnabled = nvmeOverTcpEnabled;
    }

    public ClusterWhereInput nvmeOverTcpEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVME_OVER_TCP_ENABLED);
        return this;
    }

    public ClusterWhereInput nvmeOverTcpEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVME_OVER_TCP_ENABLED);
        return this;
    }

    public void setNvmeOverTcpEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVME_OVER_TCP_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVME_OVER_TCP_ENABLED);
        }
    }

    public boolean getNvmeOverTcpEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVME_OVER_TCP_ENABLED);
    }

    public ClusterWhereInput nvmeOverTcpEnabledNot(Boolean nvmeOverTcpEnabledNot) {

        this.nvmeOverTcpEnabledNot = nvmeOverTcpEnabledNot;
        return this;
    }

    /**
     * Get nvmeOverTcpEnabledNot
     *
     * @return nvmeOverTcpEnabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getNvmeOverTcpEnabledNot() {
        return nvmeOverTcpEnabledNot;
    }

    public void setNvmeOverTcpEnabledNot(Boolean nvmeOverTcpEnabledNot) {
        this.nvmeOverTcpEnabledNot = nvmeOverTcpEnabledNot;
    }

    public ClusterWhereInput nvmeOverTcpEnabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVME_OVER_TCP_ENABLED_NOT);
        return this;
    }

    public ClusterWhereInput nvmeOverTcpEnabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVME_OVER_TCP_ENABLED_NOT);
        return this;
    }

    public void setNvmeOverTcpEnabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVME_OVER_TCP_ENABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVME_OVER_TCP_ENABLED_NOT);
        }
    }

    public boolean getNvmeOverTcpEnabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVME_OVER_TCP_ENABLED_NOT);
    }

    public ClusterWhereInput nvmfEnabled(Boolean nvmfEnabled) {

        this.nvmfEnabled = nvmfEnabled;
        return this;
    }

    /**
     * Get nvmfEnabled
     *
     * @return nvmfEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getNvmfEnabled() {
        return nvmfEnabled;
    }

    public void setNvmfEnabled(Boolean nvmfEnabled) {
        this.nvmfEnabled = nvmfEnabled;
    }

    public ClusterWhereInput nvmfEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_ENABLED);
        return this;
    }

    public ClusterWhereInput nvmfEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_ENABLED);
        return this;
    }

    public void setNvmfEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_ENABLED);
        }
    }

    public boolean getNvmfEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_ENABLED);
    }

    public ClusterWhereInput nvmfEnabledNot(Boolean nvmfEnabledNot) {

        this.nvmfEnabledNot = nvmfEnabledNot;
        return this;
    }

    /**
     * Get nvmfEnabledNot
     *
     * @return nvmfEnabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getNvmfEnabledNot() {
        return nvmfEnabledNot;
    }

    public void setNvmfEnabledNot(Boolean nvmfEnabledNot) {
        this.nvmfEnabledNot = nvmfEnabledNot;
    }

    public ClusterWhereInput nvmfEnabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_ENABLED_NOT);
        return this;
    }

    public ClusterWhereInput nvmfEnabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_ENABLED_NOT);
        return this;
    }

    public void setNvmfEnabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_ENABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_ENABLED_NOT);
        }
    }

    public boolean getNvmfEnabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_ENABLED_NOT);
    }

    public ClusterWhereInput pmemEnabled(Boolean pmemEnabled) {

        this.pmemEnabled = pmemEnabled;
        return this;
    }

    /**
     * Get pmemEnabled
     *
     * @return pmemEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getPmemEnabled() {
        return pmemEnabled;
    }

    public void setPmemEnabled(Boolean pmemEnabled) {
        this.pmemEnabled = pmemEnabled;
    }

    public ClusterWhereInput pmemEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PMEM_ENABLED);
        return this;
    }

    public ClusterWhereInput pmemEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PMEM_ENABLED);
        return this;
    }

    public void setPmemEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PMEM_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PMEM_ENABLED);
        }
    }

    public boolean getPmemEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PMEM_ENABLED);
    }

    public ClusterWhereInput pmemEnabledNot(Boolean pmemEnabledNot) {

        this.pmemEnabledNot = pmemEnabledNot;
        return this;
    }

    /**
     * Get pmemEnabledNot
     *
     * @return pmemEnabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getPmemEnabledNot() {
        return pmemEnabledNot;
    }

    public void setPmemEnabledNot(Boolean pmemEnabledNot) {
        this.pmemEnabledNot = pmemEnabledNot;
    }

    public ClusterWhereInput pmemEnabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PMEM_ENABLED_NOT);
        return this;
    }

    public ClusterWhereInput pmemEnabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PMEM_ENABLED_NOT);
        return this;
    }

    public void setPmemEnabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PMEM_ENABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PMEM_ENABLED_NOT);
        }
    }

    public boolean getPmemEnabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PMEM_ENABLED_NOT);
    }

    public ClusterWhereInput provisionedCpuCores(Integer provisionedCpuCores) {

        this.provisionedCpuCores = provisionedCpuCores;
        return this;
    }

    /**
     * Get provisionedCpuCores
     *
     * @return provisionedCpuCores
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCores() {
        return provisionedCpuCores;
    }

    public void setProvisionedCpuCores(Integer provisionedCpuCores) {
        this.provisionedCpuCores = provisionedCpuCores;
    }

    public ClusterWhereInput provisionedCpuCores_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES);
        return this;
    }

    public ClusterWhereInput provisionedCpuCores_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES);
        return this;
    }

    public void setProvisionedCpuCores_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES);
        }
    }

    public boolean getProvisionedCpuCores_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES);
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVm(
            Integer provisionedCpuCoresForActiveVm) {

        this.provisionedCpuCoresForActiveVm = provisionedCpuCoresForActiveVm;
        return this;
    }

    /**
     * Get provisionedCpuCoresForActiveVm
     *
     * @return provisionedCpuCoresForActiveVm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresForActiveVm() {
        return provisionedCpuCoresForActiveVm;
    }

    public void setProvisionedCpuCoresForActiveVm(Integer provisionedCpuCoresForActiveVm) {
        this.provisionedCpuCoresForActiveVm = provisionedCpuCoresForActiveVm;
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM);
        return this;
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM);
        return this;
    }

    public void setProvisionedCpuCoresForActiveVm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM);
        }
    }

    public boolean getProvisionedCpuCoresForActiveVm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM);
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmGt(
            Integer provisionedCpuCoresForActiveVmGt) {

        this.provisionedCpuCoresForActiveVmGt = provisionedCpuCoresForActiveVmGt;
        return this;
    }

    /**
     * Get provisionedCpuCoresForActiveVmGt
     *
     * @return provisionedCpuCoresForActiveVmGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresForActiveVmGt() {
        return provisionedCpuCoresForActiveVmGt;
    }

    public void setProvisionedCpuCoresForActiveVmGt(Integer provisionedCpuCoresForActiveVmGt) {
        this.provisionedCpuCoresForActiveVmGt = provisionedCpuCoresForActiveVmGt;
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GT);
        return this;
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GT);
        return this;
    }

    public void setProvisionedCpuCoresForActiveVmGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GT);
        }
    }

    public boolean getProvisionedCpuCoresForActiveVmGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GT);
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmGte(
            Integer provisionedCpuCoresForActiveVmGte) {

        this.provisionedCpuCoresForActiveVmGte = provisionedCpuCoresForActiveVmGte;
        return this;
    }

    /**
     * Get provisionedCpuCoresForActiveVmGte
     *
     * @return provisionedCpuCoresForActiveVmGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresForActiveVmGte() {
        return provisionedCpuCoresForActiveVmGte;
    }

    public void setProvisionedCpuCoresForActiveVmGte(Integer provisionedCpuCoresForActiveVmGte) {
        this.provisionedCpuCoresForActiveVmGte = provisionedCpuCoresForActiveVmGte;
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GTE);
        return this;
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GTE);
        return this;
    }

    public void setProvisionedCpuCoresForActiveVmGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GTE);
        }
    }

    public boolean getProvisionedCpuCoresForActiveVmGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GTE);
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmIn(
            List<Integer> provisionedCpuCoresForActiveVmIn) {

        this.provisionedCpuCoresForActiveVmIn = provisionedCpuCoresForActiveVmIn;
        return this;
    }

    public ClusterWhereInput addProvisionedCpuCoresForActiveVmInItem(
            Integer provisionedCpuCoresForActiveVmInItem) {
        if (this.provisionedCpuCoresForActiveVmIn == null) {
            this.provisionedCpuCoresForActiveVmIn = new ArrayList<Integer>();
        }
        this.provisionedCpuCoresForActiveVmIn.add(provisionedCpuCoresForActiveVmInItem);
        return this;
    }

    /**
     * Get provisionedCpuCoresForActiveVmIn
     *
     * @return provisionedCpuCoresForActiveVmIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getProvisionedCpuCoresForActiveVmIn() {
        return provisionedCpuCoresForActiveVmIn;
    }

    public void setProvisionedCpuCoresForActiveVmIn(
            List<Integer> provisionedCpuCoresForActiveVmIn) {
        this.provisionedCpuCoresForActiveVmIn = provisionedCpuCoresForActiveVmIn;
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_IN);
        return this;
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_IN);
        return this;
    }

    public void setProvisionedCpuCoresForActiveVmIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_IN);
        }
    }

    public boolean getProvisionedCpuCoresForActiveVmIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_IN);
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmLt(
            Integer provisionedCpuCoresForActiveVmLt) {

        this.provisionedCpuCoresForActiveVmLt = provisionedCpuCoresForActiveVmLt;
        return this;
    }

    /**
     * Get provisionedCpuCoresForActiveVmLt
     *
     * @return provisionedCpuCoresForActiveVmLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresForActiveVmLt() {
        return provisionedCpuCoresForActiveVmLt;
    }

    public void setProvisionedCpuCoresForActiveVmLt(Integer provisionedCpuCoresForActiveVmLt) {
        this.provisionedCpuCoresForActiveVmLt = provisionedCpuCoresForActiveVmLt;
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LT);
        return this;
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LT);
        return this;
    }

    public void setProvisionedCpuCoresForActiveVmLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LT);
        }
    }

    public boolean getProvisionedCpuCoresForActiveVmLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LT);
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmLte(
            Integer provisionedCpuCoresForActiveVmLte) {

        this.provisionedCpuCoresForActiveVmLte = provisionedCpuCoresForActiveVmLte;
        return this;
    }

    /**
     * Get provisionedCpuCoresForActiveVmLte
     *
     * @return provisionedCpuCoresForActiveVmLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresForActiveVmLte() {
        return provisionedCpuCoresForActiveVmLte;
    }

    public void setProvisionedCpuCoresForActiveVmLte(Integer provisionedCpuCoresForActiveVmLte) {
        this.provisionedCpuCoresForActiveVmLte = provisionedCpuCoresForActiveVmLte;
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LTE);
        return this;
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LTE);
        return this;
    }

    public void setProvisionedCpuCoresForActiveVmLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LTE);
        }
    }

    public boolean getProvisionedCpuCoresForActiveVmLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LTE);
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmNot(
            Integer provisionedCpuCoresForActiveVmNot) {

        this.provisionedCpuCoresForActiveVmNot = provisionedCpuCoresForActiveVmNot;
        return this;
    }

    /**
     * Get provisionedCpuCoresForActiveVmNot
     *
     * @return provisionedCpuCoresForActiveVmNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresForActiveVmNot() {
        return provisionedCpuCoresForActiveVmNot;
    }

    public void setProvisionedCpuCoresForActiveVmNot(Integer provisionedCpuCoresForActiveVmNot) {
        this.provisionedCpuCoresForActiveVmNot = provisionedCpuCoresForActiveVmNot;
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT);
        return this;
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT);
        return this;
    }

    public void setProvisionedCpuCoresForActiveVmNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT);
        }
    }

    public boolean getProvisionedCpuCoresForActiveVmNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT);
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmNotIn(
            List<Integer> provisionedCpuCoresForActiveVmNotIn) {

        this.provisionedCpuCoresForActiveVmNotIn = provisionedCpuCoresForActiveVmNotIn;
        return this;
    }

    public ClusterWhereInput addProvisionedCpuCoresForActiveVmNotInItem(
            Integer provisionedCpuCoresForActiveVmNotInItem) {
        if (this.provisionedCpuCoresForActiveVmNotIn == null) {
            this.provisionedCpuCoresForActiveVmNotIn = new ArrayList<Integer>();
        }
        this.provisionedCpuCoresForActiveVmNotIn.add(provisionedCpuCoresForActiveVmNotInItem);
        return this;
    }

    /**
     * Get provisionedCpuCoresForActiveVmNotIn
     *
     * @return provisionedCpuCoresForActiveVmNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getProvisionedCpuCoresForActiveVmNotIn() {
        return provisionedCpuCoresForActiveVmNotIn;
    }

    public void setProvisionedCpuCoresForActiveVmNotIn(
            List<Integer> provisionedCpuCoresForActiveVmNotIn) {
        this.provisionedCpuCoresForActiveVmNotIn = provisionedCpuCoresForActiveVmNotIn;
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT_IN);
        return this;
    }

    public ClusterWhereInput provisionedCpuCoresForActiveVmNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT_IN);
        return this;
    }

    public void setProvisionedCpuCoresForActiveVmNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT_IN);
        }
    }

    public boolean getProvisionedCpuCoresForActiveVmNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT_IN);
    }

    public ClusterWhereInput provisionedCpuCoresGt(Integer provisionedCpuCoresGt) {

        this.provisionedCpuCoresGt = provisionedCpuCoresGt;
        return this;
    }

    /**
     * Get provisionedCpuCoresGt
     *
     * @return provisionedCpuCoresGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresGt() {
        return provisionedCpuCoresGt;
    }

    public void setProvisionedCpuCoresGt(Integer provisionedCpuCoresGt) {
        this.provisionedCpuCoresGt = provisionedCpuCoresGt;
    }

    public ClusterWhereInput provisionedCpuCoresGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GT);
        return this;
    }

    public ClusterWhereInput provisionedCpuCoresGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GT);
        return this;
    }

    public void setProvisionedCpuCoresGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GT);
        }
    }

    public boolean getProvisionedCpuCoresGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GT);
    }

    public ClusterWhereInput provisionedCpuCoresGte(Integer provisionedCpuCoresGte) {

        this.provisionedCpuCoresGte = provisionedCpuCoresGte;
        return this;
    }

    /**
     * Get provisionedCpuCoresGte
     *
     * @return provisionedCpuCoresGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresGte() {
        return provisionedCpuCoresGte;
    }

    public void setProvisionedCpuCoresGte(Integer provisionedCpuCoresGte) {
        this.provisionedCpuCoresGte = provisionedCpuCoresGte;
    }

    public ClusterWhereInput provisionedCpuCoresGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GTE);
        return this;
    }

    public ClusterWhereInput provisionedCpuCoresGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GTE);
        return this;
    }

    public void setProvisionedCpuCoresGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GTE);
        }
    }

    public boolean getProvisionedCpuCoresGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GTE);
    }

    public ClusterWhereInput provisionedCpuCoresIn(List<Integer> provisionedCpuCoresIn) {

        this.provisionedCpuCoresIn = provisionedCpuCoresIn;
        return this;
    }

    public ClusterWhereInput addProvisionedCpuCoresInItem(Integer provisionedCpuCoresInItem) {
        if (this.provisionedCpuCoresIn == null) {
            this.provisionedCpuCoresIn = new ArrayList<Integer>();
        }
        this.provisionedCpuCoresIn.add(provisionedCpuCoresInItem);
        return this;
    }

    /**
     * Get provisionedCpuCoresIn
     *
     * @return provisionedCpuCoresIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getProvisionedCpuCoresIn() {
        return provisionedCpuCoresIn;
    }

    public void setProvisionedCpuCoresIn(List<Integer> provisionedCpuCoresIn) {
        this.provisionedCpuCoresIn = provisionedCpuCoresIn;
    }

    public ClusterWhereInput provisionedCpuCoresIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_IN);
        return this;
    }

    public ClusterWhereInput provisionedCpuCoresIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_IN);
        return this;
    }

    public void setProvisionedCpuCoresIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_IN);
        }
    }

    public boolean getProvisionedCpuCoresIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_IN);
    }

    public ClusterWhereInput provisionedCpuCoresLt(Integer provisionedCpuCoresLt) {

        this.provisionedCpuCoresLt = provisionedCpuCoresLt;
        return this;
    }

    /**
     * Get provisionedCpuCoresLt
     *
     * @return provisionedCpuCoresLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresLt() {
        return provisionedCpuCoresLt;
    }

    public void setProvisionedCpuCoresLt(Integer provisionedCpuCoresLt) {
        this.provisionedCpuCoresLt = provisionedCpuCoresLt;
    }

    public ClusterWhereInput provisionedCpuCoresLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LT);
        return this;
    }

    public ClusterWhereInput provisionedCpuCoresLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LT);
        return this;
    }

    public void setProvisionedCpuCoresLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LT);
        }
    }

    public boolean getProvisionedCpuCoresLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LT);
    }

    public ClusterWhereInput provisionedCpuCoresLte(Integer provisionedCpuCoresLte) {

        this.provisionedCpuCoresLte = provisionedCpuCoresLte;
        return this;
    }

    /**
     * Get provisionedCpuCoresLte
     *
     * @return provisionedCpuCoresLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresLte() {
        return provisionedCpuCoresLte;
    }

    public void setProvisionedCpuCoresLte(Integer provisionedCpuCoresLte) {
        this.provisionedCpuCoresLte = provisionedCpuCoresLte;
    }

    public ClusterWhereInput provisionedCpuCoresLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LTE);
        return this;
    }

    public ClusterWhereInput provisionedCpuCoresLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LTE);
        return this;
    }

    public void setProvisionedCpuCoresLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LTE);
        }
    }

    public boolean getProvisionedCpuCoresLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LTE);
    }

    public ClusterWhereInput provisionedCpuCoresNot(Integer provisionedCpuCoresNot) {

        this.provisionedCpuCoresNot = provisionedCpuCoresNot;
        return this;
    }

    /**
     * Get provisionedCpuCoresNot
     *
     * @return provisionedCpuCoresNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresNot() {
        return provisionedCpuCoresNot;
    }

    public void setProvisionedCpuCoresNot(Integer provisionedCpuCoresNot) {
        this.provisionedCpuCoresNot = provisionedCpuCoresNot;
    }

    public ClusterWhereInput provisionedCpuCoresNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT);
        return this;
    }

    public ClusterWhereInput provisionedCpuCoresNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT);
        return this;
    }

    public void setProvisionedCpuCoresNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT);
        }
    }

    public boolean getProvisionedCpuCoresNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT);
    }

    public ClusterWhereInput provisionedCpuCoresNotIn(List<Integer> provisionedCpuCoresNotIn) {

        this.provisionedCpuCoresNotIn = provisionedCpuCoresNotIn;
        return this;
    }

    public ClusterWhereInput addProvisionedCpuCoresNotInItem(Integer provisionedCpuCoresNotInItem) {
        if (this.provisionedCpuCoresNotIn == null) {
            this.provisionedCpuCoresNotIn = new ArrayList<Integer>();
        }
        this.provisionedCpuCoresNotIn.add(provisionedCpuCoresNotInItem);
        return this;
    }

    /**
     * Get provisionedCpuCoresNotIn
     *
     * @return provisionedCpuCoresNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getProvisionedCpuCoresNotIn() {
        return provisionedCpuCoresNotIn;
    }

    public void setProvisionedCpuCoresNotIn(List<Integer> provisionedCpuCoresNotIn) {
        this.provisionedCpuCoresNotIn = provisionedCpuCoresNotIn;
    }

    public ClusterWhereInput provisionedCpuCoresNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT_IN);
        return this;
    }

    public ClusterWhereInput provisionedCpuCoresNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT_IN);
        return this;
    }

    public void setProvisionedCpuCoresNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT_IN);
        }
    }

    public boolean getProvisionedCpuCoresNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT_IN);
    }

    public ClusterWhereInput provisionedForActiveVmRatio(Double provisionedForActiveVmRatio) {

        this.provisionedForActiveVmRatio = provisionedForActiveVmRatio;
        return this;
    }

    /**
     * Get provisionedForActiveVmRatio
     *
     * @return provisionedForActiveVmRatio
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getProvisionedForActiveVmRatio() {
        return provisionedForActiveVmRatio;
    }

    public void setProvisionedForActiveVmRatio(Double provisionedForActiveVmRatio) {
        this.provisionedForActiveVmRatio = provisionedForActiveVmRatio;
    }

    public ClusterWhereInput provisionedForActiveVmRatio_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO);
        return this;
    }

    public ClusterWhereInput provisionedForActiveVmRatio_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO);
        return this;
    }

    public void setProvisionedForActiveVmRatio_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO);
        }
    }

    public boolean getProvisionedForActiveVmRatio_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO);
    }

    public ClusterWhereInput provisionedForActiveVmRatioGt(Double provisionedForActiveVmRatioGt) {

        this.provisionedForActiveVmRatioGt = provisionedForActiveVmRatioGt;
        return this;
    }

    /**
     * Get provisionedForActiveVmRatioGt
     *
     * @return provisionedForActiveVmRatioGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getProvisionedForActiveVmRatioGt() {
        return provisionedForActiveVmRatioGt;
    }

    public void setProvisionedForActiveVmRatioGt(Double provisionedForActiveVmRatioGt) {
        this.provisionedForActiveVmRatioGt = provisionedForActiveVmRatioGt;
    }

    public ClusterWhereInput provisionedForActiveVmRatioGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_GT);
        return this;
    }

    public ClusterWhereInput provisionedForActiveVmRatioGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_GT);
        return this;
    }

    public void setProvisionedForActiveVmRatioGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_GT);
        }
    }

    public boolean getProvisionedForActiveVmRatioGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_GT);
    }

    public ClusterWhereInput provisionedForActiveVmRatioGte(Double provisionedForActiveVmRatioGte) {

        this.provisionedForActiveVmRatioGte = provisionedForActiveVmRatioGte;
        return this;
    }

    /**
     * Get provisionedForActiveVmRatioGte
     *
     * @return provisionedForActiveVmRatioGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getProvisionedForActiveVmRatioGte() {
        return provisionedForActiveVmRatioGte;
    }

    public void setProvisionedForActiveVmRatioGte(Double provisionedForActiveVmRatioGte) {
        this.provisionedForActiveVmRatioGte = provisionedForActiveVmRatioGte;
    }

    public ClusterWhereInput provisionedForActiveVmRatioGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_GTE);
        return this;
    }

    public ClusterWhereInput provisionedForActiveVmRatioGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_GTE);
        return this;
    }

    public void setProvisionedForActiveVmRatioGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_GTE);
        }
    }

    public boolean getProvisionedForActiveVmRatioGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_GTE);
    }

    public ClusterWhereInput provisionedForActiveVmRatioIn(
            List<Double> provisionedForActiveVmRatioIn) {

        this.provisionedForActiveVmRatioIn = provisionedForActiveVmRatioIn;
        return this;
    }

    public ClusterWhereInput addProvisionedForActiveVmRatioInItem(
            Double provisionedForActiveVmRatioInItem) {
        if (this.provisionedForActiveVmRatioIn == null) {
            this.provisionedForActiveVmRatioIn = new ArrayList<Double>();
        }
        this.provisionedForActiveVmRatioIn.add(provisionedForActiveVmRatioInItem);
        return this;
    }

    /**
     * Get provisionedForActiveVmRatioIn
     *
     * @return provisionedForActiveVmRatioIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getProvisionedForActiveVmRatioIn() {
        return provisionedForActiveVmRatioIn;
    }

    public void setProvisionedForActiveVmRatioIn(List<Double> provisionedForActiveVmRatioIn) {
        this.provisionedForActiveVmRatioIn = provisionedForActiveVmRatioIn;
    }

    public ClusterWhereInput provisionedForActiveVmRatioIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_IN);
        return this;
    }

    public ClusterWhereInput provisionedForActiveVmRatioIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_IN);
        return this;
    }

    public void setProvisionedForActiveVmRatioIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_IN);
        }
    }

    public boolean getProvisionedForActiveVmRatioIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_IN);
    }

    public ClusterWhereInput provisionedForActiveVmRatioLt(Double provisionedForActiveVmRatioLt) {

        this.provisionedForActiveVmRatioLt = provisionedForActiveVmRatioLt;
        return this;
    }

    /**
     * Get provisionedForActiveVmRatioLt
     *
     * @return provisionedForActiveVmRatioLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getProvisionedForActiveVmRatioLt() {
        return provisionedForActiveVmRatioLt;
    }

    public void setProvisionedForActiveVmRatioLt(Double provisionedForActiveVmRatioLt) {
        this.provisionedForActiveVmRatioLt = provisionedForActiveVmRatioLt;
    }

    public ClusterWhereInput provisionedForActiveVmRatioLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_LT);
        return this;
    }

    public ClusterWhereInput provisionedForActiveVmRatioLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_LT);
        return this;
    }

    public void setProvisionedForActiveVmRatioLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_LT);
        }
    }

    public boolean getProvisionedForActiveVmRatioLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_LT);
    }

    public ClusterWhereInput provisionedForActiveVmRatioLte(Double provisionedForActiveVmRatioLte) {

        this.provisionedForActiveVmRatioLte = provisionedForActiveVmRatioLte;
        return this;
    }

    /**
     * Get provisionedForActiveVmRatioLte
     *
     * @return provisionedForActiveVmRatioLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getProvisionedForActiveVmRatioLte() {
        return provisionedForActiveVmRatioLte;
    }

    public void setProvisionedForActiveVmRatioLte(Double provisionedForActiveVmRatioLte) {
        this.provisionedForActiveVmRatioLte = provisionedForActiveVmRatioLte;
    }

    public ClusterWhereInput provisionedForActiveVmRatioLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_LTE);
        return this;
    }

    public ClusterWhereInput provisionedForActiveVmRatioLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_LTE);
        return this;
    }

    public void setProvisionedForActiveVmRatioLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_LTE);
        }
    }

    public boolean getProvisionedForActiveVmRatioLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_LTE);
    }

    public ClusterWhereInput provisionedForActiveVmRatioNot(Double provisionedForActiveVmRatioNot) {

        this.provisionedForActiveVmRatioNot = provisionedForActiveVmRatioNot;
        return this;
    }

    /**
     * Get provisionedForActiveVmRatioNot
     *
     * @return provisionedForActiveVmRatioNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getProvisionedForActiveVmRatioNot() {
        return provisionedForActiveVmRatioNot;
    }

    public void setProvisionedForActiveVmRatioNot(Double provisionedForActiveVmRatioNot) {
        this.provisionedForActiveVmRatioNot = provisionedForActiveVmRatioNot;
    }

    public ClusterWhereInput provisionedForActiveVmRatioNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_NOT);
        return this;
    }

    public ClusterWhereInput provisionedForActiveVmRatioNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_NOT);
        return this;
    }

    public void setProvisionedForActiveVmRatioNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_NOT);
        }
    }

    public boolean getProvisionedForActiveVmRatioNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_NOT);
    }

    public ClusterWhereInput provisionedForActiveVmRatioNotIn(
            List<Double> provisionedForActiveVmRatioNotIn) {

        this.provisionedForActiveVmRatioNotIn = provisionedForActiveVmRatioNotIn;
        return this;
    }

    public ClusterWhereInput addProvisionedForActiveVmRatioNotInItem(
            Double provisionedForActiveVmRatioNotInItem) {
        if (this.provisionedForActiveVmRatioNotIn == null) {
            this.provisionedForActiveVmRatioNotIn = new ArrayList<Double>();
        }
        this.provisionedForActiveVmRatioNotIn.add(provisionedForActiveVmRatioNotInItem);
        return this;
    }

    /**
     * Get provisionedForActiveVmRatioNotIn
     *
     * @return provisionedForActiveVmRatioNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getProvisionedForActiveVmRatioNotIn() {
        return provisionedForActiveVmRatioNotIn;
    }

    public void setProvisionedForActiveVmRatioNotIn(List<Double> provisionedForActiveVmRatioNotIn) {
        this.provisionedForActiveVmRatioNotIn = provisionedForActiveVmRatioNotIn;
    }

    public ClusterWhereInput provisionedForActiveVmRatioNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_NOT_IN);
        return this;
    }

    public ClusterWhereInput provisionedForActiveVmRatioNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_NOT_IN);
        return this;
    }

    public void setProvisionedForActiveVmRatioNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_NOT_IN);
        }
    }

    public boolean getProvisionedForActiveVmRatioNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO_NOT_IN);
    }

    public ClusterWhereInput provisionedMemoryBytes(Long provisionedMemoryBytes) {

        this.provisionedMemoryBytes = provisionedMemoryBytes;
        return this;
    }

    /**
     * Get provisionedMemoryBytes
     *
     * @return provisionedMemoryBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getProvisionedMemoryBytes() {
        return provisionedMemoryBytes;
    }

    public void setProvisionedMemoryBytes(Long provisionedMemoryBytes) {
        this.provisionedMemoryBytes = provisionedMemoryBytes;
    }

    public ClusterWhereInput provisionedMemoryBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES);
        return this;
    }

    public ClusterWhereInput provisionedMemoryBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES);
        return this;
    }

    public void setProvisionedMemoryBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES);
        }
    }

    public boolean getProvisionedMemoryBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES);
    }

    public ClusterWhereInput provisionedMemoryBytesGt(Long provisionedMemoryBytesGt) {

        this.provisionedMemoryBytesGt = provisionedMemoryBytesGt;
        return this;
    }

    /**
     * Get provisionedMemoryBytesGt
     *
     * @return provisionedMemoryBytesGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getProvisionedMemoryBytesGt() {
        return provisionedMemoryBytesGt;
    }

    public void setProvisionedMemoryBytesGt(Long provisionedMemoryBytesGt) {
        this.provisionedMemoryBytesGt = provisionedMemoryBytesGt;
    }

    public ClusterWhereInput provisionedMemoryBytesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GT);
        return this;
    }

    public ClusterWhereInput provisionedMemoryBytesGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GT);
        return this;
    }

    public void setProvisionedMemoryBytesGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GT);
        }
    }

    public boolean getProvisionedMemoryBytesGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GT);
    }

    public ClusterWhereInput provisionedMemoryBytesGte(Long provisionedMemoryBytesGte) {

        this.provisionedMemoryBytesGte = provisionedMemoryBytesGte;
        return this;
    }

    /**
     * Get provisionedMemoryBytesGte
     *
     * @return provisionedMemoryBytesGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getProvisionedMemoryBytesGte() {
        return provisionedMemoryBytesGte;
    }

    public void setProvisionedMemoryBytesGte(Long provisionedMemoryBytesGte) {
        this.provisionedMemoryBytesGte = provisionedMemoryBytesGte;
    }

    public ClusterWhereInput provisionedMemoryBytesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GTE);
        return this;
    }

    public ClusterWhereInput provisionedMemoryBytesGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GTE);
        return this;
    }

    public void setProvisionedMemoryBytesGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GTE);
        }
    }

    public boolean getProvisionedMemoryBytesGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GTE);
    }

    public ClusterWhereInput provisionedMemoryBytesIn(List<Long> provisionedMemoryBytesIn) {

        this.provisionedMemoryBytesIn = provisionedMemoryBytesIn;
        return this;
    }

    public ClusterWhereInput addProvisionedMemoryBytesInItem(Long provisionedMemoryBytesInItem) {
        if (this.provisionedMemoryBytesIn == null) {
            this.provisionedMemoryBytesIn = new ArrayList<Long>();
        }
        this.provisionedMemoryBytesIn.add(provisionedMemoryBytesInItem);
        return this;
    }

    /**
     * Get provisionedMemoryBytesIn
     *
     * @return provisionedMemoryBytesIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getProvisionedMemoryBytesIn() {
        return provisionedMemoryBytesIn;
    }

    public void setProvisionedMemoryBytesIn(List<Long> provisionedMemoryBytesIn) {
        this.provisionedMemoryBytesIn = provisionedMemoryBytesIn;
    }

    public ClusterWhereInput provisionedMemoryBytesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_IN);
        return this;
    }

    public ClusterWhereInput provisionedMemoryBytesIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_IN);
        return this;
    }

    public void setProvisionedMemoryBytesIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_IN);
        }
    }

    public boolean getProvisionedMemoryBytesIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_IN);
    }

    public ClusterWhereInput provisionedMemoryBytesLt(Long provisionedMemoryBytesLt) {

        this.provisionedMemoryBytesLt = provisionedMemoryBytesLt;
        return this;
    }

    /**
     * Get provisionedMemoryBytesLt
     *
     * @return provisionedMemoryBytesLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getProvisionedMemoryBytesLt() {
        return provisionedMemoryBytesLt;
    }

    public void setProvisionedMemoryBytesLt(Long provisionedMemoryBytesLt) {
        this.provisionedMemoryBytesLt = provisionedMemoryBytesLt;
    }

    public ClusterWhereInput provisionedMemoryBytesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LT);
        return this;
    }

    public ClusterWhereInput provisionedMemoryBytesLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LT);
        return this;
    }

    public void setProvisionedMemoryBytesLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LT);
        }
    }

    public boolean getProvisionedMemoryBytesLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LT);
    }

    public ClusterWhereInput provisionedMemoryBytesLte(Long provisionedMemoryBytesLte) {

        this.provisionedMemoryBytesLte = provisionedMemoryBytesLte;
        return this;
    }

    /**
     * Get provisionedMemoryBytesLte
     *
     * @return provisionedMemoryBytesLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getProvisionedMemoryBytesLte() {
        return provisionedMemoryBytesLte;
    }

    public void setProvisionedMemoryBytesLte(Long provisionedMemoryBytesLte) {
        this.provisionedMemoryBytesLte = provisionedMemoryBytesLte;
    }

    public ClusterWhereInput provisionedMemoryBytesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LTE);
        return this;
    }

    public ClusterWhereInput provisionedMemoryBytesLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LTE);
        return this;
    }

    public void setProvisionedMemoryBytesLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LTE);
        }
    }

    public boolean getProvisionedMemoryBytesLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LTE);
    }

    public ClusterWhereInput provisionedMemoryBytesNot(Long provisionedMemoryBytesNot) {

        this.provisionedMemoryBytesNot = provisionedMemoryBytesNot;
        return this;
    }

    /**
     * Get provisionedMemoryBytesNot
     *
     * @return provisionedMemoryBytesNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getProvisionedMemoryBytesNot() {
        return provisionedMemoryBytesNot;
    }

    public void setProvisionedMemoryBytesNot(Long provisionedMemoryBytesNot) {
        this.provisionedMemoryBytesNot = provisionedMemoryBytesNot;
    }

    public ClusterWhereInput provisionedMemoryBytesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT);
        return this;
    }

    public ClusterWhereInput provisionedMemoryBytesNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT);
        return this;
    }

    public void setProvisionedMemoryBytesNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT);
        }
    }

    public boolean getProvisionedMemoryBytesNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT);
    }

    public ClusterWhereInput provisionedMemoryBytesNotIn(List<Long> provisionedMemoryBytesNotIn) {

        this.provisionedMemoryBytesNotIn = provisionedMemoryBytesNotIn;
        return this;
    }

    public ClusterWhereInput addProvisionedMemoryBytesNotInItem(
            Long provisionedMemoryBytesNotInItem) {
        if (this.provisionedMemoryBytesNotIn == null) {
            this.provisionedMemoryBytesNotIn = new ArrayList<Long>();
        }
        this.provisionedMemoryBytesNotIn.add(provisionedMemoryBytesNotInItem);
        return this;
    }

    /**
     * Get provisionedMemoryBytesNotIn
     *
     * @return provisionedMemoryBytesNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getProvisionedMemoryBytesNotIn() {
        return provisionedMemoryBytesNotIn;
    }

    public void setProvisionedMemoryBytesNotIn(List<Long> provisionedMemoryBytesNotIn) {
        this.provisionedMemoryBytesNotIn = provisionedMemoryBytesNotIn;
    }

    public ClusterWhereInput provisionedMemoryBytesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT_IN);
        return this;
    }

    public ClusterWhereInput provisionedMemoryBytesNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT_IN);
        return this;
    }

    public void setProvisionedMemoryBytesNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT_IN);
        }
    }

    public boolean getProvisionedMemoryBytesNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT_IN);
    }

    public ClusterWhereInput provisionedRatio(Double provisionedRatio) {

        this.provisionedRatio = provisionedRatio;
        return this;
    }

    /**
     * Get provisionedRatio
     *
     * @return provisionedRatio
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getProvisionedRatio() {
        return provisionedRatio;
    }

    public void setProvisionedRatio(Double provisionedRatio) {
        this.provisionedRatio = provisionedRatio;
    }

    public ClusterWhereInput provisionedRatio_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_RATIO);
        return this;
    }

    public ClusterWhereInput provisionedRatio_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_RATIO);
        return this;
    }

    public void setProvisionedRatio_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_RATIO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_RATIO);
        }
    }

    public boolean getProvisionedRatio_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_RATIO);
    }

    public ClusterWhereInput provisionedRatioGt(Double provisionedRatioGt) {

        this.provisionedRatioGt = provisionedRatioGt;
        return this;
    }

    /**
     * Get provisionedRatioGt
     *
     * @return provisionedRatioGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getProvisionedRatioGt() {
        return provisionedRatioGt;
    }

    public void setProvisionedRatioGt(Double provisionedRatioGt) {
        this.provisionedRatioGt = provisionedRatioGt;
    }

    public ClusterWhereInput provisionedRatioGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_RATIO_GT);
        return this;
    }

    public ClusterWhereInput provisionedRatioGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_RATIO_GT);
        return this;
    }

    public void setProvisionedRatioGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_RATIO_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_RATIO_GT);
        }
    }

    public boolean getProvisionedRatioGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_RATIO_GT);
    }

    public ClusterWhereInput provisionedRatioGte(Double provisionedRatioGte) {

        this.provisionedRatioGte = provisionedRatioGte;
        return this;
    }

    /**
     * Get provisionedRatioGte
     *
     * @return provisionedRatioGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getProvisionedRatioGte() {
        return provisionedRatioGte;
    }

    public void setProvisionedRatioGte(Double provisionedRatioGte) {
        this.provisionedRatioGte = provisionedRatioGte;
    }

    public ClusterWhereInput provisionedRatioGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_RATIO_GTE);
        return this;
    }

    public ClusterWhereInput provisionedRatioGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_RATIO_GTE);
        return this;
    }

    public void setProvisionedRatioGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_RATIO_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_RATIO_GTE);
        }
    }

    public boolean getProvisionedRatioGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_RATIO_GTE);
    }

    public ClusterWhereInput provisionedRatioIn(List<Double> provisionedRatioIn) {

        this.provisionedRatioIn = provisionedRatioIn;
        return this;
    }

    public ClusterWhereInput addProvisionedRatioInItem(Double provisionedRatioInItem) {
        if (this.provisionedRatioIn == null) {
            this.provisionedRatioIn = new ArrayList<Double>();
        }
        this.provisionedRatioIn.add(provisionedRatioInItem);
        return this;
    }

    /**
     * Get provisionedRatioIn
     *
     * @return provisionedRatioIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getProvisionedRatioIn() {
        return provisionedRatioIn;
    }

    public void setProvisionedRatioIn(List<Double> provisionedRatioIn) {
        this.provisionedRatioIn = provisionedRatioIn;
    }

    public ClusterWhereInput provisionedRatioIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_RATIO_IN);
        return this;
    }

    public ClusterWhereInput provisionedRatioIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_RATIO_IN);
        return this;
    }

    public void setProvisionedRatioIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_RATIO_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_RATIO_IN);
        }
    }

    public boolean getProvisionedRatioIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_RATIO_IN);
    }

    public ClusterWhereInput provisionedRatioLt(Double provisionedRatioLt) {

        this.provisionedRatioLt = provisionedRatioLt;
        return this;
    }

    /**
     * Get provisionedRatioLt
     *
     * @return provisionedRatioLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getProvisionedRatioLt() {
        return provisionedRatioLt;
    }

    public void setProvisionedRatioLt(Double provisionedRatioLt) {
        this.provisionedRatioLt = provisionedRatioLt;
    }

    public ClusterWhereInput provisionedRatioLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_RATIO_LT);
        return this;
    }

    public ClusterWhereInput provisionedRatioLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_RATIO_LT);
        return this;
    }

    public void setProvisionedRatioLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_RATIO_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_RATIO_LT);
        }
    }

    public boolean getProvisionedRatioLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_RATIO_LT);
    }

    public ClusterWhereInput provisionedRatioLte(Double provisionedRatioLte) {

        this.provisionedRatioLte = provisionedRatioLte;
        return this;
    }

    /**
     * Get provisionedRatioLte
     *
     * @return provisionedRatioLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getProvisionedRatioLte() {
        return provisionedRatioLte;
    }

    public void setProvisionedRatioLte(Double provisionedRatioLte) {
        this.provisionedRatioLte = provisionedRatioLte;
    }

    public ClusterWhereInput provisionedRatioLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_RATIO_LTE);
        return this;
    }

    public ClusterWhereInput provisionedRatioLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_RATIO_LTE);
        return this;
    }

    public void setProvisionedRatioLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_RATIO_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_RATIO_LTE);
        }
    }

    public boolean getProvisionedRatioLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_RATIO_LTE);
    }

    public ClusterWhereInput provisionedRatioNot(Double provisionedRatioNot) {

        this.provisionedRatioNot = provisionedRatioNot;
        return this;
    }

    /**
     * Get provisionedRatioNot
     *
     * @return provisionedRatioNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getProvisionedRatioNot() {
        return provisionedRatioNot;
    }

    public void setProvisionedRatioNot(Double provisionedRatioNot) {
        this.provisionedRatioNot = provisionedRatioNot;
    }

    public ClusterWhereInput provisionedRatioNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_RATIO_NOT);
        return this;
    }

    public ClusterWhereInput provisionedRatioNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_RATIO_NOT);
        return this;
    }

    public void setProvisionedRatioNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_RATIO_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_RATIO_NOT);
        }
    }

    public boolean getProvisionedRatioNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_RATIO_NOT);
    }

    public ClusterWhereInput provisionedRatioNotIn(List<Double> provisionedRatioNotIn) {

        this.provisionedRatioNotIn = provisionedRatioNotIn;
        return this;
    }

    public ClusterWhereInput addProvisionedRatioNotInItem(Double provisionedRatioNotInItem) {
        if (this.provisionedRatioNotIn == null) {
            this.provisionedRatioNotIn = new ArrayList<Double>();
        }
        this.provisionedRatioNotIn.add(provisionedRatioNotInItem);
        return this;
    }

    /**
     * Get provisionedRatioNotIn
     *
     * @return provisionedRatioNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getProvisionedRatioNotIn() {
        return provisionedRatioNotIn;
    }

    public void setProvisionedRatioNotIn(List<Double> provisionedRatioNotIn) {
        this.provisionedRatioNotIn = provisionedRatioNotIn;
    }

    public ClusterWhereInput provisionedRatioNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_RATIO_NOT_IN);
        return this;
    }

    public ClusterWhereInput provisionedRatioNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_RATIO_NOT_IN);
        return this;
    }

    public void setProvisionedRatioNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_RATIO_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_RATIO_NOT_IN);
        }
    }

    public boolean getProvisionedRatioNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_RATIO_NOT_IN);
    }

    public ClusterWhereInput rdmaEnabled(Boolean rdmaEnabled) {

        this.rdmaEnabled = rdmaEnabled;
        return this;
    }

    /**
     * Get rdmaEnabled
     *
     * @return rdmaEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getRdmaEnabled() {
        return rdmaEnabled;
    }

    public void setRdmaEnabled(Boolean rdmaEnabled) {
        this.rdmaEnabled = rdmaEnabled;
    }

    public ClusterWhereInput rdmaEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RDMA_ENABLED);
        return this;
    }

    public ClusterWhereInput rdmaEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RDMA_ENABLED);
        return this;
    }

    public void setRdmaEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RDMA_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RDMA_ENABLED);
        }
    }

    public boolean getRdmaEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RDMA_ENABLED);
    }

    public ClusterWhereInput rdmaEnabledNot(Boolean rdmaEnabledNot) {

        this.rdmaEnabledNot = rdmaEnabledNot;
        return this;
    }

    /**
     * Get rdmaEnabledNot
     *
     * @return rdmaEnabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getRdmaEnabledNot() {
        return rdmaEnabledNot;
    }

    public void setRdmaEnabledNot(Boolean rdmaEnabledNot) {
        this.rdmaEnabledNot = rdmaEnabledNot;
    }

    public ClusterWhereInput rdmaEnabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RDMA_ENABLED_NOT);
        return this;
    }

    public ClusterWhereInput rdmaEnabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RDMA_ENABLED_NOT);
        return this;
    }

    public void setRdmaEnabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RDMA_ENABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RDMA_ENABLED_NOT);
        }
    }

    public boolean getRdmaEnabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RDMA_ENABLED_NOT);
    }

    public ClusterWhereInput recoverDataSize(Long recoverDataSize) {

        this.recoverDataSize = recoverDataSize;
        return this;
    }

    /**
     * Get recoverDataSize
     *
     * @return recoverDataSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRecoverDataSize() {
        return recoverDataSize;
    }

    public void setRecoverDataSize(Long recoverDataSize) {
        this.recoverDataSize = recoverDataSize;
    }

    public ClusterWhereInput recoverDataSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOVER_DATA_SIZE);
        return this;
    }

    public ClusterWhereInput recoverDataSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOVER_DATA_SIZE);
        return this;
    }

    public void setRecoverDataSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOVER_DATA_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOVER_DATA_SIZE);
        }
    }

    public boolean getRecoverDataSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOVER_DATA_SIZE);
    }

    public ClusterWhereInput recoverDataSizeGt(Long recoverDataSizeGt) {

        this.recoverDataSizeGt = recoverDataSizeGt;
        return this;
    }

    /**
     * Get recoverDataSizeGt
     *
     * @return recoverDataSizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRecoverDataSizeGt() {
        return recoverDataSizeGt;
    }

    public void setRecoverDataSizeGt(Long recoverDataSizeGt) {
        this.recoverDataSizeGt = recoverDataSizeGt;
    }

    public ClusterWhereInput recoverDataSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOVER_DATA_SIZE_GT);
        return this;
    }

    public ClusterWhereInput recoverDataSizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOVER_DATA_SIZE_GT);
        return this;
    }

    public void setRecoverDataSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOVER_DATA_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOVER_DATA_SIZE_GT);
        }
    }

    public boolean getRecoverDataSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOVER_DATA_SIZE_GT);
    }

    public ClusterWhereInput recoverDataSizeGte(Long recoverDataSizeGte) {

        this.recoverDataSizeGte = recoverDataSizeGte;
        return this;
    }

    /**
     * Get recoverDataSizeGte
     *
     * @return recoverDataSizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRecoverDataSizeGte() {
        return recoverDataSizeGte;
    }

    public void setRecoverDataSizeGte(Long recoverDataSizeGte) {
        this.recoverDataSizeGte = recoverDataSizeGte;
    }

    public ClusterWhereInput recoverDataSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOVER_DATA_SIZE_GTE);
        return this;
    }

    public ClusterWhereInput recoverDataSizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOVER_DATA_SIZE_GTE);
        return this;
    }

    public void setRecoverDataSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOVER_DATA_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOVER_DATA_SIZE_GTE);
        }
    }

    public boolean getRecoverDataSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOVER_DATA_SIZE_GTE);
    }

    public ClusterWhereInput recoverDataSizeIn(List<Long> recoverDataSizeIn) {

        this.recoverDataSizeIn = recoverDataSizeIn;
        return this;
    }

    public ClusterWhereInput addRecoverDataSizeInItem(Long recoverDataSizeInItem) {
        if (this.recoverDataSizeIn == null) {
            this.recoverDataSizeIn = new ArrayList<Long>();
        }
        this.recoverDataSizeIn.add(recoverDataSizeInItem);
        return this;
    }

    /**
     * Get recoverDataSizeIn
     *
     * @return recoverDataSizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getRecoverDataSizeIn() {
        return recoverDataSizeIn;
    }

    public void setRecoverDataSizeIn(List<Long> recoverDataSizeIn) {
        this.recoverDataSizeIn = recoverDataSizeIn;
    }

    public ClusterWhereInput recoverDataSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOVER_DATA_SIZE_IN);
        return this;
    }

    public ClusterWhereInput recoverDataSizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOVER_DATA_SIZE_IN);
        return this;
    }

    public void setRecoverDataSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOVER_DATA_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOVER_DATA_SIZE_IN);
        }
    }

    public boolean getRecoverDataSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOVER_DATA_SIZE_IN);
    }

    public ClusterWhereInput recoverDataSizeLt(Long recoverDataSizeLt) {

        this.recoverDataSizeLt = recoverDataSizeLt;
        return this;
    }

    /**
     * Get recoverDataSizeLt
     *
     * @return recoverDataSizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRecoverDataSizeLt() {
        return recoverDataSizeLt;
    }

    public void setRecoverDataSizeLt(Long recoverDataSizeLt) {
        this.recoverDataSizeLt = recoverDataSizeLt;
    }

    public ClusterWhereInput recoverDataSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOVER_DATA_SIZE_LT);
        return this;
    }

    public ClusterWhereInput recoverDataSizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOVER_DATA_SIZE_LT);
        return this;
    }

    public void setRecoverDataSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOVER_DATA_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOVER_DATA_SIZE_LT);
        }
    }

    public boolean getRecoverDataSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOVER_DATA_SIZE_LT);
    }

    public ClusterWhereInput recoverDataSizeLte(Long recoverDataSizeLte) {

        this.recoverDataSizeLte = recoverDataSizeLte;
        return this;
    }

    /**
     * Get recoverDataSizeLte
     *
     * @return recoverDataSizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRecoverDataSizeLte() {
        return recoverDataSizeLte;
    }

    public void setRecoverDataSizeLte(Long recoverDataSizeLte) {
        this.recoverDataSizeLte = recoverDataSizeLte;
    }

    public ClusterWhereInput recoverDataSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOVER_DATA_SIZE_LTE);
        return this;
    }

    public ClusterWhereInput recoverDataSizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOVER_DATA_SIZE_LTE);
        return this;
    }

    public void setRecoverDataSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOVER_DATA_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOVER_DATA_SIZE_LTE);
        }
    }

    public boolean getRecoverDataSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOVER_DATA_SIZE_LTE);
    }

    public ClusterWhereInput recoverDataSizeNot(Long recoverDataSizeNot) {

        this.recoverDataSizeNot = recoverDataSizeNot;
        return this;
    }

    /**
     * Get recoverDataSizeNot
     *
     * @return recoverDataSizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRecoverDataSizeNot() {
        return recoverDataSizeNot;
    }

    public void setRecoverDataSizeNot(Long recoverDataSizeNot) {
        this.recoverDataSizeNot = recoverDataSizeNot;
    }

    public ClusterWhereInput recoverDataSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOVER_DATA_SIZE_NOT);
        return this;
    }

    public ClusterWhereInput recoverDataSizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOVER_DATA_SIZE_NOT);
        return this;
    }

    public void setRecoverDataSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOVER_DATA_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOVER_DATA_SIZE_NOT);
        }
    }

    public boolean getRecoverDataSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOVER_DATA_SIZE_NOT);
    }

    public ClusterWhereInput recoverDataSizeNotIn(List<Long> recoverDataSizeNotIn) {

        this.recoverDataSizeNotIn = recoverDataSizeNotIn;
        return this;
    }

    public ClusterWhereInput addRecoverDataSizeNotInItem(Long recoverDataSizeNotInItem) {
        if (this.recoverDataSizeNotIn == null) {
            this.recoverDataSizeNotIn = new ArrayList<Long>();
        }
        this.recoverDataSizeNotIn.add(recoverDataSizeNotInItem);
        return this;
    }

    /**
     * Get recoverDataSizeNotIn
     *
     * @return recoverDataSizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getRecoverDataSizeNotIn() {
        return recoverDataSizeNotIn;
    }

    public void setRecoverDataSizeNotIn(List<Long> recoverDataSizeNotIn) {
        this.recoverDataSizeNotIn = recoverDataSizeNotIn;
    }

    public ClusterWhereInput recoverDataSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOVER_DATA_SIZE_NOT_IN);
        return this;
    }

    public ClusterWhereInput recoverDataSizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOVER_DATA_SIZE_NOT_IN);
        return this;
    }

    public void setRecoverDataSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOVER_DATA_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOVER_DATA_SIZE_NOT_IN);
        }
    }

    public boolean getRecoverDataSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOVER_DATA_SIZE_NOT_IN);
    }

    public ClusterWhereInput recoverSpeed(Long recoverSpeed) {

        this.recoverSpeed = recoverSpeed;
        return this;
    }

    /**
     * Get recoverSpeed
     *
     * @return recoverSpeed
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRecoverSpeed() {
        return recoverSpeed;
    }

    public void setRecoverSpeed(Long recoverSpeed) {
        this.recoverSpeed = recoverSpeed;
    }

    public ClusterWhereInput recoverSpeed_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOVER_SPEED);
        return this;
    }

    public ClusterWhereInput recoverSpeed_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOVER_SPEED);
        return this;
    }

    public void setRecoverSpeed_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOVER_SPEED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOVER_SPEED);
        }
    }

    public boolean getRecoverSpeed_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOVER_SPEED);
    }

    public ClusterWhereInput recoverSpeedGt(Long recoverSpeedGt) {

        this.recoverSpeedGt = recoverSpeedGt;
        return this;
    }

    /**
     * Get recoverSpeedGt
     *
     * @return recoverSpeedGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRecoverSpeedGt() {
        return recoverSpeedGt;
    }

    public void setRecoverSpeedGt(Long recoverSpeedGt) {
        this.recoverSpeedGt = recoverSpeedGt;
    }

    public ClusterWhereInput recoverSpeedGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOVER_SPEED_GT);
        return this;
    }

    public ClusterWhereInput recoverSpeedGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOVER_SPEED_GT);
        return this;
    }

    public void setRecoverSpeedGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOVER_SPEED_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOVER_SPEED_GT);
        }
    }

    public boolean getRecoverSpeedGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOVER_SPEED_GT);
    }

    public ClusterWhereInput recoverSpeedGte(Long recoverSpeedGte) {

        this.recoverSpeedGte = recoverSpeedGte;
        return this;
    }

    /**
     * Get recoverSpeedGte
     *
     * @return recoverSpeedGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRecoverSpeedGte() {
        return recoverSpeedGte;
    }

    public void setRecoverSpeedGte(Long recoverSpeedGte) {
        this.recoverSpeedGte = recoverSpeedGte;
    }

    public ClusterWhereInput recoverSpeedGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOVER_SPEED_GTE);
        return this;
    }

    public ClusterWhereInput recoverSpeedGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOVER_SPEED_GTE);
        return this;
    }

    public void setRecoverSpeedGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOVER_SPEED_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOVER_SPEED_GTE);
        }
    }

    public boolean getRecoverSpeedGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOVER_SPEED_GTE);
    }

    public ClusterWhereInput recoverSpeedIn(List<Long> recoverSpeedIn) {

        this.recoverSpeedIn = recoverSpeedIn;
        return this;
    }

    public ClusterWhereInput addRecoverSpeedInItem(Long recoverSpeedInItem) {
        if (this.recoverSpeedIn == null) {
            this.recoverSpeedIn = new ArrayList<Long>();
        }
        this.recoverSpeedIn.add(recoverSpeedInItem);
        return this;
    }

    /**
     * Get recoverSpeedIn
     *
     * @return recoverSpeedIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getRecoverSpeedIn() {
        return recoverSpeedIn;
    }

    public void setRecoverSpeedIn(List<Long> recoverSpeedIn) {
        this.recoverSpeedIn = recoverSpeedIn;
    }

    public ClusterWhereInput recoverSpeedIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOVER_SPEED_IN);
        return this;
    }

    public ClusterWhereInput recoverSpeedIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOVER_SPEED_IN);
        return this;
    }

    public void setRecoverSpeedIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOVER_SPEED_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOVER_SPEED_IN);
        }
    }

    public boolean getRecoverSpeedIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOVER_SPEED_IN);
    }

    public ClusterWhereInput recoverSpeedLt(Long recoverSpeedLt) {

        this.recoverSpeedLt = recoverSpeedLt;
        return this;
    }

    /**
     * Get recoverSpeedLt
     *
     * @return recoverSpeedLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRecoverSpeedLt() {
        return recoverSpeedLt;
    }

    public void setRecoverSpeedLt(Long recoverSpeedLt) {
        this.recoverSpeedLt = recoverSpeedLt;
    }

    public ClusterWhereInput recoverSpeedLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOVER_SPEED_LT);
        return this;
    }

    public ClusterWhereInput recoverSpeedLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOVER_SPEED_LT);
        return this;
    }

    public void setRecoverSpeedLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOVER_SPEED_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOVER_SPEED_LT);
        }
    }

    public boolean getRecoverSpeedLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOVER_SPEED_LT);
    }

    public ClusterWhereInput recoverSpeedLte(Long recoverSpeedLte) {

        this.recoverSpeedLte = recoverSpeedLte;
        return this;
    }

    /**
     * Get recoverSpeedLte
     *
     * @return recoverSpeedLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRecoverSpeedLte() {
        return recoverSpeedLte;
    }

    public void setRecoverSpeedLte(Long recoverSpeedLte) {
        this.recoverSpeedLte = recoverSpeedLte;
    }

    public ClusterWhereInput recoverSpeedLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOVER_SPEED_LTE);
        return this;
    }

    public ClusterWhereInput recoverSpeedLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOVER_SPEED_LTE);
        return this;
    }

    public void setRecoverSpeedLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOVER_SPEED_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOVER_SPEED_LTE);
        }
    }

    public boolean getRecoverSpeedLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOVER_SPEED_LTE);
    }

    public ClusterWhereInput recoverSpeedNot(Long recoverSpeedNot) {

        this.recoverSpeedNot = recoverSpeedNot;
        return this;
    }

    /**
     * Get recoverSpeedNot
     *
     * @return recoverSpeedNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRecoverSpeedNot() {
        return recoverSpeedNot;
    }

    public void setRecoverSpeedNot(Long recoverSpeedNot) {
        this.recoverSpeedNot = recoverSpeedNot;
    }

    public ClusterWhereInput recoverSpeedNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOVER_SPEED_NOT);
        return this;
    }

    public ClusterWhereInput recoverSpeedNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOVER_SPEED_NOT);
        return this;
    }

    public void setRecoverSpeedNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOVER_SPEED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOVER_SPEED_NOT);
        }
    }

    public boolean getRecoverSpeedNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOVER_SPEED_NOT);
    }

    public ClusterWhereInput recoverSpeedNotIn(List<Long> recoverSpeedNotIn) {

        this.recoverSpeedNotIn = recoverSpeedNotIn;
        return this;
    }

    public ClusterWhereInput addRecoverSpeedNotInItem(Long recoverSpeedNotInItem) {
        if (this.recoverSpeedNotIn == null) {
            this.recoverSpeedNotIn = new ArrayList<Long>();
        }
        this.recoverSpeedNotIn.add(recoverSpeedNotInItem);
        return this;
    }

    /**
     * Get recoverSpeedNotIn
     *
     * @return recoverSpeedNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getRecoverSpeedNotIn() {
        return recoverSpeedNotIn;
    }

    public void setRecoverSpeedNotIn(List<Long> recoverSpeedNotIn) {
        this.recoverSpeedNotIn = recoverSpeedNotIn;
    }

    public ClusterWhereInput recoverSpeedNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOVER_SPEED_NOT_IN);
        return this;
    }

    public ClusterWhereInput recoverSpeedNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOVER_SPEED_NOT_IN);
        return this;
    }

    public void setRecoverSpeedNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOVER_SPEED_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOVER_SPEED_NOT_IN);
        }
    }

    public boolean getRecoverSpeedNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOVER_SPEED_NOT_IN);
    }

    public ClusterWhereInput reservedCpuCoresForSystemService(
            Integer reservedCpuCoresForSystemService) {

        this.reservedCpuCoresForSystemService = reservedCpuCoresForSystemService;
        return this;
    }

    /**
     * Get reservedCpuCoresForSystemService
     *
     * @return reservedCpuCoresForSystemService
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReservedCpuCoresForSystemService() {
        return reservedCpuCoresForSystemService;
    }

    public void setReservedCpuCoresForSystemService(Integer reservedCpuCoresForSystemService) {
        this.reservedCpuCoresForSystemService = reservedCpuCoresForSystemService;
    }

    public ClusterWhereInput reservedCpuCoresForSystemService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE);
        return this;
    }

    public ClusterWhereInput reservedCpuCoresForSystemService_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE);
        return this;
    }

    public void setReservedCpuCoresForSystemService_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE);
        }
    }

    public boolean getReservedCpuCoresForSystemService_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE);
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceGt(
            Integer reservedCpuCoresForSystemServiceGt) {

        this.reservedCpuCoresForSystemServiceGt = reservedCpuCoresForSystemServiceGt;
        return this;
    }

    /**
     * Get reservedCpuCoresForSystemServiceGt
     *
     * @return reservedCpuCoresForSystemServiceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReservedCpuCoresForSystemServiceGt() {
        return reservedCpuCoresForSystemServiceGt;
    }

    public void setReservedCpuCoresForSystemServiceGt(Integer reservedCpuCoresForSystemServiceGt) {
        this.reservedCpuCoresForSystemServiceGt = reservedCpuCoresForSystemServiceGt;
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_GT);
        return this;
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_GT);
        return this;
    }

    public void setReservedCpuCoresForSystemServiceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_GT);
        }
    }

    public boolean getReservedCpuCoresForSystemServiceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_GT);
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceGte(
            Integer reservedCpuCoresForSystemServiceGte) {

        this.reservedCpuCoresForSystemServiceGte = reservedCpuCoresForSystemServiceGte;
        return this;
    }

    /**
     * Get reservedCpuCoresForSystemServiceGte
     *
     * @return reservedCpuCoresForSystemServiceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReservedCpuCoresForSystemServiceGte() {
        return reservedCpuCoresForSystemServiceGte;
    }

    public void setReservedCpuCoresForSystemServiceGte(
            Integer reservedCpuCoresForSystemServiceGte) {
        this.reservedCpuCoresForSystemServiceGte = reservedCpuCoresForSystemServiceGte;
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_GTE);
        return this;
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_GTE);
        return this;
    }

    public void setReservedCpuCoresForSystemServiceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_GTE);
        }
    }

    public boolean getReservedCpuCoresForSystemServiceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_GTE);
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceIn(
            List<Integer> reservedCpuCoresForSystemServiceIn) {

        this.reservedCpuCoresForSystemServiceIn = reservedCpuCoresForSystemServiceIn;
        return this;
    }

    public ClusterWhereInput addReservedCpuCoresForSystemServiceInItem(
            Integer reservedCpuCoresForSystemServiceInItem) {
        if (this.reservedCpuCoresForSystemServiceIn == null) {
            this.reservedCpuCoresForSystemServiceIn = new ArrayList<Integer>();
        }
        this.reservedCpuCoresForSystemServiceIn.add(reservedCpuCoresForSystemServiceInItem);
        return this;
    }

    /**
     * Get reservedCpuCoresForSystemServiceIn
     *
     * @return reservedCpuCoresForSystemServiceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getReservedCpuCoresForSystemServiceIn() {
        return reservedCpuCoresForSystemServiceIn;
    }

    public void setReservedCpuCoresForSystemServiceIn(
            List<Integer> reservedCpuCoresForSystemServiceIn) {
        this.reservedCpuCoresForSystemServiceIn = reservedCpuCoresForSystemServiceIn;
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_IN);
        return this;
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_IN);
        return this;
    }

    public void setReservedCpuCoresForSystemServiceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_IN);
        }
    }

    public boolean getReservedCpuCoresForSystemServiceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_IN);
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceLt(
            Integer reservedCpuCoresForSystemServiceLt) {

        this.reservedCpuCoresForSystemServiceLt = reservedCpuCoresForSystemServiceLt;
        return this;
    }

    /**
     * Get reservedCpuCoresForSystemServiceLt
     *
     * @return reservedCpuCoresForSystemServiceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReservedCpuCoresForSystemServiceLt() {
        return reservedCpuCoresForSystemServiceLt;
    }

    public void setReservedCpuCoresForSystemServiceLt(Integer reservedCpuCoresForSystemServiceLt) {
        this.reservedCpuCoresForSystemServiceLt = reservedCpuCoresForSystemServiceLt;
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_LT);
        return this;
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_LT);
        return this;
    }

    public void setReservedCpuCoresForSystemServiceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_LT);
        }
    }

    public boolean getReservedCpuCoresForSystemServiceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_LT);
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceLte(
            Integer reservedCpuCoresForSystemServiceLte) {

        this.reservedCpuCoresForSystemServiceLte = reservedCpuCoresForSystemServiceLte;
        return this;
    }

    /**
     * Get reservedCpuCoresForSystemServiceLte
     *
     * @return reservedCpuCoresForSystemServiceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReservedCpuCoresForSystemServiceLte() {
        return reservedCpuCoresForSystemServiceLte;
    }

    public void setReservedCpuCoresForSystemServiceLte(
            Integer reservedCpuCoresForSystemServiceLte) {
        this.reservedCpuCoresForSystemServiceLte = reservedCpuCoresForSystemServiceLte;
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_LTE);
        return this;
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_LTE);
        return this;
    }

    public void setReservedCpuCoresForSystemServiceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_LTE);
        }
    }

    public boolean getReservedCpuCoresForSystemServiceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_LTE);
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceNot(
            Integer reservedCpuCoresForSystemServiceNot) {

        this.reservedCpuCoresForSystemServiceNot = reservedCpuCoresForSystemServiceNot;
        return this;
    }

    /**
     * Get reservedCpuCoresForSystemServiceNot
     *
     * @return reservedCpuCoresForSystemServiceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReservedCpuCoresForSystemServiceNot() {
        return reservedCpuCoresForSystemServiceNot;
    }

    public void setReservedCpuCoresForSystemServiceNot(
            Integer reservedCpuCoresForSystemServiceNot) {
        this.reservedCpuCoresForSystemServiceNot = reservedCpuCoresForSystemServiceNot;
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_NOT);
        return this;
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_NOT);
        return this;
    }

    public void setReservedCpuCoresForSystemServiceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_NOT);
        }
    }

    public boolean getReservedCpuCoresForSystemServiceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_NOT);
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceNotIn(
            List<Integer> reservedCpuCoresForSystemServiceNotIn) {

        this.reservedCpuCoresForSystemServiceNotIn = reservedCpuCoresForSystemServiceNotIn;
        return this;
    }

    public ClusterWhereInput addReservedCpuCoresForSystemServiceNotInItem(
            Integer reservedCpuCoresForSystemServiceNotInItem) {
        if (this.reservedCpuCoresForSystemServiceNotIn == null) {
            this.reservedCpuCoresForSystemServiceNotIn = new ArrayList<Integer>();
        }
        this.reservedCpuCoresForSystemServiceNotIn.add(reservedCpuCoresForSystemServiceNotInItem);
        return this;
    }

    /**
     * Get reservedCpuCoresForSystemServiceNotIn
     *
     * @return reservedCpuCoresForSystemServiceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getReservedCpuCoresForSystemServiceNotIn() {
        return reservedCpuCoresForSystemServiceNotIn;
    }

    public void setReservedCpuCoresForSystemServiceNotIn(
            List<Integer> reservedCpuCoresForSystemServiceNotIn) {
        this.reservedCpuCoresForSystemServiceNotIn = reservedCpuCoresForSystemServiceNotIn;
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_NOT_IN);
        return this;
    }

    public ClusterWhereInput reservedCpuCoresForSystemServiceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_NOT_IN);
        return this;
    }

    public void setReservedCpuCoresForSystemServiceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_NOT_IN);
        }
    }

    public boolean getReservedCpuCoresForSystemServiceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_NOT_IN);
    }

    public ClusterWhereInput runningVmNum(Integer runningVmNum) {

        this.runningVmNum = runningVmNum;
        return this;
    }

    /**
     * Get runningVmNum
     *
     * @return runningVmNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRunningVmNum() {
        return runningVmNum;
    }

    public void setRunningVmNum(Integer runningVmNum) {
        this.runningVmNum = runningVmNum;
    }

    public ClusterWhereInput runningVmNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM);
        return this;
    }

    public ClusterWhereInput runningVmNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM);
        return this;
    }

    public void setRunningVmNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM);
        }
    }

    public boolean getRunningVmNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNNING_VM_NUM);
    }

    public ClusterWhereInput runningVmNumGt(Integer runningVmNumGt) {

        this.runningVmNumGt = runningVmNumGt;
        return this;
    }

    /**
     * Get runningVmNumGt
     *
     * @return runningVmNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRunningVmNumGt() {
        return runningVmNumGt;
    }

    public void setRunningVmNumGt(Integer runningVmNumGt) {
        this.runningVmNumGt = runningVmNumGt;
    }

    public ClusterWhereInput runningVmNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_GT);
        return this;
    }

    public ClusterWhereInput runningVmNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_GT);
        return this;
    }

    public void setRunningVmNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_GT);
        }
    }

    public boolean getRunningVmNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNNING_VM_NUM_GT);
    }

    public ClusterWhereInput runningVmNumGte(Integer runningVmNumGte) {

        this.runningVmNumGte = runningVmNumGte;
        return this;
    }

    /**
     * Get runningVmNumGte
     *
     * @return runningVmNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRunningVmNumGte() {
        return runningVmNumGte;
    }

    public void setRunningVmNumGte(Integer runningVmNumGte) {
        this.runningVmNumGte = runningVmNumGte;
    }

    public ClusterWhereInput runningVmNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_GTE);
        return this;
    }

    public ClusterWhereInput runningVmNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_GTE);
        return this;
    }

    public void setRunningVmNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_GTE);
        }
    }

    public boolean getRunningVmNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNNING_VM_NUM_GTE);
    }

    public ClusterWhereInput runningVmNumIn(List<Integer> runningVmNumIn) {

        this.runningVmNumIn = runningVmNumIn;
        return this;
    }

    public ClusterWhereInput addRunningVmNumInItem(Integer runningVmNumInItem) {
        if (this.runningVmNumIn == null) {
            this.runningVmNumIn = new ArrayList<Integer>();
        }
        this.runningVmNumIn.add(runningVmNumInItem);
        return this;
    }

    /**
     * Get runningVmNumIn
     *
     * @return runningVmNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getRunningVmNumIn() {
        return runningVmNumIn;
    }

    public void setRunningVmNumIn(List<Integer> runningVmNumIn) {
        this.runningVmNumIn = runningVmNumIn;
    }

    public ClusterWhereInput runningVmNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_IN);
        return this;
    }

    public ClusterWhereInput runningVmNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_IN);
        return this;
    }

    public void setRunningVmNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_IN);
        }
    }

    public boolean getRunningVmNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNNING_VM_NUM_IN);
    }

    public ClusterWhereInput runningVmNumLt(Integer runningVmNumLt) {

        this.runningVmNumLt = runningVmNumLt;
        return this;
    }

    /**
     * Get runningVmNumLt
     *
     * @return runningVmNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRunningVmNumLt() {
        return runningVmNumLt;
    }

    public void setRunningVmNumLt(Integer runningVmNumLt) {
        this.runningVmNumLt = runningVmNumLt;
    }

    public ClusterWhereInput runningVmNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_LT);
        return this;
    }

    public ClusterWhereInput runningVmNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_LT);
        return this;
    }

    public void setRunningVmNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_LT);
        }
    }

    public boolean getRunningVmNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNNING_VM_NUM_LT);
    }

    public ClusterWhereInput runningVmNumLte(Integer runningVmNumLte) {

        this.runningVmNumLte = runningVmNumLte;
        return this;
    }

    /**
     * Get runningVmNumLte
     *
     * @return runningVmNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRunningVmNumLte() {
        return runningVmNumLte;
    }

    public void setRunningVmNumLte(Integer runningVmNumLte) {
        this.runningVmNumLte = runningVmNumLte;
    }

    public ClusterWhereInput runningVmNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_LTE);
        return this;
    }

    public ClusterWhereInput runningVmNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_LTE);
        return this;
    }

    public void setRunningVmNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_LTE);
        }
    }

    public boolean getRunningVmNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNNING_VM_NUM_LTE);
    }

    public ClusterWhereInput runningVmNumNot(Integer runningVmNumNot) {

        this.runningVmNumNot = runningVmNumNot;
        return this;
    }

    /**
     * Get runningVmNumNot
     *
     * @return runningVmNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRunningVmNumNot() {
        return runningVmNumNot;
    }

    public void setRunningVmNumNot(Integer runningVmNumNot) {
        this.runningVmNumNot = runningVmNumNot;
    }

    public ClusterWhereInput runningVmNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_NOT);
        return this;
    }

    public ClusterWhereInput runningVmNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_NOT);
        return this;
    }

    public void setRunningVmNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_NOT);
        }
    }

    public boolean getRunningVmNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNNING_VM_NUM_NOT);
    }

    public ClusterWhereInput runningVmNumNotIn(List<Integer> runningVmNumNotIn) {

        this.runningVmNumNotIn = runningVmNumNotIn;
        return this;
    }

    public ClusterWhereInput addRunningVmNumNotInItem(Integer runningVmNumNotInItem) {
        if (this.runningVmNumNotIn == null) {
            this.runningVmNumNotIn = new ArrayList<Integer>();
        }
        this.runningVmNumNotIn.add(runningVmNumNotInItem);
        return this;
    }

    /**
     * Get runningVmNumNotIn
     *
     * @return runningVmNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getRunningVmNumNotIn() {
        return runningVmNumNotIn;
    }

    public void setRunningVmNumNotIn(List<Integer> runningVmNumNotIn) {
        this.runningVmNumNotIn = runningVmNumNotIn;
    }

    public ClusterWhereInput runningVmNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_NOT_IN);
        return this;
    }

    public ClusterWhereInput runningVmNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_NOT_IN);
        return this;
    }

    public void setRunningVmNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_NOT_IN);
        }
    }

    public boolean getRunningVmNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNNING_VM_NUM_NOT_IN);
    }

    public ClusterWhereInput settings(ClusterSettingsWhereInput settings) {

        this.settings = settings;
        return this;
    }

    /**
     * Get settings
     *
     * @return settings
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterSettingsWhereInput getSettings() {
        return settings;
    }

    public void setSettings(ClusterSettingsWhereInput settings) {
        this.settings = settings;
    }

    public ClusterWhereInput settings_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SETTINGS);
        return this;
    }

    public ClusterWhereInput settings_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SETTINGS);
        return this;
    }

    public void setSettings_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SETTINGS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SETTINGS);
        }
    }

    public boolean getSettings_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SETTINGS);
    }

    public ClusterWhereInput softwareEdition(SoftwareEdition softwareEdition) {

        this.softwareEdition = softwareEdition;
        return this;
    }

    /**
     * Get softwareEdition
     *
     * @return softwareEdition
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SoftwareEdition getSoftwareEdition() {
        return softwareEdition;
    }

    public void setSoftwareEdition(SoftwareEdition softwareEdition) {
        this.softwareEdition = softwareEdition;
    }

    public ClusterWhereInput softwareEdition_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION);
        return this;
    }

    public ClusterWhereInput softwareEdition_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOFTWARE_EDITION);
        return this;
    }

    public void setSoftwareEdition_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOFTWARE_EDITION);
        }
    }

    public boolean getSoftwareEdition_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOFTWARE_EDITION);
    }

    public ClusterWhereInput softwareEditionIn(List<SoftwareEdition> softwareEditionIn) {

        this.softwareEditionIn = softwareEditionIn;
        return this;
    }

    public ClusterWhereInput addSoftwareEditionInItem(SoftwareEdition softwareEditionInItem) {
        if (this.softwareEditionIn == null) {
            this.softwareEditionIn = new ArrayList<SoftwareEdition>();
        }
        this.softwareEditionIn.add(softwareEditionInItem);
        return this;
    }

    /**
     * Get softwareEditionIn
     *
     * @return softwareEditionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SoftwareEdition> getSoftwareEditionIn() {
        return softwareEditionIn;
    }

    public void setSoftwareEditionIn(List<SoftwareEdition> softwareEditionIn) {
        this.softwareEditionIn = softwareEditionIn;
    }

    public ClusterWhereInput softwareEditionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION_IN);
        return this;
    }

    public ClusterWhereInput softwareEditionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOFTWARE_EDITION_IN);
        return this;
    }

    public void setSoftwareEditionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOFTWARE_EDITION_IN);
        }
    }

    public boolean getSoftwareEditionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOFTWARE_EDITION_IN);
    }

    public ClusterWhereInput softwareEditionNot(SoftwareEdition softwareEditionNot) {

        this.softwareEditionNot = softwareEditionNot;
        return this;
    }

    /**
     * Get softwareEditionNot
     *
     * @return softwareEditionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SoftwareEdition getSoftwareEditionNot() {
        return softwareEditionNot;
    }

    public void setSoftwareEditionNot(SoftwareEdition softwareEditionNot) {
        this.softwareEditionNot = softwareEditionNot;
    }

    public ClusterWhereInput softwareEditionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION_NOT);
        return this;
    }

    public ClusterWhereInput softwareEditionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOFTWARE_EDITION_NOT);
        return this;
    }

    public void setSoftwareEditionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOFTWARE_EDITION_NOT);
        }
    }

    public boolean getSoftwareEditionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOFTWARE_EDITION_NOT);
    }

    public ClusterWhereInput softwareEditionNotIn(List<SoftwareEdition> softwareEditionNotIn) {

        this.softwareEditionNotIn = softwareEditionNotIn;
        return this;
    }

    public ClusterWhereInput addSoftwareEditionNotInItem(SoftwareEdition softwareEditionNotInItem) {
        if (this.softwareEditionNotIn == null) {
            this.softwareEditionNotIn = new ArrayList<SoftwareEdition>();
        }
        this.softwareEditionNotIn.add(softwareEditionNotInItem);
        return this;
    }

    /**
     * Get softwareEditionNotIn
     *
     * @return softwareEditionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SoftwareEdition> getSoftwareEditionNotIn() {
        return softwareEditionNotIn;
    }

    public void setSoftwareEditionNotIn(List<SoftwareEdition> softwareEditionNotIn) {
        this.softwareEditionNotIn = softwareEditionNotIn;
    }

    public ClusterWhereInput softwareEditionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION_NOT_IN);
        return this;
    }

    public ClusterWhereInput softwareEditionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOFTWARE_EDITION_NOT_IN);
        return this;
    }

    public void setSoftwareEditionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOFTWARE_EDITION_NOT_IN);
        }
    }

    public boolean getSoftwareEditionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOFTWARE_EDITION_NOT_IN);
    }

    public ClusterWhereInput stoppedVmNum(Integer stoppedVmNum) {

        this.stoppedVmNum = stoppedVmNum;
        return this;
    }

    /**
     * Get stoppedVmNum
     *
     * @return stoppedVmNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getStoppedVmNum() {
        return stoppedVmNum;
    }

    public void setStoppedVmNum(Integer stoppedVmNum) {
        this.stoppedVmNum = stoppedVmNum;
    }

    public ClusterWhereInput stoppedVmNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM);
        return this;
    }

    public ClusterWhereInput stoppedVmNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM);
        return this;
    }

    public void setStoppedVmNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM);
        }
    }

    public boolean getStoppedVmNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STOPPED_VM_NUM);
    }

    public ClusterWhereInput stoppedVmNumGt(Integer stoppedVmNumGt) {

        this.stoppedVmNumGt = stoppedVmNumGt;
        return this;
    }

    /**
     * Get stoppedVmNumGt
     *
     * @return stoppedVmNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getStoppedVmNumGt() {
        return stoppedVmNumGt;
    }

    public void setStoppedVmNumGt(Integer stoppedVmNumGt) {
        this.stoppedVmNumGt = stoppedVmNumGt;
    }

    public ClusterWhereInput stoppedVmNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_GT);
        return this;
    }

    public ClusterWhereInput stoppedVmNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_GT);
        return this;
    }

    public void setStoppedVmNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_GT);
        }
    }

    public boolean getStoppedVmNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STOPPED_VM_NUM_GT);
    }

    public ClusterWhereInput stoppedVmNumGte(Integer stoppedVmNumGte) {

        this.stoppedVmNumGte = stoppedVmNumGte;
        return this;
    }

    /**
     * Get stoppedVmNumGte
     *
     * @return stoppedVmNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getStoppedVmNumGte() {
        return stoppedVmNumGte;
    }

    public void setStoppedVmNumGte(Integer stoppedVmNumGte) {
        this.stoppedVmNumGte = stoppedVmNumGte;
    }

    public ClusterWhereInput stoppedVmNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_GTE);
        return this;
    }

    public ClusterWhereInput stoppedVmNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_GTE);
        return this;
    }

    public void setStoppedVmNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_GTE);
        }
    }

    public boolean getStoppedVmNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STOPPED_VM_NUM_GTE);
    }

    public ClusterWhereInput stoppedVmNumIn(List<Integer> stoppedVmNumIn) {

        this.stoppedVmNumIn = stoppedVmNumIn;
        return this;
    }

    public ClusterWhereInput addStoppedVmNumInItem(Integer stoppedVmNumInItem) {
        if (this.stoppedVmNumIn == null) {
            this.stoppedVmNumIn = new ArrayList<Integer>();
        }
        this.stoppedVmNumIn.add(stoppedVmNumInItem);
        return this;
    }

    /**
     * Get stoppedVmNumIn
     *
     * @return stoppedVmNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getStoppedVmNumIn() {
        return stoppedVmNumIn;
    }

    public void setStoppedVmNumIn(List<Integer> stoppedVmNumIn) {
        this.stoppedVmNumIn = stoppedVmNumIn;
    }

    public ClusterWhereInput stoppedVmNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_IN);
        return this;
    }

    public ClusterWhereInput stoppedVmNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_IN);
        return this;
    }

    public void setStoppedVmNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_IN);
        }
    }

    public boolean getStoppedVmNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STOPPED_VM_NUM_IN);
    }

    public ClusterWhereInput stoppedVmNumLt(Integer stoppedVmNumLt) {

        this.stoppedVmNumLt = stoppedVmNumLt;
        return this;
    }

    /**
     * Get stoppedVmNumLt
     *
     * @return stoppedVmNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getStoppedVmNumLt() {
        return stoppedVmNumLt;
    }

    public void setStoppedVmNumLt(Integer stoppedVmNumLt) {
        this.stoppedVmNumLt = stoppedVmNumLt;
    }

    public ClusterWhereInput stoppedVmNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_LT);
        return this;
    }

    public ClusterWhereInput stoppedVmNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_LT);
        return this;
    }

    public void setStoppedVmNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_LT);
        }
    }

    public boolean getStoppedVmNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STOPPED_VM_NUM_LT);
    }

    public ClusterWhereInput stoppedVmNumLte(Integer stoppedVmNumLte) {

        this.stoppedVmNumLte = stoppedVmNumLte;
        return this;
    }

    /**
     * Get stoppedVmNumLte
     *
     * @return stoppedVmNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getStoppedVmNumLte() {
        return stoppedVmNumLte;
    }

    public void setStoppedVmNumLte(Integer stoppedVmNumLte) {
        this.stoppedVmNumLte = stoppedVmNumLte;
    }

    public ClusterWhereInput stoppedVmNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_LTE);
        return this;
    }

    public ClusterWhereInput stoppedVmNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_LTE);
        return this;
    }

    public void setStoppedVmNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_LTE);
        }
    }

    public boolean getStoppedVmNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STOPPED_VM_NUM_LTE);
    }

    public ClusterWhereInput stoppedVmNumNot(Integer stoppedVmNumNot) {

        this.stoppedVmNumNot = stoppedVmNumNot;
        return this;
    }

    /**
     * Get stoppedVmNumNot
     *
     * @return stoppedVmNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getStoppedVmNumNot() {
        return stoppedVmNumNot;
    }

    public void setStoppedVmNumNot(Integer stoppedVmNumNot) {
        this.stoppedVmNumNot = stoppedVmNumNot;
    }

    public ClusterWhereInput stoppedVmNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_NOT);
        return this;
    }

    public ClusterWhereInput stoppedVmNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_NOT);
        return this;
    }

    public void setStoppedVmNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_NOT);
        }
    }

    public boolean getStoppedVmNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STOPPED_VM_NUM_NOT);
    }

    public ClusterWhereInput stoppedVmNumNotIn(List<Integer> stoppedVmNumNotIn) {

        this.stoppedVmNumNotIn = stoppedVmNumNotIn;
        return this;
    }

    public ClusterWhereInput addStoppedVmNumNotInItem(Integer stoppedVmNumNotInItem) {
        if (this.stoppedVmNumNotIn == null) {
            this.stoppedVmNumNotIn = new ArrayList<Integer>();
        }
        this.stoppedVmNumNotIn.add(stoppedVmNumNotInItem);
        return this;
    }

    /**
     * Get stoppedVmNumNotIn
     *
     * @return stoppedVmNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getStoppedVmNumNotIn() {
        return stoppedVmNumNotIn;
    }

    public void setStoppedVmNumNotIn(List<Integer> stoppedVmNumNotIn) {
        this.stoppedVmNumNotIn = stoppedVmNumNotIn;
    }

    public ClusterWhereInput stoppedVmNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_NOT_IN);
        return this;
    }

    public ClusterWhereInput stoppedVmNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_NOT_IN);
        return this;
    }

    public void setStoppedVmNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_NOT_IN);
        }
    }

    public boolean getStoppedVmNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STOPPED_VM_NUM_NOT_IN);
    }

    public ClusterWhereInput stretch(Boolean stretch) {

        this.stretch = stretch;
        return this;
    }

    /**
     * Get stretch
     *
     * @return stretch
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getStretch() {
        return stretch;
    }

    public void setStretch(Boolean stretch) {
        this.stretch = stretch;
    }

    public ClusterWhereInput stretch_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRETCH);
        return this;
    }

    public ClusterWhereInput stretch_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRETCH);
        return this;
    }

    public void setStretch_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRETCH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRETCH);
        }
    }

    public boolean getStretch_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRETCH);
    }

    public ClusterWhereInput stretchNot(Boolean stretchNot) {

        this.stretchNot = stretchNot;
        return this;
    }

    /**
     * Get stretchNot
     *
     * @return stretchNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getStretchNot() {
        return stretchNot;
    }

    public void setStretchNot(Boolean stretchNot) {
        this.stretchNot = stretchNot;
    }

    public ClusterWhereInput stretchNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRETCH_NOT);
        return this;
    }

    public ClusterWhereInput stretchNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRETCH_NOT);
        return this;
    }

    public void setStretchNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRETCH_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRETCH_NOT);
        }
    }

    public boolean getStretchNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRETCH_NOT);
    }

    public ClusterWhereInput suspendedVmNum(Integer suspendedVmNum) {

        this.suspendedVmNum = suspendedVmNum;
        return this;
    }

    /**
     * Get suspendedVmNum
     *
     * @return suspendedVmNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSuspendedVmNum() {
        return suspendedVmNum;
    }

    public void setSuspendedVmNum(Integer suspendedVmNum) {
        this.suspendedVmNum = suspendedVmNum;
    }

    public ClusterWhereInput suspendedVmNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM);
        return this;
    }

    public ClusterWhereInput suspendedVmNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM);
        return this;
    }

    public void setSuspendedVmNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM);
        }
    }

    public boolean getSuspendedVmNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUSPENDED_VM_NUM);
    }

    public ClusterWhereInput suspendedVmNumGt(Integer suspendedVmNumGt) {

        this.suspendedVmNumGt = suspendedVmNumGt;
        return this;
    }

    /**
     * Get suspendedVmNumGt
     *
     * @return suspendedVmNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSuspendedVmNumGt() {
        return suspendedVmNumGt;
    }

    public void setSuspendedVmNumGt(Integer suspendedVmNumGt) {
        this.suspendedVmNumGt = suspendedVmNumGt;
    }

    public ClusterWhereInput suspendedVmNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_GT);
        return this;
    }

    public ClusterWhereInput suspendedVmNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_GT);
        return this;
    }

    public void setSuspendedVmNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_GT);
        }
    }

    public boolean getSuspendedVmNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUSPENDED_VM_NUM_GT);
    }

    public ClusterWhereInput suspendedVmNumGte(Integer suspendedVmNumGte) {

        this.suspendedVmNumGte = suspendedVmNumGte;
        return this;
    }

    /**
     * Get suspendedVmNumGte
     *
     * @return suspendedVmNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSuspendedVmNumGte() {
        return suspendedVmNumGte;
    }

    public void setSuspendedVmNumGte(Integer suspendedVmNumGte) {
        this.suspendedVmNumGte = suspendedVmNumGte;
    }

    public ClusterWhereInput suspendedVmNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_GTE);
        return this;
    }

    public ClusterWhereInput suspendedVmNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_GTE);
        return this;
    }

    public void setSuspendedVmNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_GTE);
        }
    }

    public boolean getSuspendedVmNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUSPENDED_VM_NUM_GTE);
    }

    public ClusterWhereInput suspendedVmNumIn(List<Integer> suspendedVmNumIn) {

        this.suspendedVmNumIn = suspendedVmNumIn;
        return this;
    }

    public ClusterWhereInput addSuspendedVmNumInItem(Integer suspendedVmNumInItem) {
        if (this.suspendedVmNumIn == null) {
            this.suspendedVmNumIn = new ArrayList<Integer>();
        }
        this.suspendedVmNumIn.add(suspendedVmNumInItem);
        return this;
    }

    /**
     * Get suspendedVmNumIn
     *
     * @return suspendedVmNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getSuspendedVmNumIn() {
        return suspendedVmNumIn;
    }

    public void setSuspendedVmNumIn(List<Integer> suspendedVmNumIn) {
        this.suspendedVmNumIn = suspendedVmNumIn;
    }

    public ClusterWhereInput suspendedVmNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_IN);
        return this;
    }

    public ClusterWhereInput suspendedVmNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_IN);
        return this;
    }

    public void setSuspendedVmNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_IN);
        }
    }

    public boolean getSuspendedVmNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUSPENDED_VM_NUM_IN);
    }

    public ClusterWhereInput suspendedVmNumLt(Integer suspendedVmNumLt) {

        this.suspendedVmNumLt = suspendedVmNumLt;
        return this;
    }

    /**
     * Get suspendedVmNumLt
     *
     * @return suspendedVmNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSuspendedVmNumLt() {
        return suspendedVmNumLt;
    }

    public void setSuspendedVmNumLt(Integer suspendedVmNumLt) {
        this.suspendedVmNumLt = suspendedVmNumLt;
    }

    public ClusterWhereInput suspendedVmNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_LT);
        return this;
    }

    public ClusterWhereInput suspendedVmNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_LT);
        return this;
    }

    public void setSuspendedVmNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_LT);
        }
    }

    public boolean getSuspendedVmNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUSPENDED_VM_NUM_LT);
    }

    public ClusterWhereInput suspendedVmNumLte(Integer suspendedVmNumLte) {

        this.suspendedVmNumLte = suspendedVmNumLte;
        return this;
    }

    /**
     * Get suspendedVmNumLte
     *
     * @return suspendedVmNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSuspendedVmNumLte() {
        return suspendedVmNumLte;
    }

    public void setSuspendedVmNumLte(Integer suspendedVmNumLte) {
        this.suspendedVmNumLte = suspendedVmNumLte;
    }

    public ClusterWhereInput suspendedVmNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_LTE);
        return this;
    }

    public ClusterWhereInput suspendedVmNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_LTE);
        return this;
    }

    public void setSuspendedVmNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_LTE);
        }
    }

    public boolean getSuspendedVmNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUSPENDED_VM_NUM_LTE);
    }

    public ClusterWhereInput suspendedVmNumNot(Integer suspendedVmNumNot) {

        this.suspendedVmNumNot = suspendedVmNumNot;
        return this;
    }

    /**
     * Get suspendedVmNumNot
     *
     * @return suspendedVmNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSuspendedVmNumNot() {
        return suspendedVmNumNot;
    }

    public void setSuspendedVmNumNot(Integer suspendedVmNumNot) {
        this.suspendedVmNumNot = suspendedVmNumNot;
    }

    public ClusterWhereInput suspendedVmNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT);
        return this;
    }

    public ClusterWhereInput suspendedVmNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT);
        return this;
    }

    public void setSuspendedVmNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT);
        }
    }

    public boolean getSuspendedVmNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT);
    }

    public ClusterWhereInput suspendedVmNumNotIn(List<Integer> suspendedVmNumNotIn) {

        this.suspendedVmNumNotIn = suspendedVmNumNotIn;
        return this;
    }

    public ClusterWhereInput addSuspendedVmNumNotInItem(Integer suspendedVmNumNotInItem) {
        if (this.suspendedVmNumNotIn == null) {
            this.suspendedVmNumNotIn = new ArrayList<Integer>();
        }
        this.suspendedVmNumNotIn.add(suspendedVmNumNotInItem);
        return this;
    }

    /**
     * Get suspendedVmNumNotIn
     *
     * @return suspendedVmNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getSuspendedVmNumNotIn() {
        return suspendedVmNumNotIn;
    }

    public void setSuspendedVmNumNotIn(List<Integer> suspendedVmNumNotIn) {
        this.suspendedVmNumNotIn = suspendedVmNumNotIn;
    }

    public ClusterWhereInput suspendedVmNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT_IN);
        return this;
    }

    public ClusterWhereInput suspendedVmNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT_IN);
        return this;
    }

    public void setSuspendedVmNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT_IN);
        }
    }

    public boolean getSuspendedVmNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT_IN);
    }

    public ClusterWhereInput totalCacheCapacity(Long totalCacheCapacity) {

        this.totalCacheCapacity = totalCacheCapacity;
        return this;
    }

    /**
     * Get totalCacheCapacity
     *
     * @return totalCacheCapacity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCacheCapacity() {
        return totalCacheCapacity;
    }

    public void setTotalCacheCapacity(Long totalCacheCapacity) {
        this.totalCacheCapacity = totalCacheCapacity;
    }

    public ClusterWhereInput totalCacheCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY);
        return this;
    }

    public ClusterWhereInput totalCacheCapacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY);
        return this;
    }

    public void setTotalCacheCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY);
        }
    }

    public boolean getTotalCacheCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY);
    }

    public ClusterWhereInput totalCacheCapacityGt(Long totalCacheCapacityGt) {

        this.totalCacheCapacityGt = totalCacheCapacityGt;
        return this;
    }

    /**
     * Get totalCacheCapacityGt
     *
     * @return totalCacheCapacityGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCacheCapacityGt() {
        return totalCacheCapacityGt;
    }

    public void setTotalCacheCapacityGt(Long totalCacheCapacityGt) {
        this.totalCacheCapacityGt = totalCacheCapacityGt;
    }

    public ClusterWhereInput totalCacheCapacityGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GT);
        return this;
    }

    public ClusterWhereInput totalCacheCapacityGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GT);
        return this;
    }

    public void setTotalCacheCapacityGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GT);
        }
    }

    public boolean getTotalCacheCapacityGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GT);
    }

    public ClusterWhereInput totalCacheCapacityGte(Long totalCacheCapacityGte) {

        this.totalCacheCapacityGte = totalCacheCapacityGte;
        return this;
    }

    /**
     * Get totalCacheCapacityGte
     *
     * @return totalCacheCapacityGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCacheCapacityGte() {
        return totalCacheCapacityGte;
    }

    public void setTotalCacheCapacityGte(Long totalCacheCapacityGte) {
        this.totalCacheCapacityGte = totalCacheCapacityGte;
    }

    public ClusterWhereInput totalCacheCapacityGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GTE);
        return this;
    }

    public ClusterWhereInput totalCacheCapacityGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GTE);
        return this;
    }

    public void setTotalCacheCapacityGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GTE);
        }
    }

    public boolean getTotalCacheCapacityGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GTE);
    }

    public ClusterWhereInput totalCacheCapacityIn(List<Long> totalCacheCapacityIn) {

        this.totalCacheCapacityIn = totalCacheCapacityIn;
        return this;
    }

    public ClusterWhereInput addTotalCacheCapacityInItem(Long totalCacheCapacityInItem) {
        if (this.totalCacheCapacityIn == null) {
            this.totalCacheCapacityIn = new ArrayList<Long>();
        }
        this.totalCacheCapacityIn.add(totalCacheCapacityInItem);
        return this;
    }

    /**
     * Get totalCacheCapacityIn
     *
     * @return totalCacheCapacityIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getTotalCacheCapacityIn() {
        return totalCacheCapacityIn;
    }

    public void setTotalCacheCapacityIn(List<Long> totalCacheCapacityIn) {
        this.totalCacheCapacityIn = totalCacheCapacityIn;
    }

    public ClusterWhereInput totalCacheCapacityIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_IN);
        return this;
    }

    public ClusterWhereInput totalCacheCapacityIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_IN);
        return this;
    }

    public void setTotalCacheCapacityIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_IN);
        }
    }

    public boolean getTotalCacheCapacityIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_IN);
    }

    public ClusterWhereInput totalCacheCapacityLt(Long totalCacheCapacityLt) {

        this.totalCacheCapacityLt = totalCacheCapacityLt;
        return this;
    }

    /**
     * Get totalCacheCapacityLt
     *
     * @return totalCacheCapacityLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCacheCapacityLt() {
        return totalCacheCapacityLt;
    }

    public void setTotalCacheCapacityLt(Long totalCacheCapacityLt) {
        this.totalCacheCapacityLt = totalCacheCapacityLt;
    }

    public ClusterWhereInput totalCacheCapacityLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LT);
        return this;
    }

    public ClusterWhereInput totalCacheCapacityLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LT);
        return this;
    }

    public void setTotalCacheCapacityLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LT);
        }
    }

    public boolean getTotalCacheCapacityLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LT);
    }

    public ClusterWhereInput totalCacheCapacityLte(Long totalCacheCapacityLte) {

        this.totalCacheCapacityLte = totalCacheCapacityLte;
        return this;
    }

    /**
     * Get totalCacheCapacityLte
     *
     * @return totalCacheCapacityLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCacheCapacityLte() {
        return totalCacheCapacityLte;
    }

    public void setTotalCacheCapacityLte(Long totalCacheCapacityLte) {
        this.totalCacheCapacityLte = totalCacheCapacityLte;
    }

    public ClusterWhereInput totalCacheCapacityLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LTE);
        return this;
    }

    public ClusterWhereInput totalCacheCapacityLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LTE);
        return this;
    }

    public void setTotalCacheCapacityLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LTE);
        }
    }

    public boolean getTotalCacheCapacityLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LTE);
    }

    public ClusterWhereInput totalCacheCapacityNot(Long totalCacheCapacityNot) {

        this.totalCacheCapacityNot = totalCacheCapacityNot;
        return this;
    }

    /**
     * Get totalCacheCapacityNot
     *
     * @return totalCacheCapacityNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCacheCapacityNot() {
        return totalCacheCapacityNot;
    }

    public void setTotalCacheCapacityNot(Long totalCacheCapacityNot) {
        this.totalCacheCapacityNot = totalCacheCapacityNot;
    }

    public ClusterWhereInput totalCacheCapacityNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT);
        return this;
    }

    public ClusterWhereInput totalCacheCapacityNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT);
        return this;
    }

    public void setTotalCacheCapacityNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT);
        }
    }

    public boolean getTotalCacheCapacityNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT);
    }

    public ClusterWhereInput totalCacheCapacityNotIn(List<Long> totalCacheCapacityNotIn) {

        this.totalCacheCapacityNotIn = totalCacheCapacityNotIn;
        return this;
    }

    public ClusterWhereInput addTotalCacheCapacityNotInItem(Long totalCacheCapacityNotInItem) {
        if (this.totalCacheCapacityNotIn == null) {
            this.totalCacheCapacityNotIn = new ArrayList<Long>();
        }
        this.totalCacheCapacityNotIn.add(totalCacheCapacityNotInItem);
        return this;
    }

    /**
     * Get totalCacheCapacityNotIn
     *
     * @return totalCacheCapacityNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getTotalCacheCapacityNotIn() {
        return totalCacheCapacityNotIn;
    }

    public void setTotalCacheCapacityNotIn(List<Long> totalCacheCapacityNotIn) {
        this.totalCacheCapacityNotIn = totalCacheCapacityNotIn;
    }

    public ClusterWhereInput totalCacheCapacityNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT_IN);
        return this;
    }

    public ClusterWhereInput totalCacheCapacityNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT_IN);
        return this;
    }

    public void setTotalCacheCapacityNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT_IN);
        }
    }

    public boolean getTotalCacheCapacityNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT_IN);
    }

    public ClusterWhereInput totalCpuCores(Integer totalCpuCores) {

        this.totalCpuCores = totalCpuCores;
        return this;
    }

    /**
     * Get totalCpuCores
     *
     * @return totalCpuCores
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCpuCores() {
        return totalCpuCores;
    }

    public void setTotalCpuCores(Integer totalCpuCores) {
        this.totalCpuCores = totalCpuCores;
    }

    public ClusterWhereInput totalCpuCores_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES);
        return this;
    }

    public ClusterWhereInput totalCpuCores_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES);
        return this;
    }

    public void setTotalCpuCores_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES);
        }
    }

    public boolean getTotalCpuCores_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_CORES);
    }

    public ClusterWhereInput totalCpuCoresGt(Integer totalCpuCoresGt) {

        this.totalCpuCoresGt = totalCpuCoresGt;
        return this;
    }

    /**
     * Get totalCpuCoresGt
     *
     * @return totalCpuCoresGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCpuCoresGt() {
        return totalCpuCoresGt;
    }

    public void setTotalCpuCoresGt(Integer totalCpuCoresGt) {
        this.totalCpuCoresGt = totalCpuCoresGt;
    }

    public ClusterWhereInput totalCpuCoresGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_GT);
        return this;
    }

    public ClusterWhereInput totalCpuCoresGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_GT);
        return this;
    }

    public void setTotalCpuCoresGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_GT);
        }
    }

    public boolean getTotalCpuCoresGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_CORES_GT);
    }

    public ClusterWhereInput totalCpuCoresGte(Integer totalCpuCoresGte) {

        this.totalCpuCoresGte = totalCpuCoresGte;
        return this;
    }

    /**
     * Get totalCpuCoresGte
     *
     * @return totalCpuCoresGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCpuCoresGte() {
        return totalCpuCoresGte;
    }

    public void setTotalCpuCoresGte(Integer totalCpuCoresGte) {
        this.totalCpuCoresGte = totalCpuCoresGte;
    }

    public ClusterWhereInput totalCpuCoresGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_GTE);
        return this;
    }

    public ClusterWhereInput totalCpuCoresGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_GTE);
        return this;
    }

    public void setTotalCpuCoresGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_GTE);
        }
    }

    public boolean getTotalCpuCoresGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_CORES_GTE);
    }

    public ClusterWhereInput totalCpuCoresIn(List<Integer> totalCpuCoresIn) {

        this.totalCpuCoresIn = totalCpuCoresIn;
        return this;
    }

    public ClusterWhereInput addTotalCpuCoresInItem(Integer totalCpuCoresInItem) {
        if (this.totalCpuCoresIn == null) {
            this.totalCpuCoresIn = new ArrayList<Integer>();
        }
        this.totalCpuCoresIn.add(totalCpuCoresInItem);
        return this;
    }

    /**
     * Get totalCpuCoresIn
     *
     * @return totalCpuCoresIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTotalCpuCoresIn() {
        return totalCpuCoresIn;
    }

    public void setTotalCpuCoresIn(List<Integer> totalCpuCoresIn) {
        this.totalCpuCoresIn = totalCpuCoresIn;
    }

    public ClusterWhereInput totalCpuCoresIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_IN);
        return this;
    }

    public ClusterWhereInput totalCpuCoresIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_IN);
        return this;
    }

    public void setTotalCpuCoresIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_IN);
        }
    }

    public boolean getTotalCpuCoresIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_CORES_IN);
    }

    public ClusterWhereInput totalCpuCoresLt(Integer totalCpuCoresLt) {

        this.totalCpuCoresLt = totalCpuCoresLt;
        return this;
    }

    /**
     * Get totalCpuCoresLt
     *
     * @return totalCpuCoresLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCpuCoresLt() {
        return totalCpuCoresLt;
    }

    public void setTotalCpuCoresLt(Integer totalCpuCoresLt) {
        this.totalCpuCoresLt = totalCpuCoresLt;
    }

    public ClusterWhereInput totalCpuCoresLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_LT);
        return this;
    }

    public ClusterWhereInput totalCpuCoresLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_LT);
        return this;
    }

    public void setTotalCpuCoresLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_LT);
        }
    }

    public boolean getTotalCpuCoresLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_CORES_LT);
    }

    public ClusterWhereInput totalCpuCoresLte(Integer totalCpuCoresLte) {

        this.totalCpuCoresLte = totalCpuCoresLte;
        return this;
    }

    /**
     * Get totalCpuCoresLte
     *
     * @return totalCpuCoresLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCpuCoresLte() {
        return totalCpuCoresLte;
    }

    public void setTotalCpuCoresLte(Integer totalCpuCoresLte) {
        this.totalCpuCoresLte = totalCpuCoresLte;
    }

    public ClusterWhereInput totalCpuCoresLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_LTE);
        return this;
    }

    public ClusterWhereInput totalCpuCoresLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_LTE);
        return this;
    }

    public void setTotalCpuCoresLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_LTE);
        }
    }

    public boolean getTotalCpuCoresLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_CORES_LTE);
    }

    public ClusterWhereInput totalCpuCoresNot(Integer totalCpuCoresNot) {

        this.totalCpuCoresNot = totalCpuCoresNot;
        return this;
    }

    /**
     * Get totalCpuCoresNot
     *
     * @return totalCpuCoresNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCpuCoresNot() {
        return totalCpuCoresNot;
    }

    public void setTotalCpuCoresNot(Integer totalCpuCoresNot) {
        this.totalCpuCoresNot = totalCpuCoresNot;
    }

    public ClusterWhereInput totalCpuCoresNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT);
        return this;
    }

    public ClusterWhereInput totalCpuCoresNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT);
        return this;
    }

    public void setTotalCpuCoresNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT);
        }
    }

    public boolean getTotalCpuCoresNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT);
    }

    public ClusterWhereInput totalCpuCoresNotIn(List<Integer> totalCpuCoresNotIn) {

        this.totalCpuCoresNotIn = totalCpuCoresNotIn;
        return this;
    }

    public ClusterWhereInput addTotalCpuCoresNotInItem(Integer totalCpuCoresNotInItem) {
        if (this.totalCpuCoresNotIn == null) {
            this.totalCpuCoresNotIn = new ArrayList<Integer>();
        }
        this.totalCpuCoresNotIn.add(totalCpuCoresNotInItem);
        return this;
    }

    /**
     * Get totalCpuCoresNotIn
     *
     * @return totalCpuCoresNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTotalCpuCoresNotIn() {
        return totalCpuCoresNotIn;
    }

    public void setTotalCpuCoresNotIn(List<Integer> totalCpuCoresNotIn) {
        this.totalCpuCoresNotIn = totalCpuCoresNotIn;
    }

    public ClusterWhereInput totalCpuCoresNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT_IN);
        return this;
    }

    public ClusterWhereInput totalCpuCoresNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT_IN);
        return this;
    }

    public void setTotalCpuCoresNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT_IN);
        }
    }

    public boolean getTotalCpuCoresNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT_IN);
    }

    public ClusterWhereInput totalCpuHz(Long totalCpuHz) {

        this.totalCpuHz = totalCpuHz;
        return this;
    }

    /**
     * Get totalCpuHz
     *
     * @return totalCpuHz
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCpuHz() {
        return totalCpuHz;
    }

    public void setTotalCpuHz(Long totalCpuHz) {
        this.totalCpuHz = totalCpuHz;
    }

    public ClusterWhereInput totalCpuHz_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ);
        return this;
    }

    public ClusterWhereInput totalCpuHz_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ);
        return this;
    }

    public void setTotalCpuHz_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ);
        }
    }

    public boolean getTotalCpuHz_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_HZ);
    }

    public ClusterWhereInput totalCpuHzGt(Long totalCpuHzGt) {

        this.totalCpuHzGt = totalCpuHzGt;
        return this;
    }

    /**
     * Get totalCpuHzGt
     *
     * @return totalCpuHzGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCpuHzGt() {
        return totalCpuHzGt;
    }

    public void setTotalCpuHzGt(Long totalCpuHzGt) {
        this.totalCpuHzGt = totalCpuHzGt;
    }

    public ClusterWhereInput totalCpuHzGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_GT);
        return this;
    }

    public ClusterWhereInput totalCpuHzGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_GT);
        return this;
    }

    public void setTotalCpuHzGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_GT);
        }
    }

    public boolean getTotalCpuHzGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_HZ_GT);
    }

    public ClusterWhereInput totalCpuHzGte(Long totalCpuHzGte) {

        this.totalCpuHzGte = totalCpuHzGte;
        return this;
    }

    /**
     * Get totalCpuHzGte
     *
     * @return totalCpuHzGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCpuHzGte() {
        return totalCpuHzGte;
    }

    public void setTotalCpuHzGte(Long totalCpuHzGte) {
        this.totalCpuHzGte = totalCpuHzGte;
    }

    public ClusterWhereInput totalCpuHzGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_GTE);
        return this;
    }

    public ClusterWhereInput totalCpuHzGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_GTE);
        return this;
    }

    public void setTotalCpuHzGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_GTE);
        }
    }

    public boolean getTotalCpuHzGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_HZ_GTE);
    }

    public ClusterWhereInput totalCpuHzIn(List<Long> totalCpuHzIn) {

        this.totalCpuHzIn = totalCpuHzIn;
        return this;
    }

    public ClusterWhereInput addTotalCpuHzInItem(Long totalCpuHzInItem) {
        if (this.totalCpuHzIn == null) {
            this.totalCpuHzIn = new ArrayList<Long>();
        }
        this.totalCpuHzIn.add(totalCpuHzInItem);
        return this;
    }

    /**
     * Get totalCpuHzIn
     *
     * @return totalCpuHzIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getTotalCpuHzIn() {
        return totalCpuHzIn;
    }

    public void setTotalCpuHzIn(List<Long> totalCpuHzIn) {
        this.totalCpuHzIn = totalCpuHzIn;
    }

    public ClusterWhereInput totalCpuHzIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_IN);
        return this;
    }

    public ClusterWhereInput totalCpuHzIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_IN);
        return this;
    }

    public void setTotalCpuHzIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_IN);
        }
    }

    public boolean getTotalCpuHzIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_HZ_IN);
    }

    public ClusterWhereInput totalCpuHzLt(Long totalCpuHzLt) {

        this.totalCpuHzLt = totalCpuHzLt;
        return this;
    }

    /**
     * Get totalCpuHzLt
     *
     * @return totalCpuHzLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCpuHzLt() {
        return totalCpuHzLt;
    }

    public void setTotalCpuHzLt(Long totalCpuHzLt) {
        this.totalCpuHzLt = totalCpuHzLt;
    }

    public ClusterWhereInput totalCpuHzLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_LT);
        return this;
    }

    public ClusterWhereInput totalCpuHzLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_LT);
        return this;
    }

    public void setTotalCpuHzLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_LT);
        }
    }

    public boolean getTotalCpuHzLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_HZ_LT);
    }

    public ClusterWhereInput totalCpuHzLte(Long totalCpuHzLte) {

        this.totalCpuHzLte = totalCpuHzLte;
        return this;
    }

    /**
     * Get totalCpuHzLte
     *
     * @return totalCpuHzLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCpuHzLte() {
        return totalCpuHzLte;
    }

    public void setTotalCpuHzLte(Long totalCpuHzLte) {
        this.totalCpuHzLte = totalCpuHzLte;
    }

    public ClusterWhereInput totalCpuHzLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_LTE);
        return this;
    }

    public ClusterWhereInput totalCpuHzLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_LTE);
        return this;
    }

    public void setTotalCpuHzLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_LTE);
        }
    }

    public boolean getTotalCpuHzLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_HZ_LTE);
    }

    public ClusterWhereInput totalCpuHzNot(Long totalCpuHzNot) {

        this.totalCpuHzNot = totalCpuHzNot;
        return this;
    }

    /**
     * Get totalCpuHzNot
     *
     * @return totalCpuHzNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCpuHzNot() {
        return totalCpuHzNot;
    }

    public void setTotalCpuHzNot(Long totalCpuHzNot) {
        this.totalCpuHzNot = totalCpuHzNot;
    }

    public ClusterWhereInput totalCpuHzNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT);
        return this;
    }

    public ClusterWhereInput totalCpuHzNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT);
        return this;
    }

    public void setTotalCpuHzNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT);
        }
    }

    public boolean getTotalCpuHzNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT);
    }

    public ClusterWhereInput totalCpuHzNotIn(List<Long> totalCpuHzNotIn) {

        this.totalCpuHzNotIn = totalCpuHzNotIn;
        return this;
    }

    public ClusterWhereInput addTotalCpuHzNotInItem(Long totalCpuHzNotInItem) {
        if (this.totalCpuHzNotIn == null) {
            this.totalCpuHzNotIn = new ArrayList<Long>();
        }
        this.totalCpuHzNotIn.add(totalCpuHzNotInItem);
        return this;
    }

    /**
     * Get totalCpuHzNotIn
     *
     * @return totalCpuHzNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getTotalCpuHzNotIn() {
        return totalCpuHzNotIn;
    }

    public void setTotalCpuHzNotIn(List<Long> totalCpuHzNotIn) {
        this.totalCpuHzNotIn = totalCpuHzNotIn;
    }

    public ClusterWhereInput totalCpuHzNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT_IN);
        return this;
    }

    public ClusterWhereInput totalCpuHzNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT_IN);
        return this;
    }

    public void setTotalCpuHzNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT_IN);
        }
    }

    public boolean getTotalCpuHzNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT_IN);
    }

    public ClusterWhereInput totalCpuSockets(Integer totalCpuSockets) {

        this.totalCpuSockets = totalCpuSockets;
        return this;
    }

    /**
     * Get totalCpuSockets
     *
     * @return totalCpuSockets
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCpuSockets() {
        return totalCpuSockets;
    }

    public void setTotalCpuSockets(Integer totalCpuSockets) {
        this.totalCpuSockets = totalCpuSockets;
    }

    public ClusterWhereInput totalCpuSockets_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_SOCKETS);
        return this;
    }

    public ClusterWhereInput totalCpuSockets_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_SOCKETS);
        return this;
    }

    public void setTotalCpuSockets_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_SOCKETS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_SOCKETS);
        }
    }

    public boolean getTotalCpuSockets_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_SOCKETS);
    }

    public ClusterWhereInput totalCpuSocketsGt(Integer totalCpuSocketsGt) {

        this.totalCpuSocketsGt = totalCpuSocketsGt;
        return this;
    }

    /**
     * Get totalCpuSocketsGt
     *
     * @return totalCpuSocketsGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCpuSocketsGt() {
        return totalCpuSocketsGt;
    }

    public void setTotalCpuSocketsGt(Integer totalCpuSocketsGt) {
        this.totalCpuSocketsGt = totalCpuSocketsGt;
    }

    public ClusterWhereInput totalCpuSocketsGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_GT);
        return this;
    }

    public ClusterWhereInput totalCpuSocketsGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_GT);
        return this;
    }

    public void setTotalCpuSocketsGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_GT);
        }
    }

    public boolean getTotalCpuSocketsGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_GT);
    }

    public ClusterWhereInput totalCpuSocketsGte(Integer totalCpuSocketsGte) {

        this.totalCpuSocketsGte = totalCpuSocketsGte;
        return this;
    }

    /**
     * Get totalCpuSocketsGte
     *
     * @return totalCpuSocketsGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCpuSocketsGte() {
        return totalCpuSocketsGte;
    }

    public void setTotalCpuSocketsGte(Integer totalCpuSocketsGte) {
        this.totalCpuSocketsGte = totalCpuSocketsGte;
    }

    public ClusterWhereInput totalCpuSocketsGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_GTE);
        return this;
    }

    public ClusterWhereInput totalCpuSocketsGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_GTE);
        return this;
    }

    public void setTotalCpuSocketsGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_GTE);
        }
    }

    public boolean getTotalCpuSocketsGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_GTE);
    }

    public ClusterWhereInput totalCpuSocketsIn(List<Integer> totalCpuSocketsIn) {

        this.totalCpuSocketsIn = totalCpuSocketsIn;
        return this;
    }

    public ClusterWhereInput addTotalCpuSocketsInItem(Integer totalCpuSocketsInItem) {
        if (this.totalCpuSocketsIn == null) {
            this.totalCpuSocketsIn = new ArrayList<Integer>();
        }
        this.totalCpuSocketsIn.add(totalCpuSocketsInItem);
        return this;
    }

    /**
     * Get totalCpuSocketsIn
     *
     * @return totalCpuSocketsIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTotalCpuSocketsIn() {
        return totalCpuSocketsIn;
    }

    public void setTotalCpuSocketsIn(List<Integer> totalCpuSocketsIn) {
        this.totalCpuSocketsIn = totalCpuSocketsIn;
    }

    public ClusterWhereInput totalCpuSocketsIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_IN);
        return this;
    }

    public ClusterWhereInput totalCpuSocketsIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_IN);
        return this;
    }

    public void setTotalCpuSocketsIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_IN);
        }
    }

    public boolean getTotalCpuSocketsIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_IN);
    }

    public ClusterWhereInput totalCpuSocketsLt(Integer totalCpuSocketsLt) {

        this.totalCpuSocketsLt = totalCpuSocketsLt;
        return this;
    }

    /**
     * Get totalCpuSocketsLt
     *
     * @return totalCpuSocketsLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCpuSocketsLt() {
        return totalCpuSocketsLt;
    }

    public void setTotalCpuSocketsLt(Integer totalCpuSocketsLt) {
        this.totalCpuSocketsLt = totalCpuSocketsLt;
    }

    public ClusterWhereInput totalCpuSocketsLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_LT);
        return this;
    }

    public ClusterWhereInput totalCpuSocketsLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_LT);
        return this;
    }

    public void setTotalCpuSocketsLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_LT);
        }
    }

    public boolean getTotalCpuSocketsLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_LT);
    }

    public ClusterWhereInput totalCpuSocketsLte(Integer totalCpuSocketsLte) {

        this.totalCpuSocketsLte = totalCpuSocketsLte;
        return this;
    }

    /**
     * Get totalCpuSocketsLte
     *
     * @return totalCpuSocketsLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCpuSocketsLte() {
        return totalCpuSocketsLte;
    }

    public void setTotalCpuSocketsLte(Integer totalCpuSocketsLte) {
        this.totalCpuSocketsLte = totalCpuSocketsLte;
    }

    public ClusterWhereInput totalCpuSocketsLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_LTE);
        return this;
    }

    public ClusterWhereInput totalCpuSocketsLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_LTE);
        return this;
    }

    public void setTotalCpuSocketsLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_LTE);
        }
    }

    public boolean getTotalCpuSocketsLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_LTE);
    }

    public ClusterWhereInput totalCpuSocketsNot(Integer totalCpuSocketsNot) {

        this.totalCpuSocketsNot = totalCpuSocketsNot;
        return this;
    }

    /**
     * Get totalCpuSocketsNot
     *
     * @return totalCpuSocketsNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCpuSocketsNot() {
        return totalCpuSocketsNot;
    }

    public void setTotalCpuSocketsNot(Integer totalCpuSocketsNot) {
        this.totalCpuSocketsNot = totalCpuSocketsNot;
    }

    public ClusterWhereInput totalCpuSocketsNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_NOT);
        return this;
    }

    public ClusterWhereInput totalCpuSocketsNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_NOT);
        return this;
    }

    public void setTotalCpuSocketsNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_NOT);
        }
    }

    public boolean getTotalCpuSocketsNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_NOT);
    }

    public ClusterWhereInput totalCpuSocketsNotIn(List<Integer> totalCpuSocketsNotIn) {

        this.totalCpuSocketsNotIn = totalCpuSocketsNotIn;
        return this;
    }

    public ClusterWhereInput addTotalCpuSocketsNotInItem(Integer totalCpuSocketsNotInItem) {
        if (this.totalCpuSocketsNotIn == null) {
            this.totalCpuSocketsNotIn = new ArrayList<Integer>();
        }
        this.totalCpuSocketsNotIn.add(totalCpuSocketsNotInItem);
        return this;
    }

    /**
     * Get totalCpuSocketsNotIn
     *
     * @return totalCpuSocketsNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTotalCpuSocketsNotIn() {
        return totalCpuSocketsNotIn;
    }

    public void setTotalCpuSocketsNotIn(List<Integer> totalCpuSocketsNotIn) {
        this.totalCpuSocketsNotIn = totalCpuSocketsNotIn;
    }

    public ClusterWhereInput totalCpuSocketsNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_NOT_IN);
        return this;
    }

    public ClusterWhereInput totalCpuSocketsNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_NOT_IN);
        return this;
    }

    public void setTotalCpuSocketsNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_NOT_IN);
        }
    }

    public boolean getTotalCpuSocketsNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_NOT_IN);
    }

    public ClusterWhereInput totalDataCapacity(Long totalDataCapacity) {

        this.totalDataCapacity = totalDataCapacity;
        return this;
    }

    /**
     * Get totalDataCapacity
     *
     * @return totalDataCapacity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalDataCapacity() {
        return totalDataCapacity;
    }

    public void setTotalDataCapacity(Long totalDataCapacity) {
        this.totalDataCapacity = totalDataCapacity;
    }

    public ClusterWhereInput totalDataCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
        return this;
    }

    public ClusterWhereInput totalDataCapacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
        return this;
    }

    public void setTotalDataCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
        }
    }

    public boolean getTotalDataCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
    }

    public ClusterWhereInput totalDataCapacityGt(Long totalDataCapacityGt) {

        this.totalDataCapacityGt = totalDataCapacityGt;
        return this;
    }

    /**
     * Get totalDataCapacityGt
     *
     * @return totalDataCapacityGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalDataCapacityGt() {
        return totalDataCapacityGt;
    }

    public void setTotalDataCapacityGt(Long totalDataCapacityGt) {
        this.totalDataCapacityGt = totalDataCapacityGt;
    }

    public ClusterWhereInput totalDataCapacityGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GT);
        return this;
    }

    public ClusterWhereInput totalDataCapacityGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GT);
        return this;
    }

    public void setTotalDataCapacityGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GT);
        }
    }

    public boolean getTotalDataCapacityGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GT);
    }

    public ClusterWhereInput totalDataCapacityGte(Long totalDataCapacityGte) {

        this.totalDataCapacityGte = totalDataCapacityGte;
        return this;
    }

    /**
     * Get totalDataCapacityGte
     *
     * @return totalDataCapacityGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalDataCapacityGte() {
        return totalDataCapacityGte;
    }

    public void setTotalDataCapacityGte(Long totalDataCapacityGte) {
        this.totalDataCapacityGte = totalDataCapacityGte;
    }

    public ClusterWhereInput totalDataCapacityGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GTE);
        return this;
    }

    public ClusterWhereInput totalDataCapacityGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GTE);
        return this;
    }

    public void setTotalDataCapacityGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GTE);
        }
    }

    public boolean getTotalDataCapacityGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GTE);
    }

    public ClusterWhereInput totalDataCapacityIn(List<Long> totalDataCapacityIn) {

        this.totalDataCapacityIn = totalDataCapacityIn;
        return this;
    }

    public ClusterWhereInput addTotalDataCapacityInItem(Long totalDataCapacityInItem) {
        if (this.totalDataCapacityIn == null) {
            this.totalDataCapacityIn = new ArrayList<Long>();
        }
        this.totalDataCapacityIn.add(totalDataCapacityInItem);
        return this;
    }

    /**
     * Get totalDataCapacityIn
     *
     * @return totalDataCapacityIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getTotalDataCapacityIn() {
        return totalDataCapacityIn;
    }

    public void setTotalDataCapacityIn(List<Long> totalDataCapacityIn) {
        this.totalDataCapacityIn = totalDataCapacityIn;
    }

    public ClusterWhereInput totalDataCapacityIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_IN);
        return this;
    }

    public ClusterWhereInput totalDataCapacityIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_IN);
        return this;
    }

    public void setTotalDataCapacityIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_IN);
        }
    }

    public boolean getTotalDataCapacityIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_IN);
    }

    public ClusterWhereInput totalDataCapacityLt(Long totalDataCapacityLt) {

        this.totalDataCapacityLt = totalDataCapacityLt;
        return this;
    }

    /**
     * Get totalDataCapacityLt
     *
     * @return totalDataCapacityLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalDataCapacityLt() {
        return totalDataCapacityLt;
    }

    public void setTotalDataCapacityLt(Long totalDataCapacityLt) {
        this.totalDataCapacityLt = totalDataCapacityLt;
    }

    public ClusterWhereInput totalDataCapacityLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LT);
        return this;
    }

    public ClusterWhereInput totalDataCapacityLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LT);
        return this;
    }

    public void setTotalDataCapacityLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LT);
        }
    }

    public boolean getTotalDataCapacityLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LT);
    }

    public ClusterWhereInput totalDataCapacityLte(Long totalDataCapacityLte) {

        this.totalDataCapacityLte = totalDataCapacityLte;
        return this;
    }

    /**
     * Get totalDataCapacityLte
     *
     * @return totalDataCapacityLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalDataCapacityLte() {
        return totalDataCapacityLte;
    }

    public void setTotalDataCapacityLte(Long totalDataCapacityLte) {
        this.totalDataCapacityLte = totalDataCapacityLte;
    }

    public ClusterWhereInput totalDataCapacityLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LTE);
        return this;
    }

    public ClusterWhereInput totalDataCapacityLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LTE);
        return this;
    }

    public void setTotalDataCapacityLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LTE);
        }
    }

    public boolean getTotalDataCapacityLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LTE);
    }

    public ClusterWhereInput totalDataCapacityNot(Long totalDataCapacityNot) {

        this.totalDataCapacityNot = totalDataCapacityNot;
        return this;
    }

    /**
     * Get totalDataCapacityNot
     *
     * @return totalDataCapacityNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalDataCapacityNot() {
        return totalDataCapacityNot;
    }

    public void setTotalDataCapacityNot(Long totalDataCapacityNot) {
        this.totalDataCapacityNot = totalDataCapacityNot;
    }

    public ClusterWhereInput totalDataCapacityNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT);
        return this;
    }

    public ClusterWhereInput totalDataCapacityNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT);
        return this;
    }

    public void setTotalDataCapacityNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT);
        }
    }

    public boolean getTotalDataCapacityNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT);
    }

    public ClusterWhereInput totalDataCapacityNotIn(List<Long> totalDataCapacityNotIn) {

        this.totalDataCapacityNotIn = totalDataCapacityNotIn;
        return this;
    }

    public ClusterWhereInput addTotalDataCapacityNotInItem(Long totalDataCapacityNotInItem) {
        if (this.totalDataCapacityNotIn == null) {
            this.totalDataCapacityNotIn = new ArrayList<Long>();
        }
        this.totalDataCapacityNotIn.add(totalDataCapacityNotInItem);
        return this;
    }

    /**
     * Get totalDataCapacityNotIn
     *
     * @return totalDataCapacityNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getTotalDataCapacityNotIn() {
        return totalDataCapacityNotIn;
    }

    public void setTotalDataCapacityNotIn(List<Long> totalDataCapacityNotIn) {
        this.totalDataCapacityNotIn = totalDataCapacityNotIn;
    }

    public ClusterWhereInput totalDataCapacityNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT_IN);
        return this;
    }

    public ClusterWhereInput totalDataCapacityNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT_IN);
        return this;
    }

    public void setTotalDataCapacityNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT_IN);
        }
    }

    public boolean getTotalDataCapacityNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT_IN);
    }

    public ClusterWhereInput totalMemoryBytes(Long totalMemoryBytes) {

        this.totalMemoryBytes = totalMemoryBytes;
        return this;
    }

    /**
     * Get totalMemoryBytes
     *
     * @return totalMemoryBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalMemoryBytes() {
        return totalMemoryBytes;
    }

    public void setTotalMemoryBytes(Long totalMemoryBytes) {
        this.totalMemoryBytes = totalMemoryBytes;
    }

    public ClusterWhereInput totalMemoryBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES);
        return this;
    }

    public ClusterWhereInput totalMemoryBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES);
        return this;
    }

    public void setTotalMemoryBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES);
        }
    }

    public boolean getTotalMemoryBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MEMORY_BYTES);
    }

    public ClusterWhereInput totalMemoryBytesGt(Long totalMemoryBytesGt) {

        this.totalMemoryBytesGt = totalMemoryBytesGt;
        return this;
    }

    /**
     * Get totalMemoryBytesGt
     *
     * @return totalMemoryBytesGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalMemoryBytesGt() {
        return totalMemoryBytesGt;
    }

    public void setTotalMemoryBytesGt(Long totalMemoryBytesGt) {
        this.totalMemoryBytesGt = totalMemoryBytesGt;
    }

    public ClusterWhereInput totalMemoryBytesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GT);
        return this;
    }

    public ClusterWhereInput totalMemoryBytesGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GT);
        return this;
    }

    public void setTotalMemoryBytesGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GT);
        }
    }

    public boolean getTotalMemoryBytesGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GT);
    }

    public ClusterWhereInput totalMemoryBytesGte(Long totalMemoryBytesGte) {

        this.totalMemoryBytesGte = totalMemoryBytesGte;
        return this;
    }

    /**
     * Get totalMemoryBytesGte
     *
     * @return totalMemoryBytesGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalMemoryBytesGte() {
        return totalMemoryBytesGte;
    }

    public void setTotalMemoryBytesGte(Long totalMemoryBytesGte) {
        this.totalMemoryBytesGte = totalMemoryBytesGte;
    }

    public ClusterWhereInput totalMemoryBytesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GTE);
        return this;
    }

    public ClusterWhereInput totalMemoryBytesGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GTE);
        return this;
    }

    public void setTotalMemoryBytesGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GTE);
        }
    }

    public boolean getTotalMemoryBytesGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GTE);
    }

    public ClusterWhereInput totalMemoryBytesIn(List<Long> totalMemoryBytesIn) {

        this.totalMemoryBytesIn = totalMemoryBytesIn;
        return this;
    }

    public ClusterWhereInput addTotalMemoryBytesInItem(Long totalMemoryBytesInItem) {
        if (this.totalMemoryBytesIn == null) {
            this.totalMemoryBytesIn = new ArrayList<Long>();
        }
        this.totalMemoryBytesIn.add(totalMemoryBytesInItem);
        return this;
    }

    /**
     * Get totalMemoryBytesIn
     *
     * @return totalMemoryBytesIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getTotalMemoryBytesIn() {
        return totalMemoryBytesIn;
    }

    public void setTotalMemoryBytesIn(List<Long> totalMemoryBytesIn) {
        this.totalMemoryBytesIn = totalMemoryBytesIn;
    }

    public ClusterWhereInput totalMemoryBytesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_IN);
        return this;
    }

    public ClusterWhereInput totalMemoryBytesIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_IN);
        return this;
    }

    public void setTotalMemoryBytesIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_IN);
        }
    }

    public boolean getTotalMemoryBytesIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_IN);
    }

    public ClusterWhereInput totalMemoryBytesLt(Long totalMemoryBytesLt) {

        this.totalMemoryBytesLt = totalMemoryBytesLt;
        return this;
    }

    /**
     * Get totalMemoryBytesLt
     *
     * @return totalMemoryBytesLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalMemoryBytesLt() {
        return totalMemoryBytesLt;
    }

    public void setTotalMemoryBytesLt(Long totalMemoryBytesLt) {
        this.totalMemoryBytesLt = totalMemoryBytesLt;
    }

    public ClusterWhereInput totalMemoryBytesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LT);
        return this;
    }

    public ClusterWhereInput totalMemoryBytesLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LT);
        return this;
    }

    public void setTotalMemoryBytesLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LT);
        }
    }

    public boolean getTotalMemoryBytesLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LT);
    }

    public ClusterWhereInput totalMemoryBytesLte(Long totalMemoryBytesLte) {

        this.totalMemoryBytesLte = totalMemoryBytesLte;
        return this;
    }

    /**
     * Get totalMemoryBytesLte
     *
     * @return totalMemoryBytesLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalMemoryBytesLte() {
        return totalMemoryBytesLte;
    }

    public void setTotalMemoryBytesLte(Long totalMemoryBytesLte) {
        this.totalMemoryBytesLte = totalMemoryBytesLte;
    }

    public ClusterWhereInput totalMemoryBytesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LTE);
        return this;
    }

    public ClusterWhereInput totalMemoryBytesLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LTE);
        return this;
    }

    public void setTotalMemoryBytesLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LTE);
        }
    }

    public boolean getTotalMemoryBytesLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LTE);
    }

    public ClusterWhereInput totalMemoryBytesNot(Long totalMemoryBytesNot) {

        this.totalMemoryBytesNot = totalMemoryBytesNot;
        return this;
    }

    /**
     * Get totalMemoryBytesNot
     *
     * @return totalMemoryBytesNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalMemoryBytesNot() {
        return totalMemoryBytesNot;
    }

    public void setTotalMemoryBytesNot(Long totalMemoryBytesNot) {
        this.totalMemoryBytesNot = totalMemoryBytesNot;
    }

    public ClusterWhereInput totalMemoryBytesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT);
        return this;
    }

    public ClusterWhereInput totalMemoryBytesNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT);
        return this;
    }

    public void setTotalMemoryBytesNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT);
        }
    }

    public boolean getTotalMemoryBytesNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT);
    }

    public ClusterWhereInput totalMemoryBytesNotIn(List<Long> totalMemoryBytesNotIn) {

        this.totalMemoryBytesNotIn = totalMemoryBytesNotIn;
        return this;
    }

    public ClusterWhereInput addTotalMemoryBytesNotInItem(Long totalMemoryBytesNotInItem) {
        if (this.totalMemoryBytesNotIn == null) {
            this.totalMemoryBytesNotIn = new ArrayList<Long>();
        }
        this.totalMemoryBytesNotIn.add(totalMemoryBytesNotInItem);
        return this;
    }

    /**
     * Get totalMemoryBytesNotIn
     *
     * @return totalMemoryBytesNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getTotalMemoryBytesNotIn() {
        return totalMemoryBytesNotIn;
    }

    public void setTotalMemoryBytesNotIn(List<Long> totalMemoryBytesNotIn) {
        this.totalMemoryBytesNotIn = totalMemoryBytesNotIn;
    }

    public ClusterWhereInput totalMemoryBytesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT_IN);
        return this;
    }

    public ClusterWhereInput totalMemoryBytesNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT_IN);
        return this;
    }

    public void setTotalMemoryBytesNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT_IN);
        }
    }

    public boolean getTotalMemoryBytesNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT_IN);
    }

    public ClusterWhereInput type(ClusterType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterType getType() {
        return type;
    }

    public void setType(ClusterType type) {
        this.type = type;
    }

    public ClusterWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public ClusterWhereInput type_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        return this;
    }

    public void setType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        }
    }

    public boolean getType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE);
    }

    public ClusterWhereInput typeIn(List<ClusterType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public ClusterWhereInput addTypeInItem(ClusterType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<ClusterType>();
        }
        this.typeIn.add(typeInItem);
        return this;
    }

    /**
     * Get typeIn
     *
     * @return typeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ClusterType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<ClusterType> typeIn) {
        this.typeIn = typeIn;
    }

    public ClusterWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public ClusterWhereInput typeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public void setTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_IN);
        }
    }

    public boolean getTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_IN);
    }

    public ClusterWhereInput typeNot(ClusterType typeNot) {

        this.typeNot = typeNot;
        return this;
    }

    /**
     * Get typeNot
     *
     * @return typeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(ClusterType typeNot) {
        this.typeNot = typeNot;
    }

    public ClusterWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public ClusterWhereInput typeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public void setTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT);
        }
    }

    public boolean getTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_NOT);
    }

    public ClusterWhereInput typeNotIn(List<ClusterType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public ClusterWhereInput addTypeNotInItem(ClusterType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<ClusterType>();
        }
        this.typeNotIn.add(typeNotInItem);
        return this;
    }

    /**
     * Get typeNotIn
     *
     * @return typeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ClusterType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<ClusterType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public ClusterWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public ClusterWhereInput typeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public void setTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT_IN);
        }
    }

    public boolean getTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_NOT_IN);
    }

    public ClusterWhereInput upgradeToolVersion(String upgradeToolVersion) {

        this.upgradeToolVersion = upgradeToolVersion;
        return this;
    }

    /**
     * Get upgradeToolVersion
     *
     * @return upgradeToolVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersion() {
        return upgradeToolVersion;
    }

    public void setUpgradeToolVersion(String upgradeToolVersion) {
        this.upgradeToolVersion = upgradeToolVersion;
    }

    public ClusterWhereInput upgradeToolVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION);
        return this;
    }

    public ClusterWhereInput upgradeToolVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION);
        return this;
    }

    public void setUpgradeToolVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION);
        }
    }

    public boolean getUpgradeToolVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION);
    }

    public ClusterWhereInput upgradeToolVersionContains(String upgradeToolVersionContains) {

        this.upgradeToolVersionContains = upgradeToolVersionContains;
        return this;
    }

    /**
     * Get upgradeToolVersionContains
     *
     * @return upgradeToolVersionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionContains() {
        return upgradeToolVersionContains;
    }

    public void setUpgradeToolVersionContains(String upgradeToolVersionContains) {
        this.upgradeToolVersionContains = upgradeToolVersionContains;
    }

    public ClusterWhereInput upgradeToolVersionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_CONTAINS);
        return this;
    }

    public ClusterWhereInput upgradeToolVersionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_CONTAINS);
        return this;
    }

    public void setUpgradeToolVersionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_CONTAINS);
        }
    }

    public boolean getUpgradeToolVersionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_CONTAINS);
    }

    public ClusterWhereInput upgradeToolVersionEndsWith(String upgradeToolVersionEndsWith) {

        this.upgradeToolVersionEndsWith = upgradeToolVersionEndsWith;
        return this;
    }

    /**
     * Get upgradeToolVersionEndsWith
     *
     * @return upgradeToolVersionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionEndsWith() {
        return upgradeToolVersionEndsWith;
    }

    public void setUpgradeToolVersionEndsWith(String upgradeToolVersionEndsWith) {
        this.upgradeToolVersionEndsWith = upgradeToolVersionEndsWith;
    }

    public ClusterWhereInput upgradeToolVersionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput upgradeToolVersionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_ENDS_WITH);
        return this;
    }

    public void setUpgradeToolVersionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_ENDS_WITH);
        }
    }

    public boolean getUpgradeToolVersionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_ENDS_WITH);
    }

    public ClusterWhereInput upgradeToolVersionGt(String upgradeToolVersionGt) {

        this.upgradeToolVersionGt = upgradeToolVersionGt;
        return this;
    }

    /**
     * Get upgradeToolVersionGt
     *
     * @return upgradeToolVersionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionGt() {
        return upgradeToolVersionGt;
    }

    public void setUpgradeToolVersionGt(String upgradeToolVersionGt) {
        this.upgradeToolVersionGt = upgradeToolVersionGt;
    }

    public ClusterWhereInput upgradeToolVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GT);
        return this;
    }

    public ClusterWhereInput upgradeToolVersionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GT);
        return this;
    }

    public void setUpgradeToolVersionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GT);
        }
    }

    public boolean getUpgradeToolVersionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GT);
    }

    public ClusterWhereInput upgradeToolVersionGte(String upgradeToolVersionGte) {

        this.upgradeToolVersionGte = upgradeToolVersionGte;
        return this;
    }

    /**
     * Get upgradeToolVersionGte
     *
     * @return upgradeToolVersionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionGte() {
        return upgradeToolVersionGte;
    }

    public void setUpgradeToolVersionGte(String upgradeToolVersionGte) {
        this.upgradeToolVersionGte = upgradeToolVersionGte;
    }

    public ClusterWhereInput upgradeToolVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GTE);
        return this;
    }

    public ClusterWhereInput upgradeToolVersionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GTE);
        return this;
    }

    public void setUpgradeToolVersionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GTE);
        }
    }

    public boolean getUpgradeToolVersionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GTE);
    }

    public ClusterWhereInput upgradeToolVersionIn(List<String> upgradeToolVersionIn) {

        this.upgradeToolVersionIn = upgradeToolVersionIn;
        return this;
    }

    public ClusterWhereInput addUpgradeToolVersionInItem(String upgradeToolVersionInItem) {
        if (this.upgradeToolVersionIn == null) {
            this.upgradeToolVersionIn = new ArrayList<String>();
        }
        this.upgradeToolVersionIn.add(upgradeToolVersionInItem);
        return this;
    }

    /**
     * Get upgradeToolVersionIn
     *
     * @return upgradeToolVersionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUpgradeToolVersionIn() {
        return upgradeToolVersionIn;
    }

    public void setUpgradeToolVersionIn(List<String> upgradeToolVersionIn) {
        this.upgradeToolVersionIn = upgradeToolVersionIn;
    }

    public ClusterWhereInput upgradeToolVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_IN);
        return this;
    }

    public ClusterWhereInput upgradeToolVersionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_IN);
        return this;
    }

    public void setUpgradeToolVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_IN);
        }
    }

    public boolean getUpgradeToolVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_IN);
    }

    public ClusterWhereInput upgradeToolVersionLt(String upgradeToolVersionLt) {

        this.upgradeToolVersionLt = upgradeToolVersionLt;
        return this;
    }

    /**
     * Get upgradeToolVersionLt
     *
     * @return upgradeToolVersionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionLt() {
        return upgradeToolVersionLt;
    }

    public void setUpgradeToolVersionLt(String upgradeToolVersionLt) {
        this.upgradeToolVersionLt = upgradeToolVersionLt;
    }

    public ClusterWhereInput upgradeToolVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LT);
        return this;
    }

    public ClusterWhereInput upgradeToolVersionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LT);
        return this;
    }

    public void setUpgradeToolVersionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LT);
        }
    }

    public boolean getUpgradeToolVersionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LT);
    }

    public ClusterWhereInput upgradeToolVersionLte(String upgradeToolVersionLte) {

        this.upgradeToolVersionLte = upgradeToolVersionLte;
        return this;
    }

    /**
     * Get upgradeToolVersionLte
     *
     * @return upgradeToolVersionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionLte() {
        return upgradeToolVersionLte;
    }

    public void setUpgradeToolVersionLte(String upgradeToolVersionLte) {
        this.upgradeToolVersionLte = upgradeToolVersionLte;
    }

    public ClusterWhereInput upgradeToolVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LTE);
        return this;
    }

    public ClusterWhereInput upgradeToolVersionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LTE);
        return this;
    }

    public void setUpgradeToolVersionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LTE);
        }
    }

    public boolean getUpgradeToolVersionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LTE);
    }

    public ClusterWhereInput upgradeToolVersionNot(String upgradeToolVersionNot) {

        this.upgradeToolVersionNot = upgradeToolVersionNot;
        return this;
    }

    /**
     * Get upgradeToolVersionNot
     *
     * @return upgradeToolVersionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionNot() {
        return upgradeToolVersionNot;
    }

    public void setUpgradeToolVersionNot(String upgradeToolVersionNot) {
        this.upgradeToolVersionNot = upgradeToolVersionNot;
    }

    public ClusterWhereInput upgradeToolVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT);
        return this;
    }

    public ClusterWhereInput upgradeToolVersionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT);
        return this;
    }

    public void setUpgradeToolVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT);
        }
    }

    public boolean getUpgradeToolVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT);
    }

    public ClusterWhereInput upgradeToolVersionNotContains(String upgradeToolVersionNotContains) {

        this.upgradeToolVersionNotContains = upgradeToolVersionNotContains;
        return this;
    }

    /**
     * Get upgradeToolVersionNotContains
     *
     * @return upgradeToolVersionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionNotContains() {
        return upgradeToolVersionNotContains;
    }

    public void setUpgradeToolVersionNotContains(String upgradeToolVersionNotContains) {
        this.upgradeToolVersionNotContains = upgradeToolVersionNotContains;
    }

    public ClusterWhereInput upgradeToolVersionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_CONTAINS);
        return this;
    }

    public ClusterWhereInput upgradeToolVersionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_CONTAINS);
        return this;
    }

    public void setUpgradeToolVersionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_CONTAINS);
        }
    }

    public boolean getUpgradeToolVersionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_CONTAINS);
    }

    public ClusterWhereInput upgradeToolVersionNotEndsWith(String upgradeToolVersionNotEndsWith) {

        this.upgradeToolVersionNotEndsWith = upgradeToolVersionNotEndsWith;
        return this;
    }

    /**
     * Get upgradeToolVersionNotEndsWith
     *
     * @return upgradeToolVersionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionNotEndsWith() {
        return upgradeToolVersionNotEndsWith;
    }

    public void setUpgradeToolVersionNotEndsWith(String upgradeToolVersionNotEndsWith) {
        this.upgradeToolVersionNotEndsWith = upgradeToolVersionNotEndsWith;
    }

    public ClusterWhereInput upgradeToolVersionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput upgradeToolVersionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public void setUpgradeToolVersionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_ENDS_WITH);
        }
    }

    public boolean getUpgradeToolVersionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_ENDS_WITH);
    }

    public ClusterWhereInput upgradeToolVersionNotIn(List<String> upgradeToolVersionNotIn) {

        this.upgradeToolVersionNotIn = upgradeToolVersionNotIn;
        return this;
    }

    public ClusterWhereInput addUpgradeToolVersionNotInItem(String upgradeToolVersionNotInItem) {
        if (this.upgradeToolVersionNotIn == null) {
            this.upgradeToolVersionNotIn = new ArrayList<String>();
        }
        this.upgradeToolVersionNotIn.add(upgradeToolVersionNotInItem);
        return this;
    }

    /**
     * Get upgradeToolVersionNotIn
     *
     * @return upgradeToolVersionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUpgradeToolVersionNotIn() {
        return upgradeToolVersionNotIn;
    }

    public void setUpgradeToolVersionNotIn(List<String> upgradeToolVersionNotIn) {
        this.upgradeToolVersionNotIn = upgradeToolVersionNotIn;
    }

    public ClusterWhereInput upgradeToolVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_IN);
        return this;
    }

    public ClusterWhereInput upgradeToolVersionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_IN);
        return this;
    }

    public void setUpgradeToolVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_IN);
        }
    }

    public boolean getUpgradeToolVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_IN);
    }

    public ClusterWhereInput upgradeToolVersionNotStartsWith(
            String upgradeToolVersionNotStartsWith) {

        this.upgradeToolVersionNotStartsWith = upgradeToolVersionNotStartsWith;
        return this;
    }

    /**
     * Get upgradeToolVersionNotStartsWith
     *
     * @return upgradeToolVersionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionNotStartsWith() {
        return upgradeToolVersionNotStartsWith;
    }

    public void setUpgradeToolVersionNotStartsWith(String upgradeToolVersionNotStartsWith) {
        this.upgradeToolVersionNotStartsWith = upgradeToolVersionNotStartsWith;
    }

    public ClusterWhereInput upgradeToolVersionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput upgradeToolVersionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public void setUpgradeToolVersionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_STARTS_WITH);
        }
    }

    public boolean getUpgradeToolVersionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_STARTS_WITH);
    }

    public ClusterWhereInput upgradeToolVersionStartsWith(String upgradeToolVersionStartsWith) {

        this.upgradeToolVersionStartsWith = upgradeToolVersionStartsWith;
        return this;
    }

    /**
     * Get upgradeToolVersionStartsWith
     *
     * @return upgradeToolVersionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionStartsWith() {
        return upgradeToolVersionStartsWith;
    }

    public void setUpgradeToolVersionStartsWith(String upgradeToolVersionStartsWith) {
        this.upgradeToolVersionStartsWith = upgradeToolVersionStartsWith;
    }

    public ClusterWhereInput upgradeToolVersionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput upgradeToolVersionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_STARTS_WITH);
        return this;
    }

    public void setUpgradeToolVersionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_STARTS_WITH);
        }
    }

    public boolean getUpgradeToolVersionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_STARTS_WITH);
    }

    public ClusterWhereInput usedCpuHz(Double usedCpuHz) {

        this.usedCpuHz = usedCpuHz;
        return this;
    }

    /**
     * Get usedCpuHz
     *
     * @return usedCpuHz
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedCpuHz() {
        return usedCpuHz;
    }

    public void setUsedCpuHz(Double usedCpuHz) {
        this.usedCpuHz = usedCpuHz;
    }

    public ClusterWhereInput usedCpuHz_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CPU_HZ);
        return this;
    }

    public ClusterWhereInput usedCpuHz_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_CPU_HZ);
        return this;
    }

    public void setUsedCpuHz_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_CPU_HZ);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_CPU_HZ);
        }
    }

    public boolean getUsedCpuHz_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_CPU_HZ);
    }

    public ClusterWhereInput usedCpuHzGt(Double usedCpuHzGt) {

        this.usedCpuHzGt = usedCpuHzGt;
        return this;
    }

    /**
     * Get usedCpuHzGt
     *
     * @return usedCpuHzGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedCpuHzGt() {
        return usedCpuHzGt;
    }

    public void setUsedCpuHzGt(Double usedCpuHzGt) {
        this.usedCpuHzGt = usedCpuHzGt;
    }

    public ClusterWhereInput usedCpuHzGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CPU_HZ_GT);
        return this;
    }

    public ClusterWhereInput usedCpuHzGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_CPU_HZ_GT);
        return this;
    }

    public void setUsedCpuHzGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_CPU_HZ_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_CPU_HZ_GT);
        }
    }

    public boolean getUsedCpuHzGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_CPU_HZ_GT);
    }

    public ClusterWhereInput usedCpuHzGte(Double usedCpuHzGte) {

        this.usedCpuHzGte = usedCpuHzGte;
        return this;
    }

    /**
     * Get usedCpuHzGte
     *
     * @return usedCpuHzGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedCpuHzGte() {
        return usedCpuHzGte;
    }

    public void setUsedCpuHzGte(Double usedCpuHzGte) {
        this.usedCpuHzGte = usedCpuHzGte;
    }

    public ClusterWhereInput usedCpuHzGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CPU_HZ_GTE);
        return this;
    }

    public ClusterWhereInput usedCpuHzGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_CPU_HZ_GTE);
        return this;
    }

    public void setUsedCpuHzGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_CPU_HZ_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_CPU_HZ_GTE);
        }
    }

    public boolean getUsedCpuHzGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_CPU_HZ_GTE);
    }

    public ClusterWhereInput usedCpuHzIn(List<Double> usedCpuHzIn) {

        this.usedCpuHzIn = usedCpuHzIn;
        return this;
    }

    public ClusterWhereInput addUsedCpuHzInItem(Double usedCpuHzInItem) {
        if (this.usedCpuHzIn == null) {
            this.usedCpuHzIn = new ArrayList<Double>();
        }
        this.usedCpuHzIn.add(usedCpuHzInItem);
        return this;
    }

    /**
     * Get usedCpuHzIn
     *
     * @return usedCpuHzIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getUsedCpuHzIn() {
        return usedCpuHzIn;
    }

    public void setUsedCpuHzIn(List<Double> usedCpuHzIn) {
        this.usedCpuHzIn = usedCpuHzIn;
    }

    public ClusterWhereInput usedCpuHzIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CPU_HZ_IN);
        return this;
    }

    public ClusterWhereInput usedCpuHzIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_CPU_HZ_IN);
        return this;
    }

    public void setUsedCpuHzIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_CPU_HZ_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_CPU_HZ_IN);
        }
    }

    public boolean getUsedCpuHzIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_CPU_HZ_IN);
    }

    public ClusterWhereInput usedCpuHzLt(Double usedCpuHzLt) {

        this.usedCpuHzLt = usedCpuHzLt;
        return this;
    }

    /**
     * Get usedCpuHzLt
     *
     * @return usedCpuHzLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedCpuHzLt() {
        return usedCpuHzLt;
    }

    public void setUsedCpuHzLt(Double usedCpuHzLt) {
        this.usedCpuHzLt = usedCpuHzLt;
    }

    public ClusterWhereInput usedCpuHzLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CPU_HZ_LT);
        return this;
    }

    public ClusterWhereInput usedCpuHzLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_CPU_HZ_LT);
        return this;
    }

    public void setUsedCpuHzLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_CPU_HZ_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_CPU_HZ_LT);
        }
    }

    public boolean getUsedCpuHzLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_CPU_HZ_LT);
    }

    public ClusterWhereInput usedCpuHzLte(Double usedCpuHzLte) {

        this.usedCpuHzLte = usedCpuHzLte;
        return this;
    }

    /**
     * Get usedCpuHzLte
     *
     * @return usedCpuHzLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedCpuHzLte() {
        return usedCpuHzLte;
    }

    public void setUsedCpuHzLte(Double usedCpuHzLte) {
        this.usedCpuHzLte = usedCpuHzLte;
    }

    public ClusterWhereInput usedCpuHzLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CPU_HZ_LTE);
        return this;
    }

    public ClusterWhereInput usedCpuHzLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_CPU_HZ_LTE);
        return this;
    }

    public void setUsedCpuHzLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_CPU_HZ_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_CPU_HZ_LTE);
        }
    }

    public boolean getUsedCpuHzLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_CPU_HZ_LTE);
    }

    public ClusterWhereInput usedCpuHzNot(Double usedCpuHzNot) {

        this.usedCpuHzNot = usedCpuHzNot;
        return this;
    }

    /**
     * Get usedCpuHzNot
     *
     * @return usedCpuHzNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedCpuHzNot() {
        return usedCpuHzNot;
    }

    public void setUsedCpuHzNot(Double usedCpuHzNot) {
        this.usedCpuHzNot = usedCpuHzNot;
    }

    public ClusterWhereInput usedCpuHzNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CPU_HZ_NOT);
        return this;
    }

    public ClusterWhereInput usedCpuHzNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_CPU_HZ_NOT);
        return this;
    }

    public void setUsedCpuHzNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_CPU_HZ_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_CPU_HZ_NOT);
        }
    }

    public boolean getUsedCpuHzNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_CPU_HZ_NOT);
    }

    public ClusterWhereInput usedCpuHzNotIn(List<Double> usedCpuHzNotIn) {

        this.usedCpuHzNotIn = usedCpuHzNotIn;
        return this;
    }

    public ClusterWhereInput addUsedCpuHzNotInItem(Double usedCpuHzNotInItem) {
        if (this.usedCpuHzNotIn == null) {
            this.usedCpuHzNotIn = new ArrayList<Double>();
        }
        this.usedCpuHzNotIn.add(usedCpuHzNotInItem);
        return this;
    }

    /**
     * Get usedCpuHzNotIn
     *
     * @return usedCpuHzNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getUsedCpuHzNotIn() {
        return usedCpuHzNotIn;
    }

    public void setUsedCpuHzNotIn(List<Double> usedCpuHzNotIn) {
        this.usedCpuHzNotIn = usedCpuHzNotIn;
    }

    public ClusterWhereInput usedCpuHzNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CPU_HZ_NOT_IN);
        return this;
    }

    public ClusterWhereInput usedCpuHzNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_CPU_HZ_NOT_IN);
        return this;
    }

    public void setUsedCpuHzNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_CPU_HZ_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_CPU_HZ_NOT_IN);
        }
    }

    public boolean getUsedCpuHzNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_CPU_HZ_NOT_IN);
    }

    public ClusterWhereInput usedDataSpace(Long usedDataSpace) {

        this.usedDataSpace = usedDataSpace;
        return this;
    }

    /**
     * Get usedDataSpace
     *
     * @return usedDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedDataSpace() {
        return usedDataSpace;
    }

    public void setUsedDataSpace(Long usedDataSpace) {
        this.usedDataSpace = usedDataSpace;
    }

    public ClusterWhereInput usedDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE);
        return this;
    }

    public ClusterWhereInput usedDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE);
        return this;
    }

    public void setUsedDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE);
        }
    }

    public boolean getUsedDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE);
    }

    public ClusterWhereInput usedDataSpaceGt(Long usedDataSpaceGt) {

        this.usedDataSpaceGt = usedDataSpaceGt;
        return this;
    }

    /**
     * Get usedDataSpaceGt
     *
     * @return usedDataSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedDataSpaceGt() {
        return usedDataSpaceGt;
    }

    public void setUsedDataSpaceGt(Long usedDataSpaceGt) {
        this.usedDataSpaceGt = usedDataSpaceGt;
    }

    public ClusterWhereInput usedDataSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_GT);
        return this;
    }

    public ClusterWhereInput usedDataSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_GT);
        return this;
    }

    public void setUsedDataSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_GT);
        }
    }

    public boolean getUsedDataSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_GT);
    }

    public ClusterWhereInput usedDataSpaceGte(Long usedDataSpaceGte) {

        this.usedDataSpaceGte = usedDataSpaceGte;
        return this;
    }

    /**
     * Get usedDataSpaceGte
     *
     * @return usedDataSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedDataSpaceGte() {
        return usedDataSpaceGte;
    }

    public void setUsedDataSpaceGte(Long usedDataSpaceGte) {
        this.usedDataSpaceGte = usedDataSpaceGte;
    }

    public ClusterWhereInput usedDataSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_GTE);
        return this;
    }

    public ClusterWhereInput usedDataSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_GTE);
        return this;
    }

    public void setUsedDataSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_GTE);
        }
    }

    public boolean getUsedDataSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_GTE);
    }

    public ClusterWhereInput usedDataSpaceIn(List<Long> usedDataSpaceIn) {

        this.usedDataSpaceIn = usedDataSpaceIn;
        return this;
    }

    public ClusterWhereInput addUsedDataSpaceInItem(Long usedDataSpaceInItem) {
        if (this.usedDataSpaceIn == null) {
            this.usedDataSpaceIn = new ArrayList<Long>();
        }
        this.usedDataSpaceIn.add(usedDataSpaceInItem);
        return this;
    }

    /**
     * Get usedDataSpaceIn
     *
     * @return usedDataSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getUsedDataSpaceIn() {
        return usedDataSpaceIn;
    }

    public void setUsedDataSpaceIn(List<Long> usedDataSpaceIn) {
        this.usedDataSpaceIn = usedDataSpaceIn;
    }

    public ClusterWhereInput usedDataSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_IN);
        return this;
    }

    public ClusterWhereInput usedDataSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_IN);
        return this;
    }

    public void setUsedDataSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_IN);
        }
    }

    public boolean getUsedDataSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_IN);
    }

    public ClusterWhereInput usedDataSpaceLt(Long usedDataSpaceLt) {

        this.usedDataSpaceLt = usedDataSpaceLt;
        return this;
    }

    /**
     * Get usedDataSpaceLt
     *
     * @return usedDataSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedDataSpaceLt() {
        return usedDataSpaceLt;
    }

    public void setUsedDataSpaceLt(Long usedDataSpaceLt) {
        this.usedDataSpaceLt = usedDataSpaceLt;
    }

    public ClusterWhereInput usedDataSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_LT);
        return this;
    }

    public ClusterWhereInput usedDataSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_LT);
        return this;
    }

    public void setUsedDataSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_LT);
        }
    }

    public boolean getUsedDataSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_LT);
    }

    public ClusterWhereInput usedDataSpaceLte(Long usedDataSpaceLte) {

        this.usedDataSpaceLte = usedDataSpaceLte;
        return this;
    }

    /**
     * Get usedDataSpaceLte
     *
     * @return usedDataSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedDataSpaceLte() {
        return usedDataSpaceLte;
    }

    public void setUsedDataSpaceLte(Long usedDataSpaceLte) {
        this.usedDataSpaceLte = usedDataSpaceLte;
    }

    public ClusterWhereInput usedDataSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_LTE);
        return this;
    }

    public ClusterWhereInput usedDataSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_LTE);
        return this;
    }

    public void setUsedDataSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_LTE);
        }
    }

    public boolean getUsedDataSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_LTE);
    }

    public ClusterWhereInput usedDataSpaceNot(Long usedDataSpaceNot) {

        this.usedDataSpaceNot = usedDataSpaceNot;
        return this;
    }

    /**
     * Get usedDataSpaceNot
     *
     * @return usedDataSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedDataSpaceNot() {
        return usedDataSpaceNot;
    }

    public void setUsedDataSpaceNot(Long usedDataSpaceNot) {
        this.usedDataSpaceNot = usedDataSpaceNot;
    }

    public ClusterWhereInput usedDataSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_NOT);
        return this;
    }

    public ClusterWhereInput usedDataSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_NOT);
        return this;
    }

    public void setUsedDataSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_NOT);
        }
    }

    public boolean getUsedDataSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_NOT);
    }

    public ClusterWhereInput usedDataSpaceNotIn(List<Long> usedDataSpaceNotIn) {

        this.usedDataSpaceNotIn = usedDataSpaceNotIn;
        return this;
    }

    public ClusterWhereInput addUsedDataSpaceNotInItem(Long usedDataSpaceNotInItem) {
        if (this.usedDataSpaceNotIn == null) {
            this.usedDataSpaceNotIn = new ArrayList<Long>();
        }
        this.usedDataSpaceNotIn.add(usedDataSpaceNotInItem);
        return this;
    }

    /**
     * Get usedDataSpaceNotIn
     *
     * @return usedDataSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getUsedDataSpaceNotIn() {
        return usedDataSpaceNotIn;
    }

    public void setUsedDataSpaceNotIn(List<Long> usedDataSpaceNotIn) {
        this.usedDataSpaceNotIn = usedDataSpaceNotIn;
    }

    public ClusterWhereInput usedDataSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN);
        return this;
    }

    public ClusterWhereInput usedDataSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN);
        return this;
    }

    public void setUsedDataSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN);
        }
    }

    public boolean getUsedDataSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN);
    }

    public ClusterWhereInput usedMemoryBytes(Double usedMemoryBytes) {

        this.usedMemoryBytes = usedMemoryBytes;
        return this;
    }

    /**
     * Get usedMemoryBytes
     *
     * @return usedMemoryBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedMemoryBytes() {
        return usedMemoryBytes;
    }

    public void setUsedMemoryBytes(Double usedMemoryBytes) {
        this.usedMemoryBytes = usedMemoryBytes;
    }

    public ClusterWhereInput usedMemoryBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_MEMORY_BYTES);
        return this;
    }

    public ClusterWhereInput usedMemoryBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_MEMORY_BYTES);
        return this;
    }

    public void setUsedMemoryBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_MEMORY_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_MEMORY_BYTES);
        }
    }

    public boolean getUsedMemoryBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_MEMORY_BYTES);
    }

    public ClusterWhereInput usedMemoryBytesGt(Double usedMemoryBytesGt) {

        this.usedMemoryBytesGt = usedMemoryBytesGt;
        return this;
    }

    /**
     * Get usedMemoryBytesGt
     *
     * @return usedMemoryBytesGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedMemoryBytesGt() {
        return usedMemoryBytesGt;
    }

    public void setUsedMemoryBytesGt(Double usedMemoryBytesGt) {
        this.usedMemoryBytesGt = usedMemoryBytesGt;
    }

    public ClusterWhereInput usedMemoryBytesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_MEMORY_BYTES_GT);
        return this;
    }

    public ClusterWhereInput usedMemoryBytesGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_MEMORY_BYTES_GT);
        return this;
    }

    public void setUsedMemoryBytesGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_MEMORY_BYTES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_MEMORY_BYTES_GT);
        }
    }

    public boolean getUsedMemoryBytesGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_MEMORY_BYTES_GT);
    }

    public ClusterWhereInput usedMemoryBytesGte(Double usedMemoryBytesGte) {

        this.usedMemoryBytesGte = usedMemoryBytesGte;
        return this;
    }

    /**
     * Get usedMemoryBytesGte
     *
     * @return usedMemoryBytesGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedMemoryBytesGte() {
        return usedMemoryBytesGte;
    }

    public void setUsedMemoryBytesGte(Double usedMemoryBytesGte) {
        this.usedMemoryBytesGte = usedMemoryBytesGte;
    }

    public ClusterWhereInput usedMemoryBytesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_MEMORY_BYTES_GTE);
        return this;
    }

    public ClusterWhereInput usedMemoryBytesGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_MEMORY_BYTES_GTE);
        return this;
    }

    public void setUsedMemoryBytesGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_MEMORY_BYTES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_MEMORY_BYTES_GTE);
        }
    }

    public boolean getUsedMemoryBytesGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_MEMORY_BYTES_GTE);
    }

    public ClusterWhereInput usedMemoryBytesIn(List<Double> usedMemoryBytesIn) {

        this.usedMemoryBytesIn = usedMemoryBytesIn;
        return this;
    }

    public ClusterWhereInput addUsedMemoryBytesInItem(Double usedMemoryBytesInItem) {
        if (this.usedMemoryBytesIn == null) {
            this.usedMemoryBytesIn = new ArrayList<Double>();
        }
        this.usedMemoryBytesIn.add(usedMemoryBytesInItem);
        return this;
    }

    /**
     * Get usedMemoryBytesIn
     *
     * @return usedMemoryBytesIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getUsedMemoryBytesIn() {
        return usedMemoryBytesIn;
    }

    public void setUsedMemoryBytesIn(List<Double> usedMemoryBytesIn) {
        this.usedMemoryBytesIn = usedMemoryBytesIn;
    }

    public ClusterWhereInput usedMemoryBytesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_MEMORY_BYTES_IN);
        return this;
    }

    public ClusterWhereInput usedMemoryBytesIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_MEMORY_BYTES_IN);
        return this;
    }

    public void setUsedMemoryBytesIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_MEMORY_BYTES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_MEMORY_BYTES_IN);
        }
    }

    public boolean getUsedMemoryBytesIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_MEMORY_BYTES_IN);
    }

    public ClusterWhereInput usedMemoryBytesLt(Double usedMemoryBytesLt) {

        this.usedMemoryBytesLt = usedMemoryBytesLt;
        return this;
    }

    /**
     * Get usedMemoryBytesLt
     *
     * @return usedMemoryBytesLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedMemoryBytesLt() {
        return usedMemoryBytesLt;
    }

    public void setUsedMemoryBytesLt(Double usedMemoryBytesLt) {
        this.usedMemoryBytesLt = usedMemoryBytesLt;
    }

    public ClusterWhereInput usedMemoryBytesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_MEMORY_BYTES_LT);
        return this;
    }

    public ClusterWhereInput usedMemoryBytesLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_MEMORY_BYTES_LT);
        return this;
    }

    public void setUsedMemoryBytesLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_MEMORY_BYTES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_MEMORY_BYTES_LT);
        }
    }

    public boolean getUsedMemoryBytesLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_MEMORY_BYTES_LT);
    }

    public ClusterWhereInput usedMemoryBytesLte(Double usedMemoryBytesLte) {

        this.usedMemoryBytesLte = usedMemoryBytesLte;
        return this;
    }

    /**
     * Get usedMemoryBytesLte
     *
     * @return usedMemoryBytesLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedMemoryBytesLte() {
        return usedMemoryBytesLte;
    }

    public void setUsedMemoryBytesLte(Double usedMemoryBytesLte) {
        this.usedMemoryBytesLte = usedMemoryBytesLte;
    }

    public ClusterWhereInput usedMemoryBytesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_MEMORY_BYTES_LTE);
        return this;
    }

    public ClusterWhereInput usedMemoryBytesLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_MEMORY_BYTES_LTE);
        return this;
    }

    public void setUsedMemoryBytesLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_MEMORY_BYTES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_MEMORY_BYTES_LTE);
        }
    }

    public boolean getUsedMemoryBytesLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_MEMORY_BYTES_LTE);
    }

    public ClusterWhereInput usedMemoryBytesNot(Double usedMemoryBytesNot) {

        this.usedMemoryBytesNot = usedMemoryBytesNot;
        return this;
    }

    /**
     * Get usedMemoryBytesNot
     *
     * @return usedMemoryBytesNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedMemoryBytesNot() {
        return usedMemoryBytesNot;
    }

    public void setUsedMemoryBytesNot(Double usedMemoryBytesNot) {
        this.usedMemoryBytesNot = usedMemoryBytesNot;
    }

    public ClusterWhereInput usedMemoryBytesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_MEMORY_BYTES_NOT);
        return this;
    }

    public ClusterWhereInput usedMemoryBytesNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_MEMORY_BYTES_NOT);
        return this;
    }

    public void setUsedMemoryBytesNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_MEMORY_BYTES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_MEMORY_BYTES_NOT);
        }
    }

    public boolean getUsedMemoryBytesNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_MEMORY_BYTES_NOT);
    }

    public ClusterWhereInput usedMemoryBytesNotIn(List<Double> usedMemoryBytesNotIn) {

        this.usedMemoryBytesNotIn = usedMemoryBytesNotIn;
        return this;
    }

    public ClusterWhereInput addUsedMemoryBytesNotInItem(Double usedMemoryBytesNotInItem) {
        if (this.usedMemoryBytesNotIn == null) {
            this.usedMemoryBytesNotIn = new ArrayList<Double>();
        }
        this.usedMemoryBytesNotIn.add(usedMemoryBytesNotInItem);
        return this;
    }

    /**
     * Get usedMemoryBytesNotIn
     *
     * @return usedMemoryBytesNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getUsedMemoryBytesNotIn() {
        return usedMemoryBytesNotIn;
    }

    public void setUsedMemoryBytesNotIn(List<Double> usedMemoryBytesNotIn) {
        this.usedMemoryBytesNotIn = usedMemoryBytesNotIn;
    }

    public ClusterWhereInput usedMemoryBytesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_MEMORY_BYTES_NOT_IN);
        return this;
    }

    public ClusterWhereInput usedMemoryBytesNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_MEMORY_BYTES_NOT_IN);
        return this;
    }

    public void setUsedMemoryBytesNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_MEMORY_BYTES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_MEMORY_BYTES_NOT_IN);
        }
    }

    public boolean getUsedMemoryBytesNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_MEMORY_BYTES_NOT_IN);
    }

    public ClusterWhereInput validDataSpace(Long validDataSpace) {

        this.validDataSpace = validDataSpace;
        return this;
    }

    /**
     * Get validDataSpace
     *
     * @return validDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidDataSpace() {
        return validDataSpace;
    }

    public void setValidDataSpace(Long validDataSpace) {
        this.validDataSpace = validDataSpace;
    }

    public ClusterWhereInput validDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE);
        return this;
    }

    public ClusterWhereInput validDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE);
        return this;
    }

    public void setValidDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE);
        }
    }

    public boolean getValidDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE);
    }

    public ClusterWhereInput validDataSpaceGt(Long validDataSpaceGt) {

        this.validDataSpaceGt = validDataSpaceGt;
        return this;
    }

    /**
     * Get validDataSpaceGt
     *
     * @return validDataSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidDataSpaceGt() {
        return validDataSpaceGt;
    }

    public void setValidDataSpaceGt(Long validDataSpaceGt) {
        this.validDataSpaceGt = validDataSpaceGt;
    }

    public ClusterWhereInput validDataSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_GT);
        return this;
    }

    public ClusterWhereInput validDataSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_GT);
        return this;
    }

    public void setValidDataSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_GT);
        }
    }

    public boolean getValidDataSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_GT);
    }

    public ClusterWhereInput validDataSpaceGte(Long validDataSpaceGte) {

        this.validDataSpaceGte = validDataSpaceGte;
        return this;
    }

    /**
     * Get validDataSpaceGte
     *
     * @return validDataSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidDataSpaceGte() {
        return validDataSpaceGte;
    }

    public void setValidDataSpaceGte(Long validDataSpaceGte) {
        this.validDataSpaceGte = validDataSpaceGte;
    }

    public ClusterWhereInput validDataSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_GTE);
        return this;
    }

    public ClusterWhereInput validDataSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_GTE);
        return this;
    }

    public void setValidDataSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_GTE);
        }
    }

    public boolean getValidDataSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_GTE);
    }

    public ClusterWhereInput validDataSpaceIn(List<Long> validDataSpaceIn) {

        this.validDataSpaceIn = validDataSpaceIn;
        return this;
    }

    public ClusterWhereInput addValidDataSpaceInItem(Long validDataSpaceInItem) {
        if (this.validDataSpaceIn == null) {
            this.validDataSpaceIn = new ArrayList<Long>();
        }
        this.validDataSpaceIn.add(validDataSpaceInItem);
        return this;
    }

    /**
     * Get validDataSpaceIn
     *
     * @return validDataSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getValidDataSpaceIn() {
        return validDataSpaceIn;
    }

    public void setValidDataSpaceIn(List<Long> validDataSpaceIn) {
        this.validDataSpaceIn = validDataSpaceIn;
    }

    public ClusterWhereInput validDataSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_IN);
        return this;
    }

    public ClusterWhereInput validDataSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_IN);
        return this;
    }

    public void setValidDataSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_IN);
        }
    }

    public boolean getValidDataSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_IN);
    }

    public ClusterWhereInput validDataSpaceLt(Long validDataSpaceLt) {

        this.validDataSpaceLt = validDataSpaceLt;
        return this;
    }

    /**
     * Get validDataSpaceLt
     *
     * @return validDataSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidDataSpaceLt() {
        return validDataSpaceLt;
    }

    public void setValidDataSpaceLt(Long validDataSpaceLt) {
        this.validDataSpaceLt = validDataSpaceLt;
    }

    public ClusterWhereInput validDataSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_LT);
        return this;
    }

    public ClusterWhereInput validDataSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_LT);
        return this;
    }

    public void setValidDataSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_LT);
        }
    }

    public boolean getValidDataSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_LT);
    }

    public ClusterWhereInput validDataSpaceLte(Long validDataSpaceLte) {

        this.validDataSpaceLte = validDataSpaceLte;
        return this;
    }

    /**
     * Get validDataSpaceLte
     *
     * @return validDataSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidDataSpaceLte() {
        return validDataSpaceLte;
    }

    public void setValidDataSpaceLte(Long validDataSpaceLte) {
        this.validDataSpaceLte = validDataSpaceLte;
    }

    public ClusterWhereInput validDataSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_LTE);
        return this;
    }

    public ClusterWhereInput validDataSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_LTE);
        return this;
    }

    public void setValidDataSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_LTE);
        }
    }

    public boolean getValidDataSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_LTE);
    }

    public ClusterWhereInput validDataSpaceNot(Long validDataSpaceNot) {

        this.validDataSpaceNot = validDataSpaceNot;
        return this;
    }

    /**
     * Get validDataSpaceNot
     *
     * @return validDataSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidDataSpaceNot() {
        return validDataSpaceNot;
    }

    public void setValidDataSpaceNot(Long validDataSpaceNot) {
        this.validDataSpaceNot = validDataSpaceNot;
    }

    public ClusterWhereInput validDataSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_NOT);
        return this;
    }

    public ClusterWhereInput validDataSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_NOT);
        return this;
    }

    public void setValidDataSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_NOT);
        }
    }

    public boolean getValidDataSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_NOT);
    }

    public ClusterWhereInput validDataSpaceNotIn(List<Long> validDataSpaceNotIn) {

        this.validDataSpaceNotIn = validDataSpaceNotIn;
        return this;
    }

    public ClusterWhereInput addValidDataSpaceNotInItem(Long validDataSpaceNotInItem) {
        if (this.validDataSpaceNotIn == null) {
            this.validDataSpaceNotIn = new ArrayList<Long>();
        }
        this.validDataSpaceNotIn.add(validDataSpaceNotInItem);
        return this;
    }

    /**
     * Get validDataSpaceNotIn
     *
     * @return validDataSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getValidDataSpaceNotIn() {
        return validDataSpaceNotIn;
    }

    public void setValidDataSpaceNotIn(List<Long> validDataSpaceNotIn) {
        this.validDataSpaceNotIn = validDataSpaceNotIn;
    }

    public ClusterWhereInput validDataSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN);
        return this;
    }

    public ClusterWhereInput validDataSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN);
        return this;
    }

    public void setValidDataSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN);
        }
    }

    public boolean getValidDataSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN);
    }

    public ClusterWhereInput vcenterAccount(VcenterAccountWhereInput vcenterAccount) {

        this.vcenterAccount = vcenterAccount;
        return this;
    }

    /**
     * Get vcenterAccount
     *
     * @return vcenterAccount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VcenterAccountWhereInput getVcenterAccount() {
        return vcenterAccount;
    }

    public void setVcenterAccount(VcenterAccountWhereInput vcenterAccount) {
        this.vcenterAccount = vcenterAccount;
    }

    public ClusterWhereInput vcenterAccount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCENTER_ACCOUNT);
        return this;
    }

    public ClusterWhereInput vcenterAccount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCENTER_ACCOUNT);
        return this;
    }

    public void setVcenterAccount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCENTER_ACCOUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCENTER_ACCOUNT);
        }
    }

    public boolean getVcenterAccount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCENTER_ACCOUNT);
    }

    public ClusterWhereInput vdsesEvery(VdsWhereInput vdsesEvery) {

        this.vdsesEvery = vdsesEvery;
        return this;
    }

    /**
     * Get vdsesEvery
     *
     * @return vdsesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VdsWhereInput getVdsesEvery() {
        return vdsesEvery;
    }

    public void setVdsesEvery(VdsWhereInput vdsesEvery) {
        this.vdsesEvery = vdsesEvery;
    }

    public ClusterWhereInput vdsesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDSES_EVERY);
        return this;
    }

    public ClusterWhereInput vdsesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDSES_EVERY);
        return this;
    }

    public void setVdsesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDSES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDSES_EVERY);
        }
    }

    public boolean getVdsesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDSES_EVERY);
    }

    public ClusterWhereInput vdsesNone(VdsWhereInput vdsesNone) {

        this.vdsesNone = vdsesNone;
        return this;
    }

    /**
     * Get vdsesNone
     *
     * @return vdsesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VdsWhereInput getVdsesNone() {
        return vdsesNone;
    }

    public void setVdsesNone(VdsWhereInput vdsesNone) {
        this.vdsesNone = vdsesNone;
    }

    public ClusterWhereInput vdsesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDSES_NONE);
        return this;
    }

    public ClusterWhereInput vdsesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDSES_NONE);
        return this;
    }

    public void setVdsesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDSES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDSES_NONE);
        }
    }

    public boolean getVdsesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDSES_NONE);
    }

    public ClusterWhereInput vdsesSome(VdsWhereInput vdsesSome) {

        this.vdsesSome = vdsesSome;
        return this;
    }

    /**
     * Get vdsesSome
     *
     * @return vdsesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VdsWhereInput getVdsesSome() {
        return vdsesSome;
    }

    public void setVdsesSome(VdsWhereInput vdsesSome) {
        this.vdsesSome = vdsesSome;
    }

    public ClusterWhereInput vdsesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDSES_SOME);
        return this;
    }

    public ClusterWhereInput vdsesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDSES_SOME);
        return this;
    }

    public void setVdsesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDSES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDSES_SOME);
        }
    }

    public boolean getVdsesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDSES_SOME);
    }

    public ClusterWhereInput version(String version) {

        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ClusterWhereInput version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public ClusterWhereInput version_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        return this;
    }

    public void setVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        }
    }

    public boolean getVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION);
    }

    public ClusterWhereInput versionContains(String versionContains) {

        this.versionContains = versionContains;
        return this;
    }

    /**
     * Get versionContains
     *
     * @return versionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionContains() {
        return versionContains;
    }

    public void setVersionContains(String versionContains) {
        this.versionContains = versionContains;
    }

    public ClusterWhereInput versionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_CONTAINS);
        return this;
    }

    public ClusterWhereInput versionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_CONTAINS);
        return this;
    }

    public void setVersionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_CONTAINS);
        }
    }

    public boolean getVersionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_CONTAINS);
    }

    public ClusterWhereInput versionEndsWith(String versionEndsWith) {

        this.versionEndsWith = versionEndsWith;
        return this;
    }

    /**
     * Get versionEndsWith
     *
     * @return versionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionEndsWith() {
        return versionEndsWith;
    }

    public void setVersionEndsWith(String versionEndsWith) {
        this.versionEndsWith = versionEndsWith;
    }

    public ClusterWhereInput versionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput versionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_ENDS_WITH);
        return this;
    }

    public void setVersionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_ENDS_WITH);
        }
    }

    public boolean getVersionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_ENDS_WITH);
    }

    public ClusterWhereInput versionGt(String versionGt) {

        this.versionGt = versionGt;
        return this;
    }

    /**
     * Get versionGt
     *
     * @return versionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionGt() {
        return versionGt;
    }

    public void setVersionGt(String versionGt) {
        this.versionGt = versionGt;
    }

    public ClusterWhereInput versionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_GT);
        return this;
    }

    public ClusterWhereInput versionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_GT);
        return this;
    }

    public void setVersionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_GT);
        }
    }

    public boolean getVersionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_GT);
    }

    public ClusterWhereInput versionGte(String versionGte) {

        this.versionGte = versionGte;
        return this;
    }

    /**
     * Get versionGte
     *
     * @return versionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionGte() {
        return versionGte;
    }

    public void setVersionGte(String versionGte) {
        this.versionGte = versionGte;
    }

    public ClusterWhereInput versionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_GTE);
        return this;
    }

    public ClusterWhereInput versionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_GTE);
        return this;
    }

    public void setVersionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_GTE);
        }
    }

    public boolean getVersionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_GTE);
    }

    public ClusterWhereInput versionIn(List<String> versionIn) {

        this.versionIn = versionIn;
        return this;
    }

    public ClusterWhereInput addVersionInItem(String versionInItem) {
        if (this.versionIn == null) {
            this.versionIn = new ArrayList<String>();
        }
        this.versionIn.add(versionInItem);
        return this;
    }

    /**
     * Get versionIn
     *
     * @return versionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVersionIn() {
        return versionIn;
    }

    public void setVersionIn(List<String> versionIn) {
        this.versionIn = versionIn;
    }

    public ClusterWhereInput versionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_IN);
        return this;
    }

    public ClusterWhereInput versionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_IN);
        return this;
    }

    public void setVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_IN);
        }
    }

    public boolean getVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_IN);
    }

    public ClusterWhereInput versionLt(String versionLt) {

        this.versionLt = versionLt;
        return this;
    }

    /**
     * Get versionLt
     *
     * @return versionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionLt() {
        return versionLt;
    }

    public void setVersionLt(String versionLt) {
        this.versionLt = versionLt;
    }

    public ClusterWhereInput versionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_LT);
        return this;
    }

    public ClusterWhereInput versionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_LT);
        return this;
    }

    public void setVersionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_LT);
        }
    }

    public boolean getVersionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_LT);
    }

    public ClusterWhereInput versionLte(String versionLte) {

        this.versionLte = versionLte;
        return this;
    }

    /**
     * Get versionLte
     *
     * @return versionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionLte() {
        return versionLte;
    }

    public void setVersionLte(String versionLte) {
        this.versionLte = versionLte;
    }

    public ClusterWhereInput versionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_LTE);
        return this;
    }

    public ClusterWhereInput versionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_LTE);
        return this;
    }

    public void setVersionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_LTE);
        }
    }

    public boolean getVersionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_LTE);
    }

    public ClusterWhereInput versionNot(String versionNot) {

        this.versionNot = versionNot;
        return this;
    }

    /**
     * Get versionNot
     *
     * @return versionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionNot() {
        return versionNot;
    }

    public void setVersionNot(String versionNot) {
        this.versionNot = versionNot;
    }

    public ClusterWhereInput versionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT);
        return this;
    }

    public ClusterWhereInput versionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT);
        return this;
    }

    public void setVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT);
        }
    }

    public boolean getVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT);
    }

    public ClusterWhereInput versionNotContains(String versionNotContains) {

        this.versionNotContains = versionNotContains;
        return this;
    }

    /**
     * Get versionNotContains
     *
     * @return versionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionNotContains() {
        return versionNotContains;
    }

    public void setVersionNotContains(String versionNotContains) {
        this.versionNotContains = versionNotContains;
    }

    public ClusterWhereInput versionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
        return this;
    }

    public ClusterWhereInput versionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
        return this;
    }

    public void setVersionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
        }
    }

    public boolean getVersionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
    }

    public ClusterWhereInput versionNotEndsWith(String versionNotEndsWith) {

        this.versionNotEndsWith = versionNotEndsWith;
        return this;
    }

    /**
     * Get versionNotEndsWith
     *
     * @return versionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionNotEndsWith() {
        return versionNotEndsWith;
    }

    public void setVersionNotEndsWith(String versionNotEndsWith) {
        this.versionNotEndsWith = versionNotEndsWith;
    }

    public ClusterWhereInput versionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public ClusterWhereInput versionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public void setVersionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
        }
    }

    public boolean getVersionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
    }

    public ClusterWhereInput versionNotIn(List<String> versionNotIn) {

        this.versionNotIn = versionNotIn;
        return this;
    }

    public ClusterWhereInput addVersionNotInItem(String versionNotInItem) {
        if (this.versionNotIn == null) {
            this.versionNotIn = new ArrayList<String>();
        }
        this.versionNotIn.add(versionNotInItem);
        return this;
    }

    /**
     * Get versionNotIn
     *
     * @return versionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVersionNotIn() {
        return versionNotIn;
    }

    public void setVersionNotIn(List<String> versionNotIn) {
        this.versionNotIn = versionNotIn;
    }

    public ClusterWhereInput versionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_IN);
        return this;
    }

    public ClusterWhereInput versionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_IN);
        return this;
    }

    public void setVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_IN);
        }
    }

    public boolean getVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_IN);
    }

    public ClusterWhereInput versionNotStartsWith(String versionNotStartsWith) {

        this.versionNotStartsWith = versionNotStartsWith;
        return this;
    }

    /**
     * Get versionNotStartsWith
     *
     * @return versionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionNotStartsWith() {
        return versionNotStartsWith;
    }

    public void setVersionNotStartsWith(String versionNotStartsWith) {
        this.versionNotStartsWith = versionNotStartsWith;
    }

    public ClusterWhereInput versionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput versionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public void setVersionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
        }
    }

    public boolean getVersionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
    }

    public ClusterWhereInput versionStartsWith(String versionStartsWith) {

        this.versionStartsWith = versionStartsWith;
        return this;
    }

    /**
     * Get versionStartsWith
     *
     * @return versionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionStartsWith() {
        return versionStartsWith;
    }

    public void setVersionStartsWith(String versionStartsWith) {
        this.versionStartsWith = versionStartsWith;
    }

    public ClusterWhereInput versionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_STARTS_WITH);
        return this;
    }

    public ClusterWhereInput versionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_STARTS_WITH);
        return this;
    }

    public void setVersionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_STARTS_WITH);
        }
    }

    public boolean getVersionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_STARTS_WITH);
    }

    public ClusterWhereInput vhostEnabled(Boolean vhostEnabled) {

        this.vhostEnabled = vhostEnabled;
        return this;
    }

    /**
     * Get vhostEnabled
     *
     * @return vhostEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVhostEnabled() {
        return vhostEnabled;
    }

    public void setVhostEnabled(Boolean vhostEnabled) {
        this.vhostEnabled = vhostEnabled;
    }

    public ClusterWhereInput vhostEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VHOST_ENABLED);
        return this;
    }

    public ClusterWhereInput vhostEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VHOST_ENABLED);
        return this;
    }

    public void setVhostEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VHOST_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VHOST_ENABLED);
        }
    }

    public boolean getVhostEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VHOST_ENABLED);
    }

    public ClusterWhereInput vhostEnabledNot(Boolean vhostEnabledNot) {

        this.vhostEnabledNot = vhostEnabledNot;
        return this;
    }

    /**
     * Get vhostEnabledNot
     *
     * @return vhostEnabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVhostEnabledNot() {
        return vhostEnabledNot;
    }

    public void setVhostEnabledNot(Boolean vhostEnabledNot) {
        this.vhostEnabledNot = vhostEnabledNot;
    }

    public ClusterWhereInput vhostEnabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VHOST_ENABLED_NOT);
        return this;
    }

    public ClusterWhereInput vhostEnabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VHOST_ENABLED_NOT);
        return this;
    }

    public void setVhostEnabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VHOST_ENABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VHOST_ENABLED_NOT);
        }
    }

    public boolean getVhostEnabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VHOST_ENABLED_NOT);
    }

    public ClusterWhereInput vmFoldersEvery(VmFolderWhereInput vmFoldersEvery) {

        this.vmFoldersEvery = vmFoldersEvery;
        return this;
    }

    /**
     * Get vmFoldersEvery
     *
     * @return vmFoldersEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmFolderWhereInput getVmFoldersEvery() {
        return vmFoldersEvery;
    }

    public void setVmFoldersEvery(VmFolderWhereInput vmFoldersEvery) {
        this.vmFoldersEvery = vmFoldersEvery;
    }

    public ClusterWhereInput vmFoldersEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_FOLDERS_EVERY);
        return this;
    }

    public ClusterWhereInput vmFoldersEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_FOLDERS_EVERY);
        return this;
    }

    public void setVmFoldersEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_FOLDERS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_FOLDERS_EVERY);
        }
    }

    public boolean getVmFoldersEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_FOLDERS_EVERY);
    }

    public ClusterWhereInput vmFoldersNone(VmFolderWhereInput vmFoldersNone) {

        this.vmFoldersNone = vmFoldersNone;
        return this;
    }

    /**
     * Get vmFoldersNone
     *
     * @return vmFoldersNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmFolderWhereInput getVmFoldersNone() {
        return vmFoldersNone;
    }

    public void setVmFoldersNone(VmFolderWhereInput vmFoldersNone) {
        this.vmFoldersNone = vmFoldersNone;
    }

    public ClusterWhereInput vmFoldersNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_FOLDERS_NONE);
        return this;
    }

    public ClusterWhereInput vmFoldersNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_FOLDERS_NONE);
        return this;
    }

    public void setVmFoldersNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_FOLDERS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_FOLDERS_NONE);
        }
    }

    public boolean getVmFoldersNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_FOLDERS_NONE);
    }

    public ClusterWhereInput vmFoldersSome(VmFolderWhereInput vmFoldersSome) {

        this.vmFoldersSome = vmFoldersSome;
        return this;
    }

    /**
     * Get vmFoldersSome
     *
     * @return vmFoldersSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmFolderWhereInput getVmFoldersSome() {
        return vmFoldersSome;
    }

    public void setVmFoldersSome(VmFolderWhereInput vmFoldersSome) {
        this.vmFoldersSome = vmFoldersSome;
    }

    public ClusterWhereInput vmFoldersSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_FOLDERS_SOME);
        return this;
    }

    public ClusterWhereInput vmFoldersSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_FOLDERS_SOME);
        return this;
    }

    public void setVmFoldersSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_FOLDERS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_FOLDERS_SOME);
        }
    }

    public boolean getVmFoldersSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_FOLDERS_SOME);
    }

    public ClusterWhereInput vmNum(Integer vmNum) {

        this.vmNum = vmNum;
        return this;
    }

    /**
     * Get vmNum
     *
     * @return vmNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmNum() {
        return vmNum;
    }

    public void setVmNum(Integer vmNum) {
        this.vmNum = vmNum;
    }

    public ClusterWhereInput vmNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM);
        return this;
    }

    public ClusterWhereInput vmNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM);
        return this;
    }

    public void setVmNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM);
        }
    }

    public boolean getVmNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM);
    }

    public ClusterWhereInput vmNumGt(Integer vmNumGt) {

        this.vmNumGt = vmNumGt;
        return this;
    }

    /**
     * Get vmNumGt
     *
     * @return vmNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmNumGt() {
        return vmNumGt;
    }

    public void setVmNumGt(Integer vmNumGt) {
        this.vmNumGt = vmNumGt;
    }

    public ClusterWhereInput vmNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_GT);
        return this;
    }

    public ClusterWhereInput vmNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_GT);
        return this;
    }

    public void setVmNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_GT);
        }
    }

    public boolean getVmNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_GT);
    }

    public ClusterWhereInput vmNumGte(Integer vmNumGte) {

        this.vmNumGte = vmNumGte;
        return this;
    }

    /**
     * Get vmNumGte
     *
     * @return vmNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmNumGte() {
        return vmNumGte;
    }

    public void setVmNumGte(Integer vmNumGte) {
        this.vmNumGte = vmNumGte;
    }

    public ClusterWhereInput vmNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_GTE);
        return this;
    }

    public ClusterWhereInput vmNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_GTE);
        return this;
    }

    public void setVmNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_GTE);
        }
    }

    public boolean getVmNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_GTE);
    }

    public ClusterWhereInput vmNumIn(List<Integer> vmNumIn) {

        this.vmNumIn = vmNumIn;
        return this;
    }

    public ClusterWhereInput addVmNumInItem(Integer vmNumInItem) {
        if (this.vmNumIn == null) {
            this.vmNumIn = new ArrayList<Integer>();
        }
        this.vmNumIn.add(vmNumInItem);
        return this;
    }

    /**
     * Get vmNumIn
     *
     * @return vmNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVmNumIn() {
        return vmNumIn;
    }

    public void setVmNumIn(List<Integer> vmNumIn) {
        this.vmNumIn = vmNumIn;
    }

    public ClusterWhereInput vmNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_IN);
        return this;
    }

    public ClusterWhereInput vmNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_IN);
        return this;
    }

    public void setVmNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_IN);
        }
    }

    public boolean getVmNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_IN);
    }

    public ClusterWhereInput vmNumLt(Integer vmNumLt) {

        this.vmNumLt = vmNumLt;
        return this;
    }

    /**
     * Get vmNumLt
     *
     * @return vmNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmNumLt() {
        return vmNumLt;
    }

    public void setVmNumLt(Integer vmNumLt) {
        this.vmNumLt = vmNumLt;
    }

    public ClusterWhereInput vmNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_LT);
        return this;
    }

    public ClusterWhereInput vmNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_LT);
        return this;
    }

    public void setVmNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_LT);
        }
    }

    public boolean getVmNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_LT);
    }

    public ClusterWhereInput vmNumLte(Integer vmNumLte) {

        this.vmNumLte = vmNumLte;
        return this;
    }

    /**
     * Get vmNumLte
     *
     * @return vmNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmNumLte() {
        return vmNumLte;
    }

    public void setVmNumLte(Integer vmNumLte) {
        this.vmNumLte = vmNumLte;
    }

    public ClusterWhereInput vmNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_LTE);
        return this;
    }

    public ClusterWhereInput vmNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_LTE);
        return this;
    }

    public void setVmNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_LTE);
        }
    }

    public boolean getVmNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_LTE);
    }

    public ClusterWhereInput vmNumNot(Integer vmNumNot) {

        this.vmNumNot = vmNumNot;
        return this;
    }

    /**
     * Get vmNumNot
     *
     * @return vmNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmNumNot() {
        return vmNumNot;
    }

    public void setVmNumNot(Integer vmNumNot) {
        this.vmNumNot = vmNumNot;
    }

    public ClusterWhereInput vmNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_NOT);
        return this;
    }

    public ClusterWhereInput vmNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_NOT);
        return this;
    }

    public void setVmNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_NOT);
        }
    }

    public boolean getVmNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_NOT);
    }

    public ClusterWhereInput vmNumNotIn(List<Integer> vmNumNotIn) {

        this.vmNumNotIn = vmNumNotIn;
        return this;
    }

    public ClusterWhereInput addVmNumNotInItem(Integer vmNumNotInItem) {
        if (this.vmNumNotIn == null) {
            this.vmNumNotIn = new ArrayList<Integer>();
        }
        this.vmNumNotIn.add(vmNumNotInItem);
        return this;
    }

    /**
     * Get vmNumNotIn
     *
     * @return vmNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVmNumNotIn() {
        return vmNumNotIn;
    }

    public void setVmNumNotIn(List<Integer> vmNumNotIn) {
        this.vmNumNotIn = vmNumNotIn;
    }

    public ClusterWhereInput vmNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_NOT_IN);
        return this;
    }

    public ClusterWhereInput vmNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_NOT_IN);
        return this;
    }

    public void setVmNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_NOT_IN);
        }
    }

    public boolean getVmNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_NOT_IN);
    }

    public ClusterWhereInput vmTemplatesEvery(VmTemplateWhereInput vmTemplatesEvery) {

        this.vmTemplatesEvery = vmTemplatesEvery;
        return this;
    }

    /**
     * Get vmTemplatesEvery
     *
     * @return vmTemplatesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmTemplateWhereInput getVmTemplatesEvery() {
        return vmTemplatesEvery;
    }

    public void setVmTemplatesEvery(VmTemplateWhereInput vmTemplatesEvery) {
        this.vmTemplatesEvery = vmTemplatesEvery;
    }

    public ClusterWhereInput vmTemplatesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES_EVERY);
        return this;
    }

    public ClusterWhereInput vmTemplatesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES_EVERY);
        return this;
    }

    public void setVmTemplatesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES_EVERY);
        }
    }

    public boolean getVmTemplatesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATES_EVERY);
    }

    public ClusterWhereInput vmTemplatesNone(VmTemplateWhereInput vmTemplatesNone) {

        this.vmTemplatesNone = vmTemplatesNone;
        return this;
    }

    /**
     * Get vmTemplatesNone
     *
     * @return vmTemplatesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmTemplateWhereInput getVmTemplatesNone() {
        return vmTemplatesNone;
    }

    public void setVmTemplatesNone(VmTemplateWhereInput vmTemplatesNone) {
        this.vmTemplatesNone = vmTemplatesNone;
    }

    public ClusterWhereInput vmTemplatesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES_NONE);
        return this;
    }

    public ClusterWhereInput vmTemplatesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES_NONE);
        return this;
    }

    public void setVmTemplatesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES_NONE);
        }
    }

    public boolean getVmTemplatesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATES_NONE);
    }

    public ClusterWhereInput vmTemplatesSome(VmTemplateWhereInput vmTemplatesSome) {

        this.vmTemplatesSome = vmTemplatesSome;
        return this;
    }

    /**
     * Get vmTemplatesSome
     *
     * @return vmTemplatesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmTemplateWhereInput getVmTemplatesSome() {
        return vmTemplatesSome;
    }

    public void setVmTemplatesSome(VmTemplateWhereInput vmTemplatesSome) {
        this.vmTemplatesSome = vmTemplatesSome;
    }

    public ClusterWhereInput vmTemplatesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES_SOME);
        return this;
    }

    public ClusterWhereInput vmTemplatesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES_SOME);
        return this;
    }

    public void setVmTemplatesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES_SOME);
        }
    }

    public boolean getVmTemplatesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATES_SOME);
    }

    public ClusterWhereInput vmsEvery(VmWhereInput vmsEvery) {

        this.vmsEvery = vmsEvery;
        return this;
    }

    /**
     * Get vmsEvery
     *
     * @return vmsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVmsEvery() {
        return vmsEvery;
    }

    public void setVmsEvery(VmWhereInput vmsEvery) {
        this.vmsEvery = vmsEvery;
    }

    public ClusterWhereInput vmsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_EVERY);
        return this;
    }

    public ClusterWhereInput vmsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS_EVERY);
        return this;
    }

    public void setVmsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS_EVERY);
        }
    }

    public boolean getVmsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS_EVERY);
    }

    public ClusterWhereInput vmsNone(VmWhereInput vmsNone) {

        this.vmsNone = vmsNone;
        return this;
    }

    /**
     * Get vmsNone
     *
     * @return vmsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVmsNone() {
        return vmsNone;
    }

    public void setVmsNone(VmWhereInput vmsNone) {
        this.vmsNone = vmsNone;
    }

    public ClusterWhereInput vmsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_NONE);
        return this;
    }

    public ClusterWhereInput vmsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS_NONE);
        return this;
    }

    public void setVmsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS_NONE);
        }
    }

    public boolean getVmsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS_NONE);
    }

    public ClusterWhereInput vmsSome(VmWhereInput vmsSome) {

        this.vmsSome = vmsSome;
        return this;
    }

    /**
     * Get vmsSome
     *
     * @return vmsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVmsSome() {
        return vmsSome;
    }

    public void setVmsSome(VmWhereInput vmsSome) {
        this.vmsSome = vmsSome;
    }

    public ClusterWhereInput vmsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_SOME);
        return this;
    }

    public ClusterWhereInput vmsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS_SOME);
        return this;
    }

    public void setVmsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS_SOME);
        }
    }

    public boolean getVmsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS_SOME);
    }

    public ClusterWhereInput witness(WitnessWhereInput witness) {

        this.witness = witness;
        return this;
    }

    /**
     * Get witness
     *
     * @return witness
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public WitnessWhereInput getWitness() {
        return witness;
    }

    public void setWitness(WitnessWhereInput witness) {
        this.witness = witness;
    }

    public ClusterWhereInput witness_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WITNESS);
        return this;
    }

    public ClusterWhereInput witness_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WITNESS);
        return this;
    }

    public void setWitness_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WITNESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WITNESS);
        }
    }

    public boolean getWitness_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WITNESS);
    }

    public ClusterWhereInput zonesEvery(ZoneWhereInput zonesEvery) {

        this.zonesEvery = zonesEvery;
        return this;
    }

    /**
     * Get zonesEvery
     *
     * @return zonesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ZoneWhereInput getZonesEvery() {
        return zonesEvery;
    }

    public void setZonesEvery(ZoneWhereInput zonesEvery) {
        this.zonesEvery = zonesEvery;
    }

    public ClusterWhereInput zonesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZONES_EVERY);
        return this;
    }

    public ClusterWhereInput zonesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZONES_EVERY);
        return this;
    }

    public void setZonesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZONES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZONES_EVERY);
        }
    }

    public boolean getZonesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZONES_EVERY);
    }

    public ClusterWhereInput zonesNone(ZoneWhereInput zonesNone) {

        this.zonesNone = zonesNone;
        return this;
    }

    /**
     * Get zonesNone
     *
     * @return zonesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ZoneWhereInput getZonesNone() {
        return zonesNone;
    }

    public void setZonesNone(ZoneWhereInput zonesNone) {
        this.zonesNone = zonesNone;
    }

    public ClusterWhereInput zonesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZONES_NONE);
        return this;
    }

    public ClusterWhereInput zonesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZONES_NONE);
        return this;
    }

    public void setZonesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZONES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZONES_NONE);
        }
    }

    public boolean getZonesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZONES_NONE);
    }

    public ClusterWhereInput zonesSome(ZoneWhereInput zonesSome) {

        this.zonesSome = zonesSome;
        return this;
    }

    /**
     * Get zonesSome
     *
     * @return zonesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ZoneWhereInput getZonesSome() {
        return zonesSome;
    }

    public void setZonesSome(ZoneWhereInput zonesSome) {
        this.zonesSome = zonesSome;
    }

    public ClusterWhereInput zonesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZONES_SOME);
        return this;
    }

    public ClusterWhereInput zonesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZONES_SOME);
        return this;
    }

    public void setZonesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZONES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZONES_SOME);
        }
    }

    public boolean getZonesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZONES_SOME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterWhereInput clusterWhereInput = (ClusterWhereInput) o;
        return Objects.equals(this.AND, clusterWhereInput.AND)
                && Objects.equals(this.NOT, clusterWhereInput.NOT)
                && Objects.equals(this.OR, clusterWhereInput.OR)
                && Objects.equals(
                        this.applicationHighestVersion, clusterWhereInput.applicationHighestVersion)
                && Objects.equals(
                        this.applicationHighestVersionContains,
                        clusterWhereInput.applicationHighestVersionContains)
                && Objects.equals(
                        this.applicationHighestVersionEndsWith,
                        clusterWhereInput.applicationHighestVersionEndsWith)
                && Objects.equals(
                        this.applicationHighestVersionGt,
                        clusterWhereInput.applicationHighestVersionGt)
                && Objects.equals(
                        this.applicationHighestVersionGte,
                        clusterWhereInput.applicationHighestVersionGte)
                && Objects.equals(
                        this.applicationHighestVersionIn,
                        clusterWhereInput.applicationHighestVersionIn)
                && Objects.equals(
                        this.applicationHighestVersionLt,
                        clusterWhereInput.applicationHighestVersionLt)
                && Objects.equals(
                        this.applicationHighestVersionLte,
                        clusterWhereInput.applicationHighestVersionLte)
                && Objects.equals(
                        this.applicationHighestVersionNot,
                        clusterWhereInput.applicationHighestVersionNot)
                && Objects.equals(
                        this.applicationHighestVersionNotContains,
                        clusterWhereInput.applicationHighestVersionNotContains)
                && Objects.equals(
                        this.applicationHighestVersionNotEndsWith,
                        clusterWhereInput.applicationHighestVersionNotEndsWith)
                && Objects.equals(
                        this.applicationHighestVersionNotIn,
                        clusterWhereInput.applicationHighestVersionNotIn)
                && Objects.equals(
                        this.applicationHighestVersionNotStartsWith,
                        clusterWhereInput.applicationHighestVersionNotStartsWith)
                && Objects.equals(
                        this.applicationHighestVersionStartsWith,
                        clusterWhereInput.applicationHighestVersionStartsWith)
                && Objects.equals(this.applicationsEvery, clusterWhereInput.applicationsEvery)
                && Objects.equals(this.applicationsNone, clusterWhereInput.applicationsNone)
                && Objects.equals(this.applicationsSome, clusterWhereInput.applicationsSome)
                && Objects.equals(this.architecture, clusterWhereInput.architecture)
                && Objects.equals(this.architectureIn, clusterWhereInput.architectureIn)
                && Objects.equals(this.architectureNot, clusterWhereInput.architectureNot)
                && Objects.equals(this.architectureNotIn, clusterWhereInput.architectureNotIn)
                && Objects.equals(this.autoConverge, clusterWhereInput.autoConverge)
                && Objects.equals(this.autoConvergeNot, clusterWhereInput.autoConvergeNot)
                && Objects.equals(this.connectState, clusterWhereInput.connectState)
                && Objects.equals(this.connectStateIn, clusterWhereInput.connectStateIn)
                && Objects.equals(this.connectStateNot, clusterWhereInput.connectStateNot)
                && Objects.equals(this.connectStateNotIn, clusterWhereInput.connectStateNotIn)
                && Objects.equals(
                        this.consistencyGroupsEvery, clusterWhereInput.consistencyGroupsEvery)
                && Objects.equals(
                        this.consistencyGroupsNone, clusterWhereInput.consistencyGroupsNone)
                && Objects.equals(
                        this.consistencyGroupsSome, clusterWhereInput.consistencyGroupsSome)
                && Objects.equals(this.currentCpuModel, clusterWhereInput.currentCpuModel)
                && Objects.equals(
                        this.currentCpuModelContains, clusterWhereInput.currentCpuModelContains)
                && Objects.equals(
                        this.currentCpuModelEndsWith, clusterWhereInput.currentCpuModelEndsWith)
                && Objects.equals(this.currentCpuModelGt, clusterWhereInput.currentCpuModelGt)
                && Objects.equals(this.currentCpuModelGte, clusterWhereInput.currentCpuModelGte)
                && Objects.equals(this.currentCpuModelIn, clusterWhereInput.currentCpuModelIn)
                && Objects.equals(this.currentCpuModelLt, clusterWhereInput.currentCpuModelLt)
                && Objects.equals(this.currentCpuModelLte, clusterWhereInput.currentCpuModelLte)
                && Objects.equals(this.currentCpuModelNot, clusterWhereInput.currentCpuModelNot)
                && Objects.equals(
                        this.currentCpuModelNotContains,
                        clusterWhereInput.currentCpuModelNotContains)
                && Objects.equals(
                        this.currentCpuModelNotEndsWith,
                        clusterWhereInput.currentCpuModelNotEndsWith)
                && Objects.equals(this.currentCpuModelNotIn, clusterWhereInput.currentCpuModelNotIn)
                && Objects.equals(
                        this.currentCpuModelNotStartsWith,
                        clusterWhereInput.currentCpuModelNotStartsWith)
                && Objects.equals(
                        this.currentCpuModelStartsWith, clusterWhereInput.currentCpuModelStartsWith)
                && Objects.equals(this.datacentersEvery, clusterWhereInput.datacentersEvery)
                && Objects.equals(this.datacentersNone, clusterWhereInput.datacentersNone)
                && Objects.equals(this.datacentersSome, clusterWhereInput.datacentersSome)
                && Objects.equals(this.disconnectedDate, clusterWhereInput.disconnectedDate)
                && Objects.equals(this.disconnectedDateGt, clusterWhereInput.disconnectedDateGt)
                && Objects.equals(this.disconnectedDateGte, clusterWhereInput.disconnectedDateGte)
                && Objects.equals(this.disconnectedDateIn, clusterWhereInput.disconnectedDateIn)
                && Objects.equals(this.disconnectedDateLt, clusterWhereInput.disconnectedDateLt)
                && Objects.equals(this.disconnectedDateLte, clusterWhereInput.disconnectedDateLte)
                && Objects.equals(this.disconnectedDateNot, clusterWhereInput.disconnectedDateNot)
                && Objects.equals(
                        this.disconnectedDateNotIn, clusterWhereInput.disconnectedDateNotIn)
                && Objects.equals(this.disconnectedReason, clusterWhereInput.disconnectedReason)
                && Objects.equals(this.disconnectedReasonIn, clusterWhereInput.disconnectedReasonIn)
                && Objects.equals(
                        this.disconnectedReasonNot, clusterWhereInput.disconnectedReasonNot)
                && Objects.equals(
                        this.disconnectedReasonNotIn, clusterWhereInput.disconnectedReasonNotIn)
                && Objects.equals(this.entityAsyncStatus, clusterWhereInput.entityAsyncStatus)
                && Objects.equals(this.entityAsyncStatusIn, clusterWhereInput.entityAsyncStatusIn)
                && Objects.equals(this.entityAsyncStatusNot, clusterWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, clusterWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.everouteCluster, clusterWhereInput.everouteCluster)
                && Objects.equals(this.failureDataSpace, clusterWhereInput.failureDataSpace)
                && Objects.equals(this.failureDataSpaceGt, clusterWhereInput.failureDataSpaceGt)
                && Objects.equals(this.failureDataSpaceGte, clusterWhereInput.failureDataSpaceGte)
                && Objects.equals(this.failureDataSpaceIn, clusterWhereInput.failureDataSpaceIn)
                && Objects.equals(this.failureDataSpaceLt, clusterWhereInput.failureDataSpaceLt)
                && Objects.equals(this.failureDataSpaceLte, clusterWhereInput.failureDataSpaceLte)
                && Objects.equals(this.failureDataSpaceNot, clusterWhereInput.failureDataSpaceNot)
                && Objects.equals(
                        this.failureDataSpaceNotIn, clusterWhereInput.failureDataSpaceNotIn)
                && Objects.equals(this.hasMetrox, clusterWhereInput.hasMetrox)
                && Objects.equals(this.hasMetroxNot, clusterWhereInput.hasMetroxNot)
                && Objects.equals(this.hostNum, clusterWhereInput.hostNum)
                && Objects.equals(this.hostNumGt, clusterWhereInput.hostNumGt)
                && Objects.equals(this.hostNumGte, clusterWhereInput.hostNumGte)
                && Objects.equals(this.hostNumIn, clusterWhereInput.hostNumIn)
                && Objects.equals(this.hostNumLt, clusterWhereInput.hostNumLt)
                && Objects.equals(this.hostNumLte, clusterWhereInput.hostNumLte)
                && Objects.equals(this.hostNumNot, clusterWhereInput.hostNumNot)
                && Objects.equals(this.hostNumNotIn, clusterWhereInput.hostNumNotIn)
                && Objects.equals(this.hostsEvery, clusterWhereInput.hostsEvery)
                && Objects.equals(this.hostsNone, clusterWhereInput.hostsNone)
                && Objects.equals(this.hostsSome, clusterWhereInput.hostsSome)
                && Objects.equals(this.hypervisor, clusterWhereInput.hypervisor)
                && Objects.equals(this.hypervisorIn, clusterWhereInput.hypervisorIn)
                && Objects.equals(this.hypervisorNot, clusterWhereInput.hypervisorNot)
                && Objects.equals(this.hypervisorNotIn, clusterWhereInput.hypervisorNotIn)
                && Objects.equals(this.id, clusterWhereInput.id)
                && Objects.equals(this.idContains, clusterWhereInput.idContains)
                && Objects.equals(this.idEndsWith, clusterWhereInput.idEndsWith)
                && Objects.equals(this.idGt, clusterWhereInput.idGt)
                && Objects.equals(this.idGte, clusterWhereInput.idGte)
                && Objects.equals(this.idIn, clusterWhereInput.idIn)
                && Objects.equals(this.idLt, clusterWhereInput.idLt)
                && Objects.equals(this.idLte, clusterWhereInput.idLte)
                && Objects.equals(this.idNot, clusterWhereInput.idNot)
                && Objects.equals(this.idNotContains, clusterWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, clusterWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, clusterWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, clusterWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, clusterWhereInput.idStartsWith)
                && Objects.equals(this.ip, clusterWhereInput.ip)
                && Objects.equals(this.ipContains, clusterWhereInput.ipContains)
                && Objects.equals(this.ipEndsWith, clusterWhereInput.ipEndsWith)
                && Objects.equals(this.ipGt, clusterWhereInput.ipGt)
                && Objects.equals(this.ipGte, clusterWhereInput.ipGte)
                && Objects.equals(this.ipIn, clusterWhereInput.ipIn)
                && Objects.equals(this.ipLt, clusterWhereInput.ipLt)
                && Objects.equals(this.ipLte, clusterWhereInput.ipLte)
                && Objects.equals(this.ipNot, clusterWhereInput.ipNot)
                && Objects.equals(this.ipNotContains, clusterWhereInput.ipNotContains)
                && Objects.equals(this.ipNotEndsWith, clusterWhereInput.ipNotEndsWith)
                && Objects.equals(this.ipNotIn, clusterWhereInput.ipNotIn)
                && Objects.equals(this.ipNotStartsWith, clusterWhereInput.ipNotStartsWith)
                && Objects.equals(this.ipStartsWith, clusterWhereInput.ipStartsWith)
                && Objects.equals(this.isAllFlash, clusterWhereInput.isAllFlash)
                && Objects.equals(this.isAllFlashNot, clusterWhereInput.isAllFlashNot)
                && Objects.equals(this.iscsiVip, clusterWhereInput.iscsiVip)
                && Objects.equals(this.iscsiVipContains, clusterWhereInput.iscsiVipContains)
                && Objects.equals(this.iscsiVipEndsWith, clusterWhereInput.iscsiVipEndsWith)
                && Objects.equals(this.iscsiVipGt, clusterWhereInput.iscsiVipGt)
                && Objects.equals(this.iscsiVipGte, clusterWhereInput.iscsiVipGte)
                && Objects.equals(this.iscsiVipIn, clusterWhereInput.iscsiVipIn)
                && Objects.equals(this.iscsiVipLt, clusterWhereInput.iscsiVipLt)
                && Objects.equals(this.iscsiVipLte, clusterWhereInput.iscsiVipLte)
                && Objects.equals(this.iscsiVipNot, clusterWhereInput.iscsiVipNot)
                && Objects.equals(this.iscsiVipNotContains, clusterWhereInput.iscsiVipNotContains)
                && Objects.equals(this.iscsiVipNotEndsWith, clusterWhereInput.iscsiVipNotEndsWith)
                && Objects.equals(this.iscsiVipNotIn, clusterWhereInput.iscsiVipNotIn)
                && Objects.equals(
                        this.iscsiVipNotStartsWith, clusterWhereInput.iscsiVipNotStartsWith)
                && Objects.equals(this.iscsiVipStartsWith, clusterWhereInput.iscsiVipStartsWith)
                && Objects.equals(this.labelsEvery, clusterWhereInput.labelsEvery)
                && Objects.equals(this.labelsNone, clusterWhereInput.labelsNone)
                && Objects.equals(this.labelsSome, clusterWhereInput.labelsSome)
                && Objects.equals(this.licenseExpireDate, clusterWhereInput.licenseExpireDate)
                && Objects.equals(this.licenseExpireDateGt, clusterWhereInput.licenseExpireDateGt)
                && Objects.equals(this.licenseExpireDateGte, clusterWhereInput.licenseExpireDateGte)
                && Objects.equals(this.licenseExpireDateIn, clusterWhereInput.licenseExpireDateIn)
                && Objects.equals(this.licenseExpireDateLt, clusterWhereInput.licenseExpireDateLt)
                && Objects.equals(this.licenseExpireDateLte, clusterWhereInput.licenseExpireDateLte)
                && Objects.equals(this.licenseExpireDateNot, clusterWhereInput.licenseExpireDateNot)
                && Objects.equals(
                        this.licenseExpireDateNotIn, clusterWhereInput.licenseExpireDateNotIn)
                && Objects.equals(this.licenseSerial, clusterWhereInput.licenseSerial)
                && Objects.equals(
                        this.licenseSerialContains, clusterWhereInput.licenseSerialContains)
                && Objects.equals(
                        this.licenseSerialEndsWith, clusterWhereInput.licenseSerialEndsWith)
                && Objects.equals(this.licenseSerialGt, clusterWhereInput.licenseSerialGt)
                && Objects.equals(this.licenseSerialGte, clusterWhereInput.licenseSerialGte)
                && Objects.equals(this.licenseSerialIn, clusterWhereInput.licenseSerialIn)
                && Objects.equals(this.licenseSerialLt, clusterWhereInput.licenseSerialLt)
                && Objects.equals(this.licenseSerialLte, clusterWhereInput.licenseSerialLte)
                && Objects.equals(this.licenseSerialNot, clusterWhereInput.licenseSerialNot)
                && Objects.equals(
                        this.licenseSerialNotContains, clusterWhereInput.licenseSerialNotContains)
                && Objects.equals(
                        this.licenseSerialNotEndsWith, clusterWhereInput.licenseSerialNotEndsWith)
                && Objects.equals(this.licenseSerialNotIn, clusterWhereInput.licenseSerialNotIn)
                && Objects.equals(
                        this.licenseSerialNotStartsWith,
                        clusterWhereInput.licenseSerialNotStartsWith)
                && Objects.equals(
                        this.licenseSerialStartsWith, clusterWhereInput.licenseSerialStartsWith)
                && Objects.equals(this.licenseSignDate, clusterWhereInput.licenseSignDate)
                && Objects.equals(this.licenseSignDateGt, clusterWhereInput.licenseSignDateGt)
                && Objects.equals(this.licenseSignDateGte, clusterWhereInput.licenseSignDateGte)
                && Objects.equals(this.licenseSignDateIn, clusterWhereInput.licenseSignDateIn)
                && Objects.equals(this.licenseSignDateLt, clusterWhereInput.licenseSignDateLt)
                && Objects.equals(this.licenseSignDateLte, clusterWhereInput.licenseSignDateLte)
                && Objects.equals(this.licenseSignDateNot, clusterWhereInput.licenseSignDateNot)
                && Objects.equals(this.licenseSignDateNotIn, clusterWhereInput.licenseSignDateNotIn)
                && Objects.equals(this.licenseType, clusterWhereInput.licenseType)
                && Objects.equals(this.licenseTypeIn, clusterWhereInput.licenseTypeIn)
                && Objects.equals(this.licenseTypeNot, clusterWhereInput.licenseTypeNot)
                && Objects.equals(this.licenseTypeNotIn, clusterWhereInput.licenseTypeNotIn)
                && Objects.equals(this.localId, clusterWhereInput.localId)
                && Objects.equals(this.localIdContains, clusterWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, clusterWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, clusterWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, clusterWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, clusterWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, clusterWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, clusterWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, clusterWhereInput.localIdNot)
                && Objects.equals(this.localIdNotContains, clusterWhereInput.localIdNotContains)
                && Objects.equals(this.localIdNotEndsWith, clusterWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, clusterWhereInput.localIdNotIn)
                && Objects.equals(this.localIdNotStartsWith, clusterWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, clusterWhereInput.localIdStartsWith)
                && Objects.equals(this.maintenanceEndDate, clusterWhereInput.maintenanceEndDate)
                && Objects.equals(this.maintenanceEndDateGt, clusterWhereInput.maintenanceEndDateGt)
                && Objects.equals(
                        this.maintenanceEndDateGte, clusterWhereInput.maintenanceEndDateGte)
                && Objects.equals(this.maintenanceEndDateIn, clusterWhereInput.maintenanceEndDateIn)
                && Objects.equals(this.maintenanceEndDateLt, clusterWhereInput.maintenanceEndDateLt)
                && Objects.equals(
                        this.maintenanceEndDateLte, clusterWhereInput.maintenanceEndDateLte)
                && Objects.equals(
                        this.maintenanceEndDateNot, clusterWhereInput.maintenanceEndDateNot)
                && Objects.equals(
                        this.maintenanceEndDateNotIn, clusterWhereInput.maintenanceEndDateNotIn)
                && Objects.equals(this.maintenanceStartDate, clusterWhereInput.maintenanceStartDate)
                && Objects.equals(
                        this.maintenanceStartDateGt, clusterWhereInput.maintenanceStartDateGt)
                && Objects.equals(
                        this.maintenanceStartDateGte, clusterWhereInput.maintenanceStartDateGte)
                && Objects.equals(
                        this.maintenanceStartDateIn, clusterWhereInput.maintenanceStartDateIn)
                && Objects.equals(
                        this.maintenanceStartDateLt, clusterWhereInput.maintenanceStartDateLt)
                && Objects.equals(
                        this.maintenanceStartDateLte, clusterWhereInput.maintenanceStartDateLte)
                && Objects.equals(
                        this.maintenanceStartDateNot, clusterWhereInput.maintenanceStartDateNot)
                && Objects.equals(
                        this.maintenanceStartDateNotIn, clusterWhereInput.maintenanceStartDateNotIn)
                && Objects.equals(this.managementVip, clusterWhereInput.managementVip)
                && Objects.equals(
                        this.managementVipContains, clusterWhereInput.managementVipContains)
                && Objects.equals(
                        this.managementVipEndsWith, clusterWhereInput.managementVipEndsWith)
                && Objects.equals(this.managementVipGt, clusterWhereInput.managementVipGt)
                && Objects.equals(this.managementVipGte, clusterWhereInput.managementVipGte)
                && Objects.equals(this.managementVipIn, clusterWhereInput.managementVipIn)
                && Objects.equals(this.managementVipLt, clusterWhereInput.managementVipLt)
                && Objects.equals(this.managementVipLte, clusterWhereInput.managementVipLte)
                && Objects.equals(this.managementVipNot, clusterWhereInput.managementVipNot)
                && Objects.equals(
                        this.managementVipNotContains, clusterWhereInput.managementVipNotContains)
                && Objects.equals(
                        this.managementVipNotEndsWith, clusterWhereInput.managementVipNotEndsWith)
                && Objects.equals(this.managementVipNotIn, clusterWhereInput.managementVipNotIn)
                && Objects.equals(
                        this.managementVipNotStartsWith,
                        clusterWhereInput.managementVipNotStartsWith)
                && Objects.equals(
                        this.managementVipStartsWith, clusterWhereInput.managementVipStartsWith)
                && Objects.equals(this.maxChunkNum, clusterWhereInput.maxChunkNum)
                && Objects.equals(this.maxChunkNumGt, clusterWhereInput.maxChunkNumGt)
                && Objects.equals(this.maxChunkNumGte, clusterWhereInput.maxChunkNumGte)
                && Objects.equals(this.maxChunkNumIn, clusterWhereInput.maxChunkNumIn)
                && Objects.equals(this.maxChunkNumLt, clusterWhereInput.maxChunkNumLt)
                && Objects.equals(this.maxChunkNumLte, clusterWhereInput.maxChunkNumLte)
                && Objects.equals(this.maxChunkNumNot, clusterWhereInput.maxChunkNumNot)
                && Objects.equals(this.maxChunkNumNotIn, clusterWhereInput.maxChunkNumNotIn)
                && Objects.equals(
                        this.maxPhysicalDataCapacity, clusterWhereInput.maxPhysicalDataCapacity)
                && Objects.equals(
                        this.maxPhysicalDataCapacityGt, clusterWhereInput.maxPhysicalDataCapacityGt)
                && Objects.equals(
                        this.maxPhysicalDataCapacityGte,
                        clusterWhereInput.maxPhysicalDataCapacityGte)
                && Objects.equals(
                        this.maxPhysicalDataCapacityIn, clusterWhereInput.maxPhysicalDataCapacityIn)
                && Objects.equals(
                        this.maxPhysicalDataCapacityLt, clusterWhereInput.maxPhysicalDataCapacityLt)
                && Objects.equals(
                        this.maxPhysicalDataCapacityLte,
                        clusterWhereInput.maxPhysicalDataCapacityLte)
                && Objects.equals(
                        this.maxPhysicalDataCapacityNot,
                        clusterWhereInput.maxPhysicalDataCapacityNot)
                && Objects.equals(
                        this.maxPhysicalDataCapacityNotIn,
                        clusterWhereInput.maxPhysicalDataCapacityNotIn)
                && Objects.equals(
                        this.maxPhysicalDataCapacityPerNode,
                        clusterWhereInput.maxPhysicalDataCapacityPerNode)
                && Objects.equals(
                        this.maxPhysicalDataCapacityPerNodeGt,
                        clusterWhereInput.maxPhysicalDataCapacityPerNodeGt)
                && Objects.equals(
                        this.maxPhysicalDataCapacityPerNodeGte,
                        clusterWhereInput.maxPhysicalDataCapacityPerNodeGte)
                && Objects.equals(
                        this.maxPhysicalDataCapacityPerNodeIn,
                        clusterWhereInput.maxPhysicalDataCapacityPerNodeIn)
                && Objects.equals(
                        this.maxPhysicalDataCapacityPerNodeLt,
                        clusterWhereInput.maxPhysicalDataCapacityPerNodeLt)
                && Objects.equals(
                        this.maxPhysicalDataCapacityPerNodeLte,
                        clusterWhereInput.maxPhysicalDataCapacityPerNodeLte)
                && Objects.equals(
                        this.maxPhysicalDataCapacityPerNodeNot,
                        clusterWhereInput.maxPhysicalDataCapacityPerNodeNot)
                && Objects.equals(
                        this.maxPhysicalDataCapacityPerNodeNotIn,
                        clusterWhereInput.maxPhysicalDataCapacityPerNodeNotIn)
                && Objects.equals(this.mgtGateway, clusterWhereInput.mgtGateway)
                && Objects.equals(this.mgtGatewayContains, clusterWhereInput.mgtGatewayContains)
                && Objects.equals(this.mgtGatewayEndsWith, clusterWhereInput.mgtGatewayEndsWith)
                && Objects.equals(this.mgtGatewayGt, clusterWhereInput.mgtGatewayGt)
                && Objects.equals(this.mgtGatewayGte, clusterWhereInput.mgtGatewayGte)
                && Objects.equals(this.mgtGatewayIn, clusterWhereInput.mgtGatewayIn)
                && Objects.equals(this.mgtGatewayLt, clusterWhereInput.mgtGatewayLt)
                && Objects.equals(this.mgtGatewayLte, clusterWhereInput.mgtGatewayLte)
                && Objects.equals(this.mgtGatewayNot, clusterWhereInput.mgtGatewayNot)
                && Objects.equals(
                        this.mgtGatewayNotContains, clusterWhereInput.mgtGatewayNotContains)
                && Objects.equals(
                        this.mgtGatewayNotEndsWith, clusterWhereInput.mgtGatewayNotEndsWith)
                && Objects.equals(this.mgtGatewayNotIn, clusterWhereInput.mgtGatewayNotIn)
                && Objects.equals(
                        this.mgtGatewayNotStartsWith, clusterWhereInput.mgtGatewayNotStartsWith)
                && Objects.equals(this.mgtGatewayStartsWith, clusterWhereInput.mgtGatewayStartsWith)
                && Objects.equals(this.mgtNetmask, clusterWhereInput.mgtNetmask)
                && Objects.equals(this.mgtNetmaskContains, clusterWhereInput.mgtNetmaskContains)
                && Objects.equals(this.mgtNetmaskEndsWith, clusterWhereInput.mgtNetmaskEndsWith)
                && Objects.equals(this.mgtNetmaskGt, clusterWhereInput.mgtNetmaskGt)
                && Objects.equals(this.mgtNetmaskGte, clusterWhereInput.mgtNetmaskGte)
                && Objects.equals(this.mgtNetmaskIn, clusterWhereInput.mgtNetmaskIn)
                && Objects.equals(this.mgtNetmaskLt, clusterWhereInput.mgtNetmaskLt)
                && Objects.equals(this.mgtNetmaskLte, clusterWhereInput.mgtNetmaskLte)
                && Objects.equals(this.mgtNetmaskNot, clusterWhereInput.mgtNetmaskNot)
                && Objects.equals(
                        this.mgtNetmaskNotContains, clusterWhereInput.mgtNetmaskNotContains)
                && Objects.equals(
                        this.mgtNetmaskNotEndsWith, clusterWhereInput.mgtNetmaskNotEndsWith)
                && Objects.equals(this.mgtNetmaskNotIn, clusterWhereInput.mgtNetmaskNotIn)
                && Objects.equals(
                        this.mgtNetmaskNotStartsWith, clusterWhereInput.mgtNetmaskNotStartsWith)
                && Objects.equals(this.mgtNetmaskStartsWith, clusterWhereInput.mgtNetmaskStartsWith)
                && Objects.equals(this.migrationDataSize, clusterWhereInput.migrationDataSize)
                && Objects.equals(this.migrationDataSizeGt, clusterWhereInput.migrationDataSizeGt)
                && Objects.equals(this.migrationDataSizeGte, clusterWhereInput.migrationDataSizeGte)
                && Objects.equals(this.migrationDataSizeIn, clusterWhereInput.migrationDataSizeIn)
                && Objects.equals(this.migrationDataSizeLt, clusterWhereInput.migrationDataSizeLt)
                && Objects.equals(this.migrationDataSizeLte, clusterWhereInput.migrationDataSizeLte)
                && Objects.equals(this.migrationDataSizeNot, clusterWhereInput.migrationDataSizeNot)
                && Objects.equals(
                        this.migrationDataSizeNotIn, clusterWhereInput.migrationDataSizeNotIn)
                && Objects.equals(this.migrationSpeed, clusterWhereInput.migrationSpeed)
                && Objects.equals(this.migrationSpeedGt, clusterWhereInput.migrationSpeedGt)
                && Objects.equals(this.migrationSpeedGte, clusterWhereInput.migrationSpeedGte)
                && Objects.equals(this.migrationSpeedIn, clusterWhereInput.migrationSpeedIn)
                && Objects.equals(this.migrationSpeedLt, clusterWhereInput.migrationSpeedLt)
                && Objects.equals(this.migrationSpeedLte, clusterWhereInput.migrationSpeedLte)
                && Objects.equals(this.migrationSpeedNot, clusterWhereInput.migrationSpeedNot)
                && Objects.equals(this.migrationSpeedNotIn, clusterWhereInput.migrationSpeedNotIn)
                && Objects.equals(this.name, clusterWhereInput.name)
                && Objects.equals(this.nameContains, clusterWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, clusterWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, clusterWhereInput.nameGt)
                && Objects.equals(this.nameGte, clusterWhereInput.nameGte)
                && Objects.equals(this.nameIn, clusterWhereInput.nameIn)
                && Objects.equals(this.nameLt, clusterWhereInput.nameLt)
                && Objects.equals(this.nameLte, clusterWhereInput.nameLte)
                && Objects.equals(this.nameNot, clusterWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, clusterWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, clusterWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, clusterWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, clusterWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, clusterWhereInput.nameStartsWith)
                && Objects.equals(this.ntpMode, clusterWhereInput.ntpMode)
                && Objects.equals(this.ntpModeIn, clusterWhereInput.ntpModeIn)
                && Objects.equals(this.ntpModeNot, clusterWhereInput.ntpModeNot)
                && Objects.equals(this.ntpModeNotIn, clusterWhereInput.ntpModeNotIn)
                && Objects.equals(this.nvmeOverRdmaEnabled, clusterWhereInput.nvmeOverRdmaEnabled)
                && Objects.equals(
                        this.nvmeOverRdmaEnabledNot, clusterWhereInput.nvmeOverRdmaEnabledNot)
                && Objects.equals(this.nvmeOverTcpEnabled, clusterWhereInput.nvmeOverTcpEnabled)
                && Objects.equals(
                        this.nvmeOverTcpEnabledNot, clusterWhereInput.nvmeOverTcpEnabledNot)
                && Objects.equals(this.nvmfEnabled, clusterWhereInput.nvmfEnabled)
                && Objects.equals(this.nvmfEnabledNot, clusterWhereInput.nvmfEnabledNot)
                && Objects.equals(this.pmemEnabled, clusterWhereInput.pmemEnabled)
                && Objects.equals(this.pmemEnabledNot, clusterWhereInput.pmemEnabledNot)
                && Objects.equals(this.provisionedCpuCores, clusterWhereInput.provisionedCpuCores)
                && Objects.equals(
                        this.provisionedCpuCoresForActiveVm,
                        clusterWhereInput.provisionedCpuCoresForActiveVm)
                && Objects.equals(
                        this.provisionedCpuCoresForActiveVmGt,
                        clusterWhereInput.provisionedCpuCoresForActiveVmGt)
                && Objects.equals(
                        this.provisionedCpuCoresForActiveVmGte,
                        clusterWhereInput.provisionedCpuCoresForActiveVmGte)
                && Objects.equals(
                        this.provisionedCpuCoresForActiveVmIn,
                        clusterWhereInput.provisionedCpuCoresForActiveVmIn)
                && Objects.equals(
                        this.provisionedCpuCoresForActiveVmLt,
                        clusterWhereInput.provisionedCpuCoresForActiveVmLt)
                && Objects.equals(
                        this.provisionedCpuCoresForActiveVmLte,
                        clusterWhereInput.provisionedCpuCoresForActiveVmLte)
                && Objects.equals(
                        this.provisionedCpuCoresForActiveVmNot,
                        clusterWhereInput.provisionedCpuCoresForActiveVmNot)
                && Objects.equals(
                        this.provisionedCpuCoresForActiveVmNotIn,
                        clusterWhereInput.provisionedCpuCoresForActiveVmNotIn)
                && Objects.equals(
                        this.provisionedCpuCoresGt, clusterWhereInput.provisionedCpuCoresGt)
                && Objects.equals(
                        this.provisionedCpuCoresGte, clusterWhereInput.provisionedCpuCoresGte)
                && Objects.equals(
                        this.provisionedCpuCoresIn, clusterWhereInput.provisionedCpuCoresIn)
                && Objects.equals(
                        this.provisionedCpuCoresLt, clusterWhereInput.provisionedCpuCoresLt)
                && Objects.equals(
                        this.provisionedCpuCoresLte, clusterWhereInput.provisionedCpuCoresLte)
                && Objects.equals(
                        this.provisionedCpuCoresNot, clusterWhereInput.provisionedCpuCoresNot)
                && Objects.equals(
                        this.provisionedCpuCoresNotIn, clusterWhereInput.provisionedCpuCoresNotIn)
                && Objects.equals(
                        this.provisionedForActiveVmRatio,
                        clusterWhereInput.provisionedForActiveVmRatio)
                && Objects.equals(
                        this.provisionedForActiveVmRatioGt,
                        clusterWhereInput.provisionedForActiveVmRatioGt)
                && Objects.equals(
                        this.provisionedForActiveVmRatioGte,
                        clusterWhereInput.provisionedForActiveVmRatioGte)
                && Objects.equals(
                        this.provisionedForActiveVmRatioIn,
                        clusterWhereInput.provisionedForActiveVmRatioIn)
                && Objects.equals(
                        this.provisionedForActiveVmRatioLt,
                        clusterWhereInput.provisionedForActiveVmRatioLt)
                && Objects.equals(
                        this.provisionedForActiveVmRatioLte,
                        clusterWhereInput.provisionedForActiveVmRatioLte)
                && Objects.equals(
                        this.provisionedForActiveVmRatioNot,
                        clusterWhereInput.provisionedForActiveVmRatioNot)
                && Objects.equals(
                        this.provisionedForActiveVmRatioNotIn,
                        clusterWhereInput.provisionedForActiveVmRatioNotIn)
                && Objects.equals(
                        this.provisionedMemoryBytes, clusterWhereInput.provisionedMemoryBytes)
                && Objects.equals(
                        this.provisionedMemoryBytesGt, clusterWhereInput.provisionedMemoryBytesGt)
                && Objects.equals(
                        this.provisionedMemoryBytesGte, clusterWhereInput.provisionedMemoryBytesGte)
                && Objects.equals(
                        this.provisionedMemoryBytesIn, clusterWhereInput.provisionedMemoryBytesIn)
                && Objects.equals(
                        this.provisionedMemoryBytesLt, clusterWhereInput.provisionedMemoryBytesLt)
                && Objects.equals(
                        this.provisionedMemoryBytesLte, clusterWhereInput.provisionedMemoryBytesLte)
                && Objects.equals(
                        this.provisionedMemoryBytesNot, clusterWhereInput.provisionedMemoryBytesNot)
                && Objects.equals(
                        this.provisionedMemoryBytesNotIn,
                        clusterWhereInput.provisionedMemoryBytesNotIn)
                && Objects.equals(this.provisionedRatio, clusterWhereInput.provisionedRatio)
                && Objects.equals(this.provisionedRatioGt, clusterWhereInput.provisionedRatioGt)
                && Objects.equals(this.provisionedRatioGte, clusterWhereInput.provisionedRatioGte)
                && Objects.equals(this.provisionedRatioIn, clusterWhereInput.provisionedRatioIn)
                && Objects.equals(this.provisionedRatioLt, clusterWhereInput.provisionedRatioLt)
                && Objects.equals(this.provisionedRatioLte, clusterWhereInput.provisionedRatioLte)
                && Objects.equals(this.provisionedRatioNot, clusterWhereInput.provisionedRatioNot)
                && Objects.equals(
                        this.provisionedRatioNotIn, clusterWhereInput.provisionedRatioNotIn)
                && Objects.equals(this.rdmaEnabled, clusterWhereInput.rdmaEnabled)
                && Objects.equals(this.rdmaEnabledNot, clusterWhereInput.rdmaEnabledNot)
                && Objects.equals(this.recoverDataSize, clusterWhereInput.recoverDataSize)
                && Objects.equals(this.recoverDataSizeGt, clusterWhereInput.recoverDataSizeGt)
                && Objects.equals(this.recoverDataSizeGte, clusterWhereInput.recoverDataSizeGte)
                && Objects.equals(this.recoverDataSizeIn, clusterWhereInput.recoverDataSizeIn)
                && Objects.equals(this.recoverDataSizeLt, clusterWhereInput.recoverDataSizeLt)
                && Objects.equals(this.recoverDataSizeLte, clusterWhereInput.recoverDataSizeLte)
                && Objects.equals(this.recoverDataSizeNot, clusterWhereInput.recoverDataSizeNot)
                && Objects.equals(this.recoverDataSizeNotIn, clusterWhereInput.recoverDataSizeNotIn)
                && Objects.equals(this.recoverSpeed, clusterWhereInput.recoverSpeed)
                && Objects.equals(this.recoverSpeedGt, clusterWhereInput.recoverSpeedGt)
                && Objects.equals(this.recoverSpeedGte, clusterWhereInput.recoverSpeedGte)
                && Objects.equals(this.recoverSpeedIn, clusterWhereInput.recoverSpeedIn)
                && Objects.equals(this.recoverSpeedLt, clusterWhereInput.recoverSpeedLt)
                && Objects.equals(this.recoverSpeedLte, clusterWhereInput.recoverSpeedLte)
                && Objects.equals(this.recoverSpeedNot, clusterWhereInput.recoverSpeedNot)
                && Objects.equals(this.recoverSpeedNotIn, clusterWhereInput.recoverSpeedNotIn)
                && Objects.equals(
                        this.reservedCpuCoresForSystemService,
                        clusterWhereInput.reservedCpuCoresForSystemService)
                && Objects.equals(
                        this.reservedCpuCoresForSystemServiceGt,
                        clusterWhereInput.reservedCpuCoresForSystemServiceGt)
                && Objects.equals(
                        this.reservedCpuCoresForSystemServiceGte,
                        clusterWhereInput.reservedCpuCoresForSystemServiceGte)
                && Objects.equals(
                        this.reservedCpuCoresForSystemServiceIn,
                        clusterWhereInput.reservedCpuCoresForSystemServiceIn)
                && Objects.equals(
                        this.reservedCpuCoresForSystemServiceLt,
                        clusterWhereInput.reservedCpuCoresForSystemServiceLt)
                && Objects.equals(
                        this.reservedCpuCoresForSystemServiceLte,
                        clusterWhereInput.reservedCpuCoresForSystemServiceLte)
                && Objects.equals(
                        this.reservedCpuCoresForSystemServiceNot,
                        clusterWhereInput.reservedCpuCoresForSystemServiceNot)
                && Objects.equals(
                        this.reservedCpuCoresForSystemServiceNotIn,
                        clusterWhereInput.reservedCpuCoresForSystemServiceNotIn)
                && Objects.equals(this.runningVmNum, clusterWhereInput.runningVmNum)
                && Objects.equals(this.runningVmNumGt, clusterWhereInput.runningVmNumGt)
                && Objects.equals(this.runningVmNumGte, clusterWhereInput.runningVmNumGte)
                && Objects.equals(this.runningVmNumIn, clusterWhereInput.runningVmNumIn)
                && Objects.equals(this.runningVmNumLt, clusterWhereInput.runningVmNumLt)
                && Objects.equals(this.runningVmNumLte, clusterWhereInput.runningVmNumLte)
                && Objects.equals(this.runningVmNumNot, clusterWhereInput.runningVmNumNot)
                && Objects.equals(this.runningVmNumNotIn, clusterWhereInput.runningVmNumNotIn)
                && Objects.equals(this.settings, clusterWhereInput.settings)
                && Objects.equals(this.softwareEdition, clusterWhereInput.softwareEdition)
                && Objects.equals(this.softwareEditionIn, clusterWhereInput.softwareEditionIn)
                && Objects.equals(this.softwareEditionNot, clusterWhereInput.softwareEditionNot)
                && Objects.equals(this.softwareEditionNotIn, clusterWhereInput.softwareEditionNotIn)
                && Objects.equals(this.stoppedVmNum, clusterWhereInput.stoppedVmNum)
                && Objects.equals(this.stoppedVmNumGt, clusterWhereInput.stoppedVmNumGt)
                && Objects.equals(this.stoppedVmNumGte, clusterWhereInput.stoppedVmNumGte)
                && Objects.equals(this.stoppedVmNumIn, clusterWhereInput.stoppedVmNumIn)
                && Objects.equals(this.stoppedVmNumLt, clusterWhereInput.stoppedVmNumLt)
                && Objects.equals(this.stoppedVmNumLte, clusterWhereInput.stoppedVmNumLte)
                && Objects.equals(this.stoppedVmNumNot, clusterWhereInput.stoppedVmNumNot)
                && Objects.equals(this.stoppedVmNumNotIn, clusterWhereInput.stoppedVmNumNotIn)
                && Objects.equals(this.stretch, clusterWhereInput.stretch)
                && Objects.equals(this.stretchNot, clusterWhereInput.stretchNot)
                && Objects.equals(this.suspendedVmNum, clusterWhereInput.suspendedVmNum)
                && Objects.equals(this.suspendedVmNumGt, clusterWhereInput.suspendedVmNumGt)
                && Objects.equals(this.suspendedVmNumGte, clusterWhereInput.suspendedVmNumGte)
                && Objects.equals(this.suspendedVmNumIn, clusterWhereInput.suspendedVmNumIn)
                && Objects.equals(this.suspendedVmNumLt, clusterWhereInput.suspendedVmNumLt)
                && Objects.equals(this.suspendedVmNumLte, clusterWhereInput.suspendedVmNumLte)
                && Objects.equals(this.suspendedVmNumNot, clusterWhereInput.suspendedVmNumNot)
                && Objects.equals(this.suspendedVmNumNotIn, clusterWhereInput.suspendedVmNumNotIn)
                && Objects.equals(this.totalCacheCapacity, clusterWhereInput.totalCacheCapacity)
                && Objects.equals(this.totalCacheCapacityGt, clusterWhereInput.totalCacheCapacityGt)
                && Objects.equals(
                        this.totalCacheCapacityGte, clusterWhereInput.totalCacheCapacityGte)
                && Objects.equals(this.totalCacheCapacityIn, clusterWhereInput.totalCacheCapacityIn)
                && Objects.equals(this.totalCacheCapacityLt, clusterWhereInput.totalCacheCapacityLt)
                && Objects.equals(
                        this.totalCacheCapacityLte, clusterWhereInput.totalCacheCapacityLte)
                && Objects.equals(
                        this.totalCacheCapacityNot, clusterWhereInput.totalCacheCapacityNot)
                && Objects.equals(
                        this.totalCacheCapacityNotIn, clusterWhereInput.totalCacheCapacityNotIn)
                && Objects.equals(this.totalCpuCores, clusterWhereInput.totalCpuCores)
                && Objects.equals(this.totalCpuCoresGt, clusterWhereInput.totalCpuCoresGt)
                && Objects.equals(this.totalCpuCoresGte, clusterWhereInput.totalCpuCoresGte)
                && Objects.equals(this.totalCpuCoresIn, clusterWhereInput.totalCpuCoresIn)
                && Objects.equals(this.totalCpuCoresLt, clusterWhereInput.totalCpuCoresLt)
                && Objects.equals(this.totalCpuCoresLte, clusterWhereInput.totalCpuCoresLte)
                && Objects.equals(this.totalCpuCoresNot, clusterWhereInput.totalCpuCoresNot)
                && Objects.equals(this.totalCpuCoresNotIn, clusterWhereInput.totalCpuCoresNotIn)
                && Objects.equals(this.totalCpuHz, clusterWhereInput.totalCpuHz)
                && Objects.equals(this.totalCpuHzGt, clusterWhereInput.totalCpuHzGt)
                && Objects.equals(this.totalCpuHzGte, clusterWhereInput.totalCpuHzGte)
                && Objects.equals(this.totalCpuHzIn, clusterWhereInput.totalCpuHzIn)
                && Objects.equals(this.totalCpuHzLt, clusterWhereInput.totalCpuHzLt)
                && Objects.equals(this.totalCpuHzLte, clusterWhereInput.totalCpuHzLte)
                && Objects.equals(this.totalCpuHzNot, clusterWhereInput.totalCpuHzNot)
                && Objects.equals(this.totalCpuHzNotIn, clusterWhereInput.totalCpuHzNotIn)
                && Objects.equals(this.totalCpuSockets, clusterWhereInput.totalCpuSockets)
                && Objects.equals(this.totalCpuSocketsGt, clusterWhereInput.totalCpuSocketsGt)
                && Objects.equals(this.totalCpuSocketsGte, clusterWhereInput.totalCpuSocketsGte)
                && Objects.equals(this.totalCpuSocketsIn, clusterWhereInput.totalCpuSocketsIn)
                && Objects.equals(this.totalCpuSocketsLt, clusterWhereInput.totalCpuSocketsLt)
                && Objects.equals(this.totalCpuSocketsLte, clusterWhereInput.totalCpuSocketsLte)
                && Objects.equals(this.totalCpuSocketsNot, clusterWhereInput.totalCpuSocketsNot)
                && Objects.equals(this.totalCpuSocketsNotIn, clusterWhereInput.totalCpuSocketsNotIn)
                && Objects.equals(this.totalDataCapacity, clusterWhereInput.totalDataCapacity)
                && Objects.equals(this.totalDataCapacityGt, clusterWhereInput.totalDataCapacityGt)
                && Objects.equals(this.totalDataCapacityGte, clusterWhereInput.totalDataCapacityGte)
                && Objects.equals(this.totalDataCapacityIn, clusterWhereInput.totalDataCapacityIn)
                && Objects.equals(this.totalDataCapacityLt, clusterWhereInput.totalDataCapacityLt)
                && Objects.equals(this.totalDataCapacityLte, clusterWhereInput.totalDataCapacityLte)
                && Objects.equals(this.totalDataCapacityNot, clusterWhereInput.totalDataCapacityNot)
                && Objects.equals(
                        this.totalDataCapacityNotIn, clusterWhereInput.totalDataCapacityNotIn)
                && Objects.equals(this.totalMemoryBytes, clusterWhereInput.totalMemoryBytes)
                && Objects.equals(this.totalMemoryBytesGt, clusterWhereInput.totalMemoryBytesGt)
                && Objects.equals(this.totalMemoryBytesGte, clusterWhereInput.totalMemoryBytesGte)
                && Objects.equals(this.totalMemoryBytesIn, clusterWhereInput.totalMemoryBytesIn)
                && Objects.equals(this.totalMemoryBytesLt, clusterWhereInput.totalMemoryBytesLt)
                && Objects.equals(this.totalMemoryBytesLte, clusterWhereInput.totalMemoryBytesLte)
                && Objects.equals(this.totalMemoryBytesNot, clusterWhereInput.totalMemoryBytesNot)
                && Objects.equals(
                        this.totalMemoryBytesNotIn, clusterWhereInput.totalMemoryBytesNotIn)
                && Objects.equals(this.type, clusterWhereInput.type)
                && Objects.equals(this.typeIn, clusterWhereInput.typeIn)
                && Objects.equals(this.typeNot, clusterWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, clusterWhereInput.typeNotIn)
                && Objects.equals(this.upgradeToolVersion, clusterWhereInput.upgradeToolVersion)
                && Objects.equals(
                        this.upgradeToolVersionContains,
                        clusterWhereInput.upgradeToolVersionContains)
                && Objects.equals(
                        this.upgradeToolVersionEndsWith,
                        clusterWhereInput.upgradeToolVersionEndsWith)
                && Objects.equals(this.upgradeToolVersionGt, clusterWhereInput.upgradeToolVersionGt)
                && Objects.equals(
                        this.upgradeToolVersionGte, clusterWhereInput.upgradeToolVersionGte)
                && Objects.equals(this.upgradeToolVersionIn, clusterWhereInput.upgradeToolVersionIn)
                && Objects.equals(this.upgradeToolVersionLt, clusterWhereInput.upgradeToolVersionLt)
                && Objects.equals(
                        this.upgradeToolVersionLte, clusterWhereInput.upgradeToolVersionLte)
                && Objects.equals(
                        this.upgradeToolVersionNot, clusterWhereInput.upgradeToolVersionNot)
                && Objects.equals(
                        this.upgradeToolVersionNotContains,
                        clusterWhereInput.upgradeToolVersionNotContains)
                && Objects.equals(
                        this.upgradeToolVersionNotEndsWith,
                        clusterWhereInput.upgradeToolVersionNotEndsWith)
                && Objects.equals(
                        this.upgradeToolVersionNotIn, clusterWhereInput.upgradeToolVersionNotIn)
                && Objects.equals(
                        this.upgradeToolVersionNotStartsWith,
                        clusterWhereInput.upgradeToolVersionNotStartsWith)
                && Objects.equals(
                        this.upgradeToolVersionStartsWith,
                        clusterWhereInput.upgradeToolVersionStartsWith)
                && Objects.equals(this.usedCpuHz, clusterWhereInput.usedCpuHz)
                && Objects.equals(this.usedCpuHzGt, clusterWhereInput.usedCpuHzGt)
                && Objects.equals(this.usedCpuHzGte, clusterWhereInput.usedCpuHzGte)
                && Objects.equals(this.usedCpuHzIn, clusterWhereInput.usedCpuHzIn)
                && Objects.equals(this.usedCpuHzLt, clusterWhereInput.usedCpuHzLt)
                && Objects.equals(this.usedCpuHzLte, clusterWhereInput.usedCpuHzLte)
                && Objects.equals(this.usedCpuHzNot, clusterWhereInput.usedCpuHzNot)
                && Objects.equals(this.usedCpuHzNotIn, clusterWhereInput.usedCpuHzNotIn)
                && Objects.equals(this.usedDataSpace, clusterWhereInput.usedDataSpace)
                && Objects.equals(this.usedDataSpaceGt, clusterWhereInput.usedDataSpaceGt)
                && Objects.equals(this.usedDataSpaceGte, clusterWhereInput.usedDataSpaceGte)
                && Objects.equals(this.usedDataSpaceIn, clusterWhereInput.usedDataSpaceIn)
                && Objects.equals(this.usedDataSpaceLt, clusterWhereInput.usedDataSpaceLt)
                && Objects.equals(this.usedDataSpaceLte, clusterWhereInput.usedDataSpaceLte)
                && Objects.equals(this.usedDataSpaceNot, clusterWhereInput.usedDataSpaceNot)
                && Objects.equals(this.usedDataSpaceNotIn, clusterWhereInput.usedDataSpaceNotIn)
                && Objects.equals(this.usedMemoryBytes, clusterWhereInput.usedMemoryBytes)
                && Objects.equals(this.usedMemoryBytesGt, clusterWhereInput.usedMemoryBytesGt)
                && Objects.equals(this.usedMemoryBytesGte, clusterWhereInput.usedMemoryBytesGte)
                && Objects.equals(this.usedMemoryBytesIn, clusterWhereInput.usedMemoryBytesIn)
                && Objects.equals(this.usedMemoryBytesLt, clusterWhereInput.usedMemoryBytesLt)
                && Objects.equals(this.usedMemoryBytesLte, clusterWhereInput.usedMemoryBytesLte)
                && Objects.equals(this.usedMemoryBytesNot, clusterWhereInput.usedMemoryBytesNot)
                && Objects.equals(this.usedMemoryBytesNotIn, clusterWhereInput.usedMemoryBytesNotIn)
                && Objects.equals(this.validDataSpace, clusterWhereInput.validDataSpace)
                && Objects.equals(this.validDataSpaceGt, clusterWhereInput.validDataSpaceGt)
                && Objects.equals(this.validDataSpaceGte, clusterWhereInput.validDataSpaceGte)
                && Objects.equals(this.validDataSpaceIn, clusterWhereInput.validDataSpaceIn)
                && Objects.equals(this.validDataSpaceLt, clusterWhereInput.validDataSpaceLt)
                && Objects.equals(this.validDataSpaceLte, clusterWhereInput.validDataSpaceLte)
                && Objects.equals(this.validDataSpaceNot, clusterWhereInput.validDataSpaceNot)
                && Objects.equals(this.validDataSpaceNotIn, clusterWhereInput.validDataSpaceNotIn)
                && Objects.equals(this.vcenterAccount, clusterWhereInput.vcenterAccount)
                && Objects.equals(this.vdsesEvery, clusterWhereInput.vdsesEvery)
                && Objects.equals(this.vdsesNone, clusterWhereInput.vdsesNone)
                && Objects.equals(this.vdsesSome, clusterWhereInput.vdsesSome)
                && Objects.equals(this.version, clusterWhereInput.version)
                && Objects.equals(this.versionContains, clusterWhereInput.versionContains)
                && Objects.equals(this.versionEndsWith, clusterWhereInput.versionEndsWith)
                && Objects.equals(this.versionGt, clusterWhereInput.versionGt)
                && Objects.equals(this.versionGte, clusterWhereInput.versionGte)
                && Objects.equals(this.versionIn, clusterWhereInput.versionIn)
                && Objects.equals(this.versionLt, clusterWhereInput.versionLt)
                && Objects.equals(this.versionLte, clusterWhereInput.versionLte)
                && Objects.equals(this.versionNot, clusterWhereInput.versionNot)
                && Objects.equals(this.versionNotContains, clusterWhereInput.versionNotContains)
                && Objects.equals(this.versionNotEndsWith, clusterWhereInput.versionNotEndsWith)
                && Objects.equals(this.versionNotIn, clusterWhereInput.versionNotIn)
                && Objects.equals(this.versionNotStartsWith, clusterWhereInput.versionNotStartsWith)
                && Objects.equals(this.versionStartsWith, clusterWhereInput.versionStartsWith)
                && Objects.equals(this.vhostEnabled, clusterWhereInput.vhostEnabled)
                && Objects.equals(this.vhostEnabledNot, clusterWhereInput.vhostEnabledNot)
                && Objects.equals(this.vmFoldersEvery, clusterWhereInput.vmFoldersEvery)
                && Objects.equals(this.vmFoldersNone, clusterWhereInput.vmFoldersNone)
                && Objects.equals(this.vmFoldersSome, clusterWhereInput.vmFoldersSome)
                && Objects.equals(this.vmNum, clusterWhereInput.vmNum)
                && Objects.equals(this.vmNumGt, clusterWhereInput.vmNumGt)
                && Objects.equals(this.vmNumGte, clusterWhereInput.vmNumGte)
                && Objects.equals(this.vmNumIn, clusterWhereInput.vmNumIn)
                && Objects.equals(this.vmNumLt, clusterWhereInput.vmNumLt)
                && Objects.equals(this.vmNumLte, clusterWhereInput.vmNumLte)
                && Objects.equals(this.vmNumNot, clusterWhereInput.vmNumNot)
                && Objects.equals(this.vmNumNotIn, clusterWhereInput.vmNumNotIn)
                && Objects.equals(this.vmTemplatesEvery, clusterWhereInput.vmTemplatesEvery)
                && Objects.equals(this.vmTemplatesNone, clusterWhereInput.vmTemplatesNone)
                && Objects.equals(this.vmTemplatesSome, clusterWhereInput.vmTemplatesSome)
                && Objects.equals(this.vmsEvery, clusterWhereInput.vmsEvery)
                && Objects.equals(this.vmsNone, clusterWhereInput.vmsNone)
                && Objects.equals(this.vmsSome, clusterWhereInput.vmsSome)
                && Objects.equals(this.witness, clusterWhereInput.witness)
                && Objects.equals(this.zonesEvery, clusterWhereInput.zonesEvery)
                && Objects.equals(this.zonesNone, clusterWhereInput.zonesNone)
                && Objects.equals(this.zonesSome, clusterWhereInput.zonesSome);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                AND,
                NOT,
                OR,
                applicationHighestVersion,
                applicationHighestVersionContains,
                applicationHighestVersionEndsWith,
                applicationHighestVersionGt,
                applicationHighestVersionGte,
                applicationHighestVersionIn,
                applicationHighestVersionLt,
                applicationHighestVersionLte,
                applicationHighestVersionNot,
                applicationHighestVersionNotContains,
                applicationHighestVersionNotEndsWith,
                applicationHighestVersionNotIn,
                applicationHighestVersionNotStartsWith,
                applicationHighestVersionStartsWith,
                applicationsEvery,
                applicationsNone,
                applicationsSome,
                architecture,
                architectureIn,
                architectureNot,
                architectureNotIn,
                autoConverge,
                autoConvergeNot,
                connectState,
                connectStateIn,
                connectStateNot,
                connectStateNotIn,
                consistencyGroupsEvery,
                consistencyGroupsNone,
                consistencyGroupsSome,
                currentCpuModel,
                currentCpuModelContains,
                currentCpuModelEndsWith,
                currentCpuModelGt,
                currentCpuModelGte,
                currentCpuModelIn,
                currentCpuModelLt,
                currentCpuModelLte,
                currentCpuModelNot,
                currentCpuModelNotContains,
                currentCpuModelNotEndsWith,
                currentCpuModelNotIn,
                currentCpuModelNotStartsWith,
                currentCpuModelStartsWith,
                datacentersEvery,
                datacentersNone,
                datacentersSome,
                disconnectedDate,
                disconnectedDateGt,
                disconnectedDateGte,
                disconnectedDateIn,
                disconnectedDateLt,
                disconnectedDateLte,
                disconnectedDateNot,
                disconnectedDateNotIn,
                disconnectedReason,
                disconnectedReasonIn,
                disconnectedReasonNot,
                disconnectedReasonNotIn,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                everouteCluster,
                failureDataSpace,
                failureDataSpaceGt,
                failureDataSpaceGte,
                failureDataSpaceIn,
                failureDataSpaceLt,
                failureDataSpaceLte,
                failureDataSpaceNot,
                failureDataSpaceNotIn,
                hasMetrox,
                hasMetroxNot,
                hostNum,
                hostNumGt,
                hostNumGte,
                hostNumIn,
                hostNumLt,
                hostNumLte,
                hostNumNot,
                hostNumNotIn,
                hostsEvery,
                hostsNone,
                hostsSome,
                hypervisor,
                hypervisorIn,
                hypervisorNot,
                hypervisorNotIn,
                id,
                idContains,
                idEndsWith,
                idGt,
                idGte,
                idIn,
                idLt,
                idLte,
                idNot,
                idNotContains,
                idNotEndsWith,
                idNotIn,
                idNotStartsWith,
                idStartsWith,
                ip,
                ipContains,
                ipEndsWith,
                ipGt,
                ipGte,
                ipIn,
                ipLt,
                ipLte,
                ipNot,
                ipNotContains,
                ipNotEndsWith,
                ipNotIn,
                ipNotStartsWith,
                ipStartsWith,
                isAllFlash,
                isAllFlashNot,
                iscsiVip,
                iscsiVipContains,
                iscsiVipEndsWith,
                iscsiVipGt,
                iscsiVipGte,
                iscsiVipIn,
                iscsiVipLt,
                iscsiVipLte,
                iscsiVipNot,
                iscsiVipNotContains,
                iscsiVipNotEndsWith,
                iscsiVipNotIn,
                iscsiVipNotStartsWith,
                iscsiVipStartsWith,
                labelsEvery,
                labelsNone,
                labelsSome,
                licenseExpireDate,
                licenseExpireDateGt,
                licenseExpireDateGte,
                licenseExpireDateIn,
                licenseExpireDateLt,
                licenseExpireDateLte,
                licenseExpireDateNot,
                licenseExpireDateNotIn,
                licenseSerial,
                licenseSerialContains,
                licenseSerialEndsWith,
                licenseSerialGt,
                licenseSerialGte,
                licenseSerialIn,
                licenseSerialLt,
                licenseSerialLte,
                licenseSerialNot,
                licenseSerialNotContains,
                licenseSerialNotEndsWith,
                licenseSerialNotIn,
                licenseSerialNotStartsWith,
                licenseSerialStartsWith,
                licenseSignDate,
                licenseSignDateGt,
                licenseSignDateGte,
                licenseSignDateIn,
                licenseSignDateLt,
                licenseSignDateLte,
                licenseSignDateNot,
                licenseSignDateNotIn,
                licenseType,
                licenseTypeIn,
                licenseTypeNot,
                licenseTypeNotIn,
                localId,
                localIdContains,
                localIdEndsWith,
                localIdGt,
                localIdGte,
                localIdIn,
                localIdLt,
                localIdLte,
                localIdNot,
                localIdNotContains,
                localIdNotEndsWith,
                localIdNotIn,
                localIdNotStartsWith,
                localIdStartsWith,
                maintenanceEndDate,
                maintenanceEndDateGt,
                maintenanceEndDateGte,
                maintenanceEndDateIn,
                maintenanceEndDateLt,
                maintenanceEndDateLte,
                maintenanceEndDateNot,
                maintenanceEndDateNotIn,
                maintenanceStartDate,
                maintenanceStartDateGt,
                maintenanceStartDateGte,
                maintenanceStartDateIn,
                maintenanceStartDateLt,
                maintenanceStartDateLte,
                maintenanceStartDateNot,
                maintenanceStartDateNotIn,
                managementVip,
                managementVipContains,
                managementVipEndsWith,
                managementVipGt,
                managementVipGte,
                managementVipIn,
                managementVipLt,
                managementVipLte,
                managementVipNot,
                managementVipNotContains,
                managementVipNotEndsWith,
                managementVipNotIn,
                managementVipNotStartsWith,
                managementVipStartsWith,
                maxChunkNum,
                maxChunkNumGt,
                maxChunkNumGte,
                maxChunkNumIn,
                maxChunkNumLt,
                maxChunkNumLte,
                maxChunkNumNot,
                maxChunkNumNotIn,
                maxPhysicalDataCapacity,
                maxPhysicalDataCapacityGt,
                maxPhysicalDataCapacityGte,
                maxPhysicalDataCapacityIn,
                maxPhysicalDataCapacityLt,
                maxPhysicalDataCapacityLte,
                maxPhysicalDataCapacityNot,
                maxPhysicalDataCapacityNotIn,
                maxPhysicalDataCapacityPerNode,
                maxPhysicalDataCapacityPerNodeGt,
                maxPhysicalDataCapacityPerNodeGte,
                maxPhysicalDataCapacityPerNodeIn,
                maxPhysicalDataCapacityPerNodeLt,
                maxPhysicalDataCapacityPerNodeLte,
                maxPhysicalDataCapacityPerNodeNot,
                maxPhysicalDataCapacityPerNodeNotIn,
                mgtGateway,
                mgtGatewayContains,
                mgtGatewayEndsWith,
                mgtGatewayGt,
                mgtGatewayGte,
                mgtGatewayIn,
                mgtGatewayLt,
                mgtGatewayLte,
                mgtGatewayNot,
                mgtGatewayNotContains,
                mgtGatewayNotEndsWith,
                mgtGatewayNotIn,
                mgtGatewayNotStartsWith,
                mgtGatewayStartsWith,
                mgtNetmask,
                mgtNetmaskContains,
                mgtNetmaskEndsWith,
                mgtNetmaskGt,
                mgtNetmaskGte,
                mgtNetmaskIn,
                mgtNetmaskLt,
                mgtNetmaskLte,
                mgtNetmaskNot,
                mgtNetmaskNotContains,
                mgtNetmaskNotEndsWith,
                mgtNetmaskNotIn,
                mgtNetmaskNotStartsWith,
                mgtNetmaskStartsWith,
                migrationDataSize,
                migrationDataSizeGt,
                migrationDataSizeGte,
                migrationDataSizeIn,
                migrationDataSizeLt,
                migrationDataSizeLte,
                migrationDataSizeNot,
                migrationDataSizeNotIn,
                migrationSpeed,
                migrationSpeedGt,
                migrationSpeedGte,
                migrationSpeedIn,
                migrationSpeedLt,
                migrationSpeedLte,
                migrationSpeedNot,
                migrationSpeedNotIn,
                name,
                nameContains,
                nameEndsWith,
                nameGt,
                nameGte,
                nameIn,
                nameLt,
                nameLte,
                nameNot,
                nameNotContains,
                nameNotEndsWith,
                nameNotIn,
                nameNotStartsWith,
                nameStartsWith,
                ntpMode,
                ntpModeIn,
                ntpModeNot,
                ntpModeNotIn,
                nvmeOverRdmaEnabled,
                nvmeOverRdmaEnabledNot,
                nvmeOverTcpEnabled,
                nvmeOverTcpEnabledNot,
                nvmfEnabled,
                nvmfEnabledNot,
                pmemEnabled,
                pmemEnabledNot,
                provisionedCpuCores,
                provisionedCpuCoresForActiveVm,
                provisionedCpuCoresForActiveVmGt,
                provisionedCpuCoresForActiveVmGte,
                provisionedCpuCoresForActiveVmIn,
                provisionedCpuCoresForActiveVmLt,
                provisionedCpuCoresForActiveVmLte,
                provisionedCpuCoresForActiveVmNot,
                provisionedCpuCoresForActiveVmNotIn,
                provisionedCpuCoresGt,
                provisionedCpuCoresGte,
                provisionedCpuCoresIn,
                provisionedCpuCoresLt,
                provisionedCpuCoresLte,
                provisionedCpuCoresNot,
                provisionedCpuCoresNotIn,
                provisionedForActiveVmRatio,
                provisionedForActiveVmRatioGt,
                provisionedForActiveVmRatioGte,
                provisionedForActiveVmRatioIn,
                provisionedForActiveVmRatioLt,
                provisionedForActiveVmRatioLte,
                provisionedForActiveVmRatioNot,
                provisionedForActiveVmRatioNotIn,
                provisionedMemoryBytes,
                provisionedMemoryBytesGt,
                provisionedMemoryBytesGte,
                provisionedMemoryBytesIn,
                provisionedMemoryBytesLt,
                provisionedMemoryBytesLte,
                provisionedMemoryBytesNot,
                provisionedMemoryBytesNotIn,
                provisionedRatio,
                provisionedRatioGt,
                provisionedRatioGte,
                provisionedRatioIn,
                provisionedRatioLt,
                provisionedRatioLte,
                provisionedRatioNot,
                provisionedRatioNotIn,
                rdmaEnabled,
                rdmaEnabledNot,
                recoverDataSize,
                recoverDataSizeGt,
                recoverDataSizeGte,
                recoverDataSizeIn,
                recoverDataSizeLt,
                recoverDataSizeLte,
                recoverDataSizeNot,
                recoverDataSizeNotIn,
                recoverSpeed,
                recoverSpeedGt,
                recoverSpeedGte,
                recoverSpeedIn,
                recoverSpeedLt,
                recoverSpeedLte,
                recoverSpeedNot,
                recoverSpeedNotIn,
                reservedCpuCoresForSystemService,
                reservedCpuCoresForSystemServiceGt,
                reservedCpuCoresForSystemServiceGte,
                reservedCpuCoresForSystemServiceIn,
                reservedCpuCoresForSystemServiceLt,
                reservedCpuCoresForSystemServiceLte,
                reservedCpuCoresForSystemServiceNot,
                reservedCpuCoresForSystemServiceNotIn,
                runningVmNum,
                runningVmNumGt,
                runningVmNumGte,
                runningVmNumIn,
                runningVmNumLt,
                runningVmNumLte,
                runningVmNumNot,
                runningVmNumNotIn,
                settings,
                softwareEdition,
                softwareEditionIn,
                softwareEditionNot,
                softwareEditionNotIn,
                stoppedVmNum,
                stoppedVmNumGt,
                stoppedVmNumGte,
                stoppedVmNumIn,
                stoppedVmNumLt,
                stoppedVmNumLte,
                stoppedVmNumNot,
                stoppedVmNumNotIn,
                stretch,
                stretchNot,
                suspendedVmNum,
                suspendedVmNumGt,
                suspendedVmNumGte,
                suspendedVmNumIn,
                suspendedVmNumLt,
                suspendedVmNumLte,
                suspendedVmNumNot,
                suspendedVmNumNotIn,
                totalCacheCapacity,
                totalCacheCapacityGt,
                totalCacheCapacityGte,
                totalCacheCapacityIn,
                totalCacheCapacityLt,
                totalCacheCapacityLte,
                totalCacheCapacityNot,
                totalCacheCapacityNotIn,
                totalCpuCores,
                totalCpuCoresGt,
                totalCpuCoresGte,
                totalCpuCoresIn,
                totalCpuCoresLt,
                totalCpuCoresLte,
                totalCpuCoresNot,
                totalCpuCoresNotIn,
                totalCpuHz,
                totalCpuHzGt,
                totalCpuHzGte,
                totalCpuHzIn,
                totalCpuHzLt,
                totalCpuHzLte,
                totalCpuHzNot,
                totalCpuHzNotIn,
                totalCpuSockets,
                totalCpuSocketsGt,
                totalCpuSocketsGte,
                totalCpuSocketsIn,
                totalCpuSocketsLt,
                totalCpuSocketsLte,
                totalCpuSocketsNot,
                totalCpuSocketsNotIn,
                totalDataCapacity,
                totalDataCapacityGt,
                totalDataCapacityGte,
                totalDataCapacityIn,
                totalDataCapacityLt,
                totalDataCapacityLte,
                totalDataCapacityNot,
                totalDataCapacityNotIn,
                totalMemoryBytes,
                totalMemoryBytesGt,
                totalMemoryBytesGte,
                totalMemoryBytesIn,
                totalMemoryBytesLt,
                totalMemoryBytesLte,
                totalMemoryBytesNot,
                totalMemoryBytesNotIn,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                upgradeToolVersion,
                upgradeToolVersionContains,
                upgradeToolVersionEndsWith,
                upgradeToolVersionGt,
                upgradeToolVersionGte,
                upgradeToolVersionIn,
                upgradeToolVersionLt,
                upgradeToolVersionLte,
                upgradeToolVersionNot,
                upgradeToolVersionNotContains,
                upgradeToolVersionNotEndsWith,
                upgradeToolVersionNotIn,
                upgradeToolVersionNotStartsWith,
                upgradeToolVersionStartsWith,
                usedCpuHz,
                usedCpuHzGt,
                usedCpuHzGte,
                usedCpuHzIn,
                usedCpuHzLt,
                usedCpuHzLte,
                usedCpuHzNot,
                usedCpuHzNotIn,
                usedDataSpace,
                usedDataSpaceGt,
                usedDataSpaceGte,
                usedDataSpaceIn,
                usedDataSpaceLt,
                usedDataSpaceLte,
                usedDataSpaceNot,
                usedDataSpaceNotIn,
                usedMemoryBytes,
                usedMemoryBytesGt,
                usedMemoryBytesGte,
                usedMemoryBytesIn,
                usedMemoryBytesLt,
                usedMemoryBytesLte,
                usedMemoryBytesNot,
                usedMemoryBytesNotIn,
                validDataSpace,
                validDataSpaceGt,
                validDataSpaceGte,
                validDataSpaceIn,
                validDataSpaceLt,
                validDataSpaceLte,
                validDataSpaceNot,
                validDataSpaceNotIn,
                vcenterAccount,
                vdsesEvery,
                vdsesNone,
                vdsesSome,
                version,
                versionContains,
                versionEndsWith,
                versionGt,
                versionGte,
                versionIn,
                versionLt,
                versionLte,
                versionNot,
                versionNotContains,
                versionNotEndsWith,
                versionNotIn,
                versionNotStartsWith,
                versionStartsWith,
                vhostEnabled,
                vhostEnabledNot,
                vmFoldersEvery,
                vmFoldersNone,
                vmFoldersSome,
                vmNum,
                vmNumGt,
                vmNumGte,
                vmNumIn,
                vmNumLt,
                vmNumLte,
                vmNumNot,
                vmNumNotIn,
                vmTemplatesEvery,
                vmTemplatesNone,
                vmTemplatesSome,
                vmsEvery,
                vmsNone,
                vmsSome,
                witness,
                zonesEvery,
                zonesNone,
                zonesSome);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    applicationHighestVersion: ")
                .append(toIndentedString(applicationHighestVersion))
                .append("\n");
        sb.append("    applicationHighestVersionContains: ")
                .append(toIndentedString(applicationHighestVersionContains))
                .append("\n");
        sb.append("    applicationHighestVersionEndsWith: ")
                .append(toIndentedString(applicationHighestVersionEndsWith))
                .append("\n");
        sb.append("    applicationHighestVersionGt: ")
                .append(toIndentedString(applicationHighestVersionGt))
                .append("\n");
        sb.append("    applicationHighestVersionGte: ")
                .append(toIndentedString(applicationHighestVersionGte))
                .append("\n");
        sb.append("    applicationHighestVersionIn: ")
                .append(toIndentedString(applicationHighestVersionIn))
                .append("\n");
        sb.append("    applicationHighestVersionLt: ")
                .append(toIndentedString(applicationHighestVersionLt))
                .append("\n");
        sb.append("    applicationHighestVersionLte: ")
                .append(toIndentedString(applicationHighestVersionLte))
                .append("\n");
        sb.append("    applicationHighestVersionNot: ")
                .append(toIndentedString(applicationHighestVersionNot))
                .append("\n");
        sb.append("    applicationHighestVersionNotContains: ")
                .append(toIndentedString(applicationHighestVersionNotContains))
                .append("\n");
        sb.append("    applicationHighestVersionNotEndsWith: ")
                .append(toIndentedString(applicationHighestVersionNotEndsWith))
                .append("\n");
        sb.append("    applicationHighestVersionNotIn: ")
                .append(toIndentedString(applicationHighestVersionNotIn))
                .append("\n");
        sb.append("    applicationHighestVersionNotStartsWith: ")
                .append(toIndentedString(applicationHighestVersionNotStartsWith))
                .append("\n");
        sb.append("    applicationHighestVersionStartsWith: ")
                .append(toIndentedString(applicationHighestVersionStartsWith))
                .append("\n");
        sb.append("    applicationsEvery: ")
                .append(toIndentedString(applicationsEvery))
                .append("\n");
        sb.append("    applicationsNone: ").append(toIndentedString(applicationsNone)).append("\n");
        sb.append("    applicationsSome: ").append(toIndentedString(applicationsSome)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    architectureIn: ").append(toIndentedString(architectureIn)).append("\n");
        sb.append("    architectureNot: ").append(toIndentedString(architectureNot)).append("\n");
        sb.append("    architectureNotIn: ")
                .append(toIndentedString(architectureNotIn))
                .append("\n");
        sb.append("    autoConverge: ").append(toIndentedString(autoConverge)).append("\n");
        sb.append("    autoConvergeNot: ").append(toIndentedString(autoConvergeNot)).append("\n");
        sb.append("    connectState: ").append(toIndentedString(connectState)).append("\n");
        sb.append("    connectStateIn: ").append(toIndentedString(connectStateIn)).append("\n");
        sb.append("    connectStateNot: ").append(toIndentedString(connectStateNot)).append("\n");
        sb.append("    connectStateNotIn: ")
                .append(toIndentedString(connectStateNotIn))
                .append("\n");
        sb.append("    consistencyGroupsEvery: ")
                .append(toIndentedString(consistencyGroupsEvery))
                .append("\n");
        sb.append("    consistencyGroupsNone: ")
                .append(toIndentedString(consistencyGroupsNone))
                .append("\n");
        sb.append("    consistencyGroupsSome: ")
                .append(toIndentedString(consistencyGroupsSome))
                .append("\n");
        sb.append("    currentCpuModel: ").append(toIndentedString(currentCpuModel)).append("\n");
        sb.append("    currentCpuModelContains: ")
                .append(toIndentedString(currentCpuModelContains))
                .append("\n");
        sb.append("    currentCpuModelEndsWith: ")
                .append(toIndentedString(currentCpuModelEndsWith))
                .append("\n");
        sb.append("    currentCpuModelGt: ")
                .append(toIndentedString(currentCpuModelGt))
                .append("\n");
        sb.append("    currentCpuModelGte: ")
                .append(toIndentedString(currentCpuModelGte))
                .append("\n");
        sb.append("    currentCpuModelIn: ")
                .append(toIndentedString(currentCpuModelIn))
                .append("\n");
        sb.append("    currentCpuModelLt: ")
                .append(toIndentedString(currentCpuModelLt))
                .append("\n");
        sb.append("    currentCpuModelLte: ")
                .append(toIndentedString(currentCpuModelLte))
                .append("\n");
        sb.append("    currentCpuModelNot: ")
                .append(toIndentedString(currentCpuModelNot))
                .append("\n");
        sb.append("    currentCpuModelNotContains: ")
                .append(toIndentedString(currentCpuModelNotContains))
                .append("\n");
        sb.append("    currentCpuModelNotEndsWith: ")
                .append(toIndentedString(currentCpuModelNotEndsWith))
                .append("\n");
        sb.append("    currentCpuModelNotIn: ")
                .append(toIndentedString(currentCpuModelNotIn))
                .append("\n");
        sb.append("    currentCpuModelNotStartsWith: ")
                .append(toIndentedString(currentCpuModelNotStartsWith))
                .append("\n");
        sb.append("    currentCpuModelStartsWith: ")
                .append(toIndentedString(currentCpuModelStartsWith))
                .append("\n");
        sb.append("    datacentersEvery: ").append(toIndentedString(datacentersEvery)).append("\n");
        sb.append("    datacentersNone: ").append(toIndentedString(datacentersNone)).append("\n");
        sb.append("    datacentersSome: ").append(toIndentedString(datacentersSome)).append("\n");
        sb.append("    disconnectedDate: ").append(toIndentedString(disconnectedDate)).append("\n");
        sb.append("    disconnectedDateGt: ")
                .append(toIndentedString(disconnectedDateGt))
                .append("\n");
        sb.append("    disconnectedDateGte: ")
                .append(toIndentedString(disconnectedDateGte))
                .append("\n");
        sb.append("    disconnectedDateIn: ")
                .append(toIndentedString(disconnectedDateIn))
                .append("\n");
        sb.append("    disconnectedDateLt: ")
                .append(toIndentedString(disconnectedDateLt))
                .append("\n");
        sb.append("    disconnectedDateLte: ")
                .append(toIndentedString(disconnectedDateLte))
                .append("\n");
        sb.append("    disconnectedDateNot: ")
                .append(toIndentedString(disconnectedDateNot))
                .append("\n");
        sb.append("    disconnectedDateNotIn: ")
                .append(toIndentedString(disconnectedDateNotIn))
                .append("\n");
        sb.append("    disconnectedReason: ")
                .append(toIndentedString(disconnectedReason))
                .append("\n");
        sb.append("    disconnectedReasonIn: ")
                .append(toIndentedString(disconnectedReasonIn))
                .append("\n");
        sb.append("    disconnectedReasonNot: ")
                .append(toIndentedString(disconnectedReasonNot))
                .append("\n");
        sb.append("    disconnectedReasonNotIn: ")
                .append(toIndentedString(disconnectedReasonNotIn))
                .append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    entityAsyncStatusIn: ")
                .append(toIndentedString(entityAsyncStatusIn))
                .append("\n");
        sb.append("    entityAsyncStatusNot: ")
                .append(toIndentedString(entityAsyncStatusNot))
                .append("\n");
        sb.append("    entityAsyncStatusNotIn: ")
                .append(toIndentedString(entityAsyncStatusNotIn))
                .append("\n");
        sb.append("    everouteCluster: ").append(toIndentedString(everouteCluster)).append("\n");
        sb.append("    failureDataSpace: ").append(toIndentedString(failureDataSpace)).append("\n");
        sb.append("    failureDataSpaceGt: ")
                .append(toIndentedString(failureDataSpaceGt))
                .append("\n");
        sb.append("    failureDataSpaceGte: ")
                .append(toIndentedString(failureDataSpaceGte))
                .append("\n");
        sb.append("    failureDataSpaceIn: ")
                .append(toIndentedString(failureDataSpaceIn))
                .append("\n");
        sb.append("    failureDataSpaceLt: ")
                .append(toIndentedString(failureDataSpaceLt))
                .append("\n");
        sb.append("    failureDataSpaceLte: ")
                .append(toIndentedString(failureDataSpaceLte))
                .append("\n");
        sb.append("    failureDataSpaceNot: ")
                .append(toIndentedString(failureDataSpaceNot))
                .append("\n");
        sb.append("    failureDataSpaceNotIn: ")
                .append(toIndentedString(failureDataSpaceNotIn))
                .append("\n");
        sb.append("    hasMetrox: ").append(toIndentedString(hasMetrox)).append("\n");
        sb.append("    hasMetroxNot: ").append(toIndentedString(hasMetroxNot)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    hostNumGt: ").append(toIndentedString(hostNumGt)).append("\n");
        sb.append("    hostNumGte: ").append(toIndentedString(hostNumGte)).append("\n");
        sb.append("    hostNumIn: ").append(toIndentedString(hostNumIn)).append("\n");
        sb.append("    hostNumLt: ").append(toIndentedString(hostNumLt)).append("\n");
        sb.append("    hostNumLte: ").append(toIndentedString(hostNumLte)).append("\n");
        sb.append("    hostNumNot: ").append(toIndentedString(hostNumNot)).append("\n");
        sb.append("    hostNumNotIn: ").append(toIndentedString(hostNumNotIn)).append("\n");
        sb.append("    hostsEvery: ").append(toIndentedString(hostsEvery)).append("\n");
        sb.append("    hostsNone: ").append(toIndentedString(hostsNone)).append("\n");
        sb.append("    hostsSome: ").append(toIndentedString(hostsSome)).append("\n");
        sb.append("    hypervisor: ").append(toIndentedString(hypervisor)).append("\n");
        sb.append("    hypervisorIn: ").append(toIndentedString(hypervisorIn)).append("\n");
        sb.append("    hypervisorNot: ").append(toIndentedString(hypervisorNot)).append("\n");
        sb.append("    hypervisorNotIn: ").append(toIndentedString(hypervisorNotIn)).append("\n");
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
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    ipContains: ").append(toIndentedString(ipContains)).append("\n");
        sb.append("    ipEndsWith: ").append(toIndentedString(ipEndsWith)).append("\n");
        sb.append("    ipGt: ").append(toIndentedString(ipGt)).append("\n");
        sb.append("    ipGte: ").append(toIndentedString(ipGte)).append("\n");
        sb.append("    ipIn: ").append(toIndentedString(ipIn)).append("\n");
        sb.append("    ipLt: ").append(toIndentedString(ipLt)).append("\n");
        sb.append("    ipLte: ").append(toIndentedString(ipLte)).append("\n");
        sb.append("    ipNot: ").append(toIndentedString(ipNot)).append("\n");
        sb.append("    ipNotContains: ").append(toIndentedString(ipNotContains)).append("\n");
        sb.append("    ipNotEndsWith: ").append(toIndentedString(ipNotEndsWith)).append("\n");
        sb.append("    ipNotIn: ").append(toIndentedString(ipNotIn)).append("\n");
        sb.append("    ipNotStartsWith: ").append(toIndentedString(ipNotStartsWith)).append("\n");
        sb.append("    ipStartsWith: ").append(toIndentedString(ipStartsWith)).append("\n");
        sb.append("    isAllFlash: ").append(toIndentedString(isAllFlash)).append("\n");
        sb.append("    isAllFlashNot: ").append(toIndentedString(isAllFlashNot)).append("\n");
        sb.append("    iscsiVip: ").append(toIndentedString(iscsiVip)).append("\n");
        sb.append("    iscsiVipContains: ").append(toIndentedString(iscsiVipContains)).append("\n");
        sb.append("    iscsiVipEndsWith: ").append(toIndentedString(iscsiVipEndsWith)).append("\n");
        sb.append("    iscsiVipGt: ").append(toIndentedString(iscsiVipGt)).append("\n");
        sb.append("    iscsiVipGte: ").append(toIndentedString(iscsiVipGte)).append("\n");
        sb.append("    iscsiVipIn: ").append(toIndentedString(iscsiVipIn)).append("\n");
        sb.append("    iscsiVipLt: ").append(toIndentedString(iscsiVipLt)).append("\n");
        sb.append("    iscsiVipLte: ").append(toIndentedString(iscsiVipLte)).append("\n");
        sb.append("    iscsiVipNot: ").append(toIndentedString(iscsiVipNot)).append("\n");
        sb.append("    iscsiVipNotContains: ")
                .append(toIndentedString(iscsiVipNotContains))
                .append("\n");
        sb.append("    iscsiVipNotEndsWith: ")
                .append(toIndentedString(iscsiVipNotEndsWith))
                .append("\n");
        sb.append("    iscsiVipNotIn: ").append(toIndentedString(iscsiVipNotIn)).append("\n");
        sb.append("    iscsiVipNotStartsWith: ")
                .append(toIndentedString(iscsiVipNotStartsWith))
                .append("\n");
        sb.append("    iscsiVipStartsWith: ")
                .append(toIndentedString(iscsiVipStartsWith))
                .append("\n");
        sb.append("    labelsEvery: ").append(toIndentedString(labelsEvery)).append("\n");
        sb.append("    labelsNone: ").append(toIndentedString(labelsNone)).append("\n");
        sb.append("    labelsSome: ").append(toIndentedString(labelsSome)).append("\n");
        sb.append("    licenseExpireDate: ")
                .append(toIndentedString(licenseExpireDate))
                .append("\n");
        sb.append("    licenseExpireDateGt: ")
                .append(toIndentedString(licenseExpireDateGt))
                .append("\n");
        sb.append("    licenseExpireDateGte: ")
                .append(toIndentedString(licenseExpireDateGte))
                .append("\n");
        sb.append("    licenseExpireDateIn: ")
                .append(toIndentedString(licenseExpireDateIn))
                .append("\n");
        sb.append("    licenseExpireDateLt: ")
                .append(toIndentedString(licenseExpireDateLt))
                .append("\n");
        sb.append("    licenseExpireDateLte: ")
                .append(toIndentedString(licenseExpireDateLte))
                .append("\n");
        sb.append("    licenseExpireDateNot: ")
                .append(toIndentedString(licenseExpireDateNot))
                .append("\n");
        sb.append("    licenseExpireDateNotIn: ")
                .append(toIndentedString(licenseExpireDateNotIn))
                .append("\n");
        sb.append("    licenseSerial: ").append(toIndentedString(licenseSerial)).append("\n");
        sb.append("    licenseSerialContains: ")
                .append(toIndentedString(licenseSerialContains))
                .append("\n");
        sb.append("    licenseSerialEndsWith: ")
                .append(toIndentedString(licenseSerialEndsWith))
                .append("\n");
        sb.append("    licenseSerialGt: ").append(toIndentedString(licenseSerialGt)).append("\n");
        sb.append("    licenseSerialGte: ").append(toIndentedString(licenseSerialGte)).append("\n");
        sb.append("    licenseSerialIn: ").append(toIndentedString(licenseSerialIn)).append("\n");
        sb.append("    licenseSerialLt: ").append(toIndentedString(licenseSerialLt)).append("\n");
        sb.append("    licenseSerialLte: ").append(toIndentedString(licenseSerialLte)).append("\n");
        sb.append("    licenseSerialNot: ").append(toIndentedString(licenseSerialNot)).append("\n");
        sb.append("    licenseSerialNotContains: ")
                .append(toIndentedString(licenseSerialNotContains))
                .append("\n");
        sb.append("    licenseSerialNotEndsWith: ")
                .append(toIndentedString(licenseSerialNotEndsWith))
                .append("\n");
        sb.append("    licenseSerialNotIn: ")
                .append(toIndentedString(licenseSerialNotIn))
                .append("\n");
        sb.append("    licenseSerialNotStartsWith: ")
                .append(toIndentedString(licenseSerialNotStartsWith))
                .append("\n");
        sb.append("    licenseSerialStartsWith: ")
                .append(toIndentedString(licenseSerialStartsWith))
                .append("\n");
        sb.append("    licenseSignDate: ").append(toIndentedString(licenseSignDate)).append("\n");
        sb.append("    licenseSignDateGt: ")
                .append(toIndentedString(licenseSignDateGt))
                .append("\n");
        sb.append("    licenseSignDateGte: ")
                .append(toIndentedString(licenseSignDateGte))
                .append("\n");
        sb.append("    licenseSignDateIn: ")
                .append(toIndentedString(licenseSignDateIn))
                .append("\n");
        sb.append("    licenseSignDateLt: ")
                .append(toIndentedString(licenseSignDateLt))
                .append("\n");
        sb.append("    licenseSignDateLte: ")
                .append(toIndentedString(licenseSignDateLte))
                .append("\n");
        sb.append("    licenseSignDateNot: ")
                .append(toIndentedString(licenseSignDateNot))
                .append("\n");
        sb.append("    licenseSignDateNotIn: ")
                .append(toIndentedString(licenseSignDateNotIn))
                .append("\n");
        sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
        sb.append("    licenseTypeIn: ").append(toIndentedString(licenseTypeIn)).append("\n");
        sb.append("    licenseTypeNot: ").append(toIndentedString(licenseTypeNot)).append("\n");
        sb.append("    licenseTypeNotIn: ").append(toIndentedString(licenseTypeNotIn)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    localIdContains: ").append(toIndentedString(localIdContains)).append("\n");
        sb.append("    localIdEndsWith: ").append(toIndentedString(localIdEndsWith)).append("\n");
        sb.append("    localIdGt: ").append(toIndentedString(localIdGt)).append("\n");
        sb.append("    localIdGte: ").append(toIndentedString(localIdGte)).append("\n");
        sb.append("    localIdIn: ").append(toIndentedString(localIdIn)).append("\n");
        sb.append("    localIdLt: ").append(toIndentedString(localIdLt)).append("\n");
        sb.append("    localIdLte: ").append(toIndentedString(localIdLte)).append("\n");
        sb.append("    localIdNot: ").append(toIndentedString(localIdNot)).append("\n");
        sb.append("    localIdNotContains: ")
                .append(toIndentedString(localIdNotContains))
                .append("\n");
        sb.append("    localIdNotEndsWith: ")
                .append(toIndentedString(localIdNotEndsWith))
                .append("\n");
        sb.append("    localIdNotIn: ").append(toIndentedString(localIdNotIn)).append("\n");
        sb.append("    localIdNotStartsWith: ")
                .append(toIndentedString(localIdNotStartsWith))
                .append("\n");
        sb.append("    localIdStartsWith: ")
                .append(toIndentedString(localIdStartsWith))
                .append("\n");
        sb.append("    maintenanceEndDate: ")
                .append(toIndentedString(maintenanceEndDate))
                .append("\n");
        sb.append("    maintenanceEndDateGt: ")
                .append(toIndentedString(maintenanceEndDateGt))
                .append("\n");
        sb.append("    maintenanceEndDateGte: ")
                .append(toIndentedString(maintenanceEndDateGte))
                .append("\n");
        sb.append("    maintenanceEndDateIn: ")
                .append(toIndentedString(maintenanceEndDateIn))
                .append("\n");
        sb.append("    maintenanceEndDateLt: ")
                .append(toIndentedString(maintenanceEndDateLt))
                .append("\n");
        sb.append("    maintenanceEndDateLte: ")
                .append(toIndentedString(maintenanceEndDateLte))
                .append("\n");
        sb.append("    maintenanceEndDateNot: ")
                .append(toIndentedString(maintenanceEndDateNot))
                .append("\n");
        sb.append("    maintenanceEndDateNotIn: ")
                .append(toIndentedString(maintenanceEndDateNotIn))
                .append("\n");
        sb.append("    maintenanceStartDate: ")
                .append(toIndentedString(maintenanceStartDate))
                .append("\n");
        sb.append("    maintenanceStartDateGt: ")
                .append(toIndentedString(maintenanceStartDateGt))
                .append("\n");
        sb.append("    maintenanceStartDateGte: ")
                .append(toIndentedString(maintenanceStartDateGte))
                .append("\n");
        sb.append("    maintenanceStartDateIn: ")
                .append(toIndentedString(maintenanceStartDateIn))
                .append("\n");
        sb.append("    maintenanceStartDateLt: ")
                .append(toIndentedString(maintenanceStartDateLt))
                .append("\n");
        sb.append("    maintenanceStartDateLte: ")
                .append(toIndentedString(maintenanceStartDateLte))
                .append("\n");
        sb.append("    maintenanceStartDateNot: ")
                .append(toIndentedString(maintenanceStartDateNot))
                .append("\n");
        sb.append("    maintenanceStartDateNotIn: ")
                .append(toIndentedString(maintenanceStartDateNotIn))
                .append("\n");
        sb.append("    managementVip: ").append(toIndentedString(managementVip)).append("\n");
        sb.append("    managementVipContains: ")
                .append(toIndentedString(managementVipContains))
                .append("\n");
        sb.append("    managementVipEndsWith: ")
                .append(toIndentedString(managementVipEndsWith))
                .append("\n");
        sb.append("    managementVipGt: ").append(toIndentedString(managementVipGt)).append("\n");
        sb.append("    managementVipGte: ").append(toIndentedString(managementVipGte)).append("\n");
        sb.append("    managementVipIn: ").append(toIndentedString(managementVipIn)).append("\n");
        sb.append("    managementVipLt: ").append(toIndentedString(managementVipLt)).append("\n");
        sb.append("    managementVipLte: ").append(toIndentedString(managementVipLte)).append("\n");
        sb.append("    managementVipNot: ").append(toIndentedString(managementVipNot)).append("\n");
        sb.append("    managementVipNotContains: ")
                .append(toIndentedString(managementVipNotContains))
                .append("\n");
        sb.append("    managementVipNotEndsWith: ")
                .append(toIndentedString(managementVipNotEndsWith))
                .append("\n");
        sb.append("    managementVipNotIn: ")
                .append(toIndentedString(managementVipNotIn))
                .append("\n");
        sb.append("    managementVipNotStartsWith: ")
                .append(toIndentedString(managementVipNotStartsWith))
                .append("\n");
        sb.append("    managementVipStartsWith: ")
                .append(toIndentedString(managementVipStartsWith))
                .append("\n");
        sb.append("    maxChunkNum: ").append(toIndentedString(maxChunkNum)).append("\n");
        sb.append("    maxChunkNumGt: ").append(toIndentedString(maxChunkNumGt)).append("\n");
        sb.append("    maxChunkNumGte: ").append(toIndentedString(maxChunkNumGte)).append("\n");
        sb.append("    maxChunkNumIn: ").append(toIndentedString(maxChunkNumIn)).append("\n");
        sb.append("    maxChunkNumLt: ").append(toIndentedString(maxChunkNumLt)).append("\n");
        sb.append("    maxChunkNumLte: ").append(toIndentedString(maxChunkNumLte)).append("\n");
        sb.append("    maxChunkNumNot: ").append(toIndentedString(maxChunkNumNot)).append("\n");
        sb.append("    maxChunkNumNotIn: ").append(toIndentedString(maxChunkNumNotIn)).append("\n");
        sb.append("    maxPhysicalDataCapacity: ")
                .append(toIndentedString(maxPhysicalDataCapacity))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityGt: ")
                .append(toIndentedString(maxPhysicalDataCapacityGt))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityGte: ")
                .append(toIndentedString(maxPhysicalDataCapacityGte))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityIn: ")
                .append(toIndentedString(maxPhysicalDataCapacityIn))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityLt: ")
                .append(toIndentedString(maxPhysicalDataCapacityLt))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityLte: ")
                .append(toIndentedString(maxPhysicalDataCapacityLte))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityNot: ")
                .append(toIndentedString(maxPhysicalDataCapacityNot))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityNotIn: ")
                .append(toIndentedString(maxPhysicalDataCapacityNotIn))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityPerNode: ")
                .append(toIndentedString(maxPhysicalDataCapacityPerNode))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityPerNodeGt: ")
                .append(toIndentedString(maxPhysicalDataCapacityPerNodeGt))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityPerNodeGte: ")
                .append(toIndentedString(maxPhysicalDataCapacityPerNodeGte))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityPerNodeIn: ")
                .append(toIndentedString(maxPhysicalDataCapacityPerNodeIn))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityPerNodeLt: ")
                .append(toIndentedString(maxPhysicalDataCapacityPerNodeLt))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityPerNodeLte: ")
                .append(toIndentedString(maxPhysicalDataCapacityPerNodeLte))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityPerNodeNot: ")
                .append(toIndentedString(maxPhysicalDataCapacityPerNodeNot))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityPerNodeNotIn: ")
                .append(toIndentedString(maxPhysicalDataCapacityPerNodeNotIn))
                .append("\n");
        sb.append("    mgtGateway: ").append(toIndentedString(mgtGateway)).append("\n");
        sb.append("    mgtGatewayContains: ")
                .append(toIndentedString(mgtGatewayContains))
                .append("\n");
        sb.append("    mgtGatewayEndsWith: ")
                .append(toIndentedString(mgtGatewayEndsWith))
                .append("\n");
        sb.append("    mgtGatewayGt: ").append(toIndentedString(mgtGatewayGt)).append("\n");
        sb.append("    mgtGatewayGte: ").append(toIndentedString(mgtGatewayGte)).append("\n");
        sb.append("    mgtGatewayIn: ").append(toIndentedString(mgtGatewayIn)).append("\n");
        sb.append("    mgtGatewayLt: ").append(toIndentedString(mgtGatewayLt)).append("\n");
        sb.append("    mgtGatewayLte: ").append(toIndentedString(mgtGatewayLte)).append("\n");
        sb.append("    mgtGatewayNot: ").append(toIndentedString(mgtGatewayNot)).append("\n");
        sb.append("    mgtGatewayNotContains: ")
                .append(toIndentedString(mgtGatewayNotContains))
                .append("\n");
        sb.append("    mgtGatewayNotEndsWith: ")
                .append(toIndentedString(mgtGatewayNotEndsWith))
                .append("\n");
        sb.append("    mgtGatewayNotIn: ").append(toIndentedString(mgtGatewayNotIn)).append("\n");
        sb.append("    mgtGatewayNotStartsWith: ")
                .append(toIndentedString(mgtGatewayNotStartsWith))
                .append("\n");
        sb.append("    mgtGatewayStartsWith: ")
                .append(toIndentedString(mgtGatewayStartsWith))
                .append("\n");
        sb.append("    mgtNetmask: ").append(toIndentedString(mgtNetmask)).append("\n");
        sb.append("    mgtNetmaskContains: ")
                .append(toIndentedString(mgtNetmaskContains))
                .append("\n");
        sb.append("    mgtNetmaskEndsWith: ")
                .append(toIndentedString(mgtNetmaskEndsWith))
                .append("\n");
        sb.append("    mgtNetmaskGt: ").append(toIndentedString(mgtNetmaskGt)).append("\n");
        sb.append("    mgtNetmaskGte: ").append(toIndentedString(mgtNetmaskGte)).append("\n");
        sb.append("    mgtNetmaskIn: ").append(toIndentedString(mgtNetmaskIn)).append("\n");
        sb.append("    mgtNetmaskLt: ").append(toIndentedString(mgtNetmaskLt)).append("\n");
        sb.append("    mgtNetmaskLte: ").append(toIndentedString(mgtNetmaskLte)).append("\n");
        sb.append("    mgtNetmaskNot: ").append(toIndentedString(mgtNetmaskNot)).append("\n");
        sb.append("    mgtNetmaskNotContains: ")
                .append(toIndentedString(mgtNetmaskNotContains))
                .append("\n");
        sb.append("    mgtNetmaskNotEndsWith: ")
                .append(toIndentedString(mgtNetmaskNotEndsWith))
                .append("\n");
        sb.append("    mgtNetmaskNotIn: ").append(toIndentedString(mgtNetmaskNotIn)).append("\n");
        sb.append("    mgtNetmaskNotStartsWith: ")
                .append(toIndentedString(mgtNetmaskNotStartsWith))
                .append("\n");
        sb.append("    mgtNetmaskStartsWith: ")
                .append(toIndentedString(mgtNetmaskStartsWith))
                .append("\n");
        sb.append("    migrationDataSize: ")
                .append(toIndentedString(migrationDataSize))
                .append("\n");
        sb.append("    migrationDataSizeGt: ")
                .append(toIndentedString(migrationDataSizeGt))
                .append("\n");
        sb.append("    migrationDataSizeGte: ")
                .append(toIndentedString(migrationDataSizeGte))
                .append("\n");
        sb.append("    migrationDataSizeIn: ")
                .append(toIndentedString(migrationDataSizeIn))
                .append("\n");
        sb.append("    migrationDataSizeLt: ")
                .append(toIndentedString(migrationDataSizeLt))
                .append("\n");
        sb.append("    migrationDataSizeLte: ")
                .append(toIndentedString(migrationDataSizeLte))
                .append("\n");
        sb.append("    migrationDataSizeNot: ")
                .append(toIndentedString(migrationDataSizeNot))
                .append("\n");
        sb.append("    migrationDataSizeNotIn: ")
                .append(toIndentedString(migrationDataSizeNotIn))
                .append("\n");
        sb.append("    migrationSpeed: ").append(toIndentedString(migrationSpeed)).append("\n");
        sb.append("    migrationSpeedGt: ").append(toIndentedString(migrationSpeedGt)).append("\n");
        sb.append("    migrationSpeedGte: ")
                .append(toIndentedString(migrationSpeedGte))
                .append("\n");
        sb.append("    migrationSpeedIn: ").append(toIndentedString(migrationSpeedIn)).append("\n");
        sb.append("    migrationSpeedLt: ").append(toIndentedString(migrationSpeedLt)).append("\n");
        sb.append("    migrationSpeedLte: ")
                .append(toIndentedString(migrationSpeedLte))
                .append("\n");
        sb.append("    migrationSpeedNot: ")
                .append(toIndentedString(migrationSpeedNot))
                .append("\n");
        sb.append("    migrationSpeedNotIn: ")
                .append(toIndentedString(migrationSpeedNotIn))
                .append("\n");
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
        sb.append("    nameNotStartsWith: ")
                .append(toIndentedString(nameNotStartsWith))
                .append("\n");
        sb.append("    nameStartsWith: ").append(toIndentedString(nameStartsWith)).append("\n");
        sb.append("    ntpMode: ").append(toIndentedString(ntpMode)).append("\n");
        sb.append("    ntpModeIn: ").append(toIndentedString(ntpModeIn)).append("\n");
        sb.append("    ntpModeNot: ").append(toIndentedString(ntpModeNot)).append("\n");
        sb.append("    ntpModeNotIn: ").append(toIndentedString(ntpModeNotIn)).append("\n");
        sb.append("    nvmeOverRdmaEnabled: ")
                .append(toIndentedString(nvmeOverRdmaEnabled))
                .append("\n");
        sb.append("    nvmeOverRdmaEnabledNot: ")
                .append(toIndentedString(nvmeOverRdmaEnabledNot))
                .append("\n");
        sb.append("    nvmeOverTcpEnabled: ")
                .append(toIndentedString(nvmeOverTcpEnabled))
                .append("\n");
        sb.append("    nvmeOverTcpEnabledNot: ")
                .append(toIndentedString(nvmeOverTcpEnabledNot))
                .append("\n");
        sb.append("    nvmfEnabled: ").append(toIndentedString(nvmfEnabled)).append("\n");
        sb.append("    nvmfEnabledNot: ").append(toIndentedString(nvmfEnabledNot)).append("\n");
        sb.append("    pmemEnabled: ").append(toIndentedString(pmemEnabled)).append("\n");
        sb.append("    pmemEnabledNot: ").append(toIndentedString(pmemEnabledNot)).append("\n");
        sb.append("    provisionedCpuCores: ")
                .append(toIndentedString(provisionedCpuCores))
                .append("\n");
        sb.append("    provisionedCpuCoresForActiveVm: ")
                .append(toIndentedString(provisionedCpuCoresForActiveVm))
                .append("\n");
        sb.append("    provisionedCpuCoresForActiveVmGt: ")
                .append(toIndentedString(provisionedCpuCoresForActiveVmGt))
                .append("\n");
        sb.append("    provisionedCpuCoresForActiveVmGte: ")
                .append(toIndentedString(provisionedCpuCoresForActiveVmGte))
                .append("\n");
        sb.append("    provisionedCpuCoresForActiveVmIn: ")
                .append(toIndentedString(provisionedCpuCoresForActiveVmIn))
                .append("\n");
        sb.append("    provisionedCpuCoresForActiveVmLt: ")
                .append(toIndentedString(provisionedCpuCoresForActiveVmLt))
                .append("\n");
        sb.append("    provisionedCpuCoresForActiveVmLte: ")
                .append(toIndentedString(provisionedCpuCoresForActiveVmLte))
                .append("\n");
        sb.append("    provisionedCpuCoresForActiveVmNot: ")
                .append(toIndentedString(provisionedCpuCoresForActiveVmNot))
                .append("\n");
        sb.append("    provisionedCpuCoresForActiveVmNotIn: ")
                .append(toIndentedString(provisionedCpuCoresForActiveVmNotIn))
                .append("\n");
        sb.append("    provisionedCpuCoresGt: ")
                .append(toIndentedString(provisionedCpuCoresGt))
                .append("\n");
        sb.append("    provisionedCpuCoresGte: ")
                .append(toIndentedString(provisionedCpuCoresGte))
                .append("\n");
        sb.append("    provisionedCpuCoresIn: ")
                .append(toIndentedString(provisionedCpuCoresIn))
                .append("\n");
        sb.append("    provisionedCpuCoresLt: ")
                .append(toIndentedString(provisionedCpuCoresLt))
                .append("\n");
        sb.append("    provisionedCpuCoresLte: ")
                .append(toIndentedString(provisionedCpuCoresLte))
                .append("\n");
        sb.append("    provisionedCpuCoresNot: ")
                .append(toIndentedString(provisionedCpuCoresNot))
                .append("\n");
        sb.append("    provisionedCpuCoresNotIn: ")
                .append(toIndentedString(provisionedCpuCoresNotIn))
                .append("\n");
        sb.append("    provisionedForActiveVmRatio: ")
                .append(toIndentedString(provisionedForActiveVmRatio))
                .append("\n");
        sb.append("    provisionedForActiveVmRatioGt: ")
                .append(toIndentedString(provisionedForActiveVmRatioGt))
                .append("\n");
        sb.append("    provisionedForActiveVmRatioGte: ")
                .append(toIndentedString(provisionedForActiveVmRatioGte))
                .append("\n");
        sb.append("    provisionedForActiveVmRatioIn: ")
                .append(toIndentedString(provisionedForActiveVmRatioIn))
                .append("\n");
        sb.append("    provisionedForActiveVmRatioLt: ")
                .append(toIndentedString(provisionedForActiveVmRatioLt))
                .append("\n");
        sb.append("    provisionedForActiveVmRatioLte: ")
                .append(toIndentedString(provisionedForActiveVmRatioLte))
                .append("\n");
        sb.append("    provisionedForActiveVmRatioNot: ")
                .append(toIndentedString(provisionedForActiveVmRatioNot))
                .append("\n");
        sb.append("    provisionedForActiveVmRatioNotIn: ")
                .append(toIndentedString(provisionedForActiveVmRatioNotIn))
                .append("\n");
        sb.append("    provisionedMemoryBytes: ")
                .append(toIndentedString(provisionedMemoryBytes))
                .append("\n");
        sb.append("    provisionedMemoryBytesGt: ")
                .append(toIndentedString(provisionedMemoryBytesGt))
                .append("\n");
        sb.append("    provisionedMemoryBytesGte: ")
                .append(toIndentedString(provisionedMemoryBytesGte))
                .append("\n");
        sb.append("    provisionedMemoryBytesIn: ")
                .append(toIndentedString(provisionedMemoryBytesIn))
                .append("\n");
        sb.append("    provisionedMemoryBytesLt: ")
                .append(toIndentedString(provisionedMemoryBytesLt))
                .append("\n");
        sb.append("    provisionedMemoryBytesLte: ")
                .append(toIndentedString(provisionedMemoryBytesLte))
                .append("\n");
        sb.append("    provisionedMemoryBytesNot: ")
                .append(toIndentedString(provisionedMemoryBytesNot))
                .append("\n");
        sb.append("    provisionedMemoryBytesNotIn: ")
                .append(toIndentedString(provisionedMemoryBytesNotIn))
                .append("\n");
        sb.append("    provisionedRatio: ").append(toIndentedString(provisionedRatio)).append("\n");
        sb.append("    provisionedRatioGt: ")
                .append(toIndentedString(provisionedRatioGt))
                .append("\n");
        sb.append("    provisionedRatioGte: ")
                .append(toIndentedString(provisionedRatioGte))
                .append("\n");
        sb.append("    provisionedRatioIn: ")
                .append(toIndentedString(provisionedRatioIn))
                .append("\n");
        sb.append("    provisionedRatioLt: ")
                .append(toIndentedString(provisionedRatioLt))
                .append("\n");
        sb.append("    provisionedRatioLte: ")
                .append(toIndentedString(provisionedRatioLte))
                .append("\n");
        sb.append("    provisionedRatioNot: ")
                .append(toIndentedString(provisionedRatioNot))
                .append("\n");
        sb.append("    provisionedRatioNotIn: ")
                .append(toIndentedString(provisionedRatioNotIn))
                .append("\n");
        sb.append("    rdmaEnabled: ").append(toIndentedString(rdmaEnabled)).append("\n");
        sb.append("    rdmaEnabledNot: ").append(toIndentedString(rdmaEnabledNot)).append("\n");
        sb.append("    recoverDataSize: ").append(toIndentedString(recoverDataSize)).append("\n");
        sb.append("    recoverDataSizeGt: ")
                .append(toIndentedString(recoverDataSizeGt))
                .append("\n");
        sb.append("    recoverDataSizeGte: ")
                .append(toIndentedString(recoverDataSizeGte))
                .append("\n");
        sb.append("    recoverDataSizeIn: ")
                .append(toIndentedString(recoverDataSizeIn))
                .append("\n");
        sb.append("    recoverDataSizeLt: ")
                .append(toIndentedString(recoverDataSizeLt))
                .append("\n");
        sb.append("    recoverDataSizeLte: ")
                .append(toIndentedString(recoverDataSizeLte))
                .append("\n");
        sb.append("    recoverDataSizeNot: ")
                .append(toIndentedString(recoverDataSizeNot))
                .append("\n");
        sb.append("    recoverDataSizeNotIn: ")
                .append(toIndentedString(recoverDataSizeNotIn))
                .append("\n");
        sb.append("    recoverSpeed: ").append(toIndentedString(recoverSpeed)).append("\n");
        sb.append("    recoverSpeedGt: ").append(toIndentedString(recoverSpeedGt)).append("\n");
        sb.append("    recoverSpeedGte: ").append(toIndentedString(recoverSpeedGte)).append("\n");
        sb.append("    recoverSpeedIn: ").append(toIndentedString(recoverSpeedIn)).append("\n");
        sb.append("    recoverSpeedLt: ").append(toIndentedString(recoverSpeedLt)).append("\n");
        sb.append("    recoverSpeedLte: ").append(toIndentedString(recoverSpeedLte)).append("\n");
        sb.append("    recoverSpeedNot: ").append(toIndentedString(recoverSpeedNot)).append("\n");
        sb.append("    recoverSpeedNotIn: ")
                .append(toIndentedString(recoverSpeedNotIn))
                .append("\n");
        sb.append("    reservedCpuCoresForSystemService: ")
                .append(toIndentedString(reservedCpuCoresForSystemService))
                .append("\n");
        sb.append("    reservedCpuCoresForSystemServiceGt: ")
                .append(toIndentedString(reservedCpuCoresForSystemServiceGt))
                .append("\n");
        sb.append("    reservedCpuCoresForSystemServiceGte: ")
                .append(toIndentedString(reservedCpuCoresForSystemServiceGte))
                .append("\n");
        sb.append("    reservedCpuCoresForSystemServiceIn: ")
                .append(toIndentedString(reservedCpuCoresForSystemServiceIn))
                .append("\n");
        sb.append("    reservedCpuCoresForSystemServiceLt: ")
                .append(toIndentedString(reservedCpuCoresForSystemServiceLt))
                .append("\n");
        sb.append("    reservedCpuCoresForSystemServiceLte: ")
                .append(toIndentedString(reservedCpuCoresForSystemServiceLte))
                .append("\n");
        sb.append("    reservedCpuCoresForSystemServiceNot: ")
                .append(toIndentedString(reservedCpuCoresForSystemServiceNot))
                .append("\n");
        sb.append("    reservedCpuCoresForSystemServiceNotIn: ")
                .append(toIndentedString(reservedCpuCoresForSystemServiceNotIn))
                .append("\n");
        sb.append("    runningVmNum: ").append(toIndentedString(runningVmNum)).append("\n");
        sb.append("    runningVmNumGt: ").append(toIndentedString(runningVmNumGt)).append("\n");
        sb.append("    runningVmNumGte: ").append(toIndentedString(runningVmNumGte)).append("\n");
        sb.append("    runningVmNumIn: ").append(toIndentedString(runningVmNumIn)).append("\n");
        sb.append("    runningVmNumLt: ").append(toIndentedString(runningVmNumLt)).append("\n");
        sb.append("    runningVmNumLte: ").append(toIndentedString(runningVmNumLte)).append("\n");
        sb.append("    runningVmNumNot: ").append(toIndentedString(runningVmNumNot)).append("\n");
        sb.append("    runningVmNumNotIn: ")
                .append(toIndentedString(runningVmNumNotIn))
                .append("\n");
        sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
        sb.append("    softwareEdition: ").append(toIndentedString(softwareEdition)).append("\n");
        sb.append("    softwareEditionIn: ")
                .append(toIndentedString(softwareEditionIn))
                .append("\n");
        sb.append("    softwareEditionNot: ")
                .append(toIndentedString(softwareEditionNot))
                .append("\n");
        sb.append("    softwareEditionNotIn: ")
                .append(toIndentedString(softwareEditionNotIn))
                .append("\n");
        sb.append("    stoppedVmNum: ").append(toIndentedString(stoppedVmNum)).append("\n");
        sb.append("    stoppedVmNumGt: ").append(toIndentedString(stoppedVmNumGt)).append("\n");
        sb.append("    stoppedVmNumGte: ").append(toIndentedString(stoppedVmNumGte)).append("\n");
        sb.append("    stoppedVmNumIn: ").append(toIndentedString(stoppedVmNumIn)).append("\n");
        sb.append("    stoppedVmNumLt: ").append(toIndentedString(stoppedVmNumLt)).append("\n");
        sb.append("    stoppedVmNumLte: ").append(toIndentedString(stoppedVmNumLte)).append("\n");
        sb.append("    stoppedVmNumNot: ").append(toIndentedString(stoppedVmNumNot)).append("\n");
        sb.append("    stoppedVmNumNotIn: ")
                .append(toIndentedString(stoppedVmNumNotIn))
                .append("\n");
        sb.append("    stretch: ").append(toIndentedString(stretch)).append("\n");
        sb.append("    stretchNot: ").append(toIndentedString(stretchNot)).append("\n");
        sb.append("    suspendedVmNum: ").append(toIndentedString(suspendedVmNum)).append("\n");
        sb.append("    suspendedVmNumGt: ").append(toIndentedString(suspendedVmNumGt)).append("\n");
        sb.append("    suspendedVmNumGte: ")
                .append(toIndentedString(suspendedVmNumGte))
                .append("\n");
        sb.append("    suspendedVmNumIn: ").append(toIndentedString(suspendedVmNumIn)).append("\n");
        sb.append("    suspendedVmNumLt: ").append(toIndentedString(suspendedVmNumLt)).append("\n");
        sb.append("    suspendedVmNumLte: ")
                .append(toIndentedString(suspendedVmNumLte))
                .append("\n");
        sb.append("    suspendedVmNumNot: ")
                .append(toIndentedString(suspendedVmNumNot))
                .append("\n");
        sb.append("    suspendedVmNumNotIn: ")
                .append(toIndentedString(suspendedVmNumNotIn))
                .append("\n");
        sb.append("    totalCacheCapacity: ")
                .append(toIndentedString(totalCacheCapacity))
                .append("\n");
        sb.append("    totalCacheCapacityGt: ")
                .append(toIndentedString(totalCacheCapacityGt))
                .append("\n");
        sb.append("    totalCacheCapacityGte: ")
                .append(toIndentedString(totalCacheCapacityGte))
                .append("\n");
        sb.append("    totalCacheCapacityIn: ")
                .append(toIndentedString(totalCacheCapacityIn))
                .append("\n");
        sb.append("    totalCacheCapacityLt: ")
                .append(toIndentedString(totalCacheCapacityLt))
                .append("\n");
        sb.append("    totalCacheCapacityLte: ")
                .append(toIndentedString(totalCacheCapacityLte))
                .append("\n");
        sb.append("    totalCacheCapacityNot: ")
                .append(toIndentedString(totalCacheCapacityNot))
                .append("\n");
        sb.append("    totalCacheCapacityNotIn: ")
                .append(toIndentedString(totalCacheCapacityNotIn))
                .append("\n");
        sb.append("    totalCpuCores: ").append(toIndentedString(totalCpuCores)).append("\n");
        sb.append("    totalCpuCoresGt: ").append(toIndentedString(totalCpuCoresGt)).append("\n");
        sb.append("    totalCpuCoresGte: ").append(toIndentedString(totalCpuCoresGte)).append("\n");
        sb.append("    totalCpuCoresIn: ").append(toIndentedString(totalCpuCoresIn)).append("\n");
        sb.append("    totalCpuCoresLt: ").append(toIndentedString(totalCpuCoresLt)).append("\n");
        sb.append("    totalCpuCoresLte: ").append(toIndentedString(totalCpuCoresLte)).append("\n");
        sb.append("    totalCpuCoresNot: ").append(toIndentedString(totalCpuCoresNot)).append("\n");
        sb.append("    totalCpuCoresNotIn: ")
                .append(toIndentedString(totalCpuCoresNotIn))
                .append("\n");
        sb.append("    totalCpuHz: ").append(toIndentedString(totalCpuHz)).append("\n");
        sb.append("    totalCpuHzGt: ").append(toIndentedString(totalCpuHzGt)).append("\n");
        sb.append("    totalCpuHzGte: ").append(toIndentedString(totalCpuHzGte)).append("\n");
        sb.append("    totalCpuHzIn: ").append(toIndentedString(totalCpuHzIn)).append("\n");
        sb.append("    totalCpuHzLt: ").append(toIndentedString(totalCpuHzLt)).append("\n");
        sb.append("    totalCpuHzLte: ").append(toIndentedString(totalCpuHzLte)).append("\n");
        sb.append("    totalCpuHzNot: ").append(toIndentedString(totalCpuHzNot)).append("\n");
        sb.append("    totalCpuHzNotIn: ").append(toIndentedString(totalCpuHzNotIn)).append("\n");
        sb.append("    totalCpuSockets: ").append(toIndentedString(totalCpuSockets)).append("\n");
        sb.append("    totalCpuSocketsGt: ")
                .append(toIndentedString(totalCpuSocketsGt))
                .append("\n");
        sb.append("    totalCpuSocketsGte: ")
                .append(toIndentedString(totalCpuSocketsGte))
                .append("\n");
        sb.append("    totalCpuSocketsIn: ")
                .append(toIndentedString(totalCpuSocketsIn))
                .append("\n");
        sb.append("    totalCpuSocketsLt: ")
                .append(toIndentedString(totalCpuSocketsLt))
                .append("\n");
        sb.append("    totalCpuSocketsLte: ")
                .append(toIndentedString(totalCpuSocketsLte))
                .append("\n");
        sb.append("    totalCpuSocketsNot: ")
                .append(toIndentedString(totalCpuSocketsNot))
                .append("\n");
        sb.append("    totalCpuSocketsNotIn: ")
                .append(toIndentedString(totalCpuSocketsNotIn))
                .append("\n");
        sb.append("    totalDataCapacity: ")
                .append(toIndentedString(totalDataCapacity))
                .append("\n");
        sb.append("    totalDataCapacityGt: ")
                .append(toIndentedString(totalDataCapacityGt))
                .append("\n");
        sb.append("    totalDataCapacityGte: ")
                .append(toIndentedString(totalDataCapacityGte))
                .append("\n");
        sb.append("    totalDataCapacityIn: ")
                .append(toIndentedString(totalDataCapacityIn))
                .append("\n");
        sb.append("    totalDataCapacityLt: ")
                .append(toIndentedString(totalDataCapacityLt))
                .append("\n");
        sb.append("    totalDataCapacityLte: ")
                .append(toIndentedString(totalDataCapacityLte))
                .append("\n");
        sb.append("    totalDataCapacityNot: ")
                .append(toIndentedString(totalDataCapacityNot))
                .append("\n");
        sb.append("    totalDataCapacityNotIn: ")
                .append(toIndentedString(totalDataCapacityNotIn))
                .append("\n");
        sb.append("    totalMemoryBytes: ").append(toIndentedString(totalMemoryBytes)).append("\n");
        sb.append("    totalMemoryBytesGt: ")
                .append(toIndentedString(totalMemoryBytesGt))
                .append("\n");
        sb.append("    totalMemoryBytesGte: ")
                .append(toIndentedString(totalMemoryBytesGte))
                .append("\n");
        sb.append("    totalMemoryBytesIn: ")
                .append(toIndentedString(totalMemoryBytesIn))
                .append("\n");
        sb.append("    totalMemoryBytesLt: ")
                .append(toIndentedString(totalMemoryBytesLt))
                .append("\n");
        sb.append("    totalMemoryBytesLte: ")
                .append(toIndentedString(totalMemoryBytesLte))
                .append("\n");
        sb.append("    totalMemoryBytesNot: ")
                .append(toIndentedString(totalMemoryBytesNot))
                .append("\n");
        sb.append("    totalMemoryBytesNotIn: ")
                .append(toIndentedString(totalMemoryBytesNotIn))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    upgradeToolVersion: ")
                .append(toIndentedString(upgradeToolVersion))
                .append("\n");
        sb.append("    upgradeToolVersionContains: ")
                .append(toIndentedString(upgradeToolVersionContains))
                .append("\n");
        sb.append("    upgradeToolVersionEndsWith: ")
                .append(toIndentedString(upgradeToolVersionEndsWith))
                .append("\n");
        sb.append("    upgradeToolVersionGt: ")
                .append(toIndentedString(upgradeToolVersionGt))
                .append("\n");
        sb.append("    upgradeToolVersionGte: ")
                .append(toIndentedString(upgradeToolVersionGte))
                .append("\n");
        sb.append("    upgradeToolVersionIn: ")
                .append(toIndentedString(upgradeToolVersionIn))
                .append("\n");
        sb.append("    upgradeToolVersionLt: ")
                .append(toIndentedString(upgradeToolVersionLt))
                .append("\n");
        sb.append("    upgradeToolVersionLte: ")
                .append(toIndentedString(upgradeToolVersionLte))
                .append("\n");
        sb.append("    upgradeToolVersionNot: ")
                .append(toIndentedString(upgradeToolVersionNot))
                .append("\n");
        sb.append("    upgradeToolVersionNotContains: ")
                .append(toIndentedString(upgradeToolVersionNotContains))
                .append("\n");
        sb.append("    upgradeToolVersionNotEndsWith: ")
                .append(toIndentedString(upgradeToolVersionNotEndsWith))
                .append("\n");
        sb.append("    upgradeToolVersionNotIn: ")
                .append(toIndentedString(upgradeToolVersionNotIn))
                .append("\n");
        sb.append("    upgradeToolVersionNotStartsWith: ")
                .append(toIndentedString(upgradeToolVersionNotStartsWith))
                .append("\n");
        sb.append("    upgradeToolVersionStartsWith: ")
                .append(toIndentedString(upgradeToolVersionStartsWith))
                .append("\n");
        sb.append("    usedCpuHz: ").append(toIndentedString(usedCpuHz)).append("\n");
        sb.append("    usedCpuHzGt: ").append(toIndentedString(usedCpuHzGt)).append("\n");
        sb.append("    usedCpuHzGte: ").append(toIndentedString(usedCpuHzGte)).append("\n");
        sb.append("    usedCpuHzIn: ").append(toIndentedString(usedCpuHzIn)).append("\n");
        sb.append("    usedCpuHzLt: ").append(toIndentedString(usedCpuHzLt)).append("\n");
        sb.append("    usedCpuHzLte: ").append(toIndentedString(usedCpuHzLte)).append("\n");
        sb.append("    usedCpuHzNot: ").append(toIndentedString(usedCpuHzNot)).append("\n");
        sb.append("    usedCpuHzNotIn: ").append(toIndentedString(usedCpuHzNotIn)).append("\n");
        sb.append("    usedDataSpace: ").append(toIndentedString(usedDataSpace)).append("\n");
        sb.append("    usedDataSpaceGt: ").append(toIndentedString(usedDataSpaceGt)).append("\n");
        sb.append("    usedDataSpaceGte: ").append(toIndentedString(usedDataSpaceGte)).append("\n");
        sb.append("    usedDataSpaceIn: ").append(toIndentedString(usedDataSpaceIn)).append("\n");
        sb.append("    usedDataSpaceLt: ").append(toIndentedString(usedDataSpaceLt)).append("\n");
        sb.append("    usedDataSpaceLte: ").append(toIndentedString(usedDataSpaceLte)).append("\n");
        sb.append("    usedDataSpaceNot: ").append(toIndentedString(usedDataSpaceNot)).append("\n");
        sb.append("    usedDataSpaceNotIn: ")
                .append(toIndentedString(usedDataSpaceNotIn))
                .append("\n");
        sb.append("    usedMemoryBytes: ").append(toIndentedString(usedMemoryBytes)).append("\n");
        sb.append("    usedMemoryBytesGt: ")
                .append(toIndentedString(usedMemoryBytesGt))
                .append("\n");
        sb.append("    usedMemoryBytesGte: ")
                .append(toIndentedString(usedMemoryBytesGte))
                .append("\n");
        sb.append("    usedMemoryBytesIn: ")
                .append(toIndentedString(usedMemoryBytesIn))
                .append("\n");
        sb.append("    usedMemoryBytesLt: ")
                .append(toIndentedString(usedMemoryBytesLt))
                .append("\n");
        sb.append("    usedMemoryBytesLte: ")
                .append(toIndentedString(usedMemoryBytesLte))
                .append("\n");
        sb.append("    usedMemoryBytesNot: ")
                .append(toIndentedString(usedMemoryBytesNot))
                .append("\n");
        sb.append("    usedMemoryBytesNotIn: ")
                .append(toIndentedString(usedMemoryBytesNotIn))
                .append("\n");
        sb.append("    validDataSpace: ").append(toIndentedString(validDataSpace)).append("\n");
        sb.append("    validDataSpaceGt: ").append(toIndentedString(validDataSpaceGt)).append("\n");
        sb.append("    validDataSpaceGte: ")
                .append(toIndentedString(validDataSpaceGte))
                .append("\n");
        sb.append("    validDataSpaceIn: ").append(toIndentedString(validDataSpaceIn)).append("\n");
        sb.append("    validDataSpaceLt: ").append(toIndentedString(validDataSpaceLt)).append("\n");
        sb.append("    validDataSpaceLte: ")
                .append(toIndentedString(validDataSpaceLte))
                .append("\n");
        sb.append("    validDataSpaceNot: ")
                .append(toIndentedString(validDataSpaceNot))
                .append("\n");
        sb.append("    validDataSpaceNotIn: ")
                .append(toIndentedString(validDataSpaceNotIn))
                .append("\n");
        sb.append("    vcenterAccount: ").append(toIndentedString(vcenterAccount)).append("\n");
        sb.append("    vdsesEvery: ").append(toIndentedString(vdsesEvery)).append("\n");
        sb.append("    vdsesNone: ").append(toIndentedString(vdsesNone)).append("\n");
        sb.append("    vdsesSome: ").append(toIndentedString(vdsesSome)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionContains: ").append(toIndentedString(versionContains)).append("\n");
        sb.append("    versionEndsWith: ").append(toIndentedString(versionEndsWith)).append("\n");
        sb.append("    versionGt: ").append(toIndentedString(versionGt)).append("\n");
        sb.append("    versionGte: ").append(toIndentedString(versionGte)).append("\n");
        sb.append("    versionIn: ").append(toIndentedString(versionIn)).append("\n");
        sb.append("    versionLt: ").append(toIndentedString(versionLt)).append("\n");
        sb.append("    versionLte: ").append(toIndentedString(versionLte)).append("\n");
        sb.append("    versionNot: ").append(toIndentedString(versionNot)).append("\n");
        sb.append("    versionNotContains: ")
                .append(toIndentedString(versionNotContains))
                .append("\n");
        sb.append("    versionNotEndsWith: ")
                .append(toIndentedString(versionNotEndsWith))
                .append("\n");
        sb.append("    versionNotIn: ").append(toIndentedString(versionNotIn)).append("\n");
        sb.append("    versionNotStartsWith: ")
                .append(toIndentedString(versionNotStartsWith))
                .append("\n");
        sb.append("    versionStartsWith: ")
                .append(toIndentedString(versionStartsWith))
                .append("\n");
        sb.append("    vhostEnabled: ").append(toIndentedString(vhostEnabled)).append("\n");
        sb.append("    vhostEnabledNot: ").append(toIndentedString(vhostEnabledNot)).append("\n");
        sb.append("    vmFoldersEvery: ").append(toIndentedString(vmFoldersEvery)).append("\n");
        sb.append("    vmFoldersNone: ").append(toIndentedString(vmFoldersNone)).append("\n");
        sb.append("    vmFoldersSome: ").append(toIndentedString(vmFoldersSome)).append("\n");
        sb.append("    vmNum: ").append(toIndentedString(vmNum)).append("\n");
        sb.append("    vmNumGt: ").append(toIndentedString(vmNumGt)).append("\n");
        sb.append("    vmNumGte: ").append(toIndentedString(vmNumGte)).append("\n");
        sb.append("    vmNumIn: ").append(toIndentedString(vmNumIn)).append("\n");
        sb.append("    vmNumLt: ").append(toIndentedString(vmNumLt)).append("\n");
        sb.append("    vmNumLte: ").append(toIndentedString(vmNumLte)).append("\n");
        sb.append("    vmNumNot: ").append(toIndentedString(vmNumNot)).append("\n");
        sb.append("    vmNumNotIn: ").append(toIndentedString(vmNumNotIn)).append("\n");
        sb.append("    vmTemplatesEvery: ").append(toIndentedString(vmTemplatesEvery)).append("\n");
        sb.append("    vmTemplatesNone: ").append(toIndentedString(vmTemplatesNone)).append("\n");
        sb.append("    vmTemplatesSome: ").append(toIndentedString(vmTemplatesSome)).append("\n");
        sb.append("    vmsEvery: ").append(toIndentedString(vmsEvery)).append("\n");
        sb.append("    vmsNone: ").append(toIndentedString(vmsNone)).append("\n");
        sb.append("    vmsSome: ").append(toIndentedString(vmsSome)).append("\n");
        sb.append("    witness: ").append(toIndentedString(witness)).append("\n");
        sb.append("    zonesEvery: ").append(toIndentedString(zonesEvery)).append("\n");
        sb.append("    zonesNone: ").append(toIndentedString(zonesNone)).append("\n");
        sb.append("    zonesSome: ").append(toIndentedString(zonesSome)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
