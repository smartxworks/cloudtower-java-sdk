package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** StorageDeviceWhereInput */
@javax.annotation.Generated(value = "JavaCloudTowerClientCodegen")
public class StorageDeviceWhereInput
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<StorageDeviceWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<StorageDeviceWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<StorageDeviceWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_DATASTORE_INFO = "datastore_info";

    @SerializedName(SERIALIZED_NAME_DATASTORE_INFO)
    private String datastoreInfo;

    public static final String SERIALIZED_NAME_DATASTORE_INFO_CONTAINS = "datastore_info_contains";

    @SerializedName(SERIALIZED_NAME_DATASTORE_INFO_CONTAINS)
    private String datastoreInfoContains;

    public static final String SERIALIZED_NAME_DATASTORE_INFO_ENDS_WITH =
            "datastore_info_ends_with";

    @SerializedName(SERIALIZED_NAME_DATASTORE_INFO_ENDS_WITH)
    private String datastoreInfoEndsWith;

    public static final String SERIALIZED_NAME_DATASTORE_INFO_GT = "datastore_info_gt";

    @SerializedName(SERIALIZED_NAME_DATASTORE_INFO_GT)
    private String datastoreInfoGt;

    public static final String SERIALIZED_NAME_DATASTORE_INFO_GTE = "datastore_info_gte";

    @SerializedName(SERIALIZED_NAME_DATASTORE_INFO_GTE)
    private String datastoreInfoGte;

    public static final String SERIALIZED_NAME_DATASTORE_INFO_IN = "datastore_info_in";

    @SerializedName(SERIALIZED_NAME_DATASTORE_INFO_IN)
    private List<String> datastoreInfoIn = null;

    public static final String SERIALIZED_NAME_DATASTORE_INFO_LT = "datastore_info_lt";

    @SerializedName(SERIALIZED_NAME_DATASTORE_INFO_LT)
    private String datastoreInfoLt;

    public static final String SERIALIZED_NAME_DATASTORE_INFO_LTE = "datastore_info_lte";

    @SerializedName(SERIALIZED_NAME_DATASTORE_INFO_LTE)
    private String datastoreInfoLte;

    public static final String SERIALIZED_NAME_DATASTORE_INFO_NOT = "datastore_info_not";

    @SerializedName(SERIALIZED_NAME_DATASTORE_INFO_NOT)
    private String datastoreInfoNot;

    public static final String SERIALIZED_NAME_DATASTORE_INFO_NOT_CONTAINS =
            "datastore_info_not_contains";

    @SerializedName(SERIALIZED_NAME_DATASTORE_INFO_NOT_CONTAINS)
    private String datastoreInfoNotContains;

    public static final String SERIALIZED_NAME_DATASTORE_INFO_NOT_ENDS_WITH =
            "datastore_info_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DATASTORE_INFO_NOT_ENDS_WITH)
    private String datastoreInfoNotEndsWith;

    public static final String SERIALIZED_NAME_DATASTORE_INFO_NOT_IN = "datastore_info_not_in";

    @SerializedName(SERIALIZED_NAME_DATASTORE_INFO_NOT_IN)
    private List<String> datastoreInfoNotIn = null;

    public static final String SERIALIZED_NAME_DATASTORE_INFO_NOT_STARTS_WITH =
            "datastore_info_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DATASTORE_INFO_NOT_STARTS_WITH)
    private String datastoreInfoNotStartsWith;

    public static final String SERIALIZED_NAME_DATASTORE_INFO_STARTS_WITH =
            "datastore_info_starts_with";

    @SerializedName(SERIALIZED_NAME_DATASTORE_INFO_STARTS_WITH)
    private String datastoreInfoStartsWith;

    public static final String SERIALIZED_NAME_DATASTORES_EVERY = "datastores_every";

    @SerializedName(SERIALIZED_NAME_DATASTORES_EVERY)
    private DatastoreWhereInput datastoresEvery;

    public static final String SERIALIZED_NAME_DATASTORES_NONE = "datastores_none";

    @SerializedName(SERIALIZED_NAME_DATASTORES_NONE)
    private DatastoreWhereInput datastoresNone;

    public static final String SERIALIZED_NAME_DATASTORES_SOME = "datastores_some";

    @SerializedName(SERIALIZED_NAME_DATASTORES_SOME)
    private DatastoreWhereInput datastoresSome;

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

    public static final String SERIALIZED_NAME_HARDWARE_ACCELERATION = "hardware_acceleration";

    @SerializedName(SERIALIZED_NAME_HARDWARE_ACCELERATION)
    private Boolean hardwareAcceleration;

    public static final String SERIALIZED_NAME_HARDWARE_ACCELERATION_NOT =
            "hardware_acceleration_not";

    @SerializedName(SERIALIZED_NAME_HARDWARE_ACCELERATION_NOT)
    private Boolean hardwareAccelerationNot;

    public static final String SERIALIZED_NAME_HOST_CONNECTIONS_EVERY = "host_connections_every";

    @SerializedName(SERIALIZED_NAME_HOST_CONNECTIONS_EVERY)
    private StorageDeviceHostConnectionWhereInput hostConnectionsEvery;

    public static final String SERIALIZED_NAME_HOST_CONNECTIONS_NONE = "host_connections_none";

    @SerializedName(SERIALIZED_NAME_HOST_CONNECTIONS_NONE)
    private StorageDeviceHostConnectionWhereInput hostConnectionsNone;

    public static final String SERIALIZED_NAME_HOST_CONNECTIONS_SOME = "host_connections_some";

    @SerializedName(SERIALIZED_NAME_HOST_CONNECTIONS_SOME)
    private StorageDeviceHostConnectionWhereInput hostConnectionsSome;

    public static final String SERIALIZED_NAME_HOSTS_EVERY = "hosts_every";

    @SerializedName(SERIALIZED_NAME_HOSTS_EVERY)
    private HostWhereInput hostsEvery;

    public static final String SERIALIZED_NAME_HOSTS_NONE = "hosts_none";

    @SerializedName(SERIALIZED_NAME_HOSTS_NONE)
    private HostWhereInput hostsNone;

    public static final String SERIALIZED_NAME_HOSTS_SOME = "hosts_some";

    @SerializedName(SERIALIZED_NAME_HOSTS_SOME)
    private HostWhereInput hostsSome;

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

    public static final String SERIALIZED_NAME_LUN_ID = "lun_id";

    @SerializedName(SERIALIZED_NAME_LUN_ID)
    private String lunId;

    public static final String SERIALIZED_NAME_LUN_ID_CONTAINS = "lun_id_contains";

    @SerializedName(SERIALIZED_NAME_LUN_ID_CONTAINS)
    private String lunIdContains;

    public static final String SERIALIZED_NAME_LUN_ID_ENDS_WITH = "lun_id_ends_with";

    @SerializedName(SERIALIZED_NAME_LUN_ID_ENDS_WITH)
    private String lunIdEndsWith;

    public static final String SERIALIZED_NAME_LUN_ID_GT = "lun_id_gt";

    @SerializedName(SERIALIZED_NAME_LUN_ID_GT)
    private String lunIdGt;

    public static final String SERIALIZED_NAME_LUN_ID_GTE = "lun_id_gte";

    @SerializedName(SERIALIZED_NAME_LUN_ID_GTE)
    private String lunIdGte;

    public static final String SERIALIZED_NAME_LUN_ID_IN = "lun_id_in";

    @SerializedName(SERIALIZED_NAME_LUN_ID_IN)
    private List<String> lunIdIn = null;

    public static final String SERIALIZED_NAME_LUN_ID_LT = "lun_id_lt";

    @SerializedName(SERIALIZED_NAME_LUN_ID_LT)
    private String lunIdLt;

    public static final String SERIALIZED_NAME_LUN_ID_LTE = "lun_id_lte";

    @SerializedName(SERIALIZED_NAME_LUN_ID_LTE)
    private String lunIdLte;

    public static final String SERIALIZED_NAME_LUN_ID_NOT = "lun_id_not";

    @SerializedName(SERIALIZED_NAME_LUN_ID_NOT)
    private String lunIdNot;

    public static final String SERIALIZED_NAME_LUN_ID_NOT_CONTAINS = "lun_id_not_contains";

    @SerializedName(SERIALIZED_NAME_LUN_ID_NOT_CONTAINS)
    private String lunIdNotContains;

    public static final String SERIALIZED_NAME_LUN_ID_NOT_ENDS_WITH = "lun_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_LUN_ID_NOT_ENDS_WITH)
    private String lunIdNotEndsWith;

    public static final String SERIALIZED_NAME_LUN_ID_NOT_IN = "lun_id_not_in";

    @SerializedName(SERIALIZED_NAME_LUN_ID_NOT_IN)
    private List<String> lunIdNotIn = null;

    public static final String SERIALIZED_NAME_LUN_ID_NOT_STARTS_WITH = "lun_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LUN_ID_NOT_STARTS_WITH)
    private String lunIdNotStartsWith;

    public static final String SERIALIZED_NAME_LUN_ID_STARTS_WITH = "lun_id_starts_with";

    @SerializedName(SERIALIZED_NAME_LUN_ID_STARTS_WITH)
    private String lunIdStartsWith;

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

    public static final String SERIALIZED_NAME_SECTOR_FORMAT = "sector_format";

    @SerializedName(SERIALIZED_NAME_SECTOR_FORMAT)
    private String sectorFormat;

    public static final String SERIALIZED_NAME_SECTOR_FORMAT_CONTAINS = "sector_format_contains";

    @SerializedName(SERIALIZED_NAME_SECTOR_FORMAT_CONTAINS)
    private String sectorFormatContains;

    public static final String SERIALIZED_NAME_SECTOR_FORMAT_ENDS_WITH = "sector_format_ends_with";

    @SerializedName(SERIALIZED_NAME_SECTOR_FORMAT_ENDS_WITH)
    private String sectorFormatEndsWith;

    public static final String SERIALIZED_NAME_SECTOR_FORMAT_GT = "sector_format_gt";

    @SerializedName(SERIALIZED_NAME_SECTOR_FORMAT_GT)
    private String sectorFormatGt;

    public static final String SERIALIZED_NAME_SECTOR_FORMAT_GTE = "sector_format_gte";

    @SerializedName(SERIALIZED_NAME_SECTOR_FORMAT_GTE)
    private String sectorFormatGte;

    public static final String SERIALIZED_NAME_SECTOR_FORMAT_IN = "sector_format_in";

    @SerializedName(SERIALIZED_NAME_SECTOR_FORMAT_IN)
    private List<String> sectorFormatIn = null;

    public static final String SERIALIZED_NAME_SECTOR_FORMAT_LT = "sector_format_lt";

    @SerializedName(SERIALIZED_NAME_SECTOR_FORMAT_LT)
    private String sectorFormatLt;

    public static final String SERIALIZED_NAME_SECTOR_FORMAT_LTE = "sector_format_lte";

    @SerializedName(SERIALIZED_NAME_SECTOR_FORMAT_LTE)
    private String sectorFormatLte;

    public static final String SERIALIZED_NAME_SECTOR_FORMAT_NOT = "sector_format_not";

    @SerializedName(SERIALIZED_NAME_SECTOR_FORMAT_NOT)
    private String sectorFormatNot;

    public static final String SERIALIZED_NAME_SECTOR_FORMAT_NOT_CONTAINS =
            "sector_format_not_contains";

    @SerializedName(SERIALIZED_NAME_SECTOR_FORMAT_NOT_CONTAINS)
    private String sectorFormatNotContains;

    public static final String SERIALIZED_NAME_SECTOR_FORMAT_NOT_ENDS_WITH =
            "sector_format_not_ends_with";

    @SerializedName(SERIALIZED_NAME_SECTOR_FORMAT_NOT_ENDS_WITH)
    private String sectorFormatNotEndsWith;

    public static final String SERIALIZED_NAME_SECTOR_FORMAT_NOT_IN = "sector_format_not_in";

    @SerializedName(SERIALIZED_NAME_SECTOR_FORMAT_NOT_IN)
    private List<String> sectorFormatNotIn = null;

    public static final String SERIALIZED_NAME_SECTOR_FORMAT_NOT_STARTS_WITH =
            "sector_format_not_starts_with";

    @SerializedName(SERIALIZED_NAME_SECTOR_FORMAT_NOT_STARTS_WITH)
    private String sectorFormatNotStartsWith;

    public static final String SERIALIZED_NAME_SECTOR_FORMAT_STARTS_WITH =
            "sector_format_starts_with";

    @SerializedName(SERIALIZED_NAME_SECTOR_FORMAT_STARTS_WITH)
    private String sectorFormatStartsWith;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Double size;

    public static final String SERIALIZED_NAME_SIZE_GT = "size_gt";

    @SerializedName(SERIALIZED_NAME_SIZE_GT)
    private Double sizeGt;

    public static final String SERIALIZED_NAME_SIZE_GTE = "size_gte";

    @SerializedName(SERIALIZED_NAME_SIZE_GTE)
    private Double sizeGte;

    public static final String SERIALIZED_NAME_SIZE_IN = "size_in";

    @SerializedName(SERIALIZED_NAME_SIZE_IN)
    private List<Double> sizeIn = null;

    public static final String SERIALIZED_NAME_SIZE_LT = "size_lt";

    @SerializedName(SERIALIZED_NAME_SIZE_LT)
    private Double sizeLt;

    public static final String SERIALIZED_NAME_SIZE_LTE = "size_lte";

    @SerializedName(SERIALIZED_NAME_SIZE_LTE)
    private Double sizeLte;

    public static final String SERIALIZED_NAME_SIZE_NOT = "size_not";

    @SerializedName(SERIALIZED_NAME_SIZE_NOT)
    private Double sizeNot;

    public static final String SERIALIZED_NAME_SIZE_NOT_IN = "size_not_in";

    @SerializedName(SERIALIZED_NAME_SIZE_NOT_IN)
    private List<Double> sizeNotIn = null;

    public static final String SERIALIZED_NAME_STORAGE_DEVICE_PATHS_EVERY =
            "storage_device_paths_every";

    @SerializedName(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_EVERY)
    private StorageDevicePathWhereInput storageDevicePathsEvery;

    public static final String SERIALIZED_NAME_STORAGE_DEVICE_PATHS_NONE =
            "storage_device_paths_none";

    @SerializedName(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_NONE)
    private StorageDevicePathWhereInput storageDevicePathsNone;

    public static final String SERIALIZED_NAME_STORAGE_DEVICE_PATHS_SOME =
            "storage_device_paths_some";

    @SerializedName(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_SOME)
    private StorageDevicePathWhereInput storageDevicePathsSome;

    public static final String SERIALIZED_NAME_TARGET_NUM = "target_num";

    @SerializedName(SERIALIZED_NAME_TARGET_NUM)
    private Integer targetNum;

    public static final String SERIALIZED_NAME_TARGET_NUM_GT = "target_num_gt";

    @SerializedName(SERIALIZED_NAME_TARGET_NUM_GT)
    private Integer targetNumGt;

    public static final String SERIALIZED_NAME_TARGET_NUM_GTE = "target_num_gte";

    @SerializedName(SERIALIZED_NAME_TARGET_NUM_GTE)
    private Integer targetNumGte;

    public static final String SERIALIZED_NAME_TARGET_NUM_IN = "target_num_in";

    @SerializedName(SERIALIZED_NAME_TARGET_NUM_IN)
    private List<Integer> targetNumIn = null;

    public static final String SERIALIZED_NAME_TARGET_NUM_LT = "target_num_lt";

    @SerializedName(SERIALIZED_NAME_TARGET_NUM_LT)
    private Integer targetNumLt;

    public static final String SERIALIZED_NAME_TARGET_NUM_LTE = "target_num_lte";

    @SerializedName(SERIALIZED_NAME_TARGET_NUM_LTE)
    private Integer targetNumLte;

    public static final String SERIALIZED_NAME_TARGET_NUM_NOT = "target_num_not";

    @SerializedName(SERIALIZED_NAME_TARGET_NUM_NOT)
    private Integer targetNumNot;

    public static final String SERIALIZED_NAME_TARGET_NUM_NOT_IN = "target_num_not_in";

    @SerializedName(SERIALIZED_NAME_TARGET_NUM_NOT_IN)
    private List<Integer> targetNumNotIn = null;

    public StorageDeviceWhereInput() {}

    public StorageDeviceWhereInput AND(List<StorageDeviceWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public StorageDeviceWhereInput addANDItem(StorageDeviceWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<StorageDeviceWhereInput>();
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
    public List<StorageDeviceWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<StorageDeviceWhereInput> AND) {
        this.AND = AND;
    }

    public StorageDeviceWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public StorageDeviceWhereInput AND_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput NOT(List<StorageDeviceWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public StorageDeviceWhereInput addNOTItem(StorageDeviceWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<StorageDeviceWhereInput>();
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
    public List<StorageDeviceWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<StorageDeviceWhereInput> NOT) {
        this.NOT = NOT;
    }

    public StorageDeviceWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public StorageDeviceWhereInput NOT_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput OR(List<StorageDeviceWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public StorageDeviceWhereInput addORItem(StorageDeviceWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<StorageDeviceWhereInput>();
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
    public List<StorageDeviceWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<StorageDeviceWhereInput> OR) {
        this.OR = OR;
    }

    public StorageDeviceWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public StorageDeviceWhereInput OR_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput dataVersion(Integer dataVersion) {

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

    public StorageDeviceWhereInput dataVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION);
        return this;
    }

    public StorageDeviceWhereInput dataVersion_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput dataVersionGt(Integer dataVersionGt) {

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

    public StorageDeviceWhereInput dataVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GT);
        return this;
    }

    public StorageDeviceWhereInput dataVersionGt_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput dataVersionGte(Integer dataVersionGte) {

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

    public StorageDeviceWhereInput dataVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GTE);
        return this;
    }

    public StorageDeviceWhereInput dataVersionGte_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput dataVersionIn(List<Integer> dataVersionIn) {

        this.dataVersionIn = dataVersionIn;
        return this;
    }

    public StorageDeviceWhereInput addDataVersionInItem(Integer dataVersionInItem) {
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

    public StorageDeviceWhereInput dataVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_IN);
        return this;
    }

    public StorageDeviceWhereInput dataVersionIn_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput dataVersionLt(Integer dataVersionLt) {

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

    public StorageDeviceWhereInput dataVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LT);
        return this;
    }

    public StorageDeviceWhereInput dataVersionLt_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput dataVersionLte(Integer dataVersionLte) {

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

    public StorageDeviceWhereInput dataVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LTE);
        return this;
    }

    public StorageDeviceWhereInput dataVersionLte_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput dataVersionNot(Integer dataVersionNot) {

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

    public StorageDeviceWhereInput dataVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT);
        return this;
    }

    public StorageDeviceWhereInput dataVersionNot_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput dataVersionNotIn(List<Integer> dataVersionNotIn) {

        this.dataVersionNotIn = dataVersionNotIn;
        return this;
    }

    public StorageDeviceWhereInput addDataVersionNotInItem(Integer dataVersionNotInItem) {
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

    public StorageDeviceWhereInput dataVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
        return this;
    }

    public StorageDeviceWhereInput dataVersionNotIn_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput datastoreInfo(String datastoreInfo) {

        this.datastoreInfo = datastoreInfo;
        return this;
    }

    /**
     * Get datastoreInfo
     *
     * @return datastoreInfo
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDatastoreInfo() {
        return datastoreInfo;
    }

    public void setDatastoreInfo(String datastoreInfo) {
        this.datastoreInfo = datastoreInfo;
    }

    public StorageDeviceWhereInput datastoreInfo_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO);
        return this;
    }

    public StorageDeviceWhereInput datastoreInfo_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO);
        return this;
    }

    public void setDatastoreInfo_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO);
        }
    }

    public boolean getDatastoreInfo_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_INFO);
    }

    public StorageDeviceWhereInput datastoreInfoContains(String datastoreInfoContains) {

        this.datastoreInfoContains = datastoreInfoContains;
        return this;
    }

    /**
     * Get datastoreInfoContains
     *
     * @return datastoreInfoContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDatastoreInfoContains() {
        return datastoreInfoContains;
    }

    public void setDatastoreInfoContains(String datastoreInfoContains) {
        this.datastoreInfoContains = datastoreInfoContains;
    }

    public StorageDeviceWhereInput datastoreInfoContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_CONTAINS);
        return this;
    }

    public StorageDeviceWhereInput datastoreInfoContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_CONTAINS);
        return this;
    }

    public void setDatastoreInfoContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_CONTAINS);
        }
    }

    public boolean getDatastoreInfoContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_INFO_CONTAINS);
    }

    public StorageDeviceWhereInput datastoreInfoEndsWith(String datastoreInfoEndsWith) {

        this.datastoreInfoEndsWith = datastoreInfoEndsWith;
        return this;
    }

    /**
     * Get datastoreInfoEndsWith
     *
     * @return datastoreInfoEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDatastoreInfoEndsWith() {
        return datastoreInfoEndsWith;
    }

    public void setDatastoreInfoEndsWith(String datastoreInfoEndsWith) {
        this.datastoreInfoEndsWith = datastoreInfoEndsWith;
    }

    public StorageDeviceWhereInput datastoreInfoEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_ENDS_WITH);
        return this;
    }

    public StorageDeviceWhereInput datastoreInfoEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_ENDS_WITH);
        return this;
    }

    public void setDatastoreInfoEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_ENDS_WITH);
        }
    }

    public boolean getDatastoreInfoEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_INFO_ENDS_WITH);
    }

    public StorageDeviceWhereInput datastoreInfoGt(String datastoreInfoGt) {

        this.datastoreInfoGt = datastoreInfoGt;
        return this;
    }

    /**
     * Get datastoreInfoGt
     *
     * @return datastoreInfoGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDatastoreInfoGt() {
        return datastoreInfoGt;
    }

    public void setDatastoreInfoGt(String datastoreInfoGt) {
        this.datastoreInfoGt = datastoreInfoGt;
    }

    public StorageDeviceWhereInput datastoreInfoGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_GT);
        return this;
    }

    public StorageDeviceWhereInput datastoreInfoGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_GT);
        return this;
    }

    public void setDatastoreInfoGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_GT);
        }
    }

    public boolean getDatastoreInfoGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_INFO_GT);
    }

    public StorageDeviceWhereInput datastoreInfoGte(String datastoreInfoGte) {

        this.datastoreInfoGte = datastoreInfoGte;
        return this;
    }

    /**
     * Get datastoreInfoGte
     *
     * @return datastoreInfoGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDatastoreInfoGte() {
        return datastoreInfoGte;
    }

    public void setDatastoreInfoGte(String datastoreInfoGte) {
        this.datastoreInfoGte = datastoreInfoGte;
    }

    public StorageDeviceWhereInput datastoreInfoGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_GTE);
        return this;
    }

    public StorageDeviceWhereInput datastoreInfoGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_GTE);
        return this;
    }

    public void setDatastoreInfoGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_GTE);
        }
    }

    public boolean getDatastoreInfoGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_INFO_GTE);
    }

    public StorageDeviceWhereInput datastoreInfoIn(List<String> datastoreInfoIn) {

        this.datastoreInfoIn = datastoreInfoIn;
        return this;
    }

    public StorageDeviceWhereInput addDatastoreInfoInItem(String datastoreInfoInItem) {
        if (this.datastoreInfoIn == null) {
            this.datastoreInfoIn = new ArrayList<String>();
        }
        this.datastoreInfoIn.add(datastoreInfoInItem);
        return this;
    }

    /**
     * Get datastoreInfoIn
     *
     * @return datastoreInfoIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDatastoreInfoIn() {
        return datastoreInfoIn;
    }

    public void setDatastoreInfoIn(List<String> datastoreInfoIn) {
        this.datastoreInfoIn = datastoreInfoIn;
    }

    public StorageDeviceWhereInput datastoreInfoIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_IN);
        return this;
    }

    public StorageDeviceWhereInput datastoreInfoIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_IN);
        return this;
    }

    public void setDatastoreInfoIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_IN);
        }
    }

    public boolean getDatastoreInfoIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_INFO_IN);
    }

    public StorageDeviceWhereInput datastoreInfoLt(String datastoreInfoLt) {

        this.datastoreInfoLt = datastoreInfoLt;
        return this;
    }

    /**
     * Get datastoreInfoLt
     *
     * @return datastoreInfoLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDatastoreInfoLt() {
        return datastoreInfoLt;
    }

    public void setDatastoreInfoLt(String datastoreInfoLt) {
        this.datastoreInfoLt = datastoreInfoLt;
    }

    public StorageDeviceWhereInput datastoreInfoLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_LT);
        return this;
    }

    public StorageDeviceWhereInput datastoreInfoLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_LT);
        return this;
    }

    public void setDatastoreInfoLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_LT);
        }
    }

    public boolean getDatastoreInfoLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_INFO_LT);
    }

    public StorageDeviceWhereInput datastoreInfoLte(String datastoreInfoLte) {

        this.datastoreInfoLte = datastoreInfoLte;
        return this;
    }

    /**
     * Get datastoreInfoLte
     *
     * @return datastoreInfoLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDatastoreInfoLte() {
        return datastoreInfoLte;
    }

    public void setDatastoreInfoLte(String datastoreInfoLte) {
        this.datastoreInfoLte = datastoreInfoLte;
    }

    public StorageDeviceWhereInput datastoreInfoLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_LTE);
        return this;
    }

    public StorageDeviceWhereInput datastoreInfoLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_LTE);
        return this;
    }

    public void setDatastoreInfoLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_LTE);
        }
    }

    public boolean getDatastoreInfoLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_INFO_LTE);
    }

    public StorageDeviceWhereInput datastoreInfoNot(String datastoreInfoNot) {

        this.datastoreInfoNot = datastoreInfoNot;
        return this;
    }

    /**
     * Get datastoreInfoNot
     *
     * @return datastoreInfoNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDatastoreInfoNot() {
        return datastoreInfoNot;
    }

    public void setDatastoreInfoNot(String datastoreInfoNot) {
        this.datastoreInfoNot = datastoreInfoNot;
    }

    public StorageDeviceWhereInput datastoreInfoNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_NOT);
        return this;
    }

    public StorageDeviceWhereInput datastoreInfoNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_NOT);
        return this;
    }

    public void setDatastoreInfoNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_NOT);
        }
    }

    public boolean getDatastoreInfoNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_INFO_NOT);
    }

    public StorageDeviceWhereInput datastoreInfoNotContains(String datastoreInfoNotContains) {

        this.datastoreInfoNotContains = datastoreInfoNotContains;
        return this;
    }

    /**
     * Get datastoreInfoNotContains
     *
     * @return datastoreInfoNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDatastoreInfoNotContains() {
        return datastoreInfoNotContains;
    }

    public void setDatastoreInfoNotContains(String datastoreInfoNotContains) {
        this.datastoreInfoNotContains = datastoreInfoNotContains;
    }

    public StorageDeviceWhereInput datastoreInfoNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_NOT_CONTAINS);
        return this;
    }

    public StorageDeviceWhereInput datastoreInfoNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_NOT_CONTAINS);
        return this;
    }

    public void setDatastoreInfoNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_NOT_CONTAINS);
        }
    }

    public boolean getDatastoreInfoNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_INFO_NOT_CONTAINS);
    }

    public StorageDeviceWhereInput datastoreInfoNotEndsWith(String datastoreInfoNotEndsWith) {

        this.datastoreInfoNotEndsWith = datastoreInfoNotEndsWith;
        return this;
    }

    /**
     * Get datastoreInfoNotEndsWith
     *
     * @return datastoreInfoNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDatastoreInfoNotEndsWith() {
        return datastoreInfoNotEndsWith;
    }

    public void setDatastoreInfoNotEndsWith(String datastoreInfoNotEndsWith) {
        this.datastoreInfoNotEndsWith = datastoreInfoNotEndsWith;
    }

    public StorageDeviceWhereInput datastoreInfoNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_NOT_ENDS_WITH);
        return this;
    }

    public StorageDeviceWhereInput datastoreInfoNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_NOT_ENDS_WITH);
        return this;
    }

    public void setDatastoreInfoNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_NOT_ENDS_WITH);
        }
    }

    public boolean getDatastoreInfoNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_INFO_NOT_ENDS_WITH);
    }

    public StorageDeviceWhereInput datastoreInfoNotIn(List<String> datastoreInfoNotIn) {

        this.datastoreInfoNotIn = datastoreInfoNotIn;
        return this;
    }

    public StorageDeviceWhereInput addDatastoreInfoNotInItem(String datastoreInfoNotInItem) {
        if (this.datastoreInfoNotIn == null) {
            this.datastoreInfoNotIn = new ArrayList<String>();
        }
        this.datastoreInfoNotIn.add(datastoreInfoNotInItem);
        return this;
    }

    /**
     * Get datastoreInfoNotIn
     *
     * @return datastoreInfoNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDatastoreInfoNotIn() {
        return datastoreInfoNotIn;
    }

    public void setDatastoreInfoNotIn(List<String> datastoreInfoNotIn) {
        this.datastoreInfoNotIn = datastoreInfoNotIn;
    }

    public StorageDeviceWhereInput datastoreInfoNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_NOT_IN);
        return this;
    }

    public StorageDeviceWhereInput datastoreInfoNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_NOT_IN);
        return this;
    }

    public void setDatastoreInfoNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_NOT_IN);
        }
    }

    public boolean getDatastoreInfoNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_INFO_NOT_IN);
    }

    public StorageDeviceWhereInput datastoreInfoNotStartsWith(String datastoreInfoNotStartsWith) {

        this.datastoreInfoNotStartsWith = datastoreInfoNotStartsWith;
        return this;
    }

    /**
     * Get datastoreInfoNotStartsWith
     *
     * @return datastoreInfoNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDatastoreInfoNotStartsWith() {
        return datastoreInfoNotStartsWith;
    }

    public void setDatastoreInfoNotStartsWith(String datastoreInfoNotStartsWith) {
        this.datastoreInfoNotStartsWith = datastoreInfoNotStartsWith;
    }

    public StorageDeviceWhereInput datastoreInfoNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_NOT_STARTS_WITH);
        return this;
    }

    public StorageDeviceWhereInput datastoreInfoNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_NOT_STARTS_WITH);
        return this;
    }

    public void setDatastoreInfoNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_NOT_STARTS_WITH);
        }
    }

    public boolean getDatastoreInfoNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_INFO_NOT_STARTS_WITH);
    }

    public StorageDeviceWhereInput datastoreInfoStartsWith(String datastoreInfoStartsWith) {

        this.datastoreInfoStartsWith = datastoreInfoStartsWith;
        return this;
    }

    /**
     * Get datastoreInfoStartsWith
     *
     * @return datastoreInfoStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDatastoreInfoStartsWith() {
        return datastoreInfoStartsWith;
    }

    public void setDatastoreInfoStartsWith(String datastoreInfoStartsWith) {
        this.datastoreInfoStartsWith = datastoreInfoStartsWith;
    }

    public StorageDeviceWhereInput datastoreInfoStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_STARTS_WITH);
        return this;
    }

    public StorageDeviceWhereInput datastoreInfoStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_STARTS_WITH);
        return this;
    }

    public void setDatastoreInfoStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_INFO_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_INFO_STARTS_WITH);
        }
    }

    public boolean getDatastoreInfoStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_INFO_STARTS_WITH);
    }

    public StorageDeviceWhereInput datastoresEvery(DatastoreWhereInput datastoresEvery) {

        this.datastoresEvery = datastoresEvery;
        return this;
    }

    /**
     * Get datastoresEvery
     *
     * @return datastoresEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DatastoreWhereInput getDatastoresEvery() {
        return datastoresEvery;
    }

    public void setDatastoresEvery(DatastoreWhereInput datastoresEvery) {
        this.datastoresEvery = datastoresEvery;
    }

    public StorageDeviceWhereInput datastoresEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORES_EVERY);
        return this;
    }

    public StorageDeviceWhereInput datastoresEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORES_EVERY);
        return this;
    }

    public void setDatastoresEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORES_EVERY);
        }
    }

    public boolean getDatastoresEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORES_EVERY);
    }

    public StorageDeviceWhereInput datastoresNone(DatastoreWhereInput datastoresNone) {

        this.datastoresNone = datastoresNone;
        return this;
    }

    /**
     * Get datastoresNone
     *
     * @return datastoresNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DatastoreWhereInput getDatastoresNone() {
        return datastoresNone;
    }

    public void setDatastoresNone(DatastoreWhereInput datastoresNone) {
        this.datastoresNone = datastoresNone;
    }

    public StorageDeviceWhereInput datastoresNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORES_NONE);
        return this;
    }

    public StorageDeviceWhereInput datastoresNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORES_NONE);
        return this;
    }

    public void setDatastoresNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORES_NONE);
        }
    }

    public boolean getDatastoresNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORES_NONE);
    }

    public StorageDeviceWhereInput datastoresSome(DatastoreWhereInput datastoresSome) {

        this.datastoresSome = datastoresSome;
        return this;
    }

    /**
     * Get datastoresSome
     *
     * @return datastoresSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DatastoreWhereInput getDatastoresSome() {
        return datastoresSome;
    }

    public void setDatastoresSome(DatastoreWhereInput datastoresSome) {
        this.datastoresSome = datastoresSome;
    }

    public StorageDeviceWhereInput datastoresSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORES_SOME);
        return this;
    }

    public StorageDeviceWhereInput datastoresSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORES_SOME);
        return this;
    }

    public void setDatastoresSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORES_SOME);
        }
    }

    public boolean getDatastoresSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORES_SOME);
    }

    public StorageDeviceWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public StorageDeviceWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public StorageDeviceWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public StorageDeviceWhereInput addEntityAsyncStatusInItem(
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

    public StorageDeviceWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public StorageDeviceWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public StorageDeviceWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public StorageDeviceWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public StorageDeviceWhereInput addEntityAsyncStatusNotInItem(
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

    public StorageDeviceWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public StorageDeviceWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput hardwareAcceleration(Boolean hardwareAcceleration) {

        this.hardwareAcceleration = hardwareAcceleration;
        return this;
    }

    /**
     * Get hardwareAcceleration
     *
     * @return hardwareAcceleration
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getHardwareAcceleration() {
        return hardwareAcceleration;
    }

    public void setHardwareAcceleration(Boolean hardwareAcceleration) {
        this.hardwareAcceleration = hardwareAcceleration;
    }

    public StorageDeviceWhereInput hardwareAcceleration_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HARDWARE_ACCELERATION);
        return this;
    }

    public StorageDeviceWhereInput hardwareAcceleration_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HARDWARE_ACCELERATION);
        return this;
    }

    public void setHardwareAcceleration_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HARDWARE_ACCELERATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HARDWARE_ACCELERATION);
        }
    }

    public boolean getHardwareAcceleration_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HARDWARE_ACCELERATION);
    }

    public StorageDeviceWhereInput hardwareAccelerationNot(Boolean hardwareAccelerationNot) {

        this.hardwareAccelerationNot = hardwareAccelerationNot;
        return this;
    }

    /**
     * Get hardwareAccelerationNot
     *
     * @return hardwareAccelerationNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getHardwareAccelerationNot() {
        return hardwareAccelerationNot;
    }

    public void setHardwareAccelerationNot(Boolean hardwareAccelerationNot) {
        this.hardwareAccelerationNot = hardwareAccelerationNot;
    }

    public StorageDeviceWhereInput hardwareAccelerationNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HARDWARE_ACCELERATION_NOT);
        return this;
    }

    public StorageDeviceWhereInput hardwareAccelerationNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HARDWARE_ACCELERATION_NOT);
        return this;
    }

    public void setHardwareAccelerationNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HARDWARE_ACCELERATION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HARDWARE_ACCELERATION_NOT);
        }
    }

    public boolean getHardwareAccelerationNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HARDWARE_ACCELERATION_NOT);
    }

    public StorageDeviceWhereInput hostConnectionsEvery(
            StorageDeviceHostConnectionWhereInput hostConnectionsEvery) {

        this.hostConnectionsEvery = hostConnectionsEvery;
        return this;
    }

    /**
     * Get hostConnectionsEvery
     *
     * @return hostConnectionsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageDeviceHostConnectionWhereInput getHostConnectionsEvery() {
        return hostConnectionsEvery;
    }

    public void setHostConnectionsEvery(
            StorageDeviceHostConnectionWhereInput hostConnectionsEvery) {
        this.hostConnectionsEvery = hostConnectionsEvery;
    }

    public StorageDeviceWhereInput hostConnectionsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_CONNECTIONS_EVERY);
        return this;
    }

    public StorageDeviceWhereInput hostConnectionsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_CONNECTIONS_EVERY);
        return this;
    }

    public void setHostConnectionsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_CONNECTIONS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_CONNECTIONS_EVERY);
        }
    }

    public boolean getHostConnectionsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_CONNECTIONS_EVERY);
    }

    public StorageDeviceWhereInput hostConnectionsNone(
            StorageDeviceHostConnectionWhereInput hostConnectionsNone) {

        this.hostConnectionsNone = hostConnectionsNone;
        return this;
    }

    /**
     * Get hostConnectionsNone
     *
     * @return hostConnectionsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageDeviceHostConnectionWhereInput getHostConnectionsNone() {
        return hostConnectionsNone;
    }

    public void setHostConnectionsNone(StorageDeviceHostConnectionWhereInput hostConnectionsNone) {
        this.hostConnectionsNone = hostConnectionsNone;
    }

    public StorageDeviceWhereInput hostConnectionsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_CONNECTIONS_NONE);
        return this;
    }

    public StorageDeviceWhereInput hostConnectionsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_CONNECTIONS_NONE);
        return this;
    }

    public void setHostConnectionsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_CONNECTIONS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_CONNECTIONS_NONE);
        }
    }

    public boolean getHostConnectionsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_CONNECTIONS_NONE);
    }

    public StorageDeviceWhereInput hostConnectionsSome(
            StorageDeviceHostConnectionWhereInput hostConnectionsSome) {

        this.hostConnectionsSome = hostConnectionsSome;
        return this;
    }

    /**
     * Get hostConnectionsSome
     *
     * @return hostConnectionsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageDeviceHostConnectionWhereInput getHostConnectionsSome() {
        return hostConnectionsSome;
    }

    public void setHostConnectionsSome(StorageDeviceHostConnectionWhereInput hostConnectionsSome) {
        this.hostConnectionsSome = hostConnectionsSome;
    }

    public StorageDeviceWhereInput hostConnectionsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_CONNECTIONS_SOME);
        return this;
    }

    public StorageDeviceWhereInput hostConnectionsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_CONNECTIONS_SOME);
        return this;
    }

    public void setHostConnectionsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_CONNECTIONS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_CONNECTIONS_SOME);
        }
    }

    public boolean getHostConnectionsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_CONNECTIONS_SOME);
    }

    public StorageDeviceWhereInput hostsEvery(HostWhereInput hostsEvery) {

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

    public StorageDeviceWhereInput hostsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS_EVERY);
        return this;
    }

    public StorageDeviceWhereInput hostsEvery_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput hostsNone(HostWhereInput hostsNone) {

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

    public StorageDeviceWhereInput hostsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS_NONE);
        return this;
    }

    public StorageDeviceWhereInput hostsNone_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput hostsSome(HostWhereInput hostsSome) {

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

    public StorageDeviceWhereInput hostsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS_SOME);
        return this;
    }

    public StorageDeviceWhereInput hostsSome_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput id(String id) {

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

    public StorageDeviceWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public StorageDeviceWhereInput id_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput idContains(String idContains) {

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

    public StorageDeviceWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public StorageDeviceWhereInput idContains_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput idEndsWith(String idEndsWith) {

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

    public StorageDeviceWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public StorageDeviceWhereInput idEndsWith_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput idGt(String idGt) {

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

    public StorageDeviceWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public StorageDeviceWhereInput idGt_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput idGte(String idGte) {

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

    public StorageDeviceWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public StorageDeviceWhereInput idGte_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public StorageDeviceWhereInput addIdInItem(String idInItem) {
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

    public StorageDeviceWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public StorageDeviceWhereInput idIn_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput idLt(String idLt) {

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

    public StorageDeviceWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public StorageDeviceWhereInput idLt_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput idLte(String idLte) {

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

    public StorageDeviceWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public StorageDeviceWhereInput idLte_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput idNot(String idNot) {

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

    public StorageDeviceWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public StorageDeviceWhereInput idNot_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput idNotContains(String idNotContains) {

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

    public StorageDeviceWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public StorageDeviceWhereInput idNotContains_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public StorageDeviceWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public StorageDeviceWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public StorageDeviceWhereInput addIdNotInItem(String idNotInItem) {
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

    public StorageDeviceWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public StorageDeviceWhereInput idNotIn_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public StorageDeviceWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public StorageDeviceWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput idStartsWith(String idStartsWith) {

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

    public StorageDeviceWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public StorageDeviceWhereInput idStartsWith_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localHash(String localHash) {

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

    public StorageDeviceWhereInput localHash_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH);
        return this;
    }

    public StorageDeviceWhereInput localHash_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localHashContains(String localHashContains) {

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

    public StorageDeviceWhereInput localHashContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_CONTAINS);
        return this;
    }

    public StorageDeviceWhereInput localHashContains_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localHashEndsWith(String localHashEndsWith) {

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

    public StorageDeviceWhereInput localHashEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH);
        return this;
    }

    public StorageDeviceWhereInput localHashEndsWith_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localHashGt(String localHashGt) {

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

    public StorageDeviceWhereInput localHashGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_GT);
        return this;
    }

    public StorageDeviceWhereInput localHashGt_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localHashGte(String localHashGte) {

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

    public StorageDeviceWhereInput localHashGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_GTE);
        return this;
    }

    public StorageDeviceWhereInput localHashGte_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localHashIn(List<String> localHashIn) {

        this.localHashIn = localHashIn;
        return this;
    }

    public StorageDeviceWhereInput addLocalHashInItem(String localHashInItem) {
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

    public StorageDeviceWhereInput localHashIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_IN);
        return this;
    }

    public StorageDeviceWhereInput localHashIn_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localHashLt(String localHashLt) {

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

    public StorageDeviceWhereInput localHashLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_LT);
        return this;
    }

    public StorageDeviceWhereInput localHashLt_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localHashLte(String localHashLte) {

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

    public StorageDeviceWhereInput localHashLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_LTE);
        return this;
    }

    public StorageDeviceWhereInput localHashLte_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localHashNot(String localHashNot) {

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

    public StorageDeviceWhereInput localHashNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT);
        return this;
    }

    public StorageDeviceWhereInput localHashNot_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localHashNotContains(String localHashNotContains) {

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

    public StorageDeviceWhereInput localHashNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS);
        return this;
    }

    public StorageDeviceWhereInput localHashNotContains_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localHashNotEndsWith(String localHashNotEndsWith) {

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

    public StorageDeviceWhereInput localHashNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH);
        return this;
    }

    public StorageDeviceWhereInput localHashNotEndsWith_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localHashNotIn(List<String> localHashNotIn) {

        this.localHashNotIn = localHashNotIn;
        return this;
    }

    public StorageDeviceWhereInput addLocalHashNotInItem(String localHashNotInItem) {
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

    public StorageDeviceWhereInput localHashNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_IN);
        return this;
    }

    public StorageDeviceWhereInput localHashNotIn_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localHashNotStartsWith(String localHashNotStartsWith) {

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

    public StorageDeviceWhereInput localHashNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH);
        return this;
    }

    public StorageDeviceWhereInput localHashNotStartsWith_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localHashStartsWith(String localHashStartsWith) {

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

    public StorageDeviceWhereInput localHashStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH);
        return this;
    }

    public StorageDeviceWhereInput localHashStartsWith_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localId(String localId) {

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

    public StorageDeviceWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public StorageDeviceWhereInput localId_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localIdContains(String localIdContains) {

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

    public StorageDeviceWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public StorageDeviceWhereInput localIdContains_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public StorageDeviceWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public StorageDeviceWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localIdGt(String localIdGt) {

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

    public StorageDeviceWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public StorageDeviceWhereInput localIdGt_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localIdGte(String localIdGte) {

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

    public StorageDeviceWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public StorageDeviceWhereInput localIdGte_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public StorageDeviceWhereInput addLocalIdInItem(String localIdInItem) {
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

    public StorageDeviceWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public StorageDeviceWhereInput localIdIn_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localIdLt(String localIdLt) {

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

    public StorageDeviceWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public StorageDeviceWhereInput localIdLt_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localIdLte(String localIdLte) {

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

    public StorageDeviceWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public StorageDeviceWhereInput localIdLte_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localIdNot(String localIdNot) {

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

    public StorageDeviceWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public StorageDeviceWhereInput localIdNot_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localIdNotContains(String localIdNotContains) {

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

    public StorageDeviceWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public StorageDeviceWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public StorageDeviceWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public StorageDeviceWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public StorageDeviceWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public StorageDeviceWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public StorageDeviceWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public StorageDeviceWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public StorageDeviceWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public StorageDeviceWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public StorageDeviceWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput lunId(String lunId) {

        this.lunId = lunId;
        return this;
    }

    /**
     * Get lunId
     *
     * @return lunId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLunId() {
        return lunId;
    }

    public void setLunId(String lunId) {
        this.lunId = lunId;
    }

    public StorageDeviceWhereInput lunId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUN_ID);
        return this;
    }

    public StorageDeviceWhereInput lunId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUN_ID);
        return this;
    }

    public void setLunId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUN_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUN_ID);
        }
    }

    public boolean getLunId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUN_ID);
    }

    public StorageDeviceWhereInput lunIdContains(String lunIdContains) {

        this.lunIdContains = lunIdContains;
        return this;
    }

    /**
     * Get lunIdContains
     *
     * @return lunIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLunIdContains() {
        return lunIdContains;
    }

    public void setLunIdContains(String lunIdContains) {
        this.lunIdContains = lunIdContains;
    }

    public StorageDeviceWhereInput lunIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUN_ID_CONTAINS);
        return this;
    }

    public StorageDeviceWhereInput lunIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_CONTAINS);
        return this;
    }

    public void setLunIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUN_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_CONTAINS);
        }
    }

    public boolean getLunIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUN_ID_CONTAINS);
    }

    public StorageDeviceWhereInput lunIdEndsWith(String lunIdEndsWith) {

        this.lunIdEndsWith = lunIdEndsWith;
        return this;
    }

    /**
     * Get lunIdEndsWith
     *
     * @return lunIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLunIdEndsWith() {
        return lunIdEndsWith;
    }

    public void setLunIdEndsWith(String lunIdEndsWith) {
        this.lunIdEndsWith = lunIdEndsWith;
    }

    public StorageDeviceWhereInput lunIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUN_ID_ENDS_WITH);
        return this;
    }

    public StorageDeviceWhereInput lunIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_ENDS_WITH);
        return this;
    }

    public void setLunIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUN_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_ENDS_WITH);
        }
    }

    public boolean getLunIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUN_ID_ENDS_WITH);
    }

    public StorageDeviceWhereInput lunIdGt(String lunIdGt) {

        this.lunIdGt = lunIdGt;
        return this;
    }

    /**
     * Get lunIdGt
     *
     * @return lunIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLunIdGt() {
        return lunIdGt;
    }

    public void setLunIdGt(String lunIdGt) {
        this.lunIdGt = lunIdGt;
    }

    public StorageDeviceWhereInput lunIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUN_ID_GT);
        return this;
    }

    public StorageDeviceWhereInput lunIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_GT);
        return this;
    }

    public void setLunIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUN_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_GT);
        }
    }

    public boolean getLunIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUN_ID_GT);
    }

    public StorageDeviceWhereInput lunIdGte(String lunIdGte) {

        this.lunIdGte = lunIdGte;
        return this;
    }

    /**
     * Get lunIdGte
     *
     * @return lunIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLunIdGte() {
        return lunIdGte;
    }

    public void setLunIdGte(String lunIdGte) {
        this.lunIdGte = lunIdGte;
    }

    public StorageDeviceWhereInput lunIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUN_ID_GTE);
        return this;
    }

    public StorageDeviceWhereInput lunIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_GTE);
        return this;
    }

    public void setLunIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUN_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_GTE);
        }
    }

    public boolean getLunIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUN_ID_GTE);
    }

    public StorageDeviceWhereInput lunIdIn(List<String> lunIdIn) {

        this.lunIdIn = lunIdIn;
        return this;
    }

    public StorageDeviceWhereInput addLunIdInItem(String lunIdInItem) {
        if (this.lunIdIn == null) {
            this.lunIdIn = new ArrayList<String>();
        }
        this.lunIdIn.add(lunIdInItem);
        return this;
    }

    /**
     * Get lunIdIn
     *
     * @return lunIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLunIdIn() {
        return lunIdIn;
    }

    public void setLunIdIn(List<String> lunIdIn) {
        this.lunIdIn = lunIdIn;
    }

    public StorageDeviceWhereInput lunIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUN_ID_IN);
        return this;
    }

    public StorageDeviceWhereInput lunIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_IN);
        return this;
    }

    public void setLunIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUN_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_IN);
        }
    }

    public boolean getLunIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUN_ID_IN);
    }

    public StorageDeviceWhereInput lunIdLt(String lunIdLt) {

        this.lunIdLt = lunIdLt;
        return this;
    }

    /**
     * Get lunIdLt
     *
     * @return lunIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLunIdLt() {
        return lunIdLt;
    }

    public void setLunIdLt(String lunIdLt) {
        this.lunIdLt = lunIdLt;
    }

    public StorageDeviceWhereInput lunIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUN_ID_LT);
        return this;
    }

    public StorageDeviceWhereInput lunIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_LT);
        return this;
    }

    public void setLunIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUN_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_LT);
        }
    }

    public boolean getLunIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUN_ID_LT);
    }

    public StorageDeviceWhereInput lunIdLte(String lunIdLte) {

        this.lunIdLte = lunIdLte;
        return this;
    }

    /**
     * Get lunIdLte
     *
     * @return lunIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLunIdLte() {
        return lunIdLte;
    }

    public void setLunIdLte(String lunIdLte) {
        this.lunIdLte = lunIdLte;
    }

    public StorageDeviceWhereInput lunIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUN_ID_LTE);
        return this;
    }

    public StorageDeviceWhereInput lunIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_LTE);
        return this;
    }

    public void setLunIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUN_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_LTE);
        }
    }

    public boolean getLunIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUN_ID_LTE);
    }

    public StorageDeviceWhereInput lunIdNot(String lunIdNot) {

        this.lunIdNot = lunIdNot;
        return this;
    }

    /**
     * Get lunIdNot
     *
     * @return lunIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLunIdNot() {
        return lunIdNot;
    }

    public void setLunIdNot(String lunIdNot) {
        this.lunIdNot = lunIdNot;
    }

    public StorageDeviceWhereInput lunIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUN_ID_NOT);
        return this;
    }

    public StorageDeviceWhereInput lunIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_NOT);
        return this;
    }

    public void setLunIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUN_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_NOT);
        }
    }

    public boolean getLunIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUN_ID_NOT);
    }

    public StorageDeviceWhereInput lunIdNotContains(String lunIdNotContains) {

        this.lunIdNotContains = lunIdNotContains;
        return this;
    }

    /**
     * Get lunIdNotContains
     *
     * @return lunIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLunIdNotContains() {
        return lunIdNotContains;
    }

    public void setLunIdNotContains(String lunIdNotContains) {
        this.lunIdNotContains = lunIdNotContains;
    }

    public StorageDeviceWhereInput lunIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUN_ID_NOT_CONTAINS);
        return this;
    }

    public StorageDeviceWhereInput lunIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_NOT_CONTAINS);
        return this;
    }

    public void setLunIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUN_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_NOT_CONTAINS);
        }
    }

    public boolean getLunIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUN_ID_NOT_CONTAINS);
    }

    public StorageDeviceWhereInput lunIdNotEndsWith(String lunIdNotEndsWith) {

        this.lunIdNotEndsWith = lunIdNotEndsWith;
        return this;
    }

    /**
     * Get lunIdNotEndsWith
     *
     * @return lunIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLunIdNotEndsWith() {
        return lunIdNotEndsWith;
    }

    public void setLunIdNotEndsWith(String lunIdNotEndsWith) {
        this.lunIdNotEndsWith = lunIdNotEndsWith;
    }

    public StorageDeviceWhereInput lunIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUN_ID_NOT_ENDS_WITH);
        return this;
    }

    public StorageDeviceWhereInput lunIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setLunIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUN_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getLunIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUN_ID_NOT_ENDS_WITH);
    }

    public StorageDeviceWhereInput lunIdNotIn(List<String> lunIdNotIn) {

        this.lunIdNotIn = lunIdNotIn;
        return this;
    }

    public StorageDeviceWhereInput addLunIdNotInItem(String lunIdNotInItem) {
        if (this.lunIdNotIn == null) {
            this.lunIdNotIn = new ArrayList<String>();
        }
        this.lunIdNotIn.add(lunIdNotInItem);
        return this;
    }

    /**
     * Get lunIdNotIn
     *
     * @return lunIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLunIdNotIn() {
        return lunIdNotIn;
    }

    public void setLunIdNotIn(List<String> lunIdNotIn) {
        this.lunIdNotIn = lunIdNotIn;
    }

    public StorageDeviceWhereInput lunIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUN_ID_NOT_IN);
        return this;
    }

    public StorageDeviceWhereInput lunIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_NOT_IN);
        return this;
    }

    public void setLunIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUN_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_NOT_IN);
        }
    }

    public boolean getLunIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUN_ID_NOT_IN);
    }

    public StorageDeviceWhereInput lunIdNotStartsWith(String lunIdNotStartsWith) {

        this.lunIdNotStartsWith = lunIdNotStartsWith;
        return this;
    }

    /**
     * Get lunIdNotStartsWith
     *
     * @return lunIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLunIdNotStartsWith() {
        return lunIdNotStartsWith;
    }

    public void setLunIdNotStartsWith(String lunIdNotStartsWith) {
        this.lunIdNotStartsWith = lunIdNotStartsWith;
    }

    public StorageDeviceWhereInput lunIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUN_ID_NOT_STARTS_WITH);
        return this;
    }

    public StorageDeviceWhereInput lunIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setLunIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUN_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getLunIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUN_ID_NOT_STARTS_WITH);
    }

    public StorageDeviceWhereInput lunIdStartsWith(String lunIdStartsWith) {

        this.lunIdStartsWith = lunIdStartsWith;
        return this;
    }

    /**
     * Get lunIdStartsWith
     *
     * @return lunIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLunIdStartsWith() {
        return lunIdStartsWith;
    }

    public void setLunIdStartsWith(String lunIdStartsWith) {
        this.lunIdStartsWith = lunIdStartsWith;
    }

    public StorageDeviceWhereInput lunIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUN_ID_STARTS_WITH);
        return this;
    }

    public StorageDeviceWhereInput lunIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_STARTS_WITH);
        return this;
    }

    public void setLunIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUN_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUN_ID_STARTS_WITH);
        }
    }

    public boolean getLunIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUN_ID_STARTS_WITH);
    }

    public StorageDeviceWhereInput name(String name) {

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

    public StorageDeviceWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public StorageDeviceWhereInput name_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput nameContains(String nameContains) {

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

    public StorageDeviceWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public StorageDeviceWhereInput nameContains_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput nameEndsWith(String nameEndsWith) {

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

    public StorageDeviceWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public StorageDeviceWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput nameGt(String nameGt) {

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

    public StorageDeviceWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public StorageDeviceWhereInput nameGt_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput nameGte(String nameGte) {

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

    public StorageDeviceWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public StorageDeviceWhereInput nameGte_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public StorageDeviceWhereInput addNameInItem(String nameInItem) {
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

    public StorageDeviceWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public StorageDeviceWhereInput nameIn_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput nameLt(String nameLt) {

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

    public StorageDeviceWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public StorageDeviceWhereInput nameLt_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput nameLte(String nameLte) {

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

    public StorageDeviceWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public StorageDeviceWhereInput nameLte_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput nameNot(String nameNot) {

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

    public StorageDeviceWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public StorageDeviceWhereInput nameNot_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput nameNotContains(String nameNotContains) {

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

    public StorageDeviceWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public StorageDeviceWhereInput nameNotContains_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public StorageDeviceWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public StorageDeviceWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public StorageDeviceWhereInput addNameNotInItem(String nameNotInItem) {
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

    public StorageDeviceWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public StorageDeviceWhereInput nameNotIn_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public StorageDeviceWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public StorageDeviceWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput nameStartsWith(String nameStartsWith) {

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

    public StorageDeviceWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public StorageDeviceWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput path(String path) {

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

    public StorageDeviceWhereInput path_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH);
        return this;
    }

    public StorageDeviceWhereInput path_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput pathContains(String pathContains) {

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

    public StorageDeviceWhereInput pathContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_CONTAINS);
        return this;
    }

    public StorageDeviceWhereInput pathContains_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput pathEndsWith(String pathEndsWith) {

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

    public StorageDeviceWhereInput pathEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_ENDS_WITH);
        return this;
    }

    public StorageDeviceWhereInput pathEndsWith_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput pathGt(String pathGt) {

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

    public StorageDeviceWhereInput pathGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_GT);
        return this;
    }

    public StorageDeviceWhereInput pathGt_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput pathGte(String pathGte) {

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

    public StorageDeviceWhereInput pathGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_GTE);
        return this;
    }

    public StorageDeviceWhereInput pathGte_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput pathIn(List<String> pathIn) {

        this.pathIn = pathIn;
        return this;
    }

    public StorageDeviceWhereInput addPathInItem(String pathInItem) {
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

    public StorageDeviceWhereInput pathIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_IN);
        return this;
    }

    public StorageDeviceWhereInput pathIn_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput pathLt(String pathLt) {

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

    public StorageDeviceWhereInput pathLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_LT);
        return this;
    }

    public StorageDeviceWhereInput pathLt_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput pathLte(String pathLte) {

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

    public StorageDeviceWhereInput pathLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_LTE);
        return this;
    }

    public StorageDeviceWhereInput pathLte_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput pathNot(String pathNot) {

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

    public StorageDeviceWhereInput pathNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT);
        return this;
    }

    public StorageDeviceWhereInput pathNot_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput pathNotContains(String pathNotContains) {

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

    public StorageDeviceWhereInput pathNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_CONTAINS);
        return this;
    }

    public StorageDeviceWhereInput pathNotContains_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput pathNotEndsWith(String pathNotEndsWith) {

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

    public StorageDeviceWhereInput pathNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_ENDS_WITH);
        return this;
    }

    public StorageDeviceWhereInput pathNotEndsWith_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput pathNotIn(List<String> pathNotIn) {

        this.pathNotIn = pathNotIn;
        return this;
    }

    public StorageDeviceWhereInput addPathNotInItem(String pathNotInItem) {
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

    public StorageDeviceWhereInput pathNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_IN);
        return this;
    }

    public StorageDeviceWhereInput pathNotIn_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput pathNotStartsWith(String pathNotStartsWith) {

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

    public StorageDeviceWhereInput pathNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_STARTS_WITH);
        return this;
    }

    public StorageDeviceWhereInput pathNotStartsWith_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput pathStartsWith(String pathStartsWith) {

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

    public StorageDeviceWhereInput pathStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_STARTS_WITH);
        return this;
    }

    public StorageDeviceWhereInput pathStartsWith_ExplictlyNonNull() {
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

    public StorageDeviceWhereInput sectorFormat(String sectorFormat) {

        this.sectorFormat = sectorFormat;
        return this;
    }

    /**
     * Get sectorFormat
     *
     * @return sectorFormat
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSectorFormat() {
        return sectorFormat;
    }

    public void setSectorFormat(String sectorFormat) {
        this.sectorFormat = sectorFormat;
    }

    public StorageDeviceWhereInput sectorFormat_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT);
        return this;
    }

    public StorageDeviceWhereInput sectorFormat_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT);
        return this;
    }

    public void setSectorFormat_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT);
        }
    }

    public boolean getSectorFormat_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECTOR_FORMAT);
    }

    public StorageDeviceWhereInput sectorFormatContains(String sectorFormatContains) {

        this.sectorFormatContains = sectorFormatContains;
        return this;
    }

    /**
     * Get sectorFormatContains
     *
     * @return sectorFormatContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSectorFormatContains() {
        return sectorFormatContains;
    }

    public void setSectorFormatContains(String sectorFormatContains) {
        this.sectorFormatContains = sectorFormatContains;
    }

    public StorageDeviceWhereInput sectorFormatContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_CONTAINS);
        return this;
    }

    public StorageDeviceWhereInput sectorFormatContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_CONTAINS);
        return this;
    }

    public void setSectorFormatContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_CONTAINS);
        }
    }

    public boolean getSectorFormatContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECTOR_FORMAT_CONTAINS);
    }

    public StorageDeviceWhereInput sectorFormatEndsWith(String sectorFormatEndsWith) {

        this.sectorFormatEndsWith = sectorFormatEndsWith;
        return this;
    }

    /**
     * Get sectorFormatEndsWith
     *
     * @return sectorFormatEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSectorFormatEndsWith() {
        return sectorFormatEndsWith;
    }

    public void setSectorFormatEndsWith(String sectorFormatEndsWith) {
        this.sectorFormatEndsWith = sectorFormatEndsWith;
    }

    public StorageDeviceWhereInput sectorFormatEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_ENDS_WITH);
        return this;
    }

    public StorageDeviceWhereInput sectorFormatEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_ENDS_WITH);
        return this;
    }

    public void setSectorFormatEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_ENDS_WITH);
        }
    }

    public boolean getSectorFormatEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECTOR_FORMAT_ENDS_WITH);
    }

    public StorageDeviceWhereInput sectorFormatGt(String sectorFormatGt) {

        this.sectorFormatGt = sectorFormatGt;
        return this;
    }

    /**
     * Get sectorFormatGt
     *
     * @return sectorFormatGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSectorFormatGt() {
        return sectorFormatGt;
    }

    public void setSectorFormatGt(String sectorFormatGt) {
        this.sectorFormatGt = sectorFormatGt;
    }

    public StorageDeviceWhereInput sectorFormatGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_GT);
        return this;
    }

    public StorageDeviceWhereInput sectorFormatGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_GT);
        return this;
    }

    public void setSectorFormatGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_GT);
        }
    }

    public boolean getSectorFormatGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECTOR_FORMAT_GT);
    }

    public StorageDeviceWhereInput sectorFormatGte(String sectorFormatGte) {

        this.sectorFormatGte = sectorFormatGte;
        return this;
    }

    /**
     * Get sectorFormatGte
     *
     * @return sectorFormatGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSectorFormatGte() {
        return sectorFormatGte;
    }

    public void setSectorFormatGte(String sectorFormatGte) {
        this.sectorFormatGte = sectorFormatGte;
    }

    public StorageDeviceWhereInput sectorFormatGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_GTE);
        return this;
    }

    public StorageDeviceWhereInput sectorFormatGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_GTE);
        return this;
    }

    public void setSectorFormatGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_GTE);
        }
    }

    public boolean getSectorFormatGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECTOR_FORMAT_GTE);
    }

    public StorageDeviceWhereInput sectorFormatIn(List<String> sectorFormatIn) {

        this.sectorFormatIn = sectorFormatIn;
        return this;
    }

    public StorageDeviceWhereInput addSectorFormatInItem(String sectorFormatInItem) {
        if (this.sectorFormatIn == null) {
            this.sectorFormatIn = new ArrayList<String>();
        }
        this.sectorFormatIn.add(sectorFormatInItem);
        return this;
    }

    /**
     * Get sectorFormatIn
     *
     * @return sectorFormatIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSectorFormatIn() {
        return sectorFormatIn;
    }

    public void setSectorFormatIn(List<String> sectorFormatIn) {
        this.sectorFormatIn = sectorFormatIn;
    }

    public StorageDeviceWhereInput sectorFormatIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_IN);
        return this;
    }

    public StorageDeviceWhereInput sectorFormatIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_IN);
        return this;
    }

    public void setSectorFormatIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_IN);
        }
    }

    public boolean getSectorFormatIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECTOR_FORMAT_IN);
    }

    public StorageDeviceWhereInput sectorFormatLt(String sectorFormatLt) {

        this.sectorFormatLt = sectorFormatLt;
        return this;
    }

    /**
     * Get sectorFormatLt
     *
     * @return sectorFormatLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSectorFormatLt() {
        return sectorFormatLt;
    }

    public void setSectorFormatLt(String sectorFormatLt) {
        this.sectorFormatLt = sectorFormatLt;
    }

    public StorageDeviceWhereInput sectorFormatLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_LT);
        return this;
    }

    public StorageDeviceWhereInput sectorFormatLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_LT);
        return this;
    }

    public void setSectorFormatLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_LT);
        }
    }

    public boolean getSectorFormatLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECTOR_FORMAT_LT);
    }

    public StorageDeviceWhereInput sectorFormatLte(String sectorFormatLte) {

        this.sectorFormatLte = sectorFormatLte;
        return this;
    }

    /**
     * Get sectorFormatLte
     *
     * @return sectorFormatLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSectorFormatLte() {
        return sectorFormatLte;
    }

    public void setSectorFormatLte(String sectorFormatLte) {
        this.sectorFormatLte = sectorFormatLte;
    }

    public StorageDeviceWhereInput sectorFormatLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_LTE);
        return this;
    }

    public StorageDeviceWhereInput sectorFormatLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_LTE);
        return this;
    }

    public void setSectorFormatLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_LTE);
        }
    }

    public boolean getSectorFormatLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECTOR_FORMAT_LTE);
    }

    public StorageDeviceWhereInput sectorFormatNot(String sectorFormatNot) {

        this.sectorFormatNot = sectorFormatNot;
        return this;
    }

    /**
     * Get sectorFormatNot
     *
     * @return sectorFormatNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSectorFormatNot() {
        return sectorFormatNot;
    }

    public void setSectorFormatNot(String sectorFormatNot) {
        this.sectorFormatNot = sectorFormatNot;
    }

    public StorageDeviceWhereInput sectorFormatNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_NOT);
        return this;
    }

    public StorageDeviceWhereInput sectorFormatNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_NOT);
        return this;
    }

    public void setSectorFormatNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_NOT);
        }
    }

    public boolean getSectorFormatNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECTOR_FORMAT_NOT);
    }

    public StorageDeviceWhereInput sectorFormatNotContains(String sectorFormatNotContains) {

        this.sectorFormatNotContains = sectorFormatNotContains;
        return this;
    }

    /**
     * Get sectorFormatNotContains
     *
     * @return sectorFormatNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSectorFormatNotContains() {
        return sectorFormatNotContains;
    }

    public void setSectorFormatNotContains(String sectorFormatNotContains) {
        this.sectorFormatNotContains = sectorFormatNotContains;
    }

    public StorageDeviceWhereInput sectorFormatNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_NOT_CONTAINS);
        return this;
    }

    public StorageDeviceWhereInput sectorFormatNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_NOT_CONTAINS);
        return this;
    }

    public void setSectorFormatNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_NOT_CONTAINS);
        }
    }

    public boolean getSectorFormatNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECTOR_FORMAT_NOT_CONTAINS);
    }

    public StorageDeviceWhereInput sectorFormatNotEndsWith(String sectorFormatNotEndsWith) {

        this.sectorFormatNotEndsWith = sectorFormatNotEndsWith;
        return this;
    }

    /**
     * Get sectorFormatNotEndsWith
     *
     * @return sectorFormatNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSectorFormatNotEndsWith() {
        return sectorFormatNotEndsWith;
    }

    public void setSectorFormatNotEndsWith(String sectorFormatNotEndsWith) {
        this.sectorFormatNotEndsWith = sectorFormatNotEndsWith;
    }

    public StorageDeviceWhereInput sectorFormatNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_NOT_ENDS_WITH);
        return this;
    }

    public StorageDeviceWhereInput sectorFormatNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_NOT_ENDS_WITH);
        return this;
    }

    public void setSectorFormatNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_NOT_ENDS_WITH);
        }
    }

    public boolean getSectorFormatNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECTOR_FORMAT_NOT_ENDS_WITH);
    }

    public StorageDeviceWhereInput sectorFormatNotIn(List<String> sectorFormatNotIn) {

        this.sectorFormatNotIn = sectorFormatNotIn;
        return this;
    }

    public StorageDeviceWhereInput addSectorFormatNotInItem(String sectorFormatNotInItem) {
        if (this.sectorFormatNotIn == null) {
            this.sectorFormatNotIn = new ArrayList<String>();
        }
        this.sectorFormatNotIn.add(sectorFormatNotInItem);
        return this;
    }

    /**
     * Get sectorFormatNotIn
     *
     * @return sectorFormatNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSectorFormatNotIn() {
        return sectorFormatNotIn;
    }

    public void setSectorFormatNotIn(List<String> sectorFormatNotIn) {
        this.sectorFormatNotIn = sectorFormatNotIn;
    }

    public StorageDeviceWhereInput sectorFormatNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_NOT_IN);
        return this;
    }

    public StorageDeviceWhereInput sectorFormatNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_NOT_IN);
        return this;
    }

    public void setSectorFormatNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_NOT_IN);
        }
    }

    public boolean getSectorFormatNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECTOR_FORMAT_NOT_IN);
    }

    public StorageDeviceWhereInput sectorFormatNotStartsWith(String sectorFormatNotStartsWith) {

        this.sectorFormatNotStartsWith = sectorFormatNotStartsWith;
        return this;
    }

    /**
     * Get sectorFormatNotStartsWith
     *
     * @return sectorFormatNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSectorFormatNotStartsWith() {
        return sectorFormatNotStartsWith;
    }

    public void setSectorFormatNotStartsWith(String sectorFormatNotStartsWith) {
        this.sectorFormatNotStartsWith = sectorFormatNotStartsWith;
    }

    public StorageDeviceWhereInput sectorFormatNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_NOT_STARTS_WITH);
        return this;
    }

    public StorageDeviceWhereInput sectorFormatNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_NOT_STARTS_WITH);
        return this;
    }

    public void setSectorFormatNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_NOT_STARTS_WITH);
        }
    }

    public boolean getSectorFormatNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECTOR_FORMAT_NOT_STARTS_WITH);
    }

    public StorageDeviceWhereInput sectorFormatStartsWith(String sectorFormatStartsWith) {

        this.sectorFormatStartsWith = sectorFormatStartsWith;
        return this;
    }

    /**
     * Get sectorFormatStartsWith
     *
     * @return sectorFormatStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSectorFormatStartsWith() {
        return sectorFormatStartsWith;
    }

    public void setSectorFormatStartsWith(String sectorFormatStartsWith) {
        this.sectorFormatStartsWith = sectorFormatStartsWith;
    }

    public StorageDeviceWhereInput sectorFormatStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_STARTS_WITH);
        return this;
    }

    public StorageDeviceWhereInput sectorFormatStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_STARTS_WITH);
        return this;
    }

    public void setSectorFormatStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECTOR_FORMAT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECTOR_FORMAT_STARTS_WITH);
        }
    }

    public boolean getSectorFormatStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECTOR_FORMAT_STARTS_WITH);
    }

    public StorageDeviceWhereInput size(Double size) {

        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public StorageDeviceWhereInput size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public StorageDeviceWhereInput size_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        return this;
    }

    public void setSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        }
    }

    public boolean getSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE);
    }

    public StorageDeviceWhereInput sizeGt(Double sizeGt) {

        this.sizeGt = sizeGt;
        return this;
    }

    /**
     * Get sizeGt
     *
     * @return sizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getSizeGt() {
        return sizeGt;
    }

    public void setSizeGt(Double sizeGt) {
        this.sizeGt = sizeGt;
    }

    public StorageDeviceWhereInput sizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_GT);
        return this;
    }

    public StorageDeviceWhereInput sizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_GT);
        return this;
    }

    public void setSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_GT);
        }
    }

    public boolean getSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_GT);
    }

    public StorageDeviceWhereInput sizeGte(Double sizeGte) {

        this.sizeGte = sizeGte;
        return this;
    }

    /**
     * Get sizeGte
     *
     * @return sizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getSizeGte() {
        return sizeGte;
    }

    public void setSizeGte(Double sizeGte) {
        this.sizeGte = sizeGte;
    }

    public StorageDeviceWhereInput sizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_GTE);
        return this;
    }

    public StorageDeviceWhereInput sizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_GTE);
        return this;
    }

    public void setSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_GTE);
        }
    }

    public boolean getSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_GTE);
    }

    public StorageDeviceWhereInput sizeIn(List<Double> sizeIn) {

        this.sizeIn = sizeIn;
        return this;
    }

    public StorageDeviceWhereInput addSizeInItem(Double sizeInItem) {
        if (this.sizeIn == null) {
            this.sizeIn = new ArrayList<Double>();
        }
        this.sizeIn.add(sizeInItem);
        return this;
    }

    /**
     * Get sizeIn
     *
     * @return sizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getSizeIn() {
        return sizeIn;
    }

    public void setSizeIn(List<Double> sizeIn) {
        this.sizeIn = sizeIn;
    }

    public StorageDeviceWhereInput sizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_IN);
        return this;
    }

    public StorageDeviceWhereInput sizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_IN);
        return this;
    }

    public void setSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_IN);
        }
    }

    public boolean getSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_IN);
    }

    public StorageDeviceWhereInput sizeLt(Double sizeLt) {

        this.sizeLt = sizeLt;
        return this;
    }

    /**
     * Get sizeLt
     *
     * @return sizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getSizeLt() {
        return sizeLt;
    }

    public void setSizeLt(Double sizeLt) {
        this.sizeLt = sizeLt;
    }

    public StorageDeviceWhereInput sizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_LT);
        return this;
    }

    public StorageDeviceWhereInput sizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_LT);
        return this;
    }

    public void setSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_LT);
        }
    }

    public boolean getSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_LT);
    }

    public StorageDeviceWhereInput sizeLte(Double sizeLte) {

        this.sizeLte = sizeLte;
        return this;
    }

    /**
     * Get sizeLte
     *
     * @return sizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getSizeLte() {
        return sizeLte;
    }

    public void setSizeLte(Double sizeLte) {
        this.sizeLte = sizeLte;
    }

    public StorageDeviceWhereInput sizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_LTE);
        return this;
    }

    public StorageDeviceWhereInput sizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_LTE);
        return this;
    }

    public void setSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_LTE);
        }
    }

    public boolean getSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_LTE);
    }

    public StorageDeviceWhereInput sizeNot(Double sizeNot) {

        this.sizeNot = sizeNot;
        return this;
    }

    /**
     * Get sizeNot
     *
     * @return sizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getSizeNot() {
        return sizeNot;
    }

    public void setSizeNot(Double sizeNot) {
        this.sizeNot = sizeNot;
    }

    public StorageDeviceWhereInput sizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT);
        return this;
    }

    public StorageDeviceWhereInput sizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_NOT);
        return this;
    }

    public void setSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_NOT);
        }
    }

    public boolean getSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_NOT);
    }

    public StorageDeviceWhereInput sizeNotIn(List<Double> sizeNotIn) {

        this.sizeNotIn = sizeNotIn;
        return this;
    }

    public StorageDeviceWhereInput addSizeNotInItem(Double sizeNotInItem) {
        if (this.sizeNotIn == null) {
            this.sizeNotIn = new ArrayList<Double>();
        }
        this.sizeNotIn.add(sizeNotInItem);
        return this;
    }

    /**
     * Get sizeNotIn
     *
     * @return sizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getSizeNotIn() {
        return sizeNotIn;
    }

    public void setSizeNotIn(List<Double> sizeNotIn) {
        this.sizeNotIn = sizeNotIn;
    }

    public StorageDeviceWhereInput sizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT_IN);
        return this;
    }

    public StorageDeviceWhereInput sizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_NOT_IN);
        return this;
    }

    public void setSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_NOT_IN);
        }
    }

    public boolean getSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_NOT_IN);
    }

    public StorageDeviceWhereInput storageDevicePathsEvery(
            StorageDevicePathWhereInput storageDevicePathsEvery) {

        this.storageDevicePathsEvery = storageDevicePathsEvery;
        return this;
    }

    /**
     * Get storageDevicePathsEvery
     *
     * @return storageDevicePathsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageDevicePathWhereInput getStorageDevicePathsEvery() {
        return storageDevicePathsEvery;
    }

    public void setStorageDevicePathsEvery(StorageDevicePathWhereInput storageDevicePathsEvery) {
        this.storageDevicePathsEvery = storageDevicePathsEvery;
    }

    public StorageDeviceWhereInput storageDevicePathsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_EVERY);
        return this;
    }

    public StorageDeviceWhereInput storageDevicePathsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_EVERY);
        return this;
    }

    public void setStorageDevicePathsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_EVERY);
        }
    }

    public boolean getStorageDevicePathsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_EVERY);
    }

    public StorageDeviceWhereInput storageDevicePathsNone(
            StorageDevicePathWhereInput storageDevicePathsNone) {

        this.storageDevicePathsNone = storageDevicePathsNone;
        return this;
    }

    /**
     * Get storageDevicePathsNone
     *
     * @return storageDevicePathsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageDevicePathWhereInput getStorageDevicePathsNone() {
        return storageDevicePathsNone;
    }

    public void setStorageDevicePathsNone(StorageDevicePathWhereInput storageDevicePathsNone) {
        this.storageDevicePathsNone = storageDevicePathsNone;
    }

    public StorageDeviceWhereInput storageDevicePathsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_NONE);
        return this;
    }

    public StorageDeviceWhereInput storageDevicePathsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_NONE);
        return this;
    }

    public void setStorageDevicePathsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_NONE);
        }
    }

    public boolean getStorageDevicePathsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_NONE);
    }

    public StorageDeviceWhereInput storageDevicePathsSome(
            StorageDevicePathWhereInput storageDevicePathsSome) {

        this.storageDevicePathsSome = storageDevicePathsSome;
        return this;
    }

    /**
     * Get storageDevicePathsSome
     *
     * @return storageDevicePathsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageDevicePathWhereInput getStorageDevicePathsSome() {
        return storageDevicePathsSome;
    }

    public void setStorageDevicePathsSome(StorageDevicePathWhereInput storageDevicePathsSome) {
        this.storageDevicePathsSome = storageDevicePathsSome;
    }

    public StorageDeviceWhereInput storageDevicePathsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_SOME);
        return this;
    }

    public StorageDeviceWhereInput storageDevicePathsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_SOME);
        return this;
    }

    public void setStorageDevicePathsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_SOME);
        }
    }

    public boolean getStorageDevicePathsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_SOME);
    }

    public StorageDeviceWhereInput targetNum(Integer targetNum) {

        this.targetNum = targetNum;
        return this;
    }

    /**
     * Get targetNum
     *
     * @return targetNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTargetNum() {
        return targetNum;
    }

    public void setTargetNum(Integer targetNum) {
        this.targetNum = targetNum;
    }

    public StorageDeviceWhereInput targetNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM);
        return this;
    }

    public StorageDeviceWhereInput targetNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM);
        return this;
    }

    public void setTargetNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM);
        }
    }

    public boolean getTargetNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NUM);
    }

    public StorageDeviceWhereInput targetNumGt(Integer targetNumGt) {

        this.targetNumGt = targetNumGt;
        return this;
    }

    /**
     * Get targetNumGt
     *
     * @return targetNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTargetNumGt() {
        return targetNumGt;
    }

    public void setTargetNumGt(Integer targetNumGt) {
        this.targetNumGt = targetNumGt;
    }

    public StorageDeviceWhereInput targetNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_GT);
        return this;
    }

    public StorageDeviceWhereInput targetNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_GT);
        return this;
    }

    public void setTargetNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_GT);
        }
    }

    public boolean getTargetNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NUM_GT);
    }

    public StorageDeviceWhereInput targetNumGte(Integer targetNumGte) {

        this.targetNumGte = targetNumGte;
        return this;
    }

    /**
     * Get targetNumGte
     *
     * @return targetNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTargetNumGte() {
        return targetNumGte;
    }

    public void setTargetNumGte(Integer targetNumGte) {
        this.targetNumGte = targetNumGte;
    }

    public StorageDeviceWhereInput targetNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_GTE);
        return this;
    }

    public StorageDeviceWhereInput targetNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_GTE);
        return this;
    }

    public void setTargetNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_GTE);
        }
    }

    public boolean getTargetNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NUM_GTE);
    }

    public StorageDeviceWhereInput targetNumIn(List<Integer> targetNumIn) {

        this.targetNumIn = targetNumIn;
        return this;
    }

    public StorageDeviceWhereInput addTargetNumInItem(Integer targetNumInItem) {
        if (this.targetNumIn == null) {
            this.targetNumIn = new ArrayList<Integer>();
        }
        this.targetNumIn.add(targetNumInItem);
        return this;
    }

    /**
     * Get targetNumIn
     *
     * @return targetNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTargetNumIn() {
        return targetNumIn;
    }

    public void setTargetNumIn(List<Integer> targetNumIn) {
        this.targetNumIn = targetNumIn;
    }

    public StorageDeviceWhereInput targetNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_IN);
        return this;
    }

    public StorageDeviceWhereInput targetNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_IN);
        return this;
    }

    public void setTargetNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_IN);
        }
    }

    public boolean getTargetNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NUM_IN);
    }

    public StorageDeviceWhereInput targetNumLt(Integer targetNumLt) {

        this.targetNumLt = targetNumLt;
        return this;
    }

    /**
     * Get targetNumLt
     *
     * @return targetNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTargetNumLt() {
        return targetNumLt;
    }

    public void setTargetNumLt(Integer targetNumLt) {
        this.targetNumLt = targetNumLt;
    }

    public StorageDeviceWhereInput targetNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_LT);
        return this;
    }

    public StorageDeviceWhereInput targetNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_LT);
        return this;
    }

    public void setTargetNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_LT);
        }
    }

    public boolean getTargetNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NUM_LT);
    }

    public StorageDeviceWhereInput targetNumLte(Integer targetNumLte) {

        this.targetNumLte = targetNumLte;
        return this;
    }

    /**
     * Get targetNumLte
     *
     * @return targetNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTargetNumLte() {
        return targetNumLte;
    }

    public void setTargetNumLte(Integer targetNumLte) {
        this.targetNumLte = targetNumLte;
    }

    public StorageDeviceWhereInput targetNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_LTE);
        return this;
    }

    public StorageDeviceWhereInput targetNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_LTE);
        return this;
    }

    public void setTargetNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_LTE);
        }
    }

    public boolean getTargetNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NUM_LTE);
    }

    public StorageDeviceWhereInput targetNumNot(Integer targetNumNot) {

        this.targetNumNot = targetNumNot;
        return this;
    }

    /**
     * Get targetNumNot
     *
     * @return targetNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTargetNumNot() {
        return targetNumNot;
    }

    public void setTargetNumNot(Integer targetNumNot) {
        this.targetNumNot = targetNumNot;
    }

    public StorageDeviceWhereInput targetNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_NOT);
        return this;
    }

    public StorageDeviceWhereInput targetNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_NOT);
        return this;
    }

    public void setTargetNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_NOT);
        }
    }

    public boolean getTargetNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NUM_NOT);
    }

    public StorageDeviceWhereInput targetNumNotIn(List<Integer> targetNumNotIn) {

        this.targetNumNotIn = targetNumNotIn;
        return this;
    }

    public StorageDeviceWhereInput addTargetNumNotInItem(Integer targetNumNotInItem) {
        if (this.targetNumNotIn == null) {
            this.targetNumNotIn = new ArrayList<Integer>();
        }
        this.targetNumNotIn.add(targetNumNotInItem);
        return this;
    }

    /**
     * Get targetNumNotIn
     *
     * @return targetNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTargetNumNotIn() {
        return targetNumNotIn;
    }

    public void setTargetNumNotIn(List<Integer> targetNumNotIn) {
        this.targetNumNotIn = targetNumNotIn;
    }

    public StorageDeviceWhereInput targetNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_NOT_IN);
        return this;
    }

    public StorageDeviceWhereInput targetNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_NOT_IN);
        return this;
    }

    public void setTargetNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_NOT_IN);
        }
    }

    public boolean getTargetNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NUM_NOT_IN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StorageDeviceWhereInput storageDeviceWhereInput = (StorageDeviceWhereInput) o;
        return Objects.equals(this.AND, storageDeviceWhereInput.AND)
                && Objects.equals(this.NOT, storageDeviceWhereInput.NOT)
                && Objects.equals(this.OR, storageDeviceWhereInput.OR)
                && Objects.equals(this.dataVersion, storageDeviceWhereInput.dataVersion)
                && Objects.equals(this.dataVersionGt, storageDeviceWhereInput.dataVersionGt)
                && Objects.equals(this.dataVersionGte, storageDeviceWhereInput.dataVersionGte)
                && Objects.equals(this.dataVersionIn, storageDeviceWhereInput.dataVersionIn)
                && Objects.equals(this.dataVersionLt, storageDeviceWhereInput.dataVersionLt)
                && Objects.equals(this.dataVersionLte, storageDeviceWhereInput.dataVersionLte)
                && Objects.equals(this.dataVersionNot, storageDeviceWhereInput.dataVersionNot)
                && Objects.equals(this.dataVersionNotIn, storageDeviceWhereInput.dataVersionNotIn)
                && Objects.equals(this.datastoreInfo, storageDeviceWhereInput.datastoreInfo)
                && Objects.equals(
                        this.datastoreInfoContains, storageDeviceWhereInput.datastoreInfoContains)
                && Objects.equals(
                        this.datastoreInfoEndsWith, storageDeviceWhereInput.datastoreInfoEndsWith)
                && Objects.equals(this.datastoreInfoGt, storageDeviceWhereInput.datastoreInfoGt)
                && Objects.equals(this.datastoreInfoGte, storageDeviceWhereInput.datastoreInfoGte)
                && Objects.equals(this.datastoreInfoIn, storageDeviceWhereInput.datastoreInfoIn)
                && Objects.equals(this.datastoreInfoLt, storageDeviceWhereInput.datastoreInfoLt)
                && Objects.equals(this.datastoreInfoLte, storageDeviceWhereInput.datastoreInfoLte)
                && Objects.equals(this.datastoreInfoNot, storageDeviceWhereInput.datastoreInfoNot)
                && Objects.equals(
                        this.datastoreInfoNotContains,
                        storageDeviceWhereInput.datastoreInfoNotContains)
                && Objects.equals(
                        this.datastoreInfoNotEndsWith,
                        storageDeviceWhereInput.datastoreInfoNotEndsWith)
                && Objects.equals(
                        this.datastoreInfoNotIn, storageDeviceWhereInput.datastoreInfoNotIn)
                && Objects.equals(
                        this.datastoreInfoNotStartsWith,
                        storageDeviceWhereInput.datastoreInfoNotStartsWith)
                && Objects.equals(
                        this.datastoreInfoStartsWith,
                        storageDeviceWhereInput.datastoreInfoStartsWith)
                && Objects.equals(this.datastoresEvery, storageDeviceWhereInput.datastoresEvery)
                && Objects.equals(this.datastoresNone, storageDeviceWhereInput.datastoresNone)
                && Objects.equals(this.datastoresSome, storageDeviceWhereInput.datastoresSome)
                && Objects.equals(this.entityAsyncStatus, storageDeviceWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, storageDeviceWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, storageDeviceWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, storageDeviceWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(
                        this.hardwareAcceleration, storageDeviceWhereInput.hardwareAcceleration)
                && Objects.equals(
                        this.hardwareAccelerationNot,
                        storageDeviceWhereInput.hardwareAccelerationNot)
                && Objects.equals(
                        this.hostConnectionsEvery, storageDeviceWhereInput.hostConnectionsEvery)
                && Objects.equals(
                        this.hostConnectionsNone, storageDeviceWhereInput.hostConnectionsNone)
                && Objects.equals(
                        this.hostConnectionsSome, storageDeviceWhereInput.hostConnectionsSome)
                && Objects.equals(this.hostsEvery, storageDeviceWhereInput.hostsEvery)
                && Objects.equals(this.hostsNone, storageDeviceWhereInput.hostsNone)
                && Objects.equals(this.hostsSome, storageDeviceWhereInput.hostsSome)
                && Objects.equals(this.id, storageDeviceWhereInput.id)
                && Objects.equals(this.idContains, storageDeviceWhereInput.idContains)
                && Objects.equals(this.idEndsWith, storageDeviceWhereInput.idEndsWith)
                && Objects.equals(this.idGt, storageDeviceWhereInput.idGt)
                && Objects.equals(this.idGte, storageDeviceWhereInput.idGte)
                && Objects.equals(this.idIn, storageDeviceWhereInput.idIn)
                && Objects.equals(this.idLt, storageDeviceWhereInput.idLt)
                && Objects.equals(this.idLte, storageDeviceWhereInput.idLte)
                && Objects.equals(this.idNot, storageDeviceWhereInput.idNot)
                && Objects.equals(this.idNotContains, storageDeviceWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, storageDeviceWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, storageDeviceWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, storageDeviceWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, storageDeviceWhereInput.idStartsWith)
                && Objects.equals(this.localHash, storageDeviceWhereInput.localHash)
                && Objects.equals(this.localHashContains, storageDeviceWhereInput.localHashContains)
                && Objects.equals(this.localHashEndsWith, storageDeviceWhereInput.localHashEndsWith)
                && Objects.equals(this.localHashGt, storageDeviceWhereInput.localHashGt)
                && Objects.equals(this.localHashGte, storageDeviceWhereInput.localHashGte)
                && Objects.equals(this.localHashIn, storageDeviceWhereInput.localHashIn)
                && Objects.equals(this.localHashLt, storageDeviceWhereInput.localHashLt)
                && Objects.equals(this.localHashLte, storageDeviceWhereInput.localHashLte)
                && Objects.equals(this.localHashNot, storageDeviceWhereInput.localHashNot)
                && Objects.equals(
                        this.localHashNotContains, storageDeviceWhereInput.localHashNotContains)
                && Objects.equals(
                        this.localHashNotEndsWith, storageDeviceWhereInput.localHashNotEndsWith)
                && Objects.equals(this.localHashNotIn, storageDeviceWhereInput.localHashNotIn)
                && Objects.equals(
                        this.localHashNotStartsWith, storageDeviceWhereInput.localHashNotStartsWith)
                && Objects.equals(
                        this.localHashStartsWith, storageDeviceWhereInput.localHashStartsWith)
                && Objects.equals(this.localId, storageDeviceWhereInput.localId)
                && Objects.equals(this.localIdContains, storageDeviceWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, storageDeviceWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, storageDeviceWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, storageDeviceWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, storageDeviceWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, storageDeviceWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, storageDeviceWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, storageDeviceWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, storageDeviceWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, storageDeviceWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, storageDeviceWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, storageDeviceWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, storageDeviceWhereInput.localIdStartsWith)
                && Objects.equals(this.lunId, storageDeviceWhereInput.lunId)
                && Objects.equals(this.lunIdContains, storageDeviceWhereInput.lunIdContains)
                && Objects.equals(this.lunIdEndsWith, storageDeviceWhereInput.lunIdEndsWith)
                && Objects.equals(this.lunIdGt, storageDeviceWhereInput.lunIdGt)
                && Objects.equals(this.lunIdGte, storageDeviceWhereInput.lunIdGte)
                && Objects.equals(this.lunIdIn, storageDeviceWhereInput.lunIdIn)
                && Objects.equals(this.lunIdLt, storageDeviceWhereInput.lunIdLt)
                && Objects.equals(this.lunIdLte, storageDeviceWhereInput.lunIdLte)
                && Objects.equals(this.lunIdNot, storageDeviceWhereInput.lunIdNot)
                && Objects.equals(this.lunIdNotContains, storageDeviceWhereInput.lunIdNotContains)
                && Objects.equals(this.lunIdNotEndsWith, storageDeviceWhereInput.lunIdNotEndsWith)
                && Objects.equals(this.lunIdNotIn, storageDeviceWhereInput.lunIdNotIn)
                && Objects.equals(
                        this.lunIdNotStartsWith, storageDeviceWhereInput.lunIdNotStartsWith)
                && Objects.equals(this.lunIdStartsWith, storageDeviceWhereInput.lunIdStartsWith)
                && Objects.equals(this.name, storageDeviceWhereInput.name)
                && Objects.equals(this.nameContains, storageDeviceWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, storageDeviceWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, storageDeviceWhereInput.nameGt)
                && Objects.equals(this.nameGte, storageDeviceWhereInput.nameGte)
                && Objects.equals(this.nameIn, storageDeviceWhereInput.nameIn)
                && Objects.equals(this.nameLt, storageDeviceWhereInput.nameLt)
                && Objects.equals(this.nameLte, storageDeviceWhereInput.nameLte)
                && Objects.equals(this.nameNot, storageDeviceWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, storageDeviceWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, storageDeviceWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, storageDeviceWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, storageDeviceWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, storageDeviceWhereInput.nameStartsWith)
                && Objects.equals(this.path, storageDeviceWhereInput.path)
                && Objects.equals(this.pathContains, storageDeviceWhereInput.pathContains)
                && Objects.equals(this.pathEndsWith, storageDeviceWhereInput.pathEndsWith)
                && Objects.equals(this.pathGt, storageDeviceWhereInput.pathGt)
                && Objects.equals(this.pathGte, storageDeviceWhereInput.pathGte)
                && Objects.equals(this.pathIn, storageDeviceWhereInput.pathIn)
                && Objects.equals(this.pathLt, storageDeviceWhereInput.pathLt)
                && Objects.equals(this.pathLte, storageDeviceWhereInput.pathLte)
                && Objects.equals(this.pathNot, storageDeviceWhereInput.pathNot)
                && Objects.equals(this.pathNotContains, storageDeviceWhereInput.pathNotContains)
                && Objects.equals(this.pathNotEndsWith, storageDeviceWhereInput.pathNotEndsWith)
                && Objects.equals(this.pathNotIn, storageDeviceWhereInput.pathNotIn)
                && Objects.equals(this.pathNotStartsWith, storageDeviceWhereInput.pathNotStartsWith)
                && Objects.equals(this.pathStartsWith, storageDeviceWhereInput.pathStartsWith)
                && Objects.equals(this.sectorFormat, storageDeviceWhereInput.sectorFormat)
                && Objects.equals(
                        this.sectorFormatContains, storageDeviceWhereInput.sectorFormatContains)
                && Objects.equals(
                        this.sectorFormatEndsWith, storageDeviceWhereInput.sectorFormatEndsWith)
                && Objects.equals(this.sectorFormatGt, storageDeviceWhereInput.sectorFormatGt)
                && Objects.equals(this.sectorFormatGte, storageDeviceWhereInput.sectorFormatGte)
                && Objects.equals(this.sectorFormatIn, storageDeviceWhereInput.sectorFormatIn)
                && Objects.equals(this.sectorFormatLt, storageDeviceWhereInput.sectorFormatLt)
                && Objects.equals(this.sectorFormatLte, storageDeviceWhereInput.sectorFormatLte)
                && Objects.equals(this.sectorFormatNot, storageDeviceWhereInput.sectorFormatNot)
                && Objects.equals(
                        this.sectorFormatNotContains,
                        storageDeviceWhereInput.sectorFormatNotContains)
                && Objects.equals(
                        this.sectorFormatNotEndsWith,
                        storageDeviceWhereInput.sectorFormatNotEndsWith)
                && Objects.equals(this.sectorFormatNotIn, storageDeviceWhereInput.sectorFormatNotIn)
                && Objects.equals(
                        this.sectorFormatNotStartsWith,
                        storageDeviceWhereInput.sectorFormatNotStartsWith)
                && Objects.equals(
                        this.sectorFormatStartsWith, storageDeviceWhereInput.sectorFormatStartsWith)
                && Objects.equals(this.size, storageDeviceWhereInput.size)
                && Objects.equals(this.sizeGt, storageDeviceWhereInput.sizeGt)
                && Objects.equals(this.sizeGte, storageDeviceWhereInput.sizeGte)
                && Objects.equals(this.sizeIn, storageDeviceWhereInput.sizeIn)
                && Objects.equals(this.sizeLt, storageDeviceWhereInput.sizeLt)
                && Objects.equals(this.sizeLte, storageDeviceWhereInput.sizeLte)
                && Objects.equals(this.sizeNot, storageDeviceWhereInput.sizeNot)
                && Objects.equals(this.sizeNotIn, storageDeviceWhereInput.sizeNotIn)
                && Objects.equals(
                        this.storageDevicePathsEvery,
                        storageDeviceWhereInput.storageDevicePathsEvery)
                && Objects.equals(
                        this.storageDevicePathsNone, storageDeviceWhereInput.storageDevicePathsNone)
                && Objects.equals(
                        this.storageDevicePathsSome, storageDeviceWhereInput.storageDevicePathsSome)
                && Objects.equals(this.targetNum, storageDeviceWhereInput.targetNum)
                && Objects.equals(this.targetNumGt, storageDeviceWhereInput.targetNumGt)
                && Objects.equals(this.targetNumGte, storageDeviceWhereInput.targetNumGte)
                && Objects.equals(this.targetNumIn, storageDeviceWhereInput.targetNumIn)
                && Objects.equals(this.targetNumLt, storageDeviceWhereInput.targetNumLt)
                && Objects.equals(this.targetNumLte, storageDeviceWhereInput.targetNumLte)
                && Objects.equals(this.targetNumNot, storageDeviceWhereInput.targetNumNot)
                && Objects.equals(this.targetNumNotIn, storageDeviceWhereInput.targetNumNotIn);
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
                dataVersion,
                dataVersionGt,
                dataVersionGte,
                dataVersionIn,
                dataVersionLt,
                dataVersionLte,
                dataVersionNot,
                dataVersionNotIn,
                datastoreInfo,
                datastoreInfoContains,
                datastoreInfoEndsWith,
                datastoreInfoGt,
                datastoreInfoGte,
                datastoreInfoIn,
                datastoreInfoLt,
                datastoreInfoLte,
                datastoreInfoNot,
                datastoreInfoNotContains,
                datastoreInfoNotEndsWith,
                datastoreInfoNotIn,
                datastoreInfoNotStartsWith,
                datastoreInfoStartsWith,
                datastoresEvery,
                datastoresNone,
                datastoresSome,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                hardwareAcceleration,
                hardwareAccelerationNot,
                hostConnectionsEvery,
                hostConnectionsNone,
                hostConnectionsSome,
                hostsEvery,
                hostsNone,
                hostsSome,
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
                lunId,
                lunIdContains,
                lunIdEndsWith,
                lunIdGt,
                lunIdGte,
                lunIdIn,
                lunIdLt,
                lunIdLte,
                lunIdNot,
                lunIdNotContains,
                lunIdNotEndsWith,
                lunIdNotIn,
                lunIdNotStartsWith,
                lunIdStartsWith,
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
                sectorFormat,
                sectorFormatContains,
                sectorFormatEndsWith,
                sectorFormatGt,
                sectorFormatGte,
                sectorFormatIn,
                sectorFormatLt,
                sectorFormatLte,
                sectorFormatNot,
                sectorFormatNotContains,
                sectorFormatNotEndsWith,
                sectorFormatNotIn,
                sectorFormatNotStartsWith,
                sectorFormatStartsWith,
                size,
                sizeGt,
                sizeGte,
                sizeIn,
                sizeLt,
                sizeLte,
                sizeNot,
                sizeNotIn,
                storageDevicePathsEvery,
                storageDevicePathsNone,
                storageDevicePathsSome,
                targetNum,
                targetNumGt,
                targetNumGte,
                targetNumIn,
                targetNumLt,
                targetNumLte,
                targetNumNot,
                targetNumNotIn);
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
        sb.append("class StorageDeviceWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    dataVersion: ").append(toIndentedString(dataVersion)).append("\n");
        sb.append("    dataVersionGt: ").append(toIndentedString(dataVersionGt)).append("\n");
        sb.append("    dataVersionGte: ").append(toIndentedString(dataVersionGte)).append("\n");
        sb.append("    dataVersionIn: ").append(toIndentedString(dataVersionIn)).append("\n");
        sb.append("    dataVersionLt: ").append(toIndentedString(dataVersionLt)).append("\n");
        sb.append("    dataVersionLte: ").append(toIndentedString(dataVersionLte)).append("\n");
        sb.append("    dataVersionNot: ").append(toIndentedString(dataVersionNot)).append("\n");
        sb.append("    dataVersionNotIn: ").append(toIndentedString(dataVersionNotIn)).append("\n");
        sb.append("    datastoreInfo: ").append(toIndentedString(datastoreInfo)).append("\n");
        sb.append("    datastoreInfoContains: ")
                .append(toIndentedString(datastoreInfoContains))
                .append("\n");
        sb.append("    datastoreInfoEndsWith: ")
                .append(toIndentedString(datastoreInfoEndsWith))
                .append("\n");
        sb.append("    datastoreInfoGt: ").append(toIndentedString(datastoreInfoGt)).append("\n");
        sb.append("    datastoreInfoGte: ").append(toIndentedString(datastoreInfoGte)).append("\n");
        sb.append("    datastoreInfoIn: ").append(toIndentedString(datastoreInfoIn)).append("\n");
        sb.append("    datastoreInfoLt: ").append(toIndentedString(datastoreInfoLt)).append("\n");
        sb.append("    datastoreInfoLte: ").append(toIndentedString(datastoreInfoLte)).append("\n");
        sb.append("    datastoreInfoNot: ").append(toIndentedString(datastoreInfoNot)).append("\n");
        sb.append("    datastoreInfoNotContains: ")
                .append(toIndentedString(datastoreInfoNotContains))
                .append("\n");
        sb.append("    datastoreInfoNotEndsWith: ")
                .append(toIndentedString(datastoreInfoNotEndsWith))
                .append("\n");
        sb.append("    datastoreInfoNotIn: ")
                .append(toIndentedString(datastoreInfoNotIn))
                .append("\n");
        sb.append("    datastoreInfoNotStartsWith: ")
                .append(toIndentedString(datastoreInfoNotStartsWith))
                .append("\n");
        sb.append("    datastoreInfoStartsWith: ")
                .append(toIndentedString(datastoreInfoStartsWith))
                .append("\n");
        sb.append("    datastoresEvery: ").append(toIndentedString(datastoresEvery)).append("\n");
        sb.append("    datastoresNone: ").append(toIndentedString(datastoresNone)).append("\n");
        sb.append("    datastoresSome: ").append(toIndentedString(datastoresSome)).append("\n");
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
        sb.append("    hardwareAcceleration: ")
                .append(toIndentedString(hardwareAcceleration))
                .append("\n");
        sb.append("    hardwareAccelerationNot: ")
                .append(toIndentedString(hardwareAccelerationNot))
                .append("\n");
        sb.append("    hostConnectionsEvery: ")
                .append(toIndentedString(hostConnectionsEvery))
                .append("\n");
        sb.append("    hostConnectionsNone: ")
                .append(toIndentedString(hostConnectionsNone))
                .append("\n");
        sb.append("    hostConnectionsSome: ")
                .append(toIndentedString(hostConnectionsSome))
                .append("\n");
        sb.append("    hostsEvery: ").append(toIndentedString(hostsEvery)).append("\n");
        sb.append("    hostsNone: ").append(toIndentedString(hostsNone)).append("\n");
        sb.append("    hostsSome: ").append(toIndentedString(hostsSome)).append("\n");
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
        sb.append("    lunId: ").append(toIndentedString(lunId)).append("\n");
        sb.append("    lunIdContains: ").append(toIndentedString(lunIdContains)).append("\n");
        sb.append("    lunIdEndsWith: ").append(toIndentedString(lunIdEndsWith)).append("\n");
        sb.append("    lunIdGt: ").append(toIndentedString(lunIdGt)).append("\n");
        sb.append("    lunIdGte: ").append(toIndentedString(lunIdGte)).append("\n");
        sb.append("    lunIdIn: ").append(toIndentedString(lunIdIn)).append("\n");
        sb.append("    lunIdLt: ").append(toIndentedString(lunIdLt)).append("\n");
        sb.append("    lunIdLte: ").append(toIndentedString(lunIdLte)).append("\n");
        sb.append("    lunIdNot: ").append(toIndentedString(lunIdNot)).append("\n");
        sb.append("    lunIdNotContains: ").append(toIndentedString(lunIdNotContains)).append("\n");
        sb.append("    lunIdNotEndsWith: ").append(toIndentedString(lunIdNotEndsWith)).append("\n");
        sb.append("    lunIdNotIn: ").append(toIndentedString(lunIdNotIn)).append("\n");
        sb.append("    lunIdNotStartsWith: ")
                .append(toIndentedString(lunIdNotStartsWith))
                .append("\n");
        sb.append("    lunIdStartsWith: ").append(toIndentedString(lunIdStartsWith)).append("\n");
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
        sb.append("    sectorFormat: ").append(toIndentedString(sectorFormat)).append("\n");
        sb.append("    sectorFormatContains: ")
                .append(toIndentedString(sectorFormatContains))
                .append("\n");
        sb.append("    sectorFormatEndsWith: ")
                .append(toIndentedString(sectorFormatEndsWith))
                .append("\n");
        sb.append("    sectorFormatGt: ").append(toIndentedString(sectorFormatGt)).append("\n");
        sb.append("    sectorFormatGte: ").append(toIndentedString(sectorFormatGte)).append("\n");
        sb.append("    sectorFormatIn: ").append(toIndentedString(sectorFormatIn)).append("\n");
        sb.append("    sectorFormatLt: ").append(toIndentedString(sectorFormatLt)).append("\n");
        sb.append("    sectorFormatLte: ").append(toIndentedString(sectorFormatLte)).append("\n");
        sb.append("    sectorFormatNot: ").append(toIndentedString(sectorFormatNot)).append("\n");
        sb.append("    sectorFormatNotContains: ")
                .append(toIndentedString(sectorFormatNotContains))
                .append("\n");
        sb.append("    sectorFormatNotEndsWith: ")
                .append(toIndentedString(sectorFormatNotEndsWith))
                .append("\n");
        sb.append("    sectorFormatNotIn: ")
                .append(toIndentedString(sectorFormatNotIn))
                .append("\n");
        sb.append("    sectorFormatNotStartsWith: ")
                .append(toIndentedString(sectorFormatNotStartsWith))
                .append("\n");
        sb.append("    sectorFormatStartsWith: ")
                .append(toIndentedString(sectorFormatStartsWith))
                .append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    sizeGt: ").append(toIndentedString(sizeGt)).append("\n");
        sb.append("    sizeGte: ").append(toIndentedString(sizeGte)).append("\n");
        sb.append("    sizeIn: ").append(toIndentedString(sizeIn)).append("\n");
        sb.append("    sizeLt: ").append(toIndentedString(sizeLt)).append("\n");
        sb.append("    sizeLte: ").append(toIndentedString(sizeLte)).append("\n");
        sb.append("    sizeNot: ").append(toIndentedString(sizeNot)).append("\n");
        sb.append("    sizeNotIn: ").append(toIndentedString(sizeNotIn)).append("\n");
        sb.append("    storageDevicePathsEvery: ")
                .append(toIndentedString(storageDevicePathsEvery))
                .append("\n");
        sb.append("    storageDevicePathsNone: ")
                .append(toIndentedString(storageDevicePathsNone))
                .append("\n");
        sb.append("    storageDevicePathsSome: ")
                .append(toIndentedString(storageDevicePathsSome))
                .append("\n");
        sb.append("    targetNum: ").append(toIndentedString(targetNum)).append("\n");
        sb.append("    targetNumGt: ").append(toIndentedString(targetNumGt)).append("\n");
        sb.append("    targetNumGte: ").append(toIndentedString(targetNumGte)).append("\n");
        sb.append("    targetNumIn: ").append(toIndentedString(targetNumIn)).append("\n");
        sb.append("    targetNumLt: ").append(toIndentedString(targetNumLt)).append("\n");
        sb.append("    targetNumLte: ").append(toIndentedString(targetNumLte)).append("\n");
        sb.append("    targetNumNot: ").append(toIndentedString(targetNumNot)).append("\n");
        sb.append("    targetNumNotIn: ").append(toIndentedString(targetNumNotIn)).append("\n");
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
