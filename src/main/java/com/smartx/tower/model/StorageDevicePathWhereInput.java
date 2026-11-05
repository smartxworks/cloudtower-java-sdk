package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** StorageDevicePathWhereInput */
@javax.annotation.Generated(value = "JavaCloudTowerClientCodegen")
public class StorageDevicePathWhereInput
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<StorageDevicePathWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<StorageDevicePathWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<StorageDevicePathWhereInput> OR = null;

    public static final String SERIALIZED_NAME_BLOCK_DEVICE_NAME = "block_device_name";

    @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_NAME)
    private String blockDeviceName;

    public static final String SERIALIZED_NAME_BLOCK_DEVICE_NAME_CONTAINS =
            "block_device_name_contains";

    @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_NAME_CONTAINS)
    private String blockDeviceNameContains;

    public static final String SERIALIZED_NAME_BLOCK_DEVICE_NAME_ENDS_WITH =
            "block_device_name_ends_with";

    @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_NAME_ENDS_WITH)
    private String blockDeviceNameEndsWith;

    public static final String SERIALIZED_NAME_BLOCK_DEVICE_NAME_GT = "block_device_name_gt";

    @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_NAME_GT)
    private String blockDeviceNameGt;

    public static final String SERIALIZED_NAME_BLOCK_DEVICE_NAME_GTE = "block_device_name_gte";

    @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_NAME_GTE)
    private String blockDeviceNameGte;

    public static final String SERIALIZED_NAME_BLOCK_DEVICE_NAME_IN = "block_device_name_in";

    @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_NAME_IN)
    private List<String> blockDeviceNameIn = null;

    public static final String SERIALIZED_NAME_BLOCK_DEVICE_NAME_LT = "block_device_name_lt";

    @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_NAME_LT)
    private String blockDeviceNameLt;

    public static final String SERIALIZED_NAME_BLOCK_DEVICE_NAME_LTE = "block_device_name_lte";

    @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_NAME_LTE)
    private String blockDeviceNameLte;

    public static final String SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT = "block_device_name_not";

    @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT)
    private String blockDeviceNameNot;

    public static final String SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_CONTAINS =
            "block_device_name_not_contains";

    @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_CONTAINS)
    private String blockDeviceNameNotContains;

    public static final String SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_ENDS_WITH =
            "block_device_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_ENDS_WITH)
    private String blockDeviceNameNotEndsWith;

    public static final String SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_IN =
            "block_device_name_not_in";

    @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_IN)
    private List<String> blockDeviceNameNotIn = null;

    public static final String SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_STARTS_WITH =
            "block_device_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_STARTS_WITH)
    private String blockDeviceNameNotStartsWith;

    public static final String SERIALIZED_NAME_BLOCK_DEVICE_NAME_STARTS_WITH =
            "block_device_name_starts_with";

    @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_NAME_STARTS_WITH)
    private String blockDeviceNameStartsWith;

    public static final String SERIALIZED_NAME_DATA_VERSION = "data_version";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION)
    private Integer dataVersion;

    public static final String SERIALIZED_NAME_DATA_VERSION_GT = "data_version_gt";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_GT)
    private Integer dataVersionGt;

    public static final String SERIALIZED_NAME_DATA_VERSION_GTE = "data_version_gte";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_GTE)
    private Integer dataVersionGte;

    public static final String SERIALIZED_NAME_DATA_VERSION_IN = "data_version_in";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_IN)
    private List<Integer> dataVersionIn = null;

    public static final String SERIALIZED_NAME_DATA_VERSION_LT = "data_version_lt";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_LT)
    private Integer dataVersionLt;

    public static final String SERIALIZED_NAME_DATA_VERSION_LTE = "data_version_lte";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_LTE)
    private Integer dataVersionLte;

    public static final String SERIALIZED_NAME_DATA_VERSION_NOT = "data_version_not";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_NOT)
    private Integer dataVersionNot;

    public static final String SERIALIZED_NAME_DATA_VERSION_NOT_IN = "data_version_not_in";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_NOT_IN)
    private List<Integer> dataVersionNotIn = null;

    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_ENABLED_NOT = "enabled_not";

    @SerializedName(SERIALIZED_NAME_ENABLED_NOT)
    private Boolean enabledNot;

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

    public static final String SERIALIZED_NAME_HOST_CONNECTION = "host_connection";

    @SerializedName(SERIALIZED_NAME_HOST_CONNECTION)
    private StorageDeviceHostConnectionWhereInput hostConnection;

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

    public static final String SERIALIZED_NAME_LOCAL_HASH = "local_hash";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH)
    private String localHash;

    public static final String SERIALIZED_NAME_LOCAL_HASH_CONTAINS = "local_hash_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_CONTAINS)
    private String localHashContains;

    public static final String SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH = "local_hash_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH)
    private String localHashEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_HASH_GT = "local_hash_gt";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_GT)
    private String localHashGt;

    public static final String SERIALIZED_NAME_LOCAL_HASH_GTE = "local_hash_gte";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_GTE)
    private String localHashGte;

    public static final String SERIALIZED_NAME_LOCAL_HASH_IN = "local_hash_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_IN)
    private List<String> localHashIn = null;

    public static final String SERIALIZED_NAME_LOCAL_HASH_LT = "local_hash_lt";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_LT)
    private String localHashLt;

    public static final String SERIALIZED_NAME_LOCAL_HASH_LTE = "local_hash_lte";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_LTE)
    private String localHashLte;

    public static final String SERIALIZED_NAME_LOCAL_HASH_NOT = "local_hash_not";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_NOT)
    private String localHashNot;

    public static final String SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS = "local_hash_not_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS)
    private String localHashNotContains;

    public static final String SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH =
            "local_hash_not_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH)
    private String localHashNotEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_HASH_NOT_IN = "local_hash_not_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_NOT_IN)
    private List<String> localHashNotIn = null;

    public static final String SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH =
            "local_hash_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH)
    private String localHashNotStartsWith;

    public static final String SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH = "local_hash_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH)
    private String localHashStartsWith;

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

    public static final String SERIALIZED_NAME_PATH = "path";

    @SerializedName(SERIALIZED_NAME_PATH)
    private String path;

    public static final String SERIALIZED_NAME_PATH_CONTAINS = "path_contains";

    @SerializedName(SERIALIZED_NAME_PATH_CONTAINS)
    private String pathContains;

    public static final String SERIALIZED_NAME_PATH_ENDS_WITH = "path_ends_with";

    @SerializedName(SERIALIZED_NAME_PATH_ENDS_WITH)
    private String pathEndsWith;

    public static final String SERIALIZED_NAME_PATH_GT = "path_gt";

    @SerializedName(SERIALIZED_NAME_PATH_GT)
    private String pathGt;

    public static final String SERIALIZED_NAME_PATH_GTE = "path_gte";

    @SerializedName(SERIALIZED_NAME_PATH_GTE)
    private String pathGte;

    public static final String SERIALIZED_NAME_PATH_IN = "path_in";

    @SerializedName(SERIALIZED_NAME_PATH_IN)
    private List<String> pathIn = null;

    public static final String SERIALIZED_NAME_PATH_LT = "path_lt";

    @SerializedName(SERIALIZED_NAME_PATH_LT)
    private String pathLt;

    public static final String SERIALIZED_NAME_PATH_LTE = "path_lte";

    @SerializedName(SERIALIZED_NAME_PATH_LTE)
    private String pathLte;

    public static final String SERIALIZED_NAME_PATH_NOT = "path_not";

    @SerializedName(SERIALIZED_NAME_PATH_NOT)
    private String pathNot;

    public static final String SERIALIZED_NAME_PATH_NOT_CONTAINS = "path_not_contains";

    @SerializedName(SERIALIZED_NAME_PATH_NOT_CONTAINS)
    private String pathNotContains;

    public static final String SERIALIZED_NAME_PATH_NOT_ENDS_WITH = "path_not_ends_with";

    @SerializedName(SERIALIZED_NAME_PATH_NOT_ENDS_WITH)
    private String pathNotEndsWith;

    public static final String SERIALIZED_NAME_PATH_NOT_IN = "path_not_in";

    @SerializedName(SERIALIZED_NAME_PATH_NOT_IN)
    private List<String> pathNotIn = null;

    public static final String SERIALIZED_NAME_PATH_NOT_STARTS_WITH = "path_not_starts_with";

    @SerializedName(SERIALIZED_NAME_PATH_NOT_STARTS_WITH)
    private String pathNotStartsWith;

    public static final String SERIALIZED_NAME_PATH_STARTS_WITH = "path_starts_with";

    @SerializedName(SERIALIZED_NAME_PATH_STARTS_WITH)
    private String pathStartsWith;

    public static final String SERIALIZED_NAME_RUNTIME_NAME = "runtime_name";

    @SerializedName(SERIALIZED_NAME_RUNTIME_NAME)
    private String runtimeName;

    public static final String SERIALIZED_NAME_RUNTIME_NAME_CONTAINS = "runtime_name_contains";

    @SerializedName(SERIALIZED_NAME_RUNTIME_NAME_CONTAINS)
    private String runtimeNameContains;

    public static final String SERIALIZED_NAME_RUNTIME_NAME_ENDS_WITH = "runtime_name_ends_with";

    @SerializedName(SERIALIZED_NAME_RUNTIME_NAME_ENDS_WITH)
    private String runtimeNameEndsWith;

    public static final String SERIALIZED_NAME_RUNTIME_NAME_GT = "runtime_name_gt";

    @SerializedName(SERIALIZED_NAME_RUNTIME_NAME_GT)
    private String runtimeNameGt;

    public static final String SERIALIZED_NAME_RUNTIME_NAME_GTE = "runtime_name_gte";

    @SerializedName(SERIALIZED_NAME_RUNTIME_NAME_GTE)
    private String runtimeNameGte;

    public static final String SERIALIZED_NAME_RUNTIME_NAME_IN = "runtime_name_in";

    @SerializedName(SERIALIZED_NAME_RUNTIME_NAME_IN)
    private List<String> runtimeNameIn = null;

    public static final String SERIALIZED_NAME_RUNTIME_NAME_LT = "runtime_name_lt";

    @SerializedName(SERIALIZED_NAME_RUNTIME_NAME_LT)
    private String runtimeNameLt;

    public static final String SERIALIZED_NAME_RUNTIME_NAME_LTE = "runtime_name_lte";

    @SerializedName(SERIALIZED_NAME_RUNTIME_NAME_LTE)
    private String runtimeNameLte;

    public static final String SERIALIZED_NAME_RUNTIME_NAME_NOT = "runtime_name_not";

    @SerializedName(SERIALIZED_NAME_RUNTIME_NAME_NOT)
    private String runtimeNameNot;

    public static final String SERIALIZED_NAME_RUNTIME_NAME_NOT_CONTAINS =
            "runtime_name_not_contains";

    @SerializedName(SERIALIZED_NAME_RUNTIME_NAME_NOT_CONTAINS)
    private String runtimeNameNotContains;

    public static final String SERIALIZED_NAME_RUNTIME_NAME_NOT_ENDS_WITH =
            "runtime_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_RUNTIME_NAME_NOT_ENDS_WITH)
    private String runtimeNameNotEndsWith;

    public static final String SERIALIZED_NAME_RUNTIME_NAME_NOT_IN = "runtime_name_not_in";

    @SerializedName(SERIALIZED_NAME_RUNTIME_NAME_NOT_IN)
    private List<String> runtimeNameNotIn = null;

    public static final String SERIALIZED_NAME_RUNTIME_NAME_NOT_STARTS_WITH =
            "runtime_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_RUNTIME_NAME_NOT_STARTS_WITH)
    private String runtimeNameNotStartsWith;

    public static final String SERIALIZED_NAME_RUNTIME_NAME_STARTS_WITH =
            "runtime_name_starts_with";

    @SerializedName(SERIALIZED_NAME_RUNTIME_NAME_STARTS_WITH)
    private String runtimeNameStartsWith;

    public static final String SERIALIZED_NAME_STATE = "state";

    @SerializedName(SERIALIZED_NAME_STATE)
    private StorageDevicePathState state;

    public static final String SERIALIZED_NAME_STATE_IN = "state_in";

    @SerializedName(SERIALIZED_NAME_STATE_IN)
    private List<StorageDevicePathState> stateIn = null;

    public static final String SERIALIZED_NAME_STATE_NOT = "state_not";

    @SerializedName(SERIALIZED_NAME_STATE_NOT)
    private StorageDevicePathState stateNot;

    public static final String SERIALIZED_NAME_STATE_NOT_IN = "state_not_in";

    @SerializedName(SERIALIZED_NAME_STATE_NOT_IN)
    private List<StorageDevicePathState> stateNotIn = null;

    public static final String SERIALIZED_NAME_STORAGE_ADAPTER = "storage_adapter";

    @SerializedName(SERIALIZED_NAME_STORAGE_ADAPTER)
    private StorageAdapterWhereInput storageAdapter;

    public static final String SERIALIZED_NAME_STORAGE_DEVICE = "storage_device";

    @SerializedName(SERIALIZED_NAME_STORAGE_DEVICE)
    private StorageDeviceWhereInput storageDevice;

    public static final String SERIALIZED_NAME_TARGET = "target";

    @SerializedName(SERIALIZED_NAME_TARGET)
    private String target;

    public static final String SERIALIZED_NAME_TARGET_CONTAINS = "target_contains";

    @SerializedName(SERIALIZED_NAME_TARGET_CONTAINS)
    private String targetContains;

    public static final String SERIALIZED_NAME_TARGET_ENDS_WITH = "target_ends_with";

    @SerializedName(SERIALIZED_NAME_TARGET_ENDS_WITH)
    private String targetEndsWith;

    public static final String SERIALIZED_NAME_TARGET_GT = "target_gt";

    @SerializedName(SERIALIZED_NAME_TARGET_GT)
    private String targetGt;

    public static final String SERIALIZED_NAME_TARGET_GTE = "target_gte";

    @SerializedName(SERIALIZED_NAME_TARGET_GTE)
    private String targetGte;

    public static final String SERIALIZED_NAME_TARGET_IN = "target_in";

    @SerializedName(SERIALIZED_NAME_TARGET_IN)
    private List<String> targetIn = null;

    public static final String SERIALIZED_NAME_TARGET_LT = "target_lt";

    @SerializedName(SERIALIZED_NAME_TARGET_LT)
    private String targetLt;

    public static final String SERIALIZED_NAME_TARGET_LTE = "target_lte";

    @SerializedName(SERIALIZED_NAME_TARGET_LTE)
    private String targetLte;

    public static final String SERIALIZED_NAME_TARGET_NOT = "target_not";

    @SerializedName(SERIALIZED_NAME_TARGET_NOT)
    private String targetNot;

    public static final String SERIALIZED_NAME_TARGET_NOT_CONTAINS = "target_not_contains";

    @SerializedName(SERIALIZED_NAME_TARGET_NOT_CONTAINS)
    private String targetNotContains;

    public static final String SERIALIZED_NAME_TARGET_NOT_ENDS_WITH = "target_not_ends_with";

    @SerializedName(SERIALIZED_NAME_TARGET_NOT_ENDS_WITH)
    private String targetNotEndsWith;

    public static final String SERIALIZED_NAME_TARGET_NOT_IN = "target_not_in";

    @SerializedName(SERIALIZED_NAME_TARGET_NOT_IN)
    private List<String> targetNotIn = null;

    public static final String SERIALIZED_NAME_TARGET_NOT_STARTS_WITH = "target_not_starts_with";

    @SerializedName(SERIALIZED_NAME_TARGET_NOT_STARTS_WITH)
    private String targetNotStartsWith;

    public static final String SERIALIZED_NAME_TARGET_STARTS_WITH = "target_starts_with";

    @SerializedName(SERIALIZED_NAME_TARGET_STARTS_WITH)
    private String targetStartsWith;

    public static final String SERIALIZED_NAME_TRANSPORT = "transport";

    @SerializedName(SERIALIZED_NAME_TRANSPORT)
    private String transport;

    public static final String SERIALIZED_NAME_TRANSPORT_CONTAINS = "transport_contains";

    @SerializedName(SERIALIZED_NAME_TRANSPORT_CONTAINS)
    private String transportContains;

    public static final String SERIALIZED_NAME_TRANSPORT_ENDS_WITH = "transport_ends_with";

    @SerializedName(SERIALIZED_NAME_TRANSPORT_ENDS_WITH)
    private String transportEndsWith;

    public static final String SERIALIZED_NAME_TRANSPORT_GT = "transport_gt";

    @SerializedName(SERIALIZED_NAME_TRANSPORT_GT)
    private String transportGt;

    public static final String SERIALIZED_NAME_TRANSPORT_GTE = "transport_gte";

    @SerializedName(SERIALIZED_NAME_TRANSPORT_GTE)
    private String transportGte;

    public static final String SERIALIZED_NAME_TRANSPORT_IN = "transport_in";

    @SerializedName(SERIALIZED_NAME_TRANSPORT_IN)
    private List<String> transportIn = null;

    public static final String SERIALIZED_NAME_TRANSPORT_LT = "transport_lt";

    @SerializedName(SERIALIZED_NAME_TRANSPORT_LT)
    private String transportLt;

    public static final String SERIALIZED_NAME_TRANSPORT_LTE = "transport_lte";

    @SerializedName(SERIALIZED_NAME_TRANSPORT_LTE)
    private String transportLte;

    public static final String SERIALIZED_NAME_TRANSPORT_NOT = "transport_not";

    @SerializedName(SERIALIZED_NAME_TRANSPORT_NOT)
    private String transportNot;

    public static final String SERIALIZED_NAME_TRANSPORT_NOT_CONTAINS = "transport_not_contains";

    @SerializedName(SERIALIZED_NAME_TRANSPORT_NOT_CONTAINS)
    private String transportNotContains;

    public static final String SERIALIZED_NAME_TRANSPORT_NOT_ENDS_WITH = "transport_not_ends_with";

    @SerializedName(SERIALIZED_NAME_TRANSPORT_NOT_ENDS_WITH)
    private String transportNotEndsWith;

    public static final String SERIALIZED_NAME_TRANSPORT_NOT_IN = "transport_not_in";

    @SerializedName(SERIALIZED_NAME_TRANSPORT_NOT_IN)
    private List<String> transportNotIn = null;

    public static final String SERIALIZED_NAME_TRANSPORT_NOT_STARTS_WITH =
            "transport_not_starts_with";

    @SerializedName(SERIALIZED_NAME_TRANSPORT_NOT_STARTS_WITH)
    private String transportNotStartsWith;

    public static final String SERIALIZED_NAME_TRANSPORT_STARTS_WITH = "transport_starts_with";

    @SerializedName(SERIALIZED_NAME_TRANSPORT_STARTS_WITH)
    private String transportStartsWith;

    public StorageDevicePathWhereInput() {}

    public StorageDevicePathWhereInput AND(List<StorageDevicePathWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public StorageDevicePathWhereInput addANDItem(StorageDevicePathWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<StorageDevicePathWhereInput>();
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
    public List<StorageDevicePathWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<StorageDevicePathWhereInput> AND) {
        this.AND = AND;
    }

    public StorageDevicePathWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public StorageDevicePathWhereInput AND_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput NOT(List<StorageDevicePathWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public StorageDevicePathWhereInput addNOTItem(StorageDevicePathWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<StorageDevicePathWhereInput>();
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
    public List<StorageDevicePathWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<StorageDevicePathWhereInput> NOT) {
        this.NOT = NOT;
    }

    public StorageDevicePathWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public StorageDevicePathWhereInput NOT_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput OR(List<StorageDevicePathWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public StorageDevicePathWhereInput addORItem(StorageDevicePathWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<StorageDevicePathWhereInput>();
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
    public List<StorageDevicePathWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<StorageDevicePathWhereInput> OR) {
        this.OR = OR;
    }

    public StorageDevicePathWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public StorageDevicePathWhereInput OR_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput blockDeviceName(String blockDeviceName) {

        this.blockDeviceName = blockDeviceName;
        return this;
    }

    /**
     * Get blockDeviceName
     *
     * @return blockDeviceName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBlockDeviceName() {
        return blockDeviceName;
    }

    public void setBlockDeviceName(String blockDeviceName) {
        this.blockDeviceName = blockDeviceName;
    }

    public StorageDevicePathWhereInput blockDeviceName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME);
        return this;
    }

    public StorageDevicePathWhereInput blockDeviceName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME);
        return this;
    }

    public void setBlockDeviceName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME);
        }
    }

    public boolean getBlockDeviceName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BLOCK_DEVICE_NAME);
    }

    public StorageDevicePathWhereInput blockDeviceNameContains(String blockDeviceNameContains) {

        this.blockDeviceNameContains = blockDeviceNameContains;
        return this;
    }

    /**
     * Get blockDeviceNameContains
     *
     * @return blockDeviceNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBlockDeviceNameContains() {
        return blockDeviceNameContains;
    }

    public void setBlockDeviceNameContains(String blockDeviceNameContains) {
        this.blockDeviceNameContains = blockDeviceNameContains;
    }

    public StorageDevicePathWhereInput blockDeviceNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_CONTAINS);
        return this;
    }

    public StorageDevicePathWhereInput blockDeviceNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_CONTAINS);
        return this;
    }

    public void setBlockDeviceNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_CONTAINS);
        }
    }

    public boolean getBlockDeviceNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BLOCK_DEVICE_NAME_CONTAINS);
    }

    public StorageDevicePathWhereInput blockDeviceNameEndsWith(String blockDeviceNameEndsWith) {

        this.blockDeviceNameEndsWith = blockDeviceNameEndsWith;
        return this;
    }

    /**
     * Get blockDeviceNameEndsWith
     *
     * @return blockDeviceNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBlockDeviceNameEndsWith() {
        return blockDeviceNameEndsWith;
    }

    public void setBlockDeviceNameEndsWith(String blockDeviceNameEndsWith) {
        this.blockDeviceNameEndsWith = blockDeviceNameEndsWith;
    }

    public StorageDevicePathWhereInput blockDeviceNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_ENDS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput blockDeviceNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_ENDS_WITH);
        return this;
    }

    public void setBlockDeviceNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_ENDS_WITH);
        }
    }

    public boolean getBlockDeviceNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BLOCK_DEVICE_NAME_ENDS_WITH);
    }

    public StorageDevicePathWhereInput blockDeviceNameGt(String blockDeviceNameGt) {

        this.blockDeviceNameGt = blockDeviceNameGt;
        return this;
    }

    /**
     * Get blockDeviceNameGt
     *
     * @return blockDeviceNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBlockDeviceNameGt() {
        return blockDeviceNameGt;
    }

    public void setBlockDeviceNameGt(String blockDeviceNameGt) {
        this.blockDeviceNameGt = blockDeviceNameGt;
    }

    public StorageDevicePathWhereInput blockDeviceNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_GT);
        return this;
    }

    public StorageDevicePathWhereInput blockDeviceNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_GT);
        return this;
    }

    public void setBlockDeviceNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_GT);
        }
    }

    public boolean getBlockDeviceNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BLOCK_DEVICE_NAME_GT);
    }

    public StorageDevicePathWhereInput blockDeviceNameGte(String blockDeviceNameGte) {

        this.blockDeviceNameGte = blockDeviceNameGte;
        return this;
    }

    /**
     * Get blockDeviceNameGte
     *
     * @return blockDeviceNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBlockDeviceNameGte() {
        return blockDeviceNameGte;
    }

    public void setBlockDeviceNameGte(String blockDeviceNameGte) {
        this.blockDeviceNameGte = blockDeviceNameGte;
    }

    public StorageDevicePathWhereInput blockDeviceNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_GTE);
        return this;
    }

    public StorageDevicePathWhereInput blockDeviceNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_GTE);
        return this;
    }

    public void setBlockDeviceNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_GTE);
        }
    }

    public boolean getBlockDeviceNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BLOCK_DEVICE_NAME_GTE);
    }

    public StorageDevicePathWhereInput blockDeviceNameIn(List<String> blockDeviceNameIn) {

        this.blockDeviceNameIn = blockDeviceNameIn;
        return this;
    }

    public StorageDevicePathWhereInput addBlockDeviceNameInItem(String blockDeviceNameInItem) {
        if (this.blockDeviceNameIn == null) {
            this.blockDeviceNameIn = new ArrayList<String>();
        }
        this.blockDeviceNameIn.add(blockDeviceNameInItem);
        return this;
    }

    /**
     * Get blockDeviceNameIn
     *
     * @return blockDeviceNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getBlockDeviceNameIn() {
        return blockDeviceNameIn;
    }

    public void setBlockDeviceNameIn(List<String> blockDeviceNameIn) {
        this.blockDeviceNameIn = blockDeviceNameIn;
    }

    public StorageDevicePathWhereInput blockDeviceNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_IN);
        return this;
    }

    public StorageDevicePathWhereInput blockDeviceNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_IN);
        return this;
    }

    public void setBlockDeviceNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_IN);
        }
    }

    public boolean getBlockDeviceNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BLOCK_DEVICE_NAME_IN);
    }

    public StorageDevicePathWhereInput blockDeviceNameLt(String blockDeviceNameLt) {

        this.blockDeviceNameLt = blockDeviceNameLt;
        return this;
    }

    /**
     * Get blockDeviceNameLt
     *
     * @return blockDeviceNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBlockDeviceNameLt() {
        return blockDeviceNameLt;
    }

    public void setBlockDeviceNameLt(String blockDeviceNameLt) {
        this.blockDeviceNameLt = blockDeviceNameLt;
    }

    public StorageDevicePathWhereInput blockDeviceNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_LT);
        return this;
    }

    public StorageDevicePathWhereInput blockDeviceNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_LT);
        return this;
    }

    public void setBlockDeviceNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_LT);
        }
    }

    public boolean getBlockDeviceNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BLOCK_DEVICE_NAME_LT);
    }

    public StorageDevicePathWhereInput blockDeviceNameLte(String blockDeviceNameLte) {

        this.blockDeviceNameLte = blockDeviceNameLte;
        return this;
    }

    /**
     * Get blockDeviceNameLte
     *
     * @return blockDeviceNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBlockDeviceNameLte() {
        return blockDeviceNameLte;
    }

    public void setBlockDeviceNameLte(String blockDeviceNameLte) {
        this.blockDeviceNameLte = blockDeviceNameLte;
    }

    public StorageDevicePathWhereInput blockDeviceNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_LTE);
        return this;
    }

    public StorageDevicePathWhereInput blockDeviceNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_LTE);
        return this;
    }

    public void setBlockDeviceNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_LTE);
        }
    }

    public boolean getBlockDeviceNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BLOCK_DEVICE_NAME_LTE);
    }

    public StorageDevicePathWhereInput blockDeviceNameNot(String blockDeviceNameNot) {

        this.blockDeviceNameNot = blockDeviceNameNot;
        return this;
    }

    /**
     * Get blockDeviceNameNot
     *
     * @return blockDeviceNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBlockDeviceNameNot() {
        return blockDeviceNameNot;
    }

    public void setBlockDeviceNameNot(String blockDeviceNameNot) {
        this.blockDeviceNameNot = blockDeviceNameNot;
    }

    public StorageDevicePathWhereInput blockDeviceNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT);
        return this;
    }

    public StorageDevicePathWhereInput blockDeviceNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT);
        return this;
    }

    public void setBlockDeviceNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT);
        }
    }

    public boolean getBlockDeviceNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT);
    }

    public StorageDevicePathWhereInput blockDeviceNameNotContains(
            String blockDeviceNameNotContains) {

        this.blockDeviceNameNotContains = blockDeviceNameNotContains;
        return this;
    }

    /**
     * Get blockDeviceNameNotContains
     *
     * @return blockDeviceNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBlockDeviceNameNotContains() {
        return blockDeviceNameNotContains;
    }

    public void setBlockDeviceNameNotContains(String blockDeviceNameNotContains) {
        this.blockDeviceNameNotContains = blockDeviceNameNotContains;
    }

    public StorageDevicePathWhereInput blockDeviceNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_CONTAINS);
        return this;
    }

    public StorageDevicePathWhereInput blockDeviceNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_CONTAINS);
        return this;
    }

    public void setBlockDeviceNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_CONTAINS);
        }
    }

    public boolean getBlockDeviceNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_CONTAINS);
    }

    public StorageDevicePathWhereInput blockDeviceNameNotEndsWith(
            String blockDeviceNameNotEndsWith) {

        this.blockDeviceNameNotEndsWith = blockDeviceNameNotEndsWith;
        return this;
    }

    /**
     * Get blockDeviceNameNotEndsWith
     *
     * @return blockDeviceNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBlockDeviceNameNotEndsWith() {
        return blockDeviceNameNotEndsWith;
    }

    public void setBlockDeviceNameNotEndsWith(String blockDeviceNameNotEndsWith) {
        this.blockDeviceNameNotEndsWith = blockDeviceNameNotEndsWith;
    }

    public StorageDevicePathWhereInput blockDeviceNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_ENDS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput blockDeviceNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setBlockDeviceNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getBlockDeviceNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_ENDS_WITH);
    }

    public StorageDevicePathWhereInput blockDeviceNameNotIn(List<String> blockDeviceNameNotIn) {

        this.blockDeviceNameNotIn = blockDeviceNameNotIn;
        return this;
    }

    public StorageDevicePathWhereInput addBlockDeviceNameNotInItem(
            String blockDeviceNameNotInItem) {
        if (this.blockDeviceNameNotIn == null) {
            this.blockDeviceNameNotIn = new ArrayList<String>();
        }
        this.blockDeviceNameNotIn.add(blockDeviceNameNotInItem);
        return this;
    }

    /**
     * Get blockDeviceNameNotIn
     *
     * @return blockDeviceNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getBlockDeviceNameNotIn() {
        return blockDeviceNameNotIn;
    }

    public void setBlockDeviceNameNotIn(List<String> blockDeviceNameNotIn) {
        this.blockDeviceNameNotIn = blockDeviceNameNotIn;
    }

    public StorageDevicePathWhereInput blockDeviceNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_IN);
        return this;
    }

    public StorageDevicePathWhereInput blockDeviceNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_IN);
        return this;
    }

    public void setBlockDeviceNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_IN);
        }
    }

    public boolean getBlockDeviceNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_IN);
    }

    public StorageDevicePathWhereInput blockDeviceNameNotStartsWith(
            String blockDeviceNameNotStartsWith) {

        this.blockDeviceNameNotStartsWith = blockDeviceNameNotStartsWith;
        return this;
    }

    /**
     * Get blockDeviceNameNotStartsWith
     *
     * @return blockDeviceNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBlockDeviceNameNotStartsWith() {
        return blockDeviceNameNotStartsWith;
    }

    public void setBlockDeviceNameNotStartsWith(String blockDeviceNameNotStartsWith) {
        this.blockDeviceNameNotStartsWith = blockDeviceNameNotStartsWith;
    }

    public StorageDevicePathWhereInput blockDeviceNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_STARTS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput blockDeviceNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setBlockDeviceNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getBlockDeviceNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BLOCK_DEVICE_NAME_NOT_STARTS_WITH);
    }

    public StorageDevicePathWhereInput blockDeviceNameStartsWith(String blockDeviceNameStartsWith) {

        this.blockDeviceNameStartsWith = blockDeviceNameStartsWith;
        return this;
    }

    /**
     * Get blockDeviceNameStartsWith
     *
     * @return blockDeviceNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBlockDeviceNameStartsWith() {
        return blockDeviceNameStartsWith;
    }

    public void setBlockDeviceNameStartsWith(String blockDeviceNameStartsWith) {
        this.blockDeviceNameStartsWith = blockDeviceNameStartsWith;
    }

    public StorageDevicePathWhereInput blockDeviceNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_STARTS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput blockDeviceNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_STARTS_WITH);
        return this;
    }

    public void setBlockDeviceNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BLOCK_DEVICE_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BLOCK_DEVICE_NAME_STARTS_WITH);
        }
    }

    public boolean getBlockDeviceNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BLOCK_DEVICE_NAME_STARTS_WITH);
    }

    public StorageDevicePathWhereInput dataVersion(Integer dataVersion) {

        this.dataVersion = dataVersion;
        return this;
    }

    /**
     * Get dataVersion
     *
     * @return dataVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(Integer dataVersion) {
        this.dataVersion = dataVersion;
    }

    public StorageDevicePathWhereInput dataVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION);
        return this;
    }

    public StorageDevicePathWhereInput dataVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION);
        return this;
    }

    public void setDataVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION);
        }
    }

    public boolean getDataVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION);
    }

    public StorageDevicePathWhereInput dataVersionGt(Integer dataVersionGt) {

        this.dataVersionGt = dataVersionGt;
        return this;
    }

    /**
     * Get dataVersionGt
     *
     * @return dataVersionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersionGt() {
        return dataVersionGt;
    }

    public void setDataVersionGt(Integer dataVersionGt) {
        this.dataVersionGt = dataVersionGt;
    }

    public StorageDevicePathWhereInput dataVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GT);
        return this;
    }

    public StorageDevicePathWhereInput dataVersionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_GT);
        return this;
    }

    public void setDataVersionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_GT);
        }
    }

    public boolean getDataVersionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_GT);
    }

    public StorageDevicePathWhereInput dataVersionGte(Integer dataVersionGte) {

        this.dataVersionGte = dataVersionGte;
        return this;
    }

    /**
     * Get dataVersionGte
     *
     * @return dataVersionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersionGte() {
        return dataVersionGte;
    }

    public void setDataVersionGte(Integer dataVersionGte) {
        this.dataVersionGte = dataVersionGte;
    }

    public StorageDevicePathWhereInput dataVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GTE);
        return this;
    }

    public StorageDevicePathWhereInput dataVersionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_GTE);
        return this;
    }

    public void setDataVersionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_GTE);
        }
    }

    public boolean getDataVersionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_GTE);
    }

    public StorageDevicePathWhereInput dataVersionIn(List<Integer> dataVersionIn) {

        this.dataVersionIn = dataVersionIn;
        return this;
    }

    public StorageDevicePathWhereInput addDataVersionInItem(Integer dataVersionInItem) {
        if (this.dataVersionIn == null) {
            this.dataVersionIn = new ArrayList<Integer>();
        }
        this.dataVersionIn.add(dataVersionInItem);
        return this;
    }

    /**
     * Get dataVersionIn
     *
     * @return dataVersionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDataVersionIn() {
        return dataVersionIn;
    }

    public void setDataVersionIn(List<Integer> dataVersionIn) {
        this.dataVersionIn = dataVersionIn;
    }

    public StorageDevicePathWhereInput dataVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_IN);
        return this;
    }

    public StorageDevicePathWhereInput dataVersionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_IN);
        return this;
    }

    public void setDataVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_IN);
        }
    }

    public boolean getDataVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_IN);
    }

    public StorageDevicePathWhereInput dataVersionLt(Integer dataVersionLt) {

        this.dataVersionLt = dataVersionLt;
        return this;
    }

    /**
     * Get dataVersionLt
     *
     * @return dataVersionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersionLt() {
        return dataVersionLt;
    }

    public void setDataVersionLt(Integer dataVersionLt) {
        this.dataVersionLt = dataVersionLt;
    }

    public StorageDevicePathWhereInput dataVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LT);
        return this;
    }

    public StorageDevicePathWhereInput dataVersionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_LT);
        return this;
    }

    public void setDataVersionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_LT);
        }
    }

    public boolean getDataVersionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_LT);
    }

    public StorageDevicePathWhereInput dataVersionLte(Integer dataVersionLte) {

        this.dataVersionLte = dataVersionLte;
        return this;
    }

    /**
     * Get dataVersionLte
     *
     * @return dataVersionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersionLte() {
        return dataVersionLte;
    }

    public void setDataVersionLte(Integer dataVersionLte) {
        this.dataVersionLte = dataVersionLte;
    }

    public StorageDevicePathWhereInput dataVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LTE);
        return this;
    }

    public StorageDevicePathWhereInput dataVersionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_LTE);
        return this;
    }

    public void setDataVersionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_LTE);
        }
    }

    public boolean getDataVersionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_LTE);
    }

    public StorageDevicePathWhereInput dataVersionNot(Integer dataVersionNot) {

        this.dataVersionNot = dataVersionNot;
        return this;
    }

    /**
     * Get dataVersionNot
     *
     * @return dataVersionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersionNot() {
        return dataVersionNot;
    }

    public void setDataVersionNot(Integer dataVersionNot) {
        this.dataVersionNot = dataVersionNot;
    }

    public StorageDevicePathWhereInput dataVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT);
        return this;
    }

    public StorageDevicePathWhereInput dataVersionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_NOT);
        return this;
    }

    public void setDataVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_NOT);
        }
    }

    public boolean getDataVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_NOT);
    }

    public StorageDevicePathWhereInput dataVersionNotIn(List<Integer> dataVersionNotIn) {

        this.dataVersionNotIn = dataVersionNotIn;
        return this;
    }

    public StorageDevicePathWhereInput addDataVersionNotInItem(Integer dataVersionNotInItem) {
        if (this.dataVersionNotIn == null) {
            this.dataVersionNotIn = new ArrayList<Integer>();
        }
        this.dataVersionNotIn.add(dataVersionNotInItem);
        return this;
    }

    /**
     * Get dataVersionNotIn
     *
     * @return dataVersionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDataVersionNotIn() {
        return dataVersionNotIn;
    }

    public void setDataVersionNotIn(List<Integer> dataVersionNotIn) {
        this.dataVersionNotIn = dataVersionNotIn;
    }

    public StorageDevicePathWhereInput dataVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
        return this;
    }

    public StorageDevicePathWhereInput dataVersionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
        return this;
    }

    public void setDataVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
        }
    }

    public boolean getDataVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
    }

    public StorageDevicePathWhereInput enabled(Boolean enabled) {

        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     *
     * @return enabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public StorageDevicePathWhereInput enabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public StorageDevicePathWhereInput enabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public void setEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLED);
        }
    }

    public boolean getEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLED);
    }

    public StorageDevicePathWhereInput enabledNot(Boolean enabledNot) {

        this.enabledNot = enabledNot;
        return this;
    }

    /**
     * Get enabledNot
     *
     * @return enabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnabledNot() {
        return enabledNot;
    }

    public void setEnabledNot(Boolean enabledNot) {
        this.enabledNot = enabledNot;
    }

    public StorageDevicePathWhereInput enabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED_NOT);
        return this;
    }

    public StorageDevicePathWhereInput enabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLED_NOT);
        return this;
    }

    public void setEnabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLED_NOT);
        }
    }

    public boolean getEnabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLED_NOT);
    }

    public StorageDevicePathWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public StorageDevicePathWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public StorageDevicePathWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public StorageDevicePathWhereInput addEntityAsyncStatusInItem(
            EntityAsyncStatus entityAsyncStatusInItem) {
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

    public StorageDevicePathWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public StorageDevicePathWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput entityAsyncStatusNot(
            EntityAsyncStatus entityAsyncStatusNot) {

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

    public StorageDevicePathWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public StorageDevicePathWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public StorageDevicePathWhereInput addEntityAsyncStatusNotInItem(
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

    public StorageDevicePathWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public StorageDevicePathWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput hostConnection(
            StorageDeviceHostConnectionWhereInput hostConnection) {

        this.hostConnection = hostConnection;
        return this;
    }

    /**
     * Get hostConnection
     *
     * @return hostConnection
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageDeviceHostConnectionWhereInput getHostConnection() {
        return hostConnection;
    }

    public void setHostConnection(StorageDeviceHostConnectionWhereInput hostConnection) {
        this.hostConnection = hostConnection;
    }

    public StorageDevicePathWhereInput hostConnection_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_CONNECTION);
        return this;
    }

    public StorageDevicePathWhereInput hostConnection_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_CONNECTION);
        return this;
    }

    public void setHostConnection_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_CONNECTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_CONNECTION);
        }
    }

    public boolean getHostConnection_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_CONNECTION);
    }

    public StorageDevicePathWhereInput id(String id) {

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

    public StorageDevicePathWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public StorageDevicePathWhereInput id_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput idContains(String idContains) {

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

    public StorageDevicePathWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public StorageDevicePathWhereInput idContains_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput idEndsWith(String idEndsWith) {

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

    public StorageDevicePathWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput idEndsWith_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput idGt(String idGt) {

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

    public StorageDevicePathWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public StorageDevicePathWhereInput idGt_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput idGte(String idGte) {

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

    public StorageDevicePathWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public StorageDevicePathWhereInput idGte_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public StorageDevicePathWhereInput addIdInItem(String idInItem) {
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

    public StorageDevicePathWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public StorageDevicePathWhereInput idIn_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput idLt(String idLt) {

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

    public StorageDevicePathWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public StorageDevicePathWhereInput idLt_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput idLte(String idLte) {

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

    public StorageDevicePathWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public StorageDevicePathWhereInput idLte_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput idNot(String idNot) {

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

    public StorageDevicePathWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public StorageDevicePathWhereInput idNot_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput idNotContains(String idNotContains) {

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

    public StorageDevicePathWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public StorageDevicePathWhereInput idNotContains_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public StorageDevicePathWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public StorageDevicePathWhereInput addIdNotInItem(String idNotInItem) {
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

    public StorageDevicePathWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public StorageDevicePathWhereInput idNotIn_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public StorageDevicePathWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput idStartsWith(String idStartsWith) {

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

    public StorageDevicePathWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput idStartsWith_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput localHash(String localHash) {

        this.localHash = localHash;
        return this;
    }

    /**
     * Get localHash
     *
     * @return localHash
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHash() {
        return localHash;
    }

    public void setLocalHash(String localHash) {
        this.localHash = localHash;
    }

    public StorageDevicePathWhereInput localHash_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH);
        return this;
    }

    public StorageDevicePathWhereInput localHash_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH);
        return this;
    }

    public void setLocalHash_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH);
        }
    }

    public boolean getLocalHash_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH);
    }

    public StorageDevicePathWhereInput localHashContains(String localHashContains) {

        this.localHashContains = localHashContains;
        return this;
    }

    /**
     * Get localHashContains
     *
     * @return localHashContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashContains() {
        return localHashContains;
    }

    public void setLocalHashContains(String localHashContains) {
        this.localHashContains = localHashContains;
    }

    public StorageDevicePathWhereInput localHashContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_CONTAINS);
        return this;
    }

    public StorageDevicePathWhereInput localHashContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_CONTAINS);
        return this;
    }

    public void setLocalHashContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_CONTAINS);
        }
    }

    public boolean getLocalHashContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_CONTAINS);
    }

    public StorageDevicePathWhereInput localHashEndsWith(String localHashEndsWith) {

        this.localHashEndsWith = localHashEndsWith;
        return this;
    }

    /**
     * Get localHashEndsWith
     *
     * @return localHashEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashEndsWith() {
        return localHashEndsWith;
    }

    public void setLocalHashEndsWith(String localHashEndsWith) {
        this.localHashEndsWith = localHashEndsWith;
    }

    public StorageDevicePathWhereInput localHashEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput localHashEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH);
        return this;
    }

    public void setLocalHashEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH);
        }
    }

    public boolean getLocalHashEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH);
    }

    public StorageDevicePathWhereInput localHashGt(String localHashGt) {

        this.localHashGt = localHashGt;
        return this;
    }

    /**
     * Get localHashGt
     *
     * @return localHashGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashGt() {
        return localHashGt;
    }

    public void setLocalHashGt(String localHashGt) {
        this.localHashGt = localHashGt;
    }

    public StorageDevicePathWhereInput localHashGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_GT);
        return this;
    }

    public StorageDevicePathWhereInput localHashGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_GT);
        return this;
    }

    public void setLocalHashGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_GT);
        }
    }

    public boolean getLocalHashGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_GT);
    }

    public StorageDevicePathWhereInput localHashGte(String localHashGte) {

        this.localHashGte = localHashGte;
        return this;
    }

    /**
     * Get localHashGte
     *
     * @return localHashGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashGte() {
        return localHashGte;
    }

    public void setLocalHashGte(String localHashGte) {
        this.localHashGte = localHashGte;
    }

    public StorageDevicePathWhereInput localHashGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_GTE);
        return this;
    }

    public StorageDevicePathWhereInput localHashGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_GTE);
        return this;
    }

    public void setLocalHashGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_GTE);
        }
    }

    public boolean getLocalHashGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_GTE);
    }

    public StorageDevicePathWhereInput localHashIn(List<String> localHashIn) {

        this.localHashIn = localHashIn;
        return this;
    }

    public StorageDevicePathWhereInput addLocalHashInItem(String localHashInItem) {
        if (this.localHashIn == null) {
            this.localHashIn = new ArrayList<String>();
        }
        this.localHashIn.add(localHashInItem);
        return this;
    }

    /**
     * Get localHashIn
     *
     * @return localHashIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalHashIn() {
        return localHashIn;
    }

    public void setLocalHashIn(List<String> localHashIn) {
        this.localHashIn = localHashIn;
    }

    public StorageDevicePathWhereInput localHashIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_IN);
        return this;
    }

    public StorageDevicePathWhereInput localHashIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_IN);
        return this;
    }

    public void setLocalHashIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_IN);
        }
    }

    public boolean getLocalHashIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_IN);
    }

    public StorageDevicePathWhereInput localHashLt(String localHashLt) {

        this.localHashLt = localHashLt;
        return this;
    }

    /**
     * Get localHashLt
     *
     * @return localHashLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashLt() {
        return localHashLt;
    }

    public void setLocalHashLt(String localHashLt) {
        this.localHashLt = localHashLt;
    }

    public StorageDevicePathWhereInput localHashLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_LT);
        return this;
    }

    public StorageDevicePathWhereInput localHashLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_LT);
        return this;
    }

    public void setLocalHashLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_LT);
        }
    }

    public boolean getLocalHashLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_LT);
    }

    public StorageDevicePathWhereInput localHashLte(String localHashLte) {

        this.localHashLte = localHashLte;
        return this;
    }

    /**
     * Get localHashLte
     *
     * @return localHashLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashLte() {
        return localHashLte;
    }

    public void setLocalHashLte(String localHashLte) {
        this.localHashLte = localHashLte;
    }

    public StorageDevicePathWhereInput localHashLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_LTE);
        return this;
    }

    public StorageDevicePathWhereInput localHashLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_LTE);
        return this;
    }

    public void setLocalHashLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_LTE);
        }
    }

    public boolean getLocalHashLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_LTE);
    }

    public StorageDevicePathWhereInput localHashNot(String localHashNot) {

        this.localHashNot = localHashNot;
        return this;
    }

    /**
     * Get localHashNot
     *
     * @return localHashNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashNot() {
        return localHashNot;
    }

    public void setLocalHashNot(String localHashNot) {
        this.localHashNot = localHashNot;
    }

    public StorageDevicePathWhereInput localHashNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT);
        return this;
    }

    public StorageDevicePathWhereInput localHashNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT);
        return this;
    }

    public void setLocalHashNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT);
        }
    }

    public boolean getLocalHashNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_NOT);
    }

    public StorageDevicePathWhereInput localHashNotContains(String localHashNotContains) {

        this.localHashNotContains = localHashNotContains;
        return this;
    }

    /**
     * Get localHashNotContains
     *
     * @return localHashNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashNotContains() {
        return localHashNotContains;
    }

    public void setLocalHashNotContains(String localHashNotContains) {
        this.localHashNotContains = localHashNotContains;
    }

    public StorageDevicePathWhereInput localHashNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS);
        return this;
    }

    public StorageDevicePathWhereInput localHashNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS);
        return this;
    }

    public void setLocalHashNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS);
        }
    }

    public boolean getLocalHashNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS);
    }

    public StorageDevicePathWhereInput localHashNotEndsWith(String localHashNotEndsWith) {

        this.localHashNotEndsWith = localHashNotEndsWith;
        return this;
    }

    /**
     * Get localHashNotEndsWith
     *
     * @return localHashNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashNotEndsWith() {
        return localHashNotEndsWith;
    }

    public void setLocalHashNotEndsWith(String localHashNotEndsWith) {
        this.localHashNotEndsWith = localHashNotEndsWith;
    }

    public StorageDevicePathWhereInput localHashNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput localHashNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH);
        return this;
    }

    public void setLocalHashNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH);
        }
    }

    public boolean getLocalHashNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH);
    }

    public StorageDevicePathWhereInput localHashNotIn(List<String> localHashNotIn) {

        this.localHashNotIn = localHashNotIn;
        return this;
    }

    public StorageDevicePathWhereInput addLocalHashNotInItem(String localHashNotInItem) {
        if (this.localHashNotIn == null) {
            this.localHashNotIn = new ArrayList<String>();
        }
        this.localHashNotIn.add(localHashNotInItem);
        return this;
    }

    /**
     * Get localHashNotIn
     *
     * @return localHashNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalHashNotIn() {
        return localHashNotIn;
    }

    public void setLocalHashNotIn(List<String> localHashNotIn) {
        this.localHashNotIn = localHashNotIn;
    }

    public StorageDevicePathWhereInput localHashNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_IN);
        return this;
    }

    public StorageDevicePathWhereInput localHashNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_IN);
        return this;
    }

    public void setLocalHashNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_IN);
        }
    }

    public boolean getLocalHashNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_NOT_IN);
    }

    public StorageDevicePathWhereInput localHashNotStartsWith(String localHashNotStartsWith) {

        this.localHashNotStartsWith = localHashNotStartsWith;
        return this;
    }

    /**
     * Get localHashNotStartsWith
     *
     * @return localHashNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashNotStartsWith() {
        return localHashNotStartsWith;
    }

    public void setLocalHashNotStartsWith(String localHashNotStartsWith) {
        this.localHashNotStartsWith = localHashNotStartsWith;
    }

    public StorageDevicePathWhereInput localHashNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput localHashNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH);
        return this;
    }

    public void setLocalHashNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH);
        }
    }

    public boolean getLocalHashNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH);
    }

    public StorageDevicePathWhereInput localHashStartsWith(String localHashStartsWith) {

        this.localHashStartsWith = localHashStartsWith;
        return this;
    }

    /**
     * Get localHashStartsWith
     *
     * @return localHashStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashStartsWith() {
        return localHashStartsWith;
    }

    public void setLocalHashStartsWith(String localHashStartsWith) {
        this.localHashStartsWith = localHashStartsWith;
    }

    public StorageDevicePathWhereInput localHashStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput localHashStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH);
        return this;
    }

    public void setLocalHashStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH);
        }
    }

    public boolean getLocalHashStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH);
    }

    public StorageDevicePathWhereInput localId(String localId) {

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

    public StorageDevicePathWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public StorageDevicePathWhereInput localId_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput localIdContains(String localIdContains) {

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

    public StorageDevicePathWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public StorageDevicePathWhereInput localIdContains_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public StorageDevicePathWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput localIdGt(String localIdGt) {

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

    public StorageDevicePathWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public StorageDevicePathWhereInput localIdGt_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput localIdGte(String localIdGte) {

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

    public StorageDevicePathWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public StorageDevicePathWhereInput localIdGte_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public StorageDevicePathWhereInput addLocalIdInItem(String localIdInItem) {
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

    public StorageDevicePathWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public StorageDevicePathWhereInput localIdIn_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput localIdLt(String localIdLt) {

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

    public StorageDevicePathWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public StorageDevicePathWhereInput localIdLt_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput localIdLte(String localIdLte) {

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

    public StorageDevicePathWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public StorageDevicePathWhereInput localIdLte_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput localIdNot(String localIdNot) {

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

    public StorageDevicePathWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public StorageDevicePathWhereInput localIdNot_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput localIdNotContains(String localIdNotContains) {

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

    public StorageDevicePathWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public StorageDevicePathWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public StorageDevicePathWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public StorageDevicePathWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public StorageDevicePathWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public StorageDevicePathWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public StorageDevicePathWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public StorageDevicePathWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public StorageDevicePathWhereInput path(String path) {

        this.path = path;
        return this;
    }

    /**
     * Get path
     *
     * @return path
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public StorageDevicePathWhereInput path_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH);
        return this;
    }

    public StorageDevicePathWhereInput path_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH);
        return this;
    }

    public void setPath_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH);
        }
    }

    public boolean getPath_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH);
    }

    public StorageDevicePathWhereInput pathContains(String pathContains) {

        this.pathContains = pathContains;
        return this;
    }

    /**
     * Get pathContains
     *
     * @return pathContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathContains() {
        return pathContains;
    }

    public void setPathContains(String pathContains) {
        this.pathContains = pathContains;
    }

    public StorageDevicePathWhereInput pathContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_CONTAINS);
        return this;
    }

    public StorageDevicePathWhereInput pathContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_CONTAINS);
        return this;
    }

    public void setPathContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_CONTAINS);
        }
    }

    public boolean getPathContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_CONTAINS);
    }

    public StorageDevicePathWhereInput pathEndsWith(String pathEndsWith) {

        this.pathEndsWith = pathEndsWith;
        return this;
    }

    /**
     * Get pathEndsWith
     *
     * @return pathEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathEndsWith() {
        return pathEndsWith;
    }

    public void setPathEndsWith(String pathEndsWith) {
        this.pathEndsWith = pathEndsWith;
    }

    public StorageDevicePathWhereInput pathEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_ENDS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput pathEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_ENDS_WITH);
        return this;
    }

    public void setPathEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_ENDS_WITH);
        }
    }

    public boolean getPathEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_ENDS_WITH);
    }

    public StorageDevicePathWhereInput pathGt(String pathGt) {

        this.pathGt = pathGt;
        return this;
    }

    /**
     * Get pathGt
     *
     * @return pathGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathGt() {
        return pathGt;
    }

    public void setPathGt(String pathGt) {
        this.pathGt = pathGt;
    }

    public StorageDevicePathWhereInput pathGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_GT);
        return this;
    }

    public StorageDevicePathWhereInput pathGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_GT);
        return this;
    }

    public void setPathGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_GT);
        }
    }

    public boolean getPathGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_GT);
    }

    public StorageDevicePathWhereInput pathGte(String pathGte) {

        this.pathGte = pathGte;
        return this;
    }

    /**
     * Get pathGte
     *
     * @return pathGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathGte() {
        return pathGte;
    }

    public void setPathGte(String pathGte) {
        this.pathGte = pathGte;
    }

    public StorageDevicePathWhereInput pathGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_GTE);
        return this;
    }

    public StorageDevicePathWhereInput pathGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_GTE);
        return this;
    }

    public void setPathGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_GTE);
        }
    }

    public boolean getPathGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_GTE);
    }

    public StorageDevicePathWhereInput pathIn(List<String> pathIn) {

        this.pathIn = pathIn;
        return this;
    }

    public StorageDevicePathWhereInput addPathInItem(String pathInItem) {
        if (this.pathIn == null) {
            this.pathIn = new ArrayList<String>();
        }
        this.pathIn.add(pathInItem);
        return this;
    }

    /**
     * Get pathIn
     *
     * @return pathIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPathIn() {
        return pathIn;
    }

    public void setPathIn(List<String> pathIn) {
        this.pathIn = pathIn;
    }

    public StorageDevicePathWhereInput pathIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_IN);
        return this;
    }

    public StorageDevicePathWhereInput pathIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_IN);
        return this;
    }

    public void setPathIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_IN);
        }
    }

    public boolean getPathIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_IN);
    }

    public StorageDevicePathWhereInput pathLt(String pathLt) {

        this.pathLt = pathLt;
        return this;
    }

    /**
     * Get pathLt
     *
     * @return pathLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathLt() {
        return pathLt;
    }

    public void setPathLt(String pathLt) {
        this.pathLt = pathLt;
    }

    public StorageDevicePathWhereInput pathLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_LT);
        return this;
    }

    public StorageDevicePathWhereInput pathLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_LT);
        return this;
    }

    public void setPathLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_LT);
        }
    }

    public boolean getPathLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_LT);
    }

    public StorageDevicePathWhereInput pathLte(String pathLte) {

        this.pathLte = pathLte;
        return this;
    }

    /**
     * Get pathLte
     *
     * @return pathLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathLte() {
        return pathLte;
    }

    public void setPathLte(String pathLte) {
        this.pathLte = pathLte;
    }

    public StorageDevicePathWhereInput pathLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_LTE);
        return this;
    }

    public StorageDevicePathWhereInput pathLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_LTE);
        return this;
    }

    public void setPathLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_LTE);
        }
    }

    public boolean getPathLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_LTE);
    }

    public StorageDevicePathWhereInput pathNot(String pathNot) {

        this.pathNot = pathNot;
        return this;
    }

    /**
     * Get pathNot
     *
     * @return pathNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathNot() {
        return pathNot;
    }

    public void setPathNot(String pathNot) {
        this.pathNot = pathNot;
    }

    public StorageDevicePathWhereInput pathNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT);
        return this;
    }

    public StorageDevicePathWhereInput pathNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT);
        return this;
    }

    public void setPathNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT);
        }
    }

    public boolean getPathNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NOT);
    }

    public StorageDevicePathWhereInput pathNotContains(String pathNotContains) {

        this.pathNotContains = pathNotContains;
        return this;
    }

    /**
     * Get pathNotContains
     *
     * @return pathNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathNotContains() {
        return pathNotContains;
    }

    public void setPathNotContains(String pathNotContains) {
        this.pathNotContains = pathNotContains;
    }

    public StorageDevicePathWhereInput pathNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_CONTAINS);
        return this;
    }

    public StorageDevicePathWhereInput pathNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_CONTAINS);
        return this;
    }

    public void setPathNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_CONTAINS);
        }
    }

    public boolean getPathNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NOT_CONTAINS);
    }

    public StorageDevicePathWhereInput pathNotEndsWith(String pathNotEndsWith) {

        this.pathNotEndsWith = pathNotEndsWith;
        return this;
    }

    /**
     * Get pathNotEndsWith
     *
     * @return pathNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathNotEndsWith() {
        return pathNotEndsWith;
    }

    public void setPathNotEndsWith(String pathNotEndsWith) {
        this.pathNotEndsWith = pathNotEndsWith;
    }

    public StorageDevicePathWhereInput pathNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_ENDS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput pathNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_ENDS_WITH);
        return this;
    }

    public void setPathNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_ENDS_WITH);
        }
    }

    public boolean getPathNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NOT_ENDS_WITH);
    }

    public StorageDevicePathWhereInput pathNotIn(List<String> pathNotIn) {

        this.pathNotIn = pathNotIn;
        return this;
    }

    public StorageDevicePathWhereInput addPathNotInItem(String pathNotInItem) {
        if (this.pathNotIn == null) {
            this.pathNotIn = new ArrayList<String>();
        }
        this.pathNotIn.add(pathNotInItem);
        return this;
    }

    /**
     * Get pathNotIn
     *
     * @return pathNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPathNotIn() {
        return pathNotIn;
    }

    public void setPathNotIn(List<String> pathNotIn) {
        this.pathNotIn = pathNotIn;
    }

    public StorageDevicePathWhereInput pathNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_IN);
        return this;
    }

    public StorageDevicePathWhereInput pathNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_IN);
        return this;
    }

    public void setPathNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_IN);
        }
    }

    public boolean getPathNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NOT_IN);
    }

    public StorageDevicePathWhereInput pathNotStartsWith(String pathNotStartsWith) {

        this.pathNotStartsWith = pathNotStartsWith;
        return this;
    }

    /**
     * Get pathNotStartsWith
     *
     * @return pathNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathNotStartsWith() {
        return pathNotStartsWith;
    }

    public void setPathNotStartsWith(String pathNotStartsWith) {
        this.pathNotStartsWith = pathNotStartsWith;
    }

    public StorageDevicePathWhereInput pathNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_STARTS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput pathNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_STARTS_WITH);
        return this;
    }

    public void setPathNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_STARTS_WITH);
        }
    }

    public boolean getPathNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NOT_STARTS_WITH);
    }

    public StorageDevicePathWhereInput pathStartsWith(String pathStartsWith) {

        this.pathStartsWith = pathStartsWith;
        return this;
    }

    /**
     * Get pathStartsWith
     *
     * @return pathStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathStartsWith() {
        return pathStartsWith;
    }

    public void setPathStartsWith(String pathStartsWith) {
        this.pathStartsWith = pathStartsWith;
    }

    public StorageDevicePathWhereInput pathStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_STARTS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput pathStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_STARTS_WITH);
        return this;
    }

    public void setPathStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_STARTS_WITH);
        }
    }

    public boolean getPathStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_STARTS_WITH);
    }

    public StorageDevicePathWhereInput runtimeName(String runtimeName) {

        this.runtimeName = runtimeName;
        return this;
    }

    /**
     * Get runtimeName
     *
     * @return runtimeName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRuntimeName() {
        return runtimeName;
    }

    public void setRuntimeName(String runtimeName) {
        this.runtimeName = runtimeName;
    }

    public StorageDevicePathWhereInput runtimeName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME);
        return this;
    }

    public StorageDevicePathWhereInput runtimeName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME);
        return this;
    }

    public void setRuntimeName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME);
        }
    }

    public boolean getRuntimeName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNTIME_NAME);
    }

    public StorageDevicePathWhereInput runtimeNameContains(String runtimeNameContains) {

        this.runtimeNameContains = runtimeNameContains;
        return this;
    }

    /**
     * Get runtimeNameContains
     *
     * @return runtimeNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRuntimeNameContains() {
        return runtimeNameContains;
    }

    public void setRuntimeNameContains(String runtimeNameContains) {
        this.runtimeNameContains = runtimeNameContains;
    }

    public StorageDevicePathWhereInput runtimeNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_CONTAINS);
        return this;
    }

    public StorageDevicePathWhereInput runtimeNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_CONTAINS);
        return this;
    }

    public void setRuntimeNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_CONTAINS);
        }
    }

    public boolean getRuntimeNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNTIME_NAME_CONTAINS);
    }

    public StorageDevicePathWhereInput runtimeNameEndsWith(String runtimeNameEndsWith) {

        this.runtimeNameEndsWith = runtimeNameEndsWith;
        return this;
    }

    /**
     * Get runtimeNameEndsWith
     *
     * @return runtimeNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRuntimeNameEndsWith() {
        return runtimeNameEndsWith;
    }

    public void setRuntimeNameEndsWith(String runtimeNameEndsWith) {
        this.runtimeNameEndsWith = runtimeNameEndsWith;
    }

    public StorageDevicePathWhereInput runtimeNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_ENDS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput runtimeNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_ENDS_WITH);
        return this;
    }

    public void setRuntimeNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_ENDS_WITH);
        }
    }

    public boolean getRuntimeNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNTIME_NAME_ENDS_WITH);
    }

    public StorageDevicePathWhereInput runtimeNameGt(String runtimeNameGt) {

        this.runtimeNameGt = runtimeNameGt;
        return this;
    }

    /**
     * Get runtimeNameGt
     *
     * @return runtimeNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRuntimeNameGt() {
        return runtimeNameGt;
    }

    public void setRuntimeNameGt(String runtimeNameGt) {
        this.runtimeNameGt = runtimeNameGt;
    }

    public StorageDevicePathWhereInput runtimeNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_GT);
        return this;
    }

    public StorageDevicePathWhereInput runtimeNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_GT);
        return this;
    }

    public void setRuntimeNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_GT);
        }
    }

    public boolean getRuntimeNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNTIME_NAME_GT);
    }

    public StorageDevicePathWhereInput runtimeNameGte(String runtimeNameGte) {

        this.runtimeNameGte = runtimeNameGte;
        return this;
    }

    /**
     * Get runtimeNameGte
     *
     * @return runtimeNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRuntimeNameGte() {
        return runtimeNameGte;
    }

    public void setRuntimeNameGte(String runtimeNameGte) {
        this.runtimeNameGte = runtimeNameGte;
    }

    public StorageDevicePathWhereInput runtimeNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_GTE);
        return this;
    }

    public StorageDevicePathWhereInput runtimeNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_GTE);
        return this;
    }

    public void setRuntimeNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_GTE);
        }
    }

    public boolean getRuntimeNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNTIME_NAME_GTE);
    }

    public StorageDevicePathWhereInput runtimeNameIn(List<String> runtimeNameIn) {

        this.runtimeNameIn = runtimeNameIn;
        return this;
    }

    public StorageDevicePathWhereInput addRuntimeNameInItem(String runtimeNameInItem) {
        if (this.runtimeNameIn == null) {
            this.runtimeNameIn = new ArrayList<String>();
        }
        this.runtimeNameIn.add(runtimeNameInItem);
        return this;
    }

    /**
     * Get runtimeNameIn
     *
     * @return runtimeNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getRuntimeNameIn() {
        return runtimeNameIn;
    }

    public void setRuntimeNameIn(List<String> runtimeNameIn) {
        this.runtimeNameIn = runtimeNameIn;
    }

    public StorageDevicePathWhereInput runtimeNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_IN);
        return this;
    }

    public StorageDevicePathWhereInput runtimeNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_IN);
        return this;
    }

    public void setRuntimeNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_IN);
        }
    }

    public boolean getRuntimeNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNTIME_NAME_IN);
    }

    public StorageDevicePathWhereInput runtimeNameLt(String runtimeNameLt) {

        this.runtimeNameLt = runtimeNameLt;
        return this;
    }

    /**
     * Get runtimeNameLt
     *
     * @return runtimeNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRuntimeNameLt() {
        return runtimeNameLt;
    }

    public void setRuntimeNameLt(String runtimeNameLt) {
        this.runtimeNameLt = runtimeNameLt;
    }

    public StorageDevicePathWhereInput runtimeNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_LT);
        return this;
    }

    public StorageDevicePathWhereInput runtimeNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_LT);
        return this;
    }

    public void setRuntimeNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_LT);
        }
    }

    public boolean getRuntimeNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNTIME_NAME_LT);
    }

    public StorageDevicePathWhereInput runtimeNameLte(String runtimeNameLte) {

        this.runtimeNameLte = runtimeNameLte;
        return this;
    }

    /**
     * Get runtimeNameLte
     *
     * @return runtimeNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRuntimeNameLte() {
        return runtimeNameLte;
    }

    public void setRuntimeNameLte(String runtimeNameLte) {
        this.runtimeNameLte = runtimeNameLte;
    }

    public StorageDevicePathWhereInput runtimeNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_LTE);
        return this;
    }

    public StorageDevicePathWhereInput runtimeNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_LTE);
        return this;
    }

    public void setRuntimeNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_LTE);
        }
    }

    public boolean getRuntimeNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNTIME_NAME_LTE);
    }

    public StorageDevicePathWhereInput runtimeNameNot(String runtimeNameNot) {

        this.runtimeNameNot = runtimeNameNot;
        return this;
    }

    /**
     * Get runtimeNameNot
     *
     * @return runtimeNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRuntimeNameNot() {
        return runtimeNameNot;
    }

    public void setRuntimeNameNot(String runtimeNameNot) {
        this.runtimeNameNot = runtimeNameNot;
    }

    public StorageDevicePathWhereInput runtimeNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_NOT);
        return this;
    }

    public StorageDevicePathWhereInput runtimeNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_NOT);
        return this;
    }

    public void setRuntimeNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_NOT);
        }
    }

    public boolean getRuntimeNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNTIME_NAME_NOT);
    }

    public StorageDevicePathWhereInput runtimeNameNotContains(String runtimeNameNotContains) {

        this.runtimeNameNotContains = runtimeNameNotContains;
        return this;
    }

    /**
     * Get runtimeNameNotContains
     *
     * @return runtimeNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRuntimeNameNotContains() {
        return runtimeNameNotContains;
    }

    public void setRuntimeNameNotContains(String runtimeNameNotContains) {
        this.runtimeNameNotContains = runtimeNameNotContains;
    }

    public StorageDevicePathWhereInput runtimeNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_NOT_CONTAINS);
        return this;
    }

    public StorageDevicePathWhereInput runtimeNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_NOT_CONTAINS);
        return this;
    }

    public void setRuntimeNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_NOT_CONTAINS);
        }
    }

    public boolean getRuntimeNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNTIME_NAME_NOT_CONTAINS);
    }

    public StorageDevicePathWhereInput runtimeNameNotEndsWith(String runtimeNameNotEndsWith) {

        this.runtimeNameNotEndsWith = runtimeNameNotEndsWith;
        return this;
    }

    /**
     * Get runtimeNameNotEndsWith
     *
     * @return runtimeNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRuntimeNameNotEndsWith() {
        return runtimeNameNotEndsWith;
    }

    public void setRuntimeNameNotEndsWith(String runtimeNameNotEndsWith) {
        this.runtimeNameNotEndsWith = runtimeNameNotEndsWith;
    }

    public StorageDevicePathWhereInput runtimeNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput runtimeNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setRuntimeNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getRuntimeNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNTIME_NAME_NOT_ENDS_WITH);
    }

    public StorageDevicePathWhereInput runtimeNameNotIn(List<String> runtimeNameNotIn) {

        this.runtimeNameNotIn = runtimeNameNotIn;
        return this;
    }

    public StorageDevicePathWhereInput addRuntimeNameNotInItem(String runtimeNameNotInItem) {
        if (this.runtimeNameNotIn == null) {
            this.runtimeNameNotIn = new ArrayList<String>();
        }
        this.runtimeNameNotIn.add(runtimeNameNotInItem);
        return this;
    }

    /**
     * Get runtimeNameNotIn
     *
     * @return runtimeNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getRuntimeNameNotIn() {
        return runtimeNameNotIn;
    }

    public void setRuntimeNameNotIn(List<String> runtimeNameNotIn) {
        this.runtimeNameNotIn = runtimeNameNotIn;
    }

    public StorageDevicePathWhereInput runtimeNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_NOT_IN);
        return this;
    }

    public StorageDevicePathWhereInput runtimeNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_NOT_IN);
        return this;
    }

    public void setRuntimeNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_NOT_IN);
        }
    }

    public boolean getRuntimeNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNTIME_NAME_NOT_IN);
    }

    public StorageDevicePathWhereInput runtimeNameNotStartsWith(String runtimeNameNotStartsWith) {

        this.runtimeNameNotStartsWith = runtimeNameNotStartsWith;
        return this;
    }

    /**
     * Get runtimeNameNotStartsWith
     *
     * @return runtimeNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRuntimeNameNotStartsWith() {
        return runtimeNameNotStartsWith;
    }

    public void setRuntimeNameNotStartsWith(String runtimeNameNotStartsWith) {
        this.runtimeNameNotStartsWith = runtimeNameNotStartsWith;
    }

    public StorageDevicePathWhereInput runtimeNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput runtimeNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setRuntimeNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getRuntimeNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNTIME_NAME_NOT_STARTS_WITH);
    }

    public StorageDevicePathWhereInput runtimeNameStartsWith(String runtimeNameStartsWith) {

        this.runtimeNameStartsWith = runtimeNameStartsWith;
        return this;
    }

    /**
     * Get runtimeNameStartsWith
     *
     * @return runtimeNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRuntimeNameStartsWith() {
        return runtimeNameStartsWith;
    }

    public void setRuntimeNameStartsWith(String runtimeNameStartsWith) {
        this.runtimeNameStartsWith = runtimeNameStartsWith;
    }

    public StorageDevicePathWhereInput runtimeNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_STARTS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput runtimeNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_STARTS_WITH);
        return this;
    }

    public void setRuntimeNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNTIME_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNTIME_NAME_STARTS_WITH);
        }
    }

    public boolean getRuntimeNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNTIME_NAME_STARTS_WITH);
    }

    public StorageDevicePathWhereInput state(StorageDevicePathState state) {

        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageDevicePathState getState() {
        return state;
    }

    public void setState(StorageDevicePathState state) {
        this.state = state;
    }

    public StorageDevicePathWhereInput state_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE);
        return this;
    }

    public StorageDevicePathWhereInput state_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE);
        return this;
    }

    public void setState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE);
        }
    }

    public boolean getState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE);
    }

    public StorageDevicePathWhereInput stateIn(List<StorageDevicePathState> stateIn) {

        this.stateIn = stateIn;
        return this;
    }

    public StorageDevicePathWhereInput addStateInItem(StorageDevicePathState stateInItem) {
        if (this.stateIn == null) {
            this.stateIn = new ArrayList<StorageDevicePathState>();
        }
        this.stateIn.add(stateInItem);
        return this;
    }

    /**
     * Get stateIn
     *
     * @return stateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<StorageDevicePathState> getStateIn() {
        return stateIn;
    }

    public void setStateIn(List<StorageDevicePathState> stateIn) {
        this.stateIn = stateIn;
    }

    public StorageDevicePathWhereInput stateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_IN);
        return this;
    }

    public StorageDevicePathWhereInput stateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE_IN);
        return this;
    }

    public void setStateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE_IN);
        }
    }

    public boolean getStateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE_IN);
    }

    public StorageDevicePathWhereInput stateNot(StorageDevicePathState stateNot) {

        this.stateNot = stateNot;
        return this;
    }

    /**
     * Get stateNot
     *
     * @return stateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageDevicePathState getStateNot() {
        return stateNot;
    }

    public void setStateNot(StorageDevicePathState stateNot) {
        this.stateNot = stateNot;
    }

    public StorageDevicePathWhereInput stateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_NOT);
        return this;
    }

    public StorageDevicePathWhereInput stateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT);
        return this;
    }

    public void setStateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT);
        }
    }

    public boolean getStateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE_NOT);
    }

    public StorageDevicePathWhereInput stateNotIn(List<StorageDevicePathState> stateNotIn) {

        this.stateNotIn = stateNotIn;
        return this;
    }

    public StorageDevicePathWhereInput addStateNotInItem(StorageDevicePathState stateNotInItem) {
        if (this.stateNotIn == null) {
            this.stateNotIn = new ArrayList<StorageDevicePathState>();
        }
        this.stateNotIn.add(stateNotInItem);
        return this;
    }

    /**
     * Get stateNotIn
     *
     * @return stateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<StorageDevicePathState> getStateNotIn() {
        return stateNotIn;
    }

    public void setStateNotIn(List<StorageDevicePathState> stateNotIn) {
        this.stateNotIn = stateNotIn;
    }

    public StorageDevicePathWhereInput stateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_NOT_IN);
        return this;
    }

    public StorageDevicePathWhereInput stateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT_IN);
        return this;
    }

    public void setStateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT_IN);
        }
    }

    public boolean getStateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE_NOT_IN);
    }

    public StorageDevicePathWhereInput storageAdapter(StorageAdapterWhereInput storageAdapter) {

        this.storageAdapter = storageAdapter;
        return this;
    }

    /**
     * Get storageAdapter
     *
     * @return storageAdapter
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageAdapterWhereInput getStorageAdapter() {
        return storageAdapter;
    }

    public void setStorageAdapter(StorageAdapterWhereInput storageAdapter) {
        this.storageAdapter = storageAdapter;
    }

    public StorageDevicePathWhereInput storageAdapter_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ADAPTER);
        return this;
    }

    public StorageDevicePathWhereInput storageAdapter_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ADAPTER);
        return this;
    }

    public void setStorageAdapter_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ADAPTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ADAPTER);
        }
    }

    public boolean getStorageAdapter_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ADAPTER);
    }

    public StorageDevicePathWhereInput storageDevice(StorageDeviceWhereInput storageDevice) {

        this.storageDevice = storageDevice;
        return this;
    }

    /**
     * Get storageDevice
     *
     * @return storageDevice
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageDeviceWhereInput getStorageDevice() {
        return storageDevice;
    }

    public void setStorageDevice(StorageDeviceWhereInput storageDevice) {
        this.storageDevice = storageDevice;
    }

    public StorageDevicePathWhereInput storageDevice_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_DEVICE);
        return this;
    }

    public StorageDevicePathWhereInput storageDevice_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_DEVICE);
        return this;
    }

    public void setStorageDevice_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_DEVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_DEVICE);
        }
    }

    public boolean getStorageDevice_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_DEVICE);
    }

    public StorageDevicePathWhereInput target(String target) {

        this.target = target;
        return this;
    }

    /**
     * Get target
     *
     * @return target
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public StorageDevicePathWhereInput target_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET);
        return this;
    }

    public StorageDevicePathWhereInput target_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET);
        return this;
    }

    public void setTarget_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET);
        }
    }

    public boolean getTarget_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET);
    }

    public StorageDevicePathWhereInput targetContains(String targetContains) {

        this.targetContains = targetContains;
        return this;
    }

    /**
     * Get targetContains
     *
     * @return targetContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetContains() {
        return targetContains;
    }

    public void setTargetContains(String targetContains) {
        this.targetContains = targetContains;
    }

    public StorageDevicePathWhereInput targetContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_CONTAINS);
        return this;
    }

    public StorageDevicePathWhereInput targetContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_CONTAINS);
        return this;
    }

    public void setTargetContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_CONTAINS);
        }
    }

    public boolean getTargetContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_CONTAINS);
    }

    public StorageDevicePathWhereInput targetEndsWith(String targetEndsWith) {

        this.targetEndsWith = targetEndsWith;
        return this;
    }

    /**
     * Get targetEndsWith
     *
     * @return targetEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetEndsWith() {
        return targetEndsWith;
    }

    public void setTargetEndsWith(String targetEndsWith) {
        this.targetEndsWith = targetEndsWith;
    }

    public StorageDevicePathWhereInput targetEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_ENDS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput targetEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_ENDS_WITH);
        return this;
    }

    public void setTargetEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_ENDS_WITH);
        }
    }

    public boolean getTargetEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_ENDS_WITH);
    }

    public StorageDevicePathWhereInput targetGt(String targetGt) {

        this.targetGt = targetGt;
        return this;
    }

    /**
     * Get targetGt
     *
     * @return targetGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetGt() {
        return targetGt;
    }

    public void setTargetGt(String targetGt) {
        this.targetGt = targetGt;
    }

    public StorageDevicePathWhereInput targetGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_GT);
        return this;
    }

    public StorageDevicePathWhereInput targetGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_GT);
        return this;
    }

    public void setTargetGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_GT);
        }
    }

    public boolean getTargetGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_GT);
    }

    public StorageDevicePathWhereInput targetGte(String targetGte) {

        this.targetGte = targetGte;
        return this;
    }

    /**
     * Get targetGte
     *
     * @return targetGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetGte() {
        return targetGte;
    }

    public void setTargetGte(String targetGte) {
        this.targetGte = targetGte;
    }

    public StorageDevicePathWhereInput targetGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_GTE);
        return this;
    }

    public StorageDevicePathWhereInput targetGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_GTE);
        return this;
    }

    public void setTargetGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_GTE);
        }
    }

    public boolean getTargetGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_GTE);
    }

    public StorageDevicePathWhereInput targetIn(List<String> targetIn) {

        this.targetIn = targetIn;
        return this;
    }

    public StorageDevicePathWhereInput addTargetInItem(String targetInItem) {
        if (this.targetIn == null) {
            this.targetIn = new ArrayList<String>();
        }
        this.targetIn.add(targetInItem);
        return this;
    }

    /**
     * Get targetIn
     *
     * @return targetIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getTargetIn() {
        return targetIn;
    }

    public void setTargetIn(List<String> targetIn) {
        this.targetIn = targetIn;
    }

    public StorageDevicePathWhereInput targetIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IN);
        return this;
    }

    public StorageDevicePathWhereInput targetIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IN);
        return this;
    }

    public void setTargetIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IN);
        }
    }

    public boolean getTargetIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IN);
    }

    public StorageDevicePathWhereInput targetLt(String targetLt) {

        this.targetLt = targetLt;
        return this;
    }

    /**
     * Get targetLt
     *
     * @return targetLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetLt() {
        return targetLt;
    }

    public void setTargetLt(String targetLt) {
        this.targetLt = targetLt;
    }

    public StorageDevicePathWhereInput targetLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_LT);
        return this;
    }

    public StorageDevicePathWhereInput targetLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_LT);
        return this;
    }

    public void setTargetLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_LT);
        }
    }

    public boolean getTargetLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_LT);
    }

    public StorageDevicePathWhereInput targetLte(String targetLte) {

        this.targetLte = targetLte;
        return this;
    }

    /**
     * Get targetLte
     *
     * @return targetLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetLte() {
        return targetLte;
    }

    public void setTargetLte(String targetLte) {
        this.targetLte = targetLte;
    }

    public StorageDevicePathWhereInput targetLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_LTE);
        return this;
    }

    public StorageDevicePathWhereInput targetLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_LTE);
        return this;
    }

    public void setTargetLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_LTE);
        }
    }

    public boolean getTargetLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_LTE);
    }

    public StorageDevicePathWhereInput targetNot(String targetNot) {

        this.targetNot = targetNot;
        return this;
    }

    /**
     * Get targetNot
     *
     * @return targetNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetNot() {
        return targetNot;
    }

    public void setTargetNot(String targetNot) {
        this.targetNot = targetNot;
    }

    public StorageDevicePathWhereInput targetNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NOT);
        return this;
    }

    public StorageDevicePathWhereInput targetNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NOT);
        return this;
    }

    public void setTargetNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NOT);
        }
    }

    public boolean getTargetNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NOT);
    }

    public StorageDevicePathWhereInput targetNotContains(String targetNotContains) {

        this.targetNotContains = targetNotContains;
        return this;
    }

    /**
     * Get targetNotContains
     *
     * @return targetNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetNotContains() {
        return targetNotContains;
    }

    public void setTargetNotContains(String targetNotContains) {
        this.targetNotContains = targetNotContains;
    }

    public StorageDevicePathWhereInput targetNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NOT_CONTAINS);
        return this;
    }

    public StorageDevicePathWhereInput targetNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NOT_CONTAINS);
        return this;
    }

    public void setTargetNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NOT_CONTAINS);
        }
    }

    public boolean getTargetNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NOT_CONTAINS);
    }

    public StorageDevicePathWhereInput targetNotEndsWith(String targetNotEndsWith) {

        this.targetNotEndsWith = targetNotEndsWith;
        return this;
    }

    /**
     * Get targetNotEndsWith
     *
     * @return targetNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetNotEndsWith() {
        return targetNotEndsWith;
    }

    public void setTargetNotEndsWith(String targetNotEndsWith) {
        this.targetNotEndsWith = targetNotEndsWith;
    }

    public StorageDevicePathWhereInput targetNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NOT_ENDS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput targetNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NOT_ENDS_WITH);
        return this;
    }

    public void setTargetNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NOT_ENDS_WITH);
        }
    }

    public boolean getTargetNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NOT_ENDS_WITH);
    }

    public StorageDevicePathWhereInput targetNotIn(List<String> targetNotIn) {

        this.targetNotIn = targetNotIn;
        return this;
    }

    public StorageDevicePathWhereInput addTargetNotInItem(String targetNotInItem) {
        if (this.targetNotIn == null) {
            this.targetNotIn = new ArrayList<String>();
        }
        this.targetNotIn.add(targetNotInItem);
        return this;
    }

    /**
     * Get targetNotIn
     *
     * @return targetNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getTargetNotIn() {
        return targetNotIn;
    }

    public void setTargetNotIn(List<String> targetNotIn) {
        this.targetNotIn = targetNotIn;
    }

    public StorageDevicePathWhereInput targetNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NOT_IN);
        return this;
    }

    public StorageDevicePathWhereInput targetNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NOT_IN);
        return this;
    }

    public void setTargetNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NOT_IN);
        }
    }

    public boolean getTargetNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NOT_IN);
    }

    public StorageDevicePathWhereInput targetNotStartsWith(String targetNotStartsWith) {

        this.targetNotStartsWith = targetNotStartsWith;
        return this;
    }

    /**
     * Get targetNotStartsWith
     *
     * @return targetNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetNotStartsWith() {
        return targetNotStartsWith;
    }

    public void setTargetNotStartsWith(String targetNotStartsWith) {
        this.targetNotStartsWith = targetNotStartsWith;
    }

    public StorageDevicePathWhereInput targetNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NOT_STARTS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput targetNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NOT_STARTS_WITH);
        return this;
    }

    public void setTargetNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NOT_STARTS_WITH);
        }
    }

    public boolean getTargetNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NOT_STARTS_WITH);
    }

    public StorageDevicePathWhereInput targetStartsWith(String targetStartsWith) {

        this.targetStartsWith = targetStartsWith;
        return this;
    }

    /**
     * Get targetStartsWith
     *
     * @return targetStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetStartsWith() {
        return targetStartsWith;
    }

    public void setTargetStartsWith(String targetStartsWith) {
        this.targetStartsWith = targetStartsWith;
    }

    public StorageDevicePathWhereInput targetStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_STARTS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput targetStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_STARTS_WITH);
        return this;
    }

    public void setTargetStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_STARTS_WITH);
        }
    }

    public boolean getTargetStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_STARTS_WITH);
    }

    public StorageDevicePathWhereInput transport(String transport) {

        this.transport = transport;
        return this;
    }

    /**
     * Get transport
     *
     * @return transport
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public StorageDevicePathWhereInput transport_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRANSPORT);
        return this;
    }

    public StorageDevicePathWhereInput transport_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT);
        return this;
    }

    public void setTransport_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRANSPORT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT);
        }
    }

    public boolean getTransport_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRANSPORT);
    }

    public StorageDevicePathWhereInput transportContains(String transportContains) {

        this.transportContains = transportContains;
        return this;
    }

    /**
     * Get transportContains
     *
     * @return transportContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTransportContains() {
        return transportContains;
    }

    public void setTransportContains(String transportContains) {
        this.transportContains = transportContains;
    }

    public StorageDevicePathWhereInput transportContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_CONTAINS);
        return this;
    }

    public StorageDevicePathWhereInput transportContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_CONTAINS);
        return this;
    }

    public void setTransportContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_CONTAINS);
        }
    }

    public boolean getTransportContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRANSPORT_CONTAINS);
    }

    public StorageDevicePathWhereInput transportEndsWith(String transportEndsWith) {

        this.transportEndsWith = transportEndsWith;
        return this;
    }

    /**
     * Get transportEndsWith
     *
     * @return transportEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTransportEndsWith() {
        return transportEndsWith;
    }

    public void setTransportEndsWith(String transportEndsWith) {
        this.transportEndsWith = transportEndsWith;
    }

    public StorageDevicePathWhereInput transportEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_ENDS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput transportEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_ENDS_WITH);
        return this;
    }

    public void setTransportEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_ENDS_WITH);
        }
    }

    public boolean getTransportEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRANSPORT_ENDS_WITH);
    }

    public StorageDevicePathWhereInput transportGt(String transportGt) {

        this.transportGt = transportGt;
        return this;
    }

    /**
     * Get transportGt
     *
     * @return transportGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTransportGt() {
        return transportGt;
    }

    public void setTransportGt(String transportGt) {
        this.transportGt = transportGt;
    }

    public StorageDevicePathWhereInput transportGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_GT);
        return this;
    }

    public StorageDevicePathWhereInput transportGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_GT);
        return this;
    }

    public void setTransportGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_GT);
        }
    }

    public boolean getTransportGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRANSPORT_GT);
    }

    public StorageDevicePathWhereInput transportGte(String transportGte) {

        this.transportGte = transportGte;
        return this;
    }

    /**
     * Get transportGte
     *
     * @return transportGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTransportGte() {
        return transportGte;
    }

    public void setTransportGte(String transportGte) {
        this.transportGte = transportGte;
    }

    public StorageDevicePathWhereInput transportGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_GTE);
        return this;
    }

    public StorageDevicePathWhereInput transportGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_GTE);
        return this;
    }

    public void setTransportGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_GTE);
        }
    }

    public boolean getTransportGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRANSPORT_GTE);
    }

    public StorageDevicePathWhereInput transportIn(List<String> transportIn) {

        this.transportIn = transportIn;
        return this;
    }

    public StorageDevicePathWhereInput addTransportInItem(String transportInItem) {
        if (this.transportIn == null) {
            this.transportIn = new ArrayList<String>();
        }
        this.transportIn.add(transportInItem);
        return this;
    }

    /**
     * Get transportIn
     *
     * @return transportIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getTransportIn() {
        return transportIn;
    }

    public void setTransportIn(List<String> transportIn) {
        this.transportIn = transportIn;
    }

    public StorageDevicePathWhereInput transportIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_IN);
        return this;
    }

    public StorageDevicePathWhereInput transportIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_IN);
        return this;
    }

    public void setTransportIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_IN);
        }
    }

    public boolean getTransportIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRANSPORT_IN);
    }

    public StorageDevicePathWhereInput transportLt(String transportLt) {

        this.transportLt = transportLt;
        return this;
    }

    /**
     * Get transportLt
     *
     * @return transportLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTransportLt() {
        return transportLt;
    }

    public void setTransportLt(String transportLt) {
        this.transportLt = transportLt;
    }

    public StorageDevicePathWhereInput transportLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_LT);
        return this;
    }

    public StorageDevicePathWhereInput transportLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_LT);
        return this;
    }

    public void setTransportLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_LT);
        }
    }

    public boolean getTransportLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRANSPORT_LT);
    }

    public StorageDevicePathWhereInput transportLte(String transportLte) {

        this.transportLte = transportLte;
        return this;
    }

    /**
     * Get transportLte
     *
     * @return transportLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTransportLte() {
        return transportLte;
    }

    public void setTransportLte(String transportLte) {
        this.transportLte = transportLte;
    }

    public StorageDevicePathWhereInput transportLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_LTE);
        return this;
    }

    public StorageDevicePathWhereInput transportLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_LTE);
        return this;
    }

    public void setTransportLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_LTE);
        }
    }

    public boolean getTransportLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRANSPORT_LTE);
    }

    public StorageDevicePathWhereInput transportNot(String transportNot) {

        this.transportNot = transportNot;
        return this;
    }

    /**
     * Get transportNot
     *
     * @return transportNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTransportNot() {
        return transportNot;
    }

    public void setTransportNot(String transportNot) {
        this.transportNot = transportNot;
    }

    public StorageDevicePathWhereInput transportNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_NOT);
        return this;
    }

    public StorageDevicePathWhereInput transportNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_NOT);
        return this;
    }

    public void setTransportNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_NOT);
        }
    }

    public boolean getTransportNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRANSPORT_NOT);
    }

    public StorageDevicePathWhereInput transportNotContains(String transportNotContains) {

        this.transportNotContains = transportNotContains;
        return this;
    }

    /**
     * Get transportNotContains
     *
     * @return transportNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTransportNotContains() {
        return transportNotContains;
    }

    public void setTransportNotContains(String transportNotContains) {
        this.transportNotContains = transportNotContains;
    }

    public StorageDevicePathWhereInput transportNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_NOT_CONTAINS);
        return this;
    }

    public StorageDevicePathWhereInput transportNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_NOT_CONTAINS);
        return this;
    }

    public void setTransportNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_NOT_CONTAINS);
        }
    }

    public boolean getTransportNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRANSPORT_NOT_CONTAINS);
    }

    public StorageDevicePathWhereInput transportNotEndsWith(String transportNotEndsWith) {

        this.transportNotEndsWith = transportNotEndsWith;
        return this;
    }

    /**
     * Get transportNotEndsWith
     *
     * @return transportNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTransportNotEndsWith() {
        return transportNotEndsWith;
    }

    public void setTransportNotEndsWith(String transportNotEndsWith) {
        this.transportNotEndsWith = transportNotEndsWith;
    }

    public StorageDevicePathWhereInput transportNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_NOT_ENDS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput transportNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_NOT_ENDS_WITH);
        return this;
    }

    public void setTransportNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_NOT_ENDS_WITH);
        }
    }

    public boolean getTransportNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRANSPORT_NOT_ENDS_WITH);
    }

    public StorageDevicePathWhereInput transportNotIn(List<String> transportNotIn) {

        this.transportNotIn = transportNotIn;
        return this;
    }

    public StorageDevicePathWhereInput addTransportNotInItem(String transportNotInItem) {
        if (this.transportNotIn == null) {
            this.transportNotIn = new ArrayList<String>();
        }
        this.transportNotIn.add(transportNotInItem);
        return this;
    }

    /**
     * Get transportNotIn
     *
     * @return transportNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getTransportNotIn() {
        return transportNotIn;
    }

    public void setTransportNotIn(List<String> transportNotIn) {
        this.transportNotIn = transportNotIn;
    }

    public StorageDevicePathWhereInput transportNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_NOT_IN);
        return this;
    }

    public StorageDevicePathWhereInput transportNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_NOT_IN);
        return this;
    }

    public void setTransportNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_NOT_IN);
        }
    }

    public boolean getTransportNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRANSPORT_NOT_IN);
    }

    public StorageDevicePathWhereInput transportNotStartsWith(String transportNotStartsWith) {

        this.transportNotStartsWith = transportNotStartsWith;
        return this;
    }

    /**
     * Get transportNotStartsWith
     *
     * @return transportNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTransportNotStartsWith() {
        return transportNotStartsWith;
    }

    public void setTransportNotStartsWith(String transportNotStartsWith) {
        this.transportNotStartsWith = transportNotStartsWith;
    }

    public StorageDevicePathWhereInput transportNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_NOT_STARTS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput transportNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_NOT_STARTS_WITH);
        return this;
    }

    public void setTransportNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_NOT_STARTS_WITH);
        }
    }

    public boolean getTransportNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRANSPORT_NOT_STARTS_WITH);
    }

    public StorageDevicePathWhereInput transportStartsWith(String transportStartsWith) {

        this.transportStartsWith = transportStartsWith;
        return this;
    }

    /**
     * Get transportStartsWith
     *
     * @return transportStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTransportStartsWith() {
        return transportStartsWith;
    }

    public void setTransportStartsWith(String transportStartsWith) {
        this.transportStartsWith = transportStartsWith;
    }

    public StorageDevicePathWhereInput transportStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_STARTS_WITH);
        return this;
    }

    public StorageDevicePathWhereInput transportStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_STARTS_WITH);
        return this;
    }

    public void setTransportStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRANSPORT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRANSPORT_STARTS_WITH);
        }
    }

    public boolean getTransportStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRANSPORT_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StorageDevicePathWhereInput storageDevicePathWhereInput = (StorageDevicePathWhereInput) o;
        return Objects.equals(this.AND, storageDevicePathWhereInput.AND)
                && Objects.equals(this.NOT, storageDevicePathWhereInput.NOT)
                && Objects.equals(this.OR, storageDevicePathWhereInput.OR)
                && Objects.equals(this.blockDeviceName, storageDevicePathWhereInput.blockDeviceName)
                && Objects.equals(
                        this.blockDeviceNameContains,
                        storageDevicePathWhereInput.blockDeviceNameContains)
                && Objects.equals(
                        this.blockDeviceNameEndsWith,
                        storageDevicePathWhereInput.blockDeviceNameEndsWith)
                && Objects.equals(
                        this.blockDeviceNameGt, storageDevicePathWhereInput.blockDeviceNameGt)
                && Objects.equals(
                        this.blockDeviceNameGte, storageDevicePathWhereInput.blockDeviceNameGte)
                && Objects.equals(
                        this.blockDeviceNameIn, storageDevicePathWhereInput.blockDeviceNameIn)
                && Objects.equals(
                        this.blockDeviceNameLt, storageDevicePathWhereInput.blockDeviceNameLt)
                && Objects.equals(
                        this.blockDeviceNameLte, storageDevicePathWhereInput.blockDeviceNameLte)
                && Objects.equals(
                        this.blockDeviceNameNot, storageDevicePathWhereInput.blockDeviceNameNot)
                && Objects.equals(
                        this.blockDeviceNameNotContains,
                        storageDevicePathWhereInput.blockDeviceNameNotContains)
                && Objects.equals(
                        this.blockDeviceNameNotEndsWith,
                        storageDevicePathWhereInput.blockDeviceNameNotEndsWith)
                && Objects.equals(
                        this.blockDeviceNameNotIn, storageDevicePathWhereInput.blockDeviceNameNotIn)
                && Objects.equals(
                        this.blockDeviceNameNotStartsWith,
                        storageDevicePathWhereInput.blockDeviceNameNotStartsWith)
                && Objects.equals(
                        this.blockDeviceNameStartsWith,
                        storageDevicePathWhereInput.blockDeviceNameStartsWith)
                && Objects.equals(this.dataVersion, storageDevicePathWhereInput.dataVersion)
                && Objects.equals(this.dataVersionGt, storageDevicePathWhereInput.dataVersionGt)
                && Objects.equals(this.dataVersionGte, storageDevicePathWhereInput.dataVersionGte)
                && Objects.equals(this.dataVersionIn, storageDevicePathWhereInput.dataVersionIn)
                && Objects.equals(this.dataVersionLt, storageDevicePathWhereInput.dataVersionLt)
                && Objects.equals(this.dataVersionLte, storageDevicePathWhereInput.dataVersionLte)
                && Objects.equals(this.dataVersionNot, storageDevicePathWhereInput.dataVersionNot)
                && Objects.equals(
                        this.dataVersionNotIn, storageDevicePathWhereInput.dataVersionNotIn)
                && Objects.equals(this.enabled, storageDevicePathWhereInput.enabled)
                && Objects.equals(this.enabledNot, storageDevicePathWhereInput.enabledNot)
                && Objects.equals(
                        this.entityAsyncStatus, storageDevicePathWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, storageDevicePathWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, storageDevicePathWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        storageDevicePathWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.hostConnection, storageDevicePathWhereInput.hostConnection)
                && Objects.equals(this.id, storageDevicePathWhereInput.id)
                && Objects.equals(this.idContains, storageDevicePathWhereInput.idContains)
                && Objects.equals(this.idEndsWith, storageDevicePathWhereInput.idEndsWith)
                && Objects.equals(this.idGt, storageDevicePathWhereInput.idGt)
                && Objects.equals(this.idGte, storageDevicePathWhereInput.idGte)
                && Objects.equals(this.idIn, storageDevicePathWhereInput.idIn)
                && Objects.equals(this.idLt, storageDevicePathWhereInput.idLt)
                && Objects.equals(this.idLte, storageDevicePathWhereInput.idLte)
                && Objects.equals(this.idNot, storageDevicePathWhereInput.idNot)
                && Objects.equals(this.idNotContains, storageDevicePathWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, storageDevicePathWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, storageDevicePathWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, storageDevicePathWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, storageDevicePathWhereInput.idStartsWith)
                && Objects.equals(this.localHash, storageDevicePathWhereInput.localHash)
                && Objects.equals(
                        this.localHashContains, storageDevicePathWhereInput.localHashContains)
                && Objects.equals(
                        this.localHashEndsWith, storageDevicePathWhereInput.localHashEndsWith)
                && Objects.equals(this.localHashGt, storageDevicePathWhereInput.localHashGt)
                && Objects.equals(this.localHashGte, storageDevicePathWhereInput.localHashGte)
                && Objects.equals(this.localHashIn, storageDevicePathWhereInput.localHashIn)
                && Objects.equals(this.localHashLt, storageDevicePathWhereInput.localHashLt)
                && Objects.equals(this.localHashLte, storageDevicePathWhereInput.localHashLte)
                && Objects.equals(this.localHashNot, storageDevicePathWhereInput.localHashNot)
                && Objects.equals(
                        this.localHashNotContains, storageDevicePathWhereInput.localHashNotContains)
                && Objects.equals(
                        this.localHashNotEndsWith, storageDevicePathWhereInput.localHashNotEndsWith)
                && Objects.equals(this.localHashNotIn, storageDevicePathWhereInput.localHashNotIn)
                && Objects.equals(
                        this.localHashNotStartsWith,
                        storageDevicePathWhereInput.localHashNotStartsWith)
                && Objects.equals(
                        this.localHashStartsWith, storageDevicePathWhereInput.localHashStartsWith)
                && Objects.equals(this.localId, storageDevicePathWhereInput.localId)
                && Objects.equals(this.localIdContains, storageDevicePathWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, storageDevicePathWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, storageDevicePathWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, storageDevicePathWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, storageDevicePathWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, storageDevicePathWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, storageDevicePathWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, storageDevicePathWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, storageDevicePathWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, storageDevicePathWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, storageDevicePathWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, storageDevicePathWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith, storageDevicePathWhereInput.localIdStartsWith)
                && Objects.equals(this.path, storageDevicePathWhereInput.path)
                && Objects.equals(this.pathContains, storageDevicePathWhereInput.pathContains)
                && Objects.equals(this.pathEndsWith, storageDevicePathWhereInput.pathEndsWith)
                && Objects.equals(this.pathGt, storageDevicePathWhereInput.pathGt)
                && Objects.equals(this.pathGte, storageDevicePathWhereInput.pathGte)
                && Objects.equals(this.pathIn, storageDevicePathWhereInput.pathIn)
                && Objects.equals(this.pathLt, storageDevicePathWhereInput.pathLt)
                && Objects.equals(this.pathLte, storageDevicePathWhereInput.pathLte)
                && Objects.equals(this.pathNot, storageDevicePathWhereInput.pathNot)
                && Objects.equals(this.pathNotContains, storageDevicePathWhereInput.pathNotContains)
                && Objects.equals(this.pathNotEndsWith, storageDevicePathWhereInput.pathNotEndsWith)
                && Objects.equals(this.pathNotIn, storageDevicePathWhereInput.pathNotIn)
                && Objects.equals(
                        this.pathNotStartsWith, storageDevicePathWhereInput.pathNotStartsWith)
                && Objects.equals(this.pathStartsWith, storageDevicePathWhereInput.pathStartsWith)
                && Objects.equals(this.runtimeName, storageDevicePathWhereInput.runtimeName)
                && Objects.equals(
                        this.runtimeNameContains, storageDevicePathWhereInput.runtimeNameContains)
                && Objects.equals(
                        this.runtimeNameEndsWith, storageDevicePathWhereInput.runtimeNameEndsWith)
                && Objects.equals(this.runtimeNameGt, storageDevicePathWhereInput.runtimeNameGt)
                && Objects.equals(this.runtimeNameGte, storageDevicePathWhereInput.runtimeNameGte)
                && Objects.equals(this.runtimeNameIn, storageDevicePathWhereInput.runtimeNameIn)
                && Objects.equals(this.runtimeNameLt, storageDevicePathWhereInput.runtimeNameLt)
                && Objects.equals(this.runtimeNameLte, storageDevicePathWhereInput.runtimeNameLte)
                && Objects.equals(this.runtimeNameNot, storageDevicePathWhereInput.runtimeNameNot)
                && Objects.equals(
                        this.runtimeNameNotContains,
                        storageDevicePathWhereInput.runtimeNameNotContains)
                && Objects.equals(
                        this.runtimeNameNotEndsWith,
                        storageDevicePathWhereInput.runtimeNameNotEndsWith)
                && Objects.equals(
                        this.runtimeNameNotIn, storageDevicePathWhereInput.runtimeNameNotIn)
                && Objects.equals(
                        this.runtimeNameNotStartsWith,
                        storageDevicePathWhereInput.runtimeNameNotStartsWith)
                && Objects.equals(
                        this.runtimeNameStartsWith,
                        storageDevicePathWhereInput.runtimeNameStartsWith)
                && Objects.equals(this.state, storageDevicePathWhereInput.state)
                && Objects.equals(this.stateIn, storageDevicePathWhereInput.stateIn)
                && Objects.equals(this.stateNot, storageDevicePathWhereInput.stateNot)
                && Objects.equals(this.stateNotIn, storageDevicePathWhereInput.stateNotIn)
                && Objects.equals(this.storageAdapter, storageDevicePathWhereInput.storageAdapter)
                && Objects.equals(this.storageDevice, storageDevicePathWhereInput.storageDevice)
                && Objects.equals(this.target, storageDevicePathWhereInput.target)
                && Objects.equals(this.targetContains, storageDevicePathWhereInput.targetContains)
                && Objects.equals(this.targetEndsWith, storageDevicePathWhereInput.targetEndsWith)
                && Objects.equals(this.targetGt, storageDevicePathWhereInput.targetGt)
                && Objects.equals(this.targetGte, storageDevicePathWhereInput.targetGte)
                && Objects.equals(this.targetIn, storageDevicePathWhereInput.targetIn)
                && Objects.equals(this.targetLt, storageDevicePathWhereInput.targetLt)
                && Objects.equals(this.targetLte, storageDevicePathWhereInput.targetLte)
                && Objects.equals(this.targetNot, storageDevicePathWhereInput.targetNot)
                && Objects.equals(
                        this.targetNotContains, storageDevicePathWhereInput.targetNotContains)
                && Objects.equals(
                        this.targetNotEndsWith, storageDevicePathWhereInput.targetNotEndsWith)
                && Objects.equals(this.targetNotIn, storageDevicePathWhereInput.targetNotIn)
                && Objects.equals(
                        this.targetNotStartsWith, storageDevicePathWhereInput.targetNotStartsWith)
                && Objects.equals(
                        this.targetStartsWith, storageDevicePathWhereInput.targetStartsWith)
                && Objects.equals(this.transport, storageDevicePathWhereInput.transport)
                && Objects.equals(
                        this.transportContains, storageDevicePathWhereInput.transportContains)
                && Objects.equals(
                        this.transportEndsWith, storageDevicePathWhereInput.transportEndsWith)
                && Objects.equals(this.transportGt, storageDevicePathWhereInput.transportGt)
                && Objects.equals(this.transportGte, storageDevicePathWhereInput.transportGte)
                && Objects.equals(this.transportIn, storageDevicePathWhereInput.transportIn)
                && Objects.equals(this.transportLt, storageDevicePathWhereInput.transportLt)
                && Objects.equals(this.transportLte, storageDevicePathWhereInput.transportLte)
                && Objects.equals(this.transportNot, storageDevicePathWhereInput.transportNot)
                && Objects.equals(
                        this.transportNotContains, storageDevicePathWhereInput.transportNotContains)
                && Objects.equals(
                        this.transportNotEndsWith, storageDevicePathWhereInput.transportNotEndsWith)
                && Objects.equals(this.transportNotIn, storageDevicePathWhereInput.transportNotIn)
                && Objects.equals(
                        this.transportNotStartsWith,
                        storageDevicePathWhereInput.transportNotStartsWith)
                && Objects.equals(
                        this.transportStartsWith, storageDevicePathWhereInput.transportStartsWith);
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
                blockDeviceName,
                blockDeviceNameContains,
                blockDeviceNameEndsWith,
                blockDeviceNameGt,
                blockDeviceNameGte,
                blockDeviceNameIn,
                blockDeviceNameLt,
                blockDeviceNameLte,
                blockDeviceNameNot,
                blockDeviceNameNotContains,
                blockDeviceNameNotEndsWith,
                blockDeviceNameNotIn,
                blockDeviceNameNotStartsWith,
                blockDeviceNameStartsWith,
                dataVersion,
                dataVersionGt,
                dataVersionGte,
                dataVersionIn,
                dataVersionLt,
                dataVersionLte,
                dataVersionNot,
                dataVersionNotIn,
                enabled,
                enabledNot,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                hostConnection,
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
                localHash,
                localHashContains,
                localHashEndsWith,
                localHashGt,
                localHashGte,
                localHashIn,
                localHashLt,
                localHashLte,
                localHashNot,
                localHashNotContains,
                localHashNotEndsWith,
                localHashNotIn,
                localHashNotStartsWith,
                localHashStartsWith,
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
                path,
                pathContains,
                pathEndsWith,
                pathGt,
                pathGte,
                pathIn,
                pathLt,
                pathLte,
                pathNot,
                pathNotContains,
                pathNotEndsWith,
                pathNotIn,
                pathNotStartsWith,
                pathStartsWith,
                runtimeName,
                runtimeNameContains,
                runtimeNameEndsWith,
                runtimeNameGt,
                runtimeNameGte,
                runtimeNameIn,
                runtimeNameLt,
                runtimeNameLte,
                runtimeNameNot,
                runtimeNameNotContains,
                runtimeNameNotEndsWith,
                runtimeNameNotIn,
                runtimeNameNotStartsWith,
                runtimeNameStartsWith,
                state,
                stateIn,
                stateNot,
                stateNotIn,
                storageAdapter,
                storageDevice,
                target,
                targetContains,
                targetEndsWith,
                targetGt,
                targetGte,
                targetIn,
                targetLt,
                targetLte,
                targetNot,
                targetNotContains,
                targetNotEndsWith,
                targetNotIn,
                targetNotStartsWith,
                targetStartsWith,
                transport,
                transportContains,
                transportEndsWith,
                transportGt,
                transportGte,
                transportIn,
                transportLt,
                transportLte,
                transportNot,
                transportNotContains,
                transportNotEndsWith,
                transportNotIn,
                transportNotStartsWith,
                transportStartsWith);
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
        sb.append("class StorageDevicePathWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    blockDeviceName: ").append(toIndentedString(blockDeviceName)).append("\n");
        sb.append("    blockDeviceNameContains: ")
                .append(toIndentedString(blockDeviceNameContains))
                .append("\n");
        sb.append("    blockDeviceNameEndsWith: ")
                .append(toIndentedString(blockDeviceNameEndsWith))
                .append("\n");
        sb.append("    blockDeviceNameGt: ")
                .append(toIndentedString(blockDeviceNameGt))
                .append("\n");
        sb.append("    blockDeviceNameGte: ")
                .append(toIndentedString(blockDeviceNameGte))
                .append("\n");
        sb.append("    blockDeviceNameIn: ")
                .append(toIndentedString(blockDeviceNameIn))
                .append("\n");
        sb.append("    blockDeviceNameLt: ")
                .append(toIndentedString(blockDeviceNameLt))
                .append("\n");
        sb.append("    blockDeviceNameLte: ")
                .append(toIndentedString(blockDeviceNameLte))
                .append("\n");
        sb.append("    blockDeviceNameNot: ")
                .append(toIndentedString(blockDeviceNameNot))
                .append("\n");
        sb.append("    blockDeviceNameNotContains: ")
                .append(toIndentedString(blockDeviceNameNotContains))
                .append("\n");
        sb.append("    blockDeviceNameNotEndsWith: ")
                .append(toIndentedString(blockDeviceNameNotEndsWith))
                .append("\n");
        sb.append("    blockDeviceNameNotIn: ")
                .append(toIndentedString(blockDeviceNameNotIn))
                .append("\n");
        sb.append("    blockDeviceNameNotStartsWith: ")
                .append(toIndentedString(blockDeviceNameNotStartsWith))
                .append("\n");
        sb.append("    blockDeviceNameStartsWith: ")
                .append(toIndentedString(blockDeviceNameStartsWith))
                .append("\n");
        sb.append("    dataVersion: ").append(toIndentedString(dataVersion)).append("\n");
        sb.append("    dataVersionGt: ").append(toIndentedString(dataVersionGt)).append("\n");
        sb.append("    dataVersionGte: ").append(toIndentedString(dataVersionGte)).append("\n");
        sb.append("    dataVersionIn: ").append(toIndentedString(dataVersionIn)).append("\n");
        sb.append("    dataVersionLt: ").append(toIndentedString(dataVersionLt)).append("\n");
        sb.append("    dataVersionLte: ").append(toIndentedString(dataVersionLte)).append("\n");
        sb.append("    dataVersionNot: ").append(toIndentedString(dataVersionNot)).append("\n");
        sb.append("    dataVersionNotIn: ").append(toIndentedString(dataVersionNotIn)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    enabledNot: ").append(toIndentedString(enabledNot)).append("\n");
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
        sb.append("    hostConnection: ").append(toIndentedString(hostConnection)).append("\n");
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
        sb.append("    localHash: ").append(toIndentedString(localHash)).append("\n");
        sb.append("    localHashContains: ")
                .append(toIndentedString(localHashContains))
                .append("\n");
        sb.append("    localHashEndsWith: ")
                .append(toIndentedString(localHashEndsWith))
                .append("\n");
        sb.append("    localHashGt: ").append(toIndentedString(localHashGt)).append("\n");
        sb.append("    localHashGte: ").append(toIndentedString(localHashGte)).append("\n");
        sb.append("    localHashIn: ").append(toIndentedString(localHashIn)).append("\n");
        sb.append("    localHashLt: ").append(toIndentedString(localHashLt)).append("\n");
        sb.append("    localHashLte: ").append(toIndentedString(localHashLte)).append("\n");
        sb.append("    localHashNot: ").append(toIndentedString(localHashNot)).append("\n");
        sb.append("    localHashNotContains: ")
                .append(toIndentedString(localHashNotContains))
                .append("\n");
        sb.append("    localHashNotEndsWith: ")
                .append(toIndentedString(localHashNotEndsWith))
                .append("\n");
        sb.append("    localHashNotIn: ").append(toIndentedString(localHashNotIn)).append("\n");
        sb.append("    localHashNotStartsWith: ")
                .append(toIndentedString(localHashNotStartsWith))
                .append("\n");
        sb.append("    localHashStartsWith: ")
                .append(toIndentedString(localHashStartsWith))
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
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    pathContains: ").append(toIndentedString(pathContains)).append("\n");
        sb.append("    pathEndsWith: ").append(toIndentedString(pathEndsWith)).append("\n");
        sb.append("    pathGt: ").append(toIndentedString(pathGt)).append("\n");
        sb.append("    pathGte: ").append(toIndentedString(pathGte)).append("\n");
        sb.append("    pathIn: ").append(toIndentedString(pathIn)).append("\n");
        sb.append("    pathLt: ").append(toIndentedString(pathLt)).append("\n");
        sb.append("    pathLte: ").append(toIndentedString(pathLte)).append("\n");
        sb.append("    pathNot: ").append(toIndentedString(pathNot)).append("\n");
        sb.append("    pathNotContains: ").append(toIndentedString(pathNotContains)).append("\n");
        sb.append("    pathNotEndsWith: ").append(toIndentedString(pathNotEndsWith)).append("\n");
        sb.append("    pathNotIn: ").append(toIndentedString(pathNotIn)).append("\n");
        sb.append("    pathNotStartsWith: ")
                .append(toIndentedString(pathNotStartsWith))
                .append("\n");
        sb.append("    pathStartsWith: ").append(toIndentedString(pathStartsWith)).append("\n");
        sb.append("    runtimeName: ").append(toIndentedString(runtimeName)).append("\n");
        sb.append("    runtimeNameContains: ")
                .append(toIndentedString(runtimeNameContains))
                .append("\n");
        sb.append("    runtimeNameEndsWith: ")
                .append(toIndentedString(runtimeNameEndsWith))
                .append("\n");
        sb.append("    runtimeNameGt: ").append(toIndentedString(runtimeNameGt)).append("\n");
        sb.append("    runtimeNameGte: ").append(toIndentedString(runtimeNameGte)).append("\n");
        sb.append("    runtimeNameIn: ").append(toIndentedString(runtimeNameIn)).append("\n");
        sb.append("    runtimeNameLt: ").append(toIndentedString(runtimeNameLt)).append("\n");
        sb.append("    runtimeNameLte: ").append(toIndentedString(runtimeNameLte)).append("\n");
        sb.append("    runtimeNameNot: ").append(toIndentedString(runtimeNameNot)).append("\n");
        sb.append("    runtimeNameNotContains: ")
                .append(toIndentedString(runtimeNameNotContains))
                .append("\n");
        sb.append("    runtimeNameNotEndsWith: ")
                .append(toIndentedString(runtimeNameNotEndsWith))
                .append("\n");
        sb.append("    runtimeNameNotIn: ").append(toIndentedString(runtimeNameNotIn)).append("\n");
        sb.append("    runtimeNameNotStartsWith: ")
                .append(toIndentedString(runtimeNameNotStartsWith))
                .append("\n");
        sb.append("    runtimeNameStartsWith: ")
                .append(toIndentedString(runtimeNameStartsWith))
                .append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateIn: ").append(toIndentedString(stateIn)).append("\n");
        sb.append("    stateNot: ").append(toIndentedString(stateNot)).append("\n");
        sb.append("    stateNotIn: ").append(toIndentedString(stateNotIn)).append("\n");
        sb.append("    storageAdapter: ").append(toIndentedString(storageAdapter)).append("\n");
        sb.append("    storageDevice: ").append(toIndentedString(storageDevice)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    targetContains: ").append(toIndentedString(targetContains)).append("\n");
        sb.append("    targetEndsWith: ").append(toIndentedString(targetEndsWith)).append("\n");
        sb.append("    targetGt: ").append(toIndentedString(targetGt)).append("\n");
        sb.append("    targetGte: ").append(toIndentedString(targetGte)).append("\n");
        sb.append("    targetIn: ").append(toIndentedString(targetIn)).append("\n");
        sb.append("    targetLt: ").append(toIndentedString(targetLt)).append("\n");
        sb.append("    targetLte: ").append(toIndentedString(targetLte)).append("\n");
        sb.append("    targetNot: ").append(toIndentedString(targetNot)).append("\n");
        sb.append("    targetNotContains: ")
                .append(toIndentedString(targetNotContains))
                .append("\n");
        sb.append("    targetNotEndsWith: ")
                .append(toIndentedString(targetNotEndsWith))
                .append("\n");
        sb.append("    targetNotIn: ").append(toIndentedString(targetNotIn)).append("\n");
        sb.append("    targetNotStartsWith: ")
                .append(toIndentedString(targetNotStartsWith))
                .append("\n");
        sb.append("    targetStartsWith: ").append(toIndentedString(targetStartsWith)).append("\n");
        sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
        sb.append("    transportContains: ")
                .append(toIndentedString(transportContains))
                .append("\n");
        sb.append("    transportEndsWith: ")
                .append(toIndentedString(transportEndsWith))
                .append("\n");
        sb.append("    transportGt: ").append(toIndentedString(transportGt)).append("\n");
        sb.append("    transportGte: ").append(toIndentedString(transportGte)).append("\n");
        sb.append("    transportIn: ").append(toIndentedString(transportIn)).append("\n");
        sb.append("    transportLt: ").append(toIndentedString(transportLt)).append("\n");
        sb.append("    transportLte: ").append(toIndentedString(transportLte)).append("\n");
        sb.append("    transportNot: ").append(toIndentedString(transportNot)).append("\n");
        sb.append("    transportNotContains: ")
                .append(toIndentedString(transportNotContains))
                .append("\n");
        sb.append("    transportNotEndsWith: ")
                .append(toIndentedString(transportNotEndsWith))
                .append("\n");
        sb.append("    transportNotIn: ").append(toIndentedString(transportNotIn)).append("\n");
        sb.append("    transportNotStartsWith: ")
                .append(toIndentedString(transportNotStartsWith))
                .append("\n");
        sb.append("    transportStartsWith: ")
                .append(toIndentedString(transportStartsWith))
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
