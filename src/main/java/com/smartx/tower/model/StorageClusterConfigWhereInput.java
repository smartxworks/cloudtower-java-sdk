package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** StorageClusterConfigWhereInput */
@javax.annotation.Generated(value = "JavaCloudTowerClientCodegen")
public class StorageClusterConfigWhereInput
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<StorageClusterConfigWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<StorageClusterConfigWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<StorageClusterConfigWhereInput> OR = null;

    public static final String SERIALIZED_NAME_COMPUTE_CLUSTER = "compute_cluster";

    @SerializedName(SERIALIZED_NAME_COMPUTE_CLUSTER)
    private ClusterWhereInput computeCluster;

    public static final String SERIALIZED_NAME_CONNECT_STATE = "connect_state";

    @SerializedName(SERIALIZED_NAME_CONNECT_STATE)
    private StorageClusterConnectState connectState;

    public static final String SERIALIZED_NAME_CONNECT_STATE_IN = "connect_state_in";

    @SerializedName(SERIALIZED_NAME_CONNECT_STATE_IN)
    private List<StorageClusterConnectState> connectStateIn = null;

    public static final String SERIALIZED_NAME_CONNECT_STATE_NOT = "connect_state_not";

    @SerializedName(SERIALIZED_NAME_CONNECT_STATE_NOT)
    private StorageClusterConnectState connectStateNot;

    public static final String SERIALIZED_NAME_CONNECT_STATE_NOT_IN = "connect_state_not_in";

    @SerializedName(SERIALIZED_NAME_CONNECT_STATE_NOT_IN)
    private List<StorageClusterConnectState> connectStateNotIn = null;

    public static final String SERIALIZED_NAME_CREATED_TIME = "created_time";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME)
    private String createdTime;

    public static final String SERIALIZED_NAME_CREATED_TIME_GT = "created_time_gt";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_GT)
    private String createdTimeGt;

    public static final String SERIALIZED_NAME_CREATED_TIME_GTE = "created_time_gte";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_GTE)
    private String createdTimeGte;

    public static final String SERIALIZED_NAME_CREATED_TIME_IN = "created_time_in";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_IN)
    private List<String> createdTimeIn = null;

    public static final String SERIALIZED_NAME_CREATED_TIME_LT = "created_time_lt";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_LT)
    private String createdTimeLt;

    public static final String SERIALIZED_NAME_CREATED_TIME_LTE = "created_time_lte";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_LTE)
    private String createdTimeLte;

    public static final String SERIALIZED_NAME_CREATED_TIME_NOT = "created_time_not";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_NOT)
    private String createdTimeNot;

    public static final String SERIALIZED_NAME_CREATED_TIME_NOT_IN = "created_time_not_in";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_NOT_IN)
    private List<String> createdTimeNotIn = null;

    public static final String SERIALIZED_NAME_DATASTORE = "datastore";

    @SerializedName(SERIALIZED_NAME_DATASTORE)
    private DatastoreWhereInput datastore;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION =
            "default_storage_encryption";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION)
    private Boolean defaultStorageEncryption;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM =
            "default_storage_encryption_algorithm";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM)
    private String defaultStorageEncryptionAlgorithm;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_CONTAINS =
            "default_storage_encryption_algorithm_contains";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_CONTAINS)
    private String defaultStorageEncryptionAlgorithmContains;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_ENDS_WITH =
            "default_storage_encryption_algorithm_ends_with";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_ENDS_WITH)
    private String defaultStorageEncryptionAlgorithmEndsWith;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_GT =
            "default_storage_encryption_algorithm_gt";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_GT)
    private String defaultStorageEncryptionAlgorithmGt;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_GTE =
            "default_storage_encryption_algorithm_gte";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_GTE)
    private String defaultStorageEncryptionAlgorithmGte;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_IN =
            "default_storage_encryption_algorithm_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_IN)
    private List<String> defaultStorageEncryptionAlgorithmIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_LT =
            "default_storage_encryption_algorithm_lt";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_LT)
    private String defaultStorageEncryptionAlgorithmLt;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_LTE =
            "default_storage_encryption_algorithm_lte";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_LTE)
    private String defaultStorageEncryptionAlgorithmLte;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT =
            "default_storage_encryption_algorithm_not";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT)
    private String defaultStorageEncryptionAlgorithmNot;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_CONTAINS =
            "default_storage_encryption_algorithm_not_contains";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_CONTAINS)
    private String defaultStorageEncryptionAlgorithmNotContains;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_ENDS_WITH =
            "default_storage_encryption_algorithm_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_ENDS_WITH)
    private String defaultStorageEncryptionAlgorithmNotEndsWith;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_IN =
            "default_storage_encryption_algorithm_not_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_IN)
    private List<String> defaultStorageEncryptionAlgorithmNotIn = null;

    public static final String
            SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_STARTS_WITH =
                    "default_storage_encryption_algorithm_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_STARTS_WITH)
    private String defaultStorageEncryptionAlgorithmNotStartsWith;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_STARTS_WITH =
            "default_storage_encryption_algorithm_starts_with";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_STARTS_WITH)
    private String defaultStorageEncryptionAlgorithmStartsWith;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_NOT =
            "default_storage_encryption_not";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_NOT)
    private Boolean defaultStorageEncryptionNot;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY = "default_storage_policy";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY)
    private VmVolumeElfStoragePolicyType defaultStoragePolicy;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K =
            "default_storage_policy_ec_k";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K)
    private Integer defaultStoragePolicyEcK;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GT =
            "default_storage_policy_ec_k_gt";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GT)
    private Integer defaultStoragePolicyEcKGt;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GTE =
            "default_storage_policy_ec_k_gte";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GTE)
    private Integer defaultStoragePolicyEcKGte;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_IN =
            "default_storage_policy_ec_k_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_IN)
    private List<Integer> defaultStoragePolicyEcKIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LT =
            "default_storage_policy_ec_k_lt";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LT)
    private Integer defaultStoragePolicyEcKLt;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LTE =
            "default_storage_policy_ec_k_lte";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LTE)
    private Integer defaultStoragePolicyEcKLte;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT =
            "default_storage_policy_ec_k_not";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT)
    private Integer defaultStoragePolicyEcKNot;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT_IN =
            "default_storage_policy_ec_k_not_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT_IN)
    private List<Integer> defaultStoragePolicyEcKNotIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M =
            "default_storage_policy_ec_m";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M)
    private Integer defaultStoragePolicyEcM;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GT =
            "default_storage_policy_ec_m_gt";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GT)
    private Integer defaultStoragePolicyEcMGt;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GTE =
            "default_storage_policy_ec_m_gte";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GTE)
    private Integer defaultStoragePolicyEcMGte;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_IN =
            "default_storage_policy_ec_m_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_IN)
    private List<Integer> defaultStoragePolicyEcMIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LT =
            "default_storage_policy_ec_m_lt";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LT)
    private Integer defaultStoragePolicyEcMLt;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LTE =
            "default_storage_policy_ec_m_lte";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LTE)
    private Integer defaultStoragePolicyEcMLte;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT =
            "default_storage_policy_ec_m_not";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT)
    private Integer defaultStoragePolicyEcMNot;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT_IN =
            "default_storage_policy_ec_m_not_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT_IN)
    private List<Integer> defaultStoragePolicyEcMNotIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_IN =
            "default_storage_policy_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_IN)
    private List<VmVolumeElfStoragePolicyType> defaultStoragePolicyIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT =
            "default_storage_policy_not";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT)
    private VmVolumeElfStoragePolicyType defaultStoragePolicyNot;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT_IN =
            "default_storage_policy_not_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT_IN)
    private List<VmVolumeElfStoragePolicyType> defaultStoragePolicyNotIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM =
            "default_storage_policy_replica_num";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM)
    private Integer defaultStoragePolicyReplicaNum;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GT =
            "default_storage_policy_replica_num_gt";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GT)
    private Integer defaultStoragePolicyReplicaNumGt;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GTE =
            "default_storage_policy_replica_num_gte";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GTE)
    private Integer defaultStoragePolicyReplicaNumGte;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_IN =
            "default_storage_policy_replica_num_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_IN)
    private List<Integer> defaultStoragePolicyReplicaNumIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LT =
            "default_storage_policy_replica_num_lt";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LT)
    private Integer defaultStoragePolicyReplicaNumLt;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LTE =
            "default_storage_policy_replica_num_lte";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LTE)
    private Integer defaultStoragePolicyReplicaNumLte;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT =
            "default_storage_policy_replica_num_not";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT)
    private Integer defaultStoragePolicyReplicaNumNot;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT_IN =
            "default_storage_policy_replica_num_not_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT_IN)
    private List<Integer> defaultStoragePolicyReplicaNumNotIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM =
            "default_storage_policy_stripe_num";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM)
    private Integer defaultStoragePolicyStripeNum;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GT =
            "default_storage_policy_stripe_num_gt";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GT)
    private Integer defaultStoragePolicyStripeNumGt;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GTE =
            "default_storage_policy_stripe_num_gte";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GTE)
    private Integer defaultStoragePolicyStripeNumGte;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_IN =
            "default_storage_policy_stripe_num_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_IN)
    private List<Integer> defaultStoragePolicyStripeNumIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LT =
            "default_storage_policy_stripe_num_lt";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LT)
    private Integer defaultStoragePolicyStripeNumLt;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LTE =
            "default_storage_policy_stripe_num_lte";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LTE)
    private Integer defaultStoragePolicyStripeNumLte;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT =
            "default_storage_policy_stripe_num_not";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT)
    private Integer defaultStoragePolicyStripeNumNot;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT_IN =
            "default_storage_policy_stripe_num_not_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT_IN)
    private List<Integer> defaultStoragePolicyStripeNumNotIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION =
            "default_storage_policy_thin_provision";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION)
    private Boolean defaultStoragePolicyThinProvision;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION_NOT =
            "default_storage_policy_thin_provision_not";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION_NOT)
    private Boolean defaultStoragePolicyThinProvisionNot;

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

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS =
            "description_not_contains";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS)
    private String descriptionNotContains;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH =
            "description_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH)
    private String descriptionNotEndsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_IN = "description_not_in";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_IN)
    private List<String> descriptionNotIn = null;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH =
            "description_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH)
    private String descriptionNotStartsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_STARTS_WITH = "description_starts_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH)
    private String descriptionStartsWith;

    public static final String SERIALIZED_NAME_ERROR_STATE = "error_state";

    @SerializedName(SERIALIZED_NAME_ERROR_STATE)
    private StorageClusterErrorState errorState;

    public static final String SERIALIZED_NAME_ERROR_STATE_IN = "error_state_in";

    @SerializedName(SERIALIZED_NAME_ERROR_STATE_IN)
    private List<StorageClusterErrorState> errorStateIn = null;

    public static final String SERIALIZED_NAME_ERROR_STATE_NOT = "error_state_not";

    @SerializedName(SERIALIZED_NAME_ERROR_STATE_NOT)
    private StorageClusterErrorState errorStateNot;

    public static final String SERIALIZED_NAME_ERROR_STATE_NOT_IN = "error_state_not_in";

    @SerializedName(SERIALIZED_NAME_ERROR_STATE_NOT_IN)
    private List<StorageClusterErrorState> errorStateNotIn = null;

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

    public static final String SERIALIZED_NAME_ISCSI_PORT = "iscsi_port";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT)
    private String iscsiPort;

    public static final String SERIALIZED_NAME_ISCSI_PORT_CONTAINS = "iscsi_port_contains";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT_CONTAINS)
    private String iscsiPortContains;

    public static final String SERIALIZED_NAME_ISCSI_PORT_ENDS_WITH = "iscsi_port_ends_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT_ENDS_WITH)
    private String iscsiPortEndsWith;

    public static final String SERIALIZED_NAME_ISCSI_PORT_GT = "iscsi_port_gt";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT_GT)
    private String iscsiPortGt;

    public static final String SERIALIZED_NAME_ISCSI_PORT_GTE = "iscsi_port_gte";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT_GTE)
    private String iscsiPortGte;

    public static final String SERIALIZED_NAME_ISCSI_PORT_IN = "iscsi_port_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT_IN)
    private List<String> iscsiPortIn = null;

    public static final String SERIALIZED_NAME_ISCSI_PORT_LT = "iscsi_port_lt";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT_LT)
    private String iscsiPortLt;

    public static final String SERIALIZED_NAME_ISCSI_PORT_LTE = "iscsi_port_lte";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT_LTE)
    private String iscsiPortLte;

    public static final String SERIALIZED_NAME_ISCSI_PORT_NOT = "iscsi_port_not";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT_NOT)
    private String iscsiPortNot;

    public static final String SERIALIZED_NAME_ISCSI_PORT_NOT_CONTAINS = "iscsi_port_not_contains";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT_NOT_CONTAINS)
    private String iscsiPortNotContains;

    public static final String SERIALIZED_NAME_ISCSI_PORT_NOT_ENDS_WITH =
            "iscsi_port_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT_NOT_ENDS_WITH)
    private String iscsiPortNotEndsWith;

    public static final String SERIALIZED_NAME_ISCSI_PORT_NOT_IN = "iscsi_port_not_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT_NOT_IN)
    private List<String> iscsiPortNotIn = null;

    public static final String SERIALIZED_NAME_ISCSI_PORT_NOT_STARTS_WITH =
            "iscsi_port_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT_NOT_STARTS_WITH)
    private String iscsiPortNotStartsWith;

    public static final String SERIALIZED_NAME_ISCSI_PORT_STARTS_WITH = "iscsi_port_starts_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT_STARTS_WITH)
    private String iscsiPortStartsWith;

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

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER = "storage_cluster";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER)
    private ClusterWhereInput storageCluster;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_UUID = "storage_cluster_uuid";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_UUID)
    private String storageClusterUuid;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_UUID_CONTAINS =
            "storage_cluster_uuid_contains";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_CONTAINS)
    private String storageClusterUuidContains;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_UUID_ENDS_WITH =
            "storage_cluster_uuid_ends_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_ENDS_WITH)
    private String storageClusterUuidEndsWith;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_UUID_GT = "storage_cluster_uuid_gt";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_GT)
    private String storageClusterUuidGt;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_UUID_GTE =
            "storage_cluster_uuid_gte";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_GTE)
    private String storageClusterUuidGte;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_UUID_IN = "storage_cluster_uuid_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_IN)
    private List<String> storageClusterUuidIn = null;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_UUID_LT = "storage_cluster_uuid_lt";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_LT)
    private String storageClusterUuidLt;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_UUID_LTE =
            "storage_cluster_uuid_lte";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_LTE)
    private String storageClusterUuidLte;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT =
            "storage_cluster_uuid_not";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT)
    private String storageClusterUuidNot;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_CONTAINS =
            "storage_cluster_uuid_not_contains";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_CONTAINS)
    private String storageClusterUuidNotContains;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_ENDS_WITH =
            "storage_cluster_uuid_not_ends_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_ENDS_WITH)
    private String storageClusterUuidNotEndsWith;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_IN =
            "storage_cluster_uuid_not_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_IN)
    private List<String> storageClusterUuidNotIn = null;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_STARTS_WITH =
            "storage_cluster_uuid_not_starts_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_STARTS_WITH)
    private String storageClusterUuidNotStartsWith;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_UUID_STARTS_WITH =
            "storage_cluster_uuid_starts_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_STARTS_WITH)
    private String storageClusterUuidStartsWith;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private StorageClusterConfigStorageType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<StorageClusterConfigStorageType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private StorageClusterConfigStorageType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<StorageClusterConfigStorageType> typeNotIn = null;

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

    public static final String SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH =
            "username_not_starts_with";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH)
    private String usernameNotStartsWith;

    public static final String SERIALIZED_NAME_USERNAME_STARTS_WITH = "username_starts_with";

    @SerializedName(SERIALIZED_NAME_USERNAME_STARTS_WITH)
    private String usernameStartsWith;

    public StorageClusterConfigWhereInput() {}

    public StorageClusterConfigWhereInput AND(List<StorageClusterConfigWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public StorageClusterConfigWhereInput addANDItem(StorageClusterConfigWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<StorageClusterConfigWhereInput>();
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
    public List<StorageClusterConfigWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<StorageClusterConfigWhereInput> AND) {
        this.AND = AND;
    }

    public StorageClusterConfigWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public StorageClusterConfigWhereInput AND_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput NOT(List<StorageClusterConfigWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public StorageClusterConfigWhereInput addNOTItem(StorageClusterConfigWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<StorageClusterConfigWhereInput>();
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
    public List<StorageClusterConfigWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<StorageClusterConfigWhereInput> NOT) {
        this.NOT = NOT;
    }

    public StorageClusterConfigWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public StorageClusterConfigWhereInput NOT_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput OR(List<StorageClusterConfigWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public StorageClusterConfigWhereInput addORItem(StorageClusterConfigWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<StorageClusterConfigWhereInput>();
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
    public List<StorageClusterConfigWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<StorageClusterConfigWhereInput> OR) {
        this.OR = OR;
    }

    public StorageClusterConfigWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public StorageClusterConfigWhereInput OR_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput computeCluster(ClusterWhereInput computeCluster) {

        this.computeCluster = computeCluster;
        return this;
    }

    /**
     * Get computeCluster
     *
     * @return computeCluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getComputeCluster() {
        return computeCluster;
    }

    public void setComputeCluster(ClusterWhereInput computeCluster) {
        this.computeCluster = computeCluster;
    }

    public StorageClusterConfigWhereInput computeCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPUTE_CLUSTER);
        return this;
    }

    public StorageClusterConfigWhereInput computeCluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPUTE_CLUSTER);
        return this;
    }

    public void setComputeCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPUTE_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPUTE_CLUSTER);
        }
    }

    public boolean getComputeCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPUTE_CLUSTER);
    }

    public StorageClusterConfigWhereInput connectState(StorageClusterConnectState connectState) {

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
    public StorageClusterConnectState getConnectState() {
        return connectState;
    }

    public void setConnectState(StorageClusterConnectState connectState) {
        this.connectState = connectState;
    }

    public StorageClusterConfigWhereInput connectState_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONNECT_STATE);
        return this;
    }

    public StorageClusterConfigWhereInput connectState_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput connectStateIn(
            List<StorageClusterConnectState> connectStateIn) {

        this.connectStateIn = connectStateIn;
        return this;
    }

    public StorageClusterConfigWhereInput addConnectStateInItem(
            StorageClusterConnectState connectStateInItem) {
        if (this.connectStateIn == null) {
            this.connectStateIn = new ArrayList<StorageClusterConnectState>();
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
    public List<StorageClusterConnectState> getConnectStateIn() {
        return connectStateIn;
    }

    public void setConnectStateIn(List<StorageClusterConnectState> connectStateIn) {
        this.connectStateIn = connectStateIn;
    }

    public StorageClusterConfigWhereInput connectStateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONNECT_STATE_IN);
        return this;
    }

    public StorageClusterConfigWhereInput connectStateIn_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput connectStateNot(
            StorageClusterConnectState connectStateNot) {

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
    public StorageClusterConnectState getConnectStateNot() {
        return connectStateNot;
    }

    public void setConnectStateNot(StorageClusterConnectState connectStateNot) {
        this.connectStateNot = connectStateNot;
    }

    public StorageClusterConfigWhereInput connectStateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONNECT_STATE_NOT);
        return this;
    }

    public StorageClusterConfigWhereInput connectStateNot_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput connectStateNotIn(
            List<StorageClusterConnectState> connectStateNotIn) {

        this.connectStateNotIn = connectStateNotIn;
        return this;
    }

    public StorageClusterConfigWhereInput addConnectStateNotInItem(
            StorageClusterConnectState connectStateNotInItem) {
        if (this.connectStateNotIn == null) {
            this.connectStateNotIn = new ArrayList<StorageClusterConnectState>();
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
    public List<StorageClusterConnectState> getConnectStateNotIn() {
        return connectStateNotIn;
    }

    public void setConnectStateNotIn(List<StorageClusterConnectState> connectStateNotIn) {
        this.connectStateNotIn = connectStateNotIn;
    }

    public StorageClusterConfigWhereInput connectStateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONNECT_STATE_NOT_IN);
        return this;
    }

    public StorageClusterConfigWhereInput connectStateNotIn_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput createdTime(String createdTime) {

        this.createdTime = createdTime;
        return this;
    }

    /**
     * Get createdTime
     *
     * @return createdTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public StorageClusterConfigWhereInput createdTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME);
        return this;
    }

    public StorageClusterConfigWhereInput createdTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME);
        return this;
    }

    public void setCreatedTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME);
        }
    }

    public boolean getCreatedTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME);
    }

    public StorageClusterConfigWhereInput createdTimeGt(String createdTimeGt) {

        this.createdTimeGt = createdTimeGt;
        return this;
    }

    /**
     * Get createdTimeGt
     *
     * @return createdTimeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedTimeGt() {
        return createdTimeGt;
    }

    public void setCreatedTimeGt(String createdTimeGt) {
        this.createdTimeGt = createdTimeGt;
    }

    public StorageClusterConfigWhereInput createdTimeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_GT);
        return this;
    }

    public StorageClusterConfigWhereInput createdTimeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_GT);
        return this;
    }

    public void setCreatedTimeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_GT);
        }
    }

    public boolean getCreatedTimeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_GT);
    }

    public StorageClusterConfigWhereInput createdTimeGte(String createdTimeGte) {

        this.createdTimeGte = createdTimeGte;
        return this;
    }

    /**
     * Get createdTimeGte
     *
     * @return createdTimeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedTimeGte() {
        return createdTimeGte;
    }

    public void setCreatedTimeGte(String createdTimeGte) {
        this.createdTimeGte = createdTimeGte;
    }

    public StorageClusterConfigWhereInput createdTimeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_GTE);
        return this;
    }

    public StorageClusterConfigWhereInput createdTimeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_GTE);
        return this;
    }

    public void setCreatedTimeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_GTE);
        }
    }

    public boolean getCreatedTimeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_GTE);
    }

    public StorageClusterConfigWhereInput createdTimeIn(List<String> createdTimeIn) {

        this.createdTimeIn = createdTimeIn;
        return this;
    }

    public StorageClusterConfigWhereInput addCreatedTimeInItem(String createdTimeInItem) {
        if (this.createdTimeIn == null) {
            this.createdTimeIn = new ArrayList<String>();
        }
        this.createdTimeIn.add(createdTimeInItem);
        return this;
    }

    /**
     * Get createdTimeIn
     *
     * @return createdTimeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCreatedTimeIn() {
        return createdTimeIn;
    }

    public void setCreatedTimeIn(List<String> createdTimeIn) {
        this.createdTimeIn = createdTimeIn;
    }

    public StorageClusterConfigWhereInput createdTimeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_IN);
        return this;
    }

    public StorageClusterConfigWhereInput createdTimeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_IN);
        return this;
    }

    public void setCreatedTimeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_IN);
        }
    }

    public boolean getCreatedTimeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_IN);
    }

    public StorageClusterConfigWhereInput createdTimeLt(String createdTimeLt) {

        this.createdTimeLt = createdTimeLt;
        return this;
    }

    /**
     * Get createdTimeLt
     *
     * @return createdTimeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedTimeLt() {
        return createdTimeLt;
    }

    public void setCreatedTimeLt(String createdTimeLt) {
        this.createdTimeLt = createdTimeLt;
    }

    public StorageClusterConfigWhereInput createdTimeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_LT);
        return this;
    }

    public StorageClusterConfigWhereInput createdTimeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_LT);
        return this;
    }

    public void setCreatedTimeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_LT);
        }
    }

    public boolean getCreatedTimeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_LT);
    }

    public StorageClusterConfigWhereInput createdTimeLte(String createdTimeLte) {

        this.createdTimeLte = createdTimeLte;
        return this;
    }

    /**
     * Get createdTimeLte
     *
     * @return createdTimeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedTimeLte() {
        return createdTimeLte;
    }

    public void setCreatedTimeLte(String createdTimeLte) {
        this.createdTimeLte = createdTimeLte;
    }

    public StorageClusterConfigWhereInput createdTimeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_LTE);
        return this;
    }

    public StorageClusterConfigWhereInput createdTimeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_LTE);
        return this;
    }

    public void setCreatedTimeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_LTE);
        }
    }

    public boolean getCreatedTimeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_LTE);
    }

    public StorageClusterConfigWhereInput createdTimeNot(String createdTimeNot) {

        this.createdTimeNot = createdTimeNot;
        return this;
    }

    /**
     * Get createdTimeNot
     *
     * @return createdTimeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedTimeNot() {
        return createdTimeNot;
    }

    public void setCreatedTimeNot(String createdTimeNot) {
        this.createdTimeNot = createdTimeNot;
    }

    public StorageClusterConfigWhereInput createdTimeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_NOT);
        return this;
    }

    public StorageClusterConfigWhereInput createdTimeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_NOT);
        return this;
    }

    public void setCreatedTimeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_NOT);
        }
    }

    public boolean getCreatedTimeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_NOT);
    }

    public StorageClusterConfigWhereInput createdTimeNotIn(List<String> createdTimeNotIn) {

        this.createdTimeNotIn = createdTimeNotIn;
        return this;
    }

    public StorageClusterConfigWhereInput addCreatedTimeNotInItem(String createdTimeNotInItem) {
        if (this.createdTimeNotIn == null) {
            this.createdTimeNotIn = new ArrayList<String>();
        }
        this.createdTimeNotIn.add(createdTimeNotInItem);
        return this;
    }

    /**
     * Get createdTimeNotIn
     *
     * @return createdTimeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCreatedTimeNotIn() {
        return createdTimeNotIn;
    }

    public void setCreatedTimeNotIn(List<String> createdTimeNotIn) {
        this.createdTimeNotIn = createdTimeNotIn;
    }

    public StorageClusterConfigWhereInput createdTimeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_NOT_IN);
        return this;
    }

    public StorageClusterConfigWhereInput createdTimeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_NOT_IN);
        return this;
    }

    public void setCreatedTimeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_NOT_IN);
        }
    }

    public boolean getCreatedTimeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_NOT_IN);
    }

    public StorageClusterConfigWhereInput datastore(DatastoreWhereInput datastore) {

        this.datastore = datastore;
        return this;
    }

    /**
     * Get datastore
     *
     * @return datastore
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DatastoreWhereInput getDatastore() {
        return datastore;
    }

    public void setDatastore(DatastoreWhereInput datastore) {
        this.datastore = datastore;
    }

    public StorageClusterConfigWhereInput datastore_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE);
        return this;
    }

    public StorageClusterConfigWhereInput datastore_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE);
        return this;
    }

    public void setDatastore_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE);
        }
    }

    public boolean getDatastore_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE);
    }

    public StorageClusterConfigWhereInput defaultStorageEncryption(
            Boolean defaultStorageEncryption) {

        this.defaultStorageEncryption = defaultStorageEncryption;
        return this;
    }

    /**
     * Get defaultStorageEncryption
     *
     * @return defaultStorageEncryption
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDefaultStorageEncryption() {
        return defaultStorageEncryption;
    }

    public void setDefaultStorageEncryption(Boolean defaultStorageEncryption) {
        this.defaultStorageEncryption = defaultStorageEncryption;
    }

    public StorageClusterConfigWhereInput defaultStorageEncryption_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStorageEncryption_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION);
        return this;
    }

    public void setDefaultStorageEncryption_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION);
        }
    }

    public boolean getDefaultStorageEncryption_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION);
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithm(
            String defaultStorageEncryptionAlgorithm) {

        this.defaultStorageEncryptionAlgorithm = defaultStorageEncryptionAlgorithm;
        return this;
    }

    /**
     * Get defaultStorageEncryptionAlgorithm
     *
     * @return defaultStorageEncryptionAlgorithm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDefaultStorageEncryptionAlgorithm() {
        return defaultStorageEncryptionAlgorithm;
    }

    public void setDefaultStorageEncryptionAlgorithm(String defaultStorageEncryptionAlgorithm) {
        this.defaultStorageEncryptionAlgorithm = defaultStorageEncryptionAlgorithm;
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM);
        return this;
    }

    public void setDefaultStorageEncryptionAlgorithm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM);
        }
    }

    public boolean getDefaultStorageEncryptionAlgorithm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM);
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmContains(
            String defaultStorageEncryptionAlgorithmContains) {

        this.defaultStorageEncryptionAlgorithmContains = defaultStorageEncryptionAlgorithmContains;
        return this;
    }

    /**
     * Get defaultStorageEncryptionAlgorithmContains
     *
     * @return defaultStorageEncryptionAlgorithmContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDefaultStorageEncryptionAlgorithmContains() {
        return defaultStorageEncryptionAlgorithmContains;
    }

    public void setDefaultStorageEncryptionAlgorithmContains(
            String defaultStorageEncryptionAlgorithmContains) {
        this.defaultStorageEncryptionAlgorithmContains = defaultStorageEncryptionAlgorithmContains;
    }

    public StorageClusterConfigWhereInput
            defaultStorageEncryptionAlgorithmContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_CONTAINS);
        return this;
    }

    public StorageClusterConfigWhereInput
            defaultStorageEncryptionAlgorithmContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_CONTAINS);
        return this;
    }

    public void setDefaultStorageEncryptionAlgorithmContains_IsExplictlyNull(
            boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_CONTAINS);
        }
    }

    public boolean getDefaultStorageEncryptionAlgorithmContains_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_CONTAINS);
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmEndsWith(
            String defaultStorageEncryptionAlgorithmEndsWith) {

        this.defaultStorageEncryptionAlgorithmEndsWith = defaultStorageEncryptionAlgorithmEndsWith;
        return this;
    }

    /**
     * Get defaultStorageEncryptionAlgorithmEndsWith
     *
     * @return defaultStorageEncryptionAlgorithmEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDefaultStorageEncryptionAlgorithmEndsWith() {
        return defaultStorageEncryptionAlgorithmEndsWith;
    }

    public void setDefaultStorageEncryptionAlgorithmEndsWith(
            String defaultStorageEncryptionAlgorithmEndsWith) {
        this.defaultStorageEncryptionAlgorithmEndsWith = defaultStorageEncryptionAlgorithmEndsWith;
    }

    public StorageClusterConfigWhereInput
            defaultStorageEncryptionAlgorithmEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_ENDS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput
            defaultStorageEncryptionAlgorithmEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_ENDS_WITH);
        return this;
    }

    public void setDefaultStorageEncryptionAlgorithmEndsWith_IsExplictlyNull(
            boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_ENDS_WITH);
        }
    }

    public boolean getDefaultStorageEncryptionAlgorithmEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_ENDS_WITH);
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmGt(
            String defaultStorageEncryptionAlgorithmGt) {

        this.defaultStorageEncryptionAlgorithmGt = defaultStorageEncryptionAlgorithmGt;
        return this;
    }

    /**
     * Get defaultStorageEncryptionAlgorithmGt
     *
     * @return defaultStorageEncryptionAlgorithmGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDefaultStorageEncryptionAlgorithmGt() {
        return defaultStorageEncryptionAlgorithmGt;
    }

    public void setDefaultStorageEncryptionAlgorithmGt(String defaultStorageEncryptionAlgorithmGt) {
        this.defaultStorageEncryptionAlgorithmGt = defaultStorageEncryptionAlgorithmGt;
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_GT);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_GT);
        return this;
    }

    public void setDefaultStorageEncryptionAlgorithmGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_GT);
        }
    }

    public boolean getDefaultStorageEncryptionAlgorithmGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_GT);
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmGte(
            String defaultStorageEncryptionAlgorithmGte) {

        this.defaultStorageEncryptionAlgorithmGte = defaultStorageEncryptionAlgorithmGte;
        return this;
    }

    /**
     * Get defaultStorageEncryptionAlgorithmGte
     *
     * @return defaultStorageEncryptionAlgorithmGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDefaultStorageEncryptionAlgorithmGte() {
        return defaultStorageEncryptionAlgorithmGte;
    }

    public void setDefaultStorageEncryptionAlgorithmGte(
            String defaultStorageEncryptionAlgorithmGte) {
        this.defaultStorageEncryptionAlgorithmGte = defaultStorageEncryptionAlgorithmGte;
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_GTE);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_GTE);
        return this;
    }

    public void setDefaultStorageEncryptionAlgorithmGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_GTE);
        }
    }

    public boolean getDefaultStorageEncryptionAlgorithmGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_GTE);
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmIn(
            List<String> defaultStorageEncryptionAlgorithmIn) {

        this.defaultStorageEncryptionAlgorithmIn = defaultStorageEncryptionAlgorithmIn;
        return this;
    }

    public StorageClusterConfigWhereInput addDefaultStorageEncryptionAlgorithmInItem(
            String defaultStorageEncryptionAlgorithmInItem) {
        if (this.defaultStorageEncryptionAlgorithmIn == null) {
            this.defaultStorageEncryptionAlgorithmIn = new ArrayList<String>();
        }
        this.defaultStorageEncryptionAlgorithmIn.add(defaultStorageEncryptionAlgorithmInItem);
        return this;
    }

    /**
     * Get defaultStorageEncryptionAlgorithmIn
     *
     * @return defaultStorageEncryptionAlgorithmIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDefaultStorageEncryptionAlgorithmIn() {
        return defaultStorageEncryptionAlgorithmIn;
    }

    public void setDefaultStorageEncryptionAlgorithmIn(
            List<String> defaultStorageEncryptionAlgorithmIn) {
        this.defaultStorageEncryptionAlgorithmIn = defaultStorageEncryptionAlgorithmIn;
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_IN);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_IN);
        return this;
    }

    public void setDefaultStorageEncryptionAlgorithmIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_IN);
        }
    }

    public boolean getDefaultStorageEncryptionAlgorithmIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_IN);
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmLt(
            String defaultStorageEncryptionAlgorithmLt) {

        this.defaultStorageEncryptionAlgorithmLt = defaultStorageEncryptionAlgorithmLt;
        return this;
    }

    /**
     * Get defaultStorageEncryptionAlgorithmLt
     *
     * @return defaultStorageEncryptionAlgorithmLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDefaultStorageEncryptionAlgorithmLt() {
        return defaultStorageEncryptionAlgorithmLt;
    }

    public void setDefaultStorageEncryptionAlgorithmLt(String defaultStorageEncryptionAlgorithmLt) {
        this.defaultStorageEncryptionAlgorithmLt = defaultStorageEncryptionAlgorithmLt;
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_LT);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_LT);
        return this;
    }

    public void setDefaultStorageEncryptionAlgorithmLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_LT);
        }
    }

    public boolean getDefaultStorageEncryptionAlgorithmLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_LT);
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmLte(
            String defaultStorageEncryptionAlgorithmLte) {

        this.defaultStorageEncryptionAlgorithmLte = defaultStorageEncryptionAlgorithmLte;
        return this;
    }

    /**
     * Get defaultStorageEncryptionAlgorithmLte
     *
     * @return defaultStorageEncryptionAlgorithmLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDefaultStorageEncryptionAlgorithmLte() {
        return defaultStorageEncryptionAlgorithmLte;
    }

    public void setDefaultStorageEncryptionAlgorithmLte(
            String defaultStorageEncryptionAlgorithmLte) {
        this.defaultStorageEncryptionAlgorithmLte = defaultStorageEncryptionAlgorithmLte;
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_LTE);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_LTE);
        return this;
    }

    public void setDefaultStorageEncryptionAlgorithmLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_LTE);
        }
    }

    public boolean getDefaultStorageEncryptionAlgorithmLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_LTE);
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmNot(
            String defaultStorageEncryptionAlgorithmNot) {

        this.defaultStorageEncryptionAlgorithmNot = defaultStorageEncryptionAlgorithmNot;
        return this;
    }

    /**
     * Get defaultStorageEncryptionAlgorithmNot
     *
     * @return defaultStorageEncryptionAlgorithmNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDefaultStorageEncryptionAlgorithmNot() {
        return defaultStorageEncryptionAlgorithmNot;
    }

    public void setDefaultStorageEncryptionAlgorithmNot(
            String defaultStorageEncryptionAlgorithmNot) {
        this.defaultStorageEncryptionAlgorithmNot = defaultStorageEncryptionAlgorithmNot;
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT);
        return this;
    }

    public void setDefaultStorageEncryptionAlgorithmNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT);
        }
    }

    public boolean getDefaultStorageEncryptionAlgorithmNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT);
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmNotContains(
            String defaultStorageEncryptionAlgorithmNotContains) {

        this.defaultStorageEncryptionAlgorithmNotContains =
                defaultStorageEncryptionAlgorithmNotContains;
        return this;
    }

    /**
     * Get defaultStorageEncryptionAlgorithmNotContains
     *
     * @return defaultStorageEncryptionAlgorithmNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDefaultStorageEncryptionAlgorithmNotContains() {
        return defaultStorageEncryptionAlgorithmNotContains;
    }

    public void setDefaultStorageEncryptionAlgorithmNotContains(
            String defaultStorageEncryptionAlgorithmNotContains) {
        this.defaultStorageEncryptionAlgorithmNotContains =
                defaultStorageEncryptionAlgorithmNotContains;
    }

    public StorageClusterConfigWhereInput
            defaultStorageEncryptionAlgorithmNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_CONTAINS);
        return this;
    }

    public StorageClusterConfigWhereInput
            defaultStorageEncryptionAlgorithmNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_CONTAINS);
        return this;
    }

    public void setDefaultStorageEncryptionAlgorithmNotContains_IsExplictlyNull(
            boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(
                    SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_CONTAINS);
        }
    }

    public boolean getDefaultStorageEncryptionAlgorithmNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_CONTAINS);
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmNotEndsWith(
            String defaultStorageEncryptionAlgorithmNotEndsWith) {

        this.defaultStorageEncryptionAlgorithmNotEndsWith =
                defaultStorageEncryptionAlgorithmNotEndsWith;
        return this;
    }

    /**
     * Get defaultStorageEncryptionAlgorithmNotEndsWith
     *
     * @return defaultStorageEncryptionAlgorithmNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDefaultStorageEncryptionAlgorithmNotEndsWith() {
        return defaultStorageEncryptionAlgorithmNotEndsWith;
    }

    public void setDefaultStorageEncryptionAlgorithmNotEndsWith(
            String defaultStorageEncryptionAlgorithmNotEndsWith) {
        this.defaultStorageEncryptionAlgorithmNotEndsWith =
                defaultStorageEncryptionAlgorithmNotEndsWith;
    }

    public StorageClusterConfigWhereInput
            defaultStorageEncryptionAlgorithmNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_ENDS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput
            defaultStorageEncryptionAlgorithmNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_ENDS_WITH);
        return this;
    }

    public void setDefaultStorageEncryptionAlgorithmNotEndsWith_IsExplictlyNull(
            boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(
                    SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(
                    SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_ENDS_WITH);
        }
    }

    public boolean getDefaultStorageEncryptionAlgorithmNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_ENDS_WITH);
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmNotIn(
            List<String> defaultStorageEncryptionAlgorithmNotIn) {

        this.defaultStorageEncryptionAlgorithmNotIn = defaultStorageEncryptionAlgorithmNotIn;
        return this;
    }

    public StorageClusterConfigWhereInput addDefaultStorageEncryptionAlgorithmNotInItem(
            String defaultStorageEncryptionAlgorithmNotInItem) {
        if (this.defaultStorageEncryptionAlgorithmNotIn == null) {
            this.defaultStorageEncryptionAlgorithmNotIn = new ArrayList<String>();
        }
        this.defaultStorageEncryptionAlgorithmNotIn.add(defaultStorageEncryptionAlgorithmNotInItem);
        return this;
    }

    /**
     * Get defaultStorageEncryptionAlgorithmNotIn
     *
     * @return defaultStorageEncryptionAlgorithmNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDefaultStorageEncryptionAlgorithmNotIn() {
        return defaultStorageEncryptionAlgorithmNotIn;
    }

    public void setDefaultStorageEncryptionAlgorithmNotIn(
            List<String> defaultStorageEncryptionAlgorithmNotIn) {
        this.defaultStorageEncryptionAlgorithmNotIn = defaultStorageEncryptionAlgorithmNotIn;
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_IN);
        return this;
    }

    public StorageClusterConfigWhereInput
            defaultStorageEncryptionAlgorithmNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_IN);
        return this;
    }

    public void setDefaultStorageEncryptionAlgorithmNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_IN);
        }
    }

    public boolean getDefaultStorageEncryptionAlgorithmNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_IN);
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmNotStartsWith(
            String defaultStorageEncryptionAlgorithmNotStartsWith) {

        this.defaultStorageEncryptionAlgorithmNotStartsWith =
                defaultStorageEncryptionAlgorithmNotStartsWith;
        return this;
    }

    /**
     * Get defaultStorageEncryptionAlgorithmNotStartsWith
     *
     * @return defaultStorageEncryptionAlgorithmNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDefaultStorageEncryptionAlgorithmNotStartsWith() {
        return defaultStorageEncryptionAlgorithmNotStartsWith;
    }

    public void setDefaultStorageEncryptionAlgorithmNotStartsWith(
            String defaultStorageEncryptionAlgorithmNotStartsWith) {
        this.defaultStorageEncryptionAlgorithmNotStartsWith =
                defaultStorageEncryptionAlgorithmNotStartsWith;
    }

    public StorageClusterConfigWhereInput
            defaultStorageEncryptionAlgorithmNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_STARTS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput
            defaultStorageEncryptionAlgorithmNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(
                SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_STARTS_WITH);
        return this;
    }

    public void setDefaultStorageEncryptionAlgorithmNotStartsWith_IsExplictlyNull(
            boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(
                    SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(
                    SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_STARTS_WITH);
        }
    }

    public boolean getDefaultStorageEncryptionAlgorithmNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_NOT_STARTS_WITH);
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionAlgorithmStartsWith(
            String defaultStorageEncryptionAlgorithmStartsWith) {

        this.defaultStorageEncryptionAlgorithmStartsWith =
                defaultStorageEncryptionAlgorithmStartsWith;
        return this;
    }

    /**
     * Get defaultStorageEncryptionAlgorithmStartsWith
     *
     * @return defaultStorageEncryptionAlgorithmStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDefaultStorageEncryptionAlgorithmStartsWith() {
        return defaultStorageEncryptionAlgorithmStartsWith;
    }

    public void setDefaultStorageEncryptionAlgorithmStartsWith(
            String defaultStorageEncryptionAlgorithmStartsWith) {
        this.defaultStorageEncryptionAlgorithmStartsWith =
                defaultStorageEncryptionAlgorithmStartsWith;
    }

    public StorageClusterConfigWhereInput
            defaultStorageEncryptionAlgorithmStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_STARTS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput
            defaultStorageEncryptionAlgorithmStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_STARTS_WITH);
        return this;
    }

    public void setDefaultStorageEncryptionAlgorithmStartsWith_IsExplictlyNull(
            boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_STARTS_WITH);
        } else {
            this._isPresent_.remove(
                    SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_STARTS_WITH);
        }
    }

    public boolean getDefaultStorageEncryptionAlgorithmStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_ALGORITHM_STARTS_WITH);
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionNot(
            Boolean defaultStorageEncryptionNot) {

        this.defaultStorageEncryptionNot = defaultStorageEncryptionNot;
        return this;
    }

    /**
     * Get defaultStorageEncryptionNot
     *
     * @return defaultStorageEncryptionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDefaultStorageEncryptionNot() {
        return defaultStorageEncryptionNot;
    }

    public void setDefaultStorageEncryptionNot(Boolean defaultStorageEncryptionNot) {
        this.defaultStorageEncryptionNot = defaultStorageEncryptionNot;
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_NOT);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStorageEncryptionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_NOT);
        return this;
    }

    public void setDefaultStorageEncryptionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_NOT);
        }
    }

    public boolean getDefaultStorageEncryptionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_ENCRYPTION_NOT);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicy(
            VmVolumeElfStoragePolicyType defaultStoragePolicy) {

        this.defaultStoragePolicy = defaultStoragePolicy;
        return this;
    }

    /**
     * Get defaultStoragePolicy
     *
     * @return defaultStoragePolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeElfStoragePolicyType getDefaultStoragePolicy() {
        return defaultStoragePolicy;
    }

    public void setDefaultStoragePolicy(VmVolumeElfStoragePolicyType defaultStoragePolicy) {
        this.defaultStoragePolicy = defaultStoragePolicy;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY);
        return this;
    }

    public void setDefaultStoragePolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY);
        }
    }

    public boolean getDefaultStoragePolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcK(Integer defaultStoragePolicyEcK) {

        this.defaultStoragePolicyEcK = defaultStoragePolicyEcK;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcK
     *
     * @return defaultStoragePolicyEcK
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcK() {
        return defaultStoragePolicyEcK;
    }

    public void setDefaultStoragePolicyEcK(Integer defaultStoragePolicyEcK) {
        this.defaultStoragePolicyEcK = defaultStoragePolicyEcK;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcK_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K);
        return this;
    }

    public void setDefaultStoragePolicyEcK_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K);
        }
    }

    public boolean getDefaultStoragePolicyEcK_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKGt(
            Integer defaultStoragePolicyEcKGt) {

        this.defaultStoragePolicyEcKGt = defaultStoragePolicyEcKGt;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcKGt
     *
     * @return defaultStoragePolicyEcKGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcKGt() {
        return defaultStoragePolicyEcKGt;
    }

    public void setDefaultStoragePolicyEcKGt(Integer defaultStoragePolicyEcKGt) {
        this.defaultStoragePolicyEcKGt = defaultStoragePolicyEcKGt;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GT);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GT);
        return this;
    }

    public void setDefaultStoragePolicyEcKGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GT);
        }
    }

    public boolean getDefaultStoragePolicyEcKGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GT);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKGte(
            Integer defaultStoragePolicyEcKGte) {

        this.defaultStoragePolicyEcKGte = defaultStoragePolicyEcKGte;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcKGte
     *
     * @return defaultStoragePolicyEcKGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcKGte() {
        return defaultStoragePolicyEcKGte;
    }

    public void setDefaultStoragePolicyEcKGte(Integer defaultStoragePolicyEcKGte) {
        this.defaultStoragePolicyEcKGte = defaultStoragePolicyEcKGte;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GTE);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GTE);
        return this;
    }

    public void setDefaultStoragePolicyEcKGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GTE);
        }
    }

    public boolean getDefaultStoragePolicyEcKGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GTE);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKIn(
            List<Integer> defaultStoragePolicyEcKIn) {

        this.defaultStoragePolicyEcKIn = defaultStoragePolicyEcKIn;
        return this;
    }

    public StorageClusterConfigWhereInput addDefaultStoragePolicyEcKInItem(
            Integer defaultStoragePolicyEcKInItem) {
        if (this.defaultStoragePolicyEcKIn == null) {
            this.defaultStoragePolicyEcKIn = new ArrayList<Integer>();
        }
        this.defaultStoragePolicyEcKIn.add(defaultStoragePolicyEcKInItem);
        return this;
    }

    /**
     * Get defaultStoragePolicyEcKIn
     *
     * @return defaultStoragePolicyEcKIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDefaultStoragePolicyEcKIn() {
        return defaultStoragePolicyEcKIn;
    }

    public void setDefaultStoragePolicyEcKIn(List<Integer> defaultStoragePolicyEcKIn) {
        this.defaultStoragePolicyEcKIn = defaultStoragePolicyEcKIn;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_IN);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_IN);
        return this;
    }

    public void setDefaultStoragePolicyEcKIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_IN);
        }
    }

    public boolean getDefaultStoragePolicyEcKIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_IN);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKLt(
            Integer defaultStoragePolicyEcKLt) {

        this.defaultStoragePolicyEcKLt = defaultStoragePolicyEcKLt;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcKLt
     *
     * @return defaultStoragePolicyEcKLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcKLt() {
        return defaultStoragePolicyEcKLt;
    }

    public void setDefaultStoragePolicyEcKLt(Integer defaultStoragePolicyEcKLt) {
        this.defaultStoragePolicyEcKLt = defaultStoragePolicyEcKLt;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LT);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LT);
        return this;
    }

    public void setDefaultStoragePolicyEcKLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LT);
        }
    }

    public boolean getDefaultStoragePolicyEcKLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LT);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKLte(
            Integer defaultStoragePolicyEcKLte) {

        this.defaultStoragePolicyEcKLte = defaultStoragePolicyEcKLte;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcKLte
     *
     * @return defaultStoragePolicyEcKLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcKLte() {
        return defaultStoragePolicyEcKLte;
    }

    public void setDefaultStoragePolicyEcKLte(Integer defaultStoragePolicyEcKLte) {
        this.defaultStoragePolicyEcKLte = defaultStoragePolicyEcKLte;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LTE);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LTE);
        return this;
    }

    public void setDefaultStoragePolicyEcKLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LTE);
        }
    }

    public boolean getDefaultStoragePolicyEcKLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LTE);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKNot(
            Integer defaultStoragePolicyEcKNot) {

        this.defaultStoragePolicyEcKNot = defaultStoragePolicyEcKNot;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcKNot
     *
     * @return defaultStoragePolicyEcKNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcKNot() {
        return defaultStoragePolicyEcKNot;
    }

    public void setDefaultStoragePolicyEcKNot(Integer defaultStoragePolicyEcKNot) {
        this.defaultStoragePolicyEcKNot = defaultStoragePolicyEcKNot;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT);
        return this;
    }

    public void setDefaultStoragePolicyEcKNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT);
        }
    }

    public boolean getDefaultStoragePolicyEcKNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKNotIn(
            List<Integer> defaultStoragePolicyEcKNotIn) {

        this.defaultStoragePolicyEcKNotIn = defaultStoragePolicyEcKNotIn;
        return this;
    }

    public StorageClusterConfigWhereInput addDefaultStoragePolicyEcKNotInItem(
            Integer defaultStoragePolicyEcKNotInItem) {
        if (this.defaultStoragePolicyEcKNotIn == null) {
            this.defaultStoragePolicyEcKNotIn = new ArrayList<Integer>();
        }
        this.defaultStoragePolicyEcKNotIn.add(defaultStoragePolicyEcKNotInItem);
        return this;
    }

    /**
     * Get defaultStoragePolicyEcKNotIn
     *
     * @return defaultStoragePolicyEcKNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDefaultStoragePolicyEcKNotIn() {
        return defaultStoragePolicyEcKNotIn;
    }

    public void setDefaultStoragePolicyEcKNotIn(List<Integer> defaultStoragePolicyEcKNotIn) {
        this.defaultStoragePolicyEcKNotIn = defaultStoragePolicyEcKNotIn;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT_IN);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcKNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT_IN);
        return this;
    }

    public void setDefaultStoragePolicyEcKNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT_IN);
        }
    }

    public boolean getDefaultStoragePolicyEcKNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT_IN);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcM(Integer defaultStoragePolicyEcM) {

        this.defaultStoragePolicyEcM = defaultStoragePolicyEcM;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcM
     *
     * @return defaultStoragePolicyEcM
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcM() {
        return defaultStoragePolicyEcM;
    }

    public void setDefaultStoragePolicyEcM(Integer defaultStoragePolicyEcM) {
        this.defaultStoragePolicyEcM = defaultStoragePolicyEcM;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcM_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M);
        return this;
    }

    public void setDefaultStoragePolicyEcM_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M);
        }
    }

    public boolean getDefaultStoragePolicyEcM_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMGt(
            Integer defaultStoragePolicyEcMGt) {

        this.defaultStoragePolicyEcMGt = defaultStoragePolicyEcMGt;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcMGt
     *
     * @return defaultStoragePolicyEcMGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcMGt() {
        return defaultStoragePolicyEcMGt;
    }

    public void setDefaultStoragePolicyEcMGt(Integer defaultStoragePolicyEcMGt) {
        this.defaultStoragePolicyEcMGt = defaultStoragePolicyEcMGt;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GT);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GT);
        return this;
    }

    public void setDefaultStoragePolicyEcMGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GT);
        }
    }

    public boolean getDefaultStoragePolicyEcMGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GT);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMGte(
            Integer defaultStoragePolicyEcMGte) {

        this.defaultStoragePolicyEcMGte = defaultStoragePolicyEcMGte;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcMGte
     *
     * @return defaultStoragePolicyEcMGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcMGte() {
        return defaultStoragePolicyEcMGte;
    }

    public void setDefaultStoragePolicyEcMGte(Integer defaultStoragePolicyEcMGte) {
        this.defaultStoragePolicyEcMGte = defaultStoragePolicyEcMGte;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GTE);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GTE);
        return this;
    }

    public void setDefaultStoragePolicyEcMGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GTE);
        }
    }

    public boolean getDefaultStoragePolicyEcMGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GTE);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMIn(
            List<Integer> defaultStoragePolicyEcMIn) {

        this.defaultStoragePolicyEcMIn = defaultStoragePolicyEcMIn;
        return this;
    }

    public StorageClusterConfigWhereInput addDefaultStoragePolicyEcMInItem(
            Integer defaultStoragePolicyEcMInItem) {
        if (this.defaultStoragePolicyEcMIn == null) {
            this.defaultStoragePolicyEcMIn = new ArrayList<Integer>();
        }
        this.defaultStoragePolicyEcMIn.add(defaultStoragePolicyEcMInItem);
        return this;
    }

    /**
     * Get defaultStoragePolicyEcMIn
     *
     * @return defaultStoragePolicyEcMIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDefaultStoragePolicyEcMIn() {
        return defaultStoragePolicyEcMIn;
    }

    public void setDefaultStoragePolicyEcMIn(List<Integer> defaultStoragePolicyEcMIn) {
        this.defaultStoragePolicyEcMIn = defaultStoragePolicyEcMIn;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_IN);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_IN);
        return this;
    }

    public void setDefaultStoragePolicyEcMIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_IN);
        }
    }

    public boolean getDefaultStoragePolicyEcMIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_IN);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMLt(
            Integer defaultStoragePolicyEcMLt) {

        this.defaultStoragePolicyEcMLt = defaultStoragePolicyEcMLt;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcMLt
     *
     * @return defaultStoragePolicyEcMLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcMLt() {
        return defaultStoragePolicyEcMLt;
    }

    public void setDefaultStoragePolicyEcMLt(Integer defaultStoragePolicyEcMLt) {
        this.defaultStoragePolicyEcMLt = defaultStoragePolicyEcMLt;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LT);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LT);
        return this;
    }

    public void setDefaultStoragePolicyEcMLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LT);
        }
    }

    public boolean getDefaultStoragePolicyEcMLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LT);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMLte(
            Integer defaultStoragePolicyEcMLte) {

        this.defaultStoragePolicyEcMLte = defaultStoragePolicyEcMLte;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcMLte
     *
     * @return defaultStoragePolicyEcMLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcMLte() {
        return defaultStoragePolicyEcMLte;
    }

    public void setDefaultStoragePolicyEcMLte(Integer defaultStoragePolicyEcMLte) {
        this.defaultStoragePolicyEcMLte = defaultStoragePolicyEcMLte;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LTE);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LTE);
        return this;
    }

    public void setDefaultStoragePolicyEcMLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LTE);
        }
    }

    public boolean getDefaultStoragePolicyEcMLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LTE);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMNot(
            Integer defaultStoragePolicyEcMNot) {

        this.defaultStoragePolicyEcMNot = defaultStoragePolicyEcMNot;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcMNot
     *
     * @return defaultStoragePolicyEcMNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcMNot() {
        return defaultStoragePolicyEcMNot;
    }

    public void setDefaultStoragePolicyEcMNot(Integer defaultStoragePolicyEcMNot) {
        this.defaultStoragePolicyEcMNot = defaultStoragePolicyEcMNot;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT);
        return this;
    }

    public void setDefaultStoragePolicyEcMNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT);
        }
    }

    public boolean getDefaultStoragePolicyEcMNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMNotIn(
            List<Integer> defaultStoragePolicyEcMNotIn) {

        this.defaultStoragePolicyEcMNotIn = defaultStoragePolicyEcMNotIn;
        return this;
    }

    public StorageClusterConfigWhereInput addDefaultStoragePolicyEcMNotInItem(
            Integer defaultStoragePolicyEcMNotInItem) {
        if (this.defaultStoragePolicyEcMNotIn == null) {
            this.defaultStoragePolicyEcMNotIn = new ArrayList<Integer>();
        }
        this.defaultStoragePolicyEcMNotIn.add(defaultStoragePolicyEcMNotInItem);
        return this;
    }

    /**
     * Get defaultStoragePolicyEcMNotIn
     *
     * @return defaultStoragePolicyEcMNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDefaultStoragePolicyEcMNotIn() {
        return defaultStoragePolicyEcMNotIn;
    }

    public void setDefaultStoragePolicyEcMNotIn(List<Integer> defaultStoragePolicyEcMNotIn) {
        this.defaultStoragePolicyEcMNotIn = defaultStoragePolicyEcMNotIn;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT_IN);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyEcMNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT_IN);
        return this;
    }

    public void setDefaultStoragePolicyEcMNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT_IN);
        }
    }

    public boolean getDefaultStoragePolicyEcMNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT_IN);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyIn(
            List<VmVolumeElfStoragePolicyType> defaultStoragePolicyIn) {

        this.defaultStoragePolicyIn = defaultStoragePolicyIn;
        return this;
    }

    public StorageClusterConfigWhereInput addDefaultStoragePolicyInItem(
            VmVolumeElfStoragePolicyType defaultStoragePolicyInItem) {
        if (this.defaultStoragePolicyIn == null) {
            this.defaultStoragePolicyIn = new ArrayList<VmVolumeElfStoragePolicyType>();
        }
        this.defaultStoragePolicyIn.add(defaultStoragePolicyInItem);
        return this;
    }

    /**
     * Get defaultStoragePolicyIn
     *
     * @return defaultStoragePolicyIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmVolumeElfStoragePolicyType> getDefaultStoragePolicyIn() {
        return defaultStoragePolicyIn;
    }

    public void setDefaultStoragePolicyIn(
            List<VmVolumeElfStoragePolicyType> defaultStoragePolicyIn) {
        this.defaultStoragePolicyIn = defaultStoragePolicyIn;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_IN);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_IN);
        return this;
    }

    public void setDefaultStoragePolicyIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_IN);
        }
    }

    public boolean getDefaultStoragePolicyIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_IN);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyNot(
            VmVolumeElfStoragePolicyType defaultStoragePolicyNot) {

        this.defaultStoragePolicyNot = defaultStoragePolicyNot;
        return this;
    }

    /**
     * Get defaultStoragePolicyNot
     *
     * @return defaultStoragePolicyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeElfStoragePolicyType getDefaultStoragePolicyNot() {
        return defaultStoragePolicyNot;
    }

    public void setDefaultStoragePolicyNot(VmVolumeElfStoragePolicyType defaultStoragePolicyNot) {
        this.defaultStoragePolicyNot = defaultStoragePolicyNot;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT);
        return this;
    }

    public void setDefaultStoragePolicyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT);
        }
    }

    public boolean getDefaultStoragePolicyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyNotIn(
            List<VmVolumeElfStoragePolicyType> defaultStoragePolicyNotIn) {

        this.defaultStoragePolicyNotIn = defaultStoragePolicyNotIn;
        return this;
    }

    public StorageClusterConfigWhereInput addDefaultStoragePolicyNotInItem(
            VmVolumeElfStoragePolicyType defaultStoragePolicyNotInItem) {
        if (this.defaultStoragePolicyNotIn == null) {
            this.defaultStoragePolicyNotIn = new ArrayList<VmVolumeElfStoragePolicyType>();
        }
        this.defaultStoragePolicyNotIn.add(defaultStoragePolicyNotInItem);
        return this;
    }

    /**
     * Get defaultStoragePolicyNotIn
     *
     * @return defaultStoragePolicyNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmVolumeElfStoragePolicyType> getDefaultStoragePolicyNotIn() {
        return defaultStoragePolicyNotIn;
    }

    public void setDefaultStoragePolicyNotIn(
            List<VmVolumeElfStoragePolicyType> defaultStoragePolicyNotIn) {
        this.defaultStoragePolicyNotIn = defaultStoragePolicyNotIn;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT_IN);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT_IN);
        return this;
    }

    public void setDefaultStoragePolicyNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT_IN);
        }
    }

    public boolean getDefaultStoragePolicyNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT_IN);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNum(
            Integer defaultStoragePolicyReplicaNum) {

        this.defaultStoragePolicyReplicaNum = defaultStoragePolicyReplicaNum;
        return this;
    }

    /**
     * Get defaultStoragePolicyReplicaNum
     *
     * @return defaultStoragePolicyReplicaNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyReplicaNum() {
        return defaultStoragePolicyReplicaNum;
    }

    public void setDefaultStoragePolicyReplicaNum(Integer defaultStoragePolicyReplicaNum) {
        this.defaultStoragePolicyReplicaNum = defaultStoragePolicyReplicaNum;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM);
        return this;
    }

    public void setDefaultStoragePolicyReplicaNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM);
        }
    }

    public boolean getDefaultStoragePolicyReplicaNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumGt(
            Integer defaultStoragePolicyReplicaNumGt) {

        this.defaultStoragePolicyReplicaNumGt = defaultStoragePolicyReplicaNumGt;
        return this;
    }

    /**
     * Get defaultStoragePolicyReplicaNumGt
     *
     * @return defaultStoragePolicyReplicaNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyReplicaNumGt() {
        return defaultStoragePolicyReplicaNumGt;
    }

    public void setDefaultStoragePolicyReplicaNumGt(Integer defaultStoragePolicyReplicaNumGt) {
        this.defaultStoragePolicyReplicaNumGt = defaultStoragePolicyReplicaNumGt;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GT);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GT);
        return this;
    }

    public void setDefaultStoragePolicyReplicaNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GT);
        }
    }

    public boolean getDefaultStoragePolicyReplicaNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GT);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumGte(
            Integer defaultStoragePolicyReplicaNumGte) {

        this.defaultStoragePolicyReplicaNumGte = defaultStoragePolicyReplicaNumGte;
        return this;
    }

    /**
     * Get defaultStoragePolicyReplicaNumGte
     *
     * @return defaultStoragePolicyReplicaNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyReplicaNumGte() {
        return defaultStoragePolicyReplicaNumGte;
    }

    public void setDefaultStoragePolicyReplicaNumGte(Integer defaultStoragePolicyReplicaNumGte) {
        this.defaultStoragePolicyReplicaNumGte = defaultStoragePolicyReplicaNumGte;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GTE);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GTE);
        return this;
    }

    public void setDefaultStoragePolicyReplicaNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GTE);
        }
    }

    public boolean getDefaultStoragePolicyReplicaNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GTE);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumIn(
            List<Integer> defaultStoragePolicyReplicaNumIn) {

        this.defaultStoragePolicyReplicaNumIn = defaultStoragePolicyReplicaNumIn;
        return this;
    }

    public StorageClusterConfigWhereInput addDefaultStoragePolicyReplicaNumInItem(
            Integer defaultStoragePolicyReplicaNumInItem) {
        if (this.defaultStoragePolicyReplicaNumIn == null) {
            this.defaultStoragePolicyReplicaNumIn = new ArrayList<Integer>();
        }
        this.defaultStoragePolicyReplicaNumIn.add(defaultStoragePolicyReplicaNumInItem);
        return this;
    }

    /**
     * Get defaultStoragePolicyReplicaNumIn
     *
     * @return defaultStoragePolicyReplicaNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDefaultStoragePolicyReplicaNumIn() {
        return defaultStoragePolicyReplicaNumIn;
    }

    public void setDefaultStoragePolicyReplicaNumIn(
            List<Integer> defaultStoragePolicyReplicaNumIn) {
        this.defaultStoragePolicyReplicaNumIn = defaultStoragePolicyReplicaNumIn;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_IN);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_IN);
        return this;
    }

    public void setDefaultStoragePolicyReplicaNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_IN);
        }
    }

    public boolean getDefaultStoragePolicyReplicaNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_IN);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumLt(
            Integer defaultStoragePolicyReplicaNumLt) {

        this.defaultStoragePolicyReplicaNumLt = defaultStoragePolicyReplicaNumLt;
        return this;
    }

    /**
     * Get defaultStoragePolicyReplicaNumLt
     *
     * @return defaultStoragePolicyReplicaNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyReplicaNumLt() {
        return defaultStoragePolicyReplicaNumLt;
    }

    public void setDefaultStoragePolicyReplicaNumLt(Integer defaultStoragePolicyReplicaNumLt) {
        this.defaultStoragePolicyReplicaNumLt = defaultStoragePolicyReplicaNumLt;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LT);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LT);
        return this;
    }

    public void setDefaultStoragePolicyReplicaNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LT);
        }
    }

    public boolean getDefaultStoragePolicyReplicaNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LT);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumLte(
            Integer defaultStoragePolicyReplicaNumLte) {

        this.defaultStoragePolicyReplicaNumLte = defaultStoragePolicyReplicaNumLte;
        return this;
    }

    /**
     * Get defaultStoragePolicyReplicaNumLte
     *
     * @return defaultStoragePolicyReplicaNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyReplicaNumLte() {
        return defaultStoragePolicyReplicaNumLte;
    }

    public void setDefaultStoragePolicyReplicaNumLte(Integer defaultStoragePolicyReplicaNumLte) {
        this.defaultStoragePolicyReplicaNumLte = defaultStoragePolicyReplicaNumLte;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LTE);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LTE);
        return this;
    }

    public void setDefaultStoragePolicyReplicaNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LTE);
        }
    }

    public boolean getDefaultStoragePolicyReplicaNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LTE);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumNot(
            Integer defaultStoragePolicyReplicaNumNot) {

        this.defaultStoragePolicyReplicaNumNot = defaultStoragePolicyReplicaNumNot;
        return this;
    }

    /**
     * Get defaultStoragePolicyReplicaNumNot
     *
     * @return defaultStoragePolicyReplicaNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyReplicaNumNot() {
        return defaultStoragePolicyReplicaNumNot;
    }

    public void setDefaultStoragePolicyReplicaNumNot(Integer defaultStoragePolicyReplicaNumNot) {
        this.defaultStoragePolicyReplicaNumNot = defaultStoragePolicyReplicaNumNot;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT);
        return this;
    }

    public void setDefaultStoragePolicyReplicaNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT);
        }
    }

    public boolean getDefaultStoragePolicyReplicaNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumNotIn(
            List<Integer> defaultStoragePolicyReplicaNumNotIn) {

        this.defaultStoragePolicyReplicaNumNotIn = defaultStoragePolicyReplicaNumNotIn;
        return this;
    }

    public StorageClusterConfigWhereInput addDefaultStoragePolicyReplicaNumNotInItem(
            Integer defaultStoragePolicyReplicaNumNotInItem) {
        if (this.defaultStoragePolicyReplicaNumNotIn == null) {
            this.defaultStoragePolicyReplicaNumNotIn = new ArrayList<Integer>();
        }
        this.defaultStoragePolicyReplicaNumNotIn.add(defaultStoragePolicyReplicaNumNotInItem);
        return this;
    }

    /**
     * Get defaultStoragePolicyReplicaNumNotIn
     *
     * @return defaultStoragePolicyReplicaNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDefaultStoragePolicyReplicaNumNotIn() {
        return defaultStoragePolicyReplicaNumNotIn;
    }

    public void setDefaultStoragePolicyReplicaNumNotIn(
            List<Integer> defaultStoragePolicyReplicaNumNotIn) {
        this.defaultStoragePolicyReplicaNumNotIn = defaultStoragePolicyReplicaNumNotIn;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT_IN);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyReplicaNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT_IN);
        return this;
    }

    public void setDefaultStoragePolicyReplicaNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT_IN);
        }
    }

    public boolean getDefaultStoragePolicyReplicaNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT_IN);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNum(
            Integer defaultStoragePolicyStripeNum) {

        this.defaultStoragePolicyStripeNum = defaultStoragePolicyStripeNum;
        return this;
    }

    /**
     * Get defaultStoragePolicyStripeNum
     *
     * @return defaultStoragePolicyStripeNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyStripeNum() {
        return defaultStoragePolicyStripeNum;
    }

    public void setDefaultStoragePolicyStripeNum(Integer defaultStoragePolicyStripeNum) {
        this.defaultStoragePolicyStripeNum = defaultStoragePolicyStripeNum;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM);
        return this;
    }

    public void setDefaultStoragePolicyStripeNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM);
        }
    }

    public boolean getDefaultStoragePolicyStripeNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumGt(
            Integer defaultStoragePolicyStripeNumGt) {

        this.defaultStoragePolicyStripeNumGt = defaultStoragePolicyStripeNumGt;
        return this;
    }

    /**
     * Get defaultStoragePolicyStripeNumGt
     *
     * @return defaultStoragePolicyStripeNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyStripeNumGt() {
        return defaultStoragePolicyStripeNumGt;
    }

    public void setDefaultStoragePolicyStripeNumGt(Integer defaultStoragePolicyStripeNumGt) {
        this.defaultStoragePolicyStripeNumGt = defaultStoragePolicyStripeNumGt;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GT);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GT);
        return this;
    }

    public void setDefaultStoragePolicyStripeNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GT);
        }
    }

    public boolean getDefaultStoragePolicyStripeNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GT);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumGte(
            Integer defaultStoragePolicyStripeNumGte) {

        this.defaultStoragePolicyStripeNumGte = defaultStoragePolicyStripeNumGte;
        return this;
    }

    /**
     * Get defaultStoragePolicyStripeNumGte
     *
     * @return defaultStoragePolicyStripeNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyStripeNumGte() {
        return defaultStoragePolicyStripeNumGte;
    }

    public void setDefaultStoragePolicyStripeNumGte(Integer defaultStoragePolicyStripeNumGte) {
        this.defaultStoragePolicyStripeNumGte = defaultStoragePolicyStripeNumGte;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GTE);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GTE);
        return this;
    }

    public void setDefaultStoragePolicyStripeNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GTE);
        }
    }

    public boolean getDefaultStoragePolicyStripeNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GTE);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumIn(
            List<Integer> defaultStoragePolicyStripeNumIn) {

        this.defaultStoragePolicyStripeNumIn = defaultStoragePolicyStripeNumIn;
        return this;
    }

    public StorageClusterConfigWhereInput addDefaultStoragePolicyStripeNumInItem(
            Integer defaultStoragePolicyStripeNumInItem) {
        if (this.defaultStoragePolicyStripeNumIn == null) {
            this.defaultStoragePolicyStripeNumIn = new ArrayList<Integer>();
        }
        this.defaultStoragePolicyStripeNumIn.add(defaultStoragePolicyStripeNumInItem);
        return this;
    }

    /**
     * Get defaultStoragePolicyStripeNumIn
     *
     * @return defaultStoragePolicyStripeNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDefaultStoragePolicyStripeNumIn() {
        return defaultStoragePolicyStripeNumIn;
    }

    public void setDefaultStoragePolicyStripeNumIn(List<Integer> defaultStoragePolicyStripeNumIn) {
        this.defaultStoragePolicyStripeNumIn = defaultStoragePolicyStripeNumIn;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_IN);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_IN);
        return this;
    }

    public void setDefaultStoragePolicyStripeNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_IN);
        }
    }

    public boolean getDefaultStoragePolicyStripeNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_IN);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumLt(
            Integer defaultStoragePolicyStripeNumLt) {

        this.defaultStoragePolicyStripeNumLt = defaultStoragePolicyStripeNumLt;
        return this;
    }

    /**
     * Get defaultStoragePolicyStripeNumLt
     *
     * @return defaultStoragePolicyStripeNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyStripeNumLt() {
        return defaultStoragePolicyStripeNumLt;
    }

    public void setDefaultStoragePolicyStripeNumLt(Integer defaultStoragePolicyStripeNumLt) {
        this.defaultStoragePolicyStripeNumLt = defaultStoragePolicyStripeNumLt;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LT);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LT);
        return this;
    }

    public void setDefaultStoragePolicyStripeNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LT);
        }
    }

    public boolean getDefaultStoragePolicyStripeNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LT);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumLte(
            Integer defaultStoragePolicyStripeNumLte) {

        this.defaultStoragePolicyStripeNumLte = defaultStoragePolicyStripeNumLte;
        return this;
    }

    /**
     * Get defaultStoragePolicyStripeNumLte
     *
     * @return defaultStoragePolicyStripeNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyStripeNumLte() {
        return defaultStoragePolicyStripeNumLte;
    }

    public void setDefaultStoragePolicyStripeNumLte(Integer defaultStoragePolicyStripeNumLte) {
        this.defaultStoragePolicyStripeNumLte = defaultStoragePolicyStripeNumLte;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LTE);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LTE);
        return this;
    }

    public void setDefaultStoragePolicyStripeNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LTE);
        }
    }

    public boolean getDefaultStoragePolicyStripeNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LTE);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumNot(
            Integer defaultStoragePolicyStripeNumNot) {

        this.defaultStoragePolicyStripeNumNot = defaultStoragePolicyStripeNumNot;
        return this;
    }

    /**
     * Get defaultStoragePolicyStripeNumNot
     *
     * @return defaultStoragePolicyStripeNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyStripeNumNot() {
        return defaultStoragePolicyStripeNumNot;
    }

    public void setDefaultStoragePolicyStripeNumNot(Integer defaultStoragePolicyStripeNumNot) {
        this.defaultStoragePolicyStripeNumNot = defaultStoragePolicyStripeNumNot;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT);
        return this;
    }

    public void setDefaultStoragePolicyStripeNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT);
        }
    }

    public boolean getDefaultStoragePolicyStripeNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumNotIn(
            List<Integer> defaultStoragePolicyStripeNumNotIn) {

        this.defaultStoragePolicyStripeNumNotIn = defaultStoragePolicyStripeNumNotIn;
        return this;
    }

    public StorageClusterConfigWhereInput addDefaultStoragePolicyStripeNumNotInItem(
            Integer defaultStoragePolicyStripeNumNotInItem) {
        if (this.defaultStoragePolicyStripeNumNotIn == null) {
            this.defaultStoragePolicyStripeNumNotIn = new ArrayList<Integer>();
        }
        this.defaultStoragePolicyStripeNumNotIn.add(defaultStoragePolicyStripeNumNotInItem);
        return this;
    }

    /**
     * Get defaultStoragePolicyStripeNumNotIn
     *
     * @return defaultStoragePolicyStripeNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDefaultStoragePolicyStripeNumNotIn() {
        return defaultStoragePolicyStripeNumNotIn;
    }

    public void setDefaultStoragePolicyStripeNumNotIn(
            List<Integer> defaultStoragePolicyStripeNumNotIn) {
        this.defaultStoragePolicyStripeNumNotIn = defaultStoragePolicyStripeNumNotIn;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT_IN);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyStripeNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT_IN);
        return this;
    }

    public void setDefaultStoragePolicyStripeNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT_IN);
        }
    }

    public boolean getDefaultStoragePolicyStripeNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT_IN);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyThinProvision(
            Boolean defaultStoragePolicyThinProvision) {

        this.defaultStoragePolicyThinProvision = defaultStoragePolicyThinProvision;
        return this;
    }

    /**
     * Get defaultStoragePolicyThinProvision
     *
     * @return defaultStoragePolicyThinProvision
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDefaultStoragePolicyThinProvision() {
        return defaultStoragePolicyThinProvision;
    }

    public void setDefaultStoragePolicyThinProvision(Boolean defaultStoragePolicyThinProvision) {
        this.defaultStoragePolicyThinProvision = defaultStoragePolicyThinProvision;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyThinProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyThinProvision_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION);
        return this;
    }

    public void setDefaultStoragePolicyThinProvision_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION);
        }
    }

    public boolean getDefaultStoragePolicyThinProvision_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION);
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyThinProvisionNot(
            Boolean defaultStoragePolicyThinProvisionNot) {

        this.defaultStoragePolicyThinProvisionNot = defaultStoragePolicyThinProvisionNot;
        return this;
    }

    /**
     * Get defaultStoragePolicyThinProvisionNot
     *
     * @return defaultStoragePolicyThinProvisionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDefaultStoragePolicyThinProvisionNot() {
        return defaultStoragePolicyThinProvisionNot;
    }

    public void setDefaultStoragePolicyThinProvisionNot(
            Boolean defaultStoragePolicyThinProvisionNot) {
        this.defaultStoragePolicyThinProvisionNot = defaultStoragePolicyThinProvisionNot;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyThinProvisionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION_NOT);
        return this;
    }

    public StorageClusterConfigWhereInput defaultStoragePolicyThinProvisionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION_NOT);
        return this;
    }

    public void setDefaultStoragePolicyThinProvisionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION_NOT);
        }
    }

    public boolean getDefaultStoragePolicyThinProvisionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION_NOT);
    }

    public StorageClusterConfigWhereInput description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StorageClusterConfigWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public StorageClusterConfigWhereInput description_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public void setDescription_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        }
    }

    public boolean getDescription_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION);
    }

    public StorageClusterConfigWhereInput descriptionContains(String descriptionContains) {

        this.descriptionContains = descriptionContains;
        return this;
    }

    /**
     * Get descriptionContains
     *
     * @return descriptionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionContains() {
        return descriptionContains;
    }

    public void setDescriptionContains(String descriptionContains) {
        this.descriptionContains = descriptionContains;
    }

    public StorageClusterConfigWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public StorageClusterConfigWhereInput descriptionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public void setDescriptionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        }
    }

    public boolean getDescriptionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
    }

    public StorageClusterConfigWhereInput descriptionEndsWith(String descriptionEndsWith) {

        this.descriptionEndsWith = descriptionEndsWith;
        return this;
    }

    /**
     * Get descriptionEndsWith
     *
     * @return descriptionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionEndsWith() {
        return descriptionEndsWith;
    }

    public void setDescriptionEndsWith(String descriptionEndsWith) {
        this.descriptionEndsWith = descriptionEndsWith;
    }

    public StorageClusterConfigWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput descriptionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public void setDescriptionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        }
    }

    public boolean getDescriptionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
    }

    public StorageClusterConfigWhereInput descriptionGt(String descriptionGt) {

        this.descriptionGt = descriptionGt;
        return this;
    }

    /**
     * Get descriptionGt
     *
     * @return descriptionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionGt() {
        return descriptionGt;
    }

    public void setDescriptionGt(String descriptionGt) {
        this.descriptionGt = descriptionGt;
    }

    public StorageClusterConfigWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public StorageClusterConfigWhereInput descriptionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public void setDescriptionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GT);
        }
    }

    public boolean getDescriptionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_GT);
    }

    public StorageClusterConfigWhereInput descriptionGte(String descriptionGte) {

        this.descriptionGte = descriptionGte;
        return this;
    }

    /**
     * Get descriptionGte
     *
     * @return descriptionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionGte() {
        return descriptionGte;
    }

    public void setDescriptionGte(String descriptionGte) {
        this.descriptionGte = descriptionGte;
    }

    public StorageClusterConfigWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public StorageClusterConfigWhereInput descriptionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public void setDescriptionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GTE);
        }
    }

    public boolean getDescriptionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_GTE);
    }

    public StorageClusterConfigWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public StorageClusterConfigWhereInput addDescriptionInItem(String descriptionInItem) {
        if (this.descriptionIn == null) {
            this.descriptionIn = new ArrayList<String>();
        }
        this.descriptionIn.add(descriptionInItem);
        return this;
    }

    /**
     * Get descriptionIn
     *
     * @return descriptionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDescriptionIn() {
        return descriptionIn;
    }

    public void setDescriptionIn(List<String> descriptionIn) {
        this.descriptionIn = descriptionIn;
    }

    public StorageClusterConfigWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public StorageClusterConfigWhereInput descriptionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public void setDescriptionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_IN);
        }
    }

    public boolean getDescriptionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_IN);
    }

    public StorageClusterConfigWhereInput descriptionLt(String descriptionLt) {

        this.descriptionLt = descriptionLt;
        return this;
    }

    /**
     * Get descriptionLt
     *
     * @return descriptionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionLt() {
        return descriptionLt;
    }

    public void setDescriptionLt(String descriptionLt) {
        this.descriptionLt = descriptionLt;
    }

    public StorageClusterConfigWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public StorageClusterConfigWhereInput descriptionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public void setDescriptionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LT);
        }
    }

    public boolean getDescriptionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_LT);
    }

    public StorageClusterConfigWhereInput descriptionLte(String descriptionLte) {

        this.descriptionLte = descriptionLte;
        return this;
    }

    /**
     * Get descriptionLte
     *
     * @return descriptionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionLte() {
        return descriptionLte;
    }

    public void setDescriptionLte(String descriptionLte) {
        this.descriptionLte = descriptionLte;
    }

    public StorageClusterConfigWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public StorageClusterConfigWhereInput descriptionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public void setDescriptionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LTE);
        }
    }

    public boolean getDescriptionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_LTE);
    }

    public StorageClusterConfigWhereInput descriptionNot(String descriptionNot) {

        this.descriptionNot = descriptionNot;
        return this;
    }

    /**
     * Get descriptionNot
     *
     * @return descriptionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNot() {
        return descriptionNot;
    }

    public void setDescriptionNot(String descriptionNot) {
        this.descriptionNot = descriptionNot;
    }

    public StorageClusterConfigWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public StorageClusterConfigWhereInput descriptionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public void setDescriptionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT);
        }
    }

    public boolean getDescriptionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT);
    }

    public StorageClusterConfigWhereInput descriptionNotContains(String descriptionNotContains) {

        this.descriptionNotContains = descriptionNotContains;
        return this;
    }

    /**
     * Get descriptionNotContains
     *
     * @return descriptionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotContains() {
        return descriptionNotContains;
    }

    public void setDescriptionNotContains(String descriptionNotContains) {
        this.descriptionNotContains = descriptionNotContains;
    }

    public StorageClusterConfigWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public StorageClusterConfigWhereInput descriptionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public void setDescriptionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        }
    }

    public boolean getDescriptionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
    }

    public StorageClusterConfigWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

        this.descriptionNotEndsWith = descriptionNotEndsWith;
        return this;
    }

    /**
     * Get descriptionNotEndsWith
     *
     * @return descriptionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotEndsWith() {
        return descriptionNotEndsWith;
    }

    public void setDescriptionNotEndsWith(String descriptionNotEndsWith) {
        this.descriptionNotEndsWith = descriptionNotEndsWith;
    }

    public StorageClusterConfigWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public void setDescriptionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        }
    }

    public boolean getDescriptionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
    }

    public StorageClusterConfigWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public StorageClusterConfigWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
        if (this.descriptionNotIn == null) {
            this.descriptionNotIn = new ArrayList<String>();
        }
        this.descriptionNotIn.add(descriptionNotInItem);
        return this;
    }

    /**
     * Get descriptionNotIn
     *
     * @return descriptionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDescriptionNotIn() {
        return descriptionNotIn;
    }

    public void setDescriptionNotIn(List<String> descriptionNotIn) {
        this.descriptionNotIn = descriptionNotIn;
    }

    public StorageClusterConfigWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public StorageClusterConfigWhereInput descriptionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public void setDescriptionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        }
    }

    public boolean getDescriptionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
    }

    public StorageClusterConfigWhereInput descriptionNotStartsWith(
            String descriptionNotStartsWith) {

        this.descriptionNotStartsWith = descriptionNotStartsWith;
        return this;
    }

    /**
     * Get descriptionNotStartsWith
     *
     * @return descriptionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotStartsWith() {
        return descriptionNotStartsWith;
    }

    public void setDescriptionNotStartsWith(String descriptionNotStartsWith) {
        this.descriptionNotStartsWith = descriptionNotStartsWith;
    }

    public StorageClusterConfigWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public void setDescriptionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        }
    }

    public boolean getDescriptionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
    }

    public StorageClusterConfigWhereInput descriptionStartsWith(String descriptionStartsWith) {

        this.descriptionStartsWith = descriptionStartsWith;
        return this;
    }

    /**
     * Get descriptionStartsWith
     *
     * @return descriptionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionStartsWith() {
        return descriptionStartsWith;
    }

    public void setDescriptionStartsWith(String descriptionStartsWith) {
        this.descriptionStartsWith = descriptionStartsWith;
    }

    public StorageClusterConfigWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput descriptionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public void setDescriptionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        }
    }

    public boolean getDescriptionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
    }

    public StorageClusterConfigWhereInput errorState(StorageClusterErrorState errorState) {

        this.errorState = errorState;
        return this;
    }

    /**
     * Get errorState
     *
     * @return errorState
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageClusterErrorState getErrorState() {
        return errorState;
    }

    public void setErrorState(StorageClusterErrorState errorState) {
        this.errorState = errorState;
    }

    public StorageClusterConfigWhereInput errorState_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_STATE);
        return this;
    }

    public StorageClusterConfigWhereInput errorState_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_STATE);
        return this;
    }

    public void setErrorState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_STATE);
        }
    }

    public boolean getErrorState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_STATE);
    }

    public StorageClusterConfigWhereInput errorStateIn(
            List<StorageClusterErrorState> errorStateIn) {

        this.errorStateIn = errorStateIn;
        return this;
    }

    public StorageClusterConfigWhereInput addErrorStateInItem(
            StorageClusterErrorState errorStateInItem) {
        if (this.errorStateIn == null) {
            this.errorStateIn = new ArrayList<StorageClusterErrorState>();
        }
        this.errorStateIn.add(errorStateInItem);
        return this;
    }

    /**
     * Get errorStateIn
     *
     * @return errorStateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<StorageClusterErrorState> getErrorStateIn() {
        return errorStateIn;
    }

    public void setErrorStateIn(List<StorageClusterErrorState> errorStateIn) {
        this.errorStateIn = errorStateIn;
    }

    public StorageClusterConfigWhereInput errorStateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_STATE_IN);
        return this;
    }

    public StorageClusterConfigWhereInput errorStateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_STATE_IN);
        return this;
    }

    public void setErrorStateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_STATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_STATE_IN);
        }
    }

    public boolean getErrorStateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_STATE_IN);
    }

    public StorageClusterConfigWhereInput errorStateNot(StorageClusterErrorState errorStateNot) {

        this.errorStateNot = errorStateNot;
        return this;
    }

    /**
     * Get errorStateNot
     *
     * @return errorStateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageClusterErrorState getErrorStateNot() {
        return errorStateNot;
    }

    public void setErrorStateNot(StorageClusterErrorState errorStateNot) {
        this.errorStateNot = errorStateNot;
    }

    public StorageClusterConfigWhereInput errorStateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_STATE_NOT);
        return this;
    }

    public StorageClusterConfigWhereInput errorStateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_STATE_NOT);
        return this;
    }

    public void setErrorStateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_STATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_STATE_NOT);
        }
    }

    public boolean getErrorStateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_STATE_NOT);
    }

    public StorageClusterConfigWhereInput errorStateNotIn(
            List<StorageClusterErrorState> errorStateNotIn) {

        this.errorStateNotIn = errorStateNotIn;
        return this;
    }

    public StorageClusterConfigWhereInput addErrorStateNotInItem(
            StorageClusterErrorState errorStateNotInItem) {
        if (this.errorStateNotIn == null) {
            this.errorStateNotIn = new ArrayList<StorageClusterErrorState>();
        }
        this.errorStateNotIn.add(errorStateNotInItem);
        return this;
    }

    /**
     * Get errorStateNotIn
     *
     * @return errorStateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<StorageClusterErrorState> getErrorStateNotIn() {
        return errorStateNotIn;
    }

    public void setErrorStateNotIn(List<StorageClusterErrorState> errorStateNotIn) {
        this.errorStateNotIn = errorStateNotIn;
    }

    public StorageClusterConfigWhereInput errorStateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_STATE_NOT_IN);
        return this;
    }

    public StorageClusterConfigWhereInput errorStateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_STATE_NOT_IN);
        return this;
    }

    public void setErrorStateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_STATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_STATE_NOT_IN);
        }
    }

    public boolean getErrorStateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_STATE_NOT_IN);
    }

    public StorageClusterConfigWhereInput id(String id) {

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

    public StorageClusterConfigWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public StorageClusterConfigWhereInput id_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput idContains(String idContains) {

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

    public StorageClusterConfigWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public StorageClusterConfigWhereInput idContains_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput idEndsWith(String idEndsWith) {

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

    public StorageClusterConfigWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput idEndsWith_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput idGt(String idGt) {

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

    public StorageClusterConfigWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public StorageClusterConfigWhereInput idGt_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput idGte(String idGte) {

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

    public StorageClusterConfigWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public StorageClusterConfigWhereInput idGte_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public StorageClusterConfigWhereInput addIdInItem(String idInItem) {
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

    public StorageClusterConfigWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public StorageClusterConfigWhereInput idIn_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput idLt(String idLt) {

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

    public StorageClusterConfigWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public StorageClusterConfigWhereInput idLt_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput idLte(String idLte) {

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

    public StorageClusterConfigWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public StorageClusterConfigWhereInput idLte_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput idNot(String idNot) {

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

    public StorageClusterConfigWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public StorageClusterConfigWhereInput idNot_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput idNotContains(String idNotContains) {

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

    public StorageClusterConfigWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public StorageClusterConfigWhereInput idNotContains_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public StorageClusterConfigWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public StorageClusterConfigWhereInput addIdNotInItem(String idNotInItem) {
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

    public StorageClusterConfigWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public StorageClusterConfigWhereInput idNotIn_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public StorageClusterConfigWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput idStartsWith(String idStartsWith) {

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

    public StorageClusterConfigWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput idStartsWith_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput iscsiPort(String iscsiPort) {

        this.iscsiPort = iscsiPort;
        return this;
    }

    /**
     * Get iscsiPort
     *
     * @return iscsiPort
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiPort() {
        return iscsiPort;
    }

    public void setIscsiPort(String iscsiPort) {
        this.iscsiPort = iscsiPort;
    }

    public StorageClusterConfigWhereInput iscsiPort_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiPort_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT);
        return this;
    }

    public void setIscsiPort_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT);
        }
    }

    public boolean getIscsiPort_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT);
    }

    public StorageClusterConfigWhereInput iscsiPortContains(String iscsiPortContains) {

        this.iscsiPortContains = iscsiPortContains;
        return this;
    }

    /**
     * Get iscsiPortContains
     *
     * @return iscsiPortContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiPortContains() {
        return iscsiPortContains;
    }

    public void setIscsiPortContains(String iscsiPortContains) {
        this.iscsiPortContains = iscsiPortContains;
    }

    public StorageClusterConfigWhereInput iscsiPortContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_CONTAINS);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiPortContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_CONTAINS);
        return this;
    }

    public void setIscsiPortContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_CONTAINS);
        }
    }

    public boolean getIscsiPortContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT_CONTAINS);
    }

    public StorageClusterConfigWhereInput iscsiPortEndsWith(String iscsiPortEndsWith) {

        this.iscsiPortEndsWith = iscsiPortEndsWith;
        return this;
    }

    /**
     * Get iscsiPortEndsWith
     *
     * @return iscsiPortEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiPortEndsWith() {
        return iscsiPortEndsWith;
    }

    public void setIscsiPortEndsWith(String iscsiPortEndsWith) {
        this.iscsiPortEndsWith = iscsiPortEndsWith;
    }

    public StorageClusterConfigWhereInput iscsiPortEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_ENDS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiPortEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_ENDS_WITH);
        return this;
    }

    public void setIscsiPortEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_ENDS_WITH);
        }
    }

    public boolean getIscsiPortEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT_ENDS_WITH);
    }

    public StorageClusterConfigWhereInput iscsiPortGt(String iscsiPortGt) {

        this.iscsiPortGt = iscsiPortGt;
        return this;
    }

    /**
     * Get iscsiPortGt
     *
     * @return iscsiPortGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiPortGt() {
        return iscsiPortGt;
    }

    public void setIscsiPortGt(String iscsiPortGt) {
        this.iscsiPortGt = iscsiPortGt;
    }

    public StorageClusterConfigWhereInput iscsiPortGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_GT);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiPortGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_GT);
        return this;
    }

    public void setIscsiPortGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_GT);
        }
    }

    public boolean getIscsiPortGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT_GT);
    }

    public StorageClusterConfigWhereInput iscsiPortGte(String iscsiPortGte) {

        this.iscsiPortGte = iscsiPortGte;
        return this;
    }

    /**
     * Get iscsiPortGte
     *
     * @return iscsiPortGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiPortGte() {
        return iscsiPortGte;
    }

    public void setIscsiPortGte(String iscsiPortGte) {
        this.iscsiPortGte = iscsiPortGte;
    }

    public StorageClusterConfigWhereInput iscsiPortGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_GTE);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiPortGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_GTE);
        return this;
    }

    public void setIscsiPortGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_GTE);
        }
    }

    public boolean getIscsiPortGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT_GTE);
    }

    public StorageClusterConfigWhereInput iscsiPortIn(List<String> iscsiPortIn) {

        this.iscsiPortIn = iscsiPortIn;
        return this;
    }

    public StorageClusterConfigWhereInput addIscsiPortInItem(String iscsiPortInItem) {
        if (this.iscsiPortIn == null) {
            this.iscsiPortIn = new ArrayList<String>();
        }
        this.iscsiPortIn.add(iscsiPortInItem);
        return this;
    }

    /**
     * Get iscsiPortIn
     *
     * @return iscsiPortIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIscsiPortIn() {
        return iscsiPortIn;
    }

    public void setIscsiPortIn(List<String> iscsiPortIn) {
        this.iscsiPortIn = iscsiPortIn;
    }

    public StorageClusterConfigWhereInput iscsiPortIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_IN);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiPortIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_IN);
        return this;
    }

    public void setIscsiPortIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_IN);
        }
    }

    public boolean getIscsiPortIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT_IN);
    }

    public StorageClusterConfigWhereInput iscsiPortLt(String iscsiPortLt) {

        this.iscsiPortLt = iscsiPortLt;
        return this;
    }

    /**
     * Get iscsiPortLt
     *
     * @return iscsiPortLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiPortLt() {
        return iscsiPortLt;
    }

    public void setIscsiPortLt(String iscsiPortLt) {
        this.iscsiPortLt = iscsiPortLt;
    }

    public StorageClusterConfigWhereInput iscsiPortLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_LT);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiPortLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_LT);
        return this;
    }

    public void setIscsiPortLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_LT);
        }
    }

    public boolean getIscsiPortLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT_LT);
    }

    public StorageClusterConfigWhereInput iscsiPortLte(String iscsiPortLte) {

        this.iscsiPortLte = iscsiPortLte;
        return this;
    }

    /**
     * Get iscsiPortLte
     *
     * @return iscsiPortLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiPortLte() {
        return iscsiPortLte;
    }

    public void setIscsiPortLte(String iscsiPortLte) {
        this.iscsiPortLte = iscsiPortLte;
    }

    public StorageClusterConfigWhereInput iscsiPortLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_LTE);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiPortLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_LTE);
        return this;
    }

    public void setIscsiPortLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_LTE);
        }
    }

    public boolean getIscsiPortLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT_LTE);
    }

    public StorageClusterConfigWhereInput iscsiPortNot(String iscsiPortNot) {

        this.iscsiPortNot = iscsiPortNot;
        return this;
    }

    /**
     * Get iscsiPortNot
     *
     * @return iscsiPortNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiPortNot() {
        return iscsiPortNot;
    }

    public void setIscsiPortNot(String iscsiPortNot) {
        this.iscsiPortNot = iscsiPortNot;
    }

    public StorageClusterConfigWhereInput iscsiPortNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_NOT);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiPortNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_NOT);
        return this;
    }

    public void setIscsiPortNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_NOT);
        }
    }

    public boolean getIscsiPortNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT_NOT);
    }

    public StorageClusterConfigWhereInput iscsiPortNotContains(String iscsiPortNotContains) {

        this.iscsiPortNotContains = iscsiPortNotContains;
        return this;
    }

    /**
     * Get iscsiPortNotContains
     *
     * @return iscsiPortNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiPortNotContains() {
        return iscsiPortNotContains;
    }

    public void setIscsiPortNotContains(String iscsiPortNotContains) {
        this.iscsiPortNotContains = iscsiPortNotContains;
    }

    public StorageClusterConfigWhereInput iscsiPortNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_NOT_CONTAINS);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiPortNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_NOT_CONTAINS);
        return this;
    }

    public void setIscsiPortNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_NOT_CONTAINS);
        }
    }

    public boolean getIscsiPortNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT_NOT_CONTAINS);
    }

    public StorageClusterConfigWhereInput iscsiPortNotEndsWith(String iscsiPortNotEndsWith) {

        this.iscsiPortNotEndsWith = iscsiPortNotEndsWith;
        return this;
    }

    /**
     * Get iscsiPortNotEndsWith
     *
     * @return iscsiPortNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiPortNotEndsWith() {
        return iscsiPortNotEndsWith;
    }

    public void setIscsiPortNotEndsWith(String iscsiPortNotEndsWith) {
        this.iscsiPortNotEndsWith = iscsiPortNotEndsWith;
    }

    public StorageClusterConfigWhereInput iscsiPortNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_NOT_ENDS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiPortNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_NOT_ENDS_WITH);
        return this;
    }

    public void setIscsiPortNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_NOT_ENDS_WITH);
        }
    }

    public boolean getIscsiPortNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT_NOT_ENDS_WITH);
    }

    public StorageClusterConfigWhereInput iscsiPortNotIn(List<String> iscsiPortNotIn) {

        this.iscsiPortNotIn = iscsiPortNotIn;
        return this;
    }

    public StorageClusterConfigWhereInput addIscsiPortNotInItem(String iscsiPortNotInItem) {
        if (this.iscsiPortNotIn == null) {
            this.iscsiPortNotIn = new ArrayList<String>();
        }
        this.iscsiPortNotIn.add(iscsiPortNotInItem);
        return this;
    }

    /**
     * Get iscsiPortNotIn
     *
     * @return iscsiPortNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIscsiPortNotIn() {
        return iscsiPortNotIn;
    }

    public void setIscsiPortNotIn(List<String> iscsiPortNotIn) {
        this.iscsiPortNotIn = iscsiPortNotIn;
    }

    public StorageClusterConfigWhereInput iscsiPortNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_NOT_IN);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiPortNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_NOT_IN);
        return this;
    }

    public void setIscsiPortNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_NOT_IN);
        }
    }

    public boolean getIscsiPortNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT_NOT_IN);
    }

    public StorageClusterConfigWhereInput iscsiPortNotStartsWith(String iscsiPortNotStartsWith) {

        this.iscsiPortNotStartsWith = iscsiPortNotStartsWith;
        return this;
    }

    /**
     * Get iscsiPortNotStartsWith
     *
     * @return iscsiPortNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiPortNotStartsWith() {
        return iscsiPortNotStartsWith;
    }

    public void setIscsiPortNotStartsWith(String iscsiPortNotStartsWith) {
        this.iscsiPortNotStartsWith = iscsiPortNotStartsWith;
    }

    public StorageClusterConfigWhereInput iscsiPortNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_NOT_STARTS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiPortNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_NOT_STARTS_WITH);
        return this;
    }

    public void setIscsiPortNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_NOT_STARTS_WITH);
        }
    }

    public boolean getIscsiPortNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT_NOT_STARTS_WITH);
    }

    public StorageClusterConfigWhereInput iscsiPortStartsWith(String iscsiPortStartsWith) {

        this.iscsiPortStartsWith = iscsiPortStartsWith;
        return this;
    }

    /**
     * Get iscsiPortStartsWith
     *
     * @return iscsiPortStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiPortStartsWith() {
        return iscsiPortStartsWith;
    }

    public void setIscsiPortStartsWith(String iscsiPortStartsWith) {
        this.iscsiPortStartsWith = iscsiPortStartsWith;
    }

    public StorageClusterConfigWhereInput iscsiPortStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_STARTS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiPortStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_STARTS_WITH);
        return this;
    }

    public void setIscsiPortStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_STARTS_WITH);
        }
    }

    public boolean getIscsiPortStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT_STARTS_WITH);
    }

    public StorageClusterConfigWhereInput iscsiVip(String iscsiVip) {

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

    public StorageClusterConfigWhereInput iscsiVip_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiVip_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput iscsiVipContains(String iscsiVipContains) {

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

    public StorageClusterConfigWhereInput iscsiVipContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_CONTAINS);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiVipContains_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput iscsiVipEndsWith(String iscsiVipEndsWith) {

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

    public StorageClusterConfigWhereInput iscsiVipEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_ENDS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiVipEndsWith_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput iscsiVipGt(String iscsiVipGt) {

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

    public StorageClusterConfigWhereInput iscsiVipGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_GT);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiVipGt_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput iscsiVipGte(String iscsiVipGte) {

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

    public StorageClusterConfigWhereInput iscsiVipGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_GTE);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiVipGte_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput iscsiVipIn(List<String> iscsiVipIn) {

        this.iscsiVipIn = iscsiVipIn;
        return this;
    }

    public StorageClusterConfigWhereInput addIscsiVipInItem(String iscsiVipInItem) {
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

    public StorageClusterConfigWhereInput iscsiVipIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_IN);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiVipIn_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput iscsiVipLt(String iscsiVipLt) {

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

    public StorageClusterConfigWhereInput iscsiVipLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_LT);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiVipLt_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput iscsiVipLte(String iscsiVipLte) {

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

    public StorageClusterConfigWhereInput iscsiVipLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_LTE);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiVipLte_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput iscsiVipNot(String iscsiVipNot) {

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

    public StorageClusterConfigWhereInput iscsiVipNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_NOT);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiVipNot_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput iscsiVipNotContains(String iscsiVipNotContains) {

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

    public StorageClusterConfigWhereInput iscsiVipNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_NOT_CONTAINS);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiVipNotContains_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput iscsiVipNotEndsWith(String iscsiVipNotEndsWith) {

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

    public StorageClusterConfigWhereInput iscsiVipNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_NOT_ENDS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiVipNotEndsWith_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput iscsiVipNotIn(List<String> iscsiVipNotIn) {

        this.iscsiVipNotIn = iscsiVipNotIn;
        return this;
    }

    public StorageClusterConfigWhereInput addIscsiVipNotInItem(String iscsiVipNotInItem) {
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

    public StorageClusterConfigWhereInput iscsiVipNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_NOT_IN);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiVipNotIn_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput iscsiVipNotStartsWith(String iscsiVipNotStartsWith) {

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

    public StorageClusterConfigWhereInput iscsiVipNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_NOT_STARTS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiVipNotStartsWith_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput iscsiVipStartsWith(String iscsiVipStartsWith) {

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

    public StorageClusterConfigWhereInput iscsiVipStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP_STARTS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput iscsiVipStartsWith_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput localId(String localId) {

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

    public StorageClusterConfigWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public StorageClusterConfigWhereInput localId_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput localIdContains(String localIdContains) {

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

    public StorageClusterConfigWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public StorageClusterConfigWhereInput localIdContains_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public StorageClusterConfigWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput localIdGt(String localIdGt) {

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

    public StorageClusterConfigWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public StorageClusterConfigWhereInput localIdGt_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput localIdGte(String localIdGte) {

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

    public StorageClusterConfigWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public StorageClusterConfigWhereInput localIdGte_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public StorageClusterConfigWhereInput addLocalIdInItem(String localIdInItem) {
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

    public StorageClusterConfigWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public StorageClusterConfigWhereInput localIdIn_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput localIdLt(String localIdLt) {

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

    public StorageClusterConfigWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public StorageClusterConfigWhereInput localIdLt_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput localIdLte(String localIdLte) {

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

    public StorageClusterConfigWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public StorageClusterConfigWhereInput localIdLte_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput localIdNot(String localIdNot) {

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

    public StorageClusterConfigWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public StorageClusterConfigWhereInput localIdNot_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput localIdNotContains(String localIdNotContains) {

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

    public StorageClusterConfigWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public StorageClusterConfigWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public StorageClusterConfigWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public StorageClusterConfigWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public StorageClusterConfigWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public StorageClusterConfigWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public StorageClusterConfigWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public StorageClusterConfigWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput storageCluster(ClusterWhereInput storageCluster) {

        this.storageCluster = storageCluster;
        return this;
    }

    /**
     * Get storageCluster
     *
     * @return storageCluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getStorageCluster() {
        return storageCluster;
    }

    public void setStorageCluster(ClusterWhereInput storageCluster) {
        this.storageCluster = storageCluster;
    }

    public StorageClusterConfigWhereInput storageCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER);
        return this;
    }

    public StorageClusterConfigWhereInput storageCluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER);
        return this;
    }

    public void setStorageCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER);
        }
    }

    public boolean getStorageCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER);
    }

    public StorageClusterConfigWhereInput storageClusterUuid(String storageClusterUuid) {

        this.storageClusterUuid = storageClusterUuid;
        return this;
    }

    /**
     * Get storageClusterUuid
     *
     * @return storageClusterUuid
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterUuid() {
        return storageClusterUuid;
    }

    public void setStorageClusterUuid(String storageClusterUuid) {
        this.storageClusterUuid = storageClusterUuid;
    }

    public StorageClusterConfigWhereInput storageClusterUuid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID);
        return this;
    }

    public StorageClusterConfigWhereInput storageClusterUuid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID);
        return this;
    }

    public void setStorageClusterUuid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID);
        }
    }

    public boolean getStorageClusterUuid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_UUID);
    }

    public StorageClusterConfigWhereInput storageClusterUuidContains(
            String storageClusterUuidContains) {

        this.storageClusterUuidContains = storageClusterUuidContains;
        return this;
    }

    /**
     * Get storageClusterUuidContains
     *
     * @return storageClusterUuidContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterUuidContains() {
        return storageClusterUuidContains;
    }

    public void setStorageClusterUuidContains(String storageClusterUuidContains) {
        this.storageClusterUuidContains = storageClusterUuidContains;
    }

    public StorageClusterConfigWhereInput storageClusterUuidContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_CONTAINS);
        return this;
    }

    public StorageClusterConfigWhereInput storageClusterUuidContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_CONTAINS);
        return this;
    }

    public void setStorageClusterUuidContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_CONTAINS);
        }
    }

    public boolean getStorageClusterUuidContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_CONTAINS);
    }

    public StorageClusterConfigWhereInput storageClusterUuidEndsWith(
            String storageClusterUuidEndsWith) {

        this.storageClusterUuidEndsWith = storageClusterUuidEndsWith;
        return this;
    }

    /**
     * Get storageClusterUuidEndsWith
     *
     * @return storageClusterUuidEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterUuidEndsWith() {
        return storageClusterUuidEndsWith;
    }

    public void setStorageClusterUuidEndsWith(String storageClusterUuidEndsWith) {
        this.storageClusterUuidEndsWith = storageClusterUuidEndsWith;
    }

    public StorageClusterConfigWhereInput storageClusterUuidEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_ENDS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput storageClusterUuidEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_ENDS_WITH);
        return this;
    }

    public void setStorageClusterUuidEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_ENDS_WITH);
        }
    }

    public boolean getStorageClusterUuidEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_ENDS_WITH);
    }

    public StorageClusterConfigWhereInput storageClusterUuidGt(String storageClusterUuidGt) {

        this.storageClusterUuidGt = storageClusterUuidGt;
        return this;
    }

    /**
     * Get storageClusterUuidGt
     *
     * @return storageClusterUuidGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterUuidGt() {
        return storageClusterUuidGt;
    }

    public void setStorageClusterUuidGt(String storageClusterUuidGt) {
        this.storageClusterUuidGt = storageClusterUuidGt;
    }

    public StorageClusterConfigWhereInput storageClusterUuidGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_GT);
        return this;
    }

    public StorageClusterConfigWhereInput storageClusterUuidGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_GT);
        return this;
    }

    public void setStorageClusterUuidGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_GT);
        }
    }

    public boolean getStorageClusterUuidGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_GT);
    }

    public StorageClusterConfigWhereInput storageClusterUuidGte(String storageClusterUuidGte) {

        this.storageClusterUuidGte = storageClusterUuidGte;
        return this;
    }

    /**
     * Get storageClusterUuidGte
     *
     * @return storageClusterUuidGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterUuidGte() {
        return storageClusterUuidGte;
    }

    public void setStorageClusterUuidGte(String storageClusterUuidGte) {
        this.storageClusterUuidGte = storageClusterUuidGte;
    }

    public StorageClusterConfigWhereInput storageClusterUuidGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_GTE);
        return this;
    }

    public StorageClusterConfigWhereInput storageClusterUuidGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_GTE);
        return this;
    }

    public void setStorageClusterUuidGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_GTE);
        }
    }

    public boolean getStorageClusterUuidGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_GTE);
    }

    public StorageClusterConfigWhereInput storageClusterUuidIn(List<String> storageClusterUuidIn) {

        this.storageClusterUuidIn = storageClusterUuidIn;
        return this;
    }

    public StorageClusterConfigWhereInput addStorageClusterUuidInItem(
            String storageClusterUuidInItem) {
        if (this.storageClusterUuidIn == null) {
            this.storageClusterUuidIn = new ArrayList<String>();
        }
        this.storageClusterUuidIn.add(storageClusterUuidInItem);
        return this;
    }

    /**
     * Get storageClusterUuidIn
     *
     * @return storageClusterUuidIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStorageClusterUuidIn() {
        return storageClusterUuidIn;
    }

    public void setStorageClusterUuidIn(List<String> storageClusterUuidIn) {
        this.storageClusterUuidIn = storageClusterUuidIn;
    }

    public StorageClusterConfigWhereInput storageClusterUuidIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_IN);
        return this;
    }

    public StorageClusterConfigWhereInput storageClusterUuidIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_IN);
        return this;
    }

    public void setStorageClusterUuidIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_IN);
        }
    }

    public boolean getStorageClusterUuidIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_IN);
    }

    public StorageClusterConfigWhereInput storageClusterUuidLt(String storageClusterUuidLt) {

        this.storageClusterUuidLt = storageClusterUuidLt;
        return this;
    }

    /**
     * Get storageClusterUuidLt
     *
     * @return storageClusterUuidLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterUuidLt() {
        return storageClusterUuidLt;
    }

    public void setStorageClusterUuidLt(String storageClusterUuidLt) {
        this.storageClusterUuidLt = storageClusterUuidLt;
    }

    public StorageClusterConfigWhereInput storageClusterUuidLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_LT);
        return this;
    }

    public StorageClusterConfigWhereInput storageClusterUuidLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_LT);
        return this;
    }

    public void setStorageClusterUuidLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_LT);
        }
    }

    public boolean getStorageClusterUuidLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_LT);
    }

    public StorageClusterConfigWhereInput storageClusterUuidLte(String storageClusterUuidLte) {

        this.storageClusterUuidLte = storageClusterUuidLte;
        return this;
    }

    /**
     * Get storageClusterUuidLte
     *
     * @return storageClusterUuidLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterUuidLte() {
        return storageClusterUuidLte;
    }

    public void setStorageClusterUuidLte(String storageClusterUuidLte) {
        this.storageClusterUuidLte = storageClusterUuidLte;
    }

    public StorageClusterConfigWhereInput storageClusterUuidLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_LTE);
        return this;
    }

    public StorageClusterConfigWhereInput storageClusterUuidLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_LTE);
        return this;
    }

    public void setStorageClusterUuidLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_LTE);
        }
    }

    public boolean getStorageClusterUuidLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_LTE);
    }

    public StorageClusterConfigWhereInput storageClusterUuidNot(String storageClusterUuidNot) {

        this.storageClusterUuidNot = storageClusterUuidNot;
        return this;
    }

    /**
     * Get storageClusterUuidNot
     *
     * @return storageClusterUuidNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterUuidNot() {
        return storageClusterUuidNot;
    }

    public void setStorageClusterUuidNot(String storageClusterUuidNot) {
        this.storageClusterUuidNot = storageClusterUuidNot;
    }

    public StorageClusterConfigWhereInput storageClusterUuidNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT);
        return this;
    }

    public StorageClusterConfigWhereInput storageClusterUuidNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT);
        return this;
    }

    public void setStorageClusterUuidNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT);
        }
    }

    public boolean getStorageClusterUuidNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT);
    }

    public StorageClusterConfigWhereInput storageClusterUuidNotContains(
            String storageClusterUuidNotContains) {

        this.storageClusterUuidNotContains = storageClusterUuidNotContains;
        return this;
    }

    /**
     * Get storageClusterUuidNotContains
     *
     * @return storageClusterUuidNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterUuidNotContains() {
        return storageClusterUuidNotContains;
    }

    public void setStorageClusterUuidNotContains(String storageClusterUuidNotContains) {
        this.storageClusterUuidNotContains = storageClusterUuidNotContains;
    }

    public StorageClusterConfigWhereInput storageClusterUuidNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_CONTAINS);
        return this;
    }

    public StorageClusterConfigWhereInput storageClusterUuidNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_CONTAINS);
        return this;
    }

    public void setStorageClusterUuidNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_CONTAINS);
        }
    }

    public boolean getStorageClusterUuidNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_CONTAINS);
    }

    public StorageClusterConfigWhereInput storageClusterUuidNotEndsWith(
            String storageClusterUuidNotEndsWith) {

        this.storageClusterUuidNotEndsWith = storageClusterUuidNotEndsWith;
        return this;
    }

    /**
     * Get storageClusterUuidNotEndsWith
     *
     * @return storageClusterUuidNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterUuidNotEndsWith() {
        return storageClusterUuidNotEndsWith;
    }

    public void setStorageClusterUuidNotEndsWith(String storageClusterUuidNotEndsWith) {
        this.storageClusterUuidNotEndsWith = storageClusterUuidNotEndsWith;
    }

    public StorageClusterConfigWhereInput storageClusterUuidNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_ENDS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput storageClusterUuidNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_ENDS_WITH);
        return this;
    }

    public void setStorageClusterUuidNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_ENDS_WITH);
        }
    }

    public boolean getStorageClusterUuidNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_ENDS_WITH);
    }

    public StorageClusterConfigWhereInput storageClusterUuidNotIn(
            List<String> storageClusterUuidNotIn) {

        this.storageClusterUuidNotIn = storageClusterUuidNotIn;
        return this;
    }

    public StorageClusterConfigWhereInput addStorageClusterUuidNotInItem(
            String storageClusterUuidNotInItem) {
        if (this.storageClusterUuidNotIn == null) {
            this.storageClusterUuidNotIn = new ArrayList<String>();
        }
        this.storageClusterUuidNotIn.add(storageClusterUuidNotInItem);
        return this;
    }

    /**
     * Get storageClusterUuidNotIn
     *
     * @return storageClusterUuidNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStorageClusterUuidNotIn() {
        return storageClusterUuidNotIn;
    }

    public void setStorageClusterUuidNotIn(List<String> storageClusterUuidNotIn) {
        this.storageClusterUuidNotIn = storageClusterUuidNotIn;
    }

    public StorageClusterConfigWhereInput storageClusterUuidNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_IN);
        return this;
    }

    public StorageClusterConfigWhereInput storageClusterUuidNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_IN);
        return this;
    }

    public void setStorageClusterUuidNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_IN);
        }
    }

    public boolean getStorageClusterUuidNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_IN);
    }

    public StorageClusterConfigWhereInput storageClusterUuidNotStartsWith(
            String storageClusterUuidNotStartsWith) {

        this.storageClusterUuidNotStartsWith = storageClusterUuidNotStartsWith;
        return this;
    }

    /**
     * Get storageClusterUuidNotStartsWith
     *
     * @return storageClusterUuidNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterUuidNotStartsWith() {
        return storageClusterUuidNotStartsWith;
    }

    public void setStorageClusterUuidNotStartsWith(String storageClusterUuidNotStartsWith) {
        this.storageClusterUuidNotStartsWith = storageClusterUuidNotStartsWith;
    }

    public StorageClusterConfigWhereInput storageClusterUuidNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_STARTS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput storageClusterUuidNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_STARTS_WITH);
        return this;
    }

    public void setStorageClusterUuidNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_STARTS_WITH);
        }
    }

    public boolean getStorageClusterUuidNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_NOT_STARTS_WITH);
    }

    public StorageClusterConfigWhereInput storageClusterUuidStartsWith(
            String storageClusterUuidStartsWith) {

        this.storageClusterUuidStartsWith = storageClusterUuidStartsWith;
        return this;
    }

    /**
     * Get storageClusterUuidStartsWith
     *
     * @return storageClusterUuidStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterUuidStartsWith() {
        return storageClusterUuidStartsWith;
    }

    public void setStorageClusterUuidStartsWith(String storageClusterUuidStartsWith) {
        this.storageClusterUuidStartsWith = storageClusterUuidStartsWith;
    }

    public StorageClusterConfigWhereInput storageClusterUuidStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_STARTS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput storageClusterUuidStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_STARTS_WITH);
        return this;
    }

    public void setStorageClusterUuidStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_STARTS_WITH);
        }
    }

    public boolean getStorageClusterUuidStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_UUID_STARTS_WITH);
    }

    public StorageClusterConfigWhereInput type(StorageClusterConfigStorageType type) {

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
    public StorageClusterConfigStorageType getType() {
        return type;
    }

    public void setType(StorageClusterConfigStorageType type) {
        this.type = type;
    }

    public StorageClusterConfigWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public StorageClusterConfigWhereInput type_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput typeIn(List<StorageClusterConfigStorageType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public StorageClusterConfigWhereInput addTypeInItem(
            StorageClusterConfigStorageType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<StorageClusterConfigStorageType>();
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
    public List<StorageClusterConfigStorageType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<StorageClusterConfigStorageType> typeIn) {
        this.typeIn = typeIn;
    }

    public StorageClusterConfigWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public StorageClusterConfigWhereInput typeIn_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput typeNot(StorageClusterConfigStorageType typeNot) {

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
    public StorageClusterConfigStorageType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(StorageClusterConfigStorageType typeNot) {
        this.typeNot = typeNot;
    }

    public StorageClusterConfigWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public StorageClusterConfigWhereInput typeNot_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput typeNotIn(
            List<StorageClusterConfigStorageType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public StorageClusterConfigWhereInput addTypeNotInItem(
            StorageClusterConfigStorageType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<StorageClusterConfigStorageType>();
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
    public List<StorageClusterConfigStorageType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<StorageClusterConfigStorageType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public StorageClusterConfigWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public StorageClusterConfigWhereInput typeNotIn_ExplictlyNonNull() {
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

    public StorageClusterConfigWhereInput username(String username) {

        this.username = username;
        return this;
    }

    /**
     * Get username
     *
     * @return username
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public StorageClusterConfigWhereInput username_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public StorageClusterConfigWhereInput username_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public void setUsername_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME);
        }
    }

    public boolean getUsername_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME);
    }

    public StorageClusterConfigWhereInput usernameContains(String usernameContains) {

        this.usernameContains = usernameContains;
        return this;
    }

    /**
     * Get usernameContains
     *
     * @return usernameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameContains() {
        return usernameContains;
    }

    public void setUsernameContains(String usernameContains) {
        this.usernameContains = usernameContains;
    }

    public StorageClusterConfigWhereInput usernameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_CONTAINS);
        return this;
    }

    public StorageClusterConfigWhereInput usernameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_CONTAINS);
        return this;
    }

    public void setUsernameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_CONTAINS);
        }
    }

    public boolean getUsernameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_CONTAINS);
    }

    public StorageClusterConfigWhereInput usernameEndsWith(String usernameEndsWith) {

        this.usernameEndsWith = usernameEndsWith;
        return this;
    }

    /**
     * Get usernameEndsWith
     *
     * @return usernameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameEndsWith() {
        return usernameEndsWith;
    }

    public void setUsernameEndsWith(String usernameEndsWith) {
        this.usernameEndsWith = usernameEndsWith;
    }

    public StorageClusterConfigWhereInput usernameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput usernameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        return this;
    }

    public void setUsernameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        }
    }

    public boolean getUsernameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_ENDS_WITH);
    }

    public StorageClusterConfigWhereInput usernameGt(String usernameGt) {

        this.usernameGt = usernameGt;
        return this;
    }

    /**
     * Get usernameGt
     *
     * @return usernameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameGt() {
        return usernameGt;
    }

    public void setUsernameGt(String usernameGt) {
        this.usernameGt = usernameGt;
    }

    public StorageClusterConfigWhereInput usernameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_GT);
        return this;
    }

    public StorageClusterConfigWhereInput usernameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_GT);
        return this;
    }

    public void setUsernameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_GT);
        }
    }

    public boolean getUsernameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_GT);
    }

    public StorageClusterConfigWhereInput usernameGte(String usernameGte) {

        this.usernameGte = usernameGte;
        return this;
    }

    /**
     * Get usernameGte
     *
     * @return usernameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameGte() {
        return usernameGte;
    }

    public void setUsernameGte(String usernameGte) {
        this.usernameGte = usernameGte;
    }

    public StorageClusterConfigWhereInput usernameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_GTE);
        return this;
    }

    public StorageClusterConfigWhereInput usernameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_GTE);
        return this;
    }

    public void setUsernameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_GTE);
        }
    }

    public boolean getUsernameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_GTE);
    }

    public StorageClusterConfigWhereInput usernameIn(List<String> usernameIn) {

        this.usernameIn = usernameIn;
        return this;
    }

    public StorageClusterConfigWhereInput addUsernameInItem(String usernameInItem) {
        if (this.usernameIn == null) {
            this.usernameIn = new ArrayList<String>();
        }
        this.usernameIn.add(usernameInItem);
        return this;
    }

    /**
     * Get usernameIn
     *
     * @return usernameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUsernameIn() {
        return usernameIn;
    }

    public void setUsernameIn(List<String> usernameIn) {
        this.usernameIn = usernameIn;
    }

    public StorageClusterConfigWhereInput usernameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_IN);
        return this;
    }

    public StorageClusterConfigWhereInput usernameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_IN);
        return this;
    }

    public void setUsernameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_IN);
        }
    }

    public boolean getUsernameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_IN);
    }

    public StorageClusterConfigWhereInput usernameLt(String usernameLt) {

        this.usernameLt = usernameLt;
        return this;
    }

    /**
     * Get usernameLt
     *
     * @return usernameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameLt() {
        return usernameLt;
    }

    public void setUsernameLt(String usernameLt) {
        this.usernameLt = usernameLt;
    }

    public StorageClusterConfigWhereInput usernameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_LT);
        return this;
    }

    public StorageClusterConfigWhereInput usernameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_LT);
        return this;
    }

    public void setUsernameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_LT);
        }
    }

    public boolean getUsernameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_LT);
    }

    public StorageClusterConfigWhereInput usernameLte(String usernameLte) {

        this.usernameLte = usernameLte;
        return this;
    }

    /**
     * Get usernameLte
     *
     * @return usernameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameLte() {
        return usernameLte;
    }

    public void setUsernameLte(String usernameLte) {
        this.usernameLte = usernameLte;
    }

    public StorageClusterConfigWhereInput usernameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_LTE);
        return this;
    }

    public StorageClusterConfigWhereInput usernameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_LTE);
        return this;
    }

    public void setUsernameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_LTE);
        }
    }

    public boolean getUsernameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_LTE);
    }

    public StorageClusterConfigWhereInput usernameNot(String usernameNot) {

        this.usernameNot = usernameNot;
        return this;
    }

    /**
     * Get usernameNot
     *
     * @return usernameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameNot() {
        return usernameNot;
    }

    public void setUsernameNot(String usernameNot) {
        this.usernameNot = usernameNot;
    }

    public StorageClusterConfigWhereInput usernameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT);
        return this;
    }

    public StorageClusterConfigWhereInput usernameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT);
        return this;
    }

    public void setUsernameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT);
        }
    }

    public boolean getUsernameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT);
    }

    public StorageClusterConfigWhereInput usernameNotContains(String usernameNotContains) {

        this.usernameNotContains = usernameNotContains;
        return this;
    }

    /**
     * Get usernameNotContains
     *
     * @return usernameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameNotContains() {
        return usernameNotContains;
    }

    public void setUsernameNotContains(String usernameNotContains) {
        this.usernameNotContains = usernameNotContains;
    }

    public StorageClusterConfigWhereInput usernameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        return this;
    }

    public StorageClusterConfigWhereInput usernameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        return this;
    }

    public void setUsernameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        }
    }

    public boolean getUsernameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
    }

    public StorageClusterConfigWhereInput usernameNotEndsWith(String usernameNotEndsWith) {

        this.usernameNotEndsWith = usernameNotEndsWith;
        return this;
    }

    /**
     * Get usernameNotEndsWith
     *
     * @return usernameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameNotEndsWith() {
        return usernameNotEndsWith;
    }

    public void setUsernameNotEndsWith(String usernameNotEndsWith) {
        this.usernameNotEndsWith = usernameNotEndsWith;
    }

    public StorageClusterConfigWhereInput usernameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput usernameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        return this;
    }

    public void setUsernameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        }
    }

    public boolean getUsernameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
    }

    public StorageClusterConfigWhereInput usernameNotIn(List<String> usernameNotIn) {

        this.usernameNotIn = usernameNotIn;
        return this;
    }

    public StorageClusterConfigWhereInput addUsernameNotInItem(String usernameNotInItem) {
        if (this.usernameNotIn == null) {
            this.usernameNotIn = new ArrayList<String>();
        }
        this.usernameNotIn.add(usernameNotInItem);
        return this;
    }

    /**
     * Get usernameNotIn
     *
     * @return usernameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUsernameNotIn() {
        return usernameNotIn;
    }

    public void setUsernameNotIn(List<String> usernameNotIn) {
        this.usernameNotIn = usernameNotIn;
    }

    public StorageClusterConfigWhereInput usernameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_IN);
        return this;
    }

    public StorageClusterConfigWhereInput usernameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_IN);
        return this;
    }

    public void setUsernameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_IN);
        }
    }

    public boolean getUsernameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT_IN);
    }

    public StorageClusterConfigWhereInput usernameNotStartsWith(String usernameNotStartsWith) {

        this.usernameNotStartsWith = usernameNotStartsWith;
        return this;
    }

    /**
     * Get usernameNotStartsWith
     *
     * @return usernameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameNotStartsWith() {
        return usernameNotStartsWith;
    }

    public void setUsernameNotStartsWith(String usernameNotStartsWith) {
        this.usernameNotStartsWith = usernameNotStartsWith;
    }

    public StorageClusterConfigWhereInput usernameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput usernameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        return this;
    }

    public void setUsernameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        }
    }

    public boolean getUsernameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
    }

    public StorageClusterConfigWhereInput usernameStartsWith(String usernameStartsWith) {

        this.usernameStartsWith = usernameStartsWith;
        return this;
    }

    /**
     * Get usernameStartsWith
     *
     * @return usernameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameStartsWith() {
        return usernameStartsWith;
    }

    public void setUsernameStartsWith(String usernameStartsWith) {
        this.usernameStartsWith = usernameStartsWith;
    }

    public StorageClusterConfigWhereInput usernameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        return this;
    }

    public StorageClusterConfigWhereInput usernameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        return this;
    }

    public void setUsernameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        }
    }

    public boolean getUsernameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StorageClusterConfigWhereInput storageClusterConfigWhereInput =
                (StorageClusterConfigWhereInput) o;
        return Objects.equals(this.AND, storageClusterConfigWhereInput.AND)
                && Objects.equals(this.NOT, storageClusterConfigWhereInput.NOT)
                && Objects.equals(this.OR, storageClusterConfigWhereInput.OR)
                && Objects.equals(
                        this.computeCluster, storageClusterConfigWhereInput.computeCluster)
                && Objects.equals(this.connectState, storageClusterConfigWhereInput.connectState)
                && Objects.equals(
                        this.connectStateIn, storageClusterConfigWhereInput.connectStateIn)
                && Objects.equals(
                        this.connectStateNot, storageClusterConfigWhereInput.connectStateNot)
                && Objects.equals(
                        this.connectStateNotIn, storageClusterConfigWhereInput.connectStateNotIn)
                && Objects.equals(this.createdTime, storageClusterConfigWhereInput.createdTime)
                && Objects.equals(this.createdTimeGt, storageClusterConfigWhereInput.createdTimeGt)
                && Objects.equals(
                        this.createdTimeGte, storageClusterConfigWhereInput.createdTimeGte)
                && Objects.equals(this.createdTimeIn, storageClusterConfigWhereInput.createdTimeIn)
                && Objects.equals(this.createdTimeLt, storageClusterConfigWhereInput.createdTimeLt)
                && Objects.equals(
                        this.createdTimeLte, storageClusterConfigWhereInput.createdTimeLte)
                && Objects.equals(
                        this.createdTimeNot, storageClusterConfigWhereInput.createdTimeNot)
                && Objects.equals(
                        this.createdTimeNotIn, storageClusterConfigWhereInput.createdTimeNotIn)
                && Objects.equals(this.datastore, storageClusterConfigWhereInput.datastore)
                && Objects.equals(
                        this.defaultStorageEncryption,
                        storageClusterConfigWhereInput.defaultStorageEncryption)
                && Objects.equals(
                        this.defaultStorageEncryptionAlgorithm,
                        storageClusterConfigWhereInput.defaultStorageEncryptionAlgorithm)
                && Objects.equals(
                        this.defaultStorageEncryptionAlgorithmContains,
                        storageClusterConfigWhereInput.defaultStorageEncryptionAlgorithmContains)
                && Objects.equals(
                        this.defaultStorageEncryptionAlgorithmEndsWith,
                        storageClusterConfigWhereInput.defaultStorageEncryptionAlgorithmEndsWith)
                && Objects.equals(
                        this.defaultStorageEncryptionAlgorithmGt,
                        storageClusterConfigWhereInput.defaultStorageEncryptionAlgorithmGt)
                && Objects.equals(
                        this.defaultStorageEncryptionAlgorithmGte,
                        storageClusterConfigWhereInput.defaultStorageEncryptionAlgorithmGte)
                && Objects.equals(
                        this.defaultStorageEncryptionAlgorithmIn,
                        storageClusterConfigWhereInput.defaultStorageEncryptionAlgorithmIn)
                && Objects.equals(
                        this.defaultStorageEncryptionAlgorithmLt,
                        storageClusterConfigWhereInput.defaultStorageEncryptionAlgorithmLt)
                && Objects.equals(
                        this.defaultStorageEncryptionAlgorithmLte,
                        storageClusterConfigWhereInput.defaultStorageEncryptionAlgorithmLte)
                && Objects.equals(
                        this.defaultStorageEncryptionAlgorithmNot,
                        storageClusterConfigWhereInput.defaultStorageEncryptionAlgorithmNot)
                && Objects.equals(
                        this.defaultStorageEncryptionAlgorithmNotContains,
                        storageClusterConfigWhereInput.defaultStorageEncryptionAlgorithmNotContains)
                && Objects.equals(
                        this.defaultStorageEncryptionAlgorithmNotEndsWith,
                        storageClusterConfigWhereInput.defaultStorageEncryptionAlgorithmNotEndsWith)
                && Objects.equals(
                        this.defaultStorageEncryptionAlgorithmNotIn,
                        storageClusterConfigWhereInput.defaultStorageEncryptionAlgorithmNotIn)
                && Objects.equals(
                        this.defaultStorageEncryptionAlgorithmNotStartsWith,
                        storageClusterConfigWhereInput
                                .defaultStorageEncryptionAlgorithmNotStartsWith)
                && Objects.equals(
                        this.defaultStorageEncryptionAlgorithmStartsWith,
                        storageClusterConfigWhereInput.defaultStorageEncryptionAlgorithmStartsWith)
                && Objects.equals(
                        this.defaultStorageEncryptionNot,
                        storageClusterConfigWhereInput.defaultStorageEncryptionNot)
                && Objects.equals(
                        this.defaultStoragePolicy,
                        storageClusterConfigWhereInput.defaultStoragePolicy)
                && Objects.equals(
                        this.defaultStoragePolicyEcK,
                        storageClusterConfigWhereInput.defaultStoragePolicyEcK)
                && Objects.equals(
                        this.defaultStoragePolicyEcKGt,
                        storageClusterConfigWhereInput.defaultStoragePolicyEcKGt)
                && Objects.equals(
                        this.defaultStoragePolicyEcKGte,
                        storageClusterConfigWhereInput.defaultStoragePolicyEcKGte)
                && Objects.equals(
                        this.defaultStoragePolicyEcKIn,
                        storageClusterConfigWhereInput.defaultStoragePolicyEcKIn)
                && Objects.equals(
                        this.defaultStoragePolicyEcKLt,
                        storageClusterConfigWhereInput.defaultStoragePolicyEcKLt)
                && Objects.equals(
                        this.defaultStoragePolicyEcKLte,
                        storageClusterConfigWhereInput.defaultStoragePolicyEcKLte)
                && Objects.equals(
                        this.defaultStoragePolicyEcKNot,
                        storageClusterConfigWhereInput.defaultStoragePolicyEcKNot)
                && Objects.equals(
                        this.defaultStoragePolicyEcKNotIn,
                        storageClusterConfigWhereInput.defaultStoragePolicyEcKNotIn)
                && Objects.equals(
                        this.defaultStoragePolicyEcM,
                        storageClusterConfigWhereInput.defaultStoragePolicyEcM)
                && Objects.equals(
                        this.defaultStoragePolicyEcMGt,
                        storageClusterConfigWhereInput.defaultStoragePolicyEcMGt)
                && Objects.equals(
                        this.defaultStoragePolicyEcMGte,
                        storageClusterConfigWhereInput.defaultStoragePolicyEcMGte)
                && Objects.equals(
                        this.defaultStoragePolicyEcMIn,
                        storageClusterConfigWhereInput.defaultStoragePolicyEcMIn)
                && Objects.equals(
                        this.defaultStoragePolicyEcMLt,
                        storageClusterConfigWhereInput.defaultStoragePolicyEcMLt)
                && Objects.equals(
                        this.defaultStoragePolicyEcMLte,
                        storageClusterConfigWhereInput.defaultStoragePolicyEcMLte)
                && Objects.equals(
                        this.defaultStoragePolicyEcMNot,
                        storageClusterConfigWhereInput.defaultStoragePolicyEcMNot)
                && Objects.equals(
                        this.defaultStoragePolicyEcMNotIn,
                        storageClusterConfigWhereInput.defaultStoragePolicyEcMNotIn)
                && Objects.equals(
                        this.defaultStoragePolicyIn,
                        storageClusterConfigWhereInput.defaultStoragePolicyIn)
                && Objects.equals(
                        this.defaultStoragePolicyNot,
                        storageClusterConfigWhereInput.defaultStoragePolicyNot)
                && Objects.equals(
                        this.defaultStoragePolicyNotIn,
                        storageClusterConfigWhereInput.defaultStoragePolicyNotIn)
                && Objects.equals(
                        this.defaultStoragePolicyReplicaNum,
                        storageClusterConfigWhereInput.defaultStoragePolicyReplicaNum)
                && Objects.equals(
                        this.defaultStoragePolicyReplicaNumGt,
                        storageClusterConfigWhereInput.defaultStoragePolicyReplicaNumGt)
                && Objects.equals(
                        this.defaultStoragePolicyReplicaNumGte,
                        storageClusterConfigWhereInput.defaultStoragePolicyReplicaNumGte)
                && Objects.equals(
                        this.defaultStoragePolicyReplicaNumIn,
                        storageClusterConfigWhereInput.defaultStoragePolicyReplicaNumIn)
                && Objects.equals(
                        this.defaultStoragePolicyReplicaNumLt,
                        storageClusterConfigWhereInput.defaultStoragePolicyReplicaNumLt)
                && Objects.equals(
                        this.defaultStoragePolicyReplicaNumLte,
                        storageClusterConfigWhereInput.defaultStoragePolicyReplicaNumLte)
                && Objects.equals(
                        this.defaultStoragePolicyReplicaNumNot,
                        storageClusterConfigWhereInput.defaultStoragePolicyReplicaNumNot)
                && Objects.equals(
                        this.defaultStoragePolicyReplicaNumNotIn,
                        storageClusterConfigWhereInput.defaultStoragePolicyReplicaNumNotIn)
                && Objects.equals(
                        this.defaultStoragePolicyStripeNum,
                        storageClusterConfigWhereInput.defaultStoragePolicyStripeNum)
                && Objects.equals(
                        this.defaultStoragePolicyStripeNumGt,
                        storageClusterConfigWhereInput.defaultStoragePolicyStripeNumGt)
                && Objects.equals(
                        this.defaultStoragePolicyStripeNumGte,
                        storageClusterConfigWhereInput.defaultStoragePolicyStripeNumGte)
                && Objects.equals(
                        this.defaultStoragePolicyStripeNumIn,
                        storageClusterConfigWhereInput.defaultStoragePolicyStripeNumIn)
                && Objects.equals(
                        this.defaultStoragePolicyStripeNumLt,
                        storageClusterConfigWhereInput.defaultStoragePolicyStripeNumLt)
                && Objects.equals(
                        this.defaultStoragePolicyStripeNumLte,
                        storageClusterConfigWhereInput.defaultStoragePolicyStripeNumLte)
                && Objects.equals(
                        this.defaultStoragePolicyStripeNumNot,
                        storageClusterConfigWhereInput.defaultStoragePolicyStripeNumNot)
                && Objects.equals(
                        this.defaultStoragePolicyStripeNumNotIn,
                        storageClusterConfigWhereInput.defaultStoragePolicyStripeNumNotIn)
                && Objects.equals(
                        this.defaultStoragePolicyThinProvision,
                        storageClusterConfigWhereInput.defaultStoragePolicyThinProvision)
                && Objects.equals(
                        this.defaultStoragePolicyThinProvisionNot,
                        storageClusterConfigWhereInput.defaultStoragePolicyThinProvisionNot)
                && Objects.equals(this.description, storageClusterConfigWhereInput.description)
                && Objects.equals(
                        this.descriptionContains,
                        storageClusterConfigWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith,
                        storageClusterConfigWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, storageClusterConfigWhereInput.descriptionGt)
                && Objects.equals(
                        this.descriptionGte, storageClusterConfigWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, storageClusterConfigWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, storageClusterConfigWhereInput.descriptionLt)
                && Objects.equals(
                        this.descriptionLte, storageClusterConfigWhereInput.descriptionLte)
                && Objects.equals(
                        this.descriptionNot, storageClusterConfigWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains,
                        storageClusterConfigWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith,
                        storageClusterConfigWhereInput.descriptionNotEndsWith)
                && Objects.equals(
                        this.descriptionNotIn, storageClusterConfigWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        storageClusterConfigWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith,
                        storageClusterConfigWhereInput.descriptionStartsWith)
                && Objects.equals(this.errorState, storageClusterConfigWhereInput.errorState)
                && Objects.equals(this.errorStateIn, storageClusterConfigWhereInput.errorStateIn)
                && Objects.equals(this.errorStateNot, storageClusterConfigWhereInput.errorStateNot)
                && Objects.equals(
                        this.errorStateNotIn, storageClusterConfigWhereInput.errorStateNotIn)
                && Objects.equals(this.id, storageClusterConfigWhereInput.id)
                && Objects.equals(this.idContains, storageClusterConfigWhereInput.idContains)
                && Objects.equals(this.idEndsWith, storageClusterConfigWhereInput.idEndsWith)
                && Objects.equals(this.idGt, storageClusterConfigWhereInput.idGt)
                && Objects.equals(this.idGte, storageClusterConfigWhereInput.idGte)
                && Objects.equals(this.idIn, storageClusterConfigWhereInput.idIn)
                && Objects.equals(this.idLt, storageClusterConfigWhereInput.idLt)
                && Objects.equals(this.idLte, storageClusterConfigWhereInput.idLte)
                && Objects.equals(this.idNot, storageClusterConfigWhereInput.idNot)
                && Objects.equals(this.idNotContains, storageClusterConfigWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, storageClusterConfigWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, storageClusterConfigWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, storageClusterConfigWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, storageClusterConfigWhereInput.idStartsWith)
                && Objects.equals(this.iscsiPort, storageClusterConfigWhereInput.iscsiPort)
                && Objects.equals(
                        this.iscsiPortContains, storageClusterConfigWhereInput.iscsiPortContains)
                && Objects.equals(
                        this.iscsiPortEndsWith, storageClusterConfigWhereInput.iscsiPortEndsWith)
                && Objects.equals(this.iscsiPortGt, storageClusterConfigWhereInput.iscsiPortGt)
                && Objects.equals(this.iscsiPortGte, storageClusterConfigWhereInput.iscsiPortGte)
                && Objects.equals(this.iscsiPortIn, storageClusterConfigWhereInput.iscsiPortIn)
                && Objects.equals(this.iscsiPortLt, storageClusterConfigWhereInput.iscsiPortLt)
                && Objects.equals(this.iscsiPortLte, storageClusterConfigWhereInput.iscsiPortLte)
                && Objects.equals(this.iscsiPortNot, storageClusterConfigWhereInput.iscsiPortNot)
                && Objects.equals(
                        this.iscsiPortNotContains,
                        storageClusterConfigWhereInput.iscsiPortNotContains)
                && Objects.equals(
                        this.iscsiPortNotEndsWith,
                        storageClusterConfigWhereInput.iscsiPortNotEndsWith)
                && Objects.equals(
                        this.iscsiPortNotIn, storageClusterConfigWhereInput.iscsiPortNotIn)
                && Objects.equals(
                        this.iscsiPortNotStartsWith,
                        storageClusterConfigWhereInput.iscsiPortNotStartsWith)
                && Objects.equals(
                        this.iscsiPortStartsWith,
                        storageClusterConfigWhereInput.iscsiPortStartsWith)
                && Objects.equals(this.iscsiVip, storageClusterConfigWhereInput.iscsiVip)
                && Objects.equals(
                        this.iscsiVipContains, storageClusterConfigWhereInput.iscsiVipContains)
                && Objects.equals(
                        this.iscsiVipEndsWith, storageClusterConfigWhereInput.iscsiVipEndsWith)
                && Objects.equals(this.iscsiVipGt, storageClusterConfigWhereInput.iscsiVipGt)
                && Objects.equals(this.iscsiVipGte, storageClusterConfigWhereInput.iscsiVipGte)
                && Objects.equals(this.iscsiVipIn, storageClusterConfigWhereInput.iscsiVipIn)
                && Objects.equals(this.iscsiVipLt, storageClusterConfigWhereInput.iscsiVipLt)
                && Objects.equals(this.iscsiVipLte, storageClusterConfigWhereInput.iscsiVipLte)
                && Objects.equals(this.iscsiVipNot, storageClusterConfigWhereInput.iscsiVipNot)
                && Objects.equals(
                        this.iscsiVipNotContains,
                        storageClusterConfigWhereInput.iscsiVipNotContains)
                && Objects.equals(
                        this.iscsiVipNotEndsWith,
                        storageClusterConfigWhereInput.iscsiVipNotEndsWith)
                && Objects.equals(this.iscsiVipNotIn, storageClusterConfigWhereInput.iscsiVipNotIn)
                && Objects.equals(
                        this.iscsiVipNotStartsWith,
                        storageClusterConfigWhereInput.iscsiVipNotStartsWith)
                && Objects.equals(
                        this.iscsiVipStartsWith, storageClusterConfigWhereInput.iscsiVipStartsWith)
                && Objects.equals(this.localId, storageClusterConfigWhereInput.localId)
                && Objects.equals(
                        this.localIdContains, storageClusterConfigWhereInput.localIdContains)
                && Objects.equals(
                        this.localIdEndsWith, storageClusterConfigWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, storageClusterConfigWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, storageClusterConfigWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, storageClusterConfigWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, storageClusterConfigWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, storageClusterConfigWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, storageClusterConfigWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, storageClusterConfigWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, storageClusterConfigWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, storageClusterConfigWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith,
                        storageClusterConfigWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith, storageClusterConfigWhereInput.localIdStartsWith)
                && Objects.equals(
                        this.storageCluster, storageClusterConfigWhereInput.storageCluster)
                && Objects.equals(
                        this.storageClusterUuid, storageClusterConfigWhereInput.storageClusterUuid)
                && Objects.equals(
                        this.storageClusterUuidContains,
                        storageClusterConfigWhereInput.storageClusterUuidContains)
                && Objects.equals(
                        this.storageClusterUuidEndsWith,
                        storageClusterConfigWhereInput.storageClusterUuidEndsWith)
                && Objects.equals(
                        this.storageClusterUuidGt,
                        storageClusterConfigWhereInput.storageClusterUuidGt)
                && Objects.equals(
                        this.storageClusterUuidGte,
                        storageClusterConfigWhereInput.storageClusterUuidGte)
                && Objects.equals(
                        this.storageClusterUuidIn,
                        storageClusterConfigWhereInput.storageClusterUuidIn)
                && Objects.equals(
                        this.storageClusterUuidLt,
                        storageClusterConfigWhereInput.storageClusterUuidLt)
                && Objects.equals(
                        this.storageClusterUuidLte,
                        storageClusterConfigWhereInput.storageClusterUuidLte)
                && Objects.equals(
                        this.storageClusterUuidNot,
                        storageClusterConfigWhereInput.storageClusterUuidNot)
                && Objects.equals(
                        this.storageClusterUuidNotContains,
                        storageClusterConfigWhereInput.storageClusterUuidNotContains)
                && Objects.equals(
                        this.storageClusterUuidNotEndsWith,
                        storageClusterConfigWhereInput.storageClusterUuidNotEndsWith)
                && Objects.equals(
                        this.storageClusterUuidNotIn,
                        storageClusterConfigWhereInput.storageClusterUuidNotIn)
                && Objects.equals(
                        this.storageClusterUuidNotStartsWith,
                        storageClusterConfigWhereInput.storageClusterUuidNotStartsWith)
                && Objects.equals(
                        this.storageClusterUuidStartsWith,
                        storageClusterConfigWhereInput.storageClusterUuidStartsWith)
                && Objects.equals(this.type, storageClusterConfigWhereInput.type)
                && Objects.equals(this.typeIn, storageClusterConfigWhereInput.typeIn)
                && Objects.equals(this.typeNot, storageClusterConfigWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, storageClusterConfigWhereInput.typeNotIn)
                && Objects.equals(this.username, storageClusterConfigWhereInput.username)
                && Objects.equals(
                        this.usernameContains, storageClusterConfigWhereInput.usernameContains)
                && Objects.equals(
                        this.usernameEndsWith, storageClusterConfigWhereInput.usernameEndsWith)
                && Objects.equals(this.usernameGt, storageClusterConfigWhereInput.usernameGt)
                && Objects.equals(this.usernameGte, storageClusterConfigWhereInput.usernameGte)
                && Objects.equals(this.usernameIn, storageClusterConfigWhereInput.usernameIn)
                && Objects.equals(this.usernameLt, storageClusterConfigWhereInput.usernameLt)
                && Objects.equals(this.usernameLte, storageClusterConfigWhereInput.usernameLte)
                && Objects.equals(this.usernameNot, storageClusterConfigWhereInput.usernameNot)
                && Objects.equals(
                        this.usernameNotContains,
                        storageClusterConfigWhereInput.usernameNotContains)
                && Objects.equals(
                        this.usernameNotEndsWith,
                        storageClusterConfigWhereInput.usernameNotEndsWith)
                && Objects.equals(this.usernameNotIn, storageClusterConfigWhereInput.usernameNotIn)
                && Objects.equals(
                        this.usernameNotStartsWith,
                        storageClusterConfigWhereInput.usernameNotStartsWith)
                && Objects.equals(
                        this.usernameStartsWith, storageClusterConfigWhereInput.usernameStartsWith);
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
                computeCluster,
                connectState,
                connectStateIn,
                connectStateNot,
                connectStateNotIn,
                createdTime,
                createdTimeGt,
                createdTimeGte,
                createdTimeIn,
                createdTimeLt,
                createdTimeLte,
                createdTimeNot,
                createdTimeNotIn,
                datastore,
                defaultStorageEncryption,
                defaultStorageEncryptionAlgorithm,
                defaultStorageEncryptionAlgorithmContains,
                defaultStorageEncryptionAlgorithmEndsWith,
                defaultStorageEncryptionAlgorithmGt,
                defaultStorageEncryptionAlgorithmGte,
                defaultStorageEncryptionAlgorithmIn,
                defaultStorageEncryptionAlgorithmLt,
                defaultStorageEncryptionAlgorithmLte,
                defaultStorageEncryptionAlgorithmNot,
                defaultStorageEncryptionAlgorithmNotContains,
                defaultStorageEncryptionAlgorithmNotEndsWith,
                defaultStorageEncryptionAlgorithmNotIn,
                defaultStorageEncryptionAlgorithmNotStartsWith,
                defaultStorageEncryptionAlgorithmStartsWith,
                defaultStorageEncryptionNot,
                defaultStoragePolicy,
                defaultStoragePolicyEcK,
                defaultStoragePolicyEcKGt,
                defaultStoragePolicyEcKGte,
                defaultStoragePolicyEcKIn,
                defaultStoragePolicyEcKLt,
                defaultStoragePolicyEcKLte,
                defaultStoragePolicyEcKNot,
                defaultStoragePolicyEcKNotIn,
                defaultStoragePolicyEcM,
                defaultStoragePolicyEcMGt,
                defaultStoragePolicyEcMGte,
                defaultStoragePolicyEcMIn,
                defaultStoragePolicyEcMLt,
                defaultStoragePolicyEcMLte,
                defaultStoragePolicyEcMNot,
                defaultStoragePolicyEcMNotIn,
                defaultStoragePolicyIn,
                defaultStoragePolicyNot,
                defaultStoragePolicyNotIn,
                defaultStoragePolicyReplicaNum,
                defaultStoragePolicyReplicaNumGt,
                defaultStoragePolicyReplicaNumGte,
                defaultStoragePolicyReplicaNumIn,
                defaultStoragePolicyReplicaNumLt,
                defaultStoragePolicyReplicaNumLte,
                defaultStoragePolicyReplicaNumNot,
                defaultStoragePolicyReplicaNumNotIn,
                defaultStoragePolicyStripeNum,
                defaultStoragePolicyStripeNumGt,
                defaultStoragePolicyStripeNumGte,
                defaultStoragePolicyStripeNumIn,
                defaultStoragePolicyStripeNumLt,
                defaultStoragePolicyStripeNumLte,
                defaultStoragePolicyStripeNumNot,
                defaultStoragePolicyStripeNumNotIn,
                defaultStoragePolicyThinProvision,
                defaultStoragePolicyThinProvisionNot,
                description,
                descriptionContains,
                descriptionEndsWith,
                descriptionGt,
                descriptionGte,
                descriptionIn,
                descriptionLt,
                descriptionLte,
                descriptionNot,
                descriptionNotContains,
                descriptionNotEndsWith,
                descriptionNotIn,
                descriptionNotStartsWith,
                descriptionStartsWith,
                errorState,
                errorStateIn,
                errorStateNot,
                errorStateNotIn,
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
                iscsiPort,
                iscsiPortContains,
                iscsiPortEndsWith,
                iscsiPortGt,
                iscsiPortGte,
                iscsiPortIn,
                iscsiPortLt,
                iscsiPortLte,
                iscsiPortNot,
                iscsiPortNotContains,
                iscsiPortNotEndsWith,
                iscsiPortNotIn,
                iscsiPortNotStartsWith,
                iscsiPortStartsWith,
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
                storageCluster,
                storageClusterUuid,
                storageClusterUuidContains,
                storageClusterUuidEndsWith,
                storageClusterUuidGt,
                storageClusterUuidGte,
                storageClusterUuidIn,
                storageClusterUuidLt,
                storageClusterUuidLte,
                storageClusterUuidNot,
                storageClusterUuidNotContains,
                storageClusterUuidNotEndsWith,
                storageClusterUuidNotIn,
                storageClusterUuidNotStartsWith,
                storageClusterUuidStartsWith,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                username,
                usernameContains,
                usernameEndsWith,
                usernameGt,
                usernameGte,
                usernameIn,
                usernameLt,
                usernameLte,
                usernameNot,
                usernameNotContains,
                usernameNotEndsWith,
                usernameNotIn,
                usernameNotStartsWith,
                usernameStartsWith);
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
        sb.append("class StorageClusterConfigWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    computeCluster: ").append(toIndentedString(computeCluster)).append("\n");
        sb.append("    connectState: ").append(toIndentedString(connectState)).append("\n");
        sb.append("    connectStateIn: ").append(toIndentedString(connectStateIn)).append("\n");
        sb.append("    connectStateNot: ").append(toIndentedString(connectStateNot)).append("\n");
        sb.append("    connectStateNotIn: ")
                .append(toIndentedString(connectStateNotIn))
                .append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    createdTimeGt: ").append(toIndentedString(createdTimeGt)).append("\n");
        sb.append("    createdTimeGte: ").append(toIndentedString(createdTimeGte)).append("\n");
        sb.append("    createdTimeIn: ").append(toIndentedString(createdTimeIn)).append("\n");
        sb.append("    createdTimeLt: ").append(toIndentedString(createdTimeLt)).append("\n");
        sb.append("    createdTimeLte: ").append(toIndentedString(createdTimeLte)).append("\n");
        sb.append("    createdTimeNot: ").append(toIndentedString(createdTimeNot)).append("\n");
        sb.append("    createdTimeNotIn: ").append(toIndentedString(createdTimeNotIn)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    defaultStorageEncryption: ")
                .append(toIndentedString(defaultStorageEncryption))
                .append("\n");
        sb.append("    defaultStorageEncryptionAlgorithm: ")
                .append(toIndentedString(defaultStorageEncryptionAlgorithm))
                .append("\n");
        sb.append("    defaultStorageEncryptionAlgorithmContains: ")
                .append(toIndentedString(defaultStorageEncryptionAlgorithmContains))
                .append("\n");
        sb.append("    defaultStorageEncryptionAlgorithmEndsWith: ")
                .append(toIndentedString(defaultStorageEncryptionAlgorithmEndsWith))
                .append("\n");
        sb.append("    defaultStorageEncryptionAlgorithmGt: ")
                .append(toIndentedString(defaultStorageEncryptionAlgorithmGt))
                .append("\n");
        sb.append("    defaultStorageEncryptionAlgorithmGte: ")
                .append(toIndentedString(defaultStorageEncryptionAlgorithmGte))
                .append("\n");
        sb.append("    defaultStorageEncryptionAlgorithmIn: ")
                .append(toIndentedString(defaultStorageEncryptionAlgorithmIn))
                .append("\n");
        sb.append("    defaultStorageEncryptionAlgorithmLt: ")
                .append(toIndentedString(defaultStorageEncryptionAlgorithmLt))
                .append("\n");
        sb.append("    defaultStorageEncryptionAlgorithmLte: ")
                .append(toIndentedString(defaultStorageEncryptionAlgorithmLte))
                .append("\n");
        sb.append("    defaultStorageEncryptionAlgorithmNot: ")
                .append(toIndentedString(defaultStorageEncryptionAlgorithmNot))
                .append("\n");
        sb.append("    defaultStorageEncryptionAlgorithmNotContains: ")
                .append(toIndentedString(defaultStorageEncryptionAlgorithmNotContains))
                .append("\n");
        sb.append("    defaultStorageEncryptionAlgorithmNotEndsWith: ")
                .append(toIndentedString(defaultStorageEncryptionAlgorithmNotEndsWith))
                .append("\n");
        sb.append("    defaultStorageEncryptionAlgorithmNotIn: ")
                .append(toIndentedString(defaultStorageEncryptionAlgorithmNotIn))
                .append("\n");
        sb.append("    defaultStorageEncryptionAlgorithmNotStartsWith: ")
                .append(toIndentedString(defaultStorageEncryptionAlgorithmNotStartsWith))
                .append("\n");
        sb.append("    defaultStorageEncryptionAlgorithmStartsWith: ")
                .append(toIndentedString(defaultStorageEncryptionAlgorithmStartsWith))
                .append("\n");
        sb.append("    defaultStorageEncryptionNot: ")
                .append(toIndentedString(defaultStorageEncryptionNot))
                .append("\n");
        sb.append("    defaultStoragePolicy: ")
                .append(toIndentedString(defaultStoragePolicy))
                .append("\n");
        sb.append("    defaultStoragePolicyEcK: ")
                .append(toIndentedString(defaultStoragePolicyEcK))
                .append("\n");
        sb.append("    defaultStoragePolicyEcKGt: ")
                .append(toIndentedString(defaultStoragePolicyEcKGt))
                .append("\n");
        sb.append("    defaultStoragePolicyEcKGte: ")
                .append(toIndentedString(defaultStoragePolicyEcKGte))
                .append("\n");
        sb.append("    defaultStoragePolicyEcKIn: ")
                .append(toIndentedString(defaultStoragePolicyEcKIn))
                .append("\n");
        sb.append("    defaultStoragePolicyEcKLt: ")
                .append(toIndentedString(defaultStoragePolicyEcKLt))
                .append("\n");
        sb.append("    defaultStoragePolicyEcKLte: ")
                .append(toIndentedString(defaultStoragePolicyEcKLte))
                .append("\n");
        sb.append("    defaultStoragePolicyEcKNot: ")
                .append(toIndentedString(defaultStoragePolicyEcKNot))
                .append("\n");
        sb.append("    defaultStoragePolicyEcKNotIn: ")
                .append(toIndentedString(defaultStoragePolicyEcKNotIn))
                .append("\n");
        sb.append("    defaultStoragePolicyEcM: ")
                .append(toIndentedString(defaultStoragePolicyEcM))
                .append("\n");
        sb.append("    defaultStoragePolicyEcMGt: ")
                .append(toIndentedString(defaultStoragePolicyEcMGt))
                .append("\n");
        sb.append("    defaultStoragePolicyEcMGte: ")
                .append(toIndentedString(defaultStoragePolicyEcMGte))
                .append("\n");
        sb.append("    defaultStoragePolicyEcMIn: ")
                .append(toIndentedString(defaultStoragePolicyEcMIn))
                .append("\n");
        sb.append("    defaultStoragePolicyEcMLt: ")
                .append(toIndentedString(defaultStoragePolicyEcMLt))
                .append("\n");
        sb.append("    defaultStoragePolicyEcMLte: ")
                .append(toIndentedString(defaultStoragePolicyEcMLte))
                .append("\n");
        sb.append("    defaultStoragePolicyEcMNot: ")
                .append(toIndentedString(defaultStoragePolicyEcMNot))
                .append("\n");
        sb.append("    defaultStoragePolicyEcMNotIn: ")
                .append(toIndentedString(defaultStoragePolicyEcMNotIn))
                .append("\n");
        sb.append("    defaultStoragePolicyIn: ")
                .append(toIndentedString(defaultStoragePolicyIn))
                .append("\n");
        sb.append("    defaultStoragePolicyNot: ")
                .append(toIndentedString(defaultStoragePolicyNot))
                .append("\n");
        sb.append("    defaultStoragePolicyNotIn: ")
                .append(toIndentedString(defaultStoragePolicyNotIn))
                .append("\n");
        sb.append("    defaultStoragePolicyReplicaNum: ")
                .append(toIndentedString(defaultStoragePolicyReplicaNum))
                .append("\n");
        sb.append("    defaultStoragePolicyReplicaNumGt: ")
                .append(toIndentedString(defaultStoragePolicyReplicaNumGt))
                .append("\n");
        sb.append("    defaultStoragePolicyReplicaNumGte: ")
                .append(toIndentedString(defaultStoragePolicyReplicaNumGte))
                .append("\n");
        sb.append("    defaultStoragePolicyReplicaNumIn: ")
                .append(toIndentedString(defaultStoragePolicyReplicaNumIn))
                .append("\n");
        sb.append("    defaultStoragePolicyReplicaNumLt: ")
                .append(toIndentedString(defaultStoragePolicyReplicaNumLt))
                .append("\n");
        sb.append("    defaultStoragePolicyReplicaNumLte: ")
                .append(toIndentedString(defaultStoragePolicyReplicaNumLte))
                .append("\n");
        sb.append("    defaultStoragePolicyReplicaNumNot: ")
                .append(toIndentedString(defaultStoragePolicyReplicaNumNot))
                .append("\n");
        sb.append("    defaultStoragePolicyReplicaNumNotIn: ")
                .append(toIndentedString(defaultStoragePolicyReplicaNumNotIn))
                .append("\n");
        sb.append("    defaultStoragePolicyStripeNum: ")
                .append(toIndentedString(defaultStoragePolicyStripeNum))
                .append("\n");
        sb.append("    defaultStoragePolicyStripeNumGt: ")
                .append(toIndentedString(defaultStoragePolicyStripeNumGt))
                .append("\n");
        sb.append("    defaultStoragePolicyStripeNumGte: ")
                .append(toIndentedString(defaultStoragePolicyStripeNumGte))
                .append("\n");
        sb.append("    defaultStoragePolicyStripeNumIn: ")
                .append(toIndentedString(defaultStoragePolicyStripeNumIn))
                .append("\n");
        sb.append("    defaultStoragePolicyStripeNumLt: ")
                .append(toIndentedString(defaultStoragePolicyStripeNumLt))
                .append("\n");
        sb.append("    defaultStoragePolicyStripeNumLte: ")
                .append(toIndentedString(defaultStoragePolicyStripeNumLte))
                .append("\n");
        sb.append("    defaultStoragePolicyStripeNumNot: ")
                .append(toIndentedString(defaultStoragePolicyStripeNumNot))
                .append("\n");
        sb.append("    defaultStoragePolicyStripeNumNotIn: ")
                .append(toIndentedString(defaultStoragePolicyStripeNumNotIn))
                .append("\n");
        sb.append("    defaultStoragePolicyThinProvision: ")
                .append(toIndentedString(defaultStoragePolicyThinProvision))
                .append("\n");
        sb.append("    defaultStoragePolicyThinProvisionNot: ")
                .append(toIndentedString(defaultStoragePolicyThinProvisionNot))
                .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    descriptionContains: ")
                .append(toIndentedString(descriptionContains))
                .append("\n");
        sb.append("    descriptionEndsWith: ")
                .append(toIndentedString(descriptionEndsWith))
                .append("\n");
        sb.append("    descriptionGt: ").append(toIndentedString(descriptionGt)).append("\n");
        sb.append("    descriptionGte: ").append(toIndentedString(descriptionGte)).append("\n");
        sb.append("    descriptionIn: ").append(toIndentedString(descriptionIn)).append("\n");
        sb.append("    descriptionLt: ").append(toIndentedString(descriptionLt)).append("\n");
        sb.append("    descriptionLte: ").append(toIndentedString(descriptionLte)).append("\n");
        sb.append("    descriptionNot: ").append(toIndentedString(descriptionNot)).append("\n");
        sb.append("    descriptionNotContains: ")
                .append(toIndentedString(descriptionNotContains))
                .append("\n");
        sb.append("    descriptionNotEndsWith: ")
                .append(toIndentedString(descriptionNotEndsWith))
                .append("\n");
        sb.append("    descriptionNotIn: ").append(toIndentedString(descriptionNotIn)).append("\n");
        sb.append("    descriptionNotStartsWith: ")
                .append(toIndentedString(descriptionNotStartsWith))
                .append("\n");
        sb.append("    descriptionStartsWith: ")
                .append(toIndentedString(descriptionStartsWith))
                .append("\n");
        sb.append("    errorState: ").append(toIndentedString(errorState)).append("\n");
        sb.append("    errorStateIn: ").append(toIndentedString(errorStateIn)).append("\n");
        sb.append("    errorStateNot: ").append(toIndentedString(errorStateNot)).append("\n");
        sb.append("    errorStateNotIn: ").append(toIndentedString(errorStateNotIn)).append("\n");
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
        sb.append("    iscsiPort: ").append(toIndentedString(iscsiPort)).append("\n");
        sb.append("    iscsiPortContains: ")
                .append(toIndentedString(iscsiPortContains))
                .append("\n");
        sb.append("    iscsiPortEndsWith: ")
                .append(toIndentedString(iscsiPortEndsWith))
                .append("\n");
        sb.append("    iscsiPortGt: ").append(toIndentedString(iscsiPortGt)).append("\n");
        sb.append("    iscsiPortGte: ").append(toIndentedString(iscsiPortGte)).append("\n");
        sb.append("    iscsiPortIn: ").append(toIndentedString(iscsiPortIn)).append("\n");
        sb.append("    iscsiPortLt: ").append(toIndentedString(iscsiPortLt)).append("\n");
        sb.append("    iscsiPortLte: ").append(toIndentedString(iscsiPortLte)).append("\n");
        sb.append("    iscsiPortNot: ").append(toIndentedString(iscsiPortNot)).append("\n");
        sb.append("    iscsiPortNotContains: ")
                .append(toIndentedString(iscsiPortNotContains))
                .append("\n");
        sb.append("    iscsiPortNotEndsWith: ")
                .append(toIndentedString(iscsiPortNotEndsWith))
                .append("\n");
        sb.append("    iscsiPortNotIn: ").append(toIndentedString(iscsiPortNotIn)).append("\n");
        sb.append("    iscsiPortNotStartsWith: ")
                .append(toIndentedString(iscsiPortNotStartsWith))
                .append("\n");
        sb.append("    iscsiPortStartsWith: ")
                .append(toIndentedString(iscsiPortStartsWith))
                .append("\n");
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
        sb.append("    storageCluster: ").append(toIndentedString(storageCluster)).append("\n");
        sb.append("    storageClusterUuid: ")
                .append(toIndentedString(storageClusterUuid))
                .append("\n");
        sb.append("    storageClusterUuidContains: ")
                .append(toIndentedString(storageClusterUuidContains))
                .append("\n");
        sb.append("    storageClusterUuidEndsWith: ")
                .append(toIndentedString(storageClusterUuidEndsWith))
                .append("\n");
        sb.append("    storageClusterUuidGt: ")
                .append(toIndentedString(storageClusterUuidGt))
                .append("\n");
        sb.append("    storageClusterUuidGte: ")
                .append(toIndentedString(storageClusterUuidGte))
                .append("\n");
        sb.append("    storageClusterUuidIn: ")
                .append(toIndentedString(storageClusterUuidIn))
                .append("\n");
        sb.append("    storageClusterUuidLt: ")
                .append(toIndentedString(storageClusterUuidLt))
                .append("\n");
        sb.append("    storageClusterUuidLte: ")
                .append(toIndentedString(storageClusterUuidLte))
                .append("\n");
        sb.append("    storageClusterUuidNot: ")
                .append(toIndentedString(storageClusterUuidNot))
                .append("\n");
        sb.append("    storageClusterUuidNotContains: ")
                .append(toIndentedString(storageClusterUuidNotContains))
                .append("\n");
        sb.append("    storageClusterUuidNotEndsWith: ")
                .append(toIndentedString(storageClusterUuidNotEndsWith))
                .append("\n");
        sb.append("    storageClusterUuidNotIn: ")
                .append(toIndentedString(storageClusterUuidNotIn))
                .append("\n");
        sb.append("    storageClusterUuidNotStartsWith: ")
                .append(toIndentedString(storageClusterUuidNotStartsWith))
                .append("\n");
        sb.append("    storageClusterUuidStartsWith: ")
                .append(toIndentedString(storageClusterUuidStartsWith))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    usernameContains: ").append(toIndentedString(usernameContains)).append("\n");
        sb.append("    usernameEndsWith: ").append(toIndentedString(usernameEndsWith)).append("\n");
        sb.append("    usernameGt: ").append(toIndentedString(usernameGt)).append("\n");
        sb.append("    usernameGte: ").append(toIndentedString(usernameGte)).append("\n");
        sb.append("    usernameIn: ").append(toIndentedString(usernameIn)).append("\n");
        sb.append("    usernameLt: ").append(toIndentedString(usernameLt)).append("\n");
        sb.append("    usernameLte: ").append(toIndentedString(usernameLte)).append("\n");
        sb.append("    usernameNot: ").append(toIndentedString(usernameNot)).append("\n");
        sb.append("    usernameNotContains: ")
                .append(toIndentedString(usernameNotContains))
                .append("\n");
        sb.append("    usernameNotEndsWith: ")
                .append(toIndentedString(usernameNotEndsWith))
                .append("\n");
        sb.append("    usernameNotIn: ").append(toIndentedString(usernameNotIn)).append("\n");
        sb.append("    usernameNotStartsWith: ")
                .append(toIndentedString(usernameNotStartsWith))
                .append("\n");
        sb.append("    usernameStartsWith: ")
                .append(toIndentedString(usernameStartsWith))
                .append("\n");
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
